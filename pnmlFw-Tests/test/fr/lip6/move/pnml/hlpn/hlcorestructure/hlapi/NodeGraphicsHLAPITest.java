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
 * $Id ggiffo, Wed Feb 10 14:59:13 CET 2016$
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

import fr.lip6.move.pnml.hlpn.hlcorestructure.AnnotationGraphics;
import fr.lip6.move.pnml.hlpn.hlcorestructure.AnyObject;
import fr.lip6.move.pnml.hlpn.hlcorestructure.Condition;
import fr.lip6.move.pnml.hlpn.hlcorestructure.Declaration;
import fr.lip6.move.pnml.hlpn.hlcorestructure.Dimension;
import fr.lip6.move.pnml.hlpn.hlcorestructure.Fill;
import fr.lip6.move.pnml.hlpn.hlcorestructure.HLAnnotation;
import fr.lip6.move.pnml.hlpn.hlcorestructure.HLMarking;
import fr.lip6.move.pnml.hlpn.hlcorestructure.Label;
import fr.lip6.move.pnml.hlpn.hlcorestructure.Line;
import fr.lip6.move.pnml.hlpn.hlcorestructure.Name;
import fr.lip6.move.pnml.hlpn.hlcorestructure.Node;
import fr.lip6.move.pnml.hlpn.hlcorestructure.NodeGraphics;
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
import org.apache.axiom.om.*;
import fr.lip6.move.pnml.framework.utils.IdRefLinker;
import org.eclipse.emf.common.util.DiagnosticChain;
import fr.lip6.move.pnml.hlpn.hlcorestructure.*;
import fr.lip6.move.pnml.hlpn.hlcorestructure.impl.*;
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
			
		

	
		
			
			
		itemcontainerNode = new fr.lip6.move.pnml.hlpn.hlcorestructure.hlapi.PlaceHLAPI(
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
	   fr.lip6.move.pnml.hlpn.hlcorestructure.hlapi.NodeGraphicsHLAPI hlapi = new NodeGraphicsHLAPI(llapi);
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

			
				elem.setContainerNodeHLAPI(new fr.lip6.move.pnml.hlpn.hlcorestructure.hlapi.PlaceHLAPI(new HlcorestructureFactoryImpl().createPlace()));
				NodeHLAPI totest_hlcorestructure_Place = elem.getContainerNodeHLAPI();
				assert totest_hlcorestructure_Place.getContainedItem().equals(elem.getContainerNode());
			
				elem.setContainerNodeHLAPI(new fr.lip6.move.pnml.hlpn.hlcorestructure.hlapi.RefTransitionHLAPI(new HlcorestructureFactoryImpl().createRefTransition()));
				NodeHLAPI totest_hlcorestructure_RefTransition = elem.getContainerNodeHLAPI();
				assert totest_hlcorestructure_RefTransition.getContainedItem().equals(elem.getContainerNode());
			
				elem.setContainerNodeHLAPI(new fr.lip6.move.pnml.hlpn.hlcorestructure.hlapi.TransitionHLAPI(new HlcorestructureFactoryImpl().createTransition()));
				NodeHLAPI totest_hlcorestructure_Transition = elem.getContainerNodeHLAPI();
				assert totest_hlcorestructure_Transition.getContainedItem().equals(elem.getContainerNode());
			
				elem.setContainerNodeHLAPI(new fr.lip6.move.pnml.hlpn.hlcorestructure.hlapi.RefPlaceHLAPI(new HlcorestructureFactoryImpl().createRefPlace()));
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
