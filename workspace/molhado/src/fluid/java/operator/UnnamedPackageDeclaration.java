// Generated from C:\eclipse\workspace\fluid\code\fluid\java\operator\UnnamedPackageDeclaration.op.  Do *NOT* edit!
package fluid.java.operator;

import fluid.ir.*;
import fluid.tree.*;
import fluid.control.*;
import fluid.unparse.*;
import fluid.java.*;
import fluid.java.control.*;

import java.util.*;

import java.util.Vector;public class UnnamedPackageDeclaration extends PackageDeclaration 
    implements DripOperator 
    { 
  protected UnnamedPackageDeclaration() {}

  public static final UnnamedPackageDeclaration prototype = new UnnamedPackageDeclaration();

  public Operator superOperator() {
    return PackageDeclaration.prototype;
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

  public void unparseWrapper(IRNode node, JavaUnparser unparser) {
  }

  public void unparse(IRNode node, JavaUnparser unparser) {
SyntaxTreeInterface tree = unparser.getTree();
    Operator op = tree.getOperator(node);
    if (!(op instanceof UnnamedPackageDeclaration)) {
      throw new IllegalArgumentException("node not UnnamedPackageDeclaration: "+op);
    }
  }

  public boolean isMissingTokens(IRNode node)  {
    return false;
  }

  public Vector[] missingTokens(IRNode node) {
    SyntaxTreeInterface tree = JavaNode.tree;
    Operator op = tree.getOperator(node);
    if (!(op instanceof UnnamedPackageDeclaration)) {
      throw new IllegalArgumentException("node not UnnamedPackageDeclaration: "+op);
    }
    int numChildren = tree.numChildren(node);
    Vector[] TokenList = new Vector[numChildren+1];
    for (int j = 0; j < numChildren + 1; j++)
       TokenList[j] = new Vector();
    return TokenList;
  }

}
