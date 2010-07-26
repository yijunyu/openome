package customsrc;

import java.util.Vector;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.gmf.runtime.common.ui.action.AbstractActionHandler;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbenchPage;
//import edu.toronto.cs.openome.evaluation.commands.HighlightIntentionsCommand;
import edu.toronto.cs.openome_model.Intention;

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
        IStructuredSelection selection = getStructuredSelection();
        Vector<Intention> LeafIntentions = new Vector<Intention>();
        if (selection == null || (selection.isEmpty())) {
            return;
        }
       
        Object[] intentions = selection.toArray();
        int selectionSize = intentions.length;
       
        for (int i = 0; i < selectionSize; i++) {
            LeafIntentions.add((Intention) intentions[i]);
        }
       
   //     HighlightIntentionsCommand highlight = new HighlightIntentionsCommand( editParts , LeafIntentions, "blue" );
    //    cs.execute(highlight);
    }
    
    public void refresh(){
            
    }


}