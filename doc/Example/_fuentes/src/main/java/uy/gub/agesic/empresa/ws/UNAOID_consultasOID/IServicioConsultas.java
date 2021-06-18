/**
 * IServicioConsultas.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uy.gub.agesic.empresa.ws.UNAOID_consultasOID;

public interface IServicioConsultas extends java.rmi.Remote {
    public java.lang.String obtenerInfoOidObjeto(java.lang.String pOidObjeto, java.lang.Boolean pRetornaRUTConCeroAlInicio) throws java.rmi.RemoteException;
    public java.lang.String obtenerInfoOidOrganizacion(java.lang.String pOidOrganizacion, java.lang.Boolean pRetornaRUTConCeroAlInicio) throws java.rmi.RemoteException;
    public java.lang.String obtenerInfoOidPersona(java.lang.String pOidPersona) throws java.rmi.RemoteException;
    public java.lang.String obtenerNombreFamiliaObjeto(java.lang.String pCodigoItem) throws java.rmi.RemoteException;
    public java.lang.String realizarBusqueda(java.lang.Integer pTipoBusqueda, java.lang.String pTextoBusqueda, java.lang.Boolean pRetornaRUTConCeroAlInicio) throws java.rmi.RemoteException;
    public java.lang.String version() throws java.rmi.RemoteException;
}
