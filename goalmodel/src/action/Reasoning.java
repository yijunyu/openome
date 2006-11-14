package action;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.sat4j.minisat.SolverFactory;
import org.sat4j.reader.DimacsReader;
import org.sat4j.reader.ParseFormatException;
import org.sat4j.specs.ContradictionException;
import org.sat4j.specs.ISolver;
import org.sat4j.specs.TimeoutException;

import util.Computing;
import edu.toronto.cs.goalmodel.ContributionType;
import edu.toronto.cs.goalmodel.DecompositionType;
import edu.toronto.cs.goalmodel.GoalmodelFactory;
import edu.toronto.cs.goalmodel.GoalmodelPackage;
import edu.toronto.cs.goalmodel.LabelType;
import edu.toronto.cs.goalmodel.ModeType;
import edu.toronto.cs.goalmodel.actor;
import edu.toronto.cs.goalmodel.contribution;
import edu.toronto.cs.goalmodel.dependency;
import edu.toronto.cs.goalmodel.goal;

public class Reasoning {

	public GoalmodelPackage e = null;
	public GoalmodelFactory f = null;
	public Resource resource;

	public Reasoning(Resource r) {		
		e = GoalmodelPackage.eINSTANCE;
		f = e.getGoalmodelFactory();
		resource = r;
	}
	Vector<goal> FS_goals = new Vector<goal>();
	Vector<goal> FD_goals = new Vector<goal>();
	Vector<goal> PS_goals = new Vector<goal>();
	Vector<goal> PD_goals = new Vector<goal>();
	Vector<goal> CF_goals = new Vector<goal>();
	Vector<goal> UN_goals = new Vector<goal>();
	Vector<goal> VAR_goals = new Vector<goal>();
	Hashtable<goal, HashSet<goal>> configurations 
		= new Hashtable<goal, HashSet<goal> >();  
	
	public boolean reasoning() {
		boolean satisfied = false;
		StringBuffer graphStr = encode();
		ISolver solver = SolverFactory.newMiniLearning();
		solver.setTimeout(3600); // 1 hour timeout
		DimacsReader reader = new DimacsReader(solver);
		PrintWriter p;
		try {
			String filename = "file.txt";
			p = new PrintWriter(new FileOutputStream(filename), true);
			p.println(graphStr.toString());
//			Debug.DEBUG_LOADER = true;
			reader.parseInstance(filename);
//			Debug.DEBUG_LOADER = false;
			if (solver.isSatisfiable()) {
				System.out.println("satisfiable");
				String result = reader.decode(solver.model());
				decode(resource, result);
				satisfied = true;
			} else
				satisfied = false;
			configuring_variability_goals();
			update();
			report();
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (ParseFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ContradictionException e) {
			e.printStackTrace();
		} catch (TimeoutException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return satisfied;		
	}

	private void update() {
		for (goal root: goals) {
			if (FS_goals.contains(root)) {
				root.setLabel(LabelType.SATISFIED_LITERAL);
			} else if (FD_goals.contains(root)) {
				root.setLabel(LabelType.DENIED_LITERAL);
			} else if (PS_goals.contains(root)) {
				root.setLabel(LabelType.PARTIALLY_SATISFIED_LITERAL);
			} else if (PD_goals.contains(root)) {
				root.setLabel(LabelType.PARTIALLY_DENIED_LITERAL);
			} else if (CF_goals.contains(root)) {
				root.setLabel(LabelType.CONFLICT_LITERAL);
			} else {
				root.setLabel(LabelType.UNKNOWN_LITERAL);
			}
		}
	}
	
	int numClauses = 0;
	Hashtable<goal, Integer> goal_ids = new Hashtable<goal, Integer>();
	Vector<goal> goals = new Vector<goal>();

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
		collect_goals();
		System.out.println("collected goals: n = " + goals.size());
		for (goal p: goals) {
				step1.append(encode_1(p));
				step2.append(encode_2(p));
				step3.append(encode_3(p));
				step4.append(encode_4(p));
				// Yijun: to make sure enough literals are created
		}
		numVariables = Math.max(numVariables, 4 * goals.size()+4);
		step5.append(encode_5());
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

	private void collect_goals() {
		init();
		for (Iterator i = resource.getResourceSet().getAllContents();
	       i.hasNext(); ) {
	    	Object o = i.next();
	    	if (o instanceof goal) {
	    		goal p = (goal) o;
	    		collect_goals(p);
	    	} else if (o instanceof actor) {
	    		actor a = (actor) o;
    			EList l = a.getGoals();
	    		for (int j =0; j < l.size(); j++) {
	    			goal root = (goal) l.get(j);
	    			collect_goals(root);
	    		}	    		
	    	}	    	
		}
		report();
	}

	private void init() {
		goals = new Vector<goal>();
		goal_ids = new Hashtable<goal, Integer>();
		FS_goals = new Vector<goal>();
		FD_goals = new Vector<goal>();
		PS_goals = new Vector<goal>();
		PD_goals = new Vector<goal>();
		CF_goals = new Vector<goal>();
		UN_goals = new Vector<goal>();
	}
	
	private void report() {
//		System.out.println("no. goals = " + goals.size());
//		System.out.println("no. FS goals = " + FS_goals.size());
//		System.out.println("no. FD goals = " + FD_goals.size());
//		System.out.println("no. PS goals = " + PS_goals.size());
//		System.out.println("no. PD goals = " + PD_goals.size());
//		System.out.println("no. CF goals = " + CF_goals.size());
//		System.out.println("no. UN goals = " + UN_goals.size());		
		for (Enumeration<goal> e = configurations.keys(); e.hasMoreElements(); )
		{
			goal g = e.nextElement();
			HashSet<goal> config = configurations.get(g);
			System.out.println(g.getName() + ":");
			for (goal c: config) {
				System.out.println(" " + c.getName());
			}
			System.out.println();
		}
	}

	private void configuring_variability_goals() {
		VAR_goals = new Vector<goal>();
		configurations = new Hashtable<goal, HashSet<goal> >();  
		for (goal g: goals) {
			if (is_or(g) && !is_runtime_or(g)) {
				VAR_goals.add(g);
				EList subgoals = g.getGoal();
				HashSet<goal> config = new HashSet<goal>();
				for (int i=0; i<subgoals.size(); i++) {
					goal s = (goal) subgoals.get(i);
					if (FS_goals.contains(s)
						|| PS_goals.contains(s)) {
						config.add(s);
					}
				}
				configurations.put(g, config);
			}
		}
	}
	
	private void collect_goals(goal root) {
		add_a_goal(root); 
		EList subgoals = root.getGoal();
		for (int j=0; j < subgoals.size(); j++) {
			goal s = (goal) subgoals.get(j);
			collect_goals(s);
		}
	}

	private void add_a_goal(goal root) {
		goal_ids.put(root, goals.size());
		goals.add(root);
		if (root.getLabel() == LabelType.SATISFIED_LITERAL) {
			FS_goals.add(root);
		} else if (root.getLabel() == LabelType.DENIED_LITERAL) {
			FD_goals.add(root);
		} else if (root.getLabel() == LabelType.PARTIALLY_SATISFIED_LITERAL) {
			PS_goals.add(root);
		} else if (root.getLabel() == LabelType.PARTIALLY_DENIED_LITERAL) {
			PD_goals.add(root);
		} else if (root.getLabel() == LabelType.CONFLICT_LITERAL) {
			CF_goals.add(root);
		} else {
			UN_goals.add(root);
		}
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
		return (i > 0 ? "-" + i : "" + (-i)) + " " + j + " 0\n";
	}

	private String implies(int i, String j) {
		if (i == 0) // ignore these rules
			return "";
		return (i > 0 ? "-" + i : "" + (-i)) + " " + j + " 0\n";
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

	int FS(goal p) {
		return FSID(goal_ids.get(p).intValue());
	}

	/**
	 * return 0 if no such literal for hard goal
	 * 
	 * @param p
	 * @return
	 */
	int PS(goal p) {
		if (is_soft_goal(p))
			return PSID(goal_ids.get(p).intValue());
		return 0;
	}

	/**
	 * return -FS for hard goal
	 * 
	 * @param p
	 * @return
	 */
	int FD(goal p) {
		return FDID(goal_ids.get(p).intValue());
	}

	/**
	 * return 0 if no such literal for hard goal
	 * 
	 * @param p
	 * @return
	 */
	int PD(goal p) {
		if (is_soft_goal(p))
			return PDID(goal_ids.get(p).intValue());
		return 0;
	}
	
	/**
	 * encode mutual exclusions to avoid conflicts
	 * 
	 * @param p
	 * @return
	 */
	private String encode_1(goal p) {
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
	private String encode_2(goal p) {
		StringBuffer b = new StringBuffer();
		b.append(implies(FS(p), PS(p)));
		b.append(implies(FD(p), PD(p)));
		return b.toString();
	}

	/**
	 * encode correlation links
	 * 
	 * @param from
	 * @return
	 */
	private String encode_3(goal from) {
		StringBuffer b = new StringBuffer();
		EList list = from.getRule();
		for (int j=0; j<list.size(); j++) {
			contribution c = (contribution) list.get(j);
			goal to = c.getTarget();
			if (c.getType() == ContributionType.MAKE_LITERAL) {
				b.append(implies(FS(from), FS(to)));
				b.append(implies(PS(from), PS(to)));
				b.append(implies(FS(to), FS(from)));
				b.append(implies(PS(to), PS(from)));
				if (System.getProperty("Balanced contributions") != null) {
					b.append(implies(FD(from), FD(to)));
					b.append(implies(PD(from), PD(to)));
					b.append(implies(FD(to), FD(from)));
					b.append(implies(PD(to), PD(from)));
				}
			} else if (c.getType() == ContributionType.BREAK_LITERAL) { 
				b.append(implies(FS(from), FD(to)));
				b.append(implies(PS(from), PD(to)));
				b.append(implies(FS(to), FD(from)));
				b.append(implies(PS(to), PD(from)));
				if (System.getProperty("Balanced contributions") != null) {
					b.append(implies(PD(from), PS(to)));
					b.append(implies(FD(from), FS(to)));
					b.append(implies(PD(to), PS(from)));
					b.append(implies(FD(to), FS(from)));
				}
			} else if (c.getType() == ContributionType.HELP_LITERAL) {
				b.append(implies(FS(from), PS(to)));
				if (is_soft_goal(from)) {
					b.append(implies(PS(to), "" + FS(from) + " " + PS(from)));
					b.append(implies(PS(from), PS(to)));
				}
				if (System.getProperty("Balanced contributions") != null) {
					b.append(implies(FD(from), PD(to)));
					if (is_soft_goal(from)) {
						b.append(implies(PD(to), "" + FD(from) + " " + PD(from)));
						b.append(implies(PD(from), PD(to)));
					}
				}
			} else if (c.getType() == ContributionType.HURT_LITERAL) {
				b.append(implies(FS(from), PD(to)));
				b.append(implies(PS(from), PD(to)));
				if (is_soft_goal(from)) {
					b.append(implies(PS(to), "" + FD(from) + " " + PD(from)));
				}
				if (System.getProperty("Balanced contributions") != null) {
					b.append(implies(FD(from), PS(to)));
					b.append(implies(PD(from), PS(to)));
					if (is_soft_goal(from)) {
						b.append(implies(PD(to), "" + FS(from) + " " + PS(from)));
					}
				}
			}
		}
		return b.toString();
	}

	private boolean is_soft_goal(goal from) {
		return from.getMode() == ModeType.SOFT_LITERAL;
	}

	/**
	 * encode AND/OR decompositions
	 * 
	 * Exception: when all OR-decomposed children do not contribute to any softgoal, 
	 * they are regarded as AND-decomposed children for the reasoning.
	 * This exception can be turned on through a property 
	 *     "ome.reasoning.topdown.runtime_or".
	 *  
	 * @param to
	 * @return
	 */
	private String encode_4(goal to) {
		StringBuffer b = new StringBuffer();
		StringBuffer step4i = new StringBuffer();
		boolean is_and = false;
		boolean is_or = false;
		StringBuffer step4iii = new StringBuffer();
		StringBuffer step4iv = new StringBuffer();
		StringBuffer step4v = new StringBuffer();
		StringBuffer step4vi = new StringBuffer();
		EList list = to.getGoal();
		for (int j=0; j<list.size(); j++) {
			goal from = (goal) list.get(j);			
			if (is_and(to)
			  || Computing.propertyHolds("ome.reasoning.topdown.runtime_or") && is_runtime_or(to)) {
				if (is_soft_goal(to)) {
					step4i.append(implies(PS(to), PS(from)));
				}
				step4i.append(implies(FS(to), FS(from)));
				step4iii.append(-FS(from) + " ");
				if (is_soft_goal(to)) {
					step4iv.append(-PS(from) + " ");
				}
				if (System.getProperty("Balanced contributions") != null) {
					if (is_soft_goal(to)) {
						step4i.append(implies(PD(from), PD(to)));
						step4i.append(implies(FD(from), FD(to)));
						step4v.append(PD(from) + " ");
						step4vi.append(FD(from) + " ");
					}
				}
				is_and = true;
			} else if (is_or(to)) {
				step4i.append(implies(FS(from), FS(to)));
				if (is_soft_goal(to)) {
					step4i.append(implies(PS(from), PS(to)));
				}
				step4v.append(FS(from) + " ");
				if (is_soft_goal(to) && is_soft_goal(from)) {
					step4vi.append(PS(from) + " ");
				}
				if (System.getProperty("Balanced contributions") != null) {
					if (is_soft_goal(to)) {
						step4i.append(implies(PD(to), PD(from)));
						step4i.append(implies(FD(to), FD(from)));
					}
					if (is_soft_goal(to)) {
						if (is_soft_goal(from))
							step4iii.append(-PD(from) + " ");
						step4iv.append(-FD(from) + " ");
					}
				}
				is_or = true;
			}
		}
		list = to.getDependencyTo();
		for (int j=0; j<list.size(); j++) {
			goal from = ((dependency) list.get(j)).getDependencyTo();			
			if (is_soft_goal(to)) {
				step4i.append(implies(PS(to), PS(from)));
			}
			step4i.append(implies(FS(to), FS(from)));
			step4iii.append(-FS(from) + " ");
			if (is_soft_goal(to) && is_soft_goal(from)) {
				step4iv.append(-PS(from) + " ");
			}
			if (System.getProperty("Balanced contributions") != null) {
				if (is_soft_goal(to)) {
					step4i.append(implies(PD(from), PD(to)));
					step4i.append(implies(FD(from), FD(to)));
					if (is_soft_goal(from))
						step4v.append(PD(from) + " ");
					step4vi.append(FD(from) + " ");
				}
			}
			is_and = true;
		}
	
	    if (is_and) {
			step4iii.append(FS(to) + " 0\n");
			if (is_soft_goal(to)) {
				step4iv.append(PS(to) + " 0\n");
			}
			if (System.getProperty("Balanced contributions") != null) {
				if (is_soft_goal(to)) {
					step4v.append("" + -PD(to) + " 0\n");
					step4vi.append("" + -FD(to) + " 0\n");
				}
			}
		} else if (is_or) {
			step4v.append("" + -FS(to) + " 0\n");
			if (is_soft_goal(to)) {
				step4vi.append("" + -PS(to) + " 0\n");
			}
			if (System.getProperty("Balanced contributions") != null) {
				if (is_soft_goal(to)) {
					step4iii.append(PD(to) + " 0\n");
					step4iv.append(FD(to) + " 0\n");
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

	private boolean is_and(goal to) {
		return to.getType() == DecompositionType.AND_LITERAL;
	}
	private boolean is_or(goal to) {
		return to.getType() == DecompositionType.OR_LITERAL;
	}

	private boolean is_runtime_or(goal to) {
		if (to.getType() != DecompositionType.OR_LITERAL) return false;
		if (System.getProperty("ome.reasoning.topdown.runtime_or")==null)
			return false;
		boolean isRuntimeOR = true;
		EList list = to.getGoal();
		for (int j = 0; j < list.size(); j++) {
			goal from = (goal) list.get(j);
			EList contributions = from.getRule();
			if (contributions.size() > 0) {
				isRuntimeOR = false;
				break;
			}
		}
		return isRuntimeOR;
	}

	private String encode_5() {
		StringBuffer b = new StringBuffer();
		for (goal p: FS_goals) {
			b.append(FS(p) + " " + "0\n");			
		}
		for (goal p: FD_goals) {
			b.append(FD(p) + " " + "0\n");
		}
		for (goal p: CF_goals) {
			b.append(FS(p) + " 0\n");
			b.append(FD(p) + " 0\n");
		}
		for (goal p: PS_goals) {
			b.append(PS(p) + " " + "0\n");
			b.append(-FS(p) + " " + "0\n");
		}
		for (goal p: PD_goals) {
			b.append(PD(p) + " " + "0\n");
			b.append(-FD(p) + " " + "0\n");
		}
		return b.toString();
	}

	private void decode(Resource resource, String result) {
		List values = Arrays.asList(result.split(" "));
		FS_goals = new Vector<goal>();
		FD_goals = new Vector<goal>();
		PS_goals = new Vector<goal>();
		FD_goals = new Vector<goal>();
		CF_goals = new Vector<goal>();
		UN_goals = new Vector<goal>();
		for (goal p: goals) {
			float s =0,  d = 0;
			if (is_soft_goal(p) && values.contains(String.valueOf(PS(p))))
				s = 0.5f;
			if (is_soft_goal(p) && values.contains(String.valueOf(PD(p))))
				d = 0.5f;
			if (values.contains(String.valueOf(FS(p))))
				s = 1;
			if (values.contains(String.valueOf(FD(p))))
				d = 1;
			if(s == 1 && d == 0) {
				FS_goals.add(p);		    			
			} else if(s == 0 && d == 1){
				FD_goals.add(p);
			} else if(s > d){
				PS_goals.add(p);
			} else if(s < d){
				PD_goals.add(p);
			} else if(s == d && s >= 0.5){
				CF_goals.add(p);
			} else if(s == d && s < 0.5){
				UN_goals.add(p);
			}
		}
	}
}
