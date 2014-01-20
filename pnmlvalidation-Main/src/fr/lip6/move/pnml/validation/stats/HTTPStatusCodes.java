/**
 *  Copyright 2009 Sorbonne Universités, Université Pierre & Marie Curie - CNRS UMR 7606 (LIP6/MoVe)
 *  All rights reserved.   This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *  Initial contributor:
 *    Lom Messan Hillah - <lom-messan.hillah@lip6.fr>
 *
 *  Mailing list:
 *    lom-messan.hillah@lip6.fr
 */
package fr.lip6.move.pnml.validation.stats;

/**
 * HTTP Status codes to indicate services return status.
 * 
 * @author lom
 * 
 */
public enum HTTPStatusCodes {
	/**
	 * OK.
	 */
	OK("HTTP/1.1 200 OK"), ACCEPTED("HTTP/1.1 202 Accepted"),
	/**
	 * Bad request.
	 */
	BAD_REQUEST("HTTP/1.1 400 Bad Request"),
	/**
	 * Forbidden.
	 */
	FORBIDDEN("HTTP/1.1 403 Forbidden"),
	/**
	 * Not Found.
	 */
	NOT_FOUND("HTTP/1.1 404 Not Found"),
	/**
	 * Service timeout.
	 */
	RTIMEOUT("HTTP/1.1 408 Request Timeout"),
	/**
	 * Request entity too large.
	 */
	TOO_LARGE("HTTP/1.1 413 Request Entity Too Large"),
	/**
	 * Unsupported media type.
	 */
	UNSUPPORTED("HTTP/1.1 415 Unsupported Media Type"),
	/**
	 * Internal error.
	 */
	INTERNAL_SERROR("HTTP/1.1 500 Internal Server Error"),
	/**
	 * Unavailable.
	 */
	UNAVAILABLE("HTTP/1.1 503 Service Unavailable"),
	/**
	 * Gateway time out.
	 */
	GTIMEOUT("HTTP/1.1 504 Gateway Timeout");

	/**
	 * the status code.
	 */
	private String statusCode;

	/**
	 * Constructor.
	 * 
	 * @param code
	 *            the status code
	 */
	private HTTPStatusCodes(String code) {
		this.statusCode = code;
	}

	/**
	 * Returns the status code.
	 * 
	 * @return the status code.
	 */
	public String getStatusCode() {
		return statusCode;
	}
}
