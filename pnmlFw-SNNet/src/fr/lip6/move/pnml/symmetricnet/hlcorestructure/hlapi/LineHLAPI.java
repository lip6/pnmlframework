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
 * $Id ggiffo, Tue Dec 23 11:30:47 CET 2014$
 */
package fr.lip6.move.pnml.symmetricnet.hlcorestructure.hlapi;

import fr.lip6.move.pnml.symmetricnet.booleans.And;
import fr.lip6.move.pnml.symmetricnet.booleans.Bool;
import fr.lip6.move.pnml.symmetricnet.booleans.BooleanConstant;
import fr.lip6.move.pnml.symmetricnet.booleans.Equality;
import fr.lip6.move.pnml.symmetricnet.booleans.Imply;
import fr.lip6.move.pnml.symmetricnet.booleans.Inequality;
import fr.lip6.move.pnml.symmetricnet.booleans.Not;
import fr.lip6.move.pnml.symmetricnet.booleans.Or;

import fr.lip6.move.pnml.symmetricnet.booleans.impl.BooleansFactoryImpl;

import fr.lip6.move.pnml.symmetricnet.cyclicEnumerations.CyclicEnumeration;
import fr.lip6.move.pnml.symmetricnet.cyclicEnumerations.Predecessor;
import fr.lip6.move.pnml.symmetricnet.cyclicEnumerations.Successor;

import fr.lip6.move.pnml.symmetricnet.cyclicEnumerations.impl.CyclicEnumerationsFactoryImpl;

import fr.lip6.move.pnml.symmetricnet.dots.Dot;
import fr.lip6.move.pnml.symmetricnet.dots.DotConstant;

import fr.lip6.move.pnml.symmetricnet.dots.impl.DotsFactoryImpl;

import fr.lip6.move.pnml.symmetricnet.finiteEnumerations.FEConstant;
import fr.lip6.move.pnml.symmetricnet.finiteEnumerations.FiniteEnumeration;

import fr.lip6.move.pnml.symmetricnet.finiteEnumerations.impl.FiniteEnumerationsFactoryImpl;

import fr.lip6.move.pnml.symmetricnet.finiteIntRanges.FiniteIntRange;
import fr.lip6.move.pnml.symmetricnet.finiteIntRanges.FiniteIntRangeConstant;
import fr.lip6.move.pnml.symmetricnet.finiteIntRanges.GreaterThan;
import fr.lip6.move.pnml.symmetricnet.finiteIntRanges.GreaterThanOrEqual;
import fr.lip6.move.pnml.symmetricnet.finiteIntRanges.LessThan;
import fr.lip6.move.pnml.symmetricnet.finiteIntRanges.LessThanOrEqual;

import fr.lip6.move.pnml.symmetricnet.finiteIntRanges.impl.FiniteIntRangesFactoryImpl;

import fr.lip6.move.pnml.symmetricnet.hlcorestructure.Annotation;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.AnnotationGraphics;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.AnyObject;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.ArcGraphics;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.CSS2Color;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.Condition;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.Declaration;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.Dimension;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.Fill;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.Font;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.Gradient;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.HLAnnotation;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.HLMarking;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.Label;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.Line;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.LineShape;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.LineStyle;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.Name;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.Node;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.NodeGraphics;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.Offset;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.PNType;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.Page;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.PetriNet;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.PetriNetDoc;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.PnObject;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.Position;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.ToolInfo;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.Type;

import fr.lip6.move.pnml.symmetricnet.hlcorestructure.impl.HlcorestructureFactoryImpl;

import fr.lip6.move.pnml.symmetricnet.integers.impl.IntegersFactoryImpl;

import fr.lip6.move.pnml.symmetricnet.multisets.All;
import fr.lip6.move.pnml.symmetricnet.multisets.Empty;

import fr.lip6.move.pnml.symmetricnet.multisets.impl.MultisetsFactoryImpl;

import fr.lip6.move.pnml.symmetricnet.partitions.Partition;
import fr.lip6.move.pnml.symmetricnet.partitions.PartitionElement;

import fr.lip6.move.pnml.symmetricnet.partitions.impl.PartitionsFactoryImpl;

import fr.lip6.move.pnml.symmetricnet.terms.Declarations;
import fr.lip6.move.pnml.symmetricnet.terms.MultisetSort;
import fr.lip6.move.pnml.symmetricnet.terms.NamedOperator;
import fr.lip6.move.pnml.symmetricnet.terms.NamedSort;
import fr.lip6.move.pnml.symmetricnet.terms.Operator;
import fr.lip6.move.pnml.symmetricnet.terms.ProductSort;
import fr.lip6.move.pnml.symmetricnet.terms.Sort;
import fr.lip6.move.pnml.symmetricnet.terms.Term;
import fr.lip6.move.pnml.symmetricnet.terms.VariableDecl;

import fr.lip6.move.pnml.symmetricnet.terms.impl.TermsFactoryImpl;

import java.net.URI;

import java.util.List;

import  fr.lip6.move.pnml.framework.hlapi.*;
import fr.lip6.move.pnml.symmetricnet.booleans.hlapi.*;
import fr.lip6.move.pnml.symmetricnet.cyclicEnumerations.hlapi.*;
import fr.lip6.move.pnml.symmetricnet.dots.hlapi.*;
import fr.lip6.move.pnml.symmetricnet.finiteEnumerations.hlapi.*;
import fr.lip6.move.pnml.symmetricnet.finiteIntRanges.hlapi.*;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.hlapi.*;
import fr.lip6.move.pnml.symmetricnet.integers.hlapi.*;
import fr.lip6.move.pnml.symmetricnet.multisets.hlapi.*;
import fr.lip6.move.pnml.symmetricnet.partitions.hlapi.*;
import fr.lip6.move.pnml.symmetricnet.terms.hlapi.*;

import java.util.ArrayList;
import java.util.List;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import org.apache.axiom.om.*;
import fr.lip6.move.pnml.framework.utils.IdRefLinker;
import org.eclipse.emf.common.util.DiagnosticChain;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.*;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.impl.*;
import fr.lip6.move.pnml.framework.utils.exception.InnerBuildException;
import fr.lip6.move.pnml.framework.utils.exception.InvalidIDException;
import fr.lip6.move.pnml.framework.utils.exception.VoidRepositoryException;
import fr.lip6.move.pnml.framework.utils.exception.OtherException;
import fr.lip6.move.pnml.framework.utils.IdRepository;
import fr.lip6.move.pnml.framework.utils.ModelRepository;


public class LineHLAPI implements HLAPIClass{

	/**
	 * The contained LLAPI element.
	 */
	private Line item;

	/**
	 * this constructor allows you to set all 'settable' values
	 * excepted container.
	 */
	
	public LineHLAPI(
		 CSS2ColorHLAPI color
	
		, LineShapeHLAPI shape
	
		, java.lang.Integer width
	
		, LineStyleHLAPI style
	){//BEGIN CONSTRUCTOR BODY
		HlcorestructureFactory fact = HlcorestructureFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createLine();}
	
 		
 		if(color!=null)
			item.setColor((CSS2Color)color.getContainedItem());
		
	
 		
 		if(shape!=null)
			item.setShape((LineShape)shape.getContainedItem());
		
	
 		
			if(width!=null){
			
				item.setWidth(width);
			}
		
	
 		
 		if(style!=null)
			item.setStyle((LineStyle)style.getContainedItem());
		
	
	}

	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	
	public LineHLAPI(
		 CSS2ColorHLAPI color
	
		, LineShapeHLAPI shape
	
		, java.lang.Integer width
	
		, LineStyleHLAPI style
	
		, NodeGraphicsHLAPI containerNodeGraphics
	){//BEGIN CONSTRUCTOR BODY
		HlcorestructureFactory fact = HlcorestructureFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createLine();}
	
 		
 		if(color!=null)
			item.setColor((CSS2Color)color.getContainedItem());
		
	
 		
 		if(shape!=null)
			item.setShape((LineShape)shape.getContainedItem());
		
	
 		
			if(width!=null){
			
				item.setWidth(width);
			}
		
	
 		
 		if(style!=null)
			item.setStyle((LineStyle)style.getContainedItem());
		
	
 		
 		if(containerNodeGraphics!=null)
			item.setContainerNodeGraphics((NodeGraphics)containerNodeGraphics.getContainedItem());
		
	
	}

	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	
	public LineHLAPI(
		 CSS2ColorHLAPI color
	
		, LineShapeHLAPI shape
	
		, java.lang.Integer width
	
		, LineStyleHLAPI style
	
		, ArcGraphicsHLAPI containerArcGraphics
	){//BEGIN CONSTRUCTOR BODY
		HlcorestructureFactory fact = HlcorestructureFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createLine();}
	
 		
 		if(color!=null)
			item.setColor((CSS2Color)color.getContainedItem());
		
	
 		
 		if(shape!=null)
			item.setShape((LineShape)shape.getContainedItem());
		
	
 		
			if(width!=null){
			
				item.setWidth(width);
			}
		
	
 		
 		if(style!=null)
			item.setStyle((LineStyle)style.getContainedItem());
		
	
 		
 		if(containerArcGraphics!=null)
			item.setContainerArcGraphics((ArcGraphics)containerArcGraphics.getContainedItem());
		
	
	}

	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	
	public LineHLAPI(
		 CSS2ColorHLAPI color
	
		, LineShapeHLAPI shape
	
		, java.lang.Integer width
	
		, LineStyleHLAPI style
	
		, AnnotationGraphicsHLAPI containerAnnotationGraphics
	){//BEGIN CONSTRUCTOR BODY
		HlcorestructureFactory fact = HlcorestructureFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createLine();}
	
 		
 		if(color!=null)
			item.setColor((CSS2Color)color.getContainedItem());
		
	
 		
 		if(shape!=null)
			item.setShape((LineShape)shape.getContainedItem());
		
	
 		
			if(width!=null){
			
				item.setWidth(width);
			}
		
	
 		
 		if(style!=null)
			item.setStyle((LineStyle)style.getContainedItem());
		
	
 		
 		if(containerAnnotationGraphics!=null)
			item.setContainerAnnotationGraphics((AnnotationGraphics)containerAnnotationGraphics.getContainedItem());
		
	
	}



	
	/**
    * This constructor give access to required stuff only (and container)
    */
	public LineHLAPI(
		 NodeGraphicsHLAPI containerNodeGraphics
	){//BEGIN CONSTRUCTOR BODY
		HlcorestructureFactory fact = HlcorestructureFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createLine();}
	
 		
 		if(containerNodeGraphics!=null)
			item.setContainerNodeGraphics((NodeGraphics)containerNodeGraphics.getContainedItem());
		
	
	}
	
	
	/**
    * This constructor give access to required stuff only (and container)
    */
	public LineHLAPI(
		 ArcGraphicsHLAPI containerArcGraphics
	){//BEGIN CONSTRUCTOR BODY
		HlcorestructureFactory fact = HlcorestructureFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createLine();}
	
 		
 		if(containerArcGraphics!=null)
			item.setContainerArcGraphics((ArcGraphics)containerArcGraphics.getContainedItem());
		
	
	}
	
	
	/**
    * This constructor give access to required stuff only (and container)
    */
	public LineHLAPI(
		 AnnotationGraphicsHLAPI containerAnnotationGraphics
	){//BEGIN CONSTRUCTOR BODY
		HlcorestructureFactory fact = HlcorestructureFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createLine();}
	
 		
 		if(containerAnnotationGraphics!=null)
			item.setContainerAnnotationGraphics((AnnotationGraphics)containerAnnotationGraphics.getContainedItem());
		
	
	}
	

	/**
	 * This constructor encapsulate a low level API object in HLAPI.
	 */
	public LineHLAPI(Line lowLevelAPI){
		item = lowLevelAPI;
	}

	// access to low level API
	/**
	 * Return encapsulated object
	 */
	public Line getContainedItem(){
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
	public LineShape getShape(){
		return item.getShape();
	}
	
	/**
	 * Return the encapsulate Low Level API object.
	 */
	public Integer getWidth(){
		return item.getWidth();
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
	public ArcGraphics getContainerArcGraphics(){
		return item.getContainerArcGraphics();
	}
	
	/**
	 * Return the encapsulate Low Level API object.
	 */
	public AnnotationGraphics getContainerAnnotationGraphics(){
		return item.getContainerAnnotationGraphics();
	}
	
	/**
	 * Return the encapsulate Low Level API object.
	 */
	public LineStyle getStyle(){
		return item.getStyle();
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
		
		public ArcGraphicsHLAPI getContainerArcGraphicsHLAPI(){
			if(item.getContainerArcGraphics() == null) return null;
			return new ArcGraphicsHLAPI(item.getContainerArcGraphics());
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
	
	fr.lip6.move.pnml.symmetricnet.hlcorestructure.CSS2Color elem){
	
	
		if(elem!=null){
		
			item.setColor(elem);
		}
	
	}
	
	/**
	 * set Shape
	 */
	public void setShapeHLAPI(
	
	fr.lip6.move.pnml.symmetricnet.hlcorestructure.LineShape elem){
	
	
		if(elem!=null){
		
			item.setShape(elem);
		}
	
	}
	
	/**
	 * set Width
	 */
	public void setWidthHLAPI(
	
	java.lang.Integer elem){
	
	
		if(elem!=null){
		
			item.setWidth(elem);
		}
	
	}
	
	/**
	 * set Style
	 */
	public void setStyleHLAPI(
	
	fr.lip6.move.pnml.symmetricnet.hlcorestructure.LineStyle elem){
	
	
		if(elem!=null){
		
			item.setStyle(elem);
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
	 * set ContainerArcGraphics
	 */
	public void setContainerArcGraphicsHLAPI(
	
	ArcGraphicsHLAPI elem){
	
	
 		if(elem!=null)
			item.setContainerArcGraphics((ArcGraphics)elem.getContainedItem());
	
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
	public boolean equals(LineHLAPI item){
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