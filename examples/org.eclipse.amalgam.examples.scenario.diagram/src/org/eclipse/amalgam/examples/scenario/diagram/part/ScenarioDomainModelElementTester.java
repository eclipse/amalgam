package org.eclipse.amalgam.examples.scenario.diagram.part;

import org.eclipse.amalgam.examples.scenario.ScenarioPackage;
import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * @generated
 */
public class ScenarioDomainModelElementTester extends PropertyTester {

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
		if (eClass == ScenarioPackage.eINSTANCE.getProcess()) {
			return true;
		}
		if (eClass == ScenarioPackage.eINSTANCE.getElement()) {
			return true;
		}
		if (eClass == ScenarioPackage.eINSTANCE.getEvent()) {
			return true;
		}
		if (eClass == ScenarioPackage.eINSTANCE.getTask()) {
			return true;
		}
		if (eClass == ScenarioPackage.eINSTANCE.getGateway()) {
			return true;
		}
		if (eClass == ScenarioPackage.eINSTANCE.getConnection()) {
			return true;
		}
		if (eClass == ScenarioPackage.eINSTANCE.getSequenceFlow()) {
			return true;
		}
		if (eClass == ScenarioPackage.eINSTANCE.getArtifact()) {
			return true;
		}
		if (eClass == ScenarioPackage.eINSTANCE.getDataObject()) {
			return true;
		}
		if (eClass == ScenarioPackage.eINSTANCE.getMessageFlow()) {
			return true;
		}
		if (eClass == ScenarioPackage.eINSTANCE.getAssociation()) {
			return true;
		}
		return false;
	}

}
