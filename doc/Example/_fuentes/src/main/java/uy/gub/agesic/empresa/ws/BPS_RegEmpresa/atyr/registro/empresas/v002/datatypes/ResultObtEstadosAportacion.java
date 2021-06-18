/**
 * ResultObtEstadosAportacion.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v002.datatypes;

public class ResultObtEstadosAportacion  implements java.io.Serializable {
    private uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.v003.datatypes.ObjError[] colError;

    private uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v002.datatypes.ObjDatosAportacionEmpresa[] datosAportacionEmpresa;

    public ResultObtEstadosAportacion() {
    }

    public ResultObtEstadosAportacion(
           uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.v003.datatypes.ObjError[] colError,
           uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v002.datatypes.ObjDatosAportacionEmpresa[] datosAportacionEmpresa) {
           this.colError = colError;
           this.datosAportacionEmpresa = datosAportacionEmpresa;
    }


    /**
     * Gets the colError value for this ResultObtEstadosAportacion.
     * 
     * @return colError
     */
    public uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.v003.datatypes.ObjError[] getColError() {
        return colError;
    }


    /**
     * Sets the colError value for this ResultObtEstadosAportacion.
     * 
     * @param colError
     */
    public void setColError(uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.v003.datatypes.ObjError[] colError) {
        this.colError = colError;
    }

    public uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.v003.datatypes.ObjError getColError(int i) {
        return this.colError[i];
    }

    public void setColError(int i, uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.v003.datatypes.ObjError _value) {
        this.colError[i] = _value;
    }


    /**
     * Gets the datosAportacionEmpresa value for this ResultObtEstadosAportacion.
     * 
     * @return datosAportacionEmpresa
     */
    public uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v002.datatypes.ObjDatosAportacionEmpresa[] getDatosAportacionEmpresa() {
        return datosAportacionEmpresa;
    }


    /**
     * Sets the datosAportacionEmpresa value for this ResultObtEstadosAportacion.
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

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResultObtEstadosAportacion)) return false;
        ResultObtEstadosAportacion other = (ResultObtEstadosAportacion) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.colError==null && other.getColError()==null) || 
             (this.colError!=null &&
              java.util.Arrays.equals(this.colError, other.getColError()))) &&
            ((this.datosAportacionEmpresa==null && other.getDatosAportacionEmpresa()==null) || 
             (this.datosAportacionEmpresa!=null &&
              java.util.Arrays.equals(this.datosAportacionEmpresa, other.getDatosAportacionEmpresa())));
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
        if (getColError() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getColError());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getColError(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResultObtEstadosAportacion.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/empresas/v002/datatypes", "ResultObtEstadosAportacion"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("colError");
        elemField.setXmlName(new javax.xml.namespace.QName("", "colError"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://bps.gub.uy/atyr/v003/datatypes", "ObjError"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datosAportacionEmpresa");
        elemField.setXmlName(new javax.xml.namespace.QName("", "datosAportacionEmpresa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/rce/v002/datatypes", "ObjDatosAportacionEmpresa"));
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
