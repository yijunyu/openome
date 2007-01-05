
package jtelos.util;

import java.util.*;

public class QueryString extends ParamString {
  

  public QueryString(String s) 
	throws MalformedQueryStringException{
	  super(checkString(s));
	  /*      String[] temp = new String[100];
	  int nextAmp = s.indexOf("&",0);
	  int count = 1;
	  while(nextAmp!=-1) {
	temp[count-1] = s.substring(0,nextAmp);
	s=s.substring(nextAmp+1,s.length());
	nextAmp = s.indexOf("&",0);
	count++;
	  }
	  temp[count-1] = s.substring(0,s.length());
	  p = new Parameter[count];
	  for(int i=0;i<count;i++) {
	p[i] = new Parameter(temp[i]);
	  }*/
  }  

  public QueryString(String s, Parameter[] legalParams,
	     boolean HTML) throws MalformedQueryStringException{
	  this(s);
	  checkParams(s,legalParams,HTML);
  }  

  private void checkParams(String s,Parameter[] legalParams,boolean HTML)
	throws MalformedQueryStringException {
	  Parameter[] lp = legalParams;
	  for(int i=0;i<lp.length;i++) {
	if (!existsName(lp[i].name)) 
	  usageError(s,legalParams,lp[i].name,HTML);
	  }
	  for(int i=0;i<p.length;i++) {
	boolean found = false;
	boolean ruleExists = false;
	for(int j=0;j<lp.length;j++) {
	  if(lp[j].name.equals(p[i].name)) {
	    ruleExists = true;
	    if(lp[j].value.indexOf("$$option$$",0)!=-1) { 
	      found = true; 
	      break;
	    }
	    if (lp[j].value.equals(p[i].value)) {
	      found = true; 
	      break;
	    }
	  }
	}
	if (!found&&ruleExists&&lp.length>0) 
	  usageError(s,legalParams,p[i].name,HTML);
	  }
  }  

  private static String checkString(String s) 
	throws MalformedQueryStringException{
	  if (s.equals("")) {
	String message = "\nQuery string must have at least 1 argument of the "+
	  "form:\n<parameter name>=<parameter value>\nThese are separated by "+
	  "ampersands.";
	throw new MalformedQueryStringException(message);
	  }
	  return replace(s, new String[]{"%5E","%28","%29","%2C","%5B","%5D","%2F",
		            "%2E","%24","%2B","%2D","%20","%23","%3C","%3E","%22","%5C","%3A","%7E"},
		  new char[]{'^','(',')',',','[',']','/','.','$','+','-',' ',
			     '#','<','>','"','\\',':','~'});
  }          

  public boolean existsName(String n) {
	if (n == null) System.err.println("\n\n n = null \n\n");
	for(int i=0;i<length();i++){
	  if(n.equals(p[i].name)) return true;
	} return false;
  }  

  private String extractOption(String s) {
	String result = s;
	int optionStart = s.indexOf("$$option$$",0);
	if(!(optionStart==-1))
	  return s.substring(0,optionStart)+s.substring(optionStart+10,s.length());
	else return s;
  }  

  /** Command-line testing harness */
  public static void main (String[] argv) {
	try {
	  if (argv.length==0) {
	QueryString q = new QueryString("");
	  } else {
	System.out.println("");
	QueryString q = new QueryString(argv[0]);
	for (int i=0;i<q.length();i++) {
	  System.out.println("i: "+i+", name: "+q.nameAt(i)+", value: "+
			     q.valueAt(i));
	}
	System.out.println("");
	System.out.println("value for 'foo': "+q.valueFor("foo"));
	  }
	} catch (MalformedQueryStringException e) {
	  System.err.println("\n"+e.toString()+"\n");
	}
  }  

  private String nl(boolean HTML) {
	if (HTML) return "\n<p>";
	else return " ";
  }  

  public String toString() {
	String result = "";
	for (int i=0;i<length();i++) 
	   result += nameAt(i)+" = "+valueAt(i)+"\n"; 
	return result;
  }  

  private String usageError(String s,
			    Parameter[] legalParams,
			    String name,
			    boolean HTML) 
	throws MalformedQueryStringException {
	  Parameter[] lp = legalParams;
	  String message = nl(HTML) + "The query string: '" + s + "'" + 
	" cannot be processed. " + nl(HTML);
	  Vector legalValues = new Vector();
	  for(int j=0;j<lp.length;j++) {
	if (lp[j].name.equals(name))
	  legalValues.addElement(name+"="+extractOption(lp[j].value));
	  }
	  message = message+"It should have included: '";
	  boolean first = true;
	  for(Enumeration e = legalValues.elements();e.hasMoreElements();) {
	String paramMessage = (String) e.nextElement();
	if (!first) {
	  if (!e.hasMoreElements()) message = message+"' or '";
	  else message = message+"', '";
	}
	message = message+paramMessage;
	first = false;
	  }
	  message = message+"'.";
	  throw new MalformedQueryStringException(message);
  }  

}