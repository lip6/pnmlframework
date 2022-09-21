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
package fr.lip6.move.pnml.symmetricnet.partitions.impl;

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
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import fr.lip6.move.pnml.framework.general.PnmlExport;
import fr.lip6.move.pnml.framework.utils.IdRefLinker;
import fr.lip6.move.pnml.framework.utils.ModelRepository;
import fr.lip6.move.pnml.framework.utils.PNMLEncoding;
import fr.lip6.move.pnml.framework.utils.PrettyPrintData;
import fr.lip6.move.pnml.framework.utils.exception.InnerBuildException;
import fr.lip6.move.pnml.framework.utils.exception.InvalidIDException;
import fr.lip6.move.pnml.framework.utils.exception.VoidRepositoryException;
import fr.lip6.move.pnml.symmetricnet.booleans.And;
import fr.lip6.move.pnml.symmetricnet.booleans.BooleanConstant;
import fr.lip6.move.pnml.symmetricnet.booleans.BooleansFactory;
import fr.lip6.move.pnml.symmetricnet.booleans.Equality;
import fr.lip6.move.pnml.symmetricnet.booleans.Imply;
import fr.lip6.move.pnml.symmetricnet.booleans.Inequality;
import fr.lip6.move.pnml.symmetricnet.booleans.Not;
import fr.lip6.move.pnml.symmetricnet.booleans.Or;
import fr.lip6.move.pnml.symmetricnet.cyclicEnumerations.CyclicEnumerationsFactory;
import fr.lip6.move.pnml.symmetricnet.cyclicEnumerations.Predecessor;
import fr.lip6.move.pnml.symmetricnet.cyclicEnumerations.Successor;
import fr.lip6.move.pnml.symmetricnet.dots.DotConstant;
import fr.lip6.move.pnml.symmetricnet.dots.DotsFactory;
import fr.lip6.move.pnml.symmetricnet.finiteIntRanges.FiniteIntRangeConstant;
import fr.lip6.move.pnml.symmetricnet.finiteIntRanges.FiniteIntRangesFactory;
import fr.lip6.move.pnml.symmetricnet.finiteIntRanges.GreaterThanOrEqual;
import fr.lip6.move.pnml.symmetricnet.finiteIntRanges.LessThanOrEqual;
import fr.lip6.move.pnml.symmetricnet.integers.Addition;
import fr.lip6.move.pnml.symmetricnet.integers.Division;
import fr.lip6.move.pnml.symmetricnet.integers.IntegersFactory;
import fr.lip6.move.pnml.symmetricnet.integers.Modulo;
import fr.lip6.move.pnml.symmetricnet.integers.Multiplication;
import fr.lip6.move.pnml.symmetricnet.integers.NumberConstant;
import fr.lip6.move.pnml.symmetricnet.integers.Subtraction;
import fr.lip6.move.pnml.symmetricnet.multisets.Add;
import fr.lip6.move.pnml.symmetricnet.multisets.All;
import fr.lip6.move.pnml.symmetricnet.multisets.Cardinality;
import fr.lip6.move.pnml.symmetricnet.multisets.CardinalityOf;
import fr.lip6.move.pnml.symmetricnet.multisets.Contains;
import fr.lip6.move.pnml.symmetricnet.multisets.Empty;
import fr.lip6.move.pnml.symmetricnet.multisets.MultisetsFactory;
import fr.lip6.move.pnml.symmetricnet.multisets.NumberOf;
import fr.lip6.move.pnml.symmetricnet.multisets.ScalarProduct;
import fr.lip6.move.pnml.symmetricnet.multisets.Subtract;
import fr.lip6.move.pnml.symmetricnet.partitions.GreaterThan;
import fr.lip6.move.pnml.symmetricnet.partitions.LessThan;
import fr.lip6.move.pnml.symmetricnet.partitions.Partition;
import fr.lip6.move.pnml.symmetricnet.partitions.PartitionElement;
import fr.lip6.move.pnml.symmetricnet.partitions.PartitionElementOf;
import fr.lip6.move.pnml.symmetricnet.partitions.PartitionsFactory;
import fr.lip6.move.pnml.symmetricnet.partitions.PartitionsPackage;
import fr.lip6.move.pnml.symmetricnet.terms.Term;
import fr.lip6.move.pnml.symmetricnet.terms.TermsFactory;
import fr.lip6.move.pnml.symmetricnet.terms.TermsPackage;
import fr.lip6.move.pnml.symmetricnet.terms.Tuple;
import fr.lip6.move.pnml.symmetricnet.terms.UserOperator;
import fr.lip6.move.pnml.symmetricnet.terms.Variable;
import fr.lip6.move.pnml.symmetricnet.terms.impl.OperatorDeclImpl;
import fr.lip6.move.pnml.symmetricnet.terms.util.TermsValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Partition Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.lip6.move.pnml.symmetricnet.partitions.impl.PartitionElementImpl#getRefpartition <em>Refpartition</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.symmetricnet.partitions.impl.PartitionElementImpl#getPartitionelementconstants <em>Partitionelementconstants</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PartitionElementImpl extends OperatorDeclImpl implements PartitionElement {
	/**
	 * The cached value of the '{@link #getPartitionelementconstants() <em>Partitionelementconstants</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartitionelementconstants()
	 * @generated
	 * @ordered
	 */
	protected EList<Term> partitionelementconstants;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartitionElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PartitionsPackage.Literals.PARTITION_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Partition getRefpartition() {
		if (eContainerFeatureID() != PartitionsPackage.PARTITION_ELEMENT__REFPARTITION)
			return null;
		return (Partition) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRefpartition(Partition newRefpartition, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newRefpartition, PartitionsPackage.PARTITION_ELEMENT__REFPARTITION,
				msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRefpartition(Partition newRefpartition) {
		if (newRefpartition != eInternalContainer()
				|| (eContainerFeatureID() != PartitionsPackage.PARTITION_ELEMENT__REFPARTITION && newRefpartition != null)) {
			if (EcoreUtil.isAncestor(this, newRefpartition))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRefpartition != null)
				msgs = ((InternalEObject) newRefpartition).eInverseAdd(this,
						PartitionsPackage.PARTITION__PARTITIONELEMENTS, Partition.class, msgs);
			msgs = basicSetRefpartition(newRefpartition, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartitionsPackage.PARTITION_ELEMENT__REFPARTITION,
					newRefpartition, newRefpartition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<Term> getPartitionelementconstants() {
		if (partitionelementconstants == null) {
			partitionelementconstants = new EObjectContainmentWithInverseEList<Term>(Term.class, this,
					PartitionsPackage.PARTITION_ELEMENT__PARTITIONELEMENTCONSTANTS,
					TermsPackage.TERM__CONTAINER_PARTITION_ELEMENT);
		}
		return partitionelementconstants;
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
		case PartitionsPackage.PARTITION_ELEMENT__REFPARTITION:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetRefpartition((Partition) otherEnd, msgs);
		case PartitionsPackage.PARTITION_ELEMENT__PARTITIONELEMENTCONSTANTS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getPartitionelementconstants()).basicAdd(
					otherEnd, msgs);
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
		case PartitionsPackage.PARTITION_ELEMENT__REFPARTITION:
			return basicSetRefpartition(null, msgs);
		case PartitionsPackage.PARTITION_ELEMENT__PARTITIONELEMENTCONSTANTS:
			return ((InternalEList<?>) getPartitionelementconstants()).basicRemove(otherEnd, msgs);
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
		case PartitionsPackage.PARTITION_ELEMENT__REFPARTITION:
			return eInternalContainer().eInverseRemove(this, PartitionsPackage.PARTITION__PARTITIONELEMENTS,
					Partition.class, msgs);
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
		case PartitionsPackage.PARTITION_ELEMENT__REFPARTITION:
			return getRefpartition();
		case PartitionsPackage.PARTITION_ELEMENT__PARTITIONELEMENTCONSTANTS:
			return getPartitionelementconstants();
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
		case PartitionsPackage.PARTITION_ELEMENT__REFPARTITION:
			setRefpartition((Partition) newValue);
			return;
		case PartitionsPackage.PARTITION_ELEMENT__PARTITIONELEMENTCONSTANTS:
			getPartitionelementconstants().clear();
			getPartitionelementconstants().addAll((Collection<? extends Term>) newValue);
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
		case PartitionsPackage.PARTITION_ELEMENT__REFPARTITION:
			setRefpartition((Partition) null);
			return;
		case PartitionsPackage.PARTITION_ELEMENT__PARTITIONELEMENTCONSTANTS:
			getPartitionelementconstants().clear();
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
		case PartitionsPackage.PARTITION_ELEMENT__REFPARTITION:
			return getRefpartition() != null;
		case PartitionsPackage.PARTITION_ELEMENT__PARTITIONELEMENTCONSTANTS:
			return partitionelementconstants != null && !partitionelementconstants.isEmpty();
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
		sb.append("<partitionelement");
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

		if (getPartitionelementconstants() != null) {

			java.util.List<fr.lip6.move.pnml.symmetricnet.terms.Term> items = getPartitionelementconstants();
			for (Iterator<Term> iterator = items.iterator(); iterator.hasNext();) {
				Term item = iterator.next();

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
			sb.append("</partitionelement>");
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
		//1
		@SuppressWarnings("unused")
		PartitionsFactory fact = PartitionsFactory.eINSTANCE;

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

			if (type.getLocalName().equals("gtp")) {
				GreaterThan item;
				item = PartitionsFactory.eINSTANCE.createGreaterThan();
				item.fromPNML(type, idr);

				item.setContainerPartitionElement(this);

				continue;
			}//end if

			if (type.getLocalName().equals("partitionelementof")) {
				PartitionElementOf item;
				item = PartitionsFactory.eINSTANCE.createPartitionElementOf();
				item.fromPNML(type, idr);

				item.setContainerPartitionElement(this);

				continue;
			}//end if

			if (type.getLocalName().equals("ltp")) {
				LessThan item;
				item = PartitionsFactory.eINSTANCE.createLessThan();
				item.fromPNML(type, idr);

				item.setContainerPartitionElement(this);

				continue;
			}//end if

			if (type.getLocalName().equals("equality")) {
				Equality item;
				item = BooleansFactory.eINSTANCE.createEquality();
				item.fromPNML(type, idr);

				item.setContainerPartitionElement(this);

				continue;
			}//end if

			if (type.getLocalName().equals("inequality")) {
				Inequality item;
				item = BooleansFactory.eINSTANCE.createInequality();
				item.fromPNML(type, idr);

				item.setContainerPartitionElement(this);

				continue;
			}//end if

			if (type.getLocalName().equals("booleanconstantt")) {
				BooleanConstant item;
				item = BooleansFactory.eINSTANCE.createBooleanConstant();
				item.fromPNML(type, idr);

				item.setContainerPartitionElement(this);

				continue;
			}//end if

			if (type.getLocalName().equals("or")) {
				Or item;
				item = BooleansFactory.eINSTANCE.createOr();
				item.fromPNML(type, idr);

				item.setContainerPartitionElement(this);

				continue;
			}//end if

			if (type.getLocalName().equals("and")) {
				And item;
				item = BooleansFactory.eINSTANCE.createAnd();
				item.fromPNML(type, idr);

				item.setContainerPartitionElement(this);

				continue;
			}//end if

			if (type.getLocalName().equals("imply")) {
				Imply item;
				item = BooleansFactory.eINSTANCE.createImply();
				item.fromPNML(type, idr);

				item.setContainerPartitionElement(this);

				continue;
			}//end if

			if (type.getLocalName().equals("not")) {
				Not item;
				item = BooleansFactory.eINSTANCE.createNot();
				item.fromPNML(type, idr);

				item.setContainerPartitionElement(this);

				continue;
			}//end if

			if (type.getLocalName().equals("successor")) {
				Successor item;
				item = CyclicEnumerationsFactory.eINSTANCE.createSuccessor();
				item.fromPNML(type, idr);

				item.setContainerPartitionElement(this);

				continue;
			}//end if

			if (type.getLocalName().equals("predecessor")) {
				Predecessor item;
				item = CyclicEnumerationsFactory.eINSTANCE.createPredecessor();
				item.fromPNML(type, idr);

				item.setContainerPartitionElement(this);

				continue;
			}//end if

			if (type.getLocalName().equals("dotconstant")) {
				DotConstant item;
				item = DotsFactory.eINSTANCE.createDotConstant();
				item.fromPNML(type, idr);

				item.setContainerPartitionElement(this);

				continue;
			}//end if

			if (type.getLocalName().equals("finiteintrangeconstant")) {
				FiniteIntRangeConstant item;
				item = FiniteIntRangesFactory.eINSTANCE.createFiniteIntRangeConstant();
				item.fromPNML(type, idr);

				item.setContainerPartitionElement(this);

				continue;
			}//end if

			if (type.getLocalName().equals("lessthan")) {
				fr.lip6.move.pnml.symmetricnet.finiteIntRanges.LessThan item;
				item = FiniteIntRangesFactory.eINSTANCE.createLessThan();
				item.fromPNML(type, idr);

				item.setContainerPartitionElement(this);

				continue;
			}//end if

			if (type.getLocalName().equals("greaterthan")) {
				fr.lip6.move.pnml.symmetricnet.finiteIntRanges.GreaterThan item;
				item = FiniteIntRangesFactory.eINSTANCE.createGreaterThan();
				item.fromPNML(type, idr);

				item.setContainerPartitionElement(this);

				continue;
			}//end if

			if (type.getLocalName().equals("lessthanorequal")) {
				LessThanOrEqual item;
				item = FiniteIntRangesFactory.eINSTANCE.createLessThanOrEqual();
				item.fromPNML(type, idr);

				item.setContainerPartitionElement(this);

				continue;
			}//end if

			if (type.getLocalName().equals("greaterthanorequal")) {
				GreaterThanOrEqual item;
				item = FiniteIntRangesFactory.eINSTANCE.createGreaterThanOrEqual();
				item.fromPNML(type, idr);

				item.setContainerPartitionElement(this);

				continue;
			}//end if

			if (type.getLocalName().equals("numberconstant")) {
				NumberConstant item;
				item = IntegersFactory.eINSTANCE.createNumberConstant();
				item.fromPNML(type, idr);

				item.setContainerPartitionElement(this);

				continue;
			}//end if

			if (type.getLocalName().equals("addition")) {
				Addition item;
				item = IntegersFactory.eINSTANCE.createAddition();
				item.fromPNML(type, idr);

				item.setContainerPartitionElement(this);

				continue;
			}//end if

			if (type.getLocalName().equals("subtraction")) {
				Subtraction item;
				item = IntegersFactory.eINSTANCE.createSubtraction();
				item.fromPNML(type, idr);

				item.setContainerPartitionElement(this);

				continue;
			}//end if

			if (type.getLocalName().equals("mult")) {
				Multiplication item;
				item = IntegersFactory.eINSTANCE.createMultiplication();
				item.fromPNML(type, idr);

				item.setContainerPartitionElement(this);

				continue;
			}//end if

			if (type.getLocalName().equals("div")) {
				Division item;
				item = IntegersFactory.eINSTANCE.createDivision();
				item.fromPNML(type, idr);

				item.setContainerPartitionElement(this);

				continue;
			}//end if

			if (type.getLocalName().equals("mod")) {
				Modulo item;
				item = IntegersFactory.eINSTANCE.createModulo();
				item.fromPNML(type, idr);

				item.setContainerPartitionElement(this);

				continue;
			}//end if

			if (type.getLocalName().equals("gt")) {
				fr.lip6.move.pnml.symmetricnet.integers.GreaterThan item;
				item = IntegersFactory.eINSTANCE.createGreaterThan();
				item.fromPNML(type, idr);

				item.setContainerPartitionElement(this);

				continue;
			}//end if

			if (type.getLocalName().equals("geq")) {
				fr.lip6.move.pnml.symmetricnet.integers.GreaterThanOrEqual item;
				item = IntegersFactory.eINSTANCE.createGreaterThanOrEqual();
				item.fromPNML(type, idr);

				item.setContainerPartitionElement(this);

				continue;
			}//end if

			if (type.getLocalName().equals("lt")) {
				fr.lip6.move.pnml.symmetricnet.integers.LessThan item;
				item = IntegersFactory.eINSTANCE.createLessThan();
				item.fromPNML(type, idr);

				item.setContainerPartitionElement(this);

				continue;
			}//end if

			if (type.getLocalName().equals("leq")) {
				fr.lip6.move.pnml.symmetricnet.integers.LessThanOrEqual item;
				item = IntegersFactory.eINSTANCE.createLessThanOrEqual();
				item.fromPNML(type, idr);

				item.setContainerPartitionElement(this);

				continue;
			}//end if

			if (type.getLocalName().equals("cardinality")) {
				Cardinality item;
				item = MultisetsFactory.eINSTANCE.createCardinality();
				item.fromPNML(type, idr);

				item.setContainerPartitionElement(this);

				continue;
			}//end if

			if (type.getLocalName().equals("contains")) {
				Contains item;
				item = MultisetsFactory.eINSTANCE.createContains();
				item.fromPNML(type, idr);

				item.setContainerPartitionElement(this);

				continue;
			}//end if

			if (type.getLocalName().equals("cardinalityof")) {
				CardinalityOf item;
				item = MultisetsFactory.eINSTANCE.createCardinalityOf();
				item.fromPNML(type, idr);

				item.setContainerPartitionElement(this);

				continue;
			}//end if

			if (type.getLocalName().equals("add")) {
				Add item;
				item = MultisetsFactory.eINSTANCE.createAdd();
				item.fromPNML(type, idr);

				item.setContainerPartitionElement(this);

				continue;
			}//end if

			if (type.getLocalName().equals("all")) {
				All item;
				item = MultisetsFactory.eINSTANCE.createAll();
				item.fromPNML(type, idr);

				item.setContainerPartitionElement(this);

				continue;
			}//end if

			if (type.getLocalName().equals("empty")) {
				Empty item;
				item = MultisetsFactory.eINSTANCE.createEmpty();
				item.fromPNML(type, idr);

				item.setContainerPartitionElement(this);

				continue;
			}//end if

			if (type.getLocalName().equals("numberof")) {
				NumberOf item;
				item = MultisetsFactory.eINSTANCE.createNumberOf();
				item.fromPNML(type, idr);

				item.setContainerPartitionElement(this);

				continue;
			}//end if

			if (type.getLocalName().equals("subtract")) {
				Subtract item;
				item = MultisetsFactory.eINSTANCE.createSubtract();
				item.fromPNML(type, idr);

				item.setContainerPartitionElement(this);

				continue;
			}//end if

			if (type.getLocalName().equals("scalarproduct")) {
				ScalarProduct item;
				item = MultisetsFactory.eINSTANCE.createScalarProduct();
				item.fromPNML(type, idr);

				item.setContainerPartitionElement(this);

				continue;
			}//end if

			if (type.getLocalName().equals("variable")) {
				Variable item;
				item = TermsFactory.eINSTANCE.createVariable();
				item.fromPNML(type, idr);

				item.setContainerPartitionElement(this);

				continue;
			}//end if

			if (type.getLocalName().equals("tuple")) {
				Tuple item;
				item = TermsFactory.eINSTANCE.createTuple();
				item.fromPNML(type, idr);

				item.setContainerPartitionElement(this);

				continue;
			}//end if

			if (type.getLocalName().equals("useroperator")) {
				UserOperator item;
				item = TermsFactory.eINSTANCE.createUserOperator();
				item.fromPNML(type, idr);

				item.setContainerPartitionElement(this);

				continue;
			}//end if

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
		sb.append("<partitionelement");
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

		if (getPartitionelementconstants() != null) {

			try {
				writeIntoStream(bytebuf, fc, sb.toString().getBytes(Charset.forName(charsetEncoding)));
			} catch (IOException io) {
				io.printStackTrace();
				// fail fast
				return;
			}
			sb.delete(0, sb.length());
			java.util.List<fr.lip6.move.pnml.symmetricnet.terms.Term> items = getPartitionelementconstants();
			for (Iterator<Term> iterator = items.iterator(); iterator.hasNext();) {
				Term item = iterator.next();

				item.toPNML(fc);

				haveSons = true;
			}

		}

		/****/

		if (prettyPrintStatus) {
			headline = prpd.decreaseLineHeaderLevel();
		}

		sb.append(headline);
		sb.append("</partitionelement>");
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

		if (getPartitionelementconstants() != null) {
			java.util.List<fr.lip6.move.pnml.symmetricnet.terms.Term> items = getPartitionelementconstants();
			for (Iterator<Term> iterator = items.iterator(); iterator.hasNext();) {
				Term item = iterator.next();
				retour &= item.validateOCL(diagnostics);
			}
		}

		retour &= val.validate(this, diagnostics, null);
		return retour;

	}
} //PartitionElementImpl
