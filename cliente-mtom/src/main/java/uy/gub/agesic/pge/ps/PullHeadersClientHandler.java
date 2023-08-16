package uy.gub.agesic.pge.ps;

import javax.xml.namespace.QName;
import javax.xml.soap.Node;
import javax.xml.soap.SOAPHeaderElement;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class PullHeadersClientHandler implements SOAPHandler<SOAPMessageContext> {
    private String notificationId;

    public Set<QName> getHeaders() {
        return new TreeSet<QName>();
    }

    public void close(MessageContext mc) {
    }

    public boolean handleFault(SOAPMessageContext mc) {
        return true;
    }

    public boolean handleMessage(SOAPMessageContext mc) {
        Boolean outbound = (Boolean) mc.get("javax.xml.ws.handler.message.outbound");
        if (!outbound.booleanValue()) {
            SOAPMessage message = mc.getMessage();
            try {
                Iterator<Node> it = message.getSOAPHeader().getChildElements(new QName("http://ps.agesic.gub.uy", "notificationId"));
                if (it.hasNext()) {
                    Node elem = it.next();
                    this.notificationId = elem.getValue();
                }
            } catch (Exception e) {
                System.out.println("Exception in handler: " + e);
                e.printStackTrace();
            }
        }
        return true;
    }

    public String getNotificationId() {
        return this.notificationId;
    }
}