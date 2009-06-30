package edu.toronto.cs.openome.evaluation.handlers;


import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.commands.IHandlerListener;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.emf.edit.domain.EditingDomain;

import org.eclipse.ui.PlatformUI;

import edu.toronto.cs.openome_model.EvaluationLabel;
import edu.toronto.cs.openome_model.Intention;
import edu.toronto.cs.openome_model.impl.ModelImpl;
import edu.toronto.cs.openome_model.presentation.openome_modelEditor;

import org.eclipse.emf.ecore.resource.ResourceSet;



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
		
		openome_modelEditor gme = (openome_modelEditor) PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
		//IEditor gme = (IEditor) PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
		
		EditingDomain editingDomain = gme.getEditingDomain();
		
		ResourceSet resource;
		
		//try {
			// Load the resource through the editing domain.
			//
			//resourceURI = EditUIUtil.getURI(gme.getEditorInput());
			//resource = editingDomain.getResourceSet().getResource(resourceURI, true);
		resource = editingDomain.getResourceSet();
		//}
		//catch (Exception e) {
		//	resource = editingDomain.getResourceSet().getResource(resourceURI, false);
		//}
		
		XMIResourceImpl xmires = null;
		for(Resource tmp: resource.getResources()) {
			if (tmp instanceof XMIResourceImpl) {
				xmires = (XMIResourceImpl) tmp;
			}
		}
		ModelImpl model = null;
		for(EObject tmp2: xmires.getContents()){ 
			if (tmp2 instanceof ModelImpl) 
				model = (ModelImpl) tmp2; 
		}
		
		EList ints = model.getIntentions();
		for (Object o : ints) {
			Intention i = (Intention) o;
			i.setQualitativeReasoningSatisfiedLabel(EvaluationLabel.SATISFIED);
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
