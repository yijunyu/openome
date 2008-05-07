package q7.dsl.parser;

import java.io.IOException;
import java.io.Reader;

import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.eclipse.m2t.type.emf.EmfRegistryMetaModel;
import org.openarchitectureware.expression.ExecutionContextImpl;
import org.openarchitectureware.xtend.XtendFacade;
import org.openarchitectureware.xtext.parser.AbstractParserComponent;
import org.openarchitectureware.xtext.parser.ErrorMsg;
import org.openarchitectureware.xtext.parser.ParseResult;
import org.openarchitectureware.xtext.parser.parsetree.Node;

public class ParserComponent extends AbstractParserComponent {

   @Override
   protected ParseResult internalParse(Reader reader) throws IOException, RecognitionException {
      ANTLRReaderStream input = new ANTLRReaderStream(reader); 
      q7dslLexer lexer = new q7dslLexer(input); 
      CommonTokenStream tokens = new CommonTokenStream(lexer); 
      q7dslParser parser = new q7dslParser(tokens,null);
      Node root = parser.parse();
      List<ErrorMsg> errors = new ArrayList<ErrorMsg>();
      errors.addAll(lexer.getErrors());
      errors.addAll(parser.getErrors());
      if (errors.isEmpty()) {
    	  ExecutionContextImpl ctx = new ExecutionContextImpl();
    	  ctx.registerMetaModel(new EmfRegistryMetaModel());
    	  XtendFacade facade = XtendFacade.create(ctx, "q7::dsl::parser::Linker");
    	  facade.call("link", root.getModelElement());
      }
      return new ParseResult(root,errors);
   }
   
}
