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
package fr.lip6.move.pnml.symmetricnet.terms.impl;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.xml.namespace.QName;

import org.apache.axiom.om.OMElement;
import org.eclipse.emf.common.notify.Notification;
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
import fr.lip6.move.pnml.symmetricnet.booleans.impl.BooleansFactoryImpl;
import fr.lip6.move.pnml.symmetricnet.cyclicEnumerations.impl.CyclicEnumerationsFactoryImpl;
import fr.lip6.move.pnml.symmetricnet.dots.impl.DotsFactoryImpl;
import fr.lip6.move.pnml.symmetricnet.finiteIntRanges.impl.FiniteIntRangesFactoryImpl;
import fr.lip6.move.pnml.symmetricnet.integers.impl.IntegersFactoryImpl;
import fr.lip6.move.pnml.symmetricnet.multisets.impl.MultisetsFactoryImpl;
import fr.lip6.move.pnml.symmetricnet.partitions.impl.PartitionsFactoryImpl;
import fr.lip6.move.pnml.symmetricnet.terms.OperatorDecl;
import fr.lip6.move.pnml.symmetricnet.terms.Term;
import fr.lip6.move.pnml.symmetricnet.terms.TermsFactory;
import fr.lip6.move.pnml.symmetricnet.terms.TermsPackage;
import fr.lip6.move.pnml.symmetricnet.terms.UserOperator;
import fr.lip6.move.pnml.symmetricnet.terms.util.TermsValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User Operator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.lip6.move.pnml.symmetricnet.terms.impl.UserOperatorImpl#getDeclaration <em>Declaration</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UserOperatorImpl extends OperatorImpl implements UserOperator {
	/**
	 * The cached value of the '{@link #getDeclaration() <em>Declaration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclaration()
	 * @generated
	 * @ordered
	 */
	protected OperatorDecl declaration;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserOperatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TermsPackage.Literals.USER_OPERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperatorDecl getDeclaration() {
		if (declaration != null && declaration.eIsProxy()) {
			InternalEObject oldDeclaration = (InternalEObject) declaration;
			declaration = (OperatorDecl) eResolveProxy(oldDeclaration);
			if (declaration != oldDeclaration) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TermsPackage.USER_OPERATOR__DECLARATION,
							oldDeclaration, declaration));
			}
		}
		return declaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperatorDecl basicGetDeclaration() {
		return declaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeclaration(OperatorDecl newDeclaration) {
		OperatorDecl oldDeclaration = declaration;
		declaration = newDeclaration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TermsPackage.USER_OPERATOR__DECLARATION,
					oldDeclaration, declaration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TermsPackage.USER_OPERATOR__DECLARATION:
			if (resolve)
				return getDeclaration();
			return basicGetDeclaration();
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
		case TermsPackage.USER_OPERATOR__DECLARATION:
			setDeclaration((OperatorDecl) newValue);
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
		case TermsPackage.USER_OPERATOR__DECLARATION:
			setDeclaration((OperatorDecl) null);
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
		case TermsPackage.USER_OPERATOR__DECLARATION:
			return declaration != null;
		}
		return super.eIsSet(featureID);
	}

	//TODO this element (sort) seems not to have any ToPNML associated tag.
	//This is maybe a mistake ?

	//TODO this element (output) seems not to have any ToPNML associated tag.
	//This is maybe a mistake ?

	//TODO this element (input) seems not to have any ToPNML associated tag.
	//This is maybe a mistake ?

	/**
	 * Return the string containing the pnml output
	 */
	public String toPNML() {
		//id 0
		//idref 1
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
		sb.append("<useroperator");
		if (prettyPrintStatus) {
			headline = prpd.increaseLineHeaderLevel();
		}
		//begin attributes, id and id ref processing

		if (getDeclaration() != null) {
			sb.append(" declaration");
			sb.append("=\"");
			sb.append(getDeclaration().getId());
			sb.append("\"");
		}

		boolean haveSons = false;
		sb.append(">");
		sb.append(retline);

		//sons, follow processing

		if (getSubterm() != null) {

			java.util.List<fr.lip6.move.pnml.symmetricnet.terms.Term> items = getSubterm();
			for (Iterator<Term> iterator = items.iterator(); iterator.hasNext();) {
				Term item = (Term) iterator.next();

				sb.append(headline);
				sb.append("<");
				sb.append("subterm");
				sb.append(">");
				sb.append(item.toPNML());
				sb.append(headline);
				sb.append("</");
				sb.append("subterm");
				sb.append(">");

				haveSons = true;
			}

		}

		/****/

		if (prettyPrintStatus) {
			headline = prpd.decreaseLineHeaderLevel();
		}

		if (haveSons) {
			sb.append(headline);
			sb.append("</useroperator>");
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
		//1
		//0
		//1
		@SuppressWarnings("unused")
		TermsFactory fact = TermsFactoryImpl.eINSTANCE;

		//processing id

		//processing idref

		List<String> ids = new ArrayList<String>();
		String[] tmp = {};

		if (locRoot.getAttributeValue(new QName("declaration")) != null) {
			ids.add(locRoot.getAttributeValue(new QName("declaration")).toString());
		}
		idr.addIdRef((Object) this, ids.toArray(tmp));

		//processing attributes

		//processing sons

		for (Iterator iterator = locRoot.getChildElements(); iterator.hasNext();) {
			@SuppressWarnings("unused")
			OMElement type = (OMElement) iterator.next();

			if (type.getLocalName().equals("subterm")) {

				Term item = null;

				for (Iterator iterator2 = type.getChildElements(); iterator2.hasNext();) {
					OMElement subType = (OMElement) iterator2.next();

					if (subType.getLocalName().equals("variable")) {
						item = new TermsFactoryImpl().createVariable();
						item.fromPNML(subType, idr);

						item.setContainerOperator(this);

						continue;
					}

					if (subType.getLocalName().equals("tuple")) {
						item = new TermsFactoryImpl().createTuple();
						item.fromPNML(subType, idr);

						item.setContainerOperator(this);

						continue;
					}

					if (subType.getLocalName().equals("useroperator")) {
						item = new TermsFactoryImpl().createUserOperator();
						item.fromPNML(subType, idr);

						item.setContainerOperator(this);

						continue;
					}

					if (subType.getLocalName().equals("equality")) {
						item = new BooleansFactoryImpl().createEquality();
						item.fromPNML(subType, idr);

						item.setContainerOperator(this);

						continue;
					}

					if (subType.getLocalName().equals("inequality")) {
						item = new BooleansFactoryImpl().createInequality();
						item.fromPNML(subType, idr);

						item.setContainerOperator(this);

						continue;
					}

					if (subType.getLocalName().equals("booleanconstantt")) {
						item = new BooleansFactoryImpl().createBooleanConstant();
						item.fromPNML(subType, idr);

						item.setContainerOperator(this);

						continue;
					}

					if (subType.getLocalName().equals("or")) {
						item = new BooleansFactoryImpl().createOr();
						item.fromPNML(subType, idr);

						item.setContainerOperator(this);

						continue;
					}

					if (subType.getLocalName().equals("and")) {
						item = new BooleansFactoryImpl().createAnd();
						item.fromPNML(subType, idr);

						item.setContainerOperator(this);

						continue;
					}

					if (subType.getLocalName().equals("imply")) {
						item = new BooleansFactoryImpl().createImply();
						item.fromPNML(subType, idr);

						item.setContainerOperator(this);

						continue;
					}

					if (subType.getLocalName().equals("not")) {
						item = new BooleansFactoryImpl().createNot();
						item.fromPNML(subType, idr);

						item.setContainerOperator(this);

						continue;
					}

					if (subType.getLocalName().equals("successor")) {
						item = new CyclicEnumerationsFactoryImpl().createSuccessor();
						item.fromPNML(subType, idr);

						item.setContainerOperator(this);

						continue;
					}

					if (subType.getLocalName().equals("predecessor")) {
						item = new CyclicEnumerationsFactoryImpl().createPredecessor();
						item.fromPNML(subType, idr);

						item.setContainerOperator(this);

						continue;
					}

					if (subType.getLocalName().equals("dotconstant")) {
						item = new DotsFactoryImpl().createDotConstant();
						item.fromPNML(subType, idr);

						item.setContainerOperator(this);

						continue;
					}

					if (subType.getLocalName().equals("finiteintrangeconstant")) {
						item = new FiniteIntRangesFactoryImpl().createFiniteIntRangeConstant();
						item.fromPNML(subType, idr);

						item.setContainerOperator(this);

						continue;
					}

					if (subType.getLocalName().equals("lessthan")) {
						item = new FiniteIntRangesFactoryImpl().createLessThan();
						item.fromPNML(subType, idr);

						item.setContainerOperator(this);

						continue;
					}

					if (subType.getLocalName().equals("greaterthan")) {
						item = new FiniteIntRangesFactoryImpl().createGreaterThan();
						item.fromPNML(subType, idr);

						item.setContainerOperator(this);

						continue;
					}

					if (subType.getLocalName().equals("lessthanorequal")) {
						item = new FiniteIntRangesFactoryImpl().createLessThanOrEqual();
						item.fromPNML(subType, idr);

						item.setContainerOperator(this);

						continue;
					}

					if (subType.getLocalName().equals("greaterthanorequal")) {
						item = new FiniteIntRangesFactoryImpl().createGreaterThanOrEqual();
						item.fromPNML(subType, idr);

						item.setContainerOperator(this);

						continue;
					}

					if (subType.getLocalName().equals("numberconstant")) {
						item = new IntegersFactoryImpl().createNumberConstant();
						item.fromPNML(subType, idr);

						item.setContainerOperator(this);

						continue;
					}

					if (subType.getLocalName().equals("addition")) {
						item = new IntegersFactoryImpl().createAddition();
						item.fromPNML(subType, idr);

						item.setContainerOperator(this);

						continue;
					}

					if (subType.getLocalName().equals("subtraction")) {
						item = new IntegersFactoryImpl().createSubtraction();
						item.fromPNML(subType, idr);

						item.setContainerOperator(this);

						continue;
					}

					if (subType.getLocalName().equals("mult")) {
						item = new IntegersFactoryImpl().createMultiplication();
						item.fromPNML(subType, idr);

						item.setContainerOperator(this);

						continue;
					}

					if (subType.getLocalName().equals("div")) {
						item = new IntegersFactoryImpl().createDivision();
						item.fromPNML(subType, idr);

						item.setContainerOperator(this);

						continue;
					}

					if (subType.getLocalName().equals("mod")) {
						item = new IntegersFactoryImpl().createModulo();
						item.fromPNML(subType, idr);

						item.setContainerOperator(this);

						continue;
					}

					if (subType.getLocalName().equals("gt")) {
						item = new IntegersFactoryImpl().createGreaterThan();
						item.fromPNML(subType, idr);

						item.setContainerOperator(this);

						continue;
					}

					if (subType.getLocalName().equals("geq")) {
						item = new IntegersFactoryImpl().createGreaterThanOrEqual();
						item.fromPNML(subType, idr);

						item.setContainerOperator(this);

						continue;
					}

					if (subType.getLocalName().equals("lt")) {
						item = new IntegersFactoryImpl().createLessThan();
						item.fromPNML(subType, idr);

						item.setContainerOperator(this);

						continue;
					}

					if (subType.getLocalName().equals("leq")) {
						item = new IntegersFactoryImpl().createLessThanOrEqual();
						item.fromPNML(subType, idr);

						item.setContainerOperator(this);

						continue;
					}

					if (subType.getLocalName().equals("cardinality")) {
						item = new MultisetsFactoryImpl().createCardinality();
						item.fromPNML(subType, idr);

						item.setContainerOperator(this);

						continue;
					}

					if (subType.getLocalName().equals("contains")) {
						item = new MultisetsFactoryImpl().createContains();
						item.fromPNML(subType, idr);

						item.setContainerOperator(this);

						continue;
					}

					if (subType.getLocalName().equals("cardinalityof")) {
						item = new MultisetsFactoryImpl().createCardinalityOf();
						item.fromPNML(subType, idr);

						item.setContainerOperator(this);

						continue;
					}

					if (subType.getLocalName().equals("add")) {
						item = new MultisetsFactoryImpl().createAdd();
						item.fromPNML(subType, idr);

						item.setContainerOperator(this);

						continue;
					}

					if (subType.getLocalName().equals("all")) {
						item = new MultisetsFactoryImpl().createAll();
						item.fromPNML(subType, idr);

						item.setContainerOperator(this);

						continue;
					}

					if (subType.getLocalName().equals("empty")) {
						item = new MultisetsFactoryImpl().createEmpty();
						item.fromPNML(subType, idr);

						item.setContainerOperator(this);

						continue;
					}

					if (subType.getLocalName().equals("numberof")) {
						item = new MultisetsFactoryImpl().createNumberOf();
						item.fromPNML(subType, idr);

						item.setContainerOperator(this);

						continue;
					}

					if (subType.getLocalName().equals("subtract")) {
						item = new MultisetsFactoryImpl().createSubtract();
						item.fromPNML(subType, idr);

						item.setContainerOperator(this);

						continue;
					}

					if (subType.getLocalName().equals("scalarproduct")) {
						item = new MultisetsFactoryImpl().createScalarProduct();
						item.fromPNML(subType, idr);

						item.setContainerOperator(this);

						continue;
					}

					if (subType.getLocalName().equals("gtp")) {
						item = new PartitionsFactoryImpl().createGreaterThan();
						item.fromPNML(subType, idr);

						item.setContainerOperator(this);

						continue;
					}

					if (subType.getLocalName().equals("partitionelementof")) {
						item = new PartitionsFactoryImpl().createPartitionElementOf();
						item.fromPNML(subType, idr);

						item.setContainerOperator(this);

						continue;
					}

					if (subType.getLocalName().equals("ltp")) {
						item = new PartitionsFactoryImpl().createLessThan();
						item.fromPNML(subType, idr);

						item.setContainerOperator(this);

						continue;
					}

				}
			}

			//tag!=null

		}

	}

	public void idRefHang(ArrayList<Object> oList) {

		this.setDeclaration((fr.lip6.move.pnml.symmetricnet.terms.OperatorDecl) oList.get(0));

	}

	//TODO this element (sort) seems not to have any ToPNML associated tag.
	//This is maybe a mistake ?

	//TODO this element (output) seems not to have any ToPNML associated tag.
	//This is maybe a mistake ?

	//TODO this element (input) seems not to have any ToPNML associated tag.
	//This is maybe a mistake ?

	/**
	 * Return the string containing the pnml output
	 */
	public void toPNML(FileChannel fc) {
		//id 0
		//idref 1
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
		sb.append("<useroperator");
		if (prettyPrintStatus) {
			headline = prpd.increaseLineHeaderLevel();
		}
		//begin attributes, id and id ref processing

		if (getDeclaration() != null) {
			sb.append(" declaration");
			sb.append("=\"");
			sb.append(getDeclaration().getId());
			sb.append("\"");
		}

		boolean haveSons = false;
		sb.append(">");
		sb.append(retline);

		//sons, follow processing

		if (getSubterm() != null) {

			try {
				writeIntoStream(bytebuf, fc, sb.toString().getBytes(Charset.forName(charsetEncoding)));
			} catch (IOException io) {
				io.printStackTrace();
				// fail fast
				return;
			}
			sb.delete(0, sb.length());
			java.util.List<fr.lip6.move.pnml.symmetricnet.terms.Term> items = getSubterm();
			for (Iterator<Term> iterator = items.iterator(); iterator.hasNext();) {
				Term item = (Term) iterator.next();

				sb.append(headline);
				sb.append("<");
				sb.append("subterm");
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
				sb.append("subterm");
				sb.append(">");

				haveSons = true;
			}

		}

		/****/

		if (prettyPrintStatus) {
			headline = prpd.decreaseLineHeaderLevel();
		}

		sb.append(headline);
		sb.append("</useroperator>");
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

		if (getSubterm() != null) {
			java.util.List<fr.lip6.move.pnml.symmetricnet.terms.Term> items = getSubterm();
			for (Iterator<Term> iterator = items.iterator(); iterator.hasNext();) {
				Term item = (Term) iterator.next();
				retour &= item.validateOCL(diagnostics);
			}
		}

		retour &= val.validate(this, diagnostics, null);
		return retour;

	}
} //UserOperatorImpl
