/**
 * Proveedor.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uy.gub.agesic.empresa.ws.ACCE_RUPE;

public class Proveedor  implements java.io.Serializable {
    private java.lang.Integer idProveedor;

    private uy.gub.agesic.empresa.ws.ACCE_RUPE.IdentificacionProveedor identificacionPrincipal;

    private java.lang.String denominacionSocial;

    private java.lang.String tipoOrganizacion;

    private java.lang.String nombreFantasia;

    private uy.gub.agesic.empresa.ws.ACCE_RUPE.IdentificacionProveedor[] otrasIdentificaciones;

    private java.lang.String domicilioFiscal;

    private java.lang.String codDeptoDomicilioFiscal;

    private java.lang.String nomLocalidadDomicilioFiscal;

    private uy.gub.agesic.empresa.ws.ACCE_RUPE.Domicilio domicilioNotificacion;

    private java.lang.String sitioWeb;

    private uy.gub.agesic.empresa.ws.ACCE_RUPE.EstadoProveedor estadoDelProveedor;

    private uy.gub.agesic.empresa.ws.ACCE_RUPE.Comunicacion[] comunicaciones;

    private java.lang.String correoElectronicoPrincipal;

    private java.lang.Integer version;

    private java.util.Calendar fechaVersion;

    private uy.gub.agesic.empresa.ws.ACCE_RUPE.Domicilio domicilioPrincipal;

    private java.lang.String datosRepresentacion;

    private uy.gub.agesic.empresa.ws.ACCE_RUPE.EstadoDato estadoNJ;

    public Proveedor() {
    }

    public Proveedor(
           java.lang.Integer idProveedor,
           uy.gub.agesic.empresa.ws.ACCE_RUPE.IdentificacionProveedor identificacionPrincipal,
           java.lang.String denominacionSocial,
           java.lang.String tipoOrganizacion,
           java.lang.String nombreFantasia,
           uy.gub.agesic.empresa.ws.ACCE_RUPE.IdentificacionProveedor[] otrasIdentificaciones,
           java.lang.String domicilioFiscal,
           java.lang.String codDeptoDomicilioFiscal,
           java.lang.String nomLocalidadDomicilioFiscal,
           uy.gub.agesic.empresa.ws.ACCE_RUPE.Domicilio domicilioNotificacion,
           java.lang.String sitioWeb,
           uy.gub.agesic.empresa.ws.ACCE_RUPE.EstadoProveedor estadoDelProveedor,
           uy.gub.agesic.empresa.ws.ACCE_RUPE.Comunicacion[] comunicaciones,
           java.lang.String correoElectronicoPrincipal,
           java.lang.Integer version,
           java.util.Calendar fechaVersion,
           uy.gub.agesic.empresa.ws.ACCE_RUPE.Domicilio domicilioPrincipal,
           java.lang.String datosRepresentacion,
           uy.gub.agesic.empresa.ws.ACCE_RUPE.EstadoDato estadoNJ) {
           this.idProveedor = idProveedor;
           this.identificacionPrincipal = identificacionPrincipal;
           this.denominacionSocial = denominacionSocial;
           this.tipoOrganizacion = tipoOrganizacion;
           this.nombreFantasia = nombreFantasia;
           this.otrasIdentificaciones = otrasIdentificaciones;
           this.domicilioFiscal = domicilioFiscal;
           this.codDeptoDomicilioFiscal = codDeptoDomicilioFiscal;
           this.nomLocalidadDomicilioFiscal = nomLocalidadDomicilioFiscal;
           this.domicilioNotificacion = domicilioNotificacion;
           this.sitioWeb = sitioWeb;
           this.estadoDelProveedor = estadoDelProveedor;
           this.comunicaciones = comunicaciones;
           this.correoElectronicoPrincipal = correoElectronicoPrincipal;
           this.version = version;
           this.fechaVersion = fechaVersion;
           this.domicilioPrincipal = domicilioPrincipal;
           this.datosRepresentacion = datosRepresentacion;
           this.estadoNJ = estadoNJ;
    }


    /**
     * Gets the idProveedor value for this Proveedor.
     * 
     * @return idProveedor
     */
    public java.lang.Integer getIdProveedor() {
        return idProveedor;
    }


    /**
     * Sets the idProveedor value for this Proveedor.
     * 
     * @param idProveedor
     */
    public void setIdProveedor(java.lang.Integer idProveedor) {
        this.idProveedor = idProveedor;
    }


    /**
     * Gets the identificacionPrincipal value for this Proveedor.
     * 
     * @return identificacionPrincipal
     */
    public uy.gub.agesic.empresa.ws.ACCE_RUPE.IdentificacionProveedor getIdentificacionPrincipal() {
        return identificacionPrincipal;
    }


    /**
     * Sets the identificacionPrincipal value for this Proveedor.
     * 
     * @param identificacionPrincipal
     */
    public void setIdentificacionPrincipal(uy.gub.agesic.empresa.ws.ACCE_RUPE.IdentificacionProveedor identificacionPrincipal) {
        this.identificacionPrincipal = identificacionPrincipal;
    }


    /**
     * Gets the denominacionSocial value for this Proveedor.
     * 
     * @return denominacionSocial
     */
    public java.lang.String getDenominacionSocial() {
        return denominacionSocial;
    }


    /**
     * Sets the denominacionSocial value for this Proveedor.
     * 
     * @param denominacionSocial
     */
    public void setDenominacionSocial(java.lang.String denominacionSocial) {
        this.denominacionSocial = denominacionSocial;
    }


    /**
     * Gets the tipoOrganizacion value for this Proveedor.
     * 
     * @return tipoOrganizacion
     */
    public java.lang.String getTipoOrganizacion() {
        return tipoOrganizacion;
    }


    /**
     * Sets the tipoOrganizacion value for this Proveedor.
     * 
     * @param tipoOrganizacion
     */
    public void setTipoOrganizacion(java.lang.String tipoOrganizacion) {
        this.tipoOrganizacion = tipoOrganizacion;
    }


    /**
     * Gets the nombreFantasia value for this Proveedor.
     * 
     * @return nombreFantasia
     */
    public java.lang.String getNombreFantasia() {
        return nombreFantasia;
    }


    /**
     * Sets the nombreFantasia value for this Proveedor.
     * 
     * @param nombreFantasia
     */
    public void setNombreFantasia(java.lang.String nombreFantasia) {
        this.nombreFantasia = nombreFantasia;
    }


    /**
     * Gets the otrasIdentificaciones value for this Proveedor.
     * 
     * @return otrasIdentificaciones
     */
    public uy.gub.agesic.empresa.ws.ACCE_RUPE.IdentificacionProveedor[] getOtrasIdentificaciones() {
        return otrasIdentificaciones;
    }


    /**
     * Sets the otrasIdentificaciones value for this Proveedor.
     * 
     * @param otrasIdentificaciones
     */
    public void setOtrasIdentificaciones(uy.gub.agesic.empresa.ws.ACCE_RUPE.IdentificacionProveedor[] otrasIdentificaciones) {
        this.otrasIdentificaciones = otrasIdentificaciones;
    }


    /**
     * Gets the domicilioFiscal value for this Proveedor.
     * 
     * @return domicilioFiscal
     */
    public java.lang.String getDomicilioFiscal() {
        return domicilioFiscal;
    }


    /**
     * Sets the domicilioFiscal value for this Proveedor.
     * 
     * @param domicilioFiscal
     */
    public void setDomicilioFiscal(java.lang.String domicilioFiscal) {
        this.domicilioFiscal = domicilioFiscal;
    }


    /**
     * Gets the codDeptoDomicilioFiscal value for this Proveedor.
     * 
     * @return codDeptoDomicilioFiscal
     */
    public java.lang.String getCodDeptoDomicilioFiscal() {
        return codDeptoDomicilioFiscal;
    }


    /**
     * Sets the codDeptoDomicilioFiscal value for this Proveedor.
     * 
     * @param codDeptoDomicilioFiscal
     */
    public void setCodDeptoDomicilioFiscal(java.lang.String codDeptoDomicilioFiscal) {
        this.codDeptoDomicilioFiscal = codDeptoDomicilioFiscal;
    }


    /**
     * Gets the nomLocalidadDomicilioFiscal value for this Proveedor.
     * 
     * @return nomLocalidadDomicilioFiscal
     */
    public java.lang.String getNomLocalidadDomicilioFiscal() {
        return nomLocalidadDomicilioFiscal;
    }


    /**
     * Sets the nomLocalidadDomicilioFiscal value for this Proveedor.
     * 
     * @param nomLocalidadDomicilioFiscal
     */
    public void setNomLocalidadDomicilioFiscal(java.lang.String nomLocalidadDomicilioFiscal) {
        this.nomLocalidadDomicilioFiscal = nomLocalidadDomicilioFiscal;
    }


    /**
     * Gets the domicilioNotificacion value for this Proveedor.
     * 
     * @return domicilioNotificacion
     */
    public uy.gub.agesic.empresa.ws.ACCE_RUPE.Domicilio getDomicilioNotificacion() {
        return domicilioNotificacion;
    }


    /**
     * Sets the domicilioNotificacion value for this Proveedor.
     * 
     * @param domicilioNotificacion
     */
    public void setDomicilioNotificacion(uy.gub.agesic.empresa.ws.ACCE_RUPE.Domicilio domicilioNotificacion) {
        this.domicilioNotificacion = domicilioNotificacion;
    }


    /**
     * Gets the sitioWeb value for this Proveedor.
     * 
     * @return sitioWeb
     */
    public java.lang.String getSitioWeb() {
        return sitioWeb;
    }


    /**
     * Sets the sitioWeb value for this Proveedor.
     * 
     * @param sitioWeb
     */
    public void setSitioWeb(java.lang.String sitioWeb) {
        this.sitioWeb = sitioWeb;
    }


    /**
     * Gets the estadoDelProveedor value for this Proveedor.
     * 
     * @return estadoDelProveedor
     */
    public uy.gub.agesic.empresa.ws.ACCE_RUPE.EstadoProveedor getEstadoDelProveedor() {
        return estadoDelProveedor;
    }


    /**
     * Sets the estadoDelProveedor value for this Proveedor.
     * 
     * @param estadoDelProveedor
     */
    public void setEstadoDelProveedor(uy.gub.agesic.empresa.ws.ACCE_RUPE.EstadoProveedor estadoDelProveedor) {
        this.estadoDelProveedor = estadoDelProveedor;
    }


    /**
     * Gets the comunicaciones value for this Proveedor.
     * 
     * @return comunicaciones
     */
    public uy.gub.agesic.empresa.ws.ACCE_RUPE.Comunicacion[] getComunicaciones() {
        return comunicaciones;
    }


    /**
     * Sets the comunicaciones value for this Proveedor.
     * 
     * @param comunicaciones
     */
    public void setComunicaciones(uy.gub.agesic.empresa.ws.ACCE_RUPE.Comunicacion[] comunicaciones) {
        this.comunicaciones = comunicaciones;
    }

    public uy.gub.agesic.empresa.ws.ACCE_RUPE.Comunicacion getComunicaciones(int i) {
        return this.comunicaciones[i];
    }

    public void setComunicaciones(int i, uy.gub.agesic.empresa.ws.ACCE_RUPE.Comunicacion _value) {
        this.comunicaciones[i] = _value;
    }


    /**
     * Gets the correoElectronicoPrincipal value for this Proveedor.
     * 
     * @return correoElectronicoPrincipal
     */
    public java.lang.String getCorreoElectronicoPrincipal() {
        return correoElectronicoPrincipal;
    }


    /**
     * Sets the correoElectronicoPrincipal value for this Proveedor.
     * 
     * @param correoElectronicoPrincipal
     */
    public void setCorreoElectronicoPrincipal(java.lang.String correoElectronicoPrincipal) {
        this.correoElectronicoPrincipal = correoElectronicoPrincipal;
    }


    /**
     * Gets the version value for this Proveedor.
     * 
     * @return version
     */
    public java.lang.Integer getVersion() {
        return version;
    }


    /**
     * Sets the version value for this Proveedor.
     * 
     * @param version
     */
    public void setVersion(java.lang.Integer version) {
        this.version = version;
    }


    /**
     * Gets the fechaVersion value for this Proveedor.
     * 
     * @return fechaVersion
     */
    public java.util.Calendar getFechaVersion() {
        return fechaVersion;
    }


    /**
     * Sets the fechaVersion value for this Proveedor.
     * 
     * @param fechaVersion
     */
    public void setFechaVersion(java.util.Calendar fechaVersion) {
        this.fechaVersion = fechaVersion;
    }


    /**
     * Gets the domicilioPrincipal value for this Proveedor.
     * 
     * @return domicilioPrincipal
     */
    public uy.gub.agesic.empresa.ws.ACCE_RUPE.Domicilio getDomicilioPrincipal() {
        return domicilioPrincipal;
    }


    /**
     * Sets the domicilioPrincipal value for this Proveedor.
     * 
     * @param domicilioPrincipal
     */
    public void setDomicilioPrincipal(uy.gub.agesic.empresa.ws.ACCE_RUPE.Domicilio domicilioPrincipal) {
        this.domicilioPrincipal = domicilioPrincipal;
    }


    /**
     * Gets the datosRepresentacion value for this Proveedor.
     * 
     * @return datosRepresentacion
     */
    public java.lang.String getDatosRepresentacion() {
        return datosRepresentacion;
    }


    /**
     * Sets the datosRepresentacion value for this Proveedor.
     * 
     * @param datosRepresentacion
     */
    public void setDatosRepresentacion(java.lang.String datosRepresentacion) {
        this.datosRepresentacion = datosRepresentacion;
    }


    /**
     * Gets the estadoNJ value for this Proveedor.
     * 
     * @return estadoNJ
     */
    public uy.gub.agesic.empresa.ws.ACCE_RUPE.EstadoDato getEstadoNJ() {
        return estadoNJ;
    }


    /**
     * Sets the estadoNJ value for this Proveedor.
     * 
     * @param estadoNJ
     */
    public void setEstadoNJ(uy.gub.agesic.empresa.ws.ACCE_RUPE.EstadoDato estadoNJ) {
        this.estadoNJ = estadoNJ;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Proveedor)) return false;
        Proveedor other = (Proveedor) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.idProveedor==null && other.getIdProveedor()==null) || 
             (this.idProveedor!=null &&
              this.idProveedor.equals(other.getIdProveedor()))) &&
            ((this.identificacionPrincipal==null && other.getIdentificacionPrincipal()==null) || 
             (this.identificacionPrincipal!=null &&
              this.identificacionPrincipal.equals(other.getIdentificacionPrincipal()))) &&
            ((this.denominacionSocial==null && other.getDenominacionSocial()==null) || 
             (this.denominacionSocial!=null &&
              this.denominacionSocial.equals(other.getDenominacionSocial()))) &&
            ((this.tipoOrganizacion==null && other.getTipoOrganizacion()==null) || 
             (this.tipoOrganizacion!=null &&
              this.tipoOrganizacion.equals(other.getTipoOrganizacion()))) &&
            ((this.nombreFantasia==null && other.getNombreFantasia()==null) || 
             (this.nombreFantasia!=null &&
              this.nombreFantasia.equals(other.getNombreFantasia()))) &&
            ((this.otrasIdentificaciones==null && other.getOtrasIdentificaciones()==null) || 
             (this.otrasIdentificaciones!=null &&
              java.util.Arrays.equals(this.otrasIdentificaciones, other.getOtrasIdentificaciones()))) &&
            ((this.domicilioFiscal==null && other.getDomicilioFiscal()==null) || 
             (this.domicilioFiscal!=null &&
              this.domicilioFiscal.equals(other.getDomicilioFiscal()))) &&
            ((this.codDeptoDomicilioFiscal==null && other.getCodDeptoDomicilioFiscal()==null) || 
             (this.codDeptoDomicilioFiscal!=null &&
              this.codDeptoDomicilioFiscal.equals(other.getCodDeptoDomicilioFiscal()))) &&
            ((this.nomLocalidadDomicilioFiscal==null && other.getNomLocalidadDomicilioFiscal()==null) || 
             (this.nomLocalidadDomicilioFiscal!=null &&
              this.nomLocalidadDomicilioFiscal.equals(other.getNomLocalidadDomicilioFiscal()))) &&
            ((this.domicilioNotificacion==null && other.getDomicilioNotificacion()==null) || 
             (this.domicilioNotificacion!=null &&
              this.domicilioNotificacion.equals(other.getDomicilioNotificacion()))) &&
            ((this.sitioWeb==null && other.getSitioWeb()==null) || 
             (this.sitioWeb!=null &&
              this.sitioWeb.equals(other.getSitioWeb()))) &&
            ((this.estadoDelProveedor==null && other.getEstadoDelProveedor()==null) || 
             (this.estadoDelProveedor!=null &&
              this.estadoDelProveedor.equals(other.getEstadoDelProveedor()))) &&
            ((this.comunicaciones==null && other.getComunicaciones()==null) || 
             (this.comunicaciones!=null &&
              java.util.Arrays.equals(this.comunicaciones, other.getComunicaciones()))) &&
            ((this.correoElectronicoPrincipal==null && other.getCorreoElectronicoPrincipal()==null) || 
             (this.correoElectronicoPrincipal!=null &&
              this.correoElectronicoPrincipal.equals(other.getCorreoElectronicoPrincipal()))) &&
            ((this.version==null && other.getVersion()==null) || 
             (this.version!=null &&
              this.version.equals(other.getVersion()))) &&
            ((this.fechaVersion==null && other.getFechaVersion()==null) || 
             (this.fechaVersion!=null &&
              this.fechaVersion.equals(other.getFechaVersion()))) &&
            ((this.domicilioPrincipal==null && other.getDomicilioPrincipal()==null) || 
             (this.domicilioPrincipal!=null &&
              this.domicilioPrincipal.equals(other.getDomicilioPrincipal()))) &&
            ((this.datosRepresentacion==null && other.getDatosRepresentacion()==null) || 
             (this.datosRepresentacion!=null &&
              this.datosRepresentacion.equals(other.getDatosRepresentacion()))) &&
            ((this.estadoNJ==null && other.getEstadoNJ()==null) || 
             (this.estadoNJ!=null &&
              this.estadoNJ.equals(other.getEstadoNJ())));
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
        if (getIdProveedor() != null) {
            _hashCode += getIdProveedor().hashCode();
        }
        if (getIdentificacionPrincipal() != null) {
            _hashCode += getIdentificacionPrincipal().hashCode();
        }
        if (getDenominacionSocial() != null) {
            _hashCode += getDenominacionSocial().hashCode();
        }
        if (getTipoOrganizacion() != null) {
            _hashCode += getTipoOrganizacion().hashCode();
        }
        if (getNombreFantasia() != null) {
            _hashCode += getNombreFantasia().hashCode();
        }
        if (getOtrasIdentificaciones() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOtrasIdentificaciones());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOtrasIdentificaciones(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDomicilioFiscal() != null) {
            _hashCode += getDomicilioFiscal().hashCode();
        }
        if (getCodDeptoDomicilioFiscal() != null) {
            _hashCode += getCodDeptoDomicilioFiscal().hashCode();
        }
        if (getNomLocalidadDomicilioFiscal() != null) {
            _hashCode += getNomLocalidadDomicilioFiscal().hashCode();
        }
        if (getDomicilioNotificacion() != null) {
            _hashCode += getDomicilioNotificacion().hashCode();
        }
        if (getSitioWeb() != null) {
            _hashCode += getSitioWeb().hashCode();
        }
        if (getEstadoDelProveedor() != null) {
            _hashCode += getEstadoDelProveedor().hashCode();
        }
        if (getComunicaciones() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getComunicaciones());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getComunicaciones(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCorreoElectronicoPrincipal() != null) {
            _hashCode += getCorreoElectronicoPrincipal().hashCode();
        }
        if (getVersion() != null) {
            _hashCode += getVersion().hashCode();
        }
        if (getFechaVersion() != null) {
            _hashCode += getFechaVersion().hashCode();
        }
        if (getDomicilioPrincipal() != null) {
            _hashCode += getDomicilioPrincipal().hashCode();
        }
        if (getDatosRepresentacion() != null) {
            _hashCode += getDatosRepresentacion().hashCode();
        }
        if (getEstadoNJ() != null) {
            _hashCode += getEstadoNJ().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Proveedor.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "proveedor"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idProveedor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idProveedor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identificacionPrincipal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "identificacionPrincipal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "identificacionProveedor"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("denominacionSocial");
        elemField.setXmlName(new javax.xml.namespace.QName("", "denominacionSocial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoOrganizacion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipoOrganizacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombreFantasia");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nombreFantasia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("otrasIdentificaciones");
        elemField.setXmlName(new javax.xml.namespace.QName("", "otrasIdentificaciones"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "identificacionProveedor"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "identificaciones"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("domicilioFiscal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "domicilioFiscal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codDeptoDomicilioFiscal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codDeptoDomicilioFiscal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomLocalidadDomicilioFiscal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nomLocalidadDomicilioFiscal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("domicilioNotificacion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "domicilioNotificacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "domicilio"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sitioWeb");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sitioWeb"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estadoDelProveedor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "estadoDelProveedor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "estadoProveedor"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comunicaciones");
        elemField.setXmlName(new javax.xml.namespace.QName("", "comunicaciones"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "comunicacion"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("correoElectronicoPrincipal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "correoElectronicoPrincipal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("version");
        elemField.setXmlName(new javax.xml.namespace.QName("", "version"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fechaVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("domicilioPrincipal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "domicilioPrincipal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "domicilio"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datosRepresentacion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "datosRepresentacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estadoNJ");
        elemField.setXmlName(new javax.xml.namespace.QName("", "estadoNJ"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "estadoDato"));
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
