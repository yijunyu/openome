/*
 * Created on Jun 9, 2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package edu.toronto.cs.q7;

import java.util.Enumeration;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

import edu.toronto.cs.q7.codegen.CodeGenerator;
import edu.toronto.cs.q7.codegen.IStarGraphCodeGenerator;
import edu.toronto.cs.q7.codegen.IStarModelCodeGenerator;
import edu.toronto.cs.q7.codegen.XMLCodeGenerator;
import edu.toronto.cs.q7.load.BPELConvertor;
import edu.toronto.cs.q7.load.Q7Convertor;
import edu.toronto.cs.q7.parser.Q7;

/**
 * @author Yijun Yu
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class q7 {
    private static ResourceBundle resources;
    static {
    	load_properties();
    }
    public static void load_properties() {
        try {
            resources = ResourceBundle.getBundle("Q7",
                                                 Locale.getDefault());
            for (Enumeration i = resources.getKeys(); i.hasMoreElements(); ) {
            	String key = (String)i.nextElement();
            	String val = resources.getString(key);
            	System.setProperty(key, val);
            }
        } catch (MissingResourceException mre) {
            System.out.println("Info: Q7.properties not found");
        }    	
    }
	public static void main(String[] args) {
		if (args.length<1) {
			System.err.println("usage: \nQ7 <input>.q7 <output>\n");
			System.err.println("Q7 <input>.xmi\n");
			System.exit(1);
		}
		if (args[0].endsWith(".q7")) {
			if (args.length<2) {
				System.err.println("usage: \nQ7 <input>.q7 <output>\n");				
				System.exit(1);
			}
			Q7.main(new String[] {args[0], args[1]});
			if (args[1].endsWith(".xml")) {
			    XMLCodeGenerator xcg = new XMLCodeGenerator(Q7.a);
			    xcg.generateGoalModel(args[1]);
			} else if (args[1].endsWith(".goalmodel")) {
				IStarModelCodeGenerator xcg = new IStarModelCodeGenerator(Q7.a);
				xcg.generateGoalModel(args[1]);
			} else if (args[1].endsWith(".q7")) {
			    CodeGenerator cg = new CodeGenerator(Q7.a);
			    cg.generateGoalModel(args[1]);
			} else if (args[1].endsWith(".tel")) {
			    IStarGraphCodeGenerator cg = new IStarGraphCodeGenerator(Q7.a);		    
			    cg.generateGoalModel(args[1]);
			}
		} else if (args[0].endsWith(".goalmodel")) {
			// load the XMI goal model into memory
			if (args[1].endsWith(".q7")) {
				Q7Convertor r = new Q7Convertor(args[0], args[1]);
				r.convert();
			}
			if (args[1].endsWith(".process")) {
				BPELConvertor r = new BPELConvertor(args[0], args[1]);
				r.convert();
			}
		}
	}
}
