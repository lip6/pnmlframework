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
package fr.lip6.move.pnml.hlpn.terms.hlapi;

import java.nio.channels.FileChannel;

import org.apache.axiom.om.OMElement;
import org.eclipse.emf.common.util.DiagnosticChain;

import fr.lip6.move.pnml.framework.hlapi.HLAPIClass;
import fr.lip6.move.pnml.framework.utils.IdRefLinker;
import fr.lip6.move.pnml.framework.utils.ModelRepository;
import fr.lip6.move.pnml.framework.utils.exception.InnerBuildException;
import fr.lip6.move.pnml.framework.utils.exception.InvalidIDException;
import fr.lip6.move.pnml.framework.utils.exception.OtherException;
import fr.lip6.move.pnml.framework.utils.exception.VoidRepositoryException;
import fr.lip6.move.pnml.hlpn.terms.Declarations;
import fr.lip6.move.pnml.hlpn.terms.NamedOperator;
import fr.lip6.move.pnml.hlpn.terms.Sort;
import fr.lip6.move.pnml.hlpn.terms.TermsFactory;
import fr.lip6.move.pnml.hlpn.terms.VariableDecl;
import fr.lip6.move.pnml.hlpn.terms.impl.TermsFactoryImpl;


public class VariableDeclHLAPI implements HLAPIClass,TermsDeclarationHLAPI{

	/**
	 * The contained LLAPI element.
	 */
	private VariableDecl item;

	/**
	 * this constructor allows you to set all 'settable' values
	 * excepted container.
	 */
	
	public VariableDeclHLAPI(
		 java.lang.String id
	
		, java.lang.String name
	
		, SortHLAPI sort
	) throws InvalidIDException ,VoidRepositoryException {//BEGIN CONSTRUCTOR BODY
		TermsFactory fact = TermsFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createVariableDecl();}
	
 		
			if(id!=null){
			
				item.setId(ModelRepository.getInstance().getCurrentIdRepository().checkId(id, this));
			}
		
	
 		
			if(name!=null){
			
				item.setName(name);
			}
		
	
 		
 		if(sort!=null)
			item.setSort((Sort)sort.getContainedItem());
		
	
	}

	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	
	public VariableDeclHLAPI(
		 java.lang.String id
	
		, java.lang.String name
	
		, SortHLAPI sort
	
		, DeclarationsHLAPI containerDeclarations
	) throws InvalidIDException ,VoidRepositoryException {//BEGIN CONSTRUCTOR BODY
		TermsFactory fact = TermsFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createVariableDecl();}
	
 		
			if(id!=null){
			
				item.setId(ModelRepository.getInstance().getCurrentIdRepository().checkId(id, this));
			}
		
	
 		
			if(name!=null){
			
				item.setName(name);
			}
		
	
 		
 		if(sort!=null)
			item.setSort((Sort)sort.getContainedItem());
		
	
 		
 		if(containerDeclarations!=null)
			item.setContainerDeclarations((Declarations)containerDeclarations.getContainedItem());
		
	
	}

	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	
	public VariableDeclHLAPI(
		 java.lang.String id
	
		, java.lang.String name
	
		, SortHLAPI sort
	
		, NamedOperatorHLAPI containerNamedOperator
	) throws InvalidIDException ,VoidRepositoryException {//BEGIN CONSTRUCTOR BODY
		TermsFactory fact = TermsFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createVariableDecl();}
	
 		
			if(id!=null){
			
				item.setId(ModelRepository.getInstance().getCurrentIdRepository().checkId(id, this));
			}
		
	
 		
			if(name!=null){
			
				item.setName(name);
			}
		
	
 		
 		if(sort!=null)
			item.setSort((Sort)sort.getContainedItem());
		
	
 		
 		if(containerNamedOperator!=null)
			item.setContainerNamedOperator((NamedOperator)containerNamedOperator.getContainedItem());
		
	
	}



	
	

	/**
	 * This constructor encapsulate a low level API object in HLAPI.
	 */
	public VariableDeclHLAPI(VariableDecl lowLevelAPI){
		item = lowLevelAPI;
	}

	// access to low level API
	/**
	 * Return encapsulated object
	 */
	public VariableDecl getContainedItem(){
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
	public Sort getSort(){
		return item.getSort();
	}
	
	/**
	 * Return the encapsulate Low Level API object.
	 */
	public NamedOperator getContainerNamedOperator(){
		return item.getContainerNamedOperator();
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
		
		public NamedOperatorHLAPI getContainerNamedOperatorHLAPI(){
			if(item.getContainerNamedOperator() == null) return null;
			return new NamedOperatorHLAPI(item.getContainerNamedOperator());
		}
		
	
	

	//Special getter for list of generics object, return only one object type.
	
	
	
	

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
	 * set Sort
	 */
	public void setSortHLAPI(
	
	SortHLAPI elem){
	
	
 		if(elem!=null)
			item.setSort((Sort)elem.getContainedItem());
	
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
	 * set ContainerNamedOperator
	 */
	public void setContainerNamedOperatorHLAPI(
	
	NamedOperatorHLAPI elem){
	
	
 		if(elem!=null)
			item.setContainerNamedOperator((NamedOperator)elem.getContainedItem());
	
	}
	

	//setters/remover for lists.
	

	//equals method
	public boolean equals(VariableDeclHLAPI item){
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