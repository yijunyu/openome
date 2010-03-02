lexer grammar q7dsl;
@members {
   private List<ErrorMsg> errors = new ArrayList<ErrorMsg>();
	public List<ErrorMsg> getErrors() {
		return errors;
	}
	
	public String getErrorMessage(RecognitionException e, String[] tokenNames) { 
		String msg = super.getErrorMessage(e,tokenNames);
		errors.add(ErrorMsg.create(msg,e,tokenNames));
		return msg; 
	} 
}
@header {
package q7.dsl.parser; 

import org.openarchitectureware.xtext.parser.ErrorMsg;
}

T10 : '<' ;
T11 : '>' ;
T12 : '::' ;
T13 : '()=>' ;
T14 : '[' ;
T15 : ']' ;
T16 : '<=' ;
T17 : '{' ;
T18 : '}' ;
T19 : '=>' ;
T20 : '==>' ;
T21 : 'true' ;
T22 : 'false' ;
T23 : ',' ;
T24 : '+' ;
T25 : 'HELP' ;
T26 : '-' ;
T27 : 'HURT' ;
T28 : '++' ;
T29 : 'MAKE' ;
T30 : '--' ;
T31 : 'BREAK' ;
T32 : 'AND' ;
T33 : '&' ;
T34 : 'OR' ;
T35 : '|' ;
T36 : 'SEQ' ;
T37 : ';' ;
T38 : 'PAR' ;
T39 : '||' ;
T40 : 'XOR' ;
T41 : '/' ;
T42 : '~' ;
T43 : 'FS' ;
T44 : 'PS' ;
T45 : 'FD' ;
T46 : 'PD' ;
T47 : 'CF' ;
T48 : 'UN' ;
T49 : '.' ;

// $ANTLR src "..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g" 605
RULE_ID : 

   ('^')?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*
   
;

// $ANTLR src "..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g" 611
RULE_STRING : 

   '"' ( '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\') | ~('\\'|'"') )* '"' |
   '\'' ( '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\') | ~('\\'|'\'') )* '\''
   
;

// $ANTLR src "..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g" 618
RULE_INT : 

   ('-')?('0'..'9')+ 
   
;

// $ANTLR src "..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g" 624
RULE_WS : 

   (' '|'\t'|'\r'|'\n')+ {$channel=HIDDEN;}
   
;

// $ANTLR src "..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g" 630
RULE_ML_COMMENT : 

   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
   
;

// $ANTLR src "..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g" 636
RULE_SL_COMMENT : 

   '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
   
;

