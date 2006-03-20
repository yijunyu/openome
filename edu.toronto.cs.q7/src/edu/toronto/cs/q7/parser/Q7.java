/* Generated By:JavaCC: Do not edit this line. Q7.java */
package edu.toronto.cs.q7.parser;
import edu.toronto.cs.q7.model.Advice;
import edu.toronto.cs.q7.model.Effect;
import edu.toronto.cs.q7.model.How;
import edu.toronto.cs.q7.model.Pointcut;
import edu.toronto.cs.q7.model.Entity;
import java.util.Hashtable;

public class Q7 implements Q7Constants {
  static Q7 parser;
  static String comment;
  static void initialize_parser(java.io.InputStream in) {
      if (parser == null)
              parser = new Q7(in);
          else
                  Q7.ReInit(in);
  }
  public static java.util.ArrayList a = null;
  public static void main(String args[]) {
        if (args.length!=2) {
      System.out.println("Q7 Parser Version 0.1:  please provide two arguments: inputfile and outputfile.");
        }
      try {
            initialize_parser(new java.io.FileInputStream(args[0]));
      } catch (java.io.FileNotFoundException e) {
        // System.out.println("Q7 Parser Version 0.1:  File " + args[0] + " not found.");
        return;
      }
    a = null;
    try {
      Entity.aliases = new Hashtable();
          a = Q7.Advices();
    } catch (ParseException e) {
      System.out.println("Q7 Parser Version 0.1:  Encountered errors during parse.");
      e.printStackTrace();
    }
  }

/*****************************************
 * THE TELOS LANGUAGE GRAMMAR STARTS HERE *
 *****************************************/

/*
 * Program structuring syntax follows.
 */
  static final public java.util.ArrayList Advices() throws ParseException {
  Advice t;
  java.util.ArrayList a = new java.util.ArrayList();
    label_1:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case STRING_LITERAL:
      case LEFT_BR:
      case LEFT_PAR:
      case ID:
        ;
        break;
      default:
        jj_la1[0] = jj_gen;
        break label_1;
      }
      t = Advice();
                   a.add(t);
    }
   {if (true) return a;}
    throw new Error("Missing return statement in function");
  }

  static final public Advice Advice() throws ParseException {
    String op = null;
        String when = null;
        String who = null;
        String why = null;
        String what = null;
        String alias = null;
        java.util.ArrayList where = null;
        How how = null;
        java.util.ArrayList how_much = null;
        String label = null;
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case LEFT_PAR:
      jj_consume_token(LEFT_PAR);
      op = Op();
      when = When();
      jj_consume_token(RIGHT_PAR);
      jj_consume_token(IMPLIES);
      break;
    default:
      jj_la1[1] = jj_gen;
      ;
    }
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case STRING_LITERAL:
    case LEFT_BR:
    case ID:
      if (jj_2_1(3)) {
        jj_consume_token(LEFT_BR);
        who = Who();
        jj_consume_token(RIGHT_BR);
        jj_consume_token(SCOPE);
      } else {
        ;
      }
      why = Why();
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case LEFT_BRACKET:
        jj_consume_token(LEFT_BRACKET);
        what = What();
        jj_consume_token(RIGHT_BRACKET);
        break;
      default:
        jj_la1[2] = jj_gen;
        ;
      }
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case AS:
      case ALIAS:
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case ALIAS:
          jj_consume_token(ALIAS);
          break;
        case AS:
          jj_consume_token(AS);
          break;
        default:
          jj_la1[3] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        alias = Alias();
        break;
      default:
        jj_la1[4] = jj_gen;
        ;
      }
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case WEAVES:
        jj_consume_token(WEAVES);
        where = Where();
        break;
      default:
        jj_la1[5] = jj_gen;
        ;
      }
      break;
    default:
      jj_la1[6] = jj_gen;
      if (jj_2_2(3)) {
        jj_consume_token(LEFT_BR);
        who = Who();
        jj_consume_token(RIGHT_BR);
      } else {
        jj_consume_token(-1);
        throw new ParseException();
      }
    }
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case LEFT_BRACE:
      jj_consume_token(LEFT_BRACE);
      how = How();
      jj_consume_token(RIGHT_BRACE);
      break;
    default:
      jj_la1[7] = jj_gen;
      ;
    }
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case AT:
      jj_consume_token(AT);
      label = Label();
      jj_consume_token(AT);
      break;
    default:
      jj_la1[8] = jj_gen;
      ;
    }
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case IMPLIES:
    case DEPENDS:
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case IMPLIES:
        jj_consume_token(IMPLIES);
        how_much = HowMuch();
        break;
      case DEPENDS:
        jj_consume_token(DEPENDS);
        how_much = Agents();
        break;
      default:
        jj_la1[9] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      break;
    default:
      jj_la1[10] = jj_gen;
      ;
    }
        Advice a = new Advice(op!=null? op + ":" + when: when, who, why, what, alias, where, how, how_much, ""+Q7.comment, label);
        Q7.comment = null;
        {if (true) return a;}
    throw new Error("Missing return statement in function");
  }

  static final public String When() throws ParseException {
  Token  condition = null;
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case ID:
      condition = jj_consume_token(ID);
      break;
    case STRING_LITERAL:
      condition = jj_consume_token(STRING_LITERAL);
      break;
    case TRUE:
      condition = jj_consume_token(TRUE);
      break;
    case FALSE:
      condition = jj_consume_token(FALSE);
      break;
    default:
      jj_la1[11] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    {if (true) return condition.toString();}
    throw new Error("Missing return statement in function");
  }

  static final public String Who() throws ParseException {
  Token  agent = null;
  String who = null;
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case ID:
      agent = jj_consume_token(ID);
      break;
    case STRING_LITERAL:
      agent = jj_consume_token(STRING_LITERAL);
      break;
    default:
      jj_la1[12] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case STRING_LITERAL:
    case ID:
      who = Who();
      break;
    default:
      jj_la1[13] = jj_gen;
      ;
    }
    {if (true) return  agent.toString() + (who!=null? who: "");}
    throw new Error("Missing return statement in function");
  }

  static final public String Why() throws ParseException {
  Token  goal = null;
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case ID:
      goal = jj_consume_token(ID);
      break;
    case STRING_LITERAL:
      goal = jj_consume_token(STRING_LITERAL);
      break;
    default:
      jj_la1[14] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    {if (true) return goal.toString();}
    throw new Error("Missing return statement in function");
  }

  static final public String Alias() throws ParseException {
  Token  alias = null;
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case ID:
      alias = jj_consume_token(ID);
      break;
    case STRING_LITERAL:
      alias = jj_consume_token(STRING_LITERAL);
      break;
    default:
      jj_la1[15] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    {if (true) return alias.toString();}
    throw new Error("Missing return statement in function");
  }

  static final public String Label() throws ParseException {
  Token label = null;
  String l = null;
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case LABEL_FS:
      label = jj_consume_token(LABEL_FS);
      break;
    case LABEL_PS:
      label = jj_consume_token(LABEL_PS);
      break;
    case LABEL_PD:
      label = jj_consume_token(LABEL_PD);
      break;
    case LABEL_FD:
      label = jj_consume_token(LABEL_FD);
      break;
    case LABEL_CF:
      label = jj_consume_token(LABEL_CF);
      break;
    case LABEL_UN:
      label = jj_consume_token(LABEL_UN);
      break;
    case INTEGER_LITERAL:
    case NON_NEGATIVE_FLOATING_POINT_LITERAL:
      l = LabelList();
      break;
    default:
      jj_la1[16] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    {if (true) return (label==null && l!=null) ? l: label.toString();}
    throw new Error("Missing return statement in function");
  }

  static final public String LabelList() throws ParseException {
  String r = null;
  Token l1 = null;
  String l2 = null;
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case NON_NEGATIVE_FLOATING_POINT_LITERAL:
      l1 = jj_consume_token(NON_NEGATIVE_FLOATING_POINT_LITERAL);
      break;
    case INTEGER_LITERAL:
      l1 = jj_consume_token(INTEGER_LITERAL);
      break;
    default:
      jj_la1[17] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    if (l1==null) {if (true) return null;}
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case COMMA:
      jj_consume_token(COMMA);
      l2 = LabelList();
      break;
    default:
      jj_la1[18] = jj_gen;
      ;
    }
     if (l2==null) {if (true) return l1.toString();}
     {if (true) return l1.toString() + ", " + l2;}
    throw new Error("Missing return statement in function");
  }

  static final public String What() throws ParseException {
  Token topic = null;
  String what = null;
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case ID:
      topic = jj_consume_token(ID);
      break;
    case STRING_LITERAL:
      topic = jj_consume_token(STRING_LITERAL);
      break;
    default:
      jj_la1[19] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case COMMA:
      jj_consume_token(COMMA);
      what = What();
      break;
    default:
      jj_la1[20] = jj_gen;
      ;
    }
    if (what == null)
            {if (true) return topic.toString();}
        {if (true) return topic.toString().trim() + "," + what;}
    throw new Error("Missing return statement in function");
  }

  static final public java.util.ArrayList Where() throws ParseException {
  java.util.ArrayList where = null;
  java.util.ArrayList pointcuts;
  Pointcut pointcut = null;
    pointcut = Pointcut();
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case COMMA:
      jj_consume_token(COMMA);
      where = Where();
      break;
    default:
      jj_la1[21] = jj_gen;
      ;
    }
        if (where == null)
                pointcuts = new java.util.ArrayList();
        else
                pointcuts = where;
        pointcuts.add(pointcut);
        {if (true) return pointcuts;}
    throw new Error("Missing return statement in function");
  }

  static final public java.util.ArrayList HowMuch() throws ParseException {
  java.util.ArrayList effects;
  java.util.ArrayList howmuch = null;
  Effect effect = null;
    effect = Effect();
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case COMMA:
      jj_consume_token(COMMA);
      howmuch = HowMuch();
      break;
    default:
      jj_la1[22] = jj_gen;
      ;
    }
    if (howmuch==null)
        effects = new java.util.ArrayList();
    else
            effects = howmuch;
    effects.add(effect);
    {if (true) return effects;}
    throw new Error("Missing return statement in function");
  }

  static final public java.util.ArrayList Agents() throws ParseException {
  java.util.ArrayList effects;
  java.util.ArrayList howmuch = null;
  Effect effect = null;
    effect = DepEffect();
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case COMMA:
      jj_consume_token(COMMA);
      howmuch = Agents();
      break;
    default:
      jj_la1[23] = jj_gen;
      ;
    }
    if (howmuch==null)
        effects = new java.util.ArrayList();
    else
            effects = howmuch;
    effects.add(effect);
    {if (true) return effects;}
    throw new Error("Missing return statement in function");
  }

  static final public String Op() throws ParseException {
        Token op = null;
        Token degree = null;
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case HELP:
      op = jj_consume_token(HELP);
      break;
    case HURT:
      op = jj_consume_token(HURT);
      break;
    case BREAK:
      op = jj_consume_token(BREAK);
      break;
    case MAKE:
      op = jj_consume_token(MAKE);
      break;
    case DEP:
      op = jj_consume_token(DEP);
      break;
    default:
      jj_la1[24] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case INTEGER_LITERAL:
    case NON_NEGATIVE_FLOATING_POINT_LITERAL:
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case NON_NEGATIVE_FLOATING_POINT_LITERAL:
        degree = jj_consume_token(NON_NEGATIVE_FLOATING_POINT_LITERAL);
        break;
      case INTEGER_LITERAL:
        degree = jj_consume_token(INTEGER_LITERAL);
        break;
      default:
        jj_la1[25] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      break;
    default:
      jj_la1[26] = jj_gen;
      ;
    }
                {if (true) return op.toString() + (degree!=null? " " + degree.toString():"");}
    throw new Error("Missing return statement in function");
  }

  static final public Effect Effect() throws ParseException {
  String op = null;
  String who = null;
  String why = null;
  String what = null;
  String alias = null;
    op = Op();
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case LEFT_BR:
      jj_consume_token(LEFT_BR);
      who = Who();
      jj_consume_token(RIGHT_BR);
      jj_consume_token(SCOPE);
      break;
    default:
      jj_la1[27] = jj_gen;
      ;
    }
    why = Why();
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case LEFT_BRACKET:
      jj_consume_token(LEFT_BRACKET);
      what = What();
      jj_consume_token(RIGHT_BRACKET);
      break;
    default:
      jj_la1[28] = jj_gen;
      ;
    }
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case AS:
    case ALIAS:
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case ALIAS:
        jj_consume_token(ALIAS);
        break;
      case AS:
        jj_consume_token(AS);
        break;
      default:
        jj_la1[29] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      alias = Alias();
      break;
    default:
      jj_la1[30] = jj_gen;
      ;
    }
    {if (true) return new Effect(op == null? "~": op, who, why, what, alias);}
    throw new Error("Missing return statement in function");
  }

  static final public Effect DepEffect() throws ParseException {
  String who = null;
    jj_consume_token(LEFT_BR);
    who = Who();
    jj_consume_token(RIGHT_BR);
    {if (true) return new Effect("~", who, null, null, null);}
    throw new Error("Missing return statement in function");
  }

/* currently, Pointcut are the same as Effect,
   except that the string can be replaced by
   wildcards */
  static final public Pointcut Pointcut() throws ParseException {
  String op1 = null;
  Token op = null;
  String who = null;
  String why = null;
  String what = null;
  String alias = null;
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case MAKE:
    case HELP:
    case HURT:
    case BREAK:
    case DEP:
      op1 = Op();
      break;
    case AND:
      op = jj_consume_token(AND);
      break;
    case OR:
      op = jj_consume_token(OR);
      break;
    case ANDSYMB:
      op = jj_consume_token(ANDSYMB);
      break;
    case ORSYMB:
      op = jj_consume_token(ORSYMB);
      break;
    default:
      jj_la1[31] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case LEFT_BR:
      jj_consume_token(LEFT_BR);
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case STAR:
        jj_consume_token(STAR);
        break;
      case STRING_LITERAL:
      case ID:
        who = Who();
        break;
      default:
        jj_la1[32] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      jj_consume_token(RIGHT_BR);
      jj_consume_token(SCOPE);
      break;
    default:
      jj_la1[33] = jj_gen;
      ;
    }
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case STAR:
      jj_consume_token(STAR);
      break;
    case STRING_LITERAL:
    case ID:
      why = Why();
      break;
    default:
      jj_la1[34] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case LEFT_BRACKET:
      jj_consume_token(LEFT_BRACKET);
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case STAR:
        jj_consume_token(STAR);
        break;
      case STRING_LITERAL:
      case ID:
        what = What();
        break;
      default:
        jj_la1[35] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      jj_consume_token(RIGHT_BRACKET);
      break;
    default:
      jj_la1[36] = jj_gen;
      ;
    }
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case AS:
    case ALIAS:
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case ALIAS:
        jj_consume_token(ALIAS);
        break;
      case AS:
        jj_consume_token(AS);
        break;
      default:
        jj_la1[37] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      alias = Alias();
      break;
    default:
      jj_la1[38] = jj_gen;
      ;
    }
    {if (true) return new Pointcut(op1==null?"~":
                                        (op!=null?(op.toString().equals("AND")?"&":
                                                           (op.toString().equals("OR") ? "|":op1)):
                                          op1),
                who==null? "*": who.toString(),
                why==null? "*" : why.toString(),
                what==null?"*":what.toString(),
                alias==null?"*":alias.toString());}
    throw new Error("Missing return statement in function");
  }

  static final public How How() throws ParseException {
  Token rule = null;
  Token enrich = null;
  java.util.ArrayList advices = null;
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case AND:
      rule = jj_consume_token(AND);
      break;
    case OR:
      rule = jj_consume_token(OR);
      break;
    case ANDSYMB:
      rule = jj_consume_token(ANDSYMB);
      break;
    case ORSYMB:
      rule = jj_consume_token(ORSYMB);
      break;
    default:
      jj_la1[39] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case ORSYMB:
    case SEMICOLON:
    case PARALLEL:
    case SLASH:
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case SEMICOLON:
        enrich = jj_consume_token(SEMICOLON);
        break;
      case PARALLEL:
        enrich = jj_consume_token(PARALLEL);
        break;
      case ORSYMB:
        enrich = jj_consume_token(ORSYMB);
        break;
      case SLASH:
        enrich = jj_consume_token(SLASH);
        break;
      default:
        jj_la1[40] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      break;
    default:
      jj_la1[41] = jj_gen;
      ;
    }
    advices = Advices();
    {if (true) return new How(rule.toString().equals("AND")?"&":
                                (rule.toString().equals("OR")?"|":
                                 rule.toString())
            , enrich==null? null: enrich.toString(),  advices);}
    throw new Error("Missing return statement in function");
  }

  static final private boolean jj_2_1(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_1(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(0, xla); }
  }

  static final private boolean jj_2_2(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_2(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(1, xla); }
  }

  static final private boolean jj_3R_3() {
    if (jj_3R_2()) return true;
    return false;
  }

  static final private boolean jj_3R_2() {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_scan_token(59)) {
    jj_scanpos = xsp;
    if (jj_scan_token(23)) return true;
    }
    xsp = jj_scanpos;
    if (jj_3R_3()) jj_scanpos = xsp;
    return false;
  }

  static final private boolean jj_3_2() {
    if (jj_scan_token(LEFT_BR)) return true;
    if (jj_3R_2()) return true;
    if (jj_scan_token(RIGHT_BR)) return true;
    return false;
  }

  static final private boolean jj_3_1() {
    if (jj_scan_token(LEFT_BR)) return true;
    if (jj_3R_2()) return true;
    if (jj_scan_token(RIGHT_BR)) return true;
    return false;
  }

  static private boolean jj_initialized_once = false;
  static public Q7TokenManager token_source;
  static JavaCharStream jj_input_stream;
  static public Token token, jj_nt;
  static private int jj_ntk;
  static private Token jj_scanpos, jj_lastpos;
  static private int jj_la;
  static public boolean lookingAhead = false;
  static private boolean jj_semLA;
  static private int jj_gen;
  static final private int[] jj_la1 = new int[42];
  static private int[] jj_la1_0;
  static private int[] jj_la1_1;
  static {
      jj_la1_0();
      jj_la1_1();
   }
   private static void jj_la1_0() {
      jj_la1_0 = new int[] {0x44800000,0x40000000,0x1000000,0x0,0x0,0x0,0x4800000,0x10000000,0x0,0x0,0x0,0x806000,0x800000,0x800000,0x800000,0x800000,0x88000,0x88000,0x0,0x800000,0x0,0x0,0x0,0x0,0x0,0x88000,0x88000,0x4000000,0x1000000,0x0,0x0,0x0,0x800000,0x4000000,0x800000,0x800000,0x1000000,0x0,0x0,0x0,0x0,0x0,};
   }
   private static void jj_la1_1() {
      jj_la1_1 = new int[] {0x8000000,0x0,0x0,0x180000,0x180000,0x1,0x8000000,0x0,0x2,0xc,0xc,0x8000000,0x8000000,0x8000000,0x8000000,0x8000000,0x7e00000,0x0,0x2000,0x8000000,0x2000,0x2000,0x2000,0x2000,0x400f0,0x0,0x0,0x0,0x0,0x180000,0x180000,0x40ff0,0x8010000,0x0,0x8010000,0x8010000,0x0,0x180000,0x180000,0xf00,0x2c800,0x2c800,};
   }
  static final private JJCalls[] jj_2_rtns = new JJCalls[2];
  static private boolean jj_rescan = false;
  static private int jj_gc = 0;

  public Q7(java.io.InputStream stream) {
     this(stream, null);
  }
  public Q7(java.io.InputStream stream, String encoding) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser.  You must");
      System.out.println("       either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    try { jj_input_stream = new JavaCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new Q7TokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 42; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
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
    for (int i = 0; i < 42; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  public Q7(java.io.Reader stream) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser.  You must");
      System.out.println("       either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    jj_input_stream = new JavaCharStream(stream, 1, 1);
    token_source = new Q7TokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 42; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  static public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 42; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  public Q7(Q7TokenManager tm) {
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
    for (int i = 0; i < 42; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  public void ReInit(Q7TokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 42; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  static final private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      if (++jj_gc > 100) {
        jj_gc = 0;
        for (int i = 0; i < jj_2_rtns.length; i++) {
          JJCalls c = jj_2_rtns[i];
          while (c != null) {
            if (c.gen < jj_gen) c.first = null;
            c = c.next;
          }
        }
      }
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }

  static private final class LookaheadSuccess extends java.lang.Error { }
  static final private LookaheadSuccess jj_ls = new LookaheadSuccess();
  static final private boolean jj_scan_token(int kind) {
    if (jj_scanpos == jj_lastpos) {
      jj_la--;
      if (jj_scanpos.next == null) {
        jj_lastpos = jj_scanpos = jj_scanpos.next = token_source.getNextToken();
      } else {
        jj_lastpos = jj_scanpos = jj_scanpos.next;
      }
    } else {
      jj_scanpos = jj_scanpos.next;
    }
    if (jj_rescan) {
      int i = 0; Token tok = token;
      while (tok != null && tok != jj_scanpos) { i++; tok = tok.next; }
      if (tok != null) jj_add_error_token(kind, i);
    }
    if (jj_scanpos.kind != kind) return true;
    if (jj_la == 0 && jj_scanpos == jj_lastpos) throw jj_ls;
    return false;
  }

  static final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

  static final public Token getToken(int index) {
    Token t = lookingAhead ? jj_scanpos : token;
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
  static private int[] jj_lasttokens = new int[100];
  static private int jj_endpos;

  static private void jj_add_error_token(int kind, int pos) {
    if (pos >= 100) return;
    if (pos == jj_endpos + 1) {
      jj_lasttokens[jj_endpos++] = kind;
    } else if (jj_endpos != 0) {
      jj_expentry = new int[jj_endpos];
      for (int i = 0; i < jj_endpos; i++) {
        jj_expentry[i] = jj_lasttokens[i];
      }
      boolean exists = false;
      for (java.util.Enumeration e = jj_expentries.elements(); e.hasMoreElements();) {
        int[] oldentry = (int[])(e.nextElement());
        if (oldentry.length == jj_expentry.length) {
          exists = true;
          for (int i = 0; i < jj_expentry.length; i++) {
            if (oldentry[i] != jj_expentry[i]) {
              exists = false;
              break;
            }
          }
          if (exists) break;
        }
      }
      if (!exists) jj_expentries.addElement(jj_expentry);
      if (pos != 0) jj_lasttokens[(jj_endpos = pos) - 1] = kind;
    }
  }

  static public ParseException generateParseException() {
    jj_expentries.removeAllElements();
    boolean[] la1tokens = new boolean[62];
    for (int i = 0; i < 62; i++) {
      la1tokens[i] = false;
    }
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 42; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
          if ((jj_la1_1[i] & (1<<j)) != 0) {
            la1tokens[32+j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 62; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.addElement(jj_expentry);
      }
    }
    jj_endpos = 0;
    jj_rescan_token();
    jj_add_error_token(0, 0);
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

  static final private void jj_rescan_token() {
    jj_rescan = true;
    for (int i = 0; i < 2; i++) {
    try {
      JJCalls p = jj_2_rtns[i];
      do {
        if (p.gen > jj_gen) {
          jj_la = p.arg; jj_lastpos = jj_scanpos = p.first;
          switch (i) {
            case 0: jj_3_1(); break;
            case 1: jj_3_2(); break;
          }
        }
        p = p.next;
      } while (p != null);
      } catch(LookaheadSuccess ls) { }
    }
    jj_rescan = false;
  }

  static final private void jj_save(int index, int xla) {
    JJCalls p = jj_2_rtns[index];
    while (p.gen > jj_gen) {
      if (p.next == null) { p = p.next = new JJCalls(); break; }
      p = p.next;
    }
    p.gen = jj_gen + xla - jj_la; p.first = token; p.arg = xla;
  }

  static final class JJCalls {
    int gen;
    Token first;
    int arg;
    JJCalls next;
  }

}
