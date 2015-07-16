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
package org.eclipse.amalgam.explorer.contextual.core.ui.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

import org.eclipse.amalgam.explorer.contextual.core.category.CategoryImpl;
import org.eclipse.amalgam.explorer.contextual.core.category.ICategory;
import org.eclipse.amalgam.explorer.contextual.core.model.IExplorerContextualModel;

public class ExplorerContextualModel implements IExplorerContextualModel {

	/** This Map is used to store the categories show state **/
	protected Map<String, Boolean> _categoryShowHide = new HashMap<String, Boolean>();

	protected boolean limitateTreeExpansion = false; // default value
	
	protected Hashtable<String, List<String>> explorerID2ExpandedObjectHashcodes = new Hashtable<String, List<String>>();


	/*
	 * (non-Javadoc)
	 * @see org.eclipse.amalgam.explorer.contextual.core.model.IExplorerContextualModel#setCategoryShowState(java.lang.String, boolean)
	 */
	public void setCategoryShowState(String categoryName_p, boolean showState_p){
		_categoryShowHide.put(categoryName_p, showState_p);
	}

	/**
	 * Return the value of the category state saved in the model ({@link IExplorerContextualModel})
	 * If there is no saved state in the model, the default value is True.
	 * @param categoryName_p name of the category
	 * @return True is the category show state is on or if there is no saved state for the category. 
	 *         False otherwise
	 */
	public boolean getCategoryShowState(String categoryName_p){
		if (_categoryShowHide.containsKey(categoryName_p))
			return _categoryShowHide.get(categoryName_p).booleanValue();
		return true;
	}

	@Override
	public boolean doesLimitateTreeExpansion() {
		return limitateTreeExpansion;
	}

	@Override
	public void setLimitateTreeExpansion(boolean limitateTreeExpansion_p) {
		limitateTreeExpansion = limitateTreeExpansion_p;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.amalgam.explorer.contextual.core.model.IExplorerContextualModel#doesShowCategory(org.eclipse.amalgam.explorer.contextual.core.category.ICategory)
	 */
	@Override
	public boolean doesShowCategory(ICategory category) {
		if (_categoryShowHide.containsKey(category.getName()))
			return getCategoryShowState(category.getName());

		return true;
	}

	@Override
	public void saveExpandedState(CategoryImpl category, String explorerID, boolean expanded) {
		List<String> expandedObjects = getOrCreateHistory(explorerID);
		String hashcode = getHashcode(category);
		if (expandedObjects.contains(hashcode) && !expanded) {
			expandedObjects.remove(hashcode);
		} else if (!expandedObjects.contains(hashcode) && expanded) {
			expandedObjects.add(hashcode);
		}
	}

	@Override
	public boolean getExpandedState(ICategory category, String explorerID) {
		if (doesLimitateTreeExpansion()) {
			List<String> expandedObjects = explorerID2ExpandedObjectHashcodes.get(explorerID);
			if (expandedObjects != null) {
				if (!expandedObjects.contains(getHashcode(category))) {
					return false;
				}
			}
		}
		return true;
	}

	@Override
	public boolean containsExpandedHistory(String explorerID) {
		return explorerID2ExpandedObjectHashcodes.containsKey(explorerID);
	}

	@Override
	public List<String> getOrCreateHistory(String explorerID) {
		List<String> nonExpandedObjects = explorerID2ExpandedObjectHashcodes.get(explorerID);
		if (nonExpandedObjects == null) {
			nonExpandedObjects = new ArrayList<String>();
			explorerID2ExpandedObjectHashcodes.put(explorerID, nonExpandedObjects);
		}
		return nonExpandedObjects;
	}

	private String getHashcode(ICategory category) {
		return category.getName();
	}
}
