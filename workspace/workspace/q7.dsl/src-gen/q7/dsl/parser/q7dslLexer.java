// $ANTLR 3.0 ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g 2008-05-05 17:18:42

package q7.dsl.parser; 

import org.openarchitectureware.xtext.parser.ErrorMsg;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class q7dslLexer extends Lexer {
    public static final int RULE_ID=5;
    public static final int T29=29;
    public static final int T28=28;
    public static final int T27=27;
    public static final int T26=26;
    public static final int T25=25;
    public static final int EOF=-1;
    public static final int T24=24;
    public static final int T23=23;
    public static final int T22=22;
    public static final int T21=21;
    public static final int T20=20;
    public static final int RULE_INT=6;
    public static final int T38=38;
    public static final int T37=37;
    public static final int T39=39;
    public static final int T34=34;
    public static final int T33=33;
    public static final int T36=36;
    public static final int T35=35;
    public static final int T30=30;
    public static final int T32=32;
    public static final int T31=31;
    public static final int T49=49;
    public static final int T48=48;
    public static final int T43=43;
    public static final int Tokens=50;
    public static final int RULE_SL_COMMENT=9;
    public static final int T42=42;
    public static final int T41=41;
    public static final int T40=40;
    public static final int T47=47;
    public static final int T46=46;
    public static final int T45=45;
    public static final int RULE_ML_COMMENT=8;
    public static final int T44=44;
    public static final int RULE_STRING=4;
    public static final int T10=10;
    public static final int T11=11;
    public static final int T12=12;
    public static final int T13=13;
    public static final int T14=14;
    public static final int T15=15;
    public static final int RULE_WS=7;
    public static final int T16=16;
    public static final int T17=17;
    public static final int T18=18;
    public static final int T19=19;
    
       private List<ErrorMsg> errors = new ArrayList<ErrorMsg>();
    	public List<ErrorMsg> getErrors() {
    		return errors;
    	}
    	
    	public String getErrorMessage(RecognitionException e, String[] tokenNames) { 
    		String msg = super.getErrorMessage(e,tokenNames);
    		errors.add(ErrorMsg.create(msg,e,tokenNames));
    		return msg; 
    	} 

    public q7dslLexer() {;} 
    public q7dslLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g"; }

    // $ANTLR start T10
    public void mT10() throws RecognitionException {
        try {
            int _type = T10;
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:20:7: ( '<' )
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:20:7: '<'
            {
            match('<'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T10

    // $ANTLR start T11
    public void mT11() throws RecognitionException {
        try {
            int _type = T11;
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:21:7: ( '>' )
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:21:7: '>'
            {
            match('>'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T11

    // $ANTLR start T12
    public void mT12() throws RecognitionException {
        try {
            int _type = T12;
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:22:7: ( '::' )
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:22:7: '::'
            {
            match("::"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T12

    // $ANTLR start T13
    public void mT13() throws RecognitionException {
        try {
            int _type = T13;
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:23:7: ( '()=>' )
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:23:7: '()=>'
            {
            match("()=>"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T13

    // $ANTLR start T14
    public void mT14() throws RecognitionException {
        try {
            int _type = T14;
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:24:7: ( '[' )
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:24:7: '['
            {
            match('['); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T14

    // $ANTLR start T15
    public void mT15() throws RecognitionException {
        try {
            int _type = T15;
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:25:7: ( ']' )
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:25:7: ']'
            {
            match(']'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T15

    // $ANTLR start T16
    public void mT16() throws RecognitionException {
        try {
            int _type = T16;
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:26:7: ( '<=' )
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:26:7: '<='
            {
            match("<="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T16

    // $ANTLR start T17
    public void mT17() throws RecognitionException {
        try {
            int _type = T17;
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:27:7: ( '{' )
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:27:7: '{'
            {
            match('{'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T17

    // $ANTLR start T18
    public void mT18() throws RecognitionException {
        try {
            int _type = T18;
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:28:7: ( '}' )
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:28:7: '}'
            {
            match('}'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T18

    // $ANTLR start T19
    public void mT19() throws RecognitionException {
        try {
            int _type = T19;
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:29:7: ( '=>' )
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:29:7: '=>'
            {
            match("=>"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T19

    // $ANTLR start T20
    public void mT20() throws RecognitionException {
        try {
            int _type = T20;
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:30:7: ( '==>' )
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:30:7: '==>'
            {
            match("==>"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T20

    // $ANTLR start T21
    public void mT21() throws RecognitionException {
        try {
            int _type = T21;
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:31:7: ( 'true' )
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:31:7: 'true'
            {
            match("true"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T21

    // $ANTLR start T22
    public void mT22() throws RecognitionException {
        try {
            int _type = T22;
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:32:7: ( 'false' )
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:32:7: 'false'
            {
            match("false"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T22

    // $ANTLR start T23
    public void mT23() throws RecognitionException {
        try {
            int _type = T23;
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:33:7: ( ',' )
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:33:7: ','
            {
            match(','); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T23

    // $ANTLR start T24
    public void mT24() throws RecognitionException {
        try {
            int _type = T24;
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:34:7: ( '+' )
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:34:7: '+'
            {
            match('+'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T24

    // $ANTLR start T25
    public void mT25() throws RecognitionException {
        try {
            int _type = T25;
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:35:7: ( 'HELP' )
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:35:7: 'HELP'
            {
            match("HELP"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T25

    // $ANTLR start T26
    public void mT26() throws RecognitionException {
        try {
            int _type = T26;
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:36:7: ( '-' )
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:36:7: '-'
            {
            match('-'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T26

    // $ANTLR start T27
    public void mT27() throws RecognitionException {
        try {
            int _type = T27;
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:37:7: ( 'HURT' )
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:37:7: 'HURT'
            {
            match("HURT"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T27

    // $ANTLR start T28
    public void mT28() throws RecognitionException {
        try {
            int _type = T28;
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:38:7: ( '++' )
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:38:7: '++'
            {
            match("++"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T28

    // $ANTLR start T29
    public void mT29() throws RecognitionException {
        try {
            int _type = T29;
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:39:7: ( 'MAKE' )
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:39:7: 'MAKE'
            {
            match("MAKE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T29

    // $ANTLR start T30
    public void mT30() throws RecognitionException {
        try {
            int _type = T30;
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:40:7: ( '--' )
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:40:7: '--'
            {
            match("--"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T30

    // $ANTLR start T31
    public void mT31() throws RecognitionException {
        try {
            int _type = T31;
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:41:7: ( 'BREAK' )
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:41:7: 'BREAK'
            {
            match("BREAK"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T31

    // $ANTLR start T32
    public void mT32() throws RecognitionException {
        try {
            int _type = T32;
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:42:7: ( 'AND' )
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:42:7: 'AND'
            {
            match("AND"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T32

    // $ANTLR start T33
    public void mT33() throws RecognitionException {
        try {
            int _type = T33;
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:43:7: ( '&' )
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:43:7: '&'
            {
            match('&'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T33

    // $ANTLR start T34
    public void mT34() throws RecognitionException {
        try {
            int _type = T34;
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:44:7: ( 'OR' )
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:44:7: 'OR'
            {
            match("OR"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T34

    // $ANTLR start T35
    public void mT35() throws RecognitionException {
        try {
            int _type = T35;
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:45:7: ( '|' )
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:45:7: '|'
            {
            match('|'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T35

    // $ANTLR start T36
    public void mT36() throws RecognitionException {
        try {
            int _type = T36;
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:46:7: ( 'SEQ' )
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:46:7: 'SEQ'
            {
            match("SEQ"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T36

    // $ANTLR start T37
    public void mT37() throws RecognitionException {
        try {
            int _type = T37;
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:47:7: ( ';' )
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:47:7: ';'
            {
            match(';'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T37

    // $ANTLR start T38
    public void mT38() throws RecognitionException {
        try {
            int _type = T38;
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:48:7: ( 'PAR' )
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:48:7: 'PAR'
            {
            match("PAR"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T38

    // $ANTLR start T39
    public void mT39() throws RecognitionException {
        try {
            int _type = T39;
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:49:7: ( '||' )
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:49:7: '||'
            {
            match("||"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T39

    // $ANTLR start T40
    public void mT40() throws RecognitionException {
        try {
            int _type = T40;
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:50:7: ( 'XOR' )
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:50:7: 'XOR'
            {
            match("XOR"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T40

    // $ANTLR start T41
    public void mT41() throws RecognitionException {
        try {
            int _type = T41;
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:51:7: ( '/' )
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:51:7: '/'
            {
            match('/'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T41

    // $ANTLR start T42
    public void mT42() throws RecognitionException {
        try {
            int _type = T42;
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:52:7: ( '~' )
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:52:7: '~'
            {
            match('~'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T42

    // $ANTLR start T43
    public void mT43() throws RecognitionException {
        try {
            int _type = T43;
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:53:7: ( 'FS' )
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:53:7: 'FS'
            {
            match("FS"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T43

    // $ANTLR start T44
    public void mT44() throws RecognitionException {
        try {
            int _type = T44;
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:54:7: ( 'PS' )
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:54:7: 'PS'
            {
            match("PS"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T44

    // $ANTLR start T45
    public void mT45() throws RecognitionException {
        try {
            int _type = T45;
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:55:7: ( 'FD' )
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:55:7: 'FD'
            {
            match("FD"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T45

    // $ANTLR start T46
    public void mT46() throws RecognitionException {
        try {
            int _type = T46;
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:56:7: ( 'PD' )
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:56:7: 'PD'
            {
            match("PD"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T46

    // $ANTLR start T47
    public void mT47() throws RecognitionException {
        try {
            int _type = T47;
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:57:7: ( 'CF' )
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:57:7: 'CF'
            {
            match("CF"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T47

    // $ANTLR start T48
    public void mT48() throws RecognitionException {
        try {
            int _type = T48;
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:58:7: ( 'UN' )
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:58:7: 'UN'
            {
            match("UN"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T48

    // $ANTLR start T49
    public void mT49() throws RecognitionException {
        try {
            int _type = T49;
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:59:7: ( '.' )
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:59:7: '.'
            {
            match('.'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T49

    // $ANTLR start RULE_ID
    public void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:607:4: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:607:4: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:607:4: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:607:5: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:607:34: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ID

    // $ANTLR start RULE_STRING
    public void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:613:4: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\"' ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\\'' ) )* '\\'' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='\"') ) {
                alt5=1;
            }
            else if ( (LA5_0=='\'') ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("611:1: RULE_STRING : ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\"' ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\\'' ) )* '\\'' );", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:613:4: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\"' ) )* '\"'
                    {
                    match('\"'); 
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:613:8: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\"' ) )*
                    loop3:
                    do {
                        int alt3=3;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0=='\\') ) {
                            alt3=1;
                        }
                        else if ( ((LA3_0>='\u0000' && LA3_0<='!')||(LA3_0>='#' && LA3_0<='[')||(LA3_0>=']' && LA3_0<='\uFFFE')) ) {
                            alt3=2;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:613:10: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:613:54: ~ ( '\\\\' | '\"' )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:614:4: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\\'' ) )* '\\''
                    {
                    match('\''); 
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:614:9: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\\'' ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='&')||(LA4_0>='(' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFE')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:614:11: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:614:55: ~ ( '\\\\' | '\\'' )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_STRING

    // $ANTLR start RULE_INT
    public void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:620:4: ( ( '-' )? ( '0' .. '9' )+ )
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:620:4: ( '-' )? ( '0' .. '9' )+
            {
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:620:4: ( '-' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='-') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:620:5: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:620:10: ( '0' .. '9' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:620:11: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_INT

    // $ANTLR start RULE_WS
    public void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:626:4: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:626:4: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:626:4: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\t' && LA8_0<='\n')||LA8_0=='\r'||LA8_0==' ') ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);

            channel=HIDDEN;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_WS

    // $ANTLR start RULE_ML_COMMENT
    public void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:632:4: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:632:4: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:632:9: ( options {greedy=false; } : . )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='*') ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1=='/') ) {
                        alt9=2;
                    }
                    else if ( ((LA9_1>='\u0000' && LA9_1<='.')||(LA9_1>='0' && LA9_1<='\uFFFE')) ) {
                        alt9=1;
                    }


                }
                else if ( ((LA9_0>='\u0000' && LA9_0<=')')||(LA9_0>='+' && LA9_0<='\uFFFE')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:632:37: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            match("*/"); 

            channel=HIDDEN;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ML_COMMENT

    // $ANTLR start RULE_SL_COMMENT
    public void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:638:4: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:638:4: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
            {
            match("//"); 

            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:638:9: (~ ( '\\n' | '\\r' ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFE')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:638:9: ~ ( '\\n' | '\\r' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:638:23: ( '\\r' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:638:23: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            match('\n'); 
            channel=HIDDEN;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_SL_COMMENT

    public void mTokens() throws RecognitionException {
        // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:1:10: ( T10 | T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | RULE_ID | RULE_STRING | RULE_INT | RULE_WS | RULE_ML_COMMENT | RULE_SL_COMMENT )
        int alt12=46;
        switch ( input.LA(1) ) {
        case '<':
            {
            int LA12_1 = input.LA(2);

            if ( (LA12_1=='=') ) {
                alt12=7;
            }
            else {
                alt12=1;}
            }
            break;
        case '>':
            {
            alt12=2;
            }
            break;
        case ':':
            {
            alt12=3;
            }
            break;
        case '(':
            {
            alt12=4;
            }
            break;
        case '[':
            {
            alt12=5;
            }
            break;
        case ']':
            {
            alt12=6;
            }
            break;
        case '{':
            {
            alt12=8;
            }
            break;
        case '}':
            {
            alt12=9;
            }
            break;
        case '=':
            {
            int LA12_9 = input.LA(2);

            if ( (LA12_9=='>') ) {
                alt12=10;
            }
            else if ( (LA12_9=='=') ) {
                alt12=11;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens : ( T10 | T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | RULE_ID | RULE_STRING | RULE_INT | RULE_WS | RULE_ML_COMMENT | RULE_SL_COMMENT );", 12, 9, input);

                throw nvae;
            }
            }
            break;
        case 't':
            {
            int LA12_10 = input.LA(2);

            if ( (LA12_10=='r') ) {
                int LA12_40 = input.LA(3);

                if ( (LA12_40=='u') ) {
                    int LA12_66 = input.LA(4);

                    if ( (LA12_66=='e') ) {
                        int LA12_83 = input.LA(5);

                        if ( ((LA12_83>='0' && LA12_83<='9')||(LA12_83>='A' && LA12_83<='Z')||LA12_83=='_'||(LA12_83>='a' && LA12_83<='z')) ) {
                            alt12=41;
                        }
                        else {
                            alt12=12;}
                    }
                    else {
                        alt12=41;}
                }
                else {
                    alt12=41;}
            }
            else {
                alt12=41;}
            }
            break;
        case 'f':
            {
            int LA12_11 = input.LA(2);

            if ( (LA12_11=='a') ) {
                int LA12_41 = input.LA(3);

                if ( (LA12_41=='l') ) {
                    int LA12_67 = input.LA(4);

                    if ( (LA12_67=='s') ) {
                        int LA12_84 = input.LA(5);

                        if ( (LA12_84=='e') ) {
                            int LA12_94 = input.LA(6);

                            if ( ((LA12_94>='0' && LA12_94<='9')||(LA12_94>='A' && LA12_94<='Z')||LA12_94=='_'||(LA12_94>='a' && LA12_94<='z')) ) {
                                alt12=41;
                            }
                            else {
                                alt12=13;}
                        }
                        else {
                            alt12=41;}
                    }
                    else {
                        alt12=41;}
                }
                else {
                    alt12=41;}
            }
            else {
                alt12=41;}
            }
            break;
        case ',':
            {
            alt12=14;
            }
            break;
        case '+':
            {
            int LA12_13 = input.LA(2);

            if ( (LA12_13=='+') ) {
                alt12=19;
            }
            else {
                alt12=15;}
            }
            break;
        case 'H':
            {
            switch ( input.LA(2) ) {
            case 'E':
                {
                int LA12_44 = input.LA(3);

                if ( (LA12_44=='L') ) {
                    int LA12_68 = input.LA(4);

                    if ( (LA12_68=='P') ) {
                        int LA12_85 = input.LA(5);

                        if ( ((LA12_85>='0' && LA12_85<='9')||(LA12_85>='A' && LA12_85<='Z')||LA12_85=='_'||(LA12_85>='a' && LA12_85<='z')) ) {
                            alt12=41;
                        }
                        else {
                            alt12=16;}
                    }
                    else {
                        alt12=41;}
                }
                else {
                    alt12=41;}
                }
                break;
            case 'U':
                {
                int LA12_45 = input.LA(3);

                if ( (LA12_45=='R') ) {
                    int LA12_69 = input.LA(4);

                    if ( (LA12_69=='T') ) {
                        int LA12_86 = input.LA(5);

                        if ( ((LA12_86>='0' && LA12_86<='9')||(LA12_86>='A' && LA12_86<='Z')||LA12_86=='_'||(LA12_86>='a' && LA12_86<='z')) ) {
                            alt12=41;
                        }
                        else {
                            alt12=18;}
                    }
                    else {
                        alt12=41;}
                }
                else {
                    alt12=41;}
                }
                break;
            default:
                alt12=41;}

            }
            break;
        case '-':
            {
            switch ( input.LA(2) ) {
            case '-':
                {
                alt12=21;
                }
                break;
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
                {
                alt12=43;
                }
                break;
            default:
                alt12=17;}

            }
            break;
        case 'M':
            {
            int LA12_16 = input.LA(2);

            if ( (LA12_16=='A') ) {
                int LA12_48 = input.LA(3);

                if ( (LA12_48=='K') ) {
                    int LA12_70 = input.LA(4);

                    if ( (LA12_70=='E') ) {
                        int LA12_87 = input.LA(5);

                        if ( ((LA12_87>='0' && LA12_87<='9')||(LA12_87>='A' && LA12_87<='Z')||LA12_87=='_'||(LA12_87>='a' && LA12_87<='z')) ) {
                            alt12=41;
                        }
                        else {
                            alt12=20;}
                    }
                    else {
                        alt12=41;}
                }
                else {
                    alt12=41;}
            }
            else {
                alt12=41;}
            }
            break;
        case 'B':
            {
            int LA12_17 = input.LA(2);

            if ( (LA12_17=='R') ) {
                int LA12_49 = input.LA(3);

                if ( (LA12_49=='E') ) {
                    int LA12_71 = input.LA(4);

                    if ( (LA12_71=='A') ) {
                        int LA12_88 = input.LA(5);

                        if ( (LA12_88=='K') ) {
                            int LA12_98 = input.LA(6);

                            if ( ((LA12_98>='0' && LA12_98<='9')||(LA12_98>='A' && LA12_98<='Z')||LA12_98=='_'||(LA12_98>='a' && LA12_98<='z')) ) {
                                alt12=41;
                            }
                            else {
                                alt12=22;}
                        }
                        else {
                            alt12=41;}
                    }
                    else {
                        alt12=41;}
                }
                else {
                    alt12=41;}
            }
            else {
                alt12=41;}
            }
            break;
        case 'A':
            {
            int LA12_18 = input.LA(2);

            if ( (LA12_18=='N') ) {
                int LA12_50 = input.LA(3);

                if ( (LA12_50=='D') ) {
                    int LA12_72 = input.LA(4);

                    if ( ((LA12_72>='0' && LA12_72<='9')||(LA12_72>='A' && LA12_72<='Z')||LA12_72=='_'||(LA12_72>='a' && LA12_72<='z')) ) {
                        alt12=41;
                    }
                    else {
                        alt12=23;}
                }
                else {
                    alt12=41;}
            }
            else {
                alt12=41;}
            }
            break;
        case '&':
            {
            alt12=24;
            }
            break;
        case 'O':
            {
            int LA12_20 = input.LA(2);

            if ( (LA12_20=='R') ) {
                int LA12_51 = input.LA(3);

                if ( ((LA12_51>='0' && LA12_51<='9')||(LA12_51>='A' && LA12_51<='Z')||LA12_51=='_'||(LA12_51>='a' && LA12_51<='z')) ) {
                    alt12=41;
                }
                else {
                    alt12=25;}
            }
            else {
                alt12=41;}
            }
            break;
        case '|':
            {
            int LA12_21 = input.LA(2);

            if ( (LA12_21=='|') ) {
                alt12=30;
            }
            else {
                alt12=26;}
            }
            break;
        case 'S':
            {
            int LA12_22 = input.LA(2);

            if ( (LA12_22=='E') ) {
                int LA12_54 = input.LA(3);

                if ( (LA12_54=='Q') ) {
                    int LA12_74 = input.LA(4);

                    if ( ((LA12_74>='0' && LA12_74<='9')||(LA12_74>='A' && LA12_74<='Z')||LA12_74=='_'||(LA12_74>='a' && LA12_74<='z')) ) {
                        alt12=41;
                    }
                    else {
                        alt12=27;}
                }
                else {
                    alt12=41;}
            }
            else {
                alt12=41;}
            }
            break;
        case ';':
            {
            alt12=28;
            }
            break;
        case 'P':
            {
            switch ( input.LA(2) ) {
            case 'S':
                {
                int LA12_55 = input.LA(3);

                if ( ((LA12_55>='0' && LA12_55<='9')||(LA12_55>='A' && LA12_55<='Z')||LA12_55=='_'||(LA12_55>='a' && LA12_55<='z')) ) {
                    alt12=41;
                }
                else {
                    alt12=35;}
                }
                break;
            case 'A':
                {
                int LA12_56 = input.LA(3);

                if ( (LA12_56=='R') ) {
                    int LA12_76 = input.LA(4);

                    if ( ((LA12_76>='0' && LA12_76<='9')||(LA12_76>='A' && LA12_76<='Z')||LA12_76=='_'||(LA12_76>='a' && LA12_76<='z')) ) {
                        alt12=41;
                    }
                    else {
                        alt12=29;}
                }
                else {
                    alt12=41;}
                }
                break;
            case 'D':
                {
                int LA12_57 = input.LA(3);

                if ( ((LA12_57>='0' && LA12_57<='9')||(LA12_57>='A' && LA12_57<='Z')||LA12_57=='_'||(LA12_57>='a' && LA12_57<='z')) ) {
                    alt12=41;
                }
                else {
                    alt12=37;}
                }
                break;
            default:
                alt12=41;}

            }
            break;
        case 'X':
            {
            int LA12_25 = input.LA(2);

            if ( (LA12_25=='O') ) {
                int LA12_58 = input.LA(3);

                if ( (LA12_58=='R') ) {
                    int LA12_78 = input.LA(4);

                    if ( ((LA12_78>='0' && LA12_78<='9')||(LA12_78>='A' && LA12_78<='Z')||LA12_78=='_'||(LA12_78>='a' && LA12_78<='z')) ) {
                        alt12=41;
                    }
                    else {
                        alt12=31;}
                }
                else {
                    alt12=41;}
            }
            else {
                alt12=41;}
            }
            break;
        case '/':
            {
            switch ( input.LA(2) ) {
            case '*':
                {
                alt12=45;
                }
                break;
            case '/':
                {
                alt12=46;
                }
                break;
            default:
                alt12=32;}

            }
            break;
        case '~':
            {
            alt12=33;
            }
            break;
        case 'F':
            {
            switch ( input.LA(2) ) {
            case 'S':
                {
                int LA12_62 = input.LA(3);

                if ( ((LA12_62>='0' && LA12_62<='9')||(LA12_62>='A' && LA12_62<='Z')||LA12_62=='_'||(LA12_62>='a' && LA12_62<='z')) ) {
                    alt12=41;
                }
                else {
                    alt12=34;}
                }
                break;
            case 'D':
                {
                int LA12_63 = input.LA(3);

                if ( ((LA12_63>='0' && LA12_63<='9')||(LA12_63>='A' && LA12_63<='Z')||LA12_63=='_'||(LA12_63>='a' && LA12_63<='z')) ) {
                    alt12=41;
                }
                else {
                    alt12=36;}
                }
                break;
            default:
                alt12=41;}

            }
            break;
        case 'C':
            {
            int LA12_29 = input.LA(2);

            if ( (LA12_29=='F') ) {
                int LA12_64 = input.LA(3);

                if ( ((LA12_64>='0' && LA12_64<='9')||(LA12_64>='A' && LA12_64<='Z')||LA12_64=='_'||(LA12_64>='a' && LA12_64<='z')) ) {
                    alt12=41;
                }
                else {
                    alt12=38;}
            }
            else {
                alt12=41;}
            }
            break;
        case 'U':
            {
            int LA12_30 = input.LA(2);

            if ( (LA12_30=='N') ) {
                int LA12_65 = input.LA(3);

                if ( ((LA12_65>='0' && LA12_65<='9')||(LA12_65>='A' && LA12_65<='Z')||LA12_65=='_'||(LA12_65>='a' && LA12_65<='z')) ) {
                    alt12=41;
                }
                else {
                    alt12=39;}
            }
            else {
                alt12=41;}
            }
            break;
        case '.':
            {
            alt12=40;
            }
            break;
        case 'D':
        case 'E':
        case 'G':
        case 'I':
        case 'J':
        case 'K':
        case 'L':
        case 'N':
        case 'Q':
        case 'R':
        case 'T':
        case 'V':
        case 'W':
        case 'Y':
        case 'Z':
        case '^':
        case '_':
        case 'a':
        case 'b':
        case 'c':
        case 'd':
        case 'e':
        case 'g':
        case 'h':
        case 'i':
        case 'j':
        case 'k':
        case 'l':
        case 'm':
        case 'n':
        case 'o':
        case 'p':
        case 'q':
        case 'r':
        case 's':
        case 'u':
        case 'v':
        case 'w':
        case 'x':
        case 'y':
        case 'z':
            {
            alt12=41;
            }
            break;
        case '\"':
        case '\'':
            {
            alt12=42;
            }
            break;
        case '0':
        case '1':
        case '2':
        case '3':
        case '4':
        case '5':
        case '6':
        case '7':
        case '8':
        case '9':
            {
            alt12=43;
            }
            break;
        case '\t':
        case '\n':
        case '\r':
        case ' ':
            {
            alt12=44;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens : ( T10 | T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | RULE_ID | RULE_STRING | RULE_INT | RULE_WS | RULE_ML_COMMENT | RULE_SL_COMMENT );", 12, 0, input);

            throw nvae;
        }

        switch (alt12) {
            case 1 :
                // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:1:10: T10
                {
                mT10(); 

                }
                break;
            case 2 :
                // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:1:14: T11
                {
                mT11(); 

                }
                break;
            case 3 :
                // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:1:18: T12
                {
                mT12(); 

                }
                break;
            case 4 :
                // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:1:22: T13
                {
                mT13(); 

                }
                break;
            case 5 :
                // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:1:26: T14
                {
                mT14(); 

                }
                break;
            case 6 :
                // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:1:30: T15
                {
                mT15(); 

                }
                break;
            case 7 :
                // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:1:34: T16
                {
                mT16(); 

                }
                break;
            case 8 :
                // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:1:38: T17
                {
                mT17(); 

                }
                break;
            case 9 :
                // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:1:42: T18
                {
                mT18(); 

                }
                break;
            case 10 :
                // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:1:46: T19
                {
                mT19(); 

                }
                break;
            case 11 :
                // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:1:50: T20
                {
                mT20(); 

                }
                break;
            case 12 :
                // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:1:54: T21
                {
                mT21(); 

                }
                break;
            case 13 :
                // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:1:58: T22
                {
                mT22(); 

                }
                break;
            case 14 :
                // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:1:62: T23
                {
                mT23(); 

                }
                break;
            case 15 :
                // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:1:66: T24
                {
                mT24(); 

                }
                break;
            case 16 :
                // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:1:70: T25
                {
                mT25(); 

                }
                break;
            case 17 :
                // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:1:74: T26
                {
                mT26(); 

                }
                break;
            case 18 :
                // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:1:78: T27
                {
                mT27(); 

                }
                break;
            case 19 :
                // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:1:82: T28
                {
                mT28(); 

                }
                break;
            case 20 :
                // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:1:86: T29
                {
                mT29(); 

                }
                break;
            case 21 :
                // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:1:90: T30
                {
                mT30(); 

                }
                break;
            case 22 :
                // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:1:94: T31
                {
                mT31(); 

                }
                break;
            case 23 :
                // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:1:98: T32
                {
                mT32(); 

                }
                break;
            case 24 :
                // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:1:102: T33
                {
                mT33(); 

                }
                break;
            case 25 :
                // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:1:106: T34
                {
                mT34(); 

                }
                break;
            case 26 :
                // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:1:110: T35
                {
                mT35(); 

                }
                break;
            case 27 :
                // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:1:114: T36
                {
                mT36(); 

                }
                break;
            case 28 :
                // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:1:118: T37
                {
                mT37(); 

                }
                break;
            case 29 :
                // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:1:122: T38
                {
                mT38(); 

                }
                break;
            case 30 :
                // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:1:126: T39
                {
                mT39(); 

                }
                break;
            case 31 :
                // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:1:130: T40
                {
                mT40(); 

                }
                break;
            case 32 :
                // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:1:134: T41
                {
                mT41(); 

                }
                break;
            case 33 :
                // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:1:138: T42
                {
                mT42(); 

                }
                break;
            case 34 :
                // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:1:142: T43
                {
                mT43(); 

                }
                break;
            case 35 :
                // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:1:146: T44
                {
                mT44(); 

                }
                break;
            case 36 :
                // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:1:150: T45
                {
                mT45(); 

                }
                break;
            case 37 :
                // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:1:154: T46
                {
                mT46(); 

                }
                break;
            case 38 :
                // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:1:158: T47
                {
                mT47(); 

                }
                break;
            case 39 :
                // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:1:162: T48
                {
                mT48(); 

                }
                break;
            case 40 :
                // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:1:166: T49
                {
                mT49(); 

                }
                break;
            case 41 :
                // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:1:170: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 42 :
                // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:1:178: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 43 :
                // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:1:190: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 44 :
                // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:1:199: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 45 :
                // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:1:207: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 46 :
                // ..//q7.dsl/src-gen//q7/dsl/parser/q7dsl.g:1:223: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;

        }

    }


 

}