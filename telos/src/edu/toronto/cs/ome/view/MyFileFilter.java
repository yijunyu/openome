package edu.toronto.cs.ome.view;

import java.io.File;

import javax.swing.filechooser.FileFilter;

public class MyFileFilter extends FileFilter {
	public String extension;
	boolean isDefault;
	String description;
	MyFileFilter(String ext, boolean d) {
		super();
		description = "";
		if (ext.indexOf(":")>=0) {
			description = ext.substring(0, ext.indexOf(":"));
			extension = ext.substring(ext.indexOf(":")+1);
		} else			
			extension = ext;
		this.isDefault = d;
	}
	public String getDescription() {
		return description + (isDefault? "Default " : "") + "(" + extension + ")";
	}			
	public boolean accept(File arg0) {
		String name = arg0.getName();
		return name.endsWith(extension);
	}

}	
