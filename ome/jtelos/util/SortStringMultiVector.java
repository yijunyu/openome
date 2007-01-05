
package jtelos.util;

import java.util.*;

public class SortStringMultiVector {

  private SortStringVector v = new SortStringVector();


  public SortStringMultiVector() {}  

  public void addElement(String key,Object obj) {
	addElements(key,new Object[]{obj});
  }  

  public void addElements(String key, Object[] addObjs) {
	Object[] oldObjs = get(key);
	if(oldObjs.length == 0)
	  // No match!
	  v.addElement(key,addObjs);
	else {
	  int index = v.indexOf(oldObjs);
	  Object[] newObjs = new Object[oldObjs.length+addObjs.length];
	  System.arraycopy(oldObjs,0,newObjs,0,oldObjs.length);
	  System.arraycopy(addObjs,0,newObjs,oldObjs.length,addObjs.length);
	  v.setElementAt(newObjs,index);
	}
  }  

  /** Expensive. For equality comparision, it uses each object's oid. **/
  public boolean contains(Object obj) { 
	for(int i=0;i<v.size();i++) {
	  Object[] objs = (Object[]) elementAt(i);
	  for (int j=0;j<objs.length;j++) 
	if(objs[j] == obj) return true;
	} return false;
  }  

  public Object[] elementAt(int i) {
	if (v.size() > i) return (Object[]) v.elementAt(i);
	return null;
  }  

  /** Expensive. **/
  public Enumeration elements() { 
	Vector v2 = new Vector();
	for(Enumeration en = v.elements();en.hasMoreElements();) {
	  Object[] objs = (Object[]) en.nextElement();
	  for(int i=0;i<objs.length;i++)
	v2.addElement(objs[i]);
	} return v2.elements(); 
  }  

  /** Expensive. **/
  public Object[] elementsAsArray() { 
	Vector v2 = new Vector();
	for(Enumeration en = v.elements();en.hasMoreElements();) {
	  Object[] objs = (Object[]) en.nextElement();
	  for(int i=0;i<objs.length;i++)
	v2.addElement(objs[i]);
	} Object[] result = new Object[v2.size()];
	for (int i=0;i<result.length;i++) 
	  result[i] = elementAt(i);
	return result;
  }  

  /**
   * Returns an empty array when there is no match!
   **/
  public Object[] get(String key) { 
	Object[] result;
	result = (Object[]) v.get(key); 
	if (result == null) return new Object[]{};
	return result;
  }  

  static void p(String s) { System.err.println(s); }  

  /** Returns the number of array objects. **/
  public int size() { return v.size(); }  

}