/**
 * ObtenerDatosProveedorEntrada.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uy.gub.agesic.empresa.ws.ACCE_RUPE;

public class ObtenerDatosProveedorEntrada  implements java.io.Serializable {
    private uy.gub.agesic.empresa.ws.ACCE_RUPE.IdentificacionProveedor idProveedor;

    public ObtenerDatosProveedorEntrada() {
    }

    public ObtenerDatosProveedorEntrada(
           uy.gub.agesic.empresa.ws.ACCE_RUPE.IdentificacionProveedor idProveedor) {
           this.idProveedor = idProveedor;
    }


    /**
     * Gets the idProveedor value for this ObtenerDatosProveedorEntrada.
     * 
     * @return idProveedor
     */
    public uy.gub.agesic.empresa.ws.ACCE_RUPE.IdentificacionProveedor getIdProveedor() {
        return idProveedor;
    }


    /**
     * Sets the idProveedor value for this ObtenerDatosProveedorEntrada.
     * 
     * @param idProveedor
     */
    public void setIdProveedor(uy.gub.agesic.empresa.ws.ACCE_RUPE.IdentificacionProveedor idProveedor) {
        this.idProveedor = idProveedor;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ObtenerDatosProveedorEntrada)) return false;
        ObtenerDatosProveedorEntrada other = (ObtenerDatosProveedorEntrada) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.idProveedor==null && other.getIdProveedor()==null) || 
             (this.idProveedor!=null &&
              this.idProveedor.equals(other.getIdProveedor())));
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
        if (getIdProveedor() != null) {
            _hashCode += getIdProveedor().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ObtenerDatosProveedorEntrada.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "obtenerDatosProveedorEntrada"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idProveedor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idProveedor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "identificacionProveedor"));
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
