/**
 * ObjAportacionAE.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v001.datatypes;

public class ObjAportacionAE  implements java.io.Serializable {
    private uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v001.datatypes.ObjGenericCodeInt aportacion;

    private uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v001.datatypes.ObjAEPeriodo[] atributosEspeciales;

    public ObjAportacionAE() {
    }

    public ObjAportacionAE(
           uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v001.datatypes.ObjGenericCodeInt aportacion,
           uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v001.datatypes.ObjAEPeriodo[] atributosEspeciales) {
           this.aportacion = aportacion;
           this.atributosEspeciales = atributosEspeciales;
    }


    /**
     * Gets the aportacion value for this ObjAportacionAE.
     * 
     * @return aportacion
     */
    public uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v001.datatypes.ObjGenericCodeInt getAportacion() {
        return aportacion;
    }


    /**
     * Sets the aportacion value for this ObjAportacionAE.
     * 
     * @param aportacion
     */
    public void setAportacion(uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v001.datatypes.ObjGenericCodeInt aportacion) {
        this.aportacion = aportacion;
    }


    /**
     * Gets the atributosEspeciales value for this ObjAportacionAE.
     * 
     * @return atributosEspeciales
     */
    public uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v001.datatypes.ObjAEPeriodo[] getAtributosEspeciales() {
        return atributosEspeciales;
    }


    /**
     * Sets the atributosEspeciales value for this ObjAportacionAE.
     * 
     * @param atributosEspeciales
     */
    public void setAtributosEspeciales(uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v001.datatypes.ObjAEPeriodo[] atributosEspeciales) {
        this.atributosEspeciales = atributosEspeciales;
    }

    public uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v001.datatypes.ObjAEPeriodo getAtributosEspeciales(int i) {
        return this.atributosEspeciales[i];
    }

    public void setAtributosEspeciales(int i, uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v001.datatypes.ObjAEPeriodo _value) {
        this.atributosEspeciales[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ObjAportacionAE)) return false;
        ObjAportacionAE other = (ObjAportacionAE) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.aportacion==null && other.getAportacion()==null) || 
             (this.aportacion!=null &&
              this.aportacion.equals(other.getAportacion()))) &&
            ((this.atributosEspeciales==null && other.getAtributosEspeciales()==null) || 
             (this.atributosEspeciales!=null &&
              java.util.Arrays.equals(this.atributosEspeciales, other.getAtributosEspeciales())));
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
        if (getAportacion() != null) {
            _hashCode += getAportacion().hashCode();
        }
        if (getAtributosEspeciales() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAtributosEspeciales());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAtributosEspeciales(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ObjAportacionAE.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/empresas/v001/datatypes", "ObjAportacionAE"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aportacion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "aportacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/empresas/v001/datatypes", "objGenericCodeInt"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("atributosEspeciales");
        elemField.setXmlName(new javax.xml.namespace.QName("", "atributosEspeciales"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/empresas/v001/datatypes", "ObjAEPeriodo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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
