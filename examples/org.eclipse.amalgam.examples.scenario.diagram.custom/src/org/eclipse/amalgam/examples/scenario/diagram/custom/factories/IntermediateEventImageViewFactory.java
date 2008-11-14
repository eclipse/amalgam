package org.eclipse.amalgam.examples.scenario.diagram.custom.factories;

import java.util.List;

import org.eclipse.amalgam.examples.scenario.diagram.custom.style.CustomStyle;
import org.eclipse.amalgam.examples.scenario.diagram.custom.style.StyleFactory;
import org.eclipse.amalgam.examples.scenario.diagram.custom.style.StylePackage;
import org.eclipse.amalgam.examples.scenario.diagram.view.factories.Event2ViewFactory;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.notation.View;

public class IntermediateEventImageViewFactory extends Event2ViewFactory {
	@Override
	protected void decorateView(View containerView, View view, IAdaptable semanticAdapter, String semanticHint, int index, boolean persisted) {
		super.decorateView(containerView, view, semanticAdapter, semanticHint, index, persisted);
		
		CustomStyle style = (CustomStyle) view.getStyle(StylePackage.eINSTANCE.getCustomStyle());
		style.setDefault(false);
	}
	@Override
	protected List createStyles(View view) {
		List styles = super.createStyles(view);
		styles.add(StyleFactory.eINSTANCE.createCustomStyle());
		return styles;
	}
}
