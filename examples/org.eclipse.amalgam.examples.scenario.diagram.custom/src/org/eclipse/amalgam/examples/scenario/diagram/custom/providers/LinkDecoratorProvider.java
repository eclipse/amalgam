package org.eclipse.amalgam.examples.scenario.diagram.custom.providers;

import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.diagram.ui.services.decorator.CreateDecoratorsOperation;
import org.eclipse.gmf.runtime.diagram.ui.services.decorator.IDecoratorProvider;
import org.eclipse.gmf.runtime.diagram.ui.services.decorator.IDecoratorTarget;
import org.eclipse.gmf.runtime.notation.Node;

public class LinkDecoratorProvider extends AbstractProvider implements IDecoratorProvider {

	public static final String HYPERLINK_DECORATOR_ID = "hyperlink";

	public boolean provides(IOperation operation) {
		if (false == operation instanceof CreateDecoratorsOperation) {
			return false;
		}
		IDecoratorTarget decoratorTarget = ((CreateDecoratorsOperation) operation).getDecoratorTarget();
		return LinkDecorator.getDecoratorTargetNode(decoratorTarget) != null;
	}

	public void createDecorators(IDecoratorTarget decoratorTarget) {
		Node node = LinkDecorator.getDecoratorTargetNode(decoratorTarget);
		if (node != null) {
			decoratorTarget.installDecorator(HYPERLINK_DECORATOR_ID, new LinkDecorator(decoratorTarget));
		}
	}
}
