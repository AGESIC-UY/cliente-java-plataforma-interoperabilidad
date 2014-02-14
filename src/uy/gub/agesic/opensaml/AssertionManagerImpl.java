package uy.gub.agesic.opensaml;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.StringReader;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.X509CRL;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.log4j.Logger;
import org.joda.time.DateTime;
import org.opensaml.Configuration;
import org.opensaml.DefaultBootstrap;
import org.opensaml.common.IdentifierGenerator;
import org.opensaml.common.SAMLObjectBuilder;
import org.opensaml.common.SAMLVersion;
import org.opensaml.common.impl.SecureRandomIdentifierGenerator;
import org.opensaml.common.xml.SAMLConstants;
import org.opensaml.saml1.core.Assertion;
import org.opensaml.saml1.core.Attribute;
import org.opensaml.saml1.core.AttributeStatement;
import org.opensaml.saml1.core.AttributeValue;
import org.opensaml.saml1.core.AuthenticationStatement;
import org.opensaml.saml1.core.Conditions;
import org.opensaml.saml1.core.ConfirmationMethod;
import org.opensaml.saml1.core.NameIdentifier;
import org.opensaml.saml1.core.Subject;
import org.opensaml.saml1.core.SubjectConfirmation;
import org.opensaml.xml.ConfigurationException;
import org.opensaml.xml.XMLObjectBuilder;
import org.opensaml.xml.XMLObjectBuilderFactory;
import org.opensaml.xml.io.Marshaller;
import org.opensaml.xml.io.MarshallerFactory;
import org.opensaml.xml.io.MarshallingException;
import org.opensaml.xml.io.Unmarshaller;
import org.opensaml.xml.io.UnmarshallerFactory;
import org.opensaml.xml.io.UnmarshallingException;
import org.opensaml.xml.parse.BasicParserPool;
import org.opensaml.xml.parse.XMLParserException;
import org.opensaml.xml.schema.XSString;
import org.opensaml.xml.security.SecurityHelper;
import org.opensaml.xml.security.credential.Credential;
import org.opensaml.xml.security.keyinfo.KeyInfoHelper;
import org.opensaml.xml.security.x509.BasicX509Credential;
import org.opensaml.xml.signature.KeyInfo;
import org.opensaml.xml.signature.Signature;
import org.opensaml.xml.signature.SignatureConstants;
import org.opensaml.xml.signature.SignatureException;
import org.opensaml.xml.signature.Signer;
import org.opensaml.xml.signature.X509Data;
import org.opensaml.xml.signature.impl.KeyInfoBuilder;
import org.opensaml.xml.util.XMLHelper;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import uy.gub.agesic.AgesicConstants;
import uy.gub.agesic.AssertionManager;
import uy.gub.agesic.beans.ClientCredential;
import uy.gub.agesic.beans.RSTBean;
import uy.gub.agesic.beans.SAMLAssertion;
import uy.gub.agesic.beans.StoreBean;
import uy.gub.agesic.exceptions.AssertionException;
import uy.gub.agesic.exceptions.NoAssertionFoundException;
import uy.gub.agesic.exceptions.ParserException;
import uy.gub.agesic.exceptions.UnmarshalException;

/**
 * 
 */

/**
 * A SAML Assertion Generator
 * 
 * @author Guzmán Llambías
 *
 */
public class AssertionManagerImpl implements AssertionManager {

	private static X509Certificate x509Certificate;
	private static final Logger log = Logger.getLogger(AssertionManagerImpl.class);

	@SuppressWarnings("unused")
	private boolean trustCredential(ClientCredential signingCredential, StoreBean trustStore) {
		return true;
		
		/*
		String trustStoreFilePath = trustStore.getStoreFilePath();
		String trustStorePwd = trustStore.getStorePwd();
		X509Credential credential = (X509Credential)signingCredential.getCredential();
		X509Certificate x509Cert = credential.getEntityCertificate();
		
		File trustStoreFile = new File(trustStoreFilePath);
		FileInputStream keyStoreFis;
		
		try {
			keyStoreFis = new FileInputStream(trustStoreFile);
			KeyStore keyStore = KeyStore.getInstance("JKS");
			keyStore.load(keyStoreFis, trustStorePwd.toCharArray());
			String alias = keyStore.getCertificateAlias(x509Cert);
			if (alias == null)
				return false;
			else return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
		*/
		
	}
	
	/* (non-Javadoc)
	 * @see uy.gub.agesic.AssertionGenerator#isValidSignature(org.opensaml.saml1.core.Assertion, org.opensaml.xml.security.credential.Credential)
	 */
	public boolean isValidSignature(SAMLAssertion samlAssertion, ClientCredential signingCredential, StoreBean trustStore){
		//TODO Finish
		return true;
		/*
		if (!trustCredential(signingCredential, trustStore))
			return false;			
		
		Assertion assertion = samlAssertion.getAssertion();
		Credential credential = signingCredential.getCredential();
		
		SignatureValidator sigValidator = new SignatureValidator(credential);
		try {
			sigValidator.validate(assertion.getSignature());
			log.info("Signature is valid!");
			return true;
		} catch (ValidationException e) {
			log.error("Signature not valid!");
			e.printStackTrace();
			return false;
		}
		*/	
	}

	@SuppressWarnings("unchecked")
	private Subject getSubjectForSignedToken(String role,
			XMLObjectBuilderFactory builderFactory) {

		// Create the NameIdentifier
		SAMLObjectBuilder nameIdBuilder = (SAMLObjectBuilder) builderFactory
				.getBuilder(NameIdentifier.DEFAULT_ELEMENT_NAME);
		NameIdentifier nameId = (NameIdentifier) nameIdBuilder.buildObject();
		nameId.setNameIdentifier(role);
		nameId.setFormat(NameIdentifier.EMAIL);

		// Create the SubjectConfirmation
		SAMLObjectBuilder confirmationMethodBuilder = (SAMLObjectBuilder) builderFactory
				.getBuilder(ConfirmationMethod.DEFAULT_ELEMENT_NAME);
		ConfirmationMethod confirmationMethod = (ConfirmationMethod) confirmationMethodBuilder
				.buildObject();
		confirmationMethod.setConfirmationMethod(AgesicConstants.SAML10_BEARER_CONFIRMATION_METHOD);

		SAMLObjectBuilder subjectConfirmationBuilder = (SAMLObjectBuilder) builderFactory
				.getBuilder(SubjectConfirmation.DEFAULT_ELEMENT_NAME);
		SubjectConfirmation subjectConfirmation = (SubjectConfirmation) subjectConfirmationBuilder
				.buildObject();
		subjectConfirmation.getConfirmationMethods().add(confirmationMethod);

		// Create the Subject
		SAMLObjectBuilder subjectBuilder = (SAMLObjectBuilder) builderFactory
				.getBuilder(Subject.DEFAULT_ELEMENT_NAME);
		Subject subject = (Subject) subjectBuilder.buildObject();

		subject.setNameIdentifier(nameId);
		subject.setSubjectConfirmation(subjectConfirmation);

		return subject;
	}
	
	/* (non-Javadoc)
	 * @see uy.gub.agesic.AssertionManager#getCredentialFromAssertion(uy.gub.agesic.beans.SAMLAssertion)
	 */
	public ClientCredential getCredentialFromAssertion(SAMLAssertion samlAssertion){
		Assertion assertion = samlAssertion.getAssertion();

		Signature signature = assertion.getSignature();
		KeyInfo keyInfo = signature.getKeyInfo();
		List<X509Data> x509DataList = keyInfo.getX509Datas();
		//TODO Hacerlo genérico
		X509Data x509Data = x509DataList.get(0);
		List<org.opensaml.xml.signature.X509Certificate> x509Certs = x509Data.getX509Certificates();
		
		if (x509Certs.size() > 1){
			log.warn("The Assertion has more than one certificate.");
		}
		
		org.opensaml.xml.signature.X509Certificate x509Cert = x509Certs.get(0);
		String base64Cert = x509Cert.getValue();
		
		X509Certificate x509Cert2 =null ;
		try {
			x509Cert2 = SecurityHelper.buildJavaX509Cert(base64Cert);
			
		} catch (CertificateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Build the OpenSAML credential
		BasicX509Credential credential = new BasicX509Credential();
		//TODO Ver que pasa con los certificados revocados!
		Collection<java.security.cert.X509CRL> crls = new ArrayList<X509CRL>();
		credential.setEntityCertificate(x509Cert2);
		credential.setCRLs(crls);
		credential.setPublicKey(x509Cert2.getPublicKey());		
		
		//Wrap it in a PGE ClientCredential
		ClientCredential result = new ClientCredential();
		result.setCredential(credential);
		return result;
		
	}
	
	
	/* (non-Javadoc)
	 * @see uy.gub.agesic.AssertionGenerator#generateSignedAssertion(org.opensaml.xml.security.credential.Credential, uy.gub.agesic.beans.RSTBean)
	 */
	@SuppressWarnings("unchecked")
	public SAMLAssertion generateSignedAssertion(
			ClientCredential signingCredential, RSTBean bean) throws AssertionException {

		Credential credential = signingCredential.getCredential();
		
		DateTime authenticationInstant = new DateTime();
		DateTime issueInstant = new DateTime();
		//DateTime conditionTimeNotBefore = new DateTime();
		DateTime conditionTimeNotBefore = new DateTime().minusMinutes(15);
		//DateTime conditionTimeNotAfter = new DateTime().plusHours(2);
		DateTime conditionTimeNotAfter = new DateTime().plusMinutes(15);
		
		//SAML User Info
		String strIssuer = bean.getIssuer();
		String strRole = bean.getRole();
		String strPolicyName = bean.getPolicyName();
		String userName = bean.getUserName();		

		try {

			DefaultBootstrap.bootstrap();
			XMLObjectBuilderFactory builderFactory = Configuration.getBuilderFactory();

			// Create authentication statement subject
			Subject authStatementSubject = getSubjectForSignedToken(strRole, builderFactory);

			// Create Authentication Statement
			SAMLObjectBuilder authStatementBuilder = (SAMLObjectBuilder) builderFactory
					.getBuilder(AuthenticationStatement.DEFAULT_ELEMENT_NAME);
			AuthenticationStatement authnStatement = (AuthenticationStatement) authStatementBuilder
					.buildObject();
			authnStatement.setSubject(authStatementSubject);
			authnStatement.setAuthenticationMethod(AgesicConstants.SAML10_PASSWD_AUTH_METHOD);
			authnStatement.setAuthenticationInstant(authenticationInstant);

			// Create the attribute statement
			SAMLObjectBuilder attrBuilder = (SAMLObjectBuilder) builderFactory
					.getBuilder(Attribute.DEFAULT_ELEMENT_NAME);
			Attribute attrGroups = (Attribute) attrBuilder.buildObject();
			attrGroups.setAttributeName(AgesicConstants.USER_ATTRIBUTE_NAME);
			attrGroups.setAttributeNamespace(strPolicyName);

			XMLObjectBuilder stringBuilder = builderFactory
					.getBuilder(XSString.TYPE_NAME);
			XSString attrNewValue = (XSString) stringBuilder.buildObject(
					AttributeValue.DEFAULT_ELEMENT_NAME, XSString.TYPE_NAME);
			attrNewValue.setValue(userName);

			attrGroups.getAttributeValues().add(attrNewValue);

			SAMLObjectBuilder attrStatementBuilder = (SAMLObjectBuilder) builderFactory
					.getBuilder(AttributeStatement.DEFAULT_ELEMENT_NAME);
			AttributeStatement attrStatement = (AttributeStatement) attrStatementBuilder
					.buildObject();
			attrStatement.getAttributes().add(attrGroups);

			Subject attrSubject = getSubjectForSignedToken(strRole,
					builderFactory);
			attrStatement.setSubject(attrSubject);

			SAMLObjectBuilder conditionsBuilder = (SAMLObjectBuilder) builderFactory
					.getBuilder(Conditions.DEFAULT_ELEMENT_NAME);
			Conditions conditions = (Conditions) conditionsBuilder
					.buildObject();

			conditions.setNotBefore(conditionTimeNotBefore);
			conditions.setNotOnOrAfter(conditionTimeNotAfter);

			// Create assertionID
			IdentifierGenerator idGenerator = new SecureRandomIdentifierGenerator();
			String strAssertionID = idGenerator.generateIdentifier();

			// Create the assertion
			SAMLObjectBuilder assertionBuilder = (SAMLObjectBuilder) builderFactory
					.getBuilder(Assertion.DEFAULT_ELEMENT_NAME);
			Assertion assertion = (Assertion) assertionBuilder.buildObject();
			assertion.setIssuer(strIssuer);
			assertion.setIssueInstant(issueInstant);
			assertion.setVersion(SAMLVersion.VERSION_10);

			assertion.getAuthenticationStatements().add(authnStatement);
			assertion.getAttributeStatements().add(attrStatement);
			assertion.setConditions(conditions);

			//Create signature
			Signature signature = (Signature) Configuration.getBuilderFactory()
					.getBuilder(Signature.DEFAULT_ELEMENT_NAME).buildObject(
							Signature.DEFAULT_ELEMENT_NAME);

			signature.setSigningCredential(credential);
			signature
					.setSignatureAlgorithm(SignatureConstants.ALGO_ID_SIGNATURE_RSA_SHA1);
			signature
					.setCanonicalizationAlgorithm(SignatureConstants.ALGO_ID_C14N_EXCL_OMIT_COMMENTS);

			KeyInfoBuilder keyInfoBuilder = (KeyInfoBuilder) builderFactory
					.getBuilder(KeyInfo.DEFAULT_ELEMENT_NAME);
			KeyInfo keyinfo = (KeyInfo) keyInfoBuilder
					.buildObject(KeyInfo.DEFAULT_ELEMENT_NAME);
			KeyInfoHelper.addCertificate(keyinfo, x509Certificate);
			signature.setKeyInfo(keyinfo);

			assertion.setID(strAssertionID);
			assertion.setSignature(signature);

			// Get the marshaller factory
			MarshallerFactory marshallerFactory = Configuration.getMarshallerFactory();

			// Get the Subject marshaller and generate assertion's dom representation
			Marshaller marshaller = marshallerFactory.getMarshaller(assertion);			
			Element element = marshaller.marshall(assertion);

			//Sign SAML Assertion
			Signer.signObject(signature);

			// Print the assertion to standard output
			log.info("Assertion succesfully created");
			log.debug(XMLHelper.prettyPrintXML(element));

			SAMLAssertion samlAssertion = new SAMLAssertion();
			samlAssertion.setAssertion(assertion);

			return samlAssertion;

		}catch (SignatureException e) {
			e.printStackTrace();
			throw new AssertionException("An error ocurred while trying to sign the assertion: "+e.getMessage(), e);
		} catch (MarshallingException e) {
			e.printStackTrace();
			throw new AssertionException("An error ocurred while trying to marshall the assertion: "+e.getMessage(), e);
		} catch (CertificateEncodingException e) {
			e.printStackTrace();
			throw new AssertionException("An internal encoding error ocurred while trying to create the assertion: "+e.getMessage(), e);
		} catch (ConfigurationException e) {
			e.printStackTrace();
			throw new AssertionException("A configuration error ocurred with the bootstrap configuration: "+e.getMessage(), e);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
			throw new AssertionException("An error ocurred while trying to generate the UUID for the assertion: "+e.getMessage(), e);
		}
	}

	
	/* (non-Javadoc)
	 * @see uy.gub.agesic.AssertionGenerator#getCredential(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	 */
	public ClientCredential getCredential(String keyStorePwd,
			String keyStoreFilePath, String alias) throws KeyStoreException, NoSuchAlgorithmException, CertificateException, IOException, UnrecoverableKeyException {
		
		File keyStoreFile = new File(keyStoreFilePath);
		FileInputStream keyStoreFis;
		
		keyStoreFis = new FileInputStream(keyStoreFile);
		KeyStore keyStore = KeyStore.getInstance("JKS");
		keyStore.load(keyStoreFis, keyStorePwd.toCharArray());
		x509Certificate = (java.security.cert.X509Certificate) keyStore
				.getCertificate(alias);
		java.security.Key key = keyStore.getKey(alias, keyStorePwd.toCharArray());
		BasicX509Credential credential = new BasicX509Credential();
		credential.setEntityCertificate(x509Certificate);
		//TODO Ver que pasa con los certificados revocados!
		Collection<java.security.cert.X509CRL> crls = new ArrayList<X509CRL>();
		credential.setCRLs(crls);
		credential.setPrivateKey((PrivateKey) key);
		credential.setPublicKey(x509Certificate.getPublicKey());
		credential.getKeyNames().add(alias);
		
		ClientCredential result = new ClientCredential();
		result.setCredential(credential);
		return result;
		
	}
	
	/* (non-Javadoc)
	 * @see uy.gub.agesic.AssertionGenerator#getAssertionFromSOAP(java.lang.String)
	 */
	public SAMLAssertion getAssertionFromSOAP(String string) throws NoAssertionFoundException, UnmarshalException, ParserException{
		
		// Get parser pool manager
		BasicParserPool ppMgr = new BasicParserPool();
		ppMgr.setNamespaceAware(true);

		// Parse string message
		StringReader in2 = new StringReader(string);
		Document doc = null;
		
		try {
			doc = ppMgr.parse(in2);
			
		} catch (XMLParserException e) {
			e.printStackTrace();
			throw new ParserException(e.getMessage());
		}
		NodeList assertionList = doc.getElementsByTagNameNS(SAMLConstants.SAML1_NS, "Assertion");
		
		if (assertionList.getLength() == 0){
			throw new NoAssertionFoundException();
		}
		
		if (assertionList.getLength() > 1){
			log.warn("More than one assertion found in message");
		}
		
		Element samlNode = (Element)assertionList.item(0);

		// Get apropriate unmarshaller
		UnmarshallerFactory unmarshallerFactory = Configuration.getUnmarshallerFactory();
		Unmarshaller unmarshaller = unmarshallerFactory.getUnmarshaller(samlNode);
		
		Assertion assertion;
		try {
			assertion = (Assertion)unmarshaller.unmarshall(samlNode);
			
		} catch (UnmarshallingException e) {
			e.printStackTrace();
			throw new UnmarshalException(e.getMessage());
		}
		SAMLAssertion samlAssertion = new SAMLAssertion();
		samlAssertion.setAssertion(assertion);
		return samlAssertion;
		
	}	
	
}
