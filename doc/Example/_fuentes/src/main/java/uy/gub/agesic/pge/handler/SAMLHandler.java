package uy.gub.agesic.pge.handler;

import org.apache.log4j.Logger;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import uy.gub.agesic.pge.core.ws.Constants;
import uy.gub.agesic.pge.core.ws.Util;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.SOAPPart;
import javax.xml.ws.Response;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class SAMLHandler implements SOAPHandler<SOAPMessageContext> {
    private static final Logger log = Logger.getLogger(SAMLHandler.class);
    protected static Set<QName> headers;

    static {
        HashSet<QName> set = new HashSet<QName>();
        set.add(Constants.WSSE_HEADER_QNAME);
        headers = Collections.unmodifiableSet(set);
    }

    public Set<QName> getHeaders() {
        return headers;
    }

    public boolean handleMessage(SOAPMessageContext msgContext) {
        Boolean outbound = (Boolean) msgContext.get("javax.xml.ws.handler.message.outbound");
        if (outbound == null) {
            throw new IllegalStateException("Cannot obtain required property: javax.xml.ws.handler.message.outbound");
        }

        if (outbound.booleanValue()) {
            SOAPMessageContext ctx = msgContext;
            SOAPMessage soapMessage = ctx.getMessage();
            Response<SOAPMessage> response = (Response<SOAPMessage>) ctx.get("uy.gub.agesic.security.saml");
            Long stsTimeOut = (Long) ctx.get("STSTimeOut");
            Element assertion = null;
            try {
                SOAPMessage message = (SOAPMessage) response.get(stsTimeOut.longValue(), TimeUnit.MILLISECONDS);
                assertion = extractSecurityToken(message);
            } catch (Exception e) {
                log.error(e, e);
            } finally {
                if (response != null) {
                    try {
                        response.cancel(true);
                    } catch (Exception e) {
                    }
                }
            }

            if (assertion == null) {
                log.error("Outbound::No Assertion was found on the message context. Returning");
                return false;
            }

            SOAPPart sOAPPart = soapMessage.getSOAPPart();
            Element soapHeader = Util.findOrCreateSoapHeader(sOAPPart.getDocumentElement());
            try {
                Element wsse = getSecurityHeaderElement((Document) sOAPPart);
                wsse.setAttributeNS(soapHeader.getNamespaceURI(), soapHeader.getPrefix() + ":mustUnderstand", "1");
                if (assertion != null) {
                    if (sOAPPart != assertion.getOwnerDocument()) {
                        wsse.appendChild(sOAPPart.importNode(assertion, true));
                    } else {
                        wsse.appendChild(assertion);
                    }
                }
                soapHeader.insertBefore(wsse, soapHeader.getFirstChild());
            } catch (Exception e) {
                log.error(e, e);
                return false;
            }
        }

        return true;
    }

    public boolean handleFault(SOAPMessageContext messagecontext) {
        try {
            SOAPMessage msg = messagecontext.getMessage();
            if (msg.getSOAPBody().getFault() != null) {
                String detailName = null;
                try {
                    detailName = msg.getSOAPBody().getFault().getDetail().getFirstChild().getLocalName();
                    log.error(detailName);
                } catch (Exception e) {
                }
            }
        } catch (SOAPException e) {
            log.error(e, (Throwable) e);
        }
        return true;
    }

    public void close(MessageContext messageContext) {
    }

    protected Element getSecurityHeaderElement(Document document) {
        Element element = document.createElementNS("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd", "wsse:Security");
        Util.addNamespace(element, "wsse", "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd");
        Util.addNamespace(element, "wsu", "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd");
        Util.addNamespace(element, "ds", "http://www.w3.org/2000/09/xmldsig#");
        return element;
    }

    private Element extractSecurityToken(SOAPMessage message) {
        try {
            Document doc = message.getSOAPBody().extractContentAsDocument();
            NodeList nl = doc.getElementsByTagNameNS("urn:oasis:names:tc:SAML:1.0:assertion", "Assertion");
            if (nl.getLength() == 0) {
                nl = doc.getElementsByTagNameNS("*", "Assertion");
                if (nl.getLength() == 0)
                    nl = doc.getElementsByTagName("saml:Assertion");
                if (nl.getLength() == 0)
                    return null;
            }
            return (Element) nl.item(0);
        } catch (SOAPException e) {
            log.error(e, (Throwable) e);
            return null;
        }
    }
}