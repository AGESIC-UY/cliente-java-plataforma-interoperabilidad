/**
 * ObjContribuyenteAportacionAE.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v001.datatypes;

public class ObjContribuyenteAportacionAE  implements java.io.Serializable {
    private uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v001.datatypes.ObjAportacionAE[] aportacionesAE;

    private uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v003.datatypes.ObjContribuyente contribuyente;

    public ObjContribuyenteAportacionAE() {
    }

    public ObjContribuyenteAportacionAE(
           uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v001.datatypes.ObjAportacionAE[] aportacionesAE,
           uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v003.datatypes.ObjContribuyente contribuyente) {
           this.aportacionesAE = aportacionesAE;
           this.contribuyente = contribuyente;
    }


    /**
     * Gets the aportacionesAE value for this ObjContribuyenteAportacionAE.
     * 
     * @return aportacionesAE
     */
    public uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v001.datatypes.ObjAportacionAE[] getAportacionesAE() {
        return aportacionesAE;
    }


    /**
     * Sets the aportacionesAE value for this ObjContribuyenteAportacionAE.
     * 
     * @param aportacionesAE
     */
    public void setAportacionesAE(uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v001.datatypes.ObjAportacionAE[] aportacionesAE) {
        this.aportacionesAE = aportacionesAE;
    }

    public uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v001.datatypes.ObjAportacionAE getAportacionesAE(int i) {
        return this.aportacionesAE[i];
    }

    public void setAportacionesAE(int i, uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v001.datatypes.ObjAportacionAE _value) {
        this.aportacionesAE[i] = _value;
    }


    /**
     * Gets the contribuyente value for this ObjContribuyenteAportacionAE.
     * 
     * @return contribuyente
     */
    public uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v003.datatypes.ObjContribuyente getContribuyente() {
        return contribuyente;
    }


    /**
     * Sets the contribuyente value for this ObjContribuyenteAportacionAE.
     * 
     * @param contribuyente
     */
    public void setContribuyente(uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v003.datatypes.ObjContribuyente contribuyente) {
        this.contribuyente = contribuyente;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ObjContribuyenteAportacionAE)) return false;
        ObjContribuyenteAportacionAE other = (ObjContribuyenteAportacionAE) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.aportacionesAE==null && other.getAportacionesAE()==null) || 
             (this.aportacionesAE!=null &&
              java.util.Arrays.equals(this.aportacionesAE, other.getAportacionesAE()))) &&
            ((this.contribuyente==null && other.getContribuyente()==null) || 
             (this.contribuyente!=null &&
              this.contribuyente.equals(other.getContribuyente())));
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
        if (getAportacionesAE() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAportacionesAE());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAportacionesAE(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getContribuyente() != null) {
            _hashCode += getContribuyente().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ObjContribuyenteAportacionAE.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/empresas/v001/datatypes", "ObjContribuyenteAportacionAE"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aportacionesAE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "aportacionesAE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/empresas/v001/datatypes", "ObjAportacionAE"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contribuyente");
        elemField.setXmlName(new javax.xml.namespace.QName("", "contribuyente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/rce/v003/datatypes", "ObjContribuyente"));
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
