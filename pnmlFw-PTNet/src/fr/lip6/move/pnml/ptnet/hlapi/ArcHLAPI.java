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
import fr.lip6.move.pnml.ptnet.Arc;
import fr.lip6.move.pnml.ptnet.ArcGraphics;
import fr.lip6.move.pnml.ptnet.Name;
import fr.lip6.move.pnml.ptnet.Node;
import fr.lip6.move.pnml.ptnet.PTArcAnnotation;
import fr.lip6.move.pnml.ptnet.Page;
import fr.lip6.move.pnml.ptnet.PtnetFactory;
import fr.lip6.move.pnml.ptnet.ToolInfo;
import fr.lip6.move.pnml.ptnet.impl.PtnetFactoryImpl;


public class ArcHLAPI implements HLAPIClass,PnObjectHLAPI{

	/**
	 * The contained LLAPI element.
	 */
	private Arc item;

	/**
	 * this constructor allows you to set all 'settable' values
	 * excepted container.
	 */
	
	public ArcHLAPI(
		 java.lang.String id
	
		, NameHLAPI name
	
		, NodeHLAPI source
	
		, NodeHLAPI target
	
		, ArcGraphicsHLAPI arcgraphics
	
		, PTArcAnnotationHLAPI inscription
	) throws InvalidIDException ,VoidRepositoryException {//BEGIN CONSTRUCTOR BODY
		PtnetFactory fact = PtnetFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createArc();}
	
 		
			if(id!=null){
			
				item.setId(ModelRepository.getInstance().getCurrentIdRepository().checkId(id, this));
			}
		
	
 		
 		if(name!=null)
			item.setName((Name)name.getContainedItem());
		
	
 		
 		if(source!=null)
			item.setSource((Node)source.getContainedItem());
		
	
 		
 		if(target!=null)
			item.setTarget((Node)target.getContainedItem());
		
	
 		
 		if(arcgraphics!=null)
			item.setArcgraphics((ArcGraphics)arcgraphics.getContainedItem());
		
	
 		
 		if(inscription!=null)
			item.setInscription((PTArcAnnotation)inscription.getContainedItem());
		
	
	}

	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	
	public ArcHLAPI(
		 java.lang.String id
	
		, NameHLAPI name
	
		, NodeHLAPI source
	
		, NodeHLAPI target
	
		, ArcGraphicsHLAPI arcgraphics
	
		, PTArcAnnotationHLAPI inscription
	
		, PageHLAPI containerPage
	) throws InvalidIDException ,VoidRepositoryException {//BEGIN CONSTRUCTOR BODY
		PtnetFactory fact = PtnetFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createArc();}
	
 		
			if(id!=null){
			
				item.setId(ModelRepository.getInstance().getCurrentIdRepository().checkId(id, this));
			}
		
	
 		
 		if(name!=null)
			item.setName((Name)name.getContainedItem());
		
	
 		
 		if(source!=null)
			item.setSource((Node)source.getContainedItem());
		
	
 		
 		if(target!=null)
			item.setTarget((Node)target.getContainedItem());
		
	
 		
 		if(arcgraphics!=null)
			item.setArcgraphics((ArcGraphics)arcgraphics.getContainedItem());
		
	
 		
 		if(inscription!=null)
			item.setInscription((PTArcAnnotation)inscription.getContainedItem());
		
	
 		
 		if(containerPage!=null)
			item.setContainerPage((Page)containerPage.getContainedItem());
		
	
	}


	/**
    * This constructor give access to required stuff only (not container if any)
    */
	public ArcHLAPI(
		 java.lang.String id
	
		, NodeHLAPI source
	
		, NodeHLAPI target
	) throws InvalidIDException ,VoidRepositoryException {//BEGIN CONSTRUCTOR BODY
		PtnetFactory fact = PtnetFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createArc();}
	
 		
			if(id!=null){
			
				item.setId(ModelRepository.getInstance().getCurrentIdRepository().checkId(id, this));
			}
		
	
 		
 		if(source!=null)
			item.setSource((Node)source.getContainedItem());
		
	
 		
 		if(target!=null)
			item.setTarget((Node)target.getContainedItem());
		
	
	}


	
	/**
    * This constructor give access to required stuff only (and container)
    */
	public ArcHLAPI(
		 java.lang.String id
	
		, NodeHLAPI source
	
		, NodeHLAPI target
	
		, PageHLAPI containerPage
	) throws InvalidIDException ,VoidRepositoryException {//BEGIN CONSTRUCTOR BODY
		PtnetFactory fact = PtnetFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createArc();}
	
 		
			if(id!=null){
			
				item.setId(ModelRepository.getInstance().getCurrentIdRepository().checkId(id, this));
			}
		
	
 		
 		if(source!=null)
			item.setSource((Node)source.getContainedItem());
		
	
 		
 		if(target!=null)
			item.setTarget((Node)target.getContainedItem());
		
	
 		
 		if(containerPage!=null)
			item.setContainerPage((Page)containerPage.getContainedItem());
		
	
	}
	

	/**
	 * This constructor encapsulate a low level API object in HLAPI.
	 */
	public ArcHLAPI(Arc lowLevelAPI){
		item = lowLevelAPI;
	}

	// access to low level API
	/**
	 * Return encapsulated object
	 */
	public Arc getContainedItem(){
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
	public Node getSource(){
		return item.getSource();
	}
	
	/**
	 * Return the encapsulate Low Level API object.
	 */
	public Node getTarget(){
		return item.getTarget();
	}
	
	/**
	 * Return the encapsulate Low Level API object.
	 */
	public ArcGraphics getArcgraphics(){
		return item.getArcgraphics();
	}
	
	/**
	 * Return the encapsulate Low Level API object.
	 */
	public PTArcAnnotation getInscription(){
		return item.getInscription();
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
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		
		
		public NodeHLAPI getSourceHLAPI(){
			if(item.getSource() == null) return null;
			Node object = item.getSource();
			
			if(object.getClass().equals(fr.lip6.move.pnml.ptnet.impl.PlaceImpl.class)){
				return new fr.lip6.move.pnml.ptnet.hlapi.PlaceHLAPI((fr.lip6.move.pnml.ptnet.Place)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.ptnet.impl.RefTransitionImpl.class)){
				return new fr.lip6.move.pnml.ptnet.hlapi.RefTransitionHLAPI((fr.lip6.move.pnml.ptnet.RefTransition)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.ptnet.impl.TransitionImpl.class)){
				return new fr.lip6.move.pnml.ptnet.hlapi.TransitionHLAPI((fr.lip6.move.pnml.ptnet.Transition)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.ptnet.impl.RefPlaceImpl.class)){
				return new fr.lip6.move.pnml.ptnet.hlapi.RefPlaceHLAPI((fr.lip6.move.pnml.ptnet.RefPlace)object);
			}
			
			return null;
		}
		
	
	
	
	
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		
		
		public NodeHLAPI getTargetHLAPI(){
			if(item.getTarget() == null) return null;
			Node object = item.getTarget();
			
			if(object.getClass().equals(fr.lip6.move.pnml.ptnet.impl.PlaceImpl.class)){
				return new fr.lip6.move.pnml.ptnet.hlapi.PlaceHLAPI((fr.lip6.move.pnml.ptnet.Place)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.ptnet.impl.RefTransitionImpl.class)){
				return new fr.lip6.move.pnml.ptnet.hlapi.RefTransitionHLAPI((fr.lip6.move.pnml.ptnet.RefTransition)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.ptnet.impl.TransitionImpl.class)){
				return new fr.lip6.move.pnml.ptnet.hlapi.TransitionHLAPI((fr.lip6.move.pnml.ptnet.Transition)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.ptnet.impl.RefPlaceImpl.class)){
				return new fr.lip6.move.pnml.ptnet.hlapi.RefPlaceHLAPI((fr.lip6.move.pnml.ptnet.RefPlace)object);
			}
			
			return null;
		}
		
	
	
	
	
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		
		public ArcGraphicsHLAPI getArcgraphicsHLAPI(){
			if(item.getArcgraphics() == null) return null;
			return new ArcGraphicsHLAPI(item.getArcgraphics());
		}
		
	
	
	
	
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		
		public PTArcAnnotationHLAPI getInscriptionHLAPI(){
			if(item.getInscription() == null) return null;
			return new PTArcAnnotationHLAPI(item.getInscription());
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
	
	NameHLAPI elem){
	
	
 		if(elem!=null)
			item.setName((Name)elem.getContainedItem());
	
	}
	
	/**
	 * set Source
	 */
	public void setSourceHLAPI(
	
	NodeHLAPI elem){
	
	
 		if(elem!=null)
			item.setSource((Node)elem.getContainedItem());
	
	}
	
	/**
	 * set Target
	 */
	public void setTargetHLAPI(
	
	NodeHLAPI elem){
	
	
 		if(elem!=null)
			item.setTarget((Node)elem.getContainedItem());
	
	}
	
	/**
	 * set Arcgraphics
	 */
	public void setArcgraphicsHLAPI(
	
	ArcGraphicsHLAPI elem){
	
	
 		if(elem!=null)
			item.setArcgraphics((ArcGraphics)elem.getContainedItem());
	
	}
	
	/**
	 * set Inscription
	 */
	public void setInscriptionHLAPI(
	
	PTArcAnnotationHLAPI elem){
	
	
 		if(elem!=null)
			item.setInscription((PTArcAnnotation)elem.getContainedItem());
	
	}
	
	/**
	 * set ContainerPage
	 */
	public void setContainerPageHLAPI(
	
	PageHLAPI elem){
	
	
 		if(elem!=null)
			item.setContainerPage((Page)elem.getContainedItem());
	
	}
	

	//setters/remover for lists.
	
	
	public void addToolspecificsHLAPI(ToolInfoHLAPI unit){
	
		item.getToolspecifics().add((ToolInfo)unit.getContainedItem());
	}

	public void removeToolspecificsHLAPI(ToolInfoHLAPI unit){
		item.getToolspecifics().remove((ToolInfo)unit.getContainedItem());
	}
	

	//equals method
	public boolean equals(ArcHLAPI item){
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