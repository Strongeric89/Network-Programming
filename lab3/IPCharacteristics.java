import java.net.*;

public class IPCharacteristics{
  public static void main(String [] url){

    try{
      InetAddress address = InetAddress.getByName(url[0]);

      System.out.println("Address is Local:" + address.isSiteLocalAddress());
      System.out.println("Address is Loopback:" + address.isLoopbackAddress());
      System.out.println("Address is Multicast:" + address.isMulticastAddress());

      if(!address.isSiteLocalAddress() && !address.isLoopbackAddress() && !address.isMulticastAddress()){
        System.out.println("Address is unicast:" + address);
      }


    }
    catch(Exception ex){
      System.out.println("Could not get Address " + url[0]);
    }




  }//end main
}//endclass
