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
 * $Id ggiffo, Thu Jan 02 00:08:30 CET 2014$
 */
package fr.lip6.move.pnml.pthlpng.hlcorestructure.hlapi;

import fr.lip6.move.pnml.pthlpng.booleans.And;
import fr.lip6.move.pnml.pthlpng.booleans.Bool;
import fr.lip6.move.pnml.pthlpng.booleans.BooleanConstant;
import fr.lip6.move.pnml.pthlpng.booleans.Equality;
import fr.lip6.move.pnml.pthlpng.booleans.Imply;
import fr.lip6.move.pnml.pthlpng.booleans.Inequality;
import fr.lip6.move.pnml.pthlpng.booleans.Not;
import fr.lip6.move.pnml.pthlpng.booleans.Or;

import fr.lip6.move.pnml.pthlpng.booleans.impl.BooleansFactoryImpl;

import fr.lip6.move.pnml.pthlpng.dots.Dot;
import fr.lip6.move.pnml.pthlpng.dots.DotConstant;

import fr.lip6.move.pnml.pthlpng.dots.impl.DotsFactoryImpl;

import fr.lip6.move.pnml.pthlpng.hlcorestructure.Annotation;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.AnnotationGraphics;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.AnyObject;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.ArcGraphics;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.Condition;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.Declaration;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.Dimension;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.Fill;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.Font;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.HLAnnotation;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.HLMarking;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.Label;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.Line;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.Name;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.Node;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.NodeGraphics;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.Offset;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.PNType;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.Page;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.PetriNet;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.PetriNetDoc;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.PnObject;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.Position;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.ToolInfo;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.Type;

import fr.lip6.move.pnml.pthlpng.hlcorestructure.impl.HlcorestructureFactoryImpl;

import fr.lip6.move.pnml.pthlpng.multisets.All;
import fr.lip6.move.pnml.pthlpng.multisets.Empty;

import fr.lip6.move.pnml.pthlpng.multisets.impl.MultisetsFactoryImpl;

import fr.lip6.move.pnml.pthlpng.partitions.Partition;
import fr.lip6.move.pnml.pthlpng.partitions.PartitionElement;

import fr.lip6.move.pnml.pthlpng.partitions.impl.PartitionsFactoryImpl;

import fr.lip6.move.pnml.pthlpng.terms.MultisetSort;
import fr.lip6.move.pnml.pthlpng.terms.NamedOperator;
import fr.lip6.move.pnml.pthlpng.terms.NamedSort;
import fr.lip6.move.pnml.pthlpng.terms.Operator;
import fr.lip6.move.pnml.pthlpng.terms.ProductSort;
import fr.lip6.move.pnml.pthlpng.terms.Sort;
import fr.lip6.move.pnml.pthlpng.terms.Term;
import fr.lip6.move.pnml.pthlpng.terms.VariableDecl;

import fr.lip6.move.pnml.pthlpng.terms.impl.TermsFactoryImpl;

import java.net.URI;

import java.util.List;

import  fr.lip6.move.pnml.framework.hlapi.*;
import fr.lip6.move.pnml.pthlpng.booleans.hlapi.*;
import fr.lip6.move.pnml.pthlpng.dots.hlapi.*;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.hlapi.*;
import fr.lip6.move.pnml.pthlpng.multisets.hlapi.*;
import fr.lip6.move.pnml.pthlpng.partitions.hlapi.*;
import fr.lip6.move.pnml.pthlpng.terms.hlapi.*;

import java.util.ArrayList;
import java.util.List;
import org.apache.axiom.om.*;
import fr.lip6.move.pnml.framework.utils.IdRefLinker;
import org.eclipse.emf.common.util.DiagnosticChain;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.*;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.impl.*;
import fr.lip6.move.pnml.framework.utils.exception.InnerBuildException;
import fr.lip6.move.pnml.framework.utils.exception.InvalidIDException;
import fr.lip6.move.pnml.framework.utils.exception.VoidRepositoryException;
import fr.lip6.move.pnml.framework.utils.IdRepository;
import fr.lip6.move.pnml.framework.utils.ModelRepository;
import org.testng.annotations.*;
public class AnnotationGraphicsHLAPITest {

	
	private OffsetHLAPI itemoffset;
		
	private FillHLAPI itemfill;
		
	private LineHLAPI itemline;
		
	private FontHLAPI itemfont;
		
	
	private AnnotationHLAPI itemcontainerAnnotation;
	


	@AfterTest(groups = { "AnnotationGraphicsHLAPI", "hlapi" })
	public void After() {
	    System.out.println("done for "+"AnnotationGraphicsHLAPI(hlcorestructure)");
	}


	@BeforeMethod(groups = { "AnnotationGraphicsHLAPI", "hlapi" })
	public void setup() throws Exception{
	//ModelRepository.reset(); ModelRepository.getInstance().createDocumentWorkspace("void");
	ModelRepository mr = ModelRepository.getInstance();
	mr.createDocumentWorkspace("void");
	
			
			//HlcorestructureFactoryImpl
			itemoffset = new OffsetHLAPI(new HlcorestructureFactoryImpl().createOffset());
			
		
			
			//HlcorestructureFactoryImpl
			itemfill = new FillHLAPI(new HlcorestructureFactoryImpl().createFill());
			
		
			
			//HlcorestructureFactoryImpl
			itemline = new LineHLAPI(new HlcorestructureFactoryImpl().createLine());
			
		
			
			//HlcorestructureFactoryImpl
			itemfont = new FontHLAPI(new HlcorestructureFactoryImpl().createFont());
			
		

	
		
			
			
		itemcontainerAnnotation = new fr.lip6.move.pnml.pthlpng.hlcorestructure.hlapi.NameHLAPI(
		   new HlcorestructureFactoryImpl().createName()
		);
			
		
	
	}

	/**
	 * this constructor allows you to set all 'settable' values
	 * excepted container.
	 */
	@Test(groups = { "hlapi", "AnnotationGraphicsHLAPI"}, dependsOnMethods={"AnnotationGraphicsHLAPI_LLAPI"})
	public void AnnotationGraphicsHLAPI_1(){//BEGIN CONSTRUCTOR BODY
   @SuppressWarnings("unused")
	AnnotationGraphicsHLAPI totest = new AnnotationGraphicsHLAPI(
		itemoffset
		,	
		itemfill
		,	
		itemline
		,	
		itemfont
	);
	
	
	
	assert totest.getOffset().equals(itemoffset.getContainedItem());
	
	
	
	
	assert totest.getFill().equals(itemfill.getContainedItem());
	
	
	
	
	assert totest.getLine().equals(itemline.getContainedItem());
	
	
	
	
	assert totest.getFont().equals(itemfont.getContainedItem());
	
	
	}

	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "AnnotationGraphicsHLAPI"}, dependsOnMethods={"AnnotationGraphicsHLAPI_LLAPI"})
	public void AnnotationGraphicsHLAPI_2_containerAnnotation(){//BEGIN CONSTRUCTOR BODY

	AnnotationGraphicsHLAPI totest = new AnnotationGraphicsHLAPI(
		itemoffset
		,	
		itemfill
		,	
		itemline
		,	
		itemfont
	,	
		itemcontainerAnnotation
	);
	
	
		
			assert totest.getOffset().equals(itemoffset.getContainedItem());
		
	
	
		
			assert totest.getFill().equals(itemfill.getContainedItem());
		
	
	
		
			assert totest.getLine().equals(itemline.getContainedItem());
		
	
	
		
			assert totest.getFont().equals(itemfont.getContainedItem());
		
	
	assert totest.getContainerAnnotation().equals(itemcontainerAnnotation.getContainedItem());
	}

	/**
    * This constructor give access to required stuff only (not container if any)
    */

	/**
    * This constructor give access to required stuff only (and container)
    */
   @Test(groups = { "hlapi", "AnnotationGraphicsHLAPI"}, dependsOnMethods={"AnnotationGraphicsHLAPI_LLAPI"})
	public void AnnotationGraphicsHLAPI_4_containerAnnotation(){//BEGIN CONSTRUCTOR BODY

	AnnotationGraphicsHLAPI totest = new AnnotationGraphicsHLAPI(
	  itemcontainerAnnotation
	);

	
	assert totest.getContainerAnnotation().equals(itemcontainerAnnotation.getContainedItem());
	}


	/**
	 * This constructor encapsulate a low level API object in HLAPI.
	 */
	@Test(groups = { "hlapi", "AnnotationGraphicsHLAPI"})
	public void AnnotationGraphicsHLAPI_LLAPI(){
	   AnnotationGraphics llapi = new HlcorestructureFactoryImpl().createAnnotationGraphics();
	   fr.lip6.move.pnml.pthlpng.hlcorestructure.hlapi.AnnotationGraphicsHLAPI hlapi = new AnnotationGraphicsHLAPI(llapi);
		assert hlapi.getContainedItem().equals(llapi);
	}

	//getters giving HLAPI object
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "AnnotationGraphicsHLAPI"})
		public void getOffsetHLAPITest(){
			AnnotationGraphicsHLAPI elem = new AnnotationGraphicsHLAPI(new HlcorestructureFactoryImpl().createAnnotationGraphics());

			
				elem.setOffsetHLAPI(itemoffset);
				OffsetHLAPI totest = elem.getOffsetHLAPI();
				assert totest.getContainedItem().equals(elem.getOffset());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "AnnotationGraphicsHLAPI"})
		public void getFillHLAPITest(){
			AnnotationGraphicsHLAPI elem = new AnnotationGraphicsHLAPI(new HlcorestructureFactoryImpl().createAnnotationGraphics());

			
				elem.setFillHLAPI(itemfill);
				FillHLAPI totest = elem.getFillHLAPI();
				assert totest.getContainedItem().equals(elem.getFill());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "AnnotationGraphicsHLAPI"})
		public void getLineHLAPITest(){
			AnnotationGraphicsHLAPI elem = new AnnotationGraphicsHLAPI(new HlcorestructureFactoryImpl().createAnnotationGraphics());

			
				elem.setLineHLAPI(itemline);
				LineHLAPI totest = elem.getLineHLAPI();
				assert totest.getContainedItem().equals(elem.getLine());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "AnnotationGraphicsHLAPI"})
		public void getFontHLAPITest(){
			AnnotationGraphicsHLAPI elem = new AnnotationGraphicsHLAPI(new HlcorestructureFactoryImpl().createAnnotationGraphics());

			
				elem.setFontHLAPI(itemfont);
				FontHLAPI totest = elem.getFontHLAPI();
				assert totest.getContainedItem().equals(elem.getFont());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "AnnotationGraphicsHLAPI"})
		public void getContainerAnnotationHLAPITest(){
			AnnotationGraphicsHLAPI elem = new AnnotationGraphicsHLAPI(new HlcorestructureFactoryImpl().createAnnotationGraphics());

			
				elem.setContainerAnnotationHLAPI(new fr.lip6.move.pnml.pthlpng.hlcorestructure.hlapi.NameHLAPI(new HlcorestructureFactoryImpl().createName()));
				AnnotationHLAPI totest_hlcorestructure_Name = elem.getContainerAnnotationHLAPI();
				assert totest_hlcorestructure_Name.getContainedItem().equals(elem.getContainerAnnotation());
			
				elem.setContainerAnnotationHLAPI(new fr.lip6.move.pnml.pthlpng.hlcorestructure.hlapi.TypeHLAPI(new HlcorestructureFactoryImpl().createType()));
				AnnotationHLAPI totest_hlcorestructure_Type = elem.getContainerAnnotationHLAPI();
				assert totest_hlcorestructure_Type.getContainedItem().equals(elem.getContainerAnnotation());
			
				elem.setContainerAnnotationHLAPI(new fr.lip6.move.pnml.pthlpng.hlcorestructure.hlapi.HLMarkingHLAPI(new HlcorestructureFactoryImpl().createHLMarking()));
				AnnotationHLAPI totest_hlcorestructure_HLMarking = elem.getContainerAnnotationHLAPI();
				assert totest_hlcorestructure_HLMarking.getContainedItem().equals(elem.getContainerAnnotation());
			
				elem.setContainerAnnotationHLAPI(new fr.lip6.move.pnml.pthlpng.hlcorestructure.hlapi.ConditionHLAPI(new HlcorestructureFactoryImpl().createCondition()));
				AnnotationHLAPI totest_hlcorestructure_Condition = elem.getContainerAnnotationHLAPI();
				assert totest_hlcorestructure_Condition.getContainedItem().equals(elem.getContainerAnnotation());
			
				elem.setContainerAnnotationHLAPI(new fr.lip6.move.pnml.pthlpng.hlcorestructure.hlapi.HLAnnotationHLAPI(new HlcorestructureFactoryImpl().createHLAnnotation()));
				AnnotationHLAPI totest_hlcorestructure_HLAnnotation = elem.getContainerAnnotationHLAPI();
				assert totest_hlcorestructure_HLAnnotation.getContainedItem().equals(elem.getContainerAnnotation());
			
				elem.setContainerAnnotationHLAPI(new fr.lip6.move.pnml.pthlpng.hlcorestructure.hlapi.DeclarationHLAPI(new HlcorestructureFactoryImpl().createDeclaration()));
				AnnotationHLAPI totest_hlcorestructure_Declaration = elem.getContainerAnnotationHLAPI();
				assert totest_hlcorestructure_Declaration.getContainedItem().equals(elem.getContainerAnnotation());
			
		}
	

	//Special getter for list of generics object, return only one object type.
	
	
	
	
	
	

	//setters/remover for lists.
	

	@Test(groups = { "hlapi", "AnnotationGraphicsHLAPI"})
	public void equalsTest(){
		AnnotationGraphics a = new HlcorestructureFactoryImpl().createAnnotationGraphics();
		AnnotationGraphics b = new HlcorestructureFactoryImpl().createAnnotationGraphics();
		AnnotationGraphicsHLAPI aprime = new AnnotationGraphicsHLAPI(a);
		AnnotationGraphicsHLAPI asecond = new AnnotationGraphicsHLAPI(a);
		AnnotationGraphicsHLAPI bprime = new AnnotationGraphicsHLAPI(b);

		assert aprime.equals(asecond);
		assert !aprime.equals(bprime);
	}

	//cloning method
	//public AnnotationGraphicsHLAPI clone(){
	//	return new AnnotationGraphicsHLAPI(this);
	//}

	//PNML
	
	/**
	 * return the PNML xml tree for this object.
	 */
	//public String toPNML(){
		//return item.toPNML();
	//}

	/**
	 * creates an object from the xml nodes.(symetric work of toPNML)
	 */
	//public void fromPNML(OMElement subRoot,IdRefLinker idr) throws InnerBuildException, InvalidIDException, VoidRepositoryException{
		//item.fromPNML(subRoot,idr);
	//}
	
}
