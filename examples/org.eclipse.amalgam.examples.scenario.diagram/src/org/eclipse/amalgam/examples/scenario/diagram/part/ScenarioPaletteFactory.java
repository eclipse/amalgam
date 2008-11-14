package org.eclipse.amalgam.examples.scenario.diagram.part;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.amalgam.examples.scenario.diagram.providers.ScenarioElementTypes;
import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.PaletteStack;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;

/**
 * @generated
 */
public class ScenarioPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createNodes1Group());
		paletteRoot.add(createEvents2Group());
		paletteRoot.add(createLinks3Group());
	}

	/**
	 * Creates "Nodes" palette tool group
	 * @generated
	 */
	private PaletteContainer createNodes1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.Nodes1Group_title);
		paletteContainer.add(createTask1CreationTool());
		paletteContainer.add(createProcess2CreationTool());
		paletteContainer.add(createDataObject3CreationTool());
		paletteContainer.add(createGateways4Group());
		return paletteContainer;
	}

	/**
	 * Creates "Events" palette tool group
	 * @generated
	 */
	private PaletteContainer createEvents2Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.Events2Group_title);
		paletteContainer.add(createStartEvents1Group());
		paletteContainer.add(createIntermediateEvents2Group());
		paletteContainer.add(createEndEvents3Group());
		return paletteContainer;
	}

	/**
	 * Creates "Links" palette tool group
	 * @generated
	 */
	private PaletteContainer createLinks3Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.Links3Group_title);
		paletteContainer.add(createMessage1CreationTool());
		paletteContainer.add(createSequenceFlowLinks2Group());
		paletteContainer.add(createAssociations3Group());
		return paletteContainer;
	}

	/**
	 * Creates "Gateways" palette tool group
	 * @generated
	 */
	private PaletteContainer createGateways4Group() {
		PaletteStack paletteContainer = new PaletteStack(
				Messages.Gateways4Group_title, null, null);
		paletteContainer.add(createExclusive1CreationTool());
		paletteContainer.add(createParallel2CreationTool());
		paletteContainer.setActiveEntry((ToolEntry) paletteContainer
				.getChildren().get(paletteContainer.getChildren().size() - 1));
		paletteContainer.add(createInclusive3CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Start Events" palette tool group
	 * @generated
	 */
	private PaletteContainer createStartEvents1Group() {
		PaletteStack paletteContainer = new PaletteStack(
				Messages.StartEvents1Group_title, null, null);
		paletteContainer.add(createStart1CreationTool());
		paletteContainer.setActiveEntry((ToolEntry) paletteContainer
				.getChildren().get(paletteContainer.getChildren().size() - 1));
		paletteContainer.add(createMessageStart2CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Intermediate Events" palette tool group
	 * @generated
	 */
	private PaletteContainer createIntermediateEvents2Group() {
		PaletteStack paletteContainer = new PaletteStack(
				Messages.IntermediateEvents2Group_title, null, null);
		paletteContainer.add(createIntermediate1CreationTool());
		paletteContainer.setActiveEntry((ToolEntry) paletteContainer
				.getChildren().get(paletteContainer.getChildren().size() - 1));
		paletteContainer.add(createMessageIntermediate2CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "End Events" palette tool group
	 * @generated
	 */
	private PaletteContainer createEndEvents3Group() {
		PaletteStack paletteContainer = new PaletteStack(
				Messages.EndEvents3Group_title, null, null);
		paletteContainer.add(createEnd1CreationTool());
		paletteContainer.setActiveEntry((ToolEntry) paletteContainer
				.getChildren().get(paletteContainer.getChildren().size() - 1));
		paletteContainer.add(createMessageEnd2CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Sequence Flow Links" palette tool group
	 * @generated
	 */
	private PaletteContainer createSequenceFlowLinks2Group() {
		PaletteStack paletteContainer = new PaletteStack(
				Messages.SequenceFlowLinks2Group_title, null, null);
		paletteContainer.add(createSequence1CreationTool());
		paletteContainer.add(createDefaultSequence2CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Associations" palette tool group
	 * @generated
	 */
	private PaletteContainer createAssociations3Group() {
		PaletteStack paletteContainer = new PaletteStack(
				Messages.Associations3Group_title, null, null);
		paletteContainer.add(createAssociation1CreationTool());
		paletteContainer.add(createDirectedAssociation2CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTask1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(ScenarioElementTypes.Task_2004);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Task1CreationTool_title,
				Messages.Task1CreationTool_desc, types);
		entry.setSmallIcon(ScenarioElementTypes
				.getImageDescriptor(ScenarioElementTypes.Task_2004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createProcess2CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(ScenarioElementTypes.Process_2007);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Process2CreationTool_title,
				Messages.Process2CreationTool_desc, types);
		entry.setSmallIcon(ScenarioElementTypes
				.getImageDescriptor(ScenarioElementTypes.Process_2007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDataObject3CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(ScenarioElementTypes.DataObject_2001);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.DataObject3CreationTool_title,
				Messages.DataObject3CreationTool_desc, types);
		entry.setSmallIcon(ScenarioElementTypes
				.getImageDescriptor(ScenarioElementTypes.DataObject_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMessage1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(ScenarioElementTypes.MessageFlow_4003);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Message1CreationTool_title,
				Messages.Message1CreationTool_desc, types);
		entry.setSmallIcon(ScenarioElementTypes
				.getImageDescriptor(ScenarioElementTypes.MessageFlow_4003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createExclusive1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(ScenarioElementTypes.Gateway_2003);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Exclusive1CreationTool_title,
				Messages.Exclusive1CreationTool_desc, types);
		entry.setSmallIcon(ScenarioElementTypes
				.getImageDescriptor(ScenarioElementTypes.Gateway_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createParallel2CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(ScenarioElementTypes.Gateway_2008);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Parallel2CreationTool_title,
				Messages.Parallel2CreationTool_desc, types);
		entry.setSmallIcon(ScenarioElementTypes
				.getImageDescriptor(ScenarioElementTypes.Gateway_2008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInclusive3CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(ScenarioElementTypes.Gateway_2012);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Inclusive3CreationTool_title,
				Messages.Inclusive3CreationTool_desc, types);
		entry.setSmallIcon(ScenarioElementTypes
				.getImageDescriptor(ScenarioElementTypes.Gateway_2012));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createStart1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(ScenarioElementTypes.Event_2002);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Start1CreationTool_title,
				Messages.Start1CreationTool_desc, types);
		entry.setSmallIcon(ScenarioElementTypes
				.getImageDescriptor(ScenarioElementTypes.Event_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMessageStart2CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(ScenarioElementTypes.Event_2009);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.MessageStart2CreationTool_title,
				Messages.MessageStart2CreationTool_desc, types);
		entry.setSmallIcon(ScenarioElementTypes
				.getImageDescriptor(ScenarioElementTypes.Event_2009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createIntermediate1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(2);
		types.add(ScenarioElementTypes.Event_3001);
		types.add(ScenarioElementTypes.Event_2005);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Intermediate1CreationTool_title,
				Messages.Intermediate1CreationTool_desc, types);
		entry.setSmallIcon(ScenarioElementTypes
				.getImageDescriptor(ScenarioElementTypes.Event_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMessageIntermediate2CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(2);
		types.add(ScenarioElementTypes.Event_3002);
		types.add(ScenarioElementTypes.Event_2010);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.MessageIntermediate2CreationTool_title,
				Messages.MessageIntermediate2CreationTool_desc, types);
		entry.setSmallIcon(ScenarioElementTypes
				.getImageDescriptor(ScenarioElementTypes.Event_3002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEnd1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(ScenarioElementTypes.Event_2006);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.End1CreationTool_title,
				Messages.End1CreationTool_desc, types);
		entry.setSmallIcon(ScenarioElementTypes
				.getImageDescriptor(ScenarioElementTypes.Event_2006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMessageEnd2CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(ScenarioElementTypes.Event_2011);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.MessageEnd2CreationTool_title,
				Messages.MessageEnd2CreationTool_desc, types);
		entry.setSmallIcon(ScenarioElementTypes
				.getImageDescriptor(ScenarioElementTypes.Event_2011));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSequence1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(ScenarioElementTypes.SequenceFlow_4002);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Sequence1CreationTool_title,
				Messages.Sequence1CreationTool_desc, types);
		entry.setSmallIcon(ScenarioElementTypes
				.getImageDescriptor(ScenarioElementTypes.SequenceFlow_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDefaultSequence2CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(ScenarioElementTypes.SequenceFlow_4004);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.DefaultSequence2CreationTool_title,
				Messages.DefaultSequence2CreationTool_desc, types);
		entry.setSmallIcon(ScenarioElementTypes
				.getImageDescriptor(ScenarioElementTypes.SequenceFlow_4004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAssociation1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(ScenarioElementTypes.Association_4005);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Association1CreationTool_title,
				Messages.Association1CreationTool_desc, types);
		entry.setSmallIcon(ScenarioElementTypes
				.getImageDescriptor(ScenarioElementTypes.Association_4005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDirectedAssociation2CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(ScenarioElementTypes.Association_4001);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.DirectedAssociation2CreationTool_title,
				Messages.DirectedAssociation2CreationTool_desc, types);
		entry.setSmallIcon(ScenarioElementTypes
				.getImageDescriptor(ScenarioElementTypes.Association_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description,
				List elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description,
				List relationshipTypes) {
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
