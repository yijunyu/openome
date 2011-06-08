package edu.toronto.cs.openome.testing;

import static org.eclipse.swtbot.swt.finder.SWTBotAssert.assertVisible;
import static org.junit.Assert.*;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gmf.runtime.notation.impl.DiagramImpl;
import org.eclipse.swt.SWT;
import org.eclipse.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.eclipse.swtbot.eclipse.gef.finder.SWTGefBot;
import org.eclipse.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditPart;
import org.eclipse.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditor;
import org.eclipse.swtbot.swt.finder.keyboard.Keyboard;
import org.eclipse.swtbot.swt.finder.keyboard.KeyboardFactory;
import org.eclipse.swtbot.swt.finder.keyboard.Keystrokes;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import edu.toronto.cs.openome_model.Model;
import edu.toronto.cs.openome_model.impl.ModelImpl;

public class Deletion {
    private static SWTBotGefEditor editor;
    private static Keyboard keyboard;
    // Different types of delete, as specified by doDelete()
    private static String[] typesOfDelete = {"delete", "backspace", "context"};

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        TestUtil.initializeWorkspace();
        editor = new SWTGefBot().gefEditor("test.ood");
        keyboard = KeyboardFactory.getDefaultKeyboard(editor.getWidget(), null);
    }
    
    @Before
    public void setUpBeforeTest() throws Exception {
        //TODO
    }
    
    @Test
    public void canDeleteOneActor() throws Exception {
        SWTBotGefEditPart diagram = editor.mainEditPart();
        Model model = TestUtil.getModel(editor);
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
        SWTBotGefEditPart diagram = editor.mainEditPart();
        Model model = TestUtil.getModel(editor);
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
    public void canDeleteMultipleIntentions() throws Exception {
        SWTBotGefEditPart diagram = editor.mainEditPart();
        Model model = TestUtil.getModel(editor);
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
    
    @After
    public void tearDownAfterTest() throws Exception {
        //TODO
    }
    
    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        editor.close();
    }

}