/**
 * 
 */
package uy.gub.agesic.jbossws;

import org.jboss.ws.extensions.security.element.Token;
import org.jboss.ws.extensions.security.exception.WSSecurityException;
import org.w3c.dom.Element;

/**
 * @author Guzman Llambias
 *
 */
public class SAMLToken implements Token {

	Element element;
	
	public SAMLToken(Element elem){
		this.element = elem;
	}
	
	public Object getUniqueContent() {
		return null;
	}

	public Element getElement() throws WSSecurityException {
		return this.element;
	}

}
