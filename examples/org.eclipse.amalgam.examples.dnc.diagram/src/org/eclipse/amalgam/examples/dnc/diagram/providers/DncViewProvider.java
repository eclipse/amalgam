package org.eclipse.amalgam.examples.dnc.diagram.providers;

import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.AnnotatedElementAnnotationsEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.AnnotationEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.AnnotationKeyEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.AnnotationKeyValueEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.Association2EditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.AssociationEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.AssociationLowerBoundUpperBound2EditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.AssociationLowerBoundUpperBoundEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.AttributeEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.ClassSuperclassesEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.DescriptionAttributesEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.DescriptionDescriptionEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.DescriptionEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.DescriptionNameEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.DescriptionOperationsEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.MIDetailAttributesEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.MIDetailDescriptionEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.MIDetailEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.MIDetailNameEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.MIDetailOperationsEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.MomentIntervalAttributesEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.MomentIntervalDescriptionEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.MomentIntervalEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.MomentIntervalNameEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.MomentIntervalOperationsEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.OperationEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.Package2EditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.Package3EditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.PackageEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.PackageName2EditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.PackageNameEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.PackagePackagesEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.PartyAttributesEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.PartyDescriptionEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.PartyEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.PartyNameEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.PartyOperationsEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.PlaceAttributesEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.PlaceDescriptionEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.PlaceEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.PlaceNameEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.PlaceOperationsEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.PluginPointAttributesEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.PluginPointDescriptionEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.PluginPointEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.PluginPointNameEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.PluginPointOperationsEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.RoleAttributesEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.RoleDescriptionEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.RoleEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.RoleNameEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.RoleOperationsEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.ThingAttributesEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.ThingDescriptionEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.ThingEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.ThingNameEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.ThingOperationsEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.part.DncVisualIDRegistry;
import org.eclipse.amalgam.examples.dnc.diagram.view.factories.AnnotatedElementAnnotationsViewFactory;
import org.eclipse.amalgam.examples.dnc.diagram.view.factories.AnnotationKeyValueViewFactory;
import org.eclipse.amalgam.examples.dnc.diagram.view.factories.AnnotationKeyViewFactory;
import org.eclipse.amalgam.examples.dnc.diagram.view.factories.AnnotationViewFactory;
import org.eclipse.amalgam.examples.dnc.diagram.view.factories.Association2ViewFactory;
import org.eclipse.amalgam.examples.dnc.diagram.view.factories.AssociationLowerBoundUpperBound2ViewFactory;
import org.eclipse.amalgam.examples.dnc.diagram.view.factories.AssociationLowerBoundUpperBoundViewFactory;
import org.eclipse.amalgam.examples.dnc.diagram.view.factories.AssociationViewFactory;
import org.eclipse.amalgam.examples.dnc.diagram.view.factories.AttributeViewFactory;
import org.eclipse.amalgam.examples.dnc.diagram.view.factories.ClassSuperclassesViewFactory;
import org.eclipse.amalgam.examples.dnc.diagram.view.factories.DescriptionAttributesViewFactory;
import org.eclipse.amalgam.examples.dnc.diagram.view.factories.DescriptionDescriptionViewFactory;
import org.eclipse.amalgam.examples.dnc.diagram.view.factories.DescriptionNameViewFactory;
import org.eclipse.amalgam.examples.dnc.diagram.view.factories.DescriptionOperationsViewFactory;
import org.eclipse.amalgam.examples.dnc.diagram.view.factories.DescriptionViewFactory;
import org.eclipse.amalgam.examples.dnc.diagram.view.factories.MIDetailAttributesViewFactory;
import org.eclipse.amalgam.examples.dnc.diagram.view.factories.MIDetailDescriptionViewFactory;
import org.eclipse.amalgam.examples.dnc.diagram.view.factories.MIDetailNameViewFactory;
import org.eclipse.amalgam.examples.dnc.diagram.view.factories.MIDetailOperationsViewFactory;
import org.eclipse.amalgam.examples.dnc.diagram.view.factories.MIDetailViewFactory;
import org.eclipse.amalgam.examples.dnc.diagram.view.factories.MomentIntervalAttributesViewFactory;
import org.eclipse.amalgam.examples.dnc.diagram.view.factories.MomentIntervalDescriptionViewFactory;
import org.eclipse.amalgam.examples.dnc.diagram.view.factories.MomentIntervalNameViewFactory;
import org.eclipse.amalgam.examples.dnc.diagram.view.factories.MomentIntervalOperationsViewFactory;
import org.eclipse.amalgam.examples.dnc.diagram.view.factories.MomentIntervalViewFactory;
import org.eclipse.amalgam.examples.dnc.diagram.view.factories.OperationViewFactory;
import org.eclipse.amalgam.examples.dnc.diagram.view.factories.Package2ViewFactory;
import org.eclipse.amalgam.examples.dnc.diagram.view.factories.Package3ViewFactory;
import org.eclipse.amalgam.examples.dnc.diagram.view.factories.PackageName2ViewFactory;
import org.eclipse.amalgam.examples.dnc.diagram.view.factories.PackageNameViewFactory;
import org.eclipse.amalgam.examples.dnc.diagram.view.factories.PackagePackagesViewFactory;
import org.eclipse.amalgam.examples.dnc.diagram.view.factories.PackageViewFactory;
import org.eclipse.amalgam.examples.dnc.diagram.view.factories.PartyAttributesViewFactory;
import org.eclipse.amalgam.examples.dnc.diagram.view.factories.PartyDescriptionViewFactory;
import org.eclipse.amalgam.examples.dnc.diagram.view.factories.PartyNameViewFactory;
import org.eclipse.amalgam.examples.dnc.diagram.view.factories.PartyOperationsViewFactory;
import org.eclipse.amalgam.examples.dnc.diagram.view.factories.PartyViewFactory;
import org.eclipse.amalgam.examples.dnc.diagram.view.factories.PlaceAttributesViewFactory;
import org.eclipse.amalgam.examples.dnc.diagram.view.factories.PlaceDescriptionViewFactory;
import org.eclipse.amalgam.examples.dnc.diagram.view.factories.PlaceNameViewFactory;
import org.eclipse.amalgam.examples.dnc.diagram.view.factories.PlaceOperationsViewFactory;
import org.eclipse.amalgam.examples.dnc.diagram.view.factories.PlaceViewFactory;
import org.eclipse.amalgam.examples.dnc.diagram.view.factories.PluginPointAttributesViewFactory;
import org.eclipse.amalgam.examples.dnc.diagram.view.factories.PluginPointDescriptionViewFactory;
import org.eclipse.amalgam.examples.dnc.diagram.view.factories.PluginPointNameViewFactory;
import org.eclipse.amalgam.examples.dnc.diagram.view.factories.PluginPointOperationsViewFactory;
import org.eclipse.amalgam.examples.dnc.diagram.view.factories.PluginPointViewFactory;
import org.eclipse.amalgam.examples.dnc.diagram.view.factories.RoleAttributesViewFactory;
import org.eclipse.amalgam.examples.dnc.diagram.view.factories.RoleDescriptionViewFactory;
import org.eclipse.amalgam.examples.dnc.diagram.view.factories.RoleNameViewFactory;
import org.eclipse.amalgam.examples.dnc.diagram.view.factories.RoleOperationsViewFactory;
import org.eclipse.amalgam.examples.dnc.diagram.view.factories.RoleViewFactory;
import org.eclipse.amalgam.examples.dnc.diagram.view.factories.ThingAttributesViewFactory;
import org.eclipse.amalgam.examples.dnc.diagram.view.factories.ThingDescriptionViewFactory;
import org.eclipse.amalgam.examples.dnc.diagram.view.factories.ThingNameViewFactory;
import org.eclipse.amalgam.examples.dnc.diagram.view.factories.ThingOperationsViewFactory;
import org.eclipse.amalgam.examples.dnc.diagram.view.factories.ThingViewFactory;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.core.providers.AbstractViewProvider;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.IHintedType;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class DncViewProvider extends AbstractViewProvider {

	/**
	 * @generated
	 */
	protected Class getDiagramViewClass(IAdaptable semanticAdapter,
			String diagramKind) {
		EObject semanticElement = getSemanticElement(semanticAdapter);
		if (PackageEditPart.MODEL_ID.equals(diagramKind)
				&& DncVisualIDRegistry.getDiagramVisualID(semanticElement) != -1) {
			return PackageViewFactory.class;
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
			visualID = DncVisualIDRegistry.getNodeVisualID(containerView,
					domainElement);
		} else {
			visualID = DncVisualIDRegistry.getVisualID(semanticHint);
			if (elementType != null) {
				// Semantic hint is specified together with element type.
				// Both parameters should describe exactly the same diagram element.
				// In addition we check that visualID returned by VisualIDRegistry.getNodeVisualID() for
				// domainElement (if specified) is the same as in element type.
				if (!DncElementTypes.isKnownElementType(elementType)
						|| (!(elementType instanceof IHintedType))) {
					return null; // foreign element type
				}
				String elementTypeHint = ((IHintedType) elementType)
						.getSemanticHint();
				if (!semanticHint.equals(elementTypeHint)) {
					return null; // if semantic hint is specified it should be the same as in element type
				}
				if (domainElement != null
						&& visualID != DncVisualIDRegistry.getNodeVisualID(
								containerView, domainElement)) {
					return null; // visual id for node EClass should match visual id from element type
				}
			} else {
				// Element type is not specified. Domain element should be present (except pure design elements).
				// This method is called with EObjectAdapter as parameter from:
				//   - ViewService.createNode(View container, EObject eObject, String type, PreferencesHint preferencesHint) 
				//   - generated ViewFactory.decorateView() for parent element
				if (!PackageEditPart.MODEL_ID.equals(DncVisualIDRegistry
						.getModelID(containerView))) {
					return null; // foreign diagram
				}
				switch (visualID) {
				case MomentIntervalEditPart.VISUAL_ID:
				case MIDetailEditPart.VISUAL_ID:
				case RoleEditPart.VISUAL_ID:
				case PartyEditPart.VISUAL_ID:
				case PlaceEditPart.VISUAL_ID:
				case ThingEditPart.VISUAL_ID:
				case DescriptionEditPart.VISUAL_ID:
				case PluginPointEditPart.VISUAL_ID:
				case AnnotationEditPart.VISUAL_ID:
				case AttributeEditPart.VISUAL_ID:
				case OperationEditPart.VISUAL_ID:
				case Package2EditPart.VISUAL_ID:
				case Package3EditPart.VISUAL_ID:
					if (domainElement == null
							|| visualID != DncVisualIDRegistry.getNodeVisualID(
									containerView, domainElement)) {
						return null; // visual id in semantic hint should match visual id for domain element
					}
					break;
				case MomentIntervalNameEditPart.VISUAL_ID:
				case MomentIntervalDescriptionEditPart.VISUAL_ID:
				case MomentIntervalAttributesEditPart.VISUAL_ID:
				case MomentIntervalOperationsEditPart.VISUAL_ID:
					if (MomentIntervalEditPart.VISUAL_ID != DncVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case MIDetailNameEditPart.VISUAL_ID:
				case MIDetailDescriptionEditPart.VISUAL_ID:
				case MIDetailAttributesEditPart.VISUAL_ID:
				case MIDetailOperationsEditPart.VISUAL_ID:
					if (MIDetailEditPart.VISUAL_ID != DncVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case RoleNameEditPart.VISUAL_ID:
				case RoleDescriptionEditPart.VISUAL_ID:
				case RoleAttributesEditPart.VISUAL_ID:
				case RoleOperationsEditPart.VISUAL_ID:
					if (RoleEditPart.VISUAL_ID != DncVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case PartyNameEditPart.VISUAL_ID:
				case PartyDescriptionEditPart.VISUAL_ID:
				case PartyAttributesEditPart.VISUAL_ID:
				case PartyOperationsEditPart.VISUAL_ID:
					if (PartyEditPart.VISUAL_ID != DncVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case PlaceNameEditPart.VISUAL_ID:
				case PlaceDescriptionEditPart.VISUAL_ID:
				case PlaceAttributesEditPart.VISUAL_ID:
				case PlaceOperationsEditPart.VISUAL_ID:
					if (PlaceEditPart.VISUAL_ID != DncVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case ThingNameEditPart.VISUAL_ID:
				case ThingDescriptionEditPart.VISUAL_ID:
				case ThingAttributesEditPart.VISUAL_ID:
				case ThingOperationsEditPart.VISUAL_ID:
					if (ThingEditPart.VISUAL_ID != DncVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case DescriptionNameEditPart.VISUAL_ID:
				case DescriptionDescriptionEditPart.VISUAL_ID:
				case DescriptionAttributesEditPart.VISUAL_ID:
				case DescriptionOperationsEditPart.VISUAL_ID:
					if (DescriptionEditPart.VISUAL_ID != DncVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case PluginPointNameEditPart.VISUAL_ID:
				case PluginPointDescriptionEditPart.VISUAL_ID:
				case PluginPointAttributesEditPart.VISUAL_ID:
				case PluginPointOperationsEditPart.VISUAL_ID:
					if (PluginPointEditPart.VISUAL_ID != DncVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case PackageNameEditPart.VISUAL_ID:
				case PackageName2EditPart.VISUAL_ID:
				case PackagePackagesEditPart.VISUAL_ID:
					if (Package2EditPart.VISUAL_ID != DncVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case AnnotationKeyValueEditPart.VISUAL_ID:
				case AnnotationKeyEditPart.VISUAL_ID:
					if (AnnotationEditPart.VISUAL_ID != DncVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case AssociationLowerBoundUpperBoundEditPart.VISUAL_ID:
					if (AssociationEditPart.VISUAL_ID != DncVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case AssociationLowerBoundUpperBound2EditPart.VISUAL_ID:
					if (Association2EditPart.VISUAL_ID != DncVisualIDRegistry
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
				|| !DncVisualIDRegistry.canCreateNode(containerView, visualID)) {
			return null;
		}
		switch (visualID) {
		case MomentIntervalEditPart.VISUAL_ID:
			return MomentIntervalViewFactory.class;
		case MomentIntervalNameEditPart.VISUAL_ID:
			return MomentIntervalNameViewFactory.class;
		case MomentIntervalDescriptionEditPart.VISUAL_ID:
			return MomentIntervalDescriptionViewFactory.class;
		case MIDetailEditPart.VISUAL_ID:
			return MIDetailViewFactory.class;
		case MIDetailNameEditPart.VISUAL_ID:
			return MIDetailNameViewFactory.class;
		case MIDetailDescriptionEditPart.VISUAL_ID:
			return MIDetailDescriptionViewFactory.class;
		case RoleEditPart.VISUAL_ID:
			return RoleViewFactory.class;
		case RoleNameEditPart.VISUAL_ID:
			return RoleNameViewFactory.class;
		case RoleDescriptionEditPart.VISUAL_ID:
			return RoleDescriptionViewFactory.class;
		case PartyEditPart.VISUAL_ID:
			return PartyViewFactory.class;
		case PartyNameEditPart.VISUAL_ID:
			return PartyNameViewFactory.class;
		case PartyDescriptionEditPart.VISUAL_ID:
			return PartyDescriptionViewFactory.class;
		case PlaceEditPart.VISUAL_ID:
			return PlaceViewFactory.class;
		case PlaceNameEditPart.VISUAL_ID:
			return PlaceNameViewFactory.class;
		case PlaceDescriptionEditPart.VISUAL_ID:
			return PlaceDescriptionViewFactory.class;
		case ThingEditPart.VISUAL_ID:
			return ThingViewFactory.class;
		case ThingNameEditPart.VISUAL_ID:
			return ThingNameViewFactory.class;
		case ThingDescriptionEditPart.VISUAL_ID:
			return ThingDescriptionViewFactory.class;
		case DescriptionEditPart.VISUAL_ID:
			return DescriptionViewFactory.class;
		case DescriptionNameEditPart.VISUAL_ID:
			return DescriptionNameViewFactory.class;
		case DescriptionDescriptionEditPart.VISUAL_ID:
			return DescriptionDescriptionViewFactory.class;
		case PluginPointEditPart.VISUAL_ID:
			return PluginPointViewFactory.class;
		case PluginPointNameEditPart.VISUAL_ID:
			return PluginPointNameViewFactory.class;
		case PluginPointDescriptionEditPart.VISUAL_ID:
			return PluginPointDescriptionViewFactory.class;
		case Package2EditPart.VISUAL_ID:
			return Package2ViewFactory.class;
		case PackageNameEditPart.VISUAL_ID:
			return PackageNameViewFactory.class;
		case PackageName2EditPart.VISUAL_ID:
			return PackageName2ViewFactory.class;
		case AnnotationEditPart.VISUAL_ID:
			return AnnotationViewFactory.class;
		case AnnotationKeyValueEditPart.VISUAL_ID:
			return AnnotationKeyValueViewFactory.class;
		case AnnotationKeyEditPart.VISUAL_ID:
			return AnnotationKeyViewFactory.class;
		case AttributeEditPart.VISUAL_ID:
			return AttributeViewFactory.class;
		case OperationEditPart.VISUAL_ID:
			return OperationViewFactory.class;
		case Package3EditPart.VISUAL_ID:
			return Package3ViewFactory.class;
		case MomentIntervalAttributesEditPart.VISUAL_ID:
			return MomentIntervalAttributesViewFactory.class;
		case MomentIntervalOperationsEditPart.VISUAL_ID:
			return MomentIntervalOperationsViewFactory.class;
		case MIDetailAttributesEditPart.VISUAL_ID:
			return MIDetailAttributesViewFactory.class;
		case MIDetailOperationsEditPart.VISUAL_ID:
			return MIDetailOperationsViewFactory.class;
		case RoleAttributesEditPart.VISUAL_ID:
			return RoleAttributesViewFactory.class;
		case RoleOperationsEditPart.VISUAL_ID:
			return RoleOperationsViewFactory.class;
		case PartyAttributesEditPart.VISUAL_ID:
			return PartyAttributesViewFactory.class;
		case PartyOperationsEditPart.VISUAL_ID:
			return PartyOperationsViewFactory.class;
		case PlaceAttributesEditPart.VISUAL_ID:
			return PlaceAttributesViewFactory.class;
		case PlaceOperationsEditPart.VISUAL_ID:
			return PlaceOperationsViewFactory.class;
		case ThingAttributesEditPart.VISUAL_ID:
			return ThingAttributesViewFactory.class;
		case ThingOperationsEditPart.VISUAL_ID:
			return ThingOperationsViewFactory.class;
		case DescriptionAttributesEditPart.VISUAL_ID:
			return DescriptionAttributesViewFactory.class;
		case DescriptionOperationsEditPart.VISUAL_ID:
			return DescriptionOperationsViewFactory.class;
		case PluginPointAttributesEditPart.VISUAL_ID:
			return PluginPointAttributesViewFactory.class;
		case PluginPointOperationsEditPart.VISUAL_ID:
			return PluginPointOperationsViewFactory.class;
		case PackagePackagesEditPart.VISUAL_ID:
			return PackagePackagesViewFactory.class;
		case AssociationLowerBoundUpperBoundEditPart.VISUAL_ID:
			return AssociationLowerBoundUpperBoundViewFactory.class;
		case AssociationLowerBoundUpperBound2EditPart.VISUAL_ID:
			return AssociationLowerBoundUpperBound2ViewFactory.class;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Class getEdgeViewClass(IAdaptable semanticAdapter,
			View containerView, String semanticHint) {
		IElementType elementType = getSemanticElementType(semanticAdapter);
		if (!DncElementTypes.isKnownElementType(elementType)
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
		int visualID = DncVisualIDRegistry.getVisualID(elementTypeHint);
		EObject domainElement = getSemanticElement(semanticAdapter);
		if (domainElement != null
				&& visualID != DncVisualIDRegistry
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
		case ClassSuperclassesEditPart.VISUAL_ID:
			return ClassSuperclassesViewFactory.class;
		case Association2EditPart.VISUAL_ID:
			return Association2ViewFactory.class;
		case AnnotatedElementAnnotationsEditPart.VISUAL_ID:
			return AnnotatedElementAnnotationsViewFactory.class;
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
