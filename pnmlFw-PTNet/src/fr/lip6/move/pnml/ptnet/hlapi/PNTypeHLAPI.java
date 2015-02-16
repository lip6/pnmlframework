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
import fr.lip6.move.pnml.ptnet.PNType;
public enum PNTypeHLAPI{
	PTNET("http://www.pnml.org/version-2009/grammar/ptnet"),
	COREMODEL("http://www.pnml.org/version-2009/grammar/pnmlcoremodel"),
	SYMNET("http://www.pnml.org/version-2009/grammar/snnet"),
	HLPN("http://www.pnml.org/version-2009/grammar/highlevelnet");

	private final PNType item;

	private PNTypeHLAPI(String name) {
		this.item = PNType.get(name);
	}
	
	/**
	 * Return one HLAPI enum (used for tests).
	 * @return one of the enum, null if the int is "out of bounds"
	 */
	public static PNTypeHLAPI get(int num) {
	
      if(num == 0){
         return PTNET;
      }
	
      if(num == 1){
         return COREMODEL;
      }
	
      if(num == 2){
         return SYMNET;
      }
	
      if(num == 3){
         return HLPN;
      }
	
		return null;
	}

	public PNType getContainedItem() {
		return item;
	}

	
}