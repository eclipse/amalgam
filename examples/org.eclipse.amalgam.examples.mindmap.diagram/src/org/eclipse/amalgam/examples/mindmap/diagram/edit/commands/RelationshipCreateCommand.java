package org.eclipse.amalgam.examples.mindmap.diagram.edit.commands;

import org.eclipse.amalgam.examples.mindmap.Map;
import org.eclipse.amalgam.examples.mindmap.MindmapFactory;
import org.eclipse.amalgam.examples.mindmap.MindmapPackage;
import org.eclipse.amalgam.examples.mindmap.Relationship;
import org.eclipse.amalgam.examples.mindmap.Topic;
import org.eclipse.amalgam.examples.mindmap.diagram.edit.policies.MindmapBaseItemSemanticEditPolicy;
import org.eclipse.amalgam.examples.mindmap.diagram.providers.MindmapElementTypes;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.CreateElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;

/**
 * @generated
 */
public class RelationshipCreateCommand extends CreateElementCommand {

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
	private Map container;

	/**
	 * @generated
	 */
	public RelationshipCreateCommand(CreateRelationshipRequest request,
			EObject source, EObject target) {
		super(request);
		this.source = source;
		this.target = target;
		if (request.getContainmentFeature() == null) {
			setContainmentFeature(MindmapPackage.eINSTANCE.getMap_Elements());
		}

		// Find container element for the new link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null; element = element
				.eContainer()) {
			if (element instanceof Map) {
				container = (Map) element;
				super.setElementToEdit(container);
				break;
			}
		}
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (source == null && target == null) {
			return false;
		}
		if (source != null && false == source instanceof Topic) {
			return false;
		}
		if (target != null && false == target instanceof Topic) {
			return false;
		}
		if (getSource() == null) {
			return true; // link creation is in progress; source is not defined yet
		}
		// target may be null here but it's possible to check constraint
		if (getContainer() == null) {
			return false;
		}
		return MindmapBaseItemSemanticEditPolicy.LinkConstraints
				.canCreateRelationship_4002(getContainer(), getSource(),
						getTarget());
	}

	/**
	 * @generated
	 */
	protected EObject doDefaultElementCreation() {
		Relationship newElement = MindmapFactory.eINSTANCE.createRelationship();
		getContainer().getElements().add(newElement);
		newElement.setSource(getSource());
		newElement.setTarget(getTarget());
		MindmapElementTypes.init_Relationship_4002(newElement);
		return newElement;
	}

	/**
	 * @generated
	 */
	protected EClass getEClassToEdit() {
		return MindmapPackage.eINSTANCE.getMap();
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
		return super.doExecuteWithResult(monitor, info);
	}

	/**
	 * @generated
	 */
	protected ConfigureRequest createConfigureRequest() {
		ConfigureRequest request = super.createConfigureRequest();
		request.setParameter(CreateRelationshipRequest.SOURCE, getSource());
		request.setParameter(CreateRelationshipRequest.TARGET, getTarget());
		return request;
	}

	/**
	 * @generated
	 */
	protected void setElementToEdit(EObject element) {
		throw new UnsupportedOperationException();
	}

	/**
	 * @generated
	 */
	protected Topic getSource() {
		return (Topic) source;
	}

	/**
	 * @generated
	 */
	protected Topic getTarget() {
		return (Topic) target;
	}

	/**
	 * @generated
	 */
	public Map getContainer() {
		return container;
	}
}
