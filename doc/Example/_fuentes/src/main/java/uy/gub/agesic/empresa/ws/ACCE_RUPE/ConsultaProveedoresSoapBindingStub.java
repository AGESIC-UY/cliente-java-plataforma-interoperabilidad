/**
 * ConsultaProveedoresSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uy.gub.agesic.empresa.ws.ACCE_RUPE;

public class ConsultaProveedoresSoapBindingStub extends org.apache.axis.client.Stub implements uy.gub.agesic.empresa.ws.ACCE_RUPE.ConsultaProveedores_PortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[26];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("obtenerComunicacionPorId");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "idComunicacion"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "codigoUsuario"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "version"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "comunicacion"));
        oper.setReturnClass(uy.gub.agesic.empresa.ws.ACCE_RUPE.Comunicacion.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "comunicacion"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "RUPEException"),
                      "uy.gub.acce.rupe.ws.RUPEException",
                      new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "RUPEException"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("obtenerArticuloPorId");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "idArticulo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "codigoUsuario"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "version"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "articulo"));
        oper.setReturnClass(uy.gub.agesic.empresa.ws.ACCE_RUPE.Articulo.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "articulo"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "RUPEException"),
                      "uy.gub.acce.rupe.ws.RUPEException",
                      new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "RUPEException"), 
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("descripcion");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "descripcion"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("obtenerComunicacionesPorProveedorId");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "idProveedor"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "codigoUsuario"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "listaComunicacion"));
        oper.setReturnClass(uy.gub.agesic.empresa.ws.ACCE_RUPE.Comunicacion[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "listaComunicacion"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "comunicacion"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "RUPEException"),
                      "uy.gub.acce.rupe.ws.RUPEException",
                      new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "RUPEException"), 
                      true
                     ));
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("obtenerProveedoresConCambioDeEstado");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "fechaIni"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "fechaFin"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "codigoUsuario"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "listaProveedores"));
        oper.setReturnClass(uy.gub.agesic.empresa.ws.ACCE_RUPE.Proveedor[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "listaProveedores"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "proveedores"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "RUPEException"),
                      "uy.gub.acce.rupe.ws.RUPEException",
                      new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "RUPEException"), 
                      true
                     ));
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("obtenerSancionesProveedor");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "idProveedor"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "codigoUsuario"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "listaSanciones"));
        oper.setReturnClass(uy.gub.agesic.empresa.ws.ACCE_RUPE.Sancion[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "listaSanciones"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "sancion"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "RUPEException"),
                      "uy.gub.acce.rupe.ws.RUPEException",
                      new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "RUPEException"), 
                      true
                     ));
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("obtenerCuentaBancariaPorId");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "idCuentaBancaria"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "codigoUsuario"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "version"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "cuentaBancaria"));
        oper.setReturnClass(uy.gub.agesic.empresa.ws.ACCE_RUPE.CuentaBancaria.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "cuentaBancaria"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "RUPEException"),
                      "uy.gub.acce.rupe.ws.RUPEException",
                      new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "RUPEException"), 
                      true
                     ));
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("obtenerDocumentoProveedorPorId");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "idDocumento"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "codigoUsuario"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "version"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "documento"));
        oper.setReturnClass(uy.gub.agesic.empresa.ws.ACCE_RUPE.Documento.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "documentoProveedor"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "RUPEException"),
                      "uy.gub.acce.rupe.ws.RUPEException",
                      new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "RUPEException"), 
                      true
                     ));
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("obtenerIdentificacionProveedorPorId");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "idIdentificacion"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "codigoUsuario"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "version"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "identificacionProveedor"));
        oper.setReturnClass(uy.gub.agesic.empresa.ws.ACCE_RUPE.IdentificacionProveedor.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "identificacion"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "RUPEException"),
                      "uy.gub.acce.rupe.ws.RUPEException",
                      new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "RUPEException"), 
                      true
                     ));
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("version");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "version"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("obtenerCumplimientosProveedor");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "idProveedor"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "codigoUsuario"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "listaCumplimientos"));
        oper.setReturnClass(uy.gub.agesic.empresa.ws.ACCE_RUPE.Cumplimiento[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "listaCumplimientos"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "cumplimiento"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "RUPEException"),
                      "uy.gub.acce.rupe.ws.RUPEException",
                      new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "RUPEException"), 
                      true
                     ));
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("obtenerArticulosPorProveedor");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "idProveedor"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "codigoUsuario"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "listaArticulos"));
        oper.setReturnClass(uy.gub.agesic.empresa.ws.ACCE_RUPE.Articulo[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "listaArticulos"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "producto"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "RUPEException"),
                      "uy.gub.acce.rupe.ws.RUPEException",
                      new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "RUPEException"), 
                      true
                     ));
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("obtenerIdentificacionesPorProveedorId");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "idProveedor"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "codigoUsuario"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "listaIdentificacionesProveedor"));
        oper.setReturnClass(uy.gub.agesic.empresa.ws.ACCE_RUPE.IdentificacionProveedor[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "listaIdentificacion"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "identificacionProveedor"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "RUPEException"),
                      "uy.gub.acce.rupe.ws.RUPEException",
                      new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "RUPEException"), 
                      true
                     ));
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("obtenerVencimientosProveedor");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "idProveedor"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "codigoUsuario"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "listaVencimientos"));
        oper.setReturnClass(uy.gub.agesic.empresa.ws.ACCE_RUPE.ListaVencimientosVencimiento[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "listaVencimientos"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "vencimiento"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "RUPEException"),
                      "uy.gub.acce.rupe.ws.RUPEException",
                      new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "RUPEException"), 
                      true
                     ));
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("obtenerProveedor");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "idProveedorEntrada"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "obtenerDatosProveedorEntrada"), uy.gub.agesic.empresa.ws.ACCE_RUPE.ObtenerDatosProveedorEntrada.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "codigoUsuario"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "version"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "proveedor"));
        oper.setReturnClass(uy.gub.agesic.empresa.ws.ACCE_RUPE.Proveedor.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "proveedor"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "RUPEException"),
                      "uy.gub.acce.rupe.ws.RUPEException",
                      new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "RUPEException"), 
                      true
                     ));
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("busquedaProveedores");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "criterio"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "criterioBusquedaProveedor"), uy.gub.agesic.empresa.ws.ACCE_RUPE.CriterioBusquedaProveedor.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "codigoUsuario"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "listaProveedores"));
        oper.setReturnClass(uy.gub.agesic.empresa.ws.ACCE_RUPE.Proveedor[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "listaProveedores"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "proveedores"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "RUPEException"),
                      "uy.gub.acce.rupe.ws.RUPEException",
                      new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "RUPEException"), 
                      true
                     ));
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("obtenerIdProveedor");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "proveedorID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "identificacionProveedor"), uy.gub.agesic.empresa.ws.ACCE_RUPE.IdentificacionProveedor.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "codigoUsuario"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(java.lang.Integer.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "proveedorId"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "RUPEException"),
                      "uy.gub.acce.rupe.ws.RUPEException",
                      new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "RUPEException"), 
                      true
                     ));
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("obtenerPersonaProveedorPorId");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "idPersonaProveedor"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "codigoUsuario"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "version"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "personaEnProveedor"));
        oper.setReturnClass(uy.gub.agesic.empresa.ws.ACCE_RUPE.PersonaEnProveedor.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "persona"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "RUPEException"),
                      "uy.gub.acce.rupe.ws.RUPEException",
                      new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "RUPEException"), 
                      true
                     ));
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("obtenerPersonasProveedorPorRol");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "idProveedor"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "codigoUsuario"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "tipoRol"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "listaPersonas"));
        oper.setReturnClass(uy.gub.agesic.empresa.ws.ACCE_RUPE.Persona[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "listaPersonas"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "persona"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "RUPEException"),
                      "uy.gub.acce.rupe.ws.RUPEException",
                      new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "RUPEException"), 
                      true
                     ));
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("obtenerProveedorID");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "idProveedor"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "codigoUsuario"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "identificacionProveedor"));
        oper.setReturnClass(uy.gub.agesic.empresa.ws.ACCE_RUPE.IdentificacionProveedor.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "identificacionProveedor"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "RUPEException"),
                      "uy.gub.acce.rupe.ws.RUPEException",
                      new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "RUPEException"), 
                      true
                     ));
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("obtenerSancionPorId");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "idSancion"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "codigoUsuario"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "version"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "sancion"));
        oper.setReturnClass(uy.gub.agesic.empresa.ws.ACCE_RUPE.Sancion.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "sancion"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "RUPEException"),
                      "uy.gub.acce.rupe.ws.RUPEException",
                      new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "RUPEException"), 
                      true
                     ));
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("obtenerVencimientoPorId");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "idVencimiento"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "codigoUsuario"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "version"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", ">obtenerVencimientoPorIdResponse>vencimiento"));
        oper.setReturnClass(uy.gub.agesic.empresa.ws.ACCE_RUPE.ObtenerVencimientoPorIdResponseVencimiento.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "vencimiento"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "RUPEException"),
                      "uy.gub.acce.rupe.ws.RUPEException",
                      new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "RUPEException"), 
                      true
                     ));
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("obtenerCuentasBancariasPorProveedor");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "idProveedor"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "codigoUsuario"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "listaCuentasBancarias"));
        oper.setReturnClass(uy.gub.agesic.empresa.ws.ACCE_RUPE.CuentaBancaria[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "cuentasBancarias"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "cuentaBancaria"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "RUPEException"),
                      "uy.gub.acce.rupe.ws.RUPEException",
                      new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "RUPEException"), 
                      true
                     ));
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("obtenerCumplimientoPorId");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "idCumplimiento"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "codigoUsuario"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "version"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "cumplimiento"));
        oper.setReturnClass(uy.gub.agesic.empresa.ws.ACCE_RUPE.Cumplimiento.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "cumplimiento"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "RUPEException"),
                      "uy.gub.acce.rupe.ws.RUPEException",
                      new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "RUPEException"), 
                      true
                     ));
        _operations[23] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("obtenerProveedorPorId");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "idProveedorEntrada"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "codigoUsuario"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "version"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "proveedor"));
        oper.setReturnClass(uy.gub.agesic.empresa.ws.ACCE_RUPE.Proveedor.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "proveedor"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "RUPEException"),
                      "uy.gub.acce.rupe.ws.RUPEException",
                      new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "RUPEException"), 
                      true
                     ));
        _operations[24] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("obtenerDocumentosProveedor");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "criteriaDocumento"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "obtenerDocumentosProveedorEntrada"), uy.gub.agesic.empresa.ws.ACCE_RUPE.ObtenerDocumentosProveedorEntrada.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "idDocumento"));
        oper.setReturnClass(uy.gub.agesic.empresa.ws.ACCE_RUPE.IdDocumento[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "listaDocumentos"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "RUPEException"),
                      "uy.gub.acce.rupe.ws.RUPEException",
                      new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "RUPEException"), 
                      true
                     ));
        _operations[25] = oper;

    }

    public ConsultaProveedoresSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public ConsultaProveedoresSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public ConsultaProveedoresSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", ">listaVencimientos>vencimiento");
            cachedSerQNames.add(qName);
            cls = uy.gub.agesic.empresa.ws.ACCE_RUPE.ListaVencimientosVencimiento.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", ">obtenerVencimientoPorIdResponse>vencimiento");
            cachedSerQNames.add(qName);
            cls = uy.gub.agesic.empresa.ws.ACCE_RUPE.ObtenerVencimientoPorIdResponseVencimiento.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "alcance");
            cachedSerQNames.add(qName);
            cls = uy.gub.agesic.empresa.ws.ACCE_RUPE.Alcance.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "articulo");
            cachedSerQNames.add(qName);
            cls = uy.gub.agesic.empresa.ws.ACCE_RUPE.Articulo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "comunicacion");
            cachedSerQNames.add(qName);
            cls = uy.gub.agesic.empresa.ws.ACCE_RUPE.Comunicacion.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "criterioBusquedaProveedor");
            cachedSerQNames.add(qName);
            cls = uy.gub.agesic.empresa.ws.ACCE_RUPE.CriterioBusquedaProveedor.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "cuentaBancaria");
            cachedSerQNames.add(qName);
            cls = uy.gub.agesic.empresa.ws.ACCE_RUPE.CuentaBancaria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "cumplimiento");
            cachedSerQNames.add(qName);
            cls = uy.gub.agesic.empresa.ws.ACCE_RUPE.Cumplimiento.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "documento");
            cachedSerQNames.add(qName);
            cls = uy.gub.agesic.empresa.ws.ACCE_RUPE.Documento.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "domicilio");
            cachedSerQNames.add(qName);
            cls = uy.gub.agesic.empresa.ws.ACCE_RUPE.Domicilio.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "estadoDato");
            cachedSerQNames.add(qName);
            cls = uy.gub.agesic.empresa.ws.ACCE_RUPE.EstadoDato.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "estadoProveedor");
            cachedSerQNames.add(qName);
            cls = uy.gub.agesic.empresa.ws.ACCE_RUPE.EstadoProveedor.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "idDocumento");
            cachedSerQNames.add(qName);
            cls = uy.gub.agesic.empresa.ws.ACCE_RUPE.IdDocumento.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "identificaciones");
            cachedSerQNames.add(qName);
            cls = uy.gub.agesic.empresa.ws.ACCE_RUPE.IdentificacionProveedor[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "identificacionProveedor");
            qName2 = new javax.xml.namespace.QName("", "identificaciones");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "identificacionPersona");
            cachedSerQNames.add(qName);
            cls = uy.gub.agesic.empresa.ws.ACCE_RUPE.IdentificacionPersona.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "identificacionProveedor");
            cachedSerQNames.add(qName);
            cls = uy.gub.agesic.empresa.ws.ACCE_RUPE.IdentificacionProveedor.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "listaArticulos");
            cachedSerQNames.add(qName);
            cls = uy.gub.agesic.empresa.ws.ACCE_RUPE.Articulo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "articulo");
            qName2 = new javax.xml.namespace.QName("", "producto");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "listaAtribuciones");
            cachedSerQNames.add(qName);
            cls = uy.gub.agesic.empresa.ws.ACCE_RUPE.RolYAtribuciones[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "rolYAtribuciones");
            qName2 = new javax.xml.namespace.QName("", "listaAtribuciones");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "listaComunicacion");
            cachedSerQNames.add(qName);
            cls = uy.gub.agesic.empresa.ws.ACCE_RUPE.Comunicacion[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "comunicacion");
            qName2 = new javax.xml.namespace.QName("", "comunicacion");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "listaCuentasBancarias");
            cachedSerQNames.add(qName);
            cls = uy.gub.agesic.empresa.ws.ACCE_RUPE.CuentaBancaria[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "cuentaBancaria");
            qName2 = new javax.xml.namespace.QName("", "cuentaBancaria");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "listaCumplimientos");
            cachedSerQNames.add(qName);
            cls = uy.gub.agesic.empresa.ws.ACCE_RUPE.Cumplimiento[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "cumplimiento");
            qName2 = new javax.xml.namespace.QName("", "cumplimiento");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "listaIDDocumentos");
            cachedSerQNames.add(qName);
            cls = uy.gub.agesic.empresa.ws.ACCE_RUPE.IdDocumento[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "idDocumento");
            qName2 = new javax.xml.namespace.QName("", "listaIdDocumento");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "listaIdentificacionesProveedor");
            cachedSerQNames.add(qName);
            cls = uy.gub.agesic.empresa.ws.ACCE_RUPE.IdentificacionProveedor[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "identificacionProveedor");
            qName2 = new javax.xml.namespace.QName("", "identificacionProveedor");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "listaPersonas");
            cachedSerQNames.add(qName);
            cls = uy.gub.agesic.empresa.ws.ACCE_RUPE.Persona[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "persona");
            qName2 = new javax.xml.namespace.QName("", "persona");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "listaProveedores");
            cachedSerQNames.add(qName);
            cls = uy.gub.agesic.empresa.ws.ACCE_RUPE.Proveedor[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "proveedor");
            qName2 = new javax.xml.namespace.QName("", "proveedores");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "listaSanciones");
            cachedSerQNames.add(qName);
            cls = uy.gub.agesic.empresa.ws.ACCE_RUPE.Sancion[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "sancion");
            qName2 = new javax.xml.namespace.QName("", "sancion");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "listaVencimientos");
            cachedSerQNames.add(qName);
            cls = uy.gub.agesic.empresa.ws.ACCE_RUPE.ListaVencimientosVencimiento[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", ">listaVencimientos>vencimiento");
            qName2 = new javax.xml.namespace.QName("", "vencimiento");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "mensaje");
            cachedSerQNames.add(qName);
            cls = uy.gub.agesic.empresa.ws.ACCE_RUPE.Mensaje.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "obtenerDatosProveedorEntrada");
            cachedSerQNames.add(qName);
            cls = uy.gub.agesic.empresa.ws.ACCE_RUPE.ObtenerDatosProveedorEntrada.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "obtenerDocumentosProveedorEntrada");
            cachedSerQNames.add(qName);
            cls = uy.gub.agesic.empresa.ws.ACCE_RUPE.ObtenerDocumentosProveedorEntrada.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "persona");
            cachedSerQNames.add(qName);
            cls = uy.gub.agesic.empresa.ws.ACCE_RUPE.Persona.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "personaEnProveedor");
            cachedSerQNames.add(qName);
            cls = uy.gub.agesic.empresa.ws.ACCE_RUPE.PersonaEnProveedor.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "proveedor");
            cachedSerQNames.add(qName);
            cls = uy.gub.agesic.empresa.ws.ACCE_RUPE.Proveedor.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "rolYAtribuciones");
            cachedSerQNames.add(qName);
            cls = uy.gub.agesic.empresa.ws.ACCE_RUPE.RolYAtribuciones.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "RUPEException");
            cachedSerQNames.add(qName);
            cls = uy.gub.agesic.empresa.ws.ACCE_RUPE.RUPEException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "sancion");
            cachedSerQNames.add(qName);
            cls = uy.gub.agesic.empresa.ws.ACCE_RUPE.Sancion.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public uy.gub.agesic.empresa.ws.ACCE_RUPE.Comunicacion obtenerComunicacionPorId(java.lang.Integer idComunicacion, java.lang.String codigoUsuario, java.lang.Integer version) throws java.rmi.RemoteException, uy.gub.agesic.empresa.ws.ACCE_RUPE.RUPEException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "obtenerComunicacionPorId"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {idComunicacion, codigoUsuario, version});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (uy.gub.agesic.empresa.ws.ACCE_RUPE.Comunicacion) _resp;
            } catch (java.lang.Exception _exception) {
                return (uy.gub.agesic.empresa.ws.ACCE_RUPE.Comunicacion) org.apache.axis.utils.JavaUtils.convert(_resp, uy.gub.agesic.empresa.ws.ACCE_RUPE.Comunicacion.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof uy.gub.agesic.empresa.ws.ACCE_RUPE.RUPEException) {
              throw (uy.gub.agesic.empresa.ws.ACCE_RUPE.RUPEException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public uy.gub.agesic.empresa.ws.ACCE_RUPE.Articulo obtenerArticuloPorId(java.lang.Integer idArticulo, java.lang.String codigoUsuario, java.lang.Integer version) throws java.rmi.RemoteException, uy.gub.agesic.empresa.ws.ACCE_RUPE.RUPEException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "obtenerArticuloPorId"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {idArticulo, codigoUsuario, version});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (uy.gub.agesic.empresa.ws.ACCE_RUPE.Articulo) _resp;
            } catch (java.lang.Exception _exception) {
                return (uy.gub.agesic.empresa.ws.ACCE_RUPE.Articulo) org.apache.axis.utils.JavaUtils.convert(_resp, uy.gub.agesic.empresa.ws.ACCE_RUPE.Articulo.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof uy.gub.agesic.empresa.ws.ACCE_RUPE.RUPEException) {
              throw (uy.gub.agesic.empresa.ws.ACCE_RUPE.RUPEException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String descripcion() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "descripcion"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public uy.gub.agesic.empresa.ws.ACCE_RUPE.Comunicacion[] obtenerComunicacionesPorProveedorId(java.lang.Integer idProveedor, java.lang.String codigoUsuario) throws java.rmi.RemoteException, uy.gub.agesic.empresa.ws.ACCE_RUPE.RUPEException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "obtenerComunicacionesPorProveedorId"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {idProveedor, codigoUsuario});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (uy.gub.agesic.empresa.ws.ACCE_RUPE.Comunicacion[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (uy.gub.agesic.empresa.ws.ACCE_RUPE.Comunicacion[]) org.apache.axis.utils.JavaUtils.convert(_resp, uy.gub.agesic.empresa.ws.ACCE_RUPE.Comunicacion[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof uy.gub.agesic.empresa.ws.ACCE_RUPE.RUPEException) {
              throw (uy.gub.agesic.empresa.ws.ACCE_RUPE.RUPEException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public uy.gub.agesic.empresa.ws.ACCE_RUPE.Proveedor[] obtenerProveedoresConCambioDeEstado(java.util.Calendar fechaIni, java.util.Calendar fechaFin, java.lang.String codigoUsuario) throws java.rmi.RemoteException, uy.gub.agesic.empresa.ws.ACCE_RUPE.RUPEException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "obtenerProveedoresConCambioDeEstado"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {fechaIni, fechaFin, codigoUsuario});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (uy.gub.agesic.empresa.ws.ACCE_RUPE.Proveedor[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (uy.gub.agesic.empresa.ws.ACCE_RUPE.Proveedor[]) org.apache.axis.utils.JavaUtils.convert(_resp, uy.gub.agesic.empresa.ws.ACCE_RUPE.Proveedor[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof uy.gub.agesic.empresa.ws.ACCE_RUPE.RUPEException) {
              throw (uy.gub.agesic.empresa.ws.ACCE_RUPE.RUPEException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public uy.gub.agesic.empresa.ws.ACCE_RUPE.Sancion[] obtenerSancionesProveedor(java.lang.Integer idProveedor, java.lang.String codigoUsuario) throws java.rmi.RemoteException, uy.gub.agesic.empresa.ws.ACCE_RUPE.RUPEException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "obtenerSancionesProveedor"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {idProveedor, codigoUsuario});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (uy.gub.agesic.empresa.ws.ACCE_RUPE.Sancion[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (uy.gub.agesic.empresa.ws.ACCE_RUPE.Sancion[]) org.apache.axis.utils.JavaUtils.convert(_resp, uy.gub.agesic.empresa.ws.ACCE_RUPE.Sancion[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof uy.gub.agesic.empresa.ws.ACCE_RUPE.RUPEException) {
              throw (uy.gub.agesic.empresa.ws.ACCE_RUPE.RUPEException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public uy.gub.agesic.empresa.ws.ACCE_RUPE.CuentaBancaria obtenerCuentaBancariaPorId(java.lang.Integer idCuentaBancaria, java.lang.String codigoUsuario, java.lang.Integer version) throws java.rmi.RemoteException, uy.gub.agesic.empresa.ws.ACCE_RUPE.RUPEException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "obtenerCuentaBancariaPorId"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {idCuentaBancaria, codigoUsuario, version});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (uy.gub.agesic.empresa.ws.ACCE_RUPE.CuentaBancaria) _resp;
            } catch (java.lang.Exception _exception) {
                return (uy.gub.agesic.empresa.ws.ACCE_RUPE.CuentaBancaria) org.apache.axis.utils.JavaUtils.convert(_resp, uy.gub.agesic.empresa.ws.ACCE_RUPE.CuentaBancaria.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof uy.gub.agesic.empresa.ws.ACCE_RUPE.RUPEException) {
              throw (uy.gub.agesic.empresa.ws.ACCE_RUPE.RUPEException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public uy.gub.agesic.empresa.ws.ACCE_RUPE.Documento obtenerDocumentoProveedorPorId(java.lang.Integer idDocumento, java.lang.String codigoUsuario, java.lang.Integer version) throws java.rmi.RemoteException, uy.gub.agesic.empresa.ws.ACCE_RUPE.RUPEException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "obtenerDocumentoProveedorPorId"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {idDocumento, codigoUsuario, version});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (uy.gub.agesic.empresa.ws.ACCE_RUPE.Documento) _resp;
            } catch (java.lang.Exception _exception) {
                return (uy.gub.agesic.empresa.ws.ACCE_RUPE.Documento) org.apache.axis.utils.JavaUtils.convert(_resp, uy.gub.agesic.empresa.ws.ACCE_RUPE.Documento.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof uy.gub.agesic.empresa.ws.ACCE_RUPE.RUPEException) {
              throw (uy.gub.agesic.empresa.ws.ACCE_RUPE.RUPEException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public uy.gub.agesic.empresa.ws.ACCE_RUPE.IdentificacionProveedor obtenerIdentificacionProveedorPorId(java.lang.Integer idIdentificacion, java.lang.String codigoUsuario, java.lang.Integer version) throws java.rmi.RemoteException, uy.gub.agesic.empresa.ws.ACCE_RUPE.RUPEException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "obtenerIdentificacionProveedorPorId"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {idIdentificacion, codigoUsuario, version});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (uy.gub.agesic.empresa.ws.ACCE_RUPE.IdentificacionProveedor) _resp;
            } catch (java.lang.Exception _exception) {
                return (uy.gub.agesic.empresa.ws.ACCE_RUPE.IdentificacionProveedor) org.apache.axis.utils.JavaUtils.convert(_resp, uy.gub.agesic.empresa.ws.ACCE_RUPE.IdentificacionProveedor.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof uy.gub.agesic.empresa.ws.ACCE_RUPE.RUPEException) {
              throw (uy.gub.agesic.empresa.ws.ACCE_RUPE.RUPEException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String version() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "version"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public uy.gub.agesic.empresa.ws.ACCE_RUPE.Cumplimiento[] obtenerCumplimientosProveedor(java.lang.Integer idProveedor, java.lang.String codigoUsuario) throws java.rmi.RemoteException, uy.gub.agesic.empresa.ws.ACCE_RUPE.RUPEException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "obtenerCumplimientosProveedor"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {idProveedor, codigoUsuario});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (uy.gub.agesic.empresa.ws.ACCE_RUPE.Cumplimiento[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (uy.gub.agesic.empresa.ws.ACCE_RUPE.Cumplimiento[]) org.apache.axis.utils.JavaUtils.convert(_resp, uy.gub.agesic.empresa.ws.ACCE_RUPE.Cumplimiento[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof uy.gub.agesic.empresa.ws.ACCE_RUPE.RUPEException) {
              throw (uy.gub.agesic.empresa.ws.ACCE_RUPE.RUPEException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public uy.gub.agesic.empresa.ws.ACCE_RUPE.Articulo[] obtenerArticulosPorProveedor(java.lang.Integer idProveedor, java.lang.String codigoUsuario) throws java.rmi.RemoteException, uy.gub.agesic.empresa.ws.ACCE_RUPE.RUPEException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "obtenerArticulosPorProveedor"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {idProveedor, codigoUsuario});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (uy.gub.agesic.empresa.ws.ACCE_RUPE.Articulo[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (uy.gub.agesic.empresa.ws.ACCE_RUPE.Articulo[]) org.apache.axis.utils.JavaUtils.convert(_resp, uy.gub.agesic.empresa.ws.ACCE_RUPE.Articulo[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof uy.gub.agesic.empresa.ws.ACCE_RUPE.RUPEException) {
              throw (uy.gub.agesic.empresa.ws.ACCE_RUPE.RUPEException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public uy.gub.agesic.empresa.ws.ACCE_RUPE.IdentificacionProveedor[] obtenerIdentificacionesPorProveedorId(java.lang.Integer idProveedor, java.lang.String codigoUsuario) throws java.rmi.RemoteException, uy.gub.agesic.empresa.ws.ACCE_RUPE.RUPEException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "obtenerIdentificacionesPorProveedorId"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {idProveedor, codigoUsuario});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (uy.gub.agesic.empresa.ws.ACCE_RUPE.IdentificacionProveedor[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (uy.gub.agesic.empresa.ws.ACCE_RUPE.IdentificacionProveedor[]) org.apache.axis.utils.JavaUtils.convert(_resp, uy.gub.agesic.empresa.ws.ACCE_RUPE.IdentificacionProveedor[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof uy.gub.agesic.empresa.ws.ACCE_RUPE.RUPEException) {
              throw (uy.gub.agesic.empresa.ws.ACCE_RUPE.RUPEException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public uy.gub.agesic.empresa.ws.ACCE_RUPE.ListaVencimientosVencimiento[] obtenerVencimientosProveedor(java.lang.Integer idProveedor, java.lang.String codigoUsuario) throws java.rmi.RemoteException, uy.gub.agesic.empresa.ws.ACCE_RUPE.RUPEException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "obtenerVencimientosProveedor"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {idProveedor, codigoUsuario});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (uy.gub.agesic.empresa.ws.ACCE_RUPE.ListaVencimientosVencimiento[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (uy.gub.agesic.empresa.ws.ACCE_RUPE.ListaVencimientosVencimiento[]) org.apache.axis.utils.JavaUtils.convert(_resp, uy.gub.agesic.empresa.ws.ACCE_RUPE.ListaVencimientosVencimiento[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof uy.gub.agesic.empresa.ws.ACCE_RUPE.RUPEException) {
              throw (uy.gub.agesic.empresa.ws.ACCE_RUPE.RUPEException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public uy.gub.agesic.empresa.ws.ACCE_RUPE.Proveedor obtenerProveedor(uy.gub.agesic.empresa.ws.ACCE_RUPE.ObtenerDatosProveedorEntrada idProveedorEntrada, java.lang.String codigoUsuario, java.lang.Integer version) throws java.rmi.RemoteException, uy.gub.agesic.empresa.ws.ACCE_RUPE.RUPEException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "obtenerProveedor"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {idProveedorEntrada, codigoUsuario, version});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (uy.gub.agesic.empresa.ws.ACCE_RUPE.Proveedor) _resp;
            } catch (java.lang.Exception _exception) {
                return (uy.gub.agesic.empresa.ws.ACCE_RUPE.Proveedor) org.apache.axis.utils.JavaUtils.convert(_resp, uy.gub.agesic.empresa.ws.ACCE_RUPE.Proveedor.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof uy.gub.agesic.empresa.ws.ACCE_RUPE.RUPEException) {
              throw (uy.gub.agesic.empresa.ws.ACCE_RUPE.RUPEException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public uy.gub.agesic.empresa.ws.ACCE_RUPE.Proveedor[] busquedaProveedores(uy.gub.agesic.empresa.ws.ACCE_RUPE.CriterioBusquedaProveedor criterio, java.lang.String codigoUsuario) throws java.rmi.RemoteException, uy.gub.agesic.empresa.ws.ACCE_RUPE.RUPEException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "busquedaProveedores"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {criterio, codigoUsuario});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (uy.gub.agesic.empresa.ws.ACCE_RUPE.Proveedor[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (uy.gub.agesic.empresa.ws.ACCE_RUPE.Proveedor[]) org.apache.axis.utils.JavaUtils.convert(_resp, uy.gub.agesic.empresa.ws.ACCE_RUPE.Proveedor[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof uy.gub.agesic.empresa.ws.ACCE_RUPE.RUPEException) {
              throw (uy.gub.agesic.empresa.ws.ACCE_RUPE.RUPEException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.Integer obtenerIdProveedor(uy.gub.agesic.empresa.ws.ACCE_RUPE.IdentificacionProveedor proveedorID, java.lang.String codigoUsuario) throws java.rmi.RemoteException, uy.gub.agesic.empresa.ws.ACCE_RUPE.RUPEException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "obtenerIdProveedor"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {proveedorID, codigoUsuario});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.Integer) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.Integer.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof uy.gub.agesic.empresa.ws.ACCE_RUPE.RUPEException) {
              throw (uy.gub.agesic.empresa.ws.ACCE_RUPE.RUPEException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public uy.gub.agesic.empresa.ws.ACCE_RUPE.PersonaEnProveedor obtenerPersonaProveedorPorId(java.lang.Integer idPersonaProveedor, java.lang.String codigoUsuario, java.lang.Integer version) throws java.rmi.RemoteException, uy.gub.agesic.empresa.ws.ACCE_RUPE.RUPEException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "obtenerPersonaProveedorPorId"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {idPersonaProveedor, codigoUsuario, version});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (uy.gub.agesic.empresa.ws.ACCE_RUPE.PersonaEnProveedor) _resp;
            } catch (java.lang.Exception _exception) {
                return (uy.gub.agesic.empresa.ws.ACCE_RUPE.PersonaEnProveedor) org.apache.axis.utils.JavaUtils.convert(_resp, uy.gub.agesic.empresa.ws.ACCE_RUPE.PersonaEnProveedor.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof uy.gub.agesic.empresa.ws.ACCE_RUPE.RUPEException) {
              throw (uy.gub.agesic.empresa.ws.ACCE_RUPE.RUPEException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public uy.gub.agesic.empresa.ws.ACCE_RUPE.Persona[] obtenerPersonasProveedorPorRol(java.lang.Integer idProveedor, java.lang.String codigoUsuario, java.lang.String tipoRol) throws java.rmi.RemoteException, uy.gub.agesic.empresa.ws.ACCE_RUPE.RUPEException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "obtenerPersonasProveedorPorRol"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {idProveedor, codigoUsuario, tipoRol});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (uy.gub.agesic.empresa.ws.ACCE_RUPE.Persona[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (uy.gub.agesic.empresa.ws.ACCE_RUPE.Persona[]) org.apache.axis.utils.JavaUtils.convert(_resp, uy.gub.agesic.empresa.ws.ACCE_RUPE.Persona[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof uy.gub.agesic.empresa.ws.ACCE_RUPE.RUPEException) {
              throw (uy.gub.agesic.empresa.ws.ACCE_RUPE.RUPEException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public uy.gub.agesic.empresa.ws.ACCE_RUPE.IdentificacionProveedor obtenerProveedorID(java.lang.Integer idProveedor, java.lang.String codigoUsuario) throws java.rmi.RemoteException, uy.gub.agesic.empresa.ws.ACCE_RUPE.RUPEException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "obtenerProveedorID"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {idProveedor, codigoUsuario});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (uy.gub.agesic.empresa.ws.ACCE_RUPE.IdentificacionProveedor) _resp;
            } catch (java.lang.Exception _exception) {
                return (uy.gub.agesic.empresa.ws.ACCE_RUPE.IdentificacionProveedor) org.apache.axis.utils.JavaUtils.convert(_resp, uy.gub.agesic.empresa.ws.ACCE_RUPE.IdentificacionProveedor.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof uy.gub.agesic.empresa.ws.ACCE_RUPE.RUPEException) {
              throw (uy.gub.agesic.empresa.ws.ACCE_RUPE.RUPEException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public uy.gub.agesic.empresa.ws.ACCE_RUPE.Sancion obtenerSancionPorId(java.lang.Integer idSancion, java.lang.String codigoUsuario, java.lang.Integer version) throws java.rmi.RemoteException, uy.gub.agesic.empresa.ws.ACCE_RUPE.RUPEException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "obtenerSancionPorId"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {idSancion, codigoUsuario, version});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (uy.gub.agesic.empresa.ws.ACCE_RUPE.Sancion) _resp;
            } catch (java.lang.Exception _exception) {
                return (uy.gub.agesic.empresa.ws.ACCE_RUPE.Sancion) org.apache.axis.utils.JavaUtils.convert(_resp, uy.gub.agesic.empresa.ws.ACCE_RUPE.Sancion.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof uy.gub.agesic.empresa.ws.ACCE_RUPE.RUPEException) {
              throw (uy.gub.agesic.empresa.ws.ACCE_RUPE.RUPEException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public uy.gub.agesic.empresa.ws.ACCE_RUPE.ObtenerVencimientoPorIdResponseVencimiento obtenerVencimientoPorId(java.lang.Integer idVencimiento, java.lang.String codigoUsuario, java.lang.Integer version) throws java.rmi.RemoteException, uy.gub.agesic.empresa.ws.ACCE_RUPE.RUPEException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "obtenerVencimientoPorId"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {idVencimiento, codigoUsuario, version});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (uy.gub.agesic.empresa.ws.ACCE_RUPE.ObtenerVencimientoPorIdResponseVencimiento) _resp;
            } catch (java.lang.Exception _exception) {
                return (uy.gub.agesic.empresa.ws.ACCE_RUPE.ObtenerVencimientoPorIdResponseVencimiento) org.apache.axis.utils.JavaUtils.convert(_resp, uy.gub.agesic.empresa.ws.ACCE_RUPE.ObtenerVencimientoPorIdResponseVencimiento.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof uy.gub.agesic.empresa.ws.ACCE_RUPE.RUPEException) {
              throw (uy.gub.agesic.empresa.ws.ACCE_RUPE.RUPEException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public uy.gub.agesic.empresa.ws.ACCE_RUPE.CuentaBancaria[] obtenerCuentasBancariasPorProveedor(java.lang.Integer idProveedor, java.lang.String codigoUsuario) throws java.rmi.RemoteException, uy.gub.agesic.empresa.ws.ACCE_RUPE.RUPEException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[22]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "obtenerCuentasBancariasPorProveedor"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {idProveedor, codigoUsuario});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (uy.gub.agesic.empresa.ws.ACCE_RUPE.CuentaBancaria[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (uy.gub.agesic.empresa.ws.ACCE_RUPE.CuentaBancaria[]) org.apache.axis.utils.JavaUtils.convert(_resp, uy.gub.agesic.empresa.ws.ACCE_RUPE.CuentaBancaria[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof uy.gub.agesic.empresa.ws.ACCE_RUPE.RUPEException) {
              throw (uy.gub.agesic.empresa.ws.ACCE_RUPE.RUPEException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public uy.gub.agesic.empresa.ws.ACCE_RUPE.Cumplimiento obtenerCumplimientoPorId(java.lang.Integer idCumplimiento, java.lang.String codigoUsuario, java.lang.Integer version) throws java.rmi.RemoteException, uy.gub.agesic.empresa.ws.ACCE_RUPE.RUPEException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[23]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "obtenerCumplimientoPorId"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {idCumplimiento, codigoUsuario, version});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (uy.gub.agesic.empresa.ws.ACCE_RUPE.Cumplimiento) _resp;
            } catch (java.lang.Exception _exception) {
                return (uy.gub.agesic.empresa.ws.ACCE_RUPE.Cumplimiento) org.apache.axis.utils.JavaUtils.convert(_resp, uy.gub.agesic.empresa.ws.ACCE_RUPE.Cumplimiento.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof uy.gub.agesic.empresa.ws.ACCE_RUPE.RUPEException) {
              throw (uy.gub.agesic.empresa.ws.ACCE_RUPE.RUPEException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public uy.gub.agesic.empresa.ws.ACCE_RUPE.Proveedor obtenerProveedorPorId(java.lang.Integer idProveedorEntrada, java.lang.String codigoUsuario, java.lang.Integer version) throws java.rmi.RemoteException, uy.gub.agesic.empresa.ws.ACCE_RUPE.RUPEException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[24]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "obtenerProveedorPorId"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {idProveedorEntrada, codigoUsuario, version});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (uy.gub.agesic.empresa.ws.ACCE_RUPE.Proveedor) _resp;
            } catch (java.lang.Exception _exception) {
                return (uy.gub.agesic.empresa.ws.ACCE_RUPE.Proveedor) org.apache.axis.utils.JavaUtils.convert(_resp, uy.gub.agesic.empresa.ws.ACCE_RUPE.Proveedor.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof uy.gub.agesic.empresa.ws.ACCE_RUPE.RUPEException) {
              throw (uy.gub.agesic.empresa.ws.ACCE_RUPE.RUPEException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public uy.gub.agesic.empresa.ws.ACCE_RUPE.IdDocumento[] obtenerDocumentosProveedor(uy.gub.agesic.empresa.ws.ACCE_RUPE.ObtenerDocumentosProveedorEntrada criteriaDocumento) throws java.rmi.RemoteException, uy.gub.agesic.empresa.ws.ACCE_RUPE.RUPEException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[25]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "obtenerDocumentosProveedor"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {criteriaDocumento});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (uy.gub.agesic.empresa.ws.ACCE_RUPE.IdDocumento[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (uy.gub.agesic.empresa.ws.ACCE_RUPE.IdDocumento[]) org.apache.axis.utils.JavaUtils.convert(_resp, uy.gub.agesic.empresa.ws.ACCE_RUPE.IdDocumento[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof uy.gub.agesic.empresa.ws.ACCE_RUPE.RUPEException) {
              throw (uy.gub.agesic.empresa.ws.ACCE_RUPE.RUPEException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
