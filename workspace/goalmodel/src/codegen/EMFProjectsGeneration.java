package codegen;

public class EMFProjectsGeneration extends action.EMFProjectsGeneration {

	public EMFProjectsGeneration() {
		super("goalmodel", 
			  "/model/goalmodel.genmodel", 
			  "edu.toronto.cs.goalmodel",
			  new String [] {
				// For including dependency on goalmodel.figures plugin
				// otherwise, the edu.toronto.cs.goalmodel.diagrams plugin
				// will always complain !
				"edu.toronto.cs.goalmodel/META-INF/MANIFEST.MF",				
				// For the getParent() method derived from getParentDecompositions
				// should be replaced by OCL 
				"edu.toronto.cs.goalmodel/src/edu/toronto/cs/goalmodel/Intention.java",
				"edu.toronto.cs.goalmodel/src/edu/toronto/cs/goalmodel/impl/IntentionImpl.java",
				});
	}

}
