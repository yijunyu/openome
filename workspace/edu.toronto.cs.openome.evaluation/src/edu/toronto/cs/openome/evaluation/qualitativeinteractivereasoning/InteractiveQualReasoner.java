package edu.toronto.cs.openome.evaluation.qualitativeinteractivereasoning;

import org.eclipse.swt.graphics.Image;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

import edu.toronto.cs.openome.evaluation.commands.InputWindowCommand;
import edu.toronto.cs.openome.evaluation.commands.SetQualitativeEvaluationLabelCommand;
import edu.toronto.cs.openome.evaluation.qualitativeautomaticreasoning.AutomaticQualReasoner;
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
import edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes;
import edu.toronto.cs.openome_model.impl.ModelImpl;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.common.util.EList;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.diagram.ui.commands.CreateOrSelectElementCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.commands.PopupMenuCommand;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramCommandStack;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;


import edu.toronto.cs.openome_model.EvaluationLabel;

public class InteractiveQualReasoner extends Reasoner {
	
	private LabelQueue lq;
	private SoftgoalWrappers softgoalWrappers;
	private Vector<Intention> resolvedHardIntentions;
	private DiagramCommandStack dcs;

	public InteractiveQualReasoner(ModelImpl m, CommandStack com, DiagramCommandStack d) {
		super(m, com);
		
		dcs = d;
		
		lq = new LabelQueue();
		softgoalWrappers = new SoftgoalWrappers();
		resolvedHardIntentions = new Vector<Intention>();
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
		
		while (lq.size() > 0)  {
			step1();
			
			System.out.println("Softgoals to resolve");
			
			for(IntQualIntentionWrapper w: softgoalWrappers.getSet()) {
				if (w.bagNeedResolve()) {
					System.out.println(w.getIntention().getName());
					w.printLabelBag();		
				}
			}
						
			if (!step2())
				return;
			
			System.out.println("Label Queue");
			lq.print();
			System.out.println(lq.size());
			
			//LQ Dialog for debugging
//			String [] labels = {"Ok", "Stop"};
//			Shell [] ar = PlatformUI.getWorkbench().getDisplay().getShells();
//
//			Image i = new Image(Display.getCurrent(), "C:\\face.gif");
//
//			MessageDialog outputD = new MessageDialog(ar[0], "Label Queue", i, lq.toString(), 0, labels, 0);
//			
//			outputD.open();
			
		}
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
						iqi.addtoLabelBag(i, initvalue);
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
		
		//System.out.println(starting_size);
		
		
		
		for (int i = 0; i < starting_size; i++) {
			//System.out.println("At: " + i);
			
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
			
			propagateDependencies(current);
			
		}
	}
	
	private void propagateContributions(Intention intention) {
		//System.out.println("propagate Contributions for " + intention.getName());
		for (Contribution c: intention.getContributesTo())  {
			Intention target = c.getTarget();
			
			//System.out.println("Target: " + target.getName());
			
			//System.out.println(softgoalsToResolve.size());
			
			EvaluationLabel result = applyContributionRules(c, intention.getQualitativeReasoningCombinedLabel());
			
			//System.out.println("Result: " + result.getName());
			
			addSoftgoalToResolve(target, intention, result);			
		}
	}
	
	private void addSoftgoalToResolve(Intention target, Intention source, EvaluationLabel result) {
		IntQualIntentionWrapper targetWrapper = null;
		
		//find existing wrapper in the list of softgoals to resolve, if there is one
		try {
			targetWrapper = softgoalWrappers.findIntention(target);
			
		}
		catch (Exception e) {
			System.out.println("Find Intention exception");
		}
		
		if (targetWrapper == null)
			targetWrapper = new IntQualIntentionWrapper(target);
		else
			System.out.println("Found wrapper: " + targetWrapper.getIntention().getName());
		
		try {
			targetWrapper.addtoLabelBag(source, result);
		}
		catch (Exception e) {
			System.out.println("Can't add to bag");
		}
		
		//will only add it if it's not already there, as it's a Set
		try {
			softgoalWrappers.add(targetWrapper);				
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
		//System.out.println("Propagating Decompositions for " + intention.getName());
		for (Decomposition d: intention.getDecompositionsFrom()) {
			Intention target = d.getTarget();			
			if (!resolvedHardIntentions.contains(target)) {
				//System.out.println("Finding label for " + target.getName());
				resolvedHardIntentions.add(target);			
				resolveDecompositionsAndDependencies(target, intention);		
			}
		}
	}
	
	private void propagateDependencies(Intention intention) {
		//System.out.println("Propagating Dependencies for " + intention.getName());
		for (Dependency d: intention.getDependencyTo()) {
			Dependable dependable = d.getDependencyTo();
			if (!(dependable instanceof Container)) {
				if (!resolvedHardIntentions.contains(dependable)) {
					//System.out.println("Finding label for " + ((Intention) dependable).getName());
					resolveDecompositionsAndDependencies((Intention) dependable, intention);
					resolvedHardIntentions.add((Intention) dependable);	
				}
				
			}
		}
	}
	
	private void resolveDecompositionsAndDependencies(Intention target, Intention source){
		EvaluationLabel result;
		
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
		//System.out.println(ANDDecomps.toString());
		//System.out.println(ORDecomps.toString());
		
		Vector<EvaluationLabel> dependencies = new Vector<EvaluationLabel>();
		for (Dependency dep: target.getDependencyFrom()) {
			Dependable dependable = dep.getDependencyFrom();
			
			if (!(dependable instanceof Container)) {
				result = ((Intention) dependable).getQualitativeReasoningCombinedLabel();
				dependencies.add(result);
				
				if (target instanceof Softgoal) {
					addSoftgoalToResolve(target, (Intention) dependable, result);
				}
			}
		}
				
		//System.out.println(dependencies.toString());
		//System.out.println(ANDDecomps.size() + ", " + ORDecomps.size() + ", " + dependencies.size());
		
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
		
		if (target instanceof Softgoal) {
			if (both.size() > 0)  {
				result = resolveAND(both);
			
				addSoftgoalToResolve(target, source, result);
			}
		}
		else {
			if (dependencies.size() > 0) {
				both.add(resolveAND(dependencies));
			}	
			
			result = resolveAND(both);
			
			setQualCombinedLabel(target, result);
			
			IntQualIntentionWrapper targetWrapper = new IntQualIntentionWrapper(target);
			
			lq.add(targetWrapper);
			
			//System.out.println(result.getName());
		}
		
	}
	
	private EvaluationLabel resolveAND(Vector<EvaluationLabel> list) {
		if (list.size() == 0)
			return EvaluationLabel.NONE;
		
		//find the smallest, start it with the biggest
		EvaluationLabel smallest = EvaluationLabel.SATISFIED;
		
		for (EvaluationLabel l: list) {
			//System.out.println("Is " + l.getName() + " less than " + smallest.getName() + "?");
			if (l.isLessThan(smallest)) {
				//System.out.println("Yes");
				smallest = l;
			}
			//else {System.out.println("No");}
		}
		
		return smallest;
	}
	
	private EvaluationLabel resolveOR(Vector<EvaluationLabel> list) {
		if (list.size() == 0)
			return EvaluationLabel.NONE;
		
		//find the biggest, start it with the smallest
		EvaluationLabel biggest = EvaluationLabel.NONE;
		
		for (EvaluationLabel l: list) {
			//System.out.println("Is " + l.getName() + " greater than " + biggest.getName() + "?");
			if (l.isGreaterThan(biggest)) {
				//System.out.println("Yes");
				biggest = l;
			}
			//else {System.out.println("No");}
		}
		
		return biggest;
	}
	
	private boolean step2() {
		System.out.println("Step 2");
		EvaluationLabel result; 
		
		for (IntQualIntentionWrapper w: softgoalWrappers.getSet())  {
			if (w.bagNeedResolve()) {
				result = applyAutomaticSoftgoalCases(w);
				
				System.out.println("Resolving: " + w.getIntention().getName());
				if (result != null) System.out.println("Automatic result: " + result.getName());
				
				if (result == null)  {				
					//get human judgement, somehow....
					//if (this instanceof AutomaticQualReasoner)
					//	result = ((AutomaticQualReasoner)this).resolveOtherCases(w);
					//else
						result = resolveOtherCases(w);
										
					
					if (result == null) {
						return false;
					}
					
				}
			
				setQualCombinedLabel(w.getIntention(), result);
								
				lq.add(w);		
				
				w.bagResolved();
			}
			
			
		}		
		return true;
		
	}
	
	private EvaluationLabel applyAutomaticSoftgoalCases(IntQualIntentionWrapper w) {
		//case 1
		if (w.bagSize() == 1) {
			IntentionLabelPair ilp = w.getFirstFromBag();
			return ilp.getEvaluationLabel();
		}
		
		//case 2 & 3		
		if (w.bagHasSatisfied() && w.isBagPositive())
			return EvaluationLabel.SATISFIED;
		if (w.bagHasDenied() && w.isBagNegative())
			return EvaluationLabel.DENIED;
		//new cases
		if (w.bagIsUnknown())
			return EvaluationLabel.UNKNOWN;
		if (w.bagIsConflict())
			return EvaluationLabel.CONFLICT;
		
		//case 4, null if it doesn't apply
		return w.findExistingResult();				
	}
	
	protected EvaluationLabel resolveOtherCases(IntQualIntentionWrapper w) {
	
		Shell [] ar = PlatformUI.getWorkbench().getDisplay().getShells();
		
	//	Shell theShell = null;
											
	//	for (Shell s: ar) {
	//		System.out.println(s.toString());
	//		if (s.isFocusControl())  {
	//			theShell = s;
	//			System.out.println("Focus: " + s.toString());
	//		}
	//		
	//	}
		
		InputWindowCommand wincom = new InputWindowCommand(ar[0], w);
							
		cs.execute(wincom);
		
		if (wincom.cancelled()) {
			return null;
		}
		
		EvaluationLabel result = wincom.getEvalResult();		
		
		w.addHumanJudgement(result);
		
		System.out.println("Human Judgement result: " + result.getName());
		
		return result;
	
	}
	
	
}
