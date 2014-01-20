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
 * $Id ggiffo, Thu Jan 02 00:08:30 CET 2014$
 */
package fr.lip6.move.pnml.pthlpng.dots.hlapi;

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

import fr.lip6.move.pnml.pthlpng.hlcorestructure.Condition;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.HLAnnotation;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.HLMarking;
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
import fr.lip6.move.pnml.pthlpng.dots.*;
import fr.lip6.move.pnml.pthlpng.dots.impl.*;
import fr.lip6.move.pnml.framework.utils.exception.InnerBuildException;
import fr.lip6.move.pnml.framework.utils.exception.InvalidIDException;
import fr.lip6.move.pnml.framework.utils.exception.VoidRepositoryException;
import fr.lip6.move.pnml.framework.utils.IdRepository;
import fr.lip6.move.pnml.framework.utils.ModelRepository;
import org.testng.annotations.*;
public class DotConstantHLAPITest {

	
	private SortHLAPI itemsort;
		
	private SortHLAPI itemoutput;
		
	
	private OperatorHLAPI itemcontainerOperator;
	
	private NamedOperatorHLAPI itemcontainerNamedOperator;
	
	private HLMarkingHLAPI itemcontainerHLMarking;
	
	private ConditionHLAPI itemcontainerCondition;
	
	private HLAnnotationHLAPI itemcontainerHLAnnotation;
	
	private PartitionElementHLAPI itemcontainerPartitionElement;
	


	@AfterTest(groups = { "DotConstantHLAPI", "hlapi" })
	public void After() {
	    System.out.println("done for "+"DotConstantHLAPI(dots)");
	}


	@BeforeMethod(groups = { "DotConstantHLAPI", "hlapi" })
	public void setup() throws Exception{
	//ModelRepository.reset(); ModelRepository.getInstance().createDocumentWorkspace("void");
	ModelRepository mr = ModelRepository.getInstance();
	mr.createDocumentWorkspace("void");
	
			
				
			itemsort = new fr.lip6.move.pnml.pthlpng.dots.hlapi.DotHLAPI(
				new DotsFactoryImpl().createDot()
			);
				
			
		
			
				
			itemoutput = new fr.lip6.move.pnml.pthlpng.dots.hlapi.DotHLAPI(
				new DotsFactoryImpl().createDot()
			);
				
			
		

	
		
			
			
		itemcontainerOperator = new fr.lip6.move.pnml.pthlpng.dots.hlapi.DotConstantHLAPI(
		   new DotsFactoryImpl().createDotConstant()
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
	@Test(groups = { "hlapi", "DotConstantHLAPI"}, dependsOnMethods={"DotConstantHLAPI_LLAPI"})
	public void DotConstantHLAPI_1(){//BEGIN CONSTRUCTOR BODY
   @SuppressWarnings("unused")
	DotConstantHLAPI totest = new DotConstantHLAPI(
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
	@Test(groups = { "hlapi", "DotConstantHLAPI"}, dependsOnMethods={"DotConstantHLAPI_LLAPI"})
	public void DotConstantHLAPI_2_containerOperator(){//BEGIN CONSTRUCTOR BODY

	DotConstantHLAPI totest = new DotConstantHLAPI(
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
	@Test(groups = { "hlapi", "DotConstantHLAPI"}, dependsOnMethods={"DotConstantHLAPI_LLAPI"})
	public void DotConstantHLAPI_2_containerNamedOperator(){//BEGIN CONSTRUCTOR BODY

	DotConstantHLAPI totest = new DotConstantHLAPI(
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
	@Test(groups = { "hlapi", "DotConstantHLAPI"}, dependsOnMethods={"DotConstantHLAPI_LLAPI"})
	public void DotConstantHLAPI_2_containerHLMarking(){//BEGIN CONSTRUCTOR BODY

	DotConstantHLAPI totest = new DotConstantHLAPI(
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
	@Test(groups = { "hlapi", "DotConstantHLAPI"}, dependsOnMethods={"DotConstantHLAPI_LLAPI"})
	public void DotConstantHLAPI_2_containerCondition(){//BEGIN CONSTRUCTOR BODY

	DotConstantHLAPI totest = new DotConstantHLAPI(
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
	@Test(groups = { "hlapi", "DotConstantHLAPI"}, dependsOnMethods={"DotConstantHLAPI_LLAPI"})
	public void DotConstantHLAPI_2_containerHLAnnotation(){//BEGIN CONSTRUCTOR BODY

	DotConstantHLAPI totest = new DotConstantHLAPI(
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
	@Test(groups = { "hlapi", "DotConstantHLAPI"}, dependsOnMethods={"DotConstantHLAPI_LLAPI"})
	public void DotConstantHLAPI_2_containerPartitionElement(){//BEGIN CONSTRUCTOR BODY

	DotConstantHLAPI totest = new DotConstantHLAPI(
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
   @Test(groups = { "hlapi", "DotConstantHLAPI"}, dependsOnMethods={"DotConstantHLAPI_LLAPI"})
	public void DotConstantHLAPI_4_containerOperator(){//BEGIN CONSTRUCTOR BODY

	DotConstantHLAPI totest = new DotConstantHLAPI(
	  itemcontainerOperator
	);

	
	assert totest.getContainerOperator().equals(itemcontainerOperator.getContainedItem());
	}
	/**
    * This constructor give access to required stuff only (and container)
    */
   @Test(groups = { "hlapi", "DotConstantHLAPI"}, dependsOnMethods={"DotConstantHLAPI_LLAPI"})
	public void DotConstantHLAPI_4_containerNamedOperator(){//BEGIN CONSTRUCTOR BODY

	DotConstantHLAPI totest = new DotConstantHLAPI(
	  itemcontainerNamedOperator
	);

	
	assert totest.getContainerNamedOperator().equals(itemcontainerNamedOperator.getContainedItem());
	}
	/**
    * This constructor give access to required stuff only (and container)
    */
   @Test(groups = { "hlapi", "DotConstantHLAPI"}, dependsOnMethods={"DotConstantHLAPI_LLAPI"})
	public void DotConstantHLAPI_4_containerHLMarking(){//BEGIN CONSTRUCTOR BODY

	DotConstantHLAPI totest = new DotConstantHLAPI(
	  itemcontainerHLMarking
	);

	
	assert totest.getContainerHLMarking().equals(itemcontainerHLMarking.getContainedItem());
	}
	/**
    * This constructor give access to required stuff only (and container)
    */
   @Test(groups = { "hlapi", "DotConstantHLAPI"}, dependsOnMethods={"DotConstantHLAPI_LLAPI"})
	public void DotConstantHLAPI_4_containerCondition(){//BEGIN CONSTRUCTOR BODY

	DotConstantHLAPI totest = new DotConstantHLAPI(
	  itemcontainerCondition
	);

	
	assert totest.getContainerCondition().equals(itemcontainerCondition.getContainedItem());
	}
	/**
    * This constructor give access to required stuff only (and container)
    */
   @Test(groups = { "hlapi", "DotConstantHLAPI"}, dependsOnMethods={"DotConstantHLAPI_LLAPI"})
	public void DotConstantHLAPI_4_containerHLAnnotation(){//BEGIN CONSTRUCTOR BODY

	DotConstantHLAPI totest = new DotConstantHLAPI(
	  itemcontainerHLAnnotation
	);

	
	assert totest.getContainerHLAnnotation().equals(itemcontainerHLAnnotation.getContainedItem());
	}
	/**
    * This constructor give access to required stuff only (and container)
    */
   @Test(groups = { "hlapi", "DotConstantHLAPI"}, dependsOnMethods={"DotConstantHLAPI_LLAPI"})
	public void DotConstantHLAPI_4_containerPartitionElement(){//BEGIN CONSTRUCTOR BODY

	DotConstantHLAPI totest = new DotConstantHLAPI(
	  itemcontainerPartitionElement
	);

	
	assert totest.getContainerPartitionElement().equals(itemcontainerPartitionElement.getContainedItem());
	}


	/**
	 * This constructor encapsulate a low level API object in HLAPI.
	 */
	@Test(groups = { "hlapi", "DotConstantHLAPI"})
	public void DotConstantHLAPI_LLAPI(){
	   DotConstant llapi = new DotsFactoryImpl().createDotConstant();
	   fr.lip6.move.pnml.pthlpng.dots.hlapi.DotConstantHLAPI hlapi = new DotConstantHLAPI(llapi);
		assert hlapi.getContainedItem().equals(llapi);
	}

	//getters giving HLAPI object
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "DotConstantHLAPI"})
		public void getSortHLAPITest(){
			DotConstantHLAPI elem = new DotConstantHLAPI(new DotsFactoryImpl().createDotConstant());

			
				elem.setSortHLAPI(new fr.lip6.move.pnml.pthlpng.dots.hlapi.DotHLAPI(new DotsFactoryImpl().createDot()));
				SortHLAPI totest_dots_Dot = elem.getSortHLAPI();
				assert totest_dots_Dot.getContainedItem().equals(elem.getSort());
			
				elem.setSortHLAPI(new fr.lip6.move.pnml.pthlpng.booleans.hlapi.BoolHLAPI(new BooleansFactoryImpl().createBool()));
				SortHLAPI totest_booleans_Bool = elem.getSortHLAPI();
				assert totest_booleans_Bool.getContainedItem().equals(elem.getSort());
			
				elem.setSortHLAPI(new fr.lip6.move.pnml.pthlpng.terms.hlapi.MultisetSortHLAPI(new TermsFactoryImpl().createMultisetSort()));
				SortHLAPI totest_terms_MultisetSort = elem.getSortHLAPI();
				assert totest_terms_MultisetSort.getContainedItem().equals(elem.getSort());
			
				elem.setSortHLAPI(new fr.lip6.move.pnml.pthlpng.terms.hlapi.ProductSortHLAPI(new TermsFactoryImpl().createProductSort()));
				SortHLAPI totest_terms_ProductSort = elem.getSortHLAPI();
				assert totest_terms_ProductSort.getContainedItem().equals(elem.getSort());
			
				elem.setSortHLAPI(new fr.lip6.move.pnml.pthlpng.terms.hlapi.UserSortHLAPI(new TermsFactoryImpl().createUserSort()));
				SortHLAPI totest_terms_UserSort = elem.getSortHLAPI();
				assert totest_terms_UserSort.getContainedItem().equals(elem.getSort());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "DotConstantHLAPI"})
		public void getContainerOperatorHLAPITest(){
			DotConstantHLAPI elem = new DotConstantHLAPI(new DotsFactoryImpl().createDotConstant());

			
				elem.setContainerOperatorHLAPI(new fr.lip6.move.pnml.pthlpng.dots.hlapi.DotConstantHLAPI(new DotsFactoryImpl().createDotConstant()));
				OperatorHLAPI totest_dots_DotConstant = elem.getContainerOperatorHLAPI();
				assert totest_dots_DotConstant.getContainedItem().equals(elem.getContainerOperator());
			
				elem.setContainerOperatorHLAPI(new fr.lip6.move.pnml.pthlpng.booleans.hlapi.EqualityHLAPI(new BooleansFactoryImpl().createEquality()));
				OperatorHLAPI totest_booleans_Equality = elem.getContainerOperatorHLAPI();
				assert totest_booleans_Equality.getContainedItem().equals(elem.getContainerOperator());
			
				elem.setContainerOperatorHLAPI(new fr.lip6.move.pnml.pthlpng.booleans.hlapi.InequalityHLAPI(new BooleansFactoryImpl().createInequality()));
				OperatorHLAPI totest_booleans_Inequality = elem.getContainerOperatorHLAPI();
				assert totest_booleans_Inequality.getContainedItem().equals(elem.getContainerOperator());
			
				elem.setContainerOperatorHLAPI(new fr.lip6.move.pnml.pthlpng.booleans.hlapi.BooleanConstantHLAPI(new BooleansFactoryImpl().createBooleanConstant()));
				OperatorHLAPI totest_booleans_BooleanConstant = elem.getContainerOperatorHLAPI();
				assert totest_booleans_BooleanConstant.getContainedItem().equals(elem.getContainerOperator());
			
				elem.setContainerOperatorHLAPI(new fr.lip6.move.pnml.pthlpng.booleans.hlapi.OrHLAPI(new BooleansFactoryImpl().createOr()));
				OperatorHLAPI totest_booleans_Or = elem.getContainerOperatorHLAPI();
				assert totest_booleans_Or.getContainedItem().equals(elem.getContainerOperator());
			
				elem.setContainerOperatorHLAPI(new fr.lip6.move.pnml.pthlpng.booleans.hlapi.AndHLAPI(new BooleansFactoryImpl().createAnd()));
				OperatorHLAPI totest_booleans_And = elem.getContainerOperatorHLAPI();
				assert totest_booleans_And.getContainedItem().equals(elem.getContainerOperator());
			
				elem.setContainerOperatorHLAPI(new fr.lip6.move.pnml.pthlpng.booleans.hlapi.ImplyHLAPI(new BooleansFactoryImpl().createImply()));
				OperatorHLAPI totest_booleans_Imply = elem.getContainerOperatorHLAPI();
				assert totest_booleans_Imply.getContainedItem().equals(elem.getContainerOperator());
			
				elem.setContainerOperatorHLAPI(new fr.lip6.move.pnml.pthlpng.booleans.hlapi.NotHLAPI(new BooleansFactoryImpl().createNot()));
				OperatorHLAPI totest_booleans_Not = elem.getContainerOperatorHLAPI();
				assert totest_booleans_Not.getContainedItem().equals(elem.getContainerOperator());
			
				elem.setContainerOperatorHLAPI(new fr.lip6.move.pnml.pthlpng.multisets.hlapi.CardinalityHLAPI(new MultisetsFactoryImpl().createCardinality()));
				OperatorHLAPI totest_multisets_Cardinality = elem.getContainerOperatorHLAPI();
				assert totest_multisets_Cardinality.getContainedItem().equals(elem.getContainerOperator());
			
				elem.setContainerOperatorHLAPI(new fr.lip6.move.pnml.pthlpng.multisets.hlapi.ContainsHLAPI(new MultisetsFactoryImpl().createContains()));
				OperatorHLAPI totest_multisets_Contains = elem.getContainerOperatorHLAPI();
				assert totest_multisets_Contains.getContainedItem().equals(elem.getContainerOperator());
			
				elem.setContainerOperatorHLAPI(new fr.lip6.move.pnml.pthlpng.multisets.hlapi.CardinalityOfHLAPI(new MultisetsFactoryImpl().createCardinalityOf()));
				OperatorHLAPI totest_multisets_CardinalityOf = elem.getContainerOperatorHLAPI();
				assert totest_multisets_CardinalityOf.getContainedItem().equals(elem.getContainerOperator());
			
				elem.setContainerOperatorHLAPI(new fr.lip6.move.pnml.pthlpng.multisets.hlapi.AddHLAPI(new MultisetsFactoryImpl().createAdd()));
				OperatorHLAPI totest_multisets_Add = elem.getContainerOperatorHLAPI();
				assert totest_multisets_Add.getContainedItem().equals(elem.getContainerOperator());
			
				elem.setContainerOperatorHLAPI(new fr.lip6.move.pnml.pthlpng.multisets.hlapi.AllHLAPI(new MultisetsFactoryImpl().createAll()));
				OperatorHLAPI totest_multisets_All = elem.getContainerOperatorHLAPI();
				assert totest_multisets_All.getContainedItem().equals(elem.getContainerOperator());
			
				elem.setContainerOperatorHLAPI(new fr.lip6.move.pnml.pthlpng.multisets.hlapi.EmptyHLAPI(new MultisetsFactoryImpl().createEmpty()));
				OperatorHLAPI totest_multisets_Empty = elem.getContainerOperatorHLAPI();
				assert totest_multisets_Empty.getContainedItem().equals(elem.getContainerOperator());
			
				elem.setContainerOperatorHLAPI(new fr.lip6.move.pnml.pthlpng.multisets.hlapi.NumberOfHLAPI(new MultisetsFactoryImpl().createNumberOf()));
				OperatorHLAPI totest_multisets_NumberOf = elem.getContainerOperatorHLAPI();
				assert totest_multisets_NumberOf.getContainedItem().equals(elem.getContainerOperator());
			
				elem.setContainerOperatorHLAPI(new fr.lip6.move.pnml.pthlpng.multisets.hlapi.SubtractHLAPI(new MultisetsFactoryImpl().createSubtract()));
				OperatorHLAPI totest_multisets_Subtract = elem.getContainerOperatorHLAPI();
				assert totest_multisets_Subtract.getContainedItem().equals(elem.getContainerOperator());
			
				elem.setContainerOperatorHLAPI(new fr.lip6.move.pnml.pthlpng.multisets.hlapi.ScalarProductHLAPI(new MultisetsFactoryImpl().createScalarProduct()));
				OperatorHLAPI totest_multisets_ScalarProduct = elem.getContainerOperatorHLAPI();
				assert totest_multisets_ScalarProduct.getContainedItem().equals(elem.getContainerOperator());
			
				elem.setContainerOperatorHLAPI(new fr.lip6.move.pnml.pthlpng.partitions.hlapi.GreaterThanHLAPI(new PartitionsFactoryImpl().createGreaterThan()));
				OperatorHLAPI totest_partitions_GreaterThan = elem.getContainerOperatorHLAPI();
				assert totest_partitions_GreaterThan.getContainedItem().equals(elem.getContainerOperator());
			
				elem.setContainerOperatorHLAPI(new fr.lip6.move.pnml.pthlpng.partitions.hlapi.PartitionElementOfHLAPI(new PartitionsFactoryImpl().createPartitionElementOf()));
				OperatorHLAPI totest_partitions_PartitionElementOf = elem.getContainerOperatorHLAPI();
				assert totest_partitions_PartitionElementOf.getContainedItem().equals(elem.getContainerOperator());
			
				elem.setContainerOperatorHLAPI(new fr.lip6.move.pnml.pthlpng.partitions.hlapi.LessThanHLAPI(new PartitionsFactoryImpl().createLessThan()));
				OperatorHLAPI totest_partitions_LessThan = elem.getContainerOperatorHLAPI();
				assert totest_partitions_LessThan.getContainedItem().equals(elem.getContainerOperator());
			
				elem.setContainerOperatorHLAPI(new fr.lip6.move.pnml.pthlpng.terms.hlapi.TupleHLAPI(new TermsFactoryImpl().createTuple()));
				OperatorHLAPI totest_terms_Tuple = elem.getContainerOperatorHLAPI();
				assert totest_terms_Tuple.getContainedItem().equals(elem.getContainerOperator());
			
				elem.setContainerOperatorHLAPI(new fr.lip6.move.pnml.pthlpng.terms.hlapi.UserOperatorHLAPI(new TermsFactoryImpl().createUserOperator()));
				OperatorHLAPI totest_terms_UserOperator = elem.getContainerOperatorHLAPI();
				assert totest_terms_UserOperator.getContainedItem().equals(elem.getContainerOperator());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "DotConstantHLAPI"})
		public void getContainerNamedOperatorHLAPITest(){
			DotConstantHLAPI elem = new DotConstantHLAPI(new DotsFactoryImpl().createDotConstant());

			
				elem.setContainerNamedOperatorHLAPI(itemcontainerNamedOperator);
				NamedOperatorHLAPI totest = elem.getContainerNamedOperatorHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerNamedOperator());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "DotConstantHLAPI"})
		public void getContainerHLMarkingHLAPITest(){
			DotConstantHLAPI elem = new DotConstantHLAPI(new DotsFactoryImpl().createDotConstant());

			
				elem.setContainerHLMarkingHLAPI(itemcontainerHLMarking);
				HLMarkingHLAPI totest = elem.getContainerHLMarkingHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerHLMarking());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "DotConstantHLAPI"})
		public void getContainerConditionHLAPITest(){
			DotConstantHLAPI elem = new DotConstantHLAPI(new DotsFactoryImpl().createDotConstant());

			
				elem.setContainerConditionHLAPI(itemcontainerCondition);
				ConditionHLAPI totest = elem.getContainerConditionHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerCondition());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "DotConstantHLAPI"})
		public void getContainerHLAnnotationHLAPITest(){
			DotConstantHLAPI elem = new DotConstantHLAPI(new DotsFactoryImpl().createDotConstant());

			
				elem.setContainerHLAnnotationHLAPI(itemcontainerHLAnnotation);
				HLAnnotationHLAPI totest = elem.getContainerHLAnnotationHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerHLAnnotation());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "DotConstantHLAPI"})
		public void getContainerPartitionElementHLAPITest(){
			DotConstantHLAPI elem = new DotConstantHLAPI(new DotsFactoryImpl().createDotConstant());

			
				elem.setContainerPartitionElementHLAPI(itemcontainerPartitionElement);
				PartitionElementHLAPI totest = elem.getContainerPartitionElementHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerPartitionElement());
			
		}
	
	

	
		/**
		 * This test add a random number of desired objet in the list or of one of each existing subtypes.
		 * then test how many objet are retuned and if any exist inthe original list.
		 */
		@Test(groups = { "hlapi", "DotConstantHLAPI"})
		public void getSubtermHLAPITest(){
			DotConstant llapi = new DotsFactoryImpl().createDotConstant();
			int howmany;
			
			llapi.getSubterm().add(
			   new DotsFactoryImpl().createDotConstant()
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
			
			howmany = 23;
			

			DotConstantHLAPI elem = new DotConstantHLAPI(llapi);
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
		@Test(groups = { "hlapi", "DotConstantHLAPI"})
		public void getOutputHLAPITest(){
			DotConstantHLAPI elem = new DotConstantHLAPI(new DotsFactoryImpl().createDotConstant());

			
				elem.setOutputHLAPI(new fr.lip6.move.pnml.pthlpng.dots.hlapi.DotHLAPI(new DotsFactoryImpl().createDot()));
				SortHLAPI totest_dots_Dot = elem.getOutputHLAPI();
				assert totest_dots_Dot.getContainedItem().equals(elem.getOutput());
			
				elem.setOutputHLAPI(new fr.lip6.move.pnml.pthlpng.booleans.hlapi.BoolHLAPI(new BooleansFactoryImpl().createBool()));
				SortHLAPI totest_booleans_Bool = elem.getOutputHLAPI();
				assert totest_booleans_Bool.getContainedItem().equals(elem.getOutput());
			
				elem.setOutputHLAPI(new fr.lip6.move.pnml.pthlpng.terms.hlapi.MultisetSortHLAPI(new TermsFactoryImpl().createMultisetSort()));
				SortHLAPI totest_terms_MultisetSort = elem.getOutputHLAPI();
				assert totest_terms_MultisetSort.getContainedItem().equals(elem.getOutput());
			
				elem.setOutputHLAPI(new fr.lip6.move.pnml.pthlpng.terms.hlapi.ProductSortHLAPI(new TermsFactoryImpl().createProductSort()));
				SortHLAPI totest_terms_ProductSort = elem.getOutputHLAPI();
				assert totest_terms_ProductSort.getContainedItem().equals(elem.getOutput());
			
				elem.setOutputHLAPI(new fr.lip6.move.pnml.pthlpng.terms.hlapi.UserSortHLAPI(new TermsFactoryImpl().createUserSort()));
				SortHLAPI totest_terms_UserSort = elem.getOutputHLAPI();
				assert totest_terms_UserSort.getContainedItem().equals(elem.getOutput());
			
		}
	
	

	
		/**
		 * This test add a random number of desired objet in the list or of one of each existing subtypes.
		 * then test how many objet are retuned and if any exist inthe original list.
		 */
		@Test(groups = { "hlapi", "DotConstantHLAPI"})
		public void getInputHLAPITest(){
			DotConstant llapi = new DotsFactoryImpl().createDotConstant();
			int howmany;
			
			llapi.getInput().add(
			   new DotsFactoryImpl().createDot()
			);
			
			llapi.getInput().add(
			   new BooleansFactoryImpl().createBool()
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
			
			howmany = 5;
			

			DotConstantHLAPI elem = new DotConstantHLAPI(llapi);
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
		@Test(groups = { "hlapi", "DotConstantHLAPI"})
		public void getSubterm_dots_DotConstantHLAPITest(){
			DotConstant llapi = new DotsFactoryImpl().createDotConstant();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new DotsFactoryImpl().createDotConstant());
			
			llapi.getSubterm().add(
			   new DotsFactoryImpl().createDotConstant()
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
			
			howmany += 23;

			DotConstantHLAPI elem = new DotConstantHLAPI(llapi);
			List<fr.lip6.move.pnml.pthlpng.dots.hlapi.DotConstantHLAPI> totest = elem.getSubterm_dots_DotConstantHLAPI();

			assert totest.size() == howmany + 1 - 23;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "DotConstantHLAPI"})
		public void getSubterm_booleans_EqualityHLAPITest(){
			DotConstant llapi = new DotsFactoryImpl().createDotConstant();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new BooleansFactoryImpl().createEquality());
			
			llapi.getSubterm().add(
			   new DotsFactoryImpl().createDotConstant()
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
			
			howmany += 23;

			DotConstantHLAPI elem = new DotConstantHLAPI(llapi);
			List<fr.lip6.move.pnml.pthlpng.booleans.hlapi.EqualityHLAPI> totest = elem.getSubterm_booleans_EqualityHLAPI();

			assert totest.size() == howmany + 1 - 23;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "DotConstantHLAPI"})
		public void getSubterm_booleans_InequalityHLAPITest(){
			DotConstant llapi = new DotsFactoryImpl().createDotConstant();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new BooleansFactoryImpl().createInequality());
			
			llapi.getSubterm().add(
			   new DotsFactoryImpl().createDotConstant()
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
			
			howmany += 23;

			DotConstantHLAPI elem = new DotConstantHLAPI(llapi);
			List<fr.lip6.move.pnml.pthlpng.booleans.hlapi.InequalityHLAPI> totest = elem.getSubterm_booleans_InequalityHLAPI();

			assert totest.size() == howmany + 1 - 23;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "DotConstantHLAPI"})
		public void getSubterm_booleans_BooleanConstantHLAPITest(){
			DotConstant llapi = new DotsFactoryImpl().createDotConstant();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new BooleansFactoryImpl().createBooleanConstant());
			
			llapi.getSubterm().add(
			   new DotsFactoryImpl().createDotConstant()
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
			
			howmany += 23;

			DotConstantHLAPI elem = new DotConstantHLAPI(llapi);
			List<fr.lip6.move.pnml.pthlpng.booleans.hlapi.BooleanConstantHLAPI> totest = elem.getSubterm_booleans_BooleanConstantHLAPI();

			assert totest.size() == howmany + 1 - 23;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "DotConstantHLAPI"})
		public void getSubterm_booleans_OrHLAPITest(){
			DotConstant llapi = new DotsFactoryImpl().createDotConstant();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new BooleansFactoryImpl().createOr());
			
			llapi.getSubterm().add(
			   new DotsFactoryImpl().createDotConstant()
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
			
			howmany += 23;

			DotConstantHLAPI elem = new DotConstantHLAPI(llapi);
			List<fr.lip6.move.pnml.pthlpng.booleans.hlapi.OrHLAPI> totest = elem.getSubterm_booleans_OrHLAPI();

			assert totest.size() == howmany + 1 - 23;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "DotConstantHLAPI"})
		public void getSubterm_booleans_AndHLAPITest(){
			DotConstant llapi = new DotsFactoryImpl().createDotConstant();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new BooleansFactoryImpl().createAnd());
			
			llapi.getSubterm().add(
			   new DotsFactoryImpl().createDotConstant()
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
			
			howmany += 23;

			DotConstantHLAPI elem = new DotConstantHLAPI(llapi);
			List<fr.lip6.move.pnml.pthlpng.booleans.hlapi.AndHLAPI> totest = elem.getSubterm_booleans_AndHLAPI();

			assert totest.size() == howmany + 1 - 23;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "DotConstantHLAPI"})
		public void getSubterm_booleans_ImplyHLAPITest(){
			DotConstant llapi = new DotsFactoryImpl().createDotConstant();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new BooleansFactoryImpl().createImply());
			
			llapi.getSubterm().add(
			   new DotsFactoryImpl().createDotConstant()
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
			
			howmany += 23;

			DotConstantHLAPI elem = new DotConstantHLAPI(llapi);
			List<fr.lip6.move.pnml.pthlpng.booleans.hlapi.ImplyHLAPI> totest = elem.getSubterm_booleans_ImplyHLAPI();

			assert totest.size() == howmany + 1 - 23;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "DotConstantHLAPI"})
		public void getSubterm_booleans_NotHLAPITest(){
			DotConstant llapi = new DotsFactoryImpl().createDotConstant();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new BooleansFactoryImpl().createNot());
			
			llapi.getSubterm().add(
			   new DotsFactoryImpl().createDotConstant()
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
			
			howmany += 23;

			DotConstantHLAPI elem = new DotConstantHLAPI(llapi);
			List<fr.lip6.move.pnml.pthlpng.booleans.hlapi.NotHLAPI> totest = elem.getSubterm_booleans_NotHLAPI();

			assert totest.size() == howmany + 1 - 23;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "DotConstantHLAPI"})
		public void getSubterm_multisets_CardinalityHLAPITest(){
			DotConstant llapi = new DotsFactoryImpl().createDotConstant();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new MultisetsFactoryImpl().createCardinality());
			
			llapi.getSubterm().add(
			   new DotsFactoryImpl().createDotConstant()
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
			
			howmany += 23;

			DotConstantHLAPI elem = new DotConstantHLAPI(llapi);
			List<fr.lip6.move.pnml.pthlpng.multisets.hlapi.CardinalityHLAPI> totest = elem.getSubterm_multisets_CardinalityHLAPI();

			assert totest.size() == howmany + 1 - 23;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "DotConstantHLAPI"})
		public void getSubterm_multisets_ContainsHLAPITest(){
			DotConstant llapi = new DotsFactoryImpl().createDotConstant();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new MultisetsFactoryImpl().createContains());
			
			llapi.getSubterm().add(
			   new DotsFactoryImpl().createDotConstant()
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
			
			howmany += 23;

			DotConstantHLAPI elem = new DotConstantHLAPI(llapi);
			List<fr.lip6.move.pnml.pthlpng.multisets.hlapi.ContainsHLAPI> totest = elem.getSubterm_multisets_ContainsHLAPI();

			assert totest.size() == howmany + 1 - 23;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "DotConstantHLAPI"})
		public void getSubterm_multisets_CardinalityOfHLAPITest(){
			DotConstant llapi = new DotsFactoryImpl().createDotConstant();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new MultisetsFactoryImpl().createCardinalityOf());
			
			llapi.getSubterm().add(
			   new DotsFactoryImpl().createDotConstant()
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
			
			howmany += 23;

			DotConstantHLAPI elem = new DotConstantHLAPI(llapi);
			List<fr.lip6.move.pnml.pthlpng.multisets.hlapi.CardinalityOfHLAPI> totest = elem.getSubterm_multisets_CardinalityOfHLAPI();

			assert totest.size() == howmany + 1 - 23;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "DotConstantHLAPI"})
		public void getSubterm_multisets_AddHLAPITest(){
			DotConstant llapi = new DotsFactoryImpl().createDotConstant();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new MultisetsFactoryImpl().createAdd());
			
			llapi.getSubterm().add(
			   new DotsFactoryImpl().createDotConstant()
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
			
			howmany += 23;

			DotConstantHLAPI elem = new DotConstantHLAPI(llapi);
			List<fr.lip6.move.pnml.pthlpng.multisets.hlapi.AddHLAPI> totest = elem.getSubterm_multisets_AddHLAPI();

			assert totest.size() == howmany + 1 - 23;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "DotConstantHLAPI"})
		public void getSubterm_multisets_AllHLAPITest(){
			DotConstant llapi = new DotsFactoryImpl().createDotConstant();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new MultisetsFactoryImpl().createAll());
			
			llapi.getSubterm().add(
			   new DotsFactoryImpl().createDotConstant()
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
			
			howmany += 23;

			DotConstantHLAPI elem = new DotConstantHLAPI(llapi);
			List<fr.lip6.move.pnml.pthlpng.multisets.hlapi.AllHLAPI> totest = elem.getSubterm_multisets_AllHLAPI();

			assert totest.size() == howmany + 1 - 23;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "DotConstantHLAPI"})
		public void getSubterm_multisets_EmptyHLAPITest(){
			DotConstant llapi = new DotsFactoryImpl().createDotConstant();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new MultisetsFactoryImpl().createEmpty());
			
			llapi.getSubterm().add(
			   new DotsFactoryImpl().createDotConstant()
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
			
			howmany += 23;

			DotConstantHLAPI elem = new DotConstantHLAPI(llapi);
			List<fr.lip6.move.pnml.pthlpng.multisets.hlapi.EmptyHLAPI> totest = elem.getSubterm_multisets_EmptyHLAPI();

			assert totest.size() == howmany + 1 - 23;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "DotConstantHLAPI"})
		public void getSubterm_multisets_NumberOfHLAPITest(){
			DotConstant llapi = new DotsFactoryImpl().createDotConstant();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new MultisetsFactoryImpl().createNumberOf());
			
			llapi.getSubterm().add(
			   new DotsFactoryImpl().createDotConstant()
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
			
			howmany += 23;

			DotConstantHLAPI elem = new DotConstantHLAPI(llapi);
			List<fr.lip6.move.pnml.pthlpng.multisets.hlapi.NumberOfHLAPI> totest = elem.getSubterm_multisets_NumberOfHLAPI();

			assert totest.size() == howmany + 1 - 23;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "DotConstantHLAPI"})
		public void getSubterm_multisets_SubtractHLAPITest(){
			DotConstant llapi = new DotsFactoryImpl().createDotConstant();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new MultisetsFactoryImpl().createSubtract());
			
			llapi.getSubterm().add(
			   new DotsFactoryImpl().createDotConstant()
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
			
			howmany += 23;

			DotConstantHLAPI elem = new DotConstantHLAPI(llapi);
			List<fr.lip6.move.pnml.pthlpng.multisets.hlapi.SubtractHLAPI> totest = elem.getSubterm_multisets_SubtractHLAPI();

			assert totest.size() == howmany + 1 - 23;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "DotConstantHLAPI"})
		public void getSubterm_multisets_ScalarProductHLAPITest(){
			DotConstant llapi = new DotsFactoryImpl().createDotConstant();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new MultisetsFactoryImpl().createScalarProduct());
			
			llapi.getSubterm().add(
			   new DotsFactoryImpl().createDotConstant()
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
			
			howmany += 23;

			DotConstantHLAPI elem = new DotConstantHLAPI(llapi);
			List<fr.lip6.move.pnml.pthlpng.multisets.hlapi.ScalarProductHLAPI> totest = elem.getSubterm_multisets_ScalarProductHLAPI();

			assert totest.size() == howmany + 1 - 23;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "DotConstantHLAPI"})
		public void getSubterm_partitions_GreaterThanHLAPITest(){
			DotConstant llapi = new DotsFactoryImpl().createDotConstant();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new PartitionsFactoryImpl().createGreaterThan());
			
			llapi.getSubterm().add(
			   new DotsFactoryImpl().createDotConstant()
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
			
			howmany += 23;

			DotConstantHLAPI elem = new DotConstantHLAPI(llapi);
			List<fr.lip6.move.pnml.pthlpng.partitions.hlapi.GreaterThanHLAPI> totest = elem.getSubterm_partitions_GreaterThanHLAPI();

			assert totest.size() == howmany + 1 - 23;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "DotConstantHLAPI"})
		public void getSubterm_partitions_PartitionElementOfHLAPITest(){
			DotConstant llapi = new DotsFactoryImpl().createDotConstant();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new PartitionsFactoryImpl().createPartitionElementOf());
			
			llapi.getSubterm().add(
			   new DotsFactoryImpl().createDotConstant()
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
			
			howmany += 23;

			DotConstantHLAPI elem = new DotConstantHLAPI(llapi);
			List<fr.lip6.move.pnml.pthlpng.partitions.hlapi.PartitionElementOfHLAPI> totest = elem.getSubterm_partitions_PartitionElementOfHLAPI();

			assert totest.size() == howmany + 1 - 23;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "DotConstantHLAPI"})
		public void getSubterm_partitions_LessThanHLAPITest(){
			DotConstant llapi = new DotsFactoryImpl().createDotConstant();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new PartitionsFactoryImpl().createLessThan());
			
			llapi.getSubterm().add(
			   new DotsFactoryImpl().createDotConstant()
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
			
			howmany += 23;

			DotConstantHLAPI elem = new DotConstantHLAPI(llapi);
			List<fr.lip6.move.pnml.pthlpng.partitions.hlapi.LessThanHLAPI> totest = elem.getSubterm_partitions_LessThanHLAPI();

			assert totest.size() == howmany + 1 - 23;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "DotConstantHLAPI"})
		public void getSubterm_terms_VariableHLAPITest(){
			DotConstant llapi = new DotsFactoryImpl().createDotConstant();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new TermsFactoryImpl().createVariable());
			
			llapi.getSubterm().add(
			   new DotsFactoryImpl().createDotConstant()
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
			
			howmany += 23;

			DotConstantHLAPI elem = new DotConstantHLAPI(llapi);
			List<fr.lip6.move.pnml.pthlpng.terms.hlapi.VariableHLAPI> totest = elem.getSubterm_terms_VariableHLAPI();

			assert totest.size() == howmany + 1 - 23;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "DotConstantHLAPI"})
		public void getSubterm_terms_TupleHLAPITest(){
			DotConstant llapi = new DotsFactoryImpl().createDotConstant();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new TermsFactoryImpl().createTuple());
			
			llapi.getSubterm().add(
			   new DotsFactoryImpl().createDotConstant()
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
			
			howmany += 23;

			DotConstantHLAPI elem = new DotConstantHLAPI(llapi);
			List<fr.lip6.move.pnml.pthlpng.terms.hlapi.TupleHLAPI> totest = elem.getSubterm_terms_TupleHLAPI();

			assert totest.size() == howmany + 1 - 23;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "DotConstantHLAPI"})
		public void getSubterm_terms_UserOperatorHLAPITest(){
			DotConstant llapi = new DotsFactoryImpl().createDotConstant();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getSubterm().add(new TermsFactoryImpl().createUserOperator());
			
			llapi.getSubterm().add(
			   new DotsFactoryImpl().createDotConstant()
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
			
			howmany += 23;

			DotConstantHLAPI elem = new DotConstantHLAPI(llapi);
			List<fr.lip6.move.pnml.pthlpng.terms.hlapi.UserOperatorHLAPI> totest = elem.getSubterm_terms_UserOperatorHLAPI();

			assert totest.size() == howmany + 1 - 23;

			for (TermHLAPI unit : totest) {
             assert llapi.getSubterm().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
	
	
	
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "DotConstantHLAPI"})
		public void getInput_dots_DotHLAPITest(){
			DotConstant llapi = new DotsFactoryImpl().createDotConstant();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getInput().add(new DotsFactoryImpl().createDot());
			
			llapi.getInput().add(
			   new DotsFactoryImpl().createDot()
			);
			
			llapi.getInput().add(
			   new BooleansFactoryImpl().createBool()
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
			
			howmany += 5;

			DotConstantHLAPI elem = new DotConstantHLAPI(llapi);
			List<fr.lip6.move.pnml.pthlpng.dots.hlapi.DotHLAPI> totest = elem.getInput_dots_DotHLAPI();

			assert totest.size() == howmany + 1 - 5;

			for (SortHLAPI unit : totest) {
             assert llapi.getInput().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "DotConstantHLAPI"})
		public void getInput_booleans_BoolHLAPITest(){
			DotConstant llapi = new DotsFactoryImpl().createDotConstant();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getInput().add(new BooleansFactoryImpl().createBool());
			
			llapi.getInput().add(
			   new DotsFactoryImpl().createDot()
			);
			
			llapi.getInput().add(
			   new BooleansFactoryImpl().createBool()
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
			
			howmany += 5;

			DotConstantHLAPI elem = new DotConstantHLAPI(llapi);
			List<fr.lip6.move.pnml.pthlpng.booleans.hlapi.BoolHLAPI> totest = elem.getInput_booleans_BoolHLAPI();

			assert totest.size() == howmany + 1 - 5;

			for (SortHLAPI unit : totest) {
             assert llapi.getInput().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "DotConstantHLAPI"})
		public void getInput_terms_MultisetSortHLAPITest(){
			DotConstant llapi = new DotsFactoryImpl().createDotConstant();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getInput().add(new TermsFactoryImpl().createMultisetSort());
			
			llapi.getInput().add(
			   new DotsFactoryImpl().createDot()
			);
			
			llapi.getInput().add(
			   new BooleansFactoryImpl().createBool()
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
			
			howmany += 5;

			DotConstantHLAPI elem = new DotConstantHLAPI(llapi);
			List<fr.lip6.move.pnml.pthlpng.terms.hlapi.MultisetSortHLAPI> totest = elem.getInput_terms_MultisetSortHLAPI();

			assert totest.size() == howmany + 1 - 5;

			for (SortHLAPI unit : totest) {
             assert llapi.getInput().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "DotConstantHLAPI"})
		public void getInput_terms_ProductSortHLAPITest(){
			DotConstant llapi = new DotsFactoryImpl().createDotConstant();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getInput().add(new TermsFactoryImpl().createProductSort());
			
			llapi.getInput().add(
			   new DotsFactoryImpl().createDot()
			);
			
			llapi.getInput().add(
			   new BooleansFactoryImpl().createBool()
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
			
			howmany += 5;

			DotConstantHLAPI elem = new DotConstantHLAPI(llapi);
			List<fr.lip6.move.pnml.pthlpng.terms.hlapi.ProductSortHLAPI> totest = elem.getInput_terms_ProductSortHLAPI();

			assert totest.size() == howmany + 1 - 5;

			for (SortHLAPI unit : totest) {
             assert llapi.getInput().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "DotConstantHLAPI"})
		public void getInput_terms_UserSortHLAPITest(){
			DotConstant llapi = new DotsFactoryImpl().createDotConstant();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getInput().add(new TermsFactoryImpl().createUserSort());
			
			llapi.getInput().add(
			   new DotsFactoryImpl().createDot()
			);
			
			llapi.getInput().add(
			   new BooleansFactoryImpl().createBool()
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
			
			howmany += 5;

			DotConstantHLAPI elem = new DotConstantHLAPI(llapi);
			List<fr.lip6.move.pnml.pthlpng.terms.hlapi.UserSortHLAPI> totest = elem.getInput_terms_UserSortHLAPI();

			assert totest.size() == howmany + 1 - 5;

			for (SortHLAPI unit : totest) {
             assert llapi.getInput().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
	
	

	//setters/remover for lists.
	
	@Test(groups = { "hlapi", "DotConstantHLAPI"})
	public void addSubtermHLAPITest(){
		DotConstantHLAPI elem = new DotConstantHLAPI(new DotsFactoryImpl().createDotConstant());
		int howmany = (int)(Math.random()*10);
		for(int i =0; i<howmany;i++)
			
			elem.addSubtermHLAPI(
				new DotConstantHLAPI(
					new DotsFactoryImpl().createDotConstant()
				)
			);
			

		assert elem.getContainedItem().getSubterm().size() == howmany;
	}

	@Test(groups = { "hlapi", "DotConstantHLAPI"})
	public void removeSubtermTest(){
		DotConstantHLAPI elem = new DotConstantHLAPI(new DotsFactoryImpl().createDotConstant());
		int howmany = (int)(Math.random()*10);
		int howdiff = (int)(Math.random()*10);

			
			DotConstantHLAPI sav;
			

		for(int i =0; i<(howmany);i++)
			
			elem.addSubtermHLAPI(
				new DotConstantHLAPI(
				  new DotsFactoryImpl().createDotConstant()
				)
			);
			


		
		sav =
			new DotConstantHLAPI(
			  new DotsFactoryImpl().createDotConstant()
			);
		

		elem.addSubtermHLAPI(sav);
		assert elem.getContainedItem().getSubterm().size() == howmany+1;

		for(int i =0; i<(howdiff);i++)
			
			elem.addSubtermHLAPI(
				new DotConstantHLAPI(
				  new DotsFactoryImpl().createDotConstant()
				)
			);
			


		elem.removeSubtermHLAPI(sav);

		assert elem.getContainedItem().getSubterm().size() == howmany+howdiff;
	}
	

	@Test(groups = { "hlapi", "DotConstantHLAPI"})
	public void equalsTest(){
		DotConstant a = new DotsFactoryImpl().createDotConstant();
		DotConstant b = new DotsFactoryImpl().createDotConstant();
		DotConstantHLAPI aprime = new DotConstantHLAPI(a);
		DotConstantHLAPI asecond = new DotConstantHLAPI(a);
		DotConstantHLAPI bprime = new DotConstantHLAPI(b);

		assert aprime.equals(asecond);
		assert !aprime.equals(bprime);
	}

	//cloning method
	//public DotConstantHLAPI clone(){
	//	return new DotConstantHLAPI(this);
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
