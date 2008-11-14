package org.eclipse.amalgam.examples.bpmn.figures;

import org.eclipse.amalgam.examples.bpmn.figures.activator.PluginActivator;
import org.eclipse.draw2d.Polygon;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;

/**
 * @generated
 */
public class Document extends RectangleFigure {

	/**
	 * @generated
	 */
	private WrappingLabel fFigureSimpleLabel;

	/**
	 * @generated
	 */
	public Document() {
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

		Polygon dogEarPage0 = new Polygon();
		dogEarPage0.addPoint(new Point(PluginActivator.getDefault()
				.getMapMode().DPtoLP(16), PluginActivator.getDefault()
				.getMapMode().DPtoLP(0)));
		dogEarPage0.addPoint(new Point(PluginActivator.getDefault()
				.getMapMode().DPtoLP(20), PluginActivator.getDefault()
				.getMapMode().DPtoLP(4)));
		dogEarPage0.addPoint(new Point(PluginActivator.getDefault()
				.getMapMode().DPtoLP(20), PluginActivator.getDefault()
				.getMapMode().DPtoLP(25)));
		dogEarPage0.addPoint(new Point(PluginActivator.getDefault()
				.getMapMode().DPtoLP(0), PluginActivator.getDefault()
				.getMapMode().DPtoLP(25)));
		dogEarPage0.addPoint(new Point(PluginActivator.getDefault()
				.getMapMode().DPtoLP(0), PluginActivator.getDefault()
				.getMapMode().DPtoLP(0)));
		dogEarPage0.addPoint(new Point(PluginActivator.getDefault()
				.getMapMode().DPtoLP(16), PluginActivator.getDefault()
				.getMapMode().DPtoLP(0)));
		dogEarPage0.addPoint(new Point(PluginActivator.getDefault()
				.getMapMode().DPtoLP(16), PluginActivator.getDefault()
				.getMapMode().DPtoLP(4)));
		dogEarPage0.addPoint(new Point(PluginActivator.getDefault()
				.getMapMode().DPtoLP(20), PluginActivator.getDefault()
				.getMapMode().DPtoLP(4)));
		dogEarPage0.setFill(true);

		this.add(dogEarPage0);

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

	/**
	 * @generated
	 */
	public WrappingLabel getFigureSimpleLabel() {
		return fFigureSimpleLabel;
	}

}
