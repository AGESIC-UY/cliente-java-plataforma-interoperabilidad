/**
 * 
 */
package uy.gub.agesic;

/**
 * @author Guzman Llambias
 *
 */
public class AgesicConstants {

	public final static String SAML10_PASSWD_AUTH_METHOD = "urn:oasis:names:tc:SAML:1.0:am:password";
	public final static String SAML10_BEARER_CONFIRMATION_METHOD = "urn:oasis:names:tc:SAML:1.0:cm:bearer";
	public final static String USER_ATTRIBUTE_NAME = "User";
	public final static String STS_URL    = "http://testservicios.pge.red.uy:6001/TrustServer/SecurityTokenService";
	public final static String STS_URL_SSL    = "https://testservicios.pge.red.uy:6051/TrustServer/SecurityTokenServiceProtected";
	public final static String SOAPAction = "\"\"";
	public static final String SAML1_PROPERTY = "uy.gub.agesic.security.saml";
	public static final String SAML_ACTOR = "actorDP";
}
