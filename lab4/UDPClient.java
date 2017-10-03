import java.net.*;

public class UDPClient{
  public static void main(String [] args){

    try{

    	//STEP 1: set up socket
    	DatagramSocket socket = new DatagramSocket();
    	InetAddress ip = InetAddress.getByName("time.nist.gov"); // get the ip address of the time.nist.go server
    	int port = 13;

    	//STEP 2: stream in or out
    	byte[] data = "Hello".getBytes();  //ping message for the server
    	DatagramPacket packet = new DatagramPacket(data,data.length,ip,port); // packet for the time.nis.gov server

    	System.out.println("Connecting to Server: " + ip + " on port " + port);
    	//STEP 3: send and recieve
    	socket.send(packet); // send the packet

    	socket.setSoTimeout(6000); // timeout

    	packet.setData(new byte[100]); //set the data to raw bytes

    	socket.receive(packet); //recieve the packet

    	System.out.println(new String(packet.getData())); //turn back into string

    	socket.close();

      }
      catch(Exception ex){
        System.err.println(ex);
      }




  }//end main

}//end class
