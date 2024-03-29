package org.bflow.toolbox.addons.utils;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import org.bflow.toolbox.addons.AddonPlugin;
import org.bflow.toolbox.addons.core.model.Protocol;
import org.bflow.toolbox.attributes.AttributeFile;
import org.bflow.toolbox.attributes.AttributeViewPart;
import org.bflow.toolbox.attributes.IAttribute;
import org.bflow.toolbox.i18n.MessageProvider;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.ResourcesPlugin;

/**
 * <p>
 * This class provides a constitutive interface for user created protocols that
 * will run within the add-ons.
 * </p>
 * <p>
 * It provides some basic interfaces for components like DiagramExport or
 * ProblemsViewGeneration, so you can use these classes within your protocol.
 * <p/>
 * 
 * @author Arian Storch
 * @since 06/05/10
 * @version 14/06/11
 * 
 */
public class ImplementationProvider {

	/**
	 * Adds some markers to the Problems View of eclipse.
	 * 
	 * @param markerID
	 *            unique id of the marker type (must be constant)
	 * @param markers
	 *            must be a vector of type IMarker {@link IMarker}
	 */
	@SuppressWarnings("unchecked")
	public static void addMarker(String markerID, Vector markers) {
		AddonPlugin.getInstance()
				.addMarker(markerID, (Vector<IMarker>) markers);
	}

	/**
	 * Deletes all markers specified by the id.
	 * 
	 * @param markerID
	 *            unique id of the marker type (must be constant)
	 * @param chain
	 *            chain that uses this service
	 */
	public static void deleteMarker(String markerID, Protocol protocol) {
		IFile resource = null;

		if (protocol.getSource() instanceof File)
			resource = ResourcesPlugin.getWorkspace().getRoot()
					.findFilesForLocationURI(
							((File) protocol.getSource()).toURI())[0];
		else
			resource = (IFile) protocol.getSource();

		AddonPlugin.getInstance().deleteMarker(markerID, resource);
	}

	/**
	 * Returns all attributes linked with source file of the toolchain.
	 * 
	 * @param chain
	 *            chain that uses this service
	 * @return List
	 */
	public static List<IAttribute> getAttributes(Protocol protocol) {
		List<IAttribute> list = new ArrayList<IAttribute>();

		final AttributeFile attrFile = AttributeViewPart.getInstance()
				.getAttributeFile();
		attrFile.load();

		for (final String id : attrFile.getAllIDs())
			for (final String name : attrFile.get(id).keySet())
				list.add(new IAttribute() {

					@Override
					public String getElementID() {
						return id;
					}

					@Override
					public String getName() {
						return name;
					}

					@Override
					public String getValue() {
						return attrFile.get(id, name);
					}

					@Override
					public boolean isLoner() {
						return true;
					}

					
				});

		return list;
	}

	/**
	 * <p>
	 * Sets the attributes of the source file linked by the chain. This cannot
	 * be undone!
	 * </p>
	 * <p>
	 * <b>Note:</b><br/>
	 * If you want to delete one or more attributes than set the value parameter
	 * of the IAttribute instance to null.
	 * </p>
	 * 
	 * @param chain
	 *            chain that uses this service
	 * @param attributes
	 *            list of attributes
	 */
	public static void setAttributes(Protocol protocol,
			List<IAttribute> attributes) {
		AttributeViewPart viewPart = AttributeViewPart.getInstance();

		try {
			for (IAttribute attribute : attributes) {
				viewPart.setAttribute(attribute);
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	/**
	 * Returns the abbreviation of the active language.
	 * 
	 * @return abbreviation of the active language.
	 */
	public static String getLanguageAbbreviation() {
		return MessageProvider.getActiveLanguageAbbreviation();
	}

}
