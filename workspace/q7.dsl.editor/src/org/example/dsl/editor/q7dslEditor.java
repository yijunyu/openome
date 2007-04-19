package org.example.dsl.editor;

import org.openarchitectureware.xtext.AbstractXtextEditorPlugin;
import org.openarchitectureware.xtext.editor.AbstractXtextEditor;

import org.example.dsl.q7dslEditorPlugin;

public class q7dslEditor extends AbstractXtextEditor {

   protected AbstractXtextEditorPlugin getPlugin() {
      return q7dslEditorPlugin.getDefault();
   }

}
