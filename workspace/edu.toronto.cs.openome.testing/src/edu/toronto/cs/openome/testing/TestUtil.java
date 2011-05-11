package edu.toronto.cs.openome.testing;

import org.eclipse.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.eclipse.swtbot.eclipse.gef.finder.SWTGefBot;
import org.eclipse.swtbot.swt.finder.exceptions.WidgetNotFoundException;
import org.eclipse.swtbot.swt.finder.junit.SWTBotJunit4ClassRunner;
import org.eclipse.swtbot.swt.finder.utils.SWTBotPreferences;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotMenu;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotShell;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTree;

public class TestUtil {
	public static SWTWorkbenchBot bot = new SWTWorkbenchBot();
	public static String projectName = "OMETest";
	public static String diagramName = "test.ood";
	
	public static void initializeWorkspace(){
		// slow down tests
		SWTBotPreferences.PLAYBACK_DELAY = 10;
		// increase timeout to 10 seconds
		SWTBotPreferences.TIMEOUT = 10000;
		
		try {
			bot.viewByTitle("Welcome").close();
		} catch (WidgetNotFoundException e) {
			//do nothing - Welcome screen is already closed
		}
		
		SWTBotTree packageTree = bot.viewByTitle("Package Explorer").bot().tree();
		packageTree.setFocus();
		try {
			packageTree.getTreeItem(projectName);
		} catch (WidgetNotFoundException e) {
			createNewProject();
		}
		
		
		
		try {
			bot.editorByTitle(diagramName).getWidget();
			new SWTGefBot().gefEditor(diagramName).clear();
		} catch (WidgetNotFoundException e) {
			createNewDiagram();
		}
		
	}

	public static void createNewProject() {
		
		//Create the project
		bot.menu("File").menu("New").menu("Project...").click();
 
		SWTBotShell shell = bot.shell("New Project");
		shell.activate();
		
		bot.tree().expandNode("General").select("Project").click();
		
		bot.button("Next >").click();
 
		bot.textWithLabel("Project name:").setText(projectName);
 
		bot.button("Finish").click();
		
	}

	public static void createNewDiagram() {
		//if we already have a diagram on the screen, we do not need to do this
		
		bot.menu("File").menu("New").menu("Other...").click();		
		SWTBotShell shell = bot.shell("New");
		shell.activate();
		
		bot.tree().expandNode("OpenOME").select("Diagram (ood)");
		bot.button("Next >").click();
		
		bot.tree().select(projectName);
		bot.textWithLabel("Enter or select the parent folder:").setText(projectName);
		bot.textWithLabel("File name:").setText(diagramName);
		//bot.button("Next >").click();
		
		bot.tree().select(projectName);
		bot.button("Finish").click();
		
	}
}