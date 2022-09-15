using System;
using System.IdentityModel.Tokens;
using System.Security.Cryptography.X509Certificates;
using System.ServiceModel;
using System.ServiceModel.Channels;
using System.ServiceModel.Security;
using System.Xml;

namespace AGESIC.PGE.Security
{
    internal class RequestSecurityToken : RequestSecurityTokenBase
    {

        public string IssuerAddress { get; set; }

        public string Username { get; set; }

        public string Password { get; set; }

        public string Role { get; set; }

        public string User { get; set; }

        public string SAMLIssuer { get; set; }

        public string SAMLCertificateSubjectName { get; set; }

        public StoreName SAMLCertificateStoreName { get; set; }

        public StoreLocation SAMLCertificateStoreLocation { get; set; }

        public RequestSecurityToken(string issuerAddress) :
            this(String.Empty, String.Empty, 0, null, issuerAddress)
        {
        }

        public RequestSecurityToken(string issuerAddress, string appliesTo) :
            this(issuerAddress, new EndpointAddress(appliesTo))
        {
        }

        public RequestSecurityToken(string issuerAddress, EndpointAddress appliesTo) :
            this(String.Empty, String.Empty, 0, appliesTo, issuerAddress)
        {
        }

        public RequestSecurityToken(string context,
                                    string tokenType,
                                    int keySize,
                                    EndpointAddress appliesTo,
                                    string issuerAddress) :
            base(context, tokenType, keySize, appliesTo)
        {
            this.IssuerAddress = issuerAddress;
        }

        private SamlSecurityToken CrearSamlAssertion(string email)
        {
            X509Certificate2 cert = FederationUtilities.LookupCertificate(
                SAMLCertificateStoreName, 
                SAMLCertificateStoreLocation,
                SAMLCertificateSubjectName);

            X509AsymmetricSecurityKey signingKey = new X509AsymmetricSecurityKey(cert);

            double minutosMas = Convert.ToDouble(Configuration.SecurityToken.SAMLMaxFrame);
            double minutosMenos = Convert.ToDouble(Configuration.SecurityToken.SAMLMinFrame);

            SamlAssertion assertion = new SamlAssertion();
            assertion.AssertionId = "uuid_" + Guid.NewGuid().ToString();
            assertion.Issuer = SAMLIssuer;
            assertion.Conditions = new SamlConditions(
                assertion.IssueInstant.AddMinutes(-minutosMenos),
                assertion.IssueInstant.AddMinutes(minutosMas));

            SamlAuthenticationStatement authStmt = new SamlAuthenticationStatement();
            authStmt.AuthenticationMethod = Constants.SAML.AuthenticationMethods.Password;
            authStmt.AuthenticationInstant = assertion.IssueInstant;
            
            authStmt.SamlSubject = new SamlSubject();
            authStmt.SamlSubject.NameFormat = Constants.SAML.SubjectFormats.EMail;
            authStmt.SamlSubject.Name = email;
            authStmt.SamlSubject.ConfirmationMethods.Add(Constants.SAML.ConfirmationMethods.Bearer);
            
            SamlAttributeStatement attributes = new SamlAttributeStatement();
            attributes.SamlSubject = authStmt.SamlSubject;
            SamlAttribute attribute = new SamlAttribute();
            attribute.Name = "User";
            attribute.Namespace = IssuerAddress;
            attribute.AttributeValues.Add(User);
            attributes.Attributes.Add(attribute);
            
            assertion.Statements.Add(authStmt);
            assertion.Statements.Add(attributes);

            X509SecurityToken certTkn = new X509SecurityToken(cert);
            SigningCredentials credentials = new SigningCredentials(
                signingKey, 
                SecurityAlgorithms.RsaSha1Signature,
                SecurityAlgorithms.Sha1Digest, 
                new SecurityKeyIdentifier(certTkn.CreateKeyIdentifierClause<X509RawDataKeyIdentifierClause>())
                );
            assertion.SigningCredentials = credentials;

            SamlSecurityToken samlToken = new SamlSecurityToken(assertion);

            return samlToken;
        }

        protected override void OnWriteBodyContents(XmlDictionaryWriter writer)
        {
            writer.WriteStartElement(Constants.Trust.Elements.RequestSecurityToken, Constants.Trust.NamespaceUri);

            if (this.TokenType != null && this.TokenType.Length > 0)
            {
                writer.WriteStartElement(Constants.Trust.Elements.TokenType, Constants.Trust.NamespaceUri);
                writer.WriteString(this.TokenType);
                writer.WriteEndElement();
            }

            if (this.AppliesTo != null)
            {
                writer.WriteStartElement(Constants.Policy.Elements.AppliesTo, Constants.Policy.NamespaceUri);
                this.AppliesTo.WriteTo(AddressingVersion.WSAddressing10, writer);
                writer.WriteEndElement();
            }

            writer.WriteStartElement(Constants.Trust.Elements.RequestType, Constants.Trust.NamespaceUri);
            writer.WriteString(Constants.Trust.Actions.Issue);
            writer.WriteEndElement();

            writer.WriteStartElement(Constants.Trust.Elements.Issuer, Constants.Trust.NamespaceUri);
            writer.WriteStartElement(Constants.Addressing.Elements.Address, Constants.Addressing.NamespaceUri);
            writer.WriteString(IssuerAddress);
            writer.WriteEndElement();
            writer.WriteEndElement();

            writer.WriteStartElement(Constants.Trust.Elements.Base, Constants.Trust.NamespaceUri);

            if (Constants.UserNameTypeUri == TokenType)
            {
                WSSecurityTokenSerializer ser = new WSSecurityTokenSerializer(SecurityVersion.WSSecurity10);
                UserNameSecurityToken uNameToken = new UserNameSecurityToken(Username, Password);
                ser.WriteToken(writer, uNameToken);
            }

            if (Constants.SamlTokenTypeUri == TokenType)
            {
                SamlSecurityToken samlToken = CrearSamlAssertion(Role);
                WSSecurityTokenSerializer ser = new WSSecurityTokenSerializer();
                ser.WriteToken(writer, samlToken);
            }

            writer.WriteEndElement();

            writer.WriteStartElement(Constants.Trust.Elements.SecondaryParameters, Constants.Trust.NamespaceUri);

            writer.WriteStartElement("Rol", Constants.Trust.NamespaceUri);

            writer.WriteString(Role);

            writer.WriteEndElement();

            writer.WriteEndElement();

            if (this.KeySize > 0)
            {
                writer.WriteStartElement(Constants.Trust.Elements.KeySize, Constants.Trust.NamespaceUri);
                writer.WriteValue(this.KeySize);
                writer.WriteEndElement();
            }

            writer.WriteEndElement();
        }
    }
}