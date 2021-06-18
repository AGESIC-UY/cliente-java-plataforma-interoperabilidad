package uy.gub.agesic.empresa.ws.UNAOID_consultasOID;

public class IServicioConsultasProxy implements IServicioConsultas {
  private String _endpoint = null;
  private IServicioConsultas iServicioConsultas = null;
  
  public IServicioConsultasProxy() {
    _initIServicioConsultasProxy();
  }
  
  public IServicioConsultasProxy(String endpoint) {
    _endpoint = endpoint;
    _initIServicioConsultasProxy();
  }
  
  private void _initIServicioConsultasProxy() {
    try {
      iServicioConsultas = (new ServicioConsultasLocator()).getBasicHttpBinding_IServicioConsultas();
      if (iServicioConsultas != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)iServicioConsultas)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)iServicioConsultas)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (iServicioConsultas != null)
      ((javax.xml.rpc.Stub)iServicioConsultas)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public IServicioConsultas getIServicioConsultas() {
    if (iServicioConsultas == null)
      _initIServicioConsultasProxy();
    return iServicioConsultas;
  }
  
  public java.lang.String obtenerInfoOidObjeto(java.lang.String pOidObjeto, java.lang.Boolean pRetornaRUTConCeroAlInicio) throws java.rmi.RemoteException{
    if (iServicioConsultas == null)
      _initIServicioConsultasProxy();
    return iServicioConsultas.obtenerInfoOidObjeto(pOidObjeto, pRetornaRUTConCeroAlInicio);
  }
  
  public java.lang.String obtenerInfoOidOrganizacion(java.lang.String pOidOrganizacion, java.lang.Boolean pRetornaRUTConCeroAlInicio) throws java.rmi.RemoteException{
    if (iServicioConsultas == null)
      _initIServicioConsultasProxy();
    return iServicioConsultas.obtenerInfoOidOrganizacion(pOidOrganizacion, pRetornaRUTConCeroAlInicio);
  }
  
  public java.lang.String obtenerInfoOidPersona(java.lang.String pOidPersona) throws java.rmi.RemoteException{
    if (iServicioConsultas == null)
      _initIServicioConsultasProxy();
    return iServicioConsultas.obtenerInfoOidPersona(pOidPersona);
  }
  
  public java.lang.String obtenerNombreFamiliaObjeto(java.lang.String pCodigoItem) throws java.rmi.RemoteException{
    if (iServicioConsultas == null)
      _initIServicioConsultasProxy();
    return iServicioConsultas.obtenerNombreFamiliaObjeto(pCodigoItem);
  }
  
  public java.lang.String realizarBusqueda(java.lang.Integer pTipoBusqueda, java.lang.String pTextoBusqueda, java.lang.Boolean pRetornaRUTConCeroAlInicio) throws java.rmi.RemoteException{
    if (iServicioConsultas == null)
      _initIServicioConsultasProxy();
    return iServicioConsultas.realizarBusqueda(pTipoBusqueda, pTextoBusqueda, pRetornaRUTConCeroAlInicio);
  }
  
  public java.lang.String version() throws java.rmi.RemoteException{
    if (iServicioConsultas == null)
      _initIServicioConsultasProxy();
    return iServicioConsultas.version();
  }
  
  
}