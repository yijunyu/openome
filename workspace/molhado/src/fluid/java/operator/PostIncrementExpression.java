// Generated from C:\eclipse\workspace\fluid\code\fluid\java\operator\PostIncrementExpression.op.  Do *NOT* edit!
package fluid.java.operator;

import java.util.Vector;

import fluid.ir.IRNode;
import fluid.java.JavaNode;
import fluid.java.JavaUnparser;
import fluid.tree.Operator;
import fluid.tree.SyntaxTreeInterface;
import fluid.unparse.Delim;
import fluid.unparse.Token;
public class PostIncrementExpression extends CrementExpression { 
  protected PostIncrementExpression() {}

  public static final PostIncrementExpression prototype = new PostIncrementExpression();

  public Operator superOperator() {
    return CrementExpression.prototype;
  }

  public boolean isProduction() {
    return true;
  }

  public Operator childOperator(int i) {
    switch (i) {
    case 0: return Expression.prototype;
    default: return null;
    }
  }

  public int numChildren() {
    return 1;
  }

  public static JavaNode createNode(IRNode op) {
    return createNode(tree, op);
  }
  public static JavaNode createNode(SyntaxTreeInterface tree, IRNode op) {
    JavaNode _result = new JavaNode(tree, prototype, new IRNode[]{op});
    return _result;
  }

  public static IRNode getOp(IRNode node) {
    Operator op = tree.getOperator(node);
    if (!(op instanceof PostIncrementExpression)) {
      throw new IllegalArgumentException("node not PostIncrementExpression: "+op);
    }
    return getOp(tree, node);
  }

  public Expression getOp() {
    return getOp(tree);
  }

  public static IRNode getOp(SyntaxTreeInterface tree, IRNode node) {
    Operator op = tree.getOperator(node);
    if (!(op instanceof PostIncrementExpression)) {
      throw new IllegalArgumentException("node not PostIncrementExpression: "+op);
    }
    return tree.getChild(node,0);
  }

  public Expression getOp(SyntaxTreeInterface tree) {
    return (Expression)instantiate(tree.getChild(baseNode,0));
  }

  private static Token littoken1 = new Delim("++");

  public void unparse(IRNode node, JavaUnparser unparser) {
SyntaxTreeInterface tree = unparser.getTree();
    Operator op = tree.getOperator(node);
    if (!(op instanceof PostIncrementExpression)) {
      throw new IllegalArgumentException("node not PostIncrementExpression: "+op);
    }
    unparser.unparse(tree.getChild(node,0));
    littoken1.emit(unparser,node);
  }

  public boolean isMissingTokens(IRNode node)  {
    return true;
  }

  public Vector[] missingTokens(IRNode node) {
    SyntaxTreeInterface tree = JavaNode.tree;
    Operator op = tree.getOperator(node);
    if (!(op instanceof PostIncrementExpression)) {
      throw new IllegalArgumentException("node not PostIncrementExpression: "+op);
    }
    int numChildren = tree.numChildren(node);
    Vector[] TokenList = new Vector[numChildren+1];
    for (int j = 0; j < numChildren + 1; j++)
       TokenList[j] = new Vector();
    tree.getChild(node,0);
    TokenList[1].add(littoken1);
    return TokenList;
  }

  public Token asToken() {
    return littoken1;
  }

  public boolean isPrefix() {
    return false;
  }
  public Operator baseOp() { return PreIncrementExpression.prototype; }
}

