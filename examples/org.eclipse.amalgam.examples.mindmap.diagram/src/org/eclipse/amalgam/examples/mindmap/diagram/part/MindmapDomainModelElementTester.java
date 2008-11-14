package org.eclipse.amalgam.examples.mindmap.diagram.part;

import org.eclipse.amalgam.examples.mindmap.MindmapPackage;
import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * @generated
 */
public class MindmapDomainModelElementTester extends PropertyTester {

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
		if (eClass == MindmapPackage.eINSTANCE.getMap()) {
			return true;
		}
		if (eClass == MindmapPackage.eINSTANCE.getMapElement()) {
			return true;
		}
		if (eClass == MindmapPackage.eINSTANCE.getTopic()) {
			return true;
		}
		if (eClass == MindmapPackage.eINSTANCE.getRelationship()) {
			return true;
		}
		return false;
	}

}
