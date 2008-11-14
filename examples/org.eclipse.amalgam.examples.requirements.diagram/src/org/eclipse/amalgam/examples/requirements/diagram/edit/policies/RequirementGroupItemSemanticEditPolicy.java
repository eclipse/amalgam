package org.eclipse.amalgam.examples.requirements.diagram.edit.policies;

import org.eclipse.amalgam.examples.requirements.diagram.edit.commands.RequirementGroupChildrenCreateCommand;
import org.eclipse.amalgam.examples.requirements.diagram.edit.commands.RequirementGroupChildrenReorientCommand;
import org.eclipse.amalgam.examples.requirements.diagram.edit.commands.RequirementGroupRequirementsCreateCommand;
import org.eclipse.amalgam.examples.requirements.diagram.edit.commands.RequirementGroupRequirementsReorientCommand;
import org.eclipse.amalgam.examples.requirements.diagram.edit.parts.RequirementGroupChildrenEditPart;
import org.eclipse.amalgam.examples.requirements.diagram.edit.parts.RequirementGroupRequirementsEditPart;
import org.eclipse.amalgam.examples.requirements.diagram.providers.RequirementsElementTypes;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class RequirementGroupItemSemanticEditPolicy extends
		RequirementsBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		CompoundCommand cc = getDestroyEdgesCommand();
		addDestroyShortcutsCommand(cc);
		View view = (View) getHost().getModel();
		if (view.getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
			req.setElementToDestroy(view);
		}
		cc.add(getGEFWrapper(new DestroyElementCommand(req)));
		return cc.unwrap();
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super
				.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (RequirementsElementTypes.RequirementGroupRequirements_4001 == req
				.getElementType()) {
			return getGEFWrapper(new RequirementGroupRequirementsCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (RequirementsElementTypes.RequirementGroupChildren_4004 == req
				.getElementType()) {
			return getGEFWrapper(new RequirementGroupChildrenCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (RequirementsElementTypes.RequirementGroupRequirements_4001 == req
				.getElementType()) {
			return null;
		}
		if (RequirementsElementTypes.RequirementGroupChildren_4004 == req
				.getElementType()) {
			return getGEFWrapper(new RequirementGroupChildrenCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * Returns command to reorient EReference based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(
			ReorientReferenceRelationshipRequest req) {
		switch (getVisualID(req)) {
		case RequirementGroupRequirementsEditPart.VISUAL_ID:
			return getGEFWrapper(new RequirementGroupRequirementsReorientCommand(
					req));
		case RequirementGroupChildrenEditPart.VISUAL_ID:
			return getGEFWrapper(new RequirementGroupChildrenReorientCommand(
					req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
