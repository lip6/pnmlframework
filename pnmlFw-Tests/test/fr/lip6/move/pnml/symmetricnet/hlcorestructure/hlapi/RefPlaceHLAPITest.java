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
 * $Id ggiffo, Thu Feb 11 16:29:02 CET 2016$
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
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.Arc;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.ArcGraphics;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.CSS2Color;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.CSS2FontFamily;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.CSS2FontSize;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.CSS2FontStyle;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.CSS2FontWeight;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.Condition;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.Declaration;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.Dimension;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.Fill;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.Font;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.FontAlign;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.FontDecoration;
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
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.Place;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.PlaceNode;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.PnObject;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.Position;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.RefPlace;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.RefTransition;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.ToolInfo;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.Transition;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.TransitionNode;
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

import java.math.BigDecimal;

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
import org.apache.axiom.om.*;
import fr.lip6.move.pnml.framework.utils.IdRefLinker;
import org.eclipse.emf.common.util.DiagnosticChain;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.*;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.impl.*;
import fr.lip6.move.pnml.framework.utils.exception.InnerBuildException;
import fr.lip6.move.pnml.framework.utils.exception.InvalidIDException;
import fr.lip6.move.pnml.framework.utils.exception.VoidRepositoryException;
import fr.lip6.move.pnml.framework.utils.IdRepository;
import fr.lip6.move.pnml.framework.utils.ModelRepository;
import org.testng.annotations.*;
public class RefPlaceHLAPITest {

	
	private String itemid;
		
	private NameHLAPI itemname;
		
	private NodeGraphicsHLAPI itemnodegraphics;
		
	private PlaceNodeHLAPI itemref;
		
	
	private PageHLAPI itemcontainerPage;
	


	@AfterTest(groups = { "RefPlaceHLAPI", "hlapi" })
	public void After() {
	    System.out.println("done for "+"RefPlaceHLAPI(hlcorestructure)");
	}


	@BeforeMethod(groups = { "RefPlaceHLAPI", "hlapi" })
	public void setup() throws Exception{
	//ModelRepository.reset(); ModelRepository.getInstance().createDocumentWorkspace("void");
	ModelRepository mr = ModelRepository.getInstance();
	mr.createDocumentWorkspace("void");
	
			itemid = "unid";
			
			
			//HlcorestructureFactoryImpl
			itemname = new NameHLAPI(new HlcorestructureFactoryImpl().createName());
			
		
			
			//HlcorestructureFactoryImpl
			itemnodegraphics = new NodeGraphicsHLAPI(new HlcorestructureFactoryImpl().createNodeGraphics());
			
		
			
				
			itemref = new fr.lip6.move.pnml.symmetricnet.hlcorestructure.hlapi.PlaceHLAPI(
				new HlcorestructureFactoryImpl().createPlace()
			);
				
			
		

	
		
		itemcontainerPage = new PageHLAPI(new HlcorestructureFactoryImpl().createPage());
		
	
	}

	/**
	 * this constructor allows you to set all 'settable' values
	 * excepted container.
	 */
	@Test(groups = { "hlapi", "RefPlaceHLAPI"}, dependsOnMethods={"RefPlaceHLAPI_LLAPI"})
	public void RefPlaceHLAPI_1() throws InvalidIDException ,VoidRepositoryException   {//BEGIN CONSTRUCTOR BODY
   @SuppressWarnings("unused")
	RefPlaceHLAPI totest = new RefPlaceHLAPI(
		itemid
		,	
		itemname
		,	
		itemnodegraphics
		,	
		itemref
	);
	
	
	assert totest.getId().equals(itemid);
	
	
	
	
	assert totest.getName().equals(itemname.getContainedItem());
	
	
	
	
	assert totest.getNodegraphics().equals(itemnodegraphics.getContainedItem());
	
	
	
	
	assert totest.getRef().equals(itemref.getContainedItem());
	
	
	}

	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "RefPlaceHLAPI"}, dependsOnMethods={"RefPlaceHLAPI_LLAPI"})
	public void RefPlaceHLAPI_2_containerPage() throws InvalidIDException ,VoidRepositoryException   {//BEGIN CONSTRUCTOR BODY

	RefPlaceHLAPI totest = new RefPlaceHLAPI(
		itemid
		,	
		itemname
		,	
		itemnodegraphics
		,	
		itemref
	,	
		itemcontainerPage
	);
	
	
			assert totest.getId().equals(itemid);
		
	
	
		
			assert totest.getName().equals(itemname.getContainedItem());
		
	
	
		
			assert totest.getNodegraphics().equals(itemnodegraphics.getContainedItem());
		
	
	
		
			assert totest.getRef().equals(itemref.getContainedItem());
		
	
	assert totest.getContainerPage().equals(itemcontainerPage.getContainedItem());
	}

	/**
    * This constructor give access to required stuff only (not container if any)
    */
   @Test(groups = { "hlapi", "RefPlaceHLAPI"}, dependsOnMethods={"RefPlaceHLAPI_LLAPI"})
	public void RefPlaceHLAPI_3() throws InvalidIDException ,VoidRepositoryException   {//BEGIN CONSTRUCTOR BODY

	RefPlaceHLAPI totest = new RefPlaceHLAPI(
		itemid
		,	
		itemref
	);

	
	
			assert totest.getId().equals(itemid);
		
	
	
		
			assert totest.getRef().equals(itemref.getContainedItem());
		
	
	}

	/**
    * This constructor give access to required stuff only (and container)
    */
   @Test(groups = { "hlapi", "RefPlaceHLAPI"}, dependsOnMethods={"RefPlaceHLAPI_LLAPI"})
	public void RefPlaceHLAPI_4_containerPage() throws InvalidIDException ,VoidRepositoryException   {//BEGIN CONSTRUCTOR BODY

	RefPlaceHLAPI totest = new RefPlaceHLAPI(
		itemid
		,	
		itemref
	,	
	  itemcontainerPage
	);

	
	
			assert totest.getId().equals(itemid);
		
	
	
		
			assert totest.getRef().equals(itemref.getContainedItem());
		
	
	assert totest.getContainerPage().equals(itemcontainerPage.getContainedItem());
	}


	/**
	 * This constructor encapsulate a low level API object in HLAPI.
	 */
	@Test(groups = { "hlapi", "RefPlaceHLAPI"})
	public void RefPlaceHLAPI_LLAPI(){
	   RefPlace llapi = new HlcorestructureFactoryImpl().createRefPlace();
	   fr.lip6.move.pnml.symmetricnet.hlcorestructure.hlapi.RefPlaceHLAPI hlapi = new RefPlaceHLAPI(llapi);
		assert hlapi.getContainedItem().equals(llapi);
	}

	//getters giving HLAPI object
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "RefPlaceHLAPI"})
		public void getNameHLAPITest(){
			RefPlaceHLAPI elem = new RefPlaceHLAPI(new HlcorestructureFactoryImpl().createRefPlace());

			
				elem.setNameHLAPI(itemname);
				NameHLAPI totest = elem.getNameHLAPI();
				assert totest.getContainedItem().equals(elem.getName());
			
		}
	
	

	
		/**
		 * This test add a random number of desired objet in the list or of one of each existing subtypes.
		 * then test how many objet are retuned and if any exist inthe original list.
		 */
		@Test(groups = { "hlapi", "RefPlaceHLAPI"})
		public void getToolspecificsHLAPITest(){
			RefPlace llapi = new HlcorestructureFactoryImpl().createRefPlace();
			int howmany;
			
			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getToolspecifics().add(new HlcorestructureFactoryImpl().createToolInfo());
			

			RefPlaceHLAPI elem = new RefPlaceHLAPI(llapi);
			List<ToolInfoHLAPI> totest = elem.getToolspecificsHLAPI();

			assert totest.size() == howmany;

			for (ToolInfoHLAPI unit : totest) {
             assert llapi.getToolspecifics().contains(unit.getContainedItem()) : "missing element";
         }
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "RefPlaceHLAPI"})
		public void getContainerPageHLAPITest(){
			RefPlaceHLAPI elem = new RefPlaceHLAPI(new HlcorestructureFactoryImpl().createRefPlace());

			
				elem.setContainerPageHLAPI(itemcontainerPage);
				PageHLAPI totest = elem.getContainerPageHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerPage());
			
		}
	
	

	
		/**
		 * This test add a random number of desired objet in the list or of one of each existing subtypes.
		 * then test how many objet are retuned and if any exist inthe original list.
		 */
		@Test(groups = { "hlapi", "RefPlaceHLAPI"})
		public void getInArcsHLAPITest(){
			RefPlace llapi = new HlcorestructureFactoryImpl().createRefPlace();
			int howmany;
			
			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getInArcs().add(new HlcorestructureFactoryImpl().createArc());
			

			RefPlaceHLAPI elem = new RefPlaceHLAPI(llapi);
			List<ArcHLAPI> totest = elem.getInArcsHLAPI();

			assert totest.size() == howmany;

			for (ArcHLAPI unit : totest) {
             assert llapi.getInArcs().contains(unit.getContainedItem()) : "missing element";
         }
		}
	
	

	
		/**
		 * This test add a random number of desired objet in the list or of one of each existing subtypes.
		 * then test how many objet are retuned and if any exist inthe original list.
		 */
		@Test(groups = { "hlapi", "RefPlaceHLAPI"})
		public void getOutArcsHLAPITest(){
			RefPlace llapi = new HlcorestructureFactoryImpl().createRefPlace();
			int howmany;
			
			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getOutArcs().add(new HlcorestructureFactoryImpl().createArc());
			

			RefPlaceHLAPI elem = new RefPlaceHLAPI(llapi);
			List<ArcHLAPI> totest = elem.getOutArcsHLAPI();

			assert totest.size() == howmany;

			for (ArcHLAPI unit : totest) {
             assert llapi.getOutArcs().contains(unit.getContainedItem()) : "missing element";
         }
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "RefPlaceHLAPI"})
		public void getNodegraphicsHLAPITest(){
			RefPlaceHLAPI elem = new RefPlaceHLAPI(new HlcorestructureFactoryImpl().createRefPlace());

			
				elem.setNodegraphicsHLAPI(itemnodegraphics);
				NodeGraphicsHLAPI totest = elem.getNodegraphicsHLAPI();
				assert totest.getContainedItem().equals(elem.getNodegraphics());
			
		}
	
	

	
		/**
		 * This test add a random number of desired objet in the list or of one of each existing subtypes.
		 * then test how many objet are retuned and if any exist inthe original list.
		 */
		@Test(groups = { "hlapi", "RefPlaceHLAPI"})
		public void getReferencingPlacesHLAPITest(){
			RefPlace llapi = new HlcorestructureFactoryImpl().createRefPlace();
			int howmany;
			
			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getReferencingPlaces().add(new HlcorestructureFactoryImpl().createRefPlace());
			

			RefPlaceHLAPI elem = new RefPlaceHLAPI(llapi);
			List<RefPlaceHLAPI> totest = elem.getReferencingPlacesHLAPI();

			assert totest.size() == howmany;

			for (RefPlaceHLAPI unit : totest) {
             assert llapi.getReferencingPlaces().contains(unit.getContainedItem()) : "missing element";
         }
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "RefPlaceHLAPI"})
		public void getRefHLAPITest(){
			RefPlaceHLAPI elem = new RefPlaceHLAPI(new HlcorestructureFactoryImpl().createRefPlace());

			
				elem.setRefHLAPI(new fr.lip6.move.pnml.symmetricnet.hlcorestructure.hlapi.PlaceHLAPI(new HlcorestructureFactoryImpl().createPlace()));
				PlaceNodeHLAPI totest_hlcorestructure_Place = elem.getRefHLAPI();
				assert totest_hlcorestructure_Place.getContainedItem().equals(elem.getRef());
			
				elem.setRefHLAPI(new fr.lip6.move.pnml.symmetricnet.hlcorestructure.hlapi.RefPlaceHLAPI(new HlcorestructureFactoryImpl().createRefPlace()));
				PlaceNodeHLAPI totest_hlcorestructure_RefPlace = elem.getRefHLAPI();
				assert totest_hlcorestructure_RefPlace.getContainedItem().equals(elem.getRef());
			
		}
	

	//Special getter for list of generics object, return only one object type.
	
	
	
	
	
	
	
	
	

	//setters/remover for lists.
	
	@Test(groups = { "hlapi", "RefPlaceHLAPI"})
	public void addToolspecificsHLAPITest(){
		RefPlaceHLAPI elem = new RefPlaceHLAPI(new HlcorestructureFactoryImpl().createRefPlace());
		int howmany = (int)(Math.random()*10);
		for(int i =0; i<howmany;i++)
			
			elem.addToolspecificsHLAPI(new ToolInfoHLAPI(new HlcorestructureFactoryImpl().createToolInfo()));
			

		assert elem.getContainedItem().getToolspecifics().size() == howmany;
	}

	@Test(groups = { "hlapi", "RefPlaceHLAPI"})
	public void removeToolspecificsTest(){
		RefPlaceHLAPI elem = new RefPlaceHLAPI(new HlcorestructureFactoryImpl().createRefPlace());
		int howmany = (int)(Math.random()*10);
		int howdiff = (int)(Math.random()*10);

			
			ToolInfoHLAPI sav;

		for(int i =0; i<(howmany);i++)
			
			elem.addToolspecificsHLAPI(new ToolInfoHLAPI(new HlcorestructureFactoryImpl().createToolInfo()));
			


		
		sav = new ToolInfoHLAPI(new HlcorestructureFactoryImpl().createToolInfo());
		

		elem.addToolspecificsHLAPI(sav);
		assert elem.getContainedItem().getToolspecifics().size() == howmany+1;

		for(int i =0; i<(howdiff);i++)
			
			elem.addToolspecificsHLAPI(new ToolInfoHLAPI(new HlcorestructureFactoryImpl().createToolInfo()));
			


		elem.removeToolspecificsHLAPI(sav);

		assert elem.getContainedItem().getToolspecifics().size() == howmany+howdiff;
	}
	

	@Test(groups = { "hlapi", "RefPlaceHLAPI"})
	public void equalsTest(){
		RefPlace a = new HlcorestructureFactoryImpl().createRefPlace();
		RefPlace b = new HlcorestructureFactoryImpl().createRefPlace();
		RefPlaceHLAPI aprime = new RefPlaceHLAPI(a);
		RefPlaceHLAPI asecond = new RefPlaceHLAPI(a);
		RefPlaceHLAPI bprime = new RefPlaceHLAPI(b);

		assert aprime.equals(asecond);
		assert !aprime.equals(bprime);
	}

	//cloning method
	//public RefPlaceHLAPI clone(){
	//	return new RefPlaceHLAPI(this);
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
