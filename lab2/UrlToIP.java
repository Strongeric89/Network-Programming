/*
The following program converts a command line argument URL into an IP
*/

import java.net.*;

public class UrlToIP{
  public static void main(String [] args){

    try{
      InetAddress address = InetAddress.getByName(args[0]);
      System.out.println(address);
    }//end try
    catch(Exception ex){
      System.out.println("IP address of " + args[0] + " could not be found");
    }
  }///end main

}//end class
