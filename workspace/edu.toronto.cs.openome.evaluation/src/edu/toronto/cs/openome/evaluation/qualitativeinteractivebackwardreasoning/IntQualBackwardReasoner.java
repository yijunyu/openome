package edu.toronto.cs.openome.evaluation.qualitativeinteractivebackwardreasoning;

import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;
import java.util.Vector;

import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramCommandStack;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.sat4j.core.VecInt;

import edu.toronto.cs.openome.evaluation.SATSolver.Dimacs;
import edu.toronto.cs.openome.evaluation.SATSolver.ModeltoAxiomsConverter;
import edu.toronto.cs.openome.evaluation.SATSolver.zChaffSolver;
import edu.toronto.cs.openome.evaluation.SATSolver.zMinimalSolver;
import edu.toronto.cs.openome.evaluation.commands.BackwardHJWindowCommand;
import edu.toronto.cs.openome.evaluation.commands.ForwardHJWindowCommand;
import edu.toronto.cs.openome.evaluation.qualitativeinteractivereasoning.HumanJudgement;
import edu.toronto.cs.openome.evaluation.qualitativeinteractivereasoning.IntQualIntentionWrapper;
import edu.toronto.cs.openome.evaluation.qualitativeinteractivereasoning.IntentionLabelPair;
import edu.toronto.cs.openome.evaluation.qualitativeinteractivereasoning.LabelBag;
import edu.toronto.cs.openome.evaluation.qualitativeinteractivereasoning.SoftgoalWrappers;
import edu.toronto.cs.openome.evaluation.reasoning.Reasoner;
import edu.toronto.cs.openome_model.EvaluationLabel;
import edu.toronto.cs.openome_model.Intention;
import edu.toronto.cs.openome_model.diagram.edit.parts.ActorEditPart;
import edu.toronto.cs.openome_model.diagram.edit.parts.GoalEditPart;
import edu.toronto.cs.openome_model.diagram.edit.parts.ResourceEditPart;
import edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalEditPart;
import edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal2EditPart;
import edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal3EditPart;
import edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal4EditPart;
import edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal5EditPart;
import edu.toronto.cs.openome_model.diagram.edit.parts.TaskEditPart;




import edu.toronto.cs.openome_model.impl.ModelImpl;

public class IntQualBackwardReasoner extends Reasoner {
	//Some extra info needs to be stored with softgoals, so we have a wrapper class, and we have another class
	//which stores a list of these wrappers, this is that class
	private SoftgoalWrappers softgoalWrappers;
	private HashMap <Intention, Integer> minDistances;
	private Dimacs cnf;
	private Dimacs cnfBack;
	zChaffSolver solver;
	zMinimalSolver minSolver;
	ModeltoAxiomsConverter converter;
	Stack<Vector<Intention>> hjStack;
	Vector<Intention> targets;
	/**
	 * @author jenhork
	 * Constructor, takes in a ModelImpl (how the model is stored) a CommandStack, to execute commands, also a diagram Command stack
	 */
	public IntQualBackwardReasoner(ModelImpl m, CommandStack com, List editParts) {
		super(m, com, editParts);
		
		softgoalWrappers = new SoftgoalWrappers();
		minDistances = new HashMap<Intention, Integer>();
		solver = new zChaffSolver();
		minSolver = new zMinimalSolver();
		converter = new ModeltoAxiomsConverter(model);
		hjStack = new Stack<Vector<Intention>>();
		targets = converter.findTargets();
		initializeMinDistances();
		//System.out.println("finished constructor");
	}
	
	/**
	 * @author jenhork
	 * The major method for qualitative, interactive reasoning.  This is like the "main" method.  Where most of the
	 * stuff starts from.
	 */
	public void reason() {
		//DEBUGGING stuff, delete eventually
		
		System.out.println("Qualitative Interactive Backward Reasoning - !yohA");
		
		//First, translate the model into a form that the SAT solver can read
						
		cnf = converter.convertBothDirections("Dimacs.cnf");
				
		cnfBack = converter.convertBackward("backDimacs.cnf");
		
		System.out.println("Done conversion");
		
		Shell [] ar = PlatformUI.getWorkbench().getDisplay().getShells();
		
		Shell shell = ar[0];
		
		while( true )  {
			int result = solver.solve(cnf);		
			System.out.println("Solved cnf, result: " + result);
			if (result ==1) {
				
				Vector<Integer> intResults = solver.getResults();
				
				HashMap<Intention, int[]> results = converter.convertResults(intResults);
			
				/*System.out.println("Results HashMap");
				//System.out.println(intResults.size());
				for (Intention intention : results.keySet()) {
					System.out.println(intention.getName());
					int [] ints = results.get(intention);
					for (int i : ints) {
						System.out.print(i + " ");
					}
					System.out.println("");				
				}*/
				
				Vector<Intention> needHJ = processAndDisplayResults(results);	
				
				if (needHJ.size() == 0) {
					//we are done, problem is SAT, HJ not needed
					System.out.println("no intentions need hj, complete");
					showMessage("Success: backward evaluation complete!", shell);
					return;
				}
				
				/*System.out.println("The following intentions need human judgment: ");
				for (Intention i : needHJ) {
					System.out.println(i.getName());
				}*/
				
				Vector<Intention> topMostConflict = findTopMostConflict(needHJ);
				/*System.out.println("The following intentions are the topmost conflicts: ");
				for (Intention i : topMostConflict) {
					System.out.println(i.getName());
				}*/
				
				if (topMostConflict.size() == 0) {
					System.out.println("no topmost intentions need hj, complete");
					showMessage("Success: backward evaluation complete!", shell);
					return;
				}

				
				//System.out.println(cnf.getNumClauses());
				
				int hjresult = addHumanJudgement(topMostConflict); //, results);
				
				//user has cancelled
				if (hjresult == -1)
					return;
				//user has no more hj to add
				if (hjresult == 0) {
					System.out.println("HJ result 0");
					int bresult = backtrack(result);
					
					if (bresult == -1) {
						return;
					}
				}
				if (hjresult == 1) {
					hjStack.push(topMostConflict);
				}
				
				//System.out.println(cnf.getNumClauses());
				
				//remove me later
				//result = solver.solve(cnf);
				//result = solver.solve(cnfBack);	
				
				
			}
			else if (result == 0) {
				if (hjStack.size() > 0) {
					//temporarily disable unsat results
					Vector<Intention> conflictIntentions = getUnSatCoreIntentions(cnf);
					/*String unsatMessage = getUnsatCoreString(cnf);
					if (unsatMessage != "") {
						showMessage("Target(s) unsatisfiable\n" + unsatMessage + "backtracking...", shell);
					}
					else {
						showMessage("Target(s) unsatisfiable\n" + "backtracking...", shell);
					}*/
					
					String message = "Target(s) unsatisfiable\nThe following intentions conflict:\n";
					for (Intention k: conflictIntentions) {
						message += k.getName() + "\n";
					}
					message+= "backtracking...";
					showMessage(message, shell);
				}
				
				int bresult = backtrack(result);
				
				if (bresult == -1) {
					return;
				}		
			}
			else {
				System.out.println("zChaff failed");
				
				return;
			}
		}
		
	}
	
	private int backtrack(int result) {
		Shell [] ar = PlatformUI.getWorkbench().getDisplay().getShells();
		
		Shell shell = ar[0];	
		Vector<Intention> conflictIntentions;
		if (result == 0) {
			conflictIntentions = getUnSatCoreIntentions(cnf);
			System.out.println("conflicting Intentions:");
			for (Intention k: conflictIntentions) {
				System.out.println(k.getName());
			}
			String unsatMessage2 = getUnsatCoreString(cnf);
			System.out.println(unsatMessage2);
		}
		else {
			conflictIntentions = new Vector<Intention>();
		}
		
		
		boolean conflictingNeedHJ = false;
		
		if (hjStack.size() > 0) {				
					
			Vector<Intention> needHJ = hjStack.pop();
			
			for (Intention i: needHJ) {
				if (result == 1 || conflictIntentions.contains(i))  {
					conflictingNeedHJ = true;
					System.out.println(i.getName() + " needs human judgment in backtrack");
					
					IntQualIntentionWrapper w = softgoalWrappers.findIntention(i);
					
					cnf = converter.backtrackHumanJudgment(cnf, w, 0);
					cnfBack = converter.backtrackHumanJudgment(cnfBack, w, -1);
					
					w.backtrackReverseJudgments(softgoalWrappers);
				}
			}
			
			result = solver.solve(cnf);		
			System.out.println("Solved cnf, result: " + result);
			if (result == 0) {
				for (Intention i: needHJ) {
					IntQualIntentionWrapper w = softgoalWrappers.findIntention(i);
					System.out.println(i.getName() + " backtracking over");
					
					cnf = converter.backtrackHumanJudgment(cnf, w, 0);
					cnfBack = converter.backtrackHumanJudgment(cnfBack, w, -1);
					
				}
			}
			
			if (!conflictingNeedHJ) {
				return -1;
			}
			
			return 1;
		}
		else {
			//temporarily disable unsat results
			/*String unsatMessage = getUnsatCoreString(cnf);
			System.out.println(unsatMessage);
			showMessage("Target(s) unsatisfiable, no more judgments to backtrack over.\n" + unsatMessage + "Ending.", shell);
			//showMessage("Target(s) unsatisfiable, no more judgments to backtrack over.\n" + "Ending.", shell);
			*/
			
			String message = "Target(s) unsatisfiable\n";
			if (conflictIntentions.size() >0 ){
				message += "The following intentions conflict:\n";
			}
			for (Intention k: conflictIntentions) {
				message += k.getName() + "\n";
			}
			showMessage(message, shell);
			highlightIntentions(conflictIntentions);
			
			return -1;
		}
		
	}

	private void highlightIntentions(Vector<Intention> conflictIntentions) {
		for (Object ob: editParts) {
			EditPart ep = (EditPart) ob;
			if (ep instanceof ActorEditPart) {
				
			}
			if (ep instanceof SoftgoalEditPart) {
				SoftgoalEditPart sep = (SoftgoalEditPart) ep;
				sep.setFigure("red");
			}
			if (ep instanceof GoalEditPart) {
				GoalEditPart gep = (GoalEditPart) ep;
				gep.setFigure("red");
			}
			if (ep instanceof ResourceEditPart) {
				ResourceEditPart rep = (ResourceEditPart) ep;
				rep.setFigure("red");
			}
			if (ep instanceof TaskEditPart) {
				TaskEditPart tep = (TaskEditPart) ep;
				tep.setFigure("red");
			}
			if (ep instanceof Softgoal2EditPart) {
				Softgoal2EditPart sep = (Softgoal2EditPart) ep;
				sep.setFigure("red");
			}
			if (ep instanceof Softgoal3EditPart) {
				Softgoal3EditPart sep = (Softgoal3EditPart) ep;
				sep.setFigure("red");
			}
			if (ep instanceof Softgoal4EditPart) {
				Softgoal4EditPart sep = (Softgoal4EditPart) ep;
				sep.setFigure("red");
			}
			if (ep instanceof Softgoal5EditPart) {
				Softgoal5EditPart sep = (Softgoal5EditPart) ep;
				sep.setFigure("red");
			}
			System.out.println(ep.toString());
		}
		
	}

	private Vector<Intention> getUnSatCoreIntentions(Dimacs cnf2) {
		Vector<Intention> conflicts = new Vector<Intention>();
		
		int minResult = minSolver.solve(cnf);	
		
		if (minResult == 1) {				
			Vector<Integer> intResults = minSolver.getResults();
		
		
			conflicts = converter.convertMinResultstoIntentions(intResults, cnf);
						
		}
		return conflicts;
	}

	private String getUnsatCoreString(Dimacs cnf2) {
		int minResult = minSolver.solve(cnf);	
		
		if (minResult == 1) {				
			Vector<Integer> intResults = minSolver.getResults();
		
			
			Vector<String> results = converter.convertMinResultstoStringClause(intResults, cnf);
			
			/*System.out.println("The following intention labels are conflicting:");
			System.out.println(results.size());
			for (String str: results) {
				System.out.println(str);			
			}*/
			
			String message = "The following intention clauses are conflicting:\n";
			for (String str: results) {
				message += str + "\n";			
			}
			
			return message;
		}
		else
			return "";
		
	}

	private int addHumanJudgement(Vector<Intention> topMostConflict) { //, HashMap<Intention, int[]> results) {
		int hjresult = 0;
		int result = solver.solve(cnfBack);					
		
		if (result == 1) {
			
			Vector<Integer> intBackResults = solver.getResults();
		
			HashMap<Intention, int[]> backResults = converter.convertResults(intBackResults);
			
			for (Intention i: topMostConflict)  {
				int[] results = backResults.get(i);
				if (results == null) {
					System.out.println("error in back results");
				}
				for (int j : results) {
					System.out.print(j + " ");
				}
				if (!none(results)) {
					System.out.println("The following intentions are getting human judgment: " + i.getName());			
					
					/*System.out.println("Backward Results HashMap");
					//System.out.println(intResults.size());
					for (Intention intention : backResults.keySet()) {
						System.out.println(intention.getName());
						int [] ints = backResults.get(intention);
						for (int j : ints) {
							System.out.print(j + " ");
						}
						System.out.println("");				
					}*/
				
					//backwards eval to find targets?
					IntQualIntentionWrapper w =softgoalWrappers.findIntention(i);
					if (w == null) {
						w = new IntQualIntentionWrapper(i);
						softgoalWrappers.add(w);
					}				
								
					
					LabelBag lb = promptForHumanJudgment(w, backResults.get(i));
					
					//user has pressed cancel, quit everything
					if (lb == null) {
						return -1;
					//no combinations 
					} else if (lb.size() == 0) {
						return 0;
					} else if (lb.size() > 0) {
						//System.out.println("r is 1");
						//lb.printBag();
						//do something with the bag
						
						displayIntermediateHJResults(w, lb);
						
						/*System.out.println("human judgements:");
						for (HumanJudgement hj : w.getHumanJudgements()) {
							hj.getLabelBag().printBag();
							System.out.println("Target: " + hj.getJudgement().toString());
						}	*/
						
						cnf = converter.addHumanJudgment(cnf, w, lb, 0);
						cnfBack = converter.addHumanJudgment(cnfBack, w, lb, -1);
						
						hjresult = 1;
					}
				}
			}
		} else {
			System.out.println("Couldn't find backward target");
			return 0;
		}
		return hjresult;		
	}

	private void displayIntermediateHJResults(IntQualIntentionWrapper w, LabelBag lb) {
		//System.out.println("Displaying results");	
		setQualCombinedLabel(w.getIntention(), w.getInitialEvaluationLable());
		ListIterator<IntentionLabelPair> it = lb.listIterator();
		while(it.hasNext()) {
			IntentionLabelPair ilp = it.next();
			setQualCombinedLabel(ilp.getIntention(), ilp.getEvaluationLabel());
			//System.out.println(ilp.getIntention().getName() + " " + ilp.getEvaluationLabel().toString());	
		}
		
		
	}

	private boolean none(int[] is) {
		for (int i : is) {
			if (i > 0)
				return false;
		}
		return true;
	}

	private LabelBag promptForHumanJudgment(IntQualIntentionWrapper w, int[] js) {
		System.out.println(w.getIntention().getName() + " needs human judgment.  Target is: ");
		for (int j: js)
			System.out.print(j + " ");
		System.out.println();
		
		Shell [] ar = PlatformUI.getWorkbench().getDisplay().getShells();
		
		
		if (js[0] > 0 ) { //& (js[2] < 0 & js[3] < 0 & js[4] < 0 & js[5] < 0)) {
			w.setInitialEvaluationLabel(EvaluationLabel.SATISFIED);
		}		
		else if (js[1] > 0 ) { //& (js[2] < 0 & js[3] < 0 & js[4] < 0 & js[5] < 0)) {
			w.setInitialEvaluationLabel(EvaluationLabel.WEAKLY_SATISFIED);
		}	
		else if (js[2] > 0 ) { //& (js[0] < 0 & js[1] < 0 & js[3] < 0 & js[4] < 0 & js[5] < 0)) {
			w.setInitialEvaluationLabel(EvaluationLabel.UNKNOWN);
		}		
		else if (js[3] > 0 ) { //& (js[0] < 0 & js[1] < 0 & js[2] < 0 & js[4] < 0 & js[5] < 0)) {
			w.setInitialEvaluationLabel(EvaluationLabel.CONFLICT);
		}
		else if (js[4] > 0 ) { //& (js[0] < 0 & js[1] < 0 & js[2] < 0 & js[3] < 0)) {
			w.setInitialEvaluationLabel(EvaluationLabel.WEAKLY_DENIED);
		}			
		else if (js[5] > 0 ) { //& (js[0] < 0 & js[1] < 0 & js[2] < 0 & js[3] < 0 & js[4]<0)) {
			w.setInitialEvaluationLabel(EvaluationLabel.DENIED);
		}
		else {
			//System.out.println("Backward target not clear for " + w.getIntention().getName());
			//return new LabelBag();
			w.setInitialEvaluationLabel(EvaluationLabel.NONE);
		}
		
		
		BackwardHJWindowCommand wincom = new BackwardHJWindowCommand(ar[0], w, softgoalWrappers);
				
		cs.execute(wincom);
		
		
		
		if (wincom.noCombinations()) {
			return new LabelBag();
		}
		
		if (wincom.done()) {
			//System.out.println("Window was done");
			return wincom.getBagResult();			
		}
		
		// was cancelled
		return null;
	}

	private Vector<Intention> findTopMostConflict(Vector<Intention> needHJ) {
		// find distance from top goals for each intention
		
		Vector<Intention> topMost = new Vector<Intention>();
		
		int smallest = model.getAllIntentions().size();
		
		for (Intention i: needHJ) {
			int distance = minDistances.get(i).intValue();
			if (distance < smallest) {
				smallest = distance;
			}
		}
		if (smallest != model.getAllIntentions().size()+1) {
			for (Intention i: needHJ) {
				if (smallest == minDistances.get(i).intValue()) 
					topMost.add(i);
			}
		}
		
		return topMost;
	}
	
	private void initializeMinDistances() {
		if (minDistances.size() == 0)
		{
			//System.out.println("initialize min distances");
			//initialize data structure
			for (Intention i : model.getAllIntentions()) {
				//second argument is the largest possible value for distance + 1
				minDistances.put(i, new Integer(model.getAllIntentions().size()+1));
			}
			//find top intentions
			for (Intention i : targets) {
				//if (i.isRoot()) {
					//dusted off my algorithms book (seriously)
					//I guess this is a breadth-first search for all intentions,
					//keeping track of the distance from root
					int distance = 0;
					findMinDistance(distance, i, minDistances);
					
					System.out.println("target: " + i.getName());
				//}
			}
			/*for (Intention i: minDistances.keySet()) {
				System.out.println(i.getName() + " distance: " + minDistances.get(i).intValue());
			}*/
		}
		
	}

	private void findMinDistance(int distance, Intention root, HashMap<Intention, Integer> hashMap) {
		
		if (hashMap.get(root).intValue() > distance)
				hashMap.put(root, new Integer(distance));
		
		distance++;
				
		//base case, root is leaf
		if (root.isLeaf())   {	
			
			return;
		}
		else {			
			for (Intention child : root.getChildren()) {
				
				findMinDistance(distance, child, hashMap);
			}
		}
		
		return;
	}

	private Vector<Intention> processAndDisplayResults(HashMap<Intention, int[]> results) {
		Vector<Intention> needHJ = new Vector<Intention>();
		
		for (Intention intention : results.keySet()) {
			//System.out.println("Displaying for: " + intention.getName());
			int [] ints = results.get(intention);
			
			if (ints[0] > 0 & (ints[2] < 0 & ints[3] < 0 & ints[4] < 0 & ints[5] < 0)) {
				setQualCombinedLabel(intention, EvaluationLabel.SATISFIED);
			}
			
			else if (ints[1] > 0 & (ints[0] < 0 & ints[2] < 0 & ints[3] < 0 & ints[4] < 0 & ints[5] < 0)) {
				//if (intention.getContributesFrom().size() < 2)
					setQualCombinedLabel(intention, EvaluationLabel.WEAKLY_SATISFIED);
			}
			
			else if (ints[2] > 0 & (ints[0] < 0 & ints[1] < 0 & ints[3] < 0 & ints[4] < 0 & ints[5] < 0)) {
				setQualCombinedLabel(intention, EvaluationLabel.UNKNOWN);
			}
			
			else if (ints[3] > 0 & (ints[0] < 0 & ints[1] < 0 & ints[2] < 0 & ints[4] < 0 & ints[5] < 0)) {
				setQualCombinedLabel(intention, EvaluationLabel.CONFLICT);
			}
			
			else if (ints[4] > 0 & (ints[0] < 0 & ints[1] < 0 & ints[2] < 0 & ints[3] < 0 & ints[5] < 0)) {
				//if (intention.getContributesFrom().size() < 2)
					setQualCombinedLabel(intention, EvaluationLabel.WEAKLY_DENIED);
			}
			
			else if (ints[5] > 0 & (ints[0] < 0 & ints[1] < 0 & ints[2] < 0 & ints[3] < 0)) {
				setQualCombinedLabel(intention, EvaluationLabel.DENIED);
			}
			else if (ints[4] < 0 & ints[5] < 0 & ints[0] < 0 & ints[1] < 0 & ints[2] < 0 & ints[3] < 0) {
				setQualCombinedLabel(intention, EvaluationLabel.NONE);
			}
			/*!!
			 * I'm missing a case here where there is more than one PS or more than one PD value.  
			 * This isn't actually possible, but if the value is only PS or only PD and there is more than one incoming
			 * contribution link then...  maybe this is it?
			 */
			else {
				if (intention.getContributesFrom().size() > 1) {
					setQualCombinedLabel(intention, EvaluationLabel.UNKNOWN);
					needHJ.add(intention);
				}
				else {
					setQualCombinedLabel(intention, EvaluationLabel.CONFLICT);
				}					
			}
		}
		
		return needHJ;
	}
	
	public SoftgoalWrappers getSoftgoalWrappers(){
		return softgoalWrappers;
	}
	
	/**
	 * Shows a message in a dialog box with an OK button 
	 * @param message
	 */
	private void showMessage(String message, Shell shell) {
		MessageDialog.openInformation(
			shell,
			"Interactive Qualitative Backward Reasoning",
			message);
	}

}
