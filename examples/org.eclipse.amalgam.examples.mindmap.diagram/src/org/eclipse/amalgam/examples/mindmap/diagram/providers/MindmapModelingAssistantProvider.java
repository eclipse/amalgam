package org.eclipse.amalgam.examples.mindmap.diagram.providers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import org.eclipse.amalgam.examples.mindmap.diagram.edit.parts.MapEditPart;
import org.eclipse.amalgam.examples.mindmap.diagram.edit.parts.Topic2EditPart;
import org.eclipse.amalgam.examples.mindmap.diagram.edit.parts.TopicEditPart;
import org.eclipse.amalgam.examples.mindmap.diagram.part.Messages;
import org.eclipse.amalgam.examples.mindmap.diagram.part.MindmapDiagramEditorPlugin;
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
public class MindmapModelingAssistantProvider extends ModelingAssistantProvider {

	/**
	 * @generated
	 */
	public List getTypesForPopupBar(IAdaptable host) {
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		if (editPart instanceof MapEditPart) {
			List types = new ArrayList();
			types.add(MindmapElementTypes.Topic_2001);
			types.add(MindmapElementTypes.Topic_2002);
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
		if (sourceEditPart instanceof TopicEditPart) {
			List types = new ArrayList();
			types.add(MindmapElementTypes.TopicSubtopics_4001);
			types.add(MindmapElementTypes.Relationship_4002);
			types.add(MindmapElementTypes.Relationship_4003);
			types.add(MindmapElementTypes.Relationship_4004);
			return types;
		}
		if (sourceEditPart instanceof Topic2EditPart) {
			List types = new ArrayList();
			types.add(MindmapElementTypes.TopicSubtopics_4001);
			types.add(MindmapElementTypes.Relationship_4002);
			types.add(MindmapElementTypes.Relationship_4003);
			types.add(MindmapElementTypes.Relationship_4004);
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
		if (targetEditPart instanceof TopicEditPart) {
			List types = new ArrayList();
			types.add(MindmapElementTypes.TopicSubtopics_4001);
			types.add(MindmapElementTypes.Relationship_4002);
			types.add(MindmapElementTypes.Relationship_4003);
			types.add(MindmapElementTypes.Relationship_4004);
			return types;
		}
		if (targetEditPart instanceof Topic2EditPart) {
			List types = new ArrayList();
			types.add(MindmapElementTypes.TopicSubtopics_4001);
			types.add(MindmapElementTypes.Relationship_4002);
			types.add(MindmapElementTypes.Relationship_4003);
			types.add(MindmapElementTypes.Relationship_4004);
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
		if (sourceEditPart instanceof TopicEditPart) {
			List types = new ArrayList();
			if (targetEditPart instanceof TopicEditPart) {
				types.add(MindmapElementTypes.TopicSubtopics_4001);
			}
			if (targetEditPart instanceof Topic2EditPart) {
				types.add(MindmapElementTypes.TopicSubtopics_4001);
			}
			if (targetEditPart instanceof TopicEditPart) {
				types.add(MindmapElementTypes.Relationship_4002);
			}
			if (targetEditPart instanceof Topic2EditPart) {
				types.add(MindmapElementTypes.Relationship_4002);
			}
			if (targetEditPart instanceof TopicEditPart) {
				types.add(MindmapElementTypes.Relationship_4003);
			}
			if (targetEditPart instanceof Topic2EditPart) {
				types.add(MindmapElementTypes.Relationship_4003);
			}
			if (targetEditPart instanceof TopicEditPart) {
				types.add(MindmapElementTypes.Relationship_4004);
			}
			if (targetEditPart instanceof Topic2EditPart) {
				types.add(MindmapElementTypes.Relationship_4004);
			}
			return types;
		}
		if (sourceEditPart instanceof Topic2EditPart) {
			List types = new ArrayList();
			if (targetEditPart instanceof TopicEditPart) {
				types.add(MindmapElementTypes.TopicSubtopics_4001);
			}
			if (targetEditPart instanceof Topic2EditPart) {
				types.add(MindmapElementTypes.TopicSubtopics_4001);
			}
			if (targetEditPart instanceof TopicEditPart) {
				types.add(MindmapElementTypes.Relationship_4002);
			}
			if (targetEditPart instanceof Topic2EditPart) {
				types.add(MindmapElementTypes.Relationship_4002);
			}
			if (targetEditPart instanceof TopicEditPart) {
				types.add(MindmapElementTypes.Relationship_4003);
			}
			if (targetEditPart instanceof Topic2EditPart) {
				types.add(MindmapElementTypes.Relationship_4003);
			}
			if (targetEditPart instanceof TopicEditPart) {
				types.add(MindmapElementTypes.Relationship_4004);
			}
			if (targetEditPart instanceof Topic2EditPart) {
				types.add(MindmapElementTypes.Relationship_4004);
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
		if (targetEditPart instanceof TopicEditPart) {
			List types = new ArrayList();
			if (relationshipType == MindmapElementTypes.TopicSubtopics_4001) {
				types.add(MindmapElementTypes.Topic_2001);
			}
			if (relationshipType == MindmapElementTypes.TopicSubtopics_4001) {
				types.add(MindmapElementTypes.Topic_2002);
			}
			if (relationshipType == MindmapElementTypes.Relationship_4002) {
				types.add(MindmapElementTypes.Topic_2001);
			}
			if (relationshipType == MindmapElementTypes.Relationship_4002) {
				types.add(MindmapElementTypes.Topic_2002);
			}
			if (relationshipType == MindmapElementTypes.Relationship_4003) {
				types.add(MindmapElementTypes.Topic_2001);
			}
			if (relationshipType == MindmapElementTypes.Relationship_4003) {
				types.add(MindmapElementTypes.Topic_2002);
			}
			if (relationshipType == MindmapElementTypes.Relationship_4004) {
				types.add(MindmapElementTypes.Topic_2001);
			}
			if (relationshipType == MindmapElementTypes.Relationship_4004) {
				types.add(MindmapElementTypes.Topic_2002);
			}
			return types;
		}
		if (targetEditPart instanceof Topic2EditPart) {
			List types = new ArrayList();
			if (relationshipType == MindmapElementTypes.TopicSubtopics_4001) {
				types.add(MindmapElementTypes.Topic_2001);
			}
			if (relationshipType == MindmapElementTypes.TopicSubtopics_4001) {
				types.add(MindmapElementTypes.Topic_2002);
			}
			if (relationshipType == MindmapElementTypes.Relationship_4002) {
				types.add(MindmapElementTypes.Topic_2001);
			}
			if (relationshipType == MindmapElementTypes.Relationship_4002) {
				types.add(MindmapElementTypes.Topic_2002);
			}
			if (relationshipType == MindmapElementTypes.Relationship_4003) {
				types.add(MindmapElementTypes.Topic_2001);
			}
			if (relationshipType == MindmapElementTypes.Relationship_4003) {
				types.add(MindmapElementTypes.Topic_2002);
			}
			if (relationshipType == MindmapElementTypes.Relationship_4004) {
				types.add(MindmapElementTypes.Topic_2001);
			}
			if (relationshipType == MindmapElementTypes.Relationship_4004) {
				types.add(MindmapElementTypes.Topic_2002);
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
		if (sourceEditPart instanceof TopicEditPart) {
			List types = new ArrayList();
			if (relationshipType == MindmapElementTypes.TopicSubtopics_4001) {
				types.add(MindmapElementTypes.Topic_2001);
			}
			if (relationshipType == MindmapElementTypes.TopicSubtopics_4001) {
				types.add(MindmapElementTypes.Topic_2002);
			}
			if (relationshipType == MindmapElementTypes.Relationship_4002) {
				types.add(MindmapElementTypes.Topic_2001);
			}
			if (relationshipType == MindmapElementTypes.Relationship_4002) {
				types.add(MindmapElementTypes.Topic_2002);
			}
			if (relationshipType == MindmapElementTypes.Relationship_4003) {
				types.add(MindmapElementTypes.Topic_2001);
			}
			if (relationshipType == MindmapElementTypes.Relationship_4003) {
				types.add(MindmapElementTypes.Topic_2002);
			}
			if (relationshipType == MindmapElementTypes.Relationship_4004) {
				types.add(MindmapElementTypes.Topic_2001);
			}
			if (relationshipType == MindmapElementTypes.Relationship_4004) {
				types.add(MindmapElementTypes.Topic_2002);
			}
			return types;
		}
		if (sourceEditPart instanceof Topic2EditPart) {
			List types = new ArrayList();
			if (relationshipType == MindmapElementTypes.TopicSubtopics_4001) {
				types.add(MindmapElementTypes.Topic_2001);
			}
			if (relationshipType == MindmapElementTypes.TopicSubtopics_4001) {
				types.add(MindmapElementTypes.Topic_2002);
			}
			if (relationshipType == MindmapElementTypes.Relationship_4002) {
				types.add(MindmapElementTypes.Topic_2001);
			}
			if (relationshipType == MindmapElementTypes.Relationship_4002) {
				types.add(MindmapElementTypes.Topic_2002);
			}
			if (relationshipType == MindmapElementTypes.Relationship_4003) {
				types.add(MindmapElementTypes.Topic_2001);
			}
			if (relationshipType == MindmapElementTypes.Relationship_4003) {
				types.add(MindmapElementTypes.Topic_2002);
			}
			if (relationshipType == MindmapElementTypes.Relationship_4004) {
				types.add(MindmapElementTypes.Topic_2001);
			}
			if (relationshipType == MindmapElementTypes.Relationship_4004) {
				types.add(MindmapElementTypes.Topic_2002);
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
				MindmapDiagramEditorPlugin.getInstance()
						.getItemProvidersAdapterFactory());
		ElementListSelectionDialog dialog = new ElementListSelectionDialog(
				shell, labelProvider);
		dialog.setMessage(Messages.MindmapModelingAssistantProviderMessage);
		dialog.setTitle(Messages.MindmapModelingAssistantProviderTitle);
		dialog.setMultipleSelection(false);
		dialog.setElements(elements);
		EObject selected = null;
		if (dialog.open() == Window.OK) {
			selected = (EObject) dialog.getFirstResult();
		}
		return selected;
	}
}