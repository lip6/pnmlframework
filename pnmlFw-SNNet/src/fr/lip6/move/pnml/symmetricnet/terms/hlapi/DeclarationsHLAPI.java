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
 * $Id ggiffo, Tue Dec 23 11:30:47 CET 2014$
 */
package fr.lip6.move.pnml.symmetricnet.terms.hlapi;

import fr.lip6.move.pnml.symmetricnet.booleans.And;
import fr.lip6.move.pnml.symmetricnet.booleans.Bool;
import fr.lip6.move.pnml.symmetricnet.booleans.BooleanConstant;
import fr.lip6.move.pnml.symmetricnet.booleans.Equality;
import fr.lip6.move.pnml.symmetricnet.booleans.Imply;
import fr.lip6.move.pnml.symmetricnet.booleans.Inequality;
import fr.lip6.move.pnml.symmetricnet.booleans.Not;
import fr.lip6.move.pnml.symmetricnet.booleans.Or;

import fr.lip6.move.pnml.symmetricnet.booleans.impl.BooleansFactoryImpl;

import fr.lip6.move.pnml.symmetricnet.cyclicEnumerations.CyclicEnumeration;
import fr.lip6.move.pnml.symmetricnet.cyclicEnumerations.Predecessor;
import fr.lip6.move.pnml.symmetricnet.cyclicEnumerations.Successor;

import fr.lip6.move.pnml.symmetricnet.cyclicEnumerations.impl.CyclicEnumerationsFactoryImpl;

import fr.lip6.move.pnml.symmetricnet.dots.Dot;
import fr.lip6.move.pnml.symmetricnet.dots.DotConstant;

import fr.lip6.move.pnml.symmetricnet.dots.impl.DotsFactoryImpl;

import fr.lip6.move.pnml.symmetricnet.finiteEnumerations.FEConstant;
import fr.lip6.move.pnml.symmetricnet.finiteEnumerations.FiniteEnumeration;

import fr.lip6.move.pnml.symmetricnet.finiteEnumerations.impl.FiniteEnumerationsFactoryImpl;

import fr.lip6.move.pnml.symmetricnet.finiteIntRanges.FiniteIntRange;
import fr.lip6.move.pnml.symmetricnet.finiteIntRanges.FiniteIntRangeConstant;
import fr.lip6.move.pnml.symmetricnet.finiteIntRanges.GreaterThan;
import fr.lip6.move.pnml.symmetricnet.finiteIntRanges.GreaterThanOrEqual;
import fr.lip6.move.pnml.symmetricnet.finiteIntRanges.LessThan;
import fr.lip6.move.pnml.symmetricnet.finiteIntRanges.LessThanOrEqual;

import fr.lip6.move.pnml.symmetricnet.finiteIntRanges.impl.FiniteIntRangesFactoryImpl;

import fr.lip6.move.pnml.symmetricnet.hlcorestructure.Annotation;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.AnnotationGraphics;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.AnyObject;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.Arc;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.ArcGraphics;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.CSS2Color;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.CSS2FontFamily;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.CSS2FontSize;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.CSS2FontStyle;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.CSS2FontWeight;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.Condition;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.Declaration;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.Dimension;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.Fill;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.Font;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.FontAlign;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.FontDecoration;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.Gradient;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.HLAnnotation;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.HLMarking;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.Label;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.Line;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.LineShape;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.LineStyle;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.Name;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.Node;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.NodeGraphics;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.Offset;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.PNType;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.Page;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.PetriNet;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.PetriNetDoc;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.Place;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.PlaceNode;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.PnObject;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.Position;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.RefPlace;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.RefTransition;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.ToolInfo;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.Transition;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.TransitionNode;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.Type;

import fr.lip6.move.pnml.symmetricnet.hlcorestructure.impl.HlcorestructureFactoryImpl;

import fr.lip6.move.pnml.symmetricnet.integers.Addition;
import fr.lip6.move.pnml.symmetricnet.integers.Division;
import fr.lip6.move.pnml.symmetricnet.integers.HLInteger;
import fr.lip6.move.pnml.symmetricnet.integers.HLPNNumber;
import fr.lip6.move.pnml.symmetricnet.integers.Modulo;
import fr.lip6.move.pnml.symmetricnet.integers.Multiplication;
import fr.lip6.move.pnml.symmetricnet.integers.Natural;
import fr.lip6.move.pnml.symmetricnet.integers.NumberConstant;
import fr.lip6.move.pnml.symmetricnet.integers.Positive;
import fr.lip6.move.pnml.symmetricnet.integers.Subtraction;

import fr.lip6.move.pnml.symmetricnet.integers.impl.IntegersFactoryImpl;

import fr.lip6.move.pnml.symmetricnet.multisets.Add;
import fr.lip6.move.pnml.symmetricnet.multisets.All;
import fr.lip6.move.pnml.symmetricnet.multisets.Cardinality;
import fr.lip6.move.pnml.symmetricnet.multisets.CardinalityOf;
import fr.lip6.move.pnml.symmetricnet.multisets.Contains;
import fr.lip6.move.pnml.symmetricnet.multisets.Empty;
import fr.lip6.move.pnml.symmetricnet.multisets.NumberOf;
import fr.lip6.move.pnml.symmetricnet.multisets.ScalarProduct;
import fr.lip6.move.pnml.symmetricnet.multisets.Subtract;

import fr.lip6.move.pnml.symmetricnet.multisets.impl.MultisetsFactoryImpl;

import fr.lip6.move.pnml.symmetricnet.partitions.Partition;
import fr.lip6.move.pnml.symmetricnet.partitions.PartitionElement;
import fr.lip6.move.pnml.symmetricnet.partitions.PartitionElementOf;

import fr.lip6.move.pnml.symmetricnet.partitions.impl.PartitionsFactoryImpl;

import fr.lip6.move.pnml.symmetricnet.terms.Declarations;
import fr.lip6.move.pnml.symmetricnet.terms.MultisetSort;
import fr.lip6.move.pnml.symmetricnet.terms.NamedOperator;
import fr.lip6.move.pnml.symmetricnet.terms.NamedSort;
import fr.lip6.move.pnml.symmetricnet.terms.Operator;
import fr.lip6.move.pnml.symmetricnet.terms.ProductSort;
import fr.lip6.move.pnml.symmetricnet.terms.Sort;
import fr.lip6.move.pnml.symmetricnet.terms.Term;
import fr.lip6.move.pnml.symmetricnet.terms.TermsDeclaration;
import fr.lip6.move.pnml.symmetricnet.terms.VariableDecl;

import fr.lip6.move.pnml.symmetricnet.terms.impl.TermsFactoryImpl;

import java.math.BigDecimal;

import java.net.URI;

import java.util.List;

import  fr.lip6.move.pnml.framework.hlapi.*;
import fr.lip6.move.pnml.symmetricnet.booleans.hlapi.*;
import fr.lip6.move.pnml.symmetricnet.cyclicEnumerations.hlapi.*;
import fr.lip6.move.pnml.symmetricnet.dots.hlapi.*;
import fr.lip6.move.pnml.symmetricnet.finiteEnumerations.hlapi.*;
import fr.lip6.move.pnml.symmetricnet.finiteIntRanges.hlapi.*;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.hlapi.*;
import fr.lip6.move.pnml.symmetricnet.integers.hlapi.*;
import fr.lip6.move.pnml.symmetricnet.multisets.hlapi.*;
import fr.lip6.move.pnml.symmetricnet.partitions.hlapi.*;
import fr.lip6.move.pnml.symmetricnet.terms.hlapi.*;

import java.util.ArrayList;
import java.util.List;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import org.apache.axiom.om.*;
import fr.lip6.move.pnml.framework.utils.IdRefLinker;
import org.eclipse.emf.common.util.DiagnosticChain;
import fr.lip6.move.pnml.symmetricnet.terms.*;
import fr.lip6.move.pnml.symmetricnet.terms.impl.*;
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
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.symmetricnet.terms.impl.VariableDeclImpl.class)){
					retour.add(new fr.lip6.move.pnml.symmetricnet.terms.hlapi.VariableDeclHLAPI(
						(fr.lip6.move.pnml.symmetricnet.terms.VariableDecl)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.symmetricnet.terms.impl.NamedSortImpl.class)){
					retour.add(new fr.lip6.move.pnml.symmetricnet.terms.hlapi.NamedSortHLAPI(
						(fr.lip6.move.pnml.symmetricnet.terms.NamedSort)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.symmetricnet.terms.impl.NamedOperatorImpl.class)){
					retour.add(new fr.lip6.move.pnml.symmetricnet.terms.hlapi.NamedOperatorHLAPI(
						(fr.lip6.move.pnml.symmetricnet.terms.NamedOperator)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.symmetricnet.finiteEnumerations.impl.FEConstantImpl.class)){
					retour.add(new fr.lip6.move.pnml.symmetricnet.finiteEnumerations.hlapi.FEConstantHLAPI(
						(fr.lip6.move.pnml.symmetricnet.finiteEnumerations.FEConstant)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.symmetricnet.partitions.impl.PartitionImpl.class)){
					retour.add(new fr.lip6.move.pnml.symmetricnet.partitions.hlapi.PartitionHLAPI(
						(fr.lip6.move.pnml.symmetricnet.partitions.Partition)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.symmetricnet.partitions.impl.PartitionElementImpl.class)){
					retour.add(new fr.lip6.move.pnml.symmetricnet.partitions.hlapi.PartitionElementHLAPI(
						(fr.lip6.move.pnml.symmetricnet.partitions.PartitionElement)elemnt
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
		public java.util.List<fr.lip6.move.pnml.symmetricnet.terms.hlapi.VariableDeclHLAPI> getDeclaration_terms_VariableDeclHLAPI(){
			java.util.List<fr.lip6.move.pnml.symmetricnet.terms.hlapi.VariableDeclHLAPI> retour = new ArrayList<fr.lip6.move.pnml.symmetricnet.terms.hlapi.VariableDeclHLAPI>();
			for (TermsDeclaration elemnt : getDeclaration()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.symmetricnet.terms.impl.VariableDeclImpl.class)){
					retour.add(new fr.lip6.move.pnml.symmetricnet.terms.hlapi.VariableDeclHLAPI(
						(fr.lip6.move.pnml.symmetricnet.terms.VariableDecl)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of NamedSortHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.symmetricnet.terms.hlapi.NamedSortHLAPI> getDeclaration_terms_NamedSortHLAPI(){
			java.util.List<fr.lip6.move.pnml.symmetricnet.terms.hlapi.NamedSortHLAPI> retour = new ArrayList<fr.lip6.move.pnml.symmetricnet.terms.hlapi.NamedSortHLAPI>();
			for (TermsDeclaration elemnt : getDeclaration()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.symmetricnet.terms.impl.NamedSortImpl.class)){
					retour.add(new fr.lip6.move.pnml.symmetricnet.terms.hlapi.NamedSortHLAPI(
						(fr.lip6.move.pnml.symmetricnet.terms.NamedSort)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of NamedOperatorHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.symmetricnet.terms.hlapi.NamedOperatorHLAPI> getDeclaration_terms_NamedOperatorHLAPI(){
			java.util.List<fr.lip6.move.pnml.symmetricnet.terms.hlapi.NamedOperatorHLAPI> retour = new ArrayList<fr.lip6.move.pnml.symmetricnet.terms.hlapi.NamedOperatorHLAPI>();
			for (TermsDeclaration elemnt : getDeclaration()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.symmetricnet.terms.impl.NamedOperatorImpl.class)){
					retour.add(new fr.lip6.move.pnml.symmetricnet.terms.hlapi.NamedOperatorHLAPI(
						(fr.lip6.move.pnml.symmetricnet.terms.NamedOperator)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of FEConstantHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.symmetricnet.finiteEnumerations.hlapi.FEConstantHLAPI> getDeclaration_finiteEnumerations_FEConstantHLAPI(){
			java.util.List<fr.lip6.move.pnml.symmetricnet.finiteEnumerations.hlapi.FEConstantHLAPI> retour = new ArrayList<fr.lip6.move.pnml.symmetricnet.finiteEnumerations.hlapi.FEConstantHLAPI>();
			for (TermsDeclaration elemnt : getDeclaration()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.symmetricnet.finiteEnumerations.impl.FEConstantImpl.class)){
					retour.add(new fr.lip6.move.pnml.symmetricnet.finiteEnumerations.hlapi.FEConstantHLAPI(
						(fr.lip6.move.pnml.symmetricnet.finiteEnumerations.FEConstant)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of PartitionHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.symmetricnet.partitions.hlapi.PartitionHLAPI> getDeclaration_partitions_PartitionHLAPI(){
			java.util.List<fr.lip6.move.pnml.symmetricnet.partitions.hlapi.PartitionHLAPI> retour = new ArrayList<fr.lip6.move.pnml.symmetricnet.partitions.hlapi.PartitionHLAPI>();
			for (TermsDeclaration elemnt : getDeclaration()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.symmetricnet.partitions.impl.PartitionImpl.class)){
					retour.add(new fr.lip6.move.pnml.symmetricnet.partitions.hlapi.PartitionHLAPI(
						(fr.lip6.move.pnml.symmetricnet.partitions.Partition)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of PartitionElementHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.symmetricnet.partitions.hlapi.PartitionElementHLAPI> getDeclaration_partitions_PartitionElementHLAPI(){
			java.util.List<fr.lip6.move.pnml.symmetricnet.partitions.hlapi.PartitionElementHLAPI> retour = new ArrayList<fr.lip6.move.pnml.symmetricnet.partitions.hlapi.PartitionElementHLAPI>();
			for (TermsDeclaration elemnt : getDeclaration()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.symmetricnet.partitions.impl.PartitionElementImpl.class)){
					retour.add(new fr.lip6.move.pnml.symmetricnet.partitions.hlapi.PartitionElementHLAPI(
						(fr.lip6.move.pnml.symmetricnet.partitions.PartitionElement)elemnt
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