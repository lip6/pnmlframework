/**
 *  Copyright 2009-2016 Université Paris Ouest and Sorbonne Universités,
							Univ. Paris 06 - CNRS UMR 7606 (LIP6)
 *
 *  All rights reserved.   This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *  Project leader / Initial Contributor:
 *    Lom Messan Hillah - <lom-messan.hillah@lip6.fr>
 *
 *  Contributors:
 *    ${ocontributors} - <$oemails}>
 *
 *  Mailing list:
 *    lom-messan.hillah@lip6.fr
 */
/**
 */
package fr.lip6.nupn;

import java.math.BigDecimal;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>NUPN Toolspecific Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.lip6.nupn.NUPNToolspecificType#getSize <em>Size</em>}</li>
 *   <li>{@link fr.lip6.nupn.NUPNToolspecificType#getStructure <em>Structure</em>}</li>
 *   <li>{@link fr.lip6.nupn.NUPNToolspecificType#getTool <em>Tool</em>}</li>
 *   <li>{@link fr.lip6.nupn.NUPNToolspecificType#getVersion <em>Version</em>}</li>
 *   <li>{@link fr.lip6.nupn.NUPNToolspecificType#getMixed <em>Mixed</em>}</li>
 *   <li>{@link fr.lip6.nupn.NUPNToolspecificType#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link fr.lip6.nupn.NUPNToolspecificType#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.lip6.nupn.NupnPackage#getNUPNToolspecificType()
 * @model extendedMetaData="name='toolspecific' kind='mixed' namespace='##targetNamespace'"
 * @generated
 */
public interface NUPNToolspecificType extends EObject {
	/**
	 * Returns the value of the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' containment reference.
	 * @see #setSize(SizeType)
	 * @see fr.lip6.nupn.NupnPackage#getNUPNToolspecificType_Size()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SizeType getSize();

	/**
	 * Sets the value of the '{@link fr.lip6.nupn.NUPNToolspecificType#getSize <em>Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' containment reference.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(SizeType value);

	/**
	 * Returns the value of the '<em><b>Structure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Structure</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structure</em>' containment reference.
	 * @see #setStructure(StructureType)
	 * @see fr.lip6.nupn.NupnPackage#getNUPNToolspecificType_Structure()
	 * @model containment="true" required="true"
	 * @generated
	 */
	StructureType getStructure();

	/**
	 * Sets the value of the '{@link fr.lip6.nupn.NUPNToolspecificType#getStructure <em>Structure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Structure</em>' containment reference.
	 * @see #getStructure()
	 * @generated
	 */
	void setStructure(StructureType value);

	/**
	 * Returns the value of the '<em><b>Tool</b></em>' attribute.
	 * The default value is <code>"nupn"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tool</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tool</em>' attribute.
	 * @see #isSetTool()
	 * @see #unsetTool()
	 * @see #setTool(String)
	 * @see fr.lip6.nupn.NupnPackage#getNUPNToolspecificType_Tool()
	 * @model default="nupn" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='tool' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTool();

	/**
	 * Sets the value of the '{@link fr.lip6.nupn.NUPNToolspecificType#getTool <em>Tool</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tool</em>' attribute.
	 * @see #isSetTool()
	 * @see #unsetTool()
	 * @see #getTool()
	 * @generated
	 */
	void setTool(String value);

	/**
	 * Unsets the value of the '{@link fr.lip6.nupn.NUPNToolspecificType#getTool <em>Tool</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTool()
	 * @see #getTool()
	 * @see #setTool(String)
	 * @generated
	 */
	void unsetTool();

	/**
	 * Returns whether the value of the '{@link fr.lip6.nupn.NUPNToolspecificType#getTool <em>Tool</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Tool</em>' attribute is set.
	 * @see #unsetTool()
	 * @see #getTool()
	 * @see #setTool(String)
	 * @generated
	 */
	boolean isSetTool();

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * The default value is <code>"1.1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #isSetVersion()
	 * @see #unsetVersion()
	 * @see #setVersion(BigDecimal)
	 * @see fr.lip6.nupn.NupnPackage#getNUPNToolspecificType_Version()
	 * @model default="1.1" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Decimal"
	 *        extendedMetaData="kind='attribute' name='version' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getVersion();

	/**
	 * Sets the value of the '{@link fr.lip6.nupn.NUPNToolspecificType#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #isSetVersion()
	 * @see #unsetVersion()
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(BigDecimal value);

	/**
	 * Unsets the value of the '{@link fr.lip6.nupn.NUPNToolspecificType#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVersion()
	 * @see #getVersion()
	 * @see #setVersion(BigDecimal)
	 * @generated
	 */
	void unsetVersion();

	/**
	 * Returns whether the value of the '{@link fr.lip6.nupn.NUPNToolspecificType#getVersion <em>Version</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Version</em>' attribute is set.
	 * @see #unsetVersion()
	 * @see #getVersion()
	 * @see #setVersion(BigDecimal)
	 * @generated
	 */
	boolean isSetVersion();

	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see fr.lip6.nupn.NupnPackage#getNUPNToolspecificType_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XMLNS Prefix Map</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XMLNS Prefix Map</em>' map.
	 * @see fr.lip6.nupn.NupnPackage#getNUPNToolspecificType_XMLNSPrefixMap()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xmlns'"
	 * @generated
	 */
	EMap<String, String> getXMLNSPrefixMap();

	/**
	 * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XSI Schema Location</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XSI Schema Location</em>' map.
	 * @see fr.lip6.nupn.NupnPackage#getNUPNToolspecificType_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

} // NUPNToolspecificType
