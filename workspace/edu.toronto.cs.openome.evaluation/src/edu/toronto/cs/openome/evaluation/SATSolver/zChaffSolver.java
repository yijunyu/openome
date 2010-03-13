package edu.toronto.cs.openome.evaluation.SATSolver;

public class zChaffSolver extends SATSolver{
	/**
	 * @author jenhork
	 * This is where the reasoning actually occurs; however, it should be overridden by it's childen, as this is a general type of reasoner. 
	 * It's not clear what the parent reasoner should do.
	 */
	public void solve(Dimacs cnf) {
		String path = cnf.writeToFile(homedir);
		System.out.println(path);
	}
	

}
