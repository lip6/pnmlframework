/**
 *  Copyright 2009 Universite Paris Ouest and Sorbonne Universites,
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
 *    ${ocontributors} - <$oemails}>
 *
 *  Mailing list:
 *    lom-messan.hillah@lip6.fr
 */
package fr.lip6.move.pnml.validation.exceptions;

/**
 * Documents every exception related to the validation of the PNML file to
 * check.
 * 
 * @author lom
 * 
 */
public class ValidationException extends Exception {
	/**
	 * Serial version UID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Generic constructor.
	 */
	public ValidationException() {
		super();
	}

	/**
	 * Constructor with message.
	 * 
	 * @param msg
	 *            the exception message
	 */
	public ValidationException(String msg) {
		super(msg);
	}

	/**
	 * With cause.
	 * 
	 * @param cause
	 *            the cause
	 */
	public ValidationException(Throwable cause) {
		super(cause);
	}

	/**
	 * With message and cause.
	 * 
	 * @param msg
	 *            the message
	 * @param cause
	 *            the cause
	 */
	public ValidationException(String msg, Throwable cause) {
		super(msg, cause);
	}

}
