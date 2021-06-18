/**
 * WsRegEmpresaV002.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uy.gub.agesic.empresa.ws.BPS_RegEmpresa;

public interface WsRegEmpresaV002 extends java.rmi.Remote {
    public uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v002.datatypes.ResultObtContribuyenteVigente obtContribuyenteVigente(uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v002.datatypes.ParamObtContribuyenteVigente paramObtContribuyenteVigente) throws java.rmi.RemoteException;
    public uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v002.datatypes.ResultObtDomicilioFiscalPpal obtDomicilioFiscalPpal(uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v002.datatypes.ParamObtDomicilioFiscalPpal paramObtDomicilioFiscalPpal) throws java.rmi.RemoteException;
    public uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v002.datatypes.ResultObtEmpresa obtenerEmpresa(uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v002.datatypes.ParamObtEmpresa paramObtEmpresa) throws java.rmi.RemoteException;
    public uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v002.datatypes.ResultObtEstadosAportacion obtenerEstadosAportacion(uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v002.datatypes.ParamObtEstadosAportacion paramObtEstadosAportacion) throws java.rmi.RemoteException;
    public uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v001.datatypes.ResultObtenerListaEstadosAportacion obtenerListaEstadosAportacion(uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v003.datatypes.ParamObtenerEstadosAportacion[] paramObtenerListaEstadosAportacion) throws java.rmi.RemoteException;
    public uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v002.datatypes.ResultObtListaEmpresa obtenerListaEmpresa(uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v002.datatypes.ParamObtListaEmpresa paramObtListaEmpresaEmpresa) throws java.rmi.RemoteException;
    public uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v002.datatypes.ResultObtListaRelContribuyente obtenerListaRelContribuyente(uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v002.datatypes.ParamObtListaRelContribuyente paramObtListaRelContribuyente) throws java.rmi.RemoteException;
    public uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v002.datatypes.ResultObtListaRelContribuyenteEmpresas obtListaRelContribuyenteEmpresas(uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v002.datatypes.ParamObtListaRelContribuyente[] paramObtListaRelContribuyenteEmpresas) throws java.rmi.RemoteException;
    public uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v003.datatypes.ResultValEmpresa validarEmpresa(uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v002.datatypes.ParamValEmpresa paramValEmpresa) throws java.rmi.RemoteException;
    public uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v001.datatypes.ResultObtAtributosEspecialesEmpresa obtenerAtributosEspeciales(uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v001.datatypes.ParamObtAtributoEspecialEmpresa paramObtAtributoEspecialEmpresa) throws java.rmi.RemoteException;
    public uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v001.datatypes.ResultObtenerLocales obtenerLocales(uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v001.datatypes.ParamObtenerLocales paramObtenerLocales) throws java.rmi.RemoteException;
    public uy.gub.agesic.empresa.ws.BPS_RegEmpresa.generics.results.ResultobtVersion obtVersion() throws java.rmi.RemoteException;
}
