/**
 * WsRegEmpresasServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uy.gub.agesic.empresa.ws.BPS_RegEmpresa;

public class WsRegEmpresasServiceLocator extends org.apache.axis.client.Service implements uy.gub.agesic.empresa.ws.BPS_RegEmpresa.WsRegEmpresasService {

    public WsRegEmpresasServiceLocator() {
    }


    public WsRegEmpresasServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public WsRegEmpresasServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for WsRegEmpresasV002
    private java.lang.String WsRegEmpresasV002_address = "http://w3ibmp.bps.net:83/RegEmpWsRouter/WsRegEmpresasService";

    public java.lang.String getWsRegEmpresasV002Address() {
        return WsRegEmpresasV002_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String WsRegEmpresasV002WSDDServiceName = "WsRegEmpresasV002";

    public java.lang.String getWsRegEmpresasV002WSDDServiceName() {
        return WsRegEmpresasV002WSDDServiceName;
    }

    public void setWsRegEmpresasV002WSDDServiceName(java.lang.String name) {
        WsRegEmpresasV002WSDDServiceName = name;
    }

    public uy.gub.agesic.empresa.ws.BPS_RegEmpresa.WsRegEmpresaV002 getWsRegEmpresasV002() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(WsRegEmpresasV002_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getWsRegEmpresasV002(endpoint);
    }

    public uy.gub.agesic.empresa.ws.BPS_RegEmpresa.WsRegEmpresaV002 getWsRegEmpresasV002(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            uy.gub.agesic.empresa.ws.BPS_RegEmpresa.WsRegEmpresasV002BindingStub _stub = new uy.gub.agesic.empresa.ws.BPS_RegEmpresa.WsRegEmpresasV002BindingStub(portAddress, this);
            _stub.setPortName(getWsRegEmpresasV002WSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setWsRegEmpresasV002EndpointAddress(java.lang.String address) {
        WsRegEmpresasV002_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (uy.gub.agesic.empresa.ws.BPS_RegEmpresa.WsRegEmpresaV002.class.isAssignableFrom(serviceEndpointInterface)) {
                uy.gub.agesic.empresa.ws.BPS_RegEmpresa.WsRegEmpresasV002BindingStub _stub = new uy.gub.agesic.empresa.ws.BPS_RegEmpresa.WsRegEmpresasV002BindingStub(new java.net.URL(WsRegEmpresasV002_address), this);
                _stub.setPortName(getWsRegEmpresasV002WSDDServiceName());
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
        if ("WsRegEmpresasV002".equals(inputPortName)) {
            return getWsRegEmpresasV002();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/empresas/v002", "WsRegEmpresasService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/empresas/v002", "WsRegEmpresasV002"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("WsRegEmpresasV002".equals(portName)) {
            setWsRegEmpresasV002EndpointAddress(address);
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
