package edu.toronto.cs.openome.evaluation.qualitativeinteractivebackwardreasoning;

import java.util.HashMap;
import java.util.Vector;

import org.eclipse.emf.common.command.CommandStack;

import edu.toronto.cs.openome.evaluation.SATSolver.Dimacs;
import edu.toronto.cs.openome.evaluation.SATSolver.ModeltoAxiomsConverter;
import edu.toronto.cs.openome.evaluation.SATSolver.zChaffSolver;
import edu.toronto.cs.openome.evaluation.qualitativeinteractivereasoning.SoftgoalWrappers;
import edu.toronto.cs.openome.evaluation.reasoning.Reasoner;
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
		
		//cnf = converter.convertBothDirections();
		//cnf = converter.convertForward();
		cnf = converter.convertBackward();
		
		Vector<Integer> intResults = solver.solve(cnf);
		
		HashMap<Intention, int[]> results = converter.convertResults(intResults);
		
		System.out.println("Results HashMap");
		for (Intention intention : results.keySet()) {
			System.out.println(intention.getName());
			int [] ints = results.get(intention);
			for (int i : ints) {
				System.out.print(i + " ");
			}
			System.out.println("");
			
		}
		
		//cnf = converter.convertForward();
		
		//solver.solve(cnf);
		
		//cnf = converter.convertBackward();
		
		//solver.solve(cnf);
		
	}
	
	public SoftgoalWrappers getSoftgoalWrappers(){
		return softgoalWrappers;
	}

}
