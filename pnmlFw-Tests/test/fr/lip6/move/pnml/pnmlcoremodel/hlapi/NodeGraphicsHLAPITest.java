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
 * $Id ggiffo, Thu Jan 02 00:08:26 CET 2014$
 */
package fr.lip6.move.pnml.pnmlcoremodel.hlapi;

import fr.lip6.move.pnml.pnmlcoremodel.AnnotationGraphics;
import fr.lip6.move.pnml.pnmlcoremodel.AnyObject;
import fr.lip6.move.pnml.pnmlcoremodel.Dimension;
import fr.lip6.move.pnml.pnmlcoremodel.Fill;
import fr.lip6.move.pnml.pnmlcoremodel.Label;
import fr.lip6.move.pnml.pnmlcoremodel.Line;
import fr.lip6.move.pnml.pnmlcoremodel.Name;
import fr.lip6.move.pnml.pnmlcoremodel.Node;
import fr.lip6.move.pnml.pnmlcoremodel.NodeGraphics;
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
public class NodeGraphicsHLAPITest {

	
	private PositionHLAPI itemposition;
		
	private DimensionHLAPI itemdimension;
		
	private FillHLAPI itemfill;
		
	private LineHLAPI itemline;
		
	
	private NodeHLAPI itemcontainerNode;
	
	private PageHLAPI itemcontainerPage;
	


	@AfterTest(groups = { "NodeGraphicsHLAPI", "hlapi" })
	public void After() {
	    System.out.println("done for "+"NodeGraphicsHLAPI(pnmlcoremodel)");
	}


	@BeforeMethod(groups = { "NodeGraphicsHLAPI", "hlapi" })
	public void setup() throws Exception{
	//ModelRepository.reset(); ModelRepository.getInstance().createDocumentWorkspace("void");
	ModelRepository mr = ModelRepository.getInstance();
	mr.createDocumentWorkspace("void");
	
			
			//PnmlcoremodelFactoryImpl
			itemposition = new PositionHLAPI(new PnmlcoremodelFactoryImpl().createPosition());
			
		
			
			//PnmlcoremodelFactoryImpl
			itemdimension = new DimensionHLAPI(new PnmlcoremodelFactoryImpl().createDimension());
			
		
			
			//PnmlcoremodelFactoryImpl
			itemfill = new FillHLAPI(new PnmlcoremodelFactoryImpl().createFill());
			
		
			
			//PnmlcoremodelFactoryImpl
			itemline = new LineHLAPI(new PnmlcoremodelFactoryImpl().createLine());
			
		

	
		
			
			
		itemcontainerNode = new fr.lip6.move.pnml.pnmlcoremodel.hlapi.PlaceHLAPI(
		   new PnmlcoremodelFactoryImpl().createPlace()
		);
			
		
	
		
		itemcontainerPage = new PageHLAPI(new PnmlcoremodelFactoryImpl().createPage());
		
	
	}

	/**
	 * this constructor allows you to set all 'settable' values
	 * excepted container.
	 */
	@Test(groups = { "hlapi", "NodeGraphicsHLAPI"}, dependsOnMethods={"NodeGraphicsHLAPI_LLAPI"})
	public void NodeGraphicsHLAPI_1(){//BEGIN CONSTRUCTOR BODY
   @SuppressWarnings("unused")
	NodeGraphicsHLAPI totest = new NodeGraphicsHLAPI(
		itemposition
		,	
		itemdimension
		,	
		itemfill
		,	
		itemline
	);
	
	
	
	assert totest.getPosition().equals(itemposition.getContainedItem());
	
	
	
	
	assert totest.getDimension().equals(itemdimension.getContainedItem());
	
	
	
	
	assert totest.getFill().equals(itemfill.getContainedItem());
	
	
	
	
	assert totest.getLine().equals(itemline.getContainedItem());
	
	
	}

	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "NodeGraphicsHLAPI"}, dependsOnMethods={"NodeGraphicsHLAPI_LLAPI"})
	public void NodeGraphicsHLAPI_2_containerNode(){//BEGIN CONSTRUCTOR BODY

	NodeGraphicsHLAPI totest = new NodeGraphicsHLAPI(
		itemposition
		,	
		itemdimension
		,	
		itemfill
		,	
		itemline
	,	
		itemcontainerNode
	);
	
	
		
			assert totest.getPosition().equals(itemposition.getContainedItem());
		
	
	
		
			assert totest.getDimension().equals(itemdimension.getContainedItem());
		
	
	
		
			assert totest.getFill().equals(itemfill.getContainedItem());
		
	
	
		
			assert totest.getLine().equals(itemline.getContainedItem());
		
	
	assert totest.getContainerNode().equals(itemcontainerNode.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "NodeGraphicsHLAPI"}, dependsOnMethods={"NodeGraphicsHLAPI_LLAPI"})
	public void NodeGraphicsHLAPI_2_containerPage(){//BEGIN CONSTRUCTOR BODY

	NodeGraphicsHLAPI totest = new NodeGraphicsHLAPI(
		itemposition
		,	
		itemdimension
		,	
		itemfill
		,	
		itemline
	,	
		itemcontainerPage
	);
	
	
		
			assert totest.getPosition().equals(itemposition.getContainedItem());
		
	
	
		
			assert totest.getDimension().equals(itemdimension.getContainedItem());
		
	
	
		
			assert totest.getFill().equals(itemfill.getContainedItem());
		
	
	
		
			assert totest.getLine().equals(itemline.getContainedItem());
		
	
	assert totest.getContainerPage().equals(itemcontainerPage.getContainedItem());
	}

	/**
    * This constructor give access to required stuff only (not container if any)
    */

	/**
    * This constructor give access to required stuff only (and container)
    */
   @Test(groups = { "hlapi", "NodeGraphicsHLAPI"}, dependsOnMethods={"NodeGraphicsHLAPI_LLAPI"})
	public void NodeGraphicsHLAPI_4_containerNode(){//BEGIN CONSTRUCTOR BODY

	NodeGraphicsHLAPI totest = new NodeGraphicsHLAPI(
	  itemcontainerNode
	);

	
	assert totest.getContainerNode().equals(itemcontainerNode.getContainedItem());
	}
	/**
    * This constructor give access to required stuff only (and container)
    */
   @Test(groups = { "hlapi", "NodeGraphicsHLAPI"}, dependsOnMethods={"NodeGraphicsHLAPI_LLAPI"})
	public void NodeGraphicsHLAPI_4_containerPage(){//BEGIN CONSTRUCTOR BODY

	NodeGraphicsHLAPI totest = new NodeGraphicsHLAPI(
	  itemcontainerPage
	);

	
	assert totest.getContainerPage().equals(itemcontainerPage.getContainedItem());
	}


	/**
	 * This constructor encapsulate a low level API object in HLAPI.
	 */
	@Test(groups = { "hlapi", "NodeGraphicsHLAPI"})
	public void NodeGraphicsHLAPI_LLAPI(){
	   NodeGraphics llapi = new PnmlcoremodelFactoryImpl().createNodeGraphics();
	   fr.lip6.move.pnml.pnmlcoremodel.hlapi.NodeGraphicsHLAPI hlapi = new NodeGraphicsHLAPI(llapi);
		assert hlapi.getContainedItem().equals(llapi);
	}

	//getters giving HLAPI object
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "NodeGraphicsHLAPI"})
		public void getPositionHLAPITest(){
			NodeGraphicsHLAPI elem = new NodeGraphicsHLAPI(new PnmlcoremodelFactoryImpl().createNodeGraphics());

			
				elem.setPositionHLAPI(itemposition);
				PositionHLAPI totest = elem.getPositionHLAPI();
				assert totest.getContainedItem().equals(elem.getPosition());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "NodeGraphicsHLAPI"})
		public void getDimensionHLAPITest(){
			NodeGraphicsHLAPI elem = new NodeGraphicsHLAPI(new PnmlcoremodelFactoryImpl().createNodeGraphics());

			
				elem.setDimensionHLAPI(itemdimension);
				DimensionHLAPI totest = elem.getDimensionHLAPI();
				assert totest.getContainedItem().equals(elem.getDimension());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "NodeGraphicsHLAPI"})
		public void getFillHLAPITest(){
			NodeGraphicsHLAPI elem = new NodeGraphicsHLAPI(new PnmlcoremodelFactoryImpl().createNodeGraphics());

			
				elem.setFillHLAPI(itemfill);
				FillHLAPI totest = elem.getFillHLAPI();
				assert totest.getContainedItem().equals(elem.getFill());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "NodeGraphicsHLAPI"})
		public void getLineHLAPITest(){
			NodeGraphicsHLAPI elem = new NodeGraphicsHLAPI(new PnmlcoremodelFactoryImpl().createNodeGraphics());

			
				elem.setLineHLAPI(itemline);
				LineHLAPI totest = elem.getLineHLAPI();
				assert totest.getContainedItem().equals(elem.getLine());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "NodeGraphicsHLAPI"})
		public void getContainerNodeHLAPITest(){
			NodeGraphicsHLAPI elem = new NodeGraphicsHLAPI(new PnmlcoremodelFactoryImpl().createNodeGraphics());

			
				elem.setContainerNodeHLAPI(new fr.lip6.move.pnml.pnmlcoremodel.hlapi.PlaceHLAPI(new PnmlcoremodelFactoryImpl().createPlace()));
				NodeHLAPI totest_pnmlcoremodel_Place = elem.getContainerNodeHLAPI();
				assert totest_pnmlcoremodel_Place.getContainedItem().equals(elem.getContainerNode());
			
				elem.setContainerNodeHLAPI(new fr.lip6.move.pnml.pnmlcoremodel.hlapi.RefTransitionHLAPI(new PnmlcoremodelFactoryImpl().createRefTransition()));
				NodeHLAPI totest_pnmlcoremodel_RefTransition = elem.getContainerNodeHLAPI();
				assert totest_pnmlcoremodel_RefTransition.getContainedItem().equals(elem.getContainerNode());
			
				elem.setContainerNodeHLAPI(new fr.lip6.move.pnml.pnmlcoremodel.hlapi.TransitionHLAPI(new PnmlcoremodelFactoryImpl().createTransition()));
				NodeHLAPI totest_pnmlcoremodel_Transition = elem.getContainerNodeHLAPI();
				assert totest_pnmlcoremodel_Transition.getContainedItem().equals(elem.getContainerNode());
			
				elem.setContainerNodeHLAPI(new fr.lip6.move.pnml.pnmlcoremodel.hlapi.RefPlaceHLAPI(new PnmlcoremodelFactoryImpl().createRefPlace()));
				NodeHLAPI totest_pnmlcoremodel_RefPlace = elem.getContainerNodeHLAPI();
				assert totest_pnmlcoremodel_RefPlace.getContainedItem().equals(elem.getContainerNode());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "NodeGraphicsHLAPI"})
		public void getContainerPageHLAPITest(){
			NodeGraphicsHLAPI elem = new NodeGraphicsHLAPI(new PnmlcoremodelFactoryImpl().createNodeGraphics());

			
				elem.setContainerPageHLAPI(itemcontainerPage);
				PageHLAPI totest = elem.getContainerPageHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerPage());
			
		}
	

	//Special getter for list of generics object, return only one object type.
	
	
	
	
	
	
	

	//setters/remover for lists.
	

	@Test(groups = { "hlapi", "NodeGraphicsHLAPI"})
	public void equalsTest(){
		NodeGraphics a = new PnmlcoremodelFactoryImpl().createNodeGraphics();
		NodeGraphics b = new PnmlcoremodelFactoryImpl().createNodeGraphics();
		NodeGraphicsHLAPI aprime = new NodeGraphicsHLAPI(a);
		NodeGraphicsHLAPI asecond = new NodeGraphicsHLAPI(a);
		NodeGraphicsHLAPI bprime = new NodeGraphicsHLAPI(b);

		assert aprime.equals(asecond);
		assert !aprime.equals(bprime);
	}

	//cloning method
	//public NodeGraphicsHLAPI clone(){
	//	return new NodeGraphicsHLAPI(this);
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
