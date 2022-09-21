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

import java.util.List;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import fr.lip6.move.pnml.framework.utils.ModelRepository;
import fr.lip6.move.pnml.framework.utils.exception.InvalidIDException;
import fr.lip6.move.pnml.framework.utils.exception.VoidRepositoryException;
import fr.lip6.move.pnml.ptnet.Transition;
import fr.lip6.move.pnml.ptnet.impl.PtnetFactoryImpl;
public class TransitionHLAPITest {

	
	private String itemid;
		
	private NameHLAPI itemname;
		
	private NodeGraphicsHLAPI itemnodegraphics;
		
	
	private PageHLAPI itemcontainerPage;
	


	@AfterTest(groups = { "TransitionHLAPI", "hlapi" })
	public void After() {
	    System.out.println("done for "+"TransitionHLAPI(ptnet)");
	}


	@BeforeMethod(groups = { "TransitionHLAPI", "hlapi" })
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
		
	
	}

	/**
	 * this constructor allows you to set all 'settable' values
	 * excepted container.
	 */
	@Test(groups = { "hlapi", "TransitionHLAPI"}, dependsOnMethods={"TransitionHLAPI_LLAPI"})
	public void TransitionHLAPI_1() throws InvalidIDException ,VoidRepositoryException   {//BEGIN CONSTRUCTOR BODY
   @SuppressWarnings("unused")
	TransitionHLAPI totest = new TransitionHLAPI(
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
	@Test(groups = { "hlapi", "TransitionHLAPI"}, dependsOnMethods={"TransitionHLAPI_LLAPI"})
	public void TransitionHLAPI_2_containerPage() throws InvalidIDException ,VoidRepositoryException   {//BEGIN CONSTRUCTOR BODY

	TransitionHLAPI totest = new TransitionHLAPI(
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
    * This constructor give access to required stuff only (not container if any)
    */
   @Test(groups = { "hlapi", "TransitionHLAPI"}, dependsOnMethods={"TransitionHLAPI_LLAPI"})
	public void TransitionHLAPI_3() throws InvalidIDException ,VoidRepositoryException   {//BEGIN CONSTRUCTOR BODY

	TransitionHLAPI totest = new TransitionHLAPI(
		itemid
	);

	
	
			assert totest.getId().equals(itemid);
		
	
	}

	/**
    * This constructor give access to required stuff only (and container)
    */
   @Test(groups = { "hlapi", "TransitionHLAPI"}, dependsOnMethods={"TransitionHLAPI_LLAPI"})
	public void TransitionHLAPI_4_containerPage() throws InvalidIDException ,VoidRepositoryException   {//BEGIN CONSTRUCTOR BODY

	TransitionHLAPI totest = new TransitionHLAPI(
		itemid
	,	
	  itemcontainerPage
	);

	
	
			assert totest.getId().equals(itemid);
		
	
	assert totest.getContainerPage().equals(itemcontainerPage.getContainedItem());
	}


	/**
	 * This constructor encapsulate a low level API object in HLAPI.
	 */
	@Test(groups = { "hlapi", "TransitionHLAPI"})
	public void TransitionHLAPI_LLAPI(){
	   Transition llapi = new PtnetFactoryImpl().createTransition();
	   fr.lip6.move.pnml.ptnet.hlapi.TransitionHLAPI hlapi = new TransitionHLAPI(llapi);
		assert hlapi.getContainedItem().equals(llapi);
	}

	//getters giving HLAPI object
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "TransitionHLAPI"})
		public void getNameHLAPITest(){
			TransitionHLAPI elem = new TransitionHLAPI(new PtnetFactoryImpl().createTransition());

			
				elem.setNameHLAPI(itemname);
				NameHLAPI totest = elem.getNameHLAPI();
				assert totest.getContainedItem().equals(elem.getName());
			
		}
	
	

	
		/**
		 * This test add a random number of desired objet in the list or of one of each existing subtypes.
		 * then test how many objet are retuned and if any exist inthe original list.
		 */
		@Test(groups = { "hlapi", "TransitionHLAPI"})
		public void getToolspecificsHLAPITest(){
			Transition llapi = new PtnetFactoryImpl().createTransition();
			int howmany;
			
			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getToolspecifics().add(new PtnetFactoryImpl().createToolInfo());
			

			TransitionHLAPI elem = new TransitionHLAPI(llapi);
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
		@Test(groups = { "hlapi", "TransitionHLAPI"})
		public void getContainerPageHLAPITest(){
			TransitionHLAPI elem = new TransitionHLAPI(new PtnetFactoryImpl().createTransition());

			
				elem.setContainerPageHLAPI(itemcontainerPage);
				PageHLAPI totest = elem.getContainerPageHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerPage());
			
		}
	
	

	
		/**
		 * This test add a random number of desired objet in the list or of one of each existing subtypes.
		 * then test how many objet are retuned and if any exist inthe original list.
		 */
		@Test(groups = { "hlapi", "TransitionHLAPI"})
		public void getInArcsHLAPITest(){
			Transition llapi = new PtnetFactoryImpl().createTransition();
			int howmany;
			
			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getInArcs().add(new PtnetFactoryImpl().createArc());
			

			TransitionHLAPI elem = new TransitionHLAPI(llapi);
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
		@Test(groups = { "hlapi", "TransitionHLAPI"})
		public void getOutArcsHLAPITest(){
			Transition llapi = new PtnetFactoryImpl().createTransition();
			int howmany;
			
			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getOutArcs().add(new PtnetFactoryImpl().createArc());
			

			TransitionHLAPI elem = new TransitionHLAPI(llapi);
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
		@Test(groups = { "hlapi", "TransitionHLAPI"})
		public void getNodegraphicsHLAPITest(){
			TransitionHLAPI elem = new TransitionHLAPI(new PtnetFactoryImpl().createTransition());

			
				elem.setNodegraphicsHLAPI(itemnodegraphics);
				NodeGraphicsHLAPI totest = elem.getNodegraphicsHLAPI();
				assert totest.getContainedItem().equals(elem.getNodegraphics());
			
		}
	
	

	
		/**
		 * This test add a random number of desired objet in the list or of one of each existing subtypes.
		 * then test how many objet are retuned and if any exist inthe original list.
		 */
		@Test(groups = { "hlapi", "TransitionHLAPI"})
		public void getReferencingTransitionsHLAPITest(){
			Transition llapi = new PtnetFactoryImpl().createTransition();
			int howmany;
			
			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getReferencingTransitions().add(new PtnetFactoryImpl().createRefTransition());
			

			TransitionHLAPI elem = new TransitionHLAPI(llapi);
			List<RefTransitionHLAPI> totest = elem.getReferencingTransitionsHLAPI();

			assert totest.size() == howmany;

			for (RefTransitionHLAPI unit : totest) {
             assert llapi.getReferencingTransitions().contains(unit.getContainedItem()) : "missing element";
         }
		}
	

	//Special getter for list of generics object, return only one object type.
	
	
	
	
	
	
	
	

	//setters/remover for lists.
	
	@Test(groups = { "hlapi", "TransitionHLAPI"})
	public void addToolspecificsHLAPITest(){
		TransitionHLAPI elem = new TransitionHLAPI(new PtnetFactoryImpl().createTransition());
		int howmany = (int)(Math.random()*10);
		for(int i =0; i<howmany;i++)
			
			elem.addToolspecificsHLAPI(new ToolInfoHLAPI(new PtnetFactoryImpl().createToolInfo()));
			

		assert elem.getContainedItem().getToolspecifics().size() == howmany;
	}

	@Test(groups = { "hlapi", "TransitionHLAPI"})
	public void removeToolspecificsTest(){
		TransitionHLAPI elem = new TransitionHLAPI(new PtnetFactoryImpl().createTransition());
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
	

	@Test(groups = { "hlapi", "TransitionHLAPI"})
	public void equalsTest(){
		Transition a = new PtnetFactoryImpl().createTransition();
		Transition b = new PtnetFactoryImpl().createTransition();
		TransitionHLAPI aprime = new TransitionHLAPI(a);
		TransitionHLAPI asecond = new TransitionHLAPI(a);
		TransitionHLAPI bprime = new TransitionHLAPI(b);

		assert aprime.equals(asecond);
		assert !aprime.equals(bprime);
	}

	//cloning method
	//public TransitionHLAPI clone(){
	//	return new TransitionHLAPI(this);
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
