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
/**
 *
 */

package fr.lip6.move.pnml.framework.utils;

import java.util.Date;
import java.util.HashSet;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import fr.lip6.move.pnml.framework.utils.exception.InvalidIDException;
import fr.lip6.move.pnml.framework.utils.exception.OtherException;

/**
 * This class registers all couples id/object of a document.
 * This class is thread-safe
 * 
 * @author bbouzerau
 * @author Guillaume Giffo
 */
public final class IdRepository {
	/**
	 * @type long
	 */
	private static final long LIMIT_LOOP = 1000000000L;
	

	/**
	 * @type Map
	 */
	private ConcurrentMap<String, Object> myHash; // NOPMD by ggiffo on 7/1/08
	/**
	 * To keep track of how many times we are trying to find a prefix.
	 * Prevents infinite loop by setting upper bound to LIMIT_LOOP.
	 */
	private static long prefixTentatives = 0L;
	
	// 9:42 AM

	/**
	 * @param none
	 */
	public IdRepository() {
		myHash = new ConcurrentHashMap<String, Object>();
	}

	/**
	 * Erase the content of the Id repository
	 */
	public final void eraseIt() {
		myHash.clear();
	}

	/**
	 * Checks id availability, if the id doesn't exist before then registers the
	 * couple Id/object, else an error is thrown.
	 * 
	 * @param myId
	 *            suffix key
	 * @param obj
	 *            the object which has this id
	 * @throws InvalidIDException
	 *             raise exception if invalid id
	 * @return a string
	 */
	public final synchronized String checkId(String myId, Object obj)
			throws InvalidIDException {

		String objName =  obj.getClass().getCanonicalName();
		// check if id is well formated
		if (myId == null) {
				throw new InvalidIDException("The ID can't be null (" + objName +")");
		} else if ("".equals(myId)) {
				throw new InvalidIDException("The ID can't be void (" + objName +")");
		} else if (java.lang.Character.isDigit((char) myId.charAt(0))) {
			throw new InvalidIDException(
					"The ID can't begin with a digit (" + objName +")");
		} else {
			// insert key if it does'nt exist in hashlist
			if (myHash.containsKey(myId)) {
				throw new InvalidIDException("this id '" + myId
						+ " (" + objName +") already exists in the model : \""
						+ ModelRepository.getInstance().getCurrentDocWSId()
						+ "\"");
			} else {
				myHash.put(myId, obj);
			}
		}
		return myId;
	}

	/**
	 * Generates an unused id and link an object to it.
	 * The generated id must be XML-compliant (NCName), 
	 * so the prefix must not start with a digit.
	 * 
	 * @param prefix
	 *            a prefix for the id, must begin with a letter, may be pnml
	 *            object type.
	 * @param obj
	 *            the object which will be linked to this id.
	 * @throws InvalidIDException
	 *             raise exception if a problem occurs, typically the prefix
	 *             is null, empty, or begins with a digit.
	 * @return a string (the generated Id)
	 * @see #generateFreeId(Object)
	 */
	public synchronized final String generateFreeId(String prefix, Object obj)
			throws InvalidIDException {
		
		/*
		 * check if pnml type is not an empty string or begin by a character
		 */
		if (prefix == null) {
			throw new InvalidIDException("please give a prefix");
		} else if ("".equals(prefix)) {
			throw new InvalidIDException("please give a prefix");
		} else if (java.lang.Character.isDigit(prefix.charAt(0))) {
			throw new InvalidIDException("the prefix can't begin with a digit");
		}
		
		return generateId(prefix, obj);
	}

	/**
	 * Generates an unused id and link an object to it. The generated id
	 * is XML-compliant. It is thus a NCName.
	 * @param obj  the object that will be linked to this id.
	 * @return the generated id
	 * @throws InvalidIDException 
	 * @see #generateFreeId(String, Object)
	 */
	public final synchronized String generateFreeId(Object obj) throws InvalidIDException {
		String prefix = generatePrefix();
		return generateId(prefix, obj);
	}
	
	/**
	 * Generates an id with a provided prefix.
	 * @param prefix
	 * @param obj
	 * @return
	 * @throws InvalidIDException
	 */
	private final synchronized String generateId(String prefix, Object obj) throws InvalidIDException {
		final Random generator = new Random(new Date().getTime());
		long rand = generator.nextLong();
		String myId = prefix + rand;

		for (int i = 0; i < LIMIT_LOOP; i++) {
			if (myHash.containsKey(myId)) {
				rand = Math.abs(generator.nextLong());
				myId = prefix + rand;
			} else {
				myHash.put(myId, obj);
				break;
			}
			if (i == LIMIT_LOOP) {
				throw new InvalidIDException("can't give any free id");
			}
		}

		return myId;
	}
	
	/**
	 * Generates a prefix.
	 * @return
	 */
	public final String generatePrefix() {
		String prefix = Long.toHexString(Double.doubleToLongBits(Math.random()));
		String res = null;
		int i;
		for(i = 0; i < prefix.length(); i++) {
			if (java.lang.Character.isLetter(prefix.charAt(i))) {
				break;
			}
		}
		if (i < prefix.length()) {
			res = prefix.substring(i);
		}
		else {//try limit times
			 	prefixTentatives++;
			 	if (prefixTentatives < LIMIT_LOOP) {
			 		res = generatePrefix();
			 	}
			 	// otherwise, will return null. Reset tentatives count.
			 	prefixTentatives = 0L;
		}
		return res;
	}
	
	/**
	 * Returns the object with the given id.
	 * 
	 * @param theId
	 *            the id to find.
	 * @return an Object to cast to PnObject from the package your working with.
	 * @throws InvalidIDException
	 *             if no object with this id is found.
	 */
	public final synchronized Object getObject(String theId)
			throws InvalidIDException {
		if (!myHash.containsKey(theId)) {
			throw new InvalidIDException("No object with id " + theId
					+ " found");
		}
		return myHash.get(theId);
	}

	/**
	 * Removes an id/object association from the id repository.
	 * 
	 * @param theId
	 *            the id to remove
	 * @return the object previously associated with this id
	 * @throws InvalidIDException
	 *             if the id doesn't exists
	 */
	public final synchronized Object remove(String theId) throws InvalidIDException {
		if (!myHash.containsKey(theId)) {
			throw new InvalidIDException("the id " + theId + " doesn't exists");
		}
		return myHash.remove(theId);
	}

	/**
	 * Changes the id associated of an object.
	 * 
	 * @param oldId
	 *            the id to change
	 * @param newId
	 *            the new id to give
	 * @return the new id
	 * @throws InvalidIDException
	 *             if the old id doesn't exists or if the new one is already
	 *             used
	 */
	public final synchronized String changeId(String oldId, String newId)
			throws InvalidIDException {
		if (myHash.containsKey(newId)) {
			throw new InvalidIDException("the new id " + newId
					+ " already exists");
		}
		final Object obj = remove(oldId);
		myHash.put(newId, obj);
		return newId;
	}

	/**
	 * Changes the associated id of an object.
	 * 
	 * @param obj
	 *            the object of which id must be change
	 * @param newId
	 *            the new id to give to the object
	 * @return the new id.
	 * @throws OtherException
	 *             if the object doesn't exist.
	 * @throws InvalidIDException
	 *             if the new id is not valid
	 */
	public final synchronized String changeId(Object obj, String newId)
			throws OtherException, InvalidIDException {
		if (!myHash.containsValue(obj)) {
			throw new OtherException("Object " + obj + " not found");
		}
		String objid = null;
		for (String iterable : myHash.keySet()) {
			if (myHash.get(iterable).equals(obj)) {
				objid = iterable;
				break;
			}
		}
		return changeId(objid, newId);
	}

	/**
	 * 
	 * @return All registered ids
	 */
	public final Set<String> getAllId() {
		return myHash.keySet();
	}

	/**
	 * 
	 * @return a copy of contained map
	 */
	public final Map<String, Object> getMap() {
		return new ConcurrentHashMap<String, Object>(myHash);
	}

	/**
	 * Returns true if no id are common between current and given IdRepository.
	 * 
	 * @param otherIdRep
	 *            the repository to compare with current one
	 * @return true if no common id is found between the two IdRepository
	 */
	public final synchronized Boolean isCompatible(IdRepository otherIdRep) {
		final Set<String> compare = new HashSet<String>();
		compare.addAll(this.getAllId());
		compare.retainAll(otherIdRep.getAllId());
		return compare.isEmpty();
	}

	/**
	 * Returns true if no id are common between current and given IdRepository.
	 * 
	 * @param otherIdRep
	 *            the repository to fuse with current one
	 * @return true if fuse success, false if failed
	 */
	public final synchronized boolean fuseWith(IdRepository otherIdRep) {
		final boolean retour = isCompatible(otherIdRep);
		if (retour) {
			this.myHash.putAll(otherIdRep.getMap());
		}
		return retour;
	}
}
