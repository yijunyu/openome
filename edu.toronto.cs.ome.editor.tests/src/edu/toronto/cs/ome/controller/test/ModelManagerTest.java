package edu.toronto.cs.ome.controller.test;

import java.io.File;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;

import edu.toronto.cs.ome.OMETab;
import edu.toronto.cs.ome.controller.ModelManager;
import edu.toronto.cs.ome.editor.tests.OpenOMETestPlugin;
import edu.toronto.cs.ome.model.TelosModel;
import edu.toronto.cs.util.FileBasedTest;

public class ModelManagerTest extends FileBasedTest {

	public static void main(String[] args) {
		junit.textui.TestRunner.run(ModelManagerTest.class);
	}

	/*
	 * Test method for 'edu.toronto.cs.ome.controller.ModelManager.ModelManager(OMETab)'
	 */
	public void testModelManager() {

	}

	/*
	 * Test method for 'edu.toronto.cs.ome.controller.ModelManager.LoadClassEntryFromJar(String, String, String)'
	 */
	public void testLoadClassEntryFromJar() {

	}

	/*
	 * Test method for 'edu.toronto.cs.ome.controller.ModelManager.getModels()'
	 */
	public void testGetModels() {

	}

	/*
	 * Test method for 'edu.toronto.cs.ome.controller.ModelManager.getPlugins(OMEModel)'
	 */
	public void testGetPlugins() {

	}

	/*
	 * Test method for 'edu.toronto.cs.ome.controller.ModelManager.openModel(String)'
	 */
	public void testOpenModel() {

	}

	/*
	 * Test method for 'edu.toronto.cs.ome.controller.ModelManager.loadIndividualsFromModel(OMEModel)'
	 */
	public void testLoadIndividualsFromModel() {

	}

	/*
	 * Test method for 'edu.toronto.cs.ome.controller.ModelManager.saveModelTo(OMEModel, File)'
	 */
	public void testSaveModelTo() {

	}

	/*
	 * Test method for 'edu.toronto.cs.ome.controller.ModelManager.saveModelToSml(OMEModel, File)'
	 */
	public void testSaveModelToSml() {

	}

	/*
	 * Test method for 'edu.toronto.cs.ome.controller.ModelManager.saveModelToProtege(OMEModel)'
	 */
	public void testSaveModelToProtege() {

	}

	/*
	 * Test method for 'edu.toronto.cs.ome.controller.ModelManager.layOut(OMEModel, File)'
	 */
	public void testLayOut() {

	}

	/*
	 * Test method for 'edu.toronto.cs.ome.controller.ModelManager.saveModelToVdx(OMEModel, File)'
	 */
	public void testSaveModelToVdx() {

	}

	/*
	 * Test method for 'edu.toronto.cs.ome.controller.ModelManager.closeModel(OMEModel)'
	 */
	public void testCloseModel() {

	}

	/*
	 * Test method for 'edu.toronto.cs.ome.controller.ModelManager.getViewManager(OMEModel)'
	 */
	public void testGetViewManager() {

	}

	/*
	 * Test method for 'edu.toronto.cs.ome.controller.ModelManager.apply_xslt(File)'
	 */
	public void testApply_xslt() {

	}

	/**
	 * @param output_file
	 * @param input_file
	 */
	public void saveToQ7(String input_file, String output_file) {
		OMETab.load_properties();
		File file = new File(input_file);
		if (file != null && file.exists()) {
			String args[] = new String[1];
			args[0] = file.getAbsolutePath();
			ModelManager mm = new ModelManager(null);
			File f = ModelManager.apply_xslt(new File(input_file));
			String modelfile = f.getAbsolutePath();
			TelosModel model = (TelosModel) mm.openModel(modelfile);
			try {
				mm.saveModelToQ7(model, new File(output_file));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}	
	
	/*
	 * Test method for 'edu.toronto.cs.ome.controller.ModelManager.saveModelToQ7(TelosModel, File)'
	 */
	public void testSaveModelToQ7() {
		Transform(this, "saveToQ7", 
				OpenOMETestPlugin.getDefault().getFileInPlugin(new Path(
						"test/edu.toronto.cs.ome.controller.ModelManger")), 
					".tel", ".q7", "-expected.q7");		
	}

	/**
	 * @param output_file
	 * @param input_file
	 */
	public void saveToDat(String input_file, String output_file) {
		System.setProperty("java.library.path", "plugins/edu.toronto.cs.ome");
		System.setProperty("testDot", "test.dot");
		System.setProperty("tmpDot", "tempD.dot");
		System.setProperty("cmdDot", "dot.bat");
		System.setProperty("fitDot", "false");
		File file = new File(input_file);
		if (file != null && file.exists()) {
			String args[] = new String[1];
			args[0] = file.getAbsolutePath();
			ModelManager mm = new ModelManager(null);
			File f = ModelManager.apply_xslt(new File(input_file));
			String modelfile = f.getAbsolutePath();
			TelosModel model = (TelosModel) mm.openModel(modelfile);
			try {
				mm.saveModelToDat(model, new File(output_file));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}	

	/*
	 * Test method for 'edu.toronto.cs.ome.controller.ModelManager.saveModelToDat(TelosModel, File)'
	 */
	public void testSaveModelToDat() {
		Transform(this, "saveToDat", 
				OpenOMETestPlugin.getDefault().getFileInPlugin(new Path(
						"test/edu.toronto.cs.ome.controller.GR")),
				".tel", "-output.dat", "-no-expected.dat");
	}

	/*
	 * Test method for 'edu.toronto.cs.ome.controller.ModelManager.proposition2istarlink(Proposition, boolean, boolean, boolean)'
	 */
	public void testProposition2istarlink() {

	}

	/*
	 * Test method for 'edu.toronto.cs.ome.controller.ModelManager.resetReasoning(OMEModel)'
	 */
	public void testResetReasoning() {

	}

	/*
	 * Test method for 'edu.toronto.cs.ome.controller.ModelManager.getFrameworkChoices()'
	 */
	public void testGetFrameworkChoices() {

	}

	/*
	 * Test method for 'edu.toronto.cs.ome.controller.ModelManager.newModel(File, Iterator)'
	 */
	public void testNewModel() {

	}

	/*
	 * Test method for 'edu.toronto.cs.ome.controller.ModelManager.updateOpenOME(File)'
	 */
	public void testUpdateOpenOMEFile() {

	}

	/*
	 * Test method for 'edu.toronto.cs.ome.controller.ModelManager.updateOpenOME(String, GraphicViewFrame)'
	 */
	public void testUpdateOpenOMEStringGraphicViewFrame() {

	}

	/*
	 * Test method for 'edu.toronto.cs.ome.controller.ModelManager.FSID(int)'
	 */
	public void testFSID() {

	}

	/*
	 * Test method for 'edu.toronto.cs.ome.controller.ModelManager.PSID(int)'
	 */
	public void testPSID() {

	}

	/*
	 * Test method for 'edu.toronto.cs.ome.controller.ModelManager.FDID(int)'
	 */
	public void testFDID() {

	}

	/*
	 * Test method for 'edu.toronto.cs.ome.controller.ModelManager.PDID(int)'
	 */
	public void testPDID() {

	}

	/*
	 * Test method for 'edu.toronto.cs.ome.controller.ModelManager.FS(IStarElement)'
	 */
	public void testFS() {

	}

	/*
	 * Test method for 'edu.toronto.cs.ome.controller.ModelManager.PS(IStarElement)'
	 */
	public void testPS() {

	}

	/*
	 * Test method for 'edu.toronto.cs.ome.controller.ModelManager.FD(IStarElement)'
	 */
	public void testFD() {

	}

	/*
	 * Test method for 'edu.toronto.cs.ome.controller.ModelManager.PD(IStarElement)'
	 */
	public void testPD() {

	}

	/*
	 * Test method for 'edu.toronto.cs.ome.controller.ModelManager.saveModelToSat(TelosModel, File)'
	 */
	public void testSaveModelToSat() {

	}

	/*
	 * Test method for 'edu.toronto.cs.ome.controller.ModelManager.saveModelToDot(OMEModel, File)'
	 */
	public void testSaveModelToDot() {

	}

	/*
	 * Test method for 'edu.toronto.cs.ome.controller.ModelManager.saveModelToXML(TelosModel, File)'
	 */
	public void testSaveModelToXML() {

	}

}
