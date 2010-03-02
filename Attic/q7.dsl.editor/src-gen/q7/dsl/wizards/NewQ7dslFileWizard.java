
package q7.dsl.wizards;

import org.openarchitectureware.xtext.LanguageUtilities;
import org.openarchitectureware.xtext.editor.wizards.AbstractNewFileWizard;

import q7.dsl.Q7dslEditorPlugin;

public class NewQ7dslFileWizard extends AbstractNewFileWizard {

	@Override
	protected LanguageUtilities getUtilities() {
		return Q7dslEditorPlugin.getDefault().getUtilities();
	}
}
