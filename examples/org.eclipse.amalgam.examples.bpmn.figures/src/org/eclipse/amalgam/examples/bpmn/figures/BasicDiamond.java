package org.eclipse.amalgam.examples.bpmn.figures;

import org.eclipse.amalgam.examples.bpmn.figures.activator.PluginActivator;
import org.eclipse.draw2d.Polygon;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Point;

/**
 * @generated
 */
public class BasicDiamond extends RectangleFigure {

	/**
	 * @generated
	 */
	public BasicDiamond() {
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
		diamond0.setFill(true);

		this.add(diamond0);

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
