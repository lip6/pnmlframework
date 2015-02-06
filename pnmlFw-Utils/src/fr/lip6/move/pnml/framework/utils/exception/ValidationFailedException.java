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
 * 
 */
package fr.lip6.move.pnml.framework.utils.exception;

/**
 * @author ggiffo
 *
 */
public class ValidationFailedException extends Exception {

    /**
     * 
     */
    private static final long serialVersionUID = 7727931461657590643L;

    /**
     * 
     */
    public ValidationFailedException() {
        super();
    }

    /**
     * @param message .
     */
    public ValidationFailedException(String message) {
        super(message);
    }

    /**
     * @param cause .
     */
    public ValidationFailedException(Throwable cause) {
        super(cause);
    }

    /**
     * @param message .
     * @param cause .
     */
    public ValidationFailedException(String message, Throwable cause) {
        super(message, cause);
    }

}
