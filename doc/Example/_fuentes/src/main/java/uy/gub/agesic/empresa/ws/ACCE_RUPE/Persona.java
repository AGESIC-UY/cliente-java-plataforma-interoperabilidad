/**
 * Persona.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uy.gub.agesic.empresa.ws.ACCE_RUPE;

public class Persona  implements java.io.Serializable {
    private java.lang.Integer idPersona;

    private uy.gub.agesic.empresa.ws.ACCE_RUPE.IdentificacionPersona identificacion;

    private java.lang.String primerNombre;

    private java.lang.String segundoNombre;

    private java.lang.String primerApellido;

    private java.lang.String segundoApellido;

    private java.lang.String nombreEnDocumento;

    private byte[] firma;

    private java.lang.Integer version;

    private java.util.Calendar fechaVersion;

    public Persona() {
    }

    public Persona(
           java.lang.Integer idPersona,
           uy.gub.agesic.empresa.ws.ACCE_RUPE.IdentificacionPersona identificacion,
           java.lang.String primerNombre,
           java.lang.String segundoNombre,
           java.lang.String primerApellido,
           java.lang.String segundoApellido,
           java.lang.String nombreEnDocumento,
           byte[] firma,
           java.lang.Integer version,
           java.util.Calendar fechaVersion) {
           this.idPersona = idPersona;
           this.identificacion = identificacion;
           this.primerNombre = primerNombre;
           this.segundoNombre = segundoNombre;
           this.primerApellido = primerApellido;
           this.segundoApellido = segundoApellido;
           this.nombreEnDocumento = nombreEnDocumento;
           this.firma = firma;
           this.version = version;
           this.fechaVersion = fechaVersion;
    }


    /**
     * Gets the idPersona value for this Persona.
     * 
     * @return idPersona
     */
    public java.lang.Integer getIdPersona() {
        return idPersona;
    }


    /**
     * Sets the idPersona value for this Persona.
     * 
     * @param idPersona
     */
    public void setIdPersona(java.lang.Integer idPersona) {
        this.idPersona = idPersona;
    }


    /**
     * Gets the identificacion value for this Persona.
     * 
     * @return identificacion
     */
    public uy.gub.agesic.empresa.ws.ACCE_RUPE.IdentificacionPersona getIdentificacion() {
        return identificacion;
    }


    /**
     * Sets the identificacion value for this Persona.
     * 
     * @param identificacion
     */
    public void setIdentificacion(uy.gub.agesic.empresa.ws.ACCE_RUPE.IdentificacionPersona identificacion) {
        this.identificacion = identificacion;
    }


    /**
     * Gets the primerNombre value for this Persona.
     * 
     * @return primerNombre
     */
    public java.lang.String getPrimerNombre() {
        return primerNombre;
    }


    /**
     * Sets the primerNombre value for this Persona.
     * 
     * @param primerNombre
     */
    public void setPrimerNombre(java.lang.String primerNombre) {
        this.primerNombre = primerNombre;
    }


    /**
     * Gets the segundoNombre value for this Persona.
     * 
     * @return segundoNombre
     */
    public java.lang.String getSegundoNombre() {
        return segundoNombre;
    }


    /**
     * Sets the segundoNombre value for this Persona.
     * 
     * @param segundoNombre
     */
    public void setSegundoNombre(java.lang.String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }


    /**
     * Gets the primerApellido value for this Persona.
     * 
     * @return primerApellido
     */
    public java.lang.String getPrimerApellido() {
        return primerApellido;
    }


    /**
     * Sets the primerApellido value for this Persona.
     * 
     * @param primerApellido
     */
    public void setPrimerApellido(java.lang.String primerApellido) {
        this.primerApellido = primerApellido;
    }


    /**
     * Gets the segundoApellido value for this Persona.
     * 
     * @return segundoApellido
     */
    public java.lang.String getSegundoApellido() {
        return segundoApellido;
    }


    /**
     * Sets the segundoApellido value for this Persona.
     * 
     * @param segundoApellido
     */
    public void setSegundoApellido(java.lang.String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }


    /**
     * Gets the nombreEnDocumento value for this Persona.
     * 
     * @return nombreEnDocumento
     */
    public java.lang.String getNombreEnDocumento() {
        return nombreEnDocumento;
    }


    /**
     * Sets the nombreEnDocumento value for this Persona.
     * 
     * @param nombreEnDocumento
     */
    public void setNombreEnDocumento(java.lang.String nombreEnDocumento) {
        this.nombreEnDocumento = nombreEnDocumento;
    }


    /**
     * Gets the firma value for this Persona.
     * 
     * @return firma
     */
    public byte[] getFirma() {
        return firma;
    }


    /**
     * Sets the firma value for this Persona.
     * 
     * @param firma
     */
    public void setFirma(byte[] firma) {
        this.firma = firma;
    }


    /**
     * Gets the version value for this Persona.
     * 
     * @return version
     */
    public java.lang.Integer getVersion() {
        return version;
    }


    /**
     * Sets the version value for this Persona.
     * 
     * @param version
     */
    public void setVersion(java.lang.Integer version) {
        this.version = version;
    }


    /**
     * Gets the fechaVersion value for this Persona.
     * 
     * @return fechaVersion
     */
    public java.util.Calendar getFechaVersion() {
        return fechaVersion;
    }


    /**
     * Sets the fechaVersion value for this Persona.
     * 
     * @param fechaVersion
     */
    public void setFechaVersion(java.util.Calendar fechaVersion) {
        this.fechaVersion = fechaVersion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Persona)) return false;
        Persona other = (Persona) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.idPersona==null && other.getIdPersona()==null) || 
             (this.idPersona!=null &&
              this.idPersona.equals(other.getIdPersona()))) &&
            ((this.identificacion==null && other.getIdentificacion()==null) || 
             (this.identificacion!=null &&
              this.identificacion.equals(other.getIdentificacion()))) &&
            ((this.primerNombre==null && other.getPrimerNombre()==null) || 
             (this.primerNombre!=null &&
              this.primerNombre.equals(other.getPrimerNombre()))) &&
            ((this.segundoNombre==null && other.getSegundoNombre()==null) || 
             (this.segundoNombre!=null &&
              this.segundoNombre.equals(other.getSegundoNombre()))) &&
            ((this.primerApellido==null && other.getPrimerApellido()==null) || 
             (this.primerApellido!=null &&
              this.primerApellido.equals(other.getPrimerApellido()))) &&
            ((this.segundoApellido==null && other.getSegundoApellido()==null) || 
             (this.segundoApellido!=null &&
              this.segundoApellido.equals(other.getSegundoApellido()))) &&
            ((this.nombreEnDocumento==null && other.getNombreEnDocumento()==null) || 
             (this.nombreEnDocumento!=null &&
              this.nombreEnDocumento.equals(other.getNombreEnDocumento()))) &&
            ((this.firma==null && other.getFirma()==null) || 
             (this.firma!=null &&
              java.util.Arrays.equals(this.firma, other.getFirma()))) &&
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
        if (getIdPersona() != null) {
            _hashCode += getIdPersona().hashCode();
        }
        if (getIdentificacion() != null) {
            _hashCode += getIdentificacion().hashCode();
        }
        if (getPrimerNombre() != null) {
            _hashCode += getPrimerNombre().hashCode();
        }
        if (getSegundoNombre() != null) {
            _hashCode += getSegundoNombre().hashCode();
        }
        if (getPrimerApellido() != null) {
            _hashCode += getPrimerApellido().hashCode();
        }
        if (getSegundoApellido() != null) {
            _hashCode += getSegundoApellido().hashCode();
        }
        if (getNombreEnDocumento() != null) {
            _hashCode += getNombreEnDocumento().hashCode();
        }
        if (getFirma() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFirma());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFirma(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        new org.apache.axis.description.TypeDesc(Persona.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "persona"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idPersona");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idPersona"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identificacion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "identificacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "identificacionPersona"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primerNombre");
        elemField.setXmlName(new javax.xml.namespace.QName("", "primerNombre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("segundoNombre");
        elemField.setXmlName(new javax.xml.namespace.QName("", "segundoNombre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primerApellido");
        elemField.setXmlName(new javax.xml.namespace.QName("", "primerApellido"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("segundoApellido");
        elemField.setXmlName(new javax.xml.namespace.QName("", "segundoApellido"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombreEnDocumento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nombreEnDocumento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firma");
        elemField.setXmlName(new javax.xml.namespace.QName("", "firma"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
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
