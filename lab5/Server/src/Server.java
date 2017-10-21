
import java.net.*;
import java.io.*;

public class Server {
	
	public static void main(String [] args) {
		
		try {
			
			ServerSocket serverSocket = new ServerSocket(5000);
			System.out.println("waiting on client....");
			Socket socket = serverSocket.accept();
				
			DataInputStream in = new DataInputStream(socket.getInputStream());
			DataOutputStream out = new DataOutputStream(socket.getOutputStream());
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			String msgin="";
			String msgout="";
			
			
			
			while(!msgin.equals("0")) {
				msgin = in.readUTF();
				
				System.out.println("CLIENT: " + msgin);
			
				msgout = br.readLine();
				out.writeUTF(msgout);
				out.flush();
				
			}
			
			socket.close();
			
		}
		catch(Exception e) {
			System.out.println(e.toString());
		}
	
			
	}//end main

}//end server class
