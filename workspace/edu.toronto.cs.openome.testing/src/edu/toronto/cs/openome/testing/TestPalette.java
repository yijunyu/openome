package edu.toronto.cs.openome.testing;

import org.eclipse.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.eclipse.swtbot.eclipse.gef.finder.SWTBotGefTestCase;
import org.eclipse.swtbot.eclipse.gef.finder.SWTGefBot;
import org.eclipse.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditor;
import org.eclipse.swtbot.swt.finder.exceptions.WidgetNotFoundException;
import org.eclipse.swtbot.swt.finder.junit.SWTBotJunit4ClassRunner;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotShell;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SWTBotJunit4ClassRunner.class)
public class TestPalette extends SWTBotGefTestCase {
 
	private static SWTWorkbenchBot bot;
	private static SWTGefBot gefBot;
	private SWTBotGefEditor editor;
 
	@BeforeClass
	public static void beforeClass() throws Exception {
		TestUtil.initializeWorkspace();
		bot = new SWTWorkbenchBot();
		gefBot = new SWTGefBot();		
	}
 
 
	@Test
	public void testPaletteToolNames() throws Exception {
		bot.sleep(4000);
		editor = gefBot.gefEditor("test.ood");
		try {
			editor.activateTool("Decomposition");
			editor.activateTool("Means-ends");
		} catch (WidgetNotFoundException e) {
			fail();
		}
		
	}
 
 
	@AfterClass
	public static void sleep() {
		
		bot.sleep(2000);
	}
 
}