
package jtelos.util;

import java.lang.reflect.InvocationTargetException;

/**  This runtime exception is a wrapper for various exceptions caught
 * during the execution of a jtelos application. It allows exception
 * handling to be localized "high" in the call stack by converting
 * non-runtime exceptions (like <code>IOException</code>'s) to be
 * wrapped. The alternative strategy is often simply to print the
 * stack trace close to where the exception's is thrown and to proceed
 * with the program as if nothing were wrong. A third alternative is
 * to handle exceptions thoroughly close to where they were
 * thrown. This is very labour-intensive and does not take into
 * account the larget context in which the event occurs. The
 * compromise solution is to handle exceptions high in the call stack.
 *
 * <p>A comparable exception is the
 * <code>java.lang.reflect.InvocationTargetException</code> which
 * encapsulates another exception.
 **/
public class RuntimeEncapsulatorException extends RuntimeException {

  private Throwable e;


  /**
   * Simply wraps the exception.
   **/
  public RuntimeEncapsulatorException(Throwable e) { super(); this.e = e; }  

  /**
   * Wraps the exception and adds a message.
   **/
  public RuntimeEncapsulatorException(Throwable e,String message) {
	super(message);
	this.e = e; 
  }  

  /** Unwraps the message, concatenating it with the message in the
   * <code>RuntimeEncapsulatorException</code>.
   **/
  public String getMessage() {
	String message = "";
	if (super.getMessage() != null) message += super.getMessage();
	if (e instanceof RuntimeEncapsulatorException)
	  message += "\n" + e.getMessage();
	return message;
  }  

  /**
   * Returns the wrapped exception.
   **/
  public Throwable getWrappedException() {
	if (e instanceof RuntimeEncapsulatorException) 
	  return ((RuntimeEncapsulatorException)e).getWrappedException(); 
	if (e instanceof InvocationTargetException) {
	  Throwable e1 = ((InvocationTargetException)e).getTargetException();
	  if (e1 instanceof RuntimeEncapsulatorException)
	return ((RuntimeEncapsulatorException)e1).getWrappedException();
	  return e1;
	}
	return e;
  }  

  /**
   * Prints the stack trace of the <em>wrapped</em> exception.
   **/
  public void printStackTrace() { getWrappedException().printStackTrace(); }  

}