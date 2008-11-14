package org.eclipse.amalgam.examples.mindmap.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.amalgam.examples.mindmap.MindmapPackage;
import org.eclipse.amalgam.examples.mindmap.diagram.part.MindmapDiagramEditorPlugin;
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
public class MindmapElementTypes extends ElementInitializers {

	/**
	 * @generated
	 */
	private MindmapElementTypes() {
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
	public static final IElementType Map_1000 = getElementType("org.eclipse.amalgam.examples.mindmap.diagram.Map_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Topic_2001 = getElementType("org.eclipse.amalgam.examples.mindmap.diagram.Topic_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Topic_2002 = getElementType("org.eclipse.amalgam.examples.mindmap.diagram.Topic_2002"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType TopicSubtopics_4001 = getElementType("org.eclipse.amalgam.examples.mindmap.diagram.TopicSubtopics_4001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Relationship_4002 = getElementType("org.eclipse.amalgam.examples.mindmap.diagram.Relationship_4002"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Relationship_4003 = getElementType("org.eclipse.amalgam.examples.mindmap.diagram.Relationship_4003"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Relationship_4004 = getElementType("org.eclipse.amalgam.examples.mindmap.diagram.Relationship_4004"); //$NON-NLS-1$

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
				return MindmapDiagramEditorPlugin.getInstance()
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

			elements.put(Map_1000, MindmapPackage.eINSTANCE.getMap());

			elements.put(Topic_2001, MindmapPackage.eINSTANCE.getTopic());

			elements.put(Topic_2002, MindmapPackage.eINSTANCE.getTopic());

			elements.put(TopicSubtopics_4001, MindmapPackage.eINSTANCE
					.getTopic_Subtopics());

			elements.put(Relationship_4002, MindmapPackage.eINSTANCE
					.getRelationship());

			elements.put(Relationship_4003, MindmapPackage.eINSTANCE
					.getRelationship());

			elements.put(Relationship_4004, MindmapPackage.eINSTANCE
					.getRelationship());
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
			KNOWN_ELEMENT_TYPES.add(Map_1000);
			KNOWN_ELEMENT_TYPES.add(Topic_2001);
			KNOWN_ELEMENT_TYPES.add(Topic_2002);
			KNOWN_ELEMENT_TYPES.add(TopicSubtopics_4001);
			KNOWN_ELEMENT_TYPES.add(Relationship_4002);
			KNOWN_ELEMENT_TYPES.add(Relationship_4003);
			KNOWN_ELEMENT_TYPES.add(Relationship_4004);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

}
