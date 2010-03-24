package edu.toronto.cs.openome.evaluation.SATSolver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Vector;

import edu.toronto.cs.openome_model.AndDecomposition;
import edu.toronto.cs.openome_model.BreakContribution;
import edu.toronto.cs.openome_model.Container;
import edu.toronto.cs.openome_model.Contribution;
import edu.toronto.cs.openome_model.Decomposition;
import edu.toronto.cs.openome_model.Dependable;
import edu.toronto.cs.openome_model.Dependency;
import edu.toronto.cs.openome_model.EvaluationLabel;
import edu.toronto.cs.openome_model.HelpContribution;
import edu.toronto.cs.openome_model.HurtContribution;
import edu.toronto.cs.openome_model.Intention;
import edu.toronto.cs.openome_model.Link;
import edu.toronto.cs.openome_model.MakeContribution;
import edu.toronto.cs.openome_model.OrDecomposition;
import edu.toronto.cs.openome_model.SomeMinusContribution;
import edu.toronto.cs.openome_model.SomePlusContribution;
import edu.toronto.cs.openome_model.UnknownContribution;
import edu.toronto.cs.openome_model.impl.ModelImpl;
import edu.toronto.cs.openome_model.Intention;

public class ModeltoAxiomsConverter {
	ModelImpl model;
	Dimacs cnf;
	Vector<Link> done;
	AxiomsFactory axiomsFactory;
	DualHashMap<Integer, Intention> intentionIndex;
	
	public ModeltoAxiomsConverter(ModelImpl m) {
		model = m;
		intentionIndex = new DualHashMap<Integer, Intention>();
		createIntentionIndex();
		cnf = new Dimacs();
		done = new Vector<Link>();
		axiomsFactory = new AxiomsFactory();
	}
	
	private void createIntentionIndex() {
		int sixCount = 1;
		//System.out.println("creating intentionIndex");
		for (Intention i : model.getAllIntentions()) {
			//System.out.println("put: " + sixCount + ", " + i.getName());
			intentionIndex.put(new Integer(sixCount), i);
			sixCount += 6;
		}		
	}
	
	private void reset() {
		done = new Vector<Link>();
		cnf = new Dimacs();
	}
	
	public DualHashMap<Integer, Intention> getIntentionIndex() {
		return intentionIndex;
	}

	public Dimacs convertBothDirections()  {
		reset();
		convertContributions(1);
		convertDependencies(1);
		convertDecompositions(1);
		createTargets();
		createInvariants();
		createConstraints();
		
		return cnf;
	}
	
	public Dimacs convertForward() {
		reset();
		convertContributions(2);
		convertDependencies(2);
		convertDecompositions(2);
		createTargets();
		createInvariants();
		createConstraints();
		
		return cnf;
	}
	
	public Dimacs convertBackward() {
		reset();
		convertContributions(3);
		convertDependencies(3);
		convertDecompositions(3);
		createTargets();
		createInvariants();
		createConstraints();
		
		return cnf;
	}

	private void convertDecompositions(int dir) {
		for (Decomposition dec : model.getDecompositions()) {
			if (!done.contains(dec)) {
				Intention target = dec.getTarget();
				System.out.println("decomposition target: " + target.getName());
				
				Vector<Link> links = new Vector<Link>();
				Vector<Intention> sources = new Vector<Intention>();
				for (Decomposition sibling: target.getDecompositionsTo()){
					//System.out.println("done " + sibling.toString());
					done.add(sibling);
					links.add(sibling);
					sources.add(sibling.getSource());
					System.out.println("decomposition source: " + sibling.getSource().getName());
				}
				LinkAxioms la = null;
				if (dec instanceof AndDecomposition)
					la = axiomsFactory.createLinkAxiom(sources, target, links, "Decomposition", intentionIndex);
				if (dec instanceof OrDecomposition) {
					//System.out.println("Ordecomp");
					la = axiomsFactory.createLinkAxiom(sources, target, links, "Means Ends", intentionIndex);
				}
					
				
				if (la != null) {
					switch (dir) {
						case 1: la.createAllClauses(); break;
						case 2: la.createForwardClauses(); break;
						case 3: la.createBackwardClauses(); break;
						default: la.createAllClauses();  break;
					}	
				}
				
				cnf.addAxioms(la);
				
			}			
			else { 
				//System.out.println("already done " + dec.toString());
				}
			
			//System.out.println("done " + dec.toString());
			done.add(dec);
						
		}		
	}	

	private void convertDependencies(int dir) {
		for (Dependency dep : model.getDependencies()) {
						
			if (!done.contains(dep)) {
				Intention sourceInt = null;
				Intention targetInt = null;	
				
				//this is the source in forward evaluation, the dependee
				Dependable source = dep.getDependencyFrom();
					
				//if it's not an actor
				if (!(source instanceof Container))  {
					//This is the target?
					sourceInt = (Intention) source;
					System.out.println("dependency to " + sourceInt.getName());
				}
				
				//this is the target in forward evaluation, the depender
				Dependable target = dep.getDependencyTo();
				
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
					//intentionIndex.print();
					LinkAxioms la = axiomsFactory.createLinkAxiom(sources, targetInt, link, "Dependency", intentionIndex);
					
					switch (dir) {
						case 1: la.createAllClauses(); break;
						case 2: la.createForwardClauses(); break;
						case 3: la.createBackwardClauses(); break;
						default: la.createAllClauses();  break;
					}
					//la.createAllClauses();
					cnf.addAxioms(la);
				}
			}
			else {
				//System.out.println("already done " + dep.toString());
				}
			
			//System.out.println("done " + dep.toString());
			done.add(dep);						
		}		
	}	

	private void convertContributions(int dir) {
		//if (c instanceof UnknownContribution)		
		
		for (Contribution cont : model.getContributions()) {
			if (!done.contains(cont)) {
							
				//this is the source in forward evaluation
				Intention source = cont.getSource();					
				
				System.out.println("contribuion from " + source.getName());
								
				//this is the target in forward evaluation
				Intention target = cont.getTarget();
					//if it's not an actor
				System.out.println("contribuion to " + target.getName());
								
				Vector<Link> links = new Vector<Link>();
				Vector<Intention> sources = new Vector<Intention>();
				for (Contribution sibling: target.getContributesFrom()){
					//System.out.println("done " + sibling.toString());
					done.add(sibling);
					links.add(sibling);
					sources.add(sibling.getSource());
					//System.out.println("contribution source: " + sibling.getSource().getName());
					/*if (sibling instanceof MakeContribution) 
						System.out.println("Make");
					if (sibling instanceof HelpContribution)
						System.out.println("Help");
					if (sibling instanceof SomePlusContribution)
						System.out.println("SomePlus");
					if (sibling instanceof UnknownContribution)
						System.out.println("Unknown");
					if (sibling instanceof SomeMinusContribution)
						System.out.println("SomeMinus");
					if (sibling instanceof HurtContribution)
						System.out.println("Hurt");
					if (sibling instanceof BreakContribution)
						System.out.println("Break");*/
				}				
							
				intentionIndex.print();
				
				LinkAxioms la = null;
				
				la = axiomsFactory.createLinkAxiom(sources, target, links, "Contribution", intentionIndex);
					
				switch (dir) {
					case 1: la.createAllClauses(); break;
					case 2: la.createForwardClauses(); break;
					case 3: la.createBackwardClauses(); break;
					default: la.createAllClauses();  break;
				}
				//la.createAllClauses();
				cnf.addAxioms(la);
				
			}
			else {
				//System.out.println("already done " + cont.toString());
				}
			
			//System.out.println("done " + cont.toString());
			done.add(cont);
						
		}
		
	}
	
	private void createConstraints() {
		for (Intention intention : model.getAllIntentions()) {
			if (intention.isLeaf()) {
				Vector<Intention> sources = new Vector<Intention>();
				sources.add(intention);
				IntentionAxioms ia = axiomsFactory.createIntentionAxiom(intention, "Constraint", intentionIndex);
			
				ia.createAllClauses(); 
						
				cnf.addAxioms(ia);	
			}
		}
		
	}

	private void createInvariants() {
		
		for (Intention intention : model.getAllIntentions()) {
			Vector<Intention> sources = new Vector<Intention>();
			sources.add(intention);
			IntentionAxioms ia = axiomsFactory.createIntentionAxiom(intention, "Invariant", intentionIndex);
			
			ia.createAllClauses(); 
						
			cnf.addAxioms(ia);			
		}
					
	}

	private void createTargets() {
		for (Intention intention : model.getAllIntentions()) {
			if (intention.getQualitativeReasoningCombinedLabel() != EvaluationLabel.NONE) {
				Vector<Intention> sources = new Vector<Intention>();
				sources.add(intention);
				IntentionAxioms ia = axiomsFactory.createIntentionAxiom(intention, "Target", intentionIndex);
			
				ia.createAllClauses(); 
						
				cnf.addAxioms(ia);		
			}
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
