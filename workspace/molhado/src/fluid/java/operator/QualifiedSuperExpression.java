// Generated from C:\eclipse\workspace\fluid\code\fluid\java\operator\QualifiedSuperExpression.op.  Do *NOT* edit!
package fluid.java.operator;

import fluid.ir.*;
import fluid.tree.*;
import fluid.control.*;
import fluid.unparse.*;
import fluid.java.*;
import fluid.java.control.*;

import java.util.*;

import java.util.Vector;public class QualifiedSuperExpression extends ConstructionObject 
    { 
  protected QualifiedSuperExpression() {}

  public static final QualifiedSuperExpression prototype = new QualifiedSuperExpression();

  public Operator superOperator() {
    return ConstructionObject.prototype;
  }

  public boolean isProduction() {
    return true;
  }

  public Operator childOperator(int i) {
    switch (i) {
    case 0: return PrimaryExpression.prototype;
    default: return null;
    }
  }

  public int numChildren() {
    return 1;
  }

  public static JavaNode createNode(IRNode type) {
    return createNode(tree, type);
  }
  public static JavaNode createNode(SyntaxTreeInterface tree, IRNode type) {
    JavaNode _result = new JavaNode(tree, prototype, new IRNode[]{type});
    return _result;
  }

  public static IRNode getType(IRNode node) {
    Operator op = tree.getOperator(node);
    if (!(op instanceof QualifiedSuperExpression)) {
      throw new IllegalArgumentException("node not QualifiedSuperExpression: "+op);
    }
    return getType(tree, node);
  }

  public PrimaryExpression getType() {
    return getType(tree);
  }

  public static IRNode getType(SyntaxTreeInterface tree, IRNode node) {
    Operator op = tree.getOperator(node);
    if (!(op instanceof QualifiedSuperExpression)) {
      throw new IllegalArgumentException("node not QualifiedSuperExpression: "+op);
    }
    return tree.getChild(node,0);
  }

  public PrimaryExpression getType(SyntaxTreeInterface tree) {
    return (PrimaryExpression)instantiate(tree.getChild(baseNode,0));
  }

  private static Token littoken1 = new Delim(".");
  private static Token littoken2 = new Keyword("super");

  public void unparse(IRNode node, JavaUnparser unparser) {
SyntaxTreeInterface tree = unparser.getTree();
    Operator op = tree.getOperator(node);
    if (!(op instanceof QualifiedSuperExpression)) {
      throw new IllegalArgumentException("node not QualifiedSuperExpression: "+op);
    }
    unparser.unparse(tree.getChild(node,0));
    unparser.getStyle().getNONE().emit(unparser,node);
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
    if (!(op instanceof QualifiedSuperExpression)) {
      throw new IllegalArgumentException("node not QualifiedSuperExpression: "+op);
    }
    int numChildren = tree.numChildren(node);
    Vector[] TokenList = new Vector[numChildren+1];
    for (int j = 0; j < numChildren + 1; j++)
       TokenList[j] = new Vector();
    tree.getChild(node,0);
    TokenList[1].add(littoken1);
    TokenList[1].add(littoken2);
    return TokenList;
  }

  public Token asToken() {
    return littoken1;
  }

}