/**
 */
package fr.lip6.nupn;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.lip6.nupn.NupnPackage
 * @generated
 */
public interface NupnFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NupnFactory eINSTANCE = fr.lip6.nupn.impl.NupnFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Size Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Size Type</em>'.
	 * @generated
	 */
	SizeType createSizeType();

	/**
	 * Returns a new object of class '<em>Structure Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Structure Type</em>'.
	 * @generated
	 */
	StructureType createStructureType();

	/**
	 * Returns a new object of class '<em>NUPN Toolspecific Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>NUPN Toolspecific Type</em>'.
	 * @generated
	 */
	NUPNToolspecificType createNUPNToolspecificType();

	/**
	 * Returns a new object of class '<em>Unit Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unit Type</em>'.
	 * @generated
	 */
	UnitType createUnitType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	NupnPackage getNupnPackage();

} //NupnFactory
