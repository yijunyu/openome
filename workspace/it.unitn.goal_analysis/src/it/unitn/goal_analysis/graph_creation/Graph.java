package it.unitn.goal_analysis.graph_creation; 
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.MissingResourceException;
import java.util.Random;
import java.util.StringTokenizer;

/** 
 * The Graph class is a first implementation of the model graph described 
 * in [references] This graph models a decomposition of goals into 
 * subgoals, with the possibility of adding positive or negative contributions
 * to the satisfiability of a goal 
 *
 * a Graph object contains as fields: 
 * <ul>
 * <li>the number of goal nodes in the graph 
 * <li>a linked list of nodes
 * <li>a linked list of relations 
 * </ul>
 *  
 *
 * @author Eleonora Nicchiarelli, 6 Dec 2001
 * @version 0.1
 */


public class Graph implements Cloneable {
    
    /**
     * list of all the nodes in the graph
     */
    public LinkedList nodes;
    
    /**
     * List of the relations in the graph. 
     */
    public LinkedList relations;
   
    /**
     * Type of the graph, namely, with discrete or continuous propagation
     */ 
    public String graphType;

    /** 
     * Essential constructor, it only creates empty lists.
     */
    public Graph() {
	nodes     = new LinkedList();
	relations = new LinkedList();
	graphType = "D";  // the graph is discretely propagated by default
    }



   /**
     * The clone method for this graph. Creates an empty graph and 
     * copies to its nodes and relations lists the nodes and relations 
     * lists of the original graph; then corrects the references. 

invece della riga
newGraph.nodes.addAll(nodes);

qualcosa del tipo
(foreach node in nodes) newGraph.nodes.add(node.clone());

e poi attacchi i links giusti
     */

    protected Object clone() 
	throws CloneNotSupportedException {
	// create an empty graph, to be filled with the nodes and 
	// the relations
	Graph newGraph = new Graph();
	// copy the type
	newGraph.graphType = graphType;
	// now newGraph has two empty lists of nodes and relations 
	// that I fill with those of the original graph
	newGraph.nodes.addAll(nodes);
	newGraph.relations.addAll(relations);
	// now the references are all wrong (copy comments from the
	// other version!), so we set them in the right way
	for (Iterator nodeIt = newGraph.nodes.iterator(); nodeIt.hasNext();) {
	    // get the current node for quick referencing
	    Node currentNode = (Node)nodeIt.next(); 
	    // cycle on all relations in the parenthood of the node
	    // and substitute the new relations 
	    for (Iterator relationIt = currentNode.getParenthood().iterator();
		 relationIt.hasNext();) {
		Relation currentRelation = (Relation)relationIt.next();
		int myIndex = relations.indexOf(currentRelation);
		currentRelation = (Relation)newGraph.relations.get(myIndex);
	    }
	    // cycle on all relations in the childhood of the node 
	    // and substitute the new relations 
	    for (Iterator relationIt = currentNode.getChildhood().iterator();
		 relationIt.hasNext();) {
		Relation currentRelation = (Relation)relationIt.next();
		int myIndex = relations.indexOf(currentRelation);
		currentRelation = (Relation)newGraph.relations.get(myIndex);
	    }
	}	
	// now do the same for the relations: cycle on all the nodes
	// they refer to (parent and children)
	for (Iterator relationIt = newGraph.relations.iterator(); 
	     relationIt.hasNext();) {
	    Relation currentRelation = (Relation)relationIt.next();
	    // set the right parent
	    Node myParent = currentRelation.getParent();
	    int myIndex = nodes.indexOf(myParent);
	    currentRelation.setParentNode((Node)newGraph.nodes.get(myIndex));
	    // set the right children 
	    LinkedList myChildren = currentRelation.getChildren();
	    for (Iterator nodeIt = myChildren.iterator(); nodeIt.hasNext();) {
		Node currentChild = (Node)nodeIt.next(); 
		int anIndex = nodes.indexOf(currentChild);
		currentChild = (Node)newGraph.nodes.get(anIndex);
	    }
	}
	return newGraph;
    }


   /**
     * Gives the number of nodes in the graph. 
     * @return the total number of nodes in the graph. 
     */
    int getNumberOfNodes() {
	return nodes.size(); 
    }

    
    /**
     * adds a goal node to the list
     */
    public void addNode(Node aNode) {
	nodes.add(aNode);	   
    };


    /**
     * adds a relation to the list
     */
    public void addRelation(Relation aRelation) {
	relations.add(aRelation);	   
    };


    
    /**
     * during the parsing we need to match strings in the file with RelTypes
     * depending on whether the propagation is discrete or continuous
     */

    public RelType getRelType(String type) 
    throws MissingResourceException {
	if (graphType.compareTo("D") == 0) 
	    return DiscreteRelType.findRelType(type);
	else if (graphType.compareTo("C") == 0) 
	    return ContinuousRelType.findRelType(type);
	else throw new MissingResourceException
	    ("specified graph type is unknown", getClass().getName(), type); 
    }


    
    /**
     * during the parsing we need to match strings in the file with Labels
     * depending on whether the propagation is discrete or continuous
     */

    public Label getLabel(String type) 
    throws MissingResourceException {
	if (graphType.compareTo("D") == 0)
	    return DiscreteLabel.findLabel(type);
	else if (graphType.compareTo("C") == 0)
	    return ContinuousLabel.findLabel(type);
	else throw new MissingResourceException
	    ("specified graph type is unknown", getClass().getName(), type); 
    }

    
    /**
     * makes an array of the leaves in the graph. I think that this should not
     * be made this way and that the leaves should be a field of this 
     * class but these were the specifications... 
     * 
     */
    
    LinkedList listLeaves() {
	// get a new list
	LinkedList leaves = new LinkedList();
	// cycle on all nodes of the graph
	for (Iterator nodeIt = nodes.iterator(); nodeIt.hasNext();) {
	    // get the current node for quick referencing
	    Node currentNode = (Node)nodeIt.next(); 
	    if (currentNode.getParenthood().isEmpty())
		// add it to the list 
		leaves.add(currentNode);
	}
	return leaves;
    }
    
    
    // Generate a random integer from 0 through n-1...
    static int getRandomInt( int n, Random r ) {
	return (r.nextInt() & Integer.MAX_VALUE) % n;
    } 
    
    /**
     * this is the method that attaches a copy of the graph to a node
     * of the same graph; all it does is basically taking care of attaching 
     * the new root to the leaf, or, better, making them coincide. Takes
     * as parameters the two nodes.   
     */

     void attachGraphToNode(Graph aGraph, Node aNode) {
	 // aGraph is the graph to be attached
	 // aNode is the node to which we attach the graph 
	 // First of all extend the list of the nodes and the list 
	 // of the relations 
	 System.out.println("aNode is: " + nodes.indexOf(aNode));
	 Node newRoot = (Node)aGraph.nodes.getFirst();
	 System.out.println(nodes.size());
	 nodes.addAll(aGraph.nodes);
	 System.out.println(getNumberOfNodes());
	 // now let's give the relations of aNode to the new root 
	 // that is aGraph.nodes.getFirst()
	 System.out.println("newRoot in the big graph: " + nodes.indexOf(newRoot));
	 // cycle on all the childhood relations of aNode
	 for (Iterator relationIt = aNode.getChildhood().iterator();
	      relationIt.hasNext();) {
	     Relation currentRelation = (Relation)relationIt.next();
	     // give the relation to the new node 
	     newRoot.addToChildhood(currentRelation);
	     // change the relation accordingly
	     // be SURE that this changes also the list of the 
	     // relations!
	     LinkedList children = currentRelation.getChildren();
	     System.out.println("children di current relation");
	     for (Iterator nodeIt = children.iterator(); nodeIt.hasNext();)
		 System.out.println(" " + nodes.indexOf(nodeIt.next()));
	     // DEBUG it looks like aNode is not in children... why?
	     children.set(children.indexOf(aNode), newRoot);
	 }
	 for (Iterator relationIt = aNode.getParenthood().iterator();
	      relationIt.hasNext();) {
	     Relation currentRelation = (Relation)relationIt.next();
	     // give the relation to the new node 
	     newRoot.addToParenthood(currentRelation);
	     // change the relation accordingly
	     // be SURE that this changes also the list of the 
	     // relations!
	     currentRelation.setParentNode(newRoot);
	 }
	 // now, add the new relations  
	 relations.addAll(aGraph.relations);
	 // and delete aNode from the list
	 nodes.remove(aNode);
     }
    
    
    /**
     * implements a random replication of the graph, needed in order
     * to evaluate the performance of the algorithm on big graphs 
     * with big cycles.
     * It is dumb to replicate only on the leaves! let's make this method
     * take a list of the nodes on which we want to see the graphs 
     * replicated. TO DO 
     */
    void replicate(LinkedList newRoots, Graph moduleGraph) {
	    System.out.println("\nReplicating graph");		
	    System.out.println("new roots are:" );
	    for (Iterator nodeIt = newRoots.iterator(); nodeIt.hasNext();) {
		Node node = (Node)nodeIt.next();
		System.out.println(" " + nodes.indexOf(node));
	    }
	    // scan the list of the new roots
	    for (Iterator nodeIt = newRoots.iterator(); nodeIt.hasNext();) {
		// get the current node for quick referencing
		Node myNode = (Node)nodeIt.next();
		System.out.println("myNode is: " + nodes.indexOf(myNode));
		// after cloning the list is untouched... at least 
		// so the problem is inside attachGraphToNode...
		// now attach the subgraph in the proper place.
		// proper like hell!!!!!!!!!! @#$%%^  
		attachGraphToNode(moduleGraph, myNode);
		System.out.println("new roots are:" );
		for (Iterator nodeIt3 = newRoots.iterator(); nodeIt3.hasNext();) {
		    Node node = (Node)nodeIt3.next();
		    System.out.println(" " + nodes.indexOf(node));
		}
		
	    }
    }
    
    
    /** 
     * this method generates a random relation of the kind +, - etc. 
     * as part of the creation of the random connections that form the big 
     * cycles that we need for our experiments. We select a random type
     * in the set {+, *, -, /} and then generate a random number 
     * between 1 and 9 (both included) that will be the weight; this is 
     * because, even if the weight is continuous, de facto we only assign
     * numbers in {0.1, 0.2, ..., 0.9} 
     */
 
    String generateRandomUnaryRelation(Random r) {
	// a fake for now, only to see if the replication works
	return "-%0.8";
    }

    /** 
     * generates big cycles in the graph, that is, random connections 
     * between two nodes. The restrictions are the following: 
     * - the relations are all of the form of contributions, that is,
     *   no ANDs nor ORs;
     * - we want no relations added between a node and its parent;
     * - we want no relations added between a node and one of its 
     *   siblings.
     */  
       
    void addCycles(int numberOfCycles) {
	// now, this implementation is really horrible and I hope 
	// I have time to reconsider it... I want to use the fact that
	// during the replication the new nodes are added at the end 
	// of the list of the nodes, so that the last nodes are very 
	// far - in a "relativehood" sense - from the first ones, 
	// and this guarantees the generation of big cycles. Or so I 
	// hope... 
	//
	// I need the number of the nodes in the graph
	int numberOfNodes = getNumberOfNodes();
	// then I need to generate two random numbers, one between 
	// 0 and (number of nodes)/2 and the other one between 
	// (number of nodes)/2 + 1 and (number of nodes).
	// hope this works...
	Random r = new java.util.Random();
	int childIndex = getRandomInt(numberOfNodes/2, r);
	int parentIndex = getRandomInt(numberOfNodes/2, r) + numberOfNodes/2;
	// then I need the nodes that have that index in the list
	Node child = (Node)nodes.get(childIndex);
	Node parent = (Node)nodes.get(parentIndex);
	// generate a random unary relation, using the Random previously
	// created 
	String relationName = generateRandomUnaryRelation(r);
	// get its type in order to pass it to the constructor
	RelType type = getRelType(relationName);
	// check for the constraints: that the two nodes don't 
	// share a parent and that they are not parent / child 
	// of each other 
	// but I'll leave this for LATER
	//
	// and I establish a relation where the first (the closer to the 
	// roots) is the child, and the second the parent. 
	// I have to introduce extra randomness in order to 
	// pick up a random relation between +, ++, * etc. 
	// and in order to give it a weight (a number between 0 
	// and 1).
	// 
	addRelation(new Relation(type,parent,child));
	// aggiorna i link dai nodi alle relazioni
	((Relation)relations.getLast()).informNodes();
    } 



    /**
     * implements the perturbation of the graph, with specifications read 
     * from a file
     * 
     */
    void perturb(String perturbfile) {
	System.out.println("\nPerturbing graph"); 
    }
    


    
    /**
     * implements the propagation of the graph.
     * First, a boolean flag is set to false, indicating that there has been
     * no change in the node labels in the graph. Then, until there is 
     * no change again in the node labels, we iterate on all the nodes in the 
     * graph, obtaining a set of degrees of satisfaction and a set of degrees
     * of negation (as sets of labels) on which we calculate the maximum as 
     * ... 
     */
    public int propagate(boolean d) {
	boolean debug = d;
	int repetitions = 0;
	// take the min label in order to calculate the maximums 
	final Label minLabel = getLabel("MINIMUM");
	// a boolean flag that records if the labels of the nodes
	// change during the cycle (only if they do we start with 
	// another cycle) 
	boolean graphChanged;
	do {
	    ++repetitions;
	    if (debug)
		System.out.println("INIZIO CICLO");
	    // sync all node labels (that is, write the current value
	    // on both fields)
	    for (Iterator nodeIt = nodes.iterator(); nodeIt.hasNext();) 
		((Node)nodeIt.next()).syncLabels(); // controllato, funziona
	    // reset change flag
	    graphChanged = false;
	    // iterate again on each node in the graph
	    for (Iterator nodeIt = nodes.iterator(); nodeIt.hasNext();) {
		// get the current node for quick referencing
		Node currentNode = (Node)nodeIt.next(); 
		if (debug) 
		    System.out.println("SatLabel entering: " +
				       currentNode.getSatLabel().getName() +
				       "   DenLabel entering: " +
				       currentNode.getDenLabel().getName());
		// if we have no relations we pass to the next node
		if (currentNode.getParenthood().isEmpty()) continue;
		// since we have to calculate the max sat label and the max
		// den label, we initialize two variables to the min value
		Label maxSatisfaction = minLabel;
		Label maxNegation     = minLabel; // controllato
		// now we cycle on relations
		// parenthood e` privato, fare metodo di accesso!!
		for (Iterator relationIt = currentNode.getParenthood().iterator(); 
		     relationIt.hasNext();) {
		    Relation currentRelation = (Relation)relationIt.next();
		    Label currentSatisfaction = currentRelation.solveForS();
		    Label currentNegation     = currentRelation.solveForD();
		    if (debug)
			System.out.println("Current satisfaction: " +
					   currentSatisfaction.getName() +
					   "   Current negation: " +
					   currentNegation.getName());
		    if (currentSatisfaction.isGreaterThan(maxSatisfaction))
			maxSatisfaction = currentSatisfaction;
		    if (currentNegation.isGreaterThan(maxNegation))
			maxNegation = currentNegation;
		}
		// da qui
		Label currentSatisfaction = currentNode.getSatLabel();
		Label currentNegation = currentNode.getDenLabel();
		maxSatisfaction = 
		    maxSatisfaction.isGreaterThan(currentSatisfaction) ?
		    maxSatisfaction : currentSatisfaction;
		maxNegation = 
		    maxNegation.isGreaterThan(currentNegation) ?
		    maxNegation : currentNegation;
		// a qui, le righe aggiunte
		// now we set the values
		currentNode.setSatLabel(maxSatisfaction);
		currentNode.setDenLabel(maxNegation);
		if (debug)
		    System.out.println("SatLabel exiting: " +
				       currentNode.getSatLabel().getName() +
				       "   DenLabel exiting: " +
				       currentNode.getDenLabel().getName());
		if (currentNode.hasChanged()) graphChanged = true;
	    }
	    
	}
	while (graphChanged == true);
	return repetitions;
    };
    
    /**
     * Builds the graph from a file with a specified format.
     * @param specfile the name of the file  
     */
    void fillFromFile(String specfile) {
	try {
	    int numberOfNodes = 0, numberOfRelations = 0;
	    FileReader file = new FileReader(specfile);
	    BufferedReader buff = new BufferedReader(file);
	    try {
		StringTokenizer st = skipComments(buff);
		// get the graph type
		graphType = st.nextToken();
		// parseInt throws an exception if can't return an integer 
		numberOfNodes  = Integer.parseInt(st.nextToken());
		numberOfRelations = Integer.parseInt(st.nextToken());
	    } catch (Exception e) {
		System.out.println("Corrupted preamble error: "
				   + e.toString() + "\naborting ...");
		// now we want to exit the program
		System.exit(-1);
		
	    }  
	    for (int i = 0; i < numberOfNodes; i++) {
		try {
		    StringTokenizer st = skipComments(buff);
		    if (st.nextToken().compareTo("N") != 0) 
			throw new Exception("Node line number " + (i+1) +
					    " not starting with N"); 
		    String satLabel = st.nextToken();
		    String denLabel = st.nextToken();
		    addNode(new Node(getLabel(satLabel), getLabel(denLabel), 
		    		st.toString()));
		} catch (Exception e) {
		    System.out.println("Corrupted node line: " + e.toString()
				       + "\naborting ...");
		    // now we want to exit the program
		    System.exit(-1);
		}
	    }	    
	    
	    for (int i = 0; i < numberOfRelations; i++) {
		try {
		    StringTokenizer st = skipComments(buff);
		    if (st.nextToken().compareTo("R") != 0)
			throw new Exception("Relation line number " + (i+1) +
					    " not starting with R");
		    RelType type = getRelType(st.nextToken());
		    Node parent = (Node)nodes.get
			(Integer.parseInt(st.nextToken()));
		    LinkedList children = new LinkedList();
		    while (st.hasMoreTokens()) {
			children.add((Node)nodes.get
				     (Integer.parseInt(st.nextToken())));
		    }
		    addRelation(new Relation(type,parent,children));
		    // aggiorna i link dai nodi alle relazioni
		    ((Relation)relations.getLast()).informNodes();
		} catch (Exception e) {
		    System.out.println("Corrupted relation line: " 
				       + e.toString() + "\naborting ...");
		    System.exit(-1);
		}
	    }
	    try {
		skipComments(buff); 
		System.out.println("ERROR - spurious lines at the end of" + 
				   " data file, aborting...");
		System.exit(-1);
	    } catch (IOException e) {}  
	    buff.close();
	} catch (IOException e) {
	    System.out.println("File read error: " + e.toString());
	}
    }

    StringTokenizer skipComments(BufferedReader buff) throws IOException {
	String aLine = ""; //buff.readLine().trim();
	while (aLine.startsWith("#") || (aLine.length() == 0)) {
	    aLine = buff.readLine();
	    if (aLine == null) throw new IOException("null line");
	    aLine.trim();
	}
	return new StringTokenizer(aLine);
    }

    
    /**
     * Writes the graph to a file with a specified format.
     * @param specfile the name of the file  
     */
    public void writeToFile(String specfile) {
	try {
	    FileWriter file = new FileWriter(specfile);
	    BufferedWriter buff = new BufferedWriter(file);
	    buff.write(graphType + " " 
		       + nodes.size() + " "
		       + relations.size());
	    buff.newLine();
	    // ora i nodi
	    for (Iterator nodeIt = nodes.iterator(); nodeIt.hasNext();) {
		Node aNode = (Node)nodeIt.next();
		buff.write("N " 
			   + aNode.getSatLabel().getName() + " "
			   + aNode.getDenLabel().getName() + " "
			   + aNode.name);
		buff.newLine();
	    }
	    // ora le relazioni
	    for (Iterator relationIt = relations.iterator(); 
		 relationIt.hasNext();) {
		Relation aRelation = (Relation)relationIt.next();
		buff.write("R "
			   + aRelation.getName() + " "
			   + nodes.indexOf(aRelation.getParent()));
		for (Iterator nodeIt = aRelation.getChildren().iterator();
		     nodeIt.hasNext();) 
		    buff.write(" " + nodes.indexOf(nodeIt.next()));
		buff.newLine();
	    }
	    buff.close();
	} catch (IOException e) {
	    System.out.println("File write error: " + e.toString());
	}
    }
    

    // the main() should be static! but listLeaves is not static 

    public static void main(String[] args) {
	Graph myGraph = new Graph();
	if (args.length < 1 || args.length > 2) {
	    System.out.println("Usage: Graph <filename> [debug]"); 
	    System.exit(-1);
	}
	myGraph.fillFromFile(args[0]);
	//	myGraph.writeToFile("/dev/stdout");
	// make a copy of the graph at the beginning 
	/*
	Graph moduleGraph = (Graph)myGraph.clone();
	// get a list with the leaves 
	LinkedList leaves = myGraph.listLeaves();
	// and hopefully for efficiency purposes we make an array
	// to get random access to the leaves
	Object[] leavesArray = leaves.toArray(); 
	int numberOfLeaves = leaves.size();
	int replicationDepth = 3; // horrible as everything around here 
	// cycle on how many levels of depth I want... 
	for (int i = 0; i < replicationDepth; i++) {
	    System.out.println("depth = " + i);
	    // here I need to decide a fraction of the leaves on which 
	    // I expand the graph... let's say a half
	    // now I should select say half random leaves...  
	    java.util.Random r = new java.util.Random();
	    // generate the list of nodes (leaves in this case) on which 
	    // we want to replicate 
	    LinkedList myRoots = new LinkedList();
	    for (int j = 0; j < (numberOfLeaves / 2); j++) {
		// Generate a random integer from 0 through n-1...
		int randomIndex = getRandomInt( numberOfLeaves, r );
		// make a list of the new roots
		myRoots.add((Node)leavesArray[randomIndex]);
	    }
	    System.out.println("Before replicating\n");
	    // replicate on those roots
	    myGraph.replicate(myRoots, moduleGraph);
	}
	// now, I want to add the cycles 
	int numberOfCycles = myGraph.getNumberOfNodes() / 6; // for the moment
	myGraph.addCycles(numberOfCycles);
	// and I can finally propagate 
	int a = myGraph.propagate();
	System.out.println("\nResult:\n");
	myGraph.writeToFile("/dev/stdout");
	System.out.println("Iterations done: " + a);
	*/
	boolean debug = args.length>1;
	long runs = 500;
	for (int i = 0; i < runs; ++i) myGraph.propagate(debug); // stabilise
	long inittime = System.currentTimeMillis();
	for (int i = 0; i < runs; ++i)
	    if (1 != myGraph.propagate(debug))
		System.out.println("NOOOOOOOOOOOOOOOOOOO");
	long endtime = System.currentTimeMillis();
	float avtime = ((float)(endtime - inittime)) / runs;
 	avtime = (long)(avtime * 100) / 100.0f;
	System.out.println("Average iteration time: " + avtime + " ms");
	myGraph.writeToFile(args[0]+".it");
    };


}
///:~
