/**
 * Comunicacion.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uy.gub.agesic.empresa.ws.ACCE_RUPE;

public class Comunicacion  implements java.io.Serializable {
    private java.lang.Integer idComunicacion;

    private java.lang.String tipoComunicacion;

    private java.lang.String destino;

    private java.lang.String comentario;

    private java.lang.Integer version;

    private java.util.Calendar fechaVersion;

    public Comunicacion() {
    }

    public Comunicacion(
           java.lang.Integer idComunicacion,
           java.lang.String tipoComunicacion,
           java.lang.String destino,
           java.lang.String comentario,
           java.lang.Integer version,
           java.util.Calendar fechaVersion) {
           this.idComunicacion = idComunicacion;
           this.tipoComunicacion = tipoComunicacion;
           this.destino = destino;
           this.comentario = comentario;
           this.version = version;
           this.fechaVersion = fechaVersion;
    }


    /**
     * Gets the idComunicacion value for this Comunicacion.
     * 
     * @return idComunicacion
     */
    public java.lang.Integer getIdComunicacion() {
        return idComunicacion;
    }


    /**
     * Sets the idComunicacion value for this Comunicacion.
     * 
     * @param idComunicacion
     */
    public void setIdComunicacion(java.lang.Integer idComunicacion) {
        this.idComunicacion = idComunicacion;
    }


    /**
     * Gets the tipoComunicacion value for this Comunicacion.
     * 
     * @return tipoComunicacion
     */
    public java.lang.String getTipoComunicacion() {
        return tipoComunicacion;
    }


    /**
     * Sets the tipoComunicacion value for this Comunicacion.
     * 
     * @param tipoComunicacion
     */
    public void setTipoComunicacion(java.lang.String tipoComunicacion) {
        this.tipoComunicacion = tipoComunicacion;
    }


    /**
     * Gets the destino value for this Comunicacion.
     * 
     * @return destino
     */
    public java.lang.String getDestino() {
        return destino;
    }


    /**
     * Sets the destino value for this Comunicacion.
     * 
     * @param destino
     */
    public void setDestino(java.lang.String destino) {
        this.destino = destino;
    }


    /**
     * Gets the comentario value for this Comunicacion.
     * 
     * @return comentario
     */
    public java.lang.String getComentario() {
        return comentario;
    }


    /**
     * Sets the comentario value for this Comunicacion.
     * 
     * @param comentario
     */
    public void setComentario(java.lang.String comentario) {
        this.comentario = comentario;
    }


    /**
     * Gets the version value for this Comunicacion.
     * 
     * @return version
     */
    public java.lang.Integer getVersion() {
        return version;
    }


    /**
     * Sets the version value for this Comunicacion.
     * 
     * @param version
     */
    public void setVersion(java.lang.Integer version) {
        this.version = version;
    }


    /**
     * Gets the fechaVersion value for this Comunicacion.
     * 
     * @return fechaVersion
     */
    public java.util.Calendar getFechaVersion() {
        return fechaVersion;
    }


    /**
     * Sets the fechaVersion value for this Comunicacion.
     * 
     * @param fechaVersion
     */
    public void setFechaVersion(java.util.Calendar fechaVersion) {
        this.fechaVersion = fechaVersion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Comunicacion)) return false;
        Comunicacion other = (Comunicacion) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.idComunicacion==null && other.getIdComunicacion()==null) || 
             (this.idComunicacion!=null &&
              this.idComunicacion.equals(other.getIdComunicacion()))) &&
            ((this.tipoComunicacion==null && other.getTipoComunicacion()==null) || 
             (this.tipoComunicacion!=null &&
              this.tipoComunicacion.equals(other.getTipoComunicacion()))) &&
            ((this.destino==null && other.getDestino()==null) || 
             (this.destino!=null &&
              this.destino.equals(other.getDestino()))) &&
            ((this.comentario==null && other.getComentario()==null) || 
             (this.comentario!=null &&
              this.comentario.equals(other.getComentario()))) &&
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
        if (getIdComunicacion() != null) {
            _hashCode += getIdComunicacion().hashCode();
        }
        if (getTipoComunicacion() != null) {
            _hashCode += getTipoComunicacion().hashCode();
        }
        if (getDestino() != null) {
            _hashCode += getDestino().hashCode();
        }
        if (getComentario() != null) {
            _hashCode += getComentario().hashCode();
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
        new org.apache.axis.description.TypeDesc(Comunicacion.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "comunicacion"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idComunicacion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idComunicacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoComunicacion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipoComunicacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destino");
        elemField.setXmlName(new javax.xml.namespace.QName("", "destino"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comentario");
        elemField.setXmlName(new javax.xml.namespace.QName("", "comentario"));
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
