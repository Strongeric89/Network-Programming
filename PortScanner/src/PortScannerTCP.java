import java.io.IOException;
import java.net.*;

public class PortScannerTCP {
	public static void main(String[] args) {
		
		for(int port = 1; port<65536;port++) {
			try {
			ServerSocket socket = new ServerSocket(port);
			//System.out.println("port " + port + " is closed"+ "");
			}catch(IOException ioe) {
				System.out.println("port " + port + " is open");
			}
		}
		
	}
}
