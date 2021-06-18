/**
 * CodigoPostal.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.WsRegEmpresaV002.datatypes;

public class CodigoPostal  implements java.io.Serializable {
    private java.lang.Integer codigoPostal;

    private boolean vigente;

    public CodigoPostal() {
    }

    public CodigoPostal(
           java.lang.Integer codigoPostal,
           boolean vigente) {
           this.codigoPostal = codigoPostal;
           this.vigente = vigente;
    }


    /**
     * Gets the codigoPostal value for this CodigoPostal.
     * 
     * @return codigoPostal
     */
    public java.lang.Integer getCodigoPostal() {
        return codigoPostal;
    }


    /**
     * Sets the codigoPostal value for this CodigoPostal.
     * 
     * @param codigoPostal
     */
    public void setCodigoPostal(java.lang.Integer codigoPostal) {
        this.codigoPostal = codigoPostal;
    }


    /**
     * Gets the vigente value for this CodigoPostal.
     * 
     * @return vigente
     */
    public boolean isVigente() {
        return vigente;
    }


    /**
     * Sets the vigente value for this CodigoPostal.
     * 
     * @param vigente
     */
    public void setVigente(boolean vigente) {
        this.vigente = vigente;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CodigoPostal)) return false;
        CodigoPostal other = (CodigoPostal) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codigoPostal==null && other.getCodigoPostal()==null) || 
             (this.codigoPostal!=null &&
              this.codigoPostal.equals(other.getCodigoPostal()))) &&
            this.vigente == other.isVigente();
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
        if (getCodigoPostal() != null) {
            _hashCode += getCodigoPostal().hashCode();
        }
        _hashCode += (isVigente() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CodigoPostal.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/WsRegEmpresaV002/datatypes", "CodigoPostal"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoPostal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoPostal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vigente");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vigente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
