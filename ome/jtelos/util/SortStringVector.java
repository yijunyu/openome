
package jtelos.util;

import java.util.Enumeration;
import java.util.Vector;

public class SortStringVector {

  private Vector v = new Vector();
  private Vector keys = new Vector();


  public void addElement(String key,Object obj) {
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

  public Object[] elementsAsArray() { 
	Object[] result = new Object[size()];
	v.copyInto(result);
	return result;
  }  

  private int findPoint(String target) {
	boolean d = false; p(d,"SortStringVector.findPoint("+target+")");
	int start = 0;
	int end = v.size();
	int middle;
	while(end > start) {
	  middle = (end + start) / 2;
	  p(d,"   keys.elementAt("+middle+"): " + v.elementAt(middle));
	  if (((String)keys.elementAt(middle)).compareTo(target) < 0) {
	start = middle+1;
	  } else end = middle;
	} return end;
  }  

  public Object get(String key) {
	boolean d = false; p(d,"SortStringVector.get("+key+")");
	int findPoint = findPoint(key);
	p(d,"   findPoint: "+findPoint);
	p(d,"   v.size(): "+v.size());
	if (v.size() > findPoint) {
	  Object obj = v.elementAt(findPoint);
	  if (((String)keys.elementAt(findPoint)).equals(key)) return obj;
	} return null;
  }  

  public int indexOf(Object obj) { return v.indexOf(obj); }  

  private static void p(boolean d, String message) { 
	if (d) System.err.println(message);
  }  

  /** Does not change the key at the insertion index. **/
  public void setElementAt(Object obj, int i) { v.setElementAt(obj,i); }  

  public int size() { return v.size(); }  

}