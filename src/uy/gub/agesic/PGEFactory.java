package uy.gub.agesic;

import uy.gub.agesic.opensaml.AssertionManagerImpl;

/**
 * @author Guzman Llambias
 *
 */
public class PGEFactory {
	
	public static AssertionManager getAssertionManager(){
		return new AssertionManagerImpl();
	}
}
