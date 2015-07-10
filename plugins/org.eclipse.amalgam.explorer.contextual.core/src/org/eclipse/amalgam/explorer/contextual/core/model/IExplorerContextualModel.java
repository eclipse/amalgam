/******************************************************************************
 * Copyright (c) 2006, 2015 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *    Thales - initial API and implementation
 *****************************************************************************/
package org.eclipse.amalgam.explorer.contextual.core.model;

import java.util.List;

import org.eclipse.amalgam.explorer.contextual.core.category.CategoryImpl;
import org.eclipse.amalgam.explorer.contextual.core.category.ICategory;

public interface IExplorerContextualModel {

	/**
	 * This allows to initialize a category show state.
	 * @param categoryName_p the name of the category
	 * @param showState_p the new state of the category Show/Hide.
	 */
	public void setCategoryShowState(String categoryName_p, boolean showState_p);
	
	/**
	 * Return the show state of a category
	 * @param categoryName_p the name of the category to return it's show state
	 * @return True means that the category will be displayed, False otherwise.
	 */
	public boolean getCategoryShowState(String categoryName_p);

	public boolean doesLimitateTreeExpansion();

	public void setLimitateTreeExpansion(boolean limitateTreeExpansion_p);

	public boolean doesShowCategory(ICategory category_p);

	public void saveExpandedState(CategoryImpl category, String explorerID, boolean expanded);

	public boolean getExpandedState(ICategory category, String explorerID);

	public boolean containsExpandedHistory(String explorerID);

	public List<String> getOrCreateHistory(String explorerID);
}
