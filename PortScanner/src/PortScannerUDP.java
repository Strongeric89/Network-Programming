import java.io.IOException;
import java.net.*;
public class PortScannerUDP {
		public static void main(String[] args) {
			
			for(int port = 1;port<=65365;port++) {
				try {
					DatagramSocket socket = new DatagramSocket(port);
					
				}catch(IOException ioe) {
					System.out.println("port " + port + " is open");
				}
				
			}
		}
}
