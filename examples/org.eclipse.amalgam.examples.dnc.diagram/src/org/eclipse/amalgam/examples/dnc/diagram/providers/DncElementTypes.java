package org.eclipse.amalgam.examples.dnc.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.amalgam.examples.dnc.DncPackage;
import org.eclipse.amalgam.examples.dnc.diagram.part.DncDiagramEditorPlugin;
import org.eclipse.amalgam.examples.oocore.OocorePackage;
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
public class DncElementTypes extends ElementInitializers {

	/**
	 * @generated
	 */
	private DncElementTypes() {
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
	public static final IElementType Package_1000 = getElementType("org.eclipse.amalgam.examples.dnc.diagram.Package_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType MomentInterval_2001 = getElementType("org.eclipse.amalgam.examples.dnc.diagram.MomentInterval_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType MIDetail_2002 = getElementType("org.eclipse.amalgam.examples.dnc.diagram.MIDetail_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Role_2003 = getElementType("org.eclipse.amalgam.examples.dnc.diagram.Role_2003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Party_2004 = getElementType("org.eclipse.amalgam.examples.dnc.diagram.Party_2004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Place_2005 = getElementType("org.eclipse.amalgam.examples.dnc.diagram.Place_2005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Thing_2006 = getElementType("org.eclipse.amalgam.examples.dnc.diagram.Thing_2006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Description_2007 = getElementType("org.eclipse.amalgam.examples.dnc.diagram.Description_2007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType PluginPoint_2008 = getElementType("org.eclipse.amalgam.examples.dnc.diagram.PluginPoint_2008"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Package_2009 = getElementType("org.eclipse.amalgam.examples.dnc.diagram.Package_2009"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Annotation_2010 = getElementType("org.eclipse.amalgam.examples.dnc.diagram.Annotation_2010"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Attribute_3001 = getElementType("org.eclipse.amalgam.examples.dnc.diagram.Attribute_3001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Operation_3002 = getElementType("org.eclipse.amalgam.examples.dnc.diagram.Operation_3002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Package_3003 = getElementType("org.eclipse.amalgam.examples.dnc.diagram.Package_3003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Association_4001 = getElementType("org.eclipse.amalgam.examples.dnc.diagram.Association_4001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ClassSuperclasses_4002 = getElementType("org.eclipse.amalgam.examples.dnc.diagram.ClassSuperclasses_4002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Association_4003 = getElementType("org.eclipse.amalgam.examples.dnc.diagram.Association_4003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType AnnotatedElementAnnotations_4004 = getElementType("org.eclipse.amalgam.examples.dnc.diagram.AnnotatedElementAnnotations_4004"); //$NON-NLS-1$

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
				return DncDiagramEditorPlugin.getInstance()
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

			elements.put(Package_1000, OocorePackage.eINSTANCE.getPackage());

			elements.put(MomentInterval_2001, DncPackage.eINSTANCE
					.getMomentInterval());

			elements.put(MIDetail_2002, DncPackage.eINSTANCE.getMIDetail());

			elements.put(Role_2003, DncPackage.eINSTANCE.getRole());

			elements.put(Party_2004, DncPackage.eINSTANCE.getParty());

			elements.put(Place_2005, DncPackage.eINSTANCE.getPlace());

			elements.put(Thing_2006, DncPackage.eINSTANCE.getThing());

			elements.put(Description_2007, DncPackage.eINSTANCE
					.getDescription());

			elements.put(PluginPoint_2008, DncPackage.eINSTANCE
					.getPluginPoint());

			elements.put(Package_2009, OocorePackage.eINSTANCE.getPackage());

			elements.put(Annotation_2010, OocorePackage.eINSTANCE
					.getAnnotation());

			elements
					.put(Attribute_3001, OocorePackage.eINSTANCE.getAttribute());

			elements
					.put(Operation_3002, OocorePackage.eINSTANCE.getOperation());

			elements.put(Package_3003, OocorePackage.eINSTANCE.getPackage());

			elements.put(Association_4001, DncPackage.eINSTANCE
					.getAssociation());

			elements.put(ClassSuperclasses_4002, OocorePackage.eINSTANCE
					.getClass_Superclasses());

			elements.put(Association_4003, DncPackage.eINSTANCE
					.getAssociation());

			elements.put(AnnotatedElementAnnotations_4004,
					OocorePackage.eINSTANCE.getAnnotatedElement_Annotations());
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
			KNOWN_ELEMENT_TYPES.add(Package_1000);
			KNOWN_ELEMENT_TYPES.add(MomentInterval_2001);
			KNOWN_ELEMENT_TYPES.add(MIDetail_2002);
			KNOWN_ELEMENT_TYPES.add(Role_2003);
			KNOWN_ELEMENT_TYPES.add(Party_2004);
			KNOWN_ELEMENT_TYPES.add(Place_2005);
			KNOWN_ELEMENT_TYPES.add(Thing_2006);
			KNOWN_ELEMENT_TYPES.add(Description_2007);
			KNOWN_ELEMENT_TYPES.add(PluginPoint_2008);
			KNOWN_ELEMENT_TYPES.add(Package_2009);
			KNOWN_ELEMENT_TYPES.add(Annotation_2010);
			KNOWN_ELEMENT_TYPES.add(Attribute_3001);
			KNOWN_ELEMENT_TYPES.add(Operation_3002);
			KNOWN_ELEMENT_TYPES.add(Package_3003);
			KNOWN_ELEMENT_TYPES.add(Association_4001);
			KNOWN_ELEMENT_TYPES.add(ClassSuperclasses_4002);
			KNOWN_ELEMENT_TYPES.add(Association_4003);
			KNOWN_ELEMENT_TYPES.add(AnnotatedElementAnnotations_4004);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

}
