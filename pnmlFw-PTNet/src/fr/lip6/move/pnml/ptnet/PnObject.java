/**
 *  Copyright 2009-2015 Université Paris Ouest and Sorbonne Universités,
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
package fr.lip6.move.pnml.ptnet;

import java.nio.channels.FileChannel;
import java.util.List;

import org.apache.axiom.om.OMElement;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;

import fr.lip6.move.pnml.framework.utils.IdRefLinker;
import fr.lip6.move.pnml.framework.utils.exception.InnerBuildException;
import fr.lip6.move.pnml.framework.utils.exception.InvalidIDException;
import fr.lip6.move.pnml.framework.utils.exception.VoidRepositoryException;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pn Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.lip6.move.pnml.ptnet.PnObject#getId <em>Id</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.ptnet.PnObject#getName <em>Name</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.ptnet.PnObject#getToolspecifics <em>Toolspecifics</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.ptnet.PnObject#getContainerPage <em>Container Page</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.lip6.move.pnml.ptnet.PtnetPackage#getPnObject()
 * @model abstract="true"
 * @generated
 */
public interface PnObject extends EObject {
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
	 * @see fr.lip6.move.pnml.ptnet.PtnetPackage#getPnObject_Id()
	 * @model id="true" required="true" ordered="false"
	 *        annotation="http://www.pnml.org/models/ToPNML tag='id' kind='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link fr.lip6.move.pnml.ptnet.PnObject#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link fr.lip6.move.pnml.ptnet.Name#getContainerNamePnObject <em>Container Name Pn Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(Name)
	 * @see fr.lip6.move.pnml.ptnet.PtnetPackage#getPnObject_Name()
	 * @see fr.lip6.move.pnml.ptnet.Name#getContainerNamePnObject
	 * @model opposite="containerNamePnObject" containment="true" ordered="false"
	 *        annotation="http://www.pnml.org/models/ToPNML kind='follow'"
	 * @generated
	 */
	Name getName();

	/**
	 * Sets the value of the '{@link fr.lip6.move.pnml.ptnet.PnObject#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(Name value);

	/**
	 * Returns the value of the '<em><b>Toolspecifics</b></em>' containment reference list.
	 * The list contents are of type {@link fr.lip6.move.pnml.ptnet.ToolInfo}.
	 * It is bidirectional and its opposite is '{@link fr.lip6.move.pnml.ptnet.ToolInfo#getContainerPnObject <em>Container Pn Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Toolspecifics</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Toolspecifics</em>' containment reference list.
	 * @see fr.lip6.move.pnml.ptnet.PtnetPackage#getPnObject_Toolspecifics()
	 * @see fr.lip6.move.pnml.ptnet.ToolInfo#getContainerPnObject
	 * @model opposite="containerPnObject" containment="true" ordered="false"
	 *        annotation="http://www.pnml.org/models/ToPNML kind='follow'"
	 * @generated
	 */
	List<ToolInfo> getToolspecifics();

	/**
	 * Returns the value of the '<em><b>Container Page</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.lip6.move.pnml.ptnet.Page#getObjects <em>Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container Page</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container Page</em>' container reference.
	 * @see #setContainerPage(Page)
	 * @see fr.lip6.move.pnml.ptnet.PtnetPackage#getPnObject_ContainerPage()
	 * @see fr.lip6.move.pnml.ptnet.Page#getObjects
	 * @model opposite="objects" transient="false" ordered="false"
	 * @generated
	 */
	Page getContainerPage();

	/**
	 * Sets the value of the '{@link fr.lip6.move.pnml.ptnet.PnObject#getContainerPage <em>Container Page</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container Page</em>' container reference.
	 * @see #getContainerPage()
	 * @generated
	 */
	void setContainerPage(Page value);

	public abstract String toPNML();

	public abstract void fromPNML(OMElement locRoot, IdRefLinker idr) throws InnerBuildException, InvalidIDException,
			VoidRepositoryException;

	public abstract void toPNML(FileChannel fc);

	public abstract boolean validateOCL(DiagnosticChain diagnostics);
} // PnObject
