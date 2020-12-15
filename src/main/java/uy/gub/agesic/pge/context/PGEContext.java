package uy.gub.agesic.pge.context;

import org.apache.log4j.Logger;
import uy.gub.agesic.pge.beans.ClientCredential;
import uy.gub.agesic.pge.beans.RSTBean;
import uy.gub.agesic.pge.beans.StoreBean;
import uy.gub.agesic.pge.core.config.PGEConfiguration;
import uy.gub.agesic.pge.core.security.KeyStoreUtil;
import uy.gub.agesic.pge.core.ssl.SSLContextInitializer;
import uy.gub.agesic.pge.core.sts.client.PGESTSClient;
import uy.gub.agesic.pge.core.ws.addressing.AddressingBuilder;
import uy.gub.agesic.pge.core.ws.addressing.AddressingProperties;
import uy.gub.agesic.pge.exceptions.*;
import uy.gub.agesic.pge.handler.LoggingHandler;
import uy.gub.agesic.pge.handler.SAMLHandler;
import uy.gub.agesic.pge.handler.WSAddressingHandler;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Response;
import javax.xml.ws.Service;
import javax.xml.ws.handler.Handler;
import java.io.Serializable;
import java.net.URISyntaxException;
import java.net.URL;
import java.security.Key;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class PGEContext<T extends Service, U> implements Serializable {
    private static final long serialVersionUID = -2875346144773320909L;
    private static final Logger log = Logger.getLogger(PGEContext.class);
    private static final String CONFIG_FILE = "pge-config.xml";

    private final PGEConfiguration config;
    private final RSTBean bean;
    private final String action;

    private PGESTSClient stsClient;
    private List<Handler> handlers;
    private Map<String, Object> requestContextProperties;
    private String serviceName;
    private T service;
    private U port;
    private Class<U> portClass;
    private StoreBean keyStoreSSL;
    private StoreBean trustStore;
    private ClientCredential clientCredential;
    private Response<SOAPMessage> stsResponse;
    private SSLContextInitializer sslContextInitializer;

    public PGEContext(Class<T> serviceClass, Class<U> portClass, String serviceName, String action, PGEConfiguration config, URL wsdlDocumentLocation, QName serviceQName) throws RequestSecurityTokenException, ConfigurationException, PGEContextException {
        this.stsClient = new PGESTSClient();
        this.handlers = new ArrayList<Handler>();
        this.handlers.add(new SAMLHandler());
        this.handlers.add(new WSAddressingHandler());
        this.handlers.add(new LoggingHandler());
        this.serviceName = serviceName;
        this.portClass = portClass;
        this.action = action;

        if (config == null) {
            this.config = new PGEConfiguration("pge-config.xml");
        } else {
            this.config = config;
        }

        this.bean = createRSTBean();
        initKeyStoreBean();
        try {
            String sslInitClazz = this.config.getSTSPropValue("SSLContextInitializer");
            if (sslInitClazz != null) {
                Class<?> clazz = SecurityActions.loadClass(getClass(), sslInitClazz);
                this.sslContextInitializer = (SSLContextInitializer) clazz.newInstance();
            }
            log.info("Create web service...");
            if (wsdlDocumentLocation != null && serviceQName != null) {
                log.info("Using wsdlDocumentLocation: " + wsdlDocumentLocation);
                log.info("Using serviceName: " + serviceQName);
                this.service = serviceClass.getDeclaredConstructor(URL.class, QName.class).newInstance(wsdlDocumentLocation, serviceQName);
            } else {
                this.service = serviceClass.newInstance();
            }
            log.info("Init BindingProvider...");
            initBindingProvider();
            log.info("IssueToken...");
            issueToken();
            log.info("End init PGEContext.");
        } catch (Exception e) {
            e.printStackTrace();
            throw new PGEContextException(e.getMessage(), e);
        }
    }

    public PGEContext(Class<T> serviceClass, Class<U> portClass, String serviceName, String action) throws RequestSecurityTokenException, ConfigurationException, PGEContextException {
        this(serviceClass, portClass, serviceName, action, (PGEConfiguration) null, null, null);
    }

    public PGEContext(Class<T> serviceClass, Class<U> portClass, String serviceName, String action, String configFile) throws RequestSecurityTokenException, ConfigurationException, PGEContextException {
        this(serviceClass, portClass, serviceName, action, new PGEConfiguration(configFile), null, null);
    }

    public PGEContext(Class<T> serviceClass, Class<U> portClass, String serviceName, String action, String configFile, URL wsdlDocumentLocation, QName serviceQName) throws RequestSecurityTokenException, ConfigurationException, PGEContextException {
        this(serviceClass, portClass, serviceName, action, new PGEConfiguration(configFile), wsdlDocumentLocation, serviceQName);
    }

    public PGEContext(Class<T> serviceClass, Class<U> portClass, PGEConfiguration config, String serviceName, String action, URL wsdlDocumentLocation, QName serviceQName) throws RequestSecurityTokenException, ConfigurationException, PGEContextException {
        this(serviceClass, portClass, serviceName, action, config, wsdlDocumentLocation, serviceQName);
    }

    private void issueToken() throws InterruptedException, ExecutionException, TimeoutException, ParserException, NoAssertionFoundException, UnmarshalException, SOAPException, RequestSecurityTokenException {
        log.info("Request STS...");
        this.stsResponse = this.stsClient.requestSecurityToken(this.bean, this.clientCredential, this.keyStoreSSL, this.trustStore, this.config, this.sslContextInitializer);
        ((BindingProvider) getPort()).getRequestContext().put("uy.gub.agesic.security.saml", this.stsResponse);
    }

    public void addHandlerChain(Handler handler) {
        this.handlers.add(handler);
    }

    public T getService() {
        return this.service;
    }

    public U getPort() {
        if (this.port == null) {
            this.port = this.service.getPort(this.portClass);
        }
        return this.port;
    }

    public void renewToken() throws RequestSecurityTokenException, PGEContextException {
        try {
            issueToken();
        } catch (Exception e) {
            throw new PGEContextException(e.getMessage(), e);
        }
    }

    public void destroy() {
        this.stsClient = null;
        this.handlers = null;
        this.serviceName = null;
        this.portClass = null;
        this.service = null;
        this.requestContextProperties = null;
    }

    private RSTBean createRSTBean() {
        String issuer = this.config.getSTSPropValue("Issuer");
        String policyName = this.config.getSTSPropValue("Policy");
        String role = this.config.getSTSPropValue("Role");
        String userName = this.config.getSTSPropValue("Username");

        RSTBean bean = new RSTBean();
        bean.setIssuer(issuer);
        bean.setPolicyName(policyName);
        bean.setRole(role);
        bean.setUserName(userName);
        bean.setService(this.serviceName);

        return bean;
    }

    private void initBindingProvider() throws ConfigurationException {
        String trustStoreFilePath = this.config.getKeyStoreAuthValue("TrustStoreURL");
        String trustStorePwd = this.config.getKeyStoreAuthValue("TrustStorePass");
        String sslKeyStoreFilePath = this.config.getKeyStoreAuthValue("SSLKeyStoreURL");
        String sslKeyStorePwd = this.config.getKeyStoreAuthValue("SSLKeyStorePass");

        this.requestContextProperties = ((BindingProvider) getPort()).getRequestContext();
        this.requestContextProperties.put("org.jboss.ws.authType", "org.jboss.ws.authType.wsse");
        this.requestContextProperties.put("org.jboss.ws.keyStore", sslKeyStoreFilePath);
        this.requestContextProperties.put("org.jboss.ws.keyStorePassword", sslKeyStorePwd);
        this.requestContextProperties.put("org.jboss.ws.trustStore", trustStoreFilePath);
        this.requestContextProperties.put("org.jboss.ws.trustStorePassword", trustStorePwd);
        this.requestContextProperties.put("STSTimeOut", this.config.getSTSLongPropValue("STSTimeOut"));

        if (this.sslContextInitializer != null) {
            this.sslContextInitializer.initSSLContextPort(getPort(), this.config);
        }

        try {
            AddressingProperties addrProps = buildAddressingProperties();
            this.requestContextProperties.put("uy.gub.pge.ws.addressing.context", addrProps);
        } catch (URISyntaxException e) {
            throw new ConfigurationException(e.getMessage(), e);
        }

        ((BindingProvider) getPort()).getBinding().setHandlerChain(this.handlers);
    }

    private AddressingProperties buildAddressingProperties() throws URISyntaxException {
        AddressingBuilder builder = AddressingBuilder.getAddressingBuilder();
        AddressingProperties outProps = builder.newAddressingProperties();
        outProps.setTo(builder.newURI(this.serviceName));
        outProps.setAction(builder.newURI(this.action));

        return outProps;
    }

    private void initKeyStoreBean() throws ConfigurationException {
        String alias = this.config.getKeyStoreAuthValue("KeyStoreAlias");
        String keyStoreUrl = this.config.getKeyStoreAuthValue("KeyStoreURL");
        String keyStorePwd = this.config.getKeyStoreAuthValue("KeyStorePass");
        String trustStoreUrl = this.config.getKeyStoreAuthValue("TrustStoreURL");
        String trustStorePwd = this.config.getKeyStoreAuthValue("TrustStorePass");
        String sslKeyStoreUrl = this.config.getKeyStoreAuthValue("SSLKeyStoreURL");
        String sslKeyStorePwd = this.config.getKeyStoreAuthValue("TrustStorePass");

        this.keyStoreSSL = new StoreBean();
        this.keyStoreSSL.setAlias(alias);
        this.keyStoreSSL.setStoreFilePath(KeyStoreUtil.getKeystorePath(sslKeyStoreUrl));
        this.keyStoreSSL.setStorePwd(sslKeyStorePwd);

        this.trustStore = new StoreBean();
        this.trustStore.setStoreFilePath(KeyStoreUtil.getKeystorePath(trustStoreUrl));
        this.trustStore.setStorePwd(trustStorePwd);

        try {
            KeyStore keyStore = KeyStoreUtil.loadKeyStore(keyStoreUrl, keyStorePwd);
            X509Certificate x509Certificate = (X509Certificate) keyStore.getCertificate(alias);
            Key key = keyStore.getKey(alias, keyStorePwd.toCharArray());

            this.clientCredential = new ClientCredential();
            //TODO: Fix this
            //this.clientCredential.setCertificate(x509Certificate);
            //this.clientCredential.setPrivateKey((PrivateKey) key);
        } catch (Exception e) {
            throw new ConfigurationException(e.getMessage(), e);
        }
    }
}