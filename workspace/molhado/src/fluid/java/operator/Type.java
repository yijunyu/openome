// Generated from C:\eclipse\workspace\fluid\code\fluid\java\operator\Type.op.  Do *NOT* edit!
package fluid.java.operator;

import fluid.ir.*;
import fluid.tree.*;
import fluid.control.*;
import fluid.unparse.*;
import fluid.java.*;
import fluid.java.control.*;

import java.util.*;

import java.util.Vector;public class Type extends JavaOperator implements TypeInterface { 
  protected Type() {}

  public static final Type prototype = new Type();


  /** Use the interface to determine what operators are legal:
   */
  public boolean includes(Operator other) {
    return (other instanceof TypeInterface);
  }
}
