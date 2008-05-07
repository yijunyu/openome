// $ANTLR 3.0 ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g 2008-05-05 17:18:41

package q7.dsl.parser; 

import org.eclipse.emf.ecore.EObject;

import org.openarchitectureware.xtext.XtextFile;
import org.openarchitectureware.xtext.parser.EcoreModelFactory;
import org.openarchitectureware.xtext.parser.ErrorMsg;
import org.openarchitectureware.xtext.parser.model.ParseTreeManager;
import org.openarchitectureware.xtext.parser.parsetree.Node;

import q7.dsl.MetaModelRegistration;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class q7dslParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "'<'", "'>'", "'::'", "'()=>'", "'['", "']'", "'<='", "'{'", "'}'", "'=>'", "'==>'", "'true'", "'false'", "','", "'+'", "'HELP'", "'-'", "'HURT'", "'++'", "'MAKE'", "'--'", "'BREAK'", "'AND'", "'&'", "'OR'", "'|'", "'SEQ'", "';'", "'PAR'", "'||'", "'XOR'", "'/'", "'~'", "'FS'", "'PS'", "'FD'", "'PD'", "'CF'", "'UN'", "'.'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_STRING=4;
    public static final int RULE_INT=6;
    public static final int RULE_WS=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=8;

        public q7dslParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g"; }

    
    
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
    



    // $ANTLR start parse
    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:122:1: parse returns [Node r] : result= ruleAdvice EOF ;
    public Node parse() throws RecognitionException {
        Node r = null;

        EObject result = null;


        try {
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:123:4: (result= ruleAdvice EOF )
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:123:4: result= ruleAdvice EOF
            {
            pushFollow(FOLLOW_ruleAdvice_in_parse54);
            result=ruleAdvice();
            _fsp--;

            match(input,EOF,FOLLOW_EOF_in_parse56); 
            ptm.ruleFinished(result,end());r = ptm.getCurrent();

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return r;
    }
    // $ANTLR end parse


    // $ANTLR start ruleAdvice
    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:126:1: ruleAdvice returns [EObject result] : ( ( ( (temp_who= '<' ) (temp_Who= ruleWho ) ( '>' ) ( '::' ) ) ) )? ( ( ( (temp_when= ruleWhen ) ( '()=>' ) ) ) )? (temp_why= ruleWhy ) ( ( ( ( '[' ) (temp_what= ruleWhat ) ( ']' ) ) ) )? ( ( ( ( '<=' ) (temp_where= ruleWhere ) ) ) )? ( ( ( ( '{' ) (temp_how= ruleHow ) ( '}' ) ) ) )? ( ( ( ( ( ( (temp_label= ruleLabel ) ) ) )? ( ( ( ( '=>' ) (temp_howmuch= ruleHowMuchRules ) | ( '==>' ) ( '<' ) (temp_whom= ruleWho ) ( '>' ) ) ) ) ) ) )? ;
    public EObject ruleAdvice() throws RecognitionException {
        EObject result = null;

        Token temp_who=null;
        EObject temp_Who = null;

        EObject temp_when = null;

        EObject temp_why = null;

        EObject temp_what = null;

        EObject temp_where = null;

        EObject temp_how = null;

        EObject temp_label = null;

        EObject temp_howmuch = null;

        EObject temp_whom = null;


        try {
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:127:6: ( ( ( ( (temp_who= '<' ) (temp_Who= ruleWho ) ( '>' ) ( '::' ) ) ) )? ( ( ( (temp_when= ruleWhen ) ( '()=>' ) ) ) )? (temp_why= ruleWhy ) ( ( ( ( '[' ) (temp_what= ruleWhat ) ( ']' ) ) ) )? ( ( ( ( '<=' ) (temp_where= ruleWhere ) ) ) )? ( ( ( ( '{' ) (temp_how= ruleHow ) ( '}' ) ) ) )? ( ( ( ( ( ( (temp_label= ruleLabel ) ) ) )? ( ( ( ( '=>' ) (temp_howmuch= ruleHowMuchRules ) | ( '==>' ) ( '<' ) (temp_whom= ruleWho ) ( '>' ) ) ) ) ) ) )? )
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:127:6: ( ( ( (temp_who= '<' ) (temp_Who= ruleWho ) ( '>' ) ( '::' ) ) ) )? ( ( ( (temp_when= ruleWhen ) ( '()=>' ) ) ) )? (temp_why= ruleWhy ) ( ( ( ( '[' ) (temp_what= ruleWhat ) ( ']' ) ) ) )? ( ( ( ( '<=' ) (temp_where= ruleWhere ) ) ) )? ( ( ( ( '{' ) (temp_how= ruleHow ) ( '}' ) ) ) )? ( ( ( ( ( ( (temp_label= ruleLabel ) ) ) )? ( ( ( ( '=>' ) (temp_howmuch= ruleHowMuchRules ) | ( '==>' ) ( '<' ) (temp_whom= ruleWho ) ( '>' ) ) ) ) ) ) )?
            {
             
            	      result = factory.create("Advice");
            	      ptm.setModelElement(result);
            	     
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:133:2: ( ( ( (temp_who= '<' ) (temp_Who= ruleWho ) ( '>' ) ( '::' ) ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==10) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:133:3: ( ( (temp_who= '<' ) (temp_Who= ruleWho ) ( '>' ) ( '::' ) ) )
                    {
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:133:3: ( ( (temp_who= '<' ) (temp_Who= ruleWho ) ( '>' ) ( '::' ) ) )
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:134:2: ( (temp_who= '<' ) (temp_Who= ruleWho ) ( '>' ) ( '::' ) )
                    {
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:134:2: ( (temp_who= '<' ) (temp_Who= ruleWho ) ( '>' ) ( '::' ) )
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:135:2: (temp_who= '<' ) (temp_Who= ruleWho ) ( '>' ) ( '::' )
                    {
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:135:2: (temp_who= '<' )
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:135:3: temp_who= '<'
                    {
                    ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(1)).eContents().get(0)),line(),start());
                    temp_who=(Token)input.LT(1);
                    match(input,10,FOLLOW_10_in_ruleAdvice103); 
                    factory.set(result,"who",convert(temp_who)); ptm.ruleFinished(temp_who,end()); 

                    }

                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:138:2: (temp_Who= ruleWho )
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:138:3: temp_Who= ruleWho
                    {
                    ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(1)).eContents().get(0)).eContents().get(0)),line(),start());
                    pushFollow(FOLLOW_ruleWho_in_ruleAdvice118);
                    temp_Who=ruleWho();
                    _fsp--;

                    result =temp_Who;
                    ptm.ruleFinished(getLastToken(),end());

                    }

                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:142:2: ( '>' )
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:142:3: '>'
                    {
                    ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(1)).eContents().get(0)).eContents().get(0)).eContents().get(0)),line(),start());
                    match(input,11,FOLLOW_11_in_ruleAdvice131); 
                    ptm.ruleFinished(getLastToken(),end());

                    }

                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:144:2: ( '::' )
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:144:3: '::'
                    {
                    ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(1)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)),line(),start());
                    match(input,12,FOLLOW_12_in_ruleAdvice141); 
                    ptm.ruleFinished(getLastToken(),end());

                    }


                    }


                    }


                    }
                    break;

            }

            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:148:2: ( ( ( (temp_when= ruleWhen ) ( '()=>' ) ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==21) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:148:3: ( ( (temp_when= ruleWhen ) ( '()=>' ) ) )
                    {
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:148:3: ( ( (temp_when= ruleWhen ) ( '()=>' ) ) )
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:149:2: ( (temp_when= ruleWhen ) ( '()=>' ) )
                    {
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:149:2: ( (temp_when= ruleWhen ) ( '()=>' ) )
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:150:2: (temp_when= ruleWhen ) ( '()=>' )
                    {
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:150:2: (temp_when= ruleWhen )
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:150:3: temp_when= ruleWhen
                    {
                    ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(1)).eContents().get(0)),line(),start());
                    pushFollow(FOLLOW_ruleWhen_in_ruleAdvice168);
                    temp_when=ruleWhen();
                    _fsp--;

                    factory.set(result,"when",convert(temp_when)); ptm.ruleFinished(temp_when,end()); 

                    }

                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:153:2: ( '()=>' )
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:153:3: '()=>'
                    {
                    ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(1)).eContents().get(0)).eContents().get(0)),line(),start());
                    match(input,13,FOLLOW_13_in_ruleAdvice180); 
                    ptm.ruleFinished(getLastToken(),end());

                    }


                    }


                    }


                    }
                    break;

            }

            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:157:2: (temp_why= ruleWhy )
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:157:3: temp_why= ruleWhy
            {
            ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)),line(),start());
            pushFollow(FOLLOW_ruleWhy_in_ruleAdvice198);
            temp_why=ruleWhy();
            _fsp--;

            factory.set(result,"why",convert(temp_why)); ptm.ruleFinished(temp_why,end()); 

            }

            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:160:2: ( ( ( ( '[' ) (temp_what= ruleWhat ) ( ']' ) ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:160:3: ( ( ( '[' ) (temp_what= ruleWhat ) ( ']' ) ) )
                    {
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:160:3: ( ( ( '[' ) (temp_what= ruleWhat ) ( ']' ) ) )
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:161:2: ( ( '[' ) (temp_what= ruleWhat ) ( ']' ) )
                    {
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:161:2: ( ( '[' ) (temp_what= ruleWhat ) ( ']' ) )
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:162:2: ( '[' ) (temp_what= ruleWhat ) ( ']' )
                    {
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:162:2: ( '[' )
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:162:3: '['
                    {
                    ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(1)).eContents().get(0)),line(),start());
                    match(input,14,FOLLOW_14_in_ruleAdvice219); 
                    ptm.ruleFinished(getLastToken(),end());

                    }

                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:164:2: (temp_what= ruleWhat )
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:164:3: temp_what= ruleWhat
                    {
                    ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(1)).eContents().get(0)).eContents().get(0)),line(),start());
                    pushFollow(FOLLOW_ruleWhat_in_ruleAdvice231);
                    temp_what=ruleWhat();
                    _fsp--;

                    factory.set(result,"what",convert(temp_what)); ptm.ruleFinished(temp_what,end()); 

                    }

                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:167:2: ( ']' )
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:167:3: ']'
                    {
                    ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(1)).eContents().get(0)).eContents().get(0)).eContents().get(0)),line(),start());
                    match(input,15,FOLLOW_15_in_ruleAdvice243); 
                    ptm.ruleFinished(getLastToken(),end());

                    }


                    }


                    }


                    }
                    break;

            }

            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:171:2: ( ( ( ( '<=' ) (temp_where= ruleWhere ) ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:171:3: ( ( ( '<=' ) (temp_where= ruleWhere ) ) )
                    {
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:171:3: ( ( ( '<=' ) (temp_where= ruleWhere ) ) )
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:172:2: ( ( '<=' ) (temp_where= ruleWhere ) )
                    {
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:172:2: ( ( '<=' ) (temp_where= ruleWhere ) )
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:173:2: ( '<=' ) (temp_where= ruleWhere )
                    {
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:173:2: ( '<=' )
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:173:3: '<='
                    {
                    ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(1)).eContents().get(0)),line(),start());
                    match(input,16,FOLLOW_16_in_ruleAdvice268); 
                    ptm.ruleFinished(getLastToken(),end());

                    }

                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:175:2: (temp_where= ruleWhere )
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:175:3: temp_where= ruleWhere
                    {
                    ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(1)).eContents().get(0)).eContents().get(0)),line(),start());
                    pushFollow(FOLLOW_ruleWhere_in_ruleAdvice280);
                    temp_where=ruleWhere();
                    _fsp--;

                    factory.set(result,"where",convert(temp_where)); ptm.ruleFinished(temp_where,end()); 

                    }


                    }


                    }


                    }
                    break;

            }

            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:180:2: ( ( ( ( '{' ) (temp_how= ruleHow ) ( '}' ) ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:180:3: ( ( ( '{' ) (temp_how= ruleHow ) ( '}' ) ) )
                    {
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:180:3: ( ( ( '{' ) (temp_how= ruleHow ) ( '}' ) ) )
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:181:2: ( ( '{' ) (temp_how= ruleHow ) ( '}' ) )
                    {
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:181:2: ( ( '{' ) (temp_how= ruleHow ) ( '}' ) )
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:182:2: ( '{' ) (temp_how= ruleHow ) ( '}' )
                    {
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:182:2: ( '{' )
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:182:3: '{'
                    {
                    ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(1)).eContents().get(0)),line(),start());
                    match(input,17,FOLLOW_17_in_ruleAdvice307); 
                    ptm.ruleFinished(getLastToken(),end());

                    }

                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:184:2: (temp_how= ruleHow )
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:184:3: temp_how= ruleHow
                    {
                    ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(1)).eContents().get(0)).eContents().get(0)),line(),start());
                    pushFollow(FOLLOW_ruleHow_in_ruleAdvice319);
                    temp_how=ruleHow();
                    _fsp--;

                    factory.set(result,"how",convert(temp_how)); ptm.ruleFinished(temp_how,end()); 

                    }

                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:187:2: ( '}' )
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:187:3: '}'
                    {
                    ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(1)).eContents().get(0)).eContents().get(0)).eContents().get(0)),line(),start());
                    match(input,18,FOLLOW_18_in_ruleAdvice331); 
                    ptm.ruleFinished(getLastToken(),end());

                    }


                    }


                    }


                    }
                    break;

            }

            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:191:2: ( ( ( ( ( ( (temp_label= ruleLabel ) ) ) )? ( ( ( ( '=>' ) (temp_howmuch= ruleHowMuchRules ) | ( '==>' ) ( '<' ) (temp_whom= ruleWho ) ( '>' ) ) ) ) ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=19 && LA8_0<=20)||(LA8_0>=43 && LA8_0<=48)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:191:3: ( ( ( ( ( (temp_label= ruleLabel ) ) ) )? ( ( ( ( '=>' ) (temp_howmuch= ruleHowMuchRules ) | ( '==>' ) ( '<' ) (temp_whom= ruleWho ) ( '>' ) ) ) ) ) )
                    {
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:191:3: ( ( ( ( ( (temp_label= ruleLabel ) ) ) )? ( ( ( ( '=>' ) (temp_howmuch= ruleHowMuchRules ) | ( '==>' ) ( '<' ) (temp_whom= ruleWho ) ( '>' ) ) ) ) ) )
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:192:2: ( ( ( ( (temp_label= ruleLabel ) ) ) )? ( ( ( ( '=>' ) (temp_howmuch= ruleHowMuchRules ) | ( '==>' ) ( '<' ) (temp_whom= ruleWho ) ( '>' ) ) ) ) )
                    {
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:192:2: ( ( ( ( (temp_label= ruleLabel ) ) ) )? ( ( ( ( '=>' ) (temp_howmuch= ruleHowMuchRules ) | ( '==>' ) ( '<' ) (temp_whom= ruleWho ) ( '>' ) ) ) ) )
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:193:2: ( ( ( (temp_label= ruleLabel ) ) ) )? ( ( ( ( '=>' ) (temp_howmuch= ruleHowMuchRules ) | ( '==>' ) ( '<' ) (temp_whom= ruleWho ) ( '>' ) ) ) )
                    {
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:193:2: ( ( ( (temp_label= ruleLabel ) ) ) )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( ((LA6_0>=43 && LA6_0<=48)) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:193:3: ( ( (temp_label= ruleLabel ) ) )
                            {
                            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:193:3: ( ( (temp_label= ruleLabel ) ) )
                            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:194:2: ( (temp_label= ruleLabel ) )
                            {
                            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:194:2: ( (temp_label= ruleLabel ) )
                            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:195:2: (temp_label= ruleLabel )
                            {
                            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:195:2: (temp_label= ruleLabel )
                            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:195:3: temp_label= ruleLabel
                            {
                            ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(1)).eContents().get(0)),line(),start());
                            pushFollow(FOLLOW_ruleLabel_in_ruleAdvice367);
                            temp_label=ruleLabel();
                            _fsp--;

                            factory.set(result,"label",convert(temp_label)); ptm.ruleFinished(temp_label,end()); 

                            }


                            }


                            }


                            }
                            break;

                    }

                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:200:2: ( ( ( ( '=>' ) (temp_howmuch= ruleHowMuchRules ) | ( '==>' ) ( '<' ) (temp_whom= ruleWho ) ( '>' ) ) ) )
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:200:3: ( ( ( '=>' ) (temp_howmuch= ruleHowMuchRules ) | ( '==>' ) ( '<' ) (temp_whom= ruleWho ) ( '>' ) ) )
                    {
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:200:3: ( ( ( '=>' ) (temp_howmuch= ruleHowMuchRules ) | ( '==>' ) ( '<' ) (temp_whom= ruleWho ) ( '>' ) ) )
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:201:2: ( ( '=>' ) (temp_howmuch= ruleHowMuchRules ) | ( '==>' ) ( '<' ) (temp_whom= ruleWho ) ( '>' ) )
                    {
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:201:2: ( ( '=>' ) (temp_howmuch= ruleHowMuchRules ) | ( '==>' ) ( '<' ) (temp_whom= ruleWho ) ( '>' ) )
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==19) ) {
                        alt7=1;
                    }
                    else if ( (LA7_0==20) ) {
                        alt7=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("201:2: ( ( '=>' ) (temp_howmuch= ruleHowMuchRules ) | ( '==>' ) ( '<' ) (temp_whom= ruleWho ) ( '>' ) )", 7, 0, input);

                        throw nvae;
                    }
                    switch (alt7) {
                        case 1 :
                            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:202:2: ( '=>' ) (temp_howmuch= ruleHowMuchRules )
                            {
                            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:202:2: ( '=>' )
                            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:202:3: '=>'
                            {
                            ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)),line(),start());
                            match(input,19,FOLLOW_19_in_ruleAdvice394); 
                            ptm.ruleFinished(getLastToken(),end());

                            }

                            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:204:2: (temp_howmuch= ruleHowMuchRules )
                            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:204:3: temp_howmuch= ruleHowMuchRules
                            {
                            ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)),line(),start());
                            pushFollow(FOLLOW_ruleHowMuchRules_in_ruleAdvice406);
                            temp_howmuch=ruleHowMuchRules();
                            _fsp--;

                            factory.set(result,"howmuch",convert(temp_howmuch)); ptm.ruleFinished(temp_howmuch,end()); 

                            }


                            }
                            break;
                        case 2 :
                            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:207:2: ( '==>' ) ( '<' ) (temp_whom= ruleWho ) ( '>' )
                            {
                            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:207:2: ( '==>' )
                            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:207:3: '==>'
                            {
                            ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(1)),line(),start());
                            match(input,20,FOLLOW_20_in_ruleAdvice420); 
                            ptm.ruleFinished(getLastToken(),end());

                            }

                            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:209:2: ( '<' )
                            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:209:3: '<'
                            {
                            ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(1)).eContents().get(0)),line(),start());
                            match(input,10,FOLLOW_10_in_ruleAdvice430); 
                            ptm.ruleFinished(getLastToken(),end());

                            }

                            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:211:2: (temp_whom= ruleWho )
                            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:211:3: temp_whom= ruleWho
                            {
                            ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(1)).eContents().get(0)).eContents().get(0)),line(),start());
                            pushFollow(FOLLOW_ruleWho_in_ruleAdvice442);
                            temp_whom=ruleWho();
                            _fsp--;

                            factory.set(result,"whom",convert(temp_whom)); ptm.ruleFinished(temp_whom,end()); 

                            }

                            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:214:2: ( '>' )
                            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:214:3: '>'
                            {
                            ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(1)).eContents().get(0)).eContents().get(0)).eContents().get(0)),line(),start());
                            match(input,11,FOLLOW_11_in_ruleAdvice454); 
                            ptm.ruleFinished(getLastToken(),end());

                            }


                            }
                            break;

                    }


                    }


                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return result;
    }
    // $ANTLR end ruleAdvice


    // $ANTLR start ruleWho
    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:222:1: ruleWho returns [EObject result] : (temp_actor= ruleActor ) ;
    public EObject ruleWho() throws RecognitionException {
        EObject result = null;

        EObject temp_actor = null;


        try {
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:223:6: ( (temp_actor= ruleActor ) )
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:223:6: (temp_actor= ruleActor )
            {
             
            	      result = factory.create("Who");
            	      ptm.setModelElement(result);
            	     
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:229:2: (temp_actor= ruleActor )
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:229:3: temp_actor= ruleActor
            {
            ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(1)).eContents().get(0)).eContents().get(0)),line(),start());
            pushFollow(FOLLOW_ruleActor_in_ruleWho509);
            temp_actor=ruleActor();
            _fsp--;

            factory.set(result,"actor",convert(temp_actor)); ptm.ruleFinished(temp_actor,end()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return result;
    }
    // $ANTLR end ruleWho


    // $ANTLR start ruleActor
    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:234:1: ruleActor returns [EObject result] : (temp_name= RULE_STRING ) (temp_name= RULE_ID ) ;
    public EObject ruleActor() throws RecognitionException {
        EObject result = null;

        Token temp_name=null;

        try {
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:235:6: ( (temp_name= RULE_STRING ) (temp_name= RULE_ID ) )
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:235:6: (temp_name= RULE_STRING ) (temp_name= RULE_ID )
            {
             
            	      result = factory.create("Actor");
            	      ptm.setModelElement(result);
            	     
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:241:2: (temp_name= RULE_STRING )
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:241:3: temp_name= RULE_STRING
            {
            ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(2)).eContents().get(0)).eContents().get(0)),line(),start());
            temp_name=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleActor555); 
            factory.set(result,"name",convert(temp_name)); ptm.ruleFinished(temp_name,end()); 

            }

            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:245:2: (temp_name= RULE_ID )
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:245:3: temp_name= RULE_ID
            {
            ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(2)).eContents().get(0)).eContents().get(1)),line(),start());
            temp_name=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActor576); 
            factory.set(result,"name",convert(temp_name)); ptm.ruleFinished(temp_name,end()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return result;
    }
    // $ANTLR end ruleActor


    // $ANTLR start ruleWhen
    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:250:1: ruleWhen returns [EObject result] : (temp_expr= 'true' ) (temp_expr= 'false' ) ;
    public EObject ruleWhen() throws RecognitionException {
        EObject result = null;

        Token temp_expr=null;

        try {
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:251:6: ( (temp_expr= 'true' ) (temp_expr= 'false' ) )
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:251:6: (temp_expr= 'true' ) (temp_expr= 'false' )
            {
             
            	      result = factory.create("When");
            	      ptm.setModelElement(result);
            	     
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:257:2: (temp_expr= 'true' )
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:257:3: temp_expr= 'true'
            {
            ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(0)).eContents().get(0)),line(),start());
            temp_expr=(Token)input.LT(1);
            match(input,21,FOLLOW_21_in_ruleWhen622); 
            factory.set(result,"expr",convert(temp_expr)); ptm.ruleFinished(temp_expr,end()); 

            }

            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:261:2: (temp_expr= 'false' )
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:261:3: temp_expr= 'false'
            {
            ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(0)).eContents().get(1)),line(),start());
            temp_expr=(Token)input.LT(1);
            match(input,22,FOLLOW_22_in_ruleWhen643); 
            factory.set(result,"expr",convert(temp_expr)); ptm.ruleFinished(temp_expr,end()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return result;
    }
    // $ANTLR end ruleWhen


    // $ANTLR start ruleWhy
    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:266:1: ruleWhy returns [EObject result] : (temp_name= RULE_ID ) (temp_name= RULE_STRING ) ;
    public EObject ruleWhy() throws RecognitionException {
        EObject result = null;

        Token temp_name=null;

        try {
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:267:6: ( (temp_name= RULE_ID ) (temp_name= RULE_STRING ) )
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:267:6: (temp_name= RULE_ID ) (temp_name= RULE_STRING )
            {
             
            	      result = factory.create("Why");
            	      ptm.setModelElement(result);
            	     
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:273:2: (temp_name= RULE_ID )
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:273:3: temp_name= RULE_ID
            {
            ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(4)).eContents().get(0)).eContents().get(0)),line(),start());
            temp_name=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWhy689); 
            factory.set(result,"name",convert(temp_name)); ptm.ruleFinished(temp_name,end()); 

            }

            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:277:2: (temp_name= RULE_STRING )
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:277:3: temp_name= RULE_STRING
            {
            ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(4)).eContents().get(0)).eContents().get(1)),line(),start());
            temp_name=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleWhy710); 
            factory.set(result,"name",convert(temp_name)); ptm.ruleFinished(temp_name,end()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return result;
    }
    // $ANTLR end ruleWhy


    // $ANTLR start ruleWhat
    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:282:1: ruleWhat returns [EObject result] : (temp_topics= ruleTopic ) ( ( ( ( ',' ) (temp_topics= ruleTopic ) ) ) )* ;
    public EObject ruleWhat() throws RecognitionException {
        EObject result = null;

        EObject temp_topics = null;


        try {
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:283:6: ( (temp_topics= ruleTopic ) ( ( ( ( ',' ) (temp_topics= ruleTopic ) ) ) )* )
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:283:6: (temp_topics= ruleTopic ) ( ( ( ( ',' ) (temp_topics= ruleTopic ) ) ) )*
            {
             
            	      result = factory.create("What");
            	      ptm.setModelElement(result);
            	     
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:289:2: (temp_topics= ruleTopic )
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:289:3: temp_topics= ruleTopic
            {
            ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(5)).eContents().get(0)).eContents().get(0)),line(),start());
            pushFollow(FOLLOW_ruleTopic_in_ruleWhat756);
            temp_topics=ruleTopic();
            _fsp--;

            factory.add(result,"topics",convert(temp_topics)); ptm.ruleFinished(temp_topics,end()); 

            }

            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:292:2: ( ( ( ( ',' ) (temp_topics= ruleTopic ) ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==23) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:292:3: ( ( ( ',' ) (temp_topics= ruleTopic ) ) )
            	    {
            	    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:292:3: ( ( ( ',' ) (temp_topics= ruleTopic ) ) )
            	    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:293:2: ( ( ',' ) (temp_topics= ruleTopic ) )
            	    {
            	    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:293:2: ( ( ',' ) (temp_topics= ruleTopic ) )
            	    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:294:2: ( ',' ) (temp_topics= ruleTopic )
            	    {
            	    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:294:2: ( ',' )
            	    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:294:3: ','
            	    {
            	    ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(5)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)),line(),start());
            	    match(input,23,FOLLOW_23_in_ruleWhat777); 
            	    ptm.ruleFinished(getLastToken(),end());

            	    }

            	    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:296:2: (temp_topics= ruleTopic )
            	    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:296:3: temp_topics= ruleTopic
            	    {
            	    ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(5)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)),line(),start());
            	    pushFollow(FOLLOW_ruleTopic_in_ruleWhat789);
            	    temp_topics=ruleTopic();
            	    _fsp--;

            	    factory.add(result,"topics",convert(temp_topics)); ptm.ruleFinished(temp_topics,end()); 

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return result;
    }
    // $ANTLR end ruleWhat


    // $ANTLR start ruleTopic
    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:303:1: ruleTopic returns [EObject result] : (temp_name= RULE_ID ) (temp_name= RULE_STRING ) ;
    public EObject ruleTopic() throws RecognitionException {
        EObject result = null;

        Token temp_name=null;

        try {
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:304:6: ( (temp_name= RULE_ID ) (temp_name= RULE_STRING ) )
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:304:6: (temp_name= RULE_ID ) (temp_name= RULE_STRING )
            {
             
            	      result = factory.create("Topic");
            	      ptm.setModelElement(result);
            	     
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:310:2: (temp_name= RULE_ID )
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:310:3: temp_name= RULE_ID
            {
            ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(6)).eContents().get(0)).eContents().get(0)),line(),start());
            temp_name=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTopic841); 
            factory.set(result,"name",convert(temp_name)); ptm.ruleFinished(temp_name,end()); 

            }

            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:314:2: (temp_name= RULE_STRING )
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:314:3: temp_name= RULE_STRING
            {
            ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(6)).eContents().get(0)).eContents().get(1)),line(),start());
            temp_name=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTopic862); 
            factory.set(result,"name",convert(temp_name)); ptm.ruleFinished(temp_name,end()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return result;
    }
    // $ANTLR end ruleTopic


    // $ANTLR start ruleWhere
    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:319:1: ruleWhere returns [EObject result] : (temp_op= ruleOp ) (temp_name= ruleWhy ) ( ( ( ( '[' ) (temp_topics= ruleWhat ) ( ']' ) ) ) )? ;
    public EObject ruleWhere() throws RecognitionException {
        EObject result = null;

        Object temp_op = null;

        EObject temp_name = null;

        EObject temp_topics = null;


        try {
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:320:6: ( (temp_op= ruleOp ) (temp_name= ruleWhy ) ( ( ( ( '[' ) (temp_topics= ruleWhat ) ( ']' ) ) ) )? )
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:320:6: (temp_op= ruleOp ) (temp_name= ruleWhy ) ( ( ( ( '[' ) (temp_topics= ruleWhat ) ( ']' ) ) ) )?
            {
             
            	      result = factory.create("Where");
            	      ptm.setModelElement(result);
            	     
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:326:2: (temp_op= ruleOp )
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:326:3: temp_op= ruleOp
            {
            ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(7)).eContents().get(0)).eContents().get(0)),line(),start());
            pushFollow(FOLLOW_ruleOp_in_ruleWhere908);
            temp_op=ruleOp();
            _fsp--;

            factory.set(result,"op",convert(temp_op)); ptm.ruleFinished(temp_op,end()); 

            }

            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:329:2: (temp_name= ruleWhy )
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:329:3: temp_name= ruleWhy
            {
            ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(7)).eContents().get(0)).eContents().get(0)).eContents().get(0)),line(),start());
            pushFollow(FOLLOW_ruleWhy_in_ruleWhere922);
            temp_name=ruleWhy();
            _fsp--;

            factory.set(result,"name",convert(temp_name)); ptm.ruleFinished(temp_name,end()); 

            }

            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:332:2: ( ( ( ( '[' ) (temp_topics= ruleWhat ) ( ']' ) ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==14) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:332:3: ( ( ( '[' ) (temp_topics= ruleWhat ) ( ']' ) ) )
                    {
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:332:3: ( ( ( '[' ) (temp_topics= ruleWhat ) ( ']' ) ) )
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:333:2: ( ( '[' ) (temp_topics= ruleWhat ) ( ']' ) )
                    {
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:333:2: ( ( '[' ) (temp_topics= ruleWhat ) ( ']' ) )
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:334:2: ( '[' ) (temp_topics= ruleWhat ) ( ']' )
                    {
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:334:2: ( '[' )
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:334:3: '['
                    {
                    ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(7)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)),line(),start());
                    match(input,14,FOLLOW_14_in_ruleWhere943); 
                    ptm.ruleFinished(getLastToken(),end());

                    }

                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:336:2: (temp_topics= ruleWhat )
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:336:3: temp_topics= ruleWhat
                    {
                    ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(7)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)),line(),start());
                    pushFollow(FOLLOW_ruleWhat_in_ruleWhere955);
                    temp_topics=ruleWhat();
                    _fsp--;

                    factory.set(result,"topics",convert(temp_topics)); ptm.ruleFinished(temp_topics,end()); 

                    }

                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:339:2: ( ']' )
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:339:3: ']'
                    {
                    ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(7)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)),line(),start());
                    match(input,15,FOLLOW_15_in_ruleWhere967); 
                    ptm.ruleFinished(getLastToken(),end());

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return result;
    }
    // $ANTLR end ruleWhere


    // $ANTLR start ruleHow
    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:345:1: ruleHow returns [EObject result] : (temp_op= ruleDecompositionType ) ( ( ( (temp_enrich= ruleEnrichment ) ) ) )? ( ( ( (temp_advices= ruleAdvice ) ) ) )+ ;
    public EObject ruleHow() throws RecognitionException {
        EObject result = null;

        Object temp_op = null;

        Object temp_enrich = null;

        EObject temp_advices = null;


        try {
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:346:6: ( (temp_op= ruleDecompositionType ) ( ( ( (temp_enrich= ruleEnrichment ) ) ) )? ( ( ( (temp_advices= ruleAdvice ) ) ) )+ )
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:346:6: (temp_op= ruleDecompositionType ) ( ( ( (temp_enrich= ruleEnrichment ) ) ) )? ( ( ( (temp_advices= ruleAdvice ) ) ) )+
            {
             
            	      result = factory.create("How");
            	      ptm.setModelElement(result);
            	     
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:352:2: (temp_op= ruleDecompositionType )
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:352:3: temp_op= ruleDecompositionType
            {
            ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(0)).eContents().get(0)),line(),start());
            pushFollow(FOLLOW_ruleDecompositionType_in_ruleHow1017);
            temp_op=ruleDecompositionType();
            _fsp--;

            factory.set(result,"op",convert(temp_op)); ptm.ruleFinished(temp_op,end()); 

            }

            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:355:2: ( ( ( (temp_enrich= ruleEnrichment ) ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=36 && LA11_0<=41)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:355:3: ( ( (temp_enrich= ruleEnrichment ) ) )
                    {
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:355:3: ( ( (temp_enrich= ruleEnrichment ) ) )
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:356:2: ( (temp_enrich= ruleEnrichment ) )
                    {
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:356:2: ( (temp_enrich= ruleEnrichment ) )
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:357:2: (temp_enrich= ruleEnrichment )
                    {
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:357:2: (temp_enrich= ruleEnrichment )
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:357:3: temp_enrich= ruleEnrichment
                    {
                    ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(1)).eContents().get(0)),line(),start());
                    pushFollow(FOLLOW_ruleEnrichment_in_ruleHow1040);
                    temp_enrich=ruleEnrichment();
                    _fsp--;

                    factory.set(result,"enrich",convert(temp_enrich)); ptm.ruleFinished(temp_enrich,end()); 

                    }


                    }


                    }


                    }
                    break;

            }

            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:362:2: ( ( ( (temp_advices= ruleAdvice ) ) ) )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID||LA12_0==10||LA12_0==21) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:362:3: ( ( (temp_advices= ruleAdvice ) ) )
            	    {
            	    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:362:3: ( ( (temp_advices= ruleAdvice ) ) )
            	    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:363:2: ( (temp_advices= ruleAdvice ) )
            	    {
            	    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:363:2: ( (temp_advices= ruleAdvice ) )
            	    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:364:2: (temp_advices= ruleAdvice )
            	    {
            	    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:364:2: (temp_advices= ruleAdvice )
            	    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:364:3: temp_advices= ruleAdvice
            	    {
            	    ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)),line(),start());
            	    pushFollow(FOLLOW_ruleAdvice_in_ruleHow1069);
            	    temp_advices=ruleAdvice();
            	    _fsp--;

            	    factory.add(result,"advices",convert(temp_advices)); ptm.ruleFinished(temp_advices,end()); 

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return result;
    }
    // $ANTLR end ruleHow


    // $ANTLR start ruleOp
    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:371:1: ruleOp returns [Object r] : ( '+' | 'HELP' | '-' | 'HURT' | '++' | 'MAKE' | '--' | 'BREAK' );
    public Object ruleOp() throws RecognitionException {
        Object r = null;

        try {
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:372:6: ( '+' | 'HELP' | '-' | 'HURT' | '++' | 'MAKE' | '--' | 'BREAK' )
            int alt13=8;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt13=1;
                }
                break;
            case 25:
                {
                alt13=2;
                }
                break;
            case 26:
                {
                alt13=3;
                }
                break;
            case 27:
                {
                alt13=4;
                }
                break;
            case 28:
                {
                alt13=5;
                }
                break;
            case 29:
                {
                alt13=6;
                }
                break;
            case 30:
                {
                alt13=7;
                }
                break;
            case 31:
                {
                alt13=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("371:1: ruleOp returns [Object r] : ( '+' | 'HELP' | '-' | 'HURT' | '++' | 'MAKE' | '--' | 'BREAK' );", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:372:6: '+'
                    {
                    ptm.invokeRule(((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(0)),line(),start());
                    match(input,24,FOLLOW_24_in_ruleOp1110); 
                    r =ptm.ruleFinished(factory.enumLit("Op","HELP"),end());

                    }
                    break;
                case 2 :
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:375:10: 'HELP'
                    {
                    ptm.invokeRule(((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)),line(),start());
                    match(input,25,FOLLOW_25_in_ruleOp1136); 
                    r =ptm.ruleFinished(factory.enumLit("Op","HELP2"),end());

                    }
                    break;
                case 3 :
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:378:10: '-'
                    {
                    ptm.invokeRule(((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(2)),line(),start());
                    match(input,26,FOLLOW_26_in_ruleOp1162); 
                    r =ptm.ruleFinished(factory.enumLit("Op","HURT"),end());

                    }
                    break;
                case 4 :
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:381:10: 'HURT'
                    {
                    ptm.invokeRule(((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(3)),line(),start());
                    match(input,27,FOLLOW_27_in_ruleOp1188); 
                    r =ptm.ruleFinished(factory.enumLit("Op","HURT2"),end());

                    }
                    break;
                case 5 :
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:384:10: '++'
                    {
                    ptm.invokeRule(((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(4)),line(),start());
                    match(input,28,FOLLOW_28_in_ruleOp1214); 
                    r =ptm.ruleFinished(factory.enumLit("Op","MAKE"),end());

                    }
                    break;
                case 6 :
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:387:10: 'MAKE'
                    {
                    ptm.invokeRule(((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(5)),line(),start());
                    match(input,29,FOLLOW_29_in_ruleOp1240); 
                    r =ptm.ruleFinished(factory.enumLit("Op","MAKE2"),end());

                    }
                    break;
                case 7 :
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:390:10: '--'
                    {
                    ptm.invokeRule(((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(6)),line(),start());
                    match(input,30,FOLLOW_30_in_ruleOp1266); 
                    r =ptm.ruleFinished(factory.enumLit("Op","BREAK"),end());

                    }
                    break;
                case 8 :
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:393:10: 'BREAK'
                    {
                    ptm.invokeRule(((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(7)),line(),start());
                    match(input,31,FOLLOW_31_in_ruleOp1292); 
                    r =ptm.ruleFinished(factory.enumLit("Op","BREAK2"),end());

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return r;
    }
    // $ANTLR end ruleOp


    // $ANTLR start ruleDecompositionType
    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:398:1: ruleDecompositionType returns [Object r] : ( 'AND' | '&' | 'OR' | '|' );
    public Object ruleDecompositionType() throws RecognitionException {
        Object r = null;

        try {
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:399:6: ( 'AND' | '&' | 'OR' | '|' )
            int alt14=4;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt14=1;
                }
                break;
            case 33:
                {
                alt14=2;
                }
                break;
            case 34:
                {
                alt14=3;
                }
                break;
            case 35:
                {
                alt14=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("398:1: ruleDecompositionType returns [Object r] : ( 'AND' | '&' | 'OR' | '|' );", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:399:6: 'AND'
                    {
                    ptm.invokeRule(((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(0)),line(),start());
                    match(input,32,FOLLOW_32_in_ruleDecompositionType1325); 
                    r =ptm.ruleFinished(factory.enumLit("DecompositionType","AND"),end());

                    }
                    break;
                case 2 :
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:402:10: '&'
                    {
                    ptm.invokeRule(((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)),line(),start());
                    match(input,33,FOLLOW_33_in_ruleDecompositionType1351); 
                    r =ptm.ruleFinished(factory.enumLit("DecompositionType","AND1"),end());

                    }
                    break;
                case 3 :
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:405:10: 'OR'
                    {
                    ptm.invokeRule(((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(2)),line(),start());
                    match(input,34,FOLLOW_34_in_ruleDecompositionType1377); 
                    r =ptm.ruleFinished(factory.enumLit("DecompositionType","OR"),end());

                    }
                    break;
                case 4 :
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:408:10: '|'
                    {
                    ptm.invokeRule(((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(3)),line(),start());
                    match(input,35,FOLLOW_35_in_ruleDecompositionType1403); 
                    r =ptm.ruleFinished(factory.enumLit("DecompositionType","OR1"),end());

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return r;
    }
    // $ANTLR end ruleDecompositionType


    // $ANTLR start ruleEnrichment
    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:413:1: ruleEnrichment returns [Object r] : ( 'SEQ' | ';' | 'PAR' | '||' | 'XOR' | '/' );
    public Object ruleEnrichment() throws RecognitionException {
        Object r = null;

        try {
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:414:6: ( 'SEQ' | ';' | 'PAR' | '||' | 'XOR' | '/' )
            int alt15=6;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt15=1;
                }
                break;
            case 37:
                {
                alt15=2;
                }
                break;
            case 38:
                {
                alt15=3;
                }
                break;
            case 39:
                {
                alt15=4;
                }
                break;
            case 40:
                {
                alt15=5;
                }
                break;
            case 41:
                {
                alt15=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("413:1: ruleEnrichment returns [Object r] : ( 'SEQ' | ';' | 'PAR' | '||' | 'XOR' | '/' );", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:414:6: 'SEQ'
                    {
                    ptm.invokeRule(((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(0)),line(),start());
                    match(input,36,FOLLOW_36_in_ruleEnrichment1436); 
                    r =ptm.ruleFinished(factory.enumLit("Enrichment","SEQUENTIAL"),end());

                    }
                    break;
                case 2 :
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:417:10: ';'
                    {
                    ptm.invokeRule(((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(1)),line(),start());
                    match(input,37,FOLLOW_37_in_ruleEnrichment1462); 
                    r =ptm.ruleFinished(factory.enumLit("Enrichment","SEQUENTIAL1"),end());

                    }
                    break;
                case 3 :
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:420:10: 'PAR'
                    {
                    ptm.invokeRule(((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(2)),line(),start());
                    match(input,38,FOLLOW_38_in_ruleEnrichment1488); 
                    r =ptm.ruleFinished(factory.enumLit("Enrichment","PARALLEL"),end());

                    }
                    break;
                case 4 :
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:423:10: '||'
                    {
                    ptm.invokeRule(((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(3)),line(),start());
                    match(input,39,FOLLOW_39_in_ruleEnrichment1514); 
                    r =ptm.ruleFinished(factory.enumLit("Enrichment","PARALLEL1"),end());

                    }
                    break;
                case 5 :
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:426:10: 'XOR'
                    {
                    ptm.invokeRule(((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(4)),line(),start());
                    match(input,40,FOLLOW_40_in_ruleEnrichment1540); 
                    r =ptm.ruleFinished(factory.enumLit("Enrichment","XOR"),end());

                    }
                    break;
                case 6 :
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:429:10: '/'
                    {
                    ptm.invokeRule(((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(5)),line(),start());
                    match(input,41,FOLLOW_41_in_ruleEnrichment1566); 
                    r =ptm.ruleFinished(factory.enumLit("Enrichment","XOR1"),end());

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return r;
    }
    // $ANTLR end ruleEnrichment


    // $ANTLR start ruleHowMuchRules
    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:434:1: ruleHowMuchRules returns [EObject result] : (temp_howmuch= ruleHowMuch ) ( ( ( ( ',' ) (temp_howmuch= ruleHowMuch ) ) ) )* ;
    public EObject ruleHowMuchRules() throws RecognitionException {
        EObject result = null;

        EObject temp_howmuch = null;


        try {
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:435:6: ( (temp_howmuch= ruleHowMuch ) ( ( ( ( ',' ) (temp_howmuch= ruleHowMuch ) ) ) )* )
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:435:6: (temp_howmuch= ruleHowMuch ) ( ( ( ( ',' ) (temp_howmuch= ruleHowMuch ) ) ) )*
            {
             
            	      result = factory.create("HowMuchRules");
            	      ptm.setModelElement(result);
            	     
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:441:2: (temp_howmuch= ruleHowMuch )
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:441:3: temp_howmuch= ruleHowMuch
            {
            ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(12)).eContents().get(0)).eContents().get(0)),line(),start());
            pushFollow(FOLLOW_ruleHowMuch_in_ruleHowMuchRules1610);
            temp_howmuch=ruleHowMuch();
            _fsp--;

            factory.add(result,"howmuch",convert(temp_howmuch)); ptm.ruleFinished(temp_howmuch,end()); 

            }

            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:444:2: ( ( ( ( ',' ) (temp_howmuch= ruleHowMuch ) ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==23) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:444:3: ( ( ( ',' ) (temp_howmuch= ruleHowMuch ) ) )
            	    {
            	    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:444:3: ( ( ( ',' ) (temp_howmuch= ruleHowMuch ) ) )
            	    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:445:2: ( ( ',' ) (temp_howmuch= ruleHowMuch ) )
            	    {
            	    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:445:2: ( ( ',' ) (temp_howmuch= ruleHowMuch ) )
            	    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:446:2: ( ',' ) (temp_howmuch= ruleHowMuch )
            	    {
            	    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:446:2: ( ',' )
            	    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:446:3: ','
            	    {
            	    ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(12)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)),line(),start());
            	    match(input,23,FOLLOW_23_in_ruleHowMuchRules1631); 
            	    ptm.ruleFinished(getLastToken(),end());

            	    }

            	    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:448:2: (temp_howmuch= ruleHowMuch )
            	    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:448:3: temp_howmuch= ruleHowMuch
            	    {
            	    ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(12)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)),line(),start());
            	    pushFollow(FOLLOW_ruleHowMuch_in_ruleHowMuchRules1643);
            	    temp_howmuch=ruleHowMuch();
            	    _fsp--;

            	    factory.add(result,"howmuch",convert(temp_howmuch)); ptm.ruleFinished(temp_howmuch,end()); 

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return result;
    }
    // $ANTLR end ruleHowMuchRules


    // $ANTLR start ruleHowMuch
    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:455:1: ruleHowMuch returns [EObject result] : (temp_op= ruleOp ) ( ( ( (temp_strength= ruleFLOAT ) ) ) )? ( ( ( ( '<' ) (temp_who= ruleWho ) ( '>' ) ( '::' ) ) ) )? (temp_why= ruleWhy ) ( ( ( ( '[' ) (temp_what= ruleWhat ) ( ']' ) ) ) )? ( '~' ) ( ( ( (temp_trust= ruleFLOAT ) ) ) )? ( '<' ) (temp_who= ruleWho ) ( '>' ) ( ( ( ( '::' ) (temp_why= ruleWhy ) ( ( ( ( '[' ) (temp_what= ruleWhat ) ( ']' ) ) ) ) ) ) )? ;
    public EObject ruleHowMuch() throws RecognitionException {
        EObject result = null;

        Object temp_op = null;

        EObject temp_strength = null;

        EObject temp_who = null;

        EObject temp_why = null;

        EObject temp_what = null;

        EObject temp_trust = null;


        try {
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:456:6: ( (temp_op= ruleOp ) ( ( ( (temp_strength= ruleFLOAT ) ) ) )? ( ( ( ( '<' ) (temp_who= ruleWho ) ( '>' ) ( '::' ) ) ) )? (temp_why= ruleWhy ) ( ( ( ( '[' ) (temp_what= ruleWhat ) ( ']' ) ) ) )? ( '~' ) ( ( ( (temp_trust= ruleFLOAT ) ) ) )? ( '<' ) (temp_who= ruleWho ) ( '>' ) ( ( ( ( '::' ) (temp_why= ruleWhy ) ( ( ( ( '[' ) (temp_what= ruleWhat ) ( ']' ) ) ) ) ) ) )? )
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:456:6: (temp_op= ruleOp ) ( ( ( (temp_strength= ruleFLOAT ) ) ) )? ( ( ( ( '<' ) (temp_who= ruleWho ) ( '>' ) ( '::' ) ) ) )? (temp_why= ruleWhy ) ( ( ( ( '[' ) (temp_what= ruleWhat ) ( ']' ) ) ) )? ( '~' ) ( ( ( (temp_trust= ruleFLOAT ) ) ) )? ( '<' ) (temp_who= ruleWho ) ( '>' ) ( ( ( ( '::' ) (temp_why= ruleWhy ) ( ( ( ( '[' ) (temp_what= ruleWhat ) ( ']' ) ) ) ) ) ) )?
            {
             
            	      result = factory.create("HowMuch");
            	      ptm.setModelElement(result);
            	     
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:462:2: (temp_op= ruleOp )
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:462:3: temp_op= ruleOp
            {
            ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(0)).eContents().get(0)),line(),start());
            pushFollow(FOLLOW_ruleOp_in_ruleHowMuch1695);
            temp_op=ruleOp();
            _fsp--;

            factory.set(result,"op",convert(temp_op)); ptm.ruleFinished(temp_op,end()); 

            }

            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:465:2: ( ( ( (temp_strength= ruleFLOAT ) ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_INT) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:465:3: ( ( (temp_strength= ruleFLOAT ) ) )
                    {
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:465:3: ( ( (temp_strength= ruleFLOAT ) ) )
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:466:2: ( (temp_strength= ruleFLOAT ) )
                    {
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:466:2: ( (temp_strength= ruleFLOAT ) )
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:467:2: (temp_strength= ruleFLOAT )
                    {
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:467:2: (temp_strength= ruleFLOAT )
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:467:3: temp_strength= ruleFLOAT
                    {
                    ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(1)).eContents().get(0)),line(),start());
                    pushFollow(FOLLOW_ruleFLOAT_in_ruleHowMuch1718);
                    temp_strength=ruleFLOAT();
                    _fsp--;

                    factory.set(result,"strength",convert(temp_strength)); ptm.ruleFinished(temp_strength,end()); 

                    }


                    }


                    }


                    }
                    break;

            }

            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:472:2: ( ( ( ( '<' ) (temp_who= ruleWho ) ( '>' ) ( '::' ) ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==10) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:472:3: ( ( ( '<' ) (temp_who= ruleWho ) ( '>' ) ( '::' ) ) )
                    {
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:472:3: ( ( ( '<' ) (temp_who= ruleWho ) ( '>' ) ( '::' ) ) )
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:473:2: ( ( '<' ) (temp_who= ruleWho ) ( '>' ) ( '::' ) )
                    {
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:473:2: ( ( '<' ) (temp_who= ruleWho ) ( '>' ) ( '::' ) )
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:474:2: ( '<' ) (temp_who= ruleWho ) ( '>' ) ( '::' )
                    {
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:474:2: ( '<' )
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:474:3: '<'
                    {
                    ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(1)).eContents().get(0)),line(),start());
                    match(input,10,FOLLOW_10_in_ruleHowMuch1745); 
                    ptm.ruleFinished(getLastToken(),end());

                    }

                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:476:2: (temp_who= ruleWho )
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:476:3: temp_who= ruleWho
                    {
                    ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(1)).eContents().get(0)).eContents().get(0)),line(),start());
                    pushFollow(FOLLOW_ruleWho_in_ruleHowMuch1757);
                    temp_who=ruleWho();
                    _fsp--;

                    factory.set(result,"who",convert(temp_who)); ptm.ruleFinished(temp_who,end()); 

                    }

                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:479:2: ( '>' )
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:479:3: '>'
                    {
                    ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(1)).eContents().get(0)).eContents().get(0)).eContents().get(0)),line(),start());
                    match(input,11,FOLLOW_11_in_ruleHowMuch1769); 
                    ptm.ruleFinished(getLastToken(),end());

                    }

                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:481:2: ( '::' )
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:481:3: '::'
                    {
                    ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(1)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)),line(),start());
                    match(input,12,FOLLOW_12_in_ruleHowMuch1779); 
                    ptm.ruleFinished(getLastToken(),end());

                    }


                    }


                    }


                    }
                    break;

            }

            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:485:2: (temp_why= ruleWhy )
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:485:3: temp_why= ruleWhy
            {
            ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)),line(),start());
            pushFollow(FOLLOW_ruleWhy_in_ruleHowMuch1797);
            temp_why=ruleWhy();
            _fsp--;

            factory.set(result,"why",convert(temp_why)); ptm.ruleFinished(temp_why,end()); 

            }

            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:488:2: ( ( ( ( '[' ) (temp_what= ruleWhat ) ( ']' ) ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==14) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:488:3: ( ( ( '[' ) (temp_what= ruleWhat ) ( ']' ) ) )
                    {
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:488:3: ( ( ( '[' ) (temp_what= ruleWhat ) ( ']' ) ) )
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:489:2: ( ( '[' ) (temp_what= ruleWhat ) ( ']' ) )
                    {
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:489:2: ( ( '[' ) (temp_what= ruleWhat ) ( ']' ) )
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:490:2: ( '[' ) (temp_what= ruleWhat ) ( ']' )
                    {
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:490:2: ( '[' )
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:490:3: '['
                    {
                    ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)),line(),start());
                    match(input,14,FOLLOW_14_in_ruleHowMuch1818); 
                    ptm.ruleFinished(getLastToken(),end());

                    }

                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:492:2: (temp_what= ruleWhat )
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:492:3: temp_what= ruleWhat
                    {
                    ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)),line(),start());
                    pushFollow(FOLLOW_ruleWhat_in_ruleHowMuch1830);
                    temp_what=ruleWhat();
                    _fsp--;

                    factory.set(result,"what",convert(temp_what)); ptm.ruleFinished(temp_what,end()); 

                    }

                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:495:2: ( ']' )
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:495:3: ']'
                    {
                    ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)),line(),start());
                    match(input,15,FOLLOW_15_in_ruleHowMuch1842); 
                    ptm.ruleFinished(getLastToken(),end());

                    }


                    }


                    }


                    }
                    break;

            }

            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:500:2: ( '~' )
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:500:3: '~'
            {
            ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(0)).eContents().get(1)),line(),start());
            match(input,42,FOLLOW_42_in_ruleHowMuch1865); 
            ptm.ruleFinished(getLastToken(),end());

            }

            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:502:2: ( ( ( (temp_trust= ruleFLOAT ) ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_INT) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:502:3: ( ( (temp_trust= ruleFLOAT ) ) )
                    {
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:502:3: ( ( (temp_trust= ruleFLOAT ) ) )
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:503:2: ( (temp_trust= ruleFLOAT ) )
                    {
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:503:2: ( (temp_trust= ruleFLOAT ) )
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:504:2: (temp_trust= ruleFLOAT )
                    {
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:504:2: (temp_trust= ruleFLOAT )
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:504:3: temp_trust= ruleFLOAT
                    {
                    ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(0)).eContents().get(1)).eContents().get(0)).eContents().get(1)).eContents().get(0)),line(),start());
                    pushFollow(FOLLOW_ruleFLOAT_in_ruleHowMuch1886);
                    temp_trust=ruleFLOAT();
                    _fsp--;

                    factory.set(result,"trust",convert(temp_trust)); ptm.ruleFinished(temp_trust,end()); 

                    }


                    }


                    }


                    }
                    break;

            }

            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:509:2: ( '<' )
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:509:3: '<'
            {
            ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(0)).eContents().get(1)).eContents().get(0)).eContents().get(0)),line(),start());
            match(input,10,FOLLOW_10_in_ruleHowMuch1904); 
            ptm.ruleFinished(getLastToken(),end());

            }

            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:511:2: (temp_who= ruleWho )
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:511:3: temp_who= ruleWho
            {
            ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(0)).eContents().get(1)).eContents().get(0)).eContents().get(0)).eContents().get(0)),line(),start());
            pushFollow(FOLLOW_ruleWho_in_ruleHowMuch1916);
            temp_who=ruleWho();
            _fsp--;

            factory.set(result,"who",convert(temp_who)); ptm.ruleFinished(temp_who,end()); 

            }

            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:514:2: ( '>' )
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:514:3: '>'
            {
            ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(0)).eContents().get(1)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)),line(),start());
            match(input,11,FOLLOW_11_in_ruleHowMuch1928); 
            ptm.ruleFinished(getLastToken(),end());

            }

            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:516:2: ( ( ( ( '::' ) (temp_why= ruleWhy ) ( ( ( ( '[' ) (temp_what= ruleWhat ) ( ']' ) ) ) ) ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==12) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:516:3: ( ( ( '::' ) (temp_why= ruleWhy ) ( ( ( ( '[' ) (temp_what= ruleWhat ) ( ']' ) ) ) ) ) )
                    {
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:516:3: ( ( ( '::' ) (temp_why= ruleWhy ) ( ( ( ( '[' ) (temp_what= ruleWhat ) ( ']' ) ) ) ) ) )
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:517:2: ( ( '::' ) (temp_why= ruleWhy ) ( ( ( ( '[' ) (temp_what= ruleWhat ) ( ']' ) ) ) ) )
                    {
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:517:2: ( ( '::' ) (temp_why= ruleWhy ) ( ( ( ( '[' ) (temp_what= ruleWhat ) ( ']' ) ) ) ) )
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:518:2: ( '::' ) (temp_why= ruleWhy ) ( ( ( ( '[' ) (temp_what= ruleWhat ) ( ']' ) ) ) )
                    {
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:518:2: ( '::' )
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:518:3: '::'
                    {
                    ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(0)).eContents().get(1)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)),line(),start());
                    match(input,12,FOLLOW_12_in_ruleHowMuch1947); 
                    ptm.ruleFinished(getLastToken(),end());

                    }

                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:520:2: (temp_why= ruleWhy )
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:520:3: temp_why= ruleWhy
                    {
                    ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(0)).eContents().get(1)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)),line(),start());
                    pushFollow(FOLLOW_ruleWhy_in_ruleHowMuch1959);
                    temp_why=ruleWhy();
                    _fsp--;

                    factory.set(result,"why",convert(temp_why)); ptm.ruleFinished(temp_why,end()); 

                    }

                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:523:2: ( ( ( ( '[' ) (temp_what= ruleWhat ) ( ']' ) ) ) )
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:523:3: ( ( ( '[' ) (temp_what= ruleWhat ) ( ']' ) ) )
                    {
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:523:3: ( ( ( '[' ) (temp_what= ruleWhat ) ( ']' ) ) )
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:524:2: ( ( '[' ) (temp_what= ruleWhat ) ( ']' ) )
                    {
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:524:2: ( ( '[' ) (temp_what= ruleWhat ) ( ']' ) )
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:525:2: ( '[' ) (temp_what= ruleWhat ) ( ']' )
                    {
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:525:2: ( '[' )
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:525:3: '['
                    {
                    ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(0)).eContents().get(1)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)),line(),start());
                    match(input,14,FOLLOW_14_in_ruleHowMuch1980); 
                    ptm.ruleFinished(getLastToken(),end());

                    }

                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:527:2: (temp_what= ruleWhat )
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:527:3: temp_what= ruleWhat
                    {
                    ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(0)).eContents().get(1)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)),line(),start());
                    pushFollow(FOLLOW_ruleWhat_in_ruleHowMuch1992);
                    temp_what=ruleWhat();
                    _fsp--;

                    factory.set(result,"what",convert(temp_what)); ptm.ruleFinished(temp_what,end()); 

                    }

                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:530:2: ( ']' )
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:530:3: ']'
                    {
                    ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(0)).eContents().get(1)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)),line(),start());
                    match(input,15,FOLLOW_15_in_ruleHowMuch2004); 
                    ptm.ruleFinished(getLastToken(),end());

                    }


                    }


                    }


                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return result;
    }
    // $ANTLR end ruleHowMuch


    // $ANTLR start ruleLabel
    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:538:1: ruleLabel returns [EObject result] : (temp_label= ruleLabelEnumerator ) ( ( ( (temp_sat= ruleFLOAT ) ( ',' ) (temp_den= ruleFLOAT ) ) ) ) ;
    public EObject ruleLabel() throws RecognitionException {
        EObject result = null;

        Object temp_label = null;

        EObject temp_sat = null;

        EObject temp_den = null;


        try {
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:539:6: ( (temp_label= ruleLabelEnumerator ) ( ( ( (temp_sat= ruleFLOAT ) ( ',' ) (temp_den= ruleFLOAT ) ) ) ) )
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:539:6: (temp_label= ruleLabelEnumerator ) ( ( ( (temp_sat= ruleFLOAT ) ( ',' ) (temp_den= ruleFLOAT ) ) ) )
            {
             
            	      result = factory.create("Label");
            	      ptm.setModelElement(result);
            	     
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:545:2: (temp_label= ruleLabelEnumerator )
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:545:3: temp_label= ruleLabelEnumerator
            {
            ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(14)).eContents().get(0)).eContents().get(0)),line(),start());
            pushFollow(FOLLOW_ruleLabelEnumerator_in_ruleLabel2059);
            temp_label=ruleLabelEnumerator();
            _fsp--;

            factory.set(result,"label",convert(temp_label)); ptm.ruleFinished(temp_label,end()); 

            }

            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:549:2: ( ( ( (temp_sat= ruleFLOAT ) ( ',' ) (temp_den= ruleFLOAT ) ) ) )
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:549:3: ( ( (temp_sat= ruleFLOAT ) ( ',' ) (temp_den= ruleFLOAT ) ) )
            {
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:549:3: ( ( (temp_sat= ruleFLOAT ) ( ',' ) (temp_den= ruleFLOAT ) ) )
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:550:2: ( (temp_sat= ruleFLOAT ) ( ',' ) (temp_den= ruleFLOAT ) )
            {
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:550:2: ( (temp_sat= ruleFLOAT ) ( ',' ) (temp_den= ruleFLOAT ) )
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:551:2: (temp_sat= ruleFLOAT ) ( ',' ) (temp_den= ruleFLOAT )
            {
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:551:2: (temp_sat= ruleFLOAT )
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:551:3: temp_sat= ruleFLOAT
            {
            ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(14)).eContents().get(0)).eContents().get(1)).eContents().get(0)).eContents().get(0)),line(),start());
            pushFollow(FOLLOW_ruleFLOAT_in_ruleLabel2089);
            temp_sat=ruleFLOAT();
            _fsp--;

            factory.set(result,"sat",convert(temp_sat)); ptm.ruleFinished(temp_sat,end()); 

            }

            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:554:2: ( ',' )
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:554:3: ','
            {
            ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(14)).eContents().get(0)).eContents().get(1)).eContents().get(0)).eContents().get(0)).eContents().get(0)),line(),start());
            match(input,23,FOLLOW_23_in_ruleLabel2101); 
            ptm.ruleFinished(getLastToken(),end());

            }

            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:556:2: (temp_den= ruleFLOAT )
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:556:3: temp_den= ruleFLOAT
            {
            ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(14)).eContents().get(0)).eContents().get(1)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)),line(),start());
            pushFollow(FOLLOW_ruleFLOAT_in_ruleLabel2113);
            temp_den=ruleFLOAT();
            _fsp--;

            factory.set(result,"den",convert(temp_den)); ptm.ruleFinished(temp_den,end()); 

            }


            }


            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return result;
    }
    // $ANTLR end ruleLabel


    // $ANTLR start ruleLabelEnumerator
    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:563:1: ruleLabelEnumerator returns [Object r] : ( 'FS' | 'PS' | 'FD' | 'PD' | 'CF' | 'UN' );
    public Object ruleLabelEnumerator() throws RecognitionException {
        Object r = null;

        try {
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:564:6: ( 'FS' | 'PS' | 'FD' | 'PD' | 'CF' | 'UN' )
            int alt22=6;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt22=1;
                }
                break;
            case 44:
                {
                alt22=2;
                }
                break;
            case 45:
                {
                alt22=3;
                }
                break;
            case 46:
                {
                alt22=4;
                }
                break;
            case 47:
                {
                alt22=5;
                }
                break;
            case 48:
                {
                alt22=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("563:1: ruleLabelEnumerator returns [Object r] : ( 'FS' | 'PS' | 'FD' | 'PD' | 'CF' | 'UN' );", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:564:6: 'FS'
                    {
                    ptm.invokeRule(((EObject)((EObject)xtextfile.eContents().get(15)).eContents().get(0)),line(),start());
                    match(input,43,FOLLOW_43_in_ruleLabelEnumerator2153); 
                    r =ptm.ruleFinished(factory.enumLit("LabelEnumerator","FULLY_SATISFIED"),end());

                    }
                    break;
                case 2 :
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:567:10: 'PS'
                    {
                    ptm.invokeRule(((EObject)((EObject)xtextfile.eContents().get(15)).eContents().get(1)),line(),start());
                    match(input,44,FOLLOW_44_in_ruleLabelEnumerator2179); 
                    r =ptm.ruleFinished(factory.enumLit("LabelEnumerator","PARTIALLY_SATISFIED"),end());

                    }
                    break;
                case 3 :
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:570:10: 'FD'
                    {
                    ptm.invokeRule(((EObject)((EObject)xtextfile.eContents().get(15)).eContents().get(2)),line(),start());
                    match(input,45,FOLLOW_45_in_ruleLabelEnumerator2205); 
                    r =ptm.ruleFinished(factory.enumLit("LabelEnumerator","FULLY_DENIED"),end());

                    }
                    break;
                case 4 :
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:573:10: 'PD'
                    {
                    ptm.invokeRule(((EObject)((EObject)xtextfile.eContents().get(15)).eContents().get(3)),line(),start());
                    match(input,46,FOLLOW_46_in_ruleLabelEnumerator2231); 
                    r =ptm.ruleFinished(factory.enumLit("LabelEnumerator","PARTIALLY_DENIED"),end());

                    }
                    break;
                case 5 :
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:576:10: 'CF'
                    {
                    ptm.invokeRule(((EObject)((EObject)xtextfile.eContents().get(15)).eContents().get(4)),line(),start());
                    match(input,47,FOLLOW_47_in_ruleLabelEnumerator2257); 
                    r =ptm.ruleFinished(factory.enumLit("LabelEnumerator","CONFLICT"),end());

                    }
                    break;
                case 6 :
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:579:10: 'UN'
                    {
                    ptm.invokeRule(((EObject)((EObject)xtextfile.eContents().get(15)).eContents().get(5)),line(),start());
                    match(input,48,FOLLOW_48_in_ruleLabelEnumerator2283); 
                    r =ptm.ruleFinished(factory.enumLit("LabelEnumerator","UNKNOWN"),end());

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return r;
    }
    // $ANTLR end ruleLabelEnumerator


    // $ANTLR start ruleFLOAT
    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:584:1: ruleFLOAT returns [EObject result] : (temp_integral= RULE_INT ) ( ( ( ( '.' ) (temp_decimal= RULE_INT ) ) ) )? ;
    public EObject ruleFLOAT() throws RecognitionException {
        EObject result = null;

        Token temp_integral=null;
        Token temp_decimal=null;

        try {
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:585:6: ( (temp_integral= RULE_INT ) ( ( ( ( '.' ) (temp_decimal= RULE_INT ) ) ) )? )
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:585:6: (temp_integral= RULE_INT ) ( ( ( ( '.' ) (temp_decimal= RULE_INT ) ) ) )?
            {
             
            	      result = factory.create("FLOAT");
            	      ptm.setModelElement(result);
            	     
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:591:2: (temp_integral= RULE_INT )
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:591:3: temp_integral= RULE_INT
            {
            ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(16)).eContents().get(0)).eContents().get(0)),line(),start());
            temp_integral=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleFLOAT2327); 
            factory.set(result,"integral",convert(temp_integral)); ptm.ruleFinished(temp_integral,end()); 

            }

            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:594:2: ( ( ( ( '.' ) (temp_decimal= RULE_INT ) ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==49) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:594:3: ( ( ( '.' ) (temp_decimal= RULE_INT ) ) )
                    {
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:594:3: ( ( ( '.' ) (temp_decimal= RULE_INT ) ) )
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:595:2: ( ( '.' ) (temp_decimal= RULE_INT ) )
                    {
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:595:2: ( ( '.' ) (temp_decimal= RULE_INT ) )
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:596:2: ( '.' ) (temp_decimal= RULE_INT )
                    {
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:596:2: ( '.' )
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:596:3: '.'
                    {
                    ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(16)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)),line(),start());
                    match(input,49,FOLLOW_49_in_ruleFLOAT2348); 
                    ptm.ruleFinished(getLastToken(),end());

                    }

                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:598:2: (temp_decimal= RULE_INT )
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:598:3: temp_decimal= RULE_INT
                    {
                    ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(16)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)).eContents().get(0)),line(),start());
                    temp_decimal=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleFLOAT2360); 
                    factory.set(result,"decimal",convert(temp_decimal)); ptm.ruleFinished(temp_decimal,end()); 

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return result;
    }
    // $ANTLR end ruleFLOAT


 

    public static final BitSet FOLLOW_ruleAdvice_in_parse54 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_parse56 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_ruleAdvice103 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleWho_in_ruleAdvice118 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleAdvice131 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleAdvice141 = new BitSet(new long[]{0x0000000000200020L});
    public static final BitSet FOLLOW_ruleWhen_in_ruleAdvice168 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleAdvice180 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleWhy_in_ruleAdvice198 = new BitSet(new long[]{0x0001F800001B4002L});
    public static final BitSet FOLLOW_14_in_ruleAdvice219 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleWhat_in_ruleAdvice231 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleAdvice243 = new BitSet(new long[]{0x0001F800001B0002L});
    public static final BitSet FOLLOW_16_in_ruleAdvice268 = new BitSet(new long[]{0x00000000FF000000L});
    public static final BitSet FOLLOW_ruleWhere_in_ruleAdvice280 = new BitSet(new long[]{0x0001F800001A0002L});
    public static final BitSet FOLLOW_17_in_ruleAdvice307 = new BitSet(new long[]{0x0000000F00000000L});
    public static final BitSet FOLLOW_ruleHow_in_ruleAdvice319 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleAdvice331 = new BitSet(new long[]{0x0001F80000180002L});
    public static final BitSet FOLLOW_ruleLabel_in_ruleAdvice367 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_19_in_ruleAdvice394 = new BitSet(new long[]{0x00000000FF000000L});
    public static final BitSet FOLLOW_ruleHowMuchRules_in_ruleAdvice406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleAdvice420 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_ruleAdvice430 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleWho_in_ruleAdvice442 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleAdvice454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActor_in_ruleWho509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleActor555 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActor576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleWhen622 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleWhen643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWhy689 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleWhy710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTopic_in_ruleWhat756 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_ruleWhat777 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleTopic_in_ruleWhat789 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTopic841 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTopic862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOp_in_ruleWhere908 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleWhy_in_ruleWhere922 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleWhere943 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleWhat_in_ruleWhere955 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleWhere967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecompositionType_in_ruleHow1017 = new BitSet(new long[]{0x000003F000200420L});
    public static final BitSet FOLLOW_ruleEnrichment_in_ruleHow1040 = new BitSet(new long[]{0x0000000000200420L});
    public static final BitSet FOLLOW_ruleAdvice_in_ruleHow1069 = new BitSet(new long[]{0x0000000000200422L});
    public static final BitSet FOLLOW_24_in_ruleOp1110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleOp1136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleOp1162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleOp1188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleOp1214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleOp1240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleOp1266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleOp1292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleDecompositionType1325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleDecompositionType1351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleDecompositionType1377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleDecompositionType1403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleEnrichment1436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleEnrichment1462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleEnrichment1488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleEnrichment1514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleEnrichment1540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleEnrichment1566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHowMuch_in_ruleHowMuchRules1610 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_ruleHowMuchRules1631 = new BitSet(new long[]{0x00000000FF000000L});
    public static final BitSet FOLLOW_ruleHowMuch_in_ruleHowMuchRules1643 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_ruleOp_in_ruleHowMuch1695 = new BitSet(new long[]{0x0000000000000460L});
    public static final BitSet FOLLOW_ruleFLOAT_in_ruleHowMuch1718 = new BitSet(new long[]{0x0000000000000420L});
    public static final BitSet FOLLOW_10_in_ruleHowMuch1745 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleWho_in_ruleHowMuch1757 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleHowMuch1769 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleHowMuch1779 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleWhy_in_ruleHowMuch1797 = new BitSet(new long[]{0x0000040000004000L});
    public static final BitSet FOLLOW_14_in_ruleHowMuch1818 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleWhat_in_ruleHowMuch1830 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleHowMuch1842 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleHowMuch1865 = new BitSet(new long[]{0x0000000000000440L});
    public static final BitSet FOLLOW_ruleFLOAT_in_ruleHowMuch1886 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_ruleHowMuch1904 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleWho_in_ruleHowMuch1916 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleHowMuch1928 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12_in_ruleHowMuch1947 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleWhy_in_ruleHowMuch1959 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleHowMuch1980 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleWhat_in_ruleHowMuch1992 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleHowMuch2004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabelEnumerator_in_ruleLabel2059 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleFLOAT_in_ruleLabel2089 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleLabel2101 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleFLOAT_in_ruleLabel2113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleLabelEnumerator2153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleLabelEnumerator2179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleLabelEnumerator2205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleLabelEnumerator2231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleLabelEnumerator2257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleLabelEnumerator2283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleFLOAT2327 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_49_in_ruleFLOAT2348 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleFLOAT2360 = new BitSet(new long[]{0x0000000000000002L});

}