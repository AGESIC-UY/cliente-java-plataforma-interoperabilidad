package uy.gub.agesic.pge.core.xml.util;

//import org.picketlink.identity.federation.core.saml.v2.common.IDGenerator;
//import org.picketlink.identity.federation.core.saml.v2.util.DocumentUtil;
//import org.picketlink.identity.federation.core.saml.v2.util.XMLTimeUtil;
//import org.picketlink.identity.federation.core.wstrust.plugins.saml.SAMLUtil;
//import org.picketlink.identity.federation.core.wstrust.wrappers.Lifetime;
//import org.picketlink.identity.federation.saml.v1.assertion.*;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import uy.gub.agesic.pge.beans.ClientCredential;
import uy.gub.agesic.pge.beans.RSTBean;
import uy.gub.agesic.pge.exceptions.RequestSecurityTokenException;

import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import javax.xml.soap.*;
import java.net.URI;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import java.util.GregorianCalendar;

public class WSTrustUtil {
    private static final Long DEFAULT_TOKENTIMEOUT = 900000L;

    public static SOAPMessage createRequestSecurityTokenMessage(RSTBean rstBean, ClientCredential credential, Long tokenTimeOut) throws RequestSecurityTokenException {
        try {
            //TODO: Fix this
//            XMLGregorianCalendar issueInstant = XMLTimeUtil.getIssueInstant();
//            String assertionID = IDGenerator.create("uuid-");
//            SAML11AssertionType assertionType = new SAML11AssertionType(assertionID, issueInstant);
//            assertionType.setIssuer(rstBean.getIssuer());
//
//            SAML11SubjectType subject = new SAML11SubjectType();
//            SAML11NameIdentifierType nameId = new SAML11NameIdentifierType(rstBean.getRole());
//            nameId.setFormat(URI.create("urn:oasis:names:tc:SAML:1.1:nameid-format:emailAddress"));
//            SAML11SubjectType.SAML11SubjectTypeChoice subjectChoice = new SAML11SubjectType.SAML11SubjectTypeChoice(nameId);
//
//            SAML11SubjectConfirmationType subjectConfirmation = new SAML11SubjectConfirmationType();
//            subjectConfirmation.addConfirmationMethod(URI.create("urn:oasis:names:tc:SAML:1.0:cm:bearer"));
//            subject.setChoice(subjectChoice);
//            subject.setSubjectConfirmation(subjectConfirmation);
//
//            if (tokenTimeOut == null) {
//                tokenTimeOut = DEFAULT_TOKENTIMEOUT;
//            }
//
//            Lifetime lifetime = createDefaultLifetime(tokenTimeOut.longValue());
//            SAML11ConditionsType conditions = new SAML11ConditionsType();
//            conditions.setNotBefore(lifetime.getCreated());
//            conditions.setNotOnOrAfter(lifetime.getExpires());
//            assertionType.setConditions(conditions);
//
//            URI authenticationMethod = URI.create("urn:oasis:names:tc:SAML:1.0:am:password");
//            SAML11AuthenticationStatementType authenticationStatementType = new SAML11AuthenticationStatementType(authenticationMethod, issueInstant);
//            authenticationStatementType.setSubject(subject);
//            assertionType.add((SAML11StatementAbstractType) authenticationStatementType);
//
//            SAML11AttributeStatementType attributeStatementType = new SAML11AttributeStatementType();
//            SAML11AttributeType attributeType = new SAML11AttributeType("User", URI.create(rstBean.getPolicyName()));
//            attributeType.add("");
//            attributeStatementType.setSubject(subject);
//            attributeStatementType.add(attributeType);
//
//            assertionType.add((SAML11StatementAbstractType) attributeStatementType);
//
//            Element assertion = SAMLUtil.toElement(assertionType);
//            MessageFactory messageFactory = MessageFactory.newInstance();
//
//            Document tokenDocument = DocumentUtil.createDocument();
//            assertion = (Element) tokenDocument.importNode(assertion, true);
//            tokenDocument.appendChild(assertion);
//
//            setupIDAttribute(assertion);
//            X509Certificate x509Certificate = credential.getCertificate();
//            PrivateKey privateKey = credential.getPrivateKey();
//            tokenDocument = XMLSignatureUtil.sign(tokenDocument, assertion, privateKey, x509Certificate, "http://www.w3.org/2000/09/xmldsig#sha1", "http://www.w3.org/2000/09/xmldsig#rsa-sha1", "#" + assertionID);
//
//            assertion = (Element) tokenDocument.getFirstChild();
//
//            String messageID = IDGenerator.create("uuid-");
//            String policyName = rstBean.getPolicyName();
//            String role = rstBean.getRole();
//            String service = rstBean.getService();
//
//            SOAPMessage soapMessage = messageFactory.createMessage();
//            SOAPPart part = soapMessage.getSOAPPart();
//            SOAPEnvelope envelope = part.getEnvelope();
//            envelope.addNamespaceDeclaration("wsa", "http://www.w3.org/2005/08/addressing");
//
//            addHeader(soapMessage, messageID);
//            addRequestSecurityToken(soapMessage, policyName, service, assertion, role);
//
//            return soapMessage;
            return null;
        } catch (Exception e) {
            throw new RequestSecurityTokenException(e.getMessage(), e);
        }
    }

    //TODO: Fix this
//    public static Lifetime createDefaultLifetime(long tokenTimeout) {
//        GregorianCalendar created = new GregorianCalendar();
//        GregorianCalendar expires = new GregorianCalendar();
//        created.setTimeInMillis(created.getTimeInMillis() - tokenTimeout);
//        expires.setTimeInMillis(expires.getTimeInMillis() + tokenTimeout);
//        return new Lifetime(created, expires);
//    }

    private static String setupIDAttribute(Node node) {
        if (node instanceof Element) {
            Element assertion = (Element) node;
            if (assertion.getLocalName().equals("Assertion")) {
                if (assertion.getNamespaceURI().equals("urn:oasis:names:tc:SAML:2.0:assertion") && assertion.hasAttribute("ID")) {
                    assertion.setIdAttribute("ID", true);
                    return "#" + assertion.getAttribute("ID");
                }
                if (assertion.getNamespaceURI().equals("urn:oasis:names:tc:SAML:1.0:assertion") && assertion.hasAttribute("AssertionID")) {
                    assertion.setIdAttribute("AssertionID", true);
                    return "#" + assertion.getAttribute("AssertionID");
                }
            }
        }
        return "";
    }

    private static void addHeader(SOAPMessage soapMessage, String messageID) throws SOAPException {
        SOAPFactory factory = SOAPFactory.newInstance();
        SOAPElement actionElement = factory.createElement("Action", "wsa", "http://www.w3.org/2005/08/addressing");
        QName actionName = new QName("http://schemas.xmlsoap.org/soap/envelope/", "mustUnderstand", "env");
        actionElement.addAttribute(actionName, "1");
        actionElement.addTextNode(" ");
        soapMessage.getSOAPHeader().addChildElement(actionElement);

        SOAPElement msgIdElement = factory.createElement("MessageID", "wsa", "http://www.w3.org/2005/08/addressing");
        msgIdElement.addTextNode(messageID);
        soapMessage.getSOAPHeader().addChildElement(msgIdElement);
    }

    private static void addRequestSecurityToken(SOAPMessage soapMessage, String policyName, String service, Element assertion, String role) throws SOAPException {
        SOAPFactory factory = SOAPFactory.newInstance();
        SOAPElement requestSecurityToken = factory.createElement("RequestSecurityToken", "wst", "http://schemas.xmlsoap.org/ws/2005/02/trust");
        requestSecurityToken.addNamespaceDeclaration("wst", "http://schemas.xmlsoap.org/ws/2005/02/trust");

        SOAPElement tokenType = factory.createElement("TokenType", "wst", "http://schemas.xmlsoap.org/ws/2005/02/trust");
        tokenType.addTextNode("http://docs.oasis-open.org/wss/oasis-wss-saml-token-profile-1.1#SAMLV1.1");
        requestSecurityToken.addChildElement(tokenType);

        SOAPElement appliesTo = factory.createElement("AppliesTo", "wsp", "http://schemas.xmlsoap.org/ws/2004/09/policy");
        SOAPElement endpointReference = factory.createElement("EndpointReference", "wsa", "http://www.w3.org/2005/08/addressing");
        SOAPElement address = factory.createElement("Address", "wsa", "http://www.w3.org/2005/08/addressing");
        address.addTextNode(service);
        endpointReference.addChildElement(address);
        appliesTo.addChildElement(endpointReference);
        requestSecurityToken.addChildElement(appliesTo);

        SOAPElement requestType = factory.createElement("RequestType", "wst", "http://schemas.xmlsoap.org/ws/2005/02/trust");
        requestType.addTextNode("http://schemas.xmlsoap.org/ws/2005/02/trust/Issue");
        requestSecurityToken.addChildElement(requestType);

        SOAPElement issuer = factory.createElement("Issuer", "wst", "http://schemas.xmlsoap.org/ws/2005/02/trust");
        address = factory.createElement("Address", "wsa", "http://www.w3.org/2005/08/addressing");
        address.addTextNode(policyName);
        issuer.addChildElement(address);
        requestSecurityToken.addChildElement(issuer);

        SOAPElement base = factory.createElement("Base", "wst", "http://schemas.xmlsoap.org/ws/2005/02/trust");
        Document doc = base.getOwnerDocument();
        assertion = (Element) doc.importNode(assertion, true);
        base.appendChild(assertion);
        requestSecurityToken.addChildElement(base);

        SOAPElement secondaryParameters = factory.createElement("SecondaryParameters", "wst", "http://schemas.xmlsoap.org/ws/2005/02/trust");
        SOAPElement roleElement = factory.createElement("SecondaryParameters", "wst", "http://schemas.xmlsoap.org/ws/2005/02/trust");
        roleElement.addTextNode(role);
        secondaryParameters.addChildElement(roleElement);
        requestSecurityToken.addChildElement(secondaryParameters);

        soapMessage.getSOAPBody().addChildElement(requestSecurityToken);
    }
}