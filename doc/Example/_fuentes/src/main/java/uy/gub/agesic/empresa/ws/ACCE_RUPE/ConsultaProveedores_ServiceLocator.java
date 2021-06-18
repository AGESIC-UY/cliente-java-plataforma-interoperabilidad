/**
 * ConsultaProveedores_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uy.gub.agesic.empresa.ws.ACCE_RUPE;

public class ConsultaProveedores_ServiceLocator extends org.apache.axis.client.Service implements uy.gub.agesic.empresa.ws.ACCE_RUPE.ConsultaProveedores_Service {

    public ConsultaProveedores_ServiceLocator() {
    }


    public ConsultaProveedores_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ConsultaProveedores_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ConsultaProveedoresPort
    private java.lang.String ConsultaProveedoresPort_address = "http://rupetest.acce.red.uy:80/RUPE-WS/ConsultaProveedores";

    public java.lang.String getConsultaProveedoresPortAddress() {
        return ConsultaProveedoresPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ConsultaProveedoresPortWSDDServiceName = "ConsultaProveedoresPort";

    public java.lang.String getConsultaProveedoresPortWSDDServiceName() {
        return ConsultaProveedoresPortWSDDServiceName;
    }

    public void setConsultaProveedoresPortWSDDServiceName(java.lang.String name) {
        ConsultaProveedoresPortWSDDServiceName = name;
    }

    public uy.gub.agesic.empresa.ws.ACCE_RUPE.ConsultaProveedores_PortType getConsultaProveedoresPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ConsultaProveedoresPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getConsultaProveedoresPort(endpoint);
    }

    public uy.gub.agesic.empresa.ws.ACCE_RUPE.ConsultaProveedores_PortType getConsultaProveedoresPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            uy.gub.agesic.empresa.ws.ACCE_RUPE.ConsultaProveedoresSoapBindingStub _stub = new uy.gub.agesic.empresa.ws.ACCE_RUPE.ConsultaProveedoresSoapBindingStub(portAddress, this);
            _stub.setPortName(getConsultaProveedoresPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setConsultaProveedoresPortEndpointAddress(java.lang.String address) {
        ConsultaProveedoresPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (uy.gub.agesic.empresa.ws.ACCE_RUPE.ConsultaProveedores_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                uy.gub.agesic.empresa.ws.ACCE_RUPE.ConsultaProveedoresSoapBindingStub _stub = new uy.gub.agesic.empresa.ws.ACCE_RUPE.ConsultaProveedoresSoapBindingStub(new java.net.URL(ConsultaProveedoresPort_address), this);
                _stub.setPortName(getConsultaProveedoresPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("ConsultaProveedoresPort".equals(inputPortName)) {
            return getConsultaProveedoresPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "ConsultaProveedores");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "ConsultaProveedoresPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ConsultaProveedoresPort".equals(portName)) {
            setConsultaProveedoresPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
