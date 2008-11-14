package org.eclipse.amalgam.examples.dnc.figures;

import org.eclipse.amalgam.examples.dnc.figures.activator.PluginActivator;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Display;

/**
 * @generated
 */
public class AnnotationFigure extends RectangleFigure {

	/**
	 * @generated
	 */
	private WrappingLabel fFigureStereotype;
	/**
	 * @generated
	 */
	private WrappingLabel fFigureName;

	/**
	 * @generated
	 */
	public AnnotationFigure() {

		ToolbarLayout layoutThis = new ToolbarLayout();
		layoutThis.setStretchMinorAxis(true);
		layoutThis.setMinorAlignment(ToolbarLayout.ALIGN_CENTER);

		layoutThis.setSpacing(0);
		layoutThis.setVertical(true);

		this.setLayoutManager(layoutThis);

		this.setLineStyle(Graphics.LINE_DASH);

		this.setBorder(new MarginBorder(PluginActivator.getDefault()
				.getMapMode().DPtoLP(0), PluginActivator.getDefault()
				.getMapMode().DPtoLP(5), PluginActivator.getDefault()
				.getMapMode().DPtoLP(0), PluginActivator.getDefault()
				.getMapMode().DPtoLP(5)));
		createContents();
	}

	/**
	 * @generated
	 */
	private void createContents() {
		/*FIXME referenced figures are just not yet fully-functional; need process attrs and layout here*/

		RectangleFigure stereotypeArea0 = new RectangleFigure();
		stereotypeArea0.setFill(false);
		stereotypeArea0.setOutline(false);
		stereotypeArea0.setMinimumSize(new Dimension(PluginActivator
				.getDefault().getMapMode().DPtoLP(80), PluginActivator
				.getDefault().getMapMode().DPtoLP(0)));

		this.add(stereotypeArea0);

		GridLayout layoutStereotypeArea0 = new GridLayout();
		layoutStereotypeArea0.numColumns = 1;
		layoutStereotypeArea0.makeColumnsEqualWidth = true;
		stereotypeArea0.setLayoutManager(layoutStereotypeArea0);

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
		stereotypeArea0.add(fFigureStereotype, constraintFFigureStereotype);

		/*FIXME referenced figures are just not yet fully-functional; need process attrs and layout here*/

		RectangleFigure nameArea0 = new RectangleFigure();
		nameArea0.setFill(false);
		nameArea0.setOutline(false);

		this.add(nameArea0);

		GridLayout layoutNameArea0 = new GridLayout();
		layoutNameArea0.numColumns = 1;
		layoutNameArea0.makeColumnsEqualWidth = true;
		nameArea0.setLayoutManager(layoutNameArea0);

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
		nameArea0.add(fFigureName, constraintFFigureName);

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
	public WrappingLabel getFigureStereotype() {
		return fFigureStereotype;
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
	static final Font FFIGURENAME_FONT = new Font(Display.getCurrent(), Display
			.getDefault().getSystemFont().getFontData()[0].getName(), 11,
			SWT.NORMAL);

}
