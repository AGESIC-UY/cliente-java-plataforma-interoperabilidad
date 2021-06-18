/**
 * ListaVencimientosVencimiento.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uy.gub.agesic.empresa.ws.ACCE_RUPE;

public class ListaVencimientosVencimiento  implements java.io.Serializable {
    private java.lang.Integer idVencimiento;

    private java.lang.String codigoOrganismo;

    private java.util.Calendar fechaVencimiento;

    private java.lang.Integer version;

    private java.util.Calendar fechaVersion;

    private java.lang.String notas;

    private java.lang.String codigoCertificado;

    private java.lang.String codigoClasificacion;

    private java.lang.String descripcionClasificacion;

    public ListaVencimientosVencimiento() {
    }

    public ListaVencimientosVencimiento(
           java.lang.Integer idVencimiento,
           java.lang.String codigoOrganismo,
           java.util.Calendar fechaVencimiento,
           java.lang.Integer version,
           java.util.Calendar fechaVersion,
           java.lang.String notas,
           java.lang.String codigoCertificado,
           java.lang.String codigoClasificacion,
           java.lang.String descripcionClasificacion) {
           this.idVencimiento = idVencimiento;
           this.codigoOrganismo = codigoOrganismo;
           this.fechaVencimiento = fechaVencimiento;
           this.version = version;
           this.fechaVersion = fechaVersion;
           this.notas = notas;
           this.codigoCertificado = codigoCertificado;
           this.codigoClasificacion = codigoClasificacion;
           this.descripcionClasificacion = descripcionClasificacion;
    }


    /**
     * Gets the idVencimiento value for this ListaVencimientosVencimiento.
     * 
     * @return idVencimiento
     */
    public java.lang.Integer getIdVencimiento() {
        return idVencimiento;
    }


    /**
     * Sets the idVencimiento value for this ListaVencimientosVencimiento.
     * 
     * @param idVencimiento
     */
    public void setIdVencimiento(java.lang.Integer idVencimiento) {
        this.idVencimiento = idVencimiento;
    }


    /**
     * Gets the codigoOrganismo value for this ListaVencimientosVencimiento.
     * 
     * @return codigoOrganismo
     */
    public java.lang.String getCodigoOrganismo() {
        return codigoOrganismo;
    }


    /**
     * Sets the codigoOrganismo value for this ListaVencimientosVencimiento.
     * 
     * @param codigoOrganismo
     */
    public void setCodigoOrganismo(java.lang.String codigoOrganismo) {
        this.codigoOrganismo = codigoOrganismo;
    }


    /**
     * Gets the fechaVencimiento value for this ListaVencimientosVencimiento.
     * 
     * @return fechaVencimiento
     */
    public java.util.Calendar getFechaVencimiento() {
        return fechaVencimiento;
    }


    /**
     * Sets the fechaVencimiento value for this ListaVencimientosVencimiento.
     * 
     * @param fechaVencimiento
     */
    public void setFechaVencimiento(java.util.Calendar fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }


    /**
     * Gets the version value for this ListaVencimientosVencimiento.
     * 
     * @return version
     */
    public java.lang.Integer getVersion() {
        return version;
    }


    /**
     * Sets the version value for this ListaVencimientosVencimiento.
     * 
     * @param version
     */
    public void setVersion(java.lang.Integer version) {
        this.version = version;
    }


    /**
     * Gets the fechaVersion value for this ListaVencimientosVencimiento.
     * 
     * @return fechaVersion
     */
    public java.util.Calendar getFechaVersion() {
        return fechaVersion;
    }


    /**
     * Sets the fechaVersion value for this ListaVencimientosVencimiento.
     * 
     * @param fechaVersion
     */
    public void setFechaVersion(java.util.Calendar fechaVersion) {
        this.fechaVersion = fechaVersion;
    }


    /**
     * Gets the notas value for this ListaVencimientosVencimiento.
     * 
     * @return notas
     */
    public java.lang.String getNotas() {
        return notas;
    }


    /**
     * Sets the notas value for this ListaVencimientosVencimiento.
     * 
     * @param notas
     */
    public void setNotas(java.lang.String notas) {
        this.notas = notas;
    }


    /**
     * Gets the codigoCertificado value for this ListaVencimientosVencimiento.
     * 
     * @return codigoCertificado
     */
    public java.lang.String getCodigoCertificado() {
        return codigoCertificado;
    }


    /**
     * Sets the codigoCertificado value for this ListaVencimientosVencimiento.
     * 
     * @param codigoCertificado
     */
    public void setCodigoCertificado(java.lang.String codigoCertificado) {
        this.codigoCertificado = codigoCertificado;
    }


    /**
     * Gets the codigoClasificacion value for this ListaVencimientosVencimiento.
     * 
     * @return codigoClasificacion
     */
    public java.lang.String getCodigoClasificacion() {
        return codigoClasificacion;
    }


    /**
     * Sets the codigoClasificacion value for this ListaVencimientosVencimiento.
     * 
     * @param codigoClasificacion
     */
    public void setCodigoClasificacion(java.lang.String codigoClasificacion) {
        this.codigoClasificacion = codigoClasificacion;
    }


    /**
     * Gets the descripcionClasificacion value for this ListaVencimientosVencimiento.
     * 
     * @return descripcionClasificacion
     */
    public java.lang.String getDescripcionClasificacion() {
        return descripcionClasificacion;
    }


    /**
     * Sets the descripcionClasificacion value for this ListaVencimientosVencimiento.
     * 
     * @param descripcionClasificacion
     */
    public void setDescripcionClasificacion(java.lang.String descripcionClasificacion) {
        this.descripcionClasificacion = descripcionClasificacion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ListaVencimientosVencimiento)) return false;
        ListaVencimientosVencimiento other = (ListaVencimientosVencimiento) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.idVencimiento==null && other.getIdVencimiento()==null) || 
             (this.idVencimiento!=null &&
              this.idVencimiento.equals(other.getIdVencimiento()))) &&
            ((this.codigoOrganismo==null && other.getCodigoOrganismo()==null) || 
             (this.codigoOrganismo!=null &&
              this.codigoOrganismo.equals(other.getCodigoOrganismo()))) &&
            ((this.fechaVencimiento==null && other.getFechaVencimiento()==null) || 
             (this.fechaVencimiento!=null &&
              this.fechaVencimiento.equals(other.getFechaVencimiento()))) &&
            ((this.version==null && other.getVersion()==null) || 
             (this.version!=null &&
              this.version.equals(other.getVersion()))) &&
            ((this.fechaVersion==null && other.getFechaVersion()==null) || 
             (this.fechaVersion!=null &&
              this.fechaVersion.equals(other.getFechaVersion()))) &&
            ((this.notas==null && other.getNotas()==null) || 
             (this.notas!=null &&
              this.notas.equals(other.getNotas()))) &&
            ((this.codigoCertificado==null && other.getCodigoCertificado()==null) || 
             (this.codigoCertificado!=null &&
              this.codigoCertificado.equals(other.getCodigoCertificado()))) &&
            ((this.codigoClasificacion==null && other.getCodigoClasificacion()==null) || 
             (this.codigoClasificacion!=null &&
              this.codigoClasificacion.equals(other.getCodigoClasificacion()))) &&
            ((this.descripcionClasificacion==null && other.getDescripcionClasificacion()==null) || 
             (this.descripcionClasificacion!=null &&
              this.descripcionClasificacion.equals(other.getDescripcionClasificacion())));
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
        if (getIdVencimiento() != null) {
            _hashCode += getIdVencimiento().hashCode();
        }
        if (getCodigoOrganismo() != null) {
            _hashCode += getCodigoOrganismo().hashCode();
        }
        if (getFechaVencimiento() != null) {
            _hashCode += getFechaVencimiento().hashCode();
        }
        if (getVersion() != null) {
            _hashCode += getVersion().hashCode();
        }
        if (getFechaVersion() != null) {
            _hashCode += getFechaVersion().hashCode();
        }
        if (getNotas() != null) {
            _hashCode += getNotas().hashCode();
        }
        if (getCodigoCertificado() != null) {
            _hashCode += getCodigoCertificado().hashCode();
        }
        if (getCodigoClasificacion() != null) {
            _hashCode += getCodigoClasificacion().hashCode();
        }
        if (getDescripcionClasificacion() != null) {
            _hashCode += getDescripcionClasificacion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ListaVencimientosVencimiento.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", ">listaVencimientos>vencimiento"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idVencimiento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idVencimiento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoOrganismo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoOrganismo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaVencimiento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fechaVencimiento"));
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
        elemField.setFieldName("notas");
        elemField.setXmlName(new javax.xml.namespace.QName("", "notas"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoCertificado");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoCertificado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoClasificacion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoClasificacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descripcionClasificacion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "descripcionClasificacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
