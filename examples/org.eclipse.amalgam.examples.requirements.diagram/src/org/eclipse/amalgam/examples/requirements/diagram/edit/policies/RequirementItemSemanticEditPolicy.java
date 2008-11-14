package org.eclipse.amalgam.examples.requirements.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.amalgam.examples.requirements.RequirementsPackage;
import org.eclipse.amalgam.examples.requirements.diagram.edit.commands.ProcessCreateCommand;
import org.eclipse.amalgam.examples.requirements.diagram.edit.commands.RequirementChildrenCreateCommand;
import org.eclipse.amalgam.examples.requirements.diagram.edit.commands.RequirementChildrenReorientCommand;
import org.eclipse.amalgam.examples.requirements.diagram.edit.commands.RequirementDependenciesCreateCommand;
import org.eclipse.amalgam.examples.requirements.diagram.edit.commands.RequirementDependenciesReorientCommand;
import org.eclipse.amalgam.examples.requirements.diagram.edit.commands.RequirementGroupRequirementsCreateCommand;
import org.eclipse.amalgam.examples.requirements.diagram.edit.commands.RequirementGroupRequirementsReorientCommand;
import org.eclipse.amalgam.examples.requirements.diagram.edit.parts.ProcessEditPart;
import org.eclipse.amalgam.examples.requirements.diagram.edit.parts.RequirementChildrenEditPart;
import org.eclipse.amalgam.examples.requirements.diagram.edit.parts.RequirementDependenciesEditPart;
import org.eclipse.amalgam.examples.requirements.diagram.edit.parts.RequirementGroupRequirementsEditPart;
import org.eclipse.amalgam.examples.requirements.diagram.part.RequirementsVisualIDRegistry;
import org.eclipse.amalgam.examples.requirements.diagram.providers.RequirementsElementTypes;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class RequirementItemSemanticEditPolicy extends
		RequirementsBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (RequirementsElementTypes.Process_3001 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(RequirementsPackage.eINSTANCE
						.getRequirement_Scenario());
			}
			return getGEFWrapper(new ProcessCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		CompoundCommand cc = getDestroyEdgesCommand();
		addDestroyChildNodesCommand(cc);
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
	protected void addDestroyChildNodesCommand(CompoundCommand cmd) {
		View view = (View) getHost().getModel();
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation != null) {
			return;
		}
		for (Iterator it = view.getChildren().iterator(); it.hasNext();) {
			Node node = (Node) it.next();
			switch (RequirementsVisualIDRegistry.getVisualID(node)) {
			case ProcessEditPart.VISUAL_ID:
				cmd.add(getDestroyElementCommand(node));
				break;
			}
		}
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
			return null;
		}
		if (RequirementsElementTypes.RequirementChildren_4002 == req
				.getElementType()) {
			return getGEFWrapper(new RequirementChildrenCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (RequirementsElementTypes.RequirementDependencies_4003 == req
				.getElementType()) {
			return getGEFWrapper(new RequirementDependenciesCreateCommand(req,
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
			return getGEFWrapper(new RequirementGroupRequirementsCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (RequirementsElementTypes.RequirementChildren_4002 == req
				.getElementType()) {
			return getGEFWrapper(new RequirementChildrenCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (RequirementsElementTypes.RequirementDependencies_4003 == req
				.getElementType()) {
			return getGEFWrapper(new RequirementDependenciesCreateCommand(req,
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
		case RequirementChildrenEditPart.VISUAL_ID:
			return getGEFWrapper(new RequirementChildrenReorientCommand(req));
		case RequirementDependenciesEditPart.VISUAL_ID:
			return getGEFWrapper(new RequirementDependenciesReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
