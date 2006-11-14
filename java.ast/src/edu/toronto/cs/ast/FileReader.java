package edu.toronto.cs.ast;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

import org.eclipse.jface.text.Document;

/*
 * Created on Jan 18, 2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */

/**
 * @author Yiqiao Wang
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class FileReader {
	public Document readFile(String filename) {
		
		Document doc = new Document();
			Reader in = null;
			try {
				final int DEFAULT_FILE_SIZE = 15 * 1024;
				in = new BufferedReader(new InputStreamReader(new FileInputStream(
						new File(filename))), DEFAULT_FILE_SIZE);
				StringBuffer buffer = new StringBuffer(DEFAULT_FILE_SIZE);
				char[] readBuffer = new char[2048];
				int n = in.read(readBuffer);
				while (n > 0) {
					buffer.append(readBuffer, 0, n);
					n = in.read(readBuffer);
				}
				doc.set(buffer.toString());
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				if (in != null) {
					try {
						in.close();
					} catch (IOException x) {
					}
				}
			}
			return doc;
		}
	
	
}
