// Generated from C:\eclipse\workspace\fluid\code\fluid\java\operator\RelopExpression.op.  Do *NOT* edit!
package fluid.java.operator;

import fluid.ir.*;
import fluid.tree.*;
import fluid.control.*;
import fluid.unparse.*;
import fluid.java.*;
import fluid.java.control.*;

import java.util.*;

import java.util.Vector;public class RelopExpression extends BinopExpression { 
  protected RelopExpression() {}

  public static final RelopExpression prototype = new RelopExpression();

  public Operator superOperator() {
    return BinopExpression.prototype;
  }


  public Component createComponent(IRNode node) {
    Component comp = new Component(node,1,2,1);
    Subcomponent op1 = new Subcomponent(comp,tree.childLocation(node,0),1,1,1);
    Subcomponent op2 = new Subcomponent(comp,tree.childLocation(node,1),1,1,1);

    ControlNode doTest = new ComponentChoice(comp,null);
    ControlNode abruptMerge = new Merge();

    ControlEdge.connect(comp.getEntryPort(),op1.getEntryPort());
    ControlEdge.connect(op1.getNormalExitPort(),op2.getEntryPort());
    ControlEdge.connect(op2.getNormalExitPort(),doTest);
    ControlEdge.connect(doTest,comp.getNormalExitPort()); // true part
    ControlEdge.connect(doTest,comp.getNormalExitPort()); // false part
    ControlEdge.connect(op1.getAbruptExitPort(),abruptMerge);
    ControlEdge.connect(op2.getAbruptExitPort(),abruptMerge);
    ControlEdge.connect(abruptMerge,comp.getAbruptExitPort());

    return comp;
  }  
    
    
}
