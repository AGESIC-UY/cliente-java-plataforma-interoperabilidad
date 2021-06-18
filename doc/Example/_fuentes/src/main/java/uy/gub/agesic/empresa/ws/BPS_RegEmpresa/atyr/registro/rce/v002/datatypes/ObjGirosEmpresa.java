/**
 * ObjGirosEmpresa.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v002.datatypes;

public class ObjGirosEmpresa  implements java.io.Serializable {
    private uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v002.datatypes.ObjGiroPeriodo giroPrincipal;

    private uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v002.datatypes.ObjGiroPeriodo[] girosSecundarios;

    public ObjGirosEmpresa() {
    }

    public ObjGirosEmpresa(
           uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v002.datatypes.ObjGiroPeriodo giroPrincipal,
           uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v002.datatypes.ObjGiroPeriodo[] girosSecundarios) {
           this.giroPrincipal = giroPrincipal;
           this.girosSecundarios = girosSecundarios;
    }


    /**
     * Gets the giroPrincipal value for this ObjGirosEmpresa.
     * 
     * @return giroPrincipal
     */
    public uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v002.datatypes.ObjGiroPeriodo getGiroPrincipal() {
        return giroPrincipal;
    }


    /**
     * Sets the giroPrincipal value for this ObjGirosEmpresa.
     * 
     * @param giroPrincipal
     */
    public void setGiroPrincipal(uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v002.datatypes.ObjGiroPeriodo giroPrincipal) {
        this.giroPrincipal = giroPrincipal;
    }


    /**
     * Gets the girosSecundarios value for this ObjGirosEmpresa.
     * 
     * @return girosSecundarios
     */
    public uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v002.datatypes.ObjGiroPeriodo[] getGirosSecundarios() {
        return girosSecundarios;
    }


    /**
     * Sets the girosSecundarios value for this ObjGirosEmpresa.
     * 
     * @param girosSecundarios
     */
    public void setGirosSecundarios(uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v002.datatypes.ObjGiroPeriodo[] girosSecundarios) {
        this.girosSecundarios = girosSecundarios;
    }

    public uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v002.datatypes.ObjGiroPeriodo getGirosSecundarios(int i) {
        return this.girosSecundarios[i];
    }

    public void setGirosSecundarios(int i, uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v002.datatypes.ObjGiroPeriodo _value) {
        this.girosSecundarios[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ObjGirosEmpresa)) return false;
        ObjGirosEmpresa other = (ObjGirosEmpresa) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.giroPrincipal==null && other.getGiroPrincipal()==null) || 
             (this.giroPrincipal!=null &&
              this.giroPrincipal.equals(other.getGiroPrincipal()))) &&
            ((this.girosSecundarios==null && other.getGirosSecundarios()==null) || 
             (this.girosSecundarios!=null &&
              java.util.Arrays.equals(this.girosSecundarios, other.getGirosSecundarios())));
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
        if (getGiroPrincipal() != null) {
            _hashCode += getGiroPrincipal().hashCode();
        }
        if (getGirosSecundarios() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGirosSecundarios());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGirosSecundarios(), i);
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
        new org.apache.axis.description.TypeDesc(ObjGirosEmpresa.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/rce/v002/datatypes", "ObjGirosEmpresa"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("giroPrincipal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "giroPrincipal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/rce/v002/datatypes", "ObjGiroPeriodo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("girosSecundarios");
        elemField.setXmlName(new javax.xml.namespace.QName("", "girosSecundarios"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/rce/v002/datatypes", "ObjGiroPeriodo"));
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
