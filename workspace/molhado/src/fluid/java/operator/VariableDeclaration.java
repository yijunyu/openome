// Generated from C:\eclipse\workspace\fluid\code\fluid\java\operator\VariableDeclaration.op.  Do *NOT* edit!
package fluid.java.operator;

import fluid.ir.*;
import fluid.tree.*;
import fluid.control.*;
import fluid.unparse.*;
import fluid.java.*;
import fluid.java.control.*;

import java.util.*;

import java.util.Vector;public class VariableDeclaration extends Declaration { 
  protected VariableDeclaration() {}

  public static final VariableDeclaration prototype = new VariableDeclaration();

  public Operator superOperator() {
    return Declaration.prototype;
  }


  public static String getId(IRNode node) {
    if (tree.getOperator(node) instanceof VariableDeclaration) {
      return JavaNode.getInfo(node);
    } else {
      throw new IllegalArgumentException("Not a VariableDeclaration " +
					 tree.getOperator(node));
    }
  }
}
