
package jtelos.apps;


import java.io.*;
import java.util.*;

import jtelos.*;
import jtelos.util.*;

public class Parser implements Levels {

  //===========================================================================
  // PRIVATE STATIC FIELDS
  //===========================================================================

  private static final String END = "END";
  private static final String M2Class = "M2Class";
  private static final String M1Class = "M1Class";
  private static final String SClass = "SClass";
  private static final String Token = "Token";

  //===========================================================================
  // PRIVATE INSTANCE FIELDS
  //===========================================================================

  private TelosTokenizer tokenizer;
  private KB kb;

  private static class TelosTokenizer {
	StreamTokenizer t;
	static final String END_OF_FILE = "";
	String[] last10 = new String[10];
	int pushBack = 0;

	void pushBack() { pushBack++; }

	String nextToken() {
	  String result = null;
	  try {
	if (pushBack>0) {
	  //p("pushBack: "+pushBack);
	  result = last10[10-pushBack];
	  System.arraycopy(last10,0,last10,1,9);
	  pushBack--;
	} else {
	  t.nextToken();
	  if (t.ttype == t.TT_WORD) result = t.sval;
	  else if (t.ttype == ':') result = ":";
	  else if (t.ttype == ';') result = ";";
	  else if (t.ttype == ',') result = ",";
	  else if (t.ttype == t.TT_NUMBER) result = Double.toString(t.nval);
		  else if (t.ttype == '"') result = "\""+t.sval+"\"";
	  else if (t.ttype == t.TT_EOF) result = END_OF_FILE;
	  else {
	    String message = 
	      "Parser$TelosTokenizer.nextToken() found unhandled case."+
	      "\n   t.ttype == "+t.ttype+
			  "\n   as char: == '"+new String(new char[]{(char)t.ttype})+"'"+
	      "\n   on line: "+t.lineno();
	    throw new RuntimeException(message);
	  }
	  System.arraycopy(last10,1,last10,0,9);
	  last10[9] = result;
	}
	//p("nextToken(): "+result);
	return result;
	  } catch (Exception e) { 
	String message = 
	  "Parser$TelosTokenizer.nextToken() caught exception.";
	throw new RuntimeEncapsulatorException(e,message);
	  }
	}

	TelosTokenizer(String fileName) {
	  try {
	t = new StreamTokenizer(new BufferedReader(
				  new FileReader(new File(fileName))));
	t.ordinaryChar(':');
	t.ordinaryChar(';');
	t.ordinaryChar(',');
	t.slashSlashComments(true);
	t.slashStarComments(true);
	t.commentChar('#');
		t.wordChars('/','/');
		t.wordChars('\\','\\');
		t.wordChars(':',':');
		t.wordChars('~','~');
		t.wordChars('^','^');
		t.wordChars('_','_');
	  } catch (Exception e) { 
	String message = 
	  "Parser$TelosTokenizer("+fileName+") caught exception.";
	throw new RuntimeEncapsulatorException(e,message);
	  }
	}

  }



  //===========================================================================
  // PUBLIC CONSTRUCTOR
  //===========================================================================

  /** When this constructor is invoked, the parser parses the file and
   * populates the KB with the individuals and attributes discovered
   * therein. Some of the individuals may reference otheres that are
   * present in the KB but not in the file. The file format should be
   * "Telos text" instead of s-expressions. (Another parser should be
   * written for that format). It is assumed that no checking is
   * necessary (e.g. that the objects in the file are not already
   * present in the KB, that the file is lexically, syntactically and
   * sematically correct, etc). To check the file, have the C++
   * implementation of Telos parse it.
   **/
  public Parser(String fileName, KB kb) {
	this.tokenizer = new TelosTokenizer(fileName);
	this.kb = kb;
	parse();
  }  

  private void addNewAttr(Individual declarer,
			  String catLabels,
			  String label,
			  String targetName) {
	kb().newAttribute(declarer,
		      StaticHelper.stringToStringArray(catLabels),
		      label,
		      checkIndividualOrLiteral(targetName));
  }  

  private IndividualOrLiteral checkIndividualOrLiteral(String telosName) {
	if(telosName.startsWith("\""))
	  return new TelosString(telosName.substring(1,telosName.length()-1));
	else if(telosName.endsWith(".0")) {
	  TelosInteger result = null;
	  try {
		return new TelosInteger(telosName.substring(0,telosName.length()-2));
	  } catch (NumberFormatException e) {
		String message =
		  "Parser.checkIndividualOrLiteral("+telosName+") cannot accept parser tokens"+
		  " that end with '.0'";
		throw new RuntimeException(message);
	  }
	}
	try {
	  Real result = new Real(telosName);
	  p("Parser.checkIndividualOrLiteral("+telosName+") returning Real");
	  return result;
	} catch (NumberFormatException e2) { 
	  return kb().possiblyUndeclaredNew(telosName); }
  }  

  //===========================================================================
  // PRIVATE ACCESSOR METHODS
  //===========================================================================

  private KB kb() { return kb; }  

  //===========================================================================
  // PRIVATE PARSING METHODS
  //===========================================================================

  private String nextToken() { return tokenizer.nextToken(); }  

  //===========================================================================
  // PRIVATE DEBUGGING/TESTING METHODS
  //===========================================================================

  private static void p(String s) { System.err.println(s); }  

  private static void p(boolean debug,String s) { if(debug) System.err.println(s); }  

  private void parse() {
	String token = tokenizer.nextToken();
	while(!token.equals(tokenizer.END_OF_FILE)) {
	  processIndividual(token);
	  token = tokenizer.nextToken();
	}
	Individual[] members = kb.individuals();
	for(int i=0;i<members.length;i++) {
	  if (!((Individual)members[i]).isDeclared())
		p("Parser.parse(): individual " + members[i].telosName() +
		  " is not declared.");
	}
  }  

  private String processCatList(Individual individual) {
	//p("Parser.processCatList("+individual.telosName()+")");
	pushBack();
	String catLabels = nextToken();
	//if((!catLabels.equals(",")) && (catLabels.indexOf(",") != -1)) {
	//  String message =
	//    "Parser.processCatList("+individual.telosName()+"):"+
	//    "\n   constructor found catLabels element: '"+catLabels+"'";
	//  throw new RuntimeException(message);
	//}
	String token = nextToken();
	boolean comma = false;
	boolean labeled = false;
	while (!token.equals(":")) {
	  if(!token.equals(",")) {
	if(comma) {
	  catLabels += ","+token;
	  comma = false;
	} 
	else labeled = true;
	  }
	  else comma = true;
	  token = nextToken();
	}
	String label = "\"\"";
	if (labeled) {
	  pushBack();
	  pushBack();
	  label = nextToken();
	  nextToken();
	  //p("label: "+label);
	}
	String target = nextToken();
	addNewAttr(individual,catLabels,label,target);
	token = nextToken();
	if(token.equals(";")) {
	  labeled = false;
	  boolean terminated = false;
	  token = nextToken();
	  //p("   out of loop: token: "+token);
	  label = "\"\"";
	  while (true) {
	if (token.equals(":"))
	  addNewAttr(individual,catLabels,label,nextToken());
	else {
	  label = token;
	  //p("label: "+token);
	  String test = nextToken();
	  //p("test: "+test);
	  if(!test.equals(":")) {
	    String message =
	      "Parser.processCatList("+individual.telosName()+
	      ") expected ':', received: "+test;
	    throw new RuntimeException(message);
	  }
	  addNewAttr(individual,catLabels,label,nextToken());
	}
	token = nextToken();
	if(!token.equals(";")) break;
	token = nextToken();
	  }
	}
	return token;
  }  

  private void processIndividual(String token) {
	int level;
	// Note we do not expect declarations of omegaclasses in 
	// a Telos file.
	if (token.equals("MetaMetaMetaClass")) level = M3CLASS_LEVEL;
	else if (token.equals("MetaMetaClass")) level = M2CLASS_LEVEL;
	else if (token.equals("MetaClass")) level = METACLASS_LEVEL;
	else if (token.equals("SimpleClass")) level = SIMPLE_CLASS_LEVEL;
	else if (token.equals("Token")) level = TOKEN_LEVEL;
	else {
	  String message = "Parser.level("+token+") couldn't find level.";
	  throw new RuntimeException(message);
	}
	String telosName = nextToken();
	//p("\nProcessing: "+telosName);
	Individual individual = kb().newIndividual(telosName,level);
	token = nextToken();
	if (token.toUpperCase().equals("IN")) token = processINList(individual);
	if (token.toUpperCase().equals("ISA")) token = processISAList(individual);
	if (token.toUpperCase().equals("WITH")) token = processWITHList(individual);
	if (!token.toUpperCase().equals("END")) {
	  String message = "Parser.processIndividual on " + 
	individual.telosName() + " found improper end to declaration: "+
	token;
	  throw new RuntimeException(message);
	}
  }  

  private String processINList(Individual individual) {
	//p("   Parser.processINList("+individual.telosName()+")");
	Vector v = new Vector();
	v.addElement(nextToken());
	String token = nextToken();
	while (!token.toUpperCase().equals("ISA")&&
	   !token.toUpperCase().equals("WITH")&&
	   !token.toUpperCase().equals("END")) {
	  if(!token.equals(",")) v.addElement(token);
	  token = nextToken();
	}
	String[] ancestorNames = new String[v.size()];
	for(int i=0;i<v.size();i++) ancestorNames[i] = (String) v.elementAt(i);
	setDirectAncestorsWithInverses(individual,ancestorNames);
	return token;
  }  

  private String processISAList(Individual individual) {
	//p("   Parser.processISAList("+individual.telosName()+")");
	Vector v = new Vector();
	v.addElement(nextToken());
	String token = nextToken();
	while (!token.toUpperCase().equals("WITH")&&
	   !token.toUpperCase().equals("END")) {
	  if(!token.equals(",")) v.addElement(token);
	  token = nextToken();
	}
	String[] parentNames = new String[v.size()];
	for(int i=0;i<v.size();i++) parentNames[i] = (String) v.elementAt(i);
	setDirectParentsWithInverses(individual,parentNames);
	//p("processISAList("+individual.telosName()+") returning: "+token);
	return token;
  }  

  private String processWITHList(Individual individual) {
	//p("   Parser.processWITHList("+individual.telosName()+")");
	String token = nextToken();
	while (!token.toUpperCase().equals("END"))
	  token = processCatList(individual);
	//p("      last token: " + token);
	return token;
  }  

  private void pushBack() { tokenizer.pushBack(); }  

  private void setDirectAncestorsWithInverses(Individual individual,
					      String[] directAncestorNames) {
	  individual.addDirectAncestorsWithInverses(toArray(directAncestorNames));
  }  

  private void setDirectParentsWithInverses(Individual individual,
					    String[] directParentNames) {
	  individual.addDirectParentsWithInverses(toArray(directParentNames));
  }  

  static void setLevel(Individual individual,int level) { 
	individual.setLevel(level);
  }  

  //===========================================================================
  // DEBUGGING / TESTING METHODS
  //===========================================================================

  
  /**
  public static void main(String[] argv) {
	try {
	  jtelos.example.exKB kb = jtelos.example.exKB.New("TestKB",
	"/homes/aleph/skerr/arch/java/classes/exTest/TestKB.tel");
	  //jtelos.cdm.cKB kb = jtelos.cdm.cKB.New(
	  //"TestKB",
	  //"/homes/aleph/skerr/arch/java/classes/cdmTest/TestKBobm");
	  if(kb.containsOnlyBuiltIns()) {
	Parser parser = new Parser(argv[0],kb);
	kb.save();
	//kb.shutdown();
	  }
	} catch (Throwable e) { e.printStackTrace(); }
  }
  **/
  
  //===========================================================================
  // PRIVATE PARSING HELPER METHODS
  //===========================================================================

  private Individual[] toArray(String[] names) {
	Individual[] result = new Individual[names.length];
	for(int i=0;i<names.length;i++) {
	  try { result[i] = kb().individual(names[i]); }
	  catch (IndividualNotInKBException e) {
		result[i] = kb().possiblyUndeclaredNew(names[i]);
	  }
	} return result;
  }  

  private Attribute[] toAttrArray(String[] names) {
	Attribute[] result = new Attribute[names.length];
	for(int i=0;i<names.length;i++) result[i] = kb().attribute(names[i]);
	return result;
  }  

}