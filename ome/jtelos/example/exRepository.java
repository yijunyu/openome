
package jtelos.example;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

import jtelos.KB;
import jtelos.Repository;
import jtelos.StaticHelper;
import jtelos.util.RuntimeEncapsulatorException;

public class exRepository implements Repository {

  private Hashtable kbs = new Hashtable();

  private File kbFile;
  private BufferedReader reader;



  public exRepository(){
	// kbs.put("KB",
	//         jtelos.example.exKB.New("KB",
	//         System.getProperty("teloshome")+"KB.tel"));
	if (this.getClass().getName().equals("jtelos.example.exRepository")) {
		kbs.put("KB",new exKB("KB",this));
	    kbFile = new java.io.File("Telos.kbs");
	    readKBs();
	}
  }  

  public void addKB(KB kb) {kbs.put(kb.name(),kb); }  

  private void addToFile(String name) {
	Vector v = readToVector();
	try {
	  BufferedWriter writer = new BufferedWriter(new FileWriter(kbFile));
	  for(int i=0;i<v.size();i++) writer.write((String)v.elementAt(i)+"\n");
	  writer.write(name+"\n");
	  writer.flush();
	} catch (Throwable e) {throw StaticHelper.wrap(e,"addToFile("+name+")");}
  }  

  public void delete(KB kb) {
	if(kb.name().equals("KB"))
	  throw new RuntimeException("Cannot delete KB: 'KB'");
	kb.deletePersistence();
	kbs.remove(kb.name());
	deleteFromFile(kb.name());
	p("exRepository deleted KB '"+kb.name()+"'.");
  }  

  private void deleteFromFile(String name) {
	Vector v = readToVector();
	try {
	  BufferedWriter writer = new BufferedWriter(new FileWriter(kbFile));
	  for(int i=0;i<v.size();i++) {
	String line = (String) v.elementAt(i);
	  if(!line.equals(name)) writer.write(line +"\n");
	  }
	  writer.flush();
	} catch (Throwable e) {throw StaticHelper.wrap(e,"addToFile("+name+")");}
  }  

  public KB[] kbs() {
	KB[] result = new KB[kbs.size()];
	Enumeration en = kbs.elements();
	for(int i=0;i<result.length;i++) {
	  result[i] = (KB) en.nextElement();
	}
	return result;
  }  

  /**
   * Returns a KB matching the name <em>if one has been
   * created</em>. Otherwise it throws an exception.
   **/
  public KB lookup(String name) {
	KB result = (KB) kbs.get(name);
	if (result == null) throw new RuntimeException(
	  "KB.lookup("+name+")couldn't find a KB matching the name.");
	return result;
  }  

  /**
   * The second parameter indicates the Java class that the KB should
   * instantiate. The method a KB matching the name and implementation
   * (class name) parameters if one has already been created. If the
   * name but not class name match then it throws an exception. If
   * there is no name match, it creates a new KB from the constructor
   * of the indicated class. This constructor must take a single
   * parameter: the name of the KB.
   **/
  public KB newKB(String name) {
	//p("Repository.New("+name+","+className+","+path+")");
	KB result = (KB) kbs.get(name);
	if (result == null) {
	  try {
	result = new exKB(name,this);
	kbs.put(name,result);
	addToFile(name);
	  } catch (Exception e) { throw new RuntimeEncapsulatorException(e); } 
	  p("exRepository.newKB("+name+") created KB: '"+name+"'");
	} 
	return result;
  }  

  private void p(String s) { System.err.println(s); }  

  private void p(boolean b, String s) { if (b) p(s); }  

  private void readKBs() {
	Vector v = readToVector();
	for(int i=0;i<v.size();i++) {
	  String kbName = (String)v.elementAt(i);
	  kbs.put(kbName,new exKB(kbName,this));
	}
  }  

  private Vector readToVector() {
	Vector v = new Vector();
	try {
	  reader = new BufferedReader(new FileReader(kbFile));
	} catch (Throwable e) { return v;}
	try {
	  String line;
	  while ((line = reader.readLine()) != null) v.addElement(line);
	  return v;
	} catch (Throwable e) { throw StaticHelper.wrap(e,"readToVector()"); }
  }  

}