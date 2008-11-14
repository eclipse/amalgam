package org.eclipse.amalgam.examples.bpmn.figures;

import org.eclipse.draw2d.Ellipse;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.StackLayout;

/**
 * @generated
 */
public class HeavyOutlineCircle extends RectangleFigure {

	/**
	 * @generated
	 */
	public HeavyOutlineCircle() {
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
		circle0.setLineWidth(3);

		this.add(circle0);

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
