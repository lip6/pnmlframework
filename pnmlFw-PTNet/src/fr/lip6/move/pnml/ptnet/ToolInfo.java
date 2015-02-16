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

import java.net.URI;
import java.nio.channels.FileChannel;

import org.apache.axiom.om.OMElement;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;

import fr.lip6.move.pnml.framework.utils.IdRefLinker;
import fr.lip6.move.pnml.framework.utils.exception.InnerBuildException;
import fr.lip6.move.pnml.framework.utils.exception.InvalidIDException;
import fr.lip6.move.pnml.framework.utils.exception.VoidRepositoryException;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tool Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.lip6.move.pnml.ptnet.ToolInfo#getTool <em>Tool</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.ptnet.ToolInfo#getVersion <em>Version</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.ptnet.ToolInfo#getFormattedXMLBuffer <em>Formatted XML Buffer</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.ptnet.ToolInfo#getToolInfoGrammarURI <em>Tool Info Grammar URI</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.ptnet.ToolInfo#getContainerPetriNet <em>Container Petri Net</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.ptnet.ToolInfo#getContainerPnObject <em>Container Pn Object</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.ptnet.ToolInfo#getContainerLabel <em>Container Label</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.ptnet.ToolInfo#getToolInfoModel <em>Tool Info Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.lip6.move.pnml.ptnet.PtnetPackage#getToolInfo()
 * @model annotation="http://www.pnml.org/models/ToPNML tag='toolspecific' kind='son'"
 * @generated
 */
public interface ToolInfo extends EObject {
	/**
	 * Returns the value of the '<em><b>Tool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tool</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tool</em>' attribute.
	 * @see #setTool(String)
	 * @see fr.lip6.move.pnml.ptnet.PtnetPackage#getToolInfo_Tool()
	 * @model required="true" ordered="false"
	 *        annotation="http://www.pnml.org/models/ToPNML tag='tool' kind='attribute'"
	 * @generated
	 */
	String getTool();

	/**
	 * Sets the value of the '{@link fr.lip6.move.pnml.ptnet.ToolInfo#getTool <em>Tool</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tool</em>' attribute.
	 * @see #getTool()
	 * @generated
	 */
	void setTool(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see fr.lip6.move.pnml.ptnet.PtnetPackage#getToolInfo_Version()
	 * @model required="true" ordered="false"
	 *        annotation="http://www.pnml.org/models/ToPNML tag='version' kind='attribute'"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link fr.lip6.move.pnml.ptnet.ToolInfo#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Formatted XML Buffer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Formatted XML Buffer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formatted XML Buffer</em>' attribute.
	 * @see #setFormattedXMLBuffer(StringBuffer)
	 * @see fr.lip6.move.pnml.ptnet.PtnetPackage#getToolInfo_FormattedXMLBuffer()
	 * @model dataType="fr.lip6.move.pnml.ptnet.LongString" ordered="false"
	 *        annotation="http://www.pnml.org/models/ToPNML tag='' kind='son'"
	 * @generated
	 */
	StringBuffer getFormattedXMLBuffer();

	/**
	 * Sets the value of the '{@link fr.lip6.move.pnml.ptnet.ToolInfo#getFormattedXMLBuffer <em>Formatted XML Buffer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Formatted XML Buffer</em>' attribute.
	 * @see #getFormattedXMLBuffer()
	 * @generated
	 */
	void setFormattedXMLBuffer(StringBuffer value);

	/**
	 * Returns the value of the '<em><b>Tool Info Grammar URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tool Info Grammar URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tool Info Grammar URI</em>' attribute.
	 * @see #setToolInfoGrammarURI(URI)
	 * @see fr.lip6.move.pnml.ptnet.PtnetPackage#getToolInfo_ToolInfoGrammarURI()
	 * @model dataType="fr.lip6.move.pnml.ptnet.URI" ordered="false"
	 * @generated
	 */
	URI getToolInfoGrammarURI();

	/**
	 * Sets the value of the '{@link fr.lip6.move.pnml.ptnet.ToolInfo#getToolInfoGrammarURI <em>Tool Info Grammar URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tool Info Grammar URI</em>' attribute.
	 * @see #getToolInfoGrammarURI()
	 * @generated
	 */
	void setToolInfoGrammarURI(URI value);

	/**
	 * Returns the value of the '<em><b>Container Petri Net</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.lip6.move.pnml.ptnet.PetriNet#getToolspecifics <em>Toolspecifics</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container Petri Net</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container Petri Net</em>' container reference.
	 * @see #setContainerPetriNet(PetriNet)
	 * @see fr.lip6.move.pnml.ptnet.PtnetPackage#getToolInfo_ContainerPetriNet()
	 * @see fr.lip6.move.pnml.ptnet.PetriNet#getToolspecifics
	 * @model opposite="toolspecifics" transient="false" ordered="false"
	 * @generated
	 */
	PetriNet getContainerPetriNet();

	/**
	 * Sets the value of the '{@link fr.lip6.move.pnml.ptnet.ToolInfo#getContainerPetriNet <em>Container Petri Net</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container Petri Net</em>' container reference.
	 * @see #getContainerPetriNet()
	 * @generated
	 */
	void setContainerPetriNet(PetriNet value);

	/**
	 * Returns the value of the '<em><b>Container Pn Object</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.lip6.move.pnml.ptnet.PnObject#getToolspecifics <em>Toolspecifics</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container Pn Object</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container Pn Object</em>' container reference.
	 * @see #setContainerPnObject(PnObject)
	 * @see fr.lip6.move.pnml.ptnet.PtnetPackage#getToolInfo_ContainerPnObject()
	 * @see fr.lip6.move.pnml.ptnet.PnObject#getToolspecifics
	 * @model opposite="toolspecifics" transient="false" ordered="false"
	 * @generated
	 */
	PnObject getContainerPnObject();

	/**
	 * Sets the value of the '{@link fr.lip6.move.pnml.ptnet.ToolInfo#getContainerPnObject <em>Container Pn Object</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container Pn Object</em>' container reference.
	 * @see #getContainerPnObject()
	 * @generated
	 */
	void setContainerPnObject(PnObject value);

	/**
	 * Returns the value of the '<em><b>Container Label</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.lip6.move.pnml.ptnet.Label#getToolspecifics <em>Toolspecifics</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container Label</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container Label</em>' container reference.
	 * @see #setContainerLabel(Label)
	 * @see fr.lip6.move.pnml.ptnet.PtnetPackage#getToolInfo_ContainerLabel()
	 * @see fr.lip6.move.pnml.ptnet.Label#getToolspecifics
	 * @model opposite="toolspecifics" transient="false" ordered="false"
	 * @generated
	 */
	Label getContainerLabel();

	/**
	 * Sets the value of the '{@link fr.lip6.move.pnml.ptnet.ToolInfo#getContainerLabel <em>Container Label</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container Label</em>' container reference.
	 * @see #getContainerLabel()
	 * @generated
	 */
	void setContainerLabel(Label value);

	/**
	 * Returns the value of the '<em><b>Tool Info Model</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link fr.lip6.move.pnml.ptnet.AnyObject#getContainerToolInfo <em>Container Tool Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tool Info Model</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tool Info Model</em>' containment reference.
	 * @see #setToolInfoModel(AnyObject)
	 * @see fr.lip6.move.pnml.ptnet.PtnetPackage#getToolInfo_ToolInfoModel()
	 * @see fr.lip6.move.pnml.ptnet.AnyObject#getContainerToolInfo
	 * @model opposite="containerToolInfo" containment="true"
	 * @generated
	 */
	AnyObject getToolInfoModel();

	/**
	 * Sets the value of the '{@link fr.lip6.move.pnml.ptnet.ToolInfo#getToolInfoModel <em>Tool Info Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tool Info Model</em>' containment reference.
	 * @see #getToolInfoModel()
	 * @generated
	 */
	void setToolInfoModel(AnyObject value);

	/**
	 * Return the string containing the pnml output
	 */
	public String toPNML();

	/**
	 * set values to conform PNML document
	 */
	public void fromPNML(OMElement subRoot, IdRefLinker idr) throws InnerBuildException, InvalidIDException,
			VoidRepositoryException;

	/**
	 * Write the PNML xml tree of this object into file
	 */
	public void toPNML(FileChannel fc);

	public boolean validateOCL(DiagnosticChain diagnostics);
} // ToolInfo
