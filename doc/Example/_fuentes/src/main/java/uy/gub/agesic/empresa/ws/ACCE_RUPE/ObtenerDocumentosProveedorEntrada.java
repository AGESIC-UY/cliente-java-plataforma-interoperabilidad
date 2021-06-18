/**
 * ObtenerDocumentosProveedorEntrada.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uy.gub.agesic.empresa.ws.ACCE_RUPE;

public class ObtenerDocumentosProveedorEntrada  implements java.io.Serializable {
    private uy.gub.agesic.empresa.ws.ACCE_RUPE.IdentificacionProveedor identificacionPrincipalProveedor;

    private java.lang.String tipoDocumento;

    private java.lang.String codigoUsuario;

    private java.lang.Integer idProveedor;

    public ObtenerDocumentosProveedorEntrada() {
    }

    public ObtenerDocumentosProveedorEntrada(
           uy.gub.agesic.empresa.ws.ACCE_RUPE.IdentificacionProveedor identificacionPrincipalProveedor,
           java.lang.String tipoDocumento,
           java.lang.String codigoUsuario,
           java.lang.Integer idProveedor) {
           this.identificacionPrincipalProveedor = identificacionPrincipalProveedor;
           this.tipoDocumento = tipoDocumento;
           this.codigoUsuario = codigoUsuario;
           this.idProveedor = idProveedor;
    }


    /**
     * Gets the identificacionPrincipalProveedor value for this ObtenerDocumentosProveedorEntrada.
     * 
     * @return identificacionPrincipalProveedor
     */
    public uy.gub.agesic.empresa.ws.ACCE_RUPE.IdentificacionProveedor getIdentificacionPrincipalProveedor() {
        return identificacionPrincipalProveedor;
    }


    /**
     * Sets the identificacionPrincipalProveedor value for this ObtenerDocumentosProveedorEntrada.
     * 
     * @param identificacionPrincipalProveedor
     */
    public void setIdentificacionPrincipalProveedor(uy.gub.agesic.empresa.ws.ACCE_RUPE.IdentificacionProveedor identificacionPrincipalProveedor) {
        this.identificacionPrincipalProveedor = identificacionPrincipalProveedor;
    }


    /**
     * Gets the tipoDocumento value for this ObtenerDocumentosProveedorEntrada.
     * 
     * @return tipoDocumento
     */
    public java.lang.String getTipoDocumento() {
        return tipoDocumento;
    }


    /**
     * Sets the tipoDocumento value for this ObtenerDocumentosProveedorEntrada.
     * 
     * @param tipoDocumento
     */
    public void setTipoDocumento(java.lang.String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }


    /**
     * Gets the codigoUsuario value for this ObtenerDocumentosProveedorEntrada.
     * 
     * @return codigoUsuario
     */
    public java.lang.String getCodigoUsuario() {
        return codigoUsuario;
    }


    /**
     * Sets the codigoUsuario value for this ObtenerDocumentosProveedorEntrada.
     * 
     * @param codigoUsuario
     */
    public void setCodigoUsuario(java.lang.String codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }


    /**
     * Gets the idProveedor value for this ObtenerDocumentosProveedorEntrada.
     * 
     * @return idProveedor
     */
    public java.lang.Integer getIdProveedor() {
        return idProveedor;
    }


    /**
     * Sets the idProveedor value for this ObtenerDocumentosProveedorEntrada.
     * 
     * @param idProveedor
     */
    public void setIdProveedor(java.lang.Integer idProveedor) {
        this.idProveedor = idProveedor;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ObtenerDocumentosProveedorEntrada)) return false;
        ObtenerDocumentosProveedorEntrada other = (ObtenerDocumentosProveedorEntrada) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.identificacionPrincipalProveedor==null && other.getIdentificacionPrincipalProveedor()==null) || 
             (this.identificacionPrincipalProveedor!=null &&
              this.identificacionPrincipalProveedor.equals(other.getIdentificacionPrincipalProveedor()))) &&
            ((this.tipoDocumento==null && other.getTipoDocumento()==null) || 
             (this.tipoDocumento!=null &&
              this.tipoDocumento.equals(other.getTipoDocumento()))) &&
            ((this.codigoUsuario==null && other.getCodigoUsuario()==null) || 
             (this.codigoUsuario!=null &&
              this.codigoUsuario.equals(other.getCodigoUsuario()))) &&
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
        if (getIdentificacionPrincipalProveedor() != null) {
            _hashCode += getIdentificacionPrincipalProveedor().hashCode();
        }
        if (getTipoDocumento() != null) {
            _hashCode += getTipoDocumento().hashCode();
        }
        if (getCodigoUsuario() != null) {
            _hashCode += getCodigoUsuario().hashCode();
        }
        if (getIdProveedor() != null) {
            _hashCode += getIdProveedor().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ObtenerDocumentosProveedorEntrada.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "obtenerDocumentosProveedorEntrada"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identificacionPrincipalProveedor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "identificacionPrincipalProveedor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "identificacionProveedor"));
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
        elemField.setFieldName("codigoUsuario");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoUsuario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idProveedor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idProveedor"));
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
