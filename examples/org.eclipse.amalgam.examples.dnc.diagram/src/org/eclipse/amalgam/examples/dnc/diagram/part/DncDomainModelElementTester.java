package org.eclipse.amalgam.examples.dnc.diagram.part;

import org.eclipse.amalgam.examples.dnc.DncPackage;
import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * @generated
 */
public class DncDomainModelElementTester extends PropertyTester {

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
		if (eClass == DncPackage.eINSTANCE.getArchetype()) {
			return true;
		}
		if (eClass == DncPackage.eINSTANCE.getAssociation()) {
			return true;
		}
		if (eClass == DncPackage.eINSTANCE.getMomentInterval()) {
			return true;
		}
		if (eClass == DncPackage.eINSTANCE.getMIDetail()) {
			return true;
		}
		if (eClass == DncPackage.eINSTANCE.getRole()) {
			return true;
		}
		if (eClass == DncPackage.eINSTANCE.getDescription()) {
			return true;
		}
		if (eClass == DncPackage.eINSTANCE.getParty()) {
			return true;
		}
		if (eClass == DncPackage.eINSTANCE.getPlace()) {
			return true;
		}
		if (eClass == DncPackage.eINSTANCE.getThing()) {
			return true;
		}
		if (eClass == DncPackage.eINSTANCE.getPluginPoint()) {
			return true;
		}
		return false;
	}

}
