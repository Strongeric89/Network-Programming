/*
The following program will Find the given IP is IPv4 or IPv6.

*/

import java.net.*;

public class Ipv4ORIpv6{
  public static void main(String [] args){
    if(args[0].contains(".")){
      System.out.println("The IP " + args[0] + " is IPV4");
    }
    else if(args[0].contains(":")){
        System.out.println("The IP " + args[0] + " is IPV6");
    }//end else if

    else{
        System.out.println("The IP " + args[0] + " is not a valid IPv4 or IPv6 address");
    }
  }//end main
}//end class
