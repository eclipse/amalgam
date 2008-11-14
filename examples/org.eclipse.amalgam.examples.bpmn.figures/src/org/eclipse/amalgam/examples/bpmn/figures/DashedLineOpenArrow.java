package org.eclipse.amalgam.examples.bpmn.figures;

import org.eclipse.amalgam.examples.bpmn.figures.activator.PluginActivator;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.PolylineDecoration;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;

/**
 * @generated
 */
public class DashedLineOpenArrow extends PolylineConnectionEx {

	/**
	 * @generated
	 */
	public DashedLineOpenArrow() {
		this.setLineStyle(Graphics.LINE_DASH);

		setTargetDecoration(createTargetDecoration());
	}

	/**
	 * @generated
	 */
	private RotatableDecoration createTargetDecoration() {
		PolylineDecoration df = new PolylineDecoration();
		PointList pl = new PointList();
		pl.addPoint(PluginActivator.getDefault().getMapMode().DPtoLP(-1),
				PluginActivator.getDefault().getMapMode().DPtoLP(1));
		pl.addPoint(PluginActivator.getDefault().getMapMode().DPtoLP(0),
				PluginActivator.getDefault().getMapMode().DPtoLP(0));
		pl.addPoint(PluginActivator.getDefault().getMapMode().DPtoLP(-1),
				PluginActivator.getDefault().getMapMode().DPtoLP(-1));
		df.setTemplate(pl);
		df.setScale(PluginActivator.getDefault().getMapMode().DPtoLP(7),
				PluginActivator.getDefault().getMapMode().DPtoLP(3));
		return df;
	}

}
