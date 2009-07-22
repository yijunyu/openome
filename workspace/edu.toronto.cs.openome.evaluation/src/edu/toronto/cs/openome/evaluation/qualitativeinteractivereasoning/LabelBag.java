package edu.toronto.cs.openome.evaluation.qualitativeinteractivereasoning;

import java.util.ListIterator;
import java.util.Vector;

import edu.toronto.cs.openome_model.EvaluationLabel;
import edu.toronto.cs.openome_model.Intention;

public class LabelBag {
	private Vector<Object> bag;
	
	public LabelBag() {
		bag = new Vector<Object>();
	}

	public void addToBag(Intention i, EvaluationLabel l) {				
		Object [] anArray = new Object[2];
		
		try {
			anArray[0] = i;
			anArray[1] = l;
		}
		catch (Exception e)  {
			System.out.println("Couldn't add items to tuple array");
		}
		
		int index = find(i);
		
		if (index < 0) {
			try {
				bag.add(anArray);	
			}
			catch (Exception e){
				System.out.println("Couldn't add tuple to bag");
			}
		}
		//overwrite existing entry for that intention
		else {
			bag.add(index, anArray);			
		}			
	}
	
	public void printBag() {
		for (Object ob: bag) {
			Object [] ar = (Object[]) ob;
			System.out.print("(" + ((Intention)ar[0]).getName() + ", " + ((EvaluationLabel) ar[1]).getName() + "), ");
			System.out.println("");
		}
	}
	
	private int find(Intention i) {
		for (Object ob: bag) {
			Object [] ar = (Object[]) ob;
			if (((Intention)ar[0]).equals(i)) {
				return bag.indexOf(ob);
			}
		}
		return -1;
		
	}
	
	public int size() {
		return bag.size();
	}
	
	public ListIterator<Object> listIterator() {	
		return bag.listIterator();
	}
	
	public Object[] getFirst() {
		return (Object[]) bag.firstElement();
	}
	
}
