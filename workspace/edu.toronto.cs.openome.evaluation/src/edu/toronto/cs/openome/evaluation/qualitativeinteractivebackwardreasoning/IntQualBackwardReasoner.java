package edu.toronto.cs.openome.evaluation.qualitativeinteractivebackwardreasoning;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.Vector;

import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramCommandStack;

import edu.toronto.cs.openome.evaluation.SATSolver.Dimacs;
import edu.toronto.cs.openome.evaluation.SATSolver.SATSolver;
import edu.toronto.cs.openome.evaluation.SATSolver.zChaffSolver;
import edu.toronto.cs.openome.evaluation.qualitativeinteractivereasoning.LabelQueue;
import edu.toronto.cs.openome.evaluation.qualitativeinteractivereasoning.SoftgoalWrappers;
import edu.toronto.cs.openome.evaluation.reasoning.Reasoner;
import edu.toronto.cs.openome.evaluation.reasoning.Reasoning;
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
		
		solver.solve(cnf);
		
		try	{
			Runtime rt = Runtime.getRuntime() ;
	
		    Process p = rt.exec("Solvers\\zchaff.exe Solvers\\excnf.txt");
		    //p.waitFor();

		    InputStream in = p.getInputStream();
		    OutputStream out = p.getOutputStream ();
		    InputStream err = p.getErrorStream();
		    String line;

		    BufferedReader input =
		        new BufferedReader
		          (new InputStreamReader(p.getInputStream()));
		    	
		      while ((line = input.readLine()) != null) {
		        System.out.println(line);
		      }
		      
		      BufferedReader error =
			        new BufferedReader
			          (new InputStreamReader(p.getErrorStream()));
			    	
			      while ((line = error.readLine()) != null) {
			        System.out.println(line);
			      }
		   
		      input.close();

		      //do whatever you want
		   //some more code
		    p.destroy() ;
		 }
		catch(Exception exc){
			
			 /*handle exception*/
			 }
	}
	
	public SoftgoalWrappers getSoftgoalWrappers(){
		return softgoalWrappers;
	}

}
