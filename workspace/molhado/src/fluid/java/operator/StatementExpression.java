// Generated from C:\eclipse\workspace\fluid\code\fluid\java\operator\StatementExpression.op.  Do *NOT* edit!
package fluid.java.operator;

import fluid.ir.*;
import fluid.tree.*;
import fluid.control.*;
import fluid.unparse.*;
import fluid.java.*;
import fluid.java.control.*;

import java.util.*;

import java.util.Vector;public class StatementExpression extends Expression 
    implements StatementExpressionInterface 
    { 
  protected StatementExpression() {}

  public static final StatementExpression prototype = new StatementExpression();

  public Operator superOperator() {
    return Expression.prototype;
  }


  public boolean includes(Operator op) {
    return op instanceof StatementExpressionInterface;
  }
}
