/**
 * RolYAtribuciones.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uy.gub.agesic.empresa.ws.ACCE_RUPE;

public class RolYAtribuciones  implements java.io.Serializable {
    private java.lang.String codigoAtribucion;

    private java.lang.String codigoRol;

    private java.lang.Integer modalidad;

    public RolYAtribuciones() {
    }

    public RolYAtribuciones(
           java.lang.String codigoAtribucion,
           java.lang.String codigoRol,
           java.lang.Integer modalidad) {
           this.codigoAtribucion = codigoAtribucion;
           this.codigoRol = codigoRol;
           this.modalidad = modalidad;
    }


    /**
     * Gets the codigoAtribucion value for this RolYAtribuciones.
     * 
     * @return codigoAtribucion
     */
    public java.lang.String getCodigoAtribucion() {
        return codigoAtribucion;
    }


    /**
     * Sets the codigoAtribucion value for this RolYAtribuciones.
     * 
     * @param codigoAtribucion
     */
    public void setCodigoAtribucion(java.lang.String codigoAtribucion) {
        this.codigoAtribucion = codigoAtribucion;
    }


    /**
     * Gets the codigoRol value for this RolYAtribuciones.
     * 
     * @return codigoRol
     */
    public java.lang.String getCodigoRol() {
        return codigoRol;
    }


    /**
     * Sets the codigoRol value for this RolYAtribuciones.
     * 
     * @param codigoRol
     */
    public void setCodigoRol(java.lang.String codigoRol) {
        this.codigoRol = codigoRol;
    }


    /**
     * Gets the modalidad value for this RolYAtribuciones.
     * 
     * @return modalidad
     */
    public java.lang.Integer getModalidad() {
        return modalidad;
    }


    /**
     * Sets the modalidad value for this RolYAtribuciones.
     * 
     * @param modalidad
     */
    public void setModalidad(java.lang.Integer modalidad) {
        this.modalidad = modalidad;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RolYAtribuciones)) return false;
        RolYAtribuciones other = (RolYAtribuciones) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codigoAtribucion==null && other.getCodigoAtribucion()==null) || 
             (this.codigoAtribucion!=null &&
              this.codigoAtribucion.equals(other.getCodigoAtribucion()))) &&
            ((this.codigoRol==null && other.getCodigoRol()==null) || 
             (this.codigoRol!=null &&
              this.codigoRol.equals(other.getCodigoRol()))) &&
            ((this.modalidad==null && other.getModalidad()==null) || 
             (this.modalidad!=null &&
              this.modalidad.equals(other.getModalidad())));
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
        if (getCodigoAtribucion() != null) {
            _hashCode += getCodigoAtribucion().hashCode();
        }
        if (getCodigoRol() != null) {
            _hashCode += getCodigoRol().hashCode();
        }
        if (getModalidad() != null) {
            _hashCode += getModalidad().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RolYAtribuciones.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "rolYAtribuciones"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoAtribucion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoAtribucion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoRol");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoRol"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modalidad");
        elemField.setXmlName(new javax.xml.namespace.QName("", "modalidad"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
