/*
 *	File: Undoable.java
 *	Author: Yijun Yu
 *	Version: 1.0
 *	Date: Nov 21, 2000
 */
package edu.toronto.cs.undo;


import java.io.IOException;
import java.io.Serializable;

/**
 * The interface for a undoable object
 */

public class Undoable implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 * @uml.property name="undoStack"
	 * @uml.associationEnd multiplicity="(0 1)"
	 */
	public UndoableEditStack undoStack = null;

	/**
	 * 
	 * @uml.property name="redoStack"
	 * @uml.associationEnd multiplicity="(0 1)"
	 */
	public UndoableEditStack redoStack = null;

    public Undoable()
    {
          undoStack = new UndoableEditStack();
          redoStack = new UndoableEditStack();
    }

	/**
	 * return true if the Undo is performed
	 */
	public boolean UndoEdit() {
		if (undoStack==null) return false;
		if (undoStack.isEmpty()) return false;
		UndoableEdit undo = undoStack.pop();
		if (!undo.canUndo()) {
			undoStack = new UndoableEditStack();
			return false;
		}
		undo.undo();
		redoStack.push(undo);
		return true;
	}

	/**
	 * return true if the Redo is performed
	 */
	public boolean RedoEdit() {
		if (redoStack==null) return false;
		if (redoStack.isEmpty()) return false;
		UndoableEdit redo = redoStack.pop();
		if (!redo.canRedo()) {
			redoStack = new UndoableEditStack();
			return false;
		}
		redo.redo();
		undoStack.push(redo);
		return true;
	}


	/**
	 * add UndoableEdit to the undoStack
	 */
	public void addEdit(UndoableEdit edit) {
		undoStack.push(edit);
	}

	/**
	 * writeObj
	 */
	public void writeObject(java.io.ObjectOutputStream out) throws IOException {
	 	undoStack.writeObject(out);
		redoStack.writeObject(out);
	 }
	/**
	 * readObj
	 */
	public void readObject(java.io.ObjectInputStream in)
		throws IOException, ClassNotFoundException {
	 	undoStack.readObject(in);
		redoStack.readObject(in);
	 }
}
