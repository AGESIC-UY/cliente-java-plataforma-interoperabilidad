/**
 * LocalEmpresa.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.WsRegEmpresaV002.datatypes;

public class LocalEmpresa  implements java.io.Serializable {
    private uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.WsRegEmpresaV002.datatypes.AmpliacionDomicilio ampliacionDomicilio;

    private uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.WsRegEmpresaV002.datatypes.Departamento departamento;

    private uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.WsRegEmpresaV002.datatypes.Direccion direccion;

    private uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.WsRegEmpresaV002.datatypes.EMail[] emails;

    private uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.WsRegEmpresaV002.datatypes.Fax[] faxes;

    private uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.WsRegEmpresaV002.datatypes.Localidad localidad;

    private java.lang.Integer numeroLocal;

    private uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.WsRegEmpresaV002.datatypes.ObjPeriodo periodo;

    private uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.WsRegEmpresaV002.datatypes.Telefono[] telefonos;

    private uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.WsRegEmpresaV002.datatypes.TipoEstablecimiento tipoEstablecimiento;

    public LocalEmpresa() {
    }

    public LocalEmpresa(
           uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.WsRegEmpresaV002.datatypes.AmpliacionDomicilio ampliacionDomicilio,
           uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.WsRegEmpresaV002.datatypes.Departamento departamento,
           uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.WsRegEmpresaV002.datatypes.Direccion direccion,
           uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.WsRegEmpresaV002.datatypes.EMail[] emails,
           uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.WsRegEmpresaV002.datatypes.Fax[] faxes,
           uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.WsRegEmpresaV002.datatypes.Localidad localidad,
           java.lang.Integer numeroLocal,
           uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.WsRegEmpresaV002.datatypes.ObjPeriodo periodo,
           uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.WsRegEmpresaV002.datatypes.Telefono[] telefonos,
           uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.WsRegEmpresaV002.datatypes.TipoEstablecimiento tipoEstablecimiento) {
           this.ampliacionDomicilio = ampliacionDomicilio;
           this.departamento = departamento;
           this.direccion = direccion;
           this.emails = emails;
           this.faxes = faxes;
           this.localidad = localidad;
           this.numeroLocal = numeroLocal;
           this.periodo = periodo;
           this.telefonos = telefonos;
           this.tipoEstablecimiento = tipoEstablecimiento;
    }


    /**
     * Gets the ampliacionDomicilio value for this LocalEmpresa.
     * 
     * @return ampliacionDomicilio
     */
    public uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.WsRegEmpresaV002.datatypes.AmpliacionDomicilio getAmpliacionDomicilio() {
        return ampliacionDomicilio;
    }


    /**
     * Sets the ampliacionDomicilio value for this LocalEmpresa.
     * 
     * @param ampliacionDomicilio
     */
    public void setAmpliacionDomicilio(uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.WsRegEmpresaV002.datatypes.AmpliacionDomicilio ampliacionDomicilio) {
        this.ampliacionDomicilio = ampliacionDomicilio;
    }


    /**
     * Gets the departamento value for this LocalEmpresa.
     * 
     * @return departamento
     */
    public uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.WsRegEmpresaV002.datatypes.Departamento getDepartamento() {
        return departamento;
    }


    /**
     * Sets the departamento value for this LocalEmpresa.
     * 
     * @param departamento
     */
    public void setDepartamento(uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.WsRegEmpresaV002.datatypes.Departamento departamento) {
        this.departamento = departamento;
    }


    /**
     * Gets the direccion value for this LocalEmpresa.
     * 
     * @return direccion
     */
    public uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.WsRegEmpresaV002.datatypes.Direccion getDireccion() {
        return direccion;
    }


    /**
     * Sets the direccion value for this LocalEmpresa.
     * 
     * @param direccion
     */
    public void setDireccion(uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.WsRegEmpresaV002.datatypes.Direccion direccion) {
        this.direccion = direccion;
    }


    /**
     * Gets the emails value for this LocalEmpresa.
     * 
     * @return emails
     */
    public uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.WsRegEmpresaV002.datatypes.EMail[] getEmails() {
        return emails;
    }


    /**
     * Sets the emails value for this LocalEmpresa.
     * 
     * @param emails
     */
    public void setEmails(uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.WsRegEmpresaV002.datatypes.EMail[] emails) {
        this.emails = emails;
    }

    public uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.WsRegEmpresaV002.datatypes.EMail getEmails(int i) {
        return this.emails[i];
    }

    public void setEmails(int i, uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.WsRegEmpresaV002.datatypes.EMail _value) {
        this.emails[i] = _value;
    }


    /**
     * Gets the faxes value for this LocalEmpresa.
     * 
     * @return faxes
     */
    public uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.WsRegEmpresaV002.datatypes.Fax[] getFaxes() {
        return faxes;
    }


    /**
     * Sets the faxes value for this LocalEmpresa.
     * 
     * @param faxes
     */
    public void setFaxes(uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.WsRegEmpresaV002.datatypes.Fax[] faxes) {
        this.faxes = faxes;
    }

    public uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.WsRegEmpresaV002.datatypes.Fax getFaxes(int i) {
        return this.faxes[i];
    }

    public void setFaxes(int i, uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.WsRegEmpresaV002.datatypes.Fax _value) {
        this.faxes[i] = _value;
    }


    /**
     * Gets the localidad value for this LocalEmpresa.
     * 
     * @return localidad
     */
    public uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.WsRegEmpresaV002.datatypes.Localidad getLocalidad() {
        return localidad;
    }


    /**
     * Sets the localidad value for this LocalEmpresa.
     * 
     * @param localidad
     */
    public void setLocalidad(uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.WsRegEmpresaV002.datatypes.Localidad localidad) {
        this.localidad = localidad;
    }


    /**
     * Gets the numeroLocal value for this LocalEmpresa.
     * 
     * @return numeroLocal
     */
    public java.lang.Integer getNumeroLocal() {
        return numeroLocal;
    }


    /**
     * Sets the numeroLocal value for this LocalEmpresa.
     * 
     * @param numeroLocal
     */
    public void setNumeroLocal(java.lang.Integer numeroLocal) {
        this.numeroLocal = numeroLocal;
    }


    /**
     * Gets the periodo value for this LocalEmpresa.
     * 
     * @return periodo
     */
    public uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.WsRegEmpresaV002.datatypes.ObjPeriodo getPeriodo() {
        return periodo;
    }


    /**
     * Sets the periodo value for this LocalEmpresa.
     * 
     * @param periodo
     */
    public void setPeriodo(uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.WsRegEmpresaV002.datatypes.ObjPeriodo periodo) {
        this.periodo = periodo;
    }


    /**
     * Gets the telefonos value for this LocalEmpresa.
     * 
     * @return telefonos
     */
    public uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.WsRegEmpresaV002.datatypes.Telefono[] getTelefonos() {
        return telefonos;
    }


    /**
     * Sets the telefonos value for this LocalEmpresa.
     * 
     * @param telefonos
     */
    public void setTelefonos(uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.WsRegEmpresaV002.datatypes.Telefono[] telefonos) {
        this.telefonos = telefonos;
    }

    public uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.WsRegEmpresaV002.datatypes.Telefono getTelefonos(int i) {
        return this.telefonos[i];
    }

    public void setTelefonos(int i, uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.WsRegEmpresaV002.datatypes.Telefono _value) {
        this.telefonos[i] = _value;
    }


    /**
     * Gets the tipoEstablecimiento value for this LocalEmpresa.
     * 
     * @return tipoEstablecimiento
     */
    public uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.WsRegEmpresaV002.datatypes.TipoEstablecimiento getTipoEstablecimiento() {
        return tipoEstablecimiento;
    }


    /**
     * Sets the tipoEstablecimiento value for this LocalEmpresa.
     * 
     * @param tipoEstablecimiento
     */
    public void setTipoEstablecimiento(uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.WsRegEmpresaV002.datatypes.TipoEstablecimiento tipoEstablecimiento) {
        this.tipoEstablecimiento = tipoEstablecimiento;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LocalEmpresa)) return false;
        LocalEmpresa other = (LocalEmpresa) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ampliacionDomicilio==null && other.getAmpliacionDomicilio()==null) || 
             (this.ampliacionDomicilio!=null &&
              this.ampliacionDomicilio.equals(other.getAmpliacionDomicilio()))) &&
            ((this.departamento==null && other.getDepartamento()==null) || 
             (this.departamento!=null &&
              this.departamento.equals(other.getDepartamento()))) &&
            ((this.direccion==null && other.getDireccion()==null) || 
             (this.direccion!=null &&
              this.direccion.equals(other.getDireccion()))) &&
            ((this.emails==null && other.getEmails()==null) || 
             (this.emails!=null &&
              java.util.Arrays.equals(this.emails, other.getEmails()))) &&
            ((this.faxes==null && other.getFaxes()==null) || 
             (this.faxes!=null &&
              java.util.Arrays.equals(this.faxes, other.getFaxes()))) &&
            ((this.localidad==null && other.getLocalidad()==null) || 
             (this.localidad!=null &&
              this.localidad.equals(other.getLocalidad()))) &&
            ((this.numeroLocal==null && other.getNumeroLocal()==null) || 
             (this.numeroLocal!=null &&
              this.numeroLocal.equals(other.getNumeroLocal()))) &&
            ((this.periodo==null && other.getPeriodo()==null) || 
             (this.periodo!=null &&
              this.periodo.equals(other.getPeriodo()))) &&
            ((this.telefonos==null && other.getTelefonos()==null) || 
             (this.telefonos!=null &&
              java.util.Arrays.equals(this.telefonos, other.getTelefonos()))) &&
            ((this.tipoEstablecimiento==null && other.getTipoEstablecimiento()==null) || 
             (this.tipoEstablecimiento!=null &&
              this.tipoEstablecimiento.equals(other.getTipoEstablecimiento())));
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
        if (getAmpliacionDomicilio() != null) {
            _hashCode += getAmpliacionDomicilio().hashCode();
        }
        if (getDepartamento() != null) {
            _hashCode += getDepartamento().hashCode();
        }
        if (getDireccion() != null) {
            _hashCode += getDireccion().hashCode();
        }
        if (getEmails() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEmails());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEmails(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFaxes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFaxes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFaxes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLocalidad() != null) {
            _hashCode += getLocalidad().hashCode();
        }
        if (getNumeroLocal() != null) {
            _hashCode += getNumeroLocal().hashCode();
        }
        if (getPeriodo() != null) {
            _hashCode += getPeriodo().hashCode();
        }
        if (getTelefonos() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTelefonos());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTelefonos(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTipoEstablecimiento() != null) {
            _hashCode += getTipoEstablecimiento().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LocalEmpresa.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/WsRegEmpresaV002/datatypes", "LocalEmpresa"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ampliacionDomicilio");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ampliacionDomicilio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/WsRegEmpresaV002/datatypes", "AmpliacionDomicilio"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("departamento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "departamento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/WsRegEmpresaV002/datatypes", "Departamento"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("direccion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "direccion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/WsRegEmpresaV002/datatypes", "Direccion"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emails");
        elemField.setXmlName(new javax.xml.namespace.QName("", "emails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/WsRegEmpresaV002/datatypes", "EMail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("faxes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "faxes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/WsRegEmpresaV002/datatypes", "Fax"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localidad");
        elemField.setXmlName(new javax.xml.namespace.QName("", "localidad"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/WsRegEmpresaV002/datatypes", "Localidad"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroLocal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numeroLocal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("periodo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "periodo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/WsRegEmpresaV002/datatypes", "ObjPeriodo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("telefonos");
        elemField.setXmlName(new javax.xml.namespace.QName("", "telefonos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/WsRegEmpresaV002/datatypes", "Telefono"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoEstablecimiento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipoEstablecimiento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/WsRegEmpresaV002/datatypes", "TipoEstablecimiento"));
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
