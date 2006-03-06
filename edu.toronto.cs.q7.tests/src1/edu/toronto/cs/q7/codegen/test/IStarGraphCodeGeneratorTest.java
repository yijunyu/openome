package edu.toronto.cs.q7.codegen.test;

import junit.framework.Assert;
import junit.framework.TestCase;
import edu.toronto.cs.q7.codegen.IStarGraphCodeGenerator;
import edu.toronto.cs.q7.model.Advice;

public class IStarGraphCodeGeneratorTest extends TestCase {

	public static void main(String[] args) {
		junit.textui.TestRunner.run(IStarGraphCodeGeneratorTest.class);
	}
	/*
	 * Test method for 'edu.toronto.cs.q7.codegen.IStarGraphCodeGenerator.generateGoalModel(String)'
	 */
	public void testPreprocess_abbreviations() {
		if (System.getProperty("q7: expand .. placeholders into parent names")==null)
			return;
		String fName = "";
		Advice parent = new Advice(fName, fName, "parent", fName, fName, null, null, null, fName, fName);
		Advice child = new Advice(fName, fName, ".. child", fName, fName, null, null, null, fName, fName);
		IStarGraphCodeGenerator cg = new IStarGraphCodeGenerator(null); 
		cg.preprocess_abbreviations(parent, child);
		Assert.assertTrue("replaced", child.e.why.equals("parent child"));
		child = new Advice(fName, fName, ". child", fName, fName, null, null, null, fName, fName);
		cg.preprocess_abbreviations(parent, child);
		Assert.assertTrue("replaced", child.e.why.equals(". child"));
		child = new Advice(fName, fName, "child .. child", fName, fName, null, null, null, fName, fName);
		cg.preprocess_abbreviations(parent, child);
		Assert.assertTrue("replaced", child.e.why.equals("child parent child"));
		child = new Advice(fName, fName, "child .. child .. child", fName, fName, null, null, null, fName, fName);
		cg.preprocess_abbreviations(parent, child);
		Assert.assertTrue("replaced", child.e.why.equals("child parent child parent child"));
	}

	
	/*
	 * Test method for 'edu.toronto.cs.q7.codegen.IStarGraphCodeGenerator.generateGoalModel(String)'
	 */
	public void testGenerateGoalModelString() {

	}

	/*
	 * Test method for 'edu.toronto.cs.q7.codegen.IStarGraphCodeGenerator.getMetaModel()'
	 */
	public void testGetMetaModel() {

	}

	/*
	 * Test method for 'edu.toronto.cs.q7.codegen.IStarGraphCodeGenerator.generateGoalModel(Advice, Advice)'
	 */
	public void testGenerateGoalModelAdviceAdvice() {

	}

	/*
	 * Test method for 'edu.toronto.cs.q7.codegen.IStarGraphCodeGenerator.generateWhy(Advice, Advice)'
	 */
	public void testGenerateWhy() {

	}

	/*
	 * Test method for 'edu.toronto.cs.q7.codegen.IStarGraphCodeGenerator.IStarGraphCodeGenerator(ArrayList)'
	 */
	public void testIStarGraphCodeGenerator() {

	}

	/*
	 * Test method for 'edu.toronto.cs.q7.codegen.IStarGraphCodeGenerator.generateGoalModelForElements(Advice, Advice)'
	 */
	public void testGenerateGoalModelForElements() {

	}

	/*
	 * Test method for 'edu.toronto.cs.q7.codegen.IStarGraphCodeGenerator.create_agent_for_new_who(Advice, Effect)'
	 */
	public void testCreate_agent_for_new_who() {

	}

	/*
	 * Test method for 'edu.toronto.cs.q7.codegen.IStarGraphCodeGenerator.create_agent_for_new_who_inherit(Advice, Advice)'
	 */
	public void testCreate_agent_for_new_who_inherit() {

	}

	/*
	 * Test method for 'edu.toronto.cs.q7.codegen.IStarGraphCodeGenerator.create_dependencies()'
	 */
	public void testCreate_dependencies() {

	}

	/*
	 * Test method for 'edu.toronto.cs.q7.codegen.IStarGraphCodeGenerator.create_elements_and_links(String)'
	 */
	public void testCreate_elements_and_links() {

	}

	/*
	 * Test method for 'edu.toronto.cs.q7.codegen.IStarGraphCodeGenerator.mark_parent_goal_of_softgoal_as_softgoal()'
	 */
	public void testMark_parent_goal_of_softgoal_as_softgoal() {

	}

	/*
	 * Test method for 'edu.toronto.cs.q7.codegen.IStarGraphCodeGenerator.create_aspect()'
	 */
	public void testCreate_aspect() {

	}

	/*
	 * Test method for 'edu.toronto.cs.q7.codegen.IStarGraphCodeGenerator.mark_subgoal_of_task_as_task()'
	 */
	public void testMark_subgoal_of_task_as_task() {

	}

	/*
	 * Test method for 'edu.toronto.cs.q7.codegen.IStarGraphCodeGenerator.get_goal(String, String, String)'
	 */
	public void testGet_goal() {

	}

	/*
	 * Test method for 'edu.toronto.cs.q7.codegen.IStarGraphCodeGenerator.add_link(IStarElement, IStarElement, String)'
	 */
	public void testAdd_link() {

	}

	/*
	 * Test method for 'edu.toronto.cs.q7.codegen.TelosCodeGenerator.TelosCodeGenerator(ArrayList)'
	 */
	public void testTelosCodeGenerator() {

	}

	/*
	 * Test method for 'edu.toronto.cs.q7.codegen.TelosCodeGenerator.strip_quote(String)'
	 */
	public void testStrip_quote() {

	}

	/*
	 * Test method for 'edu.toronto.cs.q7.codegen.TelosCodeGenerator.agent_context(String)'
	 */
	public void testAgent_context() {

	}

	/*
	 * Test method for 'edu.toronto.cs.q7.codegen.TelosCodeGenerator.get_goal_name(Effect)'
	 */
	public void testGet_goal_name() {

	}
	
}
