/**
 * ObjEmpresa.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v003.datatypes;

public class ObjEmpresa  implements java.io.Serializable {
    private java.lang.String codEstadoAnulada;

    private uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v003.datatypes.ObjDenominacionPeriodo denominacion;

    private java.lang.Integer digitoControl;

    private java.util.Date fechaInicioActividad;

    private java.lang.String nroEmpresa;

    private java.lang.Integer nroIntEmp;

    public ObjEmpresa() {
    }

    public ObjEmpresa(
           java.lang.String codEstadoAnulada,
           uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v003.datatypes.ObjDenominacionPeriodo denominacion,
           java.lang.Integer digitoControl,
           java.util.Date fechaInicioActividad,
           java.lang.String nroEmpresa,
           java.lang.Integer nroIntEmp) {
           this.codEstadoAnulada = codEstadoAnulada;
           this.denominacion = denominacion;
           this.digitoControl = digitoControl;
           this.fechaInicioActividad = fechaInicioActividad;
           this.nroEmpresa = nroEmpresa;
           this.nroIntEmp = nroIntEmp;
    }


    /**
     * Gets the codEstadoAnulada value for this ObjEmpresa.
     * 
     * @return codEstadoAnulada
     */
    public java.lang.String getCodEstadoAnulada() {
        return codEstadoAnulada;
    }


    /**
     * Sets the codEstadoAnulada value for this ObjEmpresa.
     * 
     * @param codEstadoAnulada
     */
    public void setCodEstadoAnulada(java.lang.String codEstadoAnulada) {
        this.codEstadoAnulada = codEstadoAnulada;
    }


    /**
     * Gets the denominacion value for this ObjEmpresa.
     * 
     * @return denominacion
     */
    public uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v003.datatypes.ObjDenominacionPeriodo getDenominacion() {
        return denominacion;
    }


    /**
     * Sets the denominacion value for this ObjEmpresa.
     * 
     * @param denominacion
     */
    public void setDenominacion(uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v003.datatypes.ObjDenominacionPeriodo denominacion) {
        this.denominacion = denominacion;
    }


    /**
     * Gets the digitoControl value for this ObjEmpresa.
     * 
     * @return digitoControl
     */
    public java.lang.Integer getDigitoControl() {
        return digitoControl;
    }


    /**
     * Sets the digitoControl value for this ObjEmpresa.
     * 
     * @param digitoControl
     */
    public void setDigitoControl(java.lang.Integer digitoControl) {
        this.digitoControl = digitoControl;
    }


    /**
     * Gets the fechaInicioActividad value for this ObjEmpresa.
     * 
     * @return fechaInicioActividad
     */
    public java.util.Date getFechaInicioActividad() {
        return fechaInicioActividad;
    }


    /**
     * Sets the fechaInicioActividad value for this ObjEmpresa.
     * 
     * @param fechaInicioActividad
     */
    public void setFechaInicioActividad(java.util.Date fechaInicioActividad) {
        this.fechaInicioActividad = fechaInicioActividad;
    }


    /**
     * Gets the nroEmpresa value for this ObjEmpresa.
     * 
     * @return nroEmpresa
     */
    public java.lang.String getNroEmpresa() {
        return nroEmpresa;
    }


    /**
     * Sets the nroEmpresa value for this ObjEmpresa.
     * 
     * @param nroEmpresa
     */
    public void setNroEmpresa(java.lang.String nroEmpresa) {
        this.nroEmpresa = nroEmpresa;
    }


    /**
     * Gets the nroIntEmp value for this ObjEmpresa.
     * 
     * @return nroIntEmp
     */
    public java.lang.Integer getNroIntEmp() {
        return nroIntEmp;
    }


    /**
     * Sets the nroIntEmp value for this ObjEmpresa.
     * 
     * @param nroIntEmp
     */
    public void setNroIntEmp(java.lang.Integer nroIntEmp) {
        this.nroIntEmp = nroIntEmp;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ObjEmpresa)) return false;
        ObjEmpresa other = (ObjEmpresa) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codEstadoAnulada==null && other.getCodEstadoAnulada()==null) || 
             (this.codEstadoAnulada!=null &&
              this.codEstadoAnulada.equals(other.getCodEstadoAnulada()))) &&
            ((this.denominacion==null && other.getDenominacion()==null) || 
             (this.denominacion!=null &&
              this.denominacion.equals(other.getDenominacion()))) &&
            ((this.digitoControl==null && other.getDigitoControl()==null) || 
             (this.digitoControl!=null &&
              this.digitoControl.equals(other.getDigitoControl()))) &&
            ((this.fechaInicioActividad==null && other.getFechaInicioActividad()==null) || 
             (this.fechaInicioActividad!=null &&
              this.fechaInicioActividad.equals(other.getFechaInicioActividad()))) &&
            ((this.nroEmpresa==null && other.getNroEmpresa()==null) || 
             (this.nroEmpresa!=null &&
              this.nroEmpresa.equals(other.getNroEmpresa()))) &&
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
        if (getCodEstadoAnulada() != null) {
            _hashCode += getCodEstadoAnulada().hashCode();
        }
        if (getDenominacion() != null) {
            _hashCode += getDenominacion().hashCode();
        }
        if (getDigitoControl() != null) {
            _hashCode += getDigitoControl().hashCode();
        }
        if (getFechaInicioActividad() != null) {
            _hashCode += getFechaInicioActividad().hashCode();
        }
        if (getNroEmpresa() != null) {
            _hashCode += getNroEmpresa().hashCode();
        }
        if (getNroIntEmp() != null) {
            _hashCode += getNroIntEmp().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ObjEmpresa.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/rce/v003/datatypes", "ObjEmpresa"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codEstadoAnulada");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codEstadoAnulada"));
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
        elemField.setFieldName("digitoControl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "digitoControl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("nroEmpresa");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nroEmpresa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
