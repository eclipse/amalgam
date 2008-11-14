package org.eclipse.amalgam.examples.scenario.diagram.providers;

import org.eclipse.amalgam.examples.scenario.Association;
import org.eclipse.amalgam.examples.scenario.Event;
import org.eclipse.amalgam.examples.scenario.EventType;
import org.eclipse.amalgam.examples.scenario.Gateway;
import org.eclipse.amalgam.examples.scenario.GatewayType;
import org.eclipse.amalgam.examples.scenario.ScenarioPackage;
import org.eclipse.amalgam.examples.scenario.SequenceFlow;
import org.eclipse.amalgam.examples.scenario.TriggerType;
import org.eclipse.amalgam.examples.scenario.diagram.expressions.ScenarioAbstractExpression;
import org.eclipse.amalgam.examples.scenario.diagram.expressions.ScenarioOCLFactory;
import org.eclipse.amalgam.examples.scenario.diagram.part.ScenarioDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {
	/**
	 * @generated
	 */
	public static void init_Event_2002(Event instance) {
		try {
			Object value_0 = ScenarioOCLFactory.getExpression(
					"EventType::START", ScenarioPackage.eINSTANCE.getEvent())
					.evaluate(instance);

			value_0 = ScenarioAbstractExpression.performCast(value_0,
					ScenarioPackage.eINSTANCE.getEventType());
			instance.setEventType((EventType) value_0);
			Object value_1 = ScenarioOCLFactory.getExpression(
					"TriggerType::NONE", ScenarioPackage.eINSTANCE.getEvent())
					.evaluate(instance);

			value_1 = ScenarioAbstractExpression.performCast(value_1,
					ScenarioPackage.eINSTANCE.getTriggerType());
			instance.setTriggerType((TriggerType) value_1);
		} catch (RuntimeException e) {
			ScenarioDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public static void init_Gateway_2003(Gateway instance) {
		try {
			Object value_0 = ScenarioOCLFactory.getExpression(
					"GatewayType::XOR", ScenarioPackage.eINSTANCE.getGateway())
					.evaluate(instance);

			value_0 = ScenarioAbstractExpression.performCast(value_0,
					ScenarioPackage.eINSTANCE.getGatewayType());
			instance.setGatewayType((GatewayType) value_0);
		} catch (RuntimeException e) {
			ScenarioDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public static void init_Event_2005(Event instance) {
		try {
			Object value_0 = ScenarioOCLFactory.getExpression(
					"EventType::INTERMEDIATE",
					ScenarioPackage.eINSTANCE.getEvent()).evaluate(instance);

			value_0 = ScenarioAbstractExpression.performCast(value_0,
					ScenarioPackage.eINSTANCE.getEventType());
			instance.setEventType((EventType) value_0);
			Object value_1 = ScenarioOCLFactory.getExpression(
					"TriggerType::NONE", ScenarioPackage.eINSTANCE.getEvent())
					.evaluate(instance);

			value_1 = ScenarioAbstractExpression.performCast(value_1,
					ScenarioPackage.eINSTANCE.getTriggerType());
			instance.setTriggerType((TriggerType) value_1);
		} catch (RuntimeException e) {
			ScenarioDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public static void init_Event_2006(Event instance) {
		try {
			Object value_0 = ScenarioOCLFactory.getExpression("EventType::END",
					ScenarioPackage.eINSTANCE.getEvent()).evaluate(instance);

			value_0 = ScenarioAbstractExpression.performCast(value_0,
					ScenarioPackage.eINSTANCE.getEventType());
			instance.setEventType((EventType) value_0);
			Object value_1 = ScenarioOCLFactory.getExpression(
					"TriggerType::NONE", ScenarioPackage.eINSTANCE.getEvent())
					.evaluate(instance);

			value_1 = ScenarioAbstractExpression.performCast(value_1,
					ScenarioPackage.eINSTANCE.getTriggerType());
			instance.setTriggerType((TriggerType) value_1);
		} catch (RuntimeException e) {
			ScenarioDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public static void init_Gateway_2008(Gateway instance) {
		try {
			Object value_0 = ScenarioOCLFactory.getExpression(
					"GatewayType::AND", ScenarioPackage.eINSTANCE.getGateway())
					.evaluate(instance);

			value_0 = ScenarioAbstractExpression.performCast(value_0,
					ScenarioPackage.eINSTANCE.getGatewayType());
			instance.setGatewayType((GatewayType) value_0);
		} catch (RuntimeException e) {
			ScenarioDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public static void init_Event_2009(Event instance) {
		try {
			Object value_0 = ScenarioOCLFactory.getExpression(
					"EventType::START", ScenarioPackage.eINSTANCE.getEvent())
					.evaluate(instance);

			value_0 = ScenarioAbstractExpression.performCast(value_0,
					ScenarioPackage.eINSTANCE.getEventType());
			instance.setEventType((EventType) value_0);
			Object value_1 = ScenarioOCLFactory.getExpression(
					"TriggerType::MESSAGE",
					ScenarioPackage.eINSTANCE.getEvent()).evaluate(instance);

			value_1 = ScenarioAbstractExpression.performCast(value_1,
					ScenarioPackage.eINSTANCE.getTriggerType());
			instance.setTriggerType((TriggerType) value_1);
		} catch (RuntimeException e) {
			ScenarioDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public static void init_Event_2010(Event instance) {
		try {
			Object value_0 = ScenarioOCLFactory.getExpression(
					"EventType::INTERMEDIATE",
					ScenarioPackage.eINSTANCE.getEvent()).evaluate(instance);

			value_0 = ScenarioAbstractExpression.performCast(value_0,
					ScenarioPackage.eINSTANCE.getEventType());
			instance.setEventType((EventType) value_0);
			Object value_1 = ScenarioOCLFactory.getExpression(
					"TriggerType::MESSAGE",
					ScenarioPackage.eINSTANCE.getEvent()).evaluate(instance);

			value_1 = ScenarioAbstractExpression.performCast(value_1,
					ScenarioPackage.eINSTANCE.getTriggerType());
			instance.setTriggerType((TriggerType) value_1);
		} catch (RuntimeException e) {
			ScenarioDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public static void init_Event_2011(Event instance) {
		try {
			Object value_0 = ScenarioOCLFactory.getExpression("EventType::END",
					ScenarioPackage.eINSTANCE.getEvent()).evaluate(instance);

			value_0 = ScenarioAbstractExpression.performCast(value_0,
					ScenarioPackage.eINSTANCE.getEventType());
			instance.setEventType((EventType) value_0);
			Object value_1 = ScenarioOCLFactory.getExpression(
					"TriggerType::MESSAGE",
					ScenarioPackage.eINSTANCE.getEvent()).evaluate(instance);

			value_1 = ScenarioAbstractExpression.performCast(value_1,
					ScenarioPackage.eINSTANCE.getTriggerType());
			instance.setTriggerType((TriggerType) value_1);
		} catch (RuntimeException e) {
			ScenarioDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public static void init_Gateway_2012(Gateway instance) {
		try {
			Object value_0 = ScenarioOCLFactory.getExpression(
					"GatewayType::OR", ScenarioPackage.eINSTANCE.getGateway())
					.evaluate(instance);

			value_0 = ScenarioAbstractExpression.performCast(value_0,
					ScenarioPackage.eINSTANCE.getGatewayType());
			instance.setGatewayType((GatewayType) value_0);
		} catch (RuntimeException e) {
			ScenarioDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public static void init_Event_3001(Event instance) {
		try {
			Object value_0 = ScenarioOCLFactory.getExpression(
					"EventType::INTERMEDIATE",
					ScenarioPackage.eINSTANCE.getEvent()).evaluate(instance);

			value_0 = ScenarioAbstractExpression.performCast(value_0,
					ScenarioPackage.eINSTANCE.getEventType());
			instance.setEventType((EventType) value_0);
			Object value_1 = ScenarioOCLFactory.getExpression(
					"TriggerType::NONE", ScenarioPackage.eINSTANCE.getEvent())
					.evaluate(instance);

			value_1 = ScenarioAbstractExpression.performCast(value_1,
					ScenarioPackage.eINSTANCE.getTriggerType());
			instance.setTriggerType((TriggerType) value_1);
		} catch (RuntimeException e) {
			ScenarioDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public static void init_Event_3002(Event instance) {
		try {
			Object value_0 = ScenarioOCLFactory.getExpression(
					"EventType::INTERMEDIATE",
					ScenarioPackage.eINSTANCE.getEvent()).evaluate(instance);

			value_0 = ScenarioAbstractExpression.performCast(value_0,
					ScenarioPackage.eINSTANCE.getEventType());
			instance.setEventType((EventType) value_0);
			Object value_1 = ScenarioOCLFactory.getExpression(
					"TriggerType::MESSAGE",
					ScenarioPackage.eINSTANCE.getEvent()).evaluate(instance);

			value_1 = ScenarioAbstractExpression.performCast(value_1,
					ScenarioPackage.eINSTANCE.getTriggerType());
			instance.setTriggerType((TriggerType) value_1);
		} catch (RuntimeException e) {
			ScenarioDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public static void init_Association_4001(Association instance) {
		try {
			Object value_0 = ScenarioOCLFactory.getExpression("true",
					ScenarioPackage.eINSTANCE.getAssociation()).evaluate(
					instance);
			instance.setIsDirected(((Boolean) value_0).booleanValue());
		} catch (RuntimeException e) {
			ScenarioDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public static void init_SequenceFlow_4002(SequenceFlow instance) {
		try {
			Object value_0 = ScenarioOCLFactory.getExpression("false",
					ScenarioPackage.eINSTANCE.getSequenceFlow()).evaluate(
					instance);
			instance.setIsDefault(((Boolean) value_0).booleanValue());
		} catch (RuntimeException e) {
			ScenarioDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public static void init_SequenceFlow_4004(SequenceFlow instance) {
		try {
			Object value_0 = ScenarioOCLFactory.getExpression("true",
					ScenarioPackage.eINSTANCE.getSequenceFlow()).evaluate(
					instance);
			instance.setIsDefault(((Boolean) value_0).booleanValue());
		} catch (RuntimeException e) {
			ScenarioDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public static void init_Association_4005(Association instance) {
		try {
			Object value_0 = ScenarioOCLFactory.getExpression("false",
					ScenarioPackage.eINSTANCE.getAssociation()).evaluate(
					instance);
			instance.setIsDirected(((Boolean) value_0).booleanValue());
		} catch (RuntimeException e) {
			ScenarioDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

}
