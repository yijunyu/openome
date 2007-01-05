package OME;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollBar;



/** The panel consists of a horizontal scroll bar, a vertical scrool car and a
 *  <code> GraphicViewCanvas </code>.
 *  There is a class <code> ScrollingPane </code> from JDK with similiar
 *  functionalities. But this class (<code> ScrollingPanel </code>) optimizes 
 *  screen redrawing by only drawing the visible elements and links. The drawing
 *  optimization is encapsulated in the <code> GraphicViewCanvas </code> class.
 *
 *  @author Ying Shi
 *  @version 28 Aug 1998
 *
 *  @see OME
 *  @see GraphicViewFrame
 *  @see GraphicViewCanvas
 *
 *  NOTE:  First OME developer to successfully remove ScrollingPanel from the
 *  OME source (to be replaced with a lightweight Swing component) wins a large
 *  cookie.  We believe that the scroll bars in GVC are what cause the "hidden
 *  menu" bug.
 */
class ScrollingPanel extends JPanel {
    
    // A ScrollingPanel, hardwired for DemoCanvas
    JScrollBar sbv; 
    JScrollBar sbh; 
    GraphicViewCanvas mc;
    
    /** Constructs the panel.
     *
     *  We hook ourselves to the following:
     *
     *  @param gv	the graph view data.
     *  @param gframe	the graph view frame window.
     *  @param gvc	the canvas we hook with.
     */
    public ScrollingPanel(GraphicView gv, GraphicViewFrame gframe, 
	    GraphicViewCanvas gvc) {

	D.o("Creating Scrolling panel");
	
	mc = gvc; 

	GridBagLayout gridbag = new GridBagLayout();
	GridBagConstraints c = new GridBagConstraints();
	setLayout(gridbag);
	setBorder(BorderFactory.createEtchedBorder());
		
	c.fill = GridBagConstraints.BOTH;	// Add the canvas
	c.anchor = GridBagConstraints.CENTER;
	c.weightx = 1.0;
	c.weighty = 1.0;
	c.gridwidth = GridBagConstraints.RELATIVE; 
	c.gridheight = GridBagConstraints.RELATIVE;
	gridbag.setConstraints(mc, c);
	add(mc);

	c.fill = GridBagConstraints.VERTICAL;	// Add vertical scrollbar
	c.weightx = 0.0;
	c.weighty = 0.0;
	c.gridwidth = GridBagConstraints.REMAINDER;
	c.gridheight = GridBagConstraints.RELATIVE;
	sbv = new JScrollBar( JScrollBar.VERTICAL, 0, 1, 0, 1 );
	sbv.setBorder(BorderFactory.createLineBorder(Color.gray,1));	
	sbv.setUnitIncrement( 1 );
	sbv.setBlockIncrement( mc.getSize().height );
	gridbag.setConstraints(sbv, c);
	sbv.addAdjustmentListener( new ScrollingPaneAdjustmentAdapter() );
	add(sbv);

	c.fill = GridBagConstraints.HORIZONTAL;	// Add horizontal scrollbar
	c.weightx = 0.0;
	c.weighty = 0.0;
	c.gridwidth = GridBagConstraints.RELATIVE;
	c.gridheight = GridBagConstraints.REMAINDER;
	sbh = new JScrollBar( JScrollBar.HORIZONTAL, 1, 0, 1, 1 );
	sbh.setBorder(BorderFactory.createLineBorder(Color.gray,1));
	sbh.setUnitIncrement( 1 );
	sbh.setBlockIncrement( mc.getSize().width );
	gridbag.setConstraints(sbh, c);
	sbh.addAdjustmentListener( new ScrollingPaneAdjustmentAdapter() );
	add(sbh);

	mc.SetScrollbars( sbv, sbh ); // Hook the scrollbars up with the canvas	
	D.o("Created Scrolling panel");
    }
    
    /** Processes the adjustment events from the two scroll bars. */
    class ScrollingPaneAdjustmentAdapter implements AdjustmentListener {
	public void adjustmentValueChanged(AdjustmentEvent e) {
	    int value = e.getValue();
	    // Synchronizes the GraphicViewCanvas with the scroll bar values.
	    if (e.getAdjustable() == sbv) mc.setSbvValue(value); 
	    else mc.setSbhValue(value);
	    mc.repaint();
	}    
    }

}

