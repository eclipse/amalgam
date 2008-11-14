package org.eclipse.amalgam.examples.requirements.diagram.edit.policies;

import org.eclipse.amalgam.examples.requirements.Requirement;
import org.eclipse.amalgam.examples.requirements.diagram.edit.parts.RequirementEditPart;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.draw2d.text.FlowPage;
import org.eclipse.draw2d.text.ParagraphTextLayout;
import org.eclipse.draw2d.text.TextFlow;
import org.eclipse.gef.Request;
import org.eclipse.gef.editpolicies.GraphicalEditPolicy;
import org.eclipse.gef.requests.LocationRequest;

public class RequirementsTooltipEditPolicy extends GraphicalEditPolicy {

	Shape tooltip;
	RequirementEditPart editPart;

	@Override
	public void showTargetFeedback(Request request) {
		if (tooltip == null && request instanceof LocationRequest) {
			editPart = (org.eclipse.amalgam.examples.requirements.diagram.edit.parts.RequirementEditPart) getHost();
			Requirement element = (Requirement) editPart
					.resolveSemanticElement();

			tooltip = new RoundedRectangle();
			tooltip.setBackgroundColor(ColorConstants.titleGradient);
			tooltip.setLayoutManager(new StackLayout());
			tooltip.setBounds(new Rectangle(getHostFigure().getBounds()
					.getBottomRight().x, getHostFigure().getBounds()
					.getBottomRight().y, 200, 100));
			tooltip.setBorder(new MarginBorder(3));

			FlowPage flowPage = new FlowPage();
			TextFlow textFlow = new TextFlow();
			textFlow.setLayoutManager(new ParagraphTextLayout(textFlow,
					ParagraphTextLayout.WORD_WRAP_TRUNCATE));
			flowPage.add(textFlow);
			tooltip.add(flowPage);
			textFlow.setText(buildText(element));

			addFeedback(tooltip);
		}
	}

	private String buildText(Requirement element) {
		StringBuilder sb = new StringBuilder();

		sb.append("Title");
		sb.append(": ");
		sb.append(element.getTitle());
		sb.append("\n\n");

		sb.append("Author");
		sb.append(": ");
		sb.append(element.getAuthor());
		sb.append("\n\n");

		return sb.toString();
	}

	@Override
	public void eraseTargetFeedback(Request request) {
		if (tooltip != null) {
			removeFeedback(tooltip);
			tooltip = null;
			editPart = null;
		}
	}

}
