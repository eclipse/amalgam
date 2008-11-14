package org.eclipse.amalgam.examples.mindmap.diagram.providers;

import org.eclipse.amalgam.examples.mindmap.MindmapPackage;
import org.eclipse.amalgam.examples.mindmap.diagram.edit.parts.RelationshipName2EditPart;
import org.eclipse.amalgam.examples.mindmap.diagram.edit.parts.RelationshipName3EditPart;
import org.eclipse.amalgam.examples.mindmap.diagram.edit.parts.RelationshipNameEditPart;
import org.eclipse.amalgam.examples.mindmap.diagram.edit.parts.RelationshipType2EditPart;
import org.eclipse.amalgam.examples.mindmap.diagram.edit.parts.RelationshipType3EditPart;
import org.eclipse.amalgam.examples.mindmap.diagram.edit.parts.RelationshipTypeEditPart;
import org.eclipse.amalgam.examples.mindmap.diagram.edit.parts.TopicName2EditPart;
import org.eclipse.amalgam.examples.mindmap.diagram.edit.parts.TopicNameEditPart;
import org.eclipse.amalgam.examples.mindmap.diagram.parsers.MessageFormatParser;
import org.eclipse.amalgam.examples.mindmap.diagram.part.MindmapVisualIDRegistry;
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
public class MindmapParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser topicName_5001Parser;

	/**
	 * @generated
	 */
	private IParser getTopicName_5001Parser() {
		if (topicName_5001Parser == null) {
			topicName_5001Parser = createTopicName_5001Parser();
		}
		return topicName_5001Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createTopicName_5001Parser() {
		EAttribute[] features = new EAttribute[] { MindmapPackage.eINSTANCE
				.getMapElement_Name(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser topicName_5002Parser;

	/**
	 * @generated
	 */
	private IParser getTopicName_5002Parser() {
		if (topicName_5002Parser == null) {
			topicName_5002Parser = createTopicName_5002Parser();
		}
		return topicName_5002Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createTopicName_5002Parser() {
		EAttribute[] features = new EAttribute[] { MindmapPackage.eINSTANCE
				.getMapElement_Name(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser relationshipName_6001Parser;

	/**
	 * @generated
	 */
	private IParser getRelationshipName_6001Parser() {
		if (relationshipName_6001Parser == null) {
			relationshipName_6001Parser = createRelationshipName_6001Parser();
		}
		return relationshipName_6001Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createRelationshipName_6001Parser() {
		EAttribute[] features = new EAttribute[] { MindmapPackage.eINSTANCE
				.getMapElement_Name(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser relationshipType_6002Parser;

	/**
	 * @generated
	 */
	private IParser getRelationshipType_6002Parser() {
		if (relationshipType_6002Parser == null) {
			relationshipType_6002Parser = createRelationshipType_6002Parser();
		}
		return relationshipType_6002Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createRelationshipType_6002Parser() {
		EAttribute[] features = new EAttribute[] { MindmapPackage.eINSTANCE
				.getRelationship_Type(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		parser.setViewPattern("Ç{0}È");
		parser.setEditorPattern("Ç{0}È");
		parser.setEditPattern("Ç{0}È");
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser relationshipName_6003Parser;

	/**
	 * @generated
	 */
	private IParser getRelationshipName_6003Parser() {
		if (relationshipName_6003Parser == null) {
			relationshipName_6003Parser = createRelationshipName_6003Parser();
		}
		return relationshipName_6003Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createRelationshipName_6003Parser() {
		EAttribute[] features = new EAttribute[] { MindmapPackage.eINSTANCE
				.getMapElement_Name(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser relationshipType_6004Parser;

	/**
	 * @generated
	 */
	private IParser getRelationshipType_6004Parser() {
		if (relationshipType_6004Parser == null) {
			relationshipType_6004Parser = createRelationshipType_6004Parser();
		}
		return relationshipType_6004Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createRelationshipType_6004Parser() {
		EAttribute[] features = new EAttribute[] { MindmapPackage.eINSTANCE
				.getRelationship_Type(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		parser.setViewPattern("Ç{0}È");
		parser.setEditorPattern("Ç{0}È");
		parser.setEditPattern("Ç{0}È");
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser relationshipName_6005Parser;

	/**
	 * @generated
	 */
	private IParser getRelationshipName_6005Parser() {
		if (relationshipName_6005Parser == null) {
			relationshipName_6005Parser = createRelationshipName_6005Parser();
		}
		return relationshipName_6005Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createRelationshipName_6005Parser() {
		EAttribute[] features = new EAttribute[] { MindmapPackage.eINSTANCE
				.getMapElement_Name(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser relationshipType_6006Parser;

	/**
	 * @generated
	 */
	private IParser getRelationshipType_6006Parser() {
		if (relationshipType_6006Parser == null) {
			relationshipType_6006Parser = createRelationshipType_6006Parser();
		}
		return relationshipType_6006Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createRelationshipType_6006Parser() {
		EAttribute[] features = new EAttribute[] { MindmapPackage.eINSTANCE
				.getRelationship_Type(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		parser.setViewPattern("Ç{0}È");
		parser.setEditorPattern("Ç{0}È");
		parser.setEditPattern("Ç{0}È");
		return parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case TopicNameEditPart.VISUAL_ID:
			return getTopicName_5001Parser();
		case TopicName2EditPart.VISUAL_ID:
			return getTopicName_5002Parser();
		case RelationshipNameEditPart.VISUAL_ID:
			return getRelationshipName_6001Parser();
		case RelationshipTypeEditPart.VISUAL_ID:
			return getRelationshipType_6002Parser();
		case RelationshipName2EditPart.VISUAL_ID:
			return getRelationshipName_6003Parser();
		case RelationshipType2EditPart.VISUAL_ID:
			return getRelationshipType_6004Parser();
		case RelationshipName3EditPart.VISUAL_ID:
			return getRelationshipName_6005Parser();
		case RelationshipType3EditPart.VISUAL_ID:
			return getRelationshipType_6006Parser();
		}
		return null;
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(MindmapVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(MindmapVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (MindmapElementTypes.getElement(hint) == null) {
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
