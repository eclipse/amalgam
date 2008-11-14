package org.eclipse.amalgam.examples.dnc.figures;

import org.eclipse.amalgam.examples.dnc.figures.activator.PluginActivator;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;

/**
 * @generated
 */
public class ListItemLabel extends WrappingLabel {

	/**
	 * @generated
	 */
	public ListItemLabel() {
		this.setText("");

		this.setBorder(new MarginBorder(PluginActivator.getDefault()
				.getMapMode().DPtoLP(2), PluginActivator.getDefault()
				.getMapMode().DPtoLP(5), PluginActivator.getDefault()
				.getMapMode().DPtoLP(0), PluginActivator.getDefault()
				.getMapMode().DPtoLP(0)));
	}

}
