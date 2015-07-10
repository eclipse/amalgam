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
package org.eclipse.amalgam.explorer.contextual.view.handlers;

import org.eclipse.amalgam.explorer.contextual.core.ui.view.ExplorerContextualView;
import org.eclipse.amalgam.explorer.contextual.view.focus.FocusInEditorExtensionsManager;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.expressions.IEvaluationContext;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;

/**
 *
 */
public class SelectInCurrentEditorHandler extends AbstractHandler{

	@Override
	public Object execute(ExecutionEvent event_p) throws ExecutionException {
		Object applicationContext = event_p.getApplicationContext();
		if (applicationContext instanceof IEvaluationContext)
		{
			IEvaluationContext evaluationContext = (IEvaluationContext) applicationContext;
			Object variable = evaluationContext.getVariable("activePart");
			if (variable instanceof IViewPart && variable instanceof ExplorerContextualView)
			{
				ExplorerContextualView explorerContextualView = (ExplorerContextualView) variable;
				ISelection selection = explorerContextualView.getSite().getSelectionProvider().getSelection();
				if (selection instanceof IStructuredSelection)
				{
					IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
					IEditorPart activeEditor = (IEditorPart) page.getActiveEditor();
					
					if (activeEditor != null)
					{
//						boolean wasViewListeningToSelectionChanges = false;
//						if (ExplorerContextualView.isListeningToPageSelectionEvents())
//						{
//							explorerContextualView.deactivateListeningToPageSelectionEvents(); 
//							wasViewListeningToSelectionChanges = true;
//						}
						
						boolean done = FocusInEditorExtensionsManager.getInstance().doFocus(activeEditor, selection);
						if (done)
						{// This is not needed because it change selection and focus on new element in the Contextual Explorer.
//							page.activate(activeEditor);
//							activeEditor.setFocus();
						}
						else
						{
							// Display a pop-up dialog informing user that focus can't be done in the current editor
							Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
							MessageDialog.openInformation(shell, "Contextual Explorer", "Can't focus on the selected element in the open editor");
						}
						
//						if (wasViewListeningToSelectionChanges)
//						{
//							explorerContextualView.activateListeningToPageSelectionEvents();
//						}
					}
					else
					{
						// Display a pop-up dialog that there is no open editor
						Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
						MessageDialog.openInformation(shell, "Contextual Explorer", "There is no open editor");
					}
				}
			}
		}
		return null;
	}
}
