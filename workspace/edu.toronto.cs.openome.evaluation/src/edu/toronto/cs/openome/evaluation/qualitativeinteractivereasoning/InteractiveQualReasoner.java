package edu.toronto.cs.openome.evaluation.qualitativeinteractivereasoning;

import java.util.Iterator;
import java.util.Vector;

import edu.toronto.cs.openome.evaluation.reasoning.Reasoner;
import edu.toronto.cs.openome_model.AndDecomposition;
import edu.toronto.cs.openome_model.BreakContribution;
import edu.toronto.cs.openome_model.Container;
import edu.toronto.cs.openome_model.Contribution;
import edu.toronto.cs.openome_model.Decomposition;
import edu.toronto.cs.openome_model.Dependable;
import edu.toronto.cs.openome_model.Dependency;
import edu.toronto.cs.openome_model.HelpContribution;
import edu.toronto.cs.openome_model.HurtContribution;
import edu.toronto.cs.openome_model.Intention;

import edu.toronto.cs.openome_model.OrDecomposition;
import edu.toronto.cs.openome_model.Softgoal;
import edu.toronto.cs.openome_model.UnknownContribution;
import edu.toronto.cs.openome_model.impl.ModelImpl;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.common.util.EList;


import edu.toronto.cs.openome_model.EvaluationLabel;

public class InteractiveQualReasoner extends Reasoner {
	
	private LabelQueue lq;
	private SoftgoalsToResolve softgoalsToResolve;
	private Vector<Intention> resolvedHardIntentions;

	public InteractiveQualReasoner(ModelImpl m, CommandStack com) {
		super(m, com);
		
		lq = new LabelQueue();
		softgoalsToResolve = new SoftgoalsToResolve();
		resolvedHardIntentions = null;
	}
	
	public void reason() {
		System.out.println("Qualitative Interactive Reasoning - Ahoy!");
//		for (Intention i : model.getAllIntentions()) {
//									
//			System.out.println(i.getName());
//			
//			setQualCombinedLabel(i, EvaluationLabel.SATISFIED);
//						
//		}
		
		initLabelQueue();
		
		System.out.println("Label Queue");
		lq.print();
				
//		while (lq.size() > 0)  {
			step1();
			
			System.out.println("Softgoals to resolve");
			
			for(IntQualIntentionWrapper w: softgoalsToResolve.getSet()) {
				System.out.println(w.getIntention().getName());
				w.lb.printBag();			
			}
			
			System.out.println("Label Queue");
			lq.print();
			
			step2();
//		}
	}
	
	/*
	 * This looks through all the intentions and finds the ones with evaluation labels.  They must be propagated
	 * so the intention is added to the label queue.
	 */
	private void initLabelQueue() {
		System.out.println("Init");
		for (Intention i : model.getAllIntentions()) {
			EvaluationLabel initvalue = i.getQualitativeReasoningCombinedLabel();
	
			if (initvalue != EvaluationLabel.NONE) {
			
				IntQualIntentionWrapper iqi = new IntQualIntentionWrapper(i);
								
				if (!lq.offer(iqi))		{	
					System.out.println("Cannot add to label queue");
					return;
				}				
						
				//store the initial value separately from the actual value of the intention
				iqi.setInitialEvaluationLabel(initvalue);	
				
				if (i instanceof Softgoal) {
					try {
						//For initial values, the source element in the label bag is the element itself
						iqi.lb.addToBag(i, initvalue);
					}
					catch (Exception e) {
						System.out.println("couldn't add to bag");
					}
				}
			}						
		}
	}
	
	private void step1() {
		System.out.println("Step 1");
		
		int starting_size = lq.size();
		
		System.out.println(starting_size);
		
		resolvedHardIntentions = new Vector<Intention>();
		
		for (int i = 0; i < starting_size; i++) {
			System.out.println("At: " + i);
			
			IntQualIntentionWrapper currWrapper = null;
			
			try {
				currWrapper = lq.poll();
			}
			catch (Exception e) {
				System.out.println("Couldn't poll label queue");
				return;
			}
			
			Intention current = currWrapper.getIntention();
			
			System.out.println("propagating for " + current.getName());
			
			propagateContributions(current);
			
			propagateDecompositions(current);
			
			//propagateDependencies(current);
			
		}
	}
	
	private void propagateContributions(Intention intention) {
		//System.out.println("propagate Contributions for " + intention.getName());
		for (Contribution c: intention.getContributesTo())  {
			Intention target = c.getTarget();
			
			//System.out.println("Target: " + target.getName());
			
			//System.out.println(softgoalsToResolve.size());
			
			IntQualIntentionWrapper targetWrapper = null;
			
			try {
				targetWrapper = softgoalsToResolve.findIntention(target);
			}
			catch (Exception e) {
				System.out.println("Find Intention exception");
			}
			
			if (targetWrapper == null)
				targetWrapper = new IntQualIntentionWrapper(target);
			
			EvaluationLabel result = applyContributionRules(c, intention.getQualitativeReasoningCombinedLabel());
			
			//System.out.println("Result: " + result.getName());
			
			try {
				targetWrapper.lb.addToBag(intention, result);
			}
			catch (Exception e) {
				System.out.println("Can't add to bag");
			}
			
			//will only add it if it's not already there, as it's a Set
			try {
				softgoalsToResolve.add(targetWrapper);	
				
			}
			catch (Exception e) {
				System.out.println("Can't add to list of softgoals to resolve");
				if (e instanceof UnsupportedOperationException)
					System.out.println("unsupported operation");
				if (e instanceof NullPointerException)
					System.out.println("NullPointerException");
				if (e instanceof ClassCastException)
					System.out.println("ClassCastException");
				if (e instanceof IllegalArgumentException)
					System.out.println("IllegalArgumentException");
			}
		}
	}
	
	private EvaluationLabel applyContributionRules(Contribution c, EvaluationLabel l) {	
		if (l == EvaluationLabel.UNKNOWN || l == EvaluationLabel.CONFLICT)
			return l;
		
		if (c instanceof HelpContribution) {
			if (l == EvaluationLabel.SATISFIED || l == EvaluationLabel.WEAKLY_SATISFIED)
				return EvaluationLabel.WEAKLY_SATISFIED;
			if (l == EvaluationLabel.DENIED || l == EvaluationLabel.WEAKLY_DENIED) {
				return EvaluationLabel.WEAKLY_DENIED;
			}			
		}
		
		if (c instanceof UnknownContribution)
			return EvaluationLabel.UNKNOWN;
		
		if (c instanceof HurtContribution) {
			if (l == EvaluationLabel.SATISFIED || l == EvaluationLabel.WEAKLY_SATISFIED) {
				return EvaluationLabel.WEAKLY_DENIED;
			}
			if (l == EvaluationLabel.DENIED || l == EvaluationLabel.WEAKLY_DENIED) {
				return EvaluationLabel.WEAKLY_SATISFIED;
			}
		}
		
		if (c instanceof BreakContribution) {
			if (l == EvaluationLabel.WEAKLY_SATISFIED) {
				return EvaluationLabel.WEAKLY_DENIED;
			}
			if (l == EvaluationLabel.SATISFIED) {
				return EvaluationLabel.DENIED;
			}
			if (l == EvaluationLabel.WEAKLY_DENIED || l == EvaluationLabel.DENIED) {
				return EvaluationLabel.WEAKLY_SATISFIED;
			}			
		}
		
		//it's a MakeContribution
		return l;
	}
	
	private void propagateDecompositions(Intention intention) {
		System.out.println("Propagating Decompositions for " + intention.getName());
		for (Decomposition d: intention.getDecompositionsFrom()) {
			Intention target = d.getTarget();			
			if (!resolvedHardIntentions.contains(target)) {
				System.out.println("Finding label for " + target.getName());
				resolvedHardIntentions.add(target);			
				resolveDecompositionsAndDependencies(target);		
			}
		}
	}
	
	private void propagateDependencies(Intention intention) {
		for (Dependency d: intention.getDependencyFrom()) {
			Dependable dependable = d.getDependencyTo();
			
			if (!(dependable instanceof Container)) {
				resolveDecompositionsAndDependencies((Intention) dependable);
			}
		}
	}
	
	private void resolveDecompositionsAndDependencies(Intention target){
		IntQualIntentionWrapper targetWrapper = new IntQualIntentionWrapper(target);
		
		Vector<EvaluationLabel> ANDDecomps = new Vector<EvaluationLabel>();
		Vector<EvaluationLabel> ORDecomps = new Vector<EvaluationLabel>();
						
		for (Decomposition dc: target.getDecompositionsTo()) {
			if (dc instanceof AndDecomposition) {
				ANDDecomps.add(dc.getSource().getQualitativeReasoningCombinedLabel());
			}
			if (dc instanceof OrDecomposition) {
				ORDecomps.add(dc.getSource().getQualitativeReasoningCombinedLabel());
			}
		}
		System.out.println(ANDDecomps.toString());
		System.out.println(ORDecomps.toString());
		
		Vector<EvaluationLabel> dependencies = new Vector<EvaluationLabel>();
		for (Dependency dep: target.getDependencyFrom()) {
			Dependable dependable = dep.getDependencyTo();
			
			if (!(dependable instanceof Container)) {
				dependencies.add(((Intention) dependable).getQualitativeReasoningCombinedLabel());
			}
		}
				
		System.out.println(dependencies.toString());
		System.out.println(ANDDecomps.size() + ", " + ORDecomps.size() + ", " + dependencies.size());
		
		//An element probably shouldn't have both an AND and an OR Decomposition, doesn't
		//make much sense, but, in case it does, I will do something.  I will AND the results
		//of both as long as they are not NONE
		Vector<EvaluationLabel> both = new Vector<EvaluationLabel>();
		
		if (ANDDecomps.size() > 0) {
			both.add(resolveAND(ANDDecomps));			
		}
		if (ORDecomps.size() > 0) {
			both.add(resolveOR(ORDecomps));
		}
		if (dependencies.size() > 0) {
			both.add(resolveAND(dependencies));
		}		
		
		EvaluationLabel result = resolveAND(both);
		System.out.println(result.getName());
		
		setQualCombinedLabel(target, result);
		
		lq.add(targetWrapper);
	}
	
	private EvaluationLabel resolveAND(Vector<EvaluationLabel> list) {
		if (list.size() == 0)
			return EvaluationLabel.NONE;
		
		//find the smallest, start it with the biggest
		EvaluationLabel smallest = EvaluationLabel.SATISFIED;
		
		for (EvaluationLabel l: list) {
			System.out.println("Is " + l.getName() + " less than " + smallest.getName() + "?");
			if (l.isLessThan(smallest)) {
				System.out.println("Yes");
				smallest = l;
			}
			else {System.out.println("No");}
		}
		
		return smallest;
	}
	
	private EvaluationLabel resolveOR(Vector<EvaluationLabel> list) {
		if (list.size() == 0)
			return EvaluationLabel.NONE;
		
		//find the biggest, start it with the smallest
		EvaluationLabel biggest = EvaluationLabel.NONE;
		
		for (EvaluationLabel l: list) {
			System.out.println("Is " + l.getName() + " greater than " + biggest.getName() + "?");
			if (l.isGreaterThan(biggest)) {
				System.out.println("Yes");
				biggest = l;
			}
			else {System.out.println("No");}
		}
		
		return biggest;
	}
	
	private void step2() {
		System.out.println("Step 2");
		
	}
}
