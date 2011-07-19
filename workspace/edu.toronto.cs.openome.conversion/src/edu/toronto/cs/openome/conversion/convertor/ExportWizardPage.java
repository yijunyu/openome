package edu.toronto.cs.openome.conversion.convertor;


import org.eclipse.core.resources.IFile;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

/**
 * Mostly copied from org.bflow.toolbox.export.pages.ExportWizardPage
 * @author showzeb
 *
 */
public class ExportWizardPage extends WizardPage {

	private Text textFieldTargetFile;
	private Text textFieldSourceFile;
	private Text txtDescription;
	
	private IStructuredSelection selectedFiles;
	
	private Combo cbExportTypes;
	
	/**
	 * constructor
	 * @param selectedFile selected file into the workbench
	 */
	public ExportWizardPage(IStructuredSelection selectedFiles)
	{
		super("Q7 Export Wizard");

		this.setTitle("Q7 export assistent");
		this.setDescription("Exports the selected diagram as .q7 format");
		this.setPageComplete(true);
		
		this.selectedFiles = selectedFiles;
	}

	@Override
	public void createControl(Composite parent) {
		final Composite composite = new Composite(parent, SWT.NONE);
		
		composite.setLayout(new GridLayout(2, false));
		composite.setLayoutData(new GridData(GridData.VERTICAL_ALIGN_FILL
				| GridData.HORIZONTAL_ALIGN_FILL));
		
		Label lblSelDiagram = new Label(composite, SWT.NONE);
		lblSelDiagram.setText("Selected diagram:");
		
		textFieldSourceFile = new Text(composite, SWT.BORDER);
		
		String selectionString = "";
		
		for(Object f:selectedFiles.toArray())
			selectionString += ((IFile)f).getName()+" ";
		
		textFieldSourceFile.setText(selectionString);
		textFieldSourceFile.setEditable(false);
		
		GridData txtSelFileGridData = new GridData(GridData.HORIZONTAL_ALIGN_FILL
																| GridData.GRAB_HORIZONTAL);
		txtSelFileGridData.widthHint = 150;
		textFieldSourceFile.setLayoutData(txtSelFileGridData);
		
		Label lblSelExportType = new Label(composite, SWT.NONE);
		
		lblSelExportType.setText("Export format:");
		
		cbExportTypes = new Combo(composite, SWT.BORDER | SWT.READ_ONLY);
		prepareComboBox();
		
		Label lblDescription = new Label(composite, SWT.NONE);
		lblDescription.setText("Description :");
		
		txtDescription = new Text(composite, SWT.NONE | SWT.READ_ONLY);
		txtDescription.setText("");

		GridData txtDescriptionGridData = new GridData(GridData.HORIZONTAL_ALIGN_FILL
				| GridData.GRAB_HORIZONTAL);
		txtDescriptionGridData.widthHint = 200;
		txtDescriptionGridData.heightHint = 50;

		txtDescription.setLayoutData(txtDescriptionGridData);
		
		Label lblTargetFile = new Label(composite, SWT.NONE);
		lblTargetFile.setText("Target Path: ");
		
		Composite fileSelection = new Composite(composite, SWT.NONE);
		
		GridLayout fileSelectionLayout = new GridLayout(2, false);
		fileSelectionLayout.marginLeft = 0; 
		fileSelectionLayout.horizontalSpacing = 0;
		
		fileSelection.setLayout(fileSelectionLayout);
		fileSelection.setLayoutData(new GridData(GridData.VERTICAL_ALIGN_FILL
														| GridData.HORIZONTAL_ALIGN_FILL));
		
		textFieldTargetFile = new Text(fileSelection, SWT.BORDER);
		textFieldTargetFile.setText("");
		textFieldTargetFile.setEnabled(false);
		
		GridData txtTargetFileGridData = new GridData(GridData.HORIZONTAL_ALIGN_FILL
																| GridData.GRAB_HORIZONTAL);
		
		txtTargetFileGridData.widthHint = 200;
		textFieldTargetFile.setLayoutData(txtTargetFileGridData);
		
		Button btnBrowse = new Button(fileSelection, SWT.NONE);
		btnBrowse.setText("Select....");
		btnBrowse.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void widgetSelected(SelectionEvent e) {
				DirectoryDialog dialog = new DirectoryDialog(composite.getShell());
				dialog.setFilterPath(null);
				dialog.setMessage("Choose your target path:");
				
				textFieldTargetFile.setText(dialog.open());
			}
			
		});
		
		this.setControl(composite);
		
	}
	
	private void prepareComboBox() {
		cbExportTypes.add("Q7 Format (*.q7)");
		cbExportTypes.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void widgetSelected(SelectionEvent e) {
				int selIndex = cbExportTypes.getSelectionIndex();
				
				if (selIndex == -1) 
					return;
				
				txtDescription.setText("Exports an openOME diagram as Q7 Diagram");
				
			}
			
			
		});
		cbExportTypes.setVisibleItemCount(10);
	}
	/**
	 * returns the text field that contains the path for the source file
	 * @return text field containing path to the source file
	 */
	public Text getTextFieldSourceFile() {
		return textFieldSourceFile;
	}
	
	/**
	 * returns the text field that contains the path for the target file
	 * @return text field containing path to the target file
	 */
	public Text getTextFieldTargetFile() {
		return textFieldTargetFile;
	}
}
