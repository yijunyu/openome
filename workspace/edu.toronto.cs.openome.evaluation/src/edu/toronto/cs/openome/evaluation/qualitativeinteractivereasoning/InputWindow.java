package edu.toronto.cs.openome.evaluation.qualitativeinteractivereasoning;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.ui.dialogs.PopupDialog;
import org.eclipse.gmf.runtime.common.ui.internal.l10n.CommonUIMessages;
import org.eclipse.gmf.runtime.diagram.ui.commands.PopupMenuCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.CreateOrSelectElementCommand.LabelProvider;
import org.eclipse.gmf.runtime.diagram.ui.internal.commands.ElementTypeLabelProvider;
import org.eclipse.gmf.runtime.diagram.ui.internal.l10n.InternalDiagramUIMessages;
import org.eclipse.gmf.runtime.diagram.ui.menus.PopupMenu;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.osgi.util.NLS;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.SelectionDialog;

import edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes;

public class InputWindow extends PopupMenuCommand {
	PopupDialog dialog;

	public InputWindow(String label, Shell parentShell) {
		super(label, parentShell);
		List l = new ArrayList();
		
		l.add(Openome_modelElementTypes.Goal_1005);
		l.add(Openome_modelElementTypes.Dependency_3001);
		l.add(Openome_modelElementTypes.BreakContribution_3007);
		
		dialog = new PopupDialog(parentShell, l, new MyLabelProvider());
		
		dialog.setTitle("Resolve Softgoal");
		dialog.setMessage("My message");
		
		//SelectionDialog d = new InputSelectionDialog(parentShell);
		
		
		
		setPopupDialog(dialog);
	}

	public InputWindow(String label, Shell parentShell, PopupMenu popupMenu) {
		super(label, parentShell, popupMenu);
		// TODO Auto-generated constructor stub
	}
	
	protected CommandResult doExecuteWithResult(IProgressMonitor progressMonitor, IAdaptable info) 
	 throws ExecutionException {
		CommandResult cmdResult = super.doExecuteWithResult(progressMonitor, info);
		
//		if (!cmdResult.getStatus().isOK()) {
//			return cmdResult;
//		}
		
		Object result = cmdResult.getReturnValue();
		if (result != null) {
			System.out.println("Result: " + result.toString());
		}
		
		for (Object ob: dialog.getResult()) {
			System.out.println("GetResult: " + ob.toString());
		}
			
		
		return cmdResult;
			
	}
	
	/**
	 * The default label provider for the the menu items used in this command.
	 * Adds the "Create new " text to the objects of type
	 * <code>IElementType</code>.
	 */
	static public class MyLabelProvider
		extends ElementTypeLabelProvider {

		/**
		 * @see org.eclipse.jface.viewers.ILabelProvider#getText(java.lang.Object)
		 */
		public String getText(Object object) {
			String text = super.getText(object);
//			if (object instanceof IElementType) {
//				return NLS
//					.bind(
//						InternalDiagramUIMessages.CreateOrSelectElementCommand_PopupMenu_CreateMenuItem_Text,
//						text);
//			}
			return text;
		}
	}
	
}

