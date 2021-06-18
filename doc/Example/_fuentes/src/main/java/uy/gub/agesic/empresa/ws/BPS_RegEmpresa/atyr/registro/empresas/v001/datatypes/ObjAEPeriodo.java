/**
 * ObjAEPeriodo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v001.datatypes;

public class ObjAEPeriodo  implements java.io.Serializable {
    private uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v001.datatypes.ObjAEEmp atributoEspecial;

    private uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v001.datatypes.ObjGenericCodeInt causal;

    private java.lang.Integer codArea;

    private uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v003.datatypes.ObjPeriodo periodo;

    public ObjAEPeriodo() {
    }

    public ObjAEPeriodo(
           uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v001.datatypes.ObjAEEmp atributoEspecial,
           uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v001.datatypes.ObjGenericCodeInt causal,
           java.lang.Integer codArea,
           uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v003.datatypes.ObjPeriodo periodo) {
           this.atributoEspecial = atributoEspecial;
           this.causal = causal;
           this.codArea = codArea;
           this.periodo = periodo;
    }


    /**
     * Gets the atributoEspecial value for this ObjAEPeriodo.
     * 
     * @return atributoEspecial
     */
    public uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v001.datatypes.ObjAEEmp getAtributoEspecial() {
        return atributoEspecial;
    }


    /**
     * Sets the atributoEspecial value for this ObjAEPeriodo.
     * 
     * @param atributoEspecial
     */
    public void setAtributoEspecial(uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v001.datatypes.ObjAEEmp atributoEspecial) {
        this.atributoEspecial = atributoEspecial;
    }


    /**
     * Gets the causal value for this ObjAEPeriodo.
     * 
     * @return causal
     */
    public uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v001.datatypes.ObjGenericCodeInt getCausal() {
        return causal;
    }


    /**
     * Sets the causal value for this ObjAEPeriodo.
     * 
     * @param causal
     */
    public void setCausal(uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v001.datatypes.ObjGenericCodeInt causal) {
        this.causal = causal;
    }


    /**
     * Gets the codArea value for this ObjAEPeriodo.
     * 
     * @return codArea
     */
    public java.lang.Integer getCodArea() {
        return codArea;
    }


    /**
     * Sets the codArea value for this ObjAEPeriodo.
     * 
     * @param codArea
     */
    public void setCodArea(java.lang.Integer codArea) {
        this.codArea = codArea;
    }


    /**
     * Gets the periodo value for this ObjAEPeriodo.
     * 
     * @return periodo
     */
    public uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v003.datatypes.ObjPeriodo getPeriodo() {
        return periodo;
    }


    /**
     * Sets the periodo value for this ObjAEPeriodo.
     * 
     * @param periodo
     */
    public void setPeriodo(uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v003.datatypes.ObjPeriodo periodo) {
        this.periodo = periodo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ObjAEPeriodo)) return false;
        ObjAEPeriodo other = (ObjAEPeriodo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.atributoEspecial==null && other.getAtributoEspecial()==null) || 
             (this.atributoEspecial!=null &&
              this.atributoEspecial.equals(other.getAtributoEspecial()))) &&
            ((this.causal==null && other.getCausal()==null) || 
             (this.causal!=null &&
              this.causal.equals(other.getCausal()))) &&
            ((this.codArea==null && other.getCodArea()==null) || 
             (this.codArea!=null &&
              this.codArea.equals(other.getCodArea()))) &&
            ((this.periodo==null && other.getPeriodo()==null) || 
             (this.periodo!=null &&
              this.periodo.equals(other.getPeriodo())));
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
        if (getAtributoEspecial() != null) {
            _hashCode += getAtributoEspecial().hashCode();
        }
        if (getCausal() != null) {
            _hashCode += getCausal().hashCode();
        }
        if (getCodArea() != null) {
            _hashCode += getCodArea().hashCode();
        }
        if (getPeriodo() != null) {
            _hashCode += getPeriodo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ObjAEPeriodo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/empresas/v001/datatypes", "ObjAEPeriodo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("atributoEspecial");
        elemField.setXmlName(new javax.xml.namespace.QName("", "atributoEspecial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/empresas/v001/datatypes", "ObjAEEmp"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("causal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "causal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/empresas/v001/datatypes", "objGenericCodeInt"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codArea");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codArea"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("periodo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "periodo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/rce/v003/datatypes", "ObjPeriodo"));
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
