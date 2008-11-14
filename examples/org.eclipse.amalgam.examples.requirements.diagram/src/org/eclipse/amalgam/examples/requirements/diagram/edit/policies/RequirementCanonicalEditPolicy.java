package org.eclipse.amalgam.examples.requirements.diagram.edit.policies;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import java.util.Set;

import org.eclipse.amalgam.examples.requirements.RequirementsPackage;
import org.eclipse.amalgam.examples.requirements.diagram.edit.parts.ProcessEditPart;
import org.eclipse.amalgam.examples.requirements.diagram.part.RequirementsDiagramUpdater;
import org.eclipse.amalgam.examples.requirements.diagram.part.RequirementsNodeDescriptor;
import org.eclipse.amalgam.examples.requirements.diagram.part.RequirementsVisualIDRegistry;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class RequirementCanonicalEditPolicy extends CanonicalEditPolicy {

	/**
	 * @generated
	 */
	Set myFeaturesToSynchronize;

	/**
	 * @generated
	 */
	protected List getSemanticChildrenList() {
		View viewObject = (View) getHost().getModel();
		List result = new LinkedList();
		for (Iterator it = RequirementsDiagramUpdater
				.getRequirement_2002SemanticChildren(viewObject).iterator(); it
				.hasNext();) {
			result.add(((RequirementsNodeDescriptor) it.next())
					.getModelElement());
		}
		return result;
	}

	/**
	 * @generated
	 */
	protected boolean isOrphaned(Collection semanticChildren, final View view) {
		int visualID = RequirementsVisualIDRegistry.getVisualID(view);
		switch (visualID) {
		case ProcessEditPart.VISUAL_ID:
			if (!semanticChildren.contains(view.getElement())) {
				return true;
			}
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected String getDefaultFactoryHint() {
		return null;
	}

	/**
	 * @generated
	 */
	protected Set getFeaturesToSynchronize() {
		if (myFeaturesToSynchronize == null) {
			myFeaturesToSynchronize = new HashSet();
			myFeaturesToSynchronize.add(RequirementsPackage.eINSTANCE
					.getRequirement_Scenario());
		}
		return myFeaturesToSynchronize;
	}

}
