package dojo2;

import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class HumanServer {

	ServerSocket serversocket;

	public HumanServer() {
		try {
			System.out.println("Server started");
			serversocket = new ServerSocket(7720);
			System.out.println("Waiting...");
			Socket server = serversocket.accept();
			System.out.println("Client cnx accepted");

			ObjectOutputStream streamToClient = new ObjectOutputStream(server.getOutputStream());
			Human pisti = new Human("Pisti", 25, 1.80, 80);
			streamToClient.writeObject(pisti);

			streamToClient.close();
			server.close();
			serversocket.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		new HumanServer();
	}
}
