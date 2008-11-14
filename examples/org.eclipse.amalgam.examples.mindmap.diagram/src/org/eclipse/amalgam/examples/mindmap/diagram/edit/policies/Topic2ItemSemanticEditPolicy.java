package org.eclipse.amalgam.examples.mindmap.diagram.edit.policies;

import org.eclipse.amalgam.examples.mindmap.diagram.edit.commands.Relationship2CreateCommand;
import org.eclipse.amalgam.examples.mindmap.diagram.edit.commands.Relationship2ReorientCommand;
import org.eclipse.amalgam.examples.mindmap.diagram.edit.commands.Relationship3CreateCommand;
import org.eclipse.amalgam.examples.mindmap.diagram.edit.commands.Relationship3ReorientCommand;
import org.eclipse.amalgam.examples.mindmap.diagram.edit.commands.RelationshipCreateCommand;
import org.eclipse.amalgam.examples.mindmap.diagram.edit.commands.RelationshipReorientCommand;
import org.eclipse.amalgam.examples.mindmap.diagram.edit.commands.TopicSubtopicsCreateCommand;
import org.eclipse.amalgam.examples.mindmap.diagram.edit.commands.TopicSubtopicsReorientCommand;
import org.eclipse.amalgam.examples.mindmap.diagram.edit.parts.Relationship2EditPart;
import org.eclipse.amalgam.examples.mindmap.diagram.edit.parts.Relationship3EditPart;
import org.eclipse.amalgam.examples.mindmap.diagram.edit.parts.RelationshipEditPart;
import org.eclipse.amalgam.examples.mindmap.diagram.edit.parts.TopicSubtopicsEditPart;
import org.eclipse.amalgam.examples.mindmap.diagram.providers.MindmapElementTypes;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class Topic2ItemSemanticEditPolicy extends
		MindmapBaseItemSemanticEditPolicy {

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
		if (MindmapElementTypes.TopicSubtopics_4001 == req.getElementType()) {
			return getGEFWrapper(new TopicSubtopicsCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (MindmapElementTypes.Relationship_4002 == req.getElementType()) {
			return getGEFWrapper(new RelationshipCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (MindmapElementTypes.Relationship_4003 == req.getElementType()) {
			return getGEFWrapper(new Relationship2CreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (MindmapElementTypes.Relationship_4004 == req.getElementType()) {
			return getGEFWrapper(new Relationship3CreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (MindmapElementTypes.TopicSubtopics_4001 == req.getElementType()) {
			return getGEFWrapper(new TopicSubtopicsCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (MindmapElementTypes.Relationship_4002 == req.getElementType()) {
			return getGEFWrapper(new RelationshipCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (MindmapElementTypes.Relationship_4003 == req.getElementType()) {
			return getGEFWrapper(new Relationship2CreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (MindmapElementTypes.Relationship_4004 == req.getElementType()) {
			return getGEFWrapper(new Relationship3CreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * Returns command to reorient EClass based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(
			ReorientRelationshipRequest req) {
		switch (getVisualID(req)) {
		case RelationshipEditPart.VISUAL_ID:
			return getGEFWrapper(new RelationshipReorientCommand(req));
		case Relationship2EditPart.VISUAL_ID:
			return getGEFWrapper(new Relationship2ReorientCommand(req));
		case Relationship3EditPart.VISUAL_ID:
			return getGEFWrapper(new Relationship3ReorientCommand(req));
		}
		return super.getReorientRelationshipCommand(req);
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
		case TopicSubtopicsEditPart.VISUAL_ID:
			return getGEFWrapper(new TopicSubtopicsReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
