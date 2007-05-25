// Generated from C:\eclipse\workspace\fluid\code\fluid\java\operator\TypeDeclaration.op.  Do *NOT* edit!
package fluid.java.operator;

import fluid.ir.*;
import fluid.tree.*;
import fluid.control.*;
import fluid.unparse.*;
import fluid.java.*;
import fluid.java.control.*;

import java.util.*;

import java.util.Vector;public class TypeDeclaration extends JavaOperator implements TypeDeclInterface { 
  protected TypeDeclaration() {}

  public static final TypeDeclaration prototype = new TypeDeclaration();


  /** Use the interface to determine what operators are legal:
   */
  public boolean includes(Operator other) {
    return (other instanceof TypeDeclInterface);
  }
  
  public static String getName(IRNode type) {
    return JavaNode.getInfo(type);
  }
}
