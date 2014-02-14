package uy.gub.agesic.jbossws;

import java.util.ArrayList;

import javax.xml.ws.handler.MessageContext;

import org.apache.log4j.Logger;
import org.jboss.ws.core.CommonMessageContext;
import org.jboss.ws.core.CommonSOAPFaultException;
import org.jboss.ws.core.soap.SOAPMessageImpl;
import org.jboss.ws.extensions.security.SecurityEncoder;
import org.jboss.ws.extensions.security.exception.WSSecurityException;
import org.jboss.ws.extensions.security.jaxws.WSSecurityHandler;
import org.jboss.ws.extensions.security.operation.EncodingOperation;
import org.jboss.ws.metadata.wsse.WSSecurityOMFactory;
import org.jboss.wsf.common.DOMWriter;
import org.w3c.dom.Element;

import uy.gub.agesic.AgesicConstants;
import uy.gub.agesic.beans.SAMLAssertion;

/**
 * @author Guzman Llambias
 * 
 */
public class SAMLHandler extends WSSecurityHandler {

	private static Logger log = Logger.getLogger(SAMLHandler.class);
	
	@Override
	protected String getConfigResourceName() {
		return WSSecurityOMFactory.SERVER_RESOURCE_NAME;
	}

	protected boolean handleOutbound(MessageContext ctx) {
		return handleOutboundSecurity(ctx);
	}

	protected boolean handleOutboundSecurity(MessageContext msgContext) {

		CommonMessageContext ctx = (CommonMessageContext) msgContext;
		SOAPMessageImpl soapMessage = (SOAPMessageImpl) ctx.getSOAPMessage();
		SAMLAssertion samlAssertion = (SAMLAssertion) ctx.get(AgesicConstants.SAML1_PROPERTY);
		dispatchMessage(samlAssertion, soapMessage);

		return true;
	}

	private void dispatchMessage(SAMLAssertion samlAssertion, SOAPMessageImpl message) {
		ArrayList<EncodingOperation> operations = new ArrayList<EncodingOperation>();
		Element elem = samlAssertion.getDOM();
		SAMLToken token = new SAMLToken(elem);
		
		operations.add(new SAMLOperation(token));
		
		if (log.isDebugEnabled())
	         log.debug("Encoding Message:\n" + DOMWriter.printNode(message.getSOAPPart(), true));

	      try
	      {
	         SecurityEncoder encoder = new SecurityEncoder(operations, null);
	         encoder.encode(message.getSOAPPart());
	      }
	      catch (WSSecurityException e)
	      {
	         if (e.isInternalError())
	            log.error("Internal error occured handling outbound message:", e);
	         else if (log.isDebugEnabled())
	            log.debug("Returning error to sender: " + e.getMessage());

	         throw convertToFault(e);
	      }
		
	}
	
	private CommonSOAPFaultException convertToFault(WSSecurityException e)
	   {
	      return new CommonSOAPFaultException(e.getFaultCode(), e.getFaultString());
	   }

}
