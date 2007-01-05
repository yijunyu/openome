package OME;
import java.util.Vector;

import jtelos.Attribute;
import jtelos.Levels;
import jtelos.Proposition;
import jtelos.StaticHelper;


/** Currently contains a method for creating a Telos declaration
 *  for a given individual, as well as some helper methods.
 *  contains a couple of slightly modified versions of methods found within 
 * Scott Kerr's old StaticHelper class. Scott Kerr was otherwise a very cool
 * guy.
cai,Feb,8.2001,Otelos declaration for ConceptBase is made.
 */
class JTelosUtil {
     
     /** Removes all propositions that are not built-in.
      *
      *  @param  propositions[]   The propostions that should be checked
      *
      *  @return  The subset of <code>propositions[]</code> that are not built-in
      */
      public static Proposition[] removeBuiltIns(Proposition[] propositions) {
	Vector v = new Vector();
	for(int i=0;i<propositions.length;i++) {
	    if(!propositions[i].isBuiltin())
	    v.addElement(propositions[i]);
	}
	Proposition[] result = new Proposition[v.size()];
	for(int i=0;i<v.size();i++) 
	    result[i] = (Proposition) v.elementAt(i);
	return result;
    }  
    

    /** This static method creates a Telos declaration for the individual in the
     *  Telos language. This method is used by <code>jtelos.example.exKB</code> to
     *  serailize (store) the contents of the KB on disk.
     *
     *  @param proposition The proposition for which the Telos declaration 
     *  should be created
     *
     *  @return The Telos declaration that was created for the specified
     *  proposition
     */
    public static String telosDeclaration(Proposition proposition) {
	String result = StaticHelper.levelToString(proposition.level()) + " " +
		proposition.telosName();
	Proposition[] directAncestors = 
		removeBuiltIns(proposition.directAncestors());
	if(directAncestors.length >0) 
	    result += "\n    IN "+directAncestors[0];
	for(int i=1;i<directAncestors.length;i++)
	    result += ", "+directAncestors[i];

	if (proposition.level() != Levels.TOKEN_LEVEL) { 
	    Proposition[] directParents =
		    removeBuiltIns(proposition.directParents());
	    if(directParents.length >0) {
		result += "\n    ISA "+directParents[0];
	    }
	    for(int i=1;i<directParents.length;i++)
		result += ", "+directParents[i];
	}
       	

	Attribute[] directAttrs = proposition.directAttributes();
	if(directAttrs.length >0) 
	    result += "\n    WITH";
	for(int i=0;i<directAttrs.length;i++) {
	    String[] catLabels = directAttrs[i].categories();
	    result += "\n        "+catLabels[0];
	    for(int j=1;j<catLabels.length;j++) 
		result += ", "+catLabels[j];
	    if (directAttrs[i].label().equals("\"\""))
		result += "\n           ";
	    else 
		result += "\n            " + directAttrs[i].label();
	    result += " : "+directAttrs[i].to().telosName();
	}
	
	return result += "\nEND";
    }  


//cai,  Sml Declaration based on Otelos.
    public static String OtelosDeclaration(Proposition proposition) {
         String result;
	if(proposition.level() == Levels.M2CLASS_LEVEL)
                result = "MetametaClass " +
		proposition.telosName();
        else 
                result = StaticHelper.levelToString(proposition.level()) + " " +
		proposition.telosName();
	Proposition[] directAncestors = 
		removeBuiltIns(proposition.directAncestors());
	if(directAncestors.length >0) 
	    result += "\n    in "+directAncestors[0];
	for(int i=1;i<directAncestors.length;i++)
	    result += ", "+directAncestors[i];

	if (proposition.level() != Levels.TOKEN_LEVEL) { 
	    Proposition[] directParents =
		    removeBuiltIns(proposition.directParents());
	    if(directParents.length >0) {
		result += "\n    isA "+directParents[0];
	    }
	    for(int i=1;i<directParents.length;i++)
		result += ", "+directParents[i];
	}
       	

      Attribute[] directAttrs = proposition.directAttributes();
	if(directAttrs.length >0) 
	    result += "\n    with";
	for(int i=0;i<directAttrs.length;i++) {
	    String[] catLabels = directAttrs[i].categories();
	    result += "\n        "+catLabels[0];

//	    result += "\n        ";
//+catLabels[0];


	    for(int j=1;j<catLabels.length;j++) 
		result += ", "+catLabels[j];
	//	if (!catLabels[j].equalsIgnoreCase("attribute")) 
        //            result +=" " + catLabels[j];
	    if (directAttrs[i].label().equals("\"\""))
		result += "\n           ";
	    else 
		result += "\n            " + directAttrs[i].label();
            if (directAttrs[i].label().equalsIgnoreCase("")) 
               		result += "DefaultLabel"+i; 
            if (directAttrs[i].to().telosName().equalsIgnoreCase("SClass"))
            result += " : SimpleClass";
	    else result += " : "+directAttrs[i].to().telosName();
/*            if (i<(directAttrs.length-1))
              { //if (directAttrs[i+1].label().equalsIgnoreCase(""))  result += ";" ;
                catLabels = directAttrs[i].categories();
                String[] catLabels1 = directAttrs[i+1].categories();
                if (catLabels.length == catLabels1.length)
                 {  int j=1;
                    for(j=1;j<catLabels.length;j++)
                    if(!catLabels[j].equalsIgnoreCase(catLabels1[j])) break;
                   if (j==catLabels.length)
                    result += ";" ;
                 }
              } */
	   }  
	
	return result += "\nend";
    }  


//cai,  Sml Declaration based on Otelos without attribute.

    public static String OtelosDeclarationNoattribute(Proposition proposition) {
         String result;
	if(proposition.level() == Levels.M2CLASS_LEVEL)
                result = "MetametaClass " +
		proposition.telosName();
        else 
                result = StaticHelper.levelToString(proposition.level()) + " " +
		proposition.telosName();
	Proposition[] directAncestors = 
		removeBuiltIns(proposition.directAncestors());
	if(directAncestors.length >0) 
	    result += "\n    in "+directAncestors[0];
	for(int i=1;i<directAncestors.length;i++)
	    result += ", "+directAncestors[i];

	if (proposition.level() != Levels.TOKEN_LEVEL) { 
	    Proposition[] directParents =
		    removeBuiltIns(proposition.directParents());
	    if(directParents.length >0) {
		result += "\n    isA "+directParents[0];
	    }
	    for(int i=1;i<directParents.length;i++)
		result += ", "+directParents[i];
	}

	return result += "\nend";
    }  

//cai,  xml Declaration based on Otelos.

 public static String XmlElementDeclaration(Proposition proposition) {

        String result;
        result ="\042";
	if (proposition.level() == Levels.TOKEN_LEVEL) { 
              result += proposition.telosName();

	}

	return result +="\042" ;
    }  


 public static String XmlDeclaration(Proposition proposition) {

         String result;
	if(proposition.level() == Levels.M2CLASS_LEVEL)
                result = "MetametaClass " +
		proposition.telosName();
        else 
                result = StaticHelper.levelToString(proposition.level()) + " " +
		proposition.telosName();
	Proposition[] directAncestors = 
		removeBuiltIns(proposition.directAncestors());
	if(directAncestors.length >0) 
	    result += "\n    in "+directAncestors[0];
	for(int i=1;i<directAncestors.length;i++)
	    result += ", "+directAncestors[i];

	if (proposition.level() != Levels.TOKEN_LEVEL) { 
	    Proposition[] directParents =
		    removeBuiltIns(proposition.directParents());
	    if(directParents.length >0) {
		result += "\n    isA "+directParents[0];
	    }
	    for(int i=1;i<directParents.length;i++)
		result += ", "+directParents[i];
	}

	return result += "\nend";
    }  



}


