package edu.toronto.cs.openome.evaluation.handlers;


import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.commands.IHandlerListener;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.ui.util.EditUIUtil;
import org.eclipse.emf.common.util.URI;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.emf.ecore.resource.ResourceSet;

import edu.toronto.cs.openome.evaluation.commands.SetQualitativeEvaluationLabelCommand;
import edu.toronto.cs.openome_model.EvaluationLabel;
import edu.toronto.cs.openome_model.Intention;
//import org.eclipse.gmf.runtime.diagram.ui.resources.editor.parts.DiagramDocumentEditor;
//import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditorWithFlyOutPalette;
import edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramEditor;
import edu.toronto.cs.openome_model.impl.ModelImpl;
//import edu.toronto.cs.openome_model.presentation.openome_modelEditor;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramCommandStack;



public class InteractiveQualReasonerHandler implements IHandler {

	@Override
	public void addHandlerListener(IHandlerListener handlerListener) {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		
		System.out.println("Yo");
		Openome_modelDiagramEditor gme;
		//DiagramDocumentEditor gme;
		
		try {
			IWorkbenchWindow iww = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
			
			System.out.println("Got Workbench Window");
			IWorkbenchPage iwp = iww.getActivePage(); //assume correct page is showing ... dubious
			System.out.println(iwp.getLabel());
			IEditorPart iep= iwp.getActiveEditor(); //
	
			System.out.println(iep.getTitle());
		
			gme = (Openome_modelDiagramEditor) iep; //
			
			//gme = (openome_modelEditor) PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
		}
		catch (Exception e) {
			System.out.println("Exception getting modelEditor");
			return null;
		}
		//IEditor gme = (IEditor) PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
		
		EditingDomain editingDomain = gme.getEditingDomain();
		
		CommandStack dcs = editingDomain.getCommandStack();
		
		Resource resource;
		
		URI resourceURI;
		
//		try {
//		// Load the resource through the editing domain.
//			
//			resourceURI = EditUIUtil.getURI(gme.getEditorInput());
//			resource = editingDomain.getResourceSet().getResource(resourceURI, true);
//
//		}
//		catch (Exception e) {
//			resource = editingDomain.getResourceSet().getResource(resourceURI, false);
//		}
		
		ResourceSet resourceSet = editingDomain.getResourceSet();
		
		XMIResourceImpl xmires = null;
		
		System.out.println(resourceSet.toString());
				
		for(Resource tmp: resourceSet.getResources()) {
			if (tmp instanceof XMIResourceImpl) {
				xmires = (XMIResourceImpl) tmp;
				System.out.println(tmp.toString());
				System.out.println("XMIResourceImpl: " + xmires.getPublicId());
			}
		}
		ModelImpl model = null;
		
			
		System.out.println(xmires.toString());
		
		for(EObject tmp2: xmires.getContents()){ 
			if (tmp2 instanceof ModelImpl) 
				model = (ModelImpl) tmp2; 
				System.out.println("ModelImpl: " + model.getName());
				System.out.println(model.toString());
		}
		
		
		for (Object o : model.getIntentions()) {
			Intention i = (Intention) o;
			
			System.out.println(i.toString());
			System.out.println(i.getName());
			
			//i.setQualitativeReasoningSatisfiedLabel(EvaluationLabel.SATISFIED);
			
			
			SetQualitativeEvaluationLabelCommand setLabel = new SetQualitativeEvaluationLabelCommand(i);
			
			System.out.println(setLabel.getLabel());
			
			dcs.execute(setLabel);
		
		
		}
		
		//r = new Reasoning(model, EvalType.InteractiveQualReasoning)
		return null;
				
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isHandled() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void removeHandlerListener(IHandlerListener handlerListener) {
		// TODO Auto-generated method stub

	}

}
