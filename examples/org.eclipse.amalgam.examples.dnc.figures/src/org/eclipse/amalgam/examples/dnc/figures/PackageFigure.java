package org.eclipse.amalgam.examples.dnc.figures;

import org.eclipse.amalgam.examples.dnc.figures.activator.PluginActivator;
import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Display;

/**
 * @generated
 */
public class PackageFigure extends RectangleFigure {

	/**
	 * @generated
	 */
	private WrappingLabel fFigureName;
	/**
	 * @generated
	 */
	private WrappingLabel fFigureStereotype;

	/**
	 * @generated
	 */
	public PackageFigure() {

		this.setBorder(new MarginBorder(PluginActivator.getDefault()
				.getMapMode().DPtoLP(0), PluginActivator.getDefault()
				.getMapMode().DPtoLP(0), PluginActivator.getDefault()
				.getMapMode().DPtoLP(5), PluginActivator.getDefault()
				.getMapMode().DPtoLP(0)));
		createContents();
	}

	/**
	 * @generated
	 */
	private void createContents() {
		/*FIXME referenced figures are just not yet fully-functional; need process attrs and layout here*/

		RoundedRectangle innerRectangle0 = new RoundedRectangle();
		innerRectangle0.setCornerDimensions(new Dimension(PluginActivator
				.getDefault().getMapMode().DPtoLP(8), PluginActivator
				.getDefault().getMapMode().DPtoLP(8)));
		innerRectangle0.setFill(false);
		innerRectangle0.setOutline(false);

		this.add(innerRectangle0);

		ToolbarLayout layoutInnerRectangle0 = new ToolbarLayout();
		layoutInnerRectangle0.setStretchMinorAxis(true);
		layoutInnerRectangle0.setMinorAlignment(ToolbarLayout.ALIGN_CENTER);

		layoutInnerRectangle0.setSpacing(0);
		layoutInnerRectangle0.setVertical(true);

		innerRectangle0.setLayoutManager(layoutInnerRectangle0);

		RectangleFigure nameArea1 = new RectangleFigure();
		nameArea1.setFill(false);
		nameArea1.setOutline(false);

		innerRectangle0.add(nameArea1);

		GridLayout layoutNameArea1 = new GridLayout();
		layoutNameArea1.numColumns = 1;
		layoutNameArea1.makeColumnsEqualWidth = true;
		nameArea1.setLayoutManager(layoutNameArea1);

		fFigureName = new WrappingLabel();
		fFigureName.setText("");

		fFigureName.setFont(FFIGURENAME_FONT);

		GridData constraintFFigureName = new GridData();
		constraintFFigureName.verticalAlignment = GridData.CENTER;
		constraintFFigureName.horizontalAlignment = GridData.CENTER;
		constraintFFigureName.horizontalIndent = 0;
		constraintFFigureName.horizontalSpan = 1;
		constraintFFigureName.verticalSpan = 1;
		constraintFFigureName.grabExcessHorizontalSpace = true;
		constraintFFigureName.grabExcessVerticalSpace = true;
		nameArea1.add(fFigureName, constraintFFigureName);

		RectangleFigure stereotypeArea1 = new RectangleFigure();
		stereotypeArea1.setFill(false);
		stereotypeArea1.setOutline(false);
		stereotypeArea1.setMinimumSize(new Dimension(PluginActivator
				.getDefault().getMapMode().DPtoLP(80), PluginActivator
				.getDefault().getMapMode().DPtoLP(0)));

		innerRectangle0.add(stereotypeArea1);

		GridLayout layoutStereotypeArea1 = new GridLayout();
		layoutStereotypeArea1.numColumns = 1;
		layoutStereotypeArea1.makeColumnsEqualWidth = true;
		stereotypeArea1.setLayoutManager(layoutStereotypeArea1);

		fFigureStereotype = new WrappingLabel();
		fFigureStereotype.setText("");

		GridData constraintFFigureStereotype = new GridData();
		constraintFFigureStereotype.verticalAlignment = GridData.CENTER;
		constraintFFigureStereotype.horizontalAlignment = GridData.CENTER;
		constraintFFigureStereotype.horizontalIndent = 0;
		constraintFFigureStereotype.horizontalSpan = 1;
		constraintFFigureStereotype.verticalSpan = 1;
		constraintFFigureStereotype.grabExcessHorizontalSpace = true;
		constraintFFigureStereotype.grabExcessVerticalSpace = true;
		stereotypeArea1.add(fFigureStereotype, constraintFFigureStereotype);

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

	/**
	 * @generated
	 */
	public WrappingLabel getFigureStereotype() {
		return fFigureStereotype;
	}

	/**
	 * @generated
	 */
	static final Font FFIGURENAME_FONT = new Font(Display.getCurrent(), Display
			.getDefault().getSystemFont().getFontData()[0].getName(), 11,
			SWT.NORMAL);

}
