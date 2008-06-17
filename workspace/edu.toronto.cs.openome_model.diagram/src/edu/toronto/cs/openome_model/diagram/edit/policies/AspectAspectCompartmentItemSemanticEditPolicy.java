package edu.toronto.cs.openome_model.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class AspectAspectCompartmentItemSemanticEditPolicy
		extends
		edu.toronto.cs.openome_model.diagram.edit.policies.Openome_modelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_2017 == req
				.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req
						.setContainmentFeature(edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
								.getContainer_Intentions());
			}
			return getGEFWrapper(new edu.toronto.cs.openome_model.diagram.edit.commands.Goal6CreateCommand(
					req));
		}
		if (edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_2018 == req
				.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req
						.setContainmentFeature(edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
								.getContainer_Intentions());
			}
			return getGEFWrapper(new edu.toronto.cs.openome_model.diagram.edit.commands.Softgoal6CreateCommand(
					req));
		}
		if (edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_2019 == req
				.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req
						.setContainmentFeature(edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
								.getContainer_Intentions());
			}
			return getGEFWrapper(new edu.toronto.cs.openome_model.diagram.edit.commands.Resource6CreateCommand(
					req));
		}
		if (edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_2020 == req
				.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req
						.setContainmentFeature(edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
								.getContainer_Intentions());
			}
			return getGEFWrapper(new edu.toronto.cs.openome_model.diagram.edit.commands.Task6CreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
