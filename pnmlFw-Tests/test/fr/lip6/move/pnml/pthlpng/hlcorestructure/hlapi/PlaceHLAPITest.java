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
 * $Id ggiffo, Thu Feb 11 16:30:27 CET 2016$
 */
package fr.lip6.move.pnml.pthlpng.hlcorestructure.hlapi;

import java.util.List;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import fr.lip6.move.pnml.framework.utils.ModelRepository;
import fr.lip6.move.pnml.framework.utils.exception.InvalidIDException;
import fr.lip6.move.pnml.framework.utils.exception.VoidRepositoryException;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.Place;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.impl.HlcorestructureFactoryImpl;
public class PlaceHLAPITest {

	
	private String itemid;
		
	private NameHLAPI itemname;
		
	private NodeGraphicsHLAPI itemnodegraphics;
		
	private TypeHLAPI itemtype;
		
	private HLMarkingHLAPI itemhlinitialMarking;
		
	
	private PageHLAPI itemcontainerPage;
	


	@AfterTest(groups = { "PlaceHLAPI", "hlapi" })
	public void After() {
	    System.out.println("done for "+"PlaceHLAPI(hlcorestructure)");
	}


	@BeforeMethod(groups = { "PlaceHLAPI", "hlapi" })
	public void setup() throws Exception{
	//ModelRepository.reset(); ModelRepository.getInstance().createDocumentWorkspace("void");
	ModelRepository mr = ModelRepository.getInstance();
	mr.createDocumentWorkspace("void");
	
			itemid = "unid";
			
			
			//HlcorestructureFactoryImpl
			itemname = new NameHLAPI(new HlcorestructureFactoryImpl().createName());
			
		
			
			//HlcorestructureFactoryImpl
			itemnodegraphics = new NodeGraphicsHLAPI(new HlcorestructureFactoryImpl().createNodeGraphics());
			
		
			
			//HlcorestructureFactoryImpl
			itemtype = new TypeHLAPI(new HlcorestructureFactoryImpl().createType());
			
		
			
			//HlcorestructureFactoryImpl
			itemhlinitialMarking = new HLMarkingHLAPI(new HlcorestructureFactoryImpl().createHLMarking());
			
		

	
		
		itemcontainerPage = new PageHLAPI(new HlcorestructureFactoryImpl().createPage());
		
	
	}

	/**
	 * this constructor allows you to set all 'settable' values
	 * excepted container.
	 */
	@Test(groups = { "hlapi", "PlaceHLAPI"}, dependsOnMethods={"PlaceHLAPI_LLAPI"})
	public void PlaceHLAPI_1() throws InvalidIDException ,VoidRepositoryException   {//BEGIN CONSTRUCTOR BODY
   @SuppressWarnings("unused")
	PlaceHLAPI totest = new PlaceHLAPI(
		itemid
		,	
		itemname
		,	
		itemnodegraphics
		,	
		itemtype
		,	
		itemhlinitialMarking
	);
	
	
	assert totest.getId().equals(itemid);
	
	
	
	
	assert totest.getName().equals(itemname.getContainedItem());
	
	
	
	
	assert totest.getNodegraphics().equals(itemnodegraphics.getContainedItem());
	
	
	
	
	assert totest.getType().equals(itemtype.getContainedItem());
	
	
	
	
	assert totest.getHlinitialMarking().equals(itemhlinitialMarking.getContainedItem());
	
	
	}

	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "PlaceHLAPI"}, dependsOnMethods={"PlaceHLAPI_LLAPI"})
	public void PlaceHLAPI_2_containerPage() throws InvalidIDException ,VoidRepositoryException   {//BEGIN CONSTRUCTOR BODY

	PlaceHLAPI totest = new PlaceHLAPI(
		itemid
		,	
		itemname
		,	
		itemnodegraphics
		,	
		itemtype
		,	
		itemhlinitialMarking
	,	
		itemcontainerPage
	);
	
	
			assert totest.getId().equals(itemid);
		
	
	
		
			assert totest.getName().equals(itemname.getContainedItem());
		
	
	
		
			assert totest.getNodegraphics().equals(itemnodegraphics.getContainedItem());
		
	
	
		
			assert totest.getType().equals(itemtype.getContainedItem());
		
	
	
		
			assert totest.getHlinitialMarking().equals(itemhlinitialMarking.getContainedItem());
		
	
	assert totest.getContainerPage().equals(itemcontainerPage.getContainedItem());
	}

	/**
    * This constructor give access to required stuff only (not container if any)
    */
   @Test(groups = { "hlapi", "PlaceHLAPI"}, dependsOnMethods={"PlaceHLAPI_LLAPI"})
	public void PlaceHLAPI_3() throws InvalidIDException ,VoidRepositoryException   {//BEGIN CONSTRUCTOR BODY

	PlaceHLAPI totest = new PlaceHLAPI(
		itemid
	);

	
	
			assert totest.getId().equals(itemid);
		
	
	}

	/**
    * This constructor give access to required stuff only (and container)
    */
   @Test(groups = { "hlapi", "PlaceHLAPI"}, dependsOnMethods={"PlaceHLAPI_LLAPI"})
	public void PlaceHLAPI_4_containerPage() throws InvalidIDException ,VoidRepositoryException   {//BEGIN CONSTRUCTOR BODY

	PlaceHLAPI totest = new PlaceHLAPI(
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
	@Test(groups = { "hlapi", "PlaceHLAPI"})
	public void PlaceHLAPI_LLAPI(){
	   Place llapi = new HlcorestructureFactoryImpl().createPlace();
	   fr.lip6.move.pnml.pthlpng.hlcorestructure.hlapi.PlaceHLAPI hlapi = new PlaceHLAPI(llapi);
		assert hlapi.getContainedItem().equals(llapi);
	}

	//getters giving HLAPI object
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "PlaceHLAPI"})
		public void getNameHLAPITest(){
			PlaceHLAPI elem = new PlaceHLAPI(new HlcorestructureFactoryImpl().createPlace());

			
				elem.setNameHLAPI(itemname);
				NameHLAPI totest = elem.getNameHLAPI();
				assert totest.getContainedItem().equals(elem.getName());
			
		}
	
	

	
		/**
		 * This test add a random number of desired objet in the list or of one of each existing subtypes.
		 * then test how many objet are retuned and if any exist inthe original list.
		 */
		@Test(groups = { "hlapi", "PlaceHLAPI"})
		public void getToolspecificsHLAPITest(){
			Place llapi = new HlcorestructureFactoryImpl().createPlace();
			int howmany;
			
			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getToolspecifics().add(new HlcorestructureFactoryImpl().createToolInfo());
			

			PlaceHLAPI elem = new PlaceHLAPI(llapi);
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
		@Test(groups = { "hlapi", "PlaceHLAPI"})
		public void getContainerPageHLAPITest(){
			PlaceHLAPI elem = new PlaceHLAPI(new HlcorestructureFactoryImpl().createPlace());

			
				elem.setContainerPageHLAPI(itemcontainerPage);
				PageHLAPI totest = elem.getContainerPageHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerPage());
			
		}
	
	

	
		/**
		 * This test add a random number of desired objet in the list or of one of each existing subtypes.
		 * then test how many objet are retuned and if any exist inthe original list.
		 */
		@Test(groups = { "hlapi", "PlaceHLAPI"})
		public void getInArcsHLAPITest(){
			Place llapi = new HlcorestructureFactoryImpl().createPlace();
			int howmany;
			
			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getInArcs().add(new HlcorestructureFactoryImpl().createArc());
			

			PlaceHLAPI elem = new PlaceHLAPI(llapi);
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
		@Test(groups = { "hlapi", "PlaceHLAPI"})
		public void getOutArcsHLAPITest(){
			Place llapi = new HlcorestructureFactoryImpl().createPlace();
			int howmany;
			
			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getOutArcs().add(new HlcorestructureFactoryImpl().createArc());
			

			PlaceHLAPI elem = new PlaceHLAPI(llapi);
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
		@Test(groups = { "hlapi", "PlaceHLAPI"})
		public void getNodegraphicsHLAPITest(){
			PlaceHLAPI elem = new PlaceHLAPI(new HlcorestructureFactoryImpl().createPlace());

			
				elem.setNodegraphicsHLAPI(itemnodegraphics);
				NodeGraphicsHLAPI totest = elem.getNodegraphicsHLAPI();
				assert totest.getContainedItem().equals(elem.getNodegraphics());
			
		}
	
	

	
		/**
		 * This test add a random number of desired objet in the list or of one of each existing subtypes.
		 * then test how many objet are retuned and if any exist inthe original list.
		 */
		@Test(groups = { "hlapi", "PlaceHLAPI"})
		public void getReferencingPlacesHLAPITest(){
			Place llapi = new HlcorestructureFactoryImpl().createPlace();
			int howmany;
			
			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getReferencingPlaces().add(new HlcorestructureFactoryImpl().createRefPlace());
			

			PlaceHLAPI elem = new PlaceHLAPI(llapi);
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
		@Test(groups = { "hlapi", "PlaceHLAPI"})
		public void getTypeHLAPITest(){
			PlaceHLAPI elem = new PlaceHLAPI(new HlcorestructureFactoryImpl().createPlace());

			
				elem.setTypeHLAPI(itemtype);
				TypeHLAPI totest = elem.getTypeHLAPI();
				assert totest.getContainedItem().equals(elem.getType());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "PlaceHLAPI"})
		public void getHlinitialMarkingHLAPITest(){
			PlaceHLAPI elem = new PlaceHLAPI(new HlcorestructureFactoryImpl().createPlace());

			
				elem.setHlinitialMarkingHLAPI(itemhlinitialMarking);
				HLMarkingHLAPI totest = elem.getHlinitialMarkingHLAPI();
				assert totest.getContainedItem().equals(elem.getHlinitialMarking());
			
		}
	

	//Special getter for list of generics object, return only one object type.
	
	
	
	
	
	
	
	
	
	

	//setters/remover for lists.
	
	@Test(groups = { "hlapi", "PlaceHLAPI"})
	public void addToolspecificsHLAPITest(){
		PlaceHLAPI elem = new PlaceHLAPI(new HlcorestructureFactoryImpl().createPlace());
		int howmany = (int)(Math.random()*10);
		for(int i =0; i<howmany;i++)
			
			elem.addToolspecificsHLAPI(new ToolInfoHLAPI(new HlcorestructureFactoryImpl().createToolInfo()));
			

		assert elem.getContainedItem().getToolspecifics().size() == howmany;
	}

	@Test(groups = { "hlapi", "PlaceHLAPI"})
	public void removeToolspecificsTest(){
		PlaceHLAPI elem = new PlaceHLAPI(new HlcorestructureFactoryImpl().createPlace());
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
	

	@Test(groups = { "hlapi", "PlaceHLAPI"})
	public void equalsTest(){
		Place a = new HlcorestructureFactoryImpl().createPlace();
		Place b = new HlcorestructureFactoryImpl().createPlace();
		PlaceHLAPI aprime = new PlaceHLAPI(a);
		PlaceHLAPI asecond = new PlaceHLAPI(a);
		PlaceHLAPI bprime = new PlaceHLAPI(b);

		assert aprime.equals(asecond);
		assert !aprime.equals(bprime);
	}

	//cloning method
	//public PlaceHLAPI clone(){
	//	return new PlaceHLAPI(this);
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
