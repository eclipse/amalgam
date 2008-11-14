package org.eclipse.amalgam.examples.mindmap.diagram.navigator;

import org.eclipse.amalgam.examples.mindmap.diagram.part.MindmapVisualIDRegistry;
import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class MindmapNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 4006;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof MindmapNavigatorItem) {
			MindmapNavigatorItem item = (MindmapNavigatorItem) element;
			return MindmapVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
