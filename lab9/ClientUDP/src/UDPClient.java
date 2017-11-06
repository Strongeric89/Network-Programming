import java.io.*; 
import java.net.*; 
import javax.swing.*;
import java.awt.*;

public class UDPClient extends JFrame 
{    
	public static String stringReceiveData = "";
	 public UDPClient (){
	     super( "Client" ); 
	     JLabel label = new JLabel("FROM SERVER: " + stringReceiveData);
	     Container container = getContentPane();  
	     container.setLayout( new FlowLayout() );
	     container.add(label);
	     setSize( 400, 300 );
	     setVisible( true );	
	     
	     try
	        {
	            DatagramSocket clientSocket = new DatagramSocket(0);
	            //DatagramSocket clientSocket = new DatagramSocket();
	            byte[] sendData = new byte[1024];   //store outgoing data.    
	            byte[] receiveData = new byte[1024];  //store incoming data    
	            //Amount of data = 65535 - 20 (IP Header) - 8 (UDP Header) = 65508 
	            
	            InetAddress serverAddress = InetAddress.getByName("localhost");
	            
	            String stringSendData = "Hello Server!";
	            sendData = stringSendData.getBytes();
	            DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, serverAddress, 9090);
	            clientSocket.send(sendPacket);
	            DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
	            clientSocket.receive(receivePacket);
	            receiveData = receivePacket.getData();
	            String stringReceiveData = new String(receiveData);
	            System.out.println("FROM SERVER: " + stringReceiveData);
	            label.setText(stringReceiveData);
	           
	            
	            clientSocket.close();
	        }
	        catch(Exception e)
	        {
	            System.out.println(e.toString());
	        }
	 }
	     
	     
	
    public static void main(String args[])    
    {      
    	 UDPClient application = new UDPClient();
		 application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
        
    } 
} 