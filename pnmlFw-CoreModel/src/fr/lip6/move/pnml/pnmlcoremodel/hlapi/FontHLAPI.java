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
 * $Id ggiffo, Wed Feb 10 14:59:10 CET 2016$
 */
package fr.lip6.move.pnml.pnmlcoremodel.hlapi;

import fr.lip6.move.pnml.pnmlcoremodel.Annotation;
import fr.lip6.move.pnml.pnmlcoremodel.AnnotationGraphics;
import fr.lip6.move.pnml.pnmlcoremodel.AnyObject;
import fr.lip6.move.pnml.pnmlcoremodel.Arc;
import fr.lip6.move.pnml.pnmlcoremodel.ArcGraphics;
import fr.lip6.move.pnml.pnmlcoremodel.CSS2Color;
import fr.lip6.move.pnml.pnmlcoremodel.CSS2FontFamily;
import fr.lip6.move.pnml.pnmlcoremodel.CSS2FontSize;
import fr.lip6.move.pnml.pnmlcoremodel.CSS2FontStyle;
import fr.lip6.move.pnml.pnmlcoremodel.CSS2FontWeight;
import fr.lip6.move.pnml.pnmlcoremodel.Dimension;
import fr.lip6.move.pnml.pnmlcoremodel.Fill;
import fr.lip6.move.pnml.pnmlcoremodel.Font;
import fr.lip6.move.pnml.pnmlcoremodel.FontAlign;
import fr.lip6.move.pnml.pnmlcoremodel.FontDecoration;
import fr.lip6.move.pnml.pnmlcoremodel.Gradient;
import fr.lip6.move.pnml.pnmlcoremodel.Label;
import fr.lip6.move.pnml.pnmlcoremodel.Line;
import fr.lip6.move.pnml.pnmlcoremodel.LineShape;
import fr.lip6.move.pnml.pnmlcoremodel.LineStyle;
import fr.lip6.move.pnml.pnmlcoremodel.Name;
import fr.lip6.move.pnml.pnmlcoremodel.Node;
import fr.lip6.move.pnml.pnmlcoremodel.NodeGraphics;
import fr.lip6.move.pnml.pnmlcoremodel.Offset;
import fr.lip6.move.pnml.pnmlcoremodel.PNType;
import fr.lip6.move.pnml.pnmlcoremodel.Page;
import fr.lip6.move.pnml.pnmlcoremodel.PetriNet;
import fr.lip6.move.pnml.pnmlcoremodel.PetriNetDoc;
import fr.lip6.move.pnml.pnmlcoremodel.PnObject;
import fr.lip6.move.pnml.pnmlcoremodel.Position;
import fr.lip6.move.pnml.pnmlcoremodel.ToolInfo;

import fr.lip6.move.pnml.pnmlcoremodel.impl.PnmlcoremodelFactoryImpl;

import java.math.BigDecimal;

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


public class FontHLAPI implements HLAPIClass{

	/**
	 * The contained LLAPI element.
	 */
	private Font item;

	/**
	 * this constructor allows you to set all 'settable' values
	 * excepted container.
	 */
	
	public FontHLAPI(
		 FontAlignHLAPI align
	
		, FontDecorationHLAPI decoration
	
		, CSS2FontFamilyHLAPI family
	
		, java.math.BigDecimal rotation
	
		, CSS2FontSizeHLAPI size
	
		, CSS2FontStyleHLAPI style
	
		, CSS2FontWeightHLAPI weight
	){//BEGIN CONSTRUCTOR BODY
		PnmlcoremodelFactory fact = PnmlcoremodelFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createFont();}
	
 		
 		if(align!=null)
			item.setAlign((FontAlign)align.getContainedItem());
		
	
 		
 		if(decoration!=null)
			item.setDecoration((FontDecoration)decoration.getContainedItem());
		
	
 		
 		if(family!=null)
			item.setFamily((CSS2FontFamily)family.getContainedItem());
		
	
 		
			if(rotation!=null){
			
				item.setRotation(rotation);
			}
		
	
 		
 		if(size!=null)
			item.setSize((CSS2FontSize)size.getContainedItem());
		
	
 		
 		if(style!=null)
			item.setStyle((CSS2FontStyle)style.getContainedItem());
		
	
 		
 		if(weight!=null)
			item.setWeight((CSS2FontWeight)weight.getContainedItem());
		
	
	}

	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	
	public FontHLAPI(
		 FontAlignHLAPI align
	
		, FontDecorationHLAPI decoration
	
		, CSS2FontFamilyHLAPI family
	
		, java.math.BigDecimal rotation
	
		, CSS2FontSizeHLAPI size
	
		, CSS2FontStyleHLAPI style
	
		, CSS2FontWeightHLAPI weight
	
		, AnnotationGraphicsHLAPI containerAnnotationGraphics
	){//BEGIN CONSTRUCTOR BODY
		PnmlcoremodelFactory fact = PnmlcoremodelFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createFont();}
	
 		
 		if(align!=null)
			item.setAlign((FontAlign)align.getContainedItem());
		
	
 		
 		if(decoration!=null)
			item.setDecoration((FontDecoration)decoration.getContainedItem());
		
	
 		
 		if(family!=null)
			item.setFamily((CSS2FontFamily)family.getContainedItem());
		
	
 		
			if(rotation!=null){
			
				item.setRotation(rotation);
			}
		
	
 		
 		if(size!=null)
			item.setSize((CSS2FontSize)size.getContainedItem());
		
	
 		
 		if(style!=null)
			item.setStyle((CSS2FontStyle)style.getContainedItem());
		
	
 		
 		if(weight!=null)
			item.setWeight((CSS2FontWeight)weight.getContainedItem());
		
	
 		
 		if(containerAnnotationGraphics!=null)
			item.setContainerAnnotationGraphics((AnnotationGraphics)containerAnnotationGraphics.getContainedItem());
		
	
	}



	
	/**
    * This constructor give access to required stuff only (and container)
    */
	public FontHLAPI(
		 AnnotationGraphicsHLAPI containerAnnotationGraphics
	){//BEGIN CONSTRUCTOR BODY
		PnmlcoremodelFactory fact = PnmlcoremodelFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createFont();}
	
 		
 		if(containerAnnotationGraphics!=null)
			item.setContainerAnnotationGraphics((AnnotationGraphics)containerAnnotationGraphics.getContainedItem());
		
	
	}
	

	/**
	 * This constructor encapsulate a low level API object in HLAPI.
	 */
	public FontHLAPI(Font lowLevelAPI){
		item = lowLevelAPI;
	}

	// access to low level API
	/**
	 * Return encapsulated object
	 */
	public Font getContainedItem(){
		return item;
	}

	//getters giving LLAPI object
	
	/**
	 * Return the encapsulate Low Level API object.
	 */
	public FontAlign getAlign(){
		return item.getAlign();
	}
	
	/**
	 * Return the encapsulate Low Level API object.
	 */
	public FontDecoration getDecoration(){
		return item.getDecoration();
	}
	
	/**
	 * Return the encapsulate Low Level API object.
	 */
	public CSS2FontFamily getFamily(){
		return item.getFamily();
	}
	
	/**
	 * Return the encapsulate Low Level API object.
	 */
	public BigDecimal getRotation(){
		return item.getRotation();
	}
	
	/**
	 * Return the encapsulate Low Level API object.
	 */
	public CSS2FontSize getSize(){
		return item.getSize();
	}
	
	/**
	 * Return the encapsulate Low Level API object.
	 */
	public CSS2FontStyle getStyle(){
		return item.getStyle();
	}
	
	/**
	 * Return the encapsulate Low Level API object.
	 */
	public CSS2FontWeight getWeight(){
		return item.getWeight();
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
		
		public AnnotationGraphicsHLAPI getContainerAnnotationGraphicsHLAPI(){
			if(item.getContainerAnnotationGraphics() == null) return null;
			return new AnnotationGraphicsHLAPI(item.getContainerAnnotationGraphics());
		}
		
	
	

	//Special getter for list of generics object, return only one object type.
	
	

	//setters (including container setter if aviable)
	
	
	/**
	 * set Align
	 */
	public void setAlignHLAPI(
	
	fr.lip6.move.pnml.pnmlcoremodel.FontAlign elem){
	
	
		if(elem!=null){
		
			item.setAlign(elem);
		}
	
	}
	
	/**
	 * set Decoration
	 */
	public void setDecorationHLAPI(
	
	fr.lip6.move.pnml.pnmlcoremodel.FontDecoration elem){
	
	
		if(elem!=null){
		
			item.setDecoration(elem);
		}
	
	}
	
	/**
	 * set Family
	 */
	public void setFamilyHLAPI(
	
	fr.lip6.move.pnml.pnmlcoremodel.CSS2FontFamily elem){
	
	
		if(elem!=null){
		
			item.setFamily(elem);
		}
	
	}
	
	/**
	 * set Rotation
	 */
	public void setRotationHLAPI(
	
	java.math.BigDecimal elem){
	
	
		if(elem!=null){
		
			item.setRotation(elem);
		}
	
	}
	
	/**
	 * set Size
	 */
	public void setSizeHLAPI(
	
	fr.lip6.move.pnml.pnmlcoremodel.CSS2FontSize elem){
	
	
		if(elem!=null){
		
			item.setSize(elem);
		}
	
	}
	
	/**
	 * set Style
	 */
	public void setStyleHLAPI(
	
	fr.lip6.move.pnml.pnmlcoremodel.CSS2FontStyle elem){
	
	
		if(elem!=null){
		
			item.setStyle(elem);
		}
	
	}
	
	/**
	 * set Weight
	 */
	public void setWeightHLAPI(
	
	fr.lip6.move.pnml.pnmlcoremodel.CSS2FontWeight elem){
	
	
		if(elem!=null){
		
			item.setWeight(elem);
		}
	
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
	public boolean equals(FontHLAPI item){
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