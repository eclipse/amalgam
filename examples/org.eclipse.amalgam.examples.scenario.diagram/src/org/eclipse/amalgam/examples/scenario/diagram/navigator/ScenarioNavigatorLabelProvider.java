package org.eclipse.amalgam.examples.scenario.diagram.navigator;

import org.eclipse.amalgam.examples.scenario.Association;
import org.eclipse.amalgam.examples.scenario.Event;
import org.eclipse.amalgam.examples.scenario.Gateway;
import org.eclipse.amalgam.examples.scenario.Process;
import org.eclipse.amalgam.examples.scenario.diagram.edit.parts.Association2EditPart;
import org.eclipse.amalgam.examples.scenario.diagram.edit.parts.AssociationEditPart;
import org.eclipse.amalgam.examples.scenario.diagram.edit.parts.DataObjectEditPart;
import org.eclipse.amalgam.examples.scenario.diagram.edit.parts.DataObjectNameEditPart;
import org.eclipse.amalgam.examples.scenario.diagram.edit.parts.Event2EditPart;
import org.eclipse.amalgam.examples.scenario.diagram.edit.parts.Event3EditPart;
import org.eclipse.amalgam.examples.scenario.diagram.edit.parts.Event4EditPart;
import org.eclipse.amalgam.examples.scenario.diagram.edit.parts.Event5EditPart;
import org.eclipse.amalgam.examples.scenario.diagram.edit.parts.Event6EditPart;
import org.eclipse.amalgam.examples.scenario.diagram.edit.parts.Event7EditPart;
import org.eclipse.amalgam.examples.scenario.diagram.edit.parts.Event8EditPart;
import org.eclipse.amalgam.examples.scenario.diagram.edit.parts.EventEditPart;
import org.eclipse.amalgam.examples.scenario.diagram.edit.parts.EventNameEditPart;
import org.eclipse.amalgam.examples.scenario.diagram.edit.parts.Gateway2EditPart;
import org.eclipse.amalgam.examples.scenario.diagram.edit.parts.Gateway3EditPart;
import org.eclipse.amalgam.examples.scenario.diagram.edit.parts.GatewayEditPart;
import org.eclipse.amalgam.examples.scenario.diagram.edit.parts.MessageFlowEditPart;
import org.eclipse.amalgam.examples.scenario.diagram.edit.parts.MessageFlowNameEditPart;
import org.eclipse.amalgam.examples.scenario.diagram.edit.parts.Process2EditPart;
import org.eclipse.amalgam.examples.scenario.diagram.edit.parts.ProcessEditPart;
import org.eclipse.amalgam.examples.scenario.diagram.edit.parts.ProcessNameEditPart;
import org.eclipse.amalgam.examples.scenario.diagram.edit.parts.SequenceFlow2EditPart;
import org.eclipse.amalgam.examples.scenario.diagram.edit.parts.SequenceFlowEditPart;
import org.eclipse.amalgam.examples.scenario.diagram.edit.parts.SequenceFlowName2EditPart;
import org.eclipse.amalgam.examples.scenario.diagram.edit.parts.SequenceFlowNameEditPart;
import org.eclipse.amalgam.examples.scenario.diagram.edit.parts.TaskEditPart;
import org.eclipse.amalgam.examples.scenario.diagram.edit.parts.TaskNameEditPart;
import org.eclipse.amalgam.examples.scenario.diagram.part.ScenarioDiagramEditorPlugin;
import org.eclipse.amalgam.examples.scenario.diagram.part.ScenarioVisualIDRegistry;
import org.eclipse.amalgam.examples.scenario.diagram.providers.ScenarioElementTypes;
import org.eclipse.amalgam.examples.scenario.diagram.providers.ScenarioParserProvider;
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
public class ScenarioNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		ScenarioDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put(
						"Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		ScenarioDiagramEditorPlugin
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
		if (element instanceof ScenarioNavigatorItem
				&& !isOwnView(((ScenarioNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof ScenarioNavigatorGroup) {
			ScenarioNavigatorGroup group = (ScenarioNavigatorGroup) element;
			return ScenarioDiagramEditorPlugin.getInstance().getBundledImage(
					group.getIcon());
		}

		if (element instanceof ScenarioNavigatorItem) {
			ScenarioNavigatorItem navigatorItem = (ScenarioNavigatorItem) element;
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
		switch (ScenarioVisualIDRegistry.getVisualID(view)) {
		case ProcessEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://www.eclipse.org/2008/scenario?Process", ScenarioElementTypes.Process_1000); //$NON-NLS-1$
		case DataObjectEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.eclipse.org/2008/scenario?DataObject", ScenarioElementTypes.DataObject_2001); //$NON-NLS-1$
		case EventEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.eclipse.org/2008/scenario?Event", ScenarioElementTypes.Event_2002); //$NON-NLS-1$
		case GatewayEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.eclipse.org/2008/scenario?Gateway", ScenarioElementTypes.Gateway_2003); //$NON-NLS-1$
		case TaskEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.eclipse.org/2008/scenario?Task", ScenarioElementTypes.Task_2004); //$NON-NLS-1$
		case Event2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.eclipse.org/2008/scenario?Event", ScenarioElementTypes.Event_2005); //$NON-NLS-1$
		case Event3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.eclipse.org/2008/scenario?Event", ScenarioElementTypes.Event_2006); //$NON-NLS-1$
		case Process2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.eclipse.org/2008/scenario?Process", ScenarioElementTypes.Process_2007); //$NON-NLS-1$
		case Gateway2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.eclipse.org/2008/scenario?Gateway", ScenarioElementTypes.Gateway_2008); //$NON-NLS-1$
		case Event4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.eclipse.org/2008/scenario?Event", ScenarioElementTypes.Event_2009); //$NON-NLS-1$
		case Event5EditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.eclipse.org/2008/scenario?Event", ScenarioElementTypes.Event_2010); //$NON-NLS-1$
		case Event6EditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.eclipse.org/2008/scenario?Event", ScenarioElementTypes.Event_2011); //$NON-NLS-1$
		case Gateway3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.eclipse.org/2008/scenario?Gateway", ScenarioElementTypes.Gateway_2012); //$NON-NLS-1$
		case Event7EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.eclipse.org/2008/scenario?Event", ScenarioElementTypes.Event_3001); //$NON-NLS-1$
		case Event8EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.eclipse.org/2008/scenario?Event", ScenarioElementTypes.Event_3002); //$NON-NLS-1$
		case AssociationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.eclipse.org/2008/scenario?Association", ScenarioElementTypes.Association_4001); //$NON-NLS-1$
		case SequenceFlowEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.eclipse.org/2008/scenario?SequenceFlow", ScenarioElementTypes.SequenceFlow_4002); //$NON-NLS-1$
		case MessageFlowEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.eclipse.org/2008/scenario?MessageFlow", ScenarioElementTypes.MessageFlow_4003); //$NON-NLS-1$
		case SequenceFlow2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.eclipse.org/2008/scenario?SequenceFlow", ScenarioElementTypes.SequenceFlow_4004); //$NON-NLS-1$
		case Association2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.eclipse.org/2008/scenario?Association", ScenarioElementTypes.Association_4005); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = ScenarioDiagramEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& ScenarioElementTypes.isKnownElementType(elementType)) {
			image = ScenarioElementTypes.getImage(elementType);
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
		if (element instanceof ScenarioNavigatorGroup) {
			ScenarioNavigatorGroup group = (ScenarioNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof ScenarioNavigatorItem) {
			ScenarioNavigatorItem navigatorItem = (ScenarioNavigatorItem) element;
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
		switch (ScenarioVisualIDRegistry.getVisualID(view)) {
		case ProcessEditPart.VISUAL_ID:
			return getProcess_1000Text(view);
		case DataObjectEditPart.VISUAL_ID:
			return getDataObject_2001Text(view);
		case EventEditPart.VISUAL_ID:
			return getEvent_2002Text(view);
		case GatewayEditPart.VISUAL_ID:
			return getGateway_2003Text(view);
		case TaskEditPart.VISUAL_ID:
			return getTask_2004Text(view);
		case Event2EditPart.VISUAL_ID:
			return getEvent_2005Text(view);
		case Event3EditPart.VISUAL_ID:
			return getEvent_2006Text(view);
		case Process2EditPart.VISUAL_ID:
			return getProcess_2007Text(view);
		case Gateway2EditPart.VISUAL_ID:
			return getGateway_2008Text(view);
		case Event4EditPart.VISUAL_ID:
			return getEvent_2009Text(view);
		case Event5EditPart.VISUAL_ID:
			return getEvent_2010Text(view);
		case Event6EditPart.VISUAL_ID:
			return getEvent_2011Text(view);
		case Gateway3EditPart.VISUAL_ID:
			return getGateway_2012Text(view);
		case Event7EditPart.VISUAL_ID:
			return getEvent_3001Text(view);
		case Event8EditPart.VISUAL_ID:
			return getEvent_3002Text(view);
		case AssociationEditPart.VISUAL_ID:
			return getAssociation_4001Text(view);
		case SequenceFlowEditPart.VISUAL_ID:
			return getSequenceFlow_4002Text(view);
		case MessageFlowEditPart.VISUAL_ID:
			return getMessageFlow_4003Text(view);
		case SequenceFlow2EditPart.VISUAL_ID:
			return getSequenceFlow_4004Text(view);
		case Association2EditPart.VISUAL_ID:
			return getAssociation_4005Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getProcess_1000Text(View view) {
		Process domainModelElement = (Process) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			ScenarioDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDataObject_2001Text(View view) {
		IAdaptable hintAdapter = new ScenarioParserProvider.HintAdapter(
				ScenarioElementTypes.DataObject_2001,
				(view.getElement() != null ? view.getElement() : view),
				ScenarioVisualIDRegistry
						.getType(DataObjectNameEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			ScenarioDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getEvent_2002Text(View view) {
		Event domainModelElement = (Event) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			ScenarioDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 2002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getGateway_2003Text(View view) {
		Gateway domainModelElement = (Gateway) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			ScenarioDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 2003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTask_2004Text(View view) {
		IAdaptable hintAdapter = new ScenarioParserProvider.HintAdapter(
				ScenarioElementTypes.Task_2004,
				(view.getElement() != null ? view.getElement() : view),
				ScenarioVisualIDRegistry.getType(TaskNameEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			ScenarioDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getEvent_2005Text(View view) {
		IAdaptable hintAdapter = new ScenarioParserProvider.HintAdapter(
				ScenarioElementTypes.Event_2005,
				(view.getElement() != null ? view.getElement() : view),
				ScenarioVisualIDRegistry.getType(EventNameEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			ScenarioDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getEvent_2006Text(View view) {
		Event domainModelElement = (Event) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			ScenarioDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 2006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getProcess_2007Text(View view) {
		IAdaptable hintAdapter = new ScenarioParserProvider.HintAdapter(
				ScenarioElementTypes.Process_2007,
				(view.getElement() != null ? view.getElement() : view),
				ScenarioVisualIDRegistry.getType(ProcessNameEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			ScenarioDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getGateway_2008Text(View view) {
		Gateway domainModelElement = (Gateway) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			ScenarioDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 2008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEvent_2009Text(View view) {
		Event domainModelElement = (Event) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			ScenarioDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 2009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEvent_2010Text(View view) {
		Event domainModelElement = (Event) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			ScenarioDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 2010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEvent_2011Text(View view) {
		Event domainModelElement = (Event) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			ScenarioDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 2011); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getGateway_2012Text(View view) {
		Gateway domainModelElement = (Gateway) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			ScenarioDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 2012); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEvent_3001Text(View view) {
		Event domainModelElement = (Event) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			ScenarioDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEvent_3002Text(View view) {
		Event domainModelElement = (Event) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			ScenarioDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAssociation_4001Text(View view) {
		Association domainModelElement = (Association) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			ScenarioDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 4001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSequenceFlow_4002Text(View view) {
		IAdaptable hintAdapter = new ScenarioParserProvider.HintAdapter(
				ScenarioElementTypes.SequenceFlow_4002,
				(view.getElement() != null ? view.getElement() : view),
				ScenarioVisualIDRegistry
						.getType(SequenceFlowNameEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			ScenarioDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getMessageFlow_4003Text(View view) {
		IAdaptable hintAdapter = new ScenarioParserProvider.HintAdapter(
				ScenarioElementTypes.MessageFlow_4003,
				(view.getElement() != null ? view.getElement() : view),
				ScenarioVisualIDRegistry
						.getType(MessageFlowNameEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			ScenarioDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getSequenceFlow_4004Text(View view) {
		IAdaptable hintAdapter = new ScenarioParserProvider.HintAdapter(
				ScenarioElementTypes.SequenceFlow_4004,
				(view.getElement() != null ? view.getElement() : view),
				ScenarioVisualIDRegistry
						.getType(SequenceFlowName2EditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			ScenarioDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getAssociation_4005Text(View view) {
		Association domainModelElement = (Association) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			ScenarioDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 4005); //$NON-NLS-1$
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
		return ProcessEditPart.MODEL_ID.equals(ScenarioVisualIDRegistry
				.getModelID(view));
	}

}
