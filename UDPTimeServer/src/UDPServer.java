import java.io.IOException;
import java.net.*;
import java.util.Date;
public class UDPServer {
	public static void main(String[] args) {
		try {
			DatagramSocket server = new DatagramSocket(5001);
			byte data[] = new byte[1024];
			DatagramPacket receive = new DatagramPacket(data, data.length);
			DatagramPacket send = new DatagramPacket(data, data.length);
			
			Date now = new Date();
			
			byte t = (byte)now.getTime();
			
			try {
				while(true)
				server.send(send);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (SocketException e) {
			
			e.printStackTrace();
		}
		
	}
}
