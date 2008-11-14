package org.eclipse.amalgam.examples.scenario.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.amalgam.examples.scenario.Association;
import org.eclipse.amalgam.examples.scenario.DataObject;
import org.eclipse.amalgam.examples.scenario.Element;
import org.eclipse.amalgam.examples.scenario.Event;
import org.eclipse.amalgam.examples.scenario.Gateway;
import org.eclipse.amalgam.examples.scenario.MessageFlow;
import org.eclipse.amalgam.examples.scenario.Process;
import org.eclipse.amalgam.examples.scenario.ScenarioPackage;
import org.eclipse.amalgam.examples.scenario.SequenceFlow;
import org.eclipse.amalgam.examples.scenario.Task;
import org.eclipse.amalgam.examples.scenario.diagram.edit.parts.Association2EditPart;
import org.eclipse.amalgam.examples.scenario.diagram.edit.parts.AssociationEditPart;
import org.eclipse.amalgam.examples.scenario.diagram.edit.parts.DataObjectEditPart;
import org.eclipse.amalgam.examples.scenario.diagram.edit.parts.Event2EditPart;
import org.eclipse.amalgam.examples.scenario.diagram.edit.parts.Event3EditPart;
import org.eclipse.amalgam.examples.scenario.diagram.edit.parts.Event4EditPart;
import org.eclipse.amalgam.examples.scenario.diagram.edit.parts.Event5EditPart;
import org.eclipse.amalgam.examples.scenario.diagram.edit.parts.Event6EditPart;
import org.eclipse.amalgam.examples.scenario.diagram.edit.parts.Event7EditPart;
import org.eclipse.amalgam.examples.scenario.diagram.edit.parts.Event8EditPart;
import org.eclipse.amalgam.examples.scenario.diagram.edit.parts.EventEditPart;
import org.eclipse.amalgam.examples.scenario.diagram.edit.parts.Gateway2EditPart;
import org.eclipse.amalgam.examples.scenario.diagram.edit.parts.Gateway3EditPart;
import org.eclipse.amalgam.examples.scenario.diagram.edit.parts.GatewayEditPart;
import org.eclipse.amalgam.examples.scenario.diagram.edit.parts.MessageFlowEditPart;
import org.eclipse.amalgam.examples.scenario.diagram.edit.parts.Process2EditPart;
import org.eclipse.amalgam.examples.scenario.diagram.edit.parts.ProcessEditPart;
import org.eclipse.amalgam.examples.scenario.diagram.edit.parts.SequenceFlow2EditPart;
import org.eclipse.amalgam.examples.scenario.diagram.edit.parts.SequenceFlowEditPart;
import org.eclipse.amalgam.examples.scenario.diagram.edit.parts.TaskEditPart;
import org.eclipse.amalgam.examples.scenario.diagram.providers.ScenarioElementTypes;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class ScenarioDiagramUpdater {

	/**
	 * @generated
	 */
	public static List getSemanticChildren(View view) {
		switch (ScenarioVisualIDRegistry.getVisualID(view)) {
		case TaskEditPart.VISUAL_ID:
			return getTask_2004SemanticChildren(view);
		case ProcessEditPart.VISUAL_ID:
			return getProcess_1000SemanticChildren(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getTask_2004SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Task modelElement = (Task) view.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getEvents().iterator(); it.hasNext();) {
			Event childElement = (Event) it.next();
			int visualID = ScenarioVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Event7EditPart.VISUAL_ID) {
				result.add(new ScenarioNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Event8EditPart.VISUAL_ID) {
				result.add(new ScenarioNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getProcess_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Process modelElement = (Process) view.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getElements().iterator(); it.hasNext();) {
			Element childElement = (Element) it.next();
			int visualID = ScenarioVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == DataObjectEditPart.VISUAL_ID) {
				result.add(new ScenarioNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == EventEditPart.VISUAL_ID) {
				result.add(new ScenarioNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == GatewayEditPart.VISUAL_ID) {
				result.add(new ScenarioNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TaskEditPart.VISUAL_ID) {
				result.add(new ScenarioNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Event2EditPart.VISUAL_ID) {
				result.add(new ScenarioNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Event3EditPart.VISUAL_ID) {
				result.add(new ScenarioNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Process2EditPart.VISUAL_ID) {
				result.add(new ScenarioNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Gateway2EditPart.VISUAL_ID) {
				result.add(new ScenarioNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Event4EditPart.VISUAL_ID) {
				result.add(new ScenarioNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Event5EditPart.VISUAL_ID) {
				result.add(new ScenarioNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Event6EditPart.VISUAL_ID) {
				result.add(new ScenarioNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Gateway3EditPart.VISUAL_ID) {
				result.add(new ScenarioNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getContainedLinks(View view) {
		switch (ScenarioVisualIDRegistry.getVisualID(view)) {
		case ProcessEditPart.VISUAL_ID:
			return getProcess_1000ContainedLinks(view);
		case DataObjectEditPart.VISUAL_ID:
			return getDataObject_2001ContainedLinks(view);
		case EventEditPart.VISUAL_ID:
			return getEvent_2002ContainedLinks(view);
		case GatewayEditPart.VISUAL_ID:
			return getGateway_2003ContainedLinks(view);
		case TaskEditPart.VISUAL_ID:
			return getTask_2004ContainedLinks(view);
		case Event2EditPart.VISUAL_ID:
			return getEvent_2005ContainedLinks(view);
		case Event3EditPart.VISUAL_ID:
			return getEvent_2006ContainedLinks(view);
		case Process2EditPart.VISUAL_ID:
			return getProcess_2007ContainedLinks(view);
		case Gateway2EditPart.VISUAL_ID:
			return getGateway_2008ContainedLinks(view);
		case Event4EditPart.VISUAL_ID:
			return getEvent_2009ContainedLinks(view);
		case Event5EditPart.VISUAL_ID:
			return getEvent_2010ContainedLinks(view);
		case Event6EditPart.VISUAL_ID:
			return getEvent_2011ContainedLinks(view);
		case Gateway3EditPart.VISUAL_ID:
			return getGateway_2012ContainedLinks(view);
		case Event7EditPart.VISUAL_ID:
			return getEvent_3001ContainedLinks(view);
		case Event8EditPart.VISUAL_ID:
			return getEvent_3002ContainedLinks(view);
		case AssociationEditPart.VISUAL_ID:
			return getAssociation_4001ContainedLinks(view);
		case SequenceFlowEditPart.VISUAL_ID:
			return getSequenceFlow_4002ContainedLinks(view);
		case MessageFlowEditPart.VISUAL_ID:
			return getMessageFlow_4003ContainedLinks(view);
		case SequenceFlow2EditPart.VISUAL_ID:
			return getSequenceFlow_4004ContainedLinks(view);
		case Association2EditPart.VISUAL_ID:
			return getAssociation_4005ContainedLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIncomingLinks(View view) {
		switch (ScenarioVisualIDRegistry.getVisualID(view)) {
		case DataObjectEditPart.VISUAL_ID:
			return getDataObject_2001IncomingLinks(view);
		case EventEditPart.VISUAL_ID:
			return getEvent_2002IncomingLinks(view);
		case GatewayEditPart.VISUAL_ID:
			return getGateway_2003IncomingLinks(view);
		case TaskEditPart.VISUAL_ID:
			return getTask_2004IncomingLinks(view);
		case Event2EditPart.VISUAL_ID:
			return getEvent_2005IncomingLinks(view);
		case Event3EditPart.VISUAL_ID:
			return getEvent_2006IncomingLinks(view);
		case Process2EditPart.VISUAL_ID:
			return getProcess_2007IncomingLinks(view);
		case Gateway2EditPart.VISUAL_ID:
			return getGateway_2008IncomingLinks(view);
		case Event4EditPart.VISUAL_ID:
			return getEvent_2009IncomingLinks(view);
		case Event5EditPart.VISUAL_ID:
			return getEvent_2010IncomingLinks(view);
		case Event6EditPart.VISUAL_ID:
			return getEvent_2011IncomingLinks(view);
		case Gateway3EditPart.VISUAL_ID:
			return getGateway_2012IncomingLinks(view);
		case Event7EditPart.VISUAL_ID:
			return getEvent_3001IncomingLinks(view);
		case Event8EditPart.VISUAL_ID:
			return getEvent_3002IncomingLinks(view);
		case AssociationEditPart.VISUAL_ID:
			return getAssociation_4001IncomingLinks(view);
		case SequenceFlowEditPart.VISUAL_ID:
			return getSequenceFlow_4002IncomingLinks(view);
		case MessageFlowEditPart.VISUAL_ID:
			return getMessageFlow_4003IncomingLinks(view);
		case SequenceFlow2EditPart.VISUAL_ID:
			return getSequenceFlow_4004IncomingLinks(view);
		case Association2EditPart.VISUAL_ID:
			return getAssociation_4005IncomingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOutgoingLinks(View view) {
		switch (ScenarioVisualIDRegistry.getVisualID(view)) {
		case DataObjectEditPart.VISUAL_ID:
			return getDataObject_2001OutgoingLinks(view);
		case EventEditPart.VISUAL_ID:
			return getEvent_2002OutgoingLinks(view);
		case GatewayEditPart.VISUAL_ID:
			return getGateway_2003OutgoingLinks(view);
		case TaskEditPart.VISUAL_ID:
			return getTask_2004OutgoingLinks(view);
		case Event2EditPart.VISUAL_ID:
			return getEvent_2005OutgoingLinks(view);
		case Event3EditPart.VISUAL_ID:
			return getEvent_2006OutgoingLinks(view);
		case Process2EditPart.VISUAL_ID:
			return getProcess_2007OutgoingLinks(view);
		case Gateway2EditPart.VISUAL_ID:
			return getGateway_2008OutgoingLinks(view);
		case Event4EditPart.VISUAL_ID:
			return getEvent_2009OutgoingLinks(view);
		case Event5EditPart.VISUAL_ID:
			return getEvent_2010OutgoingLinks(view);
		case Event6EditPart.VISUAL_ID:
			return getEvent_2011OutgoingLinks(view);
		case Gateway3EditPart.VISUAL_ID:
			return getGateway_2012OutgoingLinks(view);
		case Event7EditPart.VISUAL_ID:
			return getEvent_3001OutgoingLinks(view);
		case Event8EditPart.VISUAL_ID:
			return getEvent_3002OutgoingLinks(view);
		case AssociationEditPart.VISUAL_ID:
			return getAssociation_4001OutgoingLinks(view);
		case SequenceFlowEditPart.VISUAL_ID:
			return getSequenceFlow_4002OutgoingLinks(view);
		case MessageFlowEditPart.VISUAL_ID:
			return getMessageFlow_4003OutgoingLinks(view);
		case SequenceFlow2EditPart.VISUAL_ID:
			return getSequenceFlow_4004OutgoingLinks(view);
		case Association2EditPart.VISUAL_ID:
			return getAssociation_4005OutgoingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getProcess_1000ContainedLinks(View view) {
		Process modelElement = (Process) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getContainedTypeModelFacetLinks_Association_4001(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_SequenceFlow_4002(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_MessageFlow_4003(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_SequenceFlow_4004(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_Association_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getDataObject_2001ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEvent_2002ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getGateway_2003ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getTask_2004ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEvent_2005ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEvent_2006ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getProcess_2007ContainedLinks(View view) {
		Process modelElement = (Process) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getContainedTypeModelFacetLinks_Association_4001(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_SequenceFlow_4002(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_MessageFlow_4003(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_SequenceFlow_4004(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_Association_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getGateway_2008ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEvent_2009ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEvent_2010ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEvent_2011ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getGateway_2012ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEvent_3001ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEvent_3002ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAssociation_4001ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSequenceFlow_4002ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getMessageFlow_4003ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSequenceFlow_4004ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAssociation_4005ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDataObject_2001IncomingLinks(View view) {
		DataObject modelElement = (DataObject) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Association_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SequenceFlow_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MessageFlow_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SequenceFlow_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4005(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getEvent_2002IncomingLinks(View view) {
		Event modelElement = (Event) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Association_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SequenceFlow_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MessageFlow_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SequenceFlow_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4005(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getGateway_2003IncomingLinks(View view) {
		Gateway modelElement = (Gateway) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Association_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SequenceFlow_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MessageFlow_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SequenceFlow_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4005(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getTask_2004IncomingLinks(View view) {
		Task modelElement = (Task) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Association_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SequenceFlow_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MessageFlow_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SequenceFlow_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4005(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getEvent_2005IncomingLinks(View view) {
		Event modelElement = (Event) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Association_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SequenceFlow_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MessageFlow_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SequenceFlow_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4005(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getEvent_2006IncomingLinks(View view) {
		Event modelElement = (Event) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Association_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SequenceFlow_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MessageFlow_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SequenceFlow_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4005(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getProcess_2007IncomingLinks(View view) {
		Process modelElement = (Process) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Association_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SequenceFlow_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MessageFlow_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SequenceFlow_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4005(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getGateway_2008IncomingLinks(View view) {
		Gateway modelElement = (Gateway) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Association_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SequenceFlow_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MessageFlow_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SequenceFlow_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4005(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getEvent_2009IncomingLinks(View view) {
		Event modelElement = (Event) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Association_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SequenceFlow_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MessageFlow_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SequenceFlow_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4005(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getEvent_2010IncomingLinks(View view) {
		Event modelElement = (Event) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Association_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SequenceFlow_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MessageFlow_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SequenceFlow_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4005(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getEvent_2011IncomingLinks(View view) {
		Event modelElement = (Event) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Association_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SequenceFlow_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MessageFlow_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SequenceFlow_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4005(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getGateway_2012IncomingLinks(View view) {
		Gateway modelElement = (Gateway) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Association_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SequenceFlow_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MessageFlow_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SequenceFlow_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4005(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getEvent_3001IncomingLinks(View view) {
		Event modelElement = (Event) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Association_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SequenceFlow_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MessageFlow_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SequenceFlow_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4005(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getEvent_3002IncomingLinks(View view) {
		Event modelElement = (Event) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Association_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SequenceFlow_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MessageFlow_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SequenceFlow_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4005(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAssociation_4001IncomingLinks(View view) {
		Association modelElement = (Association) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Association_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SequenceFlow_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MessageFlow_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SequenceFlow_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4005(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSequenceFlow_4002IncomingLinks(View view) {
		SequenceFlow modelElement = (SequenceFlow) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Association_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SequenceFlow_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MessageFlow_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SequenceFlow_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4005(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getMessageFlow_4003IncomingLinks(View view) {
		MessageFlow modelElement = (MessageFlow) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Association_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SequenceFlow_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MessageFlow_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SequenceFlow_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4005(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSequenceFlow_4004IncomingLinks(View view) {
		SequenceFlow modelElement = (SequenceFlow) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Association_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SequenceFlow_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MessageFlow_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SequenceFlow_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4005(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAssociation_4005IncomingLinks(View view) {
		Association modelElement = (Association) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Association_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SequenceFlow_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MessageFlow_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SequenceFlow_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4005(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getDataObject_2001OutgoingLinks(View view) {
		DataObject modelElement = (DataObject) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Association_4001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_SequenceFlow_4002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_MessageFlow_4003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_SequenceFlow_4004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Association_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getEvent_2002OutgoingLinks(View view) {
		Event modelElement = (Event) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Association_4001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_SequenceFlow_4002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_MessageFlow_4003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_SequenceFlow_4004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Association_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getGateway_2003OutgoingLinks(View view) {
		Gateway modelElement = (Gateway) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Association_4001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_SequenceFlow_4002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_MessageFlow_4003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_SequenceFlow_4004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Association_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getTask_2004OutgoingLinks(View view) {
		Task modelElement = (Task) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Association_4001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_SequenceFlow_4002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_MessageFlow_4003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_SequenceFlow_4004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Association_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getEvent_2005OutgoingLinks(View view) {
		Event modelElement = (Event) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Association_4001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_SequenceFlow_4002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_MessageFlow_4003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_SequenceFlow_4004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Association_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getEvent_2006OutgoingLinks(View view) {
		Event modelElement = (Event) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Association_4001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_SequenceFlow_4002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_MessageFlow_4003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_SequenceFlow_4004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Association_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getProcess_2007OutgoingLinks(View view) {
		Process modelElement = (Process) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Association_4001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_SequenceFlow_4002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_MessageFlow_4003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_SequenceFlow_4004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Association_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getGateway_2008OutgoingLinks(View view) {
		Gateway modelElement = (Gateway) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Association_4001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_SequenceFlow_4002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_MessageFlow_4003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_SequenceFlow_4004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Association_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getEvent_2009OutgoingLinks(View view) {
		Event modelElement = (Event) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Association_4001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_SequenceFlow_4002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_MessageFlow_4003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_SequenceFlow_4004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Association_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getEvent_2010OutgoingLinks(View view) {
		Event modelElement = (Event) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Association_4001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_SequenceFlow_4002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_MessageFlow_4003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_SequenceFlow_4004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Association_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getEvent_2011OutgoingLinks(View view) {
		Event modelElement = (Event) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Association_4001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_SequenceFlow_4002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_MessageFlow_4003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_SequenceFlow_4004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Association_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getGateway_2012OutgoingLinks(View view) {
		Gateway modelElement = (Gateway) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Association_4001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_SequenceFlow_4002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_MessageFlow_4003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_SequenceFlow_4004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Association_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getEvent_3001OutgoingLinks(View view) {
		Event modelElement = (Event) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Association_4001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_SequenceFlow_4002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_MessageFlow_4003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_SequenceFlow_4004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Association_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getEvent_3002OutgoingLinks(View view) {
		Event modelElement = (Event) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Association_4001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_SequenceFlow_4002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_MessageFlow_4003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_SequenceFlow_4004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Association_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAssociation_4001OutgoingLinks(View view) {
		Association modelElement = (Association) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Association_4001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_SequenceFlow_4002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_MessageFlow_4003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_SequenceFlow_4004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Association_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSequenceFlow_4002OutgoingLinks(View view) {
		SequenceFlow modelElement = (SequenceFlow) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Association_4001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_SequenceFlow_4002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_MessageFlow_4003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_SequenceFlow_4004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Association_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getMessageFlow_4003OutgoingLinks(View view) {
		MessageFlow modelElement = (MessageFlow) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Association_4001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_SequenceFlow_4002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_MessageFlow_4003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_SequenceFlow_4004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Association_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSequenceFlow_4004OutgoingLinks(View view) {
		SequenceFlow modelElement = (SequenceFlow) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Association_4001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_SequenceFlow_4002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_MessageFlow_4003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_SequenceFlow_4004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Association_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAssociation_4005OutgoingLinks(View view) {
		Association modelElement = (Association) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Association_4001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_SequenceFlow_4002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_MessageFlow_4003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_SequenceFlow_4004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Association_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_Association_4001(
			Process container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getElements().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Association) {
				continue;
			}
			Association link = (Association) linkObject;
			if (AssociationEditPart.VISUAL_ID != ScenarioVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Element dst = link.getTarget();
			Element src = link.getSource();
			result.add(new ScenarioLinkDescriptor(src, dst, link,
					ScenarioElementTypes.Association_4001,
					AssociationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_SequenceFlow_4002(
			Process container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getElements().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof SequenceFlow) {
				continue;
			}
			SequenceFlow link = (SequenceFlow) linkObject;
			if (SequenceFlowEditPart.VISUAL_ID != ScenarioVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Element dst = link.getTarget();
			Element src = link.getSource();
			result.add(new ScenarioLinkDescriptor(src, dst, link,
					ScenarioElementTypes.SequenceFlow_4002,
					SequenceFlowEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_MessageFlow_4003(
			Process container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getElements().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof MessageFlow) {
				continue;
			}
			MessageFlow link = (MessageFlow) linkObject;
			if (MessageFlowEditPart.VISUAL_ID != ScenarioVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Element dst = link.getTarget();
			Element src = link.getSource();
			result.add(new ScenarioLinkDescriptor(src, dst, link,
					ScenarioElementTypes.MessageFlow_4003,
					MessageFlowEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_SequenceFlow_4004(
			Process container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getElements().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof SequenceFlow) {
				continue;
			}
			SequenceFlow link = (SequenceFlow) linkObject;
			if (SequenceFlow2EditPart.VISUAL_ID != ScenarioVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Element dst = link.getTarget();
			Element src = link.getSource();
			result.add(new ScenarioLinkDescriptor(src, dst, link,
					ScenarioElementTypes.SequenceFlow_4004,
					SequenceFlow2EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_Association_4005(
			Process container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getElements().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Association) {
				continue;
			}
			Association link = (Association) linkObject;
			if (Association2EditPart.VISUAL_ID != ScenarioVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Element dst = link.getTarget();
			Element src = link.getSource();
			result.add(new ScenarioLinkDescriptor(src, dst, link,
					ScenarioElementTypes.Association_4005,
					Association2EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_Association_4001(
			Element target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != ScenarioPackage.eINSTANCE
					.getConnection_Target()
					|| false == setting.getEObject() instanceof Association) {
				continue;
			}
			Association link = (Association) setting.getEObject();
			if (AssociationEditPart.VISUAL_ID != ScenarioVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Element src = link.getSource();
			result.add(new ScenarioLinkDescriptor(src, target, link,
					ScenarioElementTypes.Association_4001,
					AssociationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_SequenceFlow_4002(
			Element target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != ScenarioPackage.eINSTANCE
					.getConnection_Target()
					|| false == setting.getEObject() instanceof SequenceFlow) {
				continue;
			}
			SequenceFlow link = (SequenceFlow) setting.getEObject();
			if (SequenceFlowEditPart.VISUAL_ID != ScenarioVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Element src = link.getSource();
			result.add(new ScenarioLinkDescriptor(src, target, link,
					ScenarioElementTypes.SequenceFlow_4002,
					SequenceFlowEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_MessageFlow_4003(
			Element target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != ScenarioPackage.eINSTANCE
					.getConnection_Target()
					|| false == setting.getEObject() instanceof MessageFlow) {
				continue;
			}
			MessageFlow link = (MessageFlow) setting.getEObject();
			if (MessageFlowEditPart.VISUAL_ID != ScenarioVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Element src = link.getSource();
			result.add(new ScenarioLinkDescriptor(src, target, link,
					ScenarioElementTypes.MessageFlow_4003,
					MessageFlowEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_SequenceFlow_4004(
			Element target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != ScenarioPackage.eINSTANCE
					.getConnection_Target()
					|| false == setting.getEObject() instanceof SequenceFlow) {
				continue;
			}
			SequenceFlow link = (SequenceFlow) setting.getEObject();
			if (SequenceFlow2EditPart.VISUAL_ID != ScenarioVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Element src = link.getSource();
			result.add(new ScenarioLinkDescriptor(src, target, link,
					ScenarioElementTypes.SequenceFlow_4004,
					SequenceFlow2EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_Association_4005(
			Element target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != ScenarioPackage.eINSTANCE
					.getConnection_Target()
					|| false == setting.getEObject() instanceof Association) {
				continue;
			}
			Association link = (Association) setting.getEObject();
			if (Association2EditPart.VISUAL_ID != ScenarioVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Element src = link.getSource();
			result.add(new ScenarioLinkDescriptor(src, target, link,
					ScenarioElementTypes.Association_4005,
					Association2EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_Association_4001(
			Element source) {
		Process container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Process) {
				container = (Process) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getElements().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Association) {
				continue;
			}
			Association link = (Association) linkObject;
			if (AssociationEditPart.VISUAL_ID != ScenarioVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Element dst = link.getTarget();
			Element src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new ScenarioLinkDescriptor(src, dst, link,
					ScenarioElementTypes.Association_4001,
					AssociationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_SequenceFlow_4002(
			Element source) {
		Process container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Process) {
				container = (Process) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getElements().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof SequenceFlow) {
				continue;
			}
			SequenceFlow link = (SequenceFlow) linkObject;
			if (SequenceFlowEditPart.VISUAL_ID != ScenarioVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Element dst = link.getTarget();
			Element src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new ScenarioLinkDescriptor(src, dst, link,
					ScenarioElementTypes.SequenceFlow_4002,
					SequenceFlowEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_MessageFlow_4003(
			Element source) {
		Process container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Process) {
				container = (Process) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getElements().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof MessageFlow) {
				continue;
			}
			MessageFlow link = (MessageFlow) linkObject;
			if (MessageFlowEditPart.VISUAL_ID != ScenarioVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Element dst = link.getTarget();
			Element src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new ScenarioLinkDescriptor(src, dst, link,
					ScenarioElementTypes.MessageFlow_4003,
					MessageFlowEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_SequenceFlow_4004(
			Element source) {
		Process container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Process) {
				container = (Process) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getElements().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof SequenceFlow) {
				continue;
			}
			SequenceFlow link = (SequenceFlow) linkObject;
			if (SequenceFlow2EditPart.VISUAL_ID != ScenarioVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Element dst = link.getTarget();
			Element src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new ScenarioLinkDescriptor(src, dst, link,
					ScenarioElementTypes.SequenceFlow_4004,
					SequenceFlow2EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_Association_4005(
			Element source) {
		Process container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Process) {
				container = (Process) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getElements().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Association) {
				continue;
			}
			Association link = (Association) linkObject;
			if (Association2EditPart.VISUAL_ID != ScenarioVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Element dst = link.getTarget();
			Element src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new ScenarioLinkDescriptor(src, dst, link,
					ScenarioElementTypes.Association_4005,
					Association2EditPart.VISUAL_ID));
		}
		return result;
	}

}
