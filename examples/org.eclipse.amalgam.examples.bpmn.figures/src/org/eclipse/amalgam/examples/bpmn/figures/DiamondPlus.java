package org.eclipse.amalgam.examples.bpmn.figures;

import org.eclipse.amalgam.examples.bpmn.figures.activator.PluginActivator;
import org.eclipse.draw2d.Polygon;
import org.eclipse.draw2d.Polyline;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Point;

/**
 * @generated
 */
public class DiamondPlus extends RectangleFigure {

	/**
	 * @generated
	 */
	public DiamondPlus() {
		this.setLayoutManager(new StackLayout());
		this.setFill(false);
		this.setOutline(false);
		this.setLineWidth(0);
		createContents();
	}

	/**
	 * @generated
	 */
	private void createContents() {

		Polygon diamond0 = new Polygon();
		diamond0.addPoint(new Point(PluginActivator.getDefault().getMapMode()
				.DPtoLP(15), PluginActivator.getDefault().getMapMode()
				.DPtoLP(0)));
		diamond0.addPoint(new Point(PluginActivator.getDefault().getMapMode()
				.DPtoLP(0), PluginActivator.getDefault().getMapMode()
				.DPtoLP(15)));
		diamond0.addPoint(new Point(PluginActivator.getDefault().getMapMode()
				.DPtoLP(15), PluginActivator.getDefault().getMapMode().DPtoLP(
				30)));
		diamond0.addPoint(new Point(PluginActivator.getDefault().getMapMode()
				.DPtoLP(30), PluginActivator.getDefault().getMapMode().DPtoLP(
				15)));

		this.add(diamond0);

		Polyline vertical0 = new Polyline();
		vertical0.addPoint(new Point(PluginActivator.getDefault().getMapMode()
				.DPtoLP(15), PluginActivator.getDefault().getMapMode()
				.DPtoLP(8)));
		vertical0.addPoint(new Point(PluginActivator.getDefault().getMapMode()
				.DPtoLP(15), PluginActivator.getDefault().getMapMode().DPtoLP(
				22)));
		vertical0.setLineWidth(3);

		this.add(vertical0);

		Polyline horizontal0 = new Polyline();
		horizontal0.addPoint(new Point(PluginActivator.getDefault()
				.getMapMode().DPtoLP(8), PluginActivator.getDefault()
				.getMapMode().DPtoLP(15)));
		horizontal0.addPoint(new Point(PluginActivator.getDefault()
				.getMapMode().DPtoLP(22), PluginActivator.getDefault()
				.getMapMode().DPtoLP(15)));
		horizontal0.setLineWidth(3);

		this.add(horizontal0);

	}

	/**
	 * @generated
	 */
	private boolean myUseLocalCoordinates = true;

	/**
	 * @generated
	 */
	protected boolean useLocalCoordinates() {
		return myUseLocalCoordinates;
	}

	/**
	 * @generated
	 */
	protected void setUseLocalCoordinates(boolean useLocalCoordinates) {
		myUseLocalCoordinates = useLocalCoordinates;
	}

}
