package customsrc;

import openome_model.figures.DependencyLineConnection;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.gmf.runtime.common.ui.action.AbstractActionHandler;
import org.eclipse.jface.viewers.IStructuredSelection;
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

public class SetLineConnectionAction extends AbstractActionHandler {
	
	protected String ID = ""; //$NON-NLS-1$
	protected String commandName = "";

	protected SetLineConnectionAction(IWorkbenchPage workbenchPage) {
		super(workbenchPage);
		// TODO Auto-generated constructor stub
	}
	
	public String getID() {
		return ID;
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

			// DEPENDENCY
			
			if (connection instanceof DependencyEditPart) {
				((DependencyLineConnection)((DependencyEditPart) connection).getFigure()).straightenLine();
			} 
			
			// DECOMPOSITIONS
			else if (connection instanceof AndDecompositionEditPart) {				
				((AndDecompositionFigure)((AndDecompositionEditPart) connection).getFigure()).straightenLine();
			}
			else if (connection instanceof OrDecompositionEditPart) {				
				((OrDecompositionFigure)((OrDecompositionEditPart) connection).getFigure()).straightenLine();
			}
			
			// CONTRIBUTIONS
			else if (connection instanceof AndContributionEditPart) {				
				((AndContributionFigure)((AndContributionEditPart) connection).getFigure()).straightenLine();
			}
			else if (connection instanceof BreakContributionEditPart) {				
				((BreakContributionFigure)((BreakContributionEditPart) connection).getFigure()).straightenLine();
			}
			else if (connection instanceof HelpContributionEditPart) {				
				((HelpContributionFigure)((HelpContributionEditPart) connection).getFigure()).straightenLine();
			}
			else if (connection instanceof HurtContributionEditPart) {				
				((HurtContributionFigure)((HurtContributionEditPart) connection).getFigure()).straightenLine();
			}
			else if (connection instanceof MakeContributionEditPart) {				
				((MakeContributionFigure)((MakeContributionEditPart) connection).getFigure()).straightenLine();
			}
			else if (connection instanceof OrContributionEditPart) {				
				((OrContributionFigure)((OrContributionEditPart) connection).getFigure()).straightenLine();
			}
			else if (connection instanceof SomePlusContributionEditPart) {				
				((SomePlusContributionFigure)((SomePlusContributionEditPart) connection).getFigure()).straightenLine();
			}
			else if (connection instanceof SomeMinusContributionEditPart) {				
				((SomeMinusContributionFigure)((SomeMinusContributionEditPart) connection).getFigure()).straightenLine();
			}
			else if (connection instanceof UnknownContributionEditPart) {				
				((UnknownContributionFigure)((UnknownContributionEditPart) connection).getFigure()).straightenLine();
			}
			
			// ASSOCIATIONS
			else if (connection instanceof CoversAssociationEditPart) {				
				((CoversAssociationFigure)((CoversAssociationEditPart) connection).getFigure()).straightenLine();
			}
			else if (connection instanceof INSAssociationEditPart) {				
				((INSAssociationFigure)((INSAssociationEditPart) connection).getFigure()).straightenLine();
			}
			else if (connection instanceof IsAAssociationEditPart) {				
				((IsAAssociationFigure)((IsAAssociationEditPart) connection).getFigure()).straightenLine();
			}
			else if (connection instanceof IsPartOfAssociationEditPart) {				
				((IsPartOfAssociationFigure)((IsPartOfAssociationEditPart) connection).getFigure()).straightenLine();
			}
			else if (connection instanceof OccupiesAssociationEditPart) {				
				((OccupiesAssociationFigure)((OccupiesAssociationEditPart) connection).getFigure()).straightenLine();
			}
			else if (connection instanceof PlaysAssociationEditPart) {				
				((PlaysAssociationFigure)((PlaysAssociationEditPart) connection).getFigure()).straightenLine();
			}
		}
	}
	
	public void refresh() {
		// TODO Auto-generated method stub
		
	}

}
