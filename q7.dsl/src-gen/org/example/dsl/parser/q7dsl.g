header{ 	
package org.example.dsl.parser; 
	
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

import org.eclipse.emf.ecore.EObject;
import org.openarchitectureware.xtext.loc.LocationTool;
import org.openarchitectureware.xtext.parser.EcoreModelFactory;

}

class q7dslParser extends Parser;

options {
	k = 6;
	defaultErrorHandler = false;     // Don't generate parser error handlers
	buildAST = false;
}

{
	private EcoreModelFactory factory;
	public q7dslParser(TokenStream stream, EcoreModelFactory factory) {
		this(stream);
		this.factory = factory;
	}
}


ruleModel returns [EObject result=null] {int start =0, line=0; List advicesList = new ArrayList();Object a_advices=null;}:
    { start = LT(1).getColumn()-1; line=LT(1).getLine();}
(       a_advices=
 ruleAdvice
   {advicesList.add(a_advices);}
)+	
	{ result = factory.create("new Model", "advices.addAll(arg1)",advicesList);}
	
	{ Token __t = LT(0);if (__t==null) __t = LT(1);LocationTool.setLocation(result,start,__t.getColumn()+(__t.getText()!=null?__t.getText().length()-1:0),line); }
;

ruleAdvice returns [EObject result=null] {int start =0, line=0; Object a_how=null;Object a_when=null;Object a_label=null;Object a_why=null;Object a_whom=null;Object a_howmuch=null;Object a_where=null;Object a_what=null;}:
    { start = LT(1).getColumn()-1; line=LT(1).getLine();}
(       a_who_0_0_0_0_0_0: TOKENI

 ruleWho
 TOKENII
 TOKENIII
)?  (       a_when=
 ruleWhen
 TOKENIIII
)?     a_why=
 ruleWhy
(     TOKENIIIII
   a_what=
 ruleWhat
 TOKENIIIIII
)?  (     TOKENIIIIIII
   a_where=
 ruleWhere
)?  (     TOKENIIIIIIII
   a_how=
 ruleHow
 TOKENIIIIIIIII
)?  (    (       a_label=
 ruleLabel
)?  (     TOKENIIIIIIIIII
   a_howmuch=
 ruleHowMuchRules
 |     TOKENIIIIIIIIIII
 TOKENI
   a_whom=
 ruleWho
 TOKENII
)?)?	
	{ result = factory.create("new Advice", "setHow(arg1)->setWhen(arg2)->setLabel(arg3)->setWhy(arg4)->setWhom(arg5)->setHowmuch(arg6)->setWhere(arg7)->setWho(arg8)->setWhat(arg9)",a_how,a_when,a_label,a_why,a_whom,a_howmuch,a_where,a_who_0_0_0_0_0_0!=null ? a_who_0_0_0_0_0_0.getText() : null,a_what);}
	
	{ Token __t = LT(0);if (__t==null) __t = LT(1);LocationTool.setLocation(result,start,__t.getColumn()+(__t.getText()!=null?__t.getText().length()-1:0),line); }
;

ruleWho returns [EObject result=null] {int start =0, line=0; Object a_actor=null;}:
    { start = LT(1).getColumn()-1; line=LT(1).getLine();}
   a_actor=
 ruleActor
	
	{ result = factory.create("new Who", "setActor(arg1)",a_actor);}
	
	{ Token __t = LT(0);if (__t==null) __t = LT(1);LocationTool.setLocation(result,start,__t.getColumn()+(__t.getText()!=null?__t.getText().length()-1:0),line); }
;

ruleActor returns [EObject result=null] {int start =0, line=0; }:
    { start = LT(1).getColumn()-1; line=LT(1).getLine();}
   a_name_0_0_0:STRING
 |       a_name_0_1_0:ID
	
	{ result = factory.create("new Actor", "setName(arg1)",a_name_0_0_0!=null ? a_name_0_0_0.getText() : null);}
	
	{ Token __t = LT(0);if (__t==null) __t = LT(1);LocationTool.setLocation(result,start,__t.getColumn()+(__t.getText()!=null?__t.getText().length()-1:0),line); }
;

ruleWhen returns [EObject result=null] {int start =0, line=0; }:
    { start = LT(1).getColumn()-1; line=LT(1).getLine();}
   a_expr_0_0_0: "true"
 |       a_expr_0_1_0: "false"
 |       a_expr_0_2_0:ID
 |       a_expr_0_3_0:STRING
	
	{ result = factory.create("new When", "setExpr(arg1)",a_expr_0_0_0!=null ? a_expr_0_0_0.getText() : null);}
	
	{ Token __t = LT(0);if (__t==null) __t = LT(1);LocationTool.setLocation(result,start,__t.getColumn()+(__t.getText()!=null?__t.getText().length()-1:0),line); }
;

ruleWhy returns [EObject result=null] {int start =0, line=0; }:
    { start = LT(1).getColumn()-1; line=LT(1).getLine();}
   a_name_0_0_0:ID
 |       a_name_0_1_0:STRING
	
	{ result = factory.create("new Why", "setName(arg1)",a_name_0_0_0!=null ? a_name_0_0_0.getText() : null);}
	
	{ Token __t = LT(0);if (__t==null) __t = LT(1);LocationTool.setLocation(result,start,__t.getColumn()+(__t.getText()!=null?__t.getText().length()-1:0),line); }
;

ruleWhat returns [EObject result=null] {int start =0, line=0; List topicsList = new ArrayList();Object a_topics=null;}:
    { start = LT(1).getColumn()-1; line=LT(1).getLine();}
   a_topics=
 ruleTopic
   {topicsList.add(a_topics);}
(     TOKENIIIIIIIIIIII
   a_topics=
 ruleTopic
   {topicsList.add(a_topics);}
)*	
	{ result = factory.create("new What", "topics.addAll(arg1)",topicsList);}
	
	{ Token __t = LT(0);if (__t==null) __t = LT(1);LocationTool.setLocation(result,start,__t.getColumn()+(__t.getText()!=null?__t.getText().length()-1:0),line); }
;

ruleTopic returns [EObject result=null] {int start =0, line=0; }:
    { start = LT(1).getColumn()-1; line=LT(1).getLine();}
   a_name_0_0_0:ID
 |       a_name_0_1_0:STRING
	
	{ result = factory.create("new Topic", "setName(arg1)",a_name_0_1_0!=null ? a_name_0_1_0.getText() : null);}
	
	{ Token __t = LT(0);if (__t==null) __t = LT(1);LocationTool.setLocation(result,start,__t.getColumn()+(__t.getText()!=null?__t.getText().length()-1:0),line); }
;

ruleWhere returns [EObject result=null] {int start =0, line=0; Object a_topics=null;Object a_op=null;Object a_name=null;}:
    { start = LT(1).getColumn()-1; line=LT(1).getLine();}
   a_op=
 ruleOp
   a_name=
 ruleWhy
(     TOKENIIIII
   a_topics=
 ruleWhat
 TOKENIIIIII
)?	
	{ result = factory.create("new Where", "setTopics(arg1)->setOp(arg2)->setName(arg3)",a_topics,a_op,a_name);}
	
	{ Token __t = LT(0);if (__t==null) __t = LT(1);LocationTool.setLocation(result,start,__t.getColumn()+(__t.getText()!=null?__t.getText().length()-1:0),line); }
;

ruleHow returns [EObject result=null] {int start =0, line=0; Object a_enrich=null;List advicesList = new ArrayList();Object a_advices=null;Object a_op=null;}:
    { start = LT(1).getColumn()-1; line=LT(1).getLine();}
   a_op=
 ruleDecompositionType
(       a_enrich=
 ruleEnrichment
)?  (       a_advices=
 ruleAdvice
   {advicesList.add(a_advices);}
)+	
	{ result = factory.create("new How", "setEnrich(arg1)->advices.addAll(arg2)->setOp(arg3)",a_enrich,advicesList,a_op);}
	
	{ Token __t = LT(0);if (__t==null) __t = LT(1);LocationTool.setLocation(result,start,__t.getColumn()+(__t.getText()!=null?__t.getText().length()-1:0),line); }
;

ruleOp returns [Object e=null] :
     TOKENIIIIIIIIIIIII {e=factory.create("Op::HELP");}
   |     "HELP" {e=factory.create("Op::HELP2");}
   |     TOKENIIIIIIIIIIIIII {e=factory.create("Op::HURT");}
   |     "HURT" {e=factory.create("Op::HURT2");}
   |     TOKENIIIIIIIIIIIIIII {e=factory.create("Op::MAKE");}
   |     "MAKE" {e=factory.create("Op::MAKE2");}
   |     TOKENIIIIIIIIIIIIIIII {e=factory.create("Op::BREAK");}
   |     "BREAK" {e=factory.create("Op::BREAK2");}
;

ruleDecompositionType returns [Object e=null] :
     "AND" {e=factory.create("DecompositionType::AND");}
   |     TOKENIIIIIIIIIIIIIIIII {e=factory.create("DecompositionType::AND1");}
   |     "OR" {e=factory.create("DecompositionType::OR");}
   |     TOKENIIIIIIIIIIIIIIIIII {e=factory.create("DecompositionType::OR1");}
;

ruleEnrichment returns [Object e=null] :
     "SEQ" {e=factory.create("Enrichment::SEQUENTIAL");}
   |     TOKENIIIIIIIIIIIIIIIIIII {e=factory.create("Enrichment::SEQUENTIAL1");}
   |     "PAR" {e=factory.create("Enrichment::PARALLEL");}
   |     TOKENIIIIIIIIIIIIIIIIIIII {e=factory.create("Enrichment::PARALLEL1");}
   |     "XOR" {e=factory.create("Enrichment::XOR");}
   |     TOKENIIIIIIIIIIIIIIIIIIIII {e=factory.create("Enrichment::XOR1");}
;

ruleHowMuchRules returns [EObject result=null] {int start =0, line=0; List howmuchList = new ArrayList();Object a_howmuch=null;}:
    { start = LT(1).getColumn()-1; line=LT(1).getLine();}
   a_howmuch=
 ruleHowMuch
   {howmuchList.add(a_howmuch);}
(     TOKENIIIIIIIIIIII
   a_howmuch=
 ruleHowMuch
   {howmuchList.add(a_howmuch);}
)*	
	{ result = factory.create("new HowMuchRules", "howmuch.addAll(arg1)",howmuchList);}
	
	{ Token __t = LT(0);if (__t==null) __t = LT(1);LocationTool.setLocation(result,start,__t.getColumn()+(__t.getText()!=null?__t.getText().length()-1:0),line); }
;

ruleHowMuch returns [EObject result=null] {int start =0, line=0; Object a_who=null;Object a_what=null;Object a_strength=null;Object a_why=null;Object a_op=null;Object a_trust=null;}:
    { start = LT(1).getColumn()-1; line=LT(1).getLine();}
   a_op=
 ruleOp
(       a_strength=
 ruleFLOAT
)?  (     TOKENI
   a_who=
 ruleWho
 TOKENII
 TOKENIII
)?     a_why=
 ruleWhy
(     TOKENIIIII
   a_what=
 ruleWhat
 TOKENIIIIII
)? |     TOKENIIIIIIIIIIIIIIIIIIIIII
(       a_trust=
 ruleFLOAT
)?   TOKENI
   a_who=
 ruleWho
 TOKENII
(     TOKENIII
   a_why=
 ruleWhy
(     TOKENIIIII
   a_what=
 ruleWhat
 TOKENIIIIII
)?)?	
	{ result = factory.create("new HowMuch", "setWho(arg1)->setWhat(arg2)->setStrength(arg3)->setWhy(arg4)->setOp(arg5)->setTrust(arg6)",a_who,a_what,a_strength,a_why,a_op,a_trust);}
	
	{ Token __t = LT(0);if (__t==null) __t = LT(1);LocationTool.setLocation(result,start,__t.getColumn()+(__t.getText()!=null?__t.getText().length()-1:0),line); }
;

ruleLabel returns [EObject result=null] {int start =0, line=0; Object a_den=null;Object a_sat=null;Object a_label=null;}:
    { start = LT(1).getColumn()-1; line=LT(1).getLine();}
   a_label=
 ruleLabelEnumerator
 |    (       a_sat=
 ruleFLOAT
 TOKENIIIIIIIIIIII
   a_den=
 ruleFLOAT
)?	
	{ result = factory.create("new Label", "setDen(arg1)->setSat(arg2)->setLabel(arg3)",a_den,a_sat,a_label);}
	
	{ Token __t = LT(0);if (__t==null) __t = LT(1);LocationTool.setLocation(result,start,__t.getColumn()+(__t.getText()!=null?__t.getText().length()-1:0),line); }
;

ruleLabelEnumerator returns [Object e=null] :
     "FS" {e=factory.create("LabelEnumerator::FULLY_SATISFIED");}
   |     "PS" {e=factory.create("LabelEnumerator::PARTIALLY_SATISFIED");}
   |     "FD" {e=factory.create("LabelEnumerator::FULLY_DENIED");}
   |     "PD" {e=factory.create("LabelEnumerator::PARTIALLY_DENIED");}
   |     "CF" {e=factory.create("LabelEnumerator::CONFLICT");}
   |     "UN" {e=factory.create("LabelEnumerator::UNKNOWN");}
;

ruleFLOAT returns [EObject result=null] {int start =0, line=0; }:
    { start = LT(1).getColumn()-1; line=LT(1).getLine();}
   a_integral_0_0_0:INT
(     TOKENIIIIIIIIIIIIIIIIIIIIIII
   a_decimal_0_0_1_0_0_1:INT
)?	
	{ result = factory.create("new FLOAT", "setDecimal(arg1)->setIntegral(arg2)",a_decimal_0_0_1_0_0_1!=null ? a_decimal_0_0_1_0_0_1.getText() : null,a_integral_0_0_0!=null ? a_integral_0_0_0.getText() : null);}
	
	{ Token __t = LT(0);if (__t==null) __t = LT(1);LocationTool.setLocation(result,start,__t.getColumn()+(__t.getText()!=null?__t.getText().length()-1:0),line); }
;


/////////////////////////////////////////////////////
//----------------------------------------------------------------------------
// The scanner
//----------------------------------------------------------------------------
class Scanner extends Lexer;

options {

	testLiterals=false;    // don't automatically test for literals
	k=6;                   // lookahead
	charVocabulary='\u0003'..'\uFFFE';
	codeGenBitsetTestThreshold=20;
}
{
	public void tab() {
		setColumn(getColumn()+1);
	}	
	
	public void newline() {
		int col = getColumn();
        super.newline();
    	setColumn(col);
    }
}


TOKENIIIII : '[';

TOKENIIII : "()=>";

TOKENIIIIIIIII : '}';

TOKENIIIIII : ']';

TOKENIIIIIIIIIIIIIIIIII : '|';

TOKENIII : "::";

TOKENIIIIIIIIIIII : ',';

TOKENI : '<';

TOKENIIIIIIIIII : "=>";

TOKENIIIIIIIIIIIIII : '-';

TOKENII : '>';

TOKENIIIIIIIIIIIIIIII : "--";

TOKENIIIIIIIIIIIIIIIIIII : ';';

TOKENIIIIIIII : '{';

TOKENIIIIIIIIIIIIIIIIIIIIII : '~';

TOKENIIIIIIIIIIIIIIIIIIIIIII : '.';

TOKENIIIIIIIIIII : "==>";

TOKENIIIIIIIIIIIIIIIIIIII : "||";

TOKENIIIIIIIIIIIII : '+';

TOKENIIIIIIIIIIIIIII : "++";

TOKENIIIIIII : "<=";

TOKENIIIIIIIIIIIIIIIIIIIII : '/';

TOKENIIIIIIIIIIIIIIIII : '&';


// escape sequence -- note that this is protected; it can only be called
//   from another lexer rule -- it will not ever directly return a token to
//   the parser
// There are various ambiguities hushed in this rule.  The optional
// '0'...'9' digit matches should be matched here rather than letting
// them go back to STRING_LITERAL to be matched.  ANTLR does the
// right thing by matching immediately; hence, it's ok to shut off
// the FOLLOW ambig warnings.
protected ESC :
	'\\' ('n'|'r'|'t'|'b'|'f'|'"'|'\''|'\\'|('u')+HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT|'0'..'3'
			(options {warnWhenFollowAmbig = false;}:'0'..'7'
			(options {warnWhenFollowAmbig = false;}:'0'..'7')?
			)?
		|'4'..'7'
			(options {warnWhenFollowAmbig = false;}:
			'0'..'7')?
		)
;


// hexadecimal digit (again, note it's protected!)
protected HEX_DIGIT :
	('0'..'9'|'A'..'F'|'a'..'f')
;


// Whitespace -- ignored
WS :
	(' '|'\t'|'\f' 
	     // handle newlines
		 |(options {generateAmbigWarnings=false;}
			:	"\r\n"  // Evil DOS
			|	'\r'    // Macintosh
			|	'\n'    // Unix (the right way)
			){ newline(); }
		)+
		{ _ttype = Token.SKIP; }
	;
	





// string literals
STRING :
  '"'! (ESC
        |	'\r' '\n'		{newline();}
		|	'\r'			{newline();}
		|	'\n'			{newline();}
		|   ~('"'|'\\'))* 
  '"'!
| '\''! (ESC
		|   '\r''\n'		{newline();}
		|	'\r'			{newline();}
		|	'\n'			{newline();}
		|   ~('\''|'\\'))* 
  '\''!
;


// an identifier.  Note that testLiterals is set to true!  This means
// that after we match the rule, we look in the literals table to see
// if it's a literal or really an identifer
ID options {testLiterals=true;}	:
	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*
;

INT :
	('0'..'9')+ 
;

// multiple-line comments
ML_COMMENT
	:	"/*"
		({ LA(2)!='/' }? '*'
		|	'\r' '\n'		{newline();}
		|	'\r'			{newline();}
		|	'\n'			{newline();}
		|	~('*'|'\n'|'\r')
		)*
		"*/"
		{$setType(Token.SKIP);}
	;
// Single-line comments
SL_COMMENT
	:	"//"
		(~('\n'|'\r'))* ('\n'|'\r'('\n')?)
		{$setType(Token.SKIP); newline();}
	;

