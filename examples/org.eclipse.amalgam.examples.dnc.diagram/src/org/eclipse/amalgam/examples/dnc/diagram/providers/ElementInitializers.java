package org.eclipse.amalgam.examples.dnc.diagram.providers;

import org.eclipse.amalgam.examples.dnc.Association;
import org.eclipse.amalgam.examples.dnc.DncPackage;
import org.eclipse.amalgam.examples.dnc.PluginPoint;
import org.eclipse.amalgam.examples.dnc.diagram.expressions.DncAbstractExpression;
import org.eclipse.amalgam.examples.dnc.diagram.expressions.DncOCLFactory;
import org.eclipse.amalgam.examples.dnc.diagram.part.DncDiagramEditorPlugin;
import org.eclipse.amalgam.examples.oocore.Class;
import org.eclipse.amalgam.examples.oocore.OocorePackage;
import org.eclipse.amalgam.examples.oocore.Reference;
import org.eclipse.emf.ecore.EcorePackage;

/**
 * @generated
 */
public class ElementInitializers {
	/**
	 * @generated
	 */
	public static void init_PluginPoint_2008(PluginPoint instance) {
		try {
			Object value_0 = DncOCLFactory.getExpression("true",
					DncPackage.eINSTANCE.getPluginPoint()).evaluate(instance);
			instance.setInterface(((Boolean) value_0).booleanValue());
			Object value_1 = DncOCLFactory.getExpression("true",
					DncPackage.eINSTANCE.getPluginPoint()).evaluate(instance);
			instance.setAbstract(((Boolean) value_1).booleanValue());
		} catch (RuntimeException e) {
			DncDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public static void init_Association_4001(Association instance) {
		try {
			Object value_0 = DncOCLFactory.getExpression("false",
					DncPackage.eINSTANCE.getAssociation()).evaluate(instance);
			instance.setAggregation(((Boolean) value_0).booleanValue());
			Object value_1 = opposite_Association_4001(instance);
			instance.setOpposite((Reference) value_1);
			Object value_2 = DncOCLFactory.getExpression("true",
					DncPackage.eINSTANCE.getAssociation()).evaluate(instance);
			instance.setBidirectional(((Boolean) value_2).booleanValue());
			Object value_3 = DncOCLFactory.getExpression(
					"self.opposite.owner.name.toLower()",
					DncPackage.eINSTANCE.getAssociation()).evaluate(instance);
			instance.setName((String) value_3);
		} catch (RuntimeException e) {
			DncDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public static void init_Association_4003(Association instance) {
		try {
			Object value_0 = DncOCLFactory.getExpression("true",
					DncPackage.eINSTANCE.getAssociation()).evaluate(instance);
			instance.setAggregation(((Boolean) value_0).booleanValue());
			Object value_1 = DncOCLFactory.getExpression("-1",
					DncPackage.eINSTANCE.getAssociation()).evaluate(instance);

			value_1 = DncAbstractExpression.performCast(value_1,
					EcorePackage.eINSTANCE.getEInt());
			instance.setUpperBound(((Integer) value_1).intValue());
			Object value_2 = opposite_Association_4003(instance);
			instance.setOpposite((Reference) value_2);
			Object value_3 = DncOCLFactory.getExpression("true",
					DncPackage.eINSTANCE.getAssociation()).evaluate(instance);
			instance.setBidirectional(((Boolean) value_3).booleanValue());
			Object value_4 = DncOCLFactory.getExpression(
					"self.opposite.owner.name.toLower()",
					DncPackage.eINSTANCE.getAssociation()).evaluate(instance);
			instance.setName((String) value_4);
		} catch (RuntimeException e) {
			DncDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	private static Reference opposite_Association_4001(Association self) {
		Reference opposite = OocorePackage.eINSTANCE.getOocoreFactory()
				.createReference();
		opposite.setOpposite(self);
		opposite.setBidirectional(true);
		opposite.setType(self.getOwner());
		opposite.setName(self.getOwner().getName().toLowerCase());
		((Class) self.getType()).getFeatures().add(opposite);
		return opposite;
	}

	/**
	 * @generated
	 */
	private static Reference opposite_Association_4003(Association self) {
		Reference opposite = OocorePackage.eINSTANCE.getOocoreFactory()
				.createReference();
		opposite.setOpposite(self);
		opposite.setBidirectional(true);
		opposite.setType(self.getOwner());
		opposite.setName(self.getOwner().getName().toLowerCase());
		((Class) self.getType()).getFeatures().add(opposite);
		return opposite;
	}

}
