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

import java.util.List;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import fr.lip6.move.pnml.framework.utils.ModelRepository;
import fr.lip6.move.pnml.framework.utils.exception.InvalidIDException;
import fr.lip6.move.pnml.framework.utils.exception.VoidRepositoryException;
import fr.lip6.move.pnml.pnmlcoremodel.RefTransition;
import fr.lip6.move.pnml.pnmlcoremodel.impl.PnmlcoremodelFactoryImpl;
public class RefTransitionHLAPITest {

	
	private String itemid;
		
	private NameHLAPI itemname;
		
	private NodeGraphicsHLAPI itemnodegraphics;
		
	private TransitionNodeHLAPI itemref;
		
	
	private PageHLAPI itemcontainerPage;
	


	@AfterTest(groups = { "RefTransitionHLAPI", "hlapi" })
	public void After() {
	    System.out.println("done for "+"RefTransitionHLAPI(pnmlcoremodel)");
	}


	@BeforeMethod(groups = { "RefTransitionHLAPI", "hlapi" })
	public void setup() throws Exception{
	//ModelRepository.reset(); ModelRepository.getInstance().createDocumentWorkspace("void");
	ModelRepository mr = ModelRepository.getInstance();
	mr.createDocumentWorkspace("void");
	
			itemid = "unid";
			
			
			//PnmlcoremodelFactoryImpl
			itemname = new NameHLAPI(new PnmlcoremodelFactoryImpl().createName());
			
		
			
			//PnmlcoremodelFactoryImpl
			itemnodegraphics = new NodeGraphicsHLAPI(new PnmlcoremodelFactoryImpl().createNodeGraphics());
			
		
			
				
			itemref = new fr.lip6.move.pnml.pnmlcoremodel.hlapi.RefTransitionHLAPI(
				new PnmlcoremodelFactoryImpl().createRefTransition()
			);
				
			
		

	
		
		itemcontainerPage = new PageHLAPI(new PnmlcoremodelFactoryImpl().createPage());
		
	
	}

	/**
	 * this constructor allows you to set all 'settable' values
	 * excepted container.
	 */
	@Test(groups = { "hlapi", "RefTransitionHLAPI"}, dependsOnMethods={"RefTransitionHLAPI_LLAPI"})
	public void RefTransitionHLAPI_1() throws InvalidIDException ,VoidRepositoryException   {//BEGIN CONSTRUCTOR BODY
   @SuppressWarnings("unused")
	RefTransitionHLAPI totest = new RefTransitionHLAPI(
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
	@Test(groups = { "hlapi", "RefTransitionHLAPI"}, dependsOnMethods={"RefTransitionHLAPI_LLAPI"})
	public void RefTransitionHLAPI_2_containerPage() throws InvalidIDException ,VoidRepositoryException   {//BEGIN CONSTRUCTOR BODY

	RefTransitionHLAPI totest = new RefTransitionHLAPI(
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
   @Test(groups = { "hlapi", "RefTransitionHLAPI"}, dependsOnMethods={"RefTransitionHLAPI_LLAPI"})
	public void RefTransitionHLAPI_3() throws InvalidIDException ,VoidRepositoryException   {//BEGIN CONSTRUCTOR BODY

	RefTransitionHLAPI totest = new RefTransitionHLAPI(
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
   @Test(groups = { "hlapi", "RefTransitionHLAPI"}, dependsOnMethods={"RefTransitionHLAPI_LLAPI"})
	public void RefTransitionHLAPI_4_containerPage() throws InvalidIDException ,VoidRepositoryException   {//BEGIN CONSTRUCTOR BODY

	RefTransitionHLAPI totest = new RefTransitionHLAPI(
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
	@Test(groups = { "hlapi", "RefTransitionHLAPI"})
	public void RefTransitionHLAPI_LLAPI(){
	   RefTransition llapi = new PnmlcoremodelFactoryImpl().createRefTransition();
	   fr.lip6.move.pnml.pnmlcoremodel.hlapi.RefTransitionHLAPI hlapi = new RefTransitionHLAPI(llapi);
		assert hlapi.getContainedItem().equals(llapi);
	}

	//getters giving HLAPI object
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "RefTransitionHLAPI"})
		public void getNameHLAPITest(){
			RefTransitionHLAPI elem = new RefTransitionHLAPI(new PnmlcoremodelFactoryImpl().createRefTransition());

			
				elem.setNameHLAPI(itemname);
				NameHLAPI totest = elem.getNameHLAPI();
				assert totest.getContainedItem().equals(elem.getName());
			
		}
	
	

	
		/**
		 * This test add a random number of desired objet in the list or of one of each existing subtypes.
		 * then test how many objet are retuned and if any exist inthe original list.
		 */
		@Test(groups = { "hlapi", "RefTransitionHLAPI"})
		public void getToolspecificsHLAPITest(){
			RefTransition llapi = new PnmlcoremodelFactoryImpl().createRefTransition();
			int howmany;
			
			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getToolspecifics().add(new PnmlcoremodelFactoryImpl().createToolInfo());
			

			RefTransitionHLAPI elem = new RefTransitionHLAPI(llapi);
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
		@Test(groups = { "hlapi", "RefTransitionHLAPI"})
		public void getContainerPageHLAPITest(){
			RefTransitionHLAPI elem = new RefTransitionHLAPI(new PnmlcoremodelFactoryImpl().createRefTransition());

			
				elem.setContainerPageHLAPI(itemcontainerPage);
				PageHLAPI totest = elem.getContainerPageHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerPage());
			
		}
	
	

	
		/**
		 * This test add a random number of desired objet in the list or of one of each existing subtypes.
		 * then test how many objet are retuned and if any exist inthe original list.
		 */
		@Test(groups = { "hlapi", "RefTransitionHLAPI"})
		public void getInArcsHLAPITest(){
			RefTransition llapi = new PnmlcoremodelFactoryImpl().createRefTransition();
			int howmany;
			
			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getInArcs().add(new PnmlcoremodelFactoryImpl().createArc());
			

			RefTransitionHLAPI elem = new RefTransitionHLAPI(llapi);
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
		@Test(groups = { "hlapi", "RefTransitionHLAPI"})
		public void getOutArcsHLAPITest(){
			RefTransition llapi = new PnmlcoremodelFactoryImpl().createRefTransition();
			int howmany;
			
			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getOutArcs().add(new PnmlcoremodelFactoryImpl().createArc());
			

			RefTransitionHLAPI elem = new RefTransitionHLAPI(llapi);
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
		@Test(groups = { "hlapi", "RefTransitionHLAPI"})
		public void getNodegraphicsHLAPITest(){
			RefTransitionHLAPI elem = new RefTransitionHLAPI(new PnmlcoremodelFactoryImpl().createRefTransition());

			
				elem.setNodegraphicsHLAPI(itemnodegraphics);
				NodeGraphicsHLAPI totest = elem.getNodegraphicsHLAPI();
				assert totest.getContainedItem().equals(elem.getNodegraphics());
			
		}
	
	

	
		/**
		 * This test add a random number of desired objet in the list or of one of each existing subtypes.
		 * then test how many objet are retuned and if any exist inthe original list.
		 */
		@Test(groups = { "hlapi", "RefTransitionHLAPI"})
		public void getReferencingTransitionsHLAPITest(){
			RefTransition llapi = new PnmlcoremodelFactoryImpl().createRefTransition();
			int howmany;
			
			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getReferencingTransitions().add(new PnmlcoremodelFactoryImpl().createRefTransition());
			

			RefTransitionHLAPI elem = new RefTransitionHLAPI(llapi);
			List<RefTransitionHLAPI> totest = elem.getReferencingTransitionsHLAPI();

			assert totest.size() == howmany;

			for (RefTransitionHLAPI unit : totest) {
             assert llapi.getReferencingTransitions().contains(unit.getContainedItem()) : "missing element";
         }
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "RefTransitionHLAPI"})
		public void getRefHLAPITest(){
			RefTransitionHLAPI elem = new RefTransitionHLAPI(new PnmlcoremodelFactoryImpl().createRefTransition());

			
				elem.setRefHLAPI(new fr.lip6.move.pnml.pnmlcoremodel.hlapi.RefTransitionHLAPI(new PnmlcoremodelFactoryImpl().createRefTransition()));
				TransitionNodeHLAPI totest_pnmlcoremodel_RefTransition = elem.getRefHLAPI();
				assert totest_pnmlcoremodel_RefTransition.getContainedItem().equals(elem.getRef());
			
				elem.setRefHLAPI(new fr.lip6.move.pnml.pnmlcoremodel.hlapi.TransitionHLAPI(new PnmlcoremodelFactoryImpl().createTransition()));
				TransitionNodeHLAPI totest_pnmlcoremodel_Transition = elem.getRefHLAPI();
				assert totest_pnmlcoremodel_Transition.getContainedItem().equals(elem.getRef());
			
		}
	

	//Special getter for list of generics object, return only one object type.
	
	
	
	
	
	
	
	
	

	//setters/remover for lists.
	
	@Test(groups = { "hlapi", "RefTransitionHLAPI"})
	public void addToolspecificsHLAPITest(){
		RefTransitionHLAPI elem = new RefTransitionHLAPI(new PnmlcoremodelFactoryImpl().createRefTransition());
		int howmany = (int)(Math.random()*10);
		for(int i =0; i<howmany;i++)
			
			elem.addToolspecificsHLAPI(new ToolInfoHLAPI(new PnmlcoremodelFactoryImpl().createToolInfo()));
			

		assert elem.getContainedItem().getToolspecifics().size() == howmany;
	}

	@Test(groups = { "hlapi", "RefTransitionHLAPI"})
	public void removeToolspecificsTest(){
		RefTransitionHLAPI elem = new RefTransitionHLAPI(new PnmlcoremodelFactoryImpl().createRefTransition());
		int howmany = (int)(Math.random()*10);
		int howdiff = (int)(Math.random()*10);

			
			ToolInfoHLAPI sav;

		for(int i =0; i<(howmany);i++)
			
			elem.addToolspecificsHLAPI(new ToolInfoHLAPI(new PnmlcoremodelFactoryImpl().createToolInfo()));
			


		
		sav = new ToolInfoHLAPI(new PnmlcoremodelFactoryImpl().createToolInfo());
		

		elem.addToolspecificsHLAPI(sav);
		assert elem.getContainedItem().getToolspecifics().size() == howmany+1;

		for(int i =0; i<(howdiff);i++)
			
			elem.addToolspecificsHLAPI(new ToolInfoHLAPI(new PnmlcoremodelFactoryImpl().createToolInfo()));
			


		elem.removeToolspecificsHLAPI(sav);

		assert elem.getContainedItem().getToolspecifics().size() == howmany+howdiff;
	}
	

	@Test(groups = { "hlapi", "RefTransitionHLAPI"})
	public void equalsTest(){
		RefTransition a = new PnmlcoremodelFactoryImpl().createRefTransition();
		RefTransition b = new PnmlcoremodelFactoryImpl().createRefTransition();
		RefTransitionHLAPI aprime = new RefTransitionHLAPI(a);
		RefTransitionHLAPI asecond = new RefTransitionHLAPI(a);
		RefTransitionHLAPI bprime = new RefTransitionHLAPI(b);

		assert aprime.equals(asecond);
		assert !aprime.equals(bprime);
	}

	//cloning method
	//public RefTransitionHLAPI clone(){
	//	return new RefTransitionHLAPI(this);
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
