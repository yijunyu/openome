package q7.dsl.editor;

import org.openarchitectureware.xtext.AbstractXtextEditorPlugin;
import org.openarchitectureware.xtext.editor.AbstractXtextEditor;

import q7.dsl.Q7dslEditorPlugin;

public class Q7dslEditor extends AbstractXtextEditor {

   public AbstractXtextEditorPlugin getPlugin() {
      return Q7dslEditorPlugin.getDefault();
   }
}
