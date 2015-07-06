/*******************************************************************************
 * Copyright (c)  2006, 2015 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Thales - initial API and implementation
 *******************************************************************************/
package org.eclipse.amalgam.explorer.activity.ui.internal.util;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;

public class EcoreUtil2 {

	public static String defaultPattern = "{1} {0}"; //$NON-NLS-1$

	/**
	 * @param namedElement_p
	 * @param attribute_p
	 * @param prefix_p
	 * @param space_p
	 * @param recursive_p
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static String getUniqueName(EObject namedElement_p, EAttribute attribute_p, String prefix_p,
			boolean space_p, boolean recursive_p) {
		EObject parent = namedElement_p.eContainer();
		StringBuilder name = new StringBuilder(prefix_p);
		if (space_p) {
			name.append(" "); //$NON-NLS-1$
		}

		String nameString = name.toString();
		if (parent == null) {
			return nameString;
		}

		EStructuralFeature feature = namedElement_p.eContainingFeature();
		if (recursive_p) {
			EStructuralFeature parentFeature = parent.eContainingFeature();
			while (feature == parentFeature) {
				parent = parent.eContainer();
				parentFeature = parent.eContainingFeature();
			}
		}

		if ((feature instanceof EReference) && feature.isMany()) {
			boolean isUnique = false;

			Collection<? extends EObject> list = new ArrayList((Collection<? extends EObject>) parent.eGet(feature));
			list.remove(namedElement_p);

			int i = list.size() + 1;
			name.append(i);
			while (!isUnique) {
				nameString = name.toString();
				isUnique = checkListName(list, nameString, feature, attribute_p);
				if (!isUnique) {
					if (nameString.endsWith(Integer.valueOf(i).toString())) {
						name.delete(name.length() - Integer.valueOf(i).toString().length(), name.length());
					}
					i = i + 1;
					name.append(i);
				}
			}
		}
		return nameString;
	}

	/**
	 * Gets a unique name for the specified object.
	 * 
	 * @param object_p
	 *            the object to set name.
	 * @param container_p
	 *            the object container.
	 * @param feature_p
	 *            the feature.
	 * @param attribute_p
	 *            The name attribute.
	 * @param defaultString_p
	 *            The default string.
	 * @param pattern_p
	 *            The name pattern.
	 */
	@SuppressWarnings("unchecked")
	public static String getUniqueName(EObject object_p, EObject container_p, EStructuralFeature feature_p,
			EAttribute attribute_p, String defaultString_p) {
		String resultName = ""; //$NON-NLS-1$

		if ((feature_p == null) || feature_p.isMany()) {
			int counter = 0;

			List<EObject> siblings = new ArrayList<EObject>();
			if (feature_p != null) {
				siblings.addAll((Collection<EObject>) container_p.eGet(feature_p));
			} else {
				siblings.addAll(container_p.eContents());
			}
			siblings.remove(object_p);

			// retrieving the naming attribute feature.
			if ((siblings != null) && !siblings.isEmpty()) {
				List<String> existingNames = new ArrayList<String>();
				// list existing names.
				if (attribute_p != null) {
					for (Object sibling : siblings) {
						EObject eSibling = (EObject) sibling;
						Object attributeValue = eSibling.eGet(attribute_p);
						if (attributeValue instanceof String) {
							String name = (String) attributeValue;
							if (!name.equals("")) { //$NON-NLS-1$
								existingNames.add(name);
							}
						}
					}

					counter = siblings.size();

					do {
						resultName = MessageFormat.format(defaultPattern, new Object[] { Integer.valueOf(++counter),
								defaultString_p });
					} while (existingNames.contains(resultName));
				}
			} else {

				resultName = MessageFormat.format(defaultPattern, new Object[] { Integer.valueOf(++counter),
						defaultString_p });
			}
		} else {
			resultName = defaultString_p;
		}
		return resultName;
	}

	/**
	 * @param current_p
	 * @param nameString_p
	 * @param feature_p
	 * @param attribute_p
	 */
	private static boolean checkElementName(EObject current_p, String nameString_p, EStructuralFeature feature_p,
			EAttribute attribute_p) {
		Object name = current_p.eGet(attribute_p);
		if ((name != null) && name.equals(nameString_p)) {
			return false;
		}

		return true;
	}

	/**
	 * @param list_p
	 * @param nameString_p
	 * @param feature_p
	 * @param attribute_p
	 */
	private static boolean checkListName(Collection<? extends EObject> list_p, String nameString_p,
			EStructuralFeature feature_p, EAttribute attribute_p) {
		Iterator<? extends EObject> elements = list_p.iterator();
		boolean isUnique = true;
		while (elements.hasNext() && isUnique) {
			EObject currentEObject = elements.next();
			isUnique = checkElementName(currentEObject, nameString_p, feature_p, attribute_p);
		}
		return isUnique;
	}

	public static ResourceSet getResourceSet(EObject element_p) {
		ResourceSet set = null;
		if (element_p != null) {
			Resource resource = element_p.eResource();
			if (resource != null) {
				set = resource.getResourceSet();
			}
		}
		return set;
	}

	public static IFile getFile(Resource resource_p) {
		IFile result = null;
		// Precondition.
		if (null == resource_p) {
			return result;
		}
		result = WorkspaceSynchronizer.getFile(resource_p);
		return result;
	}
}
