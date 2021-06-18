package uy.gub.agesic.empresa.ws.ACCE_RUPE;

public class ConsultaProveedoresProxy implements uy.gub.agesic.empresa.ws.ACCE_RUPE.ConsultaProveedores_PortType {
  private String _endpoint = null;
  private uy.gub.agesic.empresa.ws.ACCE_RUPE.ConsultaProveedores_PortType consultaProveedores_PortType = null;
  
  public ConsultaProveedoresProxy() {
    _initConsultaProveedoresProxy();
  }
  
  public ConsultaProveedoresProxy(String endpoint) {
    _endpoint = endpoint;
    _initConsultaProveedoresProxy();
  }
  
  private void _initConsultaProveedoresProxy() {
    try {
      consultaProveedores_PortType = (new uy.gub.agesic.empresa.ws.ACCE_RUPE.ConsultaProveedores_ServiceLocator()).getConsultaProveedoresPort();
      if (consultaProveedores_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)consultaProveedores_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)consultaProveedores_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (consultaProveedores_PortType != null)
      ((javax.xml.rpc.Stub)consultaProveedores_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public uy.gub.agesic.empresa.ws.ACCE_RUPE.ConsultaProveedores_PortType getConsultaProveedores_PortType() {
    if (consultaProveedores_PortType == null)
      _initConsultaProveedoresProxy();
    return consultaProveedores_PortType;
  }
  
  public uy.gub.agesic.empresa.ws.ACCE_RUPE.Comunicacion obtenerComunicacionPorId(java.lang.Integer idComunicacion, java.lang.String codigoUsuario, java.lang.Integer version) throws java.rmi.RemoteException, uy.gub.agesic.empresa.ws.ACCE_RUPE.RUPEException{
    if (consultaProveedores_PortType == null)
      _initConsultaProveedoresProxy();
    return consultaProveedores_PortType.obtenerComunicacionPorId(idComunicacion, codigoUsuario, version);
  }
  
  public uy.gub.agesic.empresa.ws.ACCE_RUPE.Articulo obtenerArticuloPorId(java.lang.Integer idArticulo, java.lang.String codigoUsuario, java.lang.Integer version) throws java.rmi.RemoteException, uy.gub.agesic.empresa.ws.ACCE_RUPE.RUPEException{
    if (consultaProveedores_PortType == null)
      _initConsultaProveedoresProxy();
    return consultaProveedores_PortType.obtenerArticuloPorId(idArticulo, codigoUsuario, version);
  }
  
  public uy.gub.agesic.empresa.ws.ACCE_RUPE.Comunicacion[] obtenerComunicacionesPorProveedorId(java.lang.Integer idProveedor, java.lang.String codigoUsuario) throws java.rmi.RemoteException, uy.gub.agesic.empresa.ws.ACCE_RUPE.RUPEException{
    if (consultaProveedores_PortType == null)
      _initConsultaProveedoresProxy();
    return consultaProveedores_PortType.obtenerComunicacionesPorProveedorId(idProveedor, codigoUsuario);
  }
  
  public java.lang.String descripcion() throws java.rmi.RemoteException{
    if (consultaProveedores_PortType == null)
      _initConsultaProveedoresProxy();
    return consultaProveedores_PortType.descripcion();
  }
  
  public uy.gub.agesic.empresa.ws.ACCE_RUPE.Proveedor[] obtenerProveedoresConCambioDeEstado(java.util.Calendar fechaIni, java.util.Calendar fechaFin, java.lang.String codigoUsuario) throws java.rmi.RemoteException, uy.gub.agesic.empresa.ws.ACCE_RUPE.RUPEException{
    if (consultaProveedores_PortType == null)
      _initConsultaProveedoresProxy();
    return consultaProveedores_PortType.obtenerProveedoresConCambioDeEstado(fechaIni, fechaFin, codigoUsuario);
  }
  
  public uy.gub.agesic.empresa.ws.ACCE_RUPE.Sancion[] obtenerSancionesProveedor(java.lang.Integer idProveedor, java.lang.String codigoUsuario) throws java.rmi.RemoteException, uy.gub.agesic.empresa.ws.ACCE_RUPE.RUPEException{
    if (consultaProveedores_PortType == null)
      _initConsultaProveedoresProxy();
    return consultaProveedores_PortType.obtenerSancionesProveedor(idProveedor, codigoUsuario);
  }
  
  public uy.gub.agesic.empresa.ws.ACCE_RUPE.CuentaBancaria obtenerCuentaBancariaPorId(java.lang.Integer idCuentaBancaria, java.lang.String codigoUsuario, java.lang.Integer version) throws java.rmi.RemoteException, uy.gub.agesic.empresa.ws.ACCE_RUPE.RUPEException{
    if (consultaProveedores_PortType == null)
      _initConsultaProveedoresProxy();
    return consultaProveedores_PortType.obtenerCuentaBancariaPorId(idCuentaBancaria, codigoUsuario, version);
  }
  
  public uy.gub.agesic.empresa.ws.ACCE_RUPE.Documento obtenerDocumentoProveedorPorId(java.lang.Integer idDocumento, java.lang.String codigoUsuario, java.lang.Integer version) throws java.rmi.RemoteException, uy.gub.agesic.empresa.ws.ACCE_RUPE.RUPEException{
    if (consultaProveedores_PortType == null)
      _initConsultaProveedoresProxy();
    return consultaProveedores_PortType.obtenerDocumentoProveedorPorId(idDocumento, codigoUsuario, version);
  }
  
  public uy.gub.agesic.empresa.ws.ACCE_RUPE.IdentificacionProveedor obtenerIdentificacionProveedorPorId(java.lang.Integer idIdentificacion, java.lang.String codigoUsuario, java.lang.Integer version) throws java.rmi.RemoteException, uy.gub.agesic.empresa.ws.ACCE_RUPE.RUPEException{
    if (consultaProveedores_PortType == null)
      _initConsultaProveedoresProxy();
    return consultaProveedores_PortType.obtenerIdentificacionProveedorPorId(idIdentificacion, codigoUsuario, version);
  }
  
  public java.lang.String version() throws java.rmi.RemoteException{
    if (consultaProveedores_PortType == null)
      _initConsultaProveedoresProxy();
    return consultaProveedores_PortType.version();
  }
  
  public uy.gub.agesic.empresa.ws.ACCE_RUPE.Cumplimiento[] obtenerCumplimientosProveedor(java.lang.Integer idProveedor, java.lang.String codigoUsuario) throws java.rmi.RemoteException, uy.gub.agesic.empresa.ws.ACCE_RUPE.RUPEException{
    if (consultaProveedores_PortType == null)
      _initConsultaProveedoresProxy();
    return consultaProveedores_PortType.obtenerCumplimientosProveedor(idProveedor, codigoUsuario);
  }
  
  public uy.gub.agesic.empresa.ws.ACCE_RUPE.Articulo[] obtenerArticulosPorProveedor(java.lang.Integer idProveedor, java.lang.String codigoUsuario) throws java.rmi.RemoteException, uy.gub.agesic.empresa.ws.ACCE_RUPE.RUPEException{
    if (consultaProveedores_PortType == null)
      _initConsultaProveedoresProxy();
    return consultaProveedores_PortType.obtenerArticulosPorProveedor(idProveedor, codigoUsuario);
  }
  
  public uy.gub.agesic.empresa.ws.ACCE_RUPE.IdentificacionProveedor[] obtenerIdentificacionesPorProveedorId(java.lang.Integer idProveedor, java.lang.String codigoUsuario) throws java.rmi.RemoteException, uy.gub.agesic.empresa.ws.ACCE_RUPE.RUPEException{
    if (consultaProveedores_PortType == null)
      _initConsultaProveedoresProxy();
    return consultaProveedores_PortType.obtenerIdentificacionesPorProveedorId(idProveedor, codigoUsuario);
  }
  
  public uy.gub.agesic.empresa.ws.ACCE_RUPE.ListaVencimientosVencimiento[] obtenerVencimientosProveedor(java.lang.Integer idProveedor, java.lang.String codigoUsuario) throws java.rmi.RemoteException, uy.gub.agesic.empresa.ws.ACCE_RUPE.RUPEException{
    if (consultaProveedores_PortType == null)
      _initConsultaProveedoresProxy();
    return consultaProveedores_PortType.obtenerVencimientosProveedor(idProveedor, codigoUsuario);
  }
  
  public uy.gub.agesic.empresa.ws.ACCE_RUPE.Proveedor obtenerProveedor(uy.gub.agesic.empresa.ws.ACCE_RUPE.ObtenerDatosProveedorEntrada idProveedorEntrada, java.lang.String codigoUsuario, java.lang.Integer version) throws java.rmi.RemoteException, uy.gub.agesic.empresa.ws.ACCE_RUPE.RUPEException{
    if (consultaProveedores_PortType == null)
      _initConsultaProveedoresProxy();
    return consultaProveedores_PortType.obtenerProveedor(idProveedorEntrada, codigoUsuario, version);
  }
  
  public uy.gub.agesic.empresa.ws.ACCE_RUPE.Proveedor[] busquedaProveedores(uy.gub.agesic.empresa.ws.ACCE_RUPE.CriterioBusquedaProveedor criterio, java.lang.String codigoUsuario) throws java.rmi.RemoteException, uy.gub.agesic.empresa.ws.ACCE_RUPE.RUPEException{
    if (consultaProveedores_PortType == null)
      _initConsultaProveedoresProxy();
    return consultaProveedores_PortType.busquedaProveedores(criterio, codigoUsuario);
  }
  
  public uy.gub.agesic.empresa.ws.ACCE_RUPE.Persona[] obtenerPersonasProveedorPorRol(java.lang.Integer idProveedor, java.lang.String codigoUsuario, java.lang.String tipoRol) throws java.rmi.RemoteException, uy.gub.agesic.empresa.ws.ACCE_RUPE.RUPEException{
    if (consultaProveedores_PortType == null)
      _initConsultaProveedoresProxy();
    return consultaProveedores_PortType.obtenerPersonasProveedorPorRol(idProveedor, codigoUsuario, tipoRol);
  }
  
  public uy.gub.agesic.empresa.ws.ACCE_RUPE.PersonaEnProveedor obtenerPersonaProveedorPorId(java.lang.Integer idPersonaProveedor, java.lang.String codigoUsuario, java.lang.Integer version) throws java.rmi.RemoteException, uy.gub.agesic.empresa.ws.ACCE_RUPE.RUPEException{
    if (consultaProveedores_PortType == null)
      _initConsultaProveedoresProxy();
    return consultaProveedores_PortType.obtenerPersonaProveedorPorId(idPersonaProveedor, codigoUsuario, version);
  }
  
  public java.lang.Integer obtenerIdProveedor(uy.gub.agesic.empresa.ws.ACCE_RUPE.IdentificacionProveedor proveedorID, java.lang.String codigoUsuario) throws java.rmi.RemoteException, uy.gub.agesic.empresa.ws.ACCE_RUPE.RUPEException{
    if (consultaProveedores_PortType == null)
      _initConsultaProveedoresProxy();
    return consultaProveedores_PortType.obtenerIdProveedor(proveedorID, codigoUsuario);
  }
  
  public uy.gub.agesic.empresa.ws.ACCE_RUPE.IdentificacionProveedor obtenerProveedorID(java.lang.Integer idProveedor, java.lang.String codigoUsuario) throws java.rmi.RemoteException, uy.gub.agesic.empresa.ws.ACCE_RUPE.RUPEException{
    if (consultaProveedores_PortType == null)
      _initConsultaProveedoresProxy();
    return consultaProveedores_PortType.obtenerProveedorID(idProveedor, codigoUsuario);
  }
  
  public uy.gub.agesic.empresa.ws.ACCE_RUPE.Sancion obtenerSancionPorId(java.lang.Integer idSancion, java.lang.String codigoUsuario, java.lang.Integer version) throws java.rmi.RemoteException, uy.gub.agesic.empresa.ws.ACCE_RUPE.RUPEException{
    if (consultaProveedores_PortType == null)
      _initConsultaProveedoresProxy();
    return consultaProveedores_PortType.obtenerSancionPorId(idSancion, codigoUsuario, version);
  }
  
  public uy.gub.agesic.empresa.ws.ACCE_RUPE.ObtenerVencimientoPorIdResponseVencimiento obtenerVencimientoPorId(java.lang.Integer idVencimiento, java.lang.String codigoUsuario, java.lang.Integer version) throws java.rmi.RemoteException, uy.gub.agesic.empresa.ws.ACCE_RUPE.RUPEException{
    if (consultaProveedores_PortType == null)
      _initConsultaProveedoresProxy();
    return consultaProveedores_PortType.obtenerVencimientoPorId(idVencimiento, codigoUsuario, version);
  }
  
  public uy.gub.agesic.empresa.ws.ACCE_RUPE.CuentaBancaria[] obtenerCuentasBancariasPorProveedor(java.lang.Integer idProveedor, java.lang.String codigoUsuario) throws java.rmi.RemoteException, uy.gub.agesic.empresa.ws.ACCE_RUPE.RUPEException{
    if (consultaProveedores_PortType == null)
      _initConsultaProveedoresProxy();
    return consultaProveedores_PortType.obtenerCuentasBancariasPorProveedor(idProveedor, codigoUsuario);
  }
  
  public uy.gub.agesic.empresa.ws.ACCE_RUPE.Cumplimiento obtenerCumplimientoPorId(java.lang.Integer idCumplimiento, java.lang.String codigoUsuario, java.lang.Integer version) throws java.rmi.RemoteException, uy.gub.agesic.empresa.ws.ACCE_RUPE.RUPEException{
    if (consultaProveedores_PortType == null)
      _initConsultaProveedoresProxy();
    return consultaProveedores_PortType.obtenerCumplimientoPorId(idCumplimiento, codigoUsuario, version);
  }
  
  public uy.gub.agesic.empresa.ws.ACCE_RUPE.Proveedor obtenerProveedorPorId(java.lang.Integer idProveedorEntrada, java.lang.String codigoUsuario, java.lang.Integer version) throws java.rmi.RemoteException, uy.gub.agesic.empresa.ws.ACCE_RUPE.RUPEException{
    if (consultaProveedores_PortType == null)
      _initConsultaProveedoresProxy();
    return consultaProveedores_PortType.obtenerProveedorPorId(idProveedorEntrada, codigoUsuario, version);
  }
  
  public uy.gub.agesic.empresa.ws.ACCE_RUPE.IdDocumento[] obtenerDocumentosProveedor(uy.gub.agesic.empresa.ws.ACCE_RUPE.ObtenerDocumentosProveedorEntrada criteriaDocumento) throws java.rmi.RemoteException, uy.gub.agesic.empresa.ws.ACCE_RUPE.RUPEException{
    if (consultaProveedores_PortType == null)
      _initConsultaProveedoresProxy();
    return consultaProveedores_PortType.obtenerDocumentosProveedor(criteriaDocumento);
  }
  
  
}