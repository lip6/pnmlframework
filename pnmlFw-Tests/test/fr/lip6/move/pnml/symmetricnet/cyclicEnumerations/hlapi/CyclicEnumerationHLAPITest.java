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
 * $Id ggiffo, Wed Feb 10 14:59:11 CET 2016$
 */
package fr.lip6.move.pnml.symmetricnet.cyclicEnumerations.hlapi;

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

import fr.lip6.move.pnml.symmetricnet.cyclicEnumerations.impl.CyclicEnumerationsFactoryImpl;

import fr.lip6.move.pnml.symmetricnet.dots.impl.DotsFactoryImpl;

import fr.lip6.move.pnml.symmetricnet.finiteEnumerations.FEConstant;

import fr.lip6.move.pnml.symmetricnet.finiteEnumerations.impl.FiniteEnumerationsFactoryImpl;

import fr.lip6.move.pnml.symmetricnet.finiteIntRanges.impl.FiniteIntRangesFactoryImpl;

import fr.lip6.move.pnml.symmetricnet.hlcorestructure.Condition;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.HLAnnotation;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.HLMarking;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.Type;

import fr.lip6.move.pnml.symmetricnet.hlcorestructure.impl.HlcorestructureFactoryImpl;

import fr.lip6.move.pnml.symmetricnet.integers.impl.IntegersFactoryImpl;

import fr.lip6.move.pnml.symmetricnet.multisets.All;
import fr.lip6.move.pnml.symmetricnet.multisets.Empty;

import fr.lip6.move.pnml.symmetricnet.multisets.impl.MultisetsFactoryImpl;

import fr.lip6.move.pnml.symmetricnet.partitions.Partition;
import fr.lip6.move.pnml.symmetricnet.partitions.PartitionElement;

import fr.lip6.move.pnml.symmetricnet.partitions.impl.PartitionsFactoryImpl;

import fr.lip6.move.pnml.symmetricnet.terms.MultisetSort;
import fr.lip6.move.pnml.symmetricnet.terms.NamedOperator;
import fr.lip6.move.pnml.symmetricnet.terms.NamedSort;
import fr.lip6.move.pnml.symmetricnet.terms.Operator;
import fr.lip6.move.pnml.symmetricnet.terms.ProductSort;
import fr.lip6.move.pnml.symmetricnet.terms.Sort;
import fr.lip6.move.pnml.symmetricnet.terms.Term;
import fr.lip6.move.pnml.symmetricnet.terms.VariableDecl;

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
import fr.lip6.move.pnml.symmetricnet.cyclicEnumerations.*;
import fr.lip6.move.pnml.symmetricnet.cyclicEnumerations.impl.*;
import fr.lip6.move.pnml.framework.utils.exception.InnerBuildException;
import fr.lip6.move.pnml.framework.utils.exception.InvalidIDException;
import fr.lip6.move.pnml.framework.utils.exception.VoidRepositoryException;
import fr.lip6.move.pnml.framework.utils.IdRepository;
import fr.lip6.move.pnml.framework.utils.ModelRepository;
import org.testng.annotations.*;
public class CyclicEnumerationHLAPITest {

	
	
	private MultisetSortHLAPI itemmulti;
	
	private NamedSortHLAPI itemcontainerNamedSort;
	
	private VariableDeclHLAPI itemcontainerVariableDecl;
	
	private ProductSortHLAPI itemcontainerProductSort;
	
	private TypeHLAPI itemcontainerType;
	
	private AllHLAPI itemcontainerAll;
	
	private EmptyHLAPI itemcontainerEmpty;
	
	private PartitionHLAPI itemcontainerPartition;
	


	@AfterTest(groups = { "CyclicEnumerationHLAPI", "hlapi" })
	public void After() {
	    System.out.println("done for "+"CyclicEnumerationHLAPI(cyclicEnumerations)");
	}


	@BeforeMethod(groups = { "CyclicEnumerationHLAPI", "hlapi" })
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
		
	
	}

	/**
	 * this constructor allows you to set all 'settable' values
	 * excepted container.
	 */
	@Test(groups = { "hlapi", "CyclicEnumerationHLAPI"}, dependsOnMethods={"CyclicEnumerationHLAPI_LLAPI"})
	public void CyclicEnumerationHLAPI_1(){//BEGIN CONSTRUCTOR BODY
   @SuppressWarnings("unused")
	CyclicEnumerationHLAPI totest = new CyclicEnumerationHLAPI();
	
	}

	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "CyclicEnumerationHLAPI"}, dependsOnMethods={"CyclicEnumerationHLAPI_LLAPI"})
	public void CyclicEnumerationHLAPI_2_multi(){//BEGIN CONSTRUCTOR BODY

	CyclicEnumerationHLAPI totest = new CyclicEnumerationHLAPI(
		itemmulti
	);
	
	assert totest.getMulti().equals(itemmulti.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "CyclicEnumerationHLAPI"}, dependsOnMethods={"CyclicEnumerationHLAPI_LLAPI"})
	public void CyclicEnumerationHLAPI_2_containerNamedSort(){//BEGIN CONSTRUCTOR BODY

	CyclicEnumerationHLAPI totest = new CyclicEnumerationHLAPI(
		itemcontainerNamedSort
	);
	
	assert totest.getContainerNamedSort().equals(itemcontainerNamedSort.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "CyclicEnumerationHLAPI"}, dependsOnMethods={"CyclicEnumerationHLAPI_LLAPI"})
	public void CyclicEnumerationHLAPI_2_containerVariableDecl(){//BEGIN CONSTRUCTOR BODY

	CyclicEnumerationHLAPI totest = new CyclicEnumerationHLAPI(
		itemcontainerVariableDecl
	);
	
	assert totest.getContainerVariableDecl().equals(itemcontainerVariableDecl.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "CyclicEnumerationHLAPI"}, dependsOnMethods={"CyclicEnumerationHLAPI_LLAPI"})
	public void CyclicEnumerationHLAPI_2_containerProductSort(){//BEGIN CONSTRUCTOR BODY

	CyclicEnumerationHLAPI totest = new CyclicEnumerationHLAPI(
		itemcontainerProductSort
	);
	
	assert totest.getContainerProductSort().equals(itemcontainerProductSort.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "CyclicEnumerationHLAPI"}, dependsOnMethods={"CyclicEnumerationHLAPI_LLAPI"})
	public void CyclicEnumerationHLAPI_2_containerType(){//BEGIN CONSTRUCTOR BODY

	CyclicEnumerationHLAPI totest = new CyclicEnumerationHLAPI(
		itemcontainerType
	);
	
	assert totest.getContainerType().equals(itemcontainerType.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "CyclicEnumerationHLAPI"}, dependsOnMethods={"CyclicEnumerationHLAPI_LLAPI"})
	public void CyclicEnumerationHLAPI_2_containerAll(){//BEGIN CONSTRUCTOR BODY

	CyclicEnumerationHLAPI totest = new CyclicEnumerationHLAPI(
		itemcontainerAll
	);
	
	assert totest.getContainerAll().equals(itemcontainerAll.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "CyclicEnumerationHLAPI"}, dependsOnMethods={"CyclicEnumerationHLAPI_LLAPI"})
	public void CyclicEnumerationHLAPI_2_containerEmpty(){//BEGIN CONSTRUCTOR BODY

	CyclicEnumerationHLAPI totest = new CyclicEnumerationHLAPI(
		itemcontainerEmpty
	);
	
	assert totest.getContainerEmpty().equals(itemcontainerEmpty.getContainedItem());
	}
	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "CyclicEnumerationHLAPI"}, dependsOnMethods={"CyclicEnumerationHLAPI_LLAPI"})
	public void CyclicEnumerationHLAPI_2_containerPartition(){//BEGIN CONSTRUCTOR BODY

	CyclicEnumerationHLAPI totest = new CyclicEnumerationHLAPI(
		itemcontainerPartition
	);
	
	assert totest.getContainerPartition().equals(itemcontainerPartition.getContainedItem());
	}

	/**
    * This constructor give access to required stuff only (not container if any)
    */



	/**
	 * This constructor encapsulate a low level API object in HLAPI.
	 */
	@Test(groups = { "hlapi", "CyclicEnumerationHLAPI"})
	public void CyclicEnumerationHLAPI_LLAPI(){
	   CyclicEnumeration llapi = new CyclicEnumerationsFactoryImpl().createCyclicEnumeration();
	   fr.lip6.move.pnml.symmetricnet.cyclicEnumerations.hlapi.CyclicEnumerationHLAPI hlapi = new CyclicEnumerationHLAPI(llapi);
		assert hlapi.getContainedItem().equals(llapi);
	}

	//getters giving HLAPI object
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "CyclicEnumerationHLAPI"})
		public void getMultiHLAPITest(){
			CyclicEnumerationHLAPI elem = new CyclicEnumerationHLAPI(new CyclicEnumerationsFactoryImpl().createCyclicEnumeration());

			
				elem.setMultiHLAPI(itemmulti);
				MultisetSortHLAPI totest = elem.getMultiHLAPI();
				assert totest.getContainedItem().equals(elem.getMulti());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "CyclicEnumerationHLAPI"})
		public void getContainerNamedSortHLAPITest(){
			CyclicEnumerationHLAPI elem = new CyclicEnumerationHLAPI(new CyclicEnumerationsFactoryImpl().createCyclicEnumeration());

			
				elem.setContainerNamedSortHLAPI(itemcontainerNamedSort);
				NamedSortHLAPI totest = elem.getContainerNamedSortHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerNamedSort());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "CyclicEnumerationHLAPI"})
		public void getContainerVariableDeclHLAPITest(){
			CyclicEnumerationHLAPI elem = new CyclicEnumerationHLAPI(new CyclicEnumerationsFactoryImpl().createCyclicEnumeration());

			
				elem.setContainerVariableDeclHLAPI(itemcontainerVariableDecl);
				VariableDeclHLAPI totest = elem.getContainerVariableDeclHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerVariableDecl());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "CyclicEnumerationHLAPI"})
		public void getContainerProductSortHLAPITest(){
			CyclicEnumerationHLAPI elem = new CyclicEnumerationHLAPI(new CyclicEnumerationsFactoryImpl().createCyclicEnumeration());

			
				elem.setContainerProductSortHLAPI(itemcontainerProductSort);
				ProductSortHLAPI totest = elem.getContainerProductSortHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerProductSort());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "CyclicEnumerationHLAPI"})
		public void getContainerTypeHLAPITest(){
			CyclicEnumerationHLAPI elem = new CyclicEnumerationHLAPI(new CyclicEnumerationsFactoryImpl().createCyclicEnumeration());

			
				elem.setContainerTypeHLAPI(itemcontainerType);
				TypeHLAPI totest = elem.getContainerTypeHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerType());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "CyclicEnumerationHLAPI"})
		public void getContainerAllHLAPITest(){
			CyclicEnumerationHLAPI elem = new CyclicEnumerationHLAPI(new CyclicEnumerationsFactoryImpl().createCyclicEnumeration());

			
				elem.setContainerAllHLAPI(itemcontainerAll);
				AllHLAPI totest = elem.getContainerAllHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerAll());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "CyclicEnumerationHLAPI"})
		public void getContainerEmptyHLAPITest(){
			CyclicEnumerationHLAPI elem = new CyclicEnumerationHLAPI(new CyclicEnumerationsFactoryImpl().createCyclicEnumeration());

			
				elem.setContainerEmptyHLAPI(itemcontainerEmpty);
				EmptyHLAPI totest = elem.getContainerEmptyHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerEmpty());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "CyclicEnumerationHLAPI"})
		public void getContainerPartitionHLAPITest(){
			CyclicEnumerationHLAPI elem = new CyclicEnumerationHLAPI(new CyclicEnumerationsFactoryImpl().createCyclicEnumeration());

			
				elem.setContainerPartitionHLAPI(itemcontainerPartition);
				PartitionHLAPI totest = elem.getContainerPartitionHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerPartition());
			
		}
	
	

	
		/**
		 * This test add a random number of desired objet in the list or of one of each existing subtypes.
		 * then test how many objet are retuned and if any exist inthe original list.
		 */
		@Test(groups = { "hlapi", "CyclicEnumerationHLAPI"})
		public void getElementsHLAPITest(){
			CyclicEnumeration llapi = new CyclicEnumerationsFactoryImpl().createCyclicEnumeration();
			int howmany;
			
			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getElements().add(new FiniteEnumerationsFactoryImpl().createFEConstant());
			

			CyclicEnumerationHLAPI elem = new CyclicEnumerationHLAPI(llapi);
			List<FEConstantHLAPI> totest = elem.getElementsHLAPI();

			assert totest.size() == howmany;

			for (FEConstantHLAPI unit : totest) {
             assert llapi.getElements().contains(unit.getContainedItem()) : "missing element";
         }
		}
	

	//Special getter for list of generics object, return only one object type.
	
	
	
	
	
	
	
	
	
	

	//setters/remover for lists.
	
	@Test(groups = { "hlapi", "CyclicEnumerationHLAPI"})
	public void addElementsHLAPITest(){
		CyclicEnumerationHLAPI elem = new CyclicEnumerationHLAPI(new CyclicEnumerationsFactoryImpl().createCyclicEnumeration());
		int howmany = (int)(Math.random()*10);
		for(int i =0; i<howmany;i++)
			
			elem.addElementsHLAPI(new FEConstantHLAPI(new FiniteEnumerationsFactoryImpl().createFEConstant()));
			

		assert elem.getContainedItem().getElements().size() == howmany;
	}

	@Test(groups = { "hlapi", "CyclicEnumerationHLAPI"})
	public void removeElementsTest(){
		CyclicEnumerationHLAPI elem = new CyclicEnumerationHLAPI(new CyclicEnumerationsFactoryImpl().createCyclicEnumeration());
		int howmany = (int)(Math.random()*10);
		int howdiff = (int)(Math.random()*10);

			
			FEConstantHLAPI sav;

		for(int i =0; i<(howmany);i++)
			
			elem.addElementsHLAPI(new FEConstantHLAPI(new FiniteEnumerationsFactoryImpl().createFEConstant()));
			


		
		sav = new FEConstantHLAPI(new FiniteEnumerationsFactoryImpl().createFEConstant());
		

		elem.addElementsHLAPI(sav);
		assert elem.getContainedItem().getElements().size() == howmany+1;

		for(int i =0; i<(howdiff);i++)
			
			elem.addElementsHLAPI(new FEConstantHLAPI(new FiniteEnumerationsFactoryImpl().createFEConstant()));
			


		elem.removeElementsHLAPI(sav);

		assert elem.getContainedItem().getElements().size() == howmany+howdiff;
	}
	

	@Test(groups = { "hlapi", "CyclicEnumerationHLAPI"})
	public void equalsTest(){
		CyclicEnumeration a = new CyclicEnumerationsFactoryImpl().createCyclicEnumeration();
		CyclicEnumeration b = new CyclicEnumerationsFactoryImpl().createCyclicEnumeration();
		CyclicEnumerationHLAPI aprime = new CyclicEnumerationHLAPI(a);
		CyclicEnumerationHLAPI asecond = new CyclicEnumerationHLAPI(a);
		CyclicEnumerationHLAPI bprime = new CyclicEnumerationHLAPI(b);

		assert aprime.equals(asecond);
		assert !aprime.equals(bprime);
	}

	//cloning method
	//public CyclicEnumerationHLAPI clone(){
	//	return new CyclicEnumerationHLAPI(this);
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
