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
package fr.lip6.move.pnml.framework.utils.exception;

/**
 * Documents every exception related to the type of the file sent for
 * validation, typically, binary files and non-PNML files.
 * 
 * @author lom
 * 
 */
public class InvalidFileTypeException extends Exception {

	/**
	 * Serial version UID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default Constructor.
	 */
	public InvalidFileTypeException() {
		super();
	}

	/**
	 * With message.
	 * 
	 * @param message
	 *            the messages
	 */
	public InvalidFileTypeException(String message) {
		super(message);
	}

	/**
	 * With cause.
	 * 
	 * @param cause
	 *            the cause
	 */
	public InvalidFileTypeException(Throwable cause) {
		super(cause);
	}

	/**
	 * With message and cause.
	 * 
	 * @param message
	 *            the message
	 * @param cause
	 *            the cause
	 */
	public InvalidFileTypeException(String message, Throwable cause) {
		super(message, cause);
	}

}
