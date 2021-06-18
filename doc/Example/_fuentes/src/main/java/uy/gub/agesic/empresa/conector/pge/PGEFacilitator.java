package uy.gub.agesic.empresa.conector.pge;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.StringReader;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.soap.SOAPException;
import javax.xml.stream.XMLStreamException;
import javax.xml.transform.TransformerException;
import org.apache.axis.message.SOAPHeaderElement;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.InputSource;

import uy.gub.agesic.pge.beans.SAMLAssertion;
import uy.gub.agesic.pge.beans.STSResponse;
import uy.gub.agesic.pge.client.PGEClient;
import uy.gub.agesic.pge.client.PGEClientBasic;
import uy.gub.agesic.pge.client.PGEClientCache;
import uy.gub.agesic.pge.exceptions.RequestSecurityTokenException;
import uy.gub.agesic.pge.pojos.Configuration;
import uy.gub.agesic.pge.pojos.Connector;
import uy.gub.agesic.pge.pojos.RoleOperation;

public class PGEFacilitator {
	Logger logger = LoggerFactory.getLogger(PGEFacilitator.class);

	private static final String WS_SECURITY_PART_FORMAT		= "<wsse:Security  xmlns:wsse='http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd'>%s</wsse:Security>";
	private static final String WS_ADDRESSING_ACTION_PART_FORMAT	= "<wsa:Action xmlns:wsa='http://www.w3.org/2005/08/addressing'>%s</wsa:Action>";
	private static final String WS_ADDRESSING_TO_PART_FORMAT	= "<wsa:To xmlns:wsa='http://www.w3.org/2005/08/addressing'>%s</wsa:To>";
	private static final String WS_SECURED_HEADER_PART = "<header><wsse:Security  xmlns:wsse='http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd'></wsse:Security></header>";
	
	public void addWSSecurity(org.apache.axis.client.Stub stub, String servicio) throws SOAPException, TransformerException {
		String wsaTo = Config.GetValuePGE(servicio, Config.WS_WSA_TO);
		String wsaAction = Config.GetValuePGE(servicio, Config.WS_WSA_ACTION);
		String stsService = Config.GetValuePGE(servicio, Config.WS_SERVICE);
		
		Element assertion = getWSSecurity(servicio,wsaTo,wsaAction, stsService);
		for (int i=0; i<assertion.getChildNodes().getLength(); i++) 
		{ 
		    Element e = (Element)assertion.getChildNodes().item(i);
		    SOAPHeaderElement header0 = new SOAPHeaderElement(e);
	        stub.setHeader(header0);
	    }
		
	}
	
	private Element getWSSecurity(String servicio, String wsaTo, String wsaAction, String stsService) {
		// TODO Implement your mediation logic here
		boolean exito = false;
		
		logger.debug("+++++++++++++++++Comenzando firma SOAP ++++++++++++++++++");
		
		if (wsaTo == null || wsaAction == null || stsService == null) {
			return null;
		}
	
		String saml1Property = Config.GetValuePGE(Config.SAML_PROPERTY);
		String stsURL = Config.GetValuePGE(Config.STS_URL);
		String stsIssuer = Config.GetValuePGE(Config.STS_ISSUER);
		String stsPolicyName = Config.GetValuePGE(Config.STS_POLICY_NAME);
		String stsRole = Config.GetValuePGE(servicio + "."+ Config.WS_STS_ROLE);
		if(stsRole == null || stsRole == "")
			stsRole = Config.GetValuePGE(Config.STS_ROLE);
		String stsUserName = Config.GetValuePGE(servicio + "."+ Config.WS_STS_USERNAME);
		if(stsUserName == null || stsUserName == "")
			stsUserName = Config.GetValuePGE(Config.STS_USERNAME);
		
		//String stsService = Config.GetValuePGE(Config.STS_SERVICE);
		
		String stsSecurityActor = Config.GetValuePGE(Config.STS_SECURITY_ACTOR);
		String stsKeyStoreFilePath = Config.GetValuePGE(Config.STS_KEYSTORE_FILEPATH);
		String stsKeyStorePass = Config.GetValuePGE(Config.STS_KEYSTORE_PASS);
		String stsKeyStoreCertAlias = Config.GetValuePGE(Config.STS_KEYSTORE_ALIAS);

		String sslClientKeyStoreFilePath = Config.GetValuePGE(Config.SSL_CLIENT_KEYSTORE_FILEPATH);
		String sslClientKeyStorePass = Config.GetValuePGE(Config.SSL_CLIENT_KEYSTORE_PASS);
		String sslClientKeyStoreCertAlias = Config.GetValuePGE(Config.SSL_CLIENT_KEYSTORE_ALIAS);

		String sslTrustStorePass = Config.GetValuePGE(Config.SSL_TRUSTSTORE_PASS);
		String sslTrustStoreFilePath = Config.GetValuePGE(Config.SSL_TRUSTSTORE_FILEPATH);

		logger.debug("lectura de configuración finalizada");
		Element security = null;
		try {
			security = getWSSecuritySOAP(wsaTo, wsaAction, saml1Property, stsURL, stsIssuer, stsPolicyName,
					stsRole, stsUserName, stsService, stsSecurityActor, stsKeyStoreFilePath, stsKeyStorePass,
					stsKeyStoreCertAlias, sslClientKeyStoreFilePath, sslClientKeyStorePass, sslClientKeyStoreCertAlias,
					sslTrustStoreFilePath, sslTrustStorePass);
		} catch (XMLStreamException e) {
			logger.error(e.getMessage());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			logger.error(e.getMessage());
		}
		logger.debug("----------------Finalizando firma SOAP--------------");
		return security;
	}
	
	public Element getWSSecuritySOAP(String wsaTo, String wsaAction, String saml1Property, String stsURL, 
			String stsIssuer, String stsPolicyName, String stsRole, String stsUserName, String stsService, String stsSecurityActor, 
			String stsKeyStoreFilePath, String stsKeyStorePass, String stsKeyStoreCertAlias, String sslClientKeyStoreFilePath, 
			String sslClientKeyStorePass, String sslClientKeyStoreCertAlias, String sslTrustStoreFilePath, String sslTrustStorePass) throws XMLStreamException, KeyStoreException, FileNotFoundException, RequestSecurityTokenException, KeyManagementException, UnrecoverableKeyException, NoSuchAlgorithmException{
		
		Configuration config = new Configuration(stsKeyStoreCertAlias, stsKeyStorePass, stsKeyStorePass, sslTrustStorePass,
				stsKeyStoreFilePath,sslClientKeyStoreFilePath,sslTrustStoreFilePath);
		RoleOperation role = new RoleOperation();
		role.setRole(stsRole);
		role.setWsaAction(wsaAction);
		role.setSoapVersion("1.1");
		Connector connector = new Connector(role, wsaTo,stsUserName, stsIssuer,false,false,"");
		CloseableHttpClient httpClient = new DefaultHttpClient();
		KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
		FileInputStream instream = new FileInputStream(new File(sslClientKeyStoreFilePath));
		try{
			keyStore.load(instream, sslClientKeyStorePass.toCharArray());
		}catch(NoSuchAlgorithmException e){
			logger.error(e.getMessage());
		}catch(CertificateException e){
			logger.error(e.getMessage());
		} catch (IOException e) {
			logger.error(e.getMessage());
		}finally{
			try{
				instream.close();
			}catch(Exception ignore){
				logger.error(ignore.getMessage());
			}
		}

		KeyStore trustStore = KeyStore.getInstance(KeyStore.getDefaultType());
		instream = new FileInputStream(new File(sslTrustStoreFilePath));
		try{
			trustStore.load(instream, sslTrustStorePass.toCharArray());
		}catch(NoSuchAlgorithmException e){
			logger.error(e.getMessage());
		}catch(CertificateException e){
			logger.error(e.getMessage());
		} catch (IOException e) {
			logger.error(e.getMessage());
		}finally{
			try{
				instream.close();
			}catch(Exception ignore){
				logger.error(ignore.getMessage());
			}
		}

		SSLSocketFactory socketFactory = new SSLSocketFactory(keyStore, sslClientKeyStorePass, trustStore);
		Scheme sch = new Scheme("https", 443, socketFactory);
		httpClient.getConnectionManager().getSchemeRegistry().register(sch);

		PGEClient client = new PGEClientCache(new PGEClientBasic());
		STSResponse stsResponse = client.requestSecurityToken(config, connector, stsPolicyName, stsURL, httpClient);
		Document d = convertStringToXMLDocument(WS_SECURED_HEADER_PART);
		Element header = (Element)d.getDocumentElement();
		header.getFirstChild().appendChild(d.importNode(stsResponse.getAssertion().getDOM(),true));
		header.appendChild(d.importNode(convertStringToXMLDocument(getWSAddressingToPart(wsaTo)).getDocumentElement(),true));
		header.appendChild(d.importNode(convertStringToXMLDocument(getWSAddressingActionPart(wsaAction)).getDocumentElement(),true));
		logger.debug("soap assertion obtenido");
		return (Element) d.getDocumentElement();
	}
	
	public static Document convertStringToXMLDocument(String xmlString) 
    {
        //Parser that produces DOM object trees from XML content
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
         
        //API to obtain DOM Document instance
        DocumentBuilder builder = null;
        try
        {
            //Create DocumentBuilder with default configuration
            builder = factory.newDocumentBuilder();
             
            //Parse the content to Document object
            Document doc = builder.parse(new InputSource(new StringReader(xmlString)));
            return doc;
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
        return null;
    }
	
	public String getWSSecurityPart(SAMLAssertion assertion, String actor){
		return String.format(WS_SECURITY_PART_FORMAT,  assertion.toString());
	}

	public String getWSAddressingToPart(String to){
		return String.format(WS_ADDRESSING_TO_PART_FORMAT, to);

	}
	
	public String getWSAddressingActionPart(String action){
		return String.format(WS_ADDRESSING_ACTION_PART_FORMAT,action);

	}

}