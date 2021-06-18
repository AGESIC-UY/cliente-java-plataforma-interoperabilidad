/**
 * ResultObtenerLocales.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v001.datatypes;

public class ResultObtenerLocales  implements java.io.Serializable {
    private uy.gub.agesic.empresa.ws.BPS_RegEmpresa.v001.datatypes.ErrorNegocio[] erroresNegocio;

    private uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.WsRegEmpresaV002.datatypes.LocalEmpresa[] localesEmpresa;

    public ResultObtenerLocales() {
    }

    public ResultObtenerLocales(
           uy.gub.agesic.empresa.ws.BPS_RegEmpresa.v001.datatypes.ErrorNegocio[] erroresNegocio,
           uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.WsRegEmpresaV002.datatypes.LocalEmpresa[] localesEmpresa) {
           this.erroresNegocio = erroresNegocio;
           this.localesEmpresa = localesEmpresa;
    }


    /**
     * Gets the erroresNegocio value for this ResultObtenerLocales.
     * 
     * @return erroresNegocio
     */
    public uy.gub.agesic.empresa.ws.BPS_RegEmpresa.v001.datatypes.ErrorNegocio[] getErroresNegocio() {
        return erroresNegocio;
    }


    /**
     * Sets the erroresNegocio value for this ResultObtenerLocales.
     * 
     * @param erroresNegocio
     */
    public void setErroresNegocio(uy.gub.agesic.empresa.ws.BPS_RegEmpresa.v001.datatypes.ErrorNegocio[] erroresNegocio) {
        this.erroresNegocio = erroresNegocio;
    }

    public uy.gub.agesic.empresa.ws.BPS_RegEmpresa.v001.datatypes.ErrorNegocio getErroresNegocio(int i) {
        return this.erroresNegocio[i];
    }

    public void setErroresNegocio(int i, uy.gub.agesic.empresa.ws.BPS_RegEmpresa.v001.datatypes.ErrorNegocio _value) {
        this.erroresNegocio[i] = _value;
    }


    /**
     * Gets the localesEmpresa value for this ResultObtenerLocales.
     * 
     * @return localesEmpresa
     */
    public uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.WsRegEmpresaV002.datatypes.LocalEmpresa[] getLocalesEmpresa() {
        return localesEmpresa;
    }


    /**
     * Sets the localesEmpresa value for this ResultObtenerLocales.
     * 
     * @param localesEmpresa
     */
    public void setLocalesEmpresa(uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.WsRegEmpresaV002.datatypes.LocalEmpresa[] localesEmpresa) {
        this.localesEmpresa = localesEmpresa;
    }

    public uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.WsRegEmpresaV002.datatypes.LocalEmpresa getLocalesEmpresa(int i) {
        return this.localesEmpresa[i];
    }

    public void setLocalesEmpresa(int i, uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.WsRegEmpresaV002.datatypes.LocalEmpresa _value) {
        this.localesEmpresa[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResultObtenerLocales)) return false;
        ResultObtenerLocales other = (ResultObtenerLocales) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.erroresNegocio==null && other.getErroresNegocio()==null) || 
             (this.erroresNegocio!=null &&
              java.util.Arrays.equals(this.erroresNegocio, other.getErroresNegocio()))) &&
            ((this.localesEmpresa==null && other.getLocalesEmpresa()==null) || 
             (this.localesEmpresa!=null &&
              java.util.Arrays.equals(this.localesEmpresa, other.getLocalesEmpresa())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getErroresNegocio() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getErroresNegocio());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getErroresNegocio(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLocalesEmpresa() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLocalesEmpresa());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLocalesEmpresa(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResultObtenerLocales.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/empresas/v001/datatypes", "ResultObtenerLocales"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("erroresNegocio");
        elemField.setXmlName(new javax.xml.namespace.QName("", "erroresNegocio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://bps.gub.uy/v001/datatypes", "ErrorNegocio"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localesEmpresa");
        elemField.setXmlName(new javax.xml.namespace.QName("", "localesEmpresa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/WsRegEmpresaV002/datatypes", "LocalEmpresa"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
