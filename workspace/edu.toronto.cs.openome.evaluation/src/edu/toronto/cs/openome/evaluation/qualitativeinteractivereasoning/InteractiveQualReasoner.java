package edu.toronto.cs.openome.evaluation.qualitativeinteractivereasoning;

import edu.toronto.cs.openome.evaluation.reasoning.Reasoner;
import edu.toronto.cs.openome_model.Intention;
import edu.toronto.cs.openome_model.Softgoal;
import edu.toronto.cs.openome_model.impl.ModelImpl;
import org.eclipse.emf.common.command.CommandStack;
import edu.toronto.cs.openome_model.EvaluationLabel;

public class InteractiveQualReasoner extends Reasoner {
	
	private LabelQueue lq;

	public InteractiveQualReasoner(ModelImpl m, CommandStack com) {
		super(m, com);
		
		lq = new LabelQueue();
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
		
		lq.print();
				
//		while (lq.size() > 0)  {
			step1();
		
			step2();
//		}
	}
	
	/*
	 * This looks through all the intentions and finds the ones with evaluation labels.  They must be propagated
	 * so the intention is added to the label queue.
	 */
	public void initLabelQueue() {
		for (Intention i : model.getAllIntentions()) {
			EvaluationLabel initvalue = i.getQualitativeReasoningCombinedLabel();
			
			if (initvalue != EvaluationLabel.NONE) {
								
				IntQualIntentionWrapper iqi = new IntQualIntentionWrapper(i);
								
				if (!lq.offer(iqi))		{	
					System.out.println("Cannot add to label queue");
					return;
				}				
							
				//store the initial value separately from the actual value of the intention
				iqi.setInitialEvaluationLable(initvalue);	
				
				if (i instanceof Softgoal) {
					iqi.lb.addToBag(null, initvalue);
				}
			}						
		}
	}
	
	private void step1() {
		System.out.println("Step 1");
		
		
		
	}
	
	private void step2() {
		System.out.println("Step 2");
		
	}
}
