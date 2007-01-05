
package jtelos;


public class InstancesExistException extends RuntimeException {
  


  public InstancesExistException(String telosName,
				 String message) { 
	super("Cannot remove individual " + telosName + 
	  " since it has instances in this KB. "+ message);
  }  

}