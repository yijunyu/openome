
package jtelos.apps;


import java.io.IOException;
import java.lang.reflect.Constructor;

import jtelos.Individual;
import jtelos.IndividualNotInKBException;
import jtelos.KB;
import jtelos.Levels;
import jtelos.Repository;
import jtelos.StaticHelper;
import jtelos.TelosObject;
import jtelos.util.MalformedQueryStringException;
import jtelos.util.Parameter;
import jtelos.util.QueryString;
import jtelos.util.RuntimeEncapsulatorException;

/** This processes queries and generates HTML to represent the
 * contents of jtelos-compliant KB's. It can be run with the
 * <code>srun</code> tool:
 *
 * <p><code>srun -d </code>&lt servlet directory &gt<code> 
 * jtelos.apps.TelosServlet</code>
 *
 * <p>It can then be reached by the http request from a browser:
 *
 * <p><code>http://</code>&lt host name &gt<code>:8080/servlet/jtelos.apps.TelosServlet</code>
 *
 * <p>For refining these commands, see the <code>srun</code>
 * documentation in the servlet download package.
 **/
public class TelosServlet extends HttpServlet implements Levels {

  // =========================================================================
  // Fields
  // =========================================================================

  private static final String servletClassName =
	"jtelos.apps.TelosServlet";

  // Hard-coded evil for debugging:
  //jtelos.KB kb;

  private Repository repository;



  public TelosServlet() {
	// Hard-coded evil for debugging:
	//    kb = (jtelos.KB) 
	//      jtelos.example.exKB.New("TestKB",
	//        "/homes/aleph/skerr/arch/java/classes/exTest/TestKB.tel");
	//kb = jtelos.cdm.cKB.New(
	//  "TestKB",
	//  "/homes/aleph/skerr/arch/java/classes/cdmTest/TestKBobm");
	//Repository.addKB(kb);
	//if(kb.hasOnlyBuiltIns())
	//  new Parser("/h/m/skerr/telos/File.tel",kb);
  }  

  private String className() { return this.getClass().getName(); }  

  protected String createRep(QueryString q) { return kbsForm(q); }  

  private String deleteKB(QueryString q) {
	repository(q).delete(makeKB(q));
	return kbsForm(q);
  }  

  protected TelosObject getObject(QueryString q) { 
	KB kb = makeKB(q);
	TelosObject result = null;
	String telosName = q.valueFor("telosName");
	if (telosName.indexOf(":") != -1)
	  result = kb.attribute(telosName);
	else return kb.individual(telosName);
	// If the first query is for an attribute object, we may have to
	// populate it's declarer.
	if(result == null) {
	  ((Individual)populateDeclarer(telosName,kb)).directAttrs();
	  // This risks an infinite loop
	  result = getObject(q);
	}
	return result; 
  }  

  private String header() {
	return "<HTML><HEAD>\n<TITLE>Telos Repository</TITLE></HEAD>"+
	  "\n<BODY><p><hr><H1>Telos Repository</h1><hr>";
  }  

  private static String href(Individual indiv) { 
	return TelosPrinter.href(indiv); 
  }  

  private static String href(KB kb) { return TelosPrinter.href(kb); }  

  protected String kbContents(KB kb) { 
	String result = kbHeader(kb)+
	  "<h2>Builtin classes:</h2>"+
	  "<p><ul>"+
	  "<li>"+href(kb.TOKEN())+
	  "<li>"+href(kb.SIMPLE_CLASS())+
	  "<li>"+href(kb.METACLASS())+
	  "<li>"+href(kb.M2CLASS())+
	  "<li>"+href(kb.M3CLASS())+
	  "</ul>"+
	  "<h4>Number of individuals in KB: "+kb.size()+"</h4>"+
	  "<p><hr><form action=\""+className()+"\" method=\"GET\">"+
	  "\n<h4>Load a Telos File into this KB:</h4>"+
	  "<input type=\"text\" name=\"file\" value=\"\" size=75>"+
	  "<input type=\"hidden\" name=\"kb\" value=\""+kb.name()+"\">"+
	  "<input type=\"hidden\" name=\"repclass\" value=\""+
	  kb.repository().getClass().getName()+"\">"+
	  "<input type=\"hidden\" name=\"command\" value=\"loadfile\">"+
	  "\n\n<p><input type=\"Submit\" value=\"Load\">\n</form>"+
	  "\n<p><hr><h2>Other Commands:</h2>"+
	  "<ul><li><a href=\""+className()+"?command=savekb&kb="+
	  kb.name()+"&repclass="+kb.repository().getClass().getName()+"\">Save KB</a>"+
	  "<li><a href=\""+className()+"?command=wipekb&kb="+
	  kb.name()+"&repclass="+kb.repository().getClass().getName()+"\">Wipe KB</a>"+
	  "<li><a href=\""+className()+"?command=deletekb&kb="+
	  kb.name()+"&repclass="+kb.repository().getClass().getName()+"\">Delete KB</a>"+
	  "</ul>";
	return result;
  }  

  String kbHeader(KB kb) {
	return "<HTML><HEAD>\n<TITLE>Telos KB: "+kb.name()+"</TITLE></HEAD>"+
	  "\n<BODY><p><a href=\""+className()+"?repclass="+
	  kb.repository().getClass().getName()+"&command=showrep"+
	  "\"><code>Repository Top</code></a><p><hr><H1>Telos KB: "+
	  kb.name()+"</h1><hr>";
  }  

protected String kbsForm(QueryString q) {
	KB[] kbs = repository(q).kbs();

	String result = header() + "<h2>KB's in this repository:</h2>\n<ul>";
	for (int i = 0; i < kbs.length; i++) result += "<li>" + href(kbs[i]);
	result += "</ul>\n<p><hr><form action=\"" + className() + "\" method=\"GET\">" + 
	  "\n<p><h2>Create a new KB</h2><b>KB Name: </b>" + 
	  "<input type=\"text\" name=\"kb\" value=\"\" size=25>" + 
	  "<input type=\"hidden\" name=\"command\" value=\"createkb\">" + 
	  "<input type=\"hidden\" name=\"repclass\" value=\"" + 
	  repository.getClass().getName() + "\">" + 
	  "\n\n <input type=\"submit\" value=\"Create\">\n</form><hr>" + 
	  "\n<p><h2>Delete a KB</h2>\n<ul>";
	for (int i = 0; i < kbs.length; i++) result += "<li>" + TelosPrinter.deleteHref(kbs[i]);
	return result;
}

  protected String loadFile(QueryString q) {
	KB kb = makeKB(q);
	kb.load(q.valueFor("file"));
	return kbContents(kb);
  }  

  protected KB makeKB(QueryString q) { 
	return repository(q).newKB(q.valueFor("kb")); 
  }  

  protected QueryString makeQueryString(String str) 
	throws MalformedQueryStringException {
	return new QueryString(str,new Parameter[]{},true);
  }  

  static void p(String message) { System.err.println(message); }  

  static void p(boolean debug, String message) { if (debug) p(message); }  

  // telosName is for an attribute object. Return its declarer.
  Individual populateDeclarer(String telosName, KB kb) {
	int ind = telosName.indexOf(":");
	int end = telosName.lastIndexOf(".",ind);
	// end is now the end of the attribute object's label
	ind = end;
	end = telosName.lastIndexOf(".",ind-1);
	try {
	  return kb.individual(telosName.substring(0,end));
	} catch (Exception e) {
	  String message = "\n\nTelosServlet.populateDeclarer("+telosName+","+
	kb.name() + ")\n    caught exception.\n    Tried to instantiate: "+
	telosName.substring(0,end);
	  p(message);
	  throw new RuntimeEncapsulatorException(e,message);
	}
  }  

  private String processQuery(QueryString q) {
	String s = "";
	try {
	  if (!q.existsName("telosName")) {
	if(q.existsName("command")) {
	  String command = q.valueFor("command");
	  if (command.equals("showkb")) s += kbContents(makeKB(q));
	  else if (command.equals("showrep")) s += kbsForm(q);
	  else if (command.equals("createrep"))s += createRep(q);
	  else if (command.equals("createkb")) s += kbContents(makeKB(q));
	  else if (command.equals("loadfile")) s += loadFile(q);
	  else if (command.equals("savekb")) s += saveKB(q);
	  else if (command.equals("wipekb")) s += wipeKB(q);
	  else if (command.equals("deletekb")) s += deleteKB(q);
	  else throw new RuntimeException("Unable to process query.");
	}
	  } else {
	TelosObject obj = getObject(q);
	if (obj == null) {
	  s = "\n<h1>Can not find object:<p>Parameters:<ul>";
	  for (int i=0;i<q.length();i++) 
	    { s += "\n<li>"+q.nameAt(i)+"\n = "+q.valueAt(i); }
	  s += "\n</ul></h1>";
	} 
	else {
	  try {
	    s = TelosPrinter.print(obj);
	  } catch (IndividualNotInKBException e) {
	    s = "\n<h1>Individual <code>"+q.valueFor("telosName")+
	      "</code> not in KB: <code>"+q.valueFor("kb")+
	      "</code><p>Parameters:<ul>";
	    for (int i=0;i<q.length();i++) 
	      { s += "\n<li>"+q.nameAt(i)+"\n = "+q.valueAt(i); }
	    s += "\n</ul></h1>";
	  }
	}
	  }
	} catch (Throwable e) {
	  s = s + "<h4>Telos Repository "+
	"caught the following exception:</h4>"+
	"<h4><pre>"+e.toString()+"</pre></H4><p>"+
	"<p><h4>Failed to process query string: <pre>"+
	q.toString()+"</pre></h4>";
	  e.printStackTrace();
	} return s;
  }  

protected Repository repository(QueryString q) {
	if (repository == null) {
		try {
			String repClassName = q.valueFor("repclass");
			p("repClassName: " + repClassName);
			Class repClass = Class.forName(repClassName);
			Constructor constructor = repClass.getConstructor(new Class[] {});
			repository = (Repository) constructor.newInstance(new Object[] {});
		} catch (Throwable e) {
			throw StaticHelper.wrap(e, "TelosServlet.makeKB");
		}
	}
	return repository;
}

  private String repsForm() {
	return "<HTML><HEAD>\n<TITLE>Telos Servlet</TITLE></HEAD>"+
	  "\n<BODY><p><hr><H1>Telos Servlet</h1><hr>"+
	  "<h2>Select a repository implementation:</h2>\n"+
	  "\n<form action=\""+className()+"\" method=\"GET\">"+
	  "<input type=\"hidden\" name=\"command\" value=\"createrep\">"+
	  "<SELECT NAME=\"repclass\">"+
	  "<OPTION VALUE=\"jtelos.example.exRepository\">Example (persistent)"+
	  "<OPTION VALUE=\"jtelos.cdm.cRepository\">CDM (persistent)"+
	  "<OPTION VALUE=\"jtelos.cppstdio.cpRepository\">C++ stdio (cache)"+
	  "</SELECT>"+
	  "\n\n<p><input type=\"submit\" value=\"Create\">\n</form><hr>";
  }  

  protected String saveKB(QueryString q) {
	KB kb = makeKB(q);
	kb.save();
	return kbContents(kb);
  }  

  public void service(ServletRequest req, ServletResponse res) {
	String queryString = ((HttpServletRequest)req).getQueryString();
	String response = "";
	if(queryString != null) {
	  try { 
	QueryString q = makeQueryString(queryString);
	response = processQuery(q);
	if (q.existsName("telosName"))
	  response = title(getObject(q))+response;
	  } catch (MalformedQueryStringException e) {
	p("\n\n"+e.toString()+"\n\n");
	response = "<h4>'TelosServelet.service "+
	  "found Error found in parsing query string:"+ e.getMessage()+"</h4>";
	  }
	} else if (repository == null) response = repsForm();
	else response = kbsForm(null);
	res.setContentType("text/html");
	try {
	  ServletOutputStream out = res.getOutputStream();
	  out.println(response);
	  out.flush();
	} catch (IOException e) { e.printStackTrace(); }
  }  

  protected String title(TelosObject obj) { 
	KB kb = obj.kb();
	return "<HTML><HEAD>\n<TITLE>"+ obj.telosName() +
	  "</TITLE>\n</HEAD>\n<BODY><p><a href=\""+className()+"?repclass="+
	  repository.getClass().getName()+"&command=showrep"+
	  "\"><code>Repository Top</code></a><p><hr><h1>Telos KB: <a href=\""+
	  className()+"?command=showkb&kb="+kb.name()+"&repclass="+
	  repository.getClass().getName()+"\">"+obj.kb().name()+"</a></h1><hr>";
  }  

  protected String wipeKB(QueryString q) {
	KB kb = makeKB(q);
	kb.wipe();
	return kbContents(kb);
  }  

}