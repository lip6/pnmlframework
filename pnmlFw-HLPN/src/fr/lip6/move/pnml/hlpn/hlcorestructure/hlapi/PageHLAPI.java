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
 * $Id ggiffo, Tue Dec 23 11:30:48 CET 2014$
 */
package fr.lip6.move.pnml.hlpn.hlcorestructure.hlapi;

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

import fr.lip6.move.pnml.hlpn.hlcorestructure.AnyObject;
import fr.lip6.move.pnml.hlpn.hlcorestructure.Condition;
import fr.lip6.move.pnml.hlpn.hlcorestructure.Declaration;
import fr.lip6.move.pnml.hlpn.hlcorestructure.HLAnnotation;
import fr.lip6.move.pnml.hlpn.hlcorestructure.HLMarking;
import fr.lip6.move.pnml.hlpn.hlcorestructure.Name;
import fr.lip6.move.pnml.hlpn.hlcorestructure.NodeGraphics;
import fr.lip6.move.pnml.hlpn.hlcorestructure.PNType;
import fr.lip6.move.pnml.hlpn.hlcorestructure.Page;
import fr.lip6.move.pnml.hlpn.hlcorestructure.PetriNet;
import fr.lip6.move.pnml.hlpn.hlcorestructure.PetriNetDoc;
import fr.lip6.move.pnml.hlpn.hlcorestructure.PnObject;
import fr.lip6.move.pnml.hlpn.hlcorestructure.ToolInfo;
import fr.lip6.move.pnml.hlpn.hlcorestructure.Type;

import fr.lip6.move.pnml.hlpn.hlcorestructure.impl.HlcorestructureFactoryImpl;

import fr.lip6.move.pnml.hlpn.integers.impl.IntegersFactoryImpl;

import fr.lip6.move.pnml.hlpn.lists.EmptyList;
import fr.lip6.move.pnml.hlpn.lists.HLPNList;
import fr.lip6.move.pnml.hlpn.lists.MakeList;

import fr.lip6.move.pnml.hlpn.lists.impl.ListsFactoryImpl;

import fr.lip6.move.pnml.hlpn.multisets.All;
import fr.lip6.move.pnml.hlpn.multisets.Empty;

import fr.lip6.move.pnml.hlpn.multisets.impl.MultisetsFactoryImpl;

import fr.lip6.move.pnml.hlpn.partitions.Partition;
import fr.lip6.move.pnml.hlpn.partitions.PartitionElement;

import fr.lip6.move.pnml.hlpn.partitions.impl.PartitionsFactoryImpl;

import fr.lip6.move.pnml.hlpn.strings.impl.StringsFactoryImpl;

import fr.lip6.move.pnml.hlpn.terms.Declarations;
import fr.lip6.move.pnml.hlpn.terms.MultisetSort;
import fr.lip6.move.pnml.hlpn.terms.NamedOperator;
import fr.lip6.move.pnml.hlpn.terms.NamedSort;
import fr.lip6.move.pnml.hlpn.terms.Operator;
import fr.lip6.move.pnml.hlpn.terms.ProductSort;
import fr.lip6.move.pnml.hlpn.terms.Sort;
import fr.lip6.move.pnml.hlpn.terms.Term;
import fr.lip6.move.pnml.hlpn.terms.VariableDecl;

import fr.lip6.move.pnml.hlpn.terms.impl.TermsFactoryImpl;

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
import fr.lip6.move.pnml.hlpn.hlcorestructure.*;
import fr.lip6.move.pnml.hlpn.hlcorestructure.impl.*;
import fr.lip6.move.pnml.framework.utils.exception.InnerBuildException;
import fr.lip6.move.pnml.framework.utils.exception.InvalidIDException;
import fr.lip6.move.pnml.framework.utils.exception.VoidRepositoryException;
import fr.lip6.move.pnml.framework.utils.exception.OtherException;
import fr.lip6.move.pnml.framework.utils.IdRepository;
import fr.lip6.move.pnml.framework.utils.ModelRepository;


public class PageHLAPI implements HLAPIClass,PnObjectHLAPI{

	/**
	 * The contained LLAPI element.
	 */
	private Page item;

	/**
	 * this constructor allows you to set all 'settable' values
	 * excepted container.
	 */
	
	public PageHLAPI(
		 java.lang.String id
	
		, NameHLAPI name
	
		, NodeGraphicsHLAPI nodegraphics
	) throws InvalidIDException ,VoidRepositoryException {//BEGIN CONSTRUCTOR BODY
		HlcorestructureFactory fact = HlcorestructureFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createPage();}
	
 		
			if(id!=null){
			
				item.setId(ModelRepository.getInstance().getCurrentIdRepository().checkId(id, this));
			}
		
	
 		
 		if(name!=null)
			item.setName((Name)name.getContainedItem());
		
	
 		
 		if(nodegraphics!=null)
			item.setNodegraphics((NodeGraphics)nodegraphics.getContainedItem());
		
	
	}

	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	
	public PageHLAPI(
		 java.lang.String id
	
		, NameHLAPI name
	
		, NodeGraphicsHLAPI nodegraphics
	
		, PageHLAPI containerPage
	) throws InvalidIDException ,VoidRepositoryException {//BEGIN CONSTRUCTOR BODY
		HlcorestructureFactory fact = HlcorestructureFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createPage();}
	
 		
			if(id!=null){
			
				item.setId(ModelRepository.getInstance().getCurrentIdRepository().checkId(id, this));
			}
		
	
 		
 		if(name!=null)
			item.setName((Name)name.getContainedItem());
		
	
 		
 		if(nodegraphics!=null)
			item.setNodegraphics((NodeGraphics)nodegraphics.getContainedItem());
		
	
 		
 		if(containerPage!=null)
			item.setContainerPage((Page)containerPage.getContainedItem());
		
	
	}

	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	
	public PageHLAPI(
		 java.lang.String id
	
		, NameHLAPI name
	
		, NodeGraphicsHLAPI nodegraphics
	
		, PetriNetHLAPI containerPetriNet
	) throws InvalidIDException ,VoidRepositoryException {//BEGIN CONSTRUCTOR BODY
		HlcorestructureFactory fact = HlcorestructureFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createPage();}
	
 		
			if(id!=null){
			
				item.setId(ModelRepository.getInstance().getCurrentIdRepository().checkId(id, this));
			}
		
	
 		
 		if(name!=null)
			item.setName((Name)name.getContainedItem());
		
	
 		
 		if(nodegraphics!=null)
			item.setNodegraphics((NodeGraphics)nodegraphics.getContainedItem());
		
	
 		
 		if(containerPetriNet!=null)
			item.setContainerPetriNet((PetriNet)containerPetriNet.getContainedItem());
		
	
	}


	/**
    * This constructor give access to required stuff only (not container if any)
    */
	public PageHLAPI(
		 java.lang.String id
	) throws InvalidIDException ,VoidRepositoryException {//BEGIN CONSTRUCTOR BODY
		HlcorestructureFactory fact = HlcorestructureFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createPage();}
	
 		
			if(id!=null){
			
				item.setId(ModelRepository.getInstance().getCurrentIdRepository().checkId(id, this));
			}
		
	
	}


	
	/**
    * This constructor give access to required stuff only (and container)
    */
	public PageHLAPI(
		 java.lang.String id
	
		, PageHLAPI containerPage
	) throws InvalidIDException ,VoidRepositoryException {//BEGIN CONSTRUCTOR BODY
		HlcorestructureFactory fact = HlcorestructureFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createPage();}
	
 		
			if(id!=null){
			
				item.setId(ModelRepository.getInstance().getCurrentIdRepository().checkId(id, this));
			}
		
	
 		
 		if(containerPage!=null)
			item.setContainerPage((Page)containerPage.getContainedItem());
		
	
	}
	
	
	/**
    * This constructor give access to required stuff only (and container)
    */
	public PageHLAPI(
		 java.lang.String id
	
		, PetriNetHLAPI containerPetriNet
	) throws InvalidIDException ,VoidRepositoryException {//BEGIN CONSTRUCTOR BODY
		HlcorestructureFactory fact = HlcorestructureFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createPage();}
	
 		
			if(id!=null){
			
				item.setId(ModelRepository.getInstance().getCurrentIdRepository().checkId(id, this));
			}
		
	
 		
 		if(containerPetriNet!=null)
			item.setContainerPetriNet((PetriNet)containerPetriNet.getContainedItem());
		
	
	}
	

	/**
	 * This constructor encapsulate a low level API object in HLAPI.
	 */
	public PageHLAPI(Page lowLevelAPI){
		item = lowLevelAPI;
	}

	// access to low level API
	/**
	 * Return encapsulated object
	 */
	public Page getContainedItem(){
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
	public Name getName(){
		return item.getName();
	}
	
	/**
	 * Return the encapsulate Low Level API object.
	 */
	public List<ToolInfo> getToolspecifics(){
		return item.getToolspecifics();
	}
	
	/**
	 * Return the encapsulate Low Level API object.
	 */
	public Page getContainerPage(){
		return item.getContainerPage();
	}
	
	/**
	 * Return the encapsulate Low Level API object.
	 */
	public List<PnObject> getObjects(){
		return item.getObjects();
	}
	
	/**
	 * Return the encapsulate Low Level API object.
	 */
	public PetriNet getContainerPetriNet(){
		return item.getContainerPetriNet();
	}
	
	/**
	 * Return the encapsulate Low Level API object.
	 */
	public NodeGraphics getNodegraphics(){
		return item.getNodegraphics();
	}
	
	/**
	 * Return the encapsulate Low Level API object.
	 */
	public List<Declaration> getDeclaration(){
		return item.getDeclaration();
	}
	

	//getters giving HLAPI object
	
	
	
	
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		
		public NameHLAPI getNameHLAPI(){
			if(item.getName() == null) return null;
			return new NameHLAPI(item.getName());
		}
		
	
	
	
	
		/**
		 * This accessor automatically encapsulate all elements of the selected sublist.
		 * WARNING : this can creates a lot of new object in memory.
		 */
		
		public java.util.List<ToolInfoHLAPI> getToolspecificsHLAPI(){
			java.util.List<ToolInfoHLAPI> retour = new ArrayList<ToolInfoHLAPI>();
			for (ToolInfo elemnt : getToolspecifics()) {
				retour.add(new ToolInfoHLAPI(elemnt));
			}
			return retour;
		}
	
	
	
	
	
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		
		public PageHLAPI getContainerPageHLAPI(){
			if(item.getContainerPage() == null) return null;
			return new PageHLAPI(item.getContainerPage());
		}
		
	
	
	
	
		/**
		 * This accessor automatically encapsulate all elements of the selected sublist.
		 * WARNING : this can creates a lot of new object in memory.
		 */
		
			
		public java.util.List<PnObjectHLAPI> getObjectsHLAPI(){
			java.util.List<PnObjectHLAPI> retour = new ArrayList<PnObjectHLAPI>();
			for (PnObject elemnt : getObjects()) {
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.hlcorestructure.impl.PageImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.hlcorestructure.hlapi.PageHLAPI(
						(fr.lip6.move.pnml.hlpn.hlcorestructure.Page)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.hlcorestructure.impl.ArcImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.hlcorestructure.hlapi.ArcHLAPI(
						(fr.lip6.move.pnml.hlpn.hlcorestructure.Arc)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.hlcorestructure.impl.PlaceImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.hlcorestructure.hlapi.PlaceHLAPI(
						(fr.lip6.move.pnml.hlpn.hlcorestructure.Place)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.hlcorestructure.impl.RefTransitionImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.hlcorestructure.hlapi.RefTransitionHLAPI(
						(fr.lip6.move.pnml.hlpn.hlcorestructure.RefTransition)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.hlcorestructure.impl.TransitionImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.hlcorestructure.hlapi.TransitionHLAPI(
						(fr.lip6.move.pnml.hlpn.hlcorestructure.Transition)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.hlcorestructure.impl.RefPlaceImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.hlcorestructure.hlapi.RefPlaceHLAPI(
						(fr.lip6.move.pnml.hlpn.hlcorestructure.RefPlace)elemnt
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
		
		public PetriNetHLAPI getContainerPetriNetHLAPI(){
			if(item.getContainerPetriNet() == null) return null;
			return new PetriNetHLAPI(item.getContainerPetriNet());
		}
		
	
	
	
	
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		
		public NodeGraphicsHLAPI getNodegraphicsHLAPI(){
			if(item.getNodegraphics() == null) return null;
			return new NodeGraphicsHLAPI(item.getNodegraphics());
		}
		
	
	
	
	
		/**
		 * This accessor automatically encapsulate all elements of the selected sublist.
		 * WARNING : this can creates a lot of new object in memory.
		 */
		
		public java.util.List<DeclarationHLAPI> getDeclarationHLAPI(){
			java.util.List<DeclarationHLAPI> retour = new ArrayList<DeclarationHLAPI>();
			for (Declaration elemnt : getDeclaration()) {
				retour.add(new DeclarationHLAPI(elemnt));
			}
			return retour;
		}
	
	
	

	//Special getter for list of generics object, return only one object type.
	
	
	
	
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of PageHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.hlpn.hlcorestructure.hlapi.PageHLAPI> getObjects_hlcorestructure_PageHLAPI(){
			java.util.List<fr.lip6.move.pnml.hlpn.hlcorestructure.hlapi.PageHLAPI> retour = new ArrayList<fr.lip6.move.pnml.hlpn.hlcorestructure.hlapi.PageHLAPI>();
			for (PnObject elemnt : getObjects()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.hlcorestructure.impl.PageImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.hlcorestructure.hlapi.PageHLAPI(
						(fr.lip6.move.pnml.hlpn.hlcorestructure.Page)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of ArcHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.hlpn.hlcorestructure.hlapi.ArcHLAPI> getObjects_hlcorestructure_ArcHLAPI(){
			java.util.List<fr.lip6.move.pnml.hlpn.hlcorestructure.hlapi.ArcHLAPI> retour = new ArrayList<fr.lip6.move.pnml.hlpn.hlcorestructure.hlapi.ArcHLAPI>();
			for (PnObject elemnt : getObjects()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.hlcorestructure.impl.ArcImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.hlcorestructure.hlapi.ArcHLAPI(
						(fr.lip6.move.pnml.hlpn.hlcorestructure.Arc)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of PlaceHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.hlpn.hlcorestructure.hlapi.PlaceHLAPI> getObjects_hlcorestructure_PlaceHLAPI(){
			java.util.List<fr.lip6.move.pnml.hlpn.hlcorestructure.hlapi.PlaceHLAPI> retour = new ArrayList<fr.lip6.move.pnml.hlpn.hlcorestructure.hlapi.PlaceHLAPI>();
			for (PnObject elemnt : getObjects()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.hlcorestructure.impl.PlaceImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.hlcorestructure.hlapi.PlaceHLAPI(
						(fr.lip6.move.pnml.hlpn.hlcorestructure.Place)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of RefTransitionHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.hlpn.hlcorestructure.hlapi.RefTransitionHLAPI> getObjects_hlcorestructure_RefTransitionHLAPI(){
			java.util.List<fr.lip6.move.pnml.hlpn.hlcorestructure.hlapi.RefTransitionHLAPI> retour = new ArrayList<fr.lip6.move.pnml.hlpn.hlcorestructure.hlapi.RefTransitionHLAPI>();
			for (PnObject elemnt : getObjects()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.hlcorestructure.impl.RefTransitionImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.hlcorestructure.hlapi.RefTransitionHLAPI(
						(fr.lip6.move.pnml.hlpn.hlcorestructure.RefTransition)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of TransitionHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.hlpn.hlcorestructure.hlapi.TransitionHLAPI> getObjects_hlcorestructure_TransitionHLAPI(){
			java.util.List<fr.lip6.move.pnml.hlpn.hlcorestructure.hlapi.TransitionHLAPI> retour = new ArrayList<fr.lip6.move.pnml.hlpn.hlcorestructure.hlapi.TransitionHLAPI>();
			for (PnObject elemnt : getObjects()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.hlcorestructure.impl.TransitionImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.hlcorestructure.hlapi.TransitionHLAPI(
						(fr.lip6.move.pnml.hlpn.hlcorestructure.Transition)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of RefPlaceHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.hlpn.hlcorestructure.hlapi.RefPlaceHLAPI> getObjects_hlcorestructure_RefPlaceHLAPI(){
			java.util.List<fr.lip6.move.pnml.hlpn.hlcorestructure.hlapi.RefPlaceHLAPI> retour = new ArrayList<fr.lip6.move.pnml.hlpn.hlcorestructure.hlapi.RefPlaceHLAPI>();
			for (PnObject elemnt : getObjects()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.hlpn.hlcorestructure.impl.RefPlaceImpl.class)){
					retour.add(new fr.lip6.move.pnml.hlpn.hlcorestructure.hlapi.RefPlaceHLAPI(
						(fr.lip6.move.pnml.hlpn.hlcorestructure.RefPlace)elemnt
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
	
	NameHLAPI elem){
	
	
 		if(elem!=null)
			item.setName((Name)elem.getContainedItem());
	
	}
	
	/**
	 * set Nodegraphics
	 */
	public void setNodegraphicsHLAPI(
	
	NodeGraphicsHLAPI elem){
	
	
 		if(elem!=null)
			item.setNodegraphics((NodeGraphics)elem.getContainedItem());
	
	}
	
	/**
	 * set ContainerPage
	 */
	public void setContainerPageHLAPI(
	
	PageHLAPI elem){
	
	
 		if(elem!=null)
			item.setContainerPage((Page)elem.getContainedItem());
	
	}
	
	/**
	 * set ContainerPetriNet
	 */
	public void setContainerPetriNetHLAPI(
	
	PetriNetHLAPI elem){
	
	
 		if(elem!=null)
			item.setContainerPetriNet((PetriNet)elem.getContainedItem());
	
	}
	

	//setters/remover for lists.
	
	
	//Thread-safe insertion of objects in a Page
	public synchronized void addToolspecificsHLAPI(ToolInfoHLAPI unit){
	
		item.getToolspecifics().add((ToolInfo)unit.getContainedItem());
	}

	public void removeToolspecificsHLAPI(ToolInfoHLAPI unit){
		item.getToolspecifics().remove((ToolInfo)unit.getContainedItem());
	}
	
	
	//Thread-safe insertion of objects in a Page
	public synchronized void addObjectsHLAPI(PnObjectHLAPI unit){
	
		item.getObjects().add((PnObject)unit.getContainedItem());
	}

	public void removeObjectsHLAPI(PnObjectHLAPI unit){
		item.getObjects().remove((PnObject)unit.getContainedItem());
	}
	
	
	//Thread-safe insertion of objects in a Page
	public synchronized void addDeclarationHLAPI(DeclarationHLAPI unit){
	
		item.getDeclaration().add((Declaration)unit.getContainedItem());
	}

	public void removeDeclarationHLAPI(DeclarationHLAPI unit){
		item.getDeclaration().remove((Declaration)unit.getContainedItem());
	}
	

	//equals method
	public boolean equals(PageHLAPI item){
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