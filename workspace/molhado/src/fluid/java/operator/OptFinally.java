// Generated from C:\eclipse\workspace\fluid\code\fluid\java\operator\OptFinally.op.  Do *NOT* edit!
package fluid.java.operator;

import fluid.ir.*;
import fluid.tree.*;
import fluid.control.*;
import fluid.unparse.*;
import fluid.java.*;
import fluid.java.control.*;

import java.util.*;

import java.util.Vector;public class OptFinally extends JavaOperator { 
  protected OptFinally() {}

  public static final OptFinally prototype = new OptFinally();


  public Component createComponent(IRNode node) {
    return new SimpleComponent(node);
  }
}
