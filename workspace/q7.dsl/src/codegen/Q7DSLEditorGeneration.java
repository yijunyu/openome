package codegen;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.openarchitectureware.workflow.WorkflowRunner;

import convertor.IGenerator;

public class Q7DSLEditorGeneration implements IGenerator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q7DSLEditorGeneration g = new Q7DSLEditorGeneration();
		g.generateEditor(
				"c:/work/gmf/workspace/q7.dsl/src/generate.oaw",
				"c:/work/gmf/workspace/q7.dsl/src/generate.properties");
	}

	public void cleanup() {
		// TODO Auto-generated method stub
		System.out.println("Cleanup...");
		IWorkspace w = ResourcesPlugin.getWorkspace();
		delete_project(w, "/q7.dsl.editor");
	}

	private void delete_project(IWorkspace w, String string) {
		IProject p = w.getRoot().getProject(string);
        if (p.exists())
			try {
				p.delete(true, null);
			} catch (CoreException e) {
				// e.printStackTrace();
				System.out.println("The project " + string + " cannot be removed.");
			}
	}

	public void generate() {
		// TODO Auto-generated method stub
		System.out.println("Generate...");
		IWorkspace w = ResourcesPlugin.getWorkspace();
		if (!w.getRoot().getProject("/q7.dsl").exists())
			return;
		System.setProperty("user.dir", w.getRoot().getProject("/q7.dsl").getFolder("bin").getLocation().toString());
		IFile file = w.getRoot().getProject("/q7.dsl").getFile("/src/generate.oaw");
//		IFile property = w.getRoot().getProject("/q7.dsl").getFile("/src/generate.properties");
		generateEditor(file.getLocation().toString(),
				w.getRoot().getProject("/q7.dsl").getFolder("bin").getLocation().toString());		
	}

	private void generateEditor(String file, String folder) {
        String[] cmdLine = new String[1];
        cmdLine[0] = file;
        WorkflowRunner.main(cmdLine);
//		File workingDirectory = new File(folder);
//		try {
//			DebugPlugin.exec(cmdLine, 
//					workingDirectory);
//		} catch (CoreException e) {
//			e.printStackTrace();
//		}
//		Map<String, String> properties = new HashMap<String, String>();
//		ResourceBundle resources = ResourceBundle.getBundle("generator", 
//				Locale.getDefault(), Q7DSLEditorGeneration.class.getClassLoader());
//        for (Enumeration i = resources.getKeys(); i.hasMoreElements(); ) {
//        	String key = (String)i.nextElement();
//        	String val = resources.getString(key);
//        	System.setProperty(key, val);
//        }
// 		System.out.println(System.getProperty("user.dir"));
//        Map<String, String> slotContents = new HashMap<String, String>();
//        WorkflowRunner wr = new WorkflowRunner();
//		wr.run(file, new NullProgressMonitor(), 
//				properties, slotContents);
	}
}

