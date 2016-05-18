/**
 *  Copyright 2009-2016 Université Paris Ouest and Sorbonne Universités,
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
 * $Id ggiffo, Thu Feb 11 16:29:57 CET 2016$
 */
package fr.lip6.move.pnml.hlpn.arbitrarydeclarations.hlapi;

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
import fr.lip6.move.pnml.hlpn.arbitrarydeclarations.ArbitrarydeclarationsFactory;
import fr.lip6.move.pnml.hlpn.arbitrarydeclarations.Unparsed;
import fr.lip6.move.pnml.hlpn.arbitrarydeclarations.impl.ArbitrarydeclarationsFactoryImpl;
import fr.lip6.move.pnml.hlpn.hlcorestructure.AnyObject;
import fr.lip6.move.pnml.hlpn.hlcorestructure.hlapi.AnyObjectHLAPI;
import fr.lip6.move.pnml.hlpn.terms.Declarations;
import fr.lip6.move.pnml.hlpn.terms.hlapi.DeclarationsHLAPI;
import fr.lip6.move.pnml.hlpn.terms.hlapi.TermsDeclarationHLAPI;


public class UnparsedHLAPI implements HLAPIClass,TermsDeclarationHLAPI{

	/**
	 * The contained LLAPI element.
	 */
	private Unparsed item;

	/**
	 * this constructor allows you to set all 'settable' values
	 * excepted container.
	 */
	
	public UnparsedHLAPI(
		 java.lang.String id
	
		, java.lang.String name
	
		, AnyObjectHLAPI unparsedModel
	) throws InvalidIDException ,VoidRepositoryException {//BEGIN CONSTRUCTOR BODY
		ArbitrarydeclarationsFactory fact = ArbitrarydeclarationsFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createUnparsed();}
	
 		
			if(id!=null){
			
				item.setId(ModelRepository.getInstance().getCurrentIdRepository().checkId(id, this));
			}
		
	
 		
			if(name!=null){
			
				item.setName(name);
			}
		
	
 		
 		if(unparsedModel!=null)
			item.setUnparsedModel((AnyObject)unparsedModel.getContainedItem());
		
	
	}

	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	
	public UnparsedHLAPI(
		 java.lang.String id
	
		, java.lang.String name
	
		, AnyObjectHLAPI unparsedModel
	
		, DeclarationsHLAPI containerDeclarations
	) throws InvalidIDException ,VoidRepositoryException {//BEGIN CONSTRUCTOR BODY
		ArbitrarydeclarationsFactory fact = ArbitrarydeclarationsFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createUnparsed();}
	
 		
			if(id!=null){
			
				item.setId(ModelRepository.getInstance().getCurrentIdRepository().checkId(id, this));
			}
		
	
 		
			if(name!=null){
			
				item.setName(name);
			}
		
	
 		
 		if(unparsedModel!=null)
			item.setUnparsedModel((AnyObject)unparsedModel.getContainedItem());
		
	
 		
 		if(containerDeclarations!=null)
			item.setContainerDeclarations((Declarations)containerDeclarations.getContainedItem());
		
	
	}


	/**
    * This constructor give access to required stuff only (not container if any)
    */
	public UnparsedHLAPI(
		 java.lang.String id
	
		, java.lang.String name
	) throws InvalidIDException ,VoidRepositoryException {//BEGIN CONSTRUCTOR BODY
		ArbitrarydeclarationsFactory fact = ArbitrarydeclarationsFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createUnparsed();}
	
 		
			if(id!=null){
			
				item.setId(ModelRepository.getInstance().getCurrentIdRepository().checkId(id, this));
			}
		
	
 		
			if(name!=null){
			
				item.setName(name);
			}
		
	
	}


	
	/**
    * This constructor give access to required stuff only (and container)
    */
	public UnparsedHLAPI(
		 java.lang.String id
	
		, java.lang.String name
	
		, DeclarationsHLAPI containerDeclarations
	) throws InvalidIDException ,VoidRepositoryException {//BEGIN CONSTRUCTOR BODY
		ArbitrarydeclarationsFactory fact = ArbitrarydeclarationsFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createUnparsed();}
	
 		
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
	 * This constructor encapsulate a low level API object in HLAPI.
	 */
	public UnparsedHLAPI(Unparsed lowLevelAPI){
		item = lowLevelAPI;
	}

	// access to low level API
	/**
	 * Return encapsulated object
	 */
	public Unparsed getContainedItem(){
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
	public AnyObject getUnparsedModel(){
		return item.getUnparsedModel();
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
	 * set UnparsedModel
	 */
	public void setUnparsedModelHLAPI(
	
	AnyObjectHLAPI elem){
	
	
 		if(elem!=null)
			item.setUnparsedModel((AnyObject)elem.getContainedItem());
	
	}
	
	/**
	 * set ContainerDeclarations
	 */
	public void setContainerDeclarationsHLAPI(
	
	DeclarationsHLAPI elem){
	
	
 		if(elem!=null)
			item.setContainerDeclarations((Declarations)elem.getContainedItem());
	
	}
	

	//setters/remover for lists.
	

	//equals method
	public boolean equals(UnparsedHLAPI item){
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