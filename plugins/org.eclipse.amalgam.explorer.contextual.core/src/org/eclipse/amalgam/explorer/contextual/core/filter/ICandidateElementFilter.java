/*******************************************************************************
 * Copyright (c) 2006, 2015 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *    Thales - initial API and implementation
 *******************************************************************************/
package org.eclipse.amalgam.explorer.contextual.core.filter;

/**
 * This interface allows contributor to add filter on element returned by an IQuery.
 */
public interface ICandidateElementFilter {
	
	/**
	 * Check if the filter must be active on a given Candidate Element.
	 * @param object the candidate element
	 * @return True if the filter must be active on the candidate element<code>object<code/>, False otherwise.
	 */
	public boolean select(Object object);
	
	/**
	 * Accept or not the Candidate Element 
	 * @param object the candidate element
	 * @return True if the candidate element is to display in Contextual Explorer View, False otherwise.
	 */
	public boolean accept(Object object);
}
