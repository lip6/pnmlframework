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
 * $Id ggiffo, Wed Feb 10 14:59:14 CET 2016$
 */
package fr.lip6.move.pnml.hlpn.terms.hlapi;

import fr.lip6.move.pnml.hlpn.arbitrarydeclarations.AnySort;
import fr.lip6.move.pnml.hlpn.arbitrarydeclarations.ArbitraryOperator;
import fr.lip6.move.pnml.hlpn.arbitrarydeclarations.ArbitrarySort;
import fr.lip6.move.pnml.hlpn.arbitrarydeclarations.Unparsed;

import fr.lip6.move.pnml.hlpn.arbitrarydeclarations.impl.ArbitrarydeclarationsFactoryImpl;

import fr.lip6.move.pnml.hlpn.booleans.And;
import fr.lip6.move.pnml.hlpn.booleans.Bool;
import fr.lip6.move.pnml.hlpn.booleans.BooleanConstant;
import fr.lip6.move.pnml.hlpn.booleans.Equality;
import fr.lip6.move.pnml.hlpn.booleans.Imply;
import fr.lip6.move.pnml.hlpn.booleans.Inequality;
import fr.lip6.move.pnml.hlpn.booleans.Not;
import fr.lip6.move.pnml.hlpn.booleans.Or;

import fr.lip6.move.pnml.hlpn.booleans.impl.BooleansFactoryImpl;

import fr.lip6.move.pnml.hlpn.cyclicEnumerations.CyclicEnumeration;
import fr.lip6.move.pnml.hlpn.cyclicEnumerations.Predecessor;
import fr.lip6.move.pnml.hlpn.cyclicEnumerations.Successor;

import fr.lip6.move.pnml.hlpn.cyclicEnumerations.impl.CyclicEnumerationsFactoryImpl;

import fr.lip6.move.pnml.hlpn.dots.Dot;
import fr.lip6.move.pnml.hlpn.dots.DotConstant;

import fr.lip6.move.pnml.hlpn.dots.impl.DotsFactoryImpl;

import fr.lip6.move.pnml.hlpn.finiteEnumerations.FEConstant;
import fr.lip6.move.pnml.hlpn.finiteEnumerations.FiniteEnumeration;

import fr.lip6.move.pnml.hlpn.finiteEnumerations.impl.FiniteEnumerationsFactoryImpl;

import fr.lip6.move.pnml.hlpn.finiteIntRanges.FiniteIntRange;
import fr.lip6.move.pnml.hlpn.finiteIntRanges.FiniteIntRangeConstant;
import fr.lip6.move.pnml.hlpn.finiteIntRanges.GreaterThan;
import fr.lip6.move.pnml.hlpn.finiteIntRanges.GreaterThanOrEqual;
import fr.lip6.move.pnml.hlpn.finiteIntRanges.LessThan;
import fr.lip6.move.pnml.hlpn.finiteIntRanges.LessThanOrEqual;

import fr.lip6.move.pnml.hlpn.finiteIntRanges.impl.FiniteIntRangesFactoryImpl;

import fr.lip6.move.pnml.hlpn.hlcorestructure.Annotation;
import fr.lip6.move.pnml.hlpn.hlcorestructure.AnnotationGraphics;
import fr.lip6.move.pnml.hlpn.hlcorestructure.AnyObject;
import fr.lip6.move.pnml.hlpn.hlcorestructure.Arc;
import fr.lip6.move.pnml.hlpn.hlcorestructure.ArcGraphics;
import fr.lip6.move.pnml.hlpn.hlcorestructure.CSS2Color;
import fr.lip6.move.pnml.hlpn.hlcorestructure.CSS2FontFamily;
import fr.lip6.move.pnml.hlpn.hlcorestructure.CSS2FontSize;
import fr.lip6.move.pnml.hlpn.hlcorestructure.CSS2FontStyle;
import fr.lip6.move.pnml.hlpn.hlcorestructure.CSS2FontWeight;
import fr.lip6.move.pnml.hlpn.hlcorestructure.Condition;
import fr.lip6.move.pnml.hlpn.hlcorestructure.Declaration;
import fr.lip6.move.pnml.hlpn.hlcorestructure.Dimension;
import fr.lip6.move.pnml.hlpn.hlcorestructure.Fill;
import fr.lip6.move.pnml.hlpn.hlcorestructure.Font;
import fr.lip6.move.pnml.hlpn.hlcorestructure.FontAlign;
import fr.lip6.move.pnml.hlpn.hlcorestructure.FontDecoration;
import fr.lip6.move.pnml.hlpn.hlcorestructure.Gradient;
import fr.lip6.move.pnml.hlpn.hlcorestructure.HLAnnotation;
import fr.lip6.move.pnml.hlpn.hlcorestructure.HLMarking;
import fr.lip6.move.pnml.hlpn.hlcorestructure.Label;
import fr.lip6.move.pnml.hlpn.hlcorestructure.Line;
import fr.lip6.move.pnml.hlpn.hlcorestructure.LineShape;
import fr.lip6.move.pnml.hlpn.hlcorestructure.LineStyle;
import fr.lip6.move.pnml.hlpn.hlcorestructure.Name;
import fr.lip6.move.pnml.hlpn.hlcorestructure.Node;
import fr.lip6.move.pnml.hlpn.hlcorestructure.NodeGraphics;
import fr.lip6.move.pnml.hlpn.hlcorestructure.Offset;
import fr.lip6.move.pnml.hlpn.hlcorestructure.PNType;
import fr.lip6.move.pnml.hlpn.hlcorestructure.Page;
import fr.lip6.move.pnml.hlpn.hlcorestructure.PetriNet;
import fr.lip6.move.pnml.hlpn.hlcorestructure.PetriNetDoc;
import fr.lip6.move.pnml.hlpn.hlcorestructure.Place;
import fr.lip6.move.pnml.hlpn.hlcorestructure.PlaceNode;
import fr.lip6.move.pnml.hlpn.hlcorestructure.PnObject;
import fr.lip6.move.pnml.hlpn.hlcorestructure.Position;
import fr.lip6.move.pnml.hlpn.hlcorestructure.RefPlace;
import fr.lip6.move.pnml.hlpn.hlcorestructure.RefTransition;
import fr.lip6.move.pnml.hlpn.hlcorestructure.ToolInfo;
import fr.lip6.move.pnml.hlpn.hlcorestructure.Transition;
import fr.lip6.move.pnml.hlpn.hlcorestructure.TransitionNode;
import fr.lip6.move.pnml.hlpn.hlcorestructure.Type;

import fr.lip6.move.pnml.hlpn.hlcorestructure.impl.HlcorestructureFactoryImpl;

import fr.lip6.move.pnml.hlpn.integers.Addition;
import fr.lip6.move.pnml.hlpn.integers.Division;
import fr.lip6.move.pnml.hlpn.integers.HLInteger;
import fr.lip6.move.pnml.hlpn.integers.HLPNNumber;
import fr.lip6.move.pnml.hlpn.integers.Modulo;
import fr.lip6.move.pnml.hlpn.integers.Multiplication;
import fr.lip6.move.pnml.hlpn.integers.Natural;
import fr.lip6.move.pnml.hlpn.integers.NumberConstant;
import fr.lip6.move.pnml.hlpn.integers.Positive;
import fr.lip6.move.pnml.hlpn.integers.Subtraction;

import fr.lip6.move.pnml.hlpn.integers.impl.IntegersFactoryImpl;

import fr.lip6.move.pnml.hlpn.lists.Append;
import fr.lip6.move.pnml.hlpn.lists.Concatenation;
import fr.lip6.move.pnml.hlpn.lists.EmptyList;
import fr.lip6.move.pnml.hlpn.lists.HLPNList;
import fr.lip6.move.pnml.hlpn.lists.Length;
import fr.lip6.move.pnml.hlpn.lists.MakeList;
import fr.lip6.move.pnml.hlpn.lists.MemberAtIndex;
import fr.lip6.move.pnml.hlpn.lists.Sublist;

import fr.lip6.move.pnml.hlpn.lists.impl.ListsFactoryImpl;

import fr.lip6.move.pnml.hlpn.multisets.Add;
import fr.lip6.move.pnml.hlpn.multisets.All;
import fr.lip6.move.pnml.hlpn.multisets.Cardinality;
import fr.lip6.move.pnml.hlpn.multisets.CardinalityOf;
import fr.lip6.move.pnml.hlpn.multisets.Contains;
import fr.lip6.move.pnml.hlpn.multisets.Empty;
import fr.lip6.move.pnml.hlpn.multisets.NumberOf;
import fr.lip6.move.pnml.hlpn.multisets.ScalarProduct;
import fr.lip6.move.pnml.hlpn.multisets.Subtract;

import fr.lip6.move.pnml.hlpn.multisets.impl.MultisetsFactoryImpl;

import fr.lip6.move.pnml.hlpn.partitions.Partition;
import fr.lip6.move.pnml.hlpn.partitions.PartitionElement;
import fr.lip6.move.pnml.hlpn.partitions.PartitionElementOf;

import fr.lip6.move.pnml.hlpn.partitions.impl.PartitionsFactoryImpl;

import fr.lip6.move.pnml.hlpn.strings.HLPNString;
import fr.lip6.move.pnml.hlpn.strings.StringConstant;
import fr.lip6.move.pnml.hlpn.strings.Substring;

import fr.lip6.move.pnml.hlpn.strings.impl.StringsFactoryImpl;

import fr.lip6.move.pnml.hlpn.terms.Declarations;
import fr.lip6.move.pnml.hlpn.terms.MultisetSort;
import fr.lip6.move.pnml.hlpn.terms.NamedOperator;
import fr.lip6.move.pnml.hlpn.terms.NamedSort;
import fr.lip6.move.pnml.hlpn.terms.Operator;
import fr.lip6.move.pnml.hlpn.terms.ProductSort;
import fr.lip6.move.pnml.hlpn.terms.Sort;
import fr.lip6.move.pnml.hlpn.terms.Term;
import fr.lip6.move.pnml.hlpn.terms.TermsDeclaration;
import fr.lip6.move.pnml.hlpn.terms.VariableDecl;

import fr.lip6.move.pnml.hlpn.terms.impl.TermsFactoryImpl;

import java.math.BigDecimal;

import java.net.URI;

import java.util.List;

import  fr.lip6.move.pnml.framework.hlapi.*;
import fr.lip6.move.pnml.hlpn.arbitrarydeclarations.hlapi.*;
import fr.lip6.move.pnml.hlpn.booleans.hlapi.*;
import fr.lip6.move.pnml.hlpn.cyclicEnumerations.hlapi.*;
import fr.lip6.move.pnml.hlpn.dots.hlapi.*;
import fr.lip6.move.pnml.hlpn.finiteEnumerations.hlapi.*;
import fr.lip6.move.pnml.hlpn.finiteIntRanges.hlapi.*;
import fr.lip6.move.pnml.hlpn.hlcorestructure.hlapi.*;
import fr.lip6.move.pnml.hlpn.integers.hlapi.*;
import fr.lip6.move.pnml.hlpn.lists.hlapi.*;
import fr.lip6.move.pnml.hlpn.multisets.hlapi.*;
import fr.lip6.move.pnml.hlpn.partitions.hlapi.*;
import fr.lip6.move.pnml.hlpn.strings.hlapi.*;
import fr.lip6.move.pnml.hlpn.terms.hlapi.*;

import java.util.ArrayList;
import java.util.List;
import org.apache.axiom.om.*;
import fr.lip6.move.pnml.framework.utils.IdRefLinker;
import org.eclipse.emf.common.util.DiagnosticChain;
import fr.lip6.move.pnml.hlpn.terms.*;
import fr.lip6.move.pnml.hlpn.terms.impl.*;
import fr.lip6.move.pnml.framework.utils.exception.InnerBuildException;
import fr.lip6.move.pnml.framework.utils.exception.InvalidIDException;
import fr.lip6.move.pnml.framework.utils.exception.VoidRepositoryException;
import fr.lip6.move.pnml.framework.utils.IdRepository;
import fr.lip6.move.pnml.framework.utils.ModelRepository;
import org.testng.annotations.*;
public class MultisetSortHLAPITest {

	
	private SortHLAPI itembasis;
		
	
	private MultisetSortHLAPI itemmulti;
	
	private NamedSortHLAPI itemcontainerNamedSort;
	
	private VariableDeclHLAPI itemcontainerVariableDecl;
	
	private ProductSortHLAPI itemcontainerProductSort;
	
	private TypeHLAPI itemcontainerType;
	
	private AllHLAPI itemcontainerAll;
	
	private EmptyHLAPI itemcontainerEmpty;
	
	private PartitionHLAPI itemcontainerPartition;
	
	private HLPNListHLAPI itemcontainerList;
	
	private EmptyListHLAPI itemcontainerEmptyList;
	
	private MakeListHLAPI itemcontainerMakeList;
	


	@AfterTest(groups = { "MultisetSortHLAPI", "hlapi" })
	public void After() {
	    System.out.println("done for "+"MultisetSortHLAPI(terms)");
	}


	@BeforeMethod(groups = { "MultisetSortHLAPI", "hlapi" })
	public void setup() throws Exception{
	//ModelRepository.reset(); ModelRepository.getInstance().createDocumentWorkspace("void");
	ModelRepository mr = ModelRepository.getInstance();
	mr.createDocumentWorkspace("void");
	
			
				
			itembasis = new fr.lip6.move.pnml.hlpn.terms.hlapi.MultisetSortHLAPI(
				new TermsFactoryImpl().createMultisetSort()
			);
				
			
		

	
		
		itemmulti = new MultisetSortHLAPI(new TermsFactoryImpl().createMultisetSort());
		
	
		
		itemcontainerNamedSort = new NamedSortHLAPI(new TermsFactoryImpl().createNamedSort());
		
	
		
		itemcontainerVariableDecl = new VariableDeclHLAPI(new TermsFactoryImpl().createVariableDecl());
		
	
		
		itemcontainerProductSort = new ProductSortHLAPI(new TermsFactoryImpl().createProductSort());
		
	
		
		itemcontainerType = new TypeHLAPI(new HlcorestructureFactoryImpl().createType());
		
	
		
		itemcontainerAll = new AllHLAPI(new MultisetsFactoryImpl().createAll());
		
	
		
		itemcontainerEmpty = new EmptyHLAPI(new MultisetsFactoryImpl().createEmpty());
		
	
		
		itemcontainerPartition = new PartitionHLAPI(new PartitionsFactoryImpl().createPartition());
		
	
		
		itemcontainerList = new HLPNListHLAPI(new ListsFactoryImpl().createHLPNList());
		
	
		
		itemcontainerEmptyList = new EmptyListHLAPI(new ListsFactoryImpl().createEmptyList());
		
	
		
		itemcontainerMakeList = new MakeListHLAPI(new ListsFactoryImpl().createMakeList());
		
	
	}

	/**
	 * this constructor allows you to set all 'settable' values
	 * excepted container.
	 */
	@Test(groups = { "hlapi", "MultisetSortHLAPI"}, dependsOnMethods={"MultisetSortHLAPI_LLAPI"})
	public void MultisetSortHLAPI_1(){//BEGIN CONSTRUCTOR BODY
   @SuppressWarnings("unused")
	MultisetSortHLAPI totest = new MultisetSortHLAPI(
		itembasis
	);
	
	
	
	assert totest.getBasis().equals(itembasis.getContainedItem());
	
	
	}

	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "MultisetSortHLAPI"}, dependsOnMethods={"MultisetSortHLAPI_LLAPI"})
	public void MultisetSortHLAPI_2_multi(){//BEGIN CONSTRUCTOR BODY

	MultisetSortHLAPI totest = new MultisetSortHLAPI(
		itembasis
	,	
		itemmulti
	);
	
	
		
			assert totest.getBasis().equals(itembasis.getContainedItem());
		
	
	assert totest.getMulti().equals(itemmulti.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "MultisetSortHLAPI"}, dependsOnMethods={"MultisetSortHLAPI_LLAPI"})
	public void MultisetSortHLAPI_2_containerNamedSort(){//BEGIN CONSTRUCTOR BODY

	MultisetSortHLAPI totest = new MultisetSortHLAPI(
		itembasis
	,	
		itemcontainerNamedSort
	);
	
	
		
			assert totest.getBasis().equals(itembasis.getContainedItem());
		
	
	assert totest.getContainerNamedSort().equals(itemcontainerNamedSort.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "MultisetSortHLAPI"}, dependsOnMethods={"MultisetSortHLAPI_LLAPI"})
	public void MultisetSortHLAPI_2_containerVariableDecl(){//BEGIN CONSTRUCTOR BODY

	MultisetSortHLAPI totest = new MultisetSortHLAPI(
		itembasis
	,	
		itemcontainerVariableDecl
	);
	
	
		
			assert totest.getBasis().equals(itembasis.getContainedItem());
		
	
	assert totest.getContainerVariableDecl().equals(itemcontainerVariableDecl.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "MultisetSortHLAPI"}, dependsOnMethods={"MultisetSortHLAPI_LLAPI"})
	public void MultisetSortHLAPI_2_containerProductSort(){//BEGIN CONSTRUCTOR BODY

	MultisetSortHLAPI totest = new MultisetSortHLAPI(
		itembasis
	,	
		itemcontainerProductSort
	);
	
	
		
			assert totest.getBasis().equals(itembasis.getContainedItem());
		
	
	assert totest.getContainerProductSort().equals(itemcontainerProductSort.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "MultisetSortHLAPI"}, dependsOnMethods={"MultisetSortHLAPI_LLAPI"})
	public void MultisetSortHLAPI_2_containerType(){//BEGIN CONSTRUCTOR BODY

	MultisetSortHLAPI totest = new MultisetSortHLAPI(
		itembasis
	,	
		itemcontainerType
	);
	
	
		
			assert totest.getBasis().equals(itembasis.getContainedItem());
		
	
	assert totest.getContainerType().equals(itemcontainerType.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "MultisetSortHLAPI"}, dependsOnMethods={"MultisetSortHLAPI_LLAPI"})
	public void MultisetSortHLAPI_2_containerAll(){//BEGIN CONSTRUCTOR BODY

	MultisetSortHLAPI totest = new MultisetSortHLAPI(
		itembasis
	,	
		itemcontainerAll
	);
	
	
		
			assert totest.getBasis().equals(itembasis.getContainedItem());
		
	
	assert totest.getContainerAll().equals(itemcontainerAll.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "MultisetSortHLAPI"}, dependsOnMethods={"MultisetSortHLAPI_LLAPI"})
	public void MultisetSortHLAPI_2_containerEmpty(){//BEGIN CONSTRUCTOR BODY

	MultisetSortHLAPI totest = new MultisetSortHLAPI(
		itembasis
	,	
		itemcontainerEmpty
	);
	
	
		
			assert totest.getBasis().equals(itembasis.getContainedItem());
		
	
	assert totest.getContainerEmpty().equals(itemcontainerEmpty.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "MultisetSortHLAPI"}, dependsOnMethods={"MultisetSortHLAPI_LLAPI"})
	public void MultisetSortHLAPI_2_containerPartition(){//BEGIN CONSTRUCTOR BODY

	MultisetSortHLAPI totest = new MultisetSortHLAPI(
		itembasis
	,	
		itemcontainerPartition
	);
	
	
		
			assert totest.getBasis().equals(itembasis.getContainedItem());
		
	
	assert totest.getContainerPartition().equals(itemcontainerPartition.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "MultisetSortHLAPI"}, dependsOnMethods={"MultisetSortHLAPI_LLAPI"})
	public void MultisetSortHLAPI_2_containerList(){//BEGIN CONSTRUCTOR BODY

	MultisetSortHLAPI totest = new MultisetSortHLAPI(
		itembasis
	,	
		itemcontainerList
	);
	
	
		
			assert totest.getBasis().equals(itembasis.getContainedItem());
		
	
	assert totest.getContainerList().equals(itemcontainerList.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "MultisetSortHLAPI"}, dependsOnMethods={"MultisetSortHLAPI_LLAPI"})
	public void MultisetSortHLAPI_2_containerEmptyList(){//BEGIN CONSTRUCTOR BODY

	MultisetSortHLAPI totest = new MultisetSortHLAPI(
		itembasis
	,	
		itemcontainerEmptyList
	);
	
	
		
			assert totest.getBasis().equals(itembasis.getContainedItem());
		
	
	assert totest.getContainerEmptyList().equals(itemcontainerEmptyList.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "MultisetSortHLAPI"}, dependsOnMethods={"MultisetSortHLAPI_LLAPI"})
	public void MultisetSortHLAPI_2_containerMakeList(){//BEGIN CONSTRUCTOR BODY

	MultisetSortHLAPI totest = new MultisetSortHLAPI(
		itembasis
	,	
		itemcontainerMakeList
	);
	
	
		
			assert totest.getBasis().equals(itembasis.getContainedItem());
		
	
	assert totest.getContainerMakeList().equals(itemcontainerMakeList.getContainedItem());
	}

	/**
    * This constructor give access to required stuff only (not container if any)
    */



	/**
	 * This constructor encapsulate a low level API object in HLAPI.
	 */
	@Test(groups = { "hlapi", "MultisetSortHLAPI"})
	public void MultisetSortHLAPI_LLAPI(){
	   MultisetSort llapi = new TermsFactoryImpl().createMultisetSort();
	   fr.lip6.move.pnml.hlpn.terms.hlapi.MultisetSortHLAPI hlapi = new MultisetSortHLAPI(llapi);
		assert hlapi.getContainedItem().equals(llapi);
	}

	//getters giving HLAPI object
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "MultisetSortHLAPI"})
		public void getMultiHLAPITest(){
			MultisetSortHLAPI elem = new MultisetSortHLAPI(new TermsFactoryImpl().createMultisetSort());

			
				elem.setMultiHLAPI(itemmulti);
				MultisetSortHLAPI totest = elem.getMultiHLAPI();
				assert totest.getContainedItem().equals(elem.getMulti());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "MultisetSortHLAPI"})
		public void getContainerNamedSortHLAPITest(){
			MultisetSortHLAPI elem = new MultisetSortHLAPI(new TermsFactoryImpl().createMultisetSort());

			
				elem.setContainerNamedSortHLAPI(itemcontainerNamedSort);
				NamedSortHLAPI totest = elem.getContainerNamedSortHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerNamedSort());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "MultisetSortHLAPI"})
		public void getContainerVariableDeclHLAPITest(){
			MultisetSortHLAPI elem = new MultisetSortHLAPI(new TermsFactoryImpl().createMultisetSort());

			
				elem.setContainerVariableDeclHLAPI(itemcontainerVariableDecl);
				VariableDeclHLAPI totest = elem.getContainerVariableDeclHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerVariableDecl());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "MultisetSortHLAPI"})
		public void getContainerProductSortHLAPITest(){
			MultisetSortHLAPI elem = new MultisetSortHLAPI(new TermsFactoryImpl().createMultisetSort());

			
				elem.setContainerProductSortHLAPI(itemcontainerProductSort);
				ProductSortHLAPI totest = elem.getContainerProductSortHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerProductSort());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "MultisetSortHLAPI"})
		public void getContainerTypeHLAPITest(){
			MultisetSortHLAPI elem = new MultisetSortHLAPI(new TermsFactoryImpl().createMultisetSort());

			
				elem.setContainerTypeHLAPI(itemcontainerType);
				TypeHLAPI totest = elem.getContainerTypeHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerType());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "MultisetSortHLAPI"})
		public void getContainerAllHLAPITest(){
			MultisetSortHLAPI elem = new MultisetSortHLAPI(new TermsFactoryImpl().createMultisetSort());

			
				elem.setContainerAllHLAPI(itemcontainerAll);
				AllHLAPI totest = elem.getContainerAllHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerAll());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "MultisetSortHLAPI"})
		public void getContainerEmptyHLAPITest(){
			MultisetSortHLAPI elem = new MultisetSortHLAPI(new TermsFactoryImpl().createMultisetSort());

			
				elem.setContainerEmptyHLAPI(itemcontainerEmpty);
				EmptyHLAPI totest = elem.getContainerEmptyHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerEmpty());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "MultisetSortHLAPI"})
		public void getContainerPartitionHLAPITest(){
			MultisetSortHLAPI elem = new MultisetSortHLAPI(new TermsFactoryImpl().createMultisetSort());

			
				elem.setContainerPartitionHLAPI(itemcontainerPartition);
				PartitionHLAPI totest = elem.getContainerPartitionHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerPartition());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "MultisetSortHLAPI"})
		public void getContainerListHLAPITest(){
			MultisetSortHLAPI elem = new MultisetSortHLAPI(new TermsFactoryImpl().createMultisetSort());

			
				elem.setContainerListHLAPI(itemcontainerList);
				HLPNListHLAPI totest = elem.getContainerListHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerList());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "MultisetSortHLAPI"})
		public void getContainerEmptyListHLAPITest(){
			MultisetSortHLAPI elem = new MultisetSortHLAPI(new TermsFactoryImpl().createMultisetSort());

			
				elem.setContainerEmptyListHLAPI(itemcontainerEmptyList);
				EmptyListHLAPI totest = elem.getContainerEmptyListHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerEmptyList());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "MultisetSortHLAPI"})
		public void getContainerMakeListHLAPITest(){
			MultisetSortHLAPI elem = new MultisetSortHLAPI(new TermsFactoryImpl().createMultisetSort());

			
				elem.setContainerMakeListHLAPI(itemcontainerMakeList);
				MakeListHLAPI totest = elem.getContainerMakeListHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerMakeList());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "MultisetSortHLAPI"})
		public void getBasisHLAPITest(){
			MultisetSortHLAPI elem = new MultisetSortHLAPI(new TermsFactoryImpl().createMultisetSort());

			
				elem.setBasisHLAPI(new fr.lip6.move.pnml.hlpn.terms.hlapi.MultisetSortHLAPI(new TermsFactoryImpl().createMultisetSort()));
				SortHLAPI totest_terms_MultisetSort = elem.getBasisHLAPI();
				assert totest_terms_MultisetSort.getContainedItem().equals(elem.getBasis());
			
				elem.setBasisHLAPI(new fr.lip6.move.pnml.hlpn.terms.hlapi.ProductSortHLAPI(new TermsFactoryImpl().createProductSort()));
				SortHLAPI totest_terms_ProductSort = elem.getBasisHLAPI();
				assert totest_terms_ProductSort.getContainedItem().equals(elem.getBasis());
			
				elem.setBasisHLAPI(new fr.lip6.move.pnml.hlpn.terms.hlapi.UserSortHLAPI(new TermsFactoryImpl().createUserSort()));
				SortHLAPI totest_terms_UserSort = elem.getBasisHLAPI();
				assert totest_terms_UserSort.getContainedItem().equals(elem.getBasis());
			
				elem.setBasisHLAPI(new fr.lip6.move.pnml.hlpn.arbitrarydeclarations.hlapi.AnySortHLAPI(new ArbitrarydeclarationsFactoryImpl().createAnySort()));
				SortHLAPI totest_arbitrarydeclarations_AnySort = elem.getBasisHLAPI();
				assert totest_arbitrarydeclarations_AnySort.getContainedItem().equals(elem.getBasis());
			
				elem.setBasisHLAPI(new fr.lip6.move.pnml.hlpn.booleans.hlapi.BoolHLAPI(new BooleansFactoryImpl().createBool()));
				SortHLAPI totest_booleans_Bool = elem.getBasisHLAPI();
				assert totest_booleans_Bool.getContainedItem().equals(elem.getBasis());
			
				elem.setBasisHLAPI(new fr.lip6.move.pnml.hlpn.cyclicEnumerations.hlapi.CyclicEnumerationHLAPI(new CyclicEnumerationsFactoryImpl().createCyclicEnumeration()));
				SortHLAPI totest_cyclicEnumerations_CyclicEnumeration = elem.getBasisHLAPI();
				assert totest_cyclicEnumerations_CyclicEnumeration.getContainedItem().equals(elem.getBasis());
			
				elem.setBasisHLAPI(new fr.lip6.move.pnml.hlpn.dots.hlapi.DotHLAPI(new DotsFactoryImpl().createDot()));
				SortHLAPI totest_dots_Dot = elem.getBasisHLAPI();
				assert totest_dots_Dot.getContainedItem().equals(elem.getBasis());
			
				elem.setBasisHLAPI(new fr.lip6.move.pnml.hlpn.finiteEnumerations.hlapi.FiniteEnumerationHLAPI(new FiniteEnumerationsFactoryImpl().createFiniteEnumeration()));
				SortHLAPI totest_finiteEnumerations_FiniteEnumeration = elem.getBasisHLAPI();
				assert totest_finiteEnumerations_FiniteEnumeration.getContainedItem().equals(elem.getBasis());
			
				elem.setBasisHLAPI(new fr.lip6.move.pnml.hlpn.finiteIntRanges.hlapi.FiniteIntRangeHLAPI(new FiniteIntRangesFactoryImpl().createFiniteIntRange()));
				SortHLAPI totest_finiteIntRanges_FiniteIntRange = elem.getBasisHLAPI();
				assert totest_finiteIntRanges_FiniteIntRange.getContainedItem().equals(elem.getBasis());
			
				elem.setBasisHLAPI(new fr.lip6.move.pnml.hlpn.integers.hlapi.NaturalHLAPI(new IntegersFactoryImpl().createNatural()));
				SortHLAPI totest_integers_Natural = elem.getBasisHLAPI();
				assert totest_integers_Natural.getContainedItem().equals(elem.getBasis());
			
				elem.setBasisHLAPI(new fr.lip6.move.pnml.hlpn.integers.hlapi.PositiveHLAPI(new IntegersFactoryImpl().createPositive()));
				SortHLAPI totest_integers_Positive = elem.getBasisHLAPI();
				assert totest_integers_Positive.getContainedItem().equals(elem.getBasis());
			
				elem.setBasisHLAPI(new fr.lip6.move.pnml.hlpn.integers.hlapi.HLIntegerHLAPI(new IntegersFactoryImpl().createHLInteger()));
				SortHLAPI totest_integers_HLInteger = elem.getBasisHLAPI();
				assert totest_integers_HLInteger.getContainedItem().equals(elem.getBasis());
			
				elem.setBasisHLAPI(new fr.lip6.move.pnml.hlpn.lists.hlapi.HLPNListHLAPI(new ListsFactoryImpl().createHLPNList()));
				SortHLAPI totest_lists_HLPNList = elem.getBasisHLAPI();
				assert totest_lists_HLPNList.getContainedItem().equals(elem.getBasis());
			
				elem.setBasisHLAPI(new fr.lip6.move.pnml.hlpn.strings.hlapi.HLPNStringHLAPI(new StringsFactoryImpl().createHLPNString()));
				SortHLAPI totest_strings_HLPNString = elem.getBasisHLAPI();
				assert totest_strings_HLPNString.getContainedItem().equals(elem.getBasis());
			
		}
	

	//Special getter for list of generics object, return only one object type.
	
	
	
	
	
	
	
	
	
	
	
	
	

	//setters/remover for lists.
	

	@Test(groups = { "hlapi", "MultisetSortHLAPI"})
	public void equalsTest(){
		MultisetSort a = new TermsFactoryImpl().createMultisetSort();
		MultisetSort b = new TermsFactoryImpl().createMultisetSort();
		MultisetSortHLAPI aprime = new MultisetSortHLAPI(a);
		MultisetSortHLAPI asecond = new MultisetSortHLAPI(a);
		MultisetSortHLAPI bprime = new MultisetSortHLAPI(b);

		assert aprime.equals(asecond);
		assert !aprime.equals(bprime);
	}

	//cloning method
	//public MultisetSortHLAPI clone(){
	//	return new MultisetSortHLAPI(this);
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
