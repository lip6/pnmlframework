/**
 *  Copyright 2009-2015 Université Paris Ouest and Sorbonne Universités,
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
 * $Id ggiffo, Tue Dec 23 11:30:46 CET 2014$
 */
package fr.lip6.move.pnml.ptnet.hlapi;
import fr.lip6.move.pnml.ptnet.CSS2FontSize;
public enum CSS2FontSizeHLAPI{
	XXSMALL("xxsmall"),
	XSMALL("xsmall"),
	SMALL("small"),
	MEDIUM("medium"),
	LARGE("large"),
	XLARGE("xlarge"),
	XXLARGE("xxlarge");

	private final CSS2FontSize item;

	private CSS2FontSizeHLAPI(String name) {
		this.item = CSS2FontSize.get(name);
	}
	
	/**
	 * Return one HLAPI enum (used for tests).
	 * @return one of the enum, null if the int is "out of bounds"
	 */
	public static CSS2FontSizeHLAPI get(int num) {
	
      if(num == 0){
         return XXSMALL;
      }
	
      if(num == 1){
         return XSMALL;
      }
	
      if(num == 2){
         return SMALL;
      }
	
      if(num == 3){
         return MEDIUM;
      }
	
      if(num == 4){
         return LARGE;
      }
	
      if(num == 5){
         return XLARGE;
      }
	
      if(num == 6){
         return XXLARGE;
      }
	
		return null;
	}

	public CSS2FontSize getContainedItem() {
		return item;
	}

	
}