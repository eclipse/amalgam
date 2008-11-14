package org.eclipse.amalgam.examples.mindmap.diagram.edit.parts;

import org.eclipse.amalgam.examples.mindmap.MindmapPackage;
import org.eclipse.amalgam.examples.mindmap.diagram.edit.policies.MapCanonicalEditPolicy;
import org.eclipse.amalgam.examples.mindmap.diagram.edit.policies.Topic2ItemSemanticEditPolicy;
import org.eclipse.amalgam.examples.mindmap.diagram.part.MindmapVisualIDRegistry;
import org.eclipse.draw2d.AbstractConnectionAnchor;
import org.eclipse.draw2d.Border;
import org.eclipse.draw2d.BorderLayout;
import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PrecisionPoint;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.ConnectionEditPart;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.OneLineBorder;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class Topic2EditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2002;

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	protected IFigure primaryShape;

	private ConnectionAnchor targetAnchor;

	private ConnectionAnchor sourceAnchor;

	/**
	 * @generated
	 */
	public Topic2EditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new Topic2ItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {
		LayoutEditPolicy lep = new LayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				EditPolicy result = child
						.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
				if (result == null) {
					result = new NonResizableEditPolicy();
				}
				return result;
			}

			protected Command getMoveChildrenCommand(Request request) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		SubtopicFigure figure = new SubtopicFigure();
		return primaryShape = figure;
	}

	/**
	 * @generated
	 */
	public SubtopicFigure getPrimaryShape() {
		return (SubtopicFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof TopicName2EditPart) {
			((TopicName2EditPart) childEditPart).setLabel(getPrimaryShape()
					.getFigureSubtopicNameFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {

		return false;
	}

	/**
	 * @generated
	 */
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	 * @generated
	 */
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	 * @generated
	 */
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {

		return super.getContentPaneFor(editPart);
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(getMapMode()
				.DPtoLP(50), getMapMode().DPtoLP(10));
		return result;
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	 * Default implementation treats passed figure as content pane.
	 * Respects layout one may have set for generated figure.
	 * @param nodeShape instance of generated figure class
	 * @generated
	 */
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(getMapMode().DPtoLP(5));
			nodeShape.setLayoutManager(layout);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	 * @generated
	 */
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	 * @generated
	 */
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(MindmapVisualIDRegistry
				.getType(TopicName2EditPart.VISUAL_ID));
	}

	@Override
	protected void handleNotificationEvent(Notification notification) {
		int type = notification.getEventType();
		Object feature = notification.getFeature();
		if (MindmapPackage.eINSTANCE.getTopic_Subtopics().equals(feature)
				&& (type == Notification.ADD || type == Notification.REMOVE)) {
			CanonicalEditPolicy canonicalEditPolicy = (CanonicalEditPolicy) getParent()
					.getEditPolicy(EditPolicyRoles.CANONICAL_ROLE);
			canonicalEditPolicy.refresh();
			if (getParent().getEditPolicy(EditPolicyRoles.CANONICAL_ROLE) instanceof MapCanonicalEditPolicy) {
				((MapCanonicalEditPolicy) canonicalEditPolicy).layout();
			}
		}
		super.handleNotificationEvent(notification);
	}

	@Override
	public ConnectionAnchor getTargetConnectionAnchor(
			ConnectionEditPart connEditPart) {
		if (targetAnchor == null) {
			targetAnchor = new TargetFixedConnectionAnchor(getNodeFigure());
		}
		return targetAnchor;
	}

	@Override
	public ConnectionAnchor getSourceConnectionAnchor(
			ConnectionEditPart connEditPart) {
		if (sourceAnchor == null) {
			sourceAnchor = new SourceFixedConnectionAnchor(getNodeFigure());
		}
		return sourceAnchor;
	}

	public class SourceFixedConnectionAnchor extends AbstractConnectionAnchor {

		public SourceFixedConnectionAnchor(IFigure owner) {
			super(owner);
		}

		public Point getLocation(Point reference) {
			Point right = getOwner().getBounds().getBottomRight();
			Point p = new PrecisionPoint(right.x + 1, right.y - 1);
			getOwner().translateToAbsolute(p);
			return p;
		}
	}

	public class TargetFixedConnectionAnchor extends AbstractConnectionAnchor {

		public TargetFixedConnectionAnchor(IFigure owner) {
			super(owner);
		}

		public Point getLocation(Point reference) {
			Point left = getOwner().getBounds().getBottomLeft();
			Point p = new PrecisionPoint(left.x + 10, left.y - 1);
			getOwner().translateToAbsolute(p);
			return p;
		}
	}

	/**
	 * @generated
	 */
	public class SubtopicFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureSubtopicNameFigure;

		/**
		 * @generated
		 */
		public SubtopicFigure() {

			BorderLayout layoutThis = new BorderLayout();
			this.setLayoutManager(layoutThis);

			this.setFill(false);
			this.setOutline(false);

			this.setBorder(new MarginBorder(getMapMode().DPtoLP(0),
					getMapMode().DPtoLP(10), getMapMode().DPtoLP(0),
					getMapMode().DPtoLP(0)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			RectangleFigure subtopicNameRectangleFigure0 = new RectangleFigure();
			subtopicNameRectangleFigure0.setFill(false);
			subtopicNameRectangleFigure0.setOutline(false);
			subtopicNameRectangleFigure0.setBorder(createBorder0());

			this.add(subtopicNameRectangleFigure0, BorderLayout.CENTER);
			subtopicNameRectangleFigure0.setLayoutManager(new StackLayout());

			fFigureSubtopicNameFigure = new WrappingLabel();
			fFigureSubtopicNameFigure.setText("");

			fFigureSubtopicNameFigure.setBorder(new MarginBorder(getMapMode()
					.DPtoLP(0), getMapMode().DPtoLP(5), getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(0)));

			subtopicNameRectangleFigure0.add(fFigureSubtopicNameFigure);

		}

		/**
		 * @generated
		 */
		private Border createBorder0() {
			OneLineBorder result = new OneLineBorder();

			result.setPosition(PositionConstants.BOTTOM);

			return result;
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
		public WrappingLabel getFigureSubtopicNameFigure() {
			return fFigureSubtopicNameFigure;
		}

	}

}
