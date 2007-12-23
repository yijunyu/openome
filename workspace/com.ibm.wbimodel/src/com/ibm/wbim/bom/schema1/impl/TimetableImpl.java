/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1.impl;

import com.ibm.wbim.bom.schema1.ExemptionPeriodType;
import com.ibm.wbim.bom.schema1.ExtendedAttributes;
import com.ibm.wbim.bom.schema1.RecurringTimeIntervalType;
import com.ibm.wbim.bom.schema1.Schema1Package;
import com.ibm.wbim.bom.schema1.Timetable;

import java.math.BigInteger;

import java.util.Collection;

import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Timetable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.TimetableImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.TimetableImpl#getRecurringTimeInterval <em>Recurring Time Interval</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.TimetableImpl#getExemptionPeriod <em>Exemption Period</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.TimetableImpl#getExtendedAttributes <em>Extended Attributes</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.TimetableImpl#getBeginingOn <em>Begining On</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.TimetableImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.TimetableImpl#getNumberOfTimesToRepeat <em>Number Of Times To Repeat</em>}</li>
 *   <li>{@link com.ibm.wbim.bom.schema1.impl.TimetableImpl#getRepetitionPeriod <em>Repetition Period</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TimetableImpl extends EObjectImpl implements Timetable {
	/**
	 * The default value of the '{@link #getDocumentation() <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected static final String DOCUMENTATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDocumentation() <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected String documentation = DOCUMENTATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRecurringTimeInterval() <em>Recurring Time Interval</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecurringTimeInterval()
	 * @generated
	 * @ordered
	 */
	protected EList recurringTimeInterval;

	/**
	 * The cached value of the '{@link #getExemptionPeriod() <em>Exemption Period</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExemptionPeriod()
	 * @generated
	 * @ordered
	 */
	protected EList exemptionPeriod;

	/**
	 * The cached value of the '{@link #getExtendedAttributes() <em>Extended Attributes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendedAttributes()
	 * @generated
	 * @ordered
	 */
	protected ExtendedAttributes extendedAttributes;

	/**
	 * The default value of the '{@link #getBeginingOn() <em>Begining On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeginingOn()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar BEGINING_ON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBeginingOn() <em>Begining On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeginingOn()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar beginingOn = BEGINING_ON_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberOfTimesToRepeat() <em>Number Of Times To Repeat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfTimesToRepeat()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger NUMBER_OF_TIMES_TO_REPEAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumberOfTimesToRepeat() <em>Number Of Times To Repeat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfTimesToRepeat()
	 * @generated
	 * @ordered
	 */
	protected BigInteger numberOfTimesToRepeat = NUMBER_OF_TIMES_TO_REPEAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getRepetitionPeriod() <em>Repetition Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepetitionPeriod()
	 * @generated
	 * @ordered
	 */
	protected static final Duration REPETITION_PERIOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRepetitionPeriod() <em>Repetition Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepetitionPeriod()
	 * @generated
	 * @ordered
	 */
	protected Duration repetitionPeriod = REPETITION_PERIOD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimetableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return Schema1Package.Literals.TIMETABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDocumentation() {
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentation(String newDocumentation) {
		String oldDocumentation = documentation;
		documentation = newDocumentation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.TIMETABLE__DOCUMENTATION, oldDocumentation, documentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getRecurringTimeInterval() {
		if (recurringTimeInterval == null) {
			recurringTimeInterval = new EObjectContainmentEList(RecurringTimeIntervalType.class, this, Schema1Package.TIMETABLE__RECURRING_TIME_INTERVAL);
		}
		return recurringTimeInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getExemptionPeriod() {
		if (exemptionPeriod == null) {
			exemptionPeriod = new EObjectContainmentEList(ExemptionPeriodType.class, this, Schema1Package.TIMETABLE__EXEMPTION_PERIOD);
		}
		return exemptionPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendedAttributes getExtendedAttributes() {
		return extendedAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtendedAttributes(ExtendedAttributes newExtendedAttributes, NotificationChain msgs) {
		ExtendedAttributes oldExtendedAttributes = extendedAttributes;
		extendedAttributes = newExtendedAttributes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Schema1Package.TIMETABLE__EXTENDED_ATTRIBUTES, oldExtendedAttributes, newExtendedAttributes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtendedAttributes(ExtendedAttributes newExtendedAttributes) {
		if (newExtendedAttributes != extendedAttributes) {
			NotificationChain msgs = null;
			if (extendedAttributes != null)
				msgs = ((InternalEObject)extendedAttributes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Schema1Package.TIMETABLE__EXTENDED_ATTRIBUTES, null, msgs);
			if (newExtendedAttributes != null)
				msgs = ((InternalEObject)newExtendedAttributes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Schema1Package.TIMETABLE__EXTENDED_ATTRIBUTES, null, msgs);
			msgs = basicSetExtendedAttributes(newExtendedAttributes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.TIMETABLE__EXTENDED_ATTRIBUTES, newExtendedAttributes, newExtendedAttributes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getBeginingOn() {
		return beginingOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBeginingOn(XMLGregorianCalendar newBeginingOn) {
		XMLGregorianCalendar oldBeginingOn = beginingOn;
		beginingOn = newBeginingOn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.TIMETABLE__BEGINING_ON, oldBeginingOn, beginingOn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.TIMETABLE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getNumberOfTimesToRepeat() {
		return numberOfTimesToRepeat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfTimesToRepeat(BigInteger newNumberOfTimesToRepeat) {
		BigInteger oldNumberOfTimesToRepeat = numberOfTimesToRepeat;
		numberOfTimesToRepeat = newNumberOfTimesToRepeat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.TIMETABLE__NUMBER_OF_TIMES_TO_REPEAT, oldNumberOfTimesToRepeat, numberOfTimesToRepeat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration getRepetitionPeriod() {
		return repetitionPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepetitionPeriod(Duration newRepetitionPeriod) {
		Duration oldRepetitionPeriod = repetitionPeriod;
		repetitionPeriod = newRepetitionPeriod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Schema1Package.TIMETABLE__REPETITION_PERIOD, oldRepetitionPeriod, repetitionPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Schema1Package.TIMETABLE__RECURRING_TIME_INTERVAL:
				return ((InternalEList)getRecurringTimeInterval()).basicRemove(otherEnd, msgs);
			case Schema1Package.TIMETABLE__EXEMPTION_PERIOD:
				return ((InternalEList)getExemptionPeriod()).basicRemove(otherEnd, msgs);
			case Schema1Package.TIMETABLE__EXTENDED_ATTRIBUTES:
				return basicSetExtendedAttributes(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Schema1Package.TIMETABLE__DOCUMENTATION:
				return getDocumentation();
			case Schema1Package.TIMETABLE__RECURRING_TIME_INTERVAL:
				return getRecurringTimeInterval();
			case Schema1Package.TIMETABLE__EXEMPTION_PERIOD:
				return getExemptionPeriod();
			case Schema1Package.TIMETABLE__EXTENDED_ATTRIBUTES:
				return getExtendedAttributes();
			case Schema1Package.TIMETABLE__BEGINING_ON:
				return getBeginingOn();
			case Schema1Package.TIMETABLE__NAME:
				return getName();
			case Schema1Package.TIMETABLE__NUMBER_OF_TIMES_TO_REPEAT:
				return getNumberOfTimesToRepeat();
			case Schema1Package.TIMETABLE__REPETITION_PERIOD:
				return getRepetitionPeriod();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Schema1Package.TIMETABLE__DOCUMENTATION:
				setDocumentation((String)newValue);
				return;
			case Schema1Package.TIMETABLE__RECURRING_TIME_INTERVAL:
				getRecurringTimeInterval().clear();
				getRecurringTimeInterval().addAll((Collection)newValue);
				return;
			case Schema1Package.TIMETABLE__EXEMPTION_PERIOD:
				getExemptionPeriod().clear();
				getExemptionPeriod().addAll((Collection)newValue);
				return;
			case Schema1Package.TIMETABLE__EXTENDED_ATTRIBUTES:
				setExtendedAttributes((ExtendedAttributes)newValue);
				return;
			case Schema1Package.TIMETABLE__BEGINING_ON:
				setBeginingOn((XMLGregorianCalendar)newValue);
				return;
			case Schema1Package.TIMETABLE__NAME:
				setName((String)newValue);
				return;
			case Schema1Package.TIMETABLE__NUMBER_OF_TIMES_TO_REPEAT:
				setNumberOfTimesToRepeat((BigInteger)newValue);
				return;
			case Schema1Package.TIMETABLE__REPETITION_PERIOD:
				setRepetitionPeriod((Duration)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case Schema1Package.TIMETABLE__DOCUMENTATION:
				setDocumentation(DOCUMENTATION_EDEFAULT);
				return;
			case Schema1Package.TIMETABLE__RECURRING_TIME_INTERVAL:
				getRecurringTimeInterval().clear();
				return;
			case Schema1Package.TIMETABLE__EXEMPTION_PERIOD:
				getExemptionPeriod().clear();
				return;
			case Schema1Package.TIMETABLE__EXTENDED_ATTRIBUTES:
				setExtendedAttributes((ExtendedAttributes)null);
				return;
			case Schema1Package.TIMETABLE__BEGINING_ON:
				setBeginingOn(BEGINING_ON_EDEFAULT);
				return;
			case Schema1Package.TIMETABLE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Schema1Package.TIMETABLE__NUMBER_OF_TIMES_TO_REPEAT:
				setNumberOfTimesToRepeat(NUMBER_OF_TIMES_TO_REPEAT_EDEFAULT);
				return;
			case Schema1Package.TIMETABLE__REPETITION_PERIOD:
				setRepetitionPeriod(REPETITION_PERIOD_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Schema1Package.TIMETABLE__DOCUMENTATION:
				return DOCUMENTATION_EDEFAULT == null ? documentation != null : !DOCUMENTATION_EDEFAULT.equals(documentation);
			case Schema1Package.TIMETABLE__RECURRING_TIME_INTERVAL:
				return recurringTimeInterval != null && !recurringTimeInterval.isEmpty();
			case Schema1Package.TIMETABLE__EXEMPTION_PERIOD:
				return exemptionPeriod != null && !exemptionPeriod.isEmpty();
			case Schema1Package.TIMETABLE__EXTENDED_ATTRIBUTES:
				return extendedAttributes != null;
			case Schema1Package.TIMETABLE__BEGINING_ON:
				return BEGINING_ON_EDEFAULT == null ? beginingOn != null : !BEGINING_ON_EDEFAULT.equals(beginingOn);
			case Schema1Package.TIMETABLE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Schema1Package.TIMETABLE__NUMBER_OF_TIMES_TO_REPEAT:
				return NUMBER_OF_TIMES_TO_REPEAT_EDEFAULT == null ? numberOfTimesToRepeat != null : !NUMBER_OF_TIMES_TO_REPEAT_EDEFAULT.equals(numberOfTimesToRepeat);
			case Schema1Package.TIMETABLE__REPETITION_PERIOD:
				return REPETITION_PERIOD_EDEFAULT == null ? repetitionPeriod != null : !REPETITION_PERIOD_EDEFAULT.equals(repetitionPeriod);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (documentation: ");
		result.append(documentation);
		result.append(", beginingOn: ");
		result.append(beginingOn);
		result.append(", name: ");
		result.append(name);
		result.append(", numberOfTimesToRepeat: ");
		result.append(numberOfTimesToRepeat);
		result.append(", repetitionPeriod: ");
		result.append(repetitionPeriod);
		result.append(')');
		return result.toString();
	}

} //TimetableImpl
