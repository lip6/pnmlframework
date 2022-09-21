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

import fr.lip6.move.pnml.ptnet.Annotation;
import fr.lip6.move.pnml.ptnet.AnnotationGraphics;
import fr.lip6.move.pnml.ptnet.AnyObject;
import fr.lip6.move.pnml.ptnet.Arc;
import fr.lip6.move.pnml.ptnet.ArcGraphics;
import fr.lip6.move.pnml.ptnet.CSS2Color;
import fr.lip6.move.pnml.ptnet.Dimension;
import fr.lip6.move.pnml.ptnet.Fill;
import fr.lip6.move.pnml.ptnet.Font;
import fr.lip6.move.pnml.ptnet.Gradient;
import fr.lip6.move.pnml.ptnet.Label;
import fr.lip6.move.pnml.ptnet.Line;
import fr.lip6.move.pnml.ptnet.LineShape;
import fr.lip6.move.pnml.ptnet.LineStyle;
import fr.lip6.move.pnml.ptnet.Name;
import fr.lip6.move.pnml.ptnet.Node;
import fr.lip6.move.pnml.ptnet.NodeGraphics;
import fr.lip6.move.pnml.ptnet.Offset;
import fr.lip6.move.pnml.ptnet.PNType;
import fr.lip6.move.pnml.ptnet.PTArcAnnotation;
import fr.lip6.move.pnml.ptnet.PTMarking;
import fr.lip6.move.pnml.ptnet.Page;
import fr.lip6.move.pnml.ptnet.PetriNet;
import fr.lip6.move.pnml.ptnet.PetriNetDoc;
import fr.lip6.move.pnml.ptnet.Place;
import fr.lip6.move.pnml.ptnet.PnObject;
import fr.lip6.move.pnml.ptnet.Position;
import fr.lip6.move.pnml.ptnet.ToolInfo;

import fr.lip6.move.pnml.ptnet.impl.PtnetFactoryImpl;

import java.net.URI;

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
public class ArcHLAPITest {

	
	private String itemid;
		
	private NameHLAPI itemname;
		
	private NodeHLAPI itemsource;
		
	private NodeHLAPI itemtarget;
		
	private ArcGraphicsHLAPI itemarcgraphics;
		
	private PTArcAnnotationHLAPI iteminscription;
		
	
	private PageHLAPI itemcontainerPage;
	


	@AfterTest(groups = { "ArcHLAPI", "hlapi" })
	public void After() {
	    System.out.println("done for "+"ArcHLAPI(ptnet)");
	}


	@BeforeMethod(groups = { "ArcHLAPI", "hlapi" })
	public void setup() throws Exception{
	//ModelRepository.reset(); ModelRepository.getInstance().createDocumentWorkspace("void");
	ModelRepository mr = ModelRepository.getInstance();
	mr.createDocumentWorkspace("void");
	
			itemid = "unid";
			
			
			//PtnetFactoryImpl
			itemname = new NameHLAPI(new PtnetFactoryImpl().createName());
			
		
			
				
			itemsource = new fr.lip6.move.pnml.ptnet.hlapi.PlaceHLAPI(
				new PtnetFactoryImpl().createPlace()
			);
				
			
		
			
				
			itemtarget = new fr.lip6.move.pnml.ptnet.hlapi.PlaceHLAPI(
				new PtnetFactoryImpl().createPlace()
			);
				
			
		
			
			//PtnetFactoryImpl
			itemarcgraphics = new ArcGraphicsHLAPI(new PtnetFactoryImpl().createArcGraphics());
			
		
			
			//PtnetFactoryImpl
			iteminscription = new PTArcAnnotationHLAPI(new PtnetFactoryImpl().createPTArcAnnotation());
			
		

	
		
		itemcontainerPage = new PageHLAPI(new PtnetFactoryImpl().createPage());
		
	
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
		,	
		iteminscription
	);
	
	
	assert totest.getId().equals(itemid);
	
	
	
	
	assert totest.getName().equals(itemname.getContainedItem());
	
	
	
	
	assert totest.getSource().equals(itemsource.getContainedItem());
	
	
	
	
	assert totest.getTarget().equals(itemtarget.getContainedItem());
	
	
	
	
	assert totest.getArcgraphics().equals(itemarcgraphics.getContainedItem());
	
	
	
	
	assert totest.getInscription().equals(iteminscription.getContainedItem());
	
	
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
		iteminscription
	,	
		itemcontainerPage
	);
	
	
			assert totest.getId().equals(itemid);
		
	
	
		
			assert totest.getName().equals(itemname.getContainedItem());
		
	
	
		
			assert totest.getSource().equals(itemsource.getContainedItem());
		
	
	
		
			assert totest.getTarget().equals(itemtarget.getContainedItem());
		
	
	
		
			assert totest.getArcgraphics().equals(itemarcgraphics.getContainedItem());
		
	
	
		
			assert totest.getInscription().equals(iteminscription.getContainedItem());
		
	
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
	   Arc llapi = new PtnetFactoryImpl().createArc();
	   fr.lip6.move.pnml.ptnet.hlapi.ArcHLAPI hlapi = new ArcHLAPI(llapi);
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
			ArcHLAPI elem = new ArcHLAPI(new PtnetFactoryImpl().createArc());

			
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
			Arc llapi = new PtnetFactoryImpl().createArc();
			int howmany;
			
			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getToolspecifics().add(new PtnetFactoryImpl().createToolInfo());
			

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
			ArcHLAPI elem = new ArcHLAPI(new PtnetFactoryImpl().createArc());

			
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
			ArcHLAPI elem = new ArcHLAPI(new PtnetFactoryImpl().createArc());

			
				elem.setSourceHLAPI(new fr.lip6.move.pnml.ptnet.hlapi.PlaceHLAPI(new PtnetFactoryImpl().createPlace()));
				NodeHLAPI totest_ptnet_Place = elem.getSourceHLAPI();
				assert totest_ptnet_Place.getContainedItem().equals(elem.getSource());
			
				elem.setSourceHLAPI(new fr.lip6.move.pnml.ptnet.hlapi.RefTransitionHLAPI(new PtnetFactoryImpl().createRefTransition()));
				NodeHLAPI totest_ptnet_RefTransition = elem.getSourceHLAPI();
				assert totest_ptnet_RefTransition.getContainedItem().equals(elem.getSource());
			
				elem.setSourceHLAPI(new fr.lip6.move.pnml.ptnet.hlapi.TransitionHLAPI(new PtnetFactoryImpl().createTransition()));
				NodeHLAPI totest_ptnet_Transition = elem.getSourceHLAPI();
				assert totest_ptnet_Transition.getContainedItem().equals(elem.getSource());
			
				elem.setSourceHLAPI(new fr.lip6.move.pnml.ptnet.hlapi.RefPlaceHLAPI(new PtnetFactoryImpl().createRefPlace()));
				NodeHLAPI totest_ptnet_RefPlace = elem.getSourceHLAPI();
				assert totest_ptnet_RefPlace.getContainedItem().equals(elem.getSource());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "ArcHLAPI"})
		public void getTargetHLAPITest(){
			ArcHLAPI elem = new ArcHLAPI(new PtnetFactoryImpl().createArc());

			
				elem.setTargetHLAPI(new fr.lip6.move.pnml.ptnet.hlapi.PlaceHLAPI(new PtnetFactoryImpl().createPlace()));
				NodeHLAPI totest_ptnet_Place = elem.getTargetHLAPI();
				assert totest_ptnet_Place.getContainedItem().equals(elem.getTarget());
			
				elem.setTargetHLAPI(new fr.lip6.move.pnml.ptnet.hlapi.RefTransitionHLAPI(new PtnetFactoryImpl().createRefTransition()));
				NodeHLAPI totest_ptnet_RefTransition = elem.getTargetHLAPI();
				assert totest_ptnet_RefTransition.getContainedItem().equals(elem.getTarget());
			
				elem.setTargetHLAPI(new fr.lip6.move.pnml.ptnet.hlapi.TransitionHLAPI(new PtnetFactoryImpl().createTransition()));
				NodeHLAPI totest_ptnet_Transition = elem.getTargetHLAPI();
				assert totest_ptnet_Transition.getContainedItem().equals(elem.getTarget());
			
				elem.setTargetHLAPI(new fr.lip6.move.pnml.ptnet.hlapi.RefPlaceHLAPI(new PtnetFactoryImpl().createRefPlace()));
				NodeHLAPI totest_ptnet_RefPlace = elem.getTargetHLAPI();
				assert totest_ptnet_RefPlace.getContainedItem().equals(elem.getTarget());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "ArcHLAPI"})
		public void getArcgraphicsHLAPITest(){
			ArcHLAPI elem = new ArcHLAPI(new PtnetFactoryImpl().createArc());

			
				elem.setArcgraphicsHLAPI(itemarcgraphics);
				ArcGraphicsHLAPI totest = elem.getArcgraphicsHLAPI();
				assert totest.getContainedItem().equals(elem.getArcgraphics());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "ArcHLAPI"})
		public void getInscriptionHLAPITest(){
			ArcHLAPI elem = new ArcHLAPI(new PtnetFactoryImpl().createArc());

			
				elem.setInscriptionHLAPI(iteminscription);
				PTArcAnnotationHLAPI totest = elem.getInscriptionHLAPI();
				assert totest.getContainedItem().equals(elem.getInscription());
			
		}
	

	//Special getter for list of generics object, return only one object type.
	
	
	
	
	
	
	
	

	//setters/remover for lists.
	
	@Test(groups = { "hlapi", "ArcHLAPI"})
	public void addToolspecificsHLAPITest(){
		ArcHLAPI elem = new ArcHLAPI(new PtnetFactoryImpl().createArc());
		int howmany = (int)(Math.random()*10);
		for(int i =0; i<howmany;i++)
			
			elem.addToolspecificsHLAPI(new ToolInfoHLAPI(new PtnetFactoryImpl().createToolInfo()));
			

		assert elem.getContainedItem().getToolspecifics().size() == howmany;
	}

	@Test(groups = { "hlapi", "ArcHLAPI"})
	public void removeToolspecificsTest(){
		ArcHLAPI elem = new ArcHLAPI(new PtnetFactoryImpl().createArc());
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
	

	@Test(groups = { "hlapi", "ArcHLAPI"})
	public void equalsTest(){
		Arc a = new PtnetFactoryImpl().createArc();
		Arc b = new PtnetFactoryImpl().createArc();
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
