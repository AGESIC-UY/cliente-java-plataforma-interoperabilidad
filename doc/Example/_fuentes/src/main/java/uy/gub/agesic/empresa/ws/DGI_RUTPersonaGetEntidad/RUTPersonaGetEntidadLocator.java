/**
 * RUTPersonaGetEntidadLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uy.gub.agesic.empresa.ws.DGI_RUTPersonaGetEntidad;

public class RUTPersonaGetEntidadLocator extends org.apache.axis.client.Service implements RUTPersonaGetEntidad {

    public RUTPersonaGetEntidadLocator() {
    }


    public RUTPersonaGetEntidadLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public RUTPersonaGetEntidadLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for RUTPersonaGetEntidadSoapPort
    private java.lang.String RUTPersonaGetEntidadSoapPort_address = "http://192.168.160.43:9800/dgi/arutpersonagetentidad";

    public java.lang.String getRUTPersonaGetEntidadSoapPortAddress() {
        return RUTPersonaGetEntidadSoapPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String RUTPersonaGetEntidadSoapPortWSDDServiceName = "RUTPersonaGetEntidadSoapPort";

    public java.lang.String getRUTPersonaGetEntidadSoapPortWSDDServiceName() {
        return RUTPersonaGetEntidadSoapPortWSDDServiceName;
    }

    public void setRUTPersonaGetEntidadSoapPortWSDDServiceName(java.lang.String name) {
        RUTPersonaGetEntidadSoapPortWSDDServiceName = name;
    }

    public RUTPersonaGetEntidadSoapPort getRUTPersonaGetEntidadSoapPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(RUTPersonaGetEntidadSoapPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getRUTPersonaGetEntidadSoapPort(endpoint);
    }

    public RUTPersonaGetEntidadSoapPort getRUTPersonaGetEntidadSoapPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            RUTPersonaGetEntidadSoapBindingStub _stub = new RUTPersonaGetEntidadSoapBindingStub(portAddress, this);
            _stub.setPortName(getRUTPersonaGetEntidadSoapPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setRUTPersonaGetEntidadSoapPortEndpointAddress(java.lang.String address) {
        RUTPersonaGetEntidadSoapPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (RUTPersonaGetEntidadSoapPort.class.isAssignableFrom(serviceEndpointInterface)) {
                RUTPersonaGetEntidadSoapBindingStub _stub = new RUTPersonaGetEntidadSoapBindingStub(new java.net.URL(RUTPersonaGetEntidadSoapPort_address), this);
                _stub.setPortName(getRUTPersonaGetEntidadSoapPortWSDDServiceName());
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
        if ("RUTPersonaGetEntidadSoapPort".equals(inputPortName)) {
            return getRUTPersonaGetEntidadSoapPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://rutpersonagetentidad.dgi.gub.uy", "RUTPersonaGetEntidad");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://rutpersonagetentidad.dgi.gub.uy", "RUTPersonaGetEntidadSoapPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("RUTPersonaGetEntidadSoapPort".equals(portName)) {
            setRUTPersonaGetEntidadSoapPortEndpointAddress(address);
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
