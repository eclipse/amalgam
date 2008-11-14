package org.eclipse.amalgam.examples.scenario.diagram.custom.providers;

import java.net.URL;

import org.eclipse.amalgam.examples.scenario.diagram.custom.Activator;
import org.eclipse.amalgam.examples.scenario.diagram.custom.style.CustomStyle;
import org.eclipse.amalgam.examples.scenario.diagram.custom.style.StylePackage;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gmf.runtime.diagram.core.listener.DiagramEventBroker;
import org.eclipse.gmf.runtime.diagram.core.listener.NotificationListener;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.services.decorator.AbstractDecorator;
import org.eclipse.gmf.runtime.diagram.ui.services.decorator.IDecoratorTarget;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

public class LinkDecorator extends AbstractDecorator {

	private static final Image LINK;

	static {
		URL url = FileLocator.find(Activator.getDefault().getBundle(), new Path("images" + IPath.SEPARATOR + "link.gif"), null);
		ImageDescriptor imgDesc = ImageDescriptor.createFromURL(url);
		LINK = imgDesc.createImage();
	}
	
	public LinkDecorator(IDecoratorTarget decoratorTarget) {
		super(decoratorTarget);
	}

	static public Node getDecoratorTargetNode(IDecoratorTarget decoratorTarget) {
		CustomStyle style = null;
		View node = (View) decoratorTarget.getAdapter(View.class);
		if (node != null && node.eContainer() instanceof Diagram) {
			style = (CustomStyle) node.getStyle(StylePackage.eINSTANCE.getCustomStyle());

			if (style != null) {
				return (Node) node;
			}
		}
		return null;
	}

	public void refresh() {
		removeDecoration();

		Node node = getDecoratorTargetNode(getDecoratorTarget());

		if (node != null) {
			CustomStyle style = (CustomStyle) node.getStyle(StylePackage.eINSTANCE.getCustomStyle());
			if (style != null) {
				boolean linked = style.getHyperlink() != null && style.getHyperlink().length() > 0;
				if (linked) {
					setDecoration(getDecoratorTarget().addShapeDecoration(LINK, IDecoratorTarget.Direction.NORTH_EAST, 1, false));
				}
			}
		}
	}

	private NotificationListener notificationListener = new NotificationListener() {

		public void notifyChanged(Notification notification) {
			refresh();
		}
	};

	public void activate() {
		IGraphicalEditPart gep = (IGraphicalEditPart) getDecoratorTarget().getAdapter(IGraphicalEditPart.class);
		assert gep != null;

		DiagramEventBroker.getInstance(gep.getEditingDomain()).addNotificationListener(gep.getNotationView(), StylePackage.eINSTANCE.getCustomStyle_Hyperlink(), notificationListener);
	}

	public void deactivate() {
		removeDecoration();

		IGraphicalEditPart gep = (IGraphicalEditPart) getDecoratorTarget().getAdapter(IGraphicalEditPart.class);
		assert gep != null;

		DiagramEventBroker.getInstance(gep.getEditingDomain()).removeNotificationListener(gep.getNotationView(), notificationListener);
	}
}