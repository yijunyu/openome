package edu.toronto.cs.ome.plugins;

import java.awt.Image;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

import javax.swing.ImageIcon;

import edu.toronto.cs.ome.controller.AbstractPluginMethod;
import edu.toronto.cs.ome.controller.Choice;
import edu.toronto.cs.ome.controller.CreateElementMethod;
import edu.toronto.cs.ome.controller.CreateLinkMethod;
import edu.toronto.cs.ome.controller.MenuMethod;
import edu.toronto.cs.ome.controller.OMEPlugin;
import edu.toronto.cs.ome.controller.ObjectMethod;
import edu.toronto.cs.ome.controller.PluginMethod;
import edu.toronto.cs.ome.controller.PluginParameter;
import edu.toronto.cs.ome.controller.PopupMenuSeparatorMethod;
import edu.toronto.cs.ome.controller.RadioButtonChooser;
import edu.toronto.cs.ome.model.ModelAttribute;
import edu.toronto.cs.ome.model.ModelObject;
import edu.toronto.cs.ome.model.OMEModel;
import edu.toronto.cs.ome.view.View;
import edu.toronto.cs.ome.view.ViewContext;
import edu.toronto.cs.ome.view.ViewElement;
import edu.toronto.cs.ome.view.ViewLink;
import edu.toronto.cs.ome.view.ViewObject;
import edu.toronto.cs.util.D;

// old comment

/**
 * The NFR plugin.  The plugin will eventually perform some analyses, but at *  the moment allows for hiding all objects below a certain node in the goal *  tree.
 */

public class NFRPlugin implements OMEPlugin {
	// We use these to determine what types of elements and links to provide
	// creation methods for. It would be nice to be able to simply ask the
	// framework for all elements from the framework called NFR. Maybe one
	// day this will be accomplished.
	static String[] contributionlinknames = { "Break", "Make", "Or", "And",
			"Equal", "Hurt", "Help", "Unknown", "Some +", "Some -" };

	static String[] correlationlinknames = { "Break Correlation",
			"Make Correlation", "Hurt Correlation", "Help Correlation",
			"Unknown Correlation", "Some + Correlation", "Some - Correlation" };

	static String[] weavinglinknames = { "Break Weaving", "Make Weaving",
			"Hurt Weaving", "Help Weaving", "Unknown Weaving",
			"Some + Weaving", "Some - Weaving" };

	static String[] nfrelementnames = { "NFRSoftgoal", "Operationalization",
			"Claim", "Goal", "Task", "Aspect" };

	/**
	 * 
	 * @uml.property name="model"
	 * @uml.associationEnd multiplicity="(0 1)"
	 */
	private OMEModel model;

	private boolean autopropogate = true;

	/**
	 * Creates a NFRPlugin for the specified model.
	 * 
	 * @param m
	 *            the model for which the NFRPlugin is constructed for.
	 */
	public NFRPlugin(OMEModel m) {
		model = m;
	}

	/**
	 * Returns a collection of NFR specific <code>Method</code> s that are to
	 * be placed on the OME toolbar.
	 */
	public Collection getToolbarMethods(View view) {
		Vector v = new Vector();

		MenuMethod em = new MenuMethod("Create NFR Element");
		em.setSubmenu(getElementMethods(view));
		v.add(em);

		MenuMethod mm = new MenuMethod("Create NFR Link");
		mm.addItem(new CreateLinkGroupMethod(view, "Contribution Link",
				contributionlinknames, false));
		mm.addItem(new CreateLinkGroupMethod(view, "Correlation Link",
				correlationlinknames, true));
		mm.addItem(new CreateLinkGroupMethod(view, "Weaving Link",
				weavinglinknames, true));
		v.add(mm);
		return v;
	}

	/**
	 * Returns a collection of NFR specific <code>Method</code> s that are to
	 * be placed on the OME menubar.
	 */
	public Collection getMenubarMethods(View v) {
		MenuMethod nfroptions = new MenuMethod("NFR Options");
		nfroptions.addItem(new TogglePropMethod());
		return Collections.singleton(nfroptions);
	}

	/**
	 * Returns a collection of NFR specific <code>Method</code> s that are to
	 * be placed in the OME popup-menu (when the user clicks the right mouse
	 * button).
	 */
	public Collection getPopupMethods(View v) {
		Vector ll = new Vector();

		ll.add(new PopupMenuSeparatorMethod(v));
		ll.add(new HideSubtree(v));
		ll.add(new HideAllButSubtree(v));

		ll.add(new PopupMenuSeparatorMethod(v));
		ll.add(new SetLabelSubmenu(v));
		ll.add(new TogglePriority(v));
		ll.add(new SetDeniedMethod(v));

		ll.add(new PopupMenuSeparatorMethod(v));
		MenuMethod els = new MenuMethod("Create NFR Element");
		els.setSubmenu(getElementMethods(v));
		ll.add(els);

		MenuMethod nfrlinks = new MenuMethod("Create NFR Link");
		nfrlinks.addItem(new CreateLinkGroupMethod(v, "Contribution Link",
				contributionlinknames, false));
		nfrlinks.addItem(new CreateLinkGroupMethod(v, "Correlation Link",
				correlationlinknames, true));
		nfrlinks.addItem(new CreateLinkGroupMethod(v, "Weaving Link",
				weavinglinknames, true));
		ll.add(nfrlinks);
		return ll;
	}

	/**
	 * Tests if the specified model supports the NFR framework.
	 * 
	 * @param model
	 *            the model which we check if it supports the NFR framework.
	 */
	static public boolean isCompatibleWith(OMEModel model) {
		return (model.getFramework().getType("Operationalization") != null);
	}

	/**
	 * Return a collection of element creation methods for the NFR element
	 * types.
	 */
	private Collection getElementMethods(View view) {
		Vector elementmethods = new Vector(nfrelementnames.length);
		for (int i = 0; i < nfrelementnames.length; i++) {
			Object type = model.getFramework().getType(nfrelementnames[i]);
			PluginMethod method = new CreateElementMethod(type,
					nfrelementnames[i], view);
			elementmethods.add(method);
		}
		return elementmethods;
	}

	private void setShouldAutoPropogate(boolean b) {
		autopropogate = b;
	}

	private boolean shouldAutoPropogate() {
		return autopropogate;
	}

	//////////////////////////////////////////////////////////
	//
	// Plugin Methods
	//
	//////////////////////////////////////////////////////////

	/**
	 * This method prompts the user to select the type of link to create after
	 * being prompted for the source and destination fields. The choice made
	 * available to the user is based on the strings found in an array of
	 * Strings passed in at construction time. Each string in the array should
	 * correspond to a valid link type in the framework.
	 */
	private class CreateLinkGroupMethod extends CreateLinkMethod {

		String[] typenames;

		public CreateLinkGroupMethod(View v, String groupname,
				String[] typenames, boolean dashed) {

			super(v);

			typename = groupname;
			this.typenames = typenames;

			// We need some type to use for our picture.
			Object picturetype = model.getFramework().getType(typenames[0]);

			Image im = view.getImage(picturetype);
			if (dashed) {
				image = view.getImageTable().drawDashedHLine(im);
			} else {
				image = view.getImageTable().drawHLine(im);
			}
		}

		// Everything is the same, except that invoke time we want to figure
		// out the type.
		public void invoke() {
			// Create the choices
			Vector v = new Vector(typenames.length);
			for (int i = 0; i < typenames.length; i++) {
				Choice c = new Choice();
				String name = typenames[i];
				c.setName(name);
				c.setChoiceObject(model.getFramework().getType(name));
				v.add(c);
			}
			// Show the dialogue to get the type.
			RadioButtonChooser rbc = new RadioButtonChooser(null, "Select "
					+ typename + " Type", true, v);
			if (rbc.showDialog() == RadioButtonChooser.CONTINUE) {
				// set type
				Iterator i = v.iterator();
				while (i.hasNext()) {
					Choice c = (Choice) i.next();
					if (c.chosen()) {
						type = c.choiceObject();
					}
				}
				// and go
				if (type != null) {
					super.invoke();
				}
			} else {
				// Users wants to bail out.
				// Do nothing.
			}
			resetMethod();
		}

		/**
		 * Set the type back to null, and do the rest of the method clean-up, as
		 * required by our super-class.
		 */
		protected void resetMethod() {
			type = null;
			super.resetMethod();
		}

	}

	/** Toggles the Auto-propogation property. */
	private class TogglePropMethod extends AbstractPluginMethod {

		private Image isonimage;

		public TogglePropMethod() {
			// Get our little checkmark image
			ImageIcon ii = new ImageIcon(this.getClass().getResource(
					"/resources/Check.gif"));
			isonimage = ii.getImage();
		}

		public int getMnemonic() {
			return 'A';
		}

		/*
		 * Don't need toUpdate this method since because we wish the default
		 * character to be underlined.
		 */
		public int getDisplayedMnemonicIndex() {
			return -1;
		}

		public String getName() {
			return "Auto-Propogation";
		}

		public Image getImage() {
			if (shouldAutoPropogate()) {
				return isonimage;
			} else {
				return null;
			}
		}

		public void invoke() {
			// toggle the Autopropogate
			setShouldAutoPropogate(!shouldAutoPropogate());
		}
	}

/**
 * Toggles the priority label of the softgoal.
 */

	private class TogglePriority extends AbstractPluginMethod {

		/**
		 * 
		 * @uml.property name="vo"
		 * @uml.associationEnd multiplicity="(0 1)"
		 */
		private ViewObject vo = null;

		public TogglePriority(View view) {
		}

		public String getName() {
			return "Toggle Priority";
		}

		/*
		 * public Image getImage() { if (isPriority(vo)) { return
		 * model.getFramework.; } else { return null; } }
		 */

		public boolean isEnabled(ViewContext con) {
			vo = con.associatedObject();
			if (vo != null) {
				if (vo.getModelObject().getAttribute("priority") != null) {
					return true;
				}
			}
			return false;
		}

		public void invoke() {
			if (vo != null) {
				ModelAttribute ma = vo.getModelObject()
						.getAttribute("priority");
				if (ma != null) {
					Object target = ma.getTarget();
					if (target == null) {
						Iterator i = ma.getPossibleTargets();
						// There is only one possible target.
						ma.setTarget(i.next());
					} else {
						ma.clearTarget();
					}
				}
			}
		}
	}

	/** Sets an NFR contribution link as denied */
	private class SetDeniedMethod extends ObjectMethod {
		public SetDeniedMethod(View v) {
			super(v);
			name = "Deny Contribution";
			instruction = "Select the contribution link that is being denied.";
		}

		protected boolean isSuitable(ViewObject vo) {
			// Is it a contribution link?
			if (!(vo instanceof ViewLink)) {
				return false;
			} // else
			ViewLink vl = (ViewLink) vo;
			Object type = vl.getModelObject().getType();
			//OMEFramework fw = view.getFramework();
			String typename = view.getModel().getFramework().getName(type);
			for (int i = 0; i < contributionlinknames.length; i++) {
				if (typename.equals(contributionlinknames[i])) {
					return true;
				}
			}
			return false;
		}

		protected void operate(ViewObject vo) {
			ModelAttribute ma = vo.getModelObject().getAttribute("label");
			Iterator i = ma.getPossibleTargets();
			// There is only one possible target.
			ma.setTarget(i.next());
		}
	}

/**
 * Displays a submenu of the possible labels for the softgoal.
 */

	private class SetLabelSubmenu extends AbstractPluginMethod {

		public SetLabelSubmenu(View view) {
			this.view = view;
		}

		public String getName() {
			return "Set Label";
		}

		public boolean isEnabled(ViewContext con) {
			ViewObject vo = con.associatedObject();
			if (vo != null) {
				if (vo instanceof ViewElement) {

					if (vo.getModelObject().getAttribute("label") != null) {
						return true;
					}
				}
			}
			return false;
		}

		public Collection getSubmenu(ViewContext ovc) {
			ViewObject vo = ovc.associatedObject();
			if (vo != null) {
				ModelObject mo = vo.getModelObject();

				Vector list = new Vector();
				ModelAttribute att = mo.getAttribute("label");
				//D.o("label attribute is " + att);
				if (att != null) {
					Iterator i = att.getPossibleTargets();
					while (i.hasNext()) {
						list.add(new SetLabel(view, vo, att, i.next()));
					}
				}
				return list;

			}
			return null;
		}
	}

/**
 * Sets the Label of the Softgoal. We will generalize this as soon as we * have another example of the need. Perhaps I* dependencies will need * attributes.
 */

	private class SetLabel extends AbstractPluginMethod {

		/**
		 * 
		 * @uml.property name="vo"
		 * @uml.associationEnd multiplicity="(0 1)"
		 */
		private ViewObject vo;

		/**
		 * 
		 * @uml.property name="att"
		 * @uml.associationEnd multiplicity="(0 1)"
		 */
		private ModelAttribute att;

		private Object target;

		public SetLabel(View view, ViewObject vo, ModelAttribute att,
				Object target) {
			this.view = view;
			this.vo = vo;
			this.att = att;
			this.target = target;
		}

		public void invoke() {
			// set the label.
			att.setTarget(target);

			// and initiate the analysis if autopropogate is switched on.
			if (shouldAutoPropogate()) {
				NFRPropogator p = new NFRPropogator(vo.getModelObject(), view);
				p.evaluate();
			}
		}

		public String getName() {
			return model.getFramework().getName(target);
		}

		public Image getImage() {
			return model.getFramework().getImage(target);
		}
	}

/**
 * This method gets a ViewOjbect and hides all ViewObjects below it in the * tree (and itself). It assumed that all links go from lower object to * higher objects. Currently we only perform this method on objects * sepecified by the associatedObject() method of the ViewContext present at * initiation time.
 */

	private class HideSubtree extends AbstractPluginMethod {
		/**
		 * 
		 * @uml.property name="vo"
		 * @uml.associationEnd multiplicity="(0 1)"
		 */
		private ViewObject vo = null;

		/**
		 * 
		 * @uml.property name="nextp"
		 * @uml.associationEnd multiplicity="(0 1)"
		 */
		private PluginParameter nextp;

		public HideSubtree(View v) {
			nextp = contextParameter();
		}

		public String getName() {
			return "Hide subtree";
		}

		public PluginParameter nextParameter() {
			return nextp;
		}

		public void passParameter(Collection c) {
			Iterator i = c.iterator();
			ViewContext con = (ViewContext) i.next();
			vo = con.associatedObject();
			nextp = null;
		}

		public void invoke() {
			if (!vo.isHidden()) {
				hideSubtree(vo);
			}
		}

		public boolean isEnabled(ViewContext con) {
			return con.associatedObject() != null;
		}

		public void cancelled() {
			resetMethod();
		}

		/*
		 * This is where the work gets done. Recursively walks subtree hiding
		 * all objects it finds. If it finds an object already hidden, it stops
		 * the recursion (this is to safeguard against cycles, but may cause
		 * some unexpected behaviour).
		 */
		private void hideSubtree(ViewObject vo) {
			vo.setHidden(true);
			//D.o("Hiding subtree rooted at: "+ vo.getName() + vo.isHidden());
			Iterator i = getIncomingLinks(vo);
			while (i.hasNext()) {
				// Recursively hide this link and its source.
				ViewLink vl = (ViewLink) i.next();
				ViewObject source = (ViewObject) vl.getFrom();
				if (!vl.isHidden()) {
					hideSubtree(vl);
				}
				if (!source.isHidden()) {
					hideSubtree(source);
				}
				//vl.setHidden(true);
				//source.setHidden(true);
			}
		}

		/**
		 * Returns an iterator of all links whose destination is the given
		 * ViewObject.
		 */
		private Iterator getIncomingLinks(ViewObject vo) {
			Vector ll = new Vector();

			Iterator i = vo.getLinks().iterator();
			while (i.hasNext()) {
				ViewLink vl = (ViewLink) i.next();
				if ((ViewObject) vl.getTo() == vo) {
					ll.add(vl);
				}
			}
			return ll.iterator();
		}

		private void resetMethod() {
			vo = null;
			nextp = contextParameter();
		}

		private PluginParameter contextParameter() {
			return new PluginParameter(PluginParameter.CARDINALITY_ONE, "",
					PluginParameter.OMEContextType);
		}

	}

/**
 * This method does the opposite of hiding the subtree. It hides everything * BUT the subtree.
 */

	private class HideAllButSubtree extends AbstractPluginMethod {

		/**
		 * 
		 * @uml.property name="vo"
		 * @uml.associationEnd multiplicity="(0 1)"
		 */
		private ViewObject vo = null;

		/**
		 * 
		 * @uml.property name="nextp"
		 * @uml.associationEnd multiplicity="(0 1)"
		 */
		private PluginParameter nextp;

		public HideAllButSubtree(View v) {
			view = v;
			nextp = contextParameter();
		}

		public String getName() {
			return "Only show subtree";
		}

		public PluginParameter nextParameter() {
			return nextp;
		}

		public void passParameter(Collection c) {
			Iterator i = c.iterator();
			ViewContext con = (ViewContext) i.next();
			vo = con.associatedObject();
			nextp = null;
		}

		public void invoke() {
			// First we hide everything, and then unhide the subtree.
			Iterator i;
			i = view.getAllElements().iterator();
			while (i.hasNext()) {
				((ViewObject) i.next()).setHidden(true);
			}
			i = view.getAllLinks().iterator();
			while (i.hasNext()) {
				((ViewObject) i.next()).setHidden(true);
			}
			unhideSubtree(vo);
		}

		public boolean isEnabled(ViewContext con) {
			return con.associatedObject() != null;
		}

		public void cancelled() {
			resetMethod();
		}

		/*
		 * This is where the work gets done. Recursively walks subtree hiding
		 * all objects it finds. If it finds an object already hidden, it stops
		 * the recursion (this is to safeguard against cycles, but may cause
		 * some unexpected behaviour).
		 */
		private void unhideSubtree(ViewObject vo) {
			D.o("Only showing subtree rooted at: " + vo.getName());
			if (vo.isHidden()) {
				Iterator i = getIncomingLinks(vo);
				while (i.hasNext()) {
					// Recursively hide this link and its source.
					ViewLink vl = (ViewLink) i.next();
					ViewObject source = (ViewObject) vl.getFrom();
					unhideSubtree(vl);
					unhideSubtree(source);
					//vl.setHidden(true);
					//source.setHidden(true);
				}
				vo.setHidden(false);
			}
		}

		/**
		 * Returns an iterator of all links whose destination is the given
		 * ViewObject.
		 */
		private Iterator getIncomingLinks(ViewObject vo) {
			Vector ll = new Vector();

			Iterator i = vo.getLinks().iterator();
			while (i.hasNext()) {
				ViewLink vl = (ViewLink) i.next();
				if ((ViewObject) vl.getTo() == vo) {
					ll.add(vl);
				}
			}
			return ll.iterator();
		}

		private void resetMethod() {
			vo = null;
			nextp = contextParameter();
		}

		private PluginParameter contextParameter() {
			return new PluginParameter(PluginParameter.CARDINALITY_ONE, "",
					PluginParameter.OMEContextType);
		}

	}
	public void setView(View view) {
		model = view.getModel();
	}
}