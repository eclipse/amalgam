package org.eclipse.amalgam.examples.dnc.diagram.preferences;

import org.eclipse.amalgam.examples.dnc.diagram.part.DncDiagramEditorPlugin;
import org.eclipse.amalgam.examples.dnc.diagram.part.Messages;
import org.eclipse.gmf.runtime.diagram.ui.preferences.AppearancePreferencePage;
import org.eclipse.gmf.runtime.diagram.ui.preferences.IPreferenceConstants;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.preference.ColorFieldEditor;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferenceConverter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.accessibility.AccessibleAdapter;
import org.eclipse.swt.accessibility.AccessibleEvent;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;

/**
 * @generated
 */
public class DiagramAppearancePreferencePage extends AppearancePreferencePage {

	/**
	 * @generated
	 */
	private String PINK_COLOR_LABEL = Messages.AppearancePreferencePage_pinkArchetypeColor_label;
	/**
	 * @generated
	 */
	private String YELLOW_COLOR_LABEL = Messages.AppearancePreferencePage_yellowArchetypeColor_label;
	/**
	 * @generated
	 */
	private String GREEN_COLOR_LABEL = Messages.AppearancePreferencePage_greenArchetypeColor_label;
	/**
	 * @generated
	 */
	private String BLUE_COLOR_LABEL = Messages.AppearancePreferencePage_blueArchetypeColor_label;
	/**
	 * @generated
	 */
	private String GRAY_COLOR_LABEL = Messages.AppearancePreferencePage_grayArchetypeColor_label;
	/**
	 * @generated
	 */
	private String ARCHETYPE_GROUPBOX_LABEL = Messages.AppearancePreferencePage_archetypeColorGroup_label;
	/**
	 * @generated
	 */
	public static final String PREF_MI_ARCHETYPE_COLOR = "Appearance.mi_ArchetypeColor";
	/**
	 * @generated
	 */
	public static final String PREF_ROLE_ARCHETYPE_COLOR = "Appearance.role_ArchetypeColor";
	/**
	 * @generated
	 */
	public static final String PREF_PPT_ARCHETYPE_COLOR = "Appearance.ppt_ArchetypeColor";
	/**
	 * @generated
	 */
	public static final String PREF_DESC_ARCHETYPE_COLOR = "Appearance.desc_ArchetypeColor";
	/**
	 * @generated
	 */
	public static final String PREF_PIP_ARCHETYPE_COLOR = "Appearance.pip_ArchetypeColor";
	/**
	 * @generated
	 */
	private ColorFieldEditor pinkArchetypeColorEditor = null;
	/**
	 * @generated
	 */
	private ColorFieldEditor yellowArchetypeColorEditor = null;
	/**
	 * @generated
	 */
	private ColorFieldEditor greenArchetypeColorEditor = null;
	/**
	 * @generated
	 */
	private ColorFieldEditor blueArchetypeColorEditor = null;
	/**
	 * @generated
	 */
	private ColorFieldEditor grayArchetypeColorEditor = null;

	/**
	 * @generated
	 */
	public DiagramAppearancePreferencePage() {
		setPreferenceStore(DncDiagramEditorPlugin.getInstance()
				.getPreferenceStore());
	}

	/**
	 * @generated
	 */
	@Override
	protected void addFields(Composite parent) {
		Composite main = createPageLayout(parent);
		createFontAndColorGroup(main);
		createArchetypeColorGroup(main);
	}

	/**
	 * @generated
	 */
	public static void initArchetypeDefaults(IPreferenceStore store) {
		PreferenceConverter.setDefault(store, PREF_MI_ARCHETYPE_COLOR,
				new Color(null, 250, 145, 145).getRGB());
		PreferenceConverter.setDefault(store, PREF_ROLE_ARCHETYPE_COLOR,
				new Color(null, 238, 245, 165).getRGB());
		PreferenceConverter.setDefault(store, PREF_PPT_ARCHETYPE_COLOR,
				new Color(null, 124, 179, 77).getRGB());
		PreferenceConverter.setDefault(store, PREF_DESC_ARCHETYPE_COLOR,
				new Color(null, 86, 145, 215).getRGB());
		PreferenceConverter.setDefault(store, PREF_PIP_ARCHETYPE_COLOR,
				new Color(null, 124, 124, 124).getRGB());
		// Override the normal default line color
		PreferenceConverter.setDefault(store,
				IPreferenceConstants.PREF_LINE_COLOR, new Color(null, 124, 124,
						124).getRGB());
	}

	/**
	 * @generated
	 */
	protected Composite createArchetypeColorGroup(Composite parent) {

		Group group = new Group(parent, SWT.NONE);
		group.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		group.setLayout(new GridLayout(3, false));
		Composite composite = new Composite(group, SWT.NONE);
		GridLayout gridLayout = new GridLayout(3, false);
		composite.setLayout(gridLayout);
		GridData gridData = new GridData(GridData.FILL_HORIZONTAL);
		gridData.grabExcessHorizontalSpace = true;
		gridData.horizontalSpan = 3;
		composite.setLayoutData(gridData);
		group.setText(ARCHETYPE_GROUPBOX_LABEL);

		addArchetypeColorFields(composite);

		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		layout.marginWidth = 0;
		layout.marginHeight = 0;
		layout.horizontalSpacing = 8;
		composite.setLayout(layout);

		return group;
	}

	/**
	 * @generated
	 */
	protected void addArchetypeColorFields(Composite composite) {

		pinkArchetypeColorEditor = new ColorFieldEditor(
				PREF_MI_ARCHETYPE_COLOR, PINK_COLOR_LABEL, composite);
		addField(pinkArchetypeColorEditor);

		pinkArchetypeColorEditor.getColorSelector().getButton().getAccessible()
				.addAccessibleListener(new AccessibleAdapter() {
					public void getName(AccessibleEvent e) {
						String labelText = pinkArchetypeColorEditor
								.getLabelText();
						labelText = Action.removeMnemonics(labelText);
						e.result = labelText;
					}
				});

		yellowArchetypeColorEditor = new ColorFieldEditor(
				PREF_ROLE_ARCHETYPE_COLOR, YELLOW_COLOR_LABEL, composite);
		addField(yellowArchetypeColorEditor);

		yellowArchetypeColorEditor.getColorSelector().getButton()
				.getAccessible().addAccessibleListener(new AccessibleAdapter() {
					public void getName(AccessibleEvent e) {
						String labelText = yellowArchetypeColorEditor
								.getLabelText();
						labelText = Action.removeMnemonics(labelText);
						e.result = labelText;
					}
				});

		greenArchetypeColorEditor = new ColorFieldEditor(
				PREF_PPT_ARCHETYPE_COLOR, GREEN_COLOR_LABEL, composite);
		addField(greenArchetypeColorEditor);

		greenArchetypeColorEditor.getColorSelector().getButton()
				.getAccessible().addAccessibleListener(new AccessibleAdapter() {
					public void getName(AccessibleEvent e) {
						String labelText = greenArchetypeColorEditor
								.getLabelText();
						labelText = Action.removeMnemonics(labelText);
						e.result = labelText;
					}
				});

		blueArchetypeColorEditor = new ColorFieldEditor(
				PREF_DESC_ARCHETYPE_COLOR, BLUE_COLOR_LABEL, composite);
		addField(blueArchetypeColorEditor);

		blueArchetypeColorEditor.getColorSelector().getButton().getAccessible()
				.addAccessibleListener(new AccessibleAdapter() {
					public void getName(AccessibleEvent e) {
						String labelText = blueArchetypeColorEditor
								.getLabelText();
						labelText = Action.removeMnemonics(labelText);
						e.result = labelText;
					}
				});

		grayArchetypeColorEditor = new ColorFieldEditor(
				PREF_PIP_ARCHETYPE_COLOR, GRAY_COLOR_LABEL, composite);
		addField(grayArchetypeColorEditor);

		grayArchetypeColorEditor.getColorSelector().getButton().getAccessible()
				.addAccessibleListener(new AccessibleAdapter() {
					public void getName(AccessibleEvent e) {
						String labelText = grayArchetypeColorEditor
								.getLabelText();
						labelText = Action.removeMnemonics(labelText);
						e.result = labelText;
					}
				});

	}
}
