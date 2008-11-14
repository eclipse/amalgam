package org.eclipse.amalgam.examples.scenario.diagram.navigator;

import org.eclipse.amalgam.examples.scenario.diagram.part.ScenarioVisualIDRegistry;
import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class ScenarioNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 4007;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof ScenarioNavigatorItem) {
			ScenarioNavigatorItem item = (ScenarioNavigatorItem) element;
			return ScenarioVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
