package uy.gub.agesic.jbossws;

import java.util.Iterator;
import javax.xml.soap.Name;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPHeaderElement;
import javax.xml.ws.handler.MessageContext;
import org.apache.log4j.Logger;
import org.jboss.ws.core.CommonMessageContext;
import org.jboss.ws.core.soap.SOAPMessageImpl;
import org.jboss.wsf.common.handler.GenericSOAPHandler;
import uy.gub.agesic.AgesicConstants;


/**
 * Este Handler lo que hace es setear el atributo actor con el valor actorDP.
 * Esto se debe a que al setear usuario/password por WS-Security
 * 
 * @author mcaponi
 *
 */
public class WSSecurityUsernamePasswordHandler extends GenericSOAPHandler {

	private static Logger log = Logger.getLogger(WSSecurityUsernamePasswordHandler.class);
	String samlActor = null;
	
	protected boolean  handleOutbound(MessageContext msgContext) {
		
		CommonMessageContext ctx = (CommonMessageContext) msgContext;
		SOAPMessageImpl soapMessage = (SOAPMessageImpl) ctx.getSOAPMessage();
		String samlActor = (String) ctx.get(AgesicConstants.SAML_ACTOR);
		dispatchMessage(samlActor, soapMessage);
		
		return true;
	}

	
	private void dispatchMessage(String samlActor, SOAPMessageImpl soapMessage) {
		try {
			SOAPEnvelope soapEnv = soapMessage.getSOAPPart().getEnvelope();
			SOAPHeader soapHeader = soapEnv.getHeader();
			
			SOAPHeaderElement samlHeader = getSAMLSoapHeader(soapHeader);
			samlHeader.setActor(samlActor);

		} catch (SOAPException e) {
			log.error("Internal error occured handling outbound message:", e);
		}
	}

	
	private SOAPHeaderElement getSAMLSoapHeader(SOAPHeader soapHeader) {
		SOAPHeaderElement headerElement = null;
		Iterator allHeaders = soapHeader.examineAllHeaderElements();
		boolean found = false;
		
		while (allHeaders.hasNext() && !found) {
        	 headerElement = (SOAPHeaderElement)allHeaders.next();
             Name headerName = headerElement.getElementName();
             
             if ("wsse:Security".equalsIgnoreCase(headerName.getQualifiedName())) {
            	 if ("Assertion".equalsIgnoreCase(headerElement.getFirstChild().getLocalName())) {
            		found = true;
				}
            }
        }

		return headerElement;
	}
	
	
}
