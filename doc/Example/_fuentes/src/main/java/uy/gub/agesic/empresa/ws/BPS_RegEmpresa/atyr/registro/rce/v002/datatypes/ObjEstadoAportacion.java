/**
 * ObjEstadoAportacion.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v002.datatypes;

public class ObjEstadoAportacion  implements java.io.Serializable {
    private uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v002.datatypes.ObjCausal causalHastaEstadoApo;

    private java.lang.Integer codEstadoAportacion;

    private java.lang.String descEstadoAportacion;

    private uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v003.datatypes.ObjPeriodo periodoEstadoApo;

    public ObjEstadoAportacion() {
    }

    public ObjEstadoAportacion(
           uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v002.datatypes.ObjCausal causalHastaEstadoApo,
           java.lang.Integer codEstadoAportacion,
           java.lang.String descEstadoAportacion,
           uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v003.datatypes.ObjPeriodo periodoEstadoApo) {
           this.causalHastaEstadoApo = causalHastaEstadoApo;
           this.codEstadoAportacion = codEstadoAportacion;
           this.descEstadoAportacion = descEstadoAportacion;
           this.periodoEstadoApo = periodoEstadoApo;
    }


    /**
     * Gets the causalHastaEstadoApo value for this ObjEstadoAportacion.
     * 
     * @return causalHastaEstadoApo
     */
    public uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v002.datatypes.ObjCausal getCausalHastaEstadoApo() {
        return causalHastaEstadoApo;
    }


    /**
     * Sets the causalHastaEstadoApo value for this ObjEstadoAportacion.
     * 
     * @param causalHastaEstadoApo
     */
    public void setCausalHastaEstadoApo(uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v002.datatypes.ObjCausal causalHastaEstadoApo) {
        this.causalHastaEstadoApo = causalHastaEstadoApo;
    }


    /**
     * Gets the codEstadoAportacion value for this ObjEstadoAportacion.
     * 
     * @return codEstadoAportacion
     */
    public java.lang.Integer getCodEstadoAportacion() {
        return codEstadoAportacion;
    }


    /**
     * Sets the codEstadoAportacion value for this ObjEstadoAportacion.
     * 
     * @param codEstadoAportacion
     */
    public void setCodEstadoAportacion(java.lang.Integer codEstadoAportacion) {
        this.codEstadoAportacion = codEstadoAportacion;
    }


    /**
     * Gets the descEstadoAportacion value for this ObjEstadoAportacion.
     * 
     * @return descEstadoAportacion
     */
    public java.lang.String getDescEstadoAportacion() {
        return descEstadoAportacion;
    }


    /**
     * Sets the descEstadoAportacion value for this ObjEstadoAportacion.
     * 
     * @param descEstadoAportacion
     */
    public void setDescEstadoAportacion(java.lang.String descEstadoAportacion) {
        this.descEstadoAportacion = descEstadoAportacion;
    }


    /**
     * Gets the periodoEstadoApo value for this ObjEstadoAportacion.
     * 
     * @return periodoEstadoApo
     */
    public uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v003.datatypes.ObjPeriodo getPeriodoEstadoApo() {
        return periodoEstadoApo;
    }


    /**
     * Sets the periodoEstadoApo value for this ObjEstadoAportacion.
     * 
     * @param periodoEstadoApo
     */
    public void setPeriodoEstadoApo(uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v003.datatypes.ObjPeriodo periodoEstadoApo) {
        this.periodoEstadoApo = periodoEstadoApo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ObjEstadoAportacion)) return false;
        ObjEstadoAportacion other = (ObjEstadoAportacion) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.causalHastaEstadoApo==null && other.getCausalHastaEstadoApo()==null) || 
             (this.causalHastaEstadoApo!=null &&
              this.causalHastaEstadoApo.equals(other.getCausalHastaEstadoApo()))) &&
            ((this.codEstadoAportacion==null && other.getCodEstadoAportacion()==null) || 
             (this.codEstadoAportacion!=null &&
              this.codEstadoAportacion.equals(other.getCodEstadoAportacion()))) &&
            ((this.descEstadoAportacion==null && other.getDescEstadoAportacion()==null) || 
             (this.descEstadoAportacion!=null &&
              this.descEstadoAportacion.equals(other.getDescEstadoAportacion()))) &&
            ((this.periodoEstadoApo==null && other.getPeriodoEstadoApo()==null) || 
             (this.periodoEstadoApo!=null &&
              this.periodoEstadoApo.equals(other.getPeriodoEstadoApo())));
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
        if (getCausalHastaEstadoApo() != null) {
            _hashCode += getCausalHastaEstadoApo().hashCode();
        }
        if (getCodEstadoAportacion() != null) {
            _hashCode += getCodEstadoAportacion().hashCode();
        }
        if (getDescEstadoAportacion() != null) {
            _hashCode += getDescEstadoAportacion().hashCode();
        }
        if (getPeriodoEstadoApo() != null) {
            _hashCode += getPeriodoEstadoApo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ObjEstadoAportacion.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/rce/v002/datatypes", "ObjEstadoAportacion"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("causalHastaEstadoApo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "causalHastaEstadoApo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/rce/v002/datatypes", "ObjCausal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codEstadoAportacion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codEstadoAportacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descEstadoAportacion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "descEstadoAportacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("periodoEstadoApo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "periodoEstadoApo"));
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
