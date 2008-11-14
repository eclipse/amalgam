package org.eclipse.amalgam.examples.bpmn.figures;

import org.eclipse.amalgam.examples.bpmn.figures.activator.PluginActivator;
import org.eclipse.draw2d.Ellipse;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.Polyline;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;

/**
 * @generated
 */
public class DoubleCircleWithEnvelope extends RectangleFigure {

	/**
	 * @generated
	 */
	public DoubleCircleWithEnvelope() {
		this.setLayoutManager(new StackLayout());
		this.setFill(false);
		this.setOutline(false);
		this.setLineWidth(0);
		createContents();
	}

	/**
	 * Modified to draw double line circle.
	 * 
	 * @generated NOT
	 */
	private void createContents() {

		Ellipse circle0 = new Ellipse(){
		    @Override
		    protected void outlineShape(Graphics graphics) {
		      super.outlineShape(graphics);
		      Rectangle inner = Rectangle.SINGLETON;
		      inner.width = getBounds().width - 5;
		      inner.height = getBounds().height - 5;
		      inner.x = getBounds().x + 2;
		      inner.y = getBounds().y + 2;
		      graphics.drawOval(inner);
		    }
		  };
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
	 * @generated NOT
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
