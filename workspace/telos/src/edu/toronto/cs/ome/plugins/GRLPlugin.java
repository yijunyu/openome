package edu.toronto.cs.ome.plugins;
import java.awt.Image;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

import javax.swing.ImageIcon;

import util.D;
import edu.toronto.cs.ome.controller.AbstractPluginMethod;
import edu.toronto.cs.ome.controller.Choice;
import edu.toronto.cs.ome.controller.CreateElementMethod;
import edu.toronto.cs.ome.controller.CreateLinkMethod;
import edu.toronto.cs.ome.controller.MenuMethod;
import edu.toronto.cs.ome.controller.OMEPlugin;
import edu.toronto.cs.ome.controller.ObjectMethod;
import edu.toronto.cs.ome.controller.PluginMethod;
import edu.toronto.cs.ome.controller.PopupMenuSeparatorMethod;
import edu.toronto.cs.ome.controller.RadioButtonChooser;
import edu.toronto.cs.ome.model.ModelElement;
import edu.toronto.cs.ome.model.ModelLink;
import edu.toronto.cs.ome.model.ModelValueAttribute;
import edu.toronto.cs.ome.model.OMEModel;
import edu.toronto.cs.ome.view.View;
import edu.toronto.cs.ome.view.ViewLink;
import edu.toronto.cs.ome.view.ViewObject;

/**
 * The GRL plugin. This plugin will perform GRL analyses, and add modelling * shortcuts to the toolbar.
 */


public class GRLPlugin implements OMEPlugin {

	// the names of the I-Star links
	static String[] contributionlinknames = {"GRL Or", "GRL And"};

	static String[] linknames = {"GRL Dependency link",
			"GRL Decomposition link", "GRL Means-ends link",
			"GRL Correlation Link", "GRL Attribute link"};

	static String[] elementnames = {"GRL Actor", "GRL Resource", "GRL Task",
			"GRL Goal", "GRL Softgoal", "GRL Belief",
			"GRL Non-Intentional Element"};

	/**
	 * 
	 * @uml.property name="model"
	 * @uml.associationEnd multiplicity="(0 1)"
	 */
	OMEModel model;

	private boolean parameterize_value_attributes = false;
	private boolean parameterize_non_intentionals = false;

	public GRLPlugin(OMEModel m) {
		model = m;
	}

	/** Tests for presence of basic GRL type. */
	static public boolean isCompatibleWith(OMEModel model) {
		return (model.getFramework().getType("GRL Belief") != null);
	}

	/**
	 * Returns a collection of our <code>Method</code> s that are to be placed
	 * on the OME toolbar.
	 */
	public Collection getToolbarMethods(View view) {

		Vector v = new Vector();

		// Need to be able to create i* links and elements.
		MenuMethod em = new MenuMethod("Create GRL Element");
		em.setSubmenu(getElementMethods(view));
		v.add(em);

		MenuMethod lm = new MenuMethod("Create GRL Link");
		lm.setSubmenu(getLinkMethods(view));
		v.add(lm);

		MenuMethod mm = new MenuMethod("Create GRL Contribution Link");
		mm.addItem(new CreateLinkGroupMethod(view, "Contribution Link",
				contributionlinknames, false));
		v.add(mm);
		return v;
	}

	/**
	 * Returns a collection of our <code>Method</code> s that are to be placed
	 * on the OME menubar.
	 */
	public Collection getMenubarMethods(View v) {
		MenuMethod grloptions = new MenuMethod("GRL Options");

		grloptions.addItem(new parameterize_value_attributes(v));
		grloptions.addItem(new parameterize_non_intentionals(v));

		return Collections.singleton(grloptions);
	}

	/**
	 * Returns a collection of our <code>Method</code> s that are to be placed
	 * in the OME popup-menu (when the user clicks the right mouse button).
	 */
	public Collection getPopupMethods(View view) {
		D.o("Getting i* popup methods");
		Vector ll = new Vector();

		MenuMethod em = new MenuMethod("Create GRL Element");
		em.setSubmenu(getElementMethods(view));

		MenuMethod lm = new MenuMethod("Create GRL Link");
		lm.setSubmenu(getLinkMethods(view));

		MenuMethod nfrlinks = new MenuMethod("Create GRL Link");
		nfrlinks.addItem(new CreateLinkGroupMethod(view, "Contribution Link",
				contributionlinknames, false));
		ll.add(nfrlinks);

		ll.add(new showAttributeMethod(view));
		ll.add(new parameterizeValueMethod(view));
		ll.add(new parameterizeNonIntentionalMethod(view));

		ll.add(new PopupMenuSeparatorMethod(view));
		ll.add(em);
		ll.add(lm);
		return ll;
	}

	/**
	 * Return a collection of element creation methods for the i* element types.
	 */
	private Collection getElementMethods(View view) {
		Vector elementmethods = new Vector(elementnames.length);
		for (int i = 0; i < elementnames.length; i++) {
			Object type = model.getFramework().getType(elementnames[i]);
			PluginMethod method = new CreateElementMethod(type,
					elementnames[i], view);
			elementmethods.add(method);
		}
		return elementmethods;
	}

	/** Return a collection of link creation methods for the i* link types. */
	private Collection getLinkMethods(View view) {
		Vector linkmethods = new Vector(linknames.length);
		for (int i = 0; i < linknames.length; i++) {
			Object type = model.getFramework().getType(linknames[i]);
			PluginMethod method = new CreateLinkMethod(type, linknames[i], view);
			linkmethods.add(method);
		}
		return linkmethods;
	}

	private boolean shouldParameterize_value_attributes() {
		return parameterize_value_attributes;
	}

	private boolean shouldParameterize_non_intentionals() {
		return parameterize_non_intentionals;
	}

	/**
	 * 
	 * @uml.property name="parameterize_value_attributes"
	 */
	private void setParameterize_value_attributes(boolean b) {
		parameterize_value_attributes = b;
	}

	/**
	 * 
	 * @uml.property name="parameterize_non_intentionals"
	 */
	private void setParameterize_non_intentionals(boolean b) {
		parameterize_non_intentionals = b;
	}

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

	private class showAttributeMethod extends ObjectMethod {

		public showAttributeMethod(View v) {
			super(v);
			name = "Show Value Attribute";
			instruction = "Properties of object";
		}

		protected boolean isSuitable(ViewObject vo) {
			return true;
		}

		protected void operate(ViewObject vo) {
			Object[][] data = {{"", ""}, {"", ""}, {"", ""}, {"", ""},
					{"", ""}, {"", ""}, {"", ""}, {"", ""}, {"", ""}, {"", ""},
					{"", ""}};

			int i = 0;
			//D.o("Showing value attributes!!!!!!!!");
			Iterator mvas = vo.getModelObject().getValueAttributes();

			while (mvas.hasNext()) {
				ModelValueAttribute oa = (ModelValueAttribute) mvas.next();
				if ((oa != null)
						&& ((oa.getLabel() != null) || (oa.getValue() != null))) {
					data[i][0] = oa.getLabel();
					//D.o("label is " + data[i][0]);
					data[i][1] = oa.getValue();
					//D.o("value is " + data[i][1]);
					i++;
				}
			}

			String objectname = vo.getName();
			AttributeDialog attributeDialog = new AttributeDialog(objectname,
					data, vo);
			view.showDialog(attributeDialog);
		}
	}
	private class parameterizeValueMethod extends ObjectMethod {

		public parameterizeValueMethod(View v) {
			super(v);
			name = "Parameterize with Value Attributes";
			instruction = "Show Value Attributes Behind Name";
		}

		protected boolean isSuitable(ViewObject vo) {
			return true;
		}

		protected void operate(ViewObject vo) {
			promptUnparameterization(vo);
			promptParameterization(vo, 1);
		}
	}

	private class parameterizeNonIntentionalMethod extends ObjectMethod {

		public parameterizeNonIntentionalMethod(View v) {
			super(v);
			name = "Parameterize with Non-Intentionals";
			instruction = "Show Non-Intentionals Behind Name";
		}

		protected boolean isSuitable(ViewObject vo) {
			return true;
		}

		protected void operate(ViewObject vo) {
			promptUnparameterization(vo);
			promptParameterization(vo, 2);
		}
	}

//Show the value attributes of intentional elements.
	private class parameterize_value_attributes extends AbstractPluginMethod {

		private Image isonimage;

		public parameterize_value_attributes(View view) {
			this.view = view;
			ImageIcon ii = new ImageIcon(this.getClass().getResource("/resources/Check.gif"));
			isonimage = ii.getImage();
		}

		public String getName() {
			return "Parameterize Value Attributes";
		}

		public Image getImage() {
			if (shouldParameterize_value_attributes()) {
				return isonimage;
			} else {
				return null;
			}
		}

		public void invoke() {
			setParameterize_value_attributes(!shouldParameterize_value_attributes());
			if (shouldParameterize_value_attributes()) {
				//		Iterator i = view.getSelectedElements().iterator();
				setParameterize_non_intentionals(false);
				Iterator i = view.getAllElements().iterator();
				while (i.hasNext()) {
					ViewObject vo = (ViewObject) i.next();
					promptUnparameterization(vo);
					promptParameterization(vo, 1);
				}
			} else {
				Iterator i = view.getAllElements().iterator();
				while (i.hasNext()) {
					ViewObject vo = (ViewObject) i.next();
					promptUnparameterization(vo);
				}
			}
		}
	}

private class parameterize_non_intentionals extends AbstractPluginMethod {

		private Image isonimage;

		public parameterize_non_intentionals(View view) {
			this.view = view;
			ImageIcon ii = new ImageIcon(this.getClass().getResource(
					"/resources/Check.gif"));
			isonimage = ii.getImage();
		}

		public String getName() {
			return "Parameterize Non-Intentionals";
		}

		public Image getImage() {
			if (shouldParameterize_non_intentionals()) {
				return isonimage;
			} else {
				return null;
			}
		}

		public void invoke() {
			setParameterize_non_intentionals(!shouldParameterize_non_intentionals());
			if (shouldParameterize_non_intentionals()) {
				//		Iterator i = view.getSelectedElements().iterator();
				setParameterize_value_attributes(false);
				Iterator i = view.getAllElements().iterator();
				while (i.hasNext()) {
					Object non_intentional_type = model.getFramework().getType(
							"Non-Intentional Element");
					ViewObject vo = (ViewObject) i.next();
					ModelElement curr = (ModelElement) vo.getModelObject();
					promptUnparameterization(vo);
					if (!curr.getType().equals(non_intentional_type)) {
						promptParameterization(vo, 2);
					}
				}
			} else {
				Iterator i = view.getAllElements().iterator();
				while (i.hasNext()) {
					ViewObject vo = (ViewObject) i.next();
					promptUnparameterization(vo);
				}
			}
		}
	}
	/**
	 * Prompts user to parameterize the elements. We had better receive a
	 * GraphicViewElement. There is not constrain on the name of the element. It
	 * is possible that two elements have an identical name.
	 */
	public void promptParameterization(ViewObject vo, int source) {
		//D.o("Prompting Parameterization!!!!!!!!!");
		String name = vo.getModelObject().getName();
		//D.o("element name is" + name);
		String[] parameters = {"", "", "", "", "", "", "", "", "", ""};

		int i = 0;

		if (source == 1) {
			Iterator mvas = vo.getModelObject().getValueAttributes();
			while (mvas.hasNext()) {
				ModelValueAttribute oa = (ModelValueAttribute) mvas.next();
				if ((oa != null)
						&& ((oa.getLabel() != null) || (oa.getValue() != null))) {
					parameters[i] = oa.getValue();
					//D.o("parameter value is " + parameters[i]);
					i++;
				}
			}
		} else if (source == 2) {
			Object attributetype = model.getFramework().getType(
					"Attribute link");
			ModelElement curr = (ModelElement) vo.getModelObject();
			Iterator links = curr.getLinks().iterator();
			while (links.hasNext()) {
				ModelLink currlink = (ModelLink) links.next();
				if (currlink.getType().equals(attributetype)) {
					parameters[i] = currlink.getFrom().getName();
				}
				i++;
			}

			try {
				Iterator ii = vo.getLinks().iterator();
				while (ii.hasNext()) {
					ViewLink vl = (ViewLink) ii.next();
					if (((ViewObject) vl.getTo() == vo)
							&& (vl.getType().equals(attributetype))) {
						ViewObject sourceobj = (ViewObject) vl.getFrom();
						if (!vl.isHidden()) {
							vl.setHidden(true);
						}
						if (!sourceobj.isHidden()) {
							sourceobj.setHidden(true);
						}
					}
				}
			} catch (Exception e) {
				D.o(e);
			}
		}

		String newname = new String(name);
		//D.o("Newname is " + newname);
		i = 0;
		while (!parameters[i].equals("")) {
			if (i == 0) {
				newname = newname.concat(" [");
			} else {
				newname = newname.concat(", ");
			}
			newname = newname.concat(parameters[i]);
			i++;
		}
		if (i != 0) {
			newname = newname.concat("]");
		}
		try {
			vo.setName(newname);
		} catch (Exception e) {
			D.o(e);
		}
	}

	public void promptUnparameterization(ViewObject vo) {
		D.o("Prompting Unparameterization!!!!!!!!!");
		String name = vo.getModelObject().getName();
		int index = name.indexOf("[");

		if (index > 0) {
			String newname = new String(name.substring(0, index - 1));
			D.o("newname is " + newname);
			try {
				vo.setName(newname);
			} catch (Exception e) {
				D.o(e);
			}
		}

		try {
			Iterator ii = vo.getLinks().iterator();
			Object attributetype = model.getFramework().getType(
					"Attribute link");
			while (ii.hasNext()) {
				ViewLink vl = (ViewLink) ii.next();
				if (((ViewObject) vl.getTo() == vo)
						&& (vl.getType().equals(attributetype))) {
					ViewObject sourceobj = (ViewObject) vl.getFrom();
					if (vl.isHidden()) {
						vl.setHidden(false);
					}
					if (sourceobj.isHidden()) {
						sourceobj.setHidden(false);
					}
				}
			}
		} catch (Exception e) {
			D.o(e);
		}
	}
	public void setView(View view) {
		model = view.getModel();
	}
}

