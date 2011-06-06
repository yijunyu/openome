package edu.toronto.cs.openome.testing;

import static org.eclipse.swtbot.swt.finder.SWTBotAssert.assertVisible;
import static org.junit.Assert.*;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.impl.DiagramImpl;
import org.eclipse.swt.SWT;
import org.eclipse.swtbot.eclipse.gef.finder.SWTGefBot;
import org.eclipse.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditPart;
import org.eclipse.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditor;
import org.eclipse.swtbot.swt.finder.keyboard.Keyboard;
import org.eclipse.swtbot.swt.finder.keyboard.KeyboardFactory;
import org.eclipse.swtbot.swt.finder.keyboard.Keystrokes;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import edu.toronto.cs.openome_model.Model;
import edu.toronto.cs.openome_model.impl.ModelImpl;

public class Deletion {
    private static SWTBotGefEditor editor;
    private static Keyboard keyboard;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        TestUtil.initializeWorkspace();
        editor = new SWTGefBot().gefEditor("test.ood");
        keyboard = KeyboardFactory.getDefaultKeyboard(editor.getWidget(), null);
    }

    @Test
    public void canDeleteOneIntention() throws Exception {
        SWTBotGefEditPart diagram = editor.mainEditPart();
        Model model = TestUtil.getModel(editor);
        String name;
        SWTBotGefEditPart part;
        
        assertTrue("Diagram is empty", diagram.children().isEmpty());
        for (String s : TestUtil.intentions) {
            name = s;
            editor.activateTool(s);
            editor.click(3, 3);
            editor.directEditType(name);
            part = editor.getEditPart(name);
            assertTrue("Element was created", part != null);
            assertTrue("Diagram does contain an element", diagram.children().size() == 1);
//            editor.bot().activeShell().pressShortcut(Keystrokes.BS);
            editor.clickContextMenu("Delete from Model");
            assertTrue("Number of elements one less.", diagram.children().size() == 0);
            assertTrue("Model is empty.", model.getIntentions().isEmpty());
        }
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        
    }

}