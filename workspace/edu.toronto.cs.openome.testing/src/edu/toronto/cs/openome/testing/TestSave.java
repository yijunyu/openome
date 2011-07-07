package edu.toronto.cs.openome.testing;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.eclipse.swtbot.eclipse.gef.finder.SWTGefBot;
import org.eclipse.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditPart;
import org.eclipse.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditor;
import org.eclipse.swtbot.swt.finder.exceptions.WidgetNotFoundException;
import org.eclipse.swtbot.swt.finder.junit.SWTBotJunit4ClassRunner;
import org.eclipse.swtbot.swt.finder.keyboard.KeyboardFactory;
import org.eclipse.swtbot.swt.finder.keyboard.Keystrokes;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotShell;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import edu.toronto.cs.openome_model.Model;
import edu.toronto.cs.openome_model.impl.ActorImpl;

@RunWith(SWTBotJunit4ClassRunner.class)
public class TestSave {
	
	private static SWTBotGefEditor editor;
	
	@BeforeClass
    public static void setUpBeforeClass() throws Exception {
		System.setProperty("isTest", "true");
        TestUtil.initializeWorkspace();
    }

    @Before
    public void setUpBeforeTest() throws Exception {
        TestUtil.createAndOpenFile();
        editor = new SWTGefBot().gefEditor("test.ood");
        TestUtil.bot.editorByTitle(TestUtil.diagramName).setFocus();
		TestUtil.bot.menu("Window").menu("Navigation").menu("Maximize Active View or Editor").click();
    }

    @After
    public void tearDownAfterTest() throws Exception {
        TestUtil.closeAndDeleteFile();
    }
    
//	@Test
	public void SaveFile() throws Exception{
		try{
			Boolean flag = false;
			SWTWorkbenchBot bot = TestUtil.bot;
			String name = "TestActor";
			
			// Draw an actor
			editor.activateTool("Actor");
			editor.click(0, 0);
			editor.directEditType(name);
			
			bot.menu("File").menu("Save").click();
			Thread.sleep(500);
			DataInputStream in = new DataInputStream(new FileInputStream("D:/Documents/Work/UofT/Eclipse/junit-workspace/OMETest/test.ood"));
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String strLine;
			while ((strLine = br.readLine()) != null){
				if (strLine.contains("<containers") && strLine.contains("Actor") && strLine.contains("TestActor")){
					flag = true;
				}
			}
			assertTrue("The file does not contain an Actor", flag);
			editor.clickContextMenu("Delete from Model");
		}catch (WidgetNotFoundException e) {
			fail("Could not save file properly");
		}
	}
	
//	@Test
	public void SaveFileKey() throws Exception{
		try{
			
			Boolean flag = false;
			String name = "TestGoal";
			
			editor.activateTool("Hardgoal");
			editor.click(0, 0);
			editor.directEditType(name);

            KeyboardFactory.getAWTKeyboard().pressShortcut(SWT.CTRL, 's');
			Thread.sleep(500);
			DataInputStream in = new DataInputStream(new FileInputStream("D:/Documents/Work/UofT/Eclipse/junit-workspace/OMETest/test.ood"));
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String strLine;
			while ((strLine = br.readLine()) != null){
				if (strLine.contains("<intentions") && strLine.contains("Goal") && strLine.contains("TestGoal")){
					flag = true;
				}
			}
			assertTrue("The file does not contain a Goal", flag);
			editor.clickContextMenu("Delete from Model");
		}catch (WidgetNotFoundException e) {
			fail("Could not save file properly");
		}
	}
}