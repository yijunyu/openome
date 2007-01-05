/* TelosViewSerializer
 *
 * Created November 1998 by Joseph Makuch
 *
 * copyright.
 *
 *
 */

package OME;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

import jtelos.Attribute;
import jtelos.Individual;
import jtelos.KB;
import jtelos.Levels;
import jtelos.Proposition;
import jtelos.PropositionOrPrimitive;
import jtelos.TelosInteger;
import jtelos.TelosReal;
import jtelos.TelosString;


/** Contains the information neccessary to create and maintain a
 *  TelosViewSerializer, which is needed to store the information contained
 *  in a given view into the Telos Repository.
 */
class TelosViewSerializer implements ViewSerializer, TelosFunctionality {

    int ID;
    KB kb;
    int count=0;
    Proposition view;

    // get the types of *int* and *String*. done this way to get int
    static class typeclass {
	public int intfield;
	public String stringfield;
	public double doublefield;
    }
    static typeclass typeobj;	    
    static Class intclass;
    static Class doubleclass;
    static Class stringclass;
    static Class telosstringclass;
    static Class telosintclass;
    static Class telosrealclass;
    
    /** Creates a new TelosViewSerializer (TVS). Once a TVS has been created,
     *  it can be passed to a view for serialization (storing).
     *
     *  @param ID the ID of this TVS
     *  @param kb the knowledge base where the view would be stored
     *
     *  @see View#save
     */    
    public TelosViewSerializer(int ID, KB kb) {
	this.ID=ID;
	this.kb=kb;
		
	view = kb.newIndividual("SerializedView_"+ID, Levels.TOKEN_LEVEL);
	Proposition ancestors[] = view.directAncestors();
	Proposition ancestor = kb.individual(SERIALIZED_VIEW);
	boolean contains = false;
	for (int count=0; count<ancestors.length; count++) 
	    if (ancestors[count] == ancestor) 
		contains = true;
	if(!contains) {
	    Proposition newancestor[] = {ancestor};
	    view.addDirectAncestors(newancestor);    
	}		
	try {
	    typeobj = new typeclass();
	    intclass = typeobj.getClass().getField("intfield").getType();
	    doubleclass = typeobj.getClass().getField("doublefield").getType();
	    stringclass = typeobj.getClass().getField("stringfield").getType();
	    telosstringclass = Class.forName("jtelos.TelosString");
	    D.a(telosstringclass);
	    telosintclass = Class.forName("jtelos.TelosInteger");
	    D.a(telosintclass);
	    telosrealclass = Class.forName("jtelos.TelosReal");
	    D.a(telosrealclass);
	} catch (Exception e) {
	    e.printStackTrace();
	}
    }


    /** Clears the kb of all objects stored for this view. */
    public void clear() {	
	Attribute attributes[] = view.attributes();
	for(int c=0; c<attributes.length; c++) {
	    Proposition p = (Proposition)attributes[c].to();
	    // remove attribute
	    view.removeDirectAttr(attributes[c]);
	    // remove token
	    kb.removeAndDeleteProposition(p);
	}
    }
    

    /** Returns an iterator to a list of all serialized objects. */
    public Iterator iterator() {
//	D.o("generating objects");
	Collection list = new LinkedList();

	Attribute[] atts = view.directAttributes(VIEW_OBJECTS,NOLABEL);
	Proposition telosobj;
	for (int c=0; c<atts.length; c++) {
	    telosobj = (Proposition)atts[c].to();
	    D.a(telosobj);
	    // get type of object from type field
	    TelosString tclassname = (TelosString)
		    telosobj.directAttributes(TYPE,NOLABEL)[FIRST].to();
	    D.a(tclassname);
	    String classname = tclassname.stringValue();
	    try {
		Class objtype = Class.forName(classname);
//		D.o("Recovering a "+objtype.getName());		

		// iterate over the object's fields filling them from telos.
		Field fields[] = objtype.getFields();
		Object obj;
		Constructor[] cs = objtype.getDeclaredConstructors();
		//D.o("cs.length : "+cs.length);
		//D.o("parameter in first constructor: " +
		//	cs[FIRST].getParameterTypes()[FIRST].getClass().getName());
		obj =     cs[FIRST].newInstance(new Object[1]);

		for (int d=0; d<fields.length; d++) {
		    String fieldname = fields[d].getName();
		    //D.o("fieldname: "+fieldname);
		    //D.o(JTelosUtil.telosDeclaration(telosobj));
		    try {
			Object contents = 
			    telosobj.attributes
				(ATTRIBUTE,fieldname)[FIRST].to();
			D.a(telosstringclass);
			D.a(contents);
			if (telosstringclass.isInstance(contents)) {
			    fields[d].set(obj,((TelosString)contents).stringValue());
			} else if (telosintclass.isInstance(contents)) {
			    fields[d].setInt(obj,((TelosInteger)contents).intValue());			
			} else if (telosrealclass.isInstance(contents)) {
			    fields[d].setFloat(obj,((TelosReal)contents).floatValue());			
			} else {
			    throw new Exception("Unexpected Telos type in " +
				    "serialized object.");
			}
		    } catch (Exception e) {
			// Fail quietly.  If we didn't find something we were
			// looking for (like scale), assume this is an old
			// model.
		    }
		    
		}
		list.add(obj);
	    } catch (Exception e) {
		D.o("Exception: "+e+"\n failed to recover a "+classname);
		e.printStackTrace();
	    }
    
	}
	
	return list.iterator();
    }
    
    
    /** Serialize adds the object to this serializer with the name given. The
     *  name that is actually stored may be different, probably mangled with
     *  the name of the view for uniqueness purposes. 
     *
     *  @param the object to be serialized (stored)
     */    
    public Object serialize(Object o) {
	// we use reflection to relieve the object of its public fields, and
	// store them to the kb.
	String objectclassname = o.getClass().getName();
//	D.o("Serializing a "+objectclassname);
	Individual i = kb.newIndividual("SerializedViewObject_"+ID+"_"+count++,
		Levels.TOKEN_LEVEL);	
	kb.newAttribute(view, VIEW_OBJECTS, NOLABEL, i);
	
	Proposition ancestors[] = {kb.individual(SERIALIZED_OBJECT)};
	i.addDirectAncestors(ancestors);
	kb.newAttribute(i, TYPE, NOLABEL, new TelosString(objectclassname));
		
	Field fields[] = o.getClass().getFields(); 
	PropositionOrPrimitive p = null;
	for (int c=0; c<fields.length; c++) {
	    try {
		if (fields[c].getType() == intclass) {  // we serialize ints
		    p= new TelosInteger(fields[c].getInt(o));
		} else if (fields[c].getType() == stringclass) { // and Strings
		    p = new TelosString((String)fields[c].get(o));
		} else if (fields[c].getType() == doubleclass) { // doubles
		    p = new TelosReal((float)fields[c].getDouble(o));
		} else {
		    D.a(false);
		}
	    } catch (Exception e) {
		D.a("Serialization failed due to bad type.");
	    }
//	    D.o(fields[c].getName());
	    try {
		kb.newAttribute(i, ATTRIBUTE, fields[c].getName(), p);
	    } catch (Exception e) {
		//D.o("Serialization failed:"+e);
		
		//There's some weird thing going on where the above line
		//throws an exception, but everything actually went just fine.
		//
		//It only seems to happen saving real's with values that
		//aren't 0.5, 1.0, 1.5, 2.0, etc.  Strange.
	    }
	}
	return null;
    }
    
}

