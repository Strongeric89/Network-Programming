
import java.net.*;
import java.io.*;
import java.util.Scanner;

class WritingThread extends Thread{
	private Socket connection;
	
	public WritingThread(Socket connection) {
		this.connection = connection;
	}
	
	public void run() {
		try {
			ObjectOutputStream out = new ObjectOutputStream( connection.getOutputStream());
			String message;
			Scanner s = new Scanner(System.in);
			while(true) {
				System.out.println("Server....");
				message = s.nextLine();
				out.writeObject(message);
			}
			
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}


class ReadingThread extends Thread{
	private Socket connection;
	
	public ReadingThread(Socket connection) {
		this.connection = connection;
	}
	
	public void run() {
		try {
			ObjectInputStream in = new ObjectInputStream( connection.getInputStream());
			String message;
			
			while(true) {
				message = (String) in.readObject();
				System.out.println("Server...." + message);
			
				
			}
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}

public class Server {
	
	public static void main(String [] args) {
		ServerSocket server = null;
		try
        {
        		
            server = new ServerSocket(5000,10);
            System.out.println("server is running on port 5000");
         
               
        }
		catch(Exception e) {
			System.out.println(e);
		}
		
		try {
			System.out.println("waiting for clients....");
			Socket client = server.accept();
			Thread r = new ReadingThread(client);
			Thread w = new WritingThread(client);
			
			w.start();
			r.start();
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
			
			
		
			
	}//end main

}//end server class
