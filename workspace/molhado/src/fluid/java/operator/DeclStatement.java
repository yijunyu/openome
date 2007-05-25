// Generated from C:\eclipse\workspace\fluid\code\fluid\java\operator\DeclStatement.op.  Do *NOT* edit!
package fluid.java.operator;

import fluid.ir.*;
import fluid.tree.*;
import fluid.control.*;
import fluid.unparse.*;
import fluid.java.*;
import fluid.java.control.*;

import java.util.*;

import java.util.Vector;public class DeclStatement extends Statement 
    implements DripOperator, ForInitInterface 
    { 
  protected DeclStatement() {}

  public static final DeclStatement prototype = new DeclStatement();

  public Operator superOperator() {
    return Statement.prototype;
  }

  public boolean isProduction() {
    return true;
  }

  public Operator childOperator(int i) {
    switch (i) {
    case 0: return Type.prototype;
    case 1: return VariableDeclarators.prototype;
    default: return null;
    }
  }

  public int numChildren() {
    return 2;
  }

  public static JavaNode createNode(int mods,
                                    IRNode type,
                                    IRNode vars) {
    return createNode(tree, mods, type, vars);
  }
  public static JavaNode createNode(SyntaxTreeInterface tree, int mods,
                                    IRNode type,
                                    IRNode vars) {
    JavaNode _result = new JavaNode(tree, prototype, new IRNode[]{type,vars});
    JavaNode.setModifiers(_result,mods);
    return _result;
  }

  public boolean isComplete(IRNode node) {
    if (!super.isComplete(node)) return false;
    try {
      JavaNode.getModifiers(node);
    } catch (SlotUndefinedException ex) {
      return false;
    }
    return true;
  }

  public IRNode copyTree(IRNode node) {
    IRNode _result = super.copyTree(node);
    JavaNode.setModifiers(_result,JavaNode.getModifiers(node));
    return _result;
  }

  public boolean isEquivalentNode(IRNode n1, IRNode n2) {
    return super.isEquivalentNode(n1, n2) &&
           (JavaNode.getModifiers(n1) == JavaNode.getModifiers(n2)) &&
    true;
  }

  public static int getMods(IRNode node) {
    Operator op = tree.getOperator(node);
    if (!(op instanceof DeclStatement)) {
      throw new IllegalArgumentException("node not DeclStatement: "+op);
    }
    return JavaNode.getModifiers(node);
  }

  public int getMods() {
    return JavaNode.getModifiers(baseNode);
  }

  public static IRNode getType(IRNode node) {
    Operator op = tree.getOperator(node);
    if (!(op instanceof DeclStatement)) {
      throw new IllegalArgumentException("node not DeclStatement: "+op);
    }
    return getType(tree, node);
  }

  public Type getType() {
    return getType(tree);
  }

  public static IRNode getType(SyntaxTreeInterface tree, IRNode node) {
    Operator op = tree.getOperator(node);
    if (!(op instanceof DeclStatement)) {
      throw new IllegalArgumentException("node not DeclStatement: "+op);
    }
    return tree.getChild(node,0);
  }

  public Type getType(SyntaxTreeInterface tree) {
    return (Type)instantiate(tree.getChild(baseNode,0));
  }

  public static IRNode getVars(IRNode node) {
    Operator op = tree.getOperator(node);
    if (!(op instanceof DeclStatement)) {
      throw new IllegalArgumentException("node not DeclStatement: "+op);
    }
    return getVars(tree, node);
  }

  public VariableDeclarators getVars() {
    return getVars(tree);
  }

  public static IRNode getVars(SyntaxTreeInterface tree, IRNode node) {
    Operator op = tree.getOperator(node);
    if (!(op instanceof DeclStatement)) {
      throw new IllegalArgumentException("node not DeclStatement: "+op);
    }
    return tree.getChild(node,1);
  }

  public VariableDeclarators getVars(SyntaxTreeInterface tree) {
    return (VariableDeclarators)instantiate(tree.getChild(baseNode,1));
  }

  public void unparse(IRNode node, JavaUnparser unparser) {
SyntaxTreeInterface tree = unparser.getTree();
    Operator op = tree.getOperator(node);
    if (!(op instanceof DeclStatement)) {
      throw new IllegalArgumentException("node not DeclStatement: "+op);
    }
    JavaNode.unparseModifiers(node,unparser);
    unparser.unparse(tree.getChild(node,0));
    unparser.unparse(tree.getChild(node,1));
  }

  public boolean isMissingTokens(IRNode node)  {
    return true;
  }

  public Vector[] missingTokens(IRNode node) {
    SyntaxTreeInterface tree = JavaNode.tree;
    Operator op = tree.getOperator(node);
    if (!(op instanceof DeclStatement)) {
      throw new IllegalArgumentException("node not DeclStatement: "+op);
    }
    int numChildren = tree.numChildren(node);
    Vector[] TokenList = new Vector[numChildren+1];
    for (int j = 0; j < numChildren + 1; j++)
       TokenList[j] = new Vector();
    Token[] tl = JavaNode.getModiferTokens(node);
    if (tl != null && tl.length > 0)
      for (int j = 0; j < tl.length; j++)
        TokenList[0].add(tl[j]);
    tree.getChild(node,0);
    tree.getChild(node,1);
    return TokenList;
  }

  
  private static Token commatoken = new Delim(";");

  public void unparseWrapper(IRNode node, JavaUnparser unparser) {
    super.unparseWrapper(node,unparser);
    IRNode p = tree.getParentOrNull(node);
    /* Except for a ForStatement initializer, we add a semicolon. */
    if (p == null || !(tree.getOperator(p) instanceof ForStatement)) {
      unparser.getStyle().getNONE().emit(unparser,node);
      commatoken.emit(unparser,node);
    }
  }

  /** Create the control-flow component for a declaration statement.
   * Just execute the initialization (child #1)
   */
  public Component createComponent(IRNode node) {
    return new SimpleComponent(node,new int[]{1});
  }
}
