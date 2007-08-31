package org.example.dsl.parser;

import java.io.Reader;

import org.openarchitectureware.xtext.parser.AbstractParserComponent;
import org.openarchitectureware.xtext.parser.EcoreModelFactory;
import org.openarchitectureware.xtext.parser.ParseResult;

import antlr.RecognitionException;
import antlr.TokenStreamException;

public class ParserComponent extends AbstractParserComponent {

   @Override
   protected ParseResult internalParse(Reader r, EcoreModelFactory f) {
      q7dslParser p = new q7dslParser(new Scanner(r), f);
      try {
		return (ParseResult) p.ruleModel();
	} catch (RecognitionException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (TokenStreamException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return null;
   }

}
