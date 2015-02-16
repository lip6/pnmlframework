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
package fr.lip6.move.pnml.hlpn.terms;

import java.nio.channels.FileChannel;
import java.util.List;

import org.apache.axiom.om.OMElement;
import org.eclipse.emf.common.util.DiagnosticChain;

import fr.lip6.move.pnml.framework.utils.IdRefLinker;
import fr.lip6.move.pnml.framework.utils.exception.InnerBuildException;
import fr.lip6.move.pnml.framework.utils.exception.InvalidIDException;
import fr.lip6.move.pnml.framework.utils.exception.VoidRepositoryException;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Sort</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.lip6.move.pnml.hlpn.terms.ProductSort#getElementSort <em>Element Sort</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.lip6.move.pnml.hlpn.terms.TermsPackage#getProductSort()
 * @model annotation="http://www.pnml.org/models/ToPNML tag='productsort' kind='son'"
 *        annotation="http://www.pnml.org/models/methods/SORT signature='boolean equalSorts(Sort sort)' body='boolean isEqual = false;\n\t\tif (this.eClass().getName().equalsIgnoreCase(sort.eClass().getName())) {\n\t\t\tif (this.getContainerNamedSort() != null\n\t\t\t\t\t&& sort.getContainerNamedSort() != null) {\n\t\t\t\tisEqual = this.getContainerNamedSort().getName()\n\t\t\t\t\t\t.equalsIgnoreCase(\n\t\t\t\t\t\t\t\tsort.getContainerNamedSort().getName());\n\t\t\t} else {\n\t\t\t\t// Someone may one day inherit from ProductSort, so we should\n\t\t\t\t// strictly check for ProductSort only. Further sub-classes must \n\t\t\t\t//override this method.\n\t\t\t\tif (\"ProductSort\".equalsIgnoreCase(this.eClass().getName())) {\n\t\t\t\t\tProductSort mySort = (ProductSort) this;\n\t\t\t\t\tProductSort thatSort = (ProductSort) sort;\n\t\t\t\t\tList<Sort> myElements = mySort.getElementSort();\n\t\t\t\t\tList<Sort> thoseElements = thatSort.getElementSort();\n\t\t\t\t\tint i = 0;\n\t\t\t\t\tint j = 0;\n\t\t\t\t\tfor (; i < myElements.size() && j < thoseElements.size(); i++, j++) {\n\t\t\t\t\t\tif (myElements\n\t\t\t\t\t\t\t\t.get(i)\n\t\t\t\t\t\t\t\t.eClass()\n\t\t\t\t\t\t\t\t.getName()\n\t\t\t\t\t\t\t\t.equalsIgnoreCase(\n\t\t\t\t\t\t\t\t\t\tthoseElements.get(j).eClass().getName())) {\n\t\t\t\t\t\t\tisEqual = true;\n\t\t\t\t\t\t} else {\n\t\t\t\t\t\t\tisEqual = false;\n\t\t\t\t\t\t\tbreak;\n\t\t\t\t\t\t}\n\t\t\t\t\t}\n\t\t\t\t}\t\t\n\t\t\t}\n\t\t}\n\t\treturn isEqual;' documentation='/**\r * Returns true if this sort and argument sort are actually \r * semantically the same sort, even in two different objects.\r * Ex: two FiniteEnumerations or two Integers.\r * @return true if so. \r * @param sort the sort to which we compare this one. \r \052/'"
 * @generated
 */
public interface ProductSort extends Sort {
	/**
	 * Returns the value of the '<em><b>Element Sort</b></em>' containment reference list.
	 * The list contents are of type {@link fr.lip6.move.pnml.hlpn.terms.Sort}.
	 * It is bidirectional and its opposite is '{@link fr.lip6.move.pnml.hlpn.terms.Sort#getContainerProductSort <em>Container Product Sort</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element Sort</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Sort</em>' containment reference list.
	 * @see fr.lip6.move.pnml.hlpn.terms.TermsPackage#getProductSort_ElementSort()
	 * @see fr.lip6.move.pnml.hlpn.terms.Sort#getContainerProductSort
	 * @model opposite="containerProductSort" containment="true"
	 *        annotation="http://www.pnml.org/models/ToPNML kind='follow'"
	 * @generated
	 */
	List<Sort> getElementSort();

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
} // ProductSort
