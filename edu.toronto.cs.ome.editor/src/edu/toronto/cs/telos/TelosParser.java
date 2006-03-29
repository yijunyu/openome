/* Generated By:JavaCC: Do not edit this line. TelosParser.java */
package edu.toronto.cs.telos;
import java.util.Collection;
import java.util.Vector;
public class TelosParser implements TelosParserConstants {
  public static void main(String args[]) {
    TelosParser parser;
    if (args.length == 0) {
      System.out.println("Telos Parser Version 0.1:  Reading from standard input . . .");
      parser = new TelosParser(System.in);
    } else if (args.length == 1) {
      System.out.println("Telos Parser Version 0.1:  Reading from file " + args[0] + " . . .");
      try {
        parser = new TelosParser(new java.io.FileInputStream(args[0]));
      } catch (java.io.FileNotFoundException e) {
        System.out.println("Telos Parser Version 0.1:  File " + args[0] + " not found.");
        return;
      }
    } else {
      System.out.println("Telos Parser Version 0.1:  Usage is one of:");
      System.out.println("         java TelosParser < inputfile");
      System.out.println("OR");
      System.out.println("         java TelosParser inputfile");
      return;
    }
    try {
      java.util.ArrayList a = parser.Tokens();
      System.out.println("Telos Parser Version 0.1:  Telos program parsed successfully.");
    } catch (ParseException e) {
      System.out.println("Telos Parser Version 0.1:  Encountered errors during parse.");
      e.printStackTrace();
    }
  }

/*****************************************
 * THE TELOS LANGUAGE GRAMMAR STARTS HERE *
 *****************************************/

/*
 * Program structuring syntax follows.
 */
  static final public java.util.ArrayList Tokens() throws ParseException {
  TelosParserIndividual t;
  java.util.ArrayList a = new java.util.ArrayList();
    label_1:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case ID:
        ;
        break;
      default:
        jj_la1[0] = jj_gen;
        break label_1;
      }
      t = TelosToken();
                       a.add(t);
    }
    jj_consume_token(0);
   {if (true) return a;}
    throw new Error("Missing return statement in function");
  }

  static final public TelosParserIndividual TelosToken() throws ParseException {
        Token cls = null;
        Token id = null;
        java.util.ArrayList types = null;
        java.util.ArrayList parents = null;
        java.util.HashMap attributes = null;
    cls = jj_consume_token(ID);
    id = jj_consume_token(ID);
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case IN:
      jj_consume_token(IN);
      types = TypeList();
      break;
    default:
      jj_la1[1] = jj_gen;
      ;
    }
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case ISA:
      jj_consume_token(ISA);
      parents = ParentList();
      break;
    default:
      jj_la1[2] = jj_gen;
      ;
    }
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case WITH:
      jj_consume_token(WITH);
      attributes = AttributeList();
      break;
    default:
      jj_la1[3] = jj_gen;
      ;
    }
    jj_consume_token(END);
    {if (true) return new TelosParserIndividual(cls.toString(), id.toString(), types, parents, attributes);}
    throw new Error("Missing return statement in function");
  }

  static final public java.util.ArrayList TypeList() throws ParseException {
        Token id;
        java.util.ArrayList a = new java.util.ArrayList();
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case COMMA:
      jj_consume_token(COMMA);
      break;
    default:
      jj_la1[4] = jj_gen;
      ;
    }
    id = jj_consume_token(ID);
                            a.add(id.toString());
    label_2:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case COMMA:
        ;
        break;
      default:
        jj_la1[5] = jj_gen;
        break label_2;
      }
      jj_consume_token(COMMA);
      id = jj_consume_token(ID);
                           a.add(id.toString());
    }
          {if (true) return a;}
    throw new Error("Missing return statement in function");
  }

  static final public java.util.ArrayList ParentList() throws ParseException {
        Token id;
        java.util.ArrayList a = new java.util.ArrayList();
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case COMMA:
      jj_consume_token(COMMA);
      break;
    default:
      jj_la1[6] = jj_gen;
      ;
    }
    id = jj_consume_token(ID);
                            a.add(id.toString());
    label_3:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case COMMA:
        ;
        break;
      default:
        jj_la1[7] = jj_gen;
        break label_3;
      }
      jj_consume_token(COMMA);
      id = jj_consume_token(ID);
                           a.add(id.toString());
    }
          {if (true) return a;}
    throw new Error("Missing return statement in function");
  }

  static final public java.util.HashMap AttributeList() throws ParseException {
        java.util.HashMap a = new java.util.HashMap();
        java.util.ArrayList ids;
        Object value;
    label_4:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case ID:
      case COMMA:
      case COLON:
        ;
        break;
      default:
        jj_la1[8] = jj_gen;
        break label_4;
      }
      ids = IdList();
      jj_consume_token(COLON);
      value = Literal();
                        Collection c = (Collection) a.get(ids);
                        if (c!=null) {
                           // String suffix = "-" + a.size();				
                           // ids.set(ids.size()-1, ((String) ids.get(ids.size()-1)) + suffix);
                           c.add(value);
                        } else {
                           c = new Vector();
                           c.add(value);
                           a.put(ids, c);
                        }
    }
                {if (true) return a;}
    throw new Error("Missing return statement in function");
  }

  static final public java.util.ArrayList IdList() throws ParseException {
        Token id;
        java.util.ArrayList a = new java.util.ArrayList();
    label_5:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case ID:
      case COMMA:
        ;
        break;
      default:
        jj_la1[9] = jj_gen;
        break label_5;
      }
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case COMMA:
        jj_consume_token(COMMA);
        break;
      default:
        jj_la1[10] = jj_gen;
        ;
      }
      id = jj_consume_token(ID);
                             a.add(id.toString());
    }
          {if (true) return a;}
    throw new Error("Missing return statement in function");
  }

  static final public Object Literal() throws ParseException {
  Token v;
  Object l;
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case INTEGER_LITERAL:
      v = jj_consume_token(INTEGER_LITERAL);
                               l = new Integer(Integer.parseInt(v.toString()));
      break;
    case STRING_LITERAL:
      v = jj_consume_token(STRING_LITERAL);
                              l = v.toString();
      break;
    case FLOATING_POINT_LITERAL:
      v = jj_consume_token(FLOATING_POINT_LITERAL);
                                      l = new Float(Float.parseFloat(v.toString()));
      break;
    case ID:
      v = jj_consume_token(ID);
                  l = new String(v.toString());
      break;
    default:
      jj_la1[11] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
          {if (true) return l;}
    throw new Error("Missing return statement in function");
  }

  static private boolean jj_initialized_once = false;
  static public TelosParserTokenManager token_source;
  static JavaCharStream jj_input_stream;
  static public Token token, jj_nt;
  static private int jj_ntk;
  static private int jj_gen;
  static final private int[] jj_la1 = new int[12];
  static private int[] jj_la1_0;
  static {
      jj_la1_0();
   }
   private static void jj_la1_0() {
      jj_la1_0 = new int[] {0x200000,0x200,0x400,0x800,0x1000000,0x1000000,0x1000000,0x1000000,0x3200000,0x1200000,0x1000000,0x322000,};
   }

  public TelosParser(java.io.InputStream stream) {
     this(stream, null);
  }
  public TelosParser(java.io.InputStream stream, String encoding) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser.  You must");
      System.out.println("       either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    try { jj_input_stream = new JavaCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new TelosParserTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 12; i++) jj_la1[i] = -1;
  }

  static public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  static public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 12; i++) jj_la1[i] = -1;
  }

  public TelosParser(java.io.Reader stream) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser.  You must");
      System.out.println("       either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    jj_input_stream = new JavaCharStream(stream, 1, 1);
    token_source = new TelosParserTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 12; i++) jj_la1[i] = -1;
  }

  static public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 12; i++) jj_la1[i] = -1;
  }

  public TelosParser(TelosParserTokenManager tm) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser.  You must");
      System.out.println("       either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 12; i++) jj_la1[i] = -1;
  }

  public void ReInit(TelosParserTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 12; i++) jj_la1[i] = -1;
  }

  static final private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }

  static final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

  static final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  static final private int jj_ntk() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  static private java.util.Vector jj_expentries = new java.util.Vector();
  static private int[] jj_expentry;
  static private int jj_kind = -1;

  static public ParseException generateParseException() {
    jj_expentries.removeAllElements();
    boolean[] la1tokens = new boolean[26];
    for (int i = 0; i < 26; i++) {
      la1tokens[i] = false;
    }
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 12; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 26; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.addElement(jj_expentry);
      }
    }
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = (int[])jj_expentries.elementAt(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  static final public void enable_tracing() {
  }

  static final public void disable_tracing() {
  }

}
