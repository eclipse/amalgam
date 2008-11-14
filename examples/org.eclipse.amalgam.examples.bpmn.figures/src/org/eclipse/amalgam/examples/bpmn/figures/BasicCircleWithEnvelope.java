package org.eclipse.amalgam.examples.bpmn.figures;

import org.eclipse.amalgam.examples.bpmn.figures.activator.PluginActivator;
import org.eclipse.draw2d.Ellipse;
import org.eclipse.draw2d.Polyline;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Point;

/**
 * @generated
 */
public class BasicCircleWithEnvelope extends RectangleFigure {

	/**
	 * @generated
	 */
	public BasicCircleWithEnvelope() {
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

		Ellipse circle0 = new Ellipse();

		this.add(circle0);

		/*FIXME referenced figures are just not yet fully-functional; need process attrs and layout here*/

		Polyline envelope0 = new Polyline();
		envelope0
				.addPoint(new Point(PluginActivator.getDefault().getMapMode()
						.DPtoLP(5), PluginActivator.getDefault().getMapMode()
						.DPtoLP(6)));
		envelope0.addPoint(new Point(PluginActivator.getDefault().getMapMode()
				.DPtoLP(14), PluginActivator.getDefault().getMapMode()
				.DPtoLP(6)));
		envelope0.addPoint(new Point(PluginActivator.getDefault().getMapMode()
				.DPtoLP(14), PluginActivator.getDefault().getMapMode().DPtoLP(
				13)));
		envelope0.addPoint(new Point(PluginActivator.getDefault().getMapMode()
				.DPtoLP(5), PluginActivator.getDefault().getMapMode()
				.DPtoLP(13)));
		envelope0
				.addPoint(new Point(PluginActivator.getDefault().getMapMode()
						.DPtoLP(5), PluginActivator.getDefault().getMapMode()
						.DPtoLP(6)));
		envelope0.addPoint(new Point(PluginActivator.getDefault().getMapMode()
				.DPtoLP(9), PluginActivator.getDefault().getMapMode()
				.DPtoLP(10)));
		envelope0.addPoint(new Point(PluginActivator.getDefault().getMapMode()
				.DPtoLP(10), PluginActivator.getDefault().getMapMode().DPtoLP(
				10)));
		envelope0.addPoint(new Point(PluginActivator.getDefault().getMapMode()
				.DPtoLP(14), PluginActivator.getDefault().getMapMode()
				.DPtoLP(6)));

		this.add(envelope0);

	}

	/**
	 * @generated
	 */
	private boolean myUseLocalCoordinates = false;

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
