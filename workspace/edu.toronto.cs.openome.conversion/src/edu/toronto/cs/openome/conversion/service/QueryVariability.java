package edu.toronto.cs.openome.conversion.service;

import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Vector;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.sat4j.minisat.SolverFactory;
import org.sat4j.reader.InstanceReader;
import org.sat4j.reader.Reader;
import org.sat4j.specs.IProblem;
import org.sat4j.specs.ISolver;
import org.sat4j.tools.ModelIterator;

import util.Computing;
import edu.toronto.cs.openome.conversion.parser.GoalModelReader;
import edu.toronto.cs.openome_model.BreakContribution;
import edu.toronto.cs.openome_model.Container;
import edu.toronto.cs.openome_model.Contribution;
import edu.toronto.cs.openome_model.Decomposition;
import edu.toronto.cs.openome_model.EvaluationLabel;
import edu.toronto.cs.openome_model.HelpContribution;
import edu.toronto.cs.openome_model.HurtContribution;
import edu.toronto.cs.openome_model.Intention;
import edu.toronto.cs.openome_model.MakeContribution;
import edu.toronto.cs.openome_model.Model;
import edu.toronto.cs.openome_model.OrDecomposition;
import edu.toronto.cs.openome_model.Softgoal;
import edu.toronto.cs.openome_model.openome_modelFactory;
import edu.toronto.cs.openome_model.openome_modelPackage;

@SuppressWarnings("restriction")
public class QueryVariability implements IConfigurator {

	public openome_modelPackage e = null;
	public openome_modelFactory f = null;
	public Resource resource;

	public QueryVariability() {
		e = openome_modelPackage.eINSTANCE;
		f = e.getopenome_modelFactory();		
	}
	public QueryVariability(Resource r) {		
		e = openome_modelPackage.eINSTANCE;
		f = e.getopenome_modelFactory();
		setModel(r);		
	}
	private void setModel(Resource r) {
		resource = r;
	}
	HashSet<Intention> FS_goals = new HashSet<Intention>();
	HashSet<Intention> FD_goals = new HashSet<Intention>();
	HashSet<Intention> PS_goals = new HashSet<Intention>();
	HashSet<Intention> PD_goals = new HashSet<Intention>();
	HashSet<Intention> CF_goals = new HashSet<Intention>();
	HashSet<Intention> UN_goals = new HashSet<Intention>();
	HashSet<Intention> VAR_goals = new HashSet<Intention>();
	Hashtable<Intention, HashSet<Intention>> configurations 
		= new Hashtable<Intention, HashSet<Intention> >();  
	
	Hashtable<Intention, Integer> goal_ids = new Hashtable<Intention, Integer>();
	HashSet<Intention> Intentions = new HashSet<Intention>();
	HashSet<Contribution> Contributions = new HashSet<Contribution>();
	HashSet<Decomposition> Decompositions= new HashSet<Decomposition>();

	private void collect_goals() {
		for (Resource o: resource.getResourceSet().getResources()){ 
	    	if (o instanceof Intention) {
	    		Intention p = (Intention) o;
	    		collect_goals(p);
	    	} else if (o instanceof Container) {
	    		Container a = (Container) o;
    			EList<Intention> l = a.getIntentions();
	    		for (int j =0; j < l.size(); j++) {
	    			Intention root = (Intention) l.get(j);
	    			collect_goals(root);
	    		}	    		
	    	} else if (o instanceof Resource){
	    		Model m = (Model) o.getContents().get(0);
    			EList<Intention> l = m.getIntentions();
    			Contributions.addAll(m.getContributions());
    			Decompositions.addAll(m.getDecompositions());
	    		for (int j =0; j < l.size(); j++) {
	    			Intention root = (Intention) l.get(j);
	    			collect_goals(root);
	    		}	    		
	    	}
		}
	}

	HashSet< HashMap <Intention, HashSet<Intention> > > reports
	 = new HashSet< HashMap <Intention, HashSet<Intention> > >();
	
	public void init() {
		Intentions = new HashSet<Intention>();
		goal_ids = new Hashtable<Intention, Integer>();
		collect_goals();
		StringBuffer graphStr = encode();
		ISolver solver = SolverFactory.newDefault();
		solver.setTimeout(3600); // 1 hour timeout
		ModelIterator mi = new ModelIterator(solver);
		Reader reader = new InstanceReader(mi);

		PrintWriter p;
		try {
			p = new PrintWriter(new FileOutputStream(Computing.getTempFilename("file.txt")), true);
			String gs = graphStr.toString(); 
			if (gs.endsWith("\n")) {
				gs = gs.substring(0, gs.length()-1);
			}
			p.println(gs);			
//			DimacsReader reader = new DimacsReader(solver);
			IProblem problem = reader.parseInstance(Computing.getTempFilename("file.txt"));
			boolean unsat = true;
			while (solver.isSatisfiable()) {
				unsat = false;
				int [] model = problem.model();
				String result = reader.decode(solver.model());
				decode(result);
				configuring_variability_goals();
				reports.add(report());
			}
			if (!unsat) {
				System.out.println("satisfiable: there are " + reports.size() + " solutions." );
			} else {
				System.out.println("unsatisfiable");				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private HashMap<Intention, HashSet<Intention>> report() {
		HashMap<Intention, HashSet<Intention>> r = new 
		 HashMap<Intention, HashSet<Intention>>();
		for (Enumeration<Intention> e = configurations.keys(); e.hasMoreElements(); )
		{
			Intention g = e.nextElement();
			HashSet<Intention> config = configurations.get(g);
			if (config.size()>0) {
				System.out.print(g.getName() + ":");				
				HashSet<Intention> selected = r.get(g);
				if (selected == null)
					selected = new HashSet<Intention> ();
				for (Intention c: config) {
					selected.add(c);
					System.out.print(" " + c.getName());
				}
				r.put(g, selected);
				System.out.println();
			}
		}
		return r;
	}

	private void configuring_variability_goals() {
		VAR_goals = new HashSet<Intention>();
		configurations = new Hashtable<Intention, HashSet<Intention> >();  
		for (Intention g: Intentions) {
			for (Decomposition d: Decompositions) {
				if (d instanceof OrDecomposition && g == d.getTarget()) {					
					VAR_goals.add(g);
					HashSet<Intention> subgoals = configurations.get(g);
					if (subgoals == null)
						subgoals = new HashSet<Intention>();
					Intention s = d.getSource();
					if (FS_goals.contains(s)|| PS_goals.contains(s)) {
						subgoals.add(s);
					}
					configurations.put(g, subgoals);
				}
			}
		}
	}
	
	private void collect_goals(Intention root) {
		add_a_goal(root); 
		EList<Decomposition> subgoals = root.getDecompositions();
		for (int j=0; j < subgoals.size(); j++) {
			Intention s = ((Decomposition) subgoals.get(j)).getTarget();
			collect_goals(s);
		}
	}

	private void add_a_goal(Intention root) {
		if (goal_ids.get(root) == null) {
			goal_ids.put(root, Intentions.size());
			Intentions.add(root);
			if (root.getQualitativeReasoningCombinedLabel() == EvaluationLabel.SATISFIED ) {
				FS_goals.add(root);
			} else if (root.getQualitativeReasoningCombinedLabel() == EvaluationLabel.DENIED ) {
				FD_goals.add(root);
			} else if (root.getQualitativeReasoningCombinedLabel() == EvaluationLabel.WEAKLY_SATISFIED ) {
				PS_goals.add(root);
			} else if (root.getQualitativeReasoningCombinedLabel() == EvaluationLabel.WEAKLY_DENIED ) {
				PD_goals.add(root);
			} else if (root.getQualitativeReasoningCombinedLabel() == EvaluationLabel.CONFLICT ) {
				CF_goals.add(root);
			} else {
				UN_goals.add(root);
			}
		}
	}
	private boolean is_or(Decomposition to) {
		return to instanceof OrDecomposition;
	}
	private boolean is_runtime_or(Decomposition to) {
		return false;
	}
	private Vector<Intention> getDecompositions(Decomposition to) {
		Vector<Intention> children = new Vector<Intention>();
		return children;
	}
	public static void main(String[] args) {
		QueryVariability q = new QueryVariability();
		q.setModel("test/bpm07.oom");
		System.out.println(q.query("Apply Process To Customer"));
//		q.setModel("test/ex1.oom");
//		q.setModel("test/ex2.oom");
//		q.setModel("test/ex3.oom");
//		q.query("a");
//		q.query("b");
	}
	/**
	 * 
	 * @param name -- the name of an OR-Intention
	 * @return -- the alternative subgoal selected to fulfil the OR-Intention
	 */
	public String query(String name) {
		System.out.println(name + ": "); 
		for (HashMap<Intention, HashSet<Intention>> r: reports) {
			System.out.println(answer(r, name));
		}
		return "";
	}
	public void setModel(String name) {
		GoalModelReader rdr = new GoalModelReader();
		Resource r = rdr.read(name);
		setModel(r);
		init();
	}

	private String answer(HashMap<Intention, HashSet<Intention>> report, String name) {
		String found = "";
		for (Enumeration<Intention> e = configurations.keys(); e.hasMoreElements(); )
		{
			Intention g = e.nextElement();
			if (!g.getName().equalsIgnoreCase(name))
				continue;
			HashSet<Intention> config = report.get(g);
			if (config != null && config.size()>0) {
//				System.out.println(config);			
				for (Intention c: config) {
					found = found + " " + c.getName();
				}
			}
		}
		if (found.equals(""))
			return "not found";
		return found;
	}
	
	int FSID(int g) {
		return 4 * g + 1;
	}

	int PSID(int g) {
		return 4 * g + 2;
	}

	int FDID(int g) {
		return 4 * g + 3;
	}

	int PDID(int g) {
		return 4 * g + 4;
	}

	int FS(Intention p) {		
		return FSID(goal_ids.get(p).intValue());
	}

	/**
	 * return 0 if no such literal for hard goal
	 * 
	 * @param p
	 * @return
	 */
	int PS(Intention p) {
		if (p instanceof Softgoal)
			return PSID(goal_ids.get(p).intValue());
		return 0;
	}

	/**
	 * return -FS for hard goal
	 * 
	 * @param p
	 * @return
	 */
	int FD(Intention p) {
		return FDID(goal_ids.get(p).intValue());
	}

	/**
	 * return 0 if no such literal for hard goal
	 * 
	 * @param p
	 * @return
	 */
	int PD(Intention p) {
		if (p instanceof Softgoal)
			return PDID(goal_ids.get(p).intValue());
		return 0;
	}

	int numClauses = 0;

	/**
	 * Create the suitabe input in the DiMacs format that SAT4J solver can read
	 * 
	 * A hard goal is encoded into FS for true, and FD for false A softgoal is
	 * encoded into FS, PS, PD, FD
	 * 
	 * Here the goal model is converted in 5 steps: 1. The rules to avoid
	 * conflicts: FS or PS => not PD and not FD 2. The axioms of the label
	 * lattice, i.e., FS => PS, FD => FD 3. The correlation rules, i.e., HELP,
	 * MAKE, BREAK, HURT 4. The AND/OR rules 5. The facts, i.e., the existing
	 * labels of the goals
	 * 
	 * @return a string in the DiMacs format
	 */
	private StringBuffer encode() {
		numClauses = 0;
		StringBuffer graphStr = new StringBuffer();
		StringBuffer step1 = new StringBuffer();
		StringBuffer step2 = new StringBuffer();
		StringBuffer step3 = new StringBuffer();
		StringBuffer step4 = new StringBuffer();
		StringBuffer step5 = new StringBuffer();
		int numVariables = 0;
		for (Intention p: Intentions) {
			step1.append(encode_1(p));
			step2.append(encode_2(p));
			step3.append(encode_3(p));
			step4.append(encode_4(p));
			step5.append(encode_5(p));
			// Yijun: to make sure enough literals are created
			numVariables = Math.max(numVariables, 4 * goal_ids.get(p).intValue() + 4);
		}
		graphStr.append(step1.toString());
		graphStr.append(step2.toString());
		graphStr.append(step3.toString());
		graphStr.append(step4.toString());
		graphStr.append(step5.toString());
		System.gc();
		StringBuffer gStr = new StringBuffer();
		gStr.append("p cnf ");
		gStr.append(numVariables);
		gStr.append(" ");
		numClauses = check_clause_count(graphStr);
		gStr.append(numClauses);
		gStr.append("\n");
		gStr.append(graphStr);
		return gStr;
	}

	/**
	 * @param graphStr
	 */
	private int check_clause_count(StringBuffer graphStr) {
		String a[] = graphStr.toString().split("\n");
		return a.length;
	}

	private String implies(int i, int j) {
		if (i == 0 || j == 0) // ignore these rules
			return "";
		numClauses++;
		return (i > 0 ? "-" + i : "" + (-i)) + " " + j + " 0\n";
	}

	private String implies(int i, String j) {
		if (i == 0) // ignore these rules
			return "";
		numClauses++;
		return (i > 0 ? "-" + i : "" + (-i)) + " " + j + " 0\n";
	}

	/**
	 * encode mutual exclusions to avoid conflicts
	 * 
	 * @param p
	 * @return
	 */
	private String encode_1(Intention p) {
		StringBuffer b = new StringBuffer();
		if (System.getProperty("Avoid Conflicts") != null
				|| System.getProperty("Avoid Conflicts Strictly") != null) {
			b.append(implies(FS(p), -FD(p)));
			if (System.getProperty("Avoid Conflicts Strictly") != null) {
				b.append(implies(FS(p), -PD(p)));
				b.append(implies(PS(p), -FD(p)));
				b.append(implies(PS(p), -PD(p)));
			}
		}
		return b.toString();
	}

	/**
	 * encode axiom FS => PS, FD => PD
	 */
	private String encode_2(Intention p) {
		StringBuffer b = new StringBuffer();
		b.append(implies(FS(p), PS(p)));
		b.append(implies(FD(p), PD(p)));
		return b.toString();
	}

	/**
	 * encode correlation links
	 * 
	 * @param p
	 * @return
	 */
	private String encode_3(Intention p) {
		StringBuffer b = new StringBuffer();
		for (Contribution l: Contributions) {
			Intention from = l.getSource(), to = l.getTarget();
			if (from == null || to == null) {
				System.out.println("warning: the model has wrong links " + from
						+ "->" + to);
				continue;
			}
			if (goal_ids.get(from).intValue() == goal_ids.get(p).intValue()) {
				if (l instanceof MakeContribution ) { // make
					b.append(implies(FS(p), FS(to)));
					b.append(implies(PS(p), PS(to)));
					b.append(implies(FS(to), FS(p)));
					b.append(implies(PS(to), PS(p)));
					if (System.getProperty("Balanced contributions") != null) {
						b.append(implies(FD(p), FD(to)));
						b.append(implies(PD(p), PD(to)));
						b.append(implies(FD(to), FD(p)));
						b.append(implies(PD(to), PD(p)));
					}
				} else if (l instanceof BreakContribution) { // break
					b.append(implies(FS(p), FD(to)));
					b.append(implies(PS(p), PD(to)));
					b.append(implies(FS(to), FD(p)));
					b.append(implies(PS(to), PD(p)));
					if (System.getProperty("Balanced contributions") != null) {
						b.append(implies(PD(p), PS(to)));
						b.append(implies(FD(p), FS(to)));
						b.append(implies(PD(to), PS(p)));
						b.append(implies(FD(to), FS(p)));
					}
				} else if (l instanceof HelpContribution) { // help
					b.append(implies(FS(p), PS(to)));
					if (p instanceof Softgoal) {
						b.append(implies(PS(to), "" + FS(p) + " " + PS(p)));
						b.append(implies(PS(p), PS(to)));
					}
					if (System.getProperty("Balanced contributions") != null) {
						b.append(implies(FD(p), PD(to)));
						if (p instanceof Softgoal) {
							b.append(implies(PD(to), "" + FD(p) + " " + PD(p)));
							b.append(implies(PD(p), PD(to)));
						}
					}
				} else if (l instanceof HurtContribution) { // hurt
					b.append(implies(FS(p), PD(to)));
					b.append(implies(PS(p), PD(to)));
					if (p instanceof Softgoal) {
						b.append(implies(PS(to), "" + FD(p) + " " + PD(p)));
					}
					if (System.getProperty("Balanced contributions") != null) {
						b.append(implies(FD(p), PS(to)));
						b.append(implies(PD(p), PS(to)));
						if (p instanceof Softgoal) {
							b.append(implies(PD(to), "" + FS(p) + " " + PS(p)));
						}
					}
				}
			}
		}
		return b.toString();
	}

	/**
	 * encode AND/OR decompositions
	 * 
	 * Exception: when all OR-decomposed children do not contribute to any softgoal, 
	 * they are regarded as AND-decomposed children for the reasoning.
	 * This exception can be turned on through a property 
	 *     "ome.reasoning.topdown.runtime_or".
	 *  
	 * @param p
	 * @return
	 */
	private String encode_4(Intention p) {
		StringBuffer b = new StringBuffer();
		StringBuffer step4i = new StringBuffer();
		boolean is_and = false;
		boolean is_or = false;
		StringBuffer step4iii = new StringBuffer();
		StringBuffer step4iv = new StringBuffer();
		StringBuffer step4v = new StringBuffer();
		StringBuffer step4vi = new StringBuffer();
		for (Decomposition l: Decompositions) {
			Intention from = l.getSource(), to = l.getTarget();
			if (from == null || to == null) {
				System.out.println("warning: the model has wrong links " + from
						+ "->" + to);
				continue;
			}
			if (goal_ids.get(to).intValue() == goal_ids.get(p).intValue()) {
				// contributions				
				if (! (is_or(l) || is_runtime_or(l))) {
					if (p instanceof Softgoal) {
						step4i.append(implies(PS(p), PS(from)));
					}
					step4i.append(implies(FS(p), FS(from)));
					step4iii.append(-FS(from) + " ");
					if (p instanceof Softgoal) {
						step4iv.append(-PS(from) + " ");
					}
					if (System.getProperty("Balanced contributions") != null) {
						if (p instanceof Softgoal) {
							step4i.append(implies(PD(from), PD(p)));
							step4i.append(implies(FD(from), FD(p)));
							step4v.append(PD(from) + " ");
							step4vi.append(FD(from) + " ");
						}
					}
					is_and = true;
				} else {
					step4i.append(implies(FS(from), FS(p)));
					if (p instanceof Softgoal) {
						step4i.append(implies(PS(from), PS(p)));
					}
					step4v.append(FS(from) + " ");
					if (p instanceof Softgoal && from instanceof Softgoal) {
						step4vi.append(PS(from) + " ");
					}
					if (System.getProperty("Balanced contributions") != null) {
						if (p instanceof Softgoal) {
							step4i.append(implies(PD(p), PD(from)));
							step4i.append(implies(FD(p), FD(from)));
						}
						if (p instanceof Softgoal) {
							if (from instanceof Softgoal)
								step4iii.append(-PD(from) + " ");
							step4iv.append(-FD(from) + " ");
						}
					}
					is_or = true;
				}
			}
		}
		if (is_and && is_or) {
			System.out
					.println("warning: the model has both AND and OR decompositions");
			return "";
		}
		if (is_and) {
			step4iii.append(FS(p) + " 0\n");
			numClauses++;
			if (p instanceof Softgoal) {
				step4iv.append(PS(p) + " 0\n");
				numClauses++;
			}
			if (System.getProperty("Balanced contributions") != null) {
				if (p instanceof Softgoal) {
					step4v.append("" + -PD(p) + " 0\n");
					step4vi.append("" + -FD(p) + " 0\n");
					numClauses += 2;
				}
			}
		} else if (is_or) {
			step4v.append("" + -FS(p) + " 0\n");
			numClauses++;
			if (p instanceof Softgoal) {
				step4vi.append("" + -PS(p) + " 0\n");
				numClauses++;
			}
			if (System.getProperty("Balanced contributions") != null) {
				if (p instanceof Softgoal) {
					step4iii.append(PD(p) + " 0\n");
					step4iv.append(FD(p) + " 0\n");
					numClauses += 2;
				}
			}
		}
		b.append(step4i.toString());
		b.append(step4iii.toString());
		b.append(step4iv.toString());
		b.append(step4v.toString());
		b.append(step4vi.toString());
		return b.toString();
	}

	private String encode_5(Intention p) {
		StringBuffer b = new StringBuffer();
		if (p instanceof Softgoal) {
			if (p.getQualitativeReasoningCombinedLabel() == EvaluationLabel.SATISFIED) { // FS
				b.append(FS(p) + " " + "0\n");
				numClauses++;
			} else if (p.getQualitativeReasoningCombinedLabel() == EvaluationLabel.DENIED) { // FD
				b.append(FD(p) + " " + "0\n");
				numClauses++;
			} else if (p.getQualitativeReasoningCombinedLabel() == EvaluationLabel.CONFLICT) { // CF
				b.append(FS(p) + " 0\n");
				b.append(FD(p) + " 0\n");
				numClauses += 2;
			} else if (p.getQualitativeReasoningCombinedLabel() == EvaluationLabel.WEAKLY_SATISFIED) { // PS
				b.append(PS(p) + " " + "0\n");
				b.append(-FS(p) + " " + "0\n");
				numClauses += 2;
			} else if (p.getQualitativeReasoningCombinedLabel() == EvaluationLabel.WEAKLY_DENIED) { // PD
				b.append(PD(p) + " " + "0\n");
				b.append(-FD(p) + " " + "0\n");
				numClauses += 2;
			} else { // either unknown or conflict
				// nothing
			}
		} else {
			if (p.getQualitativeReasoningCombinedLabel() == EvaluationLabel.SATISFIED) {
				b.append(FS(p) + " " + "0\n");
				numClauses++;
			} else if (p.getQualitativeReasoningCombinedLabel() == EvaluationLabel.DENIED) {
				b.append(FD(p) + " " + "0\n");
				numClauses++;
			} else if (p.getQualitativeReasoningCombinedLabel() == EvaluationLabel.CONFLICT) {
				b.append(FS(p) + " " + "0\n");
				b.append(FD(p) + " " + "0\n");
				numClauses+=2;
			}
		}
		return b.toString();
	}

	private void decode(String result) {
		FS_goals = new HashSet<Intention>();
		FD_goals = new HashSet<Intention>();
		PS_goals = new HashSet<Intention>();
		PD_goals = new HashSet<Intention>();
		CF_goals = new HashSet<Intention>();
		UN_goals = new HashSet<Intention>();		
		System.out.println(result);
		List values = Arrays.asList(result.split(" "));
		for (Intention p: Intentions) {
			if (p instanceof Softgoal && values.contains(String.valueOf(PS(p)))) 
			{
				p.setQualitativeReasoningCombinedLabel(EvaluationLabel.WEAKLY_SATISFIED);
				PS_goals.add(p);
			}
			if (p instanceof Softgoal && values.contains(String.valueOf(PD(p))))
			{
				p.setQualitativeReasoningCombinedLabel(EvaluationLabel.WEAKLY_DENIED);
				PD_goals.add(p);
			}
			if (values.contains(String.valueOf(FS(p))))
			{
				p.setQualitativeReasoningCombinedLabel(EvaluationLabel.SATISFIED);
				FS_goals.add(p);
			}
			if (values.contains(String.valueOf(FD(p))))
			{
				p.setQualitativeReasoningCombinedLabel(EvaluationLabel.DENIED);
				FD_goals.add(p);
			}				
		}
	}	
}
