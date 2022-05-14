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
package fr.lip6.move.pnml.pthlpng.terms;

import java.nio.channels.FileChannel;

import org.apache.axiom.om.OMElement;
import org.eclipse.emf.common.util.DiagnosticChain;

import fr.lip6.move.pnml.framework.utils.IdRefLinker;
import fr.lip6.move.pnml.framework.utils.exception.InnerBuildException;
import fr.lip6.move.pnml.framework.utils.exception.InvalidIDException;
import fr.lip6.move.pnml.framework.utils.exception.VoidRepositoryException;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>User
 * Sort</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link fr.lip6.move.pnml.pthlpng.terms.UserSort#getDeclaration
 * <em>Declaration</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.lip6.move.pnml.pthlpng.terms.TermsPackage#getUserSort()
 * @model annotation="http://www.pnml.org/models/ToPNML tag='usersort'
 *        kind='son'" annotation="http://www.pnml.org/models/HLAPI"
 *        annotation="http://www.pnml.org/models/methods/SORT signature='boolean
 *        equalSorts(Sort sort)' body='boolean isEqual = false;\n\t\tif
 *        (this.eClass().getName().equalsIgnoreCase(sort.eClass().getName()))
 *        {\n\t\t\tif (this.getContainerNamedSort() !=
 *        null\n\t\t\t\t\t&amp;&amp; sort.getContainerNamedSort() != null)
 *        {\n\t\t\t\tisEqual =
 *        this.getContainerNamedSort().getName()\n\t\t\t\t\t\t.equalsIgnoreCase(\n\t\t\t\t\t\t\t\tsort.getContainerNamedSort().getName());\n\t\t\t}
 *        else {\n\t\t\t\t//further sub-classes must override this
 *        method.\n\t\t\t\tif
 *        (\"UserSort\".equalsIgnoreCase(this.eClass().getName()))
 *        {\n\t\t\t\t\tisEqual = ((UserSort)
 *        this).getDeclaration().getName()\n\t\t\t\t\t\t\t.equalsIgnoreCase(\n\t\t\t\t\t\t\t\t\t((UserSort)
 *        sort).getDeclaration()\n\t\t\t\t\t\t\t\t\t\t\t.getName());\n\t\t\t\t}\n\t\t\t}\n\t\t}\n\t\treturn
 *        isEqual;' documentation='/**\r * Returns true if this sort and
 *        argument sort are actually \r * semantically the same sort, even in
 *        two different objects.\r * Ex: two FiniteEnumerations or two
 *        Integers.\r * @return true if so. \r * @param sort the sort to which
 *        we compare this one. \r \052/'"
 * @generated
 */
public interface UserSort extends Sort {
	/**
	 * Returns the value of the '<em><b>Declaration</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Declaration</em>' reference isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Declaration</em>' reference.
	 * @see #setDeclaration(SortDecl)
	 * @see fr.lip6.move.pnml.pthlpng.terms.TermsPackage#getUserSort_Declaration()
	 * @model required="true" ordered="false"
	 *        annotation="http://www.pnml.org/models/ToPNML tag='declaration'
	 *        kind='idref'"
	 * @generated
	 */
	SortDecl getDeclaration();

	/**
	 * Sets the value of the
	 * '{@link fr.lip6.move.pnml.pthlpng.terms.UserSort#getDeclaration
	 * <em>Declaration</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value the new value of the '<em>Declaration</em>' reference.
	 * @see #getDeclaration()
	 * @generated
	 */
	void setDeclaration(SortDecl value);

	/**
	 * Return the string containing the pnml output
	 */
	@Override
	public String toPNML();

	/**
	 * set values to conform PNML document
	 */
	@Override
	public void fromPNML(OMElement subRoot, IdRefLinker idr)
			throws InnerBuildException, InvalidIDException, VoidRepositoryException;

	/**
	 * Write the PNML xml tree of this object into file
	 */
	@Override
	public void toPNML(FileChannel fc);

	@Override
	public boolean validateOCL(DiagnosticChain diagnostics);
} // UserSort
