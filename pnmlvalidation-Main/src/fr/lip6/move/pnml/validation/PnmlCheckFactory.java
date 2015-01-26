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
	 * @returnn a new instance of {@link CheckPnmlFile} that is not thread-safe.
	 * @throws ValidationException
	 */
	public static CheckPnmlFile createPnmlCheck() throws ValidationException {
		return new CheckPnmlFileImpl();
	}
	
	/**
	 * Returns a new instance of {@link CheckPnmlFile} interface. That instance is thread-safe. 
	 * @return a new instance of {@link CheckPnmlFile} that is thread-safe. 
	 * @throws ValidationException 
	 */
	public static CheckPnmlFile createThreadSafePnmlCheck() throws ValidationException {
		return new ConcurrentCheckPnmlFileImpl();
	}
	
}
