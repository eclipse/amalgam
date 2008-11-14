package org.eclipse.amalgam.examples.requirements.diagram.part;

import org.eclipse.amalgam.examples.requirements.RequirementsPackage;
import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * @generated
 */
public class RequirementsDomainModelElementTester extends PropertyTester {

	/**
	 * @generated
	 */
	public boolean test(Object receiver, String method, Object[] args,
			Object expectedValue) {
		if (false == receiver instanceof EObject) {
			return false;
		}
		EObject eObject = (EObject) receiver;
		EClass eClass = eObject.eClass();
		if (eClass == RequirementsPackage.eINSTANCE.getModel()) {
			return true;
		}
		if (eClass == RequirementsPackage.eINSTANCE.getRequirement()) {
			return true;
		}
		if (eClass == RequirementsPackage.eINSTANCE.getComment()) {
			return true;
		}
		if (eClass == RequirementsPackage.eINSTANCE.getVersion()) {
			return true;
		}
		if (eClass == RequirementsPackage.eINSTANCE.getRequirementGroup()) {
			return true;
		}
		return false;
	}

}
