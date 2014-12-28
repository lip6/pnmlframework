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
package fr.lip6.move.pnml.validation.stats;

/***
 * Utility class to build service return messages.
 * 
 * @author lom
 * 
 */
public final class MessageUtility {
	/**
	 * Message.
	 */
	public static final String MSG = "Message: ";
	/**
	 * New line.
	 */
	public static final String NL = "\n";
	/**
	 * Message minimum size (4 Ko).
	 */
	public static final int MSG_MINSIZE = 4096;
	/**
	 * Message medium size (12 ko).
	 */
	public static final int MSG_MEDIUMSIZE = 12288;

	/**
	 * Constructor.
	 */
	private MessageUtility() {
		super();
	}

	/**
	 * Builds a message.
	 * 
	 * @param code
	 *            the status code of the message.
	 * @param msg
	 *            the message.
	 * @return the message with its status code.
	 */
	public static String buildMessage(final HTTPStatusCodes code,
			final String msg) {
		final StringBuffer sb = new StringBuffer(MSG_MINSIZE);
		sb.append(code.getStatusCode() + NL);
		sb.append(MSG);
		sb.append(msg);
		sb.append(NL);
		return sb.toString();

	}

	/**
	 * Return the message of an exception.
	 * 
	 * @param e
	 *            the exception
	 * @return its message.
	 */
	public static String getExceptionMessage(final Exception e) {
		return e.getCause() != null ? e.getCause().getMessage() : e
				.getMessage();
	}
}
