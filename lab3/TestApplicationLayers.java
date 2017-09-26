//2. Test TCP/IP application layer protocols for www.dit.ie?
import java.net.*;

public class TestApplicationLayers{
  public static void main(String [] args){

    try{
      URL u = new URL(args[0]);

      System.out.println(args[0] + " supports " + u.getProtocol());
    }
    catch(Exception ex){
      System.out.println(args[0]  + " does not support ");
    }




  }//emd main
}//endclass
