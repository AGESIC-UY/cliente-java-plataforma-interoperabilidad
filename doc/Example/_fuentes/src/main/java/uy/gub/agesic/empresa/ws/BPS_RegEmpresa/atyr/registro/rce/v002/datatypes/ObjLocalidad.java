/**
 * ObjLocalidad.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v002.datatypes;

public class ObjLocalidad  implements java.io.Serializable {
    private java.lang.Integer codLocalidad;

    private uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v002.datatypes.ObjDepartamento departamento;

    private java.lang.String nombreLocalidad;

    private java.lang.String vigente;

    public ObjLocalidad() {
    }

    public ObjLocalidad(
           java.lang.Integer codLocalidad,
           uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v002.datatypes.ObjDepartamento departamento,
           java.lang.String nombreLocalidad,
           java.lang.String vigente) {
           this.codLocalidad = codLocalidad;
           this.departamento = departamento;
           this.nombreLocalidad = nombreLocalidad;
           this.vigente = vigente;
    }


    /**
     * Gets the codLocalidad value for this ObjLocalidad.
     * 
     * @return codLocalidad
     */
    public java.lang.Integer getCodLocalidad() {
        return codLocalidad;
    }


    /**
     * Sets the codLocalidad value for this ObjLocalidad.
     * 
     * @param codLocalidad
     */
    public void setCodLocalidad(java.lang.Integer codLocalidad) {
        this.codLocalidad = codLocalidad;
    }


    /**
     * Gets the departamento value for this ObjLocalidad.
     * 
     * @return departamento
     */
    public uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v002.datatypes.ObjDepartamento getDepartamento() {
        return departamento;
    }


    /**
     * Sets the departamento value for this ObjLocalidad.
     * 
     * @param departamento
     */
    public void setDepartamento(uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v002.datatypes.ObjDepartamento departamento) {
        this.departamento = departamento;
    }


    /**
     * Gets the nombreLocalidad value for this ObjLocalidad.
     * 
     * @return nombreLocalidad
     */
    public java.lang.String getNombreLocalidad() {
        return nombreLocalidad;
    }


    /**
     * Sets the nombreLocalidad value for this ObjLocalidad.
     * 
     * @param nombreLocalidad
     */
    public void setNombreLocalidad(java.lang.String nombreLocalidad) {
        this.nombreLocalidad = nombreLocalidad;
    }


    /**
     * Gets the vigente value for this ObjLocalidad.
     * 
     * @return vigente
     */
    public java.lang.String getVigente() {
        return vigente;
    }


    /**
     * Sets the vigente value for this ObjLocalidad.
     * 
     * @param vigente
     */
    public void setVigente(java.lang.String vigente) {
        this.vigente = vigente;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ObjLocalidad)) return false;
        ObjLocalidad other = (ObjLocalidad) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codLocalidad==null && other.getCodLocalidad()==null) || 
             (this.codLocalidad!=null &&
              this.codLocalidad.equals(other.getCodLocalidad()))) &&
            ((this.departamento==null && other.getDepartamento()==null) || 
             (this.departamento!=null &&
              this.departamento.equals(other.getDepartamento()))) &&
            ((this.nombreLocalidad==null && other.getNombreLocalidad()==null) || 
             (this.nombreLocalidad!=null &&
              this.nombreLocalidad.equals(other.getNombreLocalidad()))) &&
            ((this.vigente==null && other.getVigente()==null) || 
             (this.vigente!=null &&
              this.vigente.equals(other.getVigente())));
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
        if (getCodLocalidad() != null) {
            _hashCode += getCodLocalidad().hashCode();
        }
        if (getDepartamento() != null) {
            _hashCode += getDepartamento().hashCode();
        }
        if (getNombreLocalidad() != null) {
            _hashCode += getNombreLocalidad().hashCode();
        }
        if (getVigente() != null) {
            _hashCode += getVigente().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ObjLocalidad.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/rce/v002/datatypes", "ObjLocalidad"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codLocalidad");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codLocalidad"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("departamento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "departamento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/rce/v002/datatypes", "ObjDepartamento"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombreLocalidad");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nombreLocalidad"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vigente");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vigente"));
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
