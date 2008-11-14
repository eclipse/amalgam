package org.eclipse.amalgam.examples.mindmap.diagram.part;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.amalgam.examples.mindmap.diagram.providers.MindmapElementTypes;
import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.PaletteSeparator;
import org.eclipse.gef.palette.PaletteStack;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;

/**
 * @generated
 */
public class MindmapPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createDefault1Group());
		paletteRoot.add(createNodes2Group());
		paletteRoot.add(createLinks3Group());
	}

	/**
	 * Creates "Default" palette tool group
	 * @generated
	 */
	private PaletteContainer createDefault1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.Default1Group_title);
		paletteContainer.setDescription(Messages.Default1Group_desc);
		paletteContainer.add(new PaletteSeparator());
		return paletteContainer;
	}

	/**
	 * Creates "Nodes" palette tool group
	 * @generated
	 */
	private PaletteContainer createNodes2Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.Nodes2Group_title);
		paletteContainer.add(createTopic1CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Links" palette tool group
	 * @generated
	 */
	private PaletteContainer createLinks3Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.Links3Group_title);
		paletteContainer.add(createSubtopic1CreationTool());
		paletteContainer.add(createRelationships2Group());
		return paletteContainer;
	}

	/**
	 * Creates "Relationships" palette tool group
	 * @generated
	 */
	private PaletteContainer createRelationships2Group() {
		PaletteStack paletteContainer = new PaletteStack(
				Messages.Relationships2Group_title, null, null);
		paletteContainer.setDescription(Messages.Relationships2Group_desc);
		paletteContainer.add(createDependency1CreationTool());
		paletteContainer.add(createInclude2CreationTool());
		paletteContainer.add(createExtend3CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTopic1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(MindmapElementTypes.Topic_2001);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Topic1CreationTool_title,
				Messages.Topic1CreationTool_desc, types);
		entry.setSmallIcon(MindmapElementTypes
				.getImageDescriptor(MindmapElementTypes.Topic_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSubtopic1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(MindmapElementTypes.TopicSubtopics_4001);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Subtopic1CreationTool_title,
				Messages.Subtopic1CreationTool_desc, types);
		entry.setSmallIcon(MindmapElementTypes
				.getImageDescriptor(MindmapElementTypes.TopicSubtopics_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDependency1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(MindmapElementTypes.Relationship_4002);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Dependency1CreationTool_title,
				Messages.Dependency1CreationTool_desc, types);
		entry.setSmallIcon(MindmapElementTypes
				.getImageDescriptor(MindmapElementTypes.Relationship_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInclude2CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(MindmapElementTypes.Relationship_4003);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Include2CreationTool_title,
				Messages.Include2CreationTool_desc, types);
		entry.setSmallIcon(MindmapElementTypes
				.getImageDescriptor(MindmapElementTypes.Relationship_4003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createExtend3CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(MindmapElementTypes.Relationship_4004);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Extend3CreationTool_title,
				Messages.Extend3CreationTool_desc, types);
		entry.setSmallIcon(MindmapElementTypes
				.getImageDescriptor(MindmapElementTypes.Relationship_4004));
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
