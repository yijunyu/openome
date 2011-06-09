package edu.toronto.cs.openome.testing;

import static org.eclipse.swtbot.swt.finder.SWTBotAssert.assertVisible;
import static org.junit.Assert.*;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.impl.EAttributeImpl;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.runtime.notation.impl.DecorationNodeImpl;
import org.eclipse.gmf.runtime.notation.impl.DiagramImpl;
import org.eclipse.gmf.runtime.notation.impl.DrawerStyleImpl;
import org.eclipse.gmf.runtime.notation.impl.NotationFactoryImpl;
import org.eclipse.swt.SWT;
import org.eclipse.swtbot.eclipse.gef.finder.SWTGefBot;
import org.eclipse.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditPart;
import org.eclipse.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditor;
import org.eclipse.swtbot.swt.finder.junit.SWTBotJunit4ClassRunner;
import org.eclipse.swtbot.swt.finder.keyboard.Keyboard;
import org.eclipse.swtbot.swt.finder.keyboard.KeyboardFactory;
import org.eclipse.swtbot.swt.finder.keyboard.Keystrokes;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

import edu.toronto.cs.openome_model.Actor;
import edu.toronto.cs.openome_model.Model;
import edu.toronto.cs.openome_model.diagram.edit.parts.ActorActorCompartmentEditPart;
import edu.toronto.cs.openome_model.diagram.edit.parts.ActorEditPart;
import edu.toronto.cs.openome_model.diagram.edit.parts.CompartmentEditPart;
import edu.toronto.cs.openome_model.impl.ActorImpl;
import edu.toronto.cs.openome_model.impl.AgentImpl;
import edu.toronto.cs.openome_model.impl.AndContributionImpl;
import edu.toronto.cs.openome_model.impl.AndDecompositionImpl;
import edu.toronto.cs.openome_model.impl.BreakContributionImpl;
import edu.toronto.cs.openome_model.impl.ContainerImpl;
import edu.toronto.cs.openome_model.impl.HelpContributionImpl;
import edu.toronto.cs.openome_model.impl.HurtContributionImpl;
import edu.toronto.cs.openome_model.impl.IntentionImpl;
import edu.toronto.cs.openome_model.impl.MakeContributionImpl;
import edu.toronto.cs.openome_model.impl.ModelImpl;
import edu.toronto.cs.openome_model.impl.OrContributionImpl;
import edu.toronto.cs.openome_model.impl.OrDecompositionImpl;
import edu.toronto.cs.openome_model.impl.PositionImpl;
import edu.toronto.cs.openome_model.impl.RoleImpl;
import edu.toronto.cs.openome_model.impl.SomeMinusContributionImpl;
import edu.toronto.cs.openome_model.impl.SomePlusContributionImpl;
import edu.toronto.cs.openome_model.impl.UnknownContributionImpl;
import edu.toronto.cs.openome_model.impl.openome_modelFactoryImpl;

@RunWith(SWTBotJunit4ClassRunner.class)
public class TestCollapsing {

	private static SWTBotGefEditor editor;
    private static Keyboard keyboard;
    private SWTBotGefEditPart actors;
    private final String[][] LINKS = { TestUtil.hardlinks, TestUtil.contributions};
    /*
	 * A factory that can create any class Impl
	 */
	private static openome_modelFactoryImpl factory = new openome_modelFactoryImpl();
	
	
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        TestUtil.initializeWorkspace();
        editor = new SWTGefBot().gefEditor("test.ood");
        keyboard = KeyboardFactory.getDefaultKeyboard(editor.getWidget(), null);
    }
    
    @After
    public void runAfterEveryTest() {
    	//TestUtil.closeAndDeleteFile();
    	editor.clickContextMenu("Delete from Model");
    	//editor.clear();
    }
    
    @Test
    public void testCollapseAndOpeningEmptyActors() {
    	
    	for (String actorFromList : TestUtil.actors) {
	    	actors = addActor(actorFromList, "test");
	    	CompartmentEditPart cmp = (CompartmentEditPart) actors.parent().children().get(1).part();
	    	DecorationNodeImpl decnode = (DecorationNodeImpl) actors.part().getModel();
	    	ContainerImpl actorModel = (ContainerImpl) decnode.getElement();
	    	
	    	
			assert(actorModel.getIntentions().isEmpty());
			assert(actors.children().isEmpty());
			
			// Make sure no connections exist
			assert(actors.sourceConnections().isEmpty());
			assert(actors.targetConnections().isEmpty());
			
			//Collapse the actor and waiting for it to collapse
	    	actors.click(new Point(1,1));
	    	sleep(100);
			
			//for ( SWTBotGefEditPart i : actors.parent().children()) 
				//System.out.println(i);
			
			assertTrue("Testing if " + actorFromList + " compartment is collapsed",cmp.isCollapsed());
	
			assertTrue(actorModel.getIntentions().isEmpty());
	
			
			assertTrue(actorModel.getAssociationFrom().isEmpty());
			assertTrue(actorModel.getAssociationTo().isEmpty());
			assertTrue(actorModel.getDependencyFrom().isEmpty());
			assertTrue(actorModel.getDependencyTo().isEmpty());
			if (actorFromList.equals("Actor")) {
				assertTrue(((ActorImpl)actorModel).getIs_a().isEmpty());
				assertTrue(((ActorImpl)actorModel).getIs_part_of().isEmpty());
			}
			
			actors.click(new Point(1,1));
			sleep(100);
			
			assertFalse("Testing if " + actorFromList + " compartment has opened",cmp.isCollapsed());
	
			assertTrue(actorModel.getIntentions().isEmpty());
	
			
			assertTrue(actorModel.getAssociationFrom().isEmpty());
			assertTrue(actorModel.getAssociationTo().isEmpty());
			assertTrue(actorModel.getDependencyFrom().isEmpty());
			assertTrue(actorModel.getDependencyTo().isEmpty());
			if (actorFromList.equals("Actor")) {
				assertTrue(((ActorImpl)actorModel).getIs_a().isEmpty());
				assertTrue(((ActorImpl)actorModel).getIs_part_of().isEmpty());
			}
			
			editor.clear();
			editor.select(actors.parent());
			editor.clickContextMenu("Delete from Model");
    	}
    }
    
    @Test
    public void testCollapseAndOpeningActorsWithIntentions() {

    	for (String actorsFromList : TestUtil.actors) {
	    	actors = addActor(actorsFromList, "test");
	    	
	    	DecorationNodeImpl decnode = (DecorationNodeImpl) actors.part().getModel();
	    	ContainerImpl actorModel = (ContainerImpl) decnode.getElement();
	    	CompartmentEditPart cmp = (CompartmentEditPart) actors.parent().children().get(1).part();
	    	
	    	assert(actorModel.getIntentions().isEmpty());
			assert(actors.children().isEmpty());
			
			// Make sure no connections exist
			assert(actors.sourceConnections().isEmpty());
			assert(actors.targetConnections().isEmpty());
			
			for (String intentionsFromList : TestUtil.intentions) {
				//Add an intention
				SWTBotGefEditPart intention = addIntention(intentionsFromList, "intention", 100, 100);
		
				actors.parent().select();
		    	actors.parent().click(new Point(10,10));
		    	sleep(100);
		    	
		    	assertTrue("Testing if " + actorsFromList + " with "  + intentionsFromList + " compartment is collapsed",
		    			cmp.isCollapsed());
				
				
				assertTrue(actorModel.getIntentions().size() == 1);
		
				
				assertTrue(actorModel.getAssociationFrom().isEmpty());
				assertTrue(actorModel.getAssociationTo().isEmpty());
				assertTrue(actorModel.getDependencyFrom().isEmpty());
				assertTrue(actorModel.getDependencyTo().isEmpty());
				
				actors.parent().click(new Point(10,10));
				sleep(100);
				
				assertFalse("Testing if " + actorsFromList + " with "  + intentionsFromList + " compartment is open",
		    			cmp.isCollapsed());
				
				
				assertTrue(actorModel.getIntentions().size() == 1);
		
				
				assertTrue(actorModel.getAssociationFrom().isEmpty());
				assertTrue(actorModel.getAssociationTo().isEmpty());
				assertTrue(actorModel.getDependencyFrom().isEmpty());
				assertTrue(actorModel.getDependencyTo().isEmpty());
	
				editor.select(intention.parent());
				editor.setFocus();
				editor.clickContextMenu("Delete from Model");
			}
			
			editor.clear();
			editor.select(actors.parent());
			editor.clickContextMenu("Delete from Model");
    	}
    }
    
    @Test
    public void testCollapseAndOpeningActorsWithIntentionAndLink() {

    	for (String actorsFromList : TestUtil.actors) {
	    	actors = addActor(actorsFromList, "test");
	    	
	    	DiagramImpl dImpl = (DiagramImpl) editor.mainEditPart().part().getModel();
	    	ModelImpl model = (ModelImpl) dImpl.getElement();
	    	DecorationNodeImpl decnode = (DecorationNodeImpl) actors.part().getModel();
	    	ContainerImpl actorModel = (ContainerImpl) decnode.getElement();
	    	CompartmentEditPart cmp = (CompartmentEditPart) actors.parent().children().get(1).part();
	    	
	    	assert(actorModel.getIntentions().isEmpty());
			assert(actors.children().isEmpty());
			
			// Make sure no connections exist
			assert(actors.sourceConnections().isEmpty());
			assert(actors.targetConnections().isEmpty());
			
			for (String intentionsFromList : TestUtil.intentions) {
				//Add an intention
				SWTBotGefEditPart intention = addIntention(intentionsFromList, "intention", 100, 100);
				
				DecorationNodeImpl intentionNode = (DecorationNodeImpl) intention.part().getModel();
		    	IntentionImpl intentionModel = (IntentionImpl) intentionNode.getElement();
		    	DecorationNodeImpl linkNode = null;
		    	
				for (String[] linkList : LINKS ) {
					for (String links : linkList) {
						
						assertTrue(model.getContributions().size() == 0);
						assertTrue(model.getDecompositions().size() == 0);
						assertTrue(model.getDependencies().size() == 0);
		
						SWTBotGefEditPart link = addLink(links, intention);
						
						System.out.println(actorsFromList + " " + intentionsFromList + " " + links + " " + link);
						
						if (!links.equals("Dependency") && !links.equals("Decomposition") && !links.equals("Means-ends")) {
							linkNode = (DecorationNodeImpl) link.part().getModel();
							softLinkTestingHelperFunction(intentionModel,links, linkNode);
						} else {
							hardLinksTestingHelperFunction(links, intentionModel);
						}
						
						
						actors.parent().select();
				    	actors.parent().click(new Point(10,10));
				    	sleep(100);
				    	
				    	assertTrue("Testing if " + actorsFromList + " compartment is collapsed" + " with "  
				    			+ intentionsFromList + " with " + links,
				    			cmp.isCollapsed());
						
				    	if (!links.equals("Dependency") && !links.equals("Decomposition") && !links.equals("Means-ends")) {
							softLinkTestingHelperFunction(intentionModel,links, linkNode);
						} else {
							hardLinksTestingHelperFunction(links, intentionModel);
						}
				    	
						assertTrue(actorModel.getIntentions().size() == 1);
						assertTrue(intentionModel.getAllConnected().size() == 1);
						
						assertTrue(actorModel.getAssociationFrom().isEmpty());
						assertTrue(actorModel.getAssociationTo().isEmpty());
						assertTrue(actorModel.getDependencyFrom().isEmpty());
						assertTrue(actorModel.getDependencyTo().isEmpty());
						
						actors.parent().click(new Point(10,10));
						sleep(100);
						
						assertFalse("Testing if " + actorsFromList + " compartment is open" + " with "  
								+ intentionsFromList + " with " + links ,
				    			cmp.isCollapsed());
						
						if (!links.equals("Dependency") && !links.equals("Decomposition") && !links.equals("Means-ends")) {
							softLinkTestingHelperFunction(intentionModel,links, linkNode);
						} else {
							hardLinksTestingHelperFunction(links, intentionModel);
						}
						
						assertTrue(actorModel.getIntentions().size() == 1);
				
						
						assertTrue(actorModel.getAssociationFrom().isEmpty());
						assertTrue(actorModel.getAssociationTo().isEmpty());
						assertTrue(actorModel.getDependencyFrom().isEmpty());
						assertTrue(actorModel.getDependencyTo().isEmpty());
						
						editor.clear();
						editor.select(link.parent());
						editor.setFocus();
						editor.clickContextMenu("Delete from Model");
					}
				}
	
				editor.select(intention.parent());
				editor.setFocus();
				editor.clickContextMenu("Delete from Model");
			}
			
			editor.clear();
			editor.select(actors.parent());
			editor.clickContextMenu("Delete from Model");
    	}
    }
    public void sleep (int time) {
    	try {
			Thread.sleep(time + 350);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    public SWTBotGefEditPart addActor(String actorName, String name) {
    	editor.activateTool(actorName);
		editor.click(0, 0);
		editor.directEditType(name);
		return editor.getEditPart(name);
    }
    
    public SWTBotGefEditPart addIntention(String intentionName, String name, int x, int y) {
    	editor.clear();
    	editor.activateTool(intentionName);
    	editor.click(x,y);
    	editor.directEditType(name);
    	return editor.getEditPart(name);
    }
    
    public SWTBotGefEditPart addLink(String linkName, SWTBotGefEditPart editPart) {
    	editor.clear();
    	editor.activateTool(linkName);
    	editor.click(editPart);
    	return editor.getEditPart(linkName);
    }
    
    public void hardLinksTestingHelperFunction(String linkName, IntentionImpl intentionModel) {
    	if (linkName.equals("Dependency")) {
    		System.out.println(intentionModel.getDependencyFrom().get(0).getModel());
    	}
    }
    /**
     * Helper function to test if the intention model has the specified soft links with the linkName
     * @param intentionModel
     * @param linkName
     */
    public void softLinkTestingHelperFunction(IntentionImpl intentionModel, String linkName, DecorationNodeImpl link) {
    	editor.clear();
    	if (linkName.equals("Means-ends")) {
    		assertTrue("Testing if the " + intentionModel.getName() + " has " + linkName + " link.", 
    				((OrDecompositionImpl)intentionModel.getDecompositionsFrom().get(0)).equals((OrDecompositionImpl)link.getElement()));
    		assertTrue("Testing if the " + intentionModel.getName() + " has " + linkName + " link.", 
    				((OrDecompositionImpl)intentionModel.getDecompositionsTo().get(0)).equals((OrDecompositionImpl)link.getElement()));
    	} else if (linkName.equals("Decomposition")) {
    		assertTrue("Testing if the " + intentionModel.getName() + " has " + linkName + " link.", 
    				((AndDecompositionImpl)intentionModel.getDecompositionsFrom().get(0)).equals((AndDecompositionImpl)link.getElement()));
    		assertTrue("Testing if the " + intentionModel.getName() + " has " + linkName + " link.", 
    				((AndDecompositionImpl)intentionModel.getDecompositionsTo().get(0)).equals((AndDecompositionImpl)link.getElement()));
    	} else if (linkName.equals("Make")) {
    		assertTrue("Testing if the " + intentionModel.getName() + " has " + linkName + " link.",
    				((MakeContributionImpl)(intentionModel.getContributesFrom().get(0))).equals((MakeContributionImpl)link.getElement()));
    		assertTrue("Testing if the " + intentionModel.getName() + " has " + linkName + " link.", 
    				((MakeContributionImpl)(intentionModel.getContributesTo().get(0))).equals((MakeContributionImpl)link.getElement()));
    	} else if (linkName.equals("Some+")) {
    		assertTrue("Testing if the " + intentionModel.getName() + " has " + linkName + " link.", 
    				((SomePlusContributionImpl)intentionModel.getContributesFrom().get(0)).equals((SomePlusContributionImpl)link.getElement()));
    		assertTrue("Testing if the " + intentionModel.getName() + " has " + linkName + " link.", 
    				((SomePlusContributionImpl)intentionModel.getContributesTo().get(0)).equals((SomePlusContributionImpl)link.getElement()));
    	} else if (linkName.equals("Help")) {
    		assertTrue("Testing if the " + intentionModel.getName() + " has " + linkName + " link.", 
    				((HelpContributionImpl)intentionModel.getContributesFrom().get(0)).equals((HelpContributionImpl)link.getElement()));
    		assertTrue("Testing if the " + intentionModel.getName() + " has " + linkName + " link.", 
    				((HelpContributionImpl)intentionModel.getContributesTo().get(0)).equals((HelpContributionImpl)link.getElement()));
    	} else if (linkName.equals("Unknown")) {
    		assertTrue("Testing if the " + intentionModel.getName() + " has " + linkName + " link.", 
    				((UnknownContributionImpl)intentionModel.getContributesFrom().get(0)).equals((UnknownContributionImpl)link.getElement()));
    		assertTrue("Testing if the " + intentionModel.getName() + " has " + linkName + " link.", 
    				((UnknownContributionImpl)intentionModel.getContributesTo().get(0)).equals((UnknownContributionImpl)link.getElement()));
    	} else if (linkName.equals("Hurt")) {
    		assertTrue("Testing if the " + intentionModel.getName() + " has " + linkName + " link.", 
    				((HurtContributionImpl)intentionModel.getContributesFrom().get(0)).equals((HurtContributionImpl)link.getElement()));
    		assertTrue("Testing if the " + intentionModel.getName() + " has " + linkName + " link.", 
    				((HurtContributionImpl)intentionModel.getContributesTo().get(0)).equals((HurtContributionImpl)link.getElement()));
    	} else if (linkName.equals("Some-")) {
    		assertTrue("Testing if the " + intentionModel.getName() + " has " + linkName + " link.", 
    				((SomeMinusContributionImpl)intentionModel.getContributesFrom().get(0)).equals((SomeMinusContributionImpl)link.getElement()));
    		assertTrue("Testing if the " + intentionModel.getName() + " has " + linkName + " link.", 
    				((SomeMinusContributionImpl)intentionModel.getContributesTo().get(0)).equals((SomeMinusContributionImpl)link.getElement()));
    	} else if (linkName.equals("Unknown")) {
    		assertTrue("Testing if the " + intentionModel.getName() + " has " + linkName + " link.", 
    				((UnknownContributionImpl)intentionModel.getContributesFrom().get(0)).equals((UnknownContributionImpl)link.getElement()));
    		assertTrue("Testing if the " + intentionModel.getName() + " has " + linkName + " link.", 
    				((UnknownContributionImpl)intentionModel.getContributesTo().get(0)).equals((UnknownContributionImpl)link.getElement()));
    	} else if (linkName.equals("Break")) {
    		assertTrue("Testing if the " + intentionModel.getName() + " has " + linkName + " link.", 
    				((BreakContributionImpl)intentionModel.getContributesFrom().get(0)).equals((BreakContributionImpl)link.getElement()));
    		assertTrue("Testing if the " + intentionModel.getName() + " has " + linkName + " link.", 
    				((BreakContributionImpl)intentionModel.getContributesTo().get(0)).equals((BreakContributionImpl)link.getElement()));
    	} else if (linkName.equals("AND")) {
    		assertTrue("Testing if the " + intentionModel.getName() + " has " + linkName + " link.", 
    				((AndContributionImpl)intentionModel.getContributesFrom().get(0)).equals((AndContributionImpl)link.getElement()));
    		assertTrue("Testing if the " + intentionModel.getName() + " has " + linkName + " link.", 
    				((AndContributionImpl)intentionModel.getContributesTo().get(0)).equals((AndContributionImpl)link.getElement()));
    	} else if (linkName.equals("OR")) {
    		assertTrue("Testing if the " + intentionModel.getName() + " has " + linkName + " link.", 
    				((OrContributionImpl)intentionModel.getContributesFrom().get(0)).equals((OrContributionImpl)link.getElement()));
    		assertTrue("Testing if the " + intentionModel.getName() + " has " + linkName + " link.", 
    				((OrContributionImpl)intentionModel.getContributesTo().get(0)).equals((OrContributionImpl)link.getElement()));
    	}
    }
}
