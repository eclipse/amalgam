package org.eclipse.amalgam.examples.dnc.diagram.navigator;

import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.AnnotatedElementAnnotationsEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.AnnotationEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.AnnotationKeyValueEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.Association2EditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.AssociationEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.AssociationLowerBoundUpperBound2EditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.AssociationLowerBoundUpperBoundEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.AttributeEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.ClassSuperclassesEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.DescriptionEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.DescriptionNameEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.MIDetailEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.MIDetailNameEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.MomentIntervalEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.MomentIntervalNameEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.OperationEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.Package2EditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.Package3EditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.PackageEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.PackageNameEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.PartyEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.PartyNameEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.PlaceEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.PlaceNameEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.PluginPointEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.PluginPointNameEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.RoleEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.RoleNameEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.ThingEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.ThingNameEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.part.DncDiagramEditorPlugin;
import org.eclipse.amalgam.examples.dnc.diagram.part.DncVisualIDRegistry;
import org.eclipse.amalgam.examples.dnc.diagram.providers.DncElementTypes;
import org.eclipse.amalgam.examples.dnc.diagram.providers.DncParserProvider;
import org.eclipse.amalgam.examples.oocore.Package;
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
public class DncNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		DncDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put(
						"Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		DncDiagramEditorPlugin
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
		if (element instanceof DncNavigatorItem
				&& !isOwnView(((DncNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof DncNavigatorGroup) {
			DncNavigatorGroup group = (DncNavigatorGroup) element;
			return DncDiagramEditorPlugin.getInstance().getBundledImage(
					group.getIcon());
		}

		if (element instanceof DncNavigatorItem) {
			DncNavigatorItem navigatorItem = (DncNavigatorItem) element;
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
		switch (DncVisualIDRegistry.getVisualID(view)) {
		case PackageEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://www.eclipse.org/2008/oocore?Package", DncElementTypes.Package_1000); //$NON-NLS-1$
		case MomentIntervalEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.eclipse.org/2008/dnc?MomentInterval", DncElementTypes.MomentInterval_2001); //$NON-NLS-1$
		case MIDetailEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.eclipse.org/2008/dnc?MIDetail", DncElementTypes.MIDetail_2002); //$NON-NLS-1$
		case RoleEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.eclipse.org/2008/dnc?Role", DncElementTypes.Role_2003); //$NON-NLS-1$
		case PartyEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.eclipse.org/2008/dnc?Party", DncElementTypes.Party_2004); //$NON-NLS-1$
		case PlaceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.eclipse.org/2008/dnc?Place", DncElementTypes.Place_2005); //$NON-NLS-1$
		case ThingEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.eclipse.org/2008/dnc?Thing", DncElementTypes.Thing_2006); //$NON-NLS-1$
		case DescriptionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.eclipse.org/2008/dnc?Description", DncElementTypes.Description_2007); //$NON-NLS-1$
		case PluginPointEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.eclipse.org/2008/dnc?PluginPoint", DncElementTypes.PluginPoint_2008); //$NON-NLS-1$
		case Package2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.eclipse.org/2008/oocore?Package", DncElementTypes.Package_2009); //$NON-NLS-1$
		case AnnotationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.eclipse.org/2008/oocore?Annotation", DncElementTypes.Annotation_2010); //$NON-NLS-1$
		case AttributeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.eclipse.org/2008/oocore?Attribute", DncElementTypes.Attribute_3001); //$NON-NLS-1$
		case OperationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.eclipse.org/2008/oocore?Operation", DncElementTypes.Operation_3002); //$NON-NLS-1$
		case Package3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.eclipse.org/2008/oocore?Package", DncElementTypes.Package_3003); //$NON-NLS-1$
		case AssociationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.eclipse.org/2008/dnc?Association", DncElementTypes.Association_4001); //$NON-NLS-1$
		case ClassSuperclassesEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.eclipse.org/2008/oocore?Class?superclasses", DncElementTypes.ClassSuperclasses_4002); //$NON-NLS-1$
		case Association2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.eclipse.org/2008/dnc?Association", DncElementTypes.Association_4003); //$NON-NLS-1$
		case AnnotatedElementAnnotationsEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.eclipse.org/2008/oocore?AnnotatedElement?annotations", DncElementTypes.AnnotatedElementAnnotations_4004); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = DncDiagramEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& DncElementTypes.isKnownElementType(elementType)) {
			image = DncElementTypes.getImage(elementType);
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
		if (element instanceof DncNavigatorGroup) {
			DncNavigatorGroup group = (DncNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof DncNavigatorItem) {
			DncNavigatorItem navigatorItem = (DncNavigatorItem) element;
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
		switch (DncVisualIDRegistry.getVisualID(view)) {
		case PackageEditPart.VISUAL_ID:
			return getPackage_1000Text(view);
		case MomentIntervalEditPart.VISUAL_ID:
			return getMomentInterval_2001Text(view);
		case MIDetailEditPart.VISUAL_ID:
			return getMIDetail_2002Text(view);
		case RoleEditPart.VISUAL_ID:
			return getRole_2003Text(view);
		case PartyEditPart.VISUAL_ID:
			return getParty_2004Text(view);
		case PlaceEditPart.VISUAL_ID:
			return getPlace_2005Text(view);
		case ThingEditPart.VISUAL_ID:
			return getThing_2006Text(view);
		case DescriptionEditPart.VISUAL_ID:
			return getDescription_2007Text(view);
		case PluginPointEditPart.VISUAL_ID:
			return getPluginPoint_2008Text(view);
		case Package2EditPart.VISUAL_ID:
			return getPackage_2009Text(view);
		case AnnotationEditPart.VISUAL_ID:
			return getAnnotation_2010Text(view);
		case AttributeEditPart.VISUAL_ID:
			return getAttribute_3001Text(view);
		case OperationEditPart.VISUAL_ID:
			return getOperation_3002Text(view);
		case Package3EditPart.VISUAL_ID:
			return getPackage_3003Text(view);
		case AssociationEditPart.VISUAL_ID:
			return getAssociation_4001Text(view);
		case ClassSuperclassesEditPart.VISUAL_ID:
			return getClassSuperclasses_4002Text(view);
		case Association2EditPart.VISUAL_ID:
			return getAssociation_4003Text(view);
		case AnnotatedElementAnnotationsEditPart.VISUAL_ID:
			return getAnnotatedElementAnnotations_4004Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getPackage_1000Text(View view) {
		Package domainModelElement = (Package) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			DncDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMomentInterval_2001Text(View view) {
		IAdaptable hintAdapter = new DncParserProvider.HintAdapter(
				DncElementTypes.MomentInterval_2001,
				(view.getElement() != null ? view.getElement() : view),
				DncVisualIDRegistry
						.getType(MomentIntervalNameEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			DncDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getMIDetail_2002Text(View view) {
		IAdaptable hintAdapter = new DncParserProvider.HintAdapter(
				DncElementTypes.MIDetail_2002,
				(view.getElement() != null ? view.getElement() : view),
				DncVisualIDRegistry.getType(MIDetailNameEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			DncDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getRole_2003Text(View view) {
		IAdaptable hintAdapter = new DncParserProvider.HintAdapter(
				DncElementTypes.Role_2003, (view.getElement() != null ? view
						.getElement() : view), DncVisualIDRegistry
						.getType(RoleNameEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			DncDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getParty_2004Text(View view) {
		IAdaptable hintAdapter = new DncParserProvider.HintAdapter(
				DncElementTypes.Party_2004, (view.getElement() != null ? view
						.getElement() : view), DncVisualIDRegistry
						.getType(PartyNameEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			DncDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getPlace_2005Text(View view) {
		IAdaptable hintAdapter = new DncParserProvider.HintAdapter(
				DncElementTypes.Place_2005, (view.getElement() != null ? view
						.getElement() : view), DncVisualIDRegistry
						.getType(PlaceNameEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			DncDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getThing_2006Text(View view) {
		IAdaptable hintAdapter = new DncParserProvider.HintAdapter(
				DncElementTypes.Thing_2006, (view.getElement() != null ? view
						.getElement() : view), DncVisualIDRegistry
						.getType(ThingNameEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			DncDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5011); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getDescription_2007Text(View view) {
		IAdaptable hintAdapter = new DncParserProvider.HintAdapter(
				DncElementTypes.Description_2007,
				(view.getElement() != null ? view.getElement() : view),
				DncVisualIDRegistry.getType(DescriptionNameEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			DncDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5013); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getPluginPoint_2008Text(View view) {
		IAdaptable hintAdapter = new DncParserProvider.HintAdapter(
				DncElementTypes.PluginPoint_2008,
				(view.getElement() != null ? view.getElement() : view),
				DncVisualIDRegistry.getType(PluginPointNameEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			DncDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5015); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getPackage_2009Text(View view) {
		IAdaptable hintAdapter = new DncParserProvider.HintAdapter(
				DncElementTypes.Package_2009, (view.getElement() != null ? view
						.getElement() : view), DncVisualIDRegistry
						.getType(PackageNameEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			DncDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5017); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getAnnotation_2010Text(View view) {
		IAdaptable hintAdapter = new DncParserProvider.HintAdapter(
				DncElementTypes.Annotation_2010,
				(view.getElement() != null ? view.getElement() : view),
				DncVisualIDRegistry
						.getType(AnnotationKeyValueEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			DncDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5019); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getAttribute_3001Text(View view) {
		IAdaptable hintAdapter = new DncParserProvider.HintAdapter(
				DncElementTypes.Attribute_3001,
				(view.getElement() != null ? view.getElement() : view),
				DncVisualIDRegistry.getType(AttributeEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			DncDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 3001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getOperation_3002Text(View view) {
		IAdaptable hintAdapter = new DncParserProvider.HintAdapter(
				DncElementTypes.Operation_3002,
				(view.getElement() != null ? view.getElement() : view),
				DncVisualIDRegistry.getType(OperationEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			DncDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 3002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPackage_3003Text(View view) {
		IAdaptable hintAdapter = new DncParserProvider.HintAdapter(
				DncElementTypes.Package_3003, (view.getElement() != null ? view
						.getElement() : view), DncVisualIDRegistry
						.getType(Package3EditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			DncDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 3003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAssociation_4001Text(View view) {
		IAdaptable hintAdapter = new DncParserProvider.HintAdapter(
				DncElementTypes.Association_4001,
				(view.getElement() != null ? view.getElement() : view),
				DncVisualIDRegistry
						.getType(AssociationLowerBoundUpperBoundEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			DncDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getClassSuperclasses_4002Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getAssociation_4003Text(View view) {
		IAdaptable hintAdapter = new DncParserProvider.HintAdapter(
				DncElementTypes.Association_4003,
				(view.getElement() != null ? view.getElement() : view),
				DncVisualIDRegistry
						.getType(AssociationLowerBoundUpperBound2EditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			DncDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getAnnotatedElementAnnotations_4004Text(View view) {
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
		return PackageEditPart.MODEL_ID.equals(DncVisualIDRegistry
				.getModelID(view));
	}

}
