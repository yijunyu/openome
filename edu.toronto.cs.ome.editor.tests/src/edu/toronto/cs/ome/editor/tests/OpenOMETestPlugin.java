package edu.toronto.cs.ome.editor.tests;


import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.eclipse.core.resources.*;
import org.eclipse.core.runtime.*;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.Bundle;


public class OpenOMETestPlugin extends AbstractUIPlugin {
	
	private static OpenOMETestPlugin deflt;
	
	public OpenOMETestPlugin() {
		super();
		deflt= this;
	}
	
	public static OpenOMETestPlugin getDefault() {
		return deflt;
	}
	
	public static IWorkspace getWorkspace() {
		return ResourcesPlugin.getWorkspace();
	}
	
	public static void enableAutobuild(boolean enable) throws CoreException {
		// disable auto build
		IWorkspace workspace= OpenOMETestPlugin.getWorkspace();
		IWorkspaceDescription desc= workspace.getDescription();
		desc.setAutoBuilding(enable);
		workspace.setDescription(desc);
	}
	
	public File getFileInPlugin(IPath path) {
		try {
			Bundle bundle = getDefault().getBundle();
			URL installURL= new URL(bundle.getEntry("/"), path.toString());
			URL localURL= Platform.asLocalURL(installURL);
			return new File(localURL.getFile());
		} catch (IOException e) {
			return null;
		}
	}
}
