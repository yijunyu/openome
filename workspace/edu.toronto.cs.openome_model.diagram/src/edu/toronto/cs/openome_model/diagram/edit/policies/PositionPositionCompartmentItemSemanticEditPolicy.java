package edu.toronto.cs.openome_model.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class PositionPositionCompartmentItemSemanticEditPolicy
		extends
		edu.toronto.cs.openome_model.diagram.edit.policies.Openome_modelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_2009 == req
				.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req
						.setContainmentFeature(edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
								.getContainer_Intentions());
			}
			return getGEFWrapper(new edu.toronto.cs.openome_model.diagram.edit.commands.Goal4CreateCommand(
					req));
		}
		if (edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_2010 == req
				.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req
						.setContainmentFeature(edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
								.getContainer_Intentions());
			}
			return getGEFWrapper(new edu.toronto.cs.openome_model.diagram.edit.commands.Softgoal4CreateCommand(
					req));
		}
		if (edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_2011 == req
				.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req
						.setContainmentFeature(edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
								.getContainer_Intentions());
			}
			return getGEFWrapper(new edu.toronto.cs.openome_model.diagram.edit.commands.Resource4CreateCommand(
					req));
		}
		if (edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_2012 == req
				.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req
						.setContainmentFeature(edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
								.getContainer_Intentions());
			}
			return getGEFWrapper(new edu.toronto.cs.openome_model.diagram.edit.commands.Task4CreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
