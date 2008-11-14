package org.eclipse.amalgam.examples.dnc.diagram.edit.policies;

import org.eclipse.amalgam.examples.dnc.diagram.edit.commands.OperationCreateCommand;
import org.eclipse.amalgam.examples.dnc.diagram.providers.DncElementTypes;
import org.eclipse.amalgam.examples.oocore.OocorePackage;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class PartyOperationsItemSemanticEditPolicy extends
		DncBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (DncElementTypes.Operation_3002 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(OocorePackage.eINSTANCE
						.getClass_Operations());
			}
			return getGEFWrapper(new OperationCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
