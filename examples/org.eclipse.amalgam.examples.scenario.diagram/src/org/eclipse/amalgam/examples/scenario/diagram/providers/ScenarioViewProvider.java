package org.eclipse.amalgam.examples.scenario.diagram.providers;

import org.eclipse.amalgam.examples.scenario.diagram.edit.parts.Association2EditPart;
import org.eclipse.amalgam.examples.scenario.diagram.edit.parts.AssociationEditPart;
import org.eclipse.amalgam.examples.scenario.diagram.edit.parts.DataObjectEditPart;
import org.eclipse.amalgam.examples.scenario.diagram.edit.parts.DataObjectNameEditPart;
import org.eclipse.amalgam.examples.scenario.diagram.edit.parts.Event2EditPart;
import org.eclipse.amalgam.examples.scenario.diagram.edit.parts.Event3EditPart;
import org.eclipse.amalgam.examples.scenario.diagram.edit.parts.Event4EditPart;
import org.eclipse.amalgam.examples.scenario.diagram.edit.parts.Event5EditPart;
import org.eclipse.amalgam.examples.scenario.diagram.edit.parts.Event6EditPart;
import org.eclipse.amalgam.examples.scenario.diagram.edit.parts.Event7EditPart;
import org.eclipse.amalgam.examples.scenario.diagram.edit.parts.Event8EditPart;
import org.eclipse.amalgam.examples.scenario.diagram.edit.parts.EventEditPart;
import org.eclipse.amalgam.examples.scenario.diagram.edit.parts.EventNameEditPart;
import org.eclipse.amalgam.examples.scenario.diagram.edit.parts.Gateway2EditPart;
import org.eclipse.amalgam.examples.scenario.diagram.edit.parts.Gateway3EditPart;
import org.eclipse.amalgam.examples.scenario.diagram.edit.parts.GatewayEditPart;
import org.eclipse.amalgam.examples.scenario.diagram.edit.parts.MessageFlowEditPart;
import org.eclipse.amalgam.examples.scenario.diagram.edit.parts.MessageFlowNameEditPart;
import org.eclipse.amalgam.examples.scenario.diagram.edit.parts.Process2EditPart;
import org.eclipse.amalgam.examples.scenario.diagram.edit.parts.ProcessEditPart;
import org.eclipse.amalgam.examples.scenario.diagram.edit.parts.ProcessNameEditPart;
import org.eclipse.amalgam.examples.scenario.diagram.edit.parts.SequenceFlow2EditPart;
import org.eclipse.amalgam.examples.scenario.diagram.edit.parts.SequenceFlowEditPart;
import org.eclipse.amalgam.examples.scenario.diagram.edit.parts.SequenceFlowName2EditPart;
import org.eclipse.amalgam.examples.scenario.diagram.edit.parts.SequenceFlowNameEditPart;
import org.eclipse.amalgam.examples.scenario.diagram.edit.parts.TaskEditPart;
import org.eclipse.amalgam.examples.scenario.diagram.edit.parts.TaskNameEditPart;
import org.eclipse.amalgam.examples.scenario.diagram.part.ScenarioVisualIDRegistry;
import org.eclipse.amalgam.examples.scenario.diagram.view.factories.Association2ViewFactory;
import org.eclipse.amalgam.examples.scenario.diagram.view.factories.AssociationViewFactory;
import org.eclipse.amalgam.examples.scenario.diagram.view.factories.DataObjectNameViewFactory;
import org.eclipse.amalgam.examples.scenario.diagram.view.factories.DataObjectViewFactory;
import org.eclipse.amalgam.examples.scenario.diagram.view.factories.Event2ViewFactory;
import org.eclipse.amalgam.examples.scenario.diagram.view.factories.Event3ViewFactory;
import org.eclipse.amalgam.examples.scenario.diagram.view.factories.Event4ViewFactory;
import org.eclipse.amalgam.examples.scenario.diagram.view.factories.Event5ViewFactory;
import org.eclipse.amalgam.examples.scenario.diagram.view.factories.Event6ViewFactory;
import org.eclipse.amalgam.examples.scenario.diagram.view.factories.Event7ViewFactory;
import org.eclipse.amalgam.examples.scenario.diagram.view.factories.Event8ViewFactory;
import org.eclipse.amalgam.examples.scenario.diagram.view.factories.EventNameViewFactory;
import org.eclipse.amalgam.examples.scenario.diagram.view.factories.EventViewFactory;
import org.eclipse.amalgam.examples.scenario.diagram.view.factories.Gateway2ViewFactory;
import org.eclipse.amalgam.examples.scenario.diagram.view.factories.Gateway3ViewFactory;
import org.eclipse.amalgam.examples.scenario.diagram.view.factories.GatewayViewFactory;
import org.eclipse.amalgam.examples.scenario.diagram.view.factories.MessageFlowNameViewFactory;
import org.eclipse.amalgam.examples.scenario.diagram.view.factories.MessageFlowViewFactory;
import org.eclipse.amalgam.examples.scenario.diagram.view.factories.Process2ViewFactory;
import org.eclipse.amalgam.examples.scenario.diagram.view.factories.ProcessNameViewFactory;
import org.eclipse.amalgam.examples.scenario.diagram.view.factories.ProcessViewFactory;
import org.eclipse.amalgam.examples.scenario.diagram.view.factories.SequenceFlow2ViewFactory;
import org.eclipse.amalgam.examples.scenario.diagram.view.factories.SequenceFlowName2ViewFactory;
import org.eclipse.amalgam.examples.scenario.diagram.view.factories.SequenceFlowNameViewFactory;
import org.eclipse.amalgam.examples.scenario.diagram.view.factories.SequenceFlowViewFactory;
import org.eclipse.amalgam.examples.scenario.diagram.view.factories.TaskNameViewFactory;
import org.eclipse.amalgam.examples.scenario.diagram.view.factories.TaskViewFactory;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.core.providers.AbstractViewProvider;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.IHintedType;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class ScenarioViewProvider extends AbstractViewProvider {

	/**
	 * @generated
	 */
	protected Class getDiagramViewClass(IAdaptable semanticAdapter,
			String diagramKind) {
		EObject semanticElement = getSemanticElement(semanticAdapter);
		if (ProcessEditPart.MODEL_ID.equals(diagramKind)
				&& ScenarioVisualIDRegistry.getDiagramVisualID(semanticElement) != -1) {
			return ProcessViewFactory.class;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Class getNodeViewClass(IAdaptable semanticAdapter,
			View containerView, String semanticHint) {
		if (containerView == null) {
			return null;
		}
		IElementType elementType = getSemanticElementType(semanticAdapter);
		EObject domainElement = getSemanticElement(semanticAdapter);
		int visualID;
		if (semanticHint == null) {
			// Semantic hint is not specified. Can be a result of call from CanonicalEditPolicy.
			// In this situation there should be NO elementType, visualID will be determined
			// by VisualIDRegistry.getNodeVisualID() for domainElement.
			if (elementType != null || domainElement == null) {
				return null;
			}
			visualID = ScenarioVisualIDRegistry.getNodeVisualID(containerView,
					domainElement);
		} else {
			visualID = ScenarioVisualIDRegistry.getVisualID(semanticHint);
			if (elementType != null) {
				// Semantic hint is specified together with element type.
				// Both parameters should describe exactly the same diagram element.
				// In addition we check that visualID returned by VisualIDRegistry.getNodeVisualID() for
				// domainElement (if specified) is the same as in element type.
				if (!ScenarioElementTypes.isKnownElementType(elementType)
						|| (!(elementType instanceof IHintedType))) {
					return null; // foreign element type
				}
				String elementTypeHint = ((IHintedType) elementType)
						.getSemanticHint();
				if (!semanticHint.equals(elementTypeHint)) {
					return null; // if semantic hint is specified it should be the same as in element type
				}
				if (domainElement != null
						&& visualID != ScenarioVisualIDRegistry
								.getNodeVisualID(containerView, domainElement)) {
					return null; // visual id for node EClass should match visual id from element type
				}
			} else {
				// Element type is not specified. Domain element should be present (except pure design elements).
				// This method is called with EObjectAdapter as parameter from:
				//   - ViewService.createNode(View container, EObject eObject, String type, PreferencesHint preferencesHint) 
				//   - generated ViewFactory.decorateView() for parent element
				if (!ProcessEditPart.MODEL_ID.equals(ScenarioVisualIDRegistry
						.getModelID(containerView))) {
					return null; // foreign diagram
				}
				switch (visualID) {
				case DataObjectEditPart.VISUAL_ID:
				case EventEditPart.VISUAL_ID:
				case GatewayEditPart.VISUAL_ID:
				case TaskEditPart.VISUAL_ID:
				case Event2EditPart.VISUAL_ID:
				case Event3EditPart.VISUAL_ID:
				case Process2EditPart.VISUAL_ID:
				case Gateway2EditPart.VISUAL_ID:
				case Event4EditPart.VISUAL_ID:
				case Event5EditPart.VISUAL_ID:
				case Event6EditPart.VISUAL_ID:
				case Gateway3EditPart.VISUAL_ID:
				case Event7EditPart.VISUAL_ID:
				case Event8EditPart.VISUAL_ID:
					if (domainElement == null
							|| visualID != ScenarioVisualIDRegistry
									.getNodeVisualID(containerView,
											domainElement)) {
						return null; // visual id in semantic hint should match visual id for domain element
					}
					break;
				case DataObjectNameEditPart.VISUAL_ID:
					if (DataObjectEditPart.VISUAL_ID != ScenarioVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case TaskNameEditPart.VISUAL_ID:
					if (TaskEditPart.VISUAL_ID != ScenarioVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case EventNameEditPart.VISUAL_ID:
					if (Event2EditPart.VISUAL_ID != ScenarioVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case ProcessNameEditPart.VISUAL_ID:
					if (Process2EditPart.VISUAL_ID != ScenarioVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case SequenceFlowNameEditPart.VISUAL_ID:
					if (SequenceFlowEditPart.VISUAL_ID != ScenarioVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case MessageFlowNameEditPart.VISUAL_ID:
					if (MessageFlowEditPart.VISUAL_ID != ScenarioVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case SequenceFlowName2EditPart.VISUAL_ID:
					if (SequenceFlow2EditPart.VISUAL_ID != ScenarioVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				default:
					return null;
				}
			}
		}
		return getNodeViewClass(containerView, visualID);
	}

	/**
	 * @generated
	 */
	protected Class getNodeViewClass(View containerView, int visualID) {
		if (containerView == null
				|| !ScenarioVisualIDRegistry.canCreateNode(containerView,
						visualID)) {
			return null;
		}
		switch (visualID) {
		case DataObjectEditPart.VISUAL_ID:
			return DataObjectViewFactory.class;
		case DataObjectNameEditPart.VISUAL_ID:
			return DataObjectNameViewFactory.class;
		case EventEditPart.VISUAL_ID:
			return EventViewFactory.class;
		case GatewayEditPart.VISUAL_ID:
			return GatewayViewFactory.class;
		case TaskEditPart.VISUAL_ID:
			return TaskViewFactory.class;
		case TaskNameEditPart.VISUAL_ID:
			return TaskNameViewFactory.class;
		case Event2EditPart.VISUAL_ID:
			return Event2ViewFactory.class;
		case EventNameEditPart.VISUAL_ID:
			return EventNameViewFactory.class;
		case Event3EditPart.VISUAL_ID:
			return Event3ViewFactory.class;
		case Process2EditPart.VISUAL_ID:
			return Process2ViewFactory.class;
		case ProcessNameEditPart.VISUAL_ID:
			return ProcessNameViewFactory.class;
		case Gateway2EditPart.VISUAL_ID:
			return Gateway2ViewFactory.class;
		case Event4EditPart.VISUAL_ID:
			return Event4ViewFactory.class;
		case Event5EditPart.VISUAL_ID:
			return Event5ViewFactory.class;
		case Event6EditPart.VISUAL_ID:
			return Event6ViewFactory.class;
		case Gateway3EditPart.VISUAL_ID:
			return Gateway3ViewFactory.class;
		case Event7EditPart.VISUAL_ID:
			return Event7ViewFactory.class;
		case Event8EditPart.VISUAL_ID:
			return Event8ViewFactory.class;
		case SequenceFlowNameEditPart.VISUAL_ID:
			return SequenceFlowNameViewFactory.class;
		case MessageFlowNameEditPart.VISUAL_ID:
			return MessageFlowNameViewFactory.class;
		case SequenceFlowName2EditPart.VISUAL_ID:
			return SequenceFlowName2ViewFactory.class;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Class getEdgeViewClass(IAdaptable semanticAdapter,
			View containerView, String semanticHint) {
		IElementType elementType = getSemanticElementType(semanticAdapter);
		if (!ScenarioElementTypes.isKnownElementType(elementType)
				|| (!(elementType instanceof IHintedType))) {
			return null; // foreign element type
		}
		String elementTypeHint = ((IHintedType) elementType).getSemanticHint();
		if (elementTypeHint == null) {
			return null; // our hint is visual id and must be specified
		}
		if (semanticHint != null && !semanticHint.equals(elementTypeHint)) {
			return null; // if semantic hint is specified it should be the same as in element type
		}
		int visualID = ScenarioVisualIDRegistry.getVisualID(elementTypeHint);
		EObject domainElement = getSemanticElement(semanticAdapter);
		if (domainElement != null
				&& visualID != ScenarioVisualIDRegistry
						.getLinkWithClassVisualID(domainElement)) {
			return null; // visual id for link EClass should match visual id from element type
		}
		return getEdgeViewClass(visualID);
	}

	/**
	 * @generated
	 */
	protected Class getEdgeViewClass(int visualID) {
		switch (visualID) {
		case AssociationEditPart.VISUAL_ID:
			return AssociationViewFactory.class;
		case SequenceFlowEditPart.VISUAL_ID:
			return SequenceFlowViewFactory.class;
		case MessageFlowEditPart.VISUAL_ID:
			return MessageFlowViewFactory.class;
		case SequenceFlow2EditPart.VISUAL_ID:
			return SequenceFlow2ViewFactory.class;
		case Association2EditPart.VISUAL_ID:
			return Association2ViewFactory.class;
		}
		return null;
	}

	/**
	 * @generated
	 */
	private IElementType getSemanticElementType(IAdaptable semanticAdapter) {
		if (semanticAdapter == null) {
			return null;
		}
		return (IElementType) semanticAdapter.getAdapter(IElementType.class);
	}
}
