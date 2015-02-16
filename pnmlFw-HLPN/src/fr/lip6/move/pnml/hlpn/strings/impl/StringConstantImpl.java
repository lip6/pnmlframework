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
package fr.lip6.move.pnml.hlpn.strings.impl;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.List;

import org.apache.axiom.om.OMElement;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import fr.lip6.move.pnml.framework.general.PnmlExport;
import fr.lip6.move.pnml.framework.utils.IdRefLinker;
import fr.lip6.move.pnml.framework.utils.ModelRepository;
import fr.lip6.move.pnml.framework.utils.PNMLEncoding;
import fr.lip6.move.pnml.framework.utils.PrettyPrintData;
import fr.lip6.move.pnml.framework.utils.exception.InnerBuildException;
import fr.lip6.move.pnml.framework.utils.exception.InvalidIDException;
import fr.lip6.move.pnml.framework.utils.exception.VoidRepositoryException;
import fr.lip6.move.pnml.hlpn.booleans.impl.BooleansFactoryImpl;
import fr.lip6.move.pnml.hlpn.cyclicEnumerations.impl.CyclicEnumerationsFactoryImpl;
import fr.lip6.move.pnml.hlpn.dots.impl.DotsFactoryImpl;
import fr.lip6.move.pnml.hlpn.finiteIntRanges.impl.FiniteIntRangesFactoryImpl;
import fr.lip6.move.pnml.hlpn.integers.impl.IntegersFactoryImpl;
import fr.lip6.move.pnml.hlpn.lists.impl.ListsFactoryImpl;
import fr.lip6.move.pnml.hlpn.multisets.impl.MultisetsFactoryImpl;
import fr.lip6.move.pnml.hlpn.partitions.impl.PartitionsFactoryImpl;
import fr.lip6.move.pnml.hlpn.strings.StringConstant;
import fr.lip6.move.pnml.hlpn.strings.StringsFactory;
import fr.lip6.move.pnml.hlpn.strings.StringsPackage;
import fr.lip6.move.pnml.hlpn.terms.Term;
import fr.lip6.move.pnml.hlpn.terms.impl.BuiltInConstantImpl;
import fr.lip6.move.pnml.hlpn.terms.impl.TermsFactoryImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>String Constant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.lip6.move.pnml.hlpn.strings.impl.StringConstantImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StringConstantImpl extends BuiltInConstantImpl implements StringConstant {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StringConstantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StringsPackage.Literals.STRING_CONSTANT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StringsPackage.STRING_CONSTANT__VALUE, oldValue,
					value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case StringsPackage.STRING_CONSTANT__VALUE:
			return getValue();
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
		case StringsPackage.STRING_CONSTANT__VALUE:
			setValue((String) newValue);
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
		case StringsPackage.STRING_CONSTANT__VALUE:
			setValue(VALUE_EDEFAULT);
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
		case StringsPackage.STRING_CONSTANT__VALUE:
			return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
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
		result.append(" (value: ");
		result.append(value);
		result.append(')');
		return result.toString();
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
	@Override
	public String toPNML() {
		//id 0
		//idref 0
		//attributes 0
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
		sb.append("<stringconstant");
		if (prettyPrintStatus) {
			headline = prpd.increaseLineHeaderLevel();
		}
		//begin attributes, id and id ref processing

		boolean haveSons = false;
		sb.append(">");
		sb.append(retline);

		//sons, follow processing

		if (getSubterm() != null) {

			java.util.List<fr.lip6.move.pnml.hlpn.terms.Term> items = getSubterm();
			for (Iterator<Term> iterator = items.iterator(); iterator.hasNext();) {
				Term item = iterator.next();

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

		if (getValue() != null) {

			sb.append(headline);
			sb.append("<");
			sb.append("value");
			sb.append(">");
			sb.append(getValue().toString());
			sb.append("</");
			sb.append("value");
			sb.append(">");
			sb.append(retline);

			haveSons = true;

		}

		/****/

		if (prettyPrintStatus) {
			headline = prpd.decreaseLineHeaderLevel();
		}

		if (haveSons) {
			sb.append(headline);
			sb.append("</stringconstant>");
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
		//2
		@SuppressWarnings("unused")
		StringsFactory fact = StringsFactory.eINSTANCE;

		//processing id

		//processing idref

		//processing attributes

		//processing sons

		for (Iterator iterator = locRoot.getChildElements(); iterator.hasNext();) {
			@SuppressWarnings("unused")
			OMElement type = (OMElement) iterator.next();

			if (type.getLocalName().equals("subterm")) {

				Term item = null;

				for (Iterator iterator2 = type.getChildElements(); iterator2.hasNext();) {
					OMElement subType = (OMElement) iterator2.next();

					if (subType.getLocalName().equals("stringconstant")) {
						item = new StringsFactoryImpl().createStringConstant();
						item.fromPNML(subType, idr);

						item.setContainerOperator(this);

						continue;
					}

					if (subType.getLocalName().equals("stringappend")) {
						item = new StringsFactoryImpl().createAppend();
						item.fromPNML(subType, idr);

						item.setContainerOperator(this);

						continue;
					}

					if (subType.getLocalName().equals("stringconcatenation")) {
						item = new StringsFactoryImpl().createConcatenation();
						item.fromPNML(subType, idr);

						item.setContainerOperator(this);

						continue;
					}

					if (subType.getLocalName().equals("gts")) {
						item = new StringsFactoryImpl().createGreaterThan();
						item.fromPNML(subType, idr);

						item.setContainerOperator(this);

						continue;
					}

					if (subType.getLocalName().equals("geqs")) {
						item = new StringsFactoryImpl().createGreaterThanOrEqual();
						item.fromPNML(subType, idr);

						item.setContainerOperator(this);

						continue;
					}

					if (subType.getLocalName().equals("lts")) {
						item = new StringsFactoryImpl().createLessThan();
						item.fromPNML(subType, idr);

						item.setContainerOperator(this);

						continue;
					}

					if (subType.getLocalName().equals("leqs")) {
						item = new StringsFactoryImpl().createLessThanOrEqual();
						item.fromPNML(subType, idr);

						item.setContainerOperator(this);

						continue;
					}

					if (subType.getLocalName().equals("stringlength")) {
						item = new StringsFactoryImpl().createLength();
						item.fromPNML(subType, idr);

						item.setContainerOperator(this);

						continue;
					}

					if (subType.getLocalName().equals("substring")) {
						item = new StringsFactoryImpl().createSubstring();
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

					if (subType.getLocalName().equals("emptylist")) {
						item = new ListsFactoryImpl().createEmptyList();
						item.fromPNML(subType, idr);

						item.setContainerOperator(this);

						continue;
					}

					if (subType.getLocalName().equals("listappend")) {
						item = new ListsFactoryImpl().createAppend();
						item.fromPNML(subType, idr);

						item.setContainerOperator(this);

						continue;
					}

					if (subType.getLocalName().equals("listconcatenation")) {
						item = new ListsFactoryImpl().createConcatenation();
						item.fromPNML(subType, idr);

						item.setContainerOperator(this);

						continue;
					}

					if (subType.getLocalName().equals("listlength")) {
						item = new ListsFactoryImpl().createLength();
						item.fromPNML(subType, idr);

						item.setContainerOperator(this);

						continue;
					}

					if (subType.getLocalName().equals("makelist")) {
						item = new ListsFactoryImpl().createMakeList();
						item.fromPNML(subType, idr);

						item.setContainerOperator(this);

						continue;
					}

					if (subType.getLocalName().equals("memberatindex")) {
						item = new ListsFactoryImpl().createMemberAtIndex();
						item.fromPNML(subType, idr);

						item.setContainerOperator(this);

						continue;
					}

					if (subType.getLocalName().equals("sublist")) {
						item = new ListsFactoryImpl().createSublist();
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

				}
			}

			//tag!=null

			if (type.getLocalName().equals("value")) {
				this.setValue(new java.lang.String(type.getText()));
			}

		}

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
	@Override
	public void toPNML(FileChannel fc) {
		//id 0
		//idref 0
		//attributes 0
		//sons 2

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
		sb.append("<stringconstant");
		if (prettyPrintStatus) {
			headline = prpd.increaseLineHeaderLevel();
		}
		//begin attributes, id and id ref processing

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
			java.util.List<fr.lip6.move.pnml.hlpn.terms.Term> items = getSubterm();
			for (Iterator<Term> iterator = items.iterator(); iterator.hasNext();) {
				Term item = iterator.next();

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

		if (getValue() != null) {

			sb.append(headline);
			sb.append("<");
			sb.append("value");
			sb.append(">");
			sb.append(getValue().toString());
			sb.append("</");
			sb.append("value");
			sb.append(">");
			sb.append(retline);

			haveSons = true;

		}

		/****/

		if (prettyPrintStatus) {
			headline = prpd.decreaseLineHeaderLevel();
		}

		sb.append(headline);
		sb.append("</stringconstant>");
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
} //StringConstantImpl
