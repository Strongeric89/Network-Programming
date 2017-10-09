
import java.net.*;
import java.io.*;

public class Server {
	
	public static void main(String [] args) {
		
		try {
			
			ServerSocket serverSocket = new ServerSocket(9090);
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
				
				
				if(msgin.equals("1")) {
					System.out.println("PART 1: (addition)");
					msgout = "enter number 1: ";
					out.writeUTF(msgout);
					
					msgin = in.readUTF();
					System.out.println("CLIENT: " + msgin);
					int num1 = Integer.parseInt(msgin);
					
					msgout = "enter number 2:";
					out.writeUTF(msgout);
					int num2 = Integer.parseInt(msgin);
					
					msgout = "" + (num1 + num2);
					out.writeUTF(msgout);
					
				}
				else if(msgin.equals("2")) {
					
					System.out.println("PART 3: (Square Root)");
					msgout = "enter a number : ";
					out.writeUTF(msgout);
					
					msgin = in.readUTF();
					System.out.println("CLIENT: " + msgin);
					double num1 = Double.parseDouble(msgin);
					num1 = Math.sqrt(num1);
					
					
					msgout = "" + num1;
					out.writeUTF(msgout);
					
					
				}
				else if(msgin.equals("3")) {
					
					System.out.println("PART 3: (Power)");
					msgout = "enter number 1: ";
					out.writeUTF(msgout);
					
					msgin = in.readUTF();
					System.out.println("CLIENT: " + msgin);
					double num1 = Double.parseDouble(msgin);
					
					msgout = "enter number 2: ";
					out.writeUTF(msgout);
					double num2 = Double.parseDouble(msgin);
					
					msgout = "" + (Math.pow(num1, num2));
					out.writeUTF(msgout);
					
					
				}
				
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
