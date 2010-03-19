package edu.toronto.cs.openome.evaluation.SATSolver;

import java.util.Iterator;
import java.util.Vector;

import org.sat4j.core.VecInt;
import org.sat4j.specs.IteratorInt;

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
	protected int tIndex;
	protected VecInt sourceIndexes;

	
	public LinkAxioms(Vector<Intention> sources, Intention targ, Vector<Link> l, DualHashMap<Integer, Intention> dhm) {
		sourceInts = sources;
		target = targ;
		links = l;
		forwardClauses = new Vector<VecInt>();	
		backwardClauses = new Vector<VecInt>();		
		intentionMap = dhm;
		sourceIndexes = new VecInt(sourceInts.size());
		tIndex = 0;
		
	}
	
	protected void findIndexes() {
		
		Integer intTIndex = (Integer) intentionMap.getInverse(target);
		tIndex = intTIndex.intValue();
		
		for (Intention sInt: sourceInts) {
			Integer sourceIndex = (Integer) intentionMap.getInverse(sInt);
			sourceIndexes.push(sourceIndex.intValue());			
		}
	}
	
	public void createAllClauses() {
		System.out.println("Creating Clauses");
		
		createForwardClauses();
		createBackwardClauses();	
	}
	
	public void createForwardClauses() {
		// TODO Auto-generated method stub
		
	}
	public void createBackwardClauses() {
		// TODO Auto-generated method stub
		
	}
	
	public int getNumClauses() {
		return forwardClauses.size() + backwardClauses.size();
	}
	
	public int getNumVars() {
		return intentionMap.size() * 6;
	}
	
	public Vector<String> getForwardClauses() {
		Vector<String> strForClauses = new Vector<String>();
		
		for (VecInt vi : forwardClauses)  {
			String str = "";
			IteratorInt it = vi.iterator();
			while (it.hasNext()) {			
				str += String.valueOf(it.next()) + " ";				
			}
			
			strForClauses.add(str);
		}
		
		return strForClauses;
	}
	
	public Vector<String> getBackwardClauses() {
		Vector<String> strBackClauses = new Vector<String>();
		
		for (VecInt vi : backwardClauses)  {
			String str = "";
			IteratorInt it = vi.iterator();
			while (it.hasNext()) {			
				str += String.valueOf(it.next()) + " ";				
			}
			
			strBackClauses.add(str);
		}
		
		return strBackClauses;
	}
	
	protected Vector<VecInt> addAndImplication(VecInt ind1, int ind2) {
		VecInt output = new VecInt(ind1.size() + 2);
		for (int i : ind1.toArray()) {
			output.push(i * -1);
		}		
		output.push(ind2);
		output.push(0);
		Vector<VecInt> v = new Vector<VecInt>();
		v.add(output);
		
		return v;
	}
	
	protected Vector<VecInt> addAndImplication(int ind1, VecInt ind2) {
		Vector<VecInt> v = new Vector<VecInt>();
		VecInt output;
		
		for (int i: ind2.toArray()) {
			output = new VecInt(2);
			output.push(ind1 * -1);
			output.push(i);
			output.push(0);
			v.add(output);
		}
		
		return v;
	}
	
	protected Vector<VecInt> addAndImplication(int ind1, int ind2) {
		VecInt output = new VecInt(3);
		output.push(ind1 * -1);	
		output.push(ind2);
		output.push(0);
		Vector<VecInt> v = new Vector<VecInt>();
		v.add(output);
		return v;
	}
	
	protected VecInt incrementAll(VecInt input) {
		VecInt output = new VecInt(input.size());
		for (int i : input.toArray()) {
			output.push(i + 1);
		}
		return output;
	}
	
	protected Vector<VecInt> allButImplicationForward(int special, int specmult, int [] normal, int normalmult) {
		Vector<VecInt> v = new Vector<VecInt>();
		int index1;
		int index2;
		VecInt vi;
		for (index1 = 0; index1 < sourceIndexes.size(); index1++) {
			vi = new VecInt();
			for (index2 = 0; index2 < sourceIndexes.size(); index2++) {			
				if (index2 == index1) {
					vi.push((sourceIndexes.get(index2) + special) * specmult * -1);
				}
				else {
					for (int n : normal) {
						vi.push((sourceIndexes.get(index2) + n) * normalmult * -1);
					}
					
				}
			}
			vi.push(tIndex+special);
			vi.push(0);
			v.add(vi);
		}
		
		return v;
	}
	
	protected Vector<VecInt> allButImplicationBackward(int special, int specmult, int [] normal, int normalmult) {
		System.out.println("allButImplicationBackward: " + special);
		Vector<VecInt> vTemp = new Vector<VecInt>();
		Vector<VecInt> v = new Vector<VecInt>();
		
		int index1;
		int index2;
		VecInt vi;
		for (index1 = 0; index1 < sourceIndexes.size(); index1++) {
			vi = new VecInt();
			vi.push((sourceIndexes.get(index1) + special) * specmult);
			for (index2 = 0; index2 < sourceIndexes.size(); index2++) {		
				if (index1 != index2) {
					for (int i: normal) {
						vi.push((sourceIndexes.get(index2) + i) * normalmult);
					}					
				}
			}
			//vi.push(0);
			vTemp.add(vi);
		}
		
		for (VecInt a : vTemp) {
			System.out.println(a.toString());
		}
		
		for (index1 = 0; index1 < vTemp.size(); index1++) {			
			for (index2 = 0; index2 < vTemp.size(); index2++) {
				if (index1 != index2) {
					VecInt vi1 = vTemp.get(index1);
					VecInt vi2 = vTemp.get(index2);
					
					for (int index3 = 0; index3< vi1.size();index3++) {						
						for (int index4 = 0; index4 < vi2.size(); index4++) {
							vi = new VecInt();
							vi.push(tIndex + special * -1);
							vi.push(vi1.get(index3));
							vi.push(vi2.get(index4));
							vi.push(0);
							v.add(vi);
						}
					}
					
				}
			}
		}
		
		return v;
	}

	
}
