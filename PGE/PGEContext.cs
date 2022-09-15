using System.ServiceModel;
using AGESIC.PGE.Security;
using System;
using System.Reflection;
using System.Net;
using System.Net.Security;
using System.Security.Cryptography.X509Certificates;
using System.ServiceModel.Description;
using AGESIC.PGE.Error;
using AGESIC.PGE.PS;

namespace AGESIC.PGE
{
    public class PGEContext<T> : IDisposable
        where T : class
    {
        #region Public Properties

        /// <summary>
        /// Obtiene o establece el Scope de la operación (creado a partir del canal del cliente) donde se agregó el token SAML.
        /// </summary>
        public OperationContextScope Scope { get; set; }

        /// <summary>
        /// Obtiene o establece el objeto proxy cliente
        /// </summary>
        public T Client { get; set; }

        #endregion

        #region Private Properties

        /// <summary>
        /// URI del servicio.
        /// </summary>
        private string _servicePhysicalUri;

        /// <summary>
        /// URI lógica del servicio.
        /// </summary>
        private string _serviceLogicalUri;

        /// <summary>
        /// Nombre del usuario que el cliente utilizará para identificarse en la PGE.
        /// </summary>
        private string _user;

        /// <summary>
        /// Rol que utilizará el usuario para utilizar el servicio.
        /// </summary>
        private string _role;

        /// <summary>
        /// IssuerAddress
        /// </summary>
        private string _issuerAddress;

        /// <summary>
        /// Indicador que resuelve si el SAML ya fue agregado al header.
        /// </summary>
        private bool isAdded;

        /// <summary>
        /// Indicador que se configura según el servicio vaya a través de https o no.
        /// </summary>
        private bool isHttps;

        /// <summary>
        /// Configura si se utiliza STS o no
        /// </summary>
        private bool addWSSecurityUsernameToken = false;

        /// <summary>
        /// Certificado de cliente a utilizar con SSL
        /// </summary>
        private X509Certificate2 _clientCert;

        /// <summary>
        /// Certificado de servidor a utilziar con SSL
        /// </summary>
        private X509Certificate2 _serviceCert;

        /// <summary>
        /// Usuario que viajará en el token de serguridad 'UserNameToken'
        /// </summary>
        private string _userNameTokenUser;

        /// <summary>
        /// Password que viajará en el token de seguridad 'UserNameToken'
        /// </summary>
        private string _userNameTokenPassword;

        /// <summary>
        /// Nombre del cabezal de Productor de Novedades para Publish and Suscribe
        /// </summary>
        private ProducerInfo _psProducer;

        /// <summary>
        /// Nombre del cabezal de Consumidor de Novedades para Publish and Suscribe
        /// </summary>
        private SubscriberInfo _psSubscriber;

        /// <summary>
        /// Indica si se han agregado o no los cabezales para el uso de Publish and Subscribe
        /// </summary>
        private bool _psHeadersAdded;

        #endregion

        #region Constructor

        /// <summary>
        /// Crea una nueva instancia de PGEContext.
        /// </summary>
        /// <param name="client">Cliente del servicio final.</param>
        /// <param name="serviceUri">URL del servicio. Seteable en el caso de que la URL no coincida con la especificada en el cliente.</param>
        /// <param name="user">Usuario del servicio.</param>
        /// <param name="role">Rol que utilizará el usuario para invocar al servicio.</param>
        /// <param name="issuerAddress">Issuer Address.</param>
        internal PGEContext(string user, string role, string issuerAddress)
        {
            _user = user;
            _role = role;
            _issuerAddress = issuerAddress;
            isAdded = false;
            _psHeadersAdded = false;
            _psProducer = null;
            _psSubscriber = null;

            InitUrl();
            isHttps = _servicePhysicalUri.StartsWith("https://");
        }

        /// <summary>
        /// Crea una nueva instancia de PGEContext.
        /// </summary>
        /// <param name="client">Cliente del servicio final.</param>
        /// <param name="serviceUri">URL del servicio. Seteable en el caso de que la URL no coincida con la especificada en el cliente.</param>
        /// <param name="user">Usuario del servicio.</param>
        /// <param name="role">Rol que utilizará el usuario para invocar al servicio.</param>
        /// <param name="issuerAddress">Issuer Address.</param>
        /// <param name="psProducer">Datos del Productor para el servicio de Novedades</param>
        internal PGEContext(string user, string role, string issuerAddress, ProducerInfo psProducer)
            : this(user, role, issuerAddress)
        {
            

            if (psProducer == null)
                throw new ArgumentException("Los datos del Productor del servicio de Novedades no pueden ser nulos");

            _psProducer = psProducer;
        }

        /// <summary>
        /// Crea una nueva instancia de PGEContext.
        /// </summary>
        /// <param name="client">Cliente del servicio final.</param>
        /// <param name="serviceUri">URL del servicio. Seteable en el caso de que la URL no coincida con la especificada en el cliente.</param>
        /// <param name="user">Usuario del servicio.</param>
        /// <param name="role">Rol que utilizará el usuario para invocar al servicio.</param>
        /// <param name="issuerAddress">Issuer Address.</param>
        /// <param name="psSubscriber">Datos del Suscriptor para el servicio de Novedades</param>
        internal PGEContext(string user, string role, string issuerAddress, SubscriberInfo psSubscriber)
            : this(user, role, issuerAddress)
        {
           

            if (psSubscriber == null)
                throw new ArgumentException("Los datos del Subscriptor del servicio de Novedades no pueden ser nulos");

            _psSubscriber = psSubscriber;
        }

        /// <summary>
        /// Crea una nueva instancia de PGEContext.
        /// </summary>
        /// <param name="client">Cliente del servicio final.</param>
        /// <param name="serviceUri">URL del servicio. Seteable en el caso de que la URL no coincida con la especificada en el cliente.</param>
        /// <param name="user">Usuario del servicio.</param>
        /// <param name="role">Rol que utilizará el usuario para invocar al servicio.</param>
        /// <param name="issuerAddress">Issuer Address.</param>
        /// <param name="userNameToken">Usuario correspondiente al UserNameToken de Seguridad.</param>
        /// <param name="passwordToken">Password correspondiente al UserNameToken de Seguridad.</param>
        internal PGEContext(string user, string role, string issuerAddress, string userNameToken, string passwordToken)
            : this(user, role, issuerAddress)
        {
            addWSSecurityUsernameToken = true;
            if (string.IsNullOrEmpty(Configuration.SecurityToken.SAMLActor))
                throw new PGEConfigurationException();

            if (string.IsNullOrEmpty(passwordToken))
                throw new PGEUserNameSecurityTokenInvalidException("El password para utilizar un UserNameSecurityToken no puede ser nulo o vacío");

            if (string.IsNullOrEmpty(userNameToken))
                throw new PGEUserNameSecurityTokenInvalidException("El nombre de usuario para utilizar un UserNameSecurityToken no puede ser nulo o vacío");

            _userNameTokenPassword = passwordToken;
            _userNameTokenUser = userNameToken;
        }

        private void InitUrl()
        {
            T clientAux = (T)Activator.CreateInstance(typeof(T));
            ServiceEndpoint endPointAux = (ServiceEndpoint)typeof(T).GetProperty("Endpoint").GetValue(clientAux, null);
            _serviceLogicalUri = endPointAux.Address.Uri.AbsoluteUri;
            string serviceUri = endPointAux.Behaviors.Find<ClientViaBehavior>().Uri.AbsoluteUri;
            isHttps = serviceUri.StartsWith("https://");
            _servicePhysicalUri = serviceUri;
            _clientCert = null;
            _serviceCert = null;
            if (isHttps)
            {
                ClientCredentials credentials = endPointAux.Behaviors.Find<ClientCredentials>();
                _clientCert = credentials.ClientCertificate.Certificate;
                _serviceCert = credentials.ServiceCertificate.DefaultCertificate;
            }
        }

        #endregion

        #region Methods

        /// <summary>
        /// Si no se ha agregado ya el token SAML al cabezal,  crea el contexto de la operación a partir del canal 
        /// utilizado por el cliente, obtiene el Security Token del STS y agrega el token SAML al contexto.
        /// 
        /// Se utiliza además para agregar el cabezal UserNameToken WS-Security en caso de que sea necesario
        /// utilizarlo por el servicio
        /// 
        /// Se utiliza además para agregar los cabezales necesarios para el uso de Publish and Subscribe
        /// en caso de que se esté utilizando
        /// 
        /// </summary>
        internal void AddHeaders()
        {
            if (!isAdded)
            {
                // Se obtiene el token
                SamlTokenHeaderEmbedder wsSecurityHeader = null;
                try
                {
                        wsSecurityHeader = PGEUtils.SecurityTokenHeader(_user, _role, _servicePhysicalUri, _serviceLogicalUri,
                            _issuerAddress, isHttps, _clientCert, _serviceCert);

                }
                catch (Exception ex)
                {
                    throw new PGESecurityTokenCannotBeAdded(ex);
                }
                // Se crea el cliente
                IClientChannel channel = null;
                try
                {
                    Client = (T)Activator.CreateInstance(typeof(T));
                    channel = (IClientChannel)typeof(T).GetProperty("InnerChannel").GetValue(Client, null);
                }
                catch (Exception ex)
                {
                    throw new PGECannotCreateClientException(ex);
                }
                // Se crea el OperationContextScope
                try
                {
                    OperationContext contexto = new OperationContext(channel);
                    Scope = new OperationContextScope(channel);
                }
                catch (Exception ex)
                {
                    throw new PGEScopeCannotBeCreated(ex);
                }
                // Agrego el SAML al header
                try
                {
                    if (isHttps)
                    {
                        ServicePointManager.CertificatePolicy = new SSLTrustCertificateAll();
                        ServicePointManager.ServerCertificateValidationCallback += RemoteCertificateValidate;
                        ServicePointManager.SecurityProtocol = SecurityProtocolType.Ssl3;
                    }

                    OperationContext.Current.OutgoingMessageHeaders.Add(wsSecurityHeader);
                    isAdded = true;

                    AddPSHeaders();

                }
                catch (Exception ex)
                {
                    throw new PGETokenCannotBeAdded(ex);
                }
                if (isAdded)
                {
                    OperationContext.Current.OperationCompleted += new EventHandler(Current_OperationCompleted);
                }
            }
            else
            {
                throw new PGETokenAlreadyAddedException();
            }
        }

        private void AddPSHeaders()
        {
            if (_psSubscriber !=  null)
            {
                OperationContext.Current.OutgoingMessageHeaders.Add(new TopicHeader(_psSubscriber.TopicName));
                OperationContext.Current.OutgoingMessageHeaders.Add(new SubscriberHeader(_psSubscriber.Name));
                _psHeadersAdded = true;
            }

            if (_psProducer != null)
            {
                OperationContext.Current.OutgoingMessageHeaders.Add(new TopicHeader(_psProducer.TopicName));
                OperationContext.Current.OutgoingMessageHeaders.Add(new ProducerHeader(_psProducer.Name));
                _psHeadersAdded = true;
            }
        }

        /// <summary>
        /// Si no se ha agregado ya el token SAML al cabezal, crea el contexto de la operación a partir del canal 
        /// utilizado por el cliente, obtiene el Security Token del STS, agrega el token SAML y el token UserNameSecurityToken al contexto.
        /// </summary>
        internal void AddSAMLAndUserNameToken()
        {
            if (!isAdded)
            {
                // Se obtiene el token
                SamlTokenHeaderEmbedder wsSecurityHeader = null;
                UserNameTokenEmbedder wsSecurityHeaderUserNameTokenEmbedder = null;

                try
                {
                        wsSecurityHeader = PGEUtils.SecurityTokenHeader(_user, _role, _servicePhysicalUri, _serviceLogicalUri,
                            _issuerAddress, isHttps, _clientCert, _serviceCert);
                }
                catch (Exception ex)
                {
                    throw new PGESecurityTokenCannotBeAdded(ex);
                }
                try
                {
                    if (addWSSecurityUsernameToken)
                    {
                        // Crea el UserNameSecurityToken con los datos obtenidos al instanciar el contexto.
                        wsSecurityHeaderUserNameTokenEmbedder = new UserNameTokenEmbedder(_userNameTokenUser, _userNameTokenPassword);
                    }
                }
                catch (Exception ex)
                {
                    throw new PGEUserNameSecurityTokenCannotBeAdded(ex);
                }
                // Se crea el cliente
                IClientChannel channel = null;
                try
                {
                    Client = (T)Activator.CreateInstance(typeof(T));
                    channel = (IClientChannel)typeof(T).GetProperty("InnerChannel").GetValue(Client, null);
                }
                catch (Exception ex)
                {
                    throw new PGECannotCreateClientException(ex);
                }
                // Se crea el OperationContextScope
                try
                {
                    OperationContext contexto = new OperationContext(channel);
                    Scope = new OperationContextScope(channel);
                }
                catch (Exception ex)
                {
                    throw new PGEScopeCannotBeCreated(ex);
                }
                // Agrego el SAML al header
                try
                {
                    if (isHttps)
                    {
                        ServicePointManager.CertificatePolicy = new SSLTrustCertificateAll();
                        ServicePointManager.ServerCertificateValidationCallback += RemoteCertificateValidate;
                        ServicePointManager.SecurityProtocol = SecurityProtocolType.Ssl3;
                    }
                    OperationContext.Current.OutgoingMessageHeaders.Add(wsSecurityHeader);
                    // Agrega el UserNameSecurityToken al Cabezal del Mensaje.
                    if(addWSSecurityUsernameToken)
                        OperationContext.Current.OutgoingMessageHeaders.Add(wsSecurityHeaderUserNameTokenEmbedder);

                    isAdded = true;
                }
                catch (Exception ex)
                {
                    throw new PGETokenCannotBeAdded(ex);
                }
                if (isAdded)
                {
                    OperationContext.Current.OperationCompleted += new EventHandler(Current_OperationCompleted);
                }
            }
            else
            {
                throw new PGETokenAlreadyAddedException();
            }
        }

        #endregion

        #region Static Members

        /// <summary>
        /// Agrega el encabezado Security a la petición, utilizando SAML. Ejemplo de uso:
        /// <code>
        ///     PGEContext(ServiceClient).AddSAML("User", "Role", "issuerAddress");
        ///     object result = myClient.methodToInvoke(param1, param2, ..., paramN);
        /// </code>
        /// </summary>
        /// <param name="user">Nombre del usuario que se quiere autenticar contra el STS.</param>
        /// <param name="role">Rol del usuario que se quiere utilizar para utilizar el servicio.</param>
        /// <param name="issuerAddress">IssuerAddress</param>
        /// <returns>Un objeto <code>PGEContext</code> con el SAML ya agregado.</returns>
        public static PGEContext<T> CreatePGEContext(string user, string role, string issuerAddress)
        {
            try
            {
                DateTime inicio = DateTime.Now;
                PGEContext<T> context = new PGEContext<T>(user, role, issuerAddress);
                context.AddHeaders();
                DateTime fin = DateTime.Now;
                return context;
            }
            catch (Exception ex)
            {
                throw new PGEException(ex);
            }
        }
                
        /// <summary>
        /// Agrega el encabezado Security a la petición, utilizando SAML y UserNameToken. 
        /// Ejemplo de uso:
        /// <code>
        ///     PGEContext(ServiceClient) contextPGE = PGEContext<ServiceClient>.CreatePGEContext("User", "Role", "issuerAddress", "userNameToken", "passwordUserNameToken");
        ///     object result = contextPGE.Client.methodToInvoke(param1, param2, ..., paramN);
        /// </code>
        /// </summary>
        /// <param name="user">Nombre del usuario que se quiere autenticar contra el STS.</param>
        /// <param name="role">Rol del usuario que se quiere utilizar para utilizar el servicio.</param>
        /// <param name="issuerAddress">IssuerAddress</param>
        /// <param name="userNameToken">Usuario correspondiente al UserNameToken de la especificación WS-Security.</param>
        /// <param name="passwordToken">Password correspondiente al UserNameToken de la especificación WS-Security.</param>
        /// <returns>Un objeto <code>PGEContext</code> con el SAML y el UserNameToken ya agregado.</returns>
        public static PGEContext<T> CreatePGEContext(string user, string role, string issuerAddress, string userNameToken, string passwordToken)
        {
            try
            {
                DateTime inicio = DateTime.Now;
                PGEContext<T> context = new PGEContext<T>(user, role, issuerAddress, userNameToken, passwordToken);
                context.AddSAMLAndUserNameToken();
                DateTime fin = DateTime.Now;
                return context;
            }
            catch (Exception ex)
            {
                throw new PGEException(ex);
            }
        }

        /// <summary>
        /// Agrega el encabezado Security a la petición, utilizando SAML y UserNameToken. 
        /// Ejemplo de uso:
        /// <code>
        ///     PGEContext(ServiceClient) contextPGE = PGEContext<ServiceClient>.CreatePGEContext("User", "Role", "issuerAddress", "userNameToken", "passwordUserNameToken");
        ///     object result = contextPGE.Client.methodToInvoke(param1, param2, ..., paramN);
        /// </code>
        /// </summary>
        /// <param name="user">Nombre del usuario que se quiere autenticar contra el STS.</param>
        /// <param name="role">Rol del usuario que se quiere utilizar para utilizar el servicio.</param>
        /// <param name="issuerAddress">IssuerAddress</param>
        /// <param name="producer">Datos del productor para el servicio de Novedades</param>
        /// <returns>Un objeto <code>PGEContext</code> con el SAML y el UserNameToken ya agregado.</returns>
        public static PGEContext<T> CreatePGEContext(string user, string role, string issuerAddress, ProducerInfo producer)
        {
            try
            {
                DateTime inicio = DateTime.Now;
                PGEContext<T> context = new PGEContext<T>(user, role, issuerAddress, producer);
                context.AddHeaders();
                DateTime fin = DateTime.Now;
                return context;
            }
            catch (Exception ex)
            {
                throw new PGEException(ex);
            }
        }

        /// <summary>
        /// Agrega el encabezado Security a la petición, utilizando SAML y UserNameToken. 
        /// Ejemplo de uso:
        /// <code>
        ///     PGEContext(ServiceClient) contextPGE = PGEContext<ServiceClient>.CreatePGEContext("User", "Role", "issuerAddress", "userNameToken", "passwordUserNameToken");
        ///     object result = contextPGE.Client.methodToInvoke(param1, param2, ..., paramN);
        /// </code>
        /// </summary>
        /// <param name="user">Nombre del usuario que se quiere autenticar contra el STS.</param>
        /// <param name="role">Rol del usuario que se quiere utilizar para utilizar el servicio.</param>
        /// <param name="issuerAddress">IssuerAddress</param>
        /// <param name="producer">Datos del suscriptor para el servicio de Novedades</param>
        /// <returns>Un objeto <code>PGEContext</code> con el SAML y el UserNameToken ya agregado.</returns>
        public static PGEContext<T> CreatePGEContext(string user, string role, string issuerAddress, SubscriberInfo subscriber)
        {
            try
            {
                DateTime inicio = DateTime.Now;
                PGEContext<T> context = new PGEContext<T>(user, role, issuerAddress, subscriber);
                context.AddHeaders();
                DateTime fin = DateTime.Now;
                return context;
            }
            catch (Exception ex)
            {
                throw new PGEException(ex);
            }
        }

        #endregion

        #region Miembros de IDisposable

        /// <summary>
        /// Resetea el contexto.
        /// </summary>
        public void Dispose()
        {
            isAdded = false;
            Client = null;
            if (Scope != null)
            {
                Scope.Dispose();
            }
        }

        #endregion

        #region Operation Completed Event

        /// <summary>
        /// Resetea el contexto cuando finaliza la operación en curso.
        /// </summary>
        /// <param name="sender">Objeto que envía la señal del evento de finalización de la oepración.</param>
        /// <param name="e">Parámetros enviados en el evento.</param>
        void Current_OperationCompleted(object sender, EventArgs e)
        {
            isAdded = false;
            _psHeadersAdded = false;
            Client = null;
            Scope.Dispose();
        }

        #endregion

        #region Certificate Validation Event

        /// <summary>
        /// Valida todos los certificados que entran. Se realiza de esta manera, debido a que los certificados de cliente y servidor, pueden no matchear utilizando los validadores por defecto.
        /// </summary>
        /// <param name="sender">Objeto que envía el evento de validación</param>
        /// <param name="cert">Certificado a validar</param>
        /// <param name="chain">Cadena asociada.</param>
        /// <param name="error">Política de errores.</param>
        /// <returns></returns>
        private static bool RemoteCertificateValidate(
            object sender, X509Certificate cert,
            X509Chain chain, SslPolicyErrors error)
        {
            return true;
        }

        #endregion
    }
}
