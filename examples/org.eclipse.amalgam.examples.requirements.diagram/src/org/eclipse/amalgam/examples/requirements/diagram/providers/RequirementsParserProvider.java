package org.eclipse.amalgam.examples.requirements.diagram.providers;

import org.eclipse.amalgam.examples.requirements.RequirementsPackage;
import org.eclipse.amalgam.examples.requirements.diagram.edit.parts.RequirementGroupId2EditPart;
import org.eclipse.amalgam.examples.requirements.diagram.edit.parts.RequirementGroupIdEditPart;
import org.eclipse.amalgam.examples.requirements.diagram.edit.parts.RequirementIdEditPart;
import org.eclipse.amalgam.examples.requirements.diagram.edit.parts.RequirementTypeEditPart;
import org.eclipse.amalgam.examples.requirements.diagram.parsers.MessageFormatParser;
import org.eclipse.amalgam.examples.requirements.diagram.part.RequirementsVisualIDRegistry;
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
public class RequirementsParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser requirementGroupId_5001Parser;

	/**
	 * @generated
	 */
	private IParser getRequirementGroupId_5001Parser() {
		if (requirementGroupId_5001Parser == null) {
			requirementGroupId_5001Parser = createRequirementGroupId_5001Parser();
		}
		return requirementGroupId_5001Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createRequirementGroupId_5001Parser() {
		EAttribute[] features = new EAttribute[] { RequirementsPackage.eINSTANCE
				.getRequirementGroup_Id(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser requirementId_5002Parser;

	/**
	 * @generated
	 */
	private IParser getRequirementId_5002Parser() {
		if (requirementId_5002Parser == null) {
			requirementId_5002Parser = createRequirementId_5002Parser();
		}
		return requirementId_5002Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createRequirementId_5002Parser() {
		EAttribute[] features = new EAttribute[] { RequirementsPackage.eINSTANCE
				.getRequirement_Id(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser requirementType_5003Parser;

	/**
	 * @generated
	 */
	private IParser getRequirementType_5003Parser() {
		if (requirementType_5003Parser == null) {
			requirementType_5003Parser = createRequirementType_5003Parser();
		}
		return requirementType_5003Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createRequirementType_5003Parser() {
		EAttribute[] features = new EAttribute[] { RequirementsPackage.eINSTANCE
				.getRequirement_Type(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		parser.setViewPattern("{0}");
		parser.setEditorPattern("{0}");
		parser.setEditPattern("{0}");
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser requirementGroupId_5004Parser;

	/**
	 * @generated
	 */
	private IParser getRequirementGroupId_5004Parser() {
		if (requirementGroupId_5004Parser == null) {
			requirementGroupId_5004Parser = createRequirementGroupId_5004Parser();
		}
		return requirementGroupId_5004Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createRequirementGroupId_5004Parser() {
		EAttribute[] features = new EAttribute[] { RequirementsPackage.eINSTANCE
				.getRequirementGroup_Id(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case RequirementGroupIdEditPart.VISUAL_ID:
			return getRequirementGroupId_5001Parser();
		case RequirementIdEditPart.VISUAL_ID:
			return getRequirementId_5002Parser();
		case RequirementTypeEditPart.VISUAL_ID:
			return getRequirementType_5003Parser();
		case RequirementGroupId2EditPart.VISUAL_ID:
			return getRequirementGroupId_5004Parser();
		}
		return null;
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(RequirementsVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(RequirementsVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (RequirementsElementTypes.getElement(hint) == null) {
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
