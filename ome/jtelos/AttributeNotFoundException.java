
package jtelos;


/**
 * Thrown when a search is performed on an individual's attributes and
 * there are no matches between the key parameters (which are category
 * labels and attribute labels) and the attributes in the individual
 * (whose name is passed in a parameter to construct the error
 * message). The attributes searched for include those declared,
 * inherited (or both) by the individual, depending on the situation.
 * There are several methods in the interface <code>Individual</code>
 * that throw this exception. 
 * 
 * <p>Note that since it is a <code>RuntimeException</code> it doesn't
 * require a <code>throws</code> clause in methods that throw it, nor
 * <code>try/catch</code> statements around invocations of those
 * methods. Nonetheless, it should be handled.
 *
 * @see Attribute
 * @see Individual
 **/
public class AttributeNotFoundException extends RuntimeException {
  
  private static final String start = 
	"Couldn't find attribute in categories that match labels: ";

  private static final String start2 = 
	"Couldn't find attribute: ";



  /**
   * Thrown when there are no attributes whose category labels match
   * <em>all</em> of the category labels passed. Returns message:
   *
   * <p>"Couldn't find attribute in categories that match labels:
   * &lt<code>catLabels[0]</code>&gt, &lt<code>catLabels[1]</code>&gt
   * &lt ... &gt in &lt<code>ownerName</code>&gt".
   **/
  public AttributeNotFoundException(String[] catLabels,String ownerName) { 
	super(start + catList(catLabels) + " in "+ ownerName);
  }  

  /**
   * Thrown when there are no attributes whose category labels match
   * <em>all</em> of the category labels <em>and</em> the attribute
   * label passed. Returns message:
   *
   * <p>"Couldn't find attribute in categories that match labels:
   * &lt<code>catLabels[0]</code>&gt, &lt<code>catLabels[1]</code>&gt
   * &lt ... &gt matching label &lt<code>attrLabel</code>&gt in
   * &lt<code>ownerName</code>&gt".
   **/
  public AttributeNotFoundException(String[] catLabels, 
				    String attrLabel, 
				    String ownerName) { 
	super(start + catList(catLabels) + " matching label "
	  +attrLabel+" in "+ ownerName);
  }  

  /** Thrown when there are no attribute found in the list.  Returns
   * message:
   *
   * <p>"Couldn't find attribute: &lt<code>attrName</code>&gt
   * in &lt<code>listName</code>&gt list in
   * &lt<code>ownerName</code>&gt".
   **/
  public AttributeNotFoundException(String attrName, 
				    String listName,
				    String ownerName) { 
	super(start2 + attrName + " in " + listName + " in " + ownerName);
  }  

  private static String catList(String[] catLabels) {
	String list = catLabels[0];
	for(int i=1;i<catLabels.length;i++)
	  list += ", "+catLabels[i];
	return list;
  }  

}