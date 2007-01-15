
package jtelos.util;


public class ParamString {
  
  private String str;

  protected Parameter[] p;


  public ParamString(String s) {
	  String[] temp = new String[100];
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
	  for(int i=0;i<count;i++) p[i] = new Parameter(temp[i]);
  }  

  public int length() { return p.length; }  

  public String nameAt(int i) { return p[i].name; }  

  protected static String replace(String s, String[] targets, 
				  char[] replacements) {
	for (int i=0;i<targets.length;i++) {
	  int start = 0;
	  int end = s.indexOf(targets[i],start);
	  while(end!=-1) {
	s = s.substring(0,end)+String.valueOf(replacements[i])+
	  // changed "3" to "targets[i].length()" in line below:
	  s.substring(end+targets[i].length(),s.length());
	start = end+1; // 1 = "length" of character
	end = s.indexOf(targets[i],start);
	  }
	} return s;
  }  

  public String toString() { return str; }  

  public String valueAt(int i) { return p[i].value; }  

  /** Returns value of query string parameter matching the argument "n",
	  or null if there is no match. */
  public String valueFor(String n) {
	for(int i=0;i<length();i++){
	  if(n.equals(p[i].name)) return p[i].value;
	} return null;
  }  

}