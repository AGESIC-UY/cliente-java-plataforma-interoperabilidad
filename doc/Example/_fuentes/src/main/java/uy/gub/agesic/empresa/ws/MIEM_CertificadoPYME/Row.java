/**
 * Row.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uy.gub.agesic.empresa.ws.MIEM_CertificadoPYME;

public class Row  implements java.io.Serializable {
    private java.lang.String razon_social;

    private java.lang.String categoria;

    private java.lang.String tipo_sociedad;

    private java.util.Date vigencia;

    public Row() {
    }

    public Row(
           java.lang.String razon_social,
           java.lang.String categoria,
           java.lang.String tipo_sociedad,
           java.util.Date vigencia) {
           this.razon_social = razon_social;
           this.categoria = categoria;
           this.tipo_sociedad = tipo_sociedad;
           this.vigencia = vigencia;
    }


    /**
     * Gets the razon_social value for this Row.
     * 
     * @return razon_social
     */
    public java.lang.String getRazon_social() {
        return razon_social;
    }


    /**
     * Sets the razon_social value for this Row.
     * 
     * @param razon_social
     */
    public void setRazon_social(java.lang.String razon_social) {
        this.razon_social = razon_social;
    }


    /**
     * Gets the categoria value for this Row.
     * 
     * @return categoria
     */
    public java.lang.String getCategoria() {
        return categoria;
    }


    /**
     * Sets the categoria value for this Row.
     * 
     * @param categoria
     */
    public void setCategoria(java.lang.String categoria) {
        this.categoria = categoria;
    }


    /**
     * Gets the tipo_sociedad value for this Row.
     * 
     * @return tipo_sociedad
     */
    public java.lang.String getTipo_sociedad() {
        return tipo_sociedad;
    }


    /**
     * Sets the tipo_sociedad value for this Row.
     * 
     * @param tipo_sociedad
     */
    public void setTipo_sociedad(java.lang.String tipo_sociedad) {
        this.tipo_sociedad = tipo_sociedad;
    }


    /**
     * Gets the vigencia value for this Row.
     * 
     * @return vigencia
     */
    public java.util.Date getVigencia() {
        return vigencia;
    }


    /**
     * Sets the vigencia value for this Row.
     * 
     * @param vigencia
     */
    public void setVigencia(java.util.Date vigencia) {
        this.vigencia = vigencia;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Row)) return false;
        Row other = (Row) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.razon_social==null && other.getRazon_social()==null) || 
             (this.razon_social!=null &&
              this.razon_social.equals(other.getRazon_social()))) &&
            ((this.categoria==null && other.getCategoria()==null) || 
             (this.categoria!=null &&
              this.categoria.equals(other.getCategoria()))) &&
            ((this.tipo_sociedad==null && other.getTipo_sociedad()==null) || 
             (this.tipo_sociedad!=null &&
              this.tipo_sociedad.equals(other.getTipo_sociedad()))) &&
            ((this.vigencia==null && other.getVigencia()==null) || 
             (this.vigencia!=null &&
              this.vigencia.equals(other.getVigencia())));
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
        if (getRazon_social() != null) {
            _hashCode += getRazon_social().hashCode();
        }
        if (getCategoria() != null) {
            _hashCode += getCategoria().hashCode();
        }
        if (getTipo_sociedad() != null) {
            _hashCode += getTipo_sociedad().hashCode();
        }
        if (getVigencia() != null) {
            _hashCode += getVigencia().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Row.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.apiasolutions.com/WebServices", "Row"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("razon_social");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.apiasolutions.com/WebServices", "razon_social"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("categoria");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.apiasolutions.com/WebServices", "categoria"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipo_sociedad");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.apiasolutions.com/WebServices", "tipo_sociedad"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vigencia");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.apiasolutions.com/WebServices", "vigencia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(true);
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
