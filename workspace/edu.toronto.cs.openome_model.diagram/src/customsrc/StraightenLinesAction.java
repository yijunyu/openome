package customsrc;

import org.eclipse.ui.IWorkbenchPage;

public class StraightenLinesAction extends SetLineConnectionAction {
	
	//private EvaluationLabel privateEvalLabel = EvaluationLabel.CONFLICT;
	private String privateID = "StraightenLinesAction";
	private String privateCommandLabelText = "Straighten Line";
	
	protected StraightenLinesAction(IWorkbenchPage workbenchPage) {
		super(workbenchPage);
		this.ID = privateID; //$NON-NLS-1$
		this.commandName = privateCommandLabelText;
	}
	
	
	
	public void init() {
		super.init();
		setId(ID);
		setText(privateCommandLabelText);
		
		refresh();
	}
	
	
}