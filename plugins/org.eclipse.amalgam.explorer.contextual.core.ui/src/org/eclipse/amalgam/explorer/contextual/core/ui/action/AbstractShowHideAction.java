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
package org.eclipse.amalgam.explorer.contextual.core.ui.action;

import org.eclipse.amalgam.explorer.contextual.core.model.IExplorerContextualModel;
import org.eclipse.amalgam.explorer.contextual.core.ui.view.IExplorerContextualViewPart;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IViewActionDelegate;
import org.eclipse.ui.IViewPart;

/**
 *
 */
public abstract class AbstractShowHideAction implements IViewActionDelegate {

	/** The Contextual Explorer view **/
	protected IExplorerContextualViewPart _view;
	
	/**
	 * Allows to change to change the state of related Category/Categories.
	 * @param state_p the new state
	 * @param model_p the Contextual Explorer model. It is used to read and set 
	 * 		  the value of a category show state
	 */
	public abstract void changeCategoriesStates(boolean state_p, IExplorerContextualModel model_p);
	
	/**
	 * @return allows implementers to set the initial value of the Category/Categories show state
	 */
	public abstract boolean getInitialState();
	
	/**
	 * Update categories state and update the Contextual Explorer View.
	 * @param state_p the value of related categories state 
	 */
	protected void updateView(boolean state_p){
		changeCategoriesStates(state_p, _view.getModel());
		Object input = _view.getCurrentViewer().getInput();
		_view.setInputOnViewers(input);
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.IActionDelegate#run(org.eclipse.jface.action.IAction)
	 */
	@Override
	public void run(IAction action_p) {
		updateView(action_p.isChecked());
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.IActionDelegate#selectionChanged(org.eclipse.jface.action.IAction, org.eclipse.jface.viewers.ISelection)
	 */
	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		// nothing to do
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.IViewActionDelegate#init(org.eclipse.ui.IViewPart)
	 */
	@Override
	public void init(IViewPart view_p) {
		_view = (IExplorerContextualViewPart) view_p;
		
		// Initialize to true the Show state of the Sirius categories.
		changeCategoriesStates(true, _view.getModel());
		
		// Update the view content.
		updateView(getInitialState());
	}
}
