// Generated from C:\eclipse\workspace\fluid\code\fluid\java\operator\ForInit.op.  Do *NOT* edit!
package fluid.java.operator;

import fluid.ir.*;
import fluid.tree.*;
import fluid.control.*;
import fluid.unparse.*;
import fluid.java.*;
import fluid.java.control.*;

import java.util.*;

import java.util.Vector;public class ForInit extends JavaOperator implements ForInitInterface { 
  protected ForInit() {}

  public static final ForInit prototype = new ForInit();


  public boolean includes(Operator op) {
    return op instanceof ForInitInterface;
  }
}
