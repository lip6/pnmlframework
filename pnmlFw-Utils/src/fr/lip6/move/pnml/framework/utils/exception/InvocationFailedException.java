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

public class InvocationFailedException extends Exception {

	private static final long serialVersionUID = 592903000563297304L;

	public InvocationFailedException() {
		super();
	}

	public InvocationFailedException(String message) {
		super(message);
	}

	public InvocationFailedException(Throwable cause) {
		super(cause);

	}

	public InvocationFailedException(String message, Throwable cause) {
		super(message, cause);

	}

	public InvocationFailedException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
