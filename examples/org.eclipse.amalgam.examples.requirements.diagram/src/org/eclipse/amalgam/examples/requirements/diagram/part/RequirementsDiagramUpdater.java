package org.eclipse.amalgam.examples.requirements.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.amalgam.examples.requirements.Model;
import org.eclipse.amalgam.examples.requirements.Requirement;
import org.eclipse.amalgam.examples.requirements.RequirementGroup;
import org.eclipse.amalgam.examples.requirements.RequirementsPackage;
import org.eclipse.amalgam.examples.requirements.diagram.edit.parts.ModelEditPart;
import org.eclipse.amalgam.examples.requirements.diagram.edit.parts.ProcessEditPart;
import org.eclipse.amalgam.examples.requirements.diagram.edit.parts.RequirementChildrenEditPart;
import org.eclipse.amalgam.examples.requirements.diagram.edit.parts.RequirementDependenciesEditPart;
import org.eclipse.amalgam.examples.requirements.diagram.edit.parts.RequirementEditPart;
import org.eclipse.amalgam.examples.requirements.diagram.edit.parts.RequirementGroup2EditPart;
import org.eclipse.amalgam.examples.requirements.diagram.edit.parts.RequirementGroupChildrenEditPart;
import org.eclipse.amalgam.examples.requirements.diagram.edit.parts.RequirementGroupEditPart;
import org.eclipse.amalgam.examples.requirements.diagram.edit.parts.RequirementGroupRequirementsEditPart;
import org.eclipse.amalgam.examples.requirements.diagram.providers.RequirementsElementTypes;
import org.eclipse.amalgam.examples.scenario.Process;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class RequirementsDiagramUpdater {

	/**
	 * @generated
	 */
	public static List getSemanticChildren(View view) {
		switch (RequirementsVisualIDRegistry.getVisualID(view)) {
		case RequirementEditPart.VISUAL_ID:
			return getRequirement_2002SemanticChildren(view);
		case ModelEditPart.VISUAL_ID:
			return getModel_1000SemanticChildren(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRequirement_2002SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Requirement modelElement = (Requirement) view.getElement();
		List result = new LinkedList();
		{
			Process childElement = modelElement.getScenario();
			int visualID = RequirementsVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ProcessEditPart.VISUAL_ID) {
				result.add(new RequirementsNodeDescriptor(childElement,
						visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getModel_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Model modelElement = (Model) view.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getGroups().iterator(); it.hasNext();) {
			RequirementGroup childElement = (RequirementGroup) it.next();
			int visualID = RequirementsVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == RequirementGroupEditPart.VISUAL_ID) {
				result.add(new RequirementsNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		Resource resource = modelElement.eResource();
		for (Iterator semanticIterator = getPhantomNodesIterator(resource); semanticIterator
				.hasNext();) {
			EObject childElement = (EObject) semanticIterator.next();
			if (childElement == modelElement) {
				continue;
			}
			if (RequirementsVisualIDRegistry
					.getNodeVisualID(view, childElement) == RequirementEditPart.VISUAL_ID) {
				result.add(new RequirementsNodeDescriptor(childElement,
						RequirementEditPart.VISUAL_ID));
				continue;
			}
			if (RequirementsVisualIDRegistry
					.getNodeVisualID(view, childElement) == RequirementGroup2EditPart.VISUAL_ID) {
				result.add(new RequirementsNodeDescriptor(childElement,
						RequirementGroup2EditPart.VISUAL_ID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Iterator getPhantomNodesIterator(Resource resource) {
		return resource.getAllContents();
	}

	/**
	 * @generated
	 */
	public static List getContainedLinks(View view) {
		switch (RequirementsVisualIDRegistry.getVisualID(view)) {
		case ModelEditPart.VISUAL_ID:
			return getModel_1000ContainedLinks(view);
		case RequirementGroupEditPart.VISUAL_ID:
			return getRequirementGroup_2001ContainedLinks(view);
		case RequirementEditPart.VISUAL_ID:
			return getRequirement_2002ContainedLinks(view);
		case RequirementGroup2EditPart.VISUAL_ID:
			return getRequirementGroup_2003ContainedLinks(view);
		case ProcessEditPart.VISUAL_ID:
			return getProcess_3001ContainedLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIncomingLinks(View view) {
		switch (RequirementsVisualIDRegistry.getVisualID(view)) {
		case RequirementGroupEditPart.VISUAL_ID:
			return getRequirementGroup_2001IncomingLinks(view);
		case RequirementEditPart.VISUAL_ID:
			return getRequirement_2002IncomingLinks(view);
		case RequirementGroup2EditPart.VISUAL_ID:
			return getRequirementGroup_2003IncomingLinks(view);
		case ProcessEditPart.VISUAL_ID:
			return getProcess_3001IncomingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOutgoingLinks(View view) {
		switch (RequirementsVisualIDRegistry.getVisualID(view)) {
		case RequirementGroupEditPart.VISUAL_ID:
			return getRequirementGroup_2001OutgoingLinks(view);
		case RequirementEditPart.VISUAL_ID:
			return getRequirement_2002OutgoingLinks(view);
		case RequirementGroup2EditPart.VISUAL_ID:
			return getRequirementGroup_2003OutgoingLinks(view);
		case ProcessEditPart.VISUAL_ID:
			return getProcess_3001OutgoingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getModel_1000ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRequirementGroup_2001ContainedLinks(View view) {
		RequirementGroup modelElement = (RequirementGroup) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_RequirementGroup_Requirements_4001(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_RequirementGroup_Children_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRequirement_2002ContainedLinks(View view) {
		Requirement modelElement = (Requirement) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Requirement_Children_4002(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Requirement_Dependencies_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRequirementGroup_2003ContainedLinks(View view) {
		RequirementGroup modelElement = (RequirementGroup) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_RequirementGroup_Requirements_4001(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_RequirementGroup_Children_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getProcess_3001ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRequirementGroup_2001IncomingLinks(View view) {
		RequirementGroup modelElement = (RequirementGroup) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_RequirementGroup_Children_4004(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRequirement_2002IncomingLinks(View view) {
		Requirement modelElement = (Requirement) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_RequirementGroup_Requirements_4001(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Requirement_Children_4002(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Requirement_Dependencies_4003(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRequirementGroup_2003IncomingLinks(View view) {
		RequirementGroup modelElement = (RequirementGroup) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_RequirementGroup_Children_4004(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getProcess_3001IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRequirementGroup_2001OutgoingLinks(View view) {
		RequirementGroup modelElement = (RequirementGroup) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_RequirementGroup_Requirements_4001(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_RequirementGroup_Children_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRequirement_2002OutgoingLinks(View view) {
		Requirement modelElement = (Requirement) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Requirement_Children_4002(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Requirement_Dependencies_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRequirementGroup_2003OutgoingLinks(View view) {
		RequirementGroup modelElement = (RequirementGroup) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_RequirementGroup_Requirements_4001(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_RequirementGroup_Children_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getProcess_3001OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_RequirementGroup_Requirements_4001(
			Requirement target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == RequirementsPackage.eINSTANCE
					.getRequirementGroup_Requirements()) {
				result
						.add(new RequirementsLinkDescriptor(
								setting.getEObject(),
								target,
								RequirementsElementTypes.RequirementGroupRequirements_4001,
								RequirementGroupRequirementsEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_Requirement_Children_4002(
			Requirement target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == RequirementsPackage.eINSTANCE
					.getRequirement_Children()) {
				result.add(new RequirementsLinkDescriptor(setting.getEObject(),
						target,
						RequirementsElementTypes.RequirementChildren_4002,
						RequirementChildrenEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_Requirement_Dependencies_4003(
			Requirement target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == RequirementsPackage.eINSTANCE
					.getRequirement_Dependencies()) {
				result.add(new RequirementsLinkDescriptor(setting.getEObject(),
						target,
						RequirementsElementTypes.RequirementDependencies_4003,
						RequirementDependenciesEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_RequirementGroup_Children_4004(
			RequirementGroup target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == RequirementsPackage.eINSTANCE
					.getRequirementGroup_Children()) {
				result.add(new RequirementsLinkDescriptor(setting.getEObject(),
						target,
						RequirementsElementTypes.RequirementGroupChildren_4004,
						RequirementGroupChildrenEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_RequirementGroup_Requirements_4001(
			RequirementGroup source) {
		Collection result = new LinkedList();
		for (Iterator destinations = source.getRequirements().iterator(); destinations
				.hasNext();) {
			Requirement destination = (Requirement) destinations.next();
			result.add(new RequirementsLinkDescriptor(source, destination,
					RequirementsElementTypes.RequirementGroupRequirements_4001,
					RequirementGroupRequirementsEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_Requirement_Children_4002(
			Requirement source) {
		Collection result = new LinkedList();
		for (Iterator destinations = source.getChildren().iterator(); destinations
				.hasNext();) {
			Requirement destination = (Requirement) destinations.next();
			result.add(new RequirementsLinkDescriptor(source, destination,
					RequirementsElementTypes.RequirementChildren_4002,
					RequirementChildrenEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_Requirement_Dependencies_4003(
			Requirement source) {
		Collection result = new LinkedList();
		for (Iterator destinations = source.getDependencies().iterator(); destinations
				.hasNext();) {
			Requirement destination = (Requirement) destinations.next();
			result.add(new RequirementsLinkDescriptor(source, destination,
					RequirementsElementTypes.RequirementDependencies_4003,
					RequirementDependenciesEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_RequirementGroup_Children_4004(
			RequirementGroup source) {
		Collection result = new LinkedList();
		for (Iterator destinations = source.getChildren().iterator(); destinations
				.hasNext();) {
			RequirementGroup destination = (RequirementGroup) destinations
					.next();
			result.add(new RequirementsLinkDescriptor(source, destination,
					RequirementsElementTypes.RequirementGroupChildren_4004,
					RequirementGroupChildrenEditPart.VISUAL_ID));
		}
		return result;
	}

}
