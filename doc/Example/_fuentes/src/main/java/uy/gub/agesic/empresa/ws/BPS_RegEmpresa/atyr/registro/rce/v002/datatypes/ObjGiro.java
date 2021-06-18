/**
 * ObjGiro.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v002.datatypes;

public class ObjGiro  implements java.io.Serializable {
    private java.lang.Integer codGiro;

    private java.lang.Integer codGiroApertura;

    private java.lang.String descGiro;

    private java.lang.String vigente;

    public ObjGiro() {
    }

    public ObjGiro(
           java.lang.Integer codGiro,
           java.lang.Integer codGiroApertura,
           java.lang.String descGiro,
           java.lang.String vigente) {
           this.codGiro = codGiro;
           this.codGiroApertura = codGiroApertura;
           this.descGiro = descGiro;
           this.vigente = vigente;
    }


    /**
     * Gets the codGiro value for this ObjGiro.
     * 
     * @return codGiro
     */
    public java.lang.Integer getCodGiro() {
        return codGiro;
    }


    /**
     * Sets the codGiro value for this ObjGiro.
     * 
     * @param codGiro
     */
    public void setCodGiro(java.lang.Integer codGiro) {
        this.codGiro = codGiro;
    }


    /**
     * Gets the codGiroApertura value for this ObjGiro.
     * 
     * @return codGiroApertura
     */
    public java.lang.Integer getCodGiroApertura() {
        return codGiroApertura;
    }


    /**
     * Sets the codGiroApertura value for this ObjGiro.
     * 
     * @param codGiroApertura
     */
    public void setCodGiroApertura(java.lang.Integer codGiroApertura) {
        this.codGiroApertura = codGiroApertura;
    }


    /**
     * Gets the descGiro value for this ObjGiro.
     * 
     * @return descGiro
     */
    public java.lang.String getDescGiro() {
        return descGiro;
    }


    /**
     * Sets the descGiro value for this ObjGiro.
     * 
     * @param descGiro
     */
    public void setDescGiro(java.lang.String descGiro) {
        this.descGiro = descGiro;
    }


    /**
     * Gets the vigente value for this ObjGiro.
     * 
     * @return vigente
     */
    public java.lang.String getVigente() {
        return vigente;
    }


    /**
     * Sets the vigente value for this ObjGiro.
     * 
     * @param vigente
     */
    public void setVigente(java.lang.String vigente) {
        this.vigente = vigente;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ObjGiro)) return false;
        ObjGiro other = (ObjGiro) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codGiro==null && other.getCodGiro()==null) || 
             (this.codGiro!=null &&
              this.codGiro.equals(other.getCodGiro()))) &&
            ((this.codGiroApertura==null && other.getCodGiroApertura()==null) || 
             (this.codGiroApertura!=null &&
              this.codGiroApertura.equals(other.getCodGiroApertura()))) &&
            ((this.descGiro==null && other.getDescGiro()==null) || 
             (this.descGiro!=null &&
              this.descGiro.equals(other.getDescGiro()))) &&
            ((this.vigente==null && other.getVigente()==null) || 
             (this.vigente!=null &&
              this.vigente.equals(other.getVigente())));
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
        if (getCodGiro() != null) {
            _hashCode += getCodGiro().hashCode();
        }
        if (getCodGiroApertura() != null) {
            _hashCode += getCodGiroApertura().hashCode();
        }
        if (getDescGiro() != null) {
            _hashCode += getDescGiro().hashCode();
        }
        if (getVigente() != null) {
            _hashCode += getVigente().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ObjGiro.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/rce/v002/datatypes", "ObjGiro"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codGiro");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codGiro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codGiroApertura");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codGiroApertura"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descGiro");
        elemField.setXmlName(new javax.xml.namespace.QName("", "descGiro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vigente");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vigente"));
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
