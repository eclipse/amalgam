package org.eclipse.amalgam.examples.dnc.diagram.navigator;

import org.eclipse.amalgam.examples.dnc.diagram.part.DncVisualIDRegistry;
import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class DncNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 7019;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof DncNavigatorItem) {
			DncNavigatorItem item = (DncNavigatorItem) element;
			return DncVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
