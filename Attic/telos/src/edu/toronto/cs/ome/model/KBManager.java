package edu.toronto.cs.ome.model;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

import jtelos.KB;
import edu.toronto.cs.telos.TelosParserKB;

/**
 * Creates KBs, and remembers their names. It is not clear whether this class
 * should remain separate from the ModelManager(Builder) class....
 */
public class KBManager {
	Map kbs2filenames = null;
	private int kbcount = 0;

	/** Create a new kb. Use this to get a clean file. */
	public KB createKB() throws Exception {
		if (kbs2filenames == null)
			kbs2filenames = new HashMap();

		File d = new File(".");
		File f = File.createTempFile("tmpkb", ".kbs", d);
		f.delete();
		//KB kb = new cppKB("kb_" + kbcount++, f.getName());
		KB kb=new TelosParserKB("kb_" + kbcount++, f.getName());
		kbs2filenames.put(kb, f.getName());
		//D.o("KB created.");
		return kb;
	}

	public String getKBFileName(KB kb) {
		return (String) kbs2filenames.get(kb);
	}

}

