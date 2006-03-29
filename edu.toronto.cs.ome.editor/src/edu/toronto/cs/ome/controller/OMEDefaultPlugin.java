package edu.toronto.cs.ome.controller;

import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Point2D;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.net.URL;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import com.keypoint.PngEncoderB;

import edu.toronto.cs.ome.OMETab;
import edu.toronto.cs.ome.model.ModelAttribute;
import edu.toronto.cs.ome.model.ModelObject;
import edu.toronto.cs.ome.model.OMEFramework;
import edu.toronto.cs.ome.model.OMEModel;
import edu.toronto.cs.ome.model.OMEObject;
import edu.toronto.cs.ome.model.TelosElement;
import edu.toronto.cs.ome.model.TelosModel;
import edu.toronto.cs.ome.view.GraphicView;
import edu.toronto.cs.ome.view.GraphicViewCanvas;
import edu.toronto.cs.ome.view.GraphicViewElement;
import edu.toronto.cs.ome.view.GraphicViewFrame;
import edu.toronto.cs.ome.view.GraphicViewLink;
import edu.toronto.cs.ome.view.GraphicViewObject;
import edu.toronto.cs.ome.view.View;
import edu.toronto.cs.ome.view.ViewContext;
import edu.toronto.cs.ome.view.ViewElement;
import edu.toronto.cs.ome.view.ViewLink;
import edu.toronto.cs.ome.view.ViewObject;
import edu.toronto.cs.telos.TelosParserIndividual;
import edu.toronto.cs.util.Computing;
import edu.toronto.cs.util.D;

/**
 * Revised by Zhifeng Liu Jul 27,2004 * to add "Edit(Copy-Cut-Paste) menu and the respective Copy,Cut,Paste methods
 */

public class OMEDefaultPlugin implements OMEPlugin {
	
	public static ChangeLinkTypeMethod cltm;
	
	OMEModel model;

	private boolean use_expandable; //Should we include methods

	private boolean straightenall = true;

	//for expandable elements?

	public OMEDefaultPlugin(View view) {
		model = view.getModel();
		use_expandable = expandableElementsPresent();
	}
	public void setView(View view) {
		model = view.getModel();
	}

	/** We are compatable with everything (we hope). */
	static public boolean isCompatibleWith(OMEModel model) {
		return true;
	}

	/** Some objects may want special access to our save method. */
	public PluginMethod getSaveMethod(View v) {
		return new SaveMethod(v);
	}
	PluginMethod eam;
	public Collection getToolbarMethods(View v) {
		Vector toolbarMethods = new Vector();
		// Toolbar 1: Has the convienient save button on it.
		MenuMethod file_edit_toolbar = new MenuMethod("File/Edit");
		file_edit_toolbar.addItem((PluginMethod)new NewMethod(v));
		file_edit_toolbar.addItem((PluginMethod)new OpenMethod(v));
		file_edit_toolbar.addItem((PluginMethod)new SaveMethod(v));
		MenuMethod view_toolbar = new MenuMethod("View");
		eam = (PluginMethod)new ExpandAllMethod(v);
		view_toolbar.addItem(eam);		
		view_toolbar.addItem((PluginMethod)new LayoutMethod(v));
		// Toolbar 3: Methods for 2D scrolling
		MenuMethod view_change_toolbar = new MenuMethod("View change");
		view_change_toolbar.addItem((PluginMethod)new Scrolling(v));
		view_change_toolbar.addItem((PluginMethod)new Zoomin(v));
		view_change_toolbar.addItem((PluginMethod)new Zoomout(v));
		MenuMethod reasoning_toolbar = new MenuMethod("Reasoning");
		reasoning_toolbar.addItem((PluginMethod)new ReasoningMethod(v));
		reasoning_toolbar.addItem((PluginMethod)new SATReasoningMethod(v));
		reasoning_toolbar.addItem((PluginMethod)new ToggleLabelMethod(v));		
		reasoning_toolbar.addItem((PluginMethod)new SelectSatisfiedMethod(v));		
		// Toolbar 2: Methods for those instantiable types that have
		// requested automatic interface generation.
		MenuMethod create_object_tb = new MenuMethod("Create Object");
		Iterator instantiables = getInstantiableTypes().iterator();
		OMEFramework fw = v.getModel().getFramework();
		boolean use_cot = false; // Do we actually need this toolbar?
		while (instantiables.hasNext()) {
			Object type = instantiables.next();			
			if (fw.autoGenInterface(type)) {
				if (type==null) {
					D.o("Error: the instantiable type is null");
				}
				if (fw.isLink(type)) {
					use_cot = true;
					create_object_tb.addItem(new CreateLinkMethod(type, fw
							.getName(type), v));
				} else if (fw.isElement(type)) {
					use_cot = true;
					create_object_tb.addItem(new CreateElementMethod(type, fw
							.getName(type), v));
				} else {
					// Bizarre
					D.a("Invalid instantiable type encountered.  Must be "
							+ "element or link.");
				}
			}
		}
		// Return the toolbars.
		if (System.getProperty("ome.eclipse")==null)
			toolbarMethods.add(file_edit_toolbar);
		toolbarMethods.add(view_toolbar);
		toolbarMethods.add(view_change_toolbar);
		toolbarMethods.add(reasoning_toolbar);
		if (use_cot) {
			toolbarMethods.add(create_object_tb);
		}
		return toolbarMethods;
	}

	private void setStraightenAll(boolean b) {
		straightenall = b;
	}

	private boolean straightenAll() {
		return straightenall;
	}

	public Collection getMenubarMethods(View v) {
		Vector menubarMethods = new Vector();

		// Create File Menu
		MenuMethod filemenu = new MenuMethod("File");
		//Added by Zhifeng Jul 2004
		//to include "New"(create) functionanality
		if (System.getProperty("ome.eclipse")==null) {
			filemenu.addItem(new NewMethod(v));
			filemenu.addItem(new OpenMethod(v));
			filemenu.addItem(new SaveMethod(v));
		}
		filemenu.addItem(new SaveAsMethod(v));		

		//Added by Zhifeng Liu Jul 2004
		// Create Edit Menu to include copy-cut-paste funcationality
		MenuMethod editmenu = new MenuMethod("Edit");
		editmenu.addItem(new CopyMethod(v));
		boolean todo = System.getProperty("edu.toronto.cs.ome.todo")!=null
			&& System.getProperty("edu.toronto.cs.ome.todo").equalsIgnoreCase("true"); 
		editmenu.addItem(new CutMethod(v));
		editmenu.addItem(new PasteMethod(v));
		editmenu.addItem(new SearchMethod(v));
		if (todo) { 
			editmenu.addItem(new UndoMethod(v));
			editmenu.addItem(new RedoMethod(v));
		}
		// Create View Menu
		MenuMethod viewmenu = new MenuMethod("View");
		viewmenu.addItem(new SelectAllMethod(v));
		viewmenu.addItem(new LayoutMethod(v));
		System.setProperty("Only layout visible elements", "true");
		if (todo) {
			viewmenu.addItem(new PropertyMethod(v, "edu.toronto.cs.ome.layout.neato"));
			viewmenu.addItem(new PropertyMethod(v, "Only layout visible elements"));
		}
		viewmenu.addItem(new SelectBackgroundColorMethod(v));
		viewmenu.addItem(new StraightenSelectedMethod(v));
		viewmenu.addItem(new StraightenAllMethod(v));
		viewmenu.addItem(new ToggleIntentionMethod(v));
		viewmenu.addItem(new ExpandAllMethod(v));
		viewmenu.addItem(new HideUnselectedMethod(v));
		viewmenu.addItem(new UnhideAllMethod(v));
		System.setProperty("Zoom text", "true");
		System.setProperty("Zoom distance", "true");
		if (System.getProperty("edu.toronto.cs.ome.zoom.tuning")!=null) {
			viewmenu.addItem(new PropertyMethod(v, "Zoom distance"));
			viewmenu.addItem(new PropertyMethod(v, "Zoom text"));
		}
		System.setProperty("view.Bird's eye", "true");
		if (System.getProperty("edu.toronto.cs.ome.view.birdseye")!=null) {
			viewmenu.addItem(new PropertyMethod(v, "view.Bird's eye"));
		}
		MenuMethod reasoningmenu = new MenuMethod("Reasoning");
		System.setProperty("Avoid Conflicts Strictly", "true");
		System.setProperty("Balanced contributions", "true");
		if (System.getProperty("edu.toronto.cs.ome.reasoning.tuning")!=null) {
			reasoningmenu.addItem(new PropertyMethod(v, "Avoid Conflicts"));		
			reasoningmenu.addItem(new PropertyMethod(v, "Avoid Conflicts Strictly"));		
			reasoningmenu.addItem(new PropertyMethod(v, "Balanced contributions"));
		}
		//CAISE coloring code - nernst
		if (Computing.propertyHolds("ome.visualization.caise")) {
			reasoningmenu.addItem(new PropertyMethod(v, "ome.visualization.conflict"));
			reasoningmenu.addItem(new PropertyMethod(v, "ome.visualization.feasibility.label"));
			reasoningmenu.addItem(new PropertyMethod(v, "ome.visualization.certainty.color"));
			reasoningmenu.addItem(new PropertyMethod(v, "ome.visualization.performance.color"));		
		}
		if (Computing.propertyHolds("ome.visualization.reasoning")) {
			reasoningmenu.addItem(new PropertyMethod(v, "ome.visualization.satisfiability.label"));
			reasoningmenu.addItem(new PropertyMethod(v, "ome.visualization.denial.label"));		
			reasoningmenu.addItem(new PropertyMethod(v, "ome.visualization.label"));		
		}
		reasoningmenu.addItem(new ReasoningMethod(v));
		reasoningmenu.addItem(new SATReasoningMethod(v));
		reasoningmenu.addItem(new ToggleLabelMethod(v));
		reasoningmenu.addItem((PluginMethod)new SelectSatisfiedMethod(v));
		MenuMethod helpmenu = null;
		if (todo) {
			helpmenu = new MenuMethod("Help");
			helpmenu.addItem(new HelpContentMethod());
		}
		// Add the created menus to the menubar
		menubarMethods.add(filemenu);
		menubarMethods.add(editmenu);
		menubarMethods.add(viewmenu);
		menubarMethods.add(reasoningmenu);
		if (todo) {
			menubarMethods.add(helpmenu);
		}
		return menubarMethods;
	}
	/** 
	 * Getting OMEDefault popup methods
	 */
	public Collection getPopupMethods(View v) {
		Vector ll = new Vector();
		ll.add(new SelectMethod(v));
		ll.add(new DeselectMethod(v));
		ll.add(new PopupMenuSeparatorMethod(v));
		if (use_expandable) {
			ll.add(new ExpandMethod(v));
			ll.add(new UnexpandMethod(v));
			ll.add(new PromoteChildMethod(v));
			ll.add(new AddChildMethod(v));
			ll.add(new PopupMenuSeparatorMethod(v));
		}
		ll.add(new DeleteMethod(v));
		ll.add(new HideMethod(v));
		ll.add(new UnhideAllMethod(v));
		ll.add(new PopupMenuSeparatorMethod(v));
		ll.add(new RenameMethod(v));
		if (v.getModel().getFramework().isCommentSupported()) {
			ll.add(new ModifyCommentMethod(v));
		}
		ll.add(new ResizeMethod(v));
		ll.add(new StraightenMethod(v));
		ll.add(new HighlightMethod(v));
		ll.add(new UnhighlightMethod(v));
		ll.add(new PopupMenuSeparatorMethod(v));
		ll.add(new ChangeLinkDirectionMethod(v));
		ll.add(new ChangeLinkDestinationMethod(v));
		ll.add(new ChangeLinkSourceMethod(v));
		ll.add(cltm = new ChangeLinkTypeMethod(v));
		ll.add(new PopupMenuSeparatorMethod(v));
		ll.add(new RemoveAttributeSubmenu(v));
		ll.add(new AddAttributeSubmenu(v));
		ll.add(new AddQuanAttributeMethod(v));
		return ll;
	}

	/**
	 * Returns a collection of Objects that represent the instantiable element
	 * types available in the framwork associated with the given view.
	 */
	private Collection getInstantiableElementTypes() {
		Vector etypes = new Vector();
		// Iterate over Instantiable elements and links, and add the
		// element.
		OMEFramework fw = model.getFramework();
		Iterator i = fw.getAllInstantiable();
		while (i.hasNext()) {
			Object objecttype = (Object) i.next();
			if (fw.isElement(objecttype)) {
				etypes.add(objecttype);
			}
		}
		return etypes;
	}

	/**
	 * Returns a collection of Objects that represent the instantiable link
	 * types available in the framwork associated with the given view.
	 */
	private Collection getInstantiableLinkTypes() {
		Vector ltypes = new Vector();
		// Iterate over Instantiable elements and links, and add the
		// links.
		OMEFramework fw = model.getFramework();
		Iterator i = fw.getAllInstantiable();
		while (i.hasNext()) {
			Object objecttype = (Object) i.next();
			if (fw.isLink(objecttype)) {
				ltypes.add(objecttype);
			}
		}
		return ltypes;
	}

	/**
	 * Returns a collection of Objects that represent all the instantiable types
	 * available in the framwork associated with the given view.
	 */
	private Collection getInstantiableTypes() {
		Collection c = getInstantiableElementTypes();
		c.addAll(getInstantiableLinkTypes());
		return c;
	}

	/** Are there any expandable, instantiable elements in this framework? */
	private boolean expandableElementsPresent() {
		Iterator i = getInstantiableElementTypes().iterator();
		OMEFramework fw = model.getFramework();
		while (i.hasNext()) {
			if (fw.isExpandable(i.next())) {
				return true;
			}
		}
		return false;
	}

	////////////////////////////////////////////////////////////////////////
	//									  //
	//	    METHODS //
	//									  //
	////////////////////////////////////////////////////////////////////////

private class SelectAllMethod extends AbstractPluginMethod {

		public SelectAllMethod(View v) {
			view = v;
		}

		public int getMnemonic() {
			return 'A';
		}

		/*
		 * Don't need to update this method since because we wish the default
		 * character to be underlined.
		 */
		public int getDisplayedMnemonicIndex() {
			return -1;
		}

		public String getAcceleratorStr() {
			return "ctrl+A";
		}

		public String getName() {
			return "Select All";
		}

		public void invoke() {
			Collection allelements = view.getAllElements();
			if (allelements != null) {
				selectVisible(allelements.iterator());
			}

			Collection alllinks = view.getAllLinks();
			if (alllinks != null) {
				selectVisible(alllinks.iterator());
			}

		}

		/**
		 * Selects all ViewObjects in the given Iterator (provided they are not
		 * hidden).
		 */
		private void selectVisible(Iterator i) {
			while (i.hasNext()) {
				ViewObject vo = (ViewObject) i.next();
				if (!vo.isHidden() && !vo.isIconified()) {
					vo.setSelected(true);
				}
			}
		}
	}
/**
 * switch (to_expand) 
 * case 0: collapsed  
 * case 1: expanded with agent nodes  
 * case 2: expanded without agent nodes
 */ 
public static final int DEFAULT_EXPAND = 
		System.getProperty("ome.expand.mode")!=null? 
			Integer.parseInt(System.getProperty("ome.expand.mode"))
			: 0;
public static int to_expand = DEFAULT_EXPAND;
public static String getGraphType(int to_expand) {
	if (to_expand == 0)
		return "You are viewing Strategic Dependency graph";
	if (to_expand == 1)
		return "You are viewing both Dependency and Rationale graph";
	if (to_expand == 2)
		return "You are viewing Strategic Rationale graph";
	return null;
}
// Yijun Yu: Feb 8 
// @purpose to expand/contract all the agents
private class ExpandAllMethod extends AbstractPluginMethod {
	public ExpandAllMethod(View view) {
		this.view = view;
		to_expand = DEFAULT_EXPAND;
		String m = getGraphType(to_expand);	
		((GraphicView) view).getGraphicViewCanvas().getFrame().setMessage(m);
//		D.o(m);
	}
	public int getMnemonic() {
		return 'V';
	}
	public int getDisplayedMnemonicIndex() {
		return 0;
	}
	Image img =
		new ImageIcon(this.getClass().getResource(
		"/resources/zoom.png")).getImage();
	public Image getImage() {
		return img;			
	}
	public String getName() {
		return "Viewing Strategic Dependency (SD) /Rationale (SR) or both";
	}
	public void invoke() {
		Collection allelements = view.getAllElements();
		for (Iterator i = allelements.iterator(); i.hasNext();) {
			ViewObject vo = (ViewObject) i.next();
				try {
					ViewElement ve = (ViewElement) vo;
					if (ve.isExpandable()) {
						if (to_expand == 0) ve.expand();
						if (to_expand == 1) ve.expand2();
						if (to_expand == 2) ve.contract();
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
		}
		to_expand = (to_expand + 1) % 3;
		String m = getGraphType(to_expand);
		((GraphicView) view).getGraphicViewCanvas().getFrame().setMessage(m);
//		D.o(m);
	}
}


/**
 * The method used to select the background color of the graphic view * canvas.
 */

	private class SelectBackgroundColorMethod extends AbstractPluginMethod {

		/**
		 * 
		 * @uml.property name="gvc"
		 * @uml.associationEnd multiplicity="(0 1)"
		 */
		private GraphicViewCanvas gvc;

		private JColorChooser chooser = new JColorChooser();

		private JDialog dialog;

		public SelectBackgroundColorMethod(View view) {
			this.view = view;
		}

		// Added by Zhifeng Liu(Jul 2004)
		public int getMnemonic() {
			return 'B';
		}

		// Added by Zhifeng Liu(Jul 2004)
		/*
		 * Don't need to update this method since because we wish the default
		 * character to be underlined.
		 */
		public int getDisplayedMnemonicIndex() {
			return -1;
		}

		public String getName() {
			return "Select Background Color";
		}

		public void invoke() {
			gvc = ((GraphicView) view).getGraphicViewCanvas();
			dialog = JColorChooser.createDialog(gvc, "Select a Color", true,
					chooser, new OKListener(), new CancelListener());
			chooser.setColor(gvc.getBackground());
			dialog.setVisible(true);
		}

		private class OKListener implements ActionListener {
			public void actionPerformed(ActionEvent e) {
				gvc.setBackground(chooser.getColor());
			}
		}

		private class CancelListener implements ActionListener {
			public void actionPerformed(ActionEvent e) {
				// just do nothing.
			}
		}
	}

	/*
	 * private class CreateNewViewMethod extends AbstractPluginMethod {
	 * 
	 * private View view;
	 * 
	 * public CreateNewViewMethod(View view){ this.view = view; }
	 * 
	 * public String getName(){ return "New Window"; }
	 * 
	 * public void invoke(){ //this inplementation is only for graphic view
	 * GraphicViewFrame gvf=
	 * ((GraphicView)view).getGraphicViewCanvas().getGraphicViewFrame();
	 * Object[] options = {"Graphic View", "Tree View", "Textual Description"};
	 * int n = JOptionPane.showOptionDialog(gvf, "Which kind of view would you
	 * like to create" + "in the new window?", "View Type Chooser",
	 * JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,
	 * options, options[0]);
	 * 
	 * ViewManager vm = view.getModel().getViewManager(); int id =
	 * vm.createView(n); try { gvf.createNewViewFrame(vm, vm.getOME(), n, id); }
	 * catch (Exception e) { D.o(e); } } }
	 */

	private class HelpContentMethod extends AbstractPluginMethod {
		public HelpContentMethod() {
		}

		public String getName() {
			return "Help Contents";
		}

		// Added by Zhifeng Liu(Jul 2004)
		public int getMnemonic() {
			return 'C';
		}

		// Added by Zhifeng Liu(Jul 2004)
		/*
		 * Don't need to update this method since because we wish the default
		 * character to be underlined.
		 */
		public int getDisplayedMnemonicIndex() {
			return -1;
		}

		public Image getImage() {
			// Plugins shouldn't know about directory images!
			ImageIcon ic = new ImageIcon(this.getClass().getResource(
					"/resources/helpbook.gif"));
			return ic.getImage();
		}

		public void invoke() {

		}
	}

/**
 * The method to "Save" the model and its views.
 */

	private class SaveMethod extends AbstractPluginMethod {

		public SaveMethod(View view) {
			this.view = view;
		}

		// Added by Zhifeng Liu(Jul 2004)
		public int getMnemonic() {
			return 'S';
		}

		// Added by Zhifeng Liu(Jul 2004)
		/*
		 * Don't need to update this method since because we wish the default
		 * character to be underlined.
		 */
		public int getDisplayedMnemonicIndex() {
			return -1;
		}

		public String getAcceleratorStr() {
			return "ctrl+S";
		}

		public String getName() {
			return "Save";
		}

		public Image getImage() {
			// Plugins shouldn't know about directory images!
			ImageIcon ic = new ImageIcon(this.getClass().getResource(
					"/resources/save.gif"));
			return ic.getImage();
		}

		public void invoke() {
			String pathname = view.getSavePathname();
			//D.o("Saving........" + pathname);
			if (pathname == null) {
				// Do nothing, user must have changed her mind.
				D.o("Haver you changed mind?");
				return;
			} else {
				try {
					model.save(new File(pathname));
				} catch (Exception e) {
					// Error saving model.
					e.printStackTrace();
				}
			}
		}
	}

/**
 * The method to "Open" the model and its views.
 */

	private class OpenMethod extends AbstractPluginMethod {

		public OpenMethod(View view) {
			this.view = view;
		}

		// Added by Zhifeng Liu(Jul 2004)
		public int getMnemonic() {
			return 'O';
		}

		// Added by Zhifeng Liu(Jul 2004)
		/*
		 * Don't need to update this method since because we wish the default
		 * character to be underlined.
		 */
		public int getDisplayedMnemonicIndex() {
			return -1;
		}

		public String getAcceleratorStr() {
			return "ctrl+O";
		}

		public String getName() {
			return "Open ...";
		}

		public Image getImage() {
			// Plugins shouldn't know about directory images!
			ImageIcon ic = new ImageIcon(this.getClass().getResource(
					"/resources/open.gif"));
			return ic.getImage();
		}
		
		public void invoke() {
			File f = GraphicView.getOpenFileAndDirectory(
					(GraphicViewFrame) OMETab.iframe,
					view.getSavePathname(),
					"Telos knowledge base:tel;5W2H:q7;Visio XML:vdx");
			if (f != null && f.exists()) {
				OMETab.mm.updateOpenOME(f);
			}
		}
	}

	/**
	 * Method generatePNG.create the PNG format file from the pixel data
	 * @param width the image width to wrap the trace around horizontally
	 */
	public static void generatePNG(File f, BufferedImage bimg) {
		PngEncoderB png = new PngEncoderB(bimg);
		byte[] b = png.pngEncode();
		FileOutputStream fout = null;
		try {
			fout = new FileOutputStream(f);
			fout.write(b);
			fout.close();
		} catch (Exception e) {
			e.printStackTrace(System.out);

		}
	}
	
/**
 * The method to "Save As" the model and its views.
 */
	private class SaveAsMethod extends AbstractPluginMethod {

		public SaveAsMethod(View view) {
			this.view = view;
		}

		// Added by Zhifeng Liu(Jul 2004)
		public int getMnemonic() {
			return 'A';
		}

		// Added by Zhifeng Liu(Jul 2004)
		/*
		 * Update this method since because we don't wish the default character
		 * to be underlined.
		 */
		public int getDisplayedMnemonicIndex() {
			return 5;
		}

		public String getName() {
			return "Save As ...";
		}

		public Image getImage() {
			// Plugins shouldn't know about directory images!
			ImageIcon ic = new ImageIcon(this.getClass().getResource(
					"/resources/save.gif"));
			return ic.getImage();
		}

		public void invoke() {
			GraphicViewCanvas gvc = ((GraphicView)view).getGraphicViewCanvas(); 
			File f = gvc.getSaveFileAndDirectory("Telos knowledge base:tel;5W2H:q7;SML:sml;Visio XML:vdx;Graphviz Dot:dot;Portable Network Graph:png;Scalable Vector Graph:svg;Portable Document Format:pdf;GR-tool Input:dat;Goal Model:goalmodel;WBI Modeler XML:xml");
			if (f == null) {
				// Do nothing, user must have changed her mind.
			} else {
				try {
					if (f.getName().endsWith(".tel"))
						model.save(f);
					else if (f.getName().endsWith(".q7"))
						((TelosModel)model).saveasq7(f);
					else if (f.getName().endsWith(".sml"))
						model.saveassml(f);
					else if (f.getName().endsWith(".vdx"))
						model.saveasvdx(f); //cai
					else if (f.getName().endsWith(".dot"))
						((TelosModel)model).saveasdot(f);
					else if (f.getName().endsWith(".png")) {
						Image im = gvc.print(((GraphicView) view).getViewBounds());
						generatePNG(f, (BufferedImage) im);
					} else if (f.getName().endsWith(".svg"))
						((GraphicView) view).getGraphicViewCanvas().export2svg(f);
					else if (f.getName().endsWith(".pdf"))
						((GraphicView) view).getGraphicViewCanvas().export2pdf(f);
					else if (f.getName().endsWith(".xml"))						
						((TelosModel)model).saveasxml(f);
					else if (f.getName().endsWith(".dat"))
						((TelosModel)model).saveasdat(f);
					else if (f.getName().endsWith(".goalmodel"))
						((TelosModel)model).saveasxmi(f);
				} catch (Exception e) {
					// Error saving model.
					D.a(e);
				}
			}
			System.gc();
		}
	}

/**
 * The method to "Save As A .dot File" the model and its views.
 */

	private class LayoutMethod extends AbstractPluginMethod {
		public LayoutMethod(View view) {
//			this.view = view;
		}
		public int getMnemonic() {
			return 'L';
		}
		public String getAcceleratorStr() {
			return "ctrl+L";
		}		
		public int getDisplayedMnemonicIndex() {
			return 0;
		}
		public String getName() {
			return "Layout";
		}
		Image img =
			new ImageIcon(this.getClass().getResource(
			"/resources/layout.png")).getImage();
		public Image getImage() {
			return img;			
		}
		public void invoke() {
			File f=new File(Computing.getTempFilename("test.dot"));///Return here
			if (f != null) {
//				D.o("File found: " + f.getAbsolutePath());
				try {
					((TelosModel)model).layout(f); //Xiao X. Deng
				} catch (Exception e) {
					e.printStackTrace();
				}
			} else {
//				D.o("File not found: " + f.getAbsolutePath());
			}
		}
	}

	public class StraightenSelectedMethod extends AbstractPluginMethod {
		public StraightenSelectedMethod(View v) {
			view = v;
		}
		public int getMnemonic() {
			return 'S';
		}
		public int getDisplayedMnemonicIndex() {
			return 0;
		}
		public String getName() {
			return "Straigten Selected Links";
		}
		public void invoke() {
			Iterator i = view.getSelectedLinks().iterator();
			while (i.hasNext()) {
					ViewObject vo = (ViewObject) i.next();
					view.promptStraighten(vo);
			}
		}
	}

	public class StraightenAllMethod extends AbstractPluginMethod {

		private Image isonimage;

		public StraightenAllMethod(View v) {
			// Get our little checkmark image
			ImageIcon ii = new ImageIcon(this.getClass().getResource(
					"/resources/Check.gif"));
			view = v;
			isonimage = ii.getImage();
		}

		// Added by Zhifeng Liu(Jul 2004)
		public int getMnemonic() {
			return 'L';
		}

		// Added by Zhifeng Liu(Jul 2004)
		/*
		 * Update this method since because we don't wish the default character
		 * to be underlined.
		 */
		public int getDisplayedMnemonicIndex() {
			return 14;
		}

		public String getName() {
			return "Straigten All Links";
		}

		public Image getImage() {
			if (straightenAll()) {
				return isonimage;
			} else {
				return null;
			}
		}

		public void invoke() {
			// toggle the Autopropogate
			D.o("here");
			setStraightenAll(!straightenAll());
			view.setStraighten(straightenAll());
			if (straightenAll()) {
				Iterator i = view.getSelectedLinks().iterator();
				while (i.hasNext()) {
					ViewObject vo = (ViewObject) i.next();
					view.promptStraighten(vo);
				}
			}
		}
	}
	
	
	/**
	 * To avoid/tolerate conflicts for top-down reasoning 
	 * @author Yijun Yu
	 *
	 */
	public class PropertyMethod extends AbstractPluginMethod {
		private Image isonimage;
		protected String property;
		public PropertyMethod(View v,
				String property) {
			ImageIcon ii = new ImageIcon(this.getClass().getResource(
					"/resources/Check.gif"));
			view = v;
			isonimage = ii.getImage();
			this.property = property;
		}
		public String getName() {
			return property;
		}
		public Image getImage() {
			if (Computing.propertyHolds(property)) {
				return isonimage;
			} else {
				return null;
			}
		}
		public void invoke() {
			// toggle the Autopropogate
			if (Computing.propertyHolds(property))
				System.clearProperty(property);
			else
				System.setProperty(property, "true");
		}
	}
	
	
	/** The method to select an object */
	private class SelectMethod extends ObjectMethod {

		public SelectMethod(View v) {
			super(v);
			name = "Select";
			instruction = "Select the object";
		}

		protected void operate(ViewObject vo) {
			view.selectObject(vo);
		}

		protected boolean isSuitable(ViewObject vo) {
			return !vo.isSelected();
		}
	}

	/** The method to deselect an object */
	private class DeselectMethod extends ObjectMethod {

		public DeselectMethod(View v) {
			super(v);
			name = "Deselect";
			instruction = "Choose the object to be deselected.";
		}

		protected void operate(ViewObject vo) {
			view.deselectObject(vo);
		}

		protected boolean isSuitable(ViewObject vo) {
			return vo.isSelected();
		}
	}

	/**
	 * Toggles the Auto-propogation property.
	 */
	
		private class ToggleIntentionMethod extends AbstractPluginMethod {
			private Image isonimage;
	
			public ToggleIntentionMethod(View view) {
				// Get our little checkmark image
				ImageIcon ii = new ImageIcon(this.getClass().getResource(
						"/resources/Check.gif"));
				isonimage = ii.getImage();
				this.view = view;
			}
	
			// Added by Zhifeng Liu(Jul 2004)
			public int getMnemonic() {
				return 'I';
			}
	
			// Added by Zhifeng Liu(Jul 2004)
			/*
			 * Update this method since because we don't wish the default character
			 * to be underlined.
			 */
			public int getDisplayedMnemonicIndex() {
				return 10;
			}
	
			public String getName() {
				return "Hide/Show Intention";
			}
	
			public Image getImage() {
				if (view.isShowIntention()) {
					return isonimage;
				} else {
					return null;
				}
			}
	
			/**
			 * @param b
			 */
			public void invoke() {
				Iterator i;
				i = ((GraphicView)view).getAllObjects();
				while (i.hasNext()) {
					((ViewObject) i.next()).toggleIntention();
				}
			}	
		}
		
	/**
	 * Toggles the Auto-propogation property.
	 */
	private class ToggleLabelMethod extends AbstractPluginMethod {
		public ToggleLabelMethod(View view) {
//			this.view = view;
		}
		public int getMnemonic() {
			return 'R';
		}		
		public int getDisplayedMnemonicIndex() {
			return 0;
		}
		Image img =
			new ImageIcon(this.getClass().getResource(
			"/resources/Undecided.gif")).getImage();
		public Image getImage() {
			return img;			
		}		
		public String getName() {
			return "Reset";
		}
		public void invoke() {
			model.getModelManager().resetReasoning(model);
		}
	}

	/**
	 * Toggles the Auto-propogation property.
	 */
	private class SelectSatisfiedMethod extends AbstractPluginMethod {
		public SelectSatisfiedMethod(View view) {
			this.view = view;
		}
		public int getMnemonic() {
			return 'S';
		}		
		public int getDisplayedMnemonicIndex() {
			return 0;
		}
		Image img =
			new ImageIcon(this.getClass().getResource(
			"/resources/Cross.gif")).getImage();
		public Image getImage() {
			return img;			
		}		
		public String getName() {
			return "Hide unsatisfied elements";
		}
		public void invoke() {
			((GraphicView)view).selectSatisfied(model);
		}
	}

	
	
	/**
	 * This method to perform a 2D scrolling
	 */
	private class Scrolling extends AbstractPluginMethod {
		private View view;
		//private GraphicViewFrame gvf;
		private GraphicViewCanvas gvc;
		public Scrolling(View view) {
			this.view = view;
			//this.gvf = ((GraphicView)view).getFrame();
			this.gvc = ((GraphicView)view).getGraphicViewCanvas();
		}
		public int getMnemonic() {
			return 'S';
		}
		public String getName() {
			return "2DScrolling";
		}
		Image img =
			new ImageIcon(this.getClass().getResource(
			"/resources/Hand.gif")).getImage();
		public Image getImage() {
			return img;			
		}
		public void invoke() {
			((GraphicView)view).getDisplayBounds();
			((GraphicView)view).getViewBounds();
			if (gvc.mode == gvc.TWOD_SCROLLING)
				gvc.endTwoDScrolling();
			else
				gvc.beginTwoDScrolling();
		}
	}
	/**
	 * This method to perform the zoom in method
	 */
	private class Zoomin extends AbstractPluginMethod {
//		private View view;
		//private GraphicViewFrame gvf;
		private GraphicViewCanvas gvc;
		public Zoomin(View view) {
//			this.view = view;
			//this.gvf = ((GraphicView)view).getFrame();
			this.gvc = ((GraphicView)view).getGraphicViewCanvas();
		}
		public int getMnemonic() {
			return 'I';
		}
		public String getName() {
			return "Zoom In\t +";
		}
		Image img =
			new ImageIcon(this.getClass().getResource(
			"/resources/zoomin.gif")).getImage();
		public Image getImage() {
			return img;			
		}
		public void invoke() {
			//JOptionPane.showMessageDialog(null, "zoomin");
			gvc.zoomin();
			//gvc.repaint();
		}
	}
	/**
	 * This method to perform the zoom out method
	 */
	private class Zoomout extends AbstractPluginMethod {
//		private View view;
		//private GraphicViewFrame gvf;
		private GraphicViewCanvas gvc;
		public Zoomout(View view) {
//			this.view = view;
			//this.gvf = ((GraphicView)view).getFrame();
			this.gvc = ((GraphicView)view).getGraphicViewCanvas();
		}
		public int getMnemonic() {
			return 'O';
		}
		public String getName() {
			return "Zoom Out\t -";
		}
		Image img =
			new ImageIcon(this.getClass().getResource(
			"/resources/zoomout.gif")).getImage();
		public Image getImage() {
			return img;			
		}
		public void invoke() {
			//JOptionPane.showMessageDialog(null, "zoomout");
			gvc.zoomout();
			//gvc.repaint();
		}
	}
	
	/**
	 * The method to expand an object.
	 */
	class ExpandMethod extends ObjectMethod {

		public ExpandMethod(View v) {
			super(v);
			name = "Expand";
			instruction = "Choose the element to be exapnded";
		}
		
		public String getAcceleratorStr() {
			return "x";
		}

		protected void operate(ViewObject vo) {
			try {
				((ViewElement) vo).expand();
			} catch (Exception e) {
				// We really should never face this exception, since we
				// explicitly test to see of the element is expandable.
				D.o(e);
			}
		}

		protected boolean isSuitable(ViewObject vo) {
			if (vo instanceof ViewElement) {
				ViewElement ve = (ViewElement) vo;
				return (ve.isExpandable() && !ve.isExpanded());
			} // else
			return false;
		}
	}

	/**
	 * The method to unexpand an object.
	 */
	class UnexpandMethod extends ObjectMethod {

		public UnexpandMethod(View v) {
			super(v);
			name = "Contract";
			instruction = "Choose the element to be contracted";
		}

		protected void operate(ViewObject vo) {
			try {
				((ViewElement) vo).contract();
			} catch (Exception e) {
				// We really should never face this exception, since we
				// explicitly test to see of the element is expandable.
				D.o(e);
			}
		}

		protected boolean isSuitable(ViewObject vo) {
			if (vo instanceof ViewElement) {
				ViewElement ve = (ViewElement) vo;
				return (ve.isExpandable() && ve.isExpanded());
			} // else
			return false;
		}
	}

/**
 * This method removes a child from a parent. That is, takes an object that * is within an expandable element, and promotes it to be an independent * element. Links and attributes should be unaffected.
 */

	class PromoteChildMethod extends ObjectMethod {

		/**
		 * 
		 * @uml.property name="parent"
		 * @uml.associationEnd multiplicity="(0 1)"
		 */
		private ViewElement parent = null;

		private String parent_name = "parent";

		public PromoteChildMethod(View v) {
			super(v);
			resetMethod();
		}

		protected void operate(ViewObject vo) {
			ViewElement child = (ViewElement) vo;
			try {
				D.o("Promote child from parent");
				parent.removeChild(child);
				child.setParent(null);
			} catch (Exception e) {
				D.o(e);
				try {
					D.o("Not sure why this would happen");
					parent.addChild(child);
					child.setParent(parent);
				} catch (Exception ee) {
					// If things can't be set back the way they were, do
					// nothing except spit error.
					D.o(ee);
				}
			}
		}

		protected boolean isSuitable(ViewObject vo) {
			//parent = null;
			if (vo instanceof ViewElement) {
				parent = (ViewElement) ((ViewElement) vo).getParent();
			}
			if (parent != null) {
				name = "Remove from " + parent.getName();
				return true;
			} // else
			return false;
		}

		protected void resetMethod() {
			parent = null;
			parent_name = "parent";
			setNameAndInstruction();
		}

		/**
		 * Sets the name and instruction for the method, based on the
		 * parent_name field.
		 */
		private void setNameAndInstruction() {
			name = "Remove from " + parent_name;
			instruction = "Choose an element to be removed from " + parent_name;
		}
	}

	/**
	 * This method adds a child to an expandable element. I'm not to sure what
	 * the best interaction style is, for now we'll start with picking the
	 * child, then the parent.
	 */
	class AddChildMethod extends ObjectMethod {
		// The order that we expect the child and parent paramters.
		private static final int CHILD = 0;

		private static final int PARENT = 1;

		public AddChildMethod(View v) {
			super(v, 2); // We use two objects here.
			name = "Push into other element.";
			instructions[CHILD] = "Select child element.";
			instructions[PARENT] = "Select parent element.";
		}

		protected boolean isSuitable(ViewObject vo, int n,
				ViewObject[] collected) {
			ViewElement curr;
			if (vo instanceof ViewElement) {
				curr = (ViewElement) vo;
			} else
				return false;
			if (n == CHILD) {
				// We are looking for a non-expandable element (re-enforcing
				// our commitment that there is only one level of expansion,
				// sigh), without a parent.
				if (curr.isExpandable()) {
				}
				return (curr.getParent() == null && !curr.isExpandable());
			} else {
				// n == PARENT
				return (curr.isExpandable());
			}
		}

		protected void operate(ViewObject[] paramters) {
			ViewElement parent = (ViewElement) paramters[PARENT];
			ViewElement child = (ViewElement) paramters[CHILD];
			try {
//				D.o("parent = " + parent.getName());
//				D.o("child = " + child.getName());
				child.setParent(parent);
//				D.o("before"+ parent.getChildren().size());
				parent.addChild(child);
//				D.o("after"+ parent.getChildren().size());
			} catch (Exception e) {
				D.o(e);
				if (child.getParent() == parent) {
					try {
						child.setParent(null);
					} catch (Exception ee) {
						// Could fix things, what can we do? Barf.
						D.o(e);
					}
				}
				D.o("Unable to add child to parent.");
				JOptionPane.showMessageDialog(null,
						"Unable to add into parent", "Semantic Error",
						JOptionPane.ERROR_MESSAGE);

			}
		}
	}

	/** The method to delete an object. */
	class DeleteMethod extends ObjectMethod {

		public DeleteMethod(View v) {
			super(v);
			name = "Delete";
			instruction = "Choose the element to be deleted";
		}

		protected void operate(ViewObject vo) {
			view.deleteObject(vo);
			view.getHighlightedObjects().remove(vo);
		}
	}

/**
 * Method to view/modify the "comment" associated with an object. This is * just a workaround while we wait for arbitrary value attribute support.
 */

	class ModifyCommentMethod extends ObjectMethod {

		/**
		 * 
		 * @uml.property name="vo"
		 * @uml.associationEnd multiplicity="(0 1)"
		 */
		ViewObject vo;

		public ModifyCommentMethod(View v) {
			super(v);
			name = "View/Modify Comment";
			instruction = "Choose the object whose comment you wish to"
					+ "view/modify.";
		}

		protected void operate(ViewObject vo) {
			this.vo = vo;
			// Throw up a dialogue to view/modify the comment.
			CommentDialog cd = new CommentDialog();
			cd.pack();
			//cd.setVisible(true);
			view.showDialog(cd);
		}

		private class CommentDialog extends JDialog {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			public CommentDialog() {
				D.o("Building comment dialogue");

				setTitle("Comment for " + vo.getName());

				// Text area.
				JPanel textpanel = new JPanel();
				JTextArea textarea = new JTextArea(10, 50);
				textarea.setText(vo.getComment());
				JScrollPane jsp = new JScrollPane(textarea);
				textpanel.add(jsp);

				// Buttons
				JPanel buttonpanel = new JPanel();
				JButton ok_button = new JButton("Change");
				JButton cancel_button = new JButton("Cancel");
				ok_button.addActionListener(new OkButtonListener(textarea));
				cancel_button.addActionListener(new CancelButtonListener());
				buttonpanel.add(ok_button);
				buttonpanel.add(cancel_button);

				getContentPane().add(textpanel, BorderLayout.CENTER);
				getContentPane().add(buttonpanel, BorderLayout.SOUTH);
			}

			private class OkButtonListener implements ActionListener {
				JTextArea jta;

				public OkButtonListener(JTextArea jta) {
					this.jta = jta;
				}

				public void actionPerformed(ActionEvent e) {
					vo.setComment(jta.getText());
					dispose();
				}
			}

			private class CancelButtonListener implements ActionListener {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			}
		}
	}

	/**
	 * The method to rename an object.
	 */
	class RenameMethod extends ObjectMethod {

		public RenameMethod(View v) {
			super(v);
			name = "Rename";
			instruction = "Choose the object to be renamed";
		}

		protected void operate(ViewObject vo) {
			view.promptRename(vo);
		}
	}

	class StraightenMethod extends ObjectMethod {

		public StraightenMethod(View v) {
			super(v);
			name = "Straighten curved link";
			instruction = "Choose the link to be straightened";
		}

		protected void operate(ViewObject vo) {
			view.promptStraighten(vo);
		}
	}

	class HighlightMethod extends ObjectMethod {

		public HighlightMethod(View v) {
			super(v);
			name = "Highlight Selected Element";
			instruction = "Choose the element to be highlighted";
		}

		protected void operate(ViewObject vo) {
			vo.setHighlighted(true);
		}

	}

	class UnhighlightMethod extends ObjectMethod {

		public UnhighlightMethod(View v) {
			super(v);
			name = "Unhighlight Element";
			instruction = "Choose the element to be unhighlighted";
		}

		protected void operate(ViewObject vo) {
			vo.setHighlighted(false);
		}

	}

	/**
	 * The method to resize an object.
	 */
	class ResizeMethod extends ObjectMethod {

		public ResizeMethod(View v) {
			super(v);
			name = "Resize";
			instruction = "Choose the object to be resized";
		}

		protected void operate(ViewObject vo) {
			view.promptResize(vo);
		}
	}
	class AddQuanAttributeMethod extends ObjectMethod {

		public AddQuanAttributeMethod(View v) {
			super(v);
			name = "Add Quantitive Attributes ";
			instruction = "Choose the object to be assigned quantitive attributes";
		}

		protected void operate(ViewObject vo) {
			GraphicViewElement e=(GraphicViewElement)vo;
			//int id=e.getID();
			view.promptAddQuan((TelosModel)model,e);		
		}
	}
	/**
	 * Swaps the direction of a link. This is going to break the tool when we
	 * have things other than graphic views kicking around.
	 */
	class ChangeLinkDirectionMethod extends ObjectMethod {

		public ChangeLinkDirectionMethod(View v) {
			super(v);
			name = "Change Link Direction";
			instruction = "Select the link whose direction is to be changed.";
		}

		protected boolean isSuitable(ViewObject vo) {
			return (vo instanceof ViewLink);
		}

		public void operate(ViewObject vo) {
			GraphicViewLink gvl = (GraphicViewLink) vo;
			OMEObject to = gvl.getTo();
			OMEObject from = gvl.getFrom();
			try {
				gvl.setTo(from);
				gvl.setFrom(to);
				Point2D.Double ctrl1 = new Point2D.Double(gvl.getcontrol1().x,
						gvl.getcontrol1().y);
				gvl.getcontrol1().setLocation(gvl.getcontrol2().x,
						gvl.getcontrol2().y);
				gvl.getcontrol2().setLocation(ctrl1.x, ctrl1.y);
			} catch (Exception e) {
				//set the old values
				try {
					gvl.setTo(to);
					gvl.setFrom(from);
					OMEFramework fw = view.getModel().getFramework();
					JOptionPane.showMessageDialog(null, "Unable to change "
							+ fw.getName(gvl.getType()) + " from "
							+ fw.getName(to.getType()) + " to "
							+ fw.getName(from.getType()) + ".",
							"Semantic Error", JOptionPane.ERROR_MESSAGE);
				} catch (Exception f) {
					D.o(f);
					// we should never get here as we are just setting
					// the old values of "to" and "from" in the link
				}
			}
		}
	}

	//added by Zhifeng Liu Aug 2004

/**
 * Changes the destination element of a link.
 */

	class ChangeLinkDestinationMethod extends AbstractPluginMethod {

		/**
		 * 
		 * @uml.property name="linkobject"
		 * @uml.associationEnd multiplicity="(0 1)"
		 */
		private ViewObject linkobject = null;

		/**
		 * 
		 * @uml.property name="newDest"
		 * @uml.associationEnd multiplicity="(0 1)"
		 */
		ViewObject newDest = null;

		private final int CONTEXT = 1;

		private final int OBJECT = 4;

		private final int ELEMENT = 16;

		private final int DONE = 367;

		private int nextp = CONTEXT;

		public ChangeLinkDestinationMethod(View view) {
			this.view = view;
		}

		public String getName() {
			return "Change Link Destination";
		}

		public void passParameter(Collection c) {

			if (nextp == CONTEXT) {
				ViewContext con = (ViewContext) c.iterator().next();
				if (con.associatedObject() != null) {
					linkobject = con.associatedObject();
					nextp = ELEMENT;
				} else {
					nextp = OBJECT;
				}

			} else if (nextp == OBJECT) {
				linkobject = (ViewObject) c.iterator().next();
				nextp = ELEMENT;
			} // if (nextp == OBJECT)
			else if (nextp == ELEMENT) {

				ViewObject selectObj = (ViewObject) c.iterator().next();
				if (selectObj != null) {
					newDest = selectObj;
					nextp = DONE;

				} //if (selectObj != null)

			} //if (nextp == ELEMENT)

		}

		public PluginParameter nextParameter() {
			if ((linkobject != null && newDest != null) || nextp == DONE) {
				return null;
			} else if (nextp == CONTEXT) {
				return contextParameter();
			} else if (nextp == OBJECT) {
				return objectParameter();
			} else if (nextp == ELEMENT) {
				return elementParameter();
			}

			return null; // be happy compiler.
		}

		private PluginParameter objectParameter() {
			return new PluginParameter(PluginParameter.CARDINALITY_ONE,
					"Select the link whose ends should be changed",
					PluginParameter.OMEObjectType);
		}

		private PluginParameter contextParameter() {
			return new PluginParameter(PluginParameter.CARDINALITY_ONE, null,
					PluginParameter.OMEContextType);
		}

		private PluginParameter elementParameter() {
			return new PluginParameter(PluginParameter.CARDINALITY_ONE, null,
					PluginParameter.OMEElementType);
		}

		public void invoke() {

			GraphicViewLink gvl = (GraphicViewLink) linkobject;

			if (newDest != null) {

				GraphicViewObject source = (GraphicViewObject) gvl.getFrom();
				GraphicViewObject originalDest = (GraphicViewObject) gvl
						.getTo();

				// the changed link will NOT change its type
				Object type = linkobject.getType();

				if (newDest != originalDest && newDest != source) {

					view.createLink(type, source.getModelObject(), newDest
							.getModelObject());
					view.deleteLink(gvl);

				} else if (newDest == originalDest) {
					//throw up a helpful `Please select a new Destination`
					// message
					JOptionPane.showMessageDialog(null,
							(Object) "Please select a new Destination",
							"Change Link Ends Warning",
							JOptionPane.WARNING_MESSAGE);
				} else if (newDest == source) {

					//throw up a helpful `Please don't connect to itself`
					// message
					JOptionPane.showMessageDialog(null,
							(Object) "Please don't connect to itself",
							"Change Link Ends Warning",
							JOptionPane.WARNING_MESSAGE);

				}

			} //if (newDest != null)

			resetMethod();

		}

		protected void resetMethod() {
			nextp = CONTEXT;
			linkobject = null;
			newDest = null;
		}

		public void cancelled() {
			linkobject = null;
			nextp = CONTEXT;
			newDest = null;
		}

		public boolean isEnabled(ViewContext con) {
			ViewObject vo = con.associatedObject();
			return ((vo != null) && (vo instanceof ViewLink));
		}

	}

	//added by Zhifeng Liu Aug 2004

/**
 * Changes the source element of a link.
 */

	class ChangeLinkSourceMethod extends AbstractPluginMethod {

		/**
		 * 
		 * @uml.property name="linkobject"
		 * @uml.associationEnd multiplicity="(0 1)"
		 */
		private ViewObject linkobject = null;

		/**
		 * 
		 * @uml.property name="newSource"
		 * @uml.associationEnd multiplicity="(0 1)"
		 */
		ViewObject newSource = null;

		private final int CONTEXT = 1;

		private final int OBJECT = 4;

		private final int ELEMENT = 16;

		private final int DONE = 367;

		private int nextp = CONTEXT;

		public ChangeLinkSourceMethod(View view) {
			this.view = view;
		}

		public String getName() {
			return "Change Link Source";
		}

		public void passParameter(Collection c) {

			if (nextp == CONTEXT) {
				ViewContext con = (ViewContext) c.iterator().next();
				if (con.associatedObject() != null) {
					linkobject = con.associatedObject();
					nextp = ELEMENT;
				} else {
					nextp = OBJECT;
				}

			} else if (nextp == OBJECT) {
				linkobject = (ViewObject) c.iterator().next();
				nextp = ELEMENT;
			} // if (nextp == OBJECT)
			else if (nextp == ELEMENT) {

				ViewObject selectObj = (ViewObject) c.iterator().next();
				if (selectObj != null) {
					newSource = selectObj;
					nextp = DONE;

				} //if (selectObj != null)

			} //if (nextp == ELEMENT)

		}

		public PluginParameter nextParameter() {
			if ((linkobject != null && newSource != null) || nextp == DONE) {
				return null;
			} else if (nextp == CONTEXT) {
				return contextParameter();
			} else if (nextp == OBJECT) {
				return objectParameter();
			} else if (nextp == ELEMENT) {
				return elementParameter();
			}

			return null; // be happy compiler.
		}

		private PluginParameter objectParameter() {
			return new PluginParameter(PluginParameter.CARDINALITY_ONE,
					"Select the link whose ends should be changed",
					PluginParameter.OMEObjectType);
		}

		private PluginParameter contextParameter() {
			return new PluginParameter(PluginParameter.CARDINALITY_ONE, null,
					PluginParameter.OMEContextType);
		}

		private PluginParameter elementParameter() {
			return new PluginParameter(PluginParameter.CARDINALITY_ONE, null,
					PluginParameter.OMEElementType);
		}

		public void invoke() {

			GraphicViewLink gvl = (GraphicViewLink) linkobject;

			if (newSource != null) {

				GraphicViewObject source = (GraphicViewObject) gvl.getFrom();
				GraphicViewObject dest = (GraphicViewObject) gvl.getTo();

				// the changed link will NOT change its type
				Object type = linkobject.getType();

				if (newSource != source && newSource != dest) {

					view.createLink(type, newSource.getModelObject(), dest
							.getModelObject());
					view.deleteLink(gvl);

				} else if (newSource == source) {
					//throw up a helpful `Please select a new source` message
					JOptionPane.showMessageDialog(null,
							(Object) "Please select a new source",
							"Change Link Ends Warning",
							JOptionPane.WARNING_MESSAGE);
				} else if (newSource == dest) {

					//throw up a helpful `Please don't connect to itself`
					// message
					JOptionPane.showMessageDialog(null,
							(Object) "Please don't connect to itself",
							"Change Link Ends Warning",
							JOptionPane.WARNING_MESSAGE);

				}

			} //if (newDest != null)

			resetMethod();

		}

		protected void resetMethod() {
			nextp = CONTEXT;
			linkobject = null;
			newSource = null;
		}

		public void cancelled() {
			linkobject = null;
			nextp = CONTEXT;
			newSource = null;
		}

		public boolean isEnabled(ViewContext con) {
			ViewObject vo = con.associatedObject();
			return ((vo != null) && (vo instanceof ViewLink));
		}

	}

    public class ChangeLinkTypeMethod extends AbstractPluginMethod {

		/**
		 * 
		 * @uml.property name="linkobject"
		 * @uml.associationEnd multiplicity="(0 1)"
		 */
		private ViewObject linkobject;

		private Object type;

		private final int CONTEXT = 1;

		private final int OBJECT = 4;

		private final int DONE = 367;

		private int nextp = CONTEXT;

		public ChangeLinkTypeMethod(View view) {
			this.view = view;
		}

		public String getName() {
			return "Change Link Type";
		}

		public void passParameter(Collection c) {
			if (nextp == CONTEXT) {
				ViewContext con = (ViewContext) c.iterator().next();
				if (con.associatedObject() != null) {
					linkobject = con.associatedObject();
					nextp = DONE;
				} else {
					nextp = OBJECT;
				}
			} else if (nextp == OBJECT) {
				linkobject = (ViewObject) c.iterator().next();
				nextp = DONE;
			}
		}

		public PluginParameter nextParameter() {
			if (linkobject != null || nextp == DONE) {
				return null;
			} else if (nextp == CONTEXT) {
				return contextParameter();
			} else if (nextp == OBJECT) {
				return objectParameter();
			}
			return null; // be happy compiler.
		}
	    public static final String DEFAULTNAME = "defaultname";

		public void invoke() {
			OMEFramework fw = view.getModel().getFramework();
			// Create the choices
			Iterator i = fw.getAllInstantiable();
			Vector v = new Vector();
			while (i.hasNext()) {
				Choice c = new Choice();
				Object objecttype = (Object) i.next();
				if (fw.isLink(objecttype)) {
					String name = fw.getName(objecttype);
					c.setName(name);
					c.setChoiceObject(fw.getType(name));
					v.add(c);
				}
			}
			// Show the dialogue to get the type.
			RadioButtonChooser rbc = new RadioButtonChooser(null,
					"Change Link Type To:", true, v);
			if (rbc.showDialog() == RadioButtonChooser.CONTINUE) {
				Iterator it = v.iterator();
				// get the choice
				while (it.hasNext()) {
					Choice c = (Choice) it.next();
					if (c.chosen()) {
						type = c.choiceObject();
					}
				}
				// and go
				if (type != null) {
					try {
						linkobject.setType(type);
						String defaultname = ""+((TelosParserIndividual)type).directAttributes(DEFAULTNAME)[0].to();
						linkobject.setName(defaultname);
					} catch (Exception e) {
						e.printStackTrace();
					}
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
			//super.resetMethod();
		}

		public void cancelled() {
			linkobject = null;
			nextp = CONTEXT;
		}

		public boolean isEnabled(ViewContext con) {
			ViewObject vo = con.associatedObject();
			return ((vo != null) && (vo instanceof ViewLink));
		}

		private PluginParameter objectParameter() {
			return new PluginParameter(PluginParameter.CARDINALITY_ONE,
					"Select the link whose type should be changed",
					PluginParameter.OMEObjectType);
		}

		private PluginParameter contextParameter() {
			return new PluginParameter(PluginParameter.CARDINALITY_ONE, null,
					PluginParameter.OMEContextType);
		}
	}

///**
// * Yijun: The method to print the canvas
// */
//	private class PrintMethod extends AbstractPluginMethod {
//		public PrintMethod(View view) {
//			this.view = view;
//		}
//		// Added by Zhifeng Liu(Jul 2004)
//		public int getMnemonic() {
//			return 'P';
//		}
//		public int getDisplayedMnemonicIndex() {
//			return -1;
//		}
//		public String getName() {
//			return "Print...";
//		}
//		public void invoke() {
//	        PrinterJob printJob = PrinterJob.getPrinterJob();
//	        printJob.setPrintable(((GraphicView) view).getGraphicViewCanvas());
//	        if (printJob.printDialog()) {
//	            try {
//	                printJob.print();
//	            } catch (Exception ex) {
//	                ex.printStackTrace();
//	            }
//	        }			
//		}
//	}

	/**
	 * The method to hide an object.
	 */
	class HideMethod extends ObjectMethod {
		View view;
		public HideMethod(View v) {
			super(v);
			view = v;
			name = "Hide Selected Objects";
		}
		public void operate(ViewObject vo) {			
			for (Iterator i = ((GraphicView)view).getAllObjects(); i.hasNext(); ) {
				ViewObject o = (ViewObject) i.next();
				if (o.isSelected()) {
					o.setHidden(true);
					o.setSelected(false);
				}
			}
 		}
	}

/**
 * This method unhides all objects
 */
	class UnhideAllMethod extends AbstractPluginMethod {
		public UnhideAllMethod(View view) {
//			this.view = view;
		}
		public int getMnemonic() {
			return 'U';
		}
		public String getName() {
			return "Unhide all";
		}
		public void invoke() {
			Iterator i;
			i = getAllObjects();
			while (i.hasNext()) {
				((ViewObject) i.next()).setHidden(false);
			}
		}
		public boolean isEnabled(ViewContext con) {
			Iterator i;
			i = getAllObjects();
			while (i.hasNext()) {
				if (((ViewObject) i.next()).isHidden())
					return true;
			}
			return false;
		}
		private Iterator getAllObjects() {
			LinkedList ll = new LinkedList();
			ll.addAll(view.getAllElements());
			ll.addAll(view.getAllLinks());
			return ll.iterator();
		}
	}
	void hide_selected(View view) {
		Iterator i;
		i = ((GraphicView)view).getAllObjects();
		while (i.hasNext()) {
			ViewObject o = (ViewObject) i.next();
			o.setHidden(!o.isSelected() && o instanceof GraphicViewElement 
					&& !((GraphicViewElement)o).isExpandable());
		}		
	}
	class HideUnselectedMethod extends AbstractPluginMethod {
		View view;
		public HideUnselectedMethod(View view) {
			this.view = view;
		}
		public int getMnemonic() {
			return 'H';
		}
		public String getName() {
			return "Hide unselected elements";
		}
		public void invoke() {
			hide_selected(view);
		}
		public boolean isEnabled(ViewContext con) {
			Iterator i;
			i = ((GraphicView)view).getAllObjects();
			while (i.hasNext()) {
				if (!((ViewObject) i.next()).isSelected())
					return true;
			}
			return false;
		}
	}
	
    class RemoveAttributeSubmenu extends AbstractPluginMethod {

		public RemoveAttributeSubmenu(View view) {
			this.view = view;
		}

		public String getName() {
			return "Remove a Symbolic Attribute";
		}

		public boolean isEnabled(ViewContext ovc) {
			ViewObject vo = ovc.associatedObject();
			if (vo != null) {
				ModelObject mo = vo.getModelObject();
				Iterator i = mo.getAttributes();
				while (i.hasNext()) {
					ModelAttribute att = (ModelAttribute) i.next();
					if (att.getTarget() != null) {
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
				LinkedList list = new LinkedList();
				Iterator i = mo.getAttributes();
				while (i.hasNext()) {
					ModelAttribute att = (ModelAttribute) i.next();
					if (att.getTarget() != null) {
						list.add(new RemoveAttribute(att));
					}
				}
				return list;
			}
			return null;
		}
	}

    class RemoveAttribute extends AbstractPluginMethod {

		/**
		 * 
		 * @uml.property name="att"
		 * @uml.associationEnd multiplicity="(0 1)"
		 */
		ModelAttribute att;

		public RemoveAttribute(ModelAttribute att) {
			this.att = att;
		}

		public void invoke() {
			att.clearTarget();
		}

		public String getName() {
			return model.getFramework().getName(att.getTarget());
		}

		public Image getImage() {
			return model.getFramework().getImage(att.getTarget());
		}
	}

    class AddAttributeSubmenu extends AbstractPluginMethod {

		public AddAttributeSubmenu(View view) {
			this.view = view;
		}

		public String getName() {
			return "Add a Symbolic Attribute";
		}

		public boolean isEnabled(ViewContext ovc) {
			ViewObject vo = ovc.associatedObject();
			if (vo != null) {
				ModelObject mo = vo.getModelObject();
				if (mo.getAttributes().hasNext())
					return true;
			}
			return false;
		}

		public Collection getSubmenu(ViewContext ovc) {
			ViewObject vo = ovc.associatedObject();
			if (vo != null) {
				ModelObject mo = vo.getModelObject();
				LinkedList list = new LinkedList();
				Iterator i = mo.getAttributes();
				while (i.hasNext()) {
					//D.o(" Are we finding any attributes? yes...");
					ModelAttribute att = (ModelAttribute) i.next();
					list.add(new AddAttributeSubsubmenu(att, view));
					//list.add(new
					//	    AddAttribute(att,att.getPossibleTargets().next()));
				}
				return list;
			}
			return null;
		}
	}

    class AddAttributeSubsubmenu extends AbstractPluginMethod {

		ModelAttribute att;

		public AddAttributeSubsubmenu(ModelAttribute att, View view) {
			this.att = att;
			this.view = view;
		}

		public String getName() {
//			D.o(att.getName());
			return att.getName();
		}

		public boolean isEnabled(ViewContext ovc) {
			return true;
		}

		public Collection getSubmenu(ViewContext ovc) {
			ViewObject vo = ovc.associatedObject();
			if (vo != null) { // how couldit be if we got created?
				LinkedList list = new LinkedList();
				Iterator i = att.getPossibleTargets();
				while (i.hasNext()) {
					list.add(new AddAttribute(att, view, i.next()));
				}
				return list;
			}
			return null;
		}
	}

//private class AddAttribute extends AbstractPluginMethod {
//
//		/**
//		 * 
//		 * @uml.property name="att"
//		 * @uml.associationEnd multiplicity="(0 1)"
//		 */
//		ModelAttribute att;
//
//		Object target;
//
//		public AddAttribute(ModelAttribute att, Object target) {
//			this.att = att;
//			this.target = target;
//		}
//
//		public void invoke() {
//			att.setTarget(target);
//		}
//
//		public String getName() {
//			return model.getFramework().getName(target);
//		}
//
//		public Image getImage() {
//			return model.getFramework().getImage(target);
//		}
//
//	}
 class AddAttribute extends AbstractPluginMethod {
		/**
		 * 
		 * @uml.property name="att"
		 * @uml.associationEnd multiplicity="(0 1)"
		 */
		ModelAttribute att;

		Object target;

		public AddAttribute(ModelAttribute att, View view, Object target) {
			this.att = att;
			this.target = target;
			this.view = view; 
		}

		public void invoke() {
			att.setTarget(target);		
			Collection c = ((GraphicView) view).getSelectedElements();
		    for (Iterator i = c.iterator(); i.hasNext(); ) {
		    	GraphicViewElement o = (GraphicViewElement) i.next();
		    	ModelAttribute a = o.getModelElement().getAttribute(att.getName());
		    	a.setTarget(target);
		    	D.o(getName());
				float sd[] = labelNameToSD(getName());
                D.o("" + sd[0] + sd[1]);
				((TelosElement)o.getModelElement()).setSat(sd[0]);
				((TelosElement)o.getModelElement()).setDen(sd[1]);
		    }
		}

		private float[] labelNameToSD(String string) {
			float s = 0, d = 0;
			if(string.equals("i* Conflict")) {
				s = 1; 
				d = 1;
			}
			else if(string.equals("i* Weakly Satisficed")) {
				s = 0.5f; 
				d = 0;
			}
			else if(string.equals("i* Satisficed")) {
				s = 1;
				d = 0;
			}
			else if(string.equals("i* Weakly Denied")) {
				s = 0;
				d = 0.5f;
			}
			else if(string.equals("i* Undecided")) {
				s = 0;
				d = 0;
			}
			else if(string.equals("i* Denied")) {
				s = 0;
				d = 1;
			}
			float sd [] = new float[2];
			sd[0] = s;
			sd[1] = d;
			return sd;
		}

		public String getName() {
			return model.getFramework().getName(target);
		}

		public Image getImage() {
			return model.getFramework().getImage(target);
		}

	}

	class SearchMethod extends AbstractPluginMethod {

		public SearchMethod(View view) {
			this.view = view;
		}

		public int getMnemonic() {
			return 'S';
		}

		/*
		 * Don't need to update this method since because we wish the default
		 * character to be underlined.
		 */
		public int getDisplayedMnemonicIndex() {
			return -1;
		}

		public String getAcceleratorStr() {
			return "/";
		}

		public String getName() {
			return "Search";
		}

		public Image getImage() {
			// Plugins shouldn't know about directory images!
			ImageIcon ic = new ImageIcon(this.getClass().getResource(
					"/resources/search.png"));
			return ic.getImage();
		}

		public void invoke() {
			((GraphicView) view).findObject();
		}

	}
 
 
	// This private class is added by Zhifeng Liu(Jul 2004)

/**
 * The method to "Copy" an object.
 */

	class CopyMethod extends AbstractPluginMethod {
		public CopyMethod(View view) {
			this.view = view;
		}
		public int getMnemonic() {
			return 'C';
		}
		/*
		 * Don't need to update this method since because we wish the default
		 * character to be underlined.
		 */
		public int getDisplayedMnemonicIndex() {
			return -1;
		}
		public String getAcceleratorStr() {
			return "ctrl+C";
		}
		public String getName() {
			return "Copy";
		}
		public Image getImage() {
			// Plugins shouldn't know about directory images!
			ImageIcon ic = new ImageIcon(this.getClass().getResource(
					"/resources/copy.gif"));
			return ic.getImage();
		}
		public boolean isEnabled(ViewContext con) {
			return !(view.getSelectedLinks().isEmpty() && view.getSelectedElements().isEmpty());			
		}
		public void invoke() {
			((GraphicView) view).copyMethod();
		}
	}

	// This private class is added by Zhifeng Liu(Jul 2004)

/**
 * The method to "Cut" an object.
 */

	private class CutMethod extends AbstractPluginMethod {

		public CutMethod(View view) {
			this.view = view;
		}

		public int getMnemonic() {
			return 'T';
		}
		public boolean isEnabled(ViewContext con) {
			return !(view.getSelectedLinks().isEmpty() && view.getSelectedElements().isEmpty());
		}
		/*
		 * Don't need to update this method since because we wish the default
		 * character to be underlined.
		 */
		public int getDisplayedMnemonicIndex() {
			return -1;
		}

		public String getAcceleratorStr() {
			return "ctrl+X";
		}

		public String getName() {
			return "Cut";
		}

		public Image getImage() {
			// Plugins shouldn't know about directory images!
			ImageIcon ic = new ImageIcon(this.getClass().getResource(
					"/resources/cut.gif"));
			return ic.getImage();
		}

		public void invoke() {
			((GraphicView) view).cutMethod();
		}
	}

	// This private class is added by Zhifeng Liu(Jul 2004)

/**
 * The method to "Paste" an object.
 */

	private class PasteMethod extends AbstractPluginMethod {

		public PasteMethod(View view) {
			this.view = view;
		}

		public int getMnemonic() {
			return 'P';
		}

		/*
		 * Don't need to update this method since because we wish the default
		 * character to be underlined.
		 */
		public int getDisplayedMnemonicIndex() {
			return -1;
		}

		public String getAcceleratorStr() {
			return "ctrl+V";
		}

		public String getName() {
			return "Paste";
		}

		public Image getImage() {
			// Plugins shouldn't know about directory images!
			ImageIcon ic = new ImageIcon(this.getClass().getResource(
					"/resources/paste.gif"));
			return ic.getImage();
		}
		public boolean isEnabled(ViewContext con) {
			return ((GraphicView) view).Pastable(); 
		}
		public void invoke() {
			((GraphicView) view).pasteMethod();
		}
	}

	//added by Zhifeng Liu Jul 2004

/**
 * The method to "New"(create) the model and its views.
 */
	public static URL u;
	/**
	 * @param file
	 * @return the content of the file
	 */
	private static String get_file_contents(String modelfile) {
		String string = "";
		try {
			BufferedReader br = null;
			String m = System.getProperty("java.library.path");
			if (m!=null) {
				FileReader fr = new FileReader(modelfile);
				br = new BufferedReader(fr);
				try {
					String s = null;
					do {
						if (s!=null)
							string += "\n";
						s = br.readLine();
						if (s!=null)
							string += s;
					} while (s!=null);
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return string;
	}

	private class NewMethod extends AbstractPluginMethod {

		private GraphicViewCanvas gvc;

		public NewMethod(View view) {
			this.view = view;
		}

		// Added by Zhifeng Liu(Jul 2004)
		public int getMnemonic() {
			return 'N';
		}

		public int getDisplayedMnemonicIndex() {
			return -1;
		}

		public String getAcceleratorStr() {
			return "ctrl+N";
		}

		public String getName() {
			return "New";
		}

		public Image getImage() {
			// Plugins shouldn't know about directory images!
			ImageIcon ic = new ImageIcon(this.getClass().getResource(
					"/resources/file_new.gif"));
			return ic.getImage();
		}

		public void invoke() {
			ModelManager mm = model.getModelManager();
			mm.closeModel(model);
			Collection c = mm.getFrameworkChoices();
			// create a dialog requesting information about new model
			gvc = ((GraphicView) view).getGraphicViewCanvas();
			NewModelInfo modelinfo = new NewModelInfo(gvc, c);
			// display the dialog
			if (modelinfo.showDialog() == ContinueCancelDialog.CANCEL) {
			    return;
			}
			File f = gvc.getSaveFileAndDirectory("tel");
			if (f == null) {
				// Do nothing, user must have changed her mind.
			} else {
				String str = "";
				for (Iterator i = c.iterator(); i.hasNext(); ) {
					Choice choice = (Choice) i.next();
					if (choice.chosen())
						str += get_file_contents(System.getProperty("java.library.path") + File.separator + choice.getName() + ".tel");
				}
				if (str.equals("")) {
					D.o("Warning: no framework chosen!");
				} else {
					PrintStream out;
					try {
						out = new PrintStream(new FileOutputStream(f));
						out.print(str);					
						System.setProperty("model", f.getAbsolutePath());
						if (OMETab.ot==null)
							OMETab.ot = new OMETab();
						OMETab.ot.initialize();
					} catch (FileNotFoundException e) {
						e.printStackTrace();
					}					
				}
		    }  	  			
		}
	}

	/**
	 * Bottom-up reasoning method
	 */
	private class ReasoningMethod extends AbstractPluginMethod {
		public ReasoningMethod(View view) {
		}
		public int getMnemonic() {
			return 'R';
		}
		public String getName() {
			return "Reasoning: Bottom-up Label Propagation";
		}
		Image img =
			new ImageIcon(this.getClass().getResource(
			"/resources/bottom-up.gif")).getImage();
		public Image getImage() {
			return img;			
		}
		public void invoke() {
			ModelManager mm = model.getModelManager();
			try {
				mm.saveModelToDat((TelosModel) model, new File(Computing.getTempFilename("temp.dat")));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	/**
	 * Top-down reasoning method
	 */
	private class SATReasoningMethod extends AbstractPluginMethod {
		public SATReasoningMethod(View view) {
		}
		public int getMnemonic() {
			return 'S';
		}
		public String getName() {
			return "Reasoning: Top-Down using SAT Solver";
		}
		Image img =
			new ImageIcon(this.getClass().getResource(
			"/resources/top-down.gif")).getImage();
		public Image getImage() {
			return img;			
		}
		public void invoke() {
			ModelManager mm = model.getModelManager();
			try {
				mm.saveModelToSat((TelosModel) model, new File("temp.sat"));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
