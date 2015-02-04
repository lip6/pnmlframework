/**
 *  Copyright 2009-2015 Université Paris Ouest and Sorbonne Universités,
 * 							Univ. Paris 06 - CNRS UMR
 * 							7606 (LIP6)
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
 *    L.M. Hillah - <$oemails}>
 *
 *  Mailing list:
 *    lom-messan.hillah@lip6.fr
 */
package fr.lip6.move.pnml.validation;

import fr.lip6.move.pnml.framework.hlapi.HLAPIRootClass;

/**
 * <p>Set of utility methods to perform various management tasks on a PNML file.</p>
 * For instance, you may choose to remove all graphical information from the PNML file, 
 * to reduce its size.
 * @author lom
 *
 */
public interface PNMLValidationUtils {

	/**
	 * Removes all graphical information from the PNML file, which must have been validated beforehand,
	 * thus been loaded through an instance of {@link CheckPnmlFile}.
	 * @param checker a PNML file checker
	 * @return the root class of the PNML document, after having purged the graphical info from it.
	 */
	HLAPIRootClass removeGraphics(CheckPnmlFile checker);
}
