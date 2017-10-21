
import java.net.*;
import java.io.*;

public class Client {
	
	public static void main(String[] args) {
		
		System.out.println("Hello Server!....");
		
		try {
			//connection to the server listening on port 5001
			Socket socket = new Socket("localhost", 5002);
			
			//set up output stream from the SERVER
//			PrintWriter out = new PrintWriter(socket.getOutputStream(),true);
//			
//			//set up buffer for the input from the CLIENT
//			BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//
//			System.out.println(input.readLine());
//			out.println("hello Server!");
//			
//			input.close();
//			out.close();
			socket.close();
		
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}//end main

}//end class
