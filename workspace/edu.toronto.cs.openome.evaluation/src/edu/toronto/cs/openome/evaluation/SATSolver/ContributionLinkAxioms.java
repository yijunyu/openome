package edu.toronto.cs.openome.evaluation.SATSolver;

import java.util.Collection;
import java.util.Vector;

import org.sat4j.core.VecInt;
import org.sat4j.specs.IteratorInt;

import edu.toronto.cs.openome_model.BreakContribution;
import edu.toronto.cs.openome_model.Contribution;
import edu.toronto.cs.openome_model.HelpContribution;
import edu.toronto.cs.openome_model.HurtContribution;
import edu.toronto.cs.openome_model.Intention;
import edu.toronto.cs.openome_model.Link;
import edu.toronto.cs.openome_model.MakeContribution;
import edu.toronto.cs.openome_model.SomeMinusContribution;
import edu.toronto.cs.openome_model.SomePlusContribution;
import edu.toronto.cs.openome_model.UnknownContribution;

public class ContributionLinkAxioms extends LinkAxioms {
	protected VecInt posSourceIndexes;
	protected VecInt negSourceIndexes;

	public ContributionLinkAxioms(Vector<Intention> sources, Intention targ,
			Vector<Link> l, DualHashMap<Integer, Intention> dhm) {
		super(sources, targ, l, dhm);
		negSourceIndexes = null;
		posSourceIndexes = null;
	}
	
	
	
	public void createForwardClauses() {
		//System.out.println("Creating Forward Clauses for Contribution");
		//findIndexes();
		//System.out.println("found indexes");
		
		//if (intentionMap != null) {
		//	intentionMap.print();
		//}
		//else {
		//	System.out.println("map is null");
		//}
		//System.out.println(sourceIndexes.toString());
		
		
		LinkAxioms la = null;
		AxiomsFactory axiomsFactory = new AxiomsFactory();
		
		for (Link l: links) {
			Contribution cont = (Contribution) l;
			System.out.println("contribution: " + cont.toString());
			
			Vector<Intention> vInt = new Vector<Intention>();
			vInt.add(cont.getSource());
			
			if (cont instanceof MakeContribution) 
				la = axiomsFactory.createLinkAxiom(vInt, target, links, "Make", intentionMap);
			if (cont instanceof HelpContribution)
				la = axiomsFactory.createLinkAxiom(vInt, target, links, "Help", intentionMap);
			if (cont instanceof SomePlusContribution)
				la = axiomsFactory.createLinkAxiom(vInt, target, links, "Help", intentionMap);
			if (cont instanceof UnknownContribution)
				la = axiomsFactory.createLinkAxiom(vInt, target, links, "Unknown", intentionMap);
			if (cont instanceof SomeMinusContribution)
				la = axiomsFactory.createLinkAxiom(vInt, target, links, "Hurt", intentionMap);
			if (cont instanceof HurtContribution)
				la = axiomsFactory.createLinkAxiom(vInt, target, links, "Hurt", intentionMap);
			if (cont instanceof BreakContribution)
				la = axiomsFactory.createLinkAxiom(vInt, target, links, "Break", intentionMap);
			
			if (la == null)  {
				System.out.println("Link type error");
			}
			else {
				la.createForwardClauses();
				forwardClauses.addAll(la.forwardClauses);
			}
		}
		
	}
	
	public void createBackwardClauses() {
		System.out.println("Creating Backward Clauses for Contribution");
		findIndexes();
		
		findPosNegIndexes();
		
		//PS(e)->at least one PS(ei) for pos links or at least one PD(ek) for neg links
		
		VecInt posInc = incrementAll(posSourceIndexes, 1);		
		VecInt negInc = incrementAll(negSourceIndexes, 4);
		
		VecInt combine = new VecInt();
		combine.pushAll(posInc);
		combine.pushAll(negInc);
		
		backwardClauses.addAll(addOrImplication(tIndex + 1, combine));

		//U(e)-> at least one U(ei)
		VecInt vi = incrementAll(sourceIndexes, 2);
		backwardClauses.addAll(addOrImplication(tIndex + 2, vi));
		
		//C(e1) -> C(e)
		//nothing for now
		//backwardClauses.addAll(addAndImplication(tIndex + 3, sIndex + 3));
		
	}



	private void findPosNegIndexes() {
		//System.out.println("finding indexes");
		
			//System.out.println("sourceIndexes was null");
			posSourceIndexes = new VecInt();
			negSourceIndexes = new VecInt();
			
			if (intentionMap != null) {
				System.out.println("intentionMap was not null");
								
				for (Link l : links) {
					Contribution cont = (Contribution) l;
					
					Intention sInt = cont.getSource();
					Integer sourceIndex = (Integer) intentionMap.getInverse(sInt);
					
					if ((cont instanceof MakeContribution) | (cont instanceof HelpContribution) | (cont instanceof SomePlusContribution)) 
						posSourceIndexes.push(sourceIndex);
					else if ((cont instanceof HurtContribution) | (cont instanceof BreakContribution) | (cont instanceof SomeMinusContribution)) 
						negSourceIndexes.push(sourceIndex);
		
				}
			}
			else {
				System.out.println("intentionMap is  null");
			}
	}
		
		

}
