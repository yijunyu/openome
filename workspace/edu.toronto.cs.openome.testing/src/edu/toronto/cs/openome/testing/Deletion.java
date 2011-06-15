package edu.toronto.cs.openome.testing;

import static org.junit.Assert.*;

import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.swtbot.eclipse.gef.finder.SWTGefBot;
import org.eclipse.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditPart;
import org.eclipse.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditor;
import org.eclipse.swtbot.swt.finder.keyboard.KeyboardFactory;
import org.eclipse.swtbot.swt.finder.keyboard.Keystrokes;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import edu.toronto.cs.openome_model.Model;
import edu.toronto.cs.openome_model.diagram.edit.parts.ActorEditPart;
import edu.toronto.cs.openome_model.diagram.edit.parts.GoalEditPart;
import edu.toronto.cs.openome_model.diagram.edit.parts.ResourceEditPart;
import edu.toronto.cs.openome_model.diagram.edit.parts.RoleEditPart;

public class Deletion  {
    private static SWTBotGefEditor editor;
    private static SWTBotGefEditPart diagram;
    private static Model model;
    // Different types of delete, as specified by doDelete()
    private static String[] typesOfDelete = {"delete", "backspace", "context"};
    private static String[][] allLinks = { TestUtil.hardlinks, TestUtil.contributions};

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        TestUtil.initializeWorkspace();
    }
    
    @Before
    public void setUpBeforeTest() throws Exception {
        TestUtil.createAndOpenFile();
        editor = new SWTGefBot().gefEditor("test.ood");
        diagram = editor.mainEditPart();
        model = TestUtil.getModel(editor);
    }
    
    @After
    public void tearDownAfterTest() throws Exception {
        TestUtil.closeAndDeleteFile();
    }
    
    @Test
    public void cannotDeleteNothing() throws InterruptedException {
        
        for (String type : typesOfDelete) {
            // Try to do a simple delete
            doDelete(type);
            
            // check that we can still add things and everything works more-or-less correctly.
            editor.activateTool("Softgoal");
            editor.click(0, 0);
            editor.directEditType("a");
            
            assertTrue(type.concat(": Could add to the diagram"), diagram.children().size() == 1);
            assertTrue(type.concat(": Could add to the model"), model.getIntentions().size() == 1);
            // remove that element, so that the other tests can do their job.
            doDelete(type);
        }
    }
    
    @Test
    public void canDeleteOneActor() throws Exception {
        String name;
        
        assertTrue("Diagram is empty", diagram.children().isEmpty());
        
        // loop over every actor
        for (String tool : TestUtil.actors) {
            name = tool;
            
            // loop over every delete type.
            for (String type : typesOfDelete) {
                editor.activateTool(tool);
                editor.click(3, 3);
                editor.directEditType(name);
                
                assertTrue(type.concat(": Element was created"), model.getContainers().size() == 1);
                assertTrue(type.concat(": Diagram does contain an element"), diagram.children().size() == 1);
               
                editor.getEditPart(name).focus();   
                doDelete(type);
                
                assertTrue(type.concat(": Diagram is empty."), diagram.children().isEmpty());
                assertTrue(type.concat(": Model is empty."), model.getContainers().isEmpty());
            }
        }
    }

    @Test
    public void canDeleteOneIntention() throws Exception {
        String name;
        
        assertTrue("Diagram is empty", diagram.children().isEmpty());
        
        // loop over every intention
        for (String tool : TestUtil.intentions) {
            name = tool;
            
            // loop over every delete type.
            for (String type : typesOfDelete) {
                editor.activateTool(tool);
                editor.click(3, 3);
                editor.directEditType(name);
                
                assertTrue(type.concat(": Element was created"), model.getIntentions().size() == 1);
                assertTrue(type.concat(": Diagram does contain an element"), diagram.children().size() == 1);
                
                editor.getEditPart(name).focus();   
                doDelete(type);
                
                assertTrue(type.concat(": Diagram is empty."), diagram.children().isEmpty());
                assertTrue(type.concat(": Model is empty."), model.getIntentions().isEmpty());
            }
        }
    }
    
    @Test
    public void canDeleteMultipleIntentionsIndependently() throws Exception {
        String name;
        int count = 0;

        assertTrue("Diagram is empty", diagram.children().isEmpty());

        // loop over every delete type.
        for (String type : typesOfDelete) {

            // loop over every combination of intentions and add it.
            for (String tool : TestUtil.intentions) {
                name = tool;
                count++;
                
                // create one intention
                editor.activateTool(tool);
                editor.click(count*100, count*100);
                editor.directEditType(name);


                assertTrue(type.concat(": Element was created"), model.getIntentions().size() == count);
                assertTrue(type.concat(": Diagram does contain an element"), diagram.children().size() == count);
            }

            // loop over every combination of intentions and delete it.
            for (String tool : TestUtil.intentions) {
                name = tool;
                count--;
                
                editor.getEditPart(name).click();
                doDelete(type);

                assertTrue(type.concat(": Diagram has one item."), diagram.children().size() == count);
                assertTrue(type.concat(": Model has one item."), model.getIntentions().size() == count);
            }
        }
    }
    
    @Test
    public void canDeleteMultipleIntentionsSimultaneously() throws Exception {
        SWTBotGefEditPart diagram = editor.mainEditPart();
        Model model = TestUtil.getModel(editor);
        String name;

        assertTrue("Diagram is empty", diagram.children().isEmpty());

        // loop over every delete type.
        for (String type : typesOfDelete) {
            int count = 0;

            // loop over every combination of intentions and add it.
            for (String tool : TestUtil.intentions) {
                name = tool;
                count++;
                
                // create one intention
                editor.activateTool(tool);
                editor.click(count*100, count*100);
                editor.directEditType(name);


                assertTrue(type.concat(": Element was created"), model.getIntentions().size() == count);
                assertTrue(type.concat(": Diagram does contain an element"), diagram.children().size() == count);
            }
            
            // Select all of the intentions at once, and delete them.
            editor.drag(0, 0, 1000, 1000);
            assertFalse(type.concat(": All the intentions were selected"), editor.selectedEditParts().isEmpty());
            doDelete(type);

            assertTrue(type.concat(": Diagram is empty."), diagram.children().isEmpty());
            assertTrue(type.concat(": Model is empty."), model.getIntentions().isEmpty());
        }
    }
    
    @Test
    public void canDeleteLinks() throws InterruptedException {
        assertTrue("Diagram is empty", diagram.children().isEmpty());
        
        // create two intentions
        String name = "Hardgoal";
        editor.activateTool(name).click(1, 1);
        editor.directEditType(name);
        name = "Resource";
        editor.activateTool(name).click(300, 300);
        editor.directEditType(name);
        GoalEditPart hardgoal = (GoalEditPart) editor.getEditPart("Hardgoal").part().getParent();
        ResourceEditPart resource = (ResourceEditPart) editor.getEditPart("Resource").part().getParent();

        assertTrue("Elements in model", model.getIntentions().size() == 2);
        assertTrue("Elements in diagram", diagram.children().size() == 2);
        
        for (String[] links : allLinks) {
        for (String tool : links) {
            for (String type : typesOfDelete) {
                // create a link between the intentions
                editor.activateTool(tool);
                editor.drag("Resource", 3, 3);
                
                // test is running too quick, not enough time to propagate to model.
                Thread.sleep(500);
                assertTrue(type + ": Link in model", model.getDecompositions().size() == 1 
                        || model.getDependencies().size() == 1
                        || model.getContributions().size() == 1);
                assertTrue(type + ": Link in diagram", resource.getSourceConnections().size() == 1 && hardgoal.getTargetConnections().size() == 1);
                
                doDelete(type);
                
                Thread.sleep(500);
                assertTrue(type + ": Link not in model", model.getDecompositions().isEmpty() 
                        || model.getDependencies().isEmpty()
                        || model.getContributions().isEmpty());
                assertTrue(type + ": Link not in diagram", resource.getSourceConnections().isEmpty() && hardgoal.getTargetConnections().isEmpty());
            }
        }
        }
        editor.drag(0, 0, 1000, 1000);
        doDelete("");
    }
    
    @Test
    public void canDeleteLinksWhenDeletingIntentions() throws InterruptedException {
        assertTrue("Diagram is empty", diagram.children().isEmpty());
        
        // create two intentions
        String resName = "Resource";
        editor.activateTool(resName).click(300, 300);
        editor.directEditType(resName);
        ResourceEditPart resource = (ResourceEditPart) editor.getEditPart(resName).part().getParent();


        for (String[] links : allLinks) {
        for (String linkTool : links) {
            for (String type : typesOfDelete) {
                String intentionTool = "Hardgoal";
                editor.activateTool(intentionTool).click(1, 1);
                editor.directEditType(intentionTool);
                AbstractGraphicalEditPart intention = (AbstractGraphicalEditPart) editor.getEditPart(intentionTool).part().getParent();
                
                assertTrue("Elements in model", model.getIntentions().size() == 2);
                assertTrue("Elements in diagram", diagram.children().size() == 2);
                
                // create a link between the intentions
                editor.activateTool(linkTool);
                editor.drag(resName, 3, 3);
                
                // test is running too quick, not enough time to propagate to model.
                Thread.sleep(500);
                assertTrue(type + ": Link in model", model.getDecompositions().size() == 1 
                        || model.getDependencies().size() == 1
                        || model.getContributions().size() == 1);
                assertTrue(type + ": Link in diagram", resource.getSourceConnections().size() == 1 && intention.getTargetConnections().size() == 1);
                
                editor.getEditPart(intentionTool).click();
                doDelete(type);
                
                Thread.sleep(500);
                assertTrue(type + ": Link not in model", model.getDecompositions().isEmpty() 
                        || model.getDependencies().isEmpty()
                        || model.getContributions().isEmpty());
                assertTrue(type + ": Link not in diagram", resource.getSourceConnections().isEmpty());
            }
        }
        }
        editor.drag(0, 0, 1000, 1000);
        doDelete("");
    }
    
    @Test
    public void canDeleteAssociations() throws InterruptedException {
        assertTrue("Diagram is empty", diagram.children().isEmpty());
        
        // create two intentions
        String name = "Actor";
        editor.activateTool(name).click(1, 1);
        editor.directEditType(name);
        name = "Role";
        editor.activateTool(name).click(500, 500);
        editor.directEditType(name);
        ActorEditPart actor = (ActorEditPart) editor.getEditPart("Actor").part().getParent();
        RoleEditPart role = (RoleEditPart) editor.getEditPart("Role").part().getParent();

        assertTrue("Elements in model", model.getContainers().size() == 2);
        assertTrue("Elements in diagram", diagram.children().size() == 2);
        
        for (String tool : TestUtil.associations) {
            for (String type : typesOfDelete) {
                // create a link between the intentions
                editor.activateTool(tool);
                editor.drag("Role", 3, 3);
                
                // test is running too quick, not enough time to propagate to model.
                Thread.sleep(600);
                assertTrue(type + ": Link in model", model.getAssociations().size() == 1);
                assertTrue(type + ": Link in diagram", role.getSourceConnections().size() == 1 && actor.getTargetConnections().size() == 1);
                
                doDelete(type);
                
                Thread.sleep(600);
                assertTrue(type + ": Link not in model", model.getAssociations() .isEmpty());
                assertTrue(type + ": Link not in diagram", role.getSourceConnections().isEmpty() && actor.getTargetConnections().isEmpty());
            }
        }
        editor.drag(0, 0, 1000, 1000);
        doDelete("");
    }
    
    @Test
    public void canDeleteAssociationsWhenDeletingActors() throws InterruptedException {
        assertTrue("Diagram is empty", diagram.children().isEmpty());
        
        // create two intentions
        String resName = "Role";
        editor.activateTool(resName).click(500, 500);
        editor.directEditType(resName);
        RoleEditPart role = (RoleEditPart) editor.getEditPart(resName).part().getParent();


        for (String linkTool : TestUtil.associations) {
            for (String type : typesOfDelete) {
                String actorTool = "Actor";
                editor.activateTool(actorTool).click(1, 1);
                editor.directEditType(actorTool);
                AbstractGraphicalEditPart intention = (AbstractGraphicalEditPart) editor.getEditPart(actorTool).part().getParent();
                
                assertTrue("Elements in model", model.getContainers().size() == 2);
                assertTrue("Elements in diagram", diagram.children().size() == 2);
                
                // create a link between the intentions
                editor.activateTool(linkTool);
                editor.drag(resName, 10, 10);
                
                // test is running too quick, not enough time to propagate to model.
                Thread.sleep(500);
                assertTrue(type + ": Link in model", model.getAssociations().size() == 1); 
                assertTrue(type + ": Link in diagram", role.getSourceConnections().size() == 1 && intention.getTargetConnections().size() == 1);
                
                editor.getEditPart(actorTool).click();
                doDelete(type);
                
                Thread.sleep(500);
                assertTrue(type + ": Link not in model", model.getAssociations().isEmpty());
                assertTrue(type + ": Link not in diagram", role.getSourceConnections().isEmpty());
            }
        }
        editor.drag(0, 0, 1000, 1000);
        doDelete("");
    }
    /**
     * Do a deletion, depending on the type. If the type is 
     * "delete": press the delete key, 
     * "backspace": press the backspace key, 
     * for everything else: Delete from Model in the context menu. 
     * @param type the type of deletion to do
     */
    private void doDelete(String type) throws InterruptedException {
        // need to slow down the process a bit to allow all the highlights to propagate.
        Thread.sleep(100);
        if (type.equals("delete")) {
            KeyboardFactory.getAWTKeyboard().pressShortcut(Keystrokes.DELETE);
        } else if (type.equals("backspace")) {
            KeyboardFactory.getAWTKeyboard().pressShortcut(Keystrokes.BS);
        } else {
            editor.clickContextMenu("Delete from Model");
        }
    }
}