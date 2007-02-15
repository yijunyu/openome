package org.example.dsl.parser;

import java.io.Reader;

import org.openarchitectureware.type.emf.EmfMetaModel;
import org.openarchitectureware.xtext.parser.AbstractParserComponent;
import org.openarchitectureware.xtext.parser.EcoreModelFactory;

import antlr.RecognitionException;
import antlr.TokenStreamException;

public class ParserComponent extends AbstractParserComponent {

   @Override
   protected Object internalParse(Reader r, EcoreModelFactory f) throws RecognitionException, TokenStreamException {
      q7dslParser p = new q7dslParser(new Scanner(r), f);
      return p.ruleModel();
   }

}
