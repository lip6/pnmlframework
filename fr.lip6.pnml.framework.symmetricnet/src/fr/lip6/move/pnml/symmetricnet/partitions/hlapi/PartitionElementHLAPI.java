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
 * $Id ggiffo, Thu Feb 11 16:29:03 CET 2016$
 */
package fr.lip6.move.pnml.symmetricnet.partitions.hlapi;

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
import fr.lip6.move.pnml.symmetricnet.partitions.Partition;
import fr.lip6.move.pnml.symmetricnet.partitions.PartitionElement;
import fr.lip6.move.pnml.symmetricnet.partitions.PartitionsFactory;
import fr.lip6.move.pnml.symmetricnet.partitions.impl.PartitionsFactoryImpl;
import fr.lip6.move.pnml.symmetricnet.terms.Declarations;
import fr.lip6.move.pnml.symmetricnet.terms.Term;
import fr.lip6.move.pnml.symmetricnet.terms.hlapi.DeclarationsHLAPI;
import fr.lip6.move.pnml.symmetricnet.terms.hlapi.OperatorDeclHLAPI;
import fr.lip6.move.pnml.symmetricnet.terms.hlapi.TermHLAPI;
import fr.lip6.move.pnml.symmetricnet.terms.hlapi.TermsDeclarationHLAPI;


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
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.symmetricnet.partitions.impl.GreaterThanImpl.class)){
					retour.add(new fr.lip6.move.pnml.symmetricnet.partitions.hlapi.GreaterThanHLAPI(
						(fr.lip6.move.pnml.symmetricnet.partitions.GreaterThan)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.symmetricnet.partitions.impl.PartitionElementOfImpl.class)){
					retour.add(new fr.lip6.move.pnml.symmetricnet.partitions.hlapi.PartitionElementOfHLAPI(
						(fr.lip6.move.pnml.symmetricnet.partitions.PartitionElementOf)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.symmetricnet.partitions.impl.LessThanImpl.class)){
					retour.add(new fr.lip6.move.pnml.symmetricnet.partitions.hlapi.LessThanHLAPI(
						(fr.lip6.move.pnml.symmetricnet.partitions.LessThan)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.symmetricnet.booleans.impl.EqualityImpl.class)){
					retour.add(new fr.lip6.move.pnml.symmetricnet.booleans.hlapi.EqualityHLAPI(
						(fr.lip6.move.pnml.symmetricnet.booleans.Equality)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.symmetricnet.booleans.impl.InequalityImpl.class)){
					retour.add(new fr.lip6.move.pnml.symmetricnet.booleans.hlapi.InequalityHLAPI(
						(fr.lip6.move.pnml.symmetricnet.booleans.Inequality)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.symmetricnet.booleans.impl.BooleanConstantImpl.class)){
					retour.add(new fr.lip6.move.pnml.symmetricnet.booleans.hlapi.BooleanConstantHLAPI(
						(fr.lip6.move.pnml.symmetricnet.booleans.BooleanConstant)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.symmetricnet.booleans.impl.OrImpl.class)){
					retour.add(new fr.lip6.move.pnml.symmetricnet.booleans.hlapi.OrHLAPI(
						(fr.lip6.move.pnml.symmetricnet.booleans.Or)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.symmetricnet.booleans.impl.AndImpl.class)){
					retour.add(new fr.lip6.move.pnml.symmetricnet.booleans.hlapi.AndHLAPI(
						(fr.lip6.move.pnml.symmetricnet.booleans.And)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.symmetricnet.booleans.impl.ImplyImpl.class)){
					retour.add(new fr.lip6.move.pnml.symmetricnet.booleans.hlapi.ImplyHLAPI(
						(fr.lip6.move.pnml.symmetricnet.booleans.Imply)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.symmetricnet.booleans.impl.NotImpl.class)){
					retour.add(new fr.lip6.move.pnml.symmetricnet.booleans.hlapi.NotHLAPI(
						(fr.lip6.move.pnml.symmetricnet.booleans.Not)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.symmetricnet.cyclicEnumerations.impl.SuccessorImpl.class)){
					retour.add(new fr.lip6.move.pnml.symmetricnet.cyclicEnumerations.hlapi.SuccessorHLAPI(
						(fr.lip6.move.pnml.symmetricnet.cyclicEnumerations.Successor)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.symmetricnet.cyclicEnumerations.impl.PredecessorImpl.class)){
					retour.add(new fr.lip6.move.pnml.symmetricnet.cyclicEnumerations.hlapi.PredecessorHLAPI(
						(fr.lip6.move.pnml.symmetricnet.cyclicEnumerations.Predecessor)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.symmetricnet.dots.impl.DotConstantImpl.class)){
					retour.add(new fr.lip6.move.pnml.symmetricnet.dots.hlapi.DotConstantHLAPI(
						(fr.lip6.move.pnml.symmetricnet.dots.DotConstant)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.symmetricnet.finiteIntRanges.impl.FiniteIntRangeConstantImpl.class)){
					retour.add(new fr.lip6.move.pnml.symmetricnet.finiteIntRanges.hlapi.FiniteIntRangeConstantHLAPI(
						(fr.lip6.move.pnml.symmetricnet.finiteIntRanges.FiniteIntRangeConstant)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.symmetricnet.finiteIntRanges.impl.LessThanImpl.class)){
					retour.add(new fr.lip6.move.pnml.symmetricnet.finiteIntRanges.hlapi.LessThanHLAPI(
						(fr.lip6.move.pnml.symmetricnet.finiteIntRanges.LessThan)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.symmetricnet.finiteIntRanges.impl.GreaterThanImpl.class)){
					retour.add(new fr.lip6.move.pnml.symmetricnet.finiteIntRanges.hlapi.GreaterThanHLAPI(
						(fr.lip6.move.pnml.symmetricnet.finiteIntRanges.GreaterThan)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.symmetricnet.finiteIntRanges.impl.LessThanOrEqualImpl.class)){
					retour.add(new fr.lip6.move.pnml.symmetricnet.finiteIntRanges.hlapi.LessThanOrEqualHLAPI(
						(fr.lip6.move.pnml.symmetricnet.finiteIntRanges.LessThanOrEqual)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.symmetricnet.finiteIntRanges.impl.GreaterThanOrEqualImpl.class)){
					retour.add(new fr.lip6.move.pnml.symmetricnet.finiteIntRanges.hlapi.GreaterThanOrEqualHLAPI(
						(fr.lip6.move.pnml.symmetricnet.finiteIntRanges.GreaterThanOrEqual)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.symmetricnet.integers.impl.NumberConstantImpl.class)){
					retour.add(new fr.lip6.move.pnml.symmetricnet.integers.hlapi.NumberConstantHLAPI(
						(fr.lip6.move.pnml.symmetricnet.integers.NumberConstant)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.symmetricnet.integers.impl.AdditionImpl.class)){
					retour.add(new fr.lip6.move.pnml.symmetricnet.integers.hlapi.AdditionHLAPI(
						(fr.lip6.move.pnml.symmetricnet.integers.Addition)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.symmetricnet.integers.impl.SubtractionImpl.class)){
					retour.add(new fr.lip6.move.pnml.symmetricnet.integers.hlapi.SubtractionHLAPI(
						(fr.lip6.move.pnml.symmetricnet.integers.Subtraction)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.symmetricnet.integers.impl.MultiplicationImpl.class)){
					retour.add(new fr.lip6.move.pnml.symmetricnet.integers.hlapi.MultiplicationHLAPI(
						(fr.lip6.move.pnml.symmetricnet.integers.Multiplication)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.symmetricnet.integers.impl.DivisionImpl.class)){
					retour.add(new fr.lip6.move.pnml.symmetricnet.integers.hlapi.DivisionHLAPI(
						(fr.lip6.move.pnml.symmetricnet.integers.Division)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.symmetricnet.integers.impl.ModuloImpl.class)){
					retour.add(new fr.lip6.move.pnml.symmetricnet.integers.hlapi.ModuloHLAPI(
						(fr.lip6.move.pnml.symmetricnet.integers.Modulo)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.symmetricnet.integers.impl.GreaterThanImpl.class)){
					retour.add(new fr.lip6.move.pnml.symmetricnet.integers.hlapi.GreaterThanHLAPI(
						(fr.lip6.move.pnml.symmetricnet.integers.GreaterThan)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.symmetricnet.integers.impl.GreaterThanOrEqualImpl.class)){
					retour.add(new fr.lip6.move.pnml.symmetricnet.integers.hlapi.GreaterThanOrEqualHLAPI(
						(fr.lip6.move.pnml.symmetricnet.integers.GreaterThanOrEqual)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.symmetricnet.integers.impl.LessThanImpl.class)){
					retour.add(new fr.lip6.move.pnml.symmetricnet.integers.hlapi.LessThanHLAPI(
						(fr.lip6.move.pnml.symmetricnet.integers.LessThan)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.symmetricnet.integers.impl.LessThanOrEqualImpl.class)){
					retour.add(new fr.lip6.move.pnml.symmetricnet.integers.hlapi.LessThanOrEqualHLAPI(
						(fr.lip6.move.pnml.symmetricnet.integers.LessThanOrEqual)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.symmetricnet.multisets.impl.CardinalityImpl.class)){
					retour.add(new fr.lip6.move.pnml.symmetricnet.multisets.hlapi.CardinalityHLAPI(
						(fr.lip6.move.pnml.symmetricnet.multisets.Cardinality)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.symmetricnet.multisets.impl.ContainsImpl.class)){
					retour.add(new fr.lip6.move.pnml.symmetricnet.multisets.hlapi.ContainsHLAPI(
						(fr.lip6.move.pnml.symmetricnet.multisets.Contains)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.symmetricnet.multisets.impl.CardinalityOfImpl.class)){
					retour.add(new fr.lip6.move.pnml.symmetricnet.multisets.hlapi.CardinalityOfHLAPI(
						(fr.lip6.move.pnml.symmetricnet.multisets.CardinalityOf)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.symmetricnet.multisets.impl.AddImpl.class)){
					retour.add(new fr.lip6.move.pnml.symmetricnet.multisets.hlapi.AddHLAPI(
						(fr.lip6.move.pnml.symmetricnet.multisets.Add)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.symmetricnet.multisets.impl.AllImpl.class)){
					retour.add(new fr.lip6.move.pnml.symmetricnet.multisets.hlapi.AllHLAPI(
						(fr.lip6.move.pnml.symmetricnet.multisets.All)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.symmetricnet.multisets.impl.EmptyImpl.class)){
					retour.add(new fr.lip6.move.pnml.symmetricnet.multisets.hlapi.EmptyHLAPI(
						(fr.lip6.move.pnml.symmetricnet.multisets.Empty)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.symmetricnet.multisets.impl.NumberOfImpl.class)){
					retour.add(new fr.lip6.move.pnml.symmetricnet.multisets.hlapi.NumberOfHLAPI(
						(fr.lip6.move.pnml.symmetricnet.multisets.NumberOf)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.symmetricnet.multisets.impl.SubtractImpl.class)){
					retour.add(new fr.lip6.move.pnml.symmetricnet.multisets.hlapi.SubtractHLAPI(
						(fr.lip6.move.pnml.symmetricnet.multisets.Subtract)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.symmetricnet.multisets.impl.ScalarProductImpl.class)){
					retour.add(new fr.lip6.move.pnml.symmetricnet.multisets.hlapi.ScalarProductHLAPI(
						(fr.lip6.move.pnml.symmetricnet.multisets.ScalarProduct)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.symmetricnet.terms.impl.VariableImpl.class)){
					retour.add(new fr.lip6.move.pnml.symmetricnet.terms.hlapi.VariableHLAPI(
						(fr.lip6.move.pnml.symmetricnet.terms.Variable)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.symmetricnet.terms.impl.TupleImpl.class)){
					retour.add(new fr.lip6.move.pnml.symmetricnet.terms.hlapi.TupleHLAPI(
						(fr.lip6.move.pnml.symmetricnet.terms.Tuple)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.symmetricnet.terms.impl.UserOperatorImpl.class)){
					retour.add(new fr.lip6.move.pnml.symmetricnet.terms.hlapi.UserOperatorHLAPI(
						(fr.lip6.move.pnml.symmetricnet.terms.UserOperator)elemnt
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
		public java.util.List<fr.lip6.move.pnml.symmetricnet.partitions.hlapi.GreaterThanHLAPI> getPartitionelementconstants_partitions_GreaterThanHLAPI(){
			java.util.List<fr.lip6.move.pnml.symmetricnet.partitions.hlapi.GreaterThanHLAPI> retour = new ArrayList<fr.lip6.move.pnml.symmetricnet.partitions.hlapi.GreaterThanHLAPI>();
			for (Term elemnt : getPartitionelementconstants()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.symmetricnet.partitions.impl.GreaterThanImpl.class)){
					retour.add(new fr.lip6.move.pnml.symmetricnet.partitions.hlapi.GreaterThanHLAPI(
						(fr.lip6.move.pnml.symmetricnet.partitions.GreaterThan)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of PartitionElementOfHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.symmetricnet.partitions.hlapi.PartitionElementOfHLAPI> getPartitionelementconstants_partitions_PartitionElementOfHLAPI(){
			java.util.List<fr.lip6.move.pnml.symmetricnet.partitions.hlapi.PartitionElementOfHLAPI> retour = new ArrayList<fr.lip6.move.pnml.symmetricnet.partitions.hlapi.PartitionElementOfHLAPI>();
			for (Term elemnt : getPartitionelementconstants()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.symmetricnet.partitions.impl.PartitionElementOfImpl.class)){
					retour.add(new fr.lip6.move.pnml.symmetricnet.partitions.hlapi.PartitionElementOfHLAPI(
						(fr.lip6.move.pnml.symmetricnet.partitions.PartitionElementOf)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of LessThanHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.symmetricnet.partitions.hlapi.LessThanHLAPI> getPartitionelementconstants_partitions_LessThanHLAPI(){
			java.util.List<fr.lip6.move.pnml.symmetricnet.partitions.hlapi.LessThanHLAPI> retour = new ArrayList<fr.lip6.move.pnml.symmetricnet.partitions.hlapi.LessThanHLAPI>();
			for (Term elemnt : getPartitionelementconstants()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.symmetricnet.partitions.impl.LessThanImpl.class)){
					retour.add(new fr.lip6.move.pnml.symmetricnet.partitions.hlapi.LessThanHLAPI(
						(fr.lip6.move.pnml.symmetricnet.partitions.LessThan)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of EqualityHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.symmetricnet.booleans.hlapi.EqualityHLAPI> getPartitionelementconstants_booleans_EqualityHLAPI(){
			java.util.List<fr.lip6.move.pnml.symmetricnet.booleans.hlapi.EqualityHLAPI> retour = new ArrayList<fr.lip6.move.pnml.symmetricnet.booleans.hlapi.EqualityHLAPI>();
			for (Term elemnt : getPartitionelementconstants()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.symmetricnet.booleans.impl.EqualityImpl.class)){
					retour.add(new fr.lip6.move.pnml.symmetricnet.booleans.hlapi.EqualityHLAPI(
						(fr.lip6.move.pnml.symmetricnet.booleans.Equality)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of InequalityHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.symmetricnet.booleans.hlapi.InequalityHLAPI> getPartitionelementconstants_booleans_InequalityHLAPI(){
			java.util.List<fr.lip6.move.pnml.symmetricnet.booleans.hlapi.InequalityHLAPI> retour = new ArrayList<fr.lip6.move.pnml.symmetricnet.booleans.hlapi.InequalityHLAPI>();
			for (Term elemnt : getPartitionelementconstants()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.symmetricnet.booleans.impl.InequalityImpl.class)){
					retour.add(new fr.lip6.move.pnml.symmetricnet.booleans.hlapi.InequalityHLAPI(
						(fr.lip6.move.pnml.symmetricnet.booleans.Inequality)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of BooleanConstantHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.symmetricnet.booleans.hlapi.BooleanConstantHLAPI> getPartitionelementconstants_booleans_BooleanConstantHLAPI(){
			java.util.List<fr.lip6.move.pnml.symmetricnet.booleans.hlapi.BooleanConstantHLAPI> retour = new ArrayList<fr.lip6.move.pnml.symmetricnet.booleans.hlapi.BooleanConstantHLAPI>();
			for (Term elemnt : getPartitionelementconstants()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.symmetricnet.booleans.impl.BooleanConstantImpl.class)){
					retour.add(new fr.lip6.move.pnml.symmetricnet.booleans.hlapi.BooleanConstantHLAPI(
						(fr.lip6.move.pnml.symmetricnet.booleans.BooleanConstant)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of OrHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.symmetricnet.booleans.hlapi.OrHLAPI> getPartitionelementconstants_booleans_OrHLAPI(){
			java.util.List<fr.lip6.move.pnml.symmetricnet.booleans.hlapi.OrHLAPI> retour = new ArrayList<fr.lip6.move.pnml.symmetricnet.booleans.hlapi.OrHLAPI>();
			for (Term elemnt : getPartitionelementconstants()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.symmetricnet.booleans.impl.OrImpl.class)){
					retour.add(new fr.lip6.move.pnml.symmetricnet.booleans.hlapi.OrHLAPI(
						(fr.lip6.move.pnml.symmetricnet.booleans.Or)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of AndHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.symmetricnet.booleans.hlapi.AndHLAPI> getPartitionelementconstants_booleans_AndHLAPI(){
			java.util.List<fr.lip6.move.pnml.symmetricnet.booleans.hlapi.AndHLAPI> retour = new ArrayList<fr.lip6.move.pnml.symmetricnet.booleans.hlapi.AndHLAPI>();
			for (Term elemnt : getPartitionelementconstants()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.symmetricnet.booleans.impl.AndImpl.class)){
					retour.add(new fr.lip6.move.pnml.symmetricnet.booleans.hlapi.AndHLAPI(
						(fr.lip6.move.pnml.symmetricnet.booleans.And)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of ImplyHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.symmetricnet.booleans.hlapi.ImplyHLAPI> getPartitionelementconstants_booleans_ImplyHLAPI(){
			java.util.List<fr.lip6.move.pnml.symmetricnet.booleans.hlapi.ImplyHLAPI> retour = new ArrayList<fr.lip6.move.pnml.symmetricnet.booleans.hlapi.ImplyHLAPI>();
			for (Term elemnt : getPartitionelementconstants()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.symmetricnet.booleans.impl.ImplyImpl.class)){
					retour.add(new fr.lip6.move.pnml.symmetricnet.booleans.hlapi.ImplyHLAPI(
						(fr.lip6.move.pnml.symmetricnet.booleans.Imply)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of NotHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.symmetricnet.booleans.hlapi.NotHLAPI> getPartitionelementconstants_booleans_NotHLAPI(){
			java.util.List<fr.lip6.move.pnml.symmetricnet.booleans.hlapi.NotHLAPI> retour = new ArrayList<fr.lip6.move.pnml.symmetricnet.booleans.hlapi.NotHLAPI>();
			for (Term elemnt : getPartitionelementconstants()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.symmetricnet.booleans.impl.NotImpl.class)){
					retour.add(new fr.lip6.move.pnml.symmetricnet.booleans.hlapi.NotHLAPI(
						(fr.lip6.move.pnml.symmetricnet.booleans.Not)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of SuccessorHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.symmetricnet.cyclicEnumerations.hlapi.SuccessorHLAPI> getPartitionelementconstants_cyclicEnumerations_SuccessorHLAPI(){
			java.util.List<fr.lip6.move.pnml.symmetricnet.cyclicEnumerations.hlapi.SuccessorHLAPI> retour = new ArrayList<fr.lip6.move.pnml.symmetricnet.cyclicEnumerations.hlapi.SuccessorHLAPI>();
			for (Term elemnt : getPartitionelementconstants()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.symmetricnet.cyclicEnumerations.impl.SuccessorImpl.class)){
					retour.add(new fr.lip6.move.pnml.symmetricnet.cyclicEnumerations.hlapi.SuccessorHLAPI(
						(fr.lip6.move.pnml.symmetricnet.cyclicEnumerations.Successor)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of PredecessorHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.symmetricnet.cyclicEnumerations.hlapi.PredecessorHLAPI> getPartitionelementconstants_cyclicEnumerations_PredecessorHLAPI(){
			java.util.List<fr.lip6.move.pnml.symmetricnet.cyclicEnumerations.hlapi.PredecessorHLAPI> retour = new ArrayList<fr.lip6.move.pnml.symmetricnet.cyclicEnumerations.hlapi.PredecessorHLAPI>();
			for (Term elemnt : getPartitionelementconstants()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.symmetricnet.cyclicEnumerations.impl.PredecessorImpl.class)){
					retour.add(new fr.lip6.move.pnml.symmetricnet.cyclicEnumerations.hlapi.PredecessorHLAPI(
						(fr.lip6.move.pnml.symmetricnet.cyclicEnumerations.Predecessor)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of DotConstantHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.symmetricnet.dots.hlapi.DotConstantHLAPI> getPartitionelementconstants_dots_DotConstantHLAPI(){
			java.util.List<fr.lip6.move.pnml.symmetricnet.dots.hlapi.DotConstantHLAPI> retour = new ArrayList<fr.lip6.move.pnml.symmetricnet.dots.hlapi.DotConstantHLAPI>();
			for (Term elemnt : getPartitionelementconstants()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.symmetricnet.dots.impl.DotConstantImpl.class)){
					retour.add(new fr.lip6.move.pnml.symmetricnet.dots.hlapi.DotConstantHLAPI(
						(fr.lip6.move.pnml.symmetricnet.dots.DotConstant)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of FiniteIntRangeConstantHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.symmetricnet.finiteIntRanges.hlapi.FiniteIntRangeConstantHLAPI> getPartitionelementconstants_finiteIntRanges_FiniteIntRangeConstantHLAPI(){
			java.util.List<fr.lip6.move.pnml.symmetricnet.finiteIntRanges.hlapi.FiniteIntRangeConstantHLAPI> retour = new ArrayList<fr.lip6.move.pnml.symmetricnet.finiteIntRanges.hlapi.FiniteIntRangeConstantHLAPI>();
			for (Term elemnt : getPartitionelementconstants()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.symmetricnet.finiteIntRanges.impl.FiniteIntRangeConstantImpl.class)){
					retour.add(new fr.lip6.move.pnml.symmetricnet.finiteIntRanges.hlapi.FiniteIntRangeConstantHLAPI(
						(fr.lip6.move.pnml.symmetricnet.finiteIntRanges.FiniteIntRangeConstant)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of LessThanHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.symmetricnet.finiteIntRanges.hlapi.LessThanHLAPI> getPartitionelementconstants_finiteIntRanges_LessThanHLAPI(){
			java.util.List<fr.lip6.move.pnml.symmetricnet.finiteIntRanges.hlapi.LessThanHLAPI> retour = new ArrayList<fr.lip6.move.pnml.symmetricnet.finiteIntRanges.hlapi.LessThanHLAPI>();
			for (Term elemnt : getPartitionelementconstants()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.symmetricnet.finiteIntRanges.impl.LessThanImpl.class)){
					retour.add(new fr.lip6.move.pnml.symmetricnet.finiteIntRanges.hlapi.LessThanHLAPI(
						(fr.lip6.move.pnml.symmetricnet.finiteIntRanges.LessThan)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of GreaterThanHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.symmetricnet.finiteIntRanges.hlapi.GreaterThanHLAPI> getPartitionelementconstants_finiteIntRanges_GreaterThanHLAPI(){
			java.util.List<fr.lip6.move.pnml.symmetricnet.finiteIntRanges.hlapi.GreaterThanHLAPI> retour = new ArrayList<fr.lip6.move.pnml.symmetricnet.finiteIntRanges.hlapi.GreaterThanHLAPI>();
			for (Term elemnt : getPartitionelementconstants()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.symmetricnet.finiteIntRanges.impl.GreaterThanImpl.class)){
					retour.add(new fr.lip6.move.pnml.symmetricnet.finiteIntRanges.hlapi.GreaterThanHLAPI(
						(fr.lip6.move.pnml.symmetricnet.finiteIntRanges.GreaterThan)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of LessThanOrEqualHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.symmetricnet.finiteIntRanges.hlapi.LessThanOrEqualHLAPI> getPartitionelementconstants_finiteIntRanges_LessThanOrEqualHLAPI(){
			java.util.List<fr.lip6.move.pnml.symmetricnet.finiteIntRanges.hlapi.LessThanOrEqualHLAPI> retour = new ArrayList<fr.lip6.move.pnml.symmetricnet.finiteIntRanges.hlapi.LessThanOrEqualHLAPI>();
			for (Term elemnt : getPartitionelementconstants()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.symmetricnet.finiteIntRanges.impl.LessThanOrEqualImpl.class)){
					retour.add(new fr.lip6.move.pnml.symmetricnet.finiteIntRanges.hlapi.LessThanOrEqualHLAPI(
						(fr.lip6.move.pnml.symmetricnet.finiteIntRanges.LessThanOrEqual)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of GreaterThanOrEqualHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.symmetricnet.finiteIntRanges.hlapi.GreaterThanOrEqualHLAPI> getPartitionelementconstants_finiteIntRanges_GreaterThanOrEqualHLAPI(){
			java.util.List<fr.lip6.move.pnml.symmetricnet.finiteIntRanges.hlapi.GreaterThanOrEqualHLAPI> retour = new ArrayList<fr.lip6.move.pnml.symmetricnet.finiteIntRanges.hlapi.GreaterThanOrEqualHLAPI>();
			for (Term elemnt : getPartitionelementconstants()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.symmetricnet.finiteIntRanges.impl.GreaterThanOrEqualImpl.class)){
					retour.add(new fr.lip6.move.pnml.symmetricnet.finiteIntRanges.hlapi.GreaterThanOrEqualHLAPI(
						(fr.lip6.move.pnml.symmetricnet.finiteIntRanges.GreaterThanOrEqual)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of NumberConstantHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.symmetricnet.integers.hlapi.NumberConstantHLAPI> getPartitionelementconstants_integers_NumberConstantHLAPI(){
			java.util.List<fr.lip6.move.pnml.symmetricnet.integers.hlapi.NumberConstantHLAPI> retour = new ArrayList<fr.lip6.move.pnml.symmetricnet.integers.hlapi.NumberConstantHLAPI>();
			for (Term elemnt : getPartitionelementconstants()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.symmetricnet.integers.impl.NumberConstantImpl.class)){
					retour.add(new fr.lip6.move.pnml.symmetricnet.integers.hlapi.NumberConstantHLAPI(
						(fr.lip6.move.pnml.symmetricnet.integers.NumberConstant)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of AdditionHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.symmetricnet.integers.hlapi.AdditionHLAPI> getPartitionelementconstants_integers_AdditionHLAPI(){
			java.util.List<fr.lip6.move.pnml.symmetricnet.integers.hlapi.AdditionHLAPI> retour = new ArrayList<fr.lip6.move.pnml.symmetricnet.integers.hlapi.AdditionHLAPI>();
			for (Term elemnt : getPartitionelementconstants()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.symmetricnet.integers.impl.AdditionImpl.class)){
					retour.add(new fr.lip6.move.pnml.symmetricnet.integers.hlapi.AdditionHLAPI(
						(fr.lip6.move.pnml.symmetricnet.integers.Addition)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of SubtractionHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.symmetricnet.integers.hlapi.SubtractionHLAPI> getPartitionelementconstants_integers_SubtractionHLAPI(){
			java.util.List<fr.lip6.move.pnml.symmetricnet.integers.hlapi.SubtractionHLAPI> retour = new ArrayList<fr.lip6.move.pnml.symmetricnet.integers.hlapi.SubtractionHLAPI>();
			for (Term elemnt : getPartitionelementconstants()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.symmetricnet.integers.impl.SubtractionImpl.class)){
					retour.add(new fr.lip6.move.pnml.symmetricnet.integers.hlapi.SubtractionHLAPI(
						(fr.lip6.move.pnml.symmetricnet.integers.Subtraction)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of MultiplicationHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.symmetricnet.integers.hlapi.MultiplicationHLAPI> getPartitionelementconstants_integers_MultiplicationHLAPI(){
			java.util.List<fr.lip6.move.pnml.symmetricnet.integers.hlapi.MultiplicationHLAPI> retour = new ArrayList<fr.lip6.move.pnml.symmetricnet.integers.hlapi.MultiplicationHLAPI>();
			for (Term elemnt : getPartitionelementconstants()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.symmetricnet.integers.impl.MultiplicationImpl.class)){
					retour.add(new fr.lip6.move.pnml.symmetricnet.integers.hlapi.MultiplicationHLAPI(
						(fr.lip6.move.pnml.symmetricnet.integers.Multiplication)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of DivisionHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.symmetricnet.integers.hlapi.DivisionHLAPI> getPartitionelementconstants_integers_DivisionHLAPI(){
			java.util.List<fr.lip6.move.pnml.symmetricnet.integers.hlapi.DivisionHLAPI> retour = new ArrayList<fr.lip6.move.pnml.symmetricnet.integers.hlapi.DivisionHLAPI>();
			for (Term elemnt : getPartitionelementconstants()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.symmetricnet.integers.impl.DivisionImpl.class)){
					retour.add(new fr.lip6.move.pnml.symmetricnet.integers.hlapi.DivisionHLAPI(
						(fr.lip6.move.pnml.symmetricnet.integers.Division)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of ModuloHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.symmetricnet.integers.hlapi.ModuloHLAPI> getPartitionelementconstants_integers_ModuloHLAPI(){
			java.util.List<fr.lip6.move.pnml.symmetricnet.integers.hlapi.ModuloHLAPI> retour = new ArrayList<fr.lip6.move.pnml.symmetricnet.integers.hlapi.ModuloHLAPI>();
			for (Term elemnt : getPartitionelementconstants()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.symmetricnet.integers.impl.ModuloImpl.class)){
					retour.add(new fr.lip6.move.pnml.symmetricnet.integers.hlapi.ModuloHLAPI(
						(fr.lip6.move.pnml.symmetricnet.integers.Modulo)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of GreaterThanHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.symmetricnet.integers.hlapi.GreaterThanHLAPI> getPartitionelementconstants_integers_GreaterThanHLAPI(){
			java.util.List<fr.lip6.move.pnml.symmetricnet.integers.hlapi.GreaterThanHLAPI> retour = new ArrayList<fr.lip6.move.pnml.symmetricnet.integers.hlapi.GreaterThanHLAPI>();
			for (Term elemnt : getPartitionelementconstants()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.symmetricnet.integers.impl.GreaterThanImpl.class)){
					retour.add(new fr.lip6.move.pnml.symmetricnet.integers.hlapi.GreaterThanHLAPI(
						(fr.lip6.move.pnml.symmetricnet.integers.GreaterThan)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of GreaterThanOrEqualHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.symmetricnet.integers.hlapi.GreaterThanOrEqualHLAPI> getPartitionelementconstants_integers_GreaterThanOrEqualHLAPI(){
			java.util.List<fr.lip6.move.pnml.symmetricnet.integers.hlapi.GreaterThanOrEqualHLAPI> retour = new ArrayList<fr.lip6.move.pnml.symmetricnet.integers.hlapi.GreaterThanOrEqualHLAPI>();
			for (Term elemnt : getPartitionelementconstants()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.symmetricnet.integers.impl.GreaterThanOrEqualImpl.class)){
					retour.add(new fr.lip6.move.pnml.symmetricnet.integers.hlapi.GreaterThanOrEqualHLAPI(
						(fr.lip6.move.pnml.symmetricnet.integers.GreaterThanOrEqual)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of LessThanHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.symmetricnet.integers.hlapi.LessThanHLAPI> getPartitionelementconstants_integers_LessThanHLAPI(){
			java.util.List<fr.lip6.move.pnml.symmetricnet.integers.hlapi.LessThanHLAPI> retour = new ArrayList<fr.lip6.move.pnml.symmetricnet.integers.hlapi.LessThanHLAPI>();
			for (Term elemnt : getPartitionelementconstants()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.symmetricnet.integers.impl.LessThanImpl.class)){
					retour.add(new fr.lip6.move.pnml.symmetricnet.integers.hlapi.LessThanHLAPI(
						(fr.lip6.move.pnml.symmetricnet.integers.LessThan)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of LessThanOrEqualHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.symmetricnet.integers.hlapi.LessThanOrEqualHLAPI> getPartitionelementconstants_integers_LessThanOrEqualHLAPI(){
			java.util.List<fr.lip6.move.pnml.symmetricnet.integers.hlapi.LessThanOrEqualHLAPI> retour = new ArrayList<fr.lip6.move.pnml.symmetricnet.integers.hlapi.LessThanOrEqualHLAPI>();
			for (Term elemnt : getPartitionelementconstants()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.symmetricnet.integers.impl.LessThanOrEqualImpl.class)){
					retour.add(new fr.lip6.move.pnml.symmetricnet.integers.hlapi.LessThanOrEqualHLAPI(
						(fr.lip6.move.pnml.symmetricnet.integers.LessThanOrEqual)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of CardinalityHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.symmetricnet.multisets.hlapi.CardinalityHLAPI> getPartitionelementconstants_multisets_CardinalityHLAPI(){
			java.util.List<fr.lip6.move.pnml.symmetricnet.multisets.hlapi.CardinalityHLAPI> retour = new ArrayList<fr.lip6.move.pnml.symmetricnet.multisets.hlapi.CardinalityHLAPI>();
			for (Term elemnt : getPartitionelementconstants()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.symmetricnet.multisets.impl.CardinalityImpl.class)){
					retour.add(new fr.lip6.move.pnml.symmetricnet.multisets.hlapi.CardinalityHLAPI(
						(fr.lip6.move.pnml.symmetricnet.multisets.Cardinality)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of ContainsHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.symmetricnet.multisets.hlapi.ContainsHLAPI> getPartitionelementconstants_multisets_ContainsHLAPI(){
			java.util.List<fr.lip6.move.pnml.symmetricnet.multisets.hlapi.ContainsHLAPI> retour = new ArrayList<fr.lip6.move.pnml.symmetricnet.multisets.hlapi.ContainsHLAPI>();
			for (Term elemnt : getPartitionelementconstants()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.symmetricnet.multisets.impl.ContainsImpl.class)){
					retour.add(new fr.lip6.move.pnml.symmetricnet.multisets.hlapi.ContainsHLAPI(
						(fr.lip6.move.pnml.symmetricnet.multisets.Contains)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of CardinalityOfHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.symmetricnet.multisets.hlapi.CardinalityOfHLAPI> getPartitionelementconstants_multisets_CardinalityOfHLAPI(){
			java.util.List<fr.lip6.move.pnml.symmetricnet.multisets.hlapi.CardinalityOfHLAPI> retour = new ArrayList<fr.lip6.move.pnml.symmetricnet.multisets.hlapi.CardinalityOfHLAPI>();
			for (Term elemnt : getPartitionelementconstants()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.symmetricnet.multisets.impl.CardinalityOfImpl.class)){
					retour.add(new fr.lip6.move.pnml.symmetricnet.multisets.hlapi.CardinalityOfHLAPI(
						(fr.lip6.move.pnml.symmetricnet.multisets.CardinalityOf)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of AddHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.symmetricnet.multisets.hlapi.AddHLAPI> getPartitionelementconstants_multisets_AddHLAPI(){
			java.util.List<fr.lip6.move.pnml.symmetricnet.multisets.hlapi.AddHLAPI> retour = new ArrayList<fr.lip6.move.pnml.symmetricnet.multisets.hlapi.AddHLAPI>();
			for (Term elemnt : getPartitionelementconstants()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.symmetricnet.multisets.impl.AddImpl.class)){
					retour.add(new fr.lip6.move.pnml.symmetricnet.multisets.hlapi.AddHLAPI(
						(fr.lip6.move.pnml.symmetricnet.multisets.Add)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of AllHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.symmetricnet.multisets.hlapi.AllHLAPI> getPartitionelementconstants_multisets_AllHLAPI(){
			java.util.List<fr.lip6.move.pnml.symmetricnet.multisets.hlapi.AllHLAPI> retour = new ArrayList<fr.lip6.move.pnml.symmetricnet.multisets.hlapi.AllHLAPI>();
			for (Term elemnt : getPartitionelementconstants()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.symmetricnet.multisets.impl.AllImpl.class)){
					retour.add(new fr.lip6.move.pnml.symmetricnet.multisets.hlapi.AllHLAPI(
						(fr.lip6.move.pnml.symmetricnet.multisets.All)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of EmptyHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.symmetricnet.multisets.hlapi.EmptyHLAPI> getPartitionelementconstants_multisets_EmptyHLAPI(){
			java.util.List<fr.lip6.move.pnml.symmetricnet.multisets.hlapi.EmptyHLAPI> retour = new ArrayList<fr.lip6.move.pnml.symmetricnet.multisets.hlapi.EmptyHLAPI>();
			for (Term elemnt : getPartitionelementconstants()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.symmetricnet.multisets.impl.EmptyImpl.class)){
					retour.add(new fr.lip6.move.pnml.symmetricnet.multisets.hlapi.EmptyHLAPI(
						(fr.lip6.move.pnml.symmetricnet.multisets.Empty)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of NumberOfHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.symmetricnet.multisets.hlapi.NumberOfHLAPI> getPartitionelementconstants_multisets_NumberOfHLAPI(){
			java.util.List<fr.lip6.move.pnml.symmetricnet.multisets.hlapi.NumberOfHLAPI> retour = new ArrayList<fr.lip6.move.pnml.symmetricnet.multisets.hlapi.NumberOfHLAPI>();
			for (Term elemnt : getPartitionelementconstants()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.symmetricnet.multisets.impl.NumberOfImpl.class)){
					retour.add(new fr.lip6.move.pnml.symmetricnet.multisets.hlapi.NumberOfHLAPI(
						(fr.lip6.move.pnml.symmetricnet.multisets.NumberOf)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of SubtractHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.symmetricnet.multisets.hlapi.SubtractHLAPI> getPartitionelementconstants_multisets_SubtractHLAPI(){
			java.util.List<fr.lip6.move.pnml.symmetricnet.multisets.hlapi.SubtractHLAPI> retour = new ArrayList<fr.lip6.move.pnml.symmetricnet.multisets.hlapi.SubtractHLAPI>();
			for (Term elemnt : getPartitionelementconstants()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.symmetricnet.multisets.impl.SubtractImpl.class)){
					retour.add(new fr.lip6.move.pnml.symmetricnet.multisets.hlapi.SubtractHLAPI(
						(fr.lip6.move.pnml.symmetricnet.multisets.Subtract)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of ScalarProductHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.symmetricnet.multisets.hlapi.ScalarProductHLAPI> getPartitionelementconstants_multisets_ScalarProductHLAPI(){
			java.util.List<fr.lip6.move.pnml.symmetricnet.multisets.hlapi.ScalarProductHLAPI> retour = new ArrayList<fr.lip6.move.pnml.symmetricnet.multisets.hlapi.ScalarProductHLAPI>();
			for (Term elemnt : getPartitionelementconstants()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.symmetricnet.multisets.impl.ScalarProductImpl.class)){
					retour.add(new fr.lip6.move.pnml.symmetricnet.multisets.hlapi.ScalarProductHLAPI(
						(fr.lip6.move.pnml.symmetricnet.multisets.ScalarProduct)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of VariableHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.symmetricnet.terms.hlapi.VariableHLAPI> getPartitionelementconstants_terms_VariableHLAPI(){
			java.util.List<fr.lip6.move.pnml.symmetricnet.terms.hlapi.VariableHLAPI> retour = new ArrayList<fr.lip6.move.pnml.symmetricnet.terms.hlapi.VariableHLAPI>();
			for (Term elemnt : getPartitionelementconstants()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.symmetricnet.terms.impl.VariableImpl.class)){
					retour.add(new fr.lip6.move.pnml.symmetricnet.terms.hlapi.VariableHLAPI(
						(fr.lip6.move.pnml.symmetricnet.terms.Variable)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of TupleHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.symmetricnet.terms.hlapi.TupleHLAPI> getPartitionelementconstants_terms_TupleHLAPI(){
			java.util.List<fr.lip6.move.pnml.symmetricnet.terms.hlapi.TupleHLAPI> retour = new ArrayList<fr.lip6.move.pnml.symmetricnet.terms.hlapi.TupleHLAPI>();
			for (Term elemnt : getPartitionelementconstants()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.symmetricnet.terms.impl.TupleImpl.class)){
					retour.add(new fr.lip6.move.pnml.symmetricnet.terms.hlapi.TupleHLAPI(
						(fr.lip6.move.pnml.symmetricnet.terms.Tuple)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of UserOperatorHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.symmetricnet.terms.hlapi.UserOperatorHLAPI> getPartitionelementconstants_terms_UserOperatorHLAPI(){
			java.util.List<fr.lip6.move.pnml.symmetricnet.terms.hlapi.UserOperatorHLAPI> retour = new ArrayList<fr.lip6.move.pnml.symmetricnet.terms.hlapi.UserOperatorHLAPI>();
			for (Term elemnt : getPartitionelementconstants()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.symmetricnet.terms.impl.UserOperatorImpl.class)){
					retour.add(new fr.lip6.move.pnml.symmetricnet.terms.hlapi.UserOperatorHLAPI(
						(fr.lip6.move.pnml.symmetricnet.terms.UserOperator)elemnt
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