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
package org.eclipse.amalgam.explorer.contextual.core.ui.view.ext;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.amalgam.explorer.contextual.core.ext.AbstractExtensionPointManager;
import org.eclipse.amalgam.explorer.contextual.core.ui.ExplorerContextualActivator;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IWorkbenchPart;

/**
 *
 */
public class SelectionHelpersManager extends AbstractExtensionPointManager implements ISelectionHelper{
	
	/** Singleton property **/
	private static SelectionHelpersManager _instance ;
	
	/** Selection helper configuration element name**/
	private static final String _SELECTION_HELPER = "selectionHelper";
	
	/** Selection Helper registry **/
	private Map<String, ISelectionHelper> _extensions ;
	
	/**
	 * Singleton method.
	 * @return Unique {@link SelectionHelpersManager} instance
	 */
	public static SelectionHelpersManager getInstance() {
		if (null == _instance)
			_instance = new SelectionHelpersManager();

		return _instance;
	}
	
	/**
	 * Hidden constructor.
	 */
	private SelectionHelpersManager() {
		_extensions = new HashMap<String, ISelectionHelper>();
		initExtensionRegistry();
	}
	
	/**
	 * Handle the selection element.
	 */
	@Override
	public Object getSelection(IWorkbenchPart part_p, ISelection selection_p, Object selectedObject) {
		Object result = null;
		
		if (false == _extensions.isEmpty())
		{
			for (ISelectionHelper iSelectionHelper : _extensions.values()) 
			{
				Object selection = iSelectionHelper.getSelection(part_p, selection_p, selectedObject);
				if (null != selection)
				{
					result = selection;
					break;
				}
			}
		}
		
		return result;
	}
	
	/**
	 * Load all Selection helpers
	 */
	public void initExtensionRegistry(){
		IConfigurationElement[] confElements = 
				getConfigurationElementsFor(ExplorerContextualActivator.PLUGIN_ID, _SELECTION_HELPER);
		
		for (IConfigurationElement iConfigurationElement : confElements) 
		{
			String id = iConfigurationElement.getAttribute(DEFAULT_ID_ATTRIBUTE);
			ISelectionHelper helper = createTypedInstance(iConfigurationElement, DEFAULT_CLASS_ATTRIBUTE, ISelectionHelper.class);
			
			if (false == _extensions.containsKey(id))
			{
				_extensions.put(id, helper);
			}
			else 
			{
				String message = "Many Selection helpers share id : " + id;
				Status status = new Status(IStatus.WARNING, ExplorerContextualActivator.PLUGIN_ID, message);
				ExplorerContextualActivator.getDefault().getLog().log(status);
			}
		}
	}
}
