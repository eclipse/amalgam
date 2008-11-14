package org.eclipse.amalgam.examples.requirements.diagram.providers;

import org.eclipse.amalgam.examples.requirements.Requirement;
import org.eclipse.amalgam.examples.requirements.RequirementsFactory;
import org.eclipse.amalgam.examples.requirements.RequirementsPackage;
import org.eclipse.amalgam.examples.requirements.Version;
import org.eclipse.amalgam.examples.requirements.diagram.expressions.RequirementsAbstractExpression;
import org.eclipse.amalgam.examples.requirements.diagram.expressions.RequirementsOCLFactory;
import org.eclipse.amalgam.examples.requirements.diagram.part.RequirementsDiagramEditorPlugin;
import org.eclipse.emf.ecore.EcorePackage;

/**
 * @generated
 */
public class ElementInitializers {
	/**
	 * @generated
	 */
	public static void init_Requirement_2002(Requirement instance) {
		try {
			Version newInstance_0_0 = RequirementsFactory.eINSTANCE
					.createVersion();

			instance.setVersion(newInstance_0_0);
			Object value_0_0_0 = RequirementsOCLFactory.getExpression("1",
					RequirementsPackage.eINSTANCE.getVersion()).evaluate(
					newInstance_0_0);

			value_0_0_0 = RequirementsAbstractExpression.performCast(
					value_0_0_0, EcorePackage.eINSTANCE.getEInt());
			newInstance_0_0.setMajor(((Integer) value_0_0_0).intValue());

		} catch (RuntimeException e) {
			RequirementsDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

}
