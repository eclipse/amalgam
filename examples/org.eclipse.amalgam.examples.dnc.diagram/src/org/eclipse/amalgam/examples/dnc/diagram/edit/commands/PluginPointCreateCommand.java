package org.eclipse.amalgam.examples.dnc.diagram.edit.commands;

import org.eclipse.amalgam.examples.dnc.DncFactory;
import org.eclipse.amalgam.examples.dnc.PluginPoint;
import org.eclipse.amalgam.examples.dnc.diagram.providers.DncElementTypes;
import org.eclipse.amalgam.examples.oocore.OocorePackage;
import org.eclipse.amalgam.examples.oocore.Package;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.emf.type.core.commands.CreateElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class PluginPointCreateCommand extends CreateElementCommand {

	/**
	 * @generated
	 */
	public PluginPointCreateCommand(CreateElementRequest req) {
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
		return OocorePackage.eINSTANCE.getPackage();
	}

	/**
	 * @generated
	 */
	protected EObject doDefaultElementCreation() {
		PluginPoint newElement = DncFactory.eINSTANCE.createPluginPoint();

		Package owner = (Package) getElementToEdit();
		owner.getContents().add(newElement);

		DncElementTypes.init_PluginPoint_2008(newElement);
		return newElement;
	}

}
