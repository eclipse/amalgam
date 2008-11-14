package org.eclipse.amalgam.examples.dnc.diagram.edit.commands;

import org.eclipse.amalgam.examples.dnc.diagram.edit.policies.DncBaseItemSemanticEditPolicy;
import org.eclipse.amalgam.examples.oocore.AnnotatedElement;
import org.eclipse.amalgam.examples.oocore.Annotation;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

/**
 * @generated
 */
public class AnnotatedElementAnnotationsReorientCommand extends
		EditElementCommand {

	/**
	 * @generated
	 */
	private final int reorientDirection;

	/**
	 * @generated
	 */
	private final EObject referenceOwner;

	/**
	 * @generated
	 */
	private final EObject oldEnd;

	/**
	 * @generated
	 */
	private final EObject newEnd;

	/**
	 * @generated
	 */
	public AnnotatedElementAnnotationsReorientCommand(
			ReorientReferenceRelationshipRequest request) {
		super(request.getLabel(), null, request);
		reorientDirection = request.getDirection();
		referenceOwner = request.getReferenceOwner();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == referenceOwner instanceof AnnotatedElement) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof Annotation && newEnd instanceof AnnotatedElement)) {
			return false;
		}
		return DncBaseItemSemanticEditPolicy.LinkConstraints
				.canExistAnnotatedElementAnnotations_4004(getNewSource(),
						getOldTarget());
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof Annotation && newEnd instanceof Annotation)) {
			return false;
		}
		return DncBaseItemSemanticEditPolicy.LinkConstraints
				.canExistAnnotatedElementAnnotations_4004(getOldSource(),
						getNewTarget());
	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException(
					"Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientSource() throws ExecutionException {
		getOldSource().getAnnotations().remove(getOldTarget());
		getNewSource().getAnnotations().add(getOldTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getOldSource().getAnnotations().remove(getOldTarget());
		getOldSource().getAnnotations().add(getNewTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	 * @generated
	 */
	protected AnnotatedElement getOldSource() {
		return (AnnotatedElement) referenceOwner;
	}

	/**
	 * @generated
	 */
	protected AnnotatedElement getNewSource() {
		return (AnnotatedElement) newEnd;
	}

	/**
	 * @generated
	 */
	protected Annotation getOldTarget() {
		return (Annotation) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Annotation getNewTarget() {
		return (Annotation) newEnd;
	}
}
