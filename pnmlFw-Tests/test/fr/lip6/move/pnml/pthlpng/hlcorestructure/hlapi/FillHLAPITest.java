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
 * $Id ggiffo, Wed Feb 10 14:59:15 CET 2016$
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
import fr.lip6.move.pnml.pthlpng.hlcorestructure.CSS2Color;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.Condition;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.Declaration;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.Dimension;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.Fill;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.Font;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.Gradient;
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
public class FillHLAPITest {

	
	private CSS2ColorHLAPI itemcolor;
		
	private CSS2ColorHLAPI itemgradientcolor;
		
	private GradientHLAPI itemgradientrotation;
		
	private URI itemimage;
		
	
	private NodeGraphicsHLAPI itemcontainerNodeGraphics;
	
	private AnnotationGraphicsHLAPI itemcontainerAnnotationGraphics;
	


	@AfterTest(groups = { "FillHLAPI", "hlapi" })
	public void After() {
	    System.out.println("done for "+"FillHLAPI(hlcorestructure)");
	}


	@BeforeMethod(groups = { "FillHLAPI", "hlapi" })
	public void setup() throws Exception{
	//ModelRepository.reset(); ModelRepository.getInstance().createDocumentWorkspace("void");
	ModelRepository mr = ModelRepository.getInstance();
	mr.createDocumentWorkspace("void");
	
		itemcolor = CSS2ColorHLAPI.get(0);
		
		itemgradientcolor = CSS2ColorHLAPI.get(0);
		
		itemgradientrotation = GradientHLAPI.get(0);
		
			itemimage = new URI("0");
			

	
		
		itemcontainerNodeGraphics = new NodeGraphicsHLAPI(new HlcorestructureFactoryImpl().createNodeGraphics());
		
	
		
		itemcontainerAnnotationGraphics = new AnnotationGraphicsHLAPI(new HlcorestructureFactoryImpl().createAnnotationGraphics());
		
	
	}

	/**
	 * this constructor allows you to set all 'settable' values
	 * excepted container.
	 */
	@Test(groups = { "hlapi", "FillHLAPI"}, dependsOnMethods={"FillHLAPI_LLAPI"})
	public void FillHLAPI_1(){//BEGIN CONSTRUCTOR BODY
   @SuppressWarnings("unused")
	FillHLAPI totest = new FillHLAPI(
		itemcolor
		,	
		itemgradientcolor
		,	
		itemgradientrotation
		,	
		itemimage
	);
	
	
	
	
	
	
	
	
	assert totest.getImage().equals(itemimage);
	
	
	}

	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "FillHLAPI"}, dependsOnMethods={"FillHLAPI_LLAPI"})
	public void FillHLAPI_2_containerNodeGraphics(){//BEGIN CONSTRUCTOR BODY

	FillHLAPI totest = new FillHLAPI(
		itemcolor
		,	
		itemgradientcolor
		,	
		itemgradientrotation
		,	
		itemimage
	,	
		itemcontainerNodeGraphics
	);
	
	
		
	
		
	
		
	
			assert totest.getImage().equals(itemimage);
		
	
	assert totest.getContainerNodeGraphics().equals(itemcontainerNodeGraphics.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "FillHLAPI"}, dependsOnMethods={"FillHLAPI_LLAPI"})
	public void FillHLAPI_2_containerAnnotationGraphics(){//BEGIN CONSTRUCTOR BODY

	FillHLAPI totest = new FillHLAPI(
		itemcolor
		,	
		itemgradientcolor
		,	
		itemgradientrotation
		,	
		itemimage
	,	
		itemcontainerAnnotationGraphics
	);
	
	
		
	
		
	
		
	
			assert totest.getImage().equals(itemimage);
		
	
	assert totest.getContainerAnnotationGraphics().equals(itemcontainerAnnotationGraphics.getContainedItem());
	}

	/**
    * This constructor give access to required stuff only (not container if any)
    */

	/**
    * This constructor give access to required stuff only (and container)
    */
   @Test(groups = { "hlapi", "FillHLAPI"}, dependsOnMethods={"FillHLAPI_LLAPI"})
	public void FillHLAPI_4_containerNodeGraphics(){//BEGIN CONSTRUCTOR BODY

	FillHLAPI totest = new FillHLAPI(
	  itemcontainerNodeGraphics
	);

	
	assert totest.getContainerNodeGraphics().equals(itemcontainerNodeGraphics.getContainedItem());
	}
	/**
    * This constructor give access to required stuff only (and container)
    */
   @Test(groups = { "hlapi", "FillHLAPI"}, dependsOnMethods={"FillHLAPI_LLAPI"})
	public void FillHLAPI_4_containerAnnotationGraphics(){//BEGIN CONSTRUCTOR BODY

	FillHLAPI totest = new FillHLAPI(
	  itemcontainerAnnotationGraphics
	);

	
	assert totest.getContainerAnnotationGraphics().equals(itemcontainerAnnotationGraphics.getContainedItem());
	}


	/**
	 * This constructor encapsulate a low level API object in HLAPI.
	 */
	@Test(groups = { "hlapi", "FillHLAPI"})
	public void FillHLAPI_LLAPI(){
	   Fill llapi = new HlcorestructureFactoryImpl().createFill();
	   fr.lip6.move.pnml.pthlpng.hlcorestructure.hlapi.FillHLAPI hlapi = new FillHLAPI(llapi);
		assert hlapi.getContainedItem().equals(llapi);
	}

	//getters giving HLAPI object
	
	
	
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "FillHLAPI"})
		public void getContainerNodeGraphicsHLAPITest(){
			FillHLAPI elem = new FillHLAPI(new HlcorestructureFactoryImpl().createFill());

			
				elem.setContainerNodeGraphicsHLAPI(itemcontainerNodeGraphics);
				NodeGraphicsHLAPI totest = elem.getContainerNodeGraphicsHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerNodeGraphics());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "FillHLAPI"})
		public void getContainerAnnotationGraphicsHLAPITest(){
			FillHLAPI elem = new FillHLAPI(new HlcorestructureFactoryImpl().createFill());

			
				elem.setContainerAnnotationGraphicsHLAPI(itemcontainerAnnotationGraphics);
				AnnotationGraphicsHLAPI totest = elem.getContainerAnnotationGraphicsHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerAnnotationGraphics());
			
		}
	

	//Special getter for list of generics object, return only one object type.
	
	
	

	//setters/remover for lists.
	

	@Test(groups = { "hlapi", "FillHLAPI"})
	public void equalsTest(){
		Fill a = new HlcorestructureFactoryImpl().createFill();
		Fill b = new HlcorestructureFactoryImpl().createFill();
		FillHLAPI aprime = new FillHLAPI(a);
		FillHLAPI asecond = new FillHLAPI(a);
		FillHLAPI bprime = new FillHLAPI(b);

		assert aprime.equals(asecond);
		assert !aprime.equals(bprime);
	}

	//cloning method
	//public FillHLAPI clone(){
	//	return new FillHLAPI(this);
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
