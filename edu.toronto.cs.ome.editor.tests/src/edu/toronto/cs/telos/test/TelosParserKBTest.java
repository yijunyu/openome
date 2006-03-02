package edu.toronto.cs.telos.test;

import jtelos.KB;
import edu.toronto.cs.telos.TelosParserIndividual;
import edu.toronto.cs.telos.TelosParserKB;

public class TelosParserKBTest extends TelosTest {

	public TelosParserKBTest() {
		super("test/edu.toronto.cs.telos.TelosParserKB", ".tel");
	}
	
	public static void main(String[] args) {
		junit.textui.TestRunner.run(TelosParserKBTest.class);
	}

	/*
	 * Test method for 'edu.toronto.cs.telos.TelosParserKB.TelosParserKB(String, String)'
	 */
	public void testTelosParserKB() {

	}

	/*
	 * Test method for 'edu.toronto.cs.telos.TelosParserKB.name()'
	 */
	public void testName() {

	}

	/*
	 * Test method for 'edu.toronto.cs.telos.TelosParserKB.size()'
	 */
	public void testSize() {

	}

	/*
	 * Test method for 'edu.toronto.cs.telos.TelosParserKB.containsOnlyBuiltIns()'
	 */
	public void testContainsOnlyBuiltIns() {

	}

	/*
	 * Test method for 'edu.toronto.cs.telos.TelosParserKB.isEmpty()'
	 */
	public void testIsEmpty() {

	}

	/*
	 * Test method for 'edu.toronto.cs.telos.TelosParserKB.attributes()'
	 */
	public void testAttributes() {

	}

	/*
	 * Test method for 'edu.toronto.cs.telos.TelosParserKB.individuals()'
	 */
	public void testIndividuals() {

	}

	/*
	 * Test method for 'edu.toronto.cs.telos.TelosParserKB.builtIns()'
	 */
	public void testBuiltIns() {

	}

	/*
	 * Test method for 'edu.toronto.cs.telos.TelosParserKB.attribute(String)'
	 */
	public void testAttribute() {

	}

	/*
	 * Test method for 'edu.toronto.cs.telos.TelosParserKB.individual(String)'
	 */
	public void testIndividual() {

	}

	public void testAll(KB kb) {
		testNewAttribute(kb);
	}
	
	public final String name = "name";
	public final String namecat[] = {name};
	/*
	 * Test method for 'edu.toronto.cs.telos.TelosParserKB.newAttribute(Proposition, String[], String, PropositionOrPrimitive)'
	 */
	public void testNewAttribute(KB _kb) {
		TelosParserKB kb = (TelosParserKB) _kb;
		TelosParserIndividual in = new TelosParserIndividual(testDir, testDir, null, null, null);
		kb.newAttribute(in, namecat, name, null);
	}

	/*
	 * Test method for 'edu.toronto.cs.telos.TelosParserKB.newIndividual(String, int)'
	 */
	public void testNewIndividual() {

	}

	/*
	 * Test method for 'edu.toronto.cs.telos.TelosParserKB.removeAndDeleteProposition(Proposition)'
	 */
	public void testRemoveAndDeleteProposition() {

	}

	/*
	 * Test method for 'edu.toronto.cs.telos.TelosParserKB.load(String)'
	 */
	public void testLoad() {

	}

	/*
	 * Test method for 'edu.toronto.cs.telos.TelosParserKB.save()'
	 */
	public void testSave() {

	}

	/*
	 * Test method for 'edu.toronto.cs.telos.TelosParserKB.closeKB()'
	 */
	public void testCloseKB() {

	}

	/*
	 * Test method for 'edu.toronto.cs.telos.TelosParserKB.wipe()'
	 */
	public void testWipe() {

	}

	/*
	 * Test method for 'edu.toronto.cs.telos.TelosParserKB.RETELL(String, String)'
	 */
	public void testRETELL() {

	}

	/*
	 * Test method for 'edu.toronto.cs.telos.TelosParserKB.fileRETELL(String, String)'
	 */
	public void testFileRETELL() {

	}

	/*
	 * Test method for 'edu.toronto.cs.telos.TelosParserKB.TELL(String)'
	 */
	public void testTELL() {

	}

	/*
	 * Test method for 'edu.toronto.cs.telos.TelosParserKB.fileTELL(String)'
	 */
	public void testFileTELL() {

	}

	/*
	 * Test method for 'edu.toronto.cs.telos.TelosParserKB.UNTELL(String)'
	 */
	public void testUNTELL() {

	}

	/*
	 * Test method for 'edu.toronto.cs.telos.TelosParserKB.fileUNTELL(String)'
	 */
	public void testFileUNTELL() {

	}

}
