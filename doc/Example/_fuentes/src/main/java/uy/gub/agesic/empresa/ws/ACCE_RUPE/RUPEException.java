/**
 * RUPEException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uy.gub.agesic.empresa.ws.ACCE_RUPE;

public class RUPEException  extends org.apache.axis.AxisFault  implements java.io.Serializable {
    private uy.gub.agesic.empresa.ws.ACCE_RUPE.Mensaje[] mensajes;

    private java.lang.Integer codigo;

    public RUPEException() {
    }

    public RUPEException(
           uy.gub.agesic.empresa.ws.ACCE_RUPE.Mensaje[] mensajes,
           java.lang.Integer codigo) {
        this.mensajes = mensajes;
        this.codigo = codigo;
    }


    /**
     * Gets the mensajes value for this RUPEException.
     * 
     * @return mensajes
     */
    public uy.gub.agesic.empresa.ws.ACCE_RUPE.Mensaje[] getMensajes() {
        return mensajes;
    }


    /**
     * Sets the mensajes value for this RUPEException.
     * 
     * @param mensajes
     */
    public void setMensajes(uy.gub.agesic.empresa.ws.ACCE_RUPE.Mensaje[] mensajes) {
        this.mensajes = mensajes;
    }

    public uy.gub.agesic.empresa.ws.ACCE_RUPE.Mensaje getMensajes(int i) {
        return this.mensajes[i];
    }

    public void setMensajes(int i, uy.gub.agesic.empresa.ws.ACCE_RUPE.Mensaje _value) {
        this.mensajes[i] = _value;
    }


    /**
     * Gets the codigo value for this RUPEException.
     * 
     * @return codigo
     */
    public java.lang.Integer getCodigo() {
        return codigo;
    }


    /**
     * Sets the codigo value for this RUPEException.
     * 
     * @param codigo
     */
    public void setCodigo(java.lang.Integer codigo) {
        this.codigo = codigo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RUPEException)) return false;
        RUPEException other = (RUPEException) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.mensajes==null && other.getMensajes()==null) || 
             (this.mensajes!=null &&
              java.util.Arrays.equals(this.mensajes, other.getMensajes()))) &&
            ((this.codigo==null && other.getCodigo()==null) || 
             (this.codigo!=null &&
              this.codigo.equals(other.getCodigo())));
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
        if (getMensajes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMensajes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMensajes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCodigo() != null) {
            _hashCode += getCodigo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RUPEException.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "RUPEException"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mensajes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mensajes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "mensaje"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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


    /**
     * Writes the exception data to the faultDetails
     */
    public void writeDetails(javax.xml.namespace.QName qname, org.apache.axis.encoding.SerializationContext context) throws java.io.IOException {
        context.serialize(qname, null, this);
    }
}
