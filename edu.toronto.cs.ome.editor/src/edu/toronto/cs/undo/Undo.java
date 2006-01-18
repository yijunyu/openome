/*
 * Created on Sep 26, 2004
 *
 */
package edu.toronto.cs.undo;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;

/**
 * @author Yijun Yu
 */

public class Undo {

	/**
	 * 
	 * @uml.property name="undoable"
	 * @uml.associationEnd multiplicity="(0 1)"
	 */
	public Undoable undoable = new Undoable();

	/**
	 * 
	 * @uml.property name="undoAction"
	 * @uml.associationEnd multiplicity="(0 1)"
	 */
	public UndoAction undoAction = new UndoAction();

	/**
	 * 
	 * @uml.property name="redoAction"
	 * @uml.associationEnd multiplicity="(0 1)"
	 */
	public RedoAction redoAction = new RedoAction();

 	
	public void update_undo_info() {
		if (undoAction!=null) undoAction.update();
		if (redoAction!=null) redoAction.update();
	}

	/**
	 * add UndoableEdit to the undoStack
	 */
	public void addEdit(UndoableEdit edit) {
		undoable.addEdit(edit);
		update_undo_info();
	}
	
    class UndoAction extends AbstractAction {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		boolean canUndo = false;
		public UndoAction() {
			super("Undo");
			setEnabled(true);
		}
		protected void update() {
			if (undoable!=null && undoable.undoStack!=null) {
				UndoableEdit undo = undoable.undoStack.top();
				if(undo!=null && undo.canUndo()) {
					setEnabled(true);
					putValue(Action.NAME, undo.getUndoPresentationName());
				}
			} else {
				setEnabled(false);
				putValue(Action.NAME, "Undo");
			}
		}
		/* (non-Javadoc)
		 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
		 */
		public void actionPerformed(ActionEvent e) {
			undo();
		}
		/**
		 * 
		 */
		public void undo() {
			try {
				canUndo = undoable.UndoEdit();
			} catch (CannotUndoException ex) {
				System.out.println("Unable to undo: " + ex);
				ex.printStackTrace();
			}
			update_undo_info();			
		}
    } // UndoAction
    class RedoAction extends AbstractAction {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		boolean canRedo = false;
		public RedoAction() {
			super("Redo");
			setEnabled(true);
		}
		public void redo() {
			try {
				canRedo = undoable.RedoEdit();
			} catch (CannotRedoException ex) {
				System.out.println("Unable to redo: " + ex);
				ex.printStackTrace();
			}
			update_undo_info();			
		}
		public void actionPerformed(ActionEvent e) {
			redo();
		}
		protected void update() {
			if (undoable!=null && undoable.undoStack!=null) {
				UndoableEdit redo = undoable.redoStack.top();
				if (redo!=null && redo.canRedo()) {
					setEnabled(true);
					putValue(Action.NAME, redo.getRedoPresentationName());
				}
			} else {
				setEnabled(false);
				putValue(Action.NAME, "Redo");
			}
		}
    } // RedoAction 
	/**
	 * 
	 */
	public void redo() {
		redoAction.redo();
	}
	public void undo() {
		undoAction.undo();
	}
}
