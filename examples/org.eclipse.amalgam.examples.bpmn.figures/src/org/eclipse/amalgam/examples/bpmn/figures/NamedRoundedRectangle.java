package org.eclipse.amalgam.examples.bpmn.figures;

import java.util.List;

import org.eclipse.amalgam.examples.bpmn.figures.activator.PluginActivator;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;

/**
 * @generated
 */
public class NamedRoundedRectangle extends RoundedRectangle {

	/**
	 * @generated
	 */
	private WrappingLabel fFigureName;

	/**
	 * Modified to include centered stack layout.
	 * 
	 * @generated NOT
	 */
	public NamedRoundedRectangle() {
		this.setLayoutManager(new StackLayout() {
			public void layout(IFigure figure) {
				Rectangle r = figure.getClientArea();
				List children = figure.getChildren();
				IFigure child;
				Dimension d;
				for (int i = 0; i < children.size(); i++) {
					child = (IFigure) children.get(i);
					d = child.getPreferredSize(r.width, r.height);
					d.width = Math.min(d.width, r.width);
					d.height = Math.min(d.height, r.height);
					Rectangle childRect = new Rectangle(r.x
							+ (r.width - d.width) / 2, r.y
							+ (r.height - d.height) / 2, d.width, d.height);
					child.setBounds(childRect);
				}
			}
		});
		this.setCornerDimensions(new Dimension(PluginActivator.getDefault()
				.getMapMode().DPtoLP(8), PluginActivator.getDefault()
				.getMapMode().DPtoLP(8)));
		this.setPreferredSize(new Dimension(PluginActivator.getDefault()
				.getMapMode().DPtoLP(80), PluginActivator.getDefault()
				.getMapMode().DPtoLP(40)));
		this.setMinimumSize(new Dimension(PluginActivator.getDefault()
				.getMapMode().DPtoLP(80), PluginActivator.getDefault()
				.getMapMode().DPtoLP(40)));

		this.setBorder(new MarginBorder(PluginActivator.getDefault()
				.getMapMode().DPtoLP(5), PluginActivator.getDefault()
				.getMapMode().DPtoLP(5), PluginActivator.getDefault()
				.getMapMode().DPtoLP(5), PluginActivator.getDefault()
				.getMapMode().DPtoLP(5)));
		createContents();
	}

	/**
	 * Modified to wrap centered text.
	 * @generated NOT
	 */
	private void createContents() {

		fFigureName = new WrappingLabel();
		fFigureName.setTextWrap(true);
		fFigureName.setAlignment(PositionConstants.CENTER);
		fFigureName.setText("");

		this.add(fFigureName);

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

	/**
	 * @generated
	 */
	public WrappingLabel getFigureName() {
		return fFigureName;
	}

}
