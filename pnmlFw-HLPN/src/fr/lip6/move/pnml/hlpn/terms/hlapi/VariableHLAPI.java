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
 *
 * $Id ggiffo, Tue Dec 23 11:30:49 CET 2014$
 */
package fr.lip6.move.pnml.hlpn.terms.hlapi;

import fr.lip6.move.pnml.hlpn.arbitrarydeclarations.AnySort;
import fr.lip6.move.pnml.hlpn.arbitrarydeclarations.ArbitraryOperator;
import fr.lip6.move.pnml.hlpn.arbitrarydeclarations.ArbitrarySort;
import fr.lip6.move.pnml.hlpn.arbitrarydeclarations.Unparsed;

import fr.lip6.move.pnml.hlpn.arbitrarydeclarations.impl.ArbitrarydeclarationsFactoryImpl;

import fr.lip6.move.pnml.hlpn.booleans.And;
import fr.lip6.move.pnml.hlpn.booleans.Bool;
import fr.lip6.move.pnml.hlpn.booleans.BooleanConstant;
import fr.lip6.move.pnml.hlpn.booleans.Equality;
import fr.lip6.move.pnml.hlpn.booleans.Imply;
import fr.lip6.move.pnml.hlpn.booleans.Inequality;
import fr.lip6.move.pnml.hlpn.booleans.Not;
import fr.lip6.move.pnml.hlpn.booleans.Or;

import fr.lip6.move.pnml.hlpn.booleans.impl.BooleansFactoryImpl;

import fr.lip6.move.pnml.hlpn.cyclicEnumerations.CyclicEnumeration;
import fr.lip6.move.pnml.hlpn.cyclicEnumerations.Predecessor;
import fr.lip6.move.pnml.hlpn.cyclicEnumerations.Successor;

import fr.lip6.move.pnml.hlpn.cyclicEnumerations.impl.CyclicEnumerationsFactoryImpl;

import fr.lip6.move.pnml.hlpn.dots.Dot;
import fr.lip6.move.pnml.hlpn.dots.DotConstant;

import fr.lip6.move.pnml.hlpn.dots.impl.DotsFactoryImpl;

import fr.lip6.move.pnml.hlpn.finiteEnumerations.FEConstant;
import fr.lip6.move.pnml.hlpn.finiteEnumerations.FiniteEnumeration;

import fr.lip6.move.pnml.hlpn.finiteEnumerations.impl.FiniteEnumerationsFactoryImpl;

import fr.lip6.move.pnml.hlpn.finiteIntRanges.FiniteIntRange;
import fr.lip6.move.pnml.hlpn.finiteIntRanges.FiniteIntRangeConstant;
import fr.lip6.move.pnml.hlpn.finiteIntRanges.GreaterThan;
import fr.lip6.move.pnml.hlpn.finiteIntRanges.GreaterThanOrEqual;
import fr.lip6.move.pnml.hlpn.finiteIntRanges.LessThan;
import fr.lip6.move.pnml.hlpn.finiteIntRanges.LessThanOrEqual;

import fr.lip6.move.pnml.hlpn.finiteIntRanges.impl.FiniteIntRangesFactoryImpl;

import fr.lip6.move.pnml.hlpn.hlcorestructure.Annotation;
import fr.lip6.move.pnml.hlpn.hlcorestructure.AnnotationGraphics;
import fr.lip6.move.pnml.hlpn.hlcorestructure.AnyObject;
import fr.lip6.move.pnml.hlpn.hlcorestructure.Arc;
import fr.lip6.move.pnml.hlpn.hlcorestructure.ArcGraphics;
import fr.lip6.move.pnml.hlpn.hlcorestructure.CSS2Color;
import fr.lip6.move.pnml.hlpn.hlcorestructure.CSS2FontFamily;
import fr.lip6.move.pnml.hlpn.hlcorestructure.CSS2FontSize;
import fr.lip6.move.pnml.hlpn.hlcorestructure.CSS2FontStyle;
import fr.lip6.move.pnml.hlpn.hlcorestructure.CSS2FontWeight;
import fr.lip6.move.pnml.hlpn.hlcorestructure.Condition;
import fr.lip6.move.pnml.hlpn.hlcorestructure.Declaration;
import fr.lip6.move.pnml.hlpn.hlcorestructure.Dimension;
import fr.lip6.move.pnml.hlpn.hlcorestructure.Fill;
import fr.lip6.move.pnml.hlpn.hlcorestructure.Font;
import fr.lip6.move.pnml.hlpn.hlcorestructure.FontAlign;
import fr.lip6.move.pnml.hlpn.hlcorestructure.FontDecoration;
import fr.lip6.move.pnml.hlpn.hlcorestructure.Gradient;
import fr.lip6.move.pnml.hlpn.hlcorestructure.HLAnnotation;
import fr.lip6.move.pnml.hlpn.hlcorestructure.HLMarking;
import fr.lip6.move.pnml.hlpn.hlcorestructure.Label;
import fr.lip6.move.pnml.hlpn.hlcorestructure.Line;
import fr.lip6.move.pnml.hlpn.hlcorestructure.LineShape;
import fr.lip6.move.pnml.hlpn.hlcorestructure.LineStyle;
import fr.lip6.move.pnml.hlpn.hlcorestructure.Name;
import fr.lip6.move.pnml.hlpn.hlcorestructure.Node;
import fr.lip6.move.pnml.hlpn.hlcorestructure.NodeGraphics;
import fr.lip6.move.pnml.hlpn.hlcorestructure.Offset;
import fr.lip6.move.pnml.hlpn.hlcorestructure.PNType;
import fr.lip6.move.pnml.hlpn.hlcorestructure.Page;
import fr.lip6.move.pnml.hlpn.hlcorestructure.PetriNet;
import fr.lip6.move.pnml.hlpn.hlcorestructure.PetriNetDoc;
import fr.lip6.move.pnml.hlpn.hlcorestructure.Place;
import fr.lip6.move.pnml.hlpn.hlcorestructure.PlaceNode;
import fr.lip6.move.pnml.hlpn.hlcorestructure.PnObject;
import fr.lip6.move.pnml.hlpn.hlcorestructure.Position;
import fr.lip6.move.pnml.hlpn.hlcorestructure.RefPlace;
import fr.lip6.move.pnml.hlpn.hlcorestructure.RefTransition;
import fr.lip6.move.pnml.hlpn.hlcorestructure.ToolInfo;
import fr.lip6.move.pnml.hlpn.hlcorestructure.Transition;
import fr.lip6.move.pnml.hlpn.hlcorestructure.TransitionNode;
import fr.lip6.move.pnml.hlpn.hlcorestructure.Type;

import fr.lip6.move.pnml.hlpn.hlcorestructure.impl.HlcorestructureFactoryImpl;

import fr.lip6.move.pnml.hlpn.integers.Addition;
import fr.lip6.move.pnml.hlpn.integers.Division;
import fr.lip6.move.pnml.hlpn.integers.HLInteger;
import fr.lip6.move.pnml.hlpn.integers.HLPNNumber;
import fr.lip6.move.pnml.hlpn.integers.Modulo;
import fr.lip6.move.pnml.hlpn.integers.Multiplication;
import fr.lip6.move.pnml.hlpn.integers.Natural;
import fr.lip6.move.pnml.hlpn.integers.NumberConstant;
import fr.lip6.move.pnml.hlpn.integers.Positive;
import fr.lip6.move.pnml.hlpn.integers.Subtraction;

import fr.lip6.move.pnml.hlpn.integers.impl.IntegersFactoryImpl;

import fr.lip6.move.pnml.hlpn.lists.Append;
import fr.lip6.move.pnml.hlpn.lists.Concatenation;
import fr.lip6.move.pnml.hlpn.lists.EmptyList;
import fr.lip6.move.pnml.hlpn.lists.HLPNList;
import fr.lip6.move.pnml.hlpn.lists.Length;
import fr.lip6.move.pnml.hlpn.lists.MakeList;
import fr.lip6.move.pnml.hlpn.lists.MemberAtIndex;
import fr.lip6.move.pnml.hlpn.lists.Sublist;

import fr.lip6.move.pnml.hlpn.lists.impl.ListsFactoryImpl;

import fr.lip6.move.pnml.hlpn.multisets.Add;
import fr.lip6.move.pnml.hlpn.multisets.All;
import fr.lip6.move.pnml.hlpn.multisets.Cardinality;
import fr.lip6.move.pnml.hlpn.multisets.CardinalityOf;
import fr.lip6.move.pnml.hlpn.multisets.Contains;
import fr.lip6.move.pnml.hlpn.multisets.Empty;
import fr.lip6.move.pnml.hlpn.multisets.NumberOf;
import fr.lip6.move.pnml.hlpn.multisets.ScalarProduct;
import fr.lip6.move.pnml.hlpn.multisets.Subtract;

import fr.lip6.move.pnml.hlpn.multisets.impl.MultisetsFactoryImpl;

import fr.lip6.move.pnml.hlpn.partitions.Partition;
import fr.lip6.move.pnml.hlpn.partitions.PartitionElement;
import fr.lip6.move.pnml.hlpn.partitions.PartitionElementOf;

import fr.lip6.move.pnml.hlpn.partitions.impl.PartitionsFactoryImpl;

import fr.lip6.move.pnml.hlpn.strings.HLPNString;
import fr.lip6.move.pnml.hlpn.strings.StringConstant;
import fr.lip6.move.pnml.hlpn.strings.Substring;

import fr.lip6.move.pnml.hlpn.strings.impl.StringsFactoryImpl;

import fr.lip6.move.pnml.hlpn.terms.Declarations;
import fr.lip6.move.pnml.hlpn.terms.MultisetSort;
import fr.lip6.move.pnml.hlpn.terms.NamedOperator;
import fr.lip6.move.pnml.hlpn.terms.NamedSort;
import fr.lip6.move.pnml.hlpn.terms.Operator;
import fr.lip6.move.pnml.hlpn.terms.ProductSort;
import fr.lip6.move.pnml.hlpn.terms.Sort;
import fr.lip6.move.pnml.hlpn.terms.Term;
import fr.lip6.move.pnml.hlpn.terms.TermsDeclaration;
import fr.lip6.move.pnml.hlpn.terms.Variable;
import fr.lip6.move.pnml.hlpn.terms.VariableDecl;

import fr.lip6.move.pnml.hlpn.terms.impl.TermsFactoryImpl;

import java.math.BigDecimal;

import java.net.URI;

import java.util.List;

import  fr.lip6.move.pnml.framework.hlapi.*;
import fr.lip6.move.pnml.hlpn.arbitrarydeclarations.hlapi.*;
import fr.lip6.move.pnml.hlpn.booleans.hlapi.*;
import fr.lip6.move.pnml.hlpn.cyclicEnumerations.hlapi.*;
import fr.lip6.move.pnml.hlpn.dots.hlapi.*;
import fr.lip6.move.pnml.hlpn.finiteEnumerations.hlapi.*;
import fr.lip6.move.pnml.hlpn.finiteIntRanges.hlapi.*;
import fr.lip6.move.pnml.hlpn.hlcorestructure.hlapi.*;
import fr.lip6.move.pnml.hlpn.integers.hlapi.*;
import fr.lip6.move.pnml.hlpn.lists.hlapi.*;
import fr.lip6.move.pnml.hlpn.multisets.hlapi.*;
import fr.lip6.move.pnml.hlpn.partitions.hlapi.*;
import fr.lip6.move.pnml.hlpn.strings.hlapi.*;
import fr.lip6.move.pnml.hlpn.terms.hlapi.*;

import java.util.ArrayList;
import java.util.List;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import org.apache.axiom.om.*;
import fr.lip6.move.pnml.framework.utils.IdRefLinker;
import org.eclipse.emf.common.util.DiagnosticChain;
import fr.lip6.move.pnml.hlpn.terms.*;
import fr.lip6.move.pnml.hlpn.terms.impl.*;
import fr.lip6.move.pnml.framework.utils.exception.InnerBuildException;
import fr.lip6.move.pnml.framework.utils.exception.InvalidIDException;
import fr.lip6.move.pnml.framework.utils.exception.VoidRepositoryException;
import fr.lip6.move.pnml.framework.utils.exception.OtherException;
import fr.lip6.move.pnml.framework.utils.IdRepository;
import fr.lip6.move.pnml.framework.utils.ModelRepository;


public class VariableHLAPI implements HLAPIClass,TermHLAPI{

	/**
	 * The contained LLAPI element.
	 */
	private Variable item;

	/**
	 * this constructor allows you to set all 'settable' values
	 * excepted container.
	 */
	
	public VariableHLAPI(
		 SortHLAPI sort
	
		, VariableDeclHLAPI variableDecl
	){//BEGIN CONSTRUCTOR BODY
		TermsFactory fact = TermsFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createVariable();}
	
 		
 		if(sort!=null)
			item.setSort((Sort)sort.getContainedItem());
		
	
 		
 		if(variableDecl!=null)
			item.setVariableDecl((VariableDecl)variableDecl.getContainedItem());
		
	
	}

	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	
	public VariableHLAPI(
		 SortHLAPI sort
	
		, VariableDeclHLAPI variableDecl
	
		, OperatorHLAPI containerOperator
	){//BEGIN CONSTRUCTOR BODY
		TermsFactory fact = TermsFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createVariable();}
	
 		
 		if(sort!=null)
			item.setSort((Sort)sort.getContainedItem());
		
	
 		
 		if(variableDecl!=null)
			item.setVariableDecl((VariableDecl)variableDecl.getContainedItem());
		
	
 		
 		if(containerOperator!=null)
			item.setContainerOperator((Operator)containerOperator.getContainedItem());
		
	
	}

	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	
	public VariableHLAPI(
		 SortHLAPI sort
	
		, VariableDeclHLAPI variableDecl
	
		, NamedOperatorHLAPI containerNamedOperator
	){//BEGIN CONSTRUCTOR BODY
		TermsFactory fact = TermsFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createVariable();}
	
 		
 		if(sort!=null)
			item.setSort((Sort)sort.getContainedItem());
		
	
 		
 		if(variableDecl!=null)
			item.setVariableDecl((VariableDecl)variableDecl.getContainedItem());
		
	
 		
 		if(containerNamedOperator!=null)
			item.setContainerNamedOperator((NamedOperator)containerNamedOperator.getContainedItem());
		
	
	}

	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	
	public VariableHLAPI(
		 SortHLAPI sort
	
		, VariableDeclHLAPI variableDecl
	
		, HLMarkingHLAPI containerHLMarking
	){//BEGIN CONSTRUCTOR BODY
		TermsFactory fact = TermsFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createVariable();}
	
 		
 		if(sort!=null)
			item.setSort((Sort)sort.getContainedItem());
		
	
 		
 		if(variableDecl!=null)
			item.setVariableDecl((VariableDecl)variableDecl.getContainedItem());
		
	
 		
 		if(containerHLMarking!=null)
			item.setContainerHLMarking((HLMarking)containerHLMarking.getContainedItem());
		
	
	}

	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	
	public VariableHLAPI(
		 SortHLAPI sort
	
		, VariableDeclHLAPI variableDecl
	
		, ConditionHLAPI containerCondition
	){//BEGIN CONSTRUCTOR BODY
		TermsFactory fact = TermsFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createVariable();}
	
 		
 		if(sort!=null)
			item.setSort((Sort)sort.getContainedItem());
		
	
 		
 		if(variableDecl!=null)
			item.setVariableDecl((VariableDecl)variableDecl.getContainedItem());
		
	
 		
 		if(containerCondition!=null)
			item.setContainerCondition((Condition)containerCondition.getContainedItem());
		
	
	}

	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	
	public VariableHLAPI(
		 SortHLAPI sort
	
		, VariableDeclHLAPI variableDecl
	
		, HLAnnotationHLAPI containerHLAnnotation
	){//BEGIN CONSTRUCTOR BODY
		TermsFactory fact = TermsFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createVariable();}
	
 		
 		if(sort!=null)
			item.setSort((Sort)sort.getContainedItem());
		
	
 		
 		if(variableDecl!=null)
			item.setVariableDecl((VariableDecl)variableDecl.getContainedItem());
		
	
 		
 		if(containerHLAnnotation!=null)
			item.setContainerHLAnnotation((HLAnnotation)containerHLAnnotation.getContainedItem());
		
	
	}

	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	
	public VariableHLAPI(
		 SortHLAPI sort
	
		, VariableDeclHLAPI variableDecl
	
		, PartitionElementHLAPI containerPartitionElement
	){//BEGIN CONSTRUCTOR BODY
		TermsFactory fact = TermsFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createVariable();}
	
 		
 		if(sort!=null)
			item.setSort((Sort)sort.getContainedItem());
		
	
 		
 		if(variableDecl!=null)
			item.setVariableDecl((VariableDecl)variableDecl.getContainedItem());
		
	
 		
 		if(containerPartitionElement!=null)
			item.setContainerPartitionElement((PartitionElement)containerPartitionElement.getContainedItem());
		
	
	}


	/**
    * This constructor give access to required stuff only (not container if any)
    */
	public VariableHLAPI(
		 VariableDeclHLAPI variableDecl
	){//BEGIN CONSTRUCTOR BODY
		TermsFactory fact = TermsFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createVariable();}
	
 		
 		if(variableDecl!=null)
			item.setVariableDecl((VariableDecl)variableDecl.getContainedItem());
		
	
	}


	
	/**
    * This constructor give access to required stuff only (and container)
    */
	public VariableHLAPI(
		 VariableDeclHLAPI variableDecl
	
		, OperatorHLAPI containerOperator
	){//BEGIN CONSTRUCTOR BODY
		TermsFactory fact = TermsFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createVariable();}
	
 		
 		if(variableDecl!=null)
			item.setVariableDecl((VariableDecl)variableDecl.getContainedItem());
		
	
 		
 		if(containerOperator!=null)
			item.setContainerOperator((Operator)containerOperator.getContainedItem());
		
	
	}
	
	
	/**
    * This constructor give access to required stuff only (and container)
    */
	public VariableHLAPI(
		 VariableDeclHLAPI variableDecl
	
		, NamedOperatorHLAPI containerNamedOperator
	){//BEGIN CONSTRUCTOR BODY
		TermsFactory fact = TermsFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createVariable();}
	
 		
 		if(variableDecl!=null)
			item.setVariableDecl((VariableDecl)variableDecl.getContainedItem());
		
	
 		
 		if(containerNamedOperator!=null)
			item.setContainerNamedOperator((NamedOperator)containerNamedOperator.getContainedItem());
		
	
	}
	
	
	/**
    * This constructor give access to required stuff only (and container)
    */
	public VariableHLAPI(
		 VariableDeclHLAPI variableDecl
	
		, HLMarkingHLAPI containerHLMarking
	){//BEGIN CONSTRUCTOR BODY
		TermsFactory fact = TermsFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createVariable();}
	
 		
 		if(variableDecl!=null)
			item.setVariableDecl((VariableDecl)variableDecl.getContainedItem());
		
	
 		
 		if(containerHLMarking!=null)
			item.setContainerHLMarking((HLMarking)containerHLMarking.getContainedItem());
		
	
	}
	
	
	/**
    * This constructor give access to required stuff only (and container)
    */
	public VariableHLAPI(
		 VariableDeclHLAPI variableDecl
	
		, ConditionHLAPI containerCondition
	){//BEGIN CONSTRUCTOR BODY
		TermsFactory fact = TermsFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createVariable();}
	
 		
 		if(variableDecl!=null)
			item.setVariableDecl((VariableDecl)variableDecl.getContainedItem());
		
	
 		
 		if(containerCondition!=null)
			item.setContainerCondition((Condition)containerCondition.getContainedItem());
		
	
	}
	
	
	/**
    * This constructor give access to required stuff only (and container)
    */
	public VariableHLAPI(
		 VariableDeclHLAPI variableDecl
	
		, HLAnnotationHLAPI containerHLAnnotation
	){//BEGIN CONSTRUCTOR BODY
		TermsFactory fact = TermsFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createVariable();}
	
 		
 		if(variableDecl!=null)
			item.setVariableDecl((VariableDecl)variableDecl.getContainedItem());
		
	
 		
 		if(containerHLAnnotation!=null)
			item.setContainerHLAnnotation((HLAnnotation)containerHLAnnotation.getContainedItem());
		
	
	}
	
	
	/**
    * This constructor give access to required stuff only (and container)
    */
	public VariableHLAPI(
		 VariableDeclHLAPI variableDecl
	
		, PartitionElementHLAPI containerPartitionElement
	){//BEGIN CONSTRUCTOR BODY
		TermsFactory fact = TermsFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createVariable();}
	
 		
 		if(variableDecl!=null)
			item.setVariableDecl((VariableDecl)variableDecl.getContainedItem());
		
	
 		
 		if(containerPartitionElement!=null)
			item.setContainerPartitionElement((PartitionElement)containerPartitionElement.getContainedItem());
		
	
	}
	

	/**
	 * This constructor encapsulate a low level API object in HLAPI.
	 */
	public VariableHLAPI(Variable lowLevelAPI){
		item = lowLevelAPI;
	}

	// access to low level API
	/**
	 * Return encapsulated object
	 */
	public Variable getContainedItem(){
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
	public VariableDecl getVariableDecl(){
		return item.getVariableDecl();
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
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.terms.impl.MultisetSortImpl.class)){
				return new fr.lip6.move.pnml.hlpn.terms.hlapi.MultisetSortHLAPI((fr.lip6.move.pnml.hlpn.terms.MultisetSort)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.terms.impl.ProductSortImpl.class)){
				return new fr.lip6.move.pnml.hlpn.terms.hlapi.ProductSortHLAPI((fr.lip6.move.pnml.hlpn.terms.ProductSort)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.terms.impl.UserSortImpl.class)){
				return new fr.lip6.move.pnml.hlpn.terms.hlapi.UserSortHLAPI((fr.lip6.move.pnml.hlpn.terms.UserSort)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.arbitrarydeclarations.impl.AnySortImpl.class)){
				return new fr.lip6.move.pnml.hlpn.arbitrarydeclarations.hlapi.AnySortHLAPI((fr.lip6.move.pnml.hlpn.arbitrarydeclarations.AnySort)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.booleans.impl.BoolImpl.class)){
				return new fr.lip6.move.pnml.hlpn.booleans.hlapi.BoolHLAPI((fr.lip6.move.pnml.hlpn.booleans.Bool)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.cyclicEnumerations.impl.CyclicEnumerationImpl.class)){
				return new fr.lip6.move.pnml.hlpn.cyclicEnumerations.hlapi.CyclicEnumerationHLAPI((fr.lip6.move.pnml.hlpn.cyclicEnumerations.CyclicEnumeration)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.dots.impl.DotImpl.class)){
				return new fr.lip6.move.pnml.hlpn.dots.hlapi.DotHLAPI((fr.lip6.move.pnml.hlpn.dots.Dot)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.finiteEnumerations.impl.FiniteEnumerationImpl.class)){
				return new fr.lip6.move.pnml.hlpn.finiteEnumerations.hlapi.FiniteEnumerationHLAPI((fr.lip6.move.pnml.hlpn.finiteEnumerations.FiniteEnumeration)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.finiteIntRanges.impl.FiniteIntRangeImpl.class)){
				return new fr.lip6.move.pnml.hlpn.finiteIntRanges.hlapi.FiniteIntRangeHLAPI((fr.lip6.move.pnml.hlpn.finiteIntRanges.FiniteIntRange)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.integers.impl.NaturalImpl.class)){
				return new fr.lip6.move.pnml.hlpn.integers.hlapi.NaturalHLAPI((fr.lip6.move.pnml.hlpn.integers.Natural)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.integers.impl.PositiveImpl.class)){
				return new fr.lip6.move.pnml.hlpn.integers.hlapi.PositiveHLAPI((fr.lip6.move.pnml.hlpn.integers.Positive)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.integers.impl.HLIntegerImpl.class)){
				return new fr.lip6.move.pnml.hlpn.integers.hlapi.HLIntegerHLAPI((fr.lip6.move.pnml.hlpn.integers.HLInteger)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.lists.impl.HLPNListImpl.class)){
				return new fr.lip6.move.pnml.hlpn.lists.hlapi.HLPNListHLAPI((fr.lip6.move.pnml.hlpn.lists.HLPNList)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.strings.impl.HLPNStringImpl.class)){
				return new fr.lip6.move.pnml.hlpn.strings.hlapi.HLPNStringHLAPI((fr.lip6.move.pnml.hlpn.strings.HLPNString)object);
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
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.terms.impl.TupleImpl.class)){
				return new fr.lip6.move.pnml.hlpn.terms.hlapi.TupleHLAPI((fr.lip6.move.pnml.hlpn.terms.Tuple)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.terms.impl.UserOperatorImpl.class)){
				return new fr.lip6.move.pnml.hlpn.terms.hlapi.UserOperatorHLAPI((fr.lip6.move.pnml.hlpn.terms.UserOperator)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.booleans.impl.EqualityImpl.class)){
				return new fr.lip6.move.pnml.hlpn.booleans.hlapi.EqualityHLAPI((fr.lip6.move.pnml.hlpn.booleans.Equality)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.booleans.impl.InequalityImpl.class)){
				return new fr.lip6.move.pnml.hlpn.booleans.hlapi.InequalityHLAPI((fr.lip6.move.pnml.hlpn.booleans.Inequality)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.booleans.impl.BooleanConstantImpl.class)){
				return new fr.lip6.move.pnml.hlpn.booleans.hlapi.BooleanConstantHLAPI((fr.lip6.move.pnml.hlpn.booleans.BooleanConstant)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.booleans.impl.OrImpl.class)){
				return new fr.lip6.move.pnml.hlpn.booleans.hlapi.OrHLAPI((fr.lip6.move.pnml.hlpn.booleans.Or)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.booleans.impl.AndImpl.class)){
				return new fr.lip6.move.pnml.hlpn.booleans.hlapi.AndHLAPI((fr.lip6.move.pnml.hlpn.booleans.And)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.booleans.impl.ImplyImpl.class)){
				return new fr.lip6.move.pnml.hlpn.booleans.hlapi.ImplyHLAPI((fr.lip6.move.pnml.hlpn.booleans.Imply)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.booleans.impl.NotImpl.class)){
				return new fr.lip6.move.pnml.hlpn.booleans.hlapi.NotHLAPI((fr.lip6.move.pnml.hlpn.booleans.Not)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.cyclicEnumerations.impl.SuccessorImpl.class)){
				return new fr.lip6.move.pnml.hlpn.cyclicEnumerations.hlapi.SuccessorHLAPI((fr.lip6.move.pnml.hlpn.cyclicEnumerations.Successor)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.cyclicEnumerations.impl.PredecessorImpl.class)){
				return new fr.lip6.move.pnml.hlpn.cyclicEnumerations.hlapi.PredecessorHLAPI((fr.lip6.move.pnml.hlpn.cyclicEnumerations.Predecessor)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.dots.impl.DotConstantImpl.class)){
				return new fr.lip6.move.pnml.hlpn.dots.hlapi.DotConstantHLAPI((fr.lip6.move.pnml.hlpn.dots.DotConstant)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.finiteIntRanges.impl.FiniteIntRangeConstantImpl.class)){
				return new fr.lip6.move.pnml.hlpn.finiteIntRanges.hlapi.FiniteIntRangeConstantHLAPI((fr.lip6.move.pnml.hlpn.finiteIntRanges.FiniteIntRangeConstant)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.finiteIntRanges.impl.LessThanImpl.class)){
				return new fr.lip6.move.pnml.hlpn.finiteIntRanges.hlapi.LessThanHLAPI((fr.lip6.move.pnml.hlpn.finiteIntRanges.LessThan)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.finiteIntRanges.impl.GreaterThanImpl.class)){
				return new fr.lip6.move.pnml.hlpn.finiteIntRanges.hlapi.GreaterThanHLAPI((fr.lip6.move.pnml.hlpn.finiteIntRanges.GreaterThan)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.finiteIntRanges.impl.LessThanOrEqualImpl.class)){
				return new fr.lip6.move.pnml.hlpn.finiteIntRanges.hlapi.LessThanOrEqualHLAPI((fr.lip6.move.pnml.hlpn.finiteIntRanges.LessThanOrEqual)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.finiteIntRanges.impl.GreaterThanOrEqualImpl.class)){
				return new fr.lip6.move.pnml.hlpn.finiteIntRanges.hlapi.GreaterThanOrEqualHLAPI((fr.lip6.move.pnml.hlpn.finiteIntRanges.GreaterThanOrEqual)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.integers.impl.NumberConstantImpl.class)){
				return new fr.lip6.move.pnml.hlpn.integers.hlapi.NumberConstantHLAPI((fr.lip6.move.pnml.hlpn.integers.NumberConstant)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.integers.impl.AdditionImpl.class)){
				return new fr.lip6.move.pnml.hlpn.integers.hlapi.AdditionHLAPI((fr.lip6.move.pnml.hlpn.integers.Addition)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.integers.impl.SubtractionImpl.class)){
				return new fr.lip6.move.pnml.hlpn.integers.hlapi.SubtractionHLAPI((fr.lip6.move.pnml.hlpn.integers.Subtraction)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.integers.impl.MultiplicationImpl.class)){
				return new fr.lip6.move.pnml.hlpn.integers.hlapi.MultiplicationHLAPI((fr.lip6.move.pnml.hlpn.integers.Multiplication)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.integers.impl.DivisionImpl.class)){
				return new fr.lip6.move.pnml.hlpn.integers.hlapi.DivisionHLAPI((fr.lip6.move.pnml.hlpn.integers.Division)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.integers.impl.ModuloImpl.class)){
				return new fr.lip6.move.pnml.hlpn.integers.hlapi.ModuloHLAPI((fr.lip6.move.pnml.hlpn.integers.Modulo)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.integers.impl.GreaterThanImpl.class)){
				return new fr.lip6.move.pnml.hlpn.integers.hlapi.GreaterThanHLAPI((fr.lip6.move.pnml.hlpn.integers.GreaterThan)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.integers.impl.GreaterThanOrEqualImpl.class)){
				return new fr.lip6.move.pnml.hlpn.integers.hlapi.GreaterThanOrEqualHLAPI((fr.lip6.move.pnml.hlpn.integers.GreaterThanOrEqual)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.integers.impl.LessThanImpl.class)){
				return new fr.lip6.move.pnml.hlpn.integers.hlapi.LessThanHLAPI((fr.lip6.move.pnml.hlpn.integers.LessThan)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.integers.impl.LessThanOrEqualImpl.class)){
				return new fr.lip6.move.pnml.hlpn.integers.hlapi.LessThanOrEqualHLAPI((fr.lip6.move.pnml.hlpn.integers.LessThanOrEqual)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.lists.impl.EmptyListImpl.class)){
				return new fr.lip6.move.pnml.hlpn.lists.hlapi.EmptyListHLAPI((fr.lip6.move.pnml.hlpn.lists.EmptyList)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.lists.impl.AppendImpl.class)){
				return new fr.lip6.move.pnml.hlpn.lists.hlapi.AppendHLAPI((fr.lip6.move.pnml.hlpn.lists.Append)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.lists.impl.ConcatenationImpl.class)){
				return new fr.lip6.move.pnml.hlpn.lists.hlapi.ConcatenationHLAPI((fr.lip6.move.pnml.hlpn.lists.Concatenation)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.lists.impl.LengthImpl.class)){
				return new fr.lip6.move.pnml.hlpn.lists.hlapi.LengthHLAPI((fr.lip6.move.pnml.hlpn.lists.Length)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.lists.impl.MakeListImpl.class)){
				return new fr.lip6.move.pnml.hlpn.lists.hlapi.MakeListHLAPI((fr.lip6.move.pnml.hlpn.lists.MakeList)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.lists.impl.MemberAtIndexImpl.class)){
				return new fr.lip6.move.pnml.hlpn.lists.hlapi.MemberAtIndexHLAPI((fr.lip6.move.pnml.hlpn.lists.MemberAtIndex)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.lists.impl.SublistImpl.class)){
				return new fr.lip6.move.pnml.hlpn.lists.hlapi.SublistHLAPI((fr.lip6.move.pnml.hlpn.lists.Sublist)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.multisets.impl.CardinalityImpl.class)){
				return new fr.lip6.move.pnml.hlpn.multisets.hlapi.CardinalityHLAPI((fr.lip6.move.pnml.hlpn.multisets.Cardinality)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.multisets.impl.ContainsImpl.class)){
				return new fr.lip6.move.pnml.hlpn.multisets.hlapi.ContainsHLAPI((fr.lip6.move.pnml.hlpn.multisets.Contains)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.multisets.impl.CardinalityOfImpl.class)){
				return new fr.lip6.move.pnml.hlpn.multisets.hlapi.CardinalityOfHLAPI((fr.lip6.move.pnml.hlpn.multisets.CardinalityOf)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.multisets.impl.AddImpl.class)){
				return new fr.lip6.move.pnml.hlpn.multisets.hlapi.AddHLAPI((fr.lip6.move.pnml.hlpn.multisets.Add)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.multisets.impl.AllImpl.class)){
				return new fr.lip6.move.pnml.hlpn.multisets.hlapi.AllHLAPI((fr.lip6.move.pnml.hlpn.multisets.All)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.multisets.impl.EmptyImpl.class)){
				return new fr.lip6.move.pnml.hlpn.multisets.hlapi.EmptyHLAPI((fr.lip6.move.pnml.hlpn.multisets.Empty)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.multisets.impl.NumberOfImpl.class)){
				return new fr.lip6.move.pnml.hlpn.multisets.hlapi.NumberOfHLAPI((fr.lip6.move.pnml.hlpn.multisets.NumberOf)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.multisets.impl.SubtractImpl.class)){
				return new fr.lip6.move.pnml.hlpn.multisets.hlapi.SubtractHLAPI((fr.lip6.move.pnml.hlpn.multisets.Subtract)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.multisets.impl.ScalarProductImpl.class)){
				return new fr.lip6.move.pnml.hlpn.multisets.hlapi.ScalarProductHLAPI((fr.lip6.move.pnml.hlpn.multisets.ScalarProduct)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.partitions.impl.GreaterThanImpl.class)){
				return new fr.lip6.move.pnml.hlpn.partitions.hlapi.GreaterThanHLAPI((fr.lip6.move.pnml.hlpn.partitions.GreaterThan)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.partitions.impl.PartitionElementOfImpl.class)){
				return new fr.lip6.move.pnml.hlpn.partitions.hlapi.PartitionElementOfHLAPI((fr.lip6.move.pnml.hlpn.partitions.PartitionElementOf)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.partitions.impl.LessThanImpl.class)){
				return new fr.lip6.move.pnml.hlpn.partitions.hlapi.LessThanHLAPI((fr.lip6.move.pnml.hlpn.partitions.LessThan)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.strings.impl.StringConstantImpl.class)){
				return new fr.lip6.move.pnml.hlpn.strings.hlapi.StringConstantHLAPI((fr.lip6.move.pnml.hlpn.strings.StringConstant)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.strings.impl.AppendImpl.class)){
				return new fr.lip6.move.pnml.hlpn.strings.hlapi.AppendHLAPI((fr.lip6.move.pnml.hlpn.strings.Append)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.strings.impl.ConcatenationImpl.class)){
				return new fr.lip6.move.pnml.hlpn.strings.hlapi.ConcatenationHLAPI((fr.lip6.move.pnml.hlpn.strings.Concatenation)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.strings.impl.GreaterThanImpl.class)){
				return new fr.lip6.move.pnml.hlpn.strings.hlapi.GreaterThanHLAPI((fr.lip6.move.pnml.hlpn.strings.GreaterThan)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.strings.impl.GreaterThanOrEqualImpl.class)){
				return new fr.lip6.move.pnml.hlpn.strings.hlapi.GreaterThanOrEqualHLAPI((fr.lip6.move.pnml.hlpn.strings.GreaterThanOrEqual)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.strings.impl.LessThanImpl.class)){
				return new fr.lip6.move.pnml.hlpn.strings.hlapi.LessThanHLAPI((fr.lip6.move.pnml.hlpn.strings.LessThan)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.strings.impl.LessThanOrEqualImpl.class)){
				return new fr.lip6.move.pnml.hlpn.strings.hlapi.LessThanOrEqualHLAPI((fr.lip6.move.pnml.hlpn.strings.LessThanOrEqual)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.strings.impl.LengthImpl.class)){
				return new fr.lip6.move.pnml.hlpn.strings.hlapi.LengthHLAPI((fr.lip6.move.pnml.hlpn.strings.Length)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.hlpn.strings.impl.SubstringImpl.class)){
				return new fr.lip6.move.pnml.hlpn.strings.hlapi.SubstringHLAPI((fr.lip6.move.pnml.hlpn.strings.Substring)object);
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
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		
		public VariableDeclHLAPI getVariableDeclHLAPI(){
			if(item.getVariableDecl() == null) return null;
			return new VariableDeclHLAPI(item.getVariableDecl());
		}
		
	
	

	//Special getter for list of generics object, return only one object type.
	
	
	
	
	
	
	
	
	

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
	 * set VariableDecl
	 */
	public void setVariableDeclHLAPI(
	
	VariableDeclHLAPI elem){
	
	
 		if(elem!=null)
			item.setVariableDecl((VariableDecl)elem.getContainedItem());
	
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
	

	//equals method
	public boolean equals(VariableHLAPI item){
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