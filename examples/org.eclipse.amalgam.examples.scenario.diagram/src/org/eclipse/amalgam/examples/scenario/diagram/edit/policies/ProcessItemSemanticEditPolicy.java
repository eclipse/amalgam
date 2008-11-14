package org.eclipse.amalgam.examples.scenario.diagram.edit.policies;

import org.eclipse.amalgam.examples.scenario.ScenarioPackage;
import org.eclipse.amalgam.examples.scenario.diagram.edit.commands.DataObjectCreateCommand;
import org.eclipse.amalgam.examples.scenario.diagram.edit.commands.Event2CreateCommand;
import org.eclipse.amalgam.examples.scenario.diagram.edit.commands.Event3CreateCommand;
import org.eclipse.amalgam.examples.scenario.diagram.edit.commands.Event4CreateCommand;
import org.eclipse.amalgam.examples.scenario.diagram.edit.commands.Event5CreateCommand;
import org.eclipse.amalgam.examples.scenario.diagram.edit.commands.Event6CreateCommand;
import org.eclipse.amalgam.examples.scenario.diagram.edit.commands.EventCreateCommand;
import org.eclipse.amalgam.examples.scenario.diagram.edit.commands.Gateway2CreateCommand;
import org.eclipse.amalgam.examples.scenario.diagram.edit.commands.Gateway3CreateCommand;
import org.eclipse.amalgam.examples.scenario.diagram.edit.commands.GatewayCreateCommand;
import org.eclipse.amalgam.examples.scenario.diagram.edit.commands.ProcessCreateCommand;
import org.eclipse.amalgam.examples.scenario.diagram.edit.commands.TaskCreateCommand;
import org.eclipse.amalgam.examples.scenario.diagram.providers.ScenarioElementTypes;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

/**
 * @generated
 */
public class ProcessItemSemanticEditPolicy extends
		ScenarioBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ScenarioElementTypes.DataObject_2001 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(ScenarioPackage.eINSTANCE
						.getProcess_Elements());
			}
			return getGEFWrapper(new DataObjectCreateCommand(req));
		}
		if (ScenarioElementTypes.Event_2002 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(ScenarioPackage.eINSTANCE
						.getProcess_Elements());
			}
			return getGEFWrapper(new EventCreateCommand(req));
		}
		if (ScenarioElementTypes.Gateway_2003 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(ScenarioPackage.eINSTANCE
						.getProcess_Elements());
			}
			return getGEFWrapper(new GatewayCreateCommand(req));
		}
		if (ScenarioElementTypes.Task_2004 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(ScenarioPackage.eINSTANCE
						.getProcess_Elements());
			}
			return getGEFWrapper(new TaskCreateCommand(req));
		}
		if (ScenarioElementTypes.Event_2005 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(ScenarioPackage.eINSTANCE
						.getProcess_Elements());
			}
			return getGEFWrapper(new Event2CreateCommand(req));
		}
		if (ScenarioElementTypes.Event_2006 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(ScenarioPackage.eINSTANCE
						.getProcess_Elements());
			}
			return getGEFWrapper(new Event3CreateCommand(req));
		}
		if (ScenarioElementTypes.Process_2007 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(ScenarioPackage.eINSTANCE
						.getProcess_Elements());
			}
			return getGEFWrapper(new ProcessCreateCommand(req));
		}
		if (ScenarioElementTypes.Gateway_2008 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(ScenarioPackage.eINSTANCE
						.getProcess_Elements());
			}
			return getGEFWrapper(new Gateway2CreateCommand(req));
		}
		if (ScenarioElementTypes.Event_2009 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(ScenarioPackage.eINSTANCE
						.getProcess_Elements());
			}
			return getGEFWrapper(new Event4CreateCommand(req));
		}
		if (ScenarioElementTypes.Event_2010 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(ScenarioPackage.eINSTANCE
						.getProcess_Elements());
			}
			return getGEFWrapper(new Event5CreateCommand(req));
		}
		if (ScenarioElementTypes.Event_2011 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(ScenarioPackage.eINSTANCE
						.getProcess_Elements());
			}
			return getGEFWrapper(new Event6CreateCommand(req));
		}
		if (ScenarioElementTypes.Gateway_2012 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(ScenarioPackage.eINSTANCE
						.getProcess_Elements());
			}
			return getGEFWrapper(new Gateway3CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
				.getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends
			DuplicateEObjectsCommand {

		/**
		 * @generated
		 */
		public DuplicateAnythingCommand(
				TransactionalEditingDomain editingDomain,
				DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req
					.getElementsToBeDuplicated(), req
					.getAllDuplicatedElementsMap());
		}

	}

}
