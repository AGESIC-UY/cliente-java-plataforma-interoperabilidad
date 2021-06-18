/**
 * WsRegEmpresasV002BindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uy.gub.agesic.empresa.ws.BPS_RegEmpresa;

public class WsRegEmpresasV002BindingStub extends org.apache.axis.client.Stub implements uy.gub.agesic.empresa.ws.BPS_RegEmpresa.WsRegEmpresaV002 {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[12];
        _initOperationDesc1();
        _initOperationDesc2();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("obtContribuyenteVigente");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "paramObtContribuyenteVigente"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/empresas/v002/datatypes", "ParamObtContribuyenteVigente"), uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v002.datatypes.ParamObtContribuyenteVigente.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/empresas/v002/datatypes", "ResultObtContribuyenteVigente"));
        oper.setReturnClass(uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v002.datatypes.ResultObtContribuyenteVigente.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "resultObtContribuyenteVigente"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("obtDomicilioFiscalPpal");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "paramObtDomicilioFiscalPpal"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/empresas/v002/datatypes", "ParamObtDomicilioFiscalPpal"), uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v002.datatypes.ParamObtDomicilioFiscalPpal.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/empresas/v002/datatypes", "ResultObtDomicilioFiscalPpal"));
        oper.setReturnClass(uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v002.datatypes.ResultObtDomicilioFiscalPpal.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "resultObtDomicilioFiscalPpal"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("obtenerEmpresa");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "paramObtEmpresa"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/empresas/v002/datatypes", "ParamObtEmpresa"), uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v002.datatypes.ParamObtEmpresa.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/empresas/v002/datatypes", "ResultObtEmpresa"));
        oper.setReturnClass(uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v002.datatypes.ResultObtEmpresa.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "resultObtEmpresa"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("obtenerEstadosAportacion");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "paramObtEstadosAportacion"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/empresas/v002/datatypes", "ParamObtEstadosAportacion"), uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v002.datatypes.ParamObtEstadosAportacion.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/empresas/v002/datatypes", "ResultObtEstadosAportacion"));
        oper.setReturnClass(uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v002.datatypes.ResultObtEstadosAportacion.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "resultObtEstadosAportacion"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("obtenerListaEstadosAportacion");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "paramObtenerListaEstadosAportacion"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/empresas/v001/datatypes", "ParamObtenerListaEstadosAportacion"), uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v003.datatypes.ParamObtenerEstadosAportacion[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("", "paramsObtenerEstadosAportacion"));
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/empresas/v001/datatypes", "ResultObtenerListaEstadosAportacion"));
        oper.setReturnClass(uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v001.datatypes.ResultObtenerListaEstadosAportacion.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "resultObtenerListaEstadosAportacion"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("obtenerListaEmpresa");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "paramObtListaEmpresaEmpresa"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/empresas/v002/datatypes", "ParamObtListaEmpresa"), uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v002.datatypes.ParamObtListaEmpresa.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/empresas/v002/datatypes", "ResultObtListaEmpresa"));
        oper.setReturnClass(uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v002.datatypes.ResultObtListaEmpresa.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "resultObtListaEmpresa"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("obtenerListaRelContribuyente");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "paramObtListaRelContribuyente"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/empresas/v002/datatypes", "paramObtListaRelContribuyente"), uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v002.datatypes.ParamObtListaRelContribuyente.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/empresas/v002/datatypes", "ResultObtListaRelContribuyente"));
        oper.setReturnClass(uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v002.datatypes.ResultObtListaRelContribuyente.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "resultObtListaRelContribuyente"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("obtListaRelContribuyenteEmpresas");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "paramObtListaRelContribuyenteEmpresas"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/empresas/v002/datatypes", "paramObtListaRelContribuyenteEmpresas"), uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v002.datatypes.ParamObtListaRelContribuyente[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("", "colParamObtListaRelContribuyente"));
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/empresas/v002/datatypes", "ResultObtListaRelContribuyenteEmpresas"));
        oper.setReturnClass(uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v002.datatypes.ResultObtListaRelContribuyenteEmpresas.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "resultObtListaRelContribuyenteEmpresas"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("validarEmpresa");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "paramValEmpresa"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/empresas/v002/datatypes", "ParamValEmpresa"), uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v002.datatypes.ParamValEmpresa.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/empresas/v003/datatypes", "ResultValEmpresa"));
        oper.setReturnClass(uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v003.datatypes.ResultValEmpresa.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "resultValEmpresa"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("obtenerAtributosEspeciales");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "paramObtAtributoEspecialEmpresa"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/empresas/v001/datatypes", "paramObtAtributoEspecialEmpresa"), uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v001.datatypes.ParamObtAtributoEspecialEmpresa.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/empresas/v001/datatypes", "resultObtAtributosEspecialesEmpresa"));
        oper.setReturnClass(uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v001.datatypes.ResultObtAtributosEspecialesEmpresa.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "resultObtAtributosEspecialesEmpresa"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("obtenerLocales");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "paramObtenerLocales"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/empresas/v001/datatypes", "ParamObtenerLocales"), uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v001.datatypes.ParamObtenerLocales.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/empresas/v001/datatypes", "ResultObtenerLocales"));
        oper.setReturnClass(uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v001.datatypes.ResultObtenerLocales.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "resultobtenerLocales"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("obtVersion");
        oper.setReturnType(new javax.xml.namespace.QName("http://bps.gub.uy/generics/results", "ResultobtVersion"));
        oper.setReturnClass(uy.gub.agesic.empresa.ws.BPS_RegEmpresa.generics.results.ResultobtVersion.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "ResultobtVersion"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[11] = oper;

    }

    public WsRegEmpresasV002BindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public WsRegEmpresasV002BindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public WsRegEmpresasV002BindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
            qName = new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/empresas/v001/datatypes", "ObjAEEmp");
            cachedSerQNames.add(qName);
            cls = uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v001.datatypes.ObjAEEmp.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/empresas/v001/datatypes", "ObjAEPeriodo");
            cachedSerQNames.add(qName);
            cls = uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v001.datatypes.ObjAEPeriodo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/empresas/v001/datatypes", "ObjAportacionAE");
            cachedSerQNames.add(qName);
            cls = uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v001.datatypes.ObjAportacionAE.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/empresas/v001/datatypes", "ObjContribuyenteAportacionAE");
            cachedSerQNames.add(qName);
            cls = uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v001.datatypes.ObjContribuyenteAportacionAE.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/empresas/v001/datatypes", "objGenericCodeInt");
            cachedSerQNames.add(qName);
            cls = uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v001.datatypes.ObjGenericCodeInt.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/empresas/v001/datatypes", "paramObtAtributoEspecialEmpresa");
            cachedSerQNames.add(qName);
            cls = uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v001.datatypes.ParamObtAtributoEspecialEmpresa.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/empresas/v001/datatypes", "ParamObtenerListaEstadosAportacion");
            cachedSerQNames.add(qName);
            cls = uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v003.datatypes.ParamObtenerEstadosAportacion[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/empresas/v003/datatypes", "ParamObtenerEstadosAportacion");
            qName2 = new javax.xml.namespace.QName("", "paramsObtenerEstadosAportacion");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/empresas/v001/datatypes", "ParamObtenerLocales");
            cachedSerQNames.add(qName);
            cls = uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v001.datatypes.ParamObtenerLocales.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/empresas/v001/datatypes", "resultObtAtributosEspecialesEmpresa");
            cachedSerQNames.add(qName);
            cls = uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v001.datatypes.ResultObtAtributosEspecialesEmpresa.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/empresas/v001/datatypes", "ResultObtenerListaEstadosAportacion");
            cachedSerQNames.add(qName);
            cls = uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v001.datatypes.ResultObtenerListaEstadosAportacion.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/empresas/v001/datatypes", "ResultObtenerLocales");
            cachedSerQNames.add(qName);
            cls = uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v001.datatypes.ResultObtenerLocales.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/empresas/v002/datatypes", "ParamObtContribuyenteVigente");
            cachedSerQNames.add(qName);
            cls = uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v002.datatypes.ParamObtContribuyenteVigente.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/empresas/v002/datatypes", "ParamObtDomicilioFiscalPpal");
            cachedSerQNames.add(qName);
            cls = uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v002.datatypes.ParamObtDomicilioFiscalPpal.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/empresas/v002/datatypes", "ParamObtEmpresa");
            cachedSerQNames.add(qName);
            cls = uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v002.datatypes.ParamObtEmpresa.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/empresas/v002/datatypes", "ParamObtEstadosAportacion");
            cachedSerQNames.add(qName);
            cls = uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v002.datatypes.ParamObtEstadosAportacion.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/empresas/v002/datatypes", "ParamObtListaEmpresa");
            cachedSerQNames.add(qName);
            cls = uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v002.datatypes.ParamObtListaEmpresa.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/empresas/v002/datatypes", "paramObtListaRelContribuyente");
            cachedSerQNames.add(qName);
            cls = uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v002.datatypes.ParamObtListaRelContribuyente.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/empresas/v002/datatypes", "paramObtListaRelContribuyenteEmpresas");
            cachedSerQNames.add(qName);
            cls = uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v002.datatypes.ParamObtListaRelContribuyente[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/empresas/v002/datatypes", "paramObtListaRelContribuyente");
            qName2 = new javax.xml.namespace.QName("", "colParamObtListaRelContribuyente");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/empresas/v002/datatypes", "ParamValEmpresa");
            cachedSerQNames.add(qName);
            cls = uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v002.datatypes.ParamValEmpresa.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/empresas/v002/datatypes", "ResultObtContribuyenteVigente");
            cachedSerQNames.add(qName);
            cls = uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v002.datatypes.ResultObtContribuyenteVigente.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/empresas/v002/datatypes", "ResultObtDomicilioFiscalPpal");
            cachedSerQNames.add(qName);
            cls = uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v002.datatypes.ResultObtDomicilioFiscalPpal.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/empresas/v002/datatypes", "ResultObtEmpresa");
            cachedSerQNames.add(qName);
            cls = uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v002.datatypes.ResultObtEmpresa.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/empresas/v002/datatypes", "ResultObtEstadosAportacion");
            cachedSerQNames.add(qName);
            cls = uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v002.datatypes.ResultObtEstadosAportacion.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/empresas/v002/datatypes", "ResultObtListaEmpresa");
            cachedSerQNames.add(qName);
            cls = uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v002.datatypes.ResultObtListaEmpresa.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/empresas/v002/datatypes", "ResultObtListaRelContribuyente");
            cachedSerQNames.add(qName);
            cls = uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v002.datatypes.ResultObtListaRelContribuyente.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/empresas/v002/datatypes", "ResultObtListaRelContribuyenteEmpresas");
            cachedSerQNames.add(qName);
            cls = uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v002.datatypes.ResultObtListaRelContribuyenteEmpresas.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/empresas/v003/datatypes", "ParamObtenerEstadosAportacion");
            cachedSerQNames.add(qName);
            cls = uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v003.datatypes.ParamObtenerEstadosAportacion.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/empresas/v003/datatypes", "ResultObtenerEstadosAportacion");
            cachedSerQNames.add(qName);
            cls = uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v003.datatypes.ResultObtenerEstadosAportacion.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/empresas/v003/datatypes", "ResultValEmpresa");
            cachedSerQNames.add(qName);
            cls = uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v003.datatypes.ResultValEmpresa.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/rce/v001/datatypes", "ObjEmail");
            cachedSerQNames.add(qName);
            cls = uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v001.datatypes.ObjEmail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/rce/v001/datatypes", "ObjFax");
            cachedSerQNames.add(qName);
            cls = uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v001.datatypes.ObjFax.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/rce/v001/datatypes", "ObjTelefono");
            cachedSerQNames.add(qName);
            cls = uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v001.datatypes.ObjTelefono.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/rce/v002/datatypes", "ObjAportacion");
            cachedSerQNames.add(qName);
            cls = uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v002.datatypes.ObjAportacion.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/rce/v002/datatypes", "ObjCalle");
            cachedSerQNames.add(qName);
            cls = uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v002.datatypes.ObjCalle.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/rce/v002/datatypes", "ObjCausal");
            cachedSerQNames.add(qName);
            cls = uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v002.datatypes.ObjCausal.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/rce/v002/datatypes", "ObjDatosAportacionEmpresa");
            cachedSerQNames.add(qName);
            cls = uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v002.datatypes.ObjDatosAportacionEmpresa.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/rce/v002/datatypes", "ObjDepartamento");
            cachedSerQNames.add(qName);
            cls = uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v002.datatypes.ObjDepartamento.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/rce/v002/datatypes", "ObjDomicilio");
            cachedSerQNames.add(qName);
            cls = uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v002.datatypes.ObjDomicilio.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/rce/v002/datatypes", "ObjEmpresaContribuyentes");
            cachedSerQNames.add(qName);
            cls = uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v002.datatypes.ObjEmpresaContribuyentes.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/rce/v002/datatypes", "ObjEstadoAportacion");
            cachedSerQNames.add(qName);
            cls = uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v002.datatypes.ObjEstadoAportacion.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/rce/v002/datatypes", "ObjGiro");
            cachedSerQNames.add(qName);
            cls = uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v002.datatypes.ObjGiro.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/rce/v002/datatypes", "ObjGiroPeriodo");
            cachedSerQNames.add(qName);
            cls = uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v002.datatypes.ObjGiroPeriodo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/rce/v002/datatypes", "ObjGirosEmpresa");
            cachedSerQNames.add(qName);
            cls = uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v002.datatypes.ObjGirosEmpresa.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/rce/v002/datatypes", "ObjLocalidad");
            cachedSerQNames.add(qName);
            cls = uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v002.datatypes.ObjLocalidad.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/rce/v003/datatypes", "ObjContribuyente");
            cachedSerQNames.add(qName);
            cls = uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v003.datatypes.ObjContribuyente.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/rce/v003/datatypes", "ObjDenominacionPeriodo");
            cachedSerQNames.add(qName);
            cls = uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v003.datatypes.ObjDenominacionPeriodo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/rce/v003/datatypes", "ObjEmpresa");
            cachedSerQNames.add(qName);
            cls = uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v003.datatypes.ObjEmpresa.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/rce/v003/datatypes", "ObjPeriodo");
            cachedSerQNames.add(qName);
            cls = uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v003.datatypes.ObjPeriodo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/rce/v003/datatypes", "ObjRelacionEmpContr");
            cachedSerQNames.add(qName);
            cls = uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v003.datatypes.ObjRelacionEmpContr.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/WsRegEmpresaV002/datatypes", "AmpliacionDomicilio");
            cachedSerQNames.add(qName);
            cls = uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.WsRegEmpresaV002.datatypes.AmpliacionDomicilio.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/WsRegEmpresaV002/datatypes", "Calle");
            cachedSerQNames.add(qName);
            cls = uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.WsRegEmpresaV002.datatypes.Calle.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/WsRegEmpresaV002/datatypes", "CodigoPostal");
            cachedSerQNames.add(qName);
            cls = uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.WsRegEmpresaV002.datatypes.CodigoPostal.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/WsRegEmpresaV002/datatypes", "Departamento");
            cachedSerQNames.add(qName);
            cls = uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.WsRegEmpresaV002.datatypes.Departamento.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/WsRegEmpresaV002/datatypes", "Direccion");
            cachedSerQNames.add(qName);
            cls = uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.WsRegEmpresaV002.datatypes.Direccion.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/WsRegEmpresaV002/datatypes", "EMail");
            cachedSerQNames.add(qName);
            cls = uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.WsRegEmpresaV002.datatypes.EMail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/WsRegEmpresaV002/datatypes", "Fax");
            cachedSerQNames.add(qName);
            cls = uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.WsRegEmpresaV002.datatypes.Fax.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/WsRegEmpresaV002/datatypes", "LocalEmpresa");
            cachedSerQNames.add(qName);
            cls = uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.WsRegEmpresaV002.datatypes.LocalEmpresa.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/WsRegEmpresaV002/datatypes", "Localidad");
            cachedSerQNames.add(qName);
            cls = uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.WsRegEmpresaV002.datatypes.Localidad.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/WsRegEmpresaV002/datatypes", "ObjPeriodo");
            cachedSerQNames.add(qName);
            cls = uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.WsRegEmpresaV002.datatypes.ObjPeriodo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/WsRegEmpresaV002/datatypes", "Telefono");
            cachedSerQNames.add(qName);
            cls = uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.WsRegEmpresaV002.datatypes.Telefono.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/WsRegEmpresaV002/datatypes", "TipoEstablecimiento");
            cachedSerQNames.add(qName);
            cls = uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.WsRegEmpresaV002.datatypes.TipoEstablecimiento.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://bps.gub.uy/atyr/v003/datatypes", "ObjError");
            cachedSerQNames.add(qName);
            cls = uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.v003.datatypes.ObjError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://bps.gub.uy/generics/results", "ResultobtVersion");
            cachedSerQNames.add(qName);
            cls = uy.gub.agesic.empresa.ws.BPS_RegEmpresa.generics.results.ResultobtVersion.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://bps.gub.uy/v001/datatypes", "ErrorNegocio");
            cachedSerQNames.add(qName);
            cls = uy.gub.agesic.empresa.ws.BPS_RegEmpresa.v001.datatypes.ErrorNegocio.class;
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

    public uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v002.datatypes.ResultObtContribuyenteVigente obtContribuyenteVigente(uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v002.datatypes.ParamObtContribuyenteVigente paramObtContribuyenteVigente) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("obtContribuyenteVigente");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/empresas/v002", "obtContribuyenteVigente"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {paramObtContribuyenteVigente});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v002.datatypes.ResultObtContribuyenteVigente) _resp;
            } catch (java.lang.Exception _exception) {
                return (uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v002.datatypes.ResultObtContribuyenteVigente) org.apache.axis.utils.JavaUtils.convert(_resp, uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v002.datatypes.ResultObtContribuyenteVigente.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v002.datatypes.ResultObtDomicilioFiscalPpal obtDomicilioFiscalPpal(uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v002.datatypes.ParamObtDomicilioFiscalPpal paramObtDomicilioFiscalPpal) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("obtDomicilioFiscalPpal");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/empresas/v002", "obtDomicilioFiscalPpal"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {paramObtDomicilioFiscalPpal});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v002.datatypes.ResultObtDomicilioFiscalPpal) _resp;
            } catch (java.lang.Exception _exception) {
                return (uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v002.datatypes.ResultObtDomicilioFiscalPpal) org.apache.axis.utils.JavaUtils.convert(_resp, uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v002.datatypes.ResultObtDomicilioFiscalPpal.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v002.datatypes.ResultObtEmpresa obtenerEmpresa(uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v002.datatypes.ParamObtEmpresa paramObtEmpresa) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("obtenerEmpresa");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/empresas/v002", "obtenerEmpresa"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {paramObtEmpresa});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v002.datatypes.ResultObtEmpresa) _resp;
            } catch (java.lang.Exception _exception) {
                return (uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v002.datatypes.ResultObtEmpresa) org.apache.axis.utils.JavaUtils.convert(_resp, uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v002.datatypes.ResultObtEmpresa.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v002.datatypes.ResultObtEstadosAportacion obtenerEstadosAportacion(uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v002.datatypes.ParamObtEstadosAportacion paramObtEstadosAportacion) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("obtenerEstadosAportacion");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/empresas/v002", "obtenerEstadosAportacion"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {paramObtEstadosAportacion});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v002.datatypes.ResultObtEstadosAportacion) _resp;
            } catch (java.lang.Exception _exception) {
                return (uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v002.datatypes.ResultObtEstadosAportacion) org.apache.axis.utils.JavaUtils.convert(_resp, uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v002.datatypes.ResultObtEstadosAportacion.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v001.datatypes.ResultObtenerListaEstadosAportacion obtenerListaEstadosAportacion(uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v003.datatypes.ParamObtenerEstadosAportacion[] paramObtenerListaEstadosAportacion) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("obtenerListaEstadosAportacion");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/empresas/v002", "obtenerListaEstadosAportacion"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {paramObtenerListaEstadosAportacion});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v001.datatypes.ResultObtenerListaEstadosAportacion) _resp;
            } catch (java.lang.Exception _exception) {
                return (uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v001.datatypes.ResultObtenerListaEstadosAportacion) org.apache.axis.utils.JavaUtils.convert(_resp, uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v001.datatypes.ResultObtenerListaEstadosAportacion.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v002.datatypes.ResultObtListaEmpresa obtenerListaEmpresa(uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v002.datatypes.ParamObtListaEmpresa paramObtListaEmpresaEmpresa) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("obtenerListaEmpresa");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/empresas/v002", "obtenerListaEmpresa"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {paramObtListaEmpresaEmpresa});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v002.datatypes.ResultObtListaEmpresa) _resp;
            } catch (java.lang.Exception _exception) {
                return (uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v002.datatypes.ResultObtListaEmpresa) org.apache.axis.utils.JavaUtils.convert(_resp, uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v002.datatypes.ResultObtListaEmpresa.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v002.datatypes.ResultObtListaRelContribuyente obtenerListaRelContribuyente(uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v002.datatypes.ParamObtListaRelContribuyente paramObtListaRelContribuyente) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("obtenerListaRelContribuyente");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/empresas/v002", "obtenerListaRelContribuyente"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {paramObtListaRelContribuyente});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v002.datatypes.ResultObtListaRelContribuyente) _resp;
            } catch (java.lang.Exception _exception) {
                return (uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v002.datatypes.ResultObtListaRelContribuyente) org.apache.axis.utils.JavaUtils.convert(_resp, uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v002.datatypes.ResultObtListaRelContribuyente.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v002.datatypes.ResultObtListaRelContribuyenteEmpresas obtListaRelContribuyenteEmpresas(uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v002.datatypes.ParamObtListaRelContribuyente[] paramObtListaRelContribuyenteEmpresas) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("obtListaRelContribuyenteEmpresas");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/empresas/v002", "obtListaRelContribuyenteEmpresas"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {paramObtListaRelContribuyenteEmpresas});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v002.datatypes.ResultObtListaRelContribuyenteEmpresas) _resp;
            } catch (java.lang.Exception _exception) {
                return (uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v002.datatypes.ResultObtListaRelContribuyenteEmpresas) org.apache.axis.utils.JavaUtils.convert(_resp, uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v002.datatypes.ResultObtListaRelContribuyenteEmpresas.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v003.datatypes.ResultValEmpresa validarEmpresa(uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v002.datatypes.ParamValEmpresa paramValEmpresa) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("validarEmpresa");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/empresas/v002", "validarEmpresa"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {paramValEmpresa});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v003.datatypes.ResultValEmpresa) _resp;
            } catch (java.lang.Exception _exception) {
                return (uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v003.datatypes.ResultValEmpresa) org.apache.axis.utils.JavaUtils.convert(_resp, uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v003.datatypes.ResultValEmpresa.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v001.datatypes.ResultObtAtributosEspecialesEmpresa obtenerAtributosEspeciales(uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v001.datatypes.ParamObtAtributoEspecialEmpresa paramObtAtributoEspecialEmpresa) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("obtenerAtributosEspeciales");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/empresas/v002", "obtenerAtributosEspeciales"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {paramObtAtributoEspecialEmpresa});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v001.datatypes.ResultObtAtributosEspecialesEmpresa) _resp;
            } catch (java.lang.Exception _exception) {
                return (uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v001.datatypes.ResultObtAtributosEspecialesEmpresa) org.apache.axis.utils.JavaUtils.convert(_resp, uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v001.datatypes.ResultObtAtributosEspecialesEmpresa.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v001.datatypes.ResultObtenerLocales obtenerLocales(uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v001.datatypes.ParamObtenerLocales paramObtenerLocales) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("obtenerLocales");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/empresas/v002", "obtenerLocales"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {paramObtenerLocales});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v001.datatypes.ResultObtenerLocales) _resp;
            } catch (java.lang.Exception _exception) {
                return (uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v001.datatypes.ResultObtenerLocales) org.apache.axis.utils.JavaUtils.convert(_resp, uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v001.datatypes.ResultObtenerLocales.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public uy.gub.agesic.empresa.ws.BPS_RegEmpresa.generics.results.ResultobtVersion obtVersion() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("obtVersion");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/empresas/v002", "obtVersion"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (uy.gub.agesic.empresa.ws.BPS_RegEmpresa.generics.results.ResultobtVersion) _resp;
            } catch (java.lang.Exception _exception) {
                return (uy.gub.agesic.empresa.ws.BPS_RegEmpresa.generics.results.ResultobtVersion) org.apache.axis.utils.JavaUtils.convert(_resp, uy.gub.agesic.empresa.ws.BPS_RegEmpresa.generics.results.ResultobtVersion.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
