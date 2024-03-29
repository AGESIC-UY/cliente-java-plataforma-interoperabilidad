/**
 * ServicioConsultasLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uy.gub.agesic.empresa.ws.UNAOID_consultasOID;

public class ServicioConsultasLocator extends org.apache.axis.client.Service implements ServicioConsultas {

    public ServicioConsultasLocator() {
    }


    public ServicioConsultasLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ServicioConsultasLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for BasicHttpBinding_IServicioConsultas
    private java.lang.String BasicHttpBinding_IServicioConsultas_address = "http://unaoid.red.uy/wsConsulta/ServicioConsultas.svc";

    public java.lang.String getBasicHttpBinding_IServicioConsultasAddress() {
        return BasicHttpBinding_IServicioConsultas_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String BasicHttpBinding_IServicioConsultasWSDDServiceName = "BasicHttpBinding_IServicioConsultas";

    public java.lang.String getBasicHttpBinding_IServicioConsultasWSDDServiceName() {
        return BasicHttpBinding_IServicioConsultasWSDDServiceName;
    }

    public void setBasicHttpBinding_IServicioConsultasWSDDServiceName(java.lang.String name) {
        BasicHttpBinding_IServicioConsultasWSDDServiceName = name;
    }

    public IServicioConsultas getBasicHttpBinding_IServicioConsultas() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(BasicHttpBinding_IServicioConsultas_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getBasicHttpBinding_IServicioConsultas(endpoint);
    }

    public IServicioConsultas getBasicHttpBinding_IServicioConsultas(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            BasicHttpBinding_IServicioConsultasStub _stub = new BasicHttpBinding_IServicioConsultasStub(portAddress, this);
            _stub.setPortName(getBasicHttpBinding_IServicioConsultasWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setBasicHttpBinding_IServicioConsultasEndpointAddress(java.lang.String address) {
        BasicHttpBinding_IServicioConsultas_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (IServicioConsultas.class.isAssignableFrom(serviceEndpointInterface)) {
                BasicHttpBinding_IServicioConsultasStub _stub = new BasicHttpBinding_IServicioConsultasStub(new java.net.URL(BasicHttpBinding_IServicioConsultas_address), this);
                _stub.setPortName(getBasicHttpBinding_IServicioConsultasWSDDServiceName());
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
        if ("BasicHttpBinding_IServicioConsultas".equals(inputPortName)) {
            return getBasicHttpBinding_IServicioConsultas();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://servicios.pge.red.uy/agesic/consultasOID", "ServicioConsultas");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://servicios.pge.red.uy/agesic/consultasOID", "BasicHttpBinding_IServicioConsultas"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("BasicHttpBinding_IServicioConsultas".equals(portName)) {
            setBasicHttpBinding_IServicioConsultasEndpointAddress(address);
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
