package uy.gub.agesic.empresa.conector.pge;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import uy.gub.agesic.empresa.rest.EmpresaV1Controller;

import static java.nio.file.StandardWatchEventKinds.ENTRY_MODIFY;

public class Config {
	
	static Logger logger = LoggerFactory.getLogger(EmpresaV1Controller.class);
	
    static  Properties propPGE = new Properties();
    static  Properties propLocalidades = new Properties();
    
    
	public static String DEBUG_LOG_FILE = "debug.log_file";
	public static String DEBUG_LOG_LEVEL = "debug.log_level";
	public static String NAME_LOGGER = "debug.name_logger";
	public static String LOG_TO_CONSOLE = "debug.log_to_console";
	public static String LOG_DIRECTORY = "debug.log_directory";
	public static String LOG_SHOW_TIME = "debug.log_show_time";
	public static String WS_WSA_TO = "wsa_to";
	public static String WS_WSA_ACTION = "wsa_action";
	public static String WS_URL = "url";
	public static String WS_SERVICE = "service";
	public static String WS_STS_ROLE = "sts.role";
	public static String WS_STS_USERNAME = "sts.username";

	public static String SAML_PROPERTY = "conectorpge.saml_property";
	
	public static String STS_URL = "conectorpge.sts.url";
	public static String STS_ISSUER = "conectorpge.sts.issuer";
	public static String STS_POLICY_NAME = "conectorpge.sts.policy_name";
	public static String STS_ROLE = "conectorpge.sts.role";
	public static String STS_USERNAME = "conectorpge.sts.username";
	public static String STS_SERVICE = "conectorpge.sts.service";
	public static String STS_SECURITY_ACTOR = "conectorpge.sts.security_actor";
	
	public static String STS_KEYSTORE_FILEPATH = "conectorpge.sts.keystore.filepath";
	public static String STS_KEYSTORE_PASS = "conectorpge.sts.keystore.pass";
	public static String STS_KEYSTORE_ALIAS = "conectorpge.sts.keystore.alias";
	
	public static String SSL_CLIENT_KEYSTORE_FILEPATH = "conectorpge.ssl_client_keystore.filepath";
	public static String SSL_CLIENT_KEYSTORE_PASS = "conectorpge.ssl_client_keystore.pass";
	public static String SSL_CLIENT_KEYSTORE_ALIAS = "conectorpge.ssl_client_keystore.alias";
	
	public static String SSL_TRUSTSTORE_PASS = "conectorpge.ssl_truststore.pass";
	public static String SSL_TRUSTSTORE_FILEPATH = "conectorpge.ssl_truststore.filepath";
	public static String OPTIONAL_SECURITY_URLS = "optional_security.urls";
	
	public static String FILE_NAME_PGE = "conector-pge.properties";
	public static String FILE_NAME_LOCALIDADES = "localidades.properties";
	
	private static Date LastDateTimeReadPGE = null;
	private static Date LastDateTimeReadLocalidades = null;
	
	public static void LoadConfigPGE() {
		LastDateTimeReadPGE= LoadConfigInternal(propPGE, FILE_NAME_PGE,LastDateTimeReadPGE);
	}
	
	public static String GetValuePGE(String prefix, String propertyName)
	{
		return GetValue(propPGE,prefix + "." + propertyName, "PGE");
	}
	public static String GetValuePGE(String propertyName)
	{
		return GetValue(propPGE,propertyName, "PGE");
	}
	
	public static List<String> GetValuesPGE( String propertyName)
	{
		return GetValues(propPGE,propertyName, "PGE");
	}
	
	public static void LoadConfigLocalidades() {
		LastDateTimeReadLocalidades= LoadConfigInternal(propLocalidades, FILE_NAME_LOCALIDADES,LastDateTimeReadPGE);
	}
	
	public static String GetValueLocalidades(String departamento, String localidad)
	{
		return GetValue(propLocalidades,(departamento + "." + localidad).replace(' ',  '_').toUpperCase(), "Localidades");
	}
	
	public static List<String> GetValuesLocalidades( String propertyName)
	{
		return GetValues(propLocalidades,propertyName, "Localidades");
	}
	
	private static Date LoadConfigInternal(Properties prop, String configFileName, Date LastDate)
	{
		Date today = new Date();
		//if(prop.isEmpty() || LastDate == null ||  ( today.getTime() - LastDate.getTime()) / (60 * 1000) > 15 )
		{
			try {
		        
				 logger.info("Cargando configuración.");
			     LoadProperties(prop, configFileName);
			     return today;
			}
			catch (Exception ex) {
		         ex.printStackTrace();
		    }
			
		}
		return LastDate;
	}
	private static void LoadProperties(final Properties prop, final String configFileName) throws IOException {
	
			Path currentRelativePath = Paths.get(configFileName);
		
			 InputStream input = new FileInputStream(currentRelativePath.toAbsolutePath().toString() );
	     //  prop = new Properties();
	
	       if (input == null) {
	    	   logger.error("Sorry, unable to find config.properties");
	           return;
	       }
	
	       //load a properties file from class path, inside static method
	       prop.load(input);
	       input.close();
		
	}
	
	private static String GetValue(Properties prop, String propertyName, String configName)
	{
		String value=null; 
		try
		{
			value =prop.getProperty(propertyName);
			logger.debug(configName+" propiedad '"+propertyName+"', valor: '"+ value+"'");
		}
		catch(Exception ex)
		{
			logger.debug(configName+" propiedad '"+propertyName+"', valor: null");
		}
		
		return value;
	}

	private static List<String> GetValues(Properties prop, String propertyName, String configName)
	{
		String value=null; 
		List<String> list = new ArrayList<String>();
		Set<Object> keys = prop.keySet();
		for(Object oKey : prop.keySet())
		{
			if(((String)oKey).startsWith((String)propertyName+"["))
			{
				try
				{
					value =prop.getProperty((String)oKey);
					logger.debug(configName+" propiedad '"+propertyName+"', valor: '"+ value+"'");
				}
				catch(Exception ex)
				{
					logger.debug(configName+" propiedad '"+propertyName+"', valor: null");
				}
				list.add(value);
			}
		}
		return list;
	}
	

}
