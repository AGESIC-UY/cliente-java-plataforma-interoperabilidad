/**
 * CuentaBancaria.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uy.gub.agesic.empresa.ws.ACCE_RUPE;

public class CuentaBancaria  implements java.io.Serializable {
    private java.lang.Integer idCuentaBancaria;

    private java.lang.String nombreBanco;

    private java.lang.String nombreSucursal;

    private java.lang.String codigoSWIFT;

    private java.lang.String codigoABA;

    private java.lang.String codigoPais;

    private java.lang.String nombreTitularDeLaCuenta;

    private java.lang.String moneda;

    private java.lang.String tipoCuenta;

    private java.lang.String comentariosAdicionales;

    private java.lang.Integer version;

    private java.util.Calendar fechaVersion;

    private java.lang.String codigoBanco;

    private java.lang.String codigoSucursal;

    private java.lang.String nombreBancoIntermediario;

    private java.lang.String codigoPaisBancoIntermediario;

    private java.lang.String codigoSWIFTBancoIntermediario;

    private java.lang.String ciudadBancoIntermediario;

    private java.lang.String numeroCuenta;

    private java.lang.String direccionBanco;

    private uy.gub.agesic.empresa.ws.ACCE_RUPE.Alcance[] alcance;

    private java.lang.String codigoIBAN;

    private java.lang.String ciudadBanco;

    private java.lang.String textoValidacion;

    public CuentaBancaria() {
    }

    public CuentaBancaria(
           java.lang.Integer idCuentaBancaria,
           java.lang.String nombreBanco,
           java.lang.String nombreSucursal,
           java.lang.String codigoSWIFT,
           java.lang.String codigoABA,
           java.lang.String codigoPais,
           java.lang.String nombreTitularDeLaCuenta,
           java.lang.String moneda,
           java.lang.String tipoCuenta,
           java.lang.String comentariosAdicionales,
           java.lang.Integer version,
           java.util.Calendar fechaVersion,
           java.lang.String codigoBanco,
           java.lang.String codigoSucursal,
           java.lang.String nombreBancoIntermediario,
           java.lang.String codigoPaisBancoIntermediario,
           java.lang.String codigoSWIFTBancoIntermediario,
           java.lang.String ciudadBancoIntermediario,
           java.lang.String numeroCuenta,
           java.lang.String direccionBanco,
           uy.gub.agesic.empresa.ws.ACCE_RUPE.Alcance[] alcance,
           java.lang.String codigoIBAN,
           java.lang.String ciudadBanco,
           java.lang.String textoValidacion) {
           this.idCuentaBancaria = idCuentaBancaria;
           this.nombreBanco = nombreBanco;
           this.nombreSucursal = nombreSucursal;
           this.codigoSWIFT = codigoSWIFT;
           this.codigoABA = codigoABA;
           this.codigoPais = codigoPais;
           this.nombreTitularDeLaCuenta = nombreTitularDeLaCuenta;
           this.moneda = moneda;
           this.tipoCuenta = tipoCuenta;
           this.comentariosAdicionales = comentariosAdicionales;
           this.version = version;
           this.fechaVersion = fechaVersion;
           this.codigoBanco = codigoBanco;
           this.codigoSucursal = codigoSucursal;
           this.nombreBancoIntermediario = nombreBancoIntermediario;
           this.codigoPaisBancoIntermediario = codigoPaisBancoIntermediario;
           this.codigoSWIFTBancoIntermediario = codigoSWIFTBancoIntermediario;
           this.ciudadBancoIntermediario = ciudadBancoIntermediario;
           this.numeroCuenta = numeroCuenta;
           this.direccionBanco = direccionBanco;
           this.alcance = alcance;
           this.codigoIBAN = codigoIBAN;
           this.ciudadBanco = ciudadBanco;
           this.textoValidacion = textoValidacion;
    }


    /**
     * Gets the idCuentaBancaria value for this CuentaBancaria.
     * 
     * @return idCuentaBancaria
     */
    public java.lang.Integer getIdCuentaBancaria() {
        return idCuentaBancaria;
    }


    /**
     * Sets the idCuentaBancaria value for this CuentaBancaria.
     * 
     * @param idCuentaBancaria
     */
    public void setIdCuentaBancaria(java.lang.Integer idCuentaBancaria) {
        this.idCuentaBancaria = idCuentaBancaria;
    }


    /**
     * Gets the nombreBanco value for this CuentaBancaria.
     * 
     * @return nombreBanco
     */
    public java.lang.String getNombreBanco() {
        return nombreBanco;
    }


    /**
     * Sets the nombreBanco value for this CuentaBancaria.
     * 
     * @param nombreBanco
     */
    public void setNombreBanco(java.lang.String nombreBanco) {
        this.nombreBanco = nombreBanco;
    }


    /**
     * Gets the nombreSucursal value for this CuentaBancaria.
     * 
     * @return nombreSucursal
     */
    public java.lang.String getNombreSucursal() {
        return nombreSucursal;
    }


    /**
     * Sets the nombreSucursal value for this CuentaBancaria.
     * 
     * @param nombreSucursal
     */
    public void setNombreSucursal(java.lang.String nombreSucursal) {
        this.nombreSucursal = nombreSucursal;
    }


    /**
     * Gets the codigoSWIFT value for this CuentaBancaria.
     * 
     * @return codigoSWIFT
     */
    public java.lang.String getCodigoSWIFT() {
        return codigoSWIFT;
    }


    /**
     * Sets the codigoSWIFT value for this CuentaBancaria.
     * 
     * @param codigoSWIFT
     */
    public void setCodigoSWIFT(java.lang.String codigoSWIFT) {
        this.codigoSWIFT = codigoSWIFT;
    }


    /**
     * Gets the codigoABA value for this CuentaBancaria.
     * 
     * @return codigoABA
     */
    public java.lang.String getCodigoABA() {
        return codigoABA;
    }


    /**
     * Sets the codigoABA value for this CuentaBancaria.
     * 
     * @param codigoABA
     */
    public void setCodigoABA(java.lang.String codigoABA) {
        this.codigoABA = codigoABA;
    }


    /**
     * Gets the codigoPais value for this CuentaBancaria.
     * 
     * @return codigoPais
     */
    public java.lang.String getCodigoPais() {
        return codigoPais;
    }


    /**
     * Sets the codigoPais value for this CuentaBancaria.
     * 
     * @param codigoPais
     */
    public void setCodigoPais(java.lang.String codigoPais) {
        this.codigoPais = codigoPais;
    }


    /**
     * Gets the nombreTitularDeLaCuenta value for this CuentaBancaria.
     * 
     * @return nombreTitularDeLaCuenta
     */
    public java.lang.String getNombreTitularDeLaCuenta() {
        return nombreTitularDeLaCuenta;
    }


    /**
     * Sets the nombreTitularDeLaCuenta value for this CuentaBancaria.
     * 
     * @param nombreTitularDeLaCuenta
     */
    public void setNombreTitularDeLaCuenta(java.lang.String nombreTitularDeLaCuenta) {
        this.nombreTitularDeLaCuenta = nombreTitularDeLaCuenta;
    }


    /**
     * Gets the moneda value for this CuentaBancaria.
     * 
     * @return moneda
     */
    public java.lang.String getMoneda() {
        return moneda;
    }


    /**
     * Sets the moneda value for this CuentaBancaria.
     * 
     * @param moneda
     */
    public void setMoneda(java.lang.String moneda) {
        this.moneda = moneda;
    }


    /**
     * Gets the tipoCuenta value for this CuentaBancaria.
     * 
     * @return tipoCuenta
     */
    public java.lang.String getTipoCuenta() {
        return tipoCuenta;
    }


    /**
     * Sets the tipoCuenta value for this CuentaBancaria.
     * 
     * @param tipoCuenta
     */
    public void setTipoCuenta(java.lang.String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }


    /**
     * Gets the comentariosAdicionales value for this CuentaBancaria.
     * 
     * @return comentariosAdicionales
     */
    public java.lang.String getComentariosAdicionales() {
        return comentariosAdicionales;
    }


    /**
     * Sets the comentariosAdicionales value for this CuentaBancaria.
     * 
     * @param comentariosAdicionales
     */
    public void setComentariosAdicionales(java.lang.String comentariosAdicionales) {
        this.comentariosAdicionales = comentariosAdicionales;
    }


    /**
     * Gets the version value for this CuentaBancaria.
     * 
     * @return version
     */
    public java.lang.Integer getVersion() {
        return version;
    }


    /**
     * Sets the version value for this CuentaBancaria.
     * 
     * @param version
     */
    public void setVersion(java.lang.Integer version) {
        this.version = version;
    }


    /**
     * Gets the fechaVersion value for this CuentaBancaria.
     * 
     * @return fechaVersion
     */
    public java.util.Calendar getFechaVersion() {
        return fechaVersion;
    }


    /**
     * Sets the fechaVersion value for this CuentaBancaria.
     * 
     * @param fechaVersion
     */
    public void setFechaVersion(java.util.Calendar fechaVersion) {
        this.fechaVersion = fechaVersion;
    }


    /**
     * Gets the codigoBanco value for this CuentaBancaria.
     * 
     * @return codigoBanco
     */
    public java.lang.String getCodigoBanco() {
        return codigoBanco;
    }


    /**
     * Sets the codigoBanco value for this CuentaBancaria.
     * 
     * @param codigoBanco
     */
    public void setCodigoBanco(java.lang.String codigoBanco) {
        this.codigoBanco = codigoBanco;
    }


    /**
     * Gets the codigoSucursal value for this CuentaBancaria.
     * 
     * @return codigoSucursal
     */
    public java.lang.String getCodigoSucursal() {
        return codigoSucursal;
    }


    /**
     * Sets the codigoSucursal value for this CuentaBancaria.
     * 
     * @param codigoSucursal
     */
    public void setCodigoSucursal(java.lang.String codigoSucursal) {
        this.codigoSucursal = codigoSucursal;
    }


    /**
     * Gets the nombreBancoIntermediario value for this CuentaBancaria.
     * 
     * @return nombreBancoIntermediario
     */
    public java.lang.String getNombreBancoIntermediario() {
        return nombreBancoIntermediario;
    }


    /**
     * Sets the nombreBancoIntermediario value for this CuentaBancaria.
     * 
     * @param nombreBancoIntermediario
     */
    public void setNombreBancoIntermediario(java.lang.String nombreBancoIntermediario) {
        this.nombreBancoIntermediario = nombreBancoIntermediario;
    }


    /**
     * Gets the codigoPaisBancoIntermediario value for this CuentaBancaria.
     * 
     * @return codigoPaisBancoIntermediario
     */
    public java.lang.String getCodigoPaisBancoIntermediario() {
        return codigoPaisBancoIntermediario;
    }


    /**
     * Sets the codigoPaisBancoIntermediario value for this CuentaBancaria.
     * 
     * @param codigoPaisBancoIntermediario
     */
    public void setCodigoPaisBancoIntermediario(java.lang.String codigoPaisBancoIntermediario) {
        this.codigoPaisBancoIntermediario = codigoPaisBancoIntermediario;
    }


    /**
     * Gets the codigoSWIFTBancoIntermediario value for this CuentaBancaria.
     * 
     * @return codigoSWIFTBancoIntermediario
     */
    public java.lang.String getCodigoSWIFTBancoIntermediario() {
        return codigoSWIFTBancoIntermediario;
    }


    /**
     * Sets the codigoSWIFTBancoIntermediario value for this CuentaBancaria.
     * 
     * @param codigoSWIFTBancoIntermediario
     */
    public void setCodigoSWIFTBancoIntermediario(java.lang.String codigoSWIFTBancoIntermediario) {
        this.codigoSWIFTBancoIntermediario = codigoSWIFTBancoIntermediario;
    }


    /**
     * Gets the ciudadBancoIntermediario value for this CuentaBancaria.
     * 
     * @return ciudadBancoIntermediario
     */
    public java.lang.String getCiudadBancoIntermediario() {
        return ciudadBancoIntermediario;
    }


    /**
     * Sets the ciudadBancoIntermediario value for this CuentaBancaria.
     * 
     * @param ciudadBancoIntermediario
     */
    public void setCiudadBancoIntermediario(java.lang.String ciudadBancoIntermediario) {
        this.ciudadBancoIntermediario = ciudadBancoIntermediario;
    }


    /**
     * Gets the numeroCuenta value for this CuentaBancaria.
     * 
     * @return numeroCuenta
     */
    public java.lang.String getNumeroCuenta() {
        return numeroCuenta;
    }


    /**
     * Sets the numeroCuenta value for this CuentaBancaria.
     * 
     * @param numeroCuenta
     */
    public void setNumeroCuenta(java.lang.String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }


    /**
     * Gets the direccionBanco value for this CuentaBancaria.
     * 
     * @return direccionBanco
     */
    public java.lang.String getDireccionBanco() {
        return direccionBanco;
    }


    /**
     * Sets the direccionBanco value for this CuentaBancaria.
     * 
     * @param direccionBanco
     */
    public void setDireccionBanco(java.lang.String direccionBanco) {
        this.direccionBanco = direccionBanco;
    }


    /**
     * Gets the alcance value for this CuentaBancaria.
     * 
     * @return alcance
     */
    public uy.gub.agesic.empresa.ws.ACCE_RUPE.Alcance[] getAlcance() {
        return alcance;
    }


    /**
     * Sets the alcance value for this CuentaBancaria.
     * 
     * @param alcance
     */
    public void setAlcance(uy.gub.agesic.empresa.ws.ACCE_RUPE.Alcance[] alcance) {
        this.alcance = alcance;
    }

    public uy.gub.agesic.empresa.ws.ACCE_RUPE.Alcance getAlcance(int i) {
        return this.alcance[i];
    }

    public void setAlcance(int i, uy.gub.agesic.empresa.ws.ACCE_RUPE.Alcance _value) {
        this.alcance[i] = _value;
    }


    /**
     * Gets the codigoIBAN value for this CuentaBancaria.
     * 
     * @return codigoIBAN
     */
    public java.lang.String getCodigoIBAN() {
        return codigoIBAN;
    }


    /**
     * Sets the codigoIBAN value for this CuentaBancaria.
     * 
     * @param codigoIBAN
     */
    public void setCodigoIBAN(java.lang.String codigoIBAN) {
        this.codigoIBAN = codigoIBAN;
    }


    /**
     * Gets the ciudadBanco value for this CuentaBancaria.
     * 
     * @return ciudadBanco
     */
    public java.lang.String getCiudadBanco() {
        return ciudadBanco;
    }


    /**
     * Sets the ciudadBanco value for this CuentaBancaria.
     * 
     * @param ciudadBanco
     */
    public void setCiudadBanco(java.lang.String ciudadBanco) {
        this.ciudadBanco = ciudadBanco;
    }


    /**
     * Gets the textoValidacion value for this CuentaBancaria.
     * 
     * @return textoValidacion
     */
    public java.lang.String getTextoValidacion() {
        return textoValidacion;
    }


    /**
     * Sets the textoValidacion value for this CuentaBancaria.
     * 
     * @param textoValidacion
     */
    public void setTextoValidacion(java.lang.String textoValidacion) {
        this.textoValidacion = textoValidacion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CuentaBancaria)) return false;
        CuentaBancaria other = (CuentaBancaria) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.idCuentaBancaria==null && other.getIdCuentaBancaria()==null) || 
             (this.idCuentaBancaria!=null &&
              this.idCuentaBancaria.equals(other.getIdCuentaBancaria()))) &&
            ((this.nombreBanco==null && other.getNombreBanco()==null) || 
             (this.nombreBanco!=null &&
              this.nombreBanco.equals(other.getNombreBanco()))) &&
            ((this.nombreSucursal==null && other.getNombreSucursal()==null) || 
             (this.nombreSucursal!=null &&
              this.nombreSucursal.equals(other.getNombreSucursal()))) &&
            ((this.codigoSWIFT==null && other.getCodigoSWIFT()==null) || 
             (this.codigoSWIFT!=null &&
              this.codigoSWIFT.equals(other.getCodigoSWIFT()))) &&
            ((this.codigoABA==null && other.getCodigoABA()==null) || 
             (this.codigoABA!=null &&
              this.codigoABA.equals(other.getCodigoABA()))) &&
            ((this.codigoPais==null && other.getCodigoPais()==null) || 
             (this.codigoPais!=null &&
              this.codigoPais.equals(other.getCodigoPais()))) &&
            ((this.nombreTitularDeLaCuenta==null && other.getNombreTitularDeLaCuenta()==null) || 
             (this.nombreTitularDeLaCuenta!=null &&
              this.nombreTitularDeLaCuenta.equals(other.getNombreTitularDeLaCuenta()))) &&
            ((this.moneda==null && other.getMoneda()==null) || 
             (this.moneda!=null &&
              this.moneda.equals(other.getMoneda()))) &&
            ((this.tipoCuenta==null && other.getTipoCuenta()==null) || 
             (this.tipoCuenta!=null &&
              this.tipoCuenta.equals(other.getTipoCuenta()))) &&
            ((this.comentariosAdicionales==null && other.getComentariosAdicionales()==null) || 
             (this.comentariosAdicionales!=null &&
              this.comentariosAdicionales.equals(other.getComentariosAdicionales()))) &&
            ((this.version==null && other.getVersion()==null) || 
             (this.version!=null &&
              this.version.equals(other.getVersion()))) &&
            ((this.fechaVersion==null && other.getFechaVersion()==null) || 
             (this.fechaVersion!=null &&
              this.fechaVersion.equals(other.getFechaVersion()))) &&
            ((this.codigoBanco==null && other.getCodigoBanco()==null) || 
             (this.codigoBanco!=null &&
              this.codigoBanco.equals(other.getCodigoBanco()))) &&
            ((this.codigoSucursal==null && other.getCodigoSucursal()==null) || 
             (this.codigoSucursal!=null &&
              this.codigoSucursal.equals(other.getCodigoSucursal()))) &&
            ((this.nombreBancoIntermediario==null && other.getNombreBancoIntermediario()==null) || 
             (this.nombreBancoIntermediario!=null &&
              this.nombreBancoIntermediario.equals(other.getNombreBancoIntermediario()))) &&
            ((this.codigoPaisBancoIntermediario==null && other.getCodigoPaisBancoIntermediario()==null) || 
             (this.codigoPaisBancoIntermediario!=null &&
              this.codigoPaisBancoIntermediario.equals(other.getCodigoPaisBancoIntermediario()))) &&
            ((this.codigoSWIFTBancoIntermediario==null && other.getCodigoSWIFTBancoIntermediario()==null) || 
             (this.codigoSWIFTBancoIntermediario!=null &&
              this.codigoSWIFTBancoIntermediario.equals(other.getCodigoSWIFTBancoIntermediario()))) &&
            ((this.ciudadBancoIntermediario==null && other.getCiudadBancoIntermediario()==null) || 
             (this.ciudadBancoIntermediario!=null &&
              this.ciudadBancoIntermediario.equals(other.getCiudadBancoIntermediario()))) &&
            ((this.numeroCuenta==null && other.getNumeroCuenta()==null) || 
             (this.numeroCuenta!=null &&
              this.numeroCuenta.equals(other.getNumeroCuenta()))) &&
            ((this.direccionBanco==null && other.getDireccionBanco()==null) || 
             (this.direccionBanco!=null &&
              this.direccionBanco.equals(other.getDireccionBanco()))) &&
            ((this.alcance==null && other.getAlcance()==null) || 
             (this.alcance!=null &&
              java.util.Arrays.equals(this.alcance, other.getAlcance()))) &&
            ((this.codigoIBAN==null && other.getCodigoIBAN()==null) || 
             (this.codigoIBAN!=null &&
              this.codigoIBAN.equals(other.getCodigoIBAN()))) &&
            ((this.ciudadBanco==null && other.getCiudadBanco()==null) || 
             (this.ciudadBanco!=null &&
              this.ciudadBanco.equals(other.getCiudadBanco()))) &&
            ((this.textoValidacion==null && other.getTextoValidacion()==null) || 
             (this.textoValidacion!=null &&
              this.textoValidacion.equals(other.getTextoValidacion())));
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
        if (getIdCuentaBancaria() != null) {
            _hashCode += getIdCuentaBancaria().hashCode();
        }
        if (getNombreBanco() != null) {
            _hashCode += getNombreBanco().hashCode();
        }
        if (getNombreSucursal() != null) {
            _hashCode += getNombreSucursal().hashCode();
        }
        if (getCodigoSWIFT() != null) {
            _hashCode += getCodigoSWIFT().hashCode();
        }
        if (getCodigoABA() != null) {
            _hashCode += getCodigoABA().hashCode();
        }
        if (getCodigoPais() != null) {
            _hashCode += getCodigoPais().hashCode();
        }
        if (getNombreTitularDeLaCuenta() != null) {
            _hashCode += getNombreTitularDeLaCuenta().hashCode();
        }
        if (getMoneda() != null) {
            _hashCode += getMoneda().hashCode();
        }
        if (getTipoCuenta() != null) {
            _hashCode += getTipoCuenta().hashCode();
        }
        if (getComentariosAdicionales() != null) {
            _hashCode += getComentariosAdicionales().hashCode();
        }
        if (getVersion() != null) {
            _hashCode += getVersion().hashCode();
        }
        if (getFechaVersion() != null) {
            _hashCode += getFechaVersion().hashCode();
        }
        if (getCodigoBanco() != null) {
            _hashCode += getCodigoBanco().hashCode();
        }
        if (getCodigoSucursal() != null) {
            _hashCode += getCodigoSucursal().hashCode();
        }
        if (getNombreBancoIntermediario() != null) {
            _hashCode += getNombreBancoIntermediario().hashCode();
        }
        if (getCodigoPaisBancoIntermediario() != null) {
            _hashCode += getCodigoPaisBancoIntermediario().hashCode();
        }
        if (getCodigoSWIFTBancoIntermediario() != null) {
            _hashCode += getCodigoSWIFTBancoIntermediario().hashCode();
        }
        if (getCiudadBancoIntermediario() != null) {
            _hashCode += getCiudadBancoIntermediario().hashCode();
        }
        if (getNumeroCuenta() != null) {
            _hashCode += getNumeroCuenta().hashCode();
        }
        if (getDireccionBanco() != null) {
            _hashCode += getDireccionBanco().hashCode();
        }
        if (getAlcance() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAlcance());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAlcance(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCodigoIBAN() != null) {
            _hashCode += getCodigoIBAN().hashCode();
        }
        if (getCiudadBanco() != null) {
            _hashCode += getCiudadBanco().hashCode();
        }
        if (getTextoValidacion() != null) {
            _hashCode += getTextoValidacion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CuentaBancaria.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "cuentaBancaria"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idCuentaBancaria");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idCuentaBancaria"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombreBanco");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nombreBanco"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombreSucursal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nombreSucursal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoSWIFT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoSWIFT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoABA");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoABA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoPais");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoPais"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombreTitularDeLaCuenta");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nombreTitularDeLaCuenta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("moneda");
        elemField.setXmlName(new javax.xml.namespace.QName("", "moneda"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoCuenta");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipoCuenta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comentariosAdicionales");
        elemField.setXmlName(new javax.xml.namespace.QName("", "comentariosAdicionales"));
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
        elemField.setFieldName("codigoBanco");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoBanco"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoSucursal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoSucursal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombreBancoIntermediario");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nombreBancoIntermediario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoPaisBancoIntermediario");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoPaisBancoIntermediario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoSWIFTBancoIntermediario");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoSWIFTBancoIntermediario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ciudadBancoIntermediario");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ciudadBancoIntermediario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroCuenta");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numeroCuenta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("direccionBanco");
        elemField.setXmlName(new javax.xml.namespace.QName("", "direccionBanco"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alcance");
        elemField.setXmlName(new javax.xml.namespace.QName("", "alcance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.rupe.acce.gub.uy/", "alcance"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoIBAN");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoIBAN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ciudadBanco");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ciudadBanco"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("textoValidacion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "textoValidacion"));
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
