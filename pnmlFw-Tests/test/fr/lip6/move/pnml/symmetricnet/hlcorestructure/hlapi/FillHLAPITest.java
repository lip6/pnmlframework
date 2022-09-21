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
 * $Id ggiffo, Thu Feb 11 16:29:02 CET 2016$
 */
package fr.lip6.move.pnml.symmetricnet.hlcorestructure.hlapi;

import java.net.URI;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import fr.lip6.move.pnml.framework.utils.ModelRepository;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.Fill;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.impl.HlcorestructureFactoryImpl;
public class FillHLAPITest {

	
	private CSS2ColorHLAPI itemcolor;
		
	private CSS2ColorHLAPI itemgradientcolor;
		
	private GradientHLAPI itemgradientrotation;
		
	private URI itemimage;
		
	
	private NodeGraphicsHLAPI itemcontainerNodeGraphics;
	
	private AnnotationGraphicsHLAPI itemcontainerAnnotationGraphics;
	


	@AfterTest(groups = { "FillHLAPI", "hlapi" })
	public void After() {
	    System.out.println("done for "+"FillHLAPI(hlcorestructure)");
	}


	@BeforeMethod(groups = { "FillHLAPI", "hlapi" })
	public void setup() throws Exception{
	//ModelRepository.reset(); ModelRepository.getInstance().createDocumentWorkspace("void");
	ModelRepository mr = ModelRepository.getInstance();
	mr.createDocumentWorkspace("void");
	
		itemcolor = CSS2ColorHLAPI.get(0);
		
		itemgradientcolor = CSS2ColorHLAPI.get(0);
		
		itemgradientrotation = GradientHLAPI.get(0);
		
			itemimage = new URI("0");
			

	
		
		itemcontainerNodeGraphics = new NodeGraphicsHLAPI(new HlcorestructureFactoryImpl().createNodeGraphics());
		
	
		
		itemcontainerAnnotationGraphics = new AnnotationGraphicsHLAPI(new HlcorestructureFactoryImpl().createAnnotationGraphics());
		
	
	}

	/**
	 * this constructor allows you to set all 'settable' values
	 * excepted container.
	 */
	@Test(groups = { "hlapi", "FillHLAPI"}, dependsOnMethods={"FillHLAPI_LLAPI"})
	public void FillHLAPI_1(){//BEGIN CONSTRUCTOR BODY
   @SuppressWarnings("unused")
	FillHLAPI totest = new FillHLAPI(
		itemcolor
		,	
		itemgradientcolor
		,	
		itemgradientrotation
		,	
		itemimage
	);
	
	
	
	
	
	
	
	
	assert totest.getImage().equals(itemimage);
	
	
	}

	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "FillHLAPI"}, dependsOnMethods={"FillHLAPI_LLAPI"})
	public void FillHLAPI_2_containerNodeGraphics(){//BEGIN CONSTRUCTOR BODY

	FillHLAPI totest = new FillHLAPI(
		itemcolor
		,	
		itemgradientcolor
		,	
		itemgradientrotation
		,	
		itemimage
	,	
		itemcontainerNodeGraphics
	);
	
	
		
	
		
	
		
	
			assert totest.getImage().equals(itemimage);
		
	
	assert totest.getContainerNodeGraphics().equals(itemcontainerNodeGraphics.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "FillHLAPI"}, dependsOnMethods={"FillHLAPI_LLAPI"})
	public void FillHLAPI_2_containerAnnotationGraphics(){//BEGIN CONSTRUCTOR BODY

	FillHLAPI totest = new FillHLAPI(
		itemcolor
		,	
		itemgradientcolor
		,	
		itemgradientrotation
		,	
		itemimage
	,	
		itemcontainerAnnotationGraphics
	);
	
	
		
	
		
	
		
	
			assert totest.getImage().equals(itemimage);
		
	
	assert totest.getContainerAnnotationGraphics().equals(itemcontainerAnnotationGraphics.getContainedItem());
	}

	/**
    * This constructor give access to required stuff only (not container if any)
    */

	/**
    * This constructor give access to required stuff only (and container)
    */
   @Test(groups = { "hlapi", "FillHLAPI"}, dependsOnMethods={"FillHLAPI_LLAPI"})
	public void FillHLAPI_4_containerNodeGraphics(){//BEGIN CONSTRUCTOR BODY

	FillHLAPI totest = new FillHLAPI(
	  itemcontainerNodeGraphics
	);

	
	assert totest.getContainerNodeGraphics().equals(itemcontainerNodeGraphics.getContainedItem());
	}
	/**
    * This constructor give access to required stuff only (and container)
    */
   @Test(groups = { "hlapi", "FillHLAPI"}, dependsOnMethods={"FillHLAPI_LLAPI"})
	public void FillHLAPI_4_containerAnnotationGraphics(){//BEGIN CONSTRUCTOR BODY

	FillHLAPI totest = new FillHLAPI(
	  itemcontainerAnnotationGraphics
	);

	
	assert totest.getContainerAnnotationGraphics().equals(itemcontainerAnnotationGraphics.getContainedItem());
	}


	/**
	 * This constructor encapsulate a low level API object in HLAPI.
	 */
	@Test(groups = { "hlapi", "FillHLAPI"})
	public void FillHLAPI_LLAPI(){
	   Fill llapi = new HlcorestructureFactoryImpl().createFill();
	   fr.lip6.move.pnml.symmetricnet.hlcorestructure.hlapi.FillHLAPI hlapi = new FillHLAPI(llapi);
		assert hlapi.getContainedItem().equals(llapi);
	}

	//getters giving HLAPI object
	
	
	
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "FillHLAPI"})
		public void getContainerNodeGraphicsHLAPITest(){
			FillHLAPI elem = new FillHLAPI(new HlcorestructureFactoryImpl().createFill());

			
				elem.setContainerNodeGraphicsHLAPI(itemcontainerNodeGraphics);
				NodeGraphicsHLAPI totest = elem.getContainerNodeGraphicsHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerNodeGraphics());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "FillHLAPI"})
		public void getContainerAnnotationGraphicsHLAPITest(){
			FillHLAPI elem = new FillHLAPI(new HlcorestructureFactoryImpl().createFill());

			
				elem.setContainerAnnotationGraphicsHLAPI(itemcontainerAnnotationGraphics);
				AnnotationGraphicsHLAPI totest = elem.getContainerAnnotationGraphicsHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerAnnotationGraphics());
			
		}
	

	//Special getter for list of generics object, return only one object type.
	
	
	

	//setters/remover for lists.
	

	@Test(groups = { "hlapi", "FillHLAPI"})
	public void equalsTest(){
		Fill a = new HlcorestructureFactoryImpl().createFill();
		Fill b = new HlcorestructureFactoryImpl().createFill();
		FillHLAPI aprime = new FillHLAPI(a);
		FillHLAPI asecond = new FillHLAPI(a);
		FillHLAPI bprime = new FillHLAPI(b);

		assert aprime.equals(asecond);
		assert !aprime.equals(bprime);
	}

	//cloning method
	//public FillHLAPI clone(){
	//	return new FillHLAPI(this);
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
