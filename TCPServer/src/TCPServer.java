import java.net.*;
import java.util.Date;
import java.io.*;
public class TCPServer {
	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(5000,10);
			
			Socket connection = server.accept();
			
			ObjectOutputStream out = new ObjectOutputStream(connection.getOutputStream());
			ObjectInputStream in = new ObjectInputStream(connection.getInputStream());
			Date now = new Date();
			while(true) {
				
				String date = now.toString();
				date += InetAddress.getByName("localhost");
				out.writeObject(date);
			
			}
			
			
	
			
			//connection.close();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		
		
	}
}
