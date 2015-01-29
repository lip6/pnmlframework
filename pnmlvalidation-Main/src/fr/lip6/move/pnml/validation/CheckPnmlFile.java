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

import java.util.UUID;

import fr.lip6.move.pnml.framework.hlapi.HLAPIRootClass;
import fr.lip6.move.pnml.validation.exceptions.InternalException;
import fr.lip6.move.pnml.validation.exceptions.InvalidFileException;
import fr.lip6.move.pnml.validation.exceptions.InvalidFileTypeException;
import fr.lip6.move.pnml.validation.exceptions.ValidationException;
import fr.lip6.move.pnml.validation.stats.PnmlDocStatistics;

/**
 * <p>
 * Simple validation service for PNML documents. Checks the conformity of a PNML
 * document according to the standard (ISO/IEC 15909-2) specifications. Uses
 * PNML Framework to perform the check, because PNML Framework not only
 * validates the document against its grammar, but also checks OCL constraints
 * specified by the standard.
 * </p>
 * <p>
 * This interface also lets you retrieve some basic stats about the PNML
 * document you are checking. New services may be added as we thing of them
 * being somehow useful.
 * </p>
 * @author lom
 */
public interface CheckPnmlFile extends PnmlDocStatistics {
	/**
	 * Check that the PNML file whose path is given as parameter is a valid PNML
	 * file. This includes: XML well-formedness, and standard PNML type
	 * conformity. The standard OCL rules are also checked in the process.
	 * @param filePath the file path
	 * @return a message everything returned properly (validation was successful).
	 *         This message must be displayed to the user requesting the
	 *         validation.
	 * @throws InvalidFileException I/O related exceptions
	 * @throws InvalidFileTypeException File format related exception. The
	 *             message of this exception should be displayed to the user.
	 * @throws ValidationException Validation service exception. The message of
	 *             this exception must be displayed to the user.
	 * @throws InternalException some internal problem has occurred.
	 */
	String checkPnmlFile(String filePath) throws InvalidFileException, InvalidFileTypeException, ValidationException, InternalException;

	/**
	 * Gives the opportunity to objects implementing this interface to close the
	 * workspace in PNML Framework before you dispose of it.
	 * @throws ValidationException something went wrong during the validation.
	 */
	void dispose() throws ValidationException;

	/**
	 * Returns the HLAPI root class representing the imported PNML document. The
	 * exact Petri net type contained in the PNML document is not known. Used by
	 * stats implementation classes.
	 * @return the HLAPI root class representing the imported PNML document.
	 * @see #isCoreModelDocument()
	 * @see #isPTNetDocument()
	 * @see #isSymNetDocument()
	 * @see #isHLPNDocument()
	 * @see #isPTHLPNDocument()
	 */
	HLAPIRootClass getPnmlDocHLAPIRootClass();

	/**
	 * Tells if the PNML document is a Core model document.
	 * @return true if it is a Core model document.
	 */
	boolean isCoreModelDocument();

	/**
	 * Tells if the PNML document is Place/Transition net document.
	 * @return true if it is a P/T net document.
	 */
	boolean isPTNetDocument();

	/**
	 * Tells if the PNML document is a Symmetric net document.
	 * @return true if it is a Symmetric net document.
	 */
	boolean isSymNetDocument();

	/**
	 * Tells if the PNML document is a High-level Petri net document.
	 * @return true if it is a High-level Petri net document.
	 */
	boolean isHLPNDocument();

	/**
	 * Tells if the PNML document is a Place/Transition net in high-level
	 * notation document.
	 * @return true if if is a P/T net in high-level net document.
	 * <p><strong>Warning</strong> this is not yet supported by PNML Framework enumerated types in
	 *          each Petri net type package, as of version 2.1.6 of those.
	 *          Basically, the literal value for PT-HLPN is missing. Will be
	 *          fixed soon.</p>
	 */
	boolean isPTHLPNDocument();

	/**
	 * <p>Makes this class explicitly create a {@link PnmlDocStatistics} object to
	 * compute various stats on the loaded PNML document. Do this if you really
	 * need the stats, to avoid creating objects unnecessarily.</p><p>After this
	 * method, you can invoke the stats methods.</p>
	 * @see #getNumOfArcs()
	 * @see #getNumOfNets()
	 * @see #getNumOfPlaces()
	 * @see #getNumOfTransitions()
	 * @see #getNumOfRefPlaces()
	 * @see #getNumOfRefTransitions()
	 */
	void setUpStats();

	/**
	 * Returns the name of the first model in this PNML document. Uses Stat
	 * class to do so.
	 * @return the name of the first model in the current PNML document.
	 */
	String getModelName();
	
	/**
	 * Returns the UUID of the current instance of the checker. Each instance must create an ID upon creation.
	 * @return the UUID of the current instance of the checker.
	 */
	UUID getCheckerID();

}
