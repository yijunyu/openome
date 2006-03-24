package edu.toronto.cs.wbimodel;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;

import com.ibm.wbim.bom.schema1.Catalog;
import com.ibm.wbim.bom.schema1.Catalogs;
import com.ibm.wbim.bom.schema1.CatalogsType;
import com.ibm.wbim.bom.schema1.Connection;
import com.ibm.wbim.bom.schema1.ControlActionOutputRef;
import com.ibm.wbim.bom.schema1.Decision;
import com.ibm.wbim.bom.schema1.DocumentRoot;
import com.ibm.wbim.bom.schema1.FlowContentType;
import com.ibm.wbim.bom.schema1.Fork;
import com.ibm.wbim.bom.schema1.Input;
import com.ibm.wbim.bom.schema1.InputBranch;
import com.ibm.wbim.bom.schema1.InputCriterion;
import com.ibm.wbim.bom.schema1.InputCriterionRef;
import com.ibm.wbim.bom.schema1.InputType;
import com.ibm.wbim.bom.schema1.Inputs;
import com.ibm.wbim.bom.schema1.Join;
import com.ibm.wbim.bom.schema1.Merge;
import com.ibm.wbim.bom.schema1.ModelType;
import com.ibm.wbim.bom.schema1.Output;
import com.ibm.wbim.bom.schema1.OutputBranch;
import com.ibm.wbim.bom.schema1.OutputBranchType;
import com.ibm.wbim.bom.schema1.OutputCriterion;
import com.ibm.wbim.bom.schema1.OutputRef;
import com.ibm.wbim.bom.schema1.Outputs;
import com.ibm.wbim.bom.schema1.Process;
import com.ibm.wbim.bom.schema1.ProcessModel;
import com.ibm.wbim.bom.schema1.ProcessesType;
import com.ibm.wbim.bom.schema1.RelatedInputCriteriaType;
import com.ibm.wbim.bom.schema1.Schema1Factory;
import com.ibm.wbim.bom.schema1.Schema1Package;
import com.ibm.wbim.bom.schema1.SourceType;
import com.ibm.wbim.bom.schema1.StartNodeType;
import com.ibm.wbim.bom.schema1.StopNodeType;
import com.ibm.wbim.bom.schema1.TargetType;
import com.ibm.wbim.bom.schema1.Task;


public class test {

	static Schema1Package p = Schema1Package.eINSTANCE;
	static Schema1Factory f = p.getSchema1Factory();
	static Resource r;
	static final String processesName = "Prcsss";
	static final String classifiersName = "Clssfrs";
	static final String businessItemsName = "BsnssItm";
	static final String resourcesName = "Rsrcs";
	static final String organizationsName = "Orgnztns";

       static HashMap startstop = new HashMap();

       public static void addStartNode(Process proc, String firstProc) {
               //Creating start node
               StartNodeType startNode = f.createStartNodeType();
               String name = "Start Node";
               startNode.setName(name);
               //Adding node to process flow content
               ((Process) proc).getFlowContent().getStartNode().add(startNode);

               //Connect the start node with the fist process chunk
               EntryExit ee = (EntryExit) startstop.get(firstProc);

               Connection connection = f.createConnection();
               connection.setName(name + " To " + ee.getEntryNode());
               SourceType st = f.createSourceType();
               st.setNode(name);
               connection.setSource(st);
               TargetType tt = f.createTargetType();
               tt.setNode(ee.getEntryNode());
               tt.setContactPoint(ee.getEntryContactPoint());
               connection.setTarget(tt);
               proc.getFlowContent().getConnection().add(connection);
       }

       public static void addStopNode(Process proc, String lastProc) {
               //Creating stop node
               StopNodeType stopNode = f.createStopNodeType();
               String name = "Stop Node";
               stopNode.setName(name);
               //Add node to process flow content
               proc.getFlowContent().getStopNode().add(stopNode);

               //Connect the stop node with the last process chunk
               EntryExit ee = (EntryExit) startstop.get(lastProc);
               Connection connection = f.createConnection();
               connection.setName(ee.getExitNode() + " to " + name);
               SourceType st = f.createSourceType();
               st.setNode(ee.getExitNode());
               st.setContactPoint(ee.getExitContactPoint());
               connection.setSource(st);
               TargetType tt = f.createTargetType();
               tt.setNode(name);
               connection.setTarget(tt);
               proc.getFlowContent().getConnection().add(connection);
       }

public static void addLeaf(Process proc, String name) {

               //Creating a task node
               Task task = f.createTask();
               task.setName(name);



               //Creating inputs and outputs for the task

               //Create task-level sets of inputs and outputs
               Inputs inputs = f.createInputs();
               Outputs outputs = f.createOutputs();
               //Create inputs and outputs
               Input input = f.createInput();
               //SIMPLIFICATION: assume only one input at this time
               input.setName(name + " Input");
               inputs.getInput().add(input);
               Output output = f.createOutput();
               //SIMPLIFICATION: assume only one input at this time
               output.setName(name + " Output");
               outputs.getOutput().add(output);
               //Create input and output criteria
               InputCriterion inCriterion = f.createInputCriterion();
               inCriterion.setName(name + " Input Criterion");
               InputType it = f.createInputType();
               it.setName(input.getName());
               inCriterion.getInput().add(it);

               OutputCriterion outCriterion = f.createOutputCriterion();
               outCriterion.setName(name + " Output Criterion");
               OutputRef or = f.createOutputRef();
               or.setName(output.getName());
               outCriterion.getOutput().add(or);

               //Create related input criteria for the output
               RelatedInputCriteriaType relatedInputCriteria = f.createRelatedInputCriteriaType();
               InputCriterionRef icr = f.createInputCriterionRef();
               icr.setName(inCriterion.getName());
               relatedInputCriteria.getInputCriterion().add(icr);

               //Add input and output criteria to inputs and outputs
               inputs.getInputCriterion().add(inCriterion);
               outputs.getOutputCriterion().add(outCriterion);

               //Set inputs and outputs for the task t1
               task.setInputs(inputs);
               task.setOutputs(outputs);

               //Add task to the process
               proc.getFlowContent().getTask().add(task);

               //Store entry/exit points of the task
               EntryExit ee = new EntryExit(name, input.getName(), name, output.getName());

               //Add the entry/exit info for the task to the global storaga
               startstop.put(name, ee);
       }

       protected static void addConnection(Process proc,
                       String sourceNode, String sourceContactPoint, String targetNode, String targetContactPoint) {

               Connection connection = f.createConnection();
               connection.setName(sourceNode + " to " + targetNode);
               SourceType st = f.createSourceType();
               st.setNode(sourceNode);
               st.setContactPoint(sourceContactPoint);
               connection.setSource(st);
               TargetType tt = f.createTargetType();
               tt.setNode(targetNode);
               tt.setContactPoint(targetContactPoint);
               connection.setTarget(tt);
               proc.getFlowContent().getConnection().add(connection);
       }

       public static void sequentialComposition(Process proc,
                       String parentName, String[] children) {

               //Store the first subprocess' name and entry contact point
               String firstNode = "";
               String firstEntryPoint = "";
               //Store the last subprocess' name and exit contact point
               String lastNode = "";
               String lastExitPoint = "";

               //Link the subprocesses in sequence
               for(int i = 0; i < children.length - 1; i++) {
                       //Get input/output info for 2 sequential subprocesses
                       EntryExit ee1 = (EntryExit) startstop.get(children[i]);
                       //Remmember the first subprocess' name and entry contact point
                       if(i == 0) {
                               firstNode = ee1.getEntryNode();
                               firstEntryPoint = ee1.getEntryContactPoint();
                       }
                       EntryExit ee2 = (EntryExit) startstop.get(children[i+1]);
                       //Remember the last subprocess' name and exit contact point
                       if(i == children.length - 2) {
                               lastNode = ee2.getExitNode();
                               lastExitPoint = ee2.getExitContactPoint();
                       }

                       //Add connections
                       addConnection(proc, ee1.getExitNode(), ee1.getExitContactPoint(),
                                       ee2.getEntryNode(), ee2.getEntryContactPoint());
               }

               //Set the entry/exit parameters for the resulting process chunk
               EntryExit ee = new EntryExit(firstNode, firstEntryPoint, lastNode, lastExitPoint);
               //Store the entry/exit parameters in a hashmap
               startstop.put(parentName, ee);
       }

       public static void refinement(String parentName, String childName) {

               //Copy the entry/exit information from the child to its parent
               EntryExit ee;
               ee = (EntryExit) startstop.get(childName);
               startstop.put(parentName, ee);
       }

       public static void parallelComposition(Process proc, String parentName,
                       String[] children) {

               //Stores the names of the outputs of the fork
               String[] forkOutputs = new String[children.length];
               //Stores the names of the inputs of the joins
               String[] joinInputs = new String[children.length];
               //Stores the input of the fork
               String forkInput;
               //Stores the output of the join
               String joinOutput;

               Fork fork = f.createFork();
               String forkName = parentName + " Fork";
               fork.setName(forkName);

               //Create input brach with one input
               InputBranch inputBranch = f.createInputBranch();
               inputBranch.setName(forkName + " Input Branch");
               Input input = f.createInput();
               forkInput = forkName + " Input";
               input.setName(forkInput);
               inputBranch.getInput().add(input);
               fork.setInputBranch(inputBranch);

               //Creating outputs for the fork
               for(int i = 0; i < children.length; i++) {
                       OutputBranch outputBranch = f.createOutputBranch();
                       outputBranch.setName(forkName + " Output Branch To " + children[i]);
                       //Create output - NOTE THE TYPE!
                       ControlActionOutputRef caor = f.createControlActionOutputRef();
                       forkOutputs[i] = forkName + " Output To " + children[i];
                       caor.setName(forkOutputs[i]);
                       outputBranch.getOutput().add(caor);
                       fork.getOutputBranch().add(outputBranch);
               }

               //Create the corresponding join
               Join join = f.createJoin();
               String joinName = parentName + " Join";
               join.setName(joinName);

               //Creating the output branch of the join
               OutputBranch joinOutputBranch = f.createOutputBranch();
               joinOutputBranch.setName(joinName + " Output branch");
               //Create output - NOTE THE TYPE!
               ControlActionOutputRef output = f.createControlActionOutputRef();
               joinOutput = joinName + " Output";
               output.setName(joinOutput);
               joinOutputBranch.getOutput().add(output);
               join.setOutputBranch(joinOutputBranch);

               //Creating inputs for the join
               for(int i = 0; i < children.length; i++) {
                       InputBranch joinInputBranch = f.createInputBranch();
                       joinInputBranch.setName(joinName + " Input Branch From " + children[i]);
                       Input jInput = f.createInput();
                       joinInputs[i] = joinName + " Input From " + children[i];
                       jInput.setName(joinInputs[i]);
                       joinInputBranch.getInput().add(jInput);
                       join.getInputBranch().add(joinInputBranch);
               }

               //Connect outputs of the fork with the inputs of the parallel subprocesses
               //Connect outputs of the parallel processes with the input of the join
               for(int i=0; i < children.length; i++) {
                       EntryExit ee;
                       //Get the entry/exit information on a child subprocess
                       ee = (EntryExit) startstop.get(children[i]);

                       //Creating connection from an output of the fork to a parallel subprocess
                       addConnection(proc, forkName, forkOutputs[i], ee.getEntryNode(), ee.getEntryContactPoint());
                       //Creating connection from the output of a parallel subprocess to an input of the join
                       addConnection(proc, ee.getExitNode(), ee.getExitContactPoint(), joinName, joinInputs[i]);
               }


               //Add the fork to the process
               proc.getFlowContent().getFork().add(fork);

               //Add the join to the process
               proc.getFlowContent().getJoin().add(join);

               //Add entry/exit information for the resulting process chunk into the hashmap
               EntryExit entryexit = new EntryExit(forkName, forkInput, joinName, joinOutput);
               startstop.put(parentName, entryexit);
       }

       public static void runtimeORComposition(Process proc, String parentName,
                       String[] children, boolean inclusive){

               //Stores the names of the outputs of the decision
               String[] decisionOutputs = new String[children.length];
               //Stores the names of the inputs of the merge
               String[] mergeInputs = new String[children.length];
               //Stores the input of the decision
               String decisionInput;
               //Stores the output of the merge
               String mergeOutput;

               //Creating the deliberation task node
               String delibTaskName = "_Determine_ " + parentName;
               addLeaf(proc, delibTaskName);
               EntryExit delibTaskEE;
               delibTaskEE = (EntryExit) startstop.get(delibTaskName);

               //Creating the decision node
               Decision decision = f.createDecision();
               String decisionName = parentName + " Decision";
               decision.setName(decisionName);
               decision.setIsInclusive(inclusive);

               //Create input brach with one input
               InputBranch decInputBranch = f.createInputBranch();
               decInputBranch.setName(decisionName + " Input Branch");
               Input input = f.createInput();
               decisionInput = decisionName + " Input";
               input.setName(decisionInput);
               decInputBranch.getInput().add(input);
               decision.setInputBranch(decInputBranch);

               //Creating the choices
               for(int i = 0; i < children.length; i++) {
                       OutputBranchType outputBranch = f.createOutputBranchType();
                       outputBranch.setName("b_" + children[i]);
                       //Create output - NOTE THE TYPE!
                       ControlActionOutputRef decisionOutput = f.createControlActionOutputRef();
                       decisionOutputs[i] = decisionName + " Output To " + children[i];
                       decisionOutput.setName(decisionOutputs[i]);
                       outputBranch.getOutput().add(decisionOutput);
                       decision.getOutputBranch().add(outputBranch);
               }

               //DON'T KNOW WHAT THIS SETS!!!!
//              decision.setIsSimpleDecision(true);

               //Link the deliberation task node with the decision node
               addConnection(proc, delibTaskEE.getExitNode(), delibTaskEE.getExitContactPoint(),
                               decision.getName(), decisionInput);

               //Create the merge node
               Merge merge = f.createMerge();
               String mergeName = parentName + " Merge";
               merge.setName(mergeName);

               //Create output branch
               OutputBranch mergeOutputBranch = f.createOutputBranch();
               mergeOutputBranch.setName(mergeName + " Output Branch");
               //Create output
               ControlActionOutputRef output = f.createControlActionOutputRef();
               mergeOutput = mergeName + " Output";
               output.setName(mergeOutput);
               mergeOutputBranch.getOutput().add(output);
               merge.setOutputBranch(mergeOutputBranch);

               //Create merge inputs
               for(int i = 0; i < children.length; i++) {
                       InputBranch mergeInputBranch = f.createInputBranch();
                       mergeInputBranch.setName(mergeName + " Input Branch From " + children[i]);
                       Input mergeInput = f.createInput();
                       mergeInputs[i] = mergeName + " Input From " + children[i];
                       mergeInput.setName(mergeInputs[i]);
                       mergeInputBranch.getInput().add(mergeInput);
                       merge.getInputBranch().add(mergeInputBranch);
               }

               //Connect outputs of the decision with the inputs of the alternative subprocesses
               //Connect outputs of the alternative subprocesses with the input of the merge
               for(int i=0; i < children.length; i++) {
                       EntryExit ee;
                       //Get the entry/exit information on a child subprocess
                       ee = (EntryExit) startstop.get(children[i]);

                       //Creating connection from an output of the decision to an alternative subprocess
                       addConnection(proc, decisionName, decisionOutputs[i], ee.getEntryNode(), ee.getEntryContactPoint());
                       //Creating connection from the output of an alternative subprocess to an input of the merge
                       addConnection(proc, ee.getExitNode(), ee.getExitContactPoint(), mergeName, mergeInputs[i]);
               }

               //Add merge node to the process
               proc.getFlowContent().getMerge().add(merge);

               //Add decision node to the process
               proc.getFlowContent().getDecision().add(decision);


               //Add entry/exit information for the resulting process chunk into the hashmap
               EntryExit entryexit = new EntryExit(delibTaskEE.getEntryNode(), delibTaskEE.getEntryContactPoint(),
                               mergeName, mergeOutput);
               startstop.put(parentName, entryexit);
       }
		
	public static void main(String[] args) {
		Resource resource = init_storage("test.Model");
		ModelType model = createModel();
//		com.ibm.btools.te.xml.model.Process process1 = 
		init_process(model);
//		changeProcess(process1);
		output_model(resource, model);
	}

	/**
	 * @param model
	 * @return
	 */
	public static Process init_process(ModelType model) {
		CatalogsType catalogsT = createCatalogsType(model);
		ProcessModel processModel = createProcessModel(catalogsT);
		ProcessesType processesType = createProcessesType(processModel);
		Process process1 = createProcess(processesType);
		updateProcess(process1, 
				processesType, 
				processModel, 
				catalogsT, 
				model);
		return process1;
	}

	/**
	 * @param storage
	 * @param model
	 */
	public static void output_model(Resource r, ModelType model) {
		r.getContents().add(model);
		try {
			r.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	/**
	 * create process
	 * @param args
	 */
	public static ModelType createModel() {		
		//		Crete top-level Model
		ModelType model = f.createModelType();
		return model;
	}
	public static CatalogsType createCatalogsType(ModelType model) {		
		DocumentRoot documentRoot = f.createDocumentRoot();
		documentRoot.setModel(model);
		//		Set schema version		
		model.setSchemaVersion("6.0");
		model.setName("WBIM Test Model");
		//		Creating catalogs
		CatalogsType catalogsT = f.createCatalogsType();
		return catalogsT;
	}
	public static ProcessModel createProcessModel(CatalogsType catalogsT) {		
		//		Creating classifier catalogs
		Catalogs classifierCatalogs = f.createCatalogs();
		Catalog classifierCatalog = f.createCatalog();
		classifierCatalog.setId(classifiersName);
		classifierCatalog.setName("Classifiers");
		classifierCatalogs.getCatalog().add(classifierCatalog);
		//		Add resource catalogs to the set of catalogs
		catalogsT.setDataCatalogs(classifierCatalogs);	
		//		Creating process catalogs		
		Catalogs processCatalogs = f.createCatalogs();
		Catalog processCatalog = f.createCatalog();
		processCatalog.setId(processesName);
		processCatalog.setName("Processes");
		processCatalogs.getCatalog().add(processCatalog);
		//		Add resource catalogs to the set of catalogs
		catalogsT.setProcessCatalogs(processCatalogs);		
		//		Creating data catalogs		
		Catalogs dataCatalogs = f.createCatalogs();
		Catalog dataCatalog = f.createCatalog();
		dataCatalog.setId(businessItemsName);
		dataCatalog.setName("Business Items");
		dataCatalogs.getCatalog().add(dataCatalog);
		//		Add resource catalogs to the set of catalogs
		catalogsT.setDataCatalogs(dataCatalogs);		
		//Creating organizaton catalogs		
		Catalogs organizationCatalogs = f.createCatalogs();
		Catalog organizationCatalog = f.createCatalog();
		organizationCatalog.setId(organizationsName);
		organizationCatalog.setName("Organization Catalog");
		organizationCatalogs.getCatalog().add(organizationCatalog);
		//Add resource catalogs to the set of catalogs
		catalogsT.setOrganizationCatalogs(organizationCatalogs);			
		//Creating resource catalogs		
		Catalogs resourceCatalogs = f.createCatalogs();
		Catalog resourceCatalog = f.createCatalog();
		resourceCatalog.setId(resourcesName);
		resourceCatalog.setName("Resource Catalog");
		resourceCatalogs.getCatalog().add(resourceCatalog);
		//Add resource catalogs to the set of catalogs
		catalogsT.setResourceCatalogs(resourceCatalogs);
		/*
		 * Creating a process model
		 */
		ProcessModel processModel = f.createProcessModel();
		return processModel;
	}
	
	public static ProcessesType createProcessesType(ProcessModel processModel) {
		ProcessesType processesType = f.createProcessesType();
		return processesType;
	}
	public static Process createProcess(ProcessesType processesType) {		
		//Creating Process1
		Process process1 = f.createProcess();
		process1.setName(processesName+"##"+"Test Process 1");		
		//DESCRIPTION DOES NOT GET IMPORTED CORRECTLY!!!!
		//process1.setDescription("Process1 for testing");
		//Creating flow content
		FlowContentType process1FlowContent = f.createFlowContentType();
		//Setting flow content
		process1.setFlowContent(process1FlowContent);		
		//Create procell-level inputs and outputs
		Inputs inputs = f.createInputs();
		Outputs outputs = f.createOutputs();
		//Create input and output criteria
		InputCriterion inCriterion = f.createInputCriterion();
		inCriterion.setName("Process-Level Input Criterion");
		OutputCriterion outCriterion = f.createOutputCriterion();
		outCriterion.setName("Process-Level Output Criterion");	
		//Create related input criteria for the output
		RelatedInputCriteriaType relatedInputCriteria = f.createRelatedInputCriteriaType();
		InputCriterionRef icr = f.createInputCriterionRef();
		icr.setName(inCriterion.getName());
		relatedInputCriteria.getInputCriterion().add(icr);		
		//Add input and output criteria to inputs and outputs
		inputs.getInputCriterion().add(inCriterion);
		outputs.getOutputCriterion().add(outCriterion);		
		//Add inputs and outputs to the process
		process1.setInputs(inputs);
		process1.setOutputs(outputs);	
		return process1;
	}

	public static void updateProcess(Process process1, 
			ProcessesType processesType, 
			ProcessModel processModel,
			CatalogsType catalogsT,
			ModelType model) {		
		//	Add process1 to processesType
		processesType.getProcess().add(process1);
		processModel.setProcesses(processesType);		
		/*
		 * *****************************
		 * Add elements to the model
		 */
//		Add all catalogs to the model
		model.setCatalogs(catalogsT);
//		Add process model to the model
		model.setProcessModel(processModel);				
	}

	/**
	 * @return
	 */
	private static Resource init_storage(String name) {
		ResourceSet rs = new ResourceSetImpl();		
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put(Resource.Factory.Registry.DEFAULT_EXTENSION,
				new XMLResourceFactoryImpl());
		URI file = URI.createFileURI(new File(name).getAbsolutePath());
		Resource r = rs.createResource(file);		
		return r;
	}
}
