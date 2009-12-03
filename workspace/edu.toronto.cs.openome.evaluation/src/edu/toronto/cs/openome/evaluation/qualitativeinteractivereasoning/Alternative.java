package edu.toronto.cs.openome.evaluation.qualitativeinteractivereasoning;

import java.util.Vector;

import org.eclipse.emf.common.util.EList;

import edu.toronto.cs.openome_model.Intention;

public class Alternative {

	private String name;
	private String description;
	private EList<Intention> intentions;

	public Alternative(String name, String des) {
		this.name = name;
		description = des;
	}	
	
	public void addIntention (Intention i) {
		intentions.add(i);
	}
	
	public void setIntentions (EList<Intention> vIntention){
		
		if (vIntention == null) {
			System.out.println("***************** intentions are null *****************************");
		}
		intentions = vIntention;
	}
	
	public EList<Intention> getIntentions() {
		return intentions;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public boolean findIntention(Intention i) {
		return intentions.contains(i);
	}

	public void print() {
		for(Intention i : intentions){
			System.out.println(i.getName() + " - " + i.getQualitativeReasoningCombinedLabel().getName());
		}
		System.out.println();
	}
}
