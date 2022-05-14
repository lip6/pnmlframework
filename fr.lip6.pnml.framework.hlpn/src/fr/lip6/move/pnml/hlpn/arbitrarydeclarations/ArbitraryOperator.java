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
package fr.lip6.move.pnml.hlpn.arbitrarydeclarations;

import java.nio.channels.FileChannel;
import java.util.List;

import org.apache.axiom.om.OMElement;
import org.eclipse.emf.common.util.DiagnosticChain;

import fr.lip6.move.pnml.framework.utils.IdRefLinker;
import fr.lip6.move.pnml.framework.utils.exception.InnerBuildException;
import fr.lip6.move.pnml.framework.utils.exception.InvalidIDException;
import fr.lip6.move.pnml.framework.utils.exception.VoidRepositoryException;
import fr.lip6.move.pnml.hlpn.terms.OperatorDecl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arbitrary Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.lip6.move.pnml.hlpn.arbitrarydeclarations.ArbitraryOperator#getInput <em>Input</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.hlpn.arbitrarydeclarations.ArbitraryOperator#getOutput <em>Output</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.lip6.move.pnml.hlpn.arbitrarydeclarations.ArbitrarydeclarationsPackage#getArbitraryOperator()
 * @model annotation="http://www.pnml.org/models/ToPNML tag='arbitraryoperator' kind='son'"
 * @generated
 */
public interface ArbitraryOperator extends OperatorDecl {
	/**
	 * Returns the value of the '<em><b>Input</b></em>' containment reference list.
	 * The list contents are of type {@link fr.lip6.move.pnml.hlpn.arbitrarydeclarations.AnySort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' containment reference list.
	 * @see fr.lip6.move.pnml.hlpn.arbitrarydeclarations.ArbitrarydeclarationsPackage#getArbitraryOperator_Input()
	 * @model containment="true"
	 *        annotation="http://www.pnml.org/models/ToPNML tag='input' kind='follow'"
	 * @generated
	 */
	List<AnySort> getInput();

	/**
	 * Returns the value of the '<em><b>Output</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' containment reference.
	 * @see #setOutput(AnySort)
	 * @see fr.lip6.move.pnml.hlpn.arbitrarydeclarations.ArbitrarydeclarationsPackage#getArbitraryOperator_Output()
	 * @model containment="true" required="true"
	 *        annotation="http://www.pnml.org/models/ToPNML tag='output' kind='follow'"
	 * @generated
	 */
	AnySort getOutput();

	/**
	 * Sets the value of the '{@link fr.lip6.move.pnml.hlpn.arbitrarydeclarations.ArbitraryOperator#getOutput <em>Output</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output</em>' containment reference.
	 * @see #getOutput()
	 * @generated
	 */
	void setOutput(AnySort value);

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
} // ArbitraryOperator
