package edu.toronto.cs.openome_model.diagram.providers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.modelingassistant.ModelingAssistantProvider;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;

/**
 * @generated
 */
public class Openome_modelModelingAssistantProvider extends
		ModelingAssistantProvider {

	/**
	 * @generated
	 */
	public List getTypesForPopupBar(IAdaptable host) {
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		if (editPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.ActorActorCompartmentEditPart) {
			List types = new ArrayList();
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_3001);
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_3002);
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_3003);
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_3004);
			return types;
		}
		if (editPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.AgentAgentCompartmentEditPart) {
			List types = new ArrayList();
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_3005);
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_3006);
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_3007);
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_3008);
			return types;
		}
		if (editPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.PositionPositionCompartmentEditPart) {
			List types = new ArrayList();
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_3009);
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_3010);
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_3011);
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_3012);
			return types;
		}
		if (editPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.RoleRoleCompartmentEditPart) {
			List types = new ArrayList();
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_3013);
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_3014);
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_3015);
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_3016);
			return types;
		}
		if (editPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.ModelEditPart) {
			List types = new ArrayList();
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Actor_2001);
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Agent_2002);
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Position_2003);
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Role_2004);
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_2005);
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_2006);
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_2007);
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_2008);
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSourceAndTarget(IAdaptable source,
			IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForSource(IAdaptable target,
			IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForTarget(IAdaptable source,
			IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForSource(IAdaptable target,
			IElementType relationshipType) {
		return selectExistingElement(target, getTypesForSource(target,
				relationshipType));
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForTarget(IAdaptable source,
			IElementType relationshipType) {
		return selectExistingElement(source, getTypesForTarget(source,
				relationshipType));
	}

	/**
	 * @generated
	 */
	protected EObject selectExistingElement(IAdaptable host, Collection types) {
		if (types.isEmpty()) {
			return null;
		}
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		if (editPart == null) {
			return null;
		}
		Diagram diagram = (Diagram) editPart.getRoot().getContents().getModel();
		Collection elements = new HashSet();
		for (Iterator it = diagram.getElement().eAllContents(); it.hasNext();) {
			EObject element = (EObject) it.next();
			if (isApplicableElement(element, types)) {
				elements.add(element);
			}
		}
		if (elements.isEmpty()) {
			return null;
		}
		return selectElement((EObject[]) elements.toArray(new EObject[elements
				.size()]));
	}

	/**
	 * @generated
	 */
	protected boolean isApplicableElement(EObject element, Collection types) {
		IElementType type = ElementTypeRegistry.getInstance().getElementType(
				element);
		return types.contains(type);
	}

	/**
	 * @generated
	 */
	protected EObject selectElement(EObject[] elements) {
		Shell shell = Display.getCurrent().getActiveShell();
		ILabelProvider labelProvider = new AdapterFactoryLabelProvider(
				edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramEditorPlugin
						.getInstance().getItemProvidersAdapterFactory());
		ElementListSelectionDialog dialog = new ElementListSelectionDialog(
				shell, labelProvider);
		dialog
				.setMessage(edu.toronto.cs.openome_model.diagram.part.Messages.Openome_modelModelingAssistantProviderMessage);
		dialog
				.setTitle(edu.toronto.cs.openome_model.diagram.part.Messages.Openome_modelModelingAssistantProviderTitle);
		dialog.setMultipleSelection(false);
		dialog.setElements(elements);
		EObject selected = null;
		if (dialog.open() == Window.OK) {
			selected = (EObject) dialog.getFirstResult();
		}
		return selected;
	}
}
