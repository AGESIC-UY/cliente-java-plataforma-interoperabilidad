/**
 * ResultObtenerEstadosAportacion.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v003.datatypes;

public class ResultObtenerEstadosAportacion  implements java.io.Serializable {
    private uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v003.datatypes.ParamObtenerEstadosAportacion clave;

    private uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v002.datatypes.ObjDatosAportacionEmpresa[] datosAportacionEmpresa;

    private uy.gub.agesic.empresa.ws.BPS_RegEmpresa.v001.datatypes.ErrorNegocio[] erroresNegocio;

    public ResultObtenerEstadosAportacion() {
    }

    public ResultObtenerEstadosAportacion(
           uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v003.datatypes.ParamObtenerEstadosAportacion clave,
           uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v002.datatypes.ObjDatosAportacionEmpresa[] datosAportacionEmpresa,
           uy.gub.agesic.empresa.ws.BPS_RegEmpresa.v001.datatypes.ErrorNegocio[] erroresNegocio) {
           this.clave = clave;
           this.datosAportacionEmpresa = datosAportacionEmpresa;
           this.erroresNegocio = erroresNegocio;
    }


    /**
     * Gets the clave value for this ResultObtenerEstadosAportacion.
     * 
     * @return clave
     */
    public uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v003.datatypes.ParamObtenerEstadosAportacion getClave() {
        return clave;
    }


    /**
     * Sets the clave value for this ResultObtenerEstadosAportacion.
     * 
     * @param clave
     */
    public void setClave(uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v003.datatypes.ParamObtenerEstadosAportacion clave) {
        this.clave = clave;
    }


    /**
     * Gets the datosAportacionEmpresa value for this ResultObtenerEstadosAportacion.
     * 
     * @return datosAportacionEmpresa
     */
    public uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v002.datatypes.ObjDatosAportacionEmpresa[] getDatosAportacionEmpresa() {
        return datosAportacionEmpresa;
    }


    /**
     * Sets the datosAportacionEmpresa value for this ResultObtenerEstadosAportacion.
     * 
     * @param datosAportacionEmpresa
     */
    public void setDatosAportacionEmpresa(uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v002.datatypes.ObjDatosAportacionEmpresa[] datosAportacionEmpresa) {
        this.datosAportacionEmpresa = datosAportacionEmpresa;
    }

    public uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v002.datatypes.ObjDatosAportacionEmpresa getDatosAportacionEmpresa(int i) {
        return this.datosAportacionEmpresa[i];
    }

    public void setDatosAportacionEmpresa(int i, uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v002.datatypes.ObjDatosAportacionEmpresa _value) {
        this.datosAportacionEmpresa[i] = _value;
    }


    /**
     * Gets the erroresNegocio value for this ResultObtenerEstadosAportacion.
     * 
     * @return erroresNegocio
     */
    public uy.gub.agesic.empresa.ws.BPS_RegEmpresa.v001.datatypes.ErrorNegocio[] getErroresNegocio() {
        return erroresNegocio;
    }


    /**
     * Sets the erroresNegocio value for this ResultObtenerEstadosAportacion.
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

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResultObtenerEstadosAportacion)) return false;
        ResultObtenerEstadosAportacion other = (ResultObtenerEstadosAportacion) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.clave==null && other.getClave()==null) || 
             (this.clave!=null &&
              this.clave.equals(other.getClave()))) &&
            ((this.datosAportacionEmpresa==null && other.getDatosAportacionEmpresa()==null) || 
             (this.datosAportacionEmpresa!=null &&
              java.util.Arrays.equals(this.datosAportacionEmpresa, other.getDatosAportacionEmpresa()))) &&
            ((this.erroresNegocio==null && other.getErroresNegocio()==null) || 
             (this.erroresNegocio!=null &&
              java.util.Arrays.equals(this.erroresNegocio, other.getErroresNegocio())));
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
        if (getClave() != null) {
            _hashCode += getClave().hashCode();
        }
        if (getDatosAportacionEmpresa() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDatosAportacionEmpresa());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDatosAportacionEmpresa(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResultObtenerEstadosAportacion.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/empresas/v003/datatypes", "ResultObtenerEstadosAportacion"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clave");
        elemField.setXmlName(new javax.xml.namespace.QName("", "clave"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/empresas/v003/datatypes", "ParamObtenerEstadosAportacion"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datosAportacionEmpresa");
        elemField.setXmlName(new javax.xml.namespace.QName("", "datosAportacionEmpresa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/rce/v002/datatypes", "ObjDatosAportacionEmpresa"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("erroresNegocio");
        elemField.setXmlName(new javax.xml.namespace.QName("", "erroresNegocio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://bps.gub.uy/v001/datatypes", "ErrorNegocio"));
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
