package uy.gub.agesic.empresa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import uy.gub.agesic.empresa.conector.pge.Config;

@SpringBootApplication
@EnableSwagger2
@EnableFeignClients
public class EmpresaApplication {
	private static  Logger logger = LoggerFactory.getLogger(EmpresaApplication.class);

	public static void main(String[] args) {
	    Config.LoadConfigPGE();
		Config.LoadConfigLocalidades();
		System.setProperty("ide.direcciones.uri",Config.GetValuePGE("ide.direcciones",Config.WS_URL));

		// Keystore
		System.setProperty("javax.net.ssl.keyStore", Config.GetValuePGE(Config.SSL_CLIENT_KEYSTORE_FILEPATH));
		System.setProperty("javax.net.ssl.keyStorePassword", Config.GetValuePGE(Config.SSL_CLIENT_KEYSTORE_PASS));
		System.setProperty("javax.net.ssl.keyStoreAlias", Config.GetValuePGE(Config.SSL_CLIENT_KEYSTORE_ALIAS));
		System.setProperty("javax.net.ssl.keyStoreType", "JKS");
		
		// Truststore
		System.setProperty("javax.net.ssl.trustStore", Config.GetValuePGE(Config.SSL_TRUSTSTORE_FILEPATH));
		System.setProperty("javax.net.ssl.trustStorePassword", Config.GetValuePGE(Config.SSL_TRUSTSTORE_PASS));
		System.setProperty("javax.net.ssl.trustStoreType", "JKS");

		logger.info("Propiedades cargadas");
		SpringApplication.run(EmpresaApplication.class, args);
		logger.info("Aplicación levantada");
	}
	
	  static {
	      String path = EmpresaApplication.class.getClassLoader()
	                                  .getResource("logging.properties")
	                                  .getFile();
	      System.setProperty("java.util.logging.config.file", path);
	      logger = LoggerFactory.getLogger(EmpresaApplication.class.getName());
	  }
	  


	@Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("uy.gub.agesic.empresa.rest"))
                .paths(PathSelectors.any())
                .build();
    }
}