package edu.toronto.cs.openome.evaluation.gui;


import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

import org.eclipse.swt.widgets.Shell;

import org.eclipse.ui.dialogs.ListDialog;


public class EvaluationDialog extends ListDialog {
	
	public EvaluationDialog(Shell parentShell) {
		super(parentShell);
		// TODO Auto-generated constructor stub
	}
		    
    protected Control createDialogArea(Composite container) {
    	
    	Composite composite = (Composite) super.createDialogArea(container);
    	
    	
    	
    	return composite;
        
    }
    
   

}
