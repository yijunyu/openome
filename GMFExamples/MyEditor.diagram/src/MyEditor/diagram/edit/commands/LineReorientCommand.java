package MyEditor.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

/**
 * @generated
 */
public class LineReorientCommand extends EditElementCommand {

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
	public LineReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof MyEditor.Line) {
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
		if (!(oldEnd instanceof MyEditor.Box && newEnd instanceof MyEditor.Box)) {
			return false;
		}
		MyEditor.Box target = getLink().getTargetBox();
		if (!(getLink().eContainer() instanceof MyEditor.MyCanvas)) {
			return false;
		}
		MyEditor.MyCanvas container = (MyEditor.MyCanvas) getLink()
				.eContainer();
		return MyEditor.diagram.edit.policies.MyeditorBaseItemSemanticEditPolicy.LinkConstraints
				.canExistLine_3001(container, getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof MyEditor.Box && newEnd instanceof MyEditor.Box)) {
			return false;
		}
		MyEditor.Box source = getLink().getSourceBox();
		if (!(getLink().eContainer() instanceof MyEditor.MyCanvas)) {
			return false;
		}
		MyEditor.MyCanvas container = (MyEditor.MyCanvas) getLink()
				.eContainer();
		return MyEditor.diagram.edit.policies.MyeditorBaseItemSemanticEditPolicy.LinkConstraints
				.canExistLine_3001(container, source, getNewTarget());
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
		getLink().setSourceBox(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setTargetBox(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected MyEditor.Line getLink() {
		return (MyEditor.Line) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected MyEditor.Box getOldSource() {
		return (MyEditor.Box) oldEnd;
	}

	/**
	 * @generated
	 */
	protected MyEditor.Box getNewSource() {
		return (MyEditor.Box) newEnd;
	}

	/**
	 * @generated
	 */
	protected MyEditor.Box getOldTarget() {
		return (MyEditor.Box) oldEnd;
	}

	/**
	 * @generated
	 */
	protected MyEditor.Box getNewTarget() {
		return (MyEditor.Box) newEnd;
	}
}
