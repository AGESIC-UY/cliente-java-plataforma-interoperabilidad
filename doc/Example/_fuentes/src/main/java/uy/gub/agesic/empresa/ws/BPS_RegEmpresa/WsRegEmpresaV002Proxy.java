package uy.gub.agesic.empresa.ws.BPS_RegEmpresa;

public class WsRegEmpresaV002Proxy implements uy.gub.agesic.empresa.ws.BPS_RegEmpresa.WsRegEmpresaV002 {
  private String _endpoint = null;
  private uy.gub.agesic.empresa.ws.BPS_RegEmpresa.WsRegEmpresaV002 wsRegEmpresaV002 = null;
  
  public WsRegEmpresaV002Proxy() {
    _initWsRegEmpresaV002Proxy();
  }
  
  public WsRegEmpresaV002Proxy(String endpoint) {
    _endpoint = endpoint;
    _initWsRegEmpresaV002Proxy();
  }
  
  private void _initWsRegEmpresaV002Proxy() {
    try {
      wsRegEmpresaV002 = (new uy.gub.agesic.empresa.ws.BPS_RegEmpresa.WsRegEmpresasServiceLocator()).getWsRegEmpresasV002();
      if (wsRegEmpresaV002 != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)wsRegEmpresaV002)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)wsRegEmpresaV002)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (wsRegEmpresaV002 != null)
      ((javax.xml.rpc.Stub)wsRegEmpresaV002)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public uy.gub.agesic.empresa.ws.BPS_RegEmpresa.WsRegEmpresaV002 getWsRegEmpresaV002() {
    if (wsRegEmpresaV002 == null)
      _initWsRegEmpresaV002Proxy();
    return wsRegEmpresaV002;
  }
  
  public uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v002.datatypes.ResultObtContribuyenteVigente obtContribuyenteVigente(uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v002.datatypes.ParamObtContribuyenteVigente paramObtContribuyenteVigente) throws java.rmi.RemoteException{
    if (wsRegEmpresaV002 == null)
      _initWsRegEmpresaV002Proxy();
    return wsRegEmpresaV002.obtContribuyenteVigente(paramObtContribuyenteVigente);
  }
  
  public uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v002.datatypes.ResultObtDomicilioFiscalPpal obtDomicilioFiscalPpal(uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v002.datatypes.ParamObtDomicilioFiscalPpal paramObtDomicilioFiscalPpal) throws java.rmi.RemoteException{
    if (wsRegEmpresaV002 == null)
      _initWsRegEmpresaV002Proxy();
    return wsRegEmpresaV002.obtDomicilioFiscalPpal(paramObtDomicilioFiscalPpal);
  }
  
  public uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v002.datatypes.ResultObtEmpresa obtenerEmpresa(uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v002.datatypes.ParamObtEmpresa paramObtEmpresa) throws java.rmi.RemoteException{
    if (wsRegEmpresaV002 == null)
      _initWsRegEmpresaV002Proxy();
    return wsRegEmpresaV002.obtenerEmpresa(paramObtEmpresa);
  }
  
  public uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v002.datatypes.ResultObtEstadosAportacion obtenerEstadosAportacion(uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v002.datatypes.ParamObtEstadosAportacion paramObtEstadosAportacion) throws java.rmi.RemoteException{
    if (wsRegEmpresaV002 == null)
      _initWsRegEmpresaV002Proxy();
    return wsRegEmpresaV002.obtenerEstadosAportacion(paramObtEstadosAportacion);
  }
  
  public uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v001.datatypes.ResultObtenerListaEstadosAportacion obtenerListaEstadosAportacion(uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v003.datatypes.ParamObtenerEstadosAportacion[] paramObtenerListaEstadosAportacion) throws java.rmi.RemoteException{
    if (wsRegEmpresaV002 == null)
      _initWsRegEmpresaV002Proxy();
    return wsRegEmpresaV002.obtenerListaEstadosAportacion(paramObtenerListaEstadosAportacion);
  }
  
  public uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v002.datatypes.ResultObtListaEmpresa obtenerListaEmpresa(uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v002.datatypes.ParamObtListaEmpresa paramObtListaEmpresaEmpresa) throws java.rmi.RemoteException{
    if (wsRegEmpresaV002 == null)
      _initWsRegEmpresaV002Proxy();
    return wsRegEmpresaV002.obtenerListaEmpresa(paramObtListaEmpresaEmpresa);
  }
  
  public uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v002.datatypes.ResultObtListaRelContribuyente obtenerListaRelContribuyente(uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v002.datatypes.ParamObtListaRelContribuyente paramObtListaRelContribuyente) throws java.rmi.RemoteException{
    if (wsRegEmpresaV002 == null)
      _initWsRegEmpresaV002Proxy();
    return wsRegEmpresaV002.obtenerListaRelContribuyente(paramObtListaRelContribuyente);
  }
  
  public uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v002.datatypes.ResultObtListaRelContribuyenteEmpresas obtListaRelContribuyenteEmpresas(uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v002.datatypes.ParamObtListaRelContribuyente[] paramObtListaRelContribuyenteEmpresas) throws java.rmi.RemoteException{
    if (wsRegEmpresaV002 == null)
      _initWsRegEmpresaV002Proxy();
    return wsRegEmpresaV002.obtListaRelContribuyenteEmpresas(paramObtListaRelContribuyenteEmpresas);
  }
  
  public uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v003.datatypes.ResultValEmpresa validarEmpresa(uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v002.datatypes.ParamValEmpresa paramValEmpresa) throws java.rmi.RemoteException{
    if (wsRegEmpresaV002 == null)
      _initWsRegEmpresaV002Proxy();
    return wsRegEmpresaV002.validarEmpresa(paramValEmpresa);
  }
  
  public uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v001.datatypes.ResultObtAtributosEspecialesEmpresa obtenerAtributosEspeciales(uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v001.datatypes.ParamObtAtributoEspecialEmpresa paramObtAtributoEspecialEmpresa) throws java.rmi.RemoteException{
    if (wsRegEmpresaV002 == null)
      _initWsRegEmpresaV002Proxy();
    return wsRegEmpresaV002.obtenerAtributosEspeciales(paramObtAtributoEspecialEmpresa);
  }
  
  public uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v001.datatypes.ResultObtenerLocales obtenerLocales(uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v001.datatypes.ParamObtenerLocales paramObtenerLocales) throws java.rmi.RemoteException{
    if (wsRegEmpresaV002 == null)
      _initWsRegEmpresaV002Proxy();
    return wsRegEmpresaV002.obtenerLocales(paramObtenerLocales);
  }
  
  public uy.gub.agesic.empresa.ws.BPS_RegEmpresa.generics.results.ResultobtVersion obtVersion() throws java.rmi.RemoteException{
    if (wsRegEmpresaV002 == null)
      _initWsRegEmpresaV002Proxy();
    return wsRegEmpresaV002.obtVersion();
  }
  
  
}