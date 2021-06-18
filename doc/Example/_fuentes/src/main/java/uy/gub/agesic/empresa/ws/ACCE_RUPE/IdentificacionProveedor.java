/**
 * IdentificacionProveedor.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uy.gub.agesic.empresa.ws.ACCE_RUPE;

public class IdentificacionProveedor  implements java.io.Serializable {
    private java.lang.String codigoPais;

    private java.lang.String tipoDocumento;

    private java.lang.String numeroIdentificacion;

    public IdentificacionProveedor() {
    }

    public IdentificacionProveedor(
           java.lang.String codigoPais,
           java.lang.String tipoDocumento,
           java.lang.String numeroIdentificacion) {
           this.codigoPais = codigoPais;
           this.tipoDocumento = tipoDocumento;
           this.numeroIdentificacion = numeroIdentificacion;
    }


    /**
     * Gets the codigoPais value for this IdentificacionProveedor.
     * 
     * @return codigoPais
     */
    public java.lang.String getCodigoPais() {
        return codigoPais;
    }


    /**
     * Sets the codigoPais value for this IdentificacionProveedor.
     * 
     * @param codigoPais
     */
    public void setCodigoPais(java.lang.String codigoPais) {
        this.codigoPais = codigoPais;
    }


    /**
     * Gets the tipoDocumento value for this IdentificacionProveedor.
     * 
     * @return tipoDocumento
     */
    public java.lang.String getTipoDocumento() {
        return tipoDocumento;
    }


    /**
     * Sets the tipoDocumento value for this IdentificacionProveedor.
     * 
     * @param tipoDocumento
     */
    public void setTipoDocumento(java.lang.String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }


    /**
     * Gets the numeroIdentificacion value for this IdentificacionProveedor.
     * 
     * @return numeroIdentificacion
     */
    public java.lang.String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }


    /**
     * Sets the numeroIdentificacion value for this IdentificacionProveedor.
     * 
     * @param numeroIdentificacion
     */
    public void setNumeroIdentificacion(java.lang.String numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IdentificacionProveedor)) return false;
        IdentificacionProveedor other = (IdentificacionProveedor) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codigoPais==null && other.getCodigoPais()==null) || 
             (this.codigoPais!=null &&
              this.codigoPais.equals(other.getCodigoPais()))) &&
            ((this.tipoDocumento==null && other.getTipoDocumento()==null) || 
             (this.tipoDocumento!=null &&
              this.tipoDocumento.equals(other.getTipoDocumento()))) &&
            ((this.numeroIdentificacion==null && other.getNumeroIdentificacion()==null) || 
             (this.numeroIdentificacion!=null &&
              this.numeroIdentificacion.equals(other.getNumeroIdentificacion())));
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
        if (getCodigoPais() != null) {
            _hashCode += getCodigoPais().hashCode();
        }
        if (getTipoDocumento() != null) {
            _hashCode += getTipoDocumento().hashCode();
        }
        if (getNumeroIdentificacion() != null) {
            _hashCode += getNumeroIdentificacion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IdentificacionProveedor.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "identificacionProveedor"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoPais");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoPais"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoDocumento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipoDocumento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroIdentificacion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numeroIdentificacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
