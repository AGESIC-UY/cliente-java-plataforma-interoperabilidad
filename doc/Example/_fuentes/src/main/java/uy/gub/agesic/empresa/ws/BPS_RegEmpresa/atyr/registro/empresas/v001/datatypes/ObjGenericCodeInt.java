/**
 * ObjGenericCodeInt.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v001.datatypes;

public class ObjGenericCodeInt  implements java.io.Serializable {
    private java.lang.Integer codAportacion;

    private java.lang.String descAportacion;

    private java.lang.String vigente;

    public ObjGenericCodeInt() {
    }

    public ObjGenericCodeInt(
           java.lang.Integer codAportacion,
           java.lang.String descAportacion,
           java.lang.String vigente) {
           this.codAportacion = codAportacion;
           this.descAportacion = descAportacion;
           this.vigente = vigente;
    }


    /**
     * Gets the codAportacion value for this ObjGenericCodeInt.
     * 
     * @return codAportacion
     */
    public java.lang.Integer getCodAportacion() {
        return codAportacion;
    }


    /**
     * Sets the codAportacion value for this ObjGenericCodeInt.
     * 
     * @param codAportacion
     */
    public void setCodAportacion(java.lang.Integer codAportacion) {
        this.codAportacion = codAportacion;
    }


    /**
     * Gets the descAportacion value for this ObjGenericCodeInt.
     * 
     * @return descAportacion
     */
    public java.lang.String getDescAportacion() {
        return descAportacion;
    }


    /**
     * Sets the descAportacion value for this ObjGenericCodeInt.
     * 
     * @param descAportacion
     */
    public void setDescAportacion(java.lang.String descAportacion) {
        this.descAportacion = descAportacion;
    }


    /**
     * Gets the vigente value for this ObjGenericCodeInt.
     * 
     * @return vigente
     */
    public java.lang.String getVigente() {
        return vigente;
    }


    /**
     * Sets the vigente value for this ObjGenericCodeInt.
     * 
     * @param vigente
     */
    public void setVigente(java.lang.String vigente) {
        this.vigente = vigente;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ObjGenericCodeInt)) return false;
        ObjGenericCodeInt other = (ObjGenericCodeInt) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codAportacion==null && other.getCodAportacion()==null) || 
             (this.codAportacion!=null &&
              this.codAportacion.equals(other.getCodAportacion()))) &&
            ((this.descAportacion==null && other.getDescAportacion()==null) || 
             (this.descAportacion!=null &&
              this.descAportacion.equals(other.getDescAportacion()))) &&
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
        if (getCodAportacion() != null) {
            _hashCode += getCodAportacion().hashCode();
        }
        if (getDescAportacion() != null) {
            _hashCode += getDescAportacion().hashCode();
        }
        if (getVigente() != null) {
            _hashCode += getVigente().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ObjGenericCodeInt.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/empresas/v001/datatypes", "objGenericCodeInt"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codAportacion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codAportacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descAportacion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "descAportacion"));
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
