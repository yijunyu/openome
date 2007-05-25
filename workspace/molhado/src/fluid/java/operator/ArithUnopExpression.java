// Generated from C:\eclipse\workspace\fluid\code\fluid\java\operator\ArithUnopExpression.op.  Do *NOT* edit!
package fluid.java.operator;

import fluid.ir.*;
import fluid.tree.*;
import fluid.control.*;
import fluid.unparse.*;
import fluid.java.*;
import fluid.java.control.*;

import java.util.*;

import java.util.Vector;public class ArithUnopExpression extends UnopExpression 
    implements ArithExpression 
    { 
  protected ArithUnopExpression() {}

  public static final ArithUnopExpression prototype = new ArithUnopExpression();

  public Operator superOperator() {
    return UnopExpression.prototype;
  }

}
