// Generated from C:\eclipse\workspace\fluid\code\fluid\java\operator\ThisExpression.op.  Do *NOT* edit!
package fluid.java.operator;

import java.util.Vector;

import fluid.ir.IRNode;
import fluid.java.DripOperator;
import fluid.java.JavaNode;
import fluid.java.JavaUnparser;
import fluid.tree.Operator;
import fluid.tree.SyntaxTreeInterface;
import fluid.unparse.Keyword;
import fluid.unparse.Token;
/**
 * Java's "this" expression.
 */
public class ThisExpression extends ConstructionObject 
    implements DripOperator 
    { 
  protected ThisExpression() {}

  public static final ThisExpression prototype = new ThisExpression();

  public Operator superOperator() {
    return ConstructionObject.prototype;
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

  private static Token littoken1 = new Keyword("this");

  public void unparse(IRNode node, JavaUnparser unparser) {
SyntaxTreeInterface tree = unparser.getTree();
    Operator op = tree.getOperator(node);
    if (!(op instanceof ThisExpression)) {
      throw new IllegalArgumentException("node not ThisExpression: "+op);
    }
    littoken1.emit(unparser,node);
  }

  public boolean isMissingTokens(IRNode node)  {
    return true;
  }

  public Vector[] missingTokens(IRNode node) {
    SyntaxTreeInterface tree = JavaNode.tree;
    Operator op = tree.getOperator(node);
    if (!(op instanceof ThisExpression)) {
      throw new IllegalArgumentException("node not ThisExpression: "+op);
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
