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
 * $Id ggiffo, Thu Feb 11 16:30:27 CET 2016$
 */
package fr.lip6.move.pnml.pthlpng.partitions.hlapi;

import java.util.List;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import fr.lip6.move.pnml.framework.utils.ModelRepository;
import fr.lip6.move.pnml.framework.utils.exception.InvalidIDException;
import fr.lip6.move.pnml.framework.utils.exception.VoidRepositoryException;
import fr.lip6.move.pnml.pthlpng.booleans.impl.BooleansFactoryImpl;
import fr.lip6.move.pnml.pthlpng.dots.impl.DotsFactoryImpl;
import fr.lip6.move.pnml.pthlpng.integers.impl.IntegersFactoryImpl;
import fr.lip6.move.pnml.pthlpng.multisets.impl.MultisetsFactoryImpl;
import fr.lip6.move.pnml.pthlpng.partitions.PartitionElement;
import fr.lip6.move.pnml.pthlpng.partitions.impl.PartitionsFactoryImpl;
import fr.lip6.move.pnml.pthlpng.terms.hlapi.DeclarationsHLAPI;
import fr.lip6.move.pnml.pthlpng.terms.hlapi.TermHLAPI;
import fr.lip6.move.pnml.pthlpng.terms.impl.TermsFactoryImpl;
public class PartitionElementHLAPITest {

	
	private String itemid;
		
	private String itemname;
		
	
	private DeclarationsHLAPI itemcontainerDeclarations;
	
	private PartitionHLAPI itemrefpartition;
	


	@AfterTest(groups = { "PartitionElementHLAPI", "hlapi" })
	public void After() {
	    System.out.println("done for "+"PartitionElementHLAPI(partitions)");
	}


	@BeforeMethod(groups = { "PartitionElementHLAPI", "hlapi" })
	public void setup() throws Exception{
	//ModelRepository.reset(); ModelRepository.getInstance().createDocumentWorkspace("void");
	ModelRepository mr = ModelRepository.getInstance();
	mr.createDocumentWorkspace("void");
	
			itemid = "unid";
			
			itemname = "unid";
			

	
		
		itemcontainerDeclarations = new DeclarationsHLAPI(new TermsFactoryImpl().createDeclarations());
		
	
		
		itemrefpartition = new PartitionHLAPI(new PartitionsFactoryImpl().createPartition());
		
	
	}

	/**
	 * this constructor allows you to set all 'settable' values
	 * excepted container.
	 */
	@Test(groups = { "hlapi", "PartitionElementHLAPI"}, dependsOnMethods={"PartitionElementHLAPI_LLAPI"})
	public void PartitionElementHLAPI_1() throws InvalidIDException ,VoidRepositoryException   {//BEGIN CONSTRUCTOR BODY
   @SuppressWarnings("unused")
	PartitionElementHLAPI totest = new PartitionElementHLAPI(
		itemid
		,	
		itemname
	);
	
	
	assert totest.getId().equals(itemid);
	
	
	
	assert totest.getName().equals(itemname);
	
	
	}

	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "PartitionElementHLAPI"}, dependsOnMethods={"PartitionElementHLAPI_LLAPI"})
	public void PartitionElementHLAPI_2_containerDeclarations() throws InvalidIDException ,VoidRepositoryException   {//BEGIN CONSTRUCTOR BODY

	PartitionElementHLAPI totest = new PartitionElementHLAPI(
		itemid
		,	
		itemname
	,	
		itemcontainerDeclarations
	);
	
	
			assert totest.getId().equals(itemid);
		
	
	
			assert totest.getName().equals(itemname);
		
	
	assert totest.getContainerDeclarations().equals(itemcontainerDeclarations.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "PartitionElementHLAPI"}, dependsOnMethods={"PartitionElementHLAPI_LLAPI"})
	public void PartitionElementHLAPI_2_refpartition() throws InvalidIDException ,VoidRepositoryException   {//BEGIN CONSTRUCTOR BODY

	PartitionElementHLAPI totest = new PartitionElementHLAPI(
		itemid
		,	
		itemname
	,	
		itemrefpartition
	);
	
	
			assert totest.getId().equals(itemid);
		
	
	
			assert totest.getName().equals(itemname);
		
	
	assert totest.getRefpartition().equals(itemrefpartition.getContainedItem());
	}

	/**
    * This constructor give access to required stuff only (not container if any)
    */



	/**
	 * This constructor encapsulate a low level API object in HLAPI.
	 */
	@Test(groups = { "hlapi", "PartitionElementHLAPI"})
	public void PartitionElementHLAPI_LLAPI(){
	   PartitionElement llapi = new PartitionsFactoryImpl().createPartitionElement();
	   fr.lip6.move.pnml.pthlpng.partitions.hlapi.PartitionElementHLAPI hlapi = new PartitionElementHLAPI(llapi);
		assert hlapi.getContainedItem().equals(llapi);
	}

	//getters giving HLAPI object
	
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "PartitionElementHLAPI"})
		public void getContainerDeclarationsHLAPITest(){
			PartitionElementHLAPI elem = new PartitionElementHLAPI(new PartitionsFactoryImpl().createPartitionElement());

			
				elem.setContainerDeclarationsHLAPI(itemcontainerDeclarations);
				DeclarationsHLAPI totest = elem.getContainerDeclarationsHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerDeclarations());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "PartitionElementHLAPI"})
		public void getRefpartitionHLAPITest(){
			PartitionElementHLAPI elem = new PartitionElementHLAPI(new PartitionsFactoryImpl().createPartitionElement());

			
				elem.setRefpartitionHLAPI(itemrefpartition);
				PartitionHLAPI totest = elem.getRefpartitionHLAPI();
				assert totest.getContainedItem().equals(elem.getRefpartition());
			
		}
	
	

	
		/**
		 * This test add a random number of desired objet in the list or of one of each existing subtypes.
		 * then test how many objet are retuned and if any exist inthe original list.
		 */
		@Test(groups = { "hlapi", "PartitionElementHLAPI"})
		public void getPartitionelementconstantsHLAPITest(){
			PartitionElement llapi = new PartitionsFactoryImpl().createPartitionElement();
			int howmany;
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getPartitionelementconstants().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createNumberConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createAddition()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createSubtraction()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createMultiplication()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createDivision()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createModulo()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany = 33;
			

			PartitionElementHLAPI elem = new PartitionElementHLAPI(llapi);
			List<TermHLAPI> totest = elem.getPartitionelementconstantsHLAPI();

			assert totest.size() == howmany;

			for (TermHLAPI unit : totest) {
             assert llapi.getPartitionelementconstants().contains(unit.getContainedItem()) : "missing element";
         }
		}
	

	//Special getter for list of generics object, return only one object type.
	
	
	
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "PartitionElementHLAPI"})
		public void getPartitionelementconstants_partitions_GreaterThanHLAPITest(){
			PartitionElement llapi = new PartitionsFactoryImpl().createPartitionElement();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getPartitionelementconstants().add(new PartitionsFactoryImpl().createGreaterThan());
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getPartitionelementconstants().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createNumberConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createAddition()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createSubtraction()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createMultiplication()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createDivision()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createModulo()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 33;

			PartitionElementHLAPI elem = new PartitionElementHLAPI(llapi);
			List<fr.lip6.move.pnml.pthlpng.partitions.hlapi.GreaterThanHLAPI> totest = elem.getPartitionelementconstants_partitions_GreaterThanHLAPI();

			assert totest.size() == howmany + 1 - 33;

			for (TermHLAPI unit : totest) {
             assert llapi.getPartitionelementconstants().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "PartitionElementHLAPI"})
		public void getPartitionelementconstants_partitions_PartitionElementOfHLAPITest(){
			PartitionElement llapi = new PartitionsFactoryImpl().createPartitionElement();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getPartitionelementconstants().add(new PartitionsFactoryImpl().createPartitionElementOf());
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getPartitionelementconstants().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createNumberConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createAddition()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createSubtraction()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createMultiplication()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createDivision()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createModulo()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 33;

			PartitionElementHLAPI elem = new PartitionElementHLAPI(llapi);
			List<fr.lip6.move.pnml.pthlpng.partitions.hlapi.PartitionElementOfHLAPI> totest = elem.getPartitionelementconstants_partitions_PartitionElementOfHLAPI();

			assert totest.size() == howmany + 1 - 33;

			for (TermHLAPI unit : totest) {
             assert llapi.getPartitionelementconstants().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "PartitionElementHLAPI"})
		public void getPartitionelementconstants_partitions_LessThanHLAPITest(){
			PartitionElement llapi = new PartitionsFactoryImpl().createPartitionElement();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getPartitionelementconstants().add(new PartitionsFactoryImpl().createLessThan());
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getPartitionelementconstants().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createNumberConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createAddition()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createSubtraction()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createMultiplication()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createDivision()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createModulo()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 33;

			PartitionElementHLAPI elem = new PartitionElementHLAPI(llapi);
			List<fr.lip6.move.pnml.pthlpng.partitions.hlapi.LessThanHLAPI> totest = elem.getPartitionelementconstants_partitions_LessThanHLAPI();

			assert totest.size() == howmany + 1 - 33;

			for (TermHLAPI unit : totest) {
             assert llapi.getPartitionelementconstants().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "PartitionElementHLAPI"})
		public void getPartitionelementconstants_booleans_EqualityHLAPITest(){
			PartitionElement llapi = new PartitionsFactoryImpl().createPartitionElement();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getPartitionelementconstants().add(new BooleansFactoryImpl().createEquality());
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getPartitionelementconstants().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createNumberConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createAddition()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createSubtraction()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createMultiplication()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createDivision()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createModulo()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 33;

			PartitionElementHLAPI elem = new PartitionElementHLAPI(llapi);
			List<fr.lip6.move.pnml.pthlpng.booleans.hlapi.EqualityHLAPI> totest = elem.getPartitionelementconstants_booleans_EqualityHLAPI();

			assert totest.size() == howmany + 1 - 33;

			for (TermHLAPI unit : totest) {
             assert llapi.getPartitionelementconstants().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "PartitionElementHLAPI"})
		public void getPartitionelementconstants_booleans_InequalityHLAPITest(){
			PartitionElement llapi = new PartitionsFactoryImpl().createPartitionElement();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getPartitionelementconstants().add(new BooleansFactoryImpl().createInequality());
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getPartitionelementconstants().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createNumberConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createAddition()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createSubtraction()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createMultiplication()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createDivision()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createModulo()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 33;

			PartitionElementHLAPI elem = new PartitionElementHLAPI(llapi);
			List<fr.lip6.move.pnml.pthlpng.booleans.hlapi.InequalityHLAPI> totest = elem.getPartitionelementconstants_booleans_InequalityHLAPI();

			assert totest.size() == howmany + 1 - 33;

			for (TermHLAPI unit : totest) {
             assert llapi.getPartitionelementconstants().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "PartitionElementHLAPI"})
		public void getPartitionelementconstants_booleans_BooleanConstantHLAPITest(){
			PartitionElement llapi = new PartitionsFactoryImpl().createPartitionElement();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getPartitionelementconstants().add(new BooleansFactoryImpl().createBooleanConstant());
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getPartitionelementconstants().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createNumberConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createAddition()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createSubtraction()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createMultiplication()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createDivision()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createModulo()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 33;

			PartitionElementHLAPI elem = new PartitionElementHLAPI(llapi);
			List<fr.lip6.move.pnml.pthlpng.booleans.hlapi.BooleanConstantHLAPI> totest = elem.getPartitionelementconstants_booleans_BooleanConstantHLAPI();

			assert totest.size() == howmany + 1 - 33;

			for (TermHLAPI unit : totest) {
             assert llapi.getPartitionelementconstants().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "PartitionElementHLAPI"})
		public void getPartitionelementconstants_booleans_OrHLAPITest(){
			PartitionElement llapi = new PartitionsFactoryImpl().createPartitionElement();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getPartitionelementconstants().add(new BooleansFactoryImpl().createOr());
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getPartitionelementconstants().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createNumberConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createAddition()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createSubtraction()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createMultiplication()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createDivision()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createModulo()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 33;

			PartitionElementHLAPI elem = new PartitionElementHLAPI(llapi);
			List<fr.lip6.move.pnml.pthlpng.booleans.hlapi.OrHLAPI> totest = elem.getPartitionelementconstants_booleans_OrHLAPI();

			assert totest.size() == howmany + 1 - 33;

			for (TermHLAPI unit : totest) {
             assert llapi.getPartitionelementconstants().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "PartitionElementHLAPI"})
		public void getPartitionelementconstants_booleans_AndHLAPITest(){
			PartitionElement llapi = new PartitionsFactoryImpl().createPartitionElement();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getPartitionelementconstants().add(new BooleansFactoryImpl().createAnd());
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getPartitionelementconstants().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createNumberConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createAddition()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createSubtraction()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createMultiplication()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createDivision()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createModulo()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 33;

			PartitionElementHLAPI elem = new PartitionElementHLAPI(llapi);
			List<fr.lip6.move.pnml.pthlpng.booleans.hlapi.AndHLAPI> totest = elem.getPartitionelementconstants_booleans_AndHLAPI();

			assert totest.size() == howmany + 1 - 33;

			for (TermHLAPI unit : totest) {
             assert llapi.getPartitionelementconstants().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "PartitionElementHLAPI"})
		public void getPartitionelementconstants_booleans_ImplyHLAPITest(){
			PartitionElement llapi = new PartitionsFactoryImpl().createPartitionElement();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getPartitionelementconstants().add(new BooleansFactoryImpl().createImply());
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getPartitionelementconstants().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createNumberConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createAddition()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createSubtraction()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createMultiplication()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createDivision()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createModulo()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 33;

			PartitionElementHLAPI elem = new PartitionElementHLAPI(llapi);
			List<fr.lip6.move.pnml.pthlpng.booleans.hlapi.ImplyHLAPI> totest = elem.getPartitionelementconstants_booleans_ImplyHLAPI();

			assert totest.size() == howmany + 1 - 33;

			for (TermHLAPI unit : totest) {
             assert llapi.getPartitionelementconstants().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "PartitionElementHLAPI"})
		public void getPartitionelementconstants_booleans_NotHLAPITest(){
			PartitionElement llapi = new PartitionsFactoryImpl().createPartitionElement();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getPartitionelementconstants().add(new BooleansFactoryImpl().createNot());
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getPartitionelementconstants().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createNumberConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createAddition()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createSubtraction()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createMultiplication()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createDivision()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createModulo()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 33;

			PartitionElementHLAPI elem = new PartitionElementHLAPI(llapi);
			List<fr.lip6.move.pnml.pthlpng.booleans.hlapi.NotHLAPI> totest = elem.getPartitionelementconstants_booleans_NotHLAPI();

			assert totest.size() == howmany + 1 - 33;

			for (TermHLAPI unit : totest) {
             assert llapi.getPartitionelementconstants().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "PartitionElementHLAPI"})
		public void getPartitionelementconstants_dots_DotConstantHLAPITest(){
			PartitionElement llapi = new PartitionsFactoryImpl().createPartitionElement();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getPartitionelementconstants().add(new DotsFactoryImpl().createDotConstant());
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getPartitionelementconstants().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createNumberConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createAddition()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createSubtraction()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createMultiplication()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createDivision()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createModulo()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 33;

			PartitionElementHLAPI elem = new PartitionElementHLAPI(llapi);
			List<fr.lip6.move.pnml.pthlpng.dots.hlapi.DotConstantHLAPI> totest = elem.getPartitionelementconstants_dots_DotConstantHLAPI();

			assert totest.size() == howmany + 1 - 33;

			for (TermHLAPI unit : totest) {
             assert llapi.getPartitionelementconstants().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "PartitionElementHLAPI"})
		public void getPartitionelementconstants_integers_NumberConstantHLAPITest(){
			PartitionElement llapi = new PartitionsFactoryImpl().createPartitionElement();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getPartitionelementconstants().add(new IntegersFactoryImpl().createNumberConstant());
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getPartitionelementconstants().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createNumberConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createAddition()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createSubtraction()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createMultiplication()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createDivision()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createModulo()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 33;

			PartitionElementHLAPI elem = new PartitionElementHLAPI(llapi);
			List<fr.lip6.move.pnml.pthlpng.integers.hlapi.NumberConstantHLAPI> totest = elem.getPartitionelementconstants_integers_NumberConstantHLAPI();

			assert totest.size() == howmany + 1 - 33;

			for (TermHLAPI unit : totest) {
             assert llapi.getPartitionelementconstants().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "PartitionElementHLAPI"})
		public void getPartitionelementconstants_integers_AdditionHLAPITest(){
			PartitionElement llapi = new PartitionsFactoryImpl().createPartitionElement();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getPartitionelementconstants().add(new IntegersFactoryImpl().createAddition());
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getPartitionelementconstants().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createNumberConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createAddition()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createSubtraction()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createMultiplication()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createDivision()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createModulo()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 33;

			PartitionElementHLAPI elem = new PartitionElementHLAPI(llapi);
			List<fr.lip6.move.pnml.pthlpng.integers.hlapi.AdditionHLAPI> totest = elem.getPartitionelementconstants_integers_AdditionHLAPI();

			assert totest.size() == howmany + 1 - 33;

			for (TermHLAPI unit : totest) {
             assert llapi.getPartitionelementconstants().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "PartitionElementHLAPI"})
		public void getPartitionelementconstants_integers_SubtractionHLAPITest(){
			PartitionElement llapi = new PartitionsFactoryImpl().createPartitionElement();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getPartitionelementconstants().add(new IntegersFactoryImpl().createSubtraction());
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getPartitionelementconstants().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createNumberConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createAddition()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createSubtraction()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createMultiplication()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createDivision()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createModulo()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 33;

			PartitionElementHLAPI elem = new PartitionElementHLAPI(llapi);
			List<fr.lip6.move.pnml.pthlpng.integers.hlapi.SubtractionHLAPI> totest = elem.getPartitionelementconstants_integers_SubtractionHLAPI();

			assert totest.size() == howmany + 1 - 33;

			for (TermHLAPI unit : totest) {
             assert llapi.getPartitionelementconstants().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "PartitionElementHLAPI"})
		public void getPartitionelementconstants_integers_MultiplicationHLAPITest(){
			PartitionElement llapi = new PartitionsFactoryImpl().createPartitionElement();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getPartitionelementconstants().add(new IntegersFactoryImpl().createMultiplication());
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getPartitionelementconstants().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createNumberConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createAddition()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createSubtraction()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createMultiplication()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createDivision()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createModulo()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 33;

			PartitionElementHLAPI elem = new PartitionElementHLAPI(llapi);
			List<fr.lip6.move.pnml.pthlpng.integers.hlapi.MultiplicationHLAPI> totest = elem.getPartitionelementconstants_integers_MultiplicationHLAPI();

			assert totest.size() == howmany + 1 - 33;

			for (TermHLAPI unit : totest) {
             assert llapi.getPartitionelementconstants().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "PartitionElementHLAPI"})
		public void getPartitionelementconstants_integers_DivisionHLAPITest(){
			PartitionElement llapi = new PartitionsFactoryImpl().createPartitionElement();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getPartitionelementconstants().add(new IntegersFactoryImpl().createDivision());
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getPartitionelementconstants().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createNumberConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createAddition()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createSubtraction()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createMultiplication()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createDivision()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createModulo()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 33;

			PartitionElementHLAPI elem = new PartitionElementHLAPI(llapi);
			List<fr.lip6.move.pnml.pthlpng.integers.hlapi.DivisionHLAPI> totest = elem.getPartitionelementconstants_integers_DivisionHLAPI();

			assert totest.size() == howmany + 1 - 33;

			for (TermHLAPI unit : totest) {
             assert llapi.getPartitionelementconstants().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "PartitionElementHLAPI"})
		public void getPartitionelementconstants_integers_ModuloHLAPITest(){
			PartitionElement llapi = new PartitionsFactoryImpl().createPartitionElement();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getPartitionelementconstants().add(new IntegersFactoryImpl().createModulo());
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getPartitionelementconstants().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createNumberConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createAddition()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createSubtraction()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createMultiplication()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createDivision()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createModulo()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 33;

			PartitionElementHLAPI elem = new PartitionElementHLAPI(llapi);
			List<fr.lip6.move.pnml.pthlpng.integers.hlapi.ModuloHLAPI> totest = elem.getPartitionelementconstants_integers_ModuloHLAPI();

			assert totest.size() == howmany + 1 - 33;

			for (TermHLAPI unit : totest) {
             assert llapi.getPartitionelementconstants().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "PartitionElementHLAPI"})
		public void getPartitionelementconstants_integers_GreaterThanHLAPITest(){
			PartitionElement llapi = new PartitionsFactoryImpl().createPartitionElement();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getPartitionelementconstants().add(new IntegersFactoryImpl().createGreaterThan());
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getPartitionelementconstants().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createNumberConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createAddition()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createSubtraction()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createMultiplication()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createDivision()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createModulo()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 33;

			PartitionElementHLAPI elem = new PartitionElementHLAPI(llapi);
			List<fr.lip6.move.pnml.pthlpng.integers.hlapi.GreaterThanHLAPI> totest = elem.getPartitionelementconstants_integers_GreaterThanHLAPI();

			assert totest.size() == howmany + 1 - 33;

			for (TermHLAPI unit : totest) {
             assert llapi.getPartitionelementconstants().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "PartitionElementHLAPI"})
		public void getPartitionelementconstants_integers_GreaterThanOrEqualHLAPITest(){
			PartitionElement llapi = new PartitionsFactoryImpl().createPartitionElement();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getPartitionelementconstants().add(new IntegersFactoryImpl().createGreaterThanOrEqual());
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getPartitionelementconstants().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createNumberConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createAddition()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createSubtraction()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createMultiplication()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createDivision()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createModulo()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 33;

			PartitionElementHLAPI elem = new PartitionElementHLAPI(llapi);
			List<fr.lip6.move.pnml.pthlpng.integers.hlapi.GreaterThanOrEqualHLAPI> totest = elem.getPartitionelementconstants_integers_GreaterThanOrEqualHLAPI();

			assert totest.size() == howmany + 1 - 33;

			for (TermHLAPI unit : totest) {
             assert llapi.getPartitionelementconstants().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "PartitionElementHLAPI"})
		public void getPartitionelementconstants_integers_LessThanHLAPITest(){
			PartitionElement llapi = new PartitionsFactoryImpl().createPartitionElement();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getPartitionelementconstants().add(new IntegersFactoryImpl().createLessThan());
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getPartitionelementconstants().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createNumberConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createAddition()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createSubtraction()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createMultiplication()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createDivision()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createModulo()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 33;

			PartitionElementHLAPI elem = new PartitionElementHLAPI(llapi);
			List<fr.lip6.move.pnml.pthlpng.integers.hlapi.LessThanHLAPI> totest = elem.getPartitionelementconstants_integers_LessThanHLAPI();

			assert totest.size() == howmany + 1 - 33;

			for (TermHLAPI unit : totest) {
             assert llapi.getPartitionelementconstants().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "PartitionElementHLAPI"})
		public void getPartitionelementconstants_integers_LessThanOrEqualHLAPITest(){
			PartitionElement llapi = new PartitionsFactoryImpl().createPartitionElement();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getPartitionelementconstants().add(new IntegersFactoryImpl().createLessThanOrEqual());
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getPartitionelementconstants().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createNumberConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createAddition()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createSubtraction()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createMultiplication()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createDivision()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createModulo()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 33;

			PartitionElementHLAPI elem = new PartitionElementHLAPI(llapi);
			List<fr.lip6.move.pnml.pthlpng.integers.hlapi.LessThanOrEqualHLAPI> totest = elem.getPartitionelementconstants_integers_LessThanOrEqualHLAPI();

			assert totest.size() == howmany + 1 - 33;

			for (TermHLAPI unit : totest) {
             assert llapi.getPartitionelementconstants().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "PartitionElementHLAPI"})
		public void getPartitionelementconstants_multisets_CardinalityHLAPITest(){
			PartitionElement llapi = new PartitionsFactoryImpl().createPartitionElement();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getPartitionelementconstants().add(new MultisetsFactoryImpl().createCardinality());
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getPartitionelementconstants().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createNumberConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createAddition()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createSubtraction()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createMultiplication()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createDivision()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createModulo()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 33;

			PartitionElementHLAPI elem = new PartitionElementHLAPI(llapi);
			List<fr.lip6.move.pnml.pthlpng.multisets.hlapi.CardinalityHLAPI> totest = elem.getPartitionelementconstants_multisets_CardinalityHLAPI();

			assert totest.size() == howmany + 1 - 33;

			for (TermHLAPI unit : totest) {
             assert llapi.getPartitionelementconstants().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "PartitionElementHLAPI"})
		public void getPartitionelementconstants_multisets_ContainsHLAPITest(){
			PartitionElement llapi = new PartitionsFactoryImpl().createPartitionElement();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getPartitionelementconstants().add(new MultisetsFactoryImpl().createContains());
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getPartitionelementconstants().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createNumberConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createAddition()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createSubtraction()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createMultiplication()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createDivision()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createModulo()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 33;

			PartitionElementHLAPI elem = new PartitionElementHLAPI(llapi);
			List<fr.lip6.move.pnml.pthlpng.multisets.hlapi.ContainsHLAPI> totest = elem.getPartitionelementconstants_multisets_ContainsHLAPI();

			assert totest.size() == howmany + 1 - 33;

			for (TermHLAPI unit : totest) {
             assert llapi.getPartitionelementconstants().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "PartitionElementHLAPI"})
		public void getPartitionelementconstants_multisets_CardinalityOfHLAPITest(){
			PartitionElement llapi = new PartitionsFactoryImpl().createPartitionElement();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getPartitionelementconstants().add(new MultisetsFactoryImpl().createCardinalityOf());
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getPartitionelementconstants().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createNumberConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createAddition()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createSubtraction()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createMultiplication()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createDivision()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createModulo()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 33;

			PartitionElementHLAPI elem = new PartitionElementHLAPI(llapi);
			List<fr.lip6.move.pnml.pthlpng.multisets.hlapi.CardinalityOfHLAPI> totest = elem.getPartitionelementconstants_multisets_CardinalityOfHLAPI();

			assert totest.size() == howmany + 1 - 33;

			for (TermHLAPI unit : totest) {
             assert llapi.getPartitionelementconstants().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "PartitionElementHLAPI"})
		public void getPartitionelementconstants_multisets_AddHLAPITest(){
			PartitionElement llapi = new PartitionsFactoryImpl().createPartitionElement();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getPartitionelementconstants().add(new MultisetsFactoryImpl().createAdd());
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getPartitionelementconstants().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createNumberConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createAddition()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createSubtraction()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createMultiplication()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createDivision()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createModulo()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 33;

			PartitionElementHLAPI elem = new PartitionElementHLAPI(llapi);
			List<fr.lip6.move.pnml.pthlpng.multisets.hlapi.AddHLAPI> totest = elem.getPartitionelementconstants_multisets_AddHLAPI();

			assert totest.size() == howmany + 1 - 33;

			for (TermHLAPI unit : totest) {
             assert llapi.getPartitionelementconstants().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "PartitionElementHLAPI"})
		public void getPartitionelementconstants_multisets_AllHLAPITest(){
			PartitionElement llapi = new PartitionsFactoryImpl().createPartitionElement();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getPartitionelementconstants().add(new MultisetsFactoryImpl().createAll());
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getPartitionelementconstants().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createNumberConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createAddition()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createSubtraction()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createMultiplication()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createDivision()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createModulo()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 33;

			PartitionElementHLAPI elem = new PartitionElementHLAPI(llapi);
			List<fr.lip6.move.pnml.pthlpng.multisets.hlapi.AllHLAPI> totest = elem.getPartitionelementconstants_multisets_AllHLAPI();

			assert totest.size() == howmany + 1 - 33;

			for (TermHLAPI unit : totest) {
             assert llapi.getPartitionelementconstants().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "PartitionElementHLAPI"})
		public void getPartitionelementconstants_multisets_EmptyHLAPITest(){
			PartitionElement llapi = new PartitionsFactoryImpl().createPartitionElement();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getPartitionelementconstants().add(new MultisetsFactoryImpl().createEmpty());
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getPartitionelementconstants().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createNumberConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createAddition()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createSubtraction()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createMultiplication()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createDivision()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createModulo()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 33;

			PartitionElementHLAPI elem = new PartitionElementHLAPI(llapi);
			List<fr.lip6.move.pnml.pthlpng.multisets.hlapi.EmptyHLAPI> totest = elem.getPartitionelementconstants_multisets_EmptyHLAPI();

			assert totest.size() == howmany + 1 - 33;

			for (TermHLAPI unit : totest) {
             assert llapi.getPartitionelementconstants().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "PartitionElementHLAPI"})
		public void getPartitionelementconstants_multisets_NumberOfHLAPITest(){
			PartitionElement llapi = new PartitionsFactoryImpl().createPartitionElement();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getPartitionelementconstants().add(new MultisetsFactoryImpl().createNumberOf());
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getPartitionelementconstants().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createNumberConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createAddition()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createSubtraction()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createMultiplication()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createDivision()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createModulo()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 33;

			PartitionElementHLAPI elem = new PartitionElementHLAPI(llapi);
			List<fr.lip6.move.pnml.pthlpng.multisets.hlapi.NumberOfHLAPI> totest = elem.getPartitionelementconstants_multisets_NumberOfHLAPI();

			assert totest.size() == howmany + 1 - 33;

			for (TermHLAPI unit : totest) {
             assert llapi.getPartitionelementconstants().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "PartitionElementHLAPI"})
		public void getPartitionelementconstants_multisets_SubtractHLAPITest(){
			PartitionElement llapi = new PartitionsFactoryImpl().createPartitionElement();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getPartitionelementconstants().add(new MultisetsFactoryImpl().createSubtract());
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getPartitionelementconstants().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createNumberConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createAddition()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createSubtraction()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createMultiplication()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createDivision()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createModulo()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 33;

			PartitionElementHLAPI elem = new PartitionElementHLAPI(llapi);
			List<fr.lip6.move.pnml.pthlpng.multisets.hlapi.SubtractHLAPI> totest = elem.getPartitionelementconstants_multisets_SubtractHLAPI();

			assert totest.size() == howmany + 1 - 33;

			for (TermHLAPI unit : totest) {
             assert llapi.getPartitionelementconstants().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "PartitionElementHLAPI"})
		public void getPartitionelementconstants_multisets_ScalarProductHLAPITest(){
			PartitionElement llapi = new PartitionsFactoryImpl().createPartitionElement();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getPartitionelementconstants().add(new MultisetsFactoryImpl().createScalarProduct());
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getPartitionelementconstants().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createNumberConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createAddition()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createSubtraction()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createMultiplication()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createDivision()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createModulo()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 33;

			PartitionElementHLAPI elem = new PartitionElementHLAPI(llapi);
			List<fr.lip6.move.pnml.pthlpng.multisets.hlapi.ScalarProductHLAPI> totest = elem.getPartitionelementconstants_multisets_ScalarProductHLAPI();

			assert totest.size() == howmany + 1 - 33;

			for (TermHLAPI unit : totest) {
             assert llapi.getPartitionelementconstants().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "PartitionElementHLAPI"})
		public void getPartitionelementconstants_terms_VariableHLAPITest(){
			PartitionElement llapi = new PartitionsFactoryImpl().createPartitionElement();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getPartitionelementconstants().add(new TermsFactoryImpl().createVariable());
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getPartitionelementconstants().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createNumberConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createAddition()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createSubtraction()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createMultiplication()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createDivision()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createModulo()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 33;

			PartitionElementHLAPI elem = new PartitionElementHLAPI(llapi);
			List<fr.lip6.move.pnml.pthlpng.terms.hlapi.VariableHLAPI> totest = elem.getPartitionelementconstants_terms_VariableHLAPI();

			assert totest.size() == howmany + 1 - 33;

			for (TermHLAPI unit : totest) {
             assert llapi.getPartitionelementconstants().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "PartitionElementHLAPI"})
		public void getPartitionelementconstants_terms_TupleHLAPITest(){
			PartitionElement llapi = new PartitionsFactoryImpl().createPartitionElement();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getPartitionelementconstants().add(new TermsFactoryImpl().createTuple());
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getPartitionelementconstants().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createNumberConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createAddition()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createSubtraction()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createMultiplication()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createDivision()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createModulo()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 33;

			PartitionElementHLAPI elem = new PartitionElementHLAPI(llapi);
			List<fr.lip6.move.pnml.pthlpng.terms.hlapi.TupleHLAPI> totest = elem.getPartitionelementconstants_terms_TupleHLAPI();

			assert totest.size() == howmany + 1 - 33;

			for (TermHLAPI unit : totest) {
             assert llapi.getPartitionelementconstants().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "PartitionElementHLAPI"})
		public void getPartitionelementconstants_terms_UserOperatorHLAPITest(){
			PartitionElement llapi = new PartitionsFactoryImpl().createPartitionElement();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getPartitionelementconstants().add(new TermsFactoryImpl().createUserOperator());
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getPartitionelementconstants().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getPartitionelementconstants().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createNumberConstant()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createAddition()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createSubtraction()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createMultiplication()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createDivision()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createModulo()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThan()
			);
			
			llapi.getPartitionelementconstants().add(
			   new IntegersFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getPartitionelementconstants().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getPartitionelementconstants().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 33;

			PartitionElementHLAPI elem = new PartitionElementHLAPI(llapi);
			List<fr.lip6.move.pnml.pthlpng.terms.hlapi.UserOperatorHLAPI> totest = elem.getPartitionelementconstants_terms_UserOperatorHLAPI();

			assert totest.size() == howmany + 1 - 33;

			for (TermHLAPI unit : totest) {
             assert llapi.getPartitionelementconstants().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
	
	

	//setters/remover for lists.
	
	@Test(groups = { "hlapi", "PartitionElementHLAPI"})
	public void addPartitionelementconstantsHLAPITest(){
		PartitionElementHLAPI elem = new PartitionElementHLAPI(new PartitionsFactoryImpl().createPartitionElement());
		int howmany = (int)(Math.random()*10);
		for(int i =0; i<howmany;i++)
			
			elem.addPartitionelementconstantsHLAPI(
				new GreaterThanHLAPI(
					new PartitionsFactoryImpl().createGreaterThan()
				)
			);
			

		assert elem.getContainedItem().getPartitionelementconstants().size() == howmany;
	}

	@Test(groups = { "hlapi", "PartitionElementHLAPI"})
	public void removePartitionelementconstantsTest(){
		PartitionElementHLAPI elem = new PartitionElementHLAPI(new PartitionsFactoryImpl().createPartitionElement());
		int howmany = (int)(Math.random()*10);
		int howdiff = (int)(Math.random()*10);

			
			GreaterThanHLAPI sav;
			

		for(int i =0; i<(howmany);i++)
			
			elem.addPartitionelementconstantsHLAPI(
				new GreaterThanHLAPI(
				  new PartitionsFactoryImpl().createGreaterThan()
				)
			);
			


		
		sav =
			new GreaterThanHLAPI(
			  new PartitionsFactoryImpl().createGreaterThan()
			);
		

		elem.addPartitionelementconstantsHLAPI(sav);
		assert elem.getContainedItem().getPartitionelementconstants().size() == howmany+1;

		for(int i =0; i<(howdiff);i++)
			
			elem.addPartitionelementconstantsHLAPI(
				new GreaterThanHLAPI(
				  new PartitionsFactoryImpl().createGreaterThan()
				)
			);
			


		elem.removePartitionelementconstantsHLAPI(sav);

		assert elem.getContainedItem().getPartitionelementconstants().size() == howmany+howdiff;
	}
	

	@Test(groups = { "hlapi", "PartitionElementHLAPI"})
	public void equalsTest(){
		PartitionElement a = new PartitionsFactoryImpl().createPartitionElement();
		PartitionElement b = new PartitionsFactoryImpl().createPartitionElement();
		PartitionElementHLAPI aprime = new PartitionElementHLAPI(a);
		PartitionElementHLAPI asecond = new PartitionElementHLAPI(a);
		PartitionElementHLAPI bprime = new PartitionElementHLAPI(b);

		assert aprime.equals(asecond);
		assert !aprime.equals(bprime);
	}

	//cloning method
	//public PartitionElementHLAPI clone(){
	//	return new PartitionElementHLAPI(this);
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
