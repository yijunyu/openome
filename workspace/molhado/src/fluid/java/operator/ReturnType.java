// Generated from C:\eclipse\workspace\fluid\code\fluid\java\operator\ReturnType.op.  Do *NOT* edit!
package fluid.java.operator;

import fluid.ir.*;
import fluid.tree.*;
import fluid.control.*;
import fluid.unparse.*;
import fluid.java.*;
import fluid.java.control.*;

import java.util.*;

import java.util.Vector;public class ReturnType extends JavaOperator implements ReturnTypeInterface { 
  protected ReturnType() {}

  public static final ReturnType prototype = new ReturnType();


  /** Use the interface to determine what operators are legal:
   */
  public boolean includes(Operator other) {
    return (other instanceof ReturnTypeInterface);
  }
}
