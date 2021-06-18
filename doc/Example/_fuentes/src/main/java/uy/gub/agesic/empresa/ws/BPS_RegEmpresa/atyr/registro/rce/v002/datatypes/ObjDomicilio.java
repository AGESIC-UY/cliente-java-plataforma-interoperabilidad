/**
 * ObjDomicilio.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v002.datatypes;

public class ObjDomicilio  implements java.io.Serializable {
    private java.lang.String apto;

    private java.lang.String bis;

    private java.lang.String bloque;

    private uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v002.datatypes.ObjCalle calle;

    private uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v002.datatypes.ObjCalle calleEntreDos;

    private uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v002.datatypes.ObjCalle calleEntreUno;

    private java.lang.Integer codPostal;

    private java.lang.String complejoHabitacional;

    private uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v002.datatypes.ObjDepartamento departamento;

    private java.lang.Double kilometro;

    private java.lang.String local;

    private uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v002.datatypes.ObjLocalidad localidad;

    private java.lang.String manzana;

    private java.lang.String nivel;

    private java.lang.Integer nroPuerta;

    private java.lang.String observaciones;

    private java.lang.String padron;

    private java.lang.String ruta;

    private java.lang.Integer seccionJudicial;

    private java.lang.String solar;

    private java.lang.String torre;

    private java.lang.Integer unidad;

    private java.lang.Integer zona;

    public ObjDomicilio() {
    }

    public ObjDomicilio(
           java.lang.String apto,
           java.lang.String bis,
           java.lang.String bloque,
           uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v002.datatypes.ObjCalle calle,
           uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v002.datatypes.ObjCalle calleEntreDos,
           uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v002.datatypes.ObjCalle calleEntreUno,
           java.lang.Integer codPostal,
           java.lang.String complejoHabitacional,
           uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v002.datatypes.ObjDepartamento departamento,
           java.lang.Double kilometro,
           java.lang.String local,
           uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v002.datatypes.ObjLocalidad localidad,
           java.lang.String manzana,
           java.lang.String nivel,
           java.lang.Integer nroPuerta,
           java.lang.String observaciones,
           java.lang.String padron,
           java.lang.String ruta,
           java.lang.Integer seccionJudicial,
           java.lang.String solar,
           java.lang.String torre,
           java.lang.Integer unidad,
           java.lang.Integer zona) {
           this.apto = apto;
           this.bis = bis;
           this.bloque = bloque;
           this.calle = calle;
           this.calleEntreDos = calleEntreDos;
           this.calleEntreUno = calleEntreUno;
           this.codPostal = codPostal;
           this.complejoHabitacional = complejoHabitacional;
           this.departamento = departamento;
           this.kilometro = kilometro;
           this.local = local;
           this.localidad = localidad;
           this.manzana = manzana;
           this.nivel = nivel;
           this.nroPuerta = nroPuerta;
           this.observaciones = observaciones;
           this.padron = padron;
           this.ruta = ruta;
           this.seccionJudicial = seccionJudicial;
           this.solar = solar;
           this.torre = torre;
           this.unidad = unidad;
           this.zona = zona;
    }


    /**
     * Gets the apto value for this ObjDomicilio.
     * 
     * @return apto
     */
    public java.lang.String getApto() {
        return apto;
    }


    /**
     * Sets the apto value for this ObjDomicilio.
     * 
     * @param apto
     */
    public void setApto(java.lang.String apto) {
        this.apto = apto;
    }


    /**
     * Gets the bis value for this ObjDomicilio.
     * 
     * @return bis
     */
    public java.lang.String getBis() {
        return bis;
    }


    /**
     * Sets the bis value for this ObjDomicilio.
     * 
     * @param bis
     */
    public void setBis(java.lang.String bis) {
        this.bis = bis;
    }


    /**
     * Gets the bloque value for this ObjDomicilio.
     * 
     * @return bloque
     */
    public java.lang.String getBloque() {
        return bloque;
    }


    /**
     * Sets the bloque value for this ObjDomicilio.
     * 
     * @param bloque
     */
    public void setBloque(java.lang.String bloque) {
        this.bloque = bloque;
    }


    /**
     * Gets the calle value for this ObjDomicilio.
     * 
     * @return calle
     */
    public uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v002.datatypes.ObjCalle getCalle() {
        return calle;
    }


    /**
     * Sets the calle value for this ObjDomicilio.
     * 
     * @param calle
     */
    public void setCalle(uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v002.datatypes.ObjCalle calle) {
        this.calle = calle;
    }


    /**
     * Gets the calleEntreDos value for this ObjDomicilio.
     * 
     * @return calleEntreDos
     */
    public uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v002.datatypes.ObjCalle getCalleEntreDos() {
        return calleEntreDos;
    }


    /**
     * Sets the calleEntreDos value for this ObjDomicilio.
     * 
     * @param calleEntreDos
     */
    public void setCalleEntreDos(uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v002.datatypes.ObjCalle calleEntreDos) {
        this.calleEntreDos = calleEntreDos;
    }


    /**
     * Gets the calleEntreUno value for this ObjDomicilio.
     * 
     * @return calleEntreUno
     */
    public uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v002.datatypes.ObjCalle getCalleEntreUno() {
        return calleEntreUno;
    }


    /**
     * Sets the calleEntreUno value for this ObjDomicilio.
     * 
     * @param calleEntreUno
     */
    public void setCalleEntreUno(uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v002.datatypes.ObjCalle calleEntreUno) {
        this.calleEntreUno = calleEntreUno;
    }


    /**
     * Gets the codPostal value for this ObjDomicilio.
     * 
     * @return codPostal
     */
    public java.lang.Integer getCodPostal() {
        return codPostal;
    }


    /**
     * Sets the codPostal value for this ObjDomicilio.
     * 
     * @param codPostal
     */
    public void setCodPostal(java.lang.Integer codPostal) {
        this.codPostal = codPostal;
    }


    /**
     * Gets the complejoHabitacional value for this ObjDomicilio.
     * 
     * @return complejoHabitacional
     */
    public java.lang.String getComplejoHabitacional() {
        return complejoHabitacional;
    }


    /**
     * Sets the complejoHabitacional value for this ObjDomicilio.
     * 
     * @param complejoHabitacional
     */
    public void setComplejoHabitacional(java.lang.String complejoHabitacional) {
        this.complejoHabitacional = complejoHabitacional;
    }


    /**
     * Gets the departamento value for this ObjDomicilio.
     * 
     * @return departamento
     */
    public uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v002.datatypes.ObjDepartamento getDepartamento() {
        return departamento;
    }


    /**
     * Sets the departamento value for this ObjDomicilio.
     * 
     * @param departamento
     */
    public void setDepartamento(uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v002.datatypes.ObjDepartamento departamento) {
        this.departamento = departamento;
    }


    /**
     * Gets the kilometro value for this ObjDomicilio.
     * 
     * @return kilometro
     */
    public java.lang.Double getKilometro() {
        return kilometro;
    }


    /**
     * Sets the kilometro value for this ObjDomicilio.
     * 
     * @param kilometro
     */
    public void setKilometro(java.lang.Double kilometro) {
        this.kilometro = kilometro;
    }


    /**
     * Gets the local value for this ObjDomicilio.
     * 
     * @return local
     */
    public java.lang.String getLocal() {
        return local;
    }


    /**
     * Sets the local value for this ObjDomicilio.
     * 
     * @param local
     */
    public void setLocal(java.lang.String local) {
        this.local = local;
    }


    /**
     * Gets the localidad value for this ObjDomicilio.
     * 
     * @return localidad
     */
    public uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v002.datatypes.ObjLocalidad getLocalidad() {
        return localidad;
    }


    /**
     * Sets the localidad value for this ObjDomicilio.
     * 
     * @param localidad
     */
    public void setLocalidad(uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v002.datatypes.ObjLocalidad localidad) {
        this.localidad = localidad;
    }


    /**
     * Gets the manzana value for this ObjDomicilio.
     * 
     * @return manzana
     */
    public java.lang.String getManzana() {
        return manzana;
    }


    /**
     * Sets the manzana value for this ObjDomicilio.
     * 
     * @param manzana
     */
    public void setManzana(java.lang.String manzana) {
        this.manzana = manzana;
    }


    /**
     * Gets the nivel value for this ObjDomicilio.
     * 
     * @return nivel
     */
    public java.lang.String getNivel() {
        return nivel;
    }


    /**
     * Sets the nivel value for this ObjDomicilio.
     * 
     * @param nivel
     */
    public void setNivel(java.lang.String nivel) {
        this.nivel = nivel;
    }


    /**
     * Gets the nroPuerta value for this ObjDomicilio.
     * 
     * @return nroPuerta
     */
    public java.lang.Integer getNroPuerta() {
        return nroPuerta;
    }


    /**
     * Sets the nroPuerta value for this ObjDomicilio.
     * 
     * @param nroPuerta
     */
    public void setNroPuerta(java.lang.Integer nroPuerta) {
        this.nroPuerta = nroPuerta;
    }


    /**
     * Gets the observaciones value for this ObjDomicilio.
     * 
     * @return observaciones
     */
    public java.lang.String getObservaciones() {
        return observaciones;
    }


    /**
     * Sets the observaciones value for this ObjDomicilio.
     * 
     * @param observaciones
     */
    public void setObservaciones(java.lang.String observaciones) {
        this.observaciones = observaciones;
    }


    /**
     * Gets the padron value for this ObjDomicilio.
     * 
     * @return padron
     */
    public java.lang.String getPadron() {
        return padron;
    }


    /**
     * Sets the padron value for this ObjDomicilio.
     * 
     * @param padron
     */
    public void setPadron(java.lang.String padron) {
        this.padron = padron;
    }


    /**
     * Gets the ruta value for this ObjDomicilio.
     * 
     * @return ruta
     */
    public java.lang.String getRuta() {
        return ruta;
    }


    /**
     * Sets the ruta value for this ObjDomicilio.
     * 
     * @param ruta
     */
    public void setRuta(java.lang.String ruta) {
        this.ruta = ruta;
    }


    /**
     * Gets the seccionJudicial value for this ObjDomicilio.
     * 
     * @return seccionJudicial
     */
    public java.lang.Integer getSeccionJudicial() {
        return seccionJudicial;
    }


    /**
     * Sets the seccionJudicial value for this ObjDomicilio.
     * 
     * @param seccionJudicial
     */
    public void setSeccionJudicial(java.lang.Integer seccionJudicial) {
        this.seccionJudicial = seccionJudicial;
    }


    /**
     * Gets the solar value for this ObjDomicilio.
     * 
     * @return solar
     */
    public java.lang.String getSolar() {
        return solar;
    }


    /**
     * Sets the solar value for this ObjDomicilio.
     * 
     * @param solar
     */
    public void setSolar(java.lang.String solar) {
        this.solar = solar;
    }


    /**
     * Gets the torre value for this ObjDomicilio.
     * 
     * @return torre
     */
    public java.lang.String getTorre() {
        return torre;
    }


    /**
     * Sets the torre value for this ObjDomicilio.
     * 
     * @param torre
     */
    public void setTorre(java.lang.String torre) {
        this.torre = torre;
    }


    /**
     * Gets the unidad value for this ObjDomicilio.
     * 
     * @return unidad
     */
    public java.lang.Integer getUnidad() {
        return unidad;
    }


    /**
     * Sets the unidad value for this ObjDomicilio.
     * 
     * @param unidad
     */
    public void setUnidad(java.lang.Integer unidad) {
        this.unidad = unidad;
    }


    /**
     * Gets the zona value for this ObjDomicilio.
     * 
     * @return zona
     */
    public java.lang.Integer getZona() {
        return zona;
    }


    /**
     * Sets the zona value for this ObjDomicilio.
     * 
     * @param zona
     */
    public void setZona(java.lang.Integer zona) {
        this.zona = zona;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ObjDomicilio)) return false;
        ObjDomicilio other = (ObjDomicilio) obj;
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
            ((this.bloque==null && other.getBloque()==null) || 
             (this.bloque!=null &&
              this.bloque.equals(other.getBloque()))) &&
            ((this.calle==null && other.getCalle()==null) || 
             (this.calle!=null &&
              this.calle.equals(other.getCalle()))) &&
            ((this.calleEntreDos==null && other.getCalleEntreDos()==null) || 
             (this.calleEntreDos!=null &&
              this.calleEntreDos.equals(other.getCalleEntreDos()))) &&
            ((this.calleEntreUno==null && other.getCalleEntreUno()==null) || 
             (this.calleEntreUno!=null &&
              this.calleEntreUno.equals(other.getCalleEntreUno()))) &&
            ((this.codPostal==null && other.getCodPostal()==null) || 
             (this.codPostal!=null &&
              this.codPostal.equals(other.getCodPostal()))) &&
            ((this.complejoHabitacional==null && other.getComplejoHabitacional()==null) || 
             (this.complejoHabitacional!=null &&
              this.complejoHabitacional.equals(other.getComplejoHabitacional()))) &&
            ((this.departamento==null && other.getDepartamento()==null) || 
             (this.departamento!=null &&
              this.departamento.equals(other.getDepartamento()))) &&
            ((this.kilometro==null && other.getKilometro()==null) || 
             (this.kilometro!=null &&
              this.kilometro.equals(other.getKilometro()))) &&
            ((this.local==null && other.getLocal()==null) || 
             (this.local!=null &&
              this.local.equals(other.getLocal()))) &&
            ((this.localidad==null && other.getLocalidad()==null) || 
             (this.localidad!=null &&
              this.localidad.equals(other.getLocalidad()))) &&
            ((this.manzana==null && other.getManzana()==null) || 
             (this.manzana!=null &&
              this.manzana.equals(other.getManzana()))) &&
            ((this.nivel==null && other.getNivel()==null) || 
             (this.nivel!=null &&
              this.nivel.equals(other.getNivel()))) &&
            ((this.nroPuerta==null && other.getNroPuerta()==null) || 
             (this.nroPuerta!=null &&
              this.nroPuerta.equals(other.getNroPuerta()))) &&
            ((this.observaciones==null && other.getObservaciones()==null) || 
             (this.observaciones!=null &&
              this.observaciones.equals(other.getObservaciones()))) &&
            ((this.padron==null && other.getPadron()==null) || 
             (this.padron!=null &&
              this.padron.equals(other.getPadron()))) &&
            ((this.ruta==null && other.getRuta()==null) || 
             (this.ruta!=null &&
              this.ruta.equals(other.getRuta()))) &&
            ((this.seccionJudicial==null && other.getSeccionJudicial()==null) || 
             (this.seccionJudicial!=null &&
              this.seccionJudicial.equals(other.getSeccionJudicial()))) &&
            ((this.solar==null && other.getSolar()==null) || 
             (this.solar!=null &&
              this.solar.equals(other.getSolar()))) &&
            ((this.torre==null && other.getTorre()==null) || 
             (this.torre!=null &&
              this.torre.equals(other.getTorre()))) &&
            ((this.unidad==null && other.getUnidad()==null) || 
             (this.unidad!=null &&
              this.unidad.equals(other.getUnidad()))) &&
            ((this.zona==null && other.getZona()==null) || 
             (this.zona!=null &&
              this.zona.equals(other.getZona())));
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
        if (getBloque() != null) {
            _hashCode += getBloque().hashCode();
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
        if (getCodPostal() != null) {
            _hashCode += getCodPostal().hashCode();
        }
        if (getComplejoHabitacional() != null) {
            _hashCode += getComplejoHabitacional().hashCode();
        }
        if (getDepartamento() != null) {
            _hashCode += getDepartamento().hashCode();
        }
        if (getKilometro() != null) {
            _hashCode += getKilometro().hashCode();
        }
        if (getLocal() != null) {
            _hashCode += getLocal().hashCode();
        }
        if (getLocalidad() != null) {
            _hashCode += getLocalidad().hashCode();
        }
        if (getManzana() != null) {
            _hashCode += getManzana().hashCode();
        }
        if (getNivel() != null) {
            _hashCode += getNivel().hashCode();
        }
        if (getNroPuerta() != null) {
            _hashCode += getNroPuerta().hashCode();
        }
        if (getObservaciones() != null) {
            _hashCode += getObservaciones().hashCode();
        }
        if (getPadron() != null) {
            _hashCode += getPadron().hashCode();
        }
        if (getRuta() != null) {
            _hashCode += getRuta().hashCode();
        }
        if (getSeccionJudicial() != null) {
            _hashCode += getSeccionJudicial().hashCode();
        }
        if (getSolar() != null) {
            _hashCode += getSolar().hashCode();
        }
        if (getTorre() != null) {
            _hashCode += getTorre().hashCode();
        }
        if (getUnidad() != null) {
            _hashCode += getUnidad().hashCode();
        }
        if (getZona() != null) {
            _hashCode += getZona().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ObjDomicilio.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/rce/v002/datatypes", "ObjDomicilio"));
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
        elemField.setFieldName("bloque");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bloque"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("calle");
        elemField.setXmlName(new javax.xml.namespace.QName("", "calle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/rce/v002/datatypes", "ObjCalle"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("calleEntreDos");
        elemField.setXmlName(new javax.xml.namespace.QName("", "calleEntreDos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/rce/v002/datatypes", "ObjCalle"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("calleEntreUno");
        elemField.setXmlName(new javax.xml.namespace.QName("", "calleEntreUno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/rce/v002/datatypes", "ObjCalle"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codPostal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codPostal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("complejoHabitacional");
        elemField.setXmlName(new javax.xml.namespace.QName("", "complejoHabitacional"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("departamento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "departamento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://bps.gub.uy/atyr/registro/rce/v002/datatypes", "ObjDepartamento"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kilometro");
        elemField.setXmlName(new javax.xml.namespace.QName("", "kilometro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("local");
        elemField.setXmlName(new javax.xml.namespace.QName("", "local"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("manzana");
        elemField.setXmlName(new javax.xml.namespace.QName("", "manzana"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nivel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nivel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nroPuerta");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nroPuerta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("observaciones");
        elemField.setXmlName(new javax.xml.namespace.QName("", "observaciones"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("padron");
        elemField.setXmlName(new javax.xml.namespace.QName("", "padron"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ruta");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ruta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seccionJudicial");
        elemField.setXmlName(new javax.xml.namespace.QName("", "seccionJudicial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("solar");
        elemField.setXmlName(new javax.xml.namespace.QName("", "solar"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("torre");
        elemField.setXmlName(new javax.xml.namespace.QName("", "torre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unidad");
        elemField.setXmlName(new javax.xml.namespace.QName("", "unidad"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zona");
        elemField.setXmlName(new javax.xml.namespace.QName("", "zona"));
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
