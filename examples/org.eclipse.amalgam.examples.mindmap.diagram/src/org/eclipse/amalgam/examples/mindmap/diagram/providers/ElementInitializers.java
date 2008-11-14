package org.eclipse.amalgam.examples.mindmap.diagram.providers;

import org.eclipse.amalgam.examples.mindmap.MindmapPackage;
import org.eclipse.amalgam.examples.mindmap.Relationship;
import org.eclipse.amalgam.examples.mindmap.Type;
import org.eclipse.amalgam.examples.mindmap.diagram.expressions.MindmapAbstractExpression;
import org.eclipse.amalgam.examples.mindmap.diagram.expressions.MindmapOCLFactory;
import org.eclipse.amalgam.examples.mindmap.diagram.part.MindmapDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	/**
	 * @generated
	 */
	public static void init_Relationship_4002(Relationship instance) {
		try {
			Object value_0 = MindmapOCLFactory.getExpression(
					"Type::DEPENDENCY",
					MindmapPackage.eINSTANCE.getRelationship()).evaluate(
					instance);

			value_0 = MindmapAbstractExpression.performCast(value_0,
					MindmapPackage.eINSTANCE.getType());
			instance.setType((Type) value_0);
		} catch (RuntimeException e) {
			MindmapDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public static void init_Relationship_4003(Relationship instance) {
		try {
			Object value_0 = MindmapOCLFactory.getExpression("Type::INCLUDE",
					MindmapPackage.eINSTANCE.getRelationship()).evaluate(
					instance);

			value_0 = MindmapAbstractExpression.performCast(value_0,
					MindmapPackage.eINSTANCE.getType());
			instance.setType((Type) value_0);
		} catch (RuntimeException e) {
			MindmapDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public static void init_Relationship_4004(Relationship instance) {
		try {
			Object value_0 = MindmapOCLFactory.getExpression("Type::EXTEND",
					MindmapPackage.eINSTANCE.getRelationship()).evaluate(
					instance);

			value_0 = MindmapAbstractExpression.performCast(value_0,
					MindmapPackage.eINSTANCE.getType());
			instance.setType((Type) value_0);
		} catch (RuntimeException e) {
			MindmapDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

}
