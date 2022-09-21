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
 * $Id ggiffo, Wed Feb 10 15:00:49 CET 2016$
 */
package fr.lip6.move.pnml.ptnet.hlapi;

import fr.lip6.move.pnml.ptnet.AnnotationGraphics;
import fr.lip6.move.pnml.ptnet.Arc;
import fr.lip6.move.pnml.ptnet.Name;
import fr.lip6.move.pnml.ptnet.NodeGraphics;
import fr.lip6.move.pnml.ptnet.PNType;
import fr.lip6.move.pnml.ptnet.PTArcAnnotation;
import fr.lip6.move.pnml.ptnet.PTMarking;
import fr.lip6.move.pnml.ptnet.Page;
import fr.lip6.move.pnml.ptnet.PetriNet;
import fr.lip6.move.pnml.ptnet.PetriNetDoc;
import fr.lip6.move.pnml.ptnet.Place;
import fr.lip6.move.pnml.ptnet.PnObject;
import fr.lip6.move.pnml.ptnet.ToolInfo;

import fr.lip6.move.pnml.ptnet.impl.PtnetFactoryImpl;

import java.util.List;

import  fr.lip6.move.pnml.framework.hlapi.*;
import fr.lip6.move.pnml.ptnet.hlapi.*;

import java.util.ArrayList;
import java.util.List;
import org.apache.axiom.om.*;
import fr.lip6.move.pnml.framework.utils.IdRefLinker;
import org.eclipse.emf.common.util.DiagnosticChain;
import fr.lip6.move.pnml.ptnet.*;
import fr.lip6.move.pnml.ptnet.impl.*;
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
	    System.out.println("done for "+"PageHLAPI(ptnet)");
	}


	@BeforeMethod(groups = { "PageHLAPI", "hlapi" })
	public void setup() throws Exception{
	//ModelRepository.reset(); ModelRepository.getInstance().createDocumentWorkspace("void");
	ModelRepository mr = ModelRepository.getInstance();
	mr.createDocumentWorkspace("void");
	
			itemid = "unid";
			
			
			//PtnetFactoryImpl
			itemname = new NameHLAPI(new PtnetFactoryImpl().createName());
			
		
			
			//PtnetFactoryImpl
			itemnodegraphics = new NodeGraphicsHLAPI(new PtnetFactoryImpl().createNodeGraphics());
			
		

	
		
		itemcontainerPage = new PageHLAPI(new PtnetFactoryImpl().createPage());
		
	
		
		itemcontainerPetriNet = new PetriNetHLAPI(new PtnetFactoryImpl().createPetriNet());
		
	
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
	   Page llapi = new PtnetFactoryImpl().createPage();
	   fr.lip6.move.pnml.ptnet.hlapi.PageHLAPI hlapi = new PageHLAPI(llapi);
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
			PageHLAPI elem = new PageHLAPI(new PtnetFactoryImpl().createPage());

			
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
			Page llapi = new PtnetFactoryImpl().createPage();
			int howmany;
			
			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getToolspecifics().add(new PtnetFactoryImpl().createToolInfo());
			

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
			PageHLAPI elem = new PageHLAPI(new PtnetFactoryImpl().createPage());

			
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
			Page llapi = new PtnetFactoryImpl().createPage();
			int howmany;
			
			llapi.getObjects().add(
			   new PtnetFactoryImpl().createPage()
			);
			
			llapi.getObjects().add(
			   new PtnetFactoryImpl().createArc()
			);
			
			llapi.getObjects().add(
			   new PtnetFactoryImpl().createPlace()
			);
			
			llapi.getObjects().add(
			   new PtnetFactoryImpl().createRefTransition()
			);
			
			llapi.getObjects().add(
			   new PtnetFactoryImpl().createTransition()
			);
			
			llapi.getObjects().add(
			   new PtnetFactoryImpl().createRefPlace()
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
			PageHLAPI elem = new PageHLAPI(new PtnetFactoryImpl().createPage());

			
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
			PageHLAPI elem = new PageHLAPI(new PtnetFactoryImpl().createPage());

			
				elem.setNodegraphicsHLAPI(itemnodegraphics);
				NodeGraphicsHLAPI totest = elem.getNodegraphicsHLAPI();
				assert totest.getContainedItem().equals(elem.getNodegraphics());
			
		}
	

	//Special getter for list of generics object, return only one object type.
	
	
	
	
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "PageHLAPI"})
		public void getObjects_PageHLAPITest(){
			Page llapi = new PtnetFactoryImpl().createPage();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getObjects().add(new PtnetFactoryImpl().createPage());
			
			llapi.getObjects().add(
			   new PtnetFactoryImpl().createPage()
			);
			
			llapi.getObjects().add(
			   new PtnetFactoryImpl().createArc()
			);
			
			llapi.getObjects().add(
			   new PtnetFactoryImpl().createPlace()
			);
			
			llapi.getObjects().add(
			   new PtnetFactoryImpl().createRefTransition()
			);
			
			llapi.getObjects().add(
			   new PtnetFactoryImpl().createTransition()
			);
			
			llapi.getObjects().add(
			   new PtnetFactoryImpl().createRefPlace()
			);
			
			howmany += 6;

			PageHLAPI elem = new PageHLAPI(llapi);
			List<fr.lip6.move.pnml.ptnet.hlapi.PageHLAPI> totest = elem.getObjects_PageHLAPI();

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
		public void getObjects_ArcHLAPITest(){
			Page llapi = new PtnetFactoryImpl().createPage();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getObjects().add(new PtnetFactoryImpl().createArc());
			
			llapi.getObjects().add(
			   new PtnetFactoryImpl().createPage()
			);
			
			llapi.getObjects().add(
			   new PtnetFactoryImpl().createArc()
			);
			
			llapi.getObjects().add(
			   new PtnetFactoryImpl().createPlace()
			);
			
			llapi.getObjects().add(
			   new PtnetFactoryImpl().createRefTransition()
			);
			
			llapi.getObjects().add(
			   new PtnetFactoryImpl().createTransition()
			);
			
			llapi.getObjects().add(
			   new PtnetFactoryImpl().createRefPlace()
			);
			
			howmany += 6;

			PageHLAPI elem = new PageHLAPI(llapi);
			List<fr.lip6.move.pnml.ptnet.hlapi.ArcHLAPI> totest = elem.getObjects_ArcHLAPI();

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
		public void getObjects_PlaceHLAPITest(){
			Page llapi = new PtnetFactoryImpl().createPage();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getObjects().add(new PtnetFactoryImpl().createPlace());
			
			llapi.getObjects().add(
			   new PtnetFactoryImpl().createPage()
			);
			
			llapi.getObjects().add(
			   new PtnetFactoryImpl().createArc()
			);
			
			llapi.getObjects().add(
			   new PtnetFactoryImpl().createPlace()
			);
			
			llapi.getObjects().add(
			   new PtnetFactoryImpl().createRefTransition()
			);
			
			llapi.getObjects().add(
			   new PtnetFactoryImpl().createTransition()
			);
			
			llapi.getObjects().add(
			   new PtnetFactoryImpl().createRefPlace()
			);
			
			howmany += 6;

			PageHLAPI elem = new PageHLAPI(llapi);
			List<fr.lip6.move.pnml.ptnet.hlapi.PlaceHLAPI> totest = elem.getObjects_PlaceHLAPI();

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
		public void getObjects_RefTransitionHLAPITest(){
			Page llapi = new PtnetFactoryImpl().createPage();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getObjects().add(new PtnetFactoryImpl().createRefTransition());
			
			llapi.getObjects().add(
			   new PtnetFactoryImpl().createPage()
			);
			
			llapi.getObjects().add(
			   new PtnetFactoryImpl().createArc()
			);
			
			llapi.getObjects().add(
			   new PtnetFactoryImpl().createPlace()
			);
			
			llapi.getObjects().add(
			   new PtnetFactoryImpl().createRefTransition()
			);
			
			llapi.getObjects().add(
			   new PtnetFactoryImpl().createTransition()
			);
			
			llapi.getObjects().add(
			   new PtnetFactoryImpl().createRefPlace()
			);
			
			howmany += 6;

			PageHLAPI elem = new PageHLAPI(llapi);
			List<fr.lip6.move.pnml.ptnet.hlapi.RefTransitionHLAPI> totest = elem.getObjects_RefTransitionHLAPI();

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
		public void getObjects_TransitionHLAPITest(){
			Page llapi = new PtnetFactoryImpl().createPage();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getObjects().add(new PtnetFactoryImpl().createTransition());
			
			llapi.getObjects().add(
			   new PtnetFactoryImpl().createPage()
			);
			
			llapi.getObjects().add(
			   new PtnetFactoryImpl().createArc()
			);
			
			llapi.getObjects().add(
			   new PtnetFactoryImpl().createPlace()
			);
			
			llapi.getObjects().add(
			   new PtnetFactoryImpl().createRefTransition()
			);
			
			llapi.getObjects().add(
			   new PtnetFactoryImpl().createTransition()
			);
			
			llapi.getObjects().add(
			   new PtnetFactoryImpl().createRefPlace()
			);
			
			howmany += 6;

			PageHLAPI elem = new PageHLAPI(llapi);
			List<fr.lip6.move.pnml.ptnet.hlapi.TransitionHLAPI> totest = elem.getObjects_TransitionHLAPI();

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
		public void getObjects_RefPlaceHLAPITest(){
			Page llapi = new PtnetFactoryImpl().createPage();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getObjects().add(new PtnetFactoryImpl().createRefPlace());
			
			llapi.getObjects().add(
			   new PtnetFactoryImpl().createPage()
			);
			
			llapi.getObjects().add(
			   new PtnetFactoryImpl().createArc()
			);
			
			llapi.getObjects().add(
			   new PtnetFactoryImpl().createPlace()
			);
			
			llapi.getObjects().add(
			   new PtnetFactoryImpl().createRefTransition()
			);
			
			llapi.getObjects().add(
			   new PtnetFactoryImpl().createTransition()
			);
			
			llapi.getObjects().add(
			   new PtnetFactoryImpl().createRefPlace()
			);
			
			howmany += 6;

			PageHLAPI elem = new PageHLAPI(llapi);
			List<fr.lip6.move.pnml.ptnet.hlapi.RefPlaceHLAPI> totest = elem.getObjects_RefPlaceHLAPI();

			assert totest.size() == howmany + 1 - 6;

			for (PnObjectHLAPI unit : totest) {
             assert llapi.getObjects().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
	
	
	
	

	//setters/remover for lists.
	
	@Test(groups = { "hlapi", "PageHLAPI"})
	public void addToolspecificsHLAPITest(){
		PageHLAPI elem = new PageHLAPI(new PtnetFactoryImpl().createPage());
		int howmany = (int)(Math.random()*10);
		for(int i =0; i<howmany;i++)
			
			elem.addToolspecificsHLAPI(new ToolInfoHLAPI(new PtnetFactoryImpl().createToolInfo()));
			

		assert elem.getContainedItem().getToolspecifics().size() == howmany;
	}

	@Test(groups = { "hlapi", "PageHLAPI"})
	public void removeToolspecificsTest(){
		PageHLAPI elem = new PageHLAPI(new PtnetFactoryImpl().createPage());
		int howmany = (int)(Math.random()*10);
		int howdiff = (int)(Math.random()*10);

			
			ToolInfoHLAPI sav;

		for(int i =0; i<(howmany);i++)
			
			elem.addToolspecificsHLAPI(new ToolInfoHLAPI(new PtnetFactoryImpl().createToolInfo()));
			


		
		sav = new ToolInfoHLAPI(new PtnetFactoryImpl().createToolInfo());
		

		elem.addToolspecificsHLAPI(sav);
		assert elem.getContainedItem().getToolspecifics().size() == howmany+1;

		for(int i =0; i<(howdiff);i++)
			
			elem.addToolspecificsHLAPI(new ToolInfoHLAPI(new PtnetFactoryImpl().createToolInfo()));
			


		elem.removeToolspecificsHLAPI(sav);

		assert elem.getContainedItem().getToolspecifics().size() == howmany+howdiff;
	}
	
	@Test(groups = { "hlapi", "PageHLAPI"})
	public void addObjectsHLAPITest(){
		PageHLAPI elem = new PageHLAPI(new PtnetFactoryImpl().createPage());
		int howmany = (int)(Math.random()*10);
		for(int i =0; i<howmany;i++)
			
			elem.addObjectsHLAPI(
				new PageHLAPI(
					new PtnetFactoryImpl().createPage()
				)
			);
			

		assert elem.getContainedItem().getObjects().size() == howmany;
	}

	@Test(groups = { "hlapi", "PageHLAPI"})
	public void removeObjectsTest(){
		PageHLAPI elem = new PageHLAPI(new PtnetFactoryImpl().createPage());
		int howmany = (int)(Math.random()*10);
		int howdiff = (int)(Math.random()*10);

			
			PageHLAPI sav;
			

		for(int i =0; i<(howmany);i++)
			
			elem.addObjectsHLAPI(
				new PageHLAPI(
				  new PtnetFactoryImpl().createPage()
				)
			);
			


		
		sav =
			new PageHLAPI(
			  new PtnetFactoryImpl().createPage()
			);
		

		elem.addObjectsHLAPI(sav);
		assert elem.getContainedItem().getObjects().size() == howmany+1;

		for(int i =0; i<(howdiff);i++)
			
			elem.addObjectsHLAPI(
				new PageHLAPI(
				  new PtnetFactoryImpl().createPage()
				)
			);
			


		elem.removeObjectsHLAPI(sav);

		assert elem.getContainedItem().getObjects().size() == howmany+howdiff;
	}
	

	@Test(groups = { "hlapi", "PageHLAPI"})
	public void equalsTest(){
		Page a = new PtnetFactoryImpl().createPage();
		Page b = new PtnetFactoryImpl().createPage();
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
