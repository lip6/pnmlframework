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

import javax.xml.namespace.QName;

import org.apache.axiom.om.OMElement;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
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
import fr.lip6.move.pnml.hlpn.booleans.impl.BooleansFactoryImpl;
import fr.lip6.move.pnml.hlpn.cyclicEnumerations.impl.CyclicEnumerationsFactoryImpl;
import fr.lip6.move.pnml.hlpn.dots.impl.DotsFactoryImpl;
import fr.lip6.move.pnml.hlpn.finiteIntRanges.impl.FiniteIntRangesFactoryImpl;
import fr.lip6.move.pnml.hlpn.integers.impl.IntegersFactoryImpl;
import fr.lip6.move.pnml.hlpn.lists.impl.ListsFactoryImpl;
import fr.lip6.move.pnml.hlpn.multisets.impl.MultisetsFactoryImpl;
import fr.lip6.move.pnml.hlpn.partitions.impl.PartitionsFactoryImpl;
import fr.lip6.move.pnml.hlpn.strings.impl.StringsFactoryImpl;
import fr.lip6.move.pnml.hlpn.terms.NamedOperator;
import fr.lip6.move.pnml.hlpn.terms.Term;
import fr.lip6.move.pnml.hlpn.terms.TermsFactory;
import fr.lip6.move.pnml.hlpn.terms.TermsPackage;
import fr.lip6.move.pnml.hlpn.terms.VariableDecl;
import fr.lip6.move.pnml.hlpn.terms.util.TermsValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Named Operator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.lip6.move.pnml.hlpn.terms.impl.NamedOperatorImpl#getDef <em>Def</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.hlpn.terms.impl.NamedOperatorImpl#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NamedOperatorImpl extends OperatorDeclImpl implements NamedOperator {
	/**
	 * The cached value of the '{@link #getDef() <em>Def</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDef()
	 * @generated
	 * @ordered
	 */
	protected Term def;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<VariableDecl> parameters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NamedOperatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TermsPackage.Literals.NAMED_OPERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Term getDef() {
		return def;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDef(Term newDef, NotificationChain msgs) {
		Term oldDef = def;
		def = newDef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					TermsPackage.NAMED_OPERATOR__DEF, oldDef, newDef);
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
	public void setDef(Term newDef) {
		if (newDef != def) {
			NotificationChain msgs = null;
			if (def != null)
				msgs = ((InternalEObject) def).eInverseRemove(this, TermsPackage.TERM__CONTAINER_NAMED_OPERATOR,
						Term.class, msgs);
			if (newDef != null)
				msgs = ((InternalEObject) newDef).eInverseAdd(this, TermsPackage.TERM__CONTAINER_NAMED_OPERATOR,
						Term.class, msgs);
			msgs = basicSetDef(newDef, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TermsPackage.NAMED_OPERATOR__DEF, newDef, newDef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<VariableDecl> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentWithInverseEList<VariableDecl>(VariableDecl.class, this,
					TermsPackage.NAMED_OPERATOR__PARAMETERS, TermsPackage.VARIABLE_DECL__CONTAINER_NAMED_OPERATOR);
		}
		return parameters;
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
		case TermsPackage.NAMED_OPERATOR__DEF:
			if (def != null)
				msgs = ((InternalEObject) def).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- TermsPackage.NAMED_OPERATOR__DEF, null, msgs);
			return basicSetDef((Term) otherEnd, msgs);
		case TermsPackage.NAMED_OPERATOR__PARAMETERS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getParameters()).basicAdd(otherEnd, msgs);
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
		case TermsPackage.NAMED_OPERATOR__DEF:
			return basicSetDef(null, msgs);
		case TermsPackage.NAMED_OPERATOR__PARAMETERS:
			return ((InternalEList<?>) getParameters()).basicRemove(otherEnd, msgs);
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
		case TermsPackage.NAMED_OPERATOR__DEF:
			return getDef();
		case TermsPackage.NAMED_OPERATOR__PARAMETERS:
			return getParameters();
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
		case TermsPackage.NAMED_OPERATOR__DEF:
			setDef((Term) newValue);
			return;
		case TermsPackage.NAMED_OPERATOR__PARAMETERS:
			getParameters().clear();
			getParameters().addAll((Collection<? extends VariableDecl>) newValue);
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
		case TermsPackage.NAMED_OPERATOR__DEF:
			setDef((Term) null);
			return;
		case TermsPackage.NAMED_OPERATOR__PARAMETERS:
			getParameters().clear();
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
		case TermsPackage.NAMED_OPERATOR__DEF:
			return def != null;
		case TermsPackage.NAMED_OPERATOR__PARAMETERS:
			return parameters != null && !parameters.isEmpty();
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
		sb.append("<namedoperator");
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

		if (getDef() != null) {

			String top = getDef().toPNML();
			if (!top.equals("")) {

				sb.append(headline);
				sb.append("<");
				sb.append("def");
				sb.append(">");
				sb.append(top);
				sb.append("</");
				sb.append("def");
				sb.append(">");
				sb.append(retline);

				haveSons = true;
			}

		}

		if (getParameters() != null) {

			java.util.List<fr.lip6.move.pnml.hlpn.terms.VariableDecl> items = getParameters();
			for (Iterator<VariableDecl> iterator = items.iterator(); iterator.hasNext();) {
				VariableDecl item = iterator.next();

				sb.append(headline);
				sb.append("<");
				sb.append("parameter");
				sb.append(">");
				sb.append(item.toPNML());
				sb.append(headline);
				sb.append("</");
				sb.append("parameter");
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
			sb.append("</namedoperator>");
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
		TermsFactory fact = TermsFactory.eINSTANCE;

		//processing id

		if (locRoot.getAttributeValue(new QName("id")) != null) {
			this.setId(new java.lang.String(locRoot.getAttributeValue(new QName("id"))));
			ModelRepository.getInstance().getCurrentIdRepository()
					.checkId(new java.lang.String(locRoot.getAttributeValue(new QName("id"))).toString(), this);
		}

		//processing idref

		//processing attributes

		if (locRoot.getAttributeValue(new QName("name")) != null) {
			try {
				this.setName(new String(locRoot.getAttributeValue(new QName("name"))));
			} catch (Exception e) {
				throw new fr.lip6.move.pnml.framework.utils.exception.InnerBuildException(e);
			}
		}

		//processing sons

		for (Iterator iterator = locRoot.getChildElements(); iterator.hasNext();) {
			@SuppressWarnings("unused")
			OMElement type = (OMElement) iterator.next();

			if (type.getLocalName().equals("def")) {

				fr.lip6.move.pnml.hlpn.terms.Term item = null;

				for (Iterator iterator2 = type.getChildElements(); iterator2.hasNext();) {
					OMElement subType = (OMElement) iterator2.next();

					if (subType.getLocalName().equals("variable")) {
						item = new TermsFactoryImpl().createVariable();
						item.fromPNML(subType, idr);

						item.setContainerNamedOperator(this);

						continue;
					}

					if (subType.getLocalName().equals("tuple")) {
						item = new TermsFactoryImpl().createTuple();
						item.fromPNML(subType, idr);

						item.setContainerNamedOperator(this);

						continue;
					}

					if (subType.getLocalName().equals("useroperator")) {
						item = new TermsFactoryImpl().createUserOperator();
						item.fromPNML(subType, idr);

						item.setContainerNamedOperator(this);

						continue;
					}

					if (subType.getLocalName().equals("equality")) {
						item = new BooleansFactoryImpl().createEquality();
						item.fromPNML(subType, idr);

						item.setContainerNamedOperator(this);

						continue;
					}

					if (subType.getLocalName().equals("inequality")) {
						item = new BooleansFactoryImpl().createInequality();
						item.fromPNML(subType, idr);

						item.setContainerNamedOperator(this);

						continue;
					}

					if (subType.getLocalName().equals("booleanconstantt")) {
						item = new BooleansFactoryImpl().createBooleanConstant();
						item.fromPNML(subType, idr);

						item.setContainerNamedOperator(this);

						continue;
					}

					if (subType.getLocalName().equals("or")) {
						item = new BooleansFactoryImpl().createOr();
						item.fromPNML(subType, idr);

						item.setContainerNamedOperator(this);

						continue;
					}

					if (subType.getLocalName().equals("and")) {
						item = new BooleansFactoryImpl().createAnd();
						item.fromPNML(subType, idr);

						item.setContainerNamedOperator(this);

						continue;
					}

					if (subType.getLocalName().equals("imply")) {
						item = new BooleansFactoryImpl().createImply();
						item.fromPNML(subType, idr);

						item.setContainerNamedOperator(this);

						continue;
					}

					if (subType.getLocalName().equals("not")) {
						item = new BooleansFactoryImpl().createNot();
						item.fromPNML(subType, idr);

						item.setContainerNamedOperator(this);

						continue;
					}

					if (subType.getLocalName().equals("successor")) {
						item = new CyclicEnumerationsFactoryImpl().createSuccessor();
						item.fromPNML(subType, idr);

						item.setContainerNamedOperator(this);

						continue;
					}

					if (subType.getLocalName().equals("predecessor")) {
						item = new CyclicEnumerationsFactoryImpl().createPredecessor();
						item.fromPNML(subType, idr);

						item.setContainerNamedOperator(this);

						continue;
					}

					if (subType.getLocalName().equals("dotconstant")) {
						item = new DotsFactoryImpl().createDotConstant();
						item.fromPNML(subType, idr);

						item.setContainerNamedOperator(this);

						continue;
					}

					if (subType.getLocalName().equals("finiteintrangeconstant")) {
						item = new FiniteIntRangesFactoryImpl().createFiniteIntRangeConstant();
						item.fromPNML(subType, idr);

						item.setContainerNamedOperator(this);

						continue;
					}

					if (subType.getLocalName().equals("lessthan")) {
						item = new FiniteIntRangesFactoryImpl().createLessThan();
						item.fromPNML(subType, idr);

						item.setContainerNamedOperator(this);

						continue;
					}

					if (subType.getLocalName().equals("greaterthan")) {
						item = new FiniteIntRangesFactoryImpl().createGreaterThan();
						item.fromPNML(subType, idr);

						item.setContainerNamedOperator(this);

						continue;
					}

					if (subType.getLocalName().equals("lessthanorequal")) {
						item = new FiniteIntRangesFactoryImpl().createLessThanOrEqual();
						item.fromPNML(subType, idr);

						item.setContainerNamedOperator(this);

						continue;
					}

					if (subType.getLocalName().equals("greaterthanorequal")) {
						item = new FiniteIntRangesFactoryImpl().createGreaterThanOrEqual();
						item.fromPNML(subType, idr);

						item.setContainerNamedOperator(this);

						continue;
					}

					if (subType.getLocalName().equals("numberconstant")) {
						item = new IntegersFactoryImpl().createNumberConstant();
						item.fromPNML(subType, idr);

						item.setContainerNamedOperator(this);

						continue;
					}

					if (subType.getLocalName().equals("addition")) {
						item = new IntegersFactoryImpl().createAddition();
						item.fromPNML(subType, idr);

						item.setContainerNamedOperator(this);

						continue;
					}

					if (subType.getLocalName().equals("subtraction")) {
						item = new IntegersFactoryImpl().createSubtraction();
						item.fromPNML(subType, idr);

						item.setContainerNamedOperator(this);

						continue;
					}

					if (subType.getLocalName().equals("mult")) {
						item = new IntegersFactoryImpl().createMultiplication();
						item.fromPNML(subType, idr);

						item.setContainerNamedOperator(this);

						continue;
					}

					if (subType.getLocalName().equals("div")) {
						item = new IntegersFactoryImpl().createDivision();
						item.fromPNML(subType, idr);

						item.setContainerNamedOperator(this);

						continue;
					}

					if (subType.getLocalName().equals("mod")) {
						item = new IntegersFactoryImpl().createModulo();
						item.fromPNML(subType, idr);

						item.setContainerNamedOperator(this);

						continue;
					}

					if (subType.getLocalName().equals("gt")) {
						item = new IntegersFactoryImpl().createGreaterThan();
						item.fromPNML(subType, idr);

						item.setContainerNamedOperator(this);

						continue;
					}

					if (subType.getLocalName().equals("geq")) {
						item = new IntegersFactoryImpl().createGreaterThanOrEqual();
						item.fromPNML(subType, idr);

						item.setContainerNamedOperator(this);

						continue;
					}

					if (subType.getLocalName().equals("lt")) {
						item = new IntegersFactoryImpl().createLessThan();
						item.fromPNML(subType, idr);

						item.setContainerNamedOperator(this);

						continue;
					}

					if (subType.getLocalName().equals("leq")) {
						item = new IntegersFactoryImpl().createLessThanOrEqual();
						item.fromPNML(subType, idr);

						item.setContainerNamedOperator(this);

						continue;
					}

					if (subType.getLocalName().equals("emptylist")) {
						item = new ListsFactoryImpl().createEmptyList();
						item.fromPNML(subType, idr);

						item.setContainerNamedOperator(this);

						continue;
					}

					if (subType.getLocalName().equals("listappend")) {
						item = new ListsFactoryImpl().createAppend();
						item.fromPNML(subType, idr);

						item.setContainerNamedOperator(this);

						continue;
					}

					if (subType.getLocalName().equals("listconcatenation")) {
						item = new ListsFactoryImpl().createConcatenation();
						item.fromPNML(subType, idr);

						item.setContainerNamedOperator(this);

						continue;
					}

					if (subType.getLocalName().equals("listlength")) {
						item = new ListsFactoryImpl().createLength();
						item.fromPNML(subType, idr);

						item.setContainerNamedOperator(this);

						continue;
					}

					if (subType.getLocalName().equals("makelist")) {
						item = new ListsFactoryImpl().createMakeList();
						item.fromPNML(subType, idr);

						item.setContainerNamedOperator(this);

						continue;
					}

					if (subType.getLocalName().equals("memberatindex")) {
						item = new ListsFactoryImpl().createMemberAtIndex();
						item.fromPNML(subType, idr);

						item.setContainerNamedOperator(this);

						continue;
					}

					if (subType.getLocalName().equals("sublist")) {
						item = new ListsFactoryImpl().createSublist();
						item.fromPNML(subType, idr);

						item.setContainerNamedOperator(this);

						continue;
					}

					if (subType.getLocalName().equals("cardinality")) {
						item = new MultisetsFactoryImpl().createCardinality();
						item.fromPNML(subType, idr);

						item.setContainerNamedOperator(this);

						continue;
					}

					if (subType.getLocalName().equals("contains")) {
						item = new MultisetsFactoryImpl().createContains();
						item.fromPNML(subType, idr);

						item.setContainerNamedOperator(this);

						continue;
					}

					if (subType.getLocalName().equals("cardinalityof")) {
						item = new MultisetsFactoryImpl().createCardinalityOf();
						item.fromPNML(subType, idr);

						item.setContainerNamedOperator(this);

						continue;
					}

					if (subType.getLocalName().equals("add")) {
						item = new MultisetsFactoryImpl().createAdd();
						item.fromPNML(subType, idr);

						item.setContainerNamedOperator(this);

						continue;
					}

					if (subType.getLocalName().equals("all")) {
						item = new MultisetsFactoryImpl().createAll();
						item.fromPNML(subType, idr);

						item.setContainerNamedOperator(this);

						continue;
					}

					if (subType.getLocalName().equals("empty")) {
						item = new MultisetsFactoryImpl().createEmpty();
						item.fromPNML(subType, idr);

						item.setContainerNamedOperator(this);

						continue;
					}

					if (subType.getLocalName().equals("numberof")) {
						item = new MultisetsFactoryImpl().createNumberOf();
						item.fromPNML(subType, idr);

						item.setContainerNamedOperator(this);

						continue;
					}

					if (subType.getLocalName().equals("subtract")) {
						item = new MultisetsFactoryImpl().createSubtract();
						item.fromPNML(subType, idr);

						item.setContainerNamedOperator(this);

						continue;
					}

					if (subType.getLocalName().equals("scalarproduct")) {
						item = new MultisetsFactoryImpl().createScalarProduct();
						item.fromPNML(subType, idr);

						item.setContainerNamedOperator(this);

						continue;
					}

					if (subType.getLocalName().equals("gtp")) {
						item = new PartitionsFactoryImpl().createGreaterThan();
						item.fromPNML(subType, idr);

						item.setContainerNamedOperator(this);

						continue;
					}

					if (subType.getLocalName().equals("partitionelementof")) {
						item = new PartitionsFactoryImpl().createPartitionElementOf();
						item.fromPNML(subType, idr);

						item.setContainerNamedOperator(this);

						continue;
					}

					if (subType.getLocalName().equals("ltp")) {
						item = new PartitionsFactoryImpl().createLessThan();
						item.fromPNML(subType, idr);

						item.setContainerNamedOperator(this);

						continue;
					}

					if (subType.getLocalName().equals("stringconstant")) {
						item = new StringsFactoryImpl().createStringConstant();
						item.fromPNML(subType, idr);

						item.setContainerNamedOperator(this);

						continue;
					}

					if (subType.getLocalName().equals("stringappend")) {
						item = new StringsFactoryImpl().createAppend();
						item.fromPNML(subType, idr);

						item.setContainerNamedOperator(this);

						continue;
					}

					if (subType.getLocalName().equals("stringconcatenation")) {
						item = new StringsFactoryImpl().createConcatenation();
						item.fromPNML(subType, idr);

						item.setContainerNamedOperator(this);

						continue;
					}

					if (subType.getLocalName().equals("gts")) {
						item = new StringsFactoryImpl().createGreaterThan();
						item.fromPNML(subType, idr);

						item.setContainerNamedOperator(this);

						continue;
					}

					if (subType.getLocalName().equals("geqs")) {
						item = new StringsFactoryImpl().createGreaterThanOrEqual();
						item.fromPNML(subType, idr);

						item.setContainerNamedOperator(this);

						continue;
					}

					if (subType.getLocalName().equals("lts")) {
						item = new StringsFactoryImpl().createLessThan();
						item.fromPNML(subType, idr);

						item.setContainerNamedOperator(this);

						continue;
					}

					if (subType.getLocalName().equals("leqs")) {
						item = new StringsFactoryImpl().createLessThanOrEqual();
						item.fromPNML(subType, idr);

						item.setContainerNamedOperator(this);

						continue;
					}

					if (subType.getLocalName().equals("stringlength")) {
						item = new StringsFactoryImpl().createLength();
						item.fromPNML(subType, idr);

						item.setContainerNamedOperator(this);

						continue;
					}

					if (subType.getLocalName().equals("substring")) {
						item = new StringsFactoryImpl().createSubstring();
						item.fromPNML(subType, idr);

						item.setContainerNamedOperator(this);

						continue;
					}

				}
			}

			//tag!=null

			if (type.getLocalName().equals("parameter")) {

				VariableDecl item = null;

				for (Iterator iterator2 = type.getChildElements(); iterator2.hasNext();) {
					OMElement subType = (OMElement) iterator2.next();

					if (subType.getLocalName().equals("variabledecl")) {
						item = new TermsFactoryImpl().createVariableDecl();
						item.fromPNML(subType, idr);

						item.setContainerNamedOperator(this);

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
		sb.append("<namedoperator");
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

		if (getDef() != null) {

			String top = getDef().toPNML();
			if (!top.equals("")) {

				sb.append(headline);
				sb.append("<");
				sb.append("def");
				sb.append(">");
				sb.append(top);
				sb.append("</");
				sb.append("def");
				sb.append(">");
				sb.append(retline);

				haveSons = true;
			}

		}

		if (getParameters() != null) {

			try {
				writeIntoStream(bytebuf, fc, sb.toString().getBytes(Charset.forName(charsetEncoding)));
			} catch (IOException io) {
				io.printStackTrace();
				// fail fast
				return;
			}
			sb.delete(0, sb.length());
			java.util.List<fr.lip6.move.pnml.hlpn.terms.VariableDecl> items = getParameters();
			for (Iterator<VariableDecl> iterator = items.iterator(); iterator.hasNext();) {
				VariableDecl item = iterator.next();

				sb.append(headline);
				sb.append("<");
				sb.append("parameter");
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
				sb.append("parameter");
				sb.append(">");

				haveSons = true;
			}

		}

		/****/

		if (prettyPrintStatus) {
			headline = prpd.decreaseLineHeaderLevel();
		}

		sb.append(headline);
		sb.append("</namedoperator>");
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

		if (getDef() != null) {
			retour &= getDef().validateOCL(diagnostics);
		}

		if (getParameters() != null) {
			java.util.List<fr.lip6.move.pnml.hlpn.terms.VariableDecl> items = getParameters();
			for (Iterator<VariableDecl> iterator = items.iterator(); iterator.hasNext();) {
				VariableDecl item = iterator.next();
				retour &= item.validateOCL(diagnostics);
			}
		}

		retour &= val.validate(this, diagnostics, null);
		return retour;

	}
} //NamedOperatorImpl
