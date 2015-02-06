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
/**
 *
 */
package fr.lip6.move.pnml.framework.general;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import com.thaiopensource.validate.ValidationDriver;

import fr.lip6.move.pnml.framework.hlapi.HLAPIClass;
import fr.lip6.move.pnml.framework.utils.ModelRepository;
import fr.lip6.move.pnml.framework.utils.exception.BadFileFormatException;
import fr.lip6.move.pnml.framework.utils.exception.InvocationFailedException;
import fr.lip6.move.pnml.framework.utils.exception.OCLValidationFailed;
import fr.lip6.move.pnml.framework.utils.exception.OtherException;
import fr.lip6.move.pnml.framework.utils.exception.UnhandledNetType;
import fr.lip6.move.pnml.framework.utils.exception.ValidationFailedException;

/**
 * <p>
 * This class is used for exporting a PNMLDocument object into a PNML file.
 * </p>
 * <p>
 * This class is open for extension.
 * </p>
 * 
 * @author Guillaume Giffo
 * 
 */
public class PnmlExport extends AbstractPnmlImportExport {

	private static final String VALIDATION_AGAINST_GRAMMAR = "Validation against grammar...";
	private static final String WRITING_TO_PNML_FILE_OK = "Writing to PNML file ok";
	private static final String TO_PNML = "toPNML";
	private static final String ISO_8859_1 = "ISO-8859-1";
	/**
	 * the file name.
	 */
	private File out;

	/**
     *
     */
	public PnmlExport() {
		super("export", null);
	}

	/**
	 * 
	 * @param filepath
	 *            the path to the custom plug in registration file
	 */
	public PnmlExport(String filepath) {
		super("export", filepath);
	}

	/**
	 * Creates a PNML file from a PetriNetDocHLAPI object. The pretty printing
	 * is used accordingly to the {@link ModelRepository} pretty printing
	 * status.
	 * 
	 * @param object
	 *            the object to export.
	 * @param filepath
	 *            the file path.
	 * @throws UnhandledNetType
	 *             if the net type is unknown.
	 * @throws OCLValidationFailed
	 *             if an ocl violation is detected.
	 * @throws IOException
	 *             if a problem occur with file.
	 * @throws ValidationFailedException
	 *             if the validation fail.
	 * @throws OtherException .
	 * @throws BadFileFormatException .
	 */
	public final void exportObject(HLAPIClass object, String filepath)
			throws UnhandledNetType, OCLValidationFailed, IOException,
			ValidationFailedException, BadFileFormatException, OtherException {

		out = new File(filepath);

		final String classname = object.getClass().getCanonicalName();

		PNMLFileType otype = OfficialPNMLFileType.getByClassName(classname);

		// If the type is not known looking for it in custom types file.
		if (otype == null && newTypeFilePath != null) {
			final PNMLFileRepository impo = new ImportCustomPNMLFileType(
					newTypeFilePath);
			otype = impo.getByClassName(classname);
		}

		// If not find in custom type...
		if (otype == null) {
			log.error("type "
					+ object.getClass().getName()
					+ " is unknown, we are expecting a HLAPIRootClass (like PetriNetDocHLAPI) object of a known package.");
			throw new UnhandledNetType("type " + object.getClass().getName()
					+ " is unknown");
		}

		doWork(object, otype.getRngUrl());

	}

	/**
	 * Creates a PNML file from a PetriNetDocHLAPI object. The prettyPrinting is
	 * used according to the modelRepository pretty printing status.
	 * 
	 * @see #exportObject(HLAPIClass, String)
	 * @param object
	 *            the object to export.
	 * @param filepath
	 *            the file path.
	 * @param usePrettyPrint
	 *            true if you want to use pretty print, false either.
	 * @throws UnhandledNetType
	 *             if the net type is unknown.
	 * @throws OCLValidationFailed
	 *             if an ocl violation is detected.
	 * @throws IOException
	 *             if a problem occur with file.
	 * @throws ValidationFailedException
	 *             if the validation fail.
	 * @throws OtherException .
	 * @throws BadFileFormatException .
	 */
	public final void exportObject(HLAPIClass object, String filepath,
			boolean usePrettyPrint) throws UnhandledNetType,
			OCLValidationFailed, IOException, ValidationFailedException,
			BadFileFormatException, OtherException {
		ModelRepository.getInstance().setPrettyPrintStatus(usePrettyPrint);
		exportObject(object, filepath);
	}

	/**
	 * Same as {@link #exportObject(HLAPIClass, String)} but this time using a
	 * root class (PetriNetDoc) typed as an EMF's EObject (native).
	 * 
	 * @see #exportObject(HLAPIClass, String)
	 * @param object
	 * @param filepath
	 * @throws UnhandledNetType
	 * @throws OCLValidationFailed
	 * @throws IOException
	 * @throws ValidationFailedException
	 * @throws BadFileFormatException
	 * @throws OtherException
	 * @throws InvocationFailedException
	 */
	public void exportObject(EObject object, String filepath)
			throws UnhandledNetType, OCLValidationFailed, IOException,
			ValidationFailedException, BadFileFormatException, OtherException,
			InvocationFailedException {

		out = new File(filepath);

		final String classname = object.getClass().getCanonicalName();

		PNMLFileType otype = OfficialPNMLFileType
				.getByNativeClassName(classname);

		// If the type is not known looking for it in custom types file.
		if (otype == null && newTypeFilePath != null) {
			final PNMLFileRepository impo = new ImportCustomPNMLFileType(
					newTypeFilePath);
			otype = impo.getByClassName(classname);
		}

		// If not find in custom type...
		if (otype == null) {
			log.error("type "
					+ object.getClass().getCanonicalName()
					+ " is unknown, we are expecting a PN root class (like PetriNetDoc) object of a known package.");
			throw new UnhandledNetType("type "
					+ object.getClass().getCanonicalName() + " is unknown");
		}

		doWork(object, classname, otype.getRngUrl());

	}

	/**
	 * Same as {@link #exportObject(HLAPIClass, String, boolean)} but this using
	 * a root class (PetriNetDoc) typed as an EMF's EObject (native). The
	 * prettyPrinting is used according to the modelRepository pretty printing
	 * status.
	 * 
	 * @see #exportObject(EObject, String)
	 * @param object
	 * @param filepath
	 * @param usePrettyPrint
	 * @throws UnhandledNetType
	 * @throws OCLValidationFailed
	 * @throws IOException
	 * @throws ValidationFailedException
	 * @throws BadFileFormatException
	 * @throws OtherException
	 * @throws InvocationFailedException 
	 */
	public void exportObject(EObject object, String filepath,
			boolean usePrettyPrint) throws UnhandledNetType,
			OCLValidationFailed, IOException, ValidationFailedException,
			BadFileFormatException, OtherException, InvocationFailedException {
		ModelRepository.getInstance().setPrettyPrintStatus(usePrettyPrint);
		exportObject(object, filepath);

	}

	/**
	 * This class checks OCL violation, exports the file, and validates it.
	 * 
	 * @param pndoc
	 *            the pnml document object.
	 * @param schemafile
	 *            the schemat file url.
	 * @throws OCLValidationFailed
	 *             if an ocl violation is detected.
	 * @throws IOException
	 *             if a problem occur with file access.
	 * @throws ValidationFailedException
	 *             if the pnml validation fail.
	 */
	private void doWork(HLAPIClass pndoc, String schemafile)
			throws OCLValidationFailed, IOException, ValidationFailedException {

		oclChecking(pndoc);
		log.trace("OCL ok, writting temporary file");

		// Original code: final String output = pndoc.toPNML();
		/*
		 * final Writer writefile = new BufferedWriter(new FileWriter(out));
		 * writefile.write(output); writefile.close();
		 */
		// Experimental code: writeToFileNIOWay(out, output);
		final FileOutputStream fos = new FileOutputStream(out);
		final FileChannel fc = fos.getChannel();
		pndoc.toPNML(fc);

		log.trace(WRITING_TO_PNML_FILE_OK);
		fc.close();
		fos.close();

		log.trace(VALIDATION_AGAINST_GRAMMAR);
		rngGrammarValidation(schemafile,
				ValidationDriver.uriOrFileInputSource(out.getAbsolutePath()));
	}

	/**
	 * Same as {@link #doWork(HLAPIClass, String)}
	 * 
	 * @param object
	 * @param rngUrl
	 */
	private void doWork(EObject eObject, String classname, String schemafile)
			throws InvocationFailedException, IOException,
			ValidationFailedException {
		log.trace("OCL check disabled in this case.");
		Class<?> c;
		try {
			c = Class.forName(classname);
		} catch (ClassNotFoundException e1) {
			throw new InvocationFailedException(e1.getMessage(), e1.getCause());
		}
		Object t = (Object) eObject;
		Method[] allMethods = c.getDeclaredMethods();
		String mname;
		Method toPNML = null;
		for (Method m : allMethods) {
			mname = m.getName();
			if (mname.equalsIgnoreCase(TO_PNML)
					&& m.getGenericReturnType() == void.class) {
				toPNML = m;
				break;
			}
		}
		if (toPNML != null) {
			final FileOutputStream fos = new FileOutputStream(out);
			final FileChannel fc = fos.getChannel();
			try {
				toPNML.invoke(t, fc);
			} catch (IllegalAccessException | IllegalArgumentException
					| InvocationTargetException e) {
				throw new InvocationFailedException(e.getMessage(),
						e.getCause());
			} finally {
				fc.close();
				fos.close();
			}
			log.trace(WRITING_TO_PNML_FILE_OK);
			log.trace(VALIDATION_AGAINST_GRAMMAR);
			rngGrammarValidation(
					schemafile,
					ValidationDriver.uriOrFileInputSource(out.getAbsolutePath()));
		} else {
			throw new InvocationFailedException(
					"Cannot locate toPNML(FileChannel fc) in the PNML object (passed as "
							+ classname + ").");
		}

	}

	/**
	 * Writes output to file using Java NIO API. Buffer size is 8K and choped
	 * contents size is 4K.
	 * 
	 * @param file
	 *            destination file
	 * @param output
	 *            the string to write there
	 * @throws IOException
	 * @see {@link #chopString(String, int)}
	 */
	@SuppressWarnings("unused")
	private static void writeToFileNIOWay(File file, String output)
			throws IOException {

		final int bufferSizeKB = 8;
		final int contentsSizeKB = 4;
		final int bufferSize = bufferSizeKB * 1024;
		final int contentsSize = contentsSizeKB * 1024;
		final FileOutputStream fos = new FileOutputStream(file);
		final FileChannel fc = fos.getChannel();
		ByteBuffer bytebuf;
		bytebuf = ByteBuffer.allocateDirect(bufferSize);
		List<byte[]> contents = chopString(output, contentsSize);
		for (byte[] cont : contents) {
			bytebuf.put(cont);
			bytebuf.flip();
			fc.write(bytebuf);
			bytebuf.clear();
		}
		fc.close();
		fos.close();
	}

	/**
	 * Chops a string into chunks of len long.
	 * 
	 * @param src
	 *            the string to chop
	 * @param len
	 *            the length of each chunk
	 * @return the list of chunks
	 */
	private static List<byte[]> chopString(String src, int len) {
		List<byte[]> res = new ArrayList<byte[]>();
		int iterations = (int) Math.ceil((double) src.length() / (double) len);

		for (int i = 0; i < iterations; i++) {
			res.add(src.substring(i * len,
					Math.min(src.length(), (i + 1) * len)).getBytes(
					Charset.forName(ISO_8859_1)));
		}
		return res;
	}

	/**
	 * Chops a big byte array into chunks of the max size the specified length.
	 * 
	 * @param src
	 * @param len
	 * @return the list of chunks, each of the specified length (except maybe
	 *         the last one).
	 */
	public static List<byte[]> chopBytes(byte[] src, int len) {
		List<byte[]> res = new ArrayList<byte[]>();
		int iterations = (int) Math.ceil((double) src.length / (double) len);
		int k = 0;
		for (int i = 0; i < iterations; i++) {
			byte[] element = new byte[Math.min(src.length, (i + 1) * len)
					- (i * len)];
			for (int j = i * len; j < Math.min(src.length, (i + 1) * len); j++) {
				element[k] = src[j];
				k++;
			}
			res.add(element);
			k = 0;
		}
		return res;
	}
}
