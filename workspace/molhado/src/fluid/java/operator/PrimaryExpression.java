// Generated from C:\eclipse\workspace\fluid\code\fluid\java\operator\PrimaryExpression.op.  Do *NOT* edit!
package fluid.java.operator;

import fluid.ir.*;
import fluid.tree.*;
import fluid.control.*;
import fluid.unparse.*;
import fluid.java.*;
import fluid.java.control.*;

import java.util.*;

import java.util.Vector;public class PrimaryExpression extends Expression 
    implements StatementExpressionInterface 
    { 
  protected PrimaryExpression() {}

  public static final PrimaryExpression prototype = new PrimaryExpression();

  public Operator superOperator() {
    return Expression.prototype;
  }

}
