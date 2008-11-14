package org.eclipse.amalgam.examples.scenario.diagram.custom.providers;

import org.eclipse.amalgam.examples.scenario.diagram.custom.edit.parts.IntermediateEventImageEditPart;
import org.eclipse.amalgam.examples.scenario.diagram.custom.edit.policies.OpenHyperlinkEditPolicy;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.services.editpolicy.CreateEditPoliciesOperation;
import org.eclipse.gmf.runtime.diagram.ui.services.editpolicy.IEditPolicyProvider;

public class ScenarioEditPolicyProvider extends AbstractProvider implements IEditPolicyProvider {

	public void createEditPolicies(EditPart editPart) {
		if (editPart instanceof IntermediateEventImageEditPart) {
			editPart.installEditPolicy(EditPolicyRoles.OPEN_ROLE, new OpenHyperlinkEditPolicy());
		}
	}

	public boolean provides(IOperation operation) {
		if (operation instanceof CreateEditPoliciesOperation) {
			CreateEditPoliciesOperation op = (CreateEditPoliciesOperation) operation;
			if (op.getEditPart() instanceof IntermediateEventImageEditPart) {
				return true;
			}
		}
		return false;
	}
}
