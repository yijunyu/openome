package edu.toronto.cs.openome.evaluation.qualitativeinteractivebackwardreasoning;

import java.util.HashMap;
import java.util.Vector;

import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramCommandStack;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;

import edu.toronto.cs.openome.evaluation.SATSolver.Dimacs;
import edu.toronto.cs.openome.evaluation.SATSolver.ModeltoAxiomsConverter;
import edu.toronto.cs.openome.evaluation.SATSolver.zChaffSolver;
import edu.toronto.cs.openome.evaluation.commands.BackwardHJWindowCommand;
import edu.toronto.cs.openome.evaluation.commands.ForwardHJWindowCommand;
import edu.toronto.cs.openome.evaluation.qualitativeinteractivereasoning.HumanJudgement;
import edu.toronto.cs.openome.evaluation.qualitativeinteractivereasoning.IntQualIntentionWrapper;
import edu.toronto.cs.openome.evaluation.qualitativeinteractivereasoning.SoftgoalWrappers;
import edu.toronto.cs.openome.evaluation.reasoning.Reasoner;
import edu.toronto.cs.openome_model.EvaluationLabel;
import edu.toronto.cs.openome_model.Intention;
import edu.toronto.cs.openome_model.impl.ModelImpl;

public class IntQualBackwardReasoner extends Reasoner {
	//Some extra info needs to be stored with softgoals, so we have a wrapper class, and we have another class
	//which stores a list of these wrappers, this is that class
	private SoftgoalWrappers softgoalWrappers;
	private HashMap <Intention, Integer> minDistances;
	
	
	/**
	 * @author jenhork
	 * Constructor, takes in a ModelImpl (how the model is stored) a CommandStack, to execute commands, also a diagram Command stack
	 */
	public IntQualBackwardReasoner(ModelImpl m, CommandStack com) {
		super(m, com);
		
		softgoalWrappers = new SoftgoalWrappers();
		minDistances = new HashMap<Intention, Integer>();
		
		initializeMinDistances();
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
		
		zChaffSolver solver = new zChaffSolver();
		Dimacs cnf = new Dimacs();
		
		ModeltoAxiomsConverter converter = new ModeltoAxiomsConverter(model);
				
		cnf = converter.convertBothDirections();
		//cnf = converter.convertForward();
		//cnf = converter.convertBackward();
		
		//System.out.println("Done conversion");
		
		int result = solver.solve(cnf);		
		
		Vector<Integer> intResults = solver.getResults();
		
		if (result ==1) {
		
			HashMap<Intention, int[]> results = converter.convertResults(intResults);
		
			System.out.println("Results HashMap");
			//System.out.println(intResults.size());
			for (Intention intention : results.keySet()) {
				System.out.println(intention.getName());
				int [] ints = results.get(intention);
				for (int i : ints) {
					System.out.print(i + " ");
				}
				System.out.println("");
			
			}
			
			Vector<Intention> needHJ = processAndDisplayResults(results);	
			
			//System.out.println("The following intentions need human judgment: ");
			//for (Intention i : needHJ) {
			//	System.out.println(i.getName());
			//}
			
			Vector<Intention> topMostConflict = findTopMostConflict(needHJ);
			
			for (Intention i: topMostConflict)  {
				System.out.println("The following intentions are the top most conflict: " + i.getName());
			
			    Dimacs cnfBack = new Dimacs();
				
				cnfBack = converter.convertBackward();
				
				result = solver.solve(cnfBack);		
				
				Vector<Integer> intBackResults = solver.getResults();
								
				if (result ==1) {
				
					HashMap<Intention, int[]> backResults = converter.convertResults(intBackResults);
					
					System.out.println("Backward Results HashMap");
					//System.out.println(intResults.size());
					for (Intention intention : backResults.keySet()) {
						System.out.println(intention.getName());
						int [] ints = backResults.get(intention);
						for (int j : ints) {
							System.out.print(j + " ");
						}
						System.out.println("");
					
					}
				
					//backwards eval to find targets?
					HumanJudgement hj = promptForHumanJudgment(i, backResults.get(i));
				}
			}
		}
		else if (result == 0) {
			Shell [] ar = PlatformUI.getWorkbench().getDisplay().getShells();
			
			Shell shell = ar[0];
							
			showMessage("Target(s) unsatisfiable", shell);
		}
		else {
			System.out.println("zChaff failed");
		}
		
	
		//cnf = converter.convertForward();
		
		//solver.solve(cnf);
		
		//cnf = converter.convertBackward();
		
		//solver.solve(cnf);
		
	}
	
	private HumanJudgement promptForHumanJudgment(Intention i, int[] js) {
		System.out.println(i.getName() + " needs human judgment.  Target is: ");
		for (int j: js)
			System.out.print(j + " ");
		System.out.println();
		
		Shell [] ar = PlatformUI.getWorkbench().getDisplay().getShells();
		
		IntQualIntentionWrapper w = new IntQualIntentionWrapper(i);
		
		if (js[0] > 0 & (js[2] < 0 & js[3] < 0 & js[4] < 0 & js[5] < 0)) {
			w.setInitialEvaluationLabel(EvaluationLabel.SATISFIED);
		}			
		else if (js[1] > 0 & (js[0] < 0 & js[2] < 0 & js[3] < 0 & js[4] < 0 & js[5] < 0)) {
			w.setInitialEvaluationLabel(EvaluationLabel.WEAKLY_SATISFIED);
		}
		else if (js[2] > 0 & (js[0] < 0 & js[1] < 0 & js[3] < 0 & js[4] < 0 & js[5] < 0)) {
			w.setInitialEvaluationLabel(EvaluationLabel.UNKNOWN);
		}		
		else if (js[3] > 0 & (js[0] < 0 & js[1] < 0 & js[2] < 0 & js[4] < 0 & js[5] < 0)) {
			w.setInitialEvaluationLabel(EvaluationLabel.CONFLICT);
		}
		else if (js[4] > 0 & (js[0] < 0 & js[1] < 0 & js[2] < 0 & js[3] < 0 & js[5] < 0)) {
			w.setInitialEvaluationLabel(EvaluationLabel.WEAKLY_DENIED);
		}			
		else if (js[5] > 0 & (js[0] < 0 & js[1] < 0 & js[2] < 0 & js[3] < 0)) {
			w.setInitialEvaluationLabel(EvaluationLabel.DENIED);
		}
		else {
			System.out.println("Backward target not clear for " + i.getName());
		}
		
		BackwardHJWindowCommand wincom = new BackwardHJWindowCommand(ar[0], w);
				
		cs.execute(wincom);
		
		if (wincom.cancelled()) {
			return null;
		}
			
		EvaluationLabel result = wincom.getEvalResult();	
		
		
		
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
		
		for (Intention i: needHJ) {
			if (smallest == minDistances.get(i).intValue())
				topMost.add(i);
		}
		
		return topMost;
	}
	
	private void initializeMinDistances() {
		if (minDistances.size() == 0)
		{
			//initialize data structure
			for (Intention i : model.getAllIntentions()) {
				//second argument is the largest possible value for distance
				minDistances.put(i, new Integer(model.getAllIntentions().size()));
			}
			//find top intentions
			for (Intention i : model.getAllIntentions()) {
				if (i.isRoot()) {
					//dusted off my algorithms book (seriously)
					//I guess this is a breadth-first search for all intentions,
					//keeping track of the distance from root
					int distance = 0;
					findMinDistance(distance, i, minDistances);
				}
			}
			//for (Intention i: minDistances.keySet()) {
			//	System.out.println(i.getName() + " distance: " + minDistances.get(i).intValue());
			//}
		}
		
	}

	private void findMinDistance(int distance, Intention root, HashMap<Intention, Integer> hashMap) {
		if (hashMap.get(root).intValue() > distance)
				hashMap.put(root, new Integer(distance));
		
		distance++;
		
		//base case, root is leaf
		if (root.isLeaf())   {			
			return;// hashMap;
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
			//System.out.println(intention.getName());
			int [] ints = results.get(intention);
			
			if (ints[0] > 0 & (ints[2] < 0 & ints[3] < 0 & ints[4] < 0 & ints[5] < 0)) {
				setQualCombinedLabel(intention, EvaluationLabel.SATISFIED);
			}
			
			else if (ints[1] > 0 & (ints[0] < 0 & ints[2] < 0 & ints[3] < 0 & ints[4] < 0 & ints[5] < 0)) {
				setQualCombinedLabel(intention, EvaluationLabel.WEAKLY_SATISFIED);
			}
			
			else if (ints[2] > 0 & (ints[0] < 0 & ints[1] < 0 & ints[3] < 0 & ints[4] < 0 & ints[5] < 0)) {
				setQualCombinedLabel(intention, EvaluationLabel.UNKNOWN);
			}
			
			else if (ints[3] > 0 & (ints[0] < 0 & ints[1] < 0 & ints[2] < 0 & ints[4] < 0 & ints[5] < 0)) {
				setQualCombinedLabel(intention, EvaluationLabel.CONFLICT);
			}
			
			else if (ints[4] > 0 & (ints[0] < 0 & ints[1] < 0 & ints[2] < 0 & ints[3] < 0 & ints[5] < 0)) {
				setQualCombinedLabel(intention, EvaluationLabel.WEAKLY_DENIED);
			}
			
			else if (ints[5] > 0 & (ints[0] < 0 & ints[1] < 0 & ints[2] < 0 & ints[3] < 0)) {
				setQualCombinedLabel(intention, EvaluationLabel.DENIED);
			}
			else {
				//setQualCombinedLabel(intention, EvaluationLabel.CONFLICT);
				needHJ.add(intention);
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
