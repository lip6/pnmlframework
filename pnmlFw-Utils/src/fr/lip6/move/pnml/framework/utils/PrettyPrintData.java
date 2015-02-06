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
package fr.lip6.move.pnml.framework.utils;

/**
 * This contains data and tools for pretty printing PNML document at export.
 *
 * @author Guillaume Giffo
 *
 */
public final class PrettyPrintData {

    /**
     * default tab value.
     */
    public static final String DEFAULTTAB = "  ";

    /**
     * the String used as tabulation for pretty printing.
     */
    private String lineHeader = DEFAULTTAB;

    /**
     *
     */
    private StringBuilder currentLineHeader;

    /**
     * the level of tabulation for pretty printing.
     */
    private int level;
    
    public PrettyPrintData() {
    	currentLineHeader = new StringBuilder();
    }

    /**
     * @return the ppSpacer
     */
    public final String getLineHeader() {
        return lineHeader;
    }

    /**
     * @param newLineHeader
     *            the LineHeader to set
     */
    public final void setLineHeader(String newLineHeader) {
        lineHeader = newLineHeader;
    }

    /**
     * @return the new current line header
     */
    public final String increaseLineHeaderLevel() {
        level++;
        currentLineHeader.append(lineHeader);
        return currentLineHeader.toString();
    }

    /**
     * @return the new current line header
     */
    public final String decreaseLineHeaderLevel() {
        level--;
        int len = currentLineHeader.length();
        currentLineHeader.delete(0, len);
        for (int i = 0; i < level; i++) {
            currentLineHeader.append(lineHeader);
        }
        return currentLineHeader.toString();
    }

    /**
     * @return the level
     */
    public final int getLevel() {
        return level;
    }

    /**
     * @return the currentLineHeader
     */
    public final String getCurrentLineHeader() {
        return currentLineHeader.toString();
    }
}
