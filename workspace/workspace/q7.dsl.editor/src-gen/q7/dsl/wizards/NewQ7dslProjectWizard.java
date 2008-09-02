package q7.dsl.wizards;

import org.openarchitectureware.xtext.LanguageUtilities;
import org.openarchitectureware.xtext.editor.wizards.AbstractNewProjectWizard;

import q7.dsl.Q7dslEditorPlugin;

public class NewQ7dslProjectWizard extends AbstractNewProjectWizard {

	public NewQ7dslProjectWizard() {
		super();
		setLangName("q7dsl");
		setGeneratorProjectName("q7.dsl.generator");
		setDslProjectName("q7.dsl");
		setFileExtension("q7");
		setPackageName("q7/dsl/");
	}
	
	@Override
	protected LanguageUtilities getUtilities() {
		return Q7dslEditorPlugin.getDefault().getUtilities();
	}
}

