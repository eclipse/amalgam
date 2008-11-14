package org.eclipse.amalgam.examples.dnc.diagram.providers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.AnnotationEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.DescriptionEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.MIDetailEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.MomentIntervalEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.Package2EditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.PackageEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.PartyEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.PlaceEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.PluginPointEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.RoleEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.ThingEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.part.DncDiagramEditorPlugin;
import org.eclipse.amalgam.examples.dnc.diagram.part.Messages;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.modelingassistant.ModelingAssistantProvider;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;

/**
 * @generated
 */
public class DncModelingAssistantProvider extends ModelingAssistantProvider {

	/**
	 * @generated
	 */
	public List getTypesForPopupBar(IAdaptable host) {
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		if (editPart instanceof MomentIntervalEditPart) {
			List types = new ArrayList();
			types.add(DncElementTypes.Attribute_3001);
			types.add(DncElementTypes.Operation_3002);
			return types;
		}
		if (editPart instanceof MIDetailEditPart) {
			List types = new ArrayList();
			types.add(DncElementTypes.Attribute_3001);
			types.add(DncElementTypes.Operation_3002);
			return types;
		}
		if (editPart instanceof RoleEditPart) {
			List types = new ArrayList();
			types.add(DncElementTypes.Attribute_3001);
			types.add(DncElementTypes.Operation_3002);
			return types;
		}
		if (editPart instanceof PartyEditPart) {
			List types = new ArrayList();
			types.add(DncElementTypes.Attribute_3001);
			types.add(DncElementTypes.Operation_3002);
			return types;
		}
		if (editPart instanceof PlaceEditPart) {
			List types = new ArrayList();
			types.add(DncElementTypes.Attribute_3001);
			types.add(DncElementTypes.Operation_3002);
			return types;
		}
		if (editPart instanceof ThingEditPart) {
			List types = new ArrayList();
			types.add(DncElementTypes.Attribute_3001);
			types.add(DncElementTypes.Operation_3002);
			return types;
		}
		if (editPart instanceof DescriptionEditPart) {
			List types = new ArrayList();
			types.add(DncElementTypes.Attribute_3001);
			types.add(DncElementTypes.Operation_3002);
			return types;
		}
		if (editPart instanceof PluginPointEditPart) {
			List types = new ArrayList();
			types.add(DncElementTypes.Attribute_3001);
			types.add(DncElementTypes.Operation_3002);
			return types;
		}
		if (editPart instanceof Package2EditPart) {
			List types = new ArrayList();
			types.add(DncElementTypes.Package_3003);
			return types;
		}
		if (editPart instanceof PackageEditPart) {
			List types = new ArrayList();
			types.add(DncElementTypes.MomentInterval_2001);
			types.add(DncElementTypes.MIDetail_2002);
			types.add(DncElementTypes.Role_2003);
			types.add(DncElementTypes.Party_2004);
			types.add(DncElementTypes.Place_2005);
			types.add(DncElementTypes.Thing_2006);
			types.add(DncElementTypes.Description_2007);
			types.add(DncElementTypes.PluginPoint_2008);
			types.add(DncElementTypes.Package_2009);
			types.add(DncElementTypes.Annotation_2010);
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof AnnotationEditPart) {
			List types = new ArrayList();
			types.add(DncElementTypes.AnnotatedElementAnnotations_4004);
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSourceAndTarget(IAdaptable source,
			IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForSource(IAdaptable target,
			IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof AnnotationEditPart) {
			List types = new ArrayList();
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForTarget(IAdaptable source,
			IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForSource(IAdaptable target,
			IElementType relationshipType) {
		return selectExistingElement(target, getTypesForSource(target,
				relationshipType));
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForTarget(IAdaptable source,
			IElementType relationshipType) {
		return selectExistingElement(source, getTypesForTarget(source,
				relationshipType));
	}

	/**
	 * @generated
	 */
	protected EObject selectExistingElement(IAdaptable host, Collection types) {
		if (types.isEmpty()) {
			return null;
		}
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		if (editPart == null) {
			return null;
		}
		Diagram diagram = (Diagram) editPart.getRoot().getContents().getModel();
		Collection elements = new HashSet();
		for (Iterator it = diagram.getElement().eAllContents(); it.hasNext();) {
			EObject element = (EObject) it.next();
			if (isApplicableElement(element, types)) {
				elements.add(element);
			}
		}
		if (elements.isEmpty()) {
			return null;
		}
		return selectElement((EObject[]) elements.toArray(new EObject[elements
				.size()]));
	}

	/**
	 * @generated
	 */
	protected boolean isApplicableElement(EObject element, Collection types) {
		IElementType type = ElementTypeRegistry.getInstance().getElementType(
				element);
		return types.contains(type);
	}

	/**
	 * @generated
	 */
	protected EObject selectElement(EObject[] elements) {
		Shell shell = Display.getCurrent().getActiveShell();
		ILabelProvider labelProvider = new AdapterFactoryLabelProvider(
				DncDiagramEditorPlugin.getInstance()
						.getItemProvidersAdapterFactory());
		ElementListSelectionDialog dialog = new ElementListSelectionDialog(
				shell, labelProvider);
		dialog.setMessage(Messages.DncModelingAssistantProviderMessage);
		dialog.setTitle(Messages.DncModelingAssistantProviderTitle);
		dialog.setMultipleSelection(false);
		dialog.setElements(elements);
		EObject selected = null;
		if (dialog.open() == Window.OK) {
			selected = (EObject) dialog.getFirstResult();
		}
		return selected;
	}
}
