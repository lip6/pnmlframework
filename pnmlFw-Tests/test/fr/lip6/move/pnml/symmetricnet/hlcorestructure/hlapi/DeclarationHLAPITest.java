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

import java.util.List;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import fr.lip6.move.pnml.framework.utils.ModelRepository;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.Declaration;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.impl.HlcorestructureFactoryImpl;
import fr.lip6.move.pnml.symmetricnet.terms.hlapi.DeclarationsHLAPI;
import fr.lip6.move.pnml.symmetricnet.terms.impl.TermsFactoryImpl;
public class DeclarationHLAPITest {

	
	private AnnotationGraphicsHLAPI itemannotationgraphics;
		
	private String itemtext;
		
	private DeclarationsHLAPI itemstructure;
		
	
	private PetriNetHLAPI itemcontainerDeclarationPetriNet;
	
	private PageHLAPI itemcontainerDeclarationPage;
	


	@AfterTest(groups = { "DeclarationHLAPI", "hlapi" })
	public void After() {
	    System.out.println("done for "+"DeclarationHLAPI(hlcorestructure)");
	}


	@BeforeMethod(groups = { "DeclarationHLAPI", "hlapi" })
	public void setup() throws Exception{
	//ModelRepository.reset(); ModelRepository.getInstance().createDocumentWorkspace("void");
	ModelRepository mr = ModelRepository.getInstance();
	mr.createDocumentWorkspace("void");
	
			
			//HlcorestructureFactoryImpl
			itemannotationgraphics = new AnnotationGraphicsHLAPI(new HlcorestructureFactoryImpl().createAnnotationGraphics());
			
		
			itemtext = "unid";
			
			
			//HlcorestructureFactoryImpl
			itemstructure = new DeclarationsHLAPI(new TermsFactoryImpl().createDeclarations());
			
		

	
		
		itemcontainerDeclarationPetriNet = new PetriNetHLAPI(new HlcorestructureFactoryImpl().createPetriNet());
		
	
		
		itemcontainerDeclarationPage = new PageHLAPI(new HlcorestructureFactoryImpl().createPage());
		
	
	}

	/**
	 * this constructor allows you to set all 'settable' values
	 * excepted container.
	 */
	@Test(groups = { "hlapi", "DeclarationHLAPI"}, dependsOnMethods={"DeclarationHLAPI_LLAPI"})
	public void DeclarationHLAPI_1(){//BEGIN CONSTRUCTOR BODY
   @SuppressWarnings("unused")
	DeclarationHLAPI totest = new DeclarationHLAPI(
		itemannotationgraphics
		,	
		itemtext
		,	
		itemstructure
	);
	
	
	
	assert totest.getAnnotationgraphics().equals(itemannotationgraphics.getContainedItem());
	
	
	
	assert totest.getText().equals(itemtext);
	
	
	
	
	assert totest.getStructure().equals(itemstructure.getContainedItem());
	
	
	}

	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "DeclarationHLAPI"}, dependsOnMethods={"DeclarationHLAPI_LLAPI"})
	public void DeclarationHLAPI_2_containerDeclarationPetriNet(){//BEGIN CONSTRUCTOR BODY

	DeclarationHLAPI totest = new DeclarationHLAPI(
		itemannotationgraphics
		,	
		itemtext
		,	
		itemstructure
	,	
		itemcontainerDeclarationPetriNet
	);
	
	
		
			assert totest.getAnnotationgraphics().equals(itemannotationgraphics.getContainedItem());
		
	
	
			assert totest.getText().equals(itemtext);
		
	
	
		
			assert totest.getStructure().equals(itemstructure.getContainedItem());
		
	
	assert totest.getContainerDeclarationPetriNet().equals(itemcontainerDeclarationPetriNet.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "DeclarationHLAPI"}, dependsOnMethods={"DeclarationHLAPI_LLAPI"})
	public void DeclarationHLAPI_2_containerDeclarationPage(){//BEGIN CONSTRUCTOR BODY

	DeclarationHLAPI totest = new DeclarationHLAPI(
		itemannotationgraphics
		,	
		itemtext
		,	
		itemstructure
	,	
		itemcontainerDeclarationPage
	);
	
	
		
			assert totest.getAnnotationgraphics().equals(itemannotationgraphics.getContainedItem());
		
	
	
			assert totest.getText().equals(itemtext);
		
	
	
		
			assert totest.getStructure().equals(itemstructure.getContainedItem());
		
	
	assert totest.getContainerDeclarationPage().equals(itemcontainerDeclarationPage.getContainedItem());
	}

	/**
    * This constructor give access to required stuff only (not container if any)
    */

	/**
    * This constructor give access to required stuff only (and container)
    */
   @Test(groups = { "hlapi", "DeclarationHLAPI"}, dependsOnMethods={"DeclarationHLAPI_LLAPI"})
	public void DeclarationHLAPI_4_containerDeclarationPetriNet(){//BEGIN CONSTRUCTOR BODY

	DeclarationHLAPI totest = new DeclarationHLAPI(
	  itemcontainerDeclarationPetriNet
	);

	
	assert totest.getContainerDeclarationPetriNet().equals(itemcontainerDeclarationPetriNet.getContainedItem());
	}
	/**
    * This constructor give access to required stuff only (and container)
    */
   @Test(groups = { "hlapi", "DeclarationHLAPI"}, dependsOnMethods={"DeclarationHLAPI_LLAPI"})
	public void DeclarationHLAPI_4_containerDeclarationPage(){//BEGIN CONSTRUCTOR BODY

	DeclarationHLAPI totest = new DeclarationHLAPI(
	  itemcontainerDeclarationPage
	);

	
	assert totest.getContainerDeclarationPage().equals(itemcontainerDeclarationPage.getContainedItem());
	}


	/**
	 * This constructor encapsulate a low level API object in HLAPI.
	 */
	@Test(groups = { "hlapi", "DeclarationHLAPI"})
	public void DeclarationHLAPI_LLAPI(){
	   Declaration llapi = new HlcorestructureFactoryImpl().createDeclaration();
	   fr.lip6.move.pnml.symmetricnet.hlcorestructure.hlapi.DeclarationHLAPI hlapi = new DeclarationHLAPI(llapi);
		assert hlapi.getContainedItem().equals(llapi);
	}

	//getters giving HLAPI object
	

	
		/**
		 * This test add a random number of desired objet in the list or of one of each existing subtypes.
		 * then test how many objet are retuned and if any exist inthe original list.
		 */
		@Test(groups = { "hlapi", "DeclarationHLAPI"})
		public void getToolspecificsHLAPITest(){
			Declaration llapi = new HlcorestructureFactoryImpl().createDeclaration();
			int howmany;
			
			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getToolspecifics().add(new HlcorestructureFactoryImpl().createToolInfo());
			

			DeclarationHLAPI elem = new DeclarationHLAPI(llapi);
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
		@Test(groups = { "hlapi", "DeclarationHLAPI"})
		public void getAnnotationgraphicsHLAPITest(){
			DeclarationHLAPI elem = new DeclarationHLAPI(new HlcorestructureFactoryImpl().createDeclaration());

			
				elem.setAnnotationgraphicsHLAPI(itemannotationgraphics);
				AnnotationGraphicsHLAPI totest = elem.getAnnotationgraphicsHLAPI();
				assert totest.getContainedItem().equals(elem.getAnnotationgraphics());
			
		}
	
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "DeclarationHLAPI"})
		public void getStructureHLAPITest(){
			DeclarationHLAPI elem = new DeclarationHLAPI(new HlcorestructureFactoryImpl().createDeclaration());

			
				elem.setStructureHLAPI(itemstructure);
				DeclarationsHLAPI totest = elem.getStructureHLAPI();
				assert totest.getContainedItem().equals(elem.getStructure());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "DeclarationHLAPI"})
		public void getContainerDeclarationPetriNetHLAPITest(){
			DeclarationHLAPI elem = new DeclarationHLAPI(new HlcorestructureFactoryImpl().createDeclaration());

			
				elem.setContainerDeclarationPetriNetHLAPI(itemcontainerDeclarationPetriNet);
				PetriNetHLAPI totest = elem.getContainerDeclarationPetriNetHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerDeclarationPetriNet());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "DeclarationHLAPI"})
		public void getContainerDeclarationPageHLAPITest(){
			DeclarationHLAPI elem = new DeclarationHLAPI(new HlcorestructureFactoryImpl().createDeclaration());

			
				elem.setContainerDeclarationPageHLAPI(itemcontainerDeclarationPage);
				PageHLAPI totest = elem.getContainerDeclarationPageHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerDeclarationPage());
			
		}
	

	//Special getter for list of generics object, return only one object type.
	
	
	
	
	
	

	//setters/remover for lists.
	
	@Test(groups = { "hlapi", "DeclarationHLAPI"})
	public void addToolspecificsHLAPITest(){
		DeclarationHLAPI elem = new DeclarationHLAPI(new HlcorestructureFactoryImpl().createDeclaration());
		int howmany = (int)(Math.random()*10);
		for(int i =0; i<howmany;i++)
			
			elem.addToolspecificsHLAPI(new ToolInfoHLAPI(new HlcorestructureFactoryImpl().createToolInfo()));
			

		assert elem.getContainedItem().getToolspecifics().size() == howmany;
	}

	@Test(groups = { "hlapi", "DeclarationHLAPI"})
	public void removeToolspecificsTest(){
		DeclarationHLAPI elem = new DeclarationHLAPI(new HlcorestructureFactoryImpl().createDeclaration());
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
	

	@Test(groups = { "hlapi", "DeclarationHLAPI"})
	public void equalsTest(){
		Declaration a = new HlcorestructureFactoryImpl().createDeclaration();
		Declaration b = new HlcorestructureFactoryImpl().createDeclaration();
		DeclarationHLAPI aprime = new DeclarationHLAPI(a);
		DeclarationHLAPI asecond = new DeclarationHLAPI(a);
		DeclarationHLAPI bprime = new DeclarationHLAPI(b);

		assert aprime.equals(asecond);
		assert !aprime.equals(bprime);
	}

	//cloning method
	//public DeclarationHLAPI clone(){
	//	return new DeclarationHLAPI(this);
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
