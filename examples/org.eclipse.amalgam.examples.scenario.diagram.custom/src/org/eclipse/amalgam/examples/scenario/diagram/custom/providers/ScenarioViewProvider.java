package org.eclipse.amalgam.examples.scenario.diagram.custom.providers;

import org.eclipse.amalgam.examples.scenario.diagram.custom.factories.IntermediateEventImageViewFactory;
import org.eclipse.amalgam.examples.scenario.diagram.edit.parts.Event2EditPart;
import org.eclipse.amalgam.examples.scenario.diagram.part.ScenarioVisualIDRegistry;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.core.providers.AbstractViewProvider;
import org.eclipse.gmf.runtime.notation.View;

public class ScenarioViewProvider extends AbstractViewProvider {

	@Override
	protected Class getNodeViewClass(IAdaptable semanticAdapter, View containerView, String semanticHint) {
		if (containerView == null) {
			return null;
		}

		EObject semanticElement = getSemanticElement(semanticAdapter);
		int nodeVID = ScenarioVisualIDRegistry.getNodeVisualID(containerView, semanticElement);
		if (nodeVID == Event2EditPart.VISUAL_ID) {
			return IntermediateEventImageViewFactory.class;
		}
		return null;
	}
}
