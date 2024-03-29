package org.bflow.toolbox.addons.components;

import java.io.File;
import java.io.IOException;
import java.util.Vector;

import org.apache.commons.io.FileUtils;
import org.bflow.toolbox.addons.core.exceptions.ComponentException;
import org.bflow.toolbox.addons.core.model.IComponent;
import org.bflow.toolbox.addons.interfaces.IFileAnalysisComponent;
import org.bflow.toolbox.addons.interfaces.IMitammMessage;
import org.bflow.toolbox.addons.utils.AnalyseUtil;
import org.eclipse.core.resources.IFile;

/**
 * <p>
 * Implements the {@link IFileAnalysisComponent} to analyse a file input and
 * generate problems view messages.
 * </p>
 * <p>
 * A vector containing strings is beeing expected as input source. Only the
 * first line beginning with "bflow*:" are beeing recognized and processed. This
 * must be the file path!
 * </p>
 * <p>
 * A vector of ProblemsViewMessages is going to created by this link.
 * </p>
 * 
 * @author Arian Storch
 * @since 01/05/10
 * @version 09/11/10
 */
public class FileAnalysisComponent implements IFileAnalysisComponent {
	private File srcFile;

	private boolean finished;

	private Vector<IMitammMessage> messageVector = new Vector<IMitammMessage>();

	private IFile markerResource;
	
	/**
	 * Default constructor.
	 */
	public FileAnalysisComponent() {
	}

	/**
	 * Constructor.
	 * 
	 * @param markerResource
	 *            resource that gets the markers
	 */
	public FileAnalysisComponent(IFile markerResource) {
		this.markerResource = markerResource;
	}

	@Override
	public void finish() {
		if (srcFile != null)
			srcFile.deleteOnExit();
	}

	@Override
	public String getDescription(String abbreviation) {
		if (abbreviation.equalsIgnoreCase("de")) {
			String str = "Analysiert eine Datei, die von einem externen Programm angelegt wurde und erfasst Meldungen,"
					+ "die in bflow* verarbeitet werden sollen.";

			return str;
		}

		String str = "Analysis a file that has been created by an external program and logs messages that shall be"
				+ " processed in bflow*.";

		return str;

	}

	@Override
	public boolean hasFinished() {
		return finished;
	}

	@Override
	public void init() {
		finished = false;

	}

	@Override
	public void invoke() throws ComponentException {
		try {
			for (Object o : FileUtils.readLines(srcFile).toArray()) {
				String str = (String) o;

				String parts[] = str.split("]");
				String contents[] = new String[parts.length];
				
				for(int i = 0; i < contents.length; i++)
					contents[i] = parts[i].substring(1).replace("#FS#", "");
					
				String type = contents[0];
				
				if(type.equalsIgnoreCase("attribute"))
					messageVector.add(AnalyseUtil.analyseAttribute(contents));
				
				if(type.equalsIgnoreCase("message"))
					messageVector.add(AnalyseUtil.analyseMessage(contents, markerResource));
		
			}
		} catch (IOException ex) {
			throw new ComponentException(ex);
		}

		finished = true;
	}

	@Override
	public void transformInput(Object inputSource) throws ComponentException {
		if(inputSource == null)
			throw new ComponentException("Quelle ist null");
		
		if (!(inputSource instanceof StringBuffer))
			throw new ComponentException("input source has not expected format");

		String line = ((StringBuffer)inputSource).toString();

		int index = line.indexOf("addon:");
		
		if(index == -1)
			throw new ComponentException("no filename for input source set");
		
		String filename = line.substring(index+6);
		
		filename = filename.replace("#FS#", "");
		filename = filename.replace("\r", "").replace("\n", "");

		srcFile = new File(filename);
		
		if(srcFile == null)
			throw new ComponentException("file is null");

		if (!srcFile.exists())
			throw new ComponentException("input source does not exist: "
					+ srcFile);
	}

	@Override
	public Object transformOutput() throws ComponentException {
		return messageVector;
	}

	@Override
	public boolean isValid() {
		return true;
	}

	@Override
	public String getDisplayName() {
		return "File analysis";
	}

	@Override
	public boolean canLinkWith(IComponent component) {
		if(component instanceof ToolRunComponent)
			return true;
		
		if(component instanceof PrologRunComponent)
			return true;
		
		return false;
	}

	@Override
	public boolean hasParams() {
		return false;
	}

	@Override
	public void setParams(String param) {		
	}

}
