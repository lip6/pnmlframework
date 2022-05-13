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
 * $Id ggiffo, Wed Feb 10 14:59:10 CET 2016$
 */
package fr.lip6.move.pnml.pnmlcoremodel.hlapi;

import fr.lip6.move.pnml.pnmlcoremodel.AnnotationGraphics;
import fr.lip6.move.pnml.pnmlcoremodel.AnyObject;
import fr.lip6.move.pnml.pnmlcoremodel.Label;
import fr.lip6.move.pnml.pnmlcoremodel.Name;
import fr.lip6.move.pnml.pnmlcoremodel.NodeGraphics;
import fr.lip6.move.pnml.pnmlcoremodel.PNType;
import fr.lip6.move.pnml.pnmlcoremodel.Page;
import fr.lip6.move.pnml.pnmlcoremodel.PetriNet;
import fr.lip6.move.pnml.pnmlcoremodel.PetriNetDoc;
import fr.lip6.move.pnml.pnmlcoremodel.PnObject;
import fr.lip6.move.pnml.pnmlcoremodel.ToolInfo;

import fr.lip6.move.pnml.pnmlcoremodel.impl.PnmlcoremodelFactoryImpl;

import java.net.URI;

import java.util.List;

import  fr.lip6.move.pnml.framework.hlapi.*;
import fr.lip6.move.pnml.pnmlcoremodel.hlapi.*;

import java.util.ArrayList;
import java.util.List;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import org.apache.axiom.om.*;
import fr.lip6.move.pnml.framework.utils.IdRefLinker;
import org.eclipse.emf.common.util.DiagnosticChain;
import fr.lip6.move.pnml.pnmlcoremodel.*;
import fr.lip6.move.pnml.pnmlcoremodel.impl.*;
import fr.lip6.move.pnml.framework.utils.exception.InnerBuildException;
import fr.lip6.move.pnml.framework.utils.exception.InvalidIDException;
import fr.lip6.move.pnml.framework.utils.exception.VoidRepositoryException;
import fr.lip6.move.pnml.framework.utils.exception.OtherException;
import fr.lip6.move.pnml.framework.utils.IdRepository;
import fr.lip6.move.pnml.framework.utils.ModelRepository;


public class ToolInfoHLAPI implements HLAPIClass{

	/**
	 * The contained LLAPI element.
	 */
	private ToolInfo item;

	/**
	 * this constructor allows you to set all 'settable' values
	 * excepted container.
	 */
	
	public ToolInfoHLAPI(
		 java.lang.String tool
	
		, java.lang.String version
	
		, java.lang.StringBuffer formattedXMLBuffer
	
		, java.net.URI toolInfoGrammarURI
	
		, AnyObjectHLAPI toolInfoModel
	){//BEGIN CONSTRUCTOR BODY
		PnmlcoremodelFactory fact = PnmlcoremodelFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createToolInfo();}
	
 		
			if(tool!=null){
			
				item.setTool(tool);
			}
		
	
 		
			if(version!=null){
			
				item.setVersion(version);
			}
		
	
 		
			if(formattedXMLBuffer!=null){
			
				item.setFormattedXMLBuffer(formattedXMLBuffer);
			}
		
	
 		
			if(toolInfoGrammarURI!=null){
			
				item.setToolInfoGrammarURI(toolInfoGrammarURI);
			}
		
	
 		
 		if(toolInfoModel!=null)
			item.setToolInfoModel((AnyObject)toolInfoModel.getContainedItem());
		
	
	}

	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	
	public ToolInfoHLAPI(
		 java.lang.String tool
	
		, java.lang.String version
	
		, java.lang.StringBuffer formattedXMLBuffer
	
		, java.net.URI toolInfoGrammarURI
	
		, AnyObjectHLAPI toolInfoModel
	
		, PetriNetHLAPI containerPetriNet
	){//BEGIN CONSTRUCTOR BODY
		PnmlcoremodelFactory fact = PnmlcoremodelFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createToolInfo();}
	
 		
			if(tool!=null){
			
				item.setTool(tool);
			}
		
	
 		
			if(version!=null){
			
				item.setVersion(version);
			}
		
	
 		
			if(formattedXMLBuffer!=null){
			
				item.setFormattedXMLBuffer(formattedXMLBuffer);
			}
		
	
 		
			if(toolInfoGrammarURI!=null){
			
				item.setToolInfoGrammarURI(toolInfoGrammarURI);
			}
		
	
 		
 		if(toolInfoModel!=null)
			item.setToolInfoModel((AnyObject)toolInfoModel.getContainedItem());
		
	
 		
 		if(containerPetriNet!=null)
			item.setContainerPetriNet((PetriNet)containerPetriNet.getContainedItem());
		
	
	}

	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	
	public ToolInfoHLAPI(
		 java.lang.String tool
	
		, java.lang.String version
	
		, java.lang.StringBuffer formattedXMLBuffer
	
		, java.net.URI toolInfoGrammarURI
	
		, AnyObjectHLAPI toolInfoModel
	
		, PnObjectHLAPI containerPnObject
	){//BEGIN CONSTRUCTOR BODY
		PnmlcoremodelFactory fact = PnmlcoremodelFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createToolInfo();}
	
 		
			if(tool!=null){
			
				item.setTool(tool);
			}
		
	
 		
			if(version!=null){
			
				item.setVersion(version);
			}
		
	
 		
			if(formattedXMLBuffer!=null){
			
				item.setFormattedXMLBuffer(formattedXMLBuffer);
			}
		
	
 		
			if(toolInfoGrammarURI!=null){
			
				item.setToolInfoGrammarURI(toolInfoGrammarURI);
			}
		
	
 		
 		if(toolInfoModel!=null)
			item.setToolInfoModel((AnyObject)toolInfoModel.getContainedItem());
		
	
 		
 		if(containerPnObject!=null)
			item.setContainerPnObject((PnObject)containerPnObject.getContainedItem());
		
	
	}

	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	
	public ToolInfoHLAPI(
		 java.lang.String tool
	
		, java.lang.String version
	
		, java.lang.StringBuffer formattedXMLBuffer
	
		, java.net.URI toolInfoGrammarURI
	
		, AnyObjectHLAPI toolInfoModel
	
		, LabelHLAPI containerLabel
	){//BEGIN CONSTRUCTOR BODY
		PnmlcoremodelFactory fact = PnmlcoremodelFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createToolInfo();}
	
 		
			if(tool!=null){
			
				item.setTool(tool);
			}
		
	
 		
			if(version!=null){
			
				item.setVersion(version);
			}
		
	
 		
			if(formattedXMLBuffer!=null){
			
				item.setFormattedXMLBuffer(formattedXMLBuffer);
			}
		
	
 		
			if(toolInfoGrammarURI!=null){
			
				item.setToolInfoGrammarURI(toolInfoGrammarURI);
			}
		
	
 		
 		if(toolInfoModel!=null)
			item.setToolInfoModel((AnyObject)toolInfoModel.getContainedItem());
		
	
 		
 		if(containerLabel!=null)
			item.setContainerLabel((Label)containerLabel.getContainedItem());
		
	
	}


	/**
    * This constructor give access to required stuff only (not container if any)
    */
	public ToolInfoHLAPI(
		 java.lang.String tool
	
		, java.lang.String version
	){//BEGIN CONSTRUCTOR BODY
		PnmlcoremodelFactory fact = PnmlcoremodelFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createToolInfo();}
	
 		
			if(tool!=null){
			
				item.setTool(tool);
			}
		
	
 		
			if(version!=null){
			
				item.setVersion(version);
			}
		
	
	}


	
	/**
    * This constructor give access to required stuff only (and container)
    */
	public ToolInfoHLAPI(
		 java.lang.String tool
	
		, java.lang.String version
	
		, PetriNetHLAPI containerPetriNet
	){//BEGIN CONSTRUCTOR BODY
		PnmlcoremodelFactory fact = PnmlcoremodelFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createToolInfo();}
	
 		
			if(tool!=null){
			
				item.setTool(tool);
			}
		
	
 		
			if(version!=null){
			
				item.setVersion(version);
			}
		
	
 		
 		if(containerPetriNet!=null)
			item.setContainerPetriNet((PetriNet)containerPetriNet.getContainedItem());
		
	
	}
	
	
	/**
    * This constructor give access to required stuff only (and container)
    */
	public ToolInfoHLAPI(
		 java.lang.String tool
	
		, java.lang.String version
	
		, PnObjectHLAPI containerPnObject
	){//BEGIN CONSTRUCTOR BODY
		PnmlcoremodelFactory fact = PnmlcoremodelFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createToolInfo();}
	
 		
			if(tool!=null){
			
				item.setTool(tool);
			}
		
	
 		
			if(version!=null){
			
				item.setVersion(version);
			}
		
	
 		
 		if(containerPnObject!=null)
			item.setContainerPnObject((PnObject)containerPnObject.getContainedItem());
		
	
	}
	
	
	/**
    * This constructor give access to required stuff only (and container)
    */
	public ToolInfoHLAPI(
		 java.lang.String tool
	
		, java.lang.String version
	
		, LabelHLAPI containerLabel
	){//BEGIN CONSTRUCTOR BODY
		PnmlcoremodelFactory fact = PnmlcoremodelFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createToolInfo();}
	
 		
			if(tool!=null){
			
				item.setTool(tool);
			}
		
	
 		
			if(version!=null){
			
				item.setVersion(version);
			}
		
	
 		
 		if(containerLabel!=null)
			item.setContainerLabel((Label)containerLabel.getContainedItem());
		
	
	}
	

	/**
	 * This constructor encapsulate a low level API object in HLAPI.
	 */
	public ToolInfoHLAPI(ToolInfo lowLevelAPI){
		item = lowLevelAPI;
	}

	// access to low level API
	/**
	 * Return encapsulated object
	 */
	public ToolInfo getContainedItem(){
		return item;
	}

	//getters giving LLAPI object
	
	/**
	 * Return the encapsulate Low Level API object.
	 */
	public String getTool(){
		return item.getTool();
	}
	
	/**
	 * Return the encapsulate Low Level API object.
	 */
	public String getVersion(){
		return item.getVersion();
	}
	
	/**
	 * Return the encapsulate Low Level API object.
	 */
	public StringBuffer getFormattedXMLBuffer(){
		return item.getFormattedXMLBuffer();
	}
	
	/**
	 * Return the encapsulate Low Level API object.
	 */
	public URI getToolInfoGrammarURI(){
		return item.getToolInfoGrammarURI();
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
	public PnObject getContainerPnObject(){
		return item.getContainerPnObject();
	}
	
	/**
	 * Return the encapsulate Low Level API object.
	 */
	public Label getContainerLabel(){
		return item.getContainerLabel();
	}
	
	/**
	 * Return the encapsulate Low Level API object.
	 */
	public AnyObject getToolInfoModel(){
		return item.getToolInfoModel();
	}
	

	//getters giving HLAPI object
	
	
	
	
	
	
	
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
		
		
		public PnObjectHLAPI getContainerPnObjectHLAPI(){
			if(item.getContainerPnObject() == null) return null;
			PnObject object = item.getContainerPnObject();
			
			if(object.getClass().equals(fr.lip6.move.pnml.pnmlcoremodel.impl.PageImpl.class)){
				return new fr.lip6.move.pnml.pnmlcoremodel.hlapi.PageHLAPI((fr.lip6.move.pnml.pnmlcoremodel.Page)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.pnmlcoremodel.impl.ArcImpl.class)){
				return new fr.lip6.move.pnml.pnmlcoremodel.hlapi.ArcHLAPI((fr.lip6.move.pnml.pnmlcoremodel.Arc)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.pnmlcoremodel.impl.PlaceImpl.class)){
				return new fr.lip6.move.pnml.pnmlcoremodel.hlapi.PlaceHLAPI((fr.lip6.move.pnml.pnmlcoremodel.Place)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.pnmlcoremodel.impl.RefTransitionImpl.class)){
				return new fr.lip6.move.pnml.pnmlcoremodel.hlapi.RefTransitionHLAPI((fr.lip6.move.pnml.pnmlcoremodel.RefTransition)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.pnmlcoremodel.impl.TransitionImpl.class)){
				return new fr.lip6.move.pnml.pnmlcoremodel.hlapi.TransitionHLAPI((fr.lip6.move.pnml.pnmlcoremodel.Transition)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.pnmlcoremodel.impl.RefPlaceImpl.class)){
				return new fr.lip6.move.pnml.pnmlcoremodel.hlapi.RefPlaceHLAPI((fr.lip6.move.pnml.pnmlcoremodel.RefPlace)object);
			}
			
			return null;
		}
		
	
	
	
	
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		
		
		public LabelHLAPI getContainerLabelHLAPI(){
			if(item.getContainerLabel() == null) return null;
			Label object = item.getContainerLabel();
			
			if(object.getClass().equals(fr.lip6.move.pnml.pnmlcoremodel.impl.NameImpl.class)){
				return new fr.lip6.move.pnml.pnmlcoremodel.hlapi.NameHLAPI((fr.lip6.move.pnml.pnmlcoremodel.Name)object);
			}
			
			return null;
		}
		
	
	
	
	
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		
		

	//Special getter for list of generics object, return only one object type.
	
	
	
	
	

	//setters (including container setter if aviable)
	
	
	/**
	 * set Tool
	 */
	public void setToolHLAPI(
	
	java.lang.String elem){
	
	
		if(elem!=null){
		
			item.setTool(elem);
		}
	
	}
	
	/**
	 * set Version
	 */
	public void setVersionHLAPI(
	
	java.lang.String elem){
	
	
		if(elem!=null){
		
			item.setVersion(elem);
		}
	
	}
	
	/**
	 * set FormattedXMLBuffer
	 */
	public void setFormattedXMLBufferHLAPI(
	
	java.lang.StringBuffer elem){
	
	
		if(elem!=null){
		
			item.setFormattedXMLBuffer(elem);
		}
	
	}
	
	/**
	 * set ToolInfoGrammarURI
	 */
	public void setToolInfoGrammarURIHLAPI(
	
	java.net.URI elem){
	
	
		if(elem!=null){
		
			item.setToolInfoGrammarURI(elem);
		}
	
	}
	
	/**
	 * set ToolInfoModel
	 */
	public void setToolInfoModelHLAPI(
	
	AnyObjectHLAPI elem){
	
	
 		if(elem!=null)
			item.setToolInfoModel((AnyObject)elem.getContainedItem());
	
	}
	
	/**
	 * set ContainerPetriNet
	 */
	public void setContainerPetriNetHLAPI(
	
	PetriNetHLAPI elem){
	
	
 		if(elem!=null)
			item.setContainerPetriNet((PetriNet)elem.getContainedItem());
	
	}
	
	/**
	 * set ContainerPnObject
	 */
	public void setContainerPnObjectHLAPI(
	
	PnObjectHLAPI elem){
	
	
 		if(elem!=null)
			item.setContainerPnObject((PnObject)elem.getContainedItem());
	
	}
	
	/**
	 * set ContainerLabel
	 */
	public void setContainerLabelHLAPI(
	
	LabelHLAPI elem){
	
	
 		if(elem!=null)
			item.setContainerLabel((Label)elem.getContainedItem());
	
	}
	

	//setters/remover for lists.
	

	//equals method
	public boolean equals(ToolInfoHLAPI item){
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