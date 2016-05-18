/**
 *  Copyright 2009-2016 Université Paris Ouest and Sorbonne Universités,
 * 							Univ. Paris 06 - CNRS UMR 7606 (LIP6)
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
 * (C) Sorbonne Universités, UPMC Univ Paris 06, UMR CNRS 7606 (LIP6/MoVe)
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 *  Contributors: 
 *    Lom HILLAH (LIP6) - Initial models and implementation
 *    Rachid Alahyane (UPMC) - Infrastructure and continuous integration
 *    Bastien Bouzerau (UPMC) - Architecture 
 *    Guillaume Giffo (UPMC) - Code generation refactoring, High-level API
 */
package fr.lip6.move.pnml.hlpn.hlcorestructure;

import java.nio.channels.FileChannel;

import org.apache.axiom.om.OMElement;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;

import fr.lip6.move.pnml.framework.utils.IdRefLinker;
import fr.lip6.move.pnml.framework.utils.exception.InnerBuildException;
import fr.lip6.move.pnml.framework.utils.exception.InvalidIDException;
import fr.lip6.move.pnml.framework.utils.exception.VoidRepositoryException;
import fr.lip6.move.pnml.hlpn.arbitrarydeclarations.AnySort;
import fr.lip6.move.pnml.hlpn.arbitrarydeclarations.ArbitrarySort;
import fr.lip6.move.pnml.hlpn.arbitrarydeclarations.Unparsed;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Any Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.lip6.move.pnml.hlpn.hlcorestructure.AnyObject#getContainerToolInfo <em>Container Tool Info</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.hlpn.hlcorestructure.AnyObject#getContainerUnparsed <em>Container Unparsed</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.hlpn.hlcorestructure.AnyObject#getContainerAnySort <em>Container Any Sort</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.hlpn.hlcorestructure.AnyObject#getContainerArbitrarySort <em>Container Arbitrary Sort</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.HlcorestructurePackage#getAnyObject()
 * @model abstract="true"
 * @generated
 */
public interface AnyObject extends EObject {
	/**
	 * Returns the value of the '<em><b>Container Tool Info</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.ToolInfo#getToolInfoModel <em>Tool Info Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container Tool Info</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container Tool Info</em>' container reference.
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.HlcorestructurePackage#getAnyObject_ContainerToolInfo()
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.ToolInfo#getToolInfoModel
	 * @model opposite="toolInfoModel" transient="false" changeable="false"
	 * @generated
	 */
	ToolInfo getContainerToolInfo();

	/**
	 * Returns the value of the '<em><b>Container Unparsed</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.lip6.move.pnml.hlpn.arbitrarydeclarations.Unparsed#getUnparsedModel <em>Unparsed Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container Unparsed</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container Unparsed</em>' container reference.
	 * @see #setContainerUnparsed(Unparsed)
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.HlcorestructurePackage#getAnyObject_ContainerUnparsed()
	 * @see fr.lip6.move.pnml.hlpn.arbitrarydeclarations.Unparsed#getUnparsedModel
	 * @model opposite="unparsedModel" transient="false"
	 * @generated
	 */
	Unparsed getContainerUnparsed();

	/**
	 * Sets the value of the '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.AnyObject#getContainerUnparsed <em>Container Unparsed</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container Unparsed</em>' container reference.
	 * @see #getContainerUnparsed()
	 * @generated
	 */
	void setContainerUnparsed(Unparsed value);

	/**
	 * Returns the value of the '<em><b>Container Any Sort</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fr.lip6.move.pnml.hlpn.arbitrarydeclarations.AnySort#getAnySortModel <em>Any Sort Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container Any Sort</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container Any Sort</em>' reference.
	 * @see #setContainerAnySort(AnySort)
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.HlcorestructurePackage#getAnyObject_ContainerAnySort()
	 * @see fr.lip6.move.pnml.hlpn.arbitrarydeclarations.AnySort#getAnySortModel
	 * @model opposite="anySortModel"
	 * @generated
	 */
	AnySort getContainerAnySort();

	/**
	 * Sets the value of the '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.AnyObject#getContainerAnySort <em>Container Any Sort</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container Any Sort</em>' reference.
	 * @see #getContainerAnySort()
	 * @generated
	 */
	void setContainerAnySort(AnySort value);

	/**
	 * Returns the value of the '<em><b>Container Arbitrary Sort</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container Arbitrary Sort</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container Arbitrary Sort</em>' reference.
	 * @see #setContainerArbitrarySort(ArbitrarySort)
	 * @see fr.lip6.move.pnml.hlpn.hlcorestructure.HlcorestructurePackage#getAnyObject_ContainerArbitrarySort()
	 * @model
	 * @generated
	 */
	ArbitrarySort getContainerArbitrarySort();

	/**
	 * Sets the value of the '{@link fr.lip6.move.pnml.hlpn.hlcorestructure.AnyObject#getContainerArbitrarySort <em>Container Arbitrary Sort</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container Arbitrary Sort</em>' reference.
	 * @see #getContainerArbitrarySort()
	 * @generated
	 */
	void setContainerArbitrarySort(ArbitrarySort value);

	public abstract String toPNML();

	public abstract void fromPNML(OMElement locRoot, IdRefLinker idr) throws InnerBuildException, InvalidIDException,
			VoidRepositoryException;

	public abstract void toPNML(FileChannel fc);

	public abstract boolean validateOCL(DiagnosticChain diagnostics);
} // AnyObject
