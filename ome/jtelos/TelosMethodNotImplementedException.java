
package jtelos;


public class TelosMethodNotImplementedException extends RuntimeException {
  


  public TelosMethodNotImplementedException(String className,
					    String methodName) { 
	super("The method " + methodName + " in "+ className + 
	  " is not implemented.");
  }  

  public TelosMethodNotImplementedException(String className,
					    String methodName,
					    String message) { 
	super("The method " + methodName + " in "+ className + 
	  " is not implemented. "+ message);
  }  

}