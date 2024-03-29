/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package edu.toronto.cs.openome_model.validation;

import edu.toronto.cs.openome_model.EvaluationLabel;
import edu.toronto.cs.openome_model.LabelBag;
import edu.toronto.cs.openome_model.Intention;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link edu.toronto.cs.openome_model.HumanJudgment}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface HumanJudgmentValidator {
	boolean validate();

	boolean validateLabelBagIntentions(EList<Intention> value);
	boolean validateLabelBagEvalLabels(EList<EvaluationLabel> value);
	boolean validateResultLabel(EvaluationLabel value);
	boolean validateEnabled(boolean value);
	boolean validateLabelBag(LabelBag value);

	boolean validateToResolve(boolean value);
	boolean validateIsPositive(boolean value);
	boolean validateIsNegative(boolean value);
	boolean validateHasFullPostive(boolean value);
	boolean validateHasFullNegative(boolean value);
	boolean validateHasUnknown(boolean value);
	boolean validateHasConflict(boolean value);
	boolean validateIsUnknown(boolean value);
	boolean validateIsConflict(boolean value);
}
