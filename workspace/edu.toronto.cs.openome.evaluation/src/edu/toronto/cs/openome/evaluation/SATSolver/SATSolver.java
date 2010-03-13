/**
 * 
 */
package edu.toronto.cs.openome.evaluation.SATSolver;

import org.eclipse.emf.common.command.CommandStack;

import edu.toronto.cs.openome.evaluation.commands.SetQualitativeEvaluationLabelCommand;
import edu.toronto.cs.openome_model.EvaluationLabel;
import edu.toronto.cs.openome_model.Intention;
import edu.toronto.cs.openome_model.impl.ModelImpl;

/**
 * @author jenhork
 * The parent reasoner class, defines the possible actions that all reasoners must have.
 * This class also holds the ModelImplementation and CommandStack that all reasoners will need to communicate with the model
 * 
 *
 */
public class SATSolver {
	Dimacs cnf;
	static String homedir = "Solvers\\";
		//"C:\\zChaffWorkspace\\zChaff\\";
	
	/**
	 * @author jenhork
	 * Default constructor, does nothing
	 */
	public SATSolver() {
		
	}
				
	/**
	 * @author jenhork
	 * This is where the reasoning actually occurs; however, it should be overridden by it's childen, as this is a general type of reasoner. 
	 * It's not clear what the parent reasoner should do.
	 */
	public void solve(Dimacs c) {
		//This one does nothing, should be overridden
	}
	
		
}
