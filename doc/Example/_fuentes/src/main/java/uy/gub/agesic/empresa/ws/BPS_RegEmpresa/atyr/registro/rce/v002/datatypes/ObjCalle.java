/**
 * ObjCalle.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v002.datatypes;

public class ObjCalle  implements java.io.Serializable {
    private java.lang.Integer codCalle;

    private uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v002.datatypes.ObjLocalidad localidad;

    private java.lang.String nombreCalle;

    private java.lang.String vigente;

    public ObjCalle() {
    }

    public ObjCalle(
           java.lang.Integer codCalle,
           uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v002.datatypes.ObjLocalidad localidad,
           java.lang.String nombreCalle,
           java.lang.String vigente) {
           this.codCalle = codCalle;
           this.localidad = localidad;
           this.nombreCalle = nombreCalle;
           this.vigente = vigente;
    }


    /**
     * Gets the codCalle value for this ObjCalle.
     * 
     * @return codCalle
     */
    public java.lang.Integer getCodCalle() {
        return codCalle;
    }


    /**
     * Sets the codCalle value for this ObjCalle.
     * 
     * @param codCalle
     */
    public void setCodCalle(java.lang.Integer codCalle) {
        this.codCalle = codCalle;
    }


    /**
     * Gets the localidad value for this ObjCalle.
     * 
     * @return localidad
     */
    public uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v002.datatypes.ObjLocalidad getLocalidad() {
        return localidad;
    }


    /**
     * Sets the localidad value for this ObjCalle.
     * 
     * @param localidad
     */
    public void setLocalidad(uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v002.datatypes.ObjLocalidad localidad) {
        this.localidad = localidad;
    }


    /**
     * Gets the nombreCalle value for this ObjCalle.
     * 
     * @return nombreCalle
     */
    public java.lang.String getNombreCalle() {
        return nombreCalle;
    }


    /**
     * Sets the nombreCalle value for this ObjCalle.
     * 
     * @param nombreCalle
     */
    public void setNombreCalle(java.lang.String nombreCalle) {
        this.nombreCalle = nombreCalle;
    }


    /**
     * Gets the vigente value for this ObjCalle.
     * 
     * @return vigente
     */
    public java.lang.String getVigente() {
        return vigente;
    }


    /**
     * Sets the vigente value for this ObjCalle.
     * 
     * @param vigente
     */
    public void setVigente(java.lang.String vigente) {
        this.vigente = vigente;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ObjCalle)) return false;
        ObjCalle other = (ObjCalle) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codCalle==null && other.getCodCalle()==null) || 
             (this.codCalle!=null &&
              this.codCalle.equals(other.getCodCalle()))) &&
            ((this.localidad==null && other.getLocalidad()==null) || 
             (this.localidad!=null &&
              this.localidad.equals(other.getLocalidad()))) &&
            ((this.nombreCalle==null && other.getNombreCalle()==null) || 
             (this.nombreCalle!=null &&
              this.nombreCalle.equals(other.getNombreCalle()))) &&
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
        if (getCodCalle() != null) {
            _hashCode += getCodCalle().hashCode();
        }
        if (getLocalidad() != null) {
            _hashCode += getLocalidad().hashCode();
        }
        if (getNombreCalle() != null) {
            _hashCode += getNombreCalle().hashCode();
        }
        if (getVigente() != null) {
            _hashCode += getVigente().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ObjCalle.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/rce/v002/datatypes", "ObjCalle"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codCalle");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codCalle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localidad");
        elemField.setXmlName(new javax.xml.namespace.QName("", "localidad"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/rce/v002/datatypes", "ObjLocalidad"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombreCalle");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nombreCalle"));
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
