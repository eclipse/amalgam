package org.eclipse.amalgam.examples.bpmn.figures;

import org.eclipse.amalgam.examples.bpmn.figures.activator.PluginActivator;
import org.eclipse.draw2d.Ellipse;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.Polygon;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Point;

/**
 * @generated
 */
public class DiamondCircle extends RectangleFigure {

	/**
	 * @generated
	 */
	public DiamondCircle() {
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

		RectangleFigure heavyOutlineCircle0 = new RectangleFigure();
		heavyOutlineCircle0.setFill(false);
		heavyOutlineCircle0.setOutline(false);
		heavyOutlineCircle0.setLineWidth(0);

		heavyOutlineCircle0.setBorder(new MarginBorder(PluginActivator
				.getDefault().getMapMode().DPtoLP(7), PluginActivator
				.getDefault().getMapMode().DPtoLP(7), PluginActivator
				.getDefault().getMapMode().DPtoLP(7), PluginActivator
				.getDefault().getMapMode().DPtoLP(7)));

		this.add(heavyOutlineCircle0);
		heavyOutlineCircle0.setLayoutManager(new StackLayout());

		Ellipse circle1 = new Ellipse();
		circle1.setLineWidth(3);

		heavyOutlineCircle0.add(circle1);

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
