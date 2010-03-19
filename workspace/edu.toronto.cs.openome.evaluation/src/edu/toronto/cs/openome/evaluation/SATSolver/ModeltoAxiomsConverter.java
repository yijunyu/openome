package edu.toronto.cs.openome.evaluation.SATSolver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Vector;

import edu.toronto.cs.openome_model.AndDecomposition;
import edu.toronto.cs.openome_model.Container;
import edu.toronto.cs.openome_model.Contribution;
import edu.toronto.cs.openome_model.Decomposition;
import edu.toronto.cs.openome_model.Dependable;
import edu.toronto.cs.openome_model.Dependency;
import edu.toronto.cs.openome_model.Intention;
import edu.toronto.cs.openome_model.Link;
import edu.toronto.cs.openome_model.OrDecomposition;
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
	
	private void reset() {
		done = new Vector<Link>();
		cnf = new Dimacs();
	}

	public Dimacs convertBothDirections()  {
		reset();
		convertContributions(1);
		convertDependencies(1);
		convertDecompositions(1);
		
		return cnf;
	}
	
	public Dimacs convertForward() {
		reset();
		convertContributions(2);
		convertDependencies(2);
		convertDecompositions(2);
		
		return cnf;
	}
	
	public Dimacs convertBackward() {
		reset();
		convertContributions(3);
		convertDependencies(3);
		convertDecompositions(3);
		return cnf;
	}

	private void convertDecompositions(int dir) {
		for (Decomposition dec : model.getDecompositions()) {
			if (!done.contains(dec)) {
				Intention target = dec.getTarget();
				
				Vector<Link> links = new Vector<Link>();
				Vector<Intention> sources = new Vector<Intention>();
				for (Decomposition sibling: target.getDecompositionsTo()){
					System.out.println("done " + sibling.toString());
					done.add(sibling);
					links.add(sibling);
					sources.add(sibling.getSource());
				}
				LinkAxioms la = null;
				if (dec instanceof AndDecomposition)
					la = linkAxiomsFactory.createLinkAxiom(sources, target, links, "Decomposition", intentionIndex);
				if (dec instanceof OrDecomposition)
					la = linkAxiomsFactory.createLinkAxiom(sources, target, links, "Means Ends", intentionIndex);
				
				if (la != null) {
					switch (dir) {
						case 1: la.createAllClauses(); break;
						case 2: la.createForwardClauses(); break;
						case 3: la.createBackwardClauses(); break;
						default: la.createAllClauses();  break;
					}	
				}
				
				cnf.addLinkAxioms(la);
				
			}			
			else {System.out.println("already done " + dec.toString());}
						
		}
		
	}

	private void convertMeansEnds(int dir) {
		// TODO Auto-generated method stub
		
	}

	private void convertAndDecomposition(int dir) {
		// TODO Auto-generated method stub
		
	}

	private void convertDependencies(int dir) {
		for (Dependency dep : model.getDependencies()) {
						
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
					intentionIndex.print();
					LinkAxioms la = linkAxiomsFactory.createLinkAxiom(sources, targetInt, link, "Dependency", intentionIndex);
					
					switch (dir) {
						case 1: la.createAllClauses(); break;
						case 2: la.createForwardClauses(); break;
						case 3: la.createBackwardClauses(); break;
						default: la.createAllClauses();  break;
					}
					//la.createAllClauses();
					cnf.addLinkAxioms(la);
				}
			}
			else {System.out.println("already done " + dep.toString());}
			
			System.out.println("done " + dep.toString());
			done.add(dep);
						
		}
		
	}
	
	

	private void convertContributions(int dir) {
		for (Contribution cont : model.getContributions()) {
			
			
//			if (c instanceof UnknownContribution)
			
		}
		
	}

	public HashMap<Intention, int[]> convertResults(Vector<Integer> intResults) {
		HashMap<Intention, int[]> map = new HashMap<Intention, int[]>();
		int[] list;
		/*for (int i : intResults) {
			Intention intention = (Intention) intentionIndex.getForward(new Integer(i));
			if (intention != null) {
				
			}
		}*/
		
		for (Object obj : intentionIndex.keySetForward()) {
			Integer integer = (Integer) obj;
			
			int index = intResults.indexOf(integer);
			
			if (index < 0) {
				index = intResults.indexOf(new Integer(integer.intValue() * -1));				
			}
			if (index >= 0) {
				list = new int[6];
				for (int i=0; i<6; i++) {
					list[i] = intResults.get(index + i).intValue();
				}
				
				map.put((Intention) intentionIndex.getForward(integer), list);
			}				
		}
		return map;
	}
	
}
