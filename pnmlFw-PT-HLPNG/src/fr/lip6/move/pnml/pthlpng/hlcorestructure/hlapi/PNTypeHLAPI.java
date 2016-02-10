
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
 * $Id ggiffo, Wed Feb 10 14:59:15 CET 2016$
 */
package fr.lip6.move.pnml.pthlpng.hlcorestructure.hlapi;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.PNType;
public enum PNTypeHLAPI{
	SYMNET("http://www.pnml.org/version-2009/grammar/symmetricnet"),
	COREMODEL("http://www.pnml.org/version-2009/grammar/pnmlcoremodel"),
	PTNET("http://www.pnml.org/version-2009/grammar/ptnet"),
	HLPN("http://www.pnml.org/version-2009/grammar/highlevelnet"),
	PTHLPN("http://www.pnml.org/version-2009/grammar/pt-hlpng");

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
         return SYMNET;
      }
	
      if(num == 1){
         return COREMODEL;
      }
	
      if(num == 2){
         return PTNET;
      }
	
      if(num == 3){
         return HLPN;
      }
	
      if(num == 4){
         return PTHLPN;
      }
	
		return null;
	}

	public PNType getContainedItem() {
		return item;
	}

	
}