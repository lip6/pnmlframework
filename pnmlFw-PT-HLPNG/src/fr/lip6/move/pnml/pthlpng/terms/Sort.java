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
package fr.lip6.move.pnml.pthlpng.terms;

import java.nio.channels.FileChannel;

import org.apache.axiom.om.OMElement;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;

import fr.lip6.move.pnml.framework.utils.IdRefLinker;
import fr.lip6.move.pnml.framework.utils.exception.InnerBuildException;
import fr.lip6.move.pnml.framework.utils.exception.InvalidIDException;
import fr.lip6.move.pnml.framework.utils.exception.VoidRepositoryException;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.Type;
import fr.lip6.move.pnml.pthlpng.multisets.All;
import fr.lip6.move.pnml.pthlpng.multisets.Empty;
import fr.lip6.move.pnml.pthlpng.partitions.Partition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sort</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.lip6.move.pnml.pthlpng.terms.Sort#getMulti <em>Multi</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.pthlpng.terms.Sort#getContainerNamedSort <em>Container Named Sort</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.pthlpng.terms.Sort#getContainerVariableDecl <em>Container Variable Decl</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.pthlpng.terms.Sort#getContainerProductSort <em>Container Product Sort</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.pthlpng.terms.Sort#getContainerType <em>Container Type</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.pthlpng.terms.Sort#getContainerAll <em>Container All</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.pthlpng.terms.Sort#getContainerEmpty <em>Container Empty</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.pthlpng.terms.Sort#getContainerPartition <em>Container Partition</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.lip6.move.pnml.pthlpng.terms.TermsPackage#getSort()
 * @model abstract="true"
 *        annotation="http://www.pnml.org/models/methods/SORT signature='boolean equalSorts(Sort sort)' body='' documentation='/**\n  * Returns true if this sort and argument sort are actually semantically the\n  * same sort, even in two different objects. \n  * <p>Ex: two FiniteEnumerations F1 = {1,4,6} and F2 = {1,4,6} or\n  * two Integers I1 and I2.</p> \n  * <p><strong>Note</strong> : the implementation available for\n  * MultisetSort is not complete. In particular, we just test equality\n  * of the references or of the enclosing NamedSorts (if any). \n  * You should consider overriding it in that case.\n  * \n  * @return true if so.\n  * @param sort\n  *            the sort to which we compare this one.\n  \052/'"
 * @generated
 */
public interface Sort extends EObject {
	/**
	 * Returns the value of the '<em><b>Multi</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.lip6.move.pnml.pthlpng.terms.MultisetSort#getBasis <em>Basis</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multi</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multi</em>' container reference.
	 * @see #setMulti(MultisetSort)
	 * @see fr.lip6.move.pnml.pthlpng.terms.TermsPackage#getSort_Multi()
	 * @see fr.lip6.move.pnml.pthlpng.terms.MultisetSort#getBasis
	 * @model opposite="basis" transient="false" ordered="false"
	 * @generated
	 */
	MultisetSort getMulti();

	/**
	 * Sets the value of the '{@link fr.lip6.move.pnml.pthlpng.terms.Sort#getMulti <em>Multi</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multi</em>' container reference.
	 * @see #getMulti()
	 * @generated
	 */
	void setMulti(MultisetSort value);

	/**
	 * Returns the value of the '<em><b>Container Named Sort</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.lip6.move.pnml.pthlpng.terms.NamedSort#getSortdef <em>Sortdef</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container Named Sort</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container Named Sort</em>' container reference.
	 * @see #setContainerNamedSort(NamedSort)
	 * @see fr.lip6.move.pnml.pthlpng.terms.TermsPackage#getSort_ContainerNamedSort()
	 * @see fr.lip6.move.pnml.pthlpng.terms.NamedSort#getSortdef
	 * @model opposite="sortdef" transient="false"
	 * @generated
	 */
	NamedSort getContainerNamedSort();

	/**
	 * Sets the value of the '{@link fr.lip6.move.pnml.pthlpng.terms.Sort#getContainerNamedSort <em>Container Named Sort</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container Named Sort</em>' container reference.
	 * @see #getContainerNamedSort()
	 * @generated
	 */
	void setContainerNamedSort(NamedSort value);

	/**
	 * Returns the value of the '<em><b>Container Variable Decl</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.lip6.move.pnml.pthlpng.terms.VariableDecl#getSort <em>Sort</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container Variable Decl</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container Variable Decl</em>' container reference.
	 * @see #setContainerVariableDecl(VariableDecl)
	 * @see fr.lip6.move.pnml.pthlpng.terms.TermsPackage#getSort_ContainerVariableDecl()
	 * @see fr.lip6.move.pnml.pthlpng.terms.VariableDecl#getSort
	 * @model opposite="sort" transient="false"
	 * @generated
	 */
	VariableDecl getContainerVariableDecl();

	/**
	 * Sets the value of the '{@link fr.lip6.move.pnml.pthlpng.terms.Sort#getContainerVariableDecl <em>Container Variable Decl</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container Variable Decl</em>' container reference.
	 * @see #getContainerVariableDecl()
	 * @generated
	 */
	void setContainerVariableDecl(VariableDecl value);

	/**
	 * Returns the value of the '<em><b>Container Product Sort</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.lip6.move.pnml.pthlpng.terms.ProductSort#getElementSort <em>Element Sort</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container Product Sort</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container Product Sort</em>' container reference.
	 * @see #setContainerProductSort(ProductSort)
	 * @see fr.lip6.move.pnml.pthlpng.terms.TermsPackage#getSort_ContainerProductSort()
	 * @see fr.lip6.move.pnml.pthlpng.terms.ProductSort#getElementSort
	 * @model opposite="elementSort" transient="false"
	 * @generated
	 */
	ProductSort getContainerProductSort();

	/**
	 * Sets the value of the '{@link fr.lip6.move.pnml.pthlpng.terms.Sort#getContainerProductSort <em>Container Product Sort</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container Product Sort</em>' container reference.
	 * @see #getContainerProductSort()
	 * @generated
	 */
	void setContainerProductSort(ProductSort value);

	/**
	 * Returns the value of the '<em><b>Container Type</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.lip6.move.pnml.pthlpng.hlcorestructure.Type#getStructure <em>Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container Type</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container Type</em>' container reference.
	 * @see #setContainerType(Type)
	 * @see fr.lip6.move.pnml.pthlpng.terms.TermsPackage#getSort_ContainerType()
	 * @see fr.lip6.move.pnml.pthlpng.hlcorestructure.Type#getStructure
	 * @model opposite="structure" transient="false"
	 * @generated
	 */
	Type getContainerType();

	/**
	 * Sets the value of the '{@link fr.lip6.move.pnml.pthlpng.terms.Sort#getContainerType <em>Container Type</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container Type</em>' container reference.
	 * @see #getContainerType()
	 * @generated
	 */
	void setContainerType(Type value);

	/**
	 * Returns the value of the '<em><b>Container All</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.lip6.move.pnml.pthlpng.multisets.All#getRefsort <em>Refsort</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container All</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container All</em>' container reference.
	 * @see #setContainerAll(All)
	 * @see fr.lip6.move.pnml.pthlpng.terms.TermsPackage#getSort_ContainerAll()
	 * @see fr.lip6.move.pnml.pthlpng.multisets.All#getRefsort
	 * @model opposite="refsort" transient="false"
	 * @generated
	 */
	All getContainerAll();

	/**
	 * Sets the value of the '{@link fr.lip6.move.pnml.pthlpng.terms.Sort#getContainerAll <em>Container All</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container All</em>' container reference.
	 * @see #getContainerAll()
	 * @generated
	 */
	void setContainerAll(All value);

	/**
	 * Returns the value of the '<em><b>Container Empty</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.lip6.move.pnml.pthlpng.multisets.Empty#getRefsort <em>Refsort</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container Empty</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container Empty</em>' container reference.
	 * @see #setContainerEmpty(Empty)
	 * @see fr.lip6.move.pnml.pthlpng.terms.TermsPackage#getSort_ContainerEmpty()
	 * @see fr.lip6.move.pnml.pthlpng.multisets.Empty#getRefsort
	 * @model opposite="refsort" transient="false"
	 * @generated
	 */
	Empty getContainerEmpty();

	/**
	 * Sets the value of the '{@link fr.lip6.move.pnml.pthlpng.terms.Sort#getContainerEmpty <em>Container Empty</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container Empty</em>' container reference.
	 * @see #getContainerEmpty()
	 * @generated
	 */
	void setContainerEmpty(Empty value);

	/**
	 * Returns the value of the '<em><b>Container Partition</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.lip6.move.pnml.pthlpng.partitions.Partition#getDef <em>Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container Partition</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container Partition</em>' container reference.
	 * @see #setContainerPartition(Partition)
	 * @see fr.lip6.move.pnml.pthlpng.terms.TermsPackage#getSort_ContainerPartition()
	 * @see fr.lip6.move.pnml.pthlpng.partitions.Partition#getDef
	 * @model opposite="def" transient="false" ordered="false"
	 * @generated
	 */
	Partition getContainerPartition();

	/**
	 * Sets the value of the '{@link fr.lip6.move.pnml.pthlpng.terms.Sort#getContainerPartition <em>Container Partition</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container Partition</em>' container reference.
	 * @see #getContainerPartition()
	 * @generated
	 */
	void setContainerPartition(Partition value);

	public abstract String toPNML();

	public abstract void fromPNML(OMElement locRoot, IdRefLinker idr) throws InnerBuildException, InvalidIDException,
			VoidRepositoryException;

	public abstract void toPNML(FileChannel fc);

	public abstract boolean validateOCL(DiagnosticChain diagnostics);

	/**
	 * Returns true if this sort and argument sort are actually semantically the
	 * same sort, even in two different objects. 
	 * <p>Ex: two FiniteEnumerations F1 = {1,4,6} and F2 = {1,4,6} or
	 * two Integers I1 and I2.</p> 
	 * <p><strong>Note</strong> : the implementation available for
	 * MultisetSort is not complete. In particular, we just test equality
	 * of the references or of the enclosing NamedSorts (if any). 
	 * You should consider overriding it in that case.
	 * 
	 * @return true if so.
	 * @param sort
	 *            the sort to which we compare this one.
	 */
	boolean equalSorts(Sort sort);

} // Sort
