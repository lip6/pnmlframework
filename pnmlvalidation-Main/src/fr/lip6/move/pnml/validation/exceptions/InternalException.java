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
package fr.lip6.move.pnml.validation.exceptions;

/**
 * To document some internal exceptions : null, security, etc.
 * 
 * @author lom
 * 
 */
public class InternalException extends Exception {
	/**
	 * Serialization stuff.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default Constructor.
	 */
	public InternalException() {
		super();
	}

	/**
	 * With message and cause.
	 * 
	 * @param message
	 *            the message
	 * @param cause
	 *            the cause
	 */
	public InternalException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * With message.
	 * 
	 * @param message
	 *            the messages
	 */
	public InternalException(String message) {
		super(message);
	}

	/**
	 * With cause.
	 * 
	 * @param cause
	 *            the cause
	 */
	public InternalException(Throwable cause) {
		super(cause);
	}
}
