import java.net.*;
import java.io.*;

class ClientThread extends Thread {
	private Socket socket = null;
	public static int num = 1;
	public int clientnum = 0;
	
	public ClientThread (Socket socket) {
		this.socket = socket;
		clientnum = num;
		
		this.num ++;
		

	}
	
	public void run() {
		
		System.out.println("Hello i am Client:" + this.clientnum);
		
		
//		//this allows the Server to have a conversation with the client
//		try {
//			
//	//		PrintWriter out = new PrintWriter(socket.getOutputStream(),true);
////			out.print("Hello Client");
////			
////			//buffered reader is used to accept the input FROM the client
////			BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
////			//store the input to a string
////			String clientInput = input.readLine();
////			//output the clients input to the terminal
////			System.out.println(clientInput);
////			
//
//			
//			//close the connections
////			input.close();
////			out.close();
//			socket.close();
//	
//		
//		}
//		catch(Exception e) {
//			System.out.println(e.toString());
//		}
		
		}
	 	
	
}

public class MultiTServer {
	public static void main(String[] args) {
		
		try {
			ServerSocket serversocket = new ServerSocket(5002);
			System.out.println("Waiting for clients.....");
			
			//allow server to accept multiple clients
			boolean stop = false;
			while(!stop) {
				
				Socket clientSocket = serversocket.accept();
				
				ClientThread clientThread = new ClientThread(clientSocket);
				clientThread.start();
				

			}
			
			serversocket.close();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
	}//end main

}//end class
