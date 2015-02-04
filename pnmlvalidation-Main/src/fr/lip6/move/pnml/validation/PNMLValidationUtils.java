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
