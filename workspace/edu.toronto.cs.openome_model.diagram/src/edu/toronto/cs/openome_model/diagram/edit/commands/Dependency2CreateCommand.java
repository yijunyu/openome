package edu.toronto.cs.openome_model.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.CreateElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;

/**
 * @generated
 */
public class Dependency2CreateCommand extends CreateElementCommand {

	/**
	 * @generated
	 */
	private final EObject source;

	/**
	 * @generated
	 */
	private final EObject target;

	/**
	 * @generated
	 */
	private edu.toronto.cs.openome_model.Model container;

	/**
	 * @generated
	 */
	public Dependency2CreateCommand(CreateRelationshipRequest request,
			EObject source, EObject target) {
		super(request);
		this.source = source;
		this.target = target;
		if (request.getContainmentFeature() == null) {
			setContainmentFeature(edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
					.getModel_Dependencies());
		}

		// Find container element for the new link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null; element = element
				.eContainer()) {
			if (element instanceof edu.toronto.cs.openome_model.Model) {
				container = (edu.toronto.cs.openome_model.Model) element;
				super.setElementToEdit(container);
				break;
			}
		}
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (source == null && target == null) {
			return false;
		}
		if (source != null
				&& !(source instanceof edu.toronto.cs.openome_model.Container)) {
			return false;
		}
		if (target != null
				&& !(target instanceof edu.toronto.cs.openome_model.Container)) {
			return false;
		}
		if (getSource() == null) {
			return true; // link creation is in progress; source is not defined yet
		}
		// target may be null here but it's possible to check constraint
		if (getContainer() == null) {
			return false;
		}
		return edu.toronto.cs.openome_model.diagram.edit.policies.Openome_modelBaseItemSemanticEditPolicy.LinkConstraints
				.canCreateDependency_3002(getContainer(), getSource(),
						getTarget());
	}

	/**
	 * @generated
	 */
	protected EObject doDefaultElementCreation() {
		// edu.toronto.cs.openome_model.Dependency newElement = (edu.toronto.cs.openome_model.Dependency) super.doDefaultElementCreation();
		edu.toronto.cs.openome_model.Dependency newElement = edu.toronto.cs.openome_model.openome_modelFactory.eINSTANCE
				.createDependency();
		getContainer().getDependencies().add(newElement);
		newElement.setActorDependencyTo(getSource());
		newElement.getActorDependencyFrom().add(getTarget());
		return newElement;
	}

	/**
	 * @generated
	 */
	protected EClass getEClassToEdit() {
		return edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
				.getModel();
	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException(
					"Invalid arguments in create link command"); //$NON-NLS-1$
		}
		return super.doExecuteWithResult(monitor, info);
	}

	/**
	 * @generated
	 */
	protected ConfigureRequest createConfigureRequest() {
		ConfigureRequest request = super.createConfigureRequest();
		request.setParameter(CreateRelationshipRequest.SOURCE, getSource());
		request.setParameter(CreateRelationshipRequest.TARGET, getTarget());
		return request;
	}

	/**
	 * @generated
	 */
	protected void setElementToEdit(EObject element) {
		throw new UnsupportedOperationException();
	}

	/**
	 * @generated
	 */
	protected edu.toronto.cs.openome_model.Container getSource() {
		return (edu.toronto.cs.openome_model.Container) source;
	}

	/**
	 * @generated
	 */
	protected edu.toronto.cs.openome_model.Container getTarget() {
		return (edu.toronto.cs.openome_model.Container) target;
	}

	/**
	 * @generated
	 */
	public edu.toronto.cs.openome_model.Model getContainer() {
		return container;
	}
}