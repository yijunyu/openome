// Generated from C:\eclipse\workspace\fluid\code\fluid\java\operator\ClassBodyDeclaration.op.  Do *NOT* edit!
package fluid.java.operator;

import fluid.ir.*;
import fluid.tree.*;
import fluid.control.*;
import fluid.unparse.*;
import fluid.java.*;
import fluid.java.control.*;

import java.util.*;

import java.util.Vector;public class ClassBodyDeclaration extends Declaration implements ClassBodyDeclInterface { 
  protected ClassBodyDeclaration() {}

  public static final ClassBodyDeclaration prototype = new ClassBodyDeclaration();

  public Operator superOperator() {
    return Declaration.prototype;
  }


  /** default component -- do nothing */
  public Component createComponent(IRNode node) {
    Component comp = new Component(node,1,1,0);
    ControlEdge.connect(comp.getEntryPort(),comp.getNormalExitPort());
    return comp;
  }

  /** Use the interface to determine what operators are legal:
   */
  public boolean includes(Operator other) {
    return (other instanceof ClassBodyDeclInterface);
  }
}
