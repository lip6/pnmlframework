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
package fr.lip6.pnml.validation.client;

import java.awt.EventQueue;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;
import java.nio.channels.Channels;
import java.nio.channels.SocketChannel;
import java.util.Scanner;

import fr.lip6.move.pnml.validation.exceptions.ExitException;

/**
 * Simple client example to interact with the server, in the server execution
 * mode. It just connects to the server, send a file, waits for the result, and
 * closes the connections once it has got it.
 * @author lom
 */
public class ConcurrentValidationClient {
	/**
	 * Port of the server to which the client connects to.
	 */
	private static final int SERVER_PORT = 10002;

	/**
	 * Package-scope constructor.
	 */
	protected ConcurrentValidationClient() {
		super();
	}

	/**
	 * @param args the arguments.
	 * @throws IOException input output problem
	 * @throws ExitException exits with trouble
	 */
	public static void main(String[] args) throws IOException, ExitException {

		final File pFile = new File("resources/philo.pnml");
		// File pFile = new File("resources/pnmlValidationService.pdf");
		// byte[] addr = { (byte) 192, (byte) 168, 0, 58 };
		// File[] files = pFile.listFiles();
		final StringBuffer fileContent = new StringBuffer();
		try {
			System.out.println("Client: reading file " + pFile.getCanonicalPath());
			final Scanner fileIn = new Scanner(new FileInputStream(pFile));

			while (fileIn.hasNextLine()) {
				fileContent.append(fileIn.nextLine());
			}
			// System.out.println("Client: " + fileContent);
			fileIn.close();
		} catch (IOException ioe) {
			ioe.printStackTrace();
			throw new ExitException(ExitException.EXIT_CODE3);
		}
		SocketChannel mySocket = null;
		Scanner in = null;
		final StringBuffer serverResponse = new StringBuffer();
		try {
			mySocket = SocketChannel.open(new InetSocketAddress("localhost", SERVER_PORT));
			// InetAddress.getByName("localhost"),serverPort);
			// mySocket = new Socket(InetAddress.getByAddress(addr), 4444);
			final PrintWriter out = new PrintWriter(Channels.newOutputStream(mySocket), true);
			in = new Scanner(mySocket);

			out.println(fileContent.toString());

			mySocket.socket().shutdownOutput();
			String line;

			while (in.hasNextLine()) {
				line = in.nextLine();
				// if (line.trim().equals("BYE"))
				// break;
				serverResponse.append(line + "\n");
				// System.out.println("Client Received : " + line);

			}

			System.out.println("Response from server: \n" + serverResponse.toString());

		} catch (UnknownHostException e) {
			System.err.println("Client: don't know anything about specified host");
			System.exit(-1);
		} catch (IOException e) {
			System.err.println("Client: couldn't get I/O for the connection to the specified host.");
			e.printStackTrace();
			throw new ExitException(ExitException.EXIT_CODE2);
		} finally {
			if (mySocket != null) {
				mySocket.close();
			}
			System.err.println("Channel closed");
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					serverResponse.append("Channel closed\n");

				}

			});
		}

	}
}
