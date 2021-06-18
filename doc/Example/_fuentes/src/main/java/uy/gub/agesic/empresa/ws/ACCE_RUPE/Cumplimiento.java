/**
 * Cumplimiento.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uy.gub.agesic.empresa.ws.ACCE_RUPE;

public class Cumplimiento  implements java.io.Serializable {
    private java.lang.Integer idCumplimiento;

    private java.util.Calendar fechaCumplimiento;

    private java.lang.String numeroCompra;

    private java.lang.String codigoInciso;

    private java.lang.String codigoUnidadEjecutora;

    private java.lang.String cumpTipoProcedimiento;

    private java.lang.Integer cumpAnioCompra;

    private java.lang.Boolean cumplio;

    private java.lang.Integer ampliacion;

    public Cumplimiento() {
    }

    public Cumplimiento(
           java.lang.Integer idCumplimiento,
           java.util.Calendar fechaCumplimiento,
           java.lang.String numeroCompra,
           java.lang.String codigoInciso,
           java.lang.String codigoUnidadEjecutora,
           java.lang.String cumpTipoProcedimiento,
           java.lang.Integer cumpAnioCompra,
           java.lang.Boolean cumplio,
           java.lang.Integer ampliacion) {
           this.idCumplimiento = idCumplimiento;
           this.fechaCumplimiento = fechaCumplimiento;
           this.numeroCompra = numeroCompra;
           this.codigoInciso = codigoInciso;
           this.codigoUnidadEjecutora = codigoUnidadEjecutora;
           this.cumpTipoProcedimiento = cumpTipoProcedimiento;
           this.cumpAnioCompra = cumpAnioCompra;
           this.cumplio = cumplio;
           this.ampliacion = ampliacion;
    }


    /**
     * Gets the idCumplimiento value for this Cumplimiento.
     * 
     * @return idCumplimiento
     */
    public java.lang.Integer getIdCumplimiento() {
        return idCumplimiento;
    }


    /**
     * Sets the idCumplimiento value for this Cumplimiento.
     * 
     * @param idCumplimiento
     */
    public void setIdCumplimiento(java.lang.Integer idCumplimiento) {
        this.idCumplimiento = idCumplimiento;
    }


    /**
     * Gets the fechaCumplimiento value for this Cumplimiento.
     * 
     * @return fechaCumplimiento
     */
    public java.util.Calendar getFechaCumplimiento() {
        return fechaCumplimiento;
    }


    /**
     * Sets the fechaCumplimiento value for this Cumplimiento.
     * 
     * @param fechaCumplimiento
     */
    public void setFechaCumplimiento(java.util.Calendar fechaCumplimiento) {
        this.fechaCumplimiento = fechaCumplimiento;
    }


    /**
     * Gets the numeroCompra value for this Cumplimiento.
     * 
     * @return numeroCompra
     */
    public java.lang.String getNumeroCompra() {
        return numeroCompra;
    }


    /**
     * Sets the numeroCompra value for this Cumplimiento.
     * 
     * @param numeroCompra
     */
    public void setNumeroCompra(java.lang.String numeroCompra) {
        this.numeroCompra = numeroCompra;
    }


    /**
     * Gets the codigoInciso value for this Cumplimiento.
     * 
     * @return codigoInciso
     */
    public java.lang.String getCodigoInciso() {
        return codigoInciso;
    }


    /**
     * Sets the codigoInciso value for this Cumplimiento.
     * 
     * @param codigoInciso
     */
    public void setCodigoInciso(java.lang.String codigoInciso) {
        this.codigoInciso = codigoInciso;
    }


    /**
     * Gets the codigoUnidadEjecutora value for this Cumplimiento.
     * 
     * @return codigoUnidadEjecutora
     */
    public java.lang.String getCodigoUnidadEjecutora() {
        return codigoUnidadEjecutora;
    }


    /**
     * Sets the codigoUnidadEjecutora value for this Cumplimiento.
     * 
     * @param codigoUnidadEjecutora
     */
    public void setCodigoUnidadEjecutora(java.lang.String codigoUnidadEjecutora) {
        this.codigoUnidadEjecutora = codigoUnidadEjecutora;
    }


    /**
     * Gets the cumpTipoProcedimiento value for this Cumplimiento.
     * 
     * @return cumpTipoProcedimiento
     */
    public java.lang.String getCumpTipoProcedimiento() {
        return cumpTipoProcedimiento;
    }


    /**
     * Sets the cumpTipoProcedimiento value for this Cumplimiento.
     * 
     * @param cumpTipoProcedimiento
     */
    public void setCumpTipoProcedimiento(java.lang.String cumpTipoProcedimiento) {
        this.cumpTipoProcedimiento = cumpTipoProcedimiento;
    }


    /**
     * Gets the cumpAnioCompra value for this Cumplimiento.
     * 
     * @return cumpAnioCompra
     */
    public java.lang.Integer getCumpAnioCompra() {
        return cumpAnioCompra;
    }


    /**
     * Sets the cumpAnioCompra value for this Cumplimiento.
     * 
     * @param cumpAnioCompra
     */
    public void setCumpAnioCompra(java.lang.Integer cumpAnioCompra) {
        this.cumpAnioCompra = cumpAnioCompra;
    }


    /**
     * Gets the cumplio value for this Cumplimiento.
     * 
     * @return cumplio
     */
    public java.lang.Boolean getCumplio() {
        return cumplio;
    }


    /**
     * Sets the cumplio value for this Cumplimiento.
     * 
     * @param cumplio
     */
    public void setCumplio(java.lang.Boolean cumplio) {
        this.cumplio = cumplio;
    }


    /**
     * Gets the ampliacion value for this Cumplimiento.
     * 
     * @return ampliacion
     */
    public java.lang.Integer getAmpliacion() {
        return ampliacion;
    }


    /**
     * Sets the ampliacion value for this Cumplimiento.
     * 
     * @param ampliacion
     */
    public void setAmpliacion(java.lang.Integer ampliacion) {
        this.ampliacion = ampliacion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Cumplimiento)) return false;
        Cumplimiento other = (Cumplimiento) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.idCumplimiento==null && other.getIdCumplimiento()==null) || 
             (this.idCumplimiento!=null &&
              this.idCumplimiento.equals(other.getIdCumplimiento()))) &&
            ((this.fechaCumplimiento==null && other.getFechaCumplimiento()==null) || 
             (this.fechaCumplimiento!=null &&
              this.fechaCumplimiento.equals(other.getFechaCumplimiento()))) &&
            ((this.numeroCompra==null && other.getNumeroCompra()==null) || 
             (this.numeroCompra!=null &&
              this.numeroCompra.equals(other.getNumeroCompra()))) &&
            ((this.codigoInciso==null && other.getCodigoInciso()==null) || 
             (this.codigoInciso!=null &&
              this.codigoInciso.equals(other.getCodigoInciso()))) &&
            ((this.codigoUnidadEjecutora==null && other.getCodigoUnidadEjecutora()==null) || 
             (this.codigoUnidadEjecutora!=null &&
              this.codigoUnidadEjecutora.equals(other.getCodigoUnidadEjecutora()))) &&
            ((this.cumpTipoProcedimiento==null && other.getCumpTipoProcedimiento()==null) || 
             (this.cumpTipoProcedimiento!=null &&
              this.cumpTipoProcedimiento.equals(other.getCumpTipoProcedimiento()))) &&
            ((this.cumpAnioCompra==null && other.getCumpAnioCompra()==null) || 
             (this.cumpAnioCompra!=null &&
              this.cumpAnioCompra.equals(other.getCumpAnioCompra()))) &&
            ((this.cumplio==null && other.getCumplio()==null) || 
             (this.cumplio!=null &&
              this.cumplio.equals(other.getCumplio()))) &&
            ((this.ampliacion==null && other.getAmpliacion()==null) || 
             (this.ampliacion!=null &&
              this.ampliacion.equals(other.getAmpliacion())));
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
        if (getIdCumplimiento() != null) {
            _hashCode += getIdCumplimiento().hashCode();
        }
        if (getFechaCumplimiento() != null) {
            _hashCode += getFechaCumplimiento().hashCode();
        }
        if (getNumeroCompra() != null) {
            _hashCode += getNumeroCompra().hashCode();
        }
        if (getCodigoInciso() != null) {
            _hashCode += getCodigoInciso().hashCode();
        }
        if (getCodigoUnidadEjecutora() != null) {
            _hashCode += getCodigoUnidadEjecutora().hashCode();
        }
        if (getCumpTipoProcedimiento() != null) {
            _hashCode += getCumpTipoProcedimiento().hashCode();
        }
        if (getCumpAnioCompra() != null) {
            _hashCode += getCumpAnioCompra().hashCode();
        }
        if (getCumplio() != null) {
            _hashCode += getCumplio().hashCode();
        }
        if (getAmpliacion() != null) {
            _hashCode += getAmpliacion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Cumplimiento.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "cumplimiento"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idCumplimiento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idCumplimiento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaCumplimiento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fechaCumplimiento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroCompra");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numeroCompra"));
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
        elemField.setFieldName("cumpTipoProcedimiento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cumpTipoProcedimiento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cumpAnioCompra");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cumpAnioCompra"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cumplio");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cumplio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ampliacion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ampliacion"));
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
