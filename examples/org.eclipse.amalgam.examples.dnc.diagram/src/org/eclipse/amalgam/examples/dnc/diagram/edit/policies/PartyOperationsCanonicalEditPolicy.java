package org.eclipse.amalgam.examples.dnc.diagram.edit.policies;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.OperationEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.part.DncDiagramUpdater;
import org.eclipse.amalgam.examples.dnc.diagram.part.DncNodeDescriptor;
import org.eclipse.amalgam.examples.dnc.diagram.part.DncVisualIDRegistry;
import org.eclipse.amalgam.examples.oocore.OocorePackage;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class PartyOperationsCanonicalEditPolicy extends CanonicalEditPolicy {

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
		for (Iterator it = DncDiagramUpdater
				.getPartyOperations_7008SemanticChildren(viewObject).iterator(); it
				.hasNext();) {
			result.add(((DncNodeDescriptor) it.next()).getModelElement());
		}
		return result;
	}

	/**
	 * @generated
	 */
	protected boolean isOrphaned(Collection semanticChildren, final View view) {
		int visualID = DncVisualIDRegistry.getVisualID(view);
		switch (visualID) {
		case OperationEditPart.VISUAL_ID:
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
			myFeaturesToSynchronize.add(OocorePackage.eINSTANCE
					.getClass_Operations());
		}
		return myFeaturesToSynchronize;
	}

}
