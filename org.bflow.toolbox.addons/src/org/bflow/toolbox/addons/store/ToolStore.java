package org.bflow.toolbox.addons.store;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Vector;

import org.bflow.toolbox.addons.events.ToolStoreListener;
import org.bflow.toolbox.addons.utils.ToolDescriptor;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

/**
 * Defines a store of installed tools.
 * @author Arian Storch
 * @since 17/04/10
 * @version 28/11/10
 */
public class ToolStore 
{
	/**
	 * Holds all installed tools.
	 */
	private static Vector<ToolDescriptor> installedTools = new Vector<ToolDescriptor>();
	
	/**
	 * init state
	 */
	private static boolean init = false;
	
	/**
	 * holds all installed listeners
	 */
	private static Vector<ToolStoreListener> storeListener = new Vector<ToolStoreListener>();
	
	/**
	 * Installs the descripted tool.
	 * @param descriptor tool descriptor
	 */
	public static void installTool(ToolDescriptor descriptor)
	{
		if(!init)
			init();
		
		if(!installedTools.contains(descriptor))
			installedTools.add(descriptor);
	}
	
	/**
	 * Removes the tools specified by the name.
	 * @param name name of the tool to remove.
	 */
	public static void removeTool(String name)
	{
		if(!init)
			init();
		
		for(ToolDescriptor tool:installedTools)
			if(tool.getName().equals(name))
			{
				installedTools.remove(tool);
				return ;
			}
	}
	
	/**
	 * Returns the ToolDescriptor defined by the name.
	 * @param name name of the tool
	 * @return ToolDescriptor or null
	 */
	public static ToolDescriptor getTool(String name)
	{
		if(!init)
			init();
		
		for(ToolDescriptor tool:installedTools)
			if(tool.getName().equals(name))
				return tool;
		
		return null;
	}
	
	/**
	 * Saves the toolmap.
	 */
	public static void save()
	{
		if(!init)
			init();
		
		fireStoreUpdateEvent();
		
		Document xmlDocument = DocumentHelper.createDocument();
		Element root = xmlDocument.addElement("toolmap");
		
		for(ToolDescriptor td:installedTools)
		{
			Element tool = root.addElement("tool");
			tool.addAttribute("name", td.getName());
			tool.addAttribute("path", td.getPath());
			tool.addAttribute("param", td.getParam());
		}
		
		try
		{
			OutputFormat format = OutputFormat.createPrettyPrint();
			
			if(!Key.KEY_TOOLSTORE_FILE.exists())
			{
				Key.KEY_TOOLSTORE_FILE.getParentFile().mkdirs();
				Key.KEY_TOOLSTORE_FILE.createNewFile();
			}
			
			XMLWriter writer = new XMLWriter(new FileWriter(Key.KEY_TOOLSTORE_FILE), format);
			
			writer.write(xmlDocument);
			writer.close();
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
	}
	
	/**
	 * Returns a vector with descriptions of all installed tools.
	 * @return vector with descriptions of all installed tools
	 */
	public static Vector<ToolDescriptor> getInstalledTools()
	{
		if(!init)
			init();
		
		return installedTools;
	}
	
	/**
	 * Inits the map. <p/>
	 * If you subclass then you can use this method to do extra stuff.
	 */
	protected static void init()
	{
		SAXReader reader = new SAXReader();
		
		try
		{
			Document xmlDocument = reader.read(Key.KEY_TOOLSTORE_FILE);
			Element root = xmlDocument.getRootElement();
			
			for(Iterator<?> it = root.elementIterator("tool"); it.hasNext(); )
			{
				Element tool = (Element)it.next();
				
				String name = tool.attributeValue("name");
				String path = tool.attributeValue("path");
				String param = tool.attributeValue("param");
				
				installedTools.add(new ToolDescriptor(name, path, param));
			}
		}
		catch(DocumentException ex)
		{
			//ex.printStackTrace();
		}
		
		if(installedTools.size() == 0)
		{
			installedTools.add(new ToolDescriptor("SWI-Prolog",
												  "",
												  ""));
		}
		
		init = true;
	}
	
	/**
	 * Adds the listener to the store.
	 * @param listener
	 */
	public static void addStoreListener(ToolStoreListener listener) {
		storeListener.add(listener);
	}
	
	/**
	 * Removes the listener from the store.
	 * @param listener
	 */
	public static void removeStoreListener(ToolStoreListener listener) {
		storeListener.remove(listener);
	}
	
	/**
	 * Forces the store to fire an update event.
	 */
	public static void fireStoreUpdateEvent() {
		for(ToolStoreListener l:storeListener)
			l.storeUpdate();
	}
}
