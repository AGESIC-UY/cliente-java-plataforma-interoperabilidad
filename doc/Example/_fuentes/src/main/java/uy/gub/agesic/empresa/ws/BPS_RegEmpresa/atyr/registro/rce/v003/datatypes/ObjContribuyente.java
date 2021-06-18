/**
 * ObjContribuyente.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v003.datatypes;

public class ObjContribuyente  implements java.io.Serializable {
    private java.lang.String claveContribuyente;

    private java.lang.String codEstadoAnulado;

    private uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v003.datatypes.ObjDenominacionPeriodo denominacion;

    private java.util.Date fechaInicioActividad;

    private java.lang.String nroContribuyente;

    private java.lang.Integer nroIntContr;

    public ObjContribuyente() {
    }

    public ObjContribuyente(
           java.lang.String claveContribuyente,
           java.lang.String codEstadoAnulado,
           uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v003.datatypes.ObjDenominacionPeriodo denominacion,
           java.util.Date fechaInicioActividad,
           java.lang.String nroContribuyente,
           java.lang.Integer nroIntContr) {
           this.claveContribuyente = claveContribuyente;
           this.codEstadoAnulado = codEstadoAnulado;
           this.denominacion = denominacion;
           this.fechaInicioActividad = fechaInicioActividad;
           this.nroContribuyente = nroContribuyente;
           this.nroIntContr = nroIntContr;
    }


    /**
     * Gets the claveContribuyente value for this ObjContribuyente.
     * 
     * @return claveContribuyente
     */
    public java.lang.String getClaveContribuyente() {
        return claveContribuyente;
    }


    /**
     * Sets the claveContribuyente value for this ObjContribuyente.
     * 
     * @param claveContribuyente
     */
    public void setClaveContribuyente(java.lang.String claveContribuyente) {
        this.claveContribuyente = claveContribuyente;
    }


    /**
     * Gets the codEstadoAnulado value for this ObjContribuyente.
     * 
     * @return codEstadoAnulado
     */
    public java.lang.String getCodEstadoAnulado() {
        return codEstadoAnulado;
    }


    /**
     * Sets the codEstadoAnulado value for this ObjContribuyente.
     * 
     * @param codEstadoAnulado
     */
    public void setCodEstadoAnulado(java.lang.String codEstadoAnulado) {
        this.codEstadoAnulado = codEstadoAnulado;
    }


    /**
     * Gets the denominacion value for this ObjContribuyente.
     * 
     * @return denominacion
     */
    public uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v003.datatypes.ObjDenominacionPeriodo getDenominacion() {
        return denominacion;
    }


    /**
     * Sets the denominacion value for this ObjContribuyente.
     * 
     * @param denominacion
     */
    public void setDenominacion(uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v003.datatypes.ObjDenominacionPeriodo denominacion) {
        this.denominacion = denominacion;
    }


    /**
     * Gets the fechaInicioActividad value for this ObjContribuyente.
     * 
     * @return fechaInicioActividad
     */
    public java.util.Date getFechaInicioActividad() {
        return fechaInicioActividad;
    }


    /**
     * Sets the fechaInicioActividad value for this ObjContribuyente.
     * 
     * @param fechaInicioActividad
     */
    public void setFechaInicioActividad(java.util.Date fechaInicioActividad) {
        this.fechaInicioActividad = fechaInicioActividad;
    }


    /**
     * Gets the nroContribuyente value for this ObjContribuyente.
     * 
     * @return nroContribuyente
     */
    public java.lang.String getNroContribuyente() {
        return nroContribuyente;
    }


    /**
     * Sets the nroContribuyente value for this ObjContribuyente.
     * 
     * @param nroContribuyente
     */
    public void setNroContribuyente(java.lang.String nroContribuyente) {
        this.nroContribuyente = nroContribuyente;
    }


    /**
     * Gets the nroIntContr value for this ObjContribuyente.
     * 
     * @return nroIntContr
     */
    public java.lang.Integer getNroIntContr() {
        return nroIntContr;
    }


    /**
     * Sets the nroIntContr value for this ObjContribuyente.
     * 
     * @param nroIntContr
     */
    public void setNroIntContr(java.lang.Integer nroIntContr) {
        this.nroIntContr = nroIntContr;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ObjContribuyente)) return false;
        ObjContribuyente other = (ObjContribuyente) obj;
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
            ((this.codEstadoAnulado==null && other.getCodEstadoAnulado()==null) || 
             (this.codEstadoAnulado!=null &&
              this.codEstadoAnulado.equals(other.getCodEstadoAnulado()))) &&
            ((this.denominacion==null && other.getDenominacion()==null) || 
             (this.denominacion!=null &&
              this.denominacion.equals(other.getDenominacion()))) &&
            ((this.fechaInicioActividad==null && other.getFechaInicioActividad()==null) || 
             (this.fechaInicioActividad!=null &&
              this.fechaInicioActividad.equals(other.getFechaInicioActividad()))) &&
            ((this.nroContribuyente==null && other.getNroContribuyente()==null) || 
             (this.nroContribuyente!=null &&
              this.nroContribuyente.equals(other.getNroContribuyente()))) &&
            ((this.nroIntContr==null && other.getNroIntContr()==null) || 
             (this.nroIntContr!=null &&
              this.nroIntContr.equals(other.getNroIntContr())));
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
        if (getCodEstadoAnulado() != null) {
            _hashCode += getCodEstadoAnulado().hashCode();
        }
        if (getDenominacion() != null) {
            _hashCode += getDenominacion().hashCode();
        }
        if (getFechaInicioActividad() != null) {
            _hashCode += getFechaInicioActividad().hashCode();
        }
        if (getNroContribuyente() != null) {
            _hashCode += getNroContribuyente().hashCode();
        }
        if (getNroIntContr() != null) {
            _hashCode += getNroIntContr().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ObjContribuyente.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/rce/v003/datatypes", "ObjContribuyente"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("claveContribuyente");
        elemField.setXmlName(new javax.xml.namespace.QName("", "claveContribuyente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codEstadoAnulado");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codEstadoAnulado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("denominacion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "denominacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/rce/v003/datatypes", "ObjDenominacionPeriodo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaInicioActividad");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fechaInicioActividad"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nroContribuyente");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nroContribuyente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nroIntContr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nroIntContr"));
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
