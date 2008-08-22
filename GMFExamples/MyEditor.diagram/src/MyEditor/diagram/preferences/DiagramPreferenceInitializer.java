package MyEditor.diagram.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

/**
 * @generated
 */
public class DiagramPreferenceInitializer extends AbstractPreferenceInitializer {

	/**
	 * @generated
	 */
	public void initializeDefaultPreferences() {
		IPreferenceStore store = getPreferenceStore();
		MyEditor.diagram.preferences.DiagramPrintingPreferencePage
				.initDefaults(store);
		MyEditor.diagram.preferences.DiagramGeneralPreferencePage
				.initDefaults(store);
		MyEditor.diagram.preferences.DiagramAppearancePreferencePage
				.initDefaults(store);
		MyEditor.diagram.preferences.DiagramConnectionsPreferencePage
				.initDefaults(store);
		MyEditor.diagram.preferences.DiagramRulersAndGridPreferencePage
				.initDefaults(store);
	}

	/**
	 * @generated
	 */
	protected IPreferenceStore getPreferenceStore() {
		return MyEditor.diagram.part.MyeditorDiagramEditorPlugin.getInstance()
				.getPreferenceStore();
	}
}
