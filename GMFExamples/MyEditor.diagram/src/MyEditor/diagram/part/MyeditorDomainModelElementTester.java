package MyEditor.diagram.part;

import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * @generated
 */
public class MyeditorDomainModelElementTester extends PropertyTester {

	/**
	 * @generated
	 */
	public boolean test(Object receiver, String method, Object[] args,
			Object expectedValue) {
		if (false == receiver instanceof EObject) {
			return false;
		}
		EObject eObject = (EObject) receiver;
		EClass eClass = eObject.eClass();
		if (eClass == MyEditor.MyEditorPackage.eINSTANCE.getMyCanvas()) {
			return true;
		}
		if (eClass == MyEditor.MyEditorPackage.eINSTANCE.getBox()) {
			return true;
		}
		if (eClass == MyEditor.MyEditorPackage.eINSTANCE.getLine()) {
			return true;
		}
		return false;
	}

}
