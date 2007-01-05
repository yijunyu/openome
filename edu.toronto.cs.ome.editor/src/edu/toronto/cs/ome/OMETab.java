package edu.toronto.cs.ome;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.Vector;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import edu.stanford.smi.protege.model.Cls;
import edu.stanford.smi.protege.model.DefaultKnowledgeBase;
import edu.stanford.smi.protege.model.Instance;
import edu.stanford.smi.protege.model.KnowledgeBase;
import edu.stanford.smi.protege.model.KnowledgeBaseFactory;
import edu.stanford.smi.protege.model.KnowledgeBaseSourcesEditor;
import edu.stanford.smi.protege.model.SimpleInstance;
import edu.stanford.smi.protege.model.Slot;
import edu.stanford.smi.protege.model.ValueType;
import edu.stanford.smi.protege.util.FileField;
import edu.stanford.smi.protege.util.FileUtilities;
import edu.stanford.smi.protege.util.PropertyList;
import edu.stanford.smi.protege.widget.AbstractTabWidget;
import edu.stanford.smi.protege.widget.InstanceClsesPanel;
import edu.toronto.cs.ome.controller.ModelManager;
import edu.toronto.cs.ome.controller.OMEDefaultPlugin;
import edu.toronto.cs.ome.model.TelosModel;
import edu.toronto.cs.ome.view.GraphicView;
import edu.toronto.cs.ome.view.GraphicViewFrame;
import edu.toronto.cs.util.Computing;


/**
 * Editor for fields specific to this backend.
 * 
 * @author Ray Fergerson <fergerson@smi.stanford.edu>
 */
class ExampleSourcesEditor extends KnowledgeBaseSourcesEditor {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private FileField clsesField;

	private FileField itsInstancesField;

	/**
	 * create widgets to acquire everything necessary for a save to be performed
	 * successfully. In this example what is needed is two relative file names,
	 * one to store the classes and one to store the instances.
	 */
	public ExampleSourcesEditor(String projectPath, PropertyList sources) {
		super(projectPath, sources);
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(2, 1, 10, 10));
		panel.add(createClsesField());
		panel.add(createInstancesField());
		add(panel);
	}

	/**
	 * construct a file name from the base project name and an extension
	 */
	private String constructName(String projectPath, String extension) {
		String name = null;
		if (projectPath != null) {
			int index = projectPath.indexOf(".");
			if (index != -1) {
				name = projectPath.substring(0, index) + extension;
			}
		}
		return name;
	}

	private JComponent createClsesField() {
		String name = OMETab.getClsesFileName(getSources());
		if (name == null) {
			name = constructName(getProjectPath(), ".classes");
		}
		clsesField = new FileField("Classes file name", name, ".classes",
				"Ontology");
		return clsesField;
	}

	private JComponent createInstancesField() {
		String name = OMETab.getInstancesFileName(getSources());
		if (name == null) {
			name = constructName(getProjectPath(), ".instances");
		}
		itsInstancesField = new FileField("Instances file name", name,
				".instances", "Instances");
		return itsInstancesField;
	}

	private boolean hasValidValue(FileField field) {
		boolean hasValidValue;
		String value = field.getPath();
		if (value == null || value.length() == 0) {
			hasValidValue = false;
		} else {
			hasValidValue = true;
		}
		return hasValidValue;
	}

	/**
	 * the system calls this method when the user changes the project name. We
	 * should update any files whose names may depend on the project name.
	 */
	public void onProjectPathChange(String oldPath, String newPath) {
		if (newPath != null) {
			updatePath(clsesField, ".classes");
			updatePath(itsInstancesField, ".instances");
		}
	}

	/**
	 * the system calls this method when the user presses the OK button and the
	 * contents have been declared to be valid. This method should stuff any
	 * configuration information into the sources property list.
	 */
	public void saveContents() {
		String clsesFileName = clsesField.getPath();
		String instancesFileName = itsInstancesField.getPath();
		OMETab.setSourceFiles(getSources(), clsesFileName, instancesFileName);
	}

	private void updatePath(FileField field, String ext) {
		File projectFile = new File(getProjectPath());
		String projectName = projectFile.getName();
		int index = projectName.indexOf(".");
		if (index != -1) {
			projectName = projectName.substring(0, index);
		}
		String newPath = projectName + ext;
		field.setPath(newPath);
	}

	/**
	 * called by the system when the user presses the OK button. return true if
	 * the contents of the fields are valid. Otherwise pop up a dialog with a
	 * description of the problem and return false.
	 */
	public boolean validateContents() {
		boolean isComplete = hasValidValue(clsesField)
				&& hasValidValue(itsInstancesField);
		if (!isComplete) {
			isComplete = false;
		}
		return isComplete;
	}
}

public class OMETab extends AbstractTabWidget implements KnowledgeBaseFactory {
	private static final long serialVersionUID = 1L;
    private static ResourceBundle resources;
	private static final Logger LOG = Logger.getLogger("edu.toronto.cs.ome.OMETab");
    static {
    	load_properties();
    }				
	public void initialize() {
		createWidgets();
	}

	/**
	 * 
	 * @uml.property name="mm"
	 * @uml.associationEnd multiplicity="(0 1)"
	 */
	public static ModelManager mm = null;

	/**
	 * 
	 * @uml.property name="model"
	 * @uml.associationEnd multiplicity="(0 1)"
	 */
	TelosModel model = null;

	public static boolean init_layout = false;
	public void createWidgets() {
		// Here is the real interface to OME
		String modelfile = System.getProperty("model");
		while (modelfile==null) {			
			File f = GraphicView.getOpenFileAndDirectory(
					null,
					"",
					"Telos knowledge base:tel;5W2H:q7;Visio XML:vdx");
			if (f != null && f.exists()) {
				modelfile = f.getAbsolutePath();
			}
		}
		modelfile = new File(modelfile).getAbsolutePath();
		try {
			mm = new ModelManager(this);
			if(modelfile!=null) {
				File f = ModelManager.apply_xslt(new File(modelfile));
				if (f!=null) {
					modelfile = f.getAbsolutePath();
					model = (TelosModel) mm.openModel(modelfile);
				}
			}
			if (model != null) {
				Iterator i = model.getViewManager().getViews();
				while (i.hasNext()) {
					GraphicView gv = (GraphicView) i.next();
					GraphicViewFrame gvf = new GraphicViewFrame(800, gv, modelfile);
					gvf.setModelPath(modelfile);
					InstanceClsesPanel p;
					inProtege = System.getProperty("protege")!=null;
					if (inProtege) {
						p = new InstanceClsesPanel(getProject());
						JSplitPane pane = createLeftRightSplitPane(
								"OMETab.left_right", 200);
						pane.setLeftComponent(p);
						pane.setRightComponent(gvf);
						add(pane);
					} else {
						setFrame(gvf);
					}
					iframe = gvf;
				}
				if (init_layout) {
					File dot=new File(Computing.getTempFilename("test.dot"));
					try {
						model.layout(dot);
					} catch (Exception e1) {
						e1.printStackTrace();
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public KnowledgeBase getKnowledgeBase() {
		if (getProject() == null) {
			Collection errors = new ArrayList();
			return createKnowledgeBase(errors);
		}
		return getProject().getKnowledgeBase();
	}

	/**
	 * 
	 * @uml.property name="ot"
	 * @uml.associationEnd multiplicity="(0 1)"
	 */
	public static OMETab ot;

	public static JFrame frame;

	public static JInternalFrame iframe;

	public static void main(String[] args) {
		frame = new JFrame("OMETab test");
//		frame.addWindowListener(new WindowAdapter() {
//			public void windowClosing(WindowEvent e) {
//				
//				System.exit(0);
//			}
//		});
		frame.setBounds(0, 0, 800, 800);
		ot = new OMETab();
		if (args.length >= 1)
			System.setProperty("model", args[0]);
		ot.createWidgets();
	}

	static public final String CLASS_FILE_NAME_PROPERTY = "example_class_file_name";

	static public final String INSTANCE_FILE_NAME_PROPERTY = "example_instance_file_name";

	public static boolean inProtege;

	/*
	 * (non-Javadoc)
	 * 
	 * @see edu.stanford.smi.protege.model.KnowledgeBaseFactory#createKnowledgeBase(java.util.Collection)
	 */
	public KnowledgeBase createKnowledgeBase(Collection errors) {
		KnowledgeBase kb = new DefaultKnowledgeBase(this);
		Cls a = kb.createCls("Example_Root", kb.getRootClses());
		Vector v = new Vector();
		v.add(a);
		kb.createCls("Example_B", v);
		return kb;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see edu.stanford.smi.protege.model.KnowledgeBaseFactory#createKnowledgeBaseSourcesEditor(java.lang.String,
	 *      edu.stanford.smi.protege.util.PropertyList)
	 */
	public KnowledgeBaseSourcesEditor createKnowledgeBaseSourcesEditor(
			String projectName, PropertyList sources) {
		return new ExampleSourcesEditor(projectName, sources);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see edu.stanford.smi.protege.model.KnowledgeBaseFactory#getDescription()
	 */
	public String getDescription() {
		return "OME backend";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see edu.stanford.smi.protege.model.KnowledgeBaseFactory#getProjectFilePath()
	 */
	public String getProjectFilePath() {
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see edu.stanford.smi.protege.model.KnowledgeBaseFactory#includeKnowledgeBase(edu.stanford.smi.protege.model.KnowledgeBase,
	 *      edu.stanford.smi.protege.util.PropertyList, java.util.Collection)
	 */
	public void includeKnowledgeBase(KnowledgeBase kb, PropertyList sources,
			Collection errors) {
		load(kb, sources, errors, true);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see edu.stanford.smi.protege.model.KnowledgeBaseFactory#isComplete(edu.stanford.smi.protege.util.PropertyList)
	 */
	public boolean isComplete(PropertyList sources) {
		return sources.getString(CLASS_FILE_NAME_PROPERTY) != null
				&& sources.getString(INSTANCE_FILE_NAME_PROPERTY) != null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see edu.stanford.smi.protege.model.KnowledgeBaseFactory#loadKnowledgeBase(edu.stanford.smi.protege.model.KnowledgeBase,
	 *      edu.stanford.smi.protege.util.PropertyList, java.util.Collection)
	 */
	public void loadKnowledgeBase(KnowledgeBase kb, PropertyList sources,
			Collection errors) {
		load(kb, sources, errors, false);
	}

	/**
	 * extract a relative file name from the sources property list and turn it
	 * into a reader. The FileUtilities class handles turning the relative file
	 * name into an absolute name using the project file location.
	 */
	private Reader getReader(String propertyName, PropertyList sources) {
		Reader reader = null;
		String filename = sources.getString(propertyName);
		if (filename != null) {
			reader = FileUtilities.getReader(filename);
		}
		return reader;
	}

	/**
	 * extract a relative file name from the sources property list and turn it
	 * into a writer. The FileUtilities class handles turning the relative file
	 * name into an absolute name using the project file location.
	 */
	private Writer getWriter(String propertyName, PropertyList sources) {
		Writer writer = null;
		String filename = sources.getString(propertyName);
		if (filename != null) {
			writer = FileUtilities.getWriter(filename);
		}
		return writer;
	}

	/**
	 * We aren't really going to load anything from the files. We just populate
	 * the kb with a random set of classes. In a real system these classes would
	 * be the result of parsing the files.
	 */
	private void loadClses(Reader reader, KnowledgeBase kb, Collection errors,
			boolean isIncluded) {
	}

	/**
	 * We aren't really going to load anything from the files. We just populate
	 * the kb with a random set of instances. In a real system these instances
	 * would be the result of parsing the files.
	 */
	private void loadInstances(Reader reader, KnowledgeBase kb,
			Collection errors, boolean isIncluded) {
		Cls a = kb.getCls("Class_A");
		Slot s = kb.getSlot("slot_s");

		Instance i = createInstance("Instance_A", a, kb, isIncluded);
		i.setOwnSlotValue(s, "example slot value");
	}

	private void load(KnowledgeBase kb, PropertyList sources,
			Collection errors, boolean isIncluded) {
		loadClses(getReader(CLASS_FILE_NAME_PROPERTY, sources), kb, errors,
				isIncluded);
		loadInstances(getReader(INSTANCE_FILE_NAME_PROPERTY, sources), kb,
				errors, isIncluded);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see edu.stanford.smi.protege.model.KnowledgeBaseFactory#saveKnowledgeBase(edu.stanford.smi.protege.model.KnowledgeBase,
	 *      edu.stanford.smi.protege.util.PropertyList, java.util.Collection)
	 */
	public void saveKnowledgeBase(KnowledgeBase kb, PropertyList sources,
			Collection errors) {
		saveClsesAndSlots(getWriter(CLASS_FILE_NAME_PROPERTY, sources), kb,
				errors);
		saveSimpleInstances(getWriter(INSTANCE_FILE_NAME_PROPERTY, sources),
				kb, errors);
		// comment this next line out if you want the save to succeed.
		errors
				.add("Warning:  The knowledge base is not really saved with the example backend");
	}

	private void saveClsesAndSlots(Writer writer, KnowledgeBase kb,
			Collection errors) {
		Iterator i = kb.getClses().iterator();
		while (i.hasNext()) {
			i.next();
		}
		Iterator j = kb.getSlots().iterator();
		while (j.hasNext()) {
			j.next();
		}
	}

	private void saveSimpleInstances(Writer writer, KnowledgeBase kb,
			Collection errors) {
		Iterator i = kb.getInstances().iterator();
		while (i.hasNext()) {
			Instance instance = (Instance) i.next();
			if (instance instanceof SimpleInstance) {
				// save instance
			}
		}
	}

	public Cls createCls(String name, Collection parents,
			Collection metaclasses, KnowledgeBase kb, boolean isIncluded) {
		if (parents != null && parents.isEmpty()) {
			parents.add(kb.getRootCls());
		}
		Cls cls = ((DefaultKnowledgeBase) kb).createCls(name, parents,
				metaclasses, isIncluded);
		return cls;
	}

	public Slot createSlot(String name1, // the slot name
			Collection metaclasses, KnowledgeBase kb, boolean isIncluded) {
		Slot slot = kb.getSlot(name1);
		if (slot == null) {
			//D.o(name1);
			slot = ((DefaultKnowledgeBase) kb).createSlot(null, name1,
					metaclasses, new Vector(), isIncluded);
		}
		return slot;
	}

	public Slot createSlot(String name1, // the slot name
			String type, KnowledgeBase kb) {
		Slot slot = kb.getSlot(name1);
		Cls m = null;
		if (!type.equals("Integer") && !type.equals("String")
				&& !type.equals("SClass")) {
			m = kb.getCls(type);
			if (m == null) {
				m = kb.createCls(type, kb.getRootClses());
			}
		}
		if (slot == null)
			slot = ((DefaultKnowledgeBase) kb).createSlot(name1);
		if (type.equals("Integer")) {
			slot.setValueType(ValueType.INTEGER);
		} else if (type.equals("String")) {
			slot.setValueType(ValueType.STRING);
		} else { // Instance
			slot.setValueType(ValueType.INSTANCE);
			if (m != null && slot != null) {
				//D.o(type);
				Collection c = slot.getAllowedClses();
				if (!c.contains(m)) {
					c.add(m);
					slot.setAllowedClses(c);
				}
			}
			if (name1.endsWith("s"))
				slot.setAllowsMultipleValues(true);
		}
		return slot;
	}

	public Instance createInstance(String name, Cls type, KnowledgeBase kb,
			boolean isIncluded) {
		Instance instance = kb.getInstance(name);
		if (instance == null)
			instance = kb.createInstance(name, type);
		instance.setIncluded(isIncluded);
		return instance;
	}

	/**
	 * a helper method to extract the name of the file for storing classes from
	 * the property list
	 */
	public static String getClsesFileName(PropertyList sources) {
		return sources.getString(CLASS_FILE_NAME_PROPERTY);
	}

	/**
	 * a helper method to extract the name of the file for storing instances
	 * from the property list
	 */
	public static String getInstancesFileName(PropertyList sources) {
		return sources.getString(INSTANCE_FILE_NAME_PROPERTY);
	}

	/**
	 * helper method to stuff the class and instances file names into the
	 * sources property list
	 */
	public static void setSourceFiles(PropertyList sources,
			String classesFileName, String instancesFileName) {
		sources.setString(CLASS_FILE_NAME_PROPERTY, classesFileName);
		sources.setString(INSTANCE_FILE_NAME_PROPERTY, instancesFileName);
	}

	/**
	 * @param in
	 */
	public static void setFrame(JInternalFrame in) {
		if (frame != null) {
			GraphicViewFrame gvf = (GraphicViewFrame) in;
			gvf.setMessage(OMEDefaultPlugin.getGraphType(OMEDefaultPlugin.to_expand));			
			JPanel a = new JPanel();
			BorderLayout b =new BorderLayout();
			b.setVgap(0);
			a.setLayout(b);
			JPanel p = gvf.createToolbar();
			a.add(p, BorderLayout.NORTH);
			a.add(gvf.getContentPane(), BorderLayout.CENTER);
			frame.addWindowListener(gvf.wl);
			frame.setTitle("OME - " + gvf.getModelPath());
			frame.setContentPane(a);
			frame.setJMenuBar((JMenuBar) gvf.getContentPane().getComponent(0));
			frame.pack();
			frame.setVisible(true);
			gvf.dispose();
		}
		if (iframe != null && inProtege) {
			iframe = in;
			iframe.pack();
			iframe.show();
		}
	}

	/*
	 * Clean up the instances of a class @author Yijun Yu @param kb -
	 * KnowledgeBase @param c - the class
	 */
	public void clearInstances(KnowledgeBase kb, Cls c) {
		Collection ins = kb.getInstances(c);
		for (Iterator i = ins.iterator(); i.hasNext();) {
			Instance I = (Instance) i.next();
			if (I==null || I.getName()==null)
				continue;
			if (I.getName().charAt(0) != ':'
					&& !I.getName().equals("<<deleted>>")) { // not system class
				kb.deleteInstance(I);
			}
		}
	}

	/*
	 * Clean up the class with its instances @author Yijun Yu
	 */
	public void clearCls(KnowledgeBase kb, Cls c) {
		if (c != null) {
			clearInstances(kb, c);
			//			D.o("deleted Cls:" + c.getName());
			kb.deleteCls(c);
		} else {
			// nothing
		}
	}

	/**
	 * Reset the knowledge base to an Empty one (with system meta classes only)
	 * 
	 * @author Yijun Yu
	 */
	public void clear() {
		KnowledgeBase kb = this.getKnowledgeBase();
		Cls c = kb.getCls("OMEObject");
		clearCls(kb, c);
		c = kb.getCls(":STANDARD-CLASS");
		clearInstances(kb, c);
	}

	/**
	 * the initialization of the logger
	 * TODO the current implemention creates a lot of temporary locked files 
	 */ 	
	static void init_logger() {
//		File loggingFile = new File(Computing.getTempFilename("openome.log"));
//	    Handler handler;
//		try {
//			handler = new FileHandler(loggingFile.getPath(), false);
//	        handler.setFormatter(new SimpleFormatter()); // don't use standard XML formatting
//	        handler.setLevel(Level.ALL);
//	        LOG.addHandler(handler); 
//		} catch (SecurityException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
	}

	public static void load_properties() {
        try {
            resources = ResourceBundle.getBundle("OME", Locale.getDefault(),
            		OMETab.class.getClassLoader());
            for (Enumeration i = resources.getKeys(); i.hasMoreElements(); ) {
            	String key = (String)i.nextElement();
            	String val = resources.getString(key);
            	System.setProperty(key, val);
            }
            init_logger();
    	        try {
					UIManager.setLookAndFeel(
					    UIManager.getSystemLookAndFeelClassName());
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				} catch (InstantiationException e) {
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				} catch (UnsupportedLookAndFeelException e) {
					e.printStackTrace();
				}
        } catch (MissingResourceException mre) {
        	mre.printStackTrace();
            System.out.println("Info: OME.properties not found");
        }
	}
}