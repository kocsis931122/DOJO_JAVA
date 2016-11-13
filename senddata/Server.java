package senddata;

import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {
		ServerSocket serverSocket;
		try {
			serverSocket = new ServerSocket(1234);
			Socket socket = serverSocket.accept();
			OutputStream ops = socket.getOutputStream();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
