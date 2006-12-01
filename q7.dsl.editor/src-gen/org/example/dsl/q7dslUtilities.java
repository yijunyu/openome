package org.example.dsl;

import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.text.rules.IPartitionTokenScanner;
import org.eclipse.swt.graphics.Image;
import org.example.dsl.parser.Scanner;
import org.example.dsl.parser.q7dslParser;
import org.openarchitectureware.xtend.XtendFacade;
import org.openarchitectureware.xtext.AbstractLanguageUtilities;
import org.openarchitectureware.xtext.parser.EcoreModelFactory;

import antlr.RecognitionException;
import antlr.TokenStream;
import antlr.TokenStreamException;



public class q7dslUtilities extends AbstractLanguageUtilities {

   public TokenStream getScanner(InputStreamReader reader) {
      return new Scanner(reader);
   }

   public EObject internalParse(TokenStream scanner, EcoreModelFactory f) throws RecognitionException, TokenStreamException {
      q7dslParser p = new q7dslParser(scanner, f);
      return p.ruleModel();
   }

   public String getCheckFileName() {
      return "org::example::dsl::q7dslChecks";
   }

   public String getFileExtension() {
      return "q7";
   }

   public String getPathToEcoreFile() {
      return "org/example/dsl/q7dsl.ecore";
   }

   public String getProblemId() {
      return q7dslEditorPlugin.getDefault().getId() + ".Problem";
   }

   public String getLabelExtensionsFileName() {
      return "org::example::dsl::q7dslEditorExtensions";
   }
   
   public String getImageExtensionsFileName() {
      return "org::example::dsl::q7dslEditorExtensions";
   }

   public String[] allKeywords() {
      return new String[] { "FD","HELP","BREAK","true","AND","PAR","CF","UN","false","SEQ","PD","FS","MAKE","OR","XOR","PS","HURT" };
   }
   
   public ClassLoader getClassLoader() {
      return this.getClass().getClassLoader();
   }
   
   public IPartitionTokenScanner getPartitionScanner() {
      return new GeneratedPartitionScanner();
   }
   
   public final Image getImage(EObject obj) {

		Image result = null;

		try {

			final String pathSuffix = "icons/"; //$NON-NLS-1$

			URL base = q7dslEditorPlugin.getDefault().getBundle()
					.getEntry(pathSuffix);

			XtendFacade f = XtendFacade.create(getImageExtensionsFileName());

			f.registerMetaModel(getMetaModel());

			String imageName = (String) f.call("image", new Object[] { obj });

			ImageDescriptor imageDescriptor = ImageDescriptor
					.createFromURL(new URL(base, imageName));

			result = imageDescriptor.createImage();

		} catch (RuntimeException e) {
			e.printStackTrace();

		} catch (MalformedURLException e) {
			e.printStackTrace();
		}

		return result;
	}
}
