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
 * $Id ggiffo, Thu Feb 11 16:30:27 CET 2016$
 */
package fr.lip6.move.pnml.pthlpng.integers.hlapi;

import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.List;

import org.apache.axiom.om.OMElement;
import org.eclipse.emf.common.util.DiagnosticChain;

import fr.lip6.move.pnml.framework.hlapi.HLAPIClass;
import fr.lip6.move.pnml.framework.utils.IdRefLinker;
import fr.lip6.move.pnml.framework.utils.exception.InnerBuildException;
import fr.lip6.move.pnml.framework.utils.exception.InvalidIDException;
import fr.lip6.move.pnml.framework.utils.exception.VoidRepositoryException;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.Condition;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.HLAnnotation;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.HLMarking;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.hlapi.ConditionHLAPI;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.hlapi.HLAnnotationHLAPI;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.hlapi.HLMarkingHLAPI;
import fr.lip6.move.pnml.pthlpng.integers.GreaterThan;
import fr.lip6.move.pnml.pthlpng.integers.IntegersFactory;
import fr.lip6.move.pnml.pthlpng.integers.impl.IntegersFactoryImpl;
import fr.lip6.move.pnml.pthlpng.partitions.PartitionElement;
import fr.lip6.move.pnml.pthlpng.partitions.hlapi.PartitionElementHLAPI;
import fr.lip6.move.pnml.pthlpng.terms.NamedOperator;
import fr.lip6.move.pnml.pthlpng.terms.Operator;
import fr.lip6.move.pnml.pthlpng.terms.Sort;
import fr.lip6.move.pnml.pthlpng.terms.Term;
import fr.lip6.move.pnml.pthlpng.terms.hlapi.NamedOperatorHLAPI;
import fr.lip6.move.pnml.pthlpng.terms.hlapi.OperatorHLAPI;
import fr.lip6.move.pnml.pthlpng.terms.hlapi.SortHLAPI;
import fr.lip6.move.pnml.pthlpng.terms.hlapi.TermHLAPI;


public class GreaterThanHLAPI implements HLAPIClass,TermHLAPI,OperatorHLAPI{

	/**
	 * The contained LLAPI element.
	 */
	private GreaterThan item;

	/**
	 * this constructor allows you to set all 'settable' values
	 * excepted container.
	 */
	
	public GreaterThanHLAPI(
		 SortHLAPI sort
	
		, SortHLAPI output
	){//BEGIN CONSTRUCTOR BODY
		IntegersFactory fact = IntegersFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createGreaterThan();}
	
 		
 		if(sort!=null)
			item.setSort((Sort)sort.getContainedItem());
		
	
 		
 		if(output!=null)
			item.setOutput((Sort)output.getContainedItem());
		
	
	}

	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	
	public GreaterThanHLAPI(
		 SortHLAPI sort
	
		, SortHLAPI output
	
		, OperatorHLAPI containerOperator
	){//BEGIN CONSTRUCTOR BODY
		IntegersFactory fact = IntegersFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createGreaterThan();}
	
 		
 		if(sort!=null)
			item.setSort((Sort)sort.getContainedItem());
		
	
 		
 		if(output!=null)
			item.setOutput((Sort)output.getContainedItem());
		
	
 		
 		if(containerOperator!=null)
			item.setContainerOperator((Operator)containerOperator.getContainedItem());
		
	
	}

	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	
	public GreaterThanHLAPI(
		 SortHLAPI sort
	
		, SortHLAPI output
	
		, NamedOperatorHLAPI containerNamedOperator
	){//BEGIN CONSTRUCTOR BODY
		IntegersFactory fact = IntegersFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createGreaterThan();}
	
 		
 		if(sort!=null)
			item.setSort((Sort)sort.getContainedItem());
		
	
 		
 		if(output!=null)
			item.setOutput((Sort)output.getContainedItem());
		
	
 		
 		if(containerNamedOperator!=null)
			item.setContainerNamedOperator((NamedOperator)containerNamedOperator.getContainedItem());
		
	
	}

	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	
	public GreaterThanHLAPI(
		 SortHLAPI sort
	
		, SortHLAPI output
	
		, HLMarkingHLAPI containerHLMarking
	){//BEGIN CONSTRUCTOR BODY
		IntegersFactory fact = IntegersFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createGreaterThan();}
	
 		
 		if(sort!=null)
			item.setSort((Sort)sort.getContainedItem());
		
	
 		
 		if(output!=null)
			item.setOutput((Sort)output.getContainedItem());
		
	
 		
 		if(containerHLMarking!=null)
			item.setContainerHLMarking((HLMarking)containerHLMarking.getContainedItem());
		
	
	}

	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	
	public GreaterThanHLAPI(
		 SortHLAPI sort
	
		, SortHLAPI output
	
		, ConditionHLAPI containerCondition
	){//BEGIN CONSTRUCTOR BODY
		IntegersFactory fact = IntegersFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createGreaterThan();}
	
 		
 		if(sort!=null)
			item.setSort((Sort)sort.getContainedItem());
		
	
 		
 		if(output!=null)
			item.setOutput((Sort)output.getContainedItem());
		
	
 		
 		if(containerCondition!=null)
			item.setContainerCondition((Condition)containerCondition.getContainedItem());
		
	
	}

	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	
	public GreaterThanHLAPI(
		 SortHLAPI sort
	
		, SortHLAPI output
	
		, HLAnnotationHLAPI containerHLAnnotation
	){//BEGIN CONSTRUCTOR BODY
		IntegersFactory fact = IntegersFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createGreaterThan();}
	
 		
 		if(sort!=null)
			item.setSort((Sort)sort.getContainedItem());
		
	
 		
 		if(output!=null)
			item.setOutput((Sort)output.getContainedItem());
		
	
 		
 		if(containerHLAnnotation!=null)
			item.setContainerHLAnnotation((HLAnnotation)containerHLAnnotation.getContainedItem());
		
	
	}

	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	
	public GreaterThanHLAPI(
		 SortHLAPI sort
	
		, SortHLAPI output
	
		, PartitionElementHLAPI containerPartitionElement
	){//BEGIN CONSTRUCTOR BODY
		IntegersFactory fact = IntegersFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createGreaterThan();}
	
 		
 		if(sort!=null)
			item.setSort((Sort)sort.getContainedItem());
		
	
 		
 		if(output!=null)
			item.setOutput((Sort)output.getContainedItem());
		
	
 		
 		if(containerPartitionElement!=null)
			item.setContainerPartitionElement((PartitionElement)containerPartitionElement.getContainedItem());
		
	
	}



	
	/**
    * This constructor give access to required stuff only (and container)
    */
	public GreaterThanHLAPI(
		 OperatorHLAPI containerOperator
	){//BEGIN CONSTRUCTOR BODY
		IntegersFactory fact = IntegersFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createGreaterThan();}
	
 		
 		if(containerOperator!=null)
			item.setContainerOperator((Operator)containerOperator.getContainedItem());
		
	
	}
	
	
	/**
    * This constructor give access to required stuff only (and container)
    */
	public GreaterThanHLAPI(
		 NamedOperatorHLAPI containerNamedOperator
	){//BEGIN CONSTRUCTOR BODY
		IntegersFactory fact = IntegersFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createGreaterThan();}
	
 		
 		if(containerNamedOperator!=null)
			item.setContainerNamedOperator((NamedOperator)containerNamedOperator.getContainedItem());
		
	
	}
	
	
	/**
    * This constructor give access to required stuff only (and container)
    */
	public GreaterThanHLAPI(
		 HLMarkingHLAPI containerHLMarking
	){//BEGIN CONSTRUCTOR BODY
		IntegersFactory fact = IntegersFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createGreaterThan();}
	
 		
 		if(containerHLMarking!=null)
			item.setContainerHLMarking((HLMarking)containerHLMarking.getContainedItem());
		
	
	}
	
	
	/**
    * This constructor give access to required stuff only (and container)
    */
	public GreaterThanHLAPI(
		 ConditionHLAPI containerCondition
	){//BEGIN CONSTRUCTOR BODY
		IntegersFactory fact = IntegersFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createGreaterThan();}
	
 		
 		if(containerCondition!=null)
			item.setContainerCondition((Condition)containerCondition.getContainedItem());
		
	
	}
	
	
	/**
    * This constructor give access to required stuff only (and container)
    */
	public GreaterThanHLAPI(
		 HLAnnotationHLAPI containerHLAnnotation
	){//BEGIN CONSTRUCTOR BODY
		IntegersFactory fact = IntegersFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createGreaterThan();}
	
 		
 		if(containerHLAnnotation!=null)
			item.setContainerHLAnnotation((HLAnnotation)containerHLAnnotation.getContainedItem());
		
	
	}
	
	
	/**
    * This constructor give access to required stuff only (and container)
    */
	public GreaterThanHLAPI(
		 PartitionElementHLAPI containerPartitionElement
	){//BEGIN CONSTRUCTOR BODY
		IntegersFactory fact = IntegersFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createGreaterThan();}
	
 		
 		if(containerPartitionElement!=null)
			item.setContainerPartitionElement((PartitionElement)containerPartitionElement.getContainedItem());
		
	
	}
	

	/**
	 * This constructor encapsulate a low level API object in HLAPI.
	 */
	public GreaterThanHLAPI(GreaterThan lowLevelAPI){
		item = lowLevelAPI;
	}

	// access to low level API
	/**
	 * Return encapsulated object
	 */
	public GreaterThan getContainedItem(){
		return item;
	}

	//getters giving LLAPI object
	
	/**
	 * Return the encapsulate Low Level API object.
	 */
	public Sort getSort(){
		return item.getSort();
	}
	
	/**
	 * Return the encapsulate Low Level API object.
	 */
	public Operator getContainerOperator(){
		return item.getContainerOperator();
	}
	
	/**
	 * Return the encapsulate Low Level API object.
	 */
	public NamedOperator getContainerNamedOperator(){
		return item.getContainerNamedOperator();
	}
	
	/**
	 * Return the encapsulate Low Level API object.
	 */
	public HLMarking getContainerHLMarking(){
		return item.getContainerHLMarking();
	}
	
	/**
	 * Return the encapsulate Low Level API object.
	 */
	public Condition getContainerCondition(){
		return item.getContainerCondition();
	}
	
	/**
	 * Return the encapsulate Low Level API object.
	 */
	public HLAnnotation getContainerHLAnnotation(){
		return item.getContainerHLAnnotation();
	}
	
	/**
	 * Return the encapsulate Low Level API object.
	 */
	public PartitionElement getContainerPartitionElement(){
		return item.getContainerPartitionElement();
	}
	
	/**
	 * Return the encapsulate Low Level API object.
	 */
	public List<Term> getSubterm(){
		return item.getSubterm();
	}
	
	/**
	 * Return the encapsulate Low Level API object.
	 */
	public Sort getOutput(){
		return item.getOutput();
	}
	
	/**
	 * Return the encapsulate Low Level API object.
	 */
	public List<Sort> getInput(){
		return item.getInput();
	}
	

	//getters giving HLAPI object
	
	
	
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		
		
		public SortHLAPI getSortHLAPI(){
			if(item.getSort() == null) return null;
			Sort object = item.getSort();
			
			if(object.getClass().equals(fr.lip6.move.pnml.pthlpng.integers.impl.NaturalImpl.class)){
				return new fr.lip6.move.pnml.pthlpng.integers.hlapi.NaturalHLAPI((fr.lip6.move.pnml.pthlpng.integers.Natural)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.pthlpng.integers.impl.PositiveImpl.class)){
				return new fr.lip6.move.pnml.pthlpng.integers.hlapi.PositiveHLAPI((fr.lip6.move.pnml.pthlpng.integers.Positive)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.pthlpng.integers.impl.HLIntegerImpl.class)){
				return new fr.lip6.move.pnml.pthlpng.integers.hlapi.HLIntegerHLAPI((fr.lip6.move.pnml.pthlpng.integers.HLInteger)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.pthlpng.booleans.impl.BoolImpl.class)){
				return new fr.lip6.move.pnml.pthlpng.booleans.hlapi.BoolHLAPI((fr.lip6.move.pnml.pthlpng.booleans.Bool)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.pthlpng.dots.impl.DotImpl.class)){
				return new fr.lip6.move.pnml.pthlpng.dots.hlapi.DotHLAPI((fr.lip6.move.pnml.pthlpng.dots.Dot)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.pthlpng.terms.impl.MultisetSortImpl.class)){
				return new fr.lip6.move.pnml.pthlpng.terms.hlapi.MultisetSortHLAPI((fr.lip6.move.pnml.pthlpng.terms.MultisetSort)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.pthlpng.terms.impl.ProductSortImpl.class)){
				return new fr.lip6.move.pnml.pthlpng.terms.hlapi.ProductSortHLAPI((fr.lip6.move.pnml.pthlpng.terms.ProductSort)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.pthlpng.terms.impl.UserSortImpl.class)){
				return new fr.lip6.move.pnml.pthlpng.terms.hlapi.UserSortHLAPI((fr.lip6.move.pnml.pthlpng.terms.UserSort)object);
			}
			
			return null;
		}
		
	
	
	
	
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		
		
		public OperatorHLAPI getContainerOperatorHLAPI(){
			if(item.getContainerOperator() == null) return null;
			Operator object = item.getContainerOperator();
			
			if(object.getClass().equals(fr.lip6.move.pnml.pthlpng.integers.impl.NumberConstantImpl.class)){
				return new fr.lip6.move.pnml.pthlpng.integers.hlapi.NumberConstantHLAPI((fr.lip6.move.pnml.pthlpng.integers.NumberConstant)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.pthlpng.integers.impl.AdditionImpl.class)){
				return new fr.lip6.move.pnml.pthlpng.integers.hlapi.AdditionHLAPI((fr.lip6.move.pnml.pthlpng.integers.Addition)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.pthlpng.integers.impl.SubtractionImpl.class)){
				return new fr.lip6.move.pnml.pthlpng.integers.hlapi.SubtractionHLAPI((fr.lip6.move.pnml.pthlpng.integers.Subtraction)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.pthlpng.integers.impl.MultiplicationImpl.class)){
				return new fr.lip6.move.pnml.pthlpng.integers.hlapi.MultiplicationHLAPI((fr.lip6.move.pnml.pthlpng.integers.Multiplication)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.pthlpng.integers.impl.DivisionImpl.class)){
				return new fr.lip6.move.pnml.pthlpng.integers.hlapi.DivisionHLAPI((fr.lip6.move.pnml.pthlpng.integers.Division)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.pthlpng.integers.impl.ModuloImpl.class)){
				return new fr.lip6.move.pnml.pthlpng.integers.hlapi.ModuloHLAPI((fr.lip6.move.pnml.pthlpng.integers.Modulo)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.pthlpng.integers.impl.GreaterThanImpl.class)){
				return new fr.lip6.move.pnml.pthlpng.integers.hlapi.GreaterThanHLAPI((fr.lip6.move.pnml.pthlpng.integers.GreaterThan)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.pthlpng.integers.impl.GreaterThanOrEqualImpl.class)){
				return new fr.lip6.move.pnml.pthlpng.integers.hlapi.GreaterThanOrEqualHLAPI((fr.lip6.move.pnml.pthlpng.integers.GreaterThanOrEqual)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.pthlpng.integers.impl.LessThanImpl.class)){
				return new fr.lip6.move.pnml.pthlpng.integers.hlapi.LessThanHLAPI((fr.lip6.move.pnml.pthlpng.integers.LessThan)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.pthlpng.integers.impl.LessThanOrEqualImpl.class)){
				return new fr.lip6.move.pnml.pthlpng.integers.hlapi.LessThanOrEqualHLAPI((fr.lip6.move.pnml.pthlpng.integers.LessThanOrEqual)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.pthlpng.booleans.impl.EqualityImpl.class)){
				return new fr.lip6.move.pnml.pthlpng.booleans.hlapi.EqualityHLAPI((fr.lip6.move.pnml.pthlpng.booleans.Equality)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.pthlpng.booleans.impl.InequalityImpl.class)){
				return new fr.lip6.move.pnml.pthlpng.booleans.hlapi.InequalityHLAPI((fr.lip6.move.pnml.pthlpng.booleans.Inequality)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.pthlpng.booleans.impl.BooleanConstantImpl.class)){
				return new fr.lip6.move.pnml.pthlpng.booleans.hlapi.BooleanConstantHLAPI((fr.lip6.move.pnml.pthlpng.booleans.BooleanConstant)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.pthlpng.booleans.impl.OrImpl.class)){
				return new fr.lip6.move.pnml.pthlpng.booleans.hlapi.OrHLAPI((fr.lip6.move.pnml.pthlpng.booleans.Or)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.pthlpng.booleans.impl.AndImpl.class)){
				return new fr.lip6.move.pnml.pthlpng.booleans.hlapi.AndHLAPI((fr.lip6.move.pnml.pthlpng.booleans.And)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.pthlpng.booleans.impl.ImplyImpl.class)){
				return new fr.lip6.move.pnml.pthlpng.booleans.hlapi.ImplyHLAPI((fr.lip6.move.pnml.pthlpng.booleans.Imply)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.pthlpng.booleans.impl.NotImpl.class)){
				return new fr.lip6.move.pnml.pthlpng.booleans.hlapi.NotHLAPI((fr.lip6.move.pnml.pthlpng.booleans.Not)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.pthlpng.dots.impl.DotConstantImpl.class)){
				return new fr.lip6.move.pnml.pthlpng.dots.hlapi.DotConstantHLAPI((fr.lip6.move.pnml.pthlpng.dots.DotConstant)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.pthlpng.multisets.impl.CardinalityImpl.class)){
				return new fr.lip6.move.pnml.pthlpng.multisets.hlapi.CardinalityHLAPI((fr.lip6.move.pnml.pthlpng.multisets.Cardinality)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.pthlpng.multisets.impl.ContainsImpl.class)){
				return new fr.lip6.move.pnml.pthlpng.multisets.hlapi.ContainsHLAPI((fr.lip6.move.pnml.pthlpng.multisets.Contains)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.pthlpng.multisets.impl.CardinalityOfImpl.class)){
				return new fr.lip6.move.pnml.pthlpng.multisets.hlapi.CardinalityOfHLAPI((fr.lip6.move.pnml.pthlpng.multisets.CardinalityOf)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.pthlpng.multisets.impl.AddImpl.class)){
				return new fr.lip6.move.pnml.pthlpng.multisets.hlapi.AddHLAPI((fr.lip6.move.pnml.pthlpng.multisets.Add)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.pthlpng.multisets.impl.AllImpl.class)){
				return new fr.lip6.move.pnml.pthlpng.multisets.hlapi.AllHLAPI((fr.lip6.move.pnml.pthlpng.multisets.All)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.pthlpng.multisets.impl.EmptyImpl.class)){
				return new fr.lip6.move.pnml.pthlpng.multisets.hlapi.EmptyHLAPI((fr.lip6.move.pnml.pthlpng.multisets.Empty)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.pthlpng.multisets.impl.NumberOfImpl.class)){
				return new fr.lip6.move.pnml.pthlpng.multisets.hlapi.NumberOfHLAPI((fr.lip6.move.pnml.pthlpng.multisets.NumberOf)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.pthlpng.multisets.impl.SubtractImpl.class)){
				return new fr.lip6.move.pnml.pthlpng.multisets.hlapi.SubtractHLAPI((fr.lip6.move.pnml.pthlpng.multisets.Subtract)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.pthlpng.multisets.impl.ScalarProductImpl.class)){
				return new fr.lip6.move.pnml.pthlpng.multisets.hlapi.ScalarProductHLAPI((fr.lip6.move.pnml.pthlpng.multisets.ScalarProduct)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.pthlpng.partitions.impl.GreaterThanImpl.class)){
				return new fr.lip6.move.pnml.pthlpng.partitions.hlapi.GreaterThanHLAPI((fr.lip6.move.pnml.pthlpng.partitions.GreaterThan)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.pthlpng.partitions.impl.PartitionElementOfImpl.class)){
				return new fr.lip6.move.pnml.pthlpng.partitions.hlapi.PartitionElementOfHLAPI((fr.lip6.move.pnml.pthlpng.partitions.PartitionElementOf)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.pthlpng.partitions.impl.LessThanImpl.class)){
				return new fr.lip6.move.pnml.pthlpng.partitions.hlapi.LessThanHLAPI((fr.lip6.move.pnml.pthlpng.partitions.LessThan)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.pthlpng.terms.impl.TupleImpl.class)){
				return new fr.lip6.move.pnml.pthlpng.terms.hlapi.TupleHLAPI((fr.lip6.move.pnml.pthlpng.terms.Tuple)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.pthlpng.terms.impl.UserOperatorImpl.class)){
				return new fr.lip6.move.pnml.pthlpng.terms.hlapi.UserOperatorHLAPI((fr.lip6.move.pnml.pthlpng.terms.UserOperator)object);
			}
			
			return null;
		}
		
	
	
	
	
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		
		public NamedOperatorHLAPI getContainerNamedOperatorHLAPI(){
			if(item.getContainerNamedOperator() == null) return null;
			return new NamedOperatorHLAPI(item.getContainerNamedOperator());
		}
		
	
	
	
	
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		
		public HLMarkingHLAPI getContainerHLMarkingHLAPI(){
			if(item.getContainerHLMarking() == null) return null;
			return new HLMarkingHLAPI(item.getContainerHLMarking());
		}
		
	
	
	
	
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		
		public ConditionHLAPI getContainerConditionHLAPI(){
			if(item.getContainerCondition() == null) return null;
			return new ConditionHLAPI(item.getContainerCondition());
		}
		
	
	
	
	
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		
		public HLAnnotationHLAPI getContainerHLAnnotationHLAPI(){
			if(item.getContainerHLAnnotation() == null) return null;
			return new HLAnnotationHLAPI(item.getContainerHLAnnotation());
		}
		
	
	
	
	
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		
		public PartitionElementHLAPI getContainerPartitionElementHLAPI(){
			if(item.getContainerPartitionElement() == null) return null;
			return new PartitionElementHLAPI(item.getContainerPartitionElement());
		}
		
	
	
	
	
		/**
		 * This accessor automatically encapsulate all elements of the selected sublist.
		 * WARNING : this can creates a lot of new object in memory.
		 */
		
			
		public java.util.List<TermHLAPI> getSubtermHLAPI(){
			java.util.List<TermHLAPI> retour = new ArrayList<TermHLAPI>();
			for (Term elemnt : getSubterm()) {
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.pthlpng.integers.impl.NumberConstantImpl.class)){
					retour.add(new fr.lip6.move.pnml.pthlpng.integers.hlapi.NumberConstantHLAPI(
						(fr.lip6.move.pnml.pthlpng.integers.NumberConstant)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.pthlpng.integers.impl.AdditionImpl.class)){
					retour.add(new fr.lip6.move.pnml.pthlpng.integers.hlapi.AdditionHLAPI(
						(fr.lip6.move.pnml.pthlpng.integers.Addition)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.pthlpng.integers.impl.SubtractionImpl.class)){
					retour.add(new fr.lip6.move.pnml.pthlpng.integers.hlapi.SubtractionHLAPI(
						(fr.lip6.move.pnml.pthlpng.integers.Subtraction)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.pthlpng.integers.impl.MultiplicationImpl.class)){
					retour.add(new fr.lip6.move.pnml.pthlpng.integers.hlapi.MultiplicationHLAPI(
						(fr.lip6.move.pnml.pthlpng.integers.Multiplication)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.pthlpng.integers.impl.DivisionImpl.class)){
					retour.add(new fr.lip6.move.pnml.pthlpng.integers.hlapi.DivisionHLAPI(
						(fr.lip6.move.pnml.pthlpng.integers.Division)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.pthlpng.integers.impl.ModuloImpl.class)){
					retour.add(new fr.lip6.move.pnml.pthlpng.integers.hlapi.ModuloHLAPI(
						(fr.lip6.move.pnml.pthlpng.integers.Modulo)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.pthlpng.integers.impl.GreaterThanImpl.class)){
					retour.add(new fr.lip6.move.pnml.pthlpng.integers.hlapi.GreaterThanHLAPI(
						(fr.lip6.move.pnml.pthlpng.integers.GreaterThan)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.pthlpng.integers.impl.GreaterThanOrEqualImpl.class)){
					retour.add(new fr.lip6.move.pnml.pthlpng.integers.hlapi.GreaterThanOrEqualHLAPI(
						(fr.lip6.move.pnml.pthlpng.integers.GreaterThanOrEqual)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.pthlpng.integers.impl.LessThanImpl.class)){
					retour.add(new fr.lip6.move.pnml.pthlpng.integers.hlapi.LessThanHLAPI(
						(fr.lip6.move.pnml.pthlpng.integers.LessThan)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.pthlpng.integers.impl.LessThanOrEqualImpl.class)){
					retour.add(new fr.lip6.move.pnml.pthlpng.integers.hlapi.LessThanOrEqualHLAPI(
						(fr.lip6.move.pnml.pthlpng.integers.LessThanOrEqual)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.pthlpng.booleans.impl.EqualityImpl.class)){
					retour.add(new fr.lip6.move.pnml.pthlpng.booleans.hlapi.EqualityHLAPI(
						(fr.lip6.move.pnml.pthlpng.booleans.Equality)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.pthlpng.booleans.impl.InequalityImpl.class)){
					retour.add(new fr.lip6.move.pnml.pthlpng.booleans.hlapi.InequalityHLAPI(
						(fr.lip6.move.pnml.pthlpng.booleans.Inequality)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.pthlpng.booleans.impl.BooleanConstantImpl.class)){
					retour.add(new fr.lip6.move.pnml.pthlpng.booleans.hlapi.BooleanConstantHLAPI(
						(fr.lip6.move.pnml.pthlpng.booleans.BooleanConstant)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.pthlpng.booleans.impl.OrImpl.class)){
					retour.add(new fr.lip6.move.pnml.pthlpng.booleans.hlapi.OrHLAPI(
						(fr.lip6.move.pnml.pthlpng.booleans.Or)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.pthlpng.booleans.impl.AndImpl.class)){
					retour.add(new fr.lip6.move.pnml.pthlpng.booleans.hlapi.AndHLAPI(
						(fr.lip6.move.pnml.pthlpng.booleans.And)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.pthlpng.booleans.impl.ImplyImpl.class)){
					retour.add(new fr.lip6.move.pnml.pthlpng.booleans.hlapi.ImplyHLAPI(
						(fr.lip6.move.pnml.pthlpng.booleans.Imply)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.pthlpng.booleans.impl.NotImpl.class)){
					retour.add(new fr.lip6.move.pnml.pthlpng.booleans.hlapi.NotHLAPI(
						(fr.lip6.move.pnml.pthlpng.booleans.Not)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.pthlpng.dots.impl.DotConstantImpl.class)){
					retour.add(new fr.lip6.move.pnml.pthlpng.dots.hlapi.DotConstantHLAPI(
						(fr.lip6.move.pnml.pthlpng.dots.DotConstant)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.pthlpng.multisets.impl.CardinalityImpl.class)){
					retour.add(new fr.lip6.move.pnml.pthlpng.multisets.hlapi.CardinalityHLAPI(
						(fr.lip6.move.pnml.pthlpng.multisets.Cardinality)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.pthlpng.multisets.impl.ContainsImpl.class)){
					retour.add(new fr.lip6.move.pnml.pthlpng.multisets.hlapi.ContainsHLAPI(
						(fr.lip6.move.pnml.pthlpng.multisets.Contains)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.pthlpng.multisets.impl.CardinalityOfImpl.class)){
					retour.add(new fr.lip6.move.pnml.pthlpng.multisets.hlapi.CardinalityOfHLAPI(
						(fr.lip6.move.pnml.pthlpng.multisets.CardinalityOf)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.pthlpng.multisets.impl.AddImpl.class)){
					retour.add(new fr.lip6.move.pnml.pthlpng.multisets.hlapi.AddHLAPI(
						(fr.lip6.move.pnml.pthlpng.multisets.Add)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.pthlpng.multisets.impl.AllImpl.class)){
					retour.add(new fr.lip6.move.pnml.pthlpng.multisets.hlapi.AllHLAPI(
						(fr.lip6.move.pnml.pthlpng.multisets.All)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.pthlpng.multisets.impl.EmptyImpl.class)){
					retour.add(new fr.lip6.move.pnml.pthlpng.multisets.hlapi.EmptyHLAPI(
						(fr.lip6.move.pnml.pthlpng.multisets.Empty)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.pthlpng.multisets.impl.NumberOfImpl.class)){
					retour.add(new fr.lip6.move.pnml.pthlpng.multisets.hlapi.NumberOfHLAPI(
						(fr.lip6.move.pnml.pthlpng.multisets.NumberOf)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.pthlpng.multisets.impl.SubtractImpl.class)){
					retour.add(new fr.lip6.move.pnml.pthlpng.multisets.hlapi.SubtractHLAPI(
						(fr.lip6.move.pnml.pthlpng.multisets.Subtract)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.pthlpng.multisets.impl.ScalarProductImpl.class)){
					retour.add(new fr.lip6.move.pnml.pthlpng.multisets.hlapi.ScalarProductHLAPI(
						(fr.lip6.move.pnml.pthlpng.multisets.ScalarProduct)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.pthlpng.partitions.impl.GreaterThanImpl.class)){
					retour.add(new fr.lip6.move.pnml.pthlpng.partitions.hlapi.GreaterThanHLAPI(
						(fr.lip6.move.pnml.pthlpng.partitions.GreaterThan)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.pthlpng.partitions.impl.PartitionElementOfImpl.class)){
					retour.add(new fr.lip6.move.pnml.pthlpng.partitions.hlapi.PartitionElementOfHLAPI(
						(fr.lip6.move.pnml.pthlpng.partitions.PartitionElementOf)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.pthlpng.partitions.impl.LessThanImpl.class)){
					retour.add(new fr.lip6.move.pnml.pthlpng.partitions.hlapi.LessThanHLAPI(
						(fr.lip6.move.pnml.pthlpng.partitions.LessThan)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.pthlpng.terms.impl.VariableImpl.class)){
					retour.add(new fr.lip6.move.pnml.pthlpng.terms.hlapi.VariableHLAPI(
						(fr.lip6.move.pnml.pthlpng.terms.Variable)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.pthlpng.terms.impl.TupleImpl.class)){
					retour.add(new fr.lip6.move.pnml.pthlpng.terms.hlapi.TupleHLAPI(
						(fr.lip6.move.pnml.pthlpng.terms.Tuple)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.pthlpng.terms.impl.UserOperatorImpl.class)){
					retour.add(new fr.lip6.move.pnml.pthlpng.terms.hlapi.UserOperatorHLAPI(
						(fr.lip6.move.pnml.pthlpng.terms.UserOperator)elemnt
						));
					continue;
				}
				
			}
			return retour;
		}
		
	
	
	
	
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		
		
		public SortHLAPI getOutputHLAPI(){
			if(item.getOutput() == null) return null;
			Sort object = item.getOutput();
			
			if(object.getClass().equals(fr.lip6.move.pnml.pthlpng.integers.impl.NaturalImpl.class)){
				return new fr.lip6.move.pnml.pthlpng.integers.hlapi.NaturalHLAPI((fr.lip6.move.pnml.pthlpng.integers.Natural)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.pthlpng.integers.impl.PositiveImpl.class)){
				return new fr.lip6.move.pnml.pthlpng.integers.hlapi.PositiveHLAPI((fr.lip6.move.pnml.pthlpng.integers.Positive)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.pthlpng.integers.impl.HLIntegerImpl.class)){
				return new fr.lip6.move.pnml.pthlpng.integers.hlapi.HLIntegerHLAPI((fr.lip6.move.pnml.pthlpng.integers.HLInteger)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.pthlpng.booleans.impl.BoolImpl.class)){
				return new fr.lip6.move.pnml.pthlpng.booleans.hlapi.BoolHLAPI((fr.lip6.move.pnml.pthlpng.booleans.Bool)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.pthlpng.dots.impl.DotImpl.class)){
				return new fr.lip6.move.pnml.pthlpng.dots.hlapi.DotHLAPI((fr.lip6.move.pnml.pthlpng.dots.Dot)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.pthlpng.terms.impl.MultisetSortImpl.class)){
				return new fr.lip6.move.pnml.pthlpng.terms.hlapi.MultisetSortHLAPI((fr.lip6.move.pnml.pthlpng.terms.MultisetSort)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.pthlpng.terms.impl.ProductSortImpl.class)){
				return new fr.lip6.move.pnml.pthlpng.terms.hlapi.ProductSortHLAPI((fr.lip6.move.pnml.pthlpng.terms.ProductSort)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.pthlpng.terms.impl.UserSortImpl.class)){
				return new fr.lip6.move.pnml.pthlpng.terms.hlapi.UserSortHLAPI((fr.lip6.move.pnml.pthlpng.terms.UserSort)object);
			}
			
			return null;
		}
		
	
	
	
	
		/**
		 * This accessor automatically encapsulate all elements of the selected sublist.
		 * WARNING : this can creates a lot of new object in memory.
		 */
		
			
		public java.util.List<SortHLAPI> getInputHLAPI(){
			java.util.List<SortHLAPI> retour = new ArrayList<SortHLAPI>();
			for (Sort elemnt : getInput()) {
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.pthlpng.integers.impl.NaturalImpl.class)){
					retour.add(new fr.lip6.move.pnml.pthlpng.integers.hlapi.NaturalHLAPI(
						(fr.lip6.move.pnml.pthlpng.integers.Natural)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.pthlpng.integers.impl.PositiveImpl.class)){
					retour.add(new fr.lip6.move.pnml.pthlpng.integers.hlapi.PositiveHLAPI(
						(fr.lip6.move.pnml.pthlpng.integers.Positive)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.pthlpng.integers.impl.HLIntegerImpl.class)){
					retour.add(new fr.lip6.move.pnml.pthlpng.integers.hlapi.HLIntegerHLAPI(
						(fr.lip6.move.pnml.pthlpng.integers.HLInteger)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.pthlpng.booleans.impl.BoolImpl.class)){
					retour.add(new fr.lip6.move.pnml.pthlpng.booleans.hlapi.BoolHLAPI(
						(fr.lip6.move.pnml.pthlpng.booleans.Bool)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.pthlpng.dots.impl.DotImpl.class)){
					retour.add(new fr.lip6.move.pnml.pthlpng.dots.hlapi.DotHLAPI(
						(fr.lip6.move.pnml.pthlpng.dots.Dot)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.pthlpng.terms.impl.MultisetSortImpl.class)){
					retour.add(new fr.lip6.move.pnml.pthlpng.terms.hlapi.MultisetSortHLAPI(
						(fr.lip6.move.pnml.pthlpng.terms.MultisetSort)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.pthlpng.terms.impl.ProductSortImpl.class)){
					retour.add(new fr.lip6.move.pnml.pthlpng.terms.hlapi.ProductSortHLAPI(
						(fr.lip6.move.pnml.pthlpng.terms.ProductSort)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.pthlpng.terms.impl.UserSortImpl.class)){
					retour.add(new fr.lip6.move.pnml.pthlpng.terms.hlapi.UserSortHLAPI(
						(fr.lip6.move.pnml.pthlpng.terms.UserSort)elemnt
						));
					continue;
				}
				
			}
			return retour;
		}
		
	
	

	//Special getter for list of generics object, return only one object type.
	
	
	
	
	
	
	
	
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of NumberConstantHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.pthlpng.integers.hlapi.NumberConstantHLAPI> getSubterm_integers_NumberConstantHLAPI(){
			java.util.List<fr.lip6.move.pnml.pthlpng.integers.hlapi.NumberConstantHLAPI> retour = new ArrayList<fr.lip6.move.pnml.pthlpng.integers.hlapi.NumberConstantHLAPI>();
			for (Term elemnt : getSubterm()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.pthlpng.integers.impl.NumberConstantImpl.class)){
					retour.add(new fr.lip6.move.pnml.pthlpng.integers.hlapi.NumberConstantHLAPI(
						(fr.lip6.move.pnml.pthlpng.integers.NumberConstant)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of AdditionHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.pthlpng.integers.hlapi.AdditionHLAPI> getSubterm_integers_AdditionHLAPI(){
			java.util.List<fr.lip6.move.pnml.pthlpng.integers.hlapi.AdditionHLAPI> retour = new ArrayList<fr.lip6.move.pnml.pthlpng.integers.hlapi.AdditionHLAPI>();
			for (Term elemnt : getSubterm()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.pthlpng.integers.impl.AdditionImpl.class)){
					retour.add(new fr.lip6.move.pnml.pthlpng.integers.hlapi.AdditionHLAPI(
						(fr.lip6.move.pnml.pthlpng.integers.Addition)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of SubtractionHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.pthlpng.integers.hlapi.SubtractionHLAPI> getSubterm_integers_SubtractionHLAPI(){
			java.util.List<fr.lip6.move.pnml.pthlpng.integers.hlapi.SubtractionHLAPI> retour = new ArrayList<fr.lip6.move.pnml.pthlpng.integers.hlapi.SubtractionHLAPI>();
			for (Term elemnt : getSubterm()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.pthlpng.integers.impl.SubtractionImpl.class)){
					retour.add(new fr.lip6.move.pnml.pthlpng.integers.hlapi.SubtractionHLAPI(
						(fr.lip6.move.pnml.pthlpng.integers.Subtraction)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of MultiplicationHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.pthlpng.integers.hlapi.MultiplicationHLAPI> getSubterm_integers_MultiplicationHLAPI(){
			java.util.List<fr.lip6.move.pnml.pthlpng.integers.hlapi.MultiplicationHLAPI> retour = new ArrayList<fr.lip6.move.pnml.pthlpng.integers.hlapi.MultiplicationHLAPI>();
			for (Term elemnt : getSubterm()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.pthlpng.integers.impl.MultiplicationImpl.class)){
					retour.add(new fr.lip6.move.pnml.pthlpng.integers.hlapi.MultiplicationHLAPI(
						(fr.lip6.move.pnml.pthlpng.integers.Multiplication)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of DivisionHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.pthlpng.integers.hlapi.DivisionHLAPI> getSubterm_integers_DivisionHLAPI(){
			java.util.List<fr.lip6.move.pnml.pthlpng.integers.hlapi.DivisionHLAPI> retour = new ArrayList<fr.lip6.move.pnml.pthlpng.integers.hlapi.DivisionHLAPI>();
			for (Term elemnt : getSubterm()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.pthlpng.integers.impl.DivisionImpl.class)){
					retour.add(new fr.lip6.move.pnml.pthlpng.integers.hlapi.DivisionHLAPI(
						(fr.lip6.move.pnml.pthlpng.integers.Division)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of ModuloHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.pthlpng.integers.hlapi.ModuloHLAPI> getSubterm_integers_ModuloHLAPI(){
			java.util.List<fr.lip6.move.pnml.pthlpng.integers.hlapi.ModuloHLAPI> retour = new ArrayList<fr.lip6.move.pnml.pthlpng.integers.hlapi.ModuloHLAPI>();
			for (Term elemnt : getSubterm()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.pthlpng.integers.impl.ModuloImpl.class)){
					retour.add(new fr.lip6.move.pnml.pthlpng.integers.hlapi.ModuloHLAPI(
						(fr.lip6.move.pnml.pthlpng.integers.Modulo)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of GreaterThanHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.pthlpng.integers.hlapi.GreaterThanHLAPI> getSubterm_integers_GreaterThanHLAPI(){
			java.util.List<fr.lip6.move.pnml.pthlpng.integers.hlapi.GreaterThanHLAPI> retour = new ArrayList<fr.lip6.move.pnml.pthlpng.integers.hlapi.GreaterThanHLAPI>();
			for (Term elemnt : getSubterm()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.pthlpng.integers.impl.GreaterThanImpl.class)){
					retour.add(new fr.lip6.move.pnml.pthlpng.integers.hlapi.GreaterThanHLAPI(
						(fr.lip6.move.pnml.pthlpng.integers.GreaterThan)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of GreaterThanOrEqualHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.pthlpng.integers.hlapi.GreaterThanOrEqualHLAPI> getSubterm_integers_GreaterThanOrEqualHLAPI(){
			java.util.List<fr.lip6.move.pnml.pthlpng.integers.hlapi.GreaterThanOrEqualHLAPI> retour = new ArrayList<fr.lip6.move.pnml.pthlpng.integers.hlapi.GreaterThanOrEqualHLAPI>();
			for (Term elemnt : getSubterm()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.pthlpng.integers.impl.GreaterThanOrEqualImpl.class)){
					retour.add(new fr.lip6.move.pnml.pthlpng.integers.hlapi.GreaterThanOrEqualHLAPI(
						(fr.lip6.move.pnml.pthlpng.integers.GreaterThanOrEqual)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of LessThanHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.pthlpng.integers.hlapi.LessThanHLAPI> getSubterm_integers_LessThanHLAPI(){
			java.util.List<fr.lip6.move.pnml.pthlpng.integers.hlapi.LessThanHLAPI> retour = new ArrayList<fr.lip6.move.pnml.pthlpng.integers.hlapi.LessThanHLAPI>();
			for (Term elemnt : getSubterm()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.pthlpng.integers.impl.LessThanImpl.class)){
					retour.add(new fr.lip6.move.pnml.pthlpng.integers.hlapi.LessThanHLAPI(
						(fr.lip6.move.pnml.pthlpng.integers.LessThan)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of LessThanOrEqualHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.pthlpng.integers.hlapi.LessThanOrEqualHLAPI> getSubterm_integers_LessThanOrEqualHLAPI(){
			java.util.List<fr.lip6.move.pnml.pthlpng.integers.hlapi.LessThanOrEqualHLAPI> retour = new ArrayList<fr.lip6.move.pnml.pthlpng.integers.hlapi.LessThanOrEqualHLAPI>();
			for (Term elemnt : getSubterm()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.pthlpng.integers.impl.LessThanOrEqualImpl.class)){
					retour.add(new fr.lip6.move.pnml.pthlpng.integers.hlapi.LessThanOrEqualHLAPI(
						(fr.lip6.move.pnml.pthlpng.integers.LessThanOrEqual)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of EqualityHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.pthlpng.booleans.hlapi.EqualityHLAPI> getSubterm_booleans_EqualityHLAPI(){
			java.util.List<fr.lip6.move.pnml.pthlpng.booleans.hlapi.EqualityHLAPI> retour = new ArrayList<fr.lip6.move.pnml.pthlpng.booleans.hlapi.EqualityHLAPI>();
			for (Term elemnt : getSubterm()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.pthlpng.booleans.impl.EqualityImpl.class)){
					retour.add(new fr.lip6.move.pnml.pthlpng.booleans.hlapi.EqualityHLAPI(
						(fr.lip6.move.pnml.pthlpng.booleans.Equality)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of InequalityHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.pthlpng.booleans.hlapi.InequalityHLAPI> getSubterm_booleans_InequalityHLAPI(){
			java.util.List<fr.lip6.move.pnml.pthlpng.booleans.hlapi.InequalityHLAPI> retour = new ArrayList<fr.lip6.move.pnml.pthlpng.booleans.hlapi.InequalityHLAPI>();
			for (Term elemnt : getSubterm()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.pthlpng.booleans.impl.InequalityImpl.class)){
					retour.add(new fr.lip6.move.pnml.pthlpng.booleans.hlapi.InequalityHLAPI(
						(fr.lip6.move.pnml.pthlpng.booleans.Inequality)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of BooleanConstantHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.pthlpng.booleans.hlapi.BooleanConstantHLAPI> getSubterm_booleans_BooleanConstantHLAPI(){
			java.util.List<fr.lip6.move.pnml.pthlpng.booleans.hlapi.BooleanConstantHLAPI> retour = new ArrayList<fr.lip6.move.pnml.pthlpng.booleans.hlapi.BooleanConstantHLAPI>();
			for (Term elemnt : getSubterm()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.pthlpng.booleans.impl.BooleanConstantImpl.class)){
					retour.add(new fr.lip6.move.pnml.pthlpng.booleans.hlapi.BooleanConstantHLAPI(
						(fr.lip6.move.pnml.pthlpng.booleans.BooleanConstant)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of OrHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.pthlpng.booleans.hlapi.OrHLAPI> getSubterm_booleans_OrHLAPI(){
			java.util.List<fr.lip6.move.pnml.pthlpng.booleans.hlapi.OrHLAPI> retour = new ArrayList<fr.lip6.move.pnml.pthlpng.booleans.hlapi.OrHLAPI>();
			for (Term elemnt : getSubterm()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.pthlpng.booleans.impl.OrImpl.class)){
					retour.add(new fr.lip6.move.pnml.pthlpng.booleans.hlapi.OrHLAPI(
						(fr.lip6.move.pnml.pthlpng.booleans.Or)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of AndHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.pthlpng.booleans.hlapi.AndHLAPI> getSubterm_booleans_AndHLAPI(){
			java.util.List<fr.lip6.move.pnml.pthlpng.booleans.hlapi.AndHLAPI> retour = new ArrayList<fr.lip6.move.pnml.pthlpng.booleans.hlapi.AndHLAPI>();
			for (Term elemnt : getSubterm()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.pthlpng.booleans.impl.AndImpl.class)){
					retour.add(new fr.lip6.move.pnml.pthlpng.booleans.hlapi.AndHLAPI(
						(fr.lip6.move.pnml.pthlpng.booleans.And)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of ImplyHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.pthlpng.booleans.hlapi.ImplyHLAPI> getSubterm_booleans_ImplyHLAPI(){
			java.util.List<fr.lip6.move.pnml.pthlpng.booleans.hlapi.ImplyHLAPI> retour = new ArrayList<fr.lip6.move.pnml.pthlpng.booleans.hlapi.ImplyHLAPI>();
			for (Term elemnt : getSubterm()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.pthlpng.booleans.impl.ImplyImpl.class)){
					retour.add(new fr.lip6.move.pnml.pthlpng.booleans.hlapi.ImplyHLAPI(
						(fr.lip6.move.pnml.pthlpng.booleans.Imply)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of NotHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.pthlpng.booleans.hlapi.NotHLAPI> getSubterm_booleans_NotHLAPI(){
			java.util.List<fr.lip6.move.pnml.pthlpng.booleans.hlapi.NotHLAPI> retour = new ArrayList<fr.lip6.move.pnml.pthlpng.booleans.hlapi.NotHLAPI>();
			for (Term elemnt : getSubterm()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.pthlpng.booleans.impl.NotImpl.class)){
					retour.add(new fr.lip6.move.pnml.pthlpng.booleans.hlapi.NotHLAPI(
						(fr.lip6.move.pnml.pthlpng.booleans.Not)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of DotConstantHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.pthlpng.dots.hlapi.DotConstantHLAPI> getSubterm_dots_DotConstantHLAPI(){
			java.util.List<fr.lip6.move.pnml.pthlpng.dots.hlapi.DotConstantHLAPI> retour = new ArrayList<fr.lip6.move.pnml.pthlpng.dots.hlapi.DotConstantHLAPI>();
			for (Term elemnt : getSubterm()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.pthlpng.dots.impl.DotConstantImpl.class)){
					retour.add(new fr.lip6.move.pnml.pthlpng.dots.hlapi.DotConstantHLAPI(
						(fr.lip6.move.pnml.pthlpng.dots.DotConstant)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of CardinalityHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.pthlpng.multisets.hlapi.CardinalityHLAPI> getSubterm_multisets_CardinalityHLAPI(){
			java.util.List<fr.lip6.move.pnml.pthlpng.multisets.hlapi.CardinalityHLAPI> retour = new ArrayList<fr.lip6.move.pnml.pthlpng.multisets.hlapi.CardinalityHLAPI>();
			for (Term elemnt : getSubterm()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.pthlpng.multisets.impl.CardinalityImpl.class)){
					retour.add(new fr.lip6.move.pnml.pthlpng.multisets.hlapi.CardinalityHLAPI(
						(fr.lip6.move.pnml.pthlpng.multisets.Cardinality)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of ContainsHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.pthlpng.multisets.hlapi.ContainsHLAPI> getSubterm_multisets_ContainsHLAPI(){
			java.util.List<fr.lip6.move.pnml.pthlpng.multisets.hlapi.ContainsHLAPI> retour = new ArrayList<fr.lip6.move.pnml.pthlpng.multisets.hlapi.ContainsHLAPI>();
			for (Term elemnt : getSubterm()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.pthlpng.multisets.impl.ContainsImpl.class)){
					retour.add(new fr.lip6.move.pnml.pthlpng.multisets.hlapi.ContainsHLAPI(
						(fr.lip6.move.pnml.pthlpng.multisets.Contains)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of CardinalityOfHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.pthlpng.multisets.hlapi.CardinalityOfHLAPI> getSubterm_multisets_CardinalityOfHLAPI(){
			java.util.List<fr.lip6.move.pnml.pthlpng.multisets.hlapi.CardinalityOfHLAPI> retour = new ArrayList<fr.lip6.move.pnml.pthlpng.multisets.hlapi.CardinalityOfHLAPI>();
			for (Term elemnt : getSubterm()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.pthlpng.multisets.impl.CardinalityOfImpl.class)){
					retour.add(new fr.lip6.move.pnml.pthlpng.multisets.hlapi.CardinalityOfHLAPI(
						(fr.lip6.move.pnml.pthlpng.multisets.CardinalityOf)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of AddHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.pthlpng.multisets.hlapi.AddHLAPI> getSubterm_multisets_AddHLAPI(){
			java.util.List<fr.lip6.move.pnml.pthlpng.multisets.hlapi.AddHLAPI> retour = new ArrayList<fr.lip6.move.pnml.pthlpng.multisets.hlapi.AddHLAPI>();
			for (Term elemnt : getSubterm()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.pthlpng.multisets.impl.AddImpl.class)){
					retour.add(new fr.lip6.move.pnml.pthlpng.multisets.hlapi.AddHLAPI(
						(fr.lip6.move.pnml.pthlpng.multisets.Add)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of AllHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.pthlpng.multisets.hlapi.AllHLAPI> getSubterm_multisets_AllHLAPI(){
			java.util.List<fr.lip6.move.pnml.pthlpng.multisets.hlapi.AllHLAPI> retour = new ArrayList<fr.lip6.move.pnml.pthlpng.multisets.hlapi.AllHLAPI>();
			for (Term elemnt : getSubterm()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.pthlpng.multisets.impl.AllImpl.class)){
					retour.add(new fr.lip6.move.pnml.pthlpng.multisets.hlapi.AllHLAPI(
						(fr.lip6.move.pnml.pthlpng.multisets.All)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of EmptyHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.pthlpng.multisets.hlapi.EmptyHLAPI> getSubterm_multisets_EmptyHLAPI(){
			java.util.List<fr.lip6.move.pnml.pthlpng.multisets.hlapi.EmptyHLAPI> retour = new ArrayList<fr.lip6.move.pnml.pthlpng.multisets.hlapi.EmptyHLAPI>();
			for (Term elemnt : getSubterm()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.pthlpng.multisets.impl.EmptyImpl.class)){
					retour.add(new fr.lip6.move.pnml.pthlpng.multisets.hlapi.EmptyHLAPI(
						(fr.lip6.move.pnml.pthlpng.multisets.Empty)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of NumberOfHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.pthlpng.multisets.hlapi.NumberOfHLAPI> getSubterm_multisets_NumberOfHLAPI(){
			java.util.List<fr.lip6.move.pnml.pthlpng.multisets.hlapi.NumberOfHLAPI> retour = new ArrayList<fr.lip6.move.pnml.pthlpng.multisets.hlapi.NumberOfHLAPI>();
			for (Term elemnt : getSubterm()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.pthlpng.multisets.impl.NumberOfImpl.class)){
					retour.add(new fr.lip6.move.pnml.pthlpng.multisets.hlapi.NumberOfHLAPI(
						(fr.lip6.move.pnml.pthlpng.multisets.NumberOf)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of SubtractHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.pthlpng.multisets.hlapi.SubtractHLAPI> getSubterm_multisets_SubtractHLAPI(){
			java.util.List<fr.lip6.move.pnml.pthlpng.multisets.hlapi.SubtractHLAPI> retour = new ArrayList<fr.lip6.move.pnml.pthlpng.multisets.hlapi.SubtractHLAPI>();
			for (Term elemnt : getSubterm()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.pthlpng.multisets.impl.SubtractImpl.class)){
					retour.add(new fr.lip6.move.pnml.pthlpng.multisets.hlapi.SubtractHLAPI(
						(fr.lip6.move.pnml.pthlpng.multisets.Subtract)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of ScalarProductHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.pthlpng.multisets.hlapi.ScalarProductHLAPI> getSubterm_multisets_ScalarProductHLAPI(){
			java.util.List<fr.lip6.move.pnml.pthlpng.multisets.hlapi.ScalarProductHLAPI> retour = new ArrayList<fr.lip6.move.pnml.pthlpng.multisets.hlapi.ScalarProductHLAPI>();
			for (Term elemnt : getSubterm()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.pthlpng.multisets.impl.ScalarProductImpl.class)){
					retour.add(new fr.lip6.move.pnml.pthlpng.multisets.hlapi.ScalarProductHLAPI(
						(fr.lip6.move.pnml.pthlpng.multisets.ScalarProduct)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of GreaterThanHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.pthlpng.partitions.hlapi.GreaterThanHLAPI> getSubterm_partitions_GreaterThanHLAPI(){
			java.util.List<fr.lip6.move.pnml.pthlpng.partitions.hlapi.GreaterThanHLAPI> retour = new ArrayList<fr.lip6.move.pnml.pthlpng.partitions.hlapi.GreaterThanHLAPI>();
			for (Term elemnt : getSubterm()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.pthlpng.partitions.impl.GreaterThanImpl.class)){
					retour.add(new fr.lip6.move.pnml.pthlpng.partitions.hlapi.GreaterThanHLAPI(
						(fr.lip6.move.pnml.pthlpng.partitions.GreaterThan)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of PartitionElementOfHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.pthlpng.partitions.hlapi.PartitionElementOfHLAPI> getSubterm_partitions_PartitionElementOfHLAPI(){
			java.util.List<fr.lip6.move.pnml.pthlpng.partitions.hlapi.PartitionElementOfHLAPI> retour = new ArrayList<fr.lip6.move.pnml.pthlpng.partitions.hlapi.PartitionElementOfHLAPI>();
			for (Term elemnt : getSubterm()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.pthlpng.partitions.impl.PartitionElementOfImpl.class)){
					retour.add(new fr.lip6.move.pnml.pthlpng.partitions.hlapi.PartitionElementOfHLAPI(
						(fr.lip6.move.pnml.pthlpng.partitions.PartitionElementOf)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of LessThanHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.pthlpng.partitions.hlapi.LessThanHLAPI> getSubterm_partitions_LessThanHLAPI(){
			java.util.List<fr.lip6.move.pnml.pthlpng.partitions.hlapi.LessThanHLAPI> retour = new ArrayList<fr.lip6.move.pnml.pthlpng.partitions.hlapi.LessThanHLAPI>();
			for (Term elemnt : getSubterm()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.pthlpng.partitions.impl.LessThanImpl.class)){
					retour.add(new fr.lip6.move.pnml.pthlpng.partitions.hlapi.LessThanHLAPI(
						(fr.lip6.move.pnml.pthlpng.partitions.LessThan)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of VariableHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.pthlpng.terms.hlapi.VariableHLAPI> getSubterm_terms_VariableHLAPI(){
			java.util.List<fr.lip6.move.pnml.pthlpng.terms.hlapi.VariableHLAPI> retour = new ArrayList<fr.lip6.move.pnml.pthlpng.terms.hlapi.VariableHLAPI>();
			for (Term elemnt : getSubterm()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.pthlpng.terms.impl.VariableImpl.class)){
					retour.add(new fr.lip6.move.pnml.pthlpng.terms.hlapi.VariableHLAPI(
						(fr.lip6.move.pnml.pthlpng.terms.Variable)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of TupleHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.pthlpng.terms.hlapi.TupleHLAPI> getSubterm_terms_TupleHLAPI(){
			java.util.List<fr.lip6.move.pnml.pthlpng.terms.hlapi.TupleHLAPI> retour = new ArrayList<fr.lip6.move.pnml.pthlpng.terms.hlapi.TupleHLAPI>();
			for (Term elemnt : getSubterm()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.pthlpng.terms.impl.TupleImpl.class)){
					retour.add(new fr.lip6.move.pnml.pthlpng.terms.hlapi.TupleHLAPI(
						(fr.lip6.move.pnml.pthlpng.terms.Tuple)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of UserOperatorHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.pthlpng.terms.hlapi.UserOperatorHLAPI> getSubterm_terms_UserOperatorHLAPI(){
			java.util.List<fr.lip6.move.pnml.pthlpng.terms.hlapi.UserOperatorHLAPI> retour = new ArrayList<fr.lip6.move.pnml.pthlpng.terms.hlapi.UserOperatorHLAPI>();
			for (Term elemnt : getSubterm()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.pthlpng.terms.impl.UserOperatorImpl.class)){
					retour.add(new fr.lip6.move.pnml.pthlpng.terms.hlapi.UserOperatorHLAPI(
						(fr.lip6.move.pnml.pthlpng.terms.UserOperator)elemnt
						));
				}
			}
			return retour;
		}
		
	
	
	
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of NaturalHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.pthlpng.integers.hlapi.NaturalHLAPI> getInput_integers_NaturalHLAPI(){
			java.util.List<fr.lip6.move.pnml.pthlpng.integers.hlapi.NaturalHLAPI> retour = new ArrayList<fr.lip6.move.pnml.pthlpng.integers.hlapi.NaturalHLAPI>();
			for (Sort elemnt : getInput()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.pthlpng.integers.impl.NaturalImpl.class)){
					retour.add(new fr.lip6.move.pnml.pthlpng.integers.hlapi.NaturalHLAPI(
						(fr.lip6.move.pnml.pthlpng.integers.Natural)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of PositiveHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.pthlpng.integers.hlapi.PositiveHLAPI> getInput_integers_PositiveHLAPI(){
			java.util.List<fr.lip6.move.pnml.pthlpng.integers.hlapi.PositiveHLAPI> retour = new ArrayList<fr.lip6.move.pnml.pthlpng.integers.hlapi.PositiveHLAPI>();
			for (Sort elemnt : getInput()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.pthlpng.integers.impl.PositiveImpl.class)){
					retour.add(new fr.lip6.move.pnml.pthlpng.integers.hlapi.PositiveHLAPI(
						(fr.lip6.move.pnml.pthlpng.integers.Positive)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of HLIntegerHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.pthlpng.integers.hlapi.HLIntegerHLAPI> getInput_integers_HLIntegerHLAPI(){
			java.util.List<fr.lip6.move.pnml.pthlpng.integers.hlapi.HLIntegerHLAPI> retour = new ArrayList<fr.lip6.move.pnml.pthlpng.integers.hlapi.HLIntegerHLAPI>();
			for (Sort elemnt : getInput()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.pthlpng.integers.impl.HLIntegerImpl.class)){
					retour.add(new fr.lip6.move.pnml.pthlpng.integers.hlapi.HLIntegerHLAPI(
						(fr.lip6.move.pnml.pthlpng.integers.HLInteger)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of BoolHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.pthlpng.booleans.hlapi.BoolHLAPI> getInput_booleans_BoolHLAPI(){
			java.util.List<fr.lip6.move.pnml.pthlpng.booleans.hlapi.BoolHLAPI> retour = new ArrayList<fr.lip6.move.pnml.pthlpng.booleans.hlapi.BoolHLAPI>();
			for (Sort elemnt : getInput()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.pthlpng.booleans.impl.BoolImpl.class)){
					retour.add(new fr.lip6.move.pnml.pthlpng.booleans.hlapi.BoolHLAPI(
						(fr.lip6.move.pnml.pthlpng.booleans.Bool)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of DotHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.pthlpng.dots.hlapi.DotHLAPI> getInput_dots_DotHLAPI(){
			java.util.List<fr.lip6.move.pnml.pthlpng.dots.hlapi.DotHLAPI> retour = new ArrayList<fr.lip6.move.pnml.pthlpng.dots.hlapi.DotHLAPI>();
			for (Sort elemnt : getInput()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.pthlpng.dots.impl.DotImpl.class)){
					retour.add(new fr.lip6.move.pnml.pthlpng.dots.hlapi.DotHLAPI(
						(fr.lip6.move.pnml.pthlpng.dots.Dot)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of MultisetSortHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.pthlpng.terms.hlapi.MultisetSortHLAPI> getInput_terms_MultisetSortHLAPI(){
			java.util.List<fr.lip6.move.pnml.pthlpng.terms.hlapi.MultisetSortHLAPI> retour = new ArrayList<fr.lip6.move.pnml.pthlpng.terms.hlapi.MultisetSortHLAPI>();
			for (Sort elemnt : getInput()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.pthlpng.terms.impl.MultisetSortImpl.class)){
					retour.add(new fr.lip6.move.pnml.pthlpng.terms.hlapi.MultisetSortHLAPI(
						(fr.lip6.move.pnml.pthlpng.terms.MultisetSort)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of ProductSortHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.pthlpng.terms.hlapi.ProductSortHLAPI> getInput_terms_ProductSortHLAPI(){
			java.util.List<fr.lip6.move.pnml.pthlpng.terms.hlapi.ProductSortHLAPI> retour = new ArrayList<fr.lip6.move.pnml.pthlpng.terms.hlapi.ProductSortHLAPI>();
			for (Sort elemnt : getInput()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.pthlpng.terms.impl.ProductSortImpl.class)){
					retour.add(new fr.lip6.move.pnml.pthlpng.terms.hlapi.ProductSortHLAPI(
						(fr.lip6.move.pnml.pthlpng.terms.ProductSort)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of UserSortHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.pthlpng.terms.hlapi.UserSortHLAPI> getInput_terms_UserSortHLAPI(){
			java.util.List<fr.lip6.move.pnml.pthlpng.terms.hlapi.UserSortHLAPI> retour = new ArrayList<fr.lip6.move.pnml.pthlpng.terms.hlapi.UserSortHLAPI>();
			for (Sort elemnt : getInput()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.pthlpng.terms.impl.UserSortImpl.class)){
					retour.add(new fr.lip6.move.pnml.pthlpng.terms.hlapi.UserSortHLAPI(
						(fr.lip6.move.pnml.pthlpng.terms.UserSort)elemnt
						));
				}
			}
			return retour;
		}
		
	
	

	//setters (including container setter if aviable)
	
	
	/**
	 * set Sort
	 */
	public void setSortHLAPI(
	
	SortHLAPI elem){
	
	
 		if(elem!=null)
			item.setSort((Sort)elem.getContainedItem());
	
	}
	
	/**
	 * set Output
	 */
	public void setOutputHLAPI(
	
	SortHLAPI elem){
	
	
 		if(elem!=null)
			item.setOutput((Sort)elem.getContainedItem());
	
	}
	
	/**
	 * set ContainerOperator
	 */
	public void setContainerOperatorHLAPI(
	
	OperatorHLAPI elem){
	
	
 		if(elem!=null)
			item.setContainerOperator((Operator)elem.getContainedItem());
	
	}
	
	/**
	 * set ContainerNamedOperator
	 */
	public void setContainerNamedOperatorHLAPI(
	
	NamedOperatorHLAPI elem){
	
	
 		if(elem!=null)
			item.setContainerNamedOperator((NamedOperator)elem.getContainedItem());
	
	}
	
	/**
	 * set ContainerHLMarking
	 */
	public void setContainerHLMarkingHLAPI(
	
	HLMarkingHLAPI elem){
	
	
 		if(elem!=null)
			item.setContainerHLMarking((HLMarking)elem.getContainedItem());
	
	}
	
	/**
	 * set ContainerCondition
	 */
	public void setContainerConditionHLAPI(
	
	ConditionHLAPI elem){
	
	
 		if(elem!=null)
			item.setContainerCondition((Condition)elem.getContainedItem());
	
	}
	
	/**
	 * set ContainerHLAnnotation
	 */
	public void setContainerHLAnnotationHLAPI(
	
	HLAnnotationHLAPI elem){
	
	
 		if(elem!=null)
			item.setContainerHLAnnotation((HLAnnotation)elem.getContainedItem());
	
	}
	
	/**
	 * set ContainerPartitionElement
	 */
	public void setContainerPartitionElementHLAPI(
	
	PartitionElementHLAPI elem){
	
	
 		if(elem!=null)
			item.setContainerPartitionElement((PartitionElement)elem.getContainedItem());
	
	}
	

	//setters/remover for lists.
	
	
	public void addSubtermHLAPI(TermHLAPI unit){
	
		item.getSubterm().add((Term)unit.getContainedItem());
	}

	public void removeSubtermHLAPI(TermHLAPI unit){
		item.getSubterm().remove((Term)unit.getContainedItem());
	}
	

	//equals method
	public boolean equals(GreaterThanHLAPI item){
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