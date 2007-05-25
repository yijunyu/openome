// Generated from C:\eclipse\workspace\fluid\code\fluid\java\operator\OptArrayInitializer.op.  Do *NOT* edit!
package fluid.java.operator;

import fluid.ir.*;
import fluid.tree.*;
import fluid.control.*;
import fluid.unparse.*;
import fluid.java.*;
import fluid.java.control.*;

import java.util.*;

import java.util.Vector;public class OptArrayInitializer extends JavaOperator implements OptArrayInitializerInterface { 
  protected OptArrayInitializer() {}

  public static final OptArrayInitializer prototype = new OptArrayInitializer();


  public boolean includes(Operator op) {
    return op instanceof OptArrayInitializerInterface;
  }

  /** Create the control-flow component for the initializer
   */
  public Component createComponent(IRNode node) {
    return new SimpleComponent(node);
  }
}
