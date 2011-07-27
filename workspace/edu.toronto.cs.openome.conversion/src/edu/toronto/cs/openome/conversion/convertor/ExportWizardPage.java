package edu.toronto.cs.openome.conversion.convertor;


import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.dialogs.DialogTray;
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
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.ContainerSelectionDialog;
import org.eclipse.jface.dialogs.TrayDialog;

/**
 * Mostly copied from org.bflow.toolbox.export.pages.ExportWizardPage
 * @author showzeb
 *
 */
@SuppressWarnings("restriction")
public class ExportWizardPage extends WizardPage {

	private Text textFieldTargetFile;
	private Text textFieldSourceFile;
	private Text txtDescription;
	private IStructuredSelection selectedFiles;
	
	
	private Combo cbExportTypes;
	
	private Button inside;
	private Button outside;
	private Text targetFile;
	private String projectName = "";
	
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
		
		//Making a button for outside...
		outside = new Button(composite, SWT.RADIO);
		outside.setText("Export outside the workspace");
		//gd = new GridData(GridData.HORIZONTAL_ALIGN_FILL
				//| GridData.GRAB_HORIZONTAL);
		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		gd.horizontalSpan = 2;
		outside.setLayoutData(gd);
		outside.setSelection(true);
		
		//Making a button for inside....
		inside = new Button(composite, SWT.RADIO);
		inside.setText("Export inside the workspace");
		//GridData gd = new GridData(GridData.HORIZONTAL_ALIGN_FILL
				//| GridData.GRAB_HORIZONTAL);
		gd = new GridData(GridData.FILL_HORIZONTAL);
		gd.horizontalSpan = 1;
		inside.setLayoutData(gd);
		
		//Having a text field
		Composite targetFileSelection = new Composite(composite, SWT.NONE);
		GridLayout targetSelectionLayout = new GridLayout(2, false);
		targetSelectionLayout.marginLeft = 0;
		targetSelectionLayout.horizontalSpacing = 0;
		targetFileSelection.setLayout(targetSelectionLayout);
		targetFileSelection.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		Label name = new Label(targetFileSelection, SWT.NONE);
		name.setText("Name:");
		targetFile = new Text(targetFileSelection, SWT.BORDER);
		GridData targetFileGridData = new GridData(GridData.FILL_HORIZONTAL);
		targetFileGridData.widthHint = 100;
		targetFile.setLayoutData(targetFileGridData);
		targetFile.setEnabled(false);
		
		
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
				handleSelect(composite);
			}
			
		});
		
		//Adding a listener to the inside/outside buttons.
		outside.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void widgetSelected(SelectionEvent e) {
				targetFile.setEnabled(false);
				textFieldTargetFile.setText("");
				
			}
			
		});
		inside.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void widgetSelected(SelectionEvent e) {
				targetFile.setEnabled(true);
				textFieldTargetFile.setText("");
			}
			
		});
		this.setControl(composite);
		
	}
	
	private void handleSelect(Composite composite) {
		if (outside.getSelection()) {
			FileDialog dialog = new FileDialog(composite.getShell());
			dialog.setFilterPath(null);
			dialog.setText("Choose your target path:");
			textFieldTargetFile.setText(dialog.open());
		} else {
			
			ContainerSelectionDialog dialog = new ContainerSelectionDialog(
					getShell(), ResourcesPlugin.getWorkspace().getRoot(), false,
					"Select new file container");
//			Object[] a = {((IFile)selectedFiles.getFirstElement()).getParent()};
//			dialog.setInitialSelections(a);
			if (dialog.open() == ContainerSelectionDialog.OK) {
				Object[] result = dialog.getResult();
				if (result.length == 1) {
					//System.out.println(((Path) result[0]).toOSString());
					projectName = ((Path) result[0]).toString();
					textFieldTargetFile.setText(((Path) result[0]).toString() + "/" +  targetFile.getText() + ".q7");
				}
			}
		}
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
		//Initialize ood diagram file
		return textFieldTargetFile;
	}
	
	/**
	 * Return the project name.
	 * @return
	 */
	public String projectName() {
		return projectName;
	}
	
	/**
	 * Return the target file name text value.
	 * @return
	 */
	public Text targetFileName() {
		return targetFile;
	}
	
	/**
	 * Return true if the inside option radio button was selected.
	 * @return true if the inside option radio button was selected.
	 */
	public boolean insideSelected() {
		return inside.getSelection();
	}
}
