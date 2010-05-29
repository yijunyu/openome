/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package edu.toronto.cs.openome_model.validation;

import edu.toronto.cs.openome_model.Role;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link edu.toronto.cs.openome_model.Position}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface PositionValidator {
	boolean validate();

	boolean validateCovers(EList<Role> value);
}
