package edu.toronto.cs.openome.evaluation.SATSolver;

import java.util.Vector;

import edu.toronto.cs.openome_model.Container;
import edu.toronto.cs.openome_model.Contribution;
import edu.toronto.cs.openome_model.Decomposition;
import edu.toronto.cs.openome_model.Dependable;
import edu.toronto.cs.openome_model.Dependency;
import edu.toronto.cs.openome_model.Intention;
import edu.toronto.cs.openome_model.Link;
import edu.toronto.cs.openome_model.impl.ModelImpl;
import edu.toronto.cs.openome_model.Intention;

public class ModeltoAxiomsConverter {
	ModelImpl model;
	Dimacs cnf;
	Vector<Link> done;
	
	public ModeltoAxiomsConverter(ModelImpl m) {
		model = m;
		cnf = new Dimacs();
		done = new Vector<Link>();
	}
	
	public Dimacs convert()  {
		
		convertContributions();
		convertDependencies();
		convertDecompositions();
		
		return cnf;
	}

	private void convertDecompositions() {
		for (Decomposition dec : model.getDecompositions()) {
			if (!done.contains(dec)) {
				System.out.println("already done " + dec.toString());
				
				
			}
			
			System.out.println("done " + dec.toString());
			done.add(dec);
		}
		
	}

	private void convertDependencies() {
		for (Dependency dep : model.getDependencies()) {
			System.out.println(dep.toString());
			
			if (!done.contains(dep)) {
				Dependable target = dep.getDependencyFrom();
				
				//if it's not an actor
				if (!(target instanceof Container))  {
					Intention targetInt = (Intention) target;
					System.out.println(targetInt.getName());
				
				}
				//This is the target?
				Dependable source = dep.getDependencyTo();
				
				
			}
			else System.out.println("already done " + dep.toString());
			
			System.out.println("done " + dep.toString());
			done.add(dep);
						
		}
		
	}

	private void convertContributions() {
		for (Contribution cont : model.getContributions()) {
			
			
//			if (c instanceof UnknownContribution)
			
		}
		
	}
	
}
