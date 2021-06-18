package uy.gub.agesic.empresa.model.dgi;

public class PersonaGetEntidadComplemento {
	  private String Cmpl_Id;
	  private String Cmpl_Dsc;
	  private String DomCmpl_Vlr;
	  
	  public PersonaGetEntidadComplemento() {
	    this.Cmpl_Id = null;
	    this.Cmpl_Dsc = null;
	    this.DomCmpl_Vlr = null;
	  }
	  


	  public String getCmpl_Id()
	  {
	    return this.Cmpl_Id;
	  }
	  


	  public void setCmpl_Id(String Cmpl_Id)
	  {
	    this.Cmpl_Id = Cmpl_Id;
	  }
	  


	  public String getCmpl_Dsc()
	  {
	    return this.Cmpl_Dsc;
	  }
	  


	  public void setCmpl_Dsc(String Cmpl_Dsc)
	  {
	    this.Cmpl_Dsc = Cmpl_Dsc;
	  }
	  


	  public String getDomCmpl_Vlr()
	  {
	    return this.DomCmpl_Vlr;
	  }
	  


	  public void setDomCmpl_Vlr(String DomCmpl_Vlr)
	  {
	    this.DomCmpl_Vlr = DomCmpl_Vlr;
	  }
	}

