package org.eclipse.amalgam.examples.mindmap.diagram.edit.policies;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.amalgam.examples.mindmap.MindmapPackage;
import org.eclipse.amalgam.examples.mindmap.diagram.edit.parts.MapEditPart;
import org.eclipse.amalgam.examples.mindmap.diagram.edit.parts.Relationship2EditPart;
import org.eclipse.amalgam.examples.mindmap.diagram.edit.parts.Relationship3EditPart;
import org.eclipse.amalgam.examples.mindmap.diagram.edit.parts.RelationshipEditPart;
import org.eclipse.amalgam.examples.mindmap.diagram.edit.parts.Topic2EditPart;
import org.eclipse.amalgam.examples.mindmap.diagram.edit.parts.TopicEditPart;
import org.eclipse.amalgam.examples.mindmap.diagram.part.MindmapDiagramEditorPlugin;
import org.eclipse.amalgam.examples.mindmap.diagram.part.MindmapDiagramUpdater;
import org.eclipse.amalgam.examples.mindmap.diagram.part.MindmapLinkDescriptor;
import org.eclipse.amalgam.examples.mindmap.diagram.part.MindmapNodeDescriptor;
import org.eclipse.amalgam.examples.mindmap.diagram.part.MindmapVisualIDRegistry;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.Transaction;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.emf.workspace.AbstractEMFOperation;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.common.core.util.StringStatics;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.diagram.ui.commands.DeferredLayoutCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalConnectionEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateConnectionViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.RequestConstants;
import org.eclipse.gmf.runtime.diagram.ui.services.layout.LayoutService;
import org.eclipse.gmf.runtime.diagram.ui.services.layout.LayoutType;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Location;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.Ratio;
import org.eclipse.gmf.runtime.notation.Size;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.ui.PlatformUI;

/**
 * @generated
 */
public class MapCanonicalEditPolicy extends CanonicalConnectionEditPolicy {

	/**
	 * @generated
	 */
	Set myFeaturesToSynchronize;

	/**
	 * @generated
	 */
	protected List getSemanticChildrenList() {
		View viewObject = (View) getHost().getModel();
		List result = new LinkedList();
		for (Iterator it = MindmapDiagramUpdater.getMap_1000SemanticChildren(
				viewObject).iterator(); it.hasNext();) {
			result.add(((MindmapNodeDescriptor) it.next()).getModelElement());
		}
		return result;
	}

	/**
	 * @generated
	 */
	protected boolean shouldDeleteView(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	protected boolean isOrphaned(Collection semanticChildren, final View view) {
		int visualID = MindmapVisualIDRegistry.getVisualID(view);
		switch (visualID) {
		case TopicEditPart.VISUAL_ID:
		case Topic2EditPart.VISUAL_ID:
			if (!semanticChildren.contains(view.getElement())) {
				return true;
			}
			EObject domainModelElement = view.getElement();
			if (visualID != MindmapVisualIDRegistry.getNodeVisualID(
					(View) getHost().getModel(), domainModelElement)) {
				List createdViews = createViews(Collections
						.singletonList(domainModelElement));
				assert createdViews.size() == 1;
				final View createdView = (View) ((IAdaptable) createdViews
						.get(0)).getAdapter(View.class);
				if (createdView != null) {
					try {
						new AbstractEMFOperation(host().getEditingDomain(),
								StringStatics.BLANK, Collections.singletonMap(
										Transaction.OPTION_UNPROTECTED,
										Boolean.TRUE)) {
							protected IStatus doExecute(
									IProgressMonitor monitor, IAdaptable info)
									throws ExecutionException {
								populateViewProperties(view, createdView);
								return Status.OK_STATUS;
							}
						}.execute(new NullProgressMonitor(), null);
					} catch (ExecutionException e) {
						MindmapDiagramEditorPlugin
								.getInstance()
								.logError(
										"Error while copyign view information to newly created view", e); //$NON-NLS-1$
					}
				}
				deleteViews(Collections.singletonList(view).iterator());
			}
		}
		return false;
	}

	/**
	 * @generated
	 */
	private void populateViewProperties(View oldView, View newView) {
		if (oldView instanceof Node && newView instanceof Node) {
			Node oldNode = (Node) oldView;
			Node newNode = (Node) newView;
			if (oldNode.getLayoutConstraint() instanceof Location
					&& newNode.getLayoutConstraint() instanceof Location) {
				((Location) newNode.getLayoutConstraint())
						.setX(((Location) oldNode.getLayoutConstraint()).getX());
				((Location) newNode.getLayoutConstraint())
						.setY(((Location) oldNode.getLayoutConstraint()).getY());
			}
			if (oldNode.getLayoutConstraint() instanceof Size
					&& newNode.getLayoutConstraint() instanceof Size) {
				((Size) newNode.getLayoutConstraint()).setWidth(((Size) oldNode
						.getLayoutConstraint()).getWidth());
				((Size) newNode.getLayoutConstraint())
						.setHeight(((Size) oldNode.getLayoutConstraint())
								.getHeight());
			}
			if (oldNode.getLayoutConstraint() instanceof Ratio
					&& newNode.getLayoutConstraint() instanceof Ratio) {
				((Ratio) newNode.getLayoutConstraint())
						.setValue(((Ratio) oldNode.getLayoutConstraint())
								.getValue());
			}
			newNode.persist();
		}
	}

	/**
	 * @generated
	 */
	protected String getDefaultFactoryHint() {
		return null;
	}

	/**
	 * @generated
	 */
	protected Set getFeaturesToSynchronize() {
		if (myFeaturesToSynchronize == null) {
			myFeaturesToSynchronize = new HashSet();
			myFeaturesToSynchronize.add(MindmapPackage.eINSTANCE
					.getMap_Elements());
		}
		return myFeaturesToSynchronize;
	}

	/**
	 * @generated
	 */
	protected List getSemanticConnectionsList() {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	protected EObject getSourceElement(EObject relationship) {
		return null;
	}

	/**
	 * @generated
	 */
	protected EObject getTargetElement(EObject relationship) {
		return null;
	}

	/**
	 * @generated
	 */
	protected boolean shouldIncludeConnection(Edge connector,
			Collection children) {
		return false;
	}

	/**
	 * @generated NOT
	 */
	protected void refreshSemantic() {
		List createdViews = new LinkedList();
		createdViews.addAll(refreshSemanticChildren());
		List createdConnectionViews = new LinkedList();
		createdConnectionViews.addAll(refreshSemanticConnections());
		createdConnectionViews.addAll(refreshConnections());

		if (createdViews.size() > 1) {
			// perform a layout of the container
			DeferredLayoutCommand layoutCmd = new DeferredLayoutCommand(host()
					.getEditingDomain(), createdViews, host());
			executeCommand(new ICommandProxy(layoutCmd));
		}

		createdViews.addAll(createdConnectionViews);
		makeViewsImmutable(createdViews);
		if (createdViews.size() > 0) {
			layout();
		}
	}

	/**
	 * @generated
	 */
	private Diagram getDiagram() {
		return ((View) getHost().getModel()).getDiagram();
	}

	/**
	 * @generated
	 */
	private Collection refreshConnections() {
		Map domain2NotationMap = new HashMap();
		Collection linkDescriptors = collectAllLinks(getDiagram(),
				domain2NotationMap);
		Collection existingLinks = new LinkedList(getDiagram().getEdges());
		for (Iterator linksIterator = existingLinks.iterator(); linksIterator
				.hasNext();) {
			Edge nextDiagramLink = (Edge) linksIterator.next();
			int diagramLinkVisualID = MindmapVisualIDRegistry
					.getVisualID(nextDiagramLink);
			if (diagramLinkVisualID == -1) {
				if (nextDiagramLink.getSource() != null
						&& nextDiagramLink.getTarget() != null) {
					linksIterator.remove();
				}
				continue;
			}
			EObject diagramLinkObject = nextDiagramLink.getElement();
			EObject diagramLinkSrc = nextDiagramLink.getSource().getElement();
			EObject diagramLinkDst = nextDiagramLink.getTarget().getElement();
			for (Iterator LinkDescriptorsIterator = linkDescriptors.iterator(); LinkDescriptorsIterator
					.hasNext();) {
				MindmapLinkDescriptor nextLinkDescriptor = (MindmapLinkDescriptor) LinkDescriptorsIterator
						.next();
				if (diagramLinkObject == nextLinkDescriptor.getModelElement()
						&& diagramLinkSrc == nextLinkDescriptor.getSource()
						&& diagramLinkDst == nextLinkDescriptor
								.getDestination()
						&& diagramLinkVisualID == nextLinkDescriptor
								.getVisualID()) {
					linksIterator.remove();
					LinkDescriptorsIterator.remove();
				}
			}
		}
		deleteViews(existingLinks.iterator());
		return createConnections(linkDescriptors, domain2NotationMap);
	}

	/**
	 * @generated
	 */
	private Collection collectAllLinks(View view, Map domain2NotationMap) {
		if (!MapEditPart.MODEL_ID.equals(MindmapVisualIDRegistry
				.getModelID(view))) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		switch (MindmapVisualIDRegistry.getVisualID(view)) {
		case MapEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(MindmapDiagramUpdater
						.getMap_1000ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case TopicEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(MindmapDiagramUpdater
						.getTopic_2001ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case Topic2EditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(MindmapDiagramUpdater
						.getTopic_2002ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case RelationshipEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(MindmapDiagramUpdater
						.getRelationship_4002ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case Relationship2EditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(MindmapDiagramUpdater
						.getRelationship_4003ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case Relationship3EditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(MindmapDiagramUpdater
						.getRelationship_4004ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		}
		for (Iterator children = view.getChildren().iterator(); children
				.hasNext();) {
			result.addAll(collectAllLinks((View) children.next(),
					domain2NotationMap));
		}
		for (Iterator edges = view.getSourceEdges().iterator(); edges.hasNext();) {
			result.addAll(collectAllLinks((View) edges.next(),
					domain2NotationMap));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection createConnections(Collection linkDescriptors,
			Map domain2NotationMap) {
		List adapters = new LinkedList();
		for (Iterator linkDescriptorsIterator = linkDescriptors.iterator(); linkDescriptorsIterator
				.hasNext();) {
			final MindmapLinkDescriptor nextLinkDescriptor = (MindmapLinkDescriptor) linkDescriptorsIterator
					.next();
			EditPart sourceEditPart = getEditPart(nextLinkDescriptor
					.getSource(), domain2NotationMap);
			EditPart targetEditPart = getEditPart(nextLinkDescriptor
					.getDestination(), domain2NotationMap);
			if (sourceEditPart == null || targetEditPart == null) {
				continue;
			}
			CreateConnectionViewRequest.ConnectionViewDescriptor descriptor = new CreateConnectionViewRequest.ConnectionViewDescriptor(
					nextLinkDescriptor.getSemanticAdapter(), null,
					ViewUtil.APPEND, false, ((IGraphicalEditPart) getHost())
							.getDiagramPreferencesHint());
			CreateConnectionViewRequest ccr = new CreateConnectionViewRequest(
					descriptor);
			ccr.setType(RequestConstants.REQ_CONNECTION_START);
			ccr.setSourceEditPart(sourceEditPart);
			sourceEditPart.getCommand(ccr);
			ccr.setTargetEditPart(targetEditPart);
			ccr.setType(RequestConstants.REQ_CONNECTION_END);
			Command cmd = targetEditPart.getCommand(ccr);
			if (cmd != null && cmd.canExecute()) {
				executeCommand(cmd);
				IAdaptable viewAdapter = (IAdaptable) ccr.getNewObject();
				if (viewAdapter != null) {
					adapters.add(viewAdapter);
				}
			}
		}
		return adapters;
	}

	/**
	 * @generated
	 */
	private EditPart getEditPart(EObject domainModelElement,
			Map domain2NotationMap) {
		View view = (View) domain2NotationMap.get(domainModelElement);
		if (view != null) {
			return (EditPart) getHost().getViewer().getEditPartRegistry().get(
					view);
		}
		return null;
	}

	@Override
	protected void handleNotificationEvent(Notification event) {
		int type = event.getEventType();
		Object feature = event.getFeature();
		if ((MindmapPackage.eINSTANCE.getMap_Elements().equals(feature))
				&& (type == Notification.ADD || type == Notification.REMOVE)) {
			layout();
		}
		super.handleNotificationEvent(event);
	}

	public void layout() {
		TransactionalEditingDomain ted = TransactionUtil
				.getEditingDomain(getDiagram());
		final View diagram = getDiagram();
		final AbstractEMFOperation operation = new AbstractEMFOperation(ted,
				"Mindmap layout", null) {
			protected IStatus doExecute(IProgressMonitor monitor,
					IAdaptable info) throws ExecutionException {
				LayoutService.getInstance().layout(diagram, LayoutType.DEFAULT);
				return Status.OK_STATUS;
			}
		};
		PlatformUI.getWorkbench().getDisplay().asyncExec(new Runnable() {
			public void run() {
				try {
					operation.execute(new NullProgressMonitor(), null);
				} catch (ExecutionException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
	}

}
