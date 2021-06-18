/**
 * Articulo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uy.gub.agesic.empresa.ws.ACCE_RUPE;

public class Articulo  implements java.io.Serializable {
    private java.lang.Integer idArticulo;

    private java.lang.String codigoFamilia;

    private java.lang.String codigoSubFamilia;

    private java.lang.String codigoClase;

    private java.lang.String codigoSubclase;

    private java.lang.String codigoArticulo;

    public Articulo() {
    }

    public Articulo(
           java.lang.Integer idArticulo,
           java.lang.String codigoFamilia,
           java.lang.String codigoSubFamilia,
           java.lang.String codigoClase,
           java.lang.String codigoSubclase,
           java.lang.String codigoArticulo) {
           this.idArticulo = idArticulo;
           this.codigoFamilia = codigoFamilia;
           this.codigoSubFamilia = codigoSubFamilia;
           this.codigoClase = codigoClase;
           this.codigoSubclase = codigoSubclase;
           this.codigoArticulo = codigoArticulo;
    }


    /**
     * Gets the idArticulo value for this Articulo.
     * 
     * @return idArticulo
     */
    public java.lang.Integer getIdArticulo() {
        return idArticulo;
    }


    /**
     * Sets the idArticulo value for this Articulo.
     * 
     * @param idArticulo
     */
    public void setIdArticulo(java.lang.Integer idArticulo) {
        this.idArticulo = idArticulo;
    }


    /**
     * Gets the codigoFamilia value for this Articulo.
     * 
     * @return codigoFamilia
     */
    public java.lang.String getCodigoFamilia() {
        return codigoFamilia;
    }


    /**
     * Sets the codigoFamilia value for this Articulo.
     * 
     * @param codigoFamilia
     */
    public void setCodigoFamilia(java.lang.String codigoFamilia) {
        this.codigoFamilia = codigoFamilia;
    }


    /**
     * Gets the codigoSubFamilia value for this Articulo.
     * 
     * @return codigoSubFamilia
     */
    public java.lang.String getCodigoSubFamilia() {
        return codigoSubFamilia;
    }


    /**
     * Sets the codigoSubFamilia value for this Articulo.
     * 
     * @param codigoSubFamilia
     */
    public void setCodigoSubFamilia(java.lang.String codigoSubFamilia) {
        this.codigoSubFamilia = codigoSubFamilia;
    }


    /**
     * Gets the codigoClase value for this Articulo.
     * 
     * @return codigoClase
     */
    public java.lang.String getCodigoClase() {
        return codigoClase;
    }


    /**
     * Sets the codigoClase value for this Articulo.
     * 
     * @param codigoClase
     */
    public void setCodigoClase(java.lang.String codigoClase) {
        this.codigoClase = codigoClase;
    }


    /**
     * Gets the codigoSubclase value for this Articulo.
     * 
     * @return codigoSubclase
     */
    public java.lang.String getCodigoSubclase() {
        return codigoSubclase;
    }


    /**
     * Sets the codigoSubclase value for this Articulo.
     * 
     * @param codigoSubclase
     */
    public void setCodigoSubclase(java.lang.String codigoSubclase) {
        this.codigoSubclase = codigoSubclase;
    }


    /**
     * Gets the codigoArticulo value for this Articulo.
     * 
     * @return codigoArticulo
     */
    public java.lang.String getCodigoArticulo() {
        return codigoArticulo;
    }


    /**
     * Sets the codigoArticulo value for this Articulo.
     * 
     * @param codigoArticulo
     */
    public void setCodigoArticulo(java.lang.String codigoArticulo) {
        this.codigoArticulo = codigoArticulo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Articulo)) return false;
        Articulo other = (Articulo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.idArticulo==null && other.getIdArticulo()==null) || 
             (this.idArticulo!=null &&
              this.idArticulo.equals(other.getIdArticulo()))) &&
            ((this.codigoFamilia==null && other.getCodigoFamilia()==null) || 
             (this.codigoFamilia!=null &&
              this.codigoFamilia.equals(other.getCodigoFamilia()))) &&
            ((this.codigoSubFamilia==null && other.getCodigoSubFamilia()==null) || 
             (this.codigoSubFamilia!=null &&
              this.codigoSubFamilia.equals(other.getCodigoSubFamilia()))) &&
            ((this.codigoClase==null && other.getCodigoClase()==null) || 
             (this.codigoClase!=null &&
              this.codigoClase.equals(other.getCodigoClase()))) &&
            ((this.codigoSubclase==null && other.getCodigoSubclase()==null) || 
             (this.codigoSubclase!=null &&
              this.codigoSubclase.equals(other.getCodigoSubclase()))) &&
            ((this.codigoArticulo==null && other.getCodigoArticulo()==null) || 
             (this.codigoArticulo!=null &&
              this.codigoArticulo.equals(other.getCodigoArticulo())));
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
        if (getIdArticulo() != null) {
            _hashCode += getIdArticulo().hashCode();
        }
        if (getCodigoFamilia() != null) {
            _hashCode += getCodigoFamilia().hashCode();
        }
        if (getCodigoSubFamilia() != null) {
            _hashCode += getCodigoSubFamilia().hashCode();
        }
        if (getCodigoClase() != null) {
            _hashCode += getCodigoClase().hashCode();
        }
        if (getCodigoSubclase() != null) {
            _hashCode += getCodigoSubclase().hashCode();
        }
        if (getCodigoArticulo() != null) {
            _hashCode += getCodigoArticulo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Articulo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "articulo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idArticulo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idArticulo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoFamilia");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoFamilia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoSubFamilia");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoSubFamilia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoClase");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoClase"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoSubclase");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoSubclase"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoArticulo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoArticulo"));
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
