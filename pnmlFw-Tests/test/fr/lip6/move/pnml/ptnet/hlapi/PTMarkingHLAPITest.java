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
import fr.lip6.move.pnml.ptnet.PTMarking;
import fr.lip6.move.pnml.ptnet.Place;
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
public class PTMarkingHLAPITest {

	
	private AnnotationGraphicsHLAPI itemannotationgraphics;
		
	private Long itemtext;
		
	
	private PlaceHLAPI itemcontainerPlace;
	


	@AfterTest(groups = { "PTMarkingHLAPI", "hlapi" })
	public void After() {
	    System.out.println("done for "+"PTMarkingHLAPI(ptnet)");
	}


	@BeforeMethod(groups = { "PTMarkingHLAPI", "hlapi" })
	public void setup() throws Exception{
	//ModelRepository.reset(); ModelRepository.getInstance().createDocumentWorkspace("void");
	ModelRepository mr = ModelRepository.getInstance();
	mr.createDocumentWorkspace("void");
	
			
			//PtnetFactoryImpl
			itemannotationgraphics = new AnnotationGraphicsHLAPI(new PtnetFactoryImpl().createAnnotationGraphics());
			
		
			itemtext = new Long("0");
			

	
		
		itemcontainerPlace = new PlaceHLAPI(new PtnetFactoryImpl().createPlace());
		
	
	}

	/**
	 * this constructor allows you to set all 'settable' values
	 * excepted container.
	 */
	@Test(groups = { "hlapi", "PTMarkingHLAPI"}, dependsOnMethods={"PTMarkingHLAPI_LLAPI"})
	public void PTMarkingHLAPI_1(){//BEGIN CONSTRUCTOR BODY
   @SuppressWarnings("unused")
	PTMarkingHLAPI totest = new PTMarkingHLAPI(
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
	@Test(groups = { "hlapi", "PTMarkingHLAPI"}, dependsOnMethods={"PTMarkingHLAPI_LLAPI"})
	public void PTMarkingHLAPI_2_containerPlace(){//BEGIN CONSTRUCTOR BODY

	PTMarkingHLAPI totest = new PTMarkingHLAPI(
		itemannotationgraphics
		,	
		itemtext
	,	
		itemcontainerPlace
	);
	
	
		
			assert totest.getAnnotationgraphics().equals(itemannotationgraphics.getContainedItem());
		
	
	
			assert totest.getText().equals(itemtext);
		
	
	assert totest.getContainerPlace().equals(itemcontainerPlace.getContainedItem());
	}

	/**
    * This constructor give access to required stuff only (not container if any)
    */
   @Test(groups = { "hlapi", "PTMarkingHLAPI"}, dependsOnMethods={"PTMarkingHLAPI_LLAPI"})
	public void PTMarkingHLAPI_3(){//BEGIN CONSTRUCTOR BODY

	PTMarkingHLAPI totest = new PTMarkingHLAPI(
		itemtext
	);

	
	
			assert totest.getText().equals(itemtext);
		
	
	}

	/**
    * This constructor give access to required stuff only (and container)
    */
   @Test(groups = { "hlapi", "PTMarkingHLAPI"}, dependsOnMethods={"PTMarkingHLAPI_LLAPI"})
	public void PTMarkingHLAPI_4_containerPlace(){//BEGIN CONSTRUCTOR BODY

	PTMarkingHLAPI totest = new PTMarkingHLAPI(
		itemtext
	,	
	  itemcontainerPlace
	);

	
	
			assert totest.getText().equals(itemtext);
		
	
	assert totest.getContainerPlace().equals(itemcontainerPlace.getContainedItem());
	}


	/**
	 * This constructor encapsulate a low level API object in HLAPI.
	 */
	@Test(groups = { "hlapi", "PTMarkingHLAPI"})
	public void PTMarkingHLAPI_LLAPI(){
	   PTMarking llapi = new PtnetFactoryImpl().createPTMarking();
	   fr.lip6.move.pnml.ptnet.hlapi.PTMarkingHLAPI hlapi = new PTMarkingHLAPI(llapi);
		assert hlapi.getContainedItem().equals(llapi);
	}

	//getters giving HLAPI object
	

	
		/**
		 * This test add a random number of desired objet in the list or of one of each existing subtypes.
		 * then test how many objet are retuned and if any exist inthe original list.
		 */
		@Test(groups = { "hlapi", "PTMarkingHLAPI"})
		public void getToolspecificsHLAPITest(){
			PTMarking llapi = new PtnetFactoryImpl().createPTMarking();
			int howmany;
			
			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getToolspecifics().add(new PtnetFactoryImpl().createToolInfo());
			

			PTMarkingHLAPI elem = new PTMarkingHLAPI(llapi);
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
		@Test(groups = { "hlapi", "PTMarkingHLAPI"})
		public void getAnnotationgraphicsHLAPITest(){
			PTMarkingHLAPI elem = new PTMarkingHLAPI(new PtnetFactoryImpl().createPTMarking());

			
				elem.setAnnotationgraphicsHLAPI(itemannotationgraphics);
				AnnotationGraphicsHLAPI totest = elem.getAnnotationgraphicsHLAPI();
				assert totest.getContainedItem().equals(elem.getAnnotationgraphics());
			
		}
	
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "PTMarkingHLAPI"})
		public void getContainerPlaceHLAPITest(){
			PTMarkingHLAPI elem = new PTMarkingHLAPI(new PtnetFactoryImpl().createPTMarking());

			
				elem.setContainerPlaceHLAPI(itemcontainerPlace);
				PlaceHLAPI totest = elem.getContainerPlaceHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerPlace());
			
		}
	

	//Special getter for list of generics object, return only one object type.
	
	
	
	

	//setters/remover for lists.
	
	@Test(groups = { "hlapi", "PTMarkingHLAPI"})
	public void addToolspecificsHLAPITest(){
		PTMarkingHLAPI elem = new PTMarkingHLAPI(new PtnetFactoryImpl().createPTMarking());
		int howmany = (int)(Math.random()*10);
		for(int i =0; i<howmany;i++)
			
			elem.addToolspecificsHLAPI(new ToolInfoHLAPI(new PtnetFactoryImpl().createToolInfo()));
			

		assert elem.getContainedItem().getToolspecifics().size() == howmany;
	}

	@Test(groups = { "hlapi", "PTMarkingHLAPI"})
	public void removeToolspecificsTest(){
		PTMarkingHLAPI elem = new PTMarkingHLAPI(new PtnetFactoryImpl().createPTMarking());
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
	

	@Test(groups = { "hlapi", "PTMarkingHLAPI"})
	public void equalsTest(){
		PTMarking a = new PtnetFactoryImpl().createPTMarking();
		PTMarking b = new PtnetFactoryImpl().createPTMarking();
		PTMarkingHLAPI aprime = new PTMarkingHLAPI(a);
		PTMarkingHLAPI asecond = new PTMarkingHLAPI(a);
		PTMarkingHLAPI bprime = new PTMarkingHLAPI(b);

		assert aprime.equals(asecond);
		assert !aprime.equals(bprime);
	}

	//cloning method
	//public PTMarkingHLAPI clone(){
	//	return new PTMarkingHLAPI(this);
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
