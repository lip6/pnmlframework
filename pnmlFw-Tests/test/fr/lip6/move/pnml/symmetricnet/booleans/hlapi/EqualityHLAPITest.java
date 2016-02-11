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
 * $Id ggiffo, Thu Feb 11 16:29:01 CET 2016$
 */
package fr.lip6.move.pnml.symmetricnet.booleans.hlapi;

import fr.lip6.move.pnml.symmetricnet.booleans.Equality;

import fr.lip6.move.pnml.symmetricnet.booleans.impl.BooleansFactoryImpl;

import fr.lip6.move.pnml.symmetricnet.cyclicEnumerations.impl.CyclicEnumerationsFactoryImpl;

import fr.lip6.move.pnml.symmetricnet.dots.impl.DotsFactoryImpl;

import fr.lip6.move.pnml.symmetricnet.finiteEnumerations.impl.FiniteEnumerationsFactoryImpl;

import fr.lip6.move.pnml.symmetricnet.finiteIntRanges.impl.FiniteIntRangesFactoryImpl;

import fr.lip6.move.pnml.symmetricnet.hlcorestructure.Condition;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.HLAnnotation;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.HLMarking;

import fr.lip6.move.pnml.symmetricnet.hlcorestructure.impl.HlcorestructureFactoryImpl;

import fr.lip6.move.pnml.symmetricnet.integers.impl.IntegersFactoryImpl;

import fr.lip6.move.pnml.symmetricnet.multisets.impl.MultisetsFactoryImpl;

import fr.lip6.move.pnml.symmetricnet.partitions.PartitionElement;

import fr.lip6.move.pnml.symmetricnet.partitions.impl.PartitionsFactoryImpl;

import fr.lip6.move.pnml.symmetricnet.terms.NamedOperator;
import fr.lip6.move.pnml.symmetricnet.terms.Operator;
import fr.lip6.move.pnml.symmetricnet.terms.Sort;
import fr.lip6.move.pnml.symmetricnet.terms.Term;

import fr.lip6.move.pnml.symmetricnet.terms.impl.TermsFactoryImpl;

import java.util.List;

import  fr.lip6.move.pnml.framework.hlapi.*;
import fr.lip6.move.pnml.symmetricnet.booleans.hlapi.*;
import fr.lip6.move.pnml.symmetricnet.cyclicEnumerations.hlapi.*;
import fr.lip6.move.pnml.symmetricnet.dots.hlapi.*;
import fr.lip6.move.pnml.symmetricnet.finiteEnumerations.hlapi.*;
import fr.lip6.move.pnml.symmetricnet.finiteIntRanges.hlapi.*;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.hlapi.*;
import fr.lip6.move.pnml.symmetricnet.integers.hlapi.*;
import fr.lip6.move.pnml.symmetricnet.multisets.hlapi.*;
import fr.lip6.move.pnml.symmetricnet.partitions.hlapi.*;
import fr.lip6.move.pnml.symmetricnet.terms.hlapi.*;

import java.util.ArrayList;
import java.util.List;
import org.apache.axiom.om.*;
import fr.lip6.move.pnml.framework.utils.IdRefLinker;
import org.eclipse.emf.common.util.DiagnosticChain;
import fr.lip6.move.pnml.symmetricnet.booleans.*;
import fr.lip6.move.pnml.symmetricnet.booleans.impl.*;
import fr.lip6.move.pnml.framework.utils.exception.InnerBuildException;
import fr.lip6.move.pnml.framework.utils.exception.InvalidIDException;
import fr.lip6.move.pnml.framework.utils.exception.VoidRepositoryException;
import fr.lip6.move.pnml.framework.utils.IdRepository;
import fr.lip6.move.pnml.framework.utils.ModelRepository;
import org.testng.annotations.*;
public class EqualityHLAPITest {

	
	private SortHLAPI itemsort;
		
	private SortHLAPI itemoutput;
		
	
	private OperatorHLAPI itemcontainerOperator;
	
	private NamedOperatorHLAPI itemcontainerNamedOperator;
	
	private HLMarkingHLAPI itemcontainerHLMarking;
	
	private ConditionHLAPI itemcontainerCondition;
	
	private HLAnnotationHLAPI itemcontainerHLAnnotation;
	
	private PartitionElementHLAPI itemcontainerPartitionElement;
	


	@AfterTest(groups = { "EqualityHLAPI", "hlapi" })
	public void After() {
	    System.out.println("done for "+"EqualityHLAPI(booleans)");
	}


	@BeforeMethod(groups = { "EqualityHLAPI", "hlapi" })
	public void setup() throws Exception{
	//ModelRepository.reset(); ModelRepository.getInstance().createDocumentWorkspace("void");
	ModelRepository mr = ModelRepository.getInstance();
	mr.createDocumentWorkspace("void");
	
			
				
			itemsort = new fr.lip6.move.pnml.symmetricnet.booleans.hlapi.BoolHLAPI(
				new BooleansFactoryImpl().createBool()
			);
				
			
		
			
				
			itemoutput = new fr.lip6.move.pnml.symmetricnet.booleans.hlapi.BoolHLAPI(
				new BooleansFactoryImpl().createBool()
			);
				
			
		

	
		
			
			
		itemcontainerOperator = new fr.lip6.move.pnml.symmetricnet.booleans.hlapi.EqualityHLAPI(
		   new BooleansFactoryImpl().createEquality()
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
	@Test(groups = { "hlapi", "EqualityHLAPI"}, dependsOnMethods={"EqualityHLAPI_LLAPI"})
	public void EqualityHLAPI_1(){//BEGIN CONSTRUCTOR BODY
   @SuppressWarnings("unused")
	EqualityHLAPI totest = new EqualityHLAPI(
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
	@Test(groups = { "hlapi", "EqualityHLAPI"}, dependsOnMethods={"EqualityHLAPI_LLAPI"})
	public void EqualityHLAPI_2_containerOperator(){//BEGIN CONSTRUCTOR BODY

	EqualityHLAPI totest = new EqualityHLAPI(
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
	@Test(groups = { "hlapi", "EqualityHLAPI"}, dependsOnMethods={"EqualityHLAPI_LLAPI"})
	public void EqualityHLAPI_2_containerNamedOperator(){//BEGIN CONSTRUCTOR BODY

	EqualityHLAPI totest = new EqualityHLAPI(
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
	@Test(groups = { "hlapi", "EqualityHLAPI"}, dependsOnMethods={"EqualityHLAPI_LLAPI"})
	public void EqualityHLAPI_2_containerHLMarking(){//BEGIN CONSTRUCTOR BODY

	EqualityHLAPI totest = new EqualityHLAPI(
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
	@Test(groups = { "hlapi", "EqualityHLAPI"}, dependsOnMethods={"EqualityHLAPI_LLAPI"})
	public void EqualityHLAPI_2_containerCondition(){//BEGIN CONSTRUCTOR BODY

	EqualityHLAPI totest = new EqualityHLAPI(
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
	@Test(groups = { "hlapi", "EqualityHLAPI"}, dependsOnMethods={"EqualityHLAPI_LLAPI"})
	public void EqualityHLAPI_2_containerHLAnnotation(){//BEGIN CONSTRUCTOR BODY

	EqualityHLAPI totest = new EqualityHLAPI(
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
	@Test(groups = { "hlapi", "EqualityHLAPI"}, dependsOnMethods={"EqualityHLAPI_LLAPI"})
	public void EqualityHLAPI_2_containerPartitionElement(){//BEGIN CONSTRUCTOR BODY

	EqualityHLAPI totest = new EqualityHLAPI(
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
   @Test(groups = { "hlapi", "EqualityHLAPI"}, dependsOnMethods={"EqualityHLAPI_LLAPI"})
	public void EqualityHLAPI_4_containerOperator(){//BEGIN CONSTRUCTOR BODY

	EqualityHLAPI totest = new EqualityHLAPI(
	  itemcontainerOperator
	);

	
	assert totest.getContainerOperator().equals(itemcontainerOperator.getContainedItem());
	}
	/**
    * This constructor give access to required stuff only (and container)
    */
   @Test(groups = { "hlapi", "EqualityHLAPI"}, dependsOnMethods={"EqualityHLAPI_LLAPI"})
	public void EqualityHLAPI_4_containerNamedOperator(){//BEGIN CONSTRUCTOR BODY

	EqualityHLAPI totest = new EqualityHLAPI(
	  itemcontainerNamedOperator
	);

	
	assert totest.getContainerNamedOperator().equals(itemcontainerNamedOperator.getContainedItem());
	}
	/**
    * This constructor give access to required stuff only (and container)
    */
   @Test(groups = { "hlapi", "EqualityHLAPI"}, dependsOnMethods={"EqualityHLAPI_LLAPI"})
	public void EqualityHLAPI_4_containerHLMarking(){//BEGIN CONSTRUCTOR BODY

	EqualityHLAPI totest = new EqualityHLAPI(
	  itemcontainerHLMarking
	);

	
	assert totest.getContainerHLMarking().equals(itemcontainerHLMarking.getContainedItem());
	}
	/**
    * This constructor give access to required stuff only (and container)
    */
   @Test(groups = { "hlapi", "EqualityHLAPI"}, dependsOnMethods={"EqualityHLAPI_LLAPI"})
	public void EqualityHLAPI_4_containerCondition(){//BEGIN CONSTRUCTOR BODY

	EqualityHLAPI totest = new EqualityHLAPI(
	  itemcontainerCondition
	);

	
	assert totest.getContainerCondition().equals(itemcontainerCondition.getContainedItem());
	}
	/**
    * This constructor give access to required stuff only (and container)
    */
   @Test(groups = { "hlapi", "EqualityHLAPI"}, dependsOnMethods={"EqualityHLAPI_LLAPI"})
	public void EqualityHLAPI_4_containerHLAnnotation(){//BEGIN CONSTRUCTOR BODY

	EqualityHLAPI totest = new EqualityHLAPI(
	  itemcontainerHLAnnotation
	);

	
	assert totest.getContainerHLAnnotation().equals(itemcontainerHLAnnotation.getContainedItem());
	}
	/**
    * This constructor give access to required stuff only (and container)
    */
   @Test(groups = { "hlapi", "EqualityHLAPI"}, dependsOnMethods={"EqualityHLAPI_LLAPI"})
	public void EqualityHLAPI_4_containerPartitionElement(){//BEGIN CONSTRUCTOR BODY

	EqualityHLAPI totest = new EqualityHLAPI(
	  itemcontainerPartitionElement
	);

	
	assert totest.getContainerPartitionElement().equals(itemcontainerPartitionElement.getContainedItem());
	}


	/**
	 * This constructor encapsulate a low level API object in HLAPI.
	 */
	@Test(groups = { "hlapi", "EqualityHLAPI"})
	public void EqualityHLAPI_LLAPI(){
	   Equality llapi = new BooleansFactoryImpl().createEquality();
	   fr.lip6.move.pnml.symmetricnet.booleans.hlapi.EqualityHLAPI hlapi = new EqualityHLAPI(llapi);
		assert hlapi.getContainedItem().equals(llapi);
	}

	//getters giving HLAPI object
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "EqualityHLAPI"})
		public void getSortHLAPITest(){
			EqualityHLAPI elem = new EqualityHLAPI(new BooleansFactoryImpl().createEquality());

			
				elem.setSortHLAPI(new fr.lip6.move.pnml.symmetricnet.booleans.hlapi.BoolHLAPI(new BooleansFactoryImpl().createBool()));
				SortHLAPI totest_booleans_Bool = elem.getSortHLAPI();
				assert totest_booleans_Bool.getContainedItem().equals(elem.getSort());
			
				elem.setSortHLAPI(new fr.lip6.move.pnml.symmetricnet.cyclicEnumerations.hlapi.CyclicEnumerationHLAPI(new CyclicEnumerationsFactoryImpl().createCyclicEnumeration()));
				SortHLAPI totest_cyclicEnumerations_CyclicEnumeration = elem.getSortHLAPI();
				assert totest_cyclicEnumerations_CyclicEnumeration.getContainedItem().equals(elem.getSort());
			
				elem.setSortHLAPI(new fr.lip6.move.pnml.symmetricnet.dots.hlapi.DotHLAPI(new DotsFactoryImpl().createDot()));
				SortHLAPI totest_dots_Dot = elem.getSortHLAPI();
				assert totest_dots_Dot.getContainedItem().equals(elem.getSort());
			
				elem.setSortHLAPI(new fr.lip6.move.pnml.symmetricnet.finiteEnumerations.hlapi.FiniteEnumerationHLAPI(new FiniteEnumerationsFactoryImpl().createFiniteEnumeration()));
				SortHLAPI totest_finiteEnumerations_FiniteEnumeration = elem.getSortHLAPI();
				assert totest_finiteEnumerations_FiniteEnumeration.getContainedItem().equals(elem.getSort());
			
				elem.setSortHLAPI(new fr.lip6.move.pnml.symmetricnet.finiteIntRanges.hlapi.FiniteIntRangeHLAPI(new FiniteIntRangesFactoryImpl().createFiniteIntRange()));
				SortHLAPI totest_finiteIntRanges_FiniteIntRange = elem.getSortHLAPI();
				assert totest_finiteIntRanges_FiniteIntRange.getContainedItem().equals(elem.getSort());
			
				elem.setSortHLAPI(new fr.lip6.move.pnml.symmetricnet.integers.hlapi.NaturalHLAPI(new IntegersFactoryImpl().createNatural()));
				SortHLAPI totest_integers_Natural = elem.getSortHLAPI();
				assert totest_integers_Natural.getContainedItem().equals(elem.getSort());
			
				elem.setSortHLAPI(new fr.lip6.move.pnml.symmetricnet.integers.hlapi.PositiveHLAPI(new IntegersFactoryImpl().createPositive()));
				SortHLAPI totest_integers_Positive = elem.getSortHLAPI();
				assert totest_integers_Positive.getContainedItem().equals(elem.getSort());
			
				elem.setSortHLAPI(new fr.lip6.move.pnml.symmetricnet.integers.hlapi.HLIntegerHLAPI(new IntegersFactoryImpl().createHLInteger()));
				SortHLAPI totest_integers_HLInteger = elem.getSortHLAPI();
				assert totest_integers_HLInteger.getContainedItem().equals(elem.getSort());
			
				elem.setSortHLAPI(new fr.lip6.move.pnml.symmetricnet.terms.hlapi.MultisetSortHLAPI(new TermsFactoryImpl().createMultisetSort()));
				SortHLAPI totest_terms_MultisetSort = elem.getSortHLAPI();
				assert totest_terms_MultisetSort.getContainedItem().equals(elem.getSort());
			
				elem.setSortHLAPI(new fr.lip6.move.pnml.symmetricnet.terms.hlapi.ProductSortHLAPI(new TermsFactoryImpl().createProductSort()));
				SortHLAPI totest_terms_ProductSort = elem.getSortHLAPI();
				assert totest_terms_ProductSort.getContainedItem().equals(elem.getSort());
			
				elem.setSortHLAPI(new fr.lip6.move.pnml.symmetricnet.terms.hlapi.UserSortHLAPI(new TermsFactoryImpl().createUserSort()));
				SortHLAPI totest_terms_UserSort = elem.getSortHLAPI();
				assert totest_terms_UserSort.getContainedItem().equals(elem.getSort());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "EqualityHLAPI"})
		public void getContainerOperatorHLAPITest(){
			EqualityHLAPI elem = new EqualityHLAPI(new BooleansFactoryImpl().createEquality());

			
				elem.setContainerOperatorHLAPI(new fr.lip6.move.pnml.symmetricnet.booleans.hlapi.EqualityHLAPI(new BooleansFactoryImpl().createEquality()));
				OperatorHLAPI totest_booleans_Equality = elem.getContainerOperatorHLAPI();
				assert totest_booleans_Equality.getContainedItem().equals(elem.getContainerOperator());
			
				elem.setContainerOperatorHLAPI(new fr.lip6.move.pnml.symmetricnet.booleans.hlapi.InequalityHLAPI(new BooleansFactoryImpl().createInequality()));
				OperatorHLAPI totest_booleans_Inequality = elem.getContainerOperatorHLAPI();
				assert totest_booleans_Inequality.getContainedItem().equals(elem.getContainerOperator());
			
				elem.setContainerOperatorHLAPI(new fr.lip6.move.pnml.symmetricnet.booleans.hlapi.BooleanConstantHLAPI(new BooleansFactoryImpl().createBooleanConstant()));
				OperatorHLAPI totest_booleans_BooleanConstant = elem.getContainerOperatorHLAPI();
				assert totest_booleans_BooleanConstant.getContainedItem().equals(elem.getContainerOperator());
			
				elem.setContainerOperatorHLAPI(new fr.lip6.move.pnml.symmetricnet.booleans.hlapi.OrHLAPI(new BooleansFactoryImpl().createOr()));
				OperatorHLAPI totest_booleans_Or = elem.getContainerOperatorHLAPI();
				assert totest_booleans_Or.getContainedItem().equals(elem.getContainerOperator());
			
				elem.setContainerOperatorHLAPI(new fr.lip6.move.pnml.symmetricnet.booleans.hlapi.AndHLAPI(new BooleansFactoryImpl().createAnd()));
				OperatorHLAPI totest_booleans_And = elem.getContainerOperatorHLAPI();
				assert totest_booleans_And.getContainedItem().equals(elem.getContainerOperator());
			
				elem.setContainerOperatorHLAPI(new fr.lip6.move.pnml.symmetricnet.booleans.hlapi.ImplyHLAPI(new BooleansFactoryImpl().createImply()));
				OperatorHLAPI totest_booleans_Imply = elem.getContainerOperatorHLAPI();
				assert totest_booleans_Imply.getContainedItem().equals(elem.getContainerOperator());
			
				elem.setContainerOperatorHLAPI(new fr.lip6.move.pnml.symmetricnet.booleans.hlapi.NotHLAPI(new BooleansFactoryImpl().createNot()));
				OperatorHLAPI totest_booleans_Not = elem.getContainerOperatorHLAPI();
				assert totest_booleans_Not.getContainedItem().equals(elem.getContainerOperator());
			
				elem.setContainerOperatorHLAPI(new fr.lip6.move.pnml.symmetricnet.cyclicEnumerations.hlapi.SuccessorHLAPI(new CyclicEnumerationsFactoryImpl().createSuccessor()));
				OperatorHLAPI totest_cyclicEnumerations_Successor = elem.getContainerOperatorHLAPI();
				assert totest_cyclicEnumerations_Successor.getContainedItem().equals(elem.getContainerOperator());
			
				elem.setContainerOperatorHLAPI(new fr.lip6.move.pnml.symmetricnet.cyclicEnumerations.hlapi.PredecessorHLAPI(new CyclicEnumerationsFactoryImpl().createPredecessor()));
				OperatorHLAPI totest_cyclicEnumerations_Predecessor = elem.getContainerOperatorHLAPI();
				assert totest_cyclicEnumerations_Predecessor.getContainedItem().equals(elem.getContainerOperator());
			
				elem.setContainerOperatorHLAPI(new fr.lip6.move.pnml.symmetricnet.dots.hlapi.DotConstantHLAPI(new DotsFactoryImpl().createDotConstant()));
				OperatorHLAPI totest_dots_DotConstant = elem.getContainerOperatorHLAPI();
				assert totest_dots_DotConstant.getContainedItem().equals(elem.getContainerOperator());
			
				elem.setContainerOperatorHLAPI(new fr.lip6.move.pnml.symmetricnet.finiteIntRanges.hlapi.FiniteIntRangeConstantHLAPI(new FiniteIntRangesFactoryImpl().createFiniteIntRangeConstant()));
				OperatorHLAPI totest_finiteIntRanges_FiniteIntRangeConstant = elem.getContainerOperatorHLAPI();
				assert totest_finiteIntRanges_FiniteIntRangeConstant.getContainedItem().equals(elem.getContainerOperator());
			
				elem.setContainerOperatorHLAPI(new fr.lip6.move.pnml.symmetricnet.finiteIntRanges.hlapi.LessThanHLAPI(new FiniteIntRangesFactoryImpl().createLessThan()));
				OperatorHLAPI totest_finiteIntRanges_LessThan = elem.getContainerOperatorHLAPI();
				assert totest_finiteIntRanges_LessThan.getContainedItem().equals(elem.getContainerOperator());
			
				elem.setContainerOperatorHLAPI(new fr.lip6.move.pnml.symmetricnet.finiteIntRanges.hlapi.GreaterThanHLAPI(new FiniteIntRangesFactoryImpl().createGreaterThan()));
				OperatorHLAPI totest_finiteIntRanges_GreaterThan = elem.getContainerOperatorHLAPI();
				assert totest_finiteIntRanges_GreaterThan.getContainedItem().equals(elem.getContainerOperator());
			
				elem.setContainerOperatorHLAPI(new fr.lip6.move.pnml.symmetricnet.finiteIntRanges.hlapi.LessThanOrEqualHLAPI(new FiniteIntRangesFactoryImpl().createLessThanOrEqual()));
				OperatorHLAPI totest_finiteIntRanges_LessThanOrEqual = elem.getContainerOperatorHLAPI();
				assert totest_finiteIntRanges_LessThanOrEqual.getContainedItem().equals(elem.getContainerOperator());
			
				elem.setContainerOperatorHLAPI(new fr.lip6.move.pnml.symmetricnet.finiteIntRanges.hlapi.GreaterThanOrEqualHLAPI(new FiniteIntRangesFactoryImpl().createGreaterThanOrEqual()));
				OperatorHLAPI totest_finiteIntRanges_GreaterThanOrEqual = elem.getContainerOperatorHLAPI();
				assert totest_finiteIntRanges_GreaterThanOrEqual.getContainedItem().equals(elem.getContainerOperator());
			
				elem.setContainerOperatorHLAPI(new fr.lip6.move.pnml.symmetricnet.integers.hlapi.NumberConstantHLAPI(new IntegersFactoryImpl().createNumberConstant()));
				OperatorHLAPI totest_integers_NumberConstant = elem.getContainerOperatorHLAPI();
				assert totest_integers_NumberConstant.getContainedItem().equals(elem.getContainerOperator());
			
				elem.setContainerOperatorHLAPI(new fr.lip6.move.pnml.symmetricnet.integers.hlapi.AdditionHLAPI(new IntegersFactoryImpl().createAddition()));
				OperatorHLAPI totest_integers_Addition = elem.getContainerOperatorHLAPI();
				assert totest_integers_Addition.getContainedItem().equals(elem.getContainerOperator());
			
				elem.setContainerOperatorHLAPI(new fr.lip6.move.pnml.symmetricnet.integers.hlapi.SubtractionHLAPI(new IntegersFactoryImpl().createSubtraction()));
				OperatorHLAPI totest_integers_Subtraction = elem.getContainerOperatorHLAPI();
				assert totest_integers_Subtraction.getContainedItem().equals(elem.getContainerOperator());
			
				elem.setContainerOperatorHLAPI(new fr.lip6.move.pnml.symmetricnet.integers.hlapi.MultiplicationHLAPI(new IntegersFactoryImpl().createMultiplication()));
				OperatorHLAPI totest_integers_Multiplication = elem.getContainerOperatorHLAPI();
				assert totest_integers_Multiplication.getContainedItem().equals(elem.getContainerOperator());
			
				elem.setContainerOperatorHLAPI(new fr.lip6.move.pnml.symmetricnet.integers.hlapi.DivisionHLAPI(new IntegersFactoryImpl().createDivision()));
				OperatorHLAPI totest_integers_Division = elem.getContainerOperatorHLAPI();
				assert totest_integers_Division.getContainedItem().equals(elem.getContainerOperator());
			
				elem.setContainerOperatorHLAPI(new fr.lip6.move.pnml.symmetricnet.integers.hlapi.ModuloHLAPI(new IntegersFactoryImpl().createModulo()));
				OperatorHLAPI totest_integers_Modulo = elem.getContainerOperatorHLAPI();
				assert totest_integers_Modulo.getContainedItem().equals(elem.getContainerOperator());
			
				elem.setContainerOperatorHLAPI(new fr.lip6.move.pnml.symmetricnet.integers.hlapi.GreaterThanHLAPI(new IntegersFactoryImpl().createGreaterThan()));
				OperatorHLAPI totest_integers_GreaterThan = elem.getContainerOperatorHLAPI();
				assert totest_integers_GreaterThan.getContainedItem().equals(elem.getContainerOperator());
			
				elem.setContainerOperatorHLAPI(new fr.lip6.move.pnml.symmetricnet.integers.hlapi.GreaterThanOrEqualHLAPI(new IntegersFactoryImpl().createGreaterThanOrEqual()));
				OperatorHLAPI totest_integers_GreaterThanOrEqual = elem.getContainerOperatorHLAPI();
				assert totest_integers_GreaterThanOrEqual.getContainedItem().equals(elem.getContainerOperator());
			
				elem.setContainerOperatorHLAPI(new fr.lip6.move.pnml.symmetricnet.integers.hlapi.LessThanHLAPI(new IntegersFactoryImpl().createLessThan()));
				OperatorHLAPI totest_integers_LessThan = elem.getContainerOperatorHLAPI();
				assert totest_integers_LessThan.getContainedItem().equals(elem.getContainerOperator());
			
				elem.setContainerOperatorHLAPI(new fr.lip6.move.pnml.symmetricnet.integers.hlapi.LessThanOrEqualHLAPI(new IntegersFactoryImpl().createLessThanOrEqual()));
				OperatorHLAPI totest_integers_LessThanOrEqual = elem.getContainerOperatorHLAPI();
				assert totest_integers_LessThanOrEqual.getContainedItem().equals(elem.getContainerOperator());
			
				elem.setContainerOperatorHLAPI(new fr.lip6.move.pnml.symmetricnet.multisets.hlapi.CardinalityHLAPI(new MultisetsFactoryImpl().createCardinality()));
				OperatorHLAPI totest_multisets_Cardinality = elem.getContainerOperatorHLAPI();
				assert totest_multisets_Cardinality.getContainedItem().equals(elem.getContainerOperator());
			
				elem.setContainerOperatorHLAPI(new fr.lip6.move.pnml.symmetricnet.multisets.hlapi.ContainsHLAPI(new MultisetsFactoryImpl().createContains()));
				OperatorHLAPI totest_multisets_Contains = elem.getContainerOperatorHLAPI();
				assert totest_multisets_Contains.getContainedItem().equals(elem.getContainerOperator());
			
				elem.setContainerOperatorHLAPI(new fr.lip6.move.pnml.symmetricnet.multisets.hlapi.CardinalityOfHLAPI(new MultisetsFactoryImpl().createCardinalityOf()));
				OperatorHLAPI totest_multisets_CardinalityOf = elem.getContainerOperatorHLAPI();
				assert totest_multisets_CardinalityOf.getContainedItem().equals(elem.getContainerOperator());
			
				elem.setContainerOperatorHLAPI(new fr.lip6.move.pnml.symmetricnet.multisets.hlapi.AddHLAPI(new MultisetsFactoryImpl().createAdd()));
				OperatorHLAPI totest_multisets_Add = elem.getContainerOperatorHLAPI();
				assert totest_multisets_Add.getContainedItem().equals(elem.getContainerOperator());
			
				elem.setContainerOperatorHLAPI(new fr.lip6.move.pnml.symmetricnet.multisets.hlapi.AllHLAPI(new MultisetsFactoryImpl().createAll()));
				OperatorHLAPI totest_multisets_All = elem.getContainerOperatorHLAPI();
				assert totest_multisets_All.getContainedItem().equals(elem.getContainerOperator());
			
				elem.setContainerOperatorHLAPI(new fr.lip6.move.pnml.symmetricnet.multisets.hlapi.EmptyHLAPI(new MultisetsFactoryImpl().createEmpty()));
				OperatorHLAPI totest_multisets_Empty = elem.getContainerOperatorHLAPI();
				assert totest_multisets_Empty.getContainedItem().equals(elem.getContainerOperator());
			
				elem.setContainerOperatorHLAPI(new fr.lip6.move.pnml.symmetricnet.multisets.hlapi.NumberOfHLAPI(new MultisetsFactoryImpl().createNumberOf()));
				OperatorHLAPI totest_multisets_NumberOf = elem.getContainerOperatorHLAPI();
				assert totest_multisets_NumberOf.getContainedItem().equals(elem.getContainerOperator());
			
				elem.setContainerOperatorHLAPI(new fr.lip6.move.pnml.symmetricnet.multisets.hlapi.SubtractHLAPI(new MultisetsFactoryImpl().createSubtract()));
				OperatorHLAPI totest_multisets_Subtract = elem.getContainerOperatorHLAPI();
				assert totest_multisets_Subtract.getContainedItem().equals(elem.getContainerOperator());
			
				elem.setContainerOperatorHLAPI(new fr.lip6.move.pnml.symmetricnet.multisets.hlapi.ScalarProductHLAPI(new MultisetsFactoryImpl().createScalarProduct()));
				OperatorHLAPI totest_multisets_ScalarProduct = elem.getContainerOperatorHLAPI();
				assert totest_multisets_ScalarProduct.getContainedItem().equals(elem.getContainerOperator());
			
				elem.setContainerOperatorHLAPI(new fr.lip6.move.pnml.symmetricnet.partitions.hlapi.GreaterThanHLAPI(new PartitionsFactoryImpl().createGreaterThan()));
				OperatorHLAPI totest_partitions_GreaterThan = elem.getContainerOperatorHLAPI();
				assert totest_partitions_GreaterThan.getContainedItem().equals(elem.getContainerOperator());
			
				elem.setContainerOperatorHLAPI(new fr.lip6.move.pnml.symmetricnet.partitions.hlapi.PartitionElementOfHLAPI(new PartitionsFactoryImpl().createPartitionElementOf()));
				OperatorHLAPI totest_partitions_PartitionElementOf = elem.getContainerOperatorHLAPI();
				assert totest_partitions_PartitionElementOf.getContainedItem().equals(elem.getContainerOperator());
			
				elem.setContainerOperatorHLAPI(new fr.lip6.move.pnml.symmetricnet.partitions.hlapi.LessThanHLAPI(new PartitionsFactoryImpl().createLessThan()));
				OperatorHLAPI totest_partitions_LessThan = elem.getContainerOperatorHLAPI();
				assert totest_partitions_LessThan.getContainedItem().equals(elem.getContainerOperator());
			
				elem.setContainerOperatorHLAPI(new fr.lip6.move.pnml.symmetricnet.terms.hlapi.TupleHLAPI(new TermsFactoryImpl().createTuple()));
				OperatorHLAPI totest_terms_Tuple = elem.getContainerOperatorHLAPI();
				assert totest_terms_Tuple.getContainedItem().equals(elem.getContainerOperator());
			
				elem.setContainerOperatorHLAPI(new fr.lip6.move.pnml.symmetricnet.terms.hlapi.UserOperatorHLAPI(new TermsFactoryImpl().createUserOperator()));
				OperatorHLAPI totest_terms_UserOperator = elem.getContainerOperatorHLAPI();
				assert totest_terms_UserOperator.getContainedItem().equals(elem.getContainerOperator());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "EqualityHLAPI"})
		public void getContainerNamedOperatorHLAPITest(){
			EqualityHLAPI elem = new EqualityHLAPI(new BooleansFactoryImpl().createEquality());

			
				elem.setContainerNamedOperatorHLAPI(itemcontainerNamedOperator);
				NamedOperatorHLAPI totest = elem.getContainerNamedOperatorHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerNamedOperator());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "EqualityHLAPI"})
		public void getContainerHLMarkingHLAPITest(){
			EqualityHLAPI elem = new EqualityHLAPI(new BooleansFactoryImpl().createEquality());

			
				elem.setContainerHLMarkingHLAPI(itemcontainerHLMarking);
				HLMarkingHLAPI totest = elem.getContainerHLMarkingHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerHLMarking());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "EqualityHLAPI"})
		public void getContainerConditionHLAPITest(){
			EqualityHLAPI elem = new EqualityHLAPI(new BooleansFactoryImpl().createEquality());

			
				elem.setContainerConditionHLAPI(itemcontainerCondition);
				ConditionHLAPI totest = elem.getContainerConditionHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerCondition());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "EqualityHLAPI"})
		public void getContainerHLAnnotationHLAPITest(){
			EqualityHLAPI elem = new EqualityHLAPI(new BooleansFactoryImpl().createEquality());

			
				elem.setContainerHLAnnotationHLAPI(itemcontainerHLAnnotation);
				HLAnnotationHLAPI totest = elem.getContainerHLAnnotationHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerHLAnnotation());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "EqualityHLAPI"})
		public void getContainerPartitionElementHLAPITest(){
			EqualityHLAPI elem = new EqualityHLAPI(new BooleansFactoryImpl().createEquality());

			
				elem.setContainerPartitionElementHLAPI(itemcontainerPartitionElement);
				PartitionElementHLAPI totest = elem.getContainerPartitionElementHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerPartitionElement());
			
		}
	
	

	
		/**
		 * This test add a random number of desired objet in the list or of one of each existing subtypes.
		 * then test how many objet are retuned and if any exist inthe original list.
		 */
		@Test(groups = { "hlapi", "EqualityHLAPI"})
		public void getSubtermHLAPITest(){
			Equality llapi = new BooleansFactoryImpl().createEquality();
			int howmany;
			
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
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany = 40;
			

			EqualityHLAPI elem = new EqualityHLAPI(llapi);
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
		@Test(groups = { "hlapi", "EqualityHLAPI"})
		public void getOutputHLAPITest(){
			EqualityHLAPI elem = new EqualityHLAPI(new BooleansFactoryImpl().createEquality());

			
				elem.setOutputHLAPI(new fr.lip6.move.pnml.symmetricnet.booleans.hlapi.BoolHLAPI(new BooleansFactoryImpl().createBool()));
				SortHLAPI totest_booleans_Bool = elem.getOutputHLAPI();
				assert totest_booleans_Bool.getContainedItem().equals(elem.getOutput());
			
				elem.setOutputHLAPI(new fr.lip6.move.pnml.symmetricnet.cyclicEnumerations.hlapi.CyclicEnumerationHLAPI(new CyclicEnumerationsFactoryImpl().createCyclicEnumeration()));
				SortHLAPI totest_cyclicEnumerations_CyclicEnumeration = elem.getOutputHLAPI();
				assert totest_cyclicEnumerations_CyclicEnumeration.getContainedItem().equals(elem.getOutput());
			
				elem.setOutputHLAPI(new fr.lip6.move.pnml.symmetricnet.dots.hlapi.DotHLAPI(new DotsFactoryImpl().createDot()));
				SortHLAPI totest_dots_Dot = elem.getOutputHLAPI();
				assert totest_dots_Dot.getContainedItem().equals(elem.getOutput());
			
				elem.setOutputHLAPI(new fr.lip6.move.pnml.symmetricnet.finiteEnumerations.hlapi.FiniteEnumerationHLAPI(new FiniteEnumerationsFactoryImpl().createFiniteEnumeration()));
				SortHLAPI totest_finiteEnumerations_FiniteEnumeration = elem.getOutputHLAPI();
				assert totest_finiteEnumerations_FiniteEnumeration.getContainedItem().equals(elem.getOutput());
			
				elem.setOutputHLAPI(new fr.lip6.move.pnml.symmetricnet.finiteIntRanges.hlapi.FiniteIntRangeHLAPI(new FiniteIntRangesFactoryImpl().createFiniteIntRange()));
				SortHLAPI totest_finiteIntRanges_FiniteIntRange = elem.getOutputHLAPI();
				assert totest_finiteIntRanges_FiniteIntRange.getContainedItem().equals(elem.getOutput());
			
				elem.setOutputHLAPI(new fr.lip6.move.pnml.symmetricnet.integers.hlapi.NaturalHLAPI(new IntegersFactoryImpl().createNatural()));
				SortHLAPI totest_integers_Natural = elem.getOutputHLAPI();
				assert totest_integers_Natural.getContainedItem().equals(elem.getOutput());
			
				elem.setOutputHLAPI(new fr.lip6.move.pnml.symmetricnet.integers.hlapi.PositiveHLAPI(new IntegersFactoryImpl().createPositive()));
				SortHLAPI totest_integers_Positive = elem.getOutputHLAPI();
				assert totest_integers_Positive.getContainedItem().equals(elem.getOutput());
			
				elem.setOutputHLAPI(new fr.lip6.move.pnml.symmetricnet.integers.hlapi.HLIntegerHLAPI(new IntegersFactoryImpl().createHLInteger()));
				SortHLAPI totest_integers_HLInteger = elem.getOutputHLAPI();
				assert totest_integers_HLInteger.getContainedItem().equals(elem.getOutput());
			
				elem.setOutputHLAPI(new fr.lip6.move.pnml.symmetricnet.terms.hlapi.MultisetSortHLAPI(new TermsFactoryImpl().createMultisetSort()));
				SortHLAPI totest_terms_MultisetSort = elem.getOutputHLAPI();
				assert totest_terms_MultisetSort.getContainedItem().equals(elem.getOutput());
			
				elem.setOutputHLAPI(new fr.lip6.move.pnml.symmetricnet.terms.hlapi.ProductSortHLAPI(new TermsFactoryImpl().createProductSort()));
				SortHLAPI totest_terms_ProductSort = elem.getOutputHLAPI();
				assert totest_terms_ProductSort.getContainedItem().equals(elem.getOutput());
			
				elem.setOutputHLAPI(new fr.lip6.move.pnml.symmetricnet.terms.hlapi.UserSortHLAPI(new TermsFactoryImpl().createUserSort()));
				SortHLAPI totest_terms_UserSort = elem.getOutputHLAPI();
				assert totest_terms_UserSort.getContainedItem().equals(elem.getOutput());
			
		}
	
	

	
		/**
		 * This test add a random number of desired objet in the list or of one of each existing subtypes.
		 * then test how many objet are retuned and if any exist inthe original list.
		 */
		@Test(groups = { "hlapi", "EqualityHLAPI"})
		public void getInputHLAPITest(){
			Equality llapi = new BooleansFactoryImpl().createEquality();
			int howmany;
			
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
			   new IntegersFactoryImpl().createNatural()
			);
			
			llapi.getInput().add(
			   new IntegersFactoryImpl().createPositive()
			);
			
			llapi.getInput().add(
			   new IntegersFactoryImpl().createHLInteger()
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
			
			howmany = 11;
			

			EqualityHLAPI elem = new EqualityHLAPI(llapi);
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
		@Test(groups = { "hlapi", "EqualityHLAPI"})
		public void getSubterm_booleans_EqualityHLAPITest(){
			Equality llapi = new BooleansFactoryImpl().createEquality();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new BooleansFactoryImpl().createEquality());
			
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
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 40;

			EqualityHLAPI elem = new EqualityHLAPI(llapi);
			List<fr.lip6.move.pnml.symmetricnet.booleans.hlapi.EqualityHLAPI> totest = elem.getSubterm_booleans_EqualityHLAPI();

			assert totest.size() == howmany + 1 - 40;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "EqualityHLAPI"})
		public void getSubterm_booleans_InequalityHLAPITest(){
			Equality llapi = new BooleansFactoryImpl().createEquality();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new BooleansFactoryImpl().createInequality());
			
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
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 40;

			EqualityHLAPI elem = new EqualityHLAPI(llapi);
			List<fr.lip6.move.pnml.symmetricnet.booleans.hlapi.InequalityHLAPI> totest = elem.getSubterm_booleans_InequalityHLAPI();

			assert totest.size() == howmany + 1 - 40;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "EqualityHLAPI"})
		public void getSubterm_booleans_BooleanConstantHLAPITest(){
			Equality llapi = new BooleansFactoryImpl().createEquality();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new BooleansFactoryImpl().createBooleanConstant());
			
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
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 40;

			EqualityHLAPI elem = new EqualityHLAPI(llapi);
			List<fr.lip6.move.pnml.symmetricnet.booleans.hlapi.BooleanConstantHLAPI> totest = elem.getSubterm_booleans_BooleanConstantHLAPI();

			assert totest.size() == howmany + 1 - 40;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "EqualityHLAPI"})
		public void getSubterm_booleans_OrHLAPITest(){
			Equality llapi = new BooleansFactoryImpl().createEquality();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new BooleansFactoryImpl().createOr());
			
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
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 40;

			EqualityHLAPI elem = new EqualityHLAPI(llapi);
			List<fr.lip6.move.pnml.symmetricnet.booleans.hlapi.OrHLAPI> totest = elem.getSubterm_booleans_OrHLAPI();

			assert totest.size() == howmany + 1 - 40;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "EqualityHLAPI"})
		public void getSubterm_booleans_AndHLAPITest(){
			Equality llapi = new BooleansFactoryImpl().createEquality();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new BooleansFactoryImpl().createAnd());
			
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
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 40;

			EqualityHLAPI elem = new EqualityHLAPI(llapi);
			List<fr.lip6.move.pnml.symmetricnet.booleans.hlapi.AndHLAPI> totest = elem.getSubterm_booleans_AndHLAPI();

			assert totest.size() == howmany + 1 - 40;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "EqualityHLAPI"})
		public void getSubterm_booleans_ImplyHLAPITest(){
			Equality llapi = new BooleansFactoryImpl().createEquality();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new BooleansFactoryImpl().createImply());
			
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
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 40;

			EqualityHLAPI elem = new EqualityHLAPI(llapi);
			List<fr.lip6.move.pnml.symmetricnet.booleans.hlapi.ImplyHLAPI> totest = elem.getSubterm_booleans_ImplyHLAPI();

			assert totest.size() == howmany + 1 - 40;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "EqualityHLAPI"})
		public void getSubterm_booleans_NotHLAPITest(){
			Equality llapi = new BooleansFactoryImpl().createEquality();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new BooleansFactoryImpl().createNot());
			
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
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 40;

			EqualityHLAPI elem = new EqualityHLAPI(llapi);
			List<fr.lip6.move.pnml.symmetricnet.booleans.hlapi.NotHLAPI> totest = elem.getSubterm_booleans_NotHLAPI();

			assert totest.size() == howmany + 1 - 40;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "EqualityHLAPI"})
		public void getSubterm_cyclicEnumerations_SuccessorHLAPITest(){
			Equality llapi = new BooleansFactoryImpl().createEquality();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new CyclicEnumerationsFactoryImpl().createSuccessor());
			
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
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 40;

			EqualityHLAPI elem = new EqualityHLAPI(llapi);
			List<fr.lip6.move.pnml.symmetricnet.cyclicEnumerations.hlapi.SuccessorHLAPI> totest = elem.getSubterm_cyclicEnumerations_SuccessorHLAPI();

			assert totest.size() == howmany + 1 - 40;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "EqualityHLAPI"})
		public void getSubterm_cyclicEnumerations_PredecessorHLAPITest(){
			Equality llapi = new BooleansFactoryImpl().createEquality();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new CyclicEnumerationsFactoryImpl().createPredecessor());
			
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
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 40;

			EqualityHLAPI elem = new EqualityHLAPI(llapi);
			List<fr.lip6.move.pnml.symmetricnet.cyclicEnumerations.hlapi.PredecessorHLAPI> totest = elem.getSubterm_cyclicEnumerations_PredecessorHLAPI();

			assert totest.size() == howmany + 1 - 40;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "EqualityHLAPI"})
		public void getSubterm_dots_DotConstantHLAPITest(){
			Equality llapi = new BooleansFactoryImpl().createEquality();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new DotsFactoryImpl().createDotConstant());
			
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
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 40;

			EqualityHLAPI elem = new EqualityHLAPI(llapi);
			List<fr.lip6.move.pnml.symmetricnet.dots.hlapi.DotConstantHLAPI> totest = elem.getSubterm_dots_DotConstantHLAPI();

			assert totest.size() == howmany + 1 - 40;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "EqualityHLAPI"})
		public void getSubterm_finiteIntRanges_FiniteIntRangeConstantHLAPITest(){
			Equality llapi = new BooleansFactoryImpl().createEquality();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new FiniteIntRangesFactoryImpl().createFiniteIntRangeConstant());
			
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
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 40;

			EqualityHLAPI elem = new EqualityHLAPI(llapi);
			List<fr.lip6.move.pnml.symmetricnet.finiteIntRanges.hlapi.FiniteIntRangeConstantHLAPI> totest = elem.getSubterm_finiteIntRanges_FiniteIntRangeConstantHLAPI();

			assert totest.size() == howmany + 1 - 40;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "EqualityHLAPI"})
		public void getSubterm_finiteIntRanges_LessThanHLAPITest(){
			Equality llapi = new BooleansFactoryImpl().createEquality();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new FiniteIntRangesFactoryImpl().createLessThan());
			
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
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 40;

			EqualityHLAPI elem = new EqualityHLAPI(llapi);
			List<fr.lip6.move.pnml.symmetricnet.finiteIntRanges.hlapi.LessThanHLAPI> totest = elem.getSubterm_finiteIntRanges_LessThanHLAPI();

			assert totest.size() == howmany + 1 - 40;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "EqualityHLAPI"})
		public void getSubterm_finiteIntRanges_GreaterThanHLAPITest(){
			Equality llapi = new BooleansFactoryImpl().createEquality();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new FiniteIntRangesFactoryImpl().createGreaterThan());
			
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
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 40;

			EqualityHLAPI elem = new EqualityHLAPI(llapi);
			List<fr.lip6.move.pnml.symmetricnet.finiteIntRanges.hlapi.GreaterThanHLAPI> totest = elem.getSubterm_finiteIntRanges_GreaterThanHLAPI();

			assert totest.size() == howmany + 1 - 40;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "EqualityHLAPI"})
		public void getSubterm_finiteIntRanges_LessThanOrEqualHLAPITest(){
			Equality llapi = new BooleansFactoryImpl().createEquality();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new FiniteIntRangesFactoryImpl().createLessThanOrEqual());
			
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
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 40;

			EqualityHLAPI elem = new EqualityHLAPI(llapi);
			List<fr.lip6.move.pnml.symmetricnet.finiteIntRanges.hlapi.LessThanOrEqualHLAPI> totest = elem.getSubterm_finiteIntRanges_LessThanOrEqualHLAPI();

			assert totest.size() == howmany + 1 - 40;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "EqualityHLAPI"})
		public void getSubterm_finiteIntRanges_GreaterThanOrEqualHLAPITest(){
			Equality llapi = new BooleansFactoryImpl().createEquality();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new FiniteIntRangesFactoryImpl().createGreaterThanOrEqual());
			
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
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 40;

			EqualityHLAPI elem = new EqualityHLAPI(llapi);
			List<fr.lip6.move.pnml.symmetricnet.finiteIntRanges.hlapi.GreaterThanOrEqualHLAPI> totest = elem.getSubterm_finiteIntRanges_GreaterThanOrEqualHLAPI();

			assert totest.size() == howmany + 1 - 40;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "EqualityHLAPI"})
		public void getSubterm_integers_NumberConstantHLAPITest(){
			Equality llapi = new BooleansFactoryImpl().createEquality();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new IntegersFactoryImpl().createNumberConstant());
			
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
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 40;

			EqualityHLAPI elem = new EqualityHLAPI(llapi);
			List<fr.lip6.move.pnml.symmetricnet.integers.hlapi.NumberConstantHLAPI> totest = elem.getSubterm_integers_NumberConstantHLAPI();

			assert totest.size() == howmany + 1 - 40;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "EqualityHLAPI"})
		public void getSubterm_integers_AdditionHLAPITest(){
			Equality llapi = new BooleansFactoryImpl().createEquality();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new IntegersFactoryImpl().createAddition());
			
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
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 40;

			EqualityHLAPI elem = new EqualityHLAPI(llapi);
			List<fr.lip6.move.pnml.symmetricnet.integers.hlapi.AdditionHLAPI> totest = elem.getSubterm_integers_AdditionHLAPI();

			assert totest.size() == howmany + 1 - 40;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "EqualityHLAPI"})
		public void getSubterm_integers_SubtractionHLAPITest(){
			Equality llapi = new BooleansFactoryImpl().createEquality();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new IntegersFactoryImpl().createSubtraction());
			
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
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 40;

			EqualityHLAPI elem = new EqualityHLAPI(llapi);
			List<fr.lip6.move.pnml.symmetricnet.integers.hlapi.SubtractionHLAPI> totest = elem.getSubterm_integers_SubtractionHLAPI();

			assert totest.size() == howmany + 1 - 40;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "EqualityHLAPI"})
		public void getSubterm_integers_MultiplicationHLAPITest(){
			Equality llapi = new BooleansFactoryImpl().createEquality();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new IntegersFactoryImpl().createMultiplication());
			
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
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 40;

			EqualityHLAPI elem = new EqualityHLAPI(llapi);
			List<fr.lip6.move.pnml.symmetricnet.integers.hlapi.MultiplicationHLAPI> totest = elem.getSubterm_integers_MultiplicationHLAPI();

			assert totest.size() == howmany + 1 - 40;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "EqualityHLAPI"})
		public void getSubterm_integers_DivisionHLAPITest(){
			Equality llapi = new BooleansFactoryImpl().createEquality();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new IntegersFactoryImpl().createDivision());
			
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
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 40;

			EqualityHLAPI elem = new EqualityHLAPI(llapi);
			List<fr.lip6.move.pnml.symmetricnet.integers.hlapi.DivisionHLAPI> totest = elem.getSubterm_integers_DivisionHLAPI();

			assert totest.size() == howmany + 1 - 40;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "EqualityHLAPI"})
		public void getSubterm_integers_ModuloHLAPITest(){
			Equality llapi = new BooleansFactoryImpl().createEquality();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new IntegersFactoryImpl().createModulo());
			
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
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 40;

			EqualityHLAPI elem = new EqualityHLAPI(llapi);
			List<fr.lip6.move.pnml.symmetricnet.integers.hlapi.ModuloHLAPI> totest = elem.getSubterm_integers_ModuloHLAPI();

			assert totest.size() == howmany + 1 - 40;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "EqualityHLAPI"})
		public void getSubterm_integers_GreaterThanHLAPITest(){
			Equality llapi = new BooleansFactoryImpl().createEquality();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new IntegersFactoryImpl().createGreaterThan());
			
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
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 40;

			EqualityHLAPI elem = new EqualityHLAPI(llapi);
			List<fr.lip6.move.pnml.symmetricnet.integers.hlapi.GreaterThanHLAPI> totest = elem.getSubterm_integers_GreaterThanHLAPI();

			assert totest.size() == howmany + 1 - 40;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "EqualityHLAPI"})
		public void getSubterm_integers_GreaterThanOrEqualHLAPITest(){
			Equality llapi = new BooleansFactoryImpl().createEquality();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new IntegersFactoryImpl().createGreaterThanOrEqual());
			
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
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 40;

			EqualityHLAPI elem = new EqualityHLAPI(llapi);
			List<fr.lip6.move.pnml.symmetricnet.integers.hlapi.GreaterThanOrEqualHLAPI> totest = elem.getSubterm_integers_GreaterThanOrEqualHLAPI();

			assert totest.size() == howmany + 1 - 40;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "EqualityHLAPI"})
		public void getSubterm_integers_LessThanHLAPITest(){
			Equality llapi = new BooleansFactoryImpl().createEquality();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new IntegersFactoryImpl().createLessThan());
			
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
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 40;

			EqualityHLAPI elem = new EqualityHLAPI(llapi);
			List<fr.lip6.move.pnml.symmetricnet.integers.hlapi.LessThanHLAPI> totest = elem.getSubterm_integers_LessThanHLAPI();

			assert totest.size() == howmany + 1 - 40;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "EqualityHLAPI"})
		public void getSubterm_integers_LessThanOrEqualHLAPITest(){
			Equality llapi = new BooleansFactoryImpl().createEquality();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new IntegersFactoryImpl().createLessThanOrEqual());
			
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
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 40;

			EqualityHLAPI elem = new EqualityHLAPI(llapi);
			List<fr.lip6.move.pnml.symmetricnet.integers.hlapi.LessThanOrEqualHLAPI> totest = elem.getSubterm_integers_LessThanOrEqualHLAPI();

			assert totest.size() == howmany + 1 - 40;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "EqualityHLAPI"})
		public void getSubterm_multisets_CardinalityHLAPITest(){
			Equality llapi = new BooleansFactoryImpl().createEquality();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new MultisetsFactoryImpl().createCardinality());
			
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
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 40;

			EqualityHLAPI elem = new EqualityHLAPI(llapi);
			List<fr.lip6.move.pnml.symmetricnet.multisets.hlapi.CardinalityHLAPI> totest = elem.getSubterm_multisets_CardinalityHLAPI();

			assert totest.size() == howmany + 1 - 40;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "EqualityHLAPI"})
		public void getSubterm_multisets_ContainsHLAPITest(){
			Equality llapi = new BooleansFactoryImpl().createEquality();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new MultisetsFactoryImpl().createContains());
			
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
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 40;

			EqualityHLAPI elem = new EqualityHLAPI(llapi);
			List<fr.lip6.move.pnml.symmetricnet.multisets.hlapi.ContainsHLAPI> totest = elem.getSubterm_multisets_ContainsHLAPI();

			assert totest.size() == howmany + 1 - 40;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "EqualityHLAPI"})
		public void getSubterm_multisets_CardinalityOfHLAPITest(){
			Equality llapi = new BooleansFactoryImpl().createEquality();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new MultisetsFactoryImpl().createCardinalityOf());
			
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
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 40;

			EqualityHLAPI elem = new EqualityHLAPI(llapi);
			List<fr.lip6.move.pnml.symmetricnet.multisets.hlapi.CardinalityOfHLAPI> totest = elem.getSubterm_multisets_CardinalityOfHLAPI();

			assert totest.size() == howmany + 1 - 40;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "EqualityHLAPI"})
		public void getSubterm_multisets_AddHLAPITest(){
			Equality llapi = new BooleansFactoryImpl().createEquality();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new MultisetsFactoryImpl().createAdd());
			
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
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 40;

			EqualityHLAPI elem = new EqualityHLAPI(llapi);
			List<fr.lip6.move.pnml.symmetricnet.multisets.hlapi.AddHLAPI> totest = elem.getSubterm_multisets_AddHLAPI();

			assert totest.size() == howmany + 1 - 40;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "EqualityHLAPI"})
		public void getSubterm_multisets_AllHLAPITest(){
			Equality llapi = new BooleansFactoryImpl().createEquality();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new MultisetsFactoryImpl().createAll());
			
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
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 40;

			EqualityHLAPI elem = new EqualityHLAPI(llapi);
			List<fr.lip6.move.pnml.symmetricnet.multisets.hlapi.AllHLAPI> totest = elem.getSubterm_multisets_AllHLAPI();

			assert totest.size() == howmany + 1 - 40;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "EqualityHLAPI"})
		public void getSubterm_multisets_EmptyHLAPITest(){
			Equality llapi = new BooleansFactoryImpl().createEquality();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new MultisetsFactoryImpl().createEmpty());
			
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
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 40;

			EqualityHLAPI elem = new EqualityHLAPI(llapi);
			List<fr.lip6.move.pnml.symmetricnet.multisets.hlapi.EmptyHLAPI> totest = elem.getSubterm_multisets_EmptyHLAPI();

			assert totest.size() == howmany + 1 - 40;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "EqualityHLAPI"})
		public void getSubterm_multisets_NumberOfHLAPITest(){
			Equality llapi = new BooleansFactoryImpl().createEquality();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new MultisetsFactoryImpl().createNumberOf());
			
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
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 40;

			EqualityHLAPI elem = new EqualityHLAPI(llapi);
			List<fr.lip6.move.pnml.symmetricnet.multisets.hlapi.NumberOfHLAPI> totest = elem.getSubterm_multisets_NumberOfHLAPI();

			assert totest.size() == howmany + 1 - 40;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "EqualityHLAPI"})
		public void getSubterm_multisets_SubtractHLAPITest(){
			Equality llapi = new BooleansFactoryImpl().createEquality();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new MultisetsFactoryImpl().createSubtract());
			
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
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 40;

			EqualityHLAPI elem = new EqualityHLAPI(llapi);
			List<fr.lip6.move.pnml.symmetricnet.multisets.hlapi.SubtractHLAPI> totest = elem.getSubterm_multisets_SubtractHLAPI();

			assert totest.size() == howmany + 1 - 40;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "EqualityHLAPI"})
		public void getSubterm_multisets_ScalarProductHLAPITest(){
			Equality llapi = new BooleansFactoryImpl().createEquality();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new MultisetsFactoryImpl().createScalarProduct());
			
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
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 40;

			EqualityHLAPI elem = new EqualityHLAPI(llapi);
			List<fr.lip6.move.pnml.symmetricnet.multisets.hlapi.ScalarProductHLAPI> totest = elem.getSubterm_multisets_ScalarProductHLAPI();

			assert totest.size() == howmany + 1 - 40;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "EqualityHLAPI"})
		public void getSubterm_partitions_GreaterThanHLAPITest(){
			Equality llapi = new BooleansFactoryImpl().createEquality();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new PartitionsFactoryImpl().createGreaterThan());
			
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
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 40;

			EqualityHLAPI elem = new EqualityHLAPI(llapi);
			List<fr.lip6.move.pnml.symmetricnet.partitions.hlapi.GreaterThanHLAPI> totest = elem.getSubterm_partitions_GreaterThanHLAPI();

			assert totest.size() == howmany + 1 - 40;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "EqualityHLAPI"})
		public void getSubterm_partitions_PartitionElementOfHLAPITest(){
			Equality llapi = new BooleansFactoryImpl().createEquality();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new PartitionsFactoryImpl().createPartitionElementOf());
			
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
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 40;

			EqualityHLAPI elem = new EqualityHLAPI(llapi);
			List<fr.lip6.move.pnml.symmetricnet.partitions.hlapi.PartitionElementOfHLAPI> totest = elem.getSubterm_partitions_PartitionElementOfHLAPI();

			assert totest.size() == howmany + 1 - 40;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "EqualityHLAPI"})
		public void getSubterm_partitions_LessThanHLAPITest(){
			Equality llapi = new BooleansFactoryImpl().createEquality();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new PartitionsFactoryImpl().createLessThan());
			
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
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 40;

			EqualityHLAPI elem = new EqualityHLAPI(llapi);
			List<fr.lip6.move.pnml.symmetricnet.partitions.hlapi.LessThanHLAPI> totest = elem.getSubterm_partitions_LessThanHLAPI();

			assert totest.size() == howmany + 1 - 40;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "EqualityHLAPI"})
		public void getSubterm_terms_VariableHLAPITest(){
			Equality llapi = new BooleansFactoryImpl().createEquality();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new TermsFactoryImpl().createVariable());
			
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
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 40;

			EqualityHLAPI elem = new EqualityHLAPI(llapi);
			List<fr.lip6.move.pnml.symmetricnet.terms.hlapi.VariableHLAPI> totest = elem.getSubterm_terms_VariableHLAPI();

			assert totest.size() == howmany + 1 - 40;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "EqualityHLAPI"})
		public void getSubterm_terms_TupleHLAPITest(){
			Equality llapi = new BooleansFactoryImpl().createEquality();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new TermsFactoryImpl().createTuple());
			
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
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 40;

			EqualityHLAPI elem = new EqualityHLAPI(llapi);
			List<fr.lip6.move.pnml.symmetricnet.terms.hlapi.TupleHLAPI> totest = elem.getSubterm_terms_TupleHLAPI();

			assert totest.size() == howmany + 1 - 40;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "EqualityHLAPI"})
		public void getSubterm_terms_UserOperatorHLAPITest(){
			Equality llapi = new BooleansFactoryImpl().createEquality();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new TermsFactoryImpl().createUserOperator());
			
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
			   new TermsFactoryImpl().createVariable()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createTuple()
			);
			
			llapi.getSubterm().add(
			   new TermsFactoryImpl().createUserOperator()
			);
			
			howmany += 40;

			EqualityHLAPI elem = new EqualityHLAPI(llapi);
			List<fr.lip6.move.pnml.symmetricnet.terms.hlapi.UserOperatorHLAPI> totest = elem.getSubterm_terms_UserOperatorHLAPI();

			assert totest.size() == howmany + 1 - 40;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
	
	
	
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "EqualityHLAPI"})
		public void getInput_booleans_BoolHLAPITest(){
			Equality llapi = new BooleansFactoryImpl().createEquality();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getInput().add(new BooleansFactoryImpl().createBool());
			
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
			   new IntegersFactoryImpl().createNatural()
			);
			
			llapi.getInput().add(
			   new IntegersFactoryImpl().createPositive()
			);
			
			llapi.getInput().add(
			   new IntegersFactoryImpl().createHLInteger()
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
			
			howmany += 11;

			EqualityHLAPI elem = new EqualityHLAPI(llapi);
			List<fr.lip6.move.pnml.symmetricnet.booleans.hlapi.BoolHLAPI> totest = elem.getInput_booleans_BoolHLAPI();

			assert totest.size() == howmany + 1 - 11;

			for (SortHLAPI unit : totest) {
             assert llapi.getInput().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "EqualityHLAPI"})
		public void getInput_cyclicEnumerations_CyclicEnumerationHLAPITest(){
			Equality llapi = new BooleansFactoryImpl().createEquality();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getInput().add(new CyclicEnumerationsFactoryImpl().createCyclicEnumeration());
			
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
			   new IntegersFactoryImpl().createNatural()
			);
			
			llapi.getInput().add(
			   new IntegersFactoryImpl().createPositive()
			);
			
			llapi.getInput().add(
			   new IntegersFactoryImpl().createHLInteger()
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
			
			howmany += 11;

			EqualityHLAPI elem = new EqualityHLAPI(llapi);
			List<fr.lip6.move.pnml.symmetricnet.cyclicEnumerations.hlapi.CyclicEnumerationHLAPI> totest = elem.getInput_cyclicEnumerations_CyclicEnumerationHLAPI();

			assert totest.size() == howmany + 1 - 11;

			for (SortHLAPI unit : totest) {
             assert llapi.getInput().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "EqualityHLAPI"})
		public void getInput_dots_DotHLAPITest(){
			Equality llapi = new BooleansFactoryImpl().createEquality();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getInput().add(new DotsFactoryImpl().createDot());
			
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
			   new IntegersFactoryImpl().createNatural()
			);
			
			llapi.getInput().add(
			   new IntegersFactoryImpl().createPositive()
			);
			
			llapi.getInput().add(
			   new IntegersFactoryImpl().createHLInteger()
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
			
			howmany += 11;

			EqualityHLAPI elem = new EqualityHLAPI(llapi);
			List<fr.lip6.move.pnml.symmetricnet.dots.hlapi.DotHLAPI> totest = elem.getInput_dots_DotHLAPI();

			assert totest.size() == howmany + 1 - 11;

			for (SortHLAPI unit : totest) {
             assert llapi.getInput().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "EqualityHLAPI"})
		public void getInput_finiteEnumerations_FiniteEnumerationHLAPITest(){
			Equality llapi = new BooleansFactoryImpl().createEquality();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getInput().add(new FiniteEnumerationsFactoryImpl().createFiniteEnumeration());
			
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
			   new IntegersFactoryImpl().createNatural()
			);
			
			llapi.getInput().add(
			   new IntegersFactoryImpl().createPositive()
			);
			
			llapi.getInput().add(
			   new IntegersFactoryImpl().createHLInteger()
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
			
			howmany += 11;

			EqualityHLAPI elem = new EqualityHLAPI(llapi);
			List<fr.lip6.move.pnml.symmetricnet.finiteEnumerations.hlapi.FiniteEnumerationHLAPI> totest = elem.getInput_finiteEnumerations_FiniteEnumerationHLAPI();

			assert totest.size() == howmany + 1 - 11;

			for (SortHLAPI unit : totest) {
             assert llapi.getInput().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "EqualityHLAPI"})
		public void getInput_finiteIntRanges_FiniteIntRangeHLAPITest(){
			Equality llapi = new BooleansFactoryImpl().createEquality();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getInput().add(new FiniteIntRangesFactoryImpl().createFiniteIntRange());
			
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
			   new IntegersFactoryImpl().createNatural()
			);
			
			llapi.getInput().add(
			   new IntegersFactoryImpl().createPositive()
			);
			
			llapi.getInput().add(
			   new IntegersFactoryImpl().createHLInteger()
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
			
			howmany += 11;

			EqualityHLAPI elem = new EqualityHLAPI(llapi);
			List<fr.lip6.move.pnml.symmetricnet.finiteIntRanges.hlapi.FiniteIntRangeHLAPI> totest = elem.getInput_finiteIntRanges_FiniteIntRangeHLAPI();

			assert totest.size() == howmany + 1 - 11;

			for (SortHLAPI unit : totest) {
             assert llapi.getInput().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "EqualityHLAPI"})
		public void getInput_integers_NaturalHLAPITest(){
			Equality llapi = new BooleansFactoryImpl().createEquality();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getInput().add(new IntegersFactoryImpl().createNatural());
			
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
			   new IntegersFactoryImpl().createNatural()
			);
			
			llapi.getInput().add(
			   new IntegersFactoryImpl().createPositive()
			);
			
			llapi.getInput().add(
			   new IntegersFactoryImpl().createHLInteger()
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
			
			howmany += 11;

			EqualityHLAPI elem = new EqualityHLAPI(llapi);
			List<fr.lip6.move.pnml.symmetricnet.integers.hlapi.NaturalHLAPI> totest = elem.getInput_integers_NaturalHLAPI();

			assert totest.size() == howmany + 1 - 11;

			for (SortHLAPI unit : totest) {
             assert llapi.getInput().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "EqualityHLAPI"})
		public void getInput_integers_PositiveHLAPITest(){
			Equality llapi = new BooleansFactoryImpl().createEquality();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getInput().add(new IntegersFactoryImpl().createPositive());
			
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
			   new IntegersFactoryImpl().createNatural()
			);
			
			llapi.getInput().add(
			   new IntegersFactoryImpl().createPositive()
			);
			
			llapi.getInput().add(
			   new IntegersFactoryImpl().createHLInteger()
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
			
			howmany += 11;

			EqualityHLAPI elem = new EqualityHLAPI(llapi);
			List<fr.lip6.move.pnml.symmetricnet.integers.hlapi.PositiveHLAPI> totest = elem.getInput_integers_PositiveHLAPI();

			assert totest.size() == howmany + 1 - 11;

			for (SortHLAPI unit : totest) {
             assert llapi.getInput().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "EqualityHLAPI"})
		public void getInput_integers_HLIntegerHLAPITest(){
			Equality llapi = new BooleansFactoryImpl().createEquality();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getInput().add(new IntegersFactoryImpl().createHLInteger());
			
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
			   new IntegersFactoryImpl().createNatural()
			);
			
			llapi.getInput().add(
			   new IntegersFactoryImpl().createPositive()
			);
			
			llapi.getInput().add(
			   new IntegersFactoryImpl().createHLInteger()
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
			
			howmany += 11;

			EqualityHLAPI elem = new EqualityHLAPI(llapi);
			List<fr.lip6.move.pnml.symmetricnet.integers.hlapi.HLIntegerHLAPI> totest = elem.getInput_integers_HLIntegerHLAPI();

			assert totest.size() == howmany + 1 - 11;

			for (SortHLAPI unit : totest) {
             assert llapi.getInput().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "EqualityHLAPI"})
		public void getInput_terms_MultisetSortHLAPITest(){
			Equality llapi = new BooleansFactoryImpl().createEquality();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getInput().add(new TermsFactoryImpl().createMultisetSort());
			
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
			   new IntegersFactoryImpl().createNatural()
			);
			
			llapi.getInput().add(
			   new IntegersFactoryImpl().createPositive()
			);
			
			llapi.getInput().add(
			   new IntegersFactoryImpl().createHLInteger()
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
			
			howmany += 11;

			EqualityHLAPI elem = new EqualityHLAPI(llapi);
			List<fr.lip6.move.pnml.symmetricnet.terms.hlapi.MultisetSortHLAPI> totest = elem.getInput_terms_MultisetSortHLAPI();

			assert totest.size() == howmany + 1 - 11;

			for (SortHLAPI unit : totest) {
             assert llapi.getInput().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "EqualityHLAPI"})
		public void getInput_terms_ProductSortHLAPITest(){
			Equality llapi = new BooleansFactoryImpl().createEquality();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getInput().add(new TermsFactoryImpl().createProductSort());
			
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
			   new IntegersFactoryImpl().createNatural()
			);
			
			llapi.getInput().add(
			   new IntegersFactoryImpl().createPositive()
			);
			
			llapi.getInput().add(
			   new IntegersFactoryImpl().createHLInteger()
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
			
			howmany += 11;

			EqualityHLAPI elem = new EqualityHLAPI(llapi);
			List<fr.lip6.move.pnml.symmetricnet.terms.hlapi.ProductSortHLAPI> totest = elem.getInput_terms_ProductSortHLAPI();

			assert totest.size() == howmany + 1 - 11;

			for (SortHLAPI unit : totest) {
             assert llapi.getInput().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "EqualityHLAPI"})
		public void getInput_terms_UserSortHLAPITest(){
			Equality llapi = new BooleansFactoryImpl().createEquality();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getInput().add(new TermsFactoryImpl().createUserSort());
			
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
			   new IntegersFactoryImpl().createNatural()
			);
			
			llapi.getInput().add(
			   new IntegersFactoryImpl().createPositive()
			);
			
			llapi.getInput().add(
			   new IntegersFactoryImpl().createHLInteger()
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
			
			howmany += 11;

			EqualityHLAPI elem = new EqualityHLAPI(llapi);
			List<fr.lip6.move.pnml.symmetricnet.terms.hlapi.UserSortHLAPI> totest = elem.getInput_terms_UserSortHLAPI();

			assert totest.size() == howmany + 1 - 11;

			for (SortHLAPI unit : totest) {
             assert llapi.getInput().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
	
	

	//setters/remover for lists.
	
	@Test(groups = { "hlapi", "EqualityHLAPI"})
	public void addSubtermHLAPITest(){
		EqualityHLAPI elem = new EqualityHLAPI(new BooleansFactoryImpl().createEquality());
		int howmany = (int)(Math.random()*10);
		for(int i =0; i<howmany;i++)
			
			elem.addSubtermHLAPI(
				new EqualityHLAPI(
					new BooleansFactoryImpl().createEquality()
				)
			);
			

		assert elem.getContainedItem().getSubterm().size() == howmany;
	}

	@Test(groups = { "hlapi", "EqualityHLAPI"})
	public void removeSubtermTest(){
		EqualityHLAPI elem = new EqualityHLAPI(new BooleansFactoryImpl().createEquality());
		int howmany = (int)(Math.random()*10);
		int howdiff = (int)(Math.random()*10);

			
			EqualityHLAPI sav;
			

		for(int i =0; i<(howmany);i++)
			
			elem.addSubtermHLAPI(
				new EqualityHLAPI(
				  new BooleansFactoryImpl().createEquality()
				)
			);
			


		
		sav =
			new EqualityHLAPI(
			  new BooleansFactoryImpl().createEquality()
			);
		

		elem.addSubtermHLAPI(sav);
		assert elem.getContainedItem().getSubterm().size() == howmany+1;

		for(int i =0; i<(howdiff);i++)
			
			elem.addSubtermHLAPI(
				new EqualityHLAPI(
				  new BooleansFactoryImpl().createEquality()
				)
			);
			


		elem.removeSubtermHLAPI(sav);

		assert elem.getContainedItem().getSubterm().size() == howmany+howdiff;
	}
	

	@Test(groups = { "hlapi", "EqualityHLAPI"})
	public void equalsTest(){
		Equality a = new BooleansFactoryImpl().createEquality();
		Equality b = new BooleansFactoryImpl().createEquality();
		EqualityHLAPI aprime = new EqualityHLAPI(a);
		EqualityHLAPI asecond = new EqualityHLAPI(a);
		EqualityHLAPI bprime = new EqualityHLAPI(b);

		assert aprime.equals(asecond);
		assert !aprime.equals(bprime);
	}

	//cloning method
	//public EqualityHLAPI clone(){
	//	return new EqualityHLAPI(this);
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
