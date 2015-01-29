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
package fr.lip6.move.pnml.validation.stats;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.LogRecord;

import javax.swing.Timer;

/**
 * Sets a timer for each new submitted task. If the corresponding thread is
 * already known, then only its timer is set anew.
 * @author lom
 */
public class ConcurrentCheckTimer implements Runnable {

	/**
	 * Constant 1000.
	 */
	private static final int MILLE = 1000;
	/**
	 * Thread type.
	 */
	private static final String THREAD_TYPE = "Timer thread ";
	/**
	 * the main thread enqueue here newly submitted validation tasks.
	 */
	private final BlockingQueue<Future<String>> fileCheckers;
	/**
	 * logs messages must be enqueue here for the logger.
	 */
	private final BlockingQueue<LogRecord> logs;
	/**
	 * A timer for each new task. Id is its hashcode.
	 */
	private final ConcurrentHashMap<String, Timer> timerOnCheckers;
	/**
	 * A mapping between a task and its hashcode.
	 */
	private final ConcurrentHashMap<String, Future<String>> checkers;

	/**
	 * Thread ID.
	 */
	private String myID;
	/**
	 * Tasks delay set by the user (millisec).
	 */
	private final int delay;

	/**
	 * Constructor.
	 * @param pnmlFileCheckers the queue of the validation threads
	 * @param theLogs the logs queue
	 * @param tdelay tasks delay
	 */
	public ConcurrentCheckTimer(BlockingQueue<Future<String>> pnmlFileCheckers, BlockingQueue<LogRecord> theLogs, int tdelay) {
		this.fileCheckers = pnmlFileCheckers;
		this.logs = theLogs;
		this.checkers = new ConcurrentHashMap<String, Future<String>>();
		this.timerOnCheckers = new ConcurrentHashMap<String, Timer>();
		this.delay = tdelay * MILLE;
	}

	/**
	 * The timer main loop.
	 */
	public final void run() {
		try {
			myID = String.valueOf(Thread.currentThread().getId());
			logs.put(new LogRecord(Level.INFO, THREAD_TYPE + this.myID + ": started. Tasks delay is set to " + delay / MILLE + " sec."));

			try {
				while (!Thread.currentThread().isInterrupted()) {
					final Future<String> aChecker = this.fileCheckers.take(); // blocking
					final Timer cTimer = new Timer(delay, null);
					cTimer.setRepeats(false);
					final String checkerHashcode = String.valueOf(aChecker.hashCode());
					cTimer.setActionCommand(checkerHashcode);
					cTimer.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							try {
								final String actionCommand = e.getActionCommand();
								final Future<String> timeLimitedChecker = checkers.get(actionCommand);
								if (timeLimitedChecker != null) {
									if (!timeLimitedChecker.isDone()) {
										timeLimitedChecker.cancel(true);
										logs.put(new LogRecord(Level.SEVERE, THREAD_TYPE + myID + ": Asked cancellation of task " + actionCommand));
									}
								}
								checkers.remove(actionCommand);
								timerOnCheckers.remove(actionCommand);
							} catch (InterruptedException exc) {
								exc.printStackTrace();
							} catch (Exception e2) {
								e2.printStackTrace();
							}
						}

					});
					if (!this.checkers.containsKey(checkerHashcode)) {
						this.checkers.put(checkerHashcode, aChecker);
					}
					if (this.checkers.containsKey(checkerHashcode)) {
						this.timerOnCheckers.remove(checkerHashcode);
					}
					this.timerOnCheckers.put(checkerHashcode, cTimer);
					cTimer.start();

					logs.put(new LogRecord(Level.INFO, THREAD_TYPE + this.myID + ": Set timer for task " + checkerHashcode + ":"
							+ aChecker.getClass().getName()));
				}

			} catch (InterruptedException iex) {
				logs.put(new LogRecord(Level.SEVERE, THREAD_TYPE + this.myID + ": got interrupted: " + iex.getMessage()));
				return;
			}
		} catch (InterruptedException ie) {
			ie.printStackTrace();
			return;
		}
	}
}
