/**
 * ObjEmpresaContribuyentes.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v002.datatypes;

public class ObjEmpresaContribuyentes  implements java.io.Serializable {
    private uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v003.datatypes.ObjContribuyente objContribuyente;

    private uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v003.datatypes.ObjRelacionEmpContr objRelacionEmpContr;

    public ObjEmpresaContribuyentes() {
    }

    public ObjEmpresaContribuyentes(
           uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v003.datatypes.ObjContribuyente objContribuyente,
           uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v003.datatypes.ObjRelacionEmpContr objRelacionEmpContr) {
           this.objContribuyente = objContribuyente;
           this.objRelacionEmpContr = objRelacionEmpContr;
    }


    /**
     * Gets the objContribuyente value for this ObjEmpresaContribuyentes.
     * 
     * @return objContribuyente
     */
    public uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v003.datatypes.ObjContribuyente getObjContribuyente() {
        return objContribuyente;
    }


    /**
     * Sets the objContribuyente value for this ObjEmpresaContribuyentes.
     * 
     * @param objContribuyente
     */
    public void setObjContribuyente(uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v003.datatypes.ObjContribuyente objContribuyente) {
        this.objContribuyente = objContribuyente;
    }


    /**
     * Gets the objRelacionEmpContr value for this ObjEmpresaContribuyentes.
     * 
     * @return objRelacionEmpContr
     */
    public uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v003.datatypes.ObjRelacionEmpContr getObjRelacionEmpContr() {
        return objRelacionEmpContr;
    }


    /**
     * Sets the objRelacionEmpContr value for this ObjEmpresaContribuyentes.
     * 
     * @param objRelacionEmpContr
     */
    public void setObjRelacionEmpContr(uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v003.datatypes.ObjRelacionEmpContr objRelacionEmpContr) {
        this.objRelacionEmpContr = objRelacionEmpContr;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ObjEmpresaContribuyentes)) return false;
        ObjEmpresaContribuyentes other = (ObjEmpresaContribuyentes) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.objContribuyente==null && other.getObjContribuyente()==null) || 
             (this.objContribuyente!=null &&
              this.objContribuyente.equals(other.getObjContribuyente()))) &&
            ((this.objRelacionEmpContr==null && other.getObjRelacionEmpContr()==null) || 
             (this.objRelacionEmpContr!=null &&
              this.objRelacionEmpContr.equals(other.getObjRelacionEmpContr())));
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
        if (getObjContribuyente() != null) {
            _hashCode += getObjContribuyente().hashCode();
        }
        if (getObjRelacionEmpContr() != null) {
            _hashCode += getObjRelacionEmpContr().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ObjEmpresaContribuyentes.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/rce/v002/datatypes", "ObjEmpresaContribuyentes"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("objContribuyente");
        elemField.setXmlName(new javax.xml.namespace.QName("", "objContribuyente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/rce/v003/datatypes", "ObjContribuyente"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("objRelacionEmpContr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "objRelacionEmpContr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/rce/v003/datatypes", "ObjRelacionEmpContr"));
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
