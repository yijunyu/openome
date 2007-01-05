
package jtelos;


public class ReferencedByAttributeException extends RuntimeException {
  


  public ReferencedByAttributeException(String telosName,
					 String message) { 
	super("Cannot remove individual " + telosName + 
	  " since it is referenced by an attribute in this KB. "+ message);
  }  

}