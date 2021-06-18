package uy.gub.agesic.empresa.model.dgi;

public class PersonaGetEntidadContacto {
	  private String TipoCtt_Id;
	  private String TipoCtt_Des;
	  private String DomCtt_Val;
	  
	  public PersonaGetEntidadContacto() {
	    this.TipoCtt_Id = null;
	    this.TipoCtt_Des = null;
	    this.DomCtt_Val = null;
	  }
	  


	  public String getTipoCtt_Id()
	  {
	    return this.TipoCtt_Id;
	  }
	  


	  public void setTipoCtt_Id(String TipoCtt_Id)
	  {
	    this.TipoCtt_Id = TipoCtt_Id;
	  }
	  


	  public String getTipoCtt_Des()
	  {
	    return this.TipoCtt_Des;
	  }
	  


	  public void setTipoCtt_Des(String TipoCtt_Des)
	  {
	    this.TipoCtt_Des = TipoCtt_Des;
	  }
	  


	  public String getDomCtt_Val()
	  {
	    return this.DomCtt_Val;
	  }
	  


	  public void setDomCtt_Val(String DomCtt_Val)
	  {
	    this.DomCtt_Val = DomCtt_Val;
	  }
	}
