package edu.toronto.cs.ome.humaninterventionreasoning;

import edu.toronto.cs.ome.model.*;
import edu.toronto.cs.ome.view.View;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.swing.JPopupMenu;


/*  Link Types
 * 
 * IStarDependencyLink link
 * IStarDecompositionLink link
 * IStarHelpContribution link
 * IStarSomeNegativeContribution link
 * IStarMakeContribution 
 * IStarMeansEndsLink link
 * IStarAndContribution
 * IStarUnknownContribution
 * IStarHurtContribution
 * IStarSomeNegativeContribution
 * 
 * */

/**
 * @author  jenhork
 */
public class HumanInterventionReasoning {
	
	TelosModel model;
	
	//EvaluationLabelBag initialLabels;
	
	/**
	 * @uml.property  name="nonActorElements"
	 * @uml.associationEnd  multiplicity="(0 -1)"
	 */
	TelosElement [] nonActorElements;
	
	EvaluationLabelStack labels;
	
	View view;
	
	int repeatedStates;
	
	int numLeafs;
	
	int numHumanDecisions;
		
	public HumanInterventionReasoning(TelosModel tModel, View v) {
		model = tModel;
		repeatedStates = 0;
		numLeafs = 0;
		view = v;
		numHumanDecisions = 0;
		
		//put the elements which aren't actors into TelosElement
		setNonActorElements();
		
		labels = new EvaluationLabelStack();
		
		System.out.println("Initial Labels");	
		//find the initial labels
		for (int i = 0; i < nonActorElements.length; i++ )  {
			TelosElement element = (TelosElement) nonActorElements[i];
				
			element.setPreviousEvalLabel(new EvaluationLabel("empty"));
			//System.out.println(""+element.getIndividual().level());
										
			if (!element.getEvalLabel().Empty())  {
				labels.add(element.getEvalLabel(), element);
				element.addToBag(element.getEvalLabel(), element);
				element.setPreviousEvalLabel(element.getEvalLabel());
				//Remove eventually				
				element.getEvalLabel().print();
			}
			
			//System.out.println("Element links before fix: " + element.getName());
			//element.printAllLinks();
			
		}
		System.out.println("Number of nonActorElements: " + nonActorElements.length);
		/*Iterator it = model.getLinks().iterator();
		
		while(it.hasNext())  {
			TelosLink t = (TelosLink) it.next();
			t.printLink();
		}*/
				
		//The links variable in the TelosElement doesn't always know about all of the links
		//to or from it (especially the links to it).  However the model does know about all
		//of it's links, and the links seem to know about all of their elements.
		//So we go through all the links and elements and make sure the 
		//element is aware of all the links to and from it.
		//Note: This should really be "fixed" elsewhere, before coming into the Evaluation
		//package, but it would take me forever to figure out where the error is, so I'm 
		//being lazy and fixing it here.  
		fixElementLinks();
		
		/*System.out.println("Links After Fix: " );
		for (int i = 0; i < nonActorElements.length; i++ )  {
			TelosElement element = (TelosElement) nonActorElements[i];
			System.out.println("Element: " + element.getName());			
			element.printAllLinks();			
		}*/
		

		for (int i = 0; i < nonActorElements.length; i++ )  {
			TelosElement element = (TelosElement) nonActorElements[i];
				
			if (element.isLeaf())
				numLeafs++;
			
		}
	
		System.out.println("Number of leaf elements: " + numLeafs);
	}
		
	public void propagate(TelosModel model) {	
		long t1 = System.currentTimeMillis();
		while(!labels.isEmpty())  {
			step1();
			System.out.println("Queue after step 1:");
			labels.printStack();
			step2();
			System.out.println("Queue after step 2:");
			labels.printStack();
		}
		
		clearBags();
		clearLinkLabels();
		
		long t2 = System.currentTimeMillis() - t1;
		System.out.println("Model Evaluation took " + t2/1000.0 + " seconds.");
		
		System.out.println("Number of repeated states: " + repeatedStates);
		System.out.println("Number of Human Decisions: " + numHumanDecisions);
	}
	
	private void step1() {
		
		while(labels.size() > 0)  {
			Object [] labelPair = (Object [])labels.pop();
			EvaluationLabel thisLabel = (EvaluationLabel) labelPair[0];
			TelosElement thisElement = (TelosElement) labelPair[1];
			
			//System.out.println("Processing label: " 
			//		+ thisElement.getName()  + " " + thisLabel.getName());			
					
			HashSet linksFrom = thisElement.getLinksFrom();
			
			Iterator i = linksFrom.iterator();		
			
			while (i.hasNext())
			{
				TelosLink link = (TelosLink) i.next();
			
				TelosObject toObject = (TelosObject) link.getTo();
				
				if (toObject.getIndividual().telosName().contains("Link")) {
					//System.out.println("Link to a link for:");
					//link.printLink();
					
					if (!link.isContribution())
						continue;
					
					TelosLink toLink = (TelosLink) link.getTo();
					EvaluationLabel l = getContributionResult(thisLabel, link, null);
					toLink.setEvalLabel(l);
					//l.print();
					continue;
				}
				
				TelosElement toElement = (TelosElement) link.getTo();
				String linkType = null;
				
				if (link.getEvalLabel() != null){
					//System.out.println("Link Has Eval Label");
					//link.printLink();
					
					link.getEvalLabel().print();
					
					linkType = getResultingLink(link);
					//System.out.println("New link type:" + linkType);
					
					if (linkType.equals("none"))
						continue;
				
				}		
				 
				if (toElement.isActor())
					continue;
				
				Object [] results = new Object[2];
				
				if (link.isContribution()) {
					//i* models don't have And or Or contribution links in the
					//current OpenOme version??  This might be a problem
					//However, if you import a model made in a different framework
					//to OpenOME it can still have these links so we have to deal with
					//them									
					if (link.isAndContribution() | link.isOrContribution()) {
						
						if (link.isAndContribution())  {
							results = processAnd(thisLabel, link);
						}
						if (link.isOrContribution()) {
							results = processOr(thisLabel, link);
						}
			
						toElement.addToBag((EvaluationLabel) results[0], 
								(TelosElement) results[1]);		
					}
					//contribution link that's not And or Or
					else {
						
						EvaluationLabel labelResult = getContributionResult(thisLabel, link, linkType);
						toElement.addToBag(labelResult, thisElement);
					}
									
				}
				else {			
					
					if (link.isDependency()) {
						
						toElement = (TelosElement) link.getFrom();
						
						if (toElement.isSoftgoal()) {
							toElement.addToBag(thisLabel, thisElement);
							continue;
						}
						else {
							results[0] = thisLabel;
							results[1] = thisElement;
						}
					}					
					if (link.isMeansEnds()) {
						results = processOr(thisLabel, link);
					}
					if (link.isDecomposition())  {
						results = processAnd(thisLabel, link);
					}
				
					//System.out.println("Result: " + ((EvaluationLabel)results[0]).getName());
					
					if (toElement.getEvalResultLinkType().equals(link.getLinkType()) |
							toElement.getEvalLabel().Empty() |
							toElement.getEvalLabel().isGreaterThan((EvaluationLabel)results[0]))  {
						
						EvaluationLabel result = (EvaluationLabel) results[0];
						
						/*boolean hasOtherLinks = false;
						if (result.Empty())  {
							
							HashSet toLinks = toElement.getLinksTo();
							Iterator it = toLinks.iterator();
							while (it.hasNext()) {
								TelosLink otherlink = (TelosLink) it.next();
								if (!otherlink.getLinkType().equals(link.getLinkType()))
									hasOtherLinks = true;
							}
						}	*/					
						
					
						
						if (/*!hasOtherLinks && */!result.getName().equals(toElement.getPreviousEvalLabel().getName())) {
							
							labels.add(result, toElement);	
							toElement.setEvalLabel(result);
							toElement.setPreviousEvalLabel(result);
							toElement.setEvalResultLinkType(link.getLinkType());
						}				
					}
				}
			}				
		}
	}
	
	private void step2() {
				
		for (int i = 0; i < nonActorElements.length; i++) {
			
			TelosElement ele = (TelosElement) nonActorElements[i];
			
			if (!ele.isLabelBagEmpty() && !ele.getLabelBag().isResolved()) {
				EvaluationLabel result = new EvaluationLabel("empty");
				
				//System.out.println("Resolving Bag for element: " + ele.getName());
				//ele.getLabelBag().printBag();
				
				result = testForAutomaticCases(ele);
				
				if (!result.Empty()) {
					ele.setEvalLabel(result);
				}
				else {
					result = ele.labelBagStateHasOccured();
					if (result != null)  {
						repeatedStates++;
					}
					HumanInterventionDialog dialog = new HumanInterventionDialog(model, ele);
					
					view.showDialog(dialog);
				
					result = ele.getEvalLabel();
					
					ele.labelBagStateResolved();
					
					numHumanDecisions++;
										
				}
				ele.getLabelBag().resolve();
				
				//System.out.println("Result:");
				//result.print();	
						
				if (!result.getName().equals(ele.getPreviousEvalLabel().getName())) {
					labels.add(result, ele);	
					ele.setPreviousEvalLabel(result);
					//return;
				}				 
			}
		}
	}
	
	private void setNonActorElements() {
		Collection elements = model.getElements();
		
		Object [] objelements = elements.toArray();
		TelosElement [] nonActor = new TelosElement[objelements.length];
		
		
		int numNonActors = 0;
		
		//Find all the non-Actor elements
		for (int i = 0; i < objelements.length; i++ )  {
			TelosElement element = (TelosElement) objelements[i];
			
			
			//If not an actor
			if (!element.isActor())  {
				nonActor[numNonActors] = element;
				numNonActors++;
			}
		}	
		
		//make the array the right size
		nonActorElements = new TelosElement[numNonActors];
		
		//copy the array 
		for (int j = 0; j < numNonActors; j++) {
			nonActorElements[j] = nonActor[j];
		}
	}
	
	private Object [] processAnd(EvaluationLabel label, TelosLink link)  {
		EvaluationLabel minLabel = new EvaluationLabel("IStarSatisficedElementLabel");
		
		Object [] results = new Object[2];
		
		TelosElement toElement = (TelosElement) link.getTo();  
		
		HashSet linksToToElement = toElement.getLinksTo();
		
		Iterator it = linksToToElement.iterator();
		
		while (it.hasNext()) {
			TelosLink l = (TelosLink) it.next();
			
			if (l.getEvalLabel() != null){
				
				String linkType = getResultingLink(l);
				
				if (linkType.equals("none"))
					continue;
			}
			
			if (l.isAndContribution() | l.isDecomposition()) {
				TelosElement t = (TelosElement) l.getFrom();
				
				if (t.getEvalLabel().isLessThan(minLabel))	{
					minLabel = t.getEvalLabel();
					results[1] = t;
				}
				if (t.getEvalLabel().isFullySatisficed())
					results[1] = t;
				//there might already be a value in the to element's bag
				//from this element, remove it.
				toElement.removeFromBag(t);
			}
		}
		if (minLabel.Empty())
			minLabel = new EvaluationLabel("IStarUndecidedElementLabel");
			
		results[0] = minLabel;
		
		return results;
	}
	
	private Object[] processOr(EvaluationLabel label, TelosLink link)  {
		
		EvaluationLabel maxLabel = new EvaluationLabel("IStarDeniedElementLabel");
		
		Object [] results = new Object[2];
		
		TelosElement toElement = (TelosElement) link.getTo();  
		
		HashSet linksToToElement = toElement.getLinksTo();
		
		Iterator it = linksToToElement.iterator();
		
		while (it.hasNext()) {
			TelosLink l = (TelosLink) it.next();
			
			if (l.getEvalLabel() != null){
				
				String linkType = getResultingLink(l);
				
				if (linkType.equals("none"))
					continue;
			}
			
			if (l.isOrContribution() | l.isMeansEnds()) {
				TelosElement t = (TelosElement) l.getFrom();
				
				if (t.getEvalLabel().isGreaterThan(maxLabel))	{
					maxLabel = t.getEvalLabel();
					results[1] = t;
				}
				if (t.getEvalLabel().isFullyDenied())
					results[1] = t;
				//there might already be a value in the to element's bag
				//from this element, remove it.
				toElement.removeFromBag(t);
			}
		}
		if (maxLabel.Empty())  {
			maxLabel = new EvaluationLabel("IStarUndecidedElementLabel");
		}
		results[0] = maxLabel;
		
		return results;
	}
	
	//Finish this later
	private EvaluationLabel testForAutomaticCases(TelosElement ele)  {
		EvaluationLabelBag bag = ele.getLabelBag();
		EvaluationLabel result = new EvaluationLabel("empty");
		Iterator i = bag.iterator();
		
		//Case 1
		if (bag.size() == 1) {
			result = bag.getFirstValue();
		}
		//Case 2
		boolean allFullySatisficed = true;
		boolean allFullyDenied = true;
		
		while(i.hasNext()) {
			Object [] tuple = (Object []) i.next();
			EvaluationLabel el = (EvaluationLabel) tuple[0];
			if (!el.isFullySatisficed())
				allFullySatisficed = false;
			if (!el.isFullyDenied())
				allFullyDenied = false;
		}
		if (allFullySatisficed)  {
			result = new EvaluationLabel("IStarSatisficedElementLabel");
			return result;
		}
		if (allFullyDenied)  {
			result = new EvaluationLabel("IStarDeniedElementLabel");
			return result;
		}
		
		//Case 3
		boolean allPositive = true;
		boolean allNegative = true;
		boolean hasFullySatisficed = false;
		boolean hasFullyDenied = false;
		boolean allConflict = true;
		boolean allUndecided = true;
		
		i = bag.iterator();
		
		while (i.hasNext())  {
			Object [] tuple = (Object []) i.next();
			EvaluationLabel el = (EvaluationLabel) tuple[0];
			
			if (el.isFullySatisficed()) {
				hasFullySatisficed = true;
				allNegative = false;
				allConflict = false;
				allUndecided = false;
				continue;
			}
			if (el.isPartiallySatisficed()) {
				allNegative = false;
				allConflict = false;
				allUndecided = false;
				continue;
			}
			if (el.isFullyDenied()) {
				hasFullyDenied = true;
				allPositive = false;
				allConflict = false;
				allUndecided = false;
				continue;
			}
			if (el.isPartiallyDenied())  {
				allPositive = false;
				allConflict = false;
				allUndecided = false;
				continue;
			}
			if (el.isConflict()) {
				allUndecided = false;
				allPositive = false;
				allNegative = false;
				continue;
			}
			if (el.isUndecided()) {
				allConflict = false;
				allPositive = false;
				allNegative = false;
			}
		}
		
		if (allNegative && hasFullyDenied) {
			result = new EvaluationLabel("IStarDeniedElementLabel");
			return result;
		}
		if (allPositive && hasFullySatisficed) {
			result = new EvaluationLabel("IStarSatisficedElementLabel");
			return result;
		}
		if (allConflict) {
			result = new EvaluationLabel("IStarConflictElementLabel");
			return result;
		}
		if (allUndecided) {
			result = new EvaluationLabel("IStarUndecidedElementLabel");
			return result;
		}
		
		//Case 4
		if (ele.getEvalLabel().isFullySatisficed() && allPositive) 
			result = ele.getEvalLabel();
		if (ele.getEvalLabel().isFullyDenied() && allNegative)
			result = ele.getEvalLabel();
		
		return result;
	}
	
	private void clearBags() {
		for (int i = 0; i < nonActorElements.length; i++) {
			TelosElement ele = (TelosElement) nonActorElements[i];
			
			if (!ele.isLabelBagEmpty())
				ele.emptyLabelBag();
		}
	}
	
	private EvaluationLabel getContributionResult(EvaluationLabel label, TelosLink link, String linkType) {
				
//		LinkType type = new LinkType(link.getLinkType());
//		
//		if (linkType != null && !linkType.equals("NoChange"))
//			type = new LinkType(linkType);
//		
//		EvaluationLabel result = new EvaluationLabel("empty");
//		
//		if (type.isUnknown())  {
//			return new EvaluationLabel("IStarUndecidedElementLabel");
//		}
//		if (label.isConflict()) {
//			return new EvaluationLabel("IStarConflictElementLabel");
//		}
//		if (label.isUndecided()) {
//			return new EvaluationLabel("IStarUndecidedElementLabel");
//		}
//		if (label.isFullySatisficed())  {
//			if (type.isMake()) {
//				return new EvaluationLabel("IStarSatisficedElementLabel");
//			}
//			if (type.isHelp() | type.isSomePlus()) {
//				return new EvaluationLabel("IStarWeaklySatisficedElementLabel");
//			}
//			if (type.isBreak()) {
//				return new EvaluationLabel("IStarDeniedElementLabel");
//			}
//			if (type.isHurt() | type.isSomeMinus()) {
//				return new EvaluationLabel("IStarWeaklyDeniedElementLabel");
//			}
//		}
//		if (label.isPartiallySatisficed()) {
//			if (type.isHelp() | type.isSomePlus() | type.isMake()) {
//				return new EvaluationLabel("IStarWeaklySatisficedElementLabel");
//			}
//			if (type.isHurt() | type.isSomeMinus() | type.isBreak()) {
//				return new EvaluationLabel("IStarWeaklyDeniedElementLabel");
//			}
//		}
//		if (label.isPartiallyDenied()) {
//			if (type.isHelp() | type.isSomePlus() | type.isMake()) {
//				return new EvaluationLabel("IStarWeaklyDeniedElementLabel");
//			}
//			if (type.isHurt() | type.isSomeMinus() | type.isBreak()) {
//				return new EvaluationLabel("IStarWeaklySatisficedElementLabel");
//			}
//		}
//		if (label.isFullyDenied()) {
//			if (type.isMake()) {
//				return new EvaluationLabel("IStarDeniedElementLabel");
//			}
//			if (type.isHelp() | type.isSomePlus()) {
//				return new EvaluationLabel("IStarWeaklyDeniedElementLabel");
//			}
//			if (type.isHurt() | type.isSomeMinus() | type.isBreak()) {
//				return new EvaluationLabel("IStarWeaklySatisficedElementLabel");
//			}
//		}
//		
//		return result;
		return null;
	}
	
	private void fixElementLinks() {
		Iterator it = model.getLinks().iterator();
		
		while(it.hasNext())  {
			TelosLink link = (TelosLink) it.next();
			//link.printLink();
			TelosObject tto = (TelosObject) link.getTo();
			
			if (!tto.getIndividual().telosName().contains("Link"))
			{
				TelosElement to = (TelosElement) tto;
				if (!link.isDependency())
					to.addLinkTo(link);
				else {

					to.addLinkFrom(link);
				}
			}			
			
			TelosElement from = (TelosElement) link.getFrom();
			
			
			
			/*if (!to.hasLink(link)) {
				//to.addLink(link);
				
				System.out.print(to.getName() + " did not have " );
				link.printLink();
			}*/			
			
			if (!link.isDependency())
				from.addLinkFrom(link);
			else  {
	
				from.addLinkTo(link);
			}
			
			/*if (!from.hasLink(link))  {
				//from.addLink(link);		
				
				System.out.print(from.getName() + " did not have " );
				link.printLink();
			}*/
		}
	}
	
	private String getResultingLink(TelosLink link)  {
		
		EvaluationLabel label = link.getEvalLabel();
		
		if (label.isFullySatisficed() | label.isPartiallySatisficed() | label.isConflict())
			return new String("NoChange");
		
		if (label.isFullyDenied())
			return new String("none");
		
		if (label.isUndecided())
			return new String("IStarUnknownContribution");
		
		if (!link.isContribution() | link.isAndContribution() | link.isOrContribution()) {
				return new String("none");
		}
		
		else {
			if (link.isHelp() | link.isHurt())
				return new String("none");
			if (link.isSomeMinus())
				return new String("IStarHurtContribution");
			if (link.isSomePlus())
				return new String("IStarHelpContribution");
			if (link.isMake())
				return new String("IStarSomePositiveContribution");
			if (link.isBreak())
				return new String("IStarSomeNegativeContribution");
		}
		
		return new String("NoChange");
	}
	
	private void clearLinkLabels() {
		Iterator it = model.getLinks().iterator();
		
		while(it.hasNext())  {
			TelosLink link = (TelosLink) it.next();
			
			link.setEvalLabel(null);
		}
	}
}
	

