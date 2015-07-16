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
package org.eclipse.amalgam.explorer.contextual.view.focus;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.amalgam.explorer.contextual.core.ui.view.ExplorerContextualView;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.AbstractSourceProvider;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.ISources;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

/**
 *
 */
public class FocusableElementSourceProvider extends AbstractSourceProvider {

	/** Can Focus **/
	public static final String ENABLED = "ENABLED";

	/** Can't Focus **/
	public static final String DISENABLED = "DISENABLED";

	/** Name of the property used by extension points to track the state **/
	public static final String MY_STATE = "org.eclipse.amalgam.explorer.contextual.command.SelectInCurrentEditorHandler.active";

	/** Selected object **/
	private boolean acceptFocusOnSelection;
	
	/**
	 * Default constructor
	 */
	public FocusableElementSourceProvider() {
		super();
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.ISourceProvider#dispose()
	 */
	@Override
	public void dispose() {
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.ISourceProvider#getCurrentState()
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public Map getCurrentState() {
		Map map = new HashMap(1);
		String value = acceptFocusOnSelection ? ENABLED : DISENABLED;;
		map.put(MY_STATE, value);
		return map;
	}

	/**
	 * returns the properties names used by extension points
	 */
	@Override
	public String[] getProvidedSourceNames() {
		return new String[] { MY_STATE };
	}

	/**
	 * Listen to selection changes on Contextual Explorer View and check if selected element is focusable.
	 */
	public void computeState(IWorkbenchPart part_p, ISelection selection_p) {
		IWorkbenchWindow activeWorkbenchWindow = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
		if (null == activeWorkbenchWindow)
			return;
		
		IWorkbenchPage page = activeWorkbenchWindow.getActivePage();
		if (null == page)
			return;
		
		IEditorPart activeEditor = (IEditorPart) page.getActiveEditor();
		if (null == activeEditor)
		{
			acceptFocusOnSelection = false;
		}
		else
		{
			if (!selection_p.isEmpty() && part_p instanceof ExplorerContextualView)
			{
				if (selection_p instanceof IStructuredSelection) 
				{
					acceptFocusOnSelection = FocusInEditorExtensionsManager.getInstance().accept(activeEditor, selection_p);
				}
				else
				{// Because selection comes from Contextual Explorer View, So all selection objects are IStructuredSelection.
				 // This case is handled just to be safe.
					acceptFocusOnSelection = false;
				}	
			}
//			else
//			{
//				acceptFocusOnSelection = false;
//			}	
		}
		fireSourceChanged(ISources.WORKBENCH, MY_STATE, acceptFocusOnSelection ? ENABLED : DISENABLED);
	}
}
