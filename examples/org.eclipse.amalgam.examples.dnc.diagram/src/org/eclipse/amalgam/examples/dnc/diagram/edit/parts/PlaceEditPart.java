package org.eclipse.amalgam.examples.dnc.diagram.edit.parts;

import org.eclipse.amalgam.examples.dnc.diagram.edit.policies.PlaceCanonicalEditPolicy;
import org.eclipse.amalgam.examples.dnc.diagram.edit.policies.PlaceItemSemanticEditPolicy;
import org.eclipse.amalgam.examples.dnc.diagram.part.DncVisualIDRegistry;
import org.eclipse.amalgam.examples.dnc.diagram.preferences.DiagramAppearancePreferencePage;
import org.eclipse.amalgam.examples.dnc.diagram.providers.DncElementTypes;
import org.eclipse.amalgam.examples.dnc.figures.ArchetypeFigure;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CreationEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferenceConverter;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.swt.graphics.Color;

/**
 * @generated
 */
public class PlaceEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2005;

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	protected IFigure primaryShape;

	/**
	 * @generated
	 */
	public PlaceEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicy() {
					public Command getCommand(Request request) {
						if (understandsRequest(request)) {
							if (request instanceof CreateViewAndElementRequest) {
								CreateElementRequestAdapter adapter = ((CreateViewAndElementRequest) request)
										.getViewAndElementDescriptor()
										.getCreateElementRequestAdapter();
								IElementType type = (IElementType) adapter
										.getAdapter(IElementType.class);
								if (type == DncElementTypes.Attribute_3001) {
									EditPart compartmentEditPart = getChildBySemanticHint(DncVisualIDRegistry
											.getType(PlaceAttributesEditPart.VISUAL_ID));
									return compartmentEditPart == null ? null
											: compartmentEditPart
													.getCommand(request);
								}
								if (type == DncElementTypes.Operation_3002) {
									EditPart compartmentEditPart = getChildBySemanticHint(DncVisualIDRegistry
											.getType(PlaceOperationsEditPart.VISUAL_ID));
									return compartmentEditPart == null ? null
											: compartmentEditPart
													.getCommand(request);
								}
							}
							return super.getCommand(request);
						}
						return null;
					}
				});
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new PlaceItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new PlaceCanonicalEditPolicy());
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
		return primaryShape = new ArchetypeFigure();
	}

	/**
	 * @generated
	 */
	public ArchetypeFigure getPrimaryShape() {
		return (ArchetypeFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof PlaceNameEditPart) {
			((PlaceNameEditPart) childEditPart).setLabel(getPrimaryShape()
					.getFigureName());
			return true;
		}
		if (childEditPart instanceof PlaceDescriptionEditPart) {
			((PlaceDescriptionEditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureStereotype());
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
				.DPtoLP(40), getMapMode().DPtoLP(40));
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
		return getChildBySemanticHint(DncVisualIDRegistry
				.getType(PlaceNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	private PreferencePropertyChangeListener preferenceListener;

	/**
	 * @generated
	 */
	protected class PreferencePropertyChangeListener implements
			IPropertyChangeListener {
		public void propertyChange(PropertyChangeEvent event) {
			if (event.getProperty().equals(
					DiagramAppearancePreferencePage.PREF_PPT_ARCHETYPE_COLOR)) {
				updateArchetypeColor();
			}
		}
	}

	/**
	 * @generated
	 */
	@Override
	protected void addNotationalListeners() {
		super.addNotationalListeners();
		initPreferenceStoreListener();
	}

	/**
	 * @generated
	 */
	protected void updateArchetypeColor() {
		getFigure().setForegroundColor(getPreferenceColor());
		getFigure().repaint();
	}

	/**
	 * @generated
	 */
	private Color getPreferenceColor() {
		IPreferenceStore preferenceStore = (IPreferenceStore) getDiagramPreferencesHint()
				.getPreferenceStore();
		org.eclipse.swt.graphics.RGB archetypeColorPreference = PreferenceConverter
				.getColor(
						preferenceStore,
						DiagramAppearancePreferencePage.PREF_PPT_ARCHETYPE_COLOR);
		return new Color(null, archetypeColorPreference);
	}

	/**
	 * @generated
	 */
	private void initPreferenceStoreListener() {
		preferenceListener = new PreferencePropertyChangeListener();
		IPreferenceStore preferenceStore = (IPreferenceStore) getDiagramPreferencesHint()
				.getPreferenceStore();
		preferenceStore.addPropertyChangeListener(preferenceListener);
	}

	/**
	 * @generated
	 */
	@Override
	protected void setForegroundColor(Color color) {
		super.setForegroundColor(getPreferenceColor());
	}
}
