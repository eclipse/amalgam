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

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.services.ISourceProviderService;

/**
 *
 */
public class FocusableElementSelectionListener implements ISelectionListener {

	@Override
	public void selectionChanged(IWorkbenchPart part_p, ISelection selection_p) {
	    IWorkbenchWindow activeWorkbenchWindow = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
		ISourceProviderService iSourceProviderService = 
				(ISourceProviderService) activeWorkbenchWindow.getService(ISourceProviderService.class);
	    
	    FocusableElementSourceProvider focusCommandStateService = 
	    		(FocusableElementSourceProvider) iSourceProviderService.getSourceProvider(FocusableElementSourceProvider.MY_STATE);
	    
	    focusCommandStateService.computeState(part_p, selection_p);
	}
}
