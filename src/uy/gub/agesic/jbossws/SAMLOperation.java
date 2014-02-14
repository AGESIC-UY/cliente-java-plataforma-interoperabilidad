/**
 * 
 */
package uy.gub.agesic.jbossws;

import org.jboss.ws.extensions.security.SecurityStore;
import org.jboss.ws.extensions.security.element.SecurityHeader;
import org.jboss.ws.extensions.security.exception.WSSecurityException;
import org.jboss.ws.extensions.security.operation.EncodingOperation;
import org.w3c.dom.Document;


/**
 * @author Guzman Llambias
 *
 */
public class SAMLOperation implements EncodingOperation{

	private SAMLToken token;
	
	public SAMLOperation(SAMLToken token){
		this.token = token;
	}
	
	public void process(Document message, SecurityHeader header,
			SecurityStore store) throws WSSecurityException {
		
		header.addToken(this.token);
		
	}

}
