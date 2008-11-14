package org.eclipse.amalgam.examples.dnc.diagram.edit.policies;

import org.eclipse.amalgam.examples.dnc.diagram.edit.commands.AnnotationCreateCommand;
import org.eclipse.amalgam.examples.dnc.diagram.edit.commands.DescriptionCreateCommand;
import org.eclipse.amalgam.examples.dnc.diagram.edit.commands.MIDetailCreateCommand;
import org.eclipse.amalgam.examples.dnc.diagram.edit.commands.MomentIntervalCreateCommand;
import org.eclipse.amalgam.examples.dnc.diagram.edit.commands.PackageCreateCommand;
import org.eclipse.amalgam.examples.dnc.diagram.edit.commands.PartyCreateCommand;
import org.eclipse.amalgam.examples.dnc.diagram.edit.commands.PlaceCreateCommand;
import org.eclipse.amalgam.examples.dnc.diagram.edit.commands.PluginPointCreateCommand;
import org.eclipse.amalgam.examples.dnc.diagram.edit.commands.RoleCreateCommand;
import org.eclipse.amalgam.examples.dnc.diagram.edit.commands.ThingCreateCommand;
import org.eclipse.amalgam.examples.dnc.diagram.providers.DncElementTypes;
import org.eclipse.amalgam.examples.oocore.OocorePackage;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

/**
 * @generated
 */
public class PackageItemSemanticEditPolicy extends
		DncBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (DncElementTypes.MomentInterval_2001 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(OocorePackage.eINSTANCE
						.getPackage_Contents());
			}
			return getGEFWrapper(new MomentIntervalCreateCommand(req));
		}
		if (DncElementTypes.MIDetail_2002 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(OocorePackage.eINSTANCE
						.getPackage_Contents());
			}
			return getGEFWrapper(new MIDetailCreateCommand(req));
		}
		if (DncElementTypes.Role_2003 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(OocorePackage.eINSTANCE
						.getPackage_Contents());
			}
			return getGEFWrapper(new RoleCreateCommand(req));
		}
		if (DncElementTypes.Party_2004 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(OocorePackage.eINSTANCE
						.getPackage_Contents());
			}
			return getGEFWrapper(new PartyCreateCommand(req));
		}
		if (DncElementTypes.Place_2005 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(OocorePackage.eINSTANCE
						.getPackage_Contents());
			}
			return getGEFWrapper(new PlaceCreateCommand(req));
		}
		if (DncElementTypes.Thing_2006 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(OocorePackage.eINSTANCE
						.getPackage_Contents());
			}
			return getGEFWrapper(new ThingCreateCommand(req));
		}
		if (DncElementTypes.Description_2007 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(OocorePackage.eINSTANCE
						.getPackage_Contents());
			}
			return getGEFWrapper(new DescriptionCreateCommand(req));
		}
		if (DncElementTypes.PluginPoint_2008 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(OocorePackage.eINSTANCE
						.getPackage_Contents());
			}
			return getGEFWrapper(new PluginPointCreateCommand(req));
		}
		if (DncElementTypes.Package_2009 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(OocorePackage.eINSTANCE
						.getPackage_Contents());
			}
			return getGEFWrapper(new PackageCreateCommand(req));
		}
		if (DncElementTypes.Annotation_2010 == req.getElementType()) {
			return getGEFWrapper(new AnnotationCreateCommand(req));
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
