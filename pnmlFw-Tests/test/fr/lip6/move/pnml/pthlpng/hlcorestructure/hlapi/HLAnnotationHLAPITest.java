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
package fr.lip6.move.pnml.pthlpng.hlcorestructure.hlapi;

import java.util.List;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import fr.lip6.move.pnml.framework.utils.ModelRepository;
import fr.lip6.move.pnml.pthlpng.booleans.impl.BooleansFactoryImpl;
import fr.lip6.move.pnml.pthlpng.dots.impl.DotsFactoryImpl;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.HLAnnotation;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.impl.HlcorestructureFactoryImpl;
import fr.lip6.move.pnml.pthlpng.integers.impl.IntegersFactoryImpl;
import fr.lip6.move.pnml.pthlpng.multisets.impl.MultisetsFactoryImpl;
import fr.lip6.move.pnml.pthlpng.partitions.impl.PartitionsFactoryImpl;
import fr.lip6.move.pnml.pthlpng.terms.hlapi.TermHLAPI;
import fr.lip6.move.pnml.pthlpng.terms.impl.TermsFactoryImpl;
public class HLAnnotationHLAPITest {

	
	private AnnotationGraphicsHLAPI itemannotationgraphics;
		
	private String itemtext;
		
	private TermHLAPI itemstructure;
		
	
	private ArcHLAPI itemcontainerArc;
	


	@AfterTest(groups = { "HLAnnotationHLAPI", "hlapi" })
	public void After() {
	    System.out.println("done for "+"HLAnnotationHLAPI(hlcorestructure)");
	}


	@BeforeMethod(groups = { "HLAnnotationHLAPI", "hlapi" })
	public void setup() throws Exception{
	//ModelRepository.reset(); ModelRepository.getInstance().createDocumentWorkspace("void");
	ModelRepository mr = ModelRepository.getInstance();
	mr.createDocumentWorkspace("void");
	
			
			//HlcorestructureFactoryImpl
			itemannotationgraphics = new AnnotationGraphicsHLAPI(new HlcorestructureFactoryImpl().createAnnotationGraphics());
			
		
			itemtext = "unid";
			
			
				
			itemstructure = new fr.lip6.move.pnml.pthlpng.booleans.hlapi.EqualityHLAPI(
				new BooleansFactoryImpl().createEquality()
			);
				
			
		

	
		
		itemcontainerArc = new ArcHLAPI(new HlcorestructureFactoryImpl().createArc());
		
	
	}

	/**
	 * this constructor allows you to set all 'settable' values
	 * excepted container.
	 */
	@Test(groups = { "hlapi", "HLAnnotationHLAPI"}, dependsOnMethods={"HLAnnotationHLAPI_LLAPI"})
	public void HLAnnotationHLAPI_1(){//BEGIN CONSTRUCTOR BODY
   @SuppressWarnings("unused")
	HLAnnotationHLAPI totest = new HLAnnotationHLAPI(
		itemannotationgraphics
		,	
		itemtext
		,	
		itemstructure
	);
	
	
	
	assert totest.getAnnotationgraphics().equals(itemannotationgraphics.getContainedItem());
	
	
	
	assert totest.getText().equals(itemtext);
	
	
	
	
	assert totest.getStructure().equals(itemstructure.getContainedItem());
	
	
	}

	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "HLAnnotationHLAPI"}, dependsOnMethods={"HLAnnotationHLAPI_LLAPI"})
	public void HLAnnotationHLAPI_2_containerArc(){//BEGIN CONSTRUCTOR BODY

	HLAnnotationHLAPI totest = new HLAnnotationHLAPI(
		itemannotationgraphics
		,	
		itemtext
		,	
		itemstructure
	,	
		itemcontainerArc
	);
	
	
		
			assert totest.getAnnotationgraphics().equals(itemannotationgraphics.getContainedItem());
		
	
	
			assert totest.getText().equals(itemtext);
		
	
	
		
			assert totest.getStructure().equals(itemstructure.getContainedItem());
		
	
	assert totest.getContainerArc().equals(itemcontainerArc.getContainedItem());
	}

	/**
    * This constructor give access to required stuff only (not container if any)
    */

	/**
    * This constructor give access to required stuff only (and container)
    */
   @Test(groups = { "hlapi", "HLAnnotationHLAPI"}, dependsOnMethods={"HLAnnotationHLAPI_LLAPI"})
	public void HLAnnotationHLAPI_4_containerArc(){//BEGIN CONSTRUCTOR BODY

	HLAnnotationHLAPI totest = new HLAnnotationHLAPI(
	  itemcontainerArc
	);

	
	assert totest.getContainerArc().equals(itemcontainerArc.getContainedItem());
	}


	/**
	 * This constructor encapsulate a low level API object in HLAPI.
	 */
	@Test(groups = { "hlapi", "HLAnnotationHLAPI"})
	public void HLAnnotationHLAPI_LLAPI(){
	   HLAnnotation llapi = new HlcorestructureFactoryImpl().createHLAnnotation();
	   fr.lip6.move.pnml.pthlpng.hlcorestructure.hlapi.HLAnnotationHLAPI hlapi = new HLAnnotationHLAPI(llapi);
		assert hlapi.getContainedItem().equals(llapi);
	}

	//getters giving HLAPI object
	

	
		/**
		 * This test add a random number of desired objet in the list or of one of each existing subtypes.
		 * then test how many objet are retuned and if any exist inthe original list.
		 */
		@Test(groups = { "hlapi", "HLAnnotationHLAPI"})
		public void getToolspecificsHLAPITest(){
			HLAnnotation llapi = new HlcorestructureFactoryImpl().createHLAnnotation();
			int howmany;
			
			howmany = (int)(Math.random()*10);
			for(int i =0; i<howmany;i++)
			llapi.getToolspecifics().add(new HlcorestructureFactoryImpl().createToolInfo());
			

			HLAnnotationHLAPI elem = new HLAnnotationHLAPI(llapi);
			List<ToolInfoHLAPI> totest = elem.getToolspecificsHLAPI();

			assert totest.size() == howmany;

			for (ToolInfoHLAPI unit : totest) {
             assert llapi.getToolspecifics().contains(unit.getContainedItem()) : "missing element";
         }
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "HLAnnotationHLAPI"})
		public void getAnnotationgraphicsHLAPITest(){
			HLAnnotationHLAPI elem = new HLAnnotationHLAPI(new HlcorestructureFactoryImpl().createHLAnnotation());

			
				elem.setAnnotationgraphicsHLAPI(itemannotationgraphics);
				AnnotationGraphicsHLAPI totest = elem.getAnnotationgraphicsHLAPI();
				assert totest.getContainedItem().equals(elem.getAnnotationgraphics());
			
		}
	
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "HLAnnotationHLAPI"})
		public void getStructureHLAPITest(){
			HLAnnotationHLAPI elem = new HLAnnotationHLAPI(new HlcorestructureFactoryImpl().createHLAnnotation());

			
				elem.setStructureHLAPI(new fr.lip6.move.pnml.pthlpng.booleans.hlapi.EqualityHLAPI(new BooleansFactoryImpl().createEquality()));
				TermHLAPI totest_booleans_Equality = elem.getStructureHLAPI();
				assert totest_booleans_Equality.getContainedItem().equals(elem.getStructure());
			
				elem.setStructureHLAPI(new fr.lip6.move.pnml.pthlpng.booleans.hlapi.InequalityHLAPI(new BooleansFactoryImpl().createInequality()));
				TermHLAPI totest_booleans_Inequality = elem.getStructureHLAPI();
				assert totest_booleans_Inequality.getContainedItem().equals(elem.getStructure());
			
				elem.setStructureHLAPI(new fr.lip6.move.pnml.pthlpng.booleans.hlapi.BooleanConstantHLAPI(new BooleansFactoryImpl().createBooleanConstant()));
				TermHLAPI totest_booleans_BooleanConstant = elem.getStructureHLAPI();
				assert totest_booleans_BooleanConstant.getContainedItem().equals(elem.getStructure());
			
				elem.setStructureHLAPI(new fr.lip6.move.pnml.pthlpng.booleans.hlapi.OrHLAPI(new BooleansFactoryImpl().createOr()));
				TermHLAPI totest_booleans_Or = elem.getStructureHLAPI();
				assert totest_booleans_Or.getContainedItem().equals(elem.getStructure());
			
				elem.setStructureHLAPI(new fr.lip6.move.pnml.pthlpng.booleans.hlapi.AndHLAPI(new BooleansFactoryImpl().createAnd()));
				TermHLAPI totest_booleans_And = elem.getStructureHLAPI();
				assert totest_booleans_And.getContainedItem().equals(elem.getStructure());
			
				elem.setStructureHLAPI(new fr.lip6.move.pnml.pthlpng.booleans.hlapi.ImplyHLAPI(new BooleansFactoryImpl().createImply()));
				TermHLAPI totest_booleans_Imply = elem.getStructureHLAPI();
				assert totest_booleans_Imply.getContainedItem().equals(elem.getStructure());
			
				elem.setStructureHLAPI(new fr.lip6.move.pnml.pthlpng.booleans.hlapi.NotHLAPI(new BooleansFactoryImpl().createNot()));
				TermHLAPI totest_booleans_Not = elem.getStructureHLAPI();
				assert totest_booleans_Not.getContainedItem().equals(elem.getStructure());
			
				elem.setStructureHLAPI(new fr.lip6.move.pnml.pthlpng.dots.hlapi.DotConstantHLAPI(new DotsFactoryImpl().createDotConstant()));
				TermHLAPI totest_dots_DotConstant = elem.getStructureHLAPI();
				assert totest_dots_DotConstant.getContainedItem().equals(elem.getStructure());
			
				elem.setStructureHLAPI(new fr.lip6.move.pnml.pthlpng.integers.hlapi.NumberConstantHLAPI(new IntegersFactoryImpl().createNumberConstant()));
				TermHLAPI totest_integers_NumberConstant = elem.getStructureHLAPI();
				assert totest_integers_NumberConstant.getContainedItem().equals(elem.getStructure());
			
				elem.setStructureHLAPI(new fr.lip6.move.pnml.pthlpng.integers.hlapi.AdditionHLAPI(new IntegersFactoryImpl().createAddition()));
				TermHLAPI totest_integers_Addition = elem.getStructureHLAPI();
				assert totest_integers_Addition.getContainedItem().equals(elem.getStructure());
			
				elem.setStructureHLAPI(new fr.lip6.move.pnml.pthlpng.integers.hlapi.SubtractionHLAPI(new IntegersFactoryImpl().createSubtraction()));
				TermHLAPI totest_integers_Subtraction = elem.getStructureHLAPI();
				assert totest_integers_Subtraction.getContainedItem().equals(elem.getStructure());
			
				elem.setStructureHLAPI(new fr.lip6.move.pnml.pthlpng.integers.hlapi.MultiplicationHLAPI(new IntegersFactoryImpl().createMultiplication()));
				TermHLAPI totest_integers_Multiplication = elem.getStructureHLAPI();
				assert totest_integers_Multiplication.getContainedItem().equals(elem.getStructure());
			
				elem.setStructureHLAPI(new fr.lip6.move.pnml.pthlpng.integers.hlapi.DivisionHLAPI(new IntegersFactoryImpl().createDivision()));
				TermHLAPI totest_integers_Division = elem.getStructureHLAPI();
				assert totest_integers_Division.getContainedItem().equals(elem.getStructure());
			
				elem.setStructureHLAPI(new fr.lip6.move.pnml.pthlpng.integers.hlapi.ModuloHLAPI(new IntegersFactoryImpl().createModulo()));
				TermHLAPI totest_integers_Modulo = elem.getStructureHLAPI();
				assert totest_integers_Modulo.getContainedItem().equals(elem.getStructure());
			
				elem.setStructureHLAPI(new fr.lip6.move.pnml.pthlpng.integers.hlapi.GreaterThanHLAPI(new IntegersFactoryImpl().createGreaterThan()));
				TermHLAPI totest_integers_GreaterThan = elem.getStructureHLAPI();
				assert totest_integers_GreaterThan.getContainedItem().equals(elem.getStructure());
			
				elem.setStructureHLAPI(new fr.lip6.move.pnml.pthlpng.integers.hlapi.GreaterThanOrEqualHLAPI(new IntegersFactoryImpl().createGreaterThanOrEqual()));
				TermHLAPI totest_integers_GreaterThanOrEqual = elem.getStructureHLAPI();
				assert totest_integers_GreaterThanOrEqual.getContainedItem().equals(elem.getStructure());
			
				elem.setStructureHLAPI(new fr.lip6.move.pnml.pthlpng.integers.hlapi.LessThanHLAPI(new IntegersFactoryImpl().createLessThan()));
				TermHLAPI totest_integers_LessThan = elem.getStructureHLAPI();
				assert totest_integers_LessThan.getContainedItem().equals(elem.getStructure());
			
				elem.setStructureHLAPI(new fr.lip6.move.pnml.pthlpng.integers.hlapi.LessThanOrEqualHLAPI(new IntegersFactoryImpl().createLessThanOrEqual()));
				TermHLAPI totest_integers_LessThanOrEqual = elem.getStructureHLAPI();
				assert totest_integers_LessThanOrEqual.getContainedItem().equals(elem.getStructure());
			
				elem.setStructureHLAPI(new fr.lip6.move.pnml.pthlpng.multisets.hlapi.CardinalityHLAPI(new MultisetsFactoryImpl().createCardinality()));
				TermHLAPI totest_multisets_Cardinality = elem.getStructureHLAPI();
				assert totest_multisets_Cardinality.getContainedItem().equals(elem.getStructure());
			
				elem.setStructureHLAPI(new fr.lip6.move.pnml.pthlpng.multisets.hlapi.ContainsHLAPI(new MultisetsFactoryImpl().createContains()));
				TermHLAPI totest_multisets_Contains = elem.getStructureHLAPI();
				assert totest_multisets_Contains.getContainedItem().equals(elem.getStructure());
			
				elem.setStructureHLAPI(new fr.lip6.move.pnml.pthlpng.multisets.hlapi.CardinalityOfHLAPI(new MultisetsFactoryImpl().createCardinalityOf()));
				TermHLAPI totest_multisets_CardinalityOf = elem.getStructureHLAPI();
				assert totest_multisets_CardinalityOf.getContainedItem().equals(elem.getStructure());
			
				elem.setStructureHLAPI(new fr.lip6.move.pnml.pthlpng.multisets.hlapi.AddHLAPI(new MultisetsFactoryImpl().createAdd()));
				TermHLAPI totest_multisets_Add = elem.getStructureHLAPI();
				assert totest_multisets_Add.getContainedItem().equals(elem.getStructure());
			
				elem.setStructureHLAPI(new fr.lip6.move.pnml.pthlpng.multisets.hlapi.AllHLAPI(new MultisetsFactoryImpl().createAll()));
				TermHLAPI totest_multisets_All = elem.getStructureHLAPI();
				assert totest_multisets_All.getContainedItem().equals(elem.getStructure());
			
				elem.setStructureHLAPI(new fr.lip6.move.pnml.pthlpng.multisets.hlapi.EmptyHLAPI(new MultisetsFactoryImpl().createEmpty()));
				TermHLAPI totest_multisets_Empty = elem.getStructureHLAPI();
				assert totest_multisets_Empty.getContainedItem().equals(elem.getStructure());
			
				elem.setStructureHLAPI(new fr.lip6.move.pnml.pthlpng.multisets.hlapi.NumberOfHLAPI(new MultisetsFactoryImpl().createNumberOf()));
				TermHLAPI totest_multisets_NumberOf = elem.getStructureHLAPI();
				assert totest_multisets_NumberOf.getContainedItem().equals(elem.getStructure());
			
				elem.setStructureHLAPI(new fr.lip6.move.pnml.pthlpng.multisets.hlapi.SubtractHLAPI(new MultisetsFactoryImpl().createSubtract()));
				TermHLAPI totest_multisets_Subtract = elem.getStructureHLAPI();
				assert totest_multisets_Subtract.getContainedItem().equals(elem.getStructure());
			
				elem.setStructureHLAPI(new fr.lip6.move.pnml.pthlpng.multisets.hlapi.ScalarProductHLAPI(new MultisetsFactoryImpl().createScalarProduct()));
				TermHLAPI totest_multisets_ScalarProduct = elem.getStructureHLAPI();
				assert totest_multisets_ScalarProduct.getContainedItem().equals(elem.getStructure());
			
				elem.setStructureHLAPI(new fr.lip6.move.pnml.pthlpng.partitions.hlapi.GreaterThanHLAPI(new PartitionsFactoryImpl().createGreaterThan()));
				TermHLAPI totest_partitions_GreaterThan = elem.getStructureHLAPI();
				assert totest_partitions_GreaterThan.getContainedItem().equals(elem.getStructure());
			
				elem.setStructureHLAPI(new fr.lip6.move.pnml.pthlpng.partitions.hlapi.PartitionElementOfHLAPI(new PartitionsFactoryImpl().createPartitionElementOf()));
				TermHLAPI totest_partitions_PartitionElementOf = elem.getStructureHLAPI();
				assert totest_partitions_PartitionElementOf.getContainedItem().equals(elem.getStructure());
			
				elem.setStructureHLAPI(new fr.lip6.move.pnml.pthlpng.partitions.hlapi.LessThanHLAPI(new PartitionsFactoryImpl().createLessThan()));
				TermHLAPI totest_partitions_LessThan = elem.getStructureHLAPI();
				assert totest_partitions_LessThan.getContainedItem().equals(elem.getStructure());
			
				elem.setStructureHLAPI(new fr.lip6.move.pnml.pthlpng.terms.hlapi.VariableHLAPI(new TermsFactoryImpl().createVariable()));
				TermHLAPI totest_terms_Variable = elem.getStructureHLAPI();
				assert totest_terms_Variable.getContainedItem().equals(elem.getStructure());
			
				elem.setStructureHLAPI(new fr.lip6.move.pnml.pthlpng.terms.hlapi.TupleHLAPI(new TermsFactoryImpl().createTuple()));
				TermHLAPI totest_terms_Tuple = elem.getStructureHLAPI();
				assert totest_terms_Tuple.getContainedItem().equals(elem.getStructure());
			
				elem.setStructureHLAPI(new fr.lip6.move.pnml.pthlpng.terms.hlapi.UserOperatorHLAPI(new TermsFactoryImpl().createUserOperator()));
				TermHLAPI totest_terms_UserOperator = elem.getStructureHLAPI();
				assert totest_terms_UserOperator.getContainedItem().equals(elem.getStructure());
			
		}
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "HLAnnotationHLAPI"})
		public void getContainerArcHLAPITest(){
			HLAnnotationHLAPI elem = new HLAnnotationHLAPI(new HlcorestructureFactoryImpl().createHLAnnotation());

			
				elem.setContainerArcHLAPI(itemcontainerArc);
				ArcHLAPI totest = elem.getContainerArcHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerArc());
			
		}
	

	//Special getter for list of generics object, return only one object type.
	
	
	
	
	

	//setters/remover for lists.
	
	@Test(groups = { "hlapi", "HLAnnotationHLAPI"})
	public void addToolspecificsHLAPITest(){
		HLAnnotationHLAPI elem = new HLAnnotationHLAPI(new HlcorestructureFactoryImpl().createHLAnnotation());
		int howmany = (int)(Math.random()*10);
		for(int i =0; i<howmany;i++)
			
			elem.addToolspecificsHLAPI(new ToolInfoHLAPI(new HlcorestructureFactoryImpl().createToolInfo()));
			

		assert elem.getContainedItem().getToolspecifics().size() == howmany;
	}

	@Test(groups = { "hlapi", "HLAnnotationHLAPI"})
	public void removeToolspecificsTest(){
		HLAnnotationHLAPI elem = new HLAnnotationHLAPI(new HlcorestructureFactoryImpl().createHLAnnotation());
		int howmany = (int)(Math.random()*10);
		int howdiff = (int)(Math.random()*10);

			
			ToolInfoHLAPI sav;

		for(int i =0; i<(howmany);i++)
			
			elem.addToolspecificsHLAPI(new ToolInfoHLAPI(new HlcorestructureFactoryImpl().createToolInfo()));
			


		
		sav = new ToolInfoHLAPI(new HlcorestructureFactoryImpl().createToolInfo());
		

		elem.addToolspecificsHLAPI(sav);
		assert elem.getContainedItem().getToolspecifics().size() == howmany+1;

		for(int i =0; i<(howdiff);i++)
			
			elem.addToolspecificsHLAPI(new ToolInfoHLAPI(new HlcorestructureFactoryImpl().createToolInfo()));
			


		elem.removeToolspecificsHLAPI(sav);

		assert elem.getContainedItem().getToolspecifics().size() == howmany+howdiff;
	}
	

	@Test(groups = { "hlapi", "HLAnnotationHLAPI"})
	public void equalsTest(){
		HLAnnotation a = new HlcorestructureFactoryImpl().createHLAnnotation();
		HLAnnotation b = new HlcorestructureFactoryImpl().createHLAnnotation();
		HLAnnotationHLAPI aprime = new HLAnnotationHLAPI(a);
		HLAnnotationHLAPI asecond = new HLAnnotationHLAPI(a);
		HLAnnotationHLAPI bprime = new HLAnnotationHLAPI(b);

		assert aprime.equals(asecond);
		assert !aprime.equals(bprime);
	}

	//cloning method
	//public HLAnnotationHLAPI clone(){
	//	return new HLAnnotationHLAPI(this);
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
