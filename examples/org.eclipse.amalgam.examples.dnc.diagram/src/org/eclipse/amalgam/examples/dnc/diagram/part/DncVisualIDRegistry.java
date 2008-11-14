package org.eclipse.amalgam.examples.dnc.diagram.part;

import org.eclipse.amalgam.examples.dnc.Association;
import org.eclipse.amalgam.examples.dnc.DncPackage;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.AnnotationEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.AnnotationKeyEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.AnnotationKeyValueEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.Association2EditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.AssociationEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.AssociationLowerBoundUpperBound2EditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.AssociationLowerBoundUpperBoundEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.AttributeEditPart;
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
import org.eclipse.amalgam.examples.dnc.diagram.expressions.DncAbstractExpression;
import org.eclipse.amalgam.examples.dnc.diagram.expressions.DncOCLFactory;
import org.eclipse.amalgam.examples.oocore.OocorePackage;
import org.eclipse.amalgam.examples.oocore.Package;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class DncVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "org.eclipse.amalgam.examples.dnc.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	private static DncAbstractExpression Association_4001_Constraint;

	/**
	 * @generated
	 */
	private static DncAbstractExpression Association_4003_Constraint;

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (PackageEditPart.MODEL_ID.equals(view.getType())) {
				return PackageEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return org.eclipse.amalgam.examples.dnc.diagram.part.DncVisualIDRegistry
				.getVisualID(view.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				DncDiagramEditorPlugin.getInstance().logError(
						"Unable to parse view type as a visualID number: "
								+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return String.valueOf(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (OocorePackage.eINSTANCE.getPackage().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((Package) domainElement)) {
			return PackageEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = org.eclipse.amalgam.examples.dnc.diagram.part.DncVisualIDRegistry
				.getModelID(containerView);
		if (!PackageEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (PackageEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = org.eclipse.amalgam.examples.dnc.diagram.part.DncVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = PackageEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case MomentIntervalAttributesEditPart.VISUAL_ID:
			if (OocorePackage.eINSTANCE.getAttribute().isSuperTypeOf(
					domainElement.eClass())) {
				return AttributeEditPart.VISUAL_ID;
			}
			break;
		case MomentIntervalOperationsEditPart.VISUAL_ID:
			if (OocorePackage.eINSTANCE.getOperation().isSuperTypeOf(
					domainElement.eClass())) {
				return OperationEditPart.VISUAL_ID;
			}
			break;
		case MIDetailAttributesEditPart.VISUAL_ID:
			if (OocorePackage.eINSTANCE.getAttribute().isSuperTypeOf(
					domainElement.eClass())) {
				return AttributeEditPart.VISUAL_ID;
			}
			break;
		case MIDetailOperationsEditPart.VISUAL_ID:
			if (OocorePackage.eINSTANCE.getOperation().isSuperTypeOf(
					domainElement.eClass())) {
				return OperationEditPart.VISUAL_ID;
			}
			break;
		case RoleAttributesEditPart.VISUAL_ID:
			if (OocorePackage.eINSTANCE.getAttribute().isSuperTypeOf(
					domainElement.eClass())) {
				return AttributeEditPart.VISUAL_ID;
			}
			break;
		case RoleOperationsEditPart.VISUAL_ID:
			if (OocorePackage.eINSTANCE.getOperation().isSuperTypeOf(
					domainElement.eClass())) {
				return OperationEditPart.VISUAL_ID;
			}
			break;
		case PartyAttributesEditPart.VISUAL_ID:
			if (OocorePackage.eINSTANCE.getAttribute().isSuperTypeOf(
					domainElement.eClass())) {
				return AttributeEditPart.VISUAL_ID;
			}
			break;
		case PartyOperationsEditPart.VISUAL_ID:
			if (OocorePackage.eINSTANCE.getOperation().isSuperTypeOf(
					domainElement.eClass())) {
				return OperationEditPart.VISUAL_ID;
			}
			break;
		case PlaceAttributesEditPart.VISUAL_ID:
			if (OocorePackage.eINSTANCE.getAttribute().isSuperTypeOf(
					domainElement.eClass())) {
				return AttributeEditPart.VISUAL_ID;
			}
			break;
		case PlaceOperationsEditPart.VISUAL_ID:
			if (OocorePackage.eINSTANCE.getOperation().isSuperTypeOf(
					domainElement.eClass())) {
				return OperationEditPart.VISUAL_ID;
			}
			break;
		case ThingAttributesEditPart.VISUAL_ID:
			if (OocorePackage.eINSTANCE.getAttribute().isSuperTypeOf(
					domainElement.eClass())) {
				return AttributeEditPart.VISUAL_ID;
			}
			break;
		case ThingOperationsEditPart.VISUAL_ID:
			if (OocorePackage.eINSTANCE.getOperation().isSuperTypeOf(
					domainElement.eClass())) {
				return OperationEditPart.VISUAL_ID;
			}
			break;
		case DescriptionAttributesEditPart.VISUAL_ID:
			if (OocorePackage.eINSTANCE.getAttribute().isSuperTypeOf(
					domainElement.eClass())) {
				return AttributeEditPart.VISUAL_ID;
			}
			break;
		case DescriptionOperationsEditPart.VISUAL_ID:
			if (OocorePackage.eINSTANCE.getOperation().isSuperTypeOf(
					domainElement.eClass())) {
				return OperationEditPart.VISUAL_ID;
			}
			break;
		case PluginPointAttributesEditPart.VISUAL_ID:
			if (OocorePackage.eINSTANCE.getAttribute().isSuperTypeOf(
					domainElement.eClass())) {
				return AttributeEditPart.VISUAL_ID;
			}
			break;
		case PluginPointOperationsEditPart.VISUAL_ID:
			if (OocorePackage.eINSTANCE.getOperation().isSuperTypeOf(
					domainElement.eClass())) {
				return OperationEditPart.VISUAL_ID;
			}
			break;
		case PackagePackagesEditPart.VISUAL_ID:
			if (OocorePackage.eINSTANCE.getPackage().isSuperTypeOf(
					domainElement.eClass())) {
				return Package3EditPart.VISUAL_ID;
			}
			break;
		case PackageEditPart.VISUAL_ID:
			if (DncPackage.eINSTANCE.getMomentInterval().isSuperTypeOf(
					domainElement.eClass())) {
				return MomentIntervalEditPart.VISUAL_ID;
			}
			if (DncPackage.eINSTANCE.getMIDetail().isSuperTypeOf(
					domainElement.eClass())) {
				return MIDetailEditPart.VISUAL_ID;
			}
			if (DncPackage.eINSTANCE.getRole().isSuperTypeOf(
					domainElement.eClass())) {
				return RoleEditPart.VISUAL_ID;
			}
			if (DncPackage.eINSTANCE.getParty().isSuperTypeOf(
					domainElement.eClass())) {
				return PartyEditPart.VISUAL_ID;
			}
			if (DncPackage.eINSTANCE.getPlace().isSuperTypeOf(
					domainElement.eClass())) {
				return PlaceEditPart.VISUAL_ID;
			}
			if (DncPackage.eINSTANCE.getThing().isSuperTypeOf(
					domainElement.eClass())) {
				return ThingEditPart.VISUAL_ID;
			}
			if (DncPackage.eINSTANCE.getDescription().isSuperTypeOf(
					domainElement.eClass())) {
				return DescriptionEditPart.VISUAL_ID;
			}
			if (DncPackage.eINSTANCE.getPluginPoint().isSuperTypeOf(
					domainElement.eClass())) {
				return PluginPointEditPart.VISUAL_ID;
			}
			if (OocorePackage.eINSTANCE.getPackage().isSuperTypeOf(
					domainElement.eClass())) {
				return Package2EditPart.VISUAL_ID;
			}
			if (OocorePackage.eINSTANCE.getAnnotation().isSuperTypeOf(
					domainElement.eClass())) {
				return AnnotationEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = org.eclipse.amalgam.examples.dnc.diagram.part.DncVisualIDRegistry
				.getModelID(containerView);
		if (!PackageEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (PackageEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = org.eclipse.amalgam.examples.dnc.diagram.part.DncVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = PackageEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case MomentIntervalEditPart.VISUAL_ID:
			if (MomentIntervalNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MomentIntervalDescriptionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MomentIntervalAttributesEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MomentIntervalOperationsEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MIDetailEditPart.VISUAL_ID:
			if (MIDetailNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MIDetailDescriptionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MIDetailAttributesEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MIDetailOperationsEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RoleEditPart.VISUAL_ID:
			if (RoleNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RoleDescriptionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RoleAttributesEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RoleOperationsEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PartyEditPart.VISUAL_ID:
			if (PartyNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PartyDescriptionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PartyAttributesEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PartyOperationsEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PlaceEditPart.VISUAL_ID:
			if (PlaceNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PlaceDescriptionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PlaceAttributesEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PlaceOperationsEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ThingEditPart.VISUAL_ID:
			if (ThingNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ThingDescriptionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ThingAttributesEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ThingOperationsEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DescriptionEditPart.VISUAL_ID:
			if (DescriptionNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DescriptionDescriptionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DescriptionAttributesEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DescriptionOperationsEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PluginPointEditPart.VISUAL_ID:
			if (PluginPointNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PluginPointDescriptionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PluginPointAttributesEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PluginPointOperationsEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Package2EditPart.VISUAL_ID:
			if (PackageNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PackageName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PackagePackagesEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AnnotationEditPart.VISUAL_ID:
			if (AnnotationKeyValueEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AnnotationKeyEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MomentIntervalAttributesEditPart.VISUAL_ID:
			if (AttributeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MomentIntervalOperationsEditPart.VISUAL_ID:
			if (OperationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MIDetailAttributesEditPart.VISUAL_ID:
			if (AttributeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MIDetailOperationsEditPart.VISUAL_ID:
			if (OperationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RoleAttributesEditPart.VISUAL_ID:
			if (AttributeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RoleOperationsEditPart.VISUAL_ID:
			if (OperationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PartyAttributesEditPart.VISUAL_ID:
			if (AttributeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PartyOperationsEditPart.VISUAL_ID:
			if (OperationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PlaceAttributesEditPart.VISUAL_ID:
			if (AttributeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PlaceOperationsEditPart.VISUAL_ID:
			if (OperationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ThingAttributesEditPart.VISUAL_ID:
			if (AttributeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ThingOperationsEditPart.VISUAL_ID:
			if (OperationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DescriptionAttributesEditPart.VISUAL_ID:
			if (AttributeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DescriptionOperationsEditPart.VISUAL_ID:
			if (OperationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PluginPointAttributesEditPart.VISUAL_ID:
			if (AttributeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PluginPointOperationsEditPart.VISUAL_ID:
			if (OperationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PackagePackagesEditPart.VISUAL_ID:
			if (Package3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PackageEditPart.VISUAL_ID:
			if (MomentIntervalEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MIDetailEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RoleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PartyEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PlaceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ThingEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DescriptionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PluginPointEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Package2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AnnotationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AssociationEditPart.VISUAL_ID:
			if (AssociationLowerBoundUpperBoundEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Association2EditPart.VISUAL_ID:
			if (AssociationLowerBoundUpperBound2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (DncPackage.eINSTANCE.getAssociation().isSuperTypeOf(
				domainElement.eClass())
				&& isAssociation_4001((Association) domainElement)) {
			return AssociationEditPart.VISUAL_ID;
		}
		if (DncPackage.eINSTANCE.getAssociation().isSuperTypeOf(
				domainElement.eClass())
				&& isAssociation_4003((Association) domainElement)) {
			return Association2EditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(Package element) {
		return true;
	}

	/**
	 * @generated
	 */
	private static boolean isAssociation_4001(Association domainElement) {
		if (Association_4001_Constraint == null) { // lazy initialization
			Association_4001_Constraint = DncOCLFactory
					.getExpression(
							"self.aggregation = false", DncPackage.eINSTANCE.getAssociation()); //$NON-NLS-1$
		}
		Object result = Association_4001_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isAssociation_4003(Association domainElement) {
		if (Association_4003_Constraint == null) { // lazy initialization
			Association_4003_Constraint = DncOCLFactory
					.getExpression(
							"self.aggregation = true", DncPackage.eINSTANCE.getAssociation()); //$NON-NLS-1$
		}
		Object result = Association_4003_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

}
