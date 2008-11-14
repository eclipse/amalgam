package org.eclipse.amalgam.examples.mindmap.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.amalgam.examples.mindmap.Map;
import org.eclipse.amalgam.examples.mindmap.MapElement;
import org.eclipse.amalgam.examples.mindmap.MindmapPackage;
import org.eclipse.amalgam.examples.mindmap.Relationship;
import org.eclipse.amalgam.examples.mindmap.Topic;
import org.eclipse.amalgam.examples.mindmap.diagram.edit.parts.MapEditPart;
import org.eclipse.amalgam.examples.mindmap.diagram.edit.parts.Relationship2EditPart;
import org.eclipse.amalgam.examples.mindmap.diagram.edit.parts.Relationship3EditPart;
import org.eclipse.amalgam.examples.mindmap.diagram.edit.parts.RelationshipEditPart;
import org.eclipse.amalgam.examples.mindmap.diagram.edit.parts.Topic2EditPart;
import org.eclipse.amalgam.examples.mindmap.diagram.edit.parts.TopicEditPart;
import org.eclipse.amalgam.examples.mindmap.diagram.edit.parts.TopicSubtopicsEditPart;
import org.eclipse.amalgam.examples.mindmap.diagram.providers.MindmapElementTypes;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class MindmapDiagramUpdater {

	/**
	 * @generated
	 */
	public static List getSemanticChildren(View view) {
		switch (MindmapVisualIDRegistry.getVisualID(view)) {
		case MapEditPart.VISUAL_ID:
			return getMap_1000SemanticChildren(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getMap_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Map modelElement = (Map) view.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getElements().iterator(); it.hasNext();) {
			MapElement childElement = (MapElement) it.next();
			int visualID = MindmapVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == TopicEditPart.VISUAL_ID) {
				result.add(new MindmapNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Topic2EditPart.VISUAL_ID) {
				result.add(new MindmapNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getContainedLinks(View view) {
		switch (MindmapVisualIDRegistry.getVisualID(view)) {
		case MapEditPart.VISUAL_ID:
			return getMap_1000ContainedLinks(view);
		case TopicEditPart.VISUAL_ID:
			return getTopic_2001ContainedLinks(view);
		case Topic2EditPart.VISUAL_ID:
			return getTopic_2002ContainedLinks(view);
		case RelationshipEditPart.VISUAL_ID:
			return getRelationship_4002ContainedLinks(view);
		case Relationship2EditPart.VISUAL_ID:
			return getRelationship_4003ContainedLinks(view);
		case Relationship3EditPart.VISUAL_ID:
			return getRelationship_4004ContainedLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIncomingLinks(View view) {
		switch (MindmapVisualIDRegistry.getVisualID(view)) {
		case TopicEditPart.VISUAL_ID:
			return getTopic_2001IncomingLinks(view);
		case Topic2EditPart.VISUAL_ID:
			return getTopic_2002IncomingLinks(view);
		case RelationshipEditPart.VISUAL_ID:
			return getRelationship_4002IncomingLinks(view);
		case Relationship2EditPart.VISUAL_ID:
			return getRelationship_4003IncomingLinks(view);
		case Relationship3EditPart.VISUAL_ID:
			return getRelationship_4004IncomingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOutgoingLinks(View view) {
		switch (MindmapVisualIDRegistry.getVisualID(view)) {
		case TopicEditPart.VISUAL_ID:
			return getTopic_2001OutgoingLinks(view);
		case Topic2EditPart.VISUAL_ID:
			return getTopic_2002OutgoingLinks(view);
		case RelationshipEditPart.VISUAL_ID:
			return getRelationship_4002OutgoingLinks(view);
		case Relationship2EditPart.VISUAL_ID:
			return getRelationship_4003OutgoingLinks(view);
		case Relationship3EditPart.VISUAL_ID:
			return getRelationship_4004OutgoingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getMap_1000ContainedLinks(View view) {
		Map modelElement = (Map) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getContainedTypeModelFacetLinks_Relationship_4002(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_Relationship_4003(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_Relationship_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getTopic_2001ContainedLinks(View view) {
		Topic modelElement = (Topic) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Topic_Subtopics_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getTopic_2002ContainedLinks(View view) {
		Topic modelElement = (Topic) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Topic_Subtopics_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRelationship_4002ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRelationship_4003ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRelationship_4004ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getTopic_2001IncomingLinks(View view) {
		Topic modelElement = (Topic) view.getElement();
		java.util.Map crossReferences = EcoreUtil.CrossReferencer.find(view
				.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingFeatureModelFacetLinks_Topic_Subtopics_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Relationship_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Relationship_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Relationship_4004(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getTopic_2002IncomingLinks(View view) {
		Topic modelElement = (Topic) view.getElement();
		java.util.Map crossReferences = EcoreUtil.CrossReferencer.find(view
				.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingFeatureModelFacetLinks_Topic_Subtopics_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Relationship_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Relationship_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Relationship_4004(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRelationship_4002IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRelationship_4003IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRelationship_4004IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getTopic_2001OutgoingLinks(View view) {
		Topic modelElement = (Topic) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Topic_Subtopics_4001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Relationship_4002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Relationship_4003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Relationship_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getTopic_2002OutgoingLinks(View view) {
		Topic modelElement = (Topic) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Topic_Subtopics_4001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Relationship_4002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Relationship_4003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Relationship_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRelationship_4002OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRelationship_4003OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRelationship_4004OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_Relationship_4002(
			Map container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getElements().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Relationship) {
				continue;
			}
			Relationship link = (Relationship) linkObject;
			if (RelationshipEditPart.VISUAL_ID != MindmapVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Topic dst = link.getTarget();
			Topic src = link.getSource();
			result.add(new MindmapLinkDescriptor(src, dst, link,
					MindmapElementTypes.Relationship_4002,
					RelationshipEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_Relationship_4003(
			Map container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getElements().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Relationship) {
				continue;
			}
			Relationship link = (Relationship) linkObject;
			if (Relationship2EditPart.VISUAL_ID != MindmapVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Topic dst = link.getTarget();
			Topic src = link.getSource();
			result.add(new MindmapLinkDescriptor(src, dst, link,
					MindmapElementTypes.Relationship_4003,
					Relationship2EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_Relationship_4004(
			Map container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getElements().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Relationship) {
				continue;
			}
			Relationship link = (Relationship) linkObject;
			if (Relationship3EditPart.VISUAL_ID != MindmapVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Topic dst = link.getTarget();
			Topic src = link.getSource();
			result.add(new MindmapLinkDescriptor(src, dst, link,
					MindmapElementTypes.Relationship_4004,
					Relationship3EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_Topic_Subtopics_4001(
			Topic target, java.util.Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == MindmapPackage.eINSTANCE
					.getTopic_Subtopics()) {
				result.add(new MindmapLinkDescriptor(setting.getEObject(),
						target, MindmapElementTypes.TopicSubtopics_4001,
						TopicSubtopicsEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_Relationship_4002(
			Topic target, java.util.Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != MindmapPackage.eINSTANCE
					.getRelationship_Target()
					|| false == setting.getEObject() instanceof Relationship) {
				continue;
			}
			Relationship link = (Relationship) setting.getEObject();
			if (RelationshipEditPart.VISUAL_ID != MindmapVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Topic src = link.getSource();
			result.add(new MindmapLinkDescriptor(src, target, link,
					MindmapElementTypes.Relationship_4002,
					RelationshipEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_Relationship_4003(
			Topic target, java.util.Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != MindmapPackage.eINSTANCE
					.getRelationship_Target()
					|| false == setting.getEObject() instanceof Relationship) {
				continue;
			}
			Relationship link = (Relationship) setting.getEObject();
			if (Relationship2EditPart.VISUAL_ID != MindmapVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Topic src = link.getSource();
			result.add(new MindmapLinkDescriptor(src, target, link,
					MindmapElementTypes.Relationship_4003,
					Relationship2EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_Relationship_4004(
			Topic target, java.util.Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != MindmapPackage.eINSTANCE
					.getRelationship_Target()
					|| false == setting.getEObject() instanceof Relationship) {
				continue;
			}
			Relationship link = (Relationship) setting.getEObject();
			if (Relationship3EditPart.VISUAL_ID != MindmapVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Topic src = link.getSource();
			result.add(new MindmapLinkDescriptor(src, target, link,
					MindmapElementTypes.Relationship_4004,
					Relationship3EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_Topic_Subtopics_4001(
			Topic source) {
		Collection result = new LinkedList();
		for (Iterator destinations = source.getSubtopics().iterator(); destinations
				.hasNext();) {
			Topic destination = (Topic) destinations.next();
			result.add(new MindmapLinkDescriptor(source, destination,
					MindmapElementTypes.TopicSubtopics_4001,
					TopicSubtopicsEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_Relationship_4002(
			Topic source) {
		Map container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Map) {
				container = (Map) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getElements().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Relationship) {
				continue;
			}
			Relationship link = (Relationship) linkObject;
			if (RelationshipEditPart.VISUAL_ID != MindmapVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Topic dst = link.getTarget();
			Topic src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new MindmapLinkDescriptor(src, dst, link,
					MindmapElementTypes.Relationship_4002,
					RelationshipEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_Relationship_4003(
			Topic source) {
		Map container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Map) {
				container = (Map) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getElements().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Relationship) {
				continue;
			}
			Relationship link = (Relationship) linkObject;
			if (Relationship2EditPart.VISUAL_ID != MindmapVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Topic dst = link.getTarget();
			Topic src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new MindmapLinkDescriptor(src, dst, link,
					MindmapElementTypes.Relationship_4003,
					Relationship2EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_Relationship_4004(
			Topic source) {
		Map container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Map) {
				container = (Map) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getElements().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Relationship) {
				continue;
			}
			Relationship link = (Relationship) linkObject;
			if (Relationship3EditPart.VISUAL_ID != MindmapVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Topic dst = link.getTarget();
			Topic src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new MindmapLinkDescriptor(src, dst, link,
					MindmapElementTypes.Relationship_4004,
					Relationship3EditPart.VISUAL_ID));
		}
		return result;
	}

}
