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
import fr.lip6.move.pnml.pnmlcoremodel.PetriNet;
import fr.lip6.move.pnml.pnmlcoremodel.impl.PnmlcoremodelFactoryImpl;
public class PetriNetHLAPITest {

	
	private String itemid;
		
	private PNTypeHLAPI itemtype;
		
	private NameHLAPI itemname;
		
	
	private PetriNetDocHLAPI itemcontainerPetriNetDoc;
	


	@AfterTest(groups = { "PetriNetHLAPI", "hlapi" })
	public void After() {
	    System.out.println("done for "+"PetriNetHLAPI(pnmlcoremodel)");
	}


	@BeforeMethod(groups = { "PetriNetHLAPI", "hlapi" })
	public void setup() throws Exception{
	//ModelRepository.reset(); ModelRepository.getInstance().createDocumentWorkspace("void");
	ModelRepository mr = ModelRepository.getInstance();
	mr.createDocumentWorkspace("void");
	
			itemid = "unid";
			
		itemtype = PNTypeHLAPI.get(0);
		
			
			//PnmlcoremodelFactoryImpl
			itemname = new NameHLAPI(new PnmlcoremodelFactoryImpl().createName());
			
		

	
		
		itemcontainerPetriNetDoc = new PetriNetDocHLAPI(new PnmlcoremodelFactoryImpl().createPetriNetDoc());
		
	
	}

	/**
	 * this constructor allows you to set all 'settable' values
	 * excepted container.
	 */
	@Test(groups = { "hlapi", "PetriNetHLAPI"}, dependsOnMethods={"PetriNetHLAPI_LLAPI"})
	public void PetriNetHLAPI_1() throws InvalidIDException ,VoidRepositoryException   {//BEGIN CONSTRUCTOR BODY
   @SuppressWarnings("unused")
	PetriNetHLAPI totest = new PetriNetHLAPI(
		itemid
		,	
		itemtype
		,	
		itemname
	);
	
	
	assert totest.getId().equals(itemid);
	
	
	
	
	
	
	assert totest.getName().equals(itemname.getContainedItem());
	
	
	}

	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "PetriNetHLAPI"}, dependsOnMethods={"PetriNetHLAPI_LLAPI"})
	public void PetriNetHLAPI_2_containerPetriNetDoc() throws InvalidIDException ,VoidRepositoryException   {//BEGIN CONSTRUCTOR BODY

	PetriNetHLAPI totest = new PetriNetHLAPI(
		itemid
		,	
		itemtype
		,	
		itemname
	,	
		itemcontainerPetriNetDoc
	);
	
	
			assert totest.getId().equals(itemid);
		
	
	
		
	
		
			assert totest.getName().equals(itemname.getContainedItem());
		
	
	assert totest.getContainerPetriNetDoc().equals(itemcontainerPetriNetDoc.getContainedItem());
	}

	/**
    * This constructor give access to required stuff only (not container if any)
    */
   @Test(groups = { "hlapi", "PetriNetHLAPI"}, dependsOnMethods={"PetriNetHLAPI_LLAPI"})
	public void PetriNetHLAPI_3() throws InvalidIDException ,VoidRepositoryException   {//BEGIN CONSTRUCTOR BODY

	PetriNetHLAPI totest = new PetriNetHLAPI(
		itemid
		,	
		itemtype
	);

	
	
			assert totest.getId().equals(itemid);
		
	
	
		
	}

	/**
    * This constructor give access to required stuff only (and container)
    */
   @Test(groups = { "hlapi", "PetriNetHLAPI"}, dependsOnMethods={"PetriNetHLAPI_LLAPI"})
	public void PetriNetHLAPI_4_containerPetriNetDoc() throws InvalidIDException ,VoidRepositoryException   {//BEGIN CONSTRUCTOR BODY

	PetriNetHLAPI totest = new PetriNetHLAPI(
		itemid
		,	
		itemtype
	,	
	  itemcontainerPetriNetDoc
	);

	
	
			assert totest.getId().equals(itemid);
		
	
	
		
	assert totest.getContainerPetriNetDoc().equals(itemcontainerPetriNetDoc.getContainedItem());
	}


	/**
	 * This constructor encapsulate a low level API object in HLAPI.
	 */
	@Test(groups = { "hlapi", "PetriNetHLAPI"})
	public void PetriNetHLAPI_LLAPI(){
	   PetriNet llapi = new PnmlcoremodelFactoryImpl().createPetriNet();
	   fr.lip6.move.pnml.pnmlcoremodel.hlapi.PetriNetHLAPI hlapi = new PetriNetHLAPI(llapi);
		assert hlapi.getContainedItem().equals(llapi);
	}

	//getters giving HLAPI object
	
	
	

	
		/**
		 * This test add a random number of desired objet in the list or of one of each existing subtypes.
		 * then test how many objet are retuned and if any exist inthe original list.
		 */
		@Test(groups = { "hlapi", "PetriNetHLAPI"})
		public void getPagesHLAPITest(){
			PetriNet llapi = new PnmlcoremodelFactoryImpl().createPetriNet();
			int howmany;
			
			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getPages().add(new PnmlcoremodelFactoryImpl().createPage());
			

			PetriNetHLAPI elem = new PetriNetHLAPI(llapi);
			List<PageHLAPI> totest = elem.getPagesHLAPI();

			assert totest.size() == howmany;

			for (PageHLAPI unit : totest) {
             assert llapi.getPages().contains(unit.getContainedItem()) : "missing element";
         }
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "PetriNetHLAPI"})
		public void getNameHLAPITest(){
			PetriNetHLAPI elem = new PetriNetHLAPI(new PnmlcoremodelFactoryImpl().createPetriNet());

			
				elem.setNameHLAPI(itemname);
				NameHLAPI totest = elem.getNameHLAPI();
				assert totest.getContainedItem().equals(elem.getName());
			
		}
	
	

	
		/**
		 * This test add a random number of desired objet in the list or of one of each existing subtypes.
		 * then test how many objet are retuned and if any exist inthe original list.
		 */
		@Test(groups = { "hlapi", "PetriNetHLAPI"})
		public void getToolspecificsHLAPITest(){
			PetriNet llapi = new PnmlcoremodelFactoryImpl().createPetriNet();
			int howmany;
			
			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getToolspecifics().add(new PnmlcoremodelFactoryImpl().createToolInfo());
			

			PetriNetHLAPI elem = new PetriNetHLAPI(llapi);
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
		@Test(groups = { "hlapi", "PetriNetHLAPI"})
		public void getContainerPetriNetDocHLAPITest(){
			PetriNetHLAPI elem = new PetriNetHLAPI(new PnmlcoremodelFactoryImpl().createPetriNet());

			
				elem.setContainerPetriNetDocHLAPI(itemcontainerPetriNetDoc);
				PetriNetDocHLAPI totest = elem.getContainerPetriNetDocHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerPetriNetDoc());
			
		}
	

	//Special getter for list of generics object, return only one object type.
	
	
	
	
	

	//setters/remover for lists.
	
	@Test(groups = { "hlapi", "PetriNetHLAPI"})
	public void addPagesHLAPITest(){
		PetriNetHLAPI elem = new PetriNetHLAPI(new PnmlcoremodelFactoryImpl().createPetriNet());
		int howmany = (int)(Math.random()*10);
		for(int i =0; i<howmany;i++)
			
			elem.addPagesHLAPI(new PageHLAPI(new PnmlcoremodelFactoryImpl().createPage()));
			

		assert elem.getContainedItem().getPages().size() == howmany;
	}

	@Test(groups = { "hlapi", "PetriNetHLAPI"})
	public void removePagesTest(){
		PetriNetHLAPI elem = new PetriNetHLAPI(new PnmlcoremodelFactoryImpl().createPetriNet());
		int howmany = (int)(Math.random()*10);
		int howdiff = (int)(Math.random()*10);

			
			PageHLAPI sav;

		for(int i =0; i<(howmany);i++)
			
			elem.addPagesHLAPI(new PageHLAPI(new PnmlcoremodelFactoryImpl().createPage()));
			


		
		sav = new PageHLAPI(new PnmlcoremodelFactoryImpl().createPage());
		

		elem.addPagesHLAPI(sav);
		assert elem.getContainedItem().getPages().size() == howmany+1;

		for(int i =0; i<(howdiff);i++)
			
			elem.addPagesHLAPI(new PageHLAPI(new PnmlcoremodelFactoryImpl().createPage()));
			


		elem.removePagesHLAPI(sav);

		assert elem.getContainedItem().getPages().size() == howmany+howdiff;
	}
	
	@Test(groups = { "hlapi", "PetriNetHLAPI"})
	public void addToolspecificsHLAPITest(){
		PetriNetHLAPI elem = new PetriNetHLAPI(new PnmlcoremodelFactoryImpl().createPetriNet());
		int howmany = (int)(Math.random()*10);
		for(int i =0; i<howmany;i++)
			
			elem.addToolspecificsHLAPI(new ToolInfoHLAPI(new PnmlcoremodelFactoryImpl().createToolInfo()));
			

		assert elem.getContainedItem().getToolspecifics().size() == howmany;
	}

	@Test(groups = { "hlapi", "PetriNetHLAPI"})
	public void removeToolspecificsTest(){
		PetriNetHLAPI elem = new PetriNetHLAPI(new PnmlcoremodelFactoryImpl().createPetriNet());
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
	

	@Test(groups = { "hlapi", "PetriNetHLAPI"})
	public void equalsTest(){
		PetriNet a = new PnmlcoremodelFactoryImpl().createPetriNet();
		PetriNet b = new PnmlcoremodelFactoryImpl().createPetriNet();
		PetriNetHLAPI aprime = new PetriNetHLAPI(a);
		PetriNetHLAPI asecond = new PetriNetHLAPI(a);
		PetriNetHLAPI bprime = new PetriNetHLAPI(b);

		assert aprime.equals(asecond);
		assert !aprime.equals(bprime);
	}

	//cloning method
	//public PetriNetHLAPI clone(){
	//	return new PetriNetHLAPI(this);
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
