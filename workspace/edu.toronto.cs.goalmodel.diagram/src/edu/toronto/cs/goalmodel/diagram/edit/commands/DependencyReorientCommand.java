package edu.toronto.cs.goalmodel.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import edu.toronto.cs.goalmodel.Dependency;
import edu.toronto.cs.goalmodel.Intention;
import edu.toronto.cs.goalmodel.Model;
import edu.toronto.cs.goalmodel.diagram.edit.policies.GoalmodelBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class DependencyReorientCommand extends EditElementCommand {

	/**
	 * @generated
	 */
	private final int reorientDirection;

	/**
	 * @generated
	 */
	private final EObject oldEnd;

	/**
	 * @generated
	 */
	private final EObject newEnd;

	/**
	 * @generated
	 */
	public DependencyReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (!(getElementToEdit() instanceof Dependency)) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof Intention && newEnd instanceof Intention)) {
			return false;
		}
		Intention target = getLink().getDependencyFrom();
		if (!(getLink().eContainer() instanceof Model)) {
			return false;
		}
		Model container = (Model) getLink().eContainer();
		return GoalmodelBaseItemSemanticEditPolicy.LinkConstraints
				.canExistDependency_3001(container, getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof Intention && newEnd instanceof Intention)) {
			return false;
		}
		Intention source = getLink().getDependencyTo();
		if (!(getLink().eContainer() instanceof Model)) {
			return false;
		}
		Model container = (Model) getLink().eContainer();
		return GoalmodelBaseItemSemanticEditPolicy.LinkConstraints
				.canExistDependency_3001(container, source, getNewTarget());
	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException(
					"Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientSource() throws ExecutionException {
		getLink().setDependencyTo(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setDependencyFrom(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected Dependency getLink() {
		return (Dependency) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected Intention getOldSource() {
		return (Intention) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Intention getNewSource() {
		return (Intention) newEnd;
	}

	/**
	 * @generated
	 */
	protected Intention getOldTarget() {
		return (Intention) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Intention getNewTarget() {
		return (Intention) newEnd;
	}
}