package tcpclienttext;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientTextApplication{

	public static void main(String[] args) 
			throws UnknownHostException, IOException {
		
		try {
	
		Socket socket = new Socket(InetAddress.getLocalHost(), 4221);
		
		
		// Read from network
		DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
		
		// Display the word amount
		int wordAmount = dataInputStream.readInt();
		System.out.println("The sentence contains "+ wordAmount + " words");
		
		// Close everything
		dataInputStream.close();
		//socket.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
