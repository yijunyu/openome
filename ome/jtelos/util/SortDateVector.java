
package jtelos.util;

import java.util.Date;
import java.util.Enumeration;
import java.util.Vector;

public class SortDateVector {

  private Vector v = new Vector();
  private Vector keys = new Vector();


  public void addElement(Date key,Object obj) {
	int index = findPoint(key);
	keys.insertElementAt(key,index);
	v.insertElementAt(obj,index);
  }  

  public boolean contains(Object obj) { return v.contains(obj); }  

  public Object elementAt(int i) {
	if (v.size() > i) return v.elementAt(i);
	return null;
  }  

  public Enumeration elements() { return v.elements(); }  

  private int findPoint(Date target) {
	boolean d = false; p(d,"SortDateVector.findPoint("+target+")");
	int start = 0;
	int end = v.size();
	int middle;
	while(end > start) {
	  middle = (end + start) / 2;
	  p(d,"   keys.elementAt("+middle+"): " + v.elementAt(middle));
	  if (((Date)keys.elementAt(middle)).before(target)) {
	start = middle+1;
	  } else end = middle;
	} return end;
  }  

  public Object get(Date key) {
	boolean d = false; p(d,"SortDateVector.get("+key+")");
	int findPoint = findPoint(key);
	p(d,"   findPoint: "+findPoint);
	p(d,"   v.size(): "+v.size());
	if (v.size() > findPoint) {
	  Object obj = v.elementAt(findPoint);
	  if (((Date)keys.elementAt(findPoint)).equals(key)) return obj;
	} return null;
  }  

  private static void p(boolean debug, String message) {
	if (debug) System.err.println(message);
  }  

  public int size() { return v.size(); }  

}