
package jtelos.util;

import java.util.Enumeration;
import java.util.Vector;

public class ArrayVector {

  private Vector v = new Vector();


  public void addElement(Object obj) { v.addElement(obj); }  

  public boolean contains(Object obj) { return v.contains(obj); }  

  public Object elementAt(int i) { return v.elementAt(i); }  

  public Enumeration elements() { return v.elements(); }  

  public Object[] elementsAsArray() { 
	Object[] result = new Object[v.size()];
	for(int i=0;i<v.size();i++) {
	  result[i] = v.elementAt(i);
	} return result;
  }  

  public int size() { return v.size(); }  

}