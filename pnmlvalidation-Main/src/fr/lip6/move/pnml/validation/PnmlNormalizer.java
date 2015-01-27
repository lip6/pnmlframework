/**
 *  Copyright 2009-2015 Universite Paris Ouest and Sorbonne Universites,
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
 * Provides an easy way to check for situations in the PNML where a normalization is possible.
 * <p>For example, when you encounter parallel arcs, you may want to add them up to one single arc.</p>
 * <p>You may also, for instance, assign random unique names to the net objects (name attribute 
 * is not required in PNML) where there aren't.</p>
 * <p>In this version, only parallel arcs are processed.</p>
 * <p><strong>Note:</strong>It is strongly advised to load the PNML Document first through the {@link CheckPnmlFile}
 * interface before trying to perform normalization.</p>
 * @author lom
 * @since 1.0.6
 */
public interface PnmlNormalizer {
	
	/**
	 * Tells if there are parallel arcs in the PNML Document that is hold by the {@link CheckPnmlFile} instance.
	 * @param checker
	 * @return
	 */
	boolean checkCanMergeParallelArcs(CheckPnmlFile checker);
	
	/**
	 * Reports the parallel arcs in the PNML Document that is hold by the {@link CheckPnmlFile} instance.
	 * @param checker
	 * @return
	 */
	String reportParallelArcs(CheckPnmlFile checker);
	
	/**
	 * Normalizes the PNML Document hold by the {@link CheckPnmlFile} instance, by merging parallel arcs.
	 * Errors are reported in the log.
	 * * @param checker
	 * @return the root class representing the PNML Document, possibly modified if parallel arcs were merged.
	 * Otherwise the PNML Document will remain unchanged
	 */
	HLAPIRootClass mergeParallelArcs(CheckPnmlFile checker);
}
