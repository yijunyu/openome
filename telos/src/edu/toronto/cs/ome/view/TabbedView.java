package edu.toronto.cs.ome.view;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTable;


/**
 * The frame window for the tabbed view. *  It creats the frame, with a tabbed view inside. *  *  * This code is not used currently, but it represents an implementation of stuff * that we will likely want to do again someday. We will surely want to rewrite * it, but it will be useful to look at. *  *  @author Ying Shi *  @version 28 Aug 1998 *  *  @see GraphicViewCanvas *  @see TreeViewCanvas
 */

class TabbedView extends JFrame { 
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	/** Constructs the frame.
     *
     *  @param gv    the <code> GraphicViewCanvas </code> which the tabbed view
     *		   is belonged to.
     */
    public TabbedView(GraphicViewCanvas gv) {
	
	super("Tabbed View");
	setSize(500, 300);
	
	this.gvc = gv;
	
	WindowListener l = new WindowAdapter() {
	    public void windowClosing(WindowEvent e ) {
		dispose();
	    }
	};
	addWindowListener(l);

	JTabbedPane tabbedPane = new JTabbedPane();
	
	panel1 = makeTextPanel();
	tabbedPane.addTab("Property", null, panel1, "Property");
	tabbedPane.setSelectedIndex(0);

	panel2 = new TreeViewCanvas(gvc);
	tabbedPane.addTab("Tree View", null, panel2, "Tree View");

	panel3 = new JTable(20, 10);
	tabbedPane.addTab("Matrix View", null, panel3, "Matrix View");

	panel4 = makeTextPanel();
	tabbedPane.addTab("Telos View", null, panel4, "Telos View");

	panel5 = makeTextPanel();
	tabbedPane.addTab("Alternative", null, panel5, "Alternative");

	getContentPane().setLayout(new GridLayout(1,1));
	getContentPane().add(tabbedPane);
	
    }

    JPanel panel1;
    JPanel panel4;
    JPanel panel5;

	/**
	 * 
	 * @uml.property name="panel2"
	 * @uml.associationEnd multiplicity="(0 1)"
	 */
	TreeViewCanvas panel2;

    JTable panel3;
    

    /** Refreshes the views according to the data from <code> GraphicViewCanvas
     *  </code>.
     */
    public void refresh() {
	panel2.refresh();
	repaint();
    }

	/**
	 * 
	 * @uml.property name="gvc"
	 * @uml.associationEnd multiplicity="(0 1)"
	 */
	GraphicViewCanvas gvc;

    

    /** Creates a text panel. */
    private JPanel makeTextPanel() {
	JPanel panel = new JPanel(false);
	return panel;
    }

}
