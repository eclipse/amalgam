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
package org.eclipse.amalgam.explorer.activity.ui.api.hyperlinkadapter;

import java.util.Collection;

import org.eclipse.amalgam.explorer.activity.ui.internal.viewer.diagram.actions.NewRepresentationAction;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.sirius.business.api.dialect.DialectManager;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.viewpoint.description.RepresentationDescription;
import org.eclipse.sirius.viewpoint.description.Viewpoint;
import org.eclipse.ui.forms.events.HyperlinkEvent;
import org.eclipse.ui.forms.widgets.AbstractHyperlink;

/**
 * Base class to implement a diagram creation.
 * 
 */
public abstract class AbstractNewDiagramHyperlinkAdapter extends AbstractHyperlinkAdapter {

	// private Logger _logger =
	// ReportManagerRegistry.getInstance().subscribe(IReportManagerDefaultComponents.DIAGRAM);

	/**
	 * Constructor.
	 * 
	 * @param project
	 */
	public AbstractNewDiagramHyperlinkAdapter(EObject project) {
		super(project);
	}

	/**
	 * Create a diagram based on {@link #getDiagramRepresentation()},
	 * {@link #getModelElement(Project))} and the current session.<br>
	 * Must be in the UI thread.
	 */
	protected boolean createDiagram(final EObject project, final Session session) {
		final boolean flag[] = { true };

		if (project != null && session != null) {
			RecordingCommand cmd = new RecordingCommand(TransactionUtil.getEditingDomain(project)) {
				@Override
				protected void doExecute() {
					//
					EObject modelElement = project;
					RepresentationDescription diagramRepresentation = getDiagramRepresentation(session, modelElement);
					// Preconditions
					if ((null == diagramRepresentation)
							|| !DialectManager.INSTANCE.canCreate(modelElement, diagramRepresentation)) {
						flag[0] = false;
					} else {
						NewRepresentationAction newDiagramAction = new NewRepresentationAction(diagramRepresentation,
								modelElement, session);
						newDiagramAction.run();
					}
				}
			};
			TransactionUtil.getEditingDomain(project).getCommandStack().execute(cmd);
		} else {
			flag[0] = false;
		}

		return flag[0];
	}

	@Override
	protected void linkPressed(HyperlinkEvent event, EObject root, Session session) {
		if (root != null && !createDiagram(root, session)) {
			handleDiagramCreationError(event, root);
		}
	}

	/**
	 * Handle creation error.
	 * 
	 * @param event
	 * @param project
	 */
	protected void handleDiagramCreationError(HyperlinkEvent event, EObject project) {
		String msg = Messages.AbstractNewDiagramHyperlinkAdapter_DiagramCreation_Error_Msg_Part1
				+ getRepresentationName() + Messages.AbstractNewDiagramHyperlinkAdapter_DiagramCreation_Error_Msg_Part2;
		AbstractHyperlink widget = (AbstractHyperlink) event.widget;
		MessageDialog.openError(widget.getDisplay().getActiveShell(), widget.getText(), msg);
		// _logger.error(new EmbeddedMessage(msg,
		// IReportManagerDefaultComponents.DIAGRAM, project_p));
	}

	/**
	 * Get the diagram representation for {@link #getRepresentationName()} and
	 * specified parameters.
	 * 
	 * @return <code>null</code> if not found.
	 */

	protected RepresentationDescription getDiagramRepresentation(Session session, EObject modelElement) {
		// Get active viewpoints.
		Collection<Viewpoint> activeViewpoints = session.getSelectedViewpoints(false);
		Collection<RepresentationDescription> diagramDescriptions = DialectManager.INSTANCE
				.getAvailableRepresentationDescriptions(activeViewpoints, modelElement);
		// Get search diagram name.
		String diagramName = getRepresentationName();
		// Loop over retrieved diagram descriptions to search one matching
		// search diagram name.
		for (RepresentationDescription diagramDescription : diagramDescriptions) {
			if (diagramName.equals(diagramDescription.getName())) {
				return diagramDescription;
			}
		}
		return null;
	}

	/**
	 * @return
	 */
	public abstract String getRepresentationName();
}
