package org.eclipse.amalgam.examples.scenario.diagram.providers;

import org.eclipse.amalgam.examples.scenario.ScenarioPackage;
import org.eclipse.amalgam.examples.scenario.diagram.edit.parts.DataObjectNameEditPart;
import org.eclipse.amalgam.examples.scenario.diagram.edit.parts.EventNameEditPart;
import org.eclipse.amalgam.examples.scenario.diagram.edit.parts.MessageFlowNameEditPart;
import org.eclipse.amalgam.examples.scenario.diagram.edit.parts.ProcessNameEditPart;
import org.eclipse.amalgam.examples.scenario.diagram.edit.parts.SequenceFlowName2EditPart;
import org.eclipse.amalgam.examples.scenario.diagram.edit.parts.SequenceFlowNameEditPart;
import org.eclipse.amalgam.examples.scenario.diagram.edit.parts.TaskNameEditPart;
import org.eclipse.amalgam.examples.scenario.diagram.parsers.MessageFormatParser;
import org.eclipse.amalgam.examples.scenario.diagram.part.ScenarioVisualIDRegistry;
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
public class ScenarioParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser dataObjectName_5001Parser;

	/**
	 * @generated
	 */
	private IParser getDataObjectName_5001Parser() {
		if (dataObjectName_5001Parser == null) {
			dataObjectName_5001Parser = createDataObjectName_5001Parser();
		}
		return dataObjectName_5001Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createDataObjectName_5001Parser() {
		EAttribute[] features = new EAttribute[] { ScenarioPackage.eINSTANCE
				.getElement_Name(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser taskName_5002Parser;

	/**
	 * @generated
	 */
	private IParser getTaskName_5002Parser() {
		if (taskName_5002Parser == null) {
			taskName_5002Parser = createTaskName_5002Parser();
		}
		return taskName_5002Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createTaskName_5002Parser() {
		EAttribute[] features = new EAttribute[] { ScenarioPackage.eINSTANCE
				.getElement_Name(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser eventName_5003Parser;

	/**
	 * @generated
	 */
	private IParser getEventName_5003Parser() {
		if (eventName_5003Parser == null) {
			eventName_5003Parser = createEventName_5003Parser();
		}
		return eventName_5003Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createEventName_5003Parser() {
		EAttribute[] features = new EAttribute[] { ScenarioPackage.eINSTANCE
				.getElement_Name(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser processName_5004Parser;

	/**
	 * @generated
	 */
	private IParser getProcessName_5004Parser() {
		if (processName_5004Parser == null) {
			processName_5004Parser = createProcessName_5004Parser();
		}
		return processName_5004Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createProcessName_5004Parser() {
		EAttribute[] features = new EAttribute[] { ScenarioPackage.eINSTANCE
				.getElement_Name(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser sequenceFlowName_6001Parser;

	/**
	 * @generated
	 */
	private IParser getSequenceFlowName_6001Parser() {
		if (sequenceFlowName_6001Parser == null) {
			sequenceFlowName_6001Parser = createSequenceFlowName_6001Parser();
		}
		return sequenceFlowName_6001Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createSequenceFlowName_6001Parser() {
		EAttribute[] features = new EAttribute[] { ScenarioPackage.eINSTANCE
				.getElement_Name(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser messageFlowName_6002Parser;

	/**
	 * @generated
	 */
	private IParser getMessageFlowName_6002Parser() {
		if (messageFlowName_6002Parser == null) {
			messageFlowName_6002Parser = createMessageFlowName_6002Parser();
		}
		return messageFlowName_6002Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createMessageFlowName_6002Parser() {
		EAttribute[] features = new EAttribute[] { ScenarioPackage.eINSTANCE
				.getElement_Name(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser sequenceFlowName_6003Parser;

	/**
	 * @generated
	 */
	private IParser getSequenceFlowName_6003Parser() {
		if (sequenceFlowName_6003Parser == null) {
			sequenceFlowName_6003Parser = createSequenceFlowName_6003Parser();
		}
		return sequenceFlowName_6003Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createSequenceFlowName_6003Parser() {
		EAttribute[] features = new EAttribute[] { ScenarioPackage.eINSTANCE
				.getElement_Name(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case DataObjectNameEditPart.VISUAL_ID:
			return getDataObjectName_5001Parser();
		case TaskNameEditPart.VISUAL_ID:
			return getTaskName_5002Parser();
		case EventNameEditPart.VISUAL_ID:
			return getEventName_5003Parser();
		case ProcessNameEditPart.VISUAL_ID:
			return getProcessName_5004Parser();
		case SequenceFlowNameEditPart.VISUAL_ID:
			return getSequenceFlowName_6001Parser();
		case MessageFlowNameEditPart.VISUAL_ID:
			return getMessageFlowName_6002Parser();
		case SequenceFlowName2EditPart.VISUAL_ID:
			return getSequenceFlowName_6003Parser();
		}
		return null;
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(ScenarioVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(ScenarioVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (ScenarioElementTypes.getElement(hint) == null) {
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
