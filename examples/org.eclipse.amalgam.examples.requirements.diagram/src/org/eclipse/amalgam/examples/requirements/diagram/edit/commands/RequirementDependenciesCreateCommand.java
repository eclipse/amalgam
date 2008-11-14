package org.eclipse.amalgam.examples.requirements.diagram.edit.commands;

import org.eclipse.amalgam.examples.requirements.Requirement;
import org.eclipse.amalgam.examples.requirements.diagram.edit.policies.RequirementsBaseItemSemanticEditPolicy;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;

/**
 * @generated
 */
public class RequirementDependenciesCreateCommand extends EditElementCommand {

	/**
	 * @generated
	 */
	private final EObject source;

	/**
	 * @generated
	 */
	private final EObject target;

	/**
	 * @generated
	 */
	public RequirementDependenciesCreateCommand(
			CreateRelationshipRequest request, EObject source, EObject target) {
		super(request.getLabel(), null, request);
		this.source = source;
		this.target = target;
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (source == null && target == null) {
			return false;
		}
		if (source != null && false == source instanceof Requirement) {
			return false;
		}
		if (target != null && false == target instanceof Requirement) {
			return false;
		}
		if (getSource() == null) {
			return true; // link creation is in progress; source is not defined yet
		}
		// target may be null here but it's possible to check constraint
		return RequirementsBaseItemSemanticEditPolicy.LinkConstraints
				.canCreateRequirementDependencies_4003(getSource(), getTarget());
	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException(
					"Invalid arguments in create link command"); //$NON-NLS-1$
		}
		if (getSource() != null && getTarget() != null) {
			getSource().getDependencies().add(getTarget());
		}
		return CommandResult.newOKCommandResult();
	}

	/**
	 * @generated
	 */
	protected Requirement getSource() {
		return (Requirement) source;
	}

	/**
	 * @generated
	 */
	protected Requirement getTarget() {
		return (Requirement) target;
	}
}