package edu.toronto.cs.goalmodel.diagram.providers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import edu.toronto.cs.goalmodel.diagram.edit.parts.ActorActorCompartmentEditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.AgentAgentCompartmentEditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.AspectAspectCompartmentEditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.ModelEditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.PositionPositionCompartmentEditPart;
import edu.toronto.cs.goalmodel.diagram.edit.parts.RoleRoleCompartmentEditPart;

import edu.toronto.cs.goalmodel.diagram.part.GoalmodelDiagramEditorPlugin;

/**
 * @generated
 */
public class GoalmodelModelingAssistantProvider extends
		ModelingAssistantProvider {

	/**
	 * @generated
	 */
	public List getTypesForPopupBar(IAdaptable host) {
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		if (editPart instanceof ActorActorCompartmentEditPart) {
			List types = new ArrayList();
			types.add(GoalmodelElementTypes.Goal_2001);
			types.add(GoalmodelElementTypes.Softgoal_2002);
			types.add(GoalmodelElementTypes.Resource_2003);
			types.add(GoalmodelElementTypes.Task_2004);
			return types;
		}
		if (editPart instanceof AgentAgentCompartmentEditPart) {
			List types = new ArrayList();
			types.add(GoalmodelElementTypes.Goal_2005);
			types.add(GoalmodelElementTypes.Softgoal_2006);
			types.add(GoalmodelElementTypes.Resource_2007);
			types.add(GoalmodelElementTypes.Task_2008);
			return types;
		}
		if (editPart instanceof PositionPositionCompartmentEditPart) {
			List types = new ArrayList();
			types.add(GoalmodelElementTypes.Goal_2009);
			types.add(GoalmodelElementTypes.Softgoal_2010);
			types.add(GoalmodelElementTypes.Resource_2011);
			types.add(GoalmodelElementTypes.Task_2012);
			return types;
		}
		if (editPart instanceof RoleRoleCompartmentEditPart) {
			List types = new ArrayList();
			types.add(GoalmodelElementTypes.Goal_2013);
			types.add(GoalmodelElementTypes.Softgoal_2014);
			types.add(GoalmodelElementTypes.Resource_2015);
			types.add(GoalmodelElementTypes.Task_2016);
			return types;
		}
		if (editPart instanceof AspectAspectCompartmentEditPart) {
			List types = new ArrayList();
			types.add(GoalmodelElementTypes.Goal_2017);
			types.add(GoalmodelElementTypes.Softgoal_2018);
			types.add(GoalmodelElementTypes.Resource_2019);
			types.add(GoalmodelElementTypes.Task_2020);
			return types;
		}
		if (editPart instanceof ModelEditPart) {
			List types = new ArrayList();
			types.add(GoalmodelElementTypes.Actor_1001);
			types.add(GoalmodelElementTypes.Agent_1002);
			types.add(GoalmodelElementTypes.Position_1003);
			types.add(GoalmodelElementTypes.Role_1004);
			types.add(GoalmodelElementTypes.Aspect_1005);
			types.add(GoalmodelElementTypes.Goal_1006);
			types.add(GoalmodelElementTypes.Softgoal_1007);
			types.add(GoalmodelElementTypes.Task_1008);
			types.add(GoalmodelElementTypes.Resource_1009);
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSource(IAdaptable source) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnTarget(IAdaptable target) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSourceAndTarget(IAdaptable source,
			IAdaptable target) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForSource(IAdaptable target,
			IElementType relationshipType) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForTarget(IAdaptable source,
			IElementType relationshipType) {
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
				GoalmodelDiagramEditorPlugin.getInstance()
						.getItemProvidersAdapterFactory());
		ElementListSelectionDialog dialog = new ElementListSelectionDialog(
				shell, labelProvider);
		dialog.setMessage("Available domain model elements:");
		dialog.setTitle("Select domain model element");
		dialog.setMultipleSelection(false);
		dialog.setElements(elements);
		EObject selected = null;
		if (dialog.open() == Window.OK) {
			selected = (EObject) dialog.getFirstResult();
		}
		return selected;
	}
}
