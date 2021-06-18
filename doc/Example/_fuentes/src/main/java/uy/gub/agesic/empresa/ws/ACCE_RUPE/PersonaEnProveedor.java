/**
 * PersonaEnProveedor.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uy.gub.agesic.empresa.ws.ACCE_RUPE;

public class PersonaEnProveedor  implements java.io.Serializable {
    private uy.gub.agesic.empresa.ws.ACCE_RUPE.Persona persona;

    private java.lang.String rolEnProveedor;

    private java.util.Calendar fechaDesde;

    private java.util.Calendar fechaHasta;

    private java.lang.Integer version;

    private java.util.Calendar fechaVersion;

    private java.lang.Integer idProveedor;

    private uy.gub.agesic.empresa.ws.ACCE_RUPE.IdentificacionProveedor identificacionProveedor;

    private uy.gub.agesic.empresa.ws.ACCE_RUPE.RolYAtribuciones[] listaAtribuciones;

    public PersonaEnProveedor() {
    }

    public PersonaEnProveedor(
           uy.gub.agesic.empresa.ws.ACCE_RUPE.Persona persona,
           java.lang.String rolEnProveedor,
           java.util.Calendar fechaDesde,
           java.util.Calendar fechaHasta,
           java.lang.Integer version,
           java.util.Calendar fechaVersion,
           java.lang.Integer idProveedor,
           uy.gub.agesic.empresa.ws.ACCE_RUPE.IdentificacionProveedor identificacionProveedor,
           uy.gub.agesic.empresa.ws.ACCE_RUPE.RolYAtribuciones[] listaAtribuciones) {
           this.persona = persona;
           this.rolEnProveedor = rolEnProveedor;
           this.fechaDesde = fechaDesde;
           this.fechaHasta = fechaHasta;
           this.version = version;
           this.fechaVersion = fechaVersion;
           this.idProveedor = idProveedor;
           this.identificacionProveedor = identificacionProveedor;
           this.listaAtribuciones = listaAtribuciones;
    }


    /**
     * Gets the persona value for this PersonaEnProveedor.
     * 
     * @return persona
     */
    public uy.gub.agesic.empresa.ws.ACCE_RUPE.Persona getPersona() {
        return persona;
    }


    /**
     * Sets the persona value for this PersonaEnProveedor.
     * 
     * @param persona
     */
    public void setPersona(uy.gub.agesic.empresa.ws.ACCE_RUPE.Persona persona) {
        this.persona = persona;
    }


    /**
     * Gets the rolEnProveedor value for this PersonaEnProveedor.
     * 
     * @return rolEnProveedor
     */
    public java.lang.String getRolEnProveedor() {
        return rolEnProveedor;
    }


    /**
     * Sets the rolEnProveedor value for this PersonaEnProveedor.
     * 
     * @param rolEnProveedor
     */
    public void setRolEnProveedor(java.lang.String rolEnProveedor) {
        this.rolEnProveedor = rolEnProveedor;
    }


    /**
     * Gets the fechaDesde value for this PersonaEnProveedor.
     * 
     * @return fechaDesde
     */
    public java.util.Calendar getFechaDesde() {
        return fechaDesde;
    }


    /**
     * Sets the fechaDesde value for this PersonaEnProveedor.
     * 
     * @param fechaDesde
     */
    public void setFechaDesde(java.util.Calendar fechaDesde) {
        this.fechaDesde = fechaDesde;
    }


    /**
     * Gets the fechaHasta value for this PersonaEnProveedor.
     * 
     * @return fechaHasta
     */
    public java.util.Calendar getFechaHasta() {
        return fechaHasta;
    }


    /**
     * Sets the fechaHasta value for this PersonaEnProveedor.
     * 
     * @param fechaHasta
     */
    public void setFechaHasta(java.util.Calendar fechaHasta) {
        this.fechaHasta = fechaHasta;
    }


    /**
     * Gets the version value for this PersonaEnProveedor.
     * 
     * @return version
     */
    public java.lang.Integer getVersion() {
        return version;
    }


    /**
     * Sets the version value for this PersonaEnProveedor.
     * 
     * @param version
     */
    public void setVersion(java.lang.Integer version) {
        this.version = version;
    }


    /**
     * Gets the fechaVersion value for this PersonaEnProveedor.
     * 
     * @return fechaVersion
     */
    public java.util.Calendar getFechaVersion() {
        return fechaVersion;
    }


    /**
     * Sets the fechaVersion value for this PersonaEnProveedor.
     * 
     * @param fechaVersion
     */
    public void setFechaVersion(java.util.Calendar fechaVersion) {
        this.fechaVersion = fechaVersion;
    }


    /**
     * Gets the idProveedor value for this PersonaEnProveedor.
     * 
     * @return idProveedor
     */
    public java.lang.Integer getIdProveedor() {
        return idProveedor;
    }


    /**
     * Sets the idProveedor value for this PersonaEnProveedor.
     * 
     * @param idProveedor
     */
    public void setIdProveedor(java.lang.Integer idProveedor) {
        this.idProveedor = idProveedor;
    }


    /**
     * Gets the identificacionProveedor value for this PersonaEnProveedor.
     * 
     * @return identificacionProveedor
     */
    public uy.gub.agesic.empresa.ws.ACCE_RUPE.IdentificacionProveedor getIdentificacionProveedor() {
        return identificacionProveedor;
    }


    /**
     * Sets the identificacionProveedor value for this PersonaEnProveedor.
     * 
     * @param identificacionProveedor
     */
    public void setIdentificacionProveedor(uy.gub.agesic.empresa.ws.ACCE_RUPE.IdentificacionProveedor identificacionProveedor) {
        this.identificacionProveedor = identificacionProveedor;
    }


    /**
     * Gets the listaAtribuciones value for this PersonaEnProveedor.
     * 
     * @return listaAtribuciones
     */
    public uy.gub.agesic.empresa.ws.ACCE_RUPE.RolYAtribuciones[] getListaAtribuciones() {
        return listaAtribuciones;
    }


    /**
     * Sets the listaAtribuciones value for this PersonaEnProveedor.
     * 
     * @param listaAtribuciones
     */
    public void setListaAtribuciones(uy.gub.agesic.empresa.ws.ACCE_RUPE.RolYAtribuciones[] listaAtribuciones) {
        this.listaAtribuciones = listaAtribuciones;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PersonaEnProveedor)) return false;
        PersonaEnProveedor other = (PersonaEnProveedor) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.persona==null && other.getPersona()==null) || 
             (this.persona!=null &&
              this.persona.equals(other.getPersona()))) &&
            ((this.rolEnProveedor==null && other.getRolEnProveedor()==null) || 
             (this.rolEnProveedor!=null &&
              this.rolEnProveedor.equals(other.getRolEnProveedor()))) &&
            ((this.fechaDesde==null && other.getFechaDesde()==null) || 
             (this.fechaDesde!=null &&
              this.fechaDesde.equals(other.getFechaDesde()))) &&
            ((this.fechaHasta==null && other.getFechaHasta()==null) || 
             (this.fechaHasta!=null &&
              this.fechaHasta.equals(other.getFechaHasta()))) &&
            ((this.version==null && other.getVersion()==null) || 
             (this.version!=null &&
              this.version.equals(other.getVersion()))) &&
            ((this.fechaVersion==null && other.getFechaVersion()==null) || 
             (this.fechaVersion!=null &&
              this.fechaVersion.equals(other.getFechaVersion()))) &&
            ((this.idProveedor==null && other.getIdProveedor()==null) || 
             (this.idProveedor!=null &&
              this.idProveedor.equals(other.getIdProveedor()))) &&
            ((this.identificacionProveedor==null && other.getIdentificacionProveedor()==null) || 
             (this.identificacionProveedor!=null &&
              this.identificacionProveedor.equals(other.getIdentificacionProveedor()))) &&
            ((this.listaAtribuciones==null && other.getListaAtribuciones()==null) || 
             (this.listaAtribuciones!=null &&
              java.util.Arrays.equals(this.listaAtribuciones, other.getListaAtribuciones())));
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
        if (getPersona() != null) {
            _hashCode += getPersona().hashCode();
        }
        if (getRolEnProveedor() != null) {
            _hashCode += getRolEnProveedor().hashCode();
        }
        if (getFechaDesde() != null) {
            _hashCode += getFechaDesde().hashCode();
        }
        if (getFechaHasta() != null) {
            _hashCode += getFechaHasta().hashCode();
        }
        if (getVersion() != null) {
            _hashCode += getVersion().hashCode();
        }
        if (getFechaVersion() != null) {
            _hashCode += getFechaVersion().hashCode();
        }
        if (getIdProveedor() != null) {
            _hashCode += getIdProveedor().hashCode();
        }
        if (getIdentificacionProveedor() != null) {
            _hashCode += getIdentificacionProveedor().hashCode();
        }
        if (getListaAtribuciones() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListaAtribuciones());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListaAtribuciones(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PersonaEnProveedor.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "personaEnProveedor"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("persona");
        elemField.setXmlName(new javax.xml.namespace.QName("", "persona"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "persona"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rolEnProveedor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rolEnProveedor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaDesde");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fechaDesde"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaHasta");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fechaHasta"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idProveedor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idProveedor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identificacionProveedor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "identificacionProveedor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "identificacionProveedor"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listaAtribuciones");
        elemField.setXmlName(new javax.xml.namespace.QName("", "listaAtribuciones"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "rolYAtribuciones"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "listaAtribuciones"));
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
