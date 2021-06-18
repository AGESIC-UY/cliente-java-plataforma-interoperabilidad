/**
 * Direccion.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.WsRegEmpresaV002.datatypes;

public class Direccion  implements java.io.Serializable {
    private java.lang.String apto;

    private java.lang.String bis;

    private uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.WsRegEmpresaV002.datatypes.Calle calle;

    private uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.WsRegEmpresaV002.datatypes.Calle calleEntreDos;

    private uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.WsRegEmpresaV002.datatypes.Calle calleEntreUno;

    private uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.WsRegEmpresaV002.datatypes.CodigoPostal codigoPostal;

    private java.lang.String numeroPuerta;

    public Direccion() {
    }

    public Direccion(
           java.lang.String apto,
           java.lang.String bis,
           uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.WsRegEmpresaV002.datatypes.Calle calle,
           uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.WsRegEmpresaV002.datatypes.Calle calleEntreDos,
           uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.WsRegEmpresaV002.datatypes.Calle calleEntreUno,
           uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.WsRegEmpresaV002.datatypes.CodigoPostal codigoPostal,
           java.lang.String numeroPuerta) {
           this.apto = apto;
           this.bis = bis;
           this.calle = calle;
           this.calleEntreDos = calleEntreDos;
           this.calleEntreUno = calleEntreUno;
           this.codigoPostal = codigoPostal;
           this.numeroPuerta = numeroPuerta;
    }


    /**
     * Gets the apto value for this Direccion.
     * 
     * @return apto
     */
    public java.lang.String getApto() {
        return apto;
    }


    /**
     * Sets the apto value for this Direccion.
     * 
     * @param apto
     */
    public void setApto(java.lang.String apto) {
        this.apto = apto;
    }


    /**
     * Gets the bis value for this Direccion.
     * 
     * @return bis
     */
    public java.lang.String getBis() {
        return bis;
    }


    /**
     * Sets the bis value for this Direccion.
     * 
     * @param bis
     */
    public void setBis(java.lang.String bis) {
        this.bis = bis;
    }


    /**
     * Gets the calle value for this Direccion.
     * 
     * @return calle
     */
    public uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.WsRegEmpresaV002.datatypes.Calle getCalle() {
        return calle;
    }


    /**
     * Sets the calle value for this Direccion.
     * 
     * @param calle
     */
    public void setCalle(uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.WsRegEmpresaV002.datatypes.Calle calle) {
        this.calle = calle;
    }


    /**
     * Gets the calleEntreDos value for this Direccion.
     * 
     * @return calleEntreDos
     */
    public uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.WsRegEmpresaV002.datatypes.Calle getCalleEntreDos() {
        return calleEntreDos;
    }


    /**
     * Sets the calleEntreDos value for this Direccion.
     * 
     * @param calleEntreDos
     */
    public void setCalleEntreDos(uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.WsRegEmpresaV002.datatypes.Calle calleEntreDos) {
        this.calleEntreDos = calleEntreDos;
    }


    /**
     * Gets the calleEntreUno value for this Direccion.
     * 
     * @return calleEntreUno
     */
    public uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.WsRegEmpresaV002.datatypes.Calle getCalleEntreUno() {
        return calleEntreUno;
    }


    /**
     * Sets the calleEntreUno value for this Direccion.
     * 
     * @param calleEntreUno
     */
    public void setCalleEntreUno(uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.WsRegEmpresaV002.datatypes.Calle calleEntreUno) {
        this.calleEntreUno = calleEntreUno;
    }


    /**
     * Gets the codigoPostal value for this Direccion.
     * 
     * @return codigoPostal
     */
    public uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.WsRegEmpresaV002.datatypes.CodigoPostal getCodigoPostal() {
        return codigoPostal;
    }


    /**
     * Sets the codigoPostal value for this Direccion.
     * 
     * @param codigoPostal
     */
    public void setCodigoPostal(uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.WsRegEmpresaV002.datatypes.CodigoPostal codigoPostal) {
        this.codigoPostal = codigoPostal;
    }


    /**
     * Gets the numeroPuerta value for this Direccion.
     * 
     * @return numeroPuerta
     */
    public java.lang.String getNumeroPuerta() {
        return numeroPuerta;
    }


    /**
     * Sets the numeroPuerta value for this Direccion.
     * 
     * @param numeroPuerta
     */
    public void setNumeroPuerta(java.lang.String numeroPuerta) {
        this.numeroPuerta = numeroPuerta;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Direccion)) return false;
        Direccion other = (Direccion) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.apto==null && other.getApto()==null) || 
             (this.apto!=null &&
              this.apto.equals(other.getApto()))) &&
            ((this.bis==null && other.getBis()==null) || 
             (this.bis!=null &&
              this.bis.equals(other.getBis()))) &&
            ((this.calle==null && other.getCalle()==null) || 
             (this.calle!=null &&
              this.calle.equals(other.getCalle()))) &&
            ((this.calleEntreDos==null && other.getCalleEntreDos()==null) || 
             (this.calleEntreDos!=null &&
              this.calleEntreDos.equals(other.getCalleEntreDos()))) &&
            ((this.calleEntreUno==null && other.getCalleEntreUno()==null) || 
             (this.calleEntreUno!=null &&
              this.calleEntreUno.equals(other.getCalleEntreUno()))) &&
            ((this.codigoPostal==null && other.getCodigoPostal()==null) || 
             (this.codigoPostal!=null &&
              this.codigoPostal.equals(other.getCodigoPostal()))) &&
            ((this.numeroPuerta==null && other.getNumeroPuerta()==null) || 
             (this.numeroPuerta!=null &&
              this.numeroPuerta.equals(other.getNumeroPuerta())));
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
        if (getApto() != null) {
            _hashCode += getApto().hashCode();
        }
        if (getBis() != null) {
            _hashCode += getBis().hashCode();
        }
        if (getCalle() != null) {
            _hashCode += getCalle().hashCode();
        }
        if (getCalleEntreDos() != null) {
            _hashCode += getCalleEntreDos().hashCode();
        }
        if (getCalleEntreUno() != null) {
            _hashCode += getCalleEntreUno().hashCode();
        }
        if (getCodigoPostal() != null) {
            _hashCode += getCodigoPostal().hashCode();
        }
        if (getNumeroPuerta() != null) {
            _hashCode += getNumeroPuerta().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Direccion.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/WsRegEmpresaV002/datatypes", "Direccion"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apto");
        elemField.setXmlName(new javax.xml.namespace.QName("", "apto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bis");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bis"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("calle");
        elemField.setXmlName(new javax.xml.namespace.QName("", "calle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/WsRegEmpresaV002/datatypes", "Calle"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("calleEntreDos");
        elemField.setXmlName(new javax.xml.namespace.QName("", "calleEntreDos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/WsRegEmpresaV002/datatypes", "Calle"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("calleEntreUno");
        elemField.setXmlName(new javax.xml.namespace.QName("", "calleEntreUno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/WsRegEmpresaV002/datatypes", "Calle"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoPostal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoPostal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/WsRegEmpresaV002/datatypes", "CodigoPostal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroPuerta");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numeroPuerta"));
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
