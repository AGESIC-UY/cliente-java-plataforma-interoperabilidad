/**
 * ConsultaProveedores_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uy.gub.agesic.empresa.ws.ACCE_RUPE;

public interface ConsultaProveedores_PortType extends java.rmi.Remote {
    public uy.gub.agesic.empresa.ws.ACCE_RUPE.Comunicacion obtenerComunicacionPorId(java.lang.Integer idComunicacion, java.lang.String codigoUsuario, java.lang.Integer version) throws java.rmi.RemoteException, uy.gub.agesic.empresa.ws.ACCE_RUPE.RUPEException;
    public uy.gub.agesic.empresa.ws.ACCE_RUPE.Articulo obtenerArticuloPorId(java.lang.Integer idArticulo, java.lang.String codigoUsuario, java.lang.Integer version) throws java.rmi.RemoteException, uy.gub.agesic.empresa.ws.ACCE_RUPE.RUPEException;
    public uy.gub.agesic.empresa.ws.ACCE_RUPE.Comunicacion[] obtenerComunicacionesPorProveedorId(java.lang.Integer idProveedor, java.lang.String codigoUsuario) throws java.rmi.RemoteException, uy.gub.agesic.empresa.ws.ACCE_RUPE.RUPEException;
    public java.lang.String descripcion() throws java.rmi.RemoteException;
    public uy.gub.agesic.empresa.ws.ACCE_RUPE.Proveedor[] obtenerProveedoresConCambioDeEstado(java.util.Calendar fechaIni, java.util.Calendar fechaFin, java.lang.String codigoUsuario) throws java.rmi.RemoteException, uy.gub.agesic.empresa.ws.ACCE_RUPE.RUPEException;
    public uy.gub.agesic.empresa.ws.ACCE_RUPE.Sancion[] obtenerSancionesProveedor(java.lang.Integer idProveedor, java.lang.String codigoUsuario) throws java.rmi.RemoteException, uy.gub.agesic.empresa.ws.ACCE_RUPE.RUPEException;
    public uy.gub.agesic.empresa.ws.ACCE_RUPE.CuentaBancaria obtenerCuentaBancariaPorId(java.lang.Integer idCuentaBancaria, java.lang.String codigoUsuario, java.lang.Integer version) throws java.rmi.RemoteException, uy.gub.agesic.empresa.ws.ACCE_RUPE.RUPEException;
    public uy.gub.agesic.empresa.ws.ACCE_RUPE.Documento obtenerDocumentoProveedorPorId(java.lang.Integer idDocumento, java.lang.String codigoUsuario, java.lang.Integer version) throws java.rmi.RemoteException, uy.gub.agesic.empresa.ws.ACCE_RUPE.RUPEException;
    public uy.gub.agesic.empresa.ws.ACCE_RUPE.IdentificacionProveedor obtenerIdentificacionProveedorPorId(java.lang.Integer idIdentificacion, java.lang.String codigoUsuario, java.lang.Integer version) throws java.rmi.RemoteException, uy.gub.agesic.empresa.ws.ACCE_RUPE.RUPEException;
    public java.lang.String version() throws java.rmi.RemoteException;
    public uy.gub.agesic.empresa.ws.ACCE_RUPE.Cumplimiento[] obtenerCumplimientosProveedor(java.lang.Integer idProveedor, java.lang.String codigoUsuario) throws java.rmi.RemoteException, uy.gub.agesic.empresa.ws.ACCE_RUPE.RUPEException;
    public uy.gub.agesic.empresa.ws.ACCE_RUPE.Articulo[] obtenerArticulosPorProveedor(java.lang.Integer idProveedor, java.lang.String codigoUsuario) throws java.rmi.RemoteException, uy.gub.agesic.empresa.ws.ACCE_RUPE.RUPEException;
    public uy.gub.agesic.empresa.ws.ACCE_RUPE.IdentificacionProveedor[] obtenerIdentificacionesPorProveedorId(java.lang.Integer idProveedor, java.lang.String codigoUsuario) throws java.rmi.RemoteException, uy.gub.agesic.empresa.ws.ACCE_RUPE.RUPEException;
    public uy.gub.agesic.empresa.ws.ACCE_RUPE.ListaVencimientosVencimiento[] obtenerVencimientosProveedor(java.lang.Integer idProveedor, java.lang.String codigoUsuario) throws java.rmi.RemoteException, uy.gub.agesic.empresa.ws.ACCE_RUPE.RUPEException;
    public uy.gub.agesic.empresa.ws.ACCE_RUPE.Proveedor obtenerProveedor(uy.gub.agesic.empresa.ws.ACCE_RUPE.ObtenerDatosProveedorEntrada idProveedorEntrada, java.lang.String codigoUsuario, java.lang.Integer version) throws java.rmi.RemoteException, uy.gub.agesic.empresa.ws.ACCE_RUPE.RUPEException;
    public uy.gub.agesic.empresa.ws.ACCE_RUPE.Proveedor[] busquedaProveedores(uy.gub.agesic.empresa.ws.ACCE_RUPE.CriterioBusquedaProveedor criterio, java.lang.String codigoUsuario) throws java.rmi.RemoteException, uy.gub.agesic.empresa.ws.ACCE_RUPE.RUPEException;
    public uy.gub.agesic.empresa.ws.ACCE_RUPE.Persona[] obtenerPersonasProveedorPorRol(java.lang.Integer idProveedor, java.lang.String codigoUsuario, java.lang.String tipoRol) throws java.rmi.RemoteException, uy.gub.agesic.empresa.ws.ACCE_RUPE.RUPEException;
    public uy.gub.agesic.empresa.ws.ACCE_RUPE.PersonaEnProveedor obtenerPersonaProveedorPorId(java.lang.Integer idPersonaProveedor, java.lang.String codigoUsuario, java.lang.Integer version) throws java.rmi.RemoteException, uy.gub.agesic.empresa.ws.ACCE_RUPE.RUPEException;
    public java.lang.Integer obtenerIdProveedor(uy.gub.agesic.empresa.ws.ACCE_RUPE.IdentificacionProveedor proveedorID, java.lang.String codigoUsuario) throws java.rmi.RemoteException, uy.gub.agesic.empresa.ws.ACCE_RUPE.RUPEException;
    public uy.gub.agesic.empresa.ws.ACCE_RUPE.IdentificacionProveedor obtenerProveedorID(java.lang.Integer idProveedor, java.lang.String codigoUsuario) throws java.rmi.RemoteException, uy.gub.agesic.empresa.ws.ACCE_RUPE.RUPEException;
    public uy.gub.agesic.empresa.ws.ACCE_RUPE.Sancion obtenerSancionPorId(java.lang.Integer idSancion, java.lang.String codigoUsuario, java.lang.Integer version) throws java.rmi.RemoteException, uy.gub.agesic.empresa.ws.ACCE_RUPE.RUPEException;
    public uy.gub.agesic.empresa.ws.ACCE_RUPE.ObtenerVencimientoPorIdResponseVencimiento obtenerVencimientoPorId(java.lang.Integer idVencimiento, java.lang.String codigoUsuario, java.lang.Integer version) throws java.rmi.RemoteException, uy.gub.agesic.empresa.ws.ACCE_RUPE.RUPEException;
    public uy.gub.agesic.empresa.ws.ACCE_RUPE.CuentaBancaria[] obtenerCuentasBancariasPorProveedor(java.lang.Integer idProveedor, java.lang.String codigoUsuario) throws java.rmi.RemoteException, uy.gub.agesic.empresa.ws.ACCE_RUPE.RUPEException;
    public uy.gub.agesic.empresa.ws.ACCE_RUPE.Cumplimiento obtenerCumplimientoPorId(java.lang.Integer idCumplimiento, java.lang.String codigoUsuario, java.lang.Integer version) throws java.rmi.RemoteException, uy.gub.agesic.empresa.ws.ACCE_RUPE.RUPEException;
    public uy.gub.agesic.empresa.ws.ACCE_RUPE.Proveedor obtenerProveedorPorId(java.lang.Integer idProveedorEntrada, java.lang.String codigoUsuario, java.lang.Integer version) throws java.rmi.RemoteException, uy.gub.agesic.empresa.ws.ACCE_RUPE.RUPEException;
    public uy.gub.agesic.empresa.ws.ACCE_RUPE.IdDocumento[] obtenerDocumentosProveedor(uy.gub.agesic.empresa.ws.ACCE_RUPE.ObtenerDocumentosProveedorEntrada criteriaDocumento) throws java.rmi.RemoteException, uy.gub.agesic.empresa.ws.ACCE_RUPE.RUPEException;
}
