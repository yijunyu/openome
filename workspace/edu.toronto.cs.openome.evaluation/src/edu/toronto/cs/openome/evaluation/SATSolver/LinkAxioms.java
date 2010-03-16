package edu.toronto.cs.openome.evaluation.SATSolver;

import java.util.Vector;

import org.sat4j.core.VecInt;

import edu.toronto.cs.openome_model.Intention;
import edu.toronto.cs.openome_model.Link;
import edu.toronto.cs.openome_model.UnknownContribution;

public class LinkAxioms {
	
	protected Vector<Intention> sourceInts;
	protected Intention target;
	protected Vector<Link> links;
	protected Vector<VecInt> forwardClauses;
	protected Vector<VecInt> backwardClauses;
	protected DualHashMap<Integer, Intention> intentionMap;
	
	public LinkAxioms(Vector<Intention> sources, Intention targ, Vector<Link> l, DualHashMap<Integer, Intention> dhm) {
		sourceInts = sources;
		target = targ;
		links = l;
		forwardClauses = new Vector<VecInt>();	
		backwardClauses = new Vector<VecInt>();		
		intentionMap = dhm;
	}
	
	public void createClauses() {
		// TODO Auto-generated method stub
		
	}
	
	public int getNumClauses() {
		return forwardClauses.size() + backwardClauses.size();
	}
	
	public Vector<String> getForwardClauses() {
		Vector<String> strForClauses = new Vector<String>();
		
		for (VecInt vi : forwardClauses)  {
			String str = "";
			for (int i : vi.toArray()) {
				str += String.valueOf(i) + " ";
			}
			strForClauses.add(str);
		}
		
		return strForClauses;
	}
	
	public Vector<String> getBackwardClauses() {
		Vector<String> strBackClauses = new Vector<String>();
		
		for (VecInt vi : backwardClauses)  {
			String str = "";
			for (int i : vi.toArray()) {
				str += String.valueOf(i) + " ";
			}
			strBackClauses.add(str);
		}
		
		return strBackClauses;
	}

	
}
