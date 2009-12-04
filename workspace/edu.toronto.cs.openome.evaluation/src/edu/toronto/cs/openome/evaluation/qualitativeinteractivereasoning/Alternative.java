package edu.toronto.cs.openome.evaluation.qualitativeinteractivereasoning;

import org.eclipse.emf.common.util.EList;

import edu.toronto.cs.openome_model.Intention;

/**
 * @author aftabs
 * 
 * This class represents an alternative evaluation for a model. An alternative stores 
 * a set of evaluation values which represents a single evaluation performed. 
 * 
 */
public class Alternative {

	// Alternative name
	private String name;
	
	// Alternative description
	private String description;
	
	// Intentions in the model. 
	// TODO: change this to a list of eval labels
	private EList<Intention> intentions;

	public Alternative(String name, String des) {
		this.name = name;
		this.description = des;
	}	
	
	/**
	 *  Add an intention to the list of intentions
	 * @param i
	 */
	public void addIntention (Intention i) {
		intentions.add(i);
	}
	
	/**
	 * Replaces the set of intentions with the specified list of intentions 
	 * @param vIntention
	 */
	public void setIntentions (EList<Intention> vIntention){
		intentions = vIntention;
	}
	
	/**
	 * Returns the list of intentions in the alternative
	 * @return intentions
	 */
	public EList<Intention> getIntentions() {
		return intentions;
	}
	
	/**
	 * Returns the alternative name
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets alternative name with the specified String
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Returns the alternative description
	 * @return description
	 */
	public String getDescription() {
		return description;
	}
	
	/**
	 * Sets alternative description with the specified String
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
	/**
	 * Prints out all the intentions in the alternative with its label
	 */
	public void print() {
		for(Intention i : intentions){
			System.out.println(i.getName() + " - " + i.getQualitativeReasoningCombinedLabel().getName());
		}
	}
}
