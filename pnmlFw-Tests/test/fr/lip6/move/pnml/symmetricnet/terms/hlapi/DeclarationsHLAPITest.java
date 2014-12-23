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
 * $Id ggiffo, Tue Dec 23 11:30:47 CET 2014$
 */
package fr.lip6.move.pnml.symmetricnet.terms.hlapi;

import java.util.List;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import fr.lip6.move.pnml.framework.utils.ModelRepository;
import fr.lip6.move.pnml.symmetricnet.finiteEnumerations.impl.FiniteEnumerationsFactoryImpl;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.hlapi.DeclarationHLAPI;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.impl.HlcorestructureFactoryImpl;
import fr.lip6.move.pnml.symmetricnet.partitions.impl.PartitionsFactoryImpl;
import fr.lip6.move.pnml.symmetricnet.terms.Declarations;
import fr.lip6.move.pnml.symmetricnet.terms.impl.TermsFactoryImpl;
public class DeclarationsHLAPITest {

	
	
	private DeclarationHLAPI itemcontainerDeclaration;
	


	@AfterTest(groups = { "DeclarationsHLAPI", "hlapi" })
	public void After() {
	    System.out.println("done for "+"DeclarationsHLAPI(terms)");
	}


	@BeforeMethod(groups = { "DeclarationsHLAPI", "hlapi" })
	public void setup() throws Exception{
	//ModelRepository.reset(); ModelRepository.getInstance().createDocumentWorkspace("void");
	ModelRepository mr = ModelRepository.getInstance();
	mr.createDocumentWorkspace("void");
	

	
		
		itemcontainerDeclaration = new DeclarationHLAPI(new HlcorestructureFactoryImpl().createDeclaration());
		
	
	}

	/**
	 * this constructor allows you to set all 'settable' values
	 * excepted container.
	 */
	@Test(groups = { "hlapi", "DeclarationsHLAPI"}, dependsOnMethods={"DeclarationsHLAPI_LLAPI"})
	public void DeclarationsHLAPI_1(){//BEGIN CONSTRUCTOR BODY
   @SuppressWarnings("unused")
	DeclarationsHLAPI totest = new DeclarationsHLAPI();
	
	}

	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "DeclarationsHLAPI"}, dependsOnMethods={"DeclarationsHLAPI_LLAPI"})
	public void DeclarationsHLAPI_2_containerDeclaration(){//BEGIN CONSTRUCTOR BODY

	DeclarationsHLAPI totest = new DeclarationsHLAPI(
		itemcontainerDeclaration
	);
	
	assert totest.getContainerDeclaration().equals(itemcontainerDeclaration.getContainedItem());
	}

	/**
    * This constructor give access to required stuff only (not container if any)
    */



	/**
	 * This constructor encapsulate a low level API object in HLAPI.
	 */
	@Test(groups = { "hlapi", "DeclarationsHLAPI"})
	public void DeclarationsHLAPI_LLAPI(){
	   Declarations llapi = new TermsFactoryImpl().createDeclarations();
	   fr.lip6.move.pnml.symmetricnet.terms.hlapi.DeclarationsHLAPI hlapi = new DeclarationsHLAPI(llapi);
		assert hlapi.getContainedItem().equals(llapi);
	}

	//getters giving HLAPI object
	

	
		/**
		 * This test add a random number of desired objet in the list or of one of each existing subtypes.
		 * then test how many objet are retuned and if any exist inthe original list.
		 */
		@Test(groups = { "hlapi", "DeclarationsHLAPI"})
		public void getDeclarationHLAPITest(){
			Declarations llapi = new TermsFactoryImpl().createDeclarations();
			int howmany;
			
			llapi.getDeclaration().add(
			   new TermsFactoryImpl().createVariableDecl()
			);
			
			llapi.getDeclaration().add(
			   new TermsFactoryImpl().createNamedSort()
			);
			
			llapi.getDeclaration().add(
			   new TermsFactoryImpl().createNamedOperator()
			);
			
			llapi.getDeclaration().add(
			   new FiniteEnumerationsFactoryImpl().createFEConstant()
			);
			
			llapi.getDeclaration().add(
			   new PartitionsFactoryImpl().createPartition()
			);
			
			llapi.getDeclaration().add(
			   new PartitionsFactoryImpl().createPartitionElement()
			);
			
			howmany = 6;
			

			DeclarationsHLAPI elem = new DeclarationsHLAPI(llapi);
			List<TermsDeclarationHLAPI> totest = elem.getDeclarationHLAPI();

			assert totest.size() == howmany;

			for (TermsDeclarationHLAPI unit : totest) {
             assert llapi.getDeclaration().contains(unit.getContainedItem()) : "missing element";
         }
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "DeclarationsHLAPI"})
		public void getContainerDeclarationHLAPITest(){
			DeclarationsHLAPI elem = new DeclarationsHLAPI(new TermsFactoryImpl().createDeclarations());

			
				elem.setContainerDeclarationHLAPI(itemcontainerDeclaration);
				DeclarationHLAPI totest = elem.getContainerDeclarationHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerDeclaration());
			
		}
	

	//Special getter for list of generics object, return only one object type.
	
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "DeclarationsHLAPI"})
		public void getDeclaration_terms_VariableDeclHLAPITest(){
			Declarations llapi = new TermsFactoryImpl().createDeclarations();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getDeclaration().add(new TermsFactoryImpl().createVariableDecl());
			
			llapi.getDeclaration().add(
			   new TermsFactoryImpl().createVariableDecl()
			);
			
			llapi.getDeclaration().add(
			   new TermsFactoryImpl().createNamedSort()
			);
			
			llapi.getDeclaration().add(
			   new TermsFactoryImpl().createNamedOperator()
			);
			
			llapi.getDeclaration().add(
			   new FiniteEnumerationsFactoryImpl().createFEConstant()
			);
			
			llapi.getDeclaration().add(
			   new PartitionsFactoryImpl().createPartition()
			);
			
			llapi.getDeclaration().add(
			   new PartitionsFactoryImpl().createPartitionElement()
			);
			
			howmany += 6;

			DeclarationsHLAPI elem = new DeclarationsHLAPI(llapi);
			List<fr.lip6.move.pnml.symmetricnet.terms.hlapi.VariableDeclHLAPI> totest = elem.getDeclaration_terms_VariableDeclHLAPI();

			assert totest.size() == howmany + 1 - 6;

			for (TermsDeclarationHLAPI unit : totest) {
             assert llapi.getDeclaration().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "DeclarationsHLAPI"})
		public void getDeclaration_terms_NamedSortHLAPITest(){
			Declarations llapi = new TermsFactoryImpl().createDeclarations();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getDeclaration().add(new TermsFactoryImpl().createNamedSort());
			
			llapi.getDeclaration().add(
			   new TermsFactoryImpl().createVariableDecl()
			);
			
			llapi.getDeclaration().add(
			   new TermsFactoryImpl().createNamedSort()
			);
			
			llapi.getDeclaration().add(
			   new TermsFactoryImpl().createNamedOperator()
			);
			
			llapi.getDeclaration().add(
			   new FiniteEnumerationsFactoryImpl().createFEConstant()
			);
			
			llapi.getDeclaration().add(
			   new PartitionsFactoryImpl().createPartition()
			);
			
			llapi.getDeclaration().add(
			   new PartitionsFactoryImpl().createPartitionElement()
			);
			
			howmany += 6;

			DeclarationsHLAPI elem = new DeclarationsHLAPI(llapi);
			List<fr.lip6.move.pnml.symmetricnet.terms.hlapi.NamedSortHLAPI> totest = elem.getDeclaration_terms_NamedSortHLAPI();

			assert totest.size() == howmany + 1 - 6;

			for (TermsDeclarationHLAPI unit : totest) {
             assert llapi.getDeclaration().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "DeclarationsHLAPI"})
		public void getDeclaration_terms_NamedOperatorHLAPITest(){
			Declarations llapi = new TermsFactoryImpl().createDeclarations();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getDeclaration().add(new TermsFactoryImpl().createNamedOperator());
			
			llapi.getDeclaration().add(
			   new TermsFactoryImpl().createVariableDecl()
			);
			
			llapi.getDeclaration().add(
			   new TermsFactoryImpl().createNamedSort()
			);
			
			llapi.getDeclaration().add(
			   new TermsFactoryImpl().createNamedOperator()
			);
			
			llapi.getDeclaration().add(
			   new FiniteEnumerationsFactoryImpl().createFEConstant()
			);
			
			llapi.getDeclaration().add(
			   new PartitionsFactoryImpl().createPartition()
			);
			
			llapi.getDeclaration().add(
			   new PartitionsFactoryImpl().createPartitionElement()
			);
			
			howmany += 6;

			DeclarationsHLAPI elem = new DeclarationsHLAPI(llapi);
			List<fr.lip6.move.pnml.symmetricnet.terms.hlapi.NamedOperatorHLAPI> totest = elem.getDeclaration_terms_NamedOperatorHLAPI();

			assert totest.size() == howmany + 1 - 6;

			for (TermsDeclarationHLAPI unit : totest) {
             assert llapi.getDeclaration().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "DeclarationsHLAPI"})
		public void getDeclaration_finiteEnumerations_FEConstantHLAPITest(){
			Declarations llapi = new TermsFactoryImpl().createDeclarations();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getDeclaration().add(new FiniteEnumerationsFactoryImpl().createFEConstant());
			
			llapi.getDeclaration().add(
			   new TermsFactoryImpl().createVariableDecl()
			);
			
			llapi.getDeclaration().add(
			   new TermsFactoryImpl().createNamedSort()
			);
			
			llapi.getDeclaration().add(
			   new TermsFactoryImpl().createNamedOperator()
			);
			
			llapi.getDeclaration().add(
			   new FiniteEnumerationsFactoryImpl().createFEConstant()
			);
			
			llapi.getDeclaration().add(
			   new PartitionsFactoryImpl().createPartition()
			);
			
			llapi.getDeclaration().add(
			   new PartitionsFactoryImpl().createPartitionElement()
			);
			
			howmany += 6;

			DeclarationsHLAPI elem = new DeclarationsHLAPI(llapi);
			List<fr.lip6.move.pnml.symmetricnet.finiteEnumerations.hlapi.FEConstantHLAPI> totest = elem.getDeclaration_finiteEnumerations_FEConstantHLAPI();

			assert totest.size() == howmany + 1 - 6;

			for (TermsDeclarationHLAPI unit : totest) {
             assert llapi.getDeclaration().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "DeclarationsHLAPI"})
		public void getDeclaration_partitions_PartitionHLAPITest(){
			Declarations llapi = new TermsFactoryImpl().createDeclarations();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getDeclaration().add(new PartitionsFactoryImpl().createPartition());
			
			llapi.getDeclaration().add(
			   new TermsFactoryImpl().createVariableDecl()
			);
			
			llapi.getDeclaration().add(
			   new TermsFactoryImpl().createNamedSort()
			);
			
			llapi.getDeclaration().add(
			   new TermsFactoryImpl().createNamedOperator()
			);
			
			llapi.getDeclaration().add(
			   new FiniteEnumerationsFactoryImpl().createFEConstant()
			);
			
			llapi.getDeclaration().add(
			   new PartitionsFactoryImpl().createPartition()
			);
			
			llapi.getDeclaration().add(
			   new PartitionsFactoryImpl().createPartitionElement()
			);
			
			howmany += 6;

			DeclarationsHLAPI elem = new DeclarationsHLAPI(llapi);
			List<fr.lip6.move.pnml.symmetricnet.partitions.hlapi.PartitionHLAPI> totest = elem.getDeclaration_partitions_PartitionHLAPI();

			assert totest.size() == howmany + 1 - 6;

			for (TermsDeclarationHLAPI unit : totest) {
             assert llapi.getDeclaration().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "DeclarationsHLAPI"})
		public void getDeclaration_partitions_PartitionElementHLAPITest(){
			Declarations llapi = new TermsFactoryImpl().createDeclarations();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getDeclaration().add(new PartitionsFactoryImpl().createPartitionElement());
			
			llapi.getDeclaration().add(
			   new TermsFactoryImpl().createVariableDecl()
			);
			
			llapi.getDeclaration().add(
			   new TermsFactoryImpl().createNamedSort()
			);
			
			llapi.getDeclaration().add(
			   new TermsFactoryImpl().createNamedOperator()
			);
			
			llapi.getDeclaration().add(
			   new FiniteEnumerationsFactoryImpl().createFEConstant()
			);
			
			llapi.getDeclaration().add(
			   new PartitionsFactoryImpl().createPartition()
			);
			
			llapi.getDeclaration().add(
			   new PartitionsFactoryImpl().createPartitionElement()
			);
			
			howmany += 6;

			DeclarationsHLAPI elem = new DeclarationsHLAPI(llapi);
			List<fr.lip6.move.pnml.symmetricnet.partitions.hlapi.PartitionElementHLAPI> totest = elem.getDeclaration_partitions_PartitionElementHLAPI();

			assert totest.size() == howmany + 1 - 6;

			for (TermsDeclarationHLAPI unit : totest) {
             assert llapi.getDeclaration().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
	
	
	

	//setters/remover for lists.
	
	@Test(groups = { "hlapi", "DeclarationsHLAPI"})
	public void addDeclarationHLAPITest(){
		DeclarationsHLAPI elem = new DeclarationsHLAPI(new TermsFactoryImpl().createDeclarations());
		int howmany = (int)(Math.random()*10);
		for(int i =0; i<howmany;i++)
			
			elem.addDeclarationHLAPI(
				new VariableDeclHLAPI(
					new TermsFactoryImpl().createVariableDecl()
				)
			);
			

		assert elem.getContainedItem().getDeclaration().size() == howmany;
	}

	@Test(groups = { "hlapi", "DeclarationsHLAPI"})
	public void removeDeclarationTest(){
		DeclarationsHLAPI elem = new DeclarationsHLAPI(new TermsFactoryImpl().createDeclarations());
		int howmany = (int)(Math.random()*10);
		int howdiff = (int)(Math.random()*10);

			
			VariableDeclHLAPI sav;
			

		for(int i =0; i<(howmany);i++)
			
			elem.addDeclarationHLAPI(
				new VariableDeclHLAPI(
				  new TermsFactoryImpl().createVariableDecl()
				)
			);
			


		
		sav =
			new VariableDeclHLAPI(
			  new TermsFactoryImpl().createVariableDecl()
			);
		

		elem.addDeclarationHLAPI(sav);
		assert elem.getContainedItem().getDeclaration().size() == howmany+1;

		for(int i =0; i<(howdiff);i++)
			
			elem.addDeclarationHLAPI(
				new VariableDeclHLAPI(
				  new TermsFactoryImpl().createVariableDecl()
				)
			);
			


		elem.removeDeclarationHLAPI(sav);

		assert elem.getContainedItem().getDeclaration().size() == howmany+howdiff;
	}
	

	@Test(groups = { "hlapi", "DeclarationsHLAPI"})
	public void equalsTest(){
		Declarations a = new TermsFactoryImpl().createDeclarations();
		Declarations b = new TermsFactoryImpl().createDeclarations();
		DeclarationsHLAPI aprime = new DeclarationsHLAPI(a);
		DeclarationsHLAPI asecond = new DeclarationsHLAPI(a);
		DeclarationsHLAPI bprime = new DeclarationsHLAPI(b);

		assert aprime.equals(asecond);
		assert !aprime.equals(bprime);
	}

	//cloning method
	//public DeclarationsHLAPI clone(){
	//	return new DeclarationsHLAPI(this);
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
