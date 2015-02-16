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

import java.net.URI;
import java.nio.channels.FileChannel;

import org.apache.axiom.om.OMElement;
import org.eclipse.emf.common.util.DiagnosticChain;

import fr.lip6.move.pnml.framework.hlapi.HLAPIClass;
import fr.lip6.move.pnml.framework.utils.IdRefLinker;
import fr.lip6.move.pnml.framework.utils.exception.InnerBuildException;
import fr.lip6.move.pnml.framework.utils.exception.InvalidIDException;
import fr.lip6.move.pnml.framework.utils.exception.VoidRepositoryException;
import fr.lip6.move.pnml.ptnet.AnnotationGraphics;
import fr.lip6.move.pnml.ptnet.CSS2Color;
import fr.lip6.move.pnml.ptnet.Fill;
import fr.lip6.move.pnml.ptnet.Gradient;
import fr.lip6.move.pnml.ptnet.NodeGraphics;
import fr.lip6.move.pnml.ptnet.PtnetFactory;
import fr.lip6.move.pnml.ptnet.impl.PtnetFactoryImpl;


public class FillHLAPI implements HLAPIClass{

	/**
	 * The contained LLAPI element.
	 */
	private Fill item;

	/**
	 * this constructor allows you to set all 'settable' values
	 * excepted container.
	 */
	
	public FillHLAPI(
		 CSS2ColorHLAPI color
	
		, CSS2ColorHLAPI gradientcolor
	
		, GradientHLAPI gradientrotation
	
		, java.net.URI image
	){//BEGIN CONSTRUCTOR BODY
		PtnetFactory fact = PtnetFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createFill();}
	
 		
 		if(color!=null)
			item.setColor((CSS2Color)color.getContainedItem());
		
	
 		
 		if(gradientcolor!=null)
			item.setGradientcolor((CSS2Color)gradientcolor.getContainedItem());
		
	
 		
 		if(gradientrotation!=null)
			item.setGradientrotation((Gradient)gradientrotation.getContainedItem());
		
	
 		
			if(image!=null){
			
				item.setImage(image);
			}
		
	
	}

	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	
	public FillHLAPI(
		 CSS2ColorHLAPI color
	
		, CSS2ColorHLAPI gradientcolor
	
		, GradientHLAPI gradientrotation
	
		, java.net.URI image
	
		, NodeGraphicsHLAPI containerNodeGraphics
	){//BEGIN CONSTRUCTOR BODY
		PtnetFactory fact = PtnetFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createFill();}
	
 		
 		if(color!=null)
			item.setColor((CSS2Color)color.getContainedItem());
		
	
 		
 		if(gradientcolor!=null)
			item.setGradientcolor((CSS2Color)gradientcolor.getContainedItem());
		
	
 		
 		if(gradientrotation!=null)
			item.setGradientrotation((Gradient)gradientrotation.getContainedItem());
		
	
 		
			if(image!=null){
			
				item.setImage(image);
			}
		
	
 		
 		if(containerNodeGraphics!=null)
			item.setContainerNodeGraphics((NodeGraphics)containerNodeGraphics.getContainedItem());
		
	
	}

	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	
	public FillHLAPI(
		 CSS2ColorHLAPI color
	
		, CSS2ColorHLAPI gradientcolor
	
		, GradientHLAPI gradientrotation
	
		, java.net.URI image
	
		, AnnotationGraphicsHLAPI containerAnnotationGraphics
	){//BEGIN CONSTRUCTOR BODY
		PtnetFactory fact = PtnetFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createFill();}
	
 		
 		if(color!=null)
			item.setColor((CSS2Color)color.getContainedItem());
		
	
 		
 		if(gradientcolor!=null)
			item.setGradientcolor((CSS2Color)gradientcolor.getContainedItem());
		
	
 		
 		if(gradientrotation!=null)
			item.setGradientrotation((Gradient)gradientrotation.getContainedItem());
		
	
 		
			if(image!=null){
			
				item.setImage(image);
			}
		
	
 		
 		if(containerAnnotationGraphics!=null)
			item.setContainerAnnotationGraphics((AnnotationGraphics)containerAnnotationGraphics.getContainedItem());
		
	
	}



	
	/**
    * This constructor give access to required stuff only (and container)
    */
	public FillHLAPI(
		 NodeGraphicsHLAPI containerNodeGraphics
	){//BEGIN CONSTRUCTOR BODY
		PtnetFactory fact = PtnetFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createFill();}
	
 		
 		if(containerNodeGraphics!=null)
			item.setContainerNodeGraphics((NodeGraphics)containerNodeGraphics.getContainedItem());
		
	
	}
	
	
	/**
    * This constructor give access to required stuff only (and container)
    */
	public FillHLAPI(
		 AnnotationGraphicsHLAPI containerAnnotationGraphics
	){//BEGIN CONSTRUCTOR BODY
		PtnetFactory fact = PtnetFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createFill();}
	
 		
 		if(containerAnnotationGraphics!=null)
			item.setContainerAnnotationGraphics((AnnotationGraphics)containerAnnotationGraphics.getContainedItem());
		
	
	}
	

	/**
	 * This constructor encapsulate a low level API object in HLAPI.
	 */
	public FillHLAPI(Fill lowLevelAPI){
		item = lowLevelAPI;
	}

	// access to low level API
	/**
	 * Return encapsulated object
	 */
	public Fill getContainedItem(){
		return item;
	}

	//getters giving LLAPI object
	
	/**
	 * Return the encapsulate Low Level API object.
	 */
	public CSS2Color getColor(){
		return item.getColor();
	}
	
	/**
	 * Return the encapsulate Low Level API object.
	 */
	public CSS2Color getGradientcolor(){
		return item.getGradientcolor();
	}
	
	/**
	 * Return the encapsulate Low Level API object.
	 */
	public Gradient getGradientrotation(){
		return item.getGradientrotation();
	}
	
	/**
	 * Return the encapsulate Low Level API object.
	 */
	public URI getImage(){
		return item.getImage();
	}
	
	/**
	 * Return the encapsulate Low Level API object.
	 */
	public NodeGraphics getContainerNodeGraphics(){
		return item.getContainerNodeGraphics();
	}
	
	/**
	 * Return the encapsulate Low Level API object.
	 */
	public AnnotationGraphics getContainerAnnotationGraphics(){
		return item.getContainerAnnotationGraphics();
	}
	

	//getters giving HLAPI object
	
	
	
	
	
	
	
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		
		public NodeGraphicsHLAPI getContainerNodeGraphicsHLAPI(){
			if(item.getContainerNodeGraphics() == null) return null;
			return new NodeGraphicsHLAPI(item.getContainerNodeGraphics());
		}
		
	
	
	
	
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		
		public AnnotationGraphicsHLAPI getContainerAnnotationGraphicsHLAPI(){
			if(item.getContainerAnnotationGraphics() == null) return null;
			return new AnnotationGraphicsHLAPI(item.getContainerAnnotationGraphics());
		}
		
	
	

	//Special getter for list of generics object, return only one object type.
	
	
	

	//setters (including container setter if aviable)
	
	
	/**
	 * set Color
	 */
	public void setColorHLAPI(
	
	fr.lip6.move.pnml.ptnet.CSS2Color elem){
	
	
		if(elem!=null){
		
			item.setColor(elem);
		}
	
	}
	
	/**
	 * set Gradientcolor
	 */
	public void setGradientcolorHLAPI(
	
	fr.lip6.move.pnml.ptnet.CSS2Color elem){
	
	
		if(elem!=null){
		
			item.setGradientcolor(elem);
		}
	
	}
	
	/**
	 * set Gradientrotation
	 */
	public void setGradientrotationHLAPI(
	
	fr.lip6.move.pnml.ptnet.Gradient elem){
	
	
		if(elem!=null){
		
			item.setGradientrotation(elem);
		}
	
	}
	
	/**
	 * set Image
	 */
	public void setImageHLAPI(
	
	java.net.URI elem){
	
	
		if(elem!=null){
		
			item.setImage(elem);
		}
	
	}
	
	/**
	 * set ContainerNodeGraphics
	 */
	public void setContainerNodeGraphicsHLAPI(
	
	NodeGraphicsHLAPI elem){
	
	
 		if(elem!=null)
			item.setContainerNodeGraphics((NodeGraphics)elem.getContainedItem());
	
	}
	
	/**
	 * set ContainerAnnotationGraphics
	 */
	public void setContainerAnnotationGraphicsHLAPI(
	
	AnnotationGraphicsHLAPI elem){
	
	
 		if(elem!=null)
			item.setContainerAnnotationGraphics((AnnotationGraphics)elem.getContainedItem());
	
	}
	

	//setters/remover for lists.
	

	//equals method
	public boolean equals(FillHLAPI item){
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