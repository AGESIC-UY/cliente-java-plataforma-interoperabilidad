/**
 * Documento.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uy.gub.agesic.empresa.ws.ACCE_RUPE;

public class Documento  implements java.io.Serializable {
    private java.lang.Integer idDocumento;

    private java.lang.String tipoDocumento;

    private java.lang.String descripcion;

    private byte[] archivo;

    private java.util.Calendar vigenciaDesde;

    private java.util.Calendar vigenciaHasta;

    private java.lang.Integer version;

    private java.util.Calendar fechaVersion;

    public Documento() {
    }

    public Documento(
           java.lang.Integer idDocumento,
           java.lang.String tipoDocumento,
           java.lang.String descripcion,
           byte[] archivo,
           java.util.Calendar vigenciaDesde,
           java.util.Calendar vigenciaHasta,
           java.lang.Integer version,
           java.util.Calendar fechaVersion) {
           this.idDocumento = idDocumento;
           this.tipoDocumento = tipoDocumento;
           this.descripcion = descripcion;
           this.archivo = archivo;
           this.vigenciaDesde = vigenciaDesde;
           this.vigenciaHasta = vigenciaHasta;
           this.version = version;
           this.fechaVersion = fechaVersion;
    }


    /**
     * Gets the idDocumento value for this Documento.
     * 
     * @return idDocumento
     */
    public java.lang.Integer getIdDocumento() {
        return idDocumento;
    }


    /**
     * Sets the idDocumento value for this Documento.
     * 
     * @param idDocumento
     */
    public void setIdDocumento(java.lang.Integer idDocumento) {
        this.idDocumento = idDocumento;
    }


    /**
     * Gets the tipoDocumento value for this Documento.
     * 
     * @return tipoDocumento
     */
    public java.lang.String getTipoDocumento() {
        return tipoDocumento;
    }


    /**
     * Sets the tipoDocumento value for this Documento.
     * 
     * @param tipoDocumento
     */
    public void setTipoDocumento(java.lang.String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }


    /**
     * Gets the descripcion value for this Documento.
     * 
     * @return descripcion
     */
    public java.lang.String getDescripcion() {
        return descripcion;
    }


    /**
     * Sets the descripcion value for this Documento.
     * 
     * @param descripcion
     */
    public void setDescripcion(java.lang.String descripcion) {
        this.descripcion = descripcion;
    }


    /**
     * Gets the archivo value for this Documento.
     * 
     * @return archivo
     */
    public byte[] getArchivo() {
        return archivo;
    }


    /**
     * Sets the archivo value for this Documento.
     * 
     * @param archivo
     */
    public void setArchivo(byte[] archivo) {
        this.archivo = archivo;
    }


    /**
     * Gets the vigenciaDesde value for this Documento.
     * 
     * @return vigenciaDesde
     */
    public java.util.Calendar getVigenciaDesde() {
        return vigenciaDesde;
    }


    /**
     * Sets the vigenciaDesde value for this Documento.
     * 
     * @param vigenciaDesde
     */
    public void setVigenciaDesde(java.util.Calendar vigenciaDesde) {
        this.vigenciaDesde = vigenciaDesde;
    }


    /**
     * Gets the vigenciaHasta value for this Documento.
     * 
     * @return vigenciaHasta
     */
    public java.util.Calendar getVigenciaHasta() {
        return vigenciaHasta;
    }


    /**
     * Sets the vigenciaHasta value for this Documento.
     * 
     * @param vigenciaHasta
     */
    public void setVigenciaHasta(java.util.Calendar vigenciaHasta) {
        this.vigenciaHasta = vigenciaHasta;
    }


    /**
     * Gets the version value for this Documento.
     * 
     * @return version
     */
    public java.lang.Integer getVersion() {
        return version;
    }


    /**
     * Sets the version value for this Documento.
     * 
     * @param version
     */
    public void setVersion(java.lang.Integer version) {
        this.version = version;
    }


    /**
     * Gets the fechaVersion value for this Documento.
     * 
     * @return fechaVersion
     */
    public java.util.Calendar getFechaVersion() {
        return fechaVersion;
    }


    /**
     * Sets the fechaVersion value for this Documento.
     * 
     * @param fechaVersion
     */
    public void setFechaVersion(java.util.Calendar fechaVersion) {
        this.fechaVersion = fechaVersion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Documento)) return false;
        Documento other = (Documento) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.idDocumento==null && other.getIdDocumento()==null) || 
             (this.idDocumento!=null &&
              this.idDocumento.equals(other.getIdDocumento()))) &&
            ((this.tipoDocumento==null && other.getTipoDocumento()==null) || 
             (this.tipoDocumento!=null &&
              this.tipoDocumento.equals(other.getTipoDocumento()))) &&
            ((this.descripcion==null && other.getDescripcion()==null) || 
             (this.descripcion!=null &&
              this.descripcion.equals(other.getDescripcion()))) &&
            ((this.archivo==null && other.getArchivo()==null) || 
             (this.archivo!=null &&
              java.util.Arrays.equals(this.archivo, other.getArchivo()))) &&
            ((this.vigenciaDesde==null && other.getVigenciaDesde()==null) || 
             (this.vigenciaDesde!=null &&
              this.vigenciaDesde.equals(other.getVigenciaDesde()))) &&
            ((this.vigenciaHasta==null && other.getVigenciaHasta()==null) || 
             (this.vigenciaHasta!=null &&
              this.vigenciaHasta.equals(other.getVigenciaHasta()))) &&
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
        if (getIdDocumento() != null) {
            _hashCode += getIdDocumento().hashCode();
        }
        if (getTipoDocumento() != null) {
            _hashCode += getTipoDocumento().hashCode();
        }
        if (getDescripcion() != null) {
            _hashCode += getDescripcion().hashCode();
        }
        if (getArchivo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getArchivo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getArchivo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getVigenciaDesde() != null) {
            _hashCode += getVigenciaDesde().hashCode();
        }
        if (getVigenciaHasta() != null) {
            _hashCode += getVigenciaHasta().hashCode();
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
        new org.apache.axis.description.TypeDesc(Documento.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "documento"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idDocumento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idDocumento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("descripcion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "descripcion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("archivo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "archivo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vigenciaDesde");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vigenciaDesde"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vigenciaHasta");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vigenciaHasta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
