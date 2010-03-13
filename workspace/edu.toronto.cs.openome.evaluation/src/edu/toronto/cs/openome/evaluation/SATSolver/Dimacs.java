package edu.toronto.cs.openome.evaluation.SATSolver;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.OutputStream;
import java.io.File;

import org.eclipse.core.runtime.Path;

public class Dimacs {
	
	public Dimacs( ) {
		
	}
	
	public String writeToFile(String homedir) {
		String path = homedir + "dimacs.cnf";
		try {
		// Create file 
	    FileWriter fstream = new FileWriter(path);
	    BufferedWriter out = new BufferedWriter(fstream);
	    
	    out.write("Hello Java");
	    
	    //Close the output stream
	    out.close();
	    }catch (Exception e){//Catch exception if any
	      System.err.println("Error: " + e.getMessage());
	    }

	    return path;
	}

}
