import java.net.*;
import java.io.*;
public class TCPClient {
	public static void main(String[] args) {
		try {
			Socket socket = new Socket("localhost", 5000);
			
			ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
			ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
			
			String receive = "";
			try {
				
				while(true) {
					
					receive = (String) in.readObject();
					System.out.println(receive);
				}
			
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
