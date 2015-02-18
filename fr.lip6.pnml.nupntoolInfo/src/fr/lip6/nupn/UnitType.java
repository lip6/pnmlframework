/**
 */
package fr.lip6.nupn;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unit Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.lip6.nupn.UnitType#getPlaces <em>Places</em>}</li>
 *   <li>{@link fr.lip6.nupn.UnitType#getSubunits <em>Subunits</em>}</li>
 *   <li>{@link fr.lip6.nupn.UnitType#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.lip6.nupn.NupnPackage#getUnitType()
 * @model extendedMetaData="name='unit' kind='elementOnly'"
 * @generated
 */
public interface UnitType extends EObject {
	/**
	 * Returns the value of the '<em><b>Places</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Places</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Places</em>' attribute.
	 * @see #setPlaces(List)
	 * @see fr.lip6.nupn.NupnPackage#getUnitType_Places()
	 * @model dataType="fr.lip6.nupn.PlaceList" required="true" many="false"
	 * @generated
	 */
	List<String> getPlaces();

	/**
	 * Sets the value of the '{@link fr.lip6.nupn.UnitType#getPlaces <em>Places</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Places</em>' attribute.
	 * @see #getPlaces()
	 * @generated
	 */
	void setPlaces(List<String> value);

	/**
	 * Returns the value of the '<em><b>Subunits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subunits</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subunits</em>' attribute.
	 * @see #setSubunits(List)
	 * @see fr.lip6.nupn.NupnPackage#getUnitType_Subunits()
	 * @model dataType="fr.lip6.nupn.UnitList" required="true" many="false"
	 * @generated
	 */
	List<String> getSubunits();

	/**
	 * Sets the value of the '{@link fr.lip6.nupn.UnitType#getSubunits <em>Subunits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subunits</em>' attribute.
	 * @see #getSubunits()
	 * @generated
	 */
	void setSubunits(List<String> value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see fr.lip6.nupn.NupnPackage#getUnitType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='id' namespace='##targetNamespace'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link fr.lip6.nupn.UnitType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // UnitType
