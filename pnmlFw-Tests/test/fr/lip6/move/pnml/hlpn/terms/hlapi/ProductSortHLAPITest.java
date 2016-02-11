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
 * $Id ggiffo, Thu Feb 11 16:29:59 CET 2016$
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
import fr.lip6.move.pnml.hlpn.terms.Variable;
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
public class ProductSortHLAPITest {

	
	
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
	


	@AfterTest(groups = { "ProductSortHLAPI", "hlapi" })
	public void After() {
	    System.out.println("done for "+"ProductSortHLAPI(terms)");
	}


	@BeforeMethod(groups = { "ProductSortHLAPI", "hlapi" })
	public void setup() throws Exception{
	//ModelRepository.reset(); ModelRepository.getInstance().createDocumentWorkspace("void");
	ModelRepository mr = ModelRepository.getInstance();
	mr.createDocumentWorkspace("void");
	

	
		
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
	@Test(groups = { "hlapi", "ProductSortHLAPI"}, dependsOnMethods={"ProductSortHLAPI_LLAPI"})
	public void ProductSortHLAPI_1(){//BEGIN CONSTRUCTOR BODY
   @SuppressWarnings("unused")
	ProductSortHLAPI totest = new ProductSortHLAPI();
	
	}

	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "ProductSortHLAPI"}, dependsOnMethods={"ProductSortHLAPI_LLAPI"})
	public void ProductSortHLAPI_2_multi(){//BEGIN CONSTRUCTOR BODY

	ProductSortHLAPI totest = new ProductSortHLAPI(
		itemmulti
	);
	
	assert totest.getMulti().equals(itemmulti.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "ProductSortHLAPI"}, dependsOnMethods={"ProductSortHLAPI_LLAPI"})
	public void ProductSortHLAPI_2_containerNamedSort(){//BEGIN CONSTRUCTOR BODY

	ProductSortHLAPI totest = new ProductSortHLAPI(
		itemcontainerNamedSort
	);
	
	assert totest.getContainerNamedSort().equals(itemcontainerNamedSort.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "ProductSortHLAPI"}, dependsOnMethods={"ProductSortHLAPI_LLAPI"})
	public void ProductSortHLAPI_2_containerVariableDecl(){//BEGIN CONSTRUCTOR BODY

	ProductSortHLAPI totest = new ProductSortHLAPI(
		itemcontainerVariableDecl
	);
	
	assert totest.getContainerVariableDecl().equals(itemcontainerVariableDecl.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "ProductSortHLAPI"}, dependsOnMethods={"ProductSortHLAPI_LLAPI"})
	public void ProductSortHLAPI_2_containerType(){//BEGIN CONSTRUCTOR BODY

	ProductSortHLAPI totest = new ProductSortHLAPI(
		itemcontainerType
	);
	
	assert totest.getContainerType().equals(itemcontainerType.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "ProductSortHLAPI"}, dependsOnMethods={"ProductSortHLAPI_LLAPI"})
	public void ProductSortHLAPI_2_containerAll(){//BEGIN CONSTRUCTOR BODY

	ProductSortHLAPI totest = new ProductSortHLAPI(
		itemcontainerAll
	);
	
	assert totest.getContainerAll().equals(itemcontainerAll.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "ProductSortHLAPI"}, dependsOnMethods={"ProductSortHLAPI_LLAPI"})
	public void ProductSortHLAPI_2_containerEmpty(){//BEGIN CONSTRUCTOR BODY

	ProductSortHLAPI totest = new ProductSortHLAPI(
		itemcontainerEmpty
	);
	
	assert totest.getContainerEmpty().equals(itemcontainerEmpty.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "ProductSortHLAPI"}, dependsOnMethods={"ProductSortHLAPI_LLAPI"})
	public void ProductSortHLAPI_2_containerPartition(){//BEGIN CONSTRUCTOR BODY

	ProductSortHLAPI totest = new ProductSortHLAPI(
		itemcontainerPartition
	);
	
	assert totest.getContainerPartition().equals(itemcontainerPartition.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "ProductSortHLAPI"}, dependsOnMethods={"ProductSortHLAPI_LLAPI"})
	public void ProductSortHLAPI_2_containerList(){//BEGIN CONSTRUCTOR BODY

	ProductSortHLAPI totest = new ProductSortHLAPI(
		itemcontainerList
	);
	
	assert totest.getContainerList().equals(itemcontainerList.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "ProductSortHLAPI"}, dependsOnMethods={"ProductSortHLAPI_LLAPI"})
	public void ProductSortHLAPI_2_containerEmptyList(){//BEGIN CONSTRUCTOR BODY

	ProductSortHLAPI totest = new ProductSortHLAPI(
		itemcontainerEmptyList
	);
	
	assert totest.getContainerEmptyList().equals(itemcontainerEmptyList.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "ProductSortHLAPI"}, dependsOnMethods={"ProductSortHLAPI_LLAPI"})
	public void ProductSortHLAPI_2_containerMakeList(){//BEGIN CONSTRUCTOR BODY

	ProductSortHLAPI totest = new ProductSortHLAPI(
		itemcontainerMakeList
	);
	
	assert totest.getContainerMakeList().equals(itemcontainerMakeList.getContainedItem());
	}

	/**
    * This constructor give access to required stuff only (not container if any)
    */



	/**
	 * This constructor encapsulate a low level API object in HLAPI.
	 */
	@Test(groups = { "hlapi", "ProductSortHLAPI"})
	public void ProductSortHLAPI_LLAPI(){
	   ProductSort llapi = new TermsFactoryImpl().createProductSort();
	   fr.lip6.move.pnml.hlpn.terms.hlapi.ProductSortHLAPI hlapi = new ProductSortHLAPI(llapi);
		assert hlapi.getContainedItem().equals(llapi);
	}

	//getters giving HLAPI object
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "ProductSortHLAPI"})
		public void getMultiHLAPITest(){
			ProductSortHLAPI elem = new ProductSortHLAPI(new TermsFactoryImpl().createProductSort());

			
				elem.setMultiHLAPI(itemmulti);
				MultisetSortHLAPI totest = elem.getMultiHLAPI();
				assert totest.getContainedItem().equals(elem.getMulti());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "ProductSortHLAPI"})
		public void getContainerNamedSortHLAPITest(){
			ProductSortHLAPI elem = new ProductSortHLAPI(new TermsFactoryImpl().createProductSort());

			
				elem.setContainerNamedSortHLAPI(itemcontainerNamedSort);
				NamedSortHLAPI totest = elem.getContainerNamedSortHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerNamedSort());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "ProductSortHLAPI"})
		public void getContainerVariableDeclHLAPITest(){
			ProductSortHLAPI elem = new ProductSortHLAPI(new TermsFactoryImpl().createProductSort());

			
				elem.setContainerVariableDeclHLAPI(itemcontainerVariableDecl);
				VariableDeclHLAPI totest = elem.getContainerVariableDeclHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerVariableDecl());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "ProductSortHLAPI"})
		public void getContainerProductSortHLAPITest(){
			ProductSortHLAPI elem = new ProductSortHLAPI(new TermsFactoryImpl().createProductSort());

			
				elem.setContainerProductSortHLAPI(itemcontainerProductSort);
				ProductSortHLAPI totest = elem.getContainerProductSortHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerProductSort());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "ProductSortHLAPI"})
		public void getContainerTypeHLAPITest(){
			ProductSortHLAPI elem = new ProductSortHLAPI(new TermsFactoryImpl().createProductSort());

			
				elem.setContainerTypeHLAPI(itemcontainerType);
				TypeHLAPI totest = elem.getContainerTypeHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerType());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "ProductSortHLAPI"})
		public void getContainerAllHLAPITest(){
			ProductSortHLAPI elem = new ProductSortHLAPI(new TermsFactoryImpl().createProductSort());

			
				elem.setContainerAllHLAPI(itemcontainerAll);
				AllHLAPI totest = elem.getContainerAllHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerAll());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "ProductSortHLAPI"})
		public void getContainerEmptyHLAPITest(){
			ProductSortHLAPI elem = new ProductSortHLAPI(new TermsFactoryImpl().createProductSort());

			
				elem.setContainerEmptyHLAPI(itemcontainerEmpty);
				EmptyHLAPI totest = elem.getContainerEmptyHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerEmpty());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "ProductSortHLAPI"})
		public void getContainerPartitionHLAPITest(){
			ProductSortHLAPI elem = new ProductSortHLAPI(new TermsFactoryImpl().createProductSort());

			
				elem.setContainerPartitionHLAPI(itemcontainerPartition);
				PartitionHLAPI totest = elem.getContainerPartitionHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerPartition());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "ProductSortHLAPI"})
		public void getContainerListHLAPITest(){
			ProductSortHLAPI elem = new ProductSortHLAPI(new TermsFactoryImpl().createProductSort());

			
				elem.setContainerListHLAPI(itemcontainerList);
				HLPNListHLAPI totest = elem.getContainerListHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerList());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "ProductSortHLAPI"})
		public void getContainerEmptyListHLAPITest(){
			ProductSortHLAPI elem = new ProductSortHLAPI(new TermsFactoryImpl().createProductSort());

			
				elem.setContainerEmptyListHLAPI(itemcontainerEmptyList);
				EmptyListHLAPI totest = elem.getContainerEmptyListHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerEmptyList());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "ProductSortHLAPI"})
		public void getContainerMakeListHLAPITest(){
			ProductSortHLAPI elem = new ProductSortHLAPI(new TermsFactoryImpl().createProductSort());

			
				elem.setContainerMakeListHLAPI(itemcontainerMakeList);
				MakeListHLAPI totest = elem.getContainerMakeListHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerMakeList());
			
		}
	
	

	
		/**
		 * This test add a random number of desired objet in the list or of one of each existing subtypes.
		 * then test how many objet are retuned and if any exist inthe original list.
		 */
		@Test(groups = { "hlapi", "ProductSortHLAPI"})
		public void getElementSortHLAPITest(){
			ProductSort llapi = new TermsFactoryImpl().createProductSort();
			int howmany;
			
			llapi.getElementSort().add(
			   new TermsFactoryImpl().createMultisetSort()
			);
			
			llapi.getElementSort().add(
			   new TermsFactoryImpl().createProductSort()
			);
			
			llapi.getElementSort().add(
			   new TermsFactoryImpl().createUserSort()
			);
			
			llapi.getElementSort().add(
			   new ArbitrarydeclarationsFactoryImpl().createAnySort()
			);
			
			llapi.getElementSort().add(
			   new BooleansFactoryImpl().createBool()
			);
			
			llapi.getElementSort().add(
			   new CyclicEnumerationsFactoryImpl().createCyclicEnumeration()
			);
			
			llapi.getElementSort().add(
			   new DotsFactoryImpl().createDot()
			);
			
			llapi.getElementSort().add(
			   new FiniteEnumerationsFactoryImpl().createFiniteEnumeration()
			);
			
			llapi.getElementSort().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRange()
			);
			
			llapi.getElementSort().add(
			   new IntegersFactoryImpl().createNatural()
			);
			
			llapi.getElementSort().add(
			   new IntegersFactoryImpl().createPositive()
			);
			
			llapi.getElementSort().add(
			   new IntegersFactoryImpl().createHLInteger()
			);
			
			llapi.getElementSort().add(
			   new ListsFactoryImpl().createHLPNList()
			);
			
			llapi.getElementSort().add(
			   new StringsFactoryImpl().createHLPNString()
			);
			
			howmany = 14;
			

			ProductSortHLAPI elem = new ProductSortHLAPI(llapi);
			List<SortHLAPI> totest = elem.getElementSortHLAPI();

			assert totest.size() == howmany;

			for (SortHLAPI unit : totest) {
             assert llapi.getElementSort().contains(unit.getContainedItem()) : "missing element";
         }
		}
	

	//Special getter for list of generics object, return only one object type.
	
	
	
	
	
	
	
	
	
	
	
	
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "ProductSortHLAPI"})
		public void getElementSort_terms_MultisetSortHLAPITest(){
			ProductSort llapi = new TermsFactoryImpl().createProductSort();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getElementSort().add(new TermsFactoryImpl().createMultisetSort());
			
			llapi.getElementSort().add(
			   new TermsFactoryImpl().createMultisetSort()
			);
			
			llapi.getElementSort().add(
			   new TermsFactoryImpl().createProductSort()
			);
			
			llapi.getElementSort().add(
			   new TermsFactoryImpl().createUserSort()
			);
			
			llapi.getElementSort().add(
			   new ArbitrarydeclarationsFactoryImpl().createAnySort()
			);
			
			llapi.getElementSort().add(
			   new BooleansFactoryImpl().createBool()
			);
			
			llapi.getElementSort().add(
			   new CyclicEnumerationsFactoryImpl().createCyclicEnumeration()
			);
			
			llapi.getElementSort().add(
			   new DotsFactoryImpl().createDot()
			);
			
			llapi.getElementSort().add(
			   new FiniteEnumerationsFactoryImpl().createFiniteEnumeration()
			);
			
			llapi.getElementSort().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRange()
			);
			
			llapi.getElementSort().add(
			   new IntegersFactoryImpl().createNatural()
			);
			
			llapi.getElementSort().add(
			   new IntegersFactoryImpl().createPositive()
			);
			
			llapi.getElementSort().add(
			   new IntegersFactoryImpl().createHLInteger()
			);
			
			llapi.getElementSort().add(
			   new ListsFactoryImpl().createHLPNList()
			);
			
			llapi.getElementSort().add(
			   new StringsFactoryImpl().createHLPNString()
			);
			
			howmany += 14;

			ProductSortHLAPI elem = new ProductSortHLAPI(llapi);
			List<fr.lip6.move.pnml.hlpn.terms.hlapi.MultisetSortHLAPI> totest = elem.getElementSort_terms_MultisetSortHLAPI();

			assert totest.size() == howmany + 1 - 14;

			for (SortHLAPI unit : totest) {
             assert llapi.getElementSort().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "ProductSortHLAPI"})
		public void getElementSort_terms_ProductSortHLAPITest(){
			ProductSort llapi = new TermsFactoryImpl().createProductSort();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getElementSort().add(new TermsFactoryImpl().createProductSort());
			
			llapi.getElementSort().add(
			   new TermsFactoryImpl().createMultisetSort()
			);
			
			llapi.getElementSort().add(
			   new TermsFactoryImpl().createProductSort()
			);
			
			llapi.getElementSort().add(
			   new TermsFactoryImpl().createUserSort()
			);
			
			llapi.getElementSort().add(
			   new ArbitrarydeclarationsFactoryImpl().createAnySort()
			);
			
			llapi.getElementSort().add(
			   new BooleansFactoryImpl().createBool()
			);
			
			llapi.getElementSort().add(
			   new CyclicEnumerationsFactoryImpl().createCyclicEnumeration()
			);
			
			llapi.getElementSort().add(
			   new DotsFactoryImpl().createDot()
			);
			
			llapi.getElementSort().add(
			   new FiniteEnumerationsFactoryImpl().createFiniteEnumeration()
			);
			
			llapi.getElementSort().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRange()
			);
			
			llapi.getElementSort().add(
			   new IntegersFactoryImpl().createNatural()
			);
			
			llapi.getElementSort().add(
			   new IntegersFactoryImpl().createPositive()
			);
			
			llapi.getElementSort().add(
			   new IntegersFactoryImpl().createHLInteger()
			);
			
			llapi.getElementSort().add(
			   new ListsFactoryImpl().createHLPNList()
			);
			
			llapi.getElementSort().add(
			   new StringsFactoryImpl().createHLPNString()
			);
			
			howmany += 14;

			ProductSortHLAPI elem = new ProductSortHLAPI(llapi);
			List<fr.lip6.move.pnml.hlpn.terms.hlapi.ProductSortHLAPI> totest = elem.getElementSort_terms_ProductSortHLAPI();

			assert totest.size() == howmany + 1 - 14;

			for (SortHLAPI unit : totest) {
             assert llapi.getElementSort().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "ProductSortHLAPI"})
		public void getElementSort_terms_UserSortHLAPITest(){
			ProductSort llapi = new TermsFactoryImpl().createProductSort();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getElementSort().add(new TermsFactoryImpl().createUserSort());
			
			llapi.getElementSort().add(
			   new TermsFactoryImpl().createMultisetSort()
			);
			
			llapi.getElementSort().add(
			   new TermsFactoryImpl().createProductSort()
			);
			
			llapi.getElementSort().add(
			   new TermsFactoryImpl().createUserSort()
			);
			
			llapi.getElementSort().add(
			   new ArbitrarydeclarationsFactoryImpl().createAnySort()
			);
			
			llapi.getElementSort().add(
			   new BooleansFactoryImpl().createBool()
			);
			
			llapi.getElementSort().add(
			   new CyclicEnumerationsFactoryImpl().createCyclicEnumeration()
			);
			
			llapi.getElementSort().add(
			   new DotsFactoryImpl().createDot()
			);
			
			llapi.getElementSort().add(
			   new FiniteEnumerationsFactoryImpl().createFiniteEnumeration()
			);
			
			llapi.getElementSort().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRange()
			);
			
			llapi.getElementSort().add(
			   new IntegersFactoryImpl().createNatural()
			);
			
			llapi.getElementSort().add(
			   new IntegersFactoryImpl().createPositive()
			);
			
			llapi.getElementSort().add(
			   new IntegersFactoryImpl().createHLInteger()
			);
			
			llapi.getElementSort().add(
			   new ListsFactoryImpl().createHLPNList()
			);
			
			llapi.getElementSort().add(
			   new StringsFactoryImpl().createHLPNString()
			);
			
			howmany += 14;

			ProductSortHLAPI elem = new ProductSortHLAPI(llapi);
			List<fr.lip6.move.pnml.hlpn.terms.hlapi.UserSortHLAPI> totest = elem.getElementSort_terms_UserSortHLAPI();

			assert totest.size() == howmany + 1 - 14;

			for (SortHLAPI unit : totest) {
             assert llapi.getElementSort().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "ProductSortHLAPI"})
		public void getElementSort_arbitrarydeclarations_AnySortHLAPITest(){
			ProductSort llapi = new TermsFactoryImpl().createProductSort();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getElementSort().add(new ArbitrarydeclarationsFactoryImpl().createAnySort());
			
			llapi.getElementSort().add(
			   new TermsFactoryImpl().createMultisetSort()
			);
			
			llapi.getElementSort().add(
			   new TermsFactoryImpl().createProductSort()
			);
			
			llapi.getElementSort().add(
			   new TermsFactoryImpl().createUserSort()
			);
			
			llapi.getElementSort().add(
			   new ArbitrarydeclarationsFactoryImpl().createAnySort()
			);
			
			llapi.getElementSort().add(
			   new BooleansFactoryImpl().createBool()
			);
			
			llapi.getElementSort().add(
			   new CyclicEnumerationsFactoryImpl().createCyclicEnumeration()
			);
			
			llapi.getElementSort().add(
			   new DotsFactoryImpl().createDot()
			);
			
			llapi.getElementSort().add(
			   new FiniteEnumerationsFactoryImpl().createFiniteEnumeration()
			);
			
			llapi.getElementSort().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRange()
			);
			
			llapi.getElementSort().add(
			   new IntegersFactoryImpl().createNatural()
			);
			
			llapi.getElementSort().add(
			   new IntegersFactoryImpl().createPositive()
			);
			
			llapi.getElementSort().add(
			   new IntegersFactoryImpl().createHLInteger()
			);
			
			llapi.getElementSort().add(
			   new ListsFactoryImpl().createHLPNList()
			);
			
			llapi.getElementSort().add(
			   new StringsFactoryImpl().createHLPNString()
			);
			
			howmany += 14;

			ProductSortHLAPI elem = new ProductSortHLAPI(llapi);
			List<fr.lip6.move.pnml.hlpn.arbitrarydeclarations.hlapi.AnySortHLAPI> totest = elem.getElementSort_arbitrarydeclarations_AnySortHLAPI();

			assert totest.size() == howmany + 1 - 14;

			for (SortHLAPI unit : totest) {
             assert llapi.getElementSort().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "ProductSortHLAPI"})
		public void getElementSort_booleans_BoolHLAPITest(){
			ProductSort llapi = new TermsFactoryImpl().createProductSort();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getElementSort().add(new BooleansFactoryImpl().createBool());
			
			llapi.getElementSort().add(
			   new TermsFactoryImpl().createMultisetSort()
			);
			
			llapi.getElementSort().add(
			   new TermsFactoryImpl().createProductSort()
			);
			
			llapi.getElementSort().add(
			   new TermsFactoryImpl().createUserSort()
			);
			
			llapi.getElementSort().add(
			   new ArbitrarydeclarationsFactoryImpl().createAnySort()
			);
			
			llapi.getElementSort().add(
			   new BooleansFactoryImpl().createBool()
			);
			
			llapi.getElementSort().add(
			   new CyclicEnumerationsFactoryImpl().createCyclicEnumeration()
			);
			
			llapi.getElementSort().add(
			   new DotsFactoryImpl().createDot()
			);
			
			llapi.getElementSort().add(
			   new FiniteEnumerationsFactoryImpl().createFiniteEnumeration()
			);
			
			llapi.getElementSort().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRange()
			);
			
			llapi.getElementSort().add(
			   new IntegersFactoryImpl().createNatural()
			);
			
			llapi.getElementSort().add(
			   new IntegersFactoryImpl().createPositive()
			);
			
			llapi.getElementSort().add(
			   new IntegersFactoryImpl().createHLInteger()
			);
			
			llapi.getElementSort().add(
			   new ListsFactoryImpl().createHLPNList()
			);
			
			llapi.getElementSort().add(
			   new StringsFactoryImpl().createHLPNString()
			);
			
			howmany += 14;

			ProductSortHLAPI elem = new ProductSortHLAPI(llapi);
			List<fr.lip6.move.pnml.hlpn.booleans.hlapi.BoolHLAPI> totest = elem.getElementSort_booleans_BoolHLAPI();

			assert totest.size() == howmany + 1 - 14;

			for (SortHLAPI unit : totest) {
             assert llapi.getElementSort().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "ProductSortHLAPI"})
		public void getElementSort_cyclicEnumerations_CyclicEnumerationHLAPITest(){
			ProductSort llapi = new TermsFactoryImpl().createProductSort();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getElementSort().add(new CyclicEnumerationsFactoryImpl().createCyclicEnumeration());
			
			llapi.getElementSort().add(
			   new TermsFactoryImpl().createMultisetSort()
			);
			
			llapi.getElementSort().add(
			   new TermsFactoryImpl().createProductSort()
			);
			
			llapi.getElementSort().add(
			   new TermsFactoryImpl().createUserSort()
			);
			
			llapi.getElementSort().add(
			   new ArbitrarydeclarationsFactoryImpl().createAnySort()
			);
			
			llapi.getElementSort().add(
			   new BooleansFactoryImpl().createBool()
			);
			
			llapi.getElementSort().add(
			   new CyclicEnumerationsFactoryImpl().createCyclicEnumeration()
			);
			
			llapi.getElementSort().add(
			   new DotsFactoryImpl().createDot()
			);
			
			llapi.getElementSort().add(
			   new FiniteEnumerationsFactoryImpl().createFiniteEnumeration()
			);
			
			llapi.getElementSort().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRange()
			);
			
			llapi.getElementSort().add(
			   new IntegersFactoryImpl().createNatural()
			);
			
			llapi.getElementSort().add(
			   new IntegersFactoryImpl().createPositive()
			);
			
			llapi.getElementSort().add(
			   new IntegersFactoryImpl().createHLInteger()
			);
			
			llapi.getElementSort().add(
			   new ListsFactoryImpl().createHLPNList()
			);
			
			llapi.getElementSort().add(
			   new StringsFactoryImpl().createHLPNString()
			);
			
			howmany += 14;

			ProductSortHLAPI elem = new ProductSortHLAPI(llapi);
			List<fr.lip6.move.pnml.hlpn.cyclicEnumerations.hlapi.CyclicEnumerationHLAPI> totest = elem.getElementSort_cyclicEnumerations_CyclicEnumerationHLAPI();

			assert totest.size() == howmany + 1 - 14;

			for (SortHLAPI unit : totest) {
             assert llapi.getElementSort().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "ProductSortHLAPI"})
		public void getElementSort_dots_DotHLAPITest(){
			ProductSort llapi = new TermsFactoryImpl().createProductSort();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getElementSort().add(new DotsFactoryImpl().createDot());
			
			llapi.getElementSort().add(
			   new TermsFactoryImpl().createMultisetSort()
			);
			
			llapi.getElementSort().add(
			   new TermsFactoryImpl().createProductSort()
			);
			
			llapi.getElementSort().add(
			   new TermsFactoryImpl().createUserSort()
			);
			
			llapi.getElementSort().add(
			   new ArbitrarydeclarationsFactoryImpl().createAnySort()
			);
			
			llapi.getElementSort().add(
			   new BooleansFactoryImpl().createBool()
			);
			
			llapi.getElementSort().add(
			   new CyclicEnumerationsFactoryImpl().createCyclicEnumeration()
			);
			
			llapi.getElementSort().add(
			   new DotsFactoryImpl().createDot()
			);
			
			llapi.getElementSort().add(
			   new FiniteEnumerationsFactoryImpl().createFiniteEnumeration()
			);
			
			llapi.getElementSort().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRange()
			);
			
			llapi.getElementSort().add(
			   new IntegersFactoryImpl().createNatural()
			);
			
			llapi.getElementSort().add(
			   new IntegersFactoryImpl().createPositive()
			);
			
			llapi.getElementSort().add(
			   new IntegersFactoryImpl().createHLInteger()
			);
			
			llapi.getElementSort().add(
			   new ListsFactoryImpl().createHLPNList()
			);
			
			llapi.getElementSort().add(
			   new StringsFactoryImpl().createHLPNString()
			);
			
			howmany += 14;

			ProductSortHLAPI elem = new ProductSortHLAPI(llapi);
			List<fr.lip6.move.pnml.hlpn.dots.hlapi.DotHLAPI> totest = elem.getElementSort_dots_DotHLAPI();

			assert totest.size() == howmany + 1 - 14;

			for (SortHLAPI unit : totest) {
             assert llapi.getElementSort().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "ProductSortHLAPI"})
		public void getElementSort_finiteEnumerations_FiniteEnumerationHLAPITest(){
			ProductSort llapi = new TermsFactoryImpl().createProductSort();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getElementSort().add(new FiniteEnumerationsFactoryImpl().createFiniteEnumeration());
			
			llapi.getElementSort().add(
			   new TermsFactoryImpl().createMultisetSort()
			);
			
			llapi.getElementSort().add(
			   new TermsFactoryImpl().createProductSort()
			);
			
			llapi.getElementSort().add(
			   new TermsFactoryImpl().createUserSort()
			);
			
			llapi.getElementSort().add(
			   new ArbitrarydeclarationsFactoryImpl().createAnySort()
			);
			
			llapi.getElementSort().add(
			   new BooleansFactoryImpl().createBool()
			);
			
			llapi.getElementSort().add(
			   new CyclicEnumerationsFactoryImpl().createCyclicEnumeration()
			);
			
			llapi.getElementSort().add(
			   new DotsFactoryImpl().createDot()
			);
			
			llapi.getElementSort().add(
			   new FiniteEnumerationsFactoryImpl().createFiniteEnumeration()
			);
			
			llapi.getElementSort().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRange()
			);
			
			llapi.getElementSort().add(
			   new IntegersFactoryImpl().createNatural()
			);
			
			llapi.getElementSort().add(
			   new IntegersFactoryImpl().createPositive()
			);
			
			llapi.getElementSort().add(
			   new IntegersFactoryImpl().createHLInteger()
			);
			
			llapi.getElementSort().add(
			   new ListsFactoryImpl().createHLPNList()
			);
			
			llapi.getElementSort().add(
			   new StringsFactoryImpl().createHLPNString()
			);
			
			howmany += 14;

			ProductSortHLAPI elem = new ProductSortHLAPI(llapi);
			List<fr.lip6.move.pnml.hlpn.finiteEnumerations.hlapi.FiniteEnumerationHLAPI> totest = elem.getElementSort_finiteEnumerations_FiniteEnumerationHLAPI();

			assert totest.size() == howmany + 1 - 14;

			for (SortHLAPI unit : totest) {
             assert llapi.getElementSort().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "ProductSortHLAPI"})
		public void getElementSort_finiteIntRanges_FiniteIntRangeHLAPITest(){
			ProductSort llapi = new TermsFactoryImpl().createProductSort();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getElementSort().add(new FiniteIntRangesFactoryImpl().createFiniteIntRange());
			
			llapi.getElementSort().add(
			   new TermsFactoryImpl().createMultisetSort()
			);
			
			llapi.getElementSort().add(
			   new TermsFactoryImpl().createProductSort()
			);
			
			llapi.getElementSort().add(
			   new TermsFactoryImpl().createUserSort()
			);
			
			llapi.getElementSort().add(
			   new ArbitrarydeclarationsFactoryImpl().createAnySort()
			);
			
			llapi.getElementSort().add(
			   new BooleansFactoryImpl().createBool()
			);
			
			llapi.getElementSort().add(
			   new CyclicEnumerationsFactoryImpl().createCyclicEnumeration()
			);
			
			llapi.getElementSort().add(
			   new DotsFactoryImpl().createDot()
			);
			
			llapi.getElementSort().add(
			   new FiniteEnumerationsFactoryImpl().createFiniteEnumeration()
			);
			
			llapi.getElementSort().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRange()
			);
			
			llapi.getElementSort().add(
			   new IntegersFactoryImpl().createNatural()
			);
			
			llapi.getElementSort().add(
			   new IntegersFactoryImpl().createPositive()
			);
			
			llapi.getElementSort().add(
			   new IntegersFactoryImpl().createHLInteger()
			);
			
			llapi.getElementSort().add(
			   new ListsFactoryImpl().createHLPNList()
			);
			
			llapi.getElementSort().add(
			   new StringsFactoryImpl().createHLPNString()
			);
			
			howmany += 14;

			ProductSortHLAPI elem = new ProductSortHLAPI(llapi);
			List<fr.lip6.move.pnml.hlpn.finiteIntRanges.hlapi.FiniteIntRangeHLAPI> totest = elem.getElementSort_finiteIntRanges_FiniteIntRangeHLAPI();

			assert totest.size() == howmany + 1 - 14;

			for (SortHLAPI unit : totest) {
             assert llapi.getElementSort().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "ProductSortHLAPI"})
		public void getElementSort_integers_NaturalHLAPITest(){
			ProductSort llapi = new TermsFactoryImpl().createProductSort();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getElementSort().add(new IntegersFactoryImpl().createNatural());
			
			llapi.getElementSort().add(
			   new TermsFactoryImpl().createMultisetSort()
			);
			
			llapi.getElementSort().add(
			   new TermsFactoryImpl().createProductSort()
			);
			
			llapi.getElementSort().add(
			   new TermsFactoryImpl().createUserSort()
			);
			
			llapi.getElementSort().add(
			   new ArbitrarydeclarationsFactoryImpl().createAnySort()
			);
			
			llapi.getElementSort().add(
			   new BooleansFactoryImpl().createBool()
			);
			
			llapi.getElementSort().add(
			   new CyclicEnumerationsFactoryImpl().createCyclicEnumeration()
			);
			
			llapi.getElementSort().add(
			   new DotsFactoryImpl().createDot()
			);
			
			llapi.getElementSort().add(
			   new FiniteEnumerationsFactoryImpl().createFiniteEnumeration()
			);
			
			llapi.getElementSort().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRange()
			);
			
			llapi.getElementSort().add(
			   new IntegersFactoryImpl().createNatural()
			);
			
			llapi.getElementSort().add(
			   new IntegersFactoryImpl().createPositive()
			);
			
			llapi.getElementSort().add(
			   new IntegersFactoryImpl().createHLInteger()
			);
			
			llapi.getElementSort().add(
			   new ListsFactoryImpl().createHLPNList()
			);
			
			llapi.getElementSort().add(
			   new StringsFactoryImpl().createHLPNString()
			);
			
			howmany += 14;

			ProductSortHLAPI elem = new ProductSortHLAPI(llapi);
			List<fr.lip6.move.pnml.hlpn.integers.hlapi.NaturalHLAPI> totest = elem.getElementSort_integers_NaturalHLAPI();

			assert totest.size() == howmany + 1 - 14;

			for (SortHLAPI unit : totest) {
             assert llapi.getElementSort().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "ProductSortHLAPI"})
		public void getElementSort_integers_PositiveHLAPITest(){
			ProductSort llapi = new TermsFactoryImpl().createProductSort();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getElementSort().add(new IntegersFactoryImpl().createPositive());
			
			llapi.getElementSort().add(
			   new TermsFactoryImpl().createMultisetSort()
			);
			
			llapi.getElementSort().add(
			   new TermsFactoryImpl().createProductSort()
			);
			
			llapi.getElementSort().add(
			   new TermsFactoryImpl().createUserSort()
			);
			
			llapi.getElementSort().add(
			   new ArbitrarydeclarationsFactoryImpl().createAnySort()
			);
			
			llapi.getElementSort().add(
			   new BooleansFactoryImpl().createBool()
			);
			
			llapi.getElementSort().add(
			   new CyclicEnumerationsFactoryImpl().createCyclicEnumeration()
			);
			
			llapi.getElementSort().add(
			   new DotsFactoryImpl().createDot()
			);
			
			llapi.getElementSort().add(
			   new FiniteEnumerationsFactoryImpl().createFiniteEnumeration()
			);
			
			llapi.getElementSort().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRange()
			);
			
			llapi.getElementSort().add(
			   new IntegersFactoryImpl().createNatural()
			);
			
			llapi.getElementSort().add(
			   new IntegersFactoryImpl().createPositive()
			);
			
			llapi.getElementSort().add(
			   new IntegersFactoryImpl().createHLInteger()
			);
			
			llapi.getElementSort().add(
			   new ListsFactoryImpl().createHLPNList()
			);
			
			llapi.getElementSort().add(
			   new StringsFactoryImpl().createHLPNString()
			);
			
			howmany += 14;

			ProductSortHLAPI elem = new ProductSortHLAPI(llapi);
			List<fr.lip6.move.pnml.hlpn.integers.hlapi.PositiveHLAPI> totest = elem.getElementSort_integers_PositiveHLAPI();

			assert totest.size() == howmany + 1 - 14;

			for (SortHLAPI unit : totest) {
             assert llapi.getElementSort().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "ProductSortHLAPI"})
		public void getElementSort_integers_HLIntegerHLAPITest(){
			ProductSort llapi = new TermsFactoryImpl().createProductSort();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getElementSort().add(new IntegersFactoryImpl().createHLInteger());
			
			llapi.getElementSort().add(
			   new TermsFactoryImpl().createMultisetSort()
			);
			
			llapi.getElementSort().add(
			   new TermsFactoryImpl().createProductSort()
			);
			
			llapi.getElementSort().add(
			   new TermsFactoryImpl().createUserSort()
			);
			
			llapi.getElementSort().add(
			   new ArbitrarydeclarationsFactoryImpl().createAnySort()
			);
			
			llapi.getElementSort().add(
			   new BooleansFactoryImpl().createBool()
			);
			
			llapi.getElementSort().add(
			   new CyclicEnumerationsFactoryImpl().createCyclicEnumeration()
			);
			
			llapi.getElementSort().add(
			   new DotsFactoryImpl().createDot()
			);
			
			llapi.getElementSort().add(
			   new FiniteEnumerationsFactoryImpl().createFiniteEnumeration()
			);
			
			llapi.getElementSort().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRange()
			);
			
			llapi.getElementSort().add(
			   new IntegersFactoryImpl().createNatural()
			);
			
			llapi.getElementSort().add(
			   new IntegersFactoryImpl().createPositive()
			);
			
			llapi.getElementSort().add(
			   new IntegersFactoryImpl().createHLInteger()
			);
			
			llapi.getElementSort().add(
			   new ListsFactoryImpl().createHLPNList()
			);
			
			llapi.getElementSort().add(
			   new StringsFactoryImpl().createHLPNString()
			);
			
			howmany += 14;

			ProductSortHLAPI elem = new ProductSortHLAPI(llapi);
			List<fr.lip6.move.pnml.hlpn.integers.hlapi.HLIntegerHLAPI> totest = elem.getElementSort_integers_HLIntegerHLAPI();

			assert totest.size() == howmany + 1 - 14;

			for (SortHLAPI unit : totest) {
             assert llapi.getElementSort().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "ProductSortHLAPI"})
		public void getElementSort_lists_HLPNListHLAPITest(){
			ProductSort llapi = new TermsFactoryImpl().createProductSort();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getElementSort().add(new ListsFactoryImpl().createHLPNList());
			
			llapi.getElementSort().add(
			   new TermsFactoryImpl().createMultisetSort()
			);
			
			llapi.getElementSort().add(
			   new TermsFactoryImpl().createProductSort()
			);
			
			llapi.getElementSort().add(
			   new TermsFactoryImpl().createUserSort()
			);
			
			llapi.getElementSort().add(
			   new ArbitrarydeclarationsFactoryImpl().createAnySort()
			);
			
			llapi.getElementSort().add(
			   new BooleansFactoryImpl().createBool()
			);
			
			llapi.getElementSort().add(
			   new CyclicEnumerationsFactoryImpl().createCyclicEnumeration()
			);
			
			llapi.getElementSort().add(
			   new DotsFactoryImpl().createDot()
			);
			
			llapi.getElementSort().add(
			   new FiniteEnumerationsFactoryImpl().createFiniteEnumeration()
			);
			
			llapi.getElementSort().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRange()
			);
			
			llapi.getElementSort().add(
			   new IntegersFactoryImpl().createNatural()
			);
			
			llapi.getElementSort().add(
			   new IntegersFactoryImpl().createPositive()
			);
			
			llapi.getElementSort().add(
			   new IntegersFactoryImpl().createHLInteger()
			);
			
			llapi.getElementSort().add(
			   new ListsFactoryImpl().createHLPNList()
			);
			
			llapi.getElementSort().add(
			   new StringsFactoryImpl().createHLPNString()
			);
			
			howmany += 14;

			ProductSortHLAPI elem = new ProductSortHLAPI(llapi);
			List<fr.lip6.move.pnml.hlpn.lists.hlapi.HLPNListHLAPI> totest = elem.getElementSort_lists_HLPNListHLAPI();

			assert totest.size() == howmany + 1 - 14;

			for (SortHLAPI unit : totest) {
             assert llapi.getElementSort().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
		
		/**
		 * This test add a random number (1..10) of wanting output objets
		 * Then add one of all possible objet in the list.
		 * It test the number of wanted objet returned by the methods, and if any object really exist in the original list.
		 */
		@Test(groups = { "hlapi", "ProductSortHLAPI"})
		public void getElementSort_strings_HLPNStringHLAPITest(){
			ProductSort llapi = new TermsFactoryImpl().createProductSort();
			int howmany;

			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getElementSort().add(new StringsFactoryImpl().createHLPNString());
			
			llapi.getElementSort().add(
			   new TermsFactoryImpl().createMultisetSort()
			);
			
			llapi.getElementSort().add(
			   new TermsFactoryImpl().createProductSort()
			);
			
			llapi.getElementSort().add(
			   new TermsFactoryImpl().createUserSort()
			);
			
			llapi.getElementSort().add(
			   new ArbitrarydeclarationsFactoryImpl().createAnySort()
			);
			
			llapi.getElementSort().add(
			   new BooleansFactoryImpl().createBool()
			);
			
			llapi.getElementSort().add(
			   new CyclicEnumerationsFactoryImpl().createCyclicEnumeration()
			);
			
			llapi.getElementSort().add(
			   new DotsFactoryImpl().createDot()
			);
			
			llapi.getElementSort().add(
			   new FiniteEnumerationsFactoryImpl().createFiniteEnumeration()
			);
			
			llapi.getElementSort().add(
			   new FiniteIntRangesFactoryImpl().createFiniteIntRange()
			);
			
			llapi.getElementSort().add(
			   new IntegersFactoryImpl().createNatural()
			);
			
			llapi.getElementSort().add(
			   new IntegersFactoryImpl().createPositive()
			);
			
			llapi.getElementSort().add(
			   new IntegersFactoryImpl().createHLInteger()
			);
			
			llapi.getElementSort().add(
			   new ListsFactoryImpl().createHLPNList()
			);
			
			llapi.getElementSort().add(
			   new StringsFactoryImpl().createHLPNString()
			);
			
			howmany += 14;

			ProductSortHLAPI elem = new ProductSortHLAPI(llapi);
			List<fr.lip6.move.pnml.hlpn.strings.hlapi.HLPNStringHLAPI> totest = elem.getElementSort_strings_HLPNStringHLAPI();

			assert totest.size() == howmany + 1 - 14;

			for (SortHLAPI unit : totest) {
             assert llapi.getElementSort().contains(unit.getContainedItem()) : "missing element";
         }
		}
		
	
	

	//setters/remover for lists.
	
	@Test(groups = { "hlapi", "ProductSortHLAPI"})
	public void addElementSortHLAPITest(){
		ProductSortHLAPI elem = new ProductSortHLAPI(new TermsFactoryImpl().createProductSort());
		int howmany = (int)(Math.random()*10);
		for(int i =0; i<howmany;i++)
			
			elem.addElementSortHLAPI(
				new MultisetSortHLAPI(
					new TermsFactoryImpl().createMultisetSort()
				)
			);
			

		assert elem.getContainedItem().getElementSort().size() == howmany;
	}

	@Test(groups = { "hlapi", "ProductSortHLAPI"})
	public void removeElementSortTest(){
		ProductSortHLAPI elem = new ProductSortHLAPI(new TermsFactoryImpl().createProductSort());
		int howmany = (int)(Math.random()*10);
		int howdiff = (int)(Math.random()*10);

			
			MultisetSortHLAPI sav;
			

		for(int i =0; i<(howmany);i++)
			
			elem.addElementSortHLAPI(
				new MultisetSortHLAPI(
				  new TermsFactoryImpl().createMultisetSort()
				)
			);
			


		
		sav =
			new MultisetSortHLAPI(
			  new TermsFactoryImpl().createMultisetSort()
			);
		

		elem.addElementSortHLAPI(sav);
		assert elem.getContainedItem().getElementSort().size() == howmany+1;

		for(int i =0; i<(howdiff);i++)
			
			elem.addElementSortHLAPI(
				new MultisetSortHLAPI(
				  new TermsFactoryImpl().createMultisetSort()
				)
			);
			


		elem.removeElementSortHLAPI(sav);

		assert elem.getContainedItem().getElementSort().size() == howmany+howdiff;
	}
	

	@Test(groups = { "hlapi", "ProductSortHLAPI"})
	public void equalsTest(){
		ProductSort a = new TermsFactoryImpl().createProductSort();
		ProductSort b = new TermsFactoryImpl().createProductSort();
		ProductSortHLAPI aprime = new ProductSortHLAPI(a);
		ProductSortHLAPI asecond = new ProductSortHLAPI(a);
		ProductSortHLAPI bprime = new ProductSortHLAPI(b);

		assert aprime.equals(asecond);
		assert !aprime.equals(bprime);
	}

	//cloning method
	//public ProductSortHLAPI clone(){
	//	return new ProductSortHLAPI(this);
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
