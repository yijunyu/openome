package edu.toronto.cs.openome.testing;

import static org.eclipse.swtbot.swt.finder.matchers.WidgetMatcherFactory.allOf;
import static org.eclipse.swtbot.swt.finder.matchers.WidgetMatcherFactory.anyOf;
import static org.eclipse.swtbot.swt.finder.matchers.WidgetMatcherFactory.withRegex;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.impl.DiagramImpl;
import org.eclipse.swt.SWT;
import org.eclipse.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.eclipse.swtbot.eclipse.gef.finder.SWTGefBot;
import org.eclipse.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditPart;
import org.eclipse.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditor;
import org.eclipse.swtbot.swt.finder.exceptions.WidgetNotFoundException;
import org.eclipse.swtbot.swt.finder.keyboard.Keystrokes;
import org.eclipse.swtbot.swt.finder.utils.SWTBotPreferences;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotShell;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTree;
import org.hamcrest.Matcher;
import org.eclipse.swtbot.swt.finder.keyboard.Keystrokes;

import edu.toronto.cs.openome_model.Model;
import edu.toronto.cs.openome_model.impl.ModelImpl;

public class TestUtil {
    public static SWTWorkbenchBot bot = new SWTWorkbenchBot();
    public static String projectName = "OMETest";
    public static String diagramName = "test.ood";
    
    /******Change this to your path of folder TestFile in workspace*******/
    public static String pathName = "/home/showzeb/workspace/edu.toronto.cs.openome.testing/TestFile/";
    
    public static String workspacePath = null;
    public static SWTBotTree packageTree = null;
    
    /* The labels of palette tools */
    public static final String[] intentions = { "Hardgoal", "Softgoal", "Task", "Resource" };
    public static final String[] actors = { "Actor", "Agent", "Position", "Role" };
    public static final String[] hardlinks = { "Dependency", "Decomposition", "Means-ends" };
    public static final String[] contributions = { "Make", "Some+", "Help", "Unknown", "Hurt", "Some-", "Break", "AND", "OR" };
    public static final String[] associations = { "ISA", "Covers", "Is part of", "Occupies", "Plays", "INS" };

    public static void initializeWorkspace() {
        // slow down tests
        //SWTBotPreferences.PLAYBACK_DELAY = 9;
        // increase time till timeout is triggered
        //SWTBotPreferences.TIMEOUT = 5000;
        
        // Close the Subclipse question window.
    	bot.shell("Subclipse Usage").close();
        
        try {
            bot.viewByTitle("Welcome").close();
        } catch (WidgetNotFoundException e) {
            // do nothing - Welcome screen is already closed
        }

        packageTree = bot.viewByTitle("Package Explorer").bot()
        .tree();
        packageTree.setFocus();
        try {
        	packageTree.getTreeItem(projectName);
        } catch (WidgetNotFoundException e) {
        	createTest();
        }

        try {
    	  packageTree.setFocus();
    	  packageTree.getTreeItem(projectName).expand().getNode(diagramName).doubleClick();
        } catch (WidgetNotFoundException e) {
    	  System.out.println("error");
        }
    }

    public static void createTest() {
    	IWorkspace w = ResourcesPlugin.getWorkspace();
		IProject project = w.getRoot().getProject(projectName);
		try {
			if (!project.exists())
				project.create(null);
			project.open(null);
			InputStream stream = new FileInputStream (pathName + diagramName);
			IFile file = project.getFile(diagramName);
			try {
			if (!file.exists())
				file.create(stream, false, null);
			workspacePath = file.getRawLocation().toString();
			} catch (Exception e) {}
			stream.close();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (CoreException e) {
			e.printStackTrace();
		}
		
    }
    
    public static void createAndOpenFile() {
    	String[] command =  {"sh","-c" ,"cp " + workspacePath + " " + workspacePath.replaceFirst("test.ood", "testFile.ood")};
    	Runtime rt = Runtime.getRuntime();
    	//ProcessBuilder pb = new ProcessBuilder("sh","-c", "cp " + workspacePath + " " + workspacePath.replaceFirst("test.ood", "testFile.ood"));
    	try {
			//Process s = pb.start();
    		Process p = rt.exec(command);
    		p.waitFor();
			System.out.println(p.exitValue() + " " + workspacePath.replaceFirst("test.ood", "testFile.ood"));
			packageTree.setFocus();
			packageTree.getTreeItem(projectName).expand().getNode("testFile.ood").doubleClick();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			
		}
    }
    
    public static void closeAndDeleteFile() {
    	ProcessBuilder pb = new ProcessBuilder("rm",workspacePath.replaceFirst("test.ood", "testFile.ood"));
    	try {
    		bot.closeAllEditors();
			pb.start();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    public static void createNewProject() {

        // Create the project
        bot.menu("File").menu("New").menu("Project...").click();

        SWTBotShell shell = bot.shell("New Project");
        shell.activate();

        bot.tree().expandNode("General").select("Project").click();

        bot.button("Next >").click();

        bot.textWithLabel("Project name:").setText(projectName);

        bot.button("Finish").click();

    }

    public static void createNewDiagram() {
        // if we already have a diagram on the screen, we do not need to do this

        bot.menu("File").menu("New").menu("Other...").click();
        SWTBotShell shell = bot.shell("New");
        shell.activate();

        bot.tree().expandNode("OpenOME").select("Diagram (ood)");
        bot.button("Next >").click();

        bot.tree().select(projectName);
        bot.textWithLabel("Enter or select the parent folder:").setText(
                projectName);
        bot.textWithLabel("File name:").setText(diagramName);
        // bot.button("Next >").click();

        bot.tree().select(projectName);
        bot.button("Finish").click();

    }
    
    /**
     * Return the respective underlying Model given an SWT GEF editor
     * 
     * @param editor the editor from which to extract the underlying model
     */
    public static Model getModel(SWTBotGefEditor editor) {
        DiagramImpl dImpl = (DiagramImpl) editor.mainEditPart().part().getModel();
        ModelImpl model = (ModelImpl) dImpl.getElement();
        return (Model) model;
    }
}