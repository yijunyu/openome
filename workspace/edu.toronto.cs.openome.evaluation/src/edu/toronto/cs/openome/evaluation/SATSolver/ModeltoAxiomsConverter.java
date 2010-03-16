package edu.toronto.cs.openome.evaluation.SATSolver;

import java.util.ArrayList;
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
	LinkAxiomsFactory linkAxiomsFactory;
	DualHashMap<Integer, Intention> intentionIndex;
	
	public ModeltoAxiomsConverter(ModelImpl m) {
		model = m;
		intentionIndex = new DualHashMap<Integer, Intention>();
		createIntentionIndex();
		cnf = new Dimacs();
		done = new Vector<Link>();
		linkAxiomsFactory = new LinkAxiomsFactory();
	}
	
	private void createIntentionIndex() {
		int sixCount = 1;
		
		for (Intention i : model.getIntentions()) {
			intentionIndex.put(new Integer(sixCount), i);
			sixCount += 6;
		}
		
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
			
			else System.out.println("done " + dec.toString());
			done.add(dec);
		}
		
	}

	private void convertDependencies() {
		for (Dependency dep : model.getDependencies()) {
			System.out.println(dep.toString());
			
			if (!done.contains(dep)) {
				Intention sourceInt = null;
				Intention targetInt = null;	
				
				//this is the source in forward evaluation, the dependee
				Dependable source = dep.getDependencyTo();
					
				//if it's not an actor
				if (!(source instanceof Container))  {
					//This is the target?
					sourceInt = (Intention) source;
					System.out.println("dependency to " + sourceInt.getName());
				}
				
				//this is the target in forward evaluation, the depender
				Dependable target = dep.getDependencyFrom();
				
				//if it's not an actor
				if (!(target instanceof Container))  {
					targetInt = (Intention) target;
					System.out.println("dependency from " + targetInt.getName());
				}
				
				//it's a dependency from an intention to an intention
				if (targetInt != null && sourceInt != null) {
					Vector<Link> link = new Vector<Link>();
					link.add(dep);
					Vector<Intention> sources = new Vector<Intention>();
					sources.add(sourceInt);
					LinkAxioms la = linkAxiomsFactory.createLinkAxiom(sources, targetInt, link, "Dependency", intentionIndex);
					
					cnf.addLinkAxioms(la);
				}
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
