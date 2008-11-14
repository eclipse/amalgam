package org.eclipse.amalgam.examples.dnc.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.amalgam.examples.dnc.Association;
import org.eclipse.amalgam.examples.dnc.Description;
import org.eclipse.amalgam.examples.dnc.MIDetail;
import org.eclipse.amalgam.examples.dnc.MomentInterval;
import org.eclipse.amalgam.examples.dnc.Party;
import org.eclipse.amalgam.examples.dnc.Place;
import org.eclipse.amalgam.examples.dnc.PluginPoint;
import org.eclipse.amalgam.examples.dnc.Role;
import org.eclipse.amalgam.examples.dnc.Thing;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.AnnotatedElementAnnotationsEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.AnnotationEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.Association2EditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.AssociationEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.AttributeEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.ClassSuperclassesEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.DescriptionAttributesEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.DescriptionEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.DescriptionOperationsEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.MIDetailAttributesEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.MIDetailEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.MIDetailOperationsEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.MomentIntervalAttributesEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.MomentIntervalEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.MomentIntervalOperationsEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.OperationEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.Package2EditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.Package3EditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.PackageEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.PackagePackagesEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.PartyAttributesEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.PartyEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.PartyOperationsEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.PlaceAttributesEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.PlaceEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.PlaceOperationsEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.PluginPointAttributesEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.PluginPointEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.PluginPointOperationsEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.RoleAttributesEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.RoleEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.RoleOperationsEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.ThingAttributesEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.ThingEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.ThingOperationsEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.providers.DncElementTypes;
import org.eclipse.amalgam.examples.oocore.AnnotatedElement;
import org.eclipse.amalgam.examples.oocore.Annotation;
import org.eclipse.amalgam.examples.oocore.Attribute;
import org.eclipse.amalgam.examples.oocore.Class;
import org.eclipse.amalgam.examples.oocore.Classifier;
import org.eclipse.amalgam.examples.oocore.OocorePackage;
import org.eclipse.amalgam.examples.oocore.Operation;
import org.eclipse.amalgam.examples.oocore.Package;
import org.eclipse.amalgam.examples.oocore.PackageableElement;
import org.eclipse.amalgam.examples.oocore.StructuralFeature;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class DncDiagramUpdater {

	/**
	 * @generated
	 */
	public static List getSemanticChildren(View view) {
		switch (DncVisualIDRegistry.getVisualID(view)) {
		case MomentIntervalAttributesEditPart.VISUAL_ID:
			return getMomentIntervalAttributes_7001SemanticChildren(view);
		case MomentIntervalOperationsEditPart.VISUAL_ID:
			return getMomentIntervalOperations_7002SemanticChildren(view);
		case MIDetailAttributesEditPart.VISUAL_ID:
			return getMIDetailAttributes_7003SemanticChildren(view);
		case MIDetailOperationsEditPart.VISUAL_ID:
			return getMIDetailOperations_7004SemanticChildren(view);
		case RoleAttributesEditPart.VISUAL_ID:
			return getRoleAttributes_7005SemanticChildren(view);
		case RoleOperationsEditPart.VISUAL_ID:
			return getRoleOperations_7006SemanticChildren(view);
		case PartyAttributesEditPart.VISUAL_ID:
			return getPartyAttributes_7007SemanticChildren(view);
		case PartyOperationsEditPart.VISUAL_ID:
			return getPartyOperations_7008SemanticChildren(view);
		case PlaceAttributesEditPart.VISUAL_ID:
			return getPlaceAttributes_7009SemanticChildren(view);
		case PlaceOperationsEditPart.VISUAL_ID:
			return getPlaceOperations_7010SemanticChildren(view);
		case ThingAttributesEditPart.VISUAL_ID:
			return getThingAttributes_7011SemanticChildren(view);
		case ThingOperationsEditPart.VISUAL_ID:
			return getThingOperations_7012SemanticChildren(view);
		case DescriptionAttributesEditPart.VISUAL_ID:
			return getDescriptionAttributes_7013SemanticChildren(view);
		case DescriptionOperationsEditPart.VISUAL_ID:
			return getDescriptionOperations_7014SemanticChildren(view);
		case PluginPointAttributesEditPart.VISUAL_ID:
			return getPluginPointAttributes_7015SemanticChildren(view);
		case PluginPointOperationsEditPart.VISUAL_ID:
			return getPluginPointOperations_7016SemanticChildren(view);
		case PackagePackagesEditPart.VISUAL_ID:
			return getPackagePackages_7017SemanticChildren(view);
		case PackageEditPart.VISUAL_ID:
			return getPackage_1000SemanticChildren(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getMomentIntervalAttributes_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		MomentInterval modelElement = (MomentInterval) containerView
				.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getFeatures().iterator(); it.hasNext();) {
			StructuralFeature childElement = (StructuralFeature) it.next();
			int visualID = DncVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == AttributeEditPart.VISUAL_ID) {
				result.add(new DncNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getMomentIntervalOperations_7002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		MomentInterval modelElement = (MomentInterval) containerView
				.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getOperations().iterator(); it
				.hasNext();) {
			Operation childElement = (Operation) it.next();
			int visualID = DncVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OperationEditPart.VISUAL_ID) {
				result.add(new DncNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getMIDetailAttributes_7003SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		MIDetail modelElement = (MIDetail) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getFeatures().iterator(); it.hasNext();) {
			StructuralFeature childElement = (StructuralFeature) it.next();
			int visualID = DncVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == AttributeEditPart.VISUAL_ID) {
				result.add(new DncNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getMIDetailOperations_7004SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		MIDetail modelElement = (MIDetail) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getOperations().iterator(); it
				.hasNext();) {
			Operation childElement = (Operation) it.next();
			int visualID = DncVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OperationEditPart.VISUAL_ID) {
				result.add(new DncNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRoleAttributes_7005SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Role modelElement = (Role) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getFeatures().iterator(); it.hasNext();) {
			StructuralFeature childElement = (StructuralFeature) it.next();
			int visualID = DncVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == AttributeEditPart.VISUAL_ID) {
				result.add(new DncNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRoleOperations_7006SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Role modelElement = (Role) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getOperations().iterator(); it
				.hasNext();) {
			Operation childElement = (Operation) it.next();
			int visualID = DncVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OperationEditPart.VISUAL_ID) {
				result.add(new DncNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPartyAttributes_7007SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Party modelElement = (Party) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getFeatures().iterator(); it.hasNext();) {
			StructuralFeature childElement = (StructuralFeature) it.next();
			int visualID = DncVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == AttributeEditPart.VISUAL_ID) {
				result.add(new DncNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPartyOperations_7008SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Party modelElement = (Party) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getOperations().iterator(); it
				.hasNext();) {
			Operation childElement = (Operation) it.next();
			int visualID = DncVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OperationEditPart.VISUAL_ID) {
				result.add(new DncNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPlaceAttributes_7009SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Place modelElement = (Place) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getFeatures().iterator(); it.hasNext();) {
			StructuralFeature childElement = (StructuralFeature) it.next();
			int visualID = DncVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == AttributeEditPart.VISUAL_ID) {
				result.add(new DncNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPlaceOperations_7010SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Place modelElement = (Place) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getOperations().iterator(); it
				.hasNext();) {
			Operation childElement = (Operation) it.next();
			int visualID = DncVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OperationEditPart.VISUAL_ID) {
				result.add(new DncNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getThingAttributes_7011SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Thing modelElement = (Thing) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getFeatures().iterator(); it.hasNext();) {
			StructuralFeature childElement = (StructuralFeature) it.next();
			int visualID = DncVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == AttributeEditPart.VISUAL_ID) {
				result.add(new DncNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getThingOperations_7012SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Thing modelElement = (Thing) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getOperations().iterator(); it
				.hasNext();) {
			Operation childElement = (Operation) it.next();
			int visualID = DncVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OperationEditPart.VISUAL_ID) {
				result.add(new DncNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getDescriptionAttributes_7013SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Description modelElement = (Description) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getFeatures().iterator(); it.hasNext();) {
			StructuralFeature childElement = (StructuralFeature) it.next();
			int visualID = DncVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == AttributeEditPart.VISUAL_ID) {
				result.add(new DncNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getDescriptionOperations_7014SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Description modelElement = (Description) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getOperations().iterator(); it
				.hasNext();) {
			Operation childElement = (Operation) it.next();
			int visualID = DncVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OperationEditPart.VISUAL_ID) {
				result.add(new DncNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPluginPointAttributes_7015SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		PluginPoint modelElement = (PluginPoint) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getFeatures().iterator(); it.hasNext();) {
			StructuralFeature childElement = (StructuralFeature) it.next();
			int visualID = DncVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == AttributeEditPart.VISUAL_ID) {
				result.add(new DncNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPluginPointOperations_7016SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		PluginPoint modelElement = (PluginPoint) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getOperations().iterator(); it
				.hasNext();) {
			Operation childElement = (Operation) it.next();
			int visualID = DncVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OperationEditPart.VISUAL_ID) {
				result.add(new DncNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPackagePackages_7017SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Package modelElement = (Package) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getContents().iterator(); it.hasNext();) {
			PackageableElement childElement = (PackageableElement) it.next();
			int visualID = DncVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Package3EditPart.VISUAL_ID) {
				result.add(new DncNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPackage_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Package modelElement = (Package) view.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getContents().iterator(); it.hasNext();) {
			PackageableElement childElement = (PackageableElement) it.next();
			int visualID = DncVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == MomentIntervalEditPart.VISUAL_ID) {
				result.add(new DncNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MIDetailEditPart.VISUAL_ID) {
				result.add(new DncNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RoleEditPart.VISUAL_ID) {
				result.add(new DncNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PartyEditPart.VISUAL_ID) {
				result.add(new DncNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PlaceEditPart.VISUAL_ID) {
				result.add(new DncNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ThingEditPart.VISUAL_ID) {
				result.add(new DncNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DescriptionEditPart.VISUAL_ID) {
				result.add(new DncNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PluginPointEditPart.VISUAL_ID) {
				result.add(new DncNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Package2EditPart.VISUAL_ID) {
				result.add(new DncNodeDescriptor(childElement, visualID));
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
			if (DncVisualIDRegistry.getNodeVisualID(view, childElement) == AnnotationEditPart.VISUAL_ID) {
				result.add(new DncNodeDescriptor(childElement,
						AnnotationEditPart.VISUAL_ID));
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
		switch (DncVisualIDRegistry.getVisualID(view)) {
		case PackageEditPart.VISUAL_ID:
			return getPackage_1000ContainedLinks(view);
		case MomentIntervalEditPart.VISUAL_ID:
			return getMomentInterval_2001ContainedLinks(view);
		case MIDetailEditPart.VISUAL_ID:
			return getMIDetail_2002ContainedLinks(view);
		case RoleEditPart.VISUAL_ID:
			return getRole_2003ContainedLinks(view);
		case PartyEditPart.VISUAL_ID:
			return getParty_2004ContainedLinks(view);
		case PlaceEditPart.VISUAL_ID:
			return getPlace_2005ContainedLinks(view);
		case ThingEditPart.VISUAL_ID:
			return getThing_2006ContainedLinks(view);
		case DescriptionEditPart.VISUAL_ID:
			return getDescription_2007ContainedLinks(view);
		case PluginPointEditPart.VISUAL_ID:
			return getPluginPoint_2008ContainedLinks(view);
		case Package2EditPart.VISUAL_ID:
			return getPackage_2009ContainedLinks(view);
		case AnnotationEditPart.VISUAL_ID:
			return getAnnotation_2010ContainedLinks(view);
		case AttributeEditPart.VISUAL_ID:
			return getAttribute_3001ContainedLinks(view);
		case OperationEditPart.VISUAL_ID:
			return getOperation_3002ContainedLinks(view);
		case Package3EditPart.VISUAL_ID:
			return getPackage_3003ContainedLinks(view);
		case AssociationEditPart.VISUAL_ID:
			return getAssociation_4001ContainedLinks(view);
		case Association2EditPart.VISUAL_ID:
			return getAssociation_4003ContainedLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIncomingLinks(View view) {
		switch (DncVisualIDRegistry.getVisualID(view)) {
		case MomentIntervalEditPart.VISUAL_ID:
			return getMomentInterval_2001IncomingLinks(view);
		case MIDetailEditPart.VISUAL_ID:
			return getMIDetail_2002IncomingLinks(view);
		case RoleEditPart.VISUAL_ID:
			return getRole_2003IncomingLinks(view);
		case PartyEditPart.VISUAL_ID:
			return getParty_2004IncomingLinks(view);
		case PlaceEditPart.VISUAL_ID:
			return getPlace_2005IncomingLinks(view);
		case ThingEditPart.VISUAL_ID:
			return getThing_2006IncomingLinks(view);
		case DescriptionEditPart.VISUAL_ID:
			return getDescription_2007IncomingLinks(view);
		case PluginPointEditPart.VISUAL_ID:
			return getPluginPoint_2008IncomingLinks(view);
		case Package2EditPart.VISUAL_ID:
			return getPackage_2009IncomingLinks(view);
		case AnnotationEditPart.VISUAL_ID:
			return getAnnotation_2010IncomingLinks(view);
		case AttributeEditPart.VISUAL_ID:
			return getAttribute_3001IncomingLinks(view);
		case OperationEditPart.VISUAL_ID:
			return getOperation_3002IncomingLinks(view);
		case Package3EditPart.VISUAL_ID:
			return getPackage_3003IncomingLinks(view);
		case AssociationEditPart.VISUAL_ID:
			return getAssociation_4001IncomingLinks(view);
		case Association2EditPart.VISUAL_ID:
			return getAssociation_4003IncomingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOutgoingLinks(View view) {
		switch (DncVisualIDRegistry.getVisualID(view)) {
		case MomentIntervalEditPart.VISUAL_ID:
			return getMomentInterval_2001OutgoingLinks(view);
		case MIDetailEditPart.VISUAL_ID:
			return getMIDetail_2002OutgoingLinks(view);
		case RoleEditPart.VISUAL_ID:
			return getRole_2003OutgoingLinks(view);
		case PartyEditPart.VISUAL_ID:
			return getParty_2004OutgoingLinks(view);
		case PlaceEditPart.VISUAL_ID:
			return getPlace_2005OutgoingLinks(view);
		case ThingEditPart.VISUAL_ID:
			return getThing_2006OutgoingLinks(view);
		case DescriptionEditPart.VISUAL_ID:
			return getDescription_2007OutgoingLinks(view);
		case PluginPointEditPart.VISUAL_ID:
			return getPluginPoint_2008OutgoingLinks(view);
		case Package2EditPart.VISUAL_ID:
			return getPackage_2009OutgoingLinks(view);
		case AnnotationEditPart.VISUAL_ID:
			return getAnnotation_2010OutgoingLinks(view);
		case AttributeEditPart.VISUAL_ID:
			return getAttribute_3001OutgoingLinks(view);
		case OperationEditPart.VISUAL_ID:
			return getOperation_3002OutgoingLinks(view);
		case Package3EditPart.VISUAL_ID:
			return getPackage_3003OutgoingLinks(view);
		case AssociationEditPart.VISUAL_ID:
			return getAssociation_4001OutgoingLinks(view);
		case Association2EditPart.VISUAL_ID:
			return getAssociation_4003OutgoingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPackage_1000ContainedLinks(View view) {
		Package modelElement = (Package) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_AnnotatedElement_Annotations_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getMomentInterval_2001ContainedLinks(View view) {
		MomentInterval modelElement = (MomentInterval) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getContainedTypeModelFacetLinks_Association_4001(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Class_Superclasses_4002(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_Association_4003(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_AnnotatedElement_Annotations_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getMIDetail_2002ContainedLinks(View view) {
		MIDetail modelElement = (MIDetail) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getContainedTypeModelFacetLinks_Association_4001(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Class_Superclasses_4002(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_Association_4003(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_AnnotatedElement_Annotations_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRole_2003ContainedLinks(View view) {
		Role modelElement = (Role) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getContainedTypeModelFacetLinks_Association_4001(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Class_Superclasses_4002(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_Association_4003(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_AnnotatedElement_Annotations_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getParty_2004ContainedLinks(View view) {
		Party modelElement = (Party) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getContainedTypeModelFacetLinks_Association_4001(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Class_Superclasses_4002(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_Association_4003(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_AnnotatedElement_Annotations_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPlace_2005ContainedLinks(View view) {
		Place modelElement = (Place) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getContainedTypeModelFacetLinks_Association_4001(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Class_Superclasses_4002(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_Association_4003(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_AnnotatedElement_Annotations_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getThing_2006ContainedLinks(View view) {
		Thing modelElement = (Thing) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getContainedTypeModelFacetLinks_Association_4001(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Class_Superclasses_4002(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_Association_4003(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_AnnotatedElement_Annotations_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getDescription_2007ContainedLinks(View view) {
		Description modelElement = (Description) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getContainedTypeModelFacetLinks_Association_4001(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Class_Superclasses_4002(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_Association_4003(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_AnnotatedElement_Annotations_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPluginPoint_2008ContainedLinks(View view) {
		PluginPoint modelElement = (PluginPoint) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getContainedTypeModelFacetLinks_Association_4001(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Class_Superclasses_4002(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_Association_4003(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_AnnotatedElement_Annotations_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPackage_2009ContainedLinks(View view) {
		Package modelElement = (Package) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_AnnotatedElement_Annotations_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAnnotation_2010ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAttribute_3001ContainedLinks(View view) {
		Attribute modelElement = (Attribute) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_AnnotatedElement_Annotations_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOperation_3002ContainedLinks(View view) {
		Operation modelElement = (Operation) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_AnnotatedElement_Annotations_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPackage_3003ContainedLinks(View view) {
		Package modelElement = (Package) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_AnnotatedElement_Annotations_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAssociation_4001ContainedLinks(View view) {
		Association modelElement = (Association) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_AnnotatedElement_Annotations_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAssociation_4003ContainedLinks(View view) {
		Association modelElement = (Association) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_AnnotatedElement_Annotations_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getMomentInterval_2001IncomingLinks(View view) {
		MomentInterval modelElement = (MomentInterval) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Association_4001(
				modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Class_Superclasses_4002(
						modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getMIDetail_2002IncomingLinks(View view) {
		MIDetail modelElement = (MIDetail) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Association_4001(
				modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Class_Superclasses_4002(
						modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRole_2003IncomingLinks(View view) {
		Role modelElement = (Role) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Association_4001(
				modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Class_Superclasses_4002(
						modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getParty_2004IncomingLinks(View view) {
		Party modelElement = (Party) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Association_4001(
				modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Class_Superclasses_4002(
						modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPlace_2005IncomingLinks(View view) {
		Place modelElement = (Place) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Association_4001(
				modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Class_Superclasses_4002(
						modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getThing_2006IncomingLinks(View view) {
		Thing modelElement = (Thing) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Association_4001(
				modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Class_Superclasses_4002(
						modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getDescription_2007IncomingLinks(View view) {
		Description modelElement = (Description) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Association_4001(
				modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Class_Superclasses_4002(
						modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPluginPoint_2008IncomingLinks(View view) {
		PluginPoint modelElement = (PluginPoint) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Association_4001(
				modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Class_Superclasses_4002(
						modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPackage_2009IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAnnotation_2010IncomingLinks(View view) {
		Annotation modelElement = (Annotation) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_AnnotatedElement_Annotations_4004(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAttribute_3001IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOperation_3002IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPackage_3003IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAssociation_4001IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAssociation_4003IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getMomentInterval_2001OutgoingLinks(View view) {
		MomentInterval modelElement = (MomentInterval) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getContainedTypeModelFacetLinks_Association_4001(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Class_Superclasses_4002(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_Association_4003(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_AnnotatedElement_Annotations_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getMIDetail_2002OutgoingLinks(View view) {
		MIDetail modelElement = (MIDetail) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getContainedTypeModelFacetLinks_Association_4001(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Class_Superclasses_4002(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_Association_4003(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_AnnotatedElement_Annotations_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRole_2003OutgoingLinks(View view) {
		Role modelElement = (Role) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getContainedTypeModelFacetLinks_Association_4001(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Class_Superclasses_4002(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_Association_4003(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_AnnotatedElement_Annotations_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getParty_2004OutgoingLinks(View view) {
		Party modelElement = (Party) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getContainedTypeModelFacetLinks_Association_4001(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Class_Superclasses_4002(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_Association_4003(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_AnnotatedElement_Annotations_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPlace_2005OutgoingLinks(View view) {
		Place modelElement = (Place) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getContainedTypeModelFacetLinks_Association_4001(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Class_Superclasses_4002(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_Association_4003(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_AnnotatedElement_Annotations_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getThing_2006OutgoingLinks(View view) {
		Thing modelElement = (Thing) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getContainedTypeModelFacetLinks_Association_4001(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Class_Superclasses_4002(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_Association_4003(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_AnnotatedElement_Annotations_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getDescription_2007OutgoingLinks(View view) {
		Description modelElement = (Description) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getContainedTypeModelFacetLinks_Association_4001(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Class_Superclasses_4002(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_Association_4003(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_AnnotatedElement_Annotations_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPluginPoint_2008OutgoingLinks(View view) {
		PluginPoint modelElement = (PluginPoint) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getContainedTypeModelFacetLinks_Association_4001(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Class_Superclasses_4002(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_Association_4003(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_AnnotatedElement_Annotations_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPackage_2009OutgoingLinks(View view) {
		Package modelElement = (Package) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_AnnotatedElement_Annotations_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAnnotation_2010OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAttribute_3001OutgoingLinks(View view) {
		Attribute modelElement = (Attribute) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_AnnotatedElement_Annotations_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOperation_3002OutgoingLinks(View view) {
		Operation modelElement = (Operation) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_AnnotatedElement_Annotations_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPackage_3003OutgoingLinks(View view) {
		Package modelElement = (Package) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_AnnotatedElement_Annotations_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAssociation_4001OutgoingLinks(View view) {
		Association modelElement = (Association) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_AnnotatedElement_Annotations_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAssociation_4003OutgoingLinks(View view) {
		Association modelElement = (Association) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_AnnotatedElement_Annotations_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_Association_4001(
			Class container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getFeatures().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Association) {
				continue;
			}
			Association link = (Association) linkObject;
			if (AssociationEditPart.VISUAL_ID != DncVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Classifier dst = link.getType();
			result.add(new DncLinkDescriptor(container, dst, link,
					DncElementTypes.Association_4001,
					AssociationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_Association_4003(
			Class container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getFeatures().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Association) {
				continue;
			}
			Association link = (Association) linkObject;
			if (Association2EditPart.VISUAL_ID != DncVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Classifier dst = link.getType();
			result.add(new DncLinkDescriptor(container, dst, link,
					DncElementTypes.Association_4003,
					Association2EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_Association_4001(
			Classifier target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != OocorePackage.eINSTANCE
					.getTypedElement_Type()
					|| false == setting.getEObject() instanceof Association) {
				continue;
			}
			Association link = (Association) setting.getEObject();
			if (AssociationEditPart.VISUAL_ID != DncVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			if (false == link.eContainer() instanceof Class) {
				continue;
			}
			Class container = (Class) link.eContainer();
			result.add(new DncLinkDescriptor(container, target, link,
					DncElementTypes.Association_4001,
					AssociationEditPart.VISUAL_ID));

		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_Class_Superclasses_4002(
			Class target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == OocorePackage.eINSTANCE
					.getClass_Superclasses()) {
				result.add(new DncLinkDescriptor(setting.getEObject(), target,
						DncElementTypes.ClassSuperclasses_4002,
						ClassSuperclassesEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_Association_4003(
			Classifier target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != OocorePackage.eINSTANCE
					.getTypedElement_Type()
					|| false == setting.getEObject() instanceof Association) {
				continue;
			}
			Association link = (Association) setting.getEObject();
			if (Association2EditPart.VISUAL_ID != DncVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			if (false == link.eContainer() instanceof Class) {
				continue;
			}
			Class container = (Class) link.eContainer();
			result.add(new DncLinkDescriptor(container, target, link,
					DncElementTypes.Association_4003,
					Association2EditPart.VISUAL_ID));

		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_AnnotatedElement_Annotations_4004(
			Annotation target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == OocorePackage.eINSTANCE
					.getAnnotatedElement_Annotations()) {
				result.add(new DncLinkDescriptor(setting.getEObject(), target,
						DncElementTypes.AnnotatedElementAnnotations_4004,
						AnnotatedElementAnnotationsEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_Class_Superclasses_4002(
			Class source) {
		Collection result = new LinkedList();
		for (Iterator destinations = source.getSuperclasses().iterator(); destinations
				.hasNext();) {
			Class destination = (Class) destinations.next();
			result.add(new DncLinkDescriptor(source, destination,
					DncElementTypes.ClassSuperclasses_4002,
					ClassSuperclassesEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_AnnotatedElement_Annotations_4004(
			AnnotatedElement source) {
		Collection result = new LinkedList();
		for (Iterator destinations = source.getAnnotations().iterator(); destinations
				.hasNext();) {
			Annotation destination = (Annotation) destinations.next();
			result.add(new DncLinkDescriptor(source, destination,
					DncElementTypes.AnnotatedElementAnnotations_4004,
					AnnotatedElementAnnotationsEditPart.VISUAL_ID));
		}
		return result;
	}

}
