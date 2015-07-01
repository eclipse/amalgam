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
package org.eclipse.amalgam.explorer.activity.internal.viewer.diagram.actions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.amalgam.explorer.activity.internal.viewer.diagram.actions.CloneDiagramCommand.ICloneListener;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.sirius.viewpoint.DSemanticDecorator;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.BaseSelectionListenerAction;

public class CloneAction extends BaseSelectionListenerAction {
	/**
	 * Latest selection of representations.
	 */
	private Collection<DRepresentation> _representations;

	/**
	 * Common viewer reminder.
	 */
	protected TreeViewer _viewer;

	/**
	 * Constructor.
	 */
	public CloneAction(TreeViewer viewer_p) {
		super(Messages.CloneAction_0);
		_viewer = viewer_p;
	}

	/**
	 * Get selected representations.
	 * 
	 * @param selectedElements_p
	 *            A list of selected elements.
	 * @return A not <code>null</code> (possibly empty) collection of
	 *         representations.
	 */
	protected Collection<DRepresentation> getSelectedRepresentations(List<?> selectedElements_p) {
		// Resulting collection.
		Collection<DRepresentation> result = null;
		// Cycle through selected elements.
		for (Object element : selectedElements_p) {
			// Got a representation, store it.
			if (element instanceof DRepresentation) {
				// Lazy initialization.
				if (null == result) {
					result = new ArrayList<DRepresentation>(1);
				}
				// Add representation.
				result.add((DRepresentation) element);
			}
		}
		// Do not return a null collection.
		if (null == result) {
			result = Collections.emptyList();
		}
		return result;
	}

	/**
	 * @see org.eclipse.jface.action.Action#run()
	 */
	@Override
	public void run() {
		CloneDiagramCommand command = new CloneDiagramCommand(_representations);
		// Add a listener that refreshes the model explorer during
		// execution/undo/redo operations.
		command.addCloneListener(new ICloneListener() {

			public void cloneAboutToBeRemoved(final DRepresentation clone_p, Session session_p) {
				// Remove element from the viewer.
				if (null != _viewer) {
					Runnable removeRunnable = new Runnable() {
						/**
						 * @see java.lang.Runnable#run()
						 */
						public void run() {
							_viewer.remove(clone_p);
						}
					};
					// Ensure execution in UI thread.
					if (null == Display.getCurrent()) {
						PlatformUI.getWorkbench().getDisplay().asyncExec(removeRunnable);
					} else {
						removeRunnable.run();
					}
				}
			}

			public void cloneCreated(final DRepresentation clone_p, final Session session_p) {
				// Add element to the viewer.
				if (null != _viewer) {
					Runnable addRunnable = new Runnable() {
						/**
						 * @see java.lang.Runnable#run()
						 */
						public void run() {
							// Add diagram to project explorer.
							Object parent = ((DSemanticDecorator) clone_p).getTarget();
							_viewer.add(parent, clone_p);
							// Refresh representations part.
							SessionManager.INSTANCE.notifyRepresentationCreated(session_p);
						}
					};
					// Ensure execution in UI thread.
					if (null == Display.getCurrent()) {
						PlatformUI.getWorkbench().getDisplay().asyncExec(addRunnable);
					} else {
						addRunnable.run();
					}
				}
			}
		});
		// This is a special command that handles the undo/redo outside of the
		// recording command implementation.
		// Thus is more adequate to execute it against the command stack
		// directly, rather than use the default behavior.
		TransactionUtil.getEditingDomain(_representations.iterator().next()).getCommandStack().execute(command);
	}

	/**
	 * @see org.eclipse.ui.actions.BaseSelectionListenerAction#updateSelection(org.eclipse.jface.viewers.IStructuredSelection)
	 */
	@Override
	protected boolean updateSelection(IStructuredSelection selection_p) {
		List<?> selectedElements = selection_p.toList();
		_representations = getSelectedRepresentations(selectedElements);
		// Enable action only if all selected elements are representations.
		int size = selectedElements.size();
		return (size > 0) && (size == _representations.size());
	}
}
