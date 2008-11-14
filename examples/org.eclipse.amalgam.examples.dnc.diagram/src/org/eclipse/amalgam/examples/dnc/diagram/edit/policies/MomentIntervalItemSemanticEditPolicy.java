package org.eclipse.amalgam.examples.dnc.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.amalgam.examples.dnc.diagram.edit.commands.AnnotatedElementAnnotationsCreateCommand;
import org.eclipse.amalgam.examples.dnc.diagram.edit.commands.AnnotatedElementAnnotationsReorientCommand;
import org.eclipse.amalgam.examples.dnc.diagram.edit.commands.Association2CreateCommand;
import org.eclipse.amalgam.examples.dnc.diagram.edit.commands.Association2ReorientCommand;
import org.eclipse.amalgam.examples.dnc.diagram.edit.commands.AssociationCreateCommand;
import org.eclipse.amalgam.examples.dnc.diagram.edit.commands.AssociationReorientCommand;
import org.eclipse.amalgam.examples.dnc.diagram.edit.commands.ClassSuperclassesCreateCommand;
import org.eclipse.amalgam.examples.dnc.diagram.edit.commands.ClassSuperclassesReorientCommand;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.AnnotatedElementAnnotationsEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.Association2EditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.AssociationEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.AttributeEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.ClassSuperclassesEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.MomentIntervalAttributesEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.MomentIntervalOperationsEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.OperationEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.part.DncVisualIDRegistry;
import org.eclipse.amalgam.examples.dnc.diagram.providers.DncElementTypes;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class MomentIntervalItemSemanticEditPolicy extends
		DncBaseItemSemanticEditPolicy {

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
			switch (DncVisualIDRegistry.getVisualID(node)) {
			case MomentIntervalAttributesEditPart.VISUAL_ID:
				for (Iterator cit = node.getChildren().iterator(); cit
						.hasNext();) {
					Node cnode = (Node) cit.next();
					switch (DncVisualIDRegistry.getVisualID(cnode)) {
					case AttributeEditPart.VISUAL_ID:
						cmd.add(getDestroyElementCommand(cnode));
						break;
					}
				}
				break;
			case MomentIntervalOperationsEditPart.VISUAL_ID:
				for (Iterator cit = node.getChildren().iterator(); cit
						.hasNext();) {
					Node cnode = (Node) cit.next();
					switch (DncVisualIDRegistry.getVisualID(cnode)) {
					case OperationEditPart.VISUAL_ID:
						cmd.add(getDestroyElementCommand(cnode));
						break;
					}
				}
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
		if (DncElementTypes.Association_4001 == req.getElementType()) {
			return getGEFWrapper(new AssociationCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (DncElementTypes.ClassSuperclasses_4002 == req.getElementType()) {
			return getGEFWrapper(new ClassSuperclassesCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (DncElementTypes.Association_4003 == req.getElementType()) {
			return getGEFWrapper(new Association2CreateCommand(req, req
					.getSource(), req.getTarget()));
		}
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
		if (DncElementTypes.Association_4001 == req.getElementType()) {
			return getGEFWrapper(new AssociationCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (DncElementTypes.ClassSuperclasses_4002 == req.getElementType()) {
			return getGEFWrapper(new ClassSuperclassesCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (DncElementTypes.Association_4003 == req.getElementType()) {
			return getGEFWrapper(new Association2CreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (DncElementTypes.AnnotatedElementAnnotations_4004 == req
				.getElementType()) {
			return null;
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
		case Association2EditPart.VISUAL_ID:
			return getGEFWrapper(new Association2ReorientCommand(req));
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
		case ClassSuperclassesEditPart.VISUAL_ID:
			return getGEFWrapper(new ClassSuperclassesReorientCommand(req));
		case AnnotatedElementAnnotationsEditPart.VISUAL_ID:
			return getGEFWrapper(new AnnotatedElementAnnotationsReorientCommand(
					req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
