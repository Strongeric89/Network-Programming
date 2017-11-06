import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*; 
import java.net.*; 
import javax.swing.*;
import java.awt.*;

class ClientThread extends Thread {
	private DatagramSocket socket = null;
	public static int num = 1;
	public int clientnum = 0;
	
	public ClientThread (DatagramSocket socket) {
		this.socket = socket;
		clientnum = num;
		
		this.num ++;
		

	}
	
	public void run() {
		
		System.out.println("Hello i am Client:" + this.clientnum);
	}
}

class UDPServer extends JFrame implements ActionListener {  
	
	public static int numberOfClients = 0;
	public static DatagramSocket socket = null;
	public static byte[] receiveData = new byte[1024];             
    public static byte[] sendData = new byte[1024];
    public static InetAddress clientIpAddress = null;
    public static int clientPort = 0;
    public static String stringData = null;
	
	JButton b1;
    JTextField t1;
    JLabel l1;
    ServerSocket server = null;
    Socket connection; 
    ObjectOutputStream out;
     public UDPServer(){
        super( "Server" ); 
	     Container container = getContentPane();  
	     container.setLayout( new FlowLayout() );
	     b1 = new JButton("Send to Client");
	     t1 = new JTextField(30);
	     l1 = new JLabel();
	     container.add(b1);
	     container.add(t1);
	     container.add(l1);
	     l1.setText("" + numberOfClients);
		 setSize( 400, 300 );
		 setVisible( true );
        b1.addActionListener(this); 
        
        try
        {
            socket = new DatagramSocket(9090);
            int count = 1;
            while(true)
            {
                DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
                socket.receive(receivePacket);
                String sentence = new String(receivePacket.getData());
                System.out.println("RECEIVED " + count +" " +sentence);
                stringData = "hello client " + count +  " i am eric the UDPServer!";
                System.out.println(stringData);
                sendData = stringData.getBytes();
                clientIpAddress = receivePacket.getAddress();
                clientPort = receivePacket.getPort();
                count ++;
             
            }
        }       
        catch(Exception e)
        {
           System.out.println(e.toString());     
        }
     }
        
        public void actionPerformed(ActionEvent e) {
            try {
            	numberOfClients ++;
            	 l1.setText("" + numberOfClients);
   		     String message  = t1.getText();
   		     System.out.println(message);
   		     
   			 sendData = message.getBytes();
   			 DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, clientIpAddress, clientPort);
   			 socket.send(sendPacket);
   		     
   			 System.out.println("Data send to client");
   			 t1.setText("");
   			}
   		 catch (Exception ex) {
   		 System.err.println(ex);} 
   		}
        
	
    public static void main(String args[]) throws Exception       
    {   
    		UDPServer application = new UDPServer();
		 application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
                
    }

	
} 