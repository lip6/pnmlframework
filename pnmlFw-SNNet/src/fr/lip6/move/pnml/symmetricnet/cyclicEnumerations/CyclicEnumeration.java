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
package fr.lip6.move.pnml.symmetricnet.cyclicEnumerations;

import java.nio.channels.FileChannel;

import org.apache.axiom.om.OMElement;
import org.eclipse.emf.common.util.DiagnosticChain;

import fr.lip6.move.pnml.framework.utils.IdRefLinker;
import fr.lip6.move.pnml.framework.utils.exception.InnerBuildException;
import fr.lip6.move.pnml.framework.utils.exception.InvalidIDException;
import fr.lip6.move.pnml.framework.utils.exception.VoidRepositoryException;
import fr.lip6.move.pnml.symmetricnet.finiteEnumerations.FiniteEnumeration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cyclic Enumeration</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see fr.lip6.move.pnml.symmetricnet.cyclicEnumerations.CyclicEnumerationsPackage#getCyclicEnumeration()
 * @model annotation="http://www.pnml.org/models/ToPNML tag='cyclicenumeration' kind='son'"
 *        annotation="http://www.pnml.org/models/methods/SORT signature='boolean equalSorts(Sort sort)' body='boolean isEqual = false;\n\t\tif (this.eClass().getName().equalsIgnoreCase(sort.eClass().getName())) {\n\t\t\tif (this.getContainerNamedSort() != null\n\t\t\t\t\t&& sort.getContainerNamedSort() != null) {\n\t\t\t\tisEqual = this.getContainerNamedSort().getName()\n\t\t\t\t\t\t.equalsIgnoreCase(\n\t\t\t\t\t\t\t\tsort.getContainerNamedSort().getName());\n\t\t\t} else {\n\t\t\t\tif (\"CyclicEnumeration\".equalsIgnoreCase(this.eClass().getName())) {\n\t\t\t\t\tCyclicEnumeration myFE = (CyclicEnumeration) this;\n\t\t\t\t\tCyclicEnumeration thatFE = (CyclicEnumeration) sort;\n\t\t\t\t\tList<FEConstant> myConstants = myFE.getElements();\n\t\t\t\t\tList<FEConstant> thoseConstants = thatFE.getElements();\n\t\t\t\t\tint i = 0;\n\t\t\t\t\tint j = 0;\n\t\t\t\t\t\n\t\t\t\t\tfor (; i < myConstants.size() && j < thoseConstants.size(); i++, j++) {\n\t\t\t\t\t\tif (myConstants\n\t\t\t\t\t\t\t\t.get(i)\n\t\t\t\t\t\t\t\t.getName()\n\t\t\t\t\t\t\t\t.equalsIgnoreCase(\n\t\t\t\t\t\t\t\t\t\tthoseConstants.get(j).getName())) {\n\t\t\t\t\t\t\tisEqual = true;\n\t\t\t\t\t\t} else {\n\t\t\t\t\t\t\tisEqual = false;\n\t\t\t\t\t\t\tbreak;\n\t\t\t\t\t\t}\n\t\t\t\t\t}\n\t\t\t\t}\n\t\t\t}\n\t\t}\n\t\treturn isEqual;' documentation='/**\r * Returns true if this sort and argument sort are actually \r * semantically the same sort, even in two different objects.\r * Ex: two FiniteEnumerations or two Integers.\r * @return true if so. \r * @param sort the sort to which we compare this one. \r \052/'"
 * @generated
 */
public interface CyclicEnumeration extends FiniteEnumeration {

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
} // CyclicEnumeration
