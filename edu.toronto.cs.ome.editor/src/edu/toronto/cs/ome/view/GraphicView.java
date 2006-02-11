/* Revised by Zhifeng Liu Jul-Aug 2004
  Please refer to the added comments for detail
*/
/*
 * GraphicView
 * 
 * Created August 1998 by Joseph Makuch.
 * 
 * copyright: Zhifeng Liu (haha).
 */
package edu.toronto.cs.ome.view;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.io.File;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Vector;

import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import edu.toronto.cs.ome.controller.ModelManager;
import edu.toronto.cs.ome.controller.OMEDefaultPlugin;
import edu.toronto.cs.ome.controller.PluginMethod;
import edu.toronto.cs.ome.model.ModelAttribute;
import edu.toronto.cs.ome.model.ModelElement;
import edu.toronto.cs.ome.model.ModelLink;
import edu.toronto.cs.ome.model.ModelObject;
import edu.toronto.cs.ome.model.OMEFramework;
import edu.toronto.cs.ome.model.OMEModel;
import edu.toronto.cs.ome.model.TelosElement;
import edu.toronto.cs.ome.model.TelosLink;
import edu.toronto.cs.ome.model.TelosModel;
import edu.toronto.cs.ome.model.TwinElemts;
import edu.toronto.cs.ome.model.ViewSerializer;
import edu.toronto.cs.telos.TelosParserIndividual;
import edu.toronto.cs.undo.Undo;
import edu.toronto.cs.util.Computing;
import edu.toronto.cs.util.D;
//added by Zhifeng Aug 2004 to include copy-paste functionality 

// New comment.

/**
 * GraphicView is a graphical view of the model. Model elements are represented
 * by images, model links are represented by lines. This class is used to keep
 * track of various interface states (e.g. which objects are selected, what
 * portion of the model is visible, etc.), and also mapping between the
 * GraphicViewObjects and their associated ModelObjects.
 */

public class GraphicView implements View {
	private String name;
	private String filename = null; //The view's file name.
	GraphicViewCanvas gvc;
	private ImageTable it;
	private int id;
	private OMEModel model;
	private OMEFramework framework;
	private boolean straighten;
	private Collection elements;
	private Collection links;
	private Collection selectedelements;
	private Collection selectedlinks;
	//private Collection expandedelements;
	private Collection expandableelements;
	private Collection visibleelements;
	private Collection visiblelinks;
	private Collection highlighted;
	private Rectangle displaybounds;
	private Rectangle viewbounds;
	boolean viewdirty;
	private Rectangle dirtyrect;
	// Mappings.
	private Map model2viewobjects;
	private Map ids2gves;
	private Map ids2gvls;
	//added by Zhifeng Aug 2004 to include copy-paste functionality 
	private Collection elementsInClipboard ;
    private Collection linksInClipboard;
	private Collection deletingElements;
	private Collection deletingLinks;
    private Collection  elementTwinPairs;
    private Vector dupElets;//These are dulplicates of the coping elements, in case they is deleted before being pasted.
    private Vector dupLinks;

	/**
	 * Contains information about the pair of copying and copied element
	 * 
	
	              
	private class TwinElemts{
	  private GraphicViewElement  original ;
	  private GraphicViewElement  copied  ;
	  
	  public TwinElemts(GraphicViewElement  original,GraphicViewElement  copied) {
	  	this.original=original;
	  	this.copied=copied;
		}
	  public GraphicViewElement getOriginal(){ return original;}
	  public GraphicViewElement getCopied(){ return copied;}
	  
        } */
	/**
	 * Contains information about position, size and ID of element in this
	 * graphic view. Used when serializing the view.
	 */
   
	public class GRecord {
		public int ID;
		public int objecttype;
		public int x;
		public int y;
		public int expanded;
		public int hidden;
		public int highlight;
		public double end1x;
		public double end1y;
		public double start2x;
		public double start2y;
		public double control1x;
		public double control1y;
		public double control2x;
		public double control2y;
		// We should serialize size.
		public double scale = 1.0;
		public int justification = 0; //center by default
		public GRecord() {
		}

		/**
		 * @return
		 * 
		 * @uml.property name="justification"
		 */
		public int getJustification() {
			return justification;
		}

		/**
		 * @param d
		 * 
		 * @uml.property name="justification"
		 */
		public void setJustification(int d) {
			justification = d;
		}

	}
	public class GVERecord extends GRecord {
		public GVERecord() {
			expanded = 1;
			hidden = 0;
			highlight = 0;
			objecttype = 1;
			end1x = 0.0;
			end1y = 0.0;
			start2x = 0.0;
			start2y = 0.0;
			control1x = 0.0;
			control1y = 0.0;
			control2x = 0.0;
			control2y = 0.0;
		}
	}
	public class GVLRecord extends GRecord {
		public GVLRecord() {
			objecttype = 0;
			x = 0;
			y = 0;
			expanded = 1;
			hidden = 0;
			highlight = 0;
		}
	}
	private class DuplicateModelElement {
		Object type;
		String name;
		View.Location  location;		
	}
	private class DuplicateModelLink {
		Object type;
		GraphicViewElement from;
		GraphicViewElement to;
	}
	/** Returns a location */
	public View.Location getDefaultLocation(ModelObject mobject) {
		return null;
	}

	/**
	 * Returns the name of this graphic view. Note that views of a model should
	 * have unique names.
	 * 
	 * @uml.property name="name"
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name of this graphic view.
	 * 
	 * @param n
	 *            the name to be assigned to this graphic view
	 * 
	 * @uml.property name="name"
	 */
	public void setName(String n) {
		name = n;
	}

	/**
	 * Returns the filename associated with this graphic view.
	 * 
	 * @uml.property name="filename"
	 */
	public String getFilename() {
		return filename;
	}

	/**
	 * Sets the filename associated with this graphic view.
	 * 
	 * @param n
	 *            the filename
	 * 
	 * @uml.property name="filename"
	 */
	protected void setFilename(String n) {
		filename = n;
	}

	/**
	 * Returns the model for this graphic view.
	 * 
	 * @uml.property name="model"
	 */
	public OMEModel getModel() {
		return model;
	}

	/** Set the GUI side of this graphic view. */
	/* package */public void setGraphicViewCanvas(GraphicViewCanvas gvc) {
		if (gvc!=null)
			this.gvc = gvc;
	}
	/** Returns the graphic view canvas for this graphic view. */
	public GraphicViewCanvas getGraphicViewCanvas() {
		return gvc;
	}
	/**
	 * Returns the default font for the GraphicView. Gets this information from
	 * the GraphicViewCanvas.
	 */
	public Font getDefaultFont() {
		return gvc.getFont();
	}
	/**
	 * Gets the FontMetrics associated with this view.
	 */
	protected FontMetrics getFontMetrics(Font f) {
		// They really want gvc's FontMetrics.
		return gvc.getFontMetrics(f);
	}
	/**
	 * Set the GUI side of this graphic view.
	 * 
	 * @param c
	 *            the canvas to be assigned to this graphic view
	 */
	/*
	 * public void setCanvas(Canvas c) { canvas = c; }
	 */
	/** Get the GUI side of this graphic view. */
	/*
	 * public Canvas getCanvas() { return canvas; }
	 */
	/**
	 * Returns the unique (within the model) integer Id for this graphic view.
	 * This helps with serialization, preventing name mangling, and the
	 * special-character hazards that entails.
	 */
	public int getID() {
		return id;
	}
	/**
	 * Sets the unique identifier (within this model) for this graphic view.
	 * 
	 * @param the
	 *            integer ID to be assigned to this graphic view
	 */
	public void setID(int id) {
		this.id = id;
	}
	/**
	 * Returns the image that is associated with the given object (for this
	 * View).
	 */
	public Image getImage(Object type) {
		return framework.getImage(type);
	}
	//////////////////////////////////////////////////////////////////////////
	//									    //
	//  (GraphicView)Object creation, deletion, and access. //
	//									    //
	//////////////////////////////////////////////////////////////////////////
	/**
	 * Returns a collection of all the ViewElements within this graphic view.
	 * This collection is writeable.
	 */
	public Collection getAllElements() {
		return elements;
	}
	/**
	 * Returns a collection of all the ViewLinks within this graphic view. This
	 * collection is writeable.
	 */
	public Collection getAllLinks() {
		return links;
	}
	/**
	 * Returns the ViewObjects that are highlighted. This collection is
	 * writeable.
	 */
	public Collection getHighlightedObjects() {
		return highlighted;
	}
	/**
	 * Returns a collection of the selected elements within this graphic view.
	 * This collection is writeable.
	 */
	public Collection getSelectedElements() {
		return selectedelements;
	}
	
	/**
	 * Returns a collection of the selected links withing this graphic view.
	 * This collection is writeable.
	 */
	public Collection getSelectedLinks() {
		return selectedlinks;
	}

	/**
	 * 
	 * @uml.property name="elementsInClipboard"
	 */
	/*Added by Zhifeng Liu Aug 2004*/
	public Collection getElementsInClipboard() {
		return elementsInClipboard;
	}

	/**
	 * 
	 * @uml.property name="linksInClipboard"
	 */
	/*Added by Zhifeng Liu Aug 2004*/
	public Collection getLinksInClipboard() {
		return linksInClipboard;
	}

	
	
	/**
	 * Returns a collection of all the selected elements and links within this
	 * graphic view. This is neither efficient nor permanent. It is been used
	 * like this until we *maintain* a list of these things.
	 */
	public Collection getSelectedObjects() {
		Collection c = new HashSet();
		c.addAll(getSelectedElements());
		c.addAll(getSelectedLinks());
		return c;
	}
	/**
	 * Returns a collection of the expanded elements within this graphic view.
	 */
	public Collection getExpandedElements() {
		//return expandedelements;
		Collection c = new Vector();
		Iterator i = getAllElements().iterator();
		while (i.hasNext()) {
			GraphicViewElement gve = (GraphicViewElement) i.next();
			if (gve.isExpanded()) {
				c.add(gve);
			}
		}
		return c;
	}
	/**
	 * Returns a collection of the expandable elements within this graphic view.
	 */
	public Collection getExpandableElements() throws Exception {
		if (true)
			throw new Exception("getExpandableElements can't work.");
		return expandableelements;
	}
	/**
	 * Returns a collection of the visible elements within this graphic view.
	 * This will omit elements that are hidden as well as elements that are not
	 * within the visible area of the view, eg: the visible rectangle for
	 * graph-views, or the number of lines in a tree-list view.
	 */
	public Collection getVisibleElements() {
		return visibleelements;
	}
	/**
	 * Returns a collection of the visible links within this graphic view. This
	 * will omit links that are hidden and links that are not visible (ie those
	 * links that are not within the visible area of the view, eg: the visible
	 * rectangle for graph-views, or the number of lines in a tree-list view).
	 */
	public Collection getVisibleLinks() {
		return visiblelinks;
	}
	/** Selects the given object. */
	public void selectObject(ViewObject vo) {
		GraphicViewObject gvo;
		deselectAll();
		gvo = (GraphicViewObject) vo;
		gvo.setSelected(true);
	}
	/** Deselects the given element. */
	public void deselectObject(ViewObject vo) {
		GraphicViewObject gvo;
		gvo = (GraphicViewObject) vo;
		gvo.setSelected(false);
	}
	/**
	 * Creates a new (Graphic View AND model) element. Location l MUST be a
	 * GraphicLocation--If the caller can't provide us with a GraphicLocation,
	 * then he really has no business creating a new view AND model element
	 * through this view. (He should use dirtyElement).
	 */
	public ViewElement createElement(Object type, View.Location l)
			throws Exception {
		//D.o("Creating:"+type);
		GraphicViewElement gve = null;
		// not handled well at all! what's supposed to happen? Mike?
		try {
			gve = new GraphicViewElement(model.createElement(type), this);
		} catch (Exception e) {
			D.o(e);
		}
		newElement(gve);
		// If our location is a GraphicLocation
		View.GraphicLocation gl = (View.GraphicLocation) l;
		// else
		// throw new Exception("Non-Graphic Location passed to GV.cE");
		GraphicViewElement gvp = findExpandedElement(gl.getPoint());
		if (gvp != null) {
			//D.o("New element has parent.");
			try {
				gve.setParent(gvp);
				gvp.addChild(gve);
			} catch (Exception e) {
				// Should we just throw this and let the plugins deal with it?
				// Kill the new element
				deleteElement(gve);
				gve = null;
				// Inform the user (the plugin)
				throw e;
			}
		}
		if (gve != null) {
			gve.moveTo(gl.getPoint());
			refreshVisible();
			//GVC stuff
			gvc.repaint();
		}
		return gve;
	}
	
	//added by Zhifeng Liu Aug 2004
	public void copyElements( ) 
	   {
	     
	     /*
	     //get current selected Elements, if none,
	     //it is not possible to copy anything right now
	     Collection curSelectedElets=getSelectedElements();
	     
	     if (null==curSelectedElets ||curSelectedElets.isEmpty()){
	     	  JOptionPane.showMessageDialog(null, "Unable to copy, please select some objects first "
					,"Copy Object Error", JOptionPane.ERROR_MESSAGE);
	     	     	
	     }
	     else{
	          //copy the selected elements to the clipboard
	          elementsInClipboard= new Vector(curSelectedElets);
	        
	          //clear deletingElements: No elments will be deleted after copy.
	           if (null!=deletingElements && !deletingElements.isEmpty()){
	          	  deletingElements.clear();
	           }
	        
	         JOptionPane.showMessageDialog(null, "Copy Elements Size= "+elementsInClipboard.size()
					,"Copy Object Information", JOptionPane.INFORMATION_MESSAGE );
	     }
	   */
	   
		
	}
	
	//added by Zhifeng Liu Aug 2004
	public void cutElements( ) 
	   {
	     
	   
		
	}
	
	
	//added by Zhifeng Liu Aug 2004
	public void pasteElements( ){
	     
	     
	
	} //pasteElements
	
	//added by Zhifeng Liu Aug 2004
	public void copyLinks( ){
	
	}
	
	//added by Zhifeng Liu Aug 2004
	public void cutLinks( ){
	
	}
	//added by Zhifeng Liu Aug 2004
	public void pasteLinks( ){
	
	}
	
	//added by Zhifeng Liu Aug 2004
       /* Modified by Xiaoxue Dneg. Since the user may delete a node after it copy it and the node's model object will be deleted as well. In order to paste the node
          afterwards, we need to store the information of the node, such as name, type, etc using extra vetors. -Xiaoxue Deng
          */
        public void copyMethod( ) {
          if(dupElets!=null&&dupElets.size()!=0){
        	  dupElets.removeAllElements();
          }
          if(dupLinks!=null&&dupLinks.size()!=0){
        	  dupLinks.removeAllElements();
          }
//         D.o("copy");
	     //get current selected Elements and Links, if none,
	     //it is not possible to copy anything right now
	     Collection copyingElets=getSelectedElements();
	     Collection copyingLinks=getSelectedLinks();
	     
	     boolean noCopyingElet=( (null == copyingElets) || copyingElets.isEmpty() );
	     boolean noCopyingLink=( (null == copyingLinks) ||  copyingLinks.isEmpty() );
	     
	     if (noCopyingElet && noCopyingLink){
	     	  JOptionPane.showMessageDialog(null, "Unable to copy, please select some objects first "
					,"Copy Object Error", JOptionPane.ERROR_MESSAGE);
	     	     	
	     }
	     else{
	          //copy the selected elements to the clipboard
	    	   elementsInClipboard= new Vector(copyingElets);
                 /* Store the node's information in case its lost if the user delete it.*/
	          Iterator eleInCB=elementsInClipboard.iterator();
	           while (eleInCB.hasNext()){
	        	  GraphicViewElement gve=(GraphicViewElement) eleInCB.next();
	        	  DuplicateModelElement dupME=new DuplicateModelElement();
	        	  dupME.type=gve.getType();
	        	  dupME.name=gve.getName();
	        	  dupME.location=gve.getLocation();
	        	  dupElets.add(dupME);
	          }         
	          //clear deletingElements : No elments will be deleted after copy.
	          if (null!=deletingElements && !deletingElements.isEmpty()){
	          	 deletingElements.clear();
	           }
	        
	          //copy the selected links to the clipboard
	          linksInClipboard= new Vector(copyingLinks);
	          Iterator linkInCB=linksInClipboard.iterator();
	           while (linkInCB.hasNext()){
	        	  GraphicViewLink gvl=(GraphicViewLink) linkInCB.next();
	        	  DuplicateModelLink dupML=new DuplicateModelLink();
	        	  dupML.type=gvl.getType();
	        	  dupML.from=(GraphicViewElement)gvl.getFrom();
	        	  dupML.to=(GraphicViewElement)gvl.getTo();
	        	  dupLinks.add(dupML);
	          }         
	           //clear deletingLinks:   No links will be deleted after copy.
	           if (null!=deletingLinks && !deletingLinks.isEmpty()){
	              deletingLinks.clear();
	           }
	        
	         /*JOptionPane.showMessageDialog(null, "Copy Elements Size= "+elementsInClipboard.size()
					,"Copy Object Information", JOptionPane.INFORMATION_MESSAGE );
					
		       JOptionPane.showMessageDialog(null, "Copy Links Size= "+linksInClipboard.size()
					,"Copy Object Information", JOptionPane.INFORMATION_MESSAGE );*/	
//	           D.o("copy successful");
	     }       
        
        }// copyMethod
        
       //added by Zhifeng Liu Aug 2004
      // Modified by Xiaoxue Deng Nov 2005
       public void cutMethod( ) {
       	
       	     //get current selected Elements and Links, if none,
	     //it is not possible to cut anything right now
	     Collection copyingElets=getSelectedElements();
	     Collection copyingLinks=getSelectedLinks();	
	     
	     boolean noCopyingElet=( (null == copyingElets) || copyingElets.isEmpty()  );
	     boolean noCopyingLink=( (null == copyingLinks) ||  copyingLinks.isEmpty() );
	     
	     if (noCopyingElet && noCopyingLink){
	     	  JOptionPane.showMessageDialog(null, "Unable to cut, please select some objects first "
					,"Cut Object Error", JOptionPane.ERROR_MESSAGE);
	     	     	
	     }
	     else{
                    //Cut will delete source objects, add a prompt to ask the user to 
                    //confirm if he/she really want to cut the SelectedObjects 
                    //before physically take the "cut" action
                      
                    Object options[] = {"Yes", "No", "Cancel"};
                    int option = JOptionPane.showOptionDialog(null,
      	                 (Object)"Are you sure you want to cut SelectedObjects?", "Confirm SelectedObjects Cut",
                         JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
		         null, options, options[1]);
                    if (JOptionPane.YES_OPTION ==option) {
                            	copyMethod();
                            	deleteSelectedElements();
                            	deleteSelectedLinks();
                   }
	     }      	
       } //cutMethod
       
       //added by Zhifeng Liu Aug 2004
       public void pasteMethod( ) {
	     if (Pastable()){
	     	
		Iterator i = pastingElements.iterator();
		int index=0;
		/*Before building the Element Twin Pairs, remove all */
		elementTwinPairs.clear();
		
		while (i.hasNext()) {
			GraphicViewElement gve=(GraphicViewElement) i.next();
		    	Object tp= ((DuplicateModelElement)dupElets.elementAt(index)).type;
			View.Location lc=((DuplicateModelElement)dupElets.elementAt(index)).location;
			String name= ((DuplicateModelElement)dupElets.elementAt(index)).name;				
			try {
			   ViewObject copiedElet = this.createElement(tp, lc); 
			   copiedElet.setName(name);
			   elementTwinPairs.add(new TwinElemts(gve,(GraphicViewElement)copiedElet));
			} catch (Exception e) {
		        // We have probably tried to create an element within the
		        // bounds of another, and the KB won't allow this (bad types).
		        // We should make some specialized exceptions at some point.
		         D.o("Semantic Error creating element.");
		          JOptionPane.showMessageDialog(null,
			    "Unable to create " ,"Semantic Error",JOptionPane.ERROR_MESSAGE);
		   	}//catch
			index++;
		} //while
//		D.o("Pasting Links");
		int indexL=0;
	    for(;indexL<dupLinks.size();indexL++){
			//GraphicViewLink gvl=(GraphicViewLink) ipl.next();
			Object tp=((DuplicateModelLink)dupLinks.elementAt(indexL)).type;
			//gvl.getName();
			GraphicViewElement srcElement=((DuplicateModelLink)dupLinks.elementAt(indexL)).from;
			GraphicViewElement destElement=((DuplicateModelLink)dupLinks.elementAt(indexL)).to;
			
			GraphicViewElement newLinkSource = duplicate(srcElement);
			GraphicViewElement newLinkDest = duplicate(destElement);
			
			this.createLink(tp, newLinkSource.getModelObject(),
					 newLinkDest.getModelObject()); 
									
		} //while
		
		//delete the source elements after pasting
		// only valid for cut-paste operation
		//for copy-paste operation, deletingElements is empty, none will be deleting
	    
	      if (null!=deletingElements && !deletingElements.isEmpty()){
		
		Iterator itr = deletingElements.iterator();
		while (itr.hasNext()) {
			
			//D.o("Deleting elements = "+deletingElements.size());
			
			GraphicViewElement gve=(GraphicViewElement) itr.next();
			
			deleteElement(gve);
			//D.o("Deleting element after cut+paste.");
		        
		 	
			
		} //while
		
		//clear deletingElements after the delete action
		deletingElements.clear(); 
	      }	 
		
	     }//else
      }
	
	GraphicViewElement duplicate(GraphicViewElement srcElmt){
  	   GraphicViewElement  result = srcElmt;
  	   
  	   Iterator i = elementTwinPairs.iterator();
  	   
  	   while (i.hasNext()) {
  	      TwinElemts curPair=(TwinElemts)(i.next());
  	      if (curPair.getOriginal()==srcElmt){
  	      	 result =curPair.getCopied();
  	      	 break;
  	      }//if
  	  }//while
  	   
	   return result;
      }//duplicate
	
	
	/**
	 * Prompts user to rename the given element. We had better receive a
	 * GraphicViewElement. There is not constrain on the name of the element. It
	 * is possible that two elements have an identical name.
	 */
	public void promptRename(ViewObject vo) {
		gvc.openRenameBox((GraphicViewObject) vo);
	}
	/**
	 * Prompts user to straighten the given link. We had better receive a
	 * GraphicViewLink.
	 */
	public void promptStraighten(ViewObject vo) {
		GraphicViewObject gvo = (GraphicViewObject) vo;
		gvo.reset();
	}

	/**
	 * 
	 * @uml.property name="straighten"
	 */
	public void setStraighten(boolean b) {
		this.straighten = b;
	}

	/**
	 * 
	 * @uml.property name="straighten"
	 */
	public boolean getStraighten() {
		return straighten;
	}

	private boolean showIntention;

	/**
	 * 
	 * @uml.property name="_frame"
	 * @uml.associationEnd multiplicity="(0 1)"
	 */
	private GraphicViewFrame _frame;

	/**
	 * 
	 * @uml.property name="showIntention"
	 */
	public boolean isShowIntention() {
		return showIntention;
	}

	public void setIntention(ViewObject vo) {
		showIntention = !showIntention;
		((GraphicViewObject) vo).view.refreshVisible();
	}
	/**
	 * Prompts user to resize the given element. We had better receive a
	 * GraphicViewElement. the size of the element traditionally is a real
	 * number ranges from 0.4 to 3.0.
	 */
	public void promptResize(ViewObject vo) {
		gvc.openResizeBox((GraphicViewObject) vo);
	}
	/**
	 * Add the new element to the appropriate lists
	 * 
	 * @param gve
	 *            the graphic view element to be added
	 */
	private void newElement(GraphicViewElement gve) {
		D.a(gve!=null);
//		D.o("element id = " + gve.getID());
		elements.add(gve);
		model2viewobjects.put(gve.getModelElement(), gve);
		ids2gves.put(new Integer(gve.getID()), gve);
		markDirty(gve.getSelectableBounds());
//		setViewDirty();
	}
	/**
	 * Deletes a view element, and it's corresponding model element. The model
	 * is responsible for deleting links and children.
	 * 
	 * @param ve
	 *            the the view element to be deleted
	 */
	public void deleteElement(ViewElement ve) {
		model.deleteElement(((GraphicViewElement) ve).getModelElement());
		getHighlightedObjects().remove(ve);
	}
	/**
	 * Deletes all selected elements within this graphic view.
	 * 
	 * @see GraphicView#deleteElement()
	 */
	public void deleteSelectedElements() {
			while (!selectedelements.isEmpty()) {
			 deleteElement((GraphicViewElement) selectedelements.iterator()
					.next());
		        }
	}
	/**
	 * Creates a new link.
	 */
	public ViewLink createLink(Object type, ModelObject from, ModelObject to) {
		GraphicViewObject gto = (GraphicViewObject) getViewObject(to);
		GraphicViewObject gfrom = (GraphicViewObject) getViewObject(from);
		OMEFramework fw = getModel().getFramework();
		GraphicViewLink gvl = null;
		try { // not reasonable handled at all... !!
			gvl = new GraphicViewLink(model.createLink(type), this);
		} catch (Exception e) {
			D.o(e);
		}
		// Add the link to the view's bookkeeping.
		newLink(gvl);
		//D.o("Creating:"+type);
		// Now that we have the link, we need to set it's to, from, and name.
		try {
			gvl.setTo(gto);
			gvl.setFrom(gfrom);
			gvl.setName(gvl.getModelObject().getName());
		} catch (Exception e) {
			// Same story as in createElement().
			// This link ain't legal, kill it.
//			D.o("Here's where we give up making the link");
			deleteLink(gvl);
			// Inform user
//			D.o("A firm, but positive statement informing the user"	+ " that he/she made a boo-boo");
			JOptionPane.showMessageDialog(null, "Unable to create "
					+ fw.getName(type) + " from " + fw.getName(gfrom.getType())
					+ " to " + fw.getName(gto.getType()) + ".",
					"Semantic Error", JOptionPane.ERROR_MESSAGE);
		}
		refreshVisible();
		gvc.repaint();
		gvc.adjustScrollBar();
		return gvl;
	}
	/** Deletes a view object. */
	public void deleteObject(ViewObject vo) {
		
		// Modified by Zhifeng Liu   July ,2004
               /*Add a prompt to ask the user to confirm if he/she really
                want to delete the object before physically take the "delete" action
               */
            Object options[] = {"Yes", "No", "Cancel"};
             int option = JOptionPane.showOptionDialog(null,
         	(Object)"Are you sure you want to delete the Object?", "Confirm Object Delete",
		     JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
		     null, options, options[1]);
               //  Setting to the default option to options[1] doesn't work.
               // Rather frustrating...
           switch (option) {
	     case JOptionPane.NO_OPTION :
   		  break;
    	     case JOptionPane.CANCEL_OPTION :
	    	break;
	     case JOptionPane.YES_OPTION :
		   {
		   	if (vo instanceof ViewLink) {
			 deleteLink((ViewLink) vo);
			} else if (vo instanceof ViewElement) {
			        deleteElement((ViewElement) vo);
		               } // else
		        // Things other than links and elements go here.
		        D.a(true); // Sorry about the harsh death.
		    }
		
	}//switch	
	
	}
	/**
	 * Adds the new link to the appropriate lists.
	 * 
	 * @param gvl
	 *            the graphic view link to be added
	 */
	private void newLink(GraphicViewLink gvl) {
		links.add(gvl);
		model2viewobjects.put(gvl.getModelLink(), gvl);
		ids2gvls.put(new Integer(gvl.getID()), gvl);
		markDirty(gvl.getDirtyBounds());
//		setViewDirty();
	}
	/**
	 * Deletes a view link.
	 * 
	 * @param vl
	 *            the view link to be deleted
	 */
	public void deleteLink(ViewLink vl) {
		model.deleteLink(((GraphicViewLink) vl).getModelLink());
		((GraphicViewLink) vl).modelobject = null; // to make sure...
	}
	/**
	 * Deletes all the selected links within this graphic view
	 * 
	 * @see GraphicView#deleteLink
	 */
	public void deleteSelectedLinks() {
		   	while (!selectedlinks.isEmpty()) {
			  deleteLink((ViewLink) selectedlinks.iterator().next());
		       }	
	}
	
	/**
	 * A dirty element is one that has been changed (modified, created or
	 * deleted) since the last serialization. This method makes the appropriate
	 * changes to the element and then sets the view to repainted.
	 * 
	 * @param e
	 *            the model element that has changed and needs to repainted
	 */
	public void dirtyElement(ModelElement e) {
		ViewElement ve = (ViewElement) model2viewobjects.get(e);
		
		if (ve == null && e != null) { // new element
			//D.o("dirtyElement:  new element");
			GraphicViewElement gve = new GraphicViewElement(e, this);
			newElement(gve);
			gve.updateName(); // Since the name is cached.
			//D.o("Adding element to GraphicView " + gve.getID());
			// Assign this GVElement a (default)location.
			// if we have anything stored in the serialization...
		} else if (model.getElements().contains(e)) { // updated
			GraphicViewElement gve = (GraphicViewElement) ids2gves.get(new Integer(ve.getID()));
			markDirty(gve.getDirtyBounds());
//			setViewDirty();
			Iterator i = gve.getModelObject().getAttributes();
			while (i.hasNext()) {
				ModelAttribute ma = (ModelAttribute) i.next();
				if (ma.getName().equals("label")) {
					if (e.getLabel()!=null) {
						if (!e.getLabel().telosName().equals("IStarUndecidedElementLabel"))
							ma.setTarget(e.getLabel());
					    else
						    ma.clearTarget();
					}
				}
			}
		} else {
			// e is not in the model, so we should delete it from the view.
			// If e is null, then this code will be harmless.
			//D.o("Deleting element from graphic view");
//			D.o("Delete element" + ve);
			elements.remove(ve);
			visibleelements.remove(ve);
			selectedelements.remove(ve);
		}
//		setViewDirty();
	}
	/**
	 * A dirty link is one that has been changed (modified, created or deleted)
	 * since the last serialization. This method makes the appropriate changes
	 * to the link and then sets the view to repainted.
	 * 
	 * @param l
	 *            the model link that has changed and needs to repainted
	 */
	public void dirtyLink(ModelLink l) {
		D.a(l);
		ViewLink vl = (ViewLink) model2viewobjects.get(l);
		if (vl == null&& l!=null) { // the link is new
			GraphicViewLink gvl = new GraphicViewLink(l, this);
			newLink(gvl);
			gvl.updateName(); // Since the name is cached.
			markDirty(gvl.getDirtyBounds());
		} else if (model.getLinks().contains(l)) { // it has been updated.
		} else { // it has been deleted.
			//D.o("Deleting link from graphic view");
			links.remove(vl);
			visiblelinks.remove(vl);
			// defaultlinks cleanup?
			selectedlinks.remove(vl);
		}		
//		setViewDirty();
	}
	/**
	 * Returns the view element that corresponds to a given model element.
	 * 
	 * @param e
	 *            the model element whose view element we want
	 */
	/* pkg */ViewElement getViewElement(ModelElement e) {
		return (ViewElement) model2viewobjects.get(e);
	}
	/**
	 * Returns the view link that correspsonds to a given model link.
	 * 
	 * @param l
	 *            the model link whose view link we want
	 */
	/* pkg */ViewLink getViewLink(ModelLink l) {
		return (ViewLink) model2viewobjects.get(l);
	}
	/**
	 * Returns the view object that corresponds to a given model object. This is
	 * a temporary implementation that needs to be changed once
	 * <code>model2viewobjects</code> has been implemented.
	 * 
	 * @param mo
	 *            the model object whose view object we want
	 */
	/* pkg */ViewObject getViewObject(ModelObject mo) {
		return (ViewObject) model2viewobjects.get(mo);
		// but not yet, instead:
		/*
		 * ViewObject vo; if ((vo = (ViewObject)model2viewelements.get(mo)) !=
		 * null) { } else { vo = (ViewObject)model2viewlinks.get(mo); } return
		 * vo;
		 */
	}
	/**
	 * Save the this graphic view to the serializer
	 * 
	 * @param vs
	 *            the view serializer used to save the view to the repository
	 * 
	 * see TelosViewSerializer#TelosViewSerializer
	 */
	public void save(ViewSerializer vs) {
		vs.clear();
		GVERecord gver = new GVERecord();
		Iterator i = getAllElements().iterator();
		while (i.hasNext()) {
			GraphicViewElement gve = (GraphicViewElement) i.next();
			gver.x = gve.getImageBounds().x;
			gver.y = gve.getImageBounds().y;
			gver.scale = gve.getScale();
			gver.ID = gve.getID();
			gver.justification = gve.getJustification();
			// If this is a expandable element, record whether it was
			// expanded.
			gver.expanded = 0;
			if (gve.isExpandable()) {
				if (gve.isExpanded()) {
					gver.expanded = 1;
				}
			}
			if (gve.isHidden()) {
				//		D.o("Object "+ gve.getName() +" is hidden+++++++++++++++");
				gver.hidden = 1;
			} else {
				gver.hidden = 0;
			}
			if (gve.isHighlighted()) {
				//		D.o("Object "+ gve.getName() + " is
				// highlighted+++++++++++++++");
				gver.highlight = 1;
			} else {
				gver.highlight = 0;
			}
			vs.serialize(gver);
		}
		GVLRecord gvlr = new GVLRecord();
		// save the links
		i = getAllLinks().iterator();
		while (i.hasNext()) {
			GraphicViewLink gvl = (GraphicViewLink) i.next();
			gvlr.end1x = gvl.getend1().x;
			gvlr.end1y = gvl.getend1().y;
			gvlr.start2x = gvl.getstart2().x;
			gvlr.start2y = gvl.getstart2().y;
			gvlr.control1x = gvl.getcontrol1().x;
			gvlr.control1y = gvl.getcontrol1().y;
			gvlr.control2x = gvl.getcontrol2().x;
			gvlr.control2y = gvl.getcontrol2().y;
			gvlr.scale = gvl.getScale();
			gvlr.justification = 2;
			gvlr.ID = gvl.getID();
			// If this is a expandable element, record whether it was
			// expanded.
			vs.serialize(gvlr);
		}
	}
	/** Returns the absolute pathname where this model should be saved. */
	public String getSavePathname() {
		return gvc.getSavePathname();
	}
	ViewSerializer loaded_vs = null;

	public ViewSerializer getViewSerializer() {
		return loaded_vs;	
	}
	/**
	 * Recover important stuff from the serializer.
	 * 
	 * @param vs
	 *            the view serializer used to load this graphic view from the
	 *            repository
	 */
	public void load(ViewSerializer vs) {
		GRecord gr;
		//D.o("GraphicView loading:");
		try {
			// get the objects.
			int n = 0;
			Iterator i = vs.iterator();
			while (i.hasNext()) {
				gr = (GRecord) i.next();
				n++;
				if (gr.objecttype == 1) {					
					GraphicViewElement gve = (GraphicViewElement) ids2gves
							.get(new Integer(gr.ID));
					if (gve == null) {
						D.o("can't find " + gr.ID + " in the serialized graph view");
						//D.a(false);
					} else {
						gve.moveTo(new Point(gr.x, gr.y));
						gve.setScale(gr.scale);
						if (gve.getType() == "Aspect")
							gve.setJustification(0);
						// Restore expanded/contracted state.
						if (gve.isExpandable()) {
							gve.expand();
							gve.expand2();
						}
						if (gr.hidden == 1) {
							//D.o("Object " + gve.getName() + " is hidden+++++++++++++");
							((ViewObject) gve).setHidden(true);
						}
						if (gr.highlight == 1) {
							//D.o("Object " + gve.getName() + " is highlighted+++++++++++++++++++");
							((ViewObject) gve).setHighlighted(true);
						}
					}
				} else if (gr.objecttype == 0) {
					GraphicViewLink gvl = (GraphicViewLink) ids2gvls
							.get(new Integer(gr.ID));
					if (gvl!=null) {
						gvl.getend1().setLocation(gr.end1x, gr.end1y);
						gvl.getstart2().setLocation(gr.start2x, gr.start2y);
						gvl.getcontrol2().setLocation(gr.control2x, gr.control2y);
						gvl.getctrl2().setLocation(
								(int) ((gvl.getcontrol2().x) - 4),
								(int) ((gvl.getcontrol2().y) - 4));
						gvl.getcontrol1().setLocation(gr.control1x, gr.control1y);
						gvl.getctrl1().setLocation(
								(int) ((gvl.getcontrol1().x) - 4),
								(int) ((gvl.getcontrol1().y) - 4));
						gvl.getQuad1().setCurve(gvl.getstart1(), gvl.getcontrol1(),
								gvl.getend1());
						gvl.getQuad2().setCurve(gvl.getstart2(), gvl.getcontrol2(),
								gvl.getend2());
						gvl.setScale(gr.scale);
					}
				}
			}
//			D.o("n = " + n);
			setViewDirty();
			loaded_vs = vs;
		} catch (Exception e) {
			D.a(e);
		}
		//D.o("Graphicview loaded");
	}
	/* GraphicView specific methods: */
	/**
	 * Creates a new graphic view.
	 * 
	 * @param model
	 *            the model on which this graphic view is based
	 */
	public GraphicView(OMEModel model) {
		//D.o("Creating GraphicView..................................");
		this.model = model;
		if (model != null)
			this.framework = model.getFramework();
		displaybounds = new Rectangle(0, 0, 0, 0);
		viewbounds = new Rectangle(0, 0, 0, 0);
		elements = new Vector();
		links = new Vector();
		selectedelements = new Vector();
		
		/*Added by Zhifeng Liu Aug 2004*/
		elementsInClipboard = new Vector();
		linksInClipboard = new Vector();
		deletingElements = new Vector();
		deletingLinks   = new Vector();
		elementTwinPairs = new Vector();
		/*The initializations above are added by Zhifeng Liu*/      
		
		selectedlinks = new Vector();
		//expandedelements = new Vector();
		expandableelements = new Vector();
		visibleelements = new Vector();
		visiblelinks = new Vector();
		if (framework != null)
			it = framework.getImageTable();
		highlighted = new Vector();
		model2viewobjects = new HashMap();
		ids2gves = new HashMap();
		ids2gvls = new HashMap();
		setViewDirty();
		showIntention = true;
		dupElets=new Vector();
		dupLinks=new Vector();
		//D.o("Created GraphicView..................................");
	}
	/** Returns the ImageTable for this Graphic view. */
	public ImageTable getImageTable() {
		return it;
	}
	/**
	 * Returns the rectangle delimiting this GraphicView. This starts at the
	 * bounding rectangle of the component elements, plus a border, then expands
	 * to include new elements as they are added. It does not shrink as elements
	 * are removed, and is not serialized. It will thus appear to shrink upon
	 * the saving and restoring of a GraphicView from which edge elements have
	 * been removed.
	 */
	public Rectangle getViewBounds() {
		// return viewbounds;
		// we are not currently caching the viewbounds. We will do so iff it
		// will significantly improve speed.
		// instead we recalculate
		viewbounds = new Rectangle(0, 0, 0, 0);
		Iterator i = getAllElements().iterator();
		while (i.hasNext()) {
			GraphicViewElement ve = (GraphicViewElement) i.next();
			extendViewBounds(ve.getDirtyBounds());
		}
		//extendViewBounds(displaybounds);
		viewbounds = viewbounds.union(displaybounds);
		return viewbounds;
	}
	/**
	 * Sets the current viewbounds. It is not clear that this should ever be
	 * called. For now, I feel we should throw an exception.
	 */
	public void setViewBounds(Rectangle vb) {
//		D.o("Why are we calling setViewBounds?");
		D.o(new Exception("setViewBounds called."));
	}
	/**
	 * Returns the rectangle delimiting the visible portion of this GraphicView.
	 * This is the area shown in the window.
	 */
	public Rectangle getDisplayBounds() {
		return displaybounds;
	}
	/**
	 * Sets the rectangle representing the area shown in the window.
	 * 
	 * @param db
	 *            the display bounds we wish to be set for this view
	 */
	public void setDisplayBounds(Rectangle db) {
		displaybounds = db;
		setViewDirty();
		refreshVisible();
	}
	/** Recalculate what is in the visible area. */
	public void refreshVisible() {
		//  we iterate over the non-hidden elements,
		Iterator i;
		visibleelements.clear();
		visiblelinks.clear();
		if (elements!=null) {
			i = elements.iterator();
			while (i.hasNext()) {
				GraphicViewElement gve = (GraphicViewElement) i.next();
				if (gve!=null) {
					if (!gve.isHidden() && !gve.isIconified()) {
						Rectangle r = gve.getSelectableBounds();
						if (r.intersects(displaybounds)) {
							visibleelements.add(gve);
						}
					}
				}
			}
		}
		// then iterate over the links.
		if (links!=null) {
			i = links.iterator();
			while (i.hasNext()) {
				GraphicViewLink gvl = (GraphicViewLink) i.next();
				if (gvl!=null && (gvl.getTo()!=null && gvl.getFrom()!=null)) {
					if (!gvl.isHidden() && !gvl.isIconified()) {						
						java.awt.geom.Line2D l = new java.awt.geom.Line2D.Float(
								((GraphicViewObject) gvl.getTo()).getCentre(),
								((GraphicViewObject) gvl.getFrom()).getCentre());
						if (getStraighten()) {
							gvl.init();
						} else {
							gvl.getQuad1().setCurve(gvl.getstart1(), gvl.getcontrol1(),
									gvl.getend1());
							gvl.getQuad2().setCurve(gvl.getstart2(), gvl.getcontrol2(),
									gvl.getend2());
						}
						if (displaybounds.intersectsLine(l)
								|| displaybounds.intersects(gvl.getSelectableBounds())) {
							visiblelinks.add(gvl);
						}
					}
				}
			}
		}
	}
	/** Clears all selections, elements, links and anything else. */
	public void deselectAll() {
		//D.o("Deselecting All");
		Iterator i = selectedelements.iterator();
		while (i.hasNext()) {
			markDirty(((GraphicViewElement) i.next()).getSelectableBounds());
		}
		selectedelements.clear();
		i = selectedlinks.iterator();
		while (i.hasNext()) {
			markDirty(((GraphicViewLink) i.next()).getSelectableBounds());
		}
		selectedlinks.clear();
	}
	/**
	 * Returns an OMEContext object for this view with p as the associated
	 * point.
	 */
	public ViewContext generateContext(Point p) {
		View.GraphicLocation gl = null;
		GraphicViewObject gvo = null;
		if (p != null) {
			gl = new View.GraphicLocation();
			gl.setPoint(p);
			gvo = findObject(p);
		}
		return new ViewContext(gl, gvo, getSelectedObjects());
	}
	/** Returns what is at p, either an element, link, or null. */
	public GraphicViewObject findObject(Point p) {
		GraphicViewObject gvo = null;
		if (gvo == null) {
			gvo = findElement(p);
		}
		if (gvo == null) {
			gvo = findLink(p);
		}
		return gvo;
	}
	/** Returns any element at point p and otherwise null. */
	public GraphicViewElement findElement(Point p) {
		// we iterate over the visible elements.
		Iterator i = visibleelements.iterator();
		GraphicViewElement gve = null;
		while (i.hasNext()) {
			gve = (GraphicViewElement) i.next();
			if (gve.getSelectableBounds().contains(p) 
					&& !gve.isHidden() 
					&& !(gve.isExpandable() && 
					     OMEDefaultPlugin.to_expand == 2)) {
				return gve;
			}
		}
		return null;
	}
	/** Returns any link at point p and otherwise null. */
	public GraphicViewLink findLink(Point p) {
		// we iterate over the visible links.
		Iterator i = visiblelinks.iterator();
		GraphicViewLink gvl = null;
		while (i.hasNext()) {
			gvl = (GraphicViewLink) i.next();
			if (gvl.getSelectableBounds().contains(p)) {
				return gvl;
			}
		}
		return null;
	}
	public GraphicViewLink findLinkControlPoint1(Point p) {
		Iterator i = visiblelinks.iterator();
		GraphicViewLink gvl = null;
		while (i.hasNext()) {
			gvl = (GraphicViewLink) i.next();
			if (gvl.getctrl1().contains(p)) {
				return gvl;
			}
		}
		return null;
	}
	public GraphicViewLink findLinkControlPoint2(Point p) {
		Iterator i = visiblelinks.iterator();
		GraphicViewLink gvl = null;
		while (i.hasNext()) {
			gvl = (GraphicViewLink) i.next();
			if (gvl.getctrl2().contains(p)) {
				return gvl;
			}
		}
		return null;
	}
	/**
	 * Returns a collection of all objects whose centres are within the bounds
	 * of the given Rectangle. Returns an empty collection if there are none.
	 */
	public Collection findObjects(Rectangle r) {
		Collection c = findElements(r);
		c.addAll(findLinks(r));
		return c;
	}
	/**
	 * Returns a collection of all elements whose centres are within the bounds
	 * of the given Rectangle. Returns an empty collection if there are none.
	 */
	public Collection findElements(Rectangle r) {
		//D.o("Looking for elements in: " + r);
		Vector ll = new Vector();
		Iterator i = visibleelements.iterator();
		GraphicViewElement gve = null;
		while (i.hasNext()) {
			gve = (GraphicViewElement) i.next();
			if (r.contains(gve.getCentre())) {
				//D.o("Found element at: " + gve.getCentre());
				ll.add(gve);
			}
		}
		return ll;
	}
	/**
	 * Returns a collection of all links whose centres are within the bounds of
	 * the given Rectangle. Returns an empty collection if there are none.
	 */
	public Collection findLinks(Rectangle r) {
		Vector ll = new Vector();
		Iterator i = visiblelinks.iterator();
		GraphicViewLink gvl = null;
		while (i.hasNext()) {
			gvl = (GraphicViewLink) i.next();
			if (r.contains(gvl.getCentre())) {
				ll.add(gvl);
			}
		}
		return ll;
	}
	/**
	 * Returns the first expandable element whose field includes a certain
	 * point.
	 * 
	 * @param p
	 *            the point which should be in the field of the expanded element
	 *            we want
	 */
	public GraphicViewElement findExpandedElement(Point p) {
		Iterator i = getExpandedElements().iterator();
		GraphicViewElement gve = null;
		while (i.hasNext()) {
			gve = (GraphicViewElement) i.next();
			// if point is within the circle bounded by gve.getExpandedBounds()
			Rectangle r = gve.getExpandedBounds();
			Point rp = new Point(r.x + r.width / 2, r.y + r.height / 2);
			if (rp.distanceSq(p) < (r.width * r.width / 4)) {
				return gve;
			}
		}
		return null;
	}
	/** Displays the given JDialog to the user. */
	public void showDialog(JDialog jd) {
		gvc.showDialog(jd);
	}
	/**
	 * Rebuilds the visible lists, based on the current display bounds and
	 * hidden states. This updates the element, and link lists.
	 */
	public void refreshVisibleLists() {
		// aren't we deprecated?
		refreshVisible();
	}
	/**
	 * Returns whether this graphic view has been changed since the last call of
	 * setViewClean
	 */
	public boolean isViewDirty() {
		return viewdirty;
	}
	/** Marks the view as clean. */
	public void setViewClean() {
		viewdirty = false;
		dirtyrect = null;
	}
	/** Returns a rectangle bounding the dirty area. */
	public Rectangle getDirtyRect() {
		return dirtyrect;
	}
	/**
	 * Sets the area (described by a rectangle) that has changed.
	 * 
	 * @param r
	 *            the rectangle that has changed
	 */
	/*
	 * public void setDirtyRect(Rectangle r) { dirtyrect = r; }
	 */
	/** Adds the passed rectangle to our dirty area. */
	public void markDirty(Rectangle r) {
		if (dirtyrect != null && r != null) {
			dirtyrect = r.union(dirtyrect);
		} else {
			dirtyrect = r;
		}
	}
	/** Marks the whole view as dirty. */
	public void setViewDirty() {
		viewdirty = true;
		dirtyrect = new Rectangle(displaybounds);
	}
	/** Marks the view as dirty, and redraws. */
	public void updateView() {
		refreshVisible();
//		setViewDirty();
		//gvc.repaint();
	}
	/**
	 * Hides all selected elements and links. They are replaced by a token in
	 * thier geometric centre which can be clicked on to unhide them. This is
	 * not yet implemented.
	 */
	public void hideSelection() {
	}
	/**
	 * Un-hides the elements represented by all the tokens within the current
	 * selection. This is not yet implemented.
	 */
	public void showSelection() {
	}
	/** Un-hides all the hidden elements. This is not yet implemented. */
	public void showHidden() {
	}
	/**
	 * Translates a point from display coordinate to view coordinate.
	 * 
	 * @param p
	 *            The point to be translated.
	 * 
	 * @return The translated point.
	 */
	public Point toView(Point p) {
		return new Point(p.x + displaybounds.x, p.y + displaybounds.y);
	}
	/**
	 * Translates a point from view coordinate to display coordinate.
	 * 
	 * @param p
	 *            The point to be translated.
	 * 
	 * @return The translated point.
	 */
	public Point toDisplay(Point p) {
		return new Point(p.x - displaybounds.x, p.y - displaybounds.y);
	}
	/**
	 * Moves selected elements.
	 * 
	 * @param dx
	 *            The distance to move in the horizontal orientation.
	 * @param dy
	 *            The distance to move in the vertical orientation.
	 */
	public void moveElements(int dx, int dy) {
		Iterator i = selectedelements.iterator();
		Rectangle dr = null;
		while (i.hasNext()) {
			GraphicViewElement gve = (GraphicViewElement) i.next();
			// expanded bounds
			GraphicViewElement egve = null;
			if (gve.getParent() != null) {
				egve = (GraphicViewElement) gve.getParent();
			} else if (getExpandedElements().contains(gve)) {
				egve = gve;
			}
			Rectangle opb = null;
			if (egve != null) {
				opb = egve.getExpandedBounds();
			}
			// elements bounds
			if (dr == null) {
				dr = new Rectangle(gve.getDirtyBounds());
			}
			// Mark this element and its links as dirty (old position).
			Iterator links = gve.getLinks().iterator();
			while (links.hasNext()) {
				GraphicViewLink gl = (GraphicViewLink) links.next();
				if (((GraphicViewObject) gl.getTo()).getName() == gve.getName())
					gl.getend2().setLocation(gve.getCentre().getX() + dx,
							gve.getCentre().getY() + dy);
				if (((GraphicViewObject) gl.getFrom()).getName() == gve
						.getName())
					gl.getstart1().setLocation(gve.getCentre().getX() + dx,
							gve.getCentre().getY() + dy);
				if (getStraighten()) {
					gl.init();
				}
				gl.getQuad1().setCurve(gl.getstart1(), gl.getcontrol1(),
						gl.getend1());
				gl.getQuad2().setCurve(gl.getstart2(), gl.getcontrol2(),
						gl.getend2());
			}
			dr.add(getLinksBounds(gve));
			// If the elment has children, and is contracted, then the
			// children's
			// links are attached to it, so those links are also dirty.
			Collection childlinks = null;
			if (gve.isExpandable() && !gve.isExpanded()) {
				childlinks = getChildLinks(gve);
				Iterator cl_iterator = childlinks.iterator();
				while (cl_iterator.hasNext()) {
					GraphicViewLink gl = (GraphicViewLink) cl_iterator.next();
					if (getStraighten()) {
						gl.init();
					}
					gl.getQuad1().setCurve(gl.getstart1(), gl.getcontrol1(),
							gl.getend1());
					gl.getQuad2().setCurve(gl.getstart2(), gl.getcontrol2(),
							gl.getend2());
					dr.add(getLinksBounds(gl));
				}
			}
			// And move it.
			gve.move(dx, dy);
			// Mark this element and its links as dirty (new position).
			// Yijun: repeated?
//			dr.add(getLinksBounds(gve));
			if (gve.isExpandable() && !gve.isExpanded()) {
				Iterator cl_iterator = childlinks.iterator();
				while (cl_iterator.hasNext()) {
					GraphicViewLink gl = (GraphicViewLink) cl_iterator.next();
					if (((GraphicViewObject) gl.getTo()).getName() == gve
							.getName())
						gl.getend2().setLocation(gve.getCentre().getX() + dx,
								gve.getCentre().getY() + dy);
					if (((GraphicViewObject) gl.getFrom()).getName() == gve
							.getName())
						gl.getstart1().setLocation(gve.getCentre().getX() + dx,
								gve.getCentre().getY() + dy);
					if (getStraighten()) {
						gl.init();
					}
					gl.getQuad1().setCurve(gl.getstart1(), gl.getcontrol1(),
							gl.getend1());
					gl.getQuad2().setCurve(gl.getstart2(), gl.getcontrol2(),
							gl.getend2());
					dr.add(getLinksBounds(gl));
				}
			}
			// add the expanded bounds if it changed.
			// Yijun: this is a performance bottleneck when the agent has a large number
			//        of children
			if (false)
			if (egve != null) {
				Rectangle npb = egve.getExpandedBounds();
				if (!npb.equals(opb)) {
					dr.add(opb);
					dr.add(npb);
				}
			}
		}
		//setViewDirty();
		markDirty(dr);
	}
	/**
	 * Moves selected link.
	 * 
	 * @param dx
	 *            The distance to move in the horizontal orientation.
	 * @param dy
	 *            The distance to move in the vertical orientation.
	 */
	public void moveLink(int dx, int dy, int flag) {
		Iterator i = selectedlinks.iterator();
		Rectangle dr = new Rectangle();
		while (i.hasNext()) {
			GraphicViewLink gl = (GraphicViewLink) i.next();
			if (flag == 1) {
				gl.getcontrol1().setLocation(gl.getcontrol1().x + dx,
						gl.getcontrol1().y + dy);
				gl.getctrl1().setLocation((int) ((gl.getcontrol1().x) - 4),
						(int) ((gl.getcontrol1().y) - 4));
				gl.getQuad1().setCurve(gl.getstart1(), gl.getcontrol1(),
						gl.getend1());
			} else if (flag == 2) {
				gl.getcontrol2().setLocation(gl.getcontrol2().x + dx,
						gl.getcontrol2().y + dy);
				gl.getctrl2().setLocation((int) ((gl.getcontrol2().x) - 4),
						(int) ((gl.getcontrol2().y) - 4));
				gl.getQuad2().setCurve(gl.getstart2(), gl.getcontrol2(),
						gl.getend2());
			} else if (flag == 0) {
				gl.getend1().setLocation(gl.getend1().x + dx,
						gl.getend1().y + dy);
				gl.getstart2().setLocation(gl.getstart2().x + dx,
						gl.getstart2().y + dy);
				gl.getcontrol2().setLocation(gl.getcontrol2().x + dx,
						gl.getcontrol2().y + dy);
				gl.getctrl2().setLocation((int) ((gl.getcontrol2().x) - 4),
						(int) ((gl.getcontrol2().y) - 4));
				gl.getcontrol1().setLocation(gl.getcontrol1().x + dx,
						gl.getcontrol1().y + dy);
				gl.getctrl1().setLocation((int) ((gl.getcontrol1().x) - 4),
						(int) ((gl.getcontrol1().y) - 4));
				gl.getQuad1().setCurve(gl.getstart1(), gl.getcontrol1(),
						gl.getend1());
				gl.getQuad2().setCurve(gl.getstart2(), gl.getcontrol2(),
						gl.getend2());
			}
			dr.add(gl.getDirtyBounds());
		}
		markDirty(dr);
	}
	/**
	 * Returns an iterator of all of our children's links. Returns an empty
	 * iterator if we aren't expandable, or have not children, or they don't
	 * have links.
	 */
	public Collection getChildLinks(GraphicViewElement gve) {
		Vector ll = new Vector();
		if (!gve.isExpandable()) {
			//we're done
		} else {
			Iterator children = gve.getChildren().iterator();
			while (children.hasNext()) {
				GraphicViewObject curr = (GraphicViewObject) children.next();
				Iterator i = curr.getLinks().iterator();
				while (i.hasNext()) {
					GraphicViewLink gvl = (GraphicViewLink) i.next();
					if (!ll.contains(gvl)) {
						ll.add(gvl);
					}
				}
			}
		}
		return ll;
	}
	/**
	 * Recursively finds the bounds of all links attached to the given object
	 * (and so on), and adds the dirtyBounds of the object itself.
	 */
	private Rectangle getLinksBounds(GraphicViewObject gvo) {
		Rectangle r = gvo.getDirtyBounds();
		Iterator links = gvo.getLinks().iterator();
		while (links.hasNext()) {
			GraphicViewLink l = (GraphicViewLink) links.next();
			r.add(getLinksBounds(l));
		}
		return r;
	}
	/**
	 * Grow the current viewbounds to include the passed rectangle plus a
	 * margin.
	 * 
	 * @param the
	 *            rectangle to be included in the current viewbounds
	 */
	private void extendViewBounds(Rectangle r) {
		// if we move out of the current bounds, we then grow the bounds by
		// a few hundred.
		int m = 50;
		Rectangle rplusm = new Rectangle(r.x - m, r.y - m, r.width + m + m,
				r.height + m + m);
		viewbounds = viewbounds.union(new Rectangle(rplusm));
		setViewDirty();
	}
	public void closeView(PluginMethod method) {
		getGraphicViewCanvas().getGraphicViewFrame().closeFrame(method, true);
	}
	/**
	 * @param frame
	 */
	public void setFrame(GraphicViewFrame frame) {
		_frame = frame;
	}
	/**
	 * @return _frame
	 */
	public GraphicViewFrame getFrame() {
		return _frame;
	}
	/* 
	 * @return the path to an existing file 
	 */
	public static File getOpenFileAndDirectory(GraphicViewFrame _frame, String currentfile, String ext) {
		File sFile;
		String cd = GraphicViewCanvas.get_user_dir(currentfile);
		JFileChooser fc = new JFileChooser(new File("*.tel"));
		fc.setCurrentDirectory(new File(cd));
		// find file extension to use
		String extensions[] = ext.split(";");
		for (int i=extensions.length-1; i>=0; i--) {
			String extension = extensions[i];
			fc.addChoosableFileFilter(new MyFileFilter(extension, i==0));
		}
		fc.showOpenDialog(_frame);
		sFile = fc.getSelectedFile();
		if (sFile!=null) {
			if (sFile.getParent()!=null) {
				cd = sFile.getParent();
			}
		}
		return sFile;		
	}

	/**
	 * 
	 * @uml.property name="undo"
	 * @uml.associationEnd multiplicity="(0 1)"
	 */
	Undo undo = new Undo();

	/**
	 * 
	 * @uml.property name="undo"
	 */
	/* (non-Javadoc)
	 * @see edu.toronto.cs.ome.OME.View#getUndo()
	 */
	public Undo getUndo() {
		return undo;
	}

	public void markSelectedElements(String string) {
		Collection allelements = getAllElements();
		for (Iterator i = allelements.iterator(); i.hasNext();) {
			GraphicViewElement vo = (GraphicViewElement) i.next();
			if (vo.isSelected())
			 markElement(vo, string);
		}
	}

	private void markElement(GraphicViewElement vo, String string) {
		if (vo != null) {
			ModelObject mo = vo.getModelObject();
			update_label(string, mo);
			update_feature(string, mo);
			update_control(string, mo);
		}		
	}

	/**
	 * @param string
	 * @param mo
	 */
	private void update_label(String string, ModelObject mo) {
		update_attr("label", string, mo);
	}
	private void update_feature(String string, ModelObject mo) {
		update_attr("feature", string, mo);
	}
	private void update_control(String string, ModelObject mo) {
		update_attr("control", string, mo);
	}
	private void update_attr(String attrname, String string, ModelObject mo) {
		ModelAttribute att = mo.getAttribute(attrname);
		if (att!=null) {
			TelosParserIndividual t = (TelosParserIndividual)att.getTarget();
			String o = "";
			if (t!=null)
				o = t.telosName();
			Iterator i = att.getPossibleTargets();
			while (i.hasNext()) {
				TelosParserIndividual in = (TelosParserIndividual)i.next();
				String target = in.telosName();
				boolean ignore = false;
				if (attrname.equals("label")) {
					if (string.indexOf("Weakly")>=0) {
						TelosParserIndividual type =(TelosParserIndividual)((TelosElement)mo).getType(); 
						if (type.telosName().indexOf("Soft")<0) {
							D.o("Info: ignored when setting partial label to non-softgoal element");
							ignore = true;
						} 
					}
					if (!ignore) {
						float sd[] = Computing.labelToSD(string);
						((TelosElement)mo).setSat(sd[0]);
						((TelosElement)mo).setDen(sd[1]);
					}
				}
				if (!ignore) {
					if (target.equals(string)) {
						if (!target.equals(o)) {
							att.setTarget(in);
						} else {
							att.clearTarget();						
						}
						break;
					}
				} else
					break;
			}
		}
	}

	public void highlightSelectedElements() {
		Collection allelements = getAllElements();
		for (Iterator i = allelements.iterator(); i.hasNext();) {
			GraphicViewElement vo = (GraphicViewElement) i.next();
			if (vo.isSelected())
			   vo.setHighlighted(!vo.isHighlighted());
		}
	}

	public void selectHighlightElements() {
		Collection allelements = getAllElements();
		for (Iterator i = allelements.iterator(); i.hasNext();) {
			GraphicViewElement vo = (GraphicViewElement) i.next();
			if (vo.isHighlighted())
			   vo.setSelected(!vo.isSelected());
		}
	}

	public void clearSelectedElements() {
		Collection allelements = getAllElements();
		for (Iterator i = allelements.iterator(); i.hasNext();) {
			GraphicViewElement vo = (GraphicViewElement) i.next();
			if (vo.isSelected()) {
				ModelObject mo = vo.getModelObject();
				clear_attr("label", mo);
//				clear_attr("feature", mo);
//				clear_attr("control", mo);			   
			}
		}
	}

	private void clear_attr(String string, ModelObject mo) {
		ModelAttribute att = mo.getAttribute(string);
		if (att!=null) {
			try {
			Iterator i = att.getPossibleTargets();
			while (i.hasNext()) {
				TelosParserIndividual in = (TelosParserIndividual)i.next();
				String target = in.telosName();
				if (target.equals(string)) {
					if (string.equals("label")) {
						((TelosElement)mo).setSat(0);
						((TelosElement)mo).setDen(0);					
					}
					att.clearTarget();						
				}
			}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public void incPriorityElements() {
		Collection allelements = getAllElements();
		for (Iterator i = allelements.iterator(); i.hasNext();) {
			GraphicViewElement vo = (GraphicViewElement) i.next();
			if (vo.isSelected())
				vo.setPriority(1+vo.getPriority());
		}
	}

	public void decPriorityElements() {
		Collection allelements = getAllElements();
		for (Iterator i = allelements.iterator(); i.hasNext();) {
			GraphicViewElement vo = (GraphicViewElement) i.next();
			if (vo.isSelected())
				if (vo.getPriority()>0)
					vo.setPriority(vo.getPriority()-1);
		}
	}

	public void selectTopElements() {
		Collection allelements = getAllElements();
		for (Iterator i = allelements.iterator(); i.hasNext();) {
			GraphicViewElement vo = (GraphicViewElement) i.next();
			if (vo.isExpandable())
				continue;
			boolean isRoot = true;
			// deselect all first
			vo.setSelected(false);
			for (Iterator j = vo.getLinks().iterator(); j.hasNext();) {
				GraphicViewLink vl = (GraphicViewLink) j.next();
				if (vl.getFrom().getID() == vo.getID() && !((TelosLink)vl.getModelLink()).isDependency()
					|| vl.getTo().getID() == vo.getID() && ((TelosLink)vl.getModelLink()).isDependency()) {
					isRoot = false;
				}
			}
			if (isRoot) {
				vo.setSelected(true);
			}
		}
	}

	public Point getCentre(String name) {
		Collection allelements = getAllElements();
		for (Iterator i = allelements.iterator(); i.hasNext();) {
			GraphicViewElement vo = (GraphicViewElement) i.next();
			if (name.equalsIgnoreCase("Element_" + vo.getID())) {
				return vo.getCentre();
			}
		}
		return new Point(0, 0);		
	}
	
	public void selectBottomElements() {
		Collection allelements = getAllElements();
		for (Iterator i = allelements.iterator(); i.hasNext();) {
			GraphicViewElement vo = (GraphicViewElement) i.next();
			if (vo.isExpandable())
				continue;
			// deselect all first
			vo.setSelected(false);
			boolean isRoot = true;
			for (Iterator j = vo.getLinks().iterator(); j.hasNext();) {
				GraphicViewLink vl = (GraphicViewLink) j.next();
				if (vl.getTo().getID() == vo.getID() && !((TelosLink)vl.getModelLink()).isDependency()
						|| vl.getFrom().getID() == vo.getID() && ((TelosLink)vl.getModelLink()).isDependency()) {
					isRoot = false;
				}
			}
			if (isRoot) {
				vo.setSelected(true);
			}
		}
	}

	/**
	 * @param modelfile
	 * @return
	 */
	public static GraphicView loadViewFromFile(String modelfile) {
		File file = new File(modelfile);
		View view = null;
		if (file != null && file.exists()) {
			String args[] = new String[1];
			args[0] = file.getAbsolutePath();
			//OMETab.main(args);
			ModelManager mm = new ModelManager(null);
			File f = ModelManager.apply_xslt(new File(modelfile));
			modelfile = f.getAbsolutePath();
			TelosModel model = (TelosModel) mm.openModel(modelfile);
			if (model != null) {
				Iterator i = model.getViewManager().getViews();
				while (view==null && i.hasNext())
					view = (View) i.next();
			}
		}
		return (GraphicView) view;
	}

	public void findObject() {
		gvc.openSearchBox();
	}

	public Dimension match(String text) {
		Collection allelements = getAllElements();
		GraphicViewElement first = null;;
		for (Iterator i = allelements.iterator(); i.hasNext();) {
			GraphicViewElement vo = (GraphicViewElement) i.next();
			if (vo.isExpandable() && vo.partially_hidden)
				continue;
			// deselect all first
			vo.setSelected(false);
			vo.setHighlighted(false);
			if (vo.getName().indexOf(text)>=0) {				
				if (first==null)
					first = vo;
				vo.setHighlighted(true);
			}
		}
		if (first!=null) {
			first.setSelected(true);
			return new Dimension(first.getImageBounds().x, first.getImageBounds().y);
		}
		return null;
	}

	public void selectSatisfied(OMEModel model2) {
		Collection allelements = getAllElements();
		for (Iterator i = allelements.iterator(); i.hasNext();) {
			GraphicViewElement vo = (GraphicViewElement) i.next();
			if (((TelosElement)vo.getModelElement()).getSat() > ((TelosElement)vo.getModelElement()).getDen()) {
				vo.setHidden(false);
			} else {
				if (vo instanceof GraphicViewElement && !((GraphicViewElement)vo).isExpandable())
					vo.setHidden(true);				
			}
		}
	}

	public Iterator getAllObjects() {
		Vector ll = new Vector();
		ll.addAll(getAllElements());
		ll.addAll(getAllLinks());
		return ll.iterator();
	}
	Collection pastingElements, pastingLinks;
  	/** get current Obj in clipboard, if none,
     * it is not possible to paste anything right now
     */
	public boolean Pastable() {
	     pastingElements=getElementsInClipboard();
	     pastingLinks=getLinksInClipboard();
	     boolean noPasteElemt =(  (null==pastingElements) || pastingElements.isEmpty()  );
	     boolean noPasteLink = (  (null==pastingLinks )   || pastingLinks.isEmpty()     );
	     return !(noPasteElemt && noPasteLink);
	}
}
	
