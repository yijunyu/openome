/* ViewManager
 * 
 * Created August 1998 by Joseph Makuch
 *
 * copyright.
 */

package edu.toronto.cs.ome.view;

import java.util.Collection;
import java.util.Iterator;
import java.util.Vector;

import util.D;

/**
 * ViewManager creates, deletes, and manages access to the extent views.
 */

public class ViewManager {

	/**
	 * 
	 * @uml.property name="model"
	 * @uml.associationEnd multiplicity="(0 1)"
	 */
	edu.toronto.cs.ome.model.OMEModel model;

	Collection views;
	int high_id = 0;
	int graphic = 0;
	int tree = 0;
	int textual = 0;
	Vector viewtypes = new Vector();

	public ViewManager(edu.toronto.cs.ome.model.OMEModel model, int n) {
		//D.o("Creating ViewManager of " + n + " views." );
		this.model = model;
		views = new Vector();

		if (n == -1) {
			views.add(new GraphicView(model));
			graphic++;
			viewtypes.add(0, "0");
		}

		for (int i = 0; i <= n; i++) {
			// we create a GraphicView, just cuz.
			views.add(new GraphicView(model));
			graphic++;
			viewtypes.add(i, "0");
			//D.o("View " + i + " is added.");
		}

		setViewID();

		//D.o("ViewManager created.");
	}

	/** Creates a view of the current model. */
	public int createView(int viewtype) {

		switch (viewtype) {
			case 0 : {
				D.o("Graphic View will be created.");
				views.add(new GraphicView(model));
				high_id++;
				graphic++;
				viewtypes.add(high_id, "0");
				if (graphic > 1) {
				}

			}
				break;
			case 1 : {
				//		views.add(new TreeView(model));
				D.o("Tree View will be created.");
				tree++;
				high_id++;
				viewtypes.add(high_id, "1");
			}
				break;
			case 2 : {
				//		views.add(new TextView(model));
				D.o("Textual Description will be created.");
				textual++;
				high_id++;
				viewtypes.add(high_id, "2");
			}
		}

		setViewID();

		return high_id;
	}

	public int getExistingViewtype() {
		return textual * 100 + tree * 10 + graphic * 1;
	}

	public void setViewID() {

		//Following is used to set view ID
		Iterator i = views.iterator();
		int id = 0;
		while (i.hasNext()) {
			View v = (View) i.next();
			v.setID(id);
			//D.o("Current Id is " + v.getID() + "---------------");
			id++;
		}
		//Above is used to set View ID

	}

	/**
	 * Destroys a view. The last graphview of a model cannot be destroyed. This
	 * method has not yet been implemented.
	 */
	public void deleteView(View v) {

	}

	/**
	 * Returns a list of extant views.
	 * 
	 * @uml.property name="views"
	 */
	public Iterator getViews() {
		return views.iterator();
	}

	/**
	 * Returns a list of the serialized views. This has not yet been
	 * implemented.
	 */
	public Iterator serializedViews() {
		return null;
	}

	/**
	 * Returns a list of the active(open, onscreen) views. This has not yet been
	 * implemented.
	 */
	public Iterator activeViews() {
		return null;
	}

	/**
	 * Returns the view with the requested index and if no such view exists
	 * returns null. Usually used to get the first graphview at zero.
	 */
	public View getViewByIndex(int index) {
		//	D.o("Come to getViewByIndex" + index);
		Iterator i = views.iterator();
		while (i.hasNext()) {
			View v = (View) i.next();
			if (v.getID() == index) {
				//		D.o("Current Id is " + v.getID() + "--------------- ");
				return v;
			}
		}
		return null;
	}
};

