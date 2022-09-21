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
import fr.lip6.move.pnml.ptnet.Name;
import fr.lip6.move.pnml.ptnet.impl.PtnetFactoryImpl;
public class NameHLAPITest {

	
	private AnnotationGraphicsHLAPI itemannotationgraphics;
		
	private String itemtext;
		
	
	private PetriNetHLAPI itemcontainerNamePetriNet;
	
	private PnObjectHLAPI itemcontainerNamePnObject;
	


	@AfterTest(groups = { "NameHLAPI", "hlapi" })
	public void After() {
	    System.out.println("done for "+"NameHLAPI(ptnet)");
	}


	@BeforeMethod(groups = { "NameHLAPI", "hlapi" })
	public void setup() throws Exception{
	//ModelRepository.reset(); ModelRepository.getInstance().createDocumentWorkspace("void");
	ModelRepository mr = ModelRepository.getInstance();
	mr.createDocumentWorkspace("void");
	
			
			//PtnetFactoryImpl
			itemannotationgraphics = new AnnotationGraphicsHLAPI(new PtnetFactoryImpl().createAnnotationGraphics());
			
		
			itemtext = "unid";
			

	
		
		itemcontainerNamePetriNet = new PetriNetHLAPI(new PtnetFactoryImpl().createPetriNet());
		
	
		
			
			
		itemcontainerNamePnObject = new fr.lip6.move.pnml.ptnet.hlapi.PageHLAPI(
		   new PtnetFactoryImpl().createPage()
		);
			
		
	
	}

	/**
	 * this constructor allows you to set all 'settable' values
	 * excepted container.
	 */
	@Test(groups = { "hlapi", "NameHLAPI"}, dependsOnMethods={"NameHLAPI_LLAPI"})
	public void NameHLAPI_1(){//BEGIN CONSTRUCTOR BODY
   @SuppressWarnings("unused")
	NameHLAPI totest = new NameHLAPI(
		itemannotationgraphics
		,	
		itemtext
	);
	
	
	
	assert totest.getAnnotationgraphics().equals(itemannotationgraphics.getContainedItem());
	
	
	
	assert totest.getText().equals(itemtext);
	
	
	}

	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "NameHLAPI"}, dependsOnMethods={"NameHLAPI_LLAPI"})
	public void NameHLAPI_2_containerNamePetriNet(){//BEGIN CONSTRUCTOR BODY

	NameHLAPI totest = new NameHLAPI(
		itemannotationgraphics
		,	
		itemtext
	,	
		itemcontainerNamePetriNet
	);
	
	
		
			assert totest.getAnnotationgraphics().equals(itemannotationgraphics.getContainedItem());
		
	
	
			assert totest.getText().equals(itemtext);
		
	
	assert totest.getContainerNamePetriNet().equals(itemcontainerNamePetriNet.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "NameHLAPI"}, dependsOnMethods={"NameHLAPI_LLAPI"})
	public void NameHLAPI_2_containerNamePnObject(){//BEGIN CONSTRUCTOR BODY

	NameHLAPI totest = new NameHLAPI(
		itemannotationgraphics
		,	
		itemtext
	,	
		itemcontainerNamePnObject
	);
	
	
		
			assert totest.getAnnotationgraphics().equals(itemannotationgraphics.getContainedItem());
		
	
	
			assert totest.getText().equals(itemtext);
		
	
	assert totest.getContainerNamePnObject().equals(itemcontainerNamePnObject.getContainedItem());
	}

	/**
    * This constructor give access to required stuff only (not container if any)
    */
   @Test(groups = { "hlapi", "NameHLAPI"}, dependsOnMethods={"NameHLAPI_LLAPI"})
	public void NameHLAPI_3(){//BEGIN CONSTRUCTOR BODY

	NameHLAPI totest = new NameHLAPI(
		itemtext
	);

	
	
			assert totest.getText().equals(itemtext);
		
	
	}

	/**
    * This constructor give access to required stuff only (and container)
    */
   @Test(groups = { "hlapi", "NameHLAPI"}, dependsOnMethods={"NameHLAPI_LLAPI"})
	public void NameHLAPI_4_containerNamePetriNet(){//BEGIN CONSTRUCTOR BODY

	NameHLAPI totest = new NameHLAPI(
		itemtext
	,	
	  itemcontainerNamePetriNet
	);

	
	
			assert totest.getText().equals(itemtext);
		
	
	assert totest.getContainerNamePetriNet().equals(itemcontainerNamePetriNet.getContainedItem());
	}
	/**
    * This constructor give access to required stuff only (and container)
    */
   @Test(groups = { "hlapi", "NameHLAPI"}, dependsOnMethods={"NameHLAPI_LLAPI"})
	public void NameHLAPI_4_containerNamePnObject(){//BEGIN CONSTRUCTOR BODY

	NameHLAPI totest = new NameHLAPI(
		itemtext
	,	
	  itemcontainerNamePnObject
	);

	
	
			assert totest.getText().equals(itemtext);
		
	
	assert totest.getContainerNamePnObject().equals(itemcontainerNamePnObject.getContainedItem());
	}


	/**
	 * This constructor encapsulate a low level API object in HLAPI.
	 */
	@Test(groups = { "hlapi", "NameHLAPI"})
	public void NameHLAPI_LLAPI(){
	   Name llapi = new PtnetFactoryImpl().createName();
	   fr.lip6.move.pnml.ptnet.hlapi.NameHLAPI hlapi = new NameHLAPI(llapi);
		assert hlapi.getContainedItem().equals(llapi);
	}

	//getters giving HLAPI object
	

	
		/**
		 * This test add a random number of desired objet in the list or of one of each existing subtypes.
		 * then test how many objet are retuned and if any exist inthe original list.
		 */
		@Test(groups = { "hlapi", "NameHLAPI"})
		public void getToolspecificsHLAPITest(){
			Name llapi = new PtnetFactoryImpl().createName();
			int howmany;
			
			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getToolspecifics().add(new PtnetFactoryImpl().createToolInfo());
			

			NameHLAPI elem = new NameHLAPI(llapi);
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
		@Test(groups = { "hlapi", "NameHLAPI"})
		public void getAnnotationgraphicsHLAPITest(){
			NameHLAPI elem = new NameHLAPI(new PtnetFactoryImpl().createName());

			
				elem.setAnnotationgraphicsHLAPI(itemannotationgraphics);
				AnnotationGraphicsHLAPI totest = elem.getAnnotationgraphicsHLAPI();
				assert totest.getContainedItem().equals(elem.getAnnotationgraphics());
			
		}
	
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "NameHLAPI"})
		public void getContainerNamePetriNetHLAPITest(){
			NameHLAPI elem = new NameHLAPI(new PtnetFactoryImpl().createName());

			
				elem.setContainerNamePetriNetHLAPI(itemcontainerNamePetriNet);
				PetriNetHLAPI totest = elem.getContainerNamePetriNetHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerNamePetriNet());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "NameHLAPI"})
		public void getContainerNamePnObjectHLAPITest(){
			NameHLAPI elem = new NameHLAPI(new PtnetFactoryImpl().createName());

			
				elem.setContainerNamePnObjectHLAPI(new fr.lip6.move.pnml.ptnet.hlapi.PageHLAPI(new PtnetFactoryImpl().createPage()));
				PnObjectHLAPI totest_ptnet_Page = elem.getContainerNamePnObjectHLAPI();
				assert totest_ptnet_Page.getContainedItem().equals(elem.getContainerNamePnObject());
			
				elem.setContainerNamePnObjectHLAPI(new fr.lip6.move.pnml.ptnet.hlapi.ArcHLAPI(new PtnetFactoryImpl().createArc()));
				PnObjectHLAPI totest_ptnet_Arc = elem.getContainerNamePnObjectHLAPI();
				assert totest_ptnet_Arc.getContainedItem().equals(elem.getContainerNamePnObject());
			
				elem.setContainerNamePnObjectHLAPI(new fr.lip6.move.pnml.ptnet.hlapi.PlaceHLAPI(new PtnetFactoryImpl().createPlace()));
				PnObjectHLAPI totest_ptnet_Place = elem.getContainerNamePnObjectHLAPI();
				assert totest_ptnet_Place.getContainedItem().equals(elem.getContainerNamePnObject());
			
				elem.setContainerNamePnObjectHLAPI(new fr.lip6.move.pnml.ptnet.hlapi.RefTransitionHLAPI(new PtnetFactoryImpl().createRefTransition()));
				PnObjectHLAPI totest_ptnet_RefTransition = elem.getContainerNamePnObjectHLAPI();
				assert totest_ptnet_RefTransition.getContainedItem().equals(elem.getContainerNamePnObject());
			
				elem.setContainerNamePnObjectHLAPI(new fr.lip6.move.pnml.ptnet.hlapi.TransitionHLAPI(new PtnetFactoryImpl().createTransition()));
				PnObjectHLAPI totest_ptnet_Transition = elem.getContainerNamePnObjectHLAPI();
				assert totest_ptnet_Transition.getContainedItem().equals(elem.getContainerNamePnObject());
			
				elem.setContainerNamePnObjectHLAPI(new fr.lip6.move.pnml.ptnet.hlapi.RefPlaceHLAPI(new PtnetFactoryImpl().createRefPlace()));
				PnObjectHLAPI totest_ptnet_RefPlace = elem.getContainerNamePnObjectHLAPI();
				assert totest_ptnet_RefPlace.getContainedItem().equals(elem.getContainerNamePnObject());
			
		}
	

	//Special getter for list of generics object, return only one object type.
	
	
	
	
	

	//setters/remover for lists.
	
	@Test(groups = { "hlapi", "NameHLAPI"})
	public void addToolspecificsHLAPITest(){
		NameHLAPI elem = new NameHLAPI(new PtnetFactoryImpl().createName());
		int howmany = (int)(Math.random()*10);
		for(int i =0; i<howmany;i++)
			
			elem.addToolspecificsHLAPI(new ToolInfoHLAPI(new PtnetFactoryImpl().createToolInfo()));
			

		assert elem.getContainedItem().getToolspecifics().size() == howmany;
	}

	@Test(groups = { "hlapi", "NameHLAPI"})
	public void removeToolspecificsTest(){
		NameHLAPI elem = new NameHLAPI(new PtnetFactoryImpl().createName());
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
	

	@Test(groups = { "hlapi", "NameHLAPI"})
	public void equalsTest(){
		Name a = new PtnetFactoryImpl().createName();
		Name b = new PtnetFactoryImpl().createName();
		NameHLAPI aprime = new NameHLAPI(a);
		NameHLAPI asecond = new NameHLAPI(a);
		NameHLAPI bprime = new NameHLAPI(b);

		assert aprime.equals(asecond);
		assert !aprime.equals(bprime);
	}

	//cloning method
	//public NameHLAPI clone(){
	//	return new NameHLAPI(this);
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
