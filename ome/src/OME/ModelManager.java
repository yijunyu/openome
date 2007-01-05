/*
   * ModelManager.java
   * 
   * created Sept 1998 by Joseph Makuch
   *
   * copyright.
   */
package OME;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Vector;

import javax.swing.JOptionPane;

import jtelos.Attribute;
import jtelos.Individual;
import jtelos.KB;
import jtelos.Levels;
import jtelos.Proposition;

/** ModelManager is used to create, load and save models and thier views. 
 *  This class should also act as a builder for Telos models.
 *  We will need to make it an interface, and re-implement as say:
 *  'TelosBuilder' we need to support anything other than telos. - say XML... 
 *  ModelManager also maintains the KBmanager, and the mappings from models to
 *  ViewManagers and KBmanagers.
 *  "XML export" has been done -- Cai, Aug.,2001.
 */
class ModelManager {
   
    Map models2vms;       
    Map models2kbs;
    Map models2plugins;
    KBManager kbm;
    OME ome;

    Collection pluginclasses;

    static final String FW_DIR = "frameworks";
    static final String PLUGIN_DIR = "plugins";
    static final String FW_SUFFIX = ".tel";
    static final String PLUGIN_SUFFIX = ".class";
    	
    /** Creates a new, empty ModelManager. */
    public ModelManager(OME ome) {
	models2vms = new HashMap();
	models2kbs = new HashMap();
	models2plugins = new HashMap();
	kbm = new KBManager();
	this.ome = ome;
    }
    
    public Collection getFrameworkChoices() {
	File dir = new File(FW_DIR);
	String files[] = dir.list();
	
	Vector v = new Vector();

	// OME gets special treatement.
	Choice c = new Choice();
	c.setName("OME");
	c.setChosen(true);
	c.setMandatory(true);
	c.setChoiceObject(FW_DIR+File.separatorChar+"ome.tel");
	v.add(c);

	// The problem here is that framework loading will happen in
	// the order that they appear in the directory listing.
	for (int j=0; j<files.length; j++) {
	    if (files[j].endsWith(FW_SUFFIX)&& !files[j].equals("ome.tel")) {
		c = new Choice();
		c.setName(files[j].substring(
			    0,files[j].length()-FW_SUFFIX.length()));
		c.setChoiceObject(FW_DIR+File.separatorChar+files[j]);
		v.add(c);
	    }
	}
	return v;
    }

    /*
    private class PluginClassLoader {
	public Class loadClass(String name) {
	    File file = new File(PLUGIN_DIR+File.separator+name+PLUGIN_SUFFIX);
	    FileInputStream fis = new FileInputStream(file);
	    byte [] buffer = new byte [(int)file.length()];
	    fis.read(buffer);
	    ClassLoader cl = ClassLoader.getSystemClassLoader();
	    Class c = cl.defineClass(null,buffer,0,buffer.length);
	    cl.resolveClass(c);
	    
	}
    }*/

    /** Creates a new model and appropriate support structures. These include
     *  KBManager, ViewManager, a Framework...  This is actually a
     *  TelosModelBuilder, as it is what creates the principle telos objects.
     */
    public OMEModel newModel(Iterator fws) throws Exception {
	D.o("Creating ModelManager.");
	//kbm = new KBManager();
	KB kb = kbm.createKB();
	
	// right now we just load all frameworks in the frameworks
	// directory. ome.tel better be in there :)
	char sep = File.separatorChar;

	while (fws.hasNext()) {
	    Choice c = (Choice)fws.next();
	    if (c.chosen()) {
		String s = (String)c.choiceObject();
		D.o("loading"+s);
		kb.fileTELL(s);
	    }
	}
	
	TelosFramework tfw = new TelosFramework(kb);
	OMEModel model = new TelosModel(kb, tfw, this, ome);
	ViewManager vm = model.getViewManager();
	
	models2vms.put(model,vm);
	models2kbs.put(model,kb);		
	initializePlugins(model);
	
	D.o("ModelManager Created.");
	return model;
    }

    /** We walk the plugin directory pulling all the classes that implement
     * the OMEPlugin interface. */
    private Iterator getAllPlugins() {
	if (pluginclasses == null) {
	    pluginclasses = new Vector();
	    
	    File dir = new File(PLUGIN_DIR);
	    String files[] = dir.list();
	    
	    for(int i=0; i< files.length; i++) {
		if (files[i].endsWith(PLUGIN_SUFFIX)) {
		    D.o("Testing plugin file: "+files[i]);
		    // this don't work for inner classes, but they`ll get
		    // loaded fine when they're needed.
		    try {
			Class c = Class.forName(files[i].substring(0,
				files[i].length() - PLUGIN_SUFFIX.length()));
			Class interfaces[] = c.getInterfaces();
			for(int j=0;j<interfaces.length; j++) {
			    if (interfaces[j].equals(OMEPlugin.class)) {
				pluginclasses.add(c);
				D.o("Is a plugin: "+files[i]);
			    }
			}
		    } catch (Exception e) {
			D.o("couldn't find class "+files[i]);
		    }
		}		
	    }
	}
	return pluginclasses.iterator();
    }

    /** Adds an entry into our table of models to compatible plugins. */
    private void initializePlugins(OMEModel model) throws Exception {
	Iterator i = getAllPlugins();
	Class omemodelclassparm [] = {OMEModel.class};
	Object modelinvokeparm [] = {model};
	Object modelconstructparm [] = {model};
	Collection ll = new LinkedList();

	// we always have this one.
	ll.add(new OMEDefaultPlugin(model));
	
	while (i.hasNext()) {
	    // for each class, ask it if it is compatible with this model. If
	    // so then make one for the model.
	    
	    Class pc = (Class)i.next();
	    Method m = null;
	    Constructor c = null;
	    
	    try {
		m = pc.getMethod("isCompatibleWith", omemodelclassparm);
		c = pc.getConstructor(omemodelclassparm);
	    } catch (Exception e) {
		D.o("Exception querrying plugin, method \"isCompatibleWith\""+
			" not found: "+e);
	    }
	    
	    if (c!=null) {
		D.o("testing: "+pc.getName());
		Boolean b = (Boolean)m.invoke(null,modelinvokeparm);
		if (b.booleanValue()) {
		    D.o("Adding plugin: "+pc.getName());
		    ll.add(c.newInstance(modelconstructparm));
		}
	    }	    
	}
	models2plugins.put(model,ll);
    }
    

    /** Returns an iterator over the models extant. */
    public Iterator getModels() {
	return models2vms.keySet().iterator();
    }

    /** returns the plugins that consider themselves compatible with this
     * model. */
    public Collection getPlugins(OMEModel model) {
	return (Collection)models2plugins.get(model);
    }

    
    /** Creates a model and ViewManager from a path. 
     *
     *  @param modelfile	the file to be loaded
     */
    public OMEModel openModel(String modelfile) throws Exception {
	D.o("loading model");
	KB kb = kbm.createKB();
	kb.fileTELL(modelfile);

	TelosFramework tfw = new TelosFramework(kb);
	OMEModel model = new TelosModel(kb,tfw, this, ome);
	ViewManager vm = model.getViewManager();;
	
	models2vms.put(model,vm);
	models2kbs.put(model,kb);
	model.load();   // NOTE:  loading the model does much of the work
			// involved in restoring the views work for all views.
	initializePlugins(model);

	// restore the views:
	Iterator i = vm.getViews();
	while (i.hasNext()) {
	    View view = (View)i.next();
	    D.o("got View " + view + "=-=-=-==-=-=-=-=-=-=-=-=");
	    view.load(new TelosViewSerializer(view.getID(),kb));
	}		

	D.o("loaded model");
	return model;
    }
    

    /** Commits a model and its serializable views to persistent storage. 
     *
     *  @param model		the model to be saved
     *  @param filename 	the name of the file the model should be saved to
     *  @param directory	the name of the directory where the file exists
     */
    public void saveModelTo(OMEModel model, String completepath)
		throws Exception { 

	//String completepath = directory + filename;
	if (!completepath.endsWith(".tel")) {
	    completepath = completepath.concat(".tel");
	}
	File file = new File(completepath);
	if (file.exists()) {
	    file.delete();
	}
	file.createNewFile();
		    
	D.o("Saving model:");
	KB kb = (KB)models2kbs.get(model);	
	
	// save the views:
	ViewManager vm = getViewManager(model);	
	Iterator i = vm.getViews();
	while (i.hasNext()) {
	    View view = (View)i.next();
	    view.save(new TelosViewSerializer(view.getID(),kb));
	}	

	// save the kb by iterating over all non-builtins
	// tyronne remove comment sign from following line.
	//File file = File.createTempFile("tmp",".tel", new File(directory));
	
	//    File(directory, filename);
	BufferedWriter writer = new BufferedWriter(new FileWriter(file));
	Individual[] individuals = kb.individuals();
	for (int c=0;c<individuals.length;c++) {
	    if(!individuals[c].isBuiltin()) {
		writer.write(JTelosUtil.telosDeclaration(individuals[c])+"\n\n");
	    }
	}
	writer.flush();
	writer.close();
	
	//String telosfilename = filename;
	//if (!telosfilename.endsWith(".tel")) {
	//    telosfilename = telosfilename.concat(".tel");
	//}
	//File old = new File(directory, telosfilename);
	
	// delete the dest if it exists.
	//if (old.exists()) {
	//    old.delete();
	//}
		
	// rename the temp file to the destination:
	//file.renameTo(old);
	//D.o("renaming to " + old);	
	D.o("Model saved.");
    }


//cai,Save model as sml file of ConceptBase.

    public void saveModelToSml(OMEModel model, String completepath)
		throws Exception { 

	//String completepath = directory + filename;
	if (!completepath.endsWith(".sml")) {
	     completepath = completepath.concat(".sml");
	}
	File file = new File(completepath);
	if (file.exists()) {
	    file.delete();
	}
	file.createNewFile();
		    
	D.o("Saving sml model:");
        int Yes = JOptionPane.showConfirmDialog(null, 
			".sml file is the O-Telos description of the model to"+
			" be used in ConceptBase.\nYou have to load the "+
			" ome.sml under \\ome3\\Program\\ConceptBaseSml\\ directory before "+
			"you feed .sml file of the model to ConceptBase.\n\nSome of "+
			"attributes from OME may not be accepted by "+
			"ConceptBase.\nDo you want to create .sml file now?", 
"Select attributes", JOptionPane.YES_NO_OPTION);

	KB kb = (KB)models2kbs.get(model);	
	
	// save the views:
	ViewManager vm = getViewManager(model);	
	Iterator i = vm.getViews();
	while (i.hasNext()) {
	    View view = (View)i.next();
	    view.save(new TelosViewSerializer(view.getID(),kb));
	}	

	// save the kb by iterating over all non-builtins
	// tyronne remove comment sign from following line.
	BufferedWriter writer = new BufferedWriter(new FileWriter(file));
	Individual[] individuals = kb.individuals();
	for (int c=0;c<individuals.length;c++) {

//cai,want to reverse the order of save,but not works
//	for (int c=individuals.length;c>0;c--) {

	    if(!individuals[c].isBuiltin()) {
                if (Yes == JOptionPane.YES_OPTION)
		writer.write(JTelosUtil.OtelosDeclaration(individuals[c])+"\n\n");
                else writer.write(JTelosUtil.OtelosDeclarationNoattribute(individuals[c])+"\n\n");
	    }
	}
	writer.flush();
	writer.close();
	
	D.o("sml Model saved.");
    }
    
//cai,Save model as xml file.

    public void saveModelToXml(OMEModel model, String completepath)
		throws Exception { 
 
        int Yes = JOptionPane.showConfirmDialog(null, 
	"Don't forget to put the DTD file in the same directory with the .xml file "+
	"before you open .xml files. \nNow GRL.dtd can be found in " +
	"\\ome3\\program\\XmlDtd\\ directory. \n Continue ? ", 
	"GRL.dtd", JOptionPane.YES_NO_OPTION);
       if (Yes == JOptionPane.NO_OPTION) return;

	//String completepath = directory + filename;
	if (!completepath.endsWith(".xml")) {
	     completepath = completepath.concat(".xml");
	}
	File file = new File(completepath);
	if (file.exists()) {
	    file.delete();
	}
	file.createNewFile();
		    
	D.o("Saving xml model:");


	KB kb = (KB)models2kbs.get(model);	
	
	// save the views:
	ViewManager vm = getViewManager(model);	
	Iterator i = vm.getViews();
	while (i.hasNext()) {
	    View view = (View)i.next();
	    view.save(new TelosViewSerializer(view.getID(),kb));
	}	

	// save the kb by iterating over all non-builtins
	// tyronne remove comment sign from following line.
	BufferedWriter writer = new BufferedWriter(new FileWriter(file));

        writer.write("<?xml version=\0421.0\042 encoding=\042UTF-8\042?>\n");
        writer.write("<!DOCTYPE grl-spec SYSTEM \042GRL.dtd\042>\n");
        writer.write("<grl-spec>\n  <element-definitions>\n");
 
	Individual[] individuals = kb.individuals();
	for (int c=0;c<individuals.length;c++) {
	    if(!individuals[c].isBuiltin()&&individuals[c].level()==Levels.TOKEN_LEVEL) {
                writer.write("    <element>\n");
                writer.write("      <element element-id=");
	writer.write(JTelosUtil.XmlElementDeclaration(individuals[c]));
          Attribute[] directAttrs = individuals[c].directAttributes();
          for(int ii=0;ii<directAttrs.length;ii++) {
	    String[] catLabels = directAttrs[ii].categories();
	    for(int j=0;j<catLabels.length;j++) {
           if (catLabels[j].equals("name")){
                writer.write("\n               name="+directAttrs[ii].to().telosName());
            }
           }
          }

                writer.write("/>\n");
                writer.write("    </element>\n");

	    }
	}
        writer.write("  </element-definitions>\n\n");
        writer.write("  <goal-model>\n");
        writer.write("    <goal-model goal-model-id=\042"+completepath+"\042/>\n");
        writer.write("  <model-constructors>\n");
        writer.write("    <actors>\n");
 	for (int c=0;c<individuals.length;c++) {  //for actors
	    if(!individuals[c].isBuiltin()&&individuals[c].level()==Levels.TOKEN_LEVEL) {
              	Proposition[] directAncestors = 
		JTelosUtil.removeBuiltIns(individuals[c].directAncestors());
                String ElementType ="";
                ElementType += directAncestors[0];
          	if(ElementType.equals("GRLActorElement")) {
	            writer.write("      <actor>\n        <actor actor-id=");
	writer.write(JTelosUtil.XmlElementDeclaration(individuals[c]));

          Attribute[] directAttrs = individuals[c].directAttributes();
          for(int ii=0;ii<directAttrs.length;ii++) {
	    String[] catLabels = directAttrs[ii].categories();
	    for(int j=0;j<catLabels.length;j++) {
           if (catLabels[j].equals("name")){
                writer.write("\n               actor-name="+directAttrs[ii].to().telosName());
            }
           }
          }
        writer.write("/>\n      </actor>\n");
               }
             }
           }
        writer.write("    </actors>\n");
        writer.write("    <intentional-elements>\n");
        writer.write("      <intentional-element>\n");
 	for (int c=0;c<individuals.length;c++) {  //for intentional elements
	    if(!individuals[c].isBuiltin()&&individuals[c].level()==Levels.TOKEN_LEVEL) {
              	Proposition[] directAncestors = 
		JTelosUtil.removeBuiltIns(individuals[c].directAncestors());
                String ElementType ="";
                ElementType += directAncestors[0];
//          	if(ElementType.equalsIgnoreCase("GRLGoalElement")) {
          	if(ElementType.equals("GRLGoalElement")) {

	            writer.write("      <goal>\n        <goal goal-id=");
	writer.write(JTelosUtil.XmlElementDeclaration(individuals[c]));
          Attribute[] directAttrs = individuals[c].directAttributes();
          for(int ii=0;ii<directAttrs.length;ii++) {
	    String[] catLabels = directAttrs[ii].categories();
	    for(int j=0;j<catLabels.length;j++) {
           if (catLabels[j].equals("name")){
                writer.write("\n              goal-name="+directAttrs[ii].to().telosName());
            }
           }
          }
        writer.write("/>\n      </goal>\n");

               }
          	if(ElementType.equals("GRLTaskElement")) {
	            writer.write("      <task>\n        <task task-id=");
	writer.write(JTelosUtil.XmlElementDeclaration(individuals[c]));
          Attribute[] directAttrs = individuals[c].directAttributes();
          for(int ii=0;ii<directAttrs.length;ii++) {
	    String[] catLabels = directAttrs[ii].categories();
	    for(int j=0;j<catLabels.length;j++) {
           if (catLabels[j].equals("name")){
                writer.write("\n              task-name="+directAttrs[ii].to().telosName());
            }
           }
          }
        writer.write("/>\n      </task>\n");

               }
          	if(ElementType.equals("GRLSoftgoalElement")) {

	            writer.write("      <softgoal>\n        <softgoal softgoal-id=");
	writer.write(JTelosUtil.XmlElementDeclaration(individuals[c]));
          Attribute[] directAttrs = individuals[c].directAttributes();
          for(int ii=0;ii<directAttrs.length;ii++) {
	    String[] catLabels = directAttrs[ii].categories();
	    for(int j=0;j<catLabels.length;j++) {
           if (catLabels[j].equals("name")){
                writer.write("\n                  softgoal-name="+directAttrs[ii].to().telosName());
            }
           }
          }
        writer.write("/>\n      </softgoal>\n");


               }
          	if(ElementType.equals("GRLResourceElement")) {
	            writer.write("      <resource>\n        <resource resource-id=");
	writer.write(JTelosUtil.XmlElementDeclaration(individuals[c]));
          Attribute[] directAttrs = individuals[c].directAttributes();
          for(int ii=0;ii<directAttrs.length;ii++) {
	    String[] catLabels = directAttrs[ii].categories();
	    for(int j=0;j<catLabels.length;j++) {
           if (catLabels[j].equals("name")){
                writer.write("\n                  resource-name="+directAttrs[ii].to().telosName());
            }
           }
          }
        writer.write("/>\n      </resource>\n");

               }
          	if(ElementType.equals("GRLBeliefElement")) {
	            writer.write("      <belief>\n        <belief belief-id=");
	writer.write(JTelosUtil.XmlElementDeclaration(individuals[c]));
          Attribute[] directAttrs = individuals[c].directAttributes();
          for(int ii=0;ii<directAttrs.length;ii++) {
	    String[] catLabels = directAttrs[ii].categories();
	    for(int j=0;j<catLabels.length;j++) {
           if (catLabels[j].equals("name")){
                writer.write("\n                belief-name="+directAttrs[ii].to().telosName());
            }
           }
          }
        writer.write("/>\n      </belief>\n");

               }
	    }
	}
        writer.write("      </intentional-element>\n");
        writer.write("    </intentional-elements>\n");

        writer.write("    <intentional-relationships>\n");
        writer.write("      <intentional-relationship>\n");
 	for (int c=0;c<individuals.length;c++) {   //for intentional relationship
	    if(!individuals[c].isBuiltin()&&individuals[c].level()==Levels.TOKEN_LEVEL) {
              	Proposition[] directAncestors = 
		JTelosUtil.removeBuiltIns(individuals[c].directAncestors());
                String ElementType ="";
                ElementType += directAncestors[0];

          	if(ElementType.equals("GRLCorrelationLink")) {

	            writer.write("        <correlation>\n");
	            writer.write("          <correlation correlation-id=");
	writer.write(JTelosUtil.XmlElementDeclaration(individuals[c])+"/>\n");

          Attribute[] directAttrs = individuals[c].directAttributes();
          for(int ii=0;ii<directAttrs.length;ii++) {
	    String[] catLabels = directAttrs[ii].categories();
	    for(int j=0;j<catLabels.length;j++) {
            if (catLabels[j].equals("to")){
            writer.write("          <correlatee>"+directAttrs[ii].to().telosName()+"</correlatee>\n");
            }
           if (catLabels[j].equals("from")){
            writer.write("          <correlator>"+directAttrs[ii].to().telosName()+"</correlator>\n");
            }
           if (catLabels[j].equals("type")){
            writer.write("          <correlation-type>"+directAttrs[ii].to().telosName()+"</correlation-type>>\n");
            }
           }
          }
                    writer.write("        </correlation>\n");
         }

          	if(ElementType.equals("GRLOrContribution")) {
	            writer.write("        <orcontribution>\n");
	            writer.write("          <orcontribution orcontribution-id=");
	writer.write(JTelosUtil.XmlElementDeclaration(individuals[c])+"/>\n");

          Attribute[] directAttrs = individuals[c].directAttributes();
          for(int ii=0;ii<directAttrs.length;ii++) {
	    String[] catLabels = directAttrs[ii].categories();
	    for(int j=0;j<catLabels.length;j++) {
            if (catLabels[j].equals("to")){
            writer.write("          <contributee>"+directAttrs[ii].to().telosName()+"</contributee>\n");
            }
           if (catLabels[j].equals("from")){
            writer.write("          <contributor>"+directAttrs[ii].to().telosName()+"</contributor>\n");
            }
           if (catLabels[j].equals("type")){
            writer.write("          <contribution-type>\n            <contribution-type  contri-type=\042"+directAttrs[ii].to().telosName()+"\042/>\n          </contribution-type>\n");
            }
           }
          }
                    writer.write("        </orcontribution>\n");
         }

          	if(ElementType.equals("GRLAndContribution")) {
	            writer.write("        <andcontribution>\n");
	            writer.write("          <andcontribution andcontribution-id=");
	writer.write(JTelosUtil.XmlElementDeclaration(individuals[c])+"/>\n");
          Attribute[] directAttrs = individuals[c].directAttributes();
          for(int ii=0;ii<directAttrs.length;ii++) {
	    String[] catLabels = directAttrs[ii].categories();
	    for(int j=0;j<catLabels.length;j++) {
            if (catLabels[j].equals("to")){
            writer.write("          <contributee>"+directAttrs[ii].to().telosName()+"</contributee>\n");
            }
           if (catLabels[j].equals("from")){
            writer.write("          <contributor>"+directAttrs[ii].to().telosName()+"</contributor>\n");
            }
           if (catLabels[j].equals("type")){
            writer.write("          <contribution-type>\n            <contribution-type  contri-type=\042"+directAttrs[ii].to().telosName()+"\042/>\n          </contribution-type>\n");

            }
           }
          }
                    writer.write("        </andcontribution>\n");
         }

          	if(ElementType.equals("GRLDependencyLink")) {
	            writer.write("        <dependency>\n");
	            writer.write("          <dependency dependency-id=");
	writer.write(JTelosUtil.XmlElementDeclaration(individuals[c])+"/>\n");

          Attribute[] directAttrs = individuals[c].directAttributes();
          for(int ii=0;ii<directAttrs.length;ii++) {
	    String[] catLabels = directAttrs[ii].categories();
	    for(int j=0;j<catLabels.length;j++) {
            if (catLabels[j].equals("to")){
            writer.write("          <dependee>"+directAttrs[ii].to().telosName()+"</dependee>\n");
            }
           if (catLabels[j].equals("from")){
            writer.write("          <depender>"+directAttrs[ii].to().telosName()+"</depender>\n");
            }
           }
          }
                    writer.write("        </dependency>\n");
         }

          	if(ElementType.equals("GRLDecompositionLink")) {
	            writer.write("        <decomposition>\n");
	            writer.write("          <decomposition decomposition-id=");
	writer.write(JTelosUtil.XmlElementDeclaration(individuals[c])+"/>\n");

          Attribute[] directAttrs = individuals[c].directAttributes();
          for(int ii=0;ii<directAttrs.length;ii++) {
	    String[] catLabels = directAttrs[ii].categories();
	    for(int j=0;j<catLabels.length;j++) {
            if (catLabels[j].equals("to")){
            writer.write("          <decomposed-element>"+directAttrs[ii].to().telosName()+"</decomposed-element>\n");
            }
           if (catLabels[j].equals("from")){
            writer.write("          <sub-element>"+directAttrs[ii].to().telosName()+"</sub-element>\n");
            }
           }
          }
//	            writer.write("          <decomposition decomposition-id=");
//	writer.write(JTelosUtil.XmlElementDeclaration(individuals[c])+"/>\n");
                    writer.write("        </decomposition>\n");
         }

          	if(ElementType.equals("GRLMeansEndsLink")) {
	            writer.write("        <means-ends>\n");
	            writer.write("          <means-ends means-ends-id=");
	writer.write(JTelosUtil.XmlElementDeclaration(individuals[c])+"/>\n");

          Attribute[] directAttrs = individuals[c].directAttributes();
          for(int ii=0;ii<directAttrs.length;ii++) {
	    String[] catLabels = directAttrs[ii].categories();
	    for(int j=0;j<catLabels.length;j++) {
            if (catLabels[j].equals("to")){
            writer.write("          <end-element>"+directAttrs[ii].to().telosName()+"</end-element>\n");
            }
           if (catLabels[j].equals("from")){
            writer.write("          <means-element>"+directAttrs[ii].to().telosName()+"</means-element>\n");
            }
           }
          }
//	            writer.write("          <means-ends means-ends-id=");
//	writer.write(JTelosUtil.XmlElementDeclaration(individuals[c])+"/>\n");
                    writer.write("        </means-ends>\n");
         }

       }
      }
        writer.write("      </intentional-relationship>\n");
        writer.write("    </intentional-relationships>\n");
        writer.write("  </model-constructors>\n");
        writer.write("  </goal-model>\n");
        writer.write("</grl-spec>");

//	Individual[] individuals = kb.individuals();
//	for (int c=0;c<individuals.length;c++) {


//	    if(!individuals[c].isBuiltin()) {
//                if (Yes == JOptionPane.YES_OPTION)
//		writer.write(JTelosUtil.XmlDeclaration(individuals[c])+"\n\n");
//                else writer.write(JTelosUtil.OtelosDeclarationNoattribute(individuals[c])+"\n\n");
//	    }
//	}
	writer.flush();
	writer.close();
	
	D.o("xml Model saved.");
    }
    

    

    /** Removes a model and its views. This does not check whether either the
     *  models or their vms are dirty. 
     *
     *  @param model	 the model to be closed
     */
    public void closeModel(OMEModel model) {
	model = model;
    }
    

    /** Returns the Viewmanager for a model. 
     *
     *  @param model 	the model whose View Manager we want
     */
    public ViewManager getViewManager(OMEModel model) {
	return (ViewManager)models2vms.get(model);
    }

}
