/**
 *  Copyright 2009-2016 Université Paris Ouest and Sorbonne Universités,
 * 							Univ. Paris 06 - CNRS UMR 7606 (LIP6)
 *
 *  All rights reserved.   This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *  Project leader / Initial Contributor:
 *    Lom Messan Hillah - <lom-messan.hillah@lip6.fr>
 *
 *  Contributors:
 *    ${ocontributors} - <$oemails}>
 *
 *  Mailing list:
 *    lom-messan.hillah@lip6.fr
 */
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
import fr.lip6.move.pnml.pthlpng.hlcorestructure.CSS2FontWeight;
public enum CSS2FontWeightHLAPI{
	NORMAL("NORMAL"),
	BOLD("BOLD"),
	BOLDER("BOLDER"),
	LIGHTER("LIGHTER");

	private final CSS2FontWeight item;

	private CSS2FontWeightHLAPI(String name) {
		this.item = CSS2FontWeight.get(name);
	}
	
	/**
	 * Return one HLAPI enum (used for tests).
	 * @return one of the enum, null if the int is "out of bounds"
	 */
	public static CSS2FontWeightHLAPI get(int num) {
	
      if(num == 0){
         return NORMAL;
      }
	
      if(num == 1){
         return BOLD;
      }
	
      if(num == 2){
         return BOLDER;
      }
	
      if(num == 3){
         return LIGHTER;
      }
	
		return null;
	}

	public CSS2FontWeight getContainedItem() {
		return item;
	}

	
}