package org.eclipse.amalgam.examples.mindmap.diagram.preferences;

import org.eclipse.amalgam.examples.mindmap.diagram.part.MindmapDiagramEditorPlugin;
import org.eclipse.gmf.runtime.diagram.ui.preferences.AppearancePreferencePage;
import org.eclipse.gmf.runtime.diagram.ui.preferences.IPreferenceConstants;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferenceConverter;
import org.eclipse.swt.graphics.RGB;

/**
 * @generated
 */
public class DiagramAppearancePreferencePage extends AppearancePreferencePage {

	private static RGB LINE_COLOR = new RGB(90, 140, 255);

	/**
	 * @generated
	 */
	public DiagramAppearancePreferencePage() {
		setPreferenceStore(MindmapDiagramEditorPlugin.getInstance()
				.getPreferenceStore());
	}

	public static void initDefaults(IPreferenceStore store) {
		AppearancePreferencePage.initDefaults(store);
		PreferenceConverter.setDefault(store,
				IPreferenceConstants.PREF_LINE_COLOR, LINE_COLOR);
	}

}
