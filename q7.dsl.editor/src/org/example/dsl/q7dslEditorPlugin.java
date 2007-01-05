package org.example.dsl;

import org.openarchitectureware.xtext.AbstractXtextEditorPlugin;
import org.openarchitectureware.xtext.LanguageUtilities;
import org.osgi.framework.BundleContext;

public class q7dslEditorPlugin extends AbstractXtextEditorPlugin {
   private static q7dslEditorPlugin plugin;
   public static q7dslEditorPlugin getDefault() {
      return plugin;
   }

   private q7dslUtilities utilities = new q7dslUtilities();
   public LanguageUtilities getUtilities() {
      return utilities;
   }

   public q7dslEditorPlugin() {
      plugin = this;
   }

   public void stop(BundleContext context) throws Exception {
      super.stop(context);
      plugin = null;
   }
}
