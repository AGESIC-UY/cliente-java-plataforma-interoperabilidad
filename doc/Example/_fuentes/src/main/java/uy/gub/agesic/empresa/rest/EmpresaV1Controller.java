package uy.gub.agesic.empresa.rest;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;

import org.apache.axis.AxisFault;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import uy.gub.agesic.empresa.conector.pge.Config;
import uy.gub.agesic.empresa.conector.pge.PGEFacilitator;
import uy.gub.agesic.empresa.model.ActividadPrimariaEmpresa;
import uy.gub.agesic.empresa.model.DireccionTipo;
import uy.gub.agesic.empresa.model.Empresa;
import uy.gub.agesic.empresa.model.Geometria;
import uy.gub.agesic.empresa.model.dgi.PersonaGetEntidadComplemento;
import uy.gub.agesic.empresa.model.dgi.PersonaGetEntidadContacto;
import uy.gub.agesic.empresa.model.dgi.PersonaGetEntidadResponse;
import uy.gub.agesic.empresa.model.ide.GeocodeResult;
import uy.gub.agesic.empresa.ws.IDE_DireccionesClient;
import uy.gub.agesic.empresa.ws.ACCE_RUPE.ConsultaProveedoresSoapBindingStub;
import uy.gub.agesic.empresa.ws.ACCE_RUPE.ConsultaProveedores_ServiceLocator;
import uy.gub.agesic.empresa.ws.ACCE_RUPE.CriterioBusquedaProveedor;
import uy.gub.agesic.empresa.ws.ACCE_RUPE.Proveedor;
import uy.gub.agesic.empresa.ws.ACCE_RUPE.RUPEException;
import uy.gub.agesic.empresa.ws.BPS_RegEmpresa.WsRegEmpresasServiceLocator;
import uy.gub.agesic.empresa.ws.BPS_RegEmpresa.WsRegEmpresasV002BindingStub;
import uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.empresas.v002.datatypes.ParamObtEmpresa;
import uy.gub.agesic.empresa.ws.BPS_RegEmpresa.atyr.registro.rce.v002.datatypes.ObjGirosEmpresa;
import uy.gub.agesic.empresa.ws.DGI_RUTPersonaGetEntidad.RUTPersonaGetEntidadExecute;
import uy.gub.agesic.empresa.ws.DGI_RUTPersonaGetEntidad.RUTPersonaGetEntidadExecuteResponse;
import uy.gub.agesic.empresa.ws.DGI_RUTPersonaGetEntidad.RUTPersonaGetEntidadLocator;
import uy.gub.agesic.empresa.ws.DGI_RUTPersonaGetEntidad.RUTPersonaGetEntidadSoapBindingStub;
import uy.gub.agesic.empresa.ws.MIEM_CertificadoPYME.ApiaWSInputType;
import uy.gub.agesic.empresa.ws.MIEM_CertificadoPYME.ApiaWSInterfaceServiceLocator;
import uy.gub.agesic.empresa.ws.MIEM_CertificadoPYME.ApiaWSconsulta_pymeSoapBindingStub;
import uy.gub.agesic.empresa.ws.MIEM_CertificadoPYME.ExecResultType;
import uy.gub.agesic.empresa.ws.MIEM_CertificadoPYME.Row;
import uy.gub.agesic.empresa.ws.UNAOID_consultasOID.BasicHttpBinding_IServicioConsultasStub;
import uy.gub.agesic.empresa.ws.UNAOID_consultasOID.ServicioConsultasLocator;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.soap.SOAPException;
import javax.xml.transform.TransformerException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;

import java.util.ArrayList;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;


import java.io.StringReader;

@RestController
@RequestMapping("/api/empresa/v1")
@Api(tags="obtener-datos",description="Devuelve los datos de la empresa con el RUT dado")
public class EmpresaV1Controller {
	Logger logger = LoggerFactory.getLogger(EmpresaV1Controller.class);
	
	@Autowired
	private IDE_DireccionesClient ideClient;
	private PGEFacilitator pgeFacilitaror = new PGEFacilitator();
	
	@GetMapping("/obtener-datos/{rut}/{nroEmpresa}")
	public Empresa obtenerDatos(@PathVariable String rut, @PathVariable String nroEmpresa) {
		Empresa e = null;
		try {
			e = crearEmpresaBasica(rut);
			if (e != null) {
				ObjGirosEmpresa giros = obtenerGirosBPS(rut, nroEmpresa, e.denominacion); 
				String oidGiro = obtenerCIIU(giros.getGiroPrincipal().getGiro().getDescGiro());
				String[] giroArray = oidGiro.split("\\.");

				if (giroArray.length > 5) {
					char ch = 'A';
					int castAscii = (int) ch;
					castAscii = castAscii + (new Integer(giroArray[giroArray.length-5])).intValue();
					e.actividadPrimaria.CIIUSeccion = Character.toString((char)castAscii);
					e.actividadPrimaria.CIIUDivision = (new Integer(giroArray[giroArray.length-4])).intValue();
					e.actividadPrimaria.CIIUGrupo = (new Integer(giroArray[giroArray.length-3])).intValue();
					e.actividadPrimaria.CIIUClase = (new Integer(giroArray[giroArray.length-2])).intValue();
					e.actividadPrimaria.CIIUSubClase = (new Integer(giroArray[giroArray.length-1])).intValue();
					e.actividadPrimaria.CIIUVersion = 1;
				}
				
				return e;
			}
		} catch (Exception ex) {
			logger.error(ex.getMessage());
		}
			
		return e;
	}

	@GetMapping("/obtener-datos-basicos/{rut}")                            
	public Empresa obtenerDatosBasicos(@PathVariable String rut) {   
		Empresa e = null;
		try {
			e = crearEmpresaBasica(rut);
			if (e!=null )
				return e;
			
		} catch (Exception ex) {
			logger.error(ex.getMessage());
		}
			
		return e;
	}
	
	private Empresa crearEmpresaBasica(String rut) throws Exception{
		Empresa e;
		PersonaGetEntidadResponse datosDGIEntidad = obtenerDatosDGIEntidad(rut);
		Proveedor[] provs = obtenerProveedores(rut);
		String oidOrganizacion = obtenerOid(rut);
		ExecResultType certPyme = obtenerCertificadoPymeByRUT(rut);
		
		e = new Empresa();
		e.identificador = oidOrganizacion;
		e.domicilio = new DireccionTipo();
		e.domicilio.georeferencia = new Geometria();
		e.domicilio.pais = "UY";
		e.actividadPrimaria = new ActividadPrimariaEmpresa();
		
		if (oidOrganizacion != null && !oidOrganizacion.equals("")) {
			String[] giroArray = oidOrganizacion.split("\\.");
			if (giroArray.length > 6) {
				char ch = 'A';
				int castAscii = (int) ch;
				castAscii = castAscii + (new Integer(giroArray[giroArray.length-6])).intValue();
				e.actividadPrimaria.CIIUSeccion = Character.toString((char)castAscii);
				e.actividadPrimaria.CIIUDivision = (new Integer(giroArray[giroArray.length-5])).intValue();
				e.actividadPrimaria.CIIUGrupo = (new Integer(giroArray[giroArray.length-4])).intValue();
				e.actividadPrimaria.CIIUClase = (new Integer(giroArray[giroArray.length-3])).intValue();
				e.actividadPrimaria.CIIUSubClase = (new Integer(giroArray[giroArray.length-2])).intValue();
				e.actividadPrimaria.CIIUVersion = 1;
			}
		}
		
		if (datosDGIEntidad != null) {
			e.denominacion = datosDGIEntidad.getRazonSocial();
			if (!datosDGIEntidad.getCalle_Nom().equals("") && !datosDGIEntidad.getLoc_Nom().equals("")) {
				try
				{
					GeocodeResult[] direcciones = ideClient.direccionUnica(2, datosDGIEntidad.getCalle_Nom() + " " + datosDGIEntidad.getDom_Pta_Nro() + ", " + datosDGIEntidad.getLoc_Nom());
				
					if (direcciones.length > 0) {
						CargarDatosDireccionIDE(direcciones[0], e.domicilio);
					}
					else {
						CargarDatosDireccionDGI(datosDGIEntidad, e.domicilio);
					}
				}
				catch( Exception ex)
				{
					logger.info("Se encontró un error en la invocación servicio Direcciones IDE");
					CargarDatosDireccionDGI(datosDGIEntidad, e.domicilio);
				}
			
			}
		}
		
		if (provs != null && provs.length > 0) {
			if (provs[0].getNombreFantasia() != null && !provs[0].getNombreFantasia().equals("")) {
				e.nombreFantasia = provs[0].getNombreFantasia();	
			}
			e.naturalezaJuridica = obtenerCodigoNaturalezaJuridica((new Integer(provs[0].getTipoOrganizacion())).intValue());
		}
		
		if (certPyme != null && (e.naturalezaJuridica == null || e.naturalezaJuridica.equals(""))) {
			if (certPyme.getResultQueryRows() != null && certPyme.getResultQueryRows().length > 0) {
				Row resRow = certPyme.getResultQueryRows()[0];
				e.naturalezaJuridica = obtenerCodigoNaturalezaJuridicaPyme(resRow.getTipo_sociedad());
			}
		}
		
		return e;
	}
	
	private void CargarDatosDireccionIDE(GeocodeResult direccion, DireccionTipo domicilio )
	{
		String depCode = getPaisDivisionCode(direccion.departamento);
		
		if (direccion.type.equals("CALLEyPORTAL")) {
			domicilio.formaCanonica = 3;
			domicilio.tipoVialidad = "CALLE";
		} else if (direccion.type.equals("RUTAyKM")) {
			domicilio.formaCanonica = 1;
			domicilio.tipoVialidad = "RUTA";
		} else if (direccion.type.equals("MANZANAySOLAR")) {
			domicilio.formaCanonica = 6;
			domicilio.tipoVialidad = "MANZANA";
		} else {
			domicilio.formaCanonica = 3;
			domicilio.tipoVialidad = "CALLE";
		}
		
		domicilio.direccionCompleta = direccion.departamento + ", " + direccion.localidad + ", " + direccion.address;
		domicilio.localidad = getLocalidadCode(depCode, direccion.departamento, direccion.localidad);
		domicilio.paisDivision = depCode;
		domicilio.codigoPostal = direccion.postalCode;
		domicilio.numero = (new Integer(direccion.portalNumber)).toString();
		domicilio.nombre = direccion.inmueble;
		domicilio.vialidad = direccion.nomVia;
		if (domicilio.tipoVialidad.equals("MANZANA")) {
			domicilio.manzana = (new Integer(direccion.manzana)).intValue();	
		} else if (domicilio.tipoVialidad.equals("RUTA")) {
			domicilio.numero = (new Integer(direccion.km)).toString();	
		}
		
		domicilio.georeferencia.crs = "WGS84"; //(new Integer(direccionesVO[0].srid)).toString();
		domicilio.georeferencia.tipo = 1; //Point;
		domicilio.georeferencia.coordenada = (new Float(direccion.lat)).toString() + "," + (new Float(direccion.lng)).toString();
	
	}
	private void CargarDatosDireccionDGI(PersonaGetEntidadResponse datosDGIEntidad, DireccionTipo domicilio)
	{
		domicilio.formaCanonica = 3;
		domicilio.tipoVialidad = "CALLE";
		String depCode = getPaisDivisionCode(datosDGIEntidad.getDpto_Nom());
		domicilio.direccionCompleta = datosDGIEntidad.getDpto_Nom() + ", " + datosDGIEntidad.getLoc_Nom() + ", " + datosDGIEntidad.getCalle_Nom() + " " + datosDGIEntidad.getDom_Pta_Nro();
		domicilio.localidad = getLocalidadCode(depCode, datosDGIEntidad.getDpto_Nom(), datosDGIEntidad.getLoc_Nom());
		domicilio.paisDivision = depCode;
		domicilio.codigoPostal = datosDGIEntidad.getDom_Pst_Cod();
		domicilio.numero = datosDGIEntidad.getDom_Pta_Nro();
		domicilio.nombre = datosDGIEntidad.getCalle_Nom();
		domicilio.vialidad = datosDGIEntidad.getCalle_Nom();
		domicilio.georeferencia.crs = "WGS84";
		domicilio.georeferencia.tipo = 1; //Point;
		domicilio.georeferencia.coordenada = "";
	}

	private PersonaGetEntidadResponse obtenerDatosDGIEntidad(String rut)
			throws Exception {
		logger.debug("Preparando invocación servicio DGI_RUTGetEntidad");
		RUTPersonaGetEntidadLocator locator = new RUTPersonaGetEntidadLocator();
		RUTPersonaGetEntidadExecute params = new RUTPersonaGetEntidadExecute();
		RUTPersonaGetEntidadSoapBindingStub stub = new RUTPersonaGetEntidadSoapBindingStub(new URL( Config.GetValuePGE("dgi", Config.WS_URL)),locator);
		
		pgeFacilitaror.addWSSecurity(stub, "dgi");
		
		logger.debug("se agregó header seguridad");
		params.setRuc(rut);
		logger.debug("se agregó parámetro rut: " + rut);
		logger.debug("se comienza invocación"); 
		PersonaGetEntidadResponse responsePGE = null;
		try {
			RUTPersonaGetEntidadExecuteResponse result = stub.execute(params);
			String data = result.getData();
			logger.debug("data: " + data);
			Document xml = parseXML(data);
			Element root = (Element) xml.getFirstChild();

			logger.debug("se comienza parseo de datos"); 

			responsePGE = new PersonaGetEntidadResponse();
			responsePGE.setRUC(getChildElementTextByTag(root, "RUC"));
			responsePGE.setRazonSocial(getChildElementTextByTag(root, "RazonSocial"));
			Element domFiscal = (Element) root.getElementsByTagName(
					"WS_DomicilioFiscalPrincipal").item(0);
			responsePGE.setLocal_Sec_Nro(getChildElementTextByTag(domFiscal,
					"Local_Sec_Nro"));
			responsePGE.setLocal_Nom_Fnt(getChildElementTextByTag(domFiscal,
					"Local_Nom_Fnt"));
			responsePGE.setTipoLocal_Id(getChildElementTextByTag(domFiscal,
					"TipoLocal_Id"));
			responsePGE.setTipoLocal_Dsc(getChildElementTextByTag(domFiscal,
					"TipoLocal_Dsc"));
			responsePGE.setLocal_Fec_Canc(getChildElementTextByTag(domFiscal,
					"Local_Fec_Canc"));
			responsePGE.setLocal_Fec_Ini(getChildElementTextByTag(domFiscal,
					"Local_Fec_Ini"));
			responsePGE.setTipoDom_Id(getChildElementTextByTag(domFiscal,
					"TipoDom_Id"));
			responsePGE.setTipoDom_Des(getChildElementTextByTag(domFiscal,
					"TipoDom_Des"));
			responsePGE.setCalOcup_id(getChildElementTextByTag(domFiscal,
					"CalOcup_id"));
			responsePGE.setCalocup_Des(getChildElementTextByTag(domFiscal,
					"Calocup_Des"));
			responsePGE.setTerCod_Id(getChildElementTextByTag(domFiscal,
					"TerCod_Id"));
			responsePGE.setTercod_Des(getChildElementTextByTag(domFiscal,
					"Tercod_Des"));
			responsePGE
					.setCalle_id(getChildElementTextByTag(domFiscal, "Calle_id"));
			responsePGE.setCalle_Nom(getChildElementTextByTag(domFiscal,
					"Calle_Nom"));
			responsePGE.setDom_Pta_Nro(getChildElementTextByTag(domFiscal,
					"Dom_Pta_Nro"));
			responsePGE.setDom_Bis_Flg(getChildElementTextByTag(domFiscal,
					"Dom_Bis_Flg"));
			responsePGE.setDom_Ap_Nro(getChildElementTextByTag(domFiscal,
					"Dom_Ap_Nro"));
			responsePGE.setLoc_Id(getChildElementTextByTag(domFiscal, "Loc_Id"));
			responsePGE.setLoc_Nom(getChildElementTextByTag(domFiscal, "Loc_Nom"));
			responsePGE.setDpto_Id(getChildElementTextByTag(domFiscal, "Dpto_Id"));
			responsePGE
					.setDpto_Nom(getChildElementTextByTag(domFiscal, "Dpto_Nom"));
			responsePGE.setDom_Pst_Cod(getChildElementTextByTag(domFiscal,
					"Dom_Pst_Cod"));
			responsePGE.setDom_Coment(getChildElementTextByTag(domFiscal,
					"Dom_Coment"));
			responsePGE.setDom_Err_Cod(getChildElementTextByTag(domFiscal,
					"Dom_Err_Cod"));
			responsePGE.setContactos(getContactos(domFiscal));
			responsePGE.setComplementos(getComplementos(domFiscal));
			logger.debug("se finalizó parseo de datos"); 
			logger.info("Se finalizó invocación servicio DGI_RUTGetEntidad");
		} catch (Exception e) {
			logger.info("Se encontró un error en la invocación servicio DGI_RUTGetEntidad");
		}
		return responsePGE;
	}

	private Proveedor[] obtenerProveedores(String rut) throws AxisFault, MalformedURLException, SOAPException,
			TransformerException, RemoteException, RUPEException {
		ConsultaProveedores_ServiceLocator locatorRupe = new ConsultaProveedores_ServiceLocator();
		CriterioBusquedaProveedor paramRupe = new CriterioBusquedaProveedor();
		ConsultaProveedoresSoapBindingStub stubRupe = new ConsultaProveedoresSoapBindingStub(new URL( Config.GetValuePGE("rupe", Config.WS_URL)), locatorRupe);
		
		pgeFacilitaror.addWSSecurity(stubRupe, "rupe");

		paramRupe.setCodigoPais("URY");
		paramRupe.setTipoDocumento("RUT");
		paramRupe.setNumeroDocumento(rut);
		Proveedor[] provs = null;
		try {
			provs = stubRupe.busquedaProveedores(paramRupe, "SICE");
			logger.info("Se finalizó invocación servicio RUPE");
		} catch (Exception ex) {
			logger.info("Se encontró un error en la invocación servicio RUPE");
		}
		return provs;
	}

	private ObjGirosEmpresa obtenerGirosBPS(String rut, String nroEmpresa, String nombre)
			throws AxisFault, MalformedURLException, SOAPException, TransformerException, RemoteException {
		WsRegEmpresasServiceLocator locGiro = new WsRegEmpresasServiceLocator();
		ParamObtEmpresa paramObtEmpresa = new ParamObtEmpresa();
		WsRegEmpresasV002BindingStub stubGiro = new WsRegEmpresasV002BindingStub(new URL( Config.GetValuePGE("bps.obtenerempresa", Config.WS_URL)),locGiro);
		ObjGirosEmpresa retorno = null;
		pgeFacilitaror.addWSSecurity(stubGiro, "bps.obtenerempresa");
		paramObtEmpresa.setNroEmpresa(nroEmpresa);
		retorno = stubGiro.obtenerEmpresa(paramObtEmpresa).getGirosEmpresa();
		logger.info("Se finalizó invocación servicio BPS_ObtenerEmpresa");
		return retorno;
	}
	 
	private ExecResultType obtenerCertificadoPymeByRUT(String rut)
			throws AxisFault, MalformedURLException, SOAPException, TransformerException, RemoteException {
		
		ApiaWSInterfaceServiceLocator locator = new ApiaWSInterfaceServiceLocator();
		ApiaWSconsulta_pymeSoapBindingStub stub = new ApiaWSconsulta_pymeSoapBindingStub(new URL( Config.GetValuePGE("dinapyme", Config.WS_URL)),locator);
		ExecResultType retorno = null;
		pgeFacilitaror.addWSSecurity(stub, "dinapyme");
		try
		{
			ApiaWSInputType input = new ApiaWSInputType();
			input.setQ_rut(rut);
			retorno = stub.consulta_pyme(input);
			logger.info("Se finalizó invocación servicio CertificadoPymeByRUT");
		}
		catch(Exception ex) {
			logger.info("Se encontró un error en la invocación servicio CertificadoPymeByRUT");
		}
		
		return retorno;
	}
	
	private String obtenerOid(String actividadEconomica)
			throws AxisFault, MalformedURLException, SOAPException, TransformerException, RemoteException {
		
		ServicioConsultasLocator locator = new ServicioConsultasLocator();
		BasicHttpBinding_IServicioConsultasStub stub = new BasicHttpBinding_IServicioConsultasStub(new URL( Config.GetValuePGE("unaoid", Config.WS_URL)),locator);
		
		String oid = null;
		try {
			String xmlOid = stub.realizarBusqueda(1, actividadEconomica,true);
			logger.info("Se finalizó invocación servicio realizarBusquedaOID");
			Document xml = PGEFacilitator.convertStringToXMLDocument(xmlOid);

			XPath xPath = XPathFactory.newInstance().newXPath();
			NodeList nodes = ((NodeList)xPath.evaluate("/busqueda-oid/oid-encontrados/OID/OID-Organizacion", xml, XPathConstants.NODESET));
			if(nodes.getLength()>0)
				oid = nodes.item(0).getTextContent();
		}
		catch(Exception ex) {
			logger.error("Se encontró un error en la invocación servicio realizarBusquedaOID");
		}
		return oid;
	}
	
	private String obtenerCIIU(String descGiro)
			throws AxisFault, MalformedURLException, SOAPException, TransformerException, RemoteException {
		
		ServicioConsultasLocator locator = new ServicioConsultasLocator();
		BasicHttpBinding_IServicioConsultasStub stub = new BasicHttpBinding_IServicioConsultasStub(new URL( Config.GetValuePGE("unaoid", Config.WS_URL)),locator);
		
		String oid = null;
		try {
			String xmlOid = stub.realizarBusqueda(3, descGiro, true);
			logger.info("Se finalizó invocación servicio realizarBusquedaCIIU");
			Document xml = PGEFacilitator.convertStringToXMLDocument(xmlOid);

			XPath xPath = XPathFactory.newInstance().newXPath();
			NodeList nodes = ((NodeList)xPath.evaluate("/busqueda-ciiu/ciiu-encontrados/oid/valor-oid", xml, XPathConstants.NODESET));
			if(nodes.getLength()>0)
				oid = nodes.item(0).getTextContent();
		}
		catch(Exception ex) {
			logger.error("Se encontró un error en la invocación servicio realizarBusquedaCIIU");
		}
		return oid;
	}
	
	private String getLocalidadCode(String depCode, String paisDivision, String locNom) {
		String locCode = Config.GetValueLocalidades(paisDivision,locNom);
		return (locCode != null && !locCode.equals("")) ? (depCode + "-" + locCode) : (depCode + "-" + locNom);
	}

	private String getPaisDivisionCode(String paisDivision) {
		String[] paisParts = paisDivision.split(" ");
		if (paisParts.length == 1) {
			return "UY-" + paisDivision.substring(0, 2);
		} else if (paisParts.length == 2) {
			return "UY-" + paisParts[0].substring(0, 1) + paisParts[1].substring(0, 1);
		} else {
			return "";	
		}
	}

	private String obtenerCodigoNaturalezaJuridica(int tipoSocial) {
		String natJur = "";
		switch (tipoSocial) {
		case 7:
			natJur = "SRL";
			break;
		case 6:
			natJur = "SCOL";
			break;
		case 11:
			natJur = "SAP";
			break;
		case 5:
			natJur = "SH";
			break;
		case 12:
			natJur = "CPR";
			break;
		case 15:
			natJur = "AC";
			break;
		case 10:
			natJur = "SAN";
			break;
		case 8:
			natJur = "SCMS";
			break;
		case 9:
			natJur = "SCA";
			break;
		case 22:
			natJur = "SAGL";
			break;
		case 17:
			natJur = "FND";
			break;
		case 21:
			natJur = "GIE";
			break;
		case 98:
			natJur = "UNP";
			break;
		case 28:
			natJur = "SCA";
			break;
		default:
			break;
		}
		return natJur;
	}
	
	private String obtenerCodigoNaturalezaJuridicaPyme(String tipoSociedad) {
		String natJur = "";
		tipoSociedad = tipoSociedad.toUpperCase();
		natJur = tipoSociedad.equals("UNIPERSONAL") ? "UNP" : (
				tipoSociedad.equals("SOCIEDAD DE HECHO") ? "SH" : (
						tipoSociedad.equals("SOCIEDAD DE RESPONSABILIDAD LIMITADA") ? "SRL" : (
								tipoSociedad.equals("SOCIEDAD ANÓNIMA CON ACCIONES NOMINATIVAS") ? "SAN" : (
										tipoSociedad.equals("COOPERATIVA") ? "CPR" : (
												tipoSociedad.equals("SOCIEDAD ANÓNIMA CON ACCIONES AL PORTADOR") ? "SAP" : (
														tipoSociedad.equals("SOCIEDAD COLECTIVA") ? "SCOL" : (
																tipoSociedad.equals("ASOCIACIÓN CIVIL") ? "AC" : (
																		tipoSociedad.equals("SOCIEDAD DE CAPITAL E INDUSTRIA") ? "SCI" : (
																				tipoSociedad.equals("GRUPO DE INTERÉS ECONÓMICO") ? "GIE" : (
																						tipoSociedad.equals("SOCIEDAD EN COMANDITA POR ACCIONES AL PORTADOR") ? "SCA" : (
																								tipoSociedad.equals("SOCIEDAD EN COMANDITA SIMPLE") ? "SCMS" : ("")
																						)
																				)
																		)
																)
														)
												)
										)	
								)
						)
				)
		);
		return natJur;
	}
	
	private static Document parseXML(String strXML) throws Exception {
		Document xml = null;
		DocumentBuilder db = null;
		StringReader sr = null;
		InputSource is = null;
		try {
			db = DocumentBuilderFactory.newInstance().newDocumentBuilder();
			sr = new StringReader(strXML);
			is = new InputSource(sr);
			xml = db.parse(is);
		} catch (Exception arg8) {
			throw new Exception(
					"Ocurrió algun problema al intentar obtener información en DGI");
		} finally {
			if (sr != null) {
				sr.close();
			}

		}

		return xml;
	}
	
	private static String getChildElementTextByTag(Element father, String tag) {
		String text = null;
		NodeList children = father.getElementsByTagName(tag);
		if (children != null && children.getLength() > 0) {
			text = children.item(0).getTextContent();
		}

		return text;
	}
	
	private static ArrayList<PersonaGetEntidadContacto> getContactos(
			Element father) {
		ArrayList<PersonaGetEntidadContacto> contactos = new ArrayList<PersonaGetEntidadContacto>();
		NodeList xmlContactos = father
				.getElementsByTagName("WS_Entidad.WS_DomicilioFiscalPrincipal.Contacto");
		if (xmlContactos != null && xmlContactos.getLength() > 0) {
			int size = xmlContactos.getLength();

			for (int i = 0; i < size; ++i) {
				Element xmlContacto = (Element) xmlContactos.item(i);
				PersonaGetEntidadContacto contacto = new PersonaGetEntidadContacto();
				contacto.setTipoCtt_Id(getChildElementTextByTag(xmlContacto,
						"TipoCtt_Id"));
				contacto.setTipoCtt_Des(getChildElementTextByTag(xmlContacto,
						"TipoCtt_Des"));
				contacto.setDomCtt_Val(getChildElementTextByTag(xmlContacto,
						"DomCtt_Val"));
				contactos.add(contacto);
			}
		}

		return contactos;
	}
	
	private static ArrayList<PersonaGetEntidadComplemento> getComplementos(
			Element father) {
		ArrayList<PersonaGetEntidadComplemento> complementos = new ArrayList<PersonaGetEntidadComplemento>();
		NodeList xmlComplementos = father
				.getElementsByTagName("WS_Entidad.WS_DomicilioFiscalPrincipal.Complemento");
		if (xmlComplementos != null && xmlComplementos.getLength() > 0) {
			int size = xmlComplementos.getLength();

			for (int i = 0; i < size; ++i) {
				Element xmlComplemento = (Element) xmlComplementos.item(i);
				PersonaGetEntidadComplemento complemento = new PersonaGetEntidadComplemento();
				complemento.setCmpl_Id(getChildElementTextByTag(xmlComplemento,
						"Cmpl_Id"));
				complemento.setCmpl_Dsc(getChildElementTextByTag(
						xmlComplemento, "Cmpl_Dsc"));
				complemento.setDomCmpl_Vlr(getChildElementTextByTag(
						xmlComplemento, "DomCmpl_Vlr"));
				complementos.add(complemento);
			}
		}

		return complementos;
	}
	
 }

