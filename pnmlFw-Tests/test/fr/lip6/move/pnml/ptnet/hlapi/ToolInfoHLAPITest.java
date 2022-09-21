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
import fr.lip6.move.pnml.ptnet.AnyObject;
import fr.lip6.move.pnml.ptnet.Arc;
import fr.lip6.move.pnml.ptnet.Label;
import fr.lip6.move.pnml.ptnet.Name;
import fr.lip6.move.pnml.ptnet.NodeGraphics;
import fr.lip6.move.pnml.ptnet.PNType;
import fr.lip6.move.pnml.ptnet.PTArcAnnotation;
import fr.lip6.move.pnml.ptnet.PTMarking;
import fr.lip6.move.pnml.ptnet.Page;
import fr.lip6.move.pnml.ptnet.PetriNet;
import fr.lip6.move.pnml.ptnet.PetriNetDoc;
import fr.lip6.move.pnml.ptnet.Place;
import fr.lip6.move.pnml.ptnet.PnObject;
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
public class ToolInfoHLAPITest {

	
	private String itemtool;
		
	private String itemversion;
		
	private StringBuffer itemformattedXMLBuffer;
		
	private URI itemtoolInfoGrammarURI;
		
	private AnyObjectHLAPI itemtoolInfoModel;
		
	
	private PetriNetHLAPI itemcontainerPetriNet;
	
	private PnObjectHLAPI itemcontainerPnObject;
	
	private LabelHLAPI itemcontainerLabel;
	


	@AfterTest(groups = { "ToolInfoHLAPI", "hlapi" })
	public void After() {
	    System.out.println("done for "+"ToolInfoHLAPI(ptnet)");
	}


	@BeforeMethod(groups = { "ToolInfoHLAPI", "hlapi" })
	public void setup() throws Exception{
	//ModelRepository.reset(); ModelRepository.getInstance().createDocumentWorkspace("void");
	ModelRepository mr = ModelRepository.getInstance();
	mr.createDocumentWorkspace("void");
	
			itemtool = "unid";
			
			itemversion = "unid";
			
			itemformattedXMLBuffer = new StringBuffer("0");
			
			itemtoolInfoGrammarURI = new URI("0");
			
			
				
			
		

	
		
		itemcontainerPetriNet = new PetriNetHLAPI(new PtnetFactoryImpl().createPetriNet());
		
	
		
			
			
		itemcontainerPnObject = new fr.lip6.move.pnml.ptnet.hlapi.PageHLAPI(
		   new PtnetFactoryImpl().createPage()
		);
			
		
	
		
			
			
		itemcontainerLabel = new fr.lip6.move.pnml.ptnet.hlapi.PTMarkingHLAPI(
		   new PtnetFactoryImpl().createPTMarking()
		);
			
		
	
	}

	/**
	 * this constructor allows you to set all 'settable' values
	 * excepted container.
	 */
	@Test(groups = { "hlapi", "ToolInfoHLAPI"}, dependsOnMethods={"ToolInfoHLAPI_LLAPI"})
	public void ToolInfoHLAPI_1(){//BEGIN CONSTRUCTOR BODY
   @SuppressWarnings("unused")
	ToolInfoHLAPI totest = new ToolInfoHLAPI(
		itemtool
		,	
		itemversion
		,	
		itemformattedXMLBuffer
		,	
		itemtoolInfoGrammarURI
		,	
		itemtoolInfoModel
	);
	
	
	assert totest.getTool().equals(itemtool);
	
	
	
	assert totest.getVersion().equals(itemversion);
	
	
	
	assert totest.getFormattedXMLBuffer().equals(itemformattedXMLBuffer);
	
	
	
	assert totest.getToolInfoGrammarURI().equals(itemtoolInfoGrammarURI);
	
	
	
	
	}

	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "ToolInfoHLAPI"}, dependsOnMethods={"ToolInfoHLAPI_LLAPI"})
	public void ToolInfoHLAPI_2_containerPetriNet(){//BEGIN CONSTRUCTOR BODY

	ToolInfoHLAPI totest = new ToolInfoHLAPI(
		itemtool
		,	
		itemversion
		,	
		itemformattedXMLBuffer
		,	
		itemtoolInfoGrammarURI
		,	
		itemtoolInfoModel
	,	
		itemcontainerPetriNet
	);
	
	
			assert totest.getTool().equals(itemtool);
		
	
	
			assert totest.getVersion().equals(itemversion);
		
	
	
			assert totest.getFormattedXMLBuffer().equals(itemformattedXMLBuffer);
		
	
	
			assert totest.getToolInfoGrammarURI().equals(itemtoolInfoGrammarURI);
		
	
	
		
	assert totest.getContainerPetriNet().equals(itemcontainerPetriNet.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "ToolInfoHLAPI"}, dependsOnMethods={"ToolInfoHLAPI_LLAPI"})
	public void ToolInfoHLAPI_2_containerPnObject(){//BEGIN CONSTRUCTOR BODY

	ToolInfoHLAPI totest = new ToolInfoHLAPI(
		itemtool
		,	
		itemversion
		,	
		itemformattedXMLBuffer
		,	
		itemtoolInfoGrammarURI
		,	
		itemtoolInfoModel
	,	
		itemcontainerPnObject
	);
	
	
			assert totest.getTool().equals(itemtool);
		
	
	
			assert totest.getVersion().equals(itemversion);
		
	
	
			assert totest.getFormattedXMLBuffer().equals(itemformattedXMLBuffer);
		
	
	
			assert totest.getToolInfoGrammarURI().equals(itemtoolInfoGrammarURI);
		
	
	
		
	assert totest.getContainerPnObject().equals(itemcontainerPnObject.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "ToolInfoHLAPI"}, dependsOnMethods={"ToolInfoHLAPI_LLAPI"})
	public void ToolInfoHLAPI_2_containerLabel(){//BEGIN CONSTRUCTOR BODY

	ToolInfoHLAPI totest = new ToolInfoHLAPI(
		itemtool
		,	
		itemversion
		,	
		itemformattedXMLBuffer
		,	
		itemtoolInfoGrammarURI
		,	
		itemtoolInfoModel
	,	
		itemcontainerLabel
	);
	
	
			assert totest.getTool().equals(itemtool);
		
	
	
			assert totest.getVersion().equals(itemversion);
		
	
	
			assert totest.getFormattedXMLBuffer().equals(itemformattedXMLBuffer);
		
	
	
			assert totest.getToolInfoGrammarURI().equals(itemtoolInfoGrammarURI);
		
	
	
		
	assert totest.getContainerLabel().equals(itemcontainerLabel.getContainedItem());
	}

	/**
    * This constructor give access to required stuff only (not container if any)
    */
   @Test(groups = { "hlapi", "ToolInfoHLAPI"}, dependsOnMethods={"ToolInfoHLAPI_LLAPI"})
	public void ToolInfoHLAPI_3(){//BEGIN CONSTRUCTOR BODY

	ToolInfoHLAPI totest = new ToolInfoHLAPI(
		itemtool
		,	
		itemversion
	);

	
	
			assert totest.getTool().equals(itemtool);
		
	
	
			assert totest.getVersion().equals(itemversion);
		
	
	}

	/**
    * This constructor give access to required stuff only (and container)
    */
   @Test(groups = { "hlapi", "ToolInfoHLAPI"}, dependsOnMethods={"ToolInfoHLAPI_LLAPI"})
	public void ToolInfoHLAPI_4_containerPetriNet(){//BEGIN CONSTRUCTOR BODY

	ToolInfoHLAPI totest = new ToolInfoHLAPI(
		itemtool
		,	
		itemversion
	,	
	  itemcontainerPetriNet
	);

	
	
			assert totest.getTool().equals(itemtool);
		
	
	
			assert totest.getVersion().equals(itemversion);
		
	
	assert totest.getContainerPetriNet().equals(itemcontainerPetriNet.getContainedItem());
	}
	/**
    * This constructor give access to required stuff only (and container)
    */
   @Test(groups = { "hlapi", "ToolInfoHLAPI"}, dependsOnMethods={"ToolInfoHLAPI_LLAPI"})
	public void ToolInfoHLAPI_4_containerPnObject(){//BEGIN CONSTRUCTOR BODY

	ToolInfoHLAPI totest = new ToolInfoHLAPI(
		itemtool
		,	
		itemversion
	,	
	  itemcontainerPnObject
	);

	
	
			assert totest.getTool().equals(itemtool);
		
	
	
			assert totest.getVersion().equals(itemversion);
		
	
	assert totest.getContainerPnObject().equals(itemcontainerPnObject.getContainedItem());
	}
	/**
    * This constructor give access to required stuff only (and container)
    */
   @Test(groups = { "hlapi", "ToolInfoHLAPI"}, dependsOnMethods={"ToolInfoHLAPI_LLAPI"})
	public void ToolInfoHLAPI_4_containerLabel(){//BEGIN CONSTRUCTOR BODY

	ToolInfoHLAPI totest = new ToolInfoHLAPI(
		itemtool
		,	
		itemversion
	,	
	  itemcontainerLabel
	);

	
	
			assert totest.getTool().equals(itemtool);
		
	
	
			assert totest.getVersion().equals(itemversion);
		
	
	assert totest.getContainerLabel().equals(itemcontainerLabel.getContainedItem());
	}


	/**
	 * This constructor encapsulate a low level API object in HLAPI.
	 */
	@Test(groups = { "hlapi", "ToolInfoHLAPI"})
	public void ToolInfoHLAPI_LLAPI(){
	   ToolInfo llapi = new PtnetFactoryImpl().createToolInfo();
	   fr.lip6.move.pnml.ptnet.hlapi.ToolInfoHLAPI hlapi = new ToolInfoHLAPI(llapi);
		assert hlapi.getContainedItem().equals(llapi);
	}

	//getters giving HLAPI object
	
	
	
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "ToolInfoHLAPI"})
		public void getContainerPetriNetHLAPITest(){
			ToolInfoHLAPI elem = new ToolInfoHLAPI(new PtnetFactoryImpl().createToolInfo());

			
				elem.setContainerPetriNetHLAPI(itemcontainerPetriNet);
				PetriNetHLAPI totest = elem.getContainerPetriNetHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerPetriNet());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "ToolInfoHLAPI"})
		public void getContainerPnObjectHLAPITest(){
			ToolInfoHLAPI elem = new ToolInfoHLAPI(new PtnetFactoryImpl().createToolInfo());

			
				elem.setContainerPnObjectHLAPI(new fr.lip6.move.pnml.ptnet.hlapi.PageHLAPI(new PtnetFactoryImpl().createPage()));
				PnObjectHLAPI totest_ptnet_Page = elem.getContainerPnObjectHLAPI();
				assert totest_ptnet_Page.getContainedItem().equals(elem.getContainerPnObject());
			
				elem.setContainerPnObjectHLAPI(new fr.lip6.move.pnml.ptnet.hlapi.ArcHLAPI(new PtnetFactoryImpl().createArc()));
				PnObjectHLAPI totest_ptnet_Arc = elem.getContainerPnObjectHLAPI();
				assert totest_ptnet_Arc.getContainedItem().equals(elem.getContainerPnObject());
			
				elem.setContainerPnObjectHLAPI(new fr.lip6.move.pnml.ptnet.hlapi.PlaceHLAPI(new PtnetFactoryImpl().createPlace()));
				PnObjectHLAPI totest_ptnet_Place = elem.getContainerPnObjectHLAPI();
				assert totest_ptnet_Place.getContainedItem().equals(elem.getContainerPnObject());
			
				elem.setContainerPnObjectHLAPI(new fr.lip6.move.pnml.ptnet.hlapi.RefTransitionHLAPI(new PtnetFactoryImpl().createRefTransition()));
				PnObjectHLAPI totest_ptnet_RefTransition = elem.getContainerPnObjectHLAPI();
				assert totest_ptnet_RefTransition.getContainedItem().equals(elem.getContainerPnObject());
			
				elem.setContainerPnObjectHLAPI(new fr.lip6.move.pnml.ptnet.hlapi.TransitionHLAPI(new PtnetFactoryImpl().createTransition()));
				PnObjectHLAPI totest_ptnet_Transition = elem.getContainerPnObjectHLAPI();
				assert totest_ptnet_Transition.getContainedItem().equals(elem.getContainerPnObject());
			
				elem.setContainerPnObjectHLAPI(new fr.lip6.move.pnml.ptnet.hlapi.RefPlaceHLAPI(new PtnetFactoryImpl().createRefPlace()));
				PnObjectHLAPI totest_ptnet_RefPlace = elem.getContainerPnObjectHLAPI();
				assert totest_ptnet_RefPlace.getContainedItem().equals(elem.getContainerPnObject());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "ToolInfoHLAPI"})
		public void getContainerLabelHLAPITest(){
			ToolInfoHLAPI elem = new ToolInfoHLAPI(new PtnetFactoryImpl().createToolInfo());

			
				elem.setContainerLabelHLAPI(new fr.lip6.move.pnml.ptnet.hlapi.PTMarkingHLAPI(new PtnetFactoryImpl().createPTMarking()));
				LabelHLAPI totest_ptnet_PTMarking = elem.getContainerLabelHLAPI();
				assert totest_ptnet_PTMarking.getContainedItem().equals(elem.getContainerLabel());
			
				elem.setContainerLabelHLAPI(new fr.lip6.move.pnml.ptnet.hlapi.PTArcAnnotationHLAPI(new PtnetFactoryImpl().createPTArcAnnotation()));
				LabelHLAPI totest_ptnet_PTArcAnnotation = elem.getContainerLabelHLAPI();
				assert totest_ptnet_PTArcAnnotation.getContainedItem().equals(elem.getContainerLabel());
			
				elem.setContainerLabelHLAPI(new fr.lip6.move.pnml.ptnet.hlapi.NameHLAPI(new PtnetFactoryImpl().createName()));
				LabelHLAPI totest_ptnet_Name = elem.getContainerLabelHLAPI();
				assert totest_ptnet_Name.getContainedItem().equals(elem.getContainerLabel());
			
		}
	
	

	
		

	//Special getter for list of generics object, return only one object type.
	
	
	
	
	

	//setters/remover for lists.
	

	@Test(groups = { "hlapi", "ToolInfoHLAPI"})
	public void equalsTest(){
		ToolInfo a = new PtnetFactoryImpl().createToolInfo();
		ToolInfo b = new PtnetFactoryImpl().createToolInfo();
		ToolInfoHLAPI aprime = new ToolInfoHLAPI(a);
		ToolInfoHLAPI asecond = new ToolInfoHLAPI(a);
		ToolInfoHLAPI bprime = new ToolInfoHLAPI(b);

		assert aprime.equals(asecond);
		assert !aprime.equals(bprime);
	}

	//cloning method
	//public ToolInfoHLAPI clone(){
	//	return new ToolInfoHLAPI(this);
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
