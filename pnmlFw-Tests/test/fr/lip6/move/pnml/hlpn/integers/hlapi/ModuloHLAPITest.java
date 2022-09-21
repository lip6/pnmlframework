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
 * $Id ggiffo, Thu Feb 11 16:29:58 CET 2016$
 */
package fr.lip6.move.pnml.hlpn.integers.hlapi;

import java.util.List;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import fr.lip6.move.pnml.framework.utils.ModelRepository;
import fr.lip6.move.pnml.hlpn.arbitrarydeclarations.impl.ArbitrarydeclarationsFactoryImpl;
import fr.lip6.move.pnml.hlpn.booleans.impl.BooleansFactoryImpl;
import fr.lip6.move.pnml.hlpn.cyclicEnumerations.impl.CyclicEnumerationsFactoryImpl;
import fr.lip6.move.pnml.hlpn.dots.impl.DotsFactoryImpl;
import fr.lip6.move.pnml.hlpn.finiteEnumerations.impl.FiniteEnumerationsFactoryImpl;
import fr.lip6.move.pnml.hlpn.finiteIntRanges.impl.FiniteIntRangesFactoryImpl;
import fr.lip6.move.pnml.hlpn.hlcorestructure.hlapi.ConditionHLAPI;
import fr.lip6.move.pnml.hlpn.hlcorestructure.hlapi.HLAnnotationHLAPI;
import fr.lip6.move.pnml.hlpn.hlcorestructure.hlapi.HLMarkingHLAPI;
import fr.lip6.move.pnml.hlpn.hlcorestructure.impl.HlcorestructureFactoryImpl;
import fr.lip6.move.pnml.hlpn.integers.Modulo;
import fr.lip6.move.pnml.hlpn.integers.impl.IntegersFactoryImpl;
import fr.lip6.move.pnml.hlpn.lists.impl.ListsFactoryImpl;
import fr.lip6.move.pnml.hlpn.multisets.impl.MultisetsFactoryImpl;
import fr.lip6.move.pnml.hlpn.partitions.hlapi.PartitionElementHLAPI;
import fr.lip6.move.pnml.hlpn.partitions.impl.PartitionsFactoryImpl;
import fr.lip6.move.pnml.hlpn.strings.impl.StringsFactoryImpl;
import fr.lip6.move.pnml.hlpn.terms.hlapi.NamedOperatorHLAPI;
import fr.lip6.move.pnml.hlpn.terms.hlapi.OperatorHLAPI;
import fr.lip6.move.pnml.hlpn.terms.hlapi.SortHLAPI;
import fr.lip6.move.pnml.hlpn.terms.hlapi.TermHLAPI;
import fr.lip6.move.pnml.hlpn.terms.impl.TermsFactoryImpl;
public class ModuloHLAPITest {

	
	private SortHLAPI itemsort;
		
	private SortHLAPI itemoutput;
		
	
	private OperatorHLAPI itemcontainerOperator;
	
	private NamedOperatorHLAPI itemcontainerNamedOperator;
	
	private HLMarkingHLAPI itemcontainerHLMarking;
	
	private ConditionHLAPI itemcontainerCondition;
	
	private HLAnnotationHLAPI itemcontainerHLAnnotation;
	
	private PartitionElementHLAPI itemcontainerPartitionElement;
	


	@AfterTest(groups = { "ModuloHLAPI", "hlapi" })
	public void After() {
	    System.out.println("done for "+"ModuloHLAPI(integers)");
	}


	@BeforeMethod(groups = { "ModuloHLAPI", "hlapi" })
	public void setup() throws Exception{
	//ModelRepository.reset(); ModelRepository.getInstance().createDocumentWorkspace("void");
	ModelRepository mr = ModelRepository.getInstance();
	mr.createDocumentWorkspace("void");
	
			
				
			itemsort = new fr.lip6.move.pnml.hlpn.integers.hlapi.NaturalHLAPI(
				new IntegersFactoryImpl().createNatural()
			);
				
			
		
			
				
			itemoutput = new fr.lip6.move.pnml.hlpn.integers.hlapi.NaturalHLAPI(
				new IntegersFactoryImpl().createNatural()
			);
				
			
		

	
		
			
			
		itemcontainerOperator = new fr.lip6.move.pnml.hlpn.integers.hlapi.NumberConstantHLAPI(
		   new IntegersFactoryImpl().createNumberConstant()
		);
			
		
	
		
		itemcontainerNamedOperator = new NamedOperatorHLAPI(new TermsFactoryImpl().createNamedOperator());
		
	
		
		itemcontainerHLMarking = new HLMarkingHLAPI(new HlcorestructureFactoryImpl().createHLMarking());
		
	
		
		itemcontainerCondition = new ConditionHLAPI(new HlcorestructureFactoryImpl().createCondition());
		
	
		
		itemcontainerHLAnnotation = new HLAnnotationHLAPI(new HlcorestructureFactoryImpl().createHLAnnotation());
		
	
		
		itemcontainerPartitionElement = new PartitionElementHLAPI(new PartitionsFactoryImpl().createPartitionElement());
		
	
	}

	/**
	 * this constructor allows you to set all 'settable' values
	 * excepted container.
	 */
	@Test(groups = { "hlapi", "ModuloHLAPI"}, dependsOnMethods={"ModuloHLAPI_LLAPI"})
	public void ModuloHLAPI_1(){//BEGIN CONSTRUCTOR BODY
   @SuppressWarnings("unused")
	ModuloHLAPI totest = new ModuloHLAPI(
		itemsort
		,	
		itemoutput
	);
	
	
	
	assert totest.getSort().equals(itemsort.getContainedItem());
	
	
	
	
	assert totest.getOutput().equals(itemoutput.getContainedItem());
	
	
	}

	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "ModuloHLAPI"}, dependsOnMethods={"ModuloHLAPI_LLAPI"})
	public void ModuloHLAPI_2_containerOperator(){//BEGIN CONSTRUCTOR BODY

	ModuloHLAPI totest = new ModuloHLAPI(
		itemsort
		,	
		itemoutput
	,	
		itemcontainerOperator
	);
	
	
		
			assert totest.getSort().equals(itemsort.getContainedItem());
		
	
	
		
			assert totest.getOutput().equals(itemoutput.getContainedItem());
		
	
	assert totest.getContainerOperator().equals(itemcontainerOperator.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "ModuloHLAPI"}, dependsOnMethods={"ModuloHLAPI_LLAPI"})
	public void ModuloHLAPI_2_containerNamedOperator(){//BEGIN CONSTRUCTOR BODY

	ModuloHLAPI totest = new ModuloHLAPI(
		itemsort
		,	
		itemoutput
	,	
		itemcontainerNamedOperator
	);
	
	
		
			assert totest.getSort().equals(itemsort.getContainedItem());
		
	
	
		
			assert totest.getOutput().equals(itemoutput.getContainedItem());
		
	
	assert totest.getContainerNamedOperator().equals(itemcontainerNamedOperator.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "ModuloHLAPI"}, dependsOnMethods={"ModuloHLAPI_LLAPI"})
	public void ModuloHLAPI_2_containerHLMarking(){//BEGIN CONSTRUCTOR BODY

	ModuloHLAPI totest = new ModuloHLAPI(
		itemsort
		,	
		itemoutput
	,	
		itemcontainerHLMarking
	);
	
	
		
			assert totest.getSort().equals(itemsort.getContainedItem());
		
	
	
		
			assert totest.getOutput().equals(itemoutput.getContainedItem());
		
	
	assert totest.getContainerHLMarking().equals(itemcontainerHLMarking.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "ModuloHLAPI"}, dependsOnMethods={"ModuloHLAPI_LLAPI"})
	public void ModuloHLAPI_2_containerCondition(){//BEGIN CONSTRUCTOR BODY

	ModuloHLAPI totest = new ModuloHLAPI(
		itemsort
		,	
		itemoutput
	,	
		itemcontainerCondition
	);
	
	
		
			assert totest.getSort().equals(itemsort.getContainedItem());
		
	
	
		
			assert totest.getOutput().equals(itemoutput.getContainedItem());
		
	
	assert totest.getContainerCondition().equals(itemcontainerCondition.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "ModuloHLAPI"}, dependsOnMethods={"ModuloHLAPI_LLAPI"})
	public void ModuloHLAPI_2_containerHLAnnotation(){//BEGIN CONSTRUCTOR BODY

	ModuloHLAPI totest = new ModuloHLAPI(
		itemsort
		,	
		itemoutput
	,	
		itemcontainerHLAnnotation
	);
	
	
		
			assert totest.getSort().equals(itemsort.getContainedItem());
		
	
	
		
			assert totest.getOutput().equals(itemoutput.getContainedItem());
		
	
	assert totest.getContainerHLAnnotation().equals(itemcontainerHLAnnotation.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "ModuloHLAPI"}, dependsOnMethods={"ModuloHLAPI_LLAPI"})
	public void ModuloHLAPI_2_containerPartitionElement(){//BEGIN CONSTRUCTOR BODY

	ModuloHLAPI totest = new ModuloHLAPI(
		itemsort
		,	
		itemoutput
	,	
		itemcontainerPartitionElement
	);
	
	
		
			assert totest.getSort().equals(itemsort.getContainedItem());
		
	
	
		
			assert totest.getOutput().equals(itemoutput.getContainedItem());
		
	
	assert totest.getContainerPartitionElement().equals(itemcontainerPartitionElement.getContainedItem());
	}

	/**
    * This constructor give access to required stuff only (not container if any)
    */

	/**
    * This constructor give access to required stuff only (and container)
    */
   @Test(groups = { "hlapi", "ModuloHLAPI"}, dependsOnMethods={"ModuloHLAPI_LLAPI"})
	public void ModuloHLAPI_4_containerOperator(){//BEGIN CONSTRUCTOR BODY

	ModuloHLAPI totest = new ModuloHLAPI(
	  itemcontainerOperator
	);

	
	assert totest.getContainerOperator().equals(itemcontainerOperator.getContainedItem());
	}
	/**
    * This constructor give access to required stuff only (and container)
    */
   @Test(groups = { "hlapi", "ModuloHLAPI"}, dependsOnMethods={"ModuloHLAPI_LLAPI"})
	public void ModuloHLAPI_4_containerNamedOperator(){//BEGIN CONSTRUCTOR BODY

	ModuloHLAPI totest = new ModuloHLAPI(
	  itemcontainerNamedOperator
	);

	
	assert totest.getContainerNamedOperator().equals(itemcontainerNamedOperator.getContainedItem());
	}
	/**
    * This constructor give access to required stuff only (and container)
    */
   @Test(groups = { "hlapi", "ModuloHLAPI"}, dependsOnMethods={"ModuloHLAPI_LLAPI"})
	public void ModuloHLAPI_4_containerHLMarking(){//BEGIN CONSTRUCTOR BODY

	ModuloHLAPI totest = new ModuloHLAPI(
	  itemcontainerHLMarking
	);

	
	assert totest.getContainerHLMarking().equals(itemcontainerHLMarking.getContainedItem());
	}
	/**
    * This constructor give access to required stuff only (and container)
    */
   @Test(groups = { "hlapi", "ModuloHLAPI"}, dependsOnMethods={"ModuloHLAPI_LLAPI"})
	public void ModuloHLAPI_4_containerCondition(){//BEGIN CONSTRUCTOR BODY

	ModuloHLAPI totest = new ModuloHLAPI(
	  itemcontainerCondition
	);

	
	assert totest.getContainerCondition().equals(itemcontainerCondition.getContainedItem());
	}
	/**
    * This constructor give access to required stuff only (and container)
    */
   @Test(groups = { "hlapi", "ModuloHLAPI"}, dependsOnMethods={"ModuloHLAPI_LLAPI"})
	public void ModuloHLAPI_4_containerHLAnnotation(){//BEGIN CONSTRUCTOR BODY

	ModuloHLAPI totest = new ModuloHLAPI(
	  itemcontainerHLAnnotation
	);

	
	assert totest.getContainerHLAnnotation().equals(itemcontainerHLAnnotation.getContainedItem());
	}
	/**
    * This constructor give access to required stuff only (and container)
    */
   @Test(groups = { "hlapi", "ModuloHLAPI"}, dependsOnMethods={"ModuloHLAPI_LLAPI"})
	public void ModuloHLAPI_4_containerPartitionElement(){//BEGIN CONSTRUCTOR BODY

	ModuloHLAPI totest = new ModuloHLAPI(
	  itemcontainerPartitionElement
	);

	
	assert totest.getContainerPartitionElement().equals(itemcontainerPartitionElement.getContainedItem());
	}


	/**
	 * This constructor encapsulate a low level API object in HLAPI.
	 */
	@Test(groups = { "hlapi", "ModuloHLAPI"})
	public void ModuloHLAPI_LLAPI(){
	   Modulo llapi = new IntegersFactoryImpl().createModulo();
	   fr.lip6.move.pnml.hlpn.integers.hlapi.ModuloHLAPI hlapi = new ModuloHLAPI(llapi);
		assert hlapi.getContainedItem().equals(llapi);
	}

	//getters giving HLAPI object
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "ModuloHLAPI"})
		public void getSortHLAPITest(){
			ModuloHLAPI elem = new ModuloHLAPI(new IntegersFactoryImpl().createModulo());

			
				elem.setSortHLAPI(new fr.lip6.move.pnml.hlpn.integers.hlapi.NaturalHLAPI(new IntegersFactoryImpl().createNatural()));
				SortHLAPI totest_integers_Natural = elem.getSortHLAPI();
				assert totest_integers_Natural.getContainedItem().equals(elem.getSort());
			
				elem.setSortHLAPI(new fr.lip6.move.pnml.hlpn.integers.hlapi.PositiveHLAPI(new IntegersFactoryImpl().createPositive()));
				SortHLAPI totest_integers_Positive = elem.getSortHLAPI();
				assert totest_integers_Positive.getContainedItem().equals(elem.getSort());
			
				elem.setSortHLAPI(new fr.lip6.move.pnml.hlpn.integers.hlapi.HLIntegerHLAPI(new IntegersFactoryImpl().createHLInteger()));
				SortHLAPI totest_integers_HLInteger = elem.getSortHLAPI();
				assert totest_integers_HLInteger.getContainedItem().equals(elem.getSort());
			
				elem.setSortHLAPI(new fr.lip6.move.pnml.hlpn.arbitrarydeclarations.hlapi.AnySortHLAPI(new ArbitrarydeclarationsFactoryImpl().createAnySort()));
				SortHLAPI totest_arbitrarydeclarations_AnySort = elem.getSortHLAPI();
				assert totest_arbitrarydeclarations_AnySort.getContainedItem().equals(elem.getSort());
			
				elem.setSortHLAPI(new fr.lip6.move.pnml.hlpn.booleans.hlapi.BoolHLAPI(new BooleansFactoryImpl().createBool()));
				SortHLAPI totest_booleans_Bool = elem.getSortHLAPI();
				assert totest_booleans_Bool.getContainedItem().equals(elem.getSort());
			
				elem.setSortHLAPI(new fr.lip6.move.pnml.hlpn.cyclicEnumerations.hlapi.CyclicEnumerationHLAPI(new CyclicEnumerationsFactoryImpl().createCyclicEnumeration()));
				SortHLAPI totest_cyclicEnumerations_CyclicEnumeration = elem.getSortHLAPI();
				assert totest_cyclicEnumerations_CyclicEnumeration.getContainedItem().equals(elem.getSort());
			
				elem.setSortHLAPI(new fr.lip6.move.pnml.hlpn.dots.hlapi.DotHLAPI(new DotsFactoryImpl().createDot()));
				SortHLAPI totest_dots_Dot = elem.getSortHLAPI();
				assert totest_dots_Dot.getContainedItem().equals(elem.getSort());
			
				elem.setSortHLAPI(new fr.lip6.move.pnml.hlpn.finiteEnumerations.hlapi.FiniteEnumerationHLAPI(new FiniteEnumerationsFactoryImpl().createFiniteEnumeration()));
				SortHLAPI totest_finiteEnumerations_FiniteEnumeration = elem.getSortHLAPI();
				assert totest_finiteEnumerations_FiniteEnumeration.getContainedItem().equals(elem.getSort());
			
				elem.setSortHLAPI(new fr.lip6.move.pnml.hlpn.finiteIntRanges.hlapi.FiniteIntRangeHLAPI(new FiniteIntRangesFactoryImpl().createFiniteIntRange()));
				SortHLAPI totest_finiteIntRanges_FiniteIntRange = elem.getSortHLAPI();
				assert totest_finiteIntRanges_FiniteIntRange.getContainedItem().equals(elem.getSort());
			
				elem.setSortHLAPI(new fr.lip6.move.pnml.hlpn.lists.hlapi.HLPNListHLAPI(new ListsFactoryImpl().createHLPNList()));
				SortHLAPI totest_lists_HLPNList = elem.getSortHLAPI();
				assert totest_lists_HLPNList.getContainedItem().equals(elem.getSort());
			
				elem.setSortHLAPI(new fr.lip6.move.pnml.hlpn.strings.hlapi.HLPNStringHLAPI(new StringsFactoryImpl().createHLPNString()));
				SortHLAPI totest_strings_HLPNString = elem.getSortHLAPI();
				assert totest_strings_HLPNString.getContainedItem().equals(elem.getSort());
			
				elem.setSortHLAPI(new fr.lip6.move.pnml.hlpn.terms.hlapi.MultisetSortHLAPI(new TermsFactoryImpl().createMultisetSort()));
				SortHLAPI totest_terms_MultisetSort = elem.getSortHLAPI();
				assert totest_terms_MultisetSort.getContainedItem().equals(elem.getSort());
			
				elem.setSortHLAPI(new fr.lip6.move.pnml.hlpn.terms.hlapi.ProductSortHLAPI(new TermsFactoryImpl().createProductSort()));
				SortHLAPI totest_terms_ProductSort = elem.getSortHLAPI();
				assert totest_terms_ProductSort.getContainedItem().equals(elem.getSort());
			
				elem.setSortHLAPI(new fr.lip6.move.pnml.hlpn.terms.hlapi.UserSortHLAPI(new TermsFactoryImpl().createUserSort()));
				SortHLAPI totest_terms_UserSort = elem.getSortHLAPI();
				assert totest_terms_UserSort.getContainedItem().equals(elem.getSort());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "ModuloHLAPI"})
		public void getContainerOperatorHLAPITest(){
			ModuloHLAPI elem = new ModuloHLAPI(new IntegersFactoryImpl().createModulo());

			
				elem.setContainerOperatorHLAPI(new fr.lip6.move.pnml.hlpn.integers.hlapi.NumberConstantHLAPI(new IntegersFactoryImpl().createNumberConstant()));
				OperatorHLAPI totest_integers_NumberConstant = elem.getContainerOperatorHLAPI();
				assert totest_integers_NumberConstant.getContainedItem().equals(elem.getContainerOperator());
			
				elem.setContainerOperatorHLAPI(new fr.lip6.move.pnml.hlpn.integers.hlapi.AdditionHLAPI(new IntegersFactoryImpl().createAddition()));
				OperatorHLAPI totest_integers_Addition = elem.getContainerOperatorHLAPI();
				assert totest_integers_Addition.getContainedItem().equals(elem.getContainerOperator());
			
				elem.setContainerOperatorHLAPI(new fr.lip6.move.pnml.hlpn.integers.hlapi.SubtractionHLAPI(new IntegersFactoryImpl().createSubtraction()));
				OperatorHLAPI totest_integers_Subtraction = elem.getContainerOperatorHLAPI();
				assert totest_integers_Subtraction.getContainedItem().equals(elem.getContainerOperator());
			
				elem.setContainerOperatorHLAPI(new fr.lip6.move.pnml.hlpn.integers.hlapi.MultiplicationHLAPI(new IntegersFactoryImpl().createMultiplication()));
				OperatorHLAPI totest_integers_Multiplication = elem.getContainerOperatorHLAPI();
				assert totest_integers_Multiplication.getContainedItem().equals(elem.getContainerOperator());
			
				elem.setContainerOperatorHLAPI(new fr.lip6.move.pnml.hlpn.integers.hlapi.DivisionHLAPI(new IntegersFactoryImpl().createDivision()));
				OperatorHLAPI totest_integers_Division = elem.getContainerOperatorHLAPI();
				assert totest_integers_Division.getContainedItem().equals(elem.getContainerOperator());
			
				elem.setContainerOperatorHLAPI(new fr.lip6.move.pnml.hlpn.integers.hlapi.ModuloHLAPI(new IntegersFactoryImpl().createModulo()));
				OperatorHLAPI totest_integers_Modulo = elem.getContainerOperatorHLAPI();
				assert totest_integers_Modulo.getContainedItem().equals(elem.getContainerOperator());
			
				elem.setContainerOperatorHLAPI(new fr.lip6.move.pnml.hlpn.integers.hlapi.GreaterThanHLAPI(new IntegersFactoryImpl().createGreaterThan()));
				OperatorHLAPI totest_integers_GreaterThan = elem.getContainerOperatorHLAPI();
				assert totest_integers_GreaterThan.getContainedItem().equals(elem.getContainerOperator());
			
				elem.setContainerOperatorHLAPI(new fr.lip6.move.pnml.hlpn.integers.hlapi.GreaterThanOrEqualHLAPI(new IntegersFactoryImpl().createGreaterThanOrEqual()));
				OperatorHLAPI totest_integers_GreaterThanOrEqual = elem.getContainerOperatorHLAPI();
				assert totest_integers_GreaterThanOrEqual.getContainedItem().equals(elem.getContainerOperator());
			
				elem.setContainerOperatorHLAPI(new fr.lip6.move.pnml.hlpn.integers.hlapi.LessThanHLAPI(new IntegersFactoryImpl().createLessThan()));
				OperatorHLAPI totest_integers_LessThan = elem.getContainerOperatorHLAPI();
				assert totest_integers_LessThan.getContainedItem().equals(elem.getContainerOperator());
			
				elem.setContainerOperatorHLAPI(new fr.lip6.move.pnml.hlpn.integers.hlapi.LessThanOrEqualHLAPI(new IntegersFactoryImpl().createLessThanOrEqual()));
				OperatorHLAPI totest_integers_LessThanOrEqual = elem.getContainerOperatorHLAPI();
				assert totest_integers_LessThanOrEqual.getContainedItem().equals(elem.getContainerOperator());
			
				elem.setContainerOperatorHLAPI(new fr.lip6.move.pnml.hlpn.booleans.hlapi.EqualityHLAPI(new BooleansFactoryImpl().createEquality()));
				OperatorHLAPI totest_booleans_Equality = elem.getContainerOperatorHLAPI();
				assert totest_booleans_Equality.getContainedItem().equals(elem.getContainerOperator());
			
				elem.setContainerOperatorHLAPI(new fr.lip6.move.pnml.hlpn.booleans.hlapi.InequalityHLAPI(new BooleansFactoryImpl().createInequality()));
				OperatorHLAPI totest_booleans_Inequality = elem.getContainerOperatorHLAPI();
				assert totest_booleans_Inequality.getContainedItem().equals(elem.getContainerOperator());
			
				elem.setContainerOperatorHLAPI(new fr.lip6.move.pnml.hlpn.booleans.hlapi.BooleanConstantHLAPI(new BooleansFactoryImpl().createBooleanConstant()));
				OperatorHLAPI totest_booleans_BooleanConstant = elem.getContainerOperatorHLAPI();
				assert totest_booleans_BooleanConstant.getContainedItem().equals(elem.getContainerOperator());
			
				elem.setContainerOperatorHLAPI(new fr.lip6.move.pnml.hlpn.booleans.hlapi.OrHLAPI(new BooleansFactoryImpl().createOr()));
				OperatorHLAPI totest_booleans_Or = elem.getContainerOperatorHLAPI();
				assert totest_booleans_Or.getContainedItem().equals(elem.getContainerOperator());
			
				elem.setContainerOperatorHLAPI(new fr.lip6.move.pnml.hlpn.booleans.hlapi.AndHLAPI(new BooleansFactoryImpl().createAnd()));
				OperatorHLAPI totest_booleans_And = elem.getContainerOperatorHLAPI();
				assert totest_booleans_And.getContainedItem().equals(elem.getContainerOperator());
			
				elem.setContainerOperatorHLAPI(new fr.lip6.move.pnml.hlpn.booleans.hlapi.ImplyHLAPI(new BooleansFactoryImpl().createImply()));
				OperatorHLAPI totest_booleans_Imply = elem.getContainerOperatorHLAPI();
				assert totest_booleans_Imply.getContainedItem().equals(elem.getContainerOperator());
			
				elem.setContainerOperatorHLAPI(new fr.lip6.move.pnml.hlpn.booleans.hlapi.NotHLAPI(new BooleansFactoryImpl().createNot()));
				OperatorHLAPI totest_booleans_Not = elem.getContainerOperatorHLAPI();
				assert totest_booleans_Not.getContainedItem().equals(elem.getContainerOperator());
			
				elem.setContainerOperatorHLAPI(new fr.lip6.move.pnml.hlpn.cyclicEnumerations.hlapi.SuccessorHLAPI(new CyclicEnumerationsFactoryImpl().createSuccessor()));
				OperatorHLAPI totest_cyclicEnumerations_Successor = elem.getContainerOperatorHLAPI();
				assert totest_cyclicEnumerations_Successor.getContainedItem().equals(elem.getContainerOperator());
			
				elem.setContainerOperatorHLAPI(new fr.lip6.move.pnml.hlpn.cyclicEnumerations.hlapi.PredecessorHLAPI(new CyclicEnumerationsFactoryImpl().createPredecessor()));
				OperatorHLAPI totest_cyclicEnumerations_Predecessor = elem.getContainerOperatorHLAPI();
				assert totest_cyclicEnumerations_Predecessor.getContainedItem().equals(elem.getContainerOperator());
			
				elem.setContainerOperatorHLAPI(new fr.lip6.move.pnml.hlpn.dots.hlapi.DotConstantHLAPI(new DotsFactoryImpl().createDotConstant()));
				OperatorHLAPI totest_dots_DotConstant = elem.getContainerOperatorHLAPI();
				assert totest_dots_DotConstant.getContainedItem().equals(elem.getContainerOperator());
			
				elem.setContainerOperatorHLAPI(new fr.lip6.move.pnml.hlpn.finiteIntRanges.hlapi.FiniteIntRangeConstantHLAPI(new FiniteIntRangesFactoryImpl().createFiniteIntRangeConstant()));
				OperatorHLAPI totest_finiteIntRanges_FiniteIntRangeConstant = elem.getContainerOperatorHLAPI();
				assert totest_finiteIntRanges_FiniteIntRangeConstant.getContainedItem().equals(elem.getContainerOperator());
			
				elem.setContainerOperatorHLAPI(new fr.lip6.move.pnml.hlpn.finiteIntRanges.hlapi.LessThanHLAPI(new FiniteIntRangesFactoryImpl().createLessThan()));
				OperatorHLAPI totest_finiteIntRanges_LessThan = elem.getContainerOperatorHLAPI();
				assert totest_finiteIntRanges_LessThan.getContainedItem().equals(elem.getContainerOperator());
			
				elem.setContainerOperatorHLAPI(new fr.lip6.move.pnml.hlpn.finiteIntRanges.hlapi.GreaterThanHLAPI(new FiniteIntRangesFactoryImpl().createGreaterThan()));
				OperatorHLAPI totest_finiteIntRanges_GreaterThan = elem.getContainerOperatorHLAPI();
				assert totest_finiteIntRanges_GreaterThan.getContainedItem().equals(elem.getContainerOperator());
			
				elem.setContainerOperatorHLAPI(new fr.lip6.move.pnml.hlpn.finiteIntRanges.hlapi.LessThanOrEqualHLAPI(new FiniteIntRangesFactoryImpl().createLessThanOrEqual()));
				OperatorHLAPI totest_finiteIntRanges_LessThanOrEqual = elem.getContainerOperatorHLAPI();
				assert totest_finiteIntRanges_LessThanOrEqual.getContainedItem().equals(elem.getContainerOperator());
			
				elem.setContainerOperatorHLAPI(new fr.lip6.move.pnml.hlpn.finiteIntRanges.hlapi.GreaterThanOrEqualHLAPI(new FiniteIntRangesFactoryImpl().createGreaterThanOrEqual()));
				OperatorHLAPI totest_finiteIntRanges_GreaterThanOrEqual = elem.getContainerOperatorHLAPI();
				assert totest_finiteIntRanges_GreaterThanOrEqual.getContainedItem().equals(elem.getContainerOperator());
			
				elem.setContainerOperatorHLAPI(new fr.lip6.move.pnml.hlpn.lists.hlapi.EmptyListHLAPI(new ListsFactoryImpl().createEmptyList()));
				OperatorHLAPI totest_lists_EmptyList = elem.getContainerOperatorHLAPI();
				assert totest_lists_EmptyList.getContainedItem().equals(elem.getContainerOperator());
			
				elem.setContainerOperatorHLAPI(new fr.lip6.move.pnml.hlpn.lists.hlapi.AppendHLAPI(new ListsFactoryImpl().createAppend()));
				OperatorHLAPI totest_lists_Append = elem.getContainerOperatorHLAPI();
				assert totest_lists_Append.getContainedItem().equals(elem.getContainerOperator());
			
				elem.setContainerOperatorHLAPI(new fr.lip6.move.pnml.hlpn.lists.hlapi.ConcatenationHLAPI(new ListsFactoryImpl().createConcatenation()));
				OperatorHLAPI totest_lists_Concatenation = elem.getContainerOperatorHLAPI();
				assert totest_lists_Concatenation.getContainedItem().equals(elem.getContainerOperator());
			
				elem.setContainerOperatorHLAPI(new fr.lip6.move.pnml.hlpn.lists.hlapi.LengthHLAPI(new ListsFactoryImpl().createLength()));
				OperatorHLAPI totest_lists_Length = elem.getContainerOperatorHLAPI();
				assert totest_lists_Length.getContainedItem().equals(elem.getContainerOperator());
			
				elem.setContainerOperatorHLAPI(new fr.lip6.move.pnml.hlpn.lists.hlapi.MakeListHLAPI(new ListsFactoryImpl().createMakeList()));
				OperatorHLAPI totest_lists_MakeList = elem.getContainerOperatorHLAPI();
				assert totest_lists_MakeList.getContainedItem().equals(elem.getContainerOperator());
			
				elem.setContainerOperatorHLAPI(new fr.lip6.move.pnml.hlpn.lists.hlapi.MemberAtIndexHLAPI(new ListsFactoryImpl().createMemberAtIndex()));
				OperatorHLAPI totest_lists_MemberAtIndex = elem.getContainerOperatorHLAPI();
				assert totest_lists_MemberAtIndex.getContainedItem().equals(elem.getContainerOperator());
			
				elem.setContainerOperatorHLAPI(new fr.lip6.move.pnml.hlpn.lists.hlapi.SublistHLAPI(new ListsFactoryImpl().createSublist()));
				OperatorHLAPI totest_lists_Sublist = elem.getContainerOperatorHLAPI();
				assert totest_lists_Sublist.getContainedItem().equals(elem.getContainerOperator());
			
				elem.setContainerOperatorHLAPI(new fr.lip6.move.pnml.hlpn.multisets.hlapi.CardinalityHLAPI(new MultisetsFactoryImpl().createCardinality()));
				OperatorHLAPI totest_multisets_Cardinality = elem.getContainerOperatorHLAPI();
				assert totest_multisets_Cardinality.getContainedItem().equals(elem.getContainerOperator());
			
				elem.setContainerOperatorHLAPI(new fr.lip6.move.pnml.hlpn.multisets.hlapi.ContainsHLAPI(new MultisetsFactoryImpl().createContains()));
				OperatorHLAPI totest_multisets_Contains = elem.getContainerOperatorHLAPI();
				assert totest_multisets_Contains.getContainedItem().equals(elem.getContainerOperator());
			
				elem.setContainerOperatorHLAPI(new fr.lip6.move.pnml.hlpn.multisets.hlapi.CardinalityOfHLAPI(new MultisetsFactoryImpl().createCardinalityOf()));
				OperatorHLAPI totest_multisets_CardinalityOf = elem.getContainerOperatorHLAPI();
				assert totest_multisets_CardinalityOf.getContainedItem().equals(elem.getContainerOperator());
			
				elem.setContainerOperatorHLAPI(new fr.lip6.move.pnml.hlpn.multisets.hlapi.AddHLAPI(new MultisetsFactoryImpl().createAdd()));
				OperatorHLAPI totest_multisets_Add = elem.getContainerOperatorHLAPI();
				assert totest_multisets_Add.getContainedItem().equals(elem.getContainerOperator());
			
				elem.setContainerOperatorHLAPI(new fr.lip6.move.pnml.hlpn.multisets.hlapi.AllHLAPI(new MultisetsFactoryImpl().createAll()));
				OperatorHLAPI totest_multisets_All = elem.getContainerOperatorHLAPI();
				assert totest_multisets_All.getContainedItem().equals(elem.getContainerOperator());
			
				elem.setContainerOperatorHLAPI(new fr.lip6.move.pnml.hlpn.multisets.hlapi.EmptyHLAPI(new MultisetsFactoryImpl().createEmpty()));
				OperatorHLAPI totest_multisets_Empty = elem.getContainerOperatorHLAPI();
				assert totest_multisets_Empty.getContainedItem().equals(elem.getContainerOperator());
			
				elem.setContainerOperatorHLAPI(new fr.lip6.move.pnml.hlpn.multisets.hlapi.NumberOfHLAPI(new MultisetsFactoryImpl().createNumberOf()));
				OperatorHLAPI totest_multisets_NumberOf = elem.getContainerOperatorHLAPI();
				assert totest_multisets_NumberOf.getContainedItem().equals(elem.getContainerOperator());
			
				elem.setContainerOperatorHLAPI(new fr.lip6.move.pnml.hlpn.multisets.hlapi.SubtractHLAPI(new MultisetsFactoryImpl().createSubtract()));
				OperatorHLAPI totest_multisets_Subtract = elem.getContainerOperatorHLAPI();
				assert totest_multisets_Subtract.getContainedItem().equals(elem.getContainerOperator());
			
				elem.setContainerOperatorHLAPI(new fr.lip6.move.pnml.hlpn.multisets.hlapi.ScalarProductHLAPI(new MultisetsFactoryImpl().createScalarProduct()));
				OperatorHLAPI totest_multisets_ScalarProduct = elem.getContainerOperatorHLAPI();
				assert totest_multisets_ScalarProduct.getContainedItem().equals(elem.getContainerOperator());
			
				elem.setContainerOperatorHLAPI(new fr.lip6.move.pnml.hlpn.partitions.hlapi.GreaterThanHLAPI(new PartitionsFactoryImpl().createGreaterThan()));
				OperatorHLAPI totest_partitions_GreaterThan = elem.getContainerOperatorHLAPI();
				assert totest_partitions_GreaterThan.getContainedItem().equals(elem.getContainerOperator());
			
				elem.setContainerOperatorHLAPI(new fr.lip6.move.pnml.hlpn.partitions.hlapi.PartitionElementOfHLAPI(new PartitionsFactoryImpl().createPartitionElementOf()));
				OperatorHLAPI totest_partitions_PartitionElementOf = elem.getContainerOperatorHLAPI();
				assert totest_partitions_PartitionElementOf.getContainedItem().equals(elem.getContainerOperator());
			
				elem.setContainerOperatorHLAPI(new fr.lip6.move.pnml.hlpn.partitions.hlapi.LessThanHLAPI(new PartitionsFactoryImpl().createLessThan()));
				OperatorHLAPI totest_partitions_LessThan = elem.getContainerOperatorHLAPI();
				assert totest_partitions_LessThan.getContainedItem().equals(elem.getContainerOperator());
			
				elem.setContainerOperatorHLAPI(new fr.lip6.move.pnml.hlpn.strings.hlapi.StringConstantHLAPI(new StringsFactoryImpl().createStringConstant()));
				OperatorHLAPI totest_strings_StringConstant = elem.getContainerOperatorHLAPI();
				assert totest_strings_StringConstant.getContainedItem().equals(elem.getContainerOperator());
			
				elem.setContainerOperatorHLAPI(new fr.lip6.move.pnml.hlpn.strings.hlapi.AppendHLAPI(new StringsFactoryImpl().createAppend()));
				OperatorHLAPI totest_strings_Append = elem.getContainerOperatorHLAPI();
				assert totest_strings_Append.getContainedItem().equals(elem.getContainerOperator());
			
				elem.setContainerOperatorHLAPI(new fr.lip6.move.pnml.hlpn.strings.hlapi.ConcatenationHLAPI(new StringsFactoryImpl().createConcatenation()));
				OperatorHLAPI totest_strings_Concatenation = elem.getContainerOperatorHLAPI();
				assert totest_strings_Concatenation.getContainedItem().equals(elem.getContainerOperator());
			
				elem.setContainerOperatorHLAPI(new fr.lip6.move.pnml.hlpn.strings.hlapi.GreaterThanHLAPI(new StringsFactoryImpl().createGreaterThan()));
				OperatorHLAPI totest_strings_GreaterThan = elem.getContainerOperatorHLAPI();
				assert totest_strings_GreaterThan.getContainedItem().equals(elem.getContainerOperator());
			
				elem.setContainerOperatorHLAPI(new fr.lip6.move.pnml.hlpn.strings.hlapi.GreaterThanOrEqualHLAPI(new StringsFactoryImpl().createGreaterThanOrEqual()));
				OperatorHLAPI totest_strings_GreaterThanOrEqual = elem.getContainerOperatorHLAPI();
				assert totest_strings_GreaterThanOrEqual.getContainedItem().equals(elem.getContainerOperator());
			
				elem.setContainerOperatorHLAPI(new fr.lip6.move.pnml.hlpn.strings.hlapi.LessThanHLAPI(new StringsFactoryImpl().createLessThan()));
				OperatorHLAPI totest_strings_LessThan = elem.getContainerOperatorHLAPI();
				assert totest_strings_LessThan.getContainedItem().equals(elem.getContainerOperator());
			
				elem.setContainerOperatorHLAPI(new fr.lip6.move.pnml.hlpn.strings.hlapi.LessThanOrEqualHLAPI(new StringsFactoryImpl().createLessThanOrEqual()));
				OperatorHLAPI totest_strings_LessThanOrEqual = elem.getContainerOperatorHLAPI();
				assert totest_strings_LessThanOrEqual.getContainedItem().equals(elem.getContainerOperator());
			
				elem.setContainerOperatorHLAPI(new fr.lip6.move.pnml.hlpn.strings.hlapi.LengthHLAPI(new StringsFactoryImpl().createLength()));
				OperatorHLAPI totest_strings_Length = elem.getContainerOperatorHLAPI();
				assert totest_strings_Length.getContainedItem().equals(elem.getContainerOperator());
			
				elem.setContainerOperatorHLAPI(new fr.lip6.move.pnml.hlpn.strings.hlapi.SubstringHLAPI(new StringsFactoryImpl().createSubstring()));
				OperatorHLAPI totest_strings_Substring = elem.getContainerOperatorHLAPI();
				assert totest_strings_Substring.getContainedItem().equals(elem.getContainerOperator());
			
				elem.setContainerOperatorHLAPI(new fr.lip6.move.pnml.hlpn.terms.hlapi.TupleHLAPI(new TermsFactoryImpl().createTuple()));
				OperatorHLAPI totest_terms_Tuple = elem.getContainerOperatorHLAPI();
				assert totest_terms_Tuple.getContainedItem().equals(elem.getContainerOperator());
			
				elem.setContainerOperatorHLAPI(new fr.lip6.move.pnml.hlpn.terms.hlapi.UserOperatorHLAPI(new TermsFactoryImpl().createUserOperator()));
				OperatorHLAPI totest_terms_UserOperator = elem.getContainerOperatorHLAPI();
				assert totest_terms_UserOperator.getContainedItem().equals(elem.getContainerOperator());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "ModuloHLAPI"})
		public void getContainerNamedOperatorHLAPITest(){
			ModuloHLAPI elem = new ModuloHLAPI(new IntegersFactoryImpl().createModulo());

			
				elem.setContainerNamedOperatorHLAPI(itemcontainerNamedOperator);
				NamedOperatorHLAPI totest = elem.getContainerNamedOperatorHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerNamedOperator());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "ModuloHLAPI"})
		public void getContainerHLMarkingHLAPITest(){
			ModuloHLAPI elem = new ModuloHLAPI(new IntegersFactoryImpl().createModulo());

			
				elem.setContainerHLMarkingHLAPI(itemcontainerHLMarking);
				HLMarkingHLAPI totest = elem.getContainerHLMarkingHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerHLMarking());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "ModuloHLAPI"})
		public void getContainerConditionHLAPITest(){
			ModuloHLAPI elem = new ModuloHLAPI(new IntegersFactoryImpl().createModulo());

			
				elem.setContainerConditionHLAPI(itemcontainerCondition);
				ConditionHLAPI totest = elem.getContainerConditionHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerCondition());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "ModuloHLAPI"})
		public void getContainerHLAnnotationHLAPITest(){
			ModuloHLAPI elem = new ModuloHLAPI(new IntegersFactoryImpl().createModulo());

			
				elem.setContainerHLAnnotationHLAPI(itemcontainerHLAnnotation);
				HLAnnotationHLAPI totest = elem.getContainerHLAnnotationHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerHLAnnotation());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "ModuloHLAPI"})
		public void getContainerPartitionElementHLAPITest(){
			ModuloHLAPI elem = new ModuloHLAPI(new IntegersFactoryImpl().createModulo());

			
				elem.setContainerPartitionElementHLAPI(itemcontainerPartitionElement);
				PartitionElementHLAPI totest = elem.getContainerPartitionElementHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerPartitionElement());
			
		}
	
	

	
		/**
		 * This test add a random number of desired objet in the list or of one of each existing subtypes.
		 * then test how many objet are retuned and if any exist inthe original list.
		 */
		@Test(groups = { "hlapi", "ModuloHLAPI"})
		public void getSubtermHLAPITest(){
			Modulo llapi = new IntegersFactoryImpl().createModulo();
			int howmany;
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createNumberConstant()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createAddition()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createSubtraction()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createMultiplication()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createDivision()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createModulo()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getSubterm().add(
			   new CyclicEnumerationsFactoryImpl().createSuccessor()
			);
			
			llapi.getSubterm().add(
			   new CyclicEnumerationsFactoryImpl().createPredecessor()
			);
			
			llapi.getSubterm().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRangeConstant()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createEmptyList()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createAppend()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createConcatenation()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createLength()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createMakeList()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createMemberAtIndex()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createSublist()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createStringConstant()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createAppend()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createConcatenation()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLength()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createSubstring()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany = 56;
			

			ModuloHLAPI elem = new ModuloHLAPI(llapi);
			List<TermHLAPI> totest = elem.getSubtermHLAPI();

			assert totest.size() == howmany;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "ModuloHLAPI"})
		public void getOutputHLAPITest(){
			ModuloHLAPI elem = new ModuloHLAPI(new IntegersFactoryImpl().createModulo());

			
				elem.setOutputHLAPI(new fr.lip6.move.pnml.hlpn.integers.hlapi.NaturalHLAPI(new IntegersFactoryImpl().createNatural()));
				SortHLAPI totest_integers_Natural = elem.getOutputHLAPI();
				assert totest_integers_Natural.getContainedItem().equals(elem.getOutput());
			
				elem.setOutputHLAPI(new fr.lip6.move.pnml.hlpn.integers.hlapi.PositiveHLAPI(new IntegersFactoryImpl().createPositive()));
				SortHLAPI totest_integers_Positive = elem.getOutputHLAPI();
				assert totest_integers_Positive.getContainedItem().equals(elem.getOutput());
			
				elem.setOutputHLAPI(new fr.lip6.move.pnml.hlpn.integers.hlapi.HLIntegerHLAPI(new IntegersFactoryImpl().createHLInteger()));
				SortHLAPI totest_integers_HLInteger = elem.getOutputHLAPI();
				assert totest_integers_HLInteger.getContainedItem().equals(elem.getOutput());
			
				elem.setOutputHLAPI(new fr.lip6.move.pnml.hlpn.arbitrarydeclarations.hlapi.AnySortHLAPI(new ArbitrarydeclarationsFactoryImpl().createAnySort()));
				SortHLAPI totest_arbitrarydeclarations_AnySort = elem.getOutputHLAPI();
				assert totest_arbitrarydeclarations_AnySort.getContainedItem().equals(elem.getOutput());
			
				elem.setOutputHLAPI(new fr.lip6.move.pnml.hlpn.booleans.hlapi.BoolHLAPI(new BooleansFactoryImpl().createBool()));
				SortHLAPI totest_booleans_Bool = elem.getOutputHLAPI();
				assert totest_booleans_Bool.getContainedItem().equals(elem.getOutput());
			
				elem.setOutputHLAPI(new fr.lip6.move.pnml.hlpn.cyclicEnumerations.hlapi.CyclicEnumerationHLAPI(new CyclicEnumerationsFactoryImpl().createCyclicEnumeration()));
				SortHLAPI totest_cyclicEnumerations_CyclicEnumeration = elem.getOutputHLAPI();
				assert totest_cyclicEnumerations_CyclicEnumeration.getContainedItem().equals(elem.getOutput());
			
				elem.setOutputHLAPI(new fr.lip6.move.pnml.hlpn.dots.hlapi.DotHLAPI(new DotsFactoryImpl().createDot()));
				SortHLAPI totest_dots_Dot = elem.getOutputHLAPI();
				assert totest_dots_Dot.getContainedItem().equals(elem.getOutput());
			
				elem.setOutputHLAPI(new fr.lip6.move.pnml.hlpn.finiteEnumerations.hlapi.FiniteEnumerationHLAPI(new FiniteEnumerationsFactoryImpl().createFiniteEnumeration()));
				SortHLAPI totest_finiteEnumerations_FiniteEnumeration = elem.getOutputHLAPI();
				assert totest_finiteEnumerations_FiniteEnumeration.getContainedItem().equals(elem.getOutput());
			
				elem.setOutputHLAPI(new fr.lip6.move.pnml.hlpn.finiteIntRanges.hlapi.FiniteIntRangeHLAPI(new FiniteIntRangesFactoryImpl().createFiniteIntRange()));
				SortHLAPI totest_finiteIntRanges_FiniteIntRange = elem.getOutputHLAPI();
				assert totest_finiteIntRanges_FiniteIntRange.getContainedItem().equals(elem.getOutput());
			
				elem.setOutputHLAPI(new fr.lip6.move.pnml.hlpn.lists.hlapi.HLPNListHLAPI(new ListsFactoryImpl().createHLPNList()));
				SortHLAPI totest_lists_HLPNList = elem.getOutputHLAPI();
				assert totest_lists_HLPNList.getContainedItem().equals(elem.getOutput());
			
				elem.setOutputHLAPI(new fr.lip6.move.pnml.hlpn.strings.hlapi.HLPNStringHLAPI(new StringsFactoryImpl().createHLPNString()));
				SortHLAPI totest_strings_HLPNString = elem.getOutputHLAPI();
				assert totest_strings_HLPNString.getContainedItem().equals(elem.getOutput());
			
				elem.setOutputHLAPI(new fr.lip6.move.pnml.hlpn.terms.hlapi.MultisetSortHLAPI(new TermsFactoryImpl().createMultisetSort()));
				SortHLAPI totest_terms_MultisetSort = elem.getOutputHLAPI();
				assert totest_terms_MultisetSort.getContainedItem().equals(elem.getOutput());
			
				elem.setOutputHLAPI(new fr.lip6.move.pnml.hlpn.terms.hlapi.ProductSortHLAPI(new TermsFactoryImpl().createProductSort()));
				SortHLAPI totest_terms_ProductSort = elem.getOutputHLAPI();
				assert totest_terms_ProductSort.getContainedItem().equals(elem.getOutput());
			
				elem.setOutputHLAPI(new fr.lip6.move.pnml.hlpn.terms.hlapi.UserSortHLAPI(new TermsFactoryImpl().createUserSort()));
				SortHLAPI totest_terms_UserSort = elem.getOutputHLAPI();
				assert totest_terms_UserSort.getContainedItem().equals(elem.getOutput());
			
		}
	
	

	
		/**
		 * This test add a random number of desired objet in the list or of one of each existing subtypes.
		 * then test how many objet are retuned and if any exist inthe original list.
		 */
		@Test(groups = { "hlapi", "ModuloHLAPI"})
		public void getInputHLAPITest(){
			Modulo llapi = new IntegersFactoryImpl().createModulo();
			int howmany;
			
			llapi.getInput().add(
			   new IntegersFactoryImpl().createNatural()
			);
			
			llapi.getInput().add(
			   new IntegersFactoryImpl().createPositive()
			);
			
			llapi.getInput().add(
			   new IntegersFactoryImpl().createHLInteger()
			);
			
			llapi.getInput().add(
			   new ArbitrarydeclarationsFactoryImpl().createAnySort()
			);
			
			llapi.getInput().add(
			   new BooleansFactoryImpl().createBool()
			);
			
			llapi.getInput().add(
			   new CyclicEnumerationsFactoryImpl().createCyclicEnumeration()
			);
			
			llapi.getInput().add(
			   new DotsFactoryImpl().createDot()
			);
			
			llapi.getInput().add(
			   new FiniteEnumerationsFactoryImpl().createFiniteEnumeration()
			);
			
			llapi.getInput().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRange()
			);
			
			llapi.getInput().add(
			   new ListsFactoryImpl().createHLPNList()
			);
			
			llapi.getInput().add(
			   new StringsFactoryImpl().createHLPNString()
			);
			
			llapi.getInput().add(
			   new TermsFactoryImpl().createMultisetSort()
			);
			
			llapi.getInput().add(
			   new TermsFactoryImpl().createProductSort()
			);
			
			llapi.getInput().add(
			   new TermsFactoryImpl().createUserSort()
			);
			
			howmany = 14;
			

			ModuloHLAPI elem = new ModuloHLAPI(llapi);
			List<SortHLAPI> totest = elem.getInputHLAPI();

			assert totest.size() == howmany;

			for (SortHLAPI unit : totest) {
             assert llapi.getInput().contains(unit.getContainedItem()) : "missing element";
         }
		}
	

	//Special getter for list of generics object, return only one object type.
	
	
	
	
	
	
	
	
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "ModuloHLAPI"})
		public void getSubterm_integers_NumberConstantHLAPITest(){
			Modulo llapi = new IntegersFactoryImpl().createModulo();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new IntegersFactoryImpl().createNumberConstant());
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createNumberConstant()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createAddition()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createSubtraction()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createMultiplication()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createDivision()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createModulo()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getSubterm().add(
			   new CyclicEnumerationsFactoryImpl().createSuccessor()
			);
			
			llapi.getSubterm().add(
			   new CyclicEnumerationsFactoryImpl().createPredecessor()
			);
			
			llapi.getSubterm().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRangeConstant()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createEmptyList()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createAppend()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createConcatenation()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createLength()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createMakeList()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createMemberAtIndex()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createSublist()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createStringConstant()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createAppend()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createConcatenation()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLength()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createSubstring()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 56;

			ModuloHLAPI elem = new ModuloHLAPI(llapi);
			List<fr.lip6.move.pnml.hlpn.integers.hlapi.NumberConstantHLAPI> totest = elem.getSubterm_integers_NumberConstantHLAPI();

			assert totest.size() == howmany + 1 - 56;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "ModuloHLAPI"})
		public void getSubterm_integers_AdditionHLAPITest(){
			Modulo llapi = new IntegersFactoryImpl().createModulo();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new IntegersFactoryImpl().createAddition());
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createNumberConstant()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createAddition()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createSubtraction()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createMultiplication()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createDivision()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createModulo()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getSubterm().add(
			   new CyclicEnumerationsFactoryImpl().createSuccessor()
			);
			
			llapi.getSubterm().add(
			   new CyclicEnumerationsFactoryImpl().createPredecessor()
			);
			
			llapi.getSubterm().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRangeConstant()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createEmptyList()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createAppend()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createConcatenation()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createLength()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createMakeList()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createMemberAtIndex()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createSublist()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createStringConstant()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createAppend()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createConcatenation()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLength()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createSubstring()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 56;

			ModuloHLAPI elem = new ModuloHLAPI(llapi);
			List<fr.lip6.move.pnml.hlpn.integers.hlapi.AdditionHLAPI> totest = elem.getSubterm_integers_AdditionHLAPI();

			assert totest.size() == howmany + 1 - 56;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "ModuloHLAPI"})
		public void getSubterm_integers_SubtractionHLAPITest(){
			Modulo llapi = new IntegersFactoryImpl().createModulo();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new IntegersFactoryImpl().createSubtraction());
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createNumberConstant()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createAddition()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createSubtraction()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createMultiplication()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createDivision()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createModulo()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getSubterm().add(
			   new CyclicEnumerationsFactoryImpl().createSuccessor()
			);
			
			llapi.getSubterm().add(
			   new CyclicEnumerationsFactoryImpl().createPredecessor()
			);
			
			llapi.getSubterm().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRangeConstant()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createEmptyList()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createAppend()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createConcatenation()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createLength()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createMakeList()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createMemberAtIndex()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createSublist()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createStringConstant()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createAppend()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createConcatenation()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLength()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createSubstring()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 56;

			ModuloHLAPI elem = new ModuloHLAPI(llapi);
			List<fr.lip6.move.pnml.hlpn.integers.hlapi.SubtractionHLAPI> totest = elem.getSubterm_integers_SubtractionHLAPI();

			assert totest.size() == howmany + 1 - 56;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "ModuloHLAPI"})
		public void getSubterm_integers_MultiplicationHLAPITest(){
			Modulo llapi = new IntegersFactoryImpl().createModulo();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new IntegersFactoryImpl().createMultiplication());
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createNumberConstant()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createAddition()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createSubtraction()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createMultiplication()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createDivision()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createModulo()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getSubterm().add(
			   new CyclicEnumerationsFactoryImpl().createSuccessor()
			);
			
			llapi.getSubterm().add(
			   new CyclicEnumerationsFactoryImpl().createPredecessor()
			);
			
			llapi.getSubterm().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRangeConstant()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createEmptyList()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createAppend()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createConcatenation()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createLength()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createMakeList()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createMemberAtIndex()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createSublist()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createStringConstant()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createAppend()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createConcatenation()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLength()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createSubstring()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 56;

			ModuloHLAPI elem = new ModuloHLAPI(llapi);
			List<fr.lip6.move.pnml.hlpn.integers.hlapi.MultiplicationHLAPI> totest = elem.getSubterm_integers_MultiplicationHLAPI();

			assert totest.size() == howmany + 1 - 56;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "ModuloHLAPI"})
		public void getSubterm_integers_DivisionHLAPITest(){
			Modulo llapi = new IntegersFactoryImpl().createModulo();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new IntegersFactoryImpl().createDivision());
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createNumberConstant()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createAddition()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createSubtraction()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createMultiplication()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createDivision()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createModulo()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getSubterm().add(
			   new CyclicEnumerationsFactoryImpl().createSuccessor()
			);
			
			llapi.getSubterm().add(
			   new CyclicEnumerationsFactoryImpl().createPredecessor()
			);
			
			llapi.getSubterm().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRangeConstant()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createEmptyList()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createAppend()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createConcatenation()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createLength()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createMakeList()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createMemberAtIndex()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createSublist()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createStringConstant()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createAppend()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createConcatenation()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLength()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createSubstring()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 56;

			ModuloHLAPI elem = new ModuloHLAPI(llapi);
			List<fr.lip6.move.pnml.hlpn.integers.hlapi.DivisionHLAPI> totest = elem.getSubterm_integers_DivisionHLAPI();

			assert totest.size() == howmany + 1 - 56;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "ModuloHLAPI"})
		public void getSubterm_integers_ModuloHLAPITest(){
			Modulo llapi = new IntegersFactoryImpl().createModulo();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new IntegersFactoryImpl().createModulo());
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createNumberConstant()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createAddition()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createSubtraction()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createMultiplication()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createDivision()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createModulo()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getSubterm().add(
			   new CyclicEnumerationsFactoryImpl().createSuccessor()
			);
			
			llapi.getSubterm().add(
			   new CyclicEnumerationsFactoryImpl().createPredecessor()
			);
			
			llapi.getSubterm().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRangeConstant()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createEmptyList()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createAppend()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createConcatenation()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createLength()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createMakeList()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createMemberAtIndex()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createSublist()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createStringConstant()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createAppend()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createConcatenation()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLength()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createSubstring()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 56;

			ModuloHLAPI elem = new ModuloHLAPI(llapi);
			List<fr.lip6.move.pnml.hlpn.integers.hlapi.ModuloHLAPI> totest = elem.getSubterm_integers_ModuloHLAPI();

			assert totest.size() == howmany + 1 - 56;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "ModuloHLAPI"})
		public void getSubterm_integers_GreaterThanHLAPITest(){
			Modulo llapi = new IntegersFactoryImpl().createModulo();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new IntegersFactoryImpl().createGreaterThan());
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createNumberConstant()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createAddition()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createSubtraction()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createMultiplication()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createDivision()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createModulo()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getSubterm().add(
			   new CyclicEnumerationsFactoryImpl().createSuccessor()
			);
			
			llapi.getSubterm().add(
			   new CyclicEnumerationsFactoryImpl().createPredecessor()
			);
			
			llapi.getSubterm().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRangeConstant()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createEmptyList()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createAppend()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createConcatenation()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createLength()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createMakeList()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createMemberAtIndex()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createSublist()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createStringConstant()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createAppend()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createConcatenation()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLength()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createSubstring()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 56;

			ModuloHLAPI elem = new ModuloHLAPI(llapi);
			List<fr.lip6.move.pnml.hlpn.integers.hlapi.GreaterThanHLAPI> totest = elem.getSubterm_integers_GreaterThanHLAPI();

			assert totest.size() == howmany + 1 - 56;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "ModuloHLAPI"})
		public void getSubterm_integers_GreaterThanOrEqualHLAPITest(){
			Modulo llapi = new IntegersFactoryImpl().createModulo();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new IntegersFactoryImpl().createGreaterThanOrEqual());
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createNumberConstant()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createAddition()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createSubtraction()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createMultiplication()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createDivision()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createModulo()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getSubterm().add(
			   new CyclicEnumerationsFactoryImpl().createSuccessor()
			);
			
			llapi.getSubterm().add(
			   new CyclicEnumerationsFactoryImpl().createPredecessor()
			);
			
			llapi.getSubterm().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRangeConstant()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createEmptyList()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createAppend()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createConcatenation()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createLength()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createMakeList()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createMemberAtIndex()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createSublist()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createStringConstant()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createAppend()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createConcatenation()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLength()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createSubstring()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 56;

			ModuloHLAPI elem = new ModuloHLAPI(llapi);
			List<fr.lip6.move.pnml.hlpn.integers.hlapi.GreaterThanOrEqualHLAPI> totest = elem.getSubterm_integers_GreaterThanOrEqualHLAPI();

			assert totest.size() == howmany + 1 - 56;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "ModuloHLAPI"})
		public void getSubterm_integers_LessThanHLAPITest(){
			Modulo llapi = new IntegersFactoryImpl().createModulo();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new IntegersFactoryImpl().createLessThan());
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createNumberConstant()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createAddition()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createSubtraction()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createMultiplication()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createDivision()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createModulo()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getSubterm().add(
			   new CyclicEnumerationsFactoryImpl().createSuccessor()
			);
			
			llapi.getSubterm().add(
			   new CyclicEnumerationsFactoryImpl().createPredecessor()
			);
			
			llapi.getSubterm().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRangeConstant()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createEmptyList()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createAppend()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createConcatenation()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createLength()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createMakeList()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createMemberAtIndex()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createSublist()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createStringConstant()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createAppend()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createConcatenation()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLength()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createSubstring()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 56;

			ModuloHLAPI elem = new ModuloHLAPI(llapi);
			List<fr.lip6.move.pnml.hlpn.integers.hlapi.LessThanHLAPI> totest = elem.getSubterm_integers_LessThanHLAPI();

			assert totest.size() == howmany + 1 - 56;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "ModuloHLAPI"})
		public void getSubterm_integers_LessThanOrEqualHLAPITest(){
			Modulo llapi = new IntegersFactoryImpl().createModulo();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new IntegersFactoryImpl().createLessThanOrEqual());
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createNumberConstant()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createAddition()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createSubtraction()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createMultiplication()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createDivision()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createModulo()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getSubterm().add(
			   new CyclicEnumerationsFactoryImpl().createSuccessor()
			);
			
			llapi.getSubterm().add(
			   new CyclicEnumerationsFactoryImpl().createPredecessor()
			);
			
			llapi.getSubterm().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRangeConstant()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createEmptyList()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createAppend()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createConcatenation()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createLength()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createMakeList()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createMemberAtIndex()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createSublist()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createStringConstant()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createAppend()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createConcatenation()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLength()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createSubstring()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 56;

			ModuloHLAPI elem = new ModuloHLAPI(llapi);
			List<fr.lip6.move.pnml.hlpn.integers.hlapi.LessThanOrEqualHLAPI> totest = elem.getSubterm_integers_LessThanOrEqualHLAPI();

			assert totest.size() == howmany + 1 - 56;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "ModuloHLAPI"})
		public void getSubterm_booleans_EqualityHLAPITest(){
			Modulo llapi = new IntegersFactoryImpl().createModulo();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new BooleansFactoryImpl().createEquality());
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createNumberConstant()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createAddition()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createSubtraction()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createMultiplication()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createDivision()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createModulo()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getSubterm().add(
			   new CyclicEnumerationsFactoryImpl().createSuccessor()
			);
			
			llapi.getSubterm().add(
			   new CyclicEnumerationsFactoryImpl().createPredecessor()
			);
			
			llapi.getSubterm().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRangeConstant()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createEmptyList()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createAppend()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createConcatenation()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createLength()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createMakeList()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createMemberAtIndex()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createSublist()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createStringConstant()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createAppend()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createConcatenation()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLength()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createSubstring()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 56;

			ModuloHLAPI elem = new ModuloHLAPI(llapi);
			List<fr.lip6.move.pnml.hlpn.booleans.hlapi.EqualityHLAPI> totest = elem.getSubterm_booleans_EqualityHLAPI();

			assert totest.size() == howmany + 1 - 56;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "ModuloHLAPI"})
		public void getSubterm_booleans_InequalityHLAPITest(){
			Modulo llapi = new IntegersFactoryImpl().createModulo();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new BooleansFactoryImpl().createInequality());
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createNumberConstant()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createAddition()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createSubtraction()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createMultiplication()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createDivision()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createModulo()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getSubterm().add(
			   new CyclicEnumerationsFactoryImpl().createSuccessor()
			);
			
			llapi.getSubterm().add(
			   new CyclicEnumerationsFactoryImpl().createPredecessor()
			);
			
			llapi.getSubterm().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRangeConstant()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createEmptyList()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createAppend()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createConcatenation()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createLength()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createMakeList()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createMemberAtIndex()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createSublist()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createStringConstant()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createAppend()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createConcatenation()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLength()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createSubstring()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 56;

			ModuloHLAPI elem = new ModuloHLAPI(llapi);
			List<fr.lip6.move.pnml.hlpn.booleans.hlapi.InequalityHLAPI> totest = elem.getSubterm_booleans_InequalityHLAPI();

			assert totest.size() == howmany + 1 - 56;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "ModuloHLAPI"})
		public void getSubterm_booleans_BooleanConstantHLAPITest(){
			Modulo llapi = new IntegersFactoryImpl().createModulo();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new BooleansFactoryImpl().createBooleanConstant());
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createNumberConstant()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createAddition()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createSubtraction()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createMultiplication()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createDivision()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createModulo()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getSubterm().add(
			   new CyclicEnumerationsFactoryImpl().createSuccessor()
			);
			
			llapi.getSubterm().add(
			   new CyclicEnumerationsFactoryImpl().createPredecessor()
			);
			
			llapi.getSubterm().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRangeConstant()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createEmptyList()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createAppend()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createConcatenation()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createLength()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createMakeList()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createMemberAtIndex()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createSublist()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createStringConstant()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createAppend()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createConcatenation()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLength()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createSubstring()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 56;

			ModuloHLAPI elem = new ModuloHLAPI(llapi);
			List<fr.lip6.move.pnml.hlpn.booleans.hlapi.BooleanConstantHLAPI> totest = elem.getSubterm_booleans_BooleanConstantHLAPI();

			assert totest.size() == howmany + 1 - 56;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "ModuloHLAPI"})
		public void getSubterm_booleans_OrHLAPITest(){
			Modulo llapi = new IntegersFactoryImpl().createModulo();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new BooleansFactoryImpl().createOr());
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createNumberConstant()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createAddition()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createSubtraction()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createMultiplication()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createDivision()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createModulo()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getSubterm().add(
			   new CyclicEnumerationsFactoryImpl().createSuccessor()
			);
			
			llapi.getSubterm().add(
			   new CyclicEnumerationsFactoryImpl().createPredecessor()
			);
			
			llapi.getSubterm().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRangeConstant()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createEmptyList()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createAppend()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createConcatenation()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createLength()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createMakeList()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createMemberAtIndex()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createSublist()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createStringConstant()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createAppend()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createConcatenation()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLength()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createSubstring()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 56;

			ModuloHLAPI elem = new ModuloHLAPI(llapi);
			List<fr.lip6.move.pnml.hlpn.booleans.hlapi.OrHLAPI> totest = elem.getSubterm_booleans_OrHLAPI();

			assert totest.size() == howmany + 1 - 56;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "ModuloHLAPI"})
		public void getSubterm_booleans_AndHLAPITest(){
			Modulo llapi = new IntegersFactoryImpl().createModulo();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new BooleansFactoryImpl().createAnd());
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createNumberConstant()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createAddition()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createSubtraction()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createMultiplication()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createDivision()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createModulo()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getSubterm().add(
			   new CyclicEnumerationsFactoryImpl().createSuccessor()
			);
			
			llapi.getSubterm().add(
			   new CyclicEnumerationsFactoryImpl().createPredecessor()
			);
			
			llapi.getSubterm().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRangeConstant()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createEmptyList()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createAppend()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createConcatenation()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createLength()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createMakeList()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createMemberAtIndex()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createSublist()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createStringConstant()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createAppend()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createConcatenation()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLength()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createSubstring()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 56;

			ModuloHLAPI elem = new ModuloHLAPI(llapi);
			List<fr.lip6.move.pnml.hlpn.booleans.hlapi.AndHLAPI> totest = elem.getSubterm_booleans_AndHLAPI();

			assert totest.size() == howmany + 1 - 56;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "ModuloHLAPI"})
		public void getSubterm_booleans_ImplyHLAPITest(){
			Modulo llapi = new IntegersFactoryImpl().createModulo();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new BooleansFactoryImpl().createImply());
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createNumberConstant()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createAddition()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createSubtraction()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createMultiplication()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createDivision()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createModulo()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getSubterm().add(
			   new CyclicEnumerationsFactoryImpl().createSuccessor()
			);
			
			llapi.getSubterm().add(
			   new CyclicEnumerationsFactoryImpl().createPredecessor()
			);
			
			llapi.getSubterm().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRangeConstant()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createEmptyList()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createAppend()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createConcatenation()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createLength()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createMakeList()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createMemberAtIndex()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createSublist()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createStringConstant()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createAppend()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createConcatenation()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLength()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createSubstring()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 56;

			ModuloHLAPI elem = new ModuloHLAPI(llapi);
			List<fr.lip6.move.pnml.hlpn.booleans.hlapi.ImplyHLAPI> totest = elem.getSubterm_booleans_ImplyHLAPI();

			assert totest.size() == howmany + 1 - 56;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "ModuloHLAPI"})
		public void getSubterm_booleans_NotHLAPITest(){
			Modulo llapi = new IntegersFactoryImpl().createModulo();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new BooleansFactoryImpl().createNot());
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createNumberConstant()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createAddition()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createSubtraction()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createMultiplication()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createDivision()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createModulo()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getSubterm().add(
			   new CyclicEnumerationsFactoryImpl().createSuccessor()
			);
			
			llapi.getSubterm().add(
			   new CyclicEnumerationsFactoryImpl().createPredecessor()
			);
			
			llapi.getSubterm().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRangeConstant()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createEmptyList()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createAppend()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createConcatenation()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createLength()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createMakeList()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createMemberAtIndex()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createSublist()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createStringConstant()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createAppend()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createConcatenation()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLength()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createSubstring()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 56;

			ModuloHLAPI elem = new ModuloHLAPI(llapi);
			List<fr.lip6.move.pnml.hlpn.booleans.hlapi.NotHLAPI> totest = elem.getSubterm_booleans_NotHLAPI();

			assert totest.size() == howmany + 1 - 56;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "ModuloHLAPI"})
		public void getSubterm_cyclicEnumerations_SuccessorHLAPITest(){
			Modulo llapi = new IntegersFactoryImpl().createModulo();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new CyclicEnumerationsFactoryImpl().createSuccessor());
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createNumberConstant()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createAddition()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createSubtraction()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createMultiplication()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createDivision()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createModulo()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getSubterm().add(
			   new CyclicEnumerationsFactoryImpl().createSuccessor()
			);
			
			llapi.getSubterm().add(
			   new CyclicEnumerationsFactoryImpl().createPredecessor()
			);
			
			llapi.getSubterm().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRangeConstant()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createEmptyList()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createAppend()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createConcatenation()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createLength()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createMakeList()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createMemberAtIndex()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createSublist()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createStringConstant()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createAppend()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createConcatenation()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLength()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createSubstring()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 56;

			ModuloHLAPI elem = new ModuloHLAPI(llapi);
			List<fr.lip6.move.pnml.hlpn.cyclicEnumerations.hlapi.SuccessorHLAPI> totest = elem.getSubterm_cyclicEnumerations_SuccessorHLAPI();

			assert totest.size() == howmany + 1 - 56;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "ModuloHLAPI"})
		public void getSubterm_cyclicEnumerations_PredecessorHLAPITest(){
			Modulo llapi = new IntegersFactoryImpl().createModulo();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new CyclicEnumerationsFactoryImpl().createPredecessor());
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createNumberConstant()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createAddition()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createSubtraction()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createMultiplication()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createDivision()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createModulo()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getSubterm().add(
			   new CyclicEnumerationsFactoryImpl().createSuccessor()
			);
			
			llapi.getSubterm().add(
			   new CyclicEnumerationsFactoryImpl().createPredecessor()
			);
			
			llapi.getSubterm().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRangeConstant()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createEmptyList()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createAppend()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createConcatenation()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createLength()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createMakeList()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createMemberAtIndex()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createSublist()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createStringConstant()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createAppend()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createConcatenation()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLength()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createSubstring()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 56;

			ModuloHLAPI elem = new ModuloHLAPI(llapi);
			List<fr.lip6.move.pnml.hlpn.cyclicEnumerations.hlapi.PredecessorHLAPI> totest = elem.getSubterm_cyclicEnumerations_PredecessorHLAPI();

			assert totest.size() == howmany + 1 - 56;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "ModuloHLAPI"})
		public void getSubterm_dots_DotConstantHLAPITest(){
			Modulo llapi = new IntegersFactoryImpl().createModulo();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new DotsFactoryImpl().createDotConstant());
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createNumberConstant()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createAddition()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createSubtraction()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createMultiplication()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createDivision()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createModulo()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getSubterm().add(
			   new CyclicEnumerationsFactoryImpl().createSuccessor()
			);
			
			llapi.getSubterm().add(
			   new CyclicEnumerationsFactoryImpl().createPredecessor()
			);
			
			llapi.getSubterm().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRangeConstant()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createEmptyList()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createAppend()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createConcatenation()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createLength()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createMakeList()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createMemberAtIndex()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createSublist()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createStringConstant()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createAppend()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createConcatenation()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLength()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createSubstring()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 56;

			ModuloHLAPI elem = new ModuloHLAPI(llapi);
			List<fr.lip6.move.pnml.hlpn.dots.hlapi.DotConstantHLAPI> totest = elem.getSubterm_dots_DotConstantHLAPI();

			assert totest.size() == howmany + 1 - 56;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "ModuloHLAPI"})
		public void getSubterm_finiteIntRanges_FiniteIntRangeConstantHLAPITest(){
			Modulo llapi = new IntegersFactoryImpl().createModulo();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new FiniteIntRangesFactoryImpl().createFiniteIntRangeConstant());
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createNumberConstant()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createAddition()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createSubtraction()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createMultiplication()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createDivision()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createModulo()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getSubterm().add(
			   new CyclicEnumerationsFactoryImpl().createSuccessor()
			);
			
			llapi.getSubterm().add(
			   new CyclicEnumerationsFactoryImpl().createPredecessor()
			);
			
			llapi.getSubterm().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRangeConstant()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createEmptyList()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createAppend()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createConcatenation()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createLength()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createMakeList()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createMemberAtIndex()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createSublist()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createStringConstant()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createAppend()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createConcatenation()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLength()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createSubstring()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 56;

			ModuloHLAPI elem = new ModuloHLAPI(llapi);
			List<fr.lip6.move.pnml.hlpn.finiteIntRanges.hlapi.FiniteIntRangeConstantHLAPI> totest = elem.getSubterm_finiteIntRanges_FiniteIntRangeConstantHLAPI();

			assert totest.size() == howmany + 1 - 56;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "ModuloHLAPI"})
		public void getSubterm_finiteIntRanges_LessThanHLAPITest(){
			Modulo llapi = new IntegersFactoryImpl().createModulo();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new FiniteIntRangesFactoryImpl().createLessThan());
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createNumberConstant()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createAddition()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createSubtraction()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createMultiplication()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createDivision()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createModulo()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getSubterm().add(
			   new CyclicEnumerationsFactoryImpl().createSuccessor()
			);
			
			llapi.getSubterm().add(
			   new CyclicEnumerationsFactoryImpl().createPredecessor()
			);
			
			llapi.getSubterm().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRangeConstant()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createEmptyList()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createAppend()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createConcatenation()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createLength()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createMakeList()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createMemberAtIndex()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createSublist()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createStringConstant()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createAppend()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createConcatenation()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLength()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createSubstring()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 56;

			ModuloHLAPI elem = new ModuloHLAPI(llapi);
			List<fr.lip6.move.pnml.hlpn.finiteIntRanges.hlapi.LessThanHLAPI> totest = elem.getSubterm_finiteIntRanges_LessThanHLAPI();

			assert totest.size() == howmany + 1 - 56;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "ModuloHLAPI"})
		public void getSubterm_finiteIntRanges_GreaterThanHLAPITest(){
			Modulo llapi = new IntegersFactoryImpl().createModulo();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new FiniteIntRangesFactoryImpl().createGreaterThan());
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createNumberConstant()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createAddition()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createSubtraction()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createMultiplication()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createDivision()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createModulo()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getSubterm().add(
			   new CyclicEnumerationsFactoryImpl().createSuccessor()
			);
			
			llapi.getSubterm().add(
			   new CyclicEnumerationsFactoryImpl().createPredecessor()
			);
			
			llapi.getSubterm().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRangeConstant()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createEmptyList()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createAppend()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createConcatenation()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createLength()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createMakeList()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createMemberAtIndex()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createSublist()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createStringConstant()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createAppend()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createConcatenation()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLength()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createSubstring()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 56;

			ModuloHLAPI elem = new ModuloHLAPI(llapi);
			List<fr.lip6.move.pnml.hlpn.finiteIntRanges.hlapi.GreaterThanHLAPI> totest = elem.getSubterm_finiteIntRanges_GreaterThanHLAPI();

			assert totest.size() == howmany + 1 - 56;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "ModuloHLAPI"})
		public void getSubterm_finiteIntRanges_LessThanOrEqualHLAPITest(){
			Modulo llapi = new IntegersFactoryImpl().createModulo();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new FiniteIntRangesFactoryImpl().createLessThanOrEqual());
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createNumberConstant()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createAddition()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createSubtraction()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createMultiplication()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createDivision()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createModulo()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getSubterm().add(
			   new CyclicEnumerationsFactoryImpl().createSuccessor()
			);
			
			llapi.getSubterm().add(
			   new CyclicEnumerationsFactoryImpl().createPredecessor()
			);
			
			llapi.getSubterm().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRangeConstant()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createEmptyList()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createAppend()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createConcatenation()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createLength()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createMakeList()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createMemberAtIndex()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createSublist()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createStringConstant()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createAppend()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createConcatenation()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLength()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createSubstring()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 56;

			ModuloHLAPI elem = new ModuloHLAPI(llapi);
			List<fr.lip6.move.pnml.hlpn.finiteIntRanges.hlapi.LessThanOrEqualHLAPI> totest = elem.getSubterm_finiteIntRanges_LessThanOrEqualHLAPI();

			assert totest.size() == howmany + 1 - 56;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "ModuloHLAPI"})
		public void getSubterm_finiteIntRanges_GreaterThanOrEqualHLAPITest(){
			Modulo llapi = new IntegersFactoryImpl().createModulo();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new FiniteIntRangesFactoryImpl().createGreaterThanOrEqual());
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createNumberConstant()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createAddition()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createSubtraction()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createMultiplication()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createDivision()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createModulo()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getSubterm().add(
			   new CyclicEnumerationsFactoryImpl().createSuccessor()
			);
			
			llapi.getSubterm().add(
			   new CyclicEnumerationsFactoryImpl().createPredecessor()
			);
			
			llapi.getSubterm().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRangeConstant()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createEmptyList()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createAppend()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createConcatenation()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createLength()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createMakeList()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createMemberAtIndex()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createSublist()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createStringConstant()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createAppend()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createConcatenation()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLength()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createSubstring()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 56;

			ModuloHLAPI elem = new ModuloHLAPI(llapi);
			List<fr.lip6.move.pnml.hlpn.finiteIntRanges.hlapi.GreaterThanOrEqualHLAPI> totest = elem.getSubterm_finiteIntRanges_GreaterThanOrEqualHLAPI();

			assert totest.size() == howmany + 1 - 56;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "ModuloHLAPI"})
		public void getSubterm_lists_EmptyListHLAPITest(){
			Modulo llapi = new IntegersFactoryImpl().createModulo();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new ListsFactoryImpl().createEmptyList());
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createNumberConstant()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createAddition()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createSubtraction()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createMultiplication()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createDivision()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createModulo()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getSubterm().add(
			   new CyclicEnumerationsFactoryImpl().createSuccessor()
			);
			
			llapi.getSubterm().add(
			   new CyclicEnumerationsFactoryImpl().createPredecessor()
			);
			
			llapi.getSubterm().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRangeConstant()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createEmptyList()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createAppend()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createConcatenation()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createLength()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createMakeList()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createMemberAtIndex()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createSublist()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createStringConstant()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createAppend()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createConcatenation()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLength()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createSubstring()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 56;

			ModuloHLAPI elem = new ModuloHLAPI(llapi);
			List<fr.lip6.move.pnml.hlpn.lists.hlapi.EmptyListHLAPI> totest = elem.getSubterm_lists_EmptyListHLAPI();

			assert totest.size() == howmany + 1 - 56;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "ModuloHLAPI"})
		public void getSubterm_lists_AppendHLAPITest(){
			Modulo llapi = new IntegersFactoryImpl().createModulo();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new ListsFactoryImpl().createAppend());
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createNumberConstant()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createAddition()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createSubtraction()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createMultiplication()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createDivision()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createModulo()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getSubterm().add(
			   new CyclicEnumerationsFactoryImpl().createSuccessor()
			);
			
			llapi.getSubterm().add(
			   new CyclicEnumerationsFactoryImpl().createPredecessor()
			);
			
			llapi.getSubterm().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRangeConstant()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createEmptyList()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createAppend()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createConcatenation()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createLength()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createMakeList()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createMemberAtIndex()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createSublist()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createStringConstant()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createAppend()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createConcatenation()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLength()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createSubstring()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 56;

			ModuloHLAPI elem = new ModuloHLAPI(llapi);
			List<fr.lip6.move.pnml.hlpn.lists.hlapi.AppendHLAPI> totest = elem.getSubterm_lists_AppendHLAPI();

			assert totest.size() == howmany + 1 - 56;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "ModuloHLAPI"})
		public void getSubterm_lists_ConcatenationHLAPITest(){
			Modulo llapi = new IntegersFactoryImpl().createModulo();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new ListsFactoryImpl().createConcatenation());
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createNumberConstant()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createAddition()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createSubtraction()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createMultiplication()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createDivision()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createModulo()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getSubterm().add(
			   new CyclicEnumerationsFactoryImpl().createSuccessor()
			);
			
			llapi.getSubterm().add(
			   new CyclicEnumerationsFactoryImpl().createPredecessor()
			);
			
			llapi.getSubterm().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRangeConstant()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createEmptyList()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createAppend()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createConcatenation()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createLength()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createMakeList()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createMemberAtIndex()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createSublist()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createStringConstant()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createAppend()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createConcatenation()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLength()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createSubstring()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 56;

			ModuloHLAPI elem = new ModuloHLAPI(llapi);
			List<fr.lip6.move.pnml.hlpn.lists.hlapi.ConcatenationHLAPI> totest = elem.getSubterm_lists_ConcatenationHLAPI();

			assert totest.size() == howmany + 1 - 56;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "ModuloHLAPI"})
		public void getSubterm_lists_LengthHLAPITest(){
			Modulo llapi = new IntegersFactoryImpl().createModulo();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new ListsFactoryImpl().createLength());
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createNumberConstant()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createAddition()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createSubtraction()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createMultiplication()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createDivision()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createModulo()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getSubterm().add(
			   new CyclicEnumerationsFactoryImpl().createSuccessor()
			);
			
			llapi.getSubterm().add(
			   new CyclicEnumerationsFactoryImpl().createPredecessor()
			);
			
			llapi.getSubterm().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRangeConstant()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createEmptyList()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createAppend()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createConcatenation()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createLength()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createMakeList()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createMemberAtIndex()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createSublist()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createStringConstant()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createAppend()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createConcatenation()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLength()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createSubstring()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 56;

			ModuloHLAPI elem = new ModuloHLAPI(llapi);
			List<fr.lip6.move.pnml.hlpn.lists.hlapi.LengthHLAPI> totest = elem.getSubterm_lists_LengthHLAPI();

			assert totest.size() == howmany + 1 - 56;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "ModuloHLAPI"})
		public void getSubterm_lists_MakeListHLAPITest(){
			Modulo llapi = new IntegersFactoryImpl().createModulo();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new ListsFactoryImpl().createMakeList());
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createNumberConstant()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createAddition()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createSubtraction()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createMultiplication()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createDivision()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createModulo()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getSubterm().add(
			   new CyclicEnumerationsFactoryImpl().createSuccessor()
			);
			
			llapi.getSubterm().add(
			   new CyclicEnumerationsFactoryImpl().createPredecessor()
			);
			
			llapi.getSubterm().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRangeConstant()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createEmptyList()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createAppend()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createConcatenation()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createLength()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createMakeList()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createMemberAtIndex()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createSublist()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createStringConstant()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createAppend()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createConcatenation()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLength()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createSubstring()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 56;

			ModuloHLAPI elem = new ModuloHLAPI(llapi);
			List<fr.lip6.move.pnml.hlpn.lists.hlapi.MakeListHLAPI> totest = elem.getSubterm_lists_MakeListHLAPI();

			assert totest.size() == howmany + 1 - 56;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "ModuloHLAPI"})
		public void getSubterm_lists_MemberAtIndexHLAPITest(){
			Modulo llapi = new IntegersFactoryImpl().createModulo();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new ListsFactoryImpl().createMemberAtIndex());
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createNumberConstant()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createAddition()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createSubtraction()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createMultiplication()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createDivision()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createModulo()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getSubterm().add(
			   new CyclicEnumerationsFactoryImpl().createSuccessor()
			);
			
			llapi.getSubterm().add(
			   new CyclicEnumerationsFactoryImpl().createPredecessor()
			);
			
			llapi.getSubterm().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRangeConstant()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createEmptyList()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createAppend()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createConcatenation()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createLength()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createMakeList()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createMemberAtIndex()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createSublist()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createStringConstant()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createAppend()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createConcatenation()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLength()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createSubstring()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 56;

			ModuloHLAPI elem = new ModuloHLAPI(llapi);
			List<fr.lip6.move.pnml.hlpn.lists.hlapi.MemberAtIndexHLAPI> totest = elem.getSubterm_lists_MemberAtIndexHLAPI();

			assert totest.size() == howmany + 1 - 56;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "ModuloHLAPI"})
		public void getSubterm_lists_SublistHLAPITest(){
			Modulo llapi = new IntegersFactoryImpl().createModulo();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new ListsFactoryImpl().createSublist());
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createNumberConstant()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createAddition()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createSubtraction()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createMultiplication()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createDivision()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createModulo()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getSubterm().add(
			   new CyclicEnumerationsFactoryImpl().createSuccessor()
			);
			
			llapi.getSubterm().add(
			   new CyclicEnumerationsFactoryImpl().createPredecessor()
			);
			
			llapi.getSubterm().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRangeConstant()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createEmptyList()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createAppend()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createConcatenation()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createLength()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createMakeList()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createMemberAtIndex()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createSublist()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createStringConstant()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createAppend()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createConcatenation()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLength()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createSubstring()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 56;

			ModuloHLAPI elem = new ModuloHLAPI(llapi);
			List<fr.lip6.move.pnml.hlpn.lists.hlapi.SublistHLAPI> totest = elem.getSubterm_lists_SublistHLAPI();

			assert totest.size() == howmany + 1 - 56;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "ModuloHLAPI"})
		public void getSubterm_multisets_CardinalityHLAPITest(){
			Modulo llapi = new IntegersFactoryImpl().createModulo();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new MultisetsFactoryImpl().createCardinality());
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createNumberConstant()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createAddition()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createSubtraction()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createMultiplication()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createDivision()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createModulo()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getSubterm().add(
			   new CyclicEnumerationsFactoryImpl().createSuccessor()
			);
			
			llapi.getSubterm().add(
			   new CyclicEnumerationsFactoryImpl().createPredecessor()
			);
			
			llapi.getSubterm().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRangeConstant()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createEmptyList()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createAppend()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createConcatenation()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createLength()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createMakeList()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createMemberAtIndex()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createSublist()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createStringConstant()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createAppend()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createConcatenation()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLength()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createSubstring()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 56;

			ModuloHLAPI elem = new ModuloHLAPI(llapi);
			List<fr.lip6.move.pnml.hlpn.multisets.hlapi.CardinalityHLAPI> totest = elem.getSubterm_multisets_CardinalityHLAPI();

			assert totest.size() == howmany + 1 - 56;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "ModuloHLAPI"})
		public void getSubterm_multisets_ContainsHLAPITest(){
			Modulo llapi = new IntegersFactoryImpl().createModulo();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new MultisetsFactoryImpl().createContains());
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createNumberConstant()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createAddition()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createSubtraction()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createMultiplication()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createDivision()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createModulo()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getSubterm().add(
			   new CyclicEnumerationsFactoryImpl().createSuccessor()
			);
			
			llapi.getSubterm().add(
			   new CyclicEnumerationsFactoryImpl().createPredecessor()
			);
			
			llapi.getSubterm().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRangeConstant()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createEmptyList()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createAppend()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createConcatenation()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createLength()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createMakeList()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createMemberAtIndex()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createSublist()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createStringConstant()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createAppend()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createConcatenation()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLength()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createSubstring()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 56;

			ModuloHLAPI elem = new ModuloHLAPI(llapi);
			List<fr.lip6.move.pnml.hlpn.multisets.hlapi.ContainsHLAPI> totest = elem.getSubterm_multisets_ContainsHLAPI();

			assert totest.size() == howmany + 1 - 56;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "ModuloHLAPI"})
		public void getSubterm_multisets_CardinalityOfHLAPITest(){
			Modulo llapi = new IntegersFactoryImpl().createModulo();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new MultisetsFactoryImpl().createCardinalityOf());
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createNumberConstant()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createAddition()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createSubtraction()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createMultiplication()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createDivision()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createModulo()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getSubterm().add(
			   new CyclicEnumerationsFactoryImpl().createSuccessor()
			);
			
			llapi.getSubterm().add(
			   new CyclicEnumerationsFactoryImpl().createPredecessor()
			);
			
			llapi.getSubterm().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRangeConstant()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createEmptyList()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createAppend()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createConcatenation()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createLength()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createMakeList()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createMemberAtIndex()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createSublist()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createStringConstant()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createAppend()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createConcatenation()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLength()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createSubstring()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 56;

			ModuloHLAPI elem = new ModuloHLAPI(llapi);
			List<fr.lip6.move.pnml.hlpn.multisets.hlapi.CardinalityOfHLAPI> totest = elem.getSubterm_multisets_CardinalityOfHLAPI();

			assert totest.size() == howmany + 1 - 56;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "ModuloHLAPI"})
		public void getSubterm_multisets_AddHLAPITest(){
			Modulo llapi = new IntegersFactoryImpl().createModulo();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new MultisetsFactoryImpl().createAdd());
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createNumberConstant()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createAddition()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createSubtraction()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createMultiplication()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createDivision()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createModulo()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getSubterm().add(
			   new CyclicEnumerationsFactoryImpl().createSuccessor()
			);
			
			llapi.getSubterm().add(
			   new CyclicEnumerationsFactoryImpl().createPredecessor()
			);
			
			llapi.getSubterm().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRangeConstant()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createEmptyList()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createAppend()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createConcatenation()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createLength()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createMakeList()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createMemberAtIndex()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createSublist()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createStringConstant()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createAppend()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createConcatenation()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLength()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createSubstring()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 56;

			ModuloHLAPI elem = new ModuloHLAPI(llapi);
			List<fr.lip6.move.pnml.hlpn.multisets.hlapi.AddHLAPI> totest = elem.getSubterm_multisets_AddHLAPI();

			assert totest.size() == howmany + 1 - 56;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "ModuloHLAPI"})
		public void getSubterm_multisets_AllHLAPITest(){
			Modulo llapi = new IntegersFactoryImpl().createModulo();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new MultisetsFactoryImpl().createAll());
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createNumberConstant()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createAddition()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createSubtraction()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createMultiplication()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createDivision()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createModulo()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getSubterm().add(
			   new CyclicEnumerationsFactoryImpl().createSuccessor()
			);
			
			llapi.getSubterm().add(
			   new CyclicEnumerationsFactoryImpl().createPredecessor()
			);
			
			llapi.getSubterm().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRangeConstant()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createEmptyList()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createAppend()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createConcatenation()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createLength()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createMakeList()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createMemberAtIndex()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createSublist()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createStringConstant()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createAppend()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createConcatenation()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLength()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createSubstring()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 56;

			ModuloHLAPI elem = new ModuloHLAPI(llapi);
			List<fr.lip6.move.pnml.hlpn.multisets.hlapi.AllHLAPI> totest = elem.getSubterm_multisets_AllHLAPI();

			assert totest.size() == howmany + 1 - 56;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "ModuloHLAPI"})
		public void getSubterm_multisets_EmptyHLAPITest(){
			Modulo llapi = new IntegersFactoryImpl().createModulo();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new MultisetsFactoryImpl().createEmpty());
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createNumberConstant()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createAddition()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createSubtraction()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createMultiplication()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createDivision()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createModulo()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getSubterm().add(
			   new CyclicEnumerationsFactoryImpl().createSuccessor()
			);
			
			llapi.getSubterm().add(
			   new CyclicEnumerationsFactoryImpl().createPredecessor()
			);
			
			llapi.getSubterm().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRangeConstant()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createEmptyList()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createAppend()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createConcatenation()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createLength()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createMakeList()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createMemberAtIndex()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createSublist()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createStringConstant()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createAppend()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createConcatenation()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLength()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createSubstring()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 56;

			ModuloHLAPI elem = new ModuloHLAPI(llapi);
			List<fr.lip6.move.pnml.hlpn.multisets.hlapi.EmptyHLAPI> totest = elem.getSubterm_multisets_EmptyHLAPI();

			assert totest.size() == howmany + 1 - 56;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "ModuloHLAPI"})
		public void getSubterm_multisets_NumberOfHLAPITest(){
			Modulo llapi = new IntegersFactoryImpl().createModulo();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new MultisetsFactoryImpl().createNumberOf());
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createNumberConstant()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createAddition()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createSubtraction()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createMultiplication()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createDivision()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createModulo()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getSubterm().add(
			   new CyclicEnumerationsFactoryImpl().createSuccessor()
			);
			
			llapi.getSubterm().add(
			   new CyclicEnumerationsFactoryImpl().createPredecessor()
			);
			
			llapi.getSubterm().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRangeConstant()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createEmptyList()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createAppend()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createConcatenation()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createLength()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createMakeList()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createMemberAtIndex()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createSublist()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createStringConstant()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createAppend()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createConcatenation()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLength()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createSubstring()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 56;

			ModuloHLAPI elem = new ModuloHLAPI(llapi);
			List<fr.lip6.move.pnml.hlpn.multisets.hlapi.NumberOfHLAPI> totest = elem.getSubterm_multisets_NumberOfHLAPI();

			assert totest.size() == howmany + 1 - 56;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "ModuloHLAPI"})
		public void getSubterm_multisets_SubtractHLAPITest(){
			Modulo llapi = new IntegersFactoryImpl().createModulo();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new MultisetsFactoryImpl().createSubtract());
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createNumberConstant()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createAddition()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createSubtraction()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createMultiplication()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createDivision()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createModulo()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getSubterm().add(
			   new CyclicEnumerationsFactoryImpl().createSuccessor()
			);
			
			llapi.getSubterm().add(
			   new CyclicEnumerationsFactoryImpl().createPredecessor()
			);
			
			llapi.getSubterm().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRangeConstant()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createEmptyList()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createAppend()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createConcatenation()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createLength()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createMakeList()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createMemberAtIndex()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createSublist()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createStringConstant()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createAppend()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createConcatenation()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLength()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createSubstring()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 56;

			ModuloHLAPI elem = new ModuloHLAPI(llapi);
			List<fr.lip6.move.pnml.hlpn.multisets.hlapi.SubtractHLAPI> totest = elem.getSubterm_multisets_SubtractHLAPI();

			assert totest.size() == howmany + 1 - 56;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "ModuloHLAPI"})
		public void getSubterm_multisets_ScalarProductHLAPITest(){
			Modulo llapi = new IntegersFactoryImpl().createModulo();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new MultisetsFactoryImpl().createScalarProduct());
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createNumberConstant()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createAddition()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createSubtraction()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createMultiplication()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createDivision()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createModulo()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getSubterm().add(
			   new CyclicEnumerationsFactoryImpl().createSuccessor()
			);
			
			llapi.getSubterm().add(
			   new CyclicEnumerationsFactoryImpl().createPredecessor()
			);
			
			llapi.getSubterm().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRangeConstant()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createEmptyList()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createAppend()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createConcatenation()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createLength()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createMakeList()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createMemberAtIndex()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createSublist()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createStringConstant()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createAppend()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createConcatenation()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLength()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createSubstring()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 56;

			ModuloHLAPI elem = new ModuloHLAPI(llapi);
			List<fr.lip6.move.pnml.hlpn.multisets.hlapi.ScalarProductHLAPI> totest = elem.getSubterm_multisets_ScalarProductHLAPI();

			assert totest.size() == howmany + 1 - 56;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "ModuloHLAPI"})
		public void getSubterm_partitions_GreaterThanHLAPITest(){
			Modulo llapi = new IntegersFactoryImpl().createModulo();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new PartitionsFactoryImpl().createGreaterThan());
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createNumberConstant()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createAddition()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createSubtraction()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createMultiplication()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createDivision()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createModulo()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getSubterm().add(
			   new CyclicEnumerationsFactoryImpl().createSuccessor()
			);
			
			llapi.getSubterm().add(
			   new CyclicEnumerationsFactoryImpl().createPredecessor()
			);
			
			llapi.getSubterm().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRangeConstant()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createEmptyList()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createAppend()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createConcatenation()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createLength()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createMakeList()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createMemberAtIndex()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createSublist()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createStringConstant()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createAppend()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createConcatenation()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLength()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createSubstring()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 56;

			ModuloHLAPI elem = new ModuloHLAPI(llapi);
			List<fr.lip6.move.pnml.hlpn.partitions.hlapi.GreaterThanHLAPI> totest = elem.getSubterm_partitions_GreaterThanHLAPI();

			assert totest.size() == howmany + 1 - 56;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "ModuloHLAPI"})
		public void getSubterm_partitions_PartitionElementOfHLAPITest(){
			Modulo llapi = new IntegersFactoryImpl().createModulo();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new PartitionsFactoryImpl().createPartitionElementOf());
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createNumberConstant()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createAddition()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createSubtraction()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createMultiplication()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createDivision()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createModulo()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getSubterm().add(
			   new CyclicEnumerationsFactoryImpl().createSuccessor()
			);
			
			llapi.getSubterm().add(
			   new CyclicEnumerationsFactoryImpl().createPredecessor()
			);
			
			llapi.getSubterm().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRangeConstant()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createEmptyList()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createAppend()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createConcatenation()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createLength()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createMakeList()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createMemberAtIndex()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createSublist()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createStringConstant()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createAppend()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createConcatenation()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLength()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createSubstring()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 56;

			ModuloHLAPI elem = new ModuloHLAPI(llapi);
			List<fr.lip6.move.pnml.hlpn.partitions.hlapi.PartitionElementOfHLAPI> totest = elem.getSubterm_partitions_PartitionElementOfHLAPI();

			assert totest.size() == howmany + 1 - 56;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "ModuloHLAPI"})
		public void getSubterm_partitions_LessThanHLAPITest(){
			Modulo llapi = new IntegersFactoryImpl().createModulo();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new PartitionsFactoryImpl().createLessThan());
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createNumberConstant()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createAddition()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createSubtraction()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createMultiplication()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createDivision()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createModulo()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getSubterm().add(
			   new CyclicEnumerationsFactoryImpl().createSuccessor()
			);
			
			llapi.getSubterm().add(
			   new CyclicEnumerationsFactoryImpl().createPredecessor()
			);
			
			llapi.getSubterm().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRangeConstant()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createEmptyList()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createAppend()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createConcatenation()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createLength()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createMakeList()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createMemberAtIndex()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createSublist()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createStringConstant()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createAppend()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createConcatenation()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLength()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createSubstring()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 56;

			ModuloHLAPI elem = new ModuloHLAPI(llapi);
			List<fr.lip6.move.pnml.hlpn.partitions.hlapi.LessThanHLAPI> totest = elem.getSubterm_partitions_LessThanHLAPI();

			assert totest.size() == howmany + 1 - 56;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "ModuloHLAPI"})
		public void getSubterm_strings_StringConstantHLAPITest(){
			Modulo llapi = new IntegersFactoryImpl().createModulo();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new StringsFactoryImpl().createStringConstant());
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createNumberConstant()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createAddition()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createSubtraction()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createMultiplication()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createDivision()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createModulo()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getSubterm().add(
			   new CyclicEnumerationsFactoryImpl().createSuccessor()
			);
			
			llapi.getSubterm().add(
			   new CyclicEnumerationsFactoryImpl().createPredecessor()
			);
			
			llapi.getSubterm().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRangeConstant()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createEmptyList()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createAppend()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createConcatenation()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createLength()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createMakeList()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createMemberAtIndex()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createSublist()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createStringConstant()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createAppend()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createConcatenation()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLength()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createSubstring()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 56;

			ModuloHLAPI elem = new ModuloHLAPI(llapi);
			List<fr.lip6.move.pnml.hlpn.strings.hlapi.StringConstantHLAPI> totest = elem.getSubterm_strings_StringConstantHLAPI();

			assert totest.size() == howmany + 1 - 56;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "ModuloHLAPI"})
		public void getSubterm_strings_AppendHLAPITest(){
			Modulo llapi = new IntegersFactoryImpl().createModulo();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new StringsFactoryImpl().createAppend());
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createNumberConstant()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createAddition()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createSubtraction()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createMultiplication()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createDivision()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createModulo()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getSubterm().add(
			   new CyclicEnumerationsFactoryImpl().createSuccessor()
			);
			
			llapi.getSubterm().add(
			   new CyclicEnumerationsFactoryImpl().createPredecessor()
			);
			
			llapi.getSubterm().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRangeConstant()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createEmptyList()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createAppend()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createConcatenation()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createLength()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createMakeList()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createMemberAtIndex()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createSublist()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createStringConstant()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createAppend()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createConcatenation()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLength()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createSubstring()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 56;

			ModuloHLAPI elem = new ModuloHLAPI(llapi);
			List<fr.lip6.move.pnml.hlpn.strings.hlapi.AppendHLAPI> totest = elem.getSubterm_strings_AppendHLAPI();

			assert totest.size() == howmany + 1 - 56;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "ModuloHLAPI"})
		public void getSubterm_strings_ConcatenationHLAPITest(){
			Modulo llapi = new IntegersFactoryImpl().createModulo();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new StringsFactoryImpl().createConcatenation());
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createNumberConstant()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createAddition()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createSubtraction()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createMultiplication()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createDivision()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createModulo()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getSubterm().add(
			   new CyclicEnumerationsFactoryImpl().createSuccessor()
			);
			
			llapi.getSubterm().add(
			   new CyclicEnumerationsFactoryImpl().createPredecessor()
			);
			
			llapi.getSubterm().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRangeConstant()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createEmptyList()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createAppend()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createConcatenation()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createLength()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createMakeList()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createMemberAtIndex()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createSublist()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createStringConstant()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createAppend()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createConcatenation()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLength()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createSubstring()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 56;

			ModuloHLAPI elem = new ModuloHLAPI(llapi);
			List<fr.lip6.move.pnml.hlpn.strings.hlapi.ConcatenationHLAPI> totest = elem.getSubterm_strings_ConcatenationHLAPI();

			assert totest.size() == howmany + 1 - 56;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "ModuloHLAPI"})
		public void getSubterm_strings_GreaterThanHLAPITest(){
			Modulo llapi = new IntegersFactoryImpl().createModulo();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new StringsFactoryImpl().createGreaterThan());
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createNumberConstant()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createAddition()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createSubtraction()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createMultiplication()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createDivision()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createModulo()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getSubterm().add(
			   new CyclicEnumerationsFactoryImpl().createSuccessor()
			);
			
			llapi.getSubterm().add(
			   new CyclicEnumerationsFactoryImpl().createPredecessor()
			);
			
			llapi.getSubterm().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRangeConstant()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createEmptyList()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createAppend()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createConcatenation()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createLength()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createMakeList()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createMemberAtIndex()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createSublist()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createStringConstant()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createAppend()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createConcatenation()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLength()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createSubstring()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 56;

			ModuloHLAPI elem = new ModuloHLAPI(llapi);
			List<fr.lip6.move.pnml.hlpn.strings.hlapi.GreaterThanHLAPI> totest = elem.getSubterm_strings_GreaterThanHLAPI();

			assert totest.size() == howmany + 1 - 56;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "ModuloHLAPI"})
		public void getSubterm_strings_GreaterThanOrEqualHLAPITest(){
			Modulo llapi = new IntegersFactoryImpl().createModulo();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new StringsFactoryImpl().createGreaterThanOrEqual());
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createNumberConstant()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createAddition()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createSubtraction()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createMultiplication()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createDivision()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createModulo()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getSubterm().add(
			   new CyclicEnumerationsFactoryImpl().createSuccessor()
			);
			
			llapi.getSubterm().add(
			   new CyclicEnumerationsFactoryImpl().createPredecessor()
			);
			
			llapi.getSubterm().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRangeConstant()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createEmptyList()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createAppend()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createConcatenation()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createLength()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createMakeList()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createMemberAtIndex()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createSublist()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createStringConstant()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createAppend()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createConcatenation()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLength()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createSubstring()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 56;

			ModuloHLAPI elem = new ModuloHLAPI(llapi);
			List<fr.lip6.move.pnml.hlpn.strings.hlapi.GreaterThanOrEqualHLAPI> totest = elem.getSubterm_strings_GreaterThanOrEqualHLAPI();

			assert totest.size() == howmany + 1 - 56;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "ModuloHLAPI"})
		public void getSubterm_strings_LessThanHLAPITest(){
			Modulo llapi = new IntegersFactoryImpl().createModulo();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new StringsFactoryImpl().createLessThan());
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createNumberConstant()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createAddition()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createSubtraction()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createMultiplication()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createDivision()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createModulo()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getSubterm().add(
			   new CyclicEnumerationsFactoryImpl().createSuccessor()
			);
			
			llapi.getSubterm().add(
			   new CyclicEnumerationsFactoryImpl().createPredecessor()
			);
			
			llapi.getSubterm().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRangeConstant()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createEmptyList()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createAppend()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createConcatenation()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createLength()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createMakeList()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createMemberAtIndex()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createSublist()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createStringConstant()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createAppend()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createConcatenation()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLength()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createSubstring()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 56;

			ModuloHLAPI elem = new ModuloHLAPI(llapi);
			List<fr.lip6.move.pnml.hlpn.strings.hlapi.LessThanHLAPI> totest = elem.getSubterm_strings_LessThanHLAPI();

			assert totest.size() == howmany + 1 - 56;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "ModuloHLAPI"})
		public void getSubterm_strings_LessThanOrEqualHLAPITest(){
			Modulo llapi = new IntegersFactoryImpl().createModulo();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new StringsFactoryImpl().createLessThanOrEqual());
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createNumberConstant()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createAddition()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createSubtraction()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createMultiplication()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createDivision()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createModulo()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getSubterm().add(
			   new CyclicEnumerationsFactoryImpl().createSuccessor()
			);
			
			llapi.getSubterm().add(
			   new CyclicEnumerationsFactoryImpl().createPredecessor()
			);
			
			llapi.getSubterm().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRangeConstant()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createEmptyList()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createAppend()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createConcatenation()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createLength()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createMakeList()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createMemberAtIndex()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createSublist()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createStringConstant()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createAppend()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createConcatenation()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLength()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createSubstring()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 56;

			ModuloHLAPI elem = new ModuloHLAPI(llapi);
			List<fr.lip6.move.pnml.hlpn.strings.hlapi.LessThanOrEqualHLAPI> totest = elem.getSubterm_strings_LessThanOrEqualHLAPI();

			assert totest.size() == howmany + 1 - 56;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "ModuloHLAPI"})
		public void getSubterm_strings_LengthHLAPITest(){
			Modulo llapi = new IntegersFactoryImpl().createModulo();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new StringsFactoryImpl().createLength());
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createNumberConstant()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createAddition()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createSubtraction()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createMultiplication()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createDivision()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createModulo()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getSubterm().add(
			   new CyclicEnumerationsFactoryImpl().createSuccessor()
			);
			
			llapi.getSubterm().add(
			   new CyclicEnumerationsFactoryImpl().createPredecessor()
			);
			
			llapi.getSubterm().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRangeConstant()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createEmptyList()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createAppend()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createConcatenation()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createLength()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createMakeList()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createMemberAtIndex()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createSublist()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createStringConstant()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createAppend()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createConcatenation()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLength()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createSubstring()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 56;

			ModuloHLAPI elem = new ModuloHLAPI(llapi);
			List<fr.lip6.move.pnml.hlpn.strings.hlapi.LengthHLAPI> totest = elem.getSubterm_strings_LengthHLAPI();

			assert totest.size() == howmany + 1 - 56;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "ModuloHLAPI"})
		public void getSubterm_strings_SubstringHLAPITest(){
			Modulo llapi = new IntegersFactoryImpl().createModulo();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new StringsFactoryImpl().createSubstring());
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createNumberConstant()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createAddition()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createSubtraction()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createMultiplication()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createDivision()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createModulo()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getSubterm().add(
			   new CyclicEnumerationsFactoryImpl().createSuccessor()
			);
			
			llapi.getSubterm().add(
			   new CyclicEnumerationsFactoryImpl().createPredecessor()
			);
			
			llapi.getSubterm().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRangeConstant()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createEmptyList()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createAppend()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createConcatenation()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createLength()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createMakeList()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createMemberAtIndex()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createSublist()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createStringConstant()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createAppend()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createConcatenation()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLength()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createSubstring()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 56;

			ModuloHLAPI elem = new ModuloHLAPI(llapi);
			List<fr.lip6.move.pnml.hlpn.strings.hlapi.SubstringHLAPI> totest = elem.getSubterm_strings_SubstringHLAPI();

			assert totest.size() == howmany + 1 - 56;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "ModuloHLAPI"})
		public void getSubterm_terms_VariableHLAPITest(){
			Modulo llapi = new IntegersFactoryImpl().createModulo();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new TermsFactoryImpl().createVariable());
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createNumberConstant()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createAddition()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createSubtraction()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createMultiplication()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createDivision()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createModulo()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getSubterm().add(
			   new CyclicEnumerationsFactoryImpl().createSuccessor()
			);
			
			llapi.getSubterm().add(
			   new CyclicEnumerationsFactoryImpl().createPredecessor()
			);
			
			llapi.getSubterm().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRangeConstant()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createEmptyList()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createAppend()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createConcatenation()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createLength()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createMakeList()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createMemberAtIndex()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createSublist()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createStringConstant()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createAppend()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createConcatenation()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLength()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createSubstring()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 56;

			ModuloHLAPI elem = new ModuloHLAPI(llapi);
			List<fr.lip6.move.pnml.hlpn.terms.hlapi.VariableHLAPI> totest = elem.getSubterm_terms_VariableHLAPI();

			assert totest.size() == howmany + 1 - 56;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "ModuloHLAPI"})
		public void getSubterm_terms_TupleHLAPITest(){
			Modulo llapi = new IntegersFactoryImpl().createModulo();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new TermsFactoryImpl().createTuple());
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createNumberConstant()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createAddition()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createSubtraction()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createMultiplication()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createDivision()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createModulo()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getSubterm().add(
			   new CyclicEnumerationsFactoryImpl().createSuccessor()
			);
			
			llapi.getSubterm().add(
			   new CyclicEnumerationsFactoryImpl().createPredecessor()
			);
			
			llapi.getSubterm().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRangeConstant()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createEmptyList()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createAppend()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createConcatenation()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createLength()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createMakeList()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createMemberAtIndex()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createSublist()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createStringConstant()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createAppend()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createConcatenation()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLength()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createSubstring()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 56;

			ModuloHLAPI elem = new ModuloHLAPI(llapi);
			List<fr.lip6.move.pnml.hlpn.terms.hlapi.TupleHLAPI> totest = elem.getSubterm_terms_TupleHLAPI();

			assert totest.size() == howmany + 1 - 56;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "ModuloHLAPI"})
		public void getSubterm_terms_UserOperatorHLAPITest(){
			Modulo llapi = new IntegersFactoryImpl().createModulo();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new TermsFactoryImpl().createUserOperator());
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createNumberConstant()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createAddition()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createSubtraction()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createMultiplication()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createDivision()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createModulo()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new IntegersFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createEquality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createInequality()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createBooleanConstant()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createOr()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createAnd()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createImply()
			);
			
			llapi.getSubterm().add(
			   new BooleansFactoryImpl().createNot()
			);
			
			llapi.getSubterm().add(
			   new CyclicEnumerationsFactoryImpl().createSuccessor()
			);
			
			llapi.getSubterm().add(
			   new CyclicEnumerationsFactoryImpl().createPredecessor()
			);
			
			llapi.getSubterm().add(
			   new DotsFactoryImpl().createDotConstant()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRangeConstant()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new FiniteIntRangesFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createEmptyList()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createAppend()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createConcatenation()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createLength()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createMakeList()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createMemberAtIndex()
			);
			
			llapi.getSubterm().add(
			   new ListsFactoryImpl().createSublist()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinality()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createContains()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createCardinalityOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAdd()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createAll()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createEmpty()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createNumberOf()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createSubtract()
			);
			
			llapi.getSubterm().add(
			   new MultisetsFactoryImpl().createScalarProduct()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createPartitionElementOf()
			);
			
			llapi.getSubterm().add(
			   new PartitionsFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createStringConstant()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createAppend()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createConcatenation()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createGreaterThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createGreaterThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLessThan()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLessThanOrEqual()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createLength()
			);
			
			llapi.getSubterm().add(
			   new StringsFactoryImpl().createSubstring()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 56;

			ModuloHLAPI elem = new ModuloHLAPI(llapi);
			List<fr.lip6.move.pnml.hlpn.terms.hlapi.UserOperatorHLAPI> totest = elem.getSubterm_terms_UserOperatorHLAPI();

			assert totest.size() == howmany + 1 - 56;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
	
	
	
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "ModuloHLAPI"})
		public void getInput_integers_NaturalHLAPITest(){
			Modulo llapi = new IntegersFactoryImpl().createModulo();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getInput().add(new IntegersFactoryImpl().createNatural());
			
			llapi.getInput().add(
			   new IntegersFactoryImpl().createNatural()
			);
			
			llapi.getInput().add(
			   new IntegersFactoryImpl().createPositive()
			);
			
			llapi.getInput().add(
			   new IntegersFactoryImpl().createHLInteger()
			);
			
			llapi.getInput().add(
			   new ArbitrarydeclarationsFactoryImpl().createAnySort()
			);
			
			llapi.getInput().add(
			   new BooleansFactoryImpl().createBool()
			);
			
			llapi.getInput().add(
			   new CyclicEnumerationsFactoryImpl().createCyclicEnumeration()
			);
			
			llapi.getInput().add(
			   new DotsFactoryImpl().createDot()
			);
			
			llapi.getInput().add(
			   new FiniteEnumerationsFactoryImpl().createFiniteEnumeration()
			);
			
			llapi.getInput().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRange()
			);
			
			llapi.getInput().add(
			   new ListsFactoryImpl().createHLPNList()
			);
			
			llapi.getInput().add(
			   new StringsFactoryImpl().createHLPNString()
			);
			
			llapi.getInput().add(
			   new TermsFactoryImpl().createMultisetSort()
			);
			
			llapi.getInput().add(
			   new TermsFactoryImpl().createProductSort()
			);
			
			llapi.getInput().add(
			   new TermsFactoryImpl().createUserSort()
			);
			
			howmany += 14;

			ModuloHLAPI elem = new ModuloHLAPI(llapi);
			List<fr.lip6.move.pnml.hlpn.integers.hlapi.NaturalHLAPI> totest = elem.getInput_integers_NaturalHLAPI();

			assert totest.size() == howmany + 1 - 14;

			for (SortHLAPI unit : totest) {
             assert llapi.getInput().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "ModuloHLAPI"})
		public void getInput_integers_PositiveHLAPITest(){
			Modulo llapi = new IntegersFactoryImpl().createModulo();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getInput().add(new IntegersFactoryImpl().createPositive());
			
			llapi.getInput().add(
			   new IntegersFactoryImpl().createNatural()
			);
			
			llapi.getInput().add(
			   new IntegersFactoryImpl().createPositive()
			);
			
			llapi.getInput().add(
			   new IntegersFactoryImpl().createHLInteger()
			);
			
			llapi.getInput().add(
			   new ArbitrarydeclarationsFactoryImpl().createAnySort()
			);
			
			llapi.getInput().add(
			   new BooleansFactoryImpl().createBool()
			);
			
			llapi.getInput().add(
			   new CyclicEnumerationsFactoryImpl().createCyclicEnumeration()
			);
			
			llapi.getInput().add(
			   new DotsFactoryImpl().createDot()
			);
			
			llapi.getInput().add(
			   new FiniteEnumerationsFactoryImpl().createFiniteEnumeration()
			);
			
			llapi.getInput().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRange()
			);
			
			llapi.getInput().add(
			   new ListsFactoryImpl().createHLPNList()
			);
			
			llapi.getInput().add(
			   new StringsFactoryImpl().createHLPNString()
			);
			
			llapi.getInput().add(
			   new TermsFactoryImpl().createMultisetSort()
			);
			
			llapi.getInput().add(
			   new TermsFactoryImpl().createProductSort()
			);
			
			llapi.getInput().add(
			   new TermsFactoryImpl().createUserSort()
			);
			
			howmany += 14;

			ModuloHLAPI elem = new ModuloHLAPI(llapi);
			List<fr.lip6.move.pnml.hlpn.integers.hlapi.PositiveHLAPI> totest = elem.getInput_integers_PositiveHLAPI();

			assert totest.size() == howmany + 1 - 14;

			for (SortHLAPI unit : totest) {
             assert llapi.getInput().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "ModuloHLAPI"})
		public void getInput_integers_HLIntegerHLAPITest(){
			Modulo llapi = new IntegersFactoryImpl().createModulo();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getInput().add(new IntegersFactoryImpl().createHLInteger());
			
			llapi.getInput().add(
			   new IntegersFactoryImpl().createNatural()
			);
			
			llapi.getInput().add(
			   new IntegersFactoryImpl().createPositive()
			);
			
			llapi.getInput().add(
			   new IntegersFactoryImpl().createHLInteger()
			);
			
			llapi.getInput().add(
			   new ArbitrarydeclarationsFactoryImpl().createAnySort()
			);
			
			llapi.getInput().add(
			   new BooleansFactoryImpl().createBool()
			);
			
			llapi.getInput().add(
			   new CyclicEnumerationsFactoryImpl().createCyclicEnumeration()
			);
			
			llapi.getInput().add(
			   new DotsFactoryImpl().createDot()
			);
			
			llapi.getInput().add(
			   new FiniteEnumerationsFactoryImpl().createFiniteEnumeration()
			);
			
			llapi.getInput().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRange()
			);
			
			llapi.getInput().add(
			   new ListsFactoryImpl().createHLPNList()
			);
			
			llapi.getInput().add(
			   new StringsFactoryImpl().createHLPNString()
			);
			
			llapi.getInput().add(
			   new TermsFactoryImpl().createMultisetSort()
			);
			
			llapi.getInput().add(
			   new TermsFactoryImpl().createProductSort()
			);
			
			llapi.getInput().add(
			   new TermsFactoryImpl().createUserSort()
			);
			
			howmany += 14;

			ModuloHLAPI elem = new ModuloHLAPI(llapi);
			List<fr.lip6.move.pnml.hlpn.integers.hlapi.HLIntegerHLAPI> totest = elem.getInput_integers_HLIntegerHLAPI();

			assert totest.size() == howmany + 1 - 14;

			for (SortHLAPI unit : totest) {
             assert llapi.getInput().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "ModuloHLAPI"})
		public void getInput_arbitrarydeclarations_AnySortHLAPITest(){
			Modulo llapi = new IntegersFactoryImpl().createModulo();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getInput().add(new ArbitrarydeclarationsFactoryImpl().createAnySort());
			
			llapi.getInput().add(
			   new IntegersFactoryImpl().createNatural()
			);
			
			llapi.getInput().add(
			   new IntegersFactoryImpl().createPositive()
			);
			
			llapi.getInput().add(
			   new IntegersFactoryImpl().createHLInteger()
			);
			
			llapi.getInput().add(
			   new ArbitrarydeclarationsFactoryImpl().createAnySort()
			);
			
			llapi.getInput().add(
			   new BooleansFactoryImpl().createBool()
			);
			
			llapi.getInput().add(
			   new CyclicEnumerationsFactoryImpl().createCyclicEnumeration()
			);
			
			llapi.getInput().add(
			   new DotsFactoryImpl().createDot()
			);
			
			llapi.getInput().add(
			   new FiniteEnumerationsFactoryImpl().createFiniteEnumeration()
			);
			
			llapi.getInput().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRange()
			);
			
			llapi.getInput().add(
			   new ListsFactoryImpl().createHLPNList()
			);
			
			llapi.getInput().add(
			   new StringsFactoryImpl().createHLPNString()
			);
			
			llapi.getInput().add(
			   new TermsFactoryImpl().createMultisetSort()
			);
			
			llapi.getInput().add(
			   new TermsFactoryImpl().createProductSort()
			);
			
			llapi.getInput().add(
			   new TermsFactoryImpl().createUserSort()
			);
			
			howmany += 14;

			ModuloHLAPI elem = new ModuloHLAPI(llapi);
			List<fr.lip6.move.pnml.hlpn.arbitrarydeclarations.hlapi.AnySortHLAPI> totest = elem.getInput_arbitrarydeclarations_AnySortHLAPI();

			assert totest.size() == howmany + 1 - 14;

			for (SortHLAPI unit : totest) {
             assert llapi.getInput().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "ModuloHLAPI"})
		public void getInput_booleans_BoolHLAPITest(){
			Modulo llapi = new IntegersFactoryImpl().createModulo();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getInput().add(new BooleansFactoryImpl().createBool());
			
			llapi.getInput().add(
			   new IntegersFactoryImpl().createNatural()
			);
			
			llapi.getInput().add(
			   new IntegersFactoryImpl().createPositive()
			);
			
			llapi.getInput().add(
			   new IntegersFactoryImpl().createHLInteger()
			);
			
			llapi.getInput().add(
			   new ArbitrarydeclarationsFactoryImpl().createAnySort()
			);
			
			llapi.getInput().add(
			   new BooleansFactoryImpl().createBool()
			);
			
			llapi.getInput().add(
			   new CyclicEnumerationsFactoryImpl().createCyclicEnumeration()
			);
			
			llapi.getInput().add(
			   new DotsFactoryImpl().createDot()
			);
			
			llapi.getInput().add(
			   new FiniteEnumerationsFactoryImpl().createFiniteEnumeration()
			);
			
			llapi.getInput().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRange()
			);
			
			llapi.getInput().add(
			   new ListsFactoryImpl().createHLPNList()
			);
			
			llapi.getInput().add(
			   new StringsFactoryImpl().createHLPNString()
			);
			
			llapi.getInput().add(
			   new TermsFactoryImpl().createMultisetSort()
			);
			
			llapi.getInput().add(
			   new TermsFactoryImpl().createProductSort()
			);
			
			llapi.getInput().add(
			   new TermsFactoryImpl().createUserSort()
			);
			
			howmany += 14;

			ModuloHLAPI elem = new ModuloHLAPI(llapi);
			List<fr.lip6.move.pnml.hlpn.booleans.hlapi.BoolHLAPI> totest = elem.getInput_booleans_BoolHLAPI();

			assert totest.size() == howmany + 1 - 14;

			for (SortHLAPI unit : totest) {
             assert llapi.getInput().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "ModuloHLAPI"})
		public void getInput_cyclicEnumerations_CyclicEnumerationHLAPITest(){
			Modulo llapi = new IntegersFactoryImpl().createModulo();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getInput().add(new CyclicEnumerationsFactoryImpl().createCyclicEnumeration());
			
			llapi.getInput().add(
			   new IntegersFactoryImpl().createNatural()
			);
			
			llapi.getInput().add(
			   new IntegersFactoryImpl().createPositive()
			);
			
			llapi.getInput().add(
			   new IntegersFactoryImpl().createHLInteger()
			);
			
			llapi.getInput().add(
			   new ArbitrarydeclarationsFactoryImpl().createAnySort()
			);
			
			llapi.getInput().add(
			   new BooleansFactoryImpl().createBool()
			);
			
			llapi.getInput().add(
			   new CyclicEnumerationsFactoryImpl().createCyclicEnumeration()
			);
			
			llapi.getInput().add(
			   new DotsFactoryImpl().createDot()
			);
			
			llapi.getInput().add(
			   new FiniteEnumerationsFactoryImpl().createFiniteEnumeration()
			);
			
			llapi.getInput().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRange()
			);
			
			llapi.getInput().add(
			   new ListsFactoryImpl().createHLPNList()
			);
			
			llapi.getInput().add(
			   new StringsFactoryImpl().createHLPNString()
			);
			
			llapi.getInput().add(
			   new TermsFactoryImpl().createMultisetSort()
			);
			
			llapi.getInput().add(
			   new TermsFactoryImpl().createProductSort()
			);
			
			llapi.getInput().add(
			   new TermsFactoryImpl().createUserSort()
			);
			
			howmany += 14;

			ModuloHLAPI elem = new ModuloHLAPI(llapi);
			List<fr.lip6.move.pnml.hlpn.cyclicEnumerations.hlapi.CyclicEnumerationHLAPI> totest = elem.getInput_cyclicEnumerations_CyclicEnumerationHLAPI();

			assert totest.size() == howmany + 1 - 14;

			for (SortHLAPI unit : totest) {
             assert llapi.getInput().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "ModuloHLAPI"})
		public void getInput_dots_DotHLAPITest(){
			Modulo llapi = new IntegersFactoryImpl().createModulo();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getInput().add(new DotsFactoryImpl().createDot());
			
			llapi.getInput().add(
			   new IntegersFactoryImpl().createNatural()
			);
			
			llapi.getInput().add(
			   new IntegersFactoryImpl().createPositive()
			);
			
			llapi.getInput().add(
			   new IntegersFactoryImpl().createHLInteger()
			);
			
			llapi.getInput().add(
			   new ArbitrarydeclarationsFactoryImpl().createAnySort()
			);
			
			llapi.getInput().add(
			   new BooleansFactoryImpl().createBool()
			);
			
			llapi.getInput().add(
			   new CyclicEnumerationsFactoryImpl().createCyclicEnumeration()
			);
			
			llapi.getInput().add(
			   new DotsFactoryImpl().createDot()
			);
			
			llapi.getInput().add(
			   new FiniteEnumerationsFactoryImpl().createFiniteEnumeration()
			);
			
			llapi.getInput().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRange()
			);
			
			llapi.getInput().add(
			   new ListsFactoryImpl().createHLPNList()
			);
			
			llapi.getInput().add(
			   new StringsFactoryImpl().createHLPNString()
			);
			
			llapi.getInput().add(
			   new TermsFactoryImpl().createMultisetSort()
			);
			
			llapi.getInput().add(
			   new TermsFactoryImpl().createProductSort()
			);
			
			llapi.getInput().add(
			   new TermsFactoryImpl().createUserSort()
			);
			
			howmany += 14;

			ModuloHLAPI elem = new ModuloHLAPI(llapi);
			List<fr.lip6.move.pnml.hlpn.dots.hlapi.DotHLAPI> totest = elem.getInput_dots_DotHLAPI();

			assert totest.size() == howmany + 1 - 14;

			for (SortHLAPI unit : totest) {
             assert llapi.getInput().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "ModuloHLAPI"})
		public void getInput_finiteEnumerations_FiniteEnumerationHLAPITest(){
			Modulo llapi = new IntegersFactoryImpl().createModulo();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getInput().add(new FiniteEnumerationsFactoryImpl().createFiniteEnumeration());
			
			llapi.getInput().add(
			   new IntegersFactoryImpl().createNatural()
			);
			
			llapi.getInput().add(
			   new IntegersFactoryImpl().createPositive()
			);
			
			llapi.getInput().add(
			   new IntegersFactoryImpl().createHLInteger()
			);
			
			llapi.getInput().add(
			   new ArbitrarydeclarationsFactoryImpl().createAnySort()
			);
			
			llapi.getInput().add(
			   new BooleansFactoryImpl().createBool()
			);
			
			llapi.getInput().add(
			   new CyclicEnumerationsFactoryImpl().createCyclicEnumeration()
			);
			
			llapi.getInput().add(
			   new DotsFactoryImpl().createDot()
			);
			
			llapi.getInput().add(
			   new FiniteEnumerationsFactoryImpl().createFiniteEnumeration()
			);
			
			llapi.getInput().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRange()
			);
			
			llapi.getInput().add(
			   new ListsFactoryImpl().createHLPNList()
			);
			
			llapi.getInput().add(
			   new StringsFactoryImpl().createHLPNString()
			);
			
			llapi.getInput().add(
			   new TermsFactoryImpl().createMultisetSort()
			);
			
			llapi.getInput().add(
			   new TermsFactoryImpl().createProductSort()
			);
			
			llapi.getInput().add(
			   new TermsFactoryImpl().createUserSort()
			);
			
			howmany += 14;

			ModuloHLAPI elem = new ModuloHLAPI(llapi);
			List<fr.lip6.move.pnml.hlpn.finiteEnumerations.hlapi.FiniteEnumerationHLAPI> totest = elem.getInput_finiteEnumerations_FiniteEnumerationHLAPI();

			assert totest.size() == howmany + 1 - 14;

			for (SortHLAPI unit : totest) {
             assert llapi.getInput().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "ModuloHLAPI"})
		public void getInput_finiteIntRanges_FiniteIntRangeHLAPITest(){
			Modulo llapi = new IntegersFactoryImpl().createModulo();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getInput().add(new FiniteIntRangesFactoryImpl().createFiniteIntRange());
			
			llapi.getInput().add(
			   new IntegersFactoryImpl().createNatural()
			);
			
			llapi.getInput().add(
			   new IntegersFactoryImpl().createPositive()
			);
			
			llapi.getInput().add(
			   new IntegersFactoryImpl().createHLInteger()
			);
			
			llapi.getInput().add(
			   new ArbitrarydeclarationsFactoryImpl().createAnySort()
			);
			
			llapi.getInput().add(
			   new BooleansFactoryImpl().createBool()
			);
			
			llapi.getInput().add(
			   new CyclicEnumerationsFactoryImpl().createCyclicEnumeration()
			);
			
			llapi.getInput().add(
			   new DotsFactoryImpl().createDot()
			);
			
			llapi.getInput().add(
			   new FiniteEnumerationsFactoryImpl().createFiniteEnumeration()
			);
			
			llapi.getInput().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRange()
			);
			
			llapi.getInput().add(
			   new ListsFactoryImpl().createHLPNList()
			);
			
			llapi.getInput().add(
			   new StringsFactoryImpl().createHLPNString()
			);
			
			llapi.getInput().add(
			   new TermsFactoryImpl().createMultisetSort()
			);
			
			llapi.getInput().add(
			   new TermsFactoryImpl().createProductSort()
			);
			
			llapi.getInput().add(
			   new TermsFactoryImpl().createUserSort()
			);
			
			howmany += 14;

			ModuloHLAPI elem = new ModuloHLAPI(llapi);
			List<fr.lip6.move.pnml.hlpn.finiteIntRanges.hlapi.FiniteIntRangeHLAPI> totest = elem.getInput_finiteIntRanges_FiniteIntRangeHLAPI();

			assert totest.size() == howmany + 1 - 14;

			for (SortHLAPI unit : totest) {
             assert llapi.getInput().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "ModuloHLAPI"})
		public void getInput_lists_HLPNListHLAPITest(){
			Modulo llapi = new IntegersFactoryImpl().createModulo();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getInput().add(new ListsFactoryImpl().createHLPNList());
			
			llapi.getInput().add(
			   new IntegersFactoryImpl().createNatural()
			);
			
			llapi.getInput().add(
			   new IntegersFactoryImpl().createPositive()
			);
			
			llapi.getInput().add(
			   new IntegersFactoryImpl().createHLInteger()
			);
			
			llapi.getInput().add(
			   new ArbitrarydeclarationsFactoryImpl().createAnySort()
			);
			
			llapi.getInput().add(
			   new BooleansFactoryImpl().createBool()
			);
			
			llapi.getInput().add(
			   new CyclicEnumerationsFactoryImpl().createCyclicEnumeration()
			);
			
			llapi.getInput().add(
			   new DotsFactoryImpl().createDot()
			);
			
			llapi.getInput().add(
			   new FiniteEnumerationsFactoryImpl().createFiniteEnumeration()
			);
			
			llapi.getInput().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRange()
			);
			
			llapi.getInput().add(
			   new ListsFactoryImpl().createHLPNList()
			);
			
			llapi.getInput().add(
			   new StringsFactoryImpl().createHLPNString()
			);
			
			llapi.getInput().add(
			   new TermsFactoryImpl().createMultisetSort()
			);
			
			llapi.getInput().add(
			   new TermsFactoryImpl().createProductSort()
			);
			
			llapi.getInput().add(
			   new TermsFactoryImpl().createUserSort()
			);
			
			howmany += 14;

			ModuloHLAPI elem = new ModuloHLAPI(llapi);
			List<fr.lip6.move.pnml.hlpn.lists.hlapi.HLPNListHLAPI> totest = elem.getInput_lists_HLPNListHLAPI();

			assert totest.size() == howmany + 1 - 14;

			for (SortHLAPI unit : totest) {
             assert llapi.getInput().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "ModuloHLAPI"})
		public void getInput_strings_HLPNStringHLAPITest(){
			Modulo llapi = new IntegersFactoryImpl().createModulo();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getInput().add(new StringsFactoryImpl().createHLPNString());
			
			llapi.getInput().add(
			   new IntegersFactoryImpl().createNatural()
			);
			
			llapi.getInput().add(
			   new IntegersFactoryImpl().createPositive()
			);
			
			llapi.getInput().add(
			   new IntegersFactoryImpl().createHLInteger()
			);
			
			llapi.getInput().add(
			   new ArbitrarydeclarationsFactoryImpl().createAnySort()
			);
			
			llapi.getInput().add(
			   new BooleansFactoryImpl().createBool()
			);
			
			llapi.getInput().add(
			   new CyclicEnumerationsFactoryImpl().createCyclicEnumeration()
			);
			
			llapi.getInput().add(
			   new DotsFactoryImpl().createDot()
			);
			
			llapi.getInput().add(
			   new FiniteEnumerationsFactoryImpl().createFiniteEnumeration()
			);
			
			llapi.getInput().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRange()
			);
			
			llapi.getInput().add(
			   new ListsFactoryImpl().createHLPNList()
			);
			
			llapi.getInput().add(
			   new StringsFactoryImpl().createHLPNString()
			);
			
			llapi.getInput().add(
			   new TermsFactoryImpl().createMultisetSort()
			);
			
			llapi.getInput().add(
			   new TermsFactoryImpl().createProductSort()
			);
			
			llapi.getInput().add(
			   new TermsFactoryImpl().createUserSort()
			);
			
			howmany += 14;

			ModuloHLAPI elem = new ModuloHLAPI(llapi);
			List<fr.lip6.move.pnml.hlpn.strings.hlapi.HLPNStringHLAPI> totest = elem.getInput_strings_HLPNStringHLAPI();

			assert totest.size() == howmany + 1 - 14;

			for (SortHLAPI unit : totest) {
             assert llapi.getInput().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "ModuloHLAPI"})
		public void getInput_terms_MultisetSortHLAPITest(){
			Modulo llapi = new IntegersFactoryImpl().createModulo();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getInput().add(new TermsFactoryImpl().createMultisetSort());
			
			llapi.getInput().add(
			   new IntegersFactoryImpl().createNatural()
			);
			
			llapi.getInput().add(
			   new IntegersFactoryImpl().createPositive()
			);
			
			llapi.getInput().add(
			   new IntegersFactoryImpl().createHLInteger()
			);
			
			llapi.getInput().add(
			   new ArbitrarydeclarationsFactoryImpl().createAnySort()
			);
			
			llapi.getInput().add(
			   new BooleansFactoryImpl().createBool()
			);
			
			llapi.getInput().add(
			   new CyclicEnumerationsFactoryImpl().createCyclicEnumeration()
			);
			
			llapi.getInput().add(
			   new DotsFactoryImpl().createDot()
			);
			
			llapi.getInput().add(
			   new FiniteEnumerationsFactoryImpl().createFiniteEnumeration()
			);
			
			llapi.getInput().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRange()
			);
			
			llapi.getInput().add(
			   new ListsFactoryImpl().createHLPNList()
			);
			
			llapi.getInput().add(
			   new StringsFactoryImpl().createHLPNString()
			);
			
			llapi.getInput().add(
			   new TermsFactoryImpl().createMultisetSort()
			);
			
			llapi.getInput().add(
			   new TermsFactoryImpl().createProductSort()
			);
			
			llapi.getInput().add(
			   new TermsFactoryImpl().createUserSort()
			);
			
			howmany += 14;

			ModuloHLAPI elem = new ModuloHLAPI(llapi);
			List<fr.lip6.move.pnml.hlpn.terms.hlapi.MultisetSortHLAPI> totest = elem.getInput_terms_MultisetSortHLAPI();

			assert totest.size() == howmany + 1 - 14;

			for (SortHLAPI unit : totest) {
             assert llapi.getInput().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "ModuloHLAPI"})
		public void getInput_terms_ProductSortHLAPITest(){
			Modulo llapi = new IntegersFactoryImpl().createModulo();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getInput().add(new TermsFactoryImpl().createProductSort());
			
			llapi.getInput().add(
			   new IntegersFactoryImpl().createNatural()
			);
			
			llapi.getInput().add(
			   new IntegersFactoryImpl().createPositive()
			);
			
			llapi.getInput().add(
			   new IntegersFactoryImpl().createHLInteger()
			);
			
			llapi.getInput().add(
			   new ArbitrarydeclarationsFactoryImpl().createAnySort()
			);
			
			llapi.getInput().add(
			   new BooleansFactoryImpl().createBool()
			);
			
			llapi.getInput().add(
			   new CyclicEnumerationsFactoryImpl().createCyclicEnumeration()
			);
			
			llapi.getInput().add(
			   new DotsFactoryImpl().createDot()
			);
			
			llapi.getInput().add(
			   new FiniteEnumerationsFactoryImpl().createFiniteEnumeration()
			);
			
			llapi.getInput().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRange()
			);
			
			llapi.getInput().add(
			   new ListsFactoryImpl().createHLPNList()
			);
			
			llapi.getInput().add(
			   new StringsFactoryImpl().createHLPNString()
			);
			
			llapi.getInput().add(
			   new TermsFactoryImpl().createMultisetSort()
			);
			
			llapi.getInput().add(
			   new TermsFactoryImpl().createProductSort()
			);
			
			llapi.getInput().add(
			   new TermsFactoryImpl().createUserSort()
			);
			
			howmany += 14;

			ModuloHLAPI elem = new ModuloHLAPI(llapi);
			List<fr.lip6.move.pnml.hlpn.terms.hlapi.ProductSortHLAPI> totest = elem.getInput_terms_ProductSortHLAPI();

			assert totest.size() == howmany + 1 - 14;

			for (SortHLAPI unit : totest) {
             assert llapi.getInput().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "ModuloHLAPI"})
		public void getInput_terms_UserSortHLAPITest(){
			Modulo llapi = new IntegersFactoryImpl().createModulo();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getInput().add(new TermsFactoryImpl().createUserSort());
			
			llapi.getInput().add(
			   new IntegersFactoryImpl().createNatural()
			);
			
			llapi.getInput().add(
			   new IntegersFactoryImpl().createPositive()
			);
			
			llapi.getInput().add(
			   new IntegersFactoryImpl().createHLInteger()
			);
			
			llapi.getInput().add(
			   new ArbitrarydeclarationsFactoryImpl().createAnySort()
			);
			
			llapi.getInput().add(
			   new BooleansFactoryImpl().createBool()
			);
			
			llapi.getInput().add(
			   new CyclicEnumerationsFactoryImpl().createCyclicEnumeration()
			);
			
			llapi.getInput().add(
			   new DotsFactoryImpl().createDot()
			);
			
			llapi.getInput().add(
			   new FiniteEnumerationsFactoryImpl().createFiniteEnumeration()
			);
			
			llapi.getInput().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRange()
			);
			
			llapi.getInput().add(
			   new ListsFactoryImpl().createHLPNList()
			);
			
			llapi.getInput().add(
			   new StringsFactoryImpl().createHLPNString()
			);
			
			llapi.getInput().add(
			   new TermsFactoryImpl().createMultisetSort()
			);
			
			llapi.getInput().add(
			   new TermsFactoryImpl().createProductSort()
			);
			
			llapi.getInput().add(
			   new TermsFactoryImpl().createUserSort()
			);
			
			howmany += 14;

			ModuloHLAPI elem = new ModuloHLAPI(llapi);
			List<fr.lip6.move.pnml.hlpn.terms.hlapi.UserSortHLAPI> totest = elem.getInput_terms_UserSortHLAPI();

			assert totest.size() == howmany + 1 - 14;

			for (SortHLAPI unit : totest) {
             assert llapi.getInput().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
	
	

	//setters/remover for lists.
	
	@Test(groups = { "hlapi", "ModuloHLAPI"})
	public void addSubtermHLAPITest(){
		ModuloHLAPI elem = new ModuloHLAPI(new IntegersFactoryImpl().createModulo());
		int howmany = (int)(Math.random()*10);
		for(int i =0; i<howmany;i++)
			
			elem.addSubtermHLAPI(
				new NumberConstantHLAPI(
					new IntegersFactoryImpl().createNumberConstant()
				)
			);
			

		assert elem.getContainedItem().getSubterm().size() == howmany;
	}

	@Test(groups = { "hlapi", "ModuloHLAPI"})
	public void removeSubtermTest(){
		ModuloHLAPI elem = new ModuloHLAPI(new IntegersFactoryImpl().createModulo());
		int howmany = (int)(Math.random()*10);
		int howdiff = (int)(Math.random()*10);

			
			NumberConstantHLAPI sav;
			

		for(int i =0; i<(howmany);i++)
			
			elem.addSubtermHLAPI(
				new NumberConstantHLAPI(
				  new IntegersFactoryImpl().createNumberConstant()
				)
			);
			


		
		sav =
			new NumberConstantHLAPI(
			  new IntegersFactoryImpl().createNumberConstant()
			);
		

		elem.addSubtermHLAPI(sav);
		assert elem.getContainedItem().getSubterm().size() == howmany+1;

		for(int i =0; i<(howdiff);i++)
			
			elem.addSubtermHLAPI(
				new NumberConstantHLAPI(
				  new IntegersFactoryImpl().createNumberConstant()
				)
			);
			


		elem.removeSubtermHLAPI(sav);

		assert elem.getContainedItem().getSubterm().size() == howmany+howdiff;
	}
	

	@Test(groups = { "hlapi", "ModuloHLAPI"})
	public void equalsTest(){
		Modulo a = new IntegersFactoryImpl().createModulo();
		Modulo b = new IntegersFactoryImpl().createModulo();
		ModuloHLAPI aprime = new ModuloHLAPI(a);
		ModuloHLAPI asecond = new ModuloHLAPI(a);
		ModuloHLAPI bprime = new ModuloHLAPI(b);

		assert aprime.equals(asecond);
		assert !aprime.equals(bprime);
	}

	//cloning method
	//public ModuloHLAPI clone(){
	//	return new ModuloHLAPI(this);
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
