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
 * $Id ggiffo, Wed Feb 10 14:59:15 CET 2016$
 */
package fr.lip6.move.pnml.pthlpng.hlcorestructure.hlapi;

import fr.lip6.move.pnml.pthlpng.booleans.And;
import fr.lip6.move.pnml.pthlpng.booleans.Bool;
import fr.lip6.move.pnml.pthlpng.booleans.BooleanConstant;
import fr.lip6.move.pnml.pthlpng.booleans.Equality;
import fr.lip6.move.pnml.pthlpng.booleans.Imply;
import fr.lip6.move.pnml.pthlpng.booleans.Inequality;
import fr.lip6.move.pnml.pthlpng.booleans.Not;
import fr.lip6.move.pnml.pthlpng.booleans.Or;

import fr.lip6.move.pnml.pthlpng.booleans.impl.BooleansFactoryImpl;

import fr.lip6.move.pnml.pthlpng.dots.Dot;
import fr.lip6.move.pnml.pthlpng.dots.DotConstant;

import fr.lip6.move.pnml.pthlpng.dots.impl.DotsFactoryImpl;

import fr.lip6.move.pnml.pthlpng.hlcorestructure.AnnotationGraphics;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.AnyObject;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.Condition;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.Declaration;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.HLAnnotation;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.HLMarking;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.Label;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.Name;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.NodeGraphics;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.PNType;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.Page;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.PetriNet;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.PetriNetDoc;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.PnObject;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.ToolInfo;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.Type;

import fr.lip6.move.pnml.pthlpng.hlcorestructure.impl.HlcorestructureFactoryImpl;

import fr.lip6.move.pnml.pthlpng.multisets.All;
import fr.lip6.move.pnml.pthlpng.multisets.Empty;

import fr.lip6.move.pnml.pthlpng.multisets.impl.MultisetsFactoryImpl;

import fr.lip6.move.pnml.pthlpng.partitions.Partition;
import fr.lip6.move.pnml.pthlpng.partitions.PartitionElement;

import fr.lip6.move.pnml.pthlpng.partitions.impl.PartitionsFactoryImpl;

import fr.lip6.move.pnml.pthlpng.terms.MultisetSort;
import fr.lip6.move.pnml.pthlpng.terms.NamedOperator;
import fr.lip6.move.pnml.pthlpng.terms.NamedSort;
import fr.lip6.move.pnml.pthlpng.terms.Operator;
import fr.lip6.move.pnml.pthlpng.terms.ProductSort;
import fr.lip6.move.pnml.pthlpng.terms.Sort;
import fr.lip6.move.pnml.pthlpng.terms.Term;
import fr.lip6.move.pnml.pthlpng.terms.VariableDecl;

import fr.lip6.move.pnml.pthlpng.terms.impl.TermsFactoryImpl;

import java.net.URI;

import java.util.List;

import  fr.lip6.move.pnml.framework.hlapi.*;
import fr.lip6.move.pnml.pthlpng.booleans.hlapi.*;
import fr.lip6.move.pnml.pthlpng.dots.hlapi.*;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.hlapi.*;
import fr.lip6.move.pnml.pthlpng.multisets.hlapi.*;
import fr.lip6.move.pnml.pthlpng.partitions.hlapi.*;
import fr.lip6.move.pnml.pthlpng.terms.hlapi.*;

import java.util.ArrayList;
import java.util.List;
import org.apache.axiom.om.*;
import fr.lip6.move.pnml.framework.utils.IdRefLinker;
import org.eclipse.emf.common.util.DiagnosticChain;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.*;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.impl.*;
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
	    System.out.println("done for "+"ToolInfoHLAPI(hlcorestructure)");
	}


	@BeforeMethod(groups = { "ToolInfoHLAPI", "hlapi" })
	public void setup() throws Exception{
	//ModelRepository.reset(); ModelRepository.getInstance().createDocumentWorkspace("void");
	ModelRepository mr = ModelRepository.getInstance();
	mr.createDocumentWorkspace("void");
	
			itemtool = new String("unid");
			
			itemversion = new String("unid");
			
			itemformattedXMLBuffer = new StringBuffer("0");
			
			itemtoolInfoGrammarURI = new URI("0");
			
			
				
			
		

	
		
		itemcontainerPetriNet = new PetriNetHLAPI(new HlcorestructureFactoryImpl().createPetriNet());
		
	
		
			
			
		itemcontainerPnObject = new fr.lip6.move.pnml.pthlpng.hlcorestructure.hlapi.PageHLAPI(
		   new HlcorestructureFactoryImpl().createPage()
		);
			
		
	
		
			
			
		itemcontainerLabel = new fr.lip6.move.pnml.pthlpng.hlcorestructure.hlapi.NameHLAPI(
		   new HlcorestructureFactoryImpl().createName()
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
	   ToolInfo llapi = new HlcorestructureFactoryImpl().createToolInfo();
	   fr.lip6.move.pnml.pthlpng.hlcorestructure.hlapi.ToolInfoHLAPI hlapi = new ToolInfoHLAPI(llapi);
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
			ToolInfoHLAPI elem = new ToolInfoHLAPI(new HlcorestructureFactoryImpl().createToolInfo());

			
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
			ToolInfoHLAPI elem = new ToolInfoHLAPI(new HlcorestructureFactoryImpl().createToolInfo());

			
				elem.setContainerPnObjectHLAPI(new fr.lip6.move.pnml.pthlpng.hlcorestructure.hlapi.PageHLAPI(new HlcorestructureFactoryImpl().createPage()));
				PnObjectHLAPI totest_hlcorestructure_Page = elem.getContainerPnObjectHLAPI();
				assert totest_hlcorestructure_Page.getContainedItem().equals(elem.getContainerPnObject());
			
				elem.setContainerPnObjectHLAPI(new fr.lip6.move.pnml.pthlpng.hlcorestructure.hlapi.ArcHLAPI(new HlcorestructureFactoryImpl().createArc()));
				PnObjectHLAPI totest_hlcorestructure_Arc = elem.getContainerPnObjectHLAPI();
				assert totest_hlcorestructure_Arc.getContainedItem().equals(elem.getContainerPnObject());
			
				elem.setContainerPnObjectHLAPI(new fr.lip6.move.pnml.pthlpng.hlcorestructure.hlapi.PlaceHLAPI(new HlcorestructureFactoryImpl().createPlace()));
				PnObjectHLAPI totest_hlcorestructure_Place = elem.getContainerPnObjectHLAPI();
				assert totest_hlcorestructure_Place.getContainedItem().equals(elem.getContainerPnObject());
			
				elem.setContainerPnObjectHLAPI(new fr.lip6.move.pnml.pthlpng.hlcorestructure.hlapi.RefTransitionHLAPI(new HlcorestructureFactoryImpl().createRefTransition()));
				PnObjectHLAPI totest_hlcorestructure_RefTransition = elem.getContainerPnObjectHLAPI();
				assert totest_hlcorestructure_RefTransition.getContainedItem().equals(elem.getContainerPnObject());
			
				elem.setContainerPnObjectHLAPI(new fr.lip6.move.pnml.pthlpng.hlcorestructure.hlapi.TransitionHLAPI(new HlcorestructureFactoryImpl().createTransition()));
				PnObjectHLAPI totest_hlcorestructure_Transition = elem.getContainerPnObjectHLAPI();
				assert totest_hlcorestructure_Transition.getContainedItem().equals(elem.getContainerPnObject());
			
				elem.setContainerPnObjectHLAPI(new fr.lip6.move.pnml.pthlpng.hlcorestructure.hlapi.RefPlaceHLAPI(new HlcorestructureFactoryImpl().createRefPlace()));
				PnObjectHLAPI totest_hlcorestructure_RefPlace = elem.getContainerPnObjectHLAPI();
				assert totest_hlcorestructure_RefPlace.getContainedItem().equals(elem.getContainerPnObject());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "ToolInfoHLAPI"})
		public void getContainerLabelHLAPITest(){
			ToolInfoHLAPI elem = new ToolInfoHLAPI(new HlcorestructureFactoryImpl().createToolInfo());

			
				elem.setContainerLabelHLAPI(new fr.lip6.move.pnml.pthlpng.hlcorestructure.hlapi.NameHLAPI(new HlcorestructureFactoryImpl().createName()));
				LabelHLAPI totest_hlcorestructure_Name = elem.getContainerLabelHLAPI();
				assert totest_hlcorestructure_Name.getContainedItem().equals(elem.getContainerLabel());
			
				elem.setContainerLabelHLAPI(new fr.lip6.move.pnml.pthlpng.hlcorestructure.hlapi.TypeHLAPI(new HlcorestructureFactoryImpl().createType()));
				LabelHLAPI totest_hlcorestructure_Type = elem.getContainerLabelHLAPI();
				assert totest_hlcorestructure_Type.getContainedItem().equals(elem.getContainerLabel());
			
				elem.setContainerLabelHLAPI(new fr.lip6.move.pnml.pthlpng.hlcorestructure.hlapi.HLMarkingHLAPI(new HlcorestructureFactoryImpl().createHLMarking()));
				LabelHLAPI totest_hlcorestructure_HLMarking = elem.getContainerLabelHLAPI();
				assert totest_hlcorestructure_HLMarking.getContainedItem().equals(elem.getContainerLabel());
			
				elem.setContainerLabelHLAPI(new fr.lip6.move.pnml.pthlpng.hlcorestructure.hlapi.ConditionHLAPI(new HlcorestructureFactoryImpl().createCondition()));
				LabelHLAPI totest_hlcorestructure_Condition = elem.getContainerLabelHLAPI();
				assert totest_hlcorestructure_Condition.getContainedItem().equals(elem.getContainerLabel());
			
				elem.setContainerLabelHLAPI(new fr.lip6.move.pnml.pthlpng.hlcorestructure.hlapi.HLAnnotationHLAPI(new HlcorestructureFactoryImpl().createHLAnnotation()));
				LabelHLAPI totest_hlcorestructure_HLAnnotation = elem.getContainerLabelHLAPI();
				assert totest_hlcorestructure_HLAnnotation.getContainedItem().equals(elem.getContainerLabel());
			
				elem.setContainerLabelHLAPI(new fr.lip6.move.pnml.pthlpng.hlcorestructure.hlapi.DeclarationHLAPI(new HlcorestructureFactoryImpl().createDeclaration()));
				LabelHLAPI totest_hlcorestructure_Declaration = elem.getContainerLabelHLAPI();
				assert totest_hlcorestructure_Declaration.getContainedItem().equals(elem.getContainerLabel());
			
		}
	
	

	
		

	//Special getter for list of generics object, return only one object type.
	
	
	
	
	

	//setters/remover for lists.
	

	@Test(groups = { "hlapi", "ToolInfoHLAPI"})
	public void equalsTest(){
		ToolInfo a = new HlcorestructureFactoryImpl().createToolInfo();
		ToolInfo b = new HlcorestructureFactoryImpl().createToolInfo();
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
