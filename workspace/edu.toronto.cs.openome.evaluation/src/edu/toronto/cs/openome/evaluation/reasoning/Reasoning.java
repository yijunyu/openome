/**
 * 
 */
package edu.toronto.cs.openome.evaluation.reasoning;

import edu.toronto.cs.openome_model.Model;

/**
 * @author jenhork
 *
 */
public class Reasoning {
	
	public enum EvalType { InteractiveQualReasoning };
	
	private Model model;
	private Reasoner reasoner;
	public EvalType etype;
	
	/**
	 * @author jenhork
	 * Default constructor, does nothing
	 */
	public Reasoning() {
		model = null;  //maybe this is null already, can't remember java
		//let's have a default reasoner.  Conveniently it is the one I've created
		setType(EvalType.InteractiveQualReasoning);
	}
	
	/**
	 * @author jenhork
	 * @param Takes in a model
	 * @param Takes in an enumerated type representing the type of evaluation to do
	 */
	public Reasoning(Model mod, EvalType et) {
		model = mod;
		setType(et);
	}
	
	/**
	 * @author jenhork
	 * @param Takes in an enumerated type representing the type of evaluation to do
	 * Sets the type of evaluation, creates the right evaluation class.
	 */
	public void setType(EvalType et) {
		etype = et;
		
		/*Note:  By putting in a switch here I'm kind of killing the point of using the strategy pattern.  It's designed to avoid this.
		 * However, the alternative is to get the user to declare the Reasoning class like:
		 * r = new Reasoner(new InteractiveQualReasoning());
		 * But then the user needs to know each class for each type of reasoning and these classes will be public.  This seems like too 
		 * much information for the user to me.
		*/
		switch (etype) {
			case InteractiveQualReasoning: reasoner = new InteractiveQualReasoner(); break;
			default: reasoner = new InteractiveQualReasoner(); break;
		}
	}
	
	public EvalType getType() {
		return etype;
	}
	/**
	 * @author jenhork
	 * @return The model stored in the reasoning class.
	 */
	public Model getModel() {
		return model;
	}
	
	/**
	 * @author jenhork
	 * @param Set the model stored in the reasoning class to this parameter
	 */
	public void setModel(Model mod) {
		model = mod;
	}
	
	/**
	 * @author jenhork
	 * @return  There should probably be some more intelligent return value, like an error or something
	 * 
	 * This is where the magic happens, this will perform reasoning over whatever model is currently stored.
	 */
	public void reason() {
		
	}
	
	/**
	 * @author jenhork
	 * @return  There should probably be some more intelligent return value, like an error or something
	 * @param Model over which to reason
	 * 
	 * This is where the magic happens, this will perform reasoning over whatever model is passed.
	 */
	public void reason(Model mod) {
		model = mod;
		
		reason();
	}

}
