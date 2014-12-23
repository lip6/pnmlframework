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
package fr.lip6.move.pnml.ptnet.hlapi;

import java.util.List;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import fr.lip6.move.pnml.framework.utils.ModelRepository;
import fr.lip6.move.pnml.ptnet.PTArcAnnotation;
import fr.lip6.move.pnml.ptnet.impl.PtnetFactoryImpl;
public class PTArcAnnotationHLAPITest {

	
	private AnnotationGraphicsHLAPI itemannotationgraphics;
		
	private Integer itemtext;
		
	
	private ArcHLAPI itemcontainerArc;
	


	@AfterTest(groups = { "PTArcAnnotationHLAPI", "hlapi" })
	public void After() {
	    System.out.println("done for "+"PTArcAnnotationHLAPI(ptnet)");
	}


	@BeforeMethod(groups = { "PTArcAnnotationHLAPI", "hlapi" })
	public void setup() throws Exception{
	//ModelRepository.reset(); ModelRepository.getInstance().createDocumentWorkspace("void");
	ModelRepository mr = ModelRepository.getInstance();
	mr.createDocumentWorkspace("void");
	
			
			//PtnetFactoryImpl
			itemannotationgraphics = new AnnotationGraphicsHLAPI(new PtnetFactoryImpl().createAnnotationGraphics());
			
		
			itemtext = new Integer("0");
			

	
		
		itemcontainerArc = new ArcHLAPI(new PtnetFactoryImpl().createArc());
		
	
	}

	/**
	 * this constructor allows you to set all 'settable' values
	 * excepted container.
	 */
	@Test(groups = { "hlapi", "PTArcAnnotationHLAPI"}, dependsOnMethods={"PTArcAnnotationHLAPI_LLAPI"})
	public void PTArcAnnotationHLAPI_1(){//BEGIN CONSTRUCTOR BODY
   @SuppressWarnings("unused")
	PTArcAnnotationHLAPI totest = new PTArcAnnotationHLAPI(
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
	@Test(groups = { "hlapi", "PTArcAnnotationHLAPI"}, dependsOnMethods={"PTArcAnnotationHLAPI_LLAPI"})
	public void PTArcAnnotationHLAPI_2_containerArc(){//BEGIN CONSTRUCTOR BODY

	PTArcAnnotationHLAPI totest = new PTArcAnnotationHLAPI(
		itemannotationgraphics
		,	
		itemtext
	,	
		itemcontainerArc
	);
	
	
		
			assert totest.getAnnotationgraphics().equals(itemannotationgraphics.getContainedItem());
		
	
	
			assert totest.getText().equals(itemtext);
		
	
	assert totest.getContainerArc().equals(itemcontainerArc.getContainedItem());
	}

	/**
    * This constructor give access to required stuff only (not container if any)
    */
   @Test(groups = { "hlapi", "PTArcAnnotationHLAPI"}, dependsOnMethods={"PTArcAnnotationHLAPI_LLAPI"})
	public void PTArcAnnotationHLAPI_3(){//BEGIN CONSTRUCTOR BODY

	PTArcAnnotationHLAPI totest = new PTArcAnnotationHLAPI(
		itemtext
	);

	
	
			assert totest.getText().equals(itemtext);
		
	
	}

	/**
    * This constructor give access to required stuff only (and container)
    */
   @Test(groups = { "hlapi", "PTArcAnnotationHLAPI"}, dependsOnMethods={"PTArcAnnotationHLAPI_LLAPI"})
	public void PTArcAnnotationHLAPI_4_containerArc(){//BEGIN CONSTRUCTOR BODY

	PTArcAnnotationHLAPI totest = new PTArcAnnotationHLAPI(
		itemtext
	,	
	  itemcontainerArc
	);

	
	
			assert totest.getText().equals(itemtext);
		
	
	assert totest.getContainerArc().equals(itemcontainerArc.getContainedItem());
	}


	/**
	 * This constructor encapsulate a low level API object in HLAPI.
	 */
	@Test(groups = { "hlapi", "PTArcAnnotationHLAPI"})
	public void PTArcAnnotationHLAPI_LLAPI(){
	   PTArcAnnotation llapi = new PtnetFactoryImpl().createPTArcAnnotation();
	   fr.lip6.move.pnml.ptnet.hlapi.PTArcAnnotationHLAPI hlapi = new PTArcAnnotationHLAPI(llapi);
		assert hlapi.getContainedItem().equals(llapi);
	}

	//getters giving HLAPI object
	

	
		/**
		 * This test add a random number of desired objet in the list or of one of each existing subtypes.
		 * then test how many objet are retuned and if any exist inthe original list.
		 */
		@Test(groups = { "hlapi", "PTArcAnnotationHLAPI"})
		public void getToolspecificsHLAPITest(){
			PTArcAnnotation llapi = new PtnetFactoryImpl().createPTArcAnnotation();
			int howmany;
			
			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getToolspecifics().add(new PtnetFactoryImpl().createToolInfo());
			

			PTArcAnnotationHLAPI elem = new PTArcAnnotationHLAPI(llapi);
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
		@Test(groups = { "hlapi", "PTArcAnnotationHLAPI"})
		public void getAnnotationgraphicsHLAPITest(){
			PTArcAnnotationHLAPI elem = new PTArcAnnotationHLAPI(new PtnetFactoryImpl().createPTArcAnnotation());

			
				elem.setAnnotationgraphicsHLAPI(itemannotationgraphics);
				AnnotationGraphicsHLAPI totest = elem.getAnnotationgraphicsHLAPI();
				assert totest.getContainedItem().equals(elem.getAnnotationgraphics());
			
		}
	
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "PTArcAnnotationHLAPI"})
		public void getContainerArcHLAPITest(){
			PTArcAnnotationHLAPI elem = new PTArcAnnotationHLAPI(new PtnetFactoryImpl().createPTArcAnnotation());

			
				elem.setContainerArcHLAPI(itemcontainerArc);
				ArcHLAPI totest = elem.getContainerArcHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerArc());
			
		}
	

	//Special getter for list of generics object, return only one object type.
	
	
	
	

	//setters/remover for lists.
	
	@Test(groups = { "hlapi", "PTArcAnnotationHLAPI"})
	public void addToolspecificsHLAPITest(){
		PTArcAnnotationHLAPI elem = new PTArcAnnotationHLAPI(new PtnetFactoryImpl().createPTArcAnnotation());
		int howmany = (int)(Math.random()*10);
		for(int i =0; i<howmany;i++)
			
			elem.addToolspecificsHLAPI(new ToolInfoHLAPI(new PtnetFactoryImpl().createToolInfo()));
			

		assert elem.getContainedItem().getToolspecifics().size() == howmany;
	}

	@Test(groups = { "hlapi", "PTArcAnnotationHLAPI"})
	public void removeToolspecificsTest(){
		PTArcAnnotationHLAPI elem = new PTArcAnnotationHLAPI(new PtnetFactoryImpl().createPTArcAnnotation());
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
	

	@Test(groups = { "hlapi", "PTArcAnnotationHLAPI"})
	public void equalsTest(){
		PTArcAnnotation a = new PtnetFactoryImpl().createPTArcAnnotation();
		PTArcAnnotation b = new PtnetFactoryImpl().createPTArcAnnotation();
		PTArcAnnotationHLAPI aprime = new PTArcAnnotationHLAPI(a);
		PTArcAnnotationHLAPI asecond = new PTArcAnnotationHLAPI(a);
		PTArcAnnotationHLAPI bprime = new PTArcAnnotationHLAPI(b);

		assert aprime.equals(asecond);
		assert !aprime.equals(bprime);
	}

	//cloning method
	//public PTArcAnnotationHLAPI clone(){
	//	return new PTArcAnnotationHLAPI(this);
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
