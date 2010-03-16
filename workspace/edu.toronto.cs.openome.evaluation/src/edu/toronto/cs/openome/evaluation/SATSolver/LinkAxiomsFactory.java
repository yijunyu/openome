package edu.toronto.cs.openome.evaluation.SATSolver;

import java.util.Vector;

import edu.toronto.cs.openome_model.Intention;
import edu.toronto.cs.openome_model.Link;

public class LinkAxiomsFactory {

	public LinkAxioms createLinkAxiom(Vector<Intention> sources, Intention targ, Vector<Link> l, String type, DualHashMap<Integer, Intention> dhm) {
		if (type.equals("Dependency")) {
			DependencyLinkAxioms dla = new DependencyLinkAxioms(sources, targ, l, dhm);
			dla.createClauses();
			return dla;
		}
		
		return null;
	}
}
