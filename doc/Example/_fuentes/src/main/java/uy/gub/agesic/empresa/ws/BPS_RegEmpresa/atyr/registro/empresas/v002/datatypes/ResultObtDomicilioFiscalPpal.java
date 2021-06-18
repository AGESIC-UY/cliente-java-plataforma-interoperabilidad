/**
 * ResultObtDomicilioFiscalPpal.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v002.datatypes;

public class ResultObtDomicilioFiscalPpal  implements java.io.Serializable {
    private uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v001.datatypes.ObjEmail[] colEmails;

    private uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.v003.datatypes.ObjError[] colError;

    private uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v001.datatypes.ObjFax[] colFaxes;

    private uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v001.datatypes.ObjTelefono[] colTelefonos;

    private uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v002.datatypes.ObjDomicilio domicilio;

    private java.lang.Integer valido;

    public ResultObtDomicilioFiscalPpal() {
    }

    public ResultObtDomicilioFiscalPpal(
           uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v001.datatypes.ObjEmail[] colEmails,
           uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.v003.datatypes.ObjError[] colError,
           uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v001.datatypes.ObjFax[] colFaxes,
           uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v001.datatypes.ObjTelefono[] colTelefonos,
           uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v002.datatypes.ObjDomicilio domicilio,
           java.lang.Integer valido) {
           this.colEmails = colEmails;
           this.colError = colError;
           this.colFaxes = colFaxes;
           this.colTelefonos = colTelefonos;
           this.domicilio = domicilio;
           this.valido = valido;
    }


    /**
     * Gets the colEmails value for this ResultObtDomicilioFiscalPpal.
     * 
     * @return colEmails
     */
    public uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v001.datatypes.ObjEmail[] getColEmails() {
        return colEmails;
    }


    /**
     * Sets the colEmails value for this ResultObtDomicilioFiscalPpal.
     * 
     * @param colEmails
     */
    public void setColEmails(uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v001.datatypes.ObjEmail[] colEmails) {
        this.colEmails = colEmails;
    }

    public uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v001.datatypes.ObjEmail getColEmails(int i) {
        return this.colEmails[i];
    }

    public void setColEmails(int i, uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v001.datatypes.ObjEmail _value) {
        this.colEmails[i] = _value;
    }


    /**
     * Gets the colError value for this ResultObtDomicilioFiscalPpal.
     * 
     * @return colError
     */
    public uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.v003.datatypes.ObjError[] getColError() {
        return colError;
    }


    /**
     * Sets the colError value for this ResultObtDomicilioFiscalPpal.
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
     * Gets the colFaxes value for this ResultObtDomicilioFiscalPpal.
     * 
     * @return colFaxes
     */
    public uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v001.datatypes.ObjFax[] getColFaxes() {
        return colFaxes;
    }


    /**
     * Sets the colFaxes value for this ResultObtDomicilioFiscalPpal.
     * 
     * @param colFaxes
     */
    public void setColFaxes(uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v001.datatypes.ObjFax[] colFaxes) {
        this.colFaxes = colFaxes;
    }

    public uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v001.datatypes.ObjFax getColFaxes(int i) {
        return this.colFaxes[i];
    }

    public void setColFaxes(int i, uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v001.datatypes.ObjFax _value) {
        this.colFaxes[i] = _value;
    }


    /**
     * Gets the colTelefonos value for this ResultObtDomicilioFiscalPpal.
     * 
     * @return colTelefonos
     */
    public uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v001.datatypes.ObjTelefono[] getColTelefonos() {
        return colTelefonos;
    }


    /**
     * Sets the colTelefonos value for this ResultObtDomicilioFiscalPpal.
     * 
     * @param colTelefonos
     */
    public void setColTelefonos(uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v001.datatypes.ObjTelefono[] colTelefonos) {
        this.colTelefonos = colTelefonos;
    }

    public uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v001.datatypes.ObjTelefono getColTelefonos(int i) {
        return this.colTelefonos[i];
    }

    public void setColTelefonos(int i, uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v001.datatypes.ObjTelefono _value) {
        this.colTelefonos[i] = _value;
    }


    /**
     * Gets the domicilio value for this ResultObtDomicilioFiscalPpal.
     * 
     * @return domicilio
     */
    public uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v002.datatypes.ObjDomicilio getDomicilio() {
        return domicilio;
    }


    /**
     * Sets the domicilio value for this ResultObtDomicilioFiscalPpal.
     * 
     * @param domicilio
     */
    public void setDomicilio(uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v002.datatypes.ObjDomicilio domicilio) {
        this.domicilio = domicilio;
    }


    /**
     * Gets the valido value for this ResultObtDomicilioFiscalPpal.
     * 
     * @return valido
     */
    public java.lang.Integer getValido() {
        return valido;
    }


    /**
     * Sets the valido value for this ResultObtDomicilioFiscalPpal.
     * 
     * @param valido
     */
    public void setValido(java.lang.Integer valido) {
        this.valido = valido;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResultObtDomicilioFiscalPpal)) return false;
        ResultObtDomicilioFiscalPpal other = (ResultObtDomicilioFiscalPpal) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.colEmails==null && other.getColEmails()==null) || 
             (this.colEmails!=null &&
              java.util.Arrays.equals(this.colEmails, other.getColEmails()))) &&
            ((this.colError==null && other.getColError()==null) || 
             (this.colError!=null &&
              java.util.Arrays.equals(this.colError, other.getColError()))) &&
            ((this.colFaxes==null && other.getColFaxes()==null) || 
             (this.colFaxes!=null &&
              java.util.Arrays.equals(this.colFaxes, other.getColFaxes()))) &&
            ((this.colTelefonos==null && other.getColTelefonos()==null) || 
             (this.colTelefonos!=null &&
              java.util.Arrays.equals(this.colTelefonos, other.getColTelefonos()))) &&
            ((this.domicilio==null && other.getDomicilio()==null) || 
             (this.domicilio!=null &&
              this.domicilio.equals(other.getDomicilio()))) &&
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
        if (getColEmails() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getColEmails());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getColEmails(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
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
        if (getColFaxes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getColFaxes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getColFaxes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getColTelefonos() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getColTelefonos());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getColTelefonos(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDomicilio() != null) {
            _hashCode += getDomicilio().hashCode();
        }
        if (getValido() != null) {
            _hashCode += getValido().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResultObtDomicilioFiscalPpal.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/empresas/v002/datatypes", "ResultObtDomicilioFiscalPpal"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("colEmails");
        elemField.setXmlName(new javax.xml.namespace.QName("", "colEmails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/rce/v001/datatypes", "ObjEmail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("colError");
        elemField.setXmlName(new javax.xml.namespace.QName("", "colError"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://bps.gub.uy/atyr/v003/datatypes", "ObjError"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("colFaxes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "colFaxes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/rce/v001/datatypes", "ObjFax"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("colTelefonos");
        elemField.setXmlName(new javax.xml.namespace.QName("", "colTelefonos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/rce/v001/datatypes", "ObjTelefono"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("domicilio");
        elemField.setXmlName(new javax.xml.namespace.QName("", "domicilio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/rce/v002/datatypes", "ObjDomicilio"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
