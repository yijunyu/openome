// Generated from C:\eclipse\workspace\fluid\code\fluid\java\operator\DivExpression.op.  Do *NOT* edit!
package fluid.java.operator;

import fluid.ir.*;
import fluid.tree.*;
import fluid.control.*;
import fluid.unparse.*;
import fluid.java.*;
import fluid.java.control.*;

import java.util.*;

import java.util.Vector;public class DivExpression extends DivRemExpression 
    implements DripOperator 
    { 
  protected DivExpression() {}

  public static final DivExpression prototype = new DivExpression();

  public Operator superOperator() {
    return DivRemExpression.prototype;
  }

  public boolean isProduction() {
    return true;
  }

  public Operator childOperator(int i) {
    switch (i) {
    case 0: return Expression.prototype;
    case 1: return Expression.prototype;
    default: return null;
    }
  }

  public int numChildren() {
    return 2;
  }

  public static JavaNode createNode(IRNode op1,
                                    IRNode op2) {
    return createNode(tree, op1, op2);
  }
  public static JavaNode createNode(SyntaxTreeInterface tree, IRNode op1,
                                    IRNode op2) {
    JavaNode _result = new JavaNode(tree, prototype, new IRNode[]{op1,op2});
    return _result;
  }

  public static IRNode getOp1(IRNode node) {
    Operator op = tree.getOperator(node);
    if (!(op instanceof DivExpression)) {
      throw new IllegalArgumentException("node not DivExpression: "+op);
    }
    return getOp1(tree, node);
  }

  public Expression getOp1() {
    return getOp1(tree);
  }

  public static IRNode getOp1(SyntaxTreeInterface tree, IRNode node) {
    Operator op = tree.getOperator(node);
    if (!(op instanceof DivExpression)) {
      throw new IllegalArgumentException("node not DivExpression: "+op);
    }
    return tree.getChild(node,0);
  }

  public Expression getOp1(SyntaxTreeInterface tree) {
    return (Expression)instantiate(tree.getChild(baseNode,0));
  }

  public static IRNode getOp2(IRNode node) {
    Operator op = tree.getOperator(node);
    if (!(op instanceof DivExpression)) {
      throw new IllegalArgumentException("node not DivExpression: "+op);
    }
    return getOp2(tree, node);
  }

  public Expression getOp2() {
    return getOp2(tree);
  }

  public static IRNode getOp2(SyntaxTreeInterface tree, IRNode node) {
    Operator op = tree.getOperator(node);
    if (!(op instanceof DivExpression)) {
      throw new IllegalArgumentException("node not DivExpression: "+op);
    }
    return tree.getChild(node,1);
  }

  public Expression getOp2(SyntaxTreeInterface tree) {
    return (Expression)instantiate(tree.getChild(baseNode,1));
  }

  private static Token littoken1 = new Delim("/");

  public void unparse(IRNode node, JavaUnparser unparser) {
SyntaxTreeInterface tree = unparser.getTree();
    Operator op = tree.getOperator(node);
    if (!(op instanceof DivExpression)) {
      throw new IllegalArgumentException("node not DivExpression: "+op);
    }
    unparser.unparse(tree.getChild(node,0));
    littoken1.emit(unparser,node);
    unparser.unparse(tree.getChild(node,1));
  }

  public boolean isMissingTokens(IRNode node)  {
    return true;
  }

  public Vector[] missingTokens(IRNode node) {
    SyntaxTreeInterface tree = JavaNode.tree;
    Operator op = tree.getOperator(node);
    if (!(op instanceof DivExpression)) {
      throw new IllegalArgumentException("node not DivExpression: "+op);
    }
    int numChildren = tree.numChildren(node);
    Vector[] TokenList = new Vector[numChildren+1];
    for (int j = 0; j < numChildren + 1; j++)
       TokenList[j] = new Vector();
    tree.getChild(node,0);
    TokenList[1].add(littoken1);
    tree.getChild(node,1);
    return TokenList;
  }

  public Token asToken() {
    return littoken1;
  }

}
