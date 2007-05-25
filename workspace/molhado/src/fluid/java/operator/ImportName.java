// Generated from C:\eclipse\workspace\fluid\code\fluid\java\operator\ImportName.op.  Do *NOT* edit!
package fluid.java.operator;

import fluid.ir.*;
import fluid.tree.*;
import fluid.control.*;
import fluid.unparse.*;
import fluid.java.*;
import fluid.java.control.*;

import java.util.*;

import java.util.Vector;public class ImportName extends JavaOperator implements ImportNameInterface { 
  protected ImportName() {}

  public static final ImportName prototype = new ImportName();


  /** Use the interface to determine what operators are legal:
   */
  public boolean includes(Operator other) {
    return (other instanceof ImportNameInterface);
  }
}


