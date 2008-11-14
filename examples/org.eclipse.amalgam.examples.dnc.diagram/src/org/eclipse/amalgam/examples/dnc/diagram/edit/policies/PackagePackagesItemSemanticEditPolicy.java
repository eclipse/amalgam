package org.eclipse.amalgam.examples.dnc.diagram.edit.policies;

import org.eclipse.amalgam.examples.dnc.diagram.edit.commands.Package2CreateCommand;
import org.eclipse.amalgam.examples.dnc.diagram.providers.DncElementTypes;
import org.eclipse.amalgam.examples.oocore.OocorePackage;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class PackagePackagesItemSemanticEditPolicy extends
		DncBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (DncElementTypes.Package_3003 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(OocorePackage.eINSTANCE
						.getPackage_Contents());
			}
			return getGEFWrapper(new Package2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
