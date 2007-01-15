
package jtelos.util;

import java.util.Enumeration;
import java.util.Vector;

public class SortIntVector {

  private Vector v = new Vector();
  private Vector keys = new Vector();


  public void addElement(int key,Object obj) {
	int index = findPoint(key);
	keys.insertElementAt(new Integer(key),index);
	v.insertElementAt(obj,index);
  }  

  public boolean contains(Object obj) { return v.contains(obj); }  

  public Object elementAt(int i) {
	if (v.size() > i) return v.elementAt(i);
	return null;
  }  

  public Enumeration elements() { return v.elements(); }  

  public Object[] elementsAsArray() { 
	Object[] result = new Object[v.size()];
	for(int i=0;i<v.size();i++) {
	  result[i] = v.elementAt(i);
	} return result;
  }  

  private int findPoint(int target) {
	boolean d = false; p(d,"SortIntVector.findPoint("+target+")");
	int start = 0;
	int end = v.size();
	int middle;
	while(end > start) {
	  middle = (end + start) / 2;
	  p(d,"   keys.elementAt("+middle+"): " + v.elementAt(middle));
	  if (((Integer)keys.elementAt(middle)).intValue() < target) {
	start = middle+1;
	  } else end = middle;
	} return end;
  }  

  public Object get(int key) {
	boolean d = false; p(d,"SortIntVector.get("+key+")");
	int findPoint = findPoint(key);
	p(d,"   findPoint: "+findPoint);
	p(d,"   v.size(): "+v.size());
	if (v.size() > findPoint) {
	  Object obj = v.elementAt(findPoint);
	  if (((Integer)keys.elementAt(findPoint)).intValue() == key) return obj;
	} return null;
  }  

  private static void p(boolean debug, String message) {
	if (debug) System.err.println(message);
  }  

  public int size() { return v.size(); }  

}