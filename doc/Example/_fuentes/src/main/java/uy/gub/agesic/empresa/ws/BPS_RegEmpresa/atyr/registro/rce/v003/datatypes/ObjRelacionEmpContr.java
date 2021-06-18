/**
 * ObjRelacionEmpContr.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v003.datatypes;

public class ObjRelacionEmpContr  implements java.io.Serializable {
    private uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v002.datatypes.ObjCausal causalDesde;

    private uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v002.datatypes.ObjCausal causalHasta;

    private java.lang.String codEstadoAnulado;

    private java.lang.Integer numeroTramite;

    private uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v003.datatypes.ObjPeriodo periodo;

    public ObjRelacionEmpContr() {
    }

    public ObjRelacionEmpContr(
           uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v002.datatypes.ObjCausal causalDesde,
           uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v002.datatypes.ObjCausal causalHasta,
           java.lang.String codEstadoAnulado,
           java.lang.Integer numeroTramite,
           uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v003.datatypes.ObjPeriodo periodo) {
           this.causalDesde = causalDesde;
           this.causalHasta = causalHasta;
           this.codEstadoAnulado = codEstadoAnulado;
           this.numeroTramite = numeroTramite;
           this.periodo = periodo;
    }


    /**
     * Gets the causalDesde value for this ObjRelacionEmpContr.
     * 
     * @return causalDesde
     */
    public uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v002.datatypes.ObjCausal getCausalDesde() {
        return causalDesde;
    }


    /**
     * Sets the causalDesde value for this ObjRelacionEmpContr.
     * 
     * @param causalDesde
     */
    public void setCausalDesde(uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v002.datatypes.ObjCausal causalDesde) {
        this.causalDesde = causalDesde;
    }


    /**
     * Gets the causalHasta value for this ObjRelacionEmpContr.
     * 
     * @return causalHasta
     */
    public uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v002.datatypes.ObjCausal getCausalHasta() {
        return causalHasta;
    }


    /**
     * Sets the causalHasta value for this ObjRelacionEmpContr.
     * 
     * @param causalHasta
     */
    public void setCausalHasta(uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v002.datatypes.ObjCausal causalHasta) {
        this.causalHasta = causalHasta;
    }


    /**
     * Gets the codEstadoAnulado value for this ObjRelacionEmpContr.
     * 
     * @return codEstadoAnulado
     */
    public java.lang.String getCodEstadoAnulado() {
        return codEstadoAnulado;
    }


    /**
     * Sets the codEstadoAnulado value for this ObjRelacionEmpContr.
     * 
     * @param codEstadoAnulado
     */
    public void setCodEstadoAnulado(java.lang.String codEstadoAnulado) {
        this.codEstadoAnulado = codEstadoAnulado;
    }


    /**
     * Gets the numeroTramite value for this ObjRelacionEmpContr.
     * 
     * @return numeroTramite
     */
    public java.lang.Integer getNumeroTramite() {
        return numeroTramite;
    }


    /**
     * Sets the numeroTramite value for this ObjRelacionEmpContr.
     * 
     * @param numeroTramite
     */
    public void setNumeroTramite(java.lang.Integer numeroTramite) {
        this.numeroTramite = numeroTramite;
    }


    /**
     * Gets the periodo value for this ObjRelacionEmpContr.
     * 
     * @return periodo
     */
    public uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v003.datatypes.ObjPeriodo getPeriodo() {
        return periodo;
    }


    /**
     * Sets the periodo value for this ObjRelacionEmpContr.
     * 
     * @param periodo
     */
    public void setPeriodo(uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v003.datatypes.ObjPeriodo periodo) {
        this.periodo = periodo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ObjRelacionEmpContr)) return false;
        ObjRelacionEmpContr other = (ObjRelacionEmpContr) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.causalDesde==null && other.getCausalDesde()==null) || 
             (this.causalDesde!=null &&
              this.causalDesde.equals(other.getCausalDesde()))) &&
            ((this.causalHasta==null && other.getCausalHasta()==null) || 
             (this.causalHasta!=null &&
              this.causalHasta.equals(other.getCausalHasta()))) &&
            ((this.codEstadoAnulado==null && other.getCodEstadoAnulado()==null) || 
             (this.codEstadoAnulado!=null &&
              this.codEstadoAnulado.equals(other.getCodEstadoAnulado()))) &&
            ((this.numeroTramite==null && other.getNumeroTramite()==null) || 
             (this.numeroTramite!=null &&
              this.numeroTramite.equals(other.getNumeroTramite()))) &&
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
        if (getCausalDesde() != null) {
            _hashCode += getCausalDesde().hashCode();
        }
        if (getCausalHasta() != null) {
            _hashCode += getCausalHasta().hashCode();
        }
        if (getCodEstadoAnulado() != null) {
            _hashCode += getCodEstadoAnulado().hashCode();
        }
        if (getNumeroTramite() != null) {
            _hashCode += getNumeroTramite().hashCode();
        }
        if (getPeriodo() != null) {
            _hashCode += getPeriodo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ObjRelacionEmpContr.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/rce/v003/datatypes", "ObjRelacionEmpContr"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("causalDesde");
        elemField.setXmlName(new javax.xml.namespace.QName("", "causalDesde"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/rce/v002/datatypes", "ObjCausal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("causalHasta");
        elemField.setXmlName(new javax.xml.namespace.QName("", "causalHasta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/rce/v002/datatypes", "ObjCausal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codEstadoAnulado");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codEstadoAnulado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroTramite");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numeroTramite"));
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
