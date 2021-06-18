/**
 * ObjGiroPeriodo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v002.datatypes;

public class ObjGiroPeriodo  implements java.io.Serializable {
    private uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v002.datatypes.ObjCausal causalHastaGiro;

    private uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v002.datatypes.ObjGiro giro;

    private uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v003.datatypes.ObjPeriodo periodo;

    public ObjGiroPeriodo() {
    }

    public ObjGiroPeriodo(
           uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v002.datatypes.ObjCausal causalHastaGiro,
           uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v002.datatypes.ObjGiro giro,
           uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v003.datatypes.ObjPeriodo periodo) {
           this.causalHastaGiro = causalHastaGiro;
           this.giro = giro;
           this.periodo = periodo;
    }


    /**
     * Gets the causalHastaGiro value for this ObjGiroPeriodo.
     * 
     * @return causalHastaGiro
     */
    public uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v002.datatypes.ObjCausal getCausalHastaGiro() {
        return causalHastaGiro;
    }


    /**
     * Sets the causalHastaGiro value for this ObjGiroPeriodo.
     * 
     * @param causalHastaGiro
     */
    public void setCausalHastaGiro(uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v002.datatypes.ObjCausal causalHastaGiro) {
        this.causalHastaGiro = causalHastaGiro;
    }


    /**
     * Gets the giro value for this ObjGiroPeriodo.
     * 
     * @return giro
     */
    public uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v002.datatypes.ObjGiro getGiro() {
        return giro;
    }


    /**
     * Sets the giro value for this ObjGiroPeriodo.
     * 
     * @param giro
     */
    public void setGiro(uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v002.datatypes.ObjGiro giro) {
        this.giro = giro;
    }


    /**
     * Gets the periodo value for this ObjGiroPeriodo.
     * 
     * @return periodo
     */
    public uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v003.datatypes.ObjPeriodo getPeriodo() {
        return periodo;
    }


    /**
     * Sets the periodo value for this ObjGiroPeriodo.
     * 
     * @param periodo
     */
    public void setPeriodo(uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v003.datatypes.ObjPeriodo periodo) {
        this.periodo = periodo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ObjGiroPeriodo)) return false;
        ObjGiroPeriodo other = (ObjGiroPeriodo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.causalHastaGiro==null && other.getCausalHastaGiro()==null) || 
             (this.causalHastaGiro!=null &&
              this.causalHastaGiro.equals(other.getCausalHastaGiro()))) &&
            ((this.giro==null && other.getGiro()==null) || 
             (this.giro!=null &&
              this.giro.equals(other.getGiro()))) &&
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
        if (getCausalHastaGiro() != null) {
            _hashCode += getCausalHastaGiro().hashCode();
        }
        if (getGiro() != null) {
            _hashCode += getGiro().hashCode();
        }
        if (getPeriodo() != null) {
            _hashCode += getPeriodo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ObjGiroPeriodo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/rce/v002/datatypes", "ObjGiroPeriodo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("causalHastaGiro");
        elemField.setXmlName(new javax.xml.namespace.QName("", "causalHastaGiro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/rce/v002/datatypes", "ObjCausal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("giro");
        elemField.setXmlName(new javax.xml.namespace.QName("", "giro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/rce/v002/datatypes", "ObjGiro"));
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
