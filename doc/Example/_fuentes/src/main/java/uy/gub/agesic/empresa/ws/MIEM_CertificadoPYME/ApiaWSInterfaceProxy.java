package uy.gub.agesic.empresa.ws.MIEM_CertificadoPYME;

public class ApiaWSInterfaceProxy implements uy.gub.agesic.empresa.ws.MIEM_CertificadoPYME.ApiaWSInterface {
  private String _endpoint = null;
  private uy.gub.agesic.empresa.ws.MIEM_CertificadoPYME.ApiaWSInterface apiaWSInterface = null;
  
  public ApiaWSInterfaceProxy() {
    _initApiaWSInterfaceProxy();
  }
  
  public ApiaWSInterfaceProxy(String endpoint) {
    _endpoint = endpoint;
    _initApiaWSInterfaceProxy();
  }
  
  private void _initApiaWSInterfaceProxy() {
    try {
      apiaWSInterface = (new uy.gub.agesic.empresa.ws.MIEM_CertificadoPYME.ApiaWSInterfaceServiceLocator()).getApiaWSconsulta_pyme();
      if (apiaWSInterface != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)apiaWSInterface)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)apiaWSInterface)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (apiaWSInterface != null)
      ((javax.xml.rpc.Stub)apiaWSInterface)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public uy.gub.agesic.empresa.ws.MIEM_CertificadoPYME.ApiaWSInterface getApiaWSInterface() {
    if (apiaWSInterface == null)
      _initApiaWSInterfaceProxy();
    return apiaWSInterface;
  }
  
  public uy.gub.agesic.empresa.ws.MIEM_CertificadoPYME.ExecResultType consulta_pyme(uy.gub.agesic.empresa.ws.MIEM_CertificadoPYME.ApiaWSInputType apiaWSInput) throws java.rmi.RemoteException{
    if (apiaWSInterface == null)
      _initApiaWSInterfaceProxy();
    return apiaWSInterface.consulta_pyme(apiaWSInput);
  }
  
  
}