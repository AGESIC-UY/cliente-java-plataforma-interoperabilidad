/**
 * 
 */
package uy.gub.agesic.exceptions;

/**
 * @author Guzman Llambias
 *
 */
public class AssertionException extends Exception{

	private static final long serialVersionUID = 4678505971718224800L;

	public AssertionException(String message, Exception e){
		super(message, e);
	}
}
