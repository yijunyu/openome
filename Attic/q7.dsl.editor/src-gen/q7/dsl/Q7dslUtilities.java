package q7.dsl;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.jface.text.rules.IPartitionTokenScanner;
import org.openarchitectureware.xtext.AbstractLanguageUtilities;
import org.openarchitectureware.xtext.XtextFile;
import org.openarchitectureware.xtext.parser.ErrorMsg;
import org.openarchitectureware.xtext.parser.ParseResult;
import org.openarchitectureware.xtext.parser.parsetree.Node;
import org.osgi.framework.Bundle;

import q7.dsl.parser.q7dslLexer;
import q7.dsl.parser.q7dslParser;

public class Q7dslUtilities extends AbstractLanguageUtilities {

   public ParseResult internalParse(InputStream is) throws IOException, RecognitionException {
		ANTLRInputStream input = new ANTLRInputStream(is);
		q7dslLexer lexer = new q7dslLexer(input);
		q7dslParser parser = new q7dslParser(new CommonTokenStream(lexer), null);
		Node root = parser.parse();
		List<ErrorMsg> errors = new ArrayList<ErrorMsg>();
		errors.addAll(lexer.getErrors());
		errors.addAll(parser.getErrors());
		if (errors.isEmpty()) {
			try {
				invokeExtension("parser::Linker", "link", root.getModelElement());
			} catch (Exception e) {
				// ignore
			}
		}
		return new ParseResult(root, errors);
   }

   public String getFileExtension() {
      return "q7";
   }

	public EPackage getEPackage() {
		return q7.dsl.MetaModelRegistration.getEPackage();
	}
   
   public String[] allKeywords() {
      return new String[] { "HELP","HURT","XOR","FS","MAKE","AND","false","BREAK","&","FD","UN","||","SEQ","+","true","/","OR","-","--","PAR","CF","PS",";","PD","|","++" };
   }
   
   public ClassLoader getClassLoader() {
      return this.getClass().getClassLoader();
   }
   
   public IPartitionTokenScanner getPartitionScanner() {
      return new GeneratedPartitionScanner();
   }
   
   @Override
	public Bundle getPluginBundle() {
		return Q7dslEditorPlugin.getDefault().getBundle();
	}
	
	@Override
	public String getPackageForExtensions() {
		return "q7::dsl";
	}
	
	public XtextFile getXtextFile() {
		return MetaModelRegistration.getXtextFile();
	}
}
