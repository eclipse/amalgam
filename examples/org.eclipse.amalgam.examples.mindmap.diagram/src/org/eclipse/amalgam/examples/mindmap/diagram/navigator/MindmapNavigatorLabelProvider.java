package org.eclipse.amalgam.examples.mindmap.diagram.navigator;

import org.eclipse.amalgam.examples.mindmap.Map;
import org.eclipse.amalgam.examples.mindmap.diagram.edit.parts.MapEditPart;
import org.eclipse.amalgam.examples.mindmap.diagram.edit.parts.Relationship2EditPart;
import org.eclipse.amalgam.examples.mindmap.diagram.edit.parts.Relationship3EditPart;
import org.eclipse.amalgam.examples.mindmap.diagram.edit.parts.RelationshipEditPart;
import org.eclipse.amalgam.examples.mindmap.diagram.edit.parts.RelationshipName2EditPart;
import org.eclipse.amalgam.examples.mindmap.diagram.edit.parts.RelationshipName3EditPart;
import org.eclipse.amalgam.examples.mindmap.diagram.edit.parts.RelationshipNameEditPart;
import org.eclipse.amalgam.examples.mindmap.diagram.edit.parts.Topic2EditPart;
import org.eclipse.amalgam.examples.mindmap.diagram.edit.parts.TopicEditPart;
import org.eclipse.amalgam.examples.mindmap.diagram.edit.parts.TopicName2EditPart;
import org.eclipse.amalgam.examples.mindmap.diagram.edit.parts.TopicNameEditPart;
import org.eclipse.amalgam.examples.mindmap.diagram.edit.parts.TopicSubtopicsEditPart;
import org.eclipse.amalgam.examples.mindmap.diagram.part.MindmapDiagramEditorPlugin;
import org.eclipse.amalgam.examples.mindmap.diagram.part.MindmapVisualIDRegistry;
import org.eclipse.amalgam.examples.mindmap.diagram.providers.MindmapElementTypes;
import org.eclipse.amalgam.examples.mindmap.diagram.providers.MindmapParserProvider;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

/**
 * @generated
 */
public class MindmapNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		MindmapDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put(
						"Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		MindmapDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put(
						"Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof MindmapNavigatorItem
				&& !isOwnView(((MindmapNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof MindmapNavigatorGroup) {
			MindmapNavigatorGroup group = (MindmapNavigatorGroup) element;
			return MindmapDiagramEditorPlugin.getInstance().getBundledImage(
					group.getIcon());
		}

		if (element instanceof MindmapNavigatorItem) {
			MindmapNavigatorItem navigatorItem = (MindmapNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (MindmapVisualIDRegistry.getVisualID(view)) {
		case MapEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://www.eclipse.org/2008/mindmap?Map", MindmapElementTypes.Map_1000); //$NON-NLS-1$
		case TopicEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.eclipse.org/2008/mindmap?Topic", MindmapElementTypes.Topic_2001); //$NON-NLS-1$
		case Topic2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.eclipse.org/2008/mindmap?Topic", MindmapElementTypes.Topic_2002); //$NON-NLS-1$
		case TopicSubtopicsEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.eclipse.org/2008/mindmap?Topic?subtopics", MindmapElementTypes.TopicSubtopics_4001); //$NON-NLS-1$
		case RelationshipEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.eclipse.org/2008/mindmap?Relationship", MindmapElementTypes.Relationship_4002); //$NON-NLS-1$
		case Relationship2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.eclipse.org/2008/mindmap?Relationship", MindmapElementTypes.Relationship_4003); //$NON-NLS-1$
		case Relationship3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.eclipse.org/2008/mindmap?Relationship", MindmapElementTypes.Relationship_4004); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = MindmapDiagramEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& MindmapElementTypes.isKnownElementType(elementType)) {
			image = MindmapElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof MindmapNavigatorGroup) {
			MindmapNavigatorGroup group = (MindmapNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof MindmapNavigatorItem) {
			MindmapNavigatorItem navigatorItem = (MindmapNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (MindmapVisualIDRegistry.getVisualID(view)) {
		case MapEditPart.VISUAL_ID:
			return getMap_1000Text(view);
		case TopicEditPart.VISUAL_ID:
			return getTopic_2001Text(view);
		case Topic2EditPart.VISUAL_ID:
			return getTopic_2002Text(view);
		case TopicSubtopicsEditPart.VISUAL_ID:
			return getTopicSubtopics_4001Text(view);
		case RelationshipEditPart.VISUAL_ID:
			return getRelationship_4002Text(view);
		case Relationship2EditPart.VISUAL_ID:
			return getRelationship_4003Text(view);
		case Relationship3EditPart.VISUAL_ID:
			return getRelationship_4004Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getMap_1000Text(View view) {
		Map domainModelElement = (Map) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getTitle();
		} else {
			MindmapDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTopic_2001Text(View view) {
		IAdaptable hintAdapter = new MindmapParserProvider.HintAdapter(
				MindmapElementTypes.Topic_2001,
				(view.getElement() != null ? view.getElement() : view),
				MindmapVisualIDRegistry.getType(TopicNameEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			MindmapDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getTopic_2002Text(View view) {
		IAdaptable hintAdapter = new MindmapParserProvider.HintAdapter(
				MindmapElementTypes.Topic_2002,
				(view.getElement() != null ? view.getElement() : view),
				MindmapVisualIDRegistry.getType(TopicName2EditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			MindmapDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getTopicSubtopics_4001Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getRelationship_4002Text(View view) {
		IAdaptable hintAdapter = new MindmapParserProvider.HintAdapter(
				MindmapElementTypes.Relationship_4002,
				(view.getElement() != null ? view.getElement() : view),
				MindmapVisualIDRegistry
						.getType(RelationshipNameEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			MindmapDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getRelationship_4003Text(View view) {
		IAdaptable hintAdapter = new MindmapParserProvider.HintAdapter(
				MindmapElementTypes.Relationship_4003,
				(view.getElement() != null ? view.getElement() : view),
				MindmapVisualIDRegistry
						.getType(RelationshipName2EditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			MindmapDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getRelationship_4004Text(View view) {
		IAdaptable hintAdapter = new MindmapParserProvider.HintAdapter(
				MindmapElementTypes.Relationship_4004,
				(view.getElement() != null ? view.getElement() : view),
				MindmapVisualIDRegistry
						.getType(RelationshipName3EditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			MindmapDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$ //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$ //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return MapEditPart.MODEL_ID.equals(MindmapVisualIDRegistry
				.getModelID(view));
	}

}
