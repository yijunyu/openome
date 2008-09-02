/*
 * Created on Mar 22, 2005
 */
package convertor;

import java.util.Hashtable;
import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.resource.Resource;

import parser.FMPGoalModelLoader;
import ca.uwaterloo.gp.fmp.ConfigState;
import ca.uwaterloo.gp.fmp.Feature;
import ca.uwaterloo.gp.fmp.FmpPackage;
import ca.uwaterloo.gp.fmp.Node;
import ca.uwaterloo.gp.fmp.Project;
import ca.uwaterloo.gp.fmp.ValueType;
import ca.uwaterloo.gp.fmp.system.MetaModel;
import ca.uwaterloo.gp.fmp.system.NodeIdDictionary;
import edu.toronto.cs.openome_model.AndDecomposition;
import edu.toronto.cs.openome_model.Container;
import edu.toronto.cs.openome_model.Decomposition;
import edu.toronto.cs.openome_model.Goal;
import edu.toronto.cs.openome_model.Intention;
import edu.toronto.cs.openome_model.OrDecomposition;
import edu.toronto.cs.openome_model.Task;

public class GoalModel_FeatureModel extends FMPGoalModelLoader {
	
	Hashtable<Intention, Feature> traceability = new Hashtable<Intention, Feature>();

	Project p = null;
	/**
	 * Entry into outputGoal.  This basically is used to call NodeIdDictionary.visit once
	 * on the root of the corresponding feature model to assign unique IDs to all the reachable
	 * features.
	 */
	public void outputGoalEntry(Intention curGoal)
	{
		simpleOutputGoal(curGoal);
		//outputGoal(curGoal);
		
		// for succeeded cases, run the NodeIdDictionary visitor
		Node goalNode = (Node)traceability.get(curGoal);
		if(goalNode != null)
			NodeIdDictionary.INSTANCE.visit(null, goalNode);
	}
	
	@SuppressWarnings("unchecked")
	/**
	 * Yijun Yu: implement the algorithm in the technical report
	 * @goal Create features from the goals.
	 * @input a goal model
	 * @output a feature model
	 * @description
	 * A feature has cardinality [min .. max].
	 * The semantics see 
	 * [1] Riebisch "Towards a more precise definition of feature models", ECOOP'03
	 * [2] Schobbens "Feature diagrams: a survey and a formal semantics", RE'06
	 * Denote the number of subgoals as N, then: 
	 * An AND goal maps to a feature with cardinality [N, N];
	 * An inclusive OR goal maps to a feature with cardinality [1, N];
	 * An exclusive OR goal maps to a feature with cardinality [1, 1].
	 * As a special case for all the above three categories, a leaf goal 
	 *    that is mandatory maps to a feature with cardinality [1, 1].
	 * A leaf node that is optional maps to a feature with cardinality [0, 1].
	 */
	
	/** Peter Kim: simplified the algorithm
	 * Determine the type of the feature corresponding to the current goal
	 * If a goal is a root goal or whose parent is AND-decomposable, then it is a mandatory, solitary feature
	 * Otherwise, it is an optional grouped feature (since its parent must be (X)OR-decomposable and therefore have group representing the group cardinality).
	 * See email: Nov 20, 2006
	 */
	public void simpleOutputGoal(Intention curGoal) {
		String goalName = curGoal.getName();
		if (curGoal==null) return;
		if (!(curGoal instanceof Goal || curGoal instanceof Task)) {
			// TODO: softgoal 
			return;
		}
		Feature curGoalFeature = null;
		// Parent node will be a FeatureGroup or a Feature
		Node parentNode = null;
	    // Please always use the MetaModel facility to create features
		if (curGoal.getParentDecompositions().size() == 0 
				|| curGoal.getParentDecompositions().get(0) instanceof AndDecomposition ) { 
			// The metamodel for grouped feature is no different from that of solitary feature.
			curGoalFeature = MetaModel.createFeatureWithProperties(goalName, goalName, ConfigState.UNDECIDED_LITERAL, ValueType.NONE_LITERAL, null, null, 1, 1, p.getMetaModel());			
			// Get the right parent feature - it will be a Feature directly above
			if(FMPGoalModelLoader.getParent(curGoal) != null)
				parentNode = (Node)traceability.get(FMPGoalModelLoader.getParent(curGoal));
			// If there is no parent goal, this will be added underneath the model of the Project
			else
				parentNode = p.getModel();
		} else {
			// The metamodel for grouped feature is no different from that of solitary feature.
			curGoalFeature = MetaModel.createFeatureWithProperties(goalName, goalName, ConfigState.UNDECIDED_LITERAL, ValueType.NONE_LITERAL, null, null, 0, 1, p.getMetaModel());
			// parent node will be the FeatureGroup, which is the only child of the feature corresponding to the parent goal
			parentNode = (Node)traceability.get(FMPGoalModelLoader.getParent(curGoal)).getChildren().get(0);
		}
		// Let's add it to the parent feature before we forget.
		if(parentNode != null)
			parentNode.getChildren().add(curGoalFeature);
		// Put traceability link as requqired
		traceability.put(curGoal, curGoalFeature);		
		// For (X)OR groups, add a FeatureGroup directly under
		if(curGoal.getDecompositions().size()>0 
				&&  curGoal.getDecompositions().get(0) instanceof OrDecomposition)
		{
			int maxCardinality = curGoal.getExclusive()? 1: curGoal.getDecompositions().size();
			curGoalFeature.getChildren().add(MetaModel.createFeatureGroupWithProperties("Group", 1, maxCardinality, p.getMetaModel()));
		}
		// Go through the subgoals
		for(Object subGoal: curGoal.getDecompositions())
		{
			simpleOutputGoal(((Decomposition)subGoal).getTarget());
		}		
	}

	@Override
	public void generateModel(Resource input, String output_file) {
		super.pe = FmpPackage.eINSTANCE;
		super.pf = FmpPackage.eINSTANCE.getFmpFactory();
		super.generateModel(input, output_file);
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public void createDocument(EFactory f, Resource input, Resource resource) {
		p = MetaModel.makeProject();
		NodeIdDictionary.INSTANCE.visit(null, p.getModel());
		NodeIdDictionary.INSTANCE.visit(null, p.getMetaModel());
		NodeIdDictionary.INSTANCE.visit(null, p.getMetaMetaModel());		
		resource.getContents().add(p);
	    for (Iterator i = input.getResourceSet().getAllContents();
         i.hasNext(); ) {
	    	Object o = i.next();
	    	if (o instanceof Intention) {
	    		Intention g = (Intention) o;
	    		String an = getActorName(g);
	    		if (an.equals("") && FMPGoalModelLoader.getParent(g)== null) { // is a root goal
	    			outputGoalEntry(g);
	    		}
	    	} else if (o instanceof Container) {
	    		Container a = (Container) o;
    			EList l = a.getIntentions();
	    		for (int j =0; j < l.size(); j++) {
	    			Intention root = (Intention) l.get(j);
	    			outputGoalEntry(root);
	    		}
	    	}
	    }
	}

	public static void main(String args[]) {
		if (args[0].endsWith(".goalmodel")) {
			if (args[1].endsWith(".fmp")) {
				GoalModel_FeatureModel r = new GoalModel_FeatureModel();
				r.convert(args[0], args[1]);
			}
		}		
	}	
	
}
