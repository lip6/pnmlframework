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
 * $Id ggiffo, Tue Dec 23 11:30:48 CET 2014$
 */
package fr.lip6.move.pnml.hlpn.hlcorestructure.hlapi;

import fr.lip6.move.pnml.hlpn.arbitrarydeclarations.AnySort;
import fr.lip6.move.pnml.hlpn.arbitrarydeclarations.ArbitraryOperator;
import fr.lip6.move.pnml.hlpn.arbitrarydeclarations.ArbitrarySort;
import fr.lip6.move.pnml.hlpn.arbitrarydeclarations.Unparsed;

import fr.lip6.move.pnml.hlpn.arbitrarydeclarations.impl.ArbitrarydeclarationsFactoryImpl;

import fr.lip6.move.pnml.hlpn.booleans.And;
import fr.lip6.move.pnml.hlpn.booleans.Bool;
import fr.lip6.move.pnml.hlpn.booleans.BooleanConstant;
import fr.lip6.move.pnml.hlpn.booleans.Equality;
import fr.lip6.move.pnml.hlpn.booleans.Imply;
import fr.lip6.move.pnml.hlpn.booleans.Inequality;
import fr.lip6.move.pnml.hlpn.booleans.Not;
import fr.lip6.move.pnml.hlpn.booleans.Or;

import fr.lip6.move.pnml.hlpn.booleans.impl.BooleansFactoryImpl;

import fr.lip6.move.pnml.hlpn.cyclicEnumerations.CyclicEnumeration;
import fr.lip6.move.pnml.hlpn.cyclicEnumerations.Predecessor;
import fr.lip6.move.pnml.hlpn.cyclicEnumerations.Successor;

import fr.lip6.move.pnml.hlpn.cyclicEnumerations.impl.CyclicEnumerationsFactoryImpl;

import fr.lip6.move.pnml.hlpn.dots.Dot;
import fr.lip6.move.pnml.hlpn.dots.DotConstant;

import fr.lip6.move.pnml.hlpn.dots.impl.DotsFactoryImpl;

import fr.lip6.move.pnml.hlpn.finiteEnumerations.FEConstant;
import fr.lip6.move.pnml.hlpn.finiteEnumerations.FiniteEnumeration;

import fr.lip6.move.pnml.hlpn.finiteEnumerations.impl.FiniteEnumerationsFactoryImpl;

import fr.lip6.move.pnml.hlpn.finiteIntRanges.FiniteIntRange;
import fr.lip6.move.pnml.hlpn.finiteIntRanges.FiniteIntRangeConstant;
import fr.lip6.move.pnml.hlpn.finiteIntRanges.GreaterThan;
import fr.lip6.move.pnml.hlpn.finiteIntRanges.GreaterThanOrEqual;
import fr.lip6.move.pnml.hlpn.finiteIntRanges.LessThan;
import fr.lip6.move.pnml.hlpn.finiteIntRanges.LessThanOrEqual;

import fr.lip6.move.pnml.hlpn.finiteIntRanges.impl.FiniteIntRangesFactoryImpl;

import fr.lip6.move.pnml.hlpn.hlcorestructure.Annotation;
import fr.lip6.move.pnml.hlpn.hlcorestructure.AnnotationGraphics;
import fr.lip6.move.pnml.hlpn.hlcorestructure.AnyObject;
import fr.lip6.move.pnml.hlpn.hlcorestructure.Arc;
import fr.lip6.move.pnml.hlpn.hlcorestructure.ArcGraphics;
import fr.lip6.move.pnml.hlpn.hlcorestructure.CSS2Color;
import fr.lip6.move.pnml.hlpn.hlcorestructure.CSS2FontFamily;
import fr.lip6.move.pnml.hlpn.hlcorestructure.CSS2FontSize;
import fr.lip6.move.pnml.hlpn.hlcorestructure.CSS2FontStyle;
import fr.lip6.move.pnml.hlpn.hlcorestructure.CSS2FontWeight;
import fr.lip6.move.pnml.hlpn.hlcorestructure.Condition;
import fr.lip6.move.pnml.hlpn.hlcorestructure.Declaration;
import fr.lip6.move.pnml.hlpn.hlcorestructure.Dimension;
import fr.lip6.move.pnml.hlpn.hlcorestructure.Fill;
import fr.lip6.move.pnml.hlpn.hlcorestructure.Font;
import fr.lip6.move.pnml.hlpn.hlcorestructure.FontAlign;
import fr.lip6.move.pnml.hlpn.hlcorestructure.FontDecoration;
import fr.lip6.move.pnml.hlpn.hlcorestructure.Gradient;
import fr.lip6.move.pnml.hlpn.hlcorestructure.HLAnnotation;
import fr.lip6.move.pnml.hlpn.hlcorestructure.HLMarking;
import fr.lip6.move.pnml.hlpn.hlcorestructure.Label;
import fr.lip6.move.pnml.hlpn.hlcorestructure.Line;
import fr.lip6.move.pnml.hlpn.hlcorestructure.LineShape;
import fr.lip6.move.pnml.hlpn.hlcorestructure.LineStyle;
import fr.lip6.move.pnml.hlpn.hlcorestructure.Name;
import fr.lip6.move.pnml.hlpn.hlcorestructure.Node;
import fr.lip6.move.pnml.hlpn.hlcorestructure.NodeGraphics;
import fr.lip6.move.pnml.hlpn.hlcorestructure.Offset;
import fr.lip6.move.pnml.hlpn.hlcorestructure.PNType;
import fr.lip6.move.pnml.hlpn.hlcorestructure.Page;
import fr.lip6.move.pnml.hlpn.hlcorestructure.PetriNet;
import fr.lip6.move.pnml.hlpn.hlcorestructure.PetriNetDoc;
import fr.lip6.move.pnml.hlpn.hlcorestructure.PnObject;
import fr.lip6.move.pnml.hlpn.hlcorestructure.Position;
import fr.lip6.move.pnml.hlpn.hlcorestructure.ToolInfo;
import fr.lip6.move.pnml.hlpn.hlcorestructure.Type;

import fr.lip6.move.pnml.hlpn.hlcorestructure.impl.HlcorestructureFactoryImpl;

import fr.lip6.move.pnml.hlpn.integers.impl.IntegersFactoryImpl;

import fr.lip6.move.pnml.hlpn.lists.EmptyList;
import fr.lip6.move.pnml.hlpn.lists.HLPNList;
import fr.lip6.move.pnml.hlpn.lists.MakeList;

import fr.lip6.move.pnml.hlpn.lists.impl.ListsFactoryImpl;

import fr.lip6.move.pnml.hlpn.multisets.All;
import fr.lip6.move.pnml.hlpn.multisets.Empty;

import fr.lip6.move.pnml.hlpn.multisets.impl.MultisetsFactoryImpl;

import fr.lip6.move.pnml.hlpn.partitions.Partition;
import fr.lip6.move.pnml.hlpn.partitions.PartitionElement;

import fr.lip6.move.pnml.hlpn.partitions.impl.PartitionsFactoryImpl;

import fr.lip6.move.pnml.hlpn.strings.impl.StringsFactoryImpl;

import fr.lip6.move.pnml.hlpn.terms.Declarations;
import fr.lip6.move.pnml.hlpn.terms.MultisetSort;
import fr.lip6.move.pnml.hlpn.terms.NamedOperator;
import fr.lip6.move.pnml.hlpn.terms.NamedSort;
import fr.lip6.move.pnml.hlpn.terms.Operator;
import fr.lip6.move.pnml.hlpn.terms.ProductSort;
import fr.lip6.move.pnml.hlpn.terms.Sort;
import fr.lip6.move.pnml.hlpn.terms.Term;
import fr.lip6.move.pnml.hlpn.terms.VariableDecl;

import fr.lip6.move.pnml.hlpn.terms.impl.TermsFactoryImpl;

import java.math.BigDecimal;

import java.net.URI;

import java.util.List;

import  fr.lip6.move.pnml.framework.hlapi.*;
import fr.lip6.move.pnml.hlpn.arbitrarydeclarations.hlapi.*;
import fr.lip6.move.pnml.hlpn.booleans.hlapi.*;
import fr.lip6.move.pnml.hlpn.cyclicEnumerations.hlapi.*;
import fr.lip6.move.pnml.hlpn.dots.hlapi.*;
import fr.lip6.move.pnml.hlpn.finiteEnumerations.hlapi.*;
import fr.lip6.move.pnml.hlpn.finiteIntRanges.hlapi.*;
import fr.lip6.move.pnml.hlpn.hlcorestructure.hlapi.*;
import fr.lip6.move.pnml.hlpn.integers.hlapi.*;
import fr.lip6.move.pnml.hlpn.lists.hlapi.*;
import fr.lip6.move.pnml.hlpn.multisets.hlapi.*;
import fr.lip6.move.pnml.hlpn.partitions.hlapi.*;
import fr.lip6.move.pnml.hlpn.strings.hlapi.*;
import fr.lip6.move.pnml.hlpn.terms.hlapi.*;

import java.util.ArrayList;
import java.util.List;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import org.apache.axiom.om.*;
import fr.lip6.move.pnml.framework.utils.IdRefLinker;
import org.eclipse.emf.common.util.DiagnosticChain;
import fr.lip6.move.pnml.hlpn.hlcorestructure.*;
import fr.lip6.move.pnml.hlpn.hlcorestructure.impl.*;
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
		HlcorestructureFactory fact = HlcorestructureFactoryImpl.eINSTANCE;
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
		HlcorestructureFactory fact = HlcorestructureFactoryImpl.eINSTANCE;
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
		HlcorestructureFactory fact = HlcorestructureFactoryImpl.eINSTANCE;
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
	
	fr.lip6.move.pnml.hlpn.hlcorestructure.FontAlign elem){
	
	
		if(elem!=null){
		
			item.setAlign(elem);
		}
	
	}
	
	/**
	 * set Decoration
	 */
	public void setDecorationHLAPI(
	
	fr.lip6.move.pnml.hlpn.hlcorestructure.FontDecoration elem){
	
	
		if(elem!=null){
		
			item.setDecoration(elem);
		}
	
	}
	
	/**
	 * set Family
	 */
	public void setFamilyHLAPI(
	
	fr.lip6.move.pnml.hlpn.hlcorestructure.CSS2FontFamily elem){
	
	
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
	
	fr.lip6.move.pnml.hlpn.hlcorestructure.CSS2FontSize elem){
	
	
		if(elem!=null){
		
			item.setSize(elem);
		}
	
	}
	
	/**
	 * set Style
	 */
	public void setStyleHLAPI(
	
	fr.lip6.move.pnml.hlpn.hlcorestructure.CSS2FontStyle elem){
	
	
		if(elem!=null){
		
			item.setStyle(elem);
		}
	
	}
	
	/**
	 * set Weight
	 */
	public void setWeightHLAPI(
	
	fr.lip6.move.pnml.hlpn.hlcorestructure.CSS2FontWeight elem){
	
	
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