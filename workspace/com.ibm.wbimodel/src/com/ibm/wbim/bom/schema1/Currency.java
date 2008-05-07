/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wbim.bom.schema1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Currency</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Modeler supported currencies
 * <!-- end-model-doc -->
 * @see com.ibm.wbim.bom.schema1.Schema1Package#getCurrency()
 * @model extendedMetaData="name='Currency'"
 * @generated
 */
public enum Currency implements Enumerator {
	/**
	 * The '<em><b>AED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AED_VALUE
	 * @generated
	 * @ordered
	 */
	AED(0, "AED", "AED"),
	/**
	 * The '<em><b>ALL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALL_VALUE
	 * @generated
	 * @ordered
	 */
	ALL(1, "ALL", "ALL"),
	/**
	 * The '<em><b>ARS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARS_VALUE
	 * @generated
	 * @ordered
	 */
	ARS(2, "ARS", "ARS"),
	/**
	 * The '<em><b>AUD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUD_VALUE
	 * @generated
	 * @ordered
	 */
	AUD(3, "AUD", "AUD"),
	/**
	 * The '<em><b>BAM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BAM_VALUE
	 * @generated
	 * @ordered
	 */
	BAM(4, "BAM", "BAM"),
	/**
	 * The '<em><b>BGL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BGL_VALUE
	 * @generated
	 * @ordered
	 */
	BGL(5, "BGL", "BGL"),
	/**
	 * The '<em><b>BHD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BHD_VALUE
	 * @generated
	 * @ordered
	 */
	BHD(6, "BHD", "BHD"),
	/**
	 * The '<em><b>BOB</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOB_VALUE
	 * @generated
	 * @ordered
	 */
	BOB(7, "BOB", "BOB"),
	/**
	 * The '<em><b>BRL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BRL_VALUE
	 * @generated
	 * @ordered
	 */
	BRL(8, "BRL", "BRL"),
	/**
	 * The '<em><b>BSD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BSD_VALUE
	 * @generated
	 * @ordered
	 */
	BSD(9, "BSD", "BSD"),
	/**
	 * The '<em><b>BYB</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BYB_VALUE
	 * @generated
	 * @ordered
	 */
	BYB(10, "BYB", "BYB"),
	/**
	 * The '<em><b>CAD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CAD_VALUE
	 * @generated
	 * @ordered
	 */
	CAD(11, "CAD", "CAD"),
	/**
	 * The '<em><b>CHF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHF_VALUE
	 * @generated
	 * @ordered
	 */
	CHF(12, "CHF", "CHF"),
	/**
	 * The '<em><b>CLP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLP_VALUE
	 * @generated
	 * @ordered
	 */
	CLP(13, "CLP", "CLP"),
	/**
	 * The '<em><b>CNY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CNY_VALUE
	 * @generated
	 * @ordered
	 */
	CNY(14, "CNY", "CNY"),
	/**
	 * The '<em><b>COP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COP_VALUE
	 * @generated
	 * @ordered
	 */
	COP(15, "COP", "COP"),
	/**
	 * The '<em><b>CRC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CRC_VALUE
	 * @generated
	 * @ordered
	 */
	CRC(16, "CRC", "CRC"),
	/**
	 * The '<em><b>CZK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CZK_VALUE
	 * @generated
	 * @ordered
	 */
	CZK(17, "CZK", "CZK"),
	/**
	 * The '<em><b>DKK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DKK_VALUE
	 * @generated
	 * @ordered
	 */
	DKK(18, "DKK", "DKK"),
	/**
	 * The '<em><b>DOP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOP_VALUE
	 * @generated
	 * @ordered
	 */
	DOP(19, "DOP", "DOP"),
	/**
	 * The '<em><b>DZD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DZD_VALUE
	 * @generated
	 * @ordered
	 */
	DZD(20, "DZD", "DZD"),
	/**
	 * The '<em><b>EEK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EEK_VALUE
	 * @generated
	 * @ordered
	 */
	EEK(21, "EEK", "EEK"),
	/**
	 * The '<em><b>EGP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EGP_VALUE
	 * @generated
	 * @ordered
	 */
	EGP(22, "EGP", "EGP"),
	/**
	 * The '<em><b>EUR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EUR_VALUE
	 * @generated
	 * @ordered
	 */
	EUR(23, "EUR", "EUR"),
	/**
	 * The '<em><b>GBP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GBP_VALUE
	 * @generated
	 * @ordered
	 */
	GBP(24, "GBP", "GBP"),
	/**
	 * The '<em><b>HKD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HKD_VALUE
	 * @generated
	 * @ordered
	 */
	HKD(25, "HKD", "HKD"),
	/**
	 * The '<em><b>HNL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HNL_VALUE
	 * @generated
	 * @ordered
	 */
	HNL(26, "HNL", "HNL"),
	/**
	 * The '<em><b>HRK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HRK_VALUE
	 * @generated
	 * @ordered
	 */
	HRK(27, "HRK", "HRK"),
	/**
	 * The '<em><b>HUF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HUF_VALUE
	 * @generated
	 * @ordered
	 */
	HUF(28, "HUF", "HUF"),
	/**
	 * The '<em><b>IDR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IDR_VALUE
	 * @generated
	 * @ordered
	 */
	IDR(29, "IDR", "IDR"),
	/**
	 * The '<em><b>ILS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ILS_VALUE
	 * @generated
	 * @ordered
	 */
	ILS(30, "ILS", "ILS"),
	/**
	 * The '<em><b>INR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INR_VALUE
	 * @generated
	 * @ordered
	 */
	INR(31, "INR", "INR"),
	/**
	 * The '<em><b>ISK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ISK_VALUE
	 * @generated
	 * @ordered
	 */
	ISK(32, "ISK", "ISK"),
	/**
	 * The '<em><b>JOD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JOD_VALUE
	 * @generated
	 * @ordered
	 */
	JOD(33, "JOD", "JOD"),
	/**
	 * The '<em><b>JPY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JPY_VALUE
	 * @generated
	 * @ordered
	 */
	JPY(34, "JPY", "JPY"),
	/**
	 * The '<em><b>KRW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KRW_VALUE
	 * @generated
	 * @ordered
	 */
	KRW(35, "KRW", "KRW"),
	/**
	 * The '<em><b>KWD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KWD_VALUE
	 * @generated
	 * @ordered
	 */
	KWD(36, "KWD", "KWD"),
	/**
	 * The '<em><b>KZT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KZT_VALUE
	 * @generated
	 * @ordered
	 */
	KZT(37, "KZT", "KZT"),
	/**
	 * The '<em><b>LBP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LBP_VALUE
	 * @generated
	 * @ordered
	 */
	LBP(38, "LBP", "LBP"),
	/**
	 * The '<em><b>LKR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LKR_VALUE
	 * @generated
	 * @ordered
	 */
	LKR(39, "LKR", "LKR"),
	/**
	 * The '<em><b>LTL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LTL_VALUE
	 * @generated
	 * @ordered
	 */
	LTL(40, "LTL", "LTL"),
	/**
	 * The '<em><b>LVL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LVL_VALUE
	 * @generated
	 * @ordered
	 */
	LVL(41, "LVL", "LVL"),
	/**
	 * The '<em><b>MAD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAD_VALUE
	 * @generated
	 * @ordered
	 */
	MAD(42, "MAD", "MAD"),
	/**
	 * The '<em><b>MKD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MKD_VALUE
	 * @generated
	 * @ordered
	 */
	MKD(43, "MKD", "MKD"),
	/**
	 * The '<em><b>MXN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MXN_VALUE
	 * @generated
	 * @ordered
	 */
	MXN(44, "MXN", "MXN"),
	/**
	 * The '<em><b>MYR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MYR_VALUE
	 * @generated
	 * @ordered
	 */
	MYR(45, "MYR", "MYR"),
	/**
	 * The '<em><b>NIO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NIO_VALUE
	 * @generated
	 * @ordered
	 */
	NIO(46, "NIO", "NIO"),
	/**
	 * The '<em><b>NOK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOK_VALUE
	 * @generated
	 * @ordered
	 */
	NOK(47, "NOK", "NOK"),
	/**
	 * The '<em><b>NTD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NTD_VALUE
	 * @generated
	 * @ordered
	 */
	NTD(48, "NTD", "NTD"),
	/**
	 * The '<em><b>NZD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NZD_VALUE
	 * @generated
	 * @ordered
	 */
	NZD(49, "NZD", "NZD"),
	/**
	 * The '<em><b>OMR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OMR_VALUE
	 * @generated
	 * @ordered
	 */
	OMR(50, "OMR", "OMR"),
	/**
	 * The '<em><b>PAB</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PAB_VALUE
	 * @generated
	 * @ordered
	 */
	PAB(51, "PAB", "PAB"),
	/**
	 * The '<em><b>PEN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PEN_VALUE
	 * @generated
	 * @ordered
	 */
	PEN(52, "PEN", "PEN"),
	/**
	 * The '<em><b>PHP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PHP_VALUE
	 * @generated
	 * @ordered
	 */
	PHP(53, "PHP", "PHP"),
	/**
	 * The '<em><b>PKR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PKR_VALUE
	 * @generated
	 * @ordered
	 */
	PKR(54, "PKR", "PKR"),
	/**
	 * The '<em><b>PLN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLN_VALUE
	 * @generated
	 * @ordered
	 */
	PLN(55, "PLN", "PLN"),
	/**
	 * The '<em><b>PYG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PYG_VALUE
	 * @generated
	 * @ordered
	 */
	PYG(56, "PYG", "PYG"),
	/**
	 * The '<em><b>QAR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QAR_VALUE
	 * @generated
	 * @ordered
	 */
	QAR(57, "QAR", "QAR"),
	/**
	 * The '<em><b>ROL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROL_VALUE
	 * @generated
	 * @ordered
	 */
	ROL(58, "ROL", "ROL"),
	/**
	 * The '<em><b>RUR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RUR_VALUE
	 * @generated
	 * @ordered
	 */
	RUR(59, "RUR", "RUR"),
	/**
	 * The '<em><b>SAR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SAR_VALUE
	 * @generated
	 * @ordered
	 */
	SAR(60, "SAR", "SAR"),
	/**
	 * The '<em><b>SEK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEK_VALUE
	 * @generated
	 * @ordered
	 */
	SEK(61, "SEK", "SEK"),
	/**
	 * The '<em><b>SGD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SGD_VALUE
	 * @generated
	 * @ordered
	 */
	SGD(62, "SGD", "SGD"),
	/**
	 * The '<em><b>SIT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIT_VALUE
	 * @generated
	 * @ordered
	 */
	SIT(63, "SIT", "SIT"),
	/**
	 * The '<em><b>SKK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SKK_VALUE
	 * @generated
	 * @ordered
	 */
	SKK(64, "SKK", "SKK"),
	/**
	 * The '<em><b>SVC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SVC_VALUE
	 * @generated
	 * @ordered
	 */
	SVC(65, "SVC", "SVC"),
	/**
	 * The '<em><b>THB</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #THB_VALUE
	 * @generated
	 * @ordered
	 */
	THB(66, "THB", "THB"),
	/**
	 * The '<em><b>TND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TND_VALUE
	 * @generated
	 * @ordered
	 */
	TND(67, "TND", "TND"),
	/**
	 * The '<em><b>TRL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRL_VALUE
	 * @generated
	 * @ordered
	 */
	TRL(68, "TRL", "TRL"),
	/**
	 * The '<em><b>TTD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TTD_VALUE
	 * @generated
	 * @ordered
	 */
	TTD(69, "TTD", "TTD"),
	/**
	 * The '<em><b>UAH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UAH_VALUE
	 * @generated
	 * @ordered
	 */
	UAH(70, "UAH", "UAH"),
	/**
	 * The '<em><b>USD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USD_VALUE
	 * @generated
	 * @ordered
	 */
	USD(71, "USD", "USD"),
	/**
	 * The '<em><b>UYP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UYP_VALUE
	 * @generated
	 * @ordered
	 */
	UYP(72, "UYP", "UYP"),
	/**
	 * The '<em><b>VEB</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VEB_VALUE
	 * @generated
	 * @ordered
	 */
	VEB(73, "VEB", "VEB"),
	/**
	 * The '<em><b>XAF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XAF_VALUE
	 * @generated
	 * @ordered
	 */
	XAF(74, "XAF", "XAF"),
	/**
	 * The '<em><b>XPF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XPF_VALUE
	 * @generated
	 * @ordered
	 */
	XPF(75, "XPF", "XPF"),
	/**
	 * The '<em><b>YER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #YER_VALUE
	 * @generated
	 * @ordered
	 */
	YER(76, "YER", "YER"),
	/**
	 * The '<em><b>YUN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #YUN_VALUE
	 * @generated
	 * @ordered
	 */
	YUN(77, "YUN", "YUN"),
	/**
	 * The '<em><b>ZAR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ZAR_VALUE
	 * @generated
	 * @ordered
	 */
	ZAR(78, "ZAR", "ZAR");
	/**
	 * The '<em><b>AED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>AED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AED_VALUE = 0;

	/**
	 * The '<em><b>ALL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ALL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ALL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ALL_VALUE = 1;

	/**
	 * The '<em><b>ARS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ARS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ARS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ARS_VALUE = 2;

	/**
	 * The '<em><b>AUD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>AUD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AUD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AUD_VALUE = 3;

	/**
	 * The '<em><b>BAM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BAM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BAM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BAM_VALUE = 4;

	/**
	 * The '<em><b>BGL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BGL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BGL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BGL_VALUE = 5;

	/**
	 * The '<em><b>BHD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BHD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BHD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BHD_VALUE = 6;

	/**
	 * The '<em><b>BOB</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BOB</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BOB
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BOB_VALUE = 7;

	/**
	 * The '<em><b>BRL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BRL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BRL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BRL_VALUE = 8;

	/**
	 * The '<em><b>BSD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BSD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BSD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BSD_VALUE = 9;

	/**
	 * The '<em><b>BYB</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BYB</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BYB
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BYB_VALUE = 10;

	/**
	 * The '<em><b>CAD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CAD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CAD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CAD_VALUE = 11;

	/**
	 * The '<em><b>CHF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CHF</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CHF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CHF_VALUE = 12;

	/**
	 * The '<em><b>CLP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CLP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CLP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CLP_VALUE = 13;

	/**
	 * The '<em><b>CNY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CNY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CNY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CNY_VALUE = 14;

	/**
	 * The '<em><b>COP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COP_VALUE = 15;

	/**
	 * The '<em><b>CRC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CRC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CRC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CRC_VALUE = 16;

	/**
	 * The '<em><b>CZK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CZK</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CZK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CZK_VALUE = 17;

	/**
	 * The '<em><b>DKK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DKK</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DKK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DKK_VALUE = 18;

	/**
	 * The '<em><b>DOP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DOP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DOP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DOP_VALUE = 19;

	/**
	 * The '<em><b>DZD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DZD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DZD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DZD_VALUE = 20;

	/**
	 * The '<em><b>EEK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EEK</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EEK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EEK_VALUE = 21;

	/**
	 * The '<em><b>EGP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EGP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EGP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EGP_VALUE = 22;

	/**
	 * The '<em><b>EUR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EUR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EUR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EUR_VALUE = 23;

	/**
	 * The '<em><b>GBP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GBP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GBP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GBP_VALUE = 24;

	/**
	 * The '<em><b>HKD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HKD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HKD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HKD_VALUE = 25;

	/**
	 * The '<em><b>HNL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HNL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HNL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HNL_VALUE = 26;

	/**
	 * The '<em><b>HRK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HRK</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HRK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HRK_VALUE = 27;

	/**
	 * The '<em><b>HUF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HUF</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HUF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HUF_VALUE = 28;

	/**
	 * The '<em><b>IDR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IDR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IDR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IDR_VALUE = 29;

	/**
	 * The '<em><b>ILS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ILS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ILS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ILS_VALUE = 30;

	/**
	 * The '<em><b>INR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INR_VALUE = 31;

	/**
	 * The '<em><b>ISK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ISK</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ISK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ISK_VALUE = 32;

	/**
	 * The '<em><b>JOD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>JOD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #JOD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int JOD_VALUE = 33;

	/**
	 * The '<em><b>JPY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>JPY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #JPY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int JPY_VALUE = 34;

	/**
	 * The '<em><b>KRW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>KRW</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KRW
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int KRW_VALUE = 35;

	/**
	 * The '<em><b>KWD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>KWD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KWD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int KWD_VALUE = 36;

	/**
	 * The '<em><b>KZT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>KZT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KZT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int KZT_VALUE = 37;

	/**
	 * The '<em><b>LBP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LBP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LBP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LBP_VALUE = 38;

	/**
	 * The '<em><b>LKR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LKR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LKR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LKR_VALUE = 39;

	/**
	 * The '<em><b>LTL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LTL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LTL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LTL_VALUE = 40;

	/**
	 * The '<em><b>LVL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LVL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LVL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LVL_VALUE = 41;

	/**
	 * The '<em><b>MAD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MAD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MAD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MAD_VALUE = 42;

	/**
	 * The '<em><b>MKD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MKD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MKD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MKD_VALUE = 43;

	/**
	 * The '<em><b>MXN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MXN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MXN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MXN_VALUE = 44;

	/**
	 * The '<em><b>MYR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MYR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MYR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MYR_VALUE = 45;

	/**
	 * The '<em><b>NIO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NIO</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NIO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NIO_VALUE = 46;

	/**
	 * The '<em><b>NOK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NOK</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NOK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NOK_VALUE = 47;

	/**
	 * The '<em><b>NTD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NTD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NTD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NTD_VALUE = 48;

	/**
	 * The '<em><b>NZD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NZD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NZD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NZD_VALUE = 49;

	/**
	 * The '<em><b>OMR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OMR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OMR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OMR_VALUE = 50;

	/**
	 * The '<em><b>PAB</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PAB</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PAB
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PAB_VALUE = 51;

	/**
	 * The '<em><b>PEN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PEN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PEN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PEN_VALUE = 52;

	/**
	 * The '<em><b>PHP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PHP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PHP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PHP_VALUE = 53;

	/**
	 * The '<em><b>PKR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PKR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PKR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PKR_VALUE = 54;

	/**
	 * The '<em><b>PLN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PLN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PLN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PLN_VALUE = 55;

	/**
	 * The '<em><b>PYG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PYG</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PYG
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PYG_VALUE = 56;

	/**
	 * The '<em><b>QAR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>QAR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #QAR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int QAR_VALUE = 57;

	/**
	 * The '<em><b>ROL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ROL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ROL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ROL_VALUE = 58;

	/**
	 * The '<em><b>RUR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RUR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RUR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RUR_VALUE = 59;

	/**
	 * The '<em><b>SAR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SAR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SAR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SAR_VALUE = 60;

	/**
	 * The '<em><b>SEK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SEK</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SEK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SEK_VALUE = 61;

	/**
	 * The '<em><b>SGD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SGD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SGD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SGD_VALUE = 62;

	/**
	 * The '<em><b>SIT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SIT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SIT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SIT_VALUE = 63;

	/**
	 * The '<em><b>SKK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SKK</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SKK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SKK_VALUE = 64;

	/**
	 * The '<em><b>SVC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SVC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SVC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SVC_VALUE = 65;

	/**
	 * The '<em><b>THB</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>THB</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #THB
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int THB_VALUE = 66;

	/**
	 * The '<em><b>TND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TND</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TND
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TND_VALUE = 67;

	/**
	 * The '<em><b>TRL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TRL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TRL_VALUE = 68;

	/**
	 * The '<em><b>TTD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TTD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TTD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TTD_VALUE = 69;

	/**
	 * The '<em><b>UAH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UAH</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UAH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UAH_VALUE = 70;

	/**
	 * The '<em><b>USD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>USD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #USD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int USD_VALUE = 71;

	/**
	 * The '<em><b>UYP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UYP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UYP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UYP_VALUE = 72;

	/**
	 * The '<em><b>VEB</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>VEB</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VEB
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VEB_VALUE = 73;

	/**
	 * The '<em><b>XAF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>XAF</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #XAF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int XAF_VALUE = 74;

	/**
	 * The '<em><b>XPF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>XPF</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #XPF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int XPF_VALUE = 75;

	/**
	 * The '<em><b>YER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>YER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #YER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int YER_VALUE = 76;

	/**
	 * The '<em><b>YUN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>YUN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #YUN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int YUN_VALUE = 77;

	/**
	 * The '<em><b>ZAR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ZAR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ZAR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ZAR_VALUE = 78;

	/**
	 * An array of all the '<em><b>Currency</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Currency[] VALUES_ARRAY = new Currency[] { AED, ALL,
			ARS, AUD, BAM, BGL, BHD, BOB, BRL, BSD, BYB, CAD, CHF, CLP, CNY,
			COP, CRC, CZK, DKK, DOP, DZD, EEK, EGP, EUR, GBP, HKD, HNL, HRK,
			HUF, IDR, ILS, INR, ISK, JOD, JPY, KRW, KWD, KZT, LBP, LKR, LTL,
			LVL, MAD, MKD, MXN, MYR, NIO, NOK, NTD, NZD, OMR, PAB, PEN, PHP,
			PKR, PLN, PYG, QAR, ROL, RUR, SAR, SEK, SGD, SIT, SKK, SVC, THB,
			TND, TRL, TTD, UAH, USD, UYP, VEB, XAF, XPF, YER, YUN, ZAR, };

	/**
	 * A public read-only list of all the '<em><b>Currency</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Currency> VALUES = Collections
			.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Currency</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Currency get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Currency result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Currency</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Currency getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Currency result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Currency</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Currency get(int value) {
		switch (value) {
		case AED_VALUE:
			return AED;
		case ALL_VALUE:
			return ALL;
		case ARS_VALUE:
			return ARS;
		case AUD_VALUE:
			return AUD;
		case BAM_VALUE:
			return BAM;
		case BGL_VALUE:
			return BGL;
		case BHD_VALUE:
			return BHD;
		case BOB_VALUE:
			return BOB;
		case BRL_VALUE:
			return BRL;
		case BSD_VALUE:
			return BSD;
		case BYB_VALUE:
			return BYB;
		case CAD_VALUE:
			return CAD;
		case CHF_VALUE:
			return CHF;
		case CLP_VALUE:
			return CLP;
		case CNY_VALUE:
			return CNY;
		case COP_VALUE:
			return COP;
		case CRC_VALUE:
			return CRC;
		case CZK_VALUE:
			return CZK;
		case DKK_VALUE:
			return DKK;
		case DOP_VALUE:
			return DOP;
		case DZD_VALUE:
			return DZD;
		case EEK_VALUE:
			return EEK;
		case EGP_VALUE:
			return EGP;
		case EUR_VALUE:
			return EUR;
		case GBP_VALUE:
			return GBP;
		case HKD_VALUE:
			return HKD;
		case HNL_VALUE:
			return HNL;
		case HRK_VALUE:
			return HRK;
		case HUF_VALUE:
			return HUF;
		case IDR_VALUE:
			return IDR;
		case ILS_VALUE:
			return ILS;
		case INR_VALUE:
			return INR;
		case ISK_VALUE:
			return ISK;
		case JOD_VALUE:
			return JOD;
		case JPY_VALUE:
			return JPY;
		case KRW_VALUE:
			return KRW;
		case KWD_VALUE:
			return KWD;
		case KZT_VALUE:
			return KZT;
		case LBP_VALUE:
			return LBP;
		case LKR_VALUE:
			return LKR;
		case LTL_VALUE:
			return LTL;
		case LVL_VALUE:
			return LVL;
		case MAD_VALUE:
			return MAD;
		case MKD_VALUE:
			return MKD;
		case MXN_VALUE:
			return MXN;
		case MYR_VALUE:
			return MYR;
		case NIO_VALUE:
			return NIO;
		case NOK_VALUE:
			return NOK;
		case NTD_VALUE:
			return NTD;
		case NZD_VALUE:
			return NZD;
		case OMR_VALUE:
			return OMR;
		case PAB_VALUE:
			return PAB;
		case PEN_VALUE:
			return PEN;
		case PHP_VALUE:
			return PHP;
		case PKR_VALUE:
			return PKR;
		case PLN_VALUE:
			return PLN;
		case PYG_VALUE:
			return PYG;
		case QAR_VALUE:
			return QAR;
		case ROL_VALUE:
			return ROL;
		case RUR_VALUE:
			return RUR;
		case SAR_VALUE:
			return SAR;
		case SEK_VALUE:
			return SEK;
		case SGD_VALUE:
			return SGD;
		case SIT_VALUE:
			return SIT;
		case SKK_VALUE:
			return SKK;
		case SVC_VALUE:
			return SVC;
		case THB_VALUE:
			return THB;
		case TND_VALUE:
			return TND;
		case TRL_VALUE:
			return TRL;
		case TTD_VALUE:
			return TTD;
		case UAH_VALUE:
			return UAH;
		case USD_VALUE:
			return USD;
		case UYP_VALUE:
			return UYP;
		case VEB_VALUE:
			return VEB;
		case XAF_VALUE:
			return XAF;
		case XPF_VALUE:
			return XPF;
		case YER_VALUE:
			return YER;
		case YUN_VALUE:
			return YUN;
		case ZAR_VALUE:
			return ZAR;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Currency(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
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
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
}
