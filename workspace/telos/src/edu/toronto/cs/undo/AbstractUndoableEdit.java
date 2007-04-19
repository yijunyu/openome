/*
 * @(#)AbstractUndoableEdit.java	1.21 00/02/02
 *
 * Copyright 1997-2000 Sun Microsystems, Inc. All Rights Reserved.
 *
 * This software is the proprietary information of Sun Microsystems, Inc.
 * Use is subject to license terms.
 *
 */

package edu.toronto.cs.undo;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * An abstract implementation of UndoableEdit, implementing simple
 * responses to all boolean methods in that interface.
 *
 * @version 1.21 02/02/00
 * @author Ray Ryan
 */
public class AbstractUndoableEdit implements UndoableEdit, Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
     * String returned by getUndoPresentationName()
     */
    protected static final String UndoName = "Undo";	// PENDING(rjrjr): these need

    /**
     * String returned by getRedoPresentationName()
     */
    protected static final String RedoName = "Redo";	// to be localizable

    /**
     * Defaults to true. Becomes false if this edit is undone, true
     * again if it is redone.
     */
    boolean hasBeenDone;

    /**
     * True if this edit has not received die().
     */
    boolean alive;

    protected String className="Abstract";

    public AbstractUndoableEdit() {
	super();

	hasBeenDone = true;
	alive = true;
    }

    public AbstractUndoableEdit(ObjectInputStream in) {
        super();
        try {
	hasBeenDone = true;
	alive = true;
        readObject(in);
        } catch (Exception exp) {
          exp.printStackTrace();
        }
    }

    /**
     * Sets alive to false. Note that this is a one way operation:
     * dead edits cannot be resurrected.  Sending undo() or redo() to
     * a dead edit results in an exception being thrown.
     *
     * Typically an edit is killed when it is consolidated by another
     * edit's addEdit() or replaceEdit() method, or when it is
     * dequeued from an UndoManager
     */
    public void die() {
	alive = false;
    }

    /**
     * Throws CannotUndoException if canUndo() returns false. Sets
     * hasBeenDone to false. Subclasses should override to undo the
     * operation represented by this edit. Override should begin with
     * a call to super.
     *
     * @see	#canUndo
     */
    public void undo() throws CannotUndoException {
	if (!canUndo()) {
	    throw new CannotUndoException();
	}
	hasBeenDone = false;
    }

    /**
     * Returns true if this edit is alive and hasBeenDone is true.
     *
     * @see     #die
     * @see	#undo
     * @see	#redo
     */
    public boolean canUndo() {
	return alive && hasBeenDone;
    }

    /**
     * Throws CannotRedoException if canRedo() returns false. Sets
     * hasBeenDone to true. Subclasses should override to redo the
     * operation represented by this edit. Override should begin with
     * a call to super.
     *
     * @see	#canRedo
     */
    public void redo() throws CannotRedoException {
	if (!canRedo()) {
	    throw new CannotRedoException();
	}
	hasBeenDone = true;
    }

    /**
     * Returns true if this edit is alive and hasBeenDone is false.
     *
     * @see     #die
     * @see	#undo
     * @see	#redo
     */
    public boolean canRedo() {
	return alive && !hasBeenDone;
    }

    /**
     * This default implementation returns false.
     *
     * @see UndoableEdit#addEdit
     */
    public boolean addEdit(UndoableEdit anEdit) {
	return false;
    }

    /**
     * This default implementation returns false.
     *
     * @see UndoableEdit#replaceEdit
     */
    public boolean replaceEdit(UndoableEdit anEdit) {
	return false;
    }

    /**
     * This default implementation returns true.
     *
     * @see UndoableEdit#isSignificant
     */
    public boolean isSignificant() {
	return true;
    }

    /**
     * This default implementation returns "". Used by
     * getUndoPresentationName() and getRedoPresentationName() to
     * construct the strings they return. Subclasses shoul override to
     * return an appropriate description of the operation this edit
     * represents.
     *
     * @see	#getUndoPresentationName
     * @see	#getRedoPresentationName
     */
    public String getPresentationName() {
	return "";
    }

    /**
     * If getPresentationName() returns "", returns
     * AbstractUndoableEdit.UndoName. Otherwise returns
     * AbstractUndoableEdit.UndoName followed by a space and
     * getPresentationName()
     *
     * @see #getPresentationName
     */
    public String getUndoPresentationName() {
	String name = getPresentationName();
	if (name != "") {
	    name = UndoName + " " + name;
	} else {
	    name = UndoName;
	}

	return name;
    }

    /**
     * If getPresentationName() returns "", returns
     * AbstractUndoableEdit.RedoName. Otherwise returns
     * AbstractUndoableEdit.RedoName followed by a space and
     * getPresentationName()
     *
     * @see #getPresentationName
     */
    public String getRedoPresentationName() {
	String name = getPresentationName();
	if (name != "") {
	    name = RedoName + " " + name;
	} else {
	    name = RedoName;
	}

	return name;
    }

    /**
     * Returns a string that displays and identifies this
     * object's properties.
     *
     * @return a String representation of this object
     */
    public String toString()
    {
	return super.toString()
	    + " hasBeenDone: " + hasBeenDone
	    + " alive: " + alive;
    }

    protected void writeObject(ObjectOutputStream out) throws IOException {
      out.writeObject(className);
    }

    public void readObject(ObjectInputStream in) throws IOException,
		ClassNotFoundException {
    }

}

