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
import org.junit.AfterClass;
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

import edu.toronto.cs.openome_model.Model;

/**
 * These tests deal with edit actions such as Cut, Copy, and Paste.
 * 
 * @author University of Toronto
 * 
 */

@RunWith(SWTBotJunit4ClassRunner.class)
public class TestEditActions extends SWTBotGefTestCase {
	
	/** The types of edit actions - DO NOT ALTER**/ 
	private static final String CUT = "Cut";
	private static final String COPY = "Copy";
	private static final String PASTE = "Paste";

	/** A place holder to store the current element being handled **/
	private static String current = null;
	// Note: Be careful when using this. Should be updated meticulously.

	/** Represents elements in a 2D Array **/
	private static String[][] allElem = { TestUtil.intentions, TestUtil.actors };
	private static String[][] allLinks = { TestUtil.hardlinks,
			TestUtil.contributions, TestUtil.associations };

	private static SWTWorkbenchBot bot;
	private static SWTGefBot gefBot;
	private static SWTBotGefEditor editor;

	private SWTBotGefEditPart view = editor.mainEditPart(); // The view
	private Model model = TestUtil.getModel(editor); // The model

	@BeforeClass
	public static void beforeClass() throws Exception {
		// Initializes a diagram to work with
		TestUtil.initializeWorkspace();
		bot = new SWTWorkbenchBot();
		gefBot = new SWTGefBot();
		editor = gefBot.gefEditor("test.ood");
	}

	@AfterClass
	public static void sleep() {
		bot.sleep(2000);
	}

	/**
	 * Tests if intentions/actors are successfully removed from the view using
	 * Cut via context menu.
	 */
	//@Test
	public void testContextCutElemFromView() {

		System.out
				.println("Testing if 'Cut' via context menu removes elements from the view properly.");

		try {

			for (String[] type : allElem) {
				for (String element : type) {

					createElement(element);
					performAction(true, CUT);

					// Nothing should remain in the view
					assertTrue(element.toString()
							+ " was not successfully removed from the view.",
							view.children().size() == 0);
				}
			}

		} catch (AssertionError e) {
			System.err.println(e.getMessage());
		} finally {
			System.out.println("------------------------------------------------------------");
		}

	}
	
	/**
	 * Tests if intentions/actors are successfully removed from the view using
	 * Cut via keystroke.
	 */
	@Test
	public void testKeystrokeCutElemFromView(){
		
		System.out
		.println("Testing if 'Cut' via keystroke removes elements from the view properly.");
		
		try {

			for (String[] type : allElem) {
				for (String element : type) {

					createElement(element);
					performAction(false, CUT);

					// Nothing should remain in the view
					assertTrue(element.toString()
							+ " was not successfully removed from the view.",
							view.children().size() == 0);
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
			System.err.println(current.toString() + " caused: " + e.getMessage());
		} finally {
			System.out.println("------------------------------------------------------------");
		}
		
	}

	/**
	 * Tests if links are successfully removed from the view using Cut via
	 * context menu.
	 */
	//@Test
	public void testContextCutLinkFromView() {

		System.out
				.println("Testing if 'Cut' via context menu removes links from the view properly.");

		try {

			for (String[] type : allLinks) {
				for (String link : type) {

					createLink(link);
					performAction(true, CUT);
					
					// Only the hard goal should remain after link has been cut
					assertTrue(link.toString()
							+ " was not successfully removed from the view.",
							view.children().size() == 1);
				}
			}

		} catch (AssertionError e) {
			System.err.println(e.getMessage());
		} finally {
			System.out.println("------------------------------------------------------------");
		}

	}

	/**
	 * Tests if intentions/actors are successfully removed from the model using
	 * Cut via context menu.
	 */
	//@Test
	public void testContextCutElemFromModel() {

		System.out
				.println("Testing if 'Cut' via context menu removes elements from the model properly.");

		try {

			for (String[] type : allElem) {
				for (String element : type) {

					createElement(element);
					performAction(true, CUT);
					
					// Should be nothing in the model
					assertTrue(element.toString()
							+ " was not successfully removed from the model.",
							model.eContents().size() == 0);

				}
			}

		} catch (AssertionError e) {
			System.err.println(e.getMessage());
		} finally {
			System.out.println("------------------------------------------------------------");
		}

	}

	/**
	 * Tests if links are successfully removed from the model using Cut via
	 * context menu.
	 */
	//@Test
	public void testContextCutLinkFromModel() {

		System.out
				.println("Testing if 'Cut' via context menu removes links from the model properly.");

		try {

			for (String[] type : allLinks) {
				for (String link : type) {
					current = link;

					createLink(link);
					performAction(true, CUT);

					// Should only be the intention remaining in the model
					assertTrue(link.toString()
							+ " was not successfully removed from the model.",
							model.eContents().size() == 1);
				}
			}

		} catch (AssertionError e) {
			System.err.println(e.getMessage());
		} finally {
			System.out.println("------------------------------------------------------------");
		}

	}

	/**
	 * Tests if elements are stored in the clipboard using Cut via context menu.
	 */
	//@Test
	public void testContextCutElemOnClipboard() {

		System.out
				.println("Testing if 'Cut' via context menu places elements in the clipboard properly.");

		System.out.println(getOS());

		try {

			for (String[] type : allElem) {
				for (String element : type) {

					createElement(element);
					performAction(true, CUT);
					
					// Check if element is in clipboard
					Clipboard clipboard = Toolkit.getDefaultToolkit()
							.getSystemClipboard();
					Transferable contents = clipboard.getContents(null);
					
					//This isn't done. 

				}
			}

		} catch (AssertionError e) {
			System.err.println(e.getMessage());
		} finally {
			System.out.println("------------------------------------------------------------");
		}

	}

	/**
	 * Tests if links are stored in the clipboard using Cut via context menu.
	 */
	//@Test
	public void testContextCutLinkOnClipboard() {

		System.out
				.println("Testing if 'Cut' via context menu places links in the clipboard properly.");

		try {

			for (String[] type : allLinks) {
				for (String link : type) {

					createLink(link);
					performAction(true, CUT);

					// Check if the link is in the clipboard

				}

			}

		} catch (AssertionError e) {
			System.err.println(e.getMessage());
		} finally {
			System.out.println("------------------------------------------------------------");
		}

	}

	/**
	 * A general method for creating actors and intentions for test cases.
	 * 
	 * @param item
	 *            The type of actor or intention
	 */
	public void createElement(String item) {

		// Update current item being handled
		current = item;

		// Create an element
		editor.activateTool(item);
		editor.click(150, 150);
		editor.directEditType(item);

	}

	/**
	 * A general method for creating links for test cases.
	 * 
	 * @param item
	 *            The type of link
	 */
	public void createLink(String item) {

		// Update current item being handled
		current = item;

		// Create a hard goal to attach link to
		editor.activateTool("Hardgoal");
		editor.click(150, 150);
		editor.directEditType("Hardgoal");

		// Create a link
		editor.activateTool(item);
		editor.click(150, 150);
	}

	/**
	 * A general method for performing edit actions such as Cut, Copy, and Paste. 
	 * @param useMenu Determines whether context menu or keystroke shortcut method should be utilized
	 * @param type The type of action that should be performed 
	 */
	public void performAction(boolean useMenu, String type) {
				
		if (useMenu) {
			try {
				editor.clickContextMenu("Edit").clickContextMenu(type);
			} catch (WidgetNotFoundException e) {
				System.err
						.println("Unable to perform " + type + " via context menu on: "
								+ current);
			}
			
		} else {	
			
			//Determine which key to use depending on action being performed 
			KeyStroke key = null;
			String shortcut = null;
			
			if (type.equals(CUT)){
				shortcut = "X";
			}
			else if (type.equals(COPY)){
				shortcut = "C";
			}
			else if (type.equals(PASTE)){
				shortcut = "V";
			}
			else{ 
				System.err.println("Invalid edit action given: " + type);
			}
			
			try {
				key = KeyStroke.getInstance(shortcut);
			} catch (ParseException e) {
				e.printStackTrace();
				System.err.println("Unable to perform " + type + " via shortcut on: " + current);
			}
			
			//Check for OS to decide which keystroke would be appropriate  
			String os = getOS();
			
			if (os.contains("mac")){
				try{
					KeyboardFactory.getAWTKeyboard().pressShortcut(Keystrokes.COMMAND, key);
				} catch(ExceptionInInitializerError e){
					//e.printStackTrace();
					System.err.println(e.getCause() + " : " + e.getMessage());
				}
				
			}
			else {
				KeyboardFactory.getAWTKeyboard().pressShortcut(Keystrokes.CTRL, key);
			}
			
		}
	}
	
	/**
	 * Determines computer OS name.
	 * @return The OS name of the computer being utilized
	 */
	public String getOS(){
		
		String osType = null; 
		
		try{
			osType = System.getProperty("os.name").toLowerCase();
		} catch (Exception e){
			System.err.println("Error: " + e.getMessage());
		}
		
		return osType;
		
	}

}
