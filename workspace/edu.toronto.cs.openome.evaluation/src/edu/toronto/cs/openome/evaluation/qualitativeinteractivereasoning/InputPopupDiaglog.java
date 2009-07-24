package edu.toronto.cs.openome.evaluation.qualitativeinteractivereasoning;

import java.util.List;

import org.eclipse.gmf.runtime.common.ui.dialogs.PopupDialog;
import org.eclipse.gmf.runtime.common.ui.internal.l10n.CommonUIMessages;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.swt.widgets.Shell;

public class InputPopupDiaglog extends PopupDialog {

	public InputPopupDiaglog(Shell parent, List contents,
			ILabelProvider labelProvider) {
		super(parent, contents, labelProvider);
		setTitle("Resolve Softgoal");
		setMessage("My message");
	}

}
