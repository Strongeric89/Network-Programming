import java.net.*;
import java.io.*;
import java.util.Scanner;

class WritingThreadC extends Thread{
	private Socket connection;
	
	public WritingThreadC(Socket connection) {
		this.connection = connection;
	}
	
	public void run() {
		try {
			ObjectOutputStream out = new ObjectOutputStream( connection.getOutputStream());
			String message;
			Scanner s = new Scanner(System.in);
			while(true) {
				System.out.println("Client....");
				message = s.nextLine();
				out.writeObject(message);
			}
			
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}


class ReadingThreadC extends Thread{
	private Socket connection;
	
	public ReadingThreadC(Socket connection) {
		this.connection = connection;
	}
	
	public void run() {
		try {
			ObjectInputStream in = new ObjectInputStream( connection.getInputStream());
			String message;
			
			while(true) {
				message = (String) in.readObject();
				System.out.println("Client...." + message);
			
				
			}
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
public class Client{
	public static void main(String[] args) {
		Socket client = null;
		try {
			client = new Socket("localhost", 5000);
			System.out.println("client is connected to server");
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		try {
			Thread r = new ReadingThreadC(client);
			Thread w = new WritingThreadC(client);
			
			w.start();
			r.start();
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}
}
