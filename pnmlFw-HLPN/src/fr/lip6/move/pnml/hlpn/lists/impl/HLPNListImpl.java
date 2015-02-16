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
package fr.lip6.move.pnml.hlpn.lists.impl;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.List;

import org.apache.axiom.om.OMElement;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import fr.lip6.move.pnml.framework.general.PnmlExport;
import fr.lip6.move.pnml.framework.utils.IdRefLinker;
import fr.lip6.move.pnml.framework.utils.ModelRepository;
import fr.lip6.move.pnml.framework.utils.PNMLEncoding;
import fr.lip6.move.pnml.framework.utils.PrettyPrintData;
import fr.lip6.move.pnml.framework.utils.exception.InnerBuildException;
import fr.lip6.move.pnml.framework.utils.exception.InvalidIDException;
import fr.lip6.move.pnml.framework.utils.exception.VoidRepositoryException;
import fr.lip6.move.pnml.hlpn.arbitrarydeclarations.AnySort;
import fr.lip6.move.pnml.hlpn.arbitrarydeclarations.ArbitrarydeclarationsFactory;
import fr.lip6.move.pnml.hlpn.booleans.Bool;
import fr.lip6.move.pnml.hlpn.booleans.BooleansFactory;
import fr.lip6.move.pnml.hlpn.cyclicEnumerations.CyclicEnumeration;
import fr.lip6.move.pnml.hlpn.cyclicEnumerations.CyclicEnumerationsFactory;
import fr.lip6.move.pnml.hlpn.dots.Dot;
import fr.lip6.move.pnml.hlpn.dots.DotsFactory;
import fr.lip6.move.pnml.hlpn.finiteEnumerations.FiniteEnumeration;
import fr.lip6.move.pnml.hlpn.finiteEnumerations.FiniteEnumerationsFactory;
import fr.lip6.move.pnml.hlpn.finiteIntRanges.FiniteIntRange;
import fr.lip6.move.pnml.hlpn.finiteIntRanges.FiniteIntRangesFactory;
import fr.lip6.move.pnml.hlpn.integers.HLInteger;
import fr.lip6.move.pnml.hlpn.integers.IntegersFactory;
import fr.lip6.move.pnml.hlpn.integers.Natural;
import fr.lip6.move.pnml.hlpn.integers.Positive;
import fr.lip6.move.pnml.hlpn.lists.HLPNList;
import fr.lip6.move.pnml.hlpn.lists.ListsFactory;
import fr.lip6.move.pnml.hlpn.lists.ListsPackage;
import fr.lip6.move.pnml.hlpn.strings.HLPNString;
import fr.lip6.move.pnml.hlpn.strings.StringsFactory;
import fr.lip6.move.pnml.hlpn.terms.MultisetSort;
import fr.lip6.move.pnml.hlpn.terms.ProductSort;
import fr.lip6.move.pnml.hlpn.terms.Sort;
import fr.lip6.move.pnml.hlpn.terms.TermsFactory;
import fr.lip6.move.pnml.hlpn.terms.TermsPackage;
import fr.lip6.move.pnml.hlpn.terms.UserSort;
import fr.lip6.move.pnml.hlpn.terms.impl.BuiltInSortImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HLPN List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.lip6.move.pnml.hlpn.lists.impl.HLPNListImpl#getBasis <em>Basis</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HLPNListImpl extends BuiltInSortImpl implements HLPNList {
	/**
	 * The cached value of the '{@link #getBasis() <em>Basis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasis()
	 * @generated
	 * @ordered
	 */
	protected Sort basis;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HLPNListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ListsPackage.Literals.HLPN_LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Sort getBasis() {
		return basis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBasis(Sort newBasis, NotificationChain msgs) {
		Sort oldBasis = basis;
		basis = newBasis;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ListsPackage.HLPN_LIST__BASIS, oldBasis, newBasis);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBasis(Sort newBasis) {
		if (newBasis != basis) {
			NotificationChain msgs = null;
			if (basis != null)
				msgs = ((InternalEObject) basis).eInverseRemove(this, TermsPackage.SORT__CONTAINER_LIST, Sort.class,
						msgs);
			if (newBasis != null)
				msgs = ((InternalEObject) newBasis).eInverseAdd(this, TermsPackage.SORT__CONTAINER_LIST, Sort.class,
						msgs);
			msgs = basicSetBasis(newBasis, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ListsPackage.HLPN_LIST__BASIS, newBasis, newBasis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ListsPackage.HLPN_LIST__BASIS:
			if (basis != null)
				msgs = ((InternalEObject) basis).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- ListsPackage.HLPN_LIST__BASIS, null, msgs);
			return basicSetBasis((Sort) otherEnd, msgs);
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
		case ListsPackage.HLPN_LIST__BASIS:
			return basicSetBasis(null, msgs);
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
		case ListsPackage.HLPN_LIST__BASIS:
			return getBasis();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ListsPackage.HLPN_LIST__BASIS:
			setBasis((Sort) newValue);
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
		case ListsPackage.HLPN_LIST__BASIS:
			setBasis((Sort) null);
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
		case ListsPackage.HLPN_LIST__BASIS:
			return basis != null;
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
		sb.append("<list");
		if (prettyPrintStatus) {
			headline = prpd.increaseLineHeaderLevel();
		}
		//begin attributes, id and id ref processing

		boolean haveSons = false;
		sb.append(">");
		sb.append(retline);

		//sons, follow processing

		if (getBasis() != null) {

			String top = getBasis().toPNML();
			if (!top.equals("")) {

				sb.append(top);

				haveSons = true;
			}

		}

		/****/

		if (prettyPrintStatus) {
			headline = prpd.decreaseLineHeaderLevel();
		}

		if (haveSons) {
			sb.append(headline);
			sb.append("</list>");
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
		ListsFactory fact = ListsFactory.eINSTANCE;

		//processing id

		//processing idref

		//processing attributes

		//processing sons

		for (Iterator iterator = locRoot.getChildElements(); iterator.hasNext();) {
			@SuppressWarnings("unused")
			OMElement type = (OMElement) iterator.next();

			if (type.getLocalName().equals("list")) {
				HLPNList item;
				item = ListsFactory.eINSTANCE.createHLPNList();
				item.fromPNML(type, idr);

				item.setContainerList(this);

				continue;
			}//end if

			if (type.getLocalName().equals("anysort")) {
				AnySort item;
				item = ArbitrarydeclarationsFactory.eINSTANCE.createAnySort();
				item.fromPNML(type, idr);

				item.setContainerList(this);

				continue;
			}//end if

			if (type.getLocalName().equals("null")) {
				Bool item;
				item = BooleansFactory.eINSTANCE.createBool();
				item.fromPNML(type, idr);

				item.setContainerList(this);

				continue;
			}//end if

			if (type.getLocalName().equals("cyclicenumeration")) {
				CyclicEnumeration item;
				item = CyclicEnumerationsFactory.eINSTANCE.createCyclicEnumeration();
				item.fromPNML(type, idr);

				item.setContainerList(this);

				continue;
			}//end if

			if (type.getLocalName().equals("dot")) {
				Dot item;
				item = DotsFactory.eINSTANCE.createDot();
				item.fromPNML(type, idr);

				item.setContainerList(this);

				continue;
			}//end if

			if (type.getLocalName().equals("finiteenumeration")) {
				FiniteEnumeration item;
				item = FiniteEnumerationsFactory.eINSTANCE.createFiniteEnumeration();
				item.fromPNML(type, idr);

				item.setContainerList(this);

				continue;
			}//end if

			if (type.getLocalName().equals("finiteintrange")) {
				FiniteIntRange item;
				item = FiniteIntRangesFactory.eINSTANCE.createFiniteIntRange();
				item.fromPNML(type, idr);

				item.setContainerList(this);

				continue;
			}//end if

			if (type.getLocalName().equals("natural")) {
				Natural item;
				item = IntegersFactory.eINSTANCE.createNatural();
				item.fromPNML(type, idr);

				item.setContainerList(this);

				continue;
			}//end if

			if (type.getLocalName().equals("positive")) {
				Positive item;
				item = IntegersFactory.eINSTANCE.createPositive();
				item.fromPNML(type, idr);

				item.setContainerList(this);

				continue;
			}//end if

			if (type.getLocalName().equals("integer")) {
				HLInteger item;
				item = IntegersFactory.eINSTANCE.createHLInteger();
				item.fromPNML(type, idr);

				item.setContainerList(this);

				continue;
			}//end if

			if (type.getLocalName().equals("string")) {
				HLPNString item;
				item = StringsFactory.eINSTANCE.createHLPNString();
				item.fromPNML(type, idr);

				item.setContainerList(this);

				continue;
			}//end if

			if (type.getLocalName().equals("multisetsort")) {
				MultisetSort item;
				item = TermsFactory.eINSTANCE.createMultisetSort();
				item.fromPNML(type, idr);

				item.setContainerList(this);

				continue;
			}//end if

			if (type.getLocalName().equals("productsort")) {
				ProductSort item;
				item = TermsFactory.eINSTANCE.createProductSort();
				item.fromPNML(type, idr);

				item.setContainerList(this);

				continue;
			}//end if

			if (type.getLocalName().equals("usersort")) {
				UserSort item;
				item = TermsFactory.eINSTANCE.createUserSort();
				item.fromPNML(type, idr);

				item.setContainerList(this);

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
		sb.append("<list");
		if (prettyPrintStatus) {
			headline = prpd.increaseLineHeaderLevel();
		}
		//begin attributes, id and id ref processing

		boolean haveSons = false;
		sb.append(">");
		sb.append(retline);

		//sons, follow processing

		if (getBasis() != null) {

			String top = getBasis().toPNML();
			if (!top.equals("")) {

				sb.append(top);

				haveSons = true;
			}

		}

		/****/

		if (prettyPrintStatus) {
			headline = prpd.decreaseLineHeaderLevel();
		}

		sb.append(headline);
		sb.append("</list>");
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

		//this package has no validator class
		return true;

	}

	@Override
	public boolean equalSorts(Sort sort) {
		boolean isEqual = false;
		if (this.eClass().getName().equalsIgnoreCase(sort.eClass().getName())) {
			if (this.getContainerNamedSort() != null && sort.getContainerNamedSort() != null) {
				isEqual = this.getContainerNamedSort().getName()
						.equalsIgnoreCase(sort.getContainerNamedSort().getName());
			} else {
				//further sub-classes must override this method.
				if ("HLPNList".equalsIgnoreCase(this.eClass().getName())) {
					HLPNList myList = this;
					HLPNList thatList = (HLPNList) sort;
					if (myList.getBasis() instanceof UserSort && thatList.getBasis() instanceof UserSort) {
						isEqual = ((UserSort) myList.getBasis()).getDeclaration().getName()
								.equalsIgnoreCase(((UserSort) thatList.getBasis()).getDeclaration().getName());
					}
				}
			}
		}
		return isEqual;

	}

} //HLPNListImpl
