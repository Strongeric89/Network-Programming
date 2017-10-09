import java.net.*;
import java.io.*;
import java.util.Scanner;
public class Client {
	
	public static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		try {
			//InetAddress serveraddress = InetAddress.getByName("localhost");
			Socket socket = new Socket("127.0.0.1", 9090);
			
			DataInputStream in = new DataInputStream(socket.getInputStream());
			DataOutputStream out = new DataOutputStream(socket.getOutputStream());
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String msgin="";
			String msgout="";
			
			while(!msgin.equals("0")) {
				msgout = br.readLine();
				out.writeUTF(msgout);
				msgin = in.readUTF();
				System.out.println("SERVER: " + msgin);
				
				
			}
			System.out.println("you entered 0.Client is closing connection");
			
			socket.close();
			
		}
		catch(Exception e) {
			System.out.println(e.toString());
		}
		
	}
	
	
	
	

}