using System;
using System.ServiceModel;
using System.ServiceModel.Channels;
using AGESIC.PGE.Security;
using AGESIC.PGE.Security.STS;
using AGESIC.PGE.Addressing;
using System.Text;
using System.Security.Cryptography.X509Certificates;
using AGESIC.PGE.Error;
using System.ServiceModel.Description;

namespace AGESIC.PGE
{
    internal class PGEUtils
    {

        #region Security Token from STS

        /// <summary>
        /// Obtiene el cabezal SAML a agregarse en el cabezal SOAP del request a un servicio, ya con el token insertado.
        /// </summary>
        /// <param name="user">Nombre del usuario que quiere acceder al servicio.</param>
        /// <param name="role">Rol con el que el usuario desea identificarse.</param>
        /// <param name="url">URL del servicio. Esta URL es la publicada en el DataPower</param>
        /// <param name="urlLogica">URL logica del servicio</param>
        /// <param name="issuerAddress">Issuer Address.</param>
        /// <param name="useSSL">Indica si se utilizara SSL para efectuar el RST</param>
        /// <returns>Un objeto de tipo <code>SamlTokenHeaderEmbedder</code> que representa el SAML a embeber en el cabezal SOAP.</returns>
        internal static SamlTokenHeaderEmbedder SecurityTokenHeader(string user, string role, string url, string urlLogica, 
            string issuerAddress, bool useSSL, X509Certificate2 clientCert, X509Certificate2 serviceCert)
        {
            RequestSecurityToken rst = CreateRST(user, role, urlLogica, issuerAddress);
            CustomBinding binding = CreateBinding(useSSL);
            EndpointAddress endPoint = CreateEndPoint(useSSL);
            SecurityTokenService svc = ChannelFactory<SecurityTokenService>.CreateChannel(
                binding,
                endPoint,
                new Uri(Configuration.SecurityToken.URL.SecurityTokenServiceUrl(useSSL)));
            SecurityTokenServiceClient client = new SecurityTokenServiceClient(binding, endPoint);
            ClientViaBehavior clientVia = new ClientViaBehavior(new Uri(Configuration.SecurityToken.URL.SecurityTokenServiceUrl(useSSL)));
            client.Endpoint.Behaviors.Add(clientVia);
            if (useSSL)
            {
                client.ClientCredentials.ClientCertificate.Certificate = clientCert;
                client.ClientCredentials.ServiceCertificate.DefaultCertificate = serviceCert;
            }
            RequestSecurityTokenResponse rstr = GetRSTResponse(rst, client, useSSL);

            SamlTokenHeaderEmbedder samlToReturn = new SamlTokenHeaderEmbedder(rstr.RequestedSecurityToken);

            return samlToReturn;
        }

        /// <summary>
        /// Determina
        /// </summary>
        /// <param name="url">Determina a partir de la URL del servicio y de los seteos de los certificados, si se utilizará SSL.</param>
        /// <returns></returns>
        private static bool IsSSL(string url)
        {
            // si la url del servicio comienza con https, se utilizará ssl para consumir el sts
            if (url.Trim().StartsWith("https://"))
            {
                return true;
            }
            else
                return false;
        }

        /// <summary>
        /// Obtiene el endpoint del STS.
        /// </summary>
        /// <param name="useSSL">Determina si se debe crear un endpoint para SSL o no.</param>
        /// <returns>Un objeto EndpointAddress con la URL del STS.</returns>
        private static EndpointAddress CreateEndPoint(bool useSSL)
        {
            // creo los cabezales de addressing
            AddressHeader[] arrayAddressing = CreateAddressing(useSSL);
            EndpointAddress endpoint;
            try
            {
                if (!Configuration.Messaging.AutoAddressing)
                    endpoint = new EndpointAddress(new Uri(Configuration.SecurityToken.URL.SecurityTokenServiceUrl(useSSL)), arrayAddressing);
                else
                    endpoint = new EndpointAddress(new Uri(Configuration.SecurityToken.URL.SecurityTokenServiceUrl(useSSL)));
            }
            catch (Exception ex)
            {
                throw new PGEEndPointCannotBeCreatedException(ex);
            }
            return endpoint;
        }

        /// <summary>
        /// Crea los cabezales de addressing.
        /// </summary>
        /// <returns>Un array con los cabezales de addressing o null si AutoAddressing no está activado.</returns>
        private static AddressHeader[] CreateAddressing(bool useSSL)
        {
            AddressHeader[] arrayAddressing = null;
            //if (!useSSL) {
                if (!Configuration.Messaging.AutoAddressing)
                {
                    AddressHeader actionHeader = AddressHeader.CreateAddressHeader("Action", Constants.Addressing.NamespaceUri, Constants.Trust.Actions.Issue);
                    AddressHeader messageIdHeader = AddressHeader.CreateAddressHeader("MessageID", Constants.Addressing.NamespaceUri, MessageIDGenerator.Generate());
                    arrayAddressing = new AddressHeader[] { actionHeader, messageIdHeader };
                }
            //}
            return arrayAddressing;
        }

        /// <summary>
        /// Invoca el STS para obtener el token.
        /// </summary>
        /// <param name="tkn">Token correspondiente al RST,</param>
        /// <param name="svc">Servicio de STS.</param>
        /// <param name="useSSL">Booleano que indica si se utiliza SSL o no en el RST.</param>
        /// <returns>Un objeto <code>RequestSecurityTokenResponse</code> con la respuesta del STS.</returns>
        private static RequestSecurityTokenResponse GetRSTResponse(RequestSecurityToken tkn, SecurityTokenServiceClient svc, bool useSSL)
        {
            Message msg = Message.CreateMessage(Configuration.Messaging.VersionForSTS, Constants.Trust.Actions.Issue, tkn);
            RequestSecurityTokenResponse rstr = null;
            try
            {
                using (OperationContextScope scope = new OperationContextScope(svc.InnerChannel))
                {
                    Message resp = svc.RequestSecurityToken(msg);
                    rstr = new RequestSecurityTokenResponse();
                    rstr.ProcesarToken(resp.GetReaderAtBodyContents());
                }
            }
            catch (Exception ex)
            {
                throw ex;
            }
            return rstr;
        }

        /// <summary>
        /// Genera el CustomBinding para el RST
        /// </summary>
        /// <param name="useSSL">true si se utiliza ssl.</param>
        /// <returns>Un CustomBinding con el que se hará el RST.</returns>
        private static CustomBinding CreateBinding(bool useSSL)
        {
            CustomBinding binding = new CustomBinding();
            // Creamos el encoder para binding
            TextMessageEncodingBindingElement encoder = new TextMessageEncodingBindingElement();
            encoder.MessageVersion = Configuration.Messaging.VersionForSTS;
            // encoder.MessageVersion = (useSSL) ? (Configuration.Messaging.VersionForSTSwoAddressing) : (Configuration.Messaging.VersionForSTS);
            encoder.WriteEncoding = Encoding.UTF8;
            // creamos la capa de transporte
            BindingElement transport;
            if (useSSL)
            {
                // si usa ssl, hay que crear una capa de transporte https, que requiera certificado y con addressing manual
                transport = new HttpsTransportBindingElement();
                ((HttpsTransportBindingElement)transport).RequireClientCertificate = true;
                ((HttpsTransportBindingElement)transport).ManualAddressing = !Configuration.Messaging.AutoAddressing;
            }
            else
            {
                // si no se usa ssl, hay que crear una capa de transporte http y chequear la confiugracion del addressing manual
                transport = new HttpTransportBindingElement();
                ((HttpTransportBindingElement)transport).ManualAddressing = !Configuration.Messaging.AutoAddressing;
            }
            // asigno al binding, el encoder y el transporte que se creo
            binding.Elements.Add(encoder);
            binding.Elements.Add(transport);
            return binding;
        }

        /// <summary>
        /// Crea el Request para el Security Token (RST).
        /// </summary>
        /// <param name="user">Nombre del usuario que quiere acceder al servicio.</param>
        /// <param name="role">Rol con el que el usuario desea identificarse.</param>
        /// <param name="url">URL del servicio.</param>
        /// <param name="issuerAddress">Issuer Address.</param>
        /// <returns>Un objeto <code>RequestSecurityToken</code> con el token generado.</returns>
        private static RequestSecurityToken CreateRST(string user, string role, string url, string issuerAddress)
        {
            // creo el rst TODO:ver tema de appliesTo
            RequestSecurityToken tkn = new RequestSecurityToken(issuerAddress);

            // asigno el usurio, el rol, el issuer, el certificado y el tipo de token
            tkn.TokenType = Constants.  SamlTokenTypeUri;
            tkn.SAMLIssuer = Configuration.SecurityToken.Issuer;
            if (FederationUtilities.LookupCertificate(
                Configuration.RSTCertificate.Store,
                Configuration.RSTCertificate.Location, 
                Configuration.RSTCertificate.DistinguishedName) == null)
            {
                throw new PGECertificateNotFoundException(Configuration.RSTCertificate.DistinguishedName);
            }
            tkn.SAMLCertificateSubjectName = Configuration.RSTCertificate.DistinguishedName;
            tkn.SAMLCertificateStoreName = Configuration.RSTCertificate.Store;
            tkn.SAMLCertificateStoreLocation = Configuration.RSTCertificate.Location;
            tkn.Role = role;
            tkn.User = user;

            tkn.AppliesTo = new EndpointAddress(url);
            return tkn;
        }

        #endregion
    }
}
