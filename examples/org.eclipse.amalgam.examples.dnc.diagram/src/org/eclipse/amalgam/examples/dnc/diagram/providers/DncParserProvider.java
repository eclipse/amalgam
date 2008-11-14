package org.eclipse.amalgam.examples.dnc.diagram.providers;

import org.eclipse.amalgam.examples.dnc.DncPackage;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.AnnotationKeyEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.AnnotationKeyValueEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.AssociationLowerBoundUpperBound2EditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.AssociationLowerBoundUpperBoundEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.AttributeEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.DescriptionDescriptionEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.DescriptionNameEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.MIDetailDescriptionEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.MIDetailNameEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.MomentIntervalDescriptionEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.MomentIntervalNameEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.OperationEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.Package3EditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.PackageName2EditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.PackageNameEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.PartyDescriptionEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.PartyNameEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.PlaceDescriptionEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.PlaceNameEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.PluginPointDescriptionEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.PluginPointNameEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.RoleDescriptionEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.RoleNameEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.ThingDescriptionEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.ThingNameEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.parsers.MessageFormatParser;
import org.eclipse.amalgam.examples.dnc.diagram.part.DncVisualIDRegistry;
import org.eclipse.amalgam.examples.oocore.OocorePackage;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class DncParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser momentIntervalName_5001Parser;

	/**
	 * @generated
	 */
	private IParser getMomentIntervalName_5001Parser() {
		if (momentIntervalName_5001Parser == null) {
			momentIntervalName_5001Parser = createMomentIntervalName_5001Parser();
		}
		return momentIntervalName_5001Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createMomentIntervalName_5001Parser() {
		EAttribute[] features = new EAttribute[] { OocorePackage.eINSTANCE
				.getNamedElement_Name(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser momentIntervalDescription_5002Parser;

	/**
	 * @generated
	 */
	private IParser getMomentIntervalDescription_5002Parser() {
		if (momentIntervalDescription_5002Parser == null) {
			momentIntervalDescription_5002Parser = createMomentIntervalDescription_5002Parser();
		}
		return momentIntervalDescription_5002Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createMomentIntervalDescription_5002Parser() {
		EAttribute[] features = new EAttribute[] { DncPackage.eINSTANCE
				.getArchetype_Description(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		parser.setViewPattern("«moment-interval»");
		parser.setEditorPattern("«moment-interval»");
		parser.setEditPattern("«moment-interval»");
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser mIDetailName_5003Parser;

	/**
	 * @generated
	 */
	private IParser getMIDetailName_5003Parser() {
		if (mIDetailName_5003Parser == null) {
			mIDetailName_5003Parser = createMIDetailName_5003Parser();
		}
		return mIDetailName_5003Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createMIDetailName_5003Parser() {
		EAttribute[] features = new EAttribute[] { OocorePackage.eINSTANCE
				.getNamedElement_Name(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser mIDetailDescription_5004Parser;

	/**
	 * @generated
	 */
	private IParser getMIDetailDescription_5004Parser() {
		if (mIDetailDescription_5004Parser == null) {
			mIDetailDescription_5004Parser = createMIDetailDescription_5004Parser();
		}
		return mIDetailDescription_5004Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createMIDetailDescription_5004Parser() {
		EAttribute[] features = new EAttribute[] { DncPackage.eINSTANCE
				.getArchetype_Description(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		parser.setViewPattern("«mi-detail»");
		parser.setEditorPattern("«mi-detail»");
		parser.setEditPattern("«mi-detail»");
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser roleName_5005Parser;

	/**
	 * @generated
	 */
	private IParser getRoleName_5005Parser() {
		if (roleName_5005Parser == null) {
			roleName_5005Parser = createRoleName_5005Parser();
		}
		return roleName_5005Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createRoleName_5005Parser() {
		EAttribute[] features = new EAttribute[] { OocorePackage.eINSTANCE
				.getNamedElement_Name(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser roleDescription_5006Parser;

	/**
	 * @generated
	 */
	private IParser getRoleDescription_5006Parser() {
		if (roleDescription_5006Parser == null) {
			roleDescription_5006Parser = createRoleDescription_5006Parser();
		}
		return roleDescription_5006Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createRoleDescription_5006Parser() {
		EAttribute[] features = new EAttribute[] { DncPackage.eINSTANCE
				.getArchetype_Description(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		parser.setViewPattern("«role»");
		parser.setEditorPattern("«role»");
		parser.setEditPattern("«role»");
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser partyName_5007Parser;

	/**
	 * @generated
	 */
	private IParser getPartyName_5007Parser() {
		if (partyName_5007Parser == null) {
			partyName_5007Parser = createPartyName_5007Parser();
		}
		return partyName_5007Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createPartyName_5007Parser() {
		EAttribute[] features = new EAttribute[] { OocorePackage.eINSTANCE
				.getNamedElement_Name(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser partyDescription_5008Parser;

	/**
	 * @generated
	 */
	private IParser getPartyDescription_5008Parser() {
		if (partyDescription_5008Parser == null) {
			partyDescription_5008Parser = createPartyDescription_5008Parser();
		}
		return partyDescription_5008Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createPartyDescription_5008Parser() {
		EAttribute[] features = new EAttribute[] { DncPackage.eINSTANCE
				.getArchetype_Description(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		parser.setViewPattern("«party»");
		parser.setEditorPattern("«party»");
		parser.setEditPattern("«party»");
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser placeName_5009Parser;

	/**
	 * @generated
	 */
	private IParser getPlaceName_5009Parser() {
		if (placeName_5009Parser == null) {
			placeName_5009Parser = createPlaceName_5009Parser();
		}
		return placeName_5009Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createPlaceName_5009Parser() {
		EAttribute[] features = new EAttribute[] { OocorePackage.eINSTANCE
				.getNamedElement_Name(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser placeDescription_5010Parser;

	/**
	 * @generated
	 */
	private IParser getPlaceDescription_5010Parser() {
		if (placeDescription_5010Parser == null) {
			placeDescription_5010Parser = createPlaceDescription_5010Parser();
		}
		return placeDescription_5010Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createPlaceDescription_5010Parser() {
		EAttribute[] features = new EAttribute[] { DncPackage.eINSTANCE
				.getArchetype_Description(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		parser.setViewPattern("«place»");
		parser.setEditorPattern("«place»");
		parser.setEditPattern("«place»");
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser thingName_5011Parser;

	/**
	 * @generated
	 */
	private IParser getThingName_5011Parser() {
		if (thingName_5011Parser == null) {
			thingName_5011Parser = createThingName_5011Parser();
		}
		return thingName_5011Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createThingName_5011Parser() {
		EAttribute[] features = new EAttribute[] { OocorePackage.eINSTANCE
				.getNamedElement_Name(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser thingDescription_5012Parser;

	/**
	 * @generated
	 */
	private IParser getThingDescription_5012Parser() {
		if (thingDescription_5012Parser == null) {
			thingDescription_5012Parser = createThingDescription_5012Parser();
		}
		return thingDescription_5012Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createThingDescription_5012Parser() {
		EAttribute[] features = new EAttribute[] { DncPackage.eINSTANCE
				.getArchetype_Description(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		parser.setViewPattern("«thing»");
		parser.setEditorPattern("«thing»");
		parser.setEditPattern("«thing»");
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser descriptionName_5013Parser;

	/**
	 * @generated
	 */
	private IParser getDescriptionName_5013Parser() {
		if (descriptionName_5013Parser == null) {
			descriptionName_5013Parser = createDescriptionName_5013Parser();
		}
		return descriptionName_5013Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createDescriptionName_5013Parser() {
		EAttribute[] features = new EAttribute[] { OocorePackage.eINSTANCE
				.getNamedElement_Name(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser descriptionDescription_5014Parser;

	/**
	 * @generated
	 */
	private IParser getDescriptionDescription_5014Parser() {
		if (descriptionDescription_5014Parser == null) {
			descriptionDescription_5014Parser = createDescriptionDescription_5014Parser();
		}
		return descriptionDescription_5014Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createDescriptionDescription_5014Parser() {
		EAttribute[] features = new EAttribute[] { DncPackage.eINSTANCE
				.getArchetype_Description(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		parser.setViewPattern("«description»");
		parser.setEditorPattern("«description»");
		parser.setEditPattern("«description»");
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser pluginPointName_5015Parser;

	/**
	 * @generated
	 */
	private IParser getPluginPointName_5015Parser() {
		if (pluginPointName_5015Parser == null) {
			pluginPointName_5015Parser = createPluginPointName_5015Parser();
		}
		return pluginPointName_5015Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createPluginPointName_5015Parser() {
		EAttribute[] features = new EAttribute[] { OocorePackage.eINSTANCE
				.getNamedElement_Name(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser pluginPointDescription_5016Parser;

	/**
	 * @generated
	 */
	private IParser getPluginPointDescription_5016Parser() {
		if (pluginPointDescription_5016Parser == null) {
			pluginPointDescription_5016Parser = createPluginPointDescription_5016Parser();
		}
		return pluginPointDescription_5016Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createPluginPointDescription_5016Parser() {
		EAttribute[] features = new EAttribute[] { DncPackage.eINSTANCE
				.getArchetype_Description(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		parser.setViewPattern("«plugin-point»");
		parser.setEditorPattern("«plugin-point»");
		parser.setEditPattern("«plugin-point»");
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser packageName_5017Parser;

	/**
	 * @generated
	 */
	private IParser getPackageName_5017Parser() {
		if (packageName_5017Parser == null) {
			packageName_5017Parser = createPackageName_5017Parser();
		}
		return packageName_5017Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createPackageName_5017Parser() {
		EAttribute[] features = new EAttribute[] { OocorePackage.eINSTANCE
				.getNamedElement_Name(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser packageName_5018Parser;

	/**
	 * @generated
	 */
	private IParser getPackageName_5018Parser() {
		if (packageName_5018Parser == null) {
			packageName_5018Parser = createPackageName_5018Parser();
		}
		return packageName_5018Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createPackageName_5018Parser() {
		EAttribute[] features = new EAttribute[] { OocorePackage.eINSTANCE
				.getNamedElement_Name(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		parser.setViewPattern("«package»");
		parser.setEditorPattern("«package»");
		parser.setEditPattern("«package»");
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser annotationKeyValue_5019Parser;

	/**
	 * @generated
	 */
	private IParser getAnnotationKeyValue_5019Parser() {
		if (annotationKeyValue_5019Parser == null) {
			annotationKeyValue_5019Parser = createAnnotationKeyValue_5019Parser();
		}
		return annotationKeyValue_5019Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createAnnotationKeyValue_5019Parser() {
		EAttribute[] features = new EAttribute[] {
				OocorePackage.eINSTANCE.getAnnotation_Key(),
				OocorePackage.eINSTANCE.getAnnotation_Value(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		parser.setViewPattern("{0} = {1}");
		parser.setEditorPattern("{0} = {1}");
		parser.setEditPattern("{0} = {1}");
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser annotationKey_5020Parser;

	/**
	 * @generated
	 */
	private IParser getAnnotationKey_5020Parser() {
		if (annotationKey_5020Parser == null) {
			annotationKey_5020Parser = createAnnotationKey_5020Parser();
		}
		return annotationKey_5020Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createAnnotationKey_5020Parser() {
		EAttribute[] features = new EAttribute[] { OocorePackage.eINSTANCE
				.getAnnotation_Key(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		parser.setViewPattern("«annotation»");
		parser.setEditorPattern("«annotation»");
		parser.setEditPattern("«annotation»");
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser attribute_3001Parser;

	/**
	 * @generated
	 */
	private IParser getAttribute_3001Parser() {
		if (attribute_3001Parser == null) {
			attribute_3001Parser = createAttribute_3001Parser();
		}
		return attribute_3001Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createAttribute_3001Parser() {
		EAttribute[] features = new EAttribute[] { OocorePackage.eINSTANCE
				.getNamedElement_Name(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser operation_3002Parser;

	/**
	 * @generated
	 */
	private IParser getOperation_3002Parser() {
		if (operation_3002Parser == null) {
			operation_3002Parser = createOperation_3002Parser();
		}
		return operation_3002Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createOperation_3002Parser() {
		EAttribute[] features = new EAttribute[] { OocorePackage.eINSTANCE
				.getNamedElement_Name(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		parser.setViewPattern("{0}()");
		parser.setEditorPattern("{0}");
		parser.setEditPattern("{0}");
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser package_3003Parser;

	/**
	 * @generated
	 */
	private IParser getPackage_3003Parser() {
		if (package_3003Parser == null) {
			package_3003Parser = createPackage_3003Parser();
		}
		return package_3003Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createPackage_3003Parser() {
		EAttribute[] features = new EAttribute[] { OocorePackage.eINSTANCE
				.getNamedElement_Name(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser associationLowerBoundUpperBound_6001Parser;

	/**
	 * @generated
	 */
	private IParser getAssociationLowerBoundUpperBound_6001Parser() {
		if (associationLowerBoundUpperBound_6001Parser == null) {
			associationLowerBoundUpperBound_6001Parser = createAssociationLowerBoundUpperBound_6001Parser();
		}
		return associationLowerBoundUpperBound_6001Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createAssociationLowerBoundUpperBound_6001Parser() {
		EAttribute[] features = new EAttribute[] {
				OocorePackage.eINSTANCE.getTypedElement_LowerBound(),
				OocorePackage.eINSTANCE.getTypedElement_UpperBound(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		parser.setViewPattern("{0}..{1}");
		parser.setEditorPattern("{0}..{1}");
		parser.setEditPattern("{0}..{1}");
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser associationLowerBoundUpperBound_6002Parser;

	/**
	 * @generated
	 */
	private IParser getAssociationLowerBoundUpperBound_6002Parser() {
		if (associationLowerBoundUpperBound_6002Parser == null) {
			associationLowerBoundUpperBound_6002Parser = createAssociationLowerBoundUpperBound_6002Parser();
		}
		return associationLowerBoundUpperBound_6002Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createAssociationLowerBoundUpperBound_6002Parser() {
		EAttribute[] features = new EAttribute[] {
				OocorePackage.eINSTANCE.getTypedElement_LowerBound(),
				OocorePackage.eINSTANCE.getTypedElement_UpperBound(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		parser.setViewPattern("{0}..{1}");
		parser.setEditorPattern("{0}..{1}");
		parser.setEditPattern("{0}..{1}");
		return parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case MomentIntervalNameEditPart.VISUAL_ID:
			return getMomentIntervalName_5001Parser();
		case MomentIntervalDescriptionEditPart.VISUAL_ID:
			return getMomentIntervalDescription_5002Parser();
		case MIDetailNameEditPart.VISUAL_ID:
			return getMIDetailName_5003Parser();
		case MIDetailDescriptionEditPart.VISUAL_ID:
			return getMIDetailDescription_5004Parser();
		case RoleNameEditPart.VISUAL_ID:
			return getRoleName_5005Parser();
		case RoleDescriptionEditPart.VISUAL_ID:
			return getRoleDescription_5006Parser();
		case PartyNameEditPart.VISUAL_ID:
			return getPartyName_5007Parser();
		case PartyDescriptionEditPart.VISUAL_ID:
			return getPartyDescription_5008Parser();
		case PlaceNameEditPart.VISUAL_ID:
			return getPlaceName_5009Parser();
		case PlaceDescriptionEditPart.VISUAL_ID:
			return getPlaceDescription_5010Parser();
		case ThingNameEditPart.VISUAL_ID:
			return getThingName_5011Parser();
		case ThingDescriptionEditPart.VISUAL_ID:
			return getThingDescription_5012Parser();
		case DescriptionNameEditPart.VISUAL_ID:
			return getDescriptionName_5013Parser();
		case DescriptionDescriptionEditPart.VISUAL_ID:
			return getDescriptionDescription_5014Parser();
		case PluginPointNameEditPart.VISUAL_ID:
			return getPluginPointName_5015Parser();
		case PluginPointDescriptionEditPart.VISUAL_ID:
			return getPluginPointDescription_5016Parser();
		case PackageNameEditPart.VISUAL_ID:
			return getPackageName_5017Parser();
		case PackageName2EditPart.VISUAL_ID:
			return getPackageName_5018Parser();
		case AnnotationKeyValueEditPart.VISUAL_ID:
			return getAnnotationKeyValue_5019Parser();
		case AnnotationKeyEditPart.VISUAL_ID:
			return getAnnotationKey_5020Parser();
		case AttributeEditPart.VISUAL_ID:
			return getAttribute_3001Parser();
		case OperationEditPart.VISUAL_ID:
			return getOperation_3002Parser();
		case Package3EditPart.VISUAL_ID:
			return getPackage_3003Parser();
		case AssociationLowerBoundUpperBoundEditPart.VISUAL_ID:
			return getAssociationLowerBoundUpperBound_6001Parser();
		case AssociationLowerBoundUpperBound2EditPart.VISUAL_ID:
			return getAssociationLowerBoundUpperBound_6002Parser();
		}
		return null;
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(DncVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(DncVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (DncElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
