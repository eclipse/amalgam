package org.eclipse.amalgam.examples.scenario.diagram.edit.commands;

import org.eclipse.amalgam.examples.scenario.Event;
import org.eclipse.amalgam.examples.scenario.ScenarioFactory;
import org.eclipse.amalgam.examples.scenario.ScenarioPackage;
import org.eclipse.amalgam.examples.scenario.Task;
import org.eclipse.amalgam.examples.scenario.diagram.providers.ScenarioElementTypes;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.emf.type.core.commands.CreateElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class Event7CreateCommand extends CreateElementCommand {

	/**
	 * @generated
	 */
	public Event7CreateCommand(CreateElementRequest req) {
		super(req);
	}

	/**
	 * @generated
	 */
	protected EObject getElementToEdit() {
		EObject container = ((CreateElementRequest) getRequest())
				.getContainer();
		if (container instanceof View) {
			container = ((View) container).getElement();
		}
		return container;
	}

	/**
	 * @generated
	 */
	protected EClass getEClassToEdit() {
		return ScenarioPackage.eINSTANCE.getTask();
	}

	/**
	 * @generated
	 */
	protected EObject doDefaultElementCreation() {
		Event newElement = ScenarioFactory.eINSTANCE.createEvent();

		Task owner = (Task) getElementToEdit();
		owner.getEvents().add(newElement);

		ScenarioElementTypes.init_Event_3001(newElement);
		return newElement;
	}

}
