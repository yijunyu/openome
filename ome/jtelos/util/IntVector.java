
package jtelos.util;

import java.util.Vector;

public class IntVector {

  private static boolean d = false; // debug
  private int inc;

  private Vector chunks = new Vector();

  private static class Chunk {

	private int[] array;
	private int end = 0; // element after last
	private int inc;

	public Chunk(int inc) { 
	  array = new int[inc];
	  this.inc = inc; 
	}

	public int end() { return end; } 

	public boolean isEmpty() { return (end == 0); }

	public int lastElement() {
	  if (isEmpty()) throw new ChunkIndexOutOfBoundsException("Chunk is empty");
	  return elementAt(end-1);
	}

	public int elementAt(int idx) 
	  throws ChunkIndexOutOfBoundsException {
	if (idx >= end || idx < 0) {
	  String s = "end: " + end + ", idx: " + idx;
	  throw new ChunkIndexOutOfBoundsException(s);
	} return array[idx];
	}

	public void addElement(int elem) throws ChunkFullException{
	  if (end == inc) throw new ChunkFullException(); else array[end++] = elem;}

	public void addElements(int[] elems) throws ChunkFullException{
	  if (elems.length > 8192) 
	System.out.println("elems.length: " + elems.length + " > 8192");
	  if (end + elems.length > inc) throw new ChunkFullException();
	  else { for (int i = 0; i< elems.length;i++) { array[end++] = elems[i]; } }
	}

	public void setElementAt(int elem, int idx) 
	  throws ChunkIndexOutOfBoundsException{
	//p(d,"Chunk.setElementAt("+elem+","+idx+")");
	if (idx >= end || idx < 0) {
	  String s = "end: " + end + ", idx: " + idx;
	  throw new ChunkIndexOutOfBoundsException(s);
	} else array[idx] = elem;
	}

	public void setElementsAt(int[] elems, int start) 
	  throws ChunkIndexOutOfBoundsException{
	int finish = start + elems.length;
	if (start + elems.length > end || start < 0) {
	  String s = "start: "+ start + ", Chunk's end: " + end +
	    ", start + elems.length: " + finish;
	  throw new ChunkIndexOutOfBoundsException(s);
	} else
	  for (int i = 0; i < elems.length;i++) { array[start + i] = elems[i]; }
	}
  }

  private static class ChunkFullException extends Exception {}

  private static class ChunkIndexOutOfBoundsException 
	extends IndexOutOfBoundsException {
	  public ChunkIndexOutOfBoundsException(String s) { super(s); }
  }


  /* public abstract int[] elementsAt(int start, int finish);

  public abstract void insertElementAt(int elem, int idx);

  public abstract void insertElementsAt(int[] elems, int idx); */
  
  public IntVector(int increment) { 
	inc = increment; 
	chunks.addElement(new Chunk(inc));
  }  

  public void addElement(int elem) {
	try { ((Chunk)chunks.lastElement()).addElement(elem); }
	catch (ChunkFullException e1) {
	  try {
	chunks.addElement(new Chunk(inc));
	((Chunk)chunks.lastElement()).addElement(elem);
	  } catch (ChunkFullException e2) {	e2.printStackTrace(); }
	}
  }  

  public void addElements(int[] elems) {
	for (int i=0;i<elems.length;i++) addElement(elems[i]);
  }  

  public void addElementsUniqely(int[] elems) {
	for (int i=0;i<elems.length;i++) addElementUniquely(elems[i]);
  }  

  public void addElementUniquely(int elem) {
	if(!contains(elem)) addElement(elem);
  }  

  public boolean assertNonEmpty() {
	if (chunks.isEmpty() || ((Chunk)chunks.firstElement()).isEmpty())
	  throw new IndexOutOfBoundsException("IntVector is Empty");
	return true;
  }  

  public boolean contains(int elem) {
	int[] elements = elements();
	for (int i=0;i<elements.length;) if (elements[i] == elem) return true;
	return false;
  }  

  public int elementAt(int idx) {
	assertNonEmpty();
	return ((Chunk)chunks.elementAt(idx / inc)).elementAt(idx % inc);
  }  

  public int[] elements() {
	try { assertNonEmpty(); } 
	catch (IndexOutOfBoundsException e) { 
	  //p(true,"IntVector is empty");
	  return new int[0]; 
	}
	//p(true,"IntVector is nonEmpty");
	return elementsAt(0,size()-1);
  }  

  public int[] elementsAt(int start, int finish) {
	int range = finish-start+1;
	int[] result = new int[range];
	for (int i = 0; i < range; i++) { result[i] = elementAt(start+i); }
	return result;
  }  

  public int firstElement() {
	assertNonEmpty();
	return ((Chunk)chunks.firstElement()).elementAt(0);
  }  

  public int lastElement() {
	assertNonEmpty();
	return ((Chunk)chunks.lastElement()).lastElement();
  }  

  public static void main(String[] argv) {
	IntVector v = new IntVector(16384);
	for (int i = 0 ; i < 800000; i++) {
	  v.addElement(i);
	}
	System.out.println("element at 786432: " + v.elementAt(786432));
	System.out.println("size: " + v.size());
	System.out.println("last element: " + v.lastElement());
  }  

  protected static void p(boolean debug,String s) {
	if (debug) System.out.println(s);
  }  

  public void setElementAt(int elem, int idx) {
	//p(d,"IntVector.setElementAt("+elem+","+idx+")");
	if (chunks.isEmpty())
	  throw new OutOfBoundsException("IntVector is empty");
	((Chunk)chunks.elementAt(idx / inc)).setElementAt(elem,idx % inc);
  }  

  public int size() {
	return (chunks.size()-1)*inc + ((Chunk)chunks.lastElement()).end();
  }  

}