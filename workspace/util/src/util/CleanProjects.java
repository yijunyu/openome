package util;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.PatternSyntaxException;



public class CleanProjects {
	public static BufferedReader in;
	private static Grep fileParserGeneratedNOT;
	private static Grep fileParserGenerated;
	private static int totalDeleted = 0;
	private static int totalCustomClasses = 0;
	private static int totalNeverGenerated = 0; //Classes that do not have @generated OR @generated NOT
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		in = new BufferedReader( new InputStreamReader( System.in ) );
		try {
			fileParserGeneratedNOT = new Grep ("@generated NOT");
			fileParserGenerated = new Grep ("@generated");
		} catch (PatternSyntaxException e) {
			e.printStackTrace();
			System.exit(1);
		}
		
		if (args.length != 1) {
			System.out.println ("Usage: java CleanProjects projectRootPath");
		}
		
		File mainFolder = new File (args[0]);
		if (!mainFolder.isDirectory()) {
			System.err.println ("" + mainFolder.getName() + " must be folder.");
		}
		
		if (!mainFolder.exists()) {
			System.err.println ("" + mainFolder.getName() + " does not exist.");
		}
		
		System.out.println ("Are you sure you want to do this?\nAll the .java files that contain the text @generated will be deleted from the folder " + getFullPath(mainFolder) + " AND FROM ALL OF IT'S SUBFOLDERS. (y/n)");
		String userInput = getUserInput();
		if (!userInput.equals("y")) {
			System.out.println ("Quitting.");
			System.exit(0);
		}
		processFolder (new ArrayList<File>(Arrays.asList(mainFolder.listFiles())));
		
		System.out.println ("\nTotal deleted:  " + totalDeleted);
		System.out.println ("\nTotal custom classes (not deleted):  " + totalCustomClasses);
		System.out.println ("\nTotal without @generated / @generated NOT (not deleted):  " + totalNeverGenerated);
		
	}
	
	public static void processFolder (ArrayList<File> fileObjectList) {
		String userInput = null;
		for (File fileObject : fileObjectList) {
			if (fileObject.isDirectory()) {
				// ignore all .svn folders
				if (fileObject.getName().toLowerCase().equals(".svn")) {
					continue;
				}
//				// ask the user if they want to clean the current folder
//				while (userInput == null || !(userInput.equals("y") || userInput.equals("n"))) {
//					System.out.println("Process folder " + getFullPath(fileObject)	+ " ? (y/n)");
//					userInput = getUserInput();
//				}
//				// if user says "no", return
//				if (userInput.equals ("n")) {
//					userInput = null;
//					continue;
//				} else {
					// process each file and folder in the current folder.
					processFolder (new ArrayList<File>(Arrays.asList(fileObject.listFiles())));
//				}
//				userInput = "";
				
				
			} else if (fileObject.isFile()) {
				processFile(fileObject);
			}
		}
	}
	
	public static String getUserInput() {
		String str = "";
		try {
			str = in.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return str;
	}
	
	/**
	 * Pre: fileObject is a file, not a directory;
	 * @param fileObject
	 */
	private static void processFile (File fileObject) {
		
		if (fileObject.getName().toLowerCase().endsWith(".java")) {
			// Check if the file contains "generated NOT"
			boolean isCustomFile = false;
			boolean isGeneratedFile = false;
			try {
				 isCustomFile = fileParserGeneratedNOT.patternOccurrsOnce(fileObject);
				 isGeneratedFile = fileParserGenerated.patternOccurrsOnce(fileObject);
			} catch (IOException e) {
				System.err.println ("Could not search file " + getFullPath(fileObject) + ". ");
				e.printStackTrace();
				System.exit(-1);
			}
			if (isGeneratedFile) {
				// file contains @generated 
				if (!isCustomFile) {
					// but does not contain @generated NOT 
					boolean deletedSuccessfully = fileObject.delete();
					if (!deletedSuccessfully) {
						System.err.println ("Could not delete file " + getFullPath(fileObject));
					} else {
						System.out.println ("Deleted file:" +  getFullPath(fileObject));
						totalDeleted++;
					}
				} else {
					System.out.println ("(CC)" +  getFullPath(fileObject));
					totalCustomClasses++;
				}
			} else {
				System.out.println ("(NG)" +  getFullPath(fileObject));
				totalNeverGenerated++;
			}
		}
	}
	
	private static String getFullPath (File f) {
		String fullPath = f.getName();
		try {
			 fullPath = f.getCanonicalPath();
		} catch (IOException e) {
			System.err.println ("Could not get canonical path for file " +  f.getName());
			e.printStackTrace();
		}
		return fullPath;
		
		
	}

}
