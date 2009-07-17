package edu.toronto.cs.openome.evaluation.reasoning;


/**
 * @author jenhork
 * A class in the Strategy pattern.
 */
public class Reasoning {
	
	private Reasoner reasoner;
	
	
	/**
	 * @author jenhork
	 * Default constructor, does nothing
	 */
	public Reasoning() {
		
		//let's have a default reasoner.  Conveniently it is the one I've created
		reasoner = null;
	}
	 
	/**
	 * @author jenhork
	 * @param Takes in a model
	 * @param Takes in an enumerated type representing the type of evaluation to do
	 */
	public Reasoning(Reasoner rsnr) {
	
		reasoner = rsnr;
	}
	
	/**
	 * @author jenhork
	 * @param Takes in an Reasoner class describing the type of reasoning to do
	 */
	public void setReasoner(Reasoner rsnr) {
		reasoner = rsnr;
	}
	
	/**
	 * @author jenhork
	 * @param Returns the Reasoner class currently being used
	 */
	public Reasoner getReasoner() {
		return reasoner;
	}
	
	
	/**
	 * @author jenhork
	 * @return  There should probably be some more intelligent return value, like an error or something
	 * 
	 * This is where the magic happens, this will perform reasoning over whatever model is currently stored.
	 */
	public void reason() {
		reasoner.reason();
	}
	
	
}
