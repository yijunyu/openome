package edu.toronto.cs.ome.humaninterventionreasoning;

import edu.toronto.cs.ome.model.TelosElement;
import edu.toronto.cs.ome.model.TelosModel;
import edu.toronto.cs.ome.view.ImageTable;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Vector;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;


/*import edu.toronto.cs.ome.plugins.NFRPropogator.Impact;
import edu.toronto.cs.ome.plugins.NFRPropogator.bagDialog.LabelButtonListener;
import edu.toronto.cs.ome.plugins.NFRPropogator.bagDialog.LabelButtonPanel;
import edu.toronto.cs.ome.plugins.NFRPropogator.bagDialog.WeakButtonListener;
import edu.toronto.cs.ome.plugins.NFRPropogator.bagDialog.cancelButtonListener;
import edu.toronto.cs.ome.view.ImageTable;
import edu.toronto.cs.util.D;*/

/**
 * @author  jenhork
 */
public class HumanInterventionDialog extends JDialog{

	private static final long serialVersionUID = 1L;

	static final int iconheight = 20;
 
	TelosModel model; 
	TelosElement element;
	EvaluationLabel choice;
	
	public HumanInterventionDialog(TelosModel m, TelosElement ele) {
	    // Create the dialogue itself.
	    super();
	    model = m;
	    element = ele;
	    choice = new EvaluationLabel("empty");
	    
	    updateHumanInterventionDialog();
	       
	}
	
	/** The contributing impacts for mo can change while the dialog is up.
	 *  This method updates the dialogue to reflect the new changes. */
	public void updateHumanInterventionDialog() {
	   
		JPanel contentpane = new JPanel();
	    setContentPane(contentpane);
	    
	    contentpane.setLayout(new BoxLayout(contentpane,
			BoxLayout.Y_AXIS));
	    
	    setTitle("Evaluation Label Judgment");
	    contentpane.setBorder(BorderFactory.createEmptyBorder(
			10,10,10,10));

	    // Add weakImpactResolutionPanel
	    getContentPane().add(makePanel1());
	    
	    // Put some space between the panels
	    getContentPane().add(Box.createRigidArea(new Dimension(0,20)));
	    getContentPane().add(Box.createVerticalGlue());
	}
	
	private JPanel makePanel1() {
	//	    Border ugly = BorderFactory.createLineBorder(Color.blue);
	    
	    JPanel jp = new JPanel();
	    jp.setLayout(new BoxLayout(jp,BoxLayout.Y_AXIS));
	    jp.setBorder(BorderFactory.createEtchedBorder());
	
	   	
	    // Explain the purpose of this panel.
	    jp.add(Box.createRigidArea(new Dimension(0,5)));
	    JLabel step = new JLabel("Evaluation Label Bag for " + element.getName());
	    step.setFont(jp.getFont().deriveFont(Font.BOLD));
	    jp.add(makeLeftPanel(step,5));
	    JLabel instructions = new JLabel("Determine the final label.");
	    jp.add(makeLeftPanel(instructions,10));
	    
	    // Add the panel showing the weak impacts.
	    jp.add(Box.createRigidArea(new Dimension(0,10)));
	    JPanel impactpanel = makeImpactPanel();
	    impactpanel.setAlignmentX(CENTER_ALIGNMENT);
	    impactpanel.setBorder(BorderFactory.createLoweredBevelBorder());
	    jp.add(impactpanel);
	
	    EvaluationLabel label = new EvaluationLabel("empty");
	    String [] labels = label.getStringValues();
	    
	    // Add the button panel to resolve these impacts.
	    jp.add(Box.createRigidArea(new Dimension(0,5)));
	    JLabel buttontitle = new JLabel("Set final label to: "); 
	    LabelButtonPanel buttonpanel = new LabelButtonPanel(labels);
	    buttonpanel.setAlignmentX(CENTER_ALIGNMENT);
	    buttontitle.setAlignmentX(LEFT_ALIGNMENT);
	    
	    jp.add(buttontitle);
	    jp.add(buttonpanel);
	    //jp.add(Box.createRigidArea(new Dimension(0,5)));
	
	    // Resolving weak impacts should lead to a weak impact.
	   // buttonpanel.disableWeakButtons();
	
	    // If we have no weak impacts, disable the whole bar.
	    /*if (!havesome) {
		buttonpanel.disableAllButtons();
	    } else {*/
	    
	  
	    
		// Otherwise, hook-up the buttons
		for (int i = 0; i<labels.length; i++) {
		    buttonpanel.getButton(labels[i]).addActionListener(
			    new LabelButtonListener(labels[i]));
		}
	   // }
	
	    // Display our recommended label, and add buttons to accept this
	    // recommendation or cancel out entirely.
	    jp.add(makeCurrentSelectionPanel());
	    
	    return jp;
	}
	
	
	/** Returns a panel displaying the recommended label setting, and
	 *  buttons to accept this recommendation, or quit out of the dialogue
	 *  altogether.*/
	private JPanel makeCurrentSelectionPanel() {
	    // Find our recomenndation.
		Vector wholebag = new Vector();
	    //wholebag.addAll(weakbag);
	    //wholebag.addAll(nonweakbag);
	    Object rectype = new Object(); //getRecommendedLabel(wholebag);
	
	    // Make our panel.
	    JPanel recpanel = new JPanel();
	    recpanel.setLayout(new BoxLayout(recpanel,BoxLayout.X_AXIS));
	    
	    // The panel to show our recommendation
	    JPanel displayrec = new JPanel();
	    displayrec.setLayout(new BoxLayout(displayrec,BoxLayout.X_AXIS));
	    JLabel rectitle = new JLabel("Chosen label: ");
	    //ImageIcon icon = new ImageIcon(getLabelImage(rectype,40));
	    //ImageIcon icon = new ImageIcon();
	    JLabel recim = new JLabel(choice.getShortName());
	    if (choice.Empty()) {
	    	recim = new JLabel("None");
	    }	    
	    displayrec.add(rectitle);
	    displayrec.add(Box.createHorizontalGlue());
	    displayrec.add(recim);
	
	    // The button panel
	    JPanel buttonpanel = new JPanel();
	    buttonpanel.setLayout(new BoxLayout(buttonpanel,BoxLayout.Y_AXIS));
	    JButton acceptbutton = new JButton("Accept");
	    acceptbutton.addActionListener(new AcceptButtonListener());
	    JButton cancelbutton = new JButton("Cancel");
	    cancelbutton.addActionListener(new cancelButtonListener());
	    // Make the accept button as big as the cancel button.
	    acceptbutton.setPreferredSize(cancelbutton.getMaximumSize());
	    acceptbutton.setMaximumSize(cancelbutton.getMaximumSize());
	    buttonpanel.add(acceptbutton);
	    buttonpanel.add(cancelbutton);
	
	    // Add all the panels.
	    recpanel.add(displayrec);
	    recpanel.add(Box.createHorizontalGlue());
	    recpanel.add(buttonpanel);
	
	    return recpanel;
	}
	
	
	/** This returns the panel that gives a visual representation of the
	 *  supplied collection of "impact pairs". */
	private JPanel makeImpactPanel() {
	
	    final int spacerwidth = 30;//64;
	    final int spacerheight = 10;
	    
	    // Initial panel creation
	    JPanel jp = new JPanel();
	    jp.setLayout(new BoxLayout(jp,BoxLayout.Y_AXIS));
	
	    // Add header panel
	    JPanel headerpanel = new JPanel();
	    headerpanel.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
	    headerpanel.setLayout(new BoxLayout(headerpanel,BoxLayout.X_AXIS));
	    JLabel impactheader = new JLabel("Evaluation Label");
	    impactheader.setFont(jp.getFont().deriveFont(Font.BOLD));
	    JLabel sourceheader = new JLabel("Source");
	    sourceheader.setFont(jp.getFont().deriveFont(Font.BOLD));
	    headerpanel.add(impactheader);
	    headerpanel.add(Box.createHorizontalGlue());
	    headerpanel.add(Box.createRigidArea(new Dimension(spacerwidth,0)));
	    headerpanel.add(sourceheader);
	    jp.add(headerpanel);
	    jp.add(Box.createRigidArea(new Dimension(0,spacerheight)));
	
	    // Add list of impacts panel
	    JPanel listpanel = new JPanel();
	    jp.add(listpanel);
	    listpanel.setLayout(new BoxLayout(listpanel,BoxLayout.Y_AXIS));
	    
	    EvaluationLabelBag bag = element.getLabelBag();
	    
	    Iterator i = bag.iterator();
	   if (i.hasNext()) {
		while (i.hasNext()) {
		    JPanel itempanel = new JPanel();
		    itempanel.setBorder(BorderFactory.createEmptyBorder(0,10,1,10));
		    itempanel.setLayout(new BoxLayout(itempanel,BoxLayout.X_AXIS));
	
		    Object [] tuple  = (Object[]) i.next();
		    JLabel imlabel = 
		    	new JLabel(((EvaluationLabel) tuple[0]).getShortName());
		    JLabel sourcelabel = new JLabel(((TelosElement) tuple[1]).getName());
		    itempanel.add(imlabel);
		    itempanel.add(Box.createHorizontalGlue());
		    itempanel.add(Box.createRigidArea(new Dimension(spacerwidth,0)));
		    itempanel.add(sourcelabel);
		    listpanel.add(itempanel);
		}
	    } else {
		// We have no impacts for this panel, say so.
		JPanel itempanel = new JPanel();
		itempanel.setLayout(new BoxLayout(itempanel,BoxLayout.X_AXIS));
		JLabel nonelabel = new JLabel("None");
		JLabel nalabel = new JLabel("N/A");
		itempanel.add(nonelabel);
		itempanel.add(Box.createHorizontalGlue());
		itempanel.add(nalabel);
		listpanel.add(itempanel);
	    }
	
	    return jp;
	}

	
	/** Returns a panel that will be "growable", but will display the
	 *  supplied component inset to the amount specified. */
	private JPanel makeLeftPanel(JComponent comp, int offset) {
	    JPanel leftpanel = new JPanel();
	    leftpanel.setLayout(new BoxLayout(leftpanel,BoxLayout.X_AXIS));
	    leftpanel.add(Box.createRigidArea(new Dimension(offset,0)));
	    leftpanel.add(comp);
	    leftpanel.add(Box.createHorizontalGlue());
	    return leftpanel;
	}
	
	/** Returns a small image for the impact of the given impact. */ 
	/*private Image getImpactIcon(Impact impact) {
	    ImageTable it = model.getFramework().getImageTable();
	    //Image im = impact.getImage();
	    Image im = new Image();
	    return it.getSizing(im,0,iconheight);
	}*/
	
	/** Returns a small image for the given softgoal label. */
	/*private Image getLabelImage(Object type) {
	    ImageTable it =
		modelobject.getModel().getFramework().getImageTable();
	    Image im = modelobject.getModel().getFramework().getImage(type);
	    return it.getSizing(im,0,iconheight);
	    
	    return getLabelImage(type,iconheight);
	}*/
	
	/** Returns an image for the given softgoal label of the specified
	 *  height. */
	/*private Image getLabelImage(Object type, int height) {
	    ImageTable it =
		modelobject.getModel().getFramework().getImageTable();
	    Image im = modelobject.getModel().getFramework().getImage(type);
	    return it.getSizing(im,0,height);
	}*/
	
	
	/** This class provides a button panel with a button for each softgoal
	 *  label, and provides access to each of those buttons. */
	private class LabelButtonPanel extends JPanel {
	
		private static final long serialVersionUID = 1L;
		private HashMap types2buttons;
	    
	    public LabelButtonPanel(String [] labels) {
		super();
	
		types2buttons = new HashMap();
		
		this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
		
		// Create the buttons.
		for (int i = 0; i < labels.length; i++) {
		    JButton j = new JButton(labels[i].replaceFirst("IStar", "").replaceAll("ElementLabel", ""));
		    add(j);
		    types2buttons.put(labels[i],j);
		}
	    }
	
	    public void disableAllButtons() {
		/*for (int i = 0; i < labeltypes.length; i++) {
		    JButton j = (JButton)types2buttons.get(labeltypes[i]); 
		    j.setEnabled(false);
		}*/
	    }
	
	    public void disableWeakButtons() {
		/*((JButton)types2buttons.get(weakplus)).setEnabled(false);
		((JButton)types2buttons.get(weakminus)).setEnabled(false);*/
	    }
	
	    public JButton getButton(String type) {
	    	return (JButton)types2buttons.get(type);
	    }
	}
	
	
	
	/** This be the class hooked on to the buttons used to the set the label
	 *  for mo. */
	private class LabelButtonListener implements ActionListener{
	
	    String label;    // The type associated with this button.
	
	    public LabelButtonListener(String label) {
	    	this.label = label;
	    }
	    
	    public void actionPerformed(ActionEvent e) {
	    	choice = new EvaluationLabel(label);
	    	updateHumanInterventionDialog();
	    	//dispose();  // Close the dialog.
	    }
	}
	    
	/** Cancel button adapter, closes the dialogue.*/    
	private class cancelButtonListener implements ActionListener {
	
	    public void actionPerformed(ActionEvent e) {
		
	    	dispose();  // Close the dialog.
	    }
	}
	
	/** Cancel button adapter, closes the dialogue.*/    
	private class AcceptButtonListener implements ActionListener {
	
	    public void actionPerformed(ActionEvent e) {
	    	element.setEvalLabel(choice);
	    	dispose();  // Close the dialog.
	    }
	}
	
}
	
