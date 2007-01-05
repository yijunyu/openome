package edu.toronto.cs.undo;

//import isv.view.CanvasIter3D;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class UndoableEditStack implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 * @uml.property name="set"
	 * @uml.associationEnd multiplicity="(0 -1)"
	 */
	private UndoableEdit set[];

	private int _top;
	private int size;
	public UndoableEditStack() {
		_top = 0;
	} 	
	public UndoableEdit pop(){
		if (_top<=0) return null;
		return set[--_top];
	}
	public UndoableEdit top() {
		if (_top<=0) return null;
		return set[_top-1];
	}
	public void push(UndoableEdit n) {
		if (_top >= size)
			if (set == null) {
			size = 100;
			set = new UndoableEdit[size];
		} else {
			size *= 2;
			UndoableEdit nv[] = new UndoableEdit[size];
			System.arraycopy(set, 0, nv, 0, set.length);
			set = nv;
		}
		set[_top++] = n;
	}
	public boolean isEmpty() {
		return _top<=0;
	}
	/**
	 * writeObj
	 */
	 void writeObject(ObjectOutputStream out) throws IOException {
	 	try {
		out.writeObject(new Integer(_top));
		//System.out.println("undo history write:"+(_top));
		for (int i=0; i< _top; i++)
			try {
			   ((AbstractUndoableEdit) set[i]).writeObject(out);
			} catch (Exception e) {
				System.out.println(""+i);
				e.printStackTrace();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	 }
     /**
      * read UndoableEdit object
      */
     public UndoableEdit readUndo(java.io.ObjectInputStream in)
     throws IOException, ClassNotFoundException{
       String className = (String) in.readObject();
       UndoableEdit edit = null;
       try {
	       Class c = Class.forName("edu.toronto.cs.undo."+className+"Undo.class");
	       edit = (UndoableEdit) c.newInstance();
	       edit.readObject(in);
       } catch (Exception e) {
       	edit = new AbstractUndoableEdit(in);       	
       }
       return edit;
     }
	/**
	 * readObj
	 */
	 void readObject(java.io.ObjectInputStream in)
		throws IOException, ClassNotFoundException {
                try {
                Object obj = in.readObject();
                if (obj==null) return;
		_top = ((Integer)obj).intValue();
                size = _top+10;
		set = new UndoableEdit[size];
		for (int i=0; i< _top; i++)
                   try {
                    set[i] = readUndo(in);
                   } catch (Exception ex) {
                    System.out.println(i);
                    ex.printStackTrace();
                   }
                } catch (Exception ex) {
                  ex.printStackTrace();
                }
	 }
}
