package customsrc;

import openome_model.figures.DependencyLineConnection;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.gmf.runtime.common.ui.action.AbstractActionHandler;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.IWorkbenchPage;

import edu.toronto.cs.openome_model.diagram.edit.parts.AndContributionEditPart;
import edu.toronto.cs.openome_model.diagram.edit.parts.AndDecompositionEditPart;
import edu.toronto.cs.openome_model.diagram.edit.parts.BreakContributionEditPart;
import edu.toronto.cs.openome_model.diagram.edit.parts.CoversAssociationEditPart;
import edu.toronto.cs.openome_model.diagram.edit.parts.DependencyEditPart;
import edu.toronto.cs.openome_model.diagram.edit.parts.HelpContributionEditPart;
import edu.toronto.cs.openome_model.diagram.edit.parts.HurtContributionEditPart;
import edu.toronto.cs.openome_model.diagram.edit.parts.INSAssociationEditPart;
import edu.toronto.cs.openome_model.diagram.edit.parts.IsAAssociationEditPart;
import edu.toronto.cs.openome_model.diagram.edit.parts.IsPartOfAssociationEditPart;
import edu.toronto.cs.openome_model.diagram.edit.parts.MakeContributionEditPart;
import edu.toronto.cs.openome_model.diagram.edit.parts.OccupiesAssociationEditPart;
import edu.toronto.cs.openome_model.diagram.edit.parts.OrContributionEditPart;
import edu.toronto.cs.openome_model.diagram.edit.parts.OrDecompositionEditPart;
import edu.toronto.cs.openome_model.diagram.edit.parts.PlaysAssociationEditPart;
import edu.toronto.cs.openome_model.diagram.edit.parts.SomeMinusContributionEditPart;
import edu.toronto.cs.openome_model.diagram.edit.parts.SomePlusContributionEditPart;
import edu.toronto.cs.openome_model.diagram.edit.parts.UnknownContributionEditPart;
import edu.toronto.cs.openome_model.diagram.edit.parts.AndContributionEditPart.AndContributionFigure;
import edu.toronto.cs.openome_model.diagram.edit.parts.AndDecompositionEditPart.AndDecompositionFigure;
import edu.toronto.cs.openome_model.diagram.edit.parts.BreakContributionEditPart.BreakContributionFigure;
import edu.toronto.cs.openome_model.diagram.edit.parts.CoversAssociationEditPart.CoversAssociationFigure;
import edu.toronto.cs.openome_model.diagram.edit.parts.HelpContributionEditPart.HelpContributionFigure;
import edu.toronto.cs.openome_model.diagram.edit.parts.HurtContributionEditPart.HurtContributionFigure;
import edu.toronto.cs.openome_model.diagram.edit.parts.INSAssociationEditPart.INSAssociationFigure;
import edu.toronto.cs.openome_model.diagram.edit.parts.IsAAssociationEditPart.IsAAssociationFigure;
import edu.toronto.cs.openome_model.diagram.edit.parts.IsPartOfAssociationEditPart.IsPartOfAssociationFigure;
import edu.toronto.cs.openome_model.diagram.edit.parts.MakeContributionEditPart.MakeContributionFigure;
import edu.toronto.cs.openome_model.diagram.edit.parts.OccupiesAssociationEditPart.OccupiesAssociationFigure;
import edu.toronto.cs.openome_model.diagram.edit.parts.OrContributionEditPart.OrContributionFigure;
import edu.toronto.cs.openome_model.diagram.edit.parts.OrDecompositionEditPart.OrDecompositionFigure;
import edu.toronto.cs.openome_model.diagram.edit.parts.PlaysAssociationEditPart.PlaysAssociationFigure;
import edu.toronto.cs.openome_model.diagram.edit.parts.SomeMinusContributionEditPart.SomeMinusContributionFigure;
import edu.toronto.cs.openome_model.diagram.edit.parts.SomePlusContributionEditPart.SomePlusContributionFigure;
import edu.toronto.cs.openome_model.diagram.edit.parts.UnknownContributionEditPart.UnknownContributionFigure;
import edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramEditorPlugin;

public class SetLineTypeAction extends AbstractActionHandler {
	
	protected String ID = ""; //$NON-NLS-1$
	protected String commandName = "";
	protected String changeTo = ""; // what we want to change into
	private String imageFile = "contribution.png";

	protected SetLineTypeAction(IWorkbenchPage workbenchPage) {
		super(workbenchPage);
		// TODO Auto-generated constructor stub
		// default line icon
		setImageDescriptor(Openome_modelDiagramEditorPlugin.getBundledImageDescriptor("../openome_model/icons/" + imageFile));
	}
	
	public String getID() {
		return ID;
	}
	
	public void setChangeTo(String change){
		changeTo = change;
	}

	
	@Override
	protected void doRun(IProgressMonitor progressMonitor) {
		IStructuredSelection selection = getStructuredSelection();
		
		if (selection == null || (selection.isEmpty())) {
			return;
		}
		
		Object[] connections = selection.toArray();
		int selectionSize = connections.length;
		
		for (int i = 0; i < selectionSize; i++) {
			Object connection = connections[i];
			// determine what type of connection it is, then cast it appropriately 
			
			// DEPENDENCY and DECOMPOSITIONS
			
			if (connection instanceof DependencyEditPart) {
				System.out.println("Change from Dependency to " + changeTo);
			} 
			else if (connection instanceof AndDecompositionEditPart) {
				System.out.println("Change from AndDecomposition to " + changeTo);
			}
			else if (connection instanceof OrDecompositionEditPart) {
				System.out.println("Change from OrDecomposition to " + changeTo);
			}
			
			// CONTRIBUTIONS
			else if (connection instanceof AndContributionEditPart) {
				System.out.println("Change from AndContribution to " + changeTo);
			}
			else if (connection instanceof BreakContributionEditPart) {				
				System.out.println("Change from BreakContribution to " + changeTo);
			}
			else if (connection instanceof HelpContributionEditPart) {				
				System.out.println("Change from HelpContribution to " + changeTo);
			}
			else if (connection instanceof HurtContributionEditPart) {				
				System.out.println("Change from HurtContribution to " + changeTo);
			}
			else if (connection instanceof MakeContributionEditPart) {				
				System.out.println("Change from MakeContribution to " + changeTo);
			}
			else if (connection instanceof OrContributionEditPart) {				
				System.out.println("Change from OrContribution to " + changeTo);
			}
			else if (connection instanceof SomePlusContributionEditPart) {				
				System.out.println("Change from SomePlusContribution to " + changeTo);
			}
			else if (connection instanceof SomeMinusContributionEditPart) {				
				System.out.println("Change from MinusContribution to " + changeTo);
			}
			else if (connection instanceof UnknownContributionEditPart) {				
				System.out.println("Change from UnknownContribution to " + changeTo);
			}
			
			// ASSOCIATIONS
			else if (connection instanceof CoversAssociationEditPart) {				
				System.out.println("Change from CoversAssociation to " + changeTo);
			}
			else if (connection instanceof INSAssociationEditPart) {				
				System.out.println("Change from INSAssociation to " + changeTo);
			}
			else if (connection instanceof IsAAssociationEditPart) {				
				System.out.println("Change from IsAAssociation to " + changeTo);
			}
			else if (connection instanceof IsPartOfAssociationEditPart) {				
				System.out.println("Change from IsPartOfAssociation to " + changeTo);
			}
			else if (connection instanceof OccupiesAssociationEditPart) {				
				System.out.println("Change from OccupiesAssociation to " + changeTo);
			}
			else if (connection instanceof PlaysAssociationEditPart) {				
				System.out.println("Change from PlaysAssociation to " + changeTo);
			}
		}
	}
	
	public void refresh() {
		// TODO Auto-generated method stub
		
	}

}
