/**
 * 
 */
package uy.gub.agesic.exceptions;


/**
 * @author Guzman Llambias
 *
 */
public class RequestSecurityTokenException extends Exception {

	private static final long serialVersionUID = 7230871535650935860L;

	public RequestSecurityTokenException(String message){
		super(message);		
	}

	public RequestSecurityTokenException(Exception e) {
		super(e);
	}
}
