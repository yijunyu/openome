grammar debugMeWithAntlrWorks;



parse :
   result=ruleAdvice EOF 
;

ruleAdvice  : 
	    
			
	((	
	(	
	(temp_who='<' )
		
	(
temp_Who=ruleWho {$result=temp_Who;}
)
		
	('>')
		
	('::')
)
))?
		
	((	
	(	
	(temp_when=ruleWhen )
		
	('()=>')
)
))?
		
	(temp_why=ruleWhy )
		
	((	
	(	
	('[')
		
	(temp_what=ruleWhat )
		
	(']')
)
))?
		
	((	
	(	
	('<=')
		
	(temp_where=ruleWhere )
)
))?
		
	((	
	(	
	('{')
		
	(temp_how=ruleHow )
		
	('}')
)
))?
		
	((	
	(	
	((	
	(	
	(temp_label=ruleLabel )
)
))?
		
	((	
	(	
	('=>')
		
	(temp_howmuch=ruleHowMuchRules )
 | 	
	('==>')
		
	('<')
		
	(temp_whom=ruleWho )
		
	('>')
)
))
)
))?
	    
;

ruleWho  : 
	    
			
	(temp_actor=ruleActor )
	    
;

ruleActor  : 
	    
			
	(temp_name=RULE_STRING )
	    
			
	(temp_name=RULE_ID )
	    
;

ruleWhen  : 
	    
			
	(temp_expr='true' )
	    
			
	(temp_expr='false' )
	    
;

ruleWhy  : 
	    
			
	(temp_name=RULE_ID )
	    
			
	(temp_name=RULE_STRING )
	    
;

ruleWhat  : 
	    
			
	(temp_topics=ruleTopic )
		
	((	
	(	
	(',')
		
	(temp_topics=ruleTopic )
)
))*
	    
;

ruleTopic  : 
	    
			
	(temp_name=RULE_ID )
	    
			
	(temp_name=RULE_STRING )
	    
;

ruleWhere  : 
	    
			
	(temp_op=ruleOp )
		
	(temp_name=ruleWhy )
		
	((	
	(	
	('[')
		
	(temp_topics=ruleWhat )
		
	(']')
)
))?
	    
;

ruleHow  : 
	    
			
	(temp_op=ruleDecompositionType )
		
	((	
	(	
	(temp_enrich=ruleEnrichment )
)
))?
		
	((	
	(	
	(temp_advices=ruleAdvice )
)
))+
	    
;

ruleOp  :
   	 
     '+' 
     
   |   	 
     'HELP' 
     
   |   	 
     '-' 
     
   |   	 
     'HURT' 
     
   |   	 
     '++' 
     
   |   	 
     'MAKE' 
     
   |   	 
     '--' 
     
   |   	 
     'BREAK' 
     
;

ruleDecompositionType  :
   	 
     'AND' 
     
   |   	 
     '&' 
     
   |   	 
     'OR' 
     
   |   	 
     '|' 
     
;

ruleEnrichment  :
   	 
     'SEQ' 
     
   |   	 
     ';' 
     
   |   	 
     'PAR' 
     
   |   	 
     '||' 
     
   |   	 
     'XOR' 
     
   |   	 
     '/' 
     
;

ruleHowMuchRules  : 
	    
			
	(temp_howmuch=ruleHowMuch )
		
	((	
	(	
	(',')
		
	(temp_howmuch=ruleHowMuch )
)
))*
	    
;

ruleHowMuch  : 
	    
			
	(temp_op=ruleOp )
		
	((	
	(	
	(temp_strength=ruleFLOAT )
)
))?
		
	((	
	(	
	('<')
		
	(temp_who=ruleWho )
		
	('>')
		
	('::')
)
))?
		
	(temp_why=ruleWhy )
		
	((	
	(	
	('[')
		
	(temp_what=ruleWhat )
		
	(']')
)
))?
	    
			
	('~')
		
	((	
	(	
	(temp_trust=ruleFLOAT )
)
))?
		
	('<')
		
	(temp_who=ruleWho )
		
	('>')
		
	((	
	(	
	('::')
		
	(temp_why=ruleWhy )
		
	((	
	(	
	('[')
		
	(temp_what=ruleWhat )
		
	(']')
)
))
)
))?
	    
;

ruleLabel  : 
	    
			
	(temp_label=ruleLabelEnumerator )
	    
			
	((	
	(	
	(temp_sat=ruleFLOAT )
		
	(',')
		
	(temp_den=ruleFLOAT )
)
))
	    
;

ruleLabelEnumerator  :
   	 
     'FS' 
     
   |   	 
     'PS' 
     
   |   	 
     'FD' 
     
   |   	 
     'PD' 
     
   |   	 
     'CF' 
     
   |   	 
     'UN' 
     
;

ruleFLOAT  : 
	    
			
	(temp_integral=RULE_INT )
		
	((	
	(	
	('.')
		
	(temp_decimal=RULE_INT )
)
))?
	    
;

RULE_ID : 

   ('^')?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*
   
;

RULE_STRING : 

   '"' ( '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\') | ~('\\'|'"') )* '"' |
   '\'' ( '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\') | ~('\\'|'\'') )* '\''
   
;

RULE_INT : 

   ('-')?('0'..'9')+ 
   
;

RULE_WS : 

   (' '|'\t'|'\r'|'\n')+ {$channel=HIDDEN;}
   
;

RULE_ML_COMMENT : 

   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
   
;

RULE_SL_COMMENT : 

   '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
   
;

