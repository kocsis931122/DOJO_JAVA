package dojo2;

import java.io.ObjectInputStream;
import java.net.Socket;

public class HumanClient {
	public static void main(String[] args) {
		try {
			System.out.println("Client started");
			Socket client = new Socket("localhost", 7720);
			System.out.println("Client connected");

			ObjectInputStream streamFromServer = new ObjectInputStream(client.getInputStream());
			Human ezjott = (Human) streamFromServer.readObject();
			System.out.println(ezjott);
			streamFromServer.close();
			client.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
