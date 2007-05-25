// Generated from C:\eclipse\workspace\fluid\code\fluid\java\operator\DefaultLabel.op.  Do *NOT* edit!
package fluid.java.operator;

import fluid.ir.*;
import fluid.tree.*;
import fluid.control.*;
import fluid.unparse.*;
import fluid.java.*;
import fluid.java.control.*;

import java.util.*;

import java.util.Vector;public class DefaultLabel extends SwitchLabel { 
  protected DefaultLabel() {}

  public static final DefaultLabel prototype = new DefaultLabel();

  public Operator superOperator() {
    return SwitchLabel.prototype;
  }

  public boolean isProduction() {
    return true;
  }

  public Operator childOperator(int i) {
    return null;
  }

  public int numChildren() {
    return 0;
  }

  private static Token littoken1 = new Keyword("default");
  private static Token littoken2 = new Delim(":");

  public void unparse(IRNode node, JavaUnparser unparser) {
SyntaxTreeInterface tree = unparser.getTree();
    Operator op = tree.getOperator(node);
    if (!(op instanceof DefaultLabel)) {
      throw new IllegalArgumentException("node not DefaultLabel: "+op);
    }
    littoken1.emit(unparser,node);
    unparser.getStyle().getNONE().emit(unparser,node);
    littoken2.emit(unparser,node);
  }

  public boolean isMissingTokens(IRNode node)  {
    return true;
  }

  public Vector[] missingTokens(IRNode node) {
    SyntaxTreeInterface tree = JavaNode.tree;
    Operator op = tree.getOperator(node);
    if (!(op instanceof DefaultLabel)) {
      throw new IllegalArgumentException("node not DefaultLabel: "+op);
    }
    int numChildren = tree.numChildren(node);
    Vector[] TokenList = new Vector[numChildren+1];
    for (int j = 0; j < numChildren + 1; j++)
       TokenList[j] = new Vector();
    TokenList[0].add(littoken1);
    TokenList[0].add(littoken2);
    return TokenList;
  }

  public Token asToken() {
    return littoken1;
  }

}
