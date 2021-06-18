package uy.gub.agesic.empresa.model.dgi;

import java.util.ArrayList;

public class PersonaGetEntidadResponse {
  private String RUC;
  private String RazonSocial;
  private String Local_Sec_Nro;
  private String Local_Nom_Fnt;
  private String TipoLocal_Id;
  private String TipoLocal_Dsc;
  private String Local_Fec_Canc;
  private String Local_Fec_Ini;
  private String TipoDom_Id;
  private String TipoDom_Des;
  private String CalOcup_id;
  private String Calocup_Des;
  private String TerCod_Id;
  private String Tercod_Des;
  private String Calle_id;
  private String Calle_Nom;
  private String Dom_Pta_Nro;
  private String Dom_Bis_Flg;
  private String Dom_Ap_Nro;
  private String Loc_Id;
  private String Loc_Nom;
  private String Dpto_Id;
  private String Dpto_Nom;
  private String Dom_Pst_Cod;
  private String Dom_Coment;
  private String Dom_Err_Cod;
  private ArrayList<PersonaGetEntidadContacto> Contactos;
  private ArrayList<PersonaGetEntidadComplemento> Complementos;
  
  public PersonaGetEntidadResponse() {
    this.RUC = null;
    this.RazonSocial = null;
    this.Local_Sec_Nro = null;
    this.Local_Nom_Fnt = null;
    this.TipoLocal_Id = null;
    this.TipoLocal_Dsc = null;
    this.Local_Fec_Canc = null;
    this.Local_Fec_Ini = null;
    this.TipoDom_Id = null;
    this.TipoDom_Des = null;
    this.CalOcup_id = null;
    this.Calocup_Des = null;
    this.TerCod_Id = null;
    this.Tercod_Des = null;
    this.Calle_id = null;
    this.Calle_Nom = null;
    this.Dom_Pta_Nro = null;
    this.Dom_Bis_Flg = null;
    this.Dom_Ap_Nro = null;
    this.Loc_Id = null;
    this.Loc_Nom = null;
    this.Dpto_Id = null;
    this.Dpto_Nom = null;
    this.Dom_Pst_Cod = null;
    this.Dom_Coment = null;
    this.Dom_Err_Cod = null;
    this.Contactos = new ArrayList();
    this.Complementos = new ArrayList();
  }
  


  public String getRUC()
  {
    return this.RUC;
  }
  


  public void setRUC(String RUC)
  {
    this.RUC = RUC;
  }
  


  public String getRazonSocial()
  {
    return this.RazonSocial;
  }
  


  public void setRazonSocial(String RazonSocial)
  {
    this.RazonSocial = RazonSocial;
  }
  


  public String getLocal_Sec_Nro()
  {
    return this.Local_Sec_Nro;
  }
  


  public void setLocal_Sec_Nro(String Local_Sec_Nro)
  {
    this.Local_Sec_Nro = Local_Sec_Nro;
  }
  


  public String getLocal_Nom_Fnt()
  {
    return this.Local_Nom_Fnt;
  }
  


  public void setLocal_Nom_Fnt(String Local_Nom_Fnt)
  {
    this.Local_Nom_Fnt = Local_Nom_Fnt;
  }
  


  public String getTipoLocal_Id()
  {
    return this.TipoLocal_Id;
  }
  


  public void setTipoLocal_Id(String TipoLocal_Id)
  {
    this.TipoLocal_Id = TipoLocal_Id;
  }
  


  public String getTipoLocal_Dsc()
  {
    return this.TipoLocal_Dsc;
  }
  


  public void setTipoLocal_Dsc(String TipoLocal_Dsc)
  {
    this.TipoLocal_Dsc = TipoLocal_Dsc;
  }
  


  public String getLocal_Fec_Canc()
  {
    return this.Local_Fec_Canc;
  }
  


  public void setLocal_Fec_Canc(String Local_Fec_Canc)
  {
    this.Local_Fec_Canc = Local_Fec_Canc;
  }
  


  public String getLocal_Fec_Ini()
  {
    return this.Local_Fec_Ini;
  }
  


  public void setLocal_Fec_Ini(String Local_Fec_Ini)
  {
    this.Local_Fec_Ini = Local_Fec_Ini;
  }
  


  public String getTipoDom_Id()
  {
    return this.TipoDom_Id;
  }
  


  public void setTipoDom_Id(String TipoDom_Id)
  {
    this.TipoDom_Id = TipoDom_Id;
  }
  


  public String getTipoDom_Des()
  {
    return this.TipoDom_Des;
  }
  


  public void setTipoDom_Des(String TipoDom_Des)
  {
    this.TipoDom_Des = TipoDom_Des;
  }
  


  public String getCalOcup_id()
  {
    return this.CalOcup_id;
  }
  


  public void setCalOcup_id(String CalOcup_id)
  {
    this.CalOcup_id = CalOcup_id;
  }
  


  public String getCalocup_Des()
  {
    return this.Calocup_Des;
  }
  


  public void setCalocup_Des(String Calocup_Des)
  {
    this.Calocup_Des = Calocup_Des;
  }
  


  public String getTerCod_Id()
  {
    return this.TerCod_Id;
  }
  


  public void setTerCod_Id(String TerCod_Id)
  {
    this.TerCod_Id = TerCod_Id;
  }
  


  public String getTercod_Des()
  {
    return this.Tercod_Des;
  }
  


  public void setTercod_Des(String Tercod_Des)
  {
    this.Tercod_Des = Tercod_Des;
  }
  


  public String getCalle_id()
  {
    return this.Calle_id;
  }
  


  public void setCalle_id(String Calle_id)
  {
    this.Calle_id = Calle_id;
  }
  


  public String getCalle_Nom()
  {
    return this.Calle_Nom;
  }
  


  public void setCalle_Nom(String Calle_Nom)
  {
    this.Calle_Nom = Calle_Nom;
  }
  


  public String getDom_Pta_Nro()
  {
    return this.Dom_Pta_Nro;
  }
  


  public void setDom_Pta_Nro(String Dom_Pta_Nro)
  {
    this.Dom_Pta_Nro = Dom_Pta_Nro;
  }
  


  public String getDom_Bis_Flg()
  {
    return this.Dom_Bis_Flg;
  }
  


  public void setDom_Bis_Flg(String Dom_Bis_Flg)
  {
    this.Dom_Bis_Flg = Dom_Bis_Flg;
  }
  


  public String getDom_Ap_Nro()
  {
    return this.Dom_Ap_Nro;
  }
  


  public void setDom_Ap_Nro(String Dom_Ap_Nro)
  {
    this.Dom_Ap_Nro = Dom_Ap_Nro;
  }
  


  public String getLoc_Id()
  {
    return this.Loc_Id;
  }
  


  public void setLoc_Id(String Loc_Id)
  {
    this.Loc_Id = Loc_Id;
  }
  


  public String getLoc_Nom()
  {
    return this.Loc_Nom;
  }
  


  public void setLoc_Nom(String Loc_Nom)
  {
    this.Loc_Nom = Loc_Nom;
  }
  


  public String getDpto_Id()
  {
    return this.Dpto_Id;
  }
  


  public void setDpto_Id(String Dpto_Id)
  {
    this.Dpto_Id = Dpto_Id;
  }
  


  public String getDpto_Nom()
  {
    return this.Dpto_Nom;
  }
  


  public void setDpto_Nom(String Dpto_Nom)
  {
    this.Dpto_Nom = Dpto_Nom;
  }
  


  public String getDom_Pst_Cod()
  {
    return this.Dom_Pst_Cod;
  }
  


  public void setDom_Pst_Cod(String Dom_Pst_Cod)
  {
    this.Dom_Pst_Cod = Dom_Pst_Cod;
  }
  


  public String getDom_Coment()
  {
    return this.Dom_Coment;
  }
  


  public void setDom_Coment(String Dom_Coment)
  {
    this.Dom_Coment = Dom_Coment;
  }
  


  public String getDom_Err_Cod()
  {
    return this.Dom_Err_Cod;
  }
  


  public void setDom_Err_Cod(String Dom_Err_Cod)
  {
    this.Dom_Err_Cod = Dom_Err_Cod;
  }
  


  public ArrayList<PersonaGetEntidadContacto> getContactos()
  {
    return this.Contactos;
  }
  


  public void setContactos(ArrayList<PersonaGetEntidadContacto> Contactos)
  {
    this.Contactos = Contactos;
  }
  


  public PersonaGetEntidadContacto getContacto(int index)
  {
    return (PersonaGetEntidadContacto)this.Contactos.get(index);
  }
  



  public void setContacto(int index, PersonaGetEntidadContacto Contacto)
  {
    this.Contactos.set(index, Contacto);
  }
  


  public void addContacto(PersonaGetEntidadContacto Contacto)
  {
    this.Contactos.add(Contacto);
  }
  


  public ArrayList<PersonaGetEntidadComplemento> getComplementos()
  {
    return this.Complementos;
  }
  


  public void setComplementos(ArrayList<PersonaGetEntidadComplemento> Complementos)
  {
    this.Complementos = Complementos;
  }
  


  public PersonaGetEntidadComplemento getComplemento(int index)
  {
    return (PersonaGetEntidadComplemento)this.Complementos.get(index);
  }
  



  public void setComplemento(int index, PersonaGetEntidadComplemento Complemento)
  {
    this.Complementos.set(index, Complemento);
  }
  


  public void addComplemento(PersonaGetEntidadComplemento Complemento)
  {
    this.Complementos.add(Complemento);
  }
}
