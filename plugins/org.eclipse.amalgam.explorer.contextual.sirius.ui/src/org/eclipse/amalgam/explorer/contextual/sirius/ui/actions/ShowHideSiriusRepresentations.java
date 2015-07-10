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
package org.eclipse.amalgam.explorer.contextual.sirius.ui.actions;

import org.eclipse.amalgam.explorer.contextual.core.model.IExplorerContextualModel;
import org.eclipse.amalgam.explorer.contextual.core.ui.action.AbstractShowHideAction;

/**
 *
 */
public class ShowHideSiriusRepresentations extends AbstractShowHideAction {

	/** Sirius Diagrams category name **/
	private static final String DIAGRAM_CATEGORY_NAME = "Related Sirius Diagrams"; //$NON-NLS-1$
	
	/** Sirius Tables category name **/
	private static final String TABLE_CATEGORY_NAME = "Related Sirius Tables"; //$NON-NLS-1$
	
	
	/*
	 * (non-Javadoc)
	 * @see oorg.eclipse.amalgam.explorer.contextual.core.ui.action.AbstractShowHideAction#changeCategoriesStates(boolean)
	 */
	@Override
	public void changeCategoriesStates(boolean state_p, IExplorerContextualModel model_p) {
		model_p.setCategoryShowState(DIAGRAM_CATEGORY_NAME, state_p);
		model_p.setCategoryShowState(TABLE_CATEGORY_NAME, state_p);
	}


	/*
	 * (non-Javadoc)
	 * @see org.eclipse.amalgam.explorer.contextual.core.ui.action.AbstractShowHideAction#getInitialState()
	 */
	@Override
	public boolean getInitialState() {
		return true;
	}
	  
	

}
