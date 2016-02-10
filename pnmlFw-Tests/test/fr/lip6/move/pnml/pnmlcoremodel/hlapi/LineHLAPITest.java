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
import fr.lip6.move.pnml.pnmlcoremodel.ArcGraphics;
import fr.lip6.move.pnml.pnmlcoremodel.CSS2Color;
import fr.lip6.move.pnml.pnmlcoremodel.Dimension;
import fr.lip6.move.pnml.pnmlcoremodel.Fill;
import fr.lip6.move.pnml.pnmlcoremodel.Font;
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

import java.net.URI;

import java.util.List;

import  fr.lip6.move.pnml.framework.hlapi.*;
import fr.lip6.move.pnml.pnmlcoremodel.hlapi.*;

import java.util.ArrayList;
import java.util.List;
import org.apache.axiom.om.*;
import fr.lip6.move.pnml.framework.utils.IdRefLinker;
import org.eclipse.emf.common.util.DiagnosticChain;
import fr.lip6.move.pnml.pnmlcoremodel.*;
import fr.lip6.move.pnml.pnmlcoremodel.impl.*;
import fr.lip6.move.pnml.framework.utils.exception.InnerBuildException;
import fr.lip6.move.pnml.framework.utils.exception.InvalidIDException;
import fr.lip6.move.pnml.framework.utils.exception.VoidRepositoryException;
import fr.lip6.move.pnml.framework.utils.IdRepository;
import fr.lip6.move.pnml.framework.utils.ModelRepository;
import org.testng.annotations.*;
public class LineHLAPITest {

	
	private CSS2ColorHLAPI itemcolor;
		
	private LineShapeHLAPI itemshape;
		
	private Integer itemwidth;
		
	private LineStyleHLAPI itemstyle;
		
	
	private NodeGraphicsHLAPI itemcontainerNodeGraphics;
	
	private ArcGraphicsHLAPI itemcontainerArcGraphics;
	
	private AnnotationGraphicsHLAPI itemcontainerAnnotationGraphics;
	


	@AfterTest(groups = { "LineHLAPI", "hlapi" })
	public void After() {
	    System.out.println("done for "+"LineHLAPI(pnmlcoremodel)");
	}


	@BeforeMethod(groups = { "LineHLAPI", "hlapi" })
	public void setup() throws Exception{
	//ModelRepository.reset(); ModelRepository.getInstance().createDocumentWorkspace("void");
	ModelRepository mr = ModelRepository.getInstance();
	mr.createDocumentWorkspace("void");
	
		itemcolor = CSS2ColorHLAPI.get(0);
		
		itemshape = LineShapeHLAPI.get(0);
		
			itemwidth = new Integer("0");
			
		itemstyle = LineStyleHLAPI.get(0);
		

	
		
		itemcontainerNodeGraphics = new NodeGraphicsHLAPI(new PnmlcoremodelFactoryImpl().createNodeGraphics());
		
	
		
		itemcontainerArcGraphics = new ArcGraphicsHLAPI(new PnmlcoremodelFactoryImpl().createArcGraphics());
		
	
		
		itemcontainerAnnotationGraphics = new AnnotationGraphicsHLAPI(new PnmlcoremodelFactoryImpl().createAnnotationGraphics());
		
	
	}

	/**
	 * this constructor allows you to set all 'settable' values
	 * excepted container.
	 */
	@Test(groups = { "hlapi", "LineHLAPI"}, dependsOnMethods={"LineHLAPI_LLAPI"})
	public void LineHLAPI_1(){//BEGIN CONSTRUCTOR BODY
   @SuppressWarnings("unused")
	LineHLAPI totest = new LineHLAPI(
		itemcolor
		,	
		itemshape
		,	
		itemwidth
		,	
		itemstyle
	);
	
	
	
	
	
	
	assert totest.getWidth().equals(itemwidth);
	
	
	
	
	}

	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "LineHLAPI"}, dependsOnMethods={"LineHLAPI_LLAPI"})
	public void LineHLAPI_2_containerNodeGraphics(){//BEGIN CONSTRUCTOR BODY

	LineHLAPI totest = new LineHLAPI(
		itemcolor
		,	
		itemshape
		,	
		itemwidth
		,	
		itemstyle
	,	
		itemcontainerNodeGraphics
	);
	
	
		
	
		
	
			assert totest.getWidth().equals(itemwidth);
		
	
	
		
	assert totest.getContainerNodeGraphics().equals(itemcontainerNodeGraphics.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "LineHLAPI"}, dependsOnMethods={"LineHLAPI_LLAPI"})
	public void LineHLAPI_2_containerArcGraphics(){//BEGIN CONSTRUCTOR BODY

	LineHLAPI totest = new LineHLAPI(
		itemcolor
		,	
		itemshape
		,	
		itemwidth
		,	
		itemstyle
	,	
		itemcontainerArcGraphics
	);
	
	
		
	
		
	
			assert totest.getWidth().equals(itemwidth);
		
	
	
		
	assert totest.getContainerArcGraphics().equals(itemcontainerArcGraphics.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "LineHLAPI"}, dependsOnMethods={"LineHLAPI_LLAPI"})
	public void LineHLAPI_2_containerAnnotationGraphics(){//BEGIN CONSTRUCTOR BODY

	LineHLAPI totest = new LineHLAPI(
		itemcolor
		,	
		itemshape
		,	
		itemwidth
		,	
		itemstyle
	,	
		itemcontainerAnnotationGraphics
	);
	
	
		
	
		
	
			assert totest.getWidth().equals(itemwidth);
		
	
	
		
	assert totest.getContainerAnnotationGraphics().equals(itemcontainerAnnotationGraphics.getContainedItem());
	}

	/**
    * This constructor give access to required stuff only (not container if any)
    */

	/**
    * This constructor give access to required stuff only (and container)
    */
   @Test(groups = { "hlapi", "LineHLAPI"}, dependsOnMethods={"LineHLAPI_LLAPI"})
	public void LineHLAPI_4_containerNodeGraphics(){//BEGIN CONSTRUCTOR BODY

	LineHLAPI totest = new LineHLAPI(
	  itemcontainerNodeGraphics
	);

	
	assert totest.getContainerNodeGraphics().equals(itemcontainerNodeGraphics.getContainedItem());
	}
	/**
    * This constructor give access to required stuff only (and container)
    */
   @Test(groups = { "hlapi", "LineHLAPI"}, dependsOnMethods={"LineHLAPI_LLAPI"})
	public void LineHLAPI_4_containerArcGraphics(){//BEGIN CONSTRUCTOR BODY

	LineHLAPI totest = new LineHLAPI(
	  itemcontainerArcGraphics
	);

	
	assert totest.getContainerArcGraphics().equals(itemcontainerArcGraphics.getContainedItem());
	}
	/**
    * This constructor give access to required stuff only (and container)
    */
   @Test(groups = { "hlapi", "LineHLAPI"}, dependsOnMethods={"LineHLAPI_LLAPI"})
	public void LineHLAPI_4_containerAnnotationGraphics(){//BEGIN CONSTRUCTOR BODY

	LineHLAPI totest = new LineHLAPI(
	  itemcontainerAnnotationGraphics
	);

	
	assert totest.getContainerAnnotationGraphics().equals(itemcontainerAnnotationGraphics.getContainedItem());
	}


	/**
	 * This constructor encapsulate a low level API object in HLAPI.
	 */
	@Test(groups = { "hlapi", "LineHLAPI"})
	public void LineHLAPI_LLAPI(){
	   Line llapi = new PnmlcoremodelFactoryImpl().createLine();
	   fr.lip6.move.pnml.pnmlcoremodel.hlapi.LineHLAPI hlapi = new LineHLAPI(llapi);
		assert hlapi.getContainedItem().equals(llapi);
	}

	//getters giving HLAPI object
	
	
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "LineHLAPI"})
		public void getContainerNodeGraphicsHLAPITest(){
			LineHLAPI elem = new LineHLAPI(new PnmlcoremodelFactoryImpl().createLine());

			
				elem.setContainerNodeGraphicsHLAPI(itemcontainerNodeGraphics);
				NodeGraphicsHLAPI totest = elem.getContainerNodeGraphicsHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerNodeGraphics());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "LineHLAPI"})
		public void getContainerArcGraphicsHLAPITest(){
			LineHLAPI elem = new LineHLAPI(new PnmlcoremodelFactoryImpl().createLine());

			
				elem.setContainerArcGraphicsHLAPI(itemcontainerArcGraphics);
				ArcGraphicsHLAPI totest = elem.getContainerArcGraphicsHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerArcGraphics());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "LineHLAPI"})
		public void getContainerAnnotationGraphicsHLAPITest(){
			LineHLAPI elem = new LineHLAPI(new PnmlcoremodelFactoryImpl().createLine());

			
				elem.setContainerAnnotationGraphicsHLAPI(itemcontainerAnnotationGraphics);
				AnnotationGraphicsHLAPI totest = elem.getContainerAnnotationGraphicsHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerAnnotationGraphics());
			
		}
	
	

	//Special getter for list of generics object, return only one object type.
	
	
	
	

	//setters/remover for lists.
	

	@Test(groups = { "hlapi", "LineHLAPI"})
	public void equalsTest(){
		Line a = new PnmlcoremodelFactoryImpl().createLine();
		Line b = new PnmlcoremodelFactoryImpl().createLine();
		LineHLAPI aprime = new LineHLAPI(a);
		LineHLAPI asecond = new LineHLAPI(a);
		LineHLAPI bprime = new LineHLAPI(b);

		assert aprime.equals(asecond);
		assert !aprime.equals(bprime);
	}

	//cloning method
	//public LineHLAPI clone(){
	//	return new LineHLAPI(this);
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
