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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.amalgam.explorer.contextual.Activator;
import org.eclipse.amalgam.explorer.contextual.core.ext.AbstractExtensionPointManager;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IEditorPart;

/**
 *
 */

public class FocusInEditorExtensionsManager extends AbstractExtensionPointManager{
	/** Focus Manager configuration element name. **/
	private static final String _FOCUSMANAGER_EXTPOINT_ID = "FocusInEditor";
	
	/** List of all Focus Managers available in the platform .**/
	private static List<IFocusInEditor> _focusRegistry;

	/** Singleton property **/
	private static FocusInEditorExtensionsManager _instance = null;
	
	/**
	 * Singleton getter.
	 * @return a unique {@link FocusInEditorExtensionsManager}
	 */
	public static FocusInEditorExtensionsManager getInstance(){
		if (_instance == null)
			_instance = new FocusInEditorExtensionsManager();
		
		return _instance;
	}
	
	/**
	 * Hidden constructor
	 */
	protected FocusInEditorExtensionsManager() {
		_focusRegistry = new ArrayList<IFocusInEditor>();
		initRegistry();
	}
	
	/**
	 * Check if there is a Focus Manager that accepts to handle selection.
	 * @param activeEditor_p
	 * @param selection_p
	 * @return
	 */
	public boolean accept(IEditorPart activeEditor_p, ISelection selection_p){
		for (IFocusInEditor iFocusInEditor : _focusRegistry) 
		{
			boolean accept = iFocusInEditor.accept(activeEditor_p, selection_p);
			if (accept)
			{
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Find a focus manager that accept to do the focus action of the <code>activeEditor_p</code> Editor.
	 * @see IFocusInEditor#focusInEditor(IEditorPart, ISelection)
	 */
	public boolean doFocus(IEditorPart activeEditor_p, ISelection selection_p){
		for (IFocusInEditor iFocusInEditor : _focusRegistry) 
		{
			boolean accept = iFocusInEditor.accept(activeEditor_p, selection_p);
			if (accept)
			{
				return iFocusInEditor.focusInEditor(activeEditor_p, selection_p);
			}
		}
		return false;
	}
	
	/**
	 * Initialize focus manager Registry
	 */
	private void initRegistry() {
		IConfigurationElement[] configurationElements = 
				getConfigurationElementsFor(Activator.PLUGIN_ID, _FOCUSMANAGER_EXTPOINT_ID);
		
		for (IConfigurationElement iConElement : configurationElements) 
		{
			IFocusInEditor focusManager = createTypedInstance(iConElement, DEFAULT_CLASS_ATTRIBUTE, IFocusInEditor.class) ;
			if (focusManager != null)
			{
				_focusRegistry.add(focusManager);
			}
		}
	}
	
}
