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
package fr.lip6.move.pnml.symmetricnet.cyclicEnumerations.impl;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.List;

import org.apache.axiom.om.OMElement;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;

import fr.lip6.move.pnml.framework.general.PnmlExport;
import fr.lip6.move.pnml.framework.utils.IdRefLinker;
import fr.lip6.move.pnml.framework.utils.ModelRepository;
import fr.lip6.move.pnml.framework.utils.PNMLEncoding;
import fr.lip6.move.pnml.framework.utils.PrettyPrintData;
import fr.lip6.move.pnml.framework.utils.exception.InnerBuildException;
import fr.lip6.move.pnml.framework.utils.exception.InvalidIDException;
import fr.lip6.move.pnml.framework.utils.exception.VoidRepositoryException;
import fr.lip6.move.pnml.symmetricnet.cyclicEnumerations.CyclicEnumeration;
import fr.lip6.move.pnml.symmetricnet.cyclicEnumerations.CyclicEnumerationsFactory;
import fr.lip6.move.pnml.symmetricnet.cyclicEnumerations.CyclicEnumerationsPackage;
import fr.lip6.move.pnml.symmetricnet.finiteEnumerations.FEConstant;
import fr.lip6.move.pnml.symmetricnet.finiteEnumerations.FiniteEnumerationsFactory;
import fr.lip6.move.pnml.symmetricnet.finiteEnumerations.impl.FiniteEnumerationImpl;
import fr.lip6.move.pnml.symmetricnet.terms.Sort;
import fr.lip6.move.pnml.symmetricnet.terms.util.TermsValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cyclic Enumeration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class CyclicEnumerationImpl extends FiniteEnumerationImpl implements CyclicEnumeration {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CyclicEnumerationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CyclicEnumerationsPackage.Literals.CYCLIC_ENUMERATION;
	}

	/**
	 * Return the string containing the pnml output
	 */
	@Override
	public String toPNML() {
		//id 0
		//idref 0
		//attributes 0
		//sons 1

		Boolean prettyPrintStatus = ModelRepository.getInstance().isPrettyPrintActive();
		String retline = "";
		String headline = "";
		PrettyPrintData prpd = null;
		if (prettyPrintStatus) {
			retline = "\n";
			prpd = ModelRepository.getInstance().getPrettyPrintData();
			headline = prpd.getCurrentLineHeader();
		}

		StringBuilder sb = new StringBuilder();
		sb.append(headline);
		sb.append("<cyclicenumeration");
		if (prettyPrintStatus) {
			headline = prpd.increaseLineHeaderLevel();
		}
		//begin attributes, id and id ref processing

		boolean haveSons = false;
		sb.append(">");
		sb.append(retline);

		//sons, follow processing

		if (getElements() != null) {

			java.util.List<fr.lip6.move.pnml.symmetricnet.finiteEnumerations.FEConstant> items = getElements();
			for (Iterator<FEConstant> iterator = items.iterator(); iterator.hasNext();) {
				FEConstant item = iterator.next();

				sb.append(item.toPNML());

				haveSons = true;
			}

		}

		/****/

		if (prettyPrintStatus) {
			headline = prpd.decreaseLineHeaderLevel();
		}

		if (haveSons) {
			sb.append(headline);
			sb.append("</cyclicenumeration>");
			sb.append(retline);
		} else {
			sb.delete(sb.lastIndexOf(">"), sb.length());
			sb.append("/>");
		}

		return sb.toString();
	}

	@Override
	@SuppressWarnings("unchecked")
	public void fromPNML(OMElement locRoot, IdRefLinker idr) throws InnerBuildException, InvalidIDException,
			VoidRepositoryException {
		//0
		//0
		//0
		//1
		@SuppressWarnings("unused")
		CyclicEnumerationsFactory fact = CyclicEnumerationsFactory.eINSTANCE;

		//processing id

		//processing idref

		//processing attributes

		//processing sons

		for (Iterator iterator = locRoot.getChildElements(); iterator.hasNext();) {
			@SuppressWarnings("unused")
			OMElement type = (OMElement) iterator.next();

			if (type.getLocalName().equals("feconstant")) {
				FEConstant item;
				item = FiniteEnumerationsFactory.eINSTANCE.createFEConstant();
				item.fromPNML(type, idr);

				item.setSort(this);

				continue;
			}//end if

		}

	}

	/**
	 * Return the string containing the pnml output
	 */
	@Override
	public void toPNML(FileChannel fc) {
		//id 0
		//idref 0
		//attributes 0
		//sons 1

		final int bufferSizeKB = 8;
		final int bufferSize = bufferSizeKB * 1024;
		final ByteBuffer bytebuf = ByteBuffer.allocateDirect(bufferSize);
		final String charsetEncoding = PNMLEncoding.ISO_8859_1.getName();

		Boolean prettyPrintStatus = ModelRepository.getInstance().isPrettyPrintActive();
		String retline = "";
		String headline = "";
		PrettyPrintData prpd = null;
		if (prettyPrintStatus) {
			retline = "\n";
			prpd = ModelRepository.getInstance().getPrettyPrintData();
			headline = prpd.getCurrentLineHeader();
		}

		StringBuilder sb = new StringBuilder();
		sb.append(headline);
		sb.append("<cyclicenumeration");
		if (prettyPrintStatus) {
			headline = prpd.increaseLineHeaderLevel();
		}
		//begin attributes, id and id ref processing

		boolean haveSons = false;
		sb.append(">");
		sb.append(retline);

		//sons, follow processing

		if (getElements() != null) {

			try {
				writeIntoStream(bytebuf, fc, sb.toString().getBytes(Charset.forName(charsetEncoding)));
			} catch (IOException io) {
				io.printStackTrace();
				// fail fast
				return;
			}
			sb.delete(0, sb.length());
			java.util.List<fr.lip6.move.pnml.symmetricnet.finiteEnumerations.FEConstant> items = getElements();
			for (Iterator<FEConstant> iterator = items.iterator(); iterator.hasNext();) {
				FEConstant item = iterator.next();

				item.toPNML(fc);

				haveSons = true;
			}

		}

		/****/

		if (prettyPrintStatus) {
			headline = prpd.decreaseLineHeaderLevel();
		}

		sb.append(headline);
		sb.append("</cyclicenumeration>");
		sb.append(retline);

		try {
			writeIntoStream(bytebuf, fc, sb.toString().getBytes(Charset.forName(charsetEncoding)));
		} catch (IOException io) {
			io.printStackTrace();
			// fail fast
			return;
		}
		sb = null;
	}

	/**
	 * Writes buffer of a given max size into file channel.
	 */
	private static final void writeIntoStream(final ByteBuffer bytebuf, final FileChannel fc, final byte[] contents)
			throws IOException {
		final int chopSize = 6 * 1024;
		if (contents.length >= bytebuf.capacity()) {
			List<byte[]> chops = PnmlExport.chopBytes(contents, chopSize);
			for (byte[] buf : chops) {
				bytebuf.put(buf);
				bytebuf.flip();
				fc.write(bytebuf);
				bytebuf.clear();
			}
		} else {
			bytebuf.put(contents);
			bytebuf.flip();
			fc.write(bytebuf);
			bytebuf.clear();
		}
	}

	/**
	 * -
	 */
	@Override
	public boolean validateOCL(DiagnosticChain diagnostics) {

		TermsValidator val = new TermsValidator();
		boolean retour = true;

		if (getElements() != null) {
			java.util.List<fr.lip6.move.pnml.symmetricnet.finiteEnumerations.FEConstant> items = getElements();
			for (Iterator<FEConstant> iterator = items.iterator(); iterator.hasNext();) {
				FEConstant item = iterator.next();
				retour &= item.validateOCL(diagnostics);
			}
		}

		retour &= val.validate(this, diagnostics, null);
		return retour;

	}

	@Override
	public boolean equalSorts(Sort sort) {
		boolean isEqual = false;
		if (this.eClass().getName().equalsIgnoreCase(sort.eClass().getName())) {
			if (this.getContainerNamedSort() != null && sort.getContainerNamedSort() != null) {
				isEqual = this.getContainerNamedSort().getName()
						.equalsIgnoreCase(sort.getContainerNamedSort().getName());
			} else {
				if ("CyclicEnumeration".equalsIgnoreCase(this.eClass().getName())) {
					CyclicEnumeration myFE = this;
					CyclicEnumeration thatFE = (CyclicEnumeration) sort;
					List<FEConstant> myConstants = myFE.getElements();
					List<FEConstant> thoseConstants = thatFE.getElements();
					int i = 0;
					int j = 0;

					for (; i < myConstants.size() && j < thoseConstants.size(); i++, j++) {
						if (myConstants.get(i).getName().equalsIgnoreCase(thoseConstants.get(j).getName())) {
							isEqual = true;
						} else {
							isEqual = false;
							break;
						}
					}
				}
			}
		}
		return isEqual;

	}

} //CyclicEnumerationImpl
