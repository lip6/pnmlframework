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
 * $Id ggiffo, Thu Feb 11 16:29:58 CET 2016$
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

import fr.lip6.move.pnml.hlpn.hlcorestructure.AnyObject;
import fr.lip6.move.pnml.hlpn.hlcorestructure.Condition;
import fr.lip6.move.pnml.hlpn.hlcorestructure.Declaration;
import fr.lip6.move.pnml.hlpn.hlcorestructure.HLAnnotation;
import fr.lip6.move.pnml.hlpn.hlcorestructure.HLMarking;
import fr.lip6.move.pnml.hlpn.hlcorestructure.Name;
import fr.lip6.move.pnml.hlpn.hlcorestructure.NodeGraphics;
import fr.lip6.move.pnml.hlpn.hlcorestructure.PNType;
import fr.lip6.move.pnml.hlpn.hlcorestructure.Page;
import fr.lip6.move.pnml.hlpn.hlcorestructure.PetriNet;
import fr.lip6.move.pnml.hlpn.hlcorestructure.PetriNetDoc;
import fr.lip6.move.pnml.hlpn.hlcorestructure.PnObject;
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
public class PageHLAPITest {

	
	private String itemid;
		
	private NameHLAPI itemname;
		
	private NodeGraphicsHLAPI itemnodegraphics;
		
	
	private PageHLAPI itemcontainerPage;
	
	private PetriNetHLAPI itemcontainerPetriNet;
	


	@AfterTest(groups = { "PageHLAPI", "hlapi" })
	public void After() {
	    System.out.println("done for "+"PageHLAPI(hlcorestructure)");
	}


	@BeforeMethod(groups = { "PageHLAPI", "hlapi" })
	public void setup() throws Exception{
	//ModelRepository.reset(); ModelRepository.getInstance().createDocumentWorkspace("void");
	ModelRepository mr = ModelRepository.getInstance();
	mr.createDocumentWorkspace("void");
	
			itemid = "unid";
			
			
			//HlcorestructureFactoryImpl
			itemname = new NameHLAPI(new HlcorestructureFactoryImpl().createName());
			
		
			
			//HlcorestructureFactoryImpl
			itemnodegraphics = new NodeGraphicsHLAPI(new HlcorestructureFactoryImpl().createNodeGraphics());
			
		

	
		
		itemcontainerPage = new PageHLAPI(new HlcorestructureFactoryImpl().createPage());
		
	
		
		itemcontainerPetriNet = new PetriNetHLAPI(new HlcorestructureFactoryImpl().createPetriNet());
		
	
	}

	/**
	 * this constructor allows you to set all 'settable' values
	 * excepted container.
	 */
	@Test(groups = { "hlapi", "PageHLAPI"}, dependsOnMethods={"PageHLAPI_LLAPI"})
	public void PageHLAPI_1() throws InvalidIDException ,VoidRepositoryException   {//BEGIN CONSTRUCTOR BODY
   @SuppressWarnings("unused")
	PageHLAPI totest = new PageHLAPI(
		itemid
		,	
		itemname
		,	
		itemnodegraphics
	);
	
	
	assert totest.getId().equals(itemid);
	
	
	
	
	assert totest.getName().equals(itemname.getContainedItem());
	
	
	
	
	assert totest.getNodegraphics().equals(itemnodegraphics.getContainedItem());
	
	
	}

	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "PageHLAPI"}, dependsOnMethods={"PageHLAPI_LLAPI"})
	public void PageHLAPI_2_containerPage() throws InvalidIDException ,VoidRepositoryException   {//BEGIN CONSTRUCTOR BODY

	PageHLAPI totest = new PageHLAPI(
		itemid
		,	
		itemname
		,	
		itemnodegraphics
	,	
		itemcontainerPage
	);
	
	
			assert totest.getId().equals(itemid);
		
	
	
		
			assert totest.getName().equals(itemname.getContainedItem());
		
	
	
		
			assert totest.getNodegraphics().equals(itemnodegraphics.getContainedItem());
		
	
	assert totest.getContainerPage().equals(itemcontainerPage.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "PageHLAPI"}, dependsOnMethods={"PageHLAPI_LLAPI"})
	public void PageHLAPI_2_containerPetriNet() throws InvalidIDException ,VoidRepositoryException   {//BEGIN CONSTRUCTOR BODY

	PageHLAPI totest = new PageHLAPI(
		itemid
		,	
		itemname
		,	
		itemnodegraphics
	,	
		itemcontainerPetriNet
	);
	
	
			assert totest.getId().equals(itemid);
		
	
	
		
			assert totest.getName().equals(itemname.getContainedItem());
		
	
	
		
			assert totest.getNodegraphics().equals(itemnodegraphics.getContainedItem());
		
	
	assert totest.getContainerPetriNet().equals(itemcontainerPetriNet.getContainedItem());
	}

	/**
    * This constructor give access to required stuff only (not container if any)
    */
   @Test(groups = { "hlapi", "PageHLAPI"}, dependsOnMethods={"PageHLAPI_LLAPI"})
	public void PageHLAPI_3() throws InvalidIDException ,VoidRepositoryException   {//BEGIN CONSTRUCTOR BODY

	PageHLAPI totest = new PageHLAPI(
		itemid
	);

	
	
			assert totest.getId().equals(itemid);
		
	
	}

	/**
    * This constructor give access to required stuff only (and container)
    */
   @Test(groups = { "hlapi", "PageHLAPI"}, dependsOnMethods={"PageHLAPI_LLAPI"})
	public void PageHLAPI_4_containerPage() throws InvalidIDException ,VoidRepositoryException   {//BEGIN CONSTRUCTOR BODY

	PageHLAPI totest = new PageHLAPI(
		itemid
	,	
	  itemcontainerPage
	);

	
	
			assert totest.getId().equals(itemid);
		
	
	assert totest.getContainerPage().equals(itemcontainerPage.getContainedItem());
	}
	/**
    * This constructor give access to required stuff only (and container)
    */
   @Test(groups = { "hlapi", "PageHLAPI"}, dependsOnMethods={"PageHLAPI_LLAPI"})
	public void PageHLAPI_4_containerPetriNet() throws InvalidIDException ,VoidRepositoryException   {//BEGIN CONSTRUCTOR BODY

	PageHLAPI totest = new PageHLAPI(
		itemid
	,	
	  itemcontainerPetriNet
	);

	
	
			assert totest.getId().equals(itemid);
		
	
	assert totest.getContainerPetriNet().equals(itemcontainerPetriNet.getContainedItem());
	}


	/**
	 * This constructor encapsulate a low level API object in HLAPI.
	 */
	@Test(groups = { "hlapi", "PageHLAPI"})
	public void PageHLAPI_LLAPI(){
	   Page llapi = new HlcorestructureFactoryImpl().createPage();
	   fr.lip6.move.pnml.hlpn.hlcorestructure.hlapi.PageHLAPI hlapi = new PageHLAPI(llapi);
		assert hlapi.getContainedItem().equals(llapi);
	}

	//getters giving HLAPI object
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "PageHLAPI"})
		public void getNameHLAPITest(){
			PageHLAPI elem = new PageHLAPI(new HlcorestructureFactoryImpl().createPage());

			
				elem.setNameHLAPI(itemname);
				NameHLAPI totest = elem.getNameHLAPI();
				assert totest.getContainedItem().equals(elem.getName());
			
		}
	
	

	
		/**
		 * This test add a random number of desired objet in the list or of one of each existing subtypes.
		 * then test how many objet are retuned and if any exist inthe original list.
		 */
		@Test(groups = { "hlapi", "PageHLAPI"})
		public void getToolspecificsHLAPITest(){
			Page llapi = new HlcorestructureFactoryImpl().createPage();
			int howmany;
			
			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getToolspecifics().add(new HlcorestructureFactoryImpl().createToolInfo());
			

			PageHLAPI elem = new PageHLAPI(llapi);
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
		@Test(groups = { "hlapi", "PageHLAPI"})
		public void getContainerPageHLAPITest(){
			PageHLAPI elem = new PageHLAPI(new HlcorestructureFactoryImpl().createPage());

			
				elem.setContainerPageHLAPI(itemcontainerPage);
				PageHLAPI totest = elem.getContainerPageHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerPage());
			
		}
	
	

	
		/**
		 * This test add a random number of desired objet in the list or of one of each existing subtypes.
		 * then test how many objet are retuned and if any exist inthe original list.
		 */
		@Test(groups = { "hlapi", "PageHLAPI"})
		public void getObjectsHLAPITest(){
			Page llapi = new HlcorestructureFactoryImpl().createPage();
			int howmany;
			
			llapi.getObjects().add(
			   new HlcorestructureFactoryImpl().createPage()
			);
			
			llapi.getObjects().add(
			   new HlcorestructureFactoryImpl().createArc()
			);
			
			llapi.getObjects().add(
			   new HlcorestructureFactoryImpl().createPlace()
			);
			
			llapi.getObjects().add(
			   new HlcorestructureFactoryImpl().createRefTransition()
			);
			
			llapi.getObjects().add(
			   new HlcorestructureFactoryImpl().createTransition()
			);
			
			llapi.getObjects().add(
			   new HlcorestructureFactoryImpl().createRefPlace()
			);
			
			howmany = 6;
			

			PageHLAPI elem = new PageHLAPI(llapi);
			List<PnObjectHLAPI> totest = elem.getObjectsHLAPI();

			assert totest.size() == howmany;

			for (PnObjectHLAPI unit : totest) {
             assert llapi.getObjects().contains(unit.getContainedItem()) : "missing element";
         }
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "PageHLAPI"})
		public void getContainerPetriNetHLAPITest(){
			PageHLAPI elem = new PageHLAPI(new HlcorestructureFactoryImpl().createPage());

			
				elem.setContainerPetriNetHLAPI(itemcontainerPetriNet);
				PetriNetHLAPI totest = elem.getContainerPetriNetHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerPetriNet());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "PageHLAPI"})
		public void getNodegraphicsHLAPITest(){
			PageHLAPI elem = new PageHLAPI(new HlcorestructureFactoryImpl().createPage());

			
				elem.setNodegraphicsHLAPI(itemnodegraphics);
				NodeGraphicsHLAPI totest = elem.getNodegraphicsHLAPI();
				assert totest.getContainedItem().equals(elem.getNodegraphics());
			
		}
	
	

	
		/**
		 * This test add a random number of desired objet in the list or of one of each existing subtypes.
		 * then test how many objet are retuned and if any exist inthe original list.
		 */
		@Test(groups = { "hlapi", "PageHLAPI"})
		public void getDeclarationHLAPITest(){
			Page llapi = new HlcorestructureFactoryImpl().createPage();
			int howmany;
			
			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getDeclaration().add(new HlcorestructureFactoryImpl().createDeclaration());
			

			PageHLAPI elem = new PageHLAPI(llapi);
			List<DeclarationHLAPI> totest = elem.getDeclarationHLAPI();

			assert totest.size() == howmany;

			for (DeclarationHLAPI unit : totest) {
             assert llapi.getDeclaration().contains(unit.getContainedItem()) : "missing element";
         }
		}
	

	//Special getter for list of generics object, return only one object type.
	
	
	
	
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "PageHLAPI"})
		public void getObjects_hlcorestructure_PageHLAPITest(){
			Page llapi = new HlcorestructureFactoryImpl().createPage();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getObjects().add(new HlcorestructureFactoryImpl().createPage());
			
			llapi.getObjects().add(
			   new HlcorestructureFactoryImpl().createPage()
			);
			
			llapi.getObjects().add(
			   new HlcorestructureFactoryImpl().createArc()
			);
			
			llapi.getObjects().add(
			   new HlcorestructureFactoryImpl().createPlace()
			);
			
			llapi.getObjects().add(
			   new HlcorestructureFactoryImpl().createRefTransition()
			);
			
			llapi.getObjects().add(
			   new HlcorestructureFactoryImpl().createTransition()
			);
			
			llapi.getObjects().add(
			   new HlcorestructureFactoryImpl().createRefPlace()
			);
			
			howmany += 6;

			PageHLAPI elem = new PageHLAPI(llapi);
			List<fr.lip6.move.pnml.hlpn.hlcorestructure.hlapi.PageHLAPI> totest = elem.getObjects_hlcorestructure_PageHLAPI();

			assert totest.size() == howmany + 1 - 6;

			for (PnObjectHLAPI unit : totest) {
             assert llapi.getObjects().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "PageHLAPI"})
		public void getObjects_hlcorestructure_ArcHLAPITest(){
			Page llapi = new HlcorestructureFactoryImpl().createPage();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getObjects().add(new HlcorestructureFactoryImpl().createArc());
			
			llapi.getObjects().add(
			   new HlcorestructureFactoryImpl().createPage()
			);
			
			llapi.getObjects().add(
			   new HlcorestructureFactoryImpl().createArc()
			);
			
			llapi.getObjects().add(
			   new HlcorestructureFactoryImpl().createPlace()
			);
			
			llapi.getObjects().add(
			   new HlcorestructureFactoryImpl().createRefTransition()
			);
			
			llapi.getObjects().add(
			   new HlcorestructureFactoryImpl().createTransition()
			);
			
			llapi.getObjects().add(
			   new HlcorestructureFactoryImpl().createRefPlace()
			);
			
			howmany += 6;

			PageHLAPI elem = new PageHLAPI(llapi);
			List<fr.lip6.move.pnml.hlpn.hlcorestructure.hlapi.ArcHLAPI> totest = elem.getObjects_hlcorestructure_ArcHLAPI();

			assert totest.size() == howmany + 1 - 6;

			for (PnObjectHLAPI unit : totest) {
             assert llapi.getObjects().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "PageHLAPI"})
		public void getObjects_hlcorestructure_PlaceHLAPITest(){
			Page llapi = new HlcorestructureFactoryImpl().createPage();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getObjects().add(new HlcorestructureFactoryImpl().createPlace());
			
			llapi.getObjects().add(
			   new HlcorestructureFactoryImpl().createPage()
			);
			
			llapi.getObjects().add(
			   new HlcorestructureFactoryImpl().createArc()
			);
			
			llapi.getObjects().add(
			   new HlcorestructureFactoryImpl().createPlace()
			);
			
			llapi.getObjects().add(
			   new HlcorestructureFactoryImpl().createRefTransition()
			);
			
			llapi.getObjects().add(
			   new HlcorestructureFactoryImpl().createTransition()
			);
			
			llapi.getObjects().add(
			   new HlcorestructureFactoryImpl().createRefPlace()
			);
			
			howmany += 6;

			PageHLAPI elem = new PageHLAPI(llapi);
			List<fr.lip6.move.pnml.hlpn.hlcorestructure.hlapi.PlaceHLAPI> totest = elem.getObjects_hlcorestructure_PlaceHLAPI();

			assert totest.size() == howmany + 1 - 6;

			for (PnObjectHLAPI unit : totest) {
             assert llapi.getObjects().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "PageHLAPI"})
		public void getObjects_hlcorestructure_RefTransitionHLAPITest(){
			Page llapi = new HlcorestructureFactoryImpl().createPage();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getObjects().add(new HlcorestructureFactoryImpl().createRefTransition());
			
			llapi.getObjects().add(
			   new HlcorestructureFactoryImpl().createPage()
			);
			
			llapi.getObjects().add(
			   new HlcorestructureFactoryImpl().createArc()
			);
			
			llapi.getObjects().add(
			   new HlcorestructureFactoryImpl().createPlace()
			);
			
			llapi.getObjects().add(
			   new HlcorestructureFactoryImpl().createRefTransition()
			);
			
			llapi.getObjects().add(
			   new HlcorestructureFactoryImpl().createTransition()
			);
			
			llapi.getObjects().add(
			   new HlcorestructureFactoryImpl().createRefPlace()
			);
			
			howmany += 6;

			PageHLAPI elem = new PageHLAPI(llapi);
			List<fr.lip6.move.pnml.hlpn.hlcorestructure.hlapi.RefTransitionHLAPI> totest = elem.getObjects_hlcorestructure_RefTransitionHLAPI();

			assert totest.size() == howmany + 1 - 6;

			for (PnObjectHLAPI unit : totest) {
             assert llapi.getObjects().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "PageHLAPI"})
		public void getObjects_hlcorestructure_TransitionHLAPITest(){
			Page llapi = new HlcorestructureFactoryImpl().createPage();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getObjects().add(new HlcorestructureFactoryImpl().createTransition());
			
			llapi.getObjects().add(
			   new HlcorestructureFactoryImpl().createPage()
			);
			
			llapi.getObjects().add(
			   new HlcorestructureFactoryImpl().createArc()
			);
			
			llapi.getObjects().add(
			   new HlcorestructureFactoryImpl().createPlace()
			);
			
			llapi.getObjects().add(
			   new HlcorestructureFactoryImpl().createRefTransition()
			);
			
			llapi.getObjects().add(
			   new HlcorestructureFactoryImpl().createTransition()
			);
			
			llapi.getObjects().add(
			   new HlcorestructureFactoryImpl().createRefPlace()
			);
			
			howmany += 6;

			PageHLAPI elem = new PageHLAPI(llapi);
			List<fr.lip6.move.pnml.hlpn.hlcorestructure.hlapi.TransitionHLAPI> totest = elem.getObjects_hlcorestructure_TransitionHLAPI();

			assert totest.size() == howmany + 1 - 6;

			for (PnObjectHLAPI unit : totest) {
             assert llapi.getObjects().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "PageHLAPI"})
		public void getObjects_hlcorestructure_RefPlaceHLAPITest(){
			Page llapi = new HlcorestructureFactoryImpl().createPage();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getObjects().add(new HlcorestructureFactoryImpl().createRefPlace());
			
			llapi.getObjects().add(
			   new HlcorestructureFactoryImpl().createPage()
			);
			
			llapi.getObjects().add(
			   new HlcorestructureFactoryImpl().createArc()
			);
			
			llapi.getObjects().add(
			   new HlcorestructureFactoryImpl().createPlace()
			);
			
			llapi.getObjects().add(
			   new HlcorestructureFactoryImpl().createRefTransition()
			);
			
			llapi.getObjects().add(
			   new HlcorestructureFactoryImpl().createTransition()
			);
			
			llapi.getObjects().add(
			   new HlcorestructureFactoryImpl().createRefPlace()
			);
			
			howmany += 6;

			PageHLAPI elem = new PageHLAPI(llapi);
			List<fr.lip6.move.pnml.hlpn.hlcorestructure.hlapi.RefPlaceHLAPI> totest = elem.getObjects_hlcorestructure_RefPlaceHLAPI();

			assert totest.size() == howmany + 1 - 6;

			for (PnObjectHLAPI unit : totest) {
             assert llapi.getObjects().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
	
	
	
	
	

	//setters/remover for lists.
	
	@Test(groups = { "hlapi", "PageHLAPI"})
	public void addToolspecificsHLAPITest(){
		PageHLAPI elem = new PageHLAPI(new HlcorestructureFactoryImpl().createPage());
		int howmany = (int)(Math.random()*10);
		for(int i =0; i<howmany;i++)
			
			elem.addToolspecificsHLAPI(new ToolInfoHLAPI(new HlcorestructureFactoryImpl().createToolInfo()));
			

		assert elem.getContainedItem().getToolspecifics().size() == howmany;
	}

	@Test(groups = { "hlapi", "PageHLAPI"})
	public void removeToolspecificsTest(){
		PageHLAPI elem = new PageHLAPI(new HlcorestructureFactoryImpl().createPage());
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
	
	@Test(groups = { "hlapi", "PageHLAPI"})
	public void addObjectsHLAPITest(){
		PageHLAPI elem = new PageHLAPI(new HlcorestructureFactoryImpl().createPage());
		int howmany = (int)(Math.random()*10);
		for(int i =0; i<howmany;i++)
			
			elem.addObjectsHLAPI(
				new PageHLAPI(
					new HlcorestructureFactoryImpl().createPage()
				)
			);
			

		assert elem.getContainedItem().getObjects().size() == howmany;
	}

	@Test(groups = { "hlapi", "PageHLAPI"})
	public void removeObjectsTest(){
		PageHLAPI elem = new PageHLAPI(new HlcorestructureFactoryImpl().createPage());
		int howmany = (int)(Math.random()*10);
		int howdiff = (int)(Math.random()*10);

			
			PageHLAPI sav;
			

		for(int i =0; i<(howmany);i++)
			
			elem.addObjectsHLAPI(
				new PageHLAPI(
				  new HlcorestructureFactoryImpl().createPage()
				)
			);
			


		
		sav =
			new PageHLAPI(
			  new HlcorestructureFactoryImpl().createPage()
			);
		

		elem.addObjectsHLAPI(sav);
		assert elem.getContainedItem().getObjects().size() == howmany+1;

		for(int i =0; i<(howdiff);i++)
			
			elem.addObjectsHLAPI(
				new PageHLAPI(
				  new HlcorestructureFactoryImpl().createPage()
				)
			);
			


		elem.removeObjectsHLAPI(sav);

		assert elem.getContainedItem().getObjects().size() == howmany+howdiff;
	}
	
	@Test(groups = { "hlapi", "PageHLAPI"})
	public void addDeclarationHLAPITest(){
		PageHLAPI elem = new PageHLAPI(new HlcorestructureFactoryImpl().createPage());
		int howmany = (int)(Math.random()*10);
		for(int i =0; i<howmany;i++)
			
			elem.addDeclarationHLAPI(new DeclarationHLAPI(new HlcorestructureFactoryImpl().createDeclaration()));
			

		assert elem.getContainedItem().getDeclaration().size() == howmany;
	}

	@Test(groups = { "hlapi", "PageHLAPI"})
	public void removeDeclarationTest(){
		PageHLAPI elem = new PageHLAPI(new HlcorestructureFactoryImpl().createPage());
		int howmany = (int)(Math.random()*10);
		int howdiff = (int)(Math.random()*10);

			
			DeclarationHLAPI sav;

		for(int i =0; i<(howmany);i++)
			
			elem.addDeclarationHLAPI(new DeclarationHLAPI(new HlcorestructureFactoryImpl().createDeclaration()));
			


		
		sav = new DeclarationHLAPI(new HlcorestructureFactoryImpl().createDeclaration());
		

		elem.addDeclarationHLAPI(sav);
		assert elem.getContainedItem().getDeclaration().size() == howmany+1;

		for(int i =0; i<(howdiff);i++)
			
			elem.addDeclarationHLAPI(new DeclarationHLAPI(new HlcorestructureFactoryImpl().createDeclaration()));
			


		elem.removeDeclarationHLAPI(sav);

		assert elem.getContainedItem().getDeclaration().size() == howmany+howdiff;
	}
	

	@Test(groups = { "hlapi", "PageHLAPI"})
	public void equalsTest(){
		Page a = new HlcorestructureFactoryImpl().createPage();
		Page b = new HlcorestructureFactoryImpl().createPage();
		PageHLAPI aprime = new PageHLAPI(a);
		PageHLAPI asecond = new PageHLAPI(a);
		PageHLAPI bprime = new PageHLAPI(b);

		assert aprime.equals(asecond);
		assert !aprime.equals(bprime);
	}

	//cloning method
	//public PageHLAPI clone(){
	//	return new PageHLAPI(this);
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
