package edu.toronto.cs.openome.testing;

import org.eclipse.swtbot.eclipse.finder.SWTWorkbenchBot;
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
	public String modelName = "test.oom";
	
	
	public static void initializeWorkspace(){
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
		} catch (WidgetNotFoundException e) {
			createNewDiagram();
		}
		
	}

	public static void createNewProject() {
		
		
		//Create the project
		bot.menu("File").menu("New").menu("Project...").click();
 
		SWTBotShell shell = bot.shell("New Project");
		shell.activate();
		
		bot.tree().select("General").expandNode("General", true).select("Project");
		
		bot.button("Next >").click();
 
		bot.textWithLabel("Project name:").setText(projectName);
 
		bot.button("Finish").click();
		
	}

	public static void createNewDiagram() {
		//if we already have a diagram on the screen, we do not need to do this
		
		
		bot.sleep(2000);
		bot.menu("File").menu("New").menu("Other...").click();		
		SWTBotShell shell = bot.shell("New");
		shell.activate();
		
		bot.tree().select("OpenOME").expandNode("OpenOME", true).select("Diagram (ood)");
		bot.button("Next >").click();
		
		bot.tree().select(projectName);
		bot.textWithLabel("Enter or select the parent folder:").setText(projectName);
		bot.textWithLabel("File name:").setText(diagramName);
		bot.button("Next >").click();
		
		bot.tree().select(projectName);
		bot.button("Finish").click();
		
	}
}