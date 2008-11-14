package org.eclipse.amalgam.examples.requirements.diagram.providers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import org.eclipse.amalgam.examples.requirements.diagram.edit.parts.ModelEditPart;
import org.eclipse.amalgam.examples.requirements.diagram.edit.parts.RequirementEditPart;
import org.eclipse.amalgam.examples.requirements.diagram.edit.parts.RequirementGroup2EditPart;
import org.eclipse.amalgam.examples.requirements.diagram.edit.parts.RequirementGroupEditPart;
import org.eclipse.amalgam.examples.requirements.diagram.part.Messages;
import org.eclipse.amalgam.examples.requirements.diagram.part.RequirementsDiagramEditorPlugin;
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
public class RequirementsModelingAssistantProvider extends
		ModelingAssistantProvider {

	/**
	 * @generated
	 */
	public List getTypesForPopupBar(IAdaptable host) {
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		if (editPart instanceof RequirementEditPart) {
			List types = new ArrayList();
			types.add(RequirementsElementTypes.Process_3001);
			return types;
		}
		if (editPart instanceof ModelEditPart) {
			List types = new ArrayList();
			types.add(RequirementsElementTypes.RequirementGroup_2001);
			types.add(RequirementsElementTypes.Requirement_2002);
			types.add(RequirementsElementTypes.RequirementGroup_2003);
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
		if (sourceEditPart instanceof RequirementGroupEditPart) {
			List types = new ArrayList();
			types
					.add(RequirementsElementTypes.RequirementGroupRequirements_4001);
			types.add(RequirementsElementTypes.RequirementGroupChildren_4004);
			return types;
		}
		if (sourceEditPart instanceof RequirementEditPart) {
			List types = new ArrayList();
			types.add(RequirementsElementTypes.RequirementChildren_4002);
			types.add(RequirementsElementTypes.RequirementDependencies_4003);
			return types;
		}
		if (sourceEditPart instanceof RequirementGroup2EditPart) {
			List types = new ArrayList();
			types
					.add(RequirementsElementTypes.RequirementGroupRequirements_4001);
			types.add(RequirementsElementTypes.RequirementGroupChildren_4004);
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof RequirementGroupEditPart) {
			List types = new ArrayList();
			types.add(RequirementsElementTypes.RequirementGroupChildren_4004);
			return types;
		}
		if (targetEditPart instanceof RequirementEditPart) {
			List types = new ArrayList();
			types
					.add(RequirementsElementTypes.RequirementGroupRequirements_4001);
			types.add(RequirementsElementTypes.RequirementChildren_4002);
			types.add(RequirementsElementTypes.RequirementDependencies_4003);
			return types;
		}
		if (targetEditPart instanceof RequirementGroup2EditPart) {
			List types = new ArrayList();
			types.add(RequirementsElementTypes.RequirementGroupChildren_4004);
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
		if (sourceEditPart instanceof RequirementGroupEditPart) {
			List types = new ArrayList();
			if (targetEditPart instanceof RequirementEditPart) {
				types
						.add(RequirementsElementTypes.RequirementGroupRequirements_4001);
			}
			if (targetEditPart instanceof RequirementGroupEditPart) {
				types
						.add(RequirementsElementTypes.RequirementGroupChildren_4004);
			}
			if (targetEditPart instanceof RequirementGroup2EditPart) {
				types
						.add(RequirementsElementTypes.RequirementGroupChildren_4004);
			}
			return types;
		}
		if (sourceEditPart instanceof RequirementEditPart) {
			List types = new ArrayList();
			if (targetEditPart instanceof RequirementEditPart) {
				types.add(RequirementsElementTypes.RequirementChildren_4002);
			}
			if (targetEditPart instanceof RequirementEditPart) {
				types
						.add(RequirementsElementTypes.RequirementDependencies_4003);
			}
			return types;
		}
		if (sourceEditPart instanceof RequirementGroup2EditPart) {
			List types = new ArrayList();
			if (targetEditPart instanceof RequirementEditPart) {
				types
						.add(RequirementsElementTypes.RequirementGroupRequirements_4001);
			}
			if (targetEditPart instanceof RequirementGroupEditPart) {
				types
						.add(RequirementsElementTypes.RequirementGroupChildren_4004);
			}
			if (targetEditPart instanceof RequirementGroup2EditPart) {
				types
						.add(RequirementsElementTypes.RequirementGroupChildren_4004);
			}
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForSource(IAdaptable target,
			IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof RequirementGroupEditPart) {
			List types = new ArrayList();
			if (relationshipType == RequirementsElementTypes.RequirementGroupChildren_4004) {
				types.add(RequirementsElementTypes.RequirementGroup_2001);
			}
			if (relationshipType == RequirementsElementTypes.RequirementGroupChildren_4004) {
				types.add(RequirementsElementTypes.RequirementGroup_2003);
			}
			return types;
		}
		if (targetEditPart instanceof RequirementEditPart) {
			List types = new ArrayList();
			if (relationshipType == RequirementsElementTypes.RequirementGroupRequirements_4001) {
				types.add(RequirementsElementTypes.RequirementGroup_2001);
			}
			if (relationshipType == RequirementsElementTypes.RequirementGroupRequirements_4001) {
				types.add(RequirementsElementTypes.RequirementGroup_2003);
			}
			if (relationshipType == RequirementsElementTypes.RequirementChildren_4002) {
				types.add(RequirementsElementTypes.Requirement_2002);
			}
			if (relationshipType == RequirementsElementTypes.RequirementDependencies_4003) {
				types.add(RequirementsElementTypes.Requirement_2002);
			}
			return types;
		}
		if (targetEditPart instanceof RequirementGroup2EditPart) {
			List types = new ArrayList();
			if (relationshipType == RequirementsElementTypes.RequirementGroupChildren_4004) {
				types.add(RequirementsElementTypes.RequirementGroup_2001);
			}
			if (relationshipType == RequirementsElementTypes.RequirementGroupChildren_4004) {
				types.add(RequirementsElementTypes.RequirementGroup_2003);
			}
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
		if (sourceEditPart instanceof RequirementGroupEditPart) {
			List types = new ArrayList();
			if (relationshipType == RequirementsElementTypes.RequirementGroupRequirements_4001) {
				types.add(RequirementsElementTypes.Requirement_2002);
			}
			if (relationshipType == RequirementsElementTypes.RequirementGroupChildren_4004) {
				types.add(RequirementsElementTypes.RequirementGroup_2001);
			}
			if (relationshipType == RequirementsElementTypes.RequirementGroupChildren_4004) {
				types.add(RequirementsElementTypes.RequirementGroup_2003);
			}
			return types;
		}
		if (sourceEditPart instanceof RequirementEditPart) {
			List types = new ArrayList();
			if (relationshipType == RequirementsElementTypes.RequirementChildren_4002) {
				types.add(RequirementsElementTypes.Requirement_2002);
			}
			if (relationshipType == RequirementsElementTypes.RequirementDependencies_4003) {
				types.add(RequirementsElementTypes.Requirement_2002);
			}
			return types;
		}
		if (sourceEditPart instanceof RequirementGroup2EditPart) {
			List types = new ArrayList();
			if (relationshipType == RequirementsElementTypes.RequirementGroupRequirements_4001) {
				types.add(RequirementsElementTypes.Requirement_2002);
			}
			if (relationshipType == RequirementsElementTypes.RequirementGroupChildren_4004) {
				types.add(RequirementsElementTypes.RequirementGroup_2001);
			}
			if (relationshipType == RequirementsElementTypes.RequirementGroupChildren_4004) {
				types.add(RequirementsElementTypes.RequirementGroup_2003);
			}
			return types;
		}
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
				RequirementsDiagramEditorPlugin.getInstance()
						.getItemProvidersAdapterFactory());
		ElementListSelectionDialog dialog = new ElementListSelectionDialog(
				shell, labelProvider);
		dialog
				.setMessage(Messages.RequirementsModelingAssistantProviderMessage);
		dialog.setTitle(Messages.RequirementsModelingAssistantProviderTitle);
		dialog.setMultipleSelection(false);
		dialog.setElements(elements);
		EObject selected = null;
		if (dialog.open() == Window.OK) {
			selected = (EObject) dialog.getFirstResult();
		}
		return selected;
	}
}
