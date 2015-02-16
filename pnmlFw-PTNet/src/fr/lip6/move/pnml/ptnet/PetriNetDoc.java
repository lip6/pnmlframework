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
 * A representation of the model object '<em><b>Petri Net Doc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.lip6.move.pnml.ptnet.PetriNetDoc#getNets <em>Nets</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.ptnet.PetriNetDoc#getXmlns <em>Xmlns</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.lip6.move.pnml.ptnet.PtnetPackage#getPetriNetDoc()
 * @model annotation="http://www.pnml.org/models/ToPNML tag='pnml' kind='son'"
 * @generated
 */
public interface PetriNetDoc extends EObject {
	/**
	 * Returns the value of the '<em><b>Nets</b></em>' containment reference list.
	 * The list contents are of type {@link fr.lip6.move.pnml.ptnet.PetriNet}.
	 * It is bidirectional and its opposite is '{@link fr.lip6.move.pnml.ptnet.PetriNet#getContainerPetriNetDoc <em>Container Petri Net Doc</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nets</em>' containment reference list.
	 * @see fr.lip6.move.pnml.ptnet.PtnetPackage#getPetriNetDoc_Nets()
	 * @see fr.lip6.move.pnml.ptnet.PetriNet#getContainerPetriNetDoc
	 * @model opposite="containerPetriNetDoc" containment="true" required="true" ordered="false"
	 *        annotation="http://www.pnml.org/models/ToPNML kind='follow'"
	 * @generated
	 */
	List<PetriNet> getNets();

	/**
	 * Returns the value of the '<em><b>Xmlns</b></em>' attribute.
	 * The default value is <code>"http://www.pnml.org/version-2009/grammar/pnml"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Xmlns</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xmlns</em>' attribute.
	 * @see fr.lip6.move.pnml.ptnet.PtnetPackage#getPetriNetDoc_Xmlns()
	 * @model default="http://www.pnml.org/version-2009/grammar/pnml" changeable="false"
	 *        annotation="http://www.pnml.org/models/ToPNML tag='xmlns' kind='attribute'"
	 * @generated
	 */
	String getXmlns();

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
} // PetriNetDoc
