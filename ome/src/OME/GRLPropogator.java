package OME;

//import OME.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

/** This class implements the IStar Evaluation procedure described Eric's
 * Thesis and Lin Liu's report on reasoning. */

public class GRLPropogator {
    
    private ModelObject modelobject;	// Affectionately refered to as "mo".
    private View view;
    private Map evaluationcatalogue;	// This should really be statically
					// defined.

    private LinkedList weakbag;
    private LinkedList nonweakbag;
    
    // The contribution label type: denied.
    // A contribution can either be denied, or not denied.  If it is not
    // denied, it is assumed to be satisficed.
    private Object deniedcontribution;

    // The softgoal label types, and a handy array for them.
    private Object denied;
    private Object conflict;
    private Object undecided;
    private Object satisficed;
    private Object weakplus;
    private Object weakminus;
    private Object labeltypes[];

    // The `single' contribution types (everything but and, or).
    private Object breaklink; 
    private Object someminuslink; 
    private Object hurtlink;
    private Object unknownlink;
    private Object helplink;
    private Object somepluslink;
    private Object makelink;
    private Object equalslink;
    private Object orlink;
    private Object andlink;

    private Object contributionlink;
    private Object means_endslink;
    private Object decomposelink;
    private Object dependencylink; 
    
    private Object singleconttypes[];

    // The Correlation types;
    private Object breakcorr; 
    private Object someminuscorr; 
    private Object hurtcorr;
    private Object unknowncorr;
    private Object helpcorr;
    private Object somepluscorr;
    private Object makecorr;
    private Object equalscorr;
    private Object correlationtypes[];
    
    private boolean continuepropogation=true;	// should we continue upwards

    // This map is used to find relative values of various labels.  This is
    // useful since we need to find the min and max of a set.
    private Map label2value;
    private int MIN_LABEL_VALUE = -100;
    private int MAX_LABEL_VALUE = 100;
    
    /** Constructor.  Lazily sets up the evaluation catalogue. */
    public GRLPropogator (ModelObject mo, View view) {
	D.o("Came into propogator!");
	this.modelobject = mo;
	this.view = view;
	
	if (evaluationcatalogue == null) {
	    // Construct evaluation catalogue (Table 3.2)
	    evaluationcatalogue = new HashMap();

	    // NOTE:  method convertCorrelationType relies on singleconttypes
	    // and correlationtypes arrays being the same length and in the
	    // "same" order.
	    
	    OMEFramework fw = modelobject.getModel().getFramework();
	    breaklink = fw.getType("GRL Break");
	    someminuslink = fw.getType("GRL SomeNegative");
	    hurtlink = fw.getType("GRL Hurt");
	    unknownlink = fw.getType("GRL Unknown");
	    helplink = fw.getType("GRL Help");
	    somepluslink = fw.getType("GRL SomePositive");
	    makelink = fw.getType("GRL Make");
	    equalslink = fw.getType("GRL Equal");
//
	    orlink = fw.getType("GRL Or");
	    andlink = fw.getType("GRL And");
	    contributionlink = fw.getType("GRLContributionLink");
	    means_endslink = fw.getType("GRL Means-ends link");
	    decomposelink = fw.getType("GRL Decomposition link");
	    dependencylink = fw.getType("GRL Dependency link");
	    
//	    
	    Object singleconttypesarray[] = {breaklink, someminuslink,
		hurtlink, unknownlink, helplink, somepluslink, makelink,
		equalslink};
	    singleconttypes = singleconttypesarray;

	    
/*	    
	    breakcorr = fw.getType("Break Correlation");
	    someminuscorr = fw.getType("Some - Correlation");
	    hurtcorr = fw.getType("Hurt Correlation");
	    unknowncorr = fw.getType("Unknown Correlation");
	    helpcorr = fw.getType("Help Correlation");
	    somepluscorr = fw.getType("Some + Correlation");
	    makecorr = fw.getType("Make Correlation");
	    equalscorr = fw.getType("Equal Correlation");

	    Object correlationtypesarray[] = {breakcorr, someminuscorr,
		hurtcorr, unknowncorr, helpcorr, somepluscorr, makecorr,
		equalscorr};
	    correlationtypes = correlationtypesarray;
*/
	    correlationtypes = singleconttypesarray;
	    
	    denied = fw.getType("GRL Denied");
	    conflict = fw.getType("GRL Conflict");
	    undecided = fw.getType("GRL Undecided");
	    satisficed = fw.getType("GRL Satisficed");
	    weakplus = fw.getType("GRL Weakly Satisficed");
	    weakminus = fw.getType("GRL Weakly Denied");
	    
	    Object labeltypesarray[] = {denied,weakminus,
		undecided,conflict,weakplus,satisficed};
	    labeltypes = labeltypesarray;
		
	    deniedcontribution = fw.getType("GRL Denied Link");

	    // Denied Row
	    evaluationcatalogue.put(new Pair(denied,breaklink),weakplus);
	    evaluationcatalogue.put(new Pair(denied,someminuslink),weakplus);
	    evaluationcatalogue.put(new Pair(denied,hurtlink),weakplus);
	    evaluationcatalogue.put(new Pair(denied,unknownlink),undecided);
	    evaluationcatalogue.put(new Pair(denied,helplink),weakminus);
	    evaluationcatalogue.put(new Pair(denied,somepluslink),weakminus);
	    evaluationcatalogue.put(new Pair(denied,makelink),denied);
	    evaluationcatalogue.put(new Pair(denied,equalslink),denied);
	    evaluationcatalogue.put(new Pair(denied,means_endslink),denied);
	    evaluationcatalogue.put(new Pair(denied,decomposelink),denied);
//	    evaluationcatalogue.put(new Pair(denied,dependencylink),denied);
	    
	    // Conflict Row
	    evaluationcatalogue.put(new Pair(conflict,breaklink),conflict);
	    evaluationcatalogue.put(new Pair(conflict,someminuslink),conflict);
	    evaluationcatalogue.put(new Pair(conflict,hurtlink),conflict);
	    evaluationcatalogue.put(new Pair(conflict,unknownlink),undecided);
	    evaluationcatalogue.put(new Pair(conflict,helplink),conflict);
	    evaluationcatalogue.put(new Pair(conflict,somepluslink),conflict);
	    evaluationcatalogue.put(new Pair(conflict,makelink),conflict);
	    evaluationcatalogue.put(new Pair(conflict,equalslink),conflict);
	    evaluationcatalogue.put(new Pair(conflict,means_endslink),conflict);
	    evaluationcatalogue.put(new Pair(conflict,decomposelink),conflict);
//	    evaluationcatalogue.put(new Pair(conflict,dependencylink),conflict);

	    // Undecided Row
	    evaluationcatalogue.put(new Pair(undecided,breaklink),undecided);
	    evaluationcatalogue.put(new Pair(undecided,someminuslink),undecided);
	    evaluationcatalogue.put(new Pair(undecided,hurtlink),undecided);
	    evaluationcatalogue.put(new Pair(undecided,unknownlink),undecided);
	    evaluationcatalogue.put(new Pair(undecided,helplink),undecided);
	    evaluationcatalogue.put(new Pair(undecided,somepluslink),undecided);
	    evaluationcatalogue.put(new Pair(undecided,makelink),undecided);
	    evaluationcatalogue.put(new Pair(undecided,equalslink),undecided);
	    evaluationcatalogue.put(new
		    Pair(undecided,means_endslink),undecided);
	    evaluationcatalogue.put(new
		    Pair(undecided,decomposelink),undecided);
//	    evaluationcatalogue.put(new
//		    Pair(undecided,dependencylink),undecided);

	    // Satisficed Row
	    evaluationcatalogue.put(new Pair(satisficed,breaklink),denied);
	    evaluationcatalogue.put(new Pair(satisficed,someminuslink),weakminus);
	    evaluationcatalogue.put(new Pair(satisficed,hurtlink),weakminus);
	    evaluationcatalogue.put(new Pair(satisficed,unknownlink),undecided);
	    evaluationcatalogue.put(new Pair(satisficed,helplink),weakplus);
	    evaluationcatalogue.put(new Pair(satisficed,somepluslink),weakplus);
	    evaluationcatalogue.put(new Pair(satisficed,makelink),satisficed);
	    evaluationcatalogue.put(new Pair(satisficed,equalslink),satisficed);
	    evaluationcatalogue.put(new
		    Pair(satisficed,means_endslink),satisficed);
	    evaluationcatalogue.put(new
		    Pair(satisficed,decomposelink),satisficed);
//	    evaluationcatalogue.put(new
//		    Pair(satisficed,dependencylink),satisficed);

	    // We also need to consider weaker inputs.

	    // WeakSatisficed Row
	    evaluationcatalogue.put(new Pair(weakplus,breaklink),weakminus);
	    evaluationcatalogue.put(new Pair(weakplus,someminuslink),weakminus);
	    evaluationcatalogue.put(new Pair(weakplus,hurtlink),weakminus);
	    evaluationcatalogue.put(new Pair(weakplus,unknownlink),undecided);
	    evaluationcatalogue.put(new Pair(weakplus,helplink),weakplus);
	    evaluationcatalogue.put(new Pair(weakplus,somepluslink),weakplus);
	    evaluationcatalogue.put(new Pair(weakplus,makelink),weakplus);
	    evaluationcatalogue.put(new Pair(weakplus,equalslink),weakplus);
	    evaluationcatalogue.put(new
		    Pair(weakplus,means_endslink),weakplus);
	    evaluationcatalogue.put(new
		    Pair(weakplus,decomposelink),weakplus);
//	    evaluationcatalogue.put(new
//		    Pair(weakplus,dependencylink),weakplus);

	    // WeakDenied Row
	    evaluationcatalogue.put(new Pair(weakminus,breaklink),weakplus);
	    evaluationcatalogue.put(new Pair(weakminus,someminuslink),weakplus);
	    evaluationcatalogue.put(new Pair(weakminus,hurtlink),weakplus);
	    evaluationcatalogue.put(new Pair(weakminus,unknownlink),undecided);
	    evaluationcatalogue.put(new Pair(weakminus,helplink),weakminus);
	    evaluationcatalogue.put(new Pair(weakminus,somepluslink),weakminus);
	    evaluationcatalogue.put(new Pair(weakminus,makelink),weakminus);
	    evaluationcatalogue.put(new Pair(weakminus,equalslink),weakminus);
	    evaluationcatalogue.put(new
		    Pair(weakminus,means_endslink),weakminus);
	    evaluationcatalogue.put(new
		    Pair(weakminus,decomposelink),weakminus);
//	    evaluationcatalogue.put(new
//		    Pair(weakminus,dependencylink),weakminus);
	}

	if (label2value == null) {
	    label2value = new HashMap();
	    // This value assignment provides a unique ordering for magnitude
	    // and direction of impact.
	    label2value.put(denied,new Integer(-3));
	    label2value.put(weakminus,new Integer(-2));
	    label2value.put(undecided,new Integer(1));
	    label2value.put(conflict,new Integer(0));
	    label2value.put(weakplus,new Integer(2));
	    label2value.put(satisficed,new Integer(3));
	}
	
    }

    /** Prompts the user to resolve the impacts for the model object, and
     *  continues up the graph as long the user can stand it (and is
     *  necessary).  This propogration occurs in a `breadth-first' upward
     *  manner. */
    public void evaluate() {
	D.o("come in evaluate.LLLLLLLLLLLLL");
	HashMap isinqueue = new HashMap();
	LinkedList queue = new LinkedList();
	GRLPropogator nfrp = this;
	
	// We start by adding our parents to the list of nodes to resolve.
	Iterator parents = getParents(modelobject);
	while (parents.hasNext()) {
	    Object parent = parents.next();
	    if (!isinqueue.containsKey(parent)) {
		isinqueue.put(parent,parent);
		queue.addLast(parent);
	    }
	}

	// And do the initial startup.
	ModelObject current = (ModelObject)dequeue(queue, isinqueue);
	if (current != null) {
	    nfrp=new GRLPropogator(current,view);
	}

	while (current != null) {
	    Object oldlabel = getLabel(current);
	    if (nfrp.resolve()) {
		// if current's label changed as a result of the evaluation,
		// then his impact on his parents may have changed, and they
		// should be added to the queue.
		Object newlabel = getLabel(current);
		if (newlabel != oldlabel) {
		    // Add current's parents to the end of the queue (if they`re
		    // not already there.
		    Iterator i = getParents(current);
		    while (i.hasNext()) {
			ModelObject parent = (ModelObject)i.next();
			if (!isinqueue.containsKey(parent)) {
			    isinqueue.put(parent,parent);
			    queue.addLast(parent);
			    D.o("2. Adding to queue: "+parent.getName());
			}
		    }
		}
		// And we're done with current and ready to move on.
		current = (ModelObject)dequeue(queue, isinqueue);
		if (current != null) {
		    nfrp=new GRLPropogator(current,view);
		}
	    } else {
		// User can't take it anymore.
		current = null;
		D.o("Terminating propogation.");
	    }
	}
    
    }

    private Object dequeue(LinkedList queue,HashMap queueindex) {
	Object returnval;
	if (queue.size() != 0) {
	    returnval = queue.getFirst();
	    queue.removeFirst();
	    queueindex.remove(returnval);
	} else {
	    // Nothing left in the queue.
	    returnval = null;
	}
	return returnval;
    }

    /** The method used to determine the label for mo.  
     *  If mo's offspring have labels, this method will
     *  evaluate what impact these offspring have on mo, make a recommendation
     *  for mo's label, and present this information to the user.  
     *  Please see section 3.3 of the
     *  GRL Framework book (Chung, Nixon, Yu, Mylopoulos) for a more detailed
     *  explanation of the process. */
    protected boolean resolve() {
	// This is the `impact bag' where we will store the individual
	// impacts.
	D.o("Come in resolve.LLLLLLLLLLLLLLLLLLLLL");
	LinkedList bag = new LinkedList();

	// Get mo's offspring
	Iterator i = getOffspring();


	// Partition the offspring among the And contributions, the Or
	// contributions, and the other single contributions.
	LinkedList andoffspring = new LinkedList();
	LinkedList oroffspring = new LinkedList();
	LinkedList singleoffspring = new LinkedList();
	while (i.hasNext()) {
	    D.o("Has offspring!!!");
	    Pair p = (Pair)i.next();
	    ModelLink ml = (ModelLink)p.second;
	    D.o("G. the link is -- "+ml.getName() +" the offspring is --"+((ModelObject)p.first).getName());
	
	    // Only paritition those offspring that are coming through
	    // non-denied links.
	    if (!isDeniedLink(ml)) {
	    D.o("the link isn't labelled as denied!!! ");	
		if (isGRLAndContribution(ml)) {
		    D.o("Adding an and son!!!!!!!!!");
		    andoffspring.add(p);	
		} else if (isGRLOrContribution(ml)) {
		    D.o("Adding an or son!!!!!!!!!");
		    oroffspring.add(p);
		}  else if (isGRLCorrelation(ml)) {
		    D.o("Adding a correlated son!!!!!!!!!");
		    singleoffspring.add(p);
		}
	    }
	}
	
	// Make sure all of mo's offspring coming in from "and"
	// contributions have labels
	
	//Modified by Linda to treat "and" nodes and "or" nodes seperately.
	i = andoffspring.iterator(); 
	
	//i = getOffspring();
	
	while (i.hasNext()) {
	    D.o("Has And offspring!!!!!!!!!");
	    Pair p = (Pair)i.next();
	    ModelObject off = (ModelObject)p.first;
	    ModelLink link = (ModelLink)p.second;
	    D.o("0. the pair is: offspring--"+off.getName() +" link-- "+link.getName());
	    ModelAttribute label = off.getAttribute("label");
	    //if ((label == null || label.getTarget() == null) &&
	    //    !isDeniedLink(link)) 
	    if (label == null || label.getTarget() == null){
		return continuepropogation;
	    }
	}
	
	// Figure out `impact bag'.
	Impact andimpact = getAndImpact(andoffspring);
	if (andimpact != null) {
	    bag.add(getAndImpact(andoffspring));
	}
	
	Impact orimpact = getOrImpact(oroffspring);
	if (orimpact != null) {
	    D.o("Has Or offspring!!!!!!!!!");
	    bag.add(getOrImpact(oroffspring));
	}
	// And the single contributions.
	i = singleoffspring.iterator();
	while (i.hasNext()) {
	    D.o("Has correlated offspring!!!!!!!!!!!!!");
	    Pair p = (Pair)i.next();
	    ModelObject off = (ModelObject)p.first;
	    ModelLink link = (ModelLink)p.second;
	    D.o("1. the pair is: offspring--"+off.getName() +" link-- "+link.getName());
	    LinkedList source = new LinkedList();
	    source.add(off);
	    ModelAttribute label = off.getAttribute("label");
	    if (label == null || label.getTarget() == null){
//		return continuepropogation;
	    } else {
		bag.add(new Impact(getIndividualImpact(off, link),source));
	    }
	}

	// Split the bag into weak and non-weak impacts.
	weakbag = new LinkedList();
	nonweakbag = new LinkedList();
	Iterator bagit = bag.iterator();
	while (bagit.hasNext()) {
	    Impact impact = (Impact)bagit.next();
	    if (isWeak(impact)) {
		D.o("Weak impact " +impact.sourcedesc +" is added");
		weakbag.add(impact);
	    } else {
		D.o("Non-Weak impact " +impact.sourcedesc +" is added");
		nonweakbag.add(impact);
	    }
	}
	
	// Show dialog that enables user to select a label for mo. 
	JDialog bagdialog = new
	    bagDialog(weakbag.iterator(),nonweakbag.iterator());
	view.showDialog(bagdialog);
	D.o("Finishing Resolving!!!!!!!!!");
	return continuepropogation;
	/*
	if (continuepropogation) {
	    // Find mo's parents.
	    ModelObject parent;
	    i = modelobject.getLinks();
	    while (i.hasNext()) {
		ModelLink ml = (ModelLink)i.next();
		if (ml.getFrom() == modelobject) {
		    parent = (ModelObject)ml.getTo();
		    GRLPropogator p = 
			    new GRLPropogator(parent,view);
		    p.evaluate();
		}
	    }
	}
	*/
    }

    /** Returns true if the ModelLink containted in the second field of the
     *  Pair is not denied. No other checking is performed. */
    private boolean isDeniedLink(ModelLink ml) {
	ModelAttribute ma = ml.getAttribute("label");
	D.o("link type is " +ma.getTarget()+"!!!!!!!");
	if (ma != null) {
	    return ma.getTarget() == deniedcontribution;
	}
	return false;
    }

    /** Finds the parents of a given model object, returns an iterator. */
    private Iterator getParents(ModelObject mo) {
	LinkedList ll = new LinkedList();
	Iterator i = mo.getLinks().iterator();
	while (i.hasNext()) {
	    ModelLink ml = (ModelLink)i.next();
	    if (ml.getFrom() == mo) {
		ModelObject to = (ModelObject)ml.getTo();
		// if GRL softgoal is what we should really be checking
		if (to instanceof ModelElement) {
		    ll.add(ml.getTo());
		}
	    }
	}
	return ll.iterator();
    }

    /** Determines the individual impact made from a set of offspring with an
     * "or" contribution. */
    private Impact getOrImpact(Collection oroffspring) {
	Object maxtype = null;
	Integer maxtypevalue = new Integer(MAX_LABEL_VALUE);
	Iterator i = oroffspring.iterator();
	while (i.hasNext()) {
	    Pair p = (Pair)i.next();
	    Object currtype=null;
	    ModelObject off = (ModelObject)p.first;
	    ModelLink link = (ModelLink)p.second;
	    if (link.getType()==
		modelobject.getModel().getFramework().getType("GRL Or")) 
	    {
		LinkedList source = new LinkedList();
		source.add(off);
		ModelAttribute label = off.getAttribute("label");
		if (label == null || label.getTarget() == null){
//		return continuepropogation;
		} else {
		    currtype = getIndividualImpact(off,link);
		}
	    } else {
		currtype = getLabel((ModelObject)p.first);
	    }
	    Integer currtypevalue;
	    if(currtype!=null){
	        currtypevalue = (Integer)label2value.get(currtype);
	    } else {
	        currtypevalue = new Integer(1); //Linda add this line
	    }
	    if (maxtype==null) {
	        maxtype=currtype;
	        maxtypevalue=currtypevalue;
	    } else if (currtypevalue.compareTo(maxtypevalue) > 0) {
	        maxtype=currtype;
	        maxtypevalue=currtypevalue;
	    }
	}
	if (maxtype == null) {
	    return null;
	}
	Impact im = new Impact(maxtype,oroffspring);
	im.setSourceDescription("Contribution from Or nodes");
	return im;
    }

    
    /** Determines the individual impact made from a set of offspring with an
     * "and" contribution. */
    private Impact getAndImpact(Collection andoffspring) {
	Object mintype = null;
	Integer mintypevalue = new Integer(MIN_LABEL_VALUE);
	Iterator i = andoffspring.iterator();
	while (i.hasNext()) {
	    Pair p = (Pair)i.next();
	    Object currtype=null;
	    ModelObject off = (ModelObject)p.first;
	    ModelLink link = (ModelLink)p.second;
	    if (link.getType()==
		modelobject.getModel().getFramework().getType("GRL And")) 
	    {
		LinkedList source = new LinkedList();
		source.add(off);
		ModelAttribute label = off.getAttribute("label");
		if (label == null || label.getTarget() == null){
//		return continuepropogation;
		} else {
		    currtype = getIndividualImpact(off,link);
		}
	    } else {
		currtype = getLabel((ModelObject)p.first);
	    }

	    Integer currtypevalue = (Integer)label2value.get(currtype);
	    if (mintype==null) {
		mintype=currtype;
		mintypevalue=currtypevalue;
	    } else if (currtypevalue.compareTo(mintypevalue) < 0) {
		mintype=currtype;
		mintypevalue=currtypevalue;
	    }
	}
	if (mintype == null) {
	    return null;
	}
	Impact im = new Impact(mintype,andoffspring);
	im.setSourceDescription("Contribution from And nodes");
	return im;
    }

    /** Returns true iff ml is an GRL Or contribution */
    private boolean isGRLOrContribution(ModelLink ml) {
	D.o(" The link is of type " +ml.getType() +" !!!!");
	return (ml.getType() ==
	    modelobject.getModel().getFramework().getType("GRL Or"))||
		(ml.getType() ==
	    modelobject.getModel().getFramework().getType("GRL Means-ends link"));
    }
    
    /** Returns true iff ml is an GRL And contribution */
    private boolean isGRLAndContribution(ModelLink ml) {
	D.o(" The link is of type " +ml.getType() +" !!!!");
	return (ml.getType() ==
	    modelobject.getModel().getFramework().getType("GRL And")) ||
		(ml.getType() ==
	    modelobject.getModel().getFramework().getType("GRL Decomposition link"));
    }

    /** Returns true iff ml is one the GRLCorrelation links.*/
    private boolean isGRLCorrelation(ModelLink ml) {
	D.o(" The link is of type " +ml.getType() +" !!!!");
	return ml.getType() ==
	    modelobject.getModel().getFramework().getType("GRL Correlation Link");
/*	Object type = ml.getType();
	for (int i = 0; i<correlationtypes.length; i++) {
	    if (type == correlationtypes[i]) return true;
	}
	return false;
  */  }
    
    /** Returns true iff ml is one of the `single contribution types' of GRL.*/
/*    private boolean isGRLSingleContribution(ModelLink ml) {
	Object type = ml.getType();
	for (int i = 0; i<singleconttypes.length; i++) {
	    if (type == singleconttypes[i]) return true;
	}
	//return false;

	//We want the propogator to see correlation links as being the same as
	//their contribution counterparts.
	return isGRLCorrelation(ml);
    }
*/
    /** Returns the contribution link type that corresponds to the given
     *  correlation link type */
    private Object convertCorrelationType(Object type) {
	for (int i = 0; i<correlationtypes.length; i++) {
	    if (type==correlationtypes[i]) return singleconttypes[i];
	}
	// We must not have had a correlation type...
	return type;
    }

    /** This function essentially does the table look-up for Table 3.2 in the
     *  GRL book.  Assumes link is a SingleContribution type.*/
    private Object getIndividualImpact(ModelObject offspring, ModelLink
	    link) {
	Object conttype;
	if ( isGRLCorrelation(link)) {
	    if (link.getAttribute("type").getTarget()!= null )  {
	    conttype =
		convertCorrelationType(link.getAttribute("type").getTarget());
	    } else {
		conttype = modelobject.getModel().getFramework().getType("GRL Unknown");	    
	    }
	} else if ( ( link.getType() ==
	    modelobject.getModel().getFramework().getType("GRL And") ) || 
	    (link.getType() ==
	    modelobject.getModel().getFramework().getType("GRL Or"))) {
		if (link.getAttribute("type").getTarget()!= null )  {
		    conttype =link.getAttribute("type").getTarget();
		}
		else {
		    conttype =
			modelobject.getModel().getFramework().getType("GRL Equal");	    
		}
	} else {
	    conttype = link.getType();
	}
	D.o("offspring label is "+getLabel(offspring)+ " link type is "+conttype);
	Object o = evaluationcatalogue.get(new
		Pair(getLabel(offspring), conttype));
	return o;
    }

    /** Returns the target of the given object's softgoal label attribute */
    private Object getLabel(ModelObject mo) {
	return mo.getAttribute("label").getTarget();
    }
    
    private Object getType(ModelObject mo) {
	return mo.getAttribute("type").getTarget();
    }
    

    /** Returns an iterator of pairs (one for each offspring), where each pair
      * is:   (one of mo's offspring, the link from that offspring to mo). */
    private Iterator getOffspring() {
	LinkedList ll = new LinkedList();

	Iterator i = modelobject.getLinks().iterator();
	while (i.hasNext()) {
	    ModelLink ml = (ModelLink)i.next();
	    if ((ModelObject)ml.getTo() == modelobject) {
		Pair p = new Pair(ml.getFrom(), ml);
		ll.add(p);
	    }
	}
	return ll.iterator();
    }

    
    /** Returns true if the impact in the given impacthas weak type (i.e.
     *  is weakly satisficed or weakly denied. */
    private boolean isWeak(Impact i) {
	    String impactname =
		modelobject.getModel().getFramework().getName(i.getType());
	    return impactname.startsWith("GRL Weakly");
    }

    /** Sets the boolean telling us whether we should keep propogating labels.*/
    private void setContinue(boolean b) {
	continuepropogation = b;
    }

    /** Sets mo's label to type. */
    private void setLabel(Object target) {
	ModelAttribute ma = modelobject.getAttribute("label");
	if (ma.getTarget()!=target) {
	    ma.setTarget(target);
	}
    }
    
    /** Resolves the weak impacts into a non-weak impact, and adds it to the
     *  non-weak bag (and removes the weak impacts from the weak bag. */
    private void resolveWeakImpact(Object resolvedtype) {
	LinkedList weaksources = new LinkedList();
	Iterator i = weakbag.iterator();
	while (i.hasNext()) {
	    Impact im = (Impact)i.next();
	    Iterator ii = im.getSourceNodes().iterator();
	    while (ii.hasNext()) {
		weaksources.add(ii.next());
	    }
	}
	Impact weakres = new Impact(resolvedtype,weaksources);
	weakres.setSourceDescription("Resolution of weak impacts");
	nonweakbag.add(weakres);
	weakbag.clear();
    }

    /** Makes a recommendation for the label of the modelobject given the
     *  impact bag provided. */
    private Object getRecommendedLabel(Collection bag) {
	// We want to find the label in the bag with minimum magnitude.  If
	// there are more than one of these, we want to keep them all, since
	// we will need to review them later.
	LinkedList minimpacts = new LinkedList();
	int minval = MAX_LABEL_VALUE;

	//Add by Linda to compute a right recommended label.
	minimpacts.clear();
	Iterator i = bag.iterator();
	while (i.hasNext()) {
	    Impact im = (Impact)i.next();
	    if (Math.abs(minval) >
		    ((Integer)label2value.get(im.getType())).intValue()) {
//		minimpacts.clear();
		minimpacts.add(im);
		minval = ((Integer)label2value.get(im.getType())).intValue();
	    } else if (Math.abs(minval) <=
		    ((Integer)label2value.get(im.getType())).intValue()) {
		minimpacts.add(im);
	    }
	}
	
	// Now we check to see if all of our minimum impacts ar ethe same.
	// If not we have a conflict.
	i = minimpacts.iterator();
	Object type=null;
	while (i.hasNext()) {
	    Impact im = (Impact)i.next();
	    if (type == null) {
		type = im.getType();
	    } else if (type != im.getType()) {
		// This is a conflict.  The best we can do is recommend either
		// "Conflict" or "Undecided".  I have decided to return
		// Conflict if we disagree at the Denied/Satisficed level, and
		// Unkown if we disagree at the Weak level.
		if (type == weakplus || type == weakminus) {
		    return undecided;
		} else {
		    return conflict;
		}
	    }
	}
	// If we didn't find a conflict, we can safely return the type.
	return type;
    }


    /** Impacts hold the details of an individual impact for mo. The relevant
     *  details which can be accessed are the SourceNodes of the impact, a
     *  description of the source of the impact, the type of the impact, an 
     *  image for the impact, and a description of the impact itself.
     *
     *	This is useful for displaying relevant information in a user dialogue,
     *	reasoning about the impact, and perhaps later storing these impacts.
     */
    private class Impact {

	private Object type;
	private LinkedList sources;
	private String sourcedesc;

	/** Consturcts an Impact of the given type from the given sources. */
	public Impact(Object type, Collection sources) {
	    this.type = type;
	    this.sources = new LinkedList();
	    this.sources.addAll(sources);
	}

	/** A collection of the nodes that contributed this impact. */
	public Collection getSourceNodes() {
	    return sources;
	}

	/** An English description of these nodes. */
	public String getSourceDescription() {
	    
	    // If we store a description, return it.
	    if (sourcedesc != null) return sourcedesc;

	    // Otherwise, return the name of the first source.
	    return ((ModelObject)sources.getFirst()).getName();
	}

	/** Set the description of the impact sources. */
	public void setSourceDescription(String desc) {
	    sourcedesc = desc;
	}

	/** The type of the impact. Various OME methods can eat this. */
	public Object getType() {
	    return type;
	}

	/** The image representation of this impact. */
	public Image getImage() {
	    return modelobject.getModel().getFramework().getImage(type);
	}

	/** An English description of the impact. */
	public String getDescription() {
	    return modelobject.getModel().getFramework().getName(type);
	}
	
    }

    // WARNING:  GUI code below.  This code constructs the GRL Softgoal Label
    // evaluation dialogue.  This is a rather complicated dialogue with a lot
    // of code dedicated to layout.  I have tried to include some helpful
    // comments, but a lot of the layout stuff is just Swing magic.  The
    // harder to understand parts involve the use of the BoxLayout.  You may
    // want to take a look at the Java Swing Tutorial section on the
    // BoxLayout.  -- Mike.
    
    /** The "bag" is the collection of individual impacts to mo contributed to
     *  mo's offspring.  This bag dialogue gives the user a chance to resolve
     *  the impacts in the bag and set one specific label for mo.*/
    private class bagDialog extends JDialog{

	static final int iconheight = 20;
	
	public bagDialog(Iterator weakbag, Iterator nonweakbag) {
	    // Create the dialogue itself.
	    super();

	    updateBagDialog(weakbag, nonweakbag);

	}

	/** The contributing impacts for mo can change while the dialog is up.
	 *  This method updates the dialogue to reflect the new changes. */
	public void updateBagDialog(Iterator weakbag, Iterator nonweakbag) {
	    D.o("Creating analysis dialogue");
	    JPanel contentpane = new JPanel();
	    setContentPane(contentpane);
	    contentpane.setLayout(new BoxLayout(contentpane,
			BoxLayout.Y_AXIS));
	    setTitle("Impact Resolution");
	    contentpane.setBorder(BorderFactory.createEmptyBorder(
			10,10,10,10));

	    // Add weakImpactResolutionPanel
	    getContentPane().add(makeWeakResolutionPanel(weakbag));
	    
	    // Put some space between the panels
	    getContentPane().add(Box.createRigidArea(new Dimension(0,20)));
	    getContentPane().add(Box.createVerticalGlue());
	    
	    // Add impactResolutionPanel
	    getContentPane().add(makeNormalResolutionPanel(nonweakbag));
	
	}
	
	private JPanel makeWeakResolutionPanel(Iterator bag) {
	    Border ugly = BorderFactory.createLineBorder(Color.blue);
	    
	    JPanel jp = new JPanel();
	    jp.setLayout(new BoxLayout(jp,BoxLayout.Y_AXIS));
	    jp.setBorder(BorderFactory.createEtchedBorder());

	    // Do we have any weak impacts?/makeRecoomendation

	    boolean havesome = bag.hasNext();

	    // Explain the purpose of this panel.
	    jp.add(Box.createRigidArea(new Dimension(0,5)));
	    JLabel step = new JLabel("Step 1:");
	    step.setFont(jp.getFont().deriveFont(Font.BOLD));
	    jp.add(makeLeftPanel(step,5));
	    JLabel instructions = new JLabel("Use this area to resolve the" +
		    " weak impact(s) for "+modelobject.getName());
	    jp.add(makeLeftPanel(instructions,10));
	    
	    // Add the panel showing the weak impacts.
	    jp.add(Box.createRigidArea(new Dimension(0,10)));
	    JPanel impactpanel = makeImpactPanel(bag);
	    impactpanel.setAlignmentX(CENTER_ALIGNMENT);
	    impactpanel.setBorder(BorderFactory.createLoweredBevelBorder());
	    jp.add(impactpanel);

	    // Add the button panel to resolve these impacts.
	    jp.add(Box.createRigidArea(new Dimension(0,5)));
	    JLabel buttontitle = new JLabel("Resolve Weak Impact(s) to: "); 
	    LabelButtonPanel buttonpanel = new LabelButtonPanel();
	    buttonpanel.setAlignmentX(CENTER_ALIGNMENT);
	    buttontitle.setAlignmentX(RIGHT_ALIGNMENT);
	    jp.add(buttontitle);
	    jp.add(buttonpanel);
	    jp.add(Box.createRigidArea(new Dimension(0,5)));

	    // Resolving weak impacts should lead to a weak impact.
	    buttonpanel.disableWeakButtons();

	    // If we have no weak impacts, disable the whole bar.
	    if (!havesome) {
		buttonpanel.disableAllButtons();
	    } else {
		// Otherwise, hook-up the buttons
		for (int i = 0; i<labeltypes.length; i++) {
		    buttonpanel.getButton(labeltypes[i]).addActionListener(
			    new WeakButtonListener(labeltypes[i]));
		}
	    }

	    
	    return jp;
	}


	private JPanel makeNormalResolutionPanel(Iterator bag) {
	    Border ugly = BorderFactory.createLineBorder(Color.blue);
	    
	    JPanel jp = new JPanel();
	    jp.setLayout(new BoxLayout(jp,BoxLayout.Y_AXIS));
	    jp.setBorder(BorderFactory.createEtchedBorder());

	    // Explain the purpose of this panel.
	    jp.add(Box.createRigidArea(new Dimension(0,5)));
	    JLabel step = new JLabel("Step 2:");
	    step.setFont(jp.getFont().deriveFont(Font.BOLD));
	    jp.add(makeLeftPanel(step, 5));
	    JLabel instructions = new JLabel("Use this area to set label" +
		    " for "+modelobject.getName());
	    jp.add(makeLeftPanel(instructions,10));
	    
	    // Add the panel showing the weak impacts.
	    jp.add(Box.createRigidArea(new Dimension(0,10)));
	    JPanel impactpanel = makeImpactPanel(bag);
	    impactpanel.setAlignmentX(CENTER_ALIGNMENT);
	    impactpanel.setBorder(BorderFactory.createLoweredBevelBorder());
	    jp.add(impactpanel);

	    // Add the panel to resolve these impacts.
	    jp.add(Box.createRigidArea(new Dimension(0,5)));
	    JPanel btitlepanel = new JPanel();
	    btitlepanel.setLayout(new BoxLayout(btitlepanel,BoxLayout.X_AXIS));
	    JLabel buttontitle = new JLabel("Set Label for " + 
		    modelobject.getName()+":");
	    buttontitle.setAlignmentX(CENTER_ALIGNMENT);
	    btitlepanel.add(buttontitle);
	    btitlepanel.add(Box.createHorizontalGlue());
	    
	    LabelButtonPanel buttonpanel = new LabelButtonPanel();
	    buttonpanel.setAlignmentX(CENTER_ALIGNMENT);
	    jp.add(btitlepanel);
	    jp.add(buttonpanel);

	    // Hook up the buttons.
	    for (int i = 0; i<labeltypes.length; i++) {
		buttonpanel.getButton(labeltypes[i]).addActionListener(
			new LabelButtonListener(labeltypes[i]));
	    }

	    jp.add(Box.createRigidArea(new Dimension(0,5)));

	    // Display our recommended label, and add buttons to accept this
	    // recommendation or cancel out entirely.
	    jp.add(makeRecommendationPanel());

	    // Add a check box so user can choose to keep propogating.
	    JCheckBox keepgoingbox = new JCheckBox("Keep propagating upwards"
		    + "(if necessary)", true);
	    jp.add(makeLeftPanel(keepgoingbox,5));
	    
	    jp.add(Box.createRigidArea(new Dimension(0,5)));

	    return jp;
	}

	/** Returns a panel displaying the recommended label setting, and
	 *  buttons to accept this recommendation, or quit out of the dialogue
	 *  altogether.*/
	private JPanel makeRecommendationPanel() {
	    // Find our recomenndation.
	    LinkedList wholebag = new LinkedList();
	    wholebag.addAll(weakbag);
	    wholebag.addAll(nonweakbag);
	    Object rectype = getRecommendedLabel(wholebag);

	    // Make our panel.
	    JPanel recpanel = new JPanel();
	    recpanel.setLayout(new BoxLayout(recpanel,BoxLayout.X_AXIS));
	    
	    // The panel to show our recommendation
	    JPanel displayrec = new JPanel();
	    displayrec.setLayout(new BoxLayout(displayrec,BoxLayout.X_AXIS));
	    JLabel rectitle = new JLabel("Recommened label: ");
	    
	    if (rectype!= null) { 
		ImageIcon icon = new ImageIcon(getLabelImage(rectype,40));
		JLabel recim = new JLabel(icon);
		displayrec.add(rectitle);
		displayrec.add(Box.createHorizontalGlue());
		displayrec.add(recim);
	    }

	    // The button panel
	    JPanel buttonpanel = new JPanel();
	    buttonpanel.setLayout(new BoxLayout(buttonpanel,BoxLayout.Y_AXIS));
	    JButton acceptbutton = new JButton("Accept");
	    acceptbutton.addActionListener(new LabelButtonListener(rectype));
	    JButton cancelbutton = new JButton("Cancel");
	    cancelbutton.addActionListener(new cancelButtonListener());
	    // Make the accept button as big as the cancel button.
	    acceptbutton.setPreferredSize(cancelbutton.getMaximumSize());
	    acceptbutton.setMaximumSize(cancelbutton.getMaximumSize());
	    buttonpanel.add(acceptbutton);
	    buttonpanel.add(cancelbutton);

	    // Add all the panels.
	    recpanel.add(displayrec);
	    recpanel.add(Box.createHorizontalGlue());
	    recpanel.add(buttonpanel);

	    return recpanel;
	}


	/** This returns the panel that gives a visual representation of the
	 *  supplied collection of "impact pairs". */
	private JPanel makeImpactPanel(Iterator impacts) {

	    final int spacerwidth = 64;
	    final int spacerheight = 10;
	    
	    // Initial panel creation
	    JPanel jp = new JPanel();
	    jp.setLayout(new BoxLayout(jp,BoxLayout.Y_AXIS));

	    // Add header panel
	    JPanel headerpanel = new JPanel();
	    headerpanel.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
	    headerpanel.setLayout(new BoxLayout(headerpanel,BoxLayout.X_AXIS));
	    JLabel impactheader = new JLabel("Impact");
	    impactheader.setFont(jp.getFont().deriveFont(Font.BOLD));
	    JLabel sourceheader = new JLabel("Source");
	    sourceheader.setFont(jp.getFont().deriveFont(Font.BOLD));
	    headerpanel.add(impactheader);
	    headerpanel.add(Box.createHorizontalGlue());
	    headerpanel.add(Box.createRigidArea(new Dimension(spacerwidth,0)));
	    headerpanel.add(sourceheader);
	    jp.add(headerpanel);
	    jp.add(Box.createRigidArea(new Dimension(0,spacerheight)));

	    // Add list of impacts panel
	    JPanel listpanel = new JPanel();
	    jp.add(listpanel);
	    listpanel.setLayout(new BoxLayout(listpanel,BoxLayout.Y_AXIS));
	    if (impacts.hasNext()) {
		while (impacts.hasNext()) {
		    JPanel itempanel = new JPanel();
		    itempanel.setBorder(BorderFactory.createEmptyBorder(0,10,1,10));
		    itempanel.setLayout(new BoxLayout(itempanel,BoxLayout.X_AXIS));

		    Impact i = (Impact)impacts.next();
		    JLabel imlabel = new JLabel(new ImageIcon(getImpactIcon(i)));
		    JLabel sourcelabel = new JLabel(i.getSourceDescription());
		    itempanel.add(imlabel);
		    itempanel.add(Box.createHorizontalGlue());
		    itempanel.add(Box.createRigidArea(new Dimension(spacerwidth,0)));
		    itempanel.add(sourcelabel);
		    listpanel.add(itempanel);
		}
	    } else {
		// We have no impacts for this panel, say so.
		JPanel itempanel = new JPanel();
		itempanel.setLayout(new BoxLayout(itempanel,BoxLayout.X_AXIS));
		JLabel nonelabel = new JLabel("None");
		JLabel nalabel = new JLabel("N/A");
		itempanel.add(nonelabel);
		itempanel.add(Box.createHorizontalGlue());
		itempanel.add(nalabel);
		listpanel.add(itempanel);
	    }

	    return jp;
	}

	/** Returns a panel that will be "growable", but will display the
	 *  supplied component inset to the amount specified. */
	private JPanel makeLeftPanel(JComponent comp, int offset) {
	    JPanel leftpanel = new JPanel();
	    leftpanel.setLayout(new BoxLayout(leftpanel,BoxLayout.X_AXIS));
	    leftpanel.add(Box.createRigidArea(new Dimension(offset,0)));
	    leftpanel.add(comp);
	    leftpanel.add(Box.createHorizontalGlue());
	    return leftpanel;
	}

	/** Returns a small image for the impact of the given impact. */ 
	private Image getImpactIcon(Impact impact) {
	    ImageTable it = modelobject.getModel().getFramework().getImageTable();
	    Image im = impact.getImage();
	    return it.getSizing(im,0,iconheight);
	}

	/** Returns a small image for the given softgoal label. */
	private Image getLabelImage(Object type) {
	    /*ImageTable it =
		modelobject.getModel().getFramework().getImageTable();
	    Image im = modelobject.getModel().getFramework().getImage(type);
	    return it.getSizing(im,0,iconheight);
	    */
	    return getLabelImage(type,iconheight);
	}

	/** Returns an image for the given softgoal label of the specified
	 *  height. */
	private Image getLabelImage(Object type, int height) {
	    D.o("type is " +type+"!!!!!!!!");
	    ImageTable it =
		modelobject.getModel().getFramework().getImageTable();
	    Image im = modelobject.getModel().getFramework().getImage(type);
	    D.o( type +" 's Hight is " +height+" !!!!");
	    return it.getSizing(im,0,height);
	}


	/** This class provides a button panel with a button for each softgoal
	 *  label, and provides access to each of those buttons. */
	private class LabelButtonPanel extends JPanel {
	
	    private HashMap types2buttons;
	    
	    public LabelButtonPanel() {
		super();

		types2buttons = new HashMap();
		
		this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		
		// Create the buttons.
		for (int i = 0; i < labeltypes.length; i++) {
		    JButton j = new JButton(new ImageIcon(
				getLabelImage(labeltypes[i])));
		    add(j);
		    types2buttons.put(labeltypes[i],j);
		}
	    }

	    public void disableAllButtons() {
		for (int i = 0; i < labeltypes.length; i++) {
		    JButton j = (JButton)types2buttons.get(labeltypes[i]); 
		    j.setEnabled(false);
		}
	    }

	    public void disableWeakButtons() {
		((JButton)types2buttons.get(weakplus)).setEnabled(false);
		((JButton)types2buttons.get(weakminus)).setEnabled(false);
	    }

	    public JButton getButton(Object type) {
		return (JButton)types2buttons.get(type);
	    }
	}

	/** This is the ActionListener to be hooked on to the buttons used to
	 *  resolve weak impacts. */
	private class WeakButtonListener implements ActionListener {
	
	    Object resolvedtype;    // The type associated with this button.

	    public WeakButtonListener(Object resolvedtype) {
		this.resolvedtype = resolvedtype;
	    }
	    
	    public void actionPerformed(ActionEvent e) {
		resolveWeakImpact(resolvedtype);
		updateBagDialog(weakbag.iterator(),nonweakbag.iterator());
		pack();  // redisplay the dialog.
	    }
	}

	/** This be the class hooked on to the buttons used to the set the label
	 *  for mo. */
	private class LabelButtonListener implements ActionListener{
	
	    Object resolvedtype;    // The type associated with this button.

	    public LabelButtonListener(Object resolvedtype) {
		this.resolvedtype = resolvedtype;
	    }
	    
	    public void actionPerformed(ActionEvent e) {
		setLabel(resolvedtype);
		dispose();  // Close the dialog.
	    }
	}
	    
	/** Cancel button adapter, closes the dialogue.*/    
	private class cancelButtonListener implements ActionListener {
	
	    public void actionPerformed(ActionEvent e) {
		setContinue(false);
		dispose();  // Close the dialog.
	    }
	}

	private class ContinueCheckboxListener implements ItemListener {
	    
	    public void itemStateChanged(ItemEvent e) {
		if (e.getStateChange() == ItemEvent.SELECTED) {
		    setContinue(true);
		} else if (e.getStateChange() == ItemEvent.DESELECTED) {
		    setContinue(false);
		}
	    }
	}
	
    }   
    
}
