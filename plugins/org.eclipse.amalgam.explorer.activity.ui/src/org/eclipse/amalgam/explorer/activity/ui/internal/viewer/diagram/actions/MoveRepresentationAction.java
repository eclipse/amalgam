/*******************************************************************************
 * Copyright (c)  2006, 2015 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Thales - initial API and implementation
 *******************************************************************************/
package org.eclipse.amalgam.explorer.activity.ui.internal.viewer.diagram.actions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.ActionContributionItem;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.business.api.session.danalysis.DAnalysisSession;
import org.eclipse.sirius.ui.business.api.session.IEditingSession;
import org.eclipse.sirius.ui.business.api.session.SessionUIManager;
import org.eclipse.sirius.viewpoint.DAnalysis;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.sirius.viewpoint.DSemanticDecorator;
import org.eclipse.sirius.viewpoint.ViewpointPackage;
import org.eclipse.sirius.viewpoint.provider.SiriusEditPlugin;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.actions.BaseSelectionListenerAction;
import org.eclipse.ui.plugin.AbstractUIPlugin;

/**
 * Move a representation between airds owned by the same session.
 * 
 */
public class MoveRepresentationAction extends BaseSelectionListenerAction {
	/**
	 * Menu manager id created to contain available move actions.
	 */
	public static final String MOVE_DIAGRAMS_MENU_ID = "MoveDiagrams.Menu.ID"; //$NON-NLS-1$

	/**
	 * Constructor.
	 */
	public MoveRepresentationAction() {
		super(""); // This action is not displayed. //$NON-NLS-1$
	}

	/**
	 * Latest selection of representations to move.
	 */
	private ArrayList<DRepresentation> _representationsToMove;
	private Session _session;
	private Collection<Resource> _availableTargetResources;

	public void run(IAction action_p) {
		// Do nothing because this action is not run.
	}

	public void dispose() {
		if (null != _representationsToMove) {
			_representationsToMove.clear();
		}
		if (null != _availableTargetResources) {
			_availableTargetResources.clear();
		}
		_session = null;
	}

	/**
	 * @see org.eclipse.ui.actions.BaseSelectionListenerAction#updateSelection(org.eclipse.jface.viewers.IStructuredSelection)
	 */
	@Override
	public boolean updateSelection(IStructuredSelection selection_p) {
		if (selection_p.isEmpty()) {
			return false;
		}
		boolean enabled = true;
		// Clean previous execution.
		_representationsToMove = new ArrayList<DRepresentation>(0);
		_session = null;
		Iterator<?> iterator = selection_p.toList().iterator();
		while (iterator.hasNext() && enabled) {
			Object element = iterator.next();
			// Got a representation, store it.
			if (element instanceof DRepresentation) {
				// Add representation.
				_representationsToMove.add((DRepresentation) element);
				if (null != _session) {
					enabled = SessionManager.INSTANCE.getSession(((DSemanticDecorator) element).getTarget()).equals(
							_session);
				} else {
					_session = SessionManager.INSTANCE.getSession(((DSemanticDecorator) element).getTarget());
					enabled = null != _session;
				}
			} else {
				// One selected is not a representation.
				enabled = false;
				break;
			}
		}
		if (enabled) {
			_availableTargetResources = new ArrayList<Resource>(((DAnalysisSession) _session).getAllSessionResources());
			Collection<Resource> representationResources = collectRepresentationResources(_representationsToMove);
			_availableTargetResources.removeAll(representationResources);
			// Check if a common target resource exist to move on.
			enabled = !_availableTargetResources.isEmpty();
		}
		// Return the action enablement state.
		return enabled;
	}

	/**
	 * Collect the representations resources.
	 * 
	 * @param movableRepresentations_p
	 * @return a not <code>null</code> collection.
	 */
	private Collection<Resource> collectRepresentationResources(Collection<DRepresentation> movableRepresentations_p) {
		Collection<Resource> result = new HashSet<Resource>();
		for (DRepresentation representation : movableRepresentations_p) {
			result.add(representation.eResource());
		}
		return result;
	}

	/**
	 * Get all available move actions.
	 * 
	 * @return a not <code>null</code> collection.
	 */
	public Collection<IAction> getMoveActions() {
		ArrayList<IAction> actions = new ArrayList<IAction>(0);
		for (final Resource availableTargetResource : _availableTargetResources) {
			Collection<DAnalysis> availableDAnalysys = EcoreUtil.getObjectsByType(
					availableTargetResource.getContents(), ViewpointPackage.eINSTANCE.getDAnalysis());
			for (DAnalysis dAnalysis : availableDAnalysys) {
				actions.add(createMoveRepresentationsActions((DAnalysisSession) _session, _representationsToMove,
						dAnalysis));
			}
		}
		return actions;
	}

	/**
	 * Code copied from DesignerSessionView.
	 * 
	 * @param session
	 * @param movableRepresentations
	 * @param targetAnalysis
	 * @return
	 */
	private Action createMoveRepresentationsActions(final DAnalysisSession session,
			final Collection<DRepresentation> movableRepresentations, final DAnalysis targetAnalysis) {
		ImageDescriptor descriptor = AbstractUIPlugin.imageDescriptorFromPlugin(SiriusEditPlugin.ID,
				"/icons/full/others/forward.gif"); //$NON-NLS-1$
		return new Action(Messages.MoveRepresentationAction_1 + targetAnalysis.eResource().getURI(), descriptor) {
			/**
			 * @see org.eclipse.jface.action.Action#run()
			 */
			@Override
			public void run() {

				session.getTransactionalEditingDomain().getCommandStack()
						.execute(new RecordingCommand(session.getTransactionalEditingDomain()) {
							/**
							 * @see java.lang.Runnable#run()
							 */
							@Override
							public void doExecute() {
								final IEditingSession uiSession = SessionUIManager.INSTANCE.getUISession(session);
								if (uiSession != null) {
									for (final DRepresentation representation : movableRepresentations) {
										closeOpenedEditor(uiSession, representation);
									}
								}
								for (final DRepresentation representation : movableRepresentations) {
									session.moveRepresentation(targetAnalysis, representation);
								}
							}

							private void closeOpenedEditor(final IEditingSession uiSession,
									final DRepresentation representation) {
								final IEditorPart editor = uiSession.getEditor(representation);
								if (editor != null) {
									editor.getEditorSite().getPage().closeEditor(editor, false);
								}
							}
						});
			}
		};
	}

	/**
	 * Fill context sub menu for move diagrams action.
	 * 
	 * @param structuredSelection_p
	 * @return a sub menu manager with all real move actions.
	 */
	public IMenuManager fillContextMenu(IStructuredSelection structuredSelection_p) {
		IMenuManager subMenuManager = new MenuManager(Messages.MoveRepresentationAction_2);
		updateSelection(structuredSelection_p);
		// In this case, check really if the action is compatible with current
		// selection.
		if (isEnabled()) {
			for (IAction containedAction : getMoveActions()) {
				addAction(subMenuManager, null, containedAction);
			}
		}
		return subMenuManager;
	}

	/**
	 * Add a dynamic action
	 * 
	 * @param menu_p
	 * @param groupId_p
	 * @param action
	 */
	protected void addAction(IMenuManager menu_p, String groupId_p, IAction action) {
		// Override the action contribution item to force the context menu to be
		// refreshed even if the selected object has not changed.
		ActionContributionItem item = new ActionContributionItem(action) {
			@Override
			public boolean isDirty() {
				return true;
			}

			@Override
			public boolean isDynamic() {
				return true;
			}
		};
		// Append the action to a group if provided...
		if (null != groupId_p) {
			menu_p.appendToGroup(groupId_p, item);
		} else {
			menu_p.add(item);
		}
	}
}
