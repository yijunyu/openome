/*
 * Created on Sep 26, 2004
 */
package edu.toronto.cs.ome.controller;

import java.awt.Image;
import java.util.Collection;

import javax.swing.ImageIcon;

import edu.toronto.cs.ome.view.View;
import edu.toronto.cs.ome.view.ViewContext;
import edu.toronto.cs.undo.Undo;

/**
 * @author Yijun Yu
 */

public class UndoMethod implements PluginMethod {

	/**
	 * 
	 * @uml.property name="undo"
	 * @uml.associationEnd multiplicity="(0 1)"
	 */
	Undo undo;

	/**
	 * @param v
	 */
	public UndoMethod(View v) {
		undo = v.getUndo();
	}

	/* (non-Javadoc)
	 * @see edu.toronto.cs.ome.OME.PluginMethod#invoke()
	 */
	public void invoke() {
		undo.undo();
	}

	/* (non-Javadoc)
	 * @see edu.toronto.cs.ome.OME.PluginMethod#getMnemonic()
	 */
	public int getMnemonic() {
		return 'U';
	}

	/* (non-Javadoc)
	 * @see edu.toronto.cs.ome.OME.PluginMethod#getDisplayedMnemonicIndex()
	 */
	public int getDisplayedMnemonicIndex() {
		return -1;
	}

	/* (non-Javadoc)
	 * @see edu.toronto.cs.ome.OME.PluginMethod#getAcceleratorStr()
	 */
	public String getAcceleratorStr() {
		return "ctrl+Z";
	}

	/* (non-Javadoc)
	 * @see edu.toronto.cs.ome.OME.PluginMethod#getName()
	 */
	public String getName() {
		return "Undo";
	}

	/* (non-Javadoc)
	 * @see edu.toronto.cs.ome.OME.PluginMethod#getImage()
	 */
	public Image getImage() {
		ImageIcon ic = new ImageIcon(this.getClass().getResource(
		"/resources/undo.gif"));
		return ic.getImage();
	}

	/* (non-Javadoc)
	 * @see edu.toronto.cs.ome.OME.PluginMethod#getSubmenu(edu.toronto.cs.ome.OME.ViewContext)
	 */
	public Collection getSubmenu(ViewContext ovc) {
		return null;
	}

	/* (non-Javadoc)
	 * @see edu.toronto.cs.ome.OME.PluginMethod#getSubmenu()
	 */
	public Collection getSubmenu() {
		return null;
	}

	/* (non-Javadoc)
	 * @see edu.toronto.cs.ome.OME.PluginMethod#nextParameter()
	 */
	public PluginParameter nextParameter() {
		return null;
	}

	/* (non-Javadoc)
	 * @see edu.toronto.cs.ome.OME.PluginMethod#passParameter(java.util.Collection)
	 */
	public void passParameter(Collection parameter) {
	}

	/* (non-Javadoc)
	 * @see edu.toronto.cs.ome.OME.PluginMethod#cancelled()
	 */
	public void cancelled() {
	}

	/* (non-Javadoc)
	 * @see edu.toronto.cs.ome.OME.PluginMethod#isEnabled(edu.toronto.cs.ome.OME.ViewContext)
	 */
	public boolean isEnabled(ViewContext con) {
		return true;
	}

}
