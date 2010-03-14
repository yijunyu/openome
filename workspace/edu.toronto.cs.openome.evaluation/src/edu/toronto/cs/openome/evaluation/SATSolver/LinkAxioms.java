package edu.toronto.cs.openome.evaluation.SATSolver;

import java.util.Vector;

import org.sat4j.core.VecInt;

import edu.toronto.cs.openome_model.Intention;
import edu.toronto.cs.openome_model.Link;
import edu.toronto.cs.openome_model.UnknownContribution;

public class LinkAxioms {
	
	private Vector<Link> sourceLinks;
	private Vector<Link> targetLinks;
	private VecInt clauses;
	
	public LinkAxioms(Vector<Link> sources, Vector<Link> targets) {
		sourceLinks = sources;
		targetLinks = targets;
		createClauses();
	
	}

	private void createClauses() {
		// TODO Auto-generated method stub
		
	}

	
}
