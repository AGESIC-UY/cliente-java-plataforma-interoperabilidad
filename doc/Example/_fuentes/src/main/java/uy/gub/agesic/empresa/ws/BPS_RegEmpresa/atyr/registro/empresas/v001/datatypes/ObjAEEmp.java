/**
 * ObjAEEmp.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v001.datatypes;

public class ObjAEEmp  implements java.io.Serializable {
    private java.lang.Integer codAtributoEspecialEmpresa;

    private java.lang.String descAtributoEspecialEmpresa;

    private java.lang.String vigente;

    public ObjAEEmp() {
    }

    public ObjAEEmp(
           java.lang.Integer codAtributoEspecialEmpresa,
           java.lang.String descAtributoEspecialEmpresa,
           java.lang.String vigente) {
           this.codAtributoEspecialEmpresa = codAtributoEspecialEmpresa;
           this.descAtributoEspecialEmpresa = descAtributoEspecialEmpresa;
           this.vigente = vigente;
    }


    /**
     * Gets the codAtributoEspecialEmpresa value for this ObjAEEmp.
     * 
     * @return codAtributoEspecialEmpresa
     */
    public java.lang.Integer getCodAtributoEspecialEmpresa() {
        return codAtributoEspecialEmpresa;
    }


    /**
     * Sets the codAtributoEspecialEmpresa value for this ObjAEEmp.
     * 
     * @param codAtributoEspecialEmpresa
     */
    public void setCodAtributoEspecialEmpresa(java.lang.Integer codAtributoEspecialEmpresa) {
        this.codAtributoEspecialEmpresa = codAtributoEspecialEmpresa;
    }


    /**
     * Gets the descAtributoEspecialEmpresa value for this ObjAEEmp.
     * 
     * @return descAtributoEspecialEmpresa
     */
    public java.lang.String getDescAtributoEspecialEmpresa() {
        return descAtributoEspecialEmpresa;
    }


    /**
     * Sets the descAtributoEspecialEmpresa value for this ObjAEEmp.
     * 
     * @param descAtributoEspecialEmpresa
     */
    public void setDescAtributoEspecialEmpresa(java.lang.String descAtributoEspecialEmpresa) {
        this.descAtributoEspecialEmpresa = descAtributoEspecialEmpresa;
    }


    /**
     * Gets the vigente value for this ObjAEEmp.
     * 
     * @return vigente
     */
    public java.lang.String getVigente() {
        return vigente;
    }


    /**
     * Sets the vigente value for this ObjAEEmp.
     * 
     * @param vigente
     */
    public void setVigente(java.lang.String vigente) {
        this.vigente = vigente;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ObjAEEmp)) return false;
        ObjAEEmp other = (ObjAEEmp) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codAtributoEspecialEmpresa==null && other.getCodAtributoEspecialEmpresa()==null) || 
             (this.codAtributoEspecialEmpresa!=null &&
              this.codAtributoEspecialEmpresa.equals(other.getCodAtributoEspecialEmpresa()))) &&
            ((this.descAtributoEspecialEmpresa==null && other.getDescAtributoEspecialEmpresa()==null) || 
             (this.descAtributoEspecialEmpresa!=null &&
              this.descAtributoEspecialEmpresa.equals(other.getDescAtributoEspecialEmpresa()))) &&
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
        if (getCodAtributoEspecialEmpresa() != null) {
            _hashCode += getCodAtributoEspecialEmpresa().hashCode();
        }
        if (getDescAtributoEspecialEmpresa() != null) {
            _hashCode += getDescAtributoEspecialEmpresa().hashCode();
        }
        if (getVigente() != null) {
            _hashCode += getVigente().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ObjAEEmp.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/empresas/v001/datatypes", "ObjAEEmp"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codAtributoEspecialEmpresa");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codAtributoEspecialEmpresa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descAtributoEspecialEmpresa");
        elemField.setXmlName(new javax.xml.namespace.QName("", "descAtributoEspecialEmpresa"));
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
