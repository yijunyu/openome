package customsrc;

import org.eclipse.gmf.runtime.common.ui.services.action.contributionitem.AbstractContributionItemProvider;
import org.eclipse.gmf.runtime.common.ui.util.IWorkbenchPartDescriptor;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.ui.IWorkbenchPage;


public class OpenOMEActionProvider extends AbstractContributionItemProvider{

	
	protected IAction createAction(String actionId,
            IWorkbenchPartDescriptor partDescriptor) {

        IWorkbenchPage workbenchPage = partDescriptor.getPartPage();
        
        if (actionId.equals("SetNoneLabelAction")) {
        	return new SetNoneLabelAction(workbenchPage);
        } else if (actionId.equals("SetSatisfiedLabelAction")) {
        	return new SetSatisfiedLabelAction(workbenchPage);
        } else if (actionId.equals("SetWeaklySatisfiedLabelAction")) {
        	return new SetWeaklySatisfiedLabelAction(workbenchPage);
        } else if (actionId.equals("SetConflictLabelAction")) {
        	return new SetConflictLabelAction(workbenchPage);
        } else if (actionId.equals("SetWeaklyDeniedLabelAction")) {
        	return new SetWeaklyDeniedLabelAction(workbenchPage);
        } else if (actionId.equals("SetDeniedLabelAction")) {
        	return new SetDeniedLabelAction(workbenchPage);
        } else if (actionId.equals("SetUnknownLabelAction")) {
        	return new SetUnknownLabelAction(workbenchPage);
        } else if (actionId.equals("StraightenLinesAction")) {
        	return new StraightenLinesAction(workbenchPage);
        }else {
        	return null;        	
        }
	}
}
