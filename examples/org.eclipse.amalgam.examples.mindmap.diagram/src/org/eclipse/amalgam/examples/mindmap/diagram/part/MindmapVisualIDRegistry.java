package org.eclipse.amalgam.examples.mindmap.diagram.part;

import org.eclipse.amalgam.examples.mindmap.Map;
import org.eclipse.amalgam.examples.mindmap.MindmapPackage;
import org.eclipse.amalgam.examples.mindmap.Relationship;
import org.eclipse.amalgam.examples.mindmap.Topic;
import org.eclipse.amalgam.examples.mindmap.diagram.edit.parts.MapEditPart;
import org.eclipse.amalgam.examples.mindmap.diagram.edit.parts.Relationship2EditPart;
import org.eclipse.amalgam.examples.mindmap.diagram.edit.parts.Relationship3EditPart;
import org.eclipse.amalgam.examples.mindmap.diagram.edit.parts.RelationshipEditPart;
import org.eclipse.amalgam.examples.mindmap.diagram.edit.parts.RelationshipName2EditPart;
import org.eclipse.amalgam.examples.mindmap.diagram.edit.parts.RelationshipName3EditPart;
import org.eclipse.amalgam.examples.mindmap.diagram.edit.parts.RelationshipNameEditPart;
import org.eclipse.amalgam.examples.mindmap.diagram.edit.parts.RelationshipType2EditPart;
import org.eclipse.amalgam.examples.mindmap.diagram.edit.parts.RelationshipType3EditPart;
import org.eclipse.amalgam.examples.mindmap.diagram.edit.parts.RelationshipTypeEditPart;
import org.eclipse.amalgam.examples.mindmap.diagram.edit.parts.Topic2EditPart;
import org.eclipse.amalgam.examples.mindmap.diagram.edit.parts.TopicEditPart;
import org.eclipse.amalgam.examples.mindmap.diagram.edit.parts.TopicName2EditPart;
import org.eclipse.amalgam.examples.mindmap.diagram.edit.parts.TopicNameEditPart;
import org.eclipse.amalgam.examples.mindmap.diagram.expressions.MindmapAbstractExpression;
import org.eclipse.amalgam.examples.mindmap.diagram.expressions.MindmapOCLFactory;
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
public class MindmapVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "org.eclipse.amalgam.examples.mindmap.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	private static MindmapAbstractExpression Topic_2001_Constraint;

	/**
	 * @generated
	 */
	private static MindmapAbstractExpression Topic_2002_Constraint;

	/**
	 * @generated
	 */
	private static MindmapAbstractExpression Relationship_4002_Constraint;
	/**
	 * @generated
	 */
	private static MindmapAbstractExpression Relationship_4003_Constraint;
	/**
	 * @generated
	 */
	private static MindmapAbstractExpression Relationship_4004_Constraint;

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (MapEditPart.MODEL_ID.equals(view.getType())) {
				return MapEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return org.eclipse.amalgam.examples.mindmap.diagram.part.MindmapVisualIDRegistry
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
				MindmapDiagramEditorPlugin.getInstance().logError(
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
		if (MindmapPackage.eINSTANCE.getMap().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((Map) domainElement)) {
			return MapEditPart.VISUAL_ID;
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
		String containerModelID = org.eclipse.amalgam.examples.mindmap.diagram.part.MindmapVisualIDRegistry
				.getModelID(containerView);
		if (!MapEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (MapEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = org.eclipse.amalgam.examples.mindmap.diagram.part.MindmapVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = MapEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case MapEditPart.VISUAL_ID:
			if (MindmapPackage.eINSTANCE.getTopic().isSuperTypeOf(
					domainElement.eClass())
					&& isTopic_2001((Topic) domainElement)) {
				return TopicEditPart.VISUAL_ID;
			}
			if (MindmapPackage.eINSTANCE.getTopic().isSuperTypeOf(
					domainElement.eClass())
					&& isTopic_2002((Topic) domainElement)) {
				return Topic2EditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = org.eclipse.amalgam.examples.mindmap.diagram.part.MindmapVisualIDRegistry
				.getModelID(containerView);
		if (!MapEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (MapEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = org.eclipse.amalgam.examples.mindmap.diagram.part.MindmapVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = MapEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case TopicEditPart.VISUAL_ID:
			if (TopicNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Topic2EditPart.VISUAL_ID:
			if (TopicName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MapEditPart.VISUAL_ID:
			if (TopicEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Topic2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RelationshipEditPart.VISUAL_ID:
			if (RelationshipNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RelationshipTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Relationship2EditPart.VISUAL_ID:
			if (RelationshipName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RelationshipType2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Relationship3EditPart.VISUAL_ID:
			if (RelationshipName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RelationshipType3EditPart.VISUAL_ID == nodeVisualID) {
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
		if (MindmapPackage.eINSTANCE.getRelationship().isSuperTypeOf(
				domainElement.eClass())
				&& isRelationship_4002((Relationship) domainElement)) {
			return RelationshipEditPart.VISUAL_ID;
		}
		if (MindmapPackage.eINSTANCE.getRelationship().isSuperTypeOf(
				domainElement.eClass())
				&& isRelationship_4003((Relationship) domainElement)) {
			return Relationship2EditPart.VISUAL_ID;
		}
		if (MindmapPackage.eINSTANCE.getRelationship().isSuperTypeOf(
				domainElement.eClass())
				&& isRelationship_4004((Relationship) domainElement)) {
			return Relationship3EditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(Map element) {
		return true;
	}

	/**
	 * @generated
	 */
	private static boolean isTopic_2001(Topic domainElement) {
		if (Topic_2001_Constraint == null) { // lazy initialization
			Topic_2001_Constraint = MindmapOCLFactory.getExpression(
					"self.parent = null", MindmapPackage.eINSTANCE.getTopic()); //$NON-NLS-1$
		}
		Object result = Topic_2001_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isTopic_2002(Topic domainElement) {
		if (Topic_2002_Constraint == null) { // lazy initialization
			Topic_2002_Constraint = MindmapOCLFactory.getExpression(
					"self.parent <> null", MindmapPackage.eINSTANCE.getTopic()); //$NON-NLS-1$
		}
		Object result = Topic_2002_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isRelationship_4002(Relationship domainElement) {
		if (Relationship_4002_Constraint == null) { // lazy initialization
			Relationship_4002_Constraint = MindmapOCLFactory
					.getExpression(
							"self.type = Type::DEPENDENCY", MindmapPackage.eINSTANCE.getRelationship()); //$NON-NLS-1$
		}
		Object result = Relationship_4002_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isRelationship_4003(Relationship domainElement) {
		if (Relationship_4003_Constraint == null) { // lazy initialization
			Relationship_4003_Constraint = MindmapOCLFactory
					.getExpression(
							"self.type = Type::INCLUDE", MindmapPackage.eINSTANCE.getRelationship()); //$NON-NLS-1$
		}
		Object result = Relationship_4003_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isRelationship_4004(Relationship domainElement) {
		if (Relationship_4004_Constraint == null) { // lazy initialization
			Relationship_4004_Constraint = MindmapOCLFactory
					.getExpression(
							"self.type = Type::EXTEND", MindmapPackage.eINSTANCE.getRelationship()); //$NON-NLS-1$
		}
		Object result = Relationship_4004_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

}
