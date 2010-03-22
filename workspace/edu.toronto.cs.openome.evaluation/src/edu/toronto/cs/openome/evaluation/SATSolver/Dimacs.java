package edu.toronto.cs.openome.evaluation.SATSolver;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.OutputStream;
import java.io.File;
import java.util.HashMap;
import java.util.Vector;

import org.eclipse.core.runtime.Path;
import org.sat4j.core.VecInt;

import edu.toronto.cs.openome_model.Intention;

public class Dimacs {
	private Vector<Axioms> axioms;
		
	public Dimacs( ) {
		axioms = new Vector<Axioms>();
	}
	
	public boolean addAxioms(Axioms la) {
		//System.out.println("adding link axioms");
		if (la != null)
			return axioms.add(la);
		else
			return false;
	}
	
	public boolean containsBackward(VecInt vi) {	
		 for (Axioms la : axioms) {
			 if (la.containsBackward(vi))
				return true;		
		 }
		 return false;
	}
	
	public boolean containsForward(VecInt vi) {	
		 for (Axioms la : axioms) {
			 if (la.containsForward(vi))
				 return true;
		 }
		 return false;
	}
	
	public boolean contains(VecInt vi) {	
		 for (Axioms la : axioms) {
			 if (la.contains(vi))
				 return true;
		 }
		 return false;
	}
	
	public String writeToFile(String path) {
		
		try {
		// Create file 
	    FileWriter fstream = new FileWriter(path);
	    BufferedWriter out = new BufferedWriter(fstream);
	    
	    out.write("p cnf " + getNumVariables() + " " + getNumClauses() + "\n");
	    
	    for (Axioms la : axioms) {
	    	for (String str : la.getClauses())  {
	    		out.write(str + "\n");
	    	}
	    	//for (String str : la.getBackwardClauses())  {
	    	//	out.write(str + "\n");
	    	//}
	    }
	    
	    
	    //Close the output stream
	    out.close();
	    }catch (Exception e){//Catch exception if any
	      System.err.println("Error: " + e.getMessage());
	    }

	    return path;
	}

	public int getNumClauses() {
		int numClauses = 0;
		 for (Axioms la : axioms) {
			 numClauses += la.getNumClauses();
			 //System.out.println("numClauses: " + numClauses);
		 }
		return numClauses;
	}

	public int getNumVariables() {
		if (axioms.size() > 0) {
			return axioms.get(0).getNumVars();
		}
		else return 0;
	}

	

}
