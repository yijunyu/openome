package edu.toronto.cs.openome.evaluation.SATSolver;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Vector;

import edu.toronto.cs.openome_model.Intention;

public class zChaffSolver extends SATSolver{
	/**
	 * @author jenhork
	 * This is where the reasoning actually occurs; however, it should be overridden by it's childen, as this is a general type of reasoner. 
	 * It's not clear what the parent reasoner should do.
	 */
	public Vector<Integer> solve(Dimacs cnf) {
		String path = cnf.writeToFile(homedir + filename);
		System.out.println(path);
		
		try	{
			System.out.println("Trying to run solver");
			Runtime rt = Runtime.getRuntime() ;
	
		    Process p = rt.exec(homedir + "zchaff.exe " + homedir + filename);
		    //p.waitFor();

		    String line;
		    String[] vars;// = new String[cnf.getNumVariables() + 3];
		    boolean SAT = false;

		    System.out.println("Solver output:");
		    BufferedReader input =
		        new BufferedReader
		          (new InputStreamReader(p.getInputStream()));
		    	
		      while ((line = input.readLine()) != null) {
		    	  System.out.println(line);
		    	  if (line.startsWith("Instance Satisfiable")) {
		    		  line = input.readLine();
		    		  System.out.println(line);
		    		  vars = line.split(" ");
		    		  SAT = true;
		    		  //System.out.println(vars.length);
		    		// for (String str : vars) {
		    		//	 System.out.println(str);
		    		// }
		    		  return convertToInts(vars, cnf.getNumVariables());
		    	  }
		    	  if (line.startsWith("Instance Unsatisfiable")) {
		    		  SAT = false;
		    		  return null;
		    	  }
		        
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
		return null;
		
	}

	private Vector<Integer> convertToInts(String[] vars, int num) {
		//System.out.println("ConvertToInts");
		Vector<Integer> ints = new Vector<Integer>();
		
		for (int index = 0; index < num; index++) {
			ints.add(index, Integer.parseInt(vars[index]));
		}
		return ints;
	}
	

}
