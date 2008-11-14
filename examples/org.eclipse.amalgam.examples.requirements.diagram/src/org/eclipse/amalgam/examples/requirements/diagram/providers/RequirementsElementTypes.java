package org.eclipse.amalgam.examples.requirements.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.amalgam.examples.requirements.RequirementsPackage;
import org.eclipse.amalgam.examples.requirements.diagram.part.RequirementsDiagramEditorPlugin;
import org.eclipse.amalgam.examples.scenario.ScenarioPackage;
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
public class RequirementsElementTypes extends ElementInitializers {

	/**
	 * @generated
	 */
	private RequirementsElementTypes() {
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
	public static final IElementType Model_1000 = getElementType("org.eclipse.amalgam.examples.requirements.diagram.Model_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RequirementGroup_2001 = getElementType("org.eclipse.amalgam.examples.requirements.diagram.RequirementGroup_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Requirement_2002 = getElementType("org.eclipse.amalgam.examples.requirements.diagram.Requirement_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RequirementGroup_2003 = getElementType("org.eclipse.amalgam.examples.requirements.diagram.RequirementGroup_2003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Process_3001 = getElementType("org.eclipse.amalgam.examples.requirements.diagram.Process_3001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType RequirementGroupRequirements_4001 = getElementType("org.eclipse.amalgam.examples.requirements.diagram.RequirementGroupRequirements_4001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RequirementChildren_4002 = getElementType("org.eclipse.amalgam.examples.requirements.diagram.RequirementChildren_4002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RequirementDependencies_4003 = getElementType("org.eclipse.amalgam.examples.requirements.diagram.RequirementDependencies_4003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RequirementGroupChildren_4004 = getElementType("org.eclipse.amalgam.examples.requirements.diagram.RequirementGroupChildren_4004"); //$NON-NLS-1$

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
				return RequirementsDiagramEditorPlugin.getInstance()
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

			elements.put(Model_1000, RequirementsPackage.eINSTANCE.getModel());

			elements.put(RequirementGroup_2001, RequirementsPackage.eINSTANCE
					.getRequirementGroup());

			elements.put(Requirement_2002, RequirementsPackage.eINSTANCE
					.getRequirement());

			elements.put(RequirementGroup_2003, RequirementsPackage.eINSTANCE
					.getRequirementGroup());

			elements.put(Process_3001, ScenarioPackage.eINSTANCE.getProcess());

			elements.put(RequirementGroupRequirements_4001,
					RequirementsPackage.eINSTANCE
							.getRequirementGroup_Requirements());

			elements.put(RequirementChildren_4002,
					RequirementsPackage.eINSTANCE.getRequirement_Children());

			elements
					.put(RequirementDependencies_4003,
							RequirementsPackage.eINSTANCE
									.getRequirement_Dependencies());

			elements.put(RequirementGroupChildren_4004,
					RequirementsPackage.eINSTANCE
							.getRequirementGroup_Children());
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
			KNOWN_ELEMENT_TYPES.add(Model_1000);
			KNOWN_ELEMENT_TYPES.add(RequirementGroup_2001);
			KNOWN_ELEMENT_TYPES.add(Requirement_2002);
			KNOWN_ELEMENT_TYPES.add(RequirementGroup_2003);
			KNOWN_ELEMENT_TYPES.add(Process_3001);
			KNOWN_ELEMENT_TYPES.add(RequirementGroupRequirements_4001);
			KNOWN_ELEMENT_TYPES.add(RequirementChildren_4002);
			KNOWN_ELEMENT_TYPES.add(RequirementDependencies_4003);
			KNOWN_ELEMENT_TYPES.add(RequirementGroupChildren_4004);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

}
