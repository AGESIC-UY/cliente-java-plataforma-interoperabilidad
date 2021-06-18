/**
 * ParamObtenerLocales.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v001.datatypes;

public class ParamObtenerLocales  implements java.io.Serializable {
    private java.util.Date fechaDesde;

    private java.util.Date fechaHasta;

    private java.lang.String nroEmpresa;

    private java.lang.Integer nroIntEmp;

    private java.lang.Integer nroLocal;

    public ParamObtenerLocales() {
    }

    public ParamObtenerLocales(
           java.util.Date fechaDesde,
           java.util.Date fechaHasta,
           java.lang.String nroEmpresa,
           java.lang.Integer nroIntEmp,
           java.lang.Integer nroLocal) {
           this.fechaDesde = fechaDesde;
           this.fechaHasta = fechaHasta;
           this.nroEmpresa = nroEmpresa;
           this.nroIntEmp = nroIntEmp;
           this.nroLocal = nroLocal;
    }


    /**
     * Gets the fechaDesde value for this ParamObtenerLocales.
     * 
     * @return fechaDesde
     */
    public java.util.Date getFechaDesde() {
        return fechaDesde;
    }


    /**
     * Sets the fechaDesde value for this ParamObtenerLocales.
     * 
     * @param fechaDesde
     */
    public void setFechaDesde(java.util.Date fechaDesde) {
        this.fechaDesde = fechaDesde;
    }


    /**
     * Gets the fechaHasta value for this ParamObtenerLocales.
     * 
     * @return fechaHasta
     */
    public java.util.Date getFechaHasta() {
        return fechaHasta;
    }


    /**
     * Sets the fechaHasta value for this ParamObtenerLocales.
     * 
     * @param fechaHasta
     */
    public void setFechaHasta(java.util.Date fechaHasta) {
        this.fechaHasta = fechaHasta;
    }


    /**
     * Gets the nroEmpresa value for this ParamObtenerLocales.
     * 
     * @return nroEmpresa
     */
    public java.lang.String getNroEmpresa() {
        return nroEmpresa;
    }


    /**
     * Sets the nroEmpresa value for this ParamObtenerLocales.
     * 
     * @param nroEmpresa
     */
    public void setNroEmpresa(java.lang.String nroEmpresa) {
        this.nroEmpresa = nroEmpresa;
    }


    /**
     * Gets the nroIntEmp value for this ParamObtenerLocales.
     * 
     * @return nroIntEmp
     */
    public java.lang.Integer getNroIntEmp() {
        return nroIntEmp;
    }


    /**
     * Sets the nroIntEmp value for this ParamObtenerLocales.
     * 
     * @param nroIntEmp
     */
    public void setNroIntEmp(java.lang.Integer nroIntEmp) {
        this.nroIntEmp = nroIntEmp;
    }


    /**
     * Gets the nroLocal value for this ParamObtenerLocales.
     * 
     * @return nroLocal
     */
    public java.lang.Integer getNroLocal() {
        return nroLocal;
    }


    /**
     * Sets the nroLocal value for this ParamObtenerLocales.
     * 
     * @param nroLocal
     */
    public void setNroLocal(java.lang.Integer nroLocal) {
        this.nroLocal = nroLocal;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ParamObtenerLocales)) return false;
        ParamObtenerLocales other = (ParamObtenerLocales) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fechaDesde==null && other.getFechaDesde()==null) || 
             (this.fechaDesde!=null &&
              this.fechaDesde.equals(other.getFechaDesde()))) &&
            ((this.fechaHasta==null && other.getFechaHasta()==null) || 
             (this.fechaHasta!=null &&
              this.fechaHasta.equals(other.getFechaHasta()))) &&
            ((this.nroEmpresa==null && other.getNroEmpresa()==null) || 
             (this.nroEmpresa!=null &&
              this.nroEmpresa.equals(other.getNroEmpresa()))) &&
            ((this.nroIntEmp==null && other.getNroIntEmp()==null) || 
             (this.nroIntEmp!=null &&
              this.nroIntEmp.equals(other.getNroIntEmp()))) &&
            ((this.nroLocal==null && other.getNroLocal()==null) || 
             (this.nroLocal!=null &&
              this.nroLocal.equals(other.getNroLocal())));
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
        if (getFechaDesde() != null) {
            _hashCode += getFechaDesde().hashCode();
        }
        if (getFechaHasta() != null) {
            _hashCode += getFechaHasta().hashCode();
        }
        if (getNroEmpresa() != null) {
            _hashCode += getNroEmpresa().hashCode();
        }
        if (getNroIntEmp() != null) {
            _hashCode += getNroIntEmp().hashCode();
        }
        if (getNroLocal() != null) {
            _hashCode += getNroLocal().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ParamObtenerLocales.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/empresas/v001/datatypes", "ParamObtenerLocales"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("nroIntEmp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nroIntEmp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nroLocal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nroLocal"));
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
