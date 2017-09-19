/*
the following program will Find the IP of local Machine.
Lab 2 - Q2

*/
import java.net.*;

public class LocalIP{
  public static void main(String [] args){
    try{
      InetAddress address = InetAddress.getLocalHost();
      System.out.println("The Local Address is: " + address);
    }
    catch(Exception ex){
      System.out.println("The Local address could not be found");
    }

  }//end main

}//end class
