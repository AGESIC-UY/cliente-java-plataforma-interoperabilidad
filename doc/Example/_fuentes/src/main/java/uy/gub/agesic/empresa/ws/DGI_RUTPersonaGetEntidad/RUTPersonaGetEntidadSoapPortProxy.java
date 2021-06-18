package uy.gub.agesic.empresa.ws.DGI_RUTPersonaGetEntidad;

public class RUTPersonaGetEntidadSoapPortProxy implements RUTPersonaGetEntidadSoapPort {
  private String _endpoint = null;
  private RUTPersonaGetEntidadSoapPort rUTPersonaGetEntidadSoapPort = null;
  
  public RUTPersonaGetEntidadSoapPortProxy() {
    _initRUTPersonaGetEntidadSoapPortProxy();
  }
  
  public RUTPersonaGetEntidadSoapPortProxy(String endpoint) {
    _endpoint = endpoint;
    _initRUTPersonaGetEntidadSoapPortProxy();
  }
  
  private void _initRUTPersonaGetEntidadSoapPortProxy() {
    try {
      rUTPersonaGetEntidadSoapPort = (new RUTPersonaGetEntidadLocator()).getRUTPersonaGetEntidadSoapPort();
      if (rUTPersonaGetEntidadSoapPort != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)rUTPersonaGetEntidadSoapPort)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)rUTPersonaGetEntidadSoapPort)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (rUTPersonaGetEntidadSoapPort != null)
      ((javax.xml.rpc.Stub)rUTPersonaGetEntidadSoapPort)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public RUTPersonaGetEntidadSoapPort getRUTPersonaGetEntidadSoapPort() {
    if (rUTPersonaGetEntidadSoapPort == null)
      _initRUTPersonaGetEntidadSoapPortProxy();
    return rUTPersonaGetEntidadSoapPort;
  }
  
  public uy.gub.agesic.empresa.ws.DGI_RUTPersonaGetEntidad.RUTPersonaGetEntidadExecuteResponse execute(uy.gub.agesic.empresa.ws.DGI_RUTPersonaGetEntidad.RUTPersonaGetEntidadExecute parameters) throws java.rmi.RemoteException{
    if (rUTPersonaGetEntidadSoapPort == null)
      _initRUTPersonaGetEntidadSoapPortProxy();
    return rUTPersonaGetEntidadSoapPort.execute(parameters);
  }
  
  
}