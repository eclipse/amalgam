/*******************************************************************************
 * Copyright (c)  2006, 2016 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Thales - initial API and implementation
 *******************************************************************************/
package org.eclipse.amalgam.explorer.activity.ui.api.hyperlinkadapter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;

import org.eclipse.amalgam.explorer.activity.ui.internal.util.ActivityExplorerLoggerService;
import org.eclipse.amalgam.explorer.activity.ui.internal.viewer.diagram.actions.NewRepresentationAction;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.sirius.business.api.dialect.DialectManager;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.diagram.business.api.componentization.DiagramComponentizationManager;
import org.eclipse.sirius.diagram.description.DiagramDescription;
import org.eclipse.sirius.diagram.description.Layer;
import org.eclipse.sirius.diagram.description.filter.FilterDescription;
import org.eclipse.sirius.viewpoint.description.RepresentationDescription;
import org.eclipse.sirius.viewpoint.description.Viewpoint;
import org.eclipse.ui.forms.events.HyperlinkEvent;
import org.eclipse.ui.forms.widgets.AbstractHyperlink;

/**
 * Base class to implement a diagram creation.
 */
public abstract class AbstractNewDiagramHyperlinkAdapter extends AbstractHyperlinkAdapter implements IRepresentationProvider {

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
					  Collection<Layer> layers = getExtraLayers(session, diagramRepresentation);
					  Collection<FilterDescription> filters = getExtraFilters(session, diagramRepresentation);
						NewRepresentationAction newDiagramAction = new NewRepresentationAction(diagramRepresentation,
								modelElement, session, false, true, layers, filters);
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
		try {
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
		} catch (Throwable e) {
			StringBuilder message = new StringBuilder();
			
			message.append("AvstractNewDiagramHyperlinkAdapter.getDiagramRepresentation(..) _ "); //$NON-NLS-1$
			message.append("Could not retrieve a representation name from contribution. See the error stack for more details."); //$NON-NLS-1$
			
			ActivityExplorerLoggerService.getInstance().log(IStatus.ERROR, message.toString(), e);
		}
		
		return null;
	}

	/**
	 * @return the representation name of the diagram created
	 */
	public abstract String getRepresentationName();

	private Collection<Layer> getExtraLayers(Session session, RepresentationDescription desc){
	  Collection<Layer> extra = new ArrayList<>();
	  if (desc instanceof DiagramDescription)
	    for (Layer l : new DiagramComponentizationManager().getAllLayers(session.getSelectedViewpoints(false), (DiagramDescription) desc)) {
	      if(getExtraLayerNames().contains(l.getName())){
	        extra.add(l);
	      }
	    }
	  return extra;
	}

	private Collection<FilterDescription> getExtraFilters(Session session,
	    RepresentationDescription desc) {
	  Collection<FilterDescription> extra = new ArrayList<>();
	  if (desc instanceof DiagramDescription) {
	    for (FilterDescription d : ((DiagramDescription) desc).getFilters()) {
	      if(getExtraFilterNames().contains(d.getName())){
	        extra.add(d);
	      }
	    }
	  }
	  return extra;
	}

	/**
	 * A collection of layer names that should be activated on the new diagram, in addition to the default layers.
	 * @return
	 */
	protected Collection<String> getExtraLayerNames(){
	  return Collections.emptyList();
	}

	/**
   * A collection of filter names that should be activated on the new diagram, in addition to the default filters.
   * @return
   */
	protected Collection<String> getExtraFilterNames(){
	  return Collections.emptyList();
	}

	/**
	 * @see org.eclipse.amalgam.explorer.activity.ui.api.hyperlinkadapter.IRepresentationProvider#getRepresentationNames()
	 */
  public Set<String> getRepresentationNames() {
    return Collections.singleton(getRepresentationName());
  }
}
