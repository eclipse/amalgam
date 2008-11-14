package org.eclipse.amalgam.examples.requirements.diagram.providers;

import org.eclipse.amalgam.examples.requirements.diagram.edit.parts.ModelEditPart;
import org.eclipse.amalgam.examples.requirements.diagram.edit.parts.ProcessEditPart;
import org.eclipse.amalgam.examples.requirements.diagram.edit.parts.RequirementChildrenEditPart;
import org.eclipse.amalgam.examples.requirements.diagram.edit.parts.RequirementDependenciesEditPart;
import org.eclipse.amalgam.examples.requirements.diagram.edit.parts.RequirementEditPart;
import org.eclipse.amalgam.examples.requirements.diagram.edit.parts.RequirementGroup2EditPart;
import org.eclipse.amalgam.examples.requirements.diagram.edit.parts.RequirementGroupChildrenEditPart;
import org.eclipse.amalgam.examples.requirements.diagram.edit.parts.RequirementGroupEditPart;
import org.eclipse.amalgam.examples.requirements.diagram.edit.parts.RequirementGroupId2EditPart;
import org.eclipse.amalgam.examples.requirements.diagram.edit.parts.RequirementGroupIdEditPart;
import org.eclipse.amalgam.examples.requirements.diagram.edit.parts.RequirementGroupRequirementsEditPart;
import org.eclipse.amalgam.examples.requirements.diagram.edit.parts.RequirementIdEditPart;
import org.eclipse.amalgam.examples.requirements.diagram.edit.parts.RequirementTypeEditPart;
import org.eclipse.amalgam.examples.requirements.diagram.part.RequirementsVisualIDRegistry;
import org.eclipse.amalgam.examples.requirements.diagram.view.factories.ModelViewFactory;
import org.eclipse.amalgam.examples.requirements.diagram.view.factories.ProcessViewFactory;
import org.eclipse.amalgam.examples.requirements.diagram.view.factories.RequirementChildrenViewFactory;
import org.eclipse.amalgam.examples.requirements.diagram.view.factories.RequirementDependenciesViewFactory;
import org.eclipse.amalgam.examples.requirements.diagram.view.factories.RequirementGroup2ViewFactory;
import org.eclipse.amalgam.examples.requirements.diagram.view.factories.RequirementGroupChildrenViewFactory;
import org.eclipse.amalgam.examples.requirements.diagram.view.factories.RequirementGroupId2ViewFactory;
import org.eclipse.amalgam.examples.requirements.diagram.view.factories.RequirementGroupIdViewFactory;
import org.eclipse.amalgam.examples.requirements.diagram.view.factories.RequirementGroupRequirementsViewFactory;
import org.eclipse.amalgam.examples.requirements.diagram.view.factories.RequirementGroupViewFactory;
import org.eclipse.amalgam.examples.requirements.diagram.view.factories.RequirementIdViewFactory;
import org.eclipse.amalgam.examples.requirements.diagram.view.factories.RequirementTypeViewFactory;
import org.eclipse.amalgam.examples.requirements.diagram.view.factories.RequirementViewFactory;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.core.providers.AbstractViewProvider;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.IHintedType;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class RequirementsViewProvider extends AbstractViewProvider {

	/**
	 * @generated
	 */
	protected Class getDiagramViewClass(IAdaptable semanticAdapter,
			String diagramKind) {
		EObject semanticElement = getSemanticElement(semanticAdapter);
		if (ModelEditPart.MODEL_ID.equals(diagramKind)
				&& RequirementsVisualIDRegistry
						.getDiagramVisualID(semanticElement) != -1) {
			return ModelViewFactory.class;
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
			visualID = RequirementsVisualIDRegistry.getNodeVisualID(
					containerView, domainElement);
		} else {
			visualID = RequirementsVisualIDRegistry.getVisualID(semanticHint);
			if (elementType != null) {
				// Semantic hint is specified together with element type.
				// Both parameters should describe exactly the same diagram element.
				// In addition we check that visualID returned by VisualIDRegistry.getNodeVisualID() for
				// domainElement (if specified) is the same as in element type.
				if (!RequirementsElementTypes.isKnownElementType(elementType)
						|| (!(elementType instanceof IHintedType))) {
					return null; // foreign element type
				}
				String elementTypeHint = ((IHintedType) elementType)
						.getSemanticHint();
				if (!semanticHint.equals(elementTypeHint)) {
					return null; // if semantic hint is specified it should be the same as in element type
				}
				if (domainElement != null
						&& visualID != RequirementsVisualIDRegistry
								.getNodeVisualID(containerView, domainElement)) {
					return null; // visual id for node EClass should match visual id from element type
				}
			} else {
				// Element type is not specified. Domain element should be present (except pure design elements).
				// This method is called with EObjectAdapter as parameter from:
				//   - ViewService.createNode(View container, EObject eObject, String type, PreferencesHint preferencesHint) 
				//   - generated ViewFactory.decorateView() for parent element
				if (!ModelEditPart.MODEL_ID.equals(RequirementsVisualIDRegistry
						.getModelID(containerView))) {
					return null; // foreign diagram
				}
				switch (visualID) {
				case RequirementGroupEditPart.VISUAL_ID:
				case RequirementEditPart.VISUAL_ID:
				case ProcessEditPart.VISUAL_ID:
				case RequirementGroup2EditPart.VISUAL_ID:
					if (domainElement == null
							|| visualID != RequirementsVisualIDRegistry
									.getNodeVisualID(containerView,
											domainElement)) {
						return null; // visual id in semantic hint should match visual id for domain element
					}
					break;
				case RequirementGroupIdEditPart.VISUAL_ID:
					if (RequirementGroupEditPart.VISUAL_ID != RequirementsVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case RequirementIdEditPart.VISUAL_ID:
				case RequirementTypeEditPart.VISUAL_ID:
					if (RequirementEditPart.VISUAL_ID != RequirementsVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case RequirementGroupId2EditPart.VISUAL_ID:
					if (RequirementGroup2EditPart.VISUAL_ID != RequirementsVisualIDRegistry
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
				|| !RequirementsVisualIDRegistry.canCreateNode(containerView,
						visualID)) {
			return null;
		}
		switch (visualID) {
		case RequirementGroupEditPart.VISUAL_ID:
			return RequirementGroupViewFactory.class;
		case RequirementGroupIdEditPart.VISUAL_ID:
			return RequirementGroupIdViewFactory.class;
		case RequirementEditPart.VISUAL_ID:
			return RequirementViewFactory.class;
		case RequirementIdEditPart.VISUAL_ID:
			return RequirementIdViewFactory.class;
		case RequirementTypeEditPart.VISUAL_ID:
			return RequirementTypeViewFactory.class;
		case RequirementGroup2EditPart.VISUAL_ID:
			return RequirementGroup2ViewFactory.class;
		case RequirementGroupId2EditPart.VISUAL_ID:
			return RequirementGroupId2ViewFactory.class;
		case ProcessEditPart.VISUAL_ID:
			return ProcessViewFactory.class;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Class getEdgeViewClass(IAdaptable semanticAdapter,
			View containerView, String semanticHint) {
		IElementType elementType = getSemanticElementType(semanticAdapter);
		if (!RequirementsElementTypes.isKnownElementType(elementType)
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
		int visualID = RequirementsVisualIDRegistry
				.getVisualID(elementTypeHint);
		EObject domainElement = getSemanticElement(semanticAdapter);
		if (domainElement != null
				&& visualID != RequirementsVisualIDRegistry
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
		case RequirementGroupRequirementsEditPart.VISUAL_ID:
			return RequirementGroupRequirementsViewFactory.class;
		case RequirementChildrenEditPart.VISUAL_ID:
			return RequirementChildrenViewFactory.class;
		case RequirementDependenciesEditPart.VISUAL_ID:
			return RequirementDependenciesViewFactory.class;
		case RequirementGroupChildrenEditPart.VISUAL_ID:
			return RequirementGroupChildrenViewFactory.class;
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
