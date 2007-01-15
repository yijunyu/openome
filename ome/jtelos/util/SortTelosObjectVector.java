
package jtelos.util;

import java.util.*;
import jtelos.TelosObject;

public class SortTelosObjectVector {

  private Vector v = new Vector();


  public void addElement(Object obj) { addElement((TelosObject)obj); }  

  public void addElement(TelosObject obj) {
	v.insertElementAt(obj,findPoint(obj.telosName()));
  }  

  public void addEnum(Enumeration enum1) {
	for(Enumeration e = enum1;e.hasMoreElements();) 
	  addElement((TelosObject) e.nextElement());
  }  

  public boolean contains(TelosObject obj) { return v.contains(obj); }  

  public TelosObject elementAt(int i) {
	if (v.size() > i)
	  return (TelosObject) v.elementAt(i);
	return null;
  }  

  public Enumeration elements() { return v.elements(); }  

  /** A method for people lazy about casting (like me). */
  public static boolean enumEquals(Object e1, Object e2) {
	return enumEquals((Enumeration) e1, (Enumeration) e2); 
	// You'll get an exception if you're not careful.
  }  

  public boolean enumEquals(Enumeration e) { return enumEquals(e,elements()); }  

  public static boolean enumEquals(Enumeration e1, Enumeration e2) {
	for (Enumeration counter = e1;counter.hasMoreElements();) {
	  if (!e2.hasMoreElements() ||          // It has less than e1
	  !e1.nextElement().equals(e2.nextElement())) 
	return false;
	}
	if (e2.hasMoreElements()) return false; // It had more than e1
	return true;
  }  

  private int findPoint(String objName) {
	boolean d = false; p(d,"SortTelosObjectVector.findPoint("+objName+")");
	int start = 0;
	int end = v.size();
	int middle;
	while(end > start) {
	  middle = (end + start) / 2;
	  p(d,"   v.elementAt("+middle+"): " + ((TelosObject)v.elementAt(middle)).telosName());
	  if (((TelosObject)v.elementAt(middle)).telosName().compareTo(objName) < 0) {
	start = middle+1;
	  } else end = middle;
	} return end;
  }  

  public TelosObject get(String name) {
	boolean d = false; p(d,"SortTelosObjectVector.get("+name+")");
	int findPoint = findPoint(name);
	p(d,"   findPoint: "+findPoint);
	p(d,"   v.size(): "+v.size());
	if (v.size() > findPoint) {
	  TelosObject p = (TelosObject) v.elementAt(findPoint);
	  if (p.telosName().equals(name)) return p;
	} return null;
  }  

  public int getIndex(TelosObject obj) {
	int findPoint = findPoint(obj.telosName());
	if (v.size() > findPoint) {
	  TelosObject p = (TelosObject) v.elementAt(findPoint);
	  if (p.telosName().equals(obj.telosName())) return findPoint;
	} return -1;
  }  

  private static void p(boolean debug, String message) {
	if (debug) System.err.println(message);
  }  

  public int size() { return v.size(); }  

}