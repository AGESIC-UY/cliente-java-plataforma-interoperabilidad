/**
 * Alcance.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uy.gub.agesic.empresa.ws.ACCE_RUPE;

public class Alcance  implements java.io.Serializable {
    private java.lang.Integer idAlcance;

    private java.lang.String codigoAlcance;

    private java.lang.String codigoInciso;

    private java.lang.String codigoUnidadEjecutora;

    private java.lang.Integer version;

    private java.util.Calendar fechaVersion;

    public Alcance() {
    }

    public Alcance(
           java.lang.Integer idAlcance,
           java.lang.String codigoAlcance,
           java.lang.String codigoInciso,
           java.lang.String codigoUnidadEjecutora,
           java.lang.Integer version,
           java.util.Calendar fechaVersion) {
           this.idAlcance = idAlcance;
           this.codigoAlcance = codigoAlcance;
           this.codigoInciso = codigoInciso;
           this.codigoUnidadEjecutora = codigoUnidadEjecutora;
           this.version = version;
           this.fechaVersion = fechaVersion;
    }


    /**
     * Gets the idAlcance value for this Alcance.
     * 
     * @return idAlcance
     */
    public java.lang.Integer getIdAlcance() {
        return idAlcance;
    }


    /**
     * Sets the idAlcance value for this Alcance.
     * 
     * @param idAlcance
     */
    public void setIdAlcance(java.lang.Integer idAlcance) {
        this.idAlcance = idAlcance;
    }


    /**
     * Gets the codigoAlcance value for this Alcance.
     * 
     * @return codigoAlcance
     */
    public java.lang.String getCodigoAlcance() {
        return codigoAlcance;
    }


    /**
     * Sets the codigoAlcance value for this Alcance.
     * 
     * @param codigoAlcance
     */
    public void setCodigoAlcance(java.lang.String codigoAlcance) {
        this.codigoAlcance = codigoAlcance;
    }


    /**
     * Gets the codigoInciso value for this Alcance.
     * 
     * @return codigoInciso
     */
    public java.lang.String getCodigoInciso() {
        return codigoInciso;
    }


    /**
     * Sets the codigoInciso value for this Alcance.
     * 
     * @param codigoInciso
     */
    public void setCodigoInciso(java.lang.String codigoInciso) {
        this.codigoInciso = codigoInciso;
    }


    /**
     * Gets the codigoUnidadEjecutora value for this Alcance.
     * 
     * @return codigoUnidadEjecutora
     */
    public java.lang.String getCodigoUnidadEjecutora() {
        return codigoUnidadEjecutora;
    }


    /**
     * Sets the codigoUnidadEjecutora value for this Alcance.
     * 
     * @param codigoUnidadEjecutora
     */
    public void setCodigoUnidadEjecutora(java.lang.String codigoUnidadEjecutora) {
        this.codigoUnidadEjecutora = codigoUnidadEjecutora;
    }


    /**
     * Gets the version value for this Alcance.
     * 
     * @return version
     */
    public java.lang.Integer getVersion() {
        return version;
    }


    /**
     * Sets the version value for this Alcance.
     * 
     * @param version
     */
    public void setVersion(java.lang.Integer version) {
        this.version = version;
    }


    /**
     * Gets the fechaVersion value for this Alcance.
     * 
     * @return fechaVersion
     */
    public java.util.Calendar getFechaVersion() {
        return fechaVersion;
    }


    /**
     * Sets the fechaVersion value for this Alcance.
     * 
     * @param fechaVersion
     */
    public void setFechaVersion(java.util.Calendar fechaVersion) {
        this.fechaVersion = fechaVersion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Alcance)) return false;
        Alcance other = (Alcance) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.idAlcance==null && other.getIdAlcance()==null) || 
             (this.idAlcance!=null &&
              this.idAlcance.equals(other.getIdAlcance()))) &&
            ((this.codigoAlcance==null && other.getCodigoAlcance()==null) || 
             (this.codigoAlcance!=null &&
              this.codigoAlcance.equals(other.getCodigoAlcance()))) &&
            ((this.codigoInciso==null && other.getCodigoInciso()==null) || 
             (this.codigoInciso!=null &&
              this.codigoInciso.equals(other.getCodigoInciso()))) &&
            ((this.codigoUnidadEjecutora==null && other.getCodigoUnidadEjecutora()==null) || 
             (this.codigoUnidadEjecutora!=null &&
              this.codigoUnidadEjecutora.equals(other.getCodigoUnidadEjecutora()))) &&
            ((this.version==null && other.getVersion()==null) || 
             (this.version!=null &&
              this.version.equals(other.getVersion()))) &&
            ((this.fechaVersion==null && other.getFechaVersion()==null) || 
             (this.fechaVersion!=null &&
              this.fechaVersion.equals(other.getFechaVersion())));
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
        if (getIdAlcance() != null) {
            _hashCode += getIdAlcance().hashCode();
        }
        if (getCodigoAlcance() != null) {
            _hashCode += getCodigoAlcance().hashCode();
        }
        if (getCodigoInciso() != null) {
            _hashCode += getCodigoInciso().hashCode();
        }
        if (getCodigoUnidadEjecutora() != null) {
            _hashCode += getCodigoUnidadEjecutora().hashCode();
        }
        if (getVersion() != null) {
            _hashCode += getVersion().hashCode();
        }
        if (getFechaVersion() != null) {
            _hashCode += getFechaVersion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Alcance.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "alcance"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idAlcance");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idAlcance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoAlcance");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoAlcance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoInciso");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoInciso"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoUnidadEjecutora");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoUnidadEjecutora"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("version");
        elemField.setXmlName(new javax.xml.namespace.QName("", "version"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fechaVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
