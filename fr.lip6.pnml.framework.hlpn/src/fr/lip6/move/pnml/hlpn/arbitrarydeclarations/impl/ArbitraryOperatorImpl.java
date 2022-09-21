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
package fr.lip6.move.pnml.hlpn.arbitrarydeclarations.impl;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import javax.xml.namespace.QName;

import org.apache.axiom.om.OMElement;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
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
import fr.lip6.move.pnml.hlpn.arbitrarydeclarations.ArbitraryOperator;
import fr.lip6.move.pnml.hlpn.arbitrarydeclarations.ArbitrarydeclarationsFactory;
import fr.lip6.move.pnml.hlpn.arbitrarydeclarations.ArbitrarydeclarationsPackage;
import fr.lip6.move.pnml.hlpn.terms.impl.OperatorDeclImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Arbitrary Operator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.lip6.move.pnml.hlpn.arbitrarydeclarations.impl.ArbitraryOperatorImpl#getInput <em>Input</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.hlpn.arbitrarydeclarations.impl.ArbitraryOperatorImpl#getOutput <em>Output</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArbitraryOperatorImpl extends OperatorDeclImpl implements ArbitraryOperator {
	/**
	 * The cached value of the '{@link #getInput() <em>Input</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
	protected EList<AnySort> input;

	/**
	 * The cached value of the '{@link #getOutput() <em>Output</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput()
	 * @generated
	 * @ordered
	 */
	protected AnySort output;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArbitraryOperatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArbitrarydeclarationsPackage.Literals.ARBITRARY_OPERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<AnySort> getInput() {
		if (input == null) {
			input = new EObjectContainmentEList<AnySort>(AnySort.class, this,
					ArbitrarydeclarationsPackage.ARBITRARY_OPERATOR__INPUT);
		}
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnySort getOutput() {
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutput(AnySort newOutput, NotificationChain msgs) {
		AnySort oldOutput = output;
		output = newOutput;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ArbitrarydeclarationsPackage.ARBITRARY_OPERATOR__OUTPUT, oldOutput, newOutput);
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
	public void setOutput(AnySort newOutput) {
		if (newOutput != output) {
			NotificationChain msgs = null;
			if (output != null)
				msgs = ((InternalEObject) output).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- ArbitrarydeclarationsPackage.ARBITRARY_OPERATOR__OUTPUT, null, msgs);
			if (newOutput != null)
				msgs = ((InternalEObject) newOutput).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- ArbitrarydeclarationsPackage.ARBITRARY_OPERATOR__OUTPUT, null, msgs);
			msgs = basicSetOutput(newOutput, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ArbitrarydeclarationsPackage.ARBITRARY_OPERATOR__OUTPUT, newOutput, newOutput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ArbitrarydeclarationsPackage.ARBITRARY_OPERATOR__INPUT:
			return ((InternalEList<?>) getInput()).basicRemove(otherEnd, msgs);
		case ArbitrarydeclarationsPackage.ARBITRARY_OPERATOR__OUTPUT:
			return basicSetOutput(null, msgs);
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
		case ArbitrarydeclarationsPackage.ARBITRARY_OPERATOR__INPUT:
			return getInput();
		case ArbitrarydeclarationsPackage.ARBITRARY_OPERATOR__OUTPUT:
			return getOutput();
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
		case ArbitrarydeclarationsPackage.ARBITRARY_OPERATOR__INPUT:
			getInput().clear();
			getInput().addAll((Collection<? extends AnySort>) newValue);
			return;
		case ArbitrarydeclarationsPackage.ARBITRARY_OPERATOR__OUTPUT:
			setOutput((AnySort) newValue);
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
		case ArbitrarydeclarationsPackage.ARBITRARY_OPERATOR__INPUT:
			getInput().clear();
			return;
		case ArbitrarydeclarationsPackage.ARBITRARY_OPERATOR__OUTPUT:
			setOutput((AnySort) null);
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
		case ArbitrarydeclarationsPackage.ARBITRARY_OPERATOR__INPUT:
			return input != null && !input.isEmpty();
		case ArbitrarydeclarationsPackage.ARBITRARY_OPERATOR__OUTPUT:
			return output != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * Return the string containing the pnml output
	 */
	@Override
	public String toPNML() {
		//id 1
		//idref 0
		//attributes 1
		//sons 2

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
		sb.append("<arbitraryoperator");
		if (prettyPrintStatus) {
			headline = prpd.increaseLineHeaderLevel();
		}
		//begin attributes, id and id ref processing

		if (getId() != null) {
			sb.append(" id");
			sb.append("=\"");
			sb.append(getId());
			sb.append("\"");
		}

		if (getName() != null) {
			sb.append(" name");
			sb.append("=\"");
			sb.append(getName());
			sb.append("\"");
		}

		boolean haveSons = false;
		sb.append(">");
		sb.append(retline);

		//sons, follow processing

		if (getInput() != null) {

			java.util.List<fr.lip6.move.pnml.hlpn.arbitrarydeclarations.AnySort> items = getInput();
			for (Iterator<AnySort> iterator = items.iterator(); iterator.hasNext();) {
				AnySort item = iterator.next();

				sb.append(headline);
				sb.append("<");
				sb.append("input");
				sb.append(">");
				sb.append(item.toPNML());
				sb.append(headline);
				sb.append("</");
				sb.append("input");
				sb.append(">");

				haveSons = true;
			}

		}

		if (getOutput() != null) {

			String top = getOutput().toPNML();
			if (!top.equals("")) {

				sb.append(headline);
				sb.append("<");
				sb.append("output");
				sb.append(">");
				sb.append(top);
				sb.append("</");
				sb.append("output");
				sb.append(">");
				sb.append(retline);

				haveSons = true;
			}

		}

		/****/

		if (prettyPrintStatus) {
			headline = prpd.decreaseLineHeaderLevel();
		}

		if (haveSons) {
			sb.append(headline);
			sb.append("</arbitraryoperator>");
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
		//1
		//0
		//1
		//2
		@SuppressWarnings("unused")
		ArbitrarydeclarationsFactory fact = ArbitrarydeclarationsFactory.eINSTANCE;

		//processing id

		if (locRoot.getAttributeValue(new QName("id")) != null) {
			this.setId(locRoot.getAttributeValue(new QName("id")));
			ModelRepository.getInstance().getCurrentIdRepository()
					.checkId(locRoot.getAttributeValue(new QName("id")).toString(), this);
		}

		//processing idref

		//processing attributes

		if (locRoot.getAttributeValue(new QName("name")) != null) {
			try {
				this.setName(locRoot.getAttributeValue(new QName("name")));
			} catch (Exception e) {
				throw new fr.lip6.move.pnml.framework.utils.exception.InnerBuildException(e);
			}
		}

		//processing sons

		for (Iterator iterator = locRoot.getChildElements(); iterator.hasNext();) {
			@SuppressWarnings("unused")
			OMElement type = (OMElement) iterator.next();

			if (type.getLocalName().equals("input")) {

				AnySort item = null;

				for (Iterator iterator2 = type.getChildElements(); iterator2.hasNext();) {
					OMElement subType = (OMElement) iterator2.next();

					if (subType.getLocalName().equals("anysort")) {
						item = new ArbitrarydeclarationsFactoryImpl().createAnySort();
						item.fromPNML(subType, idr);

						//FIXME PROBLEM: a container setter do not exist for this type
						//(Maybe this container has not been declared as changeable?)

						continue;
					}

				}
			}

			//tag!=null

			if (type.getLocalName().equals("output")) {

				fr.lip6.move.pnml.hlpn.arbitrarydeclarations.AnySort item = null;

				for (Iterator iterator2 = type.getChildElements(); iterator2.hasNext();) {
					OMElement subType = (OMElement) iterator2.next();

					if (subType.getLocalName().equals("anysort")) {
						item = new ArbitrarydeclarationsFactoryImpl().createAnySort();
						item.fromPNML(subType, idr);

						//FIXME PROBLEM: a container setter do not exist for this type
						//(Maybe this container has not been declared as changeable?)

						continue;
					}

				}
			}

			//tag!=null

		}

	}

	/**
	 * Return the string containing the pnml output
	 */
	@Override
	public void toPNML(FileChannel fc) {
		//id 1
		//idref 0
		//attributes 1
		//sons 2

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
		sb.append("<arbitraryoperator");
		if (prettyPrintStatus) {
			headline = prpd.increaseLineHeaderLevel();
		}
		//begin attributes, id and id ref processing

		if (getId() != null) {
			sb.append(" id");
			sb.append("=\"");
			sb.append(getId());
			sb.append("\"");
		}

		if (getName() != null) {
			sb.append(" name");
			sb.append("=\"");
			sb.append(getName());
			sb.append("\"");
		}

		boolean haveSons = false;
		sb.append(">");
		sb.append(retline);

		//sons, follow processing

		if (getInput() != null) {

			try {
				writeIntoStream(bytebuf, fc, sb.toString().getBytes(Charset.forName(charsetEncoding)));
			} catch (IOException io) {
				io.printStackTrace();
				// fail fast
				return;
			}
			sb.delete(0, sb.length());
			java.util.List<fr.lip6.move.pnml.hlpn.arbitrarydeclarations.AnySort> items = getInput();
			for (Iterator<AnySort> iterator = items.iterator(); iterator.hasNext();) {
				AnySort item = iterator.next();

				sb.append(headline);
				sb.append("<");
				sb.append("input");
				sb.append(">");
				try {
					writeIntoStream(bytebuf, fc, sb.toString().getBytes(Charset.forName(charsetEncoding)));
				} catch (IOException io) {
					io.printStackTrace();
					// fail fast
					return;
				}
				sb.delete(0, sb.length());
				item.toPNML(fc);
				sb.append(headline);
				sb.append("</");
				sb.append("input");
				sb.append(">");

				haveSons = true;
			}

		}

		if (getOutput() != null) {

			String top = getOutput().toPNML();
			if (!top.equals("")) {

				sb.append(headline);
				sb.append("<");
				sb.append("output");
				sb.append(">");
				sb.append(top);
				sb.append("</");
				sb.append("output");
				sb.append(">");
				sb.append(retline);

				haveSons = true;
			}

		}

		/****/

		if (prettyPrintStatus) {
			headline = prpd.decreaseLineHeaderLevel();
		}

		sb.append(headline);
		sb.append("</arbitraryoperator>");
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
} //ArbitraryOperatorImpl
