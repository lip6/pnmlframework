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
 * $Id ggiffo, Thu Jan 02 00:08:26 CET 2014$
 */
package fr.lip6.move.pnml.ptnet.hlapi;

import fr.lip6.move.pnml.ptnet.Annotation;
import fr.lip6.move.pnml.ptnet.AnnotationGraphics;
import fr.lip6.move.pnml.ptnet.AnyObject;
import fr.lip6.move.pnml.ptnet.Arc;
import fr.lip6.move.pnml.ptnet.ArcGraphics;
import fr.lip6.move.pnml.ptnet.CSS2Color;
import fr.lip6.move.pnml.ptnet.CSS2FontFamily;
import fr.lip6.move.pnml.ptnet.CSS2FontSize;
import fr.lip6.move.pnml.ptnet.CSS2FontStyle;
import fr.lip6.move.pnml.ptnet.CSS2FontWeight;
import fr.lip6.move.pnml.ptnet.Dimension;
import fr.lip6.move.pnml.ptnet.Fill;
import fr.lip6.move.pnml.ptnet.Font;
import fr.lip6.move.pnml.ptnet.FontAlign;
import fr.lip6.move.pnml.ptnet.FontDecoration;
import fr.lip6.move.pnml.ptnet.Gradient;
import fr.lip6.move.pnml.ptnet.Label;
import fr.lip6.move.pnml.ptnet.Line;
import fr.lip6.move.pnml.ptnet.LineShape;
import fr.lip6.move.pnml.ptnet.LineStyle;
import fr.lip6.move.pnml.ptnet.Name;
import fr.lip6.move.pnml.ptnet.Node;
import fr.lip6.move.pnml.ptnet.NodeGraphics;
import fr.lip6.move.pnml.ptnet.Offset;
import fr.lip6.move.pnml.ptnet.PNType;
import fr.lip6.move.pnml.ptnet.PTArcAnnotation;
import fr.lip6.move.pnml.ptnet.PTMarking;
import fr.lip6.move.pnml.ptnet.Page;
import fr.lip6.move.pnml.ptnet.PetriNet;
import fr.lip6.move.pnml.ptnet.PetriNetDoc;
import fr.lip6.move.pnml.ptnet.Place;
import fr.lip6.move.pnml.ptnet.PnObject;
import fr.lip6.move.pnml.ptnet.Position;
import fr.lip6.move.pnml.ptnet.ToolInfo;

import fr.lip6.move.pnml.ptnet.impl.PtnetFactoryImpl;

import java.math.BigDecimal;

import java.net.URI;

import java.util.List;

import  fr.lip6.move.pnml.framework.hlapi.*;
import fr.lip6.move.pnml.ptnet.hlapi.*;

import java.util.ArrayList;
import java.util.List;
import org.apache.axiom.om.*;
import fr.lip6.move.pnml.framework.utils.IdRefLinker;
import org.eclipse.emf.common.util.DiagnosticChain;
import fr.lip6.move.pnml.ptnet.*;
import fr.lip6.move.pnml.ptnet.impl.*;
import fr.lip6.move.pnml.framework.utils.exception.InnerBuildException;
import fr.lip6.move.pnml.framework.utils.exception.InvalidIDException;
import fr.lip6.move.pnml.framework.utils.exception.VoidRepositoryException;
import fr.lip6.move.pnml.framework.utils.IdRepository;
import fr.lip6.move.pnml.framework.utils.ModelRepository;
import org.testng.annotations.*;
public class FontHLAPITest {

	
	private FontAlignHLAPI itemalign;
		
	private FontDecorationHLAPI itemdecoration;
		
	private CSS2FontFamilyHLAPI itemfamily;
		
	private BigDecimal itemrotation;
		
	private CSS2FontSizeHLAPI itemsize;
		
	private CSS2FontStyleHLAPI itemstyle;
		
	private CSS2FontWeightHLAPI itemweight;
		
	
	private AnnotationGraphicsHLAPI itemcontainerAnnotationGraphics;
	


	@AfterTest(groups = { "FontHLAPI", "hlapi" })
	public void After() {
	    System.out.println("done for "+"FontHLAPI(ptnet)");
	}


	@BeforeMethod(groups = { "FontHLAPI", "hlapi" })
	public void setup() throws Exception{
	//ModelRepository.reset(); ModelRepository.getInstance().createDocumentWorkspace("void");
	ModelRepository mr = ModelRepository.getInstance();
	mr.createDocumentWorkspace("void");
	
		itemalign = FontAlignHLAPI.get(0);
		
		itemdecoration = FontDecorationHLAPI.get(0);
		
		itemfamily = CSS2FontFamilyHLAPI.get(0);
		
			itemrotation = new BigDecimal("0");
			
		itemsize = CSS2FontSizeHLAPI.get(0);
		
		itemstyle = CSS2FontStyleHLAPI.get(0);
		
		itemweight = CSS2FontWeightHLAPI.get(0);
		

	
		
		itemcontainerAnnotationGraphics = new AnnotationGraphicsHLAPI(new PtnetFactoryImpl().createAnnotationGraphics());
		
	
	}

	/**
	 * this constructor allows you to set all 'settable' values
	 * excepted container.
	 */
	@Test(groups = { "hlapi", "FontHLAPI"}, dependsOnMethods={"FontHLAPI_LLAPI"})
	public void FontHLAPI_1(){//BEGIN CONSTRUCTOR BODY
   @SuppressWarnings("unused")
	FontHLAPI totest = new FontHLAPI(
		itemalign
		,	
		itemdecoration
		,	
		itemfamily
		,	
		itemrotation
		,	
		itemsize
		,	
		itemstyle
		,	
		itemweight
	);
	
	
	
	
	
	
	
	
	assert totest.getRotation().equals(itemrotation);
	
	
	
	
	
	
	
	
	}

	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	@Test(groups = { "hlapi", "FontHLAPI"}, dependsOnMethods={"FontHLAPI_LLAPI"})
	public void FontHLAPI_2_containerAnnotationGraphics(){//BEGIN CONSTRUCTOR BODY

	FontHLAPI totest = new FontHLAPI(
		itemalign
		,	
		itemdecoration
		,	
		itemfamily
		,	
		itemrotation
		,	
		itemsize
		,	
		itemstyle
		,	
		itemweight
	,	
		itemcontainerAnnotationGraphics
	);
	
	
		
	
		
	
		
	
			assert totest.getRotation().equals(itemrotation);
		
	
	
		
	
		
	
		
	assert totest.getContainerAnnotationGraphics().equals(itemcontainerAnnotationGraphics.getContainedItem());
	}

	/**
    * This constructor give access to required stuff only (not container if any)
    */

	/**
    * This constructor give access to required stuff only (and container)
    */
   @Test(groups = { "hlapi", "FontHLAPI"}, dependsOnMethods={"FontHLAPI_LLAPI"})
	public void FontHLAPI_4_containerAnnotationGraphics(){//BEGIN CONSTRUCTOR BODY

	FontHLAPI totest = new FontHLAPI(
	  itemcontainerAnnotationGraphics
	);

	
	assert totest.getContainerAnnotationGraphics().equals(itemcontainerAnnotationGraphics.getContainedItem());
	}


	/**
	 * This constructor encapsulate a low level API object in HLAPI.
	 */
	@Test(groups = { "hlapi", "FontHLAPI"})
	public void FontHLAPI_LLAPI(){
	   Font llapi = new PtnetFactoryImpl().createFont();
	   fr.lip6.move.pnml.ptnet.hlapi.FontHLAPI hlapi = new FontHLAPI(llapi);
		assert hlapi.getContainedItem().equals(llapi);
	}

	//getters giving HLAPI object
	
	
	
	
	
	
	
	

	
		
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		@Test(groups = { "hlapi", "FontHLAPI"})
		public void getContainerAnnotationGraphicsHLAPITest(){
			FontHLAPI elem = new FontHLAPI(new PtnetFactoryImpl().createFont());

			
				elem.setContainerAnnotationGraphicsHLAPI(itemcontainerAnnotationGraphics);
				AnnotationGraphicsHLAPI totest = elem.getContainerAnnotationGraphicsHLAPI();
				assert totest.getContainedItem().equals(elem.getContainerAnnotationGraphics());
			
		}
	

	//Special getter for list of generics object, return only one object type.
	
	

	//setters/remover for lists.
	

	@Test(groups = { "hlapi", "FontHLAPI"})
	public void equalsTest(){
		Font a = new PtnetFactoryImpl().createFont();
		Font b = new PtnetFactoryImpl().createFont();
		FontHLAPI aprime = new FontHLAPI(a);
		FontHLAPI asecond = new FontHLAPI(a);
		FontHLAPI bprime = new FontHLAPI(b);

		assert aprime.equals(asecond);
		assert !aprime.equals(bprime);
	}

	//cloning method
	//public FontHLAPI clone(){
	//	return new FontHLAPI(this);
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
