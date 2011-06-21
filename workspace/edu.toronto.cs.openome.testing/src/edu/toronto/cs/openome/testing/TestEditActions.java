package edu.toronto.cs.openome.testing;

import static org.eclipse.swtbot.swt.finder.matchers.WidgetMatcherFactory.withRegex;
import static org.eclipse.swtbot.swt.finder.matchers.WidgetMatcherFactory.withLabel;
import static org.eclipse.swtbot.swt.finder.matchers.WidgetMatcherFactory.withText;
import static org.junit.Assert.assertTrue;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.swt.SWT;
import org.eclipse.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.eclipse.swtbot.eclipse.finder.widgets.SWTBotEclipseEditor;
import org.eclipse.swtbot.eclipse.finder.widgets.SWTBotEditor;
import org.eclipse.swtbot.eclipse.gef.finder.SWTBotGefTestCase;
import org.eclipse.swtbot.eclipse.gef.finder.SWTGefBot;
import org.eclipse.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditPart;
import org.eclipse.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditor;
import org.eclipse.swtbot.swt.finder.exceptions.WidgetNotFoundException;
import org.eclipse.swtbot.swt.finder.junit.SWTBotJunit4ClassRunner;
import org.eclipse.swtbot.swt.finder.keyboard.Keyboard;
import org.eclipse.swtbot.swt.finder.keyboard.KeyboardFactory;
import org.eclipse.swtbot.swt.finder.keyboard.Keystrokes;
import org.eclipse.swtbot.swt.finder.utils.SWTUtils;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotShell;
import org.hamcrest.Matcher;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.List;

import org.eclipse.gef.EditPart;
import org.eclipse.jface.bindings.keys.KeyStroke;
import org.eclipse.jface.bindings.keys.ParseException;
import org.eclipse.swt.SWT;
import org.eclipse.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.eclipse.swtbot.eclipse.finder.widgets.SWTBotEclipseEditor;
import org.eclipse.swtbot.eclipse.finder.widgets.SWTBotEditor;
import org.eclipse.swtbot.eclipse.gef.finder.SWTBotGefTestCase;
import org.eclipse.swtbot.eclipse.gef.finder.SWTGefBot;
import org.eclipse.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditor;
import org.eclipse.swtbot.swt.finder.exceptions.WidgetNotFoundException;
import org.eclipse.swtbot.swt.finder.junit.SWTBotJunit4ClassRunner;
import org.eclipse.swtbot.swt.finder.keyboard.Keyboard;
import org.eclipse.swtbot.swt.finder.keyboard.KeyboardFactory;
import org.eclipse.swtbot.swt.finder.keyboard.Keystrokes;
import org.eclipse.swtbot.swt.finder.utils.SWTUtils;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotShell;
import org.hamcrest.Matcher;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

import edu.toronto.cs.openome_model.Intention;
import edu.toronto.cs.openome_model.Model;
import edu.toronto.cs.openome_model.diagram.edit.parts.ActorNameEditPart;
import edu.toronto.cs.openome_model.diagram.edit.parts.GoalEditPart;

/**
 * These tests deal with edit actions such as Cut, Copy, and Paste.
 * 
 * @author University of Toronto
 * 
 */

@RunWith(SWTBotJunit4ClassRunner.class)
public class TestEditActions extends SWTBotGefTestCase {

	/** The types of edit actions - DO NOT ALTER **/
	private static final String CUT = "Cut";
	private static final String COPY = "Copy";
	private static final String PASTE = "Paste";

	/** A place holder to store the current element being handled **/
	private static String current = null;
	// Note: Be careful when using this. Should be updated and cleaned up
	// meticulously - especially when dealing with links.

	/** Represents elements in a 2D Array **/
	private static String[][] allElem = { TestUtil.intentions, TestUtil.actors };
	private static String[][] allLinks = { TestUtil.hardlinks,
			TestUtil.contributions, TestUtil.associations };

	/** The two methods used to perform edit actions **/
	private static String[] methods = { "context", "shortcut" };

	private static SWTWorkbenchBot bot;
	private static SWTGefBot gefBot;
	private static SWTBotGefEditor editor;

	private SWTBotGefEditPart view;
	private Model model;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        TestUtil.initializeWorkspace();
    }
    
    @Before
    public void setUpBeforeTest() throws Exception {
        TestUtil.createAndOpenFile();
        editor = new SWTGefBot().gefEditor("test.ood");
        model = TestUtil.getModel(editor);
        view = editor.mainEditPart();
    }
    
    @After
    public void tearDownAfterTest() throws Exception {
        TestUtil.closeAndDeleteFile();
    }

	/**
	 * Tests if intentions/actors are successfully removed from model and view
	 * using Cut.
	 */
	@Test
	public void testCutElem() {

		for (String[] type : allElem) {
			for (String element : type) {
				for (String method : methods) {

					createElement(element, 0, 0);
					performAction(method, CUT);

					assertTrue(
							element.toString()
									+ " was not successfully removed from the view using Cut via "
									+ method, view.children().isEmpty());

					assertTrue(
							element.toString()
									+ " was not successfully removed from the model using Cut via "
									+ method, model.eContents().isEmpty());

				}
			}
		}
	}

	/**
	 * Tests if links are successfully removed from the model and view using
	 * Cut.
	 */
	@Test
	public void testCutLink() {

		// Set-up for testing links - create two intentions to link
		createElement("Hardgoal", 0, 0);
		createElement("Softgoal", 200, 0);

		assertTrue("Set-up for intentions to link unsuccessful", model
				.eContents().size() == 2
				&& view.children().size() == 2);

		for (String[] type : allLinks) {
			for (String link : type) {
				for (String method : methods) {
					
					current = link;

					editor.activateTool(link);
					editor.drag("Hardgoal", 200, 0);
					performAction(method, CUT);

					// Ensure link is gone from model & view

					// Ensure intentions are no longer linked

				}
			}
		}
	}

	/**
	 * Tests if intentions/actors are placed on the system clipboard accordingly
	 * using Cut.
	 */
	@Test
	public void testCutElemOnClipboard() {

		SWTBotGefEditPart cutPart, pastePart;

		for (String[] type : allElem) {
			for (String element : type) {
				for (String method : methods) {
					
					createElement(element, 0, 0);
					cutPart = editor.getEditPart(element);

					performAction(method, CUT);					
					performAction(method, PASTE);

					pastePart = editor.getEditPart(element);
					// Ensure Paste was done correctly
					assertTrue(element + " was not Pasted properly via "
							+ method, model.eContents().size() == 1
							&& view.children().size() == 1);
					
					// Delete and assert it was done so properly
					editor.getEditPart(element);
					editor.clickContextMenu("Delete from Model");

					assertTrue(
							element.toString()
									+ " was not successfully placed onto system clipboard using Cut via "
									+ method, cutPart.getClass().equals(
									pastePart.getClass()));

				}

			}
		}

	}

	/**
	 * Tests if Cut functionality works for actors with several intentions
	 * inside.
	 */
	@Test
	public void testCutActorWithElementsInside() {

		SWTBotGefEditPart cutPart, pastePart;

		for (String actor : TestUtil.actors) {
			for (String method : methods) {

				createElement(actor, 0, 0);

				// Hard-code contents inside actor
				createElement("Hardgoal", 170, 10);
				createElement("Softgoal", 20, 180);
				editor.activateTool("Decomposition");
				editor.drag("Hardgoal", 20, 180);

				cutPart = editor.getEditPart(actor);
				editor.click(actor);

				// Ensure actor was removed from model & view
				performAction(method, CUT);

				assertTrue(
						actor
								+ " with elements inside was not removed from model and view properly using Cut via "
								+ method, model.getContainers().isEmpty());
				assertTrue(
						actor
								+ " with elements inside was not removed from view properly using Cut via "
								+ method, view.children().isEmpty());
				performAction(method, PASTE);
				pastePart = editor.getEditPart(actor);

				// Check if clipboard contents reflects Cut action
				assertTrue(
						actor
								+ " with elements inside was not successfully placed onto system clipboard using Cut via "
								+ method, cutPart.children().equals(
								pastePart.children())
								&& cutPart.getClass().equals(
										pastePart.getClass()));

				// Delete and assert it was done so properly
				editor.clickContextMenu("Delete from Model");
				assertTrue("Delete from Model not working", view.children()
						.isEmpty()
						&& model.eContents().isEmpty());

			}
		}
	}

	/**
	 * Tests if Cut functionality works on multiple elements
	 * 
	 * @throws InterruptedException
	 */
	@Test
	public void testCutMultipleIntentions() throws InterruptedException {

		for (String method : methods) {

			// Set-up
			createElement("Hardgoal", 170, 10);
			createElement("Softgoal", 170, 170);
			createElement("Task", 320, 180);
			createElement("Resource", 170, 90);

			List<SWTBotGefEditPart> beforeIntentionsInView = view.children();
			List<Intention> beforeIntentionsInModel = model.getIntentions();

			editor.drag(0, 0, 1000, 1000);
			performAction(method, CUT);
			Thread.sleep(500);

			assertTrue(
					"Multiple intentions were not removed from model using Cut via "
							+ method, model.eContents().isEmpty());
			assertTrue(
					"Multiple intentions were not removed from view using Cut via "
							+ method, view.children().isEmpty());

			performAction(method, PASTE);

			List<SWTBotGefEditPart> afterIntentionsInView = view.children();
			List<Intention> afterIntentionsInModel = model.getIntentions();

			assertTrue(
					"Multiple intentions were not placed on system clipboard properly using Cut via "
							+ method, beforeIntentionsInView
							.equals(afterIntentionsInView)
							&& beforeIntentionsInModel
									.equals(afterIntentionsInModel));

		}
	}

	/**
	 * Tests Copy & Paste for all elements
	 */
	@Test
	public void testCopyPasteElem() {

		SWTBotGefEditPart copyPart, pastePart;

		for (String[] type : allElem) {
			for (String element : type) {
				for (String method : methods) {

					createElement(element, 0, 0);
					assertTrue(element + " was not added onto canvas", model
							.eContents().size() == 1
							&& view.children().size() == 1);

					performAction(method, COPY);
					copyPart = editor.getEditPart(element);

					// Delete to clean up canvas for Paste
					editor.click(element);
					editor.clickContextMenu("Delete from Model");
					assertTrue("Delete from Model not working", view.children()
							.isEmpty()
							&& model.eContents().isEmpty());

					performAction(method, PASTE);
					pastePart = view.children().get(0);

					assertTrue(element + " was not copied and pasted properly",
							copyPart != null
									&& pastePart != null
									&& copyPart.getClass().equals(
											pastePart.getClass()));

					// Delete to clean up canvas for next element
					editor.drag(0, 0, 1000, 1000);
					editor.clickContextMenu("Delete from Model");

					assertTrue("Delete from Model not working", view.children()
							.isEmpty()
							&& model.eContents().isEmpty());

				}
			}
		}
	}

	/**
	 * A general method for creating actors and intentions for test cases.
	 * 
	 * @param item
	 *            The type of element to be created
	 * @param x
	 *            The x coordinate to place element at
	 * @param y
	 *            The y coordinate to place element at
	 */
	public void createElement(String item, int x, int y) {

		// Update current item being handled
		current = item;

		// Create an element
		editor.activateTool(item).click(x, y);

		editor.rootEditPart().activateDirectEdit();

		try {
			editor.directEditType(item);
		} catch (Throwable t) {
			System.err.println("Unable to type in '" + item + "' on item.");
		}

		editor.getEditPart(item).focus();

	}

	/**
	 * A general method for performing edit actions such as Cut, Copy, and
	 * Paste. NOTE: This method assumes that the <code>SwtBotGefEditPart</code>
	 * that the action should be performed on has already been selected.
	 * 
	 * @param useMenu
	 *            Determines whether context menu or keystroke shortcut method
	 *            should be utilized
	 * @param type
	 *            The type of action that should be performed
	 */
	public void performAction(String method, String type) {

		if (method.equals("context")) {

			try {
				editor.clickContextMenu("Edit").clickContextMenu(type);
			} catch (Throwable t) {
				System.err.println("Unable to perform " + type + " on "
						+ current + ": " + t.getMessage());
			}

		} else {

			// Determine which key to use depending on action being performed
			String shortcut = null;

			if (type.equals(CUT)) {
				shortcut = "X";
			} else if (type.equals(COPY)) {
				shortcut = "C";
			} else if (type.equals(PASTE)) {
				shortcut = "V";
			} else {
				System.err.println("Invalid edit action given: " + type);
			}

			// Press the appropriate keystroke based on action type and OS
			pressKeys(shortcut);

		}
	}

	/**
	 * Determines which buttons should be pressed for the corresponding edit
	 * action.
	 * 
	 * @param actionShortcut
	 *            The shortcut for the edit action. X, C, V for Cut, Copy,
	 *            Paste, respectively.
	 */
	public void pressKeys(String actionShortcut) {

		KeyStroke key = null;

		try {
			key = KeyStroke.getInstance(actionShortcut);
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println("Unable to find " + actionShortcut
					+ " shortcut Keystroke for: " + current);
		}

		KeyStroke command = KeyStroke.getInstance(SWT.COMMAND, 0);
		KeyStroke ctrl = KeyStroke.getInstance(SWT.CTRL, 0);

		// Check for OS to decide which keystroke would be appropriate
		String os = getOS();

		try {
			if (os.contains("mac")) {
				KeyboardFactory.getAWTKeyboard().pressShortcut(command, key);
			} else {
				KeyboardFactory.getAWTKeyboard().pressShortcut(ctrl, key);
			}
		} catch (Exception e) {
			System.err.println("Unable to perform CTRL/CMD + " + actionShortcut
					+ " on " + current + ": " + e.getCause());
		}

	}

	/**
	 * Determines computer OS name.
	 * 
	 * @return The OS name of the computer being utilized
	 */
	public String getOS() {

		String osType = null;

		try {
			osType = System.getProperty("os.name").toLowerCase();
		} catch (Exception e) {
			System.err.println("Error: " + e.getMessage());
		}

		return osType;

	}

}
