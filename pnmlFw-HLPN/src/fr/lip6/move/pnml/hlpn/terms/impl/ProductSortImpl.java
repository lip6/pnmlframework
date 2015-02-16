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
package fr.lip6.move.pnml.hlpn.terms.impl;

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
import fr.lip6.move.pnml.hlpn.arbitrarydeclarations.AnySort;
import fr.lip6.move.pnml.hlpn.arbitrarydeclarations.impl.ArbitrarydeclarationsFactoryImpl;
import fr.lip6.move.pnml.hlpn.booleans.Bool;
import fr.lip6.move.pnml.hlpn.booleans.impl.BooleansFactoryImpl;
import fr.lip6.move.pnml.hlpn.cyclicEnumerations.CyclicEnumeration;
import fr.lip6.move.pnml.hlpn.cyclicEnumerations.impl.CyclicEnumerationsFactoryImpl;
import fr.lip6.move.pnml.hlpn.dots.Dot;
import fr.lip6.move.pnml.hlpn.dots.impl.DotsFactoryImpl;
import fr.lip6.move.pnml.hlpn.finiteEnumerations.FiniteEnumeration;
import fr.lip6.move.pnml.hlpn.finiteEnumerations.impl.FiniteEnumerationsFactoryImpl;
import fr.lip6.move.pnml.hlpn.finiteIntRanges.FiniteIntRange;
import fr.lip6.move.pnml.hlpn.finiteIntRanges.impl.FiniteIntRangesFactoryImpl;
import fr.lip6.move.pnml.hlpn.integers.HLInteger;
import fr.lip6.move.pnml.hlpn.integers.Natural;
import fr.lip6.move.pnml.hlpn.integers.Positive;
import fr.lip6.move.pnml.hlpn.integers.impl.IntegersFactoryImpl;
import fr.lip6.move.pnml.hlpn.lists.HLPNList;
import fr.lip6.move.pnml.hlpn.lists.impl.ListsFactoryImpl;
import fr.lip6.move.pnml.hlpn.strings.HLPNString;
import fr.lip6.move.pnml.hlpn.strings.impl.StringsFactoryImpl;
import fr.lip6.move.pnml.hlpn.terms.MultisetSort;
import fr.lip6.move.pnml.hlpn.terms.ProductSort;
import fr.lip6.move.pnml.hlpn.terms.Sort;
import fr.lip6.move.pnml.hlpn.terms.TermsFactory;
import fr.lip6.move.pnml.hlpn.terms.TermsPackage;
import fr.lip6.move.pnml.hlpn.terms.UserSort;
import fr.lip6.move.pnml.hlpn.terms.util.TermsValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Sort</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.lip6.move.pnml.hlpn.terms.impl.ProductSortImpl#getElementSort <em>Element Sort</em>}</li>
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

			java.util.List<fr.lip6.move.pnml.hlpn.terms.Sort> items = getElementSort();
			for (Iterator<Sort> iterator = items.iterator(); iterator.hasNext();) {
				Sort item = (Sort) iterator.next();

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

	@SuppressWarnings("unchecked")
	public void fromPNML(OMElement locRoot, IdRefLinker idr) throws InnerBuildException, InvalidIDException,
			VoidRepositoryException {
		//0
		//0
		//0
		//1
		@SuppressWarnings("unused")
		TermsFactory fact = TermsFactoryImpl.eINSTANCE;

		//processing id

		//processing idref

		//processing attributes

		//processing sons

		for (Iterator iterator = locRoot.getChildElements(); iterator.hasNext();) {
			@SuppressWarnings("unused")
			OMElement type = (OMElement) iterator.next();

			if (type.getLocalName().equals("multisetsort")) {
				MultisetSort item;
				item = TermsFactoryImpl.eINSTANCE.createMultisetSort();
				item.fromPNML(type, idr);

				item.setContainerProductSort(this);

				continue;
			}//end if

			if (type.getLocalName().equals("productsort")) {
				ProductSort item;
				item = TermsFactoryImpl.eINSTANCE.createProductSort();
				item.fromPNML(type, idr);

				item.setContainerProductSort(this);

				continue;
			}//end if

			if (type.getLocalName().equals("usersort")) {
				UserSort item;
				item = TermsFactoryImpl.eINSTANCE.createUserSort();
				item.fromPNML(type, idr);

				item.setContainerProductSort(this);

				continue;
			}//end if

			if (type.getLocalName().equals("anysort")) {
				AnySort item;
				item = ArbitrarydeclarationsFactoryImpl.eINSTANCE.createAnySort();
				item.fromPNML(type, idr);

				item.setContainerProductSort(this);

				continue;
			}//end if

			if (type.getLocalName().equals("null")) {
				Bool item;
				item = BooleansFactoryImpl.eINSTANCE.createBool();
				item.fromPNML(type, idr);

				item.setContainerProductSort(this);

				continue;
			}//end if

			if (type.getLocalName().equals("cyclicenumeration")) {
				CyclicEnumeration item;
				item = CyclicEnumerationsFactoryImpl.eINSTANCE.createCyclicEnumeration();
				item.fromPNML(type, idr);

				item.setContainerProductSort(this);

				continue;
			}//end if

			if (type.getLocalName().equals("dot")) {
				Dot item;
				item = DotsFactoryImpl.eINSTANCE.createDot();
				item.fromPNML(type, idr);

				item.setContainerProductSort(this);

				continue;
			}//end if

			if (type.getLocalName().equals("finiteenumeration")) {
				FiniteEnumeration item;
				item = FiniteEnumerationsFactoryImpl.eINSTANCE.createFiniteEnumeration();
				item.fromPNML(type, idr);

				item.setContainerProductSort(this);

				continue;
			}//end if

			if (type.getLocalName().equals("finiteintrange")) {
				FiniteIntRange item;
				item = FiniteIntRangesFactoryImpl.eINSTANCE.createFiniteIntRange();
				item.fromPNML(type, idr);

				item.setContainerProductSort(this);

				continue;
			}//end if

			if (type.getLocalName().equals("natural")) {
				Natural item;
				item = IntegersFactoryImpl.eINSTANCE.createNatural();
				item.fromPNML(type, idr);

				item.setContainerProductSort(this);

				continue;
			}//end if

			if (type.getLocalName().equals("positive")) {
				Positive item;
				item = IntegersFactoryImpl.eINSTANCE.createPositive();
				item.fromPNML(type, idr);

				item.setContainerProductSort(this);

				continue;
			}//end if

			if (type.getLocalName().equals("integer")) {
				HLInteger item;
				item = IntegersFactoryImpl.eINSTANCE.createHLInteger();
				item.fromPNML(type, idr);

				item.setContainerProductSort(this);

				continue;
			}//end if

			if (type.getLocalName().equals("list")) {
				HLPNList item;
				item = ListsFactoryImpl.eINSTANCE.createHLPNList();
				item.fromPNML(type, idr);

				item.setContainerProductSort(this);

				continue;
			}//end if

			if (type.getLocalName().equals("string")) {
				HLPNString item;
				item = StringsFactoryImpl.eINSTANCE.createHLPNString();
				item.fromPNML(type, idr);

				item.setContainerProductSort(this);

				continue;
			}//end if

		}

	}

	/**
	 * Return the string containing the pnml output
	 */
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
			java.util.List<fr.lip6.move.pnml.hlpn.terms.Sort> items = getElementSort();
			for (Iterator<Sort> iterator = items.iterator(); iterator.hasNext();) {
				Sort item = (Sort) iterator.next();

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
	public boolean validateOCL(DiagnosticChain diagnostics) {

		TermsValidator val = new TermsValidator();
		boolean retour = true;

		if (getElementSort() != null) {
			java.util.List<fr.lip6.move.pnml.hlpn.terms.Sort> items = getElementSort();
			for (Iterator<Sort> iterator = items.iterator(); iterator.hasNext();) {
				Sort item = (Sort) iterator.next();
				retour &= item.validateOCL(diagnostics);
			}
		}

		retour &= val.validate(this, diagnostics, null);
		return retour;

	}

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
					ProductSort mySort = (ProductSort) this;
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
