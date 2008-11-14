package org.eclipse.amalgam.examples.scenario.diagram.custom.providers;

import org.eclipse.amalgam.examples.scenario.Event;
import org.eclipse.amalgam.examples.scenario.EventType;
import org.eclipse.amalgam.examples.scenario.diagram.custom.edit.parts.IntermediateEventImageEditPart;
import org.eclipse.gmf.runtime.diagram.ui.services.editpart.AbstractEditPartProvider;
import org.eclipse.gmf.runtime.notation.View;

public class ScenarioEditPartProvider extends AbstractEditPartProvider {

	@Override
	protected Class getNodeEditPartClass(View view) {
		if (view.getElement() instanceof Event && ((Event) view.getElement()).getEventType().getValue() == EventType.INTERMEDIATE_VALUE) {
			return IntermediateEventImageEditPart.class;
		}
		return super.getNodeEditPartClass(view);
	}
}
