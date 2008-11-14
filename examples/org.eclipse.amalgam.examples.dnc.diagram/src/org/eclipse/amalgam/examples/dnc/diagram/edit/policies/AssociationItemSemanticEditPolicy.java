package org.eclipse.amalgam.examples.dnc.diagram.edit.policies;

import org.eclipse.amalgam.examples.dnc.diagram.edit.commands.AnnotatedElementAnnotationsCreateCommand;
import org.eclipse.amalgam.examples.dnc.diagram.edit.commands.AnnotatedElementAnnotationsReorientCommand;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.AnnotatedElementAnnotationsEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.providers.DncElementTypes;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;

/**
 * @generated
 */
public class AssociationItemSemanticEditPolicy extends
		DncBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
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
		if (DncElementTypes.AnnotatedElementAnnotations_4004 == req
				.getElementType()) {
			return getGEFWrapper(new AnnotatedElementAnnotationsCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (DncElementTypes.AnnotatedElementAnnotations_4004 == req
				.getElementType()) {
			return null;
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
		case AnnotatedElementAnnotationsEditPart.VISUAL_ID:
			return getGEFWrapper(new AnnotatedElementAnnotationsReorientCommand(
					req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
