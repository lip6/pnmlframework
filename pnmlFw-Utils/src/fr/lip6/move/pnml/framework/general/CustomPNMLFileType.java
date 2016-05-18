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
package fr.lip6.move.pnml.framework.general;

/**
 * This implementation of PNMLFileType contains an imported custom type.
 *
 * @author Guillaume Giffo
 *
 */
public class CustomPNMLFileType implements PNMLFileType {

    /**
     *
     */
    private final String typeName;

    /**
     *
     */
    private final String className;

    /**
     *
     */
    private final String namespace;

    /**
     *
     */
    private final String rngUrl;

    /**
     *
     */
    private final String fallBackCLass;

    /**
     * @param theTypeName
     *            the string of the net type name
     * @param theClassName
     *            the string of the class name.
     * @param theNamespace
     *            the string of the namespace.
     * @param theRngUrl
     *            the url to the associated rng file.
     * @param theFallback
     *            the name of the fall back class
     */
    public CustomPNMLFileType(String theTypeName, String theClassName,
            String theNamespace, String theRngUrl, String theFallback) {
        typeName = theTypeName;
        className = theClassName;
        namespace = theNamespace;
        rngUrl = theRngUrl;
        fallBackCLass = theFallback;
    }

    /**
     * @return the type name
     */
    public final String getTypeName() {
        return typeName;
    }

    /**
     * @return the className
     */
    public final String getClassName() {
        return className;
    }

    /**
     * @return the namespace
     */
    public final String getNamespace() {
        return namespace;
    }

    /**
     * @return the rng file Url
     */
    public final String getRngUrl() {
        return rngUrl;
    }

    /**
     * @return the name of the fall back class
     */
    public final String getFallBackClassName() {
        return fallBackCLass;
    }

}
