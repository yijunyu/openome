package codegen;
public class GMFProjectGeneration extends action.GMFProjectGeneration {
	public GMFProjectGeneration() {
		super("goalmodel", 
			  "/model/goalmodel.gmfgen", 
			  "edu.toronto.cs.goalmodel",
			  new String [] {
				// These adaptations are to remove the annoying border of the compartment shape
				"edu.toronto.cs.goalmodel.diagram/src/edu/toronto/cs/goalmodel/diagram/edit/parts/RoleRoleCompartmentEditPart.java",
				"edu.toronto.cs.goalmodel.diagram/src/edu/toronto/cs/goalmodel/diagram/edit/parts/PositionPositionCompartmentEditPart.java",
				"edu.toronto.cs.goalmodel.diagram/src/edu/toronto/cs/goalmodel/diagram/edit/parts/ContainerCompartmentEditPart.java",
				"edu.toronto.cs.goalmodel.diagram/src/edu/toronto/cs/goalmodel/diagram/edit/parts/AspectAspectCompartmentEditPart.java",
				"edu.toronto.cs.goalmodel.diagram/src/edu/toronto/cs/goalmodel/diagram/edit/parts/AgentAgentCompartmentEditPart.java",
				"edu.toronto.cs.goalmodel.diagram/src/edu/toronto/cs/goalmodel/diagram/edit/parts/ActorActorCompartmentEditPart.java",
			});
	}
}
