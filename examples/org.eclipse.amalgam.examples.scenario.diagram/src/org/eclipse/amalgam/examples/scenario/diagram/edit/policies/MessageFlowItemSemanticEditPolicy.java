package org.eclipse.amalgam.examples.scenario.diagram.edit.policies;

import org.eclipse.amalgam.examples.scenario.diagram.edit.commands.Association2CreateCommand;
import org.eclipse.amalgam.examples.scenario.diagram.edit.commands.Association2ReorientCommand;
import org.eclipse.amalgam.examples.scenario.diagram.edit.commands.AssociationCreateCommand;
import org.eclipse.amalgam.examples.scenario.diagram.edit.commands.AssociationReorientCommand;
import org.eclipse.amalgam.examples.scenario.diagram.edit.commands.MessageFlowCreateCommand;
import org.eclipse.amalgam.examples.scenario.diagram.edit.commands.MessageFlowReorientCommand;
import org.eclipse.amalgam.examples.scenario.diagram.edit.commands.SequenceFlow2CreateCommand;
import org.eclipse.amalgam.examples.scenario.diagram.edit.commands.SequenceFlow2ReorientCommand;
import org.eclipse.amalgam.examples.scenario.diagram.edit.commands.SequenceFlowCreateCommand;
import org.eclipse.amalgam.examples.scenario.diagram.edit.commands.SequenceFlowReorientCommand;
import org.eclipse.amalgam.examples.scenario.diagram.edit.parts.Association2EditPart;
import org.eclipse.amalgam.examples.scenario.diagram.edit.parts.AssociationEditPart;
import org.eclipse.amalgam.examples.scenario.diagram.edit.parts.MessageFlowEditPart;
import org.eclipse.amalgam.examples.scenario.diagram.edit.parts.SequenceFlow2EditPart;
import org.eclipse.amalgam.examples.scenario.diagram.edit.parts.SequenceFlowEditPart;
import org.eclipse.amalgam.examples.scenario.diagram.providers.ScenarioElementTypes;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

/**
 * @generated
 */
public class MessageFlowItemSemanticEditPolicy extends
		ScenarioBaseItemSemanticEditPolicy {

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
		if (ScenarioElementTypes.Association_4001 == req.getElementType()) {
			return getGEFWrapper(new AssociationCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (ScenarioElementTypes.SequenceFlow_4002 == req.getElementType()) {
			return getGEFWrapper(new SequenceFlowCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (ScenarioElementTypes.MessageFlow_4003 == req.getElementType()) {
			return getGEFWrapper(new MessageFlowCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (ScenarioElementTypes.SequenceFlow_4004 == req.getElementType()) {
			return getGEFWrapper(new SequenceFlow2CreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (ScenarioElementTypes.Association_4005 == req.getElementType()) {
			return getGEFWrapper(new Association2CreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (ScenarioElementTypes.Association_4001 == req.getElementType()) {
			return getGEFWrapper(new AssociationCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (ScenarioElementTypes.SequenceFlow_4002 == req.getElementType()) {
			return getGEFWrapper(new SequenceFlowCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (ScenarioElementTypes.MessageFlow_4003 == req.getElementType()) {
			return getGEFWrapper(new MessageFlowCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (ScenarioElementTypes.SequenceFlow_4004 == req.getElementType()) {
			return getGEFWrapper(new SequenceFlow2CreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (ScenarioElementTypes.Association_4005 == req.getElementType()) {
			return getGEFWrapper(new Association2CreateCommand(req, req
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
		case AssociationEditPart.VISUAL_ID:
			return getGEFWrapper(new AssociationReorientCommand(req));
		case SequenceFlowEditPart.VISUAL_ID:
			return getGEFWrapper(new SequenceFlowReorientCommand(req));
		case MessageFlowEditPart.VISUAL_ID:
			return getGEFWrapper(new MessageFlowReorientCommand(req));
		case SequenceFlow2EditPart.VISUAL_ID:
			return getGEFWrapper(new SequenceFlow2ReorientCommand(req));
		case Association2EditPart.VISUAL_ID:
			return getGEFWrapper(new Association2ReorientCommand(req));
		}
		return super.getReorientRelationshipCommand(req);
	}

}
