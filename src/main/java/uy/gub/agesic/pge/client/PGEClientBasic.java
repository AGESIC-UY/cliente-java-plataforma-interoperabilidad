package uy.gub.agesic.pge.client;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.config.Registry;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.conn.HttpClientConnectionManager;
import org.apache.http.conn.socket.ConnectionSocketFactory;
import org.apache.http.conn.ssl.DefaultHostnameVerifier;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.TrustStrategy;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.ssl.SSLContexts;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import uy.gub.agesic.pge.AgesicConstants;
import uy.gub.agesic.pge.AssertionManager;
import uy.gub.agesic.pge.PGEFactory;
import uy.gub.agesic.pge.XMLUtils;
import uy.gub.agesic.pge.beans.*;
import uy.gub.agesic.pge.enums.SamlVersion;
import uy.gub.agesic.pge.enums.SoapVersion;
import uy.gub.agesic.pge.exceptions.*;
import uy.gub.agesic.pge.pojos.Configuration;
import uy.gub.agesic.pge.pojos.Connector;

import javax.net.ssl.SSLContext;
import java.io.*;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import java.util.UUID;

@Service
@Primary
@PropertySource({"classpath:config.properties"})
public class PGEClientBasic implements PGEClient {
    private static final Logger log = LoggerFactory.getLogger(PGEClientBasic.class);

    @Override
    public STSResponse requestSecurityToken(final Configuration configuration,
                                            final Connector connector, final String policyName,
                                            final String stsGlobalUrl, final CloseableHttpClient httpClient)
            throws RequestSecurityTokenException {
        final SAMLAssertion samlAssertion;
        final String alias = configuration.getAliasKeystore();
        final String storeFilePath = configuration.getDirKeystoreOrg();
        final String password = configuration.getPasswordKeystoreOrg();
        final AssertionManager generator = PGEFactory.getAssertionManager();

        final ClientCredential credential;
        try {
            credential = generator.getCredential(password, storeFilePath, alias);
        } catch (final NoSuchAlgorithmException | UnrecoverableKeyException var25) {
            log.error(var25.getMessage(), var25);
            throw new RequestSecurityTokenException(var25, 902);
        } catch (final CertificateException var26) {
            log.error(var26.getMessage(), var26);
            throw new RequestSecurityTokenException(var26, 900);
        } catch (final IOException var28) {
            log.error(var28.getMessage(), var28);
            throw new RequestSecurityTokenException(var28, 901);
        } catch (final Exception var24) {
            log.error(var24.getMessage(), var24);
            throw new RequestSecurityTokenException(var24, 903);
        }

        try {
            samlAssertion = generator.generateSignedAssertion(credential, connector, policyName);
        } catch (final AssertionException var23) {
            log.error(var23.getMessage(), var23);
            throw new RequestSecurityTokenException(var23);
        }

        final String requestSecurityTokenMessage = createRequestSecurityTokenMessage(connector,
                samlAssertion, policyName);
        final RSTRBean requestSecurityTokenResponse = requestStsHttpComponents(connector,
                configuration, requestSecurityTokenMessage, stsGlobalUrl, httpClient);

        log.debug("Building Assertion from RequestSecurityTokenResponse message");

        final SAMLAssertion assertionResponse;

        try {
            assertionResponse = generator
                    .getAssertionFromSOAP(requestSecurityTokenResponse.getStsResponse(), connector.getSamlVersion());
            log.debug("Assertion was built successfully");
            log.debug(assertionResponse.toString());
        } catch (final ParserException var20) {
            log.error(var20.getMessage(), var20);
            throw new RequestSecurityTokenException(
                    "Unable to parse RequestSecurityTokenResponse message", 905);
        } catch (final NoAssertionFoundException var21) {
            log.error(var21.getMessage(), var21);
            throw new RequestSecurityTokenException("No assertion was found", 906);
        } catch (final UnmarshalException var22) {
            log.error(var22.getMessage(), var22);
            throw new RequestSecurityTokenException(
                    "Unmarshal error: Cannot build assertion from RequestSecurityTokenResponse message", 907);
        }

        log.warn("SAML Signature of RSTR not validated yet!");
        return new STSResponse(requestSecurityTokenResponse.getResponseTime(), assertionResponse);
    }

    private String createRequestSecurityTokenMessage(final Connector connector,
                                                     final SAMLAssertion assertion, final String policyName)
            throws RequestSecurityTokenException {
        final String messageID = UUID.randomUUID().toString();
        final String role = connector.getActualRoleOperation().getRole();
        final String service = connector.getWsaTo();
        final Element elem = assertion.getDOM(connector.getSamlVersion());

        if (connector.getSamlVersion() == SamlVersion.V2_0) {
//            NodeList subjects = elem.getElementsByTagName("saml2:Subject");
//            NodeList authStatements = elem.getElementsByTagName("saml2:AuthnStatement");
//            if (subjects.getLength() > 0 && authStatements.getLength() > 0) {
//                authStatements.item(0).appendChild(subjects.item(0));
//            }

            NodeList inclusiveNamespaces = elem.getElementsByTagName("ec:InclusiveNamespaces");
            if (inclusiveNamespaces.getLength() > 0) {
                inclusiveNamespaces.item(0).getAttributes().getNamedItem("PrefixList").setNodeValue("saml2");
            }
        }

        final String strSaml;
        try {
            strSaml = XMLUtils.xmlToString(elem);
        } catch (final MarshalException var11) {
            log.error(var11.getMessage(), var11);
            throw new RequestSecurityTokenException("Could not create RST message.", 904);
        }

        final String xmlns = connector.getActualRoleOperation().getSoapVersion().equals(SoapVersion.V1_2.getName()) ?
                AgesicConstants.NAMESPACE_SOAP_1_2 : AgesicConstants.NAMESPACE_SOAP_1_1;

        final String soapMessagePartOne =
                "<s:Envelope xmlns:a=\"http://www.w3.org/2005/08/addressing\" xmlns:s=\"" + xmlns + "\">" +

                    "<s:Header>" +
                        "<a:Action s:mustUnderstand=\"1\">http://schemas.xmlsoap.org/ws/2005/02/trust/Issue</a:Action>" +
                        "<a:MessageID>urn:uuid:" + messageID + "</a:MessageID>" +
                    "</s:Header>" +

                    "<s:Body>" +
                        "<RequestSecurityToken xmlns=\"http://schemas.xmlsoap.org/ws/2005/02/trust\">" +
                        "<TokenType>http://docs.oasis-open.org/wss/oasis-wss-saml-token-profile-1.1#SAMLV1.1</TokenType>" +

                        "<AppliesTo xmlns=\"http://schemas.xmlsoap.org/ws/2004/09/policy\">" +
                            "<a:EndpointReference>" +
                                "<a:Address>" + service + "</a:Address>" +
                            "</a:EndpointReference>" +
                        "</AppliesTo>" +

                        "<RequestType>http://schemas.xmlsoap.org/ws/2005/02/trust/Issue</RequestType>" +

                        "<Issuer>" +
                            "<a:Address>" + policyName + "</a:Address>" +
                        "</Issuer>" +

                        "<Base>";

        final String soapMessagePartTwo = "</Base>" +
                        "<SecondaryParameters>" +
                            "<Rol>" + role + "</Rol>" +
                        "</SecondaryParameters>" +

                        "</RequestSecurityToken>" +

                    "</s:Body>" +

                "</s:Envelope>";

        final String soapMessageSaml2PartOne =
                "<soapenv:Envelope xmlns:soapenv=\"" + xmlns + "\" xmlns:wst=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\" xmlns:wsa=\"http://www.w3.org/2005/08/addressing\">" +

                        "<soapenv:Header>" +
                            "<wsa:MessageID>uuid-" + messageID + "</wsa:MessageID>" +
                            "<wsa:Action>http://docs.oasis-open.org/ws-sx/ws-trust/200512/RequestSecurityToken</wsa:Action>" +
                        "</soapenv:Header>" +

                        "<soapenv:Body>" +
                            "<wst:RequestSecurityToken >" +

                                "<wsp:AppliesTo xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\">" +
                                    "<wsa:EndpointReference>" +
                                        "<wsa:Address>" + service + "</wsa:Address>" +
                                    "</wsa:EndpointReference>" +
                                "</wsp:AppliesTo>" +

                                "<wst:RequestType>http://docs.oasis-open.org/ws-sx/ws-trust/200512/Issue</wst:RequestType>" +

                                "<wst:Issuer>" +
                                    "<wsa:Address>" + policyName + "</wsa:Address>" +
                                "</wst:Issuer>" +

                                "<wst:Base>";

        final String soapMessageSaml2PartTwo =
                                "</wst:Base>" +
                        "</wst:RequestSecurityToken>" +
                    "</soapenv:Body>" +
                "</soapenv:Envelope>";

        return (connector.getSamlVersion() == SamlVersion.V2_0 ? soapMessageSaml2PartOne:soapMessagePartOne) + strSaml + (connector.getSamlVersion() == SamlVersion.V2_0 ? soapMessageSaml2PartTwo:soapMessagePartTwo);
    }

    private RSTRBean requestStsHttpComponents(final Connector connector,
                                              final Configuration configuration,
                                              final String requestSecurityTokenMessage,
                                              final String stsGlobalUrl, final CloseableHttpClient httpClient)
            throws RequestSecurityTokenException {
        final InputStream stream;

//        KeyStore keystore = null;
//        KeyStore truststoreSSL = null;
        final long stsRequestTimestamp;
        final long stsResponseTimestamp;
//        try {
//            keystore = prepareKeystore(configuration.getDirKeystoreSsl(),
//                    configuration.getPasswordKeystoreSsl());
//            truststoreSSL = prepareKeystore(configuration.getDirKeystore(),
//                    configuration.getPasswordKeystore());
//        } catch (final KeyStoreException e) {
//            throw new RequestSecurityTokenException(e, Integer.valueOf(901));
//        } catch (final IOException e) {
//            throw new RequestSecurityTokenException(e, Integer.valueOf(901));
//        }
        String url;
        if (connector.isEnableSTSLocal()) {
            url = connector.getStsLocalUrl();
        } else {
            //final ConnectorGlobalConfiguration globalConfiguration = connectorService.getGlobalConfigurationByType(connector.getType());
            url = stsGlobalUrl;//globalConfiguration.getStsGlobalUrl();
        }

        //url = "https://testservicios.pge.red.uy:6022/SecurityTokenService/2.0";

        //TODO: Fix this
        //try (CloseableHttpClient httpclient = prepareClient(keystore, configuration, truststoreSSL, url, connManager)) {
        try (CloseableHttpClient httpclient = httpClient) {

            final String requestSecurityTokenResponseMessage;
            try {
                final RequestConfig requestConfig = RequestConfig.custom()
                        .setSocketTimeout(AgesicConstants.TIME_OUT_MILLIS)
                        .setConnectTimeout(AgesicConstants.TIME_OUT_MILLIS)
                        .setConnectionRequestTimeout(AgesicConstants.TIME_OUT_MILLIS)
                        .build();

                final HttpPost httpPost = new HttpPost(url);

                httpPost.setEntity(new StringEntity(requestSecurityTokenMessage));
                httpPost.setConfig(requestConfig);

                stsRequestTimestamp = System.currentTimeMillis();
                final HttpResponse httpResponse = httpclient.execute(httpPost);
                stsResponseTimestamp = System.currentTimeMillis();

                final HttpEntity entity = httpResponse.getEntity();
                final StatusLine statusLine = httpResponse.getStatusLine();
                log.debug("STS response: " + statusLine);
                stream = entity.getContent();

                final InputStreamReader isr1 = new InputStreamReader(stream);
                final BufferedReader in = new BufferedReader(isr1);
                final StringBuffer stringBuffer = new StringBuffer();

                String inputLine;
                while ((inputLine = in.readLine()) != null) {
                    stringBuffer.append(inputLine);
                }

                in.close();
                requestSecurityTokenResponseMessage = stringBuffer.toString();
                log.debug(requestSecurityTokenResponseMessage);
                final int result = statusLine.getStatusCode();
                if (result != 200 && result != 202) {
                    throw new RequestSecurityTokenException(requestSecurityTokenResponseMessage, 908);
                }
            } catch (final IOException var78) {
                log.error(var78.getMessage(), var78);
                throw new RequestSecurityTokenException(var78, 901);
            } catch (final Exception var83) {
                log.error(var83.getMessage(), var83);
                throw new RequestSecurityTokenException(var83, 908);
            } finally {
                // Cierro la conexion.
                httpclient.close();
            }
            return new RSTRBean(requestSecurityTokenResponseMessage,
                    stsResponseTimestamp - stsRequestTimestamp);

        } catch (final IOException e) {
            log.error(e.getMessage(), e);
            throw new RequestSecurityTokenException(e, 909);
        }
    }

//    private CloseableHttpClient prepareClient(final KeyStore keystore,
//                                              final Configuration configuration, final KeyStore keyStoreSSL, final String url, final HttpClientConnectionManager connManager) {
//        try {
//            final SSLContext sslContext = SSLContexts.custom()
//                    .loadTrustMaterial(keyStoreSSL, new TrustStrategy() {
//                        @Override
//                        public boolean isTrusted(final X509Certificate[] chain,
//                                                 final String authType) throws CertificateException {
//                            return true;
//                        }
//                    })
//                    .loadKeyMaterial(keystore, configuration.getPasswordKeystoreSsl().toCharArray())
//                    .build();
//            final HttpClientBuilder builder = HttpClientBuilder.create();
//            final SSLConnectionSocketFactory sslConnectionFactory = new SSLConnectionSocketFactory(
//                    sslContext.getSocketFactory(), new DefaultHostnameVerifier());
//
//            builder.setSSLSocketFactory(sslConnectionFactory);
//            //final Registry<ConnectionSocketFactory> registry = RegistryBuilder.<ConnectionSocketFactory>create().register("https", sslConnectionFactory).build();
//
//            //builder.setConnectionManager(poolConnectionService.getPoolConnectionManagerByUrl(url, registry));
//            builder.setConnectionManager(connManager);
//            builder.setConnectionManagerShared(true);
//            return builder.build();
//        } catch (final Exception ex) {
//            log.error("couldn't create httpClient!! {}", ex.getMessage(), ex);
//            return null;
//        }
//    }

    private KeyStore prepareKeystore(final String keystorePath, final String keystorePassword)
            throws KeyStoreException, IOException, RequestSecurityTokenException {
        log.debug("STS - SSL config: keystorePath=" + keystorePath + ", keystorePassword="
                + keystorePassword);

        final KeyStore keystore = KeyStore.getInstance(KeyStore.getDefaultType());
        FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream(new File(keystorePath));
            keystore.load(inputStream, keystorePassword.toCharArray());
            return keystore;
        } catch (final NoSuchAlgorithmException exception) {
            log.error(exception.getMessage(), exception);
            throw new RequestSecurityTokenException(exception, 902);
        } catch (final CertificateException exception) {
            log.error(exception.getMessage(), exception);
            throw new RequestSecurityTokenException(exception, 900);
        } finally {
            try {
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (final Exception exception) {
                log.error("Error al cerrar el stream al leer el keystore " + keystorePath);
            }
        }
    }

    private static class RSTRBean {
        private final String stsResponse;

        private final long responseTime;

        public RSTRBean(final String stsResponse, final long responseTime) {
            super();
            this.stsResponse = stsResponse;
            this.responseTime = responseTime;
        }

        public String getStsResponse() {
            return stsResponse;
        }

        public long getResponseTime() {
            return responseTime;
        }
    }
}

