package org.eclipse.amalgam.examples.scenario.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.amalgam.examples.scenario.ScenarioPackage;
import org.eclipse.amalgam.examples.scenario.diagram.part.ScenarioDiagramEditorPlugin;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;

/**
 * @generated
 */
public class ScenarioElementTypes extends ElementInitializers {

	/**
	 * @generated
	 */
	private ScenarioElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map elements;

	/**
	 * @generated
	 */
	private static ImageRegistry imageRegistry;

	/**
	 * @generated
	 */
	private static Set KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType Process_1000 = getElementType("org.eclipse.amalgam.examples.scenario.diagram.Process_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DataObject_2001 = getElementType("org.eclipse.amalgam.examples.scenario.diagram.DataObject_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Event_2002 = getElementType("org.eclipse.amalgam.examples.scenario.diagram.Event_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Gateway_2003 = getElementType("org.eclipse.amalgam.examples.scenario.diagram.Gateway_2003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Task_2004 = getElementType("org.eclipse.amalgam.examples.scenario.diagram.Task_2004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Event_2005 = getElementType("org.eclipse.amalgam.examples.scenario.diagram.Event_2005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Event_2006 = getElementType("org.eclipse.amalgam.examples.scenario.diagram.Event_2006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Process_2007 = getElementType("org.eclipse.amalgam.examples.scenario.diagram.Process_2007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Gateway_2008 = getElementType("org.eclipse.amalgam.examples.scenario.diagram.Gateway_2008"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Event_2009 = getElementType("org.eclipse.amalgam.examples.scenario.diagram.Event_2009"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Event_2010 = getElementType("org.eclipse.amalgam.examples.scenario.diagram.Event_2010"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Event_2011 = getElementType("org.eclipse.amalgam.examples.scenario.diagram.Event_2011"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Gateway_2012 = getElementType("org.eclipse.amalgam.examples.scenario.diagram.Gateway_2012"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Event_3001 = getElementType("org.eclipse.amalgam.examples.scenario.diagram.Event_3001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Event_3002 = getElementType("org.eclipse.amalgam.examples.scenario.diagram.Event_3002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Association_4001 = getElementType("org.eclipse.amalgam.examples.scenario.diagram.Association_4001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SequenceFlow_4002 = getElementType("org.eclipse.amalgam.examples.scenario.diagram.SequenceFlow_4002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType MessageFlow_4003 = getElementType("org.eclipse.amalgam.examples.scenario.diagram.MessageFlow_4003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SequenceFlow_4004 = getElementType("org.eclipse.amalgam.examples.scenario.diagram.SequenceFlow_4004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Association_4005 = getElementType("org.eclipse.amalgam.examples.scenario.diagram.Association_4005"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	private static ImageRegistry getImageRegistry() {
		if (imageRegistry == null) {
			imageRegistry = new ImageRegistry();
		}
		return imageRegistry;
	}

	/**
	 * @generated
	 */
	private static String getImageRegistryKey(ENamedElement element) {
		return element.getName();
	}

	/**
	 * @generated
	 */
	private static ImageDescriptor getProvidedImageDescriptor(
			ENamedElement element) {
		if (element instanceof EStructuralFeature) {
			EStructuralFeature feature = ((EStructuralFeature) element);
			EClass eContainingClass = feature.getEContainingClass();
			EClassifier eType = feature.getEType();
			if (eContainingClass != null && !eContainingClass.isAbstract()) {
				element = eContainingClass;
			} else if (eType instanceof EClass
					&& !((EClass) eType).isAbstract()) {
				element = eType;
			}
		}
		if (element instanceof EClass) {
			EClass eClass = (EClass) element;
			if (!eClass.isAbstract()) {
				return ScenarioDiagramEditorPlugin.getInstance()
						.getItemImageDescriptor(
								eClass.getEPackage().getEFactoryInstance()
										.create(eClass));
			}
		}
		// TODO : support structural features
		return null;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		String key = getImageRegistryKey(element);
		ImageDescriptor imageDescriptor = getImageRegistry().getDescriptor(key);
		if (imageDescriptor == null) {
			imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
		}
		return imageDescriptor;
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		String key = getImageRegistryKey(element);
		Image image = getImageRegistry().get(key);
		if (image == null) {
			ImageDescriptor imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
			image = getImageRegistry().get(key);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImage(element);
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap();

			elements.put(Process_1000, ScenarioPackage.eINSTANCE.getProcess());

			elements.put(DataObject_2001, ScenarioPackage.eINSTANCE
					.getDataObject());

			elements.put(Event_2002, ScenarioPackage.eINSTANCE.getEvent());

			elements.put(Gateway_2003, ScenarioPackage.eINSTANCE.getGateway());

			elements.put(Task_2004, ScenarioPackage.eINSTANCE.getTask());

			elements.put(Event_2005, ScenarioPackage.eINSTANCE.getEvent());

			elements.put(Event_2006, ScenarioPackage.eINSTANCE.getEvent());

			elements.put(Process_2007, ScenarioPackage.eINSTANCE.getProcess());

			elements.put(Gateway_2008, ScenarioPackage.eINSTANCE.getGateway());

			elements.put(Event_2009, ScenarioPackage.eINSTANCE.getEvent());

			elements.put(Event_2010, ScenarioPackage.eINSTANCE.getEvent());

			elements.put(Event_2011, ScenarioPackage.eINSTANCE.getEvent());

			elements.put(Gateway_2012, ScenarioPackage.eINSTANCE.getGateway());

			elements.put(Event_3001, ScenarioPackage.eINSTANCE.getEvent());

			elements.put(Event_3002, ScenarioPackage.eINSTANCE.getEvent());

			elements.put(Association_4001, ScenarioPackage.eINSTANCE
					.getAssociation());

			elements.put(SequenceFlow_4002, ScenarioPackage.eINSTANCE
					.getSequenceFlow());

			elements.put(MessageFlow_4003, ScenarioPackage.eINSTANCE
					.getMessageFlow());

			elements.put(SequenceFlow_4004, ScenarioPackage.eINSTANCE
					.getSequenceFlow());

			elements.put(Association_4005, ScenarioPackage.eINSTANCE
					.getAssociation());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet();
			KNOWN_ELEMENT_TYPES.add(Process_1000);
			KNOWN_ELEMENT_TYPES.add(DataObject_2001);
			KNOWN_ELEMENT_TYPES.add(Event_2002);
			KNOWN_ELEMENT_TYPES.add(Gateway_2003);
			KNOWN_ELEMENT_TYPES.add(Task_2004);
			KNOWN_ELEMENT_TYPES.add(Event_2005);
			KNOWN_ELEMENT_TYPES.add(Event_2006);
			KNOWN_ELEMENT_TYPES.add(Process_2007);
			KNOWN_ELEMENT_TYPES.add(Gateway_2008);
			KNOWN_ELEMENT_TYPES.add(Event_2009);
			KNOWN_ELEMENT_TYPES.add(Event_2010);
			KNOWN_ELEMENT_TYPES.add(Event_2011);
			KNOWN_ELEMENT_TYPES.add(Gateway_2012);
			KNOWN_ELEMENT_TYPES.add(Event_3001);
			KNOWN_ELEMENT_TYPES.add(Event_3002);
			KNOWN_ELEMENT_TYPES.add(Association_4001);
			KNOWN_ELEMENT_TYPES.add(SequenceFlow_4002);
			KNOWN_ELEMENT_TYPES.add(MessageFlow_4003);
			KNOWN_ELEMENT_TYPES.add(SequenceFlow_4004);
			KNOWN_ELEMENT_TYPES.add(Association_4005);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

}
