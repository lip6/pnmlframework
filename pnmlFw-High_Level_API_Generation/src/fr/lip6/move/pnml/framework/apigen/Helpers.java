package fr.lip6.move.pnml.framework.apigen;

import org.eclipse.emf.codegen.ecore.genmodel.GenClass;

/**
 * 
 * @author Guillaume Giffo
 * 
 */
public final class Helpers {

    /**
     * needed for comma generator.
     */
    private static Boolean first;

    /**
     * 
     */
    private Helpers() {
    }

    /**
     * 
     * @param genClass
     *            the genclass to work on
     * @return the string
     */
    public static String hlapiPackage(GenClass genClass) {
        return genClass.getGenPackage().getBasePackage() + "."
                + genClass.getGenPackage().getNSName() + ".hlapi";
    }

    /**
     * return the full name (including package prefixing) for an HLAPI class).
     * 
     * @param genClass
     *            the genclass to work on
     * @return the string
     */
    public static String hlapiFullClassName(GenClass genClass) {
        return hlapiPackage(genClass) + "." + genClass.getName() + "HLAPI";
    }

    /**
     * reset the comma generator.
     */
    public static void resetComma() {
        first = true;
    }

    /**
     * check if useful to put a comma at this point.
     * 
     * @return the comma or a void string.
     */
    public static String putComma() {
        if (!first) {
            return ",";
        } else {
            first = false;
            return "";
        }
    }

}
