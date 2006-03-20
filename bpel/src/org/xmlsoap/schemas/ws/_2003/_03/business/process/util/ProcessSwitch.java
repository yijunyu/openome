/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.xmlsoap.schemas.ws._2003._03.business.process.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.xmlsoap.schemas.ws._2003._03.business.process.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.xmlsoap.schemas.ws._2003._03.business.process.ProcessPackage
 * @generated
 */
public class ProcessSwitch {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ProcessPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessSwitch() {
		if (modelPackage == null) {
			modelPackage = ProcessPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public Object doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch((EClass)eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ProcessPackage.CASE_TYPE: {
				CaseType caseType = (CaseType)theEObject;
				Object result = caseCaseType(caseType);
				if (result == null) result = caseTActivityContainer(caseType);
				if (result == null) result = caseTExtensibleElements(caseType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessPackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				Object result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessPackage.PARTNER_LINK_TYPE: {
				PartnerLinkType partnerLinkType = (PartnerLinkType)theEObject;
				Object result = casePartnerLinkType(partnerLinkType);
				if (result == null) result = caseTExtensibleElements(partnerLinkType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessPackage.TACTIVITY: {
				TActivity tActivity = (TActivity)theEObject;
				Object result = caseTActivity(tActivity);
				if (result == null) result = caseTExtensibleElements(tActivity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessPackage.TACTIVITY_CONTAINER: {
				TActivityContainer tActivityContainer = (TActivityContainer)theEObject;
				Object result = caseTActivityContainer(tActivityContainer);
				if (result == null) result = caseTExtensibleElements(tActivityContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessPackage.TACTIVITY_OR_COMPENSATE_CONTAINER: {
				TActivityOrCompensateContainer tActivityOrCompensateContainer = (TActivityOrCompensateContainer)theEObject;
				Object result = caseTActivityOrCompensateContainer(tActivityOrCompensateContainer);
				if (result == null) result = caseTExtensibleElements(tActivityOrCompensateContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessPackage.TASSIGN: {
				TAssign tAssign = (TAssign)theEObject;
				Object result = caseTAssign(tAssign);
				if (result == null) result = caseTActivity(tAssign);
				if (result == null) result = caseTExtensibleElements(tAssign);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessPackage.TCATCH: {
				TCatch tCatch = (TCatch)theEObject;
				Object result = caseTCatch(tCatch);
				if (result == null) result = caseTActivityOrCompensateContainer(tCatch);
				if (result == null) result = caseTExtensibleElements(tCatch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessPackage.TCOMPENSATE: {
				TCompensate tCompensate = (TCompensate)theEObject;
				Object result = caseTCompensate(tCompensate);
				if (result == null) result = caseTActivity(tCompensate);
				if (result == null) result = caseTExtensibleElements(tCompensate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessPackage.TCOMPENSATION_HANDLER: {
				TCompensationHandler tCompensationHandler = (TCompensationHandler)theEObject;
				Object result = caseTCompensationHandler(tCompensationHandler);
				if (result == null) result = caseTActivityOrCompensateContainer(tCompensationHandler);
				if (result == null) result = caseTExtensibleElements(tCompensationHandler);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessPackage.TCOPY: {
				TCopy tCopy = (TCopy)theEObject;
				Object result = caseTCopy(tCopy);
				if (result == null) result = caseTExtensibleElements(tCopy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessPackage.TCORRELATION: {
				TCorrelation tCorrelation = (TCorrelation)theEObject;
				Object result = caseTCorrelation(tCorrelation);
				if (result == null) result = caseTExtensibleElements(tCorrelation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessPackage.TCORRELATIONS: {
				TCorrelations tCorrelations = (TCorrelations)theEObject;
				Object result = caseTCorrelations(tCorrelations);
				if (result == null) result = caseTExtensibleElements(tCorrelations);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessPackage.TCORRELATION_SET: {
				TCorrelationSet tCorrelationSet = (TCorrelationSet)theEObject;
				Object result = caseTCorrelationSet(tCorrelationSet);
				if (result == null) result = caseTExtensibleElements(tCorrelationSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessPackage.TCORRELATION_SETS: {
				TCorrelationSets tCorrelationSets = (TCorrelationSets)theEObject;
				Object result = caseTCorrelationSets(tCorrelationSets);
				if (result == null) result = caseTExtensibleElements(tCorrelationSets);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessPackage.TCORRELATIONS_WITH_PATTERN: {
				TCorrelationsWithPattern tCorrelationsWithPattern = (TCorrelationsWithPattern)theEObject;
				Object result = caseTCorrelationsWithPattern(tCorrelationsWithPattern);
				if (result == null) result = caseTExtensibleElements(tCorrelationsWithPattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessPackage.TCORRELATION_WITH_PATTERN: {
				TCorrelationWithPattern tCorrelationWithPattern = (TCorrelationWithPattern)theEObject;
				Object result = caseTCorrelationWithPattern(tCorrelationWithPattern);
				if (result == null) result = caseTCorrelation(tCorrelationWithPattern);
				if (result == null) result = caseTExtensibleElements(tCorrelationWithPattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessPackage.TEMPTY: {
				TEmpty tEmpty = (TEmpty)theEObject;
				Object result = caseTEmpty(tEmpty);
				if (result == null) result = caseTActivity(tEmpty);
				if (result == null) result = caseTExtensibleElements(tEmpty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessPackage.TEVENT_HANDLERS: {
				TEventHandlers tEventHandlers = (TEventHandlers)theEObject;
				Object result = caseTEventHandlers(tEventHandlers);
				if (result == null) result = caseTExtensibleElements(tEventHandlers);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessPackage.TEXTENSIBLE_ELEMENTS: {
				TExtensibleElements tExtensibleElements = (TExtensibleElements)theEObject;
				Object result = caseTExtensibleElements(tExtensibleElements);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessPackage.TFAULT_HANDLERS: {
				TFaultHandlers tFaultHandlers = (TFaultHandlers)theEObject;
				Object result = caseTFaultHandlers(tFaultHandlers);
				if (result == null) result = caseTExtensibleElements(tFaultHandlers);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessPackage.TFLOW: {
				TFlow tFlow = (TFlow)theEObject;
				Object result = caseTFlow(tFlow);
				if (result == null) result = caseTActivity(tFlow);
				if (result == null) result = caseTExtensibleElements(tFlow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessPackage.TFROM: {
				TFrom tFrom = (TFrom)theEObject;
				Object result = caseTFrom(tFrom);
				if (result == null) result = caseTExtensibleElements(tFrom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessPackage.TINVOKE: {
				TInvoke tInvoke = (TInvoke)theEObject;
				Object result = caseTInvoke(tInvoke);
				if (result == null) result = caseTActivity(tInvoke);
				if (result == null) result = caseTExtensibleElements(tInvoke);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessPackage.TLINK: {
				TLink tLink = (TLink)theEObject;
				Object result = caseTLink(tLink);
				if (result == null) result = caseTExtensibleElements(tLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessPackage.TLINKS: {
				TLinks tLinks = (TLinks)theEObject;
				Object result = caseTLinks(tLinks);
				if (result == null) result = caseTExtensibleElements(tLinks);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessPackage.TON_ALARM: {
				TOnAlarm tOnAlarm = (TOnAlarm)theEObject;
				Object result = caseTOnAlarm(tOnAlarm);
				if (result == null) result = caseTActivityContainer(tOnAlarm);
				if (result == null) result = caseTExtensibleElements(tOnAlarm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessPackage.TON_MESSAGE: {
				TOnMessage tOnMessage = (TOnMessage)theEObject;
				Object result = caseTOnMessage(tOnMessage);
				if (result == null) result = caseTExtensibleElements(tOnMessage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessPackage.TO_TYPE: {
				ToType toType = (ToType)theEObject;
				Object result = caseToType(toType);
				if (result == null) result = caseTFrom(toType);
				if (result == null) result = caseTExtensibleElements(toType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessPackage.TPARTNER: {
				TPartner tPartner = (TPartner)theEObject;
				Object result = caseTPartner(tPartner);
				if (result == null) result = caseTExtensibleElements(tPartner);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessPackage.TPARTNER_LINK: {
				TPartnerLink tPartnerLink = (TPartnerLink)theEObject;
				Object result = caseTPartnerLink(tPartnerLink);
				if (result == null) result = caseTExtensibleElements(tPartnerLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessPackage.TPARTNER_LINKS: {
				TPartnerLinks tPartnerLinks = (TPartnerLinks)theEObject;
				Object result = caseTPartnerLinks(tPartnerLinks);
				if (result == null) result = caseTExtensibleElements(tPartnerLinks);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessPackage.TPARTNERS: {
				TPartners tPartners = (TPartners)theEObject;
				Object result = caseTPartners(tPartners);
				if (result == null) result = caseTExtensibleElements(tPartners);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessPackage.TPICK: {
				TPick tPick = (TPick)theEObject;
				Object result = caseTPick(tPick);
				if (result == null) result = caseTActivity(tPick);
				if (result == null) result = caseTExtensibleElements(tPick);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessPackage.TPROCESS: {
				TProcess tProcess = (TProcess)theEObject;
				Object result = caseTProcess(tProcess);
				if (result == null) result = caseTExtensibleElements(tProcess);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessPackage.TRECEIVE: {
				TReceive tReceive = (TReceive)theEObject;
				Object result = caseTReceive(tReceive);
				if (result == null) result = caseTActivity(tReceive);
				if (result == null) result = caseTExtensibleElements(tReceive);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessPackage.TREPLY: {
				TReply tReply = (TReply)theEObject;
				Object result = caseTReply(tReply);
				if (result == null) result = caseTActivity(tReply);
				if (result == null) result = caseTExtensibleElements(tReply);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessPackage.TSCOPE: {
				TScope tScope = (TScope)theEObject;
				Object result = caseTScope(tScope);
				if (result == null) result = caseTActivity(tScope);
				if (result == null) result = caseTExtensibleElements(tScope);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessPackage.TSEQUENCE: {
				TSequence tSequence = (TSequence)theEObject;
				Object result = caseTSequence(tSequence);
				if (result == null) result = caseTActivity(tSequence);
				if (result == null) result = caseTExtensibleElements(tSequence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessPackage.TSOURCE: {
				TSource tSource = (TSource)theEObject;
				Object result = caseTSource(tSource);
				if (result == null) result = caseTExtensibleElements(tSource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessPackage.TSWITCH: {
				TSwitch tSwitch = (TSwitch)theEObject;
				Object result = caseTSwitch(tSwitch);
				if (result == null) result = caseTActivity(tSwitch);
				if (result == null) result = caseTExtensibleElements(tSwitch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessPackage.TTARGET: {
				TTarget tTarget = (TTarget)theEObject;
				Object result = caseTTarget(tTarget);
				if (result == null) result = caseTExtensibleElements(tTarget);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessPackage.TTERMINATE: {
				TTerminate tTerminate = (TTerminate)theEObject;
				Object result = caseTTerminate(tTerminate);
				if (result == null) result = caseTActivity(tTerminate);
				if (result == null) result = caseTExtensibleElements(tTerminate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessPackage.TTHROW: {
				TThrow tThrow = (TThrow)theEObject;
				Object result = caseTThrow(tThrow);
				if (result == null) result = caseTActivity(tThrow);
				if (result == null) result = caseTExtensibleElements(tThrow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessPackage.TVARIABLE: {
				TVariable tVariable = (TVariable)theEObject;
				Object result = caseTVariable(tVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessPackage.TVARIABLES: {
				TVariables tVariables = (TVariables)theEObject;
				Object result = caseTVariables(tVariables);
				if (result == null) result = caseTExtensibleElements(tVariables);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessPackage.TWAIT: {
				TWait tWait = (TWait)theEObject;
				Object result = caseTWait(tWait);
				if (result == null) result = caseTActivity(tWait);
				if (result == null) result = caseTExtensibleElements(tWait);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessPackage.TWHILE: {
				TWhile tWhile = (TWhile)theEObject;
				Object result = caseTWhile(tWhile);
				if (result == null) result = caseTActivity(tWhile);
				if (result == null) result = caseTExtensibleElements(tWhile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Case Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Case Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCaseType(CaseType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Partner Link Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Partner Link Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePartnerLinkType(PartnerLinkType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>TActivity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>TActivity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTActivity(TActivity object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>TActivity Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>TActivity Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTActivityContainer(TActivityContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>TActivity Or Compensate Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>TActivity Or Compensate Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTActivityOrCompensateContainer(TActivityOrCompensateContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>TAssign</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>TAssign</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTAssign(TAssign object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>TCatch</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>TCatch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTCatch(TCatch object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>TCompensate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>TCompensate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTCompensate(TCompensate object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>TCompensation Handler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>TCompensation Handler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTCompensationHandler(TCompensationHandler object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>TCopy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>TCopy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTCopy(TCopy object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>TCorrelation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>TCorrelation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTCorrelation(TCorrelation object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>TCorrelations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>TCorrelations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTCorrelations(TCorrelations object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>TCorrelation Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>TCorrelation Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTCorrelationSet(TCorrelationSet object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>TCorrelation Sets</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>TCorrelation Sets</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTCorrelationSets(TCorrelationSets object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>TCorrelations With Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>TCorrelations With Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTCorrelationsWithPattern(TCorrelationsWithPattern object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>TCorrelation With Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>TCorrelation With Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTCorrelationWithPattern(TCorrelationWithPattern object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>TEmpty</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>TEmpty</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTEmpty(TEmpty object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>TEvent Handlers</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>TEvent Handlers</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTEventHandlers(TEventHandlers object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>TExtensible Elements</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>TExtensible Elements</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTExtensibleElements(TExtensibleElements object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>TFault Handlers</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>TFault Handlers</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTFaultHandlers(TFaultHandlers object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>TFlow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>TFlow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTFlow(TFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>TFrom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>TFrom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTFrom(TFrom object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>TInvoke</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>TInvoke</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTInvoke(TInvoke object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>TLink</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>TLink</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTLink(TLink object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>TLinks</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>TLinks</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTLinks(TLinks object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>TOn Alarm</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>TOn Alarm</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTOnAlarm(TOnAlarm object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>TOn Message</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>TOn Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTOnMessage(TOnMessage object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>To Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>To Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseToType(ToType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>TPartner</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>TPartner</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTPartner(TPartner object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>TPartner Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>TPartner Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTPartnerLink(TPartnerLink object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>TPartner Links</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>TPartner Links</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTPartnerLinks(TPartnerLinks object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>TPartners</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>TPartners</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTPartners(TPartners object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>TPick</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>TPick</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTPick(TPick object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>TProcess</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>TProcess</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTProcess(TProcess object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>TReceive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>TReceive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTReceive(TReceive object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>TReply</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>TReply</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTReply(TReply object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>TScope</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>TScope</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTScope(TScope object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>TSequence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>TSequence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTSequence(TSequence object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>TSource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>TSource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTSource(TSource object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>TSwitch</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>TSwitch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTSwitch(TSwitch object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>TTarget</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>TTarget</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTTarget(TTarget object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>TTerminate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>TTerminate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTTerminate(TTerminate object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>TThrow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>TThrow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTThrow(TThrow object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>TVariable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>TVariable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTVariable(TVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>TVariables</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>TVariables</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTVariables(TVariables object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>TWait</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>TWait</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTWait(TWait object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>TWhile</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>TWhile</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTWhile(TWhile object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public Object defaultCase(EObject object) {
		return null;
	}

} //ProcessSwitch
