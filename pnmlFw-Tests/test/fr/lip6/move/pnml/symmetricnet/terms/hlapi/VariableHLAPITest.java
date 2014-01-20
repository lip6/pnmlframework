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
 * $Id ggiffo, Thu Jan 02 00:08:28 CET 2014$
 */
package fr.lip6.move.pnml.symmetricnet.terms.hlapi;

import fr.lip6.move.pnml.symmetricnet.booleans.And;
import fr.lip6.move.pnml.symmetricnet.booleans.Bool;
import fr.lip6.move.pnml.symmetricnet.booleans.BooleanConstant;
import fr.lip6.move.pnml.symmetricnet.booleans.Equality;
import fr.lip6.move.pnml.symmetricnet.booleans.Imply;
import fr.lip6.move.pnml.symmetricnet.booleans.Inequality;
import fr.lip6.move.pnml.symmetricnet.booleans.Not;
import fr.lip6.move.pnml.symmetricnet.booleans.Or;

import fr.lip6.move.pnml.symmetricnet.booleans.impl.BooleansFactoryImpl;

import fr.lip6.move.pnml.symmetricnet.cyclicEnumerations.CyclicEnumeration;
import fr.lip6.move.pnml.symmetricnet.cyclicEnumerations.Predecessor;
import fr.lip6.move.pnml.symmetricnet.cyclicEnumerations.Successor;

import fr.lip6.move.pnml.symmetricnet.cyclicEnumerations.impl.CyclicEnumerationsFactoryImpl;

import fr.lip6.move.pnml.symmetricnet.dots.Dot;
import fr.lip6.move.pnml.symmetricnet.dots.DotConstant;

import fr.lip6.move.pnml.symmetricnet.dots.impl.DotsFactoryImpl;

import fr.lip6.move.pnml.symmetricnet.finiteEnumerations.FEConstant;
import fr.lip6.move.pnml.symmetricnet.finiteEnumerations.FiniteEnumeration;

import fr.lip6.move.pnml.symmetricnet.finiteEnumerations.impl.FiniteEnumerationsFactoryImpl;

import fr.lip6.move.pnml.symmetricnet.finiteIntRanges.FiniteIntRange;
import fr.lip6.move.pnml.symmetricnet.finiteIntRanges.FiniteIntRangeConstant;
import fr.lip6.move.pnml.symmetricnet.finiteIntRanges.GreaterThan;
import fr.lip6.move.pnml.symmetricnet.finiteIntRanges.GreaterThanOrEqual;
import fr.lip6.move.pnml.symmetricnet.finiteIntRanges.LessThan;
import fr.lip6.move.pnml.symmetricnet.finiteIntRanges.LessThanOrEqual;

import fr.lip6.move.pnml.symmetricnet.finiteIntRanges.impl.FiniteIntRangesFactoryImpl;

import fr.lip6.move.pnml.symmetricnet.hlcorestructure.Annotation;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.AnnotationGraphics;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.AnyObject;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.Arc;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.ArcGraphics;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.CSS2Color;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.CSS2FontFamily;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.CSS2FontSize;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.CSS2FontStyle;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.CSS2FontWeight;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.Condition;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.Declaration;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.Dimension;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.Fill;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.Font;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.FontAlign;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.FontDecoration;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.Gradient;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.HLAnnotation;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.HLMarking;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.Label;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.Line;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.LineShape;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.LineStyle;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.Name;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.Node;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.NodeGraphics;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.Offset;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.PNType;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.Page;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.PetriNet;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.PetriNetDoc;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.Place;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.PlaceNode;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.PnObject;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.Position;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.RefPlace;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.RefTransition;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.ToolInfo;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.Transition;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.TransitionNode;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.Type;

import fr.lip6.move.pnml.symmetricnet.hlcorestructure.impl.HlcorestructureFactoryImpl;

import fr.lip6.move.pnml.symmetricnet.integers.Addition;
import fr.lip6.move.pnml.symmetricnet.integers.Division;
import fr.lip6.move.pnml.symmetricnet.integers.HLInteger;
import fr.lip6.move.pnml.symmetricnet.integers.HLPNNumber;
import fr.lip6.move.pnml.symmetricnet.integers.Modulo;
import fr.lip6.move.pnml.symmetricnet.integers.Multiplication;
import fr.lip6.move.pnml.symmetricnet.integers.Natural;
import fr.lip6.move.pnml.symmetricnet.integers.NumberConstant;
import fr.lip6.move.pnml.symmetricnet.integers.Positive;
import fr.lip6.move.pnml.symmetricnet.integers.Subtraction;

import fr.lip6.move.pnml.symmetricnet.integers.impl.IntegersFactoryImpl;

import fr.lip6.move.pnml.symmetricnet.multisets.Add;
import fr.lip6.move.pnml.symmetricnet.multisets.All;
import fr.lip6.move.pnml.symmetricnet.multisets.Cardinality;
import fr.lip6.move.pnml.symmetricnet.multisets.CardinalityOf;
import fr.lip6.move.pnml.symmetricnet.multisets.Contains;
import fr.lip6.move.pnml.symmetricnet.multisets.Empty;
import fr.lip6.move.pnml.symmetricnet.multisets.NumberOf;
import fr.lip6.move.pnml.symmetricnet.multisets.ScalarProduct;
import fr.lip6.move.pnml.symmetricnet.multisets.Subtract;

import fr.lip6.move.pnml.symmetricnet.multisets.impl.MultisetsFactoryImpl;

import fr.lip6.move.pnml.symmetricnet.partitions.Partition;
import fr.lip6.move.pnml.symmetricnet.partitions.PartitionElement;
import fr.lip6.move.pnml.symmetricnet.partitions.PartitionElementOf;

import fr.lip6.move.pnml.symmetricnet.partitions.impl.PartitionsFactoryImpl;

import fr.lip6.move.pnml.symmetricnet.terms.Declarations;
import fr.lip6.move.pnml.symmetricnet.terms.MultisetSort;
import fr.lip6.move.pnml.symmetricnet.terms.NamedOperator;
import fr.lip6.move.pnml.symmetricnet.terms.NamedSort;
import fr.lip6.move.pnml.symmetricnet.terms.Operator;
import fr.lip6.move.pnml.symmetricnet.terms.ProductSort;
import fr.lip6.move.pnml.symmetricnet.terms.Sort;
import fr.lip6.move.pnml.symmetricnet.terms.Term;
import fr.lip6.move.pnml.symmetricnet.terms.TermsDeclaration;
import fr.lip6.move.pnml.symmetricnet.terms.Variable;
import fr.lip6.move.pnml.symmetricnet.terms.VariableDecl;

import fr.lip6.move.pnml.symmetricnet.terms.impl.TermsFactoryImpl;

import java.math.BigDecimal;

import java.net.URI;

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
import fr.lip6.move.pnml.symmetricnet.terms.*;
import fr.lip6.move.pnml.symmetricnet.terms.impl.*;
import fr.lip6.move.pnml.framework.utils.exception.InnerBuildException;
import fr.lip6.move.pnml.framework.utils.exception.InvalidIDException;
import fr.lip6.move.pnml.framework.utils.exception.VoidRepositoryException;
import fr.lip6.move.pnml.framework.utils.IdRepository;
import fr.lip6.move.pnml.framework.utils.ModelRepository;
import org.testng.annotations.*;
public class VariableHLAPITest {

	
	private SortHLAPI itemsort;
		
	private VariableDeclHLAPI itemvariableDecl;
		
	
	private OperatorHLAPI itemcontainerOperator;
	
	private NamedOperatorHLAPI itemcontainerNamedOperator;
	
	private HLMarkingHLAPI itemcontainerHLMarking;
	
	private ConditionHLAPI itemcontainerCondition;
	
	private HLAnnotationHLAPI itemcontainerHLAnnotation;
	
	private PartitionElementHLAPI itemcontainerPartitionElement;
	


	@AfterTest(groups = { "VariableHLAPI", "hlapi" })
	public void After() {
	    System.out.println("done for "+"VariableHLAPI(terms)");
	}


	@BeforeMethod(groups = { "VariableHLAPI", "hlapi" })
	public void setup() throws Exception{
	//ModelRepository.reset(); ModelRepository.getInstance().createDocumentWorkspace("void");
	ModelRepository mr = ModelRepository.getInstance();
	mr.createDocumentWorkspace("void");
	
			
				
			itemsort = new fr.lip6.move.pnml.symmetricnet.terms.hlapi.MultisetSortHLAPI(
				new TermsFactoryImpl().createMultisetSort()
			);
				
			
		
			
			//TermsFactoryImpl
			itemvariableDecl = new VariableDeclHLAPI(new TermsFactoryImpl().createVariableDecl());
			
		

	
		
			
			
		itemcontainerOperator = new fr.lip6.move.pnml.symmetricnet.terms.hlapi.TupleHLAPI(
		   new TermsFactoryImpl().createTuple()
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
	@Test(groups = { "hlapi", "VariableHLAPI"}, dependsOnMethods={"VariableHLAPI_LLAPI"})
	public void VariableHLAPI_1(){//BEGIN CONSTRUCTOR BODY
   @SuppressWarnings("unused")
	VariableHLAPI totest = new VariableHLAPI(
		itemsort
		,	
		itemvariableDecl
	);
	
	
	
	assert totest.getSort().equals(itemsort.getContainedItem());
	
	
	
	
	assert totest.getVariableDecl().equals(itemvariableDecl.getContainedItem());
	
	
	}

	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "VariableHLAPI"}, dependsOnMethods={"VariableHLAPI_LLAPI"})
	public void VariableHLAPI_2_containerOperator(){//BEGIN CONSTRUCTOR BODY

	VariableHLAPI totest = new VariableHLAPI(
		itemsort
		,	
		itemvariableDecl
	,	
		itemcontainerOperator
	);
	
	
		
			assert totest.getSort().equals(itemsort.getContainedItem());
		
	
	
		
			assert totest.getVariableDecl().equals(itemvariableDecl.getContainedItem());
		
	
	assert totest.getContainerOperator().equals(itemcontainerOperator.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "VariableHLAPI"}, dependsOnMethods={"VariableHLAPI_LLAPI"})
	public void VariableHLAPI_2_containerNamedOperator(){//BEGIN CONSTRUCTOR BODY

	VariableHLAPI totest = new VariableHLAPI(
		itemsort
		,	
		itemvariableDecl
	,	
		itemcontainerNamedOperator
	);
	
	
		
			assert totest.getSort().equals(itemsort.getContainedItem());
		
	
	
		
			assert totest.getVariableDecl().equals(itemvariableDecl.getContainedItem());
		
	
	assert totest.getContainerNamedOperator().equals(itemcontainerNamedOperator.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "VariableHLAPI"}, dependsOnMethods={"VariableHLAPI_LLAPI"})
	public void VariableHLAPI_2_containerHLMarking(){//BEGIN CONSTRUCTOR BODY

	VariableHLAPI totest = new VariableHLAPI(
		itemsort
		,	
		itemvariableDecl
	,	
		itemcontainerHLMarking
	);
	
	
		
			assert totest.getSort().equals(itemsort.getContainedItem());
		
	
	
		
			assert totest.getVariableDecl().equals(itemvariableDecl.getContainedItem());
		
	
	assert totest.getContainerHLMarking().equals(itemcontainerHLMarking.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "VariableHLAPI"}, dependsOnMethods={"VariableHLAPI_LLAPI"})
	public void VariableHLAPI_2_containerCondition(){//BEGIN CONSTRUCTOR BODY

	VariableHLAPI totest = new VariableHLAPI(
		itemsort
		,	
		itemvariableDecl
	,	
		itemcontainerCondition
	);
	
	
		
			assert totest.getSort().equals(itemsort.getContainedItem());
		
	
	
		
			assert totest.getVariableDecl().equals(itemvariableDecl.getContainedItem());
		
	
	assert totest.getContainerCondition().equals(itemcontainerCondition.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "VariableHLAPI"}, dependsOnMethods={"VariableHLAPI_LLAPI"})
	public void VariableHLAPI_2_containerHLAnnotation(){//BEGIN CONSTRUCTOR BODY

	VariableHLAPI totest = new VariableHLAPI(
		itemsort
		,	
		itemvariableDecl
	,	
		itemcontainerHLAnnotation
	);
	
	
		
			assert totest.getSort().equals(itemsort.getContainedItem());
		
	
	
		
			assert totest.getVariableDecl().equals(itemvariableDecl.getContainedItem());
		
	
	assert totest.getContainerHLAnnotation().equals(itemcontainerHLAnnotation.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "VariableHLAPI"}, dependsOnMethods={"VariableHLAPI_LLAPI"})
	public void VariableHLAPI_2_containerPartitionElement(){//BEGIN CONSTRUCTOR BODY

	VariableHLAPI totest = new VariableHLAPI(
		itemsort
		,	
		itemvariableDecl
	,	
		itemcontainerPartitionElement
	);
	
	
		
			assert totest.getSort().equals(itemsort.getContainedItem());
		
	
	
		
			assert totest.getVariableDecl().equals(itemvariableDecl.getContainedItem());
		
	
	assert totest.getContainerPartitionElement().equals(itemcontainerPartitionElement.getContainedItem());
	}

	/**
    * This constructor give access to required stuff only (not container if any)
    */
   @Test(groups = { "hlapi", "VariableHLAPI"}, dependsOnMethods={"VariableHLAPI_LLAPI"})
	public void VariableHLAPI_3(){//BEGIN CONSTRUCTOR BODY

	VariableHLAPI totest = new VariableHLAPI(
		itemvariableDecl
	);

	
	
		
			assert totest.getVariableDecl().equals(itemvariableDecl.getContainedItem());
		
	
	}

	/**
    * This constructor give access to required stuff only (and container)
    */
   @Test(groups = { "hlapi", "VariableHLAPI"}, dependsOnMethods={"VariableHLAPI_LLAPI"})
	public void VariableHLAPI_4_containerOperator(){//BEGIN CONSTRUCTOR BODY

	VariableHLAPI totest = new VariableHLAPI(
		itemvariableDecl
	,	
	  itemcontainerOperator
	);

	
	
		
			assert totest.getVariableDecl().equals(itemvariableDecl.getContainedItem());
		
	
	assert totest.getContainerOperator().equals(itemcontainerOperator.getContainedItem());
	}
	/**
    * This constructor give access to required stuff only (and container)
    */
   @Test(groups = { "hlapi", "VariableHLAPI"}, dependsOnMethods={"VariableHLAPI_LLAPI"})
	public void VariableHLAPI_4_containerNamedOperator(){//BEGIN CONSTRUCTOR BODY

	VariableHLAPI totest = new VariableHLAPI(
		itemvariableDecl
	,	
	  itemcontainerNamedOperator
	);

	
	
		
			assert totest.getVariableDecl().equals(itemvariableDecl.getContainedItem());
		
	
	assert totest.getContainerNamedOperator().equals(itemcontainerNamedOperator.getContainedItem());
	}
	/**
    * This constructor give access to required stuff only (and container)
    */
   @Test(groups = { "hlapi", "VariableHLAPI"}, dependsOnMethods={"VariableHLAPI_LLAPI"})
	public void VariableHLAPI_4_containerHLMarking(){//BEGIN CONSTRUCTOR BODY

	VariableHLAPI totest = new VariableHLAPI(
		itemvariableDecl
	,	
	  itemcontainerHLMarking
	);

	
	
		
			assert totest.getVariableDecl().equals(itemvariableDecl.getContainedItem());
		
	
	assert totest.getContainerHLMarking().equals(itemcontainerHLMarking.getContainedItem());
	}
	/**
    * This constructor give access to required stuff only (and container)
    */
   @Test(groups = { "hlapi", "VariableHLAPI"}, dependsOnMethods={"VariableHLAPI_LLAPI"})
	public void VariableHLAPI_4_containerCondition(){//BEGIN CONSTRUCTOR BODY

	VariableHLAPI totest = new VariableHLAPI(
		itemvariableDecl
	,	
	  itemcontainerCondition
	);

	
	
		
			assert totest.getVariableDecl().equals(itemvariableDecl.getContainedItem());
		
	
	assert totest.getContainerCondition().equals(itemcontainerCondition.getContainedItem());
	}
	/**
    * This constructor give access to required stuff only (and container)
    */
   @Test(groups = { "hlapi", "VariableHLAPI"}, dependsOnMethods={"VariableHLAPI_LLAPI"})
	public void VariableHLAPI_4_containerHLAnnotation(){//BEGIN CONSTRUCTOR BODY

	VariableHLAPI totest = new VariableHLAPI(
		itemvariableDecl
	,	
	  itemcontainerHLAnnotation
	);

	
	
		
			assert totest.getVariableDecl().equals(itemvariableDecl.getContainedItem());
		
	
	assert totest.getContainerHLAnnotation().equals(itemcontainerHLAnnotation.getContainedItem());
	}
	/**
    * This constructor give access to required stuff only (and container)
    */
   @Test(groups = { "hlapi", "VariableHLAPI"}, dependsOnMethods={"VariableHLAPI_LLAPI"})
	public void VariableHLAPI_4_containerPartitionElement(){//BEGIN CONSTRUCTOR BODY

	VariableHLAPI totest = new VariableHLAPI(
		itemvariableDecl
	,	
	  itemcontainerPartitionElement
	);

	
	
		
			assert totest.getVariableDecl().equals(itemvariableDecl.getContainedItem());
		
	
	assert totest.getContainerPartitionElement().equals(itemcontainerPartitionElement.getContainedItem());
	}


	/**
	 * This constructor encapsulate a low level API object in HLAPI.
	 */
	@Test(groups = { "hlapi", "VariableHLAPI"})
	public void VariableHLAPI_LLAPI(){
	   Variable llapi = new TermsFactoryImpl().createVariable();
	   fr.lip6.move.pnml.symmetricnet.terms.hlapi.VariableHLAPI hlapi = new VariableHLAPI(llapi);
		assert hlapi.getContainedItem().equals(llapi);
	}

	//getters giving HLAPI object
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "VariableHLAPI"})
		public void getSortHLAPITest(){
			VariableHLAPI elem = new VariableHLAPI(new TermsFactoryImpl().createVariable());

			
				elem.setSortHLAPI(new fr.lip6.move.pnml.symmetricnet.terms.hlapi.MultisetSortHLAPI(new TermsFactoryImpl().createMultisetSort()));
				SortHLAPI totest_terms_MultisetSort = elem.getSortHLAPI();
				assert totest_terms_MultisetSort.getContainedItem().equals(elem.getSort());
			
				elem.setSortHLAPI(new fr.lip6.move.pnml.symmetricnet.terms.hlapi.ProductSortHLAPI(new TermsFactoryImpl().createProductSort()));
				SortHLAPI totest_terms_ProductSort = elem.getSortHLAPI();
				assert totest_terms_ProductSort.getContainedItem().equals(elem.getSort());
			
				elem.setSortHLAPI(new fr.lip6.move.pnml.symmetricnet.terms.hlapi.UserSortHLAPI(new TermsFactoryImpl().createUserSort()));
				SortHLAPI totest_terms_UserSort = elem.getSortHLAPI();
				assert totest_terms_UserSort.getContainedItem().equals(elem.getSort());
			
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
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "VariableHLAPI"})
		public void getContainerOperatorHLAPITest(){
			VariableHLAPI elem = new VariableHLAPI(new TermsFactoryImpl().createVariable());

			
				elem.setContainerOperatorHLAPI(new fr.lip6.move.pnml.symmetricnet.terms.hlapi.TupleHLAPI(new TermsFactoryImpl().createTuple()));
				OperatorHLAPI totest_terms_Tuple = elem.getContainerOperatorHLAPI();
				assert totest_terms_Tuple.getContainedItem().equals(elem.getContainerOperator());
			
				elem.setContainerOperatorHLAPI(new fr.lip6.move.pnml.symmetricnet.terms.hlapi.UserOperatorHLAPI(new TermsFactoryImpl().createUserOperator()));
				OperatorHLAPI totest_terms_UserOperator = elem.getContainerOperatorHLAPI();
				assert totest_terms_UserOperator.getContainedItem().equals(elem.getContainerOperator());
			
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
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "VariableHLAPI"})
		public void getContainerNamedOperatorHLAPITest(){
			VariableHLAPI elem = new VariableHLAPI(new TermsFactoryImpl().createVariable());

			
				elem.setContainerNamedOperatorHLAPI(itemcontainerNamedOperator);
				NamedOperatorHLAPI totest = elem.getContainerNamedOperatorHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerNamedOperator());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "VariableHLAPI"})
		public void getContainerHLMarkingHLAPITest(){
			VariableHLAPI elem = new VariableHLAPI(new TermsFactoryImpl().createVariable());

			
				elem.setContainerHLMarkingHLAPI(itemcontainerHLMarking);
				HLMarkingHLAPI totest = elem.getContainerHLMarkingHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerHLMarking());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "VariableHLAPI"})
		public void getContainerConditionHLAPITest(){
			VariableHLAPI elem = new VariableHLAPI(new TermsFactoryImpl().createVariable());

			
				elem.setContainerConditionHLAPI(itemcontainerCondition);
				ConditionHLAPI totest = elem.getContainerConditionHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerCondition());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "VariableHLAPI"})
		public void getContainerHLAnnotationHLAPITest(){
			VariableHLAPI elem = new VariableHLAPI(new TermsFactoryImpl().createVariable());

			
				elem.setContainerHLAnnotationHLAPI(itemcontainerHLAnnotation);
				HLAnnotationHLAPI totest = elem.getContainerHLAnnotationHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerHLAnnotation());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "VariableHLAPI"})
		public void getContainerPartitionElementHLAPITest(){
			VariableHLAPI elem = new VariableHLAPI(new TermsFactoryImpl().createVariable());

			
				elem.setContainerPartitionElementHLAPI(itemcontainerPartitionElement);
				PartitionElementHLAPI totest = elem.getContainerPartitionElementHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerPartitionElement());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "VariableHLAPI"})
		public void getVariableDeclHLAPITest(){
			VariableHLAPI elem = new VariableHLAPI(new TermsFactoryImpl().createVariable());

			
				elem.setVariableDeclHLAPI(itemvariableDecl);
				VariableDeclHLAPI totest = elem.getVariableDeclHLAPI();
				assert totest.getContainedItem().equals(elem.getVariableDecl());
			
		}
	

	//Special getter for list of generics object, return only one object type.
	
	
	
	
	
	
	
	
	

	//setters/remover for lists.
	

	@Test(groups = { "hlapi", "VariableHLAPI"})
	public void equalsTest(){
		Variable a = new TermsFactoryImpl().createVariable();
		Variable b = new TermsFactoryImpl().createVariable();
		VariableHLAPI aprime = new VariableHLAPI(a);
		VariableHLAPI asecond = new VariableHLAPI(a);
		VariableHLAPI bprime = new VariableHLAPI(b);

		assert aprime.equals(asecond);
		assert !aprime.equals(bprime);
	}

	//cloning method
	//public VariableHLAPI clone(){
	//	return new VariableHLAPI(this);
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
