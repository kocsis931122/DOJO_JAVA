package senddata;

import java.io.InputStream;
import java.net.Socket;

public class Client {
	public static void main(String[] args) {
		Socket clientSocket;
		try {
			clientSocket = new Socket("localhost", 1234);
			InputStream streamToClient = clientSocket.getInputStream();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
