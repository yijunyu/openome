// Generated from C:\eclipse\workspace\fluid\code\fluid\java\operator\VoidType.op.  Do *NOT* edit!
package fluid.java.operator;

import fluid.ir.*;
import fluid.tree.*;
import fluid.control.*;
import fluid.unparse.*;
import fluid.java.*;
import fluid.java.control.*;

import java.util.*;

import java.util.Vector;public class VoidType extends JavaOperator implements ReturnTypeInterface, DripOperator { 
  protected VoidType() {}

  public static final VoidType prototype = new VoidType();

  public boolean isProduction() {
    return true;
  }

  public Operator childOperator(int i) {
    return null;
  }

  public int numChildren() {
    return 0;
  }

  private static Token littoken1 = new Keyword("void");

  public void unparse(IRNode node, JavaUnparser unparser) {
SyntaxTreeInterface tree = unparser.getTree();
    Operator op = tree.getOperator(node);
    if (!(op instanceof VoidType)) {
      throw new IllegalArgumentException("node not VoidType: "+op);
    }
    littoken1.emit(unparser,node);
  }

  public boolean isMissingTokens(IRNode node)  {
    return true;
  }

  public Vector[] missingTokens(IRNode node) {
    SyntaxTreeInterface tree = JavaNode.tree;
    Operator op = tree.getOperator(node);
    if (!(op instanceof VoidType)) {
      throw new IllegalArgumentException("node not VoidType: "+op);
    }
    int numChildren = tree.numChildren(node);
    Vector[] TokenList = new Vector[numChildren+1];
    for (int j = 0; j < numChildren + 1; j++)
       TokenList[j] = new Vector();
    TokenList[0].add(littoken1);
    return TokenList;
  }

  public Token asToken() {
    return littoken1;
  }

}