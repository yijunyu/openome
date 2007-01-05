
package jtelos;


public class ImmutableBuiltInException extends RuntimeException {
  


  public ImmutableBuiltInException(String telosName,
				   String message) { 
	super("Cannot alter Telos builtin " + telosName + ". "+ message);
  }  

}