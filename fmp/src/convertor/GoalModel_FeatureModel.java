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
import ca.uwaterloo.gp.fmp.Feature;
import ca.uwaterloo.gp.fmp.FmpFactory;
import ca.uwaterloo.gp.fmp.FmpPackage;
import ca.uwaterloo.gp.fmp.Node;
import ca.uwaterloo.gp.fmp.Project;
import ca.uwaterloo.gp.fmp.TypedValue;
import ca.uwaterloo.gp.fmp.system.MetaModel;
import ca.uwaterloo.gp.fmp.system.ModelManipulation;
import ca.uwaterloo.gp.fmp.system.NodeIdDictionary;
import ca.uwaterloo.gp.fmp.system.RoleQuery;
import edu.toronto.cs.goalmodel.DecompositionType;
import edu.toronto.cs.goalmodel.actor;
import edu.toronto.cs.goalmodel.goal;

public class GoalModel_FeatureModel extends GoalModelLoader {
	
	Hashtable<goal, Feature> traceability = new Hashtable<goal, Feature>();

	Project p = null;
	@SuppressWarnings("unchecked")
	public void outputGoal(FmpFactory pf, 
			EObject r, goal root, int indent) {
		String n = root.getName();
		Feature owner = null;
		if (indent==0 && p ==null && r instanceof Project ) { // is root
			p = (Project) r;
			owner = p.getModel();
		} else if (r instanceof Feature ){
			owner = (Feature) r;
		} else if (r instanceof Project) {
			p = (Project) r;
			owner = p.getModel();			
		}
 		Feature metaFeature;
		// by default 0 for feature
		int i = 0;		
		if (RoleQuery.INSTANCE.getLocationType((Node) owner) == RoleQuery.MODEL)
			metaFeature = (Feature) MetaModel.getMetaModel(owner).getChildren().get(i);
		else if (RoleQuery.INSTANCE.getLocationType((Node) owner) == RoleQuery.METAMODEL)
			metaFeature = (Feature) MetaModel.getMetaMetaModel(owner).getChildren().get(i);
		else 
			metaFeature = null;
		Feature f = pf.createFeature();
		/**
		 * Michal: we need to make sure root feature has cardinality 1..1
		 */
		if (RoleQuery.INSTANCE.getNodeType((Node) f) == RoleQuery.ROOT_FEATURE) {
			f.setMin(1);
			f.setMax(1);
		}
		if(metaFeature != null)
		{
			Feature newProperties = (Feature) ModelManipulation.INSTANCE.configureTree(metaFeature);
			for (int j=0; j<newProperties.getChildren().size(); j++) {
				Feature a = (Feature) newProperties.getChildren().get(j);
				if (a.getName().equals("Name")) {
					TypedValue v = pf.createTypedValue();
					v.setStringValue(n);
					((Feature) newProperties.getChildren().get(j)).setTypedValue(v);
				} else if (a.getName().equals("Min")) {
					TypedValue v = pf.createTypedValue();
					v.setIntegerValue(new Integer(1));
					((Feature) newProperties.getChildren().get(j)).setTypedValue(v);					
				} else if (a.getName().equals("Max")) {
					TypedValue v = pf.createTypedValue();
					v.setIntegerValue(new Integer(1));
					((Feature) newProperties.getChildren().get(j)).setTypedValue(v);					
				}
			}
			f.setName(n);
			f.setMax(1);
			f.setMin(1);
			f.setProperties(newProperties);
			NodeIdDictionary.INSTANCE.visit(null, newProperties);
		}		
		NodeIdDictionary.INSTANCE.visit(null, f);
		@SuppressWarnings("unused")
		Node configuredModelChild = ModelManipulation.INSTANCE.configureTree(f);
		owner.getChildren().add(f);
		traceability.put(root, f);
		goal parent = root.getParent();
		if (parent!=null) {
			DecompositionType t = parent.getType();
			if (t == DecompositionType.AND_LITERAL) {
				f.setMin(1);
				f.setMax(1);
			} else {
				f.setMin(0);
				f.setMax(1);
			}
		}
		EList subgoals = root.getGoal();
		for (int j=0; j < subgoals.size(); j++) {
			goal s = (goal) subgoals.get(j);
			outputGoal(pf, f, s, indent+1);
		}
//		EList contributions = root.getRule();
//		EList dependencies = root.getDependencyTo();
//		for (int j=0; j < contributions.size(); j++) {
//			contribution c = (contribution) contributions.get(j);
//		}
//		for (int j=0; j < dependencies.size(); j++) {
//			dependency d = (dependency) dependencies.get(j);
//			goal to = d.getDependencyTo();
//		}
	}
	
	public void generateModel(Resource input, String output_file) {
		super.pe = FmpPackage.eINSTANCE;
		super.pf = FmpPackage.eINSTANCE.getFmpFactory();
		super.generateModel(input, output_file);
	}
	
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
