/**
 *  Copyright 2009-2015 Université Paris Ouest and Sorbonne Universités,
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
package fr.lip6.move.pnml.validation;

import fr.lip6.move.pnml.validation.exceptions.ValidationException;
import fr.lip6.move.pnml.validation.impl.CheckPnmlFileImpl;
import fr.lip6.move.pnml.validation.impl.ConcurrentCheckPnmlFileImpl;

/**
 * Provides an easy access into instantiating the {@link CheckPnmlFile} interface.
 * 
 * @author lom
 *
 */
public final class PnmlCheckFactory {
	
	private PnmlCheckFactory () {}
	
	private static final class PnmlCheckFactoryHolder {
		private static final PnmlCheckFactory INSTANCE = new PnmlCheckFactory();
	}
	
	public static PnmlCheckFactory getInstance() { 
		return PnmlCheckFactoryHolder.INSTANCE;
	}
	
	/**
	 * Returns a new instance of {@link CheckPnmlFile} interface. That instance is not thread-safe.
	 * @return a new instance of {@link CheckPnmlFile} that is not thread-safe.
	 * @throws ValidationException if something went wrong during the validation process
	 */
	public static CheckPnmlFile createPnmlCheck() throws ValidationException {
		return new CheckPnmlFileImpl();
	}
	
	/**
	 * Returns a new instance of {@link CheckPnmlFile} interface. That instance is thread-safe. 
	 * @return a new instance of {@link CheckPnmlFile} that is thread-safe. 
	 * @throws ValidationException if something went wrong during the validation process
	 */
	public static CheckPnmlFile createThreadSafePnmlCheck() throws ValidationException {
		return new ConcurrentCheckPnmlFileImpl();
	}
}
