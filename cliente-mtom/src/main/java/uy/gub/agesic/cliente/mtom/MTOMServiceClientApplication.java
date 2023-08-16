package uy.gub.agesic.cliente.mtom;

import java.security.SecureRandom;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;

import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManagerFactory;
import org.apache.axiom.om.OMAbstractFactory;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.OMFactory;
import org.apache.axiom.om.OMNamespace;
import org.apache.axis2.Constants;
import org.apache.axis2.Constants.Configuration;
import org.apache.axis2.addressing.EndpointReference;
import org.apache.axis2.client.Options;
import org.apache.axis2.client.ServiceClient;
import org.apache.axis2.kernel.http.HTTPConstants;
import org.apache.http.impl.client.CloseableHttpClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import uy.gub.agesic.cliente.mtom.pge.Config;
import uy.gub.agesic.cliente.mtom.pge.PGEFacilitator;

@SpringBootApplication
public class MTOMServiceClientApplication implements CommandLineRunner {

	public static final String ARTEE = "artee";
	private static Logger logger = LoggerFactory.getLogger(MTOMServiceClientApplication.class);

	private static PGEFacilitator pgeFacilitaror;


	public static void main(String[] args) {

		Config.loadConfigPGE();

		//Descomentar para ver errores de handshake
		//System.setProperty("javax.net.debug","ssl:handshake:verbose");

		logger.info("Propiedades cargadas");
		SpringApplication.run(MTOMServiceClientApplication.class, args);
		logger.info("Aplicación levantada");
	}


	static {
		String path = MTOMServiceClientApplication.class.getClassLoader()
				.getResource("logging.properties")
				.getFile();
		System.setProperty("java.util.logging.config.file", path);
		logger = LoggerFactory.getLogger(MTOMServiceClientApplication.class.getName());

		pgeFacilitaror = new PGEFacilitator();

	}

	private void addClientCertificate(ServiceClient sender) throws Exception {

		TrustManagerFactory trustManagerFactory = pgeFacilitaror.getTrustManagerFactory(
				Config.getValuePGE(Config.SSL_TRUSTSTORE_FILEPATH), Config.getValuePGE(Config.SSL_TRUSTSTORE_PASS));

		KeyManagerFactory keyManagerFactory = pgeFacilitaror.getKeyManagerFactory(
				Config.getValuePGE(Config.SSL_CLIENT_KEYSTORE_FILEPATH),
				Config.getValuePGE(Config.SSL_CLIENT_KEYSTORE_PASS));

		SSLContext sslContext = SSLContext.getInstance("TLS");
		sslContext.init(keyManagerFactory.getKeyManagers(), trustManagerFactory.getTrustManagers(), new SecureRandom());

		CloseableHttpClient httpClient = PGEFacilitator.getCloseableHttpClient(sslContext);

		Options options = new Options();
		String urlServicio = Config.getValuePGE(ARTEE, Config.WS_URL);
		options.setTo(new EndpointReference(urlServicio));
		options.setProperty(Constants.Configuration.ENABLE_MTOM, Constants.VALUE_TRUE);

		if(urlServicio.toLowerCase().startsWith("https:")) {
			options.setTransportInProtocol(Constants.TRANSPORT_HTTPS);
		} else {
			options.setTransportInProtocol(Constants.TRANSPORT_HTTP);
		}
		Integer timeout = 60000;
		options.setTimeOutInMilliSeconds(timeout);
		options.setProperty(HTTPConstants.SO_TIMEOUT, timeout);
		options.setProperty(HTTPConstants.CONNECTION_TIMEOUT, timeout);
		options.setProperty(Configuration.MTOM_THRESHOLD, 0);
		options.setProperty(HTTPConstants.CACHED_HTTP_CLIENT, httpClient);

		// las opciones anteriores son globales, esta debe definirse según la operación que se está llamando,
		// podría ponerse en un método particular que haga todo lo necesario para poder invocar una determinada operación
		options.setAction(Config.getValuePGE(ARTEE, Config.WS_WSA_ACTION));
		sender.setOptions(options);

	}

	private OMElement getSoapMessageEnviarExpediente(ServiceClient sender, String pathArchivoAEnviar) throws Exception {
		logger.debug("Preparando invocación servicio DGI_RUTGetEntidad");

		pgeFacilitaror.addWSSecurity(sender, ARTEE);
		logger.debug("se agregó header seguridad");
		addClientCertificate(sender);
		logger.debug("se agregó certificado para mutual ssl");

		OMFactory fac = OMAbstractFactory.getOMFactory();
		//se crea namespace del servicio
		OMNamespace omNs = fac.createOMNamespace("http://servicios.pge.red.uy/agesic/artee/EnviarExpediente", "env");

		//se agregan datos de la operación, que en el caso de este servicio, van en el soap header.
		addPayloadInSoapHeader(sender, fac, omNs);

		return addPayloadInSoapBody(pathArchivoAEnviar, fac, omNs);
	}

	/*
		se arma el body del soap, en este caso solo contiene un archivo.
	 */
	private static OMElement addPayloadInSoapBody(String pathArchivoAEnviar, OMFactory fac, OMNamespace omNs) {

		OMElement method = fac.createOMElement("EnviarExpedienteIn", omNs);
		OMElement expediente = fac.createOMElement("Expediente", omNs);
		DataHandler dataHandler = new DataHandler(new FileDataSource(pathArchivoAEnviar));
		expediente.addChild(fac.createOMText(dataHandler, true));
		method.addChild(expediente);
		return method;
	}

	/*
		el servicio de expedientes recibe todos los datos que no son el archivo en el cabezal soap, además este servicio
		requiere que se indique el Action y ReplyTo
	 */
	private static void addPayloadInSoapHeader(ServiceClient sender, OMFactory fac, OMNamespace omNs) {
		OMNamespace omWsaNs = fac.createOMNamespace("http://www.w3.org/2005/08/addressing", "wsa");

		OMElement action = fac.createOMElement("Action", omWsaNs);
		action.setText(
				"http://servicios.pge.red.uy/agesic/artee/EnviarExpediente/ServicioEnviarExpediente/EnviarExpediente");
		sender.addHeader(action);

		OMElement replyTo = fac.createOMElement("ReplyTo", omWsaNs);

		OMElement address = fac.createOMElement("Address", omWsaNs);
		address.setText("http://www.w3.org/2005/08/addressing/anonymous");
		replyTo.addChild(address);
		sender.addHeader(replyTo);

		OMElement anio = fac.createOMElement("Anio", omNs);
		anio.setText("2018");
		sender.addHeader(anio);

		OMElement anioAnterior = fac.createOMElement("AnioAnterior", omNs);
		anioAnterior.setText("2018");
		sender.addHeader(anioAnterior);

		OMElement unidadEjecutoraAnterior = fac.createOMElement("UnidadEjecutoraAnterior", omNs);
		unidadEjecutoraAnterior.setText("001");
		sender.addHeader(unidadEjecutoraAnterior);
		OMElement unidadEjecutora = fac.createOMElement("UnidadEjecutora", omNs);
		unidadEjecutora.setText("001");
		sender.addHeader(unidadEjecutora);

		OMElement subdominioDestino = fac.createOMElement("SubdominioDestino", omNs);
		subdominioDestino.setText("mesaentrada");
		sender.addHeader(subdominioDestino);

		OMElement seccionOrigen = fac.createOMElement("SeccionOrigen", omNs);
		seccionOrigen.setText("sec1");
		sender.addHeader(seccionOrigen);

		OMElement seccionDestino = fac.createOMElement("SeccionDestino", omNs);
		seccionDestino.setText("sec2");
		sender.addHeader(seccionDestino);

		OMElement numeroAnterior = fac.createOMElement("NumeroAnterior", omNs);
		numeroAnterior.setText("00015");
		sender.addHeader(numeroAnterior);

		OMElement numero = fac.createOMElement("Numero", omNs);
		numero.setText("00015");
		sender.addHeader(numero);

		OMElement incisoAnterior = fac.createOMElement("IncisoAnterior", omNs);
		incisoAnterior.setText("14");
		sender.addHeader(incisoAnterior);

		OMElement inciso = fac.createOMElement("Inciso", omNs);
		inciso.setText("14");
		sender.addHeader(inciso);

		OMElement elementosFisicos = fac.createOMElement("ElementosFisicos", omNs);
		elementosFisicos.setText("false");
		sender.addHeader(elementosFisicos);

		OMElement dominioOrigen = fac.createOMElement("DominioOrigen", omNs);
		dominioOrigen.setText("testute.expediente.red.uy");
		sender.addHeader(dominioOrigen);

		OMElement dominioDestino = fac.createOMElement("DominioDestino", omNs);
		dominioDestino.setText("testmvotma.gex.red.uy");
		sender.addHeader(dominioDestino);

		OMElement confidencial = fac.createOMElement("Confidencial", omNs);
		confidencial.setText("false");
		sender.addHeader(confidencial);
	}

	@Override
	public void run(String... args) {
		logger.info("Ejecutando commando");
		if (args.length == 0) {
			System.out.println("Falta nombre de archivo a enviar!");
		}
		try {
			ServiceClient sender = new ServiceClient();

			OMElement payload = getSoapMessageEnviarExpediente(sender, args[0]);
			OMElement result = sender.sendReceive(payload);

			// se busca en forma genérica el nodo xml correspondiente al código de respuesta. En caso de ser exitosa la operación
			// será OK
			String response = result.getFirstElement().getFirstElement().getText();
			logger.info(String.format("SOAP con MTOM enviado, resuesta: %s",response));
			System.out.println("Respuesta: "+response);
		} catch (Exception aE) {
			throw new RuntimeException(aE);
		}
	}
}