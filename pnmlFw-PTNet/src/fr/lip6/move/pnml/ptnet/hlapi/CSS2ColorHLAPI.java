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
import fr.lip6.move.pnml.ptnet.CSS2Color;
public enum CSS2ColorHLAPI{
	AQUA("aqua"),
	BLACK("black"),
	BLUE("blue"),
	FUCHSIA("fuchsia"),
	GRAY("gray"),
	GREEN("green"),
	LIME("lime"),
	MAROON("maroon"),
	NAVY("navy"),
	OLIVE("olive"),
	ORANGE("orange"),
	PURPLE("purple"),
	RED("red"),
	SILVER("silver"),
	TEAL("teal"),
	WHITE("white"),
	YELLOW("yellow");

	private final CSS2Color item;

	private CSS2ColorHLAPI(String name) {
		this.item = CSS2Color.get(name);
	}
	
	/**
	 * Return one HLAPI enum (used for tests).
	 * @return one of the enum, null if the int is "out of bounds"
	 */
	public static CSS2ColorHLAPI get(int num) {
	
      if(num == 0){
         return AQUA;
      }
	
      if(num == 1){
         return BLACK;
      }
	
      if(num == 2){
         return BLUE;
      }
	
      if(num == 3){
         return FUCHSIA;
      }
	
      if(num == 4){
         return GRAY;
      }
	
      if(num == 5){
         return GREEN;
      }
	
      if(num == 6){
         return LIME;
      }
	
      if(num == 7){
         return MAROON;
      }
	
      if(num == 8){
         return NAVY;
      }
	
      if(num == 9){
         return OLIVE;
      }
	
      if(num == 10){
         return ORANGE;
      }
	
      if(num == 11){
         return PURPLE;
      }
	
      if(num == 12){
         return RED;
      }
	
      if(num == 13){
         return SILVER;
      }
	
      if(num == 14){
         return TEAL;
      }
	
      if(num == 15){
         return WHITE;
      }
	
      if(num == 16){
         return YELLOW;
      }
	
		return null;
	}

	public CSS2Color getContainedItem() {
		return item;
	}

	
}