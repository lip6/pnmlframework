/**
 */
package fr.lip6.nupn;

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structure Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.lip6.nupn.StructureType#getUnit <em>Unit</em>}</li>
 *   <li>{@link fr.lip6.nupn.StructureType#getRoot <em>Root</em>}</li>
 *   <li>{@link fr.lip6.nupn.StructureType#isSafe <em>Safe</em>}</li>
 *   <li>{@link fr.lip6.nupn.StructureType#getUnits <em>Units</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.lip6.nupn.NupnPackage#getStructureType()
 * @model extendedMetaData="name='structure' kind='elementOnly'"
 * @generated
 */
public interface StructureType extends EObject {
	/**
	 * Returns the value of the '<em><b>Unit</b></em>' containment reference list.
	 * The list contents are of type {@link fr.lip6.nupn.UnitType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' containment reference list.
	 * @see fr.lip6.nupn.NupnPackage#getStructureType_Unit()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<UnitType> getUnit();

	/**
	 * Returns the value of the '<em><b>Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root</em>' attribute.
	 * @see #setRoot(String)
	 * @see fr.lip6.nupn.NupnPackage#getStructureType_Root()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREF" required="true"
	 *        extendedMetaData="kind='attribute' name='root' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRoot();

	/**
	 * Sets the value of the '{@link fr.lip6.nupn.StructureType#getRoot <em>Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root</em>' attribute.
	 * @see #getRoot()
	 * @generated
	 */
	void setRoot(String value);

	/**
	 * Returns the value of the '<em><b>Safe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Safe</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Safe</em>' attribute.
	 * @see #isSetSafe()
	 * @see #unsetSafe()
	 * @see #setSafe(boolean)
	 * @see fr.lip6.nupn.NupnPackage#getStructureType_Safe()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='attribute' name='safe' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isSafe();

	/**
	 * Sets the value of the '{@link fr.lip6.nupn.StructureType#isSafe <em>Safe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Safe</em>' attribute.
	 * @see #isSetSafe()
	 * @see #unsetSafe()
	 * @see #isSafe()
	 * @generated
	 */
	void setSafe(boolean value);

	/**
	 * Unsets the value of the '{@link fr.lip6.nupn.StructureType#isSafe <em>Safe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSafe()
	 * @see #isSafe()
	 * @see #setSafe(boolean)
	 * @generated
	 */
	void unsetSafe();

	/**
	 * Returns whether the value of the '{@link fr.lip6.nupn.StructureType#isSafe <em>Safe</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Safe</em>' attribute is set.
	 * @see #unsetSafe()
	 * @see #isSafe()
	 * @see #setSafe(boolean)
	 * @generated
	 */
	boolean isSetSafe();

	/**
	 * Returns the value of the '<em><b>Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Units</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Units</em>' attribute.
	 * @see #setUnits(BigInteger)
	 * @see fr.lip6.nupn.NupnPackage#getStructureType_Units()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.PositiveInteger" required="true"
	 *        extendedMetaData="kind='attribute' name='units' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getUnits();

	/**
	 * Sets the value of the '{@link fr.lip6.nupn.StructureType#getUnits <em>Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Units</em>' attribute.
	 * @see #getUnits()
	 * @generated
	 */
	void setUnits(BigInteger value);

} // StructureType
