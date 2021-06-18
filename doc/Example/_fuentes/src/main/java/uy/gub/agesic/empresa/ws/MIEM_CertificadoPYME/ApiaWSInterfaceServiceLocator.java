/**
 * ApiaWSInterfaceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uy.gub.agesic.empresa.ws.MIEM_CertificadoPYME;

public class ApiaWSInterfaceServiceLocator extends org.apache.axis.client.Service implements uy.gub.agesic.empresa.ws.MIEM_CertificadoPYME.ApiaWSInterfaceService {

    public ApiaWSInterfaceServiceLocator() {
    }


    public ApiaWSInterfaceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ApiaWSInterfaceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ApiaWSconsulta_pyme
    private java.lang.String ApiaWSconsulta_pyme_address = "http://www.tramites-test.miem.gub.uy/TramitesEnLinea/services/ApiaWSconsulta_pyme";

    public java.lang.String getApiaWSconsulta_pymeAddress() {
        return ApiaWSconsulta_pyme_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ApiaWSconsulta_pymeWSDDServiceName = "ApiaWSconsulta_pyme";

    public java.lang.String getApiaWSconsulta_pymeWSDDServiceName() {
        return ApiaWSconsulta_pymeWSDDServiceName;
    }

    public void setApiaWSconsulta_pymeWSDDServiceName(java.lang.String name) {
        ApiaWSconsulta_pymeWSDDServiceName = name;
    }

    public uy.gub.agesic.empresa.ws.MIEM_CertificadoPYME.ApiaWSInterface getApiaWSconsulta_pyme() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ApiaWSconsulta_pyme_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getApiaWSconsulta_pyme(endpoint);
    }

    public uy.gub.agesic.empresa.ws.MIEM_CertificadoPYME.ApiaWSInterface getApiaWSconsulta_pyme(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            uy.gub.agesic.empresa.ws.MIEM_CertificadoPYME.ApiaWSconsulta_pymeSoapBindingStub _stub = new uy.gub.agesic.empresa.ws.MIEM_CertificadoPYME.ApiaWSconsulta_pymeSoapBindingStub(portAddress, this);
            _stub.setPortName(getApiaWSconsulta_pymeWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setApiaWSconsulta_pymeEndpointAddress(java.lang.String address) {
        ApiaWSconsulta_pyme_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (uy.gub.agesic.empresa.ws.MIEM_CertificadoPYME.ApiaWSInterface.class.isAssignableFrom(serviceEndpointInterface)) {
                uy.gub.agesic.empresa.ws.MIEM_CertificadoPYME.ApiaWSconsulta_pymeSoapBindingStub _stub = new uy.gub.agesic.empresa.ws.MIEM_CertificadoPYME.ApiaWSconsulta_pymeSoapBindingStub(new java.net.URL(ApiaWSconsulta_pyme_address), this);
                _stub.setPortName(getApiaWSconsulta_pymeWSDDServiceName());
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
        if ("ApiaWSconsulta_pyme".equals(inputPortName)) {
            return getApiaWSconsulta_pyme();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.apiasolutions.com/WebServices", "ApiaWSInterfaceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.apiasolutions.com/WebServices", "ApiaWSconsulta_pyme"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ApiaWSconsulta_pyme".equals(portName)) {
            setApiaWSconsulta_pymeEndpointAddress(address);
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
