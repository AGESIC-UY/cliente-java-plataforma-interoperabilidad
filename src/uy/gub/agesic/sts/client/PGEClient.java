/**
 * 
 */
package uy.gub.agesic.sts.client;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.log4j.Logger;
import org.jboss.wsf.common.utils.UUIDGenerator;
import org.w3c.dom.Element;

import uy.gub.agesic.AgesicConstants;
import uy.gub.agesic.AssertionManager;
import uy.gub.agesic.PGEFactory;
import uy.gub.agesic.XMLUtils;
import uy.gub.agesic.beans.ClientCredential;
import uy.gub.agesic.beans.RSTBean;
import uy.gub.agesic.beans.SAMLAssertion;
import uy.gub.agesic.beans.StoreBean;
import uy.gub.agesic.exceptions.AssertionException;
import uy.gub.agesic.exceptions.MarshalException;
import uy.gub.agesic.exceptions.NoAssertionFoundException;
import uy.gub.agesic.exceptions.ParserException;
import uy.gub.agesic.exceptions.RequestSecurityTokenException;
import uy.gub.agesic.exceptions.UnmarshalException;

/**
 * @author Guzman Llambias
 * 
 */
public class PGEClient {

	private static final Logger log = Logger.getLogger(PGEClient.class);
	
	/**
	 * Create a RequestSecurityToken (RST) message using a
	 * {@link SAMLAssertion} and the {@link RSTBean} information.
	 * 
	 * @param rstBean
	 *            the information to build the RST message (eg. service,
	 *            policyName, user role, etc)
	 * @param assertion
	 *            the assertion to put in the message
	 * @return A string representation of the RST message
	 * @throws RequestSecurityTokenException 
	 */
	private String createRequestSecurityTokenMessage(RSTBean rstBean,
			SAMLAssertion assertion) throws RequestSecurityTokenException {

		String messageID = UUIDGenerator.generateRandomUUIDString();
		String policyName = rstBean.getPolicyName();
		String role = rstBean.getRole();
		String service = rstBean.getService();

		// Get a valid string representation of the Assertion
		Element elem = assertion.getDOM();
		String strSaml;
		try {
			strSaml = XMLUtils.xmlToString(elem);
		} catch (MarshalException e) {
			e.printStackTrace();
			throw new RequestSecurityTokenException("Could not create RST message.");
		}

		String soapMessagePartOne = "<s:Envelope xmlns:a=\"http://www.w3.org/2005/08/addressing\" xmlns:s=\"http://schemas.xmlsoap.org/soap/envelope/\">"
				+ "<s:Header><a:Action s:mustUnderstand=\"1\">http://schemas.xmlsoap.org/ws/2005/02/trust/Issue</a:Action>"
				+ "<a:MessageID>urn:uuid:"
				+ messageID
				+ "</a:MessageID>"
				+ "</s:Header><s:Body><RequestSecurityToken xmlns=\"http://schemas.xmlsoap.org/ws/2005/02/trust\">"
				+ "<TokenType>http://docs.oasis-open.org/wss/oasis-wss-saml-token-profile-1.1#SAMLV1.1</TokenType>"
				+ "<AppliesTo xmlns=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><a:EndpointReference>"
				+ "<a:Address>"
				+ service
				+ "</a:Address></a:EndpointReference></AppliesTo>"
				+ "<RequestType>http://schemas.xmlsoap.org/ws/2005/02/trust/Issue</RequestType><Issuer>"
				+ "<a:Address>" + policyName + "</a:Address></Issuer><Base>";

		String soapMessagePartTwo = "</Base><SecondaryParameters><Rol>"
				+ role
				+ "</Rol></SecondaryParameters></RequestSecurityToken></s:Body></s:Envelope>";
		
		return soapMessagePartOne + strSaml + soapMessagePartTwo;
		
	}
	/**
	 * Send a RequestSecurityToken (RST) message to the PGE using a {@link RSTBean}, a keyStore and a trustStore
	 * @param bean an RST bean with the client request information
	 * @param keyStore the keyStore information
	 * @param trustStore the trustStore information
	 * @return The {@link SAMLAssertion} sent by the STS of the PGE
	 * @throws RequestSecurityTokenException The message could not be correctly sent to the STS or the STS threw an error message.
	 */
	public SAMLAssertion requestSecurityToken(RSTBean bean, StoreBean keyStoreOrg, StoreBean keyStoreSSL, StoreBean trustStoreSSL)
	throws RequestSecurityTokenException {
		return requestSecurityToken(bean, keyStoreOrg, keyStoreSSL, trustStoreSSL, AgesicConstants.STS_URL_SSL);
	}

	/**
	 * Send a RequestSecurityToken (RST) message to the PGE using a {@link RSTBean}, a keyStore and a trustStore
	 * @param bean an RST bean with the client request information
	 * @param keyStore the keyStore information
	 * @param trustStore the trustStore information
	 * @param urlStsSsl the URL for the STS server
	 * @return The {@link SAMLAssertion} sent by the STS of the PGE
	 * @throws RequestSecurityTokenException The message could not be correctly sent to the STS or the STS threw an error message.
	 */
	public SAMLAssertion requestSecurityToken(RSTBean bean, StoreBean keyStoreOrg, StoreBean keyStoreSSL, StoreBean trustStoreSSL, String urlStsSsl)
			throws RequestSecurityTokenException {

		//HttpsURLConnection httpsConn = null;
		
		HostnameVerifier hv = new HostnameVerifier() {
		    public boolean verify(String urlHostName, SSLSession session) {
		        if (urlHostName.equals(session.getPeerHost()))
		        	return true;
		        else return false;
		    }
		};
		
		HttpsURLConnection.setDefaultHostnameVerifier(hv);
		
		String SOAPUrl = urlStsSsl;
		String SOAPAction = AgesicConstants.SOAPAction;

		String alias = keyStoreOrg.getAlias();
		String storeFilePath = keyStoreOrg.getStoreFilePath();
		String password = keyStoreOrg.getStorePwd();
		
		AssertionManager generator = PGEFactory.getAssertionManager();
		
		//Get Client Credential
		ClientCredential credential;
		try {
			credential = generator.getCredential(password, storeFilePath, alias);
			
		} catch (KeyStoreException e1) {
			e1.printStackTrace();
			throw new RequestSecurityTokenException(e1);
		} catch (NoSuchAlgorithmException e1) {
			e1.printStackTrace();
			throw new RequestSecurityTokenException(e1);
		} catch (CertificateException e1) {
			e1.printStackTrace();
			throw new RequestSecurityTokenException(e1);
		} catch (UnrecoverableKeyException e1) {
			e1.printStackTrace();
			throw new RequestSecurityTokenException(e1);
		} catch (IOException e1) {
			e1.printStackTrace();
			throw new RequestSecurityTokenException(e1);
		}
		
		//Build signed Assertion
		SAMLAssertion samlAssertion;
		try {
			samlAssertion = generator.generateSignedAssertion(credential, bean);
		} catch (AssertionException e) {
			e.printStackTrace();
			throw new RequestSecurityTokenException(e);
		}

		String requestSecurityTokenMessage = createRequestSecurityTokenMessage(bean, samlAssertion);
		
		String requestSecurityTokenResponseMessage = requestStsHttpComponents(SOAPUrl, SOAPAction, requestSecurityTokenMessage, keyStoreSSL, trustStoreSSL);		
//		String requestSecurityTokenResponseMessage = requestSts(SOAPUrl, SOAPAction, requestSecurityTokenMessage);		

		log.info("Building Assertion from RequestSecurityTokenResponse message");
		
		//Build the assertion from response message
		SAMLAssertion assertionResponse;
		try {
			AssertionManager assertionBuilder = PGEFactory.getAssertionManager();
			assertionResponse = assertionBuilder.getAssertionFromSOAP(requestSecurityTokenResponseMessage);
			
			log.info("Assertion was built successfully");
			log.debug(assertionResponse.toString());
			
		} catch (ParserException e) {
			e.printStackTrace();
			throw new RequestSecurityTokenException("Unable to parse RequestSecurityTokenResponse message");
		} catch (NoAssertionFoundException e) {
			e.printStackTrace();
			throw new RequestSecurityTokenException("No assertion was found");
		} catch (UnmarshalException e) {
			e.printStackTrace();
			throw new RequestSecurityTokenException("Unmarshal error: Cannot build assertion from RequestSecurityTokenResponse message");
		}			
		
		log.warn("SAML Signature of RSTR not validated yet!");
		/*
		 * log.info("Validating assertion signature");
		ClientCredential samlAssertionCredential = generator.getCredentialFromAssertion(assertionResponse);
		boolean isValid = generator.isValidSignature(samlAssertion, samlAssertionCredential, trustStore);
		if (isValid){
			log.info("Signature validated successfully");
			return assertionResponse;
		}
		else throw new RequestSecurityTokenException("The assertion received has an invalid signature");
		*/
		
		return assertionResponse;

	}	
	
	@SuppressWarnings("unused")
	private String requestSts(String SOAPUrl, String SOAPAction, String requestSecurityTokenMessage) throws RequestSecurityTokenException {
		URL url;
		URLConnection connection;
		URLConnection httpConn;
		
		boolean isHttps = SOAPUrl.startsWith("https://");
		
		
		// Create the Http connection
		try {
			url = new URL(SOAPUrl);
			connection = url.openConnection();
			if (isHttps) {
				httpConn = (HttpsURLConnection) connection;
			} else {
				httpConn = (HttpURLConnection) connection;
			}
			httpConn.setRequestProperty("Content-Type", "text/xml; charset=utf-8");
			httpConn.setRequestProperty("SOAPAction", SOAPAction);
			if (isHttps) {
				((HttpsURLConnection) httpConn).setRequestMethod("POST");
			} else {
				((HttpURLConnection) httpConn).setRequestMethod("POST");
			}
			httpConn.setDoOutput(true);
			httpConn.setDoInput(true);
			
		} catch (MalformedURLException e) {
			// This Exception would never happen. 
			//If it happen the STS address was changed.
			log.error("Wrong STS Address");
			e.printStackTrace();
			throw new RequestSecurityTokenException("The STS address is not correct.");
		} catch (IOException e) {
			e.printStackTrace();
			throw new RequestSecurityTokenException(e);
		}
		
		log.info("Sending RequestSecurityToken message.");
		log.debug(requestSecurityTokenMessage);		
		
		// Send SOAP Message
		OutputStream out;
		try {
			out = httpConn.getOutputStream();
			out.write(requestSecurityTokenMessage.getBytes());
			out.close();

		} catch (IOException e) {
			e.printStackTrace();
			throw new RequestSecurityTokenException(e);
		}

		log.info("Receiving RequestSecurityTokenResponse message");
		
		//Get the requestSecurityTokenResponse message 
		String requestSecurityTokenResponseMessage;
		try {
			InputStreamReader isr = new InputStreamReader(httpConn.getInputStream());
			BufferedReader in = new BufferedReader(isr);

			String inputLine;
			StringBuffer stringBuffer = new StringBuffer();
			while ((inputLine = in.readLine()) != null)
				stringBuffer.append(inputLine);
			
			in.close();
			
			requestSecurityTokenResponseMessage = stringBuffer.toString();
			log.debug(requestSecurityTokenResponseMessage);
		
		} catch (IOException e) {
			e.printStackTrace();
			throw new RequestSecurityTokenException(e);
		}
		
		return requestSecurityTokenResponseMessage;

	}

	private String requestStsHttpComponents(String SOAPUrl, String SOAPAction, String requestSecurityTokenMessage, StoreBean keyStoreBean, StoreBean trustStoreBean) throws RequestSecurityTokenException {
		InputStream stream = null;
		DefaultHttpClient httpclient = new DefaultHttpClient();
		String requestSecurityTokenResponseMessage;
		try {
            KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
            FileInputStream instream = new FileInputStream(new File(keyStoreBean.getStoreFilePath()));
            try {
            	keyStore.load(instream, keyStoreBean.getStorePwd().toCharArray());
            } catch (NoSuchAlgorithmException e) {
				e.printStackTrace();
			} catch (CertificateException e) {
				e.printStackTrace();
			} finally {
                try { instream.close(); } catch (Exception ignore) {}
            }
			
            KeyStore trustStore = KeyStore.getInstance(KeyStore.getDefaultType());
            instream = new FileInputStream(new File(trustStoreBean.getStoreFilePath()));
            try {
                trustStore.load(instream, trustStoreBean.getStorePwd().toCharArray());
            } catch (NoSuchAlgorithmException e) {
				e.printStackTrace();
			} catch (CertificateException e) {
				e.printStackTrace();
			} finally {
                try { instream.close(); } catch (Exception ignore) {}
            }

            SSLSocketFactory socketFactory = new SSLSocketFactory(keyStore, keyStoreBean.getStorePwd(), trustStore);
            Scheme sch = new Scheme("https", 443, socketFactory);
            httpclient.getConnectionManager().getSchemeRegistry().register(sch);
			
			HttpPost httpMethod = new HttpPost(SOAPUrl);			
			httpMethod.setEntity(new StringEntity(requestSecurityTokenMessage));
			HttpResponse httpResponse = httpclient.execute(httpMethod);
			HttpEntity entity = httpResponse.getEntity();
			
			StatusLine statusLine = httpResponse.getStatusLine();
			log.info("STS response: " + statusLine);
			
			stream = entity.getContent();
			//Get the requestSecurityTokenResponse message
			InputStreamReader isr = new InputStreamReader(stream);
			BufferedReader in = new BufferedReader(isr);
	
			String inputLine;
			StringBuffer stringBuffer = new StringBuffer();
			while ((inputLine = in.readLine()) != null) {
				stringBuffer.append(inputLine);
			}
			in.close();
			
			requestSecurityTokenResponseMessage = stringBuffer.toString();
			log.debug(requestSecurityTokenResponseMessage);

			int result = statusLine.getStatusCode();
			if(result != org.apache.http.HttpStatus.SC_OK && result != org.apache.http.HttpStatus.SC_ACCEPTED) {
				throw new RequestSecurityTokenException(requestSecurityTokenResponseMessage);
			}
		} catch (IOException e) {
			e.printStackTrace();
			throw new RequestSecurityTokenException(e);
		} catch (KeyStoreException e) {
			e.printStackTrace();
			throw new RequestSecurityTokenException(e);
		} catch (KeyManagementException e) {
			e.printStackTrace();
			throw new RequestSecurityTokenException(e);
		} catch (UnrecoverableKeyException e) {
			e.printStackTrace();
			throw new RequestSecurityTokenException(e);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
			throw new RequestSecurityTokenException(e);
		} finally {
            httpclient.getConnectionManager().shutdown();
		}		
		return requestSecurityTokenResponseMessage;
	}

}
