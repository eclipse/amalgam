package org.eclipse.amalgam.examples.requirements.diagram.part;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.amalgam.examples.requirements.diagram.providers.RequirementsElementTypes;
import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;

/**
 * @generated
 */
public class RequirementsPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createNodes1Group());
		paletteRoot.add(createLinks2Group());
	}

	/**
	 * Creates "Nodes" palette tool group
	 * @generated
	 */
	private PaletteContainer createNodes1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.Nodes1Group_title);
		paletteContainer.add(createRequirement1CreationTool());
		paletteContainer.add(createGroup2CreationTool());
		paletteContainer.add(createScenario3CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Links" palette tool group
	 * @generated
	 */
	private PaletteContainer createLinks2Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.Links2Group_title);
		paletteContainer.add(createChildRequirement1CreationTool());
		paletteContainer.add(createGroupRequirement2CreationTool());
		paletteContainer.add(createDependency3CreationTool());
		paletteContainer.add(createChildGroup4CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRequirement1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(RequirementsElementTypes.Requirement_2002);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Requirement1CreationTool_title,
				Messages.Requirement1CreationTool_desc, types);
		entry.setSmallIcon(RequirementsElementTypes
				.getImageDescriptor(RequirementsElementTypes.Requirement_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createGroup2CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(RequirementsElementTypes.RequirementGroup_2001);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Group2CreationTool_title,
				Messages.Group2CreationTool_desc, types);
		entry
				.setSmallIcon(RequirementsElementTypes
						.getImageDescriptor(RequirementsElementTypes.RequirementGroup_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createScenario3CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(RequirementsElementTypes.Process_3001);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Scenario3CreationTool_title,
				Messages.Scenario3CreationTool_desc, types);
		entry.setSmallIcon(RequirementsElementTypes
				.getImageDescriptor(RequirementsElementTypes.Process_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createChildRequirement1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(RequirementsElementTypes.RequirementChildren_4002);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.ChildRequirement1CreationTool_title,
				Messages.ChildRequirement1CreationTool_desc, types);
		entry
				.setSmallIcon(RequirementsDiagramEditorPlugin
						.findImageDescriptor("/org.eclipse.amalgam.examples.requirements.model.edit/icons/full/obj16/Association.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createGroupRequirement2CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(RequirementsElementTypes.RequirementGroupRequirements_4001);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.GroupRequirement2CreationTool_title,
				Messages.GroupRequirement2CreationTool_desc, types);
		entry
				.setSmallIcon(RequirementsDiagramEditorPlugin
						.findImageDescriptor("/org.eclipse.amalgam.examples.requirements.model.edit/icons/full/obj16/Association.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDependency3CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(RequirementsElementTypes.RequirementDependencies_4003);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Dependency3CreationTool_title,
				Messages.Dependency3CreationTool_desc, types);
		entry
				.setSmallIcon(RequirementsDiagramEditorPlugin
						.findImageDescriptor("/org.eclipse.amalgam.examples.requirements.model.edit/icons/full/obj16/DependencyLink.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createChildGroup4CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(RequirementsElementTypes.RequirementGroupChildren_4004);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.ChildGroup4CreationTool_title,
				Messages.ChildGroup4CreationTool_desc, types);
		entry
				.setSmallIcon(RequirementsDiagramEditorPlugin
						.findImageDescriptor("/org.eclipse.amalgam.examples.requirements.model.edit/icons/full/obj16/Association.gif")); //$NON-NLS-1$
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
