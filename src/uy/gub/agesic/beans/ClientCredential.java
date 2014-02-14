/**
 * 
 */
package uy.gub.agesic.beans;

import org.opensaml.xml.security.credential.Credential;

/**
 * @author Guzman Llambias
 *
 */
public class ClientCredential {
	
	Credential credential;

	/**
	 * @return the credential
	 */
	public Credential getCredential() {
		return credential;
	}

	/**
	 * @param credential the credential to set
	 */
	public void setCredential(Credential credential) {
		this.credential = credential;
	}

}
