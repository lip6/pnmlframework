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
 * $Id ggiffo, Thu Feb 11 16:29:03 CET 2016$
 */
package fr.lip6.move.pnml.symmetricnet.terms.hlapi;

import java.util.List;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import fr.lip6.move.pnml.framework.utils.ModelRepository;
import fr.lip6.move.pnml.framework.utils.exception.InvalidIDException;
import fr.lip6.move.pnml.framework.utils.exception.VoidRepositoryException;
import fr.lip6.move.pnml.symmetricnet.booleans.impl.BooleansFactoryImpl;
import fr.lip6.move.pnml.symmetricnet.cyclicEnumerations.impl.CyclicEnumerationsFactoryImpl;
import fr.lip6.move.pnml.symmetricnet.dots.impl.DotsFactoryImpl;
import fr.lip6.move.pnml.symmetricnet.finiteIntRanges.impl.FiniteIntRangesFactoryImpl;
import fr.lip6.move.pnml.symmetricnet.integers.impl.IntegersFactoryImpl;
import fr.lip6.move.pnml.symmetricnet.multisets.impl.MultisetsFactoryImpl;
import fr.lip6.move.pnml.symmetricnet.partitions.impl.PartitionsFactoryImpl;
import fr.lip6.move.pnml.symmetricnet.terms.NamedOperator;
import fr.lip6.move.pnml.symmetricnet.terms.impl.TermsFactoryImpl;
public class NamedOperatorHLAPITest {

	
	private String itemid;
		
	private String itemname;
		
	private TermHLAPI itemdef;
		
	
	private DeclarationsHLAPI itemcontainerDeclarations;
	


	@AfterTest(groups = { "NamedOperatorHLAPI", "hlapi" })
	public void After() {
	    System.out.println("done for "+"NamedOperatorHLAPI(terms)");
	}


	@BeforeMethod(groups = { "NamedOperatorHLAPI", "hlapi" })
	public void setup() throws Exception{
	//ModelRepository.reset(); ModelRepository.getInstance().createDocumentWorkspace("void");
	ModelRepository mr = ModelRepository.getInstance();
	mr.createDocumentWorkspace("void");
	
			itemid = "unid";
			
			itemname = "unid";
			
			
				
			itemdef = new fr.lip6.move.pnml.symmetricnet.terms.hlapi.VariableHLAPI(
				new TermsFactoryImpl().createVariable()
			);
				
			
		

	
		
		itemcontainerDeclarations = new DeclarationsHLAPI(new TermsFactoryImpl().createDeclarations());
		
	
	}

	/**
	 * this constructor allows you to set all 'settable' values
	 * excepted container.
	 */
	@Test(groups = { "hlapi", "NamedOperatorHLAPI"}, dependsOnMethods={"NamedOperatorHLAPI_LLAPI"})
	public void NamedOperatorHLAPI_1() throws InvalidIDException ,VoidRepositoryException   {//BEGIN CONSTRUCTOR BODY
   @SuppressWarnings("unused")
	NamedOperatorHLAPI totest = new NamedOperatorHLAPI(
		itemid
		,	
		itemname
		,	
		itemdef
	);
	
	
	assert totest.getId().equals(itemid);
	
	
	
	assert totest.getName().equals(itemname);
	
	
	
	
	assert totest.getDef().equals(itemdef.getContainedItem());
	
	
	}

	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "NamedOperatorHLAPI"}, dependsOnMethods={"NamedOperatorHLAPI_LLAPI"})
	public void NamedOperatorHLAPI_2_containerDeclarations() throws InvalidIDException ,VoidRepositoryException   {//BEGIN CONSTRUCTOR BODY

	NamedOperatorHLAPI totest = new NamedOperatorHLAPI(
		itemid
		,	
		itemname
		,	
		itemdef
	,	
		itemcontainerDeclarations
	);
	
	
			assert totest.getId().equals(itemid);
		
	
	
			assert totest.getName().equals(itemname);
		
	
	
		
			assert totest.getDef().equals(itemdef.getContainedItem());
		
	
	assert totest.getContainerDeclarations().equals(itemcontainerDeclarations.getContainedItem());
	}

	/**
    * This constructor give access to required stuff only (not container if any)
    */



	/**
	 * This constructor encapsulate a low level API object in HLAPI.
	 */
	@Test(groups = { "hlapi", "NamedOperatorHLAPI"})
	public void NamedOperatorHLAPI_LLAPI(){
	   NamedOperator llapi = new TermsFactoryImpl().createNamedOperator();
	   fr.lip6.move.pnml.symmetricnet.terms.hlapi.NamedOperatorHLAPI hlapi = new NamedOperatorHLAPI(llapi);
		assert hlapi.getContainedItem().equals(llapi);
	}

	//getters giving HLAPI object
	
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "NamedOperatorHLAPI"})
		public void getContainerDeclarationsHLAPITest(){
			NamedOperatorHLAPI elem = new NamedOperatorHLAPI(new TermsFactoryImpl().createNamedOperator());

			
				elem.setContainerDeclarationsHLAPI(itemcontainerDeclarations);
				DeclarationsHLAPI totest = elem.getContainerDeclarationsHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerDeclarations());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "NamedOperatorHLAPI"})
		public void getDefHLAPITest(){
			NamedOperatorHLAPI elem = new NamedOperatorHLAPI(new TermsFactoryImpl().createNamedOperator());

			
				elem.setDefHLAPI(new fr.lip6.move.pnml.symmetricnet.terms.hlapi.VariableHLAPI(new TermsFactoryImpl().createVariable()));
				TermHLAPI totest_terms_Variable = elem.getDefHLAPI();
				assert totest_terms_Variable.getContainedItem().equals(elem.getDef());
			
				elem.setDefHLAPI(new fr.lip6.move.pnml.symmetricnet.terms.hlapi.TupleHLAPI(new TermsFactoryImpl().createTuple()));
				TermHLAPI totest_terms_Tuple = elem.getDefHLAPI();
				assert totest_terms_Tuple.getContainedItem().equals(elem.getDef());
			
				elem.setDefHLAPI(new fr.lip6.move.pnml.symmetricnet.terms.hlapi.UserOperatorHLAPI(new TermsFactoryImpl().createUserOperator()));
				TermHLAPI totest_terms_UserOperator = elem.getDefHLAPI();
				assert totest_terms_UserOperator.getContainedItem().equals(elem.getDef());
			
				elem.setDefHLAPI(new fr.lip6.move.pnml.symmetricnet.booleans.hlapi.EqualityHLAPI(new BooleansFactoryImpl().createEquality()));
				TermHLAPI totest_booleans_Equality = elem.getDefHLAPI();
				assert totest_booleans_Equality.getContainedItem().equals(elem.getDef());
			
				elem.setDefHLAPI(new fr.lip6.move.pnml.symmetricnet.booleans.hlapi.InequalityHLAPI(new BooleansFactoryImpl().createInequality()));
				TermHLAPI totest_booleans_Inequality = elem.getDefHLAPI();
				assert totest_booleans_Inequality.getContainedItem().equals(elem.getDef());
			
				elem.setDefHLAPI(new fr.lip6.move.pnml.symmetricnet.booleans.hlapi.BooleanConstantHLAPI(new BooleansFactoryImpl().createBooleanConstant()));
				TermHLAPI totest_booleans_BooleanConstant = elem.getDefHLAPI();
				assert totest_booleans_BooleanConstant.getContainedItem().equals(elem.getDef());
			
				elem.setDefHLAPI(new fr.lip6.move.pnml.symmetricnet.booleans.hlapi.OrHLAPI(new BooleansFactoryImpl().createOr()));
				TermHLAPI totest_booleans_Or = elem.getDefHLAPI();
				assert totest_booleans_Or.getContainedItem().equals(elem.getDef());
			
				elem.setDefHLAPI(new fr.lip6.move.pnml.symmetricnet.booleans.hlapi.AndHLAPI(new BooleansFactoryImpl().createAnd()));
				TermHLAPI totest_booleans_And = elem.getDefHLAPI();
				assert totest_booleans_And.getContainedItem().equals(elem.getDef());
			
				elem.setDefHLAPI(new fr.lip6.move.pnml.symmetricnet.booleans.hlapi.ImplyHLAPI(new BooleansFactoryImpl().createImply()));
				TermHLAPI totest_booleans_Imply = elem.getDefHLAPI();
				assert totest_booleans_Imply.getContainedItem().equals(elem.getDef());
			
				elem.setDefHLAPI(new fr.lip6.move.pnml.symmetricnet.booleans.hlapi.NotHLAPI(new BooleansFactoryImpl().createNot()));
				TermHLAPI totest_booleans_Not = elem.getDefHLAPI();
				assert totest_booleans_Not.getContainedItem().equals(elem.getDef());
			
				elem.setDefHLAPI(new fr.lip6.move.pnml.symmetricnet.cyclicEnumerations.hlapi.SuccessorHLAPI(new CyclicEnumerationsFactoryImpl().createSuccessor()));
				TermHLAPI totest_cyclicEnumerations_Successor = elem.getDefHLAPI();
				assert totest_cyclicEnumerations_Successor.getContainedItem().equals(elem.getDef());
			
				elem.setDefHLAPI(new fr.lip6.move.pnml.symmetricnet.cyclicEnumerations.hlapi.PredecessorHLAPI(new CyclicEnumerationsFactoryImpl().createPredecessor()));
				TermHLAPI totest_cyclicEnumerations_Predecessor = elem.getDefHLAPI();
				assert totest_cyclicEnumerations_Predecessor.getContainedItem().equals(elem.getDef());
			
				elem.setDefHLAPI(new fr.lip6.move.pnml.symmetricnet.dots.hlapi.DotConstantHLAPI(new DotsFactoryImpl().createDotConstant()));
				TermHLAPI totest_dots_DotConstant = elem.getDefHLAPI();
				assert totest_dots_DotConstant.getContainedItem().equals(elem.getDef());
			
				elem.setDefHLAPI(new fr.lip6.move.pnml.symmetricnet.finiteIntRanges.hlapi.FiniteIntRangeConstantHLAPI(new FiniteIntRangesFactoryImpl().createFiniteIntRangeConstant()));
				TermHLAPI totest_finiteIntRanges_FiniteIntRangeConstant = elem.getDefHLAPI();
				assert totest_finiteIntRanges_FiniteIntRangeConstant.getContainedItem().equals(elem.getDef());
			
				elem.setDefHLAPI(new fr.lip6.move.pnml.symmetricnet.finiteIntRanges.hlapi.LessThanHLAPI(new FiniteIntRangesFactoryImpl().createLessThan()));
				TermHLAPI totest_finiteIntRanges_LessThan = elem.getDefHLAPI();
				assert totest_finiteIntRanges_LessThan.getContainedItem().equals(elem.getDef());
			
				elem.setDefHLAPI(new fr.lip6.move.pnml.symmetricnet.finiteIntRanges.hlapi.GreaterThanHLAPI(new FiniteIntRangesFactoryImpl().createGreaterThan()));
				TermHLAPI totest_finiteIntRanges_GreaterThan = elem.getDefHLAPI();
				assert totest_finiteIntRanges_GreaterThan.getContainedItem().equals(elem.getDef());
			
				elem.setDefHLAPI(new fr.lip6.move.pnml.symmetricnet.finiteIntRanges.hlapi.LessThanOrEqualHLAPI(new FiniteIntRangesFactoryImpl().createLessThanOrEqual()));
				TermHLAPI totest_finiteIntRanges_LessThanOrEqual = elem.getDefHLAPI();
				assert totest_finiteIntRanges_LessThanOrEqual.getContainedItem().equals(elem.getDef());
			
				elem.setDefHLAPI(new fr.lip6.move.pnml.symmetricnet.finiteIntRanges.hlapi.GreaterThanOrEqualHLAPI(new FiniteIntRangesFactoryImpl().createGreaterThanOrEqual()));
				TermHLAPI totest_finiteIntRanges_GreaterThanOrEqual = elem.getDefHLAPI();
				assert totest_finiteIntRanges_GreaterThanOrEqual.getContainedItem().equals(elem.getDef());
			
				elem.setDefHLAPI(new fr.lip6.move.pnml.symmetricnet.integers.hlapi.NumberConstantHLAPI(new IntegersFactoryImpl().createNumberConstant()));
				TermHLAPI totest_integers_NumberConstant = elem.getDefHLAPI();
				assert totest_integers_NumberConstant.getContainedItem().equals(elem.getDef());
			
				elem.setDefHLAPI(new fr.lip6.move.pnml.symmetricnet.integers.hlapi.AdditionHLAPI(new IntegersFactoryImpl().createAddition()));
				TermHLAPI totest_integers_Addition = elem.getDefHLAPI();
				assert totest_integers_Addition.getContainedItem().equals(elem.getDef());
			
				elem.setDefHLAPI(new fr.lip6.move.pnml.symmetricnet.integers.hlapi.SubtractionHLAPI(new IntegersFactoryImpl().createSubtraction()));
				TermHLAPI totest_integers_Subtraction = elem.getDefHLAPI();
				assert totest_integers_Subtraction.getContainedItem().equals(elem.getDef());
			
				elem.setDefHLAPI(new fr.lip6.move.pnml.symmetricnet.integers.hlapi.MultiplicationHLAPI(new IntegersFactoryImpl().createMultiplication()));
				TermHLAPI totest_integers_Multiplication = elem.getDefHLAPI();
				assert totest_integers_Multiplication.getContainedItem().equals(elem.getDef());
			
				elem.setDefHLAPI(new fr.lip6.move.pnml.symmetricnet.integers.hlapi.DivisionHLAPI(new IntegersFactoryImpl().createDivision()));
				TermHLAPI totest_integers_Division = elem.getDefHLAPI();
				assert totest_integers_Division.getContainedItem().equals(elem.getDef());
			
				elem.setDefHLAPI(new fr.lip6.move.pnml.symmetricnet.integers.hlapi.ModuloHLAPI(new IntegersFactoryImpl().createModulo()));
				TermHLAPI totest_integers_Modulo = elem.getDefHLAPI();
				assert totest_integers_Modulo.getContainedItem().equals(elem.getDef());
			
				elem.setDefHLAPI(new fr.lip6.move.pnml.symmetricnet.integers.hlapi.GreaterThanHLAPI(new IntegersFactoryImpl().createGreaterThan()));
				TermHLAPI totest_integers_GreaterThan = elem.getDefHLAPI();
				assert totest_integers_GreaterThan.getContainedItem().equals(elem.getDef());
			
				elem.setDefHLAPI(new fr.lip6.move.pnml.symmetricnet.integers.hlapi.GreaterThanOrEqualHLAPI(new IntegersFactoryImpl().createGreaterThanOrEqual()));
				TermHLAPI totest_integers_GreaterThanOrEqual = elem.getDefHLAPI();
				assert totest_integers_GreaterThanOrEqual.getContainedItem().equals(elem.getDef());
			
				elem.setDefHLAPI(new fr.lip6.move.pnml.symmetricnet.integers.hlapi.LessThanHLAPI(new IntegersFactoryImpl().createLessThan()));
				TermHLAPI totest_integers_LessThan = elem.getDefHLAPI();
				assert totest_integers_LessThan.getContainedItem().equals(elem.getDef());
			
				elem.setDefHLAPI(new fr.lip6.move.pnml.symmetricnet.integers.hlapi.LessThanOrEqualHLAPI(new IntegersFactoryImpl().createLessThanOrEqual()));
				TermHLAPI totest_integers_LessThanOrEqual = elem.getDefHLAPI();
				assert totest_integers_LessThanOrEqual.getContainedItem().equals(elem.getDef());
			
				elem.setDefHLAPI(new fr.lip6.move.pnml.symmetricnet.multisets.hlapi.CardinalityHLAPI(new MultisetsFactoryImpl().createCardinality()));
				TermHLAPI totest_multisets_Cardinality = elem.getDefHLAPI();
				assert totest_multisets_Cardinality.getContainedItem().equals(elem.getDef());
			
				elem.setDefHLAPI(new fr.lip6.move.pnml.symmetricnet.multisets.hlapi.ContainsHLAPI(new MultisetsFactoryImpl().createContains()));
				TermHLAPI totest_multisets_Contains = elem.getDefHLAPI();
				assert totest_multisets_Contains.getContainedItem().equals(elem.getDef());
			
				elem.setDefHLAPI(new fr.lip6.move.pnml.symmetricnet.multisets.hlapi.CardinalityOfHLAPI(new MultisetsFactoryImpl().createCardinalityOf()));
				TermHLAPI totest_multisets_CardinalityOf = elem.getDefHLAPI();
				assert totest_multisets_CardinalityOf.getContainedItem().equals(elem.getDef());
			
				elem.setDefHLAPI(new fr.lip6.move.pnml.symmetricnet.multisets.hlapi.AddHLAPI(new MultisetsFactoryImpl().createAdd()));
				TermHLAPI totest_multisets_Add = elem.getDefHLAPI();
				assert totest_multisets_Add.getContainedItem().equals(elem.getDef());
			
				elem.setDefHLAPI(new fr.lip6.move.pnml.symmetricnet.multisets.hlapi.AllHLAPI(new MultisetsFactoryImpl().createAll()));
				TermHLAPI totest_multisets_All = elem.getDefHLAPI();
				assert totest_multisets_All.getContainedItem().equals(elem.getDef());
			
				elem.setDefHLAPI(new fr.lip6.move.pnml.symmetricnet.multisets.hlapi.EmptyHLAPI(new MultisetsFactoryImpl().createEmpty()));
				TermHLAPI totest_multisets_Empty = elem.getDefHLAPI();
				assert totest_multisets_Empty.getContainedItem().equals(elem.getDef());
			
				elem.setDefHLAPI(new fr.lip6.move.pnml.symmetricnet.multisets.hlapi.NumberOfHLAPI(new MultisetsFactoryImpl().createNumberOf()));
				TermHLAPI totest_multisets_NumberOf = elem.getDefHLAPI();
				assert totest_multisets_NumberOf.getContainedItem().equals(elem.getDef());
			
				elem.setDefHLAPI(new fr.lip6.move.pnml.symmetricnet.multisets.hlapi.SubtractHLAPI(new MultisetsFactoryImpl().createSubtract()));
				TermHLAPI totest_multisets_Subtract = elem.getDefHLAPI();
				assert totest_multisets_Subtract.getContainedItem().equals(elem.getDef());
			
				elem.setDefHLAPI(new fr.lip6.move.pnml.symmetricnet.multisets.hlapi.ScalarProductHLAPI(new MultisetsFactoryImpl().createScalarProduct()));
				TermHLAPI totest_multisets_ScalarProduct = elem.getDefHLAPI();
				assert totest_multisets_ScalarProduct.getContainedItem().equals(elem.getDef());
			
				elem.setDefHLAPI(new fr.lip6.move.pnml.symmetricnet.partitions.hlapi.GreaterThanHLAPI(new PartitionsFactoryImpl().createGreaterThan()));
				TermHLAPI totest_partitions_GreaterThan = elem.getDefHLAPI();
				assert totest_partitions_GreaterThan.getContainedItem().equals(elem.getDef());
			
				elem.setDefHLAPI(new fr.lip6.move.pnml.symmetricnet.partitions.hlapi.PartitionElementOfHLAPI(new PartitionsFactoryImpl().createPartitionElementOf()));
				TermHLAPI totest_partitions_PartitionElementOf = elem.getDefHLAPI();
				assert totest_partitions_PartitionElementOf.getContainedItem().equals(elem.getDef());
			
				elem.setDefHLAPI(new fr.lip6.move.pnml.symmetricnet.partitions.hlapi.LessThanHLAPI(new PartitionsFactoryImpl().createLessThan()));
				TermHLAPI totest_partitions_LessThan = elem.getDefHLAPI();
				assert totest_partitions_LessThan.getContainedItem().equals(elem.getDef());
			
		}
	
	

	
		/**
		 * This test add a random number of desired objet in the list or of one of each existing subtypes.
		 * then test how many objet are retuned and if any exist inthe original list.
		 */
		@Test(groups = { "hlapi", "NamedOperatorHLAPI"})
		public void getParametersHLAPITest(){
			NamedOperator llapi = new TermsFactoryImpl().createNamedOperator();
			int howmany;
			
			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getParameters().add(new TermsFactoryImpl().createVariableDecl());
			

			NamedOperatorHLAPI elem = new NamedOperatorHLAPI(llapi);
			List<VariableDeclHLAPI> totest = elem.getParametersHLAPI();

			assert totest.size() == howmany;

			for (VariableDeclHLAPI unit : totest) {
             assert llapi.getParameters().contains(unit.getContainedItem()) : "missing element";
         }
		}
	

	//Special getter for list of generics object, return only one object type.
	
	
	
	

	//setters/remover for lists.
	
	@Test(groups = { "hlapi", "NamedOperatorHLAPI"})
	public void addParametersHLAPITest(){
		NamedOperatorHLAPI elem = new NamedOperatorHLAPI(new TermsFactoryImpl().createNamedOperator());
		int howmany = (int)(Math.random()*10);
		for(int i =0; i<howmany;i++)
			
			elem.addParametersHLAPI(new VariableDeclHLAPI(new TermsFactoryImpl().createVariableDecl()));
			

		assert elem.getContainedItem().getParameters().size() == howmany;
	}

	@Test(groups = { "hlapi", "NamedOperatorHLAPI"})
	public void removeParametersTest(){
		NamedOperatorHLAPI elem = new NamedOperatorHLAPI(new TermsFactoryImpl().createNamedOperator());
		int howmany = (int)(Math.random()*10);
		int howdiff = (int)(Math.random()*10);

			
			VariableDeclHLAPI sav;

		for(int i =0; i<(howmany);i++)
			
			elem.addParametersHLAPI(new VariableDeclHLAPI(new TermsFactoryImpl().createVariableDecl()));
			


		
		sav = new VariableDeclHLAPI(new TermsFactoryImpl().createVariableDecl());
		

		elem.addParametersHLAPI(sav);
		assert elem.getContainedItem().getParameters().size() == howmany+1;

		for(int i =0; i<(howdiff);i++)
			
			elem.addParametersHLAPI(new VariableDeclHLAPI(new TermsFactoryImpl().createVariableDecl()));
			


		elem.removeParametersHLAPI(sav);

		assert elem.getContainedItem().getParameters().size() == howmany+howdiff;
	}
	

	@Test(groups = { "hlapi", "NamedOperatorHLAPI"})
	public void equalsTest(){
		NamedOperator a = new TermsFactoryImpl().createNamedOperator();
		NamedOperator b = new TermsFactoryImpl().createNamedOperator();
		NamedOperatorHLAPI aprime = new NamedOperatorHLAPI(a);
		NamedOperatorHLAPI asecond = new NamedOperatorHLAPI(a);
		NamedOperatorHLAPI bprime = new NamedOperatorHLAPI(b);

		assert aprime.equals(asecond);
		assert !aprime.equals(bprime);
	}

	//cloning method
	//public NamedOperatorHLAPI clone(){
	//	return new NamedOperatorHLAPI(this);
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
