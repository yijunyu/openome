package edu.toronto.cs.ome.model;

import edu.toronto.cs.ome.model.TelosElement;
import java.util.Iterator;
import java.util.Vector;

/**
 * @author  jenhork
 */
public class EvaluationLabelBag {
	
	Vector bag;
	
	boolean resolved;
	
	Vector prevStates;
	
	public EvaluationLabelBag() {
		bag = new Vector();
		resolved = false;
		prevStates = new Vector();
	}
		
	public void add(EvaluationLabel label, TelosElement ele) {
		//only one label from each element allowed in the bag
		//remove the old element if there is one
		removeElement(ele);
		
		Object[] tuple = {label, ele};
		bag.add(tuple);
		
		resolved = false;
	}

	public void removeElement(TelosElement e)  {	
		
		if (e != null)  {
			for (int i = 0; i < bag.size(); i++) {
				Object [] tuple = (Object []) bag.get(i);
				TelosElement compare = (TelosElement) tuple[1];
				if (compare.getID() == e.getID()) {
					bag.remove(i);
					
				}
			}
		}
	}
	
	public boolean isEmpty() {
		return bag.isEmpty();
	}
	
	public Iterator iterator() {
		return bag.iterator();
	}
	
	public int size() {
		return bag.size();
	}
	
	public EvaluationLabel getFirstValue() {
		Object [] tuple = (Object []) bag.get(0);
		return (EvaluationLabel) tuple[0];
		
	}
	
	/**
	 * @return  Returns the resolved.
	 * @uml.property  name="resolved"
	 */
	public boolean isResolved() {
		return resolved;
	}
	
	public void resolve() {
		resolved = true;
	}
	
	public void printBag() {
		Iterator i = bag.iterator();
		System.out.print("Bag: { ");
		while (i.hasNext()) {
			Object [] tuple = (Object []) i.next();
			EvaluationLabel label = (EvaluationLabel) tuple[0];
			TelosElement element = (TelosElement) tuple[1];
			
			System.out.print(label.getName() + " from " + element.getName() + ", ");
		}
		System.out.println(" }");
	}
	
	public void saveState(EvaluationLabel result) {
		Vector newBag = new Vector(bag);
		
		Object [] tuple = {result, newBag};
		prevStates.add(tuple);
		
	}
	
	public EvaluationLabel hasThisState() {
		Iterator i = prevStates.iterator();
		/*System.out.println("This bag:");
		printBag();*/
		while (i.hasNext()) {
			Object [] tuple = (Object[]) i.next();
			EvaluationLabel label = (EvaluationLabel) tuple[0];
			Vector prevBag = (Vector) tuple[1];
			/*System.out.println("Saved bag");
			Iterator j = bag.iterator();
			System.out.print("Bag: { ");
			while (j.hasNext()) {
				Object [] o = (Object []) j.next();
				EvaluationLabel label2 = (EvaluationLabel) o[0];
				TelosElement element = (TelosElement) o[1];
				
				System.out.print(label2.getName() + " from " + element.getName() + ", ");
			}
			System.out.println(" }");*/
			if (equalBags(bag, prevBag)) {
				//System.out.println("bags equal");
				return label;
			}
		}
		//System.out.println("bags not equal");
		return null;
	}
	
	private boolean equalBags(Vector bag1, Vector bag2) {
		if (bag1.size() != bag2.size())
			return false;
		//the equals function for Vector takes position into account
		if (bag1.equals(bag2))
			return true;
		//We also want to know if two bags are equal regardless of position
		Iterator it1 = bag1.iterator();
		
		while(it1.hasNext())  {
			Object []  o1 = (Object []) it1.next();
			EvaluationLabel label1 = (EvaluationLabel) o1[0];
			TelosElement element1 = (TelosElement) o1[1];
			boolean match = false;
			Iterator it2 = bag2.iterator();
			while (it2.hasNext()) {
				Object [] o2 = (Object []) it2.next();
				EvaluationLabel label2 = (EvaluationLabel) o2[0];
				TelosElement element2 = (TelosElement) o2[1];
				System.out.println("Labels: " + label1.getName() + " " + label2.getName());
				System.out.println("Elements: " + element1.getName() + " " + element2.getName());
				if (label1.getName().equals(label2.getName()) 
						&& element1.getName().equals(element2.getName()))  {
					match = true;
					break;
				}
			}
			if (!match)
				return false;
		}
		return true;
	}
  }
