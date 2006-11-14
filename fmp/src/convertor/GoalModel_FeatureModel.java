/*
 * Created on Mar 22, 2005
 */
package convertor;

import java.util.Hashtable;
import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import parser.GoalModelLoader;
import ca.uwaterloo.gp.fmp.ConfigState;
import ca.uwaterloo.gp.fmp.Feature;
import ca.uwaterloo.gp.fmp.FeatureGroup;
import ca.uwaterloo.gp.fmp.FmpFactory;
import ca.uwaterloo.gp.fmp.FmpPackage;
import ca.uwaterloo.gp.fmp.Node;
import ca.uwaterloo.gp.fmp.Project;
import ca.uwaterloo.gp.fmp.TypedValue;
import ca.uwaterloo.gp.fmp.ValueType;
import ca.uwaterloo.gp.fmp.system.MetaModel;
import ca.uwaterloo.gp.fmp.system.ModelManipulation;
import ca.uwaterloo.gp.fmp.system.NodeIdDictionary;
import ca.uwaterloo.gp.fmp.system.RoleQuery;
import edu.toronto.cs.goalmodel.DecompositionType;
import edu.toronto.cs.goalmodel.ModeType;
import edu.toronto.cs.goalmodel.actor;
import edu.toronto.cs.goalmodel.goal;

public class GoalModel_FeatureModel extends GoalModelLoader {
	
	Hashtable<goal, Feature> traceability = new Hashtable<goal, Feature>();

	Project p = null;
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
	public void outputGoal(FmpFactory pf, 
			EObject r, goal root, int indent) {
		if (root==null) return;
		String n = root.getName();
		if (root.getMode()!=ModeType.HARD_LITERAL) {
			// TODO: softgoal 
			return;
		}
		Feature owner = setOwner(r, indent);
 		Feature metaFeature = getMetaFeature(owner);
		if(metaFeature == null) return;
		int nChild = root.getGoal().size();
		Range r1 = getRange(root, owner, nChild);
		Feature f = createFeature(pf, n, metaFeature);
		if (nChild>1 && !(r1.min == nChild && r1.max== nChild)) { // There is variability
			Feature metaFeatureGroup = getMetaFeatureGroup(owner);
			FeatureGroup fg = pf.createFeatureGroup();
			setProperties(pf, r1.min, r1.max, metaFeatureGroup, fg);			
			NodeIdDictionary.INSTANCE.visit(null, fg);
			f.getChildren().add(fg);
			// TODO
//			Feature newConfiguration = (Feature) ModelManipulation.INSTANCE.configureTree((Node) f);
//			NodeIdDictionary.INSTANCE.visit(null, newConfiguration);
//			newConfiguration.setDescribedNode(f);
//			f.setState(newConfiguration.getState());
//			f.getChildren().add(newConfiguration);
		} else {
			setProperties(pf, n, r1.min, r1.max, metaFeature, f);
		}
		owner.getChildren().add(f);
		NodeIdDictionary.INSTANCE.visit(null, f);
		traceability.put(root, f);
		EList subgoals = root.getGoal();
		for (int j=0; j < subgoals.size(); j++) {
			goal s = (goal) subgoals.get(j);
			outputGoal(pf, f, s, indent+1);
		}
	}

	private void setProperties(FmpFactory pf, int min, int max, Feature metaFeatureGroup, FeatureGroup fg) {
		Feature newProperties = (Feature) ModelManipulation.INSTANCE.configureTree(metaFeatureGroup);
		for (Object a: newProperties.getChildren())
			setProperty(pf, min, max, (Feature) a, fg);
		fg.setProperties(newProperties);
		NodeIdDictionary.INSTANCE.visit(null, newProperties);
		fg.setProperties(newProperties);
	}

	private void setProperty(FmpFactory pf, int min, int max, Feature a, FeatureGroup fg) {
		if (a.getName().equals("Min")) {
			TypedValue v = pf.createTypedValue();
			v.setIntegerValue(new Integer(min));
			a.setTypedValue(v);					
			fg.setMin(min);
		} else if (a.getName().equals("Max")) {
			TypedValue v = pf.createTypedValue();
			v.setIntegerValue(new Integer(max));
			a.setTypedValue(v);				
			fg.setMax(max);
		}
	}

	private Range getRange(goal root, Feature owner, int nChild) {
		Range r = new Range();
		if (RoleQuery.INSTANCE.getNodeType(owner) == RoleQuery.ROOT_FEATURE) {
			r.setMin(1);
			r.setMax(1);
		}
		DecompositionType t = root.getType();
		if (t == DecompositionType.AND_LITERAL) { // AND
			r.setMin(nChild);
			r.setMax(nChild);
		} else if (t == DecompositionType.OR_LITERAL){ // OR
			if (root.getExclusive()) { // XOR
				r.setMin(1);
				r.setMax(1);
			} else { // inclusive OR
				r.setMin(1);
				r.setMax(nChild);
			}
		} else {  // LEAF
			if (root.getSystem()) {// MANDATORY
				r.setMin(1);
				r.setMax(1);
		    } else { // OPTIONAL
				r.setMin(0);
				r.setMax(1);
		    }
		}
		return r;
	}

	private Feature getMetaFeature(Feature owner) {
		Feature metaFeature;
		int i = 0;		
		if (RoleQuery.INSTANCE.getLocationType(owner) == RoleQuery.MODEL)
			metaFeature = (Feature) MetaModel.getMetaModel(owner).getChildren().get(i);
		else if (RoleQuery.INSTANCE.getLocationType(owner) == RoleQuery.METAMODEL)
			metaFeature = (Feature) MetaModel.getMetaMetaModel(owner).getChildren().get(i);
		else 
			metaFeature = null;
		return metaFeature;
	}

	private Feature setOwner(EObject r, int indent) {
		Feature owner = null;
		if (indent==0 && p ==null && r instanceof Project ) { 
			// is root
			p = (Project) r;
			owner = p.getModel();
		} else if (r instanceof Feature ){
			owner = (Feature) r;
		} else if (r instanceof Project) {
			p = (Project) r;
			owner = p.getModel();			
		}
		return owner;
	}


	private void setProperties(FmpFactory pf, String name, int min, int max, Feature metaFeature, Feature f) {
		Feature newProperties = (Feature) ModelManipulation.INSTANCE.configureTree(metaFeature);
		for (Object a: newProperties.getChildren())
			setProperty(pf, name, min, max, (Feature) a, f);
        f.setProperties(newProperties);
		NodeIdDictionary.INSTANCE.visit(null, newProperties);
	}

	private void setProperty(FmpFactory pf, String name, int min, int max, Feature a, Feature f) {
		if (a.getName().equals("Name")) {
			TypedValue v = pf.createTypedValue();
			v.setStringValue(name);
			a.setTypedValue(v);
			f.setName(name);
		}
		if (min < max) {
			if (a.getName().equals("Min")) {
				TypedValue v = pf.createTypedValue();
				v.setIntegerValue(new Integer(min));
				a.setTypedValue(v);					
				f.setMin(min);
			} else if (a.getName().equals("Max")) {
				TypedValue v = pf.createTypedValue();
				v.setIntegerValue(new Integer(max));
				a.setTypedValue(v);				
				f.setMax(max);
			}			
		}
	}

	private Feature getMetaFeatureGroup(Feature owner) {
		int i = 1;
		Feature metaFeatureGroup;
		if (RoleQuery.INSTANCE.getLocationType(owner) == RoleQuery.MODEL)
			metaFeatureGroup = (Feature) MetaModel.getMetaModel(owner).getChildren().get(i);
		else if (RoleQuery.INSTANCE.getLocationType(owner) == RoleQuery.METAMODEL)
			metaFeatureGroup = (Feature) MetaModel.getMetaMetaModel(owner).getChildren().get(i);
		else 
			metaFeatureGroup = null;
		return metaFeatureGroup;
	}

	private Feature createFeature(FmpFactory pf, String n, Feature metaFeature) {
		Feature newProperties = (Feature) ModelManipulation.INSTANCE.configureTree(metaFeature);
		Feature f = pf.createFeature();
		for (int j=0; j<newProperties.getChildren().size(); j++) {
			Feature a = (Feature) newProperties.getChildren().get(j);
			if (a.getName().equals("Name")) {
				TypedValue v = pf.createTypedValue();
				v.setStringValue(n);
				a.setTypedValue(v);
			} else if (a.getName().equals("Min")) {
				TypedValue v = pf.createTypedValue();
				v.setIntegerValue(new Integer(1));
				a.setTypedValue(v);					
				MetaModel.setFeatureAttributes(f, "Min", "Min", 
						ConfigState.UNDECIDED_LITERAL, 
						ValueType.INTEGER_LITERAL, 
						v, new Integer(0), 1, 1);		
			} else if (a.getName().equals("Max")) {
				TypedValue v = pf.createTypedValue();
				v.setIntegerValue(new Integer(1));
				a.setTypedValue(v);					
				MetaModel.setFeatureAttributes(f, "Max", "Max", 
						ConfigState.UNDECIDED_LITERAL, 
						ValueType.INTEGER_LITERAL, 
						v, new Integer(0), 1, 1);		
			}
		}
		NodeIdDictionary.INSTANCE.visit(null, newProperties);
		Feature newConfiguration = (Feature) ModelManipulation.INSTANCE.configureTree(f);
		NodeIdDictionary.INSTANCE.visit(null, newConfiguration);
		f.setProperties(newProperties);			
		NodeIdDictionary.INSTANCE.visit(null, f);
		return f;
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
		FmpFactory pf = (FmpFactory) f;
		Project r = MetaModel.makeProject();
		resource.getContents().add(r);
	    for (Iterator i = input.getResourceSet().getAllContents();
         i.hasNext(); ) {
	    	Object o = i.next();
	    	if (o instanceof goal) {
	    		goal g = (goal) o;
	    		String an = getActorName(g);
	    		if (an.equals("") && g.getParent() == null) { // is a root goal
	    			outputGoal(pf, r, g, 0);
	    		}
	    	} else if (o instanceof actor) {
	    		actor a = (actor) o;
    			EList l = a.getGoals();
	    		for (int j =0; j < l.size(); j++) {
	    			goal root = (goal) l.get(j);
	    			outputGoal(pf, r, root, 0);
	    		}
	    	}
	    }
	}

	static void main(String args[]) {
		if (args[0].endsWith(".goalmodel")) {
			if (args[1].endsWith(".fmp")) {
				GoalModel_FeatureModel r = new GoalModel_FeatureModel();
				r.convert(args[0], args[1]);
			}
		}		
	}	
	
}
