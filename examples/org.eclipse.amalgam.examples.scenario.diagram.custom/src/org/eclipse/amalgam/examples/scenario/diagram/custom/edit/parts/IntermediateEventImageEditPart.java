package org.eclipse.amalgam.examples.scenario.diagram.custom.edit.parts;

import java.net.URL;

import org.eclipse.amalgam.examples.scenario.diagram.custom.Activator;
import org.eclipse.amalgam.examples.scenario.diagram.custom.style.CustomStyle;
import org.eclipse.amalgam.examples.scenario.diagram.custom.style.StylePackage;
import org.eclipse.amalgam.examples.scenario.diagram.edit.parts.Event2EditPart;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gmf.runtime.draw2d.ui.render.factory.RenderedImageFactory;
import org.eclipse.gmf.runtime.draw2d.ui.render.figures.ScalableImageFigure;
import org.eclipse.gmf.runtime.notation.View;

public class IntermediateEventImageEditPart extends Event2EditPart {

	public IntermediateEventImageEditPart(View view) {
		super(view);
	}

	protected IFigure createNodeShape() {
		CustomStyle style = (CustomStyle) getNotationView().getStyle(StylePackage.eINSTANCE.getCustomStyle());
		if (style == null || style.isDefault()) {
			return super.createNodeShape();
		}
		URL url = FileLocator.find(Activator.getDefault().getBundle(), new Path("images" + IPath.SEPARATOR + "ievent.svg"), null);
		return new ScalableImageFigure(RenderedImageFactory.getInstance(url), true, true, true);
	}

	protected void handleNotificationEvent(Notification notification) {
		Object feature = notification.getFeature();
		if (StylePackage.eINSTANCE.getCustomStyle_Default().equals(feature)) {
			handleMajorSemanticChange();
		} else {
			super.handleNotificationEvent(notification);
		}
	}
}
