package org.eclipse.amalgam.examples.requirements.diagram.edit.policies;

import org.eclipse.amalgam.examples.requirements.RequirementsPackage;
import org.eclipse.amalgam.examples.requirements.diagram.edit.commands.RequirementCreateCommand;
import org.eclipse.amalgam.examples.requirements.diagram.edit.commands.RequirementGroup2CreateCommand;
import org.eclipse.amalgam.examples.requirements.diagram.edit.commands.RequirementGroupCreateCommand;
import org.eclipse.amalgam.examples.requirements.diagram.providers.RequirementsElementTypes;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

/**
 * @generated
 */
public class ModelItemSemanticEditPolicy extends
		RequirementsBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (RequirementsElementTypes.RequirementGroup_2001 == req
				.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(RequirementsPackage.eINSTANCE
						.getModel_Groups());
			}
			return getGEFWrapper(new RequirementGroupCreateCommand(req));
		}
		if (RequirementsElementTypes.Requirement_2002 == req.getElementType()) {
			return getGEFWrapper(new RequirementCreateCommand(req));
		}
		if (RequirementsElementTypes.RequirementGroup_2003 == req
				.getElementType()) {
			return getGEFWrapper(new RequirementGroup2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
				.getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends
			DuplicateEObjectsCommand {

		/**
		 * @generated
		 */
		public DuplicateAnythingCommand(
				TransactionalEditingDomain editingDomain,
				DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req
					.getElementsToBeDuplicated(), req
					.getAllDuplicatedElementsMap());
		}

	}

}
