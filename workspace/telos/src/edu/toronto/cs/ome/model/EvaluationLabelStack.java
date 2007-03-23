package edu.toronto.cs.ome.model;

import java.util.Iterator;
import java.util.Stack;
import edu.toronto.cs.ome.model.TelosElement;

public class EvaluationLabelStack {
	Stack stack;
	
	public EvaluationLabelStack() {
		stack = new Stack();
	}
	
	public void add(EvaluationLabel label, TelosElement ele) {
		if (!contains(label, ele)) {
			Object[] tuple = {label, ele};
			stack.push(tuple);
		}
		
	}

	public int size() {
		return stack.size();
	}
	
	public Object pop() {
		
		return stack.pop();
	}
	
	public boolean isEmpty() {
		return stack.isEmpty();
	}
	
	public boolean contains(EvaluationLabel label, TelosElement ele) {
		Iterator i = stack.iterator();
		
		while (i.hasNext())  {
			Object [] tuple = (Object []) i.next();
			if (((EvaluationLabel)tuple[0]).getName().equals(ele.getName()) &&
					((TelosElement)tuple[1]).getID() == ele.getID()) {
				return true;
			}
		}
		return false;
	}
	
	public void printSize() {
		System.out.println(stack.size());
	}
	
	public void printStack() {
		Iterator i = stack.iterator();
		System.out.print("Lable Queue: { ");
		while (i.hasNext()) {
			Object [] tuple = (Object []) i.next();
			EvaluationLabel label = (EvaluationLabel) tuple[0];
			TelosElement element = (TelosElement) tuple[1];
			
			System.out.print(label.getName() + " from " + element.getName() + ", ");
		}
		System.out.println(" }");
	}
}

