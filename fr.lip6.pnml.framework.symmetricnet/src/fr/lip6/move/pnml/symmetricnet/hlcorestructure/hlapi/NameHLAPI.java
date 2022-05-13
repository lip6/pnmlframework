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
 * $Id ggiffo, Thu Feb 11 16:29:02 CET 2016$
 */
package fr.lip6.move.pnml.symmetricnet.hlcorestructure.hlapi;

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
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.AnnotationGraphics;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.HlcorestructureFactory;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.Name;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.PetriNet;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.PnObject;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.ToolInfo;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.impl.HlcorestructureFactoryImpl;


public class NameHLAPI implements HLAPIClass,LabelHLAPI,AnnotationHLAPI{

	/**
	 * The contained LLAPI element.
	 */
	private Name item;

	/**
	 * this constructor allows you to set all 'settable' values
	 * excepted container.
	 */
	
	public NameHLAPI(
		 AnnotationGraphicsHLAPI annotationgraphics
	
		, java.lang.String text
	){//BEGIN CONSTRUCTOR BODY
		HlcorestructureFactory fact = HlcorestructureFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createName();}
	
 		
 		if(annotationgraphics!=null)
			item.setAnnotationgraphics((AnnotationGraphics)annotationgraphics.getContainedItem());
		
	
 		
			if(text!=null){
			
				item.setText(text);
			}
		
	
	}

	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	
	public NameHLAPI(
		 AnnotationGraphicsHLAPI annotationgraphics
	
		, java.lang.String text
	
		, PetriNetHLAPI containerNamePetriNet
	){//BEGIN CONSTRUCTOR BODY
		HlcorestructureFactory fact = HlcorestructureFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createName();}
	
 		
 		if(annotationgraphics!=null)
			item.setAnnotationgraphics((AnnotationGraphics)annotationgraphics.getContainedItem());
		
	
 		
			if(text!=null){
			
				item.setText(text);
			}
		
	
 		
 		if(containerNamePetriNet!=null)
			item.setContainerNamePetriNet((PetriNet)containerNamePetriNet.getContainedItem());
		
	
	}

	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	
	public NameHLAPI(
		 AnnotationGraphicsHLAPI annotationgraphics
	
		, java.lang.String text
	
		, PnObjectHLAPI containerNamePnObject
	){//BEGIN CONSTRUCTOR BODY
		HlcorestructureFactory fact = HlcorestructureFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createName();}
	
 		
 		if(annotationgraphics!=null)
			item.setAnnotationgraphics((AnnotationGraphics)annotationgraphics.getContainedItem());
		
	
 		
			if(text!=null){
			
				item.setText(text);
			}
		
	
 		
 		if(containerNamePnObject!=null)
			item.setContainerNamePnObject((PnObject)containerNamePnObject.getContainedItem());
		
	
	}


	/**
    * This constructor give access to required stuff only (not container if any)
    */
	public NameHLAPI(
		 java.lang.String text
	){//BEGIN CONSTRUCTOR BODY
		HlcorestructureFactory fact = HlcorestructureFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createName();}
	
 		
			if(text!=null){
			
				item.setText(text);
			}
		
	
	}


	
	/**
    * This constructor give access to required stuff only (and container)
    */
	public NameHLAPI(
		 java.lang.String text
	
		, PetriNetHLAPI containerNamePetriNet
	){//BEGIN CONSTRUCTOR BODY
		HlcorestructureFactory fact = HlcorestructureFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createName();}
	
 		
			if(text!=null){
			
				item.setText(text);
			}
		
	
 		
 		if(containerNamePetriNet!=null)
			item.setContainerNamePetriNet((PetriNet)containerNamePetriNet.getContainedItem());
		
	
	}
	
	
	/**
    * This constructor give access to required stuff only (and container)
    */
	public NameHLAPI(
		 java.lang.String text
	
		, PnObjectHLAPI containerNamePnObject
	){//BEGIN CONSTRUCTOR BODY
		HlcorestructureFactory fact = HlcorestructureFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createName();}
	
 		
			if(text!=null){
			
				item.setText(text);
			}
		
	
 		
 		if(containerNamePnObject!=null)
			item.setContainerNamePnObject((PnObject)containerNamePnObject.getContainedItem());
		
	
	}
	

	/**
	 * This constructor encapsulate a low level API object in HLAPI.
	 */
	public NameHLAPI(Name lowLevelAPI){
		item = lowLevelAPI;
	}

	// access to low level API
	/**
	 * Return encapsulated object
	 */
	public Name getContainedItem(){
		return item;
	}

	//getters giving LLAPI object
	
	/**
	 * Return the encapsulate Low Level API object.
	 */
	public List<ToolInfo> getToolspecifics(){
		return item.getToolspecifics();
	}
	
	/**
	 * Return the encapsulate Low Level API object.
	 */
	public AnnotationGraphics getAnnotationgraphics(){
		return item.getAnnotationgraphics();
	}
	
	/**
	 * Return the encapsulate Low Level API object.
	 */
	public String getText(){
		return item.getText();
	}
	
	/**
	 * Return the encapsulate Low Level API object.
	 */
	public PetriNet getContainerNamePetriNet(){
		return item.getContainerNamePetriNet();
	}
	
	/**
	 * Return the encapsulate Low Level API object.
	 */
	public PnObject getContainerNamePnObject(){
		return item.getContainerNamePnObject();
	}
	

	//getters giving HLAPI object
	
	
	
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
		
		public AnnotationGraphicsHLAPI getAnnotationgraphicsHLAPI(){
			if(item.getAnnotationgraphics() == null) return null;
			return new AnnotationGraphicsHLAPI(item.getAnnotationgraphics());
		}
		
	
	
	
	
	
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		
		public PetriNetHLAPI getContainerNamePetriNetHLAPI(){
			if(item.getContainerNamePetriNet() == null) return null;
			return new PetriNetHLAPI(item.getContainerNamePetriNet());
		}
		
	
	
	
	
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		
		
		public PnObjectHLAPI getContainerNamePnObjectHLAPI(){
			if(item.getContainerNamePnObject() == null) return null;
			PnObject object = item.getContainerNamePnObject();
			
			if(object.getClass().equals(fr.lip6.move.pnml.symmetricnet.hlcorestructure.impl.PageImpl.class)){
				return new fr.lip6.move.pnml.symmetricnet.hlcorestructure.hlapi.PageHLAPI((fr.lip6.move.pnml.symmetricnet.hlcorestructure.Page)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.symmetricnet.hlcorestructure.impl.ArcImpl.class)){
				return new fr.lip6.move.pnml.symmetricnet.hlcorestructure.hlapi.ArcHLAPI((fr.lip6.move.pnml.symmetricnet.hlcorestructure.Arc)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.symmetricnet.hlcorestructure.impl.PlaceImpl.class)){
				return new fr.lip6.move.pnml.symmetricnet.hlcorestructure.hlapi.PlaceHLAPI((fr.lip6.move.pnml.symmetricnet.hlcorestructure.Place)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.symmetricnet.hlcorestructure.impl.RefTransitionImpl.class)){
				return new fr.lip6.move.pnml.symmetricnet.hlcorestructure.hlapi.RefTransitionHLAPI((fr.lip6.move.pnml.symmetricnet.hlcorestructure.RefTransition)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.symmetricnet.hlcorestructure.impl.TransitionImpl.class)){
				return new fr.lip6.move.pnml.symmetricnet.hlcorestructure.hlapi.TransitionHLAPI((fr.lip6.move.pnml.symmetricnet.hlcorestructure.Transition)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.symmetricnet.hlcorestructure.impl.RefPlaceImpl.class)){
				return new fr.lip6.move.pnml.symmetricnet.hlcorestructure.hlapi.RefPlaceHLAPI((fr.lip6.move.pnml.symmetricnet.hlcorestructure.RefPlace)object);
			}
			
			return null;
		}
		
	
	

	//Special getter for list of generics object, return only one object type.
	
	
	
	
	

	//setters (including container setter if aviable)
	
	
	/**
	 * set Annotationgraphics
	 */
	public void setAnnotationgraphicsHLAPI(
	
	AnnotationGraphicsHLAPI elem){
	
	
 		if(elem!=null)
			item.setAnnotationgraphics((AnnotationGraphics)elem.getContainedItem());
	
	}
	
	/**
	 * set Text
	 */
	public void setTextHLAPI(
	
	java.lang.String elem){
	
	
		if(elem!=null){
		
			item.setText(elem);
		}
	
	}
	
	/**
	 * set ContainerNamePetriNet
	 */
	public void setContainerNamePetriNetHLAPI(
	
	PetriNetHLAPI elem){
	
	
 		if(elem!=null)
			item.setContainerNamePetriNet((PetriNet)elem.getContainedItem());
	
	}
	
	/**
	 * set ContainerNamePnObject
	 */
	public void setContainerNamePnObjectHLAPI(
	
	PnObjectHLAPI elem){
	
	
 		if(elem!=null)
			item.setContainerNamePnObject((PnObject)elem.getContainedItem());
	
	}
	

	//setters/remover for lists.
	
	
	public void addToolspecificsHLAPI(ToolInfoHLAPI unit){
	
		item.getToolspecifics().add((ToolInfo)unit.getContainedItem());
	}

	public void removeToolspecificsHLAPI(ToolInfoHLAPI unit){
		item.getToolspecifics().remove((ToolInfo)unit.getContainedItem());
	}
	

	//equals method
	public boolean equals(NameHLAPI item){
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