package edu.toronto.cs.ome.view.test;

import edu.toronto.cs.ome.Telos2SVG;
import edu.toronto.cs.util.FileBasedTest;

public class GraphicViewCanvasTest extends FileBasedTest {
 
	public static void main(String[] args) {
		junit.textui.TestRunner.run(GraphicViewCanvasTest.class);
	}

	public void transform(String input, String output) {
		Telos2SVG.transform(input, output);
	}

	/*
	 * Test method for 'edu.toronto.cs.ome.view.GraphicViewCanvas.GraphicViewCanvas(JMenuBar, GraphicView, GraphicViewFrame)'
	 */
	public void testGraphicViewCanvas() {
		Transform(this, "transform", "test/edu.toronto.cs.ome.view.GraphicViewCanvas",
				".tel", ".svg", "-not-expected.svg");
	}

	/*
	 * Test method for 'edu.toronto.cs.ome.view.GraphicViewCanvas.hookupSaveMethod()'
	 */
	public void testHookupSaveMethod() {

	}

	/*
	 * Test method for 'edu.toronto.cs.ome.view.GraphicViewCanvas.setPopupMenu(MouseEvent)'
	 */
	public void testSetPopupMenu() {

	}

	/*
	 * Test method for 'edu.toronto.cs.ome.view.GraphicViewCanvas.setMenuBar()'
	 */
	public void testSetMenuBar() {

	}

	/*
	 * Test method for 'edu.toronto.cs.ome.view.GraphicViewCanvas.setToolBar()'
	 */
	public void testSetToolBar() {

	}

	/*
	 * Test method for 'edu.toronto.cs.ome.view.GraphicViewCanvas.getData()'
	 */
	public void testGetData() {

	}

	/*
	 * Test method for 'edu.toronto.cs.ome.view.GraphicViewCanvas.getGraphicViewFrame()'
	 */
	public void testGetGraphicViewFrame() {

	}

	/*
	 * Test method for 'edu.toronto.cs.ome.view.GraphicViewCanvas.showDialog(JDialog)'
	 */
	public void testShowDialog() {

	}

	/*
	 * Test method for 'edu.toronto.cs.ome.view.GraphicViewCanvas.setSbvValue(int)'
	 */
	public void testSetSbvValue() {

	}

	/*
	 * Test method for 'edu.toronto.cs.ome.view.GraphicViewCanvas.setSbhValue(int)'
	 */
	public void testSetSbhValue() {

	}

	/*
	 * Test method for 'edu.toronto.cs.ome.view.GraphicViewCanvas.adjustScrollBar()'
	 */
	public void testAdjustScrollBar() {

	}

	/*
	 * Test method for 'edu.toronto.cs.ome.view.GraphicViewCanvas.SetScrollbars(JScrollBar, JScrollBar)'
	 */
	public void testSetScrollbars() {

	}

	/*
	 * Test method for 'edu.toronto.cs.ome.view.GraphicViewCanvas.toggleSelect(Point)'
	 */
	public void testToggleSelect() {

	}

	/*
	 * Test method for 'edu.toronto.cs.ome.view.GraphicViewCanvas.select(Point)'
	 */
	public void testSelect() {

	}

	/*
	 * Test method for 'edu.toronto.cs.ome.view.GraphicViewCanvas.drawExpandedElements(Graphics2D, GraphicViewElement)'
	 */
	public void testDrawExpandedElements() {

	}

	/*
	 * Test method for 'edu.toronto.cs.ome.view.GraphicViewCanvas.drawElements(Graphics2D, GraphicViewElement)'
	 */
	public void testDrawElements() {

	}

	/*
	 * Test method for 'edu.toronto.cs.ome.view.GraphicViewCanvas.generatePNG(File, BufferedImage)'
	 */
	public void testGeneratePNG() {

	}

	/*
	 * Test method for 'edu.toronto.cs.ome.view.GraphicViewCanvas.export(Rectangle)'
	 */
	public void testExport() {

	}

	/*
	 * Test method for 'edu.toronto.cs.ome.view.GraphicViewCanvas.paint(Graphics)'
	 */
	public void testPaintGraphics() {

	}

	/*
	 * Test method for 'edu.toronto.cs.ome.view.GraphicViewCanvas.getView()'
	 */
	public void testGetView() {

	}

	/*
	 * Test method for 'edu.toronto.cs.ome.view.GraphicViewCanvas.setView(GraphicView)'
	 */
	public void testSetView() {

	}

	/*
	 * Test method for 'edu.toronto.cs.ome.view.GraphicViewCanvas.update(Graphics)'
	 */
	public void testUpdateGraphics() {

	}

	/*
	 * Test method for 'edu.toronto.cs.ome.view.GraphicViewCanvas.openRenameBox(GraphicViewObject)'
	 */
	public void testOpenRenameBox() {

	}

	/*
	 * Test method for 'edu.toronto.cs.ome.view.GraphicViewCanvas.openResizeBox(GraphicViewObject)'
	 */
	public void testOpenResizeBox() {

	}

	/*
	 * Test method for 'edu.toronto.cs.ome.view.GraphicViewCanvas.setTitle(String)'
	 */
	public void testSetTitle() {

	}

	/*
	 * Test method for 'edu.toronto.cs.ome.view.GraphicViewCanvas.getSavePathname()'
	 */
	public void testGetSavePathname() {

	}

	/*
	 * Test method for 'edu.toronto.cs.ome.view.GraphicViewCanvas.getSaveFileAndDirectory()'
	 */
	public void testGetSaveFileAndDirectory() {

	}

	/*
	 * Test method for 'edu.toronto.cs.ome.view.GraphicViewCanvas.getSaveFileAndDirectory(String)'
	 */
	public void testGetSaveFileAndDirectoryString() {

	}

	/*
	 * Test method for 'edu.toronto.cs.ome.view.GraphicViewCanvas.getFrame()'
	 */
	public void testGetFrame() {

	}

	/*
	 * Test method for 'edu.toronto.cs.ome.view.GraphicViewCanvas.setFrame(GraphicViewFrame)'
	 */
	public void testSetFrame() {

	}

	/*
	 * Test method for 'edu.toronto.cs.ome.view.GraphicViewCanvas.updateToolbar(View)'
	 */
	public void testUpdateToolbar() {

	}

	/*
	 * Test method for 'edu.toronto.cs.ome.view.GraphicViewCanvas.print(Graphics, PageFormat, int)'
	 */
	public void testPrintGraphicsPageFormatInt() {

	}

}
