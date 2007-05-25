// Generated from C:\eclipse\workspace\fluid\code\fluid\java\operator\ArithBinopExpression.op.  Do *NOT* edit!
package fluid.java.operator;

import fluid.ir.*;
import fluid.tree.*;
import fluid.control.*;
import fluid.unparse.*;
import fluid.java.*;
import fluid.java.control.*;

import java.util.*;

import java.util.Vector;public class ArithBinopExpression extends BinopExpression implements ArithExpression { 
  protected ArithBinopExpression() {}

  public static final ArithBinopExpression prototype = new ArithBinopExpression();

  public Operator superOperator() {
    return BinopExpression.prototype;
  }

}
