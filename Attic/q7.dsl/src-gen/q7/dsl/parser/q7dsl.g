grammar q7dsl;

@lexer::header {
package q7.dsl.parser; 

import org.openarchitectureware.xtext.parser.ErrorMsg;
}

@parser::header {
package q7.dsl.parser; 

import org.eclipse.emf.ecore.EObject;

import org.openarchitectureware.xtext.XtextFile;
import org.openarchitectureware.xtext.parser.EcoreModelFactory;
import org.openarchitectureware.xtext.parser.ErrorMsg;
import org.openarchitectureware.xtext.parser.model.ParseTreeManager;
import org.openarchitectureware.xtext.parser.parsetree.Node;

import q7.dsl.MetaModelRegistration;

}
@lexer::members {
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

@parser::members {

	private Token getLastToken() {
		return input.LT(-1);
	}
	private Token getNextToken() {
		return input.LT(1);
	}
	
	private int line() {
		Token t = getNextToken();
		if (t==null)
			return 1;
		return t.getLine();
	}
	
	private int start() {
		Token t = getNextToken();
		if (t==null)
			return 0;
		if (t instanceof CommonToken) {
			return ((CommonToken)t).getStartIndex();
		}
		return t.getTokenIndex();
	}
	
	private int end() {
		Token t = getLastToken();
		if (t==null)
			return 1;
		if (t instanceof CommonToken) {
			return ((CommonToken)t).getStopIndex()+1;
		}
		return t.getTokenIndex();
	}
	
	protected Object convert(Object arg) {
		if (arg instanceof org.antlr.runtime.Token) {
			Token t = (Token) arg;
			String s = t.getText();
			if (t.getType() == q7dslLexer.RULE_ID && s.startsWith("^")) {
				return s.substring(1);
			} else if (t.getType()==q7dslLexer.RULE_STRING) {
				return s.substring(1,s.length()-1);
			} else if (t.getType()==q7dslLexer.RULE_INT) {
				return Integer.valueOf(s);
			}
			return s;
		}
		return arg;
	}
	
	
	private EcoreModelFactory factory;
	private Object context;
	private XtextFile xtextfile = MetaModelRegistration.getXtextFile();
	
	public q7dslParser(TokenStream stream, Object context) {
		this(stream);
		this.factory = new EcoreModelFactory(MetaModelRegistration.getEPackage());
		this.ptm = new ParseTreeManager();
		this.context = context;
	}
	
	private ParseTreeManager ptm;
	
	public ParseTreeManager getResult() {
		return ptm;
	}
	
	private List<ErrorMsg> errors = new ArrayList<ErrorMsg>();
	public List<ErrorMsg> getErrors() {
		return errors;
	}
	
	@Override
    public void reportError(RecognitionException e) {
		String msg = super.getErrorMessage(e,tokenNames);
		errors.add(ErrorMsg.create(msg,e,tokenNames));
    	ptm.addError(msg, e);
    	ptm.ruleFinished(null, end());
    }

}


parse returns [Node r]:
   result=ruleAdvice EOF 
{ptm.ruleFinished(result,end());$r = ptm.getCurrent();};

ruleAdvice returns [EObject result] : 
	    { 
	      $result = factory.create("Advice");
	      ptm.setModelElement($result);
	     }
	    
			
	((	
	(	
	({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(1)).eContents().get(0)),line(),start());}temp_who='<' {factory.set($result,"who",convert(temp_who)); ptm.ruleFinished(temp_who,end()); }
)
		
	({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(1)).eContents().get(0)).eContents().get(0)),line(),start());}
temp_Who=ruleWho {$result=temp_Who;}
{ptm.ruleFinished(getLastToken(),end());})
		
	({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(1)).eContents().get(0)).eContents().get(0)).eContents().get(0)),line(),start());}'>'{ptm.ruleFinished(getLastToken(),end());})
		
	({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(1)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)),line(),start());}'::'{ptm.ruleFinished(getLastToken(),end());})
)
))?
		
	((	
	(	
	({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(1)).eContents().get(0)),line(),start());}temp_when=ruleWhen {factory.set($result,"when",convert(temp_when)); ptm.ruleFinished(temp_when,end()); }
)
		
	({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(1)).eContents().get(0)).eContents().get(0)),line(),start());}'()=>'{ptm.ruleFinished(getLastToken(),end());})
)
))?
		
	({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)),line(),start());}temp_why=ruleWhy {factory.set($result,"why",convert(temp_why)); ptm.ruleFinished(temp_why,end()); }
)
		
	((	
	(	
	({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(1)).eContents().get(0)),line(),start());}'['{ptm.ruleFinished(getLastToken(),end());})
		
	({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(1)).eContents().get(0)).eContents().get(0)),line(),start());}temp_what=ruleWhat {factory.set($result,"what",convert(temp_what)); ptm.ruleFinished(temp_what,end()); }
)
		
	({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(1)).eContents().get(0)).eContents().get(0)).eContents().get(0)),line(),start());}']'{ptm.ruleFinished(getLastToken(),end());})
)
))?
		
	((	
	(	
	({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(1)).eContents().get(0)),line(),start());}'<='{ptm.ruleFinished(getLastToken(),end());})
		
	({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(1)).eContents().get(0)).eContents().get(0)),line(),start());}temp_where=ruleWhere {factory.set($result,"where",convert(temp_where)); ptm.ruleFinished(temp_where,end()); }
)
)
))?
		
	((	
	(	
	({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(1)).eContents().get(0)),line(),start());}'{'{ptm.ruleFinished(getLastToken(),end());})
		
	({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(1)).eContents().get(0)).eContents().get(0)),line(),start());}temp_how=ruleHow {factory.set($result,"how",convert(temp_how)); ptm.ruleFinished(temp_how,end()); }
)
		
	({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(1)).eContents().get(0)).eContents().get(0)).eContents().get(0)),line(),start());}'}'{ptm.ruleFinished(getLastToken(),end());})
)
))?
		
	((	
	(	
	((	
	(	
	({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(1)).eContents().get(0)),line(),start());}temp_label=ruleLabel {factory.set($result,"label",convert(temp_label)); ptm.ruleFinished(temp_label,end()); }
)
)
))?
		
	((	
	(	
	({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)),line(),start());}'=>'{ptm.ruleFinished(getLastToken(),end());})
		
	({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)),line(),start());}temp_howmuch=ruleHowMuchRules {factory.set($result,"howmuch",convert(temp_howmuch)); ptm.ruleFinished(temp_howmuch,end()); }
)
 | 	
	({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(1)),line(),start());}'==>'{ptm.ruleFinished(getLastToken(),end());})
		
	({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(1)).eContents().get(0)),line(),start());}'<'{ptm.ruleFinished(getLastToken(),end());})
		
	({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(1)).eContents().get(0)).eContents().get(0)),line(),start());}temp_whom=ruleWho {factory.set($result,"whom",convert(temp_whom)); ptm.ruleFinished(temp_whom,end()); }
)
		
	({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(1)).eContents().get(0)).eContents().get(0)).eContents().get(0)),line(),start());}'>'{ptm.ruleFinished(getLastToken(),end());})
)
))
)
))?
	    
;

ruleWho returns [EObject result] : 
	    { 
	      $result = factory.create("Who");
	      ptm.setModelElement($result);
	     }
	    
			
	({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(1)).eContents().get(0)).eContents().get(0)),line(),start());}temp_actor=ruleActor {factory.set($result,"actor",convert(temp_actor)); ptm.ruleFinished(temp_actor,end()); }
)
	    
;

ruleActor returns [EObject result] : 
	    { 
	      $result = factory.create("Actor");
	      ptm.setModelElement($result);
	     }
	    
			
	({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(2)).eContents().get(0)).eContents().get(0)),line(),start());}temp_name=RULE_STRING {factory.set($result,"name",convert(temp_name)); ptm.ruleFinished(temp_name,end()); }
)
	    
			
	({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(2)).eContents().get(0)).eContents().get(1)),line(),start());}temp_name=RULE_ID {factory.set($result,"name",convert(temp_name)); ptm.ruleFinished(temp_name,end()); }
)
	    
;

ruleWhen returns [EObject result] : 
	    { 
	      $result = factory.create("When");
	      ptm.setModelElement($result);
	     }
	    
			
	({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(0)).eContents().get(0)),line(),start());}temp_expr='true' {factory.set($result,"expr",convert(temp_expr)); ptm.ruleFinished(temp_expr,end()); }
)
	    
			
	({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(0)).eContents().get(1)),line(),start());}temp_expr='false' {factory.set($result,"expr",convert(temp_expr)); ptm.ruleFinished(temp_expr,end()); }
)
	    
;

ruleWhy returns [EObject result] : 
	    { 
	      $result = factory.create("Why");
	      ptm.setModelElement($result);
	     }
	    
			
	({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(4)).eContents().get(0)).eContents().get(0)),line(),start());}temp_name=RULE_ID {factory.set($result,"name",convert(temp_name)); ptm.ruleFinished(temp_name,end()); }
)
	    
			
	({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(4)).eContents().get(0)).eContents().get(1)),line(),start());}temp_name=RULE_STRING {factory.set($result,"name",convert(temp_name)); ptm.ruleFinished(temp_name,end()); }
)
	    
;

ruleWhat returns [EObject result] : 
	    { 
	      $result = factory.create("What");
	      ptm.setModelElement($result);
	     }
	    
			
	({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(5)).eContents().get(0)).eContents().get(0)),line(),start());}temp_topics=ruleTopic {factory.add($result,"topics",convert(temp_topics)); ptm.ruleFinished(temp_topics,end()); }
)
		
	((	
	(	
	({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(5)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)),line(),start());}','{ptm.ruleFinished(getLastToken(),end());})
		
	({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(5)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)),line(),start());}temp_topics=ruleTopic {factory.add($result,"topics",convert(temp_topics)); ptm.ruleFinished(temp_topics,end()); }
)
)
))*
	    
;

ruleTopic returns [EObject result] : 
	    { 
	      $result = factory.create("Topic");
	      ptm.setModelElement($result);
	     }
	    
			
	({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(6)).eContents().get(0)).eContents().get(0)),line(),start());}temp_name=RULE_ID {factory.set($result,"name",convert(temp_name)); ptm.ruleFinished(temp_name,end()); }
)
	    
			
	({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(6)).eContents().get(0)).eContents().get(1)),line(),start());}temp_name=RULE_STRING {factory.set($result,"name",convert(temp_name)); ptm.ruleFinished(temp_name,end()); }
)
	    
;

ruleWhere returns [EObject result] : 
	    { 
	      $result = factory.create("Where");
	      ptm.setModelElement($result);
	     }
	    
			
	({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(7)).eContents().get(0)).eContents().get(0)),line(),start());}temp_op=ruleOp {factory.set($result,"op",convert(temp_op)); ptm.ruleFinished(temp_op,end()); }
)
		
	({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(7)).eContents().get(0)).eContents().get(0)).eContents().get(0)),line(),start());}temp_name=ruleWhy {factory.set($result,"name",convert(temp_name)); ptm.ruleFinished(temp_name,end()); }
)
		
	((	
	(	
	({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(7)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)),line(),start());}'['{ptm.ruleFinished(getLastToken(),end());})
		
	({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(7)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)),line(),start());}temp_topics=ruleWhat {factory.set($result,"topics",convert(temp_topics)); ptm.ruleFinished(temp_topics,end()); }
)
		
	({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(7)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)),line(),start());}']'{ptm.ruleFinished(getLastToken(),end());})
)
))?
	    
;

ruleHow returns [EObject result] : 
	    { 
	      $result = factory.create("How");
	      ptm.setModelElement($result);
	     }
	    
			
	({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(0)).eContents().get(0)),line(),start());}temp_op=ruleDecompositionType {factory.set($result,"op",convert(temp_op)); ptm.ruleFinished(temp_op,end()); }
)
		
	((	
	(	
	({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(1)).eContents().get(0)),line(),start());}temp_enrich=ruleEnrichment {factory.set($result,"enrich",convert(temp_enrich)); ptm.ruleFinished(temp_enrich,end()); }
)
)
))?
		
	((	
	(	
	({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)),line(),start());}temp_advices=ruleAdvice {factory.add($result,"advices",convert(temp_advices)); ptm.ruleFinished(temp_advices,end()); }
)
)
))+
	    
;

ruleOp returns [Object r] :
   	 {ptm.invokeRule(((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(0)),line(),start());}
     '+' 
     {$r=ptm.ruleFinished(factory.enumLit("Op","HELP"),end());}
   |   	 {ptm.invokeRule(((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)),line(),start());}
     'HELP' 
     {$r=ptm.ruleFinished(factory.enumLit("Op","HELP2"),end());}
   |   	 {ptm.invokeRule(((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(2)),line(),start());}
     '-' 
     {$r=ptm.ruleFinished(factory.enumLit("Op","HURT"),end());}
   |   	 {ptm.invokeRule(((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(3)),line(),start());}
     'HURT' 
     {$r=ptm.ruleFinished(factory.enumLit("Op","HURT2"),end());}
   |   	 {ptm.invokeRule(((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(4)),line(),start());}
     '++' 
     {$r=ptm.ruleFinished(factory.enumLit("Op","MAKE"),end());}
   |   	 {ptm.invokeRule(((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(5)),line(),start());}
     'MAKE' 
     {$r=ptm.ruleFinished(factory.enumLit("Op","MAKE2"),end());}
   |   	 {ptm.invokeRule(((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(6)),line(),start());}
     '--' 
     {$r=ptm.ruleFinished(factory.enumLit("Op","BREAK"),end());}
   |   	 {ptm.invokeRule(((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(7)),line(),start());}
     'BREAK' 
     {$r=ptm.ruleFinished(factory.enumLit("Op","BREAK2"),end());}
;

ruleDecompositionType returns [Object r] :
   	 {ptm.invokeRule(((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(0)),line(),start());}
     'AND' 
     {$r=ptm.ruleFinished(factory.enumLit("DecompositionType","AND"),end());}
   |   	 {ptm.invokeRule(((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)),line(),start());}
     '&' 
     {$r=ptm.ruleFinished(factory.enumLit("DecompositionType","AND1"),end());}
   |   	 {ptm.invokeRule(((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(2)),line(),start());}
     'OR' 
     {$r=ptm.ruleFinished(factory.enumLit("DecompositionType","OR"),end());}
   |   	 {ptm.invokeRule(((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(3)),line(),start());}
     '|' 
     {$r=ptm.ruleFinished(factory.enumLit("DecompositionType","OR1"),end());}
;

ruleEnrichment returns [Object r] :
   	 {ptm.invokeRule(((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(0)),line(),start());}
     'SEQ' 
     {$r=ptm.ruleFinished(factory.enumLit("Enrichment","SEQUENTIAL"),end());}
   |   	 {ptm.invokeRule(((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(1)),line(),start());}
     ';' 
     {$r=ptm.ruleFinished(factory.enumLit("Enrichment","SEQUENTIAL1"),end());}
   |   	 {ptm.invokeRule(((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(2)),line(),start());}
     'PAR' 
     {$r=ptm.ruleFinished(factory.enumLit("Enrichment","PARALLEL"),end());}
   |   	 {ptm.invokeRule(((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(3)),line(),start());}
     '||' 
     {$r=ptm.ruleFinished(factory.enumLit("Enrichment","PARALLEL1"),end());}
   |   	 {ptm.invokeRule(((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(4)),line(),start());}
     'XOR' 
     {$r=ptm.ruleFinished(factory.enumLit("Enrichment","XOR"),end());}
   |   	 {ptm.invokeRule(((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(5)),line(),start());}
     '/' 
     {$r=ptm.ruleFinished(factory.enumLit("Enrichment","XOR1"),end());}
;

ruleHowMuchRules returns [EObject result] : 
	    { 
	      $result = factory.create("HowMuchRules");
	      ptm.setModelElement($result);
	     }
	    
			
	({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(12)).eContents().get(0)).eContents().get(0)),line(),start());}temp_howmuch=ruleHowMuch {factory.add($result,"howmuch",convert(temp_howmuch)); ptm.ruleFinished(temp_howmuch,end()); }
)
		
	((	
	(	
	({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(12)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)),line(),start());}','{ptm.ruleFinished(getLastToken(),end());})
		
	({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(12)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)),line(),start());}temp_howmuch=ruleHowMuch {factory.add($result,"howmuch",convert(temp_howmuch)); ptm.ruleFinished(temp_howmuch,end()); }
)
)
))*
	    
;

ruleHowMuch returns [EObject result] : 
	    { 
	      $result = factory.create("HowMuch");
	      ptm.setModelElement($result);
	     }
	    
			
	({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(0)).eContents().get(0)),line(),start());}temp_op=ruleOp {factory.set($result,"op",convert(temp_op)); ptm.ruleFinished(temp_op,end()); }
)
		
	((	
	(	
	({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(1)).eContents().get(0)),line(),start());}temp_strength=ruleFLOAT {factory.set($result,"strength",convert(temp_strength)); ptm.ruleFinished(temp_strength,end()); }
)
)
))?
		
	((	
	(	
	({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(1)).eContents().get(0)),line(),start());}'<'{ptm.ruleFinished(getLastToken(),end());})
		
	({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(1)).eContents().get(0)).eContents().get(0)),line(),start());}temp_who=ruleWho {factory.set($result,"who",convert(temp_who)); ptm.ruleFinished(temp_who,end()); }
)
		
	({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(1)).eContents().get(0)).eContents().get(0)).eContents().get(0)),line(),start());}'>'{ptm.ruleFinished(getLastToken(),end());})
		
	({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(1)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)),line(),start());}'::'{ptm.ruleFinished(getLastToken(),end());})
)
))?
		
	({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)),line(),start());}temp_why=ruleWhy {factory.set($result,"why",convert(temp_why)); ptm.ruleFinished(temp_why,end()); }
)
		
	((	
	(	
	({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)),line(),start());}'['{ptm.ruleFinished(getLastToken(),end());})
		
	({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)),line(),start());}temp_what=ruleWhat {factory.set($result,"what",convert(temp_what)); ptm.ruleFinished(temp_what,end()); }
)
		
	({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)),line(),start());}']'{ptm.ruleFinished(getLastToken(),end());})
)
))?
	    
			
	({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(0)).eContents().get(1)),line(),start());}'~'{ptm.ruleFinished(getLastToken(),end());})
		
	((	
	(	
	({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(0)).eContents().get(1)).eContents().get(0)).eContents().get(1)).eContents().get(0)),line(),start());}temp_trust=ruleFLOAT {factory.set($result,"trust",convert(temp_trust)); ptm.ruleFinished(temp_trust,end()); }
)
)
))?
		
	({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(0)).eContents().get(1)).eContents().get(0)).eContents().get(0)),line(),start());}'<'{ptm.ruleFinished(getLastToken(),end());})
		
	({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(0)).eContents().get(1)).eContents().get(0)).eContents().get(0)).eContents().get(0)),line(),start());}temp_who=ruleWho {factory.set($result,"who",convert(temp_who)); ptm.ruleFinished(temp_who,end()); }
)
		
	({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(0)).eContents().get(1)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)),line(),start());}'>'{ptm.ruleFinished(getLastToken(),end());})
		
	((	
	(	
	({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(0)).eContents().get(1)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)),line(),start());}'::'{ptm.ruleFinished(getLastToken(),end());})
		
	({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(0)).eContents().get(1)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)),line(),start());}temp_why=ruleWhy {factory.set($result,"why",convert(temp_why)); ptm.ruleFinished(temp_why,end()); }
)
		
	((	
	(	
	({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(0)).eContents().get(1)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)),line(),start());}'['{ptm.ruleFinished(getLastToken(),end());})
		
	({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(0)).eContents().get(1)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)),line(),start());}temp_what=ruleWhat {factory.set($result,"what",convert(temp_what)); ptm.ruleFinished(temp_what,end()); }
)
		
	({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(0)).eContents().get(1)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)),line(),start());}']'{ptm.ruleFinished(getLastToken(),end());})
)
))
)
))?
	    
;

ruleLabel returns [EObject result] : 
	    { 
	      $result = factory.create("Label");
	      ptm.setModelElement($result);
	     }
	    
			
	({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(14)).eContents().get(0)).eContents().get(0)),line(),start());}temp_label=ruleLabelEnumerator {factory.set($result,"label",convert(temp_label)); ptm.ruleFinished(temp_label,end()); }
)
	    
			
	((	
	(	
	({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(14)).eContents().get(0)).eContents().get(1)).eContents().get(0)).eContents().get(0)),line(),start());}temp_sat=ruleFLOAT {factory.set($result,"sat",convert(temp_sat)); ptm.ruleFinished(temp_sat,end()); }
)
		
	({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(14)).eContents().get(0)).eContents().get(1)).eContents().get(0)).eContents().get(0)).eContents().get(0)),line(),start());}','{ptm.ruleFinished(getLastToken(),end());})
		
	({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(14)).eContents().get(0)).eContents().get(1)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)),line(),start());}temp_den=ruleFLOAT {factory.set($result,"den",convert(temp_den)); ptm.ruleFinished(temp_den,end()); }
)
)
))
	    
;

ruleLabelEnumerator returns [Object r] :
   	 {ptm.invokeRule(((EObject)((EObject)xtextfile.eContents().get(15)).eContents().get(0)),line(),start());}
     'FS' 
     {$r=ptm.ruleFinished(factory.enumLit("LabelEnumerator","FULLY_SATISFIED"),end());}
   |   	 {ptm.invokeRule(((EObject)((EObject)xtextfile.eContents().get(15)).eContents().get(1)),line(),start());}
     'PS' 
     {$r=ptm.ruleFinished(factory.enumLit("LabelEnumerator","PARTIALLY_SATISFIED"),end());}
   |   	 {ptm.invokeRule(((EObject)((EObject)xtextfile.eContents().get(15)).eContents().get(2)),line(),start());}
     'FD' 
     {$r=ptm.ruleFinished(factory.enumLit("LabelEnumerator","FULLY_DENIED"),end());}
   |   	 {ptm.invokeRule(((EObject)((EObject)xtextfile.eContents().get(15)).eContents().get(3)),line(),start());}
     'PD' 
     {$r=ptm.ruleFinished(factory.enumLit("LabelEnumerator","PARTIALLY_DENIED"),end());}
   |   	 {ptm.invokeRule(((EObject)((EObject)xtextfile.eContents().get(15)).eContents().get(4)),line(),start());}
     'CF' 
     {$r=ptm.ruleFinished(factory.enumLit("LabelEnumerator","CONFLICT"),end());}
   |   	 {ptm.invokeRule(((EObject)((EObject)xtextfile.eContents().get(15)).eContents().get(5)),line(),start());}
     'UN' 
     {$r=ptm.ruleFinished(factory.enumLit("LabelEnumerator","UNKNOWN"),end());}
;

ruleFLOAT returns [EObject result] : 
	    { 
	      $result = factory.create("FLOAT");
	      ptm.setModelElement($result);
	     }
	    
			
	({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(16)).eContents().get(0)).eContents().get(0)),line(),start());}temp_integral=RULE_INT {factory.set($result,"integral",convert(temp_integral)); ptm.ruleFinished(temp_integral,end()); }
)
		
	((	
	(	
	({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(16)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)),line(),start());}'.'{ptm.ruleFinished(getLastToken(),end());})
		
	({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(16)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)),line(),start());}temp_decimal=RULE_INT {factory.set($result,"decimal",convert(temp_decimal)); ptm.ruleFinished(temp_decimal,end()); }
)
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

