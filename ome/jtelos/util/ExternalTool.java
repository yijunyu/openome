
package jtelos.util;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ExternalTool {

  // =========================================================================
  // Fields
  // =========================================================================

  private static Runtime runtime = Runtime.getRuntime();


  protected static Process exec(String[] cmds) {
	System.out.print("cmd:");
	for(int i=0;i<cmds.length;i++) System.out.print(" "+cmds[i]);
	System.out.println("");
	try {
	  return runtime.exec(cmds);
	} catch (Exception e) {
	  e.printStackTrace();
	  return null;
	}
  }  

  //==========================================================================
  // Private helper methods
  //==========================================================================

  protected static Process exec(String cmd) {
	//    System.out.println("cmd: "+ cmd);
	try {
	  return runtime.exec(cmd);
	} catch (Exception e) {
	  e.printStackTrace();
	  return null;
	}
  }  

  protected static BufferedReader getErrReader(Process proc) {
	return new BufferedReader(new InputStreamReader(proc.getErrorStream()));
  }  

  protected static BufferedReader getReader(Process proc) {
	return new BufferedReader(new InputStreamReader(proc.getInputStream()));
  }  

  public static void main(String[] argv) {
	ExternalTool t = new ExternalTool();
	print(t.getReader(t.exec(argv)));
	//    print(t.getReader(t.exec(argv[0])));
  }  

  protected static void p(boolean debug, String message) {
	if (debug) System.err.println(message);
  }  

  protected static void print(BufferedReader reader) {
	try {
	  //      System.out.println("print: ready: "+reader.ready());
	  String line;
	  while((line = reader.readLine()) != null) {
	System.out.println(line);
	  }
	} catch (Exception e) { e.printStackTrace(); }
  }  

  protected static void print(Process proc) {
	print(getErrReader(proc));
	print(getReader(proc));
  }  

  protected static void print(String cmd) {
	print(getErrReader(exec(cmd)));
	print(getReader(exec(cmd)));
  }  

}