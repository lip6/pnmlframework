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
 * $Id ggiffo, Tue Dec 23 11:30:46 CET 2014$
 */
package fr.lip6.move.pnml.pnmlcoremodel.hlapi;

import java.util.List;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import fr.lip6.move.pnml.framework.utils.ModelRepository;
import fr.lip6.move.pnml.framework.utils.exception.InvalidIDException;
import fr.lip6.move.pnml.framework.utils.exception.VoidRepositoryException;
import fr.lip6.move.pnml.pnmlcoremodel.Arc;
import fr.lip6.move.pnml.pnmlcoremodel.impl.PnmlcoremodelFactoryImpl;
public class ArcHLAPITest {

	
	private String itemid;
		
	private NameHLAPI itemname;
		
	private NodeHLAPI itemsource;
		
	private NodeHLAPI itemtarget;
		
	private ArcGraphicsHLAPI itemarcgraphics;
		
	
	private PageHLAPI itemcontainerPage;
	


	@AfterTest(groups = { "ArcHLAPI", "hlapi" })
	public void After() {
	    System.out.println("done for "+"ArcHLAPI(pnmlcoremodel)");
	}


	@BeforeMethod(groups = { "ArcHLAPI", "hlapi" })
	public void setup() throws Exception{
	//ModelRepository.reset(); ModelRepository.getInstance().createDocumentWorkspace("void");
	ModelRepository mr = ModelRepository.getInstance();
	mr.createDocumentWorkspace("void");
	
			itemid = new String("unid");
			
			
			//PnmlcoremodelFactoryImpl
			itemname = new NameHLAPI(new PnmlcoremodelFactoryImpl().createName());
			
		
			
				
			itemsource = new fr.lip6.move.pnml.pnmlcoremodel.hlapi.PlaceHLAPI(
				new PnmlcoremodelFactoryImpl().createPlace()
			);
				
			
		
			
				
			itemtarget = new fr.lip6.move.pnml.pnmlcoremodel.hlapi.PlaceHLAPI(
				new PnmlcoremodelFactoryImpl().createPlace()
			);
				
			
		
			
			//PnmlcoremodelFactoryImpl
			itemarcgraphics = new ArcGraphicsHLAPI(new PnmlcoremodelFactoryImpl().createArcGraphics());
			
		

	
		
		itemcontainerPage = new PageHLAPI(new PnmlcoremodelFactoryImpl().createPage());
		
	
	}

	/**
	 * this constructor allows you to set all 'settable' values
	 * excepted container.
	 */
	@Test(groups = { "hlapi", "ArcHLAPI"}, dependsOnMethods={"ArcHLAPI_LLAPI"})
	public void ArcHLAPI_1() throws InvalidIDException ,VoidRepositoryException   {//BEGIN CONSTRUCTOR BODY
   @SuppressWarnings("unused")
	ArcHLAPI totest = new ArcHLAPI(
		itemid
		,	
		itemname
		,	
		itemsource
		,	
		itemtarget
		,	
		itemarcgraphics
	);
	
	
	assert totest.getId().equals(itemid);
	
	
	
	
	assert totest.getName().equals(itemname.getContainedItem());
	
	
	
	
	assert totest.getSource().equals(itemsource.getContainedItem());
	
	
	
	
	assert totest.getTarget().equals(itemtarget.getContainedItem());
	
	
	
	
	assert totest.getArcgraphics().equals(itemarcgraphics.getContainedItem());
	
	
	}

	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "ArcHLAPI"}, dependsOnMethods={"ArcHLAPI_LLAPI"})
	public void ArcHLAPI_2_containerPage() throws InvalidIDException ,VoidRepositoryException   {//BEGIN CONSTRUCTOR BODY

	ArcHLAPI totest = new ArcHLAPI(
		itemid
		,	
		itemname
		,	
		itemsource
		,	
		itemtarget
		,	
		itemarcgraphics
	,	
		itemcontainerPage
	);
	
	
			assert totest.getId().equals(itemid);
		
	
	
		
			assert totest.getName().equals(itemname.getContainedItem());
		
	
	
		
			assert totest.getSource().equals(itemsource.getContainedItem());
		
	
	
		
			assert totest.getTarget().equals(itemtarget.getContainedItem());
		
	
	
		
			assert totest.getArcgraphics().equals(itemarcgraphics.getContainedItem());
		
	
	assert totest.getContainerPage().equals(itemcontainerPage.getContainedItem());
	}

	/**
    * This constructor give access to required stuff only (not container if any)
    */
   @Test(groups = { "hlapi", "ArcHLAPI"}, dependsOnMethods={"ArcHLAPI_LLAPI"})
	public void ArcHLAPI_3() throws InvalidIDException ,VoidRepositoryException   {//BEGIN CONSTRUCTOR BODY

	ArcHLAPI totest = new ArcHLAPI(
		itemid
		,	
		itemsource
		,	
		itemtarget
	);

	
	
			assert totest.getId().equals(itemid);
		
	
	
		
			assert totest.getSource().equals(itemsource.getContainedItem());
		
	
	
		
			assert totest.getTarget().equals(itemtarget.getContainedItem());
		
	
	}

	/**
    * This constructor give access to required stuff only (and container)
    */
   @Test(groups = { "hlapi", "ArcHLAPI"}, dependsOnMethods={"ArcHLAPI_LLAPI"})
	public void ArcHLAPI_4_containerPage() throws InvalidIDException ,VoidRepositoryException   {//BEGIN CONSTRUCTOR BODY

	ArcHLAPI totest = new ArcHLAPI(
		itemid
		,	
		itemsource
		,	
		itemtarget
	,	
	  itemcontainerPage
	);

	
	
			assert totest.getId().equals(itemid);
		
	
	
		
			assert totest.getSource().equals(itemsource.getContainedItem());
		
	
	
		
			assert totest.getTarget().equals(itemtarget.getContainedItem());
		
	
	assert totest.getContainerPage().equals(itemcontainerPage.getContainedItem());
	}


	/**
	 * This constructor encapsulate a low level API object in HLAPI.
	 */
	@Test(groups = { "hlapi", "ArcHLAPI"})
	public void ArcHLAPI_LLAPI(){
	   Arc llapi = new PnmlcoremodelFactoryImpl().createArc();
	   fr.lip6.move.pnml.pnmlcoremodel.hlapi.ArcHLAPI hlapi = new ArcHLAPI(llapi);
		assert hlapi.getContainedItem().equals(llapi);
	}

	//getters giving HLAPI object
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "ArcHLAPI"})
		public void getNameHLAPITest(){
			ArcHLAPI elem = new ArcHLAPI(new PnmlcoremodelFactoryImpl().createArc());

			
				elem.setNameHLAPI(itemname);
				NameHLAPI totest = elem.getNameHLAPI();
				assert totest.getContainedItem().equals(elem.getName());
			
		}
	
	

	
		/**
		 * This test add a random number of desired objet in the list or of one of each existing subtypes.
		 * then test how many objet are retuned and if any exist inthe original list.
		 */
		@Test(groups = { "hlapi", "ArcHLAPI"})
		public void getToolspecificsHLAPITest(){
			Arc llapi = new PnmlcoremodelFactoryImpl().createArc();
			int howmany;
			
			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getToolspecifics().add(new PnmlcoremodelFactoryImpl().createToolInfo());
			

			ArcHLAPI elem = new ArcHLAPI(llapi);
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
		@Test(groups = { "hlapi", "ArcHLAPI"})
		public void getContainerPageHLAPITest(){
			ArcHLAPI elem = new ArcHLAPI(new PnmlcoremodelFactoryImpl().createArc());

			
				elem.setContainerPageHLAPI(itemcontainerPage);
				PageHLAPI totest = elem.getContainerPageHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerPage());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "ArcHLAPI"})
		public void getSourceHLAPITest(){
			ArcHLAPI elem = new ArcHLAPI(new PnmlcoremodelFactoryImpl().createArc());

			
				elem.setSourceHLAPI(new fr.lip6.move.pnml.pnmlcoremodel.hlapi.PlaceHLAPI(new PnmlcoremodelFactoryImpl().createPlace()));
				NodeHLAPI totest_pnmlcoremodel_Place = elem.getSourceHLAPI();
				assert totest_pnmlcoremodel_Place.getContainedItem().equals(elem.getSource());
			
				elem.setSourceHLAPI(new fr.lip6.move.pnml.pnmlcoremodel.hlapi.RefTransitionHLAPI(new PnmlcoremodelFactoryImpl().createRefTransition()));
				NodeHLAPI totest_pnmlcoremodel_RefTransition = elem.getSourceHLAPI();
				assert totest_pnmlcoremodel_RefTransition.getContainedItem().equals(elem.getSource());
			
				elem.setSourceHLAPI(new fr.lip6.move.pnml.pnmlcoremodel.hlapi.TransitionHLAPI(new PnmlcoremodelFactoryImpl().createTransition()));
				NodeHLAPI totest_pnmlcoremodel_Transition = elem.getSourceHLAPI();
				assert totest_pnmlcoremodel_Transition.getContainedItem().equals(elem.getSource());
			
				elem.setSourceHLAPI(new fr.lip6.move.pnml.pnmlcoremodel.hlapi.RefPlaceHLAPI(new PnmlcoremodelFactoryImpl().createRefPlace()));
				NodeHLAPI totest_pnmlcoremodel_RefPlace = elem.getSourceHLAPI();
				assert totest_pnmlcoremodel_RefPlace.getContainedItem().equals(elem.getSource());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "ArcHLAPI"})
		public void getTargetHLAPITest(){
			ArcHLAPI elem = new ArcHLAPI(new PnmlcoremodelFactoryImpl().createArc());

			
				elem.setTargetHLAPI(new fr.lip6.move.pnml.pnmlcoremodel.hlapi.PlaceHLAPI(new PnmlcoremodelFactoryImpl().createPlace()));
				NodeHLAPI totest_pnmlcoremodel_Place = elem.getTargetHLAPI();
				assert totest_pnmlcoremodel_Place.getContainedItem().equals(elem.getTarget());
			
				elem.setTargetHLAPI(new fr.lip6.move.pnml.pnmlcoremodel.hlapi.RefTransitionHLAPI(new PnmlcoremodelFactoryImpl().createRefTransition()));
				NodeHLAPI totest_pnmlcoremodel_RefTransition = elem.getTargetHLAPI();
				assert totest_pnmlcoremodel_RefTransition.getContainedItem().equals(elem.getTarget());
			
				elem.setTargetHLAPI(new fr.lip6.move.pnml.pnmlcoremodel.hlapi.TransitionHLAPI(new PnmlcoremodelFactoryImpl().createTransition()));
				NodeHLAPI totest_pnmlcoremodel_Transition = elem.getTargetHLAPI();
				assert totest_pnmlcoremodel_Transition.getContainedItem().equals(elem.getTarget());
			
				elem.setTargetHLAPI(new fr.lip6.move.pnml.pnmlcoremodel.hlapi.RefPlaceHLAPI(new PnmlcoremodelFactoryImpl().createRefPlace()));
				NodeHLAPI totest_pnmlcoremodel_RefPlace = elem.getTargetHLAPI();
				assert totest_pnmlcoremodel_RefPlace.getContainedItem().equals(elem.getTarget());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "ArcHLAPI"})
		public void getArcgraphicsHLAPITest(){
			ArcHLAPI elem = new ArcHLAPI(new PnmlcoremodelFactoryImpl().createArc());

			
				elem.setArcgraphicsHLAPI(itemarcgraphics);
				ArcGraphicsHLAPI totest = elem.getArcgraphicsHLAPI();
				assert totest.getContainedItem().equals(elem.getArcgraphics());
			
		}
	

	//Special getter for list of generics object, return only one object type.
	
	
	
	
	
	
	

	//setters/remover for lists.
	
	@Test(groups = { "hlapi", "ArcHLAPI"})
	public void addToolspecificsHLAPITest(){
		ArcHLAPI elem = new ArcHLAPI(new PnmlcoremodelFactoryImpl().createArc());
		int howmany = (int)(Math.random()*10);
		for(int i =0; i<howmany;i++)
			
			elem.addToolspecificsHLAPI(new ToolInfoHLAPI(new PnmlcoremodelFactoryImpl().createToolInfo()));
			

		assert elem.getContainedItem().getToolspecifics().size() == howmany;
	}

	@Test(groups = { "hlapi", "ArcHLAPI"})
	public void removeToolspecificsTest(){
		ArcHLAPI elem = new ArcHLAPI(new PnmlcoremodelFactoryImpl().createArc());
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
	

	@Test(groups = { "hlapi", "ArcHLAPI"})
	public void equalsTest(){
		Arc a = new PnmlcoremodelFactoryImpl().createArc();
		Arc b = new PnmlcoremodelFactoryImpl().createArc();
		ArcHLAPI aprime = new ArcHLAPI(a);
		ArcHLAPI asecond = new ArcHLAPI(a);
		ArcHLAPI bprime = new ArcHLAPI(b);

		assert aprime.equals(asecond);
		assert !aprime.equals(bprime);
	}

	//cloning method
	//public ArcHLAPI clone(){
	//	return new ArcHLAPI(this);
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
