
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
 * $Id ggiffo, Wed Feb 10 14:59:13 CET 2016$
 */
package fr.lip6.move.pnml.hlpn.hlcorestructure.hlapi;
import fr.lip6.move.pnml.hlpn.hlcorestructure.LineShape;
public enum LineShapeHLAPI{
	LINE("line"),
	CURVE("curve");

	private final LineShape item;

	private LineShapeHLAPI(String name) {
		this.item = LineShape.get(name);
	}
	
	/**
	 * Return one HLAPI enum (used for tests).
	 * @return one of the enum, null if the int is "out of bounds"
	 */
	public static LineShapeHLAPI get(int num) {
	
      if(num == 0){
         return LINE;
      }
	
      if(num == 1){
         return CURVE;
      }
	
		return null;
	}

	public LineShape getContainedItem() {
		return item;
	}

	
}