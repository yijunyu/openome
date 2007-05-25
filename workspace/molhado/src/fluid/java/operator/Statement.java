// Generated from C:\eclipse\workspace\fluid\code\fluid\java\operator\Statement.op.  Do *NOT* edit!
package fluid.java.operator;

import fluid.ir.*;
import fluid.tree.*;
import fluid.control.*;
import fluid.unparse.*;
import fluid.java.*;
import fluid.java.control.*;

import java.util.*;

import java.util.Vector;public class Statement extends JavaOperator { 
  protected Statement() {}

  public static final Statement prototype = new Statement();


  /** Create a component for this node.  By default we just
   * execute the children in succession.
   */
  public Component createComponent(IRNode node) {
    if (variableOperator() != null) {
      return new SequenceComponent(node);
    } else {
      return new SimpleComponent(node);
    }
  }
}
