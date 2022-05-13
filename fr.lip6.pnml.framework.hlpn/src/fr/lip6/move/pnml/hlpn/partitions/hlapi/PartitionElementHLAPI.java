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
 * (C) Sorbonne Universités, UPMC Univ Paris 06, UMR CNRS 7606 (LIP6)
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
 *
 * $Id ggiffo, Thu Feb 11 16:29:59 CET 2016$
 */
package fr.lip6.move.pnml.hlpn.partitions.hlapi;

import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.List;

import org.apache.axiom.om.OMElement;
import org.eclipse.emf.common.util.DiagnosticChain;

import fr.lip6.move.pnml.framework.hlapi.HLAPIClass;
import fr.lip6.move.pnml.framework.utils.IdRefLinker;
import fr.lip6.move.pnml.framework.utils.ModelRepository;
import fr.lip6.move.pnml.framework.utils.exception.InnerBuildException;
import fr.lip6.move.pnml.framework.utils.exception.InvalidIDException;
import fr.lip6.move.pnml.framework.utils.exception.OtherException;
import fr.lip6.move.pnml.framework.utils.exception.VoidRepositoryException;
import fr.lip6.move.pnml.hlpn.partitions.Partition;
import fr.lip6.move.pnml.hlpn.partitions.PartitionElement;
import fr.lip6.move.pnml.hlpn.partitions.PartitionsFactory;
import fr.lip6.move.pnml.hlpn.partitions.impl.PartitionsFactoryImpl;
import fr.lip6.move.pnml.hlpn.terms.Declarations;
import fr.lip6.move.pnml.hlpn.terms.Term;
import fr.lip6.move.pnml.hlpn.terms.hlapi.DeclarationsHLAPI;
import fr.lip6.move.pnml.hlpn.terms.hlapi.OperatorDeclHLAPI;
import fr.lip6.move.pnml.hlpn.terms.hlapi.TermHLAPI;
import fr.lip6.move.pnml.hlpn.terms.hlapi.TermsDeclarationHLAPI;


public class PartitionElementHLAPI implements HLAPIClass,TermsDeclarationHLAPI,OperatorDeclHLAPI{

	/**
	 * The contained LLAPI element.
	 */
	private PartitionElement item;

	/**
	 * this constructor allows you to set all 'settable' values
	 * excepted container.
	 */
	
	public PartitionElementHLAPI(
		 java.lang.String id
	
		, java.lang.String name
	) throws InvalidIDException ,VoidRepositoryException {//BEGIN CONSTRUCTOR BODY
		PartitionsFactory fact = PartitionsFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createPartitionElement();}
	
 		
			if(id!=null){
			
				item.setId(ModelRepository.getInstance().getCurrentIdRepository().checkId(id, this));
			}
		
	
 		
			if(name!=null){
			
				item.setName(name);
			}
		
	
	}

	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	
	public PartitionElementHLAPI(
		 java.lang.String id
	
		, java.lang.String name
	
		, DeclarationsHLAPI containerDeclarations
	) throws InvalidIDException ,VoidRepositoryException {//BEGIN CONSTRUCTOR BODY
		PartitionsFactory fact = PartitionsFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createPartitionElement();}
	
 		
			if(id!=null){
			
				item.setId(ModelRepository.getInstance().getCurrentIdRepository().checkId(id, this));
			}
		
	
 		
			if(name!=null){
			
				item.setName(name);
			}
		
	
 		
 		if(containerDeclarations!=null)
			item.setContainerDeclarations((Declarations)containerDeclarations.getContainedItem());
		
	
	}

	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	
	public PartitionElementHLAPI(
		 java.lang.String id
	
		, java.lang.String name
	
		, PartitionHLAPI refpartition
	) throws InvalidIDException ,VoidRepositoryException {//BEGIN CONSTRUCTOR BODY
		PartitionsFactory fact = PartitionsFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createPartitionElement();}
	
 		
			if(id!=null){
			
				item.setId(ModelRepository.getInstance().getCurrentIdRepository().checkId(id, this));
			}
		
	
 		
			if(name!=null){
			
				item.setName(name);
			}
		
	
 		
 		if(refpartition!=null)
			item.setRefpartition((Partition)refpartition.getContainedItem());
		
	
	}



	
	

	/**
	 * This constructor encapsulate a low level API object in HLAPI.
	 */
	public PartitionElementHLAPI(PartitionElement lowLevelAPI){
		item = lowLevelAPI;
	}

	// access to low level API
	/**
	 * Return encapsulated object
	 */
	public PartitionElement getContainedItem(){
		return item;
	}

	//getters giving LLAPI object
	
	/**
	 * Return the encapsulate Low Level API object.
	 */
	public String getId(){
		return item.getId();
	}
	
	/**
	 * Return the encapsulate Low Level API object.
	 */
	public String getName(){
		return item.getName();
	}
	
	/**
	 * Return the encapsulate Low Level API object.
	 */
	public Declarations getContainerDeclarations(){
		return item.getContainerDeclarations();
	}
	
	/**
	 * Return the encapsulate Low Level API object.
	 */
	public Partition getRefpartition(){
		return item.getRefpartition();
	}
	
	/**
	 * Return the encapsulate Low Level API object.
	 */
	public List<Term> getPartitionelementconstants(){
		return item.getPartitionelementconstants();
	}
	

	//getters giving HLAPI object
	
	
	
	
	
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		
		public DeclarationsHLAPI getContainerDeclarationsHLAPI(){
			if(item.getContainerDeclarations() == null) return null;
			return new DeclarationsHLAPI(item.getContainerDeclarations());
		}
		
	
	
	
	
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		
		public PartitionHLAPI getRefpartitionHLAPI(){
			if(item.getRefpartition() == null) return null;
			return new PartitionHLAPI(item.getRefpartition());
		}
		
	
	
	
	
		/**
		 * This accessor automatically encapsulate all elements of the selected sublist.
		 * WARNING : this can creates a lot of new object in memory.
		 */
		
			
		public java.util.List<TermHLAPI> getPartitionelementconstantsHLAPI(){
			java.util.List<TermHLAPI> retour = new ArrayList<TermHLAPI>();
			for (Term elemnt : getPartitionelementconstants()) {
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.partitions.impl.GreaterThanImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.partitions.hlapi.GreaterThanHLAPI(
						(fr.lip6.move.pnml.hlpn.partitions.GreaterThan)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.partitions.impl.PartitionElementOfImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.partitions.hlapi.PartitionElementOfHLAPI(
						(fr.lip6.move.pnml.hlpn.partitions.PartitionElementOf)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.partitions.impl.LessThanImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.partitions.hlapi.LessThanHLAPI(
						(fr.lip6.move.pnml.hlpn.partitions.LessThan)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.booleans.impl.EqualityImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.booleans.hlapi.EqualityHLAPI(
						(fr.lip6.move.pnml.hlpn.booleans.Equality)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.booleans.impl.InequalityImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.booleans.hlapi.InequalityHLAPI(
						(fr.lip6.move.pnml.hlpn.booleans.Inequality)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.booleans.impl.BooleanConstantImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.booleans.hlapi.BooleanConstantHLAPI(
						(fr.lip6.move.pnml.hlpn.booleans.BooleanConstant)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.booleans.impl.OrImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.booleans.hlapi.OrHLAPI(
						(fr.lip6.move.pnml.hlpn.booleans.Or)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.booleans.impl.AndImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.booleans.hlapi.AndHLAPI(
						(fr.lip6.move.pnml.hlpn.booleans.And)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.booleans.impl.ImplyImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.booleans.hlapi.ImplyHLAPI(
						(fr.lip6.move.pnml.hlpn.booleans.Imply)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.booleans.impl.NotImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.booleans.hlapi.NotHLAPI(
						(fr.lip6.move.pnml.hlpn.booleans.Not)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.cyclicEnumerations.impl.SuccessorImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.cyclicEnumerations.hlapi.SuccessorHLAPI(
						(fr.lip6.move.pnml.hlpn.cyclicEnumerations.Successor)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.cyclicEnumerations.impl.PredecessorImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.cyclicEnumerations.hlapi.PredecessorHLAPI(
						(fr.lip6.move.pnml.hlpn.cyclicEnumerations.Predecessor)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.dots.impl.DotConstantImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.dots.hlapi.DotConstantHLAPI(
						(fr.lip6.move.pnml.hlpn.dots.DotConstant)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.finiteIntRanges.impl.FiniteIntRangeConstantImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.finiteIntRanges.hlapi.FiniteIntRangeConstantHLAPI(
						(fr.lip6.move.pnml.hlpn.finiteIntRanges.FiniteIntRangeConstant)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.finiteIntRanges.impl.LessThanImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.finiteIntRanges.hlapi.LessThanHLAPI(
						(fr.lip6.move.pnml.hlpn.finiteIntRanges.LessThan)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.finiteIntRanges.impl.GreaterThanImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.finiteIntRanges.hlapi.GreaterThanHLAPI(
						(fr.lip6.move.pnml.hlpn.finiteIntRanges.GreaterThan)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.finiteIntRanges.impl.LessThanOrEqualImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.finiteIntRanges.hlapi.LessThanOrEqualHLAPI(
						(fr.lip6.move.pnml.hlpn.finiteIntRanges.LessThanOrEqual)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.finiteIntRanges.impl.GreaterThanOrEqualImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.finiteIntRanges.hlapi.GreaterThanOrEqualHLAPI(
						(fr.lip6.move.pnml.hlpn.finiteIntRanges.GreaterThanOrEqual)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.integers.impl.NumberConstantImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.integers.hlapi.NumberConstantHLAPI(
						(fr.lip6.move.pnml.hlpn.integers.NumberConstant)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.integers.impl.AdditionImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.integers.hlapi.AdditionHLAPI(
						(fr.lip6.move.pnml.hlpn.integers.Addition)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.integers.impl.SubtractionImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.integers.hlapi.SubtractionHLAPI(
						(fr.lip6.move.pnml.hlpn.integers.Subtraction)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.integers.impl.MultiplicationImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.integers.hlapi.MultiplicationHLAPI(
						(fr.lip6.move.pnml.hlpn.integers.Multiplication)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.integers.impl.DivisionImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.integers.hlapi.DivisionHLAPI(
						(fr.lip6.move.pnml.hlpn.integers.Division)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.integers.impl.ModuloImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.integers.hlapi.ModuloHLAPI(
						(fr.lip6.move.pnml.hlpn.integers.Modulo)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.integers.impl.GreaterThanImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.integers.hlapi.GreaterThanHLAPI(
						(fr.lip6.move.pnml.hlpn.integers.GreaterThan)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.integers.impl.GreaterThanOrEqualImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.integers.hlapi.GreaterThanOrEqualHLAPI(
						(fr.lip6.move.pnml.hlpn.integers.GreaterThanOrEqual)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.integers.impl.LessThanImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.integers.hlapi.LessThanHLAPI(
						(fr.lip6.move.pnml.hlpn.integers.LessThan)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.integers.impl.LessThanOrEqualImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.integers.hlapi.LessThanOrEqualHLAPI(
						(fr.lip6.move.pnml.hlpn.integers.LessThanOrEqual)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.lists.impl.EmptyListImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.lists.hlapi.EmptyListHLAPI(
						(fr.lip6.move.pnml.hlpn.lists.EmptyList)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.lists.impl.AppendImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.lists.hlapi.AppendHLAPI(
						(fr.lip6.move.pnml.hlpn.lists.Append)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.lists.impl.ConcatenationImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.lists.hlapi.ConcatenationHLAPI(
						(fr.lip6.move.pnml.hlpn.lists.Concatenation)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.lists.impl.LengthImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.lists.hlapi.LengthHLAPI(
						(fr.lip6.move.pnml.hlpn.lists.Length)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.lists.impl.MakeListImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.lists.hlapi.MakeListHLAPI(
						(fr.lip6.move.pnml.hlpn.lists.MakeList)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.lists.impl.MemberAtIndexImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.lists.hlapi.MemberAtIndexHLAPI(
						(fr.lip6.move.pnml.hlpn.lists.MemberAtIndex)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.lists.impl.SublistImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.lists.hlapi.SublistHLAPI(
						(fr.lip6.move.pnml.hlpn.lists.Sublist)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.multisets.impl.CardinalityImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.multisets.hlapi.CardinalityHLAPI(
						(fr.lip6.move.pnml.hlpn.multisets.Cardinality)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.multisets.impl.ContainsImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.multisets.hlapi.ContainsHLAPI(
						(fr.lip6.move.pnml.hlpn.multisets.Contains)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.multisets.impl.CardinalityOfImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.multisets.hlapi.CardinalityOfHLAPI(
						(fr.lip6.move.pnml.hlpn.multisets.CardinalityOf)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.multisets.impl.AddImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.multisets.hlapi.AddHLAPI(
						(fr.lip6.move.pnml.hlpn.multisets.Add)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.multisets.impl.AllImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.multisets.hlapi.AllHLAPI(
						(fr.lip6.move.pnml.hlpn.multisets.All)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.multisets.impl.EmptyImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.multisets.hlapi.EmptyHLAPI(
						(fr.lip6.move.pnml.hlpn.multisets.Empty)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.multisets.impl.NumberOfImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.multisets.hlapi.NumberOfHLAPI(
						(fr.lip6.move.pnml.hlpn.multisets.NumberOf)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.multisets.impl.SubtractImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.multisets.hlapi.SubtractHLAPI(
						(fr.lip6.move.pnml.hlpn.multisets.Subtract)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.multisets.impl.ScalarProductImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.multisets.hlapi.ScalarProductHLAPI(
						(fr.lip6.move.pnml.hlpn.multisets.ScalarProduct)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.strings.impl.StringConstantImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.strings.hlapi.StringConstantHLAPI(
						(fr.lip6.move.pnml.hlpn.strings.StringConstant)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.strings.impl.AppendImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.strings.hlapi.AppendHLAPI(
						(fr.lip6.move.pnml.hlpn.strings.Append)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.strings.impl.ConcatenationImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.strings.hlapi.ConcatenationHLAPI(
						(fr.lip6.move.pnml.hlpn.strings.Concatenation)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.strings.impl.GreaterThanImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.strings.hlapi.GreaterThanHLAPI(
						(fr.lip6.move.pnml.hlpn.strings.GreaterThan)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.strings.impl.GreaterThanOrEqualImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.strings.hlapi.GreaterThanOrEqualHLAPI(
						(fr.lip6.move.pnml.hlpn.strings.GreaterThanOrEqual)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.strings.impl.LessThanImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.strings.hlapi.LessThanHLAPI(
						(fr.lip6.move.pnml.hlpn.strings.LessThan)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.strings.impl.LessThanOrEqualImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.strings.hlapi.LessThanOrEqualHLAPI(
						(fr.lip6.move.pnml.hlpn.strings.LessThanOrEqual)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.strings.impl.LengthImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.strings.hlapi.LengthHLAPI(
						(fr.lip6.move.pnml.hlpn.strings.Length)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.strings.impl.SubstringImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.strings.hlapi.SubstringHLAPI(
						(fr.lip6.move.pnml.hlpn.strings.Substring)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.terms.impl.VariableImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.terms.hlapi.VariableHLAPI(
						(fr.lip6.move.pnml.hlpn.terms.Variable)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.terms.impl.TupleImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.terms.hlapi.TupleHLAPI(
						(fr.lip6.move.pnml.hlpn.terms.Tuple)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.terms.impl.UserOperatorImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.terms.hlapi.UserOperatorHLAPI(
						(fr.lip6.move.pnml.hlpn.terms.UserOperator)elemnt
						));
					continue;
				}
				
			}
			return retour;
		}
		
	
	

	//Special getter for list of generics object, return only one object type.
	
	
	
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of GreaterThanHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.hlpn.partitions.hlapi.GreaterThanHLAPI> getPartitionelementconstants_partitions_GreaterThanHLAPI(){
			java.util.List<fr.lip6.move.pnml.hlpn.partitions.hlapi.GreaterThanHLAPI> retour = new ArrayList<fr.lip6.move.pnml.hlpn.partitions.hlapi.GreaterThanHLAPI>();
			for (Term elemnt : getPartitionelementconstants()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.partitions.impl.GreaterThanImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.partitions.hlapi.GreaterThanHLAPI(
						(fr.lip6.move.pnml.hlpn.partitions.GreaterThan)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of PartitionElementOfHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.hlpn.partitions.hlapi.PartitionElementOfHLAPI> getPartitionelementconstants_partitions_PartitionElementOfHLAPI(){
			java.util.List<fr.lip6.move.pnml.hlpn.partitions.hlapi.PartitionElementOfHLAPI> retour = new ArrayList<fr.lip6.move.pnml.hlpn.partitions.hlapi.PartitionElementOfHLAPI>();
			for (Term elemnt : getPartitionelementconstants()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.partitions.impl.PartitionElementOfImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.partitions.hlapi.PartitionElementOfHLAPI(
						(fr.lip6.move.pnml.hlpn.partitions.PartitionElementOf)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of LessThanHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.hlpn.partitions.hlapi.LessThanHLAPI> getPartitionelementconstants_partitions_LessThanHLAPI(){
			java.util.List<fr.lip6.move.pnml.hlpn.partitions.hlapi.LessThanHLAPI> retour = new ArrayList<fr.lip6.move.pnml.hlpn.partitions.hlapi.LessThanHLAPI>();
			for (Term elemnt : getPartitionelementconstants()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.partitions.impl.LessThanImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.partitions.hlapi.LessThanHLAPI(
						(fr.lip6.move.pnml.hlpn.partitions.LessThan)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of EqualityHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.hlpn.booleans.hlapi.EqualityHLAPI> getPartitionelementconstants_booleans_EqualityHLAPI(){
			java.util.List<fr.lip6.move.pnml.hlpn.booleans.hlapi.EqualityHLAPI> retour = new ArrayList<fr.lip6.move.pnml.hlpn.booleans.hlapi.EqualityHLAPI>();
			for (Term elemnt : getPartitionelementconstants()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.booleans.impl.EqualityImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.booleans.hlapi.EqualityHLAPI(
						(fr.lip6.move.pnml.hlpn.booleans.Equality)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of InequalityHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.hlpn.booleans.hlapi.InequalityHLAPI> getPartitionelementconstants_booleans_InequalityHLAPI(){
			java.util.List<fr.lip6.move.pnml.hlpn.booleans.hlapi.InequalityHLAPI> retour = new ArrayList<fr.lip6.move.pnml.hlpn.booleans.hlapi.InequalityHLAPI>();
			for (Term elemnt : getPartitionelementconstants()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.booleans.impl.InequalityImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.booleans.hlapi.InequalityHLAPI(
						(fr.lip6.move.pnml.hlpn.booleans.Inequality)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of BooleanConstantHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.hlpn.booleans.hlapi.BooleanConstantHLAPI> getPartitionelementconstants_booleans_BooleanConstantHLAPI(){
			java.util.List<fr.lip6.move.pnml.hlpn.booleans.hlapi.BooleanConstantHLAPI> retour = new ArrayList<fr.lip6.move.pnml.hlpn.booleans.hlapi.BooleanConstantHLAPI>();
			for (Term elemnt : getPartitionelementconstants()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.booleans.impl.BooleanConstantImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.booleans.hlapi.BooleanConstantHLAPI(
						(fr.lip6.move.pnml.hlpn.booleans.BooleanConstant)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of OrHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.hlpn.booleans.hlapi.OrHLAPI> getPartitionelementconstants_booleans_OrHLAPI(){
			java.util.List<fr.lip6.move.pnml.hlpn.booleans.hlapi.OrHLAPI> retour = new ArrayList<fr.lip6.move.pnml.hlpn.booleans.hlapi.OrHLAPI>();
			for (Term elemnt : getPartitionelementconstants()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.booleans.impl.OrImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.booleans.hlapi.OrHLAPI(
						(fr.lip6.move.pnml.hlpn.booleans.Or)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of AndHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.hlpn.booleans.hlapi.AndHLAPI> getPartitionelementconstants_booleans_AndHLAPI(){
			java.util.List<fr.lip6.move.pnml.hlpn.booleans.hlapi.AndHLAPI> retour = new ArrayList<fr.lip6.move.pnml.hlpn.booleans.hlapi.AndHLAPI>();
			for (Term elemnt : getPartitionelementconstants()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.booleans.impl.AndImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.booleans.hlapi.AndHLAPI(
						(fr.lip6.move.pnml.hlpn.booleans.And)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of ImplyHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.hlpn.booleans.hlapi.ImplyHLAPI> getPartitionelementconstants_booleans_ImplyHLAPI(){
			java.util.List<fr.lip6.move.pnml.hlpn.booleans.hlapi.ImplyHLAPI> retour = new ArrayList<fr.lip6.move.pnml.hlpn.booleans.hlapi.ImplyHLAPI>();
			for (Term elemnt : getPartitionelementconstants()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.booleans.impl.ImplyImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.booleans.hlapi.ImplyHLAPI(
						(fr.lip6.move.pnml.hlpn.booleans.Imply)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of NotHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.hlpn.booleans.hlapi.NotHLAPI> getPartitionelementconstants_booleans_NotHLAPI(){
			java.util.List<fr.lip6.move.pnml.hlpn.booleans.hlapi.NotHLAPI> retour = new ArrayList<fr.lip6.move.pnml.hlpn.booleans.hlapi.NotHLAPI>();
			for (Term elemnt : getPartitionelementconstants()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.booleans.impl.NotImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.booleans.hlapi.NotHLAPI(
						(fr.lip6.move.pnml.hlpn.booleans.Not)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of SuccessorHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.hlpn.cyclicEnumerations.hlapi.SuccessorHLAPI> getPartitionelementconstants_cyclicEnumerations_SuccessorHLAPI(){
			java.util.List<fr.lip6.move.pnml.hlpn.cyclicEnumerations.hlapi.SuccessorHLAPI> retour = new ArrayList<fr.lip6.move.pnml.hlpn.cyclicEnumerations.hlapi.SuccessorHLAPI>();
			for (Term elemnt : getPartitionelementconstants()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.cyclicEnumerations.impl.SuccessorImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.cyclicEnumerations.hlapi.SuccessorHLAPI(
						(fr.lip6.move.pnml.hlpn.cyclicEnumerations.Successor)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of PredecessorHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.hlpn.cyclicEnumerations.hlapi.PredecessorHLAPI> getPartitionelementconstants_cyclicEnumerations_PredecessorHLAPI(){
			java.util.List<fr.lip6.move.pnml.hlpn.cyclicEnumerations.hlapi.PredecessorHLAPI> retour = new ArrayList<fr.lip6.move.pnml.hlpn.cyclicEnumerations.hlapi.PredecessorHLAPI>();
			for (Term elemnt : getPartitionelementconstants()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.cyclicEnumerations.impl.PredecessorImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.cyclicEnumerations.hlapi.PredecessorHLAPI(
						(fr.lip6.move.pnml.hlpn.cyclicEnumerations.Predecessor)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of DotConstantHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.hlpn.dots.hlapi.DotConstantHLAPI> getPartitionelementconstants_dots_DotConstantHLAPI(){
			java.util.List<fr.lip6.move.pnml.hlpn.dots.hlapi.DotConstantHLAPI> retour = new ArrayList<fr.lip6.move.pnml.hlpn.dots.hlapi.DotConstantHLAPI>();
			for (Term elemnt : getPartitionelementconstants()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.dots.impl.DotConstantImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.dots.hlapi.DotConstantHLAPI(
						(fr.lip6.move.pnml.hlpn.dots.DotConstant)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of FiniteIntRangeConstantHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.hlpn.finiteIntRanges.hlapi.FiniteIntRangeConstantHLAPI> getPartitionelementconstants_finiteIntRanges_FiniteIntRangeConstantHLAPI(){
			java.util.List<fr.lip6.move.pnml.hlpn.finiteIntRanges.hlapi.FiniteIntRangeConstantHLAPI> retour = new ArrayList<fr.lip6.move.pnml.hlpn.finiteIntRanges.hlapi.FiniteIntRangeConstantHLAPI>();
			for (Term elemnt : getPartitionelementconstants()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.finiteIntRanges.impl.FiniteIntRangeConstantImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.finiteIntRanges.hlapi.FiniteIntRangeConstantHLAPI(
						(fr.lip6.move.pnml.hlpn.finiteIntRanges.FiniteIntRangeConstant)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of LessThanHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.hlpn.finiteIntRanges.hlapi.LessThanHLAPI> getPartitionelementconstants_finiteIntRanges_LessThanHLAPI(){
			java.util.List<fr.lip6.move.pnml.hlpn.finiteIntRanges.hlapi.LessThanHLAPI> retour = new ArrayList<fr.lip6.move.pnml.hlpn.finiteIntRanges.hlapi.LessThanHLAPI>();
			for (Term elemnt : getPartitionelementconstants()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.finiteIntRanges.impl.LessThanImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.finiteIntRanges.hlapi.LessThanHLAPI(
						(fr.lip6.move.pnml.hlpn.finiteIntRanges.LessThan)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of GreaterThanHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.hlpn.finiteIntRanges.hlapi.GreaterThanHLAPI> getPartitionelementconstants_finiteIntRanges_GreaterThanHLAPI(){
			java.util.List<fr.lip6.move.pnml.hlpn.finiteIntRanges.hlapi.GreaterThanHLAPI> retour = new ArrayList<fr.lip6.move.pnml.hlpn.finiteIntRanges.hlapi.GreaterThanHLAPI>();
			for (Term elemnt : getPartitionelementconstants()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.finiteIntRanges.impl.GreaterThanImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.finiteIntRanges.hlapi.GreaterThanHLAPI(
						(fr.lip6.move.pnml.hlpn.finiteIntRanges.GreaterThan)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of LessThanOrEqualHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.hlpn.finiteIntRanges.hlapi.LessThanOrEqualHLAPI> getPartitionelementconstants_finiteIntRanges_LessThanOrEqualHLAPI(){
			java.util.List<fr.lip6.move.pnml.hlpn.finiteIntRanges.hlapi.LessThanOrEqualHLAPI> retour = new ArrayList<fr.lip6.move.pnml.hlpn.finiteIntRanges.hlapi.LessThanOrEqualHLAPI>();
			for (Term elemnt : getPartitionelementconstants()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.finiteIntRanges.impl.LessThanOrEqualImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.finiteIntRanges.hlapi.LessThanOrEqualHLAPI(
						(fr.lip6.move.pnml.hlpn.finiteIntRanges.LessThanOrEqual)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of GreaterThanOrEqualHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.hlpn.finiteIntRanges.hlapi.GreaterThanOrEqualHLAPI> getPartitionelementconstants_finiteIntRanges_GreaterThanOrEqualHLAPI(){
			java.util.List<fr.lip6.move.pnml.hlpn.finiteIntRanges.hlapi.GreaterThanOrEqualHLAPI> retour = new ArrayList<fr.lip6.move.pnml.hlpn.finiteIntRanges.hlapi.GreaterThanOrEqualHLAPI>();
			for (Term elemnt : getPartitionelementconstants()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.finiteIntRanges.impl.GreaterThanOrEqualImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.finiteIntRanges.hlapi.GreaterThanOrEqualHLAPI(
						(fr.lip6.move.pnml.hlpn.finiteIntRanges.GreaterThanOrEqual)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of NumberConstantHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.hlpn.integers.hlapi.NumberConstantHLAPI> getPartitionelementconstants_integers_NumberConstantHLAPI(){
			java.util.List<fr.lip6.move.pnml.hlpn.integers.hlapi.NumberConstantHLAPI> retour = new ArrayList<fr.lip6.move.pnml.hlpn.integers.hlapi.NumberConstantHLAPI>();
			for (Term elemnt : getPartitionelementconstants()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.integers.impl.NumberConstantImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.integers.hlapi.NumberConstantHLAPI(
						(fr.lip6.move.pnml.hlpn.integers.NumberConstant)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of AdditionHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.hlpn.integers.hlapi.AdditionHLAPI> getPartitionelementconstants_integers_AdditionHLAPI(){
			java.util.List<fr.lip6.move.pnml.hlpn.integers.hlapi.AdditionHLAPI> retour = new ArrayList<fr.lip6.move.pnml.hlpn.integers.hlapi.AdditionHLAPI>();
			for (Term elemnt : getPartitionelementconstants()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.integers.impl.AdditionImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.integers.hlapi.AdditionHLAPI(
						(fr.lip6.move.pnml.hlpn.integers.Addition)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of SubtractionHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.hlpn.integers.hlapi.SubtractionHLAPI> getPartitionelementconstants_integers_SubtractionHLAPI(){
			java.util.List<fr.lip6.move.pnml.hlpn.integers.hlapi.SubtractionHLAPI> retour = new ArrayList<fr.lip6.move.pnml.hlpn.integers.hlapi.SubtractionHLAPI>();
			for (Term elemnt : getPartitionelementconstants()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.integers.impl.SubtractionImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.integers.hlapi.SubtractionHLAPI(
						(fr.lip6.move.pnml.hlpn.integers.Subtraction)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of MultiplicationHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.hlpn.integers.hlapi.MultiplicationHLAPI> getPartitionelementconstants_integers_MultiplicationHLAPI(){
			java.util.List<fr.lip6.move.pnml.hlpn.integers.hlapi.MultiplicationHLAPI> retour = new ArrayList<fr.lip6.move.pnml.hlpn.integers.hlapi.MultiplicationHLAPI>();
			for (Term elemnt : getPartitionelementconstants()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.integers.impl.MultiplicationImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.integers.hlapi.MultiplicationHLAPI(
						(fr.lip6.move.pnml.hlpn.integers.Multiplication)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of DivisionHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.hlpn.integers.hlapi.DivisionHLAPI> getPartitionelementconstants_integers_DivisionHLAPI(){
			java.util.List<fr.lip6.move.pnml.hlpn.integers.hlapi.DivisionHLAPI> retour = new ArrayList<fr.lip6.move.pnml.hlpn.integers.hlapi.DivisionHLAPI>();
			for (Term elemnt : getPartitionelementconstants()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.integers.impl.DivisionImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.integers.hlapi.DivisionHLAPI(
						(fr.lip6.move.pnml.hlpn.integers.Division)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of ModuloHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.hlpn.integers.hlapi.ModuloHLAPI> getPartitionelementconstants_integers_ModuloHLAPI(){
			java.util.List<fr.lip6.move.pnml.hlpn.integers.hlapi.ModuloHLAPI> retour = new ArrayList<fr.lip6.move.pnml.hlpn.integers.hlapi.ModuloHLAPI>();
			for (Term elemnt : getPartitionelementconstants()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.integers.impl.ModuloImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.integers.hlapi.ModuloHLAPI(
						(fr.lip6.move.pnml.hlpn.integers.Modulo)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of GreaterThanHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.hlpn.integers.hlapi.GreaterThanHLAPI> getPartitionelementconstants_integers_GreaterThanHLAPI(){
			java.util.List<fr.lip6.move.pnml.hlpn.integers.hlapi.GreaterThanHLAPI> retour = new ArrayList<fr.lip6.move.pnml.hlpn.integers.hlapi.GreaterThanHLAPI>();
			for (Term elemnt : getPartitionelementconstants()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.integers.impl.GreaterThanImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.integers.hlapi.GreaterThanHLAPI(
						(fr.lip6.move.pnml.hlpn.integers.GreaterThan)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of GreaterThanOrEqualHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.hlpn.integers.hlapi.GreaterThanOrEqualHLAPI> getPartitionelementconstants_integers_GreaterThanOrEqualHLAPI(){
			java.util.List<fr.lip6.move.pnml.hlpn.integers.hlapi.GreaterThanOrEqualHLAPI> retour = new ArrayList<fr.lip6.move.pnml.hlpn.integers.hlapi.GreaterThanOrEqualHLAPI>();
			for (Term elemnt : getPartitionelementconstants()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.integers.impl.GreaterThanOrEqualImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.integers.hlapi.GreaterThanOrEqualHLAPI(
						(fr.lip6.move.pnml.hlpn.integers.GreaterThanOrEqual)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of LessThanHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.hlpn.integers.hlapi.LessThanHLAPI> getPartitionelementconstants_integers_LessThanHLAPI(){
			java.util.List<fr.lip6.move.pnml.hlpn.integers.hlapi.LessThanHLAPI> retour = new ArrayList<fr.lip6.move.pnml.hlpn.integers.hlapi.LessThanHLAPI>();
			for (Term elemnt : getPartitionelementconstants()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.integers.impl.LessThanImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.integers.hlapi.LessThanHLAPI(
						(fr.lip6.move.pnml.hlpn.integers.LessThan)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of LessThanOrEqualHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.hlpn.integers.hlapi.LessThanOrEqualHLAPI> getPartitionelementconstants_integers_LessThanOrEqualHLAPI(){
			java.util.List<fr.lip6.move.pnml.hlpn.integers.hlapi.LessThanOrEqualHLAPI> retour = new ArrayList<fr.lip6.move.pnml.hlpn.integers.hlapi.LessThanOrEqualHLAPI>();
			for (Term elemnt : getPartitionelementconstants()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.integers.impl.LessThanOrEqualImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.integers.hlapi.LessThanOrEqualHLAPI(
						(fr.lip6.move.pnml.hlpn.integers.LessThanOrEqual)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of EmptyListHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.hlpn.lists.hlapi.EmptyListHLAPI> getPartitionelementconstants_lists_EmptyListHLAPI(){
			java.util.List<fr.lip6.move.pnml.hlpn.lists.hlapi.EmptyListHLAPI> retour = new ArrayList<fr.lip6.move.pnml.hlpn.lists.hlapi.EmptyListHLAPI>();
			for (Term elemnt : getPartitionelementconstants()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.lists.impl.EmptyListImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.lists.hlapi.EmptyListHLAPI(
						(fr.lip6.move.pnml.hlpn.lists.EmptyList)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of AppendHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.hlpn.lists.hlapi.AppendHLAPI> getPartitionelementconstants_lists_AppendHLAPI(){
			java.util.List<fr.lip6.move.pnml.hlpn.lists.hlapi.AppendHLAPI> retour = new ArrayList<fr.lip6.move.pnml.hlpn.lists.hlapi.AppendHLAPI>();
			for (Term elemnt : getPartitionelementconstants()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.lists.impl.AppendImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.lists.hlapi.AppendHLAPI(
						(fr.lip6.move.pnml.hlpn.lists.Append)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of ConcatenationHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.hlpn.lists.hlapi.ConcatenationHLAPI> getPartitionelementconstants_lists_ConcatenationHLAPI(){
			java.util.List<fr.lip6.move.pnml.hlpn.lists.hlapi.ConcatenationHLAPI> retour = new ArrayList<fr.lip6.move.pnml.hlpn.lists.hlapi.ConcatenationHLAPI>();
			for (Term elemnt : getPartitionelementconstants()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.lists.impl.ConcatenationImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.lists.hlapi.ConcatenationHLAPI(
						(fr.lip6.move.pnml.hlpn.lists.Concatenation)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of LengthHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.hlpn.lists.hlapi.LengthHLAPI> getPartitionelementconstants_lists_LengthHLAPI(){
			java.util.List<fr.lip6.move.pnml.hlpn.lists.hlapi.LengthHLAPI> retour = new ArrayList<fr.lip6.move.pnml.hlpn.lists.hlapi.LengthHLAPI>();
			for (Term elemnt : getPartitionelementconstants()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.lists.impl.LengthImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.lists.hlapi.LengthHLAPI(
						(fr.lip6.move.pnml.hlpn.lists.Length)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of MakeListHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.hlpn.lists.hlapi.MakeListHLAPI> getPartitionelementconstants_lists_MakeListHLAPI(){
			java.util.List<fr.lip6.move.pnml.hlpn.lists.hlapi.MakeListHLAPI> retour = new ArrayList<fr.lip6.move.pnml.hlpn.lists.hlapi.MakeListHLAPI>();
			for (Term elemnt : getPartitionelementconstants()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.lists.impl.MakeListImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.lists.hlapi.MakeListHLAPI(
						(fr.lip6.move.pnml.hlpn.lists.MakeList)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of MemberAtIndexHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.hlpn.lists.hlapi.MemberAtIndexHLAPI> getPartitionelementconstants_lists_MemberAtIndexHLAPI(){
			java.util.List<fr.lip6.move.pnml.hlpn.lists.hlapi.MemberAtIndexHLAPI> retour = new ArrayList<fr.lip6.move.pnml.hlpn.lists.hlapi.MemberAtIndexHLAPI>();
			for (Term elemnt : getPartitionelementconstants()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.lists.impl.MemberAtIndexImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.lists.hlapi.MemberAtIndexHLAPI(
						(fr.lip6.move.pnml.hlpn.lists.MemberAtIndex)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of SublistHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.hlpn.lists.hlapi.SublistHLAPI> getPartitionelementconstants_lists_SublistHLAPI(){
			java.util.List<fr.lip6.move.pnml.hlpn.lists.hlapi.SublistHLAPI> retour = new ArrayList<fr.lip6.move.pnml.hlpn.lists.hlapi.SublistHLAPI>();
			for (Term elemnt : getPartitionelementconstants()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.lists.impl.SublistImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.lists.hlapi.SublistHLAPI(
						(fr.lip6.move.pnml.hlpn.lists.Sublist)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of CardinalityHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.hlpn.multisets.hlapi.CardinalityHLAPI> getPartitionelementconstants_multisets_CardinalityHLAPI(){
			java.util.List<fr.lip6.move.pnml.hlpn.multisets.hlapi.CardinalityHLAPI> retour = new ArrayList<fr.lip6.move.pnml.hlpn.multisets.hlapi.CardinalityHLAPI>();
			for (Term elemnt : getPartitionelementconstants()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.multisets.impl.CardinalityImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.multisets.hlapi.CardinalityHLAPI(
						(fr.lip6.move.pnml.hlpn.multisets.Cardinality)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of ContainsHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.hlpn.multisets.hlapi.ContainsHLAPI> getPartitionelementconstants_multisets_ContainsHLAPI(){
			java.util.List<fr.lip6.move.pnml.hlpn.multisets.hlapi.ContainsHLAPI> retour = new ArrayList<fr.lip6.move.pnml.hlpn.multisets.hlapi.ContainsHLAPI>();
			for (Term elemnt : getPartitionelementconstants()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.multisets.impl.ContainsImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.multisets.hlapi.ContainsHLAPI(
						(fr.lip6.move.pnml.hlpn.multisets.Contains)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of CardinalityOfHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.hlpn.multisets.hlapi.CardinalityOfHLAPI> getPartitionelementconstants_multisets_CardinalityOfHLAPI(){
			java.util.List<fr.lip6.move.pnml.hlpn.multisets.hlapi.CardinalityOfHLAPI> retour = new ArrayList<fr.lip6.move.pnml.hlpn.multisets.hlapi.CardinalityOfHLAPI>();
			for (Term elemnt : getPartitionelementconstants()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.multisets.impl.CardinalityOfImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.multisets.hlapi.CardinalityOfHLAPI(
						(fr.lip6.move.pnml.hlpn.multisets.CardinalityOf)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of AddHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.hlpn.multisets.hlapi.AddHLAPI> getPartitionelementconstants_multisets_AddHLAPI(){
			java.util.List<fr.lip6.move.pnml.hlpn.multisets.hlapi.AddHLAPI> retour = new ArrayList<fr.lip6.move.pnml.hlpn.multisets.hlapi.AddHLAPI>();
			for (Term elemnt : getPartitionelementconstants()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.multisets.impl.AddImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.multisets.hlapi.AddHLAPI(
						(fr.lip6.move.pnml.hlpn.multisets.Add)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of AllHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.hlpn.multisets.hlapi.AllHLAPI> getPartitionelementconstants_multisets_AllHLAPI(){
			java.util.List<fr.lip6.move.pnml.hlpn.multisets.hlapi.AllHLAPI> retour = new ArrayList<fr.lip6.move.pnml.hlpn.multisets.hlapi.AllHLAPI>();
			for (Term elemnt : getPartitionelementconstants()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.multisets.impl.AllImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.multisets.hlapi.AllHLAPI(
						(fr.lip6.move.pnml.hlpn.multisets.All)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of EmptyHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.hlpn.multisets.hlapi.EmptyHLAPI> getPartitionelementconstants_multisets_EmptyHLAPI(){
			java.util.List<fr.lip6.move.pnml.hlpn.multisets.hlapi.EmptyHLAPI> retour = new ArrayList<fr.lip6.move.pnml.hlpn.multisets.hlapi.EmptyHLAPI>();
			for (Term elemnt : getPartitionelementconstants()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.multisets.impl.EmptyImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.multisets.hlapi.EmptyHLAPI(
						(fr.lip6.move.pnml.hlpn.multisets.Empty)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of NumberOfHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.hlpn.multisets.hlapi.NumberOfHLAPI> getPartitionelementconstants_multisets_NumberOfHLAPI(){
			java.util.List<fr.lip6.move.pnml.hlpn.multisets.hlapi.NumberOfHLAPI> retour = new ArrayList<fr.lip6.move.pnml.hlpn.multisets.hlapi.NumberOfHLAPI>();
			for (Term elemnt : getPartitionelementconstants()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.multisets.impl.NumberOfImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.multisets.hlapi.NumberOfHLAPI(
						(fr.lip6.move.pnml.hlpn.multisets.NumberOf)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of SubtractHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.hlpn.multisets.hlapi.SubtractHLAPI> getPartitionelementconstants_multisets_SubtractHLAPI(){
			java.util.List<fr.lip6.move.pnml.hlpn.multisets.hlapi.SubtractHLAPI> retour = new ArrayList<fr.lip6.move.pnml.hlpn.multisets.hlapi.SubtractHLAPI>();
			for (Term elemnt : getPartitionelementconstants()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.multisets.impl.SubtractImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.multisets.hlapi.SubtractHLAPI(
						(fr.lip6.move.pnml.hlpn.multisets.Subtract)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of ScalarProductHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.hlpn.multisets.hlapi.ScalarProductHLAPI> getPartitionelementconstants_multisets_ScalarProductHLAPI(){
			java.util.List<fr.lip6.move.pnml.hlpn.multisets.hlapi.ScalarProductHLAPI> retour = new ArrayList<fr.lip6.move.pnml.hlpn.multisets.hlapi.ScalarProductHLAPI>();
			for (Term elemnt : getPartitionelementconstants()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.multisets.impl.ScalarProductImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.multisets.hlapi.ScalarProductHLAPI(
						(fr.lip6.move.pnml.hlpn.multisets.ScalarProduct)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of StringConstantHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.hlpn.strings.hlapi.StringConstantHLAPI> getPartitionelementconstants_strings_StringConstantHLAPI(){
			java.util.List<fr.lip6.move.pnml.hlpn.strings.hlapi.StringConstantHLAPI> retour = new ArrayList<fr.lip6.move.pnml.hlpn.strings.hlapi.StringConstantHLAPI>();
			for (Term elemnt : getPartitionelementconstants()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.strings.impl.StringConstantImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.strings.hlapi.StringConstantHLAPI(
						(fr.lip6.move.pnml.hlpn.strings.StringConstant)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of AppendHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.hlpn.strings.hlapi.AppendHLAPI> getPartitionelementconstants_strings_AppendHLAPI(){
			java.util.List<fr.lip6.move.pnml.hlpn.strings.hlapi.AppendHLAPI> retour = new ArrayList<fr.lip6.move.pnml.hlpn.strings.hlapi.AppendHLAPI>();
			for (Term elemnt : getPartitionelementconstants()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.strings.impl.AppendImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.strings.hlapi.AppendHLAPI(
						(fr.lip6.move.pnml.hlpn.strings.Append)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of ConcatenationHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.hlpn.strings.hlapi.ConcatenationHLAPI> getPartitionelementconstants_strings_ConcatenationHLAPI(){
			java.util.List<fr.lip6.move.pnml.hlpn.strings.hlapi.ConcatenationHLAPI> retour = new ArrayList<fr.lip6.move.pnml.hlpn.strings.hlapi.ConcatenationHLAPI>();
			for (Term elemnt : getPartitionelementconstants()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.strings.impl.ConcatenationImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.strings.hlapi.ConcatenationHLAPI(
						(fr.lip6.move.pnml.hlpn.strings.Concatenation)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of GreaterThanHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.hlpn.strings.hlapi.GreaterThanHLAPI> getPartitionelementconstants_strings_GreaterThanHLAPI(){
			java.util.List<fr.lip6.move.pnml.hlpn.strings.hlapi.GreaterThanHLAPI> retour = new ArrayList<fr.lip6.move.pnml.hlpn.strings.hlapi.GreaterThanHLAPI>();
			for (Term elemnt : getPartitionelementconstants()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.strings.impl.GreaterThanImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.strings.hlapi.GreaterThanHLAPI(
						(fr.lip6.move.pnml.hlpn.strings.GreaterThan)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of GreaterThanOrEqualHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.hlpn.strings.hlapi.GreaterThanOrEqualHLAPI> getPartitionelementconstants_strings_GreaterThanOrEqualHLAPI(){
			java.util.List<fr.lip6.move.pnml.hlpn.strings.hlapi.GreaterThanOrEqualHLAPI> retour = new ArrayList<fr.lip6.move.pnml.hlpn.strings.hlapi.GreaterThanOrEqualHLAPI>();
			for (Term elemnt : getPartitionelementconstants()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.strings.impl.GreaterThanOrEqualImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.strings.hlapi.GreaterThanOrEqualHLAPI(
						(fr.lip6.move.pnml.hlpn.strings.GreaterThanOrEqual)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of LessThanHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.hlpn.strings.hlapi.LessThanHLAPI> getPartitionelementconstants_strings_LessThanHLAPI(){
			java.util.List<fr.lip6.move.pnml.hlpn.strings.hlapi.LessThanHLAPI> retour = new ArrayList<fr.lip6.move.pnml.hlpn.strings.hlapi.LessThanHLAPI>();
			for (Term elemnt : getPartitionelementconstants()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.strings.impl.LessThanImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.strings.hlapi.LessThanHLAPI(
						(fr.lip6.move.pnml.hlpn.strings.LessThan)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of LessThanOrEqualHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.hlpn.strings.hlapi.LessThanOrEqualHLAPI> getPartitionelementconstants_strings_LessThanOrEqualHLAPI(){
			java.util.List<fr.lip6.move.pnml.hlpn.strings.hlapi.LessThanOrEqualHLAPI> retour = new ArrayList<fr.lip6.move.pnml.hlpn.strings.hlapi.LessThanOrEqualHLAPI>();
			for (Term elemnt : getPartitionelementconstants()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.strings.impl.LessThanOrEqualImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.strings.hlapi.LessThanOrEqualHLAPI(
						(fr.lip6.move.pnml.hlpn.strings.LessThanOrEqual)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of LengthHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.hlpn.strings.hlapi.LengthHLAPI> getPartitionelementconstants_strings_LengthHLAPI(){
			java.util.List<fr.lip6.move.pnml.hlpn.strings.hlapi.LengthHLAPI> retour = new ArrayList<fr.lip6.move.pnml.hlpn.strings.hlapi.LengthHLAPI>();
			for (Term elemnt : getPartitionelementconstants()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.strings.impl.LengthImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.strings.hlapi.LengthHLAPI(
						(fr.lip6.move.pnml.hlpn.strings.Length)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of SubstringHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.hlpn.strings.hlapi.SubstringHLAPI> getPartitionelementconstants_strings_SubstringHLAPI(){
			java.util.List<fr.lip6.move.pnml.hlpn.strings.hlapi.SubstringHLAPI> retour = new ArrayList<fr.lip6.move.pnml.hlpn.strings.hlapi.SubstringHLAPI>();
			for (Term elemnt : getPartitionelementconstants()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.strings.impl.SubstringImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.strings.hlapi.SubstringHLAPI(
						(fr.lip6.move.pnml.hlpn.strings.Substring)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of VariableHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.hlpn.terms.hlapi.VariableHLAPI> getPartitionelementconstants_terms_VariableHLAPI(){
			java.util.List<fr.lip6.move.pnml.hlpn.terms.hlapi.VariableHLAPI> retour = new ArrayList<fr.lip6.move.pnml.hlpn.terms.hlapi.VariableHLAPI>();
			for (Term elemnt : getPartitionelementconstants()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.terms.impl.VariableImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.terms.hlapi.VariableHLAPI(
						(fr.lip6.move.pnml.hlpn.terms.Variable)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of TupleHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.hlpn.terms.hlapi.TupleHLAPI> getPartitionelementconstants_terms_TupleHLAPI(){
			java.util.List<fr.lip6.move.pnml.hlpn.terms.hlapi.TupleHLAPI> retour = new ArrayList<fr.lip6.move.pnml.hlpn.terms.hlapi.TupleHLAPI>();
			for (Term elemnt : getPartitionelementconstants()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.terms.impl.TupleImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.terms.hlapi.TupleHLAPI(
						(fr.lip6.move.pnml.hlpn.terms.Tuple)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of UserOperatorHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.hlpn.terms.hlapi.UserOperatorHLAPI> getPartitionelementconstants_terms_UserOperatorHLAPI(){
			java.util.List<fr.lip6.move.pnml.hlpn.terms.hlapi.UserOperatorHLAPI> retour = new ArrayList<fr.lip6.move.pnml.hlpn.terms.hlapi.UserOperatorHLAPI>();
			for (Term elemnt : getPartitionelementconstants()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.terms.impl.UserOperatorImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.terms.hlapi.UserOperatorHLAPI(
						(fr.lip6.move.pnml.hlpn.terms.UserOperator)elemnt
						));
				}
			}
			return retour;
		}
		
	
	

	//setters (including container setter if aviable)
	
	
	/**
	 * set Id
	 */
	public void setIdHLAPI(
	
	java.lang.String elem) throws InvalidIDException ,VoidRepositoryException   {
	
	
		if(elem!=null){
		
			try{
			item.setId(ModelRepository.getInstance().getCurrentIdRepository().changeId(this, elem));
			}catch (OtherException e){
			ModelRepository.getInstance().getCurrentIdRepository().checkId(elem, this);
			}
		}
	
	}
	
	/**
	 * set Name
	 */
	public void setNameHLAPI(
	
	java.lang.String elem){
	
	
		if(elem!=null){
		
			item.setName(elem);
		}
	
	}
	
	/**
	 * set ContainerDeclarations
	 */
	public void setContainerDeclarationsHLAPI(
	
	DeclarationsHLAPI elem){
	
	
 		if(elem!=null)
			item.setContainerDeclarations((Declarations)elem.getContainedItem());
	
	}
	
	/**
	 * set Refpartition
	 */
	public void setRefpartitionHLAPI(
	
	PartitionHLAPI elem){
	
	
 		if(elem!=null)
			item.setRefpartition((Partition)elem.getContainedItem());
	
	}
	

	//setters/remover for lists.
	
	
	public void addPartitionelementconstantsHLAPI(TermHLAPI unit){
	
		item.getPartitionelementconstants().add((Term)unit.getContainedItem());
	}

	public void removePartitionelementconstantsHLAPI(TermHLAPI unit){
		item.getPartitionelementconstants().remove((Term)unit.getContainedItem());
	}
	

	//equals method
	public boolean equals(PartitionElementHLAPI item){
		return item.getContainedItem().equals(getContainedItem());
	}

	//PNML
	
	/**
	 * Returns the PNML xml tree for this object.
	 */
	public String toPNML(){
		return item.toPNML();
	}
	
	/**
	 * Writes the PNML XML tree of this object into file channel.
	 */
	public void toPNML(FileChannel fc){
		 item.toPNML(fc);
	}

	/**
	 * creates an object from the xml nodes.(symetric work of toPNML)
	 */
	public void fromPNML(OMElement subRoot,IdRefLinker idr) throws InnerBuildException, InvalidIDException, VoidRepositoryException{
		item.fromPNML(subRoot,idr);
	}
	

	public boolean validateOCL(DiagnosticChain diagnostics){
		return item.validateOCL(diagnostics);
	}

}