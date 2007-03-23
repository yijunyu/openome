package edu.toronto.cs.goalmodel.diagram.edit.commands;

import edu.toronto.cs.goalmodel.GoalmodelPackage;
import edu.toronto.cs.goalmodel.Intention;
import edu.toronto.cs.goalmodel.MakeContribution;
import edu.toronto.cs.goalmodel.Model;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.gmf.runtime.emf.type.core.commands.CreateRelationshipCommand;

import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;

/**
 * @generated
 */
public class MakeContributionTypeLinkCreateCommand extends
		CreateRelationshipCommand {

	/**
	 * @generated
	 */
	private Model myContainer;

	/**
	 * @generated
	 */
	private Intention mySource;

	/**
	 * @generated
	 */
	private Intention myTarget;

	/**
	 * @generated
	 */
	public MakeContributionTypeLinkCreateCommand(CreateRelationshipRequest req,
			Model container, Intention source, Intention target) {
		super(req);
		super.setElementToEdit(container);
		myContainer = container;
		mySource = source;
		myTarget = target;
	}

	/**
	 * @generated
	 */
	public Model getContainer() {
		return myContainer;
	}

	/**
	 * @generated
	 */
	public EObject getSource() {
		return mySource;
	}

	/**
	 * @generated
	 */
	public EObject getTarget() {
		return myTarget;
	}

	/**
	 * @generated
	 */
	protected EClass getEClassToEdit() {
		return GoalmodelPackage.eINSTANCE.getModel();
	};

	/**
	 * @generated
	 */
	protected void setElementToEdit(EObject element) {
		throw new UnsupportedOperationException();
	}

	/**
	 * @generated
	 */
	protected EObject doDefaultElementCreation() {
		MakeContribution newElement = (MakeContribution) super
				.doDefaultElementCreation();
		if (newElement != null) {
			newElement.setTarget(myTarget);
			newElement.setSource(mySource);
		}
		return newElement;
	}

}
