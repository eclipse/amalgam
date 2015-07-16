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
package org.eclipse.amalgam.explorer.contextual.sirius.ui.handlers;

import org.eclipse.amalgam.explorer.contextual.core.ui.view.ExplorerContextualView;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.expressions.IEvaluationContext;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.ui.business.api.dialect.DialectUIManager;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.sirius.viewpoint.DSemanticDecorator;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IViewPart;

public class OpenDiagramHandler extends AbstractHandler {

	/** Current selected diagram. **/
	private ISelection _selection;

	/** Contextual Explorer view. **/
	private ExplorerContextualView _explorerContextualView;

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		boolean init = init(event);
		if (init)
		{
			opendiagram();
		}

		return null;
	}

	public void opendiagram(){
		IStructuredSelection structuredSelection = (IStructuredSelection) _selection;
		// This action is only available for DSemanticDiagram with at least one element.
		DRepresentation representation = (DRepresentation) structuredSelection.getFirstElement();
		// Deactivate listening events during diagram opening since the open editor will change it to something that is not the end-user concern.
		boolean listeningToPageSelectionEvents = ExplorerContextualView.isListeningToPageSelectionEvents();
		EObject target = getTarget(representation);
		if (null != target) 
		{
			try 
			{
				if (listeningToPageSelectionEvents) 
				{
					_explorerContextualView.deactivateListeningToPageSelectionEvents();
				}
				Session session = SessionManager.INSTANCE.getSession(target);
				IEditorPart openEditor = DialectUIManager.INSTANCE.openEditor(session, representation, new NullProgressMonitor());

				if (null == openEditor)
				{
					// Log an Error message
				}

			} 
			finally 
			{
				// Enable again the listening if needed.
				if (listeningToPageSelectionEvents) 
				{
					_explorerContextualView.activateListeningToPageSelectionEvents();
				}
			}
		}
	}

	public boolean init(ExecutionEvent event_p){
		Object applicationContext = event_p.getApplicationContext();
		if (applicationContext instanceof IEvaluationContext)
		{
			IEvaluationContext evaluationContext = (IEvaluationContext) applicationContext;
			Object variable = evaluationContext.getVariable("activePart");
			if (variable instanceof IViewPart && variable instanceof ExplorerContextualView)
			{
				_explorerContextualView = (ExplorerContextualView) variable;
				_selection = _explorerContextualView.getSite().getSelectionProvider().getSelection();
				return true;
			}
		}

		return false;
	}

	protected EObject getTarget(EObject representation){
		if (representation instanceof DRepresentation)
		{
			DSemanticDecorator sDecorator = (DSemanticDecorator) representation;
			return sDecorator.getTarget();
		}
		return null;
	}

}
