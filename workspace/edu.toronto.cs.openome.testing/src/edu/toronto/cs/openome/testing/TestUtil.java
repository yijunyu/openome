package edu.toronto.cs.openome.testing;

import static org.eclipse.swtbot.swt.finder.matchers.WidgetMatcherFactory.allOf;
import static org.eclipse.swtbot.swt.finder.matchers.WidgetMatcherFactory.anyOf;
import static org.eclipse.swtbot.swt.finder.matchers.WidgetMatcherFactory.withRegex;

import java.util.List;

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

        SWTBotTree packageTree = bot.viewByTitle("Project Explorer").bot()
        .tree();
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