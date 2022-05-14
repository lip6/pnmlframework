/**
 *  Copyright 2009-2016 Université Paris Ouest and Sorbonne Universités,
							Univ. Paris 06 - CNRS UMR 7606 (LIP6)
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
package fr.lip6.move.pnml.framework.utils;

import java.util.Date;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import org.eclipse.emf.ecore.EObject;

import fr.lip6.move.pnml.framework.hlapi.HLAPIRootClass;
import fr.lip6.move.pnml.framework.utils.exception.InvalidIDException;
import fr.lip6.move.pnml.framework.utils.exception.VoidRepositoryException;

/**
 * <p>
 * This class gives you access to the different models under processing. This
 * class is a thread-safe singleton.
 * </p>
 * 
 * <p>
 * The usage is simple, at a given moment only one document is under use, to
 * work with another one you have to switch to another opened document.
 * </p>
 * 
 * <p>
 * This model repository offers workspaces. To each identified workspace is
 * attached an independent {@link ModelRepositoryUnit} with an (independent) id
 * generator. A {@link ModelRepositoryUnit} holds one Petri Net Document,
 * identified by the PetriNetDoc class of its corresponding Petri net type.
 * </p>
 * 
 * <p>
 * Unless you set the parallel property to true, there is a current active
 * workspace, the most recent one that was created. This enables the mode where
 * you could directly get the current workspace id, delete it, switch between
 * workspaces, etc.
 * </p>
 * 
 * <p>
 * If you set the parallel property to true, you will mostly get <code>null</code> when
 * trying to retrieve the current workspace id, or nothing will happen if you
 * try to delete the current workspace, or switch between workspaces, since all
 * are now active, by the virtue of setting that property to true. Please read the javadoc of
 * each method which deals with workspaces matter in order to know how it behaves in this case.
 * </p>
 * 
 * @author Guillaume Giffo
 * 
 */
public final class ModelRepository {

	private static final String NO_MODEL_REPOSITORY_UNIT_ASSOCIATED_TO_CURRENT_WORKSPACE = "There is no model repository unit associated to the current workspace in the repository.";

	private static final String NO_REGISTERED_MODELS_IN_REPOSITORY = "There is no registered models in the repository";

	private static final String DOT = ".";

	/**
	 * the map which contains document workspace's ids and associated document.
	 */
	private ConcurrentMap<String, ModelRepositoryUnit> documents;

	/**
	 * The current default ID.
	 */
	private String currentDocWSId;

	private boolean isParallel;

	private boolean isPrettyPrint;

	/**
	 * build the ModelRepository if necessary.
	 */
	private ModelRepository() {
		documents = new ConcurrentHashMap<String, ModelRepositoryUnit>();
		isParallel = false;
		currentDocWSId = null;
		isPrettyPrint = true;
	}

	/**
	 * Sets the current selected model.
	 * 
	 * @param documentWSId
	 *            the id of the Document Workspace to be set as current.
	 * @throws InvalidIDException
	 *             if the model id doesn't exists
	 * @deprecated use changeCurrentDocWorkspace instead
	 */
	public void setCurrentModel(String documentWSId) throws InvalidIDException {
		setCurrentDocWorkspace(documentWSId);
	}

	/**
	 * Sets the current selected document workspace.
	 * 
	 * @param documentWSId
	 *            the id of the Document Workspace to be set as current.
	 * @throws InvalidIDException
	 *             if the model id doesn't exists
	 * @deprecated use changeCurrentDocWorkspace instead
	 */
	public void setCurrentDocWorkspace(String documentWSId)
			throws InvalidIDException {

		changeCurrentDocWorkspace(documentWSId);
	}

	/**
	 * <p>Sets the current selected document workspace. This change is effective only if
	 * parallel property is not set.</p> 
	 * <p>In the situation where the Mode Repository is in the parallel mode,
	 * there is no central notion of current document workspace, except when retrieved
	 * by the current thread, provided its associated workspace was created using the thread id.
	 * </p>  
	 * 
	 * @param documentWSId
	 *            the id of the Document Workspace to be set as the current one.
	 * @throws InvalidIDException
	 *             if the model id doesn't exists
	 * @see #setParallelWorkspaces(boolean)
	 * @see #getCurrentDocWSId()
	 */
	public synchronized void changeCurrentDocWorkspace(String documentWSId)
			throws InvalidIDException {
		if (!documents.containsKey(documentWSId)) {
			throw new InvalidIDException("the Id " + documentWSId
					+ " is not registered");
		}
		if (!isParallel) {
			currentDocWSId = documentWSId;
		}
	}

	/**
	 * Gives the id of the currently used model.
	 * 
	 * @return an id
	 * @deprecated use getCurrentDocumentId() instead
	 */
	public String getCurrentModelId() {
		return getCurrentDocWSId();
	}

	/**
	 * Gives the id of the currently used document workspace.
	 * <p>If you set the model repository in parallel mode, you should have
	 * created the workspace with your thread id, so that this method makes a
	 * best effort in retrieving the workspace associated to the current thread id.
	 * Otherwise <code>null</code> will be returned.</p>
	 * 
	 * @return the id of the current active document workspace, <code>null</code> if none
	 * is active, or the ModelRepository is in parallel mode, and no workspace has been created
	 * using the current thread id.
	 */
	public String getCurrentDocWSId() {
		String res;
		if (currentDocWSId != null) {
			res = currentDocWSId;
		} else { // best effort
			if (documents.containsKey(String.valueOf(Thread.currentThread().getId()))) {
				res = String.valueOf(Thread.currentThread().getId());
			} else {
				res = null;
			}
		}
		return res;
	}

	/**
	 * Returns the instance of ModelRepository. Kept for upward compatibility
	 * reason, and is equivalent to normal instanciation using
	 * <code>new ModelRepository</code>. It is thread-safe.
	 * 
	 * @return a new instance
	 */
	public static synchronized ModelRepository getInstance() { // NOPMD by
		// ggiffo on
		// 7/17/08 5:49
		// PM

		return ModelRepositoryHolder.instance;
	}

	private static final class ModelRepositoryHolder {
		private static final ModelRepository instance = new ModelRepository();

		private ModelRepositoryHolder() {
		}
	}

	/**
	 * Creates a new model workspace into the repository, this model becomes the
	 * current one.
	 * 
	 * @param modelId
	 *            the model Id
	 * @return the new model Id
	 * @throws InvalidIDException
	 *             if the id is already used
	 * @deprecated use createDocumentWorkspace(String modelId)
	 */
	public String createModelWorkspace(String modelId)
			throws InvalidIDException {
		return createDocumentWorkspace(modelId);
	}

	/**
	 * <p>Creates a new model workspace into the repository, with no PetriNetDoc
	 * associated (as {@link HLAPIRootClass}). This workspace becomes the
	 * current one, if parallel property is not set.</p>
	 * <p>If you set the parallel property to true, you should <strong>create each document
	 * workspace using your thread id</strong>, to facilitate later a best effort retrieval of the
	 * workspace of that thread by the Model Repository.</p>
	 * 
	 * @param docWorkspaceId
	 *            the model Id
	 * @return the new model Id
	 * @throws InvalidIDException
	 *             if the id is already used
	 * @see #getCurrentDocWSId()
	 */
	public synchronized String createDocumentWorkspace(String docWorkspaceId)
			throws InvalidIDException {
		if (documents.containsKey(docWorkspaceId)) {
			throw new InvalidIDException("the Id " + docWorkspaceId
					+ " is already used");
		}
		final IdRepository idrep = new IdRepository();
		final ModelRepositoryUnit mep = new ModelRepositoryUnit(idrep, null);
		documents.put(docWorkspaceId, mep);

		changeCurrentDocWorkspace(docWorkspaceId);

		return docWorkspaceId;
	}

	/**
	 * Creates a new model workspace into the repository, this model became the
	 * current one.
	 * 
	 * @param modelId
	 *            the model Id
	 * @param petriNetDoc
	 *            the petriNetdoc object, root of the registered model.
	 * @return the model Id
	 * @throws InvalidIDException
	 *             if the id is already used
	 * @deprecated use {@link #createModelWorkspace(String, HLAPIRootClass)}
	 *             instead
	 */
	public String createModelWorkspace(String modelId,
			HLAPIRootClass petriNetDoc) throws InvalidIDException {
		return createDocumentWorkspace(modelId, petriNetDoc);
	}

	/**
	 * <p>Creates a new model workspace into the repository, with a PetriNetDoc
	 * associated, as {@link HLAPIRootClass}. This model (and its workspace)
	 * becomes the current active one in the model repository, if parallel
	 * property is not set.</p>
	 * <p>If you set the parallel property to true, you should <strong>create each document
	 * workspace using your thread id</strong>, to facilitate a best effort retrieval of the
	 * workspace of that thread by the Model Repository.</p>
	 * 
	 * @param docWorkspaceId
	 *            an id to give to this document workspace
	 * @param petriNetDoc
	 *            the petriNetdoc object, root of the registered model.
	 * @return the workspace Id that is provided in the argument
	 * @throws InvalidIDException
	 *             if the id is already used
	 * @see #changeCurrentDocWorkspace(String)
	 * @see #getCurrentDocWSId()
	 */
	public synchronized String createDocumentWorkspace(String docWorkspaceId,
			HLAPIRootClass petriNetDoc) throws InvalidIDException {
		if (documents.containsKey(docWorkspaceId)) {
			throw new InvalidIDException("the Id " + docWorkspaceId
					+ " is already used");
		}
		final IdRepository idrep = new IdRepository();
		final ModelRepositoryUnit mep = new ModelRepositoryUnit(idrep,
				petriNetDoc);
		documents.put(docWorkspaceId, mep);
		changeCurrentDocWorkspace(docWorkspaceId);
		return docWorkspaceId;
	}

	/**
	 * <p>Same as {@link #createModelWorkspace(String, HLAPIRootClass)}, but this
	 * time with the root PetriNetDoc object typed as an EObject (EMF).</p>
	 * 
	 * <p>If you set the parallel property to true, you should <strong>create each document
	 * workspace using your thread id</strong>, to facilitate a best effort retrieval of the
	 * workspace of that thread by the Model Repository.</p>
	 * @param docWorkspaceId
	 * @param petriNetDoc
	 * @throws InvalidIDException
	 * @see {@link #getCurrentDocWSId()}
	 */
	public synchronized void createDocumentWorkspace(String docWorkspaceId,
			EObject petriNetDoc) throws InvalidIDException {
		if (documents.containsKey(docWorkspaceId)) {
			throw new InvalidIDException("the Id " + docWorkspaceId
					+ " is already used.");
		}
		final IdRepository idrep = new IdRepository();
		final ModelRepositoryUnit mep = new ModelRepositoryUnit(petriNetDoc,
				idrep);
		documents.put(docWorkspaceId, mep);
		changeCurrentDocWorkspace(docWorkspaceId);

	}

	/**
	 * Destroys current modelWorkspace data about a registered model, the
	 * current model ID becomes null.
	 * 
	 * @return the number of left opened models.
	 * @throws VoidRepositoryException
	 *             if the repository is void
	 * @deprecated use destroyCurrentDocumentWorkspace() instead
	 */
	public int destroyCurrentModelWorkspace() throws VoidRepositoryException {
		return destroyCurrentWorkspace();
	}

	/**
	 * <p>Destroys the current model workspace data about a registered model, the
	 * current workspace ID becomes <code>null</code>. This change is immediately effective only if
	 * parallel property is not set.</p>
	 * <p>If parallel property is set, this method will try to find your current workspace using
	 * your current thread id, and then remove it from the repository of workspaces. Nothing will 
	 * happen otherwise. This means it could not find any workspace previously created using your
	 * current thread id.</p>
	 * 
	 * @return the number of left opened workspaces.
	 * @throws VoidRepositoryException
	 *             if the repository is void
	 * @see #reset()
	 * @see #areWorkspacesParallel()
	 * @see #getCurrentDocWSId()
	 */
	public synchronized int destroyCurrentWorkspace()
			throws VoidRepositoryException {
		// final String modelId = getCurrentDocWSId();
		if (documents == null || documents.isEmpty()) {
			throw new VoidRepositoryException(
					"there is no registered models in the repository"); // NOPMD
			// by
			// ggiffo
			// on
			// 9/9/08
			// 10:49
			// AM
		}
		if (!isParallel) {
			if (currentDocWSId != null) {
				documents.remove(currentDocWSId);
			}
		} else { // best effort
			String toBeRemoved = String.valueOf(Thread.currentThread().getId());
			if (documents.containsKey(toBeRemoved)) {
				documents.remove(toBeRemoved);
			} 
		}
		currentDocWSId = null; // NOPMD by ggiffo on 7/17/08 5:48 PM
		return documents.size();
	}

	/**
	 * Returns the {@link IdRepository} associated to the current workspace.
	 * <p>If the Model Repository in parallel model, will try to retrieve the Id Rpository
	 * using the current thread id to first find the corresponding workspace, then fetch the 
	 * associated Id Repository</p>
	 * 
	 * @return the model IdRepository
	 * @throws VoidRepositoryException
	 *             if the repository is empty
	 * @see fr.lip6.move.pnml.framework.utils.IdRepository
	 */
	public synchronized IdRepository getCurrentIdRepository()
			throws VoidRepositoryException {
		if (documents == null || documents.isEmpty()) {
			throw new VoidRepositoryException(
					"there is no registered models in the repository");
		}
		IdRepository rep = null;
		if (!isParallel) {
			rep = documents.get(getCurrentDocWSId()).getIdrep();
		} else {
			String currentThreadWS = getCurrentDocWSId();
			if (currentThreadWS != null) {	
				rep = documents.get(currentThreadWS).getIdrep();
			}
		}
		return rep;
	}

	/**
	 * Returns the root class associated to the current model in the current
	 * workspace. This invocation will return <code>null</code> is all
	 * workspaces are active simultaneously (i.e. parallel property is set), or
	 * there is no workspace at all.
	 * 
	 * @return the model root object as HLAPIRootClass (null if not set).
	 * @throws VoidRepositoryException
	 *             if the repository is void
	 * @see fr.lip6.move.pnml.framework.hlapi.HLAPIRootClass
	 * @see #areWorkspacesParallel()
	 */
	public synchronized HLAPIRootClass getCurrentHLAPIRootClass()
			throws VoidRepositoryException {
		if (documents == null || documents.isEmpty()) {
			throw new VoidRepositoryException(
					"there is no registered models in the repository");
		}
		HLAPIRootClass hrc = null;
		if (!isParallel) {
			if (currentDocWSId != null) {
				ModelRepositoryUnit mru = documents.get(currentDocWSId);
				hrc = mru.getPetriNetDoc();
			}
		}
		return hrc;
	}

	/**
	 * Returns the root class associated to the current model in the current
	 * workspace. This invocation will return <code>null</code> is all
	 * workspaces are active simultaneously (i.e. parallel property is set), or
	 * there is no workspace at all.
	 * 
	 * @return the model root object as EObject (null if not set).
	 * @throws VoidRepositoryException
	 *             if the repository is void
	 * @see #getCurrentHLAPIRootClass()
	 * @see #areWorkspacesParallel()
	 */
	public synchronized EObject getCurrentEObjectRootClass()
			throws VoidRepositoryException {
		if (documents == null || documents.isEmpty()) {
			throw new VoidRepositoryException(
					"there is no registered models in the repository");
		}
		EObject rc = null;
		if (!isParallel) {
			if (currentDocWSId != null) {
				ModelRepositoryUnit mru = documents.get(currentDocWSId);
				rc = mru.getPetriNetDocEObject();
			}
		}
		return rc;
	}

	/**
	 * <p>
	 * Sets the provided PetriNet Document (PetriNetDocHLAPI of a PN Type) as HLAPIRootClass
	 * associated to the current active workspace. If the current active
	 * workspace already holds a reference to an existing PetriNet Document,
	 * that existing reference is replaced by the provided new one.
	 * </p>
	 * <p>
	 * This change is effective is parallel property is not set, or there is no
	 * current active workspace. In the latter case, a new workspace with a
	 * random-generated id is automatically created for you and the PetriNet Document
	 * associated to it. That newly created workspace becomes the current one.
	 * </p>
	 * <p>
	 * So when you are using this API, make sure you have not set parallel
	 * property to true before this invocation.
	 * </p>
	 * 
	 * @param hrc
	 *            : the root class
	 * @throws VoidRepositoryException
	 *             if the repository is void or there is no model repository
	 *             unit associated to the current active workspace.
	 * @see fr.lip6.move.pnml.framework.hlapi.HLAPIRootClass
	 * @see #areWorkspacesParallel()
	 */
	public synchronized void setCurrentHLAPIRootClass(HLAPIRootClass hrc)
			throws VoidRepositoryException {
		if (documents == null || documents.isEmpty()) {
			throw new VoidRepositoryException(
					NO_REGISTERED_MODELS_IN_REPOSITORY);
		}
		if (!isParallel) {
			ModelRepositoryUnit mru;
			String current = getCurrentDocWSId();
			if (current != null) {
				mru = documents.get(current);
				if (mru != null) {
					mru.setPetriNetDoc(hrc);
				} else {
					new VoidRepositoryException(
							NO_MODEL_REPOSITORY_UNIT_ASSOCIATED_TO_CURRENT_WORKSPACE);
				}
			} else {
				final Random r = new Random(new Date().getTime());
				String wksId = hrc.getClass().getCanonicalName() + DOT + r.nextLong();
				try {
					createDocumentWorkspace(wksId, hrc);
				} catch (InvalidIDException e) {
					// second and last tentative
					wksId = hrc.getClass().getCanonicalName() + DOT  + r.nextLong();
					try {
						createDocumentWorkspace(wksId, hrc);
					} catch (InvalidIDException e1) {
						throw new VoidRepositoryException(
								"Could not automatically create new workspace: "
										+ e1.getMessage());
					}
				}
			}
			// documents.get(getCurrentDocWSId()).setPetriNetDoc(hrc);
		}
	}

	/**
	 * <p>
	 * Sets the root class (PetriNetDoc of a PN Type) as an EMF's Eobject,
	 * associated to the current workspace.
	 * </p>
	 * <p>
	 * This change is effective is parallel property is not set, or there is no
	 * current active workspace. In the latter case, a new workspace with a
	 * random-generated id is automatically created for you and the model
	 * associated to. That new workspace becomes the current one.
	 * </p>
	 * <p>
	 * So when you are using this API, make sure you have not set parallel
	 * property before this invocation.
	 * </p>
	 * 
	 * @param rc
	 *            : the root class
	 * @throws VoidRepositoryException
	 *             if the repository is void or there is no model repository
	 *             unit associated to the current active workspace.
	 * @see #setCurrentHLAPIRootClass(HLAPIRootClass)
	 * @see #areWorkspacesParallel()
	 */
	public synchronized void setCurrentEObjectRootClass(EObject rc)
			throws VoidRepositoryException {
		if (documents == null || documents.isEmpty()) {
			throw new VoidRepositoryException(
					NO_REGISTERED_MODELS_IN_REPOSITORY);
		}
		if (!isParallel) {
			ModelRepositoryUnit mru;
			String current = getCurrentDocWSId();
			if (current != null) {
				mru = documents.get(current);
				if (mru != null) {
					mru.setPetriNetDocEObject(rc);
				} else {
					new VoidRepositoryException(
							NO_MODEL_REPOSITORY_UNIT_ASSOCIATED_TO_CURRENT_WORKSPACE);
				}
			} else {
				final Random r = new Random(new Date().getTime());
				String wksId = rc.getClass().getCanonicalName() + DOT  + r.nextLong();
				try {
					createDocumentWorkspace(wksId, rc);
				} catch (InvalidIDException e) {
					// second and last tentative
					wksId = rc.getClass().getCanonicalName() + DOT + r.nextLong();
					try {
						createDocumentWorkspace(wksId, rc);
					} catch (InvalidIDException e1) {
						throw new VoidRepositoryException(
								"Could not automatically create new workspace: "
										+ e1.getMessage());
					}
				}
			}
		}
	}

	/**
	 * Gives all registered workspace id's.
	 * 
	 * @return a set of registered ids.
	 */
	public Set<String> getRegisteredModelsId() {
		return documents.keySet();
	}

	/** *********************pretty print tools*********************** */

	/**
	 * Sets pretty print use, on the current workspace. If there is no current
	 * workspace (all are parallel) or no workspace at all, sets the pretty
	 * print status as a the current global default.
	 * 
	 * @param status
	 *            a boolean.
	 */
	public synchronized void setPrettyPrintStatus(boolean status) {
		ModelRepositoryUnit mru;
		String current = getCurrentDocWSId();
		if (current != null && !isParallel) {
			mru = documents.get(current);
			if (mru != null) {
				mru.setPrettyPrint(status);
			} else {
				isPrettyPrint = status;
			}

		} else if (isParallel) {
			for (Entry<String, ModelRepositoryUnit> ent : documents.entrySet()) {
				mru = ent.getValue();
				if (mru != null) {
					mru.setPrettyPrint(status);
				}
			}
		} else {
			isPrettyPrint = status;
		}
		// documents.get(getCurrentDocWSId()).setPrettyPrint(status);
	}

	/**
	 * Gets pretty print use status. Returns either the pretty print status for
	 * the current workspace or the current global default, if all workspaces
	 * are parallel or there aren't any.
	 * 
	 * @return the boolean representing the status.
	 */
	public boolean isPrettyPrintActive() {
		ModelRepositoryUnit mru;
		boolean result = isPrettyPrint;
		String current = getCurrentDocWSId();
		if (currentDocWSId != null && !isParallel) {
			synchronized (currentDocWSId) {
				mru = documents.get(current);
				if (mru != null) {
					result = mru.isPrettyPrint();
				}
			}
		}
		// documents.get(getCurrentDocWSId()).isPrettyPrint();
		return result;
	}

	/**
	 * Gets Pretty Print Data, either from the current active document
	 * workspace, or a global default (newly created) if no active workspace or
	 * no workspace at all.
	 * 
	 * @return PrettyPrintData
	 */
	public PrettyPrintData getPrettyPrintData() {
		PrettyPrintData ppd = null;
		if (currentDocWSId != null) {
			synchronized (currentDocWSId) {
				ppd = documents.get(currentDocWSId).getPrettyPrinter();
			}
		} else {
			ppd = new PrettyPrintData();
		}
		return ppd;
	}

	/**
	 * <p>
	 * Sets if the model repository should hold all workspaces as being active
	 * in parallel. In the positive case, there is no more the notion of
	 * <em>current active workspace</em>.
	 * </p>
	 * <p>
	 * Consequently, any subsequent call to workspace-specific method will not be
	 * effective. {@link #getCurrentDocWSId()} will look for the current workspace based
	 * on the current thead id, and return that workspace if any, <code>null</code> otherwise.
	 * </p>
	 * 
	 * @param mode
	 * @return
	 * @see #getCurrentDocWSId()
	 */
	public synchronized void setParallelWorkspaces(boolean mode) {
		this.isParallel = mode;
		if (isParallel) {
			currentDocWSId = null;
		}
	}

	/**
	 * <p>
	 * Returns whether all workspaces are set to be simultaneously active by
	 * default (true), or if just one workspace is active at a time (false).
	 * </p>
	 * 
	 * <p>
	 * Default behavior is false, if you have not set this property previously.
	 * </p>
	 * 
	 * @return true if all workspaces are active simultaneously, or false if the
	 *         notion of <em>current active workspace</em> is the one being used
	 *         by the model repository.
	 */
	public boolean areWorkspacesParallel() {
		return isParallel;
	}

	/** *****************end of pretty print tools******************* */

	/**
	 * Gives the number of currently opened Workspaces, just the total hold by
	 * the model repository. It is not linked to whether these workspaces are
	 * all active or not.
	 * 
	 * @return this number.
	 */
	public int size() {
		return documents.size();
	}

	/**
	 * Destroys the content of the model repository: all workspaces are removed
	 * and there is no current workspace. Parallel property is set to its
	 * default (false). Global pretty print status is also set to its default
	 * (true).
	 */
	public synchronized void reset() {
		// TODO avoid null usage
		documents.clear(); // NOPMD by ggiffo on 7/17/08 5:48 PM
		currentDocWSId = null;
		isParallel = false;
		isPrettyPrint = true;
	}
}
