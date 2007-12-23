package action;


import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.codegen.ecore.Generator;

import convertor.IGenerator;

public class WBIEMFProjectsGeneration implements IGenerator {

	private String model;
	private String project;
	private String target;
	public WBIEMFProjectsGeneration(String project, String model, String target) {
		this.project = project;
		this.model = model;
		this.target = target;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void cleanup() {
		// TODO Auto-generated method stub
		System.out.println("Cleanup...");
		IWorkspace w = ResourcesPlugin.getWorkspace();
		delete_project(w, "/" + target);
		delete_project(w, "/" + target + ".edit");
		delete_project(w, "/" + target + ".editor");
		delete_project(w, "/" + target + ".test");
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
		System.out.println("Generate WBI Model...");
		IWorkspace w = ResourcesPlugin.getWorkspace();
		System.out.println(project);
		IFile file = w.getRoot().getProject("/" + project).getFile(model);
		if (file==null || !file.exists())
			return;
		Generator g = new Generator();
		String args[] = new String[6];
		args[0] = "-autoBuild";
		args[1] = "true";
		args[2] = "-model";
		args[3] = "-edit";
		args[4] = "-editor";
		args[5] = file.getLocation().toPortableString(); 
		g.run(args);
	}
}
