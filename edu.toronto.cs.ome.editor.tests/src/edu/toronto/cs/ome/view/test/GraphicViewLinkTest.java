package edu.toronto.cs.ome.view.test;

import java.util.Collection;
import java.util.Iterator;
import java.util.Vector;

import edu.toronto.cs.ome.controller.Choice;
import edu.toronto.cs.ome.model.OMEFramework;
import edu.toronto.cs.ome.model.TelosLink;
import edu.toronto.cs.ome.view.GraphicView;
import edu.toronto.cs.ome.view.GraphicViewLink;
import edu.toronto.cs.ome.view.View;
import edu.toronto.cs.ome.view.ViewObject;
import edu.toronto.cs.telos.TelosParserIndividual;
import edu.toronto.cs.util.D;

public class GraphicViewLinkTest extends ViewTest {

	public GraphicViewLinkTest() {
		super("test/edu.toronto.cs.ome.view.GraphViewLink", ".tel");
	}
	
	public static void main(String[] args) {
		junit.textui.TestRunner.run(GraphicViewLinkTest.class);
	}

	/*
	 * Test method for 'edu.toronto.cs.ome.view.GraphicViewLink.getImageBounds()'
	 */
	public void testGetImageBounds() {

	}

	/*
	 * Test method for 'edu.toronto.cs.ome.view.GraphicViewLink.getSelectableBounds()'
	 */
	public void testGetSelectableBounds() {

	}

	/*
	 * Test method for 'edu.toronto.cs.ome.view.GraphicViewLink.getDirtyBounds()'
	 */
	public void testGetDirtyBounds() {

	}

	/*
	 * Test method for 'edu.toronto.cs.ome.view.GraphicViewLink.getImage()'
	 */
	public void testGetImage() {

	}

	/*
	 * Test method for 'edu.toronto.cs.ome.view.GraphicViewLink.getCentre()'
	 */
	public void testGetCentre() {

	}

	/*
	 * Test method for 'edu.toronto.cs.ome.view.GraphicViewLink.setHidden(boolean)'
	 */
	public void testSetHidden() {

	}

	/*
	 * Test method for 'edu.toronto.cs.ome.view.GraphicViewLink.isHidden()'
	 */
	public void testIsHidden() {

	}

	/*
	 * Test method for 'edu.toronto.cs.ome.view.GraphicViewLink.getScale()'
	 */
	public void testGetScale() {

	}

	/*
	 * Test method for 'edu.toronto.cs.ome.view.GraphicViewLink.setScale(double)'
	 */
	public void testSetScale() {

	}

	/*
	 * Test method for 'edu.toronto.cs.ome.view.GraphicViewLink.reset()'
	 */
	public void testReset() {

	}

	/*
	 * Test method for 'edu.toronto.cs.ome.view.GraphicViewLink.GraphicViewLink(ModelLink, GraphicView)'
	 */
	public void testGraphicViewLink() {

	}

	/*
	 * Test method for 'edu.toronto.cs.ome.view.GraphicViewLink.getModel()'
	 */
	public void testGetModel() {

	}

	/*
	 * Test method for 'edu.toronto.cs.ome.view.GraphicViewLink.addLink(OMELink)'
	 */
	public void testAddLink() {

	}

	/*
	 * Test method for 'edu.toronto.cs.ome.view.GraphicViewLink.getType()'
	 */
	public void testGetType() {

	}

	/*
	 * Test method for 'edu.toronto.cs.ome.view.GraphicViewLink.getColor()'
	 */
	public void testGetColor() {

	}

    public static final String TOCAT[] = {"to"};
    public static final String TO = "to";
    public static final String DEFAULTNAME = "defaultname";
	/*
	 * Test method for 'edu.toronto.cs.ome.view.GraphicViewLink.setType(Object)'
	 */
	public void testSetType() {
		if (listed_files == null) return;
		for (int f=0; f<listed_files.size(); f++) {
			String n = (String ) listed_files.get(f);
			View view = GraphicView.loadViewFromFile(n);
			if (view==null) {
				D.o("Warning: view is null, probably the file" + n + "is not found");
				return;
			}
			OMEFramework fw = view.getModel().getFramework();
			// Create the choices
			Iterator j = fw.getAllInstantiable();
			Vector v = new Vector();
			while (j.hasNext()) {
				Choice c = new Choice();
				Object objecttype = (Object) j.next();
				if (fw.isLink(objecttype)) {
					String name = fw.getName(objecttype);
					c.setName(name);
					System.out.println(name);
					c.setChoiceObject(fw.getType(name));
					v.add(c);
				}
			}
			Collection alllinks = view.getAllLinks();
			int s = 0;
			for (Iterator i = alllinks.iterator(); i.hasNext();) {
				ViewObject vo = (ViewObject) i.next();
					try {
						GraphicViewLink linkobject = (GraphicViewLink) vo;
						junit.framework.Assert.assertTrue("non-empty links", linkobject!=null);
						Object type = null;
//						Object oldtype;
						// get the Make Contribution Link choice
						Choice c = (Choice) v.get(10);
						type = c.choiceObject();
						// and go
						if (type != null) {
//							oldtype = linkobject.getType();
							try {
								int y1 = countAttributes(linkobject);								
//								D.o("[oldtype]\n" +JTelosUtil.telosDeclaration((Proposition)oldtype));
//								D.o("[type]\n" +JTelosUtil.telosDeclaration((Proposition)type));
//								String defaultname = ""+((TelosParserIndividual)type).directAttributes(DEFAULTNAME)[0].to();
//								D.o(defaultname);
//								TelosLink ml = (TelosLink) linkobject.getModelLink();
//								TelosParserIndividual in = (TelosParserIndividual) ml.individual;
//								D.o("[linkobject]\n" +JTelosUtil.telosDeclaration(in));
//								linkobject.setType(type);
								((TelosLink)linkobject.getModelLink()).setType(type);
								int y2 = countAttributes(linkobject);
								junit.framework.Assert.assertTrue("same number of attributes", y1 == y2);
//								OMEObject o = linkobject.getTo();								
//								System.out.println(o.getName());
							} catch (Exception e) {
								e.printStackTrace();
								junit.framework.Assert.assertTrue("getTo error", false);
							}
						}						
						s ++;
					} catch (Exception e) {
						e.printStackTrace();
					}
			}
			junit.framework.Assert.assertTrue("non-empty links", s > 0);
		}
	}

	/**
	 * @param linkobject
	 * @param y
	 * @return
	 */
	private int countAttributes(GraphicViewLink linkobject) {
		TelosLink ml = (TelosLink) linkobject.getModelLink();
		TelosParserIndividual in = (TelosParserIndividual) ml.individual;
		return in.attributes.size();
	}

	/*
	 * Test method for 'edu.toronto.cs.ome.view.GraphicViewLink.getID()'
	 */
	public void testGetID() {

	}

	/*
	 * Test method for 'edu.toronto.cs.ome.view.GraphicViewLink.setID(int)'
	 */
	public void testSetID() {

	}

	/*
	 * Test method for 'edu.toronto.cs.ome.view.GraphicViewLink.getTo()'
	 */
	public void testGetTo() {

	}

	/*
	 * Test method for 'edu.toronto.cs.ome.view.GraphicViewLink.setTo(OMEObject)'
	 */
	public void testSetTo() {

	}

	/*
	 * Test method for 'edu.toronto.cs.ome.view.GraphicViewLink.getFrom()'
	 */
	public void testGetFrom() {

	}

	/*
	 * Test method for 'edu.toronto.cs.ome.view.GraphicViewLink.getQuad1()'
	 */
	public void testGetQuad1() {

	}

	/*
	 * Test method for 'edu.toronto.cs.ome.view.GraphicViewLink.getQuad2()'
	 */
	public void testGetQuad2() {

	}

	/*
	 * Test method for 'edu.toronto.cs.ome.view.GraphicViewLink.getstart1()'
	 */
	public void testGetstart1() {

	}

	/*
	 * Test method for 'edu.toronto.cs.ome.view.GraphicViewLink.getstart2()'
	 */
	public void testGetstart2() {

	}

	/*
	 * Test method for 'edu.toronto.cs.ome.view.GraphicViewLink.getend1()'
	 */
	public void testGetend1() {

	}

	/*
	 * Test method for 'edu.toronto.cs.ome.view.GraphicViewLink.getend2()'
	 */
	public void testGetend2() {

	}

	/*
	 * Test method for 'edu.toronto.cs.ome.view.GraphicViewLink.getcontrol1()'
	 */
	public void testGetcontrol1() {

	}

	/*
	 * Test method for 'edu.toronto.cs.ome.view.GraphicViewLink.getcontrol2()'
	 */
	public void testGetcontrol2() {

	}

	/*
	 * Test method for 'edu.toronto.cs.ome.view.GraphicViewLink.getctrl1()'
	 */
	public void testGetctrl1() {

	}

	/*
	 * Test method for 'edu.toronto.cs.ome.view.GraphicViewLink.getctrl2()'
	 */
	public void testGetctrl2() {

	}

	/*
	 * Test method for 'edu.toronto.cs.ome.view.GraphicViewLink.getinit()'
	 */
	public void testGetinit() {

	}

	/*
	 * Test method for 'edu.toronto.cs.ome.view.GraphicViewLink.setinit(int)'
	 */
	public void testSetinit() {

	}

	/*
	 * Test method for 'edu.toronto.cs.ome.view.GraphicViewLink.init()'
	 */
	public void testInit() {

	}

	/*
	 * Test method for 'edu.toronto.cs.ome.view.GraphicViewLink.setFrom(OMEObject)'
	 */
	public void testSetFrom() {

	}

	/*
	 * Test method for 'edu.toronto.cs.ome.view.GraphicViewLink.getModelLink()'
	 */
	public void testGetModelLink() {

	}

	/*
	 * Test method for 'edu.toronto.cs.ome.view.GraphicViewLink.isIconified()'
	 */
	public void testIsIconified() {

	}

	/*
	 * Test method for 'edu.toronto.cs.ome.view.GraphicViewLink.getIcon()'
	 */
	public void testGetIcon() {

	}

	/*
	 * Test method for 'edu.toronto.cs.ome.view.GraphicViewLink.setIconified(ViewObject)'
	 */
	public void testSetIconified() {

	}

	/*
	 * Test method for 'edu.toronto.cs.ome.view.GraphicViewLink.getSelectableControlBounds1()'
	 */
	public void testGetSelectableControlBounds1() {

	}

	/*
	 * Test method for 'edu.toronto.cs.ome.view.GraphicViewLink.getSelectableControlBounds2()'
	 */
	public void testGetSelectableControlBounds2() {

	}

	/*
	 * Test method for 'edu.toronto.cs.ome.view.GraphicViewLink.getLocation()'
	 */
	public void testGetLocation() {

	}

	/*
	 * Test method for 'edu.toronto.cs.ome.view.GraphicViewLink.getRotation()'
	 */
	public void testGetRotation() {

	}

	/*
	 * Test method for 'edu.toronto.cs.ome.view.GraphicViewLink.getStroke()'
	 */
	public void testGetStroke() {

	}

	/*
	 * Test method for 'edu.toronto.cs.ome.view.GraphicViewLink.isSelected()'
	 */
	public void testIsSelected() {

	}

	/*
	 * Test method for 'edu.toronto.cs.ome.view.GraphicViewLink.setSelected(boolean)'
	 */
	public void testSetSelected() {

	}

	/*
	 * Test method for 'edu.toronto.cs.ome.view.GraphicViewLink.move(int, int)'
	 */
	public void testMove() {

	}

	/*
	 * Test method for 'edu.toronto.cs.ome.view.GraphicViewLink.toggleIntention()'
	 */
	public void testToggleIntention() {

	}

	/*
	 * Test method for 'edu.toronto.cs.ome.view.GraphicViewLink.toggleLabel()'
	 */
	public void testToggleLabel() {

	}

}
