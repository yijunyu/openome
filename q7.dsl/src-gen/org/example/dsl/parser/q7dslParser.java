// $ANTLR : "..//q7.dsl/src-gen//org/example/dsl/parser/q7dsl.g" -> "q7dslParser.java"$
 	
package org.example.dsl.parser; 
	
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

import org.eclipse.emf.ecore.EObject;
import org.openarchitectureware.xtext.loc.LocationTool;
import org.openarchitectureware.xtext.parser.EcoreModelFactory;


import antlr.TokenBuffer;
import antlr.TokenStreamException;
import antlr.TokenStreamIOException;
import antlr.ANTLRException;
import antlr.LLkParser;
import antlr.Token;
import antlr.TokenStream;
import antlr.RecognitionException;
import antlr.NoViableAltException;
import antlr.MismatchedTokenException;
import antlr.SemanticException;
import antlr.ParserSharedInputState;
import antlr.collections.impl.BitSet;

public class q7dslParser extends antlr.LLkParser       implements q7dslParserTokenTypes
 {

	private EcoreModelFactory factory;
	public q7dslParser(TokenStream stream, EcoreModelFactory factory) {
		this(stream);
		this.factory = factory;
	}

protected q7dslParser(TokenBuffer tokenBuf, int k) {
  super(tokenBuf,k);
  tokenNames = _tokenNames;
}

public q7dslParser(TokenBuffer tokenBuf) {
  this(tokenBuf,6);
}

protected q7dslParser(TokenStream lexer, int k) {
  super(lexer,k);
  tokenNames = _tokenNames;
}

public q7dslParser(TokenStream lexer) {
  this(lexer,6);
}

public q7dslParser(ParserSharedInputState state) {
  super(state,6);
  tokenNames = _tokenNames;
}

	public final EObject  ruleModel() throws RecognitionException, TokenStreamException {
		EObject result=null;
		
		int start =0, line=0; List advicesList = new ArrayList();Object a_advices=null;
		
		start = LT(1).getColumn()-1; line=LT(1).getLine();
		{
		int _cnt3=0;
		_loop3:
		do {
			if ((_tokenSet_0.member(LA(1)))) {
				a_advices=ruleAdvice();
				advicesList.add(a_advices);
			}
			else {
				if ( _cnt3>=1 ) { break _loop3; } else {throw new NoViableAltException(LT(1), getFilename());}
			}
			
			_cnt3++;
		} while (true);
		}
		result = factory.create("new Model", "advices.addAll(arg1)",advicesList);
		Token __t = LT(0);if (__t==null) __t = LT(1);LocationTool.setLocation(result,start,__t.getColumn()+(__t.getText()!=null?__t.getText().length()-1:0),line);
		return result;
	}
	
	public final EObject  ruleAdvice() throws RecognitionException, TokenStreamException {
		EObject result=null;
		
		Token  a_who_0_0_0_0_0_0 = null;
		int start =0, line=0; Object a_how=null;Object a_when=null;Object a_label=null;Object a_why=null;Object a_whom=null;Object a_howmuch=null;Object a_where=null;Object a_what=null;
		
		start = LT(1).getColumn()-1; line=LT(1).getLine();
		{
		switch ( LA(1)) {
		case TOKENI:
		{
			a_who_0_0_0_0_0_0 = LT(1);
			match(TOKENI);
			ruleWho();
			match(TOKENII);
			match(TOKENIII);
			break;
		}
		case STRING:
		case ID:
		case LITERAL_true:
		case LITERAL_false:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(LT(1), getFilename());
		}
		}
		}
		{
		if (((LA(1) >= STRING && LA(1) <= LITERAL_false)) && (LA(2)==TOKENIIII)) {
			a_when=ruleWhen();
			match(TOKENIIII);
		}
		else if ((LA(1)==STRING||LA(1)==ID) && (_tokenSet_1.member(LA(2)))) {
		}
		else {
			throw new NoViableAltException(LT(1), getFilename());
		}
		
		}
		a_why=ruleWhy();
		{
		switch ( LA(1)) {
		case TOKENIIIII:
		{
			match(TOKENIIIII);
			a_what=ruleWhat();
			match(TOKENIIIIII);
			break;
		}
		case EOF:
		case TOKENI:
		case TOKENIIIIIII:
		case TOKENIIIIIIII:
		case TOKENIIIIIIIII:
		case TOKENIIIIIIIIII:
		case TOKENIIIIIIIIIII:
		case STRING:
		case ID:
		case LITERAL_true:
		case LITERAL_false:
		case LITERAL_FS:
		case LITERAL_PS:
		case LITERAL_FD:
		case LITERAL_PD:
		case LITERAL_CF:
		case LITERAL_UN:
		case INT:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(LT(1), getFilename());
		}
		}
		}
		{
		switch ( LA(1)) {
		case TOKENIIIIIII:
		{
			match(TOKENIIIIIII);
			a_where=ruleWhere();
			break;
		}
		case EOF:
		case TOKENI:
		case TOKENIIIIIIII:
		case TOKENIIIIIIIII:
		case TOKENIIIIIIIIII:
		case TOKENIIIIIIIIIII:
		case STRING:
		case ID:
		case LITERAL_true:
		case LITERAL_false:
		case LITERAL_FS:
		case LITERAL_PS:
		case LITERAL_FD:
		case LITERAL_PD:
		case LITERAL_CF:
		case LITERAL_UN:
		case INT:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(LT(1), getFilename());
		}
		}
		}
		{
		switch ( LA(1)) {
		case TOKENIIIIIIII:
		{
			match(TOKENIIIIIIII);
			a_how=ruleHow();
			match(TOKENIIIIIIIII);
			break;
		}
		case EOF:
		case TOKENI:
		case TOKENIIIIIIIII:
		case TOKENIIIIIIIIII:
		case TOKENIIIIIIIIIII:
		case STRING:
		case ID:
		case LITERAL_true:
		case LITERAL_false:
		case LITERAL_FS:
		case LITERAL_PS:
		case LITERAL_FD:
		case LITERAL_PD:
		case LITERAL_CF:
		case LITERAL_UN:
		case INT:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(LT(1), getFilename());
		}
		}
		}
		{
		if ((_tokenSet_2.member(LA(1))) && (_tokenSet_3.member(LA(2))) && (_tokenSet_4.member(LA(3))) && (_tokenSet_5.member(LA(4))) && (_tokenSet_5.member(LA(5))) && (_tokenSet_5.member(LA(6)))) {
			{
			if ((_tokenSet_2.member(LA(1))) && (_tokenSet_3.member(LA(2))) && (_tokenSet_4.member(LA(3))) && (_tokenSet_5.member(LA(4))) && (_tokenSet_5.member(LA(5))) && (_tokenSet_5.member(LA(6)))) {
				a_label=ruleLabel();
			}
			else if ((_tokenSet_6.member(LA(1))) && (_tokenSet_7.member(LA(2))) && (_tokenSet_4.member(LA(3))) && (_tokenSet_5.member(LA(4))) && (_tokenSet_5.member(LA(5))) && (_tokenSet_5.member(LA(6)))) {
			}
			else {
				throw new NoViableAltException(LT(1), getFilename());
			}
			
			}
			{
			switch ( LA(1)) {
			case TOKENIIIIIIIIII:
			{
				match(TOKENIIIIIIIIII);
				a_howmuch=ruleHowMuchRules();
				break;
			}
			case TOKENIIIIIIIIIII:
			{
				match(TOKENIIIIIIIIIII);
				match(TOKENI);
				a_whom=ruleWho();
				match(TOKENII);
				break;
			}
			case EOF:
			case TOKENI:
			case TOKENIIIIIIIII:
			case STRING:
			case ID:
			case LITERAL_true:
			case LITERAL_false:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
		}
		else if ((_tokenSet_8.member(LA(1))) && (_tokenSet_9.member(LA(2))) && (_tokenSet_4.member(LA(3))) && (_tokenSet_5.member(LA(4))) && (_tokenSet_5.member(LA(5))) && (_tokenSet_5.member(LA(6)))) {
		}
		else {
			throw new NoViableAltException(LT(1), getFilename());
		}
		
		}
		result = factory.create("new Advice", "setHow(arg1)->setWhen(arg2)->setLabel(arg3)->setWhy(arg4)->setWhom(arg5)->setHowmuch(arg6)->setWhere(arg7)->setWho(arg8)->setWhat(arg9)",a_how,a_when,a_label,a_why,a_whom,a_howmuch,a_where,a_who_0_0_0_0_0_0!=null ? a_who_0_0_0_0_0_0.getText() : null,a_what);
		Token __t = LT(0);if (__t==null) __t = LT(1);LocationTool.setLocation(result,start,__t.getColumn()+(__t.getText()!=null?__t.getText().length()-1:0),line);
		return result;
	}
	
	public final EObject  ruleWho() throws RecognitionException, TokenStreamException {
		EObject result=null;
		
		int start =0, line=0; Object a_actor=null;
		
		start = LT(1).getColumn()-1; line=LT(1).getLine();
		a_actor=ruleActor();
		result = factory.create("new Who", "setActor(arg1)",a_actor);
		Token __t = LT(0);if (__t==null) __t = LT(1);LocationTool.setLocation(result,start,__t.getColumn()+(__t.getText()!=null?__t.getText().length()-1:0),line);
		return result;
	}
	
	public final EObject  ruleWhen() throws RecognitionException, TokenStreamException {
		EObject result=null;
		
		Token  a_expr_0_0_0 = null;
		Token  a_expr_0_1_0 = null;
		Token  a_expr_0_2_0 = null;
		Token  a_expr_0_3_0 = null;
		int start =0, line=0;
		
		switch ( LA(1)) {
		case LITERAL_true:
		{
			start = LT(1).getColumn()-1; line=LT(1).getLine();
			a_expr_0_0_0 = LT(1);
			match(LITERAL_true);
			break;
		}
		case LITERAL_false:
		{
			a_expr_0_1_0 = LT(1);
			match(LITERAL_false);
			break;
		}
		case ID:
		{
			a_expr_0_2_0 = LT(1);
			match(ID);
			break;
		}
		case STRING:
		{
			a_expr_0_3_0 = LT(1);
			match(STRING);
			result = factory.create("new When", "setExpr(arg1)",a_expr_0_0_0!=null ? a_expr_0_0_0.getText() : null);
			Token __t = LT(0);if (__t==null) __t = LT(1);LocationTool.setLocation(result,start,__t.getColumn()+(__t.getText()!=null?__t.getText().length()-1:0),line);
			break;
		}
		default:
		{
			throw new NoViableAltException(LT(1), getFilename());
		}
		}
		return result;
	}
	
	public final EObject  ruleWhy() throws RecognitionException, TokenStreamException {
		EObject result=null;
		
		Token  a_name_0_0_0 = null;
		Token  a_name_0_1_0 = null;
		int start =0, line=0;
		
		switch ( LA(1)) {
		case ID:
		{
			start = LT(1).getColumn()-1; line=LT(1).getLine();
			a_name_0_0_0 = LT(1);
			match(ID);
			break;
		}
		case STRING:
		{
			a_name_0_1_0 = LT(1);
			match(STRING);
			result = factory.create("new Why", "setName(arg1)",a_name_0_0_0!=null ? a_name_0_0_0.getText() : null);
			Token __t = LT(0);if (__t==null) __t = LT(1);LocationTool.setLocation(result,start,__t.getColumn()+(__t.getText()!=null?__t.getText().length()-1:0),line);
			break;
		}
		default:
		{
			throw new NoViableAltException(LT(1), getFilename());
		}
		}
		return result;
	}
	
	public final EObject  ruleWhat() throws RecognitionException, TokenStreamException {
		EObject result=null;
		
		int start =0, line=0; List topicsList = new ArrayList();Object a_topics=null;
		
		start = LT(1).getColumn()-1; line=LT(1).getLine();
		a_topics=ruleTopic();
		topicsList.add(a_topics);
		{
		_loop19:
		do {
			if ((LA(1)==TOKENIIIIIIIIIIII)) {
				match(TOKENIIIIIIIIIIII);
				a_topics=ruleTopic();
				topicsList.add(a_topics);
			}
			else {
				break _loop19;
			}
			
		} while (true);
		}
		result = factory.create("new What", "topics.addAll(arg1)",topicsList);
		Token __t = LT(0);if (__t==null) __t = LT(1);LocationTool.setLocation(result,start,__t.getColumn()+(__t.getText()!=null?__t.getText().length()-1:0),line);
		return result;
	}
	
	public final EObject  ruleWhere() throws RecognitionException, TokenStreamException {
		EObject result=null;
		
		int start =0, line=0; Object a_topics=null;Object a_op=null;Object a_name=null;
		
		start = LT(1).getColumn()-1; line=LT(1).getLine();
		a_op=ruleOp();
		a_name=ruleWhy();
		{
		switch ( LA(1)) {
		case TOKENIIIII:
		{
			match(TOKENIIIII);
			a_topics=ruleWhat();
			match(TOKENIIIIII);
			break;
		}
		case EOF:
		case TOKENI:
		case TOKENIIIIIIII:
		case TOKENIIIIIIIII:
		case TOKENIIIIIIIIII:
		case TOKENIIIIIIIIIII:
		case STRING:
		case ID:
		case LITERAL_true:
		case LITERAL_false:
		case LITERAL_FS:
		case LITERAL_PS:
		case LITERAL_FD:
		case LITERAL_PD:
		case LITERAL_CF:
		case LITERAL_UN:
		case INT:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(LT(1), getFilename());
		}
		}
		}
		result = factory.create("new Where", "setTopics(arg1)->setOp(arg2)->setName(arg3)",a_topics,a_op,a_name);
		Token __t = LT(0);if (__t==null) __t = LT(1);LocationTool.setLocation(result,start,__t.getColumn()+(__t.getText()!=null?__t.getText().length()-1:0),line);
		return result;
	}
	
	public final EObject  ruleHow() throws RecognitionException, TokenStreamException {
		EObject result=null;
		
		int start =0, line=0; Object a_enrich=null;List advicesList = new ArrayList();Object a_advices=null;Object a_op=null;
		
		start = LT(1).getColumn()-1; line=LT(1).getLine();
		a_op=ruleDecompositionType();
		{
		switch ( LA(1)) {
		case LITERAL_SEQ:
		case TOKENIIIIIIIIIIIIIIIIIII:
		case LITERAL_PAR:
		case TOKENIIIIIIIIIIIIIIIIIIII:
		case LITERAL_XOR:
		case TOKENIIIIIIIIIIIIIIIIIIIII:
		{
			a_enrich=ruleEnrichment();
			break;
		}
		case TOKENI:
		case STRING:
		case ID:
		case LITERAL_true:
		case LITERAL_false:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(LT(1), getFilename());
		}
		}
		}
		{
		int _cnt26=0;
		_loop26:
		do {
			if ((_tokenSet_0.member(LA(1)))) {
				a_advices=ruleAdvice();
				advicesList.add(a_advices);
			}
			else {
				if ( _cnt26>=1 ) { break _loop26; } else {throw new NoViableAltException(LT(1), getFilename());}
			}
			
			_cnt26++;
		} while (true);
		}
		result = factory.create("new How", "setEnrich(arg1)->advices.addAll(arg2)->setOp(arg3)",a_enrich,advicesList,a_op);
		Token __t = LT(0);if (__t==null) __t = LT(1);LocationTool.setLocation(result,start,__t.getColumn()+(__t.getText()!=null?__t.getText().length()-1:0),line);
		return result;
	}
	
	public final EObject  ruleLabel() throws RecognitionException, TokenStreamException {
		EObject result=null;
		
		int start =0, line=0; Object a_den=null;Object a_sat=null;Object a_label=null;
		
		switch ( LA(1)) {
		case LITERAL_FS:
		case LITERAL_PS:
		case LITERAL_FD:
		case LITERAL_PD:
		case LITERAL_CF:
		case LITERAL_UN:
		{
			start = LT(1).getColumn()-1; line=LT(1).getLine();
			a_label=ruleLabelEnumerator();
			break;
		}
		case EOF:
		case TOKENI:
		case TOKENIIIIIIIII:
		case TOKENIIIIIIIIII:
		case TOKENIIIIIIIIIII:
		case STRING:
		case ID:
		case LITERAL_true:
		case LITERAL_false:
		case INT:
		{
			{
			switch ( LA(1)) {
			case INT:
			{
				a_sat=ruleFLOAT();
				match(TOKENIIIIIIIIIIII);
				a_den=ruleFLOAT();
				break;
			}
			case EOF:
			case TOKENI:
			case TOKENIIIIIIIII:
			case TOKENIIIIIIIIII:
			case TOKENIIIIIIIIIII:
			case STRING:
			case ID:
			case LITERAL_true:
			case LITERAL_false:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			result = factory.create("new Label", "setDen(arg1)->setSat(arg2)->setLabel(arg3)",a_den,a_sat,a_label);
			Token __t = LT(0);if (__t==null) __t = LT(1);LocationTool.setLocation(result,start,__t.getColumn()+(__t.getText()!=null?__t.getText().length()-1:0),line);
			break;
		}
		default:
		{
			throw new NoViableAltException(LT(1), getFilename());
		}
		}
		return result;
	}
	
	public final EObject  ruleHowMuchRules() throws RecognitionException, TokenStreamException {
		EObject result=null;
		
		int start =0, line=0; List howmuchList = new ArrayList();Object a_howmuch=null;
		
		start = LT(1).getColumn()-1; line=LT(1).getLine();
		a_howmuch=ruleHowMuch();
		howmuchList.add(a_howmuch);
		{
		_loop32:
		do {
			if ((LA(1)==TOKENIIIIIIIIIIII)) {
				match(TOKENIIIIIIIIIIII);
				a_howmuch=ruleHowMuch();
				howmuchList.add(a_howmuch);
			}
			else {
				break _loop32;
			}
			
		} while (true);
		}
		result = factory.create("new HowMuchRules", "howmuch.addAll(arg1)",howmuchList);
		Token __t = LT(0);if (__t==null) __t = LT(1);LocationTool.setLocation(result,start,__t.getColumn()+(__t.getText()!=null?__t.getText().length()-1:0),line);
		return result;
	}
	
	public final EObject  ruleActor() throws RecognitionException, TokenStreamException {
		EObject result=null;
		
		Token  a_name_0_0_0 = null;
		Token  a_name_0_1_0 = null;
		int start =0, line=0;
		
		switch ( LA(1)) {
		case STRING:
		{
			start = LT(1).getColumn()-1; line=LT(1).getLine();
			a_name_0_0_0 = LT(1);
			match(STRING);
			break;
		}
		case ID:
		{
			a_name_0_1_0 = LT(1);
			match(ID);
			result = factory.create("new Actor", "setName(arg1)",a_name_0_0_0!=null ? a_name_0_0_0.getText() : null);
			Token __t = LT(0);if (__t==null) __t = LT(1);LocationTool.setLocation(result,start,__t.getColumn()+(__t.getText()!=null?__t.getText().length()-1:0),line);
			break;
		}
		default:
		{
			throw new NoViableAltException(LT(1), getFilename());
		}
		}
		return result;
	}
	
	public final EObject  ruleTopic() throws RecognitionException, TokenStreamException {
		EObject result=null;
		
		Token  a_name_0_0_0 = null;
		Token  a_name_0_1_0 = null;
		int start =0, line=0;
		
		switch ( LA(1)) {
		case ID:
		{
			start = LT(1).getColumn()-1; line=LT(1).getLine();
			a_name_0_0_0 = LT(1);
			match(ID);
			break;
		}
		case STRING:
		{
			a_name_0_1_0 = LT(1);
			match(STRING);
			result = factory.create("new Topic", "setName(arg1)",a_name_0_1_0!=null ? a_name_0_1_0.getText() : null);
			Token __t = LT(0);if (__t==null) __t = LT(1);LocationTool.setLocation(result,start,__t.getColumn()+(__t.getText()!=null?__t.getText().length()-1:0),line);
			break;
		}
		default:
		{
			throw new NoViableAltException(LT(1), getFilename());
		}
		}
		return result;
	}
	
	public final Object  ruleOp() throws RecognitionException, TokenStreamException {
		Object e=null;
		
		
		switch ( LA(1)) {
		case TOKENIIIIIIIIIIIII:
		{
			match(TOKENIIIIIIIIIIIII);
			e=factory.create("Op::HELP");
			break;
		}
		case LITERAL_HELP:
		{
			match(LITERAL_HELP);
			e=factory.create("Op::HELP2");
			break;
		}
		case TOKENIIIIIIIIIIIIII:
		{
			match(TOKENIIIIIIIIIIIIII);
			e=factory.create("Op::HURT");
			break;
		}
		case LITERAL_HURT:
		{
			match(LITERAL_HURT);
			e=factory.create("Op::HURT2");
			break;
		}
		case TOKENIIIIIIIIIIIIIII:
		{
			match(TOKENIIIIIIIIIIIIIII);
			e=factory.create("Op::MAKE");
			break;
		}
		case LITERAL_MAKE:
		{
			match(LITERAL_MAKE);
			e=factory.create("Op::MAKE2");
			break;
		}
		case TOKENIIIIIIIIIIIIIIII:
		{
			match(TOKENIIIIIIIIIIIIIIII);
			e=factory.create("Op::BREAK");
			break;
		}
		case LITERAL_BREAK:
		{
			match(LITERAL_BREAK);
			e=factory.create("Op::BREAK2");
			break;
		}
		default:
		{
			throw new NoViableAltException(LT(1), getFilename());
		}
		}
		return e;
	}
	
	public final Object  ruleDecompositionType() throws RecognitionException, TokenStreamException {
		Object e=null;
		
		
		switch ( LA(1)) {
		case LITERAL_AND:
		{
			match(LITERAL_AND);
			e=factory.create("DecompositionType::AND");
			break;
		}
		case TOKENIIIIIIIIIIIIIIIII:
		{
			match(TOKENIIIIIIIIIIIIIIIII);
			e=factory.create("DecompositionType::AND1");
			break;
		}
		case LITERAL_OR:
		{
			match(LITERAL_OR);
			e=factory.create("DecompositionType::OR");
			break;
		}
		case TOKENIIIIIIIIIIIIIIIIII:
		{
			match(TOKENIIIIIIIIIIIIIIIIII);
			e=factory.create("DecompositionType::OR1");
			break;
		}
		default:
		{
			throw new NoViableAltException(LT(1), getFilename());
		}
		}
		return e;
	}
	
	public final Object  ruleEnrichment() throws RecognitionException, TokenStreamException {
		Object e=null;
		
		
		switch ( LA(1)) {
		case LITERAL_SEQ:
		{
			match(LITERAL_SEQ);
			e=factory.create("Enrichment::SEQUENTIAL");
			break;
		}
		case TOKENIIIIIIIIIIIIIIIIIII:
		{
			match(TOKENIIIIIIIIIIIIIIIIIII);
			e=factory.create("Enrichment::SEQUENTIAL1");
			break;
		}
		case LITERAL_PAR:
		{
			match(LITERAL_PAR);
			e=factory.create("Enrichment::PARALLEL");
			break;
		}
		case TOKENIIIIIIIIIIIIIIIIIIII:
		{
			match(TOKENIIIIIIIIIIIIIIIIIIII);
			e=factory.create("Enrichment::PARALLEL1");
			break;
		}
		case LITERAL_XOR:
		{
			match(LITERAL_XOR);
			e=factory.create("Enrichment::XOR");
			break;
		}
		case TOKENIIIIIIIIIIIIIIIIIIIII:
		{
			match(TOKENIIIIIIIIIIIIIIIIIIIII);
			e=factory.create("Enrichment::XOR1");
			break;
		}
		default:
		{
			throw new NoViableAltException(LT(1), getFilename());
		}
		}
		return e;
	}
	
	public final EObject  ruleHowMuch() throws RecognitionException, TokenStreamException {
		EObject result=null;
		
		int start =0, line=0; Object a_who=null;Object a_what=null;Object a_strength=null;Object a_why=null;Object a_op=null;Object a_trust=null;
		
		switch ( LA(1)) {
		case TOKENIIIIIIIIIIIII:
		case LITERAL_HELP:
		case TOKENIIIIIIIIIIIIII:
		case LITERAL_HURT:
		case TOKENIIIIIIIIIIIIIII:
		case LITERAL_MAKE:
		case TOKENIIIIIIIIIIIIIIII:
		case LITERAL_BREAK:
		{
			start = LT(1).getColumn()-1; line=LT(1).getLine();
			a_op=ruleOp();
			{
			switch ( LA(1)) {
			case INT:
			{
				a_strength=ruleFLOAT();
				break;
			}
			case TOKENI:
			case STRING:
			case ID:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			{
			switch ( LA(1)) {
			case TOKENI:
			{
				match(TOKENI);
				a_who=ruleWho();
				match(TOKENII);
				match(TOKENIII);
				break;
			}
			case STRING:
			case ID:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			a_why=ruleWhy();
			{
			switch ( LA(1)) {
			case TOKENIIIII:
			{
				match(TOKENIIIII);
				a_what=ruleWhat();
				match(TOKENIIIIII);
				break;
			}
			case EOF:
			case TOKENI:
			case TOKENIIIIIIIII:
			case STRING:
			case ID:
			case LITERAL_true:
			case LITERAL_false:
			case TOKENIIIIIIIIIIII:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			break;
		}
		case TOKENIIIIIIIIIIIIIIIIIIIIII:
		{
			match(TOKENIIIIIIIIIIIIIIIIIIIIII);
			{
			switch ( LA(1)) {
			case INT:
			{
				a_trust=ruleFLOAT();
				break;
			}
			case TOKENI:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			match(TOKENI);
			a_who=ruleWho();
			match(TOKENII);
			{
			switch ( LA(1)) {
			case TOKENIII:
			{
				match(TOKENIII);
				a_why=ruleWhy();
				{
				switch ( LA(1)) {
				case TOKENIIIII:
				{
					match(TOKENIIIII);
					a_what=ruleWhat();
					match(TOKENIIIIII);
					break;
				}
				case EOF:
				case TOKENI:
				case TOKENIIIIIIIII:
				case STRING:
				case ID:
				case LITERAL_true:
				case LITERAL_false:
				case TOKENIIIIIIIIIIII:
				{
					break;
				}
				default:
				{
					throw new NoViableAltException(LT(1), getFilename());
				}
				}
				}
				break;
			}
			case EOF:
			case TOKENI:
			case TOKENIIIIIIIII:
			case STRING:
			case ID:
			case LITERAL_true:
			case LITERAL_false:
			case TOKENIIIIIIIIIIII:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			result = factory.create("new HowMuch", "setWho(arg1)->setWhat(arg2)->setStrength(arg3)->setWhy(arg4)->setOp(arg5)->setTrust(arg6)",a_who,a_what,a_strength,a_why,a_op,a_trust);
			Token __t = LT(0);if (__t==null) __t = LT(1);LocationTool.setLocation(result,start,__t.getColumn()+(__t.getText()!=null?__t.getText().length()-1:0),line);
			break;
		}
		default:
		{
			throw new NoViableAltException(LT(1), getFilename());
		}
		}
		return result;
	}
	
	public final EObject  ruleFLOAT() throws RecognitionException, TokenStreamException {
		EObject result=null;
		
		Token  a_integral_0_0_0 = null;
		Token  a_decimal_0_0_1_0_0_1 = null;
		int start =0, line=0;
		
		start = LT(1).getColumn()-1; line=LT(1).getLine();
		a_integral_0_0_0 = LT(1);
		match(INT);
		{
		switch ( LA(1)) {
		case TOKENIIIIIIIIIIIIIIIIIIIIIII:
		{
			match(TOKENIIIIIIIIIIIIIIIIIIIIIII);
			a_decimal_0_0_1_0_0_1 = LT(1);
			match(INT);
			break;
		}
		case EOF:
		case TOKENI:
		case TOKENIIIIIIIII:
		case TOKENIIIIIIIIII:
		case TOKENIIIIIIIIIII:
		case STRING:
		case ID:
		case LITERAL_true:
		case LITERAL_false:
		case TOKENIIIIIIIIIIII:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(LT(1), getFilename());
		}
		}
		}
		result = factory.create("new FLOAT", "setDecimal(arg1)->setIntegral(arg2)",a_decimal_0_0_1_0_0_1!=null ? a_decimal_0_0_1_0_0_1.getText() : null,a_integral_0_0_0!=null ? a_integral_0_0_0.getText() : null);
		Token __t = LT(0);if (__t==null) __t = LT(1);LocationTool.setLocation(result,start,__t.getColumn()+(__t.getText()!=null?__t.getText().length()-1:0),line);
		return result;
	}
	
	public final Object  ruleLabelEnumerator() throws RecognitionException, TokenStreamException {
		Object e=null;
		
		
		switch ( LA(1)) {
		case LITERAL_FS:
		{
			match(LITERAL_FS);
			e=factory.create("LabelEnumerator::FULLY_SATISFIED");
			break;
		}
		case LITERAL_PS:
		{
			match(LITERAL_PS);
			e=factory.create("LabelEnumerator::PARTIALLY_SATISFIED");
			break;
		}
		case LITERAL_FD:
		{
			match(LITERAL_FD);
			e=factory.create("LabelEnumerator::FULLY_DENIED");
			break;
		}
		case LITERAL_PD:
		{
			match(LITERAL_PD);
			e=factory.create("LabelEnumerator::PARTIALLY_DENIED");
			break;
		}
		case LITERAL_CF:
		{
			match(LITERAL_CF);
			e=factory.create("LabelEnumerator::CONFLICT");
			break;
		}
		case LITERAL_UN:
		{
			match(LITERAL_UN);
			e=factory.create("LabelEnumerator::UNKNOWN");
			break;
		}
		default:
		{
			throw new NoViableAltException(LT(1), getFilename());
		}
		}
		return e;
	}
	
	
	public static final String[] _tokenNames = {
		"<0>",
		"EOF",
		"<2>",
		"NULL_TREE_LOOKAHEAD",
		"TOKENI",
		"TOKENII",
		"TOKENIII",
		"TOKENIIII",
		"TOKENIIIII",
		"TOKENIIIIII",
		"TOKENIIIIIII",
		"TOKENIIIIIIII",
		"TOKENIIIIIIIII",
		"TOKENIIIIIIIIII",
		"TOKENIIIIIIIIIII",
		"STRING",
		"ID",
		"\"true\"",
		"\"false\"",
		"TOKENIIIIIIIIIIII",
		"TOKENIIIIIIIIIIIII",
		"\"HELP\"",
		"TOKENIIIIIIIIIIIIII",
		"\"HURT\"",
		"TOKENIIIIIIIIIIIIIII",
		"\"MAKE\"",
		"TOKENIIIIIIIIIIIIIIII",
		"\"BREAK\"",
		"\"AND\"",
		"TOKENIIIIIIIIIIIIIIIII",
		"\"OR\"",
		"TOKENIIIIIIIIIIIIIIIIII",
		"\"SEQ\"",
		"TOKENIIIIIIIIIIIIIIIIIII",
		"\"PAR\"",
		"TOKENIIIIIIIIIIIIIIIIIIII",
		"\"XOR\"",
		"TOKENIIIIIIIIIIIIIIIIIIIII",
		"TOKENIIIIIIIIIIIIIIIIIIIIII",
		"\"FS\"",
		"\"PS\"",
		"\"FD\"",
		"\"PD\"",
		"\"CF\"",
		"\"UN\"",
		"INT",
		"TOKENIIIIIIIIIIIIIIIIIIIIIII",
		"ESC",
		"HEX_DIGIT",
		"WS",
		"ML_COMMENT",
		"SL_COMMENT"
	};
	
	private static final long[] mk_tokenSet_0() {
		long[] data = { 491536L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_0 = new BitSet(mk_tokenSet_0());
	private static final long[] mk_tokenSet_1() {
		long[] data = { 69818988887314L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_1 = new BitSet(mk_tokenSet_1());
	private static final long[] mk_tokenSet_2() {
		long[] data = { 69818988883986L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_2 = new BitSet(mk_tokenSet_2());
	private static final long[] mk_tokenSet_3() {
		long[] data = { 140462878883218L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_3 = new BitSet(mk_tokenSet_3());
	private static final long[] mk_tokenSet_4() {
		long[] data = { 140466905415090L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_4 = new BitSet(mk_tokenSet_4());
	private static final long[] mk_tokenSet_5() {
		long[] data = { 140737488355314L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_5 = new BitSet(mk_tokenSet_5());
	private static final long[] mk_tokenSet_6() {
		long[] data = { 520210L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_6 = new BitSet(mk_tokenSet_6());
	private static final long[] mk_tokenSet_7() {
		long[] data = { 70094134181266L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_7 = new BitSet(mk_tokenSet_7());
	private static final long[] mk_tokenSet_8() {
		long[] data = { 495634L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_8 = new BitSet(mk_tokenSet_8());
	private static final long[] mk_tokenSet_9() {
		long[] data = { 69818988887442L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_9 = new BitSet(mk_tokenSet_9());
	
	}
