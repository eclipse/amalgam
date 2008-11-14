package org.eclipse.amalgam.examples.dnc.diagram.view.factories;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.Package3EditPart;
import org.eclipse.amalgam.examples.dnc.diagram.part.DncVisualIDRegistry;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.view.factories.AbstractLabelViewFactory;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class Package3ViewFactory extends AbstractLabelViewFactory {

	/**
	 * @generated
	 */
	protected List createStyles(View view) {
		List styles = new ArrayList();
		return styles;
	}

	/**
	 * @generated
	 */
	protected void decorateView(View containerView, View view,
			IAdaptable semanticAdapter, String semanticHint, int index,
			boolean persisted) {
		if (semanticHint == null) {
			semanticHint = DncVisualIDRegistry
					.getType(Package3EditPart.VISUAL_ID);
			view.setType(semanticHint);
		}
		super.decorateView(containerView, view, semanticAdapter, semanticHint,
				index, persisted);
	}
}
