package edu.toronto.cs.openome.evaluation.SATSolver;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.OutputStream;
import java.io.File;
import java.util.HashMap;
import java.util.Vector;

import org.eclipse.core.runtime.Path;

import edu.toronto.cs.openome_model.Intention;

public class Dimacs {
	private Vector<LinkAxioms> linkAxioms;
		
	public Dimacs( ) {
		linkAxioms = new Vector<LinkAxioms>();
	}
	
	public boolean addLinkAxioms(LinkAxioms la) {
		System.out.println("adding link axioms");
		return linkAxioms.add(la);
	}
	
	public String writeToFile(String path) {
		
		try {
		// Create file 
	    FileWriter fstream = new FileWriter(path);
	    BufferedWriter out = new BufferedWriter(fstream);
	    
	    out.write("p cnf " + getNumVariables() + " " + getNumClauses() + "\n");
	    
	    for (LinkAxioms la : linkAxioms) {
	    	for (String str : la.getForwardClauses())  {
	    		out.write(str + "\n");
	    	}
	    	for (String str : la.getBackwardClauses())  {
	    		out.write(str + "\n");
	    	}
	    }
	    
	    
	    //Close the output stream
	    out.close();
	    }catch (Exception e){//Catch exception if any
	      System.err.println("Error: " + e.getMessage());
	    }

	    return path;
	}

	private int getNumClauses() {
		int numClauses = 0;
		 for (LinkAxioms la : linkAxioms) {
			 numClauses += la.getNumClauses();
		 }
		return numClauses;
	}

	public int getNumVariables() {
		return linkAxioms.get(0).getNumVars();
	}

	

}
