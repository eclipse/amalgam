package org.eclipse.amalgam.examples.requirements.diagram.navigator;

import org.eclipse.amalgam.examples.requirements.Model;
import org.eclipse.amalgam.examples.requirements.diagram.edit.parts.ModelEditPart;
import org.eclipse.amalgam.examples.requirements.diagram.edit.parts.ProcessEditPart;
import org.eclipse.amalgam.examples.requirements.diagram.edit.parts.RequirementChildrenEditPart;
import org.eclipse.amalgam.examples.requirements.diagram.edit.parts.RequirementDependenciesEditPart;
import org.eclipse.amalgam.examples.requirements.diagram.edit.parts.RequirementEditPart;
import org.eclipse.amalgam.examples.requirements.diagram.edit.parts.RequirementGroup2EditPart;
import org.eclipse.amalgam.examples.requirements.diagram.edit.parts.RequirementGroupChildrenEditPart;
import org.eclipse.amalgam.examples.requirements.diagram.edit.parts.RequirementGroupEditPart;
import org.eclipse.amalgam.examples.requirements.diagram.edit.parts.RequirementGroupId2EditPart;
import org.eclipse.amalgam.examples.requirements.diagram.edit.parts.RequirementGroupIdEditPart;
import org.eclipse.amalgam.examples.requirements.diagram.edit.parts.RequirementGroupRequirementsEditPart;
import org.eclipse.amalgam.examples.requirements.diagram.edit.parts.RequirementIdEditPart;
import org.eclipse.amalgam.examples.requirements.diagram.part.RequirementsDiagramEditorPlugin;
import org.eclipse.amalgam.examples.requirements.diagram.part.RequirementsVisualIDRegistry;
import org.eclipse.amalgam.examples.requirements.diagram.providers.RequirementsElementTypes;
import org.eclipse.amalgam.examples.requirements.diagram.providers.RequirementsParserProvider;
import org.eclipse.amalgam.examples.scenario.Process;
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
public class RequirementsNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		RequirementsDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put(
						"Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		RequirementsDiagramEditorPlugin
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
		if (element instanceof RequirementsNavigatorItem
				&& !isOwnView(((RequirementsNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof RequirementsNavigatorGroup) {
			RequirementsNavigatorGroup group = (RequirementsNavigatorGroup) element;
			return RequirementsDiagramEditorPlugin.getInstance()
					.getBundledImage(group.getIcon());
		}

		if (element instanceof RequirementsNavigatorItem) {
			RequirementsNavigatorItem navigatorItem = (RequirementsNavigatorItem) element;
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
		switch (RequirementsVisualIDRegistry.getVisualID(view)) {
		case ModelEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://www.eclipse.org/2008/requirements?Model", RequirementsElementTypes.Model_1000); //$NON-NLS-1$
		case RequirementGroupEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.eclipse.org/2008/requirements?RequirementGroup", RequirementsElementTypes.RequirementGroup_2001); //$NON-NLS-1$
		case RequirementEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.eclipse.org/2008/requirements?Requirement", RequirementsElementTypes.Requirement_2002); //$NON-NLS-1$
		case RequirementGroup2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.eclipse.org/2008/requirements?RequirementGroup", RequirementsElementTypes.RequirementGroup_2003); //$NON-NLS-1$
		case ProcessEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.eclipse.org/2008/scenario?Process", RequirementsElementTypes.Process_3001); //$NON-NLS-1$
		case RequirementGroupRequirementsEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.eclipse.org/2008/requirements?RequirementGroup?requirements", RequirementsElementTypes.RequirementGroupRequirements_4001); //$NON-NLS-1$
		case RequirementChildrenEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.eclipse.org/2008/requirements?Requirement?children", RequirementsElementTypes.RequirementChildren_4002); //$NON-NLS-1$
		case RequirementDependenciesEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.eclipse.org/2008/requirements?Requirement?dependencies", RequirementsElementTypes.RequirementDependencies_4003); //$NON-NLS-1$
		case RequirementGroupChildrenEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.eclipse.org/2008/requirements?RequirementGroup?children", RequirementsElementTypes.RequirementGroupChildren_4004); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = RequirementsDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& RequirementsElementTypes.isKnownElementType(elementType)) {
			image = RequirementsElementTypes.getImage(elementType);
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
		if (element instanceof RequirementsNavigatorGroup) {
			RequirementsNavigatorGroup group = (RequirementsNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof RequirementsNavigatorItem) {
			RequirementsNavigatorItem navigatorItem = (RequirementsNavigatorItem) element;
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
		switch (RequirementsVisualIDRegistry.getVisualID(view)) {
		case ModelEditPart.VISUAL_ID:
			return getModel_1000Text(view);
		case RequirementGroupEditPart.VISUAL_ID:
			return getRequirementGroup_2001Text(view);
		case RequirementEditPart.VISUAL_ID:
			return getRequirement_2002Text(view);
		case RequirementGroup2EditPart.VISUAL_ID:
			return getRequirementGroup_2003Text(view);
		case ProcessEditPart.VISUAL_ID:
			return getProcess_3001Text(view);
		case RequirementGroupRequirementsEditPart.VISUAL_ID:
			return getRequirementGroupRequirements_4001Text(view);
		case RequirementChildrenEditPart.VISUAL_ID:
			return getRequirementChildren_4002Text(view);
		case RequirementDependenciesEditPart.VISUAL_ID:
			return getRequirementDependencies_4003Text(view);
		case RequirementGroupChildrenEditPart.VISUAL_ID:
			return getRequirementGroupChildren_4004Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getModel_1000Text(View view) {
		Model domainModelElement = (Model) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getTitle();
		} else {
			RequirementsDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRequirementGroup_2001Text(View view) {
		IAdaptable hintAdapter = new RequirementsParserProvider.HintAdapter(
				RequirementsElementTypes.RequirementGroup_2001, (view
						.getElement() != null ? view.getElement() : view),
				RequirementsVisualIDRegistry
						.getType(RequirementGroupIdEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			RequirementsDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getRequirement_2002Text(View view) {
		IAdaptable hintAdapter = new RequirementsParserProvider.HintAdapter(
				RequirementsElementTypes.Requirement_2002,
				(view.getElement() != null ? view.getElement() : view),
				RequirementsVisualIDRegistry
						.getType(RequirementIdEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			RequirementsDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getRequirementGroup_2003Text(View view) {
		IAdaptable hintAdapter = new RequirementsParserProvider.HintAdapter(
				RequirementsElementTypes.RequirementGroup_2003, (view
						.getElement() != null ? view.getElement() : view),
				RequirementsVisualIDRegistry
						.getType(RequirementGroupId2EditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			RequirementsDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getProcess_3001Text(View view) {
		Process domainModelElement = (Process) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			RequirementsDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRequirementGroupRequirements_4001Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getRequirementChildren_4002Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getRequirementDependencies_4003Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getRequirementGroupChildren_4004Text(View view) {
		return ""; //$NON-NLS-1$
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
		return ModelEditPart.MODEL_ID.equals(RequirementsVisualIDRegistry
				.getModelID(view));
	}

}
