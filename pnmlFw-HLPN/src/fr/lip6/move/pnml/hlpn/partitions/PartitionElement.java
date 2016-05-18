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
package fr.lip6.move.pnml.hlpn.partitions;

import java.nio.channels.FileChannel;
import java.util.List;

import org.apache.axiom.om.OMElement;
import org.eclipse.emf.common.util.DiagnosticChain;

import fr.lip6.move.pnml.framework.utils.IdRefLinker;
import fr.lip6.move.pnml.framework.utils.exception.InnerBuildException;
import fr.lip6.move.pnml.framework.utils.exception.InvalidIDException;
import fr.lip6.move.pnml.framework.utils.exception.VoidRepositoryException;
import fr.lip6.move.pnml.hlpn.terms.OperatorDecl;
import fr.lip6.move.pnml.hlpn.terms.Term;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Partition Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.lip6.move.pnml.hlpn.partitions.PartitionElement#getRefpartition <em>Refpartition</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.hlpn.partitions.PartitionElement#getPartitionelementconstants <em>Partitionelementconstants</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.lip6.move.pnml.hlpn.partitions.PartitionsPackage#getPartitionElement()
 * @model annotation="http://www.pnml.org/models/OCL constantsType='self.partitionelementconstants->forAll{p | p.sort = self.refpartition.def}'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='constantsType'"
 *        annotation="http://www.pnml.org/models/ToPNML tag='partitionelement' kind='son'"
 * @generated
 */
public interface PartitionElement extends OperatorDecl {
	/**
	 * Returns the value of the '<em><b>Refpartition</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.lip6.move.pnml.hlpn.partitions.Partition#getPartitionelements <em>Partitionelements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refpartition</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refpartition</em>' container reference.
	 * @see #setRefpartition(Partition)
	 * @see fr.lip6.move.pnml.hlpn.partitions.PartitionsPackage#getPartitionElement_Refpartition()
	 * @see fr.lip6.move.pnml.hlpn.partitions.Partition#getPartitionelements
	 * @model opposite="partitionelements" transient="false"
	 * @generated
	 */
	Partition getRefpartition();

	/**
	 * Sets the value of the '{@link fr.lip6.move.pnml.hlpn.partitions.PartitionElement#getRefpartition <em>Refpartition</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refpartition</em>' container reference.
	 * @see #getRefpartition()
	 * @generated
	 */
	void setRefpartition(Partition value);

	/**
	 * Returns the value of the '<em><b>Partitionelementconstants</b></em>' containment reference list.
	 * The list contents are of type {@link fr.lip6.move.pnml.hlpn.terms.Term}.
	 * It is bidirectional and its opposite is '{@link fr.lip6.move.pnml.hlpn.terms.Term#getContainerPartitionElement <em>Container Partition Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Partitionelementconstants</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partitionelementconstants</em>' containment reference list.
	 * @see fr.lip6.move.pnml.hlpn.partitions.PartitionsPackage#getPartitionElement_Partitionelementconstants()
	 * @see fr.lip6.move.pnml.hlpn.terms.Term#getContainerPartitionElement
	 * @model opposite="containerPartitionElement" containment="true" required="true" ordered="false"
	 *        annotation="http://www.pnml.org/models/ToPNML kind='follow'"
	 * @generated
	 */
	List<Term> getPartitionelementconstants();

	/**
	 * Return the string containing the pnml output
	 */
	@Override
	public String toPNML();

	/**
	 * set values to conform PNML document
	 */
	@Override
	public void fromPNML(OMElement subRoot, IdRefLinker idr) throws InnerBuildException, InvalidIDException,
			VoidRepositoryException;

	/**
	 * Write the PNML xml tree of this object into file
	 */
	@Override
	public void toPNML(FileChannel fc);

	@Override
	public boolean validateOCL(DiagnosticChain diagnostics);
} // PartitionElement
