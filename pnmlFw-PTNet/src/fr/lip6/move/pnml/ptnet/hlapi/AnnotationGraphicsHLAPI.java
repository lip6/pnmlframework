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

import org.apache.axiom.om.OMElement;
import org.eclipse.emf.common.util.DiagnosticChain;

import fr.lip6.move.pnml.framework.hlapi.HLAPIClass;
import fr.lip6.move.pnml.framework.utils.IdRefLinker;
import fr.lip6.move.pnml.framework.utils.exception.InnerBuildException;
import fr.lip6.move.pnml.framework.utils.exception.InvalidIDException;
import fr.lip6.move.pnml.framework.utils.exception.VoidRepositoryException;
import fr.lip6.move.pnml.ptnet.Annotation;
import fr.lip6.move.pnml.ptnet.AnnotationGraphics;
import fr.lip6.move.pnml.ptnet.Fill;
import fr.lip6.move.pnml.ptnet.Font;
import fr.lip6.move.pnml.ptnet.Line;
import fr.lip6.move.pnml.ptnet.Offset;
import fr.lip6.move.pnml.ptnet.PtnetFactory;
import fr.lip6.move.pnml.ptnet.impl.PtnetFactoryImpl;


public class AnnotationGraphicsHLAPI implements HLAPIClass,GraphicsHLAPI{

	/**
	 * The contained LLAPI element.
	 */
	private AnnotationGraphics item;

	/**
	 * this constructor allows you to set all 'settable' values
	 * excepted container.
	 */
	
	public AnnotationGraphicsHLAPI(
		 OffsetHLAPI offset
	
		, FillHLAPI fill
	
		, LineHLAPI line
	
		, FontHLAPI font
	){//BEGIN CONSTRUCTOR BODY
		PtnetFactory fact = PtnetFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createAnnotationGraphics();}
	
 		
 		if(offset!=null)
			item.setOffset((Offset)offset.getContainedItem());
		
	
 		
 		if(fill!=null)
			item.setFill((Fill)fill.getContainedItem());
		
	
 		
 		if(line!=null)
			item.setLine((Line)line.getContainedItem());
		
	
 		
 		if(font!=null)
			item.setFont((Font)font.getContainedItem());
		
	
	}

	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	
	public AnnotationGraphicsHLAPI(
		 OffsetHLAPI offset
	
		, FillHLAPI fill
	
		, LineHLAPI line
	
		, FontHLAPI font
	
		, AnnotationHLAPI containerAnnotation
	){//BEGIN CONSTRUCTOR BODY
		PtnetFactory fact = PtnetFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createAnnotationGraphics();}
	
 		
 		if(offset!=null)
			item.setOffset((Offset)offset.getContainedItem());
		
	
 		
 		if(fill!=null)
			item.setFill((Fill)fill.getContainedItem());
		
	
 		
 		if(line!=null)
			item.setLine((Line)line.getContainedItem());
		
	
 		
 		if(font!=null)
			item.setFont((Font)font.getContainedItem());
		
	
 		
 		if(containerAnnotation!=null)
			item.setContainerAnnotation((Annotation)containerAnnotation.getContainedItem());
		
	
	}



	
	/**
    * This constructor give access to required stuff only (and container)
    */
	public AnnotationGraphicsHLAPI(
		 AnnotationHLAPI containerAnnotation
	){//BEGIN CONSTRUCTOR BODY
		PtnetFactory fact = PtnetFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createAnnotationGraphics();}
	
 		
 		if(containerAnnotation!=null)
			item.setContainerAnnotation((Annotation)containerAnnotation.getContainedItem());
		
	
	}
	

	/**
	 * This constructor encapsulate a low level API object in HLAPI.
	 */
	public AnnotationGraphicsHLAPI(AnnotationGraphics lowLevelAPI){
		item = lowLevelAPI;
	}

	// access to low level API
	/**
	 * Return encapsulated object
	 */
	public AnnotationGraphics getContainedItem(){
		return item;
	}

	//getters giving LLAPI object
	
	/**
	 * Return the encapsulate Low Level API object.
	 */
	public Offset getOffset(){
		return item.getOffset();
	}
	
	/**
	 * Return the encapsulate Low Level API object.
	 */
	public Fill getFill(){
		return item.getFill();
	}
	
	/**
	 * Return the encapsulate Low Level API object.
	 */
	public Line getLine(){
		return item.getLine();
	}
	
	/**
	 * Return the encapsulate Low Level API object.
	 */
	public Font getFont(){
		return item.getFont();
	}
	
	/**
	 * Return the encapsulate Low Level API object.
	 */
	public Annotation getContainerAnnotation(){
		return item.getContainerAnnotation();
	}
	

	//getters giving HLAPI object
	
	
	
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		
		public OffsetHLAPI getOffsetHLAPI(){
			if(item.getOffset() == null) return null;
			return new OffsetHLAPI(item.getOffset());
		}
		
	
	
	
	
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		
		public FillHLAPI getFillHLAPI(){
			if(item.getFill() == null) return null;
			return new FillHLAPI(item.getFill());
		}
		
	
	
	
	
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		
		public LineHLAPI getLineHLAPI(){
			if(item.getLine() == null) return null;
			return new LineHLAPI(item.getLine());
		}
		
	
	
	
	
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		
		public FontHLAPI getFontHLAPI(){
			if(item.getFont() == null) return null;
			return new FontHLAPI(item.getFont());
		}
		
	
	
	
	
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		
		
		public AnnotationHLAPI getContainerAnnotationHLAPI(){
			if(item.getContainerAnnotation() == null) return null;
			Annotation object = item.getContainerAnnotation();
			
			if(object.getClass().equals(fr.lip6.move.pnml.ptnet.impl.PTMarkingImpl.class)){
				return new fr.lip6.move.pnml.ptnet.hlapi.PTMarkingHLAPI((fr.lip6.move.pnml.ptnet.PTMarking)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.ptnet.impl.PTArcAnnotationImpl.class)){
				return new fr.lip6.move.pnml.ptnet.hlapi.PTArcAnnotationHLAPI((fr.lip6.move.pnml.ptnet.PTArcAnnotation)object);
			}
			
			if(object.getClass().equals(fr.lip6.move.pnml.ptnet.impl.NameImpl.class)){
				return new fr.lip6.move.pnml.ptnet.hlapi.NameHLAPI((fr.lip6.move.pnml.ptnet.Name)object);
			}
			
			return null;
		}
		
	
	

	//Special getter for list of generics object, return only one object type.
	
	
	
	
	
	

	//setters (including container setter if aviable)
	
	
	/**
	 * set Offset
	 */
	public void setOffsetHLAPI(
	
	OffsetHLAPI elem){
	
	
 		if(elem!=null)
			item.setOffset((Offset)elem.getContainedItem());
	
	}
	
	/**
	 * set Fill
	 */
	public void setFillHLAPI(
	
	FillHLAPI elem){
	
	
 		if(elem!=null)
			item.setFill((Fill)elem.getContainedItem());
	
	}
	
	/**
	 * set Line
	 */
	public void setLineHLAPI(
	
	LineHLAPI elem){
	
	
 		if(elem!=null)
			item.setLine((Line)elem.getContainedItem());
	
	}
	
	/**
	 * set Font
	 */
	public void setFontHLAPI(
	
	FontHLAPI elem){
	
	
 		if(elem!=null)
			item.setFont((Font)elem.getContainedItem());
	
	}
	
	/**
	 * set ContainerAnnotation
	 */
	public void setContainerAnnotationHLAPI(
	
	AnnotationHLAPI elem){
	
	
 		if(elem!=null)
			item.setContainerAnnotation((Annotation)elem.getContainedItem());
	
	}
	

	//setters/remover for lists.
	

	//equals method
	public boolean equals(AnnotationGraphicsHLAPI item){
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