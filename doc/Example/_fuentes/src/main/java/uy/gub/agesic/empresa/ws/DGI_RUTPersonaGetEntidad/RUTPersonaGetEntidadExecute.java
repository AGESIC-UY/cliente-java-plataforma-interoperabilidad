/**
 * RUTPersonaGetEntidadExecute.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uy.gub.agesic.empresa.ws.DGI_RUTPersonaGetEntidad;

public class RUTPersonaGetEntidadExecute  implements java.io.Serializable {
    private java.lang.String ruc;

    public RUTPersonaGetEntidadExecute() {
    }

    public RUTPersonaGetEntidadExecute(
           java.lang.String ruc) {
           this.ruc = ruc;
    }


    /**
     * Gets the ruc value for this RUTPersonaGetEntidadExecute.
     * 
     * @return ruc
     */
    public java.lang.String getRuc() {
        return ruc;
    }


    /**
     * Sets the ruc value for this RUTPersonaGetEntidadExecute.
     * 
     * @param ruc
     */
    public void setRuc(java.lang.String ruc) {
        this.ruc = ruc;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RUTPersonaGetEntidadExecute)) return false;
        RUTPersonaGetEntidadExecute other = (RUTPersonaGetEntidadExecute) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ruc==null && other.getRuc()==null) || 
             (this.ruc!=null &&
              this.ruc.equals(other.getRuc())));
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
        if (getRuc() != null) {
            _hashCode += getRuc().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RUTPersonaGetEntidadExecute.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("DGI_Modernizacion_Consolidado", ">RUTPersonaGetEntidad.Execute"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ruc");
        elemField.setXmlName(new javax.xml.namespace.QName("DGI_Modernizacion_Consolidado", "Ruc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
