/**
 * 
 */
package uy.gub.agesic.opensaml;

import uy.gub.agesic.AssertionManager;
import uy.gub.agesic.PGEFactory;
import uy.gub.agesic.beans.ClientCredential;
import uy.gub.agesic.beans.RSTBean;

/**
 * @author Guzman Llambias
 *
 */
public class AssertionGeneratorTest {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String alias = "cd7cb547b6229be0a95d442daae50270_be45dff3-4f56-4728-8332-77080b0c1c08";
		String keyStoreFilePath = "c:/temp/opensaml_v5.0.keystore";
		String keyStorePwd = "agesic"; 
		
		String issuer = "Agesic";
		String policyName = "urn:nac";
		String role = "Doctor";
		String userName = "Juan";
		
		try {			
			
			RSTBean bean = new RSTBean();
			bean.setIssuer(issuer);
			bean.setPolicyName(policyName);
			bean.setRole(role);
			bean.setUserName(userName);
			
			AssertionManager generator = PGEFactory.getAssertionManager();
			ClientCredential credential = generator.getCredential(keyStorePwd, keyStoreFilePath, alias);
			generator.generateSignedAssertion(credential, bean);
			
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
}
