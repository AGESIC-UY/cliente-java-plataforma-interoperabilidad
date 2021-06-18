/**
 * ResultObtAtributosEspecialesEmpresa.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v001.datatypes;

public class ResultObtAtributosEspecialesEmpresa  implements java.io.Serializable {
    private uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.v003.datatypes.ObjError[] colError;

    private uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v001.datatypes.ObjContribuyenteAportacionAE[] contribuyentesAportacionesAE;

    private java.lang.Integer valido;

    public ResultObtAtributosEspecialesEmpresa() {
    }

    public ResultObtAtributosEspecialesEmpresa(
           uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.v003.datatypes.ObjError[] colError,
           uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v001.datatypes.ObjContribuyenteAportacionAE[] contribuyentesAportacionesAE,
           java.lang.Integer valido) {
           this.colError = colError;
           this.contribuyentesAportacionesAE = contribuyentesAportacionesAE;
           this.valido = valido;
    }


    /**
     * Gets the colError value for this ResultObtAtributosEspecialesEmpresa.
     * 
     * @return colError
     */
    public uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.v003.datatypes.ObjError[] getColError() {
        return colError;
    }


    /**
     * Sets the colError value for this ResultObtAtributosEspecialesEmpresa.
     * 
     * @param colError
     */
    public void setColError(uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.v003.datatypes.ObjError[] colError) {
        this.colError = colError;
    }

    public uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.v003.datatypes.ObjError getColError(int i) {
        return this.colError[i];
    }

    public void setColError(int i, uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.v003.datatypes.ObjError _value) {
        this.colError[i] = _value;
    }


    /**
     * Gets the contribuyentesAportacionesAE value for this ResultObtAtributosEspecialesEmpresa.
     * 
     * @return contribuyentesAportacionesAE
     */
    public uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v001.datatypes.ObjContribuyenteAportacionAE[] getContribuyentesAportacionesAE() {
        return contribuyentesAportacionesAE;
    }


    /**
     * Sets the contribuyentesAportacionesAE value for this ResultObtAtributosEspecialesEmpresa.
     * 
     * @param contribuyentesAportacionesAE
     */
    public void setContribuyentesAportacionesAE(uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v001.datatypes.ObjContribuyenteAportacionAE[] contribuyentesAportacionesAE) {
        this.contribuyentesAportacionesAE = contribuyentesAportacionesAE;
    }

    public uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v001.datatypes.ObjContribuyenteAportacionAE getContribuyentesAportacionesAE(int i) {
        return this.contribuyentesAportacionesAE[i];
    }

    public void setContribuyentesAportacionesAE(int i, uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v001.datatypes.ObjContribuyenteAportacionAE _value) {
        this.contribuyentesAportacionesAE[i] = _value;
    }


    /**
     * Gets the valido value for this ResultObtAtributosEspecialesEmpresa.
     * 
     * @return valido
     */
    public java.lang.Integer getValido() {
        return valido;
    }


    /**
     * Sets the valido value for this ResultObtAtributosEspecialesEmpresa.
     * 
     * @param valido
     */
    public void setValido(java.lang.Integer valido) {
        this.valido = valido;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResultObtAtributosEspecialesEmpresa)) return false;
        ResultObtAtributosEspecialesEmpresa other = (ResultObtAtributosEspecialesEmpresa) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.colError==null && other.getColError()==null) || 
             (this.colError!=null &&
              java.util.Arrays.equals(this.colError, other.getColError()))) &&
            ((this.contribuyentesAportacionesAE==null && other.getContribuyentesAportacionesAE()==null) || 
             (this.contribuyentesAportacionesAE!=null &&
              java.util.Arrays.equals(this.contribuyentesAportacionesAE, other.getContribuyentesAportacionesAE()))) &&
            ((this.valido==null && other.getValido()==null) || 
             (this.valido!=null &&
              this.valido.equals(other.getValido())));
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
        if (getColError() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getColError());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getColError(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getContribuyentesAportacionesAE() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getContribuyentesAportacionesAE());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getContribuyentesAportacionesAE(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getValido() != null) {
            _hashCode += getValido().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResultObtAtributosEspecialesEmpresa.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/empresas/v001/datatypes", "resultObtAtributosEspecialesEmpresa"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("colError");
        elemField.setXmlName(new javax.xml.namespace.QName("", "colError"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://bps.gub.uy/atyr/v003/datatypes", "ObjError"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contribuyentesAportacionesAE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "contribuyentesAportacionesAE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/empresas/v001/datatypes", "ObjContribuyenteAportacionAE"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valido");
        elemField.setXmlName(new javax.xml.namespace.QName("", "valido"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
