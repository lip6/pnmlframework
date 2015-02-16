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


public class DeclarationsHLAPI implements HLAPIClass{

	/**
	 * The contained LLAPI element.
	 */
	private Declarations item;

	/**
	 * this constructor allows you to set all 'settable' values
	 * excepted container.
	 */
	
	public DeclarationsHLAPI(){//BEGIN CONSTRUCTOR BODY
		TermsFactory fact = TermsFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createDeclarations();}
	
	}

	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	
	public DeclarationsHLAPI(
		 DeclarationHLAPI containerDeclaration
	){//BEGIN CONSTRUCTOR BODY
		TermsFactory fact = TermsFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createDeclarations();}
	
 		
 		if(containerDeclaration!=null)
			item.setContainerDeclaration((Declaration)containerDeclaration.getContainedItem());
		
	
	}



	

	/**
	 * This constructor encapsulate a low level API object in HLAPI.
	 */
	public DeclarationsHLAPI(Declarations lowLevelAPI){
		item = lowLevelAPI;
	}

	// access to low level API
	/**
	 * Return encapsulated object
	 */
	public Declarations getContainedItem(){
		return item;
	}

	//getters giving LLAPI object
	
	/**
	 * Return the encapsulate Low Level API object.
	 */
	public List<TermsDeclaration> getDeclaration(){
		return item.getDeclaration();
	}
	
	/**
	 * Return the encapsulate Low Level API object.
	 */
	public Declaration getContainerDeclaration(){
		return item.getContainerDeclaration();
	}
	

	//getters giving HLAPI object
	
	
	
		/**
		 * This accessor automatically encapsulate all elements of the selected sublist.
		 * WARNING : this can creates a lot of new object in memory.
		 */
		
			
		public java.util.List<TermsDeclarationHLAPI> getDeclarationHLAPI(){
			java.util.List<TermsDeclarationHLAPI> retour = new ArrayList<TermsDeclarationHLAPI>();
			for (TermsDeclaration elemnt : getDeclaration()) {
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.terms.impl.VariableDeclImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.terms.hlapi.VariableDeclHLAPI(
						(fr.lip6.move.pnml.hlpn.terms.VariableDecl)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.terms.impl.NamedSortImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.terms.hlapi.NamedSortHLAPI(
						(fr.lip6.move.pnml.hlpn.terms.NamedSort)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.terms.impl.NamedOperatorImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.terms.hlapi.NamedOperatorHLAPI(
						(fr.lip6.move.pnml.hlpn.terms.NamedOperator)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.arbitrarydeclarations.impl.ArbitrarySortImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.arbitrarydeclarations.hlapi.ArbitrarySortHLAPI(
						(fr.lip6.move.pnml.hlpn.arbitrarydeclarations.ArbitrarySort)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.arbitrarydeclarations.impl.ArbitraryOperatorImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.arbitrarydeclarations.hlapi.ArbitraryOperatorHLAPI(
						(fr.lip6.move.pnml.hlpn.arbitrarydeclarations.ArbitraryOperator)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.arbitrarydeclarations.impl.UnparsedImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.arbitrarydeclarations.hlapi.UnparsedHLAPI(
						(fr.lip6.move.pnml.hlpn.arbitrarydeclarations.Unparsed)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.finiteEnumerations.impl.FEConstantImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.finiteEnumerations.hlapi.FEConstantHLAPI(
						(fr.lip6.move.pnml.hlpn.finiteEnumerations.FEConstant)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.partitions.impl.PartitionImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.partitions.hlapi.PartitionHLAPI(
						(fr.lip6.move.pnml.hlpn.partitions.Partition)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.partitions.impl.PartitionElementImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.partitions.hlapi.PartitionElementHLAPI(
						(fr.lip6.move.pnml.hlpn.partitions.PartitionElement)elemnt
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
		
		public DeclarationHLAPI getContainerDeclarationHLAPI(){
			if(item.getContainerDeclaration() == null) return null;
			return new DeclarationHLAPI(item.getContainerDeclaration());
		}
		
	
	

	//Special getter for list of generics object, return only one object type.
	
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of VariableDeclHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.hlpn.terms.hlapi.VariableDeclHLAPI> getDeclaration_terms_VariableDeclHLAPI(){
			java.util.List<fr.lip6.move.pnml.hlpn.terms.hlapi.VariableDeclHLAPI> retour = new ArrayList<fr.lip6.move.pnml.hlpn.terms.hlapi.VariableDeclHLAPI>();
			for (TermsDeclaration elemnt : getDeclaration()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.terms.impl.VariableDeclImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.terms.hlapi.VariableDeclHLAPI(
						(fr.lip6.move.pnml.hlpn.terms.VariableDecl)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of NamedSortHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.hlpn.terms.hlapi.NamedSortHLAPI> getDeclaration_terms_NamedSortHLAPI(){
			java.util.List<fr.lip6.move.pnml.hlpn.terms.hlapi.NamedSortHLAPI> retour = new ArrayList<fr.lip6.move.pnml.hlpn.terms.hlapi.NamedSortHLAPI>();
			for (TermsDeclaration elemnt : getDeclaration()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.terms.impl.NamedSortImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.terms.hlapi.NamedSortHLAPI(
						(fr.lip6.move.pnml.hlpn.terms.NamedSort)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of NamedOperatorHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.hlpn.terms.hlapi.NamedOperatorHLAPI> getDeclaration_terms_NamedOperatorHLAPI(){
			java.util.List<fr.lip6.move.pnml.hlpn.terms.hlapi.NamedOperatorHLAPI> retour = new ArrayList<fr.lip6.move.pnml.hlpn.terms.hlapi.NamedOperatorHLAPI>();
			for (TermsDeclaration elemnt : getDeclaration()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.terms.impl.NamedOperatorImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.terms.hlapi.NamedOperatorHLAPI(
						(fr.lip6.move.pnml.hlpn.terms.NamedOperator)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of ArbitrarySortHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.hlpn.arbitrarydeclarations.hlapi.ArbitrarySortHLAPI> getDeclaration_arbitrarydeclarations_ArbitrarySortHLAPI(){
			java.util.List<fr.lip6.move.pnml.hlpn.arbitrarydeclarations.hlapi.ArbitrarySortHLAPI> retour = new ArrayList<fr.lip6.move.pnml.hlpn.arbitrarydeclarations.hlapi.ArbitrarySortHLAPI>();
			for (TermsDeclaration elemnt : getDeclaration()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.arbitrarydeclarations.impl.ArbitrarySortImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.arbitrarydeclarations.hlapi.ArbitrarySortHLAPI(
						(fr.lip6.move.pnml.hlpn.arbitrarydeclarations.ArbitrarySort)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of ArbitraryOperatorHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.hlpn.arbitrarydeclarations.hlapi.ArbitraryOperatorHLAPI> getDeclaration_arbitrarydeclarations_ArbitraryOperatorHLAPI(){
			java.util.List<fr.lip6.move.pnml.hlpn.arbitrarydeclarations.hlapi.ArbitraryOperatorHLAPI> retour = new ArrayList<fr.lip6.move.pnml.hlpn.arbitrarydeclarations.hlapi.ArbitraryOperatorHLAPI>();
			for (TermsDeclaration elemnt : getDeclaration()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.arbitrarydeclarations.impl.ArbitraryOperatorImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.arbitrarydeclarations.hlapi.ArbitraryOperatorHLAPI(
						(fr.lip6.move.pnml.hlpn.arbitrarydeclarations.ArbitraryOperator)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of UnparsedHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.hlpn.arbitrarydeclarations.hlapi.UnparsedHLAPI> getDeclaration_arbitrarydeclarations_UnparsedHLAPI(){
			java.util.List<fr.lip6.move.pnml.hlpn.arbitrarydeclarations.hlapi.UnparsedHLAPI> retour = new ArrayList<fr.lip6.move.pnml.hlpn.arbitrarydeclarations.hlapi.UnparsedHLAPI>();
			for (TermsDeclaration elemnt : getDeclaration()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.arbitrarydeclarations.impl.UnparsedImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.arbitrarydeclarations.hlapi.UnparsedHLAPI(
						(fr.lip6.move.pnml.hlpn.arbitrarydeclarations.Unparsed)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of FEConstantHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.hlpn.finiteEnumerations.hlapi.FEConstantHLAPI> getDeclaration_finiteEnumerations_FEConstantHLAPI(){
			java.util.List<fr.lip6.move.pnml.hlpn.finiteEnumerations.hlapi.FEConstantHLAPI> retour = new ArrayList<fr.lip6.move.pnml.hlpn.finiteEnumerations.hlapi.FEConstantHLAPI>();
			for (TermsDeclaration elemnt : getDeclaration()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.finiteEnumerations.impl.FEConstantImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.finiteEnumerations.hlapi.FEConstantHLAPI(
						(fr.lip6.move.pnml.hlpn.finiteEnumerations.FEConstant)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of PartitionHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.hlpn.partitions.hlapi.PartitionHLAPI> getDeclaration_partitions_PartitionHLAPI(){
			java.util.List<fr.lip6.move.pnml.hlpn.partitions.hlapi.PartitionHLAPI> retour = new ArrayList<fr.lip6.move.pnml.hlpn.partitions.hlapi.PartitionHLAPI>();
			for (TermsDeclaration elemnt : getDeclaration()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.partitions.impl.PartitionImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.partitions.hlapi.PartitionHLAPI(
						(fr.lip6.move.pnml.hlpn.partitions.Partition)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of PartitionElementHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.hlpn.partitions.hlapi.PartitionElementHLAPI> getDeclaration_partitions_PartitionElementHLAPI(){
			java.util.List<fr.lip6.move.pnml.hlpn.partitions.hlapi.PartitionElementHLAPI> retour = new ArrayList<fr.lip6.move.pnml.hlpn.partitions.hlapi.PartitionElementHLAPI>();
			for (TermsDeclaration elemnt : getDeclaration()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.partitions.impl.PartitionElementImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.partitions.hlapi.PartitionElementHLAPI(
						(fr.lip6.move.pnml.hlpn.partitions.PartitionElement)elemnt
						));
				}
			}
			return retour;
		}
		
	
	
	

	//setters (including container setter if aviable)
	
	
	/**
	 * set ContainerDeclaration
	 */
	public void setContainerDeclarationHLAPI(
	
	DeclarationHLAPI elem){
	
	
 		if(elem!=null)
			item.setContainerDeclaration((Declaration)elem.getContainedItem());
	
	}
	

	//setters/remover for lists.
	
	
	public void addDeclarationHLAPI(TermsDeclarationHLAPI unit){
	
		item.getDeclaration().add((TermsDeclaration)unit.getContainedItem());
	}

	public void removeDeclarationHLAPI(TermsDeclarationHLAPI unit){
		item.getDeclaration().remove((TermsDeclaration)unit.getContainedItem());
	}
	

	//equals method
	public boolean equals(DeclarationsHLAPI item){
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