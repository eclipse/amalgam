package org.eclipse.amalgam.examples.scenario.diagram.edit.commands;

import org.eclipse.amalgam.examples.scenario.Event;
import org.eclipse.amalgam.examples.scenario.Process;
import org.eclipse.amalgam.examples.scenario.ScenarioFactory;
import org.eclipse.amalgam.examples.scenario.ScenarioPackage;
import org.eclipse.amalgam.examples.scenario.diagram.providers.ScenarioElementTypes;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.emf.type.core.commands.CreateElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class Event2CreateCommand extends CreateElementCommand {

	/**
	 * @generated
	 */
	public Event2CreateCommand(CreateElementRequest req) {
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
		return ScenarioPackage.eINSTANCE.getProcess();
	}

	/**
	 * @generated
	 */
	protected EObject doDefaultElementCreation() {
		Event newElement = ScenarioFactory.eINSTANCE.createEvent();

		Process owner = (Process) getElementToEdit();
		owner.getElements().add(newElement);

		ScenarioElementTypes.init_Event_2005(newElement);
		return newElement;
	}

}
