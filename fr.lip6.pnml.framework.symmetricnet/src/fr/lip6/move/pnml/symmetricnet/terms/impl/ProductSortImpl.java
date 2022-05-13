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
package fr.lip6.move.pnml.symmetricnet.terms.impl;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.apache.axiom.om.OMElement;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import fr.lip6.move.pnml.framework.general.PnmlExport;
import fr.lip6.move.pnml.framework.utils.IdRefLinker;
import fr.lip6.move.pnml.framework.utils.ModelRepository;
import fr.lip6.move.pnml.framework.utils.PNMLEncoding;
import fr.lip6.move.pnml.framework.utils.PrettyPrintData;
import fr.lip6.move.pnml.framework.utils.exception.InnerBuildException;
import fr.lip6.move.pnml.framework.utils.exception.InvalidIDException;
import fr.lip6.move.pnml.framework.utils.exception.VoidRepositoryException;
import fr.lip6.move.pnml.symmetricnet.booleans.Bool;
import fr.lip6.move.pnml.symmetricnet.booleans.BooleansFactory;
import fr.lip6.move.pnml.symmetricnet.cyclicEnumerations.CyclicEnumeration;
import fr.lip6.move.pnml.symmetricnet.cyclicEnumerations.CyclicEnumerationsFactory;
import fr.lip6.move.pnml.symmetricnet.dots.Dot;
import fr.lip6.move.pnml.symmetricnet.dots.DotsFactory;
import fr.lip6.move.pnml.symmetricnet.finiteEnumerations.FiniteEnumeration;
import fr.lip6.move.pnml.symmetricnet.finiteEnumerations.FiniteEnumerationsFactory;
import fr.lip6.move.pnml.symmetricnet.finiteIntRanges.FiniteIntRange;
import fr.lip6.move.pnml.symmetricnet.finiteIntRanges.FiniteIntRangesFactory;
import fr.lip6.move.pnml.symmetricnet.integers.HLInteger;
import fr.lip6.move.pnml.symmetricnet.integers.IntegersFactory;
import fr.lip6.move.pnml.symmetricnet.integers.Natural;
import fr.lip6.move.pnml.symmetricnet.integers.Positive;
import fr.lip6.move.pnml.symmetricnet.terms.MultisetSort;
import fr.lip6.move.pnml.symmetricnet.terms.ProductSort;
import fr.lip6.move.pnml.symmetricnet.terms.Sort;
import fr.lip6.move.pnml.symmetricnet.terms.TermsFactory;
import fr.lip6.move.pnml.symmetricnet.terms.TermsPackage;
import fr.lip6.move.pnml.symmetricnet.terms.UserSort;
import fr.lip6.move.pnml.symmetricnet.terms.util.TermsValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Sort</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.lip6.move.pnml.symmetricnet.terms.impl.ProductSortImpl#getElementSort <em>Element Sort</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProductSortImpl extends SortImpl implements ProductSort {
	/**
	 * The cached value of the '{@link #getElementSort() <em>Element Sort</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementSort()
	 * @generated
	 * @ordered
	 */
	protected EList<Sort> elementSort;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductSortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TermsPackage.Literals.PRODUCT_SORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<Sort> getElementSort() {
		if (elementSort == null) {
			elementSort = new EObjectContainmentWithInverseEList<Sort>(Sort.class, this,
					TermsPackage.PRODUCT_SORT__ELEMENT_SORT, TermsPackage.SORT__CONTAINER_PRODUCT_SORT);
		}
		return elementSort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TermsPackage.PRODUCT_SORT__ELEMENT_SORT:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getElementSort()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TermsPackage.PRODUCT_SORT__ELEMENT_SORT:
			return ((InternalEList<?>) getElementSort()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TermsPackage.PRODUCT_SORT__ELEMENT_SORT:
			return getElementSort();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case TermsPackage.PRODUCT_SORT__ELEMENT_SORT:
			getElementSort().clear();
			getElementSort().addAll((Collection<? extends Sort>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case TermsPackage.PRODUCT_SORT__ELEMENT_SORT:
			getElementSort().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case TermsPackage.PRODUCT_SORT__ELEMENT_SORT:
			return elementSort != null && !elementSort.isEmpty();
		}
		return super.eIsSet(featureID);
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
		sb.append("<productsort");
		if (prettyPrintStatus) {
			headline = prpd.increaseLineHeaderLevel();
		}
		//begin attributes, id and id ref processing

		boolean haveSons = false;
		sb.append(">");
		sb.append(retline);

		//sons, follow processing

		if (getElementSort() != null) {

			java.util.List<fr.lip6.move.pnml.symmetricnet.terms.Sort> items = getElementSort();
			for (Iterator<Sort> iterator = items.iterator(); iterator.hasNext();) {
				Sort item = iterator.next();

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
			sb.append("</productsort>");
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
		TermsFactory fact = TermsFactory.eINSTANCE;

		//processing id

		//processing idref

		//processing attributes

		//processing sons

		for (Iterator iterator = locRoot.getChildElements(); iterator.hasNext();) {
			@SuppressWarnings("unused")
			OMElement type = (OMElement) iterator.next();

			if (type.getLocalName().equals("multisetsort")) {
				MultisetSort item;
				item = TermsFactory.eINSTANCE.createMultisetSort();
				item.fromPNML(type, idr);

				item.setContainerProductSort(this);

				continue;
			}//end if

			if (type.getLocalName().equals("productsort")) {
				ProductSort item;
				item = TermsFactory.eINSTANCE.createProductSort();
				item.fromPNML(type, idr);

				item.setContainerProductSort(this);

				continue;
			}//end if

			if (type.getLocalName().equals("usersort")) {
				UserSort item;
				item = TermsFactory.eINSTANCE.createUserSort();
				item.fromPNML(type, idr);

				item.setContainerProductSort(this);

				continue;
			}//end if

			if (type.getLocalName().equals("null")) {
				Bool item;
				item = BooleansFactory.eINSTANCE.createBool();
				item.fromPNML(type, idr);

				item.setContainerProductSort(this);

				continue;
			}//end if

			if (type.getLocalName().equals("cyclicenumeration")) {
				CyclicEnumeration item;
				item = CyclicEnumerationsFactory.eINSTANCE.createCyclicEnumeration();
				item.fromPNML(type, idr);

				item.setContainerProductSort(this);

				continue;
			}//end if

			if (type.getLocalName().equals("dot")) {
				Dot item;
				item = DotsFactory.eINSTANCE.createDot();
				item.fromPNML(type, idr);

				item.setContainerProductSort(this);

				continue;
			}//end if

			if (type.getLocalName().equals("finiteenumeration")) {
				FiniteEnumeration item;
				item = FiniteEnumerationsFactory.eINSTANCE.createFiniteEnumeration();
				item.fromPNML(type, idr);

				item.setContainerProductSort(this);

				continue;
			}//end if

			if (type.getLocalName().equals("finiteintrange")) {
				FiniteIntRange item;
				item = FiniteIntRangesFactory.eINSTANCE.createFiniteIntRange();
				item.fromPNML(type, idr);

				item.setContainerProductSort(this);

				continue;
			}//end if

			if (type.getLocalName().equals("natural")) {
				Natural item;
				item = IntegersFactory.eINSTANCE.createNatural();
				item.fromPNML(type, idr);

				item.setContainerProductSort(this);

				continue;
			}//end if

			if (type.getLocalName().equals("positive")) {
				Positive item;
				item = IntegersFactory.eINSTANCE.createPositive();
				item.fromPNML(type, idr);

				item.setContainerProductSort(this);

				continue;
			}//end if

			if (type.getLocalName().equals("integer")) {
				HLInteger item;
				item = IntegersFactory.eINSTANCE.createHLInteger();
				item.fromPNML(type, idr);

				item.setContainerProductSort(this);

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
		final String charsetEncoding = PNMLEncoding.UTF_8.getName();

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
		sb.append("<productsort");
		if (prettyPrintStatus) {
			headline = prpd.increaseLineHeaderLevel();
		}
		//begin attributes, id and id ref processing

		boolean haveSons = false;
		sb.append(">");
		sb.append(retline);

		//sons, follow processing

		if (getElementSort() != null) {

			try {
				writeIntoStream(bytebuf, fc, sb.toString().getBytes(Charset.forName(charsetEncoding)));
			} catch (IOException io) {
				io.printStackTrace();
				// fail fast
				return;
			}
			sb.delete(0, sb.length());
			java.util.List<fr.lip6.move.pnml.symmetricnet.terms.Sort> items = getElementSort();
			for (Iterator<Sort> iterator = items.iterator(); iterator.hasNext();) {
				Sort item = iterator.next();

				item.toPNML(fc);

				haveSons = true;
			}

		}

		/****/

		if (prettyPrintStatus) {
			headline = prpd.decreaseLineHeaderLevel();
		}

		sb.append(headline);
		sb.append("</productsort>");
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

		if (getElementSort() != null) {
			java.util.List<fr.lip6.move.pnml.symmetricnet.terms.Sort> items = getElementSort();
			for (Iterator<Sort> iterator = items.iterator(); iterator.hasNext();) {
				Sort item = iterator.next();
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
				// Someone may one day inherit from ProductSort, so we should
				// strictly check for ProductSort only. Further sub-classes must 
				//override this method.
				if ("ProductSort".equalsIgnoreCase(this.eClass().getName())) {
					ProductSort mySort = this;
					ProductSort thatSort = (ProductSort) sort;
					List<Sort> myElements = mySort.getElementSort();
					List<Sort> thoseElements = thatSort.getElementSort();
					int i = 0;
					int j = 0;
					for (; i < myElements.size() && j < thoseElements.size(); i++, j++) {
						if (myElements.get(i).eClass().getName()
								.equalsIgnoreCase(thoseElements.get(j).eClass().getName())) {
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

} //ProductSortImpl
