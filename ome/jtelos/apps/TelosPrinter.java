
package jtelos.apps;


import jtelos.Attribute;
import jtelos.AttributeClass;
import jtelos.Individual;
import jtelos.IndividualOrLiteral;
import jtelos.KB;
import jtelos.Levels;
import jtelos.Omegaclass;
import jtelos.OmegaclassOrAttributeClass;
import jtelos.PrimitiveLiteral;
import jtelos.StaticHelper;
import jtelos.TelosObject;

public class TelosPrinter implements Levels {

  //===========================================================================
  // PRIVATE FIELD
  //===========================================================================

  private static final String servletClassName =
	"jtelos.apps.TelosServlet";

  private static boolean verbose = false;



  static String declaredHref(Attribute obj) {
	if(obj == null) p("TelosServlet.declaredHref: obj == null");
	return stringArrayToString(obj.catLabels())+
	  "<dl>\n<dt></dt><dd>\n<a href=\""+servletClassName+"?"+
	  URLString("telosName="+obj.telosName()+
				"&kb="+obj.kb().name()+"&repclass="+
				obj.kb().repository().getClass().getName())+
	  "\">"+fixLabel(obj.label())+"</a> : "+
	  hrefIndividualOrLiteral(obj.target())+
	  pIfVerbose(" ("+label(obj.target()) + ")")+"</dd></dl>";
  }  

  static String deleteHref(KB kb) {
	if(kb == null) p("TelosRepository.href: obj == null");
	return "<a href=\""+servletClassName+"?"+
	  URLString("command=deletekb&kb="+kb.name()+
				"&repclass="+kb.repository().getClass().getName())+
	"\">"+kb.name()+"</a>\n";
  }  

  private static String fixLabel(String label) {
	if (label.equals("\"\"")) return "&lt;unlabeled&gt;";
	else return label;
  }  

  static String href(Attribute obj) {
	if(obj == null) {
	  String message = "TelosServlet.href: obj == null";
	  p(message);
	  throw new RuntimeException(message);
	}
	return stringArrayToString(obj.catLabels())+"<dl>\n<dt></dt><dd>"+
	  "<a href=\""+servletClassName+"?"+
	  URLString("telosName="+obj.telosName()+
				"&kb="+obj.kb().name()+"&repclass="+
				obj.kb().repository().getClass().getName())+
	  "\">"+fixLabel(obj.label())+"</a>"+" : "+
	  hrefIndividualOrLiteral(obj.target())+pIfVerbose(" ("+label(obj.target())+") ")+
	  "\n</dd><dt></dt><dd>declared in: "+href(obj.declarer())+"</dd></dl>";
  }  

  static String href(Individual obj) {
	if(obj == null) p("TelosServlet.href: obj == null");
	return "<a href=\""+servletClassName+"?"+
	  URLString("telosName="+obj.telosName()+"&kb="+obj.kb().name()+
				"&repclass="+obj.kb().repository().getClass().getName())+
	"\">"+obj.telosName()+"</a>\n";
  }  

  static String href(KB kb) {
	if(kb == null) p("TelosRepository.href: obj == null");
	return "<a href=\""+servletClassName+"?"+
	  URLString("command=showkb&kb="+kb.name()+
				"&repclass="+kb.repository().getClass().getName())+
	"\">"+kb.name()+"</a>\n";
  }  

  private static String hrefIndividualOrLiteral(IndividualOrLiteral obj) {
	if(obj instanceof PrimitiveLiteral) 
	  return ((PrimitiveLiteral)obj).telosName();
	return href((Individual)obj);
  }  

  private static String label(IndividualOrLiteral target) {
	if (target instanceof PrimitiveLiteral ||
	(target instanceof Individual &&
		((Individual)target).level() == TOKEN_LEVEL))
	  return "Token / Primitive Literal";
	Individual targIndiv = (Individual) target;
	if (targIndiv.level() == OMEGACLASS_LEVEL) return "Omega Class";
	else if (targIndiv.level() == SIMPLE_CLASS_LEVEL) return "Simple Class";
	else if (targIndiv.level() == METACLASS_LEVEL) return "MetaClass";
	else if (targIndiv.level() == M2CLASS_LEVEL) return "M2Class";
	else if (targIndiv.level() == M3CLASS_LEVEL) return "M3Class";
	else if (targIndiv.level() == M4CLASS_LEVEL) return "M4Class";
	else 
	  throw new RuntimeException("TelosServlet.label("+targIndiv.telosName()+
		    ") couldn't find level of attribute object.");
  }  

  private static String levelString(int level) {
	switch (level) {
	  case OMEGACLASS_LEVEL : return "OmegaClass";
	  case M4CLASS_LEVEL : return "M4Class";
	  case M3CLASS_LEVEL : return "M3Class";
	  case M2CLASS_LEVEL : return "M2Class";
	  case METACLASS_LEVEL : return "MetaClass";
	  case SIMPLE_CLASS_LEVEL : return "Simple Class";
	  case TOKEN_LEVEL : return "Token";
	}
	throw new RuntimeException(
	  "TelosObject.levelString couldn't find level.");
  }  

  private static String p(String message) { System.err.println(message); return "";}  

  private static void p(boolean debug, String message) { if (debug) p(message); }  

  static String pIfVerbose(String s) {if (verbose) return s; else return "";}  

  private static String print(Individual[] objs) {
	String result="\n<ul>";
	for (int i=0;i<objs.length;i++) 
	  result+="\n<li>"+href(objs[i]);
	return result+"\n</ul>";
  }  

  //===========================================================================
  // PACKAGE-VISIBLE METHODS
  //===========================================================================

  static String print(TelosObject obj) {
	if(obj instanceof Omegaclass) return printOmegaclass((Omegaclass)obj);
	else if(obj instanceof Attribute) return printAttribute((Attribute)obj);
	else return printIndividual((Individual)obj);
  }  

  private static String printAttribute(Attribute obj) {
	String result = "<h1>Attribute: "+fixLabel(obj.label())+"</h1>"+
	"\n<p><b>Declarer:</b> "+printIndividualHref(obj.declarer())+
	"\n<p><b>Target:</b> "+hrefIndividualOrLiteral(obj.target())+
	"\n<p><b>Categories:</b>"+printAttrs(obj.categories())+
	"\n<p><b>Narrows:</b>"+printAttrs(obj.directlyNarrows())+
	"\n<p><b>Narrowed by:</b>"+printAttrs(obj.directlyNarrowedBy())+
	"\n<p><b>Instances:</b>"+ printAttrs(obj.instances());
	return result;
  }  

  private static String printAttrs(Attribute[] objs) {
	String result="\n<ul>";
	for (int i=0;i<objs.length;i++) result+="\n<li>"+href(objs[i]);
	return result+"\n</ul>";
  }  

  private static String printDeclaredAttrs(Attribute[] objs) {
	String result="\n<ul>";
	for (int i=0;i<objs.length;i++) result+="\n<li>"+declaredHref(objs[i]);
	return result+"\n</ul>";
  }  

  private static String printIndividual(Individual obj) {
	//p("TelosServlet.printIndividual("+obj.telosName()+")");
	String result = "<h1>"+levelString(obj.level())+": "+obj.telosName()+"</h1>"+
	"\n<p><b>Ancestors:</b>\n"+print(sort(obj.directAncestors()));
	if(obj.level() != TOKEN_LEVEL) {
	  result +="\n<p><b>Instances:</b>\n"+print(sort(obj.instances()))+
	  "\n<p><b>Parents:</b>\n"+print(sort(obj.directParents()))+
	  "\n<p><b>Children:</b>\n"+print(sort(obj.directChildren()));
	}
	result +=
	  "\n<p><b>Direct attributes:</b>\n"+
	  printDeclaredAttrs(obj.directAttrs());
	if(obj.level() != TOKEN_LEVEL)
	  result +=
		"\n<p><b>Inherited attributes:</b>\n"+
		printAttrs(obj.inheritedAttrs());
	result +=
	  "\n<p><b>Referenced by:</b>\n"+printAttrs(obj.referencedBy());
	return result;
  }  

  private static String
	printIndividualHref(Individual obj) { return href(obj); }

  private static String printOmegaclass(Omegaclass obj) {
	//p("TelosServlet.printOmegaclass("+obj.telosName()+")");
	String result = "<h1> Omegaclass: "+obj.telosName()+"</h1>"+
	"\n<p><b>Ancestors:</b>\n"+print(obj.directAncestors())+
	"\n<p><b>Instances:</b>\n"+print(obj.instances())+
	"\n<p><b>Parents:</b>\n"+print(obj.directParents())+
	"\n<p><b>Children:</b>\n"+
	  printOmegaclassOrAttributeClass(obj.directOmegaChildren())+
	"\n<p><b>Direct attributes:</b>\n"+printDeclaredAttrs(obj.directAttrs())+
	"\n<p><b>Referenced by:</b>\n"+printAttrs(obj.referencedBy());
	return result;
  }  

  private static String 
	printOmegaclassOrAttributeClass(OmegaclassOrAttributeClass[] objs) {
	String result="\n<ul>";
	for (int i=0;i<objs.length;i++) {
	  result += "      ";
	  if(objs[i] instanceof Omegaclass) 
	result += "\n<li>"+href((Omegaclass)objs[i]);
	  else result += "\n<li>"+href((AttributeClass)objs[i]);
	}
	return result+"\n</ul>";
  }  

  private static String replace(String s, char target, String replacement) {
	int start = 0;
	int end = s.indexOf(target,start);
	while(end!=-1) {
	  s = s.substring(0,end)+replacement+s.substring(end+1,s.length());
	  start = end+1;
	  end = s.indexOf(target,start);
	}
	return s;
  }  

  private static String sameLine(String s) { 
	return s.substring(0,s.length()-1);
  }  

  private static Individual[] sort(Individual[] indivs) {
	return StaticHelper.sortIndividualArray(indivs);
  }  

  //===========================================================================
  // PRIVATE METHODS
  //===========================================================================

  // This is used to turn arrays of strings into a single string in
  // order to print them.
  private static String stringArrayToString(String[] catLabels) {
	String result = catLabels[0];
	for(int i=1;i<catLabels.length;i++) result +=", "+catLabels[i];
	return result;
  }  

  private static String URLString(String s) {
	s = replace(s,'"',"%22");
	s = replace(s,'#',"%23");
	s = replace(s,'.',"%2E");
	s = replace(s,'/',"%2F");
	s = replace(s,' ',"%20");
	s = replace(s,'<',"%3C");
	s = replace(s,'>',"%3E");
	return s;
  }  

}