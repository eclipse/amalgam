package org.eclipse.amalgam.examples.bpmn.figures;

import org.eclipse.amalgam.examples.bpmn.figures.activator.PluginActivator;
import org.eclipse.amalgam.examples.bpmn.figures.CircleDecoration;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.PolygonDecoration;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;

/**
 * @generated
 */
public class DashedLineCircleAndHollowPoint extends PolylineConnectionEx {

	/**
	 * @generated
	 */
	public DashedLineCircleAndHollowPoint() {
		this.setLineStyle(Graphics.LINE_DASH);

		setSourceDecoration(createSourceDecoration());
		setTargetDecoration(createTargetDecoration());
	}

	/**
	 * @generated
	 */
	private RotatableDecoration createSourceDecoration() {
		CircleDecoration df = new CircleDecoration();

		df.setRadius(3);

		return df;
	}

	/**
	 * @generated
	 */
	private RotatableDecoration createTargetDecoration() {
		PolygonDecoration df = new PolygonDecoration();
		df.setFill(true);
		df.setBackgroundColor(ColorConstants.white);
		PointList pl = new PointList();
		pl.addPoint(PluginActivator.getDefault().getMapMode().DPtoLP(0),
				PluginActivator.getDefault().getMapMode().DPtoLP(0));
		pl.addPoint(PluginActivator.getDefault().getMapMode().DPtoLP(-1),
				PluginActivator.getDefault().getMapMode().DPtoLP(1));
		pl.addPoint(PluginActivator.getDefault().getMapMode().DPtoLP(-1),
				PluginActivator.getDefault().getMapMode().DPtoLP(-1));
		pl.addPoint(PluginActivator.getDefault().getMapMode().DPtoLP(0),
				PluginActivator.getDefault().getMapMode().DPtoLP(0));
		df.setTemplate(pl);
		df.setScale(PluginActivator.getDefault().getMapMode().DPtoLP(7),
				PluginActivator.getDefault().getMapMode().DPtoLP(3));
		return df;
	}

}
