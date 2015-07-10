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
package org.eclipse.amalgam.explorer.contextual.view;

import java.util.Collection;

import org.eclipse.amalgam.explorer.contextual.core.ui.view.ExplorerContextualView;
import org.eclipse.amalgam.explorer.contextual.view.focus.FocusableElementSelectionListener;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbenchPart;

/**
 *
 */
public class AmalgamExplorerContextualView extends ExplorerContextualView{

	/** Unique instance of {@link FocusableElementSelectionListener} **/
	private static FocusableElementSelectionListener FocusableElementSelectionListener = null;
	
	/**
	 * {@inheritDoc}
	 * <p>
	 * Add a {@link FocusableElementSelectionListener} used to control the Focus in open editor command.
	 * </p>
	 */
	@Override
	public void activateListeningToPageSelectionEvents() {
		super.activateListeningToPageSelectionEvents();
		if (FocusableElementSelectionListener == null)
		{
			FocusableElementSelectionListener = new FocusableElementSelectionListener();
			getSite().getPage().addSelectionListener(FocusableElementSelectionListener);
		}
	}
	
	/**
	 * {@inheritDoc}
	 * <p>
	 * Activate navigation by double click.
	 * </p> 
	 */
	@Override
	protected void handleDoubleClickWithCtrlKeyNotPressed(DoubleClickEvent event_p, Object object_p) {
		super.handleDoubleClickWithCtrlKeyPressed(event_p, object_p);
	}
	
	@Override
	public boolean isSemanticElements(Collection<?> objects_p) {
		for (Object object : objects_p) 
		{
			if (false == object instanceof EObject)
				return false;
		}
		return true;
	}

	@Override
	protected String getViewIDForSyncAction() {
		return "org.eclipse.ui.navigator.ProjectExplorer";
	}

	@Override
	protected String ingoredViewAsSelectionProvider() {
		return "org.eclipse.ui.views.PropertySheet";
	}

	@Override
	protected Object handleWorkbenchPageSelectionEvent(IWorkbenchPart part_p, ISelection selection_p) {
		Object result = super.handleWorkbenchPageSelectionEvent(part_p, selection_p);
		
		if (null == result)
		{
			if (!selection_p.isEmpty() && !(part_p instanceof ExplorerContextualView))
			{
				if (selection_p instanceof IStructuredSelection) 
				{
					IStructuredSelection selection_l = (IStructuredSelection) selection_p;
					Object firstElement = selection_l.getFirstElement();
					if (firstElement instanceof EObject) 
					{
						result = firstElement;
					}
					else 
					{
						if (firstElement instanceof EObject) 
							result = firstElement;
					}
				}
			}
		}
		
		return result;
	}

}
