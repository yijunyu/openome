/*
 * Created on Mar 22, 2005
 */
package convertor;

import java.io.File;
import java.io.InputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Vector;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.resource.Resource;

import parser.GoalModelLoader;
import util.Computing;
import util.D;
import wbimodel.test;

import com.ibm.wbim.bom.schema1.ModelType;

import edu.toronto.cs.openome_model.AndDecomposition;
import edu.toronto.cs.openome_model.ConflictLabel;
import edu.toronto.cs.openome_model.Container;
import edu.toronto.cs.openome_model.Decomposition;
import edu.toronto.cs.openome_model.DeniedLabel;
import edu.toronto.cs.openome_model.Intention;
import edu.toronto.cs.openome_model.OrDecomposition;
import edu.toronto.cs.openome_model.PartiallyDeniedLabel;
import edu.toronto.cs.openome_model.PartiallySatisfiedLabel;
import edu.toronto.cs.openome_model.SatisfiedLabel;
import edu.toronto.cs.openome_model.Softgoal;

public class GoalModel_WBIModel extends GoalModelLoader {
	
	private com.ibm.wbim.bom.schema1.Process myprocess;
	/**
	 * Traverse the goal model to output the WBI model
	 * There are five rules:
	 *   1. A leaf goal is converted into a task, the start/stop are the same
	 *   2. A sequentially decomposed AND goal is converted into a sequence of tasks, the start of the 
	 *       parent goal is the first child task's start, and the stop of the parent goal is the last child task's
	 *       stop. A child task's stop is connected with the next child task's start
	 *   3. A parallelly decomposed AND goal is converted into a fork of the child tasks and join them:
	 *       The start of the parent goal is the fork, the stop of the parent goal is the join;
	 *       The fork is connected with the start of each child task and the join is connected with the
	 *       stop of each child task
	 *   4. A runtime decomposed OR goal is converted into an decision task followed by a branch to 
	 *      the child tasks.
	 *      The start of the parent goal is the decision task, the stop of the parent goal is the join;
	 *      The decison task is connected with the branch; the branch is connected with each child task's start;
	 *      each child task's stop is connected with the join;
	 *   5. A singleton AND or OR decomposed goal is simply skipped:
	 *      The start/stop of the parent goal is simply that of its child task. 
	 * @param resource
	 */
	private void create_wbi_model(Resource resource) {
		HashMap<Integer, Intention> hm = new HashMap<Integer, Intention>(); // id => Intention
		HashSet<Intention> hs = new HashSet<Intention>(); // processed Intention
		HashSet<Intention> sat = new HashSet<Intention>(); // satisficed Intention
		boolean converting;
		Intention root = null;
		do {
			converting = false;
			for (Intention g: Intentions) {
				if (is_soft_Intention(g))
					continue;
				if(!is_satisfied(g)) 
					continue;
				Integer i = Intention_ids.get(g);
				hm.put(i, g);
				sat.add(g);
			}
			for (Intention g: sat) {
				if (hs.contains(g)) // the Intention has been processed
					continue;
				boolean isLeaf = true;
				boolean isAND = is_and(g);
				boolean isSeq = is_seq(g);
				boolean isPar = is_par(g);
				boolean isOR = is_or(g);
				EList subIntentions = g.getDecompositions();
				for (int i=0; i<subIntentions.size(); i++) {
					Intention s = ((Decomposition) subIntentions.get(i)).getTarget();
					Integer si = Intention_ids.get(s);
					Intention h = hm.get(si);
					if (h!=null && !hs.contains(h)) {
						isLeaf = false;
						break;
					}
				}
				boolean isRuntimeOR = true;
				if (isOR && isLeaf) {
					for (int i=0; i<subIntentions.size(); i++) {
						Intention s = (Intention) subIntentions.get(i);
						if (s.getRule().size()>0) {
							isRuntimeOR = false;
							break;
						}
					}
				}
				// count the number of children
				Vector<Intention> children = new Vector<Intention>();
				if ((isAND || isOR) && isLeaf) {
					for (int i=0; i<subIntentions.size(); i++) {
						Intention s = (Intention) subIntentions.get(i);
						if (sat.contains(s))
							children.add(s);
					}
				}
				if (isLeaf) {
					hs.add(g);
					converting = true;
					String s = "";
					String childrenNames[] = new String[children.size()];
					int ic = 0;
					for (Intention c: children) {
						childrenNames[ic] = Computing.strip_quote(c.getName());
						ic ++;
					}
					if (isAND && children.size() >1) {
						if (isSeq) { // AND-SEQ
							s += "AND-SEQ";
							test.sequentialComposition(myprocess, Computing.strip_quote(g.getName()), 
									childrenNames);
						} else if (isPar) { // AND-PAR
							s += "AND-PAR";
							test.parallelComposition(myprocess, Computing.strip_quote(g.getName()), 
									childrenNames);
						}
					} else if (isOR && children.size() > 1) {
						if (isRuntimeOR) { // RUNTIME-OR
							s += "OR-RUNTIME";
							test.runtimeORComposition(myprocess, Computing.strip_quote(g.getName()), 
									childrenNames, false);
						} else { // DESIGN-TIME OR
							s += "OR-DESIGNTIME";
						}
					} else if (children.size()==1) { // REFINEMENT
						s += "REFINEMENT";
						test.refinement(Computing.strip_quote(g.getName()), 
								Computing.strip_quote((children.get(0)).getName()));
					} else { // LEAF
						s += "LEAF";
						test.addLeaf(myprocess, Computing.strip_quote(g.getName()));
					}
					root = g;
					D.o(s + " : " + Computing.strip_quote(g.getName()));
					if (isOR || isAND)
						for (Intention c: children)
							D.o(" -- " + Computing.strip_quote(c.getName()));
				}
			}
		} while (converting);
		if (root!=null) {
			test.addStartNode(myprocess, 
					Computing.strip_quote(root.getName()));
			test.addStopNode(myprocess, 
					Computing.strip_quote(root.getName()));
		}
	} 
	private boolean is_par(Intention g) {
		return g.getParallel();
	}
	private boolean is_seq(Intention g) {
		return g.getSequential();
	}
	private boolean is_and(Intention g) {
		return g.getDecompositions().size()>0 &&  g.getDecompositions().get(0) instanceof AndDecomposition;
	}
	private boolean is_or(Intention g) {
		return g.getDecompositions().size()>0 &&  g.getDecompositions().get(0) instanceof OrDecomposition;
	}
	private boolean is_satisfied(Intention g) {
		return g.getLabel() instanceof SatisfiedLabel;
	}
	private boolean is_soft_Intention(Intention g) {
		return g instanceof Softgoal;
	}		
	@Override
	@SuppressWarnings("unchecked")
	public void createDocument(EFactory f, Resource input, Resource resource) {
		ModelType model = test.createModel(resource);
		myprocess = test.init_process(model);
		this.resource = input;
		collect_Intentions();
		create_wbi_model(resource);
		test.output_model(resource, model);
	}

	@SuppressWarnings("unchecked")
	public void generateModel(Resource input, String output_file) {
		super.generateModel(input, output_file + ".xmi");
		String xslt = "WBIM.xsl";
		TransformerFactory factory = TransformerFactory
				.newInstance();
		try {
			D.o("xsltproc " + xslt + " "  + output_file + ".xmi" + ">" + output_file);
			Transformer transformer_info;
			InputStream xs = GoalModel_WBIModel.class.getResourceAsStream(xslt);
			if (xs==null)
				D.o(xslt + " not found");
			transformer_info = factory
				.newTransformer(new StreamSource(xs));
			transformer_info.transform(
					new StreamSource(new File(output_file + ".xmi")),
					new StreamResult(output_file));
		} catch (TransformerException e) {
			e.printStackTrace();
		}
	}	
	
	Hashtable<Intention, Integer> Intention_ids = new Hashtable<Intention, Integer>();
	Vector<Intention> Intentions = new Vector<Intention>();

	private void collect_goals() {
		for (Iterator i = resource.getResourceSet().getAllContents();
	       i.hasNext(); ) {
	    	Object o = i.next();
	    	if (o instanceof Intention) {
	    		Intention p = (Intention) o;
	    		collect_goals(p);
	    	} else if (o instanceof Container) {
	    		Container a = (Container) o;
    			EList l = a.getIntentions();
	    		for (int j =0; j < l.size(); j++) {
	    			Intention root = (Intention) l.get(j);
	    			collect_goals(root);
	    		}	    		
	    	}	    	
		}
	}
	private void collect_goals(Intention root) {
		add_a_goal(root); 
		EList subgoals = root.getDecompositions();
		for (int j=0; j < subgoals.size(); j++) {
			Intention s = ((Decomposition) subgoals.get(j)).getTarget();
			collect_goals(s);
		}
	}

	private void add_a_goal(Intention root) {
		Intention_ids.put(root, Intentions.size());
		Intentions.add(root);
	}

	
	static void main(String args[]) {
		if (args[0].endsWith(".goalmodel")) {
			if (args[1].endsWith(".schema1")) {
				GoalModelLoader r = new GoalModel_WBIModel();
				r.convert(args[0], args[1]);
			}
		}		
	}	
	
}
