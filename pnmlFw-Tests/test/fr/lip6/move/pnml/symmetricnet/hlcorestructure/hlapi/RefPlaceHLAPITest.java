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
 * $Id ggiffo, Tue Dec 23 11:30:47 CET 2014$
 */
package fr.lip6.move.pnml.symmetricnet.hlcorestructure.hlapi;

import java.util.List;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import fr.lip6.move.pnml.framework.utils.ModelRepository;
import fr.lip6.move.pnml.framework.utils.exception.InvalidIDException;
import fr.lip6.move.pnml.framework.utils.exception.VoidRepositoryException;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.RefPlace;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.impl.HlcorestructureFactoryImpl;
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
	
			itemid = new String("unid");
			
			
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
