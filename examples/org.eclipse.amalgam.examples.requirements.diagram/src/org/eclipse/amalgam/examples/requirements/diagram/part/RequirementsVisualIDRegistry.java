package org.eclipse.amalgam.examples.requirements.diagram.part;

import org.eclipse.amalgam.examples.requirements.Model;
import org.eclipse.amalgam.examples.requirements.RequirementGroup;
import org.eclipse.amalgam.examples.requirements.RequirementsPackage;
import org.eclipse.amalgam.examples.requirements.diagram.edit.parts.ModelEditPart;
import org.eclipse.amalgam.examples.requirements.diagram.edit.parts.ProcessEditPart;
import org.eclipse.amalgam.examples.requirements.diagram.edit.parts.RequirementEditPart;
import org.eclipse.amalgam.examples.requirements.diagram.edit.parts.RequirementGroup2EditPart;
import org.eclipse.amalgam.examples.requirements.diagram.edit.parts.RequirementGroupEditPart;
import org.eclipse.amalgam.examples.requirements.diagram.edit.parts.RequirementGroupId2EditPart;
import org.eclipse.amalgam.examples.requirements.diagram.edit.parts.RequirementGroupIdEditPart;
import org.eclipse.amalgam.examples.requirements.diagram.edit.parts.RequirementIdEditPart;
import org.eclipse.amalgam.examples.requirements.diagram.edit.parts.RequirementTypeEditPart;
import org.eclipse.amalgam.examples.requirements.diagram.expressions.RequirementsAbstractExpression;
import org.eclipse.amalgam.examples.requirements.diagram.expressions.RequirementsOCLFactory;
import org.eclipse.amalgam.examples.scenario.ScenarioPackage;
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
public class RequirementsVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "org.eclipse.amalgam.examples.requirements.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	private static RequirementsAbstractExpression RequirementGroup_2001_Constraint;

	/**
	 * @generated
	 */
	private static RequirementsAbstractExpression RequirementGroup_2003_Constraint;

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (ModelEditPart.MODEL_ID.equals(view.getType())) {
				return ModelEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return org.eclipse.amalgam.examples.requirements.diagram.part.RequirementsVisualIDRegistry
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
				RequirementsDiagramEditorPlugin.getInstance().logError(
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
		if (RequirementsPackage.eINSTANCE.getModel().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((Model) domainElement)) {
			return ModelEditPart.VISUAL_ID;
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
		String containerModelID = org.eclipse.amalgam.examples.requirements.diagram.part.RequirementsVisualIDRegistry
				.getModelID(containerView);
		if (!ModelEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (ModelEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = org.eclipse.amalgam.examples.requirements.diagram.part.RequirementsVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ModelEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case RequirementEditPart.VISUAL_ID:
			if (ScenarioPackage.eINSTANCE.getProcess().isSuperTypeOf(
					domainElement.eClass())) {
				return ProcessEditPart.VISUAL_ID;
			}
			break;
		case ModelEditPart.VISUAL_ID:
			if (RequirementsPackage.eINSTANCE.getRequirementGroup()
					.isSuperTypeOf(domainElement.eClass())
					&& isRequirementGroup_2001((RequirementGroup) domainElement)) {
				return RequirementGroupEditPart.VISUAL_ID;
			}
			if (RequirementsPackage.eINSTANCE.getRequirement().isSuperTypeOf(
					domainElement.eClass())) {
				return RequirementEditPart.VISUAL_ID;
			}
			if (RequirementsPackage.eINSTANCE.getRequirementGroup()
					.isSuperTypeOf(domainElement.eClass())
					&& isRequirementGroup_2003((RequirementGroup) domainElement)) {
				return RequirementGroup2EditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = org.eclipse.amalgam.examples.requirements.diagram.part.RequirementsVisualIDRegistry
				.getModelID(containerView);
		if (!ModelEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (ModelEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = org.eclipse.amalgam.examples.requirements.diagram.part.RequirementsVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ModelEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case RequirementGroupEditPart.VISUAL_ID:
			if (RequirementGroupIdEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RequirementEditPart.VISUAL_ID:
			if (RequirementIdEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RequirementTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ProcessEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RequirementGroup2EditPart.VISUAL_ID:
			if (RequirementGroupId2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ModelEditPart.VISUAL_ID:
			if (RequirementGroupEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RequirementEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RequirementGroup2EditPart.VISUAL_ID == nodeVisualID) {
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
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(Model element) {
		return true;
	}

	/**
	 * @generated
	 */
	private static boolean isRequirementGroup_2001(
			RequirementGroup domainElement) {
		if (RequirementGroup_2001_Constraint == null) { // lazy initialization
			RequirementGroup_2001_Constraint = RequirementsOCLFactory
					.getExpression(
							"parent.oclIsUndefined()", RequirementsPackage.eINSTANCE.getRequirementGroup()); //$NON-NLS-1$
		}
		Object result = RequirementGroup_2001_Constraint
				.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isRequirementGroup_2003(
			RequirementGroup domainElement) {
		if (RequirementGroup_2003_Constraint == null) { // lazy initialization
			RequirementGroup_2003_Constraint = RequirementsOCLFactory
					.getExpression(
							"parent.oclIsTypeOf(requirements::RequirementGroup)", RequirementsPackage.eINSTANCE.getRequirementGroup()); //$NON-NLS-1$
		}
		Object result = RequirementGroup_2003_Constraint
				.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

}
