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

import edu.toronto.cs.openome_model.*;

public class Reasoning {

	public openome_modelPackage e = null;
	public openome_modelFactory f = null;
	public Resource resource;

	public Reasoning(Resource r) {		
		e = openome_modelPackage.eINSTANCE;
		f = e.getopenome_modelFactory();
		resource = r;
	}
	Vector<Intention> FS_goals = new Vector<Intention>();
	Vector<Intention> FD_goals = new Vector<Intention>();
	Vector<Intention> PS_goals = new Vector<Intention>();
	Vector<Intention> PD_goals = new Vector<Intention>();
	Vector<Intention> CF_goals = new Vector<Intention>();
	Vector<Intention> UN_goals = new Vector<Intention>();
	Vector<Intention> VAR_goals = new Vector<Intention>();
	Hashtable<Intention, HashSet<Intention>> configurations 
		= new Hashtable<Intention, HashSet<Intention> >();  
	
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
		for (Intention root: Intentions) {
			if (FS_goals.contains(root)) {
				root.setLabel(f.createSatisfiedLabel());
			} else if (FD_goals.contains(root)) {
				root.setLabel(f.createDeniedLabel());
			} else if (PS_goals.contains(root)) {
				root.setLabel(f.createPartiallySatisfiedLabel());
			} else if (PD_goals.contains(root)) {
				root.setLabel(f.createPartiallyDeniedLabel());
			} else if (CF_goals.contains(root)) {
				root.setLabel(f.createConflictLabel());
			} else {
				root.setLabel(f.createUnknownLabel());
			}
		}
	}
	
	int numClauses = 0;
	Hashtable<Intention, Integer> goal_ids = new Hashtable<Intention, Integer>();
	Vector<Intention> Intentions = new Vector<Intention>();

	/**
	 * Create the suitabe input in the DiMacs format that SAT4J solver can read
	 * 
	 * A hard Intention is encoded into FS for true, and FD for false A softgoal is
	 * encoded into FS, PS, PD, FD
	 * 
	 * Here the Intention model is converted in 5 steps: 1. The rules to avoid
	 * conflicts: FS or PS => not PD and not FD 2. The axioms of the label
	 * lattice, i.e., FS => PS, FD => FD 3. The correlation rules, i.e., HELP,
	 * MAKE, BREAK, HURT 4. The AND/OR rules 5. The facts, i.e., the existing
	 * labels of the Intentions
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
		System.out.println("collected Intentions: n = " + Intentions.size());
		for (Intention p: Intentions) {
				step1.append(encode_1(p));
				step2.append(encode_2(p));
				step3.append(encode_3(p));
				step4.append(encode_4(p));
				// Yijun: to make sure enough literals are created
		}
		numVariables = Math.max(numVariables, 4 * Intentions.size()+4);
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
		report();
	}

	private void init() {
		Intentions = new Vector<Intention>();
		goal_ids = new Hashtable<Intention, Integer>();
		FS_goals = new Vector<Intention>();
		FD_goals = new Vector<Intention>();
		PS_goals = new Vector<Intention>();
		PD_goals = new Vector<Intention>();
		CF_goals = new Vector<Intention>();
		UN_goals = new Vector<Intention>();
	}
	
	private void report() {
//		System.out.println("no. Intentions = " + Intentions.size());
//		System.out.println("no. FS Intentions = " + FS_goals.size());
//		System.out.println("no. FD Intentions = " + FD_goals.size());
//		System.out.println("no. PS Intentions = " + PS_goals.size());
//		System.out.println("no. PD Intentions = " + PD_goals.size());
//		System.out.println("no. CF Intentions = " + CF_goals.size());
//		System.out.println("no. UN Intentions = " + UN_goals.size());		
		for (Enumeration<Intention> e = configurations.keys(); e.hasMoreElements(); )
		{
			Intention g = e.nextElement();
			HashSet<Intention> config = configurations.get(g);
			System.out.println(g.getName() + ":");
			for (Intention c: config) {
				System.out.println(" " + c.getName());
			}
			System.out.println();
		}
	}

	private void configuring_variability_goals() {
		VAR_goals = new Vector<Intention>();
		configurations = new Hashtable<Intention, HashSet<Intention> >();  
		for (Intention g: Intentions) {
			if (is_or(g) && !is_runtime_or(g)) {
				VAR_goals.add(g);
				EList subgoals = g.getDecompositions();
				HashSet<Intention> config = new HashSet<Intention>();
				for (int i=0; i<subgoals.size(); i++) {
					Decomposition d = (Decomposition) subgoals.get(i);
					Intention s = d.getTarget();
					if (FS_goals.contains(s)
						|| PS_goals.contains(s)) {
						config.add(s);
					}
				}
				configurations.put(g, config);
			}
		}
	}
	
	private void collect_goals(Intention root) {
		add_a_goal(root); 
		EList subgoals = root.getDecompositions();
		for (int j=0; j < subgoals.size(); j++) {
			Decomposition d = (Decomposition) subgoals.get(j);
			Intention s = d.getTarget();
			collect_goals(s);
		}
	}

	private void add_a_goal(Intention root) {
		goal_ids.put(root, Intentions.size());
		Intentions.add(root);
		if (root.getLabel() instanceof SatisfiedLabel ) {
			FS_goals.add(root);
		} else if (root.getLabel() instanceof DeniedLabel ) {
			FD_goals.add(root);
		} else if (root.getLabel() instanceof PartiallySatisfiedLabel ) {
			PS_goals.add(root);
		} else if (root.getLabel() instanceof PartiallyDeniedLabel ) {
			PD_goals.add(root);
		} else if (root.getLabel() instanceof ConflictLabel) {
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

	int FS(Intention p) {
		return FSID(goal_ids.get(p).intValue());
	}

	/**
	 * return 0 if no such literal for hard Intention
	 * 
	 * @param p
	 * @return
	 */
	int PS(Intention p) {
		if (is_soft_goal(p))
			return PSID(goal_ids.get(p).intValue());
		return 0;
	}

	/**
	 * return -FS for hard Intention
	 * 
	 * @param p
	 * @return
	 */
	int FD(Intention p) {
		return FDID(goal_ids.get(p).intValue());
	}

	/**
	 * return 0 if no such literal for hard Intention
	 * 
	 * @param p
	 * @return
	 */
	int PD(Intention p) {
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
	 * @param from
	 * @return
	 */
	private String encode_3(Intention from) {
		StringBuffer b = new StringBuffer();
		EList list = from.getRule();
		for (int j=0; j<list.size(); j++) {
			Contribution c = (Contribution) list.get(j);
			Intention to = c.getTarget();
			if (is_make_contribution(c)) {
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
			} else if (is_break_contribution(c)) { 
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
			} else if (is_help_contribution(c)) {
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
			} else if (is_hurt_contribution(c)) {
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

	private boolean is_hurt_contribution(Contribution c){
		return c instanceof HurtContribution;
	}
	private boolean is_make_contribution(Contribution c){
		return c instanceof MakeContribution;
	}
	private boolean is_help_contribution(Contribution c){
		return c instanceof HelpContribution;
	}
	private boolean is_break_contribution(Contribution c){
		return c instanceof BreakContribution;		
	}

	private boolean is_soft_goal(Intention from) {
		return from instanceof Softgoal;
	}

	/**
	 * encode AND/OR decompositions
	 * 
	 * Exception: when all OR-decomposed children do not contribute to any softgoal, 
	 * they are regarded as AND-decomposed children for the reasoning.
	 * This exception can be turned on through a Property 
	 *     "ome.reasoning.topdown.runtime_or".
	 *  
	 * @param to
	 * @return
	 */
	private String encode_4(Intention to) {
		StringBuffer b = new StringBuffer();
		StringBuffer step4i = new StringBuffer();
		boolean is_and = false;
		boolean is_or = false;
		StringBuffer step4iii = new StringBuffer();
		StringBuffer step4iv = new StringBuffer();
		StringBuffer step4v = new StringBuffer();
		StringBuffer step4vi = new StringBuffer();
		EList list = to.getDecompositions();
		for (int j=0; j<list.size(); j++) {
			Decomposition d = (Decomposition) list.get(j);
			Intention from = d.getTarget();
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
			Intention from = ((Dependency) list.get(j)).getDependencyTo();			
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

	private boolean is_and(Intention to) {
		return to instanceof AndDecomposition;
	}
	private boolean is_or(Intention to) {
		return to instanceof OrDecomposition;
	}

	private boolean is_runtime_or(Intention to) {
		if (is_or(to)) return false;
		if (System.getProperty("ome.reasoning.topdown.runtime_or")==null)
			return false;
		boolean isRuntimeOR = true;
		EList list = to.getDecompositions();
		for (int j = 0; j < list.size(); j++) {
			Decomposition d = (Decomposition) list.get(j);
			Intention from = d.getTarget();
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
		for (Intention p: FS_goals) {
			b.append(FS(p) + " " + "0\n");			
		}
		for (Intention p: FD_goals) {
			b.append(FD(p) + " " + "0\n");
		}
		for (Intention p: CF_goals) {
			b.append(FS(p) + " 0\n");
			b.append(FD(p) + " 0\n");
		}
		for (Intention p: PS_goals) {
			b.append(PS(p) + " " + "0\n");
			b.append(-FS(p) + " " + "0\n");
		}
		for (Intention p: PD_goals) {
			b.append(PD(p) + " " + "0\n");
			b.append(-FD(p) + " " + "0\n");
		}
		return b.toString();
	}

	private void decode(Resource resource, String result) {
		List values = Arrays.asList(result.split(" "));
		FS_goals = new Vector<Intention>();
		FD_goals = new Vector<Intention>();
		PS_goals = new Vector<Intention>();
		FD_goals = new Vector<Intention>();
		CF_goals = new Vector<Intention>();
		UN_goals = new Vector<Intention>();
		for (Intention p: Intentions) {
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
