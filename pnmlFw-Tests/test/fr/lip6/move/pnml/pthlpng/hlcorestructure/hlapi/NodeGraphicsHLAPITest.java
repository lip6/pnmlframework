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

import fr.lip6.move.pnml.pthlpng.hlcorestructure.AnnotationGraphics;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.AnyObject;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.Condition;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.Declaration;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.Dimension;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.Fill;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.HLAnnotation;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.HLMarking;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.Label;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.Line;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.Name;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.Node;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.NodeGraphics;
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
public class NodeGraphicsHLAPITest {

	
	private PositionHLAPI itemposition;
		
	private DimensionHLAPI itemdimension;
		
	private FillHLAPI itemfill;
		
	private LineHLAPI itemline;
		
	
	private NodeHLAPI itemcontainerNode;
	
	private PageHLAPI itemcontainerPage;
	


	@AfterTest(groups = { "NodeGraphicsHLAPI", "hlapi" })
	public void After() {
	    System.out.println("done for "+"NodeGraphicsHLAPI(hlcorestructure)");
	}


	@BeforeMethod(groups = { "NodeGraphicsHLAPI", "hlapi" })
	public void setup() throws Exception{
	//ModelRepository.reset(); ModelRepository.getInstance().createDocumentWorkspace("void");
	ModelRepository mr = ModelRepository.getInstance();
	mr.createDocumentWorkspace("void");
	
			
			//HlcorestructureFactoryImpl
			itemposition = new PositionHLAPI(new HlcorestructureFactoryImpl().createPosition());
			
		
			
			//HlcorestructureFactoryImpl
			itemdimension = new DimensionHLAPI(new HlcorestructureFactoryImpl().createDimension());
			
		
			
			//HlcorestructureFactoryImpl
			itemfill = new FillHLAPI(new HlcorestructureFactoryImpl().createFill());
			
		
			
			//HlcorestructureFactoryImpl
			itemline = new LineHLAPI(new HlcorestructureFactoryImpl().createLine());
			
		

	
		
			
			
		itemcontainerNode = new fr.lip6.move.pnml.pthlpng.hlcorestructure.hlapi.PlaceHLAPI(
		   new HlcorestructureFactoryImpl().createPlace()
		);
			
		
	
		
		itemcontainerPage = new PageHLAPI(new HlcorestructureFactoryImpl().createPage());
		
	
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
	   NodeGraphics llapi = new HlcorestructureFactoryImpl().createNodeGraphics();
	   fr.lip6.move.pnml.pthlpng.hlcorestructure.hlapi.NodeGraphicsHLAPI hlapi = new NodeGraphicsHLAPI(llapi);
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
			NodeGraphicsHLAPI elem = new NodeGraphicsHLAPI(new HlcorestructureFactoryImpl().createNodeGraphics());

			
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
			NodeGraphicsHLAPI elem = new NodeGraphicsHLAPI(new HlcorestructureFactoryImpl().createNodeGraphics());

			
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
			NodeGraphicsHLAPI elem = new NodeGraphicsHLAPI(new HlcorestructureFactoryImpl().createNodeGraphics());

			
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
			NodeGraphicsHLAPI elem = new NodeGraphicsHLAPI(new HlcorestructureFactoryImpl().createNodeGraphics());

			
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
			NodeGraphicsHLAPI elem = new NodeGraphicsHLAPI(new HlcorestructureFactoryImpl().createNodeGraphics());

			
				elem.setContainerNodeHLAPI(new fr.lip6.move.pnml.pthlpng.hlcorestructure.hlapi.PlaceHLAPI(new HlcorestructureFactoryImpl().createPlace()));
				NodeHLAPI totest_hlcorestructure_Place = elem.getContainerNodeHLAPI();
				assert totest_hlcorestructure_Place.getContainedItem().equals(elem.getContainerNode());
			
				elem.setContainerNodeHLAPI(new fr.lip6.move.pnml.pthlpng.hlcorestructure.hlapi.RefTransitionHLAPI(new HlcorestructureFactoryImpl().createRefTransition()));
				NodeHLAPI totest_hlcorestructure_RefTransition = elem.getContainerNodeHLAPI();
				assert totest_hlcorestructure_RefTransition.getContainedItem().equals(elem.getContainerNode());
			
				elem.setContainerNodeHLAPI(new fr.lip6.move.pnml.pthlpng.hlcorestructure.hlapi.TransitionHLAPI(new HlcorestructureFactoryImpl().createTransition()));
				NodeHLAPI totest_hlcorestructure_Transition = elem.getContainerNodeHLAPI();
				assert totest_hlcorestructure_Transition.getContainedItem().equals(elem.getContainerNode());
			
				elem.setContainerNodeHLAPI(new fr.lip6.move.pnml.pthlpng.hlcorestructure.hlapi.RefPlaceHLAPI(new HlcorestructureFactoryImpl().createRefPlace()));
				NodeHLAPI totest_hlcorestructure_RefPlace = elem.getContainerNodeHLAPI();
				assert totest_hlcorestructure_RefPlace.getContainedItem().equals(elem.getContainerNode());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "NodeGraphicsHLAPI"})
		public void getContainerPageHLAPITest(){
			NodeGraphicsHLAPI elem = new NodeGraphicsHLAPI(new HlcorestructureFactoryImpl().createNodeGraphics());

			
				elem.setContainerPageHLAPI(itemcontainerPage);
				PageHLAPI totest = elem.getContainerPageHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerPage());
			
		}
	

	//Special getter for list of generics object, return only one object type.
	
	
	
	
	
	
	

	//setters/remover for lists.
	

	@Test(groups = { "hlapi", "NodeGraphicsHLAPI"})
	public void equalsTest(){
		NodeGraphics a = new HlcorestructureFactoryImpl().createNodeGraphics();
		NodeGraphics b = new HlcorestructureFactoryImpl().createNodeGraphics();
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
