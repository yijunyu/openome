package convertor;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import javax.xml.namespace.QName;

import org.eclipse.bpel.model.Activity;
import org.eclipse.bpel.model.BPELFactory;
import org.eclipse.bpel.model.BPELPackage;
import org.eclipse.bpel.model.Case;
import org.eclipse.bpel.model.Condition;
import org.eclipse.bpel.model.Empty;
import org.eclipse.bpel.model.Flow;
import org.eclipse.bpel.model.Process;
import org.eclipse.bpel.model.Sequence;
import org.eclipse.bpel.model.Switch;
import org.eclipse.bpel.model.resource.BPELResourceImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.wst.wsdl.Definition;
import org.eclipse.wst.wsdl.Input;
import org.eclipse.wst.wsdl.Message;
import org.eclipse.wst.wsdl.Operation;
import org.eclipse.wst.wsdl.Output;
import org.eclipse.wst.wsdl.Part;
import org.eclipse.wst.wsdl.PortType;
import org.eclipse.wst.wsdl.WSDLFactory;
import org.eclipse.wst.wsdl.WSDLPackage;
import org.eclipse.wst.wsdl.internal.util.WSDLResourceFactoryImpl;
import org.eclipse.wst.wsdl.util.WSDLConstants;

import parser.GoalModelLoader;

import util.Computing;
import edu.toronto.cs.goalmodel.ContributionType;
import edu.toronto.cs.goalmodel.DecompositionType;
import edu.toronto.cs.goalmodel.GoalmodelPackage;
import edu.toronto.cs.goalmodel.actor;
import edu.toronto.cs.goalmodel.contribution;
import edu.toronto.cs.goalmodel.dependency;
import edu.toronto.cs.goalmodel.goal;
import edu.toronto.cs.goalmodel.linkAnnotation;
import edu.toronto.cs.goalmodel.linkAnnotationType;
import edu.toronto.cs.goalmodel.topic;

public class GoalModel_BPEL extends GoalModelLoader {
	
	private String output_file;
	
	//Stores the namespace for the project
	final String namespacePrefix = "http://Processes/";
	String projectNamespace = "SampleProject/";
	//TODO Must find a way to specify the project name and add it to the
	//namespace.
	
	BPELPackage pe = BPELPackage.eINSTANCE;
	BPELFactory pf = pe.getBPELFactory();
	
	WSDLPackage we = WSDLPackage.eINSTANCE;
	WSDLFactory wf = we.getWSDLFactory();
	
	//Hold the data needed to save a resource
	class ResourceData {
		String filename;
		Resource resource;
		
		ResourceData(String filename, Resource resource) {
			this.filename = filename;
			this.resource = resource;
		}
	}
	
	//Store the data for all the files created during the process so that
	//they all can be saved upon successful generation of BPEL/WSDL
	ArrayList resourceList = new ArrayList();
		
	/**
	 * Create a BPEL activity corresponding to a goal. Additionally,
	 * generate messages and operations for the WS implementing the actor's
	 * functionality and generate messages and operations for the actor's
	 * interface based on incoming dependencies.
	 * @param bpelProcess - reference to the main BPEL process
	 * @param parent - the parent BPEL activity (the BPEL element must be added to it)
	 * @param currentGoal - the goal being mapped 
	 * @param interfaceDefinition - the definitions object for the actor's WSDL interface
	 * @param interfacePT - the portType object for the actor's WSDL interface
	 * @param implDefinition - the definitions object for the actor's impl. interface
	 * @param implPT - the portType object for the actor's impl. interface
	 */
	@SuppressWarnings("unchecked")
	public void outputGoal(
			org.eclipse.bpel.model.Process bpelProcess, Activity parent, goal currentGoal, 
			Definition interfaceDefinition, PortType interfacePT, 
			Definition implDefinition, PortType implPT) {
		
		//DEBUG
		System.out.println("Output Goal");
		//END DEBUG
		
		//Get the goal's incoming dependencies
		EList incomingDependencies = currentGoal.getDependencyFrom();
		//There are incoming dependencies and the current goal is not a root goal
		if((incomingDependencies.size() > 0)&&(currentGoal.getParent() != null)) {
			//DEBUG
			System.out.println("Dependencies to:" + currentGoal.getName());
			//END DEBUG
			//Add the corresponding operation and input/output messages to the 
			//WSDL interface for the actor
			addWSDLMsgAndOp(currentGoal, interfaceDefinition, interfacePT);
			//TODO this is an invocation of an operation in this actor's PT,
			//add a receive activity here with the signature corresponding to the
			//current goal.
		}
		
		//Determine how the goal is decomposed
		DecompositionType decomposition = currentGoal.getType();
		
		//CASE 1: currentGoal is a leaf-level goal
		if (decomposition.equals(DecompositionType.LEAF_LITERAL)) {
			//Here, we must add the operation that corresponds to this leaf-level goal
			//to the interface of the service implementing the current actor
			addWSDLMsgAndOp(currentGoal, implDefinition, implPT);
			//TODO Must be an invocation of the corresponding operation
			//of the implementation WS - CALL THE NEWLY ADDED OPERATION!!!
			//Alternatively, this could be an invocation of some other WS
			Empty bpelEmpty = pf.createEmpty();
			bpelEmpty.setName(currentGoal.getName());
			//Add the activity to its parent
			//If parent is null, then this is a root goal - 
			//add it to the process directly
			//--------------------------------------------------------
			//TODO This must be replaced with a receive activity!!!
			//--------------------------------------------------------
			if (parent == null)
				bpelProcess.setActivity(bpelEmpty);
			else
				//The parent is a sequence
				if (parent instanceof Sequence) {
					Sequence parentSeq = (Sequence) parent;
					parentSeq.getActivities().add(bpelEmpty);
				} 
				//The parent is a flow
				else if (parent instanceof Flow) {
					Flow parentFlow = (Flow) parent;
					parentFlow.getActivities().add(bpelEmpty);
				}
				//The parent is a switch
				//In this case, we need to create a case that will contain
				//the bpelSequence. We need the conditional annotation to specify the
				//condition for the case. If the annotation is absent or is not
				//conditional, then the case condition will be set to error string.
				else if (parent instanceof Switch) {
					Switch parentSwitch = (Switch) parent;
					//Create a new case
					Case bpelCase = pf.createCase();
					//Add the newly created sequence to the switch case
					bpelCase.setActivity(bpelEmpty);
					//Extract the annotation that accompanies this goal
					linkAnnotation annotation = currentGoal.getAnnotation();
					
					//Stores the condition
					//TODO: is String the right type for this?
					String caseCondition;
					
					//If the correct annotation is present, set it as the case condition
					if (annotation != null && 
							annotation.getType().equals(linkAnnotationType.CONDITION_LITERAL))
						caseCondition = annotation.getDetails();
					else
						caseCondition = "Incorrect Condition in Goal Model!";
					
					//Create the condition object
					Condition condition = pf.createCondition();
					
					//NOTE: need to look at this some more!!!!
					//Set the body of the condition
					condition.setBody(caseCondition);
					//Set the case condition
					bpelCase.setCondition(condition);
					//Add the new case to the parent switch activity
					parentSwitch.getCases().add(bpelCase);
				}
		}
		//CASE 2: Handle AND decompositions
		
		//Is the parent and the current goals map into the same BPEL construct?
		//(sequence/flow)
		boolean same = false;
		if (!decomposition.equals(DecompositionType.LEAF_LITERAL)) {
			if (decomposition == DecompositionType.AND_LITERAL) {
				//currentGoal is non-leaf and is AND-decomposed
				if (currentGoal.getSequential().booleanValue()) {
					//This is sequential AND decomposition
					Sequence bpelSequence = pf.createSequence();
					//Name the sequence with the goal name
					bpelSequence.setName(currentGoal.getName());
					//If parent is null, then this is a root goal - 
					//add it to the process directly
					if (parent == null)
						bpelProcess.setActivity(bpelSequence);
					else
						//The parent is a sequence then, we skip generating another sequence
						if (parent instanceof Sequence) {
							same = true;
						} 
						//The parent is a flow
						else if (parent instanceof Flow) {
							Flow parentFlow = (Flow) parent;
							parentFlow.getActivities().add(bpelSequence);
						}
						//The parent is a switch
						//In this case, we need to create a case that will contain
						//the bpelSequence. We need the conditional annotation to specify the
						//condition for the case. If the annotation is absent or is not
						//conditional, then the case condition will be set to a default string.
						else if (parent instanceof Switch) {
							Switch parentSwitch = (Switch) parent;
							//Create a new case
							Case bpelCase = pf.createCase();
							//Add the newly created sequence to the switch case
							bpelCase.setActivity(bpelSequence);
							//Extract the annotation that accompanies this goal
							linkAnnotation annotation = currentGoal.getAnnotation();
							//Stores the condition
							//TODO: is String the right type for this?
							String caseCondition;
							
							//If the correct annotation is present, set it as the case condition
							if (annotation != null && 
									annotation.getType().equals(linkAnnotationType.CONDITION_LITERAL))
								caseCondition = annotation.getDetails();
							else
								caseCondition = "Incorrect Condition in Goal Model!";
							
							//Create the condition object
							Condition condition = pf.createCondition();
							
							//NOTE: need to look at this some more!!!!
							//Set the body of the condition
							condition.setBody(caseCondition);
							//Set the case condition
							bpelCase.setCondition(condition);
							//Add the new case to the parent switch activity
							parentSwitch.getCases().add(bpelCase);
						}
					//Get the subgoals of the non-leaf goal and recursively call
					//outputGoal on them
					EList subgoals = currentGoal.getGoal();
					for (int j=0; j < subgoals.size(); j++) {
						goal subGoal = (goal) subgoals.get(j);
						//Recursive call
						//If the current activity is not the same the the parent
						//goal's, pass it as a parent, else pass the parent activity
						if (!same)
							outputGoal(bpelProcess, bpelSequence, subGoal, 
									interfaceDefinition, interfacePT, implDefinition, implPT);
						else
							outputGoal(bpelProcess, parent, subGoal, 
									interfaceDefinition, interfacePT, implDefinition, implPT);
					}
				} else {
					//The decomposiiton is parallel AND
					Flow bpelFlow = pf.createFlow();
					//Name the flow with the goal name
					bpelFlow.setName(currentGoal.getName());
					//If parent is null, then this is a root goal - 
					//add it to the process directly
					if (parent == null)
						bpelProcess.setActivity(bpelFlow);
					else 
						//The parent is a sequence
						if (parent instanceof Sequence) {
							Sequence parentSeq = (Sequence) parent;
							parentSeq.getActivities().add(bpelFlow);
						} 
						//The parent is a flow - skip generating activity for the child flow
						else if (parent instanceof Flow) {
//							TFlow parentFlow = (TFlow) parent;
//							parentFlow.getFlow().add(bpelFlow);
							same = true;
						}
						//The parent is a switch
						else if (parent instanceof Switch) {
							Switch parentSwitch = (Switch) parent;
							//Create a new case
							Case bpelCase = pf.createCase();
							//Add the newly created flow to the switch case
							bpelCase.setActivity(bpelFlow);
							//Extract the annotation that accompanies this goal
							linkAnnotation annotation = currentGoal.getAnnotation();
							//Stores the condition
							//TODO: is String the right type for this?
							String caseCondition;
							
							//If the correct annotation is present, set it as the case condition
							if (annotation != null && 
									annotation.getType().equals(linkAnnotationType.CONDITION_LITERAL))
								caseCondition = annotation.getDetails();
							else
								caseCondition = "Incorrect Condition in Goal Model!";
							
							//Create the condition object
							Condition condition = pf.createCondition();
							
							//NOTE: need to look at this some more!!!!
							//Set the body of the condition
							condition.setBody(caseCondition);
							//Set the case condition
							bpelCase.setCondition(condition);
							//Add the new case to the parent switch activity
							parentSwitch.getCases().add(bpelCase);			
						}
					//Get the subgoals of the non-leaf goal and recursively call
					//outputGoal on them
					EList subgoals = currentGoal.getGoal();
					for (int j=0; j < subgoals.size(); j++) {
						goal subGoal = (goal) subgoals.get(j);
						//Recursive call
						//If the current activity is not the same the the parent
						//goal's, pass it as a parent, else pass the parent activity
						if(!same)
							outputGoal(bpelProcess, bpelFlow, subGoal, 
									interfaceDefinition, interfacePT, implDefinition, implPT);
						else
							outputGoal(bpelProcess, parent, subGoal, 
									interfaceDefinition, interfacePT, implDefinition, implPT);
					}
				} //parallel goal
			} else { //This is the OR goal. 
				
				//TODO
				//This only applies to runtime OR decompositions.
				
				Switch bpelSwitch = pf.createSwitch();
				bpelSwitch.setName(currentGoal.getName());
//				If parent is null, then this is a root goal - 
				//add it to the process directly
				if (parent == null)
					bpelProcess.setActivity(bpelSwitch);
				else 
					//The parent is a sequence
					if (parent instanceof Sequence) {
						Sequence parentSeq = (Sequence) parent;
						parentSeq.getActivities().add(bpelSwitch);
					} 
					//The parent is a flow
					else if (parent instanceof Flow) {
						Flow parentFlow = (Flow) parent;
						parentFlow.getActivities().add(bpelSwitch);
					}
					//The parent is a switch
					else if (parent instanceof Switch) {
						Switch parentSwitch = (Switch) parent;
						//Create a new case
						Case bpelCase = pf.createCase();
						//Add the newly created flow to the switch case
						bpelCase.setActivity(bpelSwitch);
						//Extract the annotation that accompanies this goal
						linkAnnotation annotation = currentGoal.getAnnotation();
						//Stores the condition
						//TODO: is String the right type for this?
						String caseCondition;
						
						//If the correct annotation is present, set it as the case condition
						if (annotation != null && 
								annotation.getType().equals(linkAnnotationType.CONDITION_LITERAL))
							caseCondition = annotation.getDetails();
						else
							caseCondition = "Incorrect Condition in Goal Model!";
						
						//Create the condition object
						Condition condition = pf.createCondition();
						
						//NOTE: need to look at this some more!!!!
						//Set the body of the condition
						condition.setBody(caseCondition);
						//Set the case condition
						bpelCase.setCondition(condition);
						//Add the new case to the parent switch activity
						parentSwitch.getCases().add(bpelCase);			
					}
				//Get the subgoals of the non-leaf goal and recursively call
				//outputGoal on them
				EList subgoals = currentGoal.getGoal();
				for (int j=0; j < subgoals.size(); j++) {
					goal subGoal = (goal) subgoals.get(j);
					//Recursive call
					outputGoal(bpelProcess, bpelSwitch, subGoal, 
							interfaceDefinition, interfacePT, implDefinition, implPT);
				}
			} //OR goal
		} //non-leaf goal
		EList contributions = currentGoal.getRule();
		EList dependencies = currentGoal.getDependencyTo();
		for (int j=0; j < contributions.size(); j++) {
			@SuppressWarnings("unused")
			contribution c = (contribution) contributions.get(j);
//			output += shortContributionName(c.getType()) 
//				+ getActorName(c.getTarget()) + c.getTarget().getName() 
//				+ (j==contributions.size()-1? "":",");
		}
		for (int j=0; j < dependencies.size(); j++) {
			dependency d = (dependency) dependencies.get(j);
			@SuppressWarnings("unused")
			goal to = d.getDependencyTo();
//			output += "~" 
//				+ getActorName(to)
//				+ Computing.quotation(to.getName()) 
//				+ (j==dependencies.size()-1? "":",");
		}
		
	}
	
	protected String getActorName(goal g) {
		actor a = getActor(g);
		String n = "";
		if (a!=null)
			n = Computing.quotation(a.getName());
			//AL: Changed
			//Below is the original Yijun's name generation
			//Why do we need the angle brackets, etc?
			//n = "<" + Computing.quotation(a.getName()) + ">::" + n;
		return n;
	}

	@SuppressWarnings("unused")
	//Since only root goals have actor field explicitly set, this procedure
	//either returns the goal's actor object, or its ancestor's (root's) actor object
	private actor getActor(goal g) {
		actor a = g.getActor();
		String n = "";
		if (a!=null)
			return a;
		else { // actor must be inherited from the ancestor goals
			goal p = g.getParent();
			while (p!=null) {
				actor pa = p.getActor();
		    		if (pa!=null) {
		    			return pa;
		    		}
				p = p.getParent();
			}
		}
		return null;
	}
		
	@SuppressWarnings("unused")
	private String shortContributionName(ContributionType type) {
		switch (type.getValue()) {
		case ContributionType.HELP:
			return "+";
		case ContributionType.HURT:
			return "-";
		case ContributionType.BREAK:
			return "--";
		case ContributionType.MAKE:
			return "++";
		}
		return null;
	}
	
	private String getResourceName(Object o) {
		File bpel_file = new File(output_file);
		String name = bpel_file.getAbsolutePath().replaceAll(".process", "");
		if (o instanceof actor) {
			actor a = (actor) o;
			name += Computing.strip_spaces(a.getName());
		} else if (o instanceof goal) {
			goal g = (goal) o;
			name += "." + Computing.strip_spaces(g.getName());
		}
		return name;
	}

	/**
	 * Saves the resource
	 * @param filename
	 * @param resource
	 */
	private void saveResource(String filename, Resource resource) {
		
		if(resource instanceof BPELResourceImpl)
		{
			//If the resource is an instance of BPELResourceImpl, save it appropriately
			BPELResourceImpl bpelResource = (BPELResourceImpl) resource;
			try {
				bpelResource.doSave(new FileOutputStream(filename), Collections.EMPTY_MAP);
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
		else
		{
			//Assume that the resource is a WSDL resource
			try {
				resource.save(Collections.EMPTY_MAP);
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
	}
		
	@SuppressWarnings("unchecked")
	private Resource createResource(String process_filename) {
		URI uri = URI.createFileURI(process_filename);
		ResourceSet resourceSet = new ResourceSetImpl();
	    resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
	    		Resource.Factory.Registry.DEFAULT_EXTENSION, 
	    		new XMIResourceFactoryImpl());
	    // Create a resource for this file.
	    Resource resource = resourceSet.createResource(uri);
		return resource;
	}

	/*
	 * GIVES ERRORS - processRoot
	 * 
	private void createActorProcessFile(Object o) {
		DocumentRoot processRoot = pf.createDocumentRoot();
		String process_filename = getResourceName(o) + ".process";
		Resource resource = createResource(process_filename + ".xmi");
		
		//Save the information to save the file later into a data structure
		ResourceData bpelData = 
			new ResourceData("BPWS.xsl", process_filename, resource);
		//Store the data
		resourceList.add(bpelData);
//		saveResource("BPWS.xsl", process_filename, resource);		
	}

*/
	
	@SuppressWarnings({ "unused", "unchecked" })
	private void createActorInterfaceFile(Object o) {
//		org.xmlsoap.schemas.wsdl.DocumentRoot wsdlRoot = wf.createDocumentRoot();
		String wsdl_filename = getResourceName(o) + ".wsdl";
		Resource resource = createResource(wsdl_filename + ".xmi");
		//Save the information to save the file later into a data structure
		ResourceData wsdlData = 
			new ResourceData(wsdl_filename, resource);
		//Store the data
		resourceList.add(wsdlData);
	}
	
	@SuppressWarnings({ "unused", "unchecked" })
	private void createActorImplInterfaceFile(Object o) {
//		org.xmlsoap.schemas.wsdl.DocumentRoot wsdlRoot = wf.createDocumentRoot();
		String wsdl_filename = getResourceName(o) + ".impl.wsdl";
		Resource resource = createResource(wsdl_filename + ".xmi");
		ResourceData wsdlData = 
			new ResourceData(wsdl_filename, resource);
		//Store the data
		resourceList.add(wsdlData);
	}
	
	/*
	 * Saves all created files
	 */
	private void saveAllResources() {
		//Traverse the list of resources and save them one by one
		Iterator i = resourceList.iterator();
		while(i.hasNext()) {
			ResourceData data = (ResourceData) i.next();
			saveResource(data.filename, data.resource);	
		}
	}
	
	/**
	 * Given a goal, this procedure creates the input/output messages
	 * based on the goal input/output parameters and adds the operation
	 * corresponding to the goal to the given portType.
	 * @param currentGoal
	 * @param def
	 * @param pt
	 */
	private void addWSDLMsgAndOp(goal currentGoal, Definition def, PortType pt) {
		//Get the input/output parameters for the goal
		EList goalInputs = currentGoal.getInput();
		EList goalOutputs = currentGoal.getOutput();
		
		//Create the input message for the goal
		Message inputMsg = wf.createMessage();
		inputMsg.setQName(new QName(def.getTargetNamespace(), currentGoal.getName() + "InputMsg"));

		//Create the output message for the goal
		Message outputMsg = wf.createMessage();
		outputMsg.setQName(new QName(def.getTargetNamespace(), currentGoal.getName() + "OutputMsg"));
		
		//Iterate through inputs and add message parts to the input msg
		for (int k =0; k < goalInputs.size(); k++) {
			topic inputTopic = (topic) goalInputs.get(k);
			//Add part to the message
			Part part = wf.createPart();
			part.setName(inputTopic.getName());
			//TODO Validate the type???
			String type = inputTopic.getType(); 
			if(type == "" || type == null)
				part.setTypeName(new QName(WSDLConstants.SCHEMA_FOR_SCHEMA_URI_2001, "string"));
			else
				part.setTypeName(new QName(WSDLConstants.SCHEMA_FOR_SCHEMA_URI_2001, type));
			//Add the newly created part to the message
			inputMsg.addPart(part);
		}
		
		//Iterate through outputs and add message parts to the output msg
		for (int k =0; k < goalOutputs.size(); k++) {
			topic outputTopic = (topic) goalOutputs.get(k);
			//Add part to the message
			Part part = wf.createPart();
			part.setName(outputTopic.getName());
			//TODO Validate the type???
			String type = outputTopic.getType(); 
			if(type == "" || type == null)
				part.setTypeName(new QName(WSDLConstants.SCHEMA_FOR_SCHEMA_URI_2001, "string"));
			else
				part.setTypeName(new QName(WSDLConstants.SCHEMA_FOR_SCHEMA_URI_2001, type));
			//Add the newly created part to the message
			outputMsg.addPart(part);
		}
		
		//Add the messages to the definition
		def.addMessage(outputMsg);
		def.addMessage(inputMsg);
		
		//Create the operation corresponding to the root goal
		Operation op = wf.createOperation();
		op.setName(currentGoal.getName());
		
		// Create an Input
	    Input input = wf.createInput();
	    input.setMessage(inputMsg);

	    // Create an Output
	    Output output = wf.createOutput();
	    output.setMessage(outputMsg);
		
		//Set the inputs and outputs
		op.setInput(input);
		op.setOutput(output);
		//Add the new operation to the portType
		pt.addOperation(op);
	}
	
	//	Generates a BPEL process from a goal model
	@SuppressWarnings({ "unchecked", "unchecked" })
	public void generateProcessModel(Resource input) {

		//Create partner links------------------------------------------------------------
		
		//Create WSDL file to store partnerLinkTypes - name the same as the Goal Model
		Definition plDef = wf.createDefinition();
		//Set target namespace
	    plDef.setTargetNamespace(namespacePrefix + projectNamespace + "PartnerLinks/");
	    plDef.addNamespace("tns", namespacePrefix + projectNamespace + "PartnerLinks/");
		
		//Create resource
		String partnerLinkFileName = output_file + "PartnerLinks.wsdl";
		// Create a resource for this file.
//		WSDLResourceImpl partnerLinkResource = new WSDLResourceImpl(pLURI);
		//Let's try another alternative
		ResourceSet resourceSet = new ResourceSetImpl();
	    Resource partnerLinkResource = resourceSet.createResource(URI.createFileURI(partnerLinkFileName));
	    resourceSet.getResources().add(partnerLinkResource);
		
		//Add the definition element to the resource
		partnerLinkResource.getContents().add(plDef);
		
		//Save the resource information
		ResourceData pLData = 
			new ResourceData(partnerLinkFileName, partnerLinkResource);
		//Clean up the data structure
		resourceList.clear();
		//Store the data
		resourceList.add(pLData);
		
		//Go thorough the EMF goal model
		for (Iterator i = input.getResourceSet().getAllContents(); i.hasNext(); ) {
	    	Object someObject = i.next();
	    	if (someObject instanceof goal) {
    			//TODO
    			//Here is the place to address the case where the supplied model is
    			//KAOS-style goal model with no actors - in this case an actor must
    			//be created. Here, the goal model will not have dependencies besides
	    		//the delegation of leaf-level goals.
	    		goal rootGoal = (goal) someObject;
	    		String actorName = getActorName(rootGoal);
	    		if (actorName.equals("") && rootGoal.getParent() == null) { 
	    			// is a root goal
	    			//TODO Do something
	    		}
	    	} else if (someObject instanceof dependency){
	    		//Do smth here???
	    		
	    	} else if (someObject instanceof actor) {
	    		
	    		actor a = (actor) someObject;
	    		//Remove quotations and spaces from the name of the actor
	    		String actorName = Computing.strip_quote(a.getName());
	    		actorName = actorName.replace(" ", ""); 
	    		
	    		//DEBUG
				System.out.println("Actor name: " + actorName);
				System.out.println("Actor name original: " + a.getName());
				//END DEBUG
	    		
    			//Get the root goals of the actor
    			EList goalList = a.getGoals();
	    		
	    		//Here we have an actor, create 3 files - process file,
	    		//the wsdl file and the wsdl file for the implementation of
	    		//its leaf-level goals
	    		
	    		//Create the WSDL interface for the actor-------------------------------------
    			
    			//Create the definition tag for the WSDL file
    			Definition interfaceDef = wf.createDefinition();
    			interfaceDef.setQName(new QName(WSDLConstants.WSDL_NAMESPACE_URI, actorName + "Interface"));
    			
    			//Set target namespace
    		    interfaceDef.setTargetNamespace(namespacePrefix + projectNamespace + actorName + "Interface/");
    		    interfaceDef.addNamespace("tns", namespacePrefix + projectNamespace + actorName + "Interface/");
    			
    			//Create WSDL file to store the interface for the actor
    			//Create resource
    			String interfaceFileName = getResourceName(someObject) + "Interface.wsdl";
    		    Resource interfaceResource = resourceSet.createResource(URI.createFileURI(interfaceFileName));
    		    resourceSet.getResources().add(partnerLinkResource);
    			
    			//Add the definition element to the resource
    			interfaceResource.getContents().add(interfaceDef);
    			
    			//Save the resource information
    			ResourceData interfaceData = 
    				new ResourceData(interfaceFileName, interfaceResource);
    			//Store the data
    			resourceList.add(interfaceData);
    			
    			//This is only part of the interface - based on its root-level goals, the
    			//other part is created based on incoming dependnecies
//	    		createActorInterfaceFile(someObject);
    			
    			//Create the portType for the actor
    			PortType interfacePT = wf.createPortType();
    			//Set the name of the portType
    			interfacePT.setQName(new QName(interfaceDef.getTargetNamespace(),actorName + "Interface"));
    			//Add the port type to the definitions in the WSDL file
    			interfaceDef.addPortType(interfacePT);
    			
    			//Agent's root goals are some of the services that the agent can provide
    			//Thus: add the corresponding operations/messages to the WSDL Inteface
    			//file for the actor
    			
    			//Iterate through root goals and create the operations, messages
    			for (int j =0; j < goalList.size(); j++) {
					goal rootGoal = (goal) goalList.get(j);
					//Create messages and operations for the goal in the actor WSDL interface
					addWSDLMsgAndOp(rootGoal, interfaceDef, interfacePT);
	    		}
	    		
    			//Create the WSDL for the web service implementing the leaf-level goals of the actor---------------
    			
    			//Create the definition tag for the WSDL file
    			Definition implDef = wf.createDefinition();
    			implDef.setQName(new QName(WSDLConstants.WSDL_NAMESPACE_URI, actorName + "Impl"));
    			
    			//Set target namespace
    		    implDef.setTargetNamespace(namespacePrefix + projectNamespace + actorName + "Impl/");
    		    implDef.addNamespace("tns", namespacePrefix + projectNamespace + actorName + "Impl/");
    			
    			//Create WSDL file to store the implementation for the actor
    			//Create resource
    			String implFileName = getResourceName(someObject) + "Impl.wsdl";
    		    Resource implResource = resourceSet.createResource(URI.createFileURI(implFileName));
    		    resourceSet.getResources().add(implResource);

    			//Add the definition element to the resource
    			implResource.getContents().add(implDef);
    			
    			//Save the resource information
    			ResourceData implData = 
    				new ResourceData(implFileName, implResource);
    			//Store the data
    			resourceList.add(implData);
    			
//    			Create the portType for the implementation WS
    			PortType implPT = wf.createPortType();
    			//Set the name of the portType
    			implPT.setQName(new QName(interfaceDef.getTargetNamespace(),actorName + "Impl"));
    			//Add the port type to the definitions in the WSDL file
    			implDef.addPortType(implPT);
				
				//END WSDL generation-----------------------------------------

    			//BPEL Generation
    			String process_filename = getResourceName(someObject) + ".bpel";
	    		URI bPELURI = URI.createFileURI(getResourceName(someObject) + ".bpel");
	    		// Create a resource for this file.
	    		BPELResourceImpl BPELRes = new BPELResourceImpl(bPELURI);
	    		
    			//Create a process - name it as [Actor]BusinessProcess
    			Process bpelProcess = pf.createProcess();
    			bpelProcess.setName(actorName + "Process");
    			//Set the target namespace for the process
    			bpelProcess.setTargetNamespace("http://Processes/" + actorName);
    			//Add BPEL process (the root element) to the resource
    			BPELRes.getContents().add(bpelProcess);
	    		
    			//Save the information to save the file later into a data structure
	    		ResourceData bpelData = 
	    			new ResourceData(process_filename, BPELRes);
	    		//Store the data
	    		resourceList.add(bpelData);
    			
    			//If the number of root goals inside the actor is 2 or more, create
    			//the extra flow to aggregate them.
    			if(goalList.size() > 1) {	
    				// More than one goal in actor.
    				Flow rootFlow = pf.createFlow();
    				//Name the flow with the goal name
    				rootFlow.setName(actorName + "Root");
    				//Add this flow to the process
    				bpelProcess.setActivity(rootFlow);
    				//Iterate through the root goals and add the corresponding
    				//BPEL code to the process
    	    		for (int j =0; j < goalList.size(); j++) {
    					goal rootGoal = (goal) goalList.get(j);
    	    			//Generate BPEL for the model rooted at rootGoal
    	    			outputGoal(bpelProcess, rootFlow, rootGoal, 
    	    					interfaceDef, interfacePT, 
    	    					implDef, implPT);
    	    		} 
    			} else {
    				//The actor only has one root goal
    				if(goalList.size() == 1){
    	    			goal rootGoal = (goal) goalList.get(0);
    	    			//Generate BPEL for the model rooted at rootGoal
    	    			outputGoal(bpelProcess, null, rootGoal, 
    	    					interfaceDef, interfacePT, 
    	    					implDef, implPT);
    	    		}
    			}
    			//DEBUG
    			System.out.println("The number of goals for the actor " + actorName + " is " +goalList.size());
    			//END DEBUG
	    	} 
	    }
		//Save all files
		
		saveAllResources();
	}
	
	//The main method called by Eclipse
	@SuppressWarnings("unchecked")
	public void convert(String input, String output) {
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put
			(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
		resourceSet.getPackageRegistry().put(GoalmodelPackage.eNS_URI, GoalmodelPackage.eINSTANCE);
		File file = new File(input);
		URI uri = file.isFile() ? URI.createFileURI(file.getAbsolutePath()): URI.createURI(input);		
		Resource resource = resourceSet.getResource(uri, true);
		output_file = output;
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("wsdl", new WSDLResourceFactoryImpl());
		generateProcessModel(resource);
	} 
}
