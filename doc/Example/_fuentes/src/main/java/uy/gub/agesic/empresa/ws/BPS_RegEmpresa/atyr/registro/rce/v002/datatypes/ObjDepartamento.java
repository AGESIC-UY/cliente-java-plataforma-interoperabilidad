/**
 * ObjDepartamento.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v002.datatypes;

public class ObjDepartamento  implements java.io.Serializable {
    private java.lang.Integer codDepartamento;

    private java.lang.String nombreDepartamento;

    private java.lang.String vigente;

    public ObjDepartamento() {
    }

    public ObjDepartamento(
           java.lang.Integer codDepartamento,
           java.lang.String nombreDepartamento,
           java.lang.String vigente) {
           this.codDepartamento = codDepartamento;
           this.nombreDepartamento = nombreDepartamento;
           this.vigente = vigente;
    }


    /**
     * Gets the codDepartamento value for this ObjDepartamento.
     * 
     * @return codDepartamento
     */
    public java.lang.Integer getCodDepartamento() {
        return codDepartamento;
    }


    /**
     * Sets the codDepartamento value for this ObjDepartamento.
     * 
     * @param codDepartamento
     */
    public void setCodDepartamento(java.lang.Integer codDepartamento) {
        this.codDepartamento = codDepartamento;
    }


    /**
     * Gets the nombreDepartamento value for this ObjDepartamento.
     * 
     * @return nombreDepartamento
     */
    public java.lang.String getNombreDepartamento() {
        return nombreDepartamento;
    }


    /**
     * Sets the nombreDepartamento value for this ObjDepartamento.
     * 
     * @param nombreDepartamento
     */
    public void setNombreDepartamento(java.lang.String nombreDepartamento) {
        this.nombreDepartamento = nombreDepartamento;
    }


    /**
     * Gets the vigente value for this ObjDepartamento.
     * 
     * @return vigente
     */
    public java.lang.String getVigente() {
        return vigente;
    }


    /**
     * Sets the vigente value for this ObjDepartamento.
     * 
     * @param vigente
     */
    public void setVigente(java.lang.String vigente) {
        this.vigente = vigente;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ObjDepartamento)) return false;
        ObjDepartamento other = (ObjDepartamento) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codDepartamento==null && other.getCodDepartamento()==null) || 
             (this.codDepartamento!=null &&
              this.codDepartamento.equals(other.getCodDepartamento()))) &&
            ((this.nombreDepartamento==null && other.getNombreDepartamento()==null) || 
             (this.nombreDepartamento!=null &&
              this.nombreDepartamento.equals(other.getNombreDepartamento()))) &&
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
        if (getCodDepartamento() != null) {
            _hashCode += getCodDepartamento().hashCode();
        }
        if (getNombreDepartamento() != null) {
            _hashCode += getNombreDepartamento().hashCode();
        }
        if (getVigente() != null) {
            _hashCode += getVigente().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ObjDepartamento.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/rce/v002/datatypes", "ObjDepartamento"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codDepartamento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codDepartamento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombreDepartamento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nombreDepartamento"));
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
