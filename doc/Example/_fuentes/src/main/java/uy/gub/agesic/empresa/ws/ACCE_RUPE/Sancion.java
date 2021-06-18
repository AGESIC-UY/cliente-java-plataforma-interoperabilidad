/**
 * Sancion.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uy.gub.agesic.empresa.ws.ACCE_RUPE;

public class Sancion  implements java.io.Serializable {
    private java.lang.Integer idSancion;

    private java.lang.String tipoSancion;

    private java.lang.String nroResolucion;

    private java.util.Calendar fechaHecho;

    private java.util.Calendar vigenciaDesde;

    private java.util.Calendar vigenciaHasta;

    private java.lang.String codigoInciso;

    private java.lang.String codigoUnidadEjecutora;

    private byte[] documento;

    private java.lang.String comentarios;

    private java.lang.Integer version;

    private java.util.Calendar fechaVersion;

    private java.lang.Boolean eliminada;

    private java.lang.Boolean revocada;

    private uy.gub.agesic.empresa.ws.ACCE_RUPE.IdDocumento[] listaIdDocumentos;

    private java.util.Calendar fechaRevocacion;

    public Sancion() {
    }

    public Sancion(
           java.lang.Integer idSancion,
           java.lang.String tipoSancion,
           java.lang.String nroResolucion,
           java.util.Calendar fechaHecho,
           java.util.Calendar vigenciaDesde,
           java.util.Calendar vigenciaHasta,
           java.lang.String codigoInciso,
           java.lang.String codigoUnidadEjecutora,
           byte[] documento,
           java.lang.String comentarios,
           java.lang.Integer version,
           java.util.Calendar fechaVersion,
           java.lang.Boolean eliminada,
           java.lang.Boolean revocada,
           uy.gub.agesic.empresa.ws.ACCE_RUPE.IdDocumento[] listaIdDocumentos,
           java.util.Calendar fechaRevocacion) {
           this.idSancion = idSancion;
           this.tipoSancion = tipoSancion;
           this.nroResolucion = nroResolucion;
           this.fechaHecho = fechaHecho;
           this.vigenciaDesde = vigenciaDesde;
           this.vigenciaHasta = vigenciaHasta;
           this.codigoInciso = codigoInciso;
           this.codigoUnidadEjecutora = codigoUnidadEjecutora;
           this.documento = documento;
           this.comentarios = comentarios;
           this.version = version;
           this.fechaVersion = fechaVersion;
           this.eliminada = eliminada;
           this.revocada = revocada;
           this.listaIdDocumentos = listaIdDocumentos;
           this.fechaRevocacion = fechaRevocacion;
    }


    /**
     * Gets the idSancion value for this Sancion.
     * 
     * @return idSancion
     */
    public java.lang.Integer getIdSancion() {
        return idSancion;
    }


    /**
     * Sets the idSancion value for this Sancion.
     * 
     * @param idSancion
     */
    public void setIdSancion(java.lang.Integer idSancion) {
        this.idSancion = idSancion;
    }


    /**
     * Gets the tipoSancion value for this Sancion.
     * 
     * @return tipoSancion
     */
    public java.lang.String getTipoSancion() {
        return tipoSancion;
    }


    /**
     * Sets the tipoSancion value for this Sancion.
     * 
     * @param tipoSancion
     */
    public void setTipoSancion(java.lang.String tipoSancion) {
        this.tipoSancion = tipoSancion;
    }


    /**
     * Gets the nroResolucion value for this Sancion.
     * 
     * @return nroResolucion
     */
    public java.lang.String getNroResolucion() {
        return nroResolucion;
    }


    /**
     * Sets the nroResolucion value for this Sancion.
     * 
     * @param nroResolucion
     */
    public void setNroResolucion(java.lang.String nroResolucion) {
        this.nroResolucion = nroResolucion;
    }


    /**
     * Gets the fechaHecho value for this Sancion.
     * 
     * @return fechaHecho
     */
    public java.util.Calendar getFechaHecho() {
        return fechaHecho;
    }


    /**
     * Sets the fechaHecho value for this Sancion.
     * 
     * @param fechaHecho
     */
    public void setFechaHecho(java.util.Calendar fechaHecho) {
        this.fechaHecho = fechaHecho;
    }


    /**
     * Gets the vigenciaDesde value for this Sancion.
     * 
     * @return vigenciaDesde
     */
    public java.util.Calendar getVigenciaDesde() {
        return vigenciaDesde;
    }


    /**
     * Sets the vigenciaDesde value for this Sancion.
     * 
     * @param vigenciaDesde
     */
    public void setVigenciaDesde(java.util.Calendar vigenciaDesde) {
        this.vigenciaDesde = vigenciaDesde;
    }


    /**
     * Gets the vigenciaHasta value for this Sancion.
     * 
     * @return vigenciaHasta
     */
    public java.util.Calendar getVigenciaHasta() {
        return vigenciaHasta;
    }


    /**
     * Sets the vigenciaHasta value for this Sancion.
     * 
     * @param vigenciaHasta
     */
    public void setVigenciaHasta(java.util.Calendar vigenciaHasta) {
        this.vigenciaHasta = vigenciaHasta;
    }


    /**
     * Gets the codigoInciso value for this Sancion.
     * 
     * @return codigoInciso
     */
    public java.lang.String getCodigoInciso() {
        return codigoInciso;
    }


    /**
     * Sets the codigoInciso value for this Sancion.
     * 
     * @param codigoInciso
     */
    public void setCodigoInciso(java.lang.String codigoInciso) {
        this.codigoInciso = codigoInciso;
    }


    /**
     * Gets the codigoUnidadEjecutora value for this Sancion.
     * 
     * @return codigoUnidadEjecutora
     */
    public java.lang.String getCodigoUnidadEjecutora() {
        return codigoUnidadEjecutora;
    }


    /**
     * Sets the codigoUnidadEjecutora value for this Sancion.
     * 
     * @param codigoUnidadEjecutora
     */
    public void setCodigoUnidadEjecutora(java.lang.String codigoUnidadEjecutora) {
        this.codigoUnidadEjecutora = codigoUnidadEjecutora;
    }


    /**
     * Gets the documento value for this Sancion.
     * 
     * @return documento
     */
    public byte[] getDocumento() {
        return documento;
    }


    /**
     * Sets the documento value for this Sancion.
     * 
     * @param documento
     */
    public void setDocumento(byte[] documento) {
        this.documento = documento;
    }


    /**
     * Gets the comentarios value for this Sancion.
     * 
     * @return comentarios
     */
    public java.lang.String getComentarios() {
        return comentarios;
    }


    /**
     * Sets the comentarios value for this Sancion.
     * 
     * @param comentarios
     */
    public void setComentarios(java.lang.String comentarios) {
        this.comentarios = comentarios;
    }


    /**
     * Gets the version value for this Sancion.
     * 
     * @return version
     */
    public java.lang.Integer getVersion() {
        return version;
    }


    /**
     * Sets the version value for this Sancion.
     * 
     * @param version
     */
    public void setVersion(java.lang.Integer version) {
        this.version = version;
    }


    /**
     * Gets the fechaVersion value for this Sancion.
     * 
     * @return fechaVersion
     */
    public java.util.Calendar getFechaVersion() {
        return fechaVersion;
    }


    /**
     * Sets the fechaVersion value for this Sancion.
     * 
     * @param fechaVersion
     */
    public void setFechaVersion(java.util.Calendar fechaVersion) {
        this.fechaVersion = fechaVersion;
    }


    /**
     * Gets the eliminada value for this Sancion.
     * 
     * @return eliminada
     */
    public java.lang.Boolean getEliminada() {
        return eliminada;
    }


    /**
     * Sets the eliminada value for this Sancion.
     * 
     * @param eliminada
     */
    public void setEliminada(java.lang.Boolean eliminada) {
        this.eliminada = eliminada;
    }


    /**
     * Gets the revocada value for this Sancion.
     * 
     * @return revocada
     */
    public java.lang.Boolean getRevocada() {
        return revocada;
    }


    /**
     * Sets the revocada value for this Sancion.
     * 
     * @param revocada
     */
    public void setRevocada(java.lang.Boolean revocada) {
        this.revocada = revocada;
    }


    /**
     * Gets the listaIdDocumentos value for this Sancion.
     * 
     * @return listaIdDocumentos
     */
    public uy.gub.agesic.empresa.ws.ACCE_RUPE.IdDocumento[] getListaIdDocumentos() {
        return listaIdDocumentos;
    }


    /**
     * Sets the listaIdDocumentos value for this Sancion.
     * 
     * @param listaIdDocumentos
     */
    public void setListaIdDocumentos(uy.gub.agesic.empresa.ws.ACCE_RUPE.IdDocumento[] listaIdDocumentos) {
        this.listaIdDocumentos = listaIdDocumentos;
    }


    /**
     * Gets the fechaRevocacion value for this Sancion.
     * 
     * @return fechaRevocacion
     */
    public java.util.Calendar getFechaRevocacion() {
        return fechaRevocacion;
    }


    /**
     * Sets the fechaRevocacion value for this Sancion.
     * 
     * @param fechaRevocacion
     */
    public void setFechaRevocacion(java.util.Calendar fechaRevocacion) {
        this.fechaRevocacion = fechaRevocacion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Sancion)) return false;
        Sancion other = (Sancion) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.idSancion==null && other.getIdSancion()==null) || 
             (this.idSancion!=null &&
              this.idSancion.equals(other.getIdSancion()))) &&
            ((this.tipoSancion==null && other.getTipoSancion()==null) || 
             (this.tipoSancion!=null &&
              this.tipoSancion.equals(other.getTipoSancion()))) &&
            ((this.nroResolucion==null && other.getNroResolucion()==null) || 
             (this.nroResolucion!=null &&
              this.nroResolucion.equals(other.getNroResolucion()))) &&
            ((this.fechaHecho==null && other.getFechaHecho()==null) || 
             (this.fechaHecho!=null &&
              this.fechaHecho.equals(other.getFechaHecho()))) &&
            ((this.vigenciaDesde==null && other.getVigenciaDesde()==null) || 
             (this.vigenciaDesde!=null &&
              this.vigenciaDesde.equals(other.getVigenciaDesde()))) &&
            ((this.vigenciaHasta==null && other.getVigenciaHasta()==null) || 
             (this.vigenciaHasta!=null &&
              this.vigenciaHasta.equals(other.getVigenciaHasta()))) &&
            ((this.codigoInciso==null && other.getCodigoInciso()==null) || 
             (this.codigoInciso!=null &&
              this.codigoInciso.equals(other.getCodigoInciso()))) &&
            ((this.codigoUnidadEjecutora==null && other.getCodigoUnidadEjecutora()==null) || 
             (this.codigoUnidadEjecutora!=null &&
              this.codigoUnidadEjecutora.equals(other.getCodigoUnidadEjecutora()))) &&
            ((this.documento==null && other.getDocumento()==null) || 
             (this.documento!=null &&
              java.util.Arrays.equals(this.documento, other.getDocumento()))) &&
            ((this.comentarios==null && other.getComentarios()==null) || 
             (this.comentarios!=null &&
              this.comentarios.equals(other.getComentarios()))) &&
            ((this.version==null && other.getVersion()==null) || 
             (this.version!=null &&
              this.version.equals(other.getVersion()))) &&
            ((this.fechaVersion==null && other.getFechaVersion()==null) || 
             (this.fechaVersion!=null &&
              this.fechaVersion.equals(other.getFechaVersion()))) &&
            ((this.eliminada==null && other.getEliminada()==null) || 
             (this.eliminada!=null &&
              this.eliminada.equals(other.getEliminada()))) &&
            ((this.revocada==null && other.getRevocada()==null) || 
             (this.revocada!=null &&
              this.revocada.equals(other.getRevocada()))) &&
            ((this.listaIdDocumentos==null && other.getListaIdDocumentos()==null) || 
             (this.listaIdDocumentos!=null &&
              java.util.Arrays.equals(this.listaIdDocumentos, other.getListaIdDocumentos()))) &&
            ((this.fechaRevocacion==null && other.getFechaRevocacion()==null) || 
             (this.fechaRevocacion!=null &&
              this.fechaRevocacion.equals(other.getFechaRevocacion())));
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
        if (getIdSancion() != null) {
            _hashCode += getIdSancion().hashCode();
        }
        if (getTipoSancion() != null) {
            _hashCode += getTipoSancion().hashCode();
        }
        if (getNroResolucion() != null) {
            _hashCode += getNroResolucion().hashCode();
        }
        if (getFechaHecho() != null) {
            _hashCode += getFechaHecho().hashCode();
        }
        if (getVigenciaDesde() != null) {
            _hashCode += getVigenciaDesde().hashCode();
        }
        if (getVigenciaHasta() != null) {
            _hashCode += getVigenciaHasta().hashCode();
        }
        if (getCodigoInciso() != null) {
            _hashCode += getCodigoInciso().hashCode();
        }
        if (getCodigoUnidadEjecutora() != null) {
            _hashCode += getCodigoUnidadEjecutora().hashCode();
        }
        if (getDocumento() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDocumento());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDocumento(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getComentarios() != null) {
            _hashCode += getComentarios().hashCode();
        }
        if (getVersion() != null) {
            _hashCode += getVersion().hashCode();
        }
        if (getFechaVersion() != null) {
            _hashCode += getFechaVersion().hashCode();
        }
        if (getEliminada() != null) {
            _hashCode += getEliminada().hashCode();
        }
        if (getRevocada() != null) {
            _hashCode += getRevocada().hashCode();
        }
        if (getListaIdDocumentos() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListaIdDocumentos());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListaIdDocumentos(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFechaRevocacion() != null) {
            _hashCode += getFechaRevocacion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Sancion.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "sancion"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idSancion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idSancion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoSancion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipoSancion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nroResolucion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nroResolucion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaHecho");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fechaHecho"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
        elemField.setFieldName("documento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "documento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comentarios");
        elemField.setXmlName(new javax.xml.namespace.QName("", "comentarios"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eliminada");
        elemField.setXmlName(new javax.xml.namespace.QName("", "eliminada"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revocada");
        elemField.setXmlName(new javax.xml.namespace.QName("", "revocada"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listaIdDocumentos");
        elemField.setXmlName(new javax.xml.namespace.QName("", "listaIdDocumentos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "idDocumento"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "listaIdDocumento"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaRevocacion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fechaRevocacion"));
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
