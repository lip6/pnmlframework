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
 * $Id ggiffo, Tue Dec 23 11:30:46 CET 2014$
 */
package fr.lip6.move.pnml.ptnet.hlapi;

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
import fr.lip6.move.pnml.ptnet.Name;
import fr.lip6.move.pnml.ptnet.NodeGraphics;
import fr.lip6.move.pnml.ptnet.Page;
import fr.lip6.move.pnml.ptnet.PetriNet;
import fr.lip6.move.pnml.ptnet.PnObject;
import fr.lip6.move.pnml.ptnet.PtnetFactory;
import fr.lip6.move.pnml.ptnet.ToolInfo;
import fr.lip6.move.pnml.ptnet.impl.PtnetFactoryImpl;


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
		PtnetFactory fact = PtnetFactoryImpl.eINSTANCE;
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
		PtnetFactory fact = PtnetFactoryImpl.eINSTANCE;
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
		PtnetFactory fact = PtnetFactoryImpl.eINSTANCE;
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
		PtnetFactory fact = PtnetFactoryImpl.eINSTANCE;
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
		PtnetFactory fact = PtnetFactoryImpl.eINSTANCE;
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
		PtnetFactory fact = PtnetFactoryImpl.eINSTANCE;
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
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.ptnet.impl.PageImpl.class)){
					retour.add(new fr.lip6.move.pnml.ptnet.hlapi.PageHLAPI(
						(fr.lip6.move.pnml.ptnet.Page)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.ptnet.impl.ArcImpl.class)){
					retour.add(new fr.lip6.move.pnml.ptnet.hlapi.ArcHLAPI(
						(fr.lip6.move.pnml.ptnet.Arc)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.ptnet.impl.PlaceImpl.class)){
					retour.add(new fr.lip6.move.pnml.ptnet.hlapi.PlaceHLAPI(
						(fr.lip6.move.pnml.ptnet.Place)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.ptnet.impl.RefTransitionImpl.class)){
					retour.add(new fr.lip6.move.pnml.ptnet.hlapi.RefTransitionHLAPI(
						(fr.lip6.move.pnml.ptnet.RefTransition)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.ptnet.impl.TransitionImpl.class)){
					retour.add(new fr.lip6.move.pnml.ptnet.hlapi.TransitionHLAPI(
						(fr.lip6.move.pnml.ptnet.Transition)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.ptnet.impl.RefPlaceImpl.class)){
					retour.add(new fr.lip6.move.pnml.ptnet.hlapi.RefPlaceHLAPI(
						(fr.lip6.move.pnml.ptnet.RefPlace)elemnt
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
		
	
	

	//Special getter for list of generics object, return only one object type.
	
	
	
	
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of PageHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.ptnet.hlapi.PageHLAPI> getObjects_PageHLAPI(){
			java.util.List<fr.lip6.move.pnml.ptnet.hlapi.PageHLAPI> retour = new ArrayList<fr.lip6.move.pnml.ptnet.hlapi.PageHLAPI>();
			for (PnObject elemnt : getObjects()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.ptnet.impl.PageImpl.class)){
					retour.add(new fr.lip6.move.pnml.ptnet.hlapi.PageHLAPI(
						(fr.lip6.move.pnml.ptnet.Page)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of ArcHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.ptnet.hlapi.ArcHLAPI> getObjects_ArcHLAPI(){
			java.util.List<fr.lip6.move.pnml.ptnet.hlapi.ArcHLAPI> retour = new ArrayList<fr.lip6.move.pnml.ptnet.hlapi.ArcHLAPI>();
			for (PnObject elemnt : getObjects()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.ptnet.impl.ArcImpl.class)){
					retour.add(new fr.lip6.move.pnml.ptnet.hlapi.ArcHLAPI(
						(fr.lip6.move.pnml.ptnet.Arc)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of PlaceHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.ptnet.hlapi.PlaceHLAPI> getObjects_PlaceHLAPI(){
			java.util.List<fr.lip6.move.pnml.ptnet.hlapi.PlaceHLAPI> retour = new ArrayList<fr.lip6.move.pnml.ptnet.hlapi.PlaceHLAPI>();
			for (PnObject elemnt : getObjects()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.ptnet.impl.PlaceImpl.class)){
					retour.add(new fr.lip6.move.pnml.ptnet.hlapi.PlaceHLAPI(
						(fr.lip6.move.pnml.ptnet.Place)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of RefTransitionHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.ptnet.hlapi.RefTransitionHLAPI> getObjects_RefTransitionHLAPI(){
			java.util.List<fr.lip6.move.pnml.ptnet.hlapi.RefTransitionHLAPI> retour = new ArrayList<fr.lip6.move.pnml.ptnet.hlapi.RefTransitionHLAPI>();
			for (PnObject elemnt : getObjects()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.ptnet.impl.RefTransitionImpl.class)){
					retour.add(new fr.lip6.move.pnml.ptnet.hlapi.RefTransitionHLAPI(
						(fr.lip6.move.pnml.ptnet.RefTransition)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of TransitionHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.ptnet.hlapi.TransitionHLAPI> getObjects_TransitionHLAPI(){
			java.util.List<fr.lip6.move.pnml.ptnet.hlapi.TransitionHLAPI> retour = new ArrayList<fr.lip6.move.pnml.ptnet.hlapi.TransitionHLAPI>();
			for (PnObject elemnt : getObjects()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.ptnet.impl.TransitionImpl.class)){
					retour.add(new fr.lip6.move.pnml.ptnet.hlapi.TransitionHLAPI(
						(fr.lip6.move.pnml.ptnet.Transition)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of RefPlaceHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.ptnet.hlapi.RefPlaceHLAPI> getObjects_RefPlaceHLAPI(){
			java.util.List<fr.lip6.move.pnml.ptnet.hlapi.RefPlaceHLAPI> retour = new ArrayList<fr.lip6.move.pnml.ptnet.hlapi.RefPlaceHLAPI>();
			for (PnObject elemnt : getObjects()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.ptnet.impl.RefPlaceImpl.class)){
					retour.add(new fr.lip6.move.pnml.ptnet.hlapi.RefPlaceHLAPI(
						(fr.lip6.move.pnml.ptnet.RefPlace)elemnt
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