/**
 * ObjDatosAportacionEmpresa.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v002.datatypes;

public class ObjDatosAportacionEmpresa  implements java.io.Serializable {
    private uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v002.datatypes.ObjAportacion aportacion;

    private uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v002.datatypes.ObjEstadoAportacion[] estadosAportacion;

    public ObjDatosAportacionEmpresa() {
    }

    public ObjDatosAportacionEmpresa(
           uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v002.datatypes.ObjAportacion aportacion,
           uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v002.datatypes.ObjEstadoAportacion[] estadosAportacion) {
           this.aportacion = aportacion;
           this.estadosAportacion = estadosAportacion;
    }


    /**
     * Gets the aportacion value for this ObjDatosAportacionEmpresa.
     * 
     * @return aportacion
     */
    public uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v002.datatypes.ObjAportacion getAportacion() {
        return aportacion;
    }


    /**
     * Sets the aportacion value for this ObjDatosAportacionEmpresa.
     * 
     * @param aportacion
     */
    public void setAportacion(uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v002.datatypes.ObjAportacion aportacion) {
        this.aportacion = aportacion;
    }


    /**
     * Gets the estadosAportacion value for this ObjDatosAportacionEmpresa.
     * 
     * @return estadosAportacion
     */
    public uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v002.datatypes.ObjEstadoAportacion[] getEstadosAportacion() {
        return estadosAportacion;
    }


    /**
     * Sets the estadosAportacion value for this ObjDatosAportacionEmpresa.
     * 
     * @param estadosAportacion
     */
    public void setEstadosAportacion(uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v002.datatypes.ObjEstadoAportacion[] estadosAportacion) {
        this.estadosAportacion = estadosAportacion;
    }

    public uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v002.datatypes.ObjEstadoAportacion getEstadosAportacion(int i) {
        return this.estadosAportacion[i];
    }

    public void setEstadosAportacion(int i, uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v002.datatypes.ObjEstadoAportacion _value) {
        this.estadosAportacion[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ObjDatosAportacionEmpresa)) return false;
        ObjDatosAportacionEmpresa other = (ObjDatosAportacionEmpresa) obj;
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
            ((this.estadosAportacion==null && other.getEstadosAportacion()==null) || 
             (this.estadosAportacion!=null &&
              java.util.Arrays.equals(this.estadosAportacion, other.getEstadosAportacion())));
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
        if (getEstadosAportacion() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEstadosAportacion());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEstadosAportacion(), i);
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
        new org.apache.axis.description.TypeDesc(ObjDatosAportacionEmpresa.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/rce/v002/datatypes", "ObjDatosAportacionEmpresa"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aportacion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "aportacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/rce/v002/datatypes", "ObjAportacion"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estadosAportacion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "estadosAportacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/rce/v002/datatypes", "ObjEstadoAportacion"));
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
