/**
 * 
 */
package uy.gub.agesic;

import java.io.IOException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;

import uy.gub.agesic.beans.ClientCredential;
import uy.gub.agesic.beans.RSTBean;
import uy.gub.agesic.beans.SAMLAssertion;
import uy.gub.agesic.beans.StoreBean;
import uy.gub.agesic.exceptions.AssertionException;
import uy.gub.agesic.exceptions.NoAssertionFoundException;
import uy.gub.agesic.exceptions.ParserException;
import uy.gub.agesic.exceptions.UnmarshalException;

/**
 * @author Guzman Llambias
 *
 */
public interface AssertionManager {
	
	public ClientCredential getCredentialFromAssertion(SAMLAssertion assertion);
	
	/**
	 * Validates the signature of a signed SAML Assertion using a ClientCredential. 
	 * @param samlAssertion the signed {@link SAMLAssertion} to validate. 
	 * @param signingCredential the {@link ClientCredential} to validate with.
	 * @return <strong>True</strong> if the signature is valid. Otherwise, <strong>False</strong>.
	 */
	/**
	 * Validates the signature of a signed SAML Assertion using a ClientCredential.
	 * @param samlAssertion
	 * @param signingCredential
	 * @param trustStore
	 * @return
	 */
	public boolean isValidSignature(SAMLAssertion samlAssertion, ClientCredential signingCredential, StoreBean trustStore);
	
	/**
	 * Generates a signed SAML 1.0 Assertion using a ClientCredential
	 * @param bean A {@link RSTBean} with the SAML attributes 
	 * @param signingCredential A {@link ClientCredential} to sign the SAML Assertion
	 * @return A {@link SAMLAssertion} signed with the signingCredential	 
	 * @throws AssertionException if an error occurs during the creation of the signed assertion
	 */
	public SAMLAssertion generateSignedAssertion(ClientCredential signingCredential, RSTBean bean) throws AssertionException;
	
	/**
	 * Gets the first {@link SAMLAssertion} found in a SOAP message 
	 * @param string String representation of the SOAP message
	 * @return The first {@link SAMLAssertion} found in a SOAP message
	 * @throws arserException if it cannot parse the SOAP message
	 * @throws UnmarshalException if it cannot build an {@link SAMLAssertion} from the SOAP message
	 * @throws NoAssertionFoundException if no {@link SAMLAssertion} is found in the SOAP message
	 */
	public SAMLAssertion getAssertionFromSOAP(String string) throws ParserException, NoAssertionFoundException, UnmarshalException;
	
	/**
	 * Gets a ClientCredential from a Keystore
	 * 
	 * @param keyStorePwd keystore password
	 * @param keyStoreFilePath keystore file path
	 * @param alias certificate alias used in the keystore
	 * @return A {@link ClientCredential} from a keystore with the required attributes 
	 * @throws KeyStoreException if the requested keystore type is not available in the default provider package or any of the other provider packages that were searched or it wasn't loaded.
	 * @throws NoSuchAlgorithmException if the algorithm used to check the integrity of the keystore or the algorithm for recovering the key cannot be found.
	 * @throws CertificateException if any of the certificates in the keystore could not be loaded.
	 * @throws IOException if the keystore file does not exist, is a directory rather than a regular file, or for some other reason cannot be opened for reading. 
	 * @throws UnrecoverableKeyException if the key cannot be recovered (e.g., the given password is wrong).
	 */
	public ClientCredential getCredential(String keyStorePwd,
			String keyStoreFilePath, String alias) throws KeyStoreException, NoSuchAlgorithmException, CertificateException, IOException, UnrecoverableKeyException ;

}
