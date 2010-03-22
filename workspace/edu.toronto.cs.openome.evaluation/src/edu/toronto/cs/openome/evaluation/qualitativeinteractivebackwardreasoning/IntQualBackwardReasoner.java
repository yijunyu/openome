package edu.toronto.cs.openome.evaluation.qualitativeinteractivebackwardreasoning;

import java.util.HashMap;
import java.util.Vector;

import org.eclipse.emf.common.command.CommandStack;

import edu.toronto.cs.openome.evaluation.SATSolver.Dimacs;
import edu.toronto.cs.openome.evaluation.SATSolver.ModeltoAxiomsConverter;
import edu.toronto.cs.openome.evaluation.SATSolver.zChaffSolver;
import edu.toronto.cs.openome.evaluation.qualitativeinteractivereasoning.SoftgoalWrappers;
import edu.toronto.cs.openome.evaluation.reasoning.Reasoner;
import edu.toronto.cs.openome_model.EvaluationLabel;
import edu.toronto.cs.openome_model.Intention;
import edu.toronto.cs.openome_model.impl.ModelImpl;

public class IntQualBackwardReasoner extends Reasoner {
	//Some extra info needs to be stored with softgoals, so we have a wrapper class, and we have another class
	//which stores a list of these wrappers, this is that class
	private SoftgoalWrappers softgoalWrappers;
	
	
	/**
	 * @author jenhork
	 * Constructor, takes in a ModelImpl (how the model is stored) a CommandStack, to execute commands, also a diagram Command stack
	 */
	public IntQualBackwardReasoner(ModelImpl m, CommandStack com) {
		super(m, com);
		
		softgoalWrappers = new SoftgoalWrappers();
	}
	
	/**
	 * @author jenhork
	 * The major method for qualitative, interactive reasoning.  This is like the "main" method.  Where most of the
	 * stuff starts from.
	 */
	public void reason() {
		//DEBUGGING stuff, delete eventually
		
		System.out.println("Qualitative Interactive Backward Reasoning - !yohA");
		
		//First, translate the model into a form that the SAT solver can read
		
		zChaffSolver solver = new zChaffSolver();
		Dimacs cnf = new Dimacs();
		
		ModeltoAxiomsConverter converter = new ModeltoAxiomsConverter(model);
				
		cnf = converter.convertBothDirections();
		//cnf = converter.convertForward();
		//cnf = converter.convertBackward();
		
		System.out.println("Done conversion");
		
		int result = solver.solve(cnf);		
		
		Vector<Integer> intResults = solver.getResults();
		
		if (result >= 0) {
		
			HashMap<Intention, int[]> results = converter.convertResults(intResults);
		
			System.out.println("Results HashMap");
			//System.out.println(intResults.size());
			for (Intention intention : results.keySet()) {
				System.out.println(intention.getName());
				int [] ints = results.get(intention);
				for (int i : ints) {
					System.out.print(i + " ");
				}
				System.out.println("");
			
			}
			
			displayResults(results);			
		}
		else {
			System.out.println("zChaff failed");
		}
		
	
		//cnf = converter.convertForward();
		
		//solver.solve(cnf);
		
		//cnf = converter.convertBackward();
		
		//solver.solve(cnf);
		
	}
	
	private void displayResults(HashMap<Intention, int[]> results) {
		for (Intention intention : results.keySet()) {
			System.out.println(intention.getName());
			int [] ints = results.get(intention);
			
			if (ints[0] > 0 & (ints[2] < 0 & ints[3] < 0 & ints[4] < 0 & ints[5] < 0)) {
				setQualCombinedLabel(intention, EvaluationLabel.SATISFIED);
			}
			
			else if (ints[1] > 0 & (ints[0] < 0 & ints[2] < 0 & ints[3] < 0 & ints[4] < 0 & ints[5] < 0)) {
				setQualCombinedLabel(intention, EvaluationLabel.WEAKLY_SATISFIED);
			}
			
			else if (ints[2] > 0 & (ints[0] < 0 & ints[1] < 0 & ints[3] < 0 & ints[4] < 0 & ints[5] < 0)) {
				setQualCombinedLabel(intention, EvaluationLabel.UNKNOWN);
			}
			
			else if (ints[3] > 0 & (ints[0] < 0 & ints[1] < 0 & ints[2] < 0 & ints[4] < 0 & ints[5] < 0)) {
				setQualCombinedLabel(intention, EvaluationLabel.CONFLICT);
			}
			
			else if (ints[4] > 0 & (ints[0] < 0 & ints[1] < 0 & ints[2] < 0 & ints[3] < 0 & ints[5] < 0)) {
				setQualCombinedLabel(intention, EvaluationLabel.WEAKLY_DENIED);
			}
			
			else if (ints[5] > 0 & (ints[0] < 0 & ints[1] < 0 & ints[2] < 0 & ints[3] < 0 & ints[4] < 0)) {
				setQualCombinedLabel(intention, EvaluationLabel.DENIED);
			}
			else {
				setQualCombinedLabel(intention, EvaluationLabel.CONFLICT);
			}
		}
	}
	
	public SoftgoalWrappers getSoftgoalWrappers(){
		return softgoalWrappers;
	}

}
