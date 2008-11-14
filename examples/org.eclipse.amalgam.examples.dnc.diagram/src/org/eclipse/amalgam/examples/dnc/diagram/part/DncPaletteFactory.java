package org.eclipse.amalgam.examples.dnc.diagram.part;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.amalgam.examples.dnc.diagram.providers.DncElementTypes;
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
public class DncPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createNodes1Group());
		paletteRoot.add(createFeatures2Group());
		paletteRoot.add(createLinks3Group());
		paletteRoot.add(createAnnotations4Group());
	}

	/**
	 * Creates "Nodes" palette tool group
	 * @generated
	 */
	private PaletteContainer createNodes1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.Nodes1Group_title);
		paletteContainer.add(createMomentIntervals1Group());
		paletteContainer.add(createRole2CreationTool());
		paletteContainer.add(createPartyPlaceThing3Group());
		paletteContainer.add(createDescription4CreationTool());
		paletteContainer.add(createPluginPoint5CreationTool());
		paletteContainer.add(createPackage6CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Features" palette tool group
	 * @generated
	 */
	private PaletteContainer createFeatures2Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.Features2Group_title);
		paletteContainer.add(createAttribute1CreationTool());
		paletteContainer.add(createOperation2CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Links" palette tool group
	 * @generated
	 */
	private PaletteContainer createLinks3Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.Links3Group_title);
		paletteContainer.add(createAssociation1CreationTool());
		paletteContainer.add(createAggregation2CreationTool());
		paletteContainer.add(createGeneralization3CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Annotations" palette tool group
	 * @generated
	 */
	private PaletteContainer createAnnotations4Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.Annotations4Group_title);
		paletteContainer.add(createAnnotation1CreationTool());
		paletteContainer.add(createAnnotationLink2CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Moment-Intervals" palette tool group
	 * @generated
	 */
	private PaletteContainer createMomentIntervals1Group() {
		PaletteStack paletteContainer = new PaletteStack(
				Messages.MomentIntervals1Group_title, null, null);
		paletteContainer.add(createMomentInterval1CreationTool());
		paletteContainer.setActiveEntry((ToolEntry) paletteContainer
				.getChildren().get(paletteContainer.getChildren().size() - 1));
		paletteContainer.add(createMIDetail2CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Party, Place, Thing" palette tool group
	 * @generated
	 */
	private PaletteContainer createPartyPlaceThing3Group() {
		PaletteStack paletteContainer = new PaletteStack(
				Messages.PartyPlaceThing3Group_title, null, null);
		paletteContainer.add(createParty1CreationTool());
		paletteContainer.setActiveEntry((ToolEntry) paletteContainer
				.getChildren().get(paletteContainer.getChildren().size() - 1));
		paletteContainer.add(createPlace2CreationTool());
		paletteContainer.add(createThing3CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRole2CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(DncElementTypes.Role_2003);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Role2CreationTool_title,
				Messages.Role2CreationTool_desc, types);
		entry.setSmallIcon(DncElementTypes
				.getImageDescriptor(DncElementTypes.Role_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDescription4CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(DncElementTypes.Description_2007);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Description4CreationTool_title,
				Messages.Description4CreationTool_desc, types);
		entry.setSmallIcon(DncElementTypes
				.getImageDescriptor(DncElementTypes.Description_2007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPluginPoint5CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(DncElementTypes.PluginPoint_2008);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.PluginPoint5CreationTool_title,
				Messages.PluginPoint5CreationTool_desc, types);
		entry.setSmallIcon(DncElementTypes
				.getImageDescriptor(DncElementTypes.PluginPoint_2008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPackage6CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(2);
		types.add(DncElementTypes.Package_2009);
		types.add(DncElementTypes.Package_3003);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Package6CreationTool_title,
				Messages.Package6CreationTool_desc, types);
		entry.setSmallIcon(DncElementTypes
				.getImageDescriptor(DncElementTypes.Package_2009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAttribute1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(DncElementTypes.Attribute_3001);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Attribute1CreationTool_title, null, types);
		entry.setSmallIcon(DncElementTypes
				.getImageDescriptor(DncElementTypes.Attribute_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOperation2CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(DncElementTypes.Operation_3002);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Operation2CreationTool_title, null, types);
		entry.setSmallIcon(DncElementTypes
				.getImageDescriptor(DncElementTypes.Operation_3002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAssociation1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(DncElementTypes.Association_4001);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Association1CreationTool_title,
				Messages.Association1CreationTool_desc, types);
		entry.setSmallIcon(DncElementTypes
				.getImageDescriptor(DncElementTypes.Association_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAggregation2CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(DncElementTypes.Association_4003);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Aggregation2CreationTool_title,
				Messages.Aggregation2CreationTool_desc, types);
		entry
				.setSmallIcon(DncDiagramEditorPlugin
						.findImageDescriptor("/org.eclipse.amalgam.examples.dnc.model.edit/icons/full/obj16/Aggregation.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createGeneralization3CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(DncElementTypes.ClassSuperclasses_4002);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Generalization3CreationTool_title,
				Messages.Generalization3CreationTool_desc, types);
		entry
				.setSmallIcon(DncDiagramEditorPlugin
						.findImageDescriptor("/org.eclipse.amalgam.examples.dnc.model.edit/icons/full/obj16/Generalization.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAnnotation1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(DncElementTypes.Annotation_2010);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Annotation1CreationTool_title,
				Messages.Annotation1CreationTool_desc, types);
		entry.setSmallIcon(DncElementTypes
				.getImageDescriptor(DncElementTypes.Annotation_2010));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAnnotationLink2CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(DncElementTypes.AnnotatedElementAnnotations_4004);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.AnnotationLink2CreationTool_title,
				Messages.AnnotationLink2CreationTool_desc, types);
		entry
				.setSmallIcon(DncDiagramEditorPlugin
						.findImageDescriptor("/org.eclipse.amalgam.examples.dnc.model.edit/icons/full/obj16/AnnotationLink.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMomentInterval1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(DncElementTypes.MomentInterval_2001);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.MomentInterval1CreationTool_title,
				Messages.MomentInterval1CreationTool_desc, types);
		entry.setSmallIcon(DncElementTypes
				.getImageDescriptor(DncElementTypes.MomentInterval_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMIDetail2CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(DncElementTypes.MIDetail_2002);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.MIDetail2CreationTool_title,
				Messages.MIDetail2CreationTool_desc, types);
		entry.setSmallIcon(DncElementTypes
				.getImageDescriptor(DncElementTypes.MIDetail_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createParty1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(DncElementTypes.Party_2004);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Party1CreationTool_title,
				Messages.Party1CreationTool_desc, types);
		entry.setSmallIcon(DncElementTypes
				.getImageDescriptor(DncElementTypes.Party_2004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPlace2CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(DncElementTypes.Place_2005);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Place2CreationTool_title,
				Messages.Place2CreationTool_desc, types);
		entry.setSmallIcon(DncElementTypes
				.getImageDescriptor(DncElementTypes.Place_2005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createThing3CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(DncElementTypes.Thing_2006);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Thing3CreationTool_title,
				Messages.Thing3CreationTool_desc, types);
		entry.setSmallIcon(DncElementTypes
				.getImageDescriptor(DncElementTypes.Thing_2006));
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
