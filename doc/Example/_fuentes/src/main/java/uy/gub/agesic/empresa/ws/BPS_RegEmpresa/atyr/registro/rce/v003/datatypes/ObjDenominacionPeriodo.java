/**
 * ObjDenominacionPeriodo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v003.datatypes;

public class ObjDenominacionPeriodo  implements java.io.Serializable {
    private java.lang.String denominacion;

    private uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v003.datatypes.ObjPeriodo periodo;

    public ObjDenominacionPeriodo() {
    }

    public ObjDenominacionPeriodo(
           java.lang.String denominacion,
           uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v003.datatypes.ObjPeriodo periodo) {
           this.denominacion = denominacion;
           this.periodo = periodo;
    }


    /**
     * Gets the denominacion value for this ObjDenominacionPeriodo.
     * 
     * @return denominacion
     */
    public java.lang.String getDenominacion() {
        return denominacion;
    }


    /**
     * Sets the denominacion value for this ObjDenominacionPeriodo.
     * 
     * @param denominacion
     */
    public void setDenominacion(java.lang.String denominacion) {
        this.denominacion = denominacion;
    }


    /**
     * Gets the periodo value for this ObjDenominacionPeriodo.
     * 
     * @return periodo
     */
    public uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v003.datatypes.ObjPeriodo getPeriodo() {
        return periodo;
    }


    /**
     * Sets the periodo value for this ObjDenominacionPeriodo.
     * 
     * @param periodo
     */
    public void setPeriodo(uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v003.datatypes.ObjPeriodo periodo) {
        this.periodo = periodo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ObjDenominacionPeriodo)) return false;
        ObjDenominacionPeriodo other = (ObjDenominacionPeriodo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.denominacion==null && other.getDenominacion()==null) || 
             (this.denominacion!=null &&
              this.denominacion.equals(other.getDenominacion()))) &&
            ((this.periodo==null && other.getPeriodo()==null) || 
             (this.periodo!=null &&
              this.periodo.equals(other.getPeriodo())));
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
        if (getDenominacion() != null) {
            _hashCode += getDenominacion().hashCode();
        }
        if (getPeriodo() != null) {
            _hashCode += getPeriodo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ObjDenominacionPeriodo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/rce/v003/datatypes", "ObjDenominacionPeriodo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("denominacion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "denominacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("periodo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "periodo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/rce/v003/datatypes", "ObjPeriodo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
