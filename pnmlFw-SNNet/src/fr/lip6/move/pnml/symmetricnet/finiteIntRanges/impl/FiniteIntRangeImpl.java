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
package fr.lip6.move.pnml.symmetricnet.finiteIntRanges.impl;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.util.List;

import javax.xml.namespace.QName;

import org.apache.axiom.om.OMElement;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import fr.lip6.move.pnml.framework.general.PnmlExport;
import fr.lip6.move.pnml.framework.utils.IdRefLinker;
import fr.lip6.move.pnml.framework.utils.ModelRepository;
import fr.lip6.move.pnml.framework.utils.PNMLEncoding;
import fr.lip6.move.pnml.framework.utils.PrettyPrintData;
import fr.lip6.move.pnml.framework.utils.exception.InnerBuildException;
import fr.lip6.move.pnml.framework.utils.exception.InvalidIDException;
import fr.lip6.move.pnml.framework.utils.exception.VoidRepositoryException;
import fr.lip6.move.pnml.symmetricnet.finiteIntRanges.FiniteIntRange;
import fr.lip6.move.pnml.symmetricnet.finiteIntRanges.FiniteIntRangeConstant;
import fr.lip6.move.pnml.symmetricnet.finiteIntRanges.FiniteIntRangesFactory;
import fr.lip6.move.pnml.symmetricnet.finiteIntRanges.FiniteIntRangesPackage;
import fr.lip6.move.pnml.symmetricnet.terms.Sort;
import fr.lip6.move.pnml.symmetricnet.terms.impl.BuiltInSortImpl;
import fr.lip6.move.pnml.symmetricnet.terms.util.TermsValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Finite Int Range</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.lip6.move.pnml.symmetricnet.finiteIntRanges.impl.FiniteIntRangeImpl#getStart <em>Start</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.symmetricnet.finiteIntRanges.impl.FiniteIntRangeImpl#getEnd <em>End</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.symmetricnet.finiteIntRanges.impl.FiniteIntRangeImpl#getContainerFiniteIntRangeConstant <em>Container Finite Int Range Constant</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FiniteIntRangeImpl extends BuiltInSortImpl implements FiniteIntRange {
	/**
	 * The default value of the '{@link #getStart() <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected static final Integer START_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStart() <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected Integer start = START_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnd() <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected static final Integer END_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnd() <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected Integer end = END_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FiniteIntRangeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FiniteIntRangesPackage.Literals.FINITE_INT_RANGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getStart() {
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStart(Integer newStart) {
		Integer oldStart = start;
		start = newStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FiniteIntRangesPackage.FINITE_INT_RANGE__START,
					oldStart, start));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getEnd() {
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnd(Integer newEnd) {
		Integer oldEnd = end;
		end = newEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FiniteIntRangesPackage.FINITE_INT_RANGE__END, oldEnd,
					end));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FiniteIntRangeConstant getContainerFiniteIntRangeConstant() {
		if (eContainerFeatureID() != FiniteIntRangesPackage.FINITE_INT_RANGE__CONTAINER_FINITE_INT_RANGE_CONSTANT)
			return null;
		return (FiniteIntRangeConstant) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainerFiniteIntRangeConstant(
			FiniteIntRangeConstant newContainerFiniteIntRangeConstant, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newContainerFiniteIntRangeConstant,
				FiniteIntRangesPackage.FINITE_INT_RANGE__CONTAINER_FINITE_INT_RANGE_CONSTANT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainerFiniteIntRangeConstant(FiniteIntRangeConstant newContainerFiniteIntRangeConstant) {
		if (newContainerFiniteIntRangeConstant != eInternalContainer()
				|| (eContainerFeatureID() != FiniteIntRangesPackage.FINITE_INT_RANGE__CONTAINER_FINITE_INT_RANGE_CONSTANT && newContainerFiniteIntRangeConstant != null)) {
			if (EcoreUtil.isAncestor(this, newContainerFiniteIntRangeConstant))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContainerFiniteIntRangeConstant != null)
				msgs = ((InternalEObject) newContainerFiniteIntRangeConstant).eInverseAdd(this,
						FiniteIntRangesPackage.FINITE_INT_RANGE_CONSTANT__RANGE, FiniteIntRangeConstant.class, msgs);
			msgs = basicSetContainerFiniteIntRangeConstant(newContainerFiniteIntRangeConstant, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					FiniteIntRangesPackage.FINITE_INT_RANGE__CONTAINER_FINITE_INT_RANGE_CONSTANT,
					newContainerFiniteIntRangeConstant, newContainerFiniteIntRangeConstant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case FiniteIntRangesPackage.FINITE_INT_RANGE__CONTAINER_FINITE_INT_RANGE_CONSTANT:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetContainerFiniteIntRangeConstant((FiniteIntRangeConstant) otherEnd, msgs);
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
		case FiniteIntRangesPackage.FINITE_INT_RANGE__CONTAINER_FINITE_INT_RANGE_CONSTANT:
			return basicSetContainerFiniteIntRangeConstant(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case FiniteIntRangesPackage.FINITE_INT_RANGE__CONTAINER_FINITE_INT_RANGE_CONSTANT:
			return eInternalContainer().eInverseRemove(this, FiniteIntRangesPackage.FINITE_INT_RANGE_CONSTANT__RANGE,
					FiniteIntRangeConstant.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case FiniteIntRangesPackage.FINITE_INT_RANGE__START:
			return getStart();
		case FiniteIntRangesPackage.FINITE_INT_RANGE__END:
			return getEnd();
		case FiniteIntRangesPackage.FINITE_INT_RANGE__CONTAINER_FINITE_INT_RANGE_CONSTANT:
			return getContainerFiniteIntRangeConstant();
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
		case FiniteIntRangesPackage.FINITE_INT_RANGE__START:
			setStart((Integer) newValue);
			return;
		case FiniteIntRangesPackage.FINITE_INT_RANGE__END:
			setEnd((Integer) newValue);
			return;
		case FiniteIntRangesPackage.FINITE_INT_RANGE__CONTAINER_FINITE_INT_RANGE_CONSTANT:
			setContainerFiniteIntRangeConstant((FiniteIntRangeConstant) newValue);
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
		case FiniteIntRangesPackage.FINITE_INT_RANGE__START:
			setStart(START_EDEFAULT);
			return;
		case FiniteIntRangesPackage.FINITE_INT_RANGE__END:
			setEnd(END_EDEFAULT);
			return;
		case FiniteIntRangesPackage.FINITE_INT_RANGE__CONTAINER_FINITE_INT_RANGE_CONSTANT:
			setContainerFiniteIntRangeConstant((FiniteIntRangeConstant) null);
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
		case FiniteIntRangesPackage.FINITE_INT_RANGE__START:
			return START_EDEFAULT == null ? start != null : !START_EDEFAULT.equals(start);
		case FiniteIntRangesPackage.FINITE_INT_RANGE__END:
			return END_EDEFAULT == null ? end != null : !END_EDEFAULT.equals(end);
		case FiniteIntRangesPackage.FINITE_INT_RANGE__CONTAINER_FINITE_INT_RANGE_CONSTANT:
			return getContainerFiniteIntRangeConstant() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (start: ");
		result.append(start);
		result.append(", end: ");
		result.append(end);
		result.append(')');
		return result.toString();
	}

	/**
	 * Return the string containing the pnml output
	 */
	public String toPNML() {
		//id 0
		//idref 0
		//attributes 2
		//sons 0

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
		sb.append("<finiteintrange");
		if (prettyPrintStatus) {
			headline = prpd.increaseLineHeaderLevel();
		}
		//begin attributes, id and id ref processing

		if (getStart() != null) {
			sb.append(" start");
			sb.append("=\"");
			sb.append(getStart());
			sb.append("\"");
		}

		if (getEnd() != null) {
			sb.append(" end");
			sb.append("=\"");
			sb.append(getEnd());
			sb.append("\"");
		}

		sb.append("/>");
		sb.append(retline);

		//sons, follow processing

		/****/

		if (prettyPrintStatus) {
			headline = prpd.decreaseLineHeaderLevel();
		}

		return sb.toString();
	}

	@SuppressWarnings("unchecked")
	public void fromPNML(OMElement locRoot, IdRefLinker idr) throws InnerBuildException, InvalidIDException,
			VoidRepositoryException {
		//0
		//0
		//2
		//0
		@SuppressWarnings("unused")
		FiniteIntRangesFactory fact = FiniteIntRangesFactoryImpl.eINSTANCE;

		//processing id

		//processing idref

		//processing attributes

		if (locRoot.getAttributeValue(new QName("start")) != null) {
			try {
				this.setStart(new Integer(locRoot.getAttributeValue(new QName("start"))));
			} catch (Exception e) {
				throw new fr.lip6.move.pnml.framework.utils.exception.InnerBuildException(e);
			}
		}

		if (locRoot.getAttributeValue(new QName("end")) != null) {
			try {
				this.setEnd(new Integer(locRoot.getAttributeValue(new QName("end"))));
			} catch (Exception e) {
				throw new fr.lip6.move.pnml.framework.utils.exception.InnerBuildException(e);
			}
		}

		//processing sons

	}

	/**
	 * Return the string containing the pnml output
	 */
	public void toPNML(FileChannel fc) {
		//id 0
		//idref 0
		//attributes 2
		//sons 0

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
		sb.append("<finiteintrange");
		if (prettyPrintStatus) {
			headline = prpd.increaseLineHeaderLevel();
		}
		//begin attributes, id and id ref processing

		if (getStart() != null) {
			sb.append(" start");
			sb.append("=\"");
			sb.append(getStart());
			sb.append("\"");
		}

		if (getEnd() != null) {
			sb.append(" end");
			sb.append("=\"");
			sb.append(getEnd());
			sb.append("\"");
		}

		sb.append("/>");
		sb.append(retline);

		//sons, follow processing

		/****/

		if (prettyPrintStatus) {
			headline = prpd.decreaseLineHeaderLevel();
		}

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
				if ("FiniteIntRange".equalsIgnoreCase(this.eClass().getName())) {
					FiniteIntRange myFIR = (FiniteIntRange) this;
					FiniteIntRange thatFIR = (FiniteIntRange) sort;
					isEqual = (myFIR.getStart() == thatFIR.getStart() && myFIR.getEnd() == thatFIR.getEnd());

				}
			}
		}
		return isEqual;

	}

} //FiniteIntRangeImpl
