package edu.toronto.cs.openome.testing;

import static org.junit.Assert.*;

import org.eclipse.swtbot.eclipse.gef.finder.SWTGefBot;
import org.eclipse.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditor;
import org.eclipse.swtbot.swt.finder.junit.SWTBotJunit4ClassRunner;
import org.eclipse.swtbot.swt.finder.keyboard.KeyboardFactory;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import edu.toronto.cs.openome_model.Model;

@RunWith(SWTBotJunit4ClassRunner.class)
public class TestChangeText {
	
	private static SWTBotGefEditor editor;
	
	@BeforeClass
	public static void beforeClass() throws Exception {
		TestUtil.initializeWorkspace();
		editor = new SWTGefBot().gefEditor("test.ood");
	}
	
	@Test
	public void changeTextDoubleClick() throws Exception{
		Model model = TestUtil.getModel(editor);
		String name = "TestDoubleNameChange";
		String change = "Changed";
		// Draw an actor
		assertTrue("Model is empty", model.getContainers().isEmpty());
		
		for (String intent : TestUtil.intentions){
			editor.activateTool(intent);
			editor.click(0, 0);
			editor.directEditType(name);
			
			editor.doubleClick(name);
			editor.directEditType(change);
			editor.click(1000, 1000);
			assertTrue("Intention: " + intent +"'s name does not match changed name", model.getIntentions().get(0).getName().equals(change));
			editor.click(change);
			editor.clickContextMenu("Delete from Model");
		}
		
		for (String actor : TestUtil.actors){
			editor.activateTool(actor);
			editor.click(0, 0);
			editor.directEditType(name);
			
			editor.doubleClick(name);
			editor.directEditType(change);
			editor.click(1000, 1000);
			assertTrue("Container: " + actor + "'s name does not match changed name", model.getContainers().get(0).getName().equals(change));
			editor.click(change);
			editor.clickContextMenu("Delete from Model");
		}
	}
	
	@Test
	public void changeTextSingleClick() throws Exception{
		Model model = TestUtil.getModel(editor);
		String name = "TestSingleNameChange";
		String change = "Changed";
		// Draw an actor
		assertTrue("Model is empty", model.getContainers().isEmpty());
		
		for (String intent : TestUtil.intentions){
			editor.activateTool(intent);
			editor.click(0, 0);
			editor.directEditType(name);
			
			editor.click(name);
			Thread.sleep(500);
			KeyboardFactory.getSWTKeyboard().typeText(change);
			Thread.sleep(500);
			editor.click(1000, 1000);
			Thread.sleep(500);
			assertFalse("Model has no intentions", model.getIntentions().isEmpty());
			assertTrue("Intention: " + intent +"'s name does not match changed name", model.getIntentions().get(0).getName().equals(change));
			editor.click(change);
			editor.clickContextMenu("Delete from Model");
		}
		
		for (String actor : TestUtil.actors){
			editor.activateTool(actor);
			editor.click(0, 0);
			editor.directEditType(name);
			
			editor.click(name);
			Thread.sleep(500);
			KeyboardFactory.getSWTKeyboard().typeText(change);
			Thread.sleep(500);
			editor.click(1000, 1000);
			Thread.sleep(500);
			assertFalse("Model has no actors", model.getContainers().isEmpty());
			assertTrue("Container: " + actor + "'s name does not match changed name", model.getContainers().get(0).getName().equals(change));
			editor.click(change);
			editor.clickContextMenu("Delete from Model");
		}
	}
	
	@AfterClass
	public static void afterClass() {
		editor.clear();
	}
}
