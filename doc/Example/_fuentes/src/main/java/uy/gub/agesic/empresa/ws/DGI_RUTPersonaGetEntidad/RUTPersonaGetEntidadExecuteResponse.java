/**
 * RUTPersonaGetEntidadExecuteResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uy.gub.agesic.empresa.ws.DGI_RUTPersonaGetEntidad;

public class RUTPersonaGetEntidadExecuteResponse  implements java.io.Serializable {
    private java.lang.String data;

    private java.lang.String mensajes;

    public RUTPersonaGetEntidadExecuteResponse() {
    }

    public RUTPersonaGetEntidadExecuteResponse(
           java.lang.String data,
           java.lang.String mensajes) {
           this.data = data;
           this.mensajes = mensajes;
    }


    /**
     * Gets the data value for this RUTPersonaGetEntidadExecuteResponse.
     * 
     * @return data
     */
    public java.lang.String getData() {
        return data;
    }


    /**
     * Sets the data value for this RUTPersonaGetEntidadExecuteResponse.
     * 
     * @param data
     */
    public void setData(java.lang.String data) {
        this.data = data;
    }


    /**
     * Gets the mensajes value for this RUTPersonaGetEntidadExecuteResponse.
     * 
     * @return mensajes
     */
    public java.lang.String getMensajes() {
        return mensajes;
    }


    /**
     * Sets the mensajes value for this RUTPersonaGetEntidadExecuteResponse.
     * 
     * @param mensajes
     */
    public void setMensajes(java.lang.String mensajes) {
        this.mensajes = mensajes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RUTPersonaGetEntidadExecuteResponse)) return false;
        RUTPersonaGetEntidadExecuteResponse other = (RUTPersonaGetEntidadExecuteResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.data==null && other.getData()==null) || 
             (this.data!=null &&
              this.data.equals(other.getData()))) &&
            ((this.mensajes==null && other.getMensajes()==null) || 
             (this.mensajes!=null &&
              this.mensajes.equals(other.getMensajes())));
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
        if (getData() != null) {
            _hashCode += getData().hashCode();
        }
        if (getMensajes() != null) {
            _hashCode += getMensajes().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RUTPersonaGetEntidadExecuteResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("DGI_Modernizacion_Consolidado", ">RUTPersonaGetEntidad.ExecuteResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("data");
        elemField.setXmlName(new javax.xml.namespace.QName("DGI_Modernizacion_Consolidado", "Data"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mensajes");
        elemField.setXmlName(new javax.xml.namespace.QName("DGI_Modernizacion_Consolidado", "Mensajes"));
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
