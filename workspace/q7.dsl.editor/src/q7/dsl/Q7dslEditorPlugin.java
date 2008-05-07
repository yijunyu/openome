package q7.dsl;

import org.openarchitectureware.xtext.AbstractXtextEditorPlugin;
import org.openarchitectureware.xtext.LanguageUtilities;
import org.osgi.framework.BundleContext;

public class Q7dslEditorPlugin extends AbstractXtextEditorPlugin {
   private static Q7dslEditorPlugin plugin;
   public static Q7dslEditorPlugin getDefault() {
      return plugin;
   }

   private Q7dslUtilities utilities = new Q7dslUtilities();
   public LanguageUtilities getUtilities() {
      return utilities;
   }

   public Q7dslEditorPlugin() {
      plugin = this;
   }

   public void stop(BundleContext context) throws Exception {
      super.stop(context);
      plugin = null;
   }
}
