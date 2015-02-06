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
 * Output and input encoding for PNML files.
 * @author lom
 *
 */
public enum PNMLEncoding {
	ISO_8859_1("ISO-8859-1"), UTF_8 ("UTF-8");
	
	private final String name;

	private PNMLEncoding(String name){
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
}
