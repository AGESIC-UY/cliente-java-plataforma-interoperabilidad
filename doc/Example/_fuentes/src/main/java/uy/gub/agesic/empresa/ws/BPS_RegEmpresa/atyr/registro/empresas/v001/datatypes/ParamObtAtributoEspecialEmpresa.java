/**
 * ParamObtAtributoEspecialEmpresa.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v001.datatypes;

public class ParamObtAtributoEspecialEmpresa  implements java.io.Serializable {
    private java.lang.String claveContribuyente;

    private java.lang.Integer codAportacion;

    private java.lang.Integer[] codsAtributosEspeciales;

    private java.util.Date fechaDesde;

    private java.util.Date fechaHasta;

    private java.lang.String nroEmpresa;

    private java.lang.String nroExtContribuyente;

    private java.lang.Integer nroIntContribuyente;

    private java.lang.Integer nroIntEmp;

    public ParamObtAtributoEspecialEmpresa() {
    }

    public ParamObtAtributoEspecialEmpresa(
           java.lang.String claveContribuyente,
           java.lang.Integer codAportacion,
           java.lang.Integer[] codsAtributosEspeciales,
           java.util.Date fechaDesde,
           java.util.Date fechaHasta,
           java.lang.String nroEmpresa,
           java.lang.String nroExtContribuyente,
           java.lang.Integer nroIntContribuyente,
           java.lang.Integer nroIntEmp) {
           this.claveContribuyente = claveContribuyente;
           this.codAportacion = codAportacion;
           this.codsAtributosEspeciales = codsAtributosEspeciales;
           this.fechaDesde = fechaDesde;
           this.fechaHasta = fechaHasta;
           this.nroEmpresa = nroEmpresa;
           this.nroExtContribuyente = nroExtContribuyente;
           this.nroIntContribuyente = nroIntContribuyente;
           this.nroIntEmp = nroIntEmp;
    }


    /**
     * Gets the claveContribuyente value for this ParamObtAtributoEspecialEmpresa.
     * 
     * @return claveContribuyente
     */
    public java.lang.String getClaveContribuyente() {
        return claveContribuyente;
    }


    /**
     * Sets the claveContribuyente value for this ParamObtAtributoEspecialEmpresa.
     * 
     * @param claveContribuyente
     */
    public void setClaveContribuyente(java.lang.String claveContribuyente) {
        this.claveContribuyente = claveContribuyente;
    }


    /**
     * Gets the codAportacion value for this ParamObtAtributoEspecialEmpresa.
     * 
     * @return codAportacion
     */
    public java.lang.Integer getCodAportacion() {
        return codAportacion;
    }


    /**
     * Sets the codAportacion value for this ParamObtAtributoEspecialEmpresa.
     * 
     * @param codAportacion
     */
    public void setCodAportacion(java.lang.Integer codAportacion) {
        this.codAportacion = codAportacion;
    }


    /**
     * Gets the codsAtributosEspeciales value for this ParamObtAtributoEspecialEmpresa.
     * 
     * @return codsAtributosEspeciales
     */
    public java.lang.Integer[] getCodsAtributosEspeciales() {
        return codsAtributosEspeciales;
    }


    /**
     * Sets the codsAtributosEspeciales value for this ParamObtAtributoEspecialEmpresa.
     * 
     * @param codsAtributosEspeciales
     */
    public void setCodsAtributosEspeciales(java.lang.Integer[] codsAtributosEspeciales) {
        this.codsAtributosEspeciales = codsAtributosEspeciales;
    }

    public java.lang.Integer getCodsAtributosEspeciales(int i) {
        return this.codsAtributosEspeciales[i];
    }

    public void setCodsAtributosEspeciales(int i, java.lang.Integer _value) {
        this.codsAtributosEspeciales[i] = _value;
    }


    /**
     * Gets the fechaDesde value for this ParamObtAtributoEspecialEmpresa.
     * 
     * @return fechaDesde
     */
    public java.util.Date getFechaDesde() {
        return fechaDesde;
    }


    /**
     * Sets the fechaDesde value for this ParamObtAtributoEspecialEmpresa.
     * 
     * @param fechaDesde
     */
    public void setFechaDesde(java.util.Date fechaDesde) {
        this.fechaDesde = fechaDesde;
    }


    /**
     * Gets the fechaHasta value for this ParamObtAtributoEspecialEmpresa.
     * 
     * @return fechaHasta
     */
    public java.util.Date getFechaHasta() {
        return fechaHasta;
    }


    /**
     * Sets the fechaHasta value for this ParamObtAtributoEspecialEmpresa.
     * 
     * @param fechaHasta
     */
    public void setFechaHasta(java.util.Date fechaHasta) {
        this.fechaHasta = fechaHasta;
    }


    /**
     * Gets the nroEmpresa value for this ParamObtAtributoEspecialEmpresa.
     * 
     * @return nroEmpresa
     */
    public java.lang.String getNroEmpresa() {
        return nroEmpresa;
    }


    /**
     * Sets the nroEmpresa value for this ParamObtAtributoEspecialEmpresa.
     * 
     * @param nroEmpresa
     */
    public void setNroEmpresa(java.lang.String nroEmpresa) {
        this.nroEmpresa = nroEmpresa;
    }


    /**
     * Gets the nroExtContribuyente value for this ParamObtAtributoEspecialEmpresa.
     * 
     * @return nroExtContribuyente
     */
    public java.lang.String getNroExtContribuyente() {
        return nroExtContribuyente;
    }


    /**
     * Sets the nroExtContribuyente value for this ParamObtAtributoEspecialEmpresa.
     * 
     * @param nroExtContribuyente
     */
    public void setNroExtContribuyente(java.lang.String nroExtContribuyente) {
        this.nroExtContribuyente = nroExtContribuyente;
    }


    /**
     * Gets the nroIntContribuyente value for this ParamObtAtributoEspecialEmpresa.
     * 
     * @return nroIntContribuyente
     */
    public java.lang.Integer getNroIntContribuyente() {
        return nroIntContribuyente;
    }


    /**
     * Sets the nroIntContribuyente value for this ParamObtAtributoEspecialEmpresa.
     * 
     * @param nroIntContribuyente
     */
    public void setNroIntContribuyente(java.lang.Integer nroIntContribuyente) {
        this.nroIntContribuyente = nroIntContribuyente;
    }


    /**
     * Gets the nroIntEmp value for this ParamObtAtributoEspecialEmpresa.
     * 
     * @return nroIntEmp
     */
    public java.lang.Integer getNroIntEmp() {
        return nroIntEmp;
    }


    /**
     * Sets the nroIntEmp value for this ParamObtAtributoEspecialEmpresa.
     * 
     * @param nroIntEmp
     */
    public void setNroIntEmp(java.lang.Integer nroIntEmp) {
        this.nroIntEmp = nroIntEmp;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ParamObtAtributoEspecialEmpresa)) return false;
        ParamObtAtributoEspecialEmpresa other = (ParamObtAtributoEspecialEmpresa) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.claveContribuyente==null && other.getClaveContribuyente()==null) || 
             (this.claveContribuyente!=null &&
              this.claveContribuyente.equals(other.getClaveContribuyente()))) &&
            ((this.codAportacion==null && other.getCodAportacion()==null) || 
             (this.codAportacion!=null &&
              this.codAportacion.equals(other.getCodAportacion()))) &&
            ((this.codsAtributosEspeciales==null && other.getCodsAtributosEspeciales()==null) || 
             (this.codsAtributosEspeciales!=null &&
              java.util.Arrays.equals(this.codsAtributosEspeciales, other.getCodsAtributosEspeciales()))) &&
            ((this.fechaDesde==null && other.getFechaDesde()==null) || 
             (this.fechaDesde!=null &&
              this.fechaDesde.equals(other.getFechaDesde()))) &&
            ((this.fechaHasta==null && other.getFechaHasta()==null) || 
             (this.fechaHasta!=null &&
              this.fechaHasta.equals(other.getFechaHasta()))) &&
            ((this.nroEmpresa==null && other.getNroEmpresa()==null) || 
             (this.nroEmpresa!=null &&
              this.nroEmpresa.equals(other.getNroEmpresa()))) &&
            ((this.nroExtContribuyente==null && other.getNroExtContribuyente()==null) || 
             (this.nroExtContribuyente!=null &&
              this.nroExtContribuyente.equals(other.getNroExtContribuyente()))) &&
            ((this.nroIntContribuyente==null && other.getNroIntContribuyente()==null) || 
             (this.nroIntContribuyente!=null &&
              this.nroIntContribuyente.equals(other.getNroIntContribuyente()))) &&
            ((this.nroIntEmp==null && other.getNroIntEmp()==null) || 
             (this.nroIntEmp!=null &&
              this.nroIntEmp.equals(other.getNroIntEmp())));
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
        if (getClaveContribuyente() != null) {
            _hashCode += getClaveContribuyente().hashCode();
        }
        if (getCodAportacion() != null) {
            _hashCode += getCodAportacion().hashCode();
        }
        if (getCodsAtributosEspeciales() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCodsAtributosEspeciales());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCodsAtributosEspeciales(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFechaDesde() != null) {
            _hashCode += getFechaDesde().hashCode();
        }
        if (getFechaHasta() != null) {
            _hashCode += getFechaHasta().hashCode();
        }
        if (getNroEmpresa() != null) {
            _hashCode += getNroEmpresa().hashCode();
        }
        if (getNroExtContribuyente() != null) {
            _hashCode += getNroExtContribuyente().hashCode();
        }
        if (getNroIntContribuyente() != null) {
            _hashCode += getNroIntContribuyente().hashCode();
        }
        if (getNroIntEmp() != null) {
            _hashCode += getNroIntEmp().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ParamObtAtributoEspecialEmpresa.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/empresas/v001/datatypes", "paramObtAtributoEspecialEmpresa"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("claveContribuyente");
        elemField.setXmlName(new javax.xml.namespace.QName("", "claveContribuyente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codAportacion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codAportacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codsAtributosEspeciales");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codsAtributosEspeciales"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaDesde");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fechaDesde"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaHasta");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fechaHasta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nroEmpresa");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nroEmpresa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nroExtContribuyente");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nroExtContribuyente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nroIntContribuyente");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nroIntContribuyente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nroIntEmp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nroIntEmp"));
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
