package org.eclipse.amalgam.examples.scenario.diagram.part;

import org.eclipse.amalgam.examples.scenario.Association;
import org.eclipse.amalgam.examples.scenario.Event;
import org.eclipse.amalgam.examples.scenario.Gateway;
import org.eclipse.amalgam.examples.scenario.Process;
import org.eclipse.amalgam.examples.scenario.ScenarioPackage;
import org.eclipse.amalgam.examples.scenario.SequenceFlow;
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
import org.eclipse.amalgam.examples.scenario.diagram.expressions.ScenarioAbstractExpression;
import org.eclipse.amalgam.examples.scenario.diagram.expressions.ScenarioOCLFactory;
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
public class ScenarioVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "org.eclipse.amalgam.examples.scenario.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	private static ScenarioAbstractExpression Event_2002_Constraint;

	/**
	 * @generated
	 */
	private static ScenarioAbstractExpression Gateway_2003_Constraint;

	/**
	 * @generated
	 */
	private static ScenarioAbstractExpression Event_2005_Constraint;

	/**
	 * @generated
	 */
	private static ScenarioAbstractExpression Event_2006_Constraint;

	/**
	 * @generated
	 */
	private static ScenarioAbstractExpression Gateway_2008_Constraint;

	/**
	 * @generated
	 */
	private static ScenarioAbstractExpression Event_2009_Constraint;

	/**
	 * @generated
	 */
	private static ScenarioAbstractExpression Event_2010_Constraint;

	/**
	 * @generated
	 */
	private static ScenarioAbstractExpression Event_2011_Constraint;

	/**
	 * @generated
	 */
	private static ScenarioAbstractExpression Gateway_2012_Constraint;

	/**
	 * @generated
	 */
	private static ScenarioAbstractExpression Event_3001_Constraint;

	/**
	 * @generated
	 */
	private static ScenarioAbstractExpression Event_3002_Constraint;

	/**
	 * @generated
	 */
	private static ScenarioAbstractExpression Association_4001_Constraint;

	/**
	 * @generated
	 */
	private static ScenarioAbstractExpression SequenceFlow_4002_Constraint;

	/**
	 * @generated
	 */
	private static ScenarioAbstractExpression SequenceFlow_4004_Constraint;

	/**
	 * @generated
	 */
	private static ScenarioAbstractExpression Association_4005_Constraint;

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (ProcessEditPart.MODEL_ID.equals(view.getType())) {
				return ProcessEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return org.eclipse.amalgam.examples.scenario.diagram.part.ScenarioVisualIDRegistry
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
				ScenarioDiagramEditorPlugin.getInstance().logError(
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
		if (ScenarioPackage.eINSTANCE.getProcess().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((Process) domainElement)) {
			return ProcessEditPart.VISUAL_ID;
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
		String containerModelID = org.eclipse.amalgam.examples.scenario.diagram.part.ScenarioVisualIDRegistry
				.getModelID(containerView);
		if (!ProcessEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (ProcessEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = org.eclipse.amalgam.examples.scenario.diagram.part.ScenarioVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ProcessEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case TaskEditPart.VISUAL_ID:
			if (ScenarioPackage.eINSTANCE.getEvent().isSuperTypeOf(
					domainElement.eClass())
					&& isEvent_3001((Event) domainElement)) {
				return Event7EditPart.VISUAL_ID;
			}
			if (ScenarioPackage.eINSTANCE.getEvent().isSuperTypeOf(
					domainElement.eClass())
					&& isEvent_3002((Event) domainElement)) {
				return Event8EditPart.VISUAL_ID;
			}
			break;
		case ProcessEditPart.VISUAL_ID:
			if (ScenarioPackage.eINSTANCE.getDataObject().isSuperTypeOf(
					domainElement.eClass())) {
				return DataObjectEditPart.VISUAL_ID;
			}
			if (ScenarioPackage.eINSTANCE.getEvent().isSuperTypeOf(
					domainElement.eClass())
					&& isEvent_2002((Event) domainElement)) {
				return EventEditPart.VISUAL_ID;
			}
			if (ScenarioPackage.eINSTANCE.getGateway().isSuperTypeOf(
					domainElement.eClass())
					&& isGateway_2003((Gateway) domainElement)) {
				return GatewayEditPart.VISUAL_ID;
			}
			if (ScenarioPackage.eINSTANCE.getTask().isSuperTypeOf(
					domainElement.eClass())) {
				return TaskEditPart.VISUAL_ID;
			}
			if (ScenarioPackage.eINSTANCE.getEvent().isSuperTypeOf(
					domainElement.eClass())
					&& isEvent_2005((Event) domainElement)) {
				return Event2EditPart.VISUAL_ID;
			}
			if (ScenarioPackage.eINSTANCE.getEvent().isSuperTypeOf(
					domainElement.eClass())
					&& isEvent_2006((Event) domainElement)) {
				return Event3EditPart.VISUAL_ID;
			}
			if (ScenarioPackage.eINSTANCE.getProcess().isSuperTypeOf(
					domainElement.eClass())) {
				return Process2EditPart.VISUAL_ID;
			}
			if (ScenarioPackage.eINSTANCE.getGateway().isSuperTypeOf(
					domainElement.eClass())
					&& isGateway_2008((Gateway) domainElement)) {
				return Gateway2EditPart.VISUAL_ID;
			}
			if (ScenarioPackage.eINSTANCE.getEvent().isSuperTypeOf(
					domainElement.eClass())
					&& isEvent_2009((Event) domainElement)) {
				return Event4EditPart.VISUAL_ID;
			}
			if (ScenarioPackage.eINSTANCE.getEvent().isSuperTypeOf(
					domainElement.eClass())
					&& isEvent_2010((Event) domainElement)) {
				return Event5EditPart.VISUAL_ID;
			}
			if (ScenarioPackage.eINSTANCE.getEvent().isSuperTypeOf(
					domainElement.eClass())
					&& isEvent_2011((Event) domainElement)) {
				return Event6EditPart.VISUAL_ID;
			}
			if (ScenarioPackage.eINSTANCE.getGateway().isSuperTypeOf(
					domainElement.eClass())
					&& isGateway_2012((Gateway) domainElement)) {
				return Gateway3EditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = org.eclipse.amalgam.examples.scenario.diagram.part.ScenarioVisualIDRegistry
				.getModelID(containerView);
		if (!ProcessEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (ProcessEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = org.eclipse.amalgam.examples.scenario.diagram.part.ScenarioVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ProcessEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case DataObjectEditPart.VISUAL_ID:
			if (DataObjectNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TaskEditPart.VISUAL_ID:
			if (TaskNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Event7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Event8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Event2EditPart.VISUAL_ID:
			if (EventNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Process2EditPart.VISUAL_ID:
			if (ProcessNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ProcessEditPart.VISUAL_ID:
			if (DataObjectEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EventEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GatewayEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TaskEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Event2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Event3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Process2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Gateway2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Event4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Event5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Event6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Gateway3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SequenceFlowEditPart.VISUAL_ID:
			if (SequenceFlowNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MessageFlowEditPart.VISUAL_ID:
			if (MessageFlowNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SequenceFlow2EditPart.VISUAL_ID:
			if (SequenceFlowName2EditPart.VISUAL_ID == nodeVisualID) {
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
		if (ScenarioPackage.eINSTANCE.getAssociation().isSuperTypeOf(
				domainElement.eClass())
				&& isAssociation_4001((Association) domainElement)) {
			return AssociationEditPart.VISUAL_ID;
		}
		if (ScenarioPackage.eINSTANCE.getSequenceFlow().isSuperTypeOf(
				domainElement.eClass())
				&& isSequenceFlow_4002((SequenceFlow) domainElement)) {
			return SequenceFlowEditPart.VISUAL_ID;
		}
		if (ScenarioPackage.eINSTANCE.getMessageFlow().isSuperTypeOf(
				domainElement.eClass())) {
			return MessageFlowEditPart.VISUAL_ID;
		}
		if (ScenarioPackage.eINSTANCE.getSequenceFlow().isSuperTypeOf(
				domainElement.eClass())
				&& isSequenceFlow_4004((SequenceFlow) domainElement)) {
			return SequenceFlow2EditPart.VISUAL_ID;
		}
		if (ScenarioPackage.eINSTANCE.getAssociation().isSuperTypeOf(
				domainElement.eClass())
				&& isAssociation_4005((Association) domainElement)) {
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
	private static boolean isDiagram(Process element) {
		return true;
	}

	/**
	 * @generated
	 */
	private static boolean isEvent_2002(Event domainElement) {
		if (Event_2002_Constraint == null) { // lazy initialization
			Event_2002_Constraint = ScenarioOCLFactory
					.getExpression(
							"eventType = EventType::START and triggerType = TriggerType::NONE", ScenarioPackage.eINSTANCE.getEvent()); //$NON-NLS-1$
		}
		Object result = Event_2002_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isGateway_2003(Gateway domainElement) {
		if (Gateway_2003_Constraint == null) { // lazy initialization
			Gateway_2003_Constraint = ScenarioOCLFactory
					.getExpression(
							"gatewayType = GatewayType::XOR", ScenarioPackage.eINSTANCE.getGateway()); //$NON-NLS-1$
		}
		Object result = Gateway_2003_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isEvent_2005(Event domainElement) {
		if (Event_2005_Constraint == null) { // lazy initialization
			Event_2005_Constraint = ScenarioOCLFactory
					.getExpression(
							"eventType = EventType::INTERMEDIATE and triggerType = TriggerType::NONE", ScenarioPackage.eINSTANCE.getEvent()); //$NON-NLS-1$
		}
		Object result = Event_2005_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isEvent_2006(Event domainElement) {
		if (Event_2006_Constraint == null) { // lazy initialization
			Event_2006_Constraint = ScenarioOCLFactory
					.getExpression(
							"eventType = EventType::END and triggerType = TriggerType::NONE", ScenarioPackage.eINSTANCE.getEvent()); //$NON-NLS-1$
		}
		Object result = Event_2006_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isGateway_2008(Gateway domainElement) {
		if (Gateway_2008_Constraint == null) { // lazy initialization
			Gateway_2008_Constraint = ScenarioOCLFactory
					.getExpression(
							"gatewayType = GatewayType::AND", ScenarioPackage.eINSTANCE.getGateway()); //$NON-NLS-1$
		}
		Object result = Gateway_2008_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isEvent_2009(Event domainElement) {
		if (Event_2009_Constraint == null) { // lazy initialization
			Event_2009_Constraint = ScenarioOCLFactory
					.getExpression(
							"eventType = EventType::START and triggerType = TriggerType::MESSAGE", ScenarioPackage.eINSTANCE.getEvent()); //$NON-NLS-1$
		}
		Object result = Event_2009_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isEvent_2010(Event domainElement) {
		if (Event_2010_Constraint == null) { // lazy initialization
			Event_2010_Constraint = ScenarioOCLFactory
					.getExpression(
							"eventType = EventType::INTERMEDIATE and triggerType = TriggerType::MESSAGE", ScenarioPackage.eINSTANCE.getEvent()); //$NON-NLS-1$
		}
		Object result = Event_2010_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isEvent_2011(Event domainElement) {
		if (Event_2011_Constraint == null) { // lazy initialization
			Event_2011_Constraint = ScenarioOCLFactory
					.getExpression(
							"eventType = EventType::END and triggerType = TriggerType::MESSAGE", ScenarioPackage.eINSTANCE.getEvent()); //$NON-NLS-1$
		}
		Object result = Event_2011_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isGateway_2012(Gateway domainElement) {
		if (Gateway_2012_Constraint == null) { // lazy initialization
			Gateway_2012_Constraint = ScenarioOCLFactory
					.getExpression(
							"gatewayType = GatewayType::OR", ScenarioPackage.eINSTANCE.getGateway()); //$NON-NLS-1$
		}
		Object result = Gateway_2012_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isEvent_3001(Event domainElement) {
		if (Event_3001_Constraint == null) { // lazy initialization
			Event_3001_Constraint = ScenarioOCLFactory
					.getExpression(
							"eventType = EventType::INTERMEDIATE and triggerType = TriggerType::NONE", ScenarioPackage.eINSTANCE.getEvent()); //$NON-NLS-1$
		}
		Object result = Event_3001_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isEvent_3002(Event domainElement) {
		if (Event_3002_Constraint == null) { // lazy initialization
			Event_3002_Constraint = ScenarioOCLFactory
					.getExpression(
							"eventType = EventType::INTERMEDIATE and triggerType = TriggerType::MESSAGE", ScenarioPackage.eINSTANCE.getEvent()); //$NON-NLS-1$
		}
		Object result = Event_3002_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isAssociation_4001(Association domainElement) {
		if (Association_4001_Constraint == null) { // lazy initialization
			Association_4001_Constraint = ScenarioOCLFactory
					.getExpression(
							"isDirected = true", ScenarioPackage.eINSTANCE.getAssociation()); //$NON-NLS-1$
		}
		Object result = Association_4001_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isSequenceFlow_4002(SequenceFlow domainElement) {
		if (SequenceFlow_4002_Constraint == null) { // lazy initialization
			SequenceFlow_4002_Constraint = ScenarioOCLFactory
					.getExpression(
							"isDefault = false", ScenarioPackage.eINSTANCE.getSequenceFlow()); //$NON-NLS-1$
		}
		Object result = SequenceFlow_4002_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isSequenceFlow_4004(SequenceFlow domainElement) {
		if (SequenceFlow_4004_Constraint == null) { // lazy initialization
			SequenceFlow_4004_Constraint = ScenarioOCLFactory
					.getExpression(
							"isDefault = true", ScenarioPackage.eINSTANCE.getSequenceFlow()); //$NON-NLS-1$
		}
		Object result = SequenceFlow_4004_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isAssociation_4005(Association domainElement) {
		if (Association_4005_Constraint == null) { // lazy initialization
			Association_4005_Constraint = ScenarioOCLFactory
					.getExpression(
							"isDirected = false", ScenarioPackage.eINSTANCE.getAssociation()); //$NON-NLS-1$
		}
		Object result = Association_4005_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

}
