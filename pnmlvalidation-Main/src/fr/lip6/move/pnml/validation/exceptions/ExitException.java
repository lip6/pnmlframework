/**
 *  Copyright 2009 Universite Paris Ouest Nanterre & Sorbonne Universites, Univ. Paris 06 - CNRS UMR 7606 (LIP6/MoVe)
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
 * Provides exit status code.
 * @author lom
 */
public class ExitException extends Exception {
	/**
	 * Exit code.
	 */
	public static final int EXIT_CODE1 = -1;
	/**
	 * Exit code.
	 */
	public static final int EXIT_CODE2 = -2;
	/**
	 * Exit code.
	 */
	public static final int EXIT_CODE3 = -3;
	/**
	 * Exit code.
	 */
	public static final int EXIT_CODE4 = -4;
	/**
	 * Serial Version.
	 */
	public static final long serialVersionUID = 1L;
	/**
	 * Exit code.
	 */
	private final int status;

	/**
	 * Constructor with exit code.
	 * @param theStatus the exit code.
	 */
	public ExitException(final int theStatus) {
		super("Application has ended execution.");
		this.status = theStatus;
	}

	/**
	 * Default constructor. Default exit code is -1.
	 */
	public ExitException() {
		super();
		this.status = EXIT_CODE1;
	}

	/**
	 * Default constructor with message and cause, without exit code. Default
	 * exit code is -1.
	 * @param message exception message
	 * @param cause the cause
	 */
	public ExitException(String message, Throwable cause) {
		super(message, cause);
		this.status = EXIT_CODE1;
	}

	/**
	 * Default constructor with message, without exit code. Default exit code is
	 * -1.
	 * @param message exception message
	 */
	public ExitException(String message) {
		super(message);
		this.status = EXIT_CODE1;
	}

	/**
	 * Default constructor with cause, without exit code. Default exit code is
	 * -1.
	 * @param cause the cause
	 */
	public ExitException(Throwable cause) {
		super(cause);
		this.status = EXIT_CODE1;
	}

	/**
	 * Constructor with a message and an exit code.
	 * @param theStatus exit code.
	 * @param message the exception message
	 */
	public ExitException(final int theStatus, final String message) {
		super(message);
		this.status = theStatus;
	}

	/**
	 * Returns the exit code.
	 * @return the exit code.
	 */
	public final int getStatus() {
		return this.status;
	}
}
