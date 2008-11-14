package org.eclipse.amalgam.examples.scenario.diagram.custom.providers;

import org.eclipse.amalgam.examples.scenario.diagram.custom.actions.DisplayDefaultFigureAction;
import org.eclipse.amalgam.examples.scenario.diagram.custom.actions.SetHyperlinkAction;
import org.eclipse.gmf.runtime.common.ui.services.action.contributionitem.AbstractContributionItemProvider;
import org.eclipse.gmf.runtime.common.ui.util.IWorkbenchPartDescriptor;
import org.eclipse.jface.action.IAction;

public class ContributionItemProvider extends AbstractContributionItemProvider {

	protected IAction createAction(String actionId, IWorkbenchPartDescriptor partDescriptor) {
		if (actionId.equals(DisplayDefaultFigureAction.ID)) {
			return new DisplayDefaultFigureAction(partDescriptor.getPartPage());
		}
		if (actionId.equals(SetHyperlinkAction.ID)) {
			return new SetHyperlinkAction(partDescriptor.getPartPage());
		}
		return super.createAction(actionId, partDescriptor);
	}
}
