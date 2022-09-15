using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.IdentityModel.Selectors;
using System.IdentityModel.Tokens;
using System.Security.Cryptography.X509Certificates;
using System.ServiceModel;
using System.ServiceModel.Security;
using System.Xml;

namespace AGESIC.PGE.Security
{
    internal class RequestSecurityTokenResponse : RequestSecurityTokenBase
    {
        private SecurityToken requestedSecurityToken;
        private SecurityToken requestedProofToken;
        private SecurityToken issuerEntropy;
        private SecurityKeyIdentifierClause requestedAttachedReference;
        private SecurityKeyIdentifierClause requestedUnattachedReference;
        private bool computeKey;

        internal RequestSecurityTokenResponse()
            : this(String.Empty, String.Empty, 0, null, null, null, false)
        {
        }

        internal RequestSecurityTokenResponse(string context, 
                                            string tokenType, 
                                            int keySize, 
                                            EndpointAddress appliesTo, 
                                            SecurityToken requestedSecurityToken, 
                                            SecurityToken requestedProofToken, 
                                            bool computeKey ) :
            base(context, tokenType, keySize, appliesTo)
        {
            this.requestedSecurityToken = requestedSecurityToken;
            this.requestedProofToken = requestedProofToken;
            this.computeKey = computeKey;
        }

        protected override void OnWriteBodyContents(XmlDictionaryWriter writer)
        {
            throw new NotImplementedException();
        }

        internal SecurityToken RequestedSecurityToken
        {
            get { return requestedSecurityToken; }
            set { requestedSecurityToken = value; }
        }

        internal SecurityToken RequestedProofToken
        {
            get { return requestedProofToken; }
            set { requestedProofToken = value; }
        }

        internal SecurityKeyIdentifierClause RequestedAttachedReference
        {
            get { return requestedAttachedReference; }
            set { requestedAttachedReference = value; }
        }

        internal SecurityKeyIdentifierClause RequestedUnattachedReference
        {
            get { return requestedUnattachedReference; }
            set { requestedUnattachedReference = value; }
        }

        internal SecurityToken IssuerEntropy
        {
            get { return issuerEntropy; }
            set { issuerEntropy = value; }
        }

        internal bool ComputeKey
        {
            get { return computeKey; }
            set { computeKey = value; }
        }

        internal void ProcesarToken(XmlReader reader)
        {
            if (reader == null)
                throw new ArgumentNullException("xr");

            if (reader.IsEmptyElement)
                throw new ArgumentException("wst:RequestSecurityTokenResponse vacío");

            int initialDepth = reader.Depth;

            string context = reader.GetAttribute(Constants.Trust.Attributes.Context, String.Empty);

            string tokenType = String.Empty;
            int keySize = 0;
            SecurityToken token = null;

            while (reader.Read())
            {
                if (XmlNodeType.Element == reader.NodeType)
                {
                    if (Constants.Trust.NamespaceUri == reader.NamespaceURI)
                    {
                        if (Constants.Trust.Elements.TokenType == reader.LocalName && !reader.IsEmptyElement)
                        {
                            reader.Read();
                            tokenType = reader.ReadContentAsString();
                        }
                        else if (Constants.Trust.Elements.KeySize == reader.LocalName && !reader.IsEmptyElement)
                        {
                            reader.Read();
                            keySize = reader.ReadContentAsInt();
                        }
                        else if (Constants.Trust.Elements.RequestedSecurityToken == reader.LocalName && !reader.IsEmptyElement)
                        {
                            try
                            {
                                reader.Read();
                                String attr0 = reader.GetAttribute(0);
                                ReadOnlyCollection<SecurityToken> col = new ReadOnlyCollection<SecurityToken>(new List<SecurityToken>() { FederationUtilities.GetX509TokenFromCert(StoreName.My, StoreLocation.LocalMachine, "fimdemo.ibm.com") });
                                WSSecurityTokenSerializer des = WSSecurityTokenSerializer.DefaultInstance;
                                token = des.ReadToken(reader, SecurityTokenResolver.CreateDefaultSecurityTokenResolver(col, false));
                            }
                            catch (Exception)
                            {
                                ReadOnlyCollection<SecurityToken> col = new ReadOnlyCollection<SecurityToken>(new List<SecurityToken>());
                                WSSecurityTokenSerializer des = WSSecurityTokenSerializer.DefaultInstance;
                                token = des.ReadToken(reader, SecurityTokenResolver.CreateDefaultSecurityTokenResolver(col, false));
                            }
                        }
                    }
                }

                if (Constants.Trust.Elements.RequestSecurityTokenResponse == reader.LocalName &&
                    Constants.Trust.NamespaceUri == reader.NamespaceURI &&
                    reader.Depth == initialDepth &&
                    //XmlNodeType.EndElement == XmlNodeType.Document)
                    XmlNodeType.EndElement == reader.NodeType)
                    break;
            }

            Context = context;
            TokenType = tokenType;
            KeySize = keySize;
            RequestedSecurityToken = token;
        }

    }
}
