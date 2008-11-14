package org.eclipse.amalgam.examples.bpmn.figures;

import java.util.List;

import org.eclipse.amalgam.examples.bpmn.figures.activator.PluginActivator;
import org.eclipse.draw2d.BorderLayout;
import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;

/**
 * @generated
 */
public class CollapsedNamedRoundedRectangle extends RoundedRectangle {

	/**
	 * @generated
	 */
	private WrappingLabel fFigureProcessName;

	/**
	 * @generated
	 */
	public CollapsedNamedRoundedRectangle() {

		BorderLayout layoutThis = new BorderLayout();
		this.setLayoutManager(layoutThis);

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
				.getMapMode().DPtoLP(0), PluginActivator.getDefault()
				.getMapMode().DPtoLP(5)));
		createContents();
	}

	/**
	 * Modified to use centered stack layout and centered wrapping text.
	 * 
	 * @generated NOT
	 */
	private void createContents() {

		RectangleFigure nameArea0 = new RectangleFigure();
		nameArea0.setFill(false);
		nameArea0.setOutline(false);

		this.add(nameArea0, BorderLayout.CENTER);
		nameArea0.setLayoutManager(new StackLayout() {
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

		fFigureProcessName = new WrappingLabel();
		fFigureProcessName.setTextWrap(true);
		fFigureProcessName.setAlignment(PositionConstants.CENTER);
		fFigureProcessName.setText("");

		nameArea0.add(fFigureProcessName);

		RectangleFigure collapseArea0 = new RectangleFigure();
		collapseArea0.setFill(false);
		collapseArea0.setOutline(false);

		collapseArea0.setBorder(new MarginBorder(PluginActivator.getDefault()
				.getMapMode().DPtoLP(5), PluginActivator.getDefault()
				.getMapMode().DPtoLP(0), PluginActivator.getDefault()
				.getMapMode().DPtoLP(0), PluginActivator.getDefault()
				.getMapMode().DPtoLP(0)));

		this.add(collapseArea0, BorderLayout.BOTTOM);

		GridLayout layoutCollapseArea0 = new GridLayout();
		layoutCollapseArea0.numColumns = 1;
		layoutCollapseArea0.makeColumnsEqualWidth = true;
		collapseArea0.setLayoutManager(layoutCollapseArea0);

		/*FIXME referenced figures are just not yet fully-functional; need process attrs and layout here*/

		RectangleFigure expandBox1 = new RectangleFigure();
		expandBox1.setFill(false);
		expandBox1.setPreferredSize(new Dimension(PluginActivator.getDefault()
				.getMapMode().DPtoLP(10), PluginActivator.getDefault()
				.getMapMode().DPtoLP(10)));
		expandBox1.setMaximumSize(new Dimension(PluginActivator.getDefault()
				.getMapMode().DPtoLP(10), PluginActivator.getDefault()
				.getMapMode().DPtoLP(10)));
		expandBox1.setMinimumSize(new Dimension(PluginActivator.getDefault()
				.getMapMode().DPtoLP(10), PluginActivator.getDefault()
				.getMapMode().DPtoLP(10)));

		expandBox1.setBorder(new MarginBorder(PluginActivator.getDefault()
				.getMapMode().DPtoLP(-1), PluginActivator.getDefault()
				.getMapMode().DPtoLP(1), PluginActivator.getDefault()
				.getMapMode().DPtoLP(0), PluginActivator.getDefault()
				.getMapMode().DPtoLP(0)));

		GridData constraintExpandBox1 = new GridData();
		constraintExpandBox1.verticalAlignment = GridData.CENTER;
		constraintExpandBox1.horizontalAlignment = GridData.CENTER;
		constraintExpandBox1.horizontalIndent = 0;
		constraintExpandBox1.horizontalSpan = 1;
		constraintExpandBox1.verticalSpan = 1;
		constraintExpandBox1.grabExcessHorizontalSpace = true;
		constraintExpandBox1.grabExcessVerticalSpace = false;
		collapseArea0.add(expandBox1, constraintExpandBox1);

		expandBox1.setLayoutManager(new StackLayout());

		WrappingLabel plus2 = new WrappingLabel();
		plus2.setText("+");

		expandBox1.add(plus2);

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
	public WrappingLabel getFigureProcessName() {
		return fFigureProcessName;
	}

}
