/********************************************************************************
 * MIT Java Wordnet Interface (JWI)
 * Copyright (c) 2007-2008 Massachusetts Institute of Technology
 *
 * This is the non-commercial version of JWI.  This version may *not* be used
 * for commercial purposes.
 * 
 * This program and the accompanying materials are made available by the MIT
 * Technology Licensing Office under the terms of the MIT Java Wordnet Interface 
 * Non-Commercial License.  The MIT Technology Licensing Office can be reached 
 * at 617-253-6966 for further inquiry.
 *******************************************************************************/

package edu.mit.jwi.item;

/**
 * Indicates that the implementing object has an ID object of type T, which is
 * returned by the call.
 * 
 * @author Mark A. Finlayson
 * @version 2.1.5, Nov. 16, 2007
 * @since 1.5
 */
public interface IItem<T extends IItemID<?>> {

	/**
	 * Returns the ID object.
	 * 
	 * @return T The ID object
	 */
	public T getID();

}