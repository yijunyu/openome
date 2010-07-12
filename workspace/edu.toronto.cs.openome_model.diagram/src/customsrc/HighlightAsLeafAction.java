package customsrc;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.gmf.runtime.common.ui.action.AbstractActionHandler;
import org.eclipse.ui.IWorkbenchPage;

public class HighlightAsLeafAction extends AbstractActionHandler {
    
    private String privateID = "HighlightAsLeafAction"; // this is how plugin.xml recognizes us
    private String privateCommandLabel = "As Leaf"; //this is what the user sees in their context menu
    
    /**
     * The constructor
     */
    protected HighlightAsLeafAction (IWorkbenchPage workbenchPage){
            super(workbenchPage);
            init();
    }
    
    public String getId(){
            return privateID;
    }
    
    /**
     * Initializes values for the plugins
     */
    public void init(){
            super.init();
            setId(privateID);
            setText(privateCommandLabel);
            
            refresh();
    }
    
    /**
     * This is the backbone of the context menu
     * This method contains the code that will actually be executed when user selects the context menu
     */
    protected void doRun(IProgressMonitor progressMonitor) {
            // for the purpose of this tutorial, we should keep it simple
            System.out.println("It's alive!");
    }
    
    public void refresh(){
            
    }


}